# Bench suite: suite.txt

## Melee bench: F01

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 272 over 6 battles (45.3 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 85.2 | 49 / 210 | 2.33 | 17.2% | 31189 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.0% | 146 |
| hadur117.Hadur 3.20 | 2.0 | 17.2% | 49 |
| sgp.JollyNinja 3.53 | 3.3 | 11.6% | 11 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 11.1% | 2 |
| mz.MicroGodMelee 1 | 5.0 | 10.0% | 1 |
| lorneswork.Predator 1.0 | 5.7 | 9.5% | 2 |
| adt.Ar2 1.0 | 7.3 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.7% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.5 | 84.4 | 7 / 35 | 4996 |
| 2 | 2 | 67.7 | 87.9 | 11 / 35 | 5021 |
| 3 | 2 | 66.6 | 83.5 | 5 / 35 | 5084 |
| 4 | 2 | 68.3 | 87.0 | 9 / 35 | 5642 |
| 5 | 2 | 66.9 | 84.1 | 7 / 35 | 5357 |
| 6 | 2 | 66.9 | 84.4 | 10 / 35 | 5089 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 117 | 7% |
| sgp.JollyNinja 3.53 | 17 | 76% |
| mz.MicroGodMelee 1 | 13 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 100% |
| lorneswork.Predator 1.0 | 5 | 80% |
| adt.Ar2 1.0 | 4 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 1140. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 118 | 72% | 130 |
| sgp.JollyNinja 3.53 | 16 | 10% | 26 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 7% | 17 |
| mz.MicroGodMelee 1 | 8 | 5% | 20 |
| lorneswork.Predator 1.0 | 7 | 4% | 10 |
| adt.Ar2 1.0 | 2 | 1% | 5 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 137388 melee ticks, 83521 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 55 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 44083 sent, 39223 reached their opponent, 7798 virtual hits (19.9% of those reached).

## Melee bench: F02

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 353 over 6 battles (58.8 per battle, most in one battle 147). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 85.1 | 100 / 210 | 2.34 | 18.5% | 30782 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 18.5% | 100 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 14.0% | 43 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.2% | 29 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.5 | 10.8% | 14 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.7% | 3 |
| Noran.BitchingElk 0.054 | 6.3 | 8.2% | 13 |
| fnc.bandit.Bandit 5.2.0 | 7.2 | 7.8% | 0 |
| sch.Simone 0.3d | 7.3 | 7.5% | 7 |
| stelo.PatternRobot 1.0 | 9.0 | 5.4% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 83.8 | 15 / 35 | 5080 |
| 2 | 1 | 68.1 | 82.5 | 20 / 35 | 5037 |
| 3 | 1 | 69.1 | 87.6 | 18 / 35 | 5166 |
| 4 | 1 | 68.7 | 87.0 | 18 / 35 | 4952 |
| 5 | 1 | 67.4 | 83.8 | 15 / 35 | 4978 |
| 6 | 1 | 68.5 | 85.7 | 14 / 35 | 5569 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 41 | 66% |
| pulsar.PulsarMax 0.8.9 | 40 | 53% |
| com.cohesiva.robocode.ManOwaR 1.0 | 22 | 64% |
| Noran.BitchingElk 0.054 | 19 | 58% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 100% |
| sch.Simone 0.3d | 9 | 78% |
| fnc.bandit.Bandit 5.2.0 | 5 | 100% |
| stelo.PatternRobot 1.0 | 3 | 67% |

Hadur died in 114 of 210 rounds, at a mean tick of 995. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 42 | 37% | 66 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 23 | 20% | 44 |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 11% | 33 |
| Noran.BitchingElk 0.054 | 9 | 8% | 20 |
| sch.Simone 0.3d | 7 | 6% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 6% | 14 |
| stelo.PatternRobot 1.0 | 6 | 5% | 5 |
| fnc.bandit.Bandit 5.2.0 | 4 | 4% | 8 |
| fullsail.SweetTea 1.1 | 2 | 2% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 165210 melee ticks, 45577 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 87 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 87 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 3.

Targeting waves (202 rounds): 58190 sent, 53428 reached their opponent, 9082 virtual hits (17.0% of those reached).

## Melee bench: F03

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 227 over 6 battles (37.8 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 91.5 | 164 / 210 | 1.76 | 20.5% | 37655 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 20.5% | 164 |
| radnor.DoctorBob 1.42 | 2.2 | 14.2% | 25 |
| kawigi.nano.Lib 1.0 | 3.2 | 13.0% | 10 |
| vuen.Cake 2.51 | 3.7 | 12.2% | 9 |
| urdos.URDOS 1.3 | 5.0 | 9.0% | 1 |
| adt.Ar1 2.1 | 6.2 | 7.9% | 1 |
| oa.weak.FlyMk1 0.1 | 7.2 | 7.0% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.8 | 5.9% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 92.4 | 28 / 35 | 6071 |
| 2 | 1 | 71.1 | 92.7 | 29 / 35 | 6114 |
| 3 | 1 | 71.2 | 92.1 | 29 / 35 | 6567 |
| 4 | 1 | 68.7 | 85.7 | 22 / 35 | 5670 |
| 5 | 1 | 70.9 | 91.1 | 27 / 35 | 6543 |
| 6 | 1 | 72.0 | 95.2 | 29 / 35 | 6690 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 65 | 92% |
| radnor.DoctorBob 1.42 | 57 | 98% |
| kawigi.nano.Lib 1.0 | 40 | 95% |
| urdos.URDOS 1.3 | 5 | 100% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| adt.Ar1 2.1 | 2 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 14 | 30% | 67 |
| kawigi.nano.Lib 1.0 | 12 | 26% | 50 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 15% | 9 |
| vuen.Cake 2.51 | 6 | 13% | 56 |
| urdos.URDOS 1.3 | 3 | 6% | 10 |
| adt.Ar1 2.1 | 2 | 4% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 3 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 124583 melee ticks, 38499 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 67 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 67 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 38145 sent, 33575 reached their opponent, 8631 virtual hits (25.7% of those reached).

## Melee bench: F04

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 422 over 6 battles (70.3 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 82.8 | 19 / 210 | 2.55 | 16.9% | 32882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.8% | 166 |
| hadur117.Hadur 3.20 | 2.0 | 16.9% | 19 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.4% | 13 |
| TNT.TNT 0.99.1 | 4.0 | 11.2% | 11 |
| josago.Jorgito 0.16 | 5.0 | 9.3% | 0 |
| css.Delitioner 0.11 | 6.5 | 6.8% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 6.3% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.5% | 0 |
| spin.Bugstard 0.012b | 9.0 | 4.3% | 1 |
| sp.Nanos.Ember 1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 78.4 | 3 / 35 | 5071 |
| 2 | 2 | 67.4 | 83.5 | 5 / 35 | 5336 |
| 3 | 2 | 67.2 | 84.1 | 1 / 35 | 5447 |
| 4 | 2 | 67.5 | 82.9 | 3 / 35 | 5576 |
| 5 | 2 | 67.6 | 83.2 | 4 / 35 | 5586 |
| 6 | 2 | 67.7 | 84.4 | 3 / 35 | 5866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 114 | 8% |
| apc.LeeroyJenkins2 1.0 | 15 | 53% |
| TNT.TNT 0.99.1 | 5 | 20% |
| josago.Jorgito 0.16 | 1 | 100% |
| spin.Bugstard 0.012b | 1 | 0% |

Hadur died in 194 of 210 rounds, at a mean tick of 1227. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 120 | 62% | 132 |
| apc.LeeroyJenkins2 1.0 | 32 | 16% | 38 |
| TNT.TNT 0.99.1 | 18 | 9% | 19 |
| josago.Jorgito 0.16 | 13 | 7% | 14 |
| css.Delitioner 0.11 | 5 | 3% | 5 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
| spin.Bugstard 0.012b | 1 | 1% | 0 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 191621 melee ticks, 57887 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 58 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 59012 sent, 54127 reached their opponent, 8308 virtual hits (15.3% of those reached).

## Melee bench: F05

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 326 over 6 battles (54.3 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 75.4 | 28 / 210 | 3.21 | 14.6% | 22940 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.1% | 104 |
| justin.DemonicRage 3.4 | 1.8 | 17.0% | 56 |
| hadur117.Hadur 3.20 | 3.0 | 14.6% | 28 |
| wompi.Numbat 2.1 | 4.0 | 12.8% | 13 |
| ms.Ares 0.19 | 5.5 | 9.2% | 1 |
| axeBots.HataMoto 3.09 | 5.5 | 9.3% | 8 |
| supersample.SuperBoxBot 1.0 | 7.5 | 5.4% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.4% | 0 |
| GarmBox.Oranges 1.0 | 9.2 | 4.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.2 | 74.3 | 5 / 35 | 3983 |
| 2 | 3 | 64.5 | 79.0 | 5 / 35 | 3851 |
| 3 | 3 | 61.7 | 70.2 | 5 / 35 | 3731 |
| 4 | 3 | 61.5 | 71.7 | 2 / 35 | 3642 |
| 5 | 3 | 64.3 | 79.0 | 4 / 35 | 3886 |
| 6 | 3 | 64.1 | 78.1 | 7 / 35 | 3847 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 32 | 38% |
| cb.fire.Firestarter 2.0f | 29 | 3% |
| wompi.Numbat 2.1 | 14 | 86% |
| ms.Ares 0.19 | 2 | 100% |
| axeBots.HataMoto 3.09 | 2 | 50% |

Hadur died in 184 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 73 | 40% | 77 |
| justin.DemonicRage 3.4 | 54 | 29% | 65 |
| wompi.Numbat 2.1 | 27 | 15% | 35 |
| ms.Ares 0.19 | 11 | 6% | 14 |
| axeBots.HataMoto 3.09 | 9 | 5% | 10 |
| GarmBox.Oranges 1.0 | 3 | 2% | 3 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 155004 melee ticks, 27524 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 55 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 47858 sent, 42743 reached their opponent, 7158 virtual hits (16.7% of those reached).

## Melee bench: F06

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 344 over 6 battles (57.3 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.9 | 131 / 210 | 1.82 | 19.9% | 32919 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 19.9% | 131 |
| jekl.StoneGhost 0.7 | 2.0 | 14.7% | 21 |
| origin.SleepSiphon 1.7b | 3.2 | 13.2% | 29 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 11.5% | 18 |
| mld.Wisdom 1.0 | 4.7 | 10.8% | 2 |
| gg.Wolverine 2.0 | 6.0 | 8.2% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 6.9% | 9 |
| DBall.NUKE 0.1 | 8.0 | 6.2% | 1 |
| spinnercat.Omen 1.0 | 8.8 | 5.7% | 0 |
| sample.Fire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 89.2 | 23 / 35 | 5563 |
| 2 | 1 | 69.7 | 89.2 | 18 / 35 | 5459 |
| 3 | 1 | 69.6 | 90.5 | 21 / 35 | 5127 |
| 4 | 1 | 70.3 | 90.8 | 22 / 35 | 5500 |
| 5 | 1 | 70.8 | 91.7 | 24 / 35 | 5577 |
| 6 | 1 | 71.2 | 94.0 | 23 / 35 | 5693 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 63 | 90% |
| origin.SleepSiphon 1.7b | 55 | 78% |
| pe.minimelee.SandboxMiniMelee 1.1 | 27 | 67% |
| ers.nano.hawk.HawkLA 3.0m | 8 | 38% |
| gg.Wolverine 2.0 | 6 | 83% |
| mld.Wisdom 1.0 | 3 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 29 | 35% | 74 |
| jekl.StoneGhost 0.7 | 22 | 27% | 62 |
| pe.minimelee.SandboxMiniMelee 1.1 | 14 | 17% | 37 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 7% | 10 |
| mld.Wisdom 1.0 | 5 | 6% | 18 |
| gg.Wolverine 2.0 | 3 | 4% | 6 |
| spinnercat.Omen 1.0 | 0 | 0% | 2 |
| DBall.NUKE 0.1 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 147792 melee ticks, 45093 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 79 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 45596 sent, 40911 reached their opponent, 8927 virtual hits (21.8% of those reached).

## Melee bench: F07

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 736 over 6 battles (122.7 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 91.1 | 109 / 210 | 1.80 | 20.3% | 38908 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 20.3% | 109 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.1% | 55 |
| rtk.Tachikoma 1.0 | 2.8 | 15.9% | 28 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.2% | 4 |
| franzor.Lizt 1.3.1 | 4.8 | 10.9% | 14 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.4% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.0 | 2.3% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 91.4 | 17 / 35 | 6456 |
| 2 | 1 | 72.6 | 93.3 | 18 / 35 | 6615 |
| 3 | 1 | 71.2 | 89.2 | 17 / 35 | 6341 |
| 4 | 1 | 70.9 | 88.3 | 16 / 35 | 6129 |
| 5 | 1 | 72.1 | 92.1 | 20 / 35 | 6526 |
| 6 | 1 | 72.6 | 92.4 | 21 / 35 | 6841 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 75 | 77% |
| rsalesc.melee.Monk 0.3.6c | 55 | 27% |
| franzor.Lizt 1.3.1 | 26 | 58% |
| oog.melee.CapuletDroid 1.1 | 22 | 86% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 1383. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 50 | 47% | 79 |
| rtk.Tachikoma 1.0 | 28 | 26% | 85 |
| franzor.Lizt 1.3.1 | 12 | 11% | 1 |
| oog.melee.CapuletDroid 1.1 | 7 | 7% | 35 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 7 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 184721 melee ticks, 90991 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 31 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 55980 sent, 51187 reached their opponent, 10709 virtual hits (20.9% of those reached).

## Melee bench: F08

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 430 over 6 battles (71.7 per battle, most in one battle 153). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 88.7 | 121 / 210 | 2.01 | 19.0% | 29947 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 19.0% | 121 |
| tm.Yuugao 1.0 | 2.3 | 13.0% | 31 |
| shrub.Vapour v159 | 3.0 | 12.1% | 22 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 11.1% | 17 |
| com.spp.robocode.MostlyHarmless 010 | 4.7 | 10.4% | 12 |
| m3thos.Eva00 1.1 | 6.5 | 8.6% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.1% | 6 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.8% | 2 |
| SHAM.WOW 1.4 | 9.3 | 5.5% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 87.0 | 17 / 35 | 4961 |
| 2 | 1 | 68.1 | 87.6 | 21 / 35 | 4598 |
| 3 | 1 | 71.1 | 94.9 | 28 / 35 | 5326 |
| 4 | 1 | 68.1 | 87.3 | 18 / 35 | 5131 |
| 5 | 1 | 66.9 | 85.4 | 17 / 35 | 4674 |
| 6 | 1 | 69.1 | 90.2 | 20 / 35 | 5257 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 40 | 65% |
| tm.Yuugao 1.0 | 38 | 68% |
| com.spp.robocode.MostlyHarmless 010 | 34 | 85% |
| Krabb.sliNk.Garm 0.9u | 25 | 80% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 75% |
| m3thos.Eva00 1.1 | 6 | 83% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 28 | 29% | 52 |
| shrub.Vapour v159 | 22 | 23% | 52 |
| Krabb.sliNk.Garm 0.9u | 14 | 15% | 37 |
| com.spp.robocode.MostlyHarmless 010 | 13 | 14% | 33 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 6% | 18 |
| m3thos.Eva00 1.1 | 5 | 5% | 8 |
| zyx.nano.BacillusComma 1.0 | 2 | 2% | 4 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 2 |
| SHAM.WOW 1.4 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 148515 melee ticks, 46171 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 46 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 47968 sent, 43147 reached their opponent, 7809 virtual hits (18.1% of those reached).

## Melee bench: F09

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 544 over 6 battles (90.7 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 74.0 | 39 / 210 | 3.34 | 14.6% | 20861 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.2% | 94 |
| kc.micro.Figment 1.0 | 2.3 | 15.0% | 39 |
| hadur117.Hadur 3.20 | 2.7 | 14.6% | 39 |
| yagami.Tidus 0.11 | 4.3 | 11.1% | 3 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.7% | 20 |
| mc2.enemy.Original 0.9 | 6.0 | 9.1% | 12 |
| dft.Calliope 5.6 | 7.0 | 7.6% | 3 |
| step.nanoPri 1.0 | 8.0 | 5.7% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.5% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.3 | 74.6 | 8 / 35 | 3312 |
| 2 | 3 | 59.8 | 67.6 | 3 / 35 | 3199 |
| 3 | 3 | 63.6 | 75.9 | 11 / 35 | 3523 |
| 4 | 2 | 63.5 | 77.1 | 5 / 35 | 3703 |
| 5 | 2 | 63.9 | 76.2 | 8 / 35 | 3802 |
| 6 | 3 | 61.2 | 72.4 | 4 / 35 | 3322 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 42 | 19% |
| kc.micro.Figment 1.0 | 30 | 70% |
| pedersen.Grishnakh 1.0 | 8 | 38% |
| yagami.Tidus 0.11 | 8 | 63% |
| mc2.enemy.Original 0.9 | 4 | 0% |
| dft.Calliope 5.6 | 2 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 66 | 38% | 76 |
| kc.micro.Figment 1.0 | 35 | 20% | 53 |
| yagami.Tidus 0.11 | 23 | 13% | 29 |
| mc2.enemy.Original 0.9 | 21 | 12% | 22 |
| pedersen.Grishnakh 1.0 | 12 | 7% | 13 |
| robar.nano.Assertive_Melee 0.2 | 6 | 3% | 6 |
| dft.Calliope 5.6 | 4 | 2% | 6 |
| step.nanoPri 1.0 | 4 | 2% | 5 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 153074 melee ticks, 29860 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 40 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 3.

Targeting waves (209 rounds): 49746 sent, 44975 reached their opponent, 6551 virtual hits (14.6% of those reached).

## Melee bench: F10

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 296 over 6 battles (49.3 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 94.7 | 155 / 210 | 1.48 | 20.9% | 35995 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 20.9% | 155 |
| DTF.Kludgy 1.2b | 2.3 | 14.0% | 27 |
| ne.Chimera 1.2 | 2.8 | 12.9% | 14 |
| ejb.Polaris 1.0.1 | 3.8 | 12.3% | 9 |
| vStar.RAFzilla 2.15 | 5.2 | 10.1% | 2 |
| tvv.micro.Antares 1.1.1 | 5.8 | 9.7% | 1 |
| kurios.DOSexe .9b | 7.8 | 5.5% | 2 |
| sam.Samspin 1.0 | 8.0 | 5.4% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.8 | 4.8% | 0 |
| donjezza.Muncho 1.0 | 9.3 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 94.0 | 24 / 35 | 5975 |
| 2 | 1 | 71.0 | 93.7 | 21 / 35 | 6110 |
| 3 | 1 | 71.4 | 95.6 | 29 / 35 | 5653 |
| 4 | 1 | 70.7 | 92.1 | 27 / 35 | 5726 |
| 5 | 1 | 72.2 | 96.2 | 26 / 35 | 6278 |
| 6 | 1 | 72.2 | 96.8 | 28 / 35 | 6253 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 66 | 74% |
| ejb.Polaris 1.0.1 | 42 | 83% |
| ne.Chimera 1.2 | 41 | 78% |
| tvv.micro.Antares 1.1.1 | 17 | 94% |
| vStar.RAFzilla 2.15 | 15 | 93% |
| kurios.DOSexe .9b | 6 | 67% |
| donjezza.Muncho 1.0 | 3 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 24 | 43% | 71 |
| ne.Chimera 1.2 | 14 | 25% | 38 |
| ejb.Polaris 1.0.1 | 10 | 18% | 52 |
| vStar.RAFzilla 2.15 | 2 | 4% | 16 |
| tvv.micro.Antares 1.1.1 | 2 | 4% | 12 |
| kurios.DOSexe .9b | 2 | 4% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 3 |
| donjezza.Muncho 1.0 | 0 | 0% | 4 |
| sam.Samspin 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 143013 melee ticks, 61093 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 64 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 46085 sent, 41453 reached their opponent, 7886 virtual hits (19.0% of those reached).

## Melee bench: F11

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 361 over 6 battles (60.2 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 80.0 | 70 / 210 | 2.80 | 16.2% | 23247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.5 | 16.2% | 70 |
| rz.Aleph 0.34 | 1.5 | 15.8% | 67 |
| cx.mini.Nimrod 0.55 | 3.3 | 12.3% | 13 |
| djc.DynaBot 0.1.1 | 4.3 | 10.6% | 14 |
| rdt199.Warlord 0.73 | 5.2 | 9.7% | 18 |
| br2.MobyDickBot 1.6 | 5.3 | 9.7% | 19 |
| uji.YellohFellah 1.0 | 6.8 | 8.3% | 11 |
| KiraNL.Chupacabra 0.4 | 8.0 | 6.9% | 0 |
| stelo.MirrorNano 1.3 | 9.3 | 5.3% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 81.3 | 10 / 35 | 4013 |
| 2 | 2 | 64.7 | 80.0 | 12 / 35 | 3880 |
| 3 | 2 | 62.4 | 73.3 | 9 / 35 | 3647 |
| 4 | 1 | 64.7 | 82.9 | 12 / 35 | 3641 |
| 5 | 1 | 65.5 | 81.9 | 16 / 35 | 4018 |
| 6 | 2 | 64.8 | 80.6 | 11 / 35 | 4048 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 41 | 44% |
| rdt199.Warlord 0.73 | 22 | 73% |
| br2.MobyDickBot 1.6 | 17 | 59% |
| djc.DynaBot 0.1.1 | 16 | 69% |
| uji.YellohFellah 1.0 | 10 | 60% |
| cx.mini.Nimrod 0.55 | 9 | 89% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 55 | 38% | 78 |
| rdt199.Warlord 0.73 | 20 | 14% | 33 |
| cx.mini.Nimrod 0.55 | 20 | 14% | 28 |
| br2.MobyDickBot 1.6 | 15 | 10% | 24 |
| uji.YellohFellah 1.0 | 13 | 9% | 17 |
| djc.DynaBot 0.1.1 | 12 | 8% | 18 |
| stelo.MirrorNano 1.3 | 6 | 4% | 7 |
| KiraNL.Chupacabra 0.4 | 1 | 1% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 158197 melee ticks, 33772 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 58 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 51764 sent, 46771 reached their opponent, 6388 virtual hits (13.7% of those reached).

## Melee bench: F12

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 368 over 6 battles (61.3 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 85.5 | 118 / 210 | 2.30 | 17.9% | 24137 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 17.9% | 118 |
| bts.wiki.RipCurl 0.9b | 2.0 | 13.9% | 28 |
| nat.PallasHawk 1.0 | 3.3 | 12.4% | 30 |
| darkcanuck.Leon 1.01 | 3.8 | 12.2% | 15 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.4% | 15 |
| jrm.Test0 1.0 | 6.0 | 8.4% | 2 |
| cs.sheldor.Talon 1.1 | 7.5 | 7.1% | 0 |
| jp.Perpy 16.0 | 8.0 | 6.4% | 1 |
| stuff.Vlad 0.1 | 9.2 | 5.8% | 1 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 87.0 | 17 / 35 | 4052 |
| 2 | 1 | 69.2 | 91.7 | 24 / 35 | 4278 |
| 3 | 1 | 67.5 | 87.0 | 20 / 35 | 4089 |
| 4 | 1 | 65.7 | 80.6 | 17 / 35 | 3907 |
| 5 | 1 | 64.7 | 79.7 | 17 / 35 | 3593 |
| 6 | 1 | 68.2 | 87.0 | 23 / 35 | 4218 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 46 | 89% |
| bts.wiki.RipCurl 0.9b | 42 | 86% |
| nat.PallasHawk 1.0 | 33 | 55% |
| brainfade.melee.Genghis 0.36 | 16 | 50% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| jaybot.bots.Oddball 4.0 | 4 | 100% |
| jp.Perpy 16.0 | 3 | 67% |
| stuff.Vlad 0.1 | 3 | 100% |
| jrm.Test0 1.0 | 2 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 24 | 25% | 50 |
| nat.PallasHawk 1.0 | 19 | 20% | 43 |
| jrm.Test0 1.0 | 16 | 17% | 20 |
| brainfade.melee.Genghis 0.36 | 14 | 15% | 21 |
| darkcanuck.Leon 1.01 | 13 | 14% | 55 |
| jp.Perpy 16.0 | 4 | 4% | 7 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 8 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 4 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 131846 melee ticks, 38819 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 40 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 3.

Targeting waves (206 rounds): 44876 sent, 39945 reached their opponent, 6622 virtual hits (16.6% of those reached).

## Melee bench: F13

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 105 over 6 battles (17.5 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 80.1 | 40 / 210 | 2.79 | 15.4% | 24502 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.3 | 16.9% | 96 |
| ags.Glacier 0.2.11 | 2.3 | 16.1% | 42 |
| hadur117.Hadur 3.20 | 2.3 | 15.4% | 40 |
| gh.micro.Gruweltje 0.7 | 4.2 | 12.0% | 17 |
| shinh.Entangled 0.3 | 4.8 | 11.8% | 15 |
| apc.Colossus2 0.17 | 6.3 | 7.7% | 0 |
| stelo.Wang 1.0 | 6.7 | 6.6% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 5.0% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.7 | 81.0 | 4 / 35 | 3568 |
| 2 | 3 | 61.8 | 74.3 | 4 / 35 | 3841 |
| 3 | 2 | 64.7 | 80.0 | 10 / 35 | 4264 |
| 4 | 3 | 62.7 | 75.2 | 4 / 35 | 3927 |
| 5 | 1 | 66.1 | 84.8 | 12 / 35 | 4361 |
| 6 | 2 | 66.4 | 85.4 | 6 / 35 | 4541 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 47 | 19% |
| ags.Glacier 0.2.11 | 36 | 53% |
| shinh.Entangled 0.3 | 15 | 60% |
| gh.micro.Gruweltje 0.7 | 8 | 25% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 60 | 35% | 71 |
| ags.Glacier 0.2.11 | 53 | 31% | 69 |
| gh.micro.Gruweltje 0.7 | 28 | 16% | 31 |
| shinh.Entangled 0.3 | 17 | 10% | 25 |
| stelo.Wang 1.0 | 5 | 3% | 7 |
| maribo.FollowFire 1 | 5 | 3% | 5 |
| apc.Colossus2 0.17 | 2 | 1% | 2 |

Posture (Hadur's M records, 207 rounds): 148685 melee ticks, 38342 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 49 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 43244 sent, 38177 reached their opponent, 6203 virtual hits (16.2% of those reached).

## Melee bench: F14

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 182 over 6 battles (30.3 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 94.2 | 153 / 210 | 1.52 | 20.8% | 35469 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 20.8% | 153 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.1% | 20 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.6% | 26 |
| co.edu.usb.rc.LidisTron 1.0 | 4.3 | 9.6% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 5.2 | 9.3% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 8.9% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.2 | 8.1% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.8% | 3 |
| pa.Improved 1.0 | 9.0 | 6.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.4 | 25 / 35 | 5500 |
| 2 | 1 | 71.9 | 95.9 | 27 / 35 | 5844 |
| 3 | 1 | 72.2 | 95.2 | 28 / 35 | 6367 |
| 4 | 1 | 70.4 | 91.4 | 21 / 35 | 5862 |
| 5 | 1 | 71.8 | 96.8 | 28 / 35 | 5779 |
| 6 | 1 | 71.5 | 94.6 | 24 / 35 | 6117 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 81 | 90% |
| catcat20.shape.Theta 0.018 | 59 | 69% |
| sanyi.mikrobi.Roberto 1.0 | 18 | 94% |
| co.edu.usb.rc.LidisTron 1.0 | 12 | 83% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 71% |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 80% |
| pa.Improved 1.0 | 2 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 25 | 43% | 59 |
| simonton.micro.Sprout 1.1.3 | 19 | 33% | 89 |
| sanyi.mikrobi.Roberto 1.0 | 5 | 9% | 23 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 7% | 13 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 3% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 7 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 6 |
| pa.Improved 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 147486 melee ticks, 50386 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 47 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 45684 sent, 41150 reached their opponent, 9935 virtual hits (24.1% of those reached).

## Melee bench: F15

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 557 over 6 battles (92.8 per battle, most in one battle 148). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.3 | 100 / 210 | 2.41 | 18.1% | 29814 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 18.1% | 100 |
| kawigi.micro.Shiz 1.1 | 2.2 | 13.8% | 24 |
| emp.Yngwie 1.11 | 3.0 | 13.3% | 55 |
| mld.DustBunny 3.8 | 3.8 | 12.5% | 8 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.6% | 5 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.6% | 16 |
| Grystrion.TrackerWO 1.0 | 7.2 | 6.9% | 1 |
| lambdaxy.TBot 0.1 | 7.8 | 6.5% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.5% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 89.2 | 19 / 35 | 5497 |
| 2 | 1 | 66.6 | 81.3 | 12 / 35 | 4812 |
| 3 | 1 | 69.7 | 89.2 | 22 / 35 | 5380 |
| 4 | 1 | 66.1 | 81.0 | 14 / 35 | 4577 |
| 5 | 1 | 67.1 | 81.6 | 18 / 35 | 4716 |
| 6 | 1 | 66.9 | 83.8 | 15 / 35 | 4832 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 45 | 51% |
| kawigi.micro.Shiz 1.1 | 32 | 78% |
| mld.DustBunny 3.8 | 23 | 96% |
| kawigi.robot.Girl 1.2 | 17 | 65% |
| cb.nano.Insomnia 1.0 | 15 | 93% |
| divineomega.TrialBot 0.003 | 4 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 43 | 38% | 74 |
| mld.DustBunny 3.8 | 18 | 16% | 48 |
| kawigi.micro.Shiz 1.1 | 18 | 16% | 36 |
| cb.nano.Insomnia 1.0 | 11 | 10% | 14 |
| kawigi.robot.Girl 1.2 | 8 | 7% | 16 |
| lambdaxy.TBot 0.1 | 5 | 4% | 5 |
| Grystrion.TrackerWO 1.0 | 4 | 4% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 2% | 2 |
| divineomega.TrialBot 0.003 | 1 | 1% | 11 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 163482 melee ticks, 38971 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 41 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 53716 sent, 48977 reached their opponent, 8131 virtual hits (16.6% of those reached).

## Melee bench: F16

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 330 over 6 battles (55.0 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 83.3 | 81 / 210 | 2.50 | 18.1% | 31895 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.2 | 18.1% | 81 |
| gh.Griezel 0.5.2 | 1.8 | 16.3% | 58 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.9% | 11 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.3% | 39 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 9.1% | 3 |
| tvv.nano.Polaris 1.2 | 5.8 | 9.0% | 11 |
| stelo.IntrinsicVolatility 1.4 | 6.5 | 7.7% | 2 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.0% | 6 |
| asd.Cthulhu 1.3 | 9.0 | 4.8% | 0 |
| repositorio.NanoStep 1.0 | 9.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 84.8 | 13 / 35 | 5435 |
| 2 | 1 | 66.4 | 80.3 | 10 / 35 | 5077 |
| 3 | 2 | 65.7 | 77.8 | 8 / 35 | 4982 |
| 4 | 1 | 67.0 | 80.6 | 12 / 35 | 5195 |
| 5 | 1 | 68.6 | 85.7 | 15 / 35 | 5348 |
| 6 | 1 | 70.8 | 90.8 | 23 / 35 | 5858 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 74 | 57% |
| techdude.forest.FlamingForest 1.1 | 25 | 56% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 70% |
| divineomega.DivineBot 1.9.4.5 | 6 | 100% |
| tvv.nano.Polaris 1.2 | 5 | 20% |
| bvh.fnr.Fenrir 0.36l | 4 | 50% |
| stelo.IntrinsicVolatility 1.4 | 2 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 1101. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 49 | 37% | 93 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 24 | 18% | 32 |
| bvh.fnr.Fenrir 0.36l | 20 | 15% | 22 |
| techdude.forest.FlamingForest 1.1 | 16 | 12% | 30 |
| tvv.nano.Polaris 1.2 | 7 | 5% | 10 |
| divineomega.DivineBot 1.9.4.5 | 4 | 3% | 10 |
| stelo.IntrinsicVolatility 1.4 | 4 | 3% | 7 |
| asd.Cthulhu 1.3 | 4 | 3% | 4 |
| repositorio.NanoStep 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 178177 melee ticks, 60502 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 41 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 57601 sent, 52793 reached their opponent, 8847 virtual hits (16.8% of those reached).

## Melee bench: F17

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 391 over 6 battles (65.2 per battle, most in one battle 150). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.2 | 83 / 210 | 2.33 | 18.7% | 34713 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 18.7% | 83 |
| et.Predator 1.8 | 2.8 | 13.7% | 21 |
| cx.BlestPain 1.41 | 3.0 | 13.4% | 43 |
| oog.melee.Mercutio 1.0 | 3.2 | 13.2% | 48 |
| ahf.NanoAndrew .4 | 5.3 | 10.2% | 8 |
| nic.Nicator 2.4 | 6.2 | 8.8% | 6 |
| maribo.melee.BMV 0.1 | 6.5 | 8.4% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.0 | 6.1% | 0 |
| tex.Longbot 0.4 | 9.0 | 5.2% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.3 | 12 / 35 | 5750 |
| 2 | 1 | 68.0 | 82.2 | 15 / 35 | 5568 |
| 3 | 1 | 68.2 | 84.4 | 15 / 35 | 5486 |
| 4 | 1 | 70.2 | 87.9 | 18 / 35 | 6244 |
| 5 | 1 | 68.7 | 86.7 | 12 / 35 | 5600 |
| 6 | 1 | 68.6 | 82.5 | 11 / 35 | 6065 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cx.BlestPain 1.41 | 46 | 39% |
| oog.melee.Mercutio 1.0 | 42 | 48% |
| et.Predator 1.8 | 38 | 71% |
| ahf.NanoAndrew .4 | 15 | 93% |
| maribo.melee.BMV 0.1 | 3 | 67% |
| nic.Nicator 2.4 | 3 | 0% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 1127. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 45 | 35% | 67 |
| oog.melee.Mercutio 1.0 | 36 | 28% | 50 |
| et.Predator 1.8 | 23 | 18% | 49 |
| ahf.NanoAndrew .4 | 12 | 9% | 24 |
| nic.Nicator 2.4 | 5 | 4% | 8 |
| maribo.melee.BMV 0.1 | 4 | 3% | 8 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
| tex.Longbot 0.4 | 1 | 1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 170144 melee ticks, 59052 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 40 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 54021 sent, 49382 reached their opponent, 10468 virtual hits (21.2% of those reached).

## Melee bench: F18

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 673 over 6 battles (112.2 per battle, most in one battle 155). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.0 | 137 / 210 | 1.90 | 19.7% | 29785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 19.7% | 137 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.5% | 28 |
| agd.Mooserwirt2 2.7 | 3.3 | 11.9% | 14 |
| uji.DBH 1.1 | 3.7 | 11.6% | 17 |
| sigterm.Sigterm 1.0 | 5.7 | 8.8% | 8 |
| spinnercat.Robovirus 2.718 | 6.2 | 8.5% | 3 |
| ratosh.Nobo 0.21 | 6.5 | 8.0% | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.3% | 3 |
| stelo.WangRobot 1.0 | 9.3 | 5.6% | 0 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 91.7 | 25 / 35 | 4881 |
| 2 | 1 | 67.8 | 82.9 | 21 / 35 | 4951 |
| 3 | 1 | 69.5 | 92.4 | 22 / 35 | 4692 |
| 4 | 1 | 68.9 | 87.9 | 22 / 35 | 4760 |
| 5 | 1 | 70.4 | 92.4 | 25 / 35 | 5159 |
| 6 | 1 | 70.2 | 92.7 | 22 / 35 | 5342 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 54 | 72% |
| agd.Mooserwirt2 2.7 | 35 | 89% |
| uji.DBH 1.1 | 35 | 80% |
| sigterm.Sigterm 1.0 | 20 | 75% |
| spinnercat.Robovirus 2.718 | 8 | 100% |
| stelo.WangRobot 1.0 | 6 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 67% |
| ratosh.Nobo 0.21 | 3 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 28 | 36% | 70 |
| uji.DBH 1.1 | 14 | 18% | 35 |
| agd.Mooserwirt2 2.7 | 9 | 12% | 38 |
| sigterm.Sigterm 1.0 | 6 | 8% | 17 |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 6% | 14 |
| ratosh.Nobo 0.21 | 5 | 6% | 13 |
| stelo.WangRobot 1.0 | 4 | 5% | 8 |
| spinnercat.Robovirus 2.718 | 1 | 1% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 5 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 140507 melee ticks, 48342 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 65 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 5.

Targeting waves (205 rounds): 47046 sent, 42124 reached their opponent, 8856 virtual hits (21.0% of those reached).

## Melee bench: F19

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 249 over 6 battles (41.5 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 96.7 | 187 / 210 | 1.30 | 22.2% | 37848 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 22.2% | 187 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.7% | 11 |
| mld.Infinity 2.2 | 3.7 | 12.0% | 6 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.5% | 4 |
| erdnis.Rover 0.3 | 4.7 | 10.6% | 1 |
| patson.PatsonTestBot 1.0 | 5.8 | 9.0% | 0 |
| mbh.Mbh 0.1 | 7.5 | 7.0% | 0 |
| pac.ABC 2.1 | 7.7 | 6.5% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.0% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 93.7 | 30 / 35 | 5979 |
| 2 | 1 | 73.7 | 98.4 | 33 / 35 | 6446 |
| 3 | 1 | 73.1 | 95.9 | 31 / 35 | 6278 |
| 4 | 1 | 72.9 | 96.8 | 29 / 35 | 6017 |
| 5 | 1 | 73.7 | 97.8 | 32 / 35 | 6437 |
| 6 | 1 | 73.6 | 97.5 | 32 / 35 | 6691 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 105 | 98% |
| mld.Infinity 2.2 | 30 | 100% |
| krillr.mini.JointStrike 2.0.0 | 26 | 92% |
| erdnis.Rover 0.3 | 14 | 93% |
| pac.ABC 2.1 | 6 | 100% |
| patson.PatsonTestBot 1.0 | 6 | 100% |
| mbh.Mbh 0.1 | 3 | 100% |
| pbg.R2D2 1.0 | 3 | 67% |

Hadur died in 25 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| krillr.mini.JointStrike 2.0.0 | 7 | 28% | 28 |
| davidalves.net.DuelistMiniMelee 1.2 | 6 | 24% | 80 |
| patson.PatsonTestBot 1.0 | 4 | 16% | 19 |
| erdnis.Rover 0.3 | 3 | 12% | 30 |
| mld.Infinity 2.2 | 1 | 4% | 22 |
| mbh.Mbh 0.1 | 1 | 4% | 11 |
| pbg.R2D2 1.0 | 1 | 4% | 10 |
| pac.ABC 2.1 | 1 | 4% | 9 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 124503 melee ticks, 46464 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 63 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 42381 sent, 37870 reached their opponent, 8939 virtual hits (23.6% of those reached).

## Melee bench: F20

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 453 over 6 battles (75.5 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.5 | 144 / 210 | 1.76 | 20.9% | 36588 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 20.9% | 144 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.2% | 35 |
| fwb.Nine 1.0.1 | 3.5 | 11.3% | 11 |
| catcat20.Rabbit 0.001 | 4.0 | 10.8% | 16 |
| nz.jdc.nano.GridFu 1.0 | 4.5 | 10.4% | 2 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 7.9% | 1 |
| bayen.nut.Squirrel 1.615 | 7.3 | 6.9% | 1 |
| djdjdj.NanoSkunk10 1.0 | 8.0 | 6.2% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.3 | 6.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 90.2 | 21 / 35 | 5901 |
| 2 | 1 | 71.3 | 91.1 | 25 / 35 | 6218 |
| 3 | 1 | 71.8 | 93.3 | 25 / 35 | 6216 |
| 4 | 1 | 69.8 | 88.3 | 21 / 35 | 5665 |
| 5 | 1 | 72.7 | 94.3 | 27 / 35 | 6646 |
| 6 | 1 | 71.1 | 92.1 | 25 / 35 | 5942 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 67 | 84% |
| fwb.Nine 1.0.1 | 46 | 96% |
| catcat20.Rabbit 0.001 | 33 | 70% |
| nz.jdc.nano.GridFu 1.0 | 9 | 100% |
| m3thos.mini.Eva01 0.5.5 | 6 | 83% |
| bayen.nut.Squirrel 1.615 | 4 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 966. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 26 | 38% | 82 |
| catcat20.Rabbit 0.001 | 14 | 20% | 51 |
| fwb.Nine 1.0.1 | 14 | 20% | 24 |
| nz.jdc.nano.GridFu 1.0 | 5 | 7% | 21 |
| bayen.nut.Squirrel 1.615 | 3 | 4% | 6 |
| ntc.ControlledChaos 1.1.4 | 2 | 3% | 4 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 4 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 161972 melee ticks, 55582 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 39 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 51361 sent, 46491 reached their opponent, 10521 virtual hits (22.6% of those reached).

## Melee bench: F21

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 702 over 6 battles (117.0 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.5 | 111 / 210 | 1.85 | 19.9% | 34395 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 19.9% | 111 |
| eem.EvBot v4.6.16 | 2.0 | 17.0% | 73 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.9% | 11 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.4% | 5 |
| eld.Hmm 1.0 | 5.2 | 8.6% | 10 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.3% | 0 |
| PSW.Relentless 0.1 | 7.8 | 5.7% | 0 |
| el.JumpShoot 0.2 | 8.0 | 5.9% | 0 |
| fire219.CatBot 1.0 | 8.2 | 5.8% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.3 | 18 / 35 | 6064 |
| 2 | 1 | 70.5 | 91.1 | 21 / 35 | 5518 |
| 3 | 1 | 69.2 | 88.3 | 18 / 35 | 5374 |
| 4 | 1 | 69.0 | 86.3 | 13 / 35 | 5536 |
| 5 | 1 | 71.2 | 93.0 | 22 / 35 | 5804 |
| 6 | 1 | 71.0 | 91.1 | 19 / 35 | 6099 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 124 | 58% |
| dummy.mini.Scimitar 1.01 | 19 | 79% |
| cf.RiO.RiOx 4.2.1 | 19 | 84% |
| eld.Hmm 1.0 | 12 | 33% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 1291. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 59 | 56% | 106 |
| dummy.mini.Scimitar 1.01 | 16 | 15% | 35 |
| eld.Hmm 1.0 | 10 | 10% | 26 |
| cf.RiO.RiOx 4.2.1 | 7 | 7% | 28 |
| PSW.Relentless 0.1 | 4 | 4% | 4 |
| oa.weak.BotherBot 0.1 | 2 | 2% | 8 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 182813 melee ticks, 84656 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 797 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 323 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 53905 sent, 49085 reached their opponent, 8191 virtual hits (16.7% of those reached).

## Melee bench: F22

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 251 over 6 battles (41.8 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 87.1 | 97 / 210 | 2.16 | 18.3% | 29565 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 18.3% | 97 |
| kvk.HebusLeTroll 0.35 | 2.5 | 15.1% | 32 |
| pe.SandboxDT 2.71m | 2.5 | 15.3% | 50 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.1% | 25 |
| bigpete.Stewie 1.0 | 5.0 | 11.1% | 5 |
| yk.JahRoslav 1.1 | 6.5 | 7.1% | 0 |
| tad.Dalek98 0.98 | 7.0 | 6.5% | 0 |
| gg.Squaraus 0.6 | 7.5 | 6.2% | 1 |
| pbg.NinjaX 1.2 | 9.0 | 4.8% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 89.5 | 18 / 35 | 5122 |
| 2 | 1 | 67.1 | 84.4 | 9 / 35 | 4750 |
| 3 | 1 | 68.4 | 85.4 | 19 / 35 | 4890 |
| 4 | 1 | 69.2 | 90.5 | 19 / 35 | 4669 |
| 5 | 1 | 68.2 | 83.5 | 18 / 35 | 4825 |
| 6 | 1 | 69.3 | 89.5 | 14 / 35 | 5309 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 51 | 51% |
| kvk.HebusLeTroll 0.35 | 46 | 76% |
| jlm.javaDisturbance 0.59 | 32 | 66% |
| bigpete.Stewie 1.0 | 11 | 100% |
| yk.JahRoslav 1.1 | 2 | 100% |
| gg.Squaraus 0.6 | 2 | 50% |
| tad.Dalek98 0.98 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 43 | 38% | 78 |
| kvk.HebusLeTroll 0.35 | 32 | 28% | 57 |
| jlm.javaDisturbance 0.59 | 26 | 23% | 47 |
| bigpete.Stewie 1.0 | 7 | 6% | 19 |
| tad.Dalek98 0.98 | 2 | 2% | 3 |
| gg.Squaraus 0.6 | 1 | 1% | 2 |
| yk.JahRoslav 1.1 | 1 | 1% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 157300 melee ticks, 44868 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 47 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 51519 sent, 46731 reached their opponent, 7407 virtual hits (15.9% of those reached).

## Melee bench: F23

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 292 over 6 battles (48.7 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 95.0 | 169 / 210 | 1.45 | 21.8% | 36965 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 21.8% | 169 |
| pe.SandboxLump 1.52 | 2.0 | 15.5% | 20 |
| cre.Karolos 0.32 | 3.0 | 14.2% | 13 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.2% | 1 |
| stelo.RamTrackSurfer 1.2 | 4.8 | 9.8% | 6 |
| cw.megas.Blade 0.8 | 6.3 | 8.6% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.8 | 8.4% | 0 |
| sample.Walls 1.0 | 7.5 | 7.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.4% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 95.6 | 26 / 35 | 6465 |
| 2 | 1 | 73.8 | 98.1 | 32 / 35 | 6279 |
| 3 | 1 | 72.9 | 95.2 | 28 / 35 | 5957 |
| 4 | 1 | 73.4 | 96.8 | 29 / 35 | 6504 |
| 5 | 1 | 72.3 | 92.4 | 28 / 35 | 5853 |
| 6 | 1 | 72.3 | 91.7 | 26 / 35 | 5907 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 78 | 91% |
| cre.Karolos 0.32 | 60 | 95% |
| stelo.RamTrackSurfer 1.2 | 14 | 64% |
| stelo.AreaTargetingBot 1.1 | 12 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 100% |
| sample.Walls 1.0 | 7 | 100% |
| cw.megas.Blade 0.8 | 4 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 17 | 40% | 85 |
| cre.Karolos 0.32 | 11 | 26% | 54 |
| stelo.RamTrackSurfer 1.2 | 8 | 19% | 29 |
| stelo.AreaTargetingBot 1.1 | 3 | 7% | 22 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 2% | 7 |
| cw.megas.Blade 0.8 | 1 | 2% | 6 |
| sample.Walls 1.0 | 0 | 0% | 6 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 126992 melee ticks, 47044 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 66 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 40115 sent, 35380 reached their opponent, 10417 virtual hits (29.4% of those reached).

## Melee bench: F24

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 766 over 6 battles (127.7 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 79.5 | 75 / 210 | 2.84 | 16.3% | 24502 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 16.3% | 75 |
| rz.GlowBlowMelee 1.4 | 2.0 | 15.0% | 50 |
| florent.XSeries.X2 0.12 | 3.8 | 12.6% | 26 |
| pedersen.Ugluk 1.1.1 | 4.0 | 12.1% | 23 |
| davidalves.Phoenix 0.54 | 4.2 | 12.1% | 27 |
| oog.melee.Corsair 1.0 | 6.0 | 9.6% | 8 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 6.8% | 1 |
| lunchie.Lunchbox 0.93 | 8.3 | 5.9% | 1 |
| as.FrankTheTank 1.3 | 8.8 | 5.1% | 0 |
| evd.X1 0.01 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 75.9 | 15 / 35 | 3847 |
| 2 | 1 | 64.3 | 79.7 | 9 / 35 | 3857 |
| 3 | 1 | 65.3 | 80.3 | 12 / 35 | 4354 |
| 4 | 1 | 64.4 | 77.1 | 13 / 35 | 4081 |
| 5 | 1 | 66.0 | 81.3 | 12 / 35 | 4286 |
| 6 | 1 | 66.3 | 82.9 | 14 / 35 | 4077 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 43 | 47% |
| davidalves.Phoenix 0.54 | 25 | 56% |
| florent.XSeries.X2 0.12 | 22 | 64% |
| pedersen.Ugluk 1.1.1 | 20 | 75% |
| oog.melee.Corsair 1.0 | 8 | 75% |
| stelo.SoJNanoMelee 1.1 | 4 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 42 | 29% | 65 |
| davidalves.Phoenix 0.54 | 30 | 21% | 37 |
| florent.XSeries.X2 0.12 | 22 | 15% | 34 |
| pedersen.Ugluk 1.1.1 | 20 | 14% | 34 |
| oog.melee.Corsair 1.0 | 12 | 8% | 23 |
| stelo.SoJNanoMelee 1.1 | 5 | 3% | 10 |
| lunchie.Lunchbox 0.93 | 4 | 3% | 5 |
| evd.X1 0.01 | 1 | 1% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 137042 melee ticks, 36634 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 64 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 3.

Targeting waves (206 rounds): 45189 sent, 40082 reached their opponent, 7302 virtual hits (18.2% of those reached).

## Melee bench: F25

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 424 over 6 battles (70.7 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 85.4 | 125 / 210 | 2.31 | 18.1% | 24257 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 18.1% | 125 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 13.7% | 17 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 13.0% | 20 |
| jdw.Hurricane 1.4 | 4.0 | 11.3% | 24 |
| ds.Oo 2.2 | 5.2 | 9.9% | 9 |
| gre.svman4.Morfeas 1.4.1 | 5.8 | 9.2% | 7 |
| adt.Ar2 1.1 | 7.3 | 7.1% | 1 |
| awesomeness.Elite 1.0 | 7.5 | 7.3% | 3 |
| gjr.Cephalosporin 0.1 | 9.0 | 6.0% | 4 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 87.6 | 23 / 35 | 4068 |
| 2 | 1 | 67.8 | 85.1 | 24 / 35 | 4113 |
| 3 | 1 | 66.5 | 82.5 | 18 / 35 | 3918 |
| 4 | 1 | 69.0 | 88.6 | 25 / 35 | 4188 |
| 5 | 1 | 65.3 | 80.3 | 15 / 35 | 3908 |
| 6 | 1 | 67.8 | 88.3 | 20 / 35 | 4062 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 50 | 88% |
| voidious.micro.BlitzBat 1.05 | 32 | 88% |
| jdw.Hurricane 1.4 | 22 | 68% |
| ds.Oo 2.2 | 19 | 89% |
| gre.svman4.Morfeas 1.4.1 | 7 | 100% |
| gjr.Cephalosporin 0.1 | 5 | 80% |
| adt.Ar2 1.1 | 5 | 100% |
| awesomeness.Elite 1.0 | 5 | 80% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 20 | 23% | 59 |
| voidious.micro.BlitzBat 1.05 | 16 | 18% | 37 |
| ds.Oo 2.2 | 14 | 16% | 30 |
| jdw.Hurricane 1.4 | 13 | 15% | 26 |
| awesomeness.Elite 1.0 | 8 | 9% | 11 |
| gre.svman4.Morfeas 1.4.1 | 6 | 7% | 20 |
| adt.Ar2 1.1 | 5 | 6% | 13 |
| gjr.Cephalosporin 0.1 | 3 | 3% | 12 |
| amk.ChumbaMini 0.2 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 123793 melee ticks, 27950 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 41 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 44244 sent, 39480 reached their opponent, 6648 virtual hits (16.8% of those reached).

## Melee bench: F26

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 231 over 6 battles (38.5 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 91.7 | 141 / 210 | 1.75 | 20.9% | 39454 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 20.9% | 141 |
| ak.Fermat 2.0 | 2.3 | 14.1% | 24 |
| shu.nitro.LENIN .T34 | 3.3 | 12.6% | 20 |
| lrem.Spectre 0.4.4 | 3.3 | 12.5% | 18 |
| js.PinBall 1.6 | 5.3 | 10.5% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 5.7 | 9.7% | 3 |
| gh.mini.GrubbmOne 1.0 | 7.2 | 7.7% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.8% | 1 |
| sample.SpinBot 1.0 | 9.0 | 3.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 94.0 | 27 / 35 | 6784 |
| 2 | 1 | 72.7 | 94.3 | 26 / 35 | 6518 |
| 3 | 1 | 71.6 | 90.8 | 21 / 35 | 6852 |
| 4 | 1 | 71.1 | 90.2 | 21 / 35 | 6470 |
| 5 | 1 | 71.6 | 93.0 | 22 / 35 | 6378 |
| 6 | 1 | 71.1 | 87.9 | 24 / 35 | 6452 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 47 | 77% |
| lrem.Spectre 0.4.4 | 44 | 84% |
| shu.nitro.LENIN .T34 | 43 | 84% |
| js.PinBall 1.6 | 17 | 94% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 88% |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 100% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 963. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shu.nitro.LENIN .T34 | 23 | 32% | 63 |
| ak.Fermat 2.0 | 23 | 32% | 55 |
| lrem.Spectre 0.4.4 | 14 | 20% | 45 |
| jaybot.adv.bots.JayBot 2.0 | 6 | 8% | 12 |
| js.PinBall 1.6 | 3 | 4% | 21 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 11 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 162060 melee ticks, 45250 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 54 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 51314 sent, 46679 reached their opponent, 11346 virtual hits (24.3% of those reached).

## Melee bench: F27

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 223 over 6 battles (37.2 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 83.8 | 147 / 210 | 2.46 | 18.8% | 30131 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.5 | 18.8% | 147 |
| mk.Alpha 0.2.1 | 2.0 | 13.2% | 26 |
| EH.Eagle 1.0.6 | 2.7 | 11.7% | 10 |
| throxbot.ThroxBot 0.1 | 5.2 | 9.3% | 5 |
| wee.Gem 1.8.4 | 5.8 | 9.2% | 13 |
| techdude.kombat.FlamingKombat 1.5 | 6.2 | 8.9% | 2 |
| sheldor.melee.nano.TestMelee 0.1 | 6.5 | 8.7% | 6 |
| joe.ADinosaur 1.0 | 6.7 | 8.8% | 0 |
| caimano.Furia_Ceca 0.22 | 8.5 | 7.1% | 2 |
| cs.Grudge 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 91.7 | 27 / 35 | 5094 |
| 2 | 1 | 70.0 | 90.2 | 27 / 35 | 5094 |
| 3 | 1 | 70.3 | 93.3 | 27 / 35 | 5459 |
| 4 | 4 | 52.6 | 40.6 | 7 / 35 | 4105 |
| 5 | 1 | 70.4 | 91.1 | 28 / 35 | 5190 |
| 6 | 1 | 71.4 | 95.9 | 31 / 35 | 5189 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 75 | 91% |
| EH.Eagle 1.0.6 | 31 | 94% |
| throxbot.ThroxBot 0.1 | 13 | 92% |
| techdude.kombat.FlamingKombat 1.5 | 13 | 100% |
| wee.Gem 1.8.4 | 11 | 91% |
| joe.ADinosaur 1.0 | 6 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |
| cs.Grudge 1.0 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 518. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cs.Grudge 1.0 | 15 | 23% | 15 |
| mk.Alpha 0.2.1 | 14 | 22% | 71 |
| throxbot.ThroxBot 0.1 | 8 | 13% | 21 |
| joe.ADinosaur 1.0 | 7 | 11% | 12 |
| EH.Eagle 1.0.6 | 6 | 9% | 42 |
| techdude.kombat.FlamingKombat 1.5 | 5 | 8% | 17 |
| wee.Gem 1.8.4 | 4 | 6% | 16 |
| caimano.Furia_Ceca 0.22 | 3 | 5% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 1 | 2% | 10 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 123380 melee ticks, 34336 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 71 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 40644 sent, 35844 reached their opponent, 8374 virtual hits (23.4% of those reached).

## Melee bench: F28

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 556 over 6 battles (92.7 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 85.6 | 108 / 210 | 2.30 | 17.6% | 23984 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 17.6% | 108 |
| kid.test.NightFox .2 | 2.0 | 15.1% | 34 |
| uji.Antique 1.0 | 3.3 | 12.4% | 31 |
| qohnil.blot.BlotBot 3.61 | 3.7 | 12.1% | 26 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.2% | 3 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.3% | 4 |
| ahr.ice.Ice 1.0.2 | 7.0 | 7.4% | 4 |
| matt.advanced.Katana 1.0 | 8.3 | 6.0% | 1 |
| stelo.PianistNano 1.2 | 8.7 | 5.8% | 0 |
| stelo.Lifestealer 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 86.3 | 20 / 35 | 4112 |
| 2 | 1 | 67.0 | 86.3 | 20 / 35 | 3990 |
| 3 | 1 | 65.2 | 81.0 | 14 / 35 | 3841 |
| 4 | 1 | 67.7 | 88.6 | 21 / 35 | 4008 |
| 5 | 1 | 67.1 | 86.7 | 19 / 35 | 4014 |
| 6 | 1 | 66.1 | 84.8 | 14 / 35 | 4019 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 66 | 77% |
| uji.Antique 1.0 | 36 | 81% |
| qohnil.blot.BlotBot 3.61 | 19 | 74% |
| pfvicm.Sobieski 7.2.3b | 7 | 71% |
| ahr.ice.Ice 1.0.2 | 5 | 80% |
| amk.ChumbaWumba 0.3 | 5 | 80% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 29 | 27% | 65 |
| uji.Antique 1.0 | 29 | 27% | 56 |
| qohnil.blot.BlotBot 3.61 | 15 | 14% | 35 |
| pfvicm.Sobieski 7.2.3b | 12 | 11% | 19 |
| amk.ChumbaWumba 0.3 | 12 | 11% | 17 |
| ahr.ice.Ice 1.0.2 | 4 | 4% | 10 |
| stelo.Lifestealer 1.0 | 2 | 2% | 2 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |
| matt.advanced.Katana 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 133568 melee ticks, 35350 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 32 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 5.

Targeting waves (207 rounds): 44921 sent, 39969 reached their opponent, 5667 virtual hits (14.2% of those reached).

## Melee bench: F29

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 237 over 6 battles (39.5 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.2 | 87 / 210 | 2.33 | 18.1% | 27223 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 18.1% | 87 |
| deewiant.Anomaly 0.2 | 2.3 | 15.3% | 50 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 14.6% | 49 |
| myl.micro.Troodon 1.10 | 4.0 | 12.5% | 9 |
| jok.PheonixM 0.1.2 | 5.0 | 10.5% | 9 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.5% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.3 | 6.0% | 0 |
| DBall.Anarchy 0.1 | 7.7 | 5.3% | 2 |
| jangs.ns51 1.0 | 9.3 | 4.6% | 1 |
| ap.Frederick 1.1 | 9.7 | 4.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 86.0 | 15 / 35 | 4362 |
| 2 | 1 | 67.6 | 83.8 | 12 / 35 | 4524 |
| 3 | 1 | 68.4 | 85.1 | 16 / 35 | 4449 |
| 4 | 1 | 68.0 | 84.1 | 13 / 35 | 4932 |
| 5 | 1 | 69.6 | 90.2 | 16 / 35 | 4785 |
| 6 | 1 | 66.7 | 82.2 | 15 / 35 | 4171 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 60 | 60% |
| zyx.mega.YersiniaPestis 3.1 | 41 | 49% |
| myl.micro.Troodon 1.10 | 21 | 86% |
| jok.PheonixM 0.1.2 | 11 | 73% |
| ap.Frederick 1.1 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 55 | 44% | 95 |
| zyx.mega.YersiniaPestis 3.1 | 34 | 27% | 55 |
| myl.micro.Troodon 1.10 | 17 | 14% | 31 |
| jok.PheonixM 0.1.2 | 11 | 9% | 17 |
| ph.melee.ArcherME 0.3 | 3 | 2% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 4 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
| DBall.Anarchy 0.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 170000 melee ticks, 47330 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 47 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 54833 sent, 49871 reached their opponent, 7527 virtual hits (15.1% of those reached).

## Melee bench: F30

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 692 over 6 battles (115.3 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 75.5 | 46 / 210 | 3.20 | 15.0% | 23454 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.2 | 15.0% | 46 |
| darkcanuck.B26354 1.06 | 2.7 | 13.8% | 53 |
| catcat20.Matcha 0.006 | 3.0 | 13.4% | 42 |
| oog.melee.Capulet 1.2 | 4.0 | 12.5% | 34 |
| stelo.PastFuture 2.3.2 | 4.2 | 12.4% | 17 |
| intruder.PrairieWolf 2.61 | 6.3 | 9.0% | 11 |
| fowl3628800.LightningBolt 2.6.0 | 7.7 | 6.8% | 2 |
| ntc.Opposite 1.5 | 8.0 | 7.1% | 0 |
| tripphippy.Alice 1.1 | 8.0 | 7.3% | 5 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 75.6 | 6 / 35 | 3787 |
| 2 | 1 | 64.1 | 76.8 | 12 / 35 | 4049 |
| 3 | 1 | 62.2 | 77.5 | 6 / 35 | 3676 |
| 4 | 1 | 63.5 | 76.2 | 8 / 35 | 4062 |
| 5 | 1 | 62.6 | 74.0 | 8 / 35 | 3817 |
| 6 | 2 | 62.6 | 73.0 | 6 / 35 | 4063 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 34 | 32% |
| oog.melee.Capulet 1.2 | 19 | 37% |
| catcat20.Matcha 0.006 | 18 | 39% |
| stelo.PastFuture 2.3.2 | 10 | 40% |
| fowl3628800.LightningBolt 2.6.0 | 9 | 89% |
| intruder.PrairieWolf 2.61 | 5 | 80% |
| tripphippy.Alice 1.1 | 5 | 60% |
| ntc.Opposite 1.5 | 2 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 48 | 28% | 60 |
| catcat20.Matcha 0.006 | 29 | 17% | 39 |
| stelo.PastFuture 2.3.2 | 28 | 17% | 35 |
| oog.melee.Capulet 1.2 | 25 | 15% | 33 |
| tripphippy.Alice 1.1 | 11 | 7% | 13 |
| intruder.PrairieWolf 2.61 | 10 | 6% | 12 |
| ntc.Opposite 1.5 | 8 | 5% | 9 |
| fowl3628800.LightningBolt 2.6.0 | 3 | 2% | 7 |
| GarmBox.Anger 1.0 | 2 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 154320 melee ticks, 30456 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 34 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 50604 sent, 45629 reached their opponent, 7740 virtual hits (17.0% of those reached).

## Melee bench: F31

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 464 over 6 battles (77.3 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 79.2 | 59 / 210 | 2.87 | 15.8% | 22337 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.2% | 81 |
| hadur117.Hadur 3.20 | 2.0 | 15.8% | 59 |
| gh.mini.Griezel 0.2 | 3.2 | 13.6% | 48 |
| d414.nano.Quantum 1.0.0 | 4.2 | 11.7% | 14 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 10.6% | 8 |
| gh.nano.Grofvuil 0.2 | 6.2 | 8.5% | 0 |
| timmit.nano.TimDog 0.33 | 6.8 | 7.2% | 1 |
| fm.mammillarias 1.3 | 8.5 | 5.5% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.5 | 5.5% | 0 |
| tlp.ThreeLeggedPig 1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 72.4 | 6 / 35 | 3405 |
| 2 | 2 | 64.3 | 79.0 | 11 / 35 | 3803 |
| 3 | 3 | 63.7 | 77.1 | 7 / 35 | 3781 |
| 4 | 2 | 63.7 | 79.0 | 7 / 35 | 3556 |
| 5 | 2 | 65.0 | 82.2 | 12 / 35 | 3655 |
| 6 | 1 | 67.2 | 85.4 | 16 / 35 | 4137 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 49 | 51% |
| gh.mini.Griezel 0.2 | 40 | 50% |
| d414.nano.Quantum 1.0.0 | 13 | 54% |
| spinnercat.micro.Tyger 0.1 | 5 | 60% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 54 | 35% | 78 |
| gh.mini.Griezel 0.2 | 35 | 23% | 53 |
| d414.nano.Quantum 1.0.0 | 25 | 16% | 33 |
| spinnercat.micro.Tyger 0.1 | 20 | 13% | 23 |
| timmit.nano.TimDog 0.33 | 6 | 4% | 8 |
| gh.nano.Grofvuil 0.2 | 6 | 4% | 8 |
| fm.mammillarias 1.3 | 3 | 2% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 150795 melee ticks, 35870 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 48 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 49252 sent, 44158 reached their opponent, 7104 virtual hits (16.1% of those reached).

## Melee bench: F32

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 161 over 6 battles (26.8 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 86.1 | 110 / 210 | 2.25 | 17.8% | 26937 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 17.8% | 110 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.6% | 52 |
| apc.botM 3.0 | 3.0 | 12.6% | 25 |
| lxx.ConceptA 0.8 | 4.5 | 10.2% | 4 |
| vjik.UnViolation 1.1 | 4.8 | 9.9% | 6 |
| bayen.UbaMicro 1.4 | 6.0 | 8.6% | 5 |
| panzer.Panzer 0.2 | 6.8 | 7.6% | 1 |
| yk.JahMicro 1.0 | 8.2 | 6.7% | 4 |
| conscience.Electron 1.3g | 8.7 | 6.6% | 1 |
| donjezza.Jezza 1.0 | 10.0 | 5.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 86.7 | 16 / 35 | 4720 |
| 2 | 1 | 68.6 | 89.2 | 20 / 35 | 4984 |
| 3 | 1 | 67.6 | 89.2 | 21 / 35 | 4541 |
| 4 | 1 | 66.1 | 83.5 | 20 / 35 | 4060 |
| 5 | 1 | 65.8 | 85.4 | 17 / 35 | 4277 |
| 6 | 1 | 65.8 | 82.5 | 16 / 35 | 4355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 63 | 59% |
| apc.botM 3.0 | 45 | 78% |
| vjik.UnViolation 1.1 | 14 | 93% |
| donjezza.Jezza 1.0 | 8 | 100% |
| lxx.ConceptA 0.8 | 6 | 100% |
| yk.JahMicro 1.0 | 6 | 67% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| panzer.Panzer 0.2 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 47 | 46% | 80 |
| lxx.ConceptA 0.8 | 14 | 14% | 19 |
| apc.botM 3.0 | 13 | 13% | 48 |
| bayen.UbaMicro 1.4 | 7 | 7% | 12 |
| panzer.Panzer 0.2 | 7 | 7% | 9 |
| vjik.UnViolation 1.1 | 6 | 6% | 26 |
| conscience.Electron 1.3g | 4 | 4% | 5 |
| yk.JahMicro 1.0 | 3 | 3% | 6 |
| donjezza.Jezza 1.0 | 1 | 1% | 4 |

Posture (Hadur's M records, 203 rounds): 124575 melee ticks, 48027 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 48 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 2.

Targeting waves (203 rounds): 42123 sent, 37309 reached their opponent, 6837 virtual hits (18.3% of those reached).

## Melee bench: F33

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 510 over 6 battles (85.0 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 84.4 | 97 / 210 | 2.40 | 18.0% | 27573 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.2 | 18.0% | 97 |
| maribo.Quester 0.3 | 1.8 | 16.1% | 45 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.5% | 36 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.4% | 13 |
| labg.Cataclysm 2.05 | 4.7 | 10.8% | 15 |
| baal.nano.N 1.42 | 6.2 | 9.1% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.0% | 3 |
| zyx.micro.Ant 1.1 | 8.3 | 5.0% | 0 |
| sanja.First 0.1 | 8.7 | 4.6% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 89.8 | 19 / 35 | 4942 |
| 2 | 1 | 70.1 | 91.4 | 22 / 35 | 4808 |
| 3 | 1 | 66.9 | 80.6 | 16 / 35 | 4476 |
| 4 | 2 | 63.9 | 74.9 | 8 / 35 | 4010 |
| 5 | 1 | 68.7 | 87.0 | 18 / 35 | 4597 |
| 6 | 1 | 67.8 | 82.9 | 14 / 35 | 4740 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 48 | 69% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 58% |
| gre.svman4.Leonidas 1.3.2 | 24 | 92% |
| labg.Cataclysm 2.05 | 12 | 75% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 83% |
| baal.nano.N 1.42 | 6 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 1006. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 40 | 34% | 77 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 26% | 55 |
| gre.svman4.Leonidas 1.3.2 | 20 | 17% | 29 |
| labg.Cataclysm 2.05 | 8 | 7% | 20 |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 7% | 12 |
| baal.nano.N 1.42 | 5 | 4% | 13 |
| zyx.micro.Ant 1.1 | 1 | 1% | 3 |
| sanja.First 0.1 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 175173 melee ticks, 40181 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 65 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 54748 sent, 50028 reached their opponent, 7380 virtual hits (14.8% of those reached).

## Melee bench: F34

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 540 over 6 battles (90.0 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 84.3 | 71 / 210 | 2.41 | 17.5% | 30224 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.3 | 17.5% | 71 |
| kid.Gladiator .7.2 | 2.2 | 16.7% | 52 |
| stelo.Spread 0.9 | 2.5 | 16.6% | 68 |
| jcs.Seth 1.8 | 4.2 | 11.3% | 16 |
| tcf.Reach 3 | 5.0 | 10.6% | 3 |
| cli.Dancer 1.1 | 5.8 | 9.7% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 6.7% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.7% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.3% | 1 |
| sample.RamFire 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 78.7 | 7 / 35 | 4493 |
| 2 | 1 | 69.3 | 88.3 | 16 / 35 | 5021 |
| 3 | 1 | 67.7 | 82.9 | 11 / 35 | 5264 |
| 4 | 2 | 68.0 | 83.8 | 11 / 35 | 5016 |
| 5 | 1 | 69.3 | 88.6 | 14 / 35 | 5368 |
| 6 | 1 | 67.5 | 83.5 | 12 / 35 | 5062 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 58 | 50% |
| stelo.Spread 0.9 | 54 | 44% |
| jcs.Seth 1.8 | 21 | 52% |
| tcf.Reach 3 | 7 | 86% |
| cli.Dancer 1.1 | 2 | 50% |
| sample.VelociRobot 1.0 | 1 | 0% |

Hadur died in 146 of 210 rounds, at a mean tick of 1042. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 57 | 39% | 83 |
| stelo.Spread 0.9 | 51 | 35% | 73 |
| jcs.Seth 1.8 | 16 | 11% | 29 |
| tcf.Reach 3 | 8 | 5% | 15 |
| cli.Dancer 1.1 | 3 | 2% | 5 |
| ratosh.Wesco 1.4 | 2 | 1% | 2 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
| sample.VelociRobot 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 165112 melee ticks, 56632 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 33 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 51944 sent, 47088 reached their opponent, 8039 virtual hits (17.1% of those reached).

## Melee bench: F35

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 436 over 6 battles (72.7 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 80.2 | 36 / 210 | 2.79 | 15.5% | 22565 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.4% | 141 |
| hadur117.Hadur 3.20 | 2.0 | 15.5% | 36 |
| gh.mini.Gruwel 0.9 | 3.3 | 13.0% | 19 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 11.9% | 7 |
| rz.HawkOnFire 0.1 | 4.5 | 11.9% | 5 |
| wit.Chuliath 1.0 | 6.5 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.3 | 5.9% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.5 | 5.8% | 2 |
| stelo.MyAgileRobot 0.2 | 9.0 | 4.9% | 0 |
| dans.Cinnamon 1.2 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 75.9 | 4 / 35 | 3596 |
| 2 | 2 | 65.2 | 82.9 | 5 / 35 | 3873 |
| 3 | 2 | 65.0 | 83.2 | 8 / 35 | 3724 |
| 4 | 2 | 63.7 | 75.9 | 7 / 35 | 3857 |
| 5 | 2 | 64.5 | 81.0 | 6 / 35 | 3792 |
| 6 | 2 | 64.6 | 82.2 | 6 / 35 | 3723 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 81 | 23% |
| gh.mini.Gruwel 0.9 | 17 | 35% |
| rz.HawkOnFire 0.1 | 10 | 80% |
| dmh.robocode.robot.BlackDeath 9.2 | 4 | 50% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 94 | 53% | 114 |
| gh.mini.Gruwel 0.9 | 28 | 16% | 34 |
| rz.HawkOnFire 0.1 | 27 | 15% | 31 |
| dmh.robocode.robot.BlackDeath 9.2 | 18 | 10% | 21 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 4 |
| myl.nano.KomoriNinja 1.1 | 3 | 2% | 3 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
| wit.Chuliath 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 142965 melee ticks, 44933 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 26 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 44912 sent, 39878 reached their opponent, 6439 virtual hits (16.1% of those reached).

## Melee bench: F36

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 195 over 6 battles (32.5 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.8 | 142 / 210 | 1.83 | 20.3% | 32266 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 20.3% | 142 |
| bzdp.Pansy 2.1 | 2.0 | 13.0% | 12 |
| alpha.RainingFire 1.0 | 3.3 | 11.7% | 18 |
| mz.Cork 0.1 | 5.0 | 10.4% | 14 |
| bvh.micro.Freya 0.3 | 5.3 | 10.7% | 9 |
| m3thos.Eva02 0.7.1 | 5.7 | 10.0% | 12 |
| bvh.mini.Fenrir 0.39 | 5.7 | 9.9% | 2 |
| dl.BetterWalls 1.0 | 8.5 | 5.4% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 5.1% | 1 |
| sample.MyFirstRobot 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 82.5 | 17 / 35 | 4796 |
| 2 | 1 | 69.8 | 88.3 | 20 / 35 | 5377 |
| 3 | 1 | 72.2 | 95.6 | 27 / 35 | 5639 |
| 4 | 1 | 70.9 | 92.1 | 25 / 35 | 5488 |
| 5 | 1 | 71.6 | 94.3 | 28 / 35 | 5522 |
| 6 | 1 | 71.1 | 92.1 | 25 / 35 | 5444 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 47 | 94% |
| bvh.micro.Freya 0.3 | 34 | 94% |
| alpha.RainingFire 1.0 | 25 | 76% |
| mz.Cork 0.1 | 23 | 70% |
| bvh.mini.Fenrir 0.39 | 17 | 94% |
| m3thos.Eva02 0.7.1 | 16 | 75% |
| dl.BetterWalls 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 19 | 28% | 41 |
| bvh.micro.Freya 0.3 | 13 | 19% | 37 |
| mz.Cork 0.1 | 10 | 14% | 28 |
| bvh.mini.Fenrir 0.39 | 9 | 13% | 24 |
| m3thos.Eva02 0.7.1 | 7 | 10% | 22 |
| bzdp.Pansy 2.1 | 6 | 9% | 45 |
| dl.BetterWalls 1.0 | 3 | 4% | 9 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 3 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 202 rounds): 140921 melee ticks, 40715 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 49 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 48522 sent, 43867 reached their opponent, 9165 virtual hits (20.9% of those reached).

## Melee bench: F37

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 416 over 6 battles (69.3 per battle, most in one battle 153). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 87.0 | 151 / 210 | 2.17 | 19.1% | 33727 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 19.1% | 151 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.5 | 10.9% | 12 |
| stelo.UntouchableNano 1.3 | 4.0 | 9.7% | 12 |
| germ.TheMind .2 | 4.2 | 9.8% | 11 |
| agrach.Dalek 1.0 | 5.5 | 9.2% | 13 |
| EBBU.Sim2 1.02 | 6.2 | 9.1% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 6.5 | 8.6% | 0 |
| lmk.ACPFinal 0.1 | 7.7 | 8.4% | 2 |
| mb.Beast 0.1 | 8.2 | 8.1% | 3 |
| skm.Ryubot 1.0 | 9.3 | 7.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 86.3 | 24 / 35 | 5749 |
| 2 | 1 | 68.7 | 88.3 | 27 / 35 | 5619 |
| 3 | 1 | 68.8 | 89.8 | 26 / 35 | 5597 |
| 4 | 1 | 64.5 | 76.5 | 21 / 35 | 4982 |
| 5 | 1 | 67.7 | 84.8 | 24 / 35 | 5737 |
| 6 | 1 | 70.3 | 96.2 | 29 / 35 | 6043 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.UntouchableNano 1.3 | 31 | 87% |
| com.syncleus.robocode.Dreadnaught 0.1 | 28 | 82% |
| agrach.Dalek 1.0 | 26 | 96% |
| mb.Beast 0.1 | 20 | 100% |
| germ.TheMind .2 | 18 | 89% |
| skm.Ryubot 1.0 | 14 | 100% |
| lmk.ACPFinal 0.1 | 13 | 92% |
| EBBU.Sim2 1.02 | 12 | 92% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 446. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 13 | 21% | 20 |
| com.syncleus.robocode.Dreadnaught 0.1 | 12 | 19% | 36 |
| stelo.UntouchableNano 1.3 | 11 | 18% | 32 |
| germ.TheMind .2 | 8 | 13% | 20 |
| agrach.Dalek 1.0 | 7 | 11% | 37 |
| EBBU.Sim2 1.02 | 5 | 8% | 19 |
| mb.Beast 0.1 | 3 | 5% | 20 |
| lmk.ACPFinal 0.1 | 1 | 2% | 14 |
| skm.Ryubot 1.0 | 0 | 0% | 6 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 94167 melee ticks, 25644 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 180 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 180 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 32011 sent, 27544 reached their opponent, 8010 virtual hits (29.1% of those reached).

## Melee bench: F38

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 356 over 6 battles (59.3 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.3 | 106 / 210 | 2.14 | 18.3% | 28692 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 18.3% | 106 |
| justin.Mallais 14.0 | 2.0 | 15.9% | 60 |
| bvh.mini.Freya 0.55 | 3.0 | 12.8% | 15 |
| cs.Wren 1.0 | 4.7 | 10.4% | 6 |
| bts.mega.Gnarly 1.4 | 5.0 | 10.6% | 12 |
| kdf.KoulDestroyer 1.0 | 5.5 | 9.5% | 6 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 8.7% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 5.5% | 1 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.6% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 86.0 | 15 / 35 | 4984 |
| 2 | 1 | 69.8 | 92.7 | 21 / 35 | 5091 |
| 3 | 1 | 67.1 | 85.4 | 17 / 35 | 4350 |
| 4 | 1 | 68.3 | 87.9 | 18 / 35 | 4569 |
| 5 | 1 | 67.7 | 85.4 | 17 / 35 | 4718 |
| 6 | 1 | 68.2 | 86.3 | 18 / 35 | 4980 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 67 | 66% |
| bvh.mini.Freya 0.55 | 28 | 71% |
| bts.mega.Gnarly 1.4 | 19 | 68% |
| cs.Wren 1.0 | 16 | 81% |
| kdf.KoulDestroyer 1.0 | 11 | 73% |
| davidalves.net.DuelistNanoMelee 1.01 | 7 | 86% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 40 | 37% | 83 |
| bvh.mini.Freya 0.55 | 21 | 19% | 36 |
| bts.mega.Gnarly 1.4 | 15 | 14% | 32 |
| cs.Wren 1.0 | 12 | 11% | 21 |
| kdf.KoulDestroyer 1.0 | 11 | 10% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 5% | 14 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 4 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 140603 melee ticks, 35584 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 25 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45753 sent, 40734 reached their opponent, 8999 virtual hits (22.1% of those reached).

## Melee bench: F39

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 819 over 6 battles (136.5 per battle, most in one battle 151). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.8 | 95 / 210 | 2.28 | 18.3% | 30711 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 18.3% | 95 |
| bvh.fry.Freya 0.82 | 2.0 | 15.0% | 23 |
| az.Ololobot 0.2.4 | 3.2 | 13.0% | 59 |
| catcat20.Lambda 0.024 | 3.8 | 11.9% | 25 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.7% | 2 |
| gimp.GimpBot 0.1 | 6.7 | 7.8% | 4 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 7.3% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 7.2 | 7.4% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.5% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 87.9 | 16 / 35 | 4936 |
| 2 | 1 | 67.6 | 84.8 | 16 / 35 | 5187 |
| 3 | 1 | 66.5 | 86.0 | 13 / 35 | 4541 |
| 4 | 1 | 68.0 | 84.8 | 15 / 35 | 5406 |
| 5 | 1 | 67.1 | 83.5 | 15 / 35 | 5110 |
| 6 | 1 | 69.0 | 87.9 | 20 / 35 | 5531 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 47 | 49% |
| bvh.fry.Freya 0.82 | 43 | 79% |
| catcat20.Lambda 0.024 | 32 | 63% |
| gimp.GimpBot 0.1 | 8 | 75% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 5 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 1016. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 35 | 29% | 62 |
| bvh.fry.Freya 0.82 | 34 | 28% | 57 |
| catcat20.Lambda 0.024 | 24 | 20% | 46 |
| winamp32.micro.MicroMacro 1.0 | 8 | 7% | 13 |
| gimp.GimpBot 0.1 | 6 | 5% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 4 | 3% | 9 |
| apollokidd.ApolloKidd 0.9 | 3 | 2% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 5 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 167699 melee ticks, 45818 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 59 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 52755 sent, 47799 reached their opponent, 8460 virtual hits (17.7% of those reached).

## Melee bench: F40

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 512 over 6 battles (85.3 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 86.7 | 129 / 210 | 2.20 | 19.2% | 30166 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 19.2% | 129 |
| kawigi.mini.Coriantumr 1.1 | 2.3 | 14.2% | 29 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.5% | 21 |
| mz.AntiGrav 1.0 | 3.5 | 12.2% | 8 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.4% | 11 |
| stelo.Randomness 1.0 | 6.3 | 9.0% | 10 |
| alpha.BlackIce 1.0 | 6.7 | 8.6% | 3 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.8% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 4.1% | 0 |
| sample.Corners 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.3 | 23 / 35 | 5051 |
| 2 | 1 | 69.7 | 88.3 | 23 / 35 | 5128 |
| 3 | 1 | 69.2 | 86.7 | 19 / 35 | 5037 |
| 4 | 1 | 70.0 | 86.7 | 23 / 35 | 5228 |
| 5 | 1 | 69.5 | 85.7 | 24 / 35 | 4991 |
| 6 | 1 | 67.8 | 84.8 | 17 / 35 | 4731 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 48 | 81% |
| mz.AntiGrav 1.0 | 35 | 97% |
| kano.gamma.KanoGamma 1.8 | 28 | 89% |
| Polkwane.SmashMelee 1.0 | 14 | 86% |
| stelo.Randomness 1.0 | 10 | 70% |
| alpha.BlackIce 1.0 | 9 | 100% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 23 | 27% | 56 |
| kano.gamma.KanoGamma 1.8 | 16 | 19% | 46 |
| Polkwane.SmashMelee 1.0 | 11 | 13% | 24 |
| stelo.Randomness 1.0 | 11 | 13% | 23 |
| mz.AntiGrav 1.0 | 10 | 12% | 34 |
| alpha.BlackIce 1.0 | 6 | 7% | 13 |
| amk.superstrike.SuperStrike 0.3 | 2 | 2% | 9 |
| testantiswapgun.AntiSwap 1.0 | 2 | 2% | 3 |
| sample.Corners 1.0 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 151028 melee ticks, 37744 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 87 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 87 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 50071 sent, 45120 reached their opponent, 9154 virtual hits (20.3% of those reached).

## Melee bench: F41

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 629 over 6 battles (104.8 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 83.5 | 78 / 210 | 2.48 | 17.2% | 26252 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.3 | 17.2% | 78 |
| eem.EvBotNG v12.8 | 1.7 | 17.0% | 92 |
| ary.Swarm 1.1 | 3.2 | 13.3% | 11 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.4% | 19 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.6% | 7 |
| zyx.nano.Ant 1.1 | 6.5 | 7.8% | 0 |
| shrub.Silver v048 | 6.5 | 8.2% | 2 |
| jsal.Jsalbot 1.0 | 8.5 | 5.9% | 0 |
| stelo.Mirror 1.1 | 8.5 | 5.7% | 1 |
| acogdev.alpha 0.2 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 81.9 | 10 / 35 | 4503 |
| 2 | 2 | 65.0 | 78.1 | 10 / 35 | 4064 |
| 3 | 1 | 66.6 | 81.3 | 13 / 35 | 4356 |
| 4 | 1 | 68.6 | 88.6 | 16 / 35 | 4439 |
| 5 | 1 | 68.7 | 88.6 | 15 / 35 | 4738 |
| 6 | 1 | 66.5 | 82.9 | 14 / 35 | 4152 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 82 | 38% |
| ary.Swarm 1.1 | 33 | 91% |
| lessonz.robocode.Oz 0.5.0 | 17 | 59% |
| simonton.nano.MeleeSeed 1.8 | 4 | 75% |
| stelo.Mirror 1.1 | 2 | 100% |
| shrub.Silver v048 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 69 | 50% | 100 |
| lessonz.robocode.Oz 0.5.0 | 24 | 18% | 37 |
| ary.Swarm 1.1 | 16 | 12% | 31 |
| simonton.nano.MeleeSeed 1.8 | 12 | 9% | 19 |
| shrub.Silver v048 | 4 | 3% | 9 |
| stelo.Mirror 1.1 | 4 | 3% | 7 |
| zyx.nano.Ant 1.1 | 2 | 1% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 150981 melee ticks, 46150 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 72 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 49886 sent, 44910 reached their opponent, 7215 virtual hits (16.1% of those reached).

## Melee bench: F42

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 581 over 6 battles (96.8 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 89.9 | 135 / 210 | 1.91 | 20.0% | 35041 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 20.0% | 135 |
| wompi.Wallaby 5.1 | 2.0 | 15.5% | 41 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.4% | 12 |
| ara.Shera 0.88 | 3.7 | 12.5% | 16 |
| amz.NanoClone 1.41 | 5.2 | 8.7% | 1 |
| dsw.StaticD 1.0 | 6.2 | 7.7% | 4 |
| maribo.IotaCT 1.1 | 6.8 | 6.6% | 0 |
| stelo.MirrorMicro 1.0 | 8.3 | 5.5% | 1 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 92.7 | 25 / 35 | 5878 |
| 2 | 1 | 69.8 | 87.6 | 19 / 35 | 5799 |
| 3 | 1 | 70.6 | 91.7 | 23 / 35 | 5814 |
| 4 | 1 | 72.2 | 95.9 | 26 / 35 | 6269 |
| 5 | 1 | 68.2 | 82.9 | 17 / 35 | 5667 |
| 6 | 1 | 70.1 | 88.6 | 25 / 35 | 5614 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 91 | 86% |
| maribo.mini.MiniQuester 0.1 | 34 | 94% |
| ara.Shera 0.88 | 22 | 77% |
| dsw.StaticD 1.0 | 4 | 100% |
| amz.NanoClone 1.41 | 3 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 0% |

Hadur died in 79 of 210 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 28 | 35% | 104 |
| ara.Shera 0.88 | 25 | 32% | 50 |
| maribo.mini.MiniQuester 0.1 | 12 | 15% | 36 |
| dsw.StaticD 1.0 | 5 | 6% | 9 |
| stelo.MirrorMicro 1.0 | 3 | 4% | 3 |
| amz.NanoClone 1.41 | 1 | 1% | 6 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 163689 melee ticks, 50871 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 594 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 283 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 51919 sent, 47138 reached their opponent, 9450 virtual hits (20.0% of those reached).

## Melee bench: F43

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 709 over 6 battles (118.2 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 77.8 | 35 / 210 | 3.00 | 15.5% | 24184 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.9% | 148 |
| hadur117.Hadur 3.20 | 2.0 | 15.5% | 35 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.4% | 16 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.3% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 10.9% | 2 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.6% | 1 |
| jab.DiamondStealer 5 | 7.3 | 7.7% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 74.6 | 3 / 35 | 3768 |
| 2 | 2 | 67.5 | 84.1 | 8 / 35 | 4318 |
| 3 | 2 | 64.1 | 74.9 | 3 / 35 | 3692 |
| 4 | 2 | 64.6 | 74.0 | 8 / 35 | 4079 |
| 5 | 2 | 65.3 | 79.0 | 5 / 35 | 4135 |
| 6 | 2 | 66.5 | 80.0 | 8 / 35 | 4192 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 68 | 19% |
| brainfade.melee.Dusk 0.44 | 14 | 50% |
| dummy.micro.Sparrow 2.5 | 10 | 60% |
| wcsv.melee.EngineerMelee 0.1 | 7 | 86% |
| Krabb.akim2.Akim2 1.1b | 3 | 67% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 104 | 57% | 120 |
| brainfade.melee.Dusk 0.44 | 25 | 14% | 32 |
| wcsv.melee.EngineerMelee 0.1 | 14 | 8% | 19 |
| dummy.micro.Sparrow 2.5 | 14 | 8% | 19 |
| mz.NanoGod 2.02 | 9 | 5% | 9 |
| Krabb.akim2.Akim2 1.1b | 8 | 4% | 9 |
| jab.DiamondStealer 5 | 1 | 1% | 1 |
| cvt.Firsty 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 157374 melee ticks, 37044 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 35 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 49685 sent, 44622 reached their opponent, 7431 virtual hits (16.7% of those reached).

## Melee bench: F44

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 162 over 6 battles (27.0 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 90.3 | 131 / 210 | 1.87 | 20.3% | 35055 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 20.3% | 131 |
| stelo.Liblix 0.3.1 | 2.2 | 15.3% | 49 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.1% | 17 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.2 | 10.0% | 2 |
| jwirde.Gort 2.0 | 4.8 | 9.4% | 7 |
| disan.Chair 2.2.0 | 6.7 | 7.5% | 1 |
| stf.PanzerGeneral 0.1 | 7.2 | 6.9% | 0 |
| wompi.Quokka 1.6 | 7.2 | 6.8% | 2 |
| sample.Crazy 1.0 | 9.3 | 5.0% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 90.8 | 24 / 35 | 5988 |
| 2 | 1 | 71.6 | 93.3 | 24 / 35 | 6151 |
| 3 | 1 | 71.9 | 93.0 | 25 / 35 | 6222 |
| 4 | 1 | 69.4 | 87.0 | 18 / 35 | 5433 |
| 5 | 1 | 70.8 | 90.8 | 20 / 35 | 5770 |
| 6 | 1 | 69.7 | 87.0 | 20 / 35 | 5491 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 74 | 68% |
| tzu.TheArtOfWar 1.2 | 50 | 88% |
| jwirde.Gort 2.0 | 15 | 87% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 12 | 92% |
| disan.Chair 2.2.0 | 7 | 86% |
| stf.PanzerGeneral 0.1 | 3 | 100% |
| wompi.Quokka 1.6 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 36 | 45% | 88 |
| tzu.TheArtOfWar 1.2 | 24 | 30% | 63 |
| jwirde.Gort 2.0 | 8 | 10% | 23 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 8% | 15 |
| disan.Chair 2.2.0 | 2 | 3% | 7 |
| stf.PanzerGeneral 0.1 | 2 | 3% | 6 |
| wompi.Quokka 1.6 | 1 | 1% | 4 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 206 rounds): 155893 melee ticks, 44849 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 33 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 52892 sent, 48191 reached their opponent, 10174 virtual hits (21.1% of those reached).

## Melee bench: F45

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 452 over 6 battles (75.3 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.1 | 85 / 210 | 2.25 | 19.1% | 33018 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 19.1% | 85 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 12.6% | 92 |
| jje.BagPuss 1.2 | 2.8 | 12.2% | 10 |
| myl.nano.Graviton 1.10 | 4.3 | 10.9% | 4 |
| sul.Lunar 1.1 | 4.7 | 10.5% | 11 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 8.6% | 3 |
| fm.claire 1.7 | 7.0 | 8.5% | 1 |
| hvilela.HVilela 0.9 | 7.2 | 8.3% | 1 |
| wit.Deep7 2.0 | 9.2 | 5.2% | 4 |
| abud.ThirdRobo 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 88.9 | 15 / 35 | 6160 |
| 2 | 1 | 66.9 | 82.9 | 8 / 35 | 5143 |
| 3 | 1 | 69.9 | 89.2 | 17 / 35 | 5647 |
| 4 | 1 | 68.9 | 86.3 | 16 / 35 | 5434 |
| 5 | 1 | 68.3 | 84.8 | 14 / 35 | 5383 |
| 6 | 1 | 68.3 | 84.8 | 15 / 35 | 5251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 78 | 38% |
| jje.BagPuss 1.2 | 20 | 60% |
| sul.Lunar 1.1 | 20 | 90% |
| myl.nano.Graviton 1.10 | 14 | 79% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 82% |
| wit.Deep7 2.0 | 3 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |
| fm.claire 1.7 | 1 | 0% |

Hadur died in 128 of 210 rounds, at a mean tick of 1457. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 50 | 39% | 0 |
| jje.BagPuss 1.2 | 33 | 26% | 74 |
| sul.Lunar 1.1 | 11 | 9% | 44 |
| myl.nano.Graviton 1.10 | 9 | 7% | 33 |
| pez.mini.ChironexFleckeri 0.5 | 8 | 6% | 18 |
| fm.claire 1.7 | 8 | 6% | 16 |
| hvilela.HVilela 0.9 | 5 | 4% | 12 |
| wit.Deep7 2.0 | 1 | 1% | 9 |
| abud.ThirdRobo 1.0 | 0 | 0% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 193592 melee ticks, 95070 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 58 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 59782 sent, 55145 reached their opponent, 8286 virtual hits (15.0% of those reached).

## Melee bench: F46

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 733 over 6 battles (122.2 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 83.6 | 67 / 210 | 2.48 | 16.7% | 25989 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.8 | 16.7% | 58 |
| hadur117.Hadur 3.20 | 2.0 | 16.7% | 67 |
| rsalesc.melee.Medina 0.4.5 | 2.2 | 16.2% | 73 |
| mz.MicroSheep 1.0 | 4.3 | 10.7% | 5 |
| cx.Princess 1.0 | 4.8 | 10.2% | 7 |
| sadoner.killer 0.2 | 5.8 | 9.2% | 0 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.1% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.5% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.7 | 79.7 | 8 / 35 | 4039 |
| 2 | 1 | 67.6 | 87.3 | 15 / 35 | 4358 |
| 3 | 3 | 65.9 | 81.6 | 10 / 35 | 4293 |
| 4 | 3 | 64.2 | 77.5 | 5 / 35 | 4116 |
| 5 | 1 | 67.0 | 85.7 | 15 / 35 | 4379 |
| 6 | 1 | 68.4 | 89.8 | 14 / 35 | 4804 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 73 | 70% |
| rsalesc.melee.Medina 0.4.5 | 43 | 21% |
| cx.Princess 1.0 | 9 | 56% |
| mz.MicroSheep 1.0 | 2 | 0% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 59 | 40% | 74 |
| kc.mini.Mirage 0.2 | 41 | 28% | 87 |
| cx.Princess 1.0 | 13 | 9% | 17 |
| mz.MicroSheep 1.0 | 9 | 6% | 10 |
| sadoner.killer 0.2 | 9 | 6% | 10 |
| arthord.NanoSatanMelee Beta | 6 | 4% | 6 |
| jeremyreeder.collective.Prophet 5 | 5 | 3% | 5 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 153221 melee ticks, 47122 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 46 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 3.

Targeting waves (208 rounds): 45072 sent, 40079 reached their opponent, 5919 virtual hits (14.8% of those reached).

