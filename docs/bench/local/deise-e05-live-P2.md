# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 85.7 | 40 / 210 | 2.29 | 16.8% | 29372 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.8% | 154 |
| hadur117.mini.DeiseP2 0.3 | 2.0 | 16.8% | 40 |
| sgp.JollyNinja 3.53 | 3.7 | 11.3% | 13 |
| mz.MicroGodMelee 1 | 4.0 | 10.7% | 0 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.0 | 10.1% | 1 |
| lorneswork.Predator 1.0 | 5.3 | 9.6% | 2 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.3% | 0 |
| skm.butterfly 1.0 | 8.7 | 5.0% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.1 | 89.8 | 8 / 35 | 5115 |
| 2 | 2 | 66.2 | 83.2 | 6 / 35 | 5189 |
| 3 | 2 | 66.6 | 88.6 | 6 / 35 | 4580 |
| 4 | 2 | 65.2 | 79.7 | 7 / 35 | 5083 |
| 5 | 2 | 66.0 | 85.4 | 5 / 35 | 4606 |
| 6 | 2 | 66.9 | 87.6 | 8 / 35 | 4799 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 137 | 7% |
| sgp.JollyNinja 3.53 | 15 | 73% |
| mz.MicroGodMelee 1 | 10 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 100% |
| lorneswork.Predator 1.0 | 3 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 1318. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 139 | 82% | 156 |
| sgp.JollyNinja 3.53 | 14 | 8% | 18 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 4% | 11 |
| mz.MicroGodMelee 1 | 5 | 3% | 15 |
| lorneswork.Predator 1.0 | 3 | 2% | 5 |
| skm.butterfly 1.0 | 1 | 1% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 1 |
| adt.Ar2 1.0 | 1 | 1% | 1 |

## Melee bench: F02

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.3 | 113 / 210 | 2.32 | 18.4% | 29671 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 18.4% | 113 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 13.3% | 36 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.4% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.5% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 9.9% | 13 |
| sch.Simone 0.3d | 6.8 | 8.1% | 10 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 7.8% | 1 |
| Noran.BitchingElk 0.054 | 7.2 | 8.1% | 14 |
| stelo.PatternRobot 1.0 | 9.0 | 5.9% | 2 |
| fullsail.SweetTea 1.1 | 9.8 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.6 | 22 / 35 | 4939 |
| 2 | 1 | 68.6 | 90.2 | 17 / 35 | 4959 |
| 3 | 1 | 66.2 | 81.6 | 14 / 35 | 4881 |
| 4 | 1 | 68.1 | 83.8 | 23 / 35 | 5052 |
| 5 | 1 | 69.1 | 90.8 | 24 / 35 | 4939 |
| 6 | 1 | 65.8 | 78.1 | 13 / 35 | 4901 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 48 | 85% |
| pulsar.PulsarMax 0.8.9 | 44 | 66% |
| com.cohesiva.robocode.ManOwaR 1.0 | 19 | 89% |
| Noran.BitchingElk 0.054 | 13 | 31% |
| sch.Simone 0.3d | 12 | 83% |
| stelo.PatternRobot 1.0 | 5 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 4 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 35 | 36% | 60 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 22 | 22% | 61 |
| Noran.BitchingElk 0.054 | 10 | 10% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 10% | 14 |
| sch.Simone 0.3d | 7 | 7% | 19 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5 | 5% | 22 |
| stelo.PatternRobot 1.0 | 5 | 5% | 6 |
| fnc.bandit.Bandit 5.2.0 | 3 | 3% | 7 |
| fullsail.SweetTea 1.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 94.0 | 160 / 210 | 1.54 | 20.5% | 37092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 20.5% | 160 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.3% | 12 |
| radnor.DoctorBob 1.42 | 3.3 | 12.7% | 12 |
| vuen.Cake 2.51 | 3.3 | 12.6% | 25 |
| urdos.URDOS 1.3 | 5.0 | 9.3% | 0 |
| adt.Ar1 2.1 | 6.5 | 7.3% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.2 | 7.1% | 0 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 5.9% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 95.6 | 29 / 35 | 6226 |
| 2 | 1 | 71.3 | 96.5 | 30 / 35 | 6111 |
| 3 | 1 | 71.0 | 96.5 | 27 / 35 | 6000 |
| 4 | 1 | 70.0 | 90.5 | 25 / 35 | 6238 |
| 5 | 1 | 70.0 | 92.7 | 25 / 35 | 5993 |
| 6 | 1 | 70.4 | 92.4 | 24 / 35 | 6524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 74 | 80% |
| kawigi.nano.Lib 1.0 | 59 | 90% |
| radnor.DoctorBob 1.42 | 38 | 95% |
| oa.weak.FlyMk1 0.1 | 6 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |
| urdos.URDOS 1.3 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 20 | 39% | 77 |
| kawigi.nano.Lib 1.0 | 18 | 35% | 70 |
| radnor.DoctorBob 1.42 | 10 | 20% | 43 |
| urdos.URDOS 1.3 | 1 | 2% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 3 |
| adt.Ar1 2.1 | 1 | 2% | 2 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.0 | 30 / 210 | 2.26 | 17.3% | 33043 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.0% | 173 |
| hadur117.mini.DeiseP2 0.3 | 2.0 | 17.3% | 30 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.1% | 4 |
| TNT.TNT 0.99.1 | 4.3 | 10.2% | 3 |
| josago.Jorgito 0.16 | 4.7 | 9.3% | 0 |
| css.Delitioner 0.11 | 6.3 | 6.7% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.6% | 1 |
| rampancy.Durandal 2.1d | 7.8 | 5.8% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.6 | 86.3 | 3 / 35 | 5400 |
| 2 | 2 | 68.3 | 87.9 | 6 / 35 | 5607 |
| 3 | 2 | 68.7 | 89.5 | 6 / 35 | 5519 |
| 4 | 2 | 66.3 | 81.0 | 5 / 35 | 5267 |
| 5 | 2 | 68.4 | 87.0 | 6 / 35 | 5611 |
| 6 | 2 | 67.2 | 84.1 | 4 / 35 | 5639 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 155 | 14% |
| TNT.TNT 0.99.1 | 4 | 50% |
| apc.LeeroyJenkins2 1.0 | 4 | 75% |
| sp.Nanos.Ember 1.1 | 2 | 100% |
| css.Delitioner 0.11 | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 100% |
| tj.zombie1n 1.0.1 | 1 | 0% |

Hadur died in 181 of 210 rounds, at a mean tick of 1455. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 152 | 84% | 173 |
| apc.LeeroyJenkins2 1.0 | 15 | 8% | 18 |
| TNT.TNT 0.99.1 | 4 | 2% | 9 |
| josago.Jorgito 0.16 | 4 | 2% | 4 |
| css.Delitioner 0.11 | 2 | 1% | 3 |
| tj.zombie1n 1.0.1 | 2 | 1% | 1 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 72.2 | 20 / 210 | 3.50 | 13.3% | 19243 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.8% | 115 |
| justin.DemonicRage 3.4 | 1.7 | 17.0% | 54 |
| hadur117.mini.DeiseP2 0.3 | 3.2 | 13.3% | 20 |
| wompi.Numbat 2.1 | 3.8 | 12.3% | 16 |
| axeBots.HataMoto 3.09 | 5.3 | 9.7% | 5 |
| ms.Ares 0.19 | 5.7 | 9.0% | 0 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.2% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.5% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.3% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 74.6 | 4 / 35 | 3235 |
| 2 | 3 | 62.2 | 77.1 | 5 / 35 | 3190 |
| 3 | 3 | 61.2 | 72.4 | 2 / 35 | 3554 |
| 4 | 4 | 59.7 | 67.6 | 2 / 35 | 3266 |
| 5 | 3 | 60.4 | 71.4 | 5 / 35 | 3088 |
| 6 | 3 | 59.4 | 70.2 | 2 / 35 | 2910 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 31 | 39% |
| cb.fire.Firestarter 2.0f | 30 | 13% |
| wompi.Numbat 2.1 | 6 | 33% |
| axeBots.HataMoto 3.09 | 3 | 67% |

Hadur died in 190 of 210 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 72 | 38% | 78 |
| justin.DemonicRage 3.4 | 64 | 34% | 73 |
| wompi.Numbat 2.1 | 29 | 15% | 32 |
| ms.Ares 0.19 | 11 | 6% | 11 |
| axeBots.HataMoto 3.09 | 7 | 4% | 9 |
| davidalves.net.DuelistMicroMelee 1.4 | 5 | 3% | 5 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 84.0 | 105 / 210 | 2.44 | 17.6% | 27600 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 17.6% | 105 |
| jekl.StoneGhost 0.7 | 2.3 | 14.9% | 32 |
| origin.SleepSiphon 1.7b | 3.2 | 13.3% | 39 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.5% | 25 |
| mld.Wisdom 1.0 | 4.7 | 10.6% | 2 |
| gg.Wolverine 2.0 | 6.0 | 9.1% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 6.2% | 2 |
| spinnercat.Omen 1.0 | 8.0 | 6.4% | 1 |
| DBall.NUKE 0.1 | 8.0 | 6.4% | 1 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 86.0 | 18 / 35 | 4607 |
| 2 | 1 | 66.2 | 81.3 | 16 / 35 | 4461 |
| 3 | 1 | 66.2 | 81.9 | 13 / 35 | 4477 |
| 4 | 1 | 67.2 | 84.8 | 20 / 35 | 4453 |
| 5 | 1 | 67.0 | 83.8 | 16 / 35 | 4563 |
| 6 | 1 | 68.8 | 86.3 | 22 / 35 | 5039 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 52 | 96% |
| pe.minimelee.SandboxMiniMelee 1.1 | 35 | 60% |
| origin.SleepSiphon 1.7b | 30 | 63% |
| gg.Wolverine 2.0 | 6 | 100% |
| mld.Wisdom 1.0 | 4 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 67% |
| sample.Fire 1.0 | 2 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 32 | 30% | 63 |
| pe.minimelee.SandboxMiniMelee 1.1 | 32 | 30% | 60 |
| origin.SleepSiphon 1.7b | 29 | 27% | 58 |
| mld.Wisdom 1.0 | 6 | 6% | 10 |
| gg.Wolverine 2.0 | 3 | 3% | 7 |
| spinnercat.Omen 1.0 | 2 | 2% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 4 |
| DBall.NUKE 0.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 92.9 | 125 / 210 | 1.64 | 20.1% | 36102 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 20.1% | 125 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 16.7% | 39 |
| rtk.Tachikoma 1.0 | 2.7 | 16.3% | 30 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.4% | 7 |
| franzor.Lizt 1.3.1 | 4.8 | 10.6% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.9% | 0 |
| drd.Dreadknoght 0.9 | 9.3 | 2.3% | 0 |
| sample.Target 1.0 | 9.7 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 93.7 | 22 / 35 | 6460 |
| 2 | 1 | 71.9 | 92.7 | 23 / 35 | 6142 |
| 3 | 1 | 72.1 | 94.3 | 22 / 35 | 6276 |
| 4 | 1 | 71.3 | 91.7 | 21 / 35 | 5884 |
| 5 | 1 | 70.2 | 89.2 | 16 / 35 | 5502 |
| 6 | 1 | 71.8 | 95.6 | 21 / 35 | 5838 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 86 | 74% |
| rsalesc.melee.Monk 0.3.6c | 49 | 45% |
| oog.melee.CapuletDroid 1.1 | 28 | 86% |
| franzor.Lizt 1.3.1 | 20 | 65% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 1538. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 36 | 42% | 66 |
| rtk.Tachikoma 1.0 | 33 | 39% | 99 |
| franzor.Lizt 1.3.1 | 9 | 11% | 1 |
| oog.melee.CapuletDroid 1.1 | 6 | 7% | 37 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 3 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 88.5 | 133 / 210 | 2.03 | 19.0% | 29290 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 19.0% | 133 |
| tm.Yuugao 1.0 | 2.3 | 12.6% | 34 |
| shrub.Vapour v159 | 2.8 | 12.2% | 16 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 11.3% | 16 |
| com.spp.robocode.MostlyHarmless 010 | 5.5 | 9.2% | 4 |
| m3thos.Eva00 1.1 | 5.8 | 8.5% | 6 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 7.8% | 2 |
| qualidafial.MajorDick 1.0.1 | 8.5 | 6.9% | 0 |
| SHAM.WOW 1.4 | 8.8 | 6.6% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 92.4 | 24 / 35 | 5520 |
| 2 | 1 | 67.0 | 84.1 | 21 / 35 | 4638 |
| 3 | 1 | 68.0 | 88.9 | 20 / 35 | 4808 |
| 4 | 1 | 69.5 | 89.8 | 28 / 35 | 5040 |
| 5 | 1 | 67.2 | 86.0 | 19 / 35 | 4571 |
| 6 | 1 | 68.2 | 89.8 | 21 / 35 | 4713 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 55 | 62% |
| shrub.Vapour v159 | 41 | 76% |
| Krabb.sliNk.Garm 0.9u | 26 | 88% |
| m3thos.Eva00 1.1 | 14 | 93% |
| com.spp.robocode.MostlyHarmless 010 | 14 | 93% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 100% |
| SHAM.WOW 1.4 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 30 | 39% | 75 |
| shrub.Vapour v159 | 20 | 26% | 52 |
| Krabb.sliNk.Garm 0.9u | 16 | 21% | 32 |
| com.spp.robocode.MostlyHarmless 010 | 5 | 6% | 22 |
| jwst.DAD.DarkAndDarker 1.1 | 2 | 3% | 11 |
| m3thos.Eva00 1.1 | 2 | 3% | 10 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 4 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 2 |
| SHAM.WOW 1.4 | 0 | 0% | 2 |

## Melee bench: F09

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 79.5 | 82 / 210 | 2.84 | 16.6% | 25755 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.5 | 16.6% | 87 |
| hadur117.mini.DeiseP2 0.3 | 1.7 | 16.6% | 82 |
| kc.micro.Figment 1.0 | 2.8 | 14.3% | 20 |
| yagami.Tidus 0.11 | 4.7 | 10.7% | 1 |
| pedersen.Grishnakh 1.0 | 4.8 | 9.8% | 7 |
| mc2.enemy.Original 0.9 | 5.5 | 9.2% | 11 |
| dft.Calliope 5.6 | 7.0 | 7.3% | 1 |
| step.nanoPri 1.0 | 8.2 | 5.8% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.1% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 81.6 | 15 / 35 | 4613 |
| 2 | 2 | 66.3 | 82.9 | 11 / 35 | 4510 |
| 3 | 2 | 62.7 | 71.4 | 10 / 35 | 3902 |
| 4 | 3 | 63.5 | 73.0 | 13 / 35 | 3874 |
| 5 | 1 | 67.2 | 84.4 | 17 / 35 | 4469 |
| 6 | 1 | 67.1 | 83.8 | 16 / 35 | 4387 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 55 | 47% |
| kc.micro.Figment 1.0 | 30 | 80% |
| yagami.Tidus 0.11 | 16 | 94% |
| mc2.enemy.Original 0.9 | 9 | 78% |
| pedersen.Grishnakh 1.0 | 9 | 56% |
| dft.Calliope 5.6 | 4 | 100% |
| rdm.Dueler 0.4x | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 55 | 43% | 82 |
| kc.micro.Figment 1.0 | 25 | 20% | 50 |
| yagami.Tidus 0.11 | 19 | 15% | 38 |
| mc2.enemy.Original 0.9 | 12 | 9% | 19 |
| pedersen.Grishnakh 1.0 | 6 | 5% | 7 |
| robar.nano.Assertive_Melee 0.2 | 6 | 5% | 6 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |
| dft.Calliope 5.6 | 2 | 2% | 4 |
| step.nanoPri 1.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 92.5 | 153 / 210 | 1.68 | 19.9% | 33133 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 19.9% | 153 |
| DTF.Kludgy 1.2b | 2.0 | 14.0% | 26 |
| ne.Chimera 1.2 | 3.2 | 13.3% | 17 |
| ejb.Polaris 1.0.1 | 3.8 | 12.1% | 8 |
| tvv.micro.Antares 1.1.1 | 5.5 | 9.9% | 3 |
| vStar.RAFzilla 2.15 | 5.5 | 10.0% | 2 |
| sam.Samspin 1.0 | 7.8 | 5.5% | 0 |
| kurios.DOSexe .9b | 8.0 | 5.6% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.3% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 91.1 | 24 / 35 | 5521 |
| 2 | 1 | 70.5 | 94.6 | 27 / 35 | 5513 |
| 3 | 1 | 69.9 | 90.8 | 27 / 35 | 5475 |
| 4 | 1 | 71.7 | 98.1 | 30 / 35 | 5553 |
| 5 | 1 | 69.7 | 89.8 | 22 / 35 | 5790 |
| 6 | 1 | 69.3 | 90.5 | 23 / 35 | 5281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 56 | 75% |
| ejb.Polaris 1.0.1 | 39 | 95% |
| ne.Chimera 1.2 | 38 | 76% |
| tvv.micro.Antares 1.1.1 | 18 | 94% |
| vStar.RAFzilla 2.15 | 17 | 100% |
| donjezza.Muncho 1.0 | 6 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 23 | 40% | 62 |
| ne.Chimera 1.2 | 16 | 28% | 47 |
| ejb.Polaris 1.0.1 | 7 | 12% | 46 |
| vStar.RAFzilla 2.15 | 6 | 11% | 18 |
| tvv.micro.Antares 1.1.1 | 2 | 4% | 17 |
| kurios.DOSexe .9b | 2 | 4% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 3 |
| donjezza.Muncho 1.0 | 0 | 0% | 3 |
| sam.Samspin 1.0 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 80.6 | 81 / 210 | 2.74 | 16.6% | 25663 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.5 | 16.3% | 66 |
| hadur117.mini.DeiseP2 0.3 | 1.5 | 16.6% | 81 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.4% | 21 |
| djc.DynaBot 0.1.1 | 4.0 | 11.0% | 16 |
| rdt199.Warlord 0.73 | 5.5 | 9.4% | 10 |
| br2.MobyDickBot 1.6 | 6.5 | 8.6% | 9 |
| uji.YellohFellah 1.0 | 6.5 | 8.2% | 7 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.3% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 79.4 | 13 / 35 | 4236 |
| 2 | 2 | 64.7 | 81.3 | 11 / 35 | 4082 |
| 3 | 1 | 66.4 | 82.9 | 17 / 35 | 4300 |
| 4 | 2 | 62.9 | 74.6 | 11 / 35 | 4053 |
| 5 | 1 | 65.1 | 79.4 | 14 / 35 | 4387 |
| 6 | 1 | 67.1 | 86.3 | 15 / 35 | 4605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 47 | 62% |
| djc.DynaBot 0.1.1 | 20 | 70% |
| cx.mini.Nimrod 0.55 | 19 | 79% |
| uji.YellohFellah 1.0 | 11 | 64% |
| rdt199.Warlord 0.73 | 10 | 90% |
| KiraNL.Chupacabra 0.4 | 5 | 80% |
| br2.MobyDickBot 1.6 | 3 | 67% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 62 | 48% | 95 |
| cx.mini.Nimrod 0.55 | 26 | 20% | 36 |
| rdt199.Warlord 0.73 | 14 | 11% | 25 |
| djc.DynaBot 0.1.1 | 11 | 9% | 20 |
| uji.YellohFellah 1.0 | 6 | 5% | 14 |
| br2.MobyDickBot 1.6 | 5 | 4% | 9 |
| KiraNL.Chupacabra 0.4 | 2 | 2% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 2 |
| stelo.MirrorNano 1.3 | 1 | 1% | 2 |

## Melee bench: F12

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 85.7 | 131 / 210 | 2.29 | 17.9% | 23642 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 17.9% | 131 |
| nat.PallasHawk 1.0 | 2.8 | 13.6% | 24 |
| bts.wiki.RipCurl 0.9b | 3.0 | 13.6% | 25 |
| darkcanuck.Leon 1.01 | 3.2 | 12.9% | 18 |
| brainfade.melee.Genghis 0.36 | 5.0 | 9.7% | 7 |
| jrm.Test0 1.0 | 6.3 | 7.5% | 1 |
| cs.sheldor.Talon 1.1 | 7.7 | 6.6% | 2 |
| jp.Perpy 16.0 | 7.7 | 6.6% | 1 |
| stuff.Vlad 0.1 | 8.7 | 6.2% | 0 |
| jaybot.bots.Oddball 4.0 | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 86.0 | 22 / 35 | 3980 |
| 2 | 1 | 67.9 | 87.3 | 23 / 35 | 4113 |
| 3 | 1 | 67.4 | 86.0 | 22 / 35 | 3841 |
| 4 | 1 | 66.6 | 83.2 | 21 / 35 | 4009 |
| 5 | 1 | 66.0 | 81.6 | 22 / 35 | 3853 |
| 6 | 1 | 67.8 | 90.2 | 21 / 35 | 3846 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 52 | 88% |
| nat.PallasHawk 1.0 | 49 | 84% |
| darkcanuck.Leon 1.01 | 31 | 94% |
| brainfade.melee.Genghis 0.36 | 9 | 89% |
| jp.Perpy 16.0 | 2 | 50% |
| cs.sheldor.Talon 1.1 | 2 | 50% |
| jrm.Test0 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| jaybot.bots.Oddball 4.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 27 | 34% | 66 |
| bts.wiki.RipCurl 0.9b | 19 | 24% | 51 |
| brainfade.melee.Genghis 0.36 | 11 | 14% | 14 |
| darkcanuck.Leon 1.01 | 8 | 10% | 54 |
| cs.sheldor.Talon 1.1 | 6 | 8% | 9 |
| jrm.Test0 1.0 | 4 | 5% | 6 |
| jaybot.bots.Oddball 4.0 | 4 | 5% | 5 |
| jp.Perpy 16.0 | 1 | 1% | 4 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |

## Melee bench: F13

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 83.3 | 79 / 210 | 2.50 | 16.6% | 26138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.8 | 16.7% | 83 |
| hadur117.mini.DeiseP2 0.3 | 2.0 | 16.6% | 79 |
| ags.Glacier 0.2.11 | 2.2 | 16.3% | 35 |
| shinh.Entangled 0.3 | 4.0 | 12.0% | 8 |
| gh.micro.Gruweltje 0.7 | 5.0 | 11.2% | 5 |
| apc.Colossus2 0.17 | 6.3 | 7.8% | 0 |
| stelo.Wang 1.0 | 6.7 | 7.0% | 0 |
| ayk.WallHugger 1.0 | 8.0 | 4.9% | 0 |
| maribo.FollowFire 1 | 9.2 | 4.2% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.4 | 81.3 | 11 / 35 | 4155 |
| 2 | 2 | 66.1 | 85.7 | 11 / 35 | 4024 |
| 3 | 3 | 65.6 | 81.3 | 11 / 35 | 4263 |
| 4 | 1 | 67.4 | 84.1 | 15 / 35 | 4834 |
| 5 | 2 | 66.9 | 82.5 | 15 / 35 | 4620 |
| 6 | 1 | 66.9 | 85.1 | 16 / 35 | 4242 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 71 | 44% |
| ags.Glacier 0.2.11 | 49 | 76% |
| shinh.Entangled 0.3 | 10 | 80% |
| stelo.Wang 1.0 | 2 | 100% |
| gh.micro.Gruweltje 0.7 | 2 | 50% |

Hadur died in 131 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 54 | 41% | 83 |
| ags.Glacier 0.2.11 | 37 | 28% | 70 |
| shinh.Entangled 0.3 | 18 | 14% | 27 |
| gh.micro.Gruweltje 0.7 | 13 | 10% | 17 |
| stelo.Wang 1.0 | 4 | 3% | 7 |
| maribo.FollowFire 1 | 2 | 2% | 3 |
| apc.Colossus2 0.17 | 2 | 2% | 2 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 91.9 | 154 / 210 | 1.73 | 19.7% | 31749 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 19.7% | 154 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.6% | 27 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.3% | 20 |
| co.edu.usb.rc.LidisTron 1.0 | 4.8 | 9.9% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.2% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 6.0 | 9.2% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 6.2 | 8.8% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.9% | 7 |
| pa.Improved 1.0 | 9.0 | 5.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 88.6 | 27 / 35 | 5659 |
| 2 | 1 | 71.4 | 96.8 | 26 / 35 | 5571 |
| 3 | 1 | 68.9 | 88.6 | 23 / 35 | 4708 |
| 4 | 1 | 70.1 | 92.4 | 27 / 35 | 5437 |
| 5 | 1 | 70.6 | 95.2 | 27 / 35 | 5277 |
| 6 | 1 | 69.6 | 89.8 | 24 / 35 | 5097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 89 | 89% |
| catcat20.shape.Theta 0.018 | 42 | 81% |
| sanyi.mikrobi.Roberto 1.0 | 14 | 86% |
| co.edu.usb.rc.LidisTron 1.0 | 14 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 79% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 25 | 44% | 105 |
| catcat20.shape.Theta 0.018 | 15 | 26% | 46 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 11% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 7% | 8 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 5% | 7 |
| sanyi.mikrobi.Roberto 1.0 | 2 | 4% | 20 |
| pa.Improved 1.0 | 1 | 2% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 84.7 | 104 / 210 | 2.38 | 18.4% | 31926 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 18.4% | 104 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.9% | 21 |
| emp.Yngwie 1.11 | 3.0 | 12.9% | 47 |
| mld.DustBunny 3.8 | 3.8 | 11.9% | 9 |
| kawigi.robot.Girl 1.2 | 5.3 | 9.6% | 20 |
| cb.nano.Insomnia 1.0 | 5.3 | 10.2% | 7 |
| lambdaxy.TBot 0.1 | 7.5 | 6.9% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.0% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 5.1% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 87.3 | 16 / 35 | 5090 |
| 2 | 1 | 66.9 | 81.6 | 16 / 35 | 5043 |
| 3 | 1 | 68.0 | 83.8 | 19 / 35 | 5481 |
| 4 | 1 | 69.3 | 87.0 | 18 / 35 | 5821 |
| 5 | 1 | 67.6 | 83.8 | 17 / 35 | 5048 |
| 6 | 1 | 67.9 | 84.4 | 18 / 35 | 5443 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 46 | 57% |
| kawigi.micro.Shiz 1.1 | 30 | 97% |
| mld.DustBunny 3.8 | 22 | 91% |
| kawigi.robot.Girl 1.2 | 22 | 68% |
| cb.nano.Insomnia 1.0 | 17 | 76% |
| divineomega.TrialBot 0.003 | 1 | 0% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 1016. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 32 | 30% | 73 |
| mld.DustBunny 3.8 | 20 | 19% | 45 |
| kawigi.micro.Shiz 1.1 | 18 | 17% | 45 |
| kawigi.robot.Girl 1.2 | 18 | 17% | 27 |
| cb.nano.Insomnia 1.0 | 8 | 8% | 6 |
| divineomega.TrialBot 0.003 | 6 | 6% | 10 |
| lambdaxy.TBot 0.1 | 3 | 3% | 3 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 83.4 | 91 / 210 | 2.50 | 17.9% | 31832 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.2 | 17.9% | 91 |
| gh.Griezel 0.5.2 | 1.8 | 16.8% | 72 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.2% | 7 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 10.0% | 26 |
| tvv.nano.Polaris 1.2 | 5.7 | 9.1% | 6 |
| bvh.fnr.Fenrir 0.36l | 5.8 | 9.0% | 5 |
| stelo.IntrinsicVolatility 1.4 | 6.2 | 8.1% | 0 |
| asd.Cthulhu 1.3 | 8.8 | 5.1% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 4.9% | 4 |
| repositorio.NanoStep 1.0 | 9.2 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 82.9 | 15 / 35 | 5456 |
| 2 | 1 | 69.6 | 87.6 | 19 / 35 | 5791 |
| 3 | 1 | 66.8 | 81.0 | 13 / 35 | 5193 |
| 4 | 1 | 68.7 | 86.7 | 20 / 35 | 5283 |
| 5 | 2 | 64.9 | 77.5 | 11 / 35 | 4790 |
| 6 | 1 | 67.9 | 84.8 | 13 / 35 | 5319 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 81 | 51% |
| techdude.forest.FlamingForest 1.1 | 21 | 57% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 85% |
| bvh.fnr.Fenrir 0.36l | 7 | 100% |
| divineomega.DivineBot 1.9.4.5 | 6 | 100% |
| tvv.nano.Polaris 1.2 | 6 | 67% |
| stelo.IntrinsicVolatility 1.4 | 3 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 1200. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 64 | 53% | 109 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 17% | 39 |
| techdude.forest.FlamingForest 1.1 | 12 | 10% | 22 |
| bvh.fnr.Fenrir 0.36l | 12 | 10% | 16 |
| tvv.nano.Polaris 1.2 | 6 | 5% | 9 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 7 |
| stelo.IntrinsicVolatility 1.4 | 2 | 2% | 6 |
| asd.Cthulhu 1.3 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.8 | 96 / 210 | 2.46 | 17.8% | 29669 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 17.8% | 96 |
| et.Predator 1.8 | 2.5 | 13.2% | 21 |
| oog.melee.Mercutio 1.0 | 2.8 | 12.7% | 28 |
| cx.BlestPain 1.41 | 4.0 | 12.5% | 43 |
| nic.Nicator 2.4 | 4.8 | 11.3% | 13 |
| ahf.NanoAndrew .4 | 6.0 | 9.8% | 6 |
| maribo.melee.BMV 0.1 | 6.8 | 9.1% | 2 |
| tex.Longbot 0.4 | 8.2 | 5.8% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.8 | 5.3% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 82.2 | 15 / 35 | 5041 |
| 2 | 1 | 68.6 | 88.3 | 19 / 35 | 4905 |
| 3 | 1 | 67.1 | 81.0 | 17 / 35 | 5001 |
| 4 | 1 | 68.5 | 87.0 | 17 / 35 | 5215 |
| 5 | 1 | 67.1 | 85.7 | 12 / 35 | 4864 |
| 6 | 1 | 65.9 | 78.4 | 16 / 35 | 4643 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 46 | 83% |
| oog.melee.Mercutio 1.0 | 35 | 66% |
| cx.BlestPain 1.41 | 25 | 36% |
| nic.Nicator 2.4 | 16 | 75% |
| ahf.NanoAndrew .4 | 9 | 100% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 50% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 1030. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 38 | 33% | 48 |
| oog.melee.Mercutio 1.0 | 21 | 18% | 42 |
| nic.Nicator 2.4 | 19 | 17% | 32 |
| et.Predator 1.8 | 15 | 13% | 50 |
| ahf.NanoAndrew .4 | 10 | 9% | 18 |
| maribo.melee.BMV 0.1 | 5 | 4% | 10 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 3% | 6 |
| tex.Longbot 0.4 | 3 | 3% | 3 |
| goblin.Bender 2.4 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 89.8 | 133 / 210 | 1.91 | 19.0% | 27683 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 19.0% | 133 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.4% | 29 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.0% | 18 |
| uji.DBH 1.1 | 4.2 | 11.2% | 13 |
| ratosh.Nobo 0.21 | 5.2 | 9.9% | 5 |
| spinnercat.Robovirus 2.718 | 5.7 | 9.3% | 4 |
| sigterm.Sigterm 1.0 | 7.3 | 7.6% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 6.8% | 1 |
| stelo.WangRobot 1.0 | 8.7 | 6.0% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 82.5 | 18 / 35 | 4703 |
| 2 | 1 | 67.8 | 87.9 | 20 / 35 | 4435 |
| 3 | 1 | 69.8 | 94.0 | 26 / 35 | 4819 |
| 4 | 1 | 69.8 | 95.2 | 26 / 35 | 4534 |
| 5 | 1 | 68.3 | 88.3 | 21 / 35 | 4648 |
| 6 | 1 | 68.6 | 91.1 | 22 / 35 | 4544 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 64 | 73% |
| agd.Mooserwirt2 2.7 | 34 | 79% |
| uji.DBH 1.1 | 17 | 94% |
| stelo.WangRobot 1.0 | 11 | 100% |
| sigterm.Sigterm 1.0 | 11 | 82% |
| spinnercat.Robovirus 2.718 | 11 | 82% |
| ratosh.Nobo 0.21 | 11 | 91% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 75% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 889. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 27 | 35% | 80 |
| agd.Mooserwirt2 2.7 | 20 | 26% | 52 |
| uji.DBH 1.1 | 10 | 13% | 20 |
| ratosh.Nobo 0.21 | 7 | 9% | 13 |
| spinnercat.Robovirus 2.718 | 6 | 8% | 16 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 5% | 10 |
| sigterm.Sigterm 1.0 | 3 | 4% | 6 |
| stelo.WangRobot 1.0 | 0 | 0% | 8 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 93.5 | 166 / 210 | 1.58 | 20.9% | 34363 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 20.9% | 166 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.9% | 11 |
| mld.Infinity 2.2 | 2.7 | 14.1% | 24 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.1% | 5 |
| erdnis.Rover 0.3 | 5.2 | 10.0% | 2 |
| patson.PatsonTestBot 1.0 | 5.7 | 9.1% | 1 |
| mbh.Mbh 0.1 | 7.5 | 6.6% | 0 |
| pac.ABC 2.1 | 8.0 | 6.3% | 1 |
| pbg.R2D2 1.0 | 8.5 | 5.9% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 91.1 | 26 / 35 | 5595 |
| 2 | 1 | 71.4 | 91.7 | 25 / 35 | 5827 |
| 3 | 1 | 71.7 | 93.7 | 27 / 35 | 5477 |
| 4 | 1 | 72.4 | 95.6 | 31 / 35 | 5765 |
| 5 | 1 | 72.1 | 93.3 | 27 / 35 | 5954 |
| 6 | 1 | 72.4 | 95.9 | 30 / 35 | 5745 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 94 | 96% |
| mld.Infinity 2.2 | 54 | 89% |
| krillr.mini.JointStrike 2.0.0 | 15 | 93% |
| erdnis.Rover 0.3 | 4 | 100% |
| pac.ABC 2.1 | 4 | 100% |
| patson.PatsonTestBot 1.0 | 4 | 75% |
| mbh.Mbh 0.1 | 3 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 1060. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 19 | 43% | 117 |
| mld.Infinity 2.2 | 16 | 36% | 30 |
| krillr.mini.JointStrike 2.0.0 | 5 | 11% | 20 |
| patson.PatsonTestBot 1.0 | 2 | 5% | 14 |
| erdnis.Rover 0.3 | 2 | 5% | 12 |
| mbh.Mbh 0.1 | 0 | 0% | 6 |
| pbg.R2D2 1.0 | 0 | 0% | 6 |
| pac.ABC 2.1 | 0 | 0% | 5 |

## Melee bench: F20

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 90.7 | 134 / 210 | 1.83 | 19.9% | 33237 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 19.9% | 134 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.4% | 39 |
| fwb.Nine 1.0.1 | 3.7 | 11.2% | 16 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.6% | 5 |
| catcat20.Rabbit 0.001 | 4.3 | 10.6% | 14 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.2% | 3 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.4% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.7 | 7.1% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 90.5 | 20 / 35 | 5267 |
| 2 | 1 | 70.9 | 92.1 | 27 / 35 | 5687 |
| 3 | 1 | 69.7 | 89.2 | 19 / 35 | 5804 |
| 4 | 1 | 69.4 | 88.6 | 22 / 35 | 5365 |
| 5 | 1 | 71.3 | 94.9 | 26 / 35 | 6041 |
| 6 | 1 | 69.0 | 89.2 | 20 / 35 | 5073 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 88 | 75% |
| catcat20.Rabbit 0.001 | 26 | 81% |
| fwb.Nine 1.0.1 | 25 | 88% |
| bayen.nut.Squirrel 1.615 | 11 | 100% |
| nz.jdc.nano.GridFu 1.0 | 10 | 80% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 1054. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 33 | 43% | 83 |
| fwb.Nine 1.0.1 | 16 | 21% | 27 |
| catcat20.Rabbit 0.001 | 9 | 12% | 35 |
| nz.jdc.nano.GridFu 1.0 | 8 | 10% | 28 |
| bayen.nut.Squirrel 1.615 | 5 | 6% | 16 |
| djdjdj.NanoSkunk10 1.0 | 2 | 3% | 9 |
| m3thos.mini.Eva01 0.5.5 | 2 | 3% | 4 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 92.6 | 140 / 210 | 1.67 | 20.4% | 34254 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 20.4% | 140 |
| eem.EvBot v4.6.16 | 2.0 | 16.2% | 54 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.9% | 7 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.2% | 1 |
| oa.weak.BotherBot 0.1 | 5.7 | 7.9% | 0 |
| eld.Hmm 1.0 | 5.8 | 8.3% | 7 |
| fire219.CatBot 1.0 | 7.3 | 6.3% | 0 |
| el.JumpShoot 0.2 | 8.0 | 5.8% | 1 |
| PSW.Relentless 0.1 | 8.5 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 94.3 | 25 / 35 | 5867 |
| 2 | 1 | 71.7 | 92.7 | 23 / 35 | 6230 |
| 3 | 1 | 70.4 | 90.8 | 21 / 35 | 5589 |
| 4 | 1 | 70.2 | 91.4 | 25 / 35 | 5307 |
| 5 | 1 | 70.9 | 94.0 | 23 / 35 | 5475 |
| 6 | 1 | 71.5 | 92.4 | 23 / 35 | 5786 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 98 | 72% |
| dummy.mini.Scimitar 1.01 | 29 | 93% |
| cf.RiO.RiOx 4.2.1 | 29 | 100% |
| eld.Hmm 1.0 | 11 | 64% |
| oa.weak.BotherBot 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 1350. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 40 | 57% | 88 |
| dummy.mini.Scimitar 1.01 | 15 | 21% | 57 |
| cf.RiO.RiOx 4.2.1 | 10 | 14% | 35 |
| eld.Hmm 1.0 | 5 | 7% | 22 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 7 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |

## Melee bench: F22

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.2 | 102 / 210 | 2.15 | 18.3% | 30509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 18.3% | 102 |
| pe.SandboxDT 2.71m | 2.2 | 16.4% | 56 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.9% | 33 |
| jlm.javaDisturbance 0.59 | 3.8 | 12.7% | 8 |
| bigpete.Stewie 1.0 | 5.0 | 10.1% | 11 |
| yk.JahRoslav 1.1 | 6.8 | 6.6% | 0 |
| tad.Dalek98 0.98 | 7.0 | 6.5% | 0 |
| gg.Squaraus 0.6 | 7.3 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 9.2 | 4.8% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 86.3 | 17 / 35 | 5060 |
| 2 | 1 | 68.7 | 88.3 | 20 / 35 | 4937 |
| 3 | 1 | 70.0 | 92.4 | 23 / 35 | 4997 |
| 4 | 1 | 68.1 | 86.3 | 13 / 35 | 5162 |
| 5 | 1 | 67.6 | 85.4 | 14 / 35 | 4955 |
| 6 | 1 | 68.3 | 84.4 | 15 / 35 | 5398 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 53 | 75% |
| pe.SandboxDT 2.71m | 50 | 50% |
| jlm.javaDisturbance 0.59 | 35 | 97% |
| bigpete.Stewie 1.0 | 6 | 33% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 40 | 37% | 72 |
| kvk.HebusLeTroll 0.35 | 28 | 26% | 56 |
| jlm.javaDisturbance 0.59 | 25 | 23% | 54 |
| bigpete.Stewie 1.0 | 10 | 9% | 14 |
| tad.Dalek98 0.98 | 3 | 3% | 3 |
| pbg.NinjaX 1.2 | 1 | 1% | 4 |
| gg.Squaraus 0.6 | 1 | 1% | 3 |
| yk.JahRoslav 1.1 | 0 | 0% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 2 |

## Melee bench: F23

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 90.8 | 138 / 210 | 1.83 | 19.6% | 30868 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 19.6% | 138 |
| pe.SandboxLump 1.52 | 2.0 | 17.2% | 42 |
| cre.Karolos 0.32 | 3.0 | 13.7% | 20 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.2% | 7 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.0% | 1 |
| stelo.RamTrackSurfer 1.2 | 6.0 | 8.8% | 1 |
| sample.Walls 1.0 | 7.2 | 7.9% | 1 |
| cw.megas.Blade 0.8 | 7.3 | 7.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.2 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 91.4 | 28 / 35 | 5246 |
| 2 | 1 | 69.3 | 87.0 | 20 / 35 | 4829 |
| 3 | 1 | 71.1 | 94.6 | 23 / 35 | 5011 |
| 4 | 1 | 71.3 | 92.1 | 23 / 35 | 5216 |
| 5 | 1 | 70.0 | 90.2 | 23 / 35 | 4983 |
| 6 | 1 | 70.7 | 89.5 | 21 / 35 | 5583 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 89 | 76% |
| cre.Karolos 0.32 | 29 | 90% |
| stelo.AreaTargetingBot 1.1 | 24 | 92% |
| sample.Walls 1.0 | 10 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 100% |
| stelo.RamTrackSurfer 1.2 | 5 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 39 | 54% | 107 |
| cre.Karolos 0.32 | 16 | 22% | 43 |
| stelo.AreaTargetingBot 1.1 | 11 | 15% | 30 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 7% | 10 |
| stelo.RamTrackSurfer 1.2 | 1 | 1% | 10 |
| cw.megas.Blade 0.8 | 0 | 0% | 3 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |
| sample.Walls 1.0 | 0 | 0% | 2 |

## Melee bench: F24

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 76.5 | 73 / 210 | 3.11 | 15.3% | 22292 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.5 | 15.3% | 73 |
| rz.GlowBlowMelee 1.4 | 2.3 | 13.7% | 27 |
| florent.XSeries.X2 0.12 | 2.8 | 13.4% | 34 |
| davidalves.Phoenix 0.54 | 3.7 | 13.0% | 45 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.7% | 15 |
| oog.melee.Corsair 1.0 | 6.3 | 9.4% | 8 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.3% | 8 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.3% | 1 |
| as.FrankTheTank 1.3 | 9.2 | 4.9% | 0 |
| evd.X1 0.01 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 73.7 | 8 / 35 | 3280 |
| 2 | 1 | 64.1 | 79.0 | 14 / 35 | 3746 |
| 3 | 1 | 66.3 | 83.5 | 18 / 35 | 4200 |
| 4 | 1 | 64.6 | 79.4 | 13 / 35 | 3900 |
| 5 | 1 | 62.3 | 74.3 | 11 / 35 | 3501 |
| 6 | 2 | 61.1 | 69.2 | 9 / 35 | 3665 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 28 | 68% |
| stelo.SoJNanoMelee 1.1 | 24 | 83% |
| rz.GlowBlowMelee 1.4 | 17 | 76% |
| pedersen.Ugluk 1.1.1 | 16 | 81% |
| davidalves.Phoenix 0.54 | 15 | 40% |
| oog.melee.Corsair 1.0 | 4 | 25% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 32 | 23% | 41 |
| florent.XSeries.X2 0.12 | 30 | 22% | 53 |
| rz.GlowBlowMelee 1.4 | 24 | 17% | 42 |
| pedersen.Ugluk 1.1.1 | 23 | 17% | 31 |
| oog.melee.Corsair 1.0 | 12 | 9% | 22 |
| stelo.SoJNanoMelee 1.1 | 6 | 4% | 9 |
| lunchie.Lunchbox 0.93 | 5 | 4% | 7 |
| evd.X1 0.01 | 3 | 2% | 3 |
| as.FrankTheTank 1.3 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.1 | 141 / 210 | 2.25 | 18.6% | 26047 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 18.6% | 141 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.7% | 18 |
| voidious.mini.BrokenSword 2.0.3 | 2.7 | 13.0% | 13 |
| jdw.Hurricane 1.4 | 3.8 | 11.6% | 17 |
| ds.Oo 2.2 | 5.3 | 9.3% | 10 |
| gre.svman4.Morfeas 1.4.1 | 5.7 | 9.3% | 5 |
| awesomeness.Elite 1.0 | 7.3 | 7.7% | 1 |
| gjr.Cephalosporin 0.1 | 7.5 | 7.6% | 5 |
| adt.Ar2 1.1 | 9.0 | 5.8% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.9 | 24 / 35 | 4515 |
| 2 | 1 | 67.8 | 83.8 | 23 / 35 | 4491 |
| 3 | 1 | 67.9 | 86.3 | 23 / 35 | 4330 |
| 4 | 1 | 67.6 | 85.4 | 21 / 35 | 4237 |
| 5 | 1 | 69.1 | 87.6 | 26 / 35 | 4504 |
| 6 | 1 | 67.4 | 85.4 | 24 / 35 | 3970 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 51 | 96% |
| voidious.micro.BlitzBat 1.05 | 32 | 88% |
| jdw.Hurricane 1.4 | 31 | 94% |
| ds.Oo 2.2 | 11 | 73% |
| gjr.Cephalosporin 0.1 | 10 | 100% |
| gre.svman4.Morfeas 1.4.1 | 8 | 88% |
| awesomeness.Elite 1.0 | 8 | 100% |
| adt.Ar2 1.1 | 2 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 565. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 18 | 26% | 48 |
| jdw.Hurricane 1.4 | 13 | 19% | 40 |
| voidious.mini.BrokenSword 2.0.3 | 10 | 14% | 55 |
| ds.Oo 2.2 | 9 | 13% | 16 |
| gre.svman4.Morfeas 1.4.1 | 8 | 12% | 19 |
| awesomeness.Elite 1.0 | 6 | 9% | 14 |
| adt.Ar2 1.1 | 3 | 4% | 7 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 10 |
| amk.ChumbaMini 0.2 | 1 | 1% | 1 |

## Melee bench: F26

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 91.7 | 138 / 210 | 1.75 | 19.7% | 33877 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 19.7% | 138 |
| ak.Fermat 2.0 | 2.2 | 14.2% | 34 |
| lrem.Spectre 0.4.4 | 3.3 | 12.2% | 13 |
| shu.nitro.LENIN .T34 | 3.5 | 12.0% | 18 |
| js.PinBall 1.6 | 5.0 | 10.5% | 1 |
| gh.mini.GrubbmOne 1.0 | 6.2 | 9.7% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.8 | 8.7% | 3 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.2% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 92.7 | 21 / 35 | 5610 |
| 2 | 1 | 71.3 | 94.6 | 25 / 35 | 5978 |
| 3 | 1 | 70.2 | 91.7 | 23 / 35 | 5685 |
| 4 | 1 | 69.1 | 89.2 | 22 / 35 | 5343 |
| 5 | 1 | 69.3 | 88.3 | 19 / 35 | 5554 |
| 6 | 1 | 71.1 | 93.7 | 28 / 35 | 5707 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| lrem.Spectre 0.4.4 | 52 | 90% |
| ak.Fermat 2.0 | 52 | 67% |
| shu.nitro.LENIN .T34 | 43 | 79% |
| js.PinBall 1.6 | 9 | 89% |
| gh.mini.GrubbmOne 1.0 | 5 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 80% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 75% |
| sample.SpinBot 1.0 | 1 | 100% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 28 | 39% | 61 |
| shu.nitro.LENIN .T34 | 20 | 28% | 58 |
| lrem.Spectre 0.4.4 | 13 | 18% | 49 |
| js.PinBall 1.6 | 5 | 7% | 17 |
| jaybot.adv.bots.JayBot 2.0 | 3 | 4% | 6 |
| gh.mini.GrubbmOne 1.0 | 2 | 3% | 9 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 9 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |

## Melee bench: F27

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 88.0 | 135 / 210 | 2.08 | 18.5% | 26638 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 18.5% | 135 |
| mk.Alpha 0.2.1 | 2.0 | 13.6% | 37 |
| EH.Eagle 1.0.6 | 4.0 | 11.0% | 6 |
| sheldor.melee.nano.TestMelee 0.1 | 4.0 | 11.2% | 6 |
| wee.Gem 1.8.4 | 4.8 | 10.2% | 19 |
| techdude.kombat.FlamingKombat 1.5 | 6.2 | 9.2% | 5 |
| joe.ADinosaur 1.0 | 7.2 | 8.1% | 0 |
| throxbot.ThroxBot 0.1 | 8.0 | 6.9% | 2 |
| caimano.Furia_Ceca 0.22 | 8.5 | 6.7% | 1 |
| cs.Grudge 1.0 | 9.3 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.9 | 25 / 35 | 4852 |
| 2 | 1 | 65.9 | 82.5 | 18 / 35 | 4353 |
| 3 | 1 | 68.1 | 89.5 | 23 / 35 | 4410 |
| 4 | 1 | 68.2 | 87.9 | 25 / 35 | 4411 |
| 5 | 1 | 68.4 | 92.7 | 22 / 35 | 4132 |
| 6 | 1 | 67.8 | 87.6 | 22 / 35 | 4480 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 68 | 81% |
| sheldor.melee.nano.TestMelee 0.1 | 29 | 93% |
| wee.Gem 1.8.4 | 27 | 74% |
| EH.Eagle 1.0.6 | 17 | 94% |
| techdude.kombat.FlamingKombat 1.5 | 11 | 91% |
| throxbot.ThroxBot 0.1 | 5 | 80% |
| joe.ADinosaur 1.0 | 3 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 25 | 33% | 75 |
| wee.Gem 1.8.4 | 15 | 20% | 38 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 17% | 42 |
| EH.Eagle 1.0.6 | 8 | 11% | 26 |
| joe.ADinosaur 1.0 | 7 | 9% | 9 |
| throxbot.ThroxBot 0.1 | 4 | 5% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 1% | 10 |
| caimano.Furia_Ceca 0.22 | 1 | 1% | 3 |
| cs.Grudge 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 89.6 | 134 / 210 | 1.94 | 18.8% | 26703 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 18.8% | 134 |
| kid.test.NightFox .2 | 2.0 | 14.7% | 31 |
| uji.Antique 1.0 | 3.5 | 12.2% | 25 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 11.1% | 15 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.0% | 2 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.0% | 2 |
| amk.ChumbaWumba 0.3 | 6.5 | 7.9% | 1 |
| matt.advanced.Katana 1.0 | 8.5 | 6.1% | 1 |
| stelo.Lifestealer 1.0 | 9.0 | 5.8% | 0 |
| stelo.PianistNano 1.2 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 89.2 | 23 / 35 | 4621 |
| 2 | 1 | 69.0 | 89.8 | 23 / 35 | 4625 |
| 3 | 1 | 69.8 | 93.7 | 25 / 35 | 4664 |
| 4 | 1 | 68.3 | 88.9 | 20 / 35 | 4516 |
| 5 | 1 | 67.2 | 86.3 | 20 / 35 | 4198 |
| 6 | 1 | 67.7 | 89.5 | 23 / 35 | 4079 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 75 | 79% |
| uji.Antique 1.0 | 50 | 82% |
| qohnil.blot.BlotBot 3.61 | 18 | 78% |
| amk.ChumbaWumba 0.3 | 7 | 100% |
| pfvicm.Sobieski 7.2.3b | 5 | 100% |
| ahr.ice.Ice 1.0.2 | 4 | 100% |
| stelo.Lifestealer 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 30 | 39% | 79 |
| uji.Antique 1.0 | 14 | 18% | 51 |
| qohnil.blot.BlotBot 3.61 | 14 | 18% | 31 |
| pfvicm.Sobieski 7.2.3b | 8 | 10% | 16 |
| ahr.ice.Ice 1.0.2 | 5 | 6% | 13 |
| amk.ChumbaWumba 0.3 | 2 | 3% | 10 |
| matt.advanced.Katana 1.0 | 1 | 1% | 6 |
| stelo.Lifestealer 1.0 | 1 | 1% | 3 |
| stelo.PianistNano 1.2 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.1 | 108 / 210 | 2.25 | 18.7% | 29456 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 18.7% | 108 |
| deewiant.Anomaly 0.2 | 2.5 | 14.8% | 37 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 14.6% | 48 |
| myl.micro.Troodon 1.10 | 4.2 | 12.1% | 11 |
| jok.PheonixM 0.1.2 | 5.2 | 9.8% | 2 |
| ph.melee.ArcherME 0.3 | 5.8 | 8.4% | 0 |
| DBall.Anarchy 0.1 | 7.0 | 6.9% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.5% | 0 |
| ap.Frederick 1.1 | 9.0 | 5.1% | 3 |
| jangs.ns51 1.0 | 9.8 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 89.2 | 22 / 35 | 5300 |
| 2 | 1 | 67.7 | 83.8 | 18 / 35 | 4724 |
| 3 | 1 | 67.5 | 82.5 | 16 / 35 | 4569 |
| 4 | 1 | 68.7 | 86.0 | 16 / 35 | 4874 |
| 5 | 1 | 68.3 | 85.4 | 16 / 35 | 5110 |
| 6 | 1 | 69.8 | 89.8 | 20 / 35 | 4879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 59 | 71% |
| zyx.mega.YersiniaPestis 3.1 | 45 | 62% |
| myl.micro.Troodon 1.10 | 14 | 86% |
| jok.PheonixM 0.1.2 | 10 | 100% |
| DBall.Anarchy 0.1 | 8 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 43 | 41% | 84 |
| zyx.mega.YersiniaPestis 3.1 | 28 | 27% | 61 |
| myl.micro.Troodon 1.10 | 19 | 18% | 34 |
| jok.PheonixM 0.1.2 | 9 | 9% | 19 |
| ph.melee.ArcherME 0.3 | 1 | 1% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 2 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
| DBall.Anarchy 0.1 | 0 | 0% | 5 |
2 death(s) with no robot to name.

## Melee bench: F30

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 72.9 | 52 / 210 | 3.44 | 14.6% | 23484 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 2.2 | 14.6% | 52 |
| darkcanuck.B26354 1.06 | 2.3 | 14.1% | 48 |
| catcat20.Matcha 0.006 | 2.7 | 13.8% | 45 |
| oog.melee.Capulet 1.2 | 3.2 | 13.5% | 33 |
| stelo.PastFuture 2.3.2 | 4.7 | 12.5% | 27 |
| intruder.PrairieWolf 2.61 | 6.0 | 8.3% | 2 |
| ntc.Opposite 1.5 | 7.8 | 7.0% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.3% | 2 |
| tripphippy.Alice 1.1 | 8.3 | 6.4% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 71.1 | 9 / 35 | 4053 |
| 2 | 4 | 60.4 | 67.6 | 8 / 35 | 3383 |
| 3 | 1 | 64.1 | 77.8 | 12 / 35 | 4138 |
| 4 | 4 | 59.4 | 66.3 | 5 / 35 | 3544 |
| 5 | 1 | 64.7 | 77.8 | 11 / 35 | 4390 |
| 6 | 1 | 62.8 | 76.5 | 7 / 35 | 3976 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 30 | 57% |
| catcat20.Matcha 0.006 | 18 | 78% |
| oog.melee.Capulet 1.2 | 18 | 56% |
| stelo.PastFuture 2.3.2 | 14 | 57% |
| intruder.PrairieWolf 2.61 | 3 | 67% |
| tripphippy.Alice 1.1 | 1 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 0% |

Hadur died in 159 of 210 rounds, at a mean tick of 805. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 46 | 29% | 56 |
| stelo.PastFuture 2.3.2 | 37 | 23% | 45 |
| catcat20.Matcha 0.006 | 25 | 16% | 43 |
| oog.melee.Capulet 1.2 | 24 | 15% | 35 |
| ntc.Opposite 1.5 | 8 | 5% | 8 |
| fowl3628800.LightningBolt 2.6.0 | 7 | 4% | 7 |
| tripphippy.Alice 1.1 | 5 | 3% | 8 |
| intruder.PrairieWolf 2.61 | 5 | 3% | 7 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F31

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 73.2 | 50 / 210 | 3.41 | 14.4% | 20829 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.4% | 110 |
| hadur117.mini.DeiseP2 0.3 | 2.3 | 14.4% | 50 |
| gh.mini.Griezel 0.2 | 2.7 | 13.3% | 33 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.5% | 8 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 10.7% | 5 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.2% | 3 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.5% | 4 |
| fm.mammillarias 1.3 | 8.2 | 5.9% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.3 | 5.6% | 0 |
| tlp.ThreeLeggedPig 1 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 74.6 | 8 / 35 | 3587 |
| 2 | 2 | 62.5 | 73.7 | 10 / 35 | 3476 |
| 3 | 2 | 60.7 | 70.8 | 6 / 35 | 3378 |
| 4 | 3 | 62.3 | 72.4 | 7 / 35 | 3704 |
| 5 | 2 | 63.8 | 79.7 | 11 / 35 | 3405 |
| 6 | 3 | 60.5 | 68.3 | 8 / 35 | 3279 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 54 | 48% |
| gh.mini.Griezel 0.2 | 20 | 30% |
| d414.nano.Quantum 1.0.0 | 9 | 78% |
| spinnercat.micro.Tyger 0.1 | 7 | 86% |
| gh.nano.Grofvuil 0.2 | 4 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 57 | 35% | 78 |
| gh.mini.Griezel 0.2 | 50 | 31% | 61 |
| d414.nano.Quantum 1.0.0 | 23 | 14% | 30 |
| spinnercat.micro.Tyger 0.1 | 15 | 9% | 20 |
| fm.mammillarias 1.3 | 6 | 4% | 7 |
| gh.nano.Grofvuil 0.2 | 4 | 2% | 8 |
| timmit.nano.TimDog 0.33 | 3 | 2% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 89.5 | 127 / 210 | 1.95 | 18.9% | 29393 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 18.9% | 127 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.0% | 50 |
| apc.botM 3.0 | 3.2 | 11.5% | 17 |
| lxx.ConceptA 0.8 | 3.8 | 10.6% | 4 |
| vjik.UnViolation 1.1 | 5.3 | 9.2% | 1 |
| bayen.UbaMicro 1.4 | 5.8 | 8.9% | 3 |
| panzer.Panzer 0.2 | 7.3 | 7.3% | 0 |
| yk.JahMicro 1.0 | 8.2 | 6.9% | 5 |
| conscience.Electron 1.3g | 8.3 | 6.6% | 1 |
| donjezza.Jezza 1.0 | 10.0 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 92.4 | 23 / 35 | 4888 |
| 2 | 1 | 67.7 | 87.3 | 19 / 35 | 4947 |
| 3 | 1 | 68.1 | 89.8 | 17 / 35 | 4979 |
| 4 | 1 | 67.1 | 83.2 | 23 / 35 | 4741 |
| 5 | 1 | 70.4 | 95.9 | 25 / 35 | 5014 |
| 6 | 1 | 67.7 | 88.3 | 20 / 35 | 4824 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 78 | 62% |
| apc.botM 3.0 | 35 | 74% |
| lxx.ConceptA 0.8 | 21 | 95% |
| vjik.UnViolation 1.1 | 10 | 100% |
| bayen.UbaMicro 1.4 | 9 | 89% |
| yk.JahMicro 1.0 | 8 | 88% |
| conscience.Electron 1.3g | 4 | 100% |
| panzer.Panzer 0.2 | 3 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 43 | 52% | 93 |
| lxx.ConceptA 0.8 | 15 | 18% | 19 |
| apc.botM 3.0 | 14 | 17% | 47 |
| panzer.Panzer 0.2 | 4 | 5% | 8 |
| bayen.UbaMicro 1.4 | 2 | 2% | 8 |
| conscience.Electron 1.3g | 2 | 2% | 4 |
| vjik.UnViolation 1.1 | 1 | 1% | 24 |
| yk.JahMicro 1.0 | 1 | 1% | 4 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |

## Melee bench: F33

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.6 | 128 / 210 | 2.21 | 19.0% | 30687 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 19.0% | 128 |
| maribo.Quester 0.3 | 2.0 | 15.4% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.4% | 15 |
| labg.Cataclysm 2.05 | 4.2 | 11.4% | 15 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 10.9% | 10 |
| baal.nano.N 1.42 | 6.2 | 8.4% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.0% | 5 |
| zyx.micro.Ant 1.1 | 8.2 | 5.7% | 1 |
| sanja.First 0.1 | 9.3 | 4.4% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 83.8 | 19 / 35 | 4816 |
| 2 | 1 | 69.1 | 87.9 | 22 / 35 | 4895 |
| 3 | 1 | 68.5 | 83.5 | 20 / 35 | 5220 |
| 4 | 1 | 69.3 | 89.2 | 22 / 35 | 4981 |
| 5 | 1 | 70.3 | 89.5 | 25 / 35 | 5524 |
| 6 | 1 | 69.0 | 85.4 | 20 / 35 | 5251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 58 | 76% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 90% |
| gre.svman4.Leonidas 1.3.2 | 30 | 97% |
| labg.Cataclysm 2.05 | 15 | 87% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 86% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 37 | 45% | 88 |
| labg.Cataclysm 2.05 | 13 | 16% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 15% | 51 |
| gre.svman4.Leonidas 1.3.2 | 11 | 13% | 30 |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 5% | 7 |
| zyx.micro.Ant 1.1 | 3 | 4% | 5 |
| baal.nano.N 1.42 | 1 | 1% | 3 |
| sanja.First 0.1 | 1 | 1% | 1 |

## Melee bench: F34

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.1 | 85 / 210 | 2.43 | 17.4% | 29227 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.5 | 17.4% | 85 |
| stelo.Spread 0.9 | 2.2 | 16.5% | 59 |
| kid.Gladiator .7.2 | 2.3 | 16.4% | 50 |
| tcf.Reach 3 | 4.3 | 11.0% | 5 |
| jcs.Seth 1.8 | 4.8 | 10.7% | 9 |
| cli.Dancer 1.1 | 5.8 | 9.4% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.5 | 3.2% | 0 |
| sample.RamFire 1.0 | 9.5 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 85.1 | 16 / 35 | 4839 |
| 2 | 1 | 69.4 | 88.3 | 19 / 35 | 5209 |
| 3 | 1 | 68.2 | 85.7 | 13 / 35 | 4978 |
| 4 | 3 | 65.2 | 75.9 | 10 / 35 | 4631 |
| 5 | 1 | 67.4 | 85.4 | 11 / 35 | 4759 |
| 6 | 2 | 67.9 | 84.1 | 16 / 35 | 4811 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 71 | 58% |
| kid.Gladiator .7.2 | 47 | 60% |
| jcs.Seth 1.8 | 9 | 78% |
| ratosh.Wesco 1.4 | 5 | 60% |
| tcf.Reach 3 | 3 | 100% |
| cli.Dancer 1.1 | 3 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 53 | 42% | 72 |
| stelo.Spread 0.9 | 51 | 40% | 90 |
| jcs.Seth 1.8 | 12 | 10% | 23 |
| tcf.Reach 3 | 7 | 6% | 15 |
| ratosh.Wesco 1.4 | 3 | 2% | 6 |
| cli.Dancer 1.1 | 0 | 0% | 4 |

## Melee bench: F35

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 78.9 | 37 / 210 | 2.90 | 14.9% | 21321 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.6% | 143 |
| hadur117.mini.DeiseP2 0.3 | 2.2 | 14.9% | 37 |
| gh.mini.Gruwel 0.9 | 3.0 | 12.6% | 20 |
| rz.HawkOnFire 0.1 | 4.3 | 11.9% | 4 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.5 | 11.6% | 6 |
| myl.nano.KomoriNinja 1.1 | 6.2 | 7.6% | 1 |
| wit.Chuliath 1.0 | 7.0 | 6.7% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 6.0% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 73.0 | 4 / 35 | 3243 |
| 2 | 2 | 63.8 | 80.0 | 7 / 35 | 3703 |
| 3 | 2 | 65.0 | 82.2 | 8 / 35 | 3927 |
| 4 | 2 | 63.9 | 81.3 | 6 / 35 | 3767 |
| 5 | 2 | 64.5 | 82.2 | 7 / 35 | 3655 |
| 6 | 3 | 61.4 | 74.6 | 5 / 35 | 3026 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 80 | 19% |
| gh.mini.Gruwel 0.9 | 18 | 44% |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 82% |
| rz.HawkOnFire 0.1 | 6 | 83% |
| myl.nano.KomoriNinja 1.1 | 1 | 0% |

Hadur died in 174 of 210 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 91 | 52% | 103 |
| gh.mini.Gruwel 0.9 | 32 | 18% | 45 |
| rz.HawkOnFire 0.1 | 21 | 12% | 25 |
| dmh.robocode.robot.BlackDeath 9.2 | 17 | 10% | 24 |
| wit.Chuliath 1.0 | 5 | 3% | 6 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 4 |
| myl.nano.KomoriNinja 1.1 | 3 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F36

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 93.0 | 170 / 210 | 1.63 | 20.8% | 32385 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 20.8% | 170 |
| bzdp.Pansy 2.1 | 2.7 | 11.5% | 8 |
| alpha.RainingFire 1.0 | 2.8 | 12.2% | 14 |
| bvh.micro.Freya 0.3 | 4.3 | 10.4% | 6 |
| mz.Cork 0.1 | 5.3 | 10.2% | 5 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.5% | 2 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.2% | 2 |
| dl.BetterWalls 1.0 | 8.2 | 6.5% | 1 |
| squidM.TentalceMeleeNano 1.1 | 9.0 | 5.5% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 91.1 | 24 / 35 | 5436 |
| 2 | 1 | 70.6 | 90.5 | 27 / 35 | 5668 |
| 3 | 1 | 71.6 | 95.2 | 30 / 35 | 5239 |
| 4 | 1 | 71.6 | 96.2 | 32 / 35 | 5303 |
| 5 | 1 | 70.8 | 92.4 | 30 / 35 | 5215 |
| 6 | 1 | 71.0 | 92.4 | 27 / 35 | 5524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| alpha.RainingFire 1.0 | 37 | 81% |
| bzdp.Pansy 2.1 | 37 | 95% |
| bvh.micro.Freya 0.3 | 33 | 97% |
| mz.Cork 0.1 | 29 | 97% |
| bvh.mini.Fenrir 0.39 | 20 | 100% |
| m3thos.Eva02 0.7.1 | 16 | 94% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| dl.BetterWalls 1.0 | 4 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 12 | 30% | 39 |
| bzdp.Pansy 2.1 | 10 | 25% | 64 |
| bvh.mini.Fenrir 0.39 | 6 | 15% | 16 |
| bvh.micro.Freya 0.3 | 5 | 13% | 24 |
| mz.Cork 0.1 | 4 | 10% | 34 |
| m3thos.Eva02 0.7.1 | 2 | 5% | 22 |
| sample.MyFirstRobot 1.0 | 1 | 3% | 2 |
| dl.BetterWalls 1.0 | 0 | 0% | 9 |

## Melee bench: F37

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 94.5 | 185 / 210 | 1.50 | 20.6% | 34212 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 20.6% | 185 |
| germ.TheMind .2 | 2.5 | 10.5% | 4 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.0 | 10.1% | 3 |
| EBBU.Sim2 1.02 | 3.8 | 9.9% | 3 |
| agrach.Dalek 1.0 | 6.0 | 8.5% | 5 |
| stelo.UntouchableNano 1.3 | 6.2 | 8.9% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 6.8 | 8.4% | 0 |
| lmk.ACPFinal 0.1 | 7.8 | 8.2% | 1 |
| mb.Beast 0.1 | 8.7 | 7.7% | 1 |
| skm.Ryubot 1.0 | 9.2 | 7.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 88.9 | 28 / 35 | 5223 |
| 2 | 1 | 70.3 | 94.3 | 31 / 35 | 6025 |
| 3 | 1 | 68.9 | 90.8 | 29 / 35 | 5365 |
| 4 | 1 | 71.6 | 99.0 | 33 / 35 | 5965 |
| 5 | 1 | 70.1 | 95.2 | 30 / 35 | 5615 |
| 6 | 1 | 71.5 | 98.7 | 34 / 35 | 6019 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 49 | 98% |
| stelo.UntouchableNano 1.3 | 34 | 97% |
| skm.Ryubot 1.0 | 21 | 95% |
| mb.Beast 0.1 | 21 | 100% |
| agrach.Dalek 1.0 | 19 | 100% |
| EBBU.Sim2 1.02 | 18 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 18 | 94% |
| lmk.ACPFinal 0.1 | 7 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 27 of 210 rounds, at a mean tick of 486. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 6 | 22% | 46 |
| stelo.UntouchableNano 1.3 | 6 | 22% | 37 |
| com.syncleus.robocode.Dreadnaught 0.1 | 6 | 22% | 31 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 11% | 8 |
| lmk.ACPFinal 0.1 | 2 | 7% | 16 |
| EBBU.Sim2 1.02 | 2 | 7% | 16 |
| mb.Beast 0.1 | 1 | 4% | 19 |
| skm.Ryubot 1.0 | 1 | 4% | 5 |
| agrach.Dalek 1.0 | 0 | 0% | 25 |

## Melee bench: F38

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 78.5 | 72 / 210 | 2.93 | 15.9% | 25046 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.3 | 16.5% | 79 |
| hadur117.mini.DeiseP2 0.3 | 1.7 | 15.9% | 72 |
| bvh.mini.Freya 0.55 | 3.0 | 13.5% | 21 |
| bts.mega.Gnarly 1.4 | 4.5 | 10.6% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.8 | 10.7% | 3 |
| cs.Wren 1.0 | 6.0 | 10.1% | 4 |
| kdf.KoulDestroyer 1.0 | 6.7 | 9.1% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 5.9% | 1 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.3% | 1 |
| bzdp.BoxCar 2.0 | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 72.7 | 10 / 35 | 3861 |
| 2 | 1 | 65.5 | 81.3 | 12 / 35 | 4275 |
| 3 | 2 | 65.1 | 78.1 | 16 / 35 | 4090 |
| 4 | 1 | 66.5 | 83.8 | 14 / 35 | 4274 |
| 5 | 2 | 64.6 | 76.8 | 11 / 35 | 4318 |
| 6 | 2 | 64.3 | 78.4 | 9 / 35 | 4228 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 57 | 51% |
| bvh.mini.Freya 0.55 | 21 | 67% |
| bts.mega.Gnarly 1.4 | 16 | 69% |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 73% |
| cs.Wren 1.0 | 6 | 100% |
| kdf.KoulDestroyer 1.0 | 4 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 56 | 41% | 87 |
| bvh.mini.Freya 0.55 | 25 | 18% | 30 |
| bts.mega.Gnarly 1.4 | 16 | 12% | 32 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 9% | 23 |
| cs.Wren 1.0 | 13 | 9% | 19 |
| kdf.KoulDestroyer 1.0 | 11 | 8% | 13 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 1% | 2 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 1 |

## Melee bench: F39

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 82.0 | 89 / 210 | 2.62 | 17.0% | 28046 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 17.0% | 89 |
| bvh.fry.Freya 0.82 | 2.0 | 15.1% | 26 |
| az.Ololobot 0.2.4 | 3.0 | 13.6% | 58 |
| catcat20.Lambda 0.024 | 4.0 | 11.1% | 24 |
| stelo.SoRobotNanoMelee 1.2 | 6.2 | 8.5% | 8 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.3% | 2 |
| gimp.GimpBot 0.1 | 6.2 | 8.3% | 3 |
| apollokidd.ApolloKidd 0.9 | 7.5 | 7.6% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.8% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 74.9 | 13 / 35 | 4763 |
| 2 | 1 | 64.1 | 77.8 | 12 / 35 | 4429 |
| 3 | 1 | 66.3 | 81.9 | 13 / 35 | 5049 |
| 4 | 1 | 67.9 | 89.2 | 20 / 35 | 4808 |
| 5 | 1 | 65.5 | 82.2 | 14 / 35 | 4357 |
| 6 | 1 | 66.8 | 86.0 | 17 / 35 | 4640 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 46 | 52% |
| bvh.fry.Freya 0.82 | 41 | 85% |
| catcat20.Lambda 0.024 | 22 | 77% |
| stelo.SoRobotNanoMelee 1.2 | 8 | 100% |
| gimp.GimpBot 0.1 | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 985. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 46 | 38% | 76 |
| az.Ololobot 0.2.4 | 35 | 29% | 64 |
| catcat20.Lambda 0.024 | 13 | 11% | 28 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 9% | 14 |
| gimp.GimpBot 0.1 | 7 | 6% | 12 |
| apollokidd.ApolloKidd 0.9 | 6 | 5% | 7 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 7 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 1 |

## Melee bench: F40

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.4 | 121 / 210 | 2.40 | 18.2% | 28926 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 18.2% | 121 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.2% | 38 |
| kano.gamma.KanoGamma 1.8 | 3.5 | 12.0% | 18 |
| mz.AntiGrav 1.0 | 4.8 | 10.6% | 8 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.2% | 12 |
| stelo.Randomness 1.0 | 5.7 | 9.1% | 9 |
| alpha.BlackIce 1.0 | 6.2 | 9.3% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.2 | 6.1% | 1 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.2% | 1 |
| sample.Corners 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 82.9 | 19 / 35 | 4645 |
| 2 | 1 | 69.0 | 89.2 | 23 / 35 | 4697 |
| 3 | 1 | 67.4 | 82.9 | 17 / 35 | 5045 |
| 4 | 1 | 65.6 | 78.7 | 20 / 35 | 4375 |
| 5 | 1 | 69.6 | 89.8 | 23 / 35 | 5096 |
| 6 | 1 | 67.9 | 83.2 | 19 / 35 | 5068 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 70 | 81% |
| kano.gamma.KanoGamma 1.8 | 32 | 84% |
| mz.AntiGrav 1.0 | 15 | 87% |
| stelo.Randomness 1.0 | 13 | 92% |
| Polkwane.SmashMelee 1.0 | 9 | 67% |
| alpha.BlackIce 1.0 | 4 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 722. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 40 | 44% | 82 |
| mz.AntiGrav 1.0 | 13 | 14% | 24 |
| kano.gamma.KanoGamma 1.8 | 11 | 12% | 47 |
| stelo.Randomness 1.0 | 8 | 9% | 21 |
| Polkwane.SmashMelee 1.0 | 8 | 9% | 13 |
| alpha.BlackIce 1.0 | 7 | 8% | 16 |
| sample.Corners 1.0 | 2 | 2% | 2 |
| amk.superstrike.SuperStrike 0.3 | 1 | 1% | 2 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 3 |

## Melee bench: F41

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 84.7 | 99 / 210 | 2.38 | 17.3% | 24746 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 17.3% | 99 |
| eem.EvBotNG v12.8 | 2.0 | 15.4% | 66 |
| ary.Swarm 1.1 | 3.2 | 13.8% | 19 |
| lessonz.robocode.Oz 0.5.0 | 4.3 | 12.3% | 11 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 11.7% | 13 |
| shrub.Silver v048 | 6.0 | 8.2% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.8% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.5% | 2 |
| stelo.Mirror 1.1 | 8.5 | 5.5% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 80.6 | 15 / 35 | 4043 |
| 2 | 1 | 68.9 | 89.8 | 20 / 35 | 4498 |
| 3 | 1 | 66.6 | 83.8 | 17 / 35 | 4049 |
| 4 | 1 | 66.0 | 82.9 | 15 / 35 | 3821 |
| 5 | 1 | 68.8 | 91.4 | 19 / 35 | 4328 |
| 6 | 1 | 65.3 | 79.7 | 13 / 35 | 4007 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 65 | 45% |
| ary.Swarm 1.1 | 27 | 74% |
| lessonz.robocode.Oz 0.5.0 | 23 | 100% |
| simonton.nano.MeleeSeed 1.8 | 22 | 86% |
| jsal.Jsalbot 1.0 | 7 | 86% |
| shrub.Silver v048 | 1 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 926. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 48 | 43% | 77 |
| ary.Swarm 1.1 | 29 | 26% | 46 |
| lessonz.robocode.Oz 0.5.0 | 15 | 14% | 25 |
| simonton.nano.MeleeSeed 1.8 | 13 | 12% | 40 |
| zyx.nano.Ant 1.1 | 3 | 3% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 7 |
| shrub.Silver v048 | 1 | 1% | 4 |
| acogdev.alpha 0.2 | 1 | 1% | 2 |
| stelo.Mirror 1.1 | 0 | 0% | 4 |

## Melee bench: F42

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.4 | 110 / 210 | 2.22 | 18.3% | 30596 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 18.3% | 110 |
| wompi.Wallaby 5.1 | 2.0 | 15.5% | 53 |
| ara.Shera 0.88 | 3.0 | 13.5% | 29 |
| maribo.mini.MiniQuester 0.1 | 4.0 | 13.0% | 15 |
| amz.NanoClone 1.41 | 5.0 | 9.0% | 0 |
| dsw.StaticD 1.0 | 6.3 | 7.5% | 1 |
| maribo.IotaCT 1.1 | 6.7 | 6.9% | 0 |
| stelo.MirrorMicro 1.0 | 8.7 | 5.9% | 1 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.4% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 85.7 | 16 / 35 | 5035 |
| 2 | 1 | 69.9 | 91.4 | 23 / 35 | 5479 |
| 3 | 1 | 70.3 | 91.4 | 23 / 35 | 5493 |
| 4 | 1 | 67.9 | 84.8 | 18 / 35 | 5188 |
| 5 | 1 | 66.3 | 81.6 | 15 / 35 | 4852 |
| 6 | 1 | 65.9 | 83.5 | 15 / 35 | 4549 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 51 | 73% |
| ara.Shera 0.88 | 40 | 80% |
| maribo.mini.MiniQuester 0.1 | 35 | 86% |
| dsw.StaticD 1.0 | 8 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 0% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 38 | 38% | 80 |
| ara.Shera 0.88 | 35 | 35% | 63 |
| maribo.mini.MiniQuester 0.1 | 16 | 16% | 43 |
| amz.NanoClone 1.41 | 4 | 4% | 6 |
| mme.NikeEnhanced 2.0 | 2 | 2% | 3 |
| maribo.IotaCT 1.1 | 2 | 2% | 3 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 3 |
| dsw.StaticD 1.0 | 1 | 1% | 8 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 1 |

## Melee bench: F43

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 73.8 | 22 / 210 | 3.36 | 14.1% | 21530 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.2% | 156 |
| hadur117.mini.DeiseP2 0.3 | 2.2 | 14.1% | 22 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.7% | 20 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.1% | 3 |
| wcsv.melee.EngineerMelee 0.1 | 4.3 | 11.1% | 7 |
| Krabb.akim2.Akim2 1.1b | 6.2 | 9.5% | 0 |
| mz.NanoGod 2.02 | 7.3 | 8.0% | 2 |
| jab.DiamondStealer 5 | 7.5 | 7.8% | 1 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 78.7 | 4 / 35 | 3744 |
| 2 | 2 | 65.2 | 79.4 | 4 / 35 | 3742 |
| 3 | 2 | 63.3 | 73.3 | 6 / 35 | 3554 |
| 4 | 3 | 60.4 | 67.3 | 0 / 35 | 3417 |
| 5 | 2 | 63.6 | 75.9 | 5 / 35 | 3706 |
| 6 | 2 | 60.9 | 68.3 | 3 / 35 | 3367 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 80 | 11% |
| brainfade.melee.Dusk 0.44 | 9 | 78% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 100% |
| dummy.micro.Sparrow 2.5 | 2 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 188 of 210 rounds, at a mean tick of 889. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 103 | 55% | 112 |
| brainfade.melee.Dusk 0.44 | 31 | 16% | 37 |
| dummy.micro.Sparrow 2.5 | 18 | 10% | 19 |
| wcsv.melee.EngineerMelee 0.1 | 12 | 6% | 14 |
| mz.NanoGod 2.02 | 10 | 5% | 12 |
| Krabb.akim2.Akim2 1.1b | 7 | 4% | 8 |
| jab.DiamondStealer 5 | 6 | 3% | 7 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |

## Melee bench: F44

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 89.4 | 132 / 210 | 1.96 | 19.5% | 31485 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 19.5% | 132 |
| tzu.TheArtOfWar 1.2 | 2.3 | 14.3% | 27 |
| stelo.Liblix 0.3.1 | 2.7 | 14.9% | 43 |
| wompi.Quokka 1.6 | 4.0 | 10.7% | 9 |
| jwirde.Gort 2.0 | 5.3 | 8.8% | 2 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6.0 | 8.8% | 0 |
| disan.Chair 2.2.0 | 6.7 | 7.9% | 1 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.2% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.7% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 85.4 | 19 / 35 | 5100 |
| 2 | 1 | 68.8 | 86.3 | 20 / 35 | 5334 |
| 3 | 1 | 69.7 | 90.2 | 21 / 35 | 5114 |
| 4 | 1 | 70.9 | 93.3 | 26 / 35 | 5475 |
| 5 | 1 | 69.2 | 88.3 | 21 / 35 | 5140 |
| 6 | 1 | 70.8 | 92.7 | 25 / 35 | 5322 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 76 | 82% |
| tzu.TheArtOfWar 1.2 | 62 | 69% |
| wompi.Quokka 1.6 | 10 | 60% |
| disan.Chair 2.2.0 | 7 | 86% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 100% |
| jwirde.Gort 2.0 | 6 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tzu.TheArtOfWar 1.2 | 27 | 33% | 69 |
| stelo.Liblix 0.3.1 | 26 | 32% | 93 |
| wompi.Quokka 1.6 | 11 | 13% | 18 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 5% | 7 |
| disan.Chair 2.2.0 | 4 | 5% | 6 |
| jwirde.Gort 2.0 | 2 | 2% | 11 |
| sample.Crazy 1.0 | 2 | 2% | 2 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 2 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 1 |
4 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.5 | 96 / 210 | 2.03 | 19.8% | 35612 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP2 0.3 | 1.0 | 19.8% | 96 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.9% | 98 |
| jje.BagPuss 1.2 | 2.8 | 11.8% | 1 |
| sul.Lunar 1.1 | 4.3 | 10.2% | 3 |
| myl.nano.Graviton 1.10 | 4.8 | 9.9% | 2 |
| pez.mini.ChironexFleckeri 0.5 | 6.7 | 8.4% | 4 |
| fm.claire 1.7 | 6.8 | 8.2% | 4 |
| hvilela.HVilela 0.9 | 7.2 | 8.1% | 0 |
| wit.Deep7 2.0 | 9.0 | 6.3% | 3 |
| abud.ThirdRobo 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.9 | 15 / 35 | 5724 |
| 2 | 1 | 69.9 | 89.8 | 17 / 35 | 6177 |
| 3 | 1 | 68.6 | 85.7 | 11 / 35 | 5980 |
| 4 | 1 | 69.1 | 88.6 | 17 / 35 | 5509 |
| 5 | 1 | 69.6 | 87.6 | 15 / 35 | 6128 |
| 6 | 1 | 70.9 | 91.4 | 21 / 35 | 6094 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 109 | 29% |
| jje.BagPuss 1.2 | 21 | 100% |
| sul.Lunar 1.1 | 16 | 94% |
| myl.nano.Graviton 1.10 | 15 | 93% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 86% |
| wit.Deep7 2.0 | 4 | 75% |
| fm.claire 1.7 | 4 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 2305. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 78 | 68% | 0 |
| jje.BagPuss 1.2 | 8 | 7% | 61 |
| fm.claire 1.7 | 8 | 7% | 15 |
| myl.nano.Graviton 1.10 | 6 | 5% | 42 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 5% | 17 |
| sul.Lunar 1.1 | 4 | 3% | 51 |
| hvilela.HVilela 0.9 | 3 | 3% | 11 |
| wit.Deep7 2.0 | 1 | 1% | 6 |
| abud.ThirdRobo 1.0 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F46

hadur117.mini.DeiseP2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 81.4 | 60 / 210 | 2.68 | 15.9% | 24450 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 16.7% | 52 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.6% | 87 |
| hadur117.mini.DeiseP2 0.3 | 2.5 | 15.9% | 60 |
| mz.MicroSheep 1.0 | 4.0 | 11.1% | 6 |
| cx.Princess 1.0 | 5.3 | 9.7% | 4 |
| sadoner.killer 0.2 | 5.7 | 9.2% | 2 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.1% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.0% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.5% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 83.5 | 14 / 35 | 4486 |
| 2 | 3 | 62.3 | 77.1 | 5 / 35 | 3361 |
| 3 | 3 | 65.2 | 81.9 | 9 / 35 | 4215 |
| 4 | 2 | 66.4 | 86.7 | 12 / 35 | 4274 |
| 5 | 3 | 63.9 | 77.5 | 9 / 35 | 4008 |
| 6 | 3 | 65.5 | 81.6 | 11 / 35 | 4106 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 45 | 58% |
| rsalesc.melee.Medina 0.4.5 | 43 | 30% |
| cx.Princess 1.0 | 13 | 92% |
| mz.MicroSheep 1.0 | 7 | 86% |
| arthord.NanoSatanMelee Beta | 3 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 63 | 42% | 92 |
| rsalesc.melee.Medina 0.4.5 | 51 | 34% | 64 |
| mz.MicroSheep 1.0 | 19 | 13% | 24 |
| cx.Princess 1.0 | 11 | 7% | 20 |
| sadoner.killer 0.2 | 3 | 2% | 5 |
| arthord.NanoSatanMelee Beta | 3 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

