# Bench suite: suite.txt

## Melee bench: F01

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 72.5 | 26 / 210 | 3.47 | 14.8% | 28476 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.1% | 146 |
| hadur117.micro.Saor 0.2 | 2.0 | 14.8% | 26 |
| sgp.JollyNinja 3.53 | 3.3 | 12.3% | 22 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 11.3% | 4 |
| mz.MicroGodMelee 1 | 5.2 | 10.3% | 5 |
| lorneswork.Predator 1.0 | 5.2 | 10.1% | 6 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 0 |
| skm.butterfly 1.0 | 8.5 | 5.1% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.5 | 5.7% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 69.5 | 4 / 35 | 4777 |
| 2 | 2 | 64.0 | 76.5 | 5 / 35 | 4517 |
| 3 | 2 | 63.5 | 73.0 | 6 / 35 | 4572 |
| 4 | 2 | 63.1 | 71.4 | 2 / 35 | 5065 |
| 5 | 2 | 61.4 | 66.0 | 4 / 35 | 4572 |
| 6 | 2 | 65.0 | 78.7 | 5 / 35 | 4973 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 77 | 1% |
| sgp.JollyNinja 3.53 | 14 | 71% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 100% |
| mz.MicroGodMelee 1 | 5 | 80% |
| lorneswork.Predator 1.0 | 5 | 80% |
| skm.butterfly 1.0 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 184 of 210 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 105 | 57% | 108 |
| mz.MicroGodMelee 1 | 19 | 10% | 25 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 9% | 22 |
| lorneswork.Predator 1.0 | 14 | 8% | 17 |
| sgp.JollyNinja 3.53 | 13 | 7% | 20 |
| kawigi.sbf.FloodSonnet 0.9 | 5 | 3% | 6 |
| adt.Ar2 1.0 | 5 | 3% | 5 |
| skm.butterfly 1.0 | 4 | 2% | 5 |
| mym.EdgeStalker 1.0 | 2 | 1% | 2 |

## Melee bench: F02

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 81.1 | 87 / 210 | 2.70 | 17.7% | 30846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.7% | 87 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.3 | 14.2% | 44 |
| pulsar.PulsarMax 0.8.9 | 2.7 | 13.7% | 49 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.4% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.7% | 4 |
| fnc.bandit.Bandit 5.2.0 | 6.0 | 8.4% | 2 |
| Noran.BitchingElk 0.054 | 7.2 | 7.7% | 7 |
| sch.Simone 0.3d | 7.5 | 7.1% | 5 |
| stelo.PatternRobot 1.0 | 9.0 | 6.5% | 8 |
| fullsail.SweetTea 1.1 | 9.8 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 83.8 | 13 / 35 | 5220 |
| 2 | 1 | 64.8 | 77.8 | 12 / 35 | 4650 |
| 3 | 1 | 66.1 | 78.4 | 14 / 35 | 5295 |
| 4 | 1 | 66.8 | 81.0 | 14 / 35 | 5296 |
| 5 | 1 | 69.1 | 87.3 | 18 / 35 | 5353 |
| 6 | 1 | 65.9 | 78.1 | 16 / 35 | 5032 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 53 | 53% |
| pulsar.PulsarMax 0.8.9 | 37 | 43% |
| Noran.BitchingElk 0.054 | 17 | 88% |
| sch.Simone 0.3d | 9 | 89% |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 7 | 100% |
| stelo.PatternRobot 1.0 | 7 | 71% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 44 | 35% | 68 |
| pulsar.PulsarMax 0.8.9 | 43 | 34% | 62 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 9% | 21 |
| stelo.PatternRobot 1.0 | 8 | 6% | 8 |
| fnc.bandit.Bandit 5.2.0 | 6 | 5% | 8 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4 | 3% | 16 |
| sch.Simone 0.3d | 4 | 3% | 10 |
| Noran.BitchingElk 0.054 | 3 | 2% | 14 |
| fullsail.SweetTea 1.1 | 2 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 79.0 | 115 / 210 | 2.89 | 17.7% | 33401 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.7% | 115 |
| radnor.DoctorBob 1.42 | 2.3 | 14.0% | 32 |
| vuen.Cake 2.51 | 3.2 | 12.8% | 31 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.4% | 24 |
| urdos.URDOS 1.3 | 5.0 | 10.3% | 2 |
| adt.Ar1 2.1 | 6.7 | 8.0% | 3 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.9% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.9% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.3 | 6.1% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 85.1 | 23 / 35 | 6005 |
| 2 | 1 | 64.8 | 71.4 | 16 / 35 | 5615 |
| 3 | 1 | 65.3 | 74.3 | 17 / 35 | 5200 |
| 4 | 1 | 67.2 | 81.6 | 21 / 35 | 5417 |
| 5 | 1 | 66.1 | 78.4 | 17 / 35 | 5215 |
| 6 | 1 | 68.0 | 83.5 | 21 / 35 | 5949 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 49 | 80% |
| kawigi.nano.Lib 1.0 | 47 | 87% |
| radnor.DoctorBob 1.42 | 36 | 78% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| urdos.URDOS 1.3 | 3 | 100% |
| adt.Ar1 2.1 | 2 | 50% |

Hadur died in 95 of 210 rounds, at a mean tick of 569. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 24% | 52 |
| kawigi.nano.Lib 1.0 | 22 | 23% | 57 |
| vuen.Cake 2.51 | 17 | 18% | 55 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 9% | 9 |
| urdos.URDOS 1.3 | 6 | 6% | 9 |
| adt.Ar1 2.1 | 6 | 6% | 7 |
| oa.weak.FlyMk1 0.1 | 5 | 5% | 9 |
| ghent.ArthurPanzergon 1.0.0 | 5 | 5% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 2% | 3 |

## Melee bench: F04

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 73.4 | 8 / 210 | 3.40 | 15.3% | 31492 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.0% | 194 |
| hadur117.micro.Saor 0.2 | 2.0 | 15.3% | 8 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.0% | 5 |
| TNT.TNT 0.99.1 | 4.0 | 11.2% | 1 |
| josago.Jorgito 0.16 | 5.0 | 9.4% | 0 |
| css.Delitioner 0.11 | 6.3 | 6.9% | 2 |
| tj.zombie1n 1.0.1 | 6.8 | 6.7% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.9% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.9% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 74.3 | 1 / 35 | 4877 |
| 2 | 2 | 65.6 | 74.9 | 2 / 35 | 5751 |
| 3 | 2 | 64.4 | 75.6 | 1 / 35 | 4906 |
| 4 | 2 | 65.2 | 73.0 | 3 / 35 | 5446 |
| 5 | 2 | 64.7 | 73.3 | 1 / 35 | 5099 |
| 6 | 2 | 64.3 | 69.2 | 0 / 35 | 5413 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 79 | 4% |
| TNT.TNT 0.99.1 | 3 | 100% |
| css.Delitioner 0.11 | 1 | 100% |
| apc.LeeroyJenkins2 1.0 | 1 | 100% |

Hadur died in 202 of 210 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 154 | 76% | 157 |
| apc.LeeroyJenkins2 1.0 | 21 | 10% | 25 |
| josago.Jorgito 0.16 | 12 | 6% | 12 |
| tj.zombie1n 1.0.1 | 6 | 3% | 6 |
| css.Delitioner 0.11 | 3 | 1% | 4 |
| TNT.TNT 0.99.1 | 3 | 1% | 3 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |
| rampancy.Durandal 2.1d | 1 | 0% | 1 |

## Melee bench: F05

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 60.2 | 8 / 210 | 4.59 | 12.4% | 24464 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.8% | 122 |
| justin.DemonicRage 3.4 | 1.8 | 17.1% | 64 |
| wompi.Numbat 2.1 | 3.5 | 12.4% | 8 |
| hadur117.micro.Saor 0.2 | 3.5 | 12.4% | 8 |
| axeBots.HataMoto 3.09 | 5.3 | 9.2% | 8 |
| ms.Ares 0.19 | 5.7 | 8.7% | 1 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.2% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.8% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.9% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.8 | 56.2 | 0 / 35 | 3961 |
| 2 | 4 | 59.4 | 62.2 | 1 / 35 | 4023 |
| 3 | 3 | 59.7 | 61.0 | 3 / 35 | 4203 |
| 4 | 3 | 61.1 | 66.7 | 2 / 35 | 4563 |
| 5 | 3 | 58.1 | 61.9 | 1 / 35 | 3663 |
| 6 | 4 | 56.9 | 53.0 | 1 / 35 | 4051 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 25 | 12% |
| justin.DemonicRage 3.4 | 22 | 14% |
| axeBots.HataMoto 3.09 | 2 | 50% |
| wompi.Numbat 2.1 | 1 | 100% |

Hadur died in 202 of 210 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 64 | 32% | 68 |
| cb.fire.Firestarter 2.0f | 63 | 31% | 65 |
| wompi.Numbat 2.1 | 32 | 16% | 33 |
| supersample.SuperBoxBot 1.0 | 14 | 7% | 14 |
| axeBots.HataMoto 3.09 | 11 | 5% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 7 | 3% | 7 |
| ms.Ares 0.19 | 6 | 3% | 6 |
| Queens_teamrobot.UltraRazor 1.0 | 3 | 1% | 3 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 74.2 | 94 / 210 | 3.32 | 16.2% | 26321 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 16.2% | 94 |
| jekl.StoneGhost 0.7 | 2.0 | 14.3% | 36 |
| origin.SleepSiphon 1.7b | 3.2 | 13.6% | 46 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.0% | 22 |
| mld.Wisdom 1.0 | 4.7 | 11.0% | 4 |
| gg.Wolverine 2.0 | 6.0 | 8.8% | 5 |
| DBall.NUKE 0.1 | 7.7 | 7.1% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 6.7% | 3 |
| spinnercat.Omen 1.0 | 8.5 | 6.6% | 0 |
| sample.Fire 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 71.7 | 17 / 35 | 4391 |
| 2 | 1 | 64.7 | 75.6 | 14 / 35 | 4361 |
| 3 | 1 | 64.3 | 73.7 | 13 / 35 | 4327 |
| 4 | 1 | 66.4 | 76.2 | 22 / 35 | 4749 |
| 5 | 2 | 61.5 | 67.6 | 11 / 35 | 3964 |
| 6 | 1 | 66.4 | 80.6 | 17 / 35 | 4529 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 40 | 85% |
| origin.SleepSiphon 1.7b | 33 | 67% |
| pe.minimelee.SandboxMiniMelee 1.1 | 24 | 83% |
| gg.Wolverine 2.0 | 10 | 70% |
| mld.Wisdom 1.0 | 5 | 100% |
| DBall.NUKE 0.1 | 3 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 29 | 25% | 54 |
| mld.Wisdom 1.0 | 28 | 24% | 39 |
| origin.SleepSiphon 1.7b | 24 | 21% | 55 |
| pe.minimelee.SandboxMiniMelee 1.1 | 22 | 19% | 35 |
| gg.Wolverine 2.0 | 7 | 6% | 11 |
| DBall.NUKE 0.1 | 3 | 3% | 7 |
| sample.Fire 1.0 | 3 | 3% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 81.6 | 73 / 210 | 2.65 | 18.2% | 36014 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 18.2% | 73 |
| rsalesc.melee.Monk 0.3.6c | 1.7 | 17.4% | 55 |
| rtk.Tachikoma 1.0 | 3.0 | 16.2% | 48 |
| franzor.Lizt 1.3.1 | 4.2 | 11.1% | 23 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 9.8% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 9.0% | 1 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.2% | 0 |
| sample.Target 1.0 | 9.2 | 2.9% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 81.0 | 13 / 35 | 6262 |
| 2 | 1 | 70.2 | 87.0 | 15 / 35 | 6154 |
| 3 | 2 | 68.1 | 81.6 | 9 / 35 | 5761 |
| 4 | 2 | 68.0 | 79.0 | 10 / 35 | 5594 |
| 5 | 1 | 69.5 | 83.8 | 12 / 35 | 6331 |
| 6 | 1 | 68.4 | 77.5 | 14 / 35 | 5912 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 56 | 52% |
| rsalesc.melee.Monk 0.3.6c | 37 | 22% |
| franzor.Lizt 1.3.1 | 23 | 65% |
| oog.melee.CapuletDroid 1.1 | 20 | 85% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |
| skm.PateranBotlock2 1.0 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 1145. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 62 | 45% | 87 |
| rtk.Tachikoma 1.0 | 45 | 33% | 90 |
| franzor.Lizt 1.3.1 | 11 | 8% | 1 |
| oog.melee.CapuletDroid 1.1 | 9 | 7% | 14 |
| exauge.GateKeeper 1.1.121g | 6 | 4% | 12 |
| skm.PateranBotlock2 1.0 | 3 | 2% | 3 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 2 |

## Melee bench: F08

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 74.1 | 71 / 210 | 3.33 | 16.8% | 32348 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 16.8% | 71 |
| tm.Yuugao 1.0 | 2.2 | 14.1% | 61 |
| shrub.Vapour v159 | 2.8 | 11.8% | 29 |
| Krabb.sliNk.Garm 0.9u | 5.0 | 10.0% | 15 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 10.1% | 15 |
| m3thos.Eva00 1.1 | 5.3 | 9.6% | 7 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.8% | 9 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 7.0% | 0 |
| SHAM.WOW 1.4 | 9.2 | 6.0% | 3 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 72.1 | 14 / 35 | 5634 |
| 2 | 1 | 66.1 | 77.5 | 11 / 35 | 5640 |
| 3 | 1 | 65.7 | 76.2 | 12 / 35 | 5253 |
| 4 | 1 | 66.9 | 81.0 | 12 / 35 | 5532 |
| 5 | 1 | 64.1 | 69.5 | 11 / 35 | 5308 |
| 6 | 1 | 63.2 | 68.6 | 11 / 35 | 4981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 51 | 25% |
| shrub.Vapour v159 | 31 | 71% |
| Krabb.sliNk.Garm 0.9u | 18 | 67% |
| jwst.DAD.DarkAndDarker 1.1 | 15 | 87% |
| m3thos.Eva00 1.1 | 9 | 67% |
| com.spp.robocode.MostlyHarmless 010 | 4 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 53 | 38% | 70 |
| shrub.Vapour v159 | 20 | 14% | 37 |
| Krabb.sliNk.Garm 0.9u | 15 | 11% | 25 |
| com.spp.robocode.MostlyHarmless 010 | 11 | 8% | 20 |
| qualidafial.MajorDick 1.0.1 | 10 | 7% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 6% | 21 |
| zyx.nano.BacillusComma 1.0 | 8 | 6% | 10 |
| m3thos.Eva00 1.1 | 8 | 6% | 10 |
| SHAM.WOW 1.4 | 5 | 4% | 6 |

## Melee bench: F09

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 61.2 | 31 / 210 | 4.49 | 13.0% | 22959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.2% | 110 |
| kc.micro.Figment 1.0 | 2.3 | 13.7% | 36 |
| hadur117.micro.Saor 0.2 | 2.7 | 13.0% | 31 |
| yagami.Tidus 0.11 | 4.8 | 10.7% | 7 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.3% | 14 |
| mc2.enemy.Original 0.9 | 5.3 | 9.8% | 10 |
| dft.Calliope 5.6 | 7.0 | 7.9% | 2 |
| step.nanoPri 1.0 | 8.5 | 6.1% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.7 | 6.0% | 0 |
| rdm.Dueler 0.4x | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.5 | 55.6 | 6 / 35 | 3675 |
| 2 | 2 | 59.9 | 63.5 | 5 / 35 | 3833 |
| 3 | 3 | 57.4 | 54.3 | 6 / 35 | 3883 |
| 4 | 3 | 55.6 | 53.0 | 4 / 35 | 3597 |
| 5 | 3 | 62.8 | 75.2 | 4 / 35 | 3952 |
| 6 | 2 | 60.5 | 65.7 | 6 / 35 | 4019 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 35 | 11% |
| kc.micro.Figment 1.0 | 27 | 56% |
| yagami.Tidus 0.11 | 7 | 86% |
| mc2.enemy.Original 0.9 | 6 | 50% |
| pedersen.Grishnakh 1.0 | 6 | 50% |

Hadur died in 179 of 210 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 64 | 36% | 69 |
| kc.micro.Figment 1.0 | 57 | 32% | 75 |
| yagami.Tidus 0.11 | 20 | 11% | 20 |
| mc2.enemy.Original 0.9 | 14 | 8% | 17 |
| pedersen.Grishnakh 1.0 | 8 | 4% | 9 |
| step.nanoPri 1.0 | 7 | 4% | 7 |
| robar.nano.Assertive_Melee 0.2 | 7 | 4% | 7 |
| dft.Calliope 5.6 | 1 | 1% | 4 |
| rdm.Dueler 0.4x | 1 | 1% | 2 |

## Melee bench: F10

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.8 | 93 / 210 | 2.46 | 17.8% | 32633 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 17.8% | 93 |
| DTF.Kludgy 1.2b | 2.0 | 15.0% | 59 |
| ne.Chimera 1.2 | 3.2 | 13.1% | 14 |
| ejb.Polaris 1.0.1 | 4.0 | 11.9% | 25 |
| vStar.RAFzilla 2.15 | 5.0 | 10.7% | 12 |
| tvv.micro.Antares 1.1.1 | 5.7 | 10.1% | 6 |
| sam.Samspin 1.0 | 7.7 | 6.0% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.8 | 5.6% | 0 |
| kurios.DOSexe .9b | 8.5 | 5.4% | 1 |
| donjezza.Muncho 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 77.5 | 11 / 35 | 5126 |
| 2 | 1 | 66.0 | 78.4 | 12 / 35 | 5587 |
| 3 | 1 | 67.1 | 83.2 | 16 / 35 | 5454 |
| 4 | 1 | 69.4 | 88.9 | 20 / 35 | 6022 |
| 5 | 1 | 68.4 | 88.6 | 20 / 35 | 5176 |
| 6 | 1 | 67.8 | 86.3 | 14 / 35 | 5268 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 45 | 22% |
| ejb.Polaris 1.0.1 | 34 | 59% |
| ne.Chimera 1.2 | 33 | 85% |
| vStar.RAFzilla 2.15 | 20 | 85% |
| tvv.micro.Antares 1.1.1 | 9 | 89% |
| kurios.DOSexe .9b | 5 | 100% |
| donjezza.Muncho 1.0 | 2 | 100% |
| sam.Samspin 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 60 | 51% | 70 |
| ejb.Polaris 1.0.1 | 22 | 19% | 41 |
| ne.Chimera 1.2 | 19 | 16% | 43 |
| vStar.RAFzilla 2.15 | 5 | 4% | 23 |
| tvv.micro.Antares 1.1.1 | 5 | 4% | 15 |
| sam.Samspin 1.0 | 3 | 3% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 2% | 4 |
| kurios.DOSexe .9b | 1 | 1% | 5 |
| donjezza.Muncho 1.0 | 0 | 0% | 3 |

## Melee bench: F11

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 70.5 | 51 / 210 | 3.65 | 15.0% | 25839 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.3% | 92 |
| hadur117.micro.Saor 0.2 | 2.0 | 15.0% | 51 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.0% | 19 |
| djc.DynaBot 0.1.1 | 4.7 | 10.2% | 10 |
| br2.MobyDickBot 1.6 | 4.7 | 9.6% | 15 |
| rdt199.Warlord 0.73 | 5.7 | 9.2% | 19 |
| KiraNL.Chupacabra 0.4 | 7.2 | 7.9% | 1 |
| uji.YellohFellah 1.0 | 7.8 | 7.6% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 6.2% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 69.5 | 9 / 35 | 4119 |
| 2 | 2 | 63.3 | 72.7 | 14 / 35 | 4192 |
| 3 | 2 | 64.0 | 73.0 | 9 / 35 | 4617 |
| 4 | 2 | 60.8 | 64.4 | 4 / 35 | 4552 |
| 5 | 2 | 58.5 | 61.9 | 4 / 35 | 3858 |
| 6 | 2 | 65.7 | 81.6 | 11 / 35 | 4501 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 50 | 20% |
| cx.mini.Nimrod 0.55 | 17 | 76% |
| djc.DynaBot 0.1.1 | 11 | 100% |
| rdt199.Warlord 0.73 | 10 | 40% |
| uji.YellohFellah 1.0 | 6 | 100% |
| br2.MobyDickBot 1.6 | 5 | 60% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 83 | 52% | 96 |
| cx.mini.Nimrod 0.55 | 22 | 14% | 31 |
| rdt199.Warlord 0.73 | 16 | 10% | 23 |
| KiraNL.Chupacabra 0.4 | 11 | 7% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 4% | 9 |
| stelo.MirrorNano 1.3 | 6 | 4% | 6 |
| djc.DynaBot 0.1.1 | 5 | 3% | 11 |
| br2.MobyDickBot 1.6 | 5 | 3% | 8 |
| uji.YellohFellah 1.0 | 4 | 3% | 12 |

## Melee bench: F12

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 79.2 | 79 / 210 | 2.87 | 16.6% | 24474 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 16.6% | 79 |
| bts.wiki.RipCurl 0.9b | 2.3 | 13.7% | 44 |
| nat.PallasHawk 1.0 | 2.8 | 13.1% | 47 |
| darkcanuck.Leon 1.01 | 3.8 | 12.6% | 27 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.1% | 6 |
| jrm.Test0 1.0 | 6.2 | 8.2% | 1 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.6% | 0 |
| jp.Perpy 16.0 | 8.3 | 6.9% | 1 |
| stuff.Vlad 0.1 | 9.2 | 5.7% | 1 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 78.1 | 11 / 35 | 3715 |
| 2 | 1 | 66.4 | 84.8 | 15 / 35 | 4161 |
| 3 | 1 | 64.8 | 77.8 | 12 / 35 | 4239 |
| 4 | 1 | 64.5 | 78.7 | 12 / 35 | 4006 |
| 5 | 1 | 65.6 | 79.4 | 13 / 35 | 4411 |
| 6 | 1 | 64.8 | 76.5 | 16 / 35 | 3942 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 37 | 41% |
| nat.PallasHawk 1.0 | 36 | 50% |
| darkcanuck.Leon 1.01 | 24 | 83% |
| brainfade.melee.Genghis 0.36 | 15 | 87% |
| jaybot.bots.Oddball 4.0 | 5 | 60% |
| jrm.Test0 1.0 | 4 | 100% |
| jp.Perpy 16.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 39 | 30% | 56 |
| nat.PallasHawk 1.0 | 36 | 27% | 55 |
| darkcanuck.Leon 1.01 | 19 | 15% | 41 |
| brainfade.melee.Genghis 0.36 | 13 | 10% | 18 |
| jp.Perpy 16.0 | 7 | 5% | 12 |
| jrm.Test0 1.0 | 7 | 5% | 11 |
| jaybot.bots.Oddball 4.0 | 5 | 4% | 9 |
| cs.sheldor.Talon 1.1 | 5 | 4% | 7 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |

## Melee bench: F13

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 66.0 | 10 / 210 | 4.06 | 13.3% | 25209 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 17.0% | 57 |
| mn.Combat 3.25.0 | 1.5 | 17.4% | 102 |
| hadur117.micro.Saor 0.2 | 3.3 | 13.3% | 10 |
| shinh.Entangled 0.3 | 4.2 | 12.3% | 28 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.6% | 8 |
| apc.Colossus2 0.17 | 6.0 | 8.2% | 1 |
| stelo.Wang 1.0 | 7.3 | 6.5% | 4 |
| ayk.WallHugger 1.0 | 8.2 | 5.6% | 0 |
| maribo.FollowFire 1 | 8.5 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.1 | 65.1 | 2 / 35 | 4472 |
| 2 | 3 | 60.7 | 64.4 | 1 / 35 | 4486 |
| 3 | 3 | 59.2 | 63.2 | 0 / 35 | 4117 |
| 4 | 4 | 60.6 | 66.7 | 2 / 35 | 3960 |
| 5 | 3 | 59.4 | 67.0 | 1 / 35 | 3844 |
| 6 | 3 | 62.4 | 69.5 | 4 / 35 | 4330 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 23 | 13% |
| mn.Combat 3.25.0 | 21 | 10% |
| shinh.Entangled 0.3 | 11 | 27% |
| gh.micro.Gruweltje 0.7 | 1 | 100% |
| apc.Colossus2 0.17 | 1 | 0% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 200 of 210 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 67 | 34% | 71 |
| ags.Glacier 0.2.11 | 66 | 33% | 68 |
| shinh.Entangled 0.3 | 27 | 14% | 29 |
| gh.micro.Gruweltje 0.7 | 12 | 6% | 15 |
| stelo.Wang 1.0 | 12 | 6% | 12 |
| maribo.FollowFire 1 | 6 | 3% | 5 |
| sample.Tracker 1.0 | 4 | 2% | 4 |
| apc.Colossus2 0.17 | 4 | 2% | 4 |
| ayk.WallHugger 1.0 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 80.7 | 124 / 210 | 2.74 | 18.1% | 31687 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.1% | 124 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.0% | 34 |
| catcat20.shape.Theta 0.018 | 3.2 | 12.2% | 32 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 9.8% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 9.8% | 4 |
| Lo_Ian.Gandalf_V4 4.0 | 5.5 | 9.6% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 5.8 | 9.5% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 7.8% | 7 |
| pa.Improved 1.0 | 9.0 | 5.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 76.5 | 18 / 35 | 5221 |
| 2 | 1 | 70.6 | 90.5 | 25 / 35 | 5840 |
| 3 | 1 | 69.0 | 83.5 | 22 / 35 | 5446 |
| 4 | 1 | 66.4 | 76.5 | 22 / 35 | 5097 |
| 5 | 1 | 65.9 | 77.1 | 17 / 35 | 4909 |
| 6 | 1 | 67.4 | 80.0 | 20 / 35 | 5174 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 75 | 85% |
| catcat20.shape.Theta 0.018 | 36 | 58% |
| co.edu.usb.rc.LidisTron 1.0 | 13 | 92% |
| sanyi.mikrobi.Roberto 1.0 | 12 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 80% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 34 | 40% | 105 |
| catcat20.shape.Theta 0.018 | 23 | 27% | 37 |
| sanyi.mikrobi.Roberto 1.0 | 8 | 9% | 21 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 7% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 6% | 17 |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 6% | 10 |
| sample.TrackFire 1.0 | 3 | 3% | 3 |
| pa.Improved 1.0 | 1 | 1% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 1% | 1 |

## Melee bench: F15

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 83.0 | 119 / 210 | 2.53 | 19.1% | 34741 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.1% | 119 |
| emp.Yngwie 1.11 | 2.7 | 12.9% | 46 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.5% | 15 |
| mld.DustBunny 3.8 | 3.7 | 12.0% | 7 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.6% | 8 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.3% | 14 |
| Grystrion.TrackerWO 1.0 | 7.0 | 7.3% | 0 |
| lambdaxy.TBot 0.1 | 7.8 | 6.4% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 5.1% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 83.2 | 18 / 35 | 5789 |
| 2 | 1 | 67.2 | 76.2 | 19 / 35 | 5558 |
| 3 | 1 | 69.0 | 83.5 | 22 / 35 | 5700 |
| 4 | 1 | 69.8 | 87.9 | 21 / 35 | 5785 |
| 5 | 1 | 69.1 | 85.1 | 19 / 35 | 5761 |
| 6 | 1 | 69.2 | 82.2 | 20 / 35 | 6148 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 51 | 61% |
| kawigi.micro.Shiz 1.1 | 45 | 96% |
| kawigi.robot.Girl 1.2 | 17 | 76% |
| mld.DustBunny 3.8 | 17 | 94% |
| cb.nano.Insomnia 1.0 | 14 | 79% |
| divineomega.TrialBot 0.003 | 4 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 1003. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 34 | 37% | 82 |
| cb.nano.Insomnia 1.0 | 14 | 15% | 13 |
| kawigi.micro.Shiz 1.1 | 13 | 14% | 36 |
| kawigi.robot.Girl 1.2 | 11 | 12% | 15 |
| mld.DustBunny 3.8 | 7 | 8% | 34 |
| lambdaxy.TBot 0.1 | 5 | 5% | 9 |
| divineomega.TrialBot 0.003 | 4 | 4% | 12 |
| Grystrion.TrackerWO 1.0 | 3 | 3% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 84.6 | 72 / 210 | 2.39 | 18.7% | 35070 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 18.7% | 72 |
| gh.Griezel 0.5.2 | 1.8 | 17.9% | 99 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.5% | 3 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.3% | 23 |
| tvv.nano.Polaris 1.2 | 5.5 | 8.8% | 6 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 8.8% | 1 |
| stelo.IntrinsicVolatility 1.4 | 7.2 | 6.8% | 0 |
| repositorio.NanoStep 1.0 | 8.7 | 5.2% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.1% | 5 |
| asd.Cthulhu 1.3 | 9.3 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 85.4 | 12 / 35 | 5972 |
| 2 | 1 | 69.9 | 84.8 | 15 / 35 | 6445 |
| 3 | 1 | 67.4 | 80.6 | 9 / 35 | 5671 |
| 4 | 2 | 67.1 | 81.6 | 12 / 35 | 5149 |
| 5 | 1 | 69.1 | 85.7 | 11 / 35 | 5824 |
| 6 | 1 | 70.0 | 89.5 | 13 / 35 | 6009 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 86 | 15% |
| techdude.forest.FlamingForest 1.1 | 31 | 71% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 22 | 100% |
| tvv.nano.Polaris 1.2 | 8 | 75% |
| bvh.fnr.Fenrir 0.36l | 5 | 80% |
| divineomega.DivineBot 1.9.4.5 | 2 | 50% |
| stelo.IntrinsicVolatility 1.4 | 2 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 1503. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 88 | 63% | 108 |
| techdude.forest.FlamingForest 1.1 | 17 | 12% | 40 |
| bvh.fnr.Fenrir 0.36l | 13 | 9% | 15 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 8 | 6% | 26 |
| stelo.IntrinsicVolatility 1.4 | 5 | 4% | 7 |
| tvv.nano.Polaris 1.2 | 4 | 3% | 7 |
| asd.Cthulhu 1.3 | 2 | 1% | 3 |
| repositorio.NanoStep 1.0 | 1 | 1% | 3 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 1 |

## Melee bench: F17

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 84.7 | 109 / 210 | 2.38 | 18.3% | 29599 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.3% | 109 |
| et.Predator 1.8 | 2.2 | 13.7% | 29 |
| oog.melee.Mercutio 1.0 | 3.7 | 12.0% | 26 |
| cx.BlestPain 1.41 | 4.2 | 11.4% | 27 |
| nic.Nicator 2.4 | 4.2 | 11.4% | 10 |
| ahf.NanoAndrew .4 | 5.8 | 10.1% | 6 |
| maribo.melee.BMV 0.1 | 7.0 | 8.3% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.2 | 6.1% | 1 |
| tex.Longbot 0.4 | 8.8 | 5.9% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 83.8 | 24 / 35 | 4737 |
| 2 | 1 | 66.9 | 79.7 | 15 / 35 | 4779 |
| 3 | 1 | 67.3 | 85.4 | 15 / 35 | 4733 |
| 4 | 1 | 69.0 | 87.3 | 19 / 35 | 5306 |
| 5 | 1 | 69.4 | 91.7 | 21 / 35 | 4913 |
| 6 | 1 | 66.9 | 80.0 | 15 / 35 | 5131 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 54 | 72% |
| oog.melee.Mercutio 1.0 | 33 | 70% |
| nic.Nicator 2.4 | 24 | 92% |
| cx.BlestPain 1.41 | 21 | 43% |
| ahf.NanoAndrew .4 | 12 | 83% |
| maribo.melee.BMV 0.1 | 6 | 83% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 1004. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 32 | 31% | 73 |
| oog.melee.Mercutio 1.0 | 24 | 24% | 47 |
| cx.BlestPain 1.41 | 23 | 23% | 33 |
| ahf.NanoAndrew .4 | 10 | 10% | 21 |
| nic.Nicator 2.4 | 8 | 8% | 25 |
| maribo.melee.BMV 0.1 | 3 | 3% | 5 |
| goblin.Bender 2.4 | 2 | 2% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 3 |
| tex.Longbot 0.4 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 79.9 | 113 / 210 | 2.80 | 17.4% | 26910 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.4% | 113 |
| agd.Mooserwirt2 2.7 | 2.5 | 12.7% | 29 |
| morbid.MorbidPriest 1.0 | 2.5 | 13.0% | 26 |
| uji.DBH 1.1 | 5.0 | 10.0% | 7 |
| ratosh.Nobo 0.21 | 5.2 | 9.9% | 3 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.8% | 9 |
| sigterm.Sigterm 1.0 | 6.3 | 8.4% | 10 |
| kawigi.mini.Fhqwhgads 1.1 | 8.2 | 7.1% | 3 |
| stelo.WangRobot 1.0 | 9.3 | 5.7% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 6.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 78.7 | 18 / 35 | 4786 |
| 2 | 1 | 65.0 | 76.8 | 18 / 35 | 4464 |
| 3 | 1 | 64.8 | 74.9 | 18 / 35 | 4365 |
| 4 | 1 | 65.1 | 78.7 | 19 / 35 | 3971 |
| 5 | 1 | 66.1 | 81.0 | 17 / 35 | 4580 |
| 6 | 1 | 69.2 | 89.5 | 23 / 35 | 4744 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agd.Mooserwirt2 2.7 | 38 | 68% |
| morbid.MorbidPriest 1.0 | 35 | 80% |
| uji.DBH 1.1 | 20 | 95% |
| sigterm.Sigterm 1.0 | 17 | 88% |
| spinnercat.Robovirus 2.718 | 15 | 67% |
| ratosh.Nobo 0.21 | 9 | 89% |
| stelo.WangRobot 1.0 | 8 | 63% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 50% |

Hadur died in 97 of 210 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 25 | 26% | 58 |
| morbid.MorbidPriest 1.0 | 20 | 21% | 55 |
| kawigi.mini.Fhqwhgads 1.1 | 12 | 12% | 16 |
| ratosh.Nobo 0.21 | 9 | 9% | 17 |
| sigterm.Sigterm 1.0 | 8 | 8% | 22 |
| spinnercat.Robovirus 2.718 | 7 | 7% | 14 |
| stelo.WangRobot 1.0 | 7 | 7% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 5 | 5% | 4 |
| uji.DBH 1.1 | 4 | 4% | 13 |

## Melee bench: F19

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.3 | 174 / 210 | 1.60 | 21.0% | 34267 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 21.0% | 174 |
| mld.Infinity 2.2 | 2.5 | 14.1% | 18 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.5 | 13.8% | 11 |
| erdnis.Rover 0.3 | 4.2 | 11.3% | 3 |
| krillr.mini.JointStrike 2.0.0 | 4.8 | 10.5% | 4 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.4% | 0 |
| mbh.Mbh 0.1 | 7.2 | 7.3% | 0 |
| pac.ABC 2.1 | 8.0 | 6.5% | 0 |
| pbg.R2D2 1.0 | 8.7 | 6.0% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 92.4 | 28 / 35 | 6169 |
| 2 | 1 | 70.6 | 90.2 | 28 / 35 | 5237 |
| 3 | 1 | 73.3 | 97.5 | 31 / 35 | 6115 |
| 4 | 1 | 69.3 | 85.7 | 26 / 35 | 5037 |
| 5 | 1 | 72.4 | 95.9 | 31 / 35 | 5591 |
| 6 | 1 | 73.3 | 98.4 | 30 / 35 | 6118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 86 | 90% |
| mld.Infinity 2.2 | 68 | 96% |
| erdnis.Rover 0.3 | 11 | 82% |
| krillr.mini.JointStrike 2.0.0 | 11 | 82% |
| patson.PatsonTestBot 1.0 | 7 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |
| pac.ABC 2.1 | 2 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 12 | 33% | 103 |
| mld.Infinity 2.2 | 7 | 19% | 25 |
| patson.PatsonTestBot 1.0 | 6 | 17% | 14 |
| krillr.mini.JointStrike 2.0.0 | 4 | 11% | 20 |
| erdnis.Rover 0.3 | 3 | 8% | 22 |
| pac.ABC 2.1 | 2 | 6% | 9 |
| mbh.Mbh 0.1 | 2 | 6% | 8 |
| pbg.R2D2 1.0 | 0 | 0% | 5 |

## Melee bench: F20

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 84.8 | 114 / 210 | 2.37 | 19.0% | 33833 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.0% | 114 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.9% | 50 |
| fwb.Nine 1.0.1 | 3.5 | 11.1% | 21 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 10.6% | 3 |
| catcat20.Rabbit 0.001 | 4.7 | 9.9% | 14 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 8.1% | 1 |
| m3thos.mini.Eva01 0.5.5 | 6.8 | 8.1% | 1 |
| bayen.nut.Squirrel 1.615 | 7.8 | 7.3% | 6 |
| ntc.ControlledChaos 1.1.4 | 8.7 | 6.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 81.9 | 19 / 35 | 5324 |
| 2 | 1 | 67.5 | 78.7 | 18 / 35 | 5704 |
| 3 | 1 | 66.8 | 79.4 | 14 / 35 | 5560 |
| 4 | 1 | 68.8 | 87.3 | 18 / 35 | 5586 |
| 5 | 1 | 70.1 | 89.5 | 22 / 35 | 5739 |
| 6 | 1 | 70.8 | 91.7 | 23 / 35 | 5920 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 81 | 68% |
| fwb.Nine 1.0.1 | 37 | 62% |
| catcat20.Rabbit 0.001 | 16 | 69% |
| bayen.nut.Squirrel 1.615 | 10 | 80% |
| nz.jdc.nano.GridFu 1.0 | 10 | 90% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 1081. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 48 | 50% | 98 |
| fwb.Nine 1.0.1 | 18 | 19% | 14 |
| catcat20.Rabbit 0.001 | 10 | 10% | 35 |
| nz.jdc.nano.GridFu 1.0 | 8 | 8% | 25 |
| djdjdj.NanoSkunk10 1.0 | 6 | 6% | 11 |
| bayen.nut.Squirrel 1.615 | 4 | 4% | 12 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 5 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 3 |

## Melee bench: F21

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 87.1 | 117 / 210 | 2.16 | 19.4% | 33729 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.4% | 117 |
| eem.EvBot v4.6.16 | 2.0 | 16.1% | 72 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.4% | 10 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.8% | 6 |
| eld.Hmm 1.0 | 5.3 | 8.4% | 6 |
| oa.weak.BotherBot 0.1 | 6.2 | 8.0% | 2 |
| fire219.CatBot 1.0 | 7.3 | 6.7% | 0 |
| el.JumpShoot 0.2 | 7.7 | 6.3% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 79.4 | 13 / 35 | 5406 |
| 2 | 1 | 70.6 | 91.1 | 20 / 35 | 5886 |
| 3 | 1 | 69.7 | 85.4 | 19 / 35 | 5936 |
| 4 | 1 | 70.3 | 91.7 | 22 / 35 | 5611 |
| 5 | 1 | 71.2 | 92.1 | 25 / 35 | 5668 |
| 6 | 1 | 68.4 | 82.9 | 18 / 35 | 5222 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 100 | 55% |
| dummy.mini.Scimitar 1.01 | 35 | 97% |
| cf.RiO.RiOx 4.2.1 | 22 | 95% |
| eld.Hmm 1.0 | 7 | 43% |
| oa.weak.BotherBot 0.1 | 4 | 75% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 1222. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 56 | 58% | 92 |
| dummy.mini.Scimitar 1.01 | 11 | 11% | 48 |
| cf.RiO.RiOx 4.2.1 | 6 | 6% | 23 |
| eld.Hmm 1.0 | 5 | 5% | 18 |
| PSW.Relentless 0.1 | 5 | 5% | 6 |
| oa.weak.BotherBot 0.1 | 4 | 4% | 10 |
| el.JumpShoot 0.2 | 3 | 3% | 7 |
| fire219.CatBot 1.0 | 3 | 3% | 2 |
| arthord.MannyPacquiao Beta | 1 | 1% | 4 |
2 death(s) with no robot to name.

## Melee bench: F22

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.4 | 73 / 210 | 2.40 | 17.7% | 30481 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 17.7% | 73 |
| pe.SandboxDT 2.71m | 1.8 | 16.2% | 62 |
| kvk.HebusLeTroll 0.35 | 2.8 | 14.7% | 39 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.8% | 28 |
| bigpete.Stewie 1.0 | 5.0 | 9.9% | 6 |
| tad.Dalek98 0.98 | 6.8 | 6.9% | 1 |
| yk.JahRoslav 1.1 | 7.0 | 6.7% | 1 |
| gg.Squaraus 0.6 | 7.3 | 6.5% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 5.1% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 85.7 | 15 / 35 | 5084 |
| 2 | 1 | 68.7 | 90.5 | 13 / 35 | 4838 |
| 3 | 2 | 66.7 | 82.9 | 9 / 35 | 4645 |
| 4 | 1 | 68.1 | 85.1 | 11 / 35 | 5374 |
| 5 | 1 | 68.5 | 85.4 | 14 / 35 | 5761 |
| 6 | 2 | 65.1 | 77.1 | 11 / 35 | 4779 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 53 | 30% |
| kvk.HebusLeTroll 0.35 | 45 | 58% |
| jlm.javaDisturbance 0.59 | 42 | 57% |
| bigpete.Stewie 1.0 | 8 | 75% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 1034. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 53 | 39% | 79 |
| kvk.HebusLeTroll 0.35 | 44 | 32% | 63 |
| jlm.javaDisturbance 0.59 | 27 | 20% | 46 |
| bigpete.Stewie 1.0 | 6 | 4% | 11 |
| tad.Dalek98 0.98 | 5 | 4% | 6 |
| yk.JahRoslav 1.1 | 2 | 1% | 2 |
| pbg.NinjaX 1.2 | 0 | 0% | 2 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 79.7 | 91 / 210 | 2.83 | 18.4% | 34118 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 18.4% | 91 |
| pe.SandboxLump 1.52 | 1.8 | 17.2% | 75 |
| cre.Karolos 0.32 | 3.0 | 14.4% | 24 |
| stelo.RamTrackSurfer 1.2 | 4.3 | 10.2% | 8 |
| stelo.AreaTargetingBot 1.1 | 5.5 | 9.4% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 9.2% | 3 |
| cw.megas.Blade 0.8 | 6.8 | 8.3% | 0 |
| sample.Walls 1.0 | 7.5 | 7.8% | 4 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.7% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 81.0 | 15 / 35 | 5510 |
| 2 | 1 | 69.8 | 82.9 | 18 / 35 | 5886 |
| 3 | 1 | 69.6 | 82.5 | 18 / 35 | 5665 |
| 4 | 1 | 69.7 | 83.5 | 15 / 35 | 5640 |
| 5 | 1 | 68.0 | 75.2 | 14 / 35 | 5867 |
| 6 | 2 | 67.3 | 73.0 | 11 / 35 | 5550 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 74 | 51% |
| cre.Karolos 0.32 | 41 | 78% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 63% |
| stelo.AreaTargetingBot 1.1 | 8 | 88% |
| stelo.RamTrackSurfer 1.2 | 6 | 100% |
| sample.Walls 1.0 | 3 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 58 | 49% | 97 |
| cre.Karolos 0.32 | 28 | 24% | 58 |
| stelo.AreaTargetingBot 1.1 | 12 | 10% | 18 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 6% | 7 |
| cw.megas.Blade 0.8 | 6 | 5% | 7 |
| stelo.RamTrackSurfer 1.2 | 5 | 4% | 13 |
| rrh.Iwillfindyou 2.0 | 2 | 2% | 3 |
| sample.Walls 1.0 | 1 | 1% | 6 |

## Melee bench: F24

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 67.1 | 35 / 210 | 3.96 | 13.8% | 23373 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.8 | 14.4% | 51 |
| florent.XSeries.X2 0.12 | 2.3 | 14.1% | 47 |
| hadur117.micro.Saor 0.2 | 2.5 | 13.8% | 35 |
| davidalves.Phoenix 0.54 | 3.5 | 13.1% | 43 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.7% | 18 |
| oog.melee.Corsair 1.0 | 6.0 | 9.0% | 7 |
| stelo.SoJNanoMelee 1.1 | 7.5 | 6.8% | 6 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.3% | 2 |
| as.FrankTheTank 1.3 | 8.8 | 5.7% | 0 |
| evd.X1 0.01 | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.0 | 66.0 | 9 / 35 | 4253 |
| 2 | 4 | 57.9 | 62.2 | 5 / 35 | 3523 |
| 3 | 3 | 60.6 | 64.1 | 5 / 35 | 4028 |
| 4 | 3 | 59.9 | 67.6 | 5 / 35 | 3538 |
| 5 | 2 | 61.5 | 72.4 | 5 / 35 | 3870 |
| 6 | 2 | 62.2 | 70.2 | 6 / 35 | 4161 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 23 | 17% |
| rz.GlowBlowMelee 1.4 | 22 | 45% |
| davidalves.Phoenix 0.54 | 20 | 40% |
| pedersen.Ugluk 1.1.1 | 11 | 45% |
| stelo.SoJNanoMelee 1.1 | 5 | 80% |
| oog.melee.Corsair 1.0 | 5 | 80% |

Hadur died in 176 of 210 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 57 | 32% | 62 |
| rz.GlowBlowMelee 1.4 | 31 | 18% | 36 |
| davidalves.Phoenix 0.54 | 30 | 17% | 36 |
| pedersen.Ugluk 1.1.1 | 25 | 14% | 30 |
| oog.melee.Corsair 1.0 | 10 | 6% | 17 |
| stelo.SoJNanoMelee 1.1 | 10 | 6% | 13 |
| evd.X1 0.01 | 6 | 3% | 6 |
| as.FrankTheTank 1.3 | 4 | 2% | 6 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 4 |

## Melee bench: F25

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 82.7 | 127 / 210 | 2.56 | 18.0% | 25470 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.0% | 127 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 13.3% | 23 |
| voidious.micro.BlitzBat 1.05 | 3.3 | 11.7% | 10 |
| jdw.Hurricane 1.4 | 3.7 | 11.6% | 20 |
| ds.Oo 2.2 | 5.3 | 9.6% | 11 |
| gre.svman4.Morfeas 1.4.1 | 5.8 | 9.6% | 11 |
| gjr.Cephalosporin 0.1 | 7.2 | 8.2% | 8 |
| awesomeness.Elite 1.0 | 7.8 | 7.1% | 1 |
| adt.Ar2 1.1 | 8.7 | 6.7% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 75.6 | 17 / 35 | 4044 |
| 2 | 1 | 68.0 | 85.4 | 23 / 35 | 4347 |
| 3 | 1 | 69.5 | 89.2 | 24 / 35 | 4788 |
| 4 | 1 | 63.6 | 72.4 | 15 / 35 | 4020 |
| 5 | 1 | 66.0 | 81.0 | 18 / 35 | 4056 |
| 6 | 1 | 70.1 | 92.7 | 30 / 35 | 4215 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 51 | 84% |
| voidious.micro.BlitzBat 1.05 | 43 | 93% |
| jdw.Hurricane 1.4 | 17 | 88% |
| gre.svman4.Morfeas 1.4.1 | 8 | 88% |
| ds.Oo 2.2 | 7 | 100% |
| gjr.Cephalosporin 0.1 | 6 | 100% |
| awesomeness.Elite 1.0 | 5 | 100% |
| adt.Ar2 1.1 | 3 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 569. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 21 | 25% | 64 |
| jdw.Hurricane 1.4 | 16 | 19% | 30 |
| ds.Oo 2.2 | 15 | 18% | 29 |
| voidious.micro.BlitzBat 1.05 | 12 | 14% | 43 |
| gre.svman4.Morfeas 1.4.1 | 6 | 7% | 13 |
| awesomeness.Elite 1.0 | 6 | 7% | 11 |
| adt.Ar2 1.1 | 4 | 5% | 7 |
| gjr.Cephalosporin 0.1 | 3 | 4% | 10 |
| amk.ChumbaMini 0.2 | 0 | 0% | 3 |

## Melee bench: F26

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.5 | 88 / 210 | 2.48 | 18.1% | 34010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.1% | 88 |
| ak.Fermat 2.0 | 2.0 | 15.4% | 56 |
| lrem.Spectre 0.4.4 | 3.2 | 12.4% | 21 |
| shu.nitro.LENIN .T34 | 4.0 | 11.9% | 30 |
| js.PinBall 1.6 | 5.3 | 10.3% | 8 |
| gh.mini.GrubbmOne 1.0 | 6.0 | 9.9% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.5 | 9.1% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.4% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.6 | 15 / 35 | 5933 |
| 2 | 1 | 66.0 | 77.5 | 12 / 35 | 5395 |
| 3 | 1 | 69.1 | 85.1 | 18 / 35 | 5770 |
| 4 | 1 | 66.6 | 78.1 | 14 / 35 | 5332 |
| 5 | 1 | 69.6 | 90.5 | 18 / 35 | 5461 |
| 6 | 1 | 67.7 | 81.6 | 11 / 35 | 6119 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 52 | 42% |
| shu.nitro.LENIN .T34 | 36 | 61% |
| lrem.Spectre 0.4.4 | 32 | 69% |
| js.PinBall 1.6 | 11 | 64% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 80% |
| gh.mini.GrubbmOne 1.0 | 5 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |
| logiblocs.SittingDroid 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 50 | 41% | 74 |
| shu.nitro.LENIN .T34 | 24 | 20% | 46 |
| lrem.Spectre 0.4.4 | 16 | 13% | 33 |
| js.PinBall 1.6 | 15 | 12% | 23 |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 5% | 10 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 4% | 10 |
| sample.SpinBot 1.0 | 4 | 3% | 4 |
| gh.mini.GrubbmOne 1.0 | 2 | 2% | 9 |

## Melee bench: F27

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 76.7 | 112 / 210 | 3.10 | 16.9% | 26430 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.5 | 16.9% | 112 |
| mk.Alpha 0.2.1 | 1.8 | 14.8% | 52 |
| wee.Gem 1.8.4 | 3.8 | 10.9% | 23 |
| EH.Eagle 1.0.6 | 5.0 | 9.5% | 3 |
| sheldor.melee.nano.TestMelee 0.1 | 5.0 | 9.9% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 6.2 | 8.7% | 4 |
| throxbot.ThroxBot 0.1 | 6.5 | 8.7% | 4 |
| joe.ADinosaur 1.0 | 6.8 | 8.6% | 0 |
| caimano.Furia_Ceca 0.22 | 8.7 | 7.3% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.9 | 16 / 35 | 4625 |
| 2 | 1 | 68.3 | 87.6 | 23 / 35 | 4602 |
| 3 | 1 | 68.5 | 87.6 | 26 / 35 | 4364 |
| 4 | 1 | 66.9 | 83.2 | 21 / 35 | 4522 |
| 5 | 1 | 65.0 | 76.2 | 18 / 35 | 4333 |
| 6 | 4 | 56.0 | 43.5 | 8 / 35 | 3984 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 74 | 76% |
| wee.Gem 1.8.4 | 19 | 89% |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 100% |
| EH.Eagle 1.0.6 | 12 | 100% |
| throxbot.ThroxBot 0.1 | 7 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 540. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 32 | 33% | 89 |
| joe.ADinosaur 1.0 | 15 | 15% | 17 |
| cs.Grudge 1.0 | 11 | 11% | 11 |
| wee.Gem 1.8.4 | 9 | 9% | 25 |
| caimano.Furia_Ceca 0.22 | 9 | 9% | 12 |
| throxbot.ThroxBot 0.1 | 8 | 8% | 13 |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 7% | 23 |
| EH.Eagle 1.0.6 | 4 | 4% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 3% | 8 |

## Melee bench: F28

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.5 | 122 / 210 | 2.21 | 18.2% | 25507 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.2% | 122 |
| kid.test.NightFox .2 | 2.0 | 15.1% | 44 |
| uji.Antique 1.0 | 3.2 | 12.1% | 20 |
| pfvicm.Sobieski 7.2.3b | 4.2 | 10.7% | 4 |
| qohnil.blot.BlotBot 3.61 | 4.7 | 10.3% | 15 |
| ahr.ice.Ice 1.0.2 | 6.5 | 7.9% | 1 |
| amk.ChumbaWumba 0.3 | 6.7 | 7.6% | 3 |
| matt.advanced.Katana 1.0 | 7.8 | 6.8% | 1 |
| stelo.Lifestealer 1.0 | 9.5 | 5.6% | 2 |
| stelo.PianistNano 1.2 | 9.5 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 79.4 | 18 / 35 | 4298 |
| 2 | 1 | 68.3 | 89.8 | 19 / 35 | 4453 |
| 3 | 1 | 67.9 | 86.3 | 21 / 35 | 4214 |
| 4 | 1 | 67.4 | 86.3 | 20 / 35 | 4089 |
| 5 | 1 | 68.2 | 90.5 | 24 / 35 | 4094 |
| 6 | 1 | 67.8 | 86.7 | 20 / 35 | 4359 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 80 | 69% |
| uji.Antique 1.0 | 40 | 88% |
| qohnil.blot.BlotBot 3.61 | 14 | 43% |
| pfvicm.Sobieski 7.2.3b | 9 | 100% |
| ahr.ice.Ice 1.0.2 | 7 | 100% |
| amk.ChumbaWumba 0.3 | 5 | 100% |
| stelo.Lifestealer 1.0 | 2 | 50% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 31 | 34% | 84 |
| qohnil.blot.BlotBot 3.61 | 17 | 19% | 27 |
| uji.Antique 1.0 | 16 | 18% | 49 |
| pfvicm.Sobieski 7.2.3b | 9 | 10% | 17 |
| amk.ChumbaWumba 0.3 | 6 | 7% | 10 |
| ahr.ice.Ice 1.0.2 | 4 | 4% | 11 |
| stelo.Lifestealer 1.0 | 4 | 4% | 7 |
| stelo.PianistNano 1.2 | 2 | 2% | 3 |
| matt.advanced.Katana 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 76.5 | 67 / 210 | 3.11 | 16.6% | 27219 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.5 | 16.6% | 67 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.5% | 65 |
| deewiant.Anomaly 0.2 | 2.3 | 14.5% | 57 |
| myl.micro.Troodon 1.10 | 4.2 | 11.4% | 2 |
| jok.PheonixM 0.1.2 | 5.2 | 9.9% | 7 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.3% | 2 |
| DBall.Anarchy 0.1 | 6.7 | 7.8% | 11 |
| fullsail.TimbotNoPrediction 1.0 | 8.3 | 5.9% | 0 |
| ap.Frederick 1.1 | 8.5 | 5.6% | 0 |
| jangs.ns51 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 70.2 | 13 / 35 | 4262 |
| 2 | 2 | 64.7 | 72.4 | 13 / 35 | 4410 |
| 3 | 1 | 66.4 | 77.8 | 11 / 35 | 5004 |
| 4 | 2 | 65.4 | 80.3 | 7 / 35 | 4270 |
| 5 | 1 | 64.4 | 73.3 | 9 / 35 | 4607 |
| 6 | 1 | 67.7 | 85.1 | 14 / 35 | 4666 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 56 | 45% |
| zyx.mega.YersiniaPestis 3.1 | 39 | 18% |
| myl.micro.Troodon 1.10 | 16 | 100% |
| jok.PheonixM 0.1.2 | 13 | 85% |
| DBall.Anarchy 0.1 | 5 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 0% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 60 | 42% | 91 |
| zyx.mega.YersiniaPestis 3.1 | 47 | 33% | 54 |
| jok.PheonixM 0.1.2 | 12 | 8% | 20 |
| myl.micro.Troodon 1.10 | 9 | 6% | 19 |
| ph.melee.ArcherME 0.3 | 5 | 3% | 7 |
| DBall.Anarchy 0.1 | 4 | 3% | 9 |
| fullsail.TimbotNoPrediction 1.0 | 4 | 3% | 6 |
| jangs.ns51 1.0 | 2 | 1% | 3 |

## Melee bench: F30

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 61.9 | 24 / 210 | 4.43 | 12.9% | 23778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.3 | 13.7% | 55 |
| oog.melee.Capulet 1.2 | 2.5 | 13.3% | 39 |
| darkcanuck.B26354 1.06 | 2.5 | 13.6% | 55 |
| hadur117.micro.Saor 0.2 | 3.5 | 12.9% | 24 |
| stelo.PastFuture 2.3.2 | 4.2 | 12.0% | 24 |
| intruder.PrairieWolf 2.61 | 6.3 | 8.7% | 8 |
| ntc.Opposite 1.5 | 7.5 | 7.7% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.7 | 7.7% | 4 |
| tripphippy.Alice 1.1 | 8.5 | 7.3% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.2 | 56.5 | 7 / 35 | 4085 |
| 2 | 2 | 61.2 | 69.2 | 6 / 35 | 4258 |
| 3 | 4 | 56.8 | 59.4 | 1 / 35 | 3665 |
| 4 | 2 | 61.7 | 68.3 | 4 / 35 | 4387 |
| 5 | 5 | 55.5 | 58.7 | 2 / 35 | 3303 |
| 6 | 4 | 58.3 | 59.0 | 4 / 35 | 4080 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 21 | 10% |
| oog.melee.Capulet 1.2 | 17 | 59% |
| darkcanuck.B26354 1.06 | 17 | 24% |
| stelo.PastFuture 2.3.2 | 10 | 20% |
| intruder.PrairieWolf 2.61 | 5 | 40% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |
| tripphippy.Alice 1.1 | 2 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 57 | 31% | 60 |
| oog.melee.Capulet 1.2 | 36 | 19% | 48 |
| darkcanuck.B26354 1.06 | 34 | 18% | 38 |
| stelo.PastFuture 2.3.2 | 23 | 12% | 24 |
| tripphippy.Alice 1.1 | 11 | 6% | 11 |
| intruder.PrairieWolf 2.61 | 8 | 4% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 8 | 4% | 9 |
| ntc.Opposite 1.5 | 5 | 3% | 5 |
| GarmBox.Anger 1.0 | 4 | 2% | 5 |

## Melee bench: F31

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 71.7 | 35 / 210 | 3.55 | 14.4% | 22252 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.4% | 118 |
| hadur117.micro.Saor 0.2 | 2.0 | 14.4% | 35 |
| gh.mini.Griezel 0.2 | 3.3 | 12.5% | 36 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 10.8% | 6 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.5% | 9 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.3% | 6 |
| fm.mammillarias 1.3 | 7.3 | 6.6% | 0 |
| timmit.nano.TimDog 0.33 | 7.7 | 6.7% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.4% | 0 |
| tlp.ThreeLeggedPig 1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 73.7 | 6 / 35 | 3956 |
| 2 | 2 | 59.6 | 66.0 | 4 / 35 | 3575 |
| 3 | 2 | 62.5 | 72.7 | 7 / 35 | 3760 |
| 4 | 2 | 61.7 | 72.4 | 6 / 35 | 3525 |
| 5 | 2 | 61.6 | 71.1 | 5 / 35 | 3689 |
| 6 | 2 | 62.5 | 74.3 | 7 / 35 | 3747 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 48 | 6% |
| gh.mini.Griezel 0.2 | 19 | 32% |
| spinnercat.micro.Tyger 0.1 | 14 | 86% |
| d414.nano.Quantum 1.0.0 | 10 | 90% |
| timmit.nano.TimDog 0.33 | 3 | 67% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 107 | 61% | 111 |
| gh.mini.Griezel 0.2 | 30 | 17% | 39 |
| spinnercat.micro.Tyger 0.1 | 13 | 7% | 24 |
| d414.nano.Quantum 1.0.0 | 7 | 4% | 14 |
| fm.mammillarias 1.3 | 5 | 3% | 5 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 5 |
| tlp.ThreeLeggedPig 1 | 4 | 2% | 5 |
| gh.nano.Grofvuil 0.2 | 2 | 1% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 81.3 | 95 / 210 | 2.68 | 17.4% | 29371 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.4% | 95 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.3% | 73 |
| apc.botM 3.0 | 3.3 | 11.7% | 16 |
| vjik.UnViolation 1.1 | 4.0 | 10.5% | 14 |
| lxx.ConceptA 0.8 | 4.7 | 10.7% | 1 |
| bayen.UbaMicro 1.4 | 6.2 | 8.5% | 1 |
| panzer.Panzer 0.2 | 7.2 | 7.3% | 0 |
| yk.JahMicro 1.0 | 8.2 | 6.5% | 5 |
| donjezza.Jezza 1.0 | 9.2 | 6.0% | 5 |
| conscience.Electron 1.3g | 9.3 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 84.1 | 17 / 35 | 4937 |
| 2 | 1 | 67.3 | 83.5 | 16 / 35 | 5238 |
| 3 | 1 | 66.4 | 81.6 | 15 / 35 | 4930 |
| 4 | 1 | 65.4 | 77.5 | 18 / 35 | 4630 |
| 5 | 1 | 64.0 | 74.0 | 15 / 35 | 4609 |
| 6 | 1 | 67.7 | 87.3 | 14 / 35 | 5027 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 67 | 27% |
| apc.botM 3.0 | 24 | 88% |
| lxx.ConceptA 0.8 | 18 | 100% |
| bayen.UbaMicro 1.4 | 13 | 92% |
| vjik.UnViolation 1.1 | 12 | 92% |
| donjezza.Jezza 1.0 | 10 | 100% |
| yk.JahMicro 1.0 | 4 | 75% |
| panzer.Panzer 0.2 | 2 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 69 | 59% | 90 |
| lxx.ConceptA 0.8 | 16 | 14% | 28 |
| conscience.Electron 1.3g | 8 | 7% | 8 |
| apc.botM 3.0 | 6 | 5% | 34 |
| vjik.UnViolation 1.1 | 6 | 5% | 22 |
| yk.JahMicro 1.0 | 4 | 3% | 10 |
| bayen.UbaMicro 1.4 | 4 | 3% | 9 |
| panzer.Panzer 0.2 | 3 | 3% | 3 |
| donjezza.Jezza 1.0 | 0 | 0% | 5 |

## Melee bench: F33

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 83.3 | 109 / 210 | 2.50 | 18.8% | 31546 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.8% | 109 |
| maribo.Quester 0.3 | 2.0 | 15.3% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.0% | 23 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.6% | 17 |
| labg.Cataclysm 2.05 | 5.3 | 9.5% | 13 |
| baal.nano.N 1.42 | 5.8 | 8.9% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 7.0 | 8.0% | 5 |
| zyx.micro.Ant 1.1 | 8.0 | 6.1% | 0 |
| sanja.First 0.1 | 9.0 | 4.9% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 79.4 | 16 / 35 | 5188 |
| 2 | 1 | 69.1 | 87.0 | 19 / 35 | 5069 |
| 3 | 1 | 67.5 | 79.4 | 16 / 35 | 5114 |
| 4 | 1 | 68.2 | 82.9 | 17 / 35 | 5239 |
| 5 | 1 | 71.4 | 91.1 | 23 / 35 | 5944 |
| 6 | 1 | 67.6 | 80.3 | 18 / 35 | 4992 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 51 | 65% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 93% |
| gre.svman4.Leonidas 1.3.2 | 26 | 77% |
| labg.Cataclysm 2.05 | 10 | 40% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 86% |
| zyx.micro.Ant 1.1 | 4 | 100% |
| baal.nano.N 1.42 | 3 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 40 | 39% | 75 |
| gre.svman4.Leonidas 1.3.2 | 18 | 18% | 36 |
| labg.Cataclysm 2.05 | 12 | 12% | 15 |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 10% | 13 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 9% | 48 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 5 | 5% | 6 |
| zyx.micro.Ant 1.1 | 3 | 3% | 7 |
| baal.nano.N 1.42 | 3 | 3% | 6 |
| sanja.First 0.1 | 2 | 2% | 4 |

## Melee bench: F34

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 74.4 | 39 / 210 | 3.30 | 15.6% | 28129 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.7 | 16.5% | 81 |
| kid.Gladiator .7.2 | 1.7 | 16.7% | 64 |
| hadur117.micro.Saor 0.2 | 2.7 | 15.6% | 39 |
| jcs.Seth 1.8 | 4.5 | 11.1% | 12 |
| tcf.Reach 3 | 4.8 | 11.0% | 8 |
| cli.Dancer 1.1 | 5.7 | 9.9% | 4 |
| ratosh.Wesco 1.4 | 7.0 | 6.9% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.2% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.9% | 0 |
| sample.RamFire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.4 | 71.4 | 6 / 35 | 4850 |
| 2 | 2 | 66.1 | 78.7 | 8 / 35 | 4679 |
| 3 | 3 | 63.8 | 72.7 | 7 / 35 | 4277 |
| 4 | 2 | 65.5 | 76.8 | 4 / 35 | 5080 |
| 5 | 3 | 65.7 | 76.8 | 9 / 35 | 4871 |
| 6 | 3 | 63.3 | 69.8 | 5 / 35 | 4372 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 50 | 28% |
| kid.Gladiator .7.2 | 37 | 35% |
| jcs.Seth 1.8 | 11 | 73% |
| tcf.Reach 3 | 6 | 67% |
| cli.Dancer 1.1 | 2 | 0% |
| ratosh.Wesco 1.4 | 1 | 0% |

Hadur died in 171 of 210 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 71 | 42% | 87 |
| kid.Gladiator .7.2 | 64 | 37% | 72 |
| tcf.Reach 3 | 12 | 7% | 18 |
| jcs.Seth 1.8 | 8 | 5% | 16 |
| sample.RamFire 1.0 | 7 | 4% | 7 |
| ratosh.Wesco 1.4 | 3 | 2% | 4 |
| cli.Dancer 1.1 | 3 | 2% | 4 |
| sample.VelociRobot 1.0 | 2 | 1% | 1 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |

## Melee bench: F35

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 73.5 | 10 / 210 | 3.39 | 13.9% | 21171 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 164 |
| hadur117.micro.Saor 0.2 | 2.2 | 13.9% | 10 |
| gh.mini.Gruwel 0.9 | 3.2 | 13.2% | 24 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 11.6% | 10 |
| rz.HawkOnFire 0.1 | 4.5 | 11.9% | 2 |
| myl.nano.KomoriNinja 1.1 | 6.5 | 6.7% | 0 |
| wit.Chuliath 1.0 | 6.5 | 6.8% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.3 | 5.6% | 0 |
| dans.Cinnamon 1.2 | 8.8 | 5.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 75.2 | 2 / 35 | 3389 |
| 2 | 2 | 63.2 | 76.8 | 3 / 35 | 3923 |
| 3 | 2 | 59.4 | 66.7 | 1 / 35 | 3182 |
| 4 | 2 | 62.1 | 74.6 | 0 / 35 | 3693 |
| 5 | 2 | 62.2 | 76.2 | 2 / 35 | 3456 |
| 6 | 3 | 60.7 | 71.4 | 2 / 35 | 3528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 46 | 9% |
| gh.mini.Gruwel 0.9 | 9 | 0% |
| dmh.robocode.robot.BlackDeath 9.2 | 5 | 20% |
| rz.HawkOnFire 0.1 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 200 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 131 | 66% | 133 |
| gh.mini.Gruwel 0.9 | 33 | 17% | 33 |
| dmh.robocode.robot.BlackDeath 9.2 | 19 | 10% | 21 |
| rz.HawkOnFire 0.1 | 10 | 5% | 14 |
| myl.nano.KomoriNinja 1.1 | 3 | 2% | 4 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 2 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 0 | 0% | 1 |

## Melee bench: F36

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 88.4 | 155 / 210 | 2.05 | 20.5% | 34292 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 20.5% | 155 |
| bzdp.Pansy 2.1 | 2.3 | 12.2% | 15 |
| alpha.RainingFire 1.0 | 3.3 | 11.7% | 13 |
| mz.Cork 0.1 | 3.7 | 11.1% | 14 |
| bvh.micro.Freya 0.3 | 5.0 | 10.2% | 5 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.2% | 1 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.0% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 6.8% | 1 |
| dl.BetterWalls 1.0 | 8.8 | 5.5% | 2 |
| sample.MyFirstRobot 1.0 | 9.8 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 89.8 | 29 / 35 | 5729 |
| 2 | 1 | 70.3 | 87.3 | 26 / 35 | 5546 |
| 3 | 1 | 71.2 | 90.8 | 26 / 35 | 5921 |
| 4 | 1 | 71.8 | 93.3 | 28 / 35 | 5952 |
| 5 | 1 | 67.7 | 77.5 | 21 / 35 | 5520 |
| 6 | 1 | 70.8 | 91.4 | 25 / 35 | 5624 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 51 | 94% |
| bvh.micro.Freya 0.3 | 33 | 97% |
| mz.Cork 0.1 | 29 | 83% |
| alpha.RainingFire 1.0 | 21 | 81% |
| bvh.mini.Fenrir 0.39 | 16 | 100% |
| m3thos.Eva02 0.7.1 | 8 | 88% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 14 | 25% | 34 |
| mz.Cork 0.1 | 9 | 16% | 37 |
| bzdp.Pansy 2.1 | 8 | 15% | 53 |
| bvh.micro.Freya 0.3 | 8 | 15% | 34 |
| dl.BetterWalls 1.0 | 8 | 15% | 16 |
| m3thos.Eva02 0.7.1 | 4 | 7% | 13 |
| bvh.mini.Fenrir 0.39 | 2 | 4% | 10 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 7 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F37

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 79.5 | 132 / 210 | 2.85 | 18.0% | 32613 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.0% | 132 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.3 | 11.2% | 14 |
| germ.TheMind .2 | 3.8 | 10.9% | 23 |
| EBBU.Sim2 1.02 | 4.0 | 9.9% | 4 |
| agrach.Dalek 1.0 | 5.3 | 9.2% | 9 |
| stelo.UntouchableNano 1.3 | 6.7 | 8.7% | 9 |
| mb.Beast 0.1 | 6.8 | 8.6% | 12 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 7.9% | 1 |
| lmk.ACPFinal 0.1 | 8.2 | 8.0% | 4 |
| skm.Ryubot 1.0 | 8.8 | 7.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 77.1 | 22 / 35 | 5050 |
| 2 | 1 | 64.9 | 71.7 | 18 / 35 | 5487 |
| 3 | 1 | 67.4 | 81.9 | 23 / 35 | 5758 |
| 4 | 1 | 67.3 | 81.3 | 25 / 35 | 5549 |
| 5 | 1 | 67.1 | 85.1 | 21 / 35 | 5239 |
| 6 | 1 | 66.8 | 79.7 | 23 / 35 | 5530 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 28 | 82% |
| com.syncleus.robocode.Dreadnaught 0.1 | 24 | 88% |
| stelo.UntouchableNano 1.3 | 23 | 91% |
| mb.Beast 0.1 | 18 | 83% |
| EBBU.Sim2 1.02 | 18 | 100% |
| skm.Ryubot 1.0 | 15 | 93% |
| agrach.Dalek 1.0 | 10 | 100% |
| lmk.ACPFinal 0.1 | 7 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 355. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 17 | 22% | 32 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 17% | 26 |
| com.syncleus.robocode.Dreadnaught 0.1 | 10 | 13% | 36 |
| agrach.Dalek 1.0 | 8 | 10% | 22 |
| stelo.UntouchableNano 1.3 | 7 | 9% | 18 |
| lmk.ACPFinal 0.1 | 7 | 9% | 12 |
| mb.Beast 0.1 | 6 | 8% | 25 |
| EBBU.Sim2 1.02 | 6 | 8% | 24 |
| skm.Ryubot 1.0 | 4 | 5% | 12 |

## Melee bench: F38

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 73.7 | 48 / 210 | 3.37 | 15.3% | 26549 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.3 | 16.4% | 95 |
| hadur117.micro.Saor 0.2 | 1.8 | 15.3% | 48 |
| bvh.mini.Freya 0.55 | 3.0 | 13.2% | 15 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.2% | 25 |
| cs.Wren 1.0 | 4.8 | 10.6% | 7 |
| kdf.KoulDestroyer 1.0 | 6.2 | 9.5% | 7 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.5 | 8.8% | 8 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 5.9% | 4 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.7% | 1 |
| bzdp.BoxCar 2.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.7 | 64.8 | 5 / 35 | 4086 |
| 2 | 1 | 67.6 | 86.3 | 12 / 35 | 5030 |
| 3 | 2 | 62.9 | 71.1 | 8 / 35 | 4392 |
| 4 | 3 | 59.3 | 63.2 | 5 / 35 | 3982 |
| 5 | 1 | 65.9 | 79.7 | 12 / 35 | 4674 |
| 6 | 2 | 63.6 | 77.1 | 6 / 35 | 4385 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 53 | 9% |
| bvh.mini.Freya 0.55 | 17 | 88% |
| bts.mega.Gnarly 1.4 | 15 | 40% |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 82% |
| cs.Wren 1.0 | 10 | 90% |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 50% |
| kdf.KoulDestroyer 1.0 | 3 | 67% |

Hadur died in 162 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 87 | 54% | 96 |
| bts.mega.Gnarly 1.4 | 19 | 12% | 27 |
| bvh.mini.Freya 0.55 | 18 | 11% | 28 |
| kdf.KoulDestroyer 1.0 | 11 | 7% | 13 |
| cs.Wren 1.0 | 10 | 6% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 5% | 15 |
| kawigi.spare.SpareParts 0.7.6nosnd | 6 | 4% | 9 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 2 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

## Melee bench: F39

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 80.4 | 70 / 210 | 2.77 | 17.4% | 32102 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.4% | 70 |
| bvh.fry.Freya 0.82 | 2.2 | 14.7% | 22 |
| az.Ololobot 0.2.4 | 2.8 | 13.7% | 76 |
| catcat20.Lambda 0.024 | 4.0 | 10.9% | 27 |
| gimp.GimpBot 0.1 | 6.0 | 8.1% | 3 |
| stelo.SoRobotNanoMelee 1.2 | 6.5 | 7.9% | 9 |
| winamp32.micro.MicroMacro 1.0 | 6.8 | 8.1% | 2 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 7.5% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 6.1% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.5 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 85.1 | 11 / 35 | 5625 |
| 2 | 1 | 65.2 | 77.1 | 10 / 35 | 5087 |
| 3 | 1 | 64.9 | 76.5 | 12 / 35 | 5121 |
| 4 | 1 | 66.5 | 79.7 | 12 / 35 | 5601 |
| 5 | 1 | 66.6 | 80.3 | 10 / 35 | 5580 |
| 6 | 1 | 66.7 | 83.5 | 15 / 35 | 5088 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 47 | 19% |
| bvh.fry.Freya 0.82 | 39 | 69% |
| catcat20.Lambda 0.024 | 36 | 50% |
| stelo.SoRobotNanoMelee 1.2 | 6 | 83% |
| gimp.GimpBot 0.1 | 5 | 80% |
| winamp32.micro.MicroMacro 1.0 | 3 | 67% |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 1011. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 53 | 38% | 69 |
| bvh.fry.Freya 0.82 | 32 | 23% | 56 |
| catcat20.Lambda 0.024 | 26 | 19% | 37 |
| stelo.SoRobotNanoMelee 1.2 | 10 | 7% | 12 |
| winamp32.micro.MicroMacro 1.0 | 6 | 4% | 11 |
| whitesquare.robots.SkynetAdvanced 1.1 | 5 | 4% | 6 |
| apollokidd.ApolloKidd 0.9 | 4 | 3% | 6 |
| gimp.GimpBot 0.1 | 3 | 2% | 10 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 3 |

## Melee bench: F40

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 84.7 | 120 / 210 | 2.38 | 18.7% | 29553 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.7% | 120 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.6% | 45 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.5% | 14 |
| Polkwane.SmashMelee 1.0 | 4.3 | 10.9% | 11 |
| mz.AntiGrav 1.0 | 4.7 | 10.7% | 6 |
| alpha.BlackIce 1.0 | 6.2 | 9.0% | 5 |
| stelo.Randomness 1.0 | 6.8 | 7.9% | 7 |
| amk.superstrike.SuperStrike 0.3 | 8.2 | 6.0% | 1 |
| testantiswapgun.AntiSwap 1.0 | 8.7 | 5.6% | 1 |
| sample.Corners 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 80.0 | 20 / 35 | 4617 |
| 2 | 1 | 70.1 | 89.8 | 24 / 35 | 5355 |
| 3 | 1 | 69.7 | 87.9 | 20 / 35 | 5290 |
| 4 | 1 | 67.1 | 78.1 | 19 / 35 | 4791 |
| 5 | 1 | 68.2 | 86.0 | 20 / 35 | 4602 |
| 6 | 1 | 68.2 | 86.3 | 17 / 35 | 4898 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 50 | 60% |
| kano.gamma.KanoGamma 1.8 | 43 | 81% |
| Polkwane.SmashMelee 1.0 | 28 | 82% |
| mz.AntiGrav 1.0 | 20 | 100% |
| alpha.BlackIce 1.0 | 7 | 71% |
| stelo.Randomness 1.0 | 5 | 40% |
| sample.Corners 1.0 | 4 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 35 | 39% | 59 |
| kano.gamma.KanoGamma 1.8 | 17 | 19% | 51 |
| Polkwane.SmashMelee 1.0 | 13 | 14% | 24 |
| alpha.BlackIce 1.0 | 8 | 9% | 14 |
| stelo.Randomness 1.0 | 7 | 8% | 17 |
| mz.AntiGrav 1.0 | 5 | 6% | 25 |
| amk.superstrike.SuperStrike 0.3 | 4 | 4% | 6 |
| sample.Corners 1.0 | 1 | 1% | 6 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 5 |

## Melee bench: F41

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 74.7 | 83 / 210 | 3.28 | 16.3% | 27513 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.5 | 16.3% | 83 |
| eem.EvBotNG v12.8 | 1.5 | 16.2% | 79 |
| ary.Swarm 1.1 | 3.3 | 12.8% | 16 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.1% | 15 |
| simonton.nano.MeleeSeed 1.8 | 5.3 | 10.4% | 7 |
| shrub.Silver v048 | 5.7 | 10.0% | 2 |
| zyx.nano.Ant 1.1 | 7.2 | 7.5% | 0 |
| jsal.Jsalbot 1.0 | 8.0 | 6.1% | 4 |
| stelo.Mirror 1.1 | 8.8 | 5.9% | 4 |
| acogdev.alpha 0.2 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 78.1 | 15 / 35 | 4494 |
| 2 | 1 | 66.0 | 77.1 | 15 / 35 | 4732 |
| 3 | 2 | 64.1 | 71.7 | 11 / 35 | 4528 |
| 4 | 2 | 62.6 | 66.0 | 10 / 35 | 4243 |
| 5 | 2 | 63.7 | 69.5 | 13 / 35 | 4784 |
| 6 | 1 | 68.2 | 85.7 | 19 / 35 | 4732 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 52 | 40% |
| lessonz.robocode.Oz 0.5.0 | 24 | 100% |
| ary.Swarm 1.1 | 20 | 80% |
| simonton.nano.MeleeSeed 1.8 | 16 | 94% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| shrub.Silver v048 | 3 | 100% |
| stelo.Mirror 1.1 | 1 | 0% |

Hadur died in 127 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 67 | 53% | 90 |
| ary.Swarm 1.1 | 17 | 13% | 37 |
| simonton.nano.MeleeSeed 1.8 | 13 | 10% | 28 |
| zyx.nano.Ant 1.1 | 12 | 9% | 12 |
| lessonz.robocode.Oz 0.5.0 | 7 | 6% | 19 |
| stelo.Mirror 1.1 | 4 | 3% | 4 |
| jsal.Jsalbot 1.0 | 3 | 2% | 10 |
| shrub.Silver v048 | 2 | 2% | 6 |
| acogdev.alpha 0.2 | 2 | 2% | 4 |

## Melee bench: F42

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 75.3 | 50 / 210 | 3.22 | 15.9% | 29281 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 16.9% | 93 |
| hadur117.micro.Saor 0.2 | 2.2 | 15.9% | 50 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.7% | 20 |
| ara.Shera 0.88 | 3.5 | 14.1% | 41 |
| amz.NanoClone 1.41 | 5.2 | 8.7% | 0 |
| maribo.IotaCT 1.1 | 6.2 | 7.7% | 1 |
| dsw.StaticD 1.0 | 6.8 | 7.0% | 5 |
| stelo.MirrorMicro 1.0 | 8.0 | 6.1% | 0 |
| mme.NikeEnhanced 2.0 | 9.2 | 5.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 73.0 | 9 / 35 | 4607 |
| 2 | 2 | 66.1 | 81.0 | 10 / 35 | 5083 |
| 3 | 2 | 65.0 | 76.5 | 7 / 35 | 5045 |
| 4 | 2 | 65.4 | 75.2 | 9 / 35 | 5294 |
| 5 | 3 | 63.8 | 73.7 | 8 / 35 | 4567 |
| 6 | 2 | 63.7 | 72.7 | 7 / 35 | 4685 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 44 | 32% |
| ara.Shera 0.88 | 31 | 48% |
| maribo.mini.MiniQuester 0.1 | 21 | 67% |
| amz.NanoClone 1.41 | 3 | 100% |
| dsw.StaticD 1.0 | 2 | 50% |
| maribo.IotaCT 1.1 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 72 | 45% | 90 |
| ara.Shera 0.88 | 37 | 23% | 53 |
| maribo.mini.MiniQuester 0.1 | 23 | 14% | 35 |
| amz.NanoClone 1.41 | 10 | 6% | 12 |
| dsw.StaticD 1.0 | 7 | 4% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 5 | 3% | 5 |
| maribo.IotaCT 1.1 | 3 | 2% | 5 |
| stelo.MirrorMicro 1.0 | 3 | 2% | 3 |

## Melee bench: F43

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 72.0 | 14 / 210 | 3.52 | 14.1% | 23143 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.8% | 169 |
| hadur117.micro.Saor 0.2 | 2.0 | 14.1% | 14 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.5% | 19 |
| dummy.micro.Sparrow 2.5 | 4.7 | 10.7% | 3 |
| Krabb.akim2.Akim2 1.1b | 4.8 | 10.3% | 1 |
| wcsv.melee.EngineerMelee 0.1 | 5.5 | 10.3% | 4 |
| jab.DiamondStealer 5 | 7.2 | 7.8% | 0 |
| mz.NanoGod 2.02 | 7.8 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 69.2 | 3 / 35 | 3537 |
| 2 | 2 | 62.4 | 70.8 | 3 / 35 | 3807 |
| 3 | 2 | 63.9 | 76.2 | 1 / 35 | 4085 |
| 4 | 2 | 61.9 | 67.9 | 2 / 35 | 3732 |
| 5 | 2 | 63.1 | 71.1 | 1 / 35 | 3977 |
| 6 | 2 | 64.5 | 76.5 | 4 / 35 | 4005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 62 | 2% |
| brainfade.melee.Dusk 0.44 | 15 | 47% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 50% |
| dummy.micro.Sparrow 2.5 | 2 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 196 of 210 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 128 | 65% | 129 |
| brainfade.melee.Dusk 0.44 | 36 | 18% | 41 |
| wcsv.melee.EngineerMelee 0.1 | 14 | 7% | 17 |
| dummy.micro.Sparrow 2.5 | 7 | 4% | 11 |
| mz.NanoGod 2.02 | 4 | 2% | 5 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 4 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |

## Melee bench: F44

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.2 | 93 / 210 | 2.69 | 17.9% | 31010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.9% | 93 |
| stelo.Liblix 0.3.1 | 2.2 | 15.3% | 75 |
| tzu.TheArtOfWar 1.2 | 2.8 | 13.4% | 23 |
| wompi.Quokka 1.6 | 4.5 | 9.9% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.2 | 9.4% | 3 |
| jwirde.Gort 2.0 | 5.3 | 9.6% | 8 |
| stf.PanzerGeneral 0.1 | 7.7 | 7.0% | 1 |
| disan.Chair 2.2.0 | 7.7 | 7.4% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 5.2% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 84.1 | 14 / 35 | 5051 |
| 2 | 1 | 67.4 | 81.0 | 13 / 35 | 5512 |
| 3 | 1 | 66.7 | 78.7 | 16 / 35 | 4921 |
| 4 | 1 | 65.6 | 75.2 | 15 / 35 | 4971 |
| 5 | 1 | 66.3 | 80.0 | 16 / 35 | 4912 |
| 6 | 1 | 69.4 | 88.3 | 19 / 35 | 5643 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 78 | 35% |
| tzu.TheArtOfWar 1.2 | 45 | 82% |
| wompi.Quokka 1.6 | 12 | 83% |
| jwirde.Gort 2.0 | 8 | 63% |
| disan.Chair 2.2.0 | 6 | 83% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 3 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 70 | 60% | 102 |
| tzu.TheArtOfWar 1.2 | 22 | 19% | 54 |
| jwirde.Gort 2.0 | 9 | 8% | 19 |
| wompi.Quokka 1.6 | 7 | 6% | 14 |
| stf.PanzerGeneral 0.1 | 4 | 3% | 6 |
| disan.Chair 2.2.0 | 3 | 3% | 3 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 1 | 1% | 8 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 4 |

## Melee bench: F45

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 84.2 | 86 / 210 | 2.42 | 19.2% | 35068 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.2% | 86 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.7% | 100 |
| jje.BagPuss 1.2 | 2.8 | 12.3% | 11 |
| sul.Lunar 1.1 | 5.0 | 9.6% | 4 |
| myl.nano.Graviton 1.10 | 5.5 | 9.3% | 0 |
| fm.claire 1.7 | 5.7 | 9.2% | 0 |
| hvilela.HVilela 0.9 | 6.7 | 8.5% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 7.8% | 3 |
| wit.Deep7 2.0 | 9.0 | 6.1% | 5 |
| abud.ThirdRobo 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 85.1 | 16 / 35 | 6383 |
| 2 | 1 | 68.6 | 81.9 | 15 / 35 | 5908 |
| 3 | 1 | 67.2 | 79.7 | 14 / 35 | 5381 |
| 4 | 1 | 68.5 | 84.1 | 16 / 35 | 5550 |
| 5 | 1 | 69.0 | 86.3 | 11 / 35 | 5980 |
| 6 | 1 | 69.3 | 87.9 | 14 / 35 | 5866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 103 | 26% |
| jje.BagPuss 1.2 | 26 | 85% |
| sul.Lunar 1.1 | 15 | 93% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 100% |
| wit.Deep7 2.0 | 7 | 57% |
| myl.nano.Graviton 1.10 | 6 | 100% |
| hvilela.HVilela 0.9 | 4 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 2156. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 80 | 65% | 0 |
| jje.BagPuss 1.2 | 10 | 8% | 62 |
| pez.mini.ChironexFleckeri 0.5 | 9 | 7% | 32 |
| fm.claire 1.7 | 6 | 5% | 13 |
| hvilela.HVilela 0.9 | 5 | 4% | 16 |
| abud.ThirdRobo 1.0 | 5 | 4% | 7 |
| sul.Lunar 1.1 | 3 | 2% | 48 |
| myl.nano.Graviton 1.10 | 3 | 2% | 23 |
| wit.Deep7 2.0 | 3 | 2% | 7 |

## Melee bench: F46

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 67.7 | 24 / 210 | 3.91 | 14.0% | 26191 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 17.6% | 78 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.7% | 91 |
| hadur117.micro.Saor 0.2 | 3.0 | 14.0% | 24 |
| mz.MicroSheep 1.0 | 4.5 | 10.2% | 1 |
| cx.Princess 1.0 | 4.5 | 10.3% | 15 |
| sadoner.killer 0.2 | 6.0 | 9.0% | 1 |
| arthord.NanoSatanMelee Beta | 7.3 | 6.7% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.7 | 6.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 63.5 | 4 / 35 | 4369 |
| 2 | 3 | 60.8 | 65.1 | 4 / 35 | 4228 |
| 3 | 3 | 63.5 | 74.0 | 2 / 35 | 4468 |
| 4 | 3 | 62.8 | 70.5 | 5 / 35 | 4627 |
| 5 | 3 | 62.1 | 72.7 | 4 / 35 | 4142 |
| 6 | 3 | 59.9 | 60.3 | 5 / 35 | 4357 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 34 | 29% |
| rsalesc.melee.Medina 0.4.5 | 15 | 47% |
| mz.MicroSheep 1.0 | 3 | 100% |
| cx.Princess 1.0 | 3 | 33% |
| sadoner.killer 0.2 | 3 | 67% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 676. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 90 | 48% | 99 |
| rsalesc.melee.Medina 0.4.5 | 54 | 29% | 62 |
| sadoner.killer 0.2 | 11 | 6% | 13 |
| cx.Princess 1.0 | 10 | 5% | 12 |
| kurios.DOSexe .9a | 7 | 4% | 7 |
| arthord.NanoSatanMelee Beta | 7 | 4% | 7 |
| jeremyreeder.collective.Prophet 5 | 5 | 3% | 5 |
| mz.MicroSheep 1.0 | 2 | 1% | 5 |

