# Bench suite: suite.txt

## Melee bench: F01

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 70.8 | 24 / 280 | 3.63 | 14.3% | 36516 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.6% | 210 |
| hadur117.micro.SaorD 0.1 | 2.0 | 14.3% | 24 |
| sgp.JollyNinja 3.53 | 3.4 | 11.7% | 20 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 11.1% | 8 |
| mz.MicroGodMelee 1 | 5.1 | 10.3% | 12 |
| lorneswork.Predator 1.0 | 5.4 | 10.2% | 3 |
| adt.Ar2 1.0 | 7.1 | 7.6% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.9% | 3 |
| skm.butterfly 1.0 | 8.8 | 5.1% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 67.3 | 5 / 35 | 5038 |
| 2 | 2 | 63.7 | 76.2 | 1 / 35 | 4855 |
| 3 | 2 | 61.0 | 62.9 | 4 / 35 | 4493 |
| 4 | 2 | 63.7 | 77.1 | 3 / 35 | 4593 |
| 5 | 2 | 62.5 | 73.3 | 3 / 35 | 4274 |
| 6 | 2 | 61.0 | 66.3 | 2 / 35 | 4291 |
| 7 | 2 | 60.9 | 67.0 | 4 / 35 | 4393 |
| 8 | 2 | 63.3 | 76.5 | 2 / 35 | 4579 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 102 | 5% |
| sgp.JollyNinja 3.53 | 16 | 63% |
| mz.MicroGodMelee 1 | 10 | 40% |
| simonton.nano.WeekendObsession_Melee 1.0 | 2 | 50% |
| lorneswork.Predator 1.0 | 2 | 50% |
| skm.butterfly 1.0 | 2 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 0% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 257 of 280 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 154 | 60% | 159 |
| mz.MicroGodMelee 1 | 27 | 11% | 33 |
| sgp.JollyNinja 3.53 | 24 | 9% | 27 |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 8% | 23 |
| lorneswork.Predator 1.0 | 11 | 4% | 15 |
| kawigi.sbf.FloodSonnet 0.9 | 9 | 4% | 9 |
| skm.butterfly 1.0 | 5 | 2% | 7 |
| adt.Ar2 1.0 | 5 | 2% | 6 |
| mym.EdgeStalker 1.0 | 1 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 81.2 | 115 / 280 | 2.69 | 17.5% | 39077 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.1 | 17.5% | 115 |
| pulsar.PulsarMax 0.8.9 | 2.4 | 13.6% | 54 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.1% | 45 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.7% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.1 | 9.7% | 15 |
| fnc.bandit.Bandit 5.2.0 | 6.5 | 8.4% | 0 |
| sch.Simone 0.3d | 7.1 | 8.1% | 20 |
| Noran.BitchingElk 0.054 | 7.5 | 8.1% | 20 |
| stelo.PatternRobot 1.0 | 8.9 | 6.3% | 9 |
| fullsail.SweetTea 1.1 | 9.9 | 4.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 68.3 | 8 / 35 | 4372 |
| 2 | 1 | 69.2 | 88.9 | 18 / 35 | 5303 |
| 3 | 1 | 67.6 | 85.1 | 17 / 35 | 4867 |
| 4 | 1 | 66.8 | 82.9 | 16 / 35 | 5118 |
| 5 | 1 | 67.3 | 85.7 | 17 / 35 | 4678 |
| 6 | 1 | 67.5 | 83.5 | 18 / 35 | 4944 |
| 7 | 1 | 66.1 | 80.3 | 14 / 35 | 5076 |
| 8 | 1 | 63.6 | 74.9 | 7 / 35 | 4719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 57 | 60% |
| pulsar.PulsarMax 0.8.9 | 56 | 52% |
| Noran.BitchingElk 0.054 | 21 | 48% |
| stelo.PatternRobot 1.0 | 13 | 85% |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 73% |
| sch.Simone 0.3d | 10 | 60% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 100% |
| fnc.bandit.Bandit 5.2.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 3 | 100% |

Hadur died in 166 of 280 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 47 | 28% | 81 |
| pulsar.PulsarMax 0.8.9 | 44 | 27% | 65 |
| Noran.BitchingElk 0.054 | 13 | 8% | 29 |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 8% | 29 |
| stelo.PatternRobot 1.0 | 13 | 8% | 19 |
| sch.Simone 0.3d | 12 | 7% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 5% | 18 |
| fnc.bandit.Bandit 5.2.0 | 9 | 5% | 13 |
| fullsail.SweetTea 1.1 | 5 | 3% | 9 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 78.4 | 148 / 280 | 2.94 | 17.5% | 44462 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 17.5% | 148 |
| radnor.DoctorBob 1.42 | 2.0 | 14.3% | 51 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.3% | 33 |
| vuen.Cake 2.51 | 3.5 | 12.7% | 37 |
| urdos.URDOS 1.3 | 5.0 | 10.0% | 3 |
| adt.Ar1 2.1 | 6.4 | 7.8% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 7.1 | 7.4% | 1 |
| oa.weak.FlyMk1 0.1 | 7.9 | 6.6% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.6 | 6.3% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 76.5 | 18 / 35 | 5166 |
| 2 | 1 | 64.2 | 68.6 | 16 / 35 | 5272 |
| 3 | 1 | 64.6 | 74.6 | 12 / 35 | 5224 |
| 4 | 1 | 68.2 | 82.2 | 23 / 35 | 5716 |
| 5 | 1 | 67.3 | 80.6 | 21 / 35 | 5591 |
| 6 | 1 | 66.1 | 77.5 | 20 / 35 | 5375 |
| 7 | 1 | 69.1 | 85.7 | 23 / 35 | 5975 |
| 8 | 1 | 67.2 | 81.6 | 15 / 35 | 6143 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 56 | 80% |
| kawigi.nano.Lib 1.0 | 54 | 89% |
| radnor.DoctorBob 1.42 | 52 | 79% |
| urdos.URDOS 1.3 | 6 | 83% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 67% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| adt.Ar1 2.1 | 2 | 50% |

Hadur died in 132 of 280 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 40 | 30% | 84 |
| vuen.Cake 2.51 | 22 | 17% | 67 |
| kawigi.nano.Lib 1.0 | 20 | 15% | 62 |
| urdos.URDOS 1.3 | 14 | 11% | 19 |
| adt.Ar1 2.1 | 14 | 11% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 8% | 10 |
| ghent.ArthurPanzergon 1.0.0 | 7 | 5% | 8 |
| oa.weak.FlyMk1 0.1 | 3 | 2% | 9 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 1% | 4 |

## Melee bench: F04

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 72.8 | 6 / 280 | 3.45 | 15.1% | 41340 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.2% | 258 |
| hadur117.micro.SaorD 0.1 | 2.1 | 15.1% | 6 |
| apc.LeeroyJenkins2 1.0 | 2.9 | 13.0% | 10 |
| TNT.TNT 0.99.1 | 4.1 | 10.9% | 5 |
| josago.Jorgito 0.16 | 5.0 | 9.4% | 1 |
| css.Delitioner 0.11 | 6.3 | 6.8% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.5% | 0 |
| rampancy.Durandal 2.1d | 7.9 | 5.9% | 0 |
| spin.Bugstard 0.012b | 9.3 | 4.2% | 0 |
| sp.Nanos.Ember 1.1 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.3 | 74.0 | 0 / 35 | 4927 |
| 2 | 2 | 63.0 | 70.5 | 0 / 35 | 4799 |
| 3 | 2 | 64.1 | 70.2 | 0 / 35 | 5150 |
| 4 | 2 | 63.9 | 68.3 | 1 / 35 | 5282 |
| 5 | 2 | 66.3 | 78.7 | 2 / 35 | 5503 |
| 6 | 2 | 64.1 | 71.4 | 3 / 35 | 5028 |
| 7 | 2 | 66.4 | 81.0 | 0 / 35 | 5615 |
| 8 | 2 | 63.1 | 68.3 | 0 / 35 | 5036 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 94 | 3% |
| apc.LeeroyJenkins2 1.0 | 4 | 25% |
| TNT.TNT 0.99.1 | 3 | 33% |
| josago.Jorgito 0.16 | 2 | 50% |

Hadur died in 274 of 280 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 205 | 75% | 209 |
| apc.LeeroyJenkins2 1.0 | 22 | 8% | 23 |
| josago.Jorgito 0.16 | 16 | 6% | 17 |
| TNT.TNT 0.99.1 | 15 | 5% | 15 |
| css.Delitioner 0.11 | 8 | 3% | 8 |
| tj.zombie1n 1.0.1 | 3 | 1% | 3 |
| rampancy.Durandal 2.1d | 3 | 1% | 3 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |

## Melee bench: F05

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 57.6 | 6 / 280 | 4.82 | 11.9% | 30718 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.5 | 18.5% | 158 |
| justin.DemonicRage 3.4 | 1.5 | 17.5% | 87 |
| wompi.Numbat 2.1 | 3.3 | 13.0% | 18 |
| hadur117.micro.SaorD 0.1 | 3.8 | 11.9% | 6 |
| axeBots.HataMoto 3.09 | 5.4 | 9.1% | 4 |
| ms.Ares 0.19 | 5.6 | 8.8% | 7 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.3% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.8% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.6% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.8 | 54.6 | 0 / 35 | 3801 |
| 2 | 4 | 56.8 | 54.9 | 1 / 35 | 3830 |
| 3 | 3 | 59.3 | 59.7 | 3 / 35 | 4105 |
| 4 | 4 | 56.2 | 54.9 | 0 / 35 | 3772 |
| 5 | 4 | 59.2 | 59.4 | 1 / 35 | 4181 |
| 6 | 3 | 59.6 | 62.9 | 0 / 35 | 3968 |
| 7 | 4 | 57.1 | 57.8 | 1 / 35 | 3501 |
| 8 | 4 | 56.3 | 56.5 | 0 / 35 | 3560 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 26 | 0% |
| justin.DemonicRage 3.4 | 20 | 0% |
| wompi.Numbat 2.1 | 8 | 50% |
| ms.Ares 0.19 | 2 | 0% |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 100% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 274 of 280 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 93 | 34% | 93 |
| cb.fire.Firestarter 2.0f | 81 | 30% | 81 |
| wompi.Numbat 2.1 | 40 | 15% | 44 |
| ms.Ares 0.19 | 17 | 6% | 17 |
| axeBots.HataMoto 3.09 | 15 | 5% | 16 |
| supersample.SuperBoxBot 1.0 | 11 | 4% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 10 | 4% | 11 |
| GarmBox.Oranges 1.0 | 4 | 1% | 4 |
| Queens_teamrobot.UltraRazor 1.0 | 3 | 1% | 3 |

## Melee bench: F06

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 71.1 | 109 / 280 | 3.60 | 15.4% | 34253 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.5 | 15.4% | 109 |
| jekl.StoneGhost 0.7 | 1.8 | 15.1% | 53 |
| origin.SleepSiphon 1.7b | 3.3 | 12.9% | 69 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.7% | 21 |
| mld.Wisdom 1.0 | 4.5 | 11.3% | 11 |
| gg.Wolverine 2.0 | 6.0 | 8.5% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 7.3% | 5 |
| DBall.NUKE 0.1 | 8.1 | 7.1% | 2 |
| spinnercat.Omen 1.0 | 8.1 | 7.0% | 0 |
| sample.Fire 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 70.8 | 14 / 35 | 4189 |
| 2 | 1 | 65.9 | 79.4 | 18 / 35 | 4476 |
| 3 | 1 | 62.7 | 72.4 | 11 / 35 | 4213 |
| 4 | 3 | 61.8 | 66.7 | 9 / 35 | 4081 |
| 5 | 1 | 64.6 | 73.0 | 16 / 35 | 4431 |
| 6 | 2 | 60.9 | 64.8 | 10 / 35 | 3988 |
| 7 | 1 | 64.5 | 71.4 | 16 / 35 | 4717 |
| 8 | 1 | 63.2 | 70.5 | 15 / 35 | 4158 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 57 | 79% |
| origin.SleepSiphon 1.7b | 39 | 51% |
| pe.minimelee.SandboxMiniMelee 1.1 | 22 | 86% |
| gg.Wolverine 2.0 | 13 | 69% |
| mld.Wisdom 1.0 | 7 | 71% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 173 of 280 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 40 | 23% | 71 |
| mld.Wisdom 1.0 | 39 | 23% | 47 |
| origin.SleepSiphon 1.7b | 36 | 21% | 63 |
| pe.minimelee.SandboxMiniMelee 1.1 | 29 | 17% | 50 |
| gg.Wolverine 2.0 | 12 | 7% | 18 |
| DBall.NUKE 0.1 | 9 | 5% | 9 |
| sample.Fire 1.0 | 6 | 3% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 11 |
| spinnercat.Omen 1.0 | 1 | 1% | 4 |

## Melee bench: F07

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 83.8 | 91 / 280 | 2.46 | 18.4% | 48075 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.4 | 18.4% | 91 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.6% | 78 |
| rtk.Tachikoma 1.0 | 2.6 | 16.6% | 81 |
| franzor.Lizt 1.3.1 | 4.0 | 11.1% | 20 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 9.8% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.4 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.6 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.4% | 0 |
| sample.Target 1.0 | 9.3 | 3.0% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.9 | 79.4 | 11 / 35 | 5592 |
| 2 | 1 | 70.0 | 86.7 | 13 / 35 | 6008 |
| 3 | 2 | 68.8 | 81.0 | 8 / 35 | 6279 |
| 4 | 1 | 70.3 | 86.7 | 12 / 35 | 6618 |
| 5 | 1 | 69.0 | 82.5 | 10 / 35 | 6098 |
| 6 | 2 | 68.1 | 82.9 | 11 / 35 | 5462 |
| 7 | 1 | 69.5 | 84.8 | 12 / 35 | 6028 |
| 8 | 1 | 69.8 | 86.3 | 14 / 35 | 5990 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 104 | 41% |
| rsalesc.melee.Monk 0.3.6c | 45 | 7% |
| franzor.Lizt 1.3.1 | 31 | 68% |
| oog.melee.CapuletDroid 1.1 | 26 | 88% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 189 of 280 rounds, at a mean tick of 1182. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 78 | 41% | 138 |
| rsalesc.melee.Monk 0.3.6c | 75 | 40% | 100 |
| franzor.Lizt 1.3.1 | 12 | 6% | 4 |
| oog.melee.CapuletDroid 1.1 | 9 | 5% | 13 |
| exauge.GateKeeper 1.1.121g | 9 | 5% | 12 |
| lrem.micro.MoggFanatic 0.2 | 4 | 2% | 8 |
| skm.PateranBotlock2 1.0 | 2 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 3 |

## Melee bench: F08

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 76.1 | 112 / 280 | 3.15 | 17.2% | 42125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 17.2% | 112 |
| tm.Yuugao 1.0 | 2.6 | 13.0% | 60 |
| shrub.Vapour v159 | 2.6 | 12.6% | 45 |
| com.spp.robocode.MostlyHarmless 010 | 4.5 | 10.1% | 22 |
| Krabb.sliNk.Garm 0.9u | 4.8 | 10.2% | 16 |
| m3thos.Eva00 1.1 | 6.0 | 9.3% | 6 |
| jwst.DAD.DarkAndDarker 1.1 | 6.6 | 8.7% | 12 |
| qualidafial.MajorDick 1.0.1 | 7.9 | 7.2% | 4 |
| zyx.nano.BacillusComma 1.0 | 9.4 | 5.8% | 1 |
| SHAM.WOW 1.4 | 9.6 | 5.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 74.6 | 10 / 35 | 5021 |
| 2 | 1 | 68.4 | 84.8 | 17 / 35 | 5590 |
| 3 | 1 | 64.2 | 69.8 | 12 / 35 | 5235 |
| 4 | 1 | 65.2 | 73.0 | 12 / 35 | 5560 |
| 5 | 1 | 68.7 | 86.3 | 20 / 35 | 5455 |
| 6 | 1 | 62.7 | 65.4 | 11 / 35 | 4889 |
| 7 | 1 | 66.3 | 77.5 | 14 / 35 | 5437 |
| 8 | 1 | 65.4 | 77.5 | 16 / 35 | 4938 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 56 | 39% |
| shrub.Vapour v159 | 50 | 68% |
| Krabb.sliNk.Garm 0.9u | 27 | 81% |
| com.spp.robocode.MostlyHarmless 010 | 20 | 60% |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 79% |
| m3thos.Eva00 1.1 | 6 | 83% |
| SHAM.WOW 1.4 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |

Hadur died in 169 of 280 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 55 | 33% | 90 |
| shrub.Vapour v159 | 30 | 18% | 53 |
| com.spp.robocode.MostlyHarmless 010 | 20 | 12% | 36 |
| Krabb.sliNk.Garm 0.9u | 16 | 9% | 30 |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 7% | 19 |
| zyx.nano.BacillusComma 1.0 | 12 | 7% | 18 |
| SHAM.WOW 1.4 | 11 | 7% | 12 |
| qualidafial.MajorDick 1.0.1 | 7 | 4% | 9 |
| m3thos.Eva00 1.1 | 6 | 4% | 11 |

## Melee bench: F09

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 60.7 | 46 / 280 | 4.54 | 13.1% | 31326 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.5% | 141 |
| hadur117.micro.SaorD 0.1 | 2.4 | 13.1% | 46 |
| kc.micro.Figment 1.0 | 3.0 | 12.7% | 39 |
| yagami.Tidus 0.11 | 4.5 | 11.0% | 1 |
| pedersen.Grishnakh 1.0 | 4.5 | 11.1% | 26 |
| mc2.enemy.Original 0.9 | 5.6 | 9.8% | 23 |
| dft.Calliope 5.6 | 7.0 | 8.0% | 3 |
| step.nanoPri 1.0 | 8.4 | 6.2% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.9 | 5.7% | 0 |
| rdm.Dueler 0.4x | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.5 | 61.0 | 5 / 35 | 4110 |
| 2 | 3 | 57.4 | 55.6 | 6 / 35 | 3737 |
| 3 | 2 | 60.3 | 62.2 | 6 / 35 | 4316 |
| 4 | 2 | 59.6 | 63.8 | 6 / 35 | 3646 |
| 5 | 3 | 58.0 | 58.4 | 6 / 35 | 3798 |
| 6 | 2 | 58.8 | 61.3 | 5 / 35 | 4017 |
| 7 | 2 | 57.6 | 59.4 | 5 / 35 | 3648 |
| 8 | 2 | 60.6 | 64.1 | 7 / 35 | 4054 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 43 | 19% |
| kc.micro.Figment 1.0 | 32 | 59% |
| pedersen.Grishnakh 1.0 | 10 | 60% |
| yagami.Tidus 0.11 | 9 | 100% |
| mc2.enemy.Original 0.9 | 7 | 43% |
| dft.Calliope 5.6 | 2 | 50% |

Hadur died in 234 of 280 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 78 | 33% | 91 |
| kc.micro.Figment 1.0 | 77 | 33% | 100 |
| yagami.Tidus 0.11 | 21 | 9% | 26 |
| mc2.enemy.Original 0.9 | 16 | 7% | 19 |
| pedersen.Grishnakh 1.0 | 11 | 5% | 13 |
| robar.nano.Assertive_Melee 0.2 | 11 | 5% | 11 |
| step.nanoPri 1.0 | 8 | 3% | 7 |
| rdm.Dueler 0.4x | 7 | 3% | 6 |
| dft.Calliope 5.6 | 5 | 2% | 7 |

## Melee bench: F10

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 82.5 | 131 / 280 | 2.57 | 17.6% | 41340 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.1 | 17.6% | 131 |
| DTF.Kludgy 1.2b | 2.1 | 14.7% | 69 |
| ne.Chimera 1.2 | 3.5 | 12.8% | 17 |
| ejb.Polaris 1.0.1 | 3.6 | 12.5% | 33 |
| vStar.RAFzilla 2.15 | 5.1 | 10.7% | 10 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.2% | 16 |
| sam.Samspin 1.0 | 7.6 | 6.0% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.8% | 0 |
| kurios.DOSexe .9b | 8.6 | 5.5% | 2 |
| donjezza.Muncho 1.0 | 9.8 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 85.4 | 21 / 35 | 5450 |
| 2 | 1 | 65.3 | 79.0 | 10 / 35 | 4771 |
| 3 | 2 | 65.9 | 78.1 | 13 / 35 | 5137 |
| 4 | 1 | 67.0 | 82.5 | 17 / 35 | 5047 |
| 5 | 1 | 66.8 | 84.4 | 17 / 35 | 4788 |
| 6 | 1 | 68.3 | 86.3 | 21 / 35 | 5496 |
| 7 | 1 | 67.9 | 83.5 | 18 / 35 | 5576 |
| 8 | 1 | 66.3 | 81.0 | 14 / 35 | 5075 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 57 | 63% |
| DTF.Kludgy 1.2b | 55 | 29% |
| ne.Chimera 1.2 | 38 | 84% |
| vStar.RAFzilla 2.15 | 28 | 96% |
| tvv.micro.Antares 1.1.1 | 11 | 82% |
| donjezza.Muncho 1.0 | 5 | 100% |
| kurios.DOSexe .9b | 5 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 150 of 280 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 72 | 48% | 89 |
| ejb.Polaris 1.0.1 | 28 | 19% | 64 |
| ne.Chimera 1.2 | 23 | 15% | 53 |
| tvv.micro.Antares 1.1.1 | 9 | 6% | 21 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 5% | 9 |
| sam.Samspin 1.0 | 6 | 4% | 8 |
| vStar.RAFzilla 2.15 | 2 | 1% | 24 |
| kurios.DOSexe .9b | 2 | 1% | 10 |
| donjezza.Muncho 1.0 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 69.8 | 62 / 280 | 3.72 | 15.0% | 35133 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.4% | 133 |
| hadur117.micro.SaorD 0.1 | 2.0 | 15.0% | 62 |
| cx.mini.Nimrod 0.55 | 3.3 | 11.7% | 25 |
| djc.DynaBot 0.1.1 | 4.0 | 10.6% | 12 |
| br2.MobyDickBot 1.6 | 5.4 | 9.4% | 19 |
| uji.YellohFellah 1.0 | 6.3 | 8.3% | 15 |
| rdt199.Warlord 0.73 | 6.4 | 8.3% | 13 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.7% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 6.0% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 78.7 | 11 / 35 | 4329 |
| 2 | 2 | 61.4 | 67.3 | 8 / 35 | 4397 |
| 3 | 2 | 62.0 | 67.6 | 9 / 35 | 4389 |
| 4 | 2 | 62.7 | 69.8 | 10 / 35 | 4572 |
| 5 | 2 | 60.8 | 64.4 | 4 / 35 | 4342 |
| 6 | 2 | 62.2 | 67.9 | 6 / 35 | 4444 |
| 7 | 2 | 63.9 | 74.3 | 6 / 35 | 4761 |
| 8 | 2 | 61.3 | 68.3 | 8 / 35 | 3899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 71 | 25% |
| cx.mini.Nimrod 0.55 | 20 | 55% |
| uji.YellohFellah 1.0 | 13 | 62% |
| djc.DynaBot 0.1.1 | 13 | 85% |
| br2.MobyDickBot 1.6 | 12 | 58% |
| rdt199.Warlord 0.73 | 8 | 75% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 218 of 280 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 106 | 49% | 124 |
| cx.mini.Nimrod 0.55 | 37 | 17% | 45 |
| djc.DynaBot 0.1.1 | 14 | 6% | 23 |
| jeremyreeder.Vincent 2011.12.09 | 14 | 6% | 14 |
| rdt199.Warlord 0.73 | 11 | 5% | 18 |
| uji.YellohFellah 1.0 | 11 | 5% | 17 |
| br2.MobyDickBot 1.6 | 10 | 5% | 18 |
| stelo.MirrorNano 1.3 | 8 | 4% | 8 |
| KiraNL.Chupacabra 0.4 | 7 | 3% | 12 |

## Melee bench: F12

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 75.6 | 105 / 280 | 3.20 | 15.8% | 30495 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.4 | 15.8% | 105 |
| bts.wiki.RipCurl 0.9b | 2.3 | 14.3% | 66 |
| nat.PallasHawk 1.0 | 2.8 | 13.2% | 44 |
| darkcanuck.Leon 1.01 | 3.6 | 12.5% | 33 |
| brainfade.melee.Genghis 0.36 | 5.1 | 10.2% | 25 |
| jrm.Test0 1.0 | 6.3 | 8.4% | 1 |
| cs.sheldor.Talon 1.1 | 7.4 | 7.3% | 3 |
| jp.Perpy 16.0 | 7.8 | 7.0% | 1 |
| jaybot.bots.Oddball 4.0 | 9.1 | 5.3% | 2 |
| stuff.Vlad 0.1 | 9.4 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.8 | 69.5 | 13 / 35 | 3594 |
| 2 | 1 | 64.0 | 74.9 | 13 / 35 | 3941 |
| 3 | 1 | 65.2 | 81.0 | 17 / 35 | 3634 |
| 4 | 1 | 65.6 | 79.4 | 16 / 35 | 4152 |
| 5 | 1 | 64.0 | 77.8 | 14 / 35 | 3559 |
| 6 | 2 | 62.9 | 74.3 | 10 / 35 | 3625 |
| 7 | 3 | 60.5 | 65.7 | 6 / 35 | 3860 |
| 8 | 1 | 66.6 | 82.2 | 16 / 35 | 4130 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 48 | 71% |
| bts.wiki.RipCurl 0.9b | 42 | 52% |
| darkcanuck.Leon 1.01 | 29 | 93% |
| brainfade.melee.Genghis 0.36 | 20 | 55% |
| jrm.Test0 1.0 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 33% |
| jp.Perpy 16.0 | 2 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 178 of 280 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 63 | 35% | 87 |
| nat.PallasHawk 1.0 | 39 | 22% | 73 |
| darkcanuck.Leon 1.01 | 25 | 14% | 58 |
| brainfade.melee.Genghis 0.36 | 21 | 12% | 22 |
| jrm.Test0 1.0 | 13 | 7% | 13 |
| jp.Perpy 16.0 | 7 | 4% | 9 |
| jaybot.bots.Oddball 4.0 | 4 | 2% | 9 |
| stuff.Vlad 0.1 | 4 | 2% | 4 |
| cs.sheldor.Talon 1.1 | 2 | 1% | 4 |

## Melee bench: F13

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 62.7 | 14 / 280 | 4.35 | 12.7% | 31478 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.4 | 17.0% | 65 |
| mn.Combat 3.25.0 | 1.6 | 17.1% | 143 |
| hadur117.micro.SaorD 0.1 | 3.3 | 12.7% | 14 |
| shinh.Entangled 0.3 | 4.4 | 12.0% | 35 |
| gh.micro.Gruweltje 0.7 | 4.4 | 11.9% | 22 |
| apc.Colossus2 0.17 | 6.0 | 8.4% | 0 |
| stelo.Wang 1.0 | 7.0 | 7.1% | 1 |
| ayk.WallHugger 1.0 | 8.3 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.2 | 65.1 | 1 / 35 | 3939 |
| 2 | 3 | 58.9 | 64.4 | 0 / 35 | 3915 |
| 3 | 3 | 61.3 | 68.6 | 1 / 35 | 4172 |
| 4 | 3 | 61.7 | 69.5 | 4 / 35 | 3987 |
| 5 | 3 | 60.0 | 65.1 | 3 / 35 | 3978 |
| 6 | 3 | 57.3 | 55.6 | 2 / 35 | 3887 |
| 7 | 3 | 58.9 | 59.7 | 1 / 35 | 3966 |
| 8 | 5 | 56.2 | 54.0 | 2 / 35 | 3634 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 29 | 7% |
| mn.Combat 3.25.0 | 28 | 18% |
| shinh.Entangled 0.3 | 8 | 25% |
| gh.micro.Gruweltje 0.7 | 8 | 50% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 266 of 280 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 96 | 36% | 99 |
| mn.Combat 3.25.0 | 71 | 27% | 74 |
| shinh.Entangled 0.3 | 35 | 13% | 36 |
| gh.micro.Gruweltje 0.7 | 27 | 10% | 34 |
| stelo.Wang 1.0 | 14 | 5% | 14 |
| maribo.FollowFire 1 | 12 | 5% | 13 |
| ayk.WallHugger 1.0 | 7 | 3% | 5 |
| apc.Colossus2 0.17 | 3 | 1% | 4 |
| sample.Tracker 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 74.8 | 142 / 280 | 3.27 | 16.8% | 39899 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.3 | 16.8% | 142 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.1% | 50 |
| catcat20.shape.Theta 0.018 | 2.8 | 13.3% | 62 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 9.7% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.6% | 3 |
| co.edu.usb.rc.LidisTron 1.0 | 5.6 | 9.7% | 5 |
| sanyi.mikrobi.Roberto 1.0 | 5.8 | 9.4% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.9 | 7.9% | 10 |
| pa.Improved 1.0 | 9.0 | 6.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 67.9 | 14 / 35 | 4530 |
| 2 | 1 | 68.2 | 81.3 | 22 / 35 | 5208 |
| 3 | 1 | 65.4 | 72.7 | 20 / 35 | 4614 |
| 4 | 1 | 64.1 | 71.4 | 13 / 35 | 4861 |
| 5 | 1 | 69.2 | 84.1 | 24 / 35 | 5628 |
| 6 | 1 | 63.6 | 68.6 | 18 / 35 | 4578 |
| 7 | 2 | 66.1 | 74.3 | 14 / 35 | 5143 |
| 8 | 1 | 66.6 | 78.1 | 17 / 35 | 5337 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 96 | 86% |
| catcat20.shape.Theta 0.018 | 55 | 51% |
| co.edu.usb.rc.LidisTron 1.0 | 12 | 83% |
| sanyi.mikrobi.Roberto 1.0 | 10 | 80% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 75% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 138 of 280 rounds, at a mean tick of 662. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 48 | 35% | 124 |
| catcat20.shape.Theta 0.018 | 39 | 28% | 65 |
| sanyi.mikrobi.Roberto 1.0 | 12 | 9% | 25 |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 8% | 18 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 7% | 18 |
| sample.TrackFire 1.0 | 6 | 4% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 4% | 9 |
| pa.Improved 1.0 | 5 | 4% | 5 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 2% | 5 |

## Melee bench: F15

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 84.3 | 158 / 280 | 2.41 | 19.2% | 46070 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 19.2% | 158 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.7% | 19 |
| emp.Yngwie 1.11 | 3.0 | 12.9% | 56 |
| mld.DustBunny 3.8 | 3.9 | 11.7% | 12 |
| kawigi.robot.Girl 1.2 | 5.4 | 9.4% | 21 |
| cb.nano.Insomnia 1.0 | 5.6 | 9.1% | 9 |
| lambdaxy.TBot 0.1 | 7.4 | 6.9% | 0 |
| Grystrion.TrackerWO 1.0 | 7.6 | 7.0% | 1 |
| divineomega.TrialBot 0.003 | 9.0 | 5.5% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.9 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 87.0 | 23 / 35 | 6086 |
| 2 | 1 | 68.9 | 82.2 | 21 / 35 | 5798 |
| 3 | 1 | 68.8 | 87.6 | 16 / 35 | 5495 |
| 4 | 1 | 70.1 | 86.3 | 20 / 35 | 6257 |
| 5 | 1 | 68.7 | 83.8 | 24 / 35 | 5316 |
| 6 | 1 | 67.7 | 80.0 | 19 / 35 | 5617 |
| 7 | 1 | 67.6 | 80.6 | 15 / 35 | 5635 |
| 8 | 1 | 69.5 | 86.7 | 20 / 35 | 5866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 73 | 52% |
| kawigi.micro.Shiz 1.1 | 68 | 96% |
| mld.DustBunny 3.8 | 24 | 100% |
| kawigi.robot.Girl 1.2 | 21 | 71% |
| cb.nano.Insomnia 1.0 | 13 | 85% |
| lambdaxy.TBot 0.1 | 4 | 100% |
| divineomega.TrialBot 0.003 | 1 | 100% |

Hadur died in 122 of 280 rounds, at a mean tick of 987. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 53 | 43% | 107 |
| kawigi.robot.Girl 1.2 | 18 | 15% | 34 |
| cb.nano.Insomnia 1.0 | 15 | 12% | 12 |
| mld.DustBunny 3.8 | 11 | 9% | 41 |
| kawigi.micro.Shiz 1.1 | 10 | 8% | 58 |
| Grystrion.TrackerWO 1.0 | 6 | 5% | 8 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 4 | 3% | 4 |
| divineomega.TrialBot 0.003 | 3 | 2% | 12 |
| lambdaxy.TBot 0.1 | 2 | 2% | 2 |

## Melee bench: F16

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 80.3 | 86 / 280 | 2.77 | 17.6% | 42930 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.5 | 17.6% | 86 |
| gh.Griezel 0.5.2 | 1.5 | 17.0% | 121 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.3% | 5 |
| techdude.forest.FlamingForest 1.1 | 4.1 | 11.0% | 47 |
| tvv.nano.Polaris 1.2 | 5.4 | 9.3% | 9 |
| bvh.fnr.Fenrir 0.36l | 5.6 | 9.1% | 5 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 7.6% | 3 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.2% | 4 |
| asd.Cthulhu 1.3 | 9.0 | 5.0% | 0 |
| repositorio.NanoStep 1.0 | 9.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 86.0 | 13 / 35 | 6026 |
| 2 | 1 | 68.4 | 82.2 | 11 / 35 | 5690 |
| 3 | 2 | 66.7 | 79.7 | 8 / 35 | 5486 |
| 4 | 2 | 66.4 | 79.4 | 13 / 35 | 5048 |
| 5 | 2 | 65.6 | 75.2 | 11 / 35 | 4917 |
| 6 | 2 | 63.0 | 70.8 | 8 / 35 | 4648 |
| 7 | 1 | 68.1 | 84.1 | 10 / 35 | 5518 |
| 8 | 1 | 68.3 | 85.1 | 12 / 35 | 5597 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 105 | 18% |
| techdude.forest.FlamingForest 1.1 | 38 | 50% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 23 | 100% |
| bvh.fnr.Fenrir 0.36l | 12 | 92% |
| tvv.nano.Polaris 1.2 | 10 | 90% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |
| stelo.IntrinsicVolatility 1.4 | 2 | 100% |

Hadur died in 195 of 280 rounds, at a mean tick of 1405. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 105 | 54% | 131 |
| techdude.forest.FlamingForest 1.1 | 26 | 13% | 48 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 9% | 31 |
| bvh.fnr.Fenrir 0.36l | 15 | 8% | 19 |
| stelo.IntrinsicVolatility 1.4 | 11 | 6% | 15 |
| tvv.nano.Polaris 1.2 | 10 | 5% | 17 |
| asd.Cthulhu 1.3 | 7 | 4% | 7 |
| divineomega.DivineBot 1.9.4.5 | 4 | 2% | 11 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |

## Melee bench: F17

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 79.6 | 120 / 280 | 2.84 | 17.2% | 37941 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 17.2% | 120 |
| oog.melee.Mercutio 1.0 | 2.5 | 13.1% | 48 |
| cx.BlestPain 1.41 | 3.4 | 12.4% | 48 |
| et.Predator 1.8 | 3.4 | 12.6% | 29 |
| nic.Nicator 2.4 | 4.9 | 11.3% | 21 |
| ahf.NanoAndrew .4 | 6.0 | 10.3% | 12 |
| maribo.melee.BMV 0.1 | 6.9 | 8.6% | 3 |
| tex.Longbot 0.4 | 8.3 | 6.1% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.8 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 82.9 | 15 / 35 | 5210 |
| 2 | 1 | 68.4 | 86.7 | 20 / 35 | 4727 |
| 3 | 1 | 67.0 | 77.8 | 17 / 35 | 5199 |
| 4 | 1 | 62.5 | 68.6 | 10 / 35 | 4048 |
| 5 | 1 | 65.1 | 75.6 | 14 / 35 | 4590 |
| 6 | 1 | 66.1 | 79.7 | 14 / 35 | 4441 |
| 7 | 1 | 67.3 | 83.2 | 13 / 35 | 5023 |
| 8 | 1 | 66.9 | 82.2 | 17 / 35 | 4703 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 51 | 73% |
| et.Predator 1.8 | 49 | 76% |
| cx.BlestPain 1.41 | 34 | 47% |
| nic.Nicator 2.4 | 23 | 65% |
| ahf.NanoAndrew .4 | 12 | 92% |
| maribo.melee.BMV 0.1 | 4 | 75% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 161 of 280 rounds, at a mean tick of 969. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 39 | 24% | 55 |
| oog.melee.Mercutio 1.0 | 33 | 20% | 65 |
| et.Predator 1.8 | 30 | 19% | 70 |
| nic.Nicator 2.4 | 24 | 15% | 37 |
| ahf.NanoAndrew .4 | 17 | 11% | 31 |
| maribo.melee.BMV 0.1 | 9 | 6% | 10 |
| goblin.Bender 2.4 | 4 | 2% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 2% | 6 |
| tex.Longbot 0.4 | 2 | 1% | 2 |

## Melee bench: F18

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 80.0 | 149 / 280 | 2.80 | 17.3% | 34842 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 17.3% | 149 |
| morbid.MorbidPriest 1.0 | 2.1 | 13.3% | 41 |
| agd.Mooserwirt2 2.7 | 2.9 | 11.9% | 37 |
| ratosh.Nobo 0.21 | 4.6 | 10.4% | 5 |
| uji.DBH 1.1 | 4.8 | 10.7% | 16 |
| spinnercat.Robovirus 2.718 | 6.1 | 9.5% | 11 |
| sigterm.Sigterm 1.0 | 7.0 | 8.4% | 14 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.2% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.9 | 6.0% | 0 |
| stelo.WangRobot 1.0 | 9.6 | 5.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 79.0 | 18 / 35 | 4293 |
| 2 | 1 | 66.3 | 81.3 | 20 / 35 | 4067 |
| 3 | 1 | 68.0 | 86.7 | 23 / 35 | 4584 |
| 4 | 1 | 65.5 | 78.7 | 16 / 35 | 4665 |
| 5 | 1 | 64.9 | 77.5 | 19 / 35 | 4011 |
| 6 | 1 | 65.2 | 74.0 | 20 / 35 | 4441 |
| 7 | 1 | 66.2 | 81.3 | 17 / 35 | 4596 |
| 8 | 1 | 65.3 | 81.3 | 16 / 35 | 4185 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 54 | 81% |
| agd.Mooserwirt2 2.7 | 46 | 54% |
| uji.DBH 1.1 | 29 | 83% |
| sigterm.Sigterm 1.0 | 21 | 95% |
| spinnercat.Robovirus 2.718 | 17 | 65% |
| ratosh.Nobo 0.21 | 10 | 90% |
| stelo.WangRobot 1.0 | 9 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 100% |

Hadur died in 132 of 280 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 38 | 29% | 73 |
| morbid.MorbidPriest 1.0 | 31 | 23% | 81 |
| uji.DBH 1.1 | 13 | 10% | 24 |
| spinnercat.Robovirus 2.718 | 11 | 8% | 24 |
| ratosh.Nobo 0.21 | 10 | 8% | 22 |
| kawigi.mini.Fhqwhgads 1.1 | 9 | 7% | 16 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9 | 7% | 11 |
| sigterm.Sigterm 1.0 | 7 | 5% | 18 |
| stelo.WangRobot 1.0 | 4 | 3% | 11 |

## Melee bench: F19

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 91.9 | 216 / 280 | 1.73 | 20.6% | 45546 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 20.6% | 216 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.4% | 20 |
| mld.Infinity 2.2 | 2.8 | 14.1% | 34 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 10.7% | 5 |
| erdnis.Rover 0.3 | 4.8 | 10.5% | 2 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.8% | 1 |
| mbh.Mbh 0.1 | 7.4 | 7.2% | 0 |
| pac.ABC 2.1 | 7.6 | 6.9% | 2 |
| pbg.R2D2 1.0 | 9.0 | 5.8% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 92.7 | 27 / 35 | 5773 |
| 2 | 1 | 72.3 | 93.0 | 31 / 35 | 6036 |
| 3 | 1 | 72.3 | 94.3 | 27 / 35 | 6151 |
| 4 | 1 | 69.7 | 86.3 | 23 / 35 | 5009 |
| 5 | 1 | 71.6 | 91.7 | 25 / 35 | 5799 |
| 6 | 1 | 71.2 | 91.4 | 27 / 35 | 5653 |
| 7 | 1 | 71.6 | 92.7 | 27 / 35 | 5642 |
| 8 | 1 | 71.5 | 92.7 | 29 / 35 | 5483 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 104 | 92% |
| mld.Infinity 2.2 | 94 | 88% |
| krillr.mini.JointStrike 2.0.0 | 14 | 79% |
| erdnis.Rover 0.3 | 11 | 91% |
| pac.ABC 2.1 | 9 | 100% |
| patson.PatsonTestBot 1.0 | 5 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 65 of 280 rounds, at a mean tick of 1043. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 23 | 35% | 32 |
| davidalves.net.DuelistMiniMelee 1.2 | 19 | 29% | 137 |
| erdnis.Rover 0.3 | 8 | 12% | 32 |
| krillr.mini.JointStrike 2.0.0 | 7 | 11% | 30 |
| patson.PatsonTestBot 1.0 | 4 | 6% | 16 |
| pbg.R2D2 1.0 | 2 | 3% | 11 |
| pac.ABC 2.1 | 2 | 3% | 7 |
| mbh.Mbh 0.1 | 0 | 0% | 9 |

## Melee bench: F20

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.5 | 152 / 280 | 2.13 | 19.3% | 44368 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 19.3% | 152 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.7% | 61 |
| fwb.Nine 1.0.1 | 3.4 | 11.3% | 36 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 10.5% | 5 |
| catcat20.Rabbit 0.001 | 5.3 | 9.3% | 21 |
| m3thos.mini.Eva01 0.5.5 | 5.8 | 8.6% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.1 | 7.6% | 2 |
| bayen.nut.Squirrel 1.615 | 7.9 | 7.3% | 3 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 6.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.6 | 18 / 35 | 5628 |
| 2 | 1 | 71.4 | 95.2 | 23 / 35 | 6128 |
| 3 | 1 | 69.4 | 89.2 | 19 / 35 | 5554 |
| 4 | 1 | 68.7 | 86.7 | 19 / 35 | 5188 |
| 5 | 1 | 68.6 | 82.5 | 19 / 35 | 5664 |
| 6 | 1 | 69.8 | 90.8 | 19 / 35 | 5299 |
| 7 | 1 | 69.6 | 88.3 | 18 / 35 | 5725 |
| 8 | 1 | 66.9 | 79.4 | 17 / 35 | 5182 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 103 | 65% |
| fwb.Nine 1.0.1 | 61 | 62% |
| catcat20.Rabbit 0.001 | 20 | 55% |
| nz.jdc.nano.GridFu 1.0 | 19 | 95% |
| bayen.nut.Squirrel 1.615 | 6 | 83% |
| djdjdj.NanoSkunk10 1.0 | 6 | 67% |
| m3thos.mini.Eva01 0.5.5 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 129 of 280 rounds, at a mean tick of 1188. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 63 | 49% | 132 |
| fwb.Nine 1.0.1 | 30 | 23% | 17 |
| catcat20.Rabbit 0.001 | 16 | 12% | 40 |
| nz.jdc.nano.GridFu 1.0 | 6 | 5% | 39 |
| bayen.nut.Squirrel 1.615 | 5 | 4% | 11 |
| ntc.ControlledChaos 1.1.4 | 4 | 3% | 7 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 13 |
| m3thos.mini.Eva01 0.5.5 | 2 | 2% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 10 |

## Melee bench: F21

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.5 | 137 / 280 | 2.49 | 18.4% | 42362 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 18.4% | 137 |
| eem.EvBot v4.6.16 | 2.0 | 16.4% | 113 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.9% | 17 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.8% | 5 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.2% | 2 |
| eld.Hmm 1.0 | 5.6 | 7.9% | 7 |
| el.JumpShoot 0.2 | 7.6 | 6.6% | 0 |
| fire219.CatBot 1.0 | 7.6 | 6.8% | 0 |
| PSW.Relentless 0.1 | 8.9 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 74.3 | 15 / 35 | 5038 |
| 2 | 1 | 70.0 | 91.4 | 23 / 35 | 5089 |
| 3 | 1 | 68.9 | 84.8 | 14 / 35 | 5682 |
| 4 | 1 | 69.0 | 85.4 | 17 / 35 | 5147 |
| 5 | 1 | 68.7 | 84.1 | 15 / 35 | 5835 |
| 6 | 1 | 67.4 | 82.2 | 16 / 35 | 5288 |
| 7 | 1 | 67.6 | 81.9 | 19 / 35 | 4888 |
| 8 | 1 | 68.4 | 83.5 | 18 / 35 | 5395 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 122 | 44% |
| dummy.mini.Scimitar 1.01 | 42 | 90% |
| cf.RiO.RiOx 4.2.1 | 25 | 100% |
| eld.Hmm 1.0 | 10 | 90% |
| oa.weak.BotherBot 0.1 | 6 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 145 of 280 rounds, at a mean tick of 1124. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 86 | 59% | 123 |
| dummy.mini.Scimitar 1.01 | 19 | 13% | 64 |
| cf.RiO.RiOx 4.2.1 | 11 | 8% | 27 |
| fire219.CatBot 1.0 | 7 | 5% | 7 |
| oa.weak.BotherBot 0.1 | 6 | 4% | 15 |
| eld.Hmm 1.0 | 5 | 3% | 25 |
| el.JumpShoot 0.2 | 4 | 3% | 8 |
| PSW.Relentless 0.1 | 4 | 3% | 4 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |
2 death(s) with no robot to name.

## Melee bench: F23

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 79.6 | 120 / 280 | 2.84 | 18.0% | 44432 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.1 | 18.0% | 120 |
| pe.SandboxLump 1.52 | 1.9 | 17.3% | 95 |
| cre.Karolos 0.32 | 3.0 | 13.5% | 40 |
| stelo.AreaTargetingBot 1.1 | 4.9 | 10.1% | 9 |
| stelo.RamTrackSurfer 1.2 | 5.0 | 9.7% | 10 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.6 | 9.2% | 1 |
| cw.megas.Blade 0.8 | 6.9 | 8.6% | 2 |
| sample.Walls 1.0 | 7.6 | 7.8% | 3 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.8% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 80.0 | 17 / 35 | 5495 |
| 2 | 1 | 68.4 | 80.6 | 15 / 35 | 5448 |
| 3 | 2 | 66.9 | 73.7 | 15 / 35 | 5476 |
| 4 | 1 | 68.5 | 79.0 | 15 / 35 | 5497 |
| 5 | 1 | 68.4 | 79.4 | 15 / 35 | 5953 |
| 6 | 1 | 68.5 | 80.6 | 15 / 35 | 5427 |
| 7 | 1 | 67.8 | 80.0 | 14 / 35 | 5372 |
| 8 | 1 | 69.5 | 83.2 | 14 / 35 | 5764 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 107 | 55% |
| cre.Karolos 0.32 | 33 | 67% |
| stelo.AreaTargetingBot 1.1 | 19 | 74% |
| stelo.RamTrackSurfer 1.2 | 13 | 85% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 11 | 91% |
| sample.Walls 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 160 of 280 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 84 | 53% | 144 |
| cre.Karolos 0.32 | 31 | 19% | 56 |
| stelo.AreaTargetingBot 1.1 | 14 | 9% | 26 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 13 | 8% | 20 |
| stelo.RamTrackSurfer 1.2 | 8 | 5% | 18 |
| cw.megas.Blade 0.8 | 5 | 3% | 7 |
| sample.Walls 1.0 | 4 | 3% | 6 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F24

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 68.4 | 60 / 280 | 3.84 | 14.3% | 31704 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.9 | 14.2% | 69 |
| hadur117.micro.SaorD 0.1 | 2.3 | 14.3% | 60 |
| florent.XSeries.X2 0.12 | 2.5 | 14.2% | 53 |
| davidalves.Phoenix 0.54 | 3.6 | 12.6% | 56 |
| pedersen.Ugluk 1.1.1 | 5.0 | 11.0% | 22 |
| oog.melee.Corsair 1.0 | 5.8 | 10.0% | 14 |
| lunchie.Lunchbox 0.93 | 7.5 | 6.5% | 1 |
| stelo.SoJNanoMelee 1.1 | 7.6 | 6.8% | 3 |
| as.FrankTheTank 1.3 | 9.0 | 5.5% | 2 |
| evd.X1 0.01 | 9.9 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.3 | 66.0 | 8 / 35 | 3801 |
| 2 | 3 | 57.8 | 59.4 | 6 / 35 | 3627 |
| 3 | 4 | 60.4 | 65.4 | 5 / 35 | 3926 |
| 4 | 1 | 62.3 | 72.7 | 7 / 35 | 4208 |
| 5 | 1 | 64.6 | 79.4 | 13 / 35 | 4063 |
| 6 | 2 | 61.5 | 65.4 | 6 / 35 | 4371 |
| 7 | 2 | 62.3 | 71.4 | 6 / 35 | 4136 |
| 8 | 2 | 61.0 | 67.6 | 9 / 35 | 3572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 37 | 51% |
| davidalves.Phoenix 0.54 | 29 | 34% |
| florent.XSeries.X2 0.12 | 29 | 45% |
| pedersen.Ugluk 1.1.1 | 13 | 69% |
| oog.melee.Corsair 1.0 | 10 | 50% |
| stelo.SoJNanoMelee 1.1 | 3 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 220 of 280 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 58 | 26% | 70 |
| davidalves.Phoenix 0.54 | 53 | 24% | 61 |
| rz.GlowBlowMelee 1.4 | 37 | 17% | 54 |
| oog.melee.Corsair 1.0 | 24 | 11% | 39 |
| pedersen.Ugluk 1.1.1 | 23 | 10% | 26 |
| evd.X1 0.01 | 11 | 5% | 12 |
| as.FrankTheTank 1.3 | 7 | 3% | 10 |
| stelo.SoJNanoMelee 1.1 | 5 | 2% | 6 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 2 |

## Melee bench: F25

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.0 | 183 / 280 | 2.35 | 18.6% | 35151 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 18.6% | 183 |
| voidious.mini.BrokenSword 2.0.3 | 2.6 | 12.9% | 33 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.7% | 19 |
| jdw.Hurricane 1.4 | 3.6 | 11.5% | 15 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.6% | 11 |
| ds.Oo 2.2 | 5.8 | 9.1% | 9 |
| gjr.Cephalosporin 0.1 | 7.5 | 7.7% | 8 |
| awesomeness.Elite 1.0 | 8.3 | 6.7% | 1 |
| adt.Ar2 1.1 | 8.4 | 6.5% | 1 |
| amk.ChumbaMini 0.2 | 9.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 89.2 | 25 / 35 | 3995 |
| 2 | 1 | 68.4 | 85.1 | 27 / 35 | 4481 |
| 3 | 1 | 67.7 | 82.9 | 23 / 35 | 4325 |
| 4 | 1 | 68.8 | 88.3 | 24 / 35 | 4597 |
| 5 | 1 | 67.2 | 81.0 | 21 / 35 | 4362 |
| 6 | 1 | 67.9 | 83.5 | 24 / 35 | 4285 |
| 7 | 1 | 66.2 | 79.7 | 17 / 35 | 4263 |
| 8 | 1 | 69.4 | 90.5 | 22 / 35 | 4843 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 64 | 92% |
| voidious.mini.BrokenSword 2.0.3 | 58 | 86% |
| jdw.Hurricane 1.4 | 36 | 94% |
| gjr.Cephalosporin 0.1 | 13 | 92% |
| gre.svman4.Morfeas 1.4.1 | 13 | 92% |
| ds.Oo 2.2 | 10 | 100% |
| adt.Ar2 1.1 | 4 | 75% |
| amk.ChumbaMini 0.2 | 2 | 100% |
| awesomeness.Elite 1.0 | 1 | 100% |

Hadur died in 98 of 280 rounds, at a mean tick of 561. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 24 | 24% | 70 |
| jdw.Hurricane 1.4 | 17 | 17% | 54 |
| voidious.micro.BlitzBat 1.05 | 16 | 16% | 60 |
| ds.Oo 2.2 | 15 | 15% | 33 |
| gre.svman4.Morfeas 1.4.1 | 11 | 11% | 26 |
| awesomeness.Elite 1.0 | 5 | 5% | 8 |
| adt.Ar2 1.1 | 4 | 4% | 8 |
| gjr.Cephalosporin 0.1 | 3 | 3% | 14 |
| amk.ChumbaMini 0.2 | 3 | 3% | 3 |

## Melee bench: F26

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 78.2 | 96 / 280 | 2.96 | 16.7% | 41458 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.1 | 16.7% | 96 |
| ak.Fermat 2.0 | 1.9 | 15.5% | 80 |
| shu.nitro.LENIN .T34 | 3.4 | 12.1% | 46 |
| lrem.Spectre 0.4.4 | 3.9 | 12.1% | 34 |
| js.PinBall 1.6 | 5.1 | 10.7% | 12 |
| gh.mini.GrubbmOne 1.0 | 6.3 | 9.7% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 6.4 | 9.3% | 6 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.9% | 4 |
| sample.SpinBot 1.0 | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 69.5 | 12 / 35 | 4874 |
| 2 | 1 | 64.1 | 76.5 | 9 / 35 | 4608 |
| 3 | 1 | 65.5 | 75.6 | 10 / 35 | 5379 |
| 4 | 1 | 66.1 | 77.8 | 11 / 35 | 5408 |
| 5 | 1 | 69.0 | 85.1 | 16 / 35 | 6010 |
| 6 | 1 | 67.9 | 85.1 | 15 / 35 | 5238 |
| 7 | 1 | 67.2 | 81.9 | 14 / 35 | 5177 |
| 8 | 1 | 63.9 | 74.3 | 9 / 35 | 4764 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 65 | 35% |
| shu.nitro.LENIN .T34 | 57 | 53% |
| lrem.Spectre 0.4.4 | 41 | 66% |
| js.PinBall 1.6 | 8 | 63% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 83% |
| gh.mini.GrubbmOne 1.0 | 5 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 0% |

Hadur died in 185 of 280 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 82 | 44% | 103 |
| shu.nitro.LENIN .T34 | 37 | 20% | 69 |
| lrem.Spectre 0.4.4 | 23 | 12% | 41 |
| js.PinBall 1.6 | 15 | 8% | 21 |
| jaybot.adv.bots.JayBot 2.0 | 11 | 6% | 19 |
| fullsail.LaxativeTeaTwo 1.0 | 8 | 4% | 11 |
| sample.SpinBot 1.0 | 5 | 3% | 6 |
| gh.mini.GrubbmOne 1.0 | 4 | 2% | 9 |

## Melee bench: F27

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 81.2 | 162 / 280 | 2.69 | 17.8% | 36648 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.5 | 17.8% | 162 |
| mk.Alpha 0.2.1 | 1.9 | 14.5% | 75 |
| wee.Gem 1.8.4 | 3.4 | 11.4% | 21 |
| EH.Eagle 1.0.6 | 4.3 | 10.5% | 6 |
| sheldor.melee.nano.TestMelee 0.1 | 4.5 | 10.1% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 6.1 | 8.8% | 2 |
| joe.ADinosaur 1.0 | 7.3 | 7.8% | 2 |
| throxbot.ThroxBot 0.1 | 7.8 | 7.8% | 2 |
| caimano.Furia_Ceca 0.22 | 8.9 | 6.1% | 1 |
| cs.Grudge 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.0 | 40.3 | 7 / 35 | 3643 |
| 2 | 1 | 68.1 | 85.7 | 23 / 35 | 4689 |
| 3 | 1 | 68.3 | 84.8 | 22 / 35 | 4661 |
| 4 | 1 | 67.2 | 83.5 | 20 / 35 | 4602 |
| 5 | 1 | 68.8 | 89.8 | 21 / 35 | 4814 |
| 6 | 1 | 69.4 | 90.2 | 26 / 35 | 4984 |
| 7 | 1 | 69.2 | 89.8 | 23 / 35 | 5034 |
| 8 | 1 | 67.0 | 85.4 | 20 / 35 | 4221 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 84 | 62% |
| wee.Gem 1.8.4 | 38 | 100% |
| EH.Eagle 1.0.6 | 28 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 23 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 12 | 100% |
| throxbot.ThroxBot 0.1 | 7 | 86% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |

Hadur died in 118 of 280 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 49 | 42% | 111 |
| wee.Gem 1.8.4 | 13 | 11% | 45 |
| joe.ADinosaur 1.0 | 12 | 10% | 14 |
| techdude.kombat.FlamingKombat 1.5 | 9 | 8% | 21 |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 7% | 35 |
| throxbot.ThroxBot 0.1 | 8 | 7% | 15 |
| caimano.Furia_Ceca 0.22 | 8 | 7% | 8 |
| cs.Grudge 1.0 | 7 | 6% | 6 |
| EH.Eagle 1.0.6 | 4 | 3% | 23 |

## Melee bench: F28

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 8 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.3 | 160 / 280 | 2.41 | 17.8% | 33174 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 17.8% | 160 |
| kid.test.NightFox .2 | 2.0 | 14.5% | 45 |
| uji.Antique 1.0 | 3.6 | 12.0% | 35 |
| qohnil.blot.BlotBot 3.61 | 4.1 | 10.6% | 20 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 11.0% | 11 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.1% | 4 |
| amk.ChumbaWumba 0.3 | 6.9 | 7.8% | 4 |
| matt.advanced.Katana 1.0 | 8.4 | 6.5% | 0 |
| stelo.PianistNano 1.2 | 9.0 | 6.0% | 1 |
| stelo.Lifestealer 1.0 | 9.3 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 87.6 | 22 / 35 | 4232 |
| 2 | 1 | 65.5 | 81.3 | 18 / 35 | 3860 |
| 3 | 1 | 65.5 | 80.3 | 20 / 35 | 3886 |
| 4 | 1 | 69.2 | 94.0 | 23 / 35 | 4347 |
| 5 | 1 | 67.8 | 87.0 | 19 / 35 | 4591 |
| 6 | 1 | 65.2 | 77.1 | 16 / 35 | 4141 |
| 7 | 1 | 67.9 | 85.7 | 23 / 35 | 4424 |
| 8 | 1 | 65.6 | 81.6 | 19 / 35 | 3693 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 96 | 81% |
| uji.Antique 1.0 | 51 | 80% |
| qohnil.blot.BlotBot 3.61 | 23 | 57% |
| ahr.ice.Ice 1.0.2 | 10 | 90% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| amk.ChumbaWumba 0.3 | 5 | 60% |
| matt.advanced.Katana 1.0 | 4 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |

Hadur died in 120 of 280 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 32 | 27% | 90 |
| uji.Antique 1.0 | 28 | 23% | 77 |
| pfvicm.Sobieski 7.2.3b | 23 | 19% | 26 |
| qohnil.blot.BlotBot 3.61 | 15 | 13% | 30 |
| amk.ChumbaWumba 0.3 | 12 | 10% | 21 |
| ahr.ice.Ice 1.0.2 | 4 | 3% | 15 |
| stelo.Lifestealer 1.0 | 4 | 3% | 7 |
| stelo.PianistNano 1.2 | 2 | 2% | 4 |
| matt.advanced.Katana 1.0 | 0 | 0% | 6 |

## Melee bench: F29

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.7 | 108 / 280 | 2.64 | 17.7% | 37353 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 17.7% | 108 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.4% | 81 |
| deewiant.Anomaly 0.2 | 2.8 | 14.5% | 64 |
| myl.micro.Troodon 1.10 | 4.1 | 11.7% | 8 |
| jok.PheonixM 0.1.2 | 5.0 | 10.4% | 9 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.1% | 0 |
| DBall.Anarchy 0.1 | 7.0 | 6.9% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 7.9 | 6.0% | 0 |
| ap.Frederick 1.1 | 9.1 | 5.1% | 2 |
| jangs.ns51 1.0 | 9.9 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 78.7 | 14 / 35 | 4254 |
| 2 | 1 | 68.1 | 83.8 | 16 / 35 | 4799 |
| 3 | 1 | 66.7 | 80.0 | 9 / 35 | 4685 |
| 4 | 1 | 65.0 | 74.6 | 16 / 35 | 4026 |
| 5 | 1 | 68.2 | 86.0 | 14 / 35 | 4684 |
| 6 | 1 | 67.7 | 84.4 | 12 / 35 | 4917 |
| 7 | 1 | 67.1 | 80.6 | 10 / 35 | 4988 |
| 8 | 1 | 68.8 | 85.7 | 17 / 35 | 5000 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 78 | 50% |
| zyx.mega.YersiniaPestis 3.1 | 50 | 30% |
| myl.micro.Troodon 1.10 | 26 | 96% |
| jok.PheonixM 0.1.2 | 13 | 100% |
| DBall.Anarchy 0.1 | 11 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| jangs.ns51 1.0 | 2 | 50% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 175 of 280 rounds, at a mean tick of 1059. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 73 | 42% | 115 |
| zyx.mega.YersiniaPestis 3.1 | 61 | 35% | 78 |
| myl.micro.Troodon 1.10 | 12 | 7% | 35 |
| jok.PheonixM 0.1.2 | 11 | 6% | 22 |
| ph.melee.ArcherME 0.3 | 11 | 6% | 11 |
| DBall.Anarchy 0.1 | 3 | 2% | 12 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 1% | 4 |
| jangs.ns51 1.0 | 2 | 1% | 3 |

## Melee bench: F30

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.3 | 58.1 | 35 / 280 | 4.77 | 12.3% | 31088 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.4 | 13.7% | 65 |
| darkcanuck.B26354 1.06 | 2.6 | 13.4% | 78 |
| stelo.PastFuture 2.3.2 | 2.6 | 13.1% | 43 |
| oog.melee.Capulet 1.2 | 3.3 | 12.6% | 36 |
| hadur117.micro.SaorD 0.1 | 4.1 | 12.3% | 35 |
| intruder.PrairieWolf 2.61 | 6.1 | 9.2% | 15 |
| fowl3628800.LightningBolt 2.6.0 | 7.5 | 7.9% | 5 |
| tripphippy.Alice 1.1 | 7.8 | 7.7% | 3 |
| ntc.Opposite 1.5 | 8.6 | 7.2% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.2 | 49.2 | 3 / 35 | 3746 |
| 2 | 5 | 57.4 | 57.8 | 5 / 35 | 3910 |
| 3 | 5 | 56.7 | 57.8 | 6 / 35 | 3567 |
| 4 | 3 | 59.6 | 65.1 | 6 / 35 | 3855 |
| 5 | 4 | 56.8 | 56.5 | 2 / 35 | 3889 |
| 6 | 3 | 57.4 | 56.2 | 6 / 35 | 4126 |
| 7 | 4 | 58.6 | 62.2 | 5 / 35 | 3884 |
| 8 | 4 | 57.9 | 60.0 | 2 / 35 | 4111 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 24 | 17% |
| catcat20.Matcha 0.006 | 17 | 6% |
| oog.melee.Capulet 1.2 | 16 | 56% |
| stelo.PastFuture 2.3.2 | 13 | 54% |
| intruder.PrairieWolf 2.61 | 7 | 71% |
| tripphippy.Alice 1.1 | 6 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 100% |

Hadur died in 246 of 280 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 55 | 22% | 63 |
| catcat20.Matcha 0.006 | 48 | 20% | 49 |
| stelo.PastFuture 2.3.2 | 44 | 18% | 51 |
| darkcanuck.B26354 1.06 | 44 | 18% | 47 |
| ntc.Opposite 1.5 | 17 | 7% | 18 |
| tripphippy.Alice 1.1 | 14 | 6% | 20 |
| intruder.PrairieWolf 2.61 | 12 | 5% | 18 |
| fowl3628800.LightningBolt 2.6.0 | 7 | 3% | 9 |
| GarmBox.Anger 1.0 | 5 | 2% | 5 |

## Melee bench: F31

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 71.0 | 41 / 280 | 3.61 | 14.4% | 30805 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.5% | 161 |
| hadur117.micro.SaorD 0.1 | 2.1 | 14.4% | 41 |
| gh.mini.Griezel 0.2 | 2.9 | 12.7% | 57 |
| d414.nano.Quantum 1.0.0 | 4.4 | 11.0% | 16 |
| spinnercat.micro.Tyger 0.1 | 4.6 | 10.7% | 4 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.9% | 4 |
| timmit.nano.TimDog 0.33 | 7.4 | 7.1% | 0 |
| fm.mammillarias 1.3 | 7.9 | 6.6% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.4% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 73.7 | 6 / 35 | 3567 |
| 2 | 2 | 61.8 | 71.7 | 3 / 35 | 3784 |
| 3 | 2 | 60.1 | 65.7 | 3 / 35 | 4081 |
| 4 | 2 | 63.2 | 76.5 | 4 / 35 | 4006 |
| 5 | 2 | 63.4 | 74.0 | 10 / 35 | 4075 |
| 6 | 2 | 60.3 | 66.3 | 5 / 35 | 3811 |
| 7 | 3 | 61.1 | 67.9 | 3 / 35 | 3977 |
| 8 | 2 | 62.3 | 71.7 | 7 / 35 | 3504 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 62 | 8% |
| gh.mini.Griezel 0.2 | 27 | 26% |
| d414.nano.Quantum 1.0.0 | 18 | 78% |
| spinnercat.micro.Tyger 0.1 | 10 | 100% |
| gh.nano.Grofvuil 0.2 | 2 | 50% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 239 of 280 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 136 | 57% | 148 |
| gh.mini.Griezel 0.2 | 36 | 15% | 46 |
| spinnercat.micro.Tyger 0.1 | 19 | 8% | 25 |
| timmit.nano.TimDog 0.33 | 10 | 4% | 14 |
| gh.nano.Grofvuil 0.2 | 10 | 4% | 12 |
| fm.mammillarias 1.3 | 10 | 4% | 10 |
| d414.nano.Quantum 1.0.0 | 9 | 4% | 16 |
| tlp.ThreeLeggedPig 1 | 5 | 2% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 4 | 2% | 4 |

## Melee bench: F32

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 80.0 | 114 / 280 | 2.80 | 16.7% | 36673 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.1 | 16.7% | 114 |
| kawigi.sbf.FloodHT 0.9.2 | 1.9 | 15.5% | 99 |
| apc.botM 3.0 | 3.3 | 12.0% | 29 |
| lxx.ConceptA 0.8 | 4.3 | 10.7% | 8 |
| vjik.UnViolation 1.1 | 4.9 | 9.9% | 13 |
| bayen.UbaMicro 1.4 | 5.6 | 8.9% | 4 |
| panzer.Panzer 0.2 | 7.5 | 7.5% | 1 |
| yk.JahMicro 1.0 | 8.0 | 6.7% | 9 |
| conscience.Electron 1.3g | 8.8 | 6.4% | 1 |
| donjezza.Jezza 1.0 | 9.8 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 73.0 | 10 / 35 | 4454 |
| 2 | 1 | 66.2 | 84.1 | 16 / 35 | 4547 |
| 3 | 1 | 64.0 | 74.6 | 13 / 35 | 4751 |
| 4 | 1 | 65.7 | 80.6 | 18 / 35 | 4592 |
| 5 | 1 | 65.7 | 81.3 | 12 / 35 | 4521 |
| 6 | 1 | 66.0 | 82.9 | 15 / 35 | 4651 |
| 7 | 1 | 63.9 | 77.8 | 13 / 35 | 4321 |
| 8 | 1 | 67.0 | 86.0 | 17 / 35 | 4836 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 99 | 36% |
| lxx.ConceptA 0.8 | 28 | 89% |
| apc.botM 3.0 | 27 | 67% |
| vjik.UnViolation 1.1 | 12 | 75% |
| bayen.UbaMicro 1.4 | 10 | 80% |
| donjezza.Jezza 1.0 | 10 | 90% |
| yk.JahMicro 1.0 | 7 | 43% |
| panzer.Panzer 0.2 | 5 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 167 of 280 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 68 | 41% | 111 |
| lxx.ConceptA 0.8 | 32 | 19% | 40 |
| apc.botM 3.0 | 18 | 11% | 43 |
| vjik.UnViolation 1.1 | 15 | 9% | 35 |
| panzer.Panzer 0.2 | 9 | 5% | 9 |
| yk.JahMicro 1.0 | 8 | 5% | 11 |
| bayen.UbaMicro 1.4 | 7 | 4% | 16 |
| conscience.Electron 1.3g | 6 | 4% | 9 |
| donjezza.Jezza 1.0 | 3 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F33

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 81.0 | 138 / 280 | 2.71 | 18.3% | 41102 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 18.3% | 138 |
| maribo.Quester 0.3 | 2.1 | 16.1% | 71 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.0% | 25 |
| labg.Cataclysm 2.05 | 4.5 | 10.4% | 17 |
| gre.svman4.Leonidas 1.3.2 | 4.6 | 10.8% | 16 |
| baal.nano.N 1.42 | 6.1 | 9.1% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.6 | 8.4% | 10 |
| zyx.micro.Ant 1.1 | 8.5 | 5.4% | 0 |
| sanja.First 0.1 | 8.6 | 5.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.9 | 3.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 82.5 | 18 / 35 | 4589 |
| 2 | 1 | 65.6 | 73.0 | 13 / 35 | 4906 |
| 3 | 1 | 68.2 | 80.6 | 18 / 35 | 5270 |
| 4 | 1 | 67.5 | 79.4 | 15 / 35 | 5103 |
| 5 | 1 | 66.5 | 76.5 | 14 / 35 | 5070 |
| 6 | 1 | 70.9 | 90.2 | 21 / 35 | 5519 |
| 7 | 1 | 69.5 | 85.1 | 22 / 35 | 5198 |
| 8 | 1 | 68.7 | 81.0 | 17 / 35 | 5447 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 75 | 61% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 86% |
| gre.svman4.Leonidas 1.3.2 | 36 | 92% |
| labg.Cataclysm 2.05 | 18 | 50% |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 60% |
| baal.nano.N 1.42 | 2 | 100% |
| sanja.First 0.1 | 2 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 143 of 280 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 60 | 42% | 112 |
| gre.svman4.Leonidas 1.3.2 | 21 | 15% | 46 |
| kinsen.melee.Angsaichmophobia 1.8c | 16 | 11% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 10% | 47 |
| labg.Cataclysm 2.05 | 13 | 9% | 28 |
| baal.nano.N 1.42 | 7 | 5% | 10 |
| sanja.First 0.1 | 5 | 3% | 6 |
| zyx.micro.Ant 1.1 | 3 | 2% | 4 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 2% | 3 |

## Melee bench: F34

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 75.2 | 38 / 280 | 3.24 | 15.4% | 36753 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.5 | 17.1% | 126 |
| kid.Gladiator .7.2 | 1.9 | 16.8% | 87 |
| hadur117.micro.SaorD 0.1 | 2.6 | 15.4% | 38 |
| tcf.Reach 3 | 4.6 | 10.8% | 7 |
| jcs.Seth 1.8 | 4.8 | 10.6% | 15 |
| cli.Dancer 1.1 | 5.8 | 9.5% | 4 |
| ratosh.Wesco 1.4 | 6.9 | 7.3% | 3 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.3% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 4.1% | 0 |
| sample.RamFire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 75.9 | 6 / 35 | 5114 |
| 2 | 2 | 66.3 | 76.8 | 6 / 35 | 5215 |
| 3 | 3 | 64.7 | 79.4 | 6 / 35 | 4202 |
| 4 | 2 | 64.0 | 76.8 | 5 / 35 | 4532 |
| 5 | 3 | 61.9 | 67.9 | 4 / 35 | 4211 |
| 6 | 3 | 64.7 | 76.2 | 4 / 35 | 4719 |
| 7 | 3 | 63.5 | 73.0 | 3 / 35 | 4427 |
| 8 | 3 | 64.1 | 75.2 | 4 / 35 | 4333 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 72 | 24% |
| kid.Gladiator .7.2 | 54 | 19% |
| tcf.Reach 3 | 10 | 60% |
| jcs.Seth 1.8 | 7 | 29% |
| ratosh.Wesco 1.4 | 3 | 100% |
| cli.Dancer 1.1 | 1 | 0% |

Hadur died in 242 of 280 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 106 | 44% | 121 |
| kid.Gladiator .7.2 | 83 | 34% | 93 |
| tcf.Reach 3 | 18 | 7% | 24 |
| jcs.Seth 1.8 | 13 | 5% | 16 |
| cli.Dancer 1.1 | 9 | 4% | 10 |
| sample.RamFire 1.0 | 8 | 3% | 8 |
| ratosh.Wesco 1.4 | 4 | 2% | 7 |
| amk.Punbot.Punbot 0.01 | 1 | 0% | 1 |

## Melee bench: F35

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 65.6 | 13 / 280 | 4.10 | 12.7% | 26646 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.5% | 224 |
| hadur117.micro.SaorD 0.1 | 3.0 | 12.7% | 13 |
| gh.mini.Gruwel 0.9 | 3.0 | 12.8% | 20 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 11.9% | 17 |
| rz.HawkOnFire 0.1 | 4.3 | 11.5% | 4 |
| myl.nano.KomoriNinja 1.1 | 6.5 | 7.1% | 2 |
| wit.Chuliath 1.0 | 7.0 | 7.1% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.4% | 1 |
| dans.Cinnamon 1.2 | 9.3 | 5.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.5 | 61.0 | 1 / 35 | 3224 |
| 2 | 2 | 59.3 | 66.0 | 1 / 35 | 3393 |
| 3 | 5 | 56.8 | 61.3 | 1 / 35 | 2998 |
| 4 | 2 | 62.3 | 74.0 | 3 / 35 | 3834 |
| 5 | 3 | 59.8 | 67.0 | 1 / 35 | 3372 |
| 6 | 2 | 60.9 | 68.6 | 2 / 35 | 3853 |
| 7 | 4 | 58.3 | 65.7 | 3 / 35 | 2950 |
| 8 | 3 | 57.1 | 61.3 | 1 / 35 | 3022 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 46 | 2% |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 63% |
| rz.HawkOnFire 0.1 | 5 | 100% |
| gh.mini.Gruwel 0.9 | 4 | 50% |
| myl.nano.KomoriNinja 1.1 | 1 | 0% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 0% |

Hadur died in 267 of 280 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 160 | 60% | 162 |
| gh.mini.Gruwel 0.9 | 28 | 10% | 32 |
| dmh.robocode.robot.BlackDeath 9.2 | 27 | 10% | 31 |
| rz.HawkOnFire 0.1 | 19 | 7% | 20 |
| myl.nano.KomoriNinja 1.1 | 10 | 4% | 10 |
| stelo.MyAgileRobot 0.2 | 8 | 3% | 9 |
| wit.Chuliath 1.0 | 6 | 2% | 7 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6 | 2% | 6 |
| dans.Cinnamon 1.2 | 3 | 1% | 3 |

## Melee bench: F36

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.6 | 208 / 280 | 1.94 | 20.5% | 44222 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 20.5% | 208 |
| alpha.RainingFire 1.0 | 2.6 | 12.3% | 21 |
| bzdp.Pansy 2.1 | 3.5 | 11.5% | 24 |
| bvh.micro.Freya 0.3 | 4.0 | 10.9% | 7 |
| mz.Cork 0.1 | 4.5 | 10.5% | 10 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.1% | 5 |
| bvh.mini.Fenrir 0.39 | 6.4 | 9.0% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 6.9% | 1 |
| dl.BetterWalls 1.0 | 9.0 | 5.6% | 1 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 94.9 | 30 / 35 | 5974 |
| 2 | 1 | 69.1 | 84.1 | 21 / 35 | 5247 |
| 3 | 1 | 69.8 | 86.3 | 26 / 35 | 5547 |
| 4 | 1 | 68.6 | 83.5 | 23 / 35 | 4970 |
| 5 | 1 | 70.3 | 87.3 | 25 / 35 | 5717 |
| 6 | 1 | 72.0 | 96.2 | 31 / 35 | 5399 |
| 7 | 1 | 71.9 | 95.9 | 30 / 35 | 5528 |
| 8 | 1 | 70.2 | 88.3 | 22 / 35 | 5840 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 57 | 89% |
| bvh.micro.Freya 0.3 | 48 | 100% |
| mz.Cork 0.1 | 39 | 90% |
| alpha.RainingFire 1.0 | 30 | 87% |
| bvh.mini.Fenrir 0.39 | 26 | 92% |
| m3thos.Eva02 0.7.1 | 20 | 95% |
| sample.MyFirstRobot 1.0 | 5 | 80% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 73 of 280 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 17 | 23% | 46 |
| bzdp.Pansy 2.1 | 16 | 22% | 69 |
| mz.Cork 0.1 | 11 | 15% | 44 |
| bvh.micro.Freya 0.3 | 8 | 11% | 44 |
| dl.BetterWalls 1.0 | 8 | 11% | 17 |
| bvh.mini.Fenrir 0.39 | 7 | 10% | 22 |
| m3thos.Eva02 0.7.1 | 3 | 4% | 30 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 3 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 75.7 | 151 / 280 | 3.19 | 17.0% | 41774 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 17.0% | 151 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.0 | 10.7% | 16 |
| germ.TheMind .2 | 3.0 | 10.8% | 24 |
| EBBU.Sim2 1.02 | 4.1 | 10.1% | 9 |
| agrach.Dalek 1.0 | 5.1 | 9.8% | 18 |
| stelo.UntouchableNano 1.3 | 6.3 | 9.0% | 13 |
| mb.Beast 0.1 | 7.0 | 8.6% | 17 |
| lmk.ACPFinal 0.1 | 7.8 | 8.4% | 14 |
| skm.Ryubot 1.0 | 8.1 | 8.3% | 15 |
| mn.nano.perceptual.Impact 1.3.0 | 9.6 | 7.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 72.4 | 15 / 35 | 5284 |
| 2 | 1 | 65.1 | 76.2 | 20 / 35 | 5113 |
| 3 | 1 | 66.6 | 80.0 | 20 / 35 | 5505 |
| 4 | 1 | 63.5 | 71.4 | 17 / 35 | 4874 |
| 5 | 1 | 64.0 | 72.4 | 17 / 35 | 5214 |
| 6 | 1 | 67.7 | 85.1 | 26 / 35 | 5361 |
| 7 | 1 | 63.3 | 71.7 | 15 / 35 | 5066 |
| 8 | 1 | 65.9 | 76.2 | 21 / 35 | 5357 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 38 | 87% |
| EBBU.Sim2 1.02 | 29 | 97% |
| stelo.UntouchableNano 1.3 | 25 | 84% |
| skm.Ryubot 1.0 | 23 | 83% |
| mb.Beast 0.1 | 15 | 93% |
| com.syncleus.robocode.Dreadnaught 0.1 | 15 | 100% |
| lmk.ACPFinal 0.1 | 12 | 83% |
| agrach.Dalek 1.0 | 12 | 83% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 130 of 280 rounds, at a mean tick of 372. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 29 | 22% | 50 |
| mn.nano.perceptual.Impact 1.3.0 | 23 | 18% | 29 |
| com.syncleus.robocode.Dreadnaught 0.1 | 16 | 12% | 37 |
| EBBU.Sim2 1.02 | 14 | 11% | 33 |
| germ.TheMind .2 | 13 | 10% | 30 |
| lmk.ACPFinal 0.1 | 12 | 9% | 25 |
| mb.Beast 0.1 | 8 | 6% | 30 |
| stelo.UntouchableNano 1.3 | 8 | 6% | 25 |
| skm.Ryubot 1.0 | 7 | 5% | 15 |

## Melee bench: F38

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 69.5 | 65 / 280 | 3.74 | 14.5% | 32892 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.9% | 145 |
| hadur117.micro.SaorD 0.1 | 2.3 | 14.5% | 65 |
| bvh.mini.Freya 0.55 | 3.4 | 12.2% | 12 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.4% | 24 |
| cs.Wren 1.0 | 4.8 | 10.5% | 14 |
| kdf.KoulDestroyer 1.0 | 6.1 | 9.4% | 7 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.4 | 8.9% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.1 | 6.1% | 4 |
| matt.UnderDark3 2.4.34 | 9.1 | 4.9% | 2 |
| bzdp.BoxCar 2.0 | 9.6 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 71.1 | 5 / 35 | 4047 |
| 2 | 2 | 64.3 | 73.3 | 12 / 35 | 4483 |
| 3 | 2 | 63.9 | 73.7 | 10 / 35 | 4132 |
| 4 | 2 | 60.2 | 63.8 | 6 / 35 | 4160 |
| 5 | 2 | 62.9 | 74.0 | 7 / 35 | 4164 |
| 6 | 2 | 63.5 | 69.8 | 11 / 35 | 4678 |
| 7 | 2 | 63.0 | 74.6 | 8 / 35 | 3944 |
| 8 | 4 | 56.0 | 55.9 | 6 / 35 | 3284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 66 | 18% |
| cs.Wren 1.0 | 20 | 85% |
| bts.mega.Gnarly 1.4 | 15 | 80% |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 92% |
| bvh.mini.Freya 0.55 | 8 | 88% |
| kdf.KoulDestroyer 1.0 | 5 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 0% |

Hadur died in 215 of 280 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 102 | 47% | 118 |
| bvh.mini.Freya 0.55 | 25 | 12% | 34 |
| bts.mega.Gnarly 1.4 | 23 | 11% | 38 |
| cs.Wren 1.0 | 21 | 10% | 31 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 7% | 25 |
| kdf.KoulDestroyer 1.0 | 13 | 6% | 16 |
| kawigi.spare.SpareParts 0.7.6nosnd | 10 | 5% | 10 |
| bzdp.BoxCar 2.0 | 5 | 2% | 5 |
| matt.UnderDark3 2.4.34 | 1 | 0% | 3 |

## Melee bench: F39

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 76.0 | 83 / 280 | 3.16 | 16.3% | 39588 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.3 | 16.3% | 83 |
| bvh.fry.Freya 0.82 | 1.8 | 15.5% | 52 |
| az.Ololobot 0.2.4 | 3.0 | 13.0% | 86 |
| catcat20.Lambda 0.024 | 4.0 | 10.7% | 36 |
| winamp32.micro.MicroMacro 1.0 | 5.6 | 8.5% | 6 |
| gimp.GimpBot 0.1 | 6.3 | 8.4% | 1 |
| apollokidd.ApolloKidd 0.9 | 6.4 | 8.4% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 7.8 | 7.5% | 14 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.5 | 5.7% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.5 | 6.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 72.1 | 9 / 35 | 4960 |
| 2 | 1 | 64.5 | 74.9 | 9 / 35 | 4936 |
| 3 | 1 | 65.5 | 76.8 | 14 / 35 | 5081 |
| 4 | 1 | 65.4 | 76.2 | 13 / 35 | 5282 |
| 5 | 1 | 64.5 | 79.4 | 12 / 35 | 4389 |
| 6 | 1 | 64.9 | 76.5 | 11 / 35 | 4992 |
| 7 | 2 | 64.1 | 76.5 | 6 / 35 | 4968 |
| 8 | 2 | 64.3 | 75.6 | 9 / 35 | 4980 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 52 | 63% |
| az.Ololobot 0.2.4 | 52 | 17% |
| catcat20.Lambda 0.024 | 29 | 52% |
| stelo.SoRobotNanoMelee 1.2 | 16 | 88% |
| gimp.GimpBot 0.1 | 9 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| winamp32.micro.MicroMacro 1.0 | 1 | 100% |

Hadur died in 199 of 280 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 60 | 30% | 74 |
| bvh.fry.Freya 0.82 | 53 | 27% | 80 |
| catcat20.Lambda 0.024 | 39 | 20% | 52 |
| apollokidd.ApolloKidd 0.9 | 13 | 7% | 17 |
| stelo.SoRobotNanoMelee 1.2 | 12 | 6% | 19 |
| winamp32.micro.MicroMacro 1.0 | 10 | 5% | 15 |
| whitesquare.robots.SkynetAdvanced 1.1 | 6 | 3% | 7 |
| gimp.GimpBot 0.1 | 4 | 2% | 14 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 1% | 2 |

## Melee bench: F40

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 81.3 | 153 / 280 | 2.68 | 18.0% | 38072 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 18.0% | 153 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.3% | 66 |
| kano.gamma.KanoGamma 1.8 | 3.1 | 12.4% | 26 |
| mz.AntiGrav 1.0 | 4.3 | 11.0% | 7 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.4% | 12 |
| alpha.BlackIce 1.0 | 6.3 | 8.8% | 5 |
| stelo.Randomness 1.0 | 6.6 | 8.4% | 9 |
| amk.superstrike.SuperStrike 0.3 | 8.3 | 6.1% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.5% | 1 |
| sample.Corners 1.0 | 9.8 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 76.5 | 16 / 35 | 4646 |
| 2 | 1 | 68.4 | 84.4 | 22 / 35 | 4675 |
| 3 | 1 | 67.9 | 84.1 | 15 / 35 | 5024 |
| 4 | 1 | 66.6 | 80.0 | 19 / 35 | 4406 |
| 5 | 1 | 66.1 | 75.9 | 19 / 35 | 4705 |
| 6 | 1 | 66.7 | 80.0 | 19 / 35 | 4318 |
| 7 | 1 | 69.4 | 86.3 | 24 / 35 | 5090 |
| 8 | 1 | 68.3 | 83.2 | 19 / 35 | 5208 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 89 | 58% |
| kano.gamma.KanoGamma 1.8 | 40 | 83% |
| mz.AntiGrav 1.0 | 26 | 96% |
| Polkwane.SmashMelee 1.0 | 20 | 100% |
| alpha.BlackIce 1.0 | 9 | 89% |
| stelo.Randomness 1.0 | 5 | 100% |
| amk.superstrike.SuperStrike 0.3 | 4 | 100% |
| testantiswapgun.AntiSwap 1.0 | 3 | 100% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 128 of 280 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 56 | 44% | 91 |
| kano.gamma.KanoGamma 1.8 | 24 | 19% | 66 |
| mz.AntiGrav 1.0 | 11 | 9% | 33 |
| stelo.Randomness 1.0 | 11 | 9% | 25 |
| Polkwane.SmashMelee 1.0 | 10 | 8% | 26 |
| alpha.BlackIce 1.0 | 8 | 6% | 18 |
| amk.superstrike.SuperStrike 0.3 | 5 | 4% | 8 |
| testantiswapgun.AntiSwap 1.0 | 2 | 2% | 6 |
| sample.Corners 1.0 | 1 | 1% | 5 |

## Melee bench: F41

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 70.7 | 86 / 280 | 3.64 | 15.3% | 35501 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.1 | 16.4% | 116 |
| hadur117.micro.SaorD 0.1 | 1.9 | 15.3% | 86 |
| ary.Swarm 1.1 | 3.4 | 13.0% | 27 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.4% | 27 |
| simonton.nano.MeleeSeed 1.8 | 5.4 | 10.3% | 14 |
| shrub.Silver v048 | 5.6 | 9.6% | 6 |
| zyx.nano.Ant 1.1 | 6.9 | 7.9% | 0 |
| jsal.Jsalbot 1.0 | 8.4 | 6.2% | 5 |
| stelo.Mirror 1.1 | 8.6 | 6.2% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 74.9 | 12 / 35 | 3994 |
| 2 | 2 | 61.8 | 64.4 | 10 / 35 | 4326 |
| 3 | 2 | 63.8 | 70.5 | 11 / 35 | 4478 |
| 4 | 2 | 61.4 | 64.4 | 7 / 35 | 4550 |
| 5 | 2 | 64.4 | 73.3 | 13 / 35 | 4114 |
| 6 | 2 | 64.7 | 71.7 | 12 / 35 | 4885 |
| 7 | 2 | 63.9 | 72.4 | 10 / 35 | 4505 |
| 8 | 1 | 64.5 | 73.7 | 11 / 35 | 4649 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 57 | 35% |
| lessonz.robocode.Oz 0.5.0 | 30 | 87% |
| ary.Swarm 1.1 | 24 | 79% |
| simonton.nano.MeleeSeed 1.8 | 15 | 87% |
| jsal.Jsalbot 1.0 | 5 | 60% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| shrub.Silver v048 | 2 | 50% |
| stelo.Mirror 1.1 | 2 | 100% |

Hadur died in 194 of 280 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 86 | 44% | 112 |
| simonton.nano.MeleeSeed 1.8 | 25 | 13% | 40 |
| lessonz.robocode.Oz 0.5.0 | 23 | 12% | 42 |
| ary.Swarm 1.1 | 20 | 10% | 35 |
| shrub.Silver v048 | 11 | 6% | 14 |
| acogdev.alpha 0.2 | 11 | 6% | 12 |
| zyx.nano.Ant 1.1 | 7 | 4% | 8 |
| stelo.Mirror 1.1 | 6 | 3% | 9 |
| jsal.Jsalbot 1.0 | 5 | 3% | 7 |

## Melee bench: F42

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 75.8 | 67 / 280 | 3.18 | 16.1% | 39651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.1 | 17.4% | 132 |
| hadur117.micro.SaorD 0.1 | 2.1 | 16.1% | 67 |
| maribo.mini.MiniQuester 0.1 | 3.1 | 13.6% | 33 |
| ara.Shera 0.88 | 3.6 | 12.5% | 41 |
| amz.NanoClone 1.41 | 5.0 | 9.5% | 1 |
| maribo.IotaCT 1.1 | 6.4 | 7.8% | 1 |
| dsw.StaticD 1.0 | 6.8 | 7.4% | 4 |
| stelo.MirrorMicro 1.0 | 8.3 | 5.8% | 0 |
| mme.NikeEnhanced 2.0 | 8.9 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 75.9 | 8 / 35 | 4894 |
| 2 | 2 | 65.3 | 78.1 | 7 / 35 | 5003 |
| 3 | 1 | 68.1 | 84.1 | 17 / 35 | 5276 |
| 4 | 2 | 65.8 | 77.8 | 9 / 35 | 5432 |
| 5 | 2 | 64.4 | 74.9 | 7 / 35 | 4833 |
| 6 | 4 | 61.2 | 63.5 | 6 / 35 | 4394 |
| 7 | 2 | 66.3 | 81.3 | 7 / 35 | 5355 |
| 8 | 2 | 62.3 | 70.5 | 6 / 35 | 4464 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 71 | 24% |
| maribo.mini.MiniQuester 0.1 | 34 | 74% |
| ara.Shera 0.88 | 32 | 53% |
| maribo.IotaCT 1.1 | 3 | 100% |
| amz.NanoClone 1.41 | 3 | 67% |
| dsw.StaticD 1.0 | 2 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 214 of 280 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 117 | 55% | 137 |
| ara.Shera 0.88 | 38 | 18% | 55 |
| maribo.mini.MiniQuester 0.1 | 33 | 15% | 54 |
| amz.NanoClone 1.41 | 8 | 4% | 9 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 6 | 3% | 6 |
| dsw.StaticD 1.0 | 5 | 2% | 9 |
| mme.NikeEnhanced 2.0 | 4 | 2% | 4 |
| maribo.IotaCT 1.1 | 2 | 1% | 6 |
| stelo.MirrorMicro 1.0 | 1 | 0% | 0 |

## Melee bench: F43

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 68.9 | 23 / 280 | 3.80 | 13.5% | 29342 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.5% | 222 |
| hadur117.micro.SaorD 0.1 | 2.3 | 13.5% | 23 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.2% | 17 |
| dummy.micro.Sparrow 2.5 | 4.4 | 11.6% | 9 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 10.9% | 6 |
| Krabb.akim2.Akim2 1.1b | 5.6 | 10.0% | 1 |
| jab.DiamondStealer 5 | 7.5 | 7.5% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.7% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 70.2 | 3 / 35 | 3577 |
| 2 | 2 | 63.5 | 74.9 | 2 / 35 | 3770 |
| 3 | 3 | 60.1 | 62.9 | 3 / 35 | 3579 |
| 4 | 2 | 60.7 | 65.1 | 4 / 35 | 3564 |
| 5 | 3 | 60.2 | 64.4 | 0 / 35 | 3472 |
| 6 | 2 | 63.1 | 72.7 | 3 / 35 | 3991 |
| 7 | 2 | 61.0 | 66.0 | 3 / 35 | 3596 |
| 8 | 2 | 63.8 | 74.9 | 5 / 35 | 3793 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 67 | 1% |
| brainfade.melee.Dusk 0.44 | 14 | 57% |
| dummy.micro.Sparrow 2.5 | 11 | 82% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 100% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |

Hadur died in 257 of 280 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 157 | 61% | 162 |
| brainfade.melee.Dusk 0.44 | 33 | 13% | 41 |
| wcsv.melee.EngineerMelee 0.1 | 27 | 11% | 28 |
| mz.NanoGod 2.02 | 13 | 5% | 13 |
| dummy.micro.Sparrow 2.5 | 11 | 4% | 17 |
| jab.DiamondStealer 5 | 7 | 3% | 8 |
| Krabb.akim2.Akim2 1.1b | 6 | 2% | 8 |
| cvt.Firsty 1.0 | 3 | 1% | 3 |

## Melee bench: F44

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.2 | 113 / 280 | 2.70 | 17.9% | 43095 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.3 | 17.9% | 113 |
| stelo.Liblix 0.3.1 | 1.8 | 15.8% | 117 |
| tzu.TheArtOfWar 1.2 | 3.3 | 12.5% | 29 |
| wompi.Quokka 1.6 | 4.6 | 10.1% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.1 | 9.6% | 4 |
| jwirde.Gort 2.0 | 5.5 | 9.7% | 11 |
| disan.Chair 2.2.0 | 6.6 | 8.3% | 1 |
| stf.PanzerGeneral 0.1 | 7.9 | 6.6% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 5.0% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 69.5 | 12 / 35 | 5103 |
| 2 | 1 | 68.7 | 88.9 | 15 / 35 | 5402 |
| 3 | 1 | 66.2 | 77.1 | 14 / 35 | 5236 |
| 4 | 1 | 67.6 | 81.6 | 15 / 35 | 5320 |
| 5 | 1 | 67.3 | 82.2 | 11 / 35 | 5265 |
| 6 | 2 | 66.6 | 78.4 | 11 / 35 | 5417 |
| 7 | 1 | 70.5 | 91.7 | 21 / 35 | 5966 |
| 8 | 1 | 66.8 | 79.7 | 14 / 35 | 5386 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 92 | 24% |
| tzu.TheArtOfWar 1.2 | 72 | 78% |
| wompi.Quokka 1.6 | 12 | 92% |
| disan.Chair 2.2.0 | 9 | 100% |
| jwirde.Gort 2.0 | 6 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 100% |
| stf.PanzerGeneral 0.1 | 3 | 100% |

Hadur died in 167 of 280 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 91 | 54% | 121 |
| tzu.TheArtOfWar 1.2 | 36 | 22% | 86 |
| wompi.Quokka 1.6 | 13 | 8% | 22 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 5% | 14 |
| jwirde.Gort 2.0 | 5 | 3% | 14 |
| disan.Chair 2.2.0 | 5 | 3% | 9 |
| stf.PanzerGeneral 0.1 | 4 | 2% | 9 |
| amk.jointstrike.JointStrike 0.2 | 4 | 2% | 4 |
| sample.Crazy 1.0 | 1 | 1% | 1 |

## Melee bench: F45

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 82.3 | 110 / 280 | 2.59 | 18.7% | 44715 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorD 0.1 | 1.0 | 18.7% | 110 |
| eem.IWillFireNoBullet v2.8 | 2.1 | 12.9% | 144 |
| jje.BagPuss 1.2 | 2.9 | 12.0% | 10 |
| sul.Lunar 1.1 | 4.4 | 10.0% | 6 |
| myl.nano.Graviton 1.10 | 4.9 | 9.7% | 2 |
| hvilela.HVilela 0.9 | 6.3 | 8.8% | 0 |
| fm.claire 1.7 | 7.0 | 8.6% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.9 | 7.6% | 0 |
| wit.Deep7 2.0 | 8.8 | 6.6% | 7 |
| abud.ThirdRobo 1.0 | 9.9 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 75.9 | 19 / 35 | 5411 |
| 2 | 1 | 68.1 | 84.8 | 13 / 35 | 5477 |
| 3 | 1 | 68.2 | 83.2 | 12 / 35 | 6035 |
| 4 | 1 | 68.0 | 81.9 | 13 / 35 | 5601 |
| 5 | 1 | 66.4 | 78.1 | 13 / 35 | 5216 |
| 6 | 1 | 69.2 | 87.0 | 13 / 35 | 6012 |
| 7 | 1 | 67.4 | 81.3 | 12 / 35 | 5571 |
| 8 | 1 | 68.8 | 86.7 | 15 / 35 | 5392 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 129 | 29% |
| sul.Lunar 1.1 | 21 | 100% |
| jje.BagPuss 1.2 | 20 | 70% |
| myl.nano.Graviton 1.10 | 18 | 94% |
| wit.Deep7 2.0 | 6 | 83% |
| pez.mini.ChironexFleckeri 0.5 | 5 | 100% |
| fm.claire 1.7 | 5 | 100% |
| hvilela.HVilela 0.9 | 4 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 171 of 280 rounds, at a mean tick of 1892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 96 | 56% | 0 |
| jje.BagPuss 1.2 | 22 | 13% | 77 |
| myl.nano.Graviton 1.10 | 14 | 8% | 50 |
| pez.mini.ChironexFleckeri 0.5 | 12 | 7% | 27 |
| hvilela.HVilela 0.9 | 8 | 5% | 25 |
| sul.Lunar 1.1 | 6 | 4% | 56 |
| fm.claire 1.7 | 6 | 4% | 16 |
| wit.Deep7 2.0 | 5 | 3% | 18 |
| abud.ThirdRobo 1.0 | 2 | 1% | 8 |

## Melee bench: F46

hadur117.micro.SaorD 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 66.4 | 19 / 280 | 4.03 | 13.6% | 33379 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.4 | 17.5% | 135 |
| kc.mini.Mirage 0.2 | 1.6 | 17.2% | 99 |
| hadur117.micro.SaorD 0.1 | 3.1 | 13.6% | 19 |
| mz.MicroSheep 1.0 | 4.3 | 10.8% | 5 |
| cx.Princess 1.0 | 4.8 | 10.3% | 21 |
| sadoner.killer 0.2 | 5.9 | 8.8% | 0 |
| arthord.NanoSatanMelee Beta | 7.5 | 6.5% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.5% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.1% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.8 | 68.6 | 2 / 35 | 4393 |
| 2 | 3 | 60.8 | 66.0 | 2 / 35 | 4278 |
| 3 | 3 | 62.9 | 72.1 | 1 / 35 | 4561 |
| 4 | 3 | 59.9 | 63.5 | 3 / 35 | 3877 |
| 5 | 3 | 61.0 | 67.0 | 5 / 35 | 3991 |
| 6 | 3 | 60.4 | 65.7 | 1 / 35 | 4033 |
| 7 | 4 | 58.2 | 58.1 | 2 / 35 | 3915 |
| 8 | 3 | 62.1 | 70.2 | 3 / 35 | 4331 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 41 | 15% |
| rsalesc.melee.Medina 0.4.5 | 27 | 4% |
| mz.MicroSheep 1.0 | 9 | 78% |
| cx.Princess 1.0 | 5 | 60% |
| sadoner.killer 0.2 | 2 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 0% |

Hadur died in 261 of 280 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 102 | 39% | 105 |
| kc.mini.Mirage 0.2 | 99 | 38% | 105 |
| cx.Princess 1.0 | 21 | 8% | 23 |
| sadoner.killer 0.2 | 15 | 6% | 16 |
| mz.MicroSheep 1.0 | 8 | 3% | 14 |
| arthord.NanoSatanMelee Beta | 6 | 2% | 6 |
| kurios.DOSexe .9a | 4 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 4 | 2% | 4 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 3 |

