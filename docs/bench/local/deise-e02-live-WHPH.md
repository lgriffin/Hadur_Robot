# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 72.5 | 13 / 210 | 3.47 | 14.6% | 30466 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 155 |
| hadur117.mini.DeiseWHPH 0.2 | 2.0 | 14.6% | 13 |
| sgp.JollyNinja 3.53 | 3.2 | 12.3% | 19 |
| mz.MicroGodMelee 1 | 4.3 | 11.3% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 11.0% | 5 |
| lorneswork.Predator 1.0 | 6.0 | 9.5% | 4 |
| adt.Ar2 1.0 | 7.0 | 7.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.5 | 5.3% | 0 |
| skm.butterfly 1.0 | 8.5 | 5.1% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 70.8 | 3 / 35 | 5113 |
| 2 | 2 | 61.9 | 69.8 | 1 / 35 | 4869 |
| 3 | 2 | 62.0 | 69.2 | 4 / 35 | 4893 |
| 4 | 2 | 62.7 | 71.7 | 2 / 35 | 5056 |
| 5 | 2 | 64.9 | 81.0 | 1 / 35 | 5292 |
| 6 | 2 | 63.0 | 72.7 | 2 / 35 | 5243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 55 | 0% |
| sgp.JollyNinja 3.53 | 12 | 50% |
| mz.MicroGodMelee 1 | 11 | 0% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 100% |
| lorneswork.Predator 1.0 | 2 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 197 of 210 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 109 | 55% | 111 |
| mz.MicroGodMelee 1 | 35 | 18% | 36 |
| sgp.JollyNinja 3.53 | 24 | 12% | 30 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 7% | 15 |
| lorneswork.Predator 1.0 | 11 | 6% | 13 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 2% | 3 |
| adt.Ar2 1.0 | 2 | 1% | 2 |

## Melee bench: F02

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 69.1 | 41 / 210 | 3.78 | 15.5% | 33185 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPH 0.2 | 1.3 | 15.5% | 41 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.8% | 62 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 14.3% | 48 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.5 | 10.1% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.3% | 3 |
| sch.Simone 0.3d | 6.5 | 8.6% | 14 |
| Noran.BitchingElk 0.054 | 7.0 | 7.9% | 16 |
| fnc.bandit.Bandit 5.2.0 | 7.7 | 7.3% | 3 |
| stelo.PatternRobot 1.0 | 8.7 | 6.6% | 5 |
| fullsail.SweetTea 1.1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 71.7 | 7 / 35 | 5783 |
| 2 | 1 | 62.8 | 68.9 | 7 / 35 | 5418 |
| 3 | 2 | 62.4 | 66.7 | 8 / 35 | 5286 |
| 4 | 2 | 61.3 | 64.1 | 5 / 35 | 5362 |
| 5 | 1 | 64.9 | 73.3 | 8 / 35 | 5628 |
| 6 | 1 | 63.6 | 69.8 | 6 / 35 | 5708 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 27 | 22% |
| pulsar.PulsarMax 0.8.9 | 22 | 50% |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 45% |
| Noran.BitchingElk 0.054 | 6 | 50% |
| stelo.PatternRobot 1.0 | 6 | 83% |
| sch.Simone 0.3d | 5 | 60% |
| lrem.micro.SpikeSoldier 0.4 | 5 | 80% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| fnc.bandit.Bandit 5.2.0 | 2 | 50% |

Hadur died in 169 of 210 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 53 | 31% | 58 |
| pulsar.PulsarMax 0.8.9 | 45 | 27% | 60 |
| sch.Simone 0.3d | 25 | 15% | 31 |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 9% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 8% | 17 |
| fnc.bandit.Bandit 5.2.0 | 10 | 6% | 11 |
| stelo.PatternRobot 1.0 | 3 | 2% | 4 |
| Noran.BitchingElk 0.054 | 3 | 2% | 2 |
| fullsail.SweetTea 1.1 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.7 | 73 / 210 | 2.29 | 18.2% | 38311 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPH 0.2 | 1.2 | 18.2% | 73 |
| radnor.DoctorBob 1.42 | 2.0 | 15.5% | 73 |
| vuen.Cake 2.51 | 3.2 | 13.2% | 49 |
| kawigi.nano.Lib 1.0 | 3.7 | 12.5% | 14 |
| urdos.URDOS 1.3 | 5.0 | 9.2% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 6.7 | 7.3% | 0 |
| adt.Ar1 2.1 | 6.8 | 7.4% | 0 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.8% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 90.2 | 16 / 35 | 6335 |
| 2 | 1 | 66.1 | 80.0 | 11 / 35 | 6064 |
| 3 | 1 | 67.2 | 84.1 | 9 / 35 | 6519 |
| 4 | 1 | 69.2 | 87.9 | 16 / 35 | 6743 |
| 5 | 1 | 68.6 | 88.6 | 15 / 35 | 6467 |
| 6 | 2 | 66.5 | 83.5 | 6 / 35 | 6183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 50 | 14% |
| vuen.Cake 2.51 | 41 | 37% |
| kawigi.nano.Lib 1.0 | 40 | 93% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 4 | 100% |
| urdos.URDOS 1.3 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 81 | 59% | 92 |
| vuen.Cake 2.51 | 39 | 28% | 58 |
| kawigi.nano.Lib 1.0 | 7 | 5% | 35 |
| urdos.URDOS 1.3 | 3 | 2% | 6 |
| adt.Ar1 2.1 | 3 | 2% | 3 |
| oa.weak.FlyMk1 0.1 | 2 | 1% | 9 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 1% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 3 |

## Melee bench: F04

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 69.3 | 3 / 210 | 3.76 | 14.2% | 31101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.0% | 192 |
| hadur117.mini.DeiseWHPH 0.2 | 2.3 | 14.2% | 3 |
| apc.LeeroyJenkins2 1.0 | 2.7 | 13.8% | 5 |
| TNT.TNT 0.99.1 | 4.0 | 11.4% | 10 |
| josago.Jorgito 0.16 | 5.2 | 8.9% | 0 |
| css.Delitioner 0.11 | 6.0 | 7.6% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 8.5 | 5.0% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.4% | 0 |
| spin.Bugstard 0.012b | 9.3 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 69.8 | 0 / 35 | 5632 |
| 2 | 2 | 63.6 | 70.8 | 1 / 35 | 5202 |
| 3 | 2 | 64.4 | 73.3 | 0 / 35 | 5450 |
| 4 | 2 | 62.8 | 69.5 | 0 / 35 | 5061 |
| 5 | 3 | 61.6 | 67.3 | 0 / 35 | 4712 |
| 6 | 3 | 62.2 | 65.1 | 2 / 35 | 5044 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 54 | 6% |
| TNT.TNT 0.99.1 | 2 | 0% |

Hadur died in 207 of 210 rounds, at a mean tick of 789. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 128 | 62% | 131 |
| apc.LeeroyJenkins2 1.0 | 36 | 17% | 36 |
| TNT.TNT 0.99.1 | 19 | 9% | 19 |
| josago.Jorgito 0.16 | 13 | 6% | 13 |
| css.Delitioner 0.11 | 9 | 4% | 9 |
| rampancy.Durandal 2.1d | 1 | 0% | 1 |
| tj.zombie1n 1.0.1 | 1 | 0% | 1 |

## Melee bench: F05

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.3 | 52.9 | 0 / 210 | 5.24 | 10.3% | 20076 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 19.2% | 122 |
| justin.DemonicRage 3.4 | 1.8 | 18.0% | 69 |
| wompi.Numbat 2.1 | 3.0 | 13.0% | 15 |
| hadur117.mini.DeiseWHPH 0.2 | 4.5 | 10.3% | 0 |
| ms.Ares 0.19 | 5.2 | 9.5% | 2 |
| axeBots.HataMoto 3.09 | 5.3 | 9.8% | 2 |
| supersample.SuperBoxBot 1.0 | 7.5 | 6.3% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.8% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.3% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.8 | 57.8 | 0 / 35 | 3758 |
| 2 | 4 | 53.6 | 52.4 | 0 / 35 | 3057 |
| 3 | 4 | 53.5 | 51.1 | 0 / 35 | 3277 |
| 4 | 4 | 54.4 | 53.0 | 0 / 35 | 3494 |
| 5 | 6 | 53.8 | 51.4 | 0 / 35 | 3195 |
| 6 | 5 | 53.9 | 51.4 | 0 / 35 | 3295 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 6 | 0% |
| wompi.Numbat 2.1 | 2 | 0% |
| justin.DemonicRage 3.4 | 2 | 0% |

Hadur died in 210 of 210 rounds, at a mean tick of 472. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 69 | 33% | 69 |
| justin.DemonicRage 3.4 | 58 | 28% | 58 |
| wompi.Numbat 2.1 | 42 | 20% | 43 |
| ms.Ares 0.19 | 16 | 8% | 16 |
| axeBots.HataMoto 3.09 | 9 | 4% | 9 |
| supersample.SuperBoxBot 1.0 | 6 | 3% | 6 |
| davidalves.net.DuelistMicroMelee 1.4 | 6 | 3% | 6 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |
| GarmBox.Oranges 1.0 | 2 | 1% | 1 |

## Melee bench: F06

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 73.7 | 50 / 210 | 3.37 | 15.6% | 29942 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPH 0.2 | 1.7 | 15.6% | 50 |
| origin.SleepSiphon 1.7b | 1.8 | 14.8% | 77 |
| jekl.StoneGhost 0.7 | 2.5 | 14.5% | 41 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.3 | 12.2% | 16 |
| mld.Wisdom 1.0 | 4.7 | 10.9% | 6 |
| gg.Wolverine 2.0 | 6.2 | 8.8% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.5% | 15 |
| DBall.NUKE 0.1 | 8.2 | 6.3% | 0 |
| spinnercat.Omen 1.0 | 8.3 | 6.4% | 0 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 72.1 | 5 / 35 | 4937 |
| 2 | 1 | 64.3 | 74.0 | 10 / 35 | 5015 |
| 3 | 3 | 62.2 | 70.2 | 5 / 35 | 4555 |
| 4 | 2 | 61.8 | 69.5 | 4 / 35 | 4740 |
| 5 | 1 | 65.7 | 78.7 | 12 / 35 | 5140 |
| 6 | 1 | 66.4 | 77.5 | 14 / 35 | 5555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 24 | 63% |
| origin.SleepSiphon 1.7b | 22 | 14% |
| pe.minimelee.SandboxMiniMelee 1.1 | 15 | 93% |
| gg.Wolverine 2.0 | 9 | 89% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 0% |
| mld.Wisdom 1.0 | 4 | 75% |
| DBall.NUKE 0.1 | 4 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 58 | 36% | 70 |
| jekl.StoneGhost 0.7 | 44 | 27% | 53 |
| pe.minimelee.SandboxMiniMelee 1.1 | 19 | 12% | 27 |
| ers.nano.hawk.HawkLA 3.0m | 15 | 9% | 19 |
| mld.Wisdom 1.0 | 13 | 8% | 19 |
| gg.Wolverine 2.0 | 12 | 7% | 17 |
| DBall.NUKE 0.1 | 0 | 0% | 4 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |

## Melee bench: F07

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 85.2 | 60 / 210 | 2.33 | 18.4% | 39192 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.5 | 18.6% | 82 |
| hadur117.mini.DeiseWHPH 0.2 | 1.7 | 18.4% | 60 |
| rtk.Tachikoma 1.0 | 2.8 | 16.1% | 42 |
| franzor.Lizt 1.3.1 | 4.3 | 11.4% | 18 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 10.6% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.7% | 1 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| drd.Dreadknoght 0.9 | 9.5 | 2.3% | 0 |
| sample.Target 1.0 | 9.5 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 86.0 | 12 / 35 | 6918 |
| 2 | 2 | 67.9 | 81.0 | 10 / 35 | 6021 |
| 3 | 2 | 68.0 | 82.9 | 7 / 35 | 5937 |
| 4 | 2 | 69.3 | 83.8 | 7 / 35 | 6473 |
| 5 | 2 | 69.4 | 85.4 | 8 / 35 | 6529 |
| 6 | 1 | 72.5 | 92.1 | 16 / 35 | 7314 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 55 | 51% |
| rsalesc.melee.Monk 0.3.6c | 44 | 5% |
| franzor.Lizt 1.3.1 | 30 | 60% |
| oog.melee.CapuletDroid 1.1 | 12 | 92% |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 1113. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 71 | 47% | 82 |
| rtk.Tachikoma 1.0 | 45 | 30% | 84 |
| franzor.Lizt 1.3.1 | 23 | 15% | 16 |
| oog.melee.CapuletDroid 1.1 | 7 | 5% | 21 |
| exauge.GateKeeper 1.1.121g | 3 | 2% | 4 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 76.1 | 59 / 210 | 3.15 | 16.2% | 30861 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPH 0.2 | 1.0 | 16.2% | 59 |
| tm.Yuugao 1.0 | 2.3 | 14.3% | 64 |
| shrub.Vapour v159 | 2.7 | 13.1% | 40 |
| com.spp.robocode.MostlyHarmless 010 | 4.5 | 10.4% | 28 |
| Krabb.sliNk.Garm 0.9u | 4.5 | 10.5% | 12 |
| m3thos.Eva00 1.1 | 6.3 | 8.2% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 8.0% | 5 |
| zyx.nano.BacillusComma 1.0 | 8.5 | 6.4% | 0 |
| qualidafial.MajorDick 1.0.1 | 9.0 | 6.5% | 3 |
| SHAM.WOW 1.4 | 9.3 | 6.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 77.8 | 8 / 35 | 5153 |
| 2 | 1 | 63.4 | 75.2 | 11 / 35 | 4744 |
| 3 | 1 | 65.1 | 77.8 | 12 / 35 | 5151 |
| 4 | 1 | 65.3 | 79.4 | 14 / 35 | 5098 |
| 5 | 1 | 64.1 | 74.3 | 8 / 35 | 5257 |
| 6 | 1 | 63.6 | 72.4 | 6 / 35 | 5458 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 29 | 24% |
| shrub.Vapour v159 | 25 | 44% |
| com.spp.robocode.MostlyHarmless 010 | 18 | 39% |
| Krabb.sliNk.Garm 0.9u | 14 | 86% |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 91% |
| m3thos.Eva00 1.1 | 5 | 100% |
| SHAM.WOW 1.4 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 718. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 51 | 33% | 62 |
| com.spp.robocode.MostlyHarmless 010 | 32 | 21% | 42 |
| shrub.Vapour v159 | 31 | 20% | 47 |
| Krabb.sliNk.Garm 0.9u | 19 | 12% | 29 |
| m3thos.Eva00 1.1 | 8 | 5% | 9 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 3% | 12 |
| zyx.nano.BacillusComma 1.0 | 3 | 2% | 4 |
| SHAM.WOW 1.4 | 2 | 1% | 3 |
| qualidafial.MajorDick 1.0.1 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 59.8 | 11 / 210 | 4.62 | 12.5% | 25062 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.3% | 125 |
| kc.micro.Figment 1.0 | 2.0 | 14.8% | 40 |
| hadur117.mini.DeiseWHPH 0.2 | 3.3 | 12.5% | 11 |
| yagami.Tidus 0.11 | 4.3 | 10.8% | 3 |
| pedersen.Grishnakh 1.0 | 4.5 | 10.9% | 21 |
| mc2.enemy.Original 0.9 | 5.8 | 9.3% | 7 |
| dft.Calliope 5.6 | 7.0 | 7.4% | 3 |
| step.nanoPri 1.0 | 8.0 | 6.1% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 64.1 | 2 / 35 | 4234 |
| 2 | 4 | 56.2 | 54.9 | 0 / 35 | 4161 |
| 3 | 3 | 59.7 | 65.1 | 1 / 35 | 4342 |
| 4 | 4 | 56.8 | 55.6 | 2 / 35 | 4214 |
| 5 | 3 | 60.4 | 63.5 | 4 / 35 | 4484 |
| 6 | 3 | 56.1 | 55.6 | 2 / 35 | 3627 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 15 | 7% |
| kc.micro.Figment 1.0 | 14 | 21% |
| yagami.Tidus 0.11 | 5 | 80% |
| pedersen.Grishnakh 1.0 | 3 | 33% |
| mc2.enemy.Original 0.9 | 2 | 50% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 200 of 210 rounds, at a mean tick of 587. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 74 | 37% | 77 |
| kc.micro.Figment 1.0 | 44 | 22% | 48 |
| pedersen.Grishnakh 1.0 | 25 | 13% | 25 |
| mc2.enemy.Original 0.9 | 23 | 12% | 23 |
| yagami.Tidus 0.11 | 17 | 9% | 18 |
| step.nanoPri 1.0 | 10 | 5% | 11 |
| dft.Calliope 5.6 | 3 | 2% | 4 |
| robar.nano.Assertive_Melee 0.2 | 2 | 1% | 2 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |

## Melee bench: F10

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 79.1 | 62 / 210 | 2.88 | 16.6% | 33992 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPH 0.2 | 1.2 | 16.6% | 62 |
| DTF.Kludgy 1.2b | 2.0 | 14.6% | 58 |
| ejb.Polaris 1.0.1 | 3.0 | 13.1% | 43 |
| ne.Chimera 1.2 | 3.8 | 12.8% | 17 |
| vStar.RAFzilla 2.15 | 5.0 | 11.2% | 12 |
| tvv.micro.Antares 1.1.1 | 6.0 | 10.4% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.7 | 5.8% | 0 |
| kurios.DOSexe .9b | 7.8 | 5.8% | 1 |
| sam.Samspin 1.0 | 8.5 | 5.6% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 4.0% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 76.5 | 13 / 35 | 5928 |
| 2 | 1 | 67.8 | 84.8 | 11 / 35 | 6091 |
| 3 | 1 | 63.6 | 74.9 | 8 / 35 | 5362 |
| 4 | 1 | 66.2 | 81.9 | 11 / 35 | 5620 |
| 5 | 2 | 64.4 | 76.8 | 6 / 35 | 5511 |
| 6 | 1 | 65.8 | 79.7 | 13 / 35 | 5480 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 33 | 27% |
| ne.Chimera 1.2 | 30 | 67% |
| vStar.RAFzilla 2.15 | 20 | 85% |
| ejb.Polaris 1.0.1 | 20 | 20% |
| tvv.micro.Antares 1.1.1 | 14 | 71% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |
| kurios.DOSexe .9b | 1 | 0% |
| donjezza.Muncho 1.0 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 739. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 53 | 36% | 62 |
| ejb.Polaris 1.0.1 | 35 | 24% | 41 |
| ne.Chimera 1.2 | 21 | 14% | 39 |
| tvv.micro.Antares 1.1.1 | 15 | 10% | 24 |
| vStar.RAFzilla 2.15 | 10 | 7% | 27 |
| kurios.DOSexe .9b | 7 | 5% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 3% | 5 |
| sam.Samspin 1.0 | 2 | 1% | 3 |
| donjezza.Muncho 1.0 | 1 | 1% | 1 |

## Melee bench: F11

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 67.6 | 33 / 210 | 3.92 | 14.4% | 28357 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.6% | 97 |
| hadur117.mini.DeiseWHPH 0.2 | 2.0 | 14.4% | 33 |
| cx.mini.Nimrod 0.55 | 3.3 | 12.1% | 23 |
| djc.DynaBot 0.1.1 | 3.7 | 11.2% | 19 |
| rdt199.Warlord 0.73 | 5.5 | 9.4% | 16 |
| br2.MobyDickBot 1.6 | 6.3 | 8.5% | 10 |
| uji.YellohFellah 1.0 | 6.7 | 8.3% | 10 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.6% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.9% | 2 |
| stelo.MirrorNano 1.3 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 75.2 | 11 / 35 | 5282 |
| 2 | 2 | 61.3 | 68.9 | 4 / 35 | 4503 |
| 3 | 2 | 61.6 | 65.4 | 6 / 35 | 4873 |
| 4 | 2 | 59.1 | 63.2 | 2 / 35 | 4427 |
| 5 | 2 | 62.3 | 71.1 | 3 / 35 | 4772 |
| 6 | 2 | 59.6 | 61.6 | 7 / 35 | 4500 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 31 | 23% |
| djc.DynaBot 0.1.1 | 12 | 67% |
| cx.mini.Nimrod 0.55 | 11 | 64% |
| br2.MobyDickBot 1.6 | 5 | 80% |
| rdt199.Warlord 0.73 | 5 | 60% |
| uji.YellohFellah 1.0 | 4 | 75% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 0% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 94 | 53% | 102 |
| cx.mini.Nimrod 0.55 | 24 | 14% | 29 |
| rdt199.Warlord 0.73 | 18 | 10% | 23 |
| djc.DynaBot 0.1.1 | 13 | 7% | 18 |
| stelo.MirrorNano 1.3 | 9 | 5% | 9 |
| uji.YellohFellah 1.0 | 6 | 3% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 3% | 8 |
| KiraNL.Chupacabra 0.4 | 4 | 2% | 5 |
| br2.MobyDickBot 1.6 | 3 | 2% | 7 |

## Melee bench: F12

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 66.1 | 31 / 210 | 4.05 | 13.8% | 25385 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPH 0.2 | 2.0 | 13.8% | 31 |
| darkcanuck.Leon 1.01 | 2.2 | 14.0% | 55 |
| bts.wiki.RipCurl 0.9b | 2.5 | 14.0% | 46 |
| nat.PallasHawk 1.0 | 3.3 | 12.8% | 51 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.8% | 17 |
| jrm.Test0 1.0 | 6.2 | 8.7% | 3 |
| jp.Perpy 16.0 | 7.0 | 7.6% | 2 |
| cs.sheldor.Talon 1.1 | 8.2 | 6.8% | 1 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.8% | 4 |
| stuff.Vlad 0.1 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.1 | 67.0 | 5 / 35 | 4297 |
| 2 | 2 | 61.7 | 69.5 | 5 / 35 | 4407 |
| 3 | 3 | 59.3 | 62.5 | 6 / 35 | 4094 |
| 4 | 1 | 61.1 | 69.2 | 6 / 35 | 4122 |
| 5 | 1 | 61.8 | 69.8 | 4 / 35 | 4669 |
| 6 | 4 | 57.3 | 58.4 | 5 / 35 | 3796 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 26 | 4% |
| nat.PallasHawk 1.0 | 20 | 60% |
| bts.wiki.RipCurl 0.9b | 13 | 62% |
| brainfade.melee.Genghis 0.36 | 7 | 57% |
| jrm.Test0 1.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 50% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.Leon 1.01 | 47 | 26% | 51 |
| brainfade.melee.Genghis 0.36 | 32 | 18% | 33 |
| bts.wiki.RipCurl 0.9b | 29 | 16% | 38 |
| nat.PallasHawk 1.0 | 28 | 16% | 39 |
| jrm.Test0 1.0 | 18 | 10% | 18 |
| jp.Perpy 16.0 | 8 | 4% | 9 |
| jaybot.bots.Oddball 4.0 | 6 | 3% | 8 |
| stuff.Vlad 0.1 | 6 | 3% | 7 |
| cs.sheldor.Talon 1.1 | 5 | 3% | 7 |

## Melee bench: F13

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 60.2 | 1 / 210 | 4.59 | 11.6% | 22910 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.2 | 17.6% | 116 |
| ags.Glacier 0.2.11 | 1.8 | 17.1% | 52 |
| shinh.Entangled 0.3 | 3.3 | 12.8% | 25 |
| gh.micro.Gruweltje 0.7 | 3.8 | 12.3% | 12 |
| hadur117.mini.DeiseWHPH 0.2 | 4.8 | 11.6% | 1 |
| apc.Colossus2 0.17 | 6.2 | 8.1% | 3 |
| stelo.Wang 1.0 | 6.8 | 7.1% | 1 |
| ayk.WallHugger 1.0 | 8.2 | 5.5% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.6% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.6 | 58.1 | 0 / 35 | 3604 |
| 2 | 4 | 59.0 | 64.4 | 0 / 35 | 4003 |
| 3 | 5 | 55.3 | 55.6 | 0 / 35 | 3573 |
| 4 | 5 | 58.2 | 61.6 | 1 / 35 | 4024 |
| 5 | 5 | 57.4 | 60.3 | 0 / 35 | 4001 |
| 6 | 5 | 57.0 | 61.0 | 0 / 35 | 3705 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 10 | 0% |
| mn.Combat 3.25.0 | 7 | 0% |
| shinh.Entangled 0.3 | 5 | 20% |

Hadur died in 209 of 210 rounds, at a mean tick of 499. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 67 | 32% | 67 |
| ags.Glacier 0.2.11 | 66 | 32% | 66 |
| shinh.Entangled 0.3 | 27 | 13% | 28 |
| gh.micro.Gruweltje 0.7 | 24 | 11% | 24 |
| stelo.Wang 1.0 | 10 | 5% | 10 |
| apc.Colossus2 0.17 | 6 | 3% | 6 |
| sample.Tracker 1.0 | 4 | 2% | 4 |
| ayk.WallHugger 1.0 | 3 | 1% | 3 |
| maribo.FollowFire 1 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.2 | 106 / 210 | 2.33 | 18.8% | 36470 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPH 0.2 | 1.0 | 18.8% | 106 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.8% | 40 |
| catcat20.shape.Theta 0.018 | 2.8 | 13.4% | 47 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.8 | 9.8% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 5.3 | 9.4% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 5.7 | 9.6% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 7.0 | 8.8% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 8.1% | 6 |
| pa.Improved 1.0 | 9.0 | 5.6% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 81.3 | 14 / 35 | 5561 |
| 2 | 1 | 69.9 | 87.9 | 19 / 35 | 6238 |
| 3 | 1 | 70.5 | 90.2 | 22 / 35 | 6383 |
| 4 | 1 | 70.1 | 89.5 | 21 / 35 | 6292 |
| 5 | 1 | 68.5 | 83.5 | 17 / 35 | 6046 |
| 6 | 1 | 66.9 | 79.0 | 13 / 35 | 5950 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 66 | 82% |
| catcat20.shape.Theta 0.018 | 40 | 53% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 80% |
| sanyi.mikrobi.Roberto 1.0 | 9 | 67% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 44 | 42% | 64 |
| simonton.micro.Sprout 1.1.3 | 24 | 23% | 74 |
| dmh.robocode.robot.RedDwarf 0.4 | 15 | 14% | 18 |
| sanyi.mikrobi.Roberto 1.0 | 8 | 8% | 18 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 7% | 18 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 3% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 2% | 8 |
| sample.TrackFire 1.0 | 1 | 1% | 1 |
| pa.Improved 1.0 | 0 | 0% | 2 |

## Melee bench: F15

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 83.4 | 98 / 210 | 2.50 | 19.0% | 37493 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPH 0.2 | 1.0 | 19.0% | 98 |
| emp.Yngwie 1.11 | 2.8 | 13.0% | 57 |
| mld.DustBunny 3.8 | 3.0 | 12.9% | 9 |
| kawigi.micro.Shiz 1.1 | 3.2 | 12.8% | 14 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.1% | 13 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.5% | 15 |
| lambdaxy.TBot 0.1 | 7.5 | 6.7% | 1 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.4% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.1% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 87.0 | 18 / 35 | 6524 |
| 2 | 1 | 69.5 | 85.1 | 17 / 35 | 6364 |
| 3 | 1 | 67.2 | 78.1 | 17 / 35 | 5826 |
| 4 | 1 | 68.6 | 84.8 | 18 / 35 | 5715 |
| 5 | 1 | 69.5 | 83.8 | 14 / 35 | 6745 |
| 6 | 1 | 68.2 | 81.6 | 14 / 35 | 6319 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 40 | 40% |
| mld.DustBunny 3.8 | 32 | 94% |
| cb.nano.Insomnia 1.0 | 21 | 76% |
| kawigi.micro.Shiz 1.1 | 18 | 100% |
| kawigi.robot.Girl 1.2 | 16 | 94% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 100% |
| divineomega.TrialBot 0.003 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 937. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 51 | 46% | 85 |
| kawigi.robot.Girl 1.2 | 15 | 13% | 29 |
| cb.nano.Insomnia 1.0 | 14 | 13% | 11 |
| mld.DustBunny 3.8 | 11 | 10% | 35 |
| kawigi.micro.Shiz 1.1 | 9 | 8% | 24 |
| divineomega.TrialBot 0.003 | 5 | 4% | 16 |
| lambdaxy.TBot 0.1 | 4 | 4% | 4 |
| Grystrion.TrackerWO 1.0 | 3 | 3% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 70.2 | 46 / 210 | 3.69 | 15.7% | 33661 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.2 | 17.1% | 74 |
| hadur117.mini.DeiseWHPH 0.2 | 2.0 | 15.7% | 46 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.2 | 13.9% | 6 |
| techdude.forest.FlamingForest 1.1 | 3.7 | 12.7% | 59 |
| tvv.nano.Polaris 1.2 | 5.2 | 9.1% | 14 |
| bvh.fnr.Fenrir 0.36l | 6.5 | 8.0% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.5% | 3 |
| divineomega.DivineBot 1.9.4.5 | 8.2 | 6.0% | 5 |
| asd.Cthulhu 1.3 | 9.0 | 5.2% | 0 |
| repositorio.NanoStep 1.0 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 74.3 | 9 / 35 | 5524 |
| 2 | 1 | 66.1 | 75.2 | 7 / 35 | 6283 |
| 3 | 2 | 61.4 | 63.2 | 4 / 35 | 5060 |
| 4 | 2 | 65.9 | 72.1 | 12 / 35 | 5975 |
| 5 | 2 | 63.0 | 67.3 | 8 / 35 | 5494 |
| 6 | 3 | 63.5 | 68.9 | 6 / 35 | 5325 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 35 | 60% |
| techdude.forest.FlamingForest 1.1 | 22 | 32% |
| tvv.nano.Polaris 1.2 | 9 | 56% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 8 | 88% |
| stelo.IntrinsicVolatility 1.4 | 3 | 33% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |
| bvh.fnr.Fenrir 0.36l | 2 | 50% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 62 | 38% | 85 |
| techdude.forest.FlamingForest 1.1 | 38 | 23% | 47 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 22 | 13% | 27 |
| divineomega.DivineBot 1.9.4.5 | 11 | 7% | 16 |
| tvv.nano.Polaris 1.2 | 10 | 6% | 14 |
| stelo.IntrinsicVolatility 1.4 | 9 | 5% | 9 |
| bvh.fnr.Fenrir 0.36l | 8 | 5% | 8 |
| asd.Cthulhu 1.3 | 4 | 2% | 4 |

## Melee bench: F17

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 56.3 | 16 / 210 | 4.93 | 12.4% | 28726 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cx.BlestPain 1.41 | 2.0 | 13.7% | 63 |
| oog.melee.Mercutio 1.0 | 2.2 | 13.6% | 45 |
| et.Predator 1.8 | 2.8 | 13.0% | 37 |
| hadur117.mini.DeiseWHPH 0.2 | 4.2 | 12.4% | 16 |
| nic.Nicator 2.4 | 4.8 | 11.6% | 21 |
| ahf.NanoAndrew .4 | 5.2 | 11.6% | 26 |
| maribo.melee.BMV 0.1 | 6.8 | 9.3% | 3 |
| tex.Longbot 0.4 | 8.3 | 6.1% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 55.5 | 49.8 | 4 / 35 | 4407 |
| 2 | 2 | 60.2 | 62.2 | 6 / 35 | 4998 |
| 3 | 5 | 57.4 | 55.6 | 1 / 35 | 4744 |
| 4 | 4 | 58.2 | 56.8 | 1 / 35 | 4930 |
| 5 | 5 | 57.0 | 54.0 | 2 / 35 | 4799 |
| 6 | 3 | 58.7 | 59.4 | 2 / 35 | 4848 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 9 | 56% |
| nic.Nicator 2.4 | 8 | 13% |
| ahf.NanoAndrew .4 | 8 | 38% |
| cx.BlestPain 1.41 | 7 | 29% |
| et.Predator 1.8 | 7 | 57% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 195 of 210 rounds, at a mean tick of 602. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ahf.NanoAndrew .4 | 39 | 20% | 40 |
| cx.BlestPain 1.41 | 34 | 17% | 36 |
| nic.Nicator 2.4 | 32 | 16% | 34 |
| oog.melee.Mercutio 1.0 | 31 | 16% | 35 |
| et.Predator 1.8 | 27 | 14% | 32 |
| maribo.melee.BMV 0.1 | 25 | 13% | 26 |
| tex.Longbot 0.4 | 7 | 4% | 7 |

## Melee bench: F18

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 66.2 | 48 / 210 | 4.04 | 14.6% | 29986 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPH 0.2 | 1.3 | 14.6% | 48 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.6% | 49 |
| agd.Mooserwirt2 2.7 | 2.7 | 13.1% | 48 |
| uji.DBH 1.1 | 3.8 | 12.1% | 24 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.7% | 11 |
| ratosh.Nobo 0.21 | 5.7 | 9.6% | 3 |
| sigterm.Sigterm 1.0 | 7.2 | 8.1% | 16 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.5% | 7 |
| stelo.WangRobot 1.0 | 8.8 | 6.3% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 10.0 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.2 | 69.5 | 4 / 35 | 5199 |
| 2 | 1 | 61.7 | 66.0 | 11 / 35 | 4967 |
| 3 | 1 | 62.9 | 70.2 | 11 / 35 | 4928 |
| 4 | 3 | 56.9 | 55.2 | 5 / 35 | 4730 |
| 5 | 1 | 63.8 | 74.6 | 10 / 35 | 4967 |
| 6 | 1 | 60.5 | 61.9 | 7 / 35 | 5195 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 26 | 73% |
| uji.DBH 1.1 | 12 | 50% |
| agd.Mooserwirt2 2.7 | 11 | 9% |
| stelo.WangRobot 1.0 | 7 | 86% |
| spinnercat.Robovirus 2.718 | 7 | 100% |
| ratosh.Nobo 0.21 | 4 | 100% |
| sigterm.Sigterm 1.0 | 2 | 50% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 548. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 46 | 28% | 48 |
| uji.DBH 1.1 | 41 | 25% | 45 |
| morbid.MorbidPriest 1.0 | 26 | 16% | 49 |
| spinnercat.Robovirus 2.718 | 12 | 7% | 16 |
| ratosh.Nobo 0.21 | 10 | 6% | 15 |
| kawigi.mini.Fhqwhgads 1.1 | 9 | 6% | 13 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9 | 6% | 9 |
| sigterm.Sigterm 1.0 | 5 | 3% | 9 |
| stelo.WangRobot 1.0 | 4 | 2% | 6 |

## Melee bench: F19

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 95.8 | 168 / 210 | 1.38 | 21.8% | 38868 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPH 0.2 | 1.0 | 21.8% | 168 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.5 | 13.9% | 15 |
| mld.Infinity 2.2 | 2.5 | 13.4% | 17 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.0% | 0 |
| erdnis.Rover 0.3 | 4.8 | 10.8% | 6 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.4% | 3 |
| mbh.Mbh 0.1 | 7.3 | 7.1% | 0 |
| pac.ABC 2.1 | 7.8 | 6.8% | 1 |
| pbg.R2D2 1.0 | 8.8 | 5.8% | 1 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 94.3 | 26 / 35 | 5834 |
| 2 | 1 | 73.1 | 95.9 | 29 / 35 | 6716 |
| 3 | 1 | 72.9 | 97.5 | 29 / 35 | 6275 |
| 4 | 1 | 73.3 | 95.6 | 30 / 35 | 6943 |
| 5 | 1 | 73.1 | 95.6 | 27 / 35 | 6651 |
| 6 | 1 | 72.9 | 96.2 | 27 / 35 | 6449 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 91 | 96% |
| mld.Infinity 2.2 | 49 | 78% |
| krillr.mini.JointStrike 2.0.0 | 19 | 100% |
| erdnis.Rover 0.3 | 13 | 62% |
| patson.PatsonTestBot 1.0 | 9 | 89% |
| pac.ABC 2.1 | 6 | 100% |
| pbg.R2D2 1.0 | 2 | 50% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 1217. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 16 | 37% | 48 |
| erdnis.Rover 0.3 | 11 | 26% | 34 |
| davidalves.net.DuelistMiniMelee 1.2 | 5 | 12% | 64 |
| patson.PatsonTestBot 1.0 | 5 | 12% | 24 |
| krillr.mini.JointStrike 2.0.0 | 3 | 7% | 22 |
| pbg.R2D2 1.0 | 1 | 2% | 7 |
| mbh.Mbh 0.1 | 1 | 2% | 1 |
| pac.ABC 2.1 | 0 | 0% | 8 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 82.9 | 75 / 210 | 2.54 | 18.6% | 38645 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPH 0.2 | 1.2 | 18.6% | 75 |
| trm.Wrekt 1.1.6.f | 1.8 | 16.8% | 77 |
| catcat20.Rabbit 0.001 | 3.7 | 11.1% | 29 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 10.6% | 5 |
| fwb.Nine 1.0.1 | 4.5 | 10.5% | 17 |
| djdjdj.NanoSkunk10 1.0 | 6.7 | 7.8% | 2 |
| m3thos.mini.Eva01 0.5.5 | 7.0 | 7.6% | 0 |
| bayen.nut.Squirrel 1.615 | 7.5 | 7.2% | 6 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 6.0% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 78.7 | 12 / 35 | 6023 |
| 2 | 2 | 68.5 | 82.9 | 11 / 35 | 6427 |
| 3 | 1 | 68.4 | 82.9 | 15 / 35 | 6453 |
| 4 | 1 | 69.2 | 83.5 | 14 / 35 | 6694 |
| 5 | 1 | 68.6 | 84.1 | 11 / 35 | 6752 |
| 6 | 1 | 68.1 | 85.1 | 12 / 35 | 6296 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 72 | 44% |
| catcat20.Rabbit 0.001 | 26 | 42% |
| fwb.Nine 1.0.1 | 17 | 65% |
| nz.jdc.nano.GridFu 1.0 | 11 | 100% |
| m3thos.mini.Eva01 0.5.5 | 5 | 100% |
| bayen.nut.Squirrel 1.615 | 5 | 40% |
| djdjdj.NanoSkunk10 1.0 | 3 | 33% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 914. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 69 | 51% | 90 |
| catcat20.Rabbit 0.001 | 30 | 22% | 47 |
| fwb.Nine 1.0.1 | 14 | 10% | 21 |
| nz.jdc.nano.GridFu 1.0 | 7 | 5% | 19 |
| bayen.nut.Squirrel 1.615 | 7 | 5% | 11 |
| m3thos.mini.Eva01 0.5.5 | 4 | 3% | 11 |
| djdjdj.NanoSkunk10 1.0 | 3 | 2% | 6 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F21

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 89.4 | 103 / 210 | 1.96 | 19.9% | 38198 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPH 0.2 | 1.0 | 19.9% | 103 |
| eem.EvBot v4.6.16 | 2.0 | 16.6% | 84 |
| dummy.mini.Scimitar 1.01 | 3.2 | 12.9% | 10 |
| cf.RiO.RiOx 4.2.1 | 3.8 | 11.8% | 7 |
| eld.Hmm 1.0 | 5.5 | 8.4% | 7 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.5% | 0 |
| fire219.CatBot 1.0 | 7.7 | 6.1% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.8% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 89.8 | 17 / 35 | 6705 |
| 2 | 1 | 69.4 | 87.6 | 14 / 35 | 6057 |
| 3 | 1 | 70.5 | 90.2 | 18 / 35 | 6509 |
| 4 | 1 | 70.2 | 88.9 | 19 / 35 | 5979 |
| 5 | 1 | 71.3 | 92.7 | 21 / 35 | 6636 |
| 6 | 1 | 69.5 | 87.0 | 14 / 35 | 6312 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 97 | 51% |
| dummy.mini.Scimitar 1.01 | 23 | 91% |
| cf.RiO.RiOx 4.2.1 | 19 | 95% |
| eld.Hmm 1.0 | 8 | 75% |
| oa.weak.BotherBot 0.1 | 6 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 1136. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 74 | 69% | 116 |
| dummy.mini.Scimitar 1.01 | 16 | 15% | 36 |
| cf.RiO.RiOx 4.2.1 | 11 | 10% | 24 |
| eld.Hmm 1.0 | 3 | 3% | 18 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 9 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |
| fire219.CatBot 1.0 | 1 | 1% | 2 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |

## Melee bench: F22

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 70.7 | 20 / 210 | 3.63 | 14.9% | 32290 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxDT 2.71m | 1.0 | 18.3% | 108 |
| hadur117.mini.DeiseWHPH 0.2 | 2.5 | 14.9% | 20 |
| kvk.HebusLeTroll 0.35 | 2.5 | 15.3% | 42 |
| jlm.javaDisturbance 0.59 | 4.3 | 12.5% | 25 |
| bigpete.Stewie 1.0 | 4.7 | 11.3% | 11 |
| yk.JahRoslav 1.1 | 6.8 | 6.8% | 3 |
| tad.Dalek98 0.98 | 7.0 | 6.8% | 2 |
| gg.Squaraus 0.6 | 7.2 | 6.5% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.7% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 74.3 | 4 / 35 | 5426 |
| 2 | 3 | 60.9 | 65.1 | 1 / 35 | 4894 |
| 3 | 3 | 63.4 | 69.8 | 2 / 35 | 5395 |
| 4 | 2 | 64.6 | 75.2 | 3 / 35 | 5480 |
| 5 | 2 | 63.7 | 67.6 | 6 / 35 | 5503 |
| 6 | 3 | 64.6 | 72.4 | 4 / 35 | 5592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 23 | 0% |
| kvk.HebusLeTroll 0.35 | 21 | 48% |
| jlm.javaDisturbance 0.59 | 11 | 27% |
| bigpete.Stewie 1.0 | 9 | 67% |
| yk.JahRoslav 1.1 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 0% |

Hadur died in 190 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 98 | 52% | 100 |
| kvk.HebusLeTroll 0.35 | 47 | 25% | 52 |
| jlm.javaDisturbance 0.59 | 20 | 11% | 23 |
| bigpete.Stewie 1.0 | 14 | 7% | 22 |
| yk.JahRoslav 1.1 | 5 | 3% | 6 |
| tad.Dalek98 0.98 | 4 | 2% | 4 |
| gg.Squaraus 0.6 | 2 | 1% | 2 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 80.1 | 56 / 210 | 2.79 | 17.2% | 33919 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.2 | 18.6% | 105 |
| hadur117.mini.DeiseWHPH 0.2 | 1.8 | 17.2% | 56 |
| cre.Karolos 0.32 | 3.0 | 14.7% | 35 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.8% | 5 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.1% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 8.9% | 2 |
| cw.megas.Blade 0.8 | 7.3 | 7.7% | 0 |
| sample.Walls 1.0 | 7.5 | 7.9% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 83.8 | 10 / 35 | 5996 |
| 2 | 2 | 67.4 | 81.9 | 9 / 35 | 5558 |
| 3 | 2 | 66.1 | 74.3 | 8 / 35 | 5564 |
| 4 | 2 | 68.8 | 84.1 | 10 / 35 | 5819 |
| 5 | 2 | 66.2 | 75.6 | 8 / 35 | 5579 |
| 6 | 2 | 67.9 | 81.0 | 11 / 35 | 5403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 52 | 17% |
| cre.Karolos 0.32 | 22 | 45% |
| stelo.AreaTargetingBot 1.1 | 17 | 100% |
| sample.Walls 1.0 | 9 | 100% |
| stelo.RamTrackSurfer 1.2 | 7 | 57% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 86 | 56% | 100 |
| cre.Karolos 0.32 | 46 | 30% | 63 |
| stelo.AreaTargetingBot 1.1 | 10 | 6% | 16 |
| stelo.RamTrackSurfer 1.2 | 6 | 4% | 20 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 1% | 4 |
| cw.megas.Blade 0.8 | 2 | 1% | 2 |
| sample.Walls 1.0 | 1 | 1% | 4 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F24

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.2 | 56.7 | 11 / 210 | 4.90 | 11.7% | 23430 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.5 | 15.0% | 53 |
| florent.XSeries.X2 0.12 | 2.0 | 13.9% | 46 |
| davidalves.Phoenix 0.54 | 2.5 | 13.7% | 63 |
| hadur117.mini.DeiseWHPH 0.2 | 4.5 | 11.7% | 11 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.4% | 21 |
| oog.melee.Corsair 1.0 | 5.8 | 10.5% | 14 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 8.1% | 4 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.3% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 5.1% | 1 |
| evd.X1 0.01 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.7 | 56.2 | 2 / 35 | 3684 |
| 2 | 5 | 55.5 | 54.3 | 1 / 35 | 3829 |
| 3 | 4 | 56.7 | 58.7 | 2 / 35 | 3834 |
| 4 | 5 | 54.0 | 54.0 | 0 / 35 | 3714 |
| 5 | 5 | 55.7 | 54.0 | 3 / 35 | 3814 |
| 6 | 4 | 59.5 | 62.9 | 3 / 35 | 4555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 10 | 50% |
| davidalves.Phoenix 0.54 | 9 | 11% |
| florent.XSeries.X2 0.12 | 8 | 13% |
| pedersen.Ugluk 1.1.1 | 4 | 0% |
| stelo.SoJNanoMelee 1.1 | 4 | 100% |
| oog.melee.Corsair 1.0 | 3 | 0% |

Hadur died in 200 of 210 rounds, at a mean tick of 536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 47 | 24% | 48 |
| davidalves.Phoenix 0.54 | 42 | 21% | 44 |
| rz.GlowBlowMelee 1.4 | 38 | 19% | 43 |
| oog.melee.Corsair 1.0 | 34 | 17% | 35 |
| pedersen.Ugluk 1.1.1 | 27 | 14% | 29 |
| stelo.SoJNanoMelee 1.1 | 5 | 3% | 5 |
| as.FrankTheTank 1.3 | 3 | 2% | 3 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 75.8 | 96 / 210 | 3.18 | 16.8% | 28508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPH 0.2 | 1.0 | 16.8% | 96 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.3% | 33 |
| voidious.micro.BlitzBat 1.05 | 3.3 | 12.1% | 16 |
| jdw.Hurricane 1.4 | 3.5 | 11.7% | 23 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.6% | 10 |
| ds.Oo 2.2 | 5.3 | 10.1% | 16 |
| gjr.Cephalosporin 0.1 | 7.8 | 7.7% | 6 |
| awesomeness.Elite 1.0 | 8.0 | 7.3% | 7 |
| adt.Ar2 1.1 | 8.2 | 6.8% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 75.9 | 17 / 35 | 4716 |
| 2 | 1 | 61.0 | 64.4 | 12 / 35 | 4196 |
| 3 | 1 | 68.3 | 85.1 | 18 / 35 | 5221 |
| 4 | 1 | 64.2 | 73.3 | 14 / 35 | 4755 |
| 5 | 1 | 66.3 | 78.4 | 20 / 35 | 4744 |
| 6 | 1 | 65.8 | 77.8 | 15 / 35 | 4876 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 33 | 82% |
| voidious.micro.BlitzBat 1.05 | 29 | 100% |
| jdw.Hurricane 1.4 | 27 | 74% |
| ds.Oo 2.2 | 9 | 100% |
| awesomeness.Elite 1.0 | 7 | 43% |
| gre.svman4.Morfeas 1.4.1 | 7 | 43% |
| adt.Ar2 1.1 | 3 | 67% |
| gjr.Cephalosporin 0.1 | 2 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 539. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 29 | 25% | 53 |
| jdw.Hurricane 1.4 | 23 | 20% | 39 |
| voidious.micro.BlitzBat 1.05 | 15 | 13% | 32 |
| awesomeness.Elite 1.0 | 15 | 13% | 19 |
| ds.Oo 2.2 | 11 | 10% | 25 |
| gre.svman4.Morfeas 1.4.1 | 10 | 9% | 14 |
| gjr.Cephalosporin 0.1 | 5 | 4% | 13 |
| adt.Ar2 1.1 | 4 | 4% | 13 |
| amk.ChumbaMini 0.2 | 2 | 2% | 2 |

## Melee bench: F26

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 76.1 | 50 / 210 | 3.15 | 16.5% | 36352 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPH 0.2 | 1.3 | 16.5% | 50 |
| ak.Fermat 2.0 | 1.7 | 16.5% | 82 |
| lrem.Spectre 0.4.4 | 3.3 | 12.6% | 22 |
| shu.nitro.LENIN .T34 | 4.2 | 11.7% | 32 |
| js.PinBall 1.6 | 5.2 | 10.5% | 10 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.8% | 7 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 8.9% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 7.0% | 4 |
| sample.SpinBot 1.0 | 9.0 | 4.5% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 75.9 | 6 / 35 | 5887 |
| 2 | 1 | 66.4 | 77.5 | 9 / 35 | 6130 |
| 3 | 2 | 63.3 | 67.3 | 5 / 35 | 5924 |
| 4 | 1 | 65.8 | 76.5 | 9 / 35 | 5673 |
| 5 | 1 | 67.0 | 78.4 | 11 / 35 | 6380 |
| 6 | 1 | 67.4 | 81.0 | 10 / 35 | 6358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| lrem.Spectre 0.4.4 | 31 | 81% |
| ak.Fermat 2.0 | 19 | 26% |
| shu.nitro.LENIN .T34 | 17 | 47% |
| js.PinBall 1.6 | 14 | 50% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 33% |
| gh.mini.GrubbmOne 1.0 | 3 | 33% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 50% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 76 | 47% | 81 |
| lrem.Spectre 0.4.4 | 21 | 13% | 35 |
| shu.nitro.LENIN .T34 | 20 | 12% | 33 |
| jaybot.adv.bots.JayBot 2.0 | 18 | 11% | 20 |
| js.PinBall 1.6 | 16 | 10% | 24 |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 4% | 10 |
| gh.mini.GrubbmOne 1.0 | 4 | 2% | 6 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |

## Melee bench: F27

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 75.7 | 63 / 210 | 3.19 | 16.0% | 28924 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.3 | 16.1% | 98 |
| hadur117.mini.DeiseWHPH 0.2 | 1.7 | 16.0% | 63 |
| EH.Eagle 1.0.6 | 3.7 | 11.4% | 10 |
| wee.Gem 1.8.4 | 3.7 | 11.4% | 22 |
| sheldor.melee.nano.TestMelee 0.1 | 5.0 | 10.2% | 10 |
| joe.ADinosaur 1.0 | 6.7 | 8.2% | 4 |
| techdude.kombat.FlamingKombat 1.5 | 6.7 | 8.6% | 1 |
| throxbot.ThroxBot 0.1 | 7.8 | 7.9% | 2 |
| cs.Grudge 1.0 | 9.2 | 5.4% | 0 |
| caimano.Furia_Ceca 0.22 | 9.3 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 78.7 | 13 / 35 | 4422 |
| 2 | 2 | 65.6 | 80.3 | 8 / 35 | 5004 |
| 3 | 2 | 62.8 | 69.5 | 10 / 35 | 4672 |
| 4 | 2 | 64.2 | 76.8 | 9 / 35 | 4835 |
| 5 | 1 | 65.0 | 76.2 | 14 / 35 | 4766 |
| 6 | 2 | 64.2 | 72.4 | 9 / 35 | 5225 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 56 | 27% |
| EH.Eagle 1.0.6 | 19 | 100% |
| wee.Gem 1.8.4 | 18 | 78% |
| joe.ADinosaur 1.0 | 9 | 78% |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 2 | 100% |
| throxbot.ThroxBot 0.1 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 78 | 52% | 93 |
| joe.ADinosaur 1.0 | 16 | 11% | 21 |
| wee.Gem 1.8.4 | 13 | 9% | 27 |
| EH.Eagle 1.0.6 | 12 | 8% | 28 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 8% | 18 |
| techdude.kombat.FlamingKombat 1.5 | 8 | 5% | 12 |
| throxbot.ThroxBot 0.1 | 5 | 3% | 5 |
| cs.Grudge 1.0 | 3 | 2% | 3 |
| caimano.Furia_Ceca 0.22 | 2 | 1% | 3 |

## Melee bench: F28

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 81.0 | 88 / 210 | 2.71 | 17.0% | 28362 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPH 0.2 | 1.0 | 17.0% | 88 |
| kid.test.NightFox .2 | 2.0 | 14.5% | 26 |
| uji.Antique 1.0 | 3.3 | 12.9% | 57 |
| pfvicm.Sobieski 7.2.3b | 4.2 | 11.2% | 7 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.9% | 20 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.2% | 3 |
| ahr.ice.Ice 1.0.2 | 7.0 | 7.8% | 5 |
| matt.advanced.Katana 1.0 | 8.0 | 6.9% | 2 |
| stelo.Lifestealer 1.0 | 9.2 | 5.4% | 1 |
| stelo.PianistNano 1.2 | 9.5 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.9 | 21 / 35 | 4994 |
| 2 | 1 | 65.0 | 80.3 | 12 / 35 | 4715 |
| 3 | 1 | 65.2 | 80.3 | 12 / 35 | 4580 |
| 4 | 1 | 66.1 | 82.5 | 14 / 35 | 4719 |
| 5 | 1 | 62.6 | 70.8 | 11 / 35 | 4528 |
| 6 | 1 | 66.9 | 83.8 | 18 / 35 | 4826 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 47 | 94% |
| uji.Antique 1.0 | 38 | 29% |
| qohnil.blot.BlotBot 3.61 | 15 | 73% |
| matt.advanced.Katana 1.0 | 8 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |
| amk.ChumbaWumba 0.3 | 5 | 80% |
| ahr.ice.Ice 1.0.2 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 56 | 46% | 70 |
| pfvicm.Sobieski 7.2.3b | 21 | 17% | 32 |
| qohnil.blot.BlotBot 3.61 | 16 | 13% | 31 |
| kid.test.NightFox .2 | 15 | 12% | 31 |
| amk.ChumbaWumba 0.3 | 7 | 6% | 13 |
| ahr.ice.Ice 1.0.2 | 3 | 2% | 10 |
| stelo.Lifestealer 1.0 | 3 | 2% | 5 |
| matt.advanced.Katana 1.0 | 1 | 1% | 12 |
| stelo.PianistNano 1.2 | 1 | 1% | 6 |

## Melee bench: F29

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 70.5 | 38 / 210 | 3.65 | 15.7% | 31754 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.8 | 16.3% | 89 |
| deewiant.Anomaly 0.2 | 2.0 | 15.6% | 60 |
| hadur117.mini.DeiseWHPH 0.2 | 2.2 | 15.7% | 38 |
| myl.micro.Troodon 1.10 | 4.0 | 11.7% | 6 |
| jok.PheonixM 0.1.2 | 5.2 | 10.1% | 8 |
| ph.melee.ArcherME 0.3 | 5.8 | 8.6% | 2 |
| DBall.Anarchy 0.1 | 7.2 | 6.7% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.9% | 0 |
| ap.Frederick 1.1 | 9.2 | 5.1% | 3 |
| jangs.ns51 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 70.5 | 7 / 35 | 5292 |
| 2 | 2 | 64.9 | 73.0 | 5 / 35 | 5341 |
| 3 | 2 | 64.8 | 71.1 | 6 / 35 | 5537 |
| 4 | 2 | 65.3 | 72.4 | 6 / 35 | 5676 |
| 5 | 3 | 63.0 | 66.7 | 6 / 35 | 5025 |
| 6 | 2 | 63.6 | 69.5 | 8 / 35 | 4883 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 38 | 24% |
| zyx.mega.YersiniaPestis 3.1 | 30 | 10% |
| myl.micro.Troodon 1.10 | 14 | 93% |
| jok.PheonixM 0.1.2 | 8 | 88% |
| ph.melee.ArcherME 0.3 | 3 | 67% |
| DBall.Anarchy 0.1 | 2 | 100% |
| ap.Frederick 1.1 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 174 of 210 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 72 | 41% | 84 |
| zyx.mega.YersiniaPestis 3.1 | 61 | 35% | 67 |
| myl.micro.Troodon 1.10 | 13 | 7% | 18 |
| jok.PheonixM 0.1.2 | 12 | 7% | 18 |
| ph.melee.ArcherME 0.3 | 7 | 4% | 10 |
| fullsail.TimbotNoPrediction 1.0 | 6 | 3% | 6 |
| DBall.Anarchy 0.1 | 3 | 2% | 6 |
| jangs.ns51 1.0 | 0 | 0% | 1 |

## Melee bench: F30

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 52.9 | 47.7 | 6 / 210 | 5.70 | 10.2% | 22673 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.7 | 14.5% | 72 |
| darkcanuck.B26354 1.06 | 2.2 | 13.9% | 51 |
| stelo.PastFuture 2.3.2 | 2.7 | 13.9% | 35 |
| oog.melee.Capulet 1.2 | 3.5 | 13.2% | 25 |
| hadur117.mini.DeiseWHPH 0.2 | 5.2 | 10.2% | 6 |
| intruder.PrairieWolf 2.61 | 6.2 | 9.4% | 12 |
| ntc.Opposite 1.5 | 7.7 | 7.8% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 7.5% | 4 |
| tripphippy.Alice 1.1 | 8.0 | 7.4% | 5 |
| GarmBox.Anger 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 51.6 | 44.4 | 3 / 35 | 3601 |
| 2 | 5 | 54.0 | 51.4 | 0 / 35 | 3876 |
| 3 | 6 | 52.1 | 47.0 | 1 / 35 | 3585 |
| 4 | 5 | 53.0 | 46.7 | 2 / 35 | 3919 |
| 5 | 5 | 52.5 | 47.6 | 0 / 35 | 3697 |
| 6 | 5 | 54.0 | 49.2 | 0 / 35 | 3995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 7 | 14% |
| stelo.PastFuture 2.3.2 | 5 | 40% |
| oog.melee.Capulet 1.2 | 2 | 100% |
| darkcanuck.B26354 1.06 | 2 | 50% |
| intruder.PrairieWolf 2.61 | 1 | 0% |

Hadur died in 204 of 210 rounds, at a mean tick of 487. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 51 | 25% | 52 |
| stelo.PastFuture 2.3.2 | 40 | 20% | 41 |
| oog.melee.Capulet 1.2 | 28 | 14% | 31 |
| darkcanuck.B26354 1.06 | 27 | 13% | 27 |
| intruder.PrairieWolf 2.61 | 21 | 10% | 21 |
| tripphippy.Alice 1.1 | 15 | 7% | 15 |
| fowl3628800.LightningBolt 2.6.0 | 12 | 6% | 12 |
| ntc.Opposite 1.5 | 8 | 4% | 8 |
| GarmBox.Anger 1.0 | 2 | 1% | 3 |

## Melee bench: F31

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.0 | 53.6 | 6 / 210 | 5.18 | 11.1% | 21882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.5% | 117 |
| gh.mini.Griezel 0.2 | 2.2 | 14.0% | 44 |
| d414.nano.Quantum 1.0.0 | 3.5 | 11.9% | 14 |
| spinnercat.micro.Tyger 0.1 | 4.2 | 11.6% | 13 |
| hadur117.mini.DeiseWHPH 0.2 | 4.5 | 11.1% | 6 |
| gh.nano.Grofvuil 0.2 | 5.7 | 9.7% | 13 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.7% | 4 |
| fm.mammillarias 1.3 | 7.5 | 6.7% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.1 | 54.0 | 2 / 35 | 3294 |
| 2 | 5 | 52.1 | 46.7 | 2 / 35 | 3179 |
| 3 | 4 | 56.3 | 55.6 | 1 / 35 | 3904 |
| 4 | 5 | 53.8 | 51.7 | 0 / 35 | 3550 |
| 5 | 5 | 54.8 | 53.3 | 0 / 35 | 3666 |
| 6 | 3 | 58.3 | 60.3 | 1 / 35 | 4289 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 9 | 11% |
| gh.mini.Griezel 0.2 | 8 | 38% |
| fm.mammillarias 1.3 | 1 | 100% |
| spinnercat.micro.Tyger 0.1 | 1 | 100% |

Hadur died in 204 of 210 rounds, at a mean tick of 527. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 61 | 30% | 62 |
| gh.mini.Griezel 0.2 | 49 | 24% | 52 |
| d414.nano.Quantum 1.0.0 | 28 | 14% | 28 |
| gh.nano.Grofvuil 0.2 | 21 | 10% | 22 |
| spinnercat.micro.Tyger 0.1 | 19 | 9% | 20 |
| timmit.nano.TimDog 0.33 | 13 | 6% | 13 |
| fm.mammillarias 1.3 | 9 | 4% | 9 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 1% | 3 |
| tlp.ThreeLeggedPig 1 | 1 | 0% | 1 |

## Melee bench: F32

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 75.7 | 57 / 210 | 3.19 | 15.9% | 30008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPH 0.2 | 1.2 | 15.9% | 57 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.8% | 65 |
| apc.botM 3.0 | 2.8 | 13.0% | 47 |
| lxx.ConceptA 0.8 | 4.5 | 9.6% | 8 |
| vjik.UnViolation 1.1 | 5.0 | 10.1% | 14 |
| bayen.UbaMicro 1.4 | 5.5 | 9.1% | 4 |
| panzer.Panzer 0.2 | 7.0 | 7.7% | 1 |
| yk.JahMicro 1.0 | 8.5 | 7.1% | 7 |
| conscience.Electron 1.3g | 9.0 | 6.7% | 2 |
| donjezza.Jezza 1.0 | 9.5 | 5.9% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 74.9 | 9 / 35 | 5011 |
| 2 | 1 | 64.9 | 79.0 | 10 / 35 | 5327 |
| 3 | 1 | 63.8 | 75.6 | 12 / 35 | 4888 |
| 4 | 1 | 63.1 | 73.3 | 10 / 35 | 4931 |
| 5 | 1 | 64.3 | 76.8 | 8 / 35 | 5093 |
| 6 | 1 | 62.8 | 74.6 | 8 / 35 | 4758 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 51 | 35% |
| apc.botM 3.0 | 25 | 24% |
| lxx.ConceptA 0.8 | 13 | 77% |
| vjik.UnViolation 1.1 | 12 | 75% |
| donjezza.Jezza 1.0 | 5 | 80% |
| yk.JahMicro 1.0 | 4 | 75% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| panzer.Panzer 0.2 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 0% |

Hadur died in 153 of 210 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 53 | 35% | 71 |
| apc.botM 3.0 | 42 | 27% | 47 |
| lxx.ConceptA 0.8 | 15 | 10% | 19 |
| bayen.UbaMicro 1.4 | 14 | 9% | 18 |
| vjik.UnViolation 1.1 | 9 | 6% | 25 |
| conscience.Electron 1.3g | 8 | 5% | 13 |
| panzer.Panzer 0.2 | 6 | 4% | 8 |
| yk.JahMicro 1.0 | 4 | 3% | 7 |
| donjezza.Jezza 1.0 | 2 | 1% | 2 |

## Melee bench: F33

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 63.2 | 27 / 210 | 4.31 | 13.8% | 28931 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 16.4% | 73 |
| hadur117.mini.DeiseWHPH 0.2 | 2.2 | 13.8% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.4% | 32 |
| gre.svman4.Leonidas 1.3.2 | 3.8 | 12.1% | 30 |
| labg.Cataclysm 2.05 | 4.8 | 11.3% | 32 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.2 | 9.8% | 14 |
| baal.nano.N 1.42 | 6.7 | 9.1% | 1 |
| zyx.micro.Ant 1.1 | 8.2 | 5.8% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 4.7% | 0 |
| sanja.First 0.1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.3 | 58.1 | 3 / 35 | 4392 |
| 2 | 2 | 60.8 | 63.5 | 3 / 35 | 5006 |
| 3 | 2 | 62.5 | 67.0 | 6 / 35 | 5072 |
| 4 | 2 | 61.9 | 66.0 | 5 / 35 | 5097 |
| 5 | 2 | 59.9 | 61.9 | 6 / 35 | 4554 |
| 6 | 3 | 60.7 | 62.5 | 4 / 35 | 4810 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 23 | 30% |
| gre.svman4.Leonidas 1.3.2 | 16 | 38% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 67% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 33% |
| labg.Cataclysm 2.05 | 3 | 0% |
| baal.nano.N 1.42 | 1 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 185 of 210 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 56 | 30% | 64 |
| gre.svman4.Leonidas 1.3.2 | 34 | 18% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 13% | 32 |
| kinsen.melee.Angsaichmophobia 1.8c | 23 | 12% | 24 |
| labg.Cataclysm 2.05 | 22 | 12% | 24 |
| baal.nano.N 1.42 | 14 | 8% | 15 |
| zyx.micro.Ant 1.1 | 6 | 3% | 7 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 4 | 2% | 4 |
| sanja.First 0.1 | 2 | 1% | 2 |

## Melee bench: F34

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 68.7 | 15 / 210 | 3.81 | 14.1% | 29504 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.2 | 17.8% | 103 |
| kid.Gladiator .7.2 | 1.8 | 16.3% | 56 |
| hadur117.mini.DeiseWHPH 0.2 | 3.0 | 14.1% | 15 |
| jcs.Seth 1.8 | 4.5 | 11.3% | 20 |
| tcf.Reach 3 | 4.7 | 11.9% | 8 |
| cli.Dancer 1.1 | 5.8 | 10.1% | 8 |
| ratosh.Wesco 1.4 | 7.0 | 6.9% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.2% | 0 |
| sample.RamFire 1.0 | 9.3 | 3.2% | 0 |
| sample.VelociRobot 1.0 | 9.7 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.4 | 69.5 | 5 / 35 | 5051 |
| 2 | 3 | 62.5 | 67.6 | 2 / 35 | 5153 |
| 3 | 3 | 61.5 | 64.8 | 3 / 35 | 4675 |
| 4 | 3 | 62.0 | 68.3 | 1 / 35 | 4843 |
| 5 | 3 | 63.8 | 72.7 | 2 / 35 | 5292 |
| 6 | 3 | 62.2 | 69.5 | 2 / 35 | 4490 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 28 | 4% |
| kid.Gladiator .7.2 | 16 | 56% |
| jcs.Seth 1.8 | 4 | 75% |
| tcf.Reach 3 | 2 | 100% |
| cli.Dancer 1.1 | 1 | 0% |

Hadur died in 195 of 210 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 72 | 37% | 74 |
| kid.Gladiator .7.2 | 51 | 26% | 55 |
| tcf.Reach 3 | 32 | 16% | 36 |
| jcs.Seth 1.8 | 22 | 11% | 26 |
| cli.Dancer 1.1 | 16 | 8% | 17 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |

## Melee bench: F35

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 65.4 | 4 / 210 | 4.11 | 13.0% | 24375 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 171 |
| gh.mini.Gruwel 0.9 | 2.7 | 13.1% | 19 |
| hadur117.mini.DeiseWHPH 0.2 | 2.7 | 13.0% | 4 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 11.5% | 12 |
| rz.HawkOnFire 0.1 | 4.5 | 11.4% | 2 |
| wit.Chuliath 1.0 | 6.7 | 7.3% | 1 |
| myl.nano.KomoriNinja 1.1 | 7.0 | 7.0% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 6.3% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 5.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.2 | 64.4 | 1 / 35 | 3857 |
| 2 | 2 | 61.7 | 70.5 | 1 / 35 | 4642 |
| 3 | 2 | 59.5 | 65.4 | 1 / 35 | 4120 |
| 4 | 3 | 60.7 | 65.7 | 1 / 35 | 4284 |
| 5 | 3 | 59.4 | 65.1 | 0 / 35 | 3913 |
| 6 | 3 | 56.8 | 61.3 | 0 / 35 | 3559 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 27 | 4% |
| gh.mini.Gruwel 0.9 | 6 | 0% |
| dmh.robocode.robot.BlackDeath 9.2 | 2 | 0% |
| rz.HawkOnFire 0.1 | 2 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 206 of 210 rounds, at a mean tick of 560. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 94 | 46% | 95 |
| gh.mini.Gruwel 0.9 | 44 | 21% | 45 |
| dmh.robocode.robot.BlackDeath 9.2 | 36 | 17% | 36 |
| rz.HawkOnFire 0.1 | 16 | 8% | 17 |
| myl.nano.KomoriNinja 1.1 | 6 | 3% | 6 |
| wit.Chuliath 1.0 | 6 | 3% | 6 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 1% | 3 |
| stelo.MyAgileRobot 0.2 | 1 | 0% | 1 |
| dans.Cinnamon 1.2 | 0 | 0% | 1 |

## Melee bench: F36

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 85.3 | 121 / 210 | 2.32 | 19.4% | 35694 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPH 0.2 | 1.0 | 19.4% | 121 |
| alpha.RainingFire 1.0 | 2.3 | 12.9% | 30 |
| bzdp.Pansy 2.1 | 3.5 | 11.5% | 17 |
| mz.Cork 0.1 | 3.8 | 11.2% | 16 |
| bvh.micro.Freya 0.3 | 4.7 | 10.1% | 9 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.2% | 12 |
| bvh.mini.Fenrir 0.39 | 6.5 | 8.7% | 2 |
| dl.BetterWalls 1.0 | 8.2 | 6.9% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 6.2% | 2 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 88.9 | 21 / 35 | 6210 |
| 2 | 1 | 69.5 | 85.7 | 22 / 35 | 6101 |
| 3 | 1 | 69.5 | 86.3 | 23 / 35 | 5723 |
| 4 | 1 | 69.2 | 86.0 | 18 / 35 | 6092 |
| 5 | 1 | 67.9 | 82.9 | 17 / 35 | 5753 |
| 6 | 1 | 68.3 | 81.9 | 20 / 35 | 5815 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 35 | 83% |
| alpha.RainingFire 1.0 | 31 | 58% |
| mz.Cork 0.1 | 29 | 86% |
| bvh.micro.Freya 0.3 | 17 | 76% |
| bvh.mini.Fenrir 0.39 | 16 | 100% |
| m3thos.Eva02 0.7.1 | 11 | 82% |
| dl.BetterWalls 1.0 | 8 | 100% |
| sample.MyFirstRobot 1.0 | 3 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 0% |

Hadur died in 90 of 210 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 25 | 28% | 44 |
| mz.Cork 0.1 | 16 | 18% | 45 |
| bzdp.Pansy 2.1 | 16 | 18% | 38 |
| bvh.micro.Freya 0.3 | 16 | 18% | 31 |
| m3thos.Eva02 0.7.1 | 6 | 7% | 20 |
| squidM.TentalceMeleeNano 1.1 | 6 | 7% | 7 |
| bvh.mini.Fenrir 0.39 | 4 | 4% | 11 |
| dl.BetterWalls 1.0 | 1 | 1% | 12 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F37

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 83.1 | 126 / 210 | 2.52 | 18.3% | 35787 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPH 0.2 | 1.0 | 18.3% | 126 |
| germ.TheMind .2 | 2.8 | 11.1% | 15 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.2 | 10.4% | 7 |
| agrach.Dalek 1.0 | 4.2 | 9.7% | 33 |
| EBBU.Sim2 1.02 | 6.2 | 9.0% | 4 |
| stelo.UntouchableNano 1.3 | 6.5 | 8.9% | 13 |
| lmk.ACPFinal 0.1 | 6.5 | 8.8% | 7 |
| mb.Beast 0.1 | 7.7 | 8.2% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 8.2 | 8.0% | 0 |
| skm.Ryubot 1.0 | 8.8 | 7.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 83.8 | 22 / 35 | 5533 |
| 2 | 1 | 67.2 | 83.8 | 22 / 35 | 6092 |
| 3 | 1 | 66.7 | 81.9 | 20 / 35 | 6140 |
| 4 | 1 | 65.8 | 79.4 | 20 / 35 | 5639 |
| 5 | 1 | 68.0 | 87.6 | 23 / 35 | 5973 |
| 6 | 1 | 67.2 | 82.2 | 19 / 35 | 6410 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 28 | 96% |
| agrach.Dalek 1.0 | 25 | 56% |
| com.syncleus.robocode.Dreadnaught 0.1 | 19 | 100% |
| stelo.UntouchableNano 1.3 | 16 | 81% |
| skm.Ryubot 1.0 | 15 | 100% |
| lmk.ACPFinal 0.1 | 15 | 93% |
| EBBU.Sim2 1.02 | 13 | 77% |
| mb.Beast 0.1 | 11 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 478. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 27 | 31% | 51 |
| stelo.UntouchableNano 1.3 | 11 | 13% | 23 |
| lmk.ACPFinal 0.1 | 11 | 13% | 21 |
| com.syncleus.robocode.Dreadnaught 0.1 | 9 | 10% | 34 |
| mb.Beast 0.1 | 8 | 9% | 22 |
| mn.nano.perceptual.Impact 1.3.0 | 8 | 9% | 17 |
| EBBU.Sim2 1.02 | 7 | 8% | 22 |
| germ.TheMind .2 | 5 | 6% | 14 |
| skm.Ryubot 1.0 | 0 | 0% | 3 |

## Melee bench: F38

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 63.4 | 19 / 210 | 4.29 | 12.8% | 24272 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.0% | 105 |
| bvh.mini.Freya 0.55 | 2.5 | 13.1% | 24 |
| hadur117.mini.DeiseWHPH 0.2 | 3.0 | 12.8% | 19 |
| bts.mega.Gnarly 1.4 | 4.0 | 11.6% | 32 |
| cs.Wren 1.0 | 4.8 | 11.3% | 12 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.7 | 10.7% | 7 |
| kdf.KoulDestroyer 1.0 | 7.2 | 8.9% | 8 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.7% | 3 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.1% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.0 | 61.6 | 2 / 35 | 3945 |
| 2 | 3 | 58.8 | 62.5 | 4 / 35 | 4045 |
| 3 | 2 | 60.9 | 68.9 | 5 / 35 | 4211 |
| 4 | 3 | 59.0 | 61.9 | 5 / 35 | 4043 |
| 5 | 2 | 59.9 | 65.4 | 3 / 35 | 4265 |
| 6 | 4 | 57.3 | 60.3 | 0 / 35 | 3763 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 20 | 0% |
| bts.mega.Gnarly 1.4 | 11 | 45% |
| bvh.mini.Freya 0.55 | 7 | 86% |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 80% |
| cs.Wren 1.0 | 3 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 50% |
| kdf.KoulDestroyer 1.0 | 1 | 0% |

Hadur died in 191 of 210 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 73 | 38% | 76 |
| bts.mega.Gnarly 1.4 | 33 | 17% | 37 |
| bvh.mini.Freya 0.55 | 28 | 15% | 31 |
| kdf.KoulDestroyer 1.0 | 25 | 13% | 25 |
| cs.Wren 1.0 | 15 | 8% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 6% | 17 |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 3% | 6 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 1 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |

## Melee bench: F39

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 67.0 | 36 / 210 | 3.97 | 14.0% | 27571 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.3 | 15.2% | 43 |
| hadur117.mini.DeiseWHPH 0.2 | 2.2 | 14.0% | 36 |
| az.Ololobot 0.2.4 | 2.8 | 13.5% | 71 |
| catcat20.Lambda 0.024 | 3.7 | 11.8% | 37 |
| stelo.SoRobotNanoMelee 1.2 | 5.7 | 9.1% | 14 |
| gimp.GimpBot 0.1 | 6.2 | 8.7% | 0 |
| winamp32.micro.MicroMacro 1.0 | 6.7 | 8.6% | 7 |
| apollokidd.ApolloKidd 0.9 | 7.5 | 7.8% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.5 | 5.8% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.5 | 63.2 | 4 / 35 | 4460 |
| 2 | 2 | 60.5 | 68.6 | 5 / 35 | 4419 |
| 3 | 2 | 60.8 | 66.7 | 6 / 35 | 4738 |
| 4 | 3 | 58.9 | 63.8 | 6 / 35 | 4185 |
| 5 | 2 | 62.1 | 70.5 | 7 / 35 | 4892 |
| 6 | 2 | 61.8 | 69.2 | 8 / 35 | 4877 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 24 | 63% |
| az.Ololobot 0.2.4 | 17 | 12% |
| catcat20.Lambda 0.024 | 13 | 69% |
| stelo.SoRobotNanoMelee 1.2 | 7 | 100% |
| gimp.GimpBot 0.1 | 3 | 100% |
| winamp32.micro.MicroMacro 1.0 | 2 | 0% |

Hadur died in 175 of 210 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 58 | 33% | 69 |
| az.Ololobot 0.2.4 | 37 | 21% | 42 |
| catcat20.Lambda 0.024 | 25 | 14% | 32 |
| gimp.GimpBot 0.1 | 14 | 8% | 22 |
| stelo.SoRobotNanoMelee 1.2 | 13 | 7% | 14 |
| winamp32.micro.MicroMacro 1.0 | 13 | 7% | 14 |
| apollokidd.ApolloKidd 0.9 | 12 | 7% | 12 |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 2% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 1 |

## Melee bench: F40

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 74.1 | 68 / 210 | 3.33 | 16.5% | 32776 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPH 0.2 | 1.2 | 16.5% | 68 |
| kawigi.mini.Coriantumr 1.1 | 1.8 | 16.1% | 79 |
| kano.gamma.KanoGamma 1.8 | 3.5 | 12.0% | 26 |
| mz.AntiGrav 1.0 | 4.7 | 10.5% | 5 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.4% | 7 |
| stelo.Randomness 1.0 | 5.7 | 9.9% | 17 |
| alpha.BlackIce 1.0 | 6.5 | 9.0% | 4 |
| amk.superstrike.SuperStrike 0.3 | 8.3 | 6.4% | 3 |
| testantiswapgun.AntiSwap 1.0 | 8.7 | 5.5% | 1 |
| sample.Corners 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 77.8 | 11 / 35 | 5690 |
| 2 | 1 | 66.3 | 75.9 | 14 / 35 | 5640 |
| 3 | 2 | 62.6 | 68.9 | 4 / 35 | 5150 |
| 4 | 1 | 64.0 | 70.2 | 13 / 35 | 5265 |
| 5 | 1 | 65.9 | 76.8 | 11 / 35 | 5557 |
| 6 | 1 | 66.1 | 75.2 | 15 / 35 | 5474 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 43 | 30% |
| kano.gamma.KanoGamma 1.8 | 21 | 71% |
| Polkwane.SmashMelee 1.0 | 14 | 100% |
| mz.AntiGrav 1.0 | 13 | 100% |
| stelo.Randomness 1.0 | 9 | 67% |
| alpha.BlackIce 1.0 | 4 | 75% |
| amk.superstrike.SuperStrike 0.3 | 3 | 33% |
| sample.Corners 1.0 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 78 | 55% | 90 |
| kano.gamma.KanoGamma 1.8 | 26 | 18% | 49 |
| stelo.Randomness 1.0 | 13 | 9% | 24 |
| alpha.BlackIce 1.0 | 9 | 6% | 11 |
| amk.superstrike.SuperStrike 0.3 | 8 | 6% | 11 |
| Polkwane.SmashMelee 1.0 | 3 | 2% | 12 |
| testantiswapgun.AntiSwap 1.0 | 3 | 2% | 4 |
| mz.AntiGrav 1.0 | 2 | 1% | 6 |
| sample.Corners 1.0 | 0 | 0% | 3 |

## Melee bench: F41

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 65.9 | 20 / 210 | 4.07 | 13.7% | 27423 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 17.3% | 101 |
| lessonz.robocode.Oz 0.5.0 | 2.5 | 14.1% | 46 |
| hadur117.mini.DeiseWHPH 0.2 | 2.5 | 13.7% | 20 |
| ary.Swarm 1.1 | 4.0 | 12.3% | 15 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 11.4% | 19 |
| shrub.Silver v048 | 6.0 | 9.5% | 6 |
| zyx.nano.Ant 1.1 | 7.0 | 7.7% | 0 |
| stelo.Mirror 1.1 | 8.2 | 6.1% | 3 |
| jsal.Jsalbot 1.0 | 8.8 | 5.7% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 62.2 | 1 / 35 | 4609 |
| 2 | 3 | 58.8 | 58.7 | 1 / 35 | 4529 |
| 3 | 2 | 62.3 | 69.5 | 7 / 35 | 4532 |
| 4 | 2 | 63.3 | 72.7 | 5 / 35 | 4667 |
| 5 | 3 | 60.9 | 65.1 | 2 / 35 | 4498 |
| 6 | 2 | 61.7 | 67.0 | 4 / 35 | 4588 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 26 | 8% |
| lessonz.robocode.Oz 0.5.0 | 12 | 33% |
| ary.Swarm 1.1 | 11 | 64% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| simonton.nano.MeleeSeed 1.8 | 2 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| shrub.Silver v048 | 1 | 0% |

Hadur died in 190 of 210 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 95 | 50% | 99 |
| lessonz.robocode.Oz 0.5.0 | 40 | 21% | 45 |
| ary.Swarm 1.1 | 24 | 13% | 29 |
| shrub.Silver v048 | 13 | 7% | 14 |
| simonton.nano.MeleeSeed 1.8 | 9 | 5% | 10 |
| stelo.Mirror 1.1 | 4 | 2% | 4 |
| jsal.Jsalbot 1.0 | 2 | 1% | 5 |
| zyx.nano.Ant 1.1 | 2 | 1% | 3 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |

## Melee bench: F42

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 66.5 | 24 / 210 | 4.01 | 14.1% | 30540 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.8% | 105 |
| maribo.mini.MiniQuester 0.1 | 3.0 | 13.7% | 24 |
| ara.Shera 0.88 | 3.0 | 13.6% | 46 |
| hadur117.mini.DeiseWHPH 0.2 | 3.0 | 14.1% | 24 |
| amz.NanoClone 1.41 | 5.0 | 8.9% | 4 |
| maribo.IotaCT 1.1 | 6.5 | 7.7% | 1 |
| dsw.StaticD 1.0 | 6.7 | 7.5% | 3 |
| stelo.MirrorMicro 1.0 | 8.2 | 6.2% | 2 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.6 | 62.2 | 1 / 35 | 4965 |
| 2 | 2 | 61.8 | 67.6 | 5 / 35 | 5019 |
| 3 | 2 | 62.6 | 69.5 | 5 / 35 | 5330 |
| 4 | 4 | 59.9 | 62.5 | 5 / 35 | 4872 |
| 5 | 2 | 62.9 | 70.2 | 5 / 35 | 5256 |
| 6 | 4 | 61.9 | 67.0 | 3 / 35 | 5098 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 27 | 41% |
| maribo.mini.MiniQuester 0.1 | 10 | 40% |
| ara.Shera 0.88 | 10 | 30% |
| amz.NanoClone 1.41 | 3 | 33% |
| dsw.StaticD 1.0 | 3 | 67% |
| maribo.IotaCT 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 82 | 44% | 93 |
| maribo.mini.MiniQuester 0.1 | 41 | 22% | 46 |
| ara.Shera 0.88 | 33 | 18% | 36 |
| maribo.IotaCT 1.1 | 11 | 6% | 11 |
| dsw.StaticD 1.0 | 7 | 4% | 10 |
| amz.NanoClone 1.41 | 7 | 4% | 7 |
| stelo.MirrorMicro 1.0 | 2 | 1% | 3 |
| mme.NikeEnhanced 2.0 | 2 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 1 |

## Melee bench: F43

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 57.7 | 5 / 210 | 4.81 | 11.7% | 22616 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.0% | 174 |
| brainfade.melee.Dusk 0.44 | 2.8 | 12.1% | 15 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.0% | 4 |
| hadur117.mini.DeiseWHPH 0.2 | 3.7 | 11.7% | 5 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 11.4% | 10 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.8% | 2 |
| jab.DiamondStealer 5 | 7.2 | 8.4% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.9% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.9 | 55.9 | 2 / 35 | 3686 |
| 2 | 5 | 57.5 | 55.9 | 0 / 35 | 3555 |
| 3 | 3 | 58.8 | 59.0 | 1 / 35 | 3769 |
| 4 | 3 | 58.7 | 58.7 | 0 / 35 | 3921 |
| 5 | 3 | 58.8 | 59.4 | 1 / 35 | 3969 |
| 6 | 4 | 57.9 | 57.1 | 1 / 35 | 3716 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 24 | 0% |
| brainfade.melee.Dusk 0.44 | 3 | 67% |
| dummy.micro.Sparrow 2.5 | 3 | 67% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 0% |
| jab.DiamondStealer 5 | 1 | 100% |

Hadur died in 205 of 210 rounds, at a mean tick of 521. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 100 | 49% | 100 |
| wcsv.melee.EngineerMelee 0.1 | 32 | 16% | 32 |
| brainfade.melee.Dusk 0.44 | 22 | 11% | 24 |
| dummy.micro.Sparrow 2.5 | 18 | 9% | 20 |
| mz.NanoGod 2.02 | 13 | 6% | 13 |
| jab.DiamondStealer 5 | 12 | 6% | 13 |
| Krabb.akim2.Akim2 1.1b | 6 | 3% | 6 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |

## Melee bench: F44

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 65.3 | 30 / 210 | 4.12 | 14.5% | 32126 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.0 | 16.6% | 98 |
| tzu.TheArtOfWar 1.2 | 2.5 | 14.0% | 47 |
| hadur117.mini.DeiseWHPH 0.2 | 2.5 | 14.5% | 30 |
| wompi.Quokka 1.6 | 4.5 | 10.6% | 6 |
| jwirde.Gort 2.0 | 5.0 | 10.5% | 17 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.7 | 9.3% | 6 |
| disan.Chair 2.2.0 | 7.2 | 8.2% | 6 |
| stf.PanzerGeneral 0.1 | 7.7 | 7.1% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.7% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.3 | 60.6 | 5 / 35 | 5260 |
| 2 | 3 | 59.6 | 59.0 | 3 / 35 | 5085 |
| 3 | 2 | 63.8 | 71.7 | 5 / 35 | 5677 |
| 4 | 2 | 63.7 | 69.2 | 6 / 35 | 5915 |
| 5 | 2 | 62.4 | 67.6 | 6 / 35 | 5171 |
| 6 | 3 | 61.0 | 63.5 | 5 / 35 | 5018 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 37 | 32% |
| tzu.TheArtOfWar 1.2 | 17 | 53% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 25% |
| jwirde.Gort 2.0 | 4 | 0% |
| disan.Chair 2.2.0 | 3 | 67% |
| sample.Crazy 1.0 | 3 | 100% |
| wompi.Quokka 1.6 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 68 | 38% | 80 |
| tzu.TheArtOfWar 1.2 | 33 | 18% | 40 |
| jwirde.Gort 2.0 | 24 | 13% | 26 |
| wompi.Quokka 1.6 | 21 | 12% | 22 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 15 | 8% | 16 |
| disan.Chair 2.2.0 | 10 | 6% | 13 |
| amk.jointstrike.JointStrike 0.2 | 4 | 2% | 6 |
| stf.PanzerGeneral 0.1 | 3 | 2% | 5 |
| sample.Crazy 1.0 | 2 | 1% | 2 |

## Melee bench: F45

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 84.1 | 83 / 210 | 2.43 | 19.2% | 37423 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPH 0.2 | 1.0 | 19.2% | 83 |
| jje.BagPuss 1.2 | 2.3 | 12.9% | 16 |
| eem.IWillFireNoBullet v2.8 | 2.8 | 12.0% | 91 |
| sul.Lunar 1.1 | 4.3 | 10.3% | 9 |
| myl.nano.Graviton 1.10 | 4.8 | 9.8% | 6 |
| hvilela.HVilela 0.9 | 5.8 | 9.3% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 7.8% | 4 |
| fm.claire 1.7 | 7.5 | 8.1% | 0 |
| wit.Deep7 2.0 | 9.2 | 5.7% | 2 |
| abud.ThirdRobo 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 80.6 | 11 / 35 | 5980 |
| 2 | 1 | 68.7 | 85.4 | 16 / 35 | 6071 |
| 3 | 1 | 69.1 | 83.5 | 16 / 35 | 6222 |
| 4 | 1 | 68.8 | 86.3 | 10 / 35 | 6217 |
| 5 | 1 | 68.7 | 83.5 | 12 / 35 | 6462 |
| 6 | 1 | 69.6 | 85.1 | 18 / 35 | 6471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 67 | 28% |
| sul.Lunar 1.1 | 30 | 73% |
| jje.BagPuss 1.2 | 20 | 55% |
| myl.nano.Graviton 1.10 | 12 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 80% |
| fm.claire 1.7 | 5 | 100% |
| wit.Deep7 2.0 | 5 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 1632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 52 | 41% | 0 |
| jje.BagPuss 1.2 | 41 | 32% | 89 |
| sul.Lunar 1.1 | 13 | 10% | 36 |
| myl.nano.Graviton 1.10 | 6 | 5% | 25 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 4% | 22 |
| hvilela.HVilela 0.9 | 5 | 4% | 15 |
| wit.Deep7 2.0 | 3 | 2% | 11 |
| fm.claire 1.7 | 2 | 2% | 8 |
| abud.ThirdRobo 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F46

hadur117.mini.DeiseWHPH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 71.7 | 9 / 210 | 3.55 | 14.3% | 28055 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 18.2% | 98 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.4% | 87 |
| hadur117.mini.DeiseWHPH 0.2 | 3.0 | 14.3% | 9 |
| cx.Princess 1.0 | 4.5 | 9.8% | 9 |
| mz.MicroSheep 1.0 | 4.5 | 10.4% | 2 |
| sadoner.killer 0.2 | 6.0 | 9.0% | 3 |
| jeremyreeder.collective.Prophet 5 | 7.5 | 7.0% | 1 |
| arthord.NanoSatanMelee Beta | 7.5 | 6.8% | 1 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.9 | 70.5 | 2 / 35 | 4703 |
| 2 | 3 | 61.8 | 69.5 | 1 / 35 | 4736 |
| 3 | 3 | 63.1 | 74.3 | 3 / 35 | 4687 |
| 4 | 3 | 61.5 | 69.5 | 0 / 35 | 4621 |
| 5 | 3 | 61.9 | 70.2 | 3 / 35 | 4564 |
| 6 | 3 | 63.5 | 76.2 | 0 / 35 | 4744 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 28 | 0% |
| rsalesc.melee.Medina 0.4.5 | 15 | 7% |
| mz.MicroSheep 1.0 | 6 | 100% |
| cx.Princess 1.0 | 3 | 67% |
| sadoner.killer 0.2 | 2 | 0% |

Hadur died in 201 of 210 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 96 | 48% | 97 |
| rsalesc.melee.Medina 0.4.5 | 59 | 29% | 60 |
| cx.Princess 1.0 | 13 | 6% | 15 |
| mz.MicroSheep 1.0 | 12 | 6% | 16 |
| sadoner.killer 0.2 | 8 | 4% | 9 |
| jeremyreeder.collective.Prophet 5 | 6 | 3% | 6 |
| arthord.NanoSatanMelee Beta | 5 | 2% | 5 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 1 |
| kurios.DOSexe .9a | 1 | 0% | 1 |

