# Bench suite: suite.txt

## Melee bench: F01

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 70.8 | 18 / 280 | 3.63 | 14.2% | 35825 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.3% | 204 |
| hadur117.micro.SaorC 0.1 | 2.0 | 14.2% | 18 |
| sgp.JollyNinja 3.53 | 3.5 | 12.1% | 30 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.8 | 11.8% | 11 |
| mz.MicroGodMelee 1 | 5.3 | 10.3% | 11 |
| lorneswork.Predator 1.0 | 5.5 | 10.0% | 4 |
| adt.Ar2 1.0 | 7.0 | 7.1% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.5 | 5.6% | 1 |
| skm.butterfly 1.0 | 8.5 | 5.4% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 75.6 | 4 / 35 | 4607 |
| 2 | 2 | 64.0 | 76.2 | 0 / 35 | 5036 |
| 3 | 2 | 59.8 | 64.1 | 4 / 35 | 4115 |
| 4 | 2 | 60.3 | 66.0 | 1 / 35 | 4488 |
| 5 | 2 | 59.4 | 63.8 | 0 / 35 | 4230 |
| 6 | 2 | 63.8 | 75.6 | 5 / 35 | 4444 |
| 7 | 2 | 63.5 | 76.5 | 3 / 35 | 4298 |
| 8 | 2 | 61.6 | 68.3 | 1 / 35 | 4607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 94 | 1% |
| sgp.JollyNinja 3.53 | 11 | 55% |
| mz.MicroGodMelee 1 | 9 | 22% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 71% |
| lorneswork.Predator 1.0 | 4 | 75% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 262 of 280 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 151 | 58% | 156 |
| mz.MicroGodMelee 1 | 26 | 10% | 31 |
| sgp.JollyNinja 3.53 | 26 | 10% | 27 |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 10% | 29 |
| lorneswork.Predator 1.0 | 17 | 6% | 20 |
| kawigi.sbf.FloodSonnet 0.9 | 5 | 2% | 5 |
| skm.butterfly 1.0 | 5 | 2% | 4 |
| adt.Ar2 1.0 | 4 | 2% | 5 |
| mym.EdgeStalker 1.0 | 3 | 1% | 3 |

## Melee bench: F02

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 75.9 | 99 / 280 | 3.17 | 16.5% | 38402 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 16.5% | 99 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 13.6% | 61 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.2% | 51 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.8% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.5% | 22 |
| sch.Simone 0.3d | 6.5 | 8.7% | 20 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 7.7% | 4 |
| Noran.BitchingElk 0.054 | 7.3 | 8.0% | 17 |
| stelo.PatternRobot 1.0 | 8.9 | 6.2% | 3 |
| fullsail.SweetTea 1.1 | 10.0 | 4.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 77.5 | 14 / 35 | 5084 |
| 2 | 1 | 66.3 | 80.6 | 16 / 35 | 4697 |
| 3 | 1 | 65.1 | 77.1 | 13 / 35 | 4677 |
| 4 | 2 | 62.4 | 70.2 | 10 / 35 | 4462 |
| 5 | 1 | 62.4 | 71.7 | 7 / 35 | 4409 |
| 6 | 1 | 64.5 | 76.5 | 8 / 35 | 4973 |
| 7 | 1 | 66.5 | 78.1 | 16 / 35 | 5264 |
| 8 | 1 | 65.2 | 75.2 | 15 / 35 | 4836 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 44 | 55% |
| pulsar.PulsarMax 0.8.9 | 34 | 47% |
| com.cohesiva.robocode.ManOwaR 1.0 | 20 | 80% |
| sch.Simone 0.3d | 15 | 53% |
| Noran.BitchingElk 0.054 | 14 | 64% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 100% |
| stelo.PatternRobot 1.0 | 9 | 100% |
| fullsail.SweetTea 1.1 | 3 | 67% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |

Hadur died in 183 of 280 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 56 | 31% | 68 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 53 | 29% | 87 |
| lrem.micro.SpikeSoldier 0.4 | 18 | 10% | 25 |
| sch.Simone 0.3d | 17 | 9% | 28 |
| stelo.PatternRobot 1.0 | 12 | 7% | 19 |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 4% | 20 |
| Noran.BitchingElk 0.054 | 8 | 4% | 16 |
| fullsail.SweetTea 1.1 | 7 | 4% | 10 |
| fnc.bandit.Bandit 5.2.0 | 4 | 2% | 7 |

## Melee bench: F03

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 74.2 | 121 / 280 | 3.32 | 16.2% | 40490 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 16.2% | 121 |
| radnor.DoctorBob 1.42 | 2.0 | 15.0% | 72 |
| vuen.Cake 2.51 | 3.4 | 13.1% | 41 |
| kawigi.nano.Lib 1.0 | 3.6 | 12.3% | 35 |
| urdos.URDOS 1.3 | 4.9 | 10.1% | 5 |
| adt.Ar1 2.1 | 6.6 | 8.0% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.4 | 7.2% | 1 |
| oa.weak.FlyMk1 0.1 | 7.5 | 7.0% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 6.1% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 75.2 | 17 / 35 | 5511 |
| 2 | 1 | 62.8 | 67.9 | 11 / 35 | 5232 |
| 3 | 1 | 65.9 | 79.4 | 18 / 35 | 4881 |
| 4 | 1 | 65.7 | 79.7 | 15 / 35 | 5179 |
| 5 | 1 | 64.5 | 74.0 | 14 / 35 | 5089 |
| 6 | 1 | 64.1 | 75.2 | 18 / 35 | 4526 |
| 7 | 2 | 62.9 | 68.3 | 12 / 35 | 4978 |
| 8 | 1 | 64.8 | 74.3 | 16 / 35 | 5094 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 63 | 81% |
| radnor.DoctorBob 1.42 | 43 | 58% |
| kawigi.nano.Lib 1.0 | 35 | 89% |
| urdos.URDOS 1.3 | 4 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 75% |
| adt.Ar1 2.1 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |

Hadur died in 159 of 280 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 53 | 33% | 84 |
| kawigi.nano.Lib 1.0 | 34 | 21% | 64 |
| vuen.Cake 2.51 | 20 | 13% | 66 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 8% | 11 |
| urdos.URDOS 1.3 | 11 | 7% | 17 |
| ghent.ArthurPanzergon 1.0.0 | 11 | 7% | 10 |
| adt.Ar1 2.1 | 8 | 5% | 11 |
| oa.weak.FlyMk1 0.1 | 5 | 3% | 9 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 5 | 3% | 7 |

## Melee bench: F04

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 72.3 | 5 / 280 | 3.50 | 14.7% | 39052 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.8% | 253 |
| hadur117.micro.SaorC 0.1 | 2.0 | 14.7% | 5 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.3% | 13 |
| TNT.TNT 0.99.1 | 4.0 | 11.0% | 6 |
| josago.Jorgito 0.16 | 5.0 | 9.4% | 1 |
| css.Delitioner 0.11 | 6.5 | 7.4% | 1 |
| tj.zombie1n 1.0.1 | 6.8 | 6.8% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.7% | 0 |
| sp.Nanos.Ember 1.1 | 9.4 | 4.0% | 0 |
| spin.Bugstard 0.012b | 9.6 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 69.5 | 2 / 35 | 5020 |
| 2 | 2 | 64.0 | 74.3 | 0 / 35 | 4801 |
| 3 | 2 | 64.5 | 73.0 | 1 / 35 | 5128 |
| 4 | 2 | 63.5 | 72.7 | 0 / 35 | 4586 |
| 5 | 2 | 64.2 | 73.0 | 0 / 35 | 4966 |
| 6 | 2 | 61.9 | 67.0 | 1 / 35 | 4588 |
| 7 | 2 | 64.6 | 75.6 | 0 / 35 | 5012 |
| 8 | 2 | 64.0 | 73.0 | 1 / 35 | 4951 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 92 | 1% |
| TNT.TNT 0.99.1 | 3 | 33% |
| css.Delitioner 0.11 | 2 | 50% |
| apc.LeeroyJenkins2 1.0 | 2 | 0% |
| sp.Nanos.Ember 1.1 | 1 | 100% |
| tj.zombie1n 1.0.1 | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 0% |

Hadur died in 275 of 280 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 191 | 69% | 192 |
| apc.LeeroyJenkins2 1.0 | 32 | 12% | 33 |
| josago.Jorgito 0.16 | 23 | 8% | 24 |
| css.Delitioner 0.11 | 9 | 3% | 12 |
| TNT.TNT 0.99.1 | 7 | 3% | 8 |
| tj.zombie1n 1.0.1 | 6 | 2% | 6 |
| sp.Nanos.Ember 1.1 | 4 | 1% | 3 |
| rampancy.Durandal 2.1d | 3 | 1% | 2 |

## Melee bench: F05

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 57.9 | 11 / 280 | 4.79 | 11.8% | 29693 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.2% | 151 |
| justin.DemonicRage 3.4 | 1.8 | 17.3% | 86 |
| wompi.Numbat 2.1 | 3.1 | 13.2% | 22 |
| hadur117.micro.SaorC 0.1 | 3.9 | 11.8% | 11 |
| axeBots.HataMoto 3.09 | 5.1 | 9.1% | 7 |
| ms.Ares 0.19 | 5.9 | 8.8% | 3 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.6% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 6.0% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.7% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.2 | 53.3 | 0 / 35 | 3852 |
| 2 | 4 | 56.3 | 54.0 | 4 / 35 | 3570 |
| 3 | 4 | 58.6 | 62.2 | 1 / 35 | 3641 |
| 4 | 4 | 58.1 | 60.6 | 2 / 35 | 3685 |
| 5 | 4 | 56.3 | 55.6 | 0 / 35 | 3737 |
| 6 | 4 | 56.6 | 55.2 | 1 / 35 | 3761 |
| 7 | 3 | 59.3 | 61.9 | 1 / 35 | 3879 |
| 8 | 4 | 57.7 | 60.0 | 2 / 35 | 3568 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 25 | 12% |
| cb.fire.Firestarter 2.0f | 20 | 5% |
| wompi.Numbat 2.1 | 9 | 67% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 269 of 280 rounds, at a mean tick of 606. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 84 | 31% | 86 |
| justin.DemonicRage 3.4 | 76 | 28% | 79 |
| wompi.Numbat 2.1 | 39 | 14% | 44 |
| ms.Ares 0.19 | 20 | 7% | 20 |
| supersample.SuperBoxBot 1.0 | 15 | 6% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 5% | 14 |
| axeBots.HataMoto 3.09 | 12 | 4% | 13 |
| GarmBox.Oranges 1.0 | 9 | 3% | 9 |

## Melee bench: F06

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 74.9 | 115 / 280 | 3.26 | 15.9% | 33360 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 15.9% | 115 |
| jekl.StoneGhost 0.7 | 2.1 | 14.4% | 42 |
| origin.SleepSiphon 1.7b | 3.1 | 12.9% | 68 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.3 | 11.7% | 17 |
| mld.Wisdom 1.0 | 4.6 | 11.3% | 4 |
| gg.Wolverine 2.0 | 5.9 | 9.4% | 21 |
| DBall.NUKE 0.1 | 7.9 | 6.9% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 6.8% | 10 |
| spinnercat.Omen 1.0 | 8.1 | 6.9% | 2 |
| sample.Fire 1.0 | 10.0 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 73.0 | 11 / 35 | 4237 |
| 2 | 1 | 62.2 | 69.2 | 12 / 35 | 3995 |
| 3 | 1 | 64.1 | 74.6 | 16 / 35 | 4114 |
| 4 | 1 | 65.7 | 81.0 | 15 / 35 | 4250 |
| 5 | 1 | 64.8 | 76.2 | 14 / 35 | 4225 |
| 6 | 1 | 64.1 | 74.9 | 14 / 35 | 4180 |
| 7 | 1 | 64.9 | 75.9 | 15 / 35 | 4498 |
| 8 | 1 | 63.9 | 74.6 | 18 / 35 | 3861 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 60 | 88% |
| origin.SleepSiphon 1.7b | 36 | 39% |
| pe.minimelee.SandboxMiniMelee 1.1 | 22 | 86% |
| gg.Wolverine 2.0 | 18 | 50% |
| mld.Wisdom 1.0 | 7 | 71% |
| spinnercat.Omen 1.0 | 6 | 100% |
| DBall.NUKE 0.1 | 5 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 25% |
| sample.Fire 1.0 | 4 | 75% |

Hadur died in 168 of 280 rounds, at a mean tick of 749. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 42 | 25% | 66 |
| jekl.StoneGhost 0.7 | 31 | 18% | 64 |
| mld.Wisdom 1.0 | 30 | 18% | 40 |
| pe.minimelee.SandboxMiniMelee 1.1 | 23 | 14% | 45 |
| gg.Wolverine 2.0 | 19 | 11% | 28 |
| ers.nano.hawk.HawkLA 3.0m | 9 | 5% | 16 |
| DBall.NUKE 0.1 | 6 | 4% | 10 |
| sample.Fire 1.0 | 6 | 4% | 6 |
| spinnercat.Omen 1.0 | 2 | 1% | 4 |

## Melee bench: F07

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 82.8 | 90 / 280 | 2.55 | 17.9% | 46404 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.8 | 17.9% | 90 |
| rsalesc.melee.Monk 0.3.6c | 1.8 | 17.6% | 76 |
| rtk.Tachikoma 1.0 | 2.5 | 16.5% | 73 |
| franzor.Lizt 1.3.1 | 4.1 | 11.4% | 28 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 9.9% | 17 |
| lrem.micro.MoggFanatic 0.2 | 6.1 | 8.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.8% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.3% | 0 |
| sample.Target 1.0 | 9.3 | 2.9% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 81.6 | 12 / 35 | 6279 |
| 2 | 3 | 67.0 | 79.0 | 7 / 35 | 5646 |
| 3 | 2 | 68.8 | 84.8 | 11 / 35 | 5774 |
| 4 | 1 | 70.1 | 89.8 | 16 / 35 | 5534 |
| 5 | 2 | 68.6 | 80.6 | 11 / 35 | 6107 |
| 6 | 2 | 67.7 | 80.0 | 9 / 35 | 5699 |
| 7 | 1 | 69.1 | 84.8 | 11 / 35 | 5430 |
| 8 | 2 | 68.5 | 81.6 | 13 / 35 | 5935 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 91 | 48% |
| rsalesc.melee.Monk 0.3.6c | 45 | 13% |
| oog.melee.CapuletDroid 1.1 | 26 | 81% |
| franzor.Lizt 1.3.1 | 24 | 63% |
| exauge.GateKeeper 1.1.121g | 4 | 100% |

Hadur died in 193 of 280 rounds, at a mean tick of 1209. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 79 | 41% | 109 |
| rtk.Tachikoma 1.0 | 68 | 35% | 126 |
| oog.melee.CapuletDroid 1.1 | 16 | 8% | 21 |
| franzor.Lizt 1.3.1 | 14 | 7% | 4 |
| lrem.micro.MoggFanatic 0.2 | 9 | 5% | 12 |
| exauge.GateKeeper 1.1.121g | 2 | 1% | 4 |
| skm.PateranBotlock2 1.0 | 2 | 1% | 2 |
3 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 71.2 | 95 / 280 | 3.59 | 15.9% | 38912 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.4 | 15.9% | 95 |
| tm.Yuugao 1.0 | 2.1 | 13.9% | 81 |
| shrub.Vapour v159 | 2.6 | 13.0% | 40 |
| com.spp.robocode.MostlyHarmless 010 | 4.1 | 10.6% | 31 |
| Krabb.sliNk.Garm 0.9u | 5.5 | 9.5% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 6.1 | 9.0% | 13 |
| m3thos.Eva00 1.1 | 6.5 | 8.9% | 6 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 7.2% | 1 |
| SHAM.WOW 1.4 | 8.8 | 6.5% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.9 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 71.4 | 11 / 35 | 4725 |
| 2 | 2 | 61.2 | 64.8 | 9 / 35 | 4639 |
| 3 | 1 | 65.9 | 78.7 | 18 / 35 | 4806 |
| 4 | 1 | 65.4 | 77.1 | 14 / 35 | 5110 |
| 5 | 1 | 67.2 | 80.6 | 17 / 35 | 5278 |
| 6 | 1 | 64.1 | 71.7 | 9 / 35 | 5004 |
| 7 | 1 | 62.8 | 69.5 | 9 / 35 | 4935 |
| 8 | 3 | 58.6 | 55.9 | 8 / 35 | 4415 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 49 | 76% |
| tm.Yuugao 1.0 | 48 | 33% |
| Krabb.sliNk.Garm 0.9u | 20 | 70% |
| jwst.DAD.DarkAndDarker 1.1 | 18 | 78% |
| com.spp.robocode.MostlyHarmless 010 | 14 | 50% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| SHAM.WOW 1.4 | 3 | 100% |
| m3thos.Eva00 1.1 | 1 | 100% |

Hadur died in 185 of 280 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 59 | 32% | 81 |
| shrub.Vapour v159 | 27 | 15% | 57 |
| Krabb.sliNk.Garm 0.9u | 22 | 12% | 28 |
| com.spp.robocode.MostlyHarmless 010 | 19 | 10% | 31 |
| zyx.nano.BacillusComma 1.0 | 15 | 8% | 18 |
| SHAM.WOW 1.4 | 15 | 8% | 18 |
| jwst.DAD.DarkAndDarker 1.1 | 13 | 7% | 28 |
| m3thos.Eva00 1.1 | 8 | 4% | 12 |
| qualidafial.MajorDick 1.0.1 | 7 | 4% | 7 |

## Melee bench: F09

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 64.7 | 39 / 280 | 4.18 | 13.3% | 29575 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.7% | 148 |
| kc.micro.Figment 1.0 | 2.5 | 13.0% | 44 |
| hadur117.micro.SaorC 0.1 | 2.5 | 13.3% | 39 |
| yagami.Tidus 0.11 | 4.5 | 10.9% | 3 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.7% | 20 |
| mc2.enemy.Original 0.9 | 5.8 | 9.4% | 22 |
| dft.Calliope 5.6 | 7.0 | 8.1% | 4 |
| robar.nano.Assertive_Melee 0.2 | 8.6 | 5.7% | 0 |
| step.nanoPri 1.0 | 8.8 | 6.0% | 0 |
| rdm.Dueler 0.4x | 9.6 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.2 | 60.6 | 6 / 35 | 3360 |
| 2 | 2 | 62.1 | 71.4 | 7 / 35 | 3904 |
| 3 | 3 | 58.4 | 62.2 | 3 / 35 | 3696 |
| 4 | 2 | 60.5 | 67.3 | 5 / 35 | 3467 |
| 5 | 2 | 59.0 | 63.5 | 0 / 35 | 3645 |
| 6 | 3 | 60.3 | 64.8 | 4 / 35 | 4118 |
| 7 | 2 | 60.0 | 63.2 | 9 / 35 | 3840 |
| 8 | 3 | 59.0 | 64.4 | 5 / 35 | 3545 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 44 | 11% |
| kc.micro.Figment 1.0 | 42 | 40% |
| mc2.enemy.Original 0.9 | 14 | 36% |
| pedersen.Grishnakh 1.0 | 10 | 50% |
| yagami.Tidus 0.11 | 5 | 100% |
| dft.Calliope 5.6 | 2 | 100% |

Hadur died in 241 of 280 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 82 | 34% | 104 |
| positive.Portia 1.26e | 79 | 33% | 84 |
| yagami.Tidus 0.11 | 25 | 10% | 29 |
| mc2.enemy.Original 0.9 | 21 | 9% | 25 |
| pedersen.Grishnakh 1.0 | 15 | 6% | 18 |
| robar.nano.Assertive_Melee 0.2 | 9 | 4% | 10 |
| rdm.Dueler 0.4x | 5 | 2% | 5 |
| step.nanoPri 1.0 | 4 | 2% | 4 |
| dft.Calliope 5.6 | 1 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 79.9 | 100 / 280 | 2.81 | 16.6% | 39501 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 16.6% | 100 |
| DTF.Kludgy 1.2b | 1.9 | 15.2% | 81 |
| ejb.Polaris 1.0.1 | 3.0 | 13.3% | 44 |
| ne.Chimera 1.2 | 4.0 | 12.4% | 21 |
| vStar.RAFzilla 2.15 | 5.4 | 10.6% | 15 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.8% | 16 |
| sam.Samspin 1.0 | 7.8 | 5.9% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.6% | 0 |
| kurios.DOSexe .9b | 8.3 | 5.6% | 2 |
| donjezza.Muncho 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 80.3 | 17 / 35 | 4903 |
| 2 | 1 | 65.1 | 75.6 | 17 / 35 | 4989 |
| 3 | 1 | 68.4 | 89.2 | 15 / 35 | 5362 |
| 4 | 1 | 65.7 | 83.8 | 10 / 35 | 4718 |
| 5 | 1 | 66.4 | 80.6 | 12 / 35 | 5102 |
| 6 | 2 | 66.7 | 84.8 | 10 / 35 | 4846 |
| 7 | 2 | 61.4 | 65.4 | 9 / 35 | 4422 |
| 8 | 1 | 65.7 | 79.7 | 10 / 35 | 5159 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 63 | 27% |
| ejb.Polaris 1.0.1 | 44 | 55% |
| ne.Chimera 1.2 | 34 | 68% |
| vStar.RAFzilla 2.15 | 18 | 89% |
| tvv.micro.Antares 1.1.1 | 17 | 76% |
| sam.Samspin 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 50% |
| donjezza.Muncho 1.0 | 1 | 100% |

Hadur died in 181 of 280 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 86 | 48% | 101 |
| ejb.Polaris 1.0.1 | 34 | 19% | 58 |
| ne.Chimera 1.2 | 26 | 14% | 53 |
| tvv.micro.Antares 1.1.1 | 14 | 8% | 24 |
| kurios.DOSexe .9b | 8 | 4% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 3% | 6 |
| sam.Samspin 1.0 | 4 | 2% | 7 |
| vStar.RAFzilla 2.15 | 2 | 1% | 16 |
| donjezza.Muncho 1.0 | 1 | 1% | 4 |

## Melee bench: F11

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 68.8 | 50 / 280 | 3.80 | 14.3% | 32192 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.5% | 138 |
| hadur117.micro.SaorC 0.1 | 2.1 | 14.3% | 50 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.0% | 26 |
| djc.DynaBot 0.1.1 | 3.9 | 10.9% | 20 |
| rdt199.Warlord 0.73 | 5.9 | 8.8% | 18 |
| uji.YellohFellah 1.0 | 5.9 | 8.8% | 14 |
| br2.MobyDickBot 1.6 | 6.6 | 8.5% | 13 |
| KiraNL.Chupacabra 0.4 | 7.6 | 8.0% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.1 | 5.9% | 2 |
| stelo.MirrorNano 1.3 | 9.9 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 73.0 | 10 / 35 | 3996 |
| 2 | 3 | 58.2 | 62.2 | 3 / 35 | 3555 |
| 3 | 2 | 61.6 | 72.1 | 6 / 35 | 4016 |
| 4 | 2 | 59.8 | 69.5 | 4 / 35 | 3576 |
| 5 | 2 | 62.0 | 69.5 | 8 / 35 | 4284 |
| 6 | 2 | 61.3 | 66.7 | 7 / 35 | 4444 |
| 7 | 2 | 61.0 | 67.0 | 6 / 35 | 4182 |
| 8 | 2 | 62.0 | 70.8 | 6 / 35 | 4139 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 68 | 13% |
| cx.mini.Nimrod 0.55 | 19 | 63% |
| djc.DynaBot 0.1.1 | 15 | 73% |
| uji.YellohFellah 1.0 | 13 | 38% |
| rdt199.Warlord 0.73 | 11 | 82% |
| br2.MobyDickBot 1.6 | 6 | 50% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 231 of 280 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 118 | 51% | 132 |
| cx.mini.Nimrod 0.55 | 31 | 13% | 37 |
| KiraNL.Chupacabra 0.4 | 22 | 10% | 24 |
| rdt199.Warlord 0.73 | 15 | 6% | 24 |
| jeremyreeder.Vincent 2011.12.09 | 14 | 6% | 14 |
| djc.DynaBot 0.1.1 | 13 | 6% | 17 |
| uji.YellohFellah 1.0 | 11 | 5% | 19 |
| br2.MobyDickBot 1.6 | 4 | 2% | 9 |
| stelo.MirrorNano 1.3 | 3 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 73.2 | 86 / 280 | 3.41 | 15.0% | 28120 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.6 | 15.0% | 86 |
| bts.wiki.RipCurl 0.9b | 2.4 | 14.2% | 63 |
| nat.PallasHawk 1.0 | 2.6 | 13.5% | 59 |
| darkcanuck.Leon 1.01 | 3.4 | 13.2% | 45 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.4% | 17 |
| jrm.Test0 1.0 | 6.6 | 8.2% | 5 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.2% | 1 |
| jp.Perpy 16.0 | 7.3 | 7.3% | 1 |
| stuff.Vlad 0.1 | 9.4 | 5.7% | 1 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.2 | 64.1 | 7 / 35 | 3373 |
| 2 | 1 | 62.6 | 73.0 | 8 / 35 | 3674 |
| 3 | 2 | 60.9 | 69.2 | 10 / 35 | 3346 |
| 4 | 1 | 64.0 | 77.8 | 14 / 35 | 3529 |
| 5 | 1 | 61.9 | 71.4 | 14 / 35 | 3232 |
| 6 | 1 | 64.1 | 75.9 | 12 / 35 | 3789 |
| 7 | 1 | 64.6 | 81.3 | 11 / 35 | 3589 |
| 8 | 2 | 62.4 | 73.0 | 10 / 35 | 3588 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 52 | 52% |
| bts.wiki.RipCurl 0.9b | 42 | 55% |
| darkcanuck.Leon 1.01 | 33 | 64% |
| brainfade.melee.Genghis 0.36 | 11 | 82% |
| jp.Perpy 16.0 | 3 | 100% |
| jrm.Test0 1.0 | 2 | 100% |
| jaybot.bots.Oddball 4.0 | 1 | 0% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 194 of 280 rounds, at a mean tick of 693. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 68 | 35% | 89 |
| nat.PallasHawk 1.0 | 46 | 24% | 70 |
| darkcanuck.Leon 1.01 | 34 | 18% | 62 |
| brainfade.melee.Genghis 0.36 | 15 | 8% | 18 |
| jrm.Test0 1.0 | 13 | 7% | 14 |
| jaybot.bots.Oddball 4.0 | 6 | 3% | 8 |
| jp.Perpy 16.0 | 5 | 3% | 8 |
| cs.sheldor.Talon 1.1 | 4 | 2% | 6 |
| stuff.Vlad 0.1 | 3 | 2% | 4 |

## Melee bench: F13

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 63.8 | 9 / 280 | 4.26 | 12.6% | 30844 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.3 | 17.8% | 93 |
| mn.Combat 3.25.0 | 1.8 | 17.1% | 135 |
| hadur117.micro.SaorC 0.1 | 3.3 | 12.6% | 9 |
| shinh.Entangled 0.3 | 4.1 | 12.0% | 23 |
| gh.micro.Gruweltje 0.7 | 4.6 | 11.7% | 19 |
| apc.Colossus2 0.17 | 6.0 | 8.2% | 0 |
| stelo.Wang 1.0 | 7.3 | 6.7% | 1 |
| ayk.WallHugger 1.0 | 7.9 | 6.1% | 0 |
| maribo.FollowFire 1 | 8.9 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 61.6 | 2 / 35 | 3909 |
| 2 | 3 | 58.9 | 64.1 | 1 / 35 | 3674 |
| 3 | 3 | 59.0 | 62.9 | 0 / 35 | 3956 |
| 4 | 3 | 61.9 | 73.3 | 3 / 35 | 4134 |
| 5 | 3 | 61.4 | 67.9 | 1 / 35 | 4226 |
| 6 | 5 | 56.1 | 55.9 | 0 / 35 | 3608 |
| 7 | 3 | 58.9 | 63.5 | 2 / 35 | 3611 |
| 8 | 3 | 58.3 | 61.0 | 0 / 35 | 3726 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 32 | 9% |
| mn.Combat 3.25.0 | 19 | 5% |
| shinh.Entangled 0.3 | 8 | 50% |
| gh.micro.Gruweltje 0.7 | 3 | 33% |

Hadur died in 271 of 280 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 91 | 34% | 94 |
| mn.Combat 3.25.0 | 80 | 30% | 82 |
| shinh.Entangled 0.3 | 30 | 11% | 33 |
| gh.micro.Gruweltje 0.7 | 30 | 11% | 31 |
| stelo.Wang 1.0 | 13 | 5% | 13 |
| ayk.WallHugger 1.0 | 12 | 4% | 12 |
| maribo.FollowFire 1 | 8 | 3% | 8 |
| apc.Colossus2 0.17 | 4 | 1% | 4 |
| sample.Tracker 1.0 | 3 | 1% | 3 |

## Melee bench: F14

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 73.2 | 133 / 280 | 3.41 | 16.3% | 38736 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 16.3% | 133 |
| simonton.micro.Sprout 1.1.3 | 1.9 | 14.9% | 46 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.8% | 61 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.8 | 10.2% | 4 |
| sanyi.mikrobi.Roberto 1.0 | 5.3 | 10.0% | 11 |
| Lo_Ian.Gandalf_V4 4.0 | 6.0 | 9.7% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 6.0 | 9.6% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 8.0% | 11 |
| pa.Improved 1.0 | 9.0 | 6.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 76.8 | 18 / 35 | 4977 |
| 2 | 2 | 60.5 | 60.6 | 15 / 35 | 4099 |
| 3 | 1 | 63.8 | 68.6 | 14 / 35 | 4868 |
| 4 | 1 | 65.5 | 79.4 | 18 / 35 | 4450 |
| 5 | 1 | 66.5 | 77.5 | 19 / 35 | 4961 |
| 6 | 1 | 63.1 | 67.3 | 10 / 35 | 5064 |
| 7 | 1 | 66.0 | 78.7 | 17 / 35 | 4685 |
| 8 | 1 | 67.7 | 76.8 | 22 / 35 | 5632 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 95 | 83% |
| catcat20.shape.Theta 0.018 | 46 | 46% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 91% |
| sanyi.mikrobi.Roberto 1.0 | 8 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 147 of 280 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 64 | 44% | 142 |
| catcat20.shape.Theta 0.018 | 42 | 29% | 62 |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 7% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 6% | 11 |
| sanyi.mikrobi.Roberto 1.0 | 7 | 5% | 20 |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 4% | 9 |
| sample.TrackFire 1.0 | 4 | 3% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 2% | 11 |
| pa.Improved 1.0 | 1 | 1% | 6 |

## Melee bench: F15

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 82.7 | 142 / 280 | 2.56 | 18.7% | 44882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.7% | 142 |
| kawigi.micro.Shiz 1.1 | 2.6 | 13.4% | 23 |
| emp.Yngwie 1.11 | 3.0 | 12.9% | 68 |
| mld.DustBunny 3.8 | 3.4 | 12.5% | 13 |
| kawigi.robot.Girl 1.2 | 5.0 | 9.7% | 19 |
| cb.nano.Insomnia 1.0 | 6.3 | 8.7% | 12 |
| lambdaxy.TBot 0.1 | 7.4 | 7.2% | 1 |
| Grystrion.TrackerWO 1.0 | 7.4 | 7.3% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 5.2% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 83.2 | 18 / 35 | 5719 |
| 2 | 1 | 69.6 | 87.0 | 25 / 35 | 5503 |
| 3 | 1 | 65.2 | 74.9 | 14 / 35 | 5202 |
| 4 | 1 | 68.4 | 82.2 | 19 / 35 | 5507 |
| 5 | 1 | 68.4 | 81.0 | 16 / 35 | 5906 |
| 6 | 1 | 68.9 | 87.3 | 15 / 35 | 5653 |
| 7 | 1 | 68.7 | 84.4 | 18 / 35 | 5614 |
| 8 | 1 | 68.4 | 81.3 | 17 / 35 | 5778 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 64 | 44% |
| kawigi.micro.Shiz 1.1 | 49 | 96% |
| kawigi.robot.Girl 1.2 | 31 | 94% |
| mld.DustBunny 3.8 | 25 | 84% |
| cb.nano.Insomnia 1.0 | 17 | 71% |
| divineomega.TrialBot 0.003 | 2 | 100% |
| lambdaxy.TBot 0.1 | 2 | 50% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 138 of 280 rounds, at a mean tick of 991. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 53 | 38% | 94 |
| cb.nano.Insomnia 1.0 | 27 | 20% | 21 |
| mld.DustBunny 3.8 | 22 | 16% | 49 |
| kawigi.micro.Shiz 1.1 | 11 | 8% | 47 |
| kawigi.robot.Girl 1.2 | 8 | 6% | 29 |
| Grystrion.TrackerWO 1.0 | 7 | 5% | 13 |
| lambdaxy.TBot 0.1 | 5 | 4% | 14 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 4 | 3% | 5 |
| divineomega.TrialBot 0.003 | 1 | 1% | 8 |

## Melee bench: F16

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 77.9 | 60 / 280 | 2.99 | 16.6% | 39184 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.1 | 17.1% | 131 |
| hadur117.micro.SaorC 0.1 | 1.9 | 16.6% | 60 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.3% | 14 |
| techdude.forest.FlamingForest 1.1 | 4.1 | 11.2% | 56 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.1% | 10 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.0% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 7.3% | 2 |
| repositorio.NanoStep 1.0 | 8.8 | 5.2% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.0% | 5 |
| asd.Cthulhu 1.3 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 78.7 | 6 / 35 | 4700 |
| 2 | 2 | 66.2 | 79.7 | 10 / 35 | 4892 |
| 3 | 2 | 66.1 | 78.1 | 10 / 35 | 4974 |
| 4 | 2 | 65.4 | 76.5 | 9 / 35 | 4846 |
| 5 | 1 | 66.3 | 78.7 | 7 / 35 | 5292 |
| 6 | 2 | 63.9 | 72.1 | 6 / 35 | 4722 |
| 7 | 2 | 68.0 | 84.8 | 7 / 35 | 5348 |
| 8 | 2 | 63.9 | 74.9 | 5 / 35 | 4410 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 97 | 19% |
| techdude.forest.FlamingForest 1.1 | 32 | 28% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 21 | 95% |
| stelo.IntrinsicVolatility 1.4 | 6 | 100% |
| tvv.nano.Polaris 1.2 | 5 | 60% |
| bvh.fnr.Fenrir 0.36l | 2 | 100% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |

Hadur died in 220 of 280 rounds, at a mean tick of 1257. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 104 | 47% | 127 |
| techdude.forest.FlamingForest 1.1 | 34 | 15% | 44 |
| bvh.fnr.Fenrir 0.36l | 26 | 12% | 28 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 23 | 10% | 41 |
| tvv.nano.Polaris 1.2 | 13 | 6% | 13 |
| stelo.IntrinsicVolatility 1.4 | 10 | 5% | 10 |
| divineomega.DivineBot 1.9.4.5 | 6 | 3% | 10 |
| asd.Cthulhu 1.3 | 2 | 1% | 4 |
| repositorio.NanoStep 1.0 | 2 | 1% | 3 |

## Melee bench: F17

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 78.0 | 93 / 280 | 2.98 | 16.3% | 35166 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.3% | 93 |
| et.Predator 1.8 | 2.8 | 13.3% | 34 |
| oog.melee.Mercutio 1.0 | 3.3 | 12.8% | 46 |
| cx.BlestPain 1.41 | 3.9 | 12.1% | 57 |
| nic.Nicator 2.4 | 4.6 | 11.7% | 37 |
| ahf.NanoAndrew .4 | 5.5 | 10.8% | 11 |
| maribo.melee.BMV 0.1 | 7.0 | 8.6% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.9% | 1 |
| tex.Longbot 0.4 | 8.5 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 80.3 | 15 / 35 | 4515 |
| 2 | 1 | 64.4 | 79.0 | 11 / 35 | 3824 |
| 3 | 1 | 63.0 | 73.0 | 10 / 35 | 4184 |
| 4 | 1 | 63.4 | 70.5 | 9 / 35 | 4472 |
| 5 | 1 | 66.4 | 81.6 | 10 / 35 | 4766 |
| 6 | 1 | 67.6 | 83.8 | 15 / 35 | 4821 |
| 7 | 1 | 66.4 | 84.4 | 13 / 35 | 4590 |
| 8 | 1 | 62.4 | 71.1 | 10 / 35 | 3994 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cx.BlestPain 1.41 | 44 | 16% |
| et.Predator 1.8 | 40 | 73% |
| oog.melee.Mercutio 1.0 | 39 | 67% |
| nic.Nicator 2.4 | 29 | 41% |
| ahf.NanoAndrew .4 | 17 | 88% |
| maribo.melee.BMV 0.1 | 5 | 80% |

Hadur died in 187 of 280 rounds, at a mean tick of 1069. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 51 | 27% | 61 |
| et.Predator 1.8 | 36 | 19% | 69 |
| oog.melee.Mercutio 1.0 | 35 | 19% | 55 |
| nic.Nicator 2.4 | 27 | 14% | 39 |
| ahf.NanoAndrew .4 | 18 | 10% | 34 |
| maribo.melee.BMV 0.1 | 8 | 4% | 9 |
| tex.Longbot 0.4 | 8 | 4% | 8 |
| goblin.Bender 2.4 | 4 | 2% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 78.6 | 127 / 280 | 2.93 | 16.8% | 34165 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.8% | 127 |
| morbid.MorbidPriest 1.0 | 2.1 | 13.3% | 51 |
| agd.Mooserwirt2 2.7 | 3.4 | 11.5% | 41 |
| uji.DBH 1.1 | 4.0 | 11.2% | 26 |
| ratosh.Nobo 0.21 | 4.9 | 10.3% | 4 |
| spinnercat.Robovirus 2.718 | 5.8 | 9.7% | 9 |
| sigterm.Sigterm 1.0 | 7.0 | 8.4% | 12 |
| kawigi.mini.Fhqwhgads 1.1 | 7.9 | 7.3% | 2 |
| stelo.WangRobot 1.0 | 9.4 | 5.8% | 8 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.6 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 75.9 | 11 / 35 | 4475 |
| 2 | 1 | 63.3 | 73.0 | 15 / 35 | 4040 |
| 3 | 1 | 66.3 | 81.3 | 19 / 35 | 4313 |
| 4 | 1 | 67.4 | 86.3 | 19 / 35 | 4282 |
| 5 | 1 | 66.4 | 82.9 | 18 / 35 | 4479 |
| 6 | 1 | 63.4 | 71.4 | 16 / 35 | 4168 |
| 7 | 1 | 66.9 | 84.8 | 18 / 35 | 4296 |
| 8 | 1 | 62.6 | 73.3 | 11 / 35 | 4112 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 54 | 59% |
| agd.Mooserwirt2 2.7 | 37 | 41% |
| uji.DBH 1.1 | 34 | 68% |
| sigterm.Sigterm 1.0 | 17 | 76% |
| spinnercat.Robovirus 2.718 | 17 | 100% |
| ratosh.Nobo 0.21 | 12 | 100% |
| stelo.WangRobot 1.0 | 9 | 67% |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 153 of 280 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 49 | 32% | 89 |
| agd.Mooserwirt2 2.7 | 34 | 22% | 59 |
| uji.DBH 1.1 | 23 | 15% | 36 |
| ratosh.Nobo 0.21 | 15 | 10% | 25 |
| kawigi.mini.Fhqwhgads 1.1 | 11 | 7% | 19 |
| sigterm.Sigterm 1.0 | 7 | 5% | 18 |
| stelo.WangRobot 1.0 | 7 | 5% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 3% | 7 |
| spinnercat.Robovirus 2.718 | 3 | 2% | 15 |

## Melee bench: F19

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 91.2 | 205 / 280 | 1.79 | 20.5% | 45750 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.5% | 205 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.4 | 14.4% | 33 |
| mld.Infinity 2.2 | 2.6 | 14.0% | 30 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.5% | 9 |
| erdnis.Rover 0.3 | 4.8 | 10.7% | 1 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.6% | 2 |
| mbh.Mbh 0.1 | 7.6 | 6.8% | 1 |
| pac.ABC 2.1 | 7.8 | 6.6% | 0 |
| pbg.R2D2 1.0 | 8.6 | 5.8% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.0 | 24 / 35 | 5609 |
| 2 | 1 | 70.7 | 87.9 | 25 / 35 | 5917 |
| 3 | 1 | 71.9 | 94.0 | 24 / 35 | 5878 |
| 4 | 1 | 70.2 | 83.8 | 25 / 35 | 5681 |
| 5 | 1 | 72.6 | 95.2 | 28 / 35 | 5758 |
| 6 | 1 | 71.5 | 91.7 | 28 / 35 | 5739 |
| 7 | 1 | 71.3 | 92.1 | 25 / 35 | 5672 |
| 8 | 1 | 71.3 | 92.1 | 26 / 35 | 5496 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 107 | 81% |
| mld.Infinity 2.2 | 86 | 91% |
| krillr.mini.JointStrike 2.0.0 | 22 | 86% |
| erdnis.Rover 0.3 | 8 | 88% |
| patson.PatsonTestBot 1.0 | 8 | 100% |
| pac.ABC 2.1 | 3 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |
| mbh.Mbh 0.1 | 1 | 0% |

Hadur died in 77 of 280 rounds, at a mean tick of 996. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 32 | 42% | 136 |
| mld.Infinity 2.2 | 15 | 19% | 26 |
| krillr.mini.JointStrike 2.0.0 | 13 | 17% | 44 |
| patson.PatsonTestBot 1.0 | 5 | 6% | 17 |
| mbh.Mbh 0.1 | 5 | 6% | 15 |
| erdnis.Rover 0.3 | 4 | 5% | 16 |
| pac.ABC 2.1 | 2 | 3% | 12 |
| pbg.R2D2 1.0 | 0 | 0% | 10 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 80.2 | 111 / 280 | 2.78 | 17.3% | 39266 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 17.3% | 111 |
| trm.Wrekt 1.1.6.f | 1.8 | 16.1% | 88 |
| fwb.Nine 1.0.1 | 3.0 | 12.3% | 35 |
| nz.jdc.nano.GridFu 1.0 | 4.1 | 10.5% | 7 |
| catcat20.Rabbit 0.001 | 4.9 | 10.0% | 27 |
| m3thos.mini.Eva01 0.5.5 | 6.9 | 8.2% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.9 | 8.0% | 2 |
| bayen.nut.Squirrel 1.615 | 7.3 | 7.6% | 9 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 77.1 | 16 / 35 | 4482 |
| 2 | 1 | 67.1 | 81.3 | 15 / 35 | 5402 |
| 3 | 2 | 64.5 | 74.0 | 13 / 35 | 4797 |
| 4 | 1 | 67.5 | 83.5 | 12 / 35 | 5291 |
| 5 | 1 | 66.2 | 81.6 | 13 / 35 | 4809 |
| 6 | 1 | 67.6 | 85.7 | 14 / 35 | 5156 |
| 7 | 1 | 67.8 | 86.0 | 17 / 35 | 4928 |
| 8 | 2 | 63.9 | 72.4 | 11 / 35 | 4401 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 84 | 52% |
| fwb.Nine 1.0.1 | 36 | 64% |
| catcat20.Rabbit 0.001 | 27 | 56% |
| nz.jdc.nano.GridFu 1.0 | 17 | 88% |
| bayen.nut.Squirrel 1.615 | 8 | 75% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |

Hadur died in 171 of 280 rounds, at a mean tick of 1036. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 81 | 47% | 114 |
| fwb.Nine 1.0.1 | 29 | 17% | 44 |
| catcat20.Rabbit 0.001 | 19 | 11% | 38 |
| nz.jdc.nano.GridFu 1.0 | 18 | 11% | 33 |
| bayen.nut.Squirrel 1.615 | 10 | 6% | 20 |
| m3thos.mini.Eva01 0.5.5 | 5 | 3% | 9 |
| ntc.ControlledChaos 1.1.4 | 4 | 2% | 6 |
| djdjdj.NanoSkunk10 1.0 | 3 | 2% | 13 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.9 | 133 / 280 | 2.18 | 19.1% | 43921 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.1% | 133 |
| eem.EvBot v4.6.16 | 2.0 | 16.7% | 122 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.8% | 14 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.4% | 4 |
| eld.Hmm 1.0 | 5.3 | 8.1% | 6 |
| oa.weak.BotherBot 0.1 | 6.1 | 7.7% | 2 |
| el.JumpShoot 0.2 | 7.5 | 6.5% | 0 |
| fire219.CatBot 1.0 | 8.0 | 6.3% | 0 |
| PSW.Relentless 0.1 | 8.3 | 6.0% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 84.1 | 14 / 35 | 5271 |
| 2 | 1 | 70.1 | 91.1 | 15 / 35 | 5793 |
| 3 | 1 | 68.0 | 84.4 | 19 / 35 | 4736 |
| 4 | 1 | 68.9 | 87.3 | 16 / 35 | 5241 |
| 5 | 1 | 68.7 | 82.5 | 14 / 35 | 5966 |
| 6 | 1 | 70.6 | 89.8 | 20 / 35 | 5779 |
| 7 | 1 | 68.8 | 85.4 | 16 / 35 | 5443 |
| 8 | 1 | 70.2 | 90.8 | 19 / 35 | 5692 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 129 | 41% |
| dummy.mini.Scimitar 1.01 | 44 | 93% |
| cf.RiO.RiOx 4.2.1 | 25 | 92% |
| eld.Hmm 1.0 | 11 | 91% |
| oa.weak.BotherBot 0.1 | 5 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 148 of 280 rounds, at a mean tick of 1278. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 102 | 69% | 139 |
| dummy.mini.Scimitar 1.01 | 22 | 15% | 69 |
| cf.RiO.RiOx 4.2.1 | 6 | 4% | 25 |
| fire219.CatBot 1.0 | 6 | 4% | 8 |
| eld.Hmm 1.0 | 4 | 3% | 22 |
| arthord.MannyPacquiao Beta | 3 | 2% | 5 |
| PSW.Relentless 0.1 | 3 | 2% | 3 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 7 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 78.9 | 110 / 280 | 2.90 | 17.9% | 44703 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.4 | 17.9% | 110 |
| pe.SandboxLump 1.52 | 1.6 | 17.4% | 108 |
| cre.Karolos 0.32 | 3.0 | 14.3% | 38 |
| stelo.AreaTargetingBot 1.1 | 5.0 | 9.7% | 12 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.5% | 8 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.3% | 2 |
| cw.megas.Blade 0.8 | 6.8 | 8.5% | 0 |
| sample.Walls 1.0 | 7.5 | 7.9% | 2 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.7% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 77.5 | 14 / 35 | 5387 |
| 2 | 2 | 66.1 | 74.6 | 8 / 35 | 5233 |
| 3 | 1 | 68.1 | 76.8 | 17 / 35 | 5835 |
| 4 | 2 | 67.5 | 76.8 | 13 / 35 | 5193 |
| 5 | 2 | 68.7 | 80.0 | 12 / 35 | 5643 |
| 6 | 1 | 68.8 | 81.9 | 17 / 35 | 5335 |
| 7 | 1 | 68.7 | 81.9 | 12 / 35 | 5878 |
| 8 | 1 | 69.5 | 81.9 | 17 / 35 | 6199 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 108 | 50% |
| cre.Karolos 0.32 | 44 | 64% |
| stelo.AreaTargetingBot 1.1 | 17 | 76% |
| stelo.RamTrackSurfer 1.2 | 7 | 86% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 170 of 280 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 87 | 51% | 142 |
| cre.Karolos 0.32 | 38 | 22% | 66 |
| stelo.AreaTargetingBot 1.1 | 13 | 8% | 23 |
| cw.megas.Blade 0.8 | 9 | 5% | 11 |
| stelo.RamTrackSurfer 1.2 | 8 | 5% | 17 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 4% | 13 |
| sample.Walls 1.0 | 7 | 4% | 7 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F24

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 70.2 | 48 / 280 | 3.69 | 14.1% | 29937 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 2.1 | 14.3% | 64 |
| hadur117.micro.SaorC 0.1 | 2.3 | 14.1% | 48 |
| florent.XSeries.X2 0.12 | 2.6 | 14.0% | 68 |
| davidalves.Phoenix 0.54 | 3.3 | 13.2% | 66 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.4% | 24 |
| oog.melee.Corsair 1.0 | 6.0 | 8.9% | 4 |
| lunchie.Lunchbox 0.93 | 7.5 | 6.9% | 0 |
| stelo.SoJNanoMelee 1.1 | 7.9 | 6.6% | 7 |
| as.FrankTheTank 1.3 | 9.1 | 5.7% | 0 |
| evd.X1 0.01 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.4 | 69.8 | 7 / 35 | 3779 |
| 2 | 1 | 62.8 | 74.3 | 8 / 35 | 3979 |
| 3 | 3 | 61.2 | 68.9 | 8 / 35 | 3772 |
| 4 | 3 | 61.1 | 71.1 | 6 / 35 | 3655 |
| 5 | 3 | 61.2 | 69.2 | 3 / 35 | 3900 |
| 6 | 3 | 60.7 | 71.4 | 6 / 35 | 3473 |
| 7 | 3 | 57.3 | 61.0 | 3 / 35 | 3450 |
| 8 | 1 | 63.1 | 75.6 | 7 / 35 | 3929 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 40 | 50% |
| davidalves.Phoenix 0.54 | 32 | 16% |
| florent.XSeries.X2 0.12 | 25 | 20% |
| pedersen.Ugluk 1.1.1 | 14 | 57% |
| stelo.SoJNanoMelee 1.1 | 8 | 100% |
| oog.melee.Corsair 1.0 | 3 | 33% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 232 of 280 rounds, at a mean tick of 728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 70 | 30% | 73 |
| rz.GlowBlowMelee 1.4 | 52 | 22% | 69 |
| davidalves.Phoenix 0.54 | 51 | 22% | 62 |
| pedersen.Ugluk 1.1.1 | 21 | 9% | 30 |
| oog.melee.Corsair 1.0 | 13 | 6% | 14 |
| stelo.SoJNanoMelee 1.1 | 10 | 4% | 13 |
| evd.X1 0.01 | 6 | 3% | 6 |
| lunchie.Lunchbox 0.93 | 5 | 2% | 7 |
| as.FrankTheTank 1.3 | 4 | 2% | 6 |

## Melee bench: F25

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 77.7 | 151 / 280 | 3.01 | 16.8% | 31905 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.8% | 151 |
| voidious.mini.BrokenSword 2.0.3 | 2.1 | 14.0% | 35 |
| voidious.micro.BlitzBat 1.05 | 3.3 | 12.3% | 18 |
| jdw.Hurricane 1.4 | 3.9 | 11.8% | 35 |
| gre.svman4.Morfeas 1.4.1 | 5.0 | 10.4% | 22 |
| ds.Oo 2.2 | 5.9 | 8.9% | 9 |
| gjr.Cephalosporin 0.1 | 7.3 | 7.4% | 5 |
| awesomeness.Elite 1.0 | 8.0 | 7.1% | 4 |
| adt.Ar2 1.1 | 8.6 | 6.6% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.1 | 67.3 | 14 / 35 | 3593 |
| 2 | 1 | 66.1 | 79.7 | 19 / 35 | 4179 |
| 3 | 1 | 64.3 | 73.0 | 18 / 35 | 3946 |
| 4 | 1 | 69.6 | 89.8 | 26 / 35 | 4591 |
| 5 | 1 | 64.2 | 75.6 | 16 / 35 | 3761 |
| 6 | 1 | 64.4 | 75.6 | 18 / 35 | 3803 |
| 7 | 1 | 65.6 | 79.4 | 18 / 35 | 3931 |
| 8 | 1 | 66.7 | 81.0 | 22 / 35 | 4101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 67 | 82% |
| voidious.micro.BlitzBat 1.05 | 50 | 94% |
| jdw.Hurricane 1.4 | 28 | 79% |
| gre.svman4.Morfeas 1.4.1 | 12 | 92% |
| ds.Oo 2.2 | 7 | 100% |
| awesomeness.Elite 1.0 | 5 | 80% |
| gjr.Cephalosporin 0.1 | 3 | 100% |
| adt.Ar2 1.1 | 2 | 100% |

Hadur died in 129 of 280 rounds, at a mean tick of 503. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 31 | 24% | 53 |
| voidious.mini.BrokenSword 2.0.3 | 29 | 22% | 77 |
| voidious.micro.BlitzBat 1.05 | 21 | 16% | 57 |
| ds.Oo 2.2 | 16 | 12% | 29 |
| awesomeness.Elite 1.0 | 9 | 7% | 15 |
| gre.svman4.Morfeas 1.4.1 | 7 | 5% | 19 |
| adt.Ar2 1.1 | 7 | 5% | 11 |
| amk.ChumbaMini 0.2 | 5 | 4% | 7 |
| gjr.Cephalosporin 0.1 | 4 | 3% | 12 |

## Melee bench: F26

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 77.2 | 99 / 280 | 3.05 | 16.3% | 38668 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.4 | 16.3% | 99 |
| ak.Fermat 2.0 | 1.6 | 16.0% | 84 |
| lrem.Spectre 0.4.4 | 3.4 | 12.9% | 35 |
| shu.nitro.LENIN .T34 | 4.0 | 12.2% | 44 |
| js.PinBall 1.6 | 5.0 | 10.8% | 10 |
| gh.mini.GrubbmOne 1.0 | 5.9 | 9.6% | 5 |
| jaybot.adv.bots.JayBot 2.0 | 6.9 | 8.5% | 4 |
| fullsail.LaxativeTeaTwo 1.0 | 8.1 | 6.6% | 0 |
| sample.SpinBot 1.0 | 8.8 | 5.1% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 76.8 | 13 / 35 | 4552 |
| 2 | 1 | 65.2 | 75.6 | 14 / 35 | 4756 |
| 3 | 1 | 66.5 | 80.0 | 14 / 35 | 4968 |
| 4 | 1 | 66.4 | 77.8 | 13 / 35 | 5255 |
| 5 | 2 | 65.1 | 75.6 | 11 / 35 | 4789 |
| 6 | 1 | 66.7 | 81.0 | 11 / 35 | 4769 |
| 7 | 2 | 63.3 | 71.7 | 12 / 35 | 4501 |
| 8 | 2 | 66.1 | 79.0 | 11 / 35 | 5078 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 54 | 43% |
| lrem.Spectre 0.4.4 | 42 | 71% |
| shu.nitro.LENIN .T34 | 40 | 53% |
| js.PinBall 1.6 | 14 | 79% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 83% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 100% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 181 of 280 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 73 | 40% | 99 |
| shu.nitro.LENIN .T34 | 43 | 24% | 64 |
| lrem.Spectre 0.4.4 | 20 | 11% | 41 |
| js.PinBall 1.6 | 20 | 11% | 32 |
| fullsail.LaxativeTeaTwo 1.0 | 8 | 4% | 14 |
| sample.SpinBot 1.0 | 7 | 4% | 7 |
| gh.mini.GrubbmOne 1.0 | 6 | 3% | 11 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 2% | 10 |

## Melee bench: F27

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 78.1 | 133 / 280 | 2.98 | 16.6% | 33227 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.4 | 16.6% | 133 |
| mk.Alpha 0.2.1 | 1.9 | 14.6% | 77 |
| wee.Gem 1.8.4 | 3.8 | 11.5% | 36 |
| EH.Eagle 1.0.6 | 4.4 | 10.7% | 10 |
| sheldor.melee.nano.TestMelee 0.1 | 4.6 | 10.3% | 15 |
| joe.ADinosaur 1.0 | 5.9 | 9.3% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 6.5 | 9.0% | 4 |
| throxbot.ThroxBot 0.1 | 8.4 | 7.2% | 1 |
| caimano.Furia_Ceca 0.22 | 8.9 | 5.9% | 0 |
| cs.Grudge 1.0 | 9.4 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.2 | 45.7 | 6 / 35 | 3585 |
| 2 | 1 | 64.0 | 74.3 | 16 / 35 | 4123 |
| 3 | 1 | 66.5 | 82.9 | 19 / 35 | 4291 |
| 4 | 1 | 66.6 | 85.4 | 19 / 35 | 4184 |
| 5 | 1 | 66.3 | 83.8 | 21 / 35 | 3945 |
| 6 | 1 | 67.3 | 83.8 | 16 / 35 | 4777 |
| 7 | 1 | 67.7 | 88.6 | 18 / 35 | 4217 |
| 8 | 1 | 65.4 | 80.0 | 18 / 35 | 4105 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 90 | 63% |
| EH.Eagle 1.0.6 | 30 | 100% |
| wee.Gem 1.8.4 | 29 | 76% |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 70% |
| joe.ADinosaur 1.0 | 9 | 89% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 75% |
| throxbot.ThroxBot 0.1 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 150 of 280 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 51 | 34% | 110 |
| sheldor.melee.nano.TestMelee 0.1 | 22 | 15% | 32 |
| wee.Gem 1.8.4 | 18 | 12% | 43 |
| joe.ADinosaur 1.0 | 18 | 12% | 22 |
| EH.Eagle 1.0.6 | 11 | 7% | 34 |
| cs.Grudge 1.0 | 8 | 5% | 7 |
| throxbot.ThroxBot 0.1 | 7 | 5% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 7 | 5% | 11 |
| caimano.Furia_Ceca 0.22 | 6 | 4% | 7 |
2 death(s) with no robot to name.

## Melee bench: F28

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 83.0 | 145 / 280 | 2.53 | 17.3% | 31908 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.3% | 145 |
| kid.test.NightFox .2 | 2.0 | 15.5% | 65 |
| uji.Antique 1.0 | 3.4 | 11.8% | 33 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.7% | 24 |
| pfvicm.Sobieski 7.2.3b | 4.6 | 10.3% | 2 |
| ahr.ice.Ice 1.0.2 | 6.1 | 8.6% | 6 |
| amk.ChumbaWumba 0.3 | 6.8 | 7.9% | 2 |
| matt.advanced.Katana 1.0 | 8.3 | 6.7% | 3 |
| stelo.PianistNano 1.2 | 9.3 | 5.8% | 0 |
| stelo.Lifestealer 1.0 | 9.4 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 84.1 | 19 / 35 | 3367 |
| 2 | 1 | 66.9 | 86.0 | 19 / 35 | 3845 |
| 3 | 1 | 64.4 | 75.2 | 15 / 35 | 4108 |
| 4 | 1 | 67.8 | 87.3 | 23 / 35 | 4080 |
| 5 | 1 | 65.2 | 79.4 | 15 / 35 | 4048 |
| 6 | 1 | 67.7 | 86.3 | 21 / 35 | 4289 |
| 7 | 1 | 67.2 | 88.6 | 14 / 35 | 4245 |
| 8 | 1 | 64.7 | 76.8 | 19 / 35 | 3926 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 104 | 70% |
| uji.Antique 1.0 | 47 | 79% |
| qohnil.blot.BlotBot 3.61 | 25 | 36% |
| ahr.ice.Ice 1.0.2 | 11 | 91% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| amk.ChumbaWumba 0.3 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 137 of 280 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 40 | 29% | 100 |
| qohnil.blot.BlotBot 3.61 | 28 | 20% | 42 |
| pfvicm.Sobieski 7.2.3b | 28 | 20% | 37 |
| uji.Antique 1.0 | 22 | 16% | 59 |
| ahr.ice.Ice 1.0.2 | 5 | 4% | 17 |
| stelo.Lifestealer 1.0 | 5 | 4% | 6 |
| amk.ChumbaWumba 0.3 | 4 | 3% | 9 |
| stelo.PianistNano 1.2 | 3 | 2% | 3 |
| matt.advanced.Katana 1.0 | 2 | 1% | 7 |

## Melee bench: F29

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 73.8 | 85 / 280 | 3.36 | 15.7% | 33044 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.4 | 16.0% | 98 |
| hadur117.micro.SaorC 0.1 | 1.9 | 15.7% | 85 |
| deewiant.Anomaly 0.2 | 2.9 | 14.3% | 59 |
| myl.micro.Troodon 1.10 | 4.1 | 11.8% | 12 |
| jok.PheonixM 0.1.2 | 4.9 | 10.0% | 8 |
| ph.melee.ArcherME 0.3 | 6.1 | 8.4% | 1 |
| DBall.Anarchy 0.1 | 7.0 | 7.5% | 14 |
| fullsail.TimbotNoPrediction 1.0 | 7.9 | 6.1% | 0 |
| ap.Frederick 1.1 | 9.1 | 5.4% | 3 |
| jangs.ns51 1.0 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 72.4 | 11 / 35 | 3687 |
| 2 | 2 | 64.4 | 74.9 | 8 / 35 | 4239 |
| 3 | 1 | 65.5 | 75.9 | 15 / 35 | 4455 |
| 4 | 1 | 64.1 | 74.6 | 13 / 35 | 3974 |
| 5 | 2 | 62.5 | 70.5 | 9 / 35 | 3883 |
| 6 | 2 | 64.7 | 73.7 | 12 / 35 | 4424 |
| 7 | 2 | 64.3 | 74.3 | 9 / 35 | 4308 |
| 8 | 3 | 64.2 | 74.3 | 8 / 35 | 4074 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 64 | 53% |
| zyx.mega.YersiniaPestis 3.1 | 51 | 29% |
| myl.micro.Troodon 1.10 | 19 | 100% |
| jok.PheonixM 0.1.2 | 9 | 78% |
| DBall.Anarchy 0.1 | 6 | 100% |
| ap.Frederick 1.1 | 4 | 50% |
| ph.melee.ArcherME 0.3 | 1 | 0% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 196 of 280 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 79 | 40% | 91 |
| deewiant.Anomaly 0.2 | 69 | 35% | 107 |
| myl.micro.Troodon 1.10 | 14 | 7% | 33 |
| jok.PheonixM 0.1.2 | 14 | 7% | 21 |
| ph.melee.ArcherME 0.3 | 8 | 4% | 9 |
| DBall.Anarchy 0.1 | 4 | 2% | 12 |
| fullsail.TimbotNoPrediction 1.0 | 4 | 2% | 4 |
| jangs.ns51 1.0 | 2 | 1% | 2 |
| ap.Frederick 1.1 | 2 | 1% | 0 |

## Melee bench: F30

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.3 | 51.7 | 25 / 280 | 5.34 | 11.0% | 28422 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 1.8 | 14.1% | 66 |
| catcat20.Matcha 0.006 | 2.0 | 13.8% | 78 |
| stelo.PastFuture 2.3.2 | 2.9 | 12.8% | 39 |
| oog.melee.Capulet 1.2 | 3.4 | 12.8% | 46 |
| hadur117.micro.SaorC 0.1 | 5.0 | 11.0% | 25 |
| intruder.PrairieWolf 2.61 | 6.1 | 9.1% | 14 |
| tripphippy.Alice 1.1 | 7.9 | 7.7% | 4 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 7.9% | 8 |
| ntc.Opposite 1.5 | 8.0 | 7.9% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.4 | 51.4 | 6 / 35 | 3233 |
| 2 | 5 | 57.6 | 56.8 | 5 / 35 | 3897 |
| 3 | 5 | 53.9 | 51.1 | 3 / 35 | 3507 |
| 4 | 5 | 53.8 | 52.4 | 4 / 35 | 3366 |
| 5 | 5 | 51.1 | 43.2 | 2 / 35 | 3605 |
| 6 | 5 | 53.8 | 50.2 | 1 / 35 | 3857 |
| 7 | 5 | 53.8 | 52.1 | 1 / 35 | 3407 |
| 8 | 5 | 55.8 | 56.8 | 3 / 35 | 3550 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 14 | 36% |
| stelo.PastFuture 2.3.2 | 13 | 54% |
| oog.melee.Capulet 1.2 | 11 | 36% |
| catcat20.Matcha 0.006 | 11 | 18% |
| intruder.PrairieWolf 2.61 | 8 | 50% |
| tripphippy.Alice 1.1 | 3 | 67% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 50% |

Hadur died in 255 of 280 rounds, at a mean tick of 595. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 58 | 23% | 62 |
| catcat20.Matcha 0.006 | 55 | 22% | 60 |
| darkcanuck.B26354 1.06 | 39 | 15% | 42 |
| stelo.PastFuture 2.3.2 | 31 | 12% | 40 |
| tripphippy.Alice 1.1 | 19 | 7% | 23 |
| fowl3628800.LightningBolt 2.6.0 | 18 | 7% | 17 |
| ntc.Opposite 1.5 | 15 | 6% | 15 |
| intruder.PrairieWolf 2.61 | 12 | 5% | 13 |
| GarmBox.Anger 1.0 | 8 | 3% | 8 |

## Melee bench: F31

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 67.0 | 28 / 280 | 3.97 | 13.0% | 25992 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.8% | 169 |
| gh.mini.Griezel 0.2 | 2.4 | 13.8% | 56 |
| hadur117.micro.SaorC 0.1 | 2.8 | 13.0% | 28 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.4% | 11 |
| d414.nano.Quantum 1.0.0 | 4.8 | 11.1% | 8 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.8% | 3 |
| timmit.nano.TimDog 0.33 | 7.6 | 6.8% | 4 |
| fm.mammillarias 1.3 | 8.0 | 6.1% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 9.3 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.2 | 69.2 | 2 / 35 | 3039 |
| 2 | 4 | 55.7 | 55.2 | 2 / 35 | 2989 |
| 3 | 2 | 60.7 | 70.8 | 2 / 35 | 3630 |
| 4 | 3 | 61.9 | 71.1 | 5 / 35 | 3547 |
| 5 | 3 | 57.5 | 61.9 | 5 / 35 | 3239 |
| 6 | 2 | 60.1 | 68.6 | 6 / 35 | 3229 |
| 7 | 3 | 60.3 | 69.2 | 3 / 35 | 3488 |
| 8 | 2 | 59.3 | 70.2 | 3 / 35 | 2831 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 41 | 10% |
| gh.mini.Griezel 0.2 | 26 | 15% |
| spinnercat.micro.Tyger 0.1 | 9 | 78% |
| d414.nano.Quantum 1.0.0 | 9 | 78% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 50% |
| fm.mammillarias 1.3 | 1 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 252 of 280 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 121 | 48% | 128 |
| gh.mini.Griezel 0.2 | 58 | 23% | 65 |
| spinnercat.micro.Tyger 0.1 | 25 | 10% | 29 |
| d414.nano.Quantum 1.0.0 | 14 | 6% | 17 |
| gh.nano.Grofvuil 0.2 | 12 | 5% | 16 |
| timmit.nano.TimDog 0.33 | 7 | 3% | 8 |
| fm.mammillarias 1.3 | 6 | 2% | 8 |
| Gecko.ultimateGeckoBot 1.0 | 6 | 2% | 6 |
| tlp.ThreeLeggedPig 1 | 3 | 1% | 3 |

## Melee bench: F32

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 74.1 | 101 / 280 | 3.33 | 15.6% | 34664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.4 | 15.4% | 107 |
| hadur117.micro.SaorC 0.1 | 1.8 | 15.6% | 101 |
| apc.botM 3.0 | 2.9 | 12.8% | 31 |
| vjik.UnViolation 1.1 | 4.4 | 10.5% | 16 |
| lxx.ConceptA 0.8 | 4.6 | 10.6% | 9 |
| bayen.UbaMicro 1.4 | 6.0 | 9.0% | 5 |
| panzer.Panzer 0.2 | 7.5 | 7.5% | 2 |
| yk.JahMicro 1.0 | 8.1 | 6.7% | 4 |
| conscience.Electron 1.3g | 8.6 | 6.1% | 1 |
| donjezza.Jezza 1.0 | 9.8 | 5.7% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 78.1 | 12 / 35 | 4347 |
| 2 | 1 | 65.3 | 79.0 | 16 / 35 | 4621 |
| 3 | 1 | 66.3 | 82.5 | 18 / 35 | 4540 |
| 4 | 3 | 59.8 | 63.5 | 10 / 35 | 4062 |
| 5 | 2 | 65.1 | 78.7 | 13 / 35 | 4611 |
| 6 | 2 | 62.3 | 72.4 | 11 / 35 | 4051 |
| 7 | 2 | 60.1 | 63.5 | 11 / 35 | 3852 |
| 8 | 2 | 63.9 | 74.9 | 10 / 35 | 4580 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 82 | 30% |
| apc.botM 3.0 | 36 | 83% |
| lxx.ConceptA 0.8 | 16 | 88% |
| vjik.UnViolation 1.1 | 16 | 69% |
| yk.JahMicro 1.0 | 7 | 86% |
| bayen.UbaMicro 1.4 | 6 | 100% |
| donjezza.Jezza 1.0 | 5 | 80% |
| panzer.Panzer 0.2 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 182 of 280 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 75 | 41% | 97 |
| lxx.ConceptA 0.8 | 36 | 20% | 45 |
| apc.botM 3.0 | 18 | 10% | 43 |
| vjik.UnViolation 1.1 | 16 | 9% | 42 |
| conscience.Electron 1.3g | 12 | 7% | 15 |
| panzer.Panzer 0.2 | 11 | 6% | 14 |
| bayen.UbaMicro 1.4 | 8 | 4% | 15 |
| donjezza.Jezza 1.0 | 4 | 2% | 5 |
| yk.JahMicro 1.0 | 1 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F33

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 79.0 | 128 / 280 | 2.89 | 17.6% | 39085 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 17.6% | 128 |
| maribo.Quester 0.3 | 1.8 | 16.1% | 64 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.8% | 32 |
| labg.Cataclysm 2.05 | 4.5 | 11.0% | 29 |
| gre.svman4.Leonidas 1.3.2 | 4.6 | 10.7% | 20 |
| baal.nano.N 1.42 | 6.1 | 8.8% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.2% | 5 |
| zyx.micro.Ant 1.1 | 8.5 | 5.7% | 0 |
| sanja.First 0.1 | 8.6 | 5.4% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.9 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 78.1 | 13 / 35 | 4394 |
| 2 | 1 | 67.6 | 79.0 | 20 / 35 | 4710 |
| 3 | 2 | 64.6 | 72.7 | 10 / 35 | 4814 |
| 4 | 1 | 67.4 | 79.7 | 18 / 35 | 4787 |
| 5 | 1 | 67.6 | 78.7 | 16 / 35 | 5187 |
| 6 | 1 | 68.6 | 82.2 | 19 / 35 | 5308 |
| 7 | 1 | 68.9 | 87.6 | 14 / 35 | 4902 |
| 8 | 1 | 66.1 | 73.7 | 18 / 35 | 4983 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 57 | 70% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 55 | 82% |
| gre.svman4.Leonidas 1.3.2 | 30 | 83% |
| labg.Cataclysm 2.05 | 13 | 15% |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 82% |
| sanja.First 0.1 | 4 | 100% |
| baal.nano.N 1.42 | 2 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 155 of 280 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 61 | 39% | 112 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 15% | 58 |
| labg.Cataclysm 2.05 | 21 | 14% | 29 |
| gre.svman4.Leonidas 1.3.2 | 16 | 10% | 30 |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 6% | 12 |
| baal.nano.N 1.42 | 8 | 5% | 16 |
| zyx.micro.Ant 1.1 | 8 | 5% | 11 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 7 | 5% | 8 |
| sanja.First 0.1 | 1 | 1% | 4 |

## Melee bench: F34

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 74.4 | 44 / 280 | 3.31 | 15.3% | 35238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.6 | 17.0% | 83 |
| stelo.Spread 0.9 | 1.8 | 16.8% | 115 |
| hadur117.micro.SaorC 0.1 | 2.6 | 15.3% | 44 |
| jcs.Seth 1.8 | 4.5 | 11.6% | 25 |
| tcf.Reach 3 | 4.6 | 11.0% | 7 |
| cli.Dancer 1.1 | 5.9 | 9.6% | 4 |
| ratosh.Wesco 1.4 | 7.0 | 7.0% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.1 | 3.7% | 1 |
| sample.RamFire 1.0 | 9.9 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.8 | 68.9 | 3 / 35 | 3939 |
| 2 | 1 | 65.9 | 80.0 | 9 / 35 | 4727 |
| 3 | 3 | 64.8 | 75.9 | 5 / 35 | 4359 |
| 4 | 3 | 64.7 | 74.3 | 8 / 35 | 4426 |
| 5 | 3 | 60.5 | 63.8 | 1 / 35 | 4168 |
| 6 | 3 | 64.0 | 72.1 | 3 / 35 | 4435 |
| 7 | 2 | 67.2 | 82.5 | 10 / 35 | 4722 |
| 8 | 3 | 65.5 | 77.5 | 5 / 35 | 4462 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 65 | 22% |
| kid.Gladiator .7.2 | 40 | 33% |
| jcs.Seth 1.8 | 14 | 79% |
| cli.Dancer 1.1 | 3 | 33% |
| tcf.Reach 3 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 2 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 236 of 280 rounds, at a mean tick of 914. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 93 | 39% | 109 |
| kid.Gladiator .7.2 | 91 | 39% | 102 |
| tcf.Reach 3 | 22 | 9% | 26 |
| cli.Dancer 1.1 | 10 | 4% | 12 |
| jcs.Seth 1.8 | 9 | 4% | 19 |
| sample.RamFire 1.0 | 4 | 2% | 4 |
| amk.Punbot.Punbot 0.01 | 4 | 2% | 4 |
| ratosh.Wesco 1.4 | 3 | 1% | 4 |

## Melee bench: F35

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 66.4 | 17 / 280 | 4.02 | 12.7% | 25319 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.2% | 212 |
| gh.mini.Gruwel 0.9 | 2.9 | 12.9% | 27 |
| hadur117.micro.SaorC 0.1 | 3.1 | 12.7% | 17 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.4% | 15 |
| rz.HawkOnFire 0.1 | 4.3 | 11.6% | 8 |
| myl.nano.KomoriNinja 1.1 | 6.1 | 7.6% | 1 |
| wit.Chuliath 1.0 | 7.3 | 6.6% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.6 | 6.3% | 0 |
| dans.Cinnamon 1.2 | 9.4 | 5.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.6 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.2 | 67.9 | 1 / 35 | 3142 |
| 2 | 2 | 60.4 | 71.7 | 2 / 35 | 3228 |
| 3 | 4 | 58.3 | 64.4 | 3 / 35 | 3115 |
| 4 | 2 | 60.7 | 70.8 | 3 / 35 | 3311 |
| 5 | 5 | 56.3 | 59.0 | 2 / 35 | 3099 |
| 6 | 3 | 58.5 | 62.9 | 3 / 35 | 3158 |
| 7 | 3 | 58.6 | 67.0 | 2 / 35 | 2888 |
| 8 | 2 | 59.7 | 67.6 | 1 / 35 | 3378 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 48 | 4% |
| gh.mini.Gruwel 0.9 | 13 | 15% |
| dmh.robocode.robot.BlackDeath 9.2 | 12 | 67% |
| rz.HawkOnFire 0.1 | 5 | 80% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 263 of 280 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 143 | 54% | 146 |
| gh.mini.Gruwel 0.9 | 35 | 13% | 37 |
| dmh.robocode.robot.BlackDeath 9.2 | 34 | 13% | 41 |
| rz.HawkOnFire 0.1 | 24 | 9% | 26 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 12 | 5% | 12 |
| myl.nano.KomoriNinja 1.1 | 7 | 3% | 7 |
| stelo.MyAgileRobot 0.2 | 4 | 2% | 5 |
| dans.Cinnamon 1.2 | 3 | 1% | 3 |
| wit.Chuliath 1.0 | 1 | 0% | 3 |

## Melee bench: F36

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.0 | 194 / 280 | 2.35 | 19.3% | 40675 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.3% | 194 |
| alpha.RainingFire 1.0 | 3.0 | 12.0% | 20 |
| bzdp.Pansy 2.1 | 3.5 | 11.9% | 14 |
| mz.Cork 0.1 | 4.1 | 11.1% | 18 |
| bvh.micro.Freya 0.3 | 4.3 | 10.7% | 12 |
| m3thos.Eva02 0.7.1 | 5.9 | 9.2% | 9 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.5% | 6 |
| squidM.TentalceMeleeNano 1.1 | 8.1 | 6.7% | 0 |
| dl.BetterWalls 1.0 | 9.4 | 5.1% | 4 |
| sample.MyFirstRobot 1.0 | 9.5 | 4.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 90.5 | 28 / 35 | 4822 |
| 2 | 1 | 69.6 | 89.8 | 26 / 35 | 4976 |
| 3 | 1 | 65.8 | 72.1 | 19 / 35 | 5081 |
| 4 | 1 | 69.8 | 87.9 | 26 / 35 | 5213 |
| 5 | 1 | 70.0 | 87.9 | 23 / 35 | 5293 |
| 6 | 1 | 70.2 | 88.3 | 27 / 35 | 5264 |
| 7 | 1 | 68.9 | 84.4 | 23 / 35 | 5238 |
| 8 | 1 | 67.4 | 79.4 | 22 / 35 | 4788 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 58 | 98% |
| mz.Cork 0.1 | 34 | 85% |
| bvh.mini.Fenrir 0.39 | 32 | 97% |
| bvh.micro.Freya 0.3 | 32 | 88% |
| alpha.RainingFire 1.0 | 27 | 93% |
| m3thos.Eva02 0.7.1 | 14 | 93% |
| sample.MyFirstRobot 1.0 | 12 | 83% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 86 of 280 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.Cork 0.1 | 19 | 22% | 52 |
| alpha.RainingFire 1.0 | 18 | 21% | 50 |
| bzdp.Pansy 2.1 | 11 | 13% | 63 |
| m3thos.Eva02 0.7.1 | 11 | 13% | 29 |
| bvh.micro.Freya 0.3 | 9 | 10% | 28 |
| bvh.mini.Fenrir 0.39 | 8 | 9% | 18 |
| dl.BetterWalls 1.0 | 5 | 6% | 14 |
| squidM.TentalceMeleeNano 1.1 | 3 | 3% | 10 |
| sample.MyFirstRobot 1.0 | 2 | 2% | 16 |

## Melee bench: F37

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 78.7 | 160 / 280 | 2.92 | 17.3% | 40264 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.3% | 160 |
| germ.TheMind .2 | 2.8 | 11.3% | 26 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.4 | 11.2% | 15 |
| EBBU.Sim2 1.02 | 4.3 | 10.1% | 12 |
| agrach.Dalek 1.0 | 5.3 | 9.5% | 21 |
| lmk.ACPFinal 0.1 | 6.1 | 8.9% | 13 |
| stelo.UntouchableNano 1.3 | 6.6 | 8.7% | 16 |
| skm.Ryubot 1.0 | 8.1 | 7.8% | 10 |
| mb.Beast 0.1 | 8.3 | 7.9% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 7.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 78.7 | 19 / 35 | 5332 |
| 2 | 1 | 64.1 | 74.3 | 16 / 35 | 5070 |
| 3 | 1 | 64.5 | 74.3 | 20 / 35 | 4797 |
| 4 | 1 | 67.1 | 85.7 | 24 / 35 | 5039 |
| 5 | 1 | 66.7 | 83.8 | 20 / 35 | 5139 |
| 6 | 1 | 65.4 | 76.8 | 21 / 35 | 4945 |
| 7 | 1 | 67.4 | 85.7 | 22 / 35 | 5120 |
| 8 | 1 | 63.0 | 69.8 | 18 / 35 | 4822 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 46 | 89% |
| EBBU.Sim2 1.02 | 32 | 91% |
| skm.Ryubot 1.0 | 24 | 88% |
| stelo.UntouchableNano 1.3 | 23 | 83% |
| com.syncleus.robocode.Dreadnaught 0.1 | 20 | 85% |
| lmk.ACPFinal 0.1 | 14 | 79% |
| mb.Beast 0.1 | 12 | 100% |
| agrach.Dalek 1.0 | 11 | 82% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 121 of 280 rounds, at a mean tick of 389. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 27 | 22% | 44 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 13% | 17 |
| germ.TheMind .2 | 15 | 12% | 55 |
| EBBU.Sim2 1.02 | 15 | 12% | 39 |
| stelo.UntouchableNano 1.3 | 13 | 11% | 24 |
| com.syncleus.robocode.Dreadnaught 0.1 | 12 | 10% | 41 |
| lmk.ACPFinal 0.1 | 10 | 8% | 23 |
| skm.Ryubot 1.0 | 10 | 8% | 16 |
| mb.Beast 0.1 | 3 | 2% | 21 |

## Melee bench: F38

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 67.7 | 52 / 280 | 3.91 | 13.9% | 31168 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.3% | 137 |
| hadur117.micro.SaorC 0.1 | 2.3 | 13.9% | 52 |
| bvh.mini.Freya 0.55 | 3.0 | 12.8% | 18 |
| bts.mega.Gnarly 1.4 | 4.0 | 11.6% | 36 |
| cs.Wren 1.0 | 5.0 | 10.9% | 21 |
| kdf.KoulDestroyer 1.0 | 6.0 | 9.3% | 8 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 8.8% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.9% | 3 |
| matt.UnderDark3 2.4.34 | 9.4 | 4.3% | 0 |
| bzdp.BoxCar 2.0 | 9.6 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.5 | 66.3 | 5 / 35 | 3943 |
| 2 | 3 | 60.3 | 64.8 | 5 / 35 | 3869 |
| 3 | 2 | 60.3 | 67.0 | 6 / 35 | 3806 |
| 4 | 3 | 59.0 | 63.2 | 4 / 35 | 3655 |
| 5 | 2 | 61.9 | 69.2 | 9 / 35 | 4106 |
| 6 | 2 | 61.5 | 70.5 | 8 / 35 | 3769 |
| 7 | 2 | 62.0 | 69.2 | 8 / 35 | 3994 |
| 8 | 2 | 62.4 | 71.4 | 7 / 35 | 4026 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 57 | 11% |
| bts.mega.Gnarly 1.4 | 20 | 50% |
| cs.Wren 1.0 | 15 | 80% |
| bvh.mini.Freya 0.55 | 14 | 71% |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 67% |
| kdf.KoulDestroyer 1.0 | 3 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 228 of 280 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 108 | 47% | 120 |
| bvh.mini.Freya 0.55 | 29 | 13% | 31 |
| bts.mega.Gnarly 1.4 | 26 | 11% | 39 |
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 8% | 27 |
| cs.Wren 1.0 | 19 | 8% | 27 |
| kdf.KoulDestroyer 1.0 | 13 | 6% | 18 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7 | 3% | 10 |
| matt.UnderDark3 2.4.34 | 5 | 2% | 6 |
| bzdp.BoxCar 2.0 | 2 | 1% | 2 |

## Melee bench: F39

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 72.3 | 70 / 280 | 3.49 | 15.5% | 37451 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.8 | 15.5% | 70 |
| bvh.fry.Freya 0.82 | 2.0 | 15.0% | 48 |
| az.Ololobot 0.2.4 | 2.4 | 13.9% | 104 |
| catcat20.Lambda 0.024 | 3.9 | 11.1% | 38 |
| apollokidd.ApolloKidd 0.9 | 5.8 | 8.7% | 3 |
| winamp32.micro.MicroMacro 1.0 | 6.5 | 8.4% | 7 |
| gimp.GimpBot 0.1 | 6.5 | 8.3% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 7.5 | 7.6% | 11 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.4 | 5.8% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.4 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 74.0 | 10 / 35 | 4671 |
| 2 | 3 | 60.8 | 65.1 | 4 / 35 | 4575 |
| 3 | 1 | 65.1 | 81.3 | 10 / 35 | 4635 |
| 4 | 2 | 62.7 | 69.5 | 12 / 35 | 4608 |
| 5 | 1 | 64.1 | 76.2 | 9 / 35 | 4571 |
| 6 | 2 | 64.5 | 75.2 | 9 / 35 | 5000 |
| 7 | 2 | 61.8 | 64.8 | 8 / 35 | 4955 |
| 8 | 2 | 62.9 | 72.7 | 8 / 35 | 4436 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 50 | 20% |
| bvh.fry.Freya 0.82 | 42 | 64% |
| catcat20.Lambda 0.024 | 33 | 48% |
| stelo.SoRobotNanoMelee 1.2 | 14 | 86% |
| apollokidd.ApolloKidd 0.9 | 3 | 67% |
| gimp.GimpBot 0.1 | 3 | 67% |
| winamp32.micro.MicroMacro 1.0 | 3 | 33% |

Hadur died in 210 of 280 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 67 | 32% | 83 |
| bvh.fry.Freya 0.82 | 45 | 21% | 64 |
| catcat20.Lambda 0.024 | 39 | 19% | 53 |
| stelo.SoRobotNanoMelee 1.2 | 23 | 11% | 31 |
| apollokidd.ApolloKidd 0.9 | 10 | 5% | 16 |
| winamp32.micro.MicroMacro 1.0 | 9 | 4% | 10 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8 | 4% | 9 |
| gimp.GimpBot 0.1 | 7 | 3% | 10 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 1% | 3 |

## Melee bench: F40

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 73.0 | 126 / 280 | 3.43 | 16.2% | 34324 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.4 | 16.2% | 126 |
| kawigi.mini.Coriantumr 1.1 | 1.9 | 14.9% | 72 |
| kano.gamma.KanoGamma 1.8 | 2.8 | 13.1% | 36 |
| mz.AntiGrav 1.0 | 4.6 | 10.8% | 8 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.8% | 15 |
| stelo.Randomness 1.0 | 5.8 | 9.4% | 13 |
| alpha.BlackIce 1.0 | 6.9 | 8.6% | 6 |
| amk.superstrike.SuperStrike 0.3 | 8.1 | 6.4% | 1 |
| testantiswapgun.AntiSwap 1.0 | 8.9 | 5.7% | 2 |
| sample.Corners 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 71.1 | 18 / 35 | 4169 |
| 2 | 1 | 67.5 | 80.6 | 22 / 35 | 4630 |
| 3 | 1 | 65.7 | 77.5 | 18 / 35 | 4121 |
| 4 | 2 | 64.6 | 73.3 | 14 / 35 | 4127 |
| 5 | 1 | 63.3 | 67.3 | 13 / 35 | 4634 |
| 6 | 1 | 67.6 | 81.6 | 16 / 35 | 5074 |
| 7 | 1 | 64.6 | 71.4 | 14 / 35 | 4247 |
| 8 | 3 | 59.1 | 61.0 | 11 / 35 | 3322 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 59 | 59% |
| kano.gamma.KanoGamma 1.8 | 34 | 85% |
| mz.AntiGrav 1.0 | 29 | 100% |
| Polkwane.SmashMelee 1.0 | 24 | 96% |
| stelo.Randomness 1.0 | 7 | 57% |
| alpha.BlackIce 1.0 | 2 | 100% |
| sample.Corners 1.0 | 2 | 50% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 154 of 280 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 53 | 34% | 93 |
| Polkwane.SmashMelee 1.0 | 23 | 15% | 34 |
| kano.gamma.KanoGamma 1.8 | 20 | 13% | 56 |
| stelo.Randomness 1.0 | 16 | 10% | 21 |
| alpha.BlackIce 1.0 | 15 | 10% | 18 |
| amk.superstrike.SuperStrike 0.3 | 13 | 8% | 16 |
| mz.AntiGrav 1.0 | 9 | 6% | 30 |
| sample.Corners 1.0 | 3 | 2% | 5 |
| testantiswapgun.AntiSwap 1.0 | 2 | 1% | 5 |

## Melee bench: F41

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 69.3 | 79 / 280 | 3.76 | 14.8% | 33798 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 16.7% | 131 |
| hadur117.micro.SaorC 0.1 | 2.4 | 14.8% | 79 |
| ary.Swarm 1.1 | 3.0 | 13.3% | 24 |
| lessonz.robocode.Oz 0.5.0 | 3.9 | 12.2% | 24 |
| simonton.nano.MeleeSeed 1.8 | 4.9 | 10.4% | 19 |
| shrub.Silver v048 | 5.9 | 9.5% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 8.2% | 0 |
| jsal.Jsalbot 1.0 | 8.4 | 6.2% | 2 |
| stelo.Mirror 1.1 | 8.6 | 6.1% | 2 |
| acogdev.alpha 0.2 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 77.5 | 12 / 35 | 4386 |
| 2 | 4 | 60.4 | 62.2 | 8 / 35 | 3915 |
| 3 | 2 | 61.4 | 66.0 | 7 / 35 | 4146 |
| 4 | 2 | 65.3 | 75.9 | 11 / 35 | 4432 |
| 5 | 2 | 60.8 | 62.5 | 12 / 35 | 4010 |
| 6 | 2 | 63.8 | 73.0 | 10 / 35 | 4291 |
| 7 | 2 | 63.1 | 69.8 | 11 / 35 | 4271 |
| 8 | 3 | 61.7 | 67.3 | 8 / 35 | 4347 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 66 | 23% |
| ary.Swarm 1.1 | 26 | 81% |
| lessonz.robocode.Oz 0.5.0 | 23 | 78% |
| simonton.nano.MeleeSeed 1.8 | 18 | 67% |
| shrub.Silver v048 | 5 | 80% |
| jsal.Jsalbot 1.0 | 5 | 100% |
| stelo.Mirror 1.1 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 203 of 280 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 96 | 47% | 116 |
| simonton.nano.MeleeSeed 1.8 | 37 | 18% | 50 |
| ary.Swarm 1.1 | 25 | 12% | 48 |
| lessonz.robocode.Oz 0.5.0 | 18 | 9% | 24 |
| zyx.nano.Ant 1.1 | 12 | 6% | 12 |
| acogdev.alpha 0.2 | 7 | 3% | 8 |
| stelo.Mirror 1.1 | 3 | 1% | 5 |
| shrub.Silver v048 | 2 | 1% | 8 |
| jsal.Jsalbot 1.0 | 2 | 1% | 7 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 70.7 | 46 / 280 | 3.64 | 14.6% | 34480 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.7% | 143 |
| hadur117.micro.SaorC 0.1 | 2.4 | 14.6% | 46 |
| ara.Shera 0.88 | 3.0 | 13.4% | 45 |
| maribo.mini.MiniQuester 0.1 | 3.6 | 13.5% | 32 |
| amz.NanoClone 1.41 | 5.1 | 9.1% | 4 |
| maribo.IotaCT 1.1 | 6.1 | 8.2% | 0 |
| dsw.StaticD 1.0 | 6.8 | 7.3% | 10 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.9% | 0 |
| mme.NikeEnhanced 2.0 | 8.6 | 5.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.9 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 71.1 | 4 / 35 | 3742 |
| 2 | 2 | 62.9 | 74.3 | 6 / 35 | 4115 |
| 3 | 3 | 60.8 | 65.1 | 5 / 35 | 4282 |
| 4 | 2 | 61.8 | 66.3 | 7 / 35 | 4513 |
| 5 | 2 | 63.5 | 71.1 | 7 / 35 | 4859 |
| 6 | 2 | 62.0 | 69.5 | 5 / 35 | 4175 |
| 7 | 3 | 61.5 | 69.2 | 6 / 35 | 4224 |
| 8 | 2 | 64.6 | 79.0 | 6 / 35 | 4570 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 56 | 20% |
| ara.Shera 0.88 | 31 | 45% |
| maribo.mini.MiniQuester 0.1 | 26 | 65% |
| dsw.StaticD 1.0 | 5 | 40% |
| amz.NanoClone 1.41 | 3 | 33% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 234 of 280 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 117 | 50% | 130 |
| ara.Shera 0.88 | 51 | 22% | 66 |
| maribo.mini.MiniQuester 0.1 | 25 | 11% | 38 |
| dsw.StaticD 1.0 | 12 | 5% | 15 |
| amz.NanoClone 1.41 | 11 | 5% | 11 |
| mme.NikeEnhanced 2.0 | 6 | 3% | 8 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 5 | 2% | 5 |
| maribo.IotaCT 1.1 | 4 | 2% | 4 |
| stelo.MirrorMicro 1.0 | 3 | 1% | 3 |

## Melee bench: F43

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 65.6 | 12 / 280 | 4.09 | 12.6% | 26663 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.9% | 225 |
| hadur117.micro.SaorC 0.1 | 2.9 | 12.6% | 12 |
| brainfade.melee.Dusk 0.44 | 2.9 | 12.4% | 26 |
| dummy.micro.Sparrow 2.5 | 3.6 | 11.6% | 7 |
| wcsv.melee.EngineerMelee 0.1 | 4.9 | 10.6% | 6 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 10.0% | 4 |
| jab.DiamondStealer 5 | 7.4 | 8.0% | 2 |
| mz.NanoGod 2.02 | 7.6 | 7.8% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 72.4 | 4 / 35 | 3594 |
| 2 | 2 | 61.9 | 70.5 | 1 / 35 | 3658 |
| 3 | 4 | 58.9 | 64.1 | 0 / 35 | 2929 |
| 4 | 4 | 57.5 | 57.8 | 1 / 35 | 3142 |
| 5 | 5 | 55.9 | 56.2 | 1 / 35 | 2839 |
| 6 | 2 | 62.1 | 72.7 | 1 / 35 | 3649 |
| 7 | 2 | 60.7 | 67.9 | 3 / 35 | 3204 |
| 8 | 2 | 59.9 | 63.5 | 1 / 35 | 3648 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 66 | 3% |
| dummy.micro.Sparrow 2.5 | 6 | 67% |
| brainfade.melee.Dusk 0.44 | 5 | 80% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 33% |
| Krabb.akim2.Akim2 1.1b | 2 | 0% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 270 of 280 rounds, at a mean tick of 739. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 162 | 60% | 163 |
| brainfade.melee.Dusk 0.44 | 32 | 12% | 36 |
| wcsv.melee.EngineerMelee 0.1 | 23 | 9% | 25 |
| dummy.micro.Sparrow 2.5 | 17 | 6% | 20 |
| mz.NanoGod 2.02 | 17 | 6% | 19 |
| Krabb.akim2.Akim2 1.1b | 8 | 3% | 8 |
| jab.DiamondStealer 5 | 6 | 2% | 6 |
| cvt.Firsty 1.0 | 3 | 1% | 3 |
2 death(s) with no robot to name.

## Melee bench: F44

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 82.1 | 99 / 280 | 2.61 | 17.6% | 40114 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.6% | 99 |
| stelo.Liblix 0.3.1 | 2.1 | 15.8% | 117 |
| tzu.TheArtOfWar 1.2 | 2.9 | 13.0% | 44 |
| wompi.Quokka 1.6 | 4.3 | 10.9% | 7 |
| jwirde.Gort 2.0 | 5.4 | 9.4% | 8 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.6 | 9.4% | 2 |
| disan.Chair 2.2.0 | 7.3 | 7.6% | 2 |
| stf.PanzerGeneral 0.1 | 7.5 | 7.0% | 2 |
| sample.Crazy 1.0 | 9.1 | 5.0% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 86.3 | 19 / 35 | 5226 |
| 2 | 1 | 67.0 | 82.5 | 12 / 35 | 4934 |
| 3 | 1 | 65.5 | 80.0 | 11 / 35 | 4538 |
| 4 | 1 | 66.6 | 81.6 | 13 / 35 | 4876 |
| 5 | 1 | 67.8 | 84.4 | 12 / 35 | 5085 |
| 6 | 1 | 66.2 | 78.4 | 10 / 35 | 5142 |
| 7 | 1 | 66.8 | 80.6 | 11 / 35 | 5169 |
| 8 | 1 | 66.6 | 82.9 | 11 / 35 | 5144 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 97 | 26% |
| tzu.TheArtOfWar 1.2 | 67 | 72% |
| wompi.Quokka 1.6 | 17 | 82% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 83% |
| jwirde.Gort 2.0 | 4 | 50% |
| disan.Chair 2.2.0 | 3 | 100% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 182 of 280 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 98 | 54% | 129 |
| tzu.TheArtOfWar 1.2 | 37 | 20% | 73 |
| wompi.Quokka 1.6 | 19 | 10% | 25 |
| jwirde.Gort 2.0 | 14 | 8% | 19 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 2% | 9 |
| disan.Chair 2.2.0 | 4 | 2% | 9 |
| stf.PanzerGeneral 0.1 | 3 | 2% | 5 |
| amk.jointstrike.JointStrike 0.2 | 2 | 1% | 7 |
| sample.Crazy 1.0 | 1 | 1% | 3 |

## Melee bench: F45

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 81.0 | 98 / 280 | 2.71 | 18.1% | 43115 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.1% | 98 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.8% | 147 |
| jje.BagPuss 1.2 | 2.9 | 11.8% | 12 |
| sul.Lunar 1.1 | 4.8 | 10.0% | 6 |
| myl.nano.Graviton 1.10 | 5.4 | 9.5% | 5 |
| fm.claire 1.7 | 6.1 | 8.9% | 3 |
| hvilela.HVilela 0.9 | 6.6 | 8.8% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.1 | 8.3% | 4 |
| wit.Deep7 2.0 | 9.0 | 6.5% | 5 |
| abud.ThirdRobo 1.0 | 9.9 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 79.0 | 10 / 35 | 5338 |
| 2 | 1 | 65.8 | 78.1 | 6 / 35 | 5366 |
| 3 | 1 | 68.8 | 86.0 | 16 / 35 | 5741 |
| 4 | 1 | 69.4 | 87.9 | 20 / 35 | 5454 |
| 5 | 1 | 67.4 | 81.0 | 14 / 35 | 5380 |
| 6 | 1 | 64.3 | 74.6 | 8 / 35 | 5074 |
| 7 | 1 | 66.6 | 79.7 | 10 / 35 | 5323 |
| 8 | 1 | 67.3 | 81.6 | 14 / 35 | 5439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 124 | 22% |
| jje.BagPuss 1.2 | 28 | 79% |
| sul.Lunar 1.1 | 25 | 100% |
| myl.nano.Graviton 1.10 | 15 | 93% |
| wit.Deep7 2.0 | 5 | 60% |
| fm.claire 1.7 | 4 | 50% |
| pez.mini.ChironexFleckeri 0.5 | 3 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |

Hadur died in 183 of 280 rounds, at a mean tick of 1841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 100 | 55% | 0 |
| jje.BagPuss 1.2 | 21 | 11% | 76 |
| hvilela.HVilela 0.9 | 15 | 8% | 26 |
| sul.Lunar 1.1 | 13 | 7% | 73 |
| fm.claire 1.7 | 10 | 5% | 20 |
| myl.nano.Graviton 1.10 | 8 | 4% | 37 |
| pez.mini.ChironexFleckeri 0.5 | 8 | 4% | 21 |
| wit.Deep7 2.0 | 7 | 4% | 14 |
| abud.ThirdRobo 1.0 | 1 | 1% | 4 |

## Melee bench: F46

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 64.4 | 22 / 280 | 4.20 | 13.1% | 31440 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.5 | 17.6% | 130 |
| kc.mini.Mirage 0.2 | 1.5 | 17.5% | 103 |
| hadur117.micro.SaorC 0.1 | 3.0 | 13.1% | 22 |
| mz.MicroSheep 1.0 | 4.5 | 10.5% | 7 |
| cx.Princess 1.0 | 4.8 | 10.2% | 15 |
| sadoner.killer 0.2 | 5.8 | 9.1% | 1 |
| arthord.NanoSatanMelee Beta | 7.1 | 6.8% | 2 |
| jeremyreeder.collective.Prophet 5 | 7.9 | 5.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.6 | 64.1 | 3 / 35 | 4055 |
| 2 | 3 | 59.8 | 64.1 | 3 / 35 | 3809 |
| 3 | 3 | 62.6 | 70.8 | 6 / 35 | 4227 |
| 4 | 3 | 58.0 | 61.9 | 1 / 35 | 3647 |
| 5 | 3 | 59.6 | 63.8 | 2 / 35 | 3962 |
| 6 | 3 | 60.9 | 67.3 | 1 / 35 | 4263 |
| 7 | 3 | 59.5 | 63.8 | 2 / 35 | 3756 |
| 8 | 3 | 58.2 | 59.4 | 4 / 35 | 3721 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 36 | 22% |
| rsalesc.melee.Medina 0.4.5 | 21 | 19% |
| mz.MicroSheep 1.0 | 6 | 50% |
| cx.Princess 1.0 | 5 | 80% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 258 of 280 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 118 | 46% | 129 |
| rsalesc.melee.Medina 0.4.5 | 77 | 30% | 83 |
| cx.Princess 1.0 | 19 | 7% | 20 |
| mz.MicroSheep 1.0 | 12 | 5% | 15 |
| sadoner.killer 0.2 | 11 | 4% | 12 |
| jeremyreeder.collective.Prophet 5 | 8 | 3% | 8 |
| kurios.DOSexe .9a | 7 | 3% | 6 |
| arthord.NanoSatanMelee Beta | 6 | 2% | 7 |

