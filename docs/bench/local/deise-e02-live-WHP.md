# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 73.1 | 14 / 210 | 3.42 | 14.8% | 30329 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.6% | 152 |
| hadur117.mini.DeiseWHP 0.2 | 2.0 | 14.8% | 14 |
| sgp.JollyNinja 3.53 | 3.8 | 11.6% | 20 |
| mz.MicroGodMelee 1 | 4.0 | 11.5% | 10 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.9% | 8 |
| lorneswork.Predator 1.0 | 5.7 | 9.6% | 7 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.8% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 72.4 | 2 / 35 | 5297 |
| 2 | 2 | 62.8 | 74.6 | 2 / 35 | 4944 |
| 3 | 2 | 66.1 | 81.3 | 4 / 35 | 5445 |
| 4 | 2 | 61.3 | 67.6 | 2 / 35 | 4766 |
| 5 | 2 | 62.3 | 69.2 | 3 / 35 | 4882 |
| 6 | 2 | 63.2 | 73.7 | 1 / 35 | 4995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 65 | 3% |
| sgp.JollyNinja 3.53 | 10 | 30% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 43% |
| lorneswork.Predator 1.0 | 6 | 83% |
| mz.MicroGodMelee 1 | 4 | 25% |

Hadur died in 196 of 210 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 117 | 60% | 122 |
| sgp.JollyNinja 3.53 | 22 | 11% | 24 |
| mz.MicroGodMelee 1 | 22 | 11% | 22 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 8% | 17 |
| lorneswork.Predator 1.0 | 12 | 6% | 17 |
| adt.Ar2 1.0 | 4 | 2% | 4 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 2% | 3 |
| skm.butterfly 1.0 | 1 | 1% | 1 |

## Melee bench: F02

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 71.4 | 48 / 210 | 3.57 | 15.8% | 32726 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHP 0.2 | 1.7 | 15.8% | 48 |
| pulsar.PulsarMax 0.8.9 | 1.7 | 14.9% | 67 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.5% | 45 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.5% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.0% | 14 |
| sch.Simone 0.3d | 6.5 | 8.4% | 12 |
| Noran.BitchingElk 0.054 | 7.2 | 7.8% | 15 |
| fnc.bandit.Bandit 5.2.0 | 7.5 | 7.9% | 2 |
| stelo.PatternRobot 1.0 | 8.7 | 6.3% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 81.0 | 13 / 35 | 5849 |
| 2 | 2 | 62.9 | 67.9 | 7 / 35 | 5416 |
| 3 | 2 | 62.6 | 67.3 | 8 / 35 | 5384 |
| 4 | 3 | 60.7 | 64.4 | 3 / 35 | 4979 |
| 5 | 1 | 62.8 | 69.5 | 7 / 35 | 5205 |
| 6 | 1 | 66.4 | 78.4 | 10 / 35 | 5893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 27 | 41% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 24 | 42% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| Noran.BitchingElk 0.054 | 11 | 73% |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 38% |
| stelo.PatternRobot 1.0 | 3 | 100% |
| sch.Simone 0.3d | 2 | 50% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 163 of 210 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 46 | 28% | 60 |
| pulsar.PulsarMax 0.8.9 | 38 | 23% | 50 |
| sch.Simone 0.3d | 23 | 14% | 25 |
| com.cohesiva.robocode.ManOwaR 1.0 | 20 | 12% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 9% | 22 |
| fnc.bandit.Bandit 5.2.0 | 10 | 6% | 11 |
| Noran.BitchingElk 0.054 | 5 | 3% | 10 |
| stelo.PatternRobot 1.0 | 4 | 2% | 6 |
| fullsail.SweetTea 1.1 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.6 | 74 / 210 | 2.30 | 18.2% | 37708 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHP 0.2 | 1.0 | 18.2% | 74 |
| radnor.DoctorBob 1.42 | 2.0 | 16.1% | 84 |
| vuen.Cake 2.51 | 3.3 | 12.8% | 33 |
| kawigi.nano.Lib 1.0 | 3.7 | 12.4% | 14 |
| urdos.URDOS 1.3 | 5.0 | 9.1% | 1 |
| adt.Ar1 2.1 | 6.2 | 7.8% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.5% | 1 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.8% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 6.0% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 86.0 | 12 / 35 | 6503 |
| 2 | 1 | 68.3 | 87.0 | 12 / 35 | 6456 |
| 3 | 1 | 68.2 | 86.7 | 13 / 35 | 6269 |
| 4 | 1 | 66.6 | 82.5 | 10 / 35 | 6087 |
| 5 | 1 | 66.5 | 81.6 | 11 / 35 | 5921 |
| 6 | 1 | 69.0 | 89.8 | 16 / 35 | 6472 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 53 | 15% |
| vuen.Cake 2.51 | 42 | 40% |
| kawigi.nano.Lib 1.0 | 33 | 97% |
| oa.weak.FlyMk1 0.1 | 6 | 100% |
| adt.Ar1 2.1 | 5 | 80% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 4 | 75% |
| urdos.URDOS 1.3 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 81 | 59% | 89 |
| vuen.Cake 2.51 | 35 | 25% | 57 |
| kawigi.nano.Lib 1.0 | 7 | 5% | 31 |
| urdos.URDOS 1.3 | 6 | 4% | 10 |
| oa.weak.FlyMk1 0.1 | 4 | 3% | 12 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 1% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 1% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 1% | 2 |
| adt.Ar1 2.1 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 66.9 | 4 / 210 | 3.98 | 13.8% | 29722 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.0% | 194 |
| hadur117.mini.DeiseWHP 0.2 | 2.3 | 13.8% | 4 |
| apc.LeeroyJenkins2 1.0 | 2.7 | 13.6% | 8 |
| TNT.TNT 0.99.1 | 4.0 | 11.5% | 1 |
| josago.Jorgito 0.16 | 5.2 | 9.4% | 2 |
| css.Delitioner 0.11 | 6.0 | 7.7% | 1 |
| tj.zombie1n 1.0.1 | 7.0 | 6.7% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.6% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.9% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 70.5 | 0 / 35 | 4899 |
| 2 | 3 | 61.3 | 65.1 | 1 / 35 | 4481 |
| 3 | 2 | 62.8 | 68.6 | 0 / 35 | 5119 |
| 4 | 2 | 62.8 | 66.3 | 1 / 35 | 5498 |
| 5 | 3 | 62.1 | 67.0 | 2 / 35 | 4801 |
| 6 | 2 | 61.2 | 64.1 | 0 / 35 | 4924 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 45 | 2% |
| josago.Jorgito 0.16 | 2 | 50% |
| TNT.TNT 0.99.1 | 1 | 100% |
| apc.LeeroyJenkins2 1.0 | 1 | 100% |

Hadur died in 206 of 210 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 118 | 57% | 119 |
| apc.LeeroyJenkins2 1.0 | 31 | 15% | 32 |
| TNT.TNT 0.99.1 | 22 | 11% | 24 |
| josago.Jorgito 0.16 | 22 | 11% | 23 |
| css.Delitioner 0.11 | 6 | 3% | 6 |
| tj.zombie1n 1.0.1 | 3 | 1% | 3 |
| rampancy.Durandal 2.1d | 3 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 1 |

## Melee bench: F05

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.1 | 53.5 | 0 / 210 | 5.18 | 10.7% | 21268 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 19.6% | 136 |
| justin.DemonicRage 3.4 | 2.0 | 16.9% | 46 |
| wompi.Numbat 2.1 | 3.0 | 13.9% | 17 |
| hadur117.mini.DeiseWHP 0.2 | 4.3 | 10.7% | 0 |
| ms.Ares 0.19 | 5.2 | 9.6% | 2 |
| axeBots.HataMoto 3.09 | 5.5 | 9.3% | 9 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.0% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.3% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.4% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.6 | 55.6 | 0 / 35 | 3490 |
| 2 | 6 | 53.8 | 49.8 | 0 / 35 | 3627 |
| 3 | 4 | 56.2 | 55.6 | 0 / 35 | 3675 |
| 4 | 4 | 56.4 | 56.2 | 0 / 35 | 3672 |
| 5 | 4 | 55.4 | 54.9 | 0 / 35 | 3386 |
| 6 | 4 | 53.3 | 49.2 | 0 / 35 | 3418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 3 | 0% |
| wompi.Numbat 2.1 | 2 | 0% |
| justin.DemonicRage 3.4 | 1 | 0% |
| ms.Ares 0.19 | 1 | 0% |

Hadur died in 210 of 210 rounds, at a mean tick of 489. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 62 | 30% | 62 |
| cb.fire.Firestarter 2.0f | 56 | 27% | 56 |
| wompi.Numbat 2.1 | 44 | 21% | 44 |
| axeBots.HataMoto 3.09 | 18 | 9% | 18 |
| ms.Ares 0.19 | 13 | 6% | 13 |
| Queens_teamrobot.UltraRazor 1.0 | 6 | 3% | 6 |
| davidalves.net.DuelistMicroMelee 1.4 | 5 | 2% | 5 |
| supersample.SuperBoxBot 1.0 | 3 | 1% | 3 |
| GarmBox.Oranges 1.0 | 3 | 1% | 3 |

## Melee bench: F06

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 70.5 | 38 / 210 | 3.66 | 14.8% | 28474 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 1.8 | 14.8% | 81 |
| jekl.StoneGhost 0.7 | 1.8 | 14.9% | 48 |
| hadur117.mini.DeiseWHP 0.2 | 2.3 | 14.8% | 38 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 12.1% | 16 |
| mld.Wisdom 1.0 | 4.8 | 10.8% | 7 |
| gg.Wolverine 2.0 | 6.0 | 9.4% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.1% | 12 |
| spinnercat.Omen 1.0 | 7.8 | 7.0% | 0 |
| DBall.NUKE 0.1 | 8.8 | 6.0% | 0 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 68.6 | 4 / 35 | 4613 |
| 2 | 3 | 61.8 | 68.3 | 4 / 35 | 4827 |
| 3 | 3 | 59.2 | 61.9 | 4 / 35 | 4304 |
| 4 | 3 | 63.7 | 74.3 | 6 / 35 | 4852 |
| 5 | 1 | 64.7 | 74.9 | 10 / 35 | 5080 |
| 6 | 1 | 64.2 | 74.9 | 10 / 35 | 4798 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 24 | 71% |
| origin.SleepSiphon 1.7b | 20 | 15% |
| pe.minimelee.SandboxMiniMelee 1.1 | 9 | 67% |
| gg.Wolverine 2.0 | 8 | 75% |
| mld.Wisdom 1.0 | 4 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 0% |
| DBall.NUKE 0.1 | 1 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 173 of 210 rounds, at a mean tick of 612. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 59 | 34% | 66 |
| jekl.StoneGhost 0.7 | 36 | 21% | 47 |
| pe.minimelee.SandboxMiniMelee 1.1 | 30 | 17% | 33 |
| gg.Wolverine 2.0 | 13 | 8% | 18 |
| ers.nano.hawk.HawkLA 3.0m | 13 | 8% | 13 |
| mld.Wisdom 1.0 | 12 | 7% | 20 |
| spinnercat.Omen 1.0 | 5 | 3% | 7 |
| DBall.NUKE 0.1 | 3 | 2% | 4 |
| sample.Fire 1.0 | 2 | 1% | 2 |

## Melee bench: F07

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 82.4 | 37 / 210 | 2.59 | 17.5% | 37617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.0 | 18.8% | 81 |
| hadur117.mini.DeiseWHP 0.2 | 2.2 | 17.5% | 37 |
| rtk.Tachikoma 1.0 | 2.8 | 16.8% | 60 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.1% | 12 |
| franzor.Lizt 1.3.1 | 4.7 | 11.0% | 21 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.2% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| drd.Dreadknoght 0.9 | 9.2 | 2.3% | 0 |
| sample.Target 1.0 | 9.8 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.1 | 82.9 | 4 / 35 | 6409 |
| 2 | 2 | 68.4 | 83.8 | 6 / 35 | 6180 |
| 3 | 2 | 68.5 | 84.8 | 5 / 35 | 6281 |
| 4 | 2 | 68.9 | 82.9 | 7 / 35 | 6218 |
| 5 | 3 | 67.0 | 76.2 | 6 / 35 | 6202 |
| 6 | 2 | 68.9 | 83.8 | 9 / 35 | 6327 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 50 | 36% |
| rsalesc.melee.Monk 0.3.6c | 43 | 7% |
| oog.melee.CapuletDroid 1.1 | 19 | 63% |
| franzor.Lizt 1.3.1 | 11 | 36% |

Hadur died in 174 of 210 rounds, at a mean tick of 1083. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 74 | 43% | 97 |
| rsalesc.melee.Monk 0.3.6c | 73 | 42% | 82 |
| franzor.Lizt 1.3.1 | 12 | 7% | 5 |
| oog.melee.CapuletDroid 1.1 | 11 | 6% | 22 |
| exauge.GateKeeper 1.1.121g | 3 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 71.5 | 40 / 210 | 3.56 | 15.4% | 30961 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHP 0.2 | 1.7 | 15.4% | 40 |
| tm.Yuugao 1.0 | 2.2 | 13.8% | 58 |
| shrub.Vapour v159 | 2.3 | 13.3% | 49 |
| com.spp.robocode.MostlyHarmless 010 | 4.3 | 10.9% | 29 |
| Krabb.sliNk.Garm 0.9u | 4.5 | 11.0% | 21 |
| m3thos.Eva00 1.1 | 6.5 | 8.3% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 7.5 | 7.6% | 5 |
| SHAM.WOW 1.4 | 8.0 | 6.9% | 2 |
| qualidafial.MajorDick 1.0.1 | 9.0 | 6.4% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 81.0 | 11 / 35 | 5274 |
| 2 | 2 | 61.1 | 65.4 | 6 / 35 | 4903 |
| 3 | 1 | 64.3 | 73.3 | 8 / 35 | 5330 |
| 4 | 1 | 65.4 | 77.8 | 9 / 35 | 5542 |
| 5 | 3 | 60.4 | 65.1 | 3 / 35 | 4986 |
| 6 | 2 | 60.5 | 66.7 | 3 / 35 | 4926 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 25 | 44% |
| shrub.Vapour v159 | 22 | 27% |
| com.spp.robocode.MostlyHarmless 010 | 14 | 14% |
| Krabb.sliNk.Garm 0.9u | 11 | 45% |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 90% |
| SHAM.WOW 1.4 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |
| m3thos.Eva00 1.1 | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 43 | 25% | 54 |
| com.spp.robocode.MostlyHarmless 010 | 39 | 23% | 41 |
| shrub.Vapour v159 | 38 | 22% | 48 |
| Krabb.sliNk.Garm 0.9u | 30 | 18% | 34 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 4% | 12 |
| m3thos.Eva00 1.1 | 5 | 3% | 6 |
| SHAM.WOW 1.4 | 4 | 2% | 8 |
| zyx.nano.BacillusComma 1.0 | 4 | 2% | 5 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 57.2 | 8 / 210 | 4.85 | 12.0% | 24191 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.0% | 114 |
| kc.micro.Figment 1.0 | 2.0 | 15.0% | 42 |
| hadur117.mini.DeiseWHP 0.2 | 3.3 | 12.0% | 8 |
| pedersen.Grishnakh 1.0 | 3.8 | 11.5% | 22 |
| yagami.Tidus 0.11 | 5.2 | 9.8% | 1 |
| mc2.enemy.Original 0.9 | 5.7 | 9.7% | 20 |
| dft.Calliope 5.6 | 7.0 | 7.8% | 3 |
| step.nanoPri 1.0 | 8.0 | 6.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 5.0% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 54.9 | 51.4 | 1 / 35 | 3935 |
| 2 | 3 | 57.4 | 60.6 | 1 / 35 | 3861 |
| 3 | 3 | 59.0 | 60.6 | 3 / 35 | 4391 |
| 4 | 4 | 57.6 | 56.5 | 2 / 35 | 4220 |
| 5 | 3 | 58.3 | 59.0 | 0 / 35 | 4374 |
| 6 | 4 | 55.3 | 54.9 | 1 / 35 | 3410 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 11 | 18% |
| kc.micro.Figment 1.0 | 10 | 0% |
| pedersen.Grishnakh 1.0 | 5 | 40% |
| mc2.enemy.Original 0.9 | 2 | 50% |
| dft.Calliope 5.6 | 2 | 100% |
| yagami.Tidus 0.11 | 1 | 100% |

Hadur died in 202 of 210 rounds, at a mean tick of 555. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 63 | 31% | 63 |
| positive.Portia 1.26e | 58 | 29% | 62 |
| mc2.enemy.Original 0.9 | 20 | 10% | 22 |
| pedersen.Grishnakh 1.0 | 20 | 10% | 20 |
| yagami.Tidus 0.11 | 12 | 6% | 12 |
| step.nanoPri 1.0 | 11 | 5% | 11 |
| dft.Calliope 5.6 | 9 | 4% | 11 |
| robar.nano.Assertive_Melee 0.2 | 5 | 2% | 5 |
| rdm.Dueler 0.4x | 4 | 2% | 4 |

## Melee bench: F10

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 74.9 | 46 / 210 | 3.26 | 15.6% | 32006 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| DTF.Kludgy 1.2b | 1.7 | 14.9% | 66 |
| hadur117.mini.DeiseWHP 0.2 | 1.7 | 15.6% | 46 |
| ne.Chimera 1.2 | 3.0 | 13.6% | 34 |
| ejb.Polaris 1.0.1 | 3.7 | 13.2% | 32 |
| vStar.RAFzilla 2.15 | 5.5 | 10.8% | 11 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.2% | 17 |
| sam.Samspin 1.0 | 7.8 | 6.1% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.8% | 0 |
| kurios.DOSexe .9b | 8.2 | 6.0% | 2 |
| donjezza.Muncho 1.0 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 77.1 | 7 / 35 | 5672 |
| 2 | 2 | 63.3 | 73.7 | 8 / 35 | 5062 |
| 3 | 2 | 63.4 | 73.3 | 6 / 35 | 5208 |
| 4 | 2 | 62.7 | 71.1 | 6 / 35 | 5237 |
| 5 | 1 | 65.1 | 77.5 | 9 / 35 | 5598 |
| 6 | 1 | 64.6 | 76.8 | 10 / 35 | 5229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 30 | 20% |
| ne.Chimera 1.2 | 24 | 33% |
| ejb.Polaris 1.0.1 | 20 | 40% |
| tvv.micro.Antares 1.1.1 | 12 | 83% |
| vStar.RAFzilla 2.15 | 12 | 67% |
| donjezza.Muncho 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 54 | 33% | 60 |
| ejb.Polaris 1.0.1 | 39 | 23% | 51 |
| ne.Chimera 1.2 | 35 | 21% | 43 |
| vStar.RAFzilla 2.15 | 12 | 7% | 20 |
| tvv.micro.Antares 1.1.1 | 9 | 5% | 15 |
| kurios.DOSexe .9b | 7 | 4% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 4% | 7 |
| sam.Samspin 1.0 | 2 | 1% | 2 |
| donjezza.Muncho 1.0 | 1 | 1% | 1 |

## Melee bench: F11

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 65.5 | 32 / 210 | 4.10 | 13.9% | 27337 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 17.4% | 106 |
| hadur117.mini.DeiseWHP 0.2 | 1.8 | 13.9% | 32 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.6% | 25 |
| djc.DynaBot 0.1.1 | 3.8 | 11.5% | 22 |
| br2.MobyDickBot 1.6 | 5.8 | 9.1% | 11 |
| rdt199.Warlord 0.73 | 5.8 | 9.2% | 7 |
| uji.YellohFellah 1.0 | 6.5 | 8.4% | 10 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.3% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 64.4 | 4 / 35 | 4574 |
| 2 | 2 | 58.3 | 60.3 | 3 / 35 | 4260 |
| 3 | 2 | 59.3 | 62.5 | 5 / 35 | 4399 |
| 4 | 1 | 64.2 | 75.9 | 11 / 35 | 4966 |
| 5 | 2 | 61.9 | 69.2 | 4 / 35 | 4641 |
| 6 | 2 | 59.3 | 60.6 | 5 / 35 | 4497 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 33 | 21% |
| djc.DynaBot 0.1.1 | 15 | 60% |
| cx.mini.Nimrod 0.55 | 9 | 44% |
| uji.YellohFellah 1.0 | 5 | 100% |
| br2.MobyDickBot 1.6 | 4 | 75% |
| rdt199.Warlord 0.73 | 4 | 75% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 676. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 87 | 48% | 96 |
| cx.mini.Nimrod 0.55 | 30 | 17% | 34 |
| djc.DynaBot 0.1.1 | 20 | 11% | 28 |
| rdt199.Warlord 0.73 | 16 | 9% | 19 |
| uji.YellohFellah 1.0 | 8 | 4% | 12 |
| stelo.MirrorNano 1.3 | 8 | 4% | 8 |
| KiraNL.Chupacabra 0.4 | 5 | 3% | 5 |
| br2.MobyDickBot 1.6 | 2 | 1% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 1% | 3 |
2 death(s) with no robot to name.

## Melee bench: F12

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 69.1 | 39 / 210 | 3.78 | 14.5% | 25883 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHP 0.2 | 1.8 | 14.5% | 39 |
| bts.wiki.RipCurl 0.9b | 2.0 | 14.8% | 57 |
| darkcanuck.Leon 1.01 | 2.5 | 14.2% | 51 |
| nat.PallasHawk 1.0 | 3.7 | 13.0% | 45 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.3% | 13 |
| jrm.Test0 1.0 | 6.3 | 8.1% | 1 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.2% | 1 |
| jp.Perpy 16.0 | 7.7 | 6.8% | 0 |
| jaybot.bots.Oddball 4.0 | 9.0 | 5.8% | 3 |
| stuff.Vlad 0.1 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 67.3 | 8 / 35 | 4121 |
| 2 | 1 | 61.8 | 68.9 | 9 / 35 | 4247 |
| 3 | 1 | 62.5 | 71.1 | 7 / 35 | 4377 |
| 4 | 3 | 59.2 | 63.2 | 6 / 35 | 3941 |
| 5 | 2 | 61.6 | 67.9 | 5 / 35 | 4602 |
| 6 | 1 | 63.8 | 76.2 | 4 / 35 | 4595 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 33 | 33% |
| bts.wiki.RipCurl 0.9b | 27 | 48% |
| nat.PallasHawk 1.0 | 12 | 58% |
| brainfade.melee.Genghis 0.36 | 8 | 75% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| jrm.Test0 1.0 | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.Leon 1.01 | 54 | 32% | 65 |
| nat.PallasHawk 1.0 | 35 | 20% | 44 |
| bts.wiki.RipCurl 0.9b | 33 | 19% | 46 |
| brainfade.melee.Genghis 0.36 | 21 | 12% | 24 |
| jrm.Test0 1.0 | 12 | 7% | 14 |
| cs.sheldor.Talon 1.1 | 10 | 6% | 10 |
| jp.Perpy 16.0 | 3 | 2% | 3 |
| jaybot.bots.Oddball 4.0 | 2 | 1% | 2 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |

## Melee bench: F13

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.7 | 59.9 | 1 / 210 | 4.61 | 11.8% | 24348 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.3 | 17.9% | 112 |
| ags.Glacier 0.2.11 | 1.7 | 17.5% | 58 |
| shinh.Entangled 0.3 | 3.8 | 12.5% | 18 |
| gh.micro.Gruweltje 0.7 | 4.0 | 12.4% | 20 |
| hadur117.mini.DeiseWHP 0.2 | 4.2 | 11.8% | 1 |
| apc.Colossus2 0.17 | 6.0 | 8.2% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.5% | 1 |
| ayk.WallHugger 1.0 | 8.2 | 5.1% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.5% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.8 | 64.4 | 1 / 35 | 4550 |
| 2 | 5 | 54.1 | 50.2 | 0 / 35 | 3724 |
| 3 | 5 | 56.6 | 56.5 | 0 / 35 | 4050 |
| 4 | 3 | 60.0 | 65.4 | 0 / 35 | 4256 |
| 5 | 5 | 56.8 | 58.7 | 0 / 35 | 3773 |
| 6 | 4 | 59.0 | 64.1 | 0 / 35 | 3995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 9 | 0% |
| ags.Glacier 0.2.11 | 6 | 0% |
| shinh.Entangled 0.3 | 3 | 33% |

Hadur died in 209 of 210 rounds, at a mean tick of 489. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 79 | 38% | 79 |
| mn.Combat 3.25.0 | 60 | 29% | 60 |
| shinh.Entangled 0.3 | 30 | 14% | 32 |
| gh.micro.Gruweltje 0.7 | 16 | 8% | 16 |
| stelo.Wang 1.0 | 10 | 5% | 10 |
| maribo.FollowFire 1 | 6 | 3% | 5 |
| apc.Colossus2 0.17 | 5 | 2% | 5 |
| ayk.WallHugger 1.0 | 3 | 1% | 3 |

## Melee bench: F14

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 83.7 | 89 / 210 | 2.47 | 18.0% | 34357 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHP 0.2 | 1.0 | 18.0% | 89 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.0% | 52 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.7% | 49 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.8 | 9.8% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.2 | 9.6% | 8 |
| Lo_Ian.Gandalf_V4 4.0 | 5.5 | 9.5% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 6.5 | 8.9% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 7.8% | 5 |
| pa.Improved 1.0 | 9.0 | 5.8% | 2 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 85.4 | 21 / 35 | 5913 |
| 2 | 1 | 66.9 | 81.3 | 13 / 35 | 5668 |
| 3 | 1 | 68.1 | 84.1 | 15 / 35 | 5704 |
| 4 | 1 | 68.0 | 85.7 | 12 / 35 | 5895 |
| 5 | 1 | 66.8 | 81.9 | 11 / 35 | 5533 |
| 6 | 1 | 68.1 | 83.5 | 17 / 35 | 5644 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 65 | 74% |
| catcat20.shape.Theta 0.018 | 35 | 40% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 77% |
| sanyi.mikrobi.Roberto 1.0 | 9 | 56% |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 46 | 38% | 61 |
| simonton.micro.Sprout 1.1.3 | 40 | 33% | 82 |
| sanyi.mikrobi.Roberto 1.0 | 11 | 9% | 18 |
| co.edu.usb.rc.LidisTron 1.0 | 6 | 5% | 12 |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 5% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 5% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 4% | 16 |
| pa.Improved 1.0 | 1 | 1% | 3 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

## Melee bench: F15

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 81.4 | 90 / 210 | 2.67 | 18.5% | 36848 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHP 0.2 | 1.0 | 18.5% | 90 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.3% | 15 |
| emp.Yngwie 1.11 | 2.8 | 13.6% | 63 |
| mld.DustBunny 3.8 | 3.5 | 12.8% | 12 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.8% | 12 |
| kawigi.robot.Girl 1.2 | 6.0 | 8.7% | 15 |
| Grystrion.TrackerWO 1.0 | 7.0 | 6.8% | 0 |
| lambdaxy.TBot 0.1 | 8.0 | 6.1% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.0% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 87.6 | 18 / 35 | 6340 |
| 2 | 1 | 66.4 | 75.6 | 11 / 35 | 5985 |
| 3 | 1 | 68.6 | 82.5 | 16 / 35 | 6284 |
| 4 | 1 | 68.3 | 82.2 | 15 / 35 | 5959 |
| 5 | 1 | 69.1 | 82.2 | 15 / 35 | 6430 |
| 6 | 1 | 67.4 | 78.4 | 15 / 35 | 5850 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 40 | 38% |
| kawigi.micro.Shiz 1.1 | 33 | 97% |
| mld.DustBunny 3.8 | 21 | 100% |
| kawigi.robot.Girl 1.2 | 16 | 63% |
| cb.nano.Insomnia 1.0 | 16 | 56% |
| divineomega.TrialBot 0.003 | 3 | 67% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 56 | 47% | 89 |
| cb.nano.Insomnia 1.0 | 18 | 15% | 16 |
| kawigi.robot.Girl 1.2 | 14 | 12% | 22 |
| mld.DustBunny 3.8 | 12 | 10% | 27 |
| kawigi.micro.Shiz 1.1 | 7 | 6% | 23 |
| divineomega.TrialBot 0.003 | 5 | 4% | 15 |
| Grystrion.TrackerWO 1.0 | 5 | 4% | 9 |
| lambdaxy.TBot 0.1 | 2 | 2% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 71.1 | 35 / 210 | 3.60 | 15.7% | 33335 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.0% | 96 |
| hadur117.mini.DeiseWHP 0.2 | 2.0 | 15.7% | 35 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.6% | 10 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 12.0% | 49 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.1% | 7 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 8.9% | 2 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.9% | 3 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 5.1% | 8 |
| asd.Cthulhu 1.3 | 9.0 | 4.9% | 0 |
| repositorio.NanoStep 1.0 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 73.3 | 7 / 35 | 5474 |
| 2 | 2 | 63.3 | 67.6 | 5 / 35 | 5590 |
| 3 | 2 | 63.9 | 68.9 | 7 / 35 | 5574 |
| 4 | 2 | 65.4 | 74.3 | 5 / 35 | 5739 |
| 5 | 2 | 63.3 | 66.7 | 6 / 35 | 5724 |
| 6 | 2 | 65.0 | 75.6 | 5 / 35 | 5234 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 55 | 31% |
| techdude.forest.FlamingForest 1.1 | 18 | 17% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 7 | 86% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |
| bvh.fnr.Fenrir 0.36l | 3 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |
| tvv.nano.Polaris 1.2 | 1 | 100% |
| stelo.IntrinsicVolatility 1.4 | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 93 | 53% | 114 |
| techdude.forest.FlamingForest 1.1 | 32 | 18% | 35 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 21 | 12% | 25 |
| bvh.fnr.Fenrir 0.36l | 14 | 8% | 16 |
| tvv.nano.Polaris 1.2 | 6 | 3% | 8 |
| divineomega.DivineBot 1.9.4.5 | 3 | 2% | 6 |
| stelo.IntrinsicVolatility 1.4 | 3 | 2% | 3 |
| repositorio.NanoStep 1.0 | 3 | 2% | 3 |

## Melee bench: F17

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 60.8 | 19 / 210 | 4.52 | 13.3% | 30203 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.7 | 14.1% | 44 |
| hadur117.mini.DeiseWHP 0.2 | 2.8 | 13.3% | 19 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.3% | 42 |
| cx.BlestPain 1.41 | 3.2 | 13.0% | 53 |
| nic.Nicator 2.4 | 5.0 | 11.3% | 21 |
| ahf.NanoAndrew .4 | 5.5 | 11.4% | 24 |
| maribo.melee.BMV 0.1 | 7.0 | 9.0% | 6 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 6.1% | 2 |
| tex.Longbot 0.4 | 8.7 | 5.7% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 63.5 | 3 / 35 | 5325 |
| 2 | 4 | 58.8 | 59.4 | 2 / 35 | 4834 |
| 3 | 2 | 61.3 | 62.2 | 4 / 35 | 5511 |
| 4 | 2 | 61.9 | 64.8 | 5 / 35 | 5104 |
| 5 | 3 | 58.3 | 58.7 | 3 / 35 | 4676 |
| 6 | 4 | 57.4 | 56.5 | 2 / 35 | 4753 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 20 | 45% |
| nic.Nicator 2.4 | 8 | 75% |
| cx.BlestPain 1.41 | 7 | 29% |
| ahf.NanoAndrew .4 | 6 | 17% |
| oog.melee.Mercutio 1.0 | 6 | 0% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 191 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ahf.NanoAndrew .4 | 40 | 21% | 42 |
| et.Predator 1.8 | 38 | 20% | 45 |
| oog.melee.Mercutio 1.0 | 34 | 18% | 35 |
| cx.BlestPain 1.41 | 33 | 17% | 35 |
| maribo.melee.BMV 0.1 | 21 | 11% | 23 |
| nic.Nicator 2.4 | 18 | 9% | 23 |
| tex.Longbot 0.4 | 4 | 2% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 1% | 2 |
| goblin.Bender 2.4 | 1 | 1% | 1 |

## Melee bench: F18

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 61.2 | 39 / 210 | 4.50 | 13.4% | 27388 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHP 0.2 | 2.0 | 13.4% | 39 |
| agd.Mooserwirt2 2.7 | 2.2 | 13.7% | 46 |
| morbid.MorbidPriest 1.0 | 2.2 | 14.0% | 54 |
| uji.DBH 1.1 | 3.7 | 12.1% | 28 |
| ratosh.Nobo 0.21 | 5.5 | 10.2% | 8 |
| spinnercat.Robovirus 2.718 | 5.5 | 10.2% | 15 |
| sigterm.Sigterm 1.0 | 7.2 | 8.5% | 14 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.5% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.2 | 5.3% | 1 |
| stelo.WangRobot 1.0 | 9.8 | 5.0% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.4 | 55.2 | 6 / 35 | 4386 |
| 2 | 1 | 61.3 | 65.7 | 5 / 35 | 5213 |
| 3 | 4 | 57.5 | 56.2 | 7 / 35 | 4202 |
| 4 | 1 | 60.0 | 61.3 | 8 / 35 | 4730 |
| 5 | 2 | 60.9 | 67.0 | 7 / 35 | 4257 |
| 6 | 1 | 59.2 | 61.6 | 6 / 35 | 4600 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 23 | 65% |
| spinnercat.Robovirus 2.718 | 11 | 64% |
| agd.Mooserwirt2 2.7 | 11 | 45% |
| uji.DBH 1.1 | 9 | 11% |
| sigterm.Sigterm 1.0 | 6 | 83% |
| stelo.WangRobot 1.0 | 3 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 100% |
| ratosh.Nobo 0.21 | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 509. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 40 | 23% | 49 |
| uji.DBH 1.1 | 36 | 21% | 39 |
| morbid.MorbidPriest 1.0 | 31 | 18% | 47 |
| spinnercat.Robovirus 2.718 | 23 | 13% | 26 |
| ratosh.Nobo 0.21 | 14 | 8% | 16 |
| kawigi.mini.Fhqwhgads 1.1 | 12 | 7% | 13 |
| sigterm.Sigterm 1.0 | 8 | 5% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 2% | 5 |
| stelo.WangRobot 1.0 | 3 | 2% | 6 |

## Melee bench: F19

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.8 | 153 / 210 | 1.56 | 21.2% | 38192 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHP 0.2 | 1.0 | 21.2% | 153 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.0% | 20 |
| mld.Infinity 2.2 | 2.7 | 13.1% | 24 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.1% | 3 |
| erdnis.Rover 0.3 | 5.0 | 10.5% | 4 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.4% | 2 |
| pac.ABC 2.1 | 7.5 | 7.3% | 4 |
| mbh.Mbh 0.1 | 7.7 | 7.2% | 1 |
| pbg.R2D2 1.0 | 8.7 | 6.0% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 95.6 | 27 / 35 | 6358 |
| 2 | 1 | 72.8 | 96.2 | 28 / 35 | 6443 |
| 3 | 1 | 73.2 | 98.1 | 30 / 35 | 6538 |
| 4 | 1 | 71.9 | 93.7 | 24 / 35 | 6252 |
| 5 | 1 | 71.6 | 91.4 | 23 / 35 | 6643 |
| 6 | 1 | 69.9 | 87.6 | 21 / 35 | 5958 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 86 | 93% |
| mld.Infinity 2.2 | 30 | 57% |
| krillr.mini.JointStrike 2.0.0 | 26 | 96% |
| patson.PatsonTestBot 1.0 | 13 | 85% |
| erdnis.Rover 0.3 | 11 | 64% |
| pac.ABC 2.1 | 9 | 67% |
| pbg.R2D2 1.0 | 6 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 1131. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 19 | 33% | 48 |
| davidalves.net.DuelistMiniMelee 1.2 | 14 | 24% | 75 |
| erdnis.Rover 0.3 | 11 | 19% | 27 |
| patson.PatsonTestBot 1.0 | 6 | 10% | 19 |
| pac.ABC 2.1 | 3 | 5% | 14 |
| krillr.mini.JointStrike 2.0.0 | 3 | 5% | 12 |
| mbh.Mbh 0.1 | 1 | 2% | 6 |
| pbg.R2D2 1.0 | 0 | 0% | 6 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 79.7 | 64 / 210 | 2.82 | 18.0% | 37890 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHP 0.2 | 1.2 | 18.0% | 64 |
| trm.Wrekt 1.1.6.f | 1.8 | 16.5% | 79 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 10.7% | 7 |
| catcat20.Rabbit 0.001 | 3.8 | 10.7% | 31 |
| fwb.Nine 1.0.1 | 4.5 | 10.2% | 14 |
| bayen.nut.Squirrel 1.615 | 6.8 | 8.0% | 12 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 7.7% | 1 |
| m3thos.mini.Eva01 0.5.5 | 7.2 | 8.0% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 6.1% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 84.1 | 13 / 35 | 6850 |
| 2 | 1 | 68.9 | 82.9 | 12 / 35 | 6632 |
| 3 | 1 | 68.8 | 82.9 | 11 / 35 | 6683 |
| 4 | 1 | 66.0 | 77.1 | 7 / 35 | 6116 |
| 5 | 2 | 63.6 | 68.6 | 8 / 35 | 5526 |
| 6 | 1 | 67.6 | 82.9 | 13 / 35 | 6083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 68 | 34% |
| catcat20.Rabbit 0.001 | 20 | 60% |
| nz.jdc.nano.GridFu 1.0 | 16 | 81% |
| fwb.Nine 1.0.1 | 14 | 43% |
| bayen.nut.Squirrel 1.615 | 6 | 67% |
| ntc.ControlledChaos 1.1.4 | 2 | 50% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 79 | 53% | 98 |
| catcat20.Rabbit 0.001 | 21 | 14% | 37 |
| fwb.Nine 1.0.1 | 14 | 9% | 14 |
| nz.jdc.nano.GridFu 1.0 | 10 | 7% | 22 |
| m3thos.mini.Eva01 0.5.5 | 7 | 5% | 13 |
| bayen.nut.Squirrel 1.615 | 7 | 5% | 11 |
| djdjdj.NanoSkunk10 1.0 | 6 | 4% | 9 |
| ntc.ControlledChaos 1.1.4 | 2 | 1% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 1% | 2 |

## Melee bench: F21

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 86.4 | 98 / 210 | 2.22 | 19.5% | 38435 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHP 0.2 | 1.0 | 19.5% | 98 |
| eem.EvBot v4.6.16 | 2.0 | 16.6% | 84 |
| dummy.mini.Scimitar 1.01 | 3.2 | 13.3% | 9 |
| cf.RiO.RiOx 4.2.1 | 3.8 | 11.8% | 11 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.2% | 0 |
| eld.Hmm 1.0 | 5.7 | 8.7% | 11 |
| fire219.CatBot 1.0 | 7.2 | 6.7% | 0 |
| el.JumpShoot 0.2 | 7.8 | 5.9% | 0 |
| PSW.Relentless 0.1 | 9.2 | 4.8% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 85.4 | 14 / 35 | 6200 |
| 2 | 1 | 69.1 | 83.8 | 18 / 35 | 6083 |
| 3 | 1 | 69.9 | 87.0 | 15 / 35 | 6730 |
| 4 | 1 | 69.2 | 85.1 | 14 / 35 | 6207 |
| 5 | 1 | 70.8 | 87.0 | 18 / 35 | 6836 |
| 6 | 1 | 70.7 | 90.2 | 19 / 35 | 6379 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 86 | 57% |
| dummy.mini.Scimitar 1.01 | 22 | 100% |
| cf.RiO.RiOx 4.2.1 | 20 | 85% |
| eld.Hmm 1.0 | 11 | 64% |
| el.JumpShoot 0.2 | 2 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 981. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 72 | 64% | 114 |
| dummy.mini.Scimitar 1.01 | 18 | 16% | 45 |
| cf.RiO.RiOx 4.2.1 | 11 | 10% | 19 |
| eld.Hmm 1.0 | 7 | 6% | 25 |
| oa.weak.BotherBot 0.1 | 3 | 3% | 3 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |
| el.JumpShoot 0.2 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 71.3 | 25 / 210 | 3.59 | 15.2% | 32281 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxDT 2.71m | 1.0 | 19.0% | 112 |
| hadur117.mini.DeiseWHP 0.2 | 2.5 | 15.2% | 25 |
| kvk.HebusLeTroll 0.35 | 2.5 | 15.2% | 40 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.4% | 21 |
| bigpete.Stewie 1.0 | 5.0 | 10.9% | 12 |
| yk.JahRoslav 1.1 | 6.2 | 6.8% | 0 |
| tad.Dalek98 0.98 | 7.5 | 6.2% | 0 |
| gg.Squaraus 0.6 | 7.5 | 6.3% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 5.0% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 72.1 | 4 / 35 | 5446 |
| 2 | 2 | 64.3 | 71.4 | 3 / 35 | 5449 |
| 3 | 3 | 63.4 | 71.1 | 4 / 35 | 5097 |
| 4 | 3 | 63.1 | 68.9 | 3 / 35 | 5323 |
| 5 | 3 | 64.0 | 69.8 | 4 / 35 | 5274 |
| 6 | 2 | 65.5 | 74.3 | 7 / 35 | 5692 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 20 | 60% |
| pe.SandboxDT 2.71m | 19 | 5% |
| jlm.javaDisturbance 0.59 | 13 | 31% |
| bigpete.Stewie 1.0 | 4 | 50% |
| yk.JahRoslav 1.1 | 3 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |
| gg.Squaraus 0.6 | 1 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 185 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 96 | 52% | 104 |
| kvk.HebusLeTroll 0.35 | 48 | 26% | 55 |
| jlm.javaDisturbance 0.59 | 26 | 14% | 32 |
| bigpete.Stewie 1.0 | 11 | 6% | 14 |
| yk.JahRoslav 1.1 | 2 | 1% | 3 |
| pbg.NinjaX 1.2 | 1 | 1% | 1 |
| tad.Dalek98 0.98 | 1 | 1% | 1 |

## Melee bench: F23

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 79.6 | 45 / 210 | 2.83 | 16.8% | 32931 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.3 | 19.1% | 110 |
| hadur117.mini.DeiseWHP 0.2 | 1.8 | 16.8% | 45 |
| cre.Karolos 0.32 | 2.8 | 15.3% | 42 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.5% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.7 | 9.0% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.7 | 9.1% | 8 |
| cw.megas.Blade 0.8 | 7.3 | 7.6% | 0 |
| sample.Walls 1.0 | 7.3 | 7.9% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.0% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.3 | 82.5 | 7 / 35 | 5775 |
| 2 | 2 | 66.0 | 78.1 | 5 / 35 | 5139 |
| 3 | 2 | 67.1 | 77.8 | 8 / 35 | 5535 |
| 4 | 2 | 67.2 | 80.6 | 6 / 35 | 5636 |
| 5 | 1 | 68.2 | 82.9 | 11 / 35 | 5769 |
| 6 | 2 | 65.3 | 75.9 | 8 / 35 | 5077 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 68 | 13% |
| cre.Karolos 0.32 | 19 | 47% |
| stelo.AreaTargetingBot 1.1 | 12 | 92% |
| stelo.RamTrackSurfer 1.2 | 8 | 38% |
| sample.Walls 1.0 | 7 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 98 | 59% | 113 |
| cre.Karolos 0.32 | 39 | 24% | 48 |
| stelo.AreaTargetingBot 1.1 | 13 | 8% | 23 |
| stelo.RamTrackSurfer 1.2 | 6 | 4% | 11 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 3% | 6 |
| sample.Walls 1.0 | 2 | 1% | 5 |
| cw.megas.Blade 0.8 | 1 | 1% | 3 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F24

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 60.7 | 25 / 210 | 4.54 | 12.8% | 25337 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.5 | 14.5% | 60 |
| florent.XSeries.X2 0.12 | 2.7 | 13.1% | 43 |
| hadur117.mini.DeiseWHP 0.2 | 3.2 | 12.8% | 25 |
| davidalves.Phoenix 0.54 | 3.5 | 12.5% | 36 |
| pedersen.Ugluk 1.1.1 | 4.3 | 11.4% | 18 |
| oog.melee.Corsair 1.0 | 5.8 | 10.5% | 14 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 8.5% | 11 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.6% | 2 |
| as.FrankTheTank 1.3 | 9.0 | 5.5% | 1 |
| evd.X1 0.01 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.8 | 65.1 | 5 / 35 | 4278 |
| 2 | 4 | 57.5 | 59.0 | 5 / 35 | 3899 |
| 3 | 3 | 59.0 | 62.2 | 2 / 35 | 4429 |
| 4 | 2 | 59.1 | 61.6 | 5 / 35 | 4388 |
| 5 | 4 | 58.9 | 61.6 | 5 / 35 | 4433 |
| 6 | 4 | 55.7 | 54.6 | 3 / 35 | 3910 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 12 | 33% |
| stelo.SoJNanoMelee 1.1 | 11 | 64% |
| rz.GlowBlowMelee 1.4 | 11 | 36% |
| davidalves.Phoenix 0.54 | 8 | 50% |
| pedersen.Ugluk 1.1.1 | 8 | 38% |
| lunchie.Lunchbox 0.93 | 2 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |
| oog.melee.Corsair 1.0 | 1 | 0% |

Hadur died in 185 of 210 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 47 | 25% | 51 |
| rz.GlowBlowMelee 1.4 | 34 | 18% | 41 |
| oog.melee.Corsair 1.0 | 30 | 16% | 32 |
| davidalves.Phoenix 0.54 | 29 | 16% | 33 |
| pedersen.Ugluk 1.1.1 | 14 | 8% | 16 |
| lunchie.Lunchbox 0.93 | 11 | 6% | 15 |
| as.FrankTheTank 1.3 | 9 | 5% | 10 |
| stelo.SoJNanoMelee 1.1 | 8 | 4% | 9 |
| evd.X1 0.01 | 3 | 2% | 3 |

## Melee bench: F25

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 79.3 | 100 / 210 | 2.87 | 17.4% | 28568 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHP 0.2 | 1.0 | 17.4% | 100 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.4% | 29 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.6% | 18 |
| jdw.Hurricane 1.4 | 3.8 | 11.5% | 22 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.9% | 15 |
| ds.Oo 2.2 | 5.5 | 9.5% | 17 |
| gjr.Cephalosporin 0.1 | 7.2 | 7.4% | 4 |
| awesomeness.Elite 1.0 | 8.2 | 7.0% | 4 |
| adt.Ar2 1.1 | 8.7 | 6.5% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 82.9 | 19 / 35 | 5172 |
| 2 | 1 | 63.4 | 73.7 | 11 / 35 | 4318 |
| 3 | 1 | 68.0 | 83.5 | 19 / 35 | 5130 |
| 4 | 1 | 68.2 | 86.7 | 20 / 35 | 4745 |
| 5 | 1 | 65.6 | 76.2 | 17 / 35 | 4733 |
| 6 | 1 | 64.2 | 72.7 | 14 / 35 | 4470 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 43 | 79% |
| jdw.Hurricane 1.4 | 30 | 87% |
| voidious.micro.BlitzBat 1.05 | 20 | 80% |
| gre.svman4.Morfeas 1.4.1 | 14 | 64% |
| adt.Ar2 1.1 | 8 | 88% |
| ds.Oo 2.2 | 7 | 57% |
| gjr.Cephalosporin 0.1 | 3 | 100% |
| awesomeness.Elite 1.0 | 2 | 0% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 573. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 27 | 25% | 63 |
| jdw.Hurricane 1.4 | 25 | 23% | 47 |
| voidious.micro.BlitzBat 1.05 | 18 | 16% | 27 |
| gre.svman4.Morfeas 1.4.1 | 13 | 12% | 22 |
| awesomeness.Elite 1.0 | 11 | 10% | 12 |
| ds.Oo 2.2 | 9 | 8% | 17 |
| amk.ChumbaMini 0.2 | 4 | 4% | 4 |
| adt.Ar2 1.1 | 3 | 3% | 15 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 3 |

## Melee bench: F26

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 72.8 | 41 / 210 | 3.45 | 15.9% | 35723 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.2 | 17.3% | 100 |
| hadur117.mini.DeiseWHP 0.2 | 1.8 | 15.9% | 41 |
| lrem.Spectre 0.4.4 | 3.7 | 12.2% | 20 |
| shu.nitro.LENIN .T34 | 4.0 | 11.7% | 26 |
| js.PinBall 1.6 | 4.3 | 11.4% | 12 |
| gh.mini.GrubbmOne 1.0 | 6.2 | 9.9% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 7.0 | 8.7% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.7% | 2 |
| sample.SpinBot 1.0 | 9.0 | 4.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 75.6 | 9 / 35 | 6001 |
| 2 | 2 | 64.9 | 71.1 | 7 / 35 | 5939 |
| 3 | 2 | 63.8 | 67.6 | 5 / 35 | 5915 |
| 4 | 1 | 65.9 | 74.9 | 9 / 35 | 6143 |
| 5 | 2 | 63.6 | 70.5 | 6 / 35 | 5462 |
| 6 | 2 | 66.5 | 76.8 | 5 / 35 | 6263 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 30 | 17% |
| lrem.Spectre 0.4.4 | 16 | 88% |
| shu.nitro.LENIN .T34 | 14 | 71% |
| js.PinBall 1.6 | 7 | 71% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 33% |
| gh.mini.GrubbmOne 1.0 | 5 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 0% |

Hadur died in 169 of 210 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 82 | 49% | 89 |
| shu.nitro.LENIN .T34 | 21 | 12% | 31 |
| jaybot.adv.bots.JayBot 2.0 | 18 | 11% | 20 |
| js.PinBall 1.6 | 17 | 10% | 23 |
| lrem.Spectre 0.4.4 | 13 | 8% | 23 |
| gh.mini.GrubbmOne 1.0 | 9 | 5% | 15 |
| fullsail.LaxativeTeaTwo 1.0 | 8 | 5% | 8 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |

## Melee bench: F27

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 77.2 | 58 / 210 | 3.05 | 16.1% | 28431 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.2 | 16.4% | 103 |
| hadur117.mini.DeiseWHP 0.2 | 1.8 | 16.1% | 58 |
| wee.Gem 1.8.4 | 3.7 | 11.1% | 23 |
| sheldor.melee.nano.TestMelee 0.1 | 4.5 | 10.4% | 14 |
| EH.Eagle 1.0.6 | 4.8 | 10.1% | 9 |
| joe.ADinosaur 1.0 | 6.7 | 8.6% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 7.0 | 8.1% | 2 |
| throxbot.ThroxBot 0.1 | 7.3 | 8.0% | 1 |
| caimano.Furia_Ceca 0.22 | 9.0 | 5.4% | 0 |
| cs.Grudge 1.0 | 9.0 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 74.3 | 8 / 35 | 4940 |
| 2 | 1 | 67.2 | 84.8 | 18 / 35 | 4840 |
| 3 | 2 | 63.2 | 74.3 | 12 / 35 | 4389 |
| 4 | 2 | 64.1 | 75.6 | 6 / 35 | 5059 |
| 5 | 2 | 62.3 | 72.1 | 8 / 35 | 4243 |
| 6 | 2 | 65.1 | 82.2 | 6 / 35 | 4960 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 63 | 21% |
| EH.Eagle 1.0.6 | 17 | 94% |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 67% |
| wee.Gem 1.8.4 | 9 | 44% |
| throxbot.ThroxBot 0.1 | 7 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 4 | 100% |
| joe.ADinosaur 1.0 | 3 | 67% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 83 | 55% | 101 |
| wee.Gem 1.8.4 | 20 | 13% | 30 |
| joe.ADinosaur 1.0 | 15 | 10% | 16 |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 7% | 21 |
| EH.Eagle 1.0.6 | 10 | 7% | 19 |
| throxbot.ThroxBot 0.1 | 7 | 5% | 10 |
| caimano.Furia_Ceca 0.22 | 4 | 3% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 1% | 7 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F28

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 79.6 | 58 / 210 | 2.84 | 16.5% | 28593 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHP 0.2 | 1.0 | 16.5% | 58 |
| kid.test.NightFox .2 | 2.5 | 14.0% | 34 |
| uji.Antique 1.0 | 2.7 | 13.6% | 67 |
| qohnil.blot.BlotBot 3.61 | 3.8 | 12.1% | 21 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 10.2% | 10 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.4% | 11 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.0% | 7 |
| matt.advanced.Katana 1.0 | 8.3 | 6.3% | 2 |
| stelo.PianistNano 1.2 | 9.0 | 5.6% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 76.5 | 6 / 35 | 4950 |
| 2 | 1 | 63.8 | 75.6 | 6 / 35 | 4773 |
| 3 | 1 | 66.1 | 83.2 | 12 / 35 | 4914 |
| 4 | 1 | 66.0 | 82.5 | 11 / 35 | 4969 |
| 5 | 1 | 65.0 | 79.7 | 10 / 35 | 4532 |
| 6 | 1 | 64.9 | 80.0 | 13 / 35 | 4455 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 37 | 86% |
| uji.Antique 1.0 | 35 | 23% |
| qohnil.blot.BlotBot 3.61 | 17 | 29% |
| ahr.ice.Ice 1.0.2 | 10 | 40% |
| pfvicm.Sobieski 7.2.3b | 8 | 75% |
| amk.ChumbaWumba 0.3 | 4 | 75% |
| matt.advanced.Katana 1.0 | 1 | 0% |

Hadur died in 153 of 210 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 59 | 39% | 76 |
| qohnil.blot.BlotBot 3.61 | 26 | 17% | 37 |
| kid.test.NightFox .2 | 22 | 14% | 28 |
| pfvicm.Sobieski 7.2.3b | 21 | 14% | 28 |
| ahr.ice.Ice 1.0.2 | 13 | 8% | 21 |
| amk.ChumbaWumba 0.3 | 7 | 5% | 7 |
| matt.advanced.Katana 1.0 | 3 | 2% | 7 |
| stelo.PianistNano 1.2 | 1 | 1% | 5 |
| stelo.Lifestealer 1.0 | 1 | 1% | 1 |

## Melee bench: F29

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 68.8 | 32 / 210 | 3.80 | 15.0% | 29628 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.3 | 16.4% | 88 |
| hadur117.mini.DeiseWHP 0.2 | 2.3 | 15.0% | 32 |
| deewiant.Anomaly 0.2 | 2.5 | 15.0% | 63 |
| myl.micro.Troodon 1.10 | 4.0 | 11.6% | 6 |
| jok.PheonixM 0.1.2 | 5.2 | 10.5% | 12 |
| ph.melee.ArcherME 0.3 | 5.7 | 9.2% | 2 |
| DBall.Anarchy 0.1 | 7.3 | 6.6% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 7.7 | 6.2% | 0 |
| ap.Frederick 1.1 | 9.3 | 5.1% | 2 |
| jangs.ns51 1.0 | 9.7 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 71.4 | 6 / 35 | 4890 |
| 2 | 3 | 62.5 | 66.3 | 6 / 35 | 4801 |
| 3 | 1 | 65.4 | 75.6 | 8 / 35 | 5424 |
| 4 | 2 | 63.7 | 69.5 | 4 / 35 | 5258 |
| 5 | 3 | 59.7 | 61.0 | 3 / 35 | 4296 |
| 6 | 3 | 63.2 | 69.2 | 5 / 35 | 4959 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 34 | 21% |
| zyx.mega.YersiniaPestis 3.1 | 31 | 16% |
| myl.micro.Troodon 1.10 | 10 | 100% |
| jok.PheonixM 0.1.2 | 7 | 100% |
| ap.Frederick 1.1 | 2 | 50% |
| ph.melee.ArcherME 0.3 | 2 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 70 | 39% | 80 |
| zyx.mega.YersiniaPestis 3.1 | 69 | 38% | 80 |
| myl.micro.Troodon 1.10 | 14 | 8% | 17 |
| jok.PheonixM 0.1.2 | 11 | 6% | 16 |
| ph.melee.ArcherME 0.3 | 10 | 6% | 10 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 1% | 3 |
| DBall.Anarchy 0.1 | 2 | 1% | 3 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F30

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 52.1 | 47.6 | 5 / 210 | 5.71 | 10.0% | 21069 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.0 | 14.6% | 62 |
| darkcanuck.B26354 1.06 | 2.3 | 13.8% | 58 |
| stelo.PastFuture 2.3.2 | 2.5 | 13.7% | 36 |
| oog.melee.Capulet 1.2 | 3.2 | 13.2% | 31 |
| intruder.PrairieWolf 2.61 | 5.5 | 9.5% | 11 |
| hadur117.mini.DeiseWHP 0.2 | 5.5 | 10.0% | 5 |
| tripphippy.Alice 1.1 | 7.7 | 7.6% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.6% | 5 |
| ntc.Opposite 1.5 | 8.5 | 7.3% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 49.9 | 43.2 | 2 / 35 | 3189 |
| 2 | 6 | 52.1 | 48.9 | 0 / 35 | 3499 |
| 3 | 6 | 49.5 | 41.0 | 1 / 35 | 3353 |
| 4 | 5 | 54.0 | 50.5 | 2 / 35 | 3734 |
| 5 | 5 | 54.6 | 54.0 | 0 / 35 | 3729 |
| 6 | 5 | 52.2 | 48.3 | 0 / 35 | 3565 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 8 | 13% |
| catcat20.Matcha 0.006 | 6 | 17% |
| stelo.PastFuture 2.3.2 | 2 | 0% |
| oog.melee.Capulet 1.2 | 1 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |
| intruder.PrairieWolf 2.61 | 1 | 100% |

Hadur died in 205 of 210 rounds, at a mean tick of 484. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 43 | 21% | 44 |
| darkcanuck.B26354 1.06 | 42 | 20% | 42 |
| oog.melee.Capulet 1.2 | 36 | 18% | 37 |
| catcat20.Matcha 0.006 | 29 | 14% | 30 |
| intruder.PrairieWolf 2.61 | 23 | 11% | 24 |
| tripphippy.Alice 1.1 | 19 | 9% | 19 |
| ntc.Opposite 1.5 | 9 | 4% | 9 |
| fowl3628800.LightningBolt 2.6.0 | 4 | 2% | 5 |

## Melee bench: F31

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.4 | 54.8 | 5 / 210 | 5.07 | 11.3% | 22191 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.9% | 111 |
| gh.mini.Griezel 0.2 | 1.8 | 14.6% | 57 |
| d414.nano.Quantum 1.0.0 | 3.2 | 11.9% | 11 |
| hadur117.mini.DeiseWHP 0.2 | 4.0 | 11.3% | 5 |
| spinnercat.micro.Tyger 0.1 | 5.2 | 10.7% | 11 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.5% | 10 |
| timmit.nano.TimDog 0.33 | 7.0 | 7.5% | 5 |
| fm.mammillarias 1.3 | 7.8 | 6.4% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.5% | 1 |
| tlp.ThreeLeggedPig 1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.3 | 61.3 | 1 / 35 | 4075 |
| 2 | 4 | 57.5 | 58.1 | 1 / 35 | 3969 |
| 3 | 4 | 53.2 | 50.2 | 2 / 35 | 3413 |
| 4 | 4 | 54.5 | 52.4 | 0 / 35 | 3804 |
| 5 | 4 | 54.0 | 53.0 | 0 / 35 | 3315 |
| 6 | 5 | 55.1 | 53.7 | 1 / 35 | 3615 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.mini.Griezel 0.2 | 10 | 10% |
| abc.Shadow 3.84i | 10 | 10% |
| spinnercat.micro.Tyger 0.1 | 3 | 33% |
| d414.nano.Quantum 1.0.0 | 2 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 0% |

Hadur died in 205 of 210 rounds, at a mean tick of 554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 64 | 31% | 66 |
| gh.mini.Griezel 0.2 | 54 | 26% | 56 |
| d414.nano.Quantum 1.0.0 | 22 | 11% | 22 |
| timmit.nano.TimDog 0.33 | 18 | 9% | 18 |
| gh.nano.Grofvuil 0.2 | 17 | 8% | 17 |
| spinnercat.micro.Tyger 0.1 | 14 | 7% | 15 |
| Gecko.ultimateGeckoBot 1.0 | 6 | 3% | 6 |
| fm.mammillarias 1.3 | 6 | 3% | 6 |
| tlp.ThreeLeggedPig 1 | 4 | 2% | 4 |

## Melee bench: F32

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 72.5 | 53 / 210 | 3.48 | 15.1% | 27695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHP 0.2 | 1.3 | 15.1% | 53 |
| kawigi.sbf.FloodHT 0.9.2 | 1.8 | 14.6% | 67 |
| apc.botM 3.0 | 2.8 | 12.9% | 46 |
| vjik.UnViolation 1.1 | 4.7 | 11.0% | 16 |
| lxx.ConceptA 0.8 | 5.0 | 10.5% | 5 |
| bayen.UbaMicro 1.4 | 5.3 | 10.2% | 11 |
| panzer.Panzer 0.2 | 7.3 | 7.6% | 1 |
| conscience.Electron 1.3g | 8.5 | 6.8% | 3 |
| yk.JahMicro 1.0 | 8.7 | 6.2% | 4 |
| donjezza.Jezza 1.0 | 9.5 | 5.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 74.0 | 8 / 35 | 4470 |
| 2 | 1 | 63.1 | 71.7 | 12 / 35 | 4557 |
| 3 | 2 | 59.8 | 65.7 | 8 / 35 | 4332 |
| 4 | 1 | 64.3 | 77.1 | 11 / 35 | 4760 |
| 5 | 1 | 63.2 | 74.6 | 7 / 35 | 4900 |
| 6 | 1 | 61.9 | 71.7 | 7 / 35 | 4676 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 44 | 45% |
| apc.botM 3.0 | 19 | 32% |
| lxx.ConceptA 0.8 | 10 | 90% |
| vjik.UnViolation 1.1 | 10 | 70% |
| yk.JahMicro 1.0 | 8 | 75% |
| bayen.UbaMicro 1.4 | 3 | 33% |
| donjezza.Jezza 1.0 | 2 | 50% |
| conscience.Electron 1.3g | 2 | 50% |
| panzer.Panzer 0.2 | 2 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 51 | 32% | 67 |
| apc.botM 3.0 | 48 | 30% | 54 |
| bayen.UbaMicro 1.4 | 19 | 12% | 23 |
| lxx.ConceptA 0.8 | 16 | 10% | 20 |
| conscience.Electron 1.3g | 8 | 5% | 9 |
| vjik.UnViolation 1.1 | 7 | 4% | 18 |
| yk.JahMicro 1.0 | 5 | 3% | 10 |
| panzer.Panzer 0.2 | 4 | 3% | 6 |
| donjezza.Jezza 1.0 | 2 | 1% | 3 |

## Melee bench: F33

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 63.8 | 21 / 210 | 4.26 | 13.7% | 27854 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.0% | 78 |
| hadur117.mini.DeiseWHP 0.2 | 3.0 | 13.7% | 21 |
| labg.Cataclysm 2.05 | 3.5 | 12.6% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.5% | 23 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 12.0% | 34 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 9.0% | 11 |
| baal.nano.N 1.42 | 6.5 | 8.9% | 3 |
| zyx.micro.Ant 1.1 | 8.2 | 5.4% | 1 |
| sanja.First 0.1 | 9.0 | 4.7% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 64.8 | 6 / 35 | 4766 |
| 2 | 2 | 62.4 | 68.6 | 4 / 35 | 4826 |
| 3 | 2 | 63.7 | 71.4 | 1 / 35 | 4960 |
| 4 | 5 | 57.8 | 56.2 | 3 / 35 | 4103 |
| 5 | 4 | 57.6 | 57.8 | 2 / 35 | 4218 |
| 6 | 3 | 61.5 | 63.8 | 5 / 35 | 4981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 26 | 31% |
| gre.svman4.Leonidas 1.3.2 | 12 | 25% |
| labg.Cataclysm 2.05 | 8 | 13% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 7 | 43% |
| baal.nano.N 1.42 | 5 | 80% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 50% |

Hadur died in 190 of 210 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 62 | 33% | 69 |
| labg.Cataclysm 2.05 | 40 | 21% | 41 |
| gre.svman4.Leonidas 1.3.2 | 32 | 17% | 34 |
| kinsen.melee.Angsaichmophobia 1.8c | 19 | 10% | 21 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 9% | 18 |
| baal.nano.N 1.42 | 10 | 5% | 16 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 4 | 2% | 4 |
| sanja.First 0.1 | 3 | 2% | 4 |
| zyx.micro.Ant 1.1 | 2 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F34

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 61.2 | 10 / 210 | 4.50 | 12.6% | 26479 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.3 | 17.8% | 74 |
| stelo.Spread 0.9 | 1.7 | 17.4% | 92 |
| hadur117.mini.DeiseWHP 0.2 | 3.3 | 12.6% | 10 |
| tcf.Reach 3 | 4.2 | 11.7% | 10 |
| jcs.Seth 1.8 | 5.0 | 11.0% | 19 |
| cli.Dancer 1.1 | 5.5 | 10.4% | 5 |
| ratosh.Wesco 1.4 | 7.0 | 7.2% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.9% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 4.0% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 61.3 | 1 / 35 | 4850 |
| 2 | 3 | 59.6 | 61.3 | 1 / 35 | 4408 |
| 3 | 5 | 57.5 | 55.2 | 3 / 35 | 3995 |
| 4 | 3 | 59.8 | 61.3 | 1 / 35 | 4474 |
| 5 | 3 | 61.4 | 66.3 | 2 / 35 | 4540 |
| 6 | 3 | 59.3 | 61.6 | 2 / 35 | 4212 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 16 | 6% |
| kid.Gladiator .7.2 | 13 | 38% |
| jcs.Seth 1.8 | 4 | 50% |
| tcf.Reach 3 | 3 | 0% |
| cli.Dancer 1.1 | 2 | 50% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 200 of 210 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 62 | 31% | 65 |
| stelo.Spread 0.9 | 61 | 31% | 63 |
| tcf.Reach 3 | 34 | 17% | 35 |
| cli.Dancer 1.1 | 20 | 10% | 21 |
| jcs.Seth 1.8 | 13 | 7% | 16 |
| ratosh.Wesco 1.4 | 4 | 2% | 4 |
| sample.VelociRobot 1.0 | 2 | 1% | 2 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
| sample.RamFire 1.0 | 2 | 1% | 2 |

## Melee bench: F35

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 62.3 | 6 / 210 | 4.39 | 12.4% | 23419 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.2% | 165 |
| gh.mini.Gruwel 0.9 | 2.5 | 13.7% | 20 |
| hadur117.mini.DeiseWHP 0.2 | 3.2 | 12.4% | 6 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.5 | 12.4% | 14 |
| rz.HawkOnFire 0.1 | 4.8 | 11.0% | 5 |
| wit.Chuliath 1.0 | 6.5 | 7.3% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.0 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 6.4% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.7% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.2 | 62.2 | 1 / 35 | 3832 |
| 2 | 4 | 56.7 | 58.1 | 0 / 35 | 3633 |
| 3 | 4 | 58.0 | 60.3 | 1 / 35 | 3855 |
| 4 | 3 | 60.0 | 64.4 | 3 / 35 | 4105 |
| 5 | 3 | 59.4 | 65.1 | 1 / 35 | 3918 |
| 6 | 2 | 59.1 | 63.8 | 0 / 35 | 4076 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 23 | 0% |
| gh.mini.Gruwel 0.9 | 6 | 50% |
| rz.HawkOnFire 0.1 | 3 | 67% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 1 | 0% |

Hadur died in 204 of 210 rounds, at a mean tick of 520. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 91 | 45% | 90 |
| dmh.robocode.robot.BlackDeath 9.2 | 46 | 23% | 47 |
| gh.mini.Gruwel 0.9 | 27 | 13% | 31 |
| rz.HawkOnFire 0.1 | 14 | 7% | 16 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 11 | 5% | 12 |
| wit.Chuliath 1.0 | 7 | 3% | 7 |
| myl.nano.KomoriNinja 1.1 | 4 | 2% | 4 |
| stelo.MyAgileRobot 0.2 | 3 | 1% | 3 |
| dans.Cinnamon 1.2 | 1 | 0% | 0 |

## Melee bench: F36

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 84.8 | 112 / 210 | 2.37 | 19.3% | 35802 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHP 0.2 | 1.0 | 19.3% | 112 |
| alpha.RainingFire 1.0 | 2.2 | 13.2% | 38 |
| bzdp.Pansy 2.1 | 3.8 | 11.2% | 19 |
| mz.Cork 0.1 | 4.0 | 11.3% | 20 |
| bvh.micro.Freya 0.3 | 4.3 | 10.5% | 12 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.5% | 3 |
| bvh.mini.Fenrir 0.39 | 6.7 | 8.7% | 1 |
| dl.BetterWalls 1.0 | 8.3 | 6.3% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 6.0% | 1 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 86.7 | 20 / 35 | 6200 |
| 2 | 1 | 69.3 | 86.3 | 19 / 35 | 5824 |
| 3 | 1 | 70.1 | 86.0 | 21 / 35 | 6499 |
| 4 | 1 | 68.7 | 84.1 | 19 / 35 | 5516 |
| 5 | 1 | 67.5 | 81.3 | 14 / 35 | 5709 |
| 6 | 1 | 68.6 | 84.4 | 19 / 35 | 6054 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 34 | 79% |
| mz.Cork 0.1 | 28 | 71% |
| alpha.RainingFire 1.0 | 27 | 59% |
| bvh.micro.Freya 0.3 | 22 | 73% |
| m3thos.Eva02 0.7.1 | 16 | 100% |
| bvh.mini.Fenrir 0.39 | 10 | 100% |
| dl.BetterWalls 1.0 | 5 | 60% |
| sample.MyFirstRobot 1.0 | 4 | 75% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 28 | 28% | 45 |
| mz.Cork 0.1 | 20 | 20% | 48 |
| bvh.micro.Freya 0.3 | 20 | 20% | 34 |
| bzdp.Pansy 2.1 | 12 | 12% | 31 |
| dl.BetterWalls 1.0 | 6 | 6% | 14 |
| squidM.TentalceMeleeNano 1.1 | 5 | 5% | 6 |
| bvh.mini.Fenrir 0.39 | 4 | 4% | 11 |
| sample.MyFirstRobot 1.0 | 2 | 2% | 4 |
| m3thos.Eva02 0.7.1 | 1 | 1% | 17 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 81.2 | 110 / 210 | 2.69 | 17.6% | 33877 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHP 0.2 | 1.0 | 17.6% | 110 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.3 | 10.6% | 11 |
| agrach.Dalek 1.0 | 3.5 | 10.3% | 34 |
| germ.TheMind .2 | 3.7 | 10.6% | 10 |
| EBBU.Sim2 1.02 | 5.5 | 9.4% | 8 |
| stelo.UntouchableNano 1.3 | 5.8 | 9.2% | 18 |
| mb.Beast 0.1 | 7.5 | 8.5% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 7.5 | 8.5% | 1 |
| lmk.ACPFinal 0.1 | 8.3 | 7.7% | 7 |
| skm.Ryubot 1.0 | 8.8 | 7.7% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 85.7 | 19 / 35 | 5750 |
| 2 | 1 | 65.9 | 82.2 | 19 / 35 | 5492 |
| 3 | 1 | 65.7 | 80.0 | 18 / 35 | 5795 |
| 4 | 1 | 66.7 | 83.5 | 18 / 35 | 5838 |
| 5 | 1 | 65.6 | 79.0 | 21 / 35 | 5456 |
| 6 | 1 | 64.5 | 76.8 | 15 / 35 | 5546 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 27 | 37% |
| germ.TheMind .2 | 22 | 95% |
| com.syncleus.robocode.Dreadnaught 0.1 | 21 | 76% |
| mb.Beast 0.1 | 21 | 86% |
| stelo.UntouchableNano 1.3 | 20 | 65% |
| skm.Ryubot 1.0 | 17 | 94% |
| EBBU.Sim2 1.02 | 11 | 91% |
| lmk.ACPFinal 0.1 | 5 | 80% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 540. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 28 | 28% | 43 |
| stelo.UntouchableNano 1.3 | 19 | 19% | 31 |
| com.syncleus.robocode.Dreadnaught 0.1 | 13 | 13% | 38 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 12% | 19 |
| mb.Beast 0.1 | 10 | 10% | 28 |
| germ.TheMind .2 | 7 | 7% | 15 |
| EBBU.Sim2 1.02 | 6 | 6% | 14 |
| lmk.ACPFinal 0.1 | 4 | 4% | 13 |
| skm.Ryubot 1.0 | 2 | 2% | 6 |

## Melee bench: F38

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 58.9 | 20 / 210 | 4.70 | 12.1% | 23219 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.2 | 17.1% | 103 |
| bvh.mini.Freya 0.55 | 1.8 | 13.4% | 26 |
| bts.mega.Gnarly 1.4 | 3.3 | 12.3% | 32 |
| hadur117.mini.DeiseWHP 0.2 | 4.0 | 12.1% | 20 |
| cs.Wren 1.0 | 4.7 | 11.5% | 14 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.5 | 9.4% | 9 |
| kdf.KoulDestroyer 1.0 | 6.5 | 9.3% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.5 | 5.9% | 1 |
| matt.UnderDark3 2.4.34 | 8.8 | 5.0% | 1 |
| bzdp.BoxCar 2.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.8 | 59.7 | 5 / 35 | 3605 |
| 2 | 5 | 56.2 | 56.2 | 1 / 35 | 3889 |
| 3 | 4 | 56.0 | 55.9 | 4 / 35 | 3458 |
| 4 | 4 | 59.6 | 61.3 | 5 / 35 | 4409 |
| 5 | 4 | 58.3 | 62.2 | 2 / 35 | 4062 |
| 6 | 3 | 57.4 | 58.4 | 3 / 35 | 3796 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cs.Wren 1.0 | 12 | 100% |
| justin.Mallais 14.0 | 10 | 0% |
| bts.mega.Gnarly 1.4 | 7 | 14% |
| bvh.mini.Freya 0.55 | 4 | 0% |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 100% |
| kdf.KoulDestroyer 1.0 | 3 | 67% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 100% |

Hadur died in 190 of 210 rounds, at a mean tick of 518. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 63 | 33% | 68 |
| bts.mega.Gnarly 1.4 | 47 | 25% | 49 |
| bvh.mini.Freya 0.55 | 24 | 13% | 27 |
| kdf.KoulDestroyer 1.0 | 22 | 12% | 26 |
| cs.Wren 1.0 | 17 | 9% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 5% | 10 |
| matt.UnderDark3 2.4.34 | 4 | 2% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 2% | 4 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |

## Melee bench: F39

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 67.5 | 32 / 210 | 3.93 | 14.3% | 29586 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.2 | 15.8% | 56 |
| hadur117.mini.DeiseWHP 0.2 | 2.3 | 14.3% | 32 |
| az.Ololobot 0.2.4 | 2.5 | 13.8% | 75 |
| catcat20.Lambda 0.024 | 4.0 | 10.8% | 28 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.7% | 4 |
| apollokidd.ApolloKidd 0.9 | 6.2 | 8.5% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 6.5 | 8.4% | 12 |
| gimp.GimpBot 0.1 | 7.3 | 7.8% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 6.1% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.9 | 67.0 | 4 / 35 | 4819 |
| 2 | 2 | 60.4 | 65.4 | 4 / 35 | 4981 |
| 3 | 2 | 61.6 | 69.8 | 4 / 35 | 5053 |
| 4 | 3 | 61.1 | 66.7 | 5 / 35 | 4959 |
| 5 | 2 | 61.7 | 67.0 | 9 / 35 | 5212 |
| 6 | 2 | 60.9 | 68.9 | 6 / 35 | 4562 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 23 | 43% |
| az.Ololobot 0.2.4 | 22 | 18% |
| catcat20.Lambda 0.024 | 15 | 40% |
| stelo.SoRobotNanoMelee 1.2 | 9 | 67% |
| winamp32.micro.MicroMacro 1.0 | 4 | 75% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 60 | 34% | 69 |
| az.Ololobot 0.2.4 | 51 | 28% | 55 |
| catcat20.Lambda 0.024 | 31 | 17% | 39 |
| apollokidd.ApolloKidd 0.9 | 9 | 5% | 12 |
| winamp32.micro.MicroMacro 1.0 | 8 | 4% | 12 |
| gimp.GimpBot 0.1 | 7 | 4% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 6 | 3% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 3 | 2% | 4 |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F40

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 71.9 | 50 / 210 | 3.53 | 15.7% | 31051 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 1.2 | 16.3% | 86 |
| hadur117.mini.DeiseWHP 0.2 | 1.8 | 15.7% | 50 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 12.4% | 33 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.7% | 14 |
| mz.AntiGrav 1.0 | 4.7 | 11.1% | 8 |
| alpha.BlackIce 1.0 | 6.0 | 9.0% | 7 |
| stelo.Randomness 1.0 | 6.5 | 9.1% | 10 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.4% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.4% | 1 |
| sample.Corners 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 76.5 | 9 / 35 | 5527 |
| 2 | 2 | 63.8 | 71.1 | 9 / 35 | 5078 |
| 3 | 2 | 61.5 | 63.8 | 9 / 35 | 4849 |
| 4 | 2 | 63.6 | 72.1 | 6 / 35 | 5068 |
| 5 | 2 | 63.3 | 70.5 | 4 / 35 | 5056 |
| 6 | 1 | 66.4 | 77.1 | 13 / 35 | 5473 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 37 | 16% |
| kano.gamma.KanoGamma 1.8 | 19 | 32% |
| Polkwane.SmashMelee 1.0 | 19 | 95% |
| mz.AntiGrav 1.0 | 11 | 100% |
| stelo.Randomness 1.0 | 6 | 100% |
| alpha.BlackIce 1.0 | 3 | 67% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 656. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 75 | 47% | 83 |
| kano.gamma.KanoGamma 1.8 | 29 | 18% | 39 |
| stelo.Randomness 1.0 | 15 | 9% | 23 |
| mz.AntiGrav 1.0 | 15 | 9% | 20 |
| Polkwane.SmashMelee 1.0 | 13 | 8% | 22 |
| alpha.BlackIce 1.0 | 9 | 6% | 13 |
| amk.superstrike.SuperStrike 0.3 | 4 | 3% | 7 |
| sample.Corners 1.0 | 0 | 0% | 3 |

## Melee bench: F41

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 68.0 | 20 / 210 | 3.88 | 14.3% | 28818 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.2 | 17.6% | 112 |
| hadur117.mini.DeiseWHP 0.2 | 2.0 | 14.3% | 20 |
| lessonz.robocode.Oz 0.5.0 | 3.2 | 13.1% | 35 |
| ary.Swarm 1.1 | 3.7 | 12.7% | 15 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 11.0% | 13 |
| shrub.Silver v048 | 6.2 | 9.2% | 9 |
| zyx.nano.Ant 1.1 | 6.8 | 7.5% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 6.1% | 5 |
| stelo.Mirror 1.1 | 8.5 | 5.8% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 65.7 | 1 / 35 | 4603 |
| 2 | 2 | 61.9 | 67.3 | 5 / 35 | 4719 |
| 3 | 2 | 62.1 | 68.6 | 2 / 35 | 4837 |
| 4 | 2 | 62.3 | 67.6 | 2 / 35 | 5059 |
| 5 | 2 | 60.5 | 63.2 | 3 / 35 | 4634 |
| 6 | 1 | 64.5 | 75.9 | 7 / 35 | 4966 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 24 | 25% |
| lessonz.robocode.Oz 0.5.0 | 16 | 19% |
| ary.Swarm 1.1 | 6 | 67% |
| shrub.Silver v048 | 3 | 0% |
| simonton.nano.MeleeSeed 1.8 | 3 | 100% |
| jsal.Jsalbot 1.0 | 2 | 50% |
| stelo.Mirror 1.1 | 2 | 50% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 191 of 210 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 79 | 41% | 87 |
| lessonz.robocode.Oz 0.5.0 | 46 | 24% | 54 |
| ary.Swarm 1.1 | 24 | 13% | 23 |
| shrub.Silver v048 | 18 | 9% | 19 |
| simonton.nano.MeleeSeed 1.8 | 12 | 6% | 13 |
| jsal.Jsalbot 1.0 | 6 | 3% | 7 |
| stelo.Mirror 1.1 | 3 | 2% | 4 |
| zyx.nano.Ant 1.1 | 2 | 1% | 2 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |

## Melee bench: F42

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 66.9 | 22 / 210 | 3.98 | 14.2% | 30250 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.9% | 114 |
| hadur117.mini.DeiseWHP 0.2 | 2.5 | 14.2% | 22 |
| ara.Shera 0.88 | 3.2 | 13.7% | 38 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.4% | 25 |
| amz.NanoClone 1.41 | 5.3 | 9.0% | 2 |
| dsw.StaticD 1.0 | 6.3 | 7.5% | 7 |
| maribo.IotaCT 1.1 | 6.5 | 7.7% | 2 |
| stelo.MirrorMicro 1.0 | 8.3 | 6.1% | 0 |
| mme.NikeEnhanced 2.0 | 9.2 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 64.1 | 5 / 35 | 4931 |
| 2 | 4 | 57.3 | 56.8 | 1 / 35 | 4278 |
| 3 | 2 | 63.5 | 74.0 | 3 / 35 | 5316 |
| 4 | 2 | 61.8 | 68.9 | 3 / 35 | 5085 |
| 5 | 2 | 63.1 | 70.5 | 7 / 35 | 5250 |
| 6 | 2 | 62.6 | 67.0 | 3 / 35 | 5390 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 37 | 24% |
| ara.Shera 0.88 | 10 | 40% |
| maribo.mini.MiniQuester 0.1 | 8 | 38% |
| dsw.StaticD 1.0 | 3 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 188 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 79 | 42% | 88 |
| ara.Shera 0.88 | 37 | 20% | 43 |
| maribo.mini.MiniQuester 0.1 | 34 | 18% | 38 |
| dsw.StaticD 1.0 | 12 | 6% | 14 |
| amz.NanoClone 1.41 | 12 | 6% | 12 |
| maribo.IotaCT 1.1 | 5 | 3% | 5 |
| stelo.MirrorMicro 1.0 | 4 | 2% | 6 |
| mme.NikeEnhanced 2.0 | 3 | 2% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 1% | 2 |

## Melee bench: F43

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 56.7 | 3 / 210 | 4.90 | 11.6% | 23308 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.4% | 178 |
| hadur117.mini.DeiseWHP 0.2 | 3.3 | 11.6% | 3 |
| brainfade.melee.Dusk 0.44 | 3.5 | 11.7% | 14 |
| wcsv.melee.EngineerMelee 0.1 | 3.8 | 11.3% | 5 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.6% | 5 |
| Krabb.akim2.Akim2 1.1b | 5.5 | 10.3% | 4 |
| mz.NanoGod 2.02 | 7.3 | 8.1% | 0 |
| jab.DiamondStealer 5 | 7.7 | 7.7% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.5% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.2 | 52.7 | 0 / 35 | 3953 |
| 2 | 2 | 59.7 | 61.3 | 1 / 35 | 3764 |
| 3 | 5 | 56.6 | 53.7 | 0 / 35 | 3672 |
| 4 | 3 | 58.2 | 58.1 | 1 / 35 | 3756 |
| 5 | 3 | 58.9 | 57.5 | 1 / 35 | 4198 |
| 6 | 3 | 58.4 | 56.8 | 0 / 35 | 3965 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 25 | 0% |
| dummy.micro.Sparrow 2.5 | 3 | 100% |
| brainfade.melee.Dusk 0.44 | 1 | 0% |

Hadur died in 207 of 210 rounds, at a mean tick of 528. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 94 | 45% | 94 |
| wcsv.melee.EngineerMelee 0.1 | 33 | 16% | 33 |
| brainfade.melee.Dusk 0.44 | 27 | 13% | 27 |
| dummy.micro.Sparrow 2.5 | 16 | 8% | 19 |
| jab.DiamondStealer 5 | 14 | 7% | 14 |
| mz.NanoGod 2.02 | 13 | 6% | 13 |
| Krabb.akim2.Akim2 1.1b | 10 | 5% | 10 |

## Melee bench: F44

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 65.0 | 33 / 210 | 4.15 | 14.5% | 32139 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.2 | 17.0% | 103 |
| hadur117.mini.DeiseWHP 0.2 | 2.2 | 14.5% | 33 |
| tzu.TheArtOfWar 1.2 | 2.7 | 13.9% | 43 |
| jwirde.Gort 2.0 | 4.8 | 10.7% | 19 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.2 | 10.1% | 4 |
| wompi.Quokka 1.6 | 5.2 | 10.2% | 2 |
| disan.Chair 2.2.0 | 7.0 | 8.0% | 5 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.8% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.3% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 65.7 | 2 / 35 | 5177 |
| 2 | 3 | 61.5 | 62.9 | 5 / 35 | 5158 |
| 3 | 2 | 60.3 | 60.3 | 7 / 35 | 5105 |
| 4 | 2 | 64.3 | 69.2 | 4 / 35 | 5911 |
| 5 | 3 | 59.6 | 58.1 | 5 / 35 | 4977 |
| 6 | 1 | 65.5 | 73.7 | 10 / 35 | 5811 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 27 | 30% |
| tzu.TheArtOfWar 1.2 | 18 | 61% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 71% |
| jwirde.Gort 2.0 | 6 | 33% |
| stf.PanzerGeneral 0.1 | 3 | 100% |
| disan.Chair 2.2.0 | 3 | 100% |
| wompi.Quokka 1.6 | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 63 | 36% | 75 |
| tzu.TheArtOfWar 1.2 | 30 | 17% | 40 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 29 | 16% | 33 |
| jwirde.Gort 2.0 | 25 | 14% | 30 |
| wompi.Quokka 1.6 | 13 | 7% | 14 |
| disan.Chair 2.2.0 | 7 | 4% | 7 |
| amk.jointstrike.JointStrike 0.2 | 6 | 3% | 6 |
| stf.PanzerGeneral 0.1 | 4 | 2% | 5 |

## Melee bench: F45

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 78.7 | 58 / 210 | 2.92 | 17.9% | 35715 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHP 0.2 | 1.0 | 17.9% | 58 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 12.5% | 95 |
| jje.BagPuss 1.2 | 3.0 | 12.2% | 14 |
| sul.Lunar 1.1 | 3.5 | 11.2% | 29 |
| myl.nano.Graviton 1.10 | 5.5 | 9.5% | 6 |
| fm.claire 1.7 | 6.3 | 8.5% | 2 |
| hvilela.HVilela 0.9 | 7.0 | 8.6% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 8.3% | 4 |
| wit.Deep7 2.0 | 9.0 | 6.2% | 2 |
| abud.ThirdRobo 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 74.0 | 6 / 35 | 5586 |
| 2 | 1 | 68.8 | 83.5 | 13 / 35 | 6473 |
| 3 | 1 | 67.1 | 79.7 | 9 / 35 | 6057 |
| 4 | 1 | 66.9 | 78.7 | 10 / 35 | 5939 |
| 5 | 1 | 65.5 | 76.8 | 11 / 35 | 5383 |
| 6 | 1 | 67.2 | 79.4 | 9 / 35 | 6277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 61 | 21% |
| sul.Lunar 1.1 | 28 | 43% |
| jje.BagPuss 1.2 | 17 | 59% |
| myl.nano.Graviton 1.10 | 12 | 83% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 71% |
| fm.claire 1.7 | 4 | 100% |
| wit.Deep7 2.0 | 2 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 1497. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 54 | 36% | 0 |
| jje.BagPuss 1.2 | 34 | 22% | 76 |
| sul.Lunar 1.1 | 25 | 16% | 45 |
| fm.claire 1.7 | 13 | 9% | 18 |
| pez.mini.ChironexFleckeri 0.5 | 8 | 5% | 16 |
| myl.nano.Graviton 1.10 | 7 | 5% | 21 |
| hvilela.HVilela 0.9 | 7 | 5% | 14 |
| wit.Deep7 2.0 | 2 | 1% | 15 |
| abud.ThirdRobo 1.0 | 2 | 1% | 4 |

## Melee bench: F46

hadur117.mini.DeiseWHP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 67.9 | 3 / 210 | 3.89 | 13.5% | 26596 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 18.5% | 89 |
| rsalesc.melee.Medina 0.4.5 | 1.5 | 18.0% | 114 |
| hadur117.mini.DeiseWHP 0.2 | 3.0 | 13.5% | 3 |
| mz.MicroSheep 1.0 | 4.5 | 10.1% | 0 |
| cx.Princess 1.0 | 5.2 | 9.6% | 3 |
| sadoner.killer 0.2 | 5.5 | 8.7% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.0% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.6% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.5% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.4 | 67.6 | 2 / 35 | 4578 |
| 2 | 3 | 61.5 | 70.8 | 0 / 35 | 4315 |
| 3 | 3 | 62.0 | 71.1 | 0 / 35 | 4627 |
| 4 | 3 | 60.5 | 65.1 | 1 / 35 | 4332 |
| 5 | 3 | 59.8 | 65.7 | 0 / 35 | 4229 |
| 6 | 3 | 61.1 | 67.0 | 0 / 35 | 4515 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 22 | 5% |
| rsalesc.melee.Medina 0.4.5 | 15 | 13% |

Hadur died in 207 of 210 rounds, at a mean tick of 619. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 103 | 50% | 104 |
| rsalesc.melee.Medina 0.4.5 | 71 | 34% | 73 |
| cx.Princess 1.0 | 13 | 6% | 13 |
| sadoner.killer 0.2 | 11 | 5% | 11 |
| mz.MicroSheep 1.0 | 4 | 2% | 4 |
| jeremyreeder.collective.Prophet 5 | 3 | 1% | 3 |
| arthord.NanoSatanMelee Beta | 1 | 0% | 1 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 1 |

