# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 81.6 | 32 / 210 | 2.66 | 15.8% | 27180 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 141 |
| hadur117.mini.DeiseG1 0.2 | 2.0 | 15.8% | 32 |
| sgp.JollyNinja 3.53 | 3.0 | 12.5% | 27 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.2 | 11.0% | 3 |
| mz.MicroGodMelee 1 | 4.8 | 10.2% | 5 |
| lorneswork.Predator 1.0 | 6.0 | 9.3% | 1 |
| adt.Ar2 1.0 | 7.0 | 7.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.6% | 1 |
| skm.butterfly 1.0 | 8.8 | 5.0% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 80.3 | 4 / 35 | 4405 |
| 2 | 2 | 65.8 | 85.1 | 5 / 35 | 4625 |
| 3 | 2 | 65.0 | 81.6 | 6 / 35 | 4636 |
| 4 | 2 | 65.4 | 82.5 | 9 / 35 | 4486 |
| 5 | 2 | 64.1 | 80.6 | 3 / 35 | 4248 |
| 6 | 2 | 64.8 | 79.4 | 5 / 35 | 4780 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 92 | 10% |
| sgp.JollyNinja 3.53 | 18 | 50% |
| mz.MicroGodMelee 1 | 10 | 70% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 80% |
| lorneswork.Predator 1.0 | 4 | 75% |

Hadur died in 178 of 210 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 113 | 63% | 123 |
| sgp.JollyNinja 3.53 | 32 | 18% | 37 |
| mz.MicroGodMelee 1 | 11 | 6% | 20 |
| adt.Ar2 1.0 | 8 | 4% | 8 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 3% | 11 |
| lorneswork.Predator 1.0 | 6 | 3% | 8 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 3 |

## Melee bench: F02

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 79.2 | 81 / 210 | 2.88 | 16.9% | 28677 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 16.9% | 81 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.2 | 13.9% | 41 |
| pulsar.PulsarMax 0.8.9 | 2.8 | 12.9% | 44 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.4% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 9.8% | 13 |
| fnc.bandit.Bandit 5.2.0 | 6.3 | 8.7% | 3 |
| stelo.PatternRobot 1.0 | 7.5 | 7.5% | 6 |
| Noran.BitchingElk 0.054 | 7.8 | 7.7% | 15 |
| sch.Simone 0.3d | 7.8 | 7.5% | 6 |
| fullsail.SweetTea 1.1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 82.2 | 17 / 35 | 5065 |
| 2 | 1 | 64.7 | 75.2 | 15 / 35 | 4785 |
| 3 | 1 | 64.4 | 75.2 | 12 / 35 | 4845 |
| 4 | 1 | 63.9 | 76.5 | 11 / 35 | 4309 |
| 5 | 1 | 65.9 | 81.9 | 13 / 35 | 4575 |
| 6 | 1 | 66.9 | 83.8 | 13 / 35 | 5098 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 35 | 54% |
| pulsar.PulsarMax 0.8.9 | 30 | 60% |
| com.cohesiva.robocode.ManOwaR 1.0 | 14 | 79% |
| stelo.PatternRobot 1.0 | 13 | 92% |
| Noran.BitchingElk 0.054 | 9 | 67% |
| fullsail.SweetTea 1.1 | 5 | 100% |
| sch.Simone 0.3d | 4 | 75% |
| lrem.micro.SpikeSoldier 0.4 | 4 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 45 | 35% | 71 |
| pulsar.PulsarMax 0.8.9 | 35 | 27% | 49 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 12% | 18 |
| stelo.PatternRobot 1.0 | 11 | 9% | 18 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 5% | 18 |
| Noran.BitchingElk 0.054 | 7 | 5% | 11 |
| fnc.bandit.Bandit 5.2.0 | 6 | 5% | 9 |
| sch.Simone 0.3d | 3 | 2% | 10 |
| fullsail.SweetTea 1.1 | 0 | 0% | 5 |

## Melee bench: F03

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 91.4 | 154 / 210 | 1.78 | 19.8% | 34900 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 19.8% | 154 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.4% | 20 |
| radnor.DoctorBob 1.42 | 2.7 | 13.6% | 20 |
| vuen.Cake 2.51 | 3.8 | 12.3% | 14 |
| urdos.URDOS 1.3 | 5.0 | 9.6% | 1 |
| adt.Ar1 2.1 | 6.3 | 7.4% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.2 | 6.9% | 1 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.8% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 92.1 | 26 / 35 | 5427 |
| 2 | 1 | 69.3 | 88.6 | 23 / 35 | 6053 |
| 3 | 1 | 69.1 | 87.3 | 23 / 35 | 5664 |
| 4 | 1 | 70.2 | 94.0 | 26 / 35 | 5775 |
| 5 | 1 | 70.7 | 95.9 | 28 / 35 | 5825 |
| 6 | 1 | 70.2 | 90.5 | 28 / 35 | 6156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 62 | 85% |
| vuen.Cake 2.51 | 51 | 88% |
| radnor.DoctorBob 1.42 | 47 | 89% |
| urdos.URDOS 1.3 | 6 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 20 | 36% | 78 |
| vuen.Cake 2.51 | 12 | 21% | 48 |
| radnor.DoctorBob 1.42 | 10 | 18% | 49 |
| urdos.URDOS 1.3 | 6 | 11% | 13 |
| ghent.ArthurPanzergon 1.0.0 | 3 | 5% | 6 |
| oa.weak.FlyMk1 0.1 | 2 | 4% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 4% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 3 |
| adt.Ar1 2.1 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 73.9 | 6 / 210 | 3.35 | 14.9% | 30466 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.2% | 195 |
| hadur117.mini.DeiseG1 0.2 | 2.0 | 14.9% | 6 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.1% | 4 |
| TNT.TNT 0.99.1 | 4.3 | 10.4% | 2 |
| josago.Jorgito 0.16 | 4.7 | 10.1% | 1 |
| tj.zombie1n 1.0.1 | 6.3 | 6.9% | 1 |
| css.Delitioner 0.11 | 6.7 | 6.7% | 1 |
| rampancy.Durandal 2.1d | 8.0 | 5.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 72.7 | 2 / 35 | 4899 |
| 2 | 2 | 64.6 | 76.2 | 1 / 35 | 5135 |
| 3 | 2 | 64.8 | 76.8 | 1 / 35 | 5247 |
| 4 | 2 | 62.6 | 67.9 | 0 / 35 | 5060 |
| 5 | 2 | 65.0 | 76.8 | 0 / 35 | 5211 |
| 6 | 2 | 63.7 | 72.7 | 2 / 35 | 4914 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 69 | 0% |
| TNT.TNT 0.99.1 | 5 | 80% |
| apc.LeeroyJenkins2 1.0 | 2 | 50% |
| tj.zombie1n 1.0.1 | 1 | 100% |

Hadur died in 204 of 210 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 170 | 83% | 172 |
| apc.LeeroyJenkins2 1.0 | 12 | 6% | 14 |
| TNT.TNT 0.99.1 | 5 | 2% | 7 |
| josago.Jorgito 0.16 | 5 | 2% | 5 |
| rampancy.Durandal 2.1d | 5 | 2% | 5 |
| tj.zombie1n 1.0.1 | 5 | 2% | 5 |
| css.Delitioner 0.11 | 2 | 1% | 2 |

## Melee bench: F05

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 64.6 | 9 / 210 | 4.19 | 12.1% | 19328 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.9% | 117 |
| justin.DemonicRage 3.4 | 1.7 | 17.6% | 68 |
| wompi.Numbat 2.1 | 3.3 | 12.9% | 12 |
| hadur117.mini.DeiseG1 0.2 | 3.7 | 12.1% | 9 |
| ms.Ares 0.19 | 5.3 | 9.6% | 0 |
| axeBots.HataMoto 3.09 | 5.7 | 8.9% | 4 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.1% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.4% | 0 |
| GarmBox.Oranges 1.0 | 9.2 | 4.3% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.4 | 62.2 | 2 / 35 | 2742 |
| 2 | 4 | 58.0 | 64.4 | 1 / 35 | 3121 |
| 3 | 3 | 57.9 | 62.9 | 0 / 35 | 3334 |
| 4 | 4 | 59.3 | 65.4 | 1 / 35 | 3464 |
| 5 | 4 | 59.2 | 65.7 | 2 / 35 | 3319 |
| 6 | 3 | 59.5 | 67.0 | 3 / 35 | 3348 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 18 | 11% |
| justin.DemonicRage 3.4 | 11 | 27% |
| wompi.Numbat 2.1 | 4 | 100% |
| axeBots.HataMoto 3.09 | 1 | 0% |

Hadur died in 201 of 210 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 84 | 42% | 86 |
| justin.DemonicRage 3.4 | 63 | 31% | 65 |
| wompi.Numbat 2.1 | 29 | 14% | 32 |
| ms.Ares 0.19 | 9 | 4% | 10 |
| axeBots.HataMoto 3.09 | 9 | 4% | 9 |
| davidalves.net.DuelistMicroMelee 1.4 | 4 | 2% | 4 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 3 |
| GarmBox.Oranges 1.0 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 85.8 | 108 / 210 | 2.28 | 17.6% | 25372 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 17.6% | 108 |
| jekl.StoneGhost 0.7 | 2.0 | 14.6% | 24 |
| origin.SleepSiphon 1.7b | 3.5 | 12.8% | 33 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.7 | 12.1% | 25 |
| mld.Wisdom 1.0 | 5.0 | 10.8% | 6 |
| gg.Wolverine 2.0 | 5.8 | 8.9% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.1% | 5 |
| spinnercat.Omen 1.0 | 8.0 | 6.7% | 1 |
| DBall.NUKE 0.1 | 8.7 | 5.9% | 1 |
| sample.Fire 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 81.6 | 14 / 35 | 4232 |
| 2 | 1 | 67.5 | 87.6 | 20 / 35 | 4206 |
| 3 | 1 | 66.7 | 83.8 | 19 / 35 | 4246 |
| 4 | 1 | 68.0 | 89.2 | 19 / 35 | 4524 |
| 5 | 1 | 67.3 | 87.6 | 18 / 35 | 4074 |
| 6 | 1 | 67.0 | 84.8 | 18 / 35 | 4090 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 45 | 91% |
| pe.minimelee.SandboxMiniMelee 1.1 | 34 | 76% |
| origin.SleepSiphon 1.7b | 33 | 73% |
| mld.Wisdom 1.0 | 14 | 71% |
| gg.Wolverine 2.0 | 4 | 25% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 28 | 27% | 64 |
| pe.minimelee.SandboxMiniMelee 1.1 | 27 | 26% | 48 |
| origin.SleepSiphon 1.7b | 23 | 22% | 54 |
| mld.Wisdom 1.0 | 16 | 16% | 26 |
| gg.Wolverine 2.0 | 6 | 6% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 3% | 5 |
| DBall.NUKE 0.1 | 0 | 0% | 3 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |

## Melee bench: F07

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 82.3 | 72 / 210 | 2.59 | 17.2% | 32014 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.2 | 18.6% | 69 |
| hadur117.mini.DeiseG1 0.2 | 2.3 | 17.2% | 72 |
| rtk.Tachikoma 1.0 | 2.5 | 16.5% | 40 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.7% | 13 |
| franzor.Lizt 1.3.1 | 4.7 | 10.9% | 16 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.7% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.4% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.1% | 0 |
| sample.Target 1.0 | 9.3 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 66.4 | 77.5 | 8 / 35 | 5278 |
| 2 | 3 | 66.9 | 80.6 | 12 / 35 | 4861 |
| 3 | 2 | 68.7 | 85.4 | 12 / 35 | 5281 |
| 4 | 2 | 68.6 | 83.2 | 14 / 35 | 5350 |
| 5 | 3 | 67.7 | 81.9 | 11 / 35 | 5440 |
| 6 | 1 | 69.4 | 85.4 | 15 / 35 | 5804 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 59 | 71% |
| rsalesc.melee.Monk 0.3.6c | 25 | 12% |
| oog.melee.CapuletDroid 1.1 | 22 | 91% |
| franzor.Lizt 1.3.1 | 10 | 50% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 1013. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 73 | 53% | 85 |
| rtk.Tachikoma 1.0 | 40 | 29% | 85 |
| oog.melee.CapuletDroid 1.1 | 15 | 11% | 33 |
| franzor.Lizt 1.3.1 | 6 | 4% | 1 |
| exauge.GateKeeper 1.1.121g | 3 | 2% | 4 |
| drd.Dreadknoght 0.9 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 84.1 | 104 / 210 | 2.43 | 18.2% | 30776 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 18.2% | 104 |
| shrub.Vapour v159 | 2.3 | 12.7% | 30 |
| tm.Yuugao 1.0 | 2.7 | 13.3% | 43 |
| Krabb.sliNk.Garm 0.9u | 4.8 | 10.2% | 14 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.7% | 11 |
| m3thos.Eva00 1.1 | 5.7 | 9.0% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 7.9% | 5 |
| qualidafial.MajorDick 1.0.1 | 8.7 | 7.0% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.2 | 5.8% | 0 |
| SHAM.WOW 1.4 | 9.2 | 6.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 87.0 | 20 / 35 | 5051 |
| 2 | 1 | 68.3 | 87.9 | 19 / 35 | 5134 |
| 3 | 1 | 64.4 | 73.7 | 11 / 35 | 5133 |
| 4 | 1 | 68.3 | 86.7 | 17 / 35 | 5213 |
| 5 | 1 | 68.7 | 87.9 | 21 / 35 | 5209 |
| 6 | 1 | 66.3 | 81.3 | 16 / 35 | 5036 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 48 | 58% |
| shrub.Vapour v159 | 43 | 72% |
| com.spp.robocode.MostlyHarmless 010 | 18 | 83% |
| Krabb.sliNk.Garm 0.9u | 18 | 72% |
| m3thos.Eva00 1.1 | 8 | 75% |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 71% |
| SHAM.WOW 1.4 | 3 | 67% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 41 | 38% | 73 |
| shrub.Vapour v159 | 24 | 22% | 49 |
| Krabb.sliNk.Garm 0.9u | 9 | 8% | 15 |
| com.spp.robocode.MostlyHarmless 010 | 8 | 7% | 26 |
| zyx.nano.BacillusComma 1.0 | 7 | 6% | 9 |
| SHAM.WOW 1.4 | 6 | 6% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 6% | 11 |
| m3thos.Eva00 1.1 | 5 | 5% | 14 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 72.6 | 47 / 210 | 3.46 | 14.4% | 21117 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.0% | 92 |
| hadur117.mini.DeiseG1 0.2 | 2.3 | 14.4% | 47 |
| kc.micro.Figment 1.0 | 2.8 | 13.9% | 32 |
| pedersen.Grishnakh 1.0 | 4.3 | 10.9% | 21 |
| yagami.Tidus 0.11 | 4.7 | 10.2% | 3 |
| mc2.enemy.Original 0.9 | 5.8 | 9.5% | 13 |
| dft.Calliope 5.6 | 6.8 | 7.9% | 1 |
| step.nanoPri 1.0 | 8.5 | 6.0% | 0 |
| rdm.Dueler 0.4x | 9.0 | 5.2% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 71.7 | 10 / 35 | 3555 |
| 2 | 1 | 65.5 | 81.6 | 15 / 35 | 3916 |
| 3 | 3 | 60.2 | 70.8 | 7 / 35 | 3116 |
| 4 | 3 | 60.2 | 69.2 | 4 / 35 | 3486 |
| 5 | 2 | 63.1 | 75.2 | 6 / 35 | 3947 |
| 6 | 3 | 59.1 | 67.3 | 5 / 35 | 3097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 32 | 25% |
| kc.micro.Figment 1.0 | 30 | 70% |
| pedersen.Grishnakh 1.0 | 13 | 62% |
| yagami.Tidus 0.11 | 7 | 100% |
| mc2.enemy.Original 0.9 | 2 | 100% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 163 of 210 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 72 | 44% | 82 |
| kc.micro.Figment 1.0 | 31 | 19% | 53 |
| yagami.Tidus 0.11 | 15 | 9% | 19 |
| mc2.enemy.Original 0.9 | 14 | 9% | 17 |
| pedersen.Grishnakh 1.0 | 12 | 7% | 17 |
| robar.nano.Assertive_Melee 0.2 | 9 | 6% | 10 |
| rdm.Dueler 0.4x | 5 | 3% | 5 |
| dft.Calliope 5.6 | 4 | 2% | 6 |
| step.nanoPri 1.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 92.0 | 146 / 210 | 1.72 | 19.6% | 31901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 19.6% | 146 |
| ejb.Polaris 1.0.1 | 2.8 | 12.9% | 20 |
| DTF.Kludgy 1.2b | 2.8 | 13.4% | 29 |
| ne.Chimera 1.2 | 3.3 | 12.9% | 7 |
| vStar.RAFzilla 2.15 | 5.3 | 10.3% | 4 |
| tvv.micro.Antares 1.1.1 | 5.7 | 9.8% | 3 |
| kurios.DOSexe .9b | 7.7 | 5.7% | 0 |
| sam.Samspin 1.0 | 8.0 | 5.5% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.3% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 92.7 | 25 / 35 | 5247 |
| 2 | 1 | 68.7 | 86.3 | 23 / 35 | 5203 |
| 3 | 1 | 70.9 | 95.6 | 30 / 35 | 5575 |
| 4 | 1 | 69.3 | 91.7 | 21 / 35 | 5202 |
| 5 | 1 | 69.9 | 92.7 | 24 / 35 | 5258 |
| 6 | 1 | 69.9 | 93.0 | 23 / 35 | 5416 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 53 | 87% |
| DTF.Kludgy 1.2b | 43 | 65% |
| ne.Chimera 1.2 | 36 | 92% |
| vStar.RAFzilla 2.15 | 22 | 91% |
| tvv.micro.Antares 1.1.1 | 11 | 82% |
| donjezza.Muncho 1.0 | 5 | 80% |
| sam.Samspin 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 3 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 32 | 50% | 61 |
| ejb.Polaris 1.0.1 | 11 | 17% | 51 |
| ne.Chimera 1.2 | 11 | 17% | 45 |
| vStar.RAFzilla 2.15 | 3 | 5% | 20 |
| tvv.micro.Antares 1.1.1 | 3 | 5% | 13 |
| kurios.DOSexe .9b | 1 | 2% | 7 |
| sam.Samspin 1.0 | 1 | 2% | 5 |
| donjezza.Muncho 1.0 | 1 | 2% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 2 |

## Melee bench: F11

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 78.8 | 74 / 210 | 2.91 | 16.2% | 24993 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 17.1% | 73 |
| hadur117.mini.DeiseG1 0.2 | 1.8 | 16.2% | 74 |
| cx.mini.Nimrod 0.55 | 3.3 | 11.3% | 22 |
| djc.DynaBot 0.1.1 | 4.0 | 10.8% | 15 |
| rdt199.Warlord 0.73 | 5.0 | 9.7% | 12 |
| br2.MobyDickBot 1.6 | 5.8 | 9.1% | 8 |
| uji.YellohFellah 1.0 | 7.0 | 7.9% | 6 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.1% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.8% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 79.0 | 8 / 35 | 4367 |
| 2 | 2 | 65.6 | 81.0 | 15 / 35 | 4116 |
| 3 | 1 | 66.4 | 81.9 | 14 / 35 | 4761 |
| 4 | 2 | 63.2 | 76.2 | 11 / 35 | 3959 |
| 5 | 2 | 63.5 | 75.9 | 10 / 35 | 4135 |
| 6 | 2 | 64.4 | 78.7 | 16 / 35 | 3655 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 68 | 56% |
| cx.mini.Nimrod 0.55 | 15 | 47% |
| rdt199.Warlord 0.73 | 12 | 75% |
| djc.DynaBot 0.1.1 | 11 | 82% |
| uji.YellohFellah 1.0 | 7 | 57% |
| br2.MobyDickBot 1.6 | 4 | 100% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 819. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 65 | 48% | 97 |
| cx.mini.Nimrod 0.55 | 32 | 24% | 40 |
| djc.DynaBot 0.1.1 | 11 | 8% | 18 |
| rdt199.Warlord 0.73 | 10 | 7% | 22 |
| br2.MobyDickBot 1.6 | 6 | 4% | 13 |
| KiraNL.Chupacabra 0.4 | 6 | 4% | 7 |
| uji.YellohFellah 1.0 | 3 | 2% | 9 |
| stelo.MirrorNano 1.3 | 2 | 1% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 78.1 | 78 / 210 | 2.97 | 15.9% | 22269 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 15.9% | 78 |
| bts.wiki.RipCurl 0.9b | 2.3 | 14.2% | 34 |
| nat.PallasHawk 1.0 | 3.0 | 12.9% | 47 |
| darkcanuck.Leon 1.01 | 3.7 | 13.0% | 36 |
| brainfade.melee.Genghis 0.36 | 5.0 | 11.0% | 10 |
| jrm.Test0 1.0 | 6.0 | 8.2% | 2 |
| jp.Perpy 16.0 | 7.3 | 7.2% | 0 |
| cs.sheldor.Talon 1.1 | 8.5 | 6.3% | 1 |
| stuff.Vlad 0.1 | 8.7 | 5.9% | 0 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 76.8 | 13 / 35 | 3348 |
| 2 | 1 | 62.1 | 74.0 | 8 / 35 | 3728 |
| 3 | 1 | 63.6 | 77.8 | 11 / 35 | 3745 |
| 4 | 1 | 65.9 | 83.8 | 19 / 35 | 3609 |
| 5 | 1 | 65.8 | 81.3 | 14 / 35 | 4088 |
| 6 | 1 | 63.2 | 75.2 | 13 / 35 | 3751 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 35 | 86% |
| darkcanuck.Leon 1.01 | 34 | 59% |
| nat.PallasHawk 1.0 | 22 | 55% |
| brainfade.melee.Genghis 0.36 | 7 | 86% |
| jp.Perpy 16.0 | 3 | 100% |
| jrm.Test0 1.0 | 3 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 50% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 46 | 35% | 73 |
| nat.PallasHawk 1.0 | 35 | 26% | 50 |
| darkcanuck.Leon 1.01 | 26 | 20% | 49 |
| jrm.Test0 1.0 | 7 | 5% | 10 |
| brainfade.melee.Genghis 0.36 | 7 | 5% | 10 |
| jp.Perpy 16.0 | 7 | 5% | 8 |
| cs.sheldor.Talon 1.1 | 3 | 2% | 5 |
| stuff.Vlad 0.1 | 2 | 2% | 3 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 2 |

## Melee bench: F13

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 74.3 | 35 / 210 | 3.31 | 14.3% | 23537 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 16.9% | 100 |
| ags.Glacier 0.2.11 | 1.5 | 17.3% | 48 |
| hadur117.mini.DeiseG1 0.2 | 3.0 | 14.3% | 35 |
| shinh.Entangled 0.3 | 4.3 | 12.3% | 19 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.5% | 7 |
| apc.Colossus2 0.17 | 6.2 | 8.0% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.2% | 1 |
| ayk.WallHugger 1.0 | 8.3 | 4.8% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.4% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.3 | 74.6 | 5 / 35 | 3625 |
| 2 | 3 | 63.1 | 76.8 | 7 / 35 | 3856 |
| 3 | 3 | 63.5 | 74.9 | 6 / 35 | 4199 |
| 4 | 3 | 63.4 | 77.1 | 8 / 35 | 3932 |
| 5 | 3 | 62.0 | 72.1 | 5 / 35 | 3977 |
| 6 | 3 | 61.5 | 70.2 | 4 / 35 | 3948 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 26 | 27% |
| ags.Glacier 0.2.11 | 24 | 58% |
| shinh.Entangled 0.3 | 10 | 60% |
| gh.micro.Gruweltje 0.7 | 9 | 89% |

Hadur died in 175 of 210 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 65 | 37% | 78 |
| mn.Combat 3.25.0 | 60 | 34% | 66 |
| shinh.Entangled 0.3 | 33 | 19% | 38 |
| gh.micro.Gruweltje 0.7 | 9 | 5% | 19 |
| stelo.Wang 1.0 | 6 | 3% | 7 |
| apc.Colossus2 0.17 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 91.3 | 144 / 210 | 1.79 | 19.2% | 29532 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 19.2% | 144 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.5% | 25 |
| catcat20.shape.Theta 0.018 | 3.3 | 11.7% | 25 |
| sanyi.mikrobi.Roberto 1.0 | 4.7 | 9.9% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 9.7% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.1% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 6.3 | 9.0% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 8.0% | 11 |
| pa.Improved 1.0 | 9.0 | 5.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 90.8 | 28 / 35 | 4722 |
| 2 | 1 | 68.5 | 89.5 | 19 / 35 | 4821 |
| 3 | 1 | 69.1 | 90.8 | 25 / 35 | 4823 |
| 4 | 1 | 68.5 | 87.9 | 24 / 35 | 4841 |
| 5 | 1 | 70.2 | 93.7 | 23 / 35 | 5281 |
| 6 | 1 | 70.4 | 94.9 | 25 / 35 | 5044 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 87 | 90% |
| catcat20.shape.Theta 0.018 | 45 | 62% |
| sanyi.mikrobi.Roberto 1.0 | 18 | 83% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 64% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 26 | 39% | 98 |
| catcat20.shape.Theta 0.018 | 22 | 33% | 49 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 12% | 24 |
| sanyi.mikrobi.Roberto 1.0 | 5 | 8% | 20 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 5% | 5 |
| pa.Improved 1.0 | 1 | 2% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 2% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 2 |

## Melee bench: F15

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.1 | 94 / 210 | 2.52 | 18.0% | 31545 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 18.0% | 94 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.8% | 26 |
| emp.Yngwie 1.11 | 2.8 | 13.1% | 48 |
| mld.DustBunny 3.8 | 4.3 | 11.7% | 12 |
| cb.nano.Insomnia 1.0 | 4.8 | 11.5% | 11 |
| kawigi.robot.Girl 1.2 | 5.7 | 9.2% | 17 |
| Grystrion.TrackerWO 1.0 | 7.3 | 6.7% | 0 |
| lambdaxy.TBot 0.1 | 7.7 | 7.1% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.5% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 79.7 | 14 / 35 | 5275 |
| 2 | 1 | 66.6 | 81.3 | 16 / 35 | 4953 |
| 3 | 1 | 68.3 | 83.8 | 15 / 35 | 5699 |
| 4 | 1 | 67.2 | 83.5 | 16 / 35 | 5061 |
| 5 | 1 | 68.4 | 86.0 | 16 / 35 | 5442 |
| 6 | 1 | 67.6 | 84.4 | 17 / 35 | 5115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 40 | 65% |
| kawigi.micro.Shiz 1.1 | 25 | 84% |
| cb.nano.Insomnia 1.0 | 19 | 84% |
| mld.DustBunny 3.8 | 18 | 72% |
| kawigi.robot.Girl 1.2 | 11 | 100% |
| divineomega.TrialBot 0.003 | 5 | 80% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 34 | 29% | 61 |
| kawigi.micro.Shiz 1.1 | 28 | 24% | 54 |
| cb.nano.Insomnia 1.0 | 20 | 17% | 23 |
| mld.DustBunny 3.8 | 15 | 13% | 33 |
| kawigi.robot.Girl 1.2 | 8 | 7% | 17 |
| divineomega.TrialBot 0.003 | 6 | 5% | 11 |
| Grystrion.TrackerWO 1.0 | 4 | 3% | 9 |
| lambdaxy.TBot 0.1 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.4 | 108 / 210 | 2.14 | 19.1% | 33231 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 19.1% | 108 |
| gh.Griezel 0.5.2 | 2.0 | 16.3% | 62 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.6% | 5 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.8% | 27 |
| bvh.fnr.Fenrir 0.36l | 5.2 | 9.3% | 2 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.7% | 5 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.6% | 2 |
| asd.Cthulhu 1.3 | 8.8 | 4.7% | 0 |
| repositorio.NanoStep 1.0 | 8.8 | 5.3% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.3 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 82.9 | 15 / 35 | 5134 |
| 2 | 1 | 69.3 | 87.6 | 17 / 35 | 5454 |
| 3 | 1 | 68.6 | 86.0 | 18 / 35 | 5360 |
| 4 | 1 | 70.0 | 88.3 | 16 / 35 | 6104 |
| 5 | 1 | 70.5 | 92.4 | 22 / 35 | 5638 |
| 6 | 1 | 69.2 | 87.0 | 20 / 35 | 5541 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 93 | 60% |
| techdude.forest.FlamingForest 1.1 | 27 | 52% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 19 | 100% |
| bvh.fnr.Fenrir 0.36l | 9 | 89% |
| tvv.nano.Polaris 1.2 | 5 | 80% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| stelo.IntrinsicVolatility 1.4 | 3 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 1318. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 43 | 42% | 99 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 19 | 18% | 33 |
| techdude.forest.FlamingForest 1.1 | 16 | 16% | 29 |
| bvh.fnr.Fenrir 0.36l | 8 | 8% | 13 |
| stelo.IntrinsicVolatility 1.4 | 7 | 7% | 14 |
| asd.Cthulhu 1.3 | 5 | 5% | 6 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 7 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 6 |
| repositorio.NanoStep 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 89.6 | 119 / 210 | 1.94 | 19.1% | 30774 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 19.1% | 119 |
| et.Predator 1.8 | 2.0 | 13.5% | 29 |
| oog.melee.Mercutio 1.0 | 3.5 | 11.7% | 21 |
| cx.BlestPain 1.41 | 4.5 | 11.3% | 28 |
| nic.Nicator 2.4 | 5.0 | 10.8% | 10 |
| ahf.NanoAndrew .4 | 5.3 | 10.3% | 3 |
| maribo.melee.BMV 0.1 | 6.7 | 9.4% | 0 |
| tex.Longbot 0.4 | 8.3 | 5.8% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 87.6 | 17 / 35 | 4849 |
| 2 | 1 | 69.7 | 89.5 | 20 / 35 | 5326 |
| 3 | 1 | 70.8 | 94.3 | 25 / 35 | 5438 |
| 4 | 1 | 68.1 | 85.7 | 16 / 35 | 5007 |
| 5 | 1 | 69.5 | 90.5 | 22 / 35 | 5013 |
| 6 | 1 | 69.0 | 89.8 | 19 / 35 | 5141 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 51 | 71% |
| oog.melee.Mercutio 1.0 | 36 | 72% |
| nic.Nicator 2.4 | 31 | 74% |
| cx.BlestPain 1.41 | 25 | 64% |
| ahf.NanoAndrew .4 | 14 | 86% |
| maribo.melee.BMV 0.1 | 5 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 1031. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 30 | 33% | 70 |
| cx.BlestPain 1.41 | 23 | 25% | 43 |
| oog.melee.Mercutio 1.0 | 19 | 21% | 41 |
| nic.Nicator 2.4 | 11 | 12% | 30 |
| ahf.NanoAndrew .4 | 5 | 5% | 19 |
| maribo.melee.BMV 0.1 | 2 | 2% | 5 |
| tex.Longbot 0.4 | 1 | 1% | 1 |
| goblin.Bender 2.4 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 85.1 | 115 / 210 | 2.34 | 17.8% | 25441 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 17.8% | 115 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.1% | 32 |
| agd.Mooserwirt2 2.7 | 3.3 | 11.9% | 23 |
| uji.DBH 1.1 | 4.0 | 11.0% | 13 |
| ratosh.Nobo 0.21 | 4.7 | 10.6% | 6 |
| spinnercat.Robovirus 2.718 | 6.0 | 9.0% | 6 |
| sigterm.Sigterm 1.0 | 7.3 | 7.6% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.7% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.3 | 5.6% | 1 |
| stelo.WangRobot 1.0 | 9.5 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 83.8 | 21 / 35 | 4179 |
| 2 | 1 | 67.9 | 90.2 | 21 / 35 | 4239 |
| 3 | 1 | 65.6 | 81.9 | 19 / 35 | 4001 |
| 4 | 1 | 65.1 | 82.2 | 16 / 35 | 3822 |
| 5 | 1 | 68.5 | 89.2 | 21 / 35 | 4695 |
| 6 | 1 | 66.4 | 83.5 | 17 / 35 | 4505 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 44 | 68% |
| agd.Mooserwirt2 2.7 | 24 | 88% |
| spinnercat.Robovirus 2.718 | 20 | 90% |
| uji.DBH 1.1 | 19 | 79% |
| ratosh.Nobo 0.21 | 12 | 92% |
| sigterm.Sigterm 1.0 | 11 | 91% |
| stelo.WangRobot 1.0 | 7 | 71% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 31 | 33% | 67 |
| agd.Mooserwirt2 2.7 | 13 | 14% | 35 |
| uji.DBH 1.1 | 11 | 12% | 23 |
| kawigi.mini.Fhqwhgads 1.1 | 10 | 11% | 18 |
| ratosh.Nobo 0.21 | 9 | 9% | 18 |
| spinnercat.Robovirus 2.718 | 7 | 7% | 16 |
| sigterm.Sigterm 1.0 | 6 | 6% | 15 |
| stelo.WangRobot 1.0 | 4 | 4% | 12 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 4% | 5 |

## Melee bench: F19

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 94.8 | 169 / 210 | 1.47 | 20.6% | 31513 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 20.6% | 169 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.4% | 15 |
| mld.Infinity 2.2 | 2.7 | 14.1% | 23 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.0% | 0 |
| erdnis.Rover 0.3 | 4.7 | 10.8% | 1 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.1% | 0 |
| mbh.Mbh 0.1 | 7.3 | 7.3% | 0 |
| pac.ABC 2.1 | 7.8 | 6.9% | 1 |
| pbg.R2D2 1.0 | 8.7 | 5.6% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 94.3 | 27 / 35 | 5469 |
| 2 | 1 | 71.2 | 93.7 | 30 / 35 | 5282 |
| 3 | 1 | 71.4 | 94.9 | 27 / 35 | 5222 |
| 4 | 1 | 71.7 | 95.6 | 29 / 35 | 5140 |
| 5 | 1 | 72.0 | 95.9 | 29 / 35 | 5692 |
| 6 | 1 | 70.7 | 94.6 | 27 / 35 | 4708 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 79 | 95% |
| mld.Infinity 2.2 | 69 | 91% |
| erdnis.Rover 0.3 | 11 | 91% |
| krillr.mini.JointStrike 2.0.0 | 9 | 100% |
| pac.ABC 2.1 | 5 | 100% |
| patson.PatsonTestBot 1.0 | 4 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 18 | 44% | 96 |
| mld.Infinity 2.2 | 11 | 27% | 50 |
| krillr.mini.JointStrike 2.0.0 | 5 | 12% | 21 |
| patson.PatsonTestBot 1.0 | 3 | 7% | 8 |
| erdnis.Rover 0.3 | 2 | 5% | 15 |
| mbh.Mbh 0.1 | 1 | 2% | 7 |
| pbg.R2D2 1.0 | 1 | 2% | 5 |
| pac.ABC 2.1 | 0 | 0% | 5 |

## Melee bench: F20

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 90.5 | 131 / 210 | 1.85 | 19.8% | 32436 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 19.8% | 131 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.3% | 48 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 10.9% | 2 |
| fwb.Nine 1.0.1 | 3.5 | 11.3% | 13 |
| catcat20.Rabbit 0.001 | 5.0 | 9.6% | 13 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 8.5% | 2 |
| bayen.nut.Squirrel 1.615 | 7.5 | 7.2% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.7 | 7.3% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.7 | 6.0% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 92.4 | 19 / 35 | 5519 |
| 2 | 1 | 69.7 | 92.4 | 23 / 35 | 5205 |
| 3 | 1 | 70.5 | 92.1 | 23 / 35 | 5508 |
| 4 | 1 | 69.0 | 88.6 | 22 / 35 | 5108 |
| 5 | 1 | 69.6 | 88.9 | 23 / 35 | 5417 |
| 6 | 1 | 69.7 | 88.9 | 21 / 35 | 5679 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 72 | 56% |
| fwb.Nine 1.0.1 | 43 | 95% |
| catcat20.Rabbit 0.001 | 20 | 80% |
| nz.jdc.nano.GridFu 1.0 | 19 | 100% |
| bayen.nut.Squirrel 1.615 | 7 | 100% |
| m3thos.mini.Eva01 0.5.5 | 4 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 1005. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 46 | 58% | 77 |
| fwb.Nine 1.0.1 | 12 | 15% | 29 |
| catcat20.Rabbit 0.001 | 10 | 13% | 26 |
| nz.jdc.nano.GridFu 1.0 | 6 | 8% | 39 |
| ntc.ControlledChaos 1.1.4 | 3 | 4% | 4 |
| bayen.nut.Squirrel 1.615 | 1 | 1% | 14 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 6 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 92.0 | 133 / 210 | 1.72 | 20.0% | 32473 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 20.0% | 133 |
| eem.EvBot v4.6.16 | 2.0 | 16.2% | 60 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.0% | 4 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.9% | 6 |
| eld.Hmm 1.0 | 5.3 | 8.6% | 6 |
| oa.weak.BotherBot 0.1 | 5.7 | 8.3% | 1 |
| el.JumpShoot 0.2 | 7.3 | 6.5% | 1 |
| fire219.CatBot 1.0 | 7.7 | 6.3% | 0 |
| PSW.Relentless 0.1 | 9.2 | 5.0% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.9 | 22 / 35 | 5355 |
| 2 | 1 | 70.9 | 93.0 | 26 / 35 | 5496 |
| 3 | 1 | 69.3 | 89.5 | 17 / 35 | 5500 |
| 4 | 1 | 71.7 | 95.6 | 26 / 35 | 5618 |
| 5 | 1 | 70.9 | 93.3 | 23 / 35 | 5427 |
| 6 | 1 | 69.6 | 92.4 | 19 / 35 | 5077 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 106 | 65% |
| dummy.mini.Scimitar 1.01 | 32 | 94% |
| cf.RiO.RiOx 4.2.1 | 20 | 100% |
| eld.Hmm 1.0 | 12 | 83% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 1309. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 48 | 60% | 100 |
| dummy.mini.Scimitar 1.01 | 14 | 18% | 47 |
| cf.RiO.RiOx 4.2.1 | 7 | 9% | 25 |
| eld.Hmm 1.0 | 5 | 6% | 23 |
| fire219.CatBot 1.0 | 3 | 4% | 3 |
| oa.weak.BotherBot 0.1 | 2 | 3% | 7 |
| el.JumpShoot 0.2 | 1 | 1% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F22

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 86.0 | 86 / 210 | 2.26 | 17.4% | 26571 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.2 | 17.4% | 86 |
| pe.SandboxDT 2.71m | 1.8 | 17.0% | 80 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.4% | 25 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.6% | 14 |
| bigpete.Stewie 1.0 | 5.0 | 10.6% | 5 |
| tad.Dalek98 0.98 | 6.5 | 7.1% | 0 |
| yk.JahRoslav 1.1 | 6.8 | 6.9% | 0 |
| gg.Squaraus 0.6 | 7.8 | 6.3% | 1 |
| pbg.NinjaX 1.2 | 8.8 | 5.0% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 83.5 | 17 / 35 | 4306 |
| 2 | 2 | 66.4 | 83.5 | 11 / 35 | 4512 |
| 3 | 1 | 68.1 | 89.2 | 14 / 35 | 4522 |
| 4 | 1 | 67.6 | 85.4 | 16 / 35 | 4596 |
| 5 | 1 | 66.5 | 85.4 | 12 / 35 | 4251 |
| 6 | 1 | 68.1 | 89.2 | 16 / 35 | 4384 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 54 | 35% |
| kvk.HebusLeTroll 0.35 | 37 | 78% |
| jlm.javaDisturbance 0.59 | 33 | 82% |
| bigpete.Stewie 1.0 | 7 | 100% |
| tad.Dalek98 0.98 | 2 | 100% |
| pbg.NinjaX 1.2 | 2 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 45 | 36% | 64 |
| kvk.HebusLeTroll 0.35 | 40 | 32% | 66 |
| jlm.javaDisturbance 0.59 | 23 | 19% | 49 |
| tad.Dalek98 0.98 | 10 | 8% | 13 |
| bigpete.Stewie 1.0 | 4 | 3% | 12 |
| gg.Squaraus 0.6 | 1 | 1% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 1 |
| yk.JahRoslav 1.1 | 0 | 0% | 3 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 85.1 | 99 / 210 | 2.34 | 18.1% | 30452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.5 | 18.1% | 99 |
| pe.SandboxLump 1.52 | 1.5 | 17.9% | 77 |
| cre.Karolos 0.32 | 3.0 | 14.1% | 18 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 11.0% | 7 |
| stelo.RamTrackSurfer 1.2 | 5.2 | 9.1% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 9.0% | 3 |
| cw.megas.Blade 0.8 | 7.0 | 8.0% | 0 |
| sample.Walls 1.0 | 7.8 | 7.5% | 2 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.3% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.3 | 19 / 35 | 5141 |
| 2 | 2 | 69.7 | 90.5 | 20 / 35 | 4574 |
| 3 | 1 | 69.3 | 85.4 | 18 / 35 | 5603 |
| 4 | 2 | 67.5 | 83.5 | 12 / 35 | 4905 |
| 5 | 1 | 68.7 | 82.9 | 19 / 35 | 5414 |
| 6 | 2 | 67.0 | 81.3 | 11 / 35 | 4815 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 87 | 57% |
| cre.Karolos 0.32 | 20 | 85% |
| stelo.AreaTargetingBot 1.1 | 19 | 84% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| stelo.RamTrackSurfer 1.2 | 3 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 711. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 63 | 57% | 108 |
| cre.Karolos 0.32 | 20 | 18% | 37 |
| stelo.AreaTargetingBot 1.1 | 17 | 15% | 29 |
| sample.Walls 1.0 | 5 | 5% | 13 |
| stelo.RamTrackSurfer 1.2 | 2 | 2% | 10 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 2% | 6 |
| cw.megas.Blade 0.8 | 1 | 1% | 6 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F24

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 73.8 | 52 / 210 | 3.36 | 14.4% | 20365 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.8 | 14.3% | 37 |
| hadur117.mini.DeiseG1 0.2 | 2.0 | 14.4% | 52 |
| florent.XSeries.X2 0.12 | 2.7 | 13.7% | 43 |
| davidalves.Phoenix 0.54 | 4.3 | 12.1% | 31 |
| pedersen.Ugluk 1.1.1 | 4.3 | 12.3% | 29 |
| oog.melee.Corsair 1.0 | 6.0 | 9.6% | 4 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 7.7% | 14 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.2% | 0 |
| as.FrankTheTank 1.3 | 9.2 | 5.1% | 0 |
| evd.X1 0.01 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 74.6 | 11 / 35 | 3409 |
| 2 | 1 | 62.9 | 74.3 | 10 / 35 | 3703 |
| 3 | 2 | 62.3 | 74.6 | 9 / 35 | 3475 |
| 4 | 1 | 61.4 | 74.3 | 6 / 35 | 3553 |
| 5 | 4 | 59.5 | 70.8 | 6 / 35 | 2959 |
| 6 | 2 | 61.2 | 74.0 | 10 / 35 | 3266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 29 | 55% |
| florent.XSeries.X2 0.12 | 20 | 50% |
| davidalves.Phoenix 0.54 | 16 | 69% |
| pedersen.Ugluk 1.1.1 | 10 | 70% |
| stelo.SoJNanoMelee 1.1 | 6 | 83% |
| oog.melee.Corsair 1.0 | 2 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 51 | 32% | 64 |
| rz.GlowBlowMelee 1.4 | 36 | 23% | 48 |
| pedersen.Ugluk 1.1.1 | 33 | 21% | 41 |
| davidalves.Phoenix 0.54 | 18 | 11% | 29 |
| stelo.SoJNanoMelee 1.1 | 7 | 4% | 9 |
| evd.X1 0.01 | 6 | 4% | 6 |
| oog.melee.Corsair 1.0 | 5 | 3% | 8 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 5 |

## Melee bench: F25

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 83.4 | 115 / 210 | 2.50 | 17.5% | 23687 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 17.5% | 115 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 14.0% | 30 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.7% | 13 |
| jdw.Hurricane 1.4 | 3.7 | 12.2% | 27 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.1% | 9 |
| ds.Oo 2.2 | 5.8 | 8.8% | 9 |
| gjr.Cephalosporin 0.1 | 7.0 | 7.8% | 5 |
| adt.Ar2 1.1 | 8.2 | 7.0% | 1 |
| awesomeness.Elite 1.0 | 8.5 | 6.7% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 81.0 | 17 / 35 | 3833 |
| 2 | 1 | 67.3 | 85.1 | 18 / 35 | 4264 |
| 3 | 1 | 66.6 | 84.1 | 17 / 35 | 4056 |
| 4 | 1 | 68.7 | 89.5 | 24 / 35 | 4189 |
| 5 | 1 | 64.5 | 77.1 | 18 / 35 | 3700 |
| 6 | 1 | 66.3 | 83.5 | 21 / 35 | 3645 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 54 | 80% |
| voidious.micro.BlitzBat 1.05 | 38 | 92% |
| jdw.Hurricane 1.4 | 24 | 75% |
| gre.svman4.Morfeas 1.4.1 | 6 | 50% |
| ds.Oo 2.2 | 5 | 80% |
| gjr.Cephalosporin 0.1 | 5 | 100% |
| adt.Ar2 1.1 | 4 | 100% |
| awesomeness.Elite 1.0 | 2 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 34 | 36% | 74 |
| jdw.Hurricane 1.4 | 26 | 27% | 48 |
| voidious.micro.BlitzBat 1.05 | 12 | 13% | 42 |
| ds.Oo 2.2 | 8 | 8% | 16 |
| gre.svman4.Morfeas 1.4.1 | 8 | 8% | 12 |
| adt.Ar2 1.1 | 3 | 3% | 8 |
| awesomeness.Elite 1.0 | 3 | 3% | 3 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 6 |
| amk.ChumbaMini 0.2 | 0 | 0% | 1 |

## Melee bench: F26

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.3 | 109 / 210 | 2.05 | 18.6% | 32046 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.2 | 18.6% | 109 |
| ak.Fermat 2.0 | 1.8 | 15.3% | 59 |
| lrem.Spectre 0.4.4 | 3.3 | 11.9% | 15 |
| shu.nitro.LENIN .T34 | 3.7 | 11.7% | 16 |
| js.PinBall 1.6 | 5.0 | 10.6% | 4 |
| gh.mini.GrubbmOne 1.0 | 6.0 | 9.6% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 7.0 | 8.8% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.6% | 4 |
| sample.SpinBot 1.0 | 9.0 | 5.2% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 90.5 | 18 / 35 | 5492 |
| 2 | 1 | 68.8 | 87.3 | 20 / 35 | 5445 |
| 3 | 2 | 67.2 | 86.3 | 11 / 35 | 5017 |
| 4 | 1 | 69.1 | 89.8 | 20 / 35 | 5587 |
| 5 | 1 | 69.4 | 89.8 | 21 / 35 | 5240 |
| 6 | 1 | 68.4 | 86.0 | 19 / 35 | 5265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 50 | 44% |
| shu.nitro.LENIN .T34 | 39 | 79% |
| lrem.Spectre 0.4.4 | 31 | 84% |
| js.PinBall 1.6 | 14 | 86% |
| gh.mini.GrubbmOne 1.0 | 7 | 86% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 3 | 100% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 53 | 52% | 75 |
| lrem.Spectre 0.4.4 | 18 | 18% | 40 |
| shu.nitro.LENIN .T34 | 17 | 17% | 57 |
| js.PinBall 1.6 | 3 | 3% | 13 |
| gh.mini.GrubbmOne 1.0 | 3 | 3% | 8 |
| jaybot.adv.bots.JayBot 2.0 | 3 | 3% | 6 |
| sample.SpinBot 1.0 | 3 | 3% | 5 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 5 |

## Melee bench: F27

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 84.1 | 124 / 210 | 2.43 | 18.0% | 26806 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 18.0% | 124 |
| mk.Alpha 0.2.1 | 2.0 | 14.6% | 49 |
| wee.Gem 1.8.4 | 4.0 | 11.1% | 16 |
| EH.Eagle 1.0.6 | 4.2 | 10.2% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 5.7 | 9.1% | 1 |
| joe.ADinosaur 1.0 | 6.0 | 8.8% | 3 |
| sheldor.melee.nano.TestMelee 0.1 | 6.7 | 8.6% | 9 |
| throxbot.ThroxBot 0.1 | 7.0 | 8.4% | 3 |
| caimano.Furia_Ceca 0.22 | 8.5 | 7.3% | 2 |
| cs.Grudge 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 91.1 | 27 / 35 | 4606 |
| 2 | 1 | 67.0 | 85.4 | 23 / 35 | 4179 |
| 3 | 1 | 67.4 | 88.3 | 20 / 35 | 4260 |
| 4 | 1 | 67.1 | 86.0 | 19 / 35 | 4365 |
| 5 | 1 | 66.6 | 85.1 | 22 / 35 | 4020 |
| 6 | 1 | 65.0 | 68.6 | 13 / 35 | 5376 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 80 | 89% |
| wee.Gem 1.8.4 | 26 | 92% |
| EH.Eagle 1.0.6 | 11 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 83% |
| throxbot.ThroxBot 0.1 | 6 | 67% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 32 | 37% | 97 |
| joe.ADinosaur 1.0 | 15 | 17% | 16 |
| wee.Gem 1.8.4 | 10 | 12% | 34 |
| caimano.Furia_Ceca 0.22 | 9 | 10% | 14 |
| throxbot.ThroxBot 0.1 | 8 | 9% | 9 |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 6% | 7 |
| EH.Eagle 1.0.6 | 3 | 3% | 19 |
| cs.Grudge 1.0 | 3 | 3% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 1% | 11 |

## Melee bench: F28

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 87.0 | 112 / 210 | 2.17 | 17.7% | 23472 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 17.7% | 112 |
| kid.test.NightFox .2 | 2.0 | 15.5% | 54 |
| uji.Antique 1.0 | 3.0 | 11.5% | 17 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.5% | 12 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.2% | 5 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.4% | 7 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.3% | 3 |
| matt.advanced.Katana 1.0 | 8.0 | 6.7% | 1 |
| stelo.Lifestealer 1.0 | 9.2 | 5.6% | 0 |
| stelo.PianistNano 1.2 | 9.7 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 86.7 | 19 / 35 | 4173 |
| 2 | 1 | 63.7 | 79.0 | 14 / 35 | 3582 |
| 3 | 1 | 69.2 | 92.7 | 24 / 35 | 4323 |
| 4 | 1 | 67.4 | 90.8 | 21 / 35 | 3875 |
| 5 | 1 | 65.6 | 84.1 | 15 / 35 | 3550 |
| 6 | 1 | 67.0 | 88.6 | 19 / 35 | 3969 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 83 | 67% |
| uji.Antique 1.0 | 28 | 86% |
| qohnil.blot.BlotBot 3.61 | 16 | 69% |
| pfvicm.Sobieski 7.2.3b | 9 | 67% |
| amk.ChumbaWumba 0.3 | 5 | 80% |
| matt.advanced.Katana 1.0 | 5 | 100% |
| ahr.ice.Ice 1.0.2 | 4 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 41 | 41% | 85 |
| amk.ChumbaWumba 0.3 | 21 | 21% | 26 |
| qohnil.blot.BlotBot 3.61 | 11 | 11% | 24 |
| uji.Antique 1.0 | 8 | 8% | 34 |
| pfvicm.Sobieski 7.2.3b | 8 | 8% | 18 |
| ahr.ice.Ice 1.0.2 | 4 | 4% | 12 |
| stelo.Lifestealer 1.0 | 3 | 3% | 3 |
| matt.advanced.Katana 1.0 | 2 | 2% | 6 |
| stelo.PianistNano 1.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 81.6 | 91 / 210 | 2.66 | 17.2% | 25739 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.2 | 17.2% | 91 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.2% | 58 |
| deewiant.Anomaly 0.2 | 2.7 | 14.6% | 36 |
| myl.micro.Troodon 1.10 | 4.3 | 12.1% | 9 |
| jok.PheonixM 0.1.2 | 4.7 | 10.6% | 7 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.2% | 2 |
| DBall.Anarchy 0.1 | 7.3 | 6.4% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 6.0% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.9% | 2 |
| jangs.ns51 1.0 | 9.3 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.6 | 18 / 35 | 3918 |
| 2 | 1 | 67.1 | 84.1 | 16 / 35 | 4360 |
| 3 | 1 | 66.5 | 81.9 | 14 / 35 | 4400 |
| 4 | 1 | 68.0 | 83.8 | 20 / 35 | 4446 |
| 5 | 1 | 66.4 | 81.6 | 14 / 35 | 4199 |
| 6 | 2 | 65.0 | 76.5 | 9 / 35 | 4416 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 43 | 79% |
| zyx.mega.YersiniaPestis 3.1 | 42 | 50% |
| myl.micro.Troodon 1.10 | 24 | 96% |
| jok.PheonixM 0.1.2 | 7 | 71% |
| DBall.Anarchy 0.1 | 6 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 0% |

Hadur died in 119 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 40 | 34% | 62 |
| deewiant.Anomaly 0.2 | 30 | 25% | 65 |
| myl.micro.Troodon 1.10 | 19 | 16% | 40 |
| jok.PheonixM 0.1.2 | 16 | 13% | 24 |
| ph.melee.ArcherME 0.3 | 7 | 6% | 7 |
| jangs.ns51 1.0 | 4 | 3% | 4 |
| DBall.Anarchy 0.1 | 2 | 2% | 7 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |

## Melee bench: F30

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 77.0 | 57 / 210 | 3.07 | 15.4% | 23756 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.2 | 15.4% | 57 |
| catcat20.Matcha 0.006 | 2.5 | 13.9% | 45 |
| darkcanuck.B26354 1.06 | 2.8 | 13.2% | 49 |
| stelo.PastFuture 2.3.2 | 4.2 | 12.7% | 28 |
| oog.melee.Capulet 1.2 | 4.3 | 12.1% | 18 |
| intruder.PrairieWolf 2.61 | 6.8 | 8.2% | 6 |
| fowl3628800.LightningBolt 2.6.0 | 7.0 | 7.4% | 3 |
| ntc.Opposite 1.5 | 7.5 | 7.5% | 1 |
| tripphippy.Alice 1.1 | 8.7 | 7.0% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 77.1 | 12 / 35 | 3939 |
| 2 | 1 | 63.5 | 77.5 | 9 / 35 | 3983 |
| 3 | 1 | 65.2 | 81.9 | 11 / 35 | 4257 |
| 4 | 1 | 64.0 | 78.7 | 10 / 35 | 3977 |
| 5 | 2 | 60.9 | 70.8 | 5 / 35 | 3634 |
| 6 | 1 | 63.3 | 75.9 | 10 / 35 | 3966 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 26 | 50% |
| catcat20.Matcha 0.006 | 23 | 57% |
| stelo.PastFuture 2.3.2 | 17 | 53% |
| oog.melee.Capulet 1.2 | 15 | 67% |
| intruder.PrairieWolf 2.61 | 5 | 80% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 100% |
| ntc.Opposite 1.5 | 3 | 67% |
| tripphippy.Alice 1.1 | 3 | 67% |

Hadur died in 153 of 210 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 44 | 29% | 61 |
| stelo.PastFuture 2.3.2 | 36 | 24% | 42 |
| darkcanuck.B26354 1.06 | 31 | 20% | 44 |
| oog.melee.Capulet 1.2 | 18 | 12% | 30 |
| tripphippy.Alice 1.1 | 8 | 5% | 10 |
| intruder.PrairieWolf 2.61 | 7 | 5% | 11 |
| ntc.Opposite 1.5 | 5 | 3% | 5 |
| fowl3628800.LightningBolt 2.6.0 | 3 | 2% | 6 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |

## Melee bench: F31

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 76.5 | 58 / 210 | 3.11 | 15.0% | 20398 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.8% | 102 |
| hadur117.mini.DeiseG1 0.2 | 2.0 | 15.0% | 58 |
| gh.mini.Griezel 0.2 | 3.2 | 12.9% | 35 |
| spinnercat.micro.Tyger 0.1 | 4.0 | 11.9% | 8 |
| d414.nano.Quantum 1.0.0 | 4.8 | 10.6% | 6 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.9% | 0 |
| timmit.nano.TimDog 0.33 | 7.3 | 7.0% | 2 |
| fm.mammillarias 1.3 | 7.8 | 6.3% | 1 |
| tlp.ThreeLeggedPig 1 | 9.2 | 4.9% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 71.1 | 11 / 35 | 3285 |
| 2 | 2 | 64.5 | 80.6 | 11 / 35 | 3699 |
| 3 | 2 | 63.0 | 80.0 | 6 / 35 | 3284 |
| 4 | 2 | 64.5 | 81.6 | 13 / 35 | 3435 |
| 5 | 2 | 61.8 | 74.6 | 7 / 35 | 3204 |
| 6 | 2 | 62.0 | 71.1 | 10 / 35 | 3491 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 53 | 42% |
| gh.mini.Griezel 0.2 | 23 | 52% |
| spinnercat.micro.Tyger 0.1 | 16 | 88% |
| d414.nano.Quantum 1.0.0 | 8 | 88% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 73 | 48% | 98 |
| spinnercat.micro.Tyger 0.1 | 29 | 19% | 40 |
| gh.mini.Griezel 0.2 | 23 | 15% | 33 |
| d414.nano.Quantum 1.0.0 | 13 | 9% | 18 |
| timmit.nano.TimDog 0.33 | 7 | 5% | 9 |
| fm.mammillarias 1.3 | 6 | 4% | 6 |
| gh.nano.Grofvuil 0.2 | 1 | 1% | 5 |

## Melee bench: F32

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 85.2 | 125 / 210 | 2.33 | 17.8% | 26189 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 17.8% | 125 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.6% | 40 |
| apc.botM 3.0 | 3.2 | 11.4% | 12 |
| lxx.ConceptA 0.8 | 4.2 | 10.7% | 6 |
| vjik.UnViolation 1.1 | 5.0 | 9.9% | 10 |
| bayen.UbaMicro 1.4 | 6.0 | 9.1% | 4 |
| panzer.Panzer 0.2 | 7.0 | 7.9% | 2 |
| yk.JahMicro 1.0 | 8.7 | 6.4% | 6 |
| conscience.Electron 1.3g | 8.8 | 6.2% | 0 |
| donjezza.Jezza 1.0 | 9.2 | 5.9% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.9 | 20 / 35 | 4555 |
| 2 | 1 | 67.9 | 90.8 | 22 / 35 | 4312 |
| 3 | 1 | 65.2 | 81.0 | 21 / 35 | 4189 |
| 4 | 1 | 67.1 | 85.4 | 22 / 35 | 4426 |
| 5 | 1 | 66.7 | 87.0 | 18 / 35 | 4525 |
| 6 | 1 | 66.9 | 85.4 | 22 / 35 | 4182 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 71 | 76% |
| lxx.ConceptA 0.8 | 22 | 91% |
| apc.botM 3.0 | 18 | 94% |
| vjik.UnViolation 1.1 | 17 | 82% |
| panzer.Panzer 0.2 | 8 | 88% |
| yk.JahMicro 1.0 | 6 | 83% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| donjezza.Jezza 1.0 | 4 | 75% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 26 | 30% | 82 |
| lxx.ConceptA 0.8 | 26 | 30% | 36 |
| apc.botM 3.0 | 10 | 12% | 27 |
| bayen.UbaMicro 1.4 | 10 | 12% | 18 |
| vjik.UnViolation 1.1 | 6 | 7% | 24 |
| yk.JahMicro 1.0 | 3 | 3% | 9 |
| donjezza.Jezza 1.0 | 2 | 2% | 7 |
| panzer.Panzer 0.2 | 2 | 2% | 4 |
| conscience.Electron 1.3g | 1 | 1% | 3 |

## Melee bench: F33

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.7 | 123 / 210 | 2.20 | 18.9% | 29206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 18.9% | 123 |
| maribo.Quester 0.3 | 2.0 | 16.2% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.5% | 17 |
| labg.Cataclysm 2.05 | 4.5 | 10.4% | 15 |
| gre.svman4.Leonidas 1.3.2 | 4.7 | 10.5% | 9 |
| baal.nano.N 1.42 | 6.2 | 8.5% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 7.7% | 2 |
| zyx.micro.Ant 1.1 | 8.2 | 6.3% | 2 |
| sanja.First 0.1 | 9.0 | 5.2% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 85.7 | 19 / 35 | 4874 |
| 2 | 1 | 67.1 | 82.9 | 20 / 35 | 4328 |
| 3 | 1 | 68.7 | 85.7 | 18 / 35 | 5143 |
| 4 | 1 | 70.6 | 89.8 | 22 / 35 | 5319 |
| 5 | 1 | 69.5 | 88.3 | 22 / 35 | 5081 |
| 6 | 1 | 68.7 | 87.6 | 22 / 35 | 4461 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 71 | 77% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 72% |
| gre.svman4.Leonidas 1.3.2 | 23 | 91% |
| labg.Cataclysm 2.05 | 10 | 80% |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 100% |
| sanja.First 0.1 | 1 | 100% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 961. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 38 | 42% | 90 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 14% | 44 |
| zyx.micro.Ant 1.1 | 12 | 13% | 14 |
| labg.Cataclysm 2.05 | 10 | 11% | 24 |
| gre.svman4.Leonidas 1.3.2 | 6 | 7% | 16 |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 4% | 8 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 4 | 4% | 5 |
| baal.nano.N 1.42 | 3 | 3% | 4 |
| sanja.First 0.1 | 1 | 1% | 4 |

## Melee bench: F34

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 84.2 | 66 / 210 | 2.42 | 17.1% | 28253 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.5 | 17.1% | 66 |
| stelo.Spread 0.9 | 2.0 | 16.2% | 71 |
| kid.Gladiator .7.2 | 2.5 | 16.4% | 50 |
| jcs.Seth 1.8 | 4.3 | 11.2% | 16 |
| tcf.Reach 3 | 5.2 | 10.4% | 6 |
| cli.Dancer 1.1 | 5.7 | 9.8% | 1 |
| ratosh.Wesco 1.4 | 6.8 | 8.1% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.9% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.3% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 83.5 | 10 / 35 | 4935 |
| 2 | 2 | 67.4 | 86.0 | 14 / 35 | 4321 |
| 3 | 3 | 64.9 | 77.5 | 6 / 35 | 4599 |
| 4 | 1 | 68.6 | 88.6 | 14 / 35 | 4938 |
| 5 | 1 | 67.3 | 84.8 | 10 / 35 | 4895 |
| 6 | 1 | 67.2 | 84.8 | 12 / 35 | 4565 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 52 | 44% |
| kid.Gladiator .7.2 | 47 | 40% |
| jcs.Seth 1.8 | 20 | 80% |
| ratosh.Wesco 1.4 | 3 | 67% |
| cli.Dancer 1.1 | 2 | 100% |
| tcf.Reach 3 | 2 | 50% |
| sample.VelociRobot 1.0 | 1 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 1019. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 61 | 42% | 84 |
| kid.Gladiator .7.2 | 56 | 39% | 72 |
| jcs.Seth 1.8 | 11 | 8% | 29 |
| ratosh.Wesco 1.4 | 7 | 5% | 10 |
| tcf.Reach 3 | 7 | 5% | 8 |
| cli.Dancer 1.1 | 2 | 1% | 4 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 73.7 | 21 / 210 | 3.37 | 13.6% | 19144 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.0% | 158 |
| hadur117.mini.DeiseG1 0.2 | 2.5 | 13.6% | 21 |
| gh.mini.Gruwel 0.9 | 3.2 | 12.9% | 15 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.3% | 14 |
| rz.HawkOnFire 0.1 | 4.5 | 11.3% | 4 |
| wit.Chuliath 1.0 | 6.3 | 6.9% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.2 | 6.7% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 6.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.1% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 76.2 | 1 / 35 | 3336 |
| 2 | 2 | 61.3 | 74.3 | 5 / 35 | 3227 |
| 3 | 4 | 59.9 | 72.4 | 2 / 35 | 2786 |
| 4 | 3 | 60.5 | 73.3 | 3 / 35 | 3075 |
| 5 | 2 | 60.8 | 72.7 | 6 / 35 | 3273 |
| 6 | 2 | 61.3 | 73.0 | 4 / 35 | 3447 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 33 | 18% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 70% |
| gh.mini.Gruwel 0.9 | 7 | 14% |
| rz.HawkOnFire 0.1 | 6 | 83% |
| myl.nano.KomoriNinja 1.1 | 2 | 100% |

Hadur died in 189 of 210 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 105 | 56% | 111 |
| rz.HawkOnFire 0.1 | 25 | 13% | 27 |
| dmh.robocode.robot.BlackDeath 9.2 | 24 | 13% | 32 |
| gh.mini.Gruwel 0.9 | 22 | 12% | 24 |
| dans.Cinnamon 1.2 | 4 | 2% | 5 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 4 |
| stelo.MyAgileRobot 0.2 | 4 | 2% | 4 |
| wit.Chuliath 1.0 | 1 | 1% | 1 |
| myl.nano.KomoriNinja 1.1 | 0 | 0% | 2 |

## Melee bench: F36

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 92.8 | 164 / 210 | 1.65 | 20.7% | 31731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 20.7% | 164 |
| bzdp.Pansy 2.1 | 2.5 | 12.4% | 14 |
| alpha.RainingFire 1.0 | 3.0 | 12.0% | 11 |
| bvh.micro.Freya 0.3 | 4.7 | 10.5% | 9 |
| mz.Cork 0.1 | 4.8 | 10.1% | 6 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.2% | 1 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.1% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 6.7% | 1 |
| dl.BetterWalls 1.0 | 9.0 | 5.0% | 1 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 92.7 | 30 / 35 | 4774 |
| 2 | 1 | 70.3 | 89.2 | 27 / 35 | 5407 |
| 3 | 1 | 70.8 | 93.7 | 25 / 35 | 5530 |
| 4 | 1 | 71.2 | 94.3 | 27 / 35 | 5275 |
| 5 | 1 | 71.9 | 94.3 | 30 / 35 | 5629 |
| 6 | 1 | 70.4 | 92.7 | 25 / 35 | 5116 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 54 | 94% |
| bvh.micro.Freya 0.3 | 32 | 94% |
| alpha.RainingFire 1.0 | 30 | 87% |
| mz.Cork 0.1 | 25 | 84% |
| bvh.mini.Fenrir 0.39 | 16 | 100% |
| m3thos.Eva02 0.7.1 | 15 | 87% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 15 | 32% | 49 |
| bzdp.Pansy 2.1 | 9 | 19% | 58 |
| bvh.micro.Freya 0.3 | 9 | 19% | 25 |
| mz.Cork 0.1 | 6 | 13% | 26 |
| m3thos.Eva02 0.7.1 | 4 | 9% | 22 |
| bvh.mini.Fenrir 0.39 | 3 | 6% | 11 |
| dl.BetterWalls 1.0 | 1 | 2% | 7 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 9 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |

## Melee bench: F37

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 81.4 | 129 / 210 | 2.68 | 17.4% | 30558 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 17.4% | 129 |
| germ.TheMind .2 | 2.5 | 11.6% | 18 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.0 | 10.2% | 9 |
| EBBU.Sim2 1.02 | 4.2 | 10.0% | 10 |
| stelo.UntouchableNano 1.3 | 5.7 | 9.2% | 10 |
| lmk.ACPFinal 0.1 | 6.0 | 9.0% | 6 |
| agrach.Dalek 1.0 | 6.7 | 8.8% | 11 |
| mb.Beast 0.1 | 7.5 | 8.3% | 13 |
| skm.Ryubot 1.0 | 8.2 | 8.1% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 7.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 85.1 | 20 / 35 | 5699 |
| 2 | 1 | 64.5 | 78.7 | 19 / 35 | 4697 |
| 3 | 1 | 65.6 | 81.0 | 21 / 35 | 5153 |
| 4 | 1 | 65.1 | 78.7 | 21 / 35 | 4941 |
| 5 | 1 | 66.1 | 81.3 | 24 / 35 | 5296 |
| 6 | 1 | 65.8 | 83.5 | 24 / 35 | 4772 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 32 | 91% |
| EBBU.Sim2 1.02 | 26 | 88% |
| skm.Ryubot 1.0 | 20 | 100% |
| stelo.UntouchableNano 1.3 | 16 | 81% |
| lmk.ACPFinal 0.1 | 13 | 85% |
| com.syncleus.robocode.Dreadnaught 0.1 | 12 | 83% |
| mb.Beast 0.1 | 11 | 100% |
| agrach.Dalek 1.0 | 10 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 416. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 22 | 27% | 53 |
| EBBU.Sim2 1.02 | 12 | 15% | 26 |
| com.syncleus.robocode.Dreadnaught 0.1 | 11 | 13% | 25 |
| stelo.UntouchableNano 1.3 | 11 | 13% | 19 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 11% | 11 |
| lmk.ACPFinal 0.1 | 7 | 9% | 20 |
| agrach.Dalek 1.0 | 6 | 7% | 22 |
| mb.Beast 0.1 | 4 | 5% | 14 |
| skm.Ryubot 1.0 | 0 | 0% | 15 |

## Melee bench: F38

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 76.0 | 50 / 210 | 3.16 | 14.9% | 23222 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.5% | 85 |
| hadur117.mini.DeiseG1 0.2 | 2.0 | 14.9% | 50 |
| bvh.mini.Freya 0.55 | 3.0 | 13.4% | 24 |
| bts.mega.Gnarly 1.4 | 4.7 | 11.1% | 19 |
| cs.Wren 1.0 | 5.0 | 10.7% | 10 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.8 | 9.9% | 9 |
| kdf.KoulDestroyer 1.0 | 6.5 | 9.0% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.8 | 5.5% | 3 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.7% | 0 |
| bzdp.BoxCar 2.0 | 9.2 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 81.3 | 12 / 35 | 4094 |
| 2 | 2 | 62.2 | 72.7 | 7 / 35 | 4134 |
| 3 | 2 | 61.7 | 74.0 | 7 / 35 | 3404 |
| 4 | 2 | 61.1 | 72.4 | 7 / 35 | 3388 |
| 5 | 2 | 62.8 | 74.3 | 10 / 35 | 4019 |
| 6 | 2 | 64.3 | 81.6 | 7 / 35 | 4183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 37 | 43% |
| bvh.mini.Freya 0.55 | 20 | 70% |
| bts.mega.Gnarly 1.4 | 12 | 58% |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 60% |
| cs.Wren 1.0 | 6 | 67% |
| kdf.KoulDestroyer 1.0 | 2 | 50% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 59 | 37% | 79 |
| bvh.mini.Freya 0.55 | 34 | 21% | 41 |
| bts.mega.Gnarly 1.4 | 25 | 16% | 33 |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 11% | 24 |
| cs.Wren 1.0 | 12 | 8% | 19 |
| kdf.KoulDestroyer 1.0 | 8 | 5% | 9 |
| bzdp.BoxCar 2.0 | 2 | 1% | 2 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 1 |

## Melee bench: F39

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 87.2 | 94 / 210 | 2.15 | 18.0% | 28486 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 18.0% | 94 |
| bvh.fry.Freya 0.82 | 2.0 | 15.2% | 29 |
| az.Ololobot 0.2.4 | 3.5 | 12.0% | 44 |
| catcat20.Lambda 0.024 | 3.5 | 11.4% | 32 |
| apollokidd.ApolloKidd 0.9 | 6.2 | 8.0% | 0 |
| gimp.GimpBot 0.1 | 6.5 | 7.9% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 6.8 | 8.0% | 10 |
| winamp32.micro.MicroMacro 1.0 | 6.8 | 8.0% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.9% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 88.9 | 18 / 35 | 4450 |
| 2 | 1 | 67.2 | 88.6 | 12 / 35 | 5024 |
| 3 | 1 | 65.4 | 82.2 | 11 / 35 | 4816 |
| 4 | 1 | 67.8 | 90.5 | 16 / 35 | 4773 |
| 5 | 1 | 67.3 | 87.3 | 19 / 35 | 4693 |
| 6 | 1 | 67.5 | 85.7 | 18 / 35 | 4730 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 45 | 56% |
| bvh.fry.Freya 0.82 | 43 | 67% |
| catcat20.Lambda 0.024 | 30 | 67% |
| stelo.SoRobotNanoMelee 1.2 | 19 | 84% |
| winamp32.micro.MicroMacro 1.0 | 2 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |
| gimp.GimpBot 0.1 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 1079. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 44 | 38% | 69 |
| az.Ololobot 0.2.4 | 31 | 27% | 64 |
| catcat20.Lambda 0.024 | 19 | 16% | 32 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 12% | 21 |
| gimp.GimpBot 0.1 | 4 | 3% | 9 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 2% | 3 |
| apollokidd.ApolloKidd 0.9 | 1 | 1% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 2 |
| winamp32.micro.MicroMacro 1.0 | 0 | 0% | 4 |

## Melee bench: F40

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.3 | 108 / 210 | 2.23 | 18.3% | 27600 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 18.3% | 108 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.5% | 38 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.7% | 32 |
| mz.AntiGrav 1.0 | 4.2 | 11.2% | 14 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.0% | 5 |
| stelo.Randomness 1.0 | 6.3 | 8.8% | 7 |
| alpha.BlackIce 1.0 | 6.7 | 8.5% | 4 |
| amk.superstrike.SuperStrike 0.3 | 8.2 | 6.4% | 1 |
| testantiswapgun.AntiSwap 1.0 | 8.7 | 5.6% | 0 |
| sample.Corners 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 87.3 | 20 / 35 | 4573 |
| 2 | 1 | 66.4 | 84.8 | 15 / 35 | 4124 |
| 3 | 1 | 68.7 | 88.3 | 19 / 35 | 4673 |
| 4 | 1 | 67.5 | 82.9 | 18 / 35 | 4980 |
| 5 | 1 | 67.4 | 87.0 | 16 / 35 | 4564 |
| 6 | 1 | 68.3 | 87.9 | 20 / 35 | 4686 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 43 | 77% |
| kano.gamma.KanoGamma 1.8 | 41 | 71% |
| mz.AntiGrav 1.0 | 20 | 95% |
| stelo.Randomness 1.0 | 13 | 69% |
| Polkwane.SmashMelee 1.0 | 12 | 100% |
| alpha.BlackIce 1.0 | 4 | 50% |
| sample.Corners 1.0 | 4 | 75% |
| amk.superstrike.SuperStrike 0.3 | 2 | 50% |

Hadur died in 103 of 210 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 33 | 32% | 57 |
| kano.gamma.KanoGamma 1.8 | 26 | 25% | 54 |
| mz.AntiGrav 1.0 | 13 | 13% | 36 |
| stelo.Randomness 1.0 | 7 | 7% | 17 |
| Polkwane.SmashMelee 1.0 | 6 | 6% | 19 |
| amk.superstrike.SuperStrike 0.3 | 6 | 6% | 7 |
| alpha.BlackIce 1.0 | 5 | 5% | 10 |
| sample.Corners 1.0 | 4 | 4% | 5 |
| testantiswapgun.AntiSwap 1.0 | 3 | 3% | 4 |

## Melee bench: F41

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 85.3 | 105 / 210 | 2.32 | 17.3% | 23679 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 17.3% | 105 |
| eem.EvBotNG v12.8 | 2.0 | 15.2% | 57 |
| ary.Swarm 1.1 | 3.3 | 13.2% | 13 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.4% | 19 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.6% | 11 |
| shrub.Silver v048 | 5.8 | 9.6% | 3 |
| zyx.nano.Ant 1.1 | 7.0 | 7.4% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 6.1% | 2 |
| stelo.Mirror 1.1 | 8.5 | 5.8% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 83.5 | 16 / 35 | 3896 |
| 2 | 1 | 66.8 | 84.1 | 17 / 35 | 4015 |
| 3 | 1 | 66.0 | 83.2 | 15 / 35 | 3962 |
| 4 | 1 | 68.0 | 89.2 | 22 / 35 | 3784 |
| 5 | 1 | 66.7 | 84.8 | 16 / 35 | 4019 |
| 6 | 1 | 67.1 | 87.3 | 19 / 35 | 4003 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 52 | 50% |
| lessonz.robocode.Oz 0.5.0 | 33 | 76% |
| ary.Swarm 1.1 | 26 | 85% |
| simonton.nano.MeleeSeed 1.8 | 18 | 89% |
| jsal.Jsalbot 1.0 | 7 | 100% |
| stelo.Mirror 1.1 | 6 | 100% |
| shrub.Silver v048 | 3 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 40 | 37% | 69 |
| ary.Swarm 1.1 | 29 | 27% | 52 |
| lessonz.robocode.Oz 0.5.0 | 15 | 14% | 31 |
| simonton.nano.MeleeSeed 1.8 | 11 | 10% | 27 |
| zyx.nano.Ant 1.1 | 4 | 4% | 5 |
| stelo.Mirror 1.1 | 3 | 3% | 8 |
| acogdev.alpha 0.2 | 2 | 2% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 8 |
| shrub.Silver v048 | 1 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.0 | 112 / 210 | 2.26 | 18.2% | 29725 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 18.2% | 112 |
| wompi.Wallaby 5.1 | 2.0 | 15.5% | 55 |
| maribo.mini.MiniQuester 0.1 | 3.2 | 13.4% | 9 |
| ara.Shera 0.88 | 3.8 | 12.6% | 27 |
| amz.NanoClone 1.41 | 5.3 | 8.9% | 0 |
| maribo.IotaCT 1.1 | 6.2 | 7.4% | 0 |
| dsw.StaticD 1.0 | 6.8 | 7.0% | 6 |
| stelo.MirrorMicro 1.0 | 8.0 | 6.3% | 1 |
| mme.NikeEnhanced 2.0 | 9.2 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 84.4 | 20 / 35 | 5025 |
| 2 | 1 | 67.0 | 86.0 | 17 / 35 | 4601 |
| 3 | 1 | 67.3 | 83.5 | 18 / 35 | 5043 |
| 4 | 1 | 69.5 | 90.5 | 20 / 35 | 5232 |
| 5 | 1 | 66.4 | 85.1 | 15 / 35 | 4547 |
| 6 | 1 | 68.9 | 86.7 | 22 / 35 | 5277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 64 | 70% |
| maribo.mini.MiniQuester 0.1 | 38 | 92% |
| ara.Shera 0.88 | 28 | 68% |
| dsw.StaticD 1.0 | 8 | 75% |
| amz.NanoClone 1.41 | 3 | 100% |
| maribo.IotaCT 1.1 | 3 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 42 | 43% | 88 |
| ara.Shera 0.88 | 27 | 28% | 47 |
| maribo.mini.MiniQuester 0.1 | 11 | 11% | 43 |
| amz.NanoClone 1.41 | 6 | 6% | 8 |
| dsw.StaticD 1.0 | 4 | 4% | 10 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 3 |
| maribo.IotaCT 1.1 | 2 | 2% | 6 |
| mme.NikeEnhanced 2.0 | 2 | 2% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 3 |

## Melee bench: F43

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 71.6 | 21 / 210 | 3.55 | 13.7% | 20517 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.1% | 164 |
| hadur117.mini.DeiseG1 0.2 | 2.3 | 13.7% | 21 |
| brainfade.melee.Dusk 0.44 | 2.8 | 12.8% | 18 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.3% | 3 |
| wcsv.melee.EngineerMelee 0.1 | 5.3 | 10.4% | 4 |
| Krabb.akim2.Akim2 1.1b | 5.5 | 10.0% | 0 |
| mz.NanoGod 2.02 | 7.3 | 7.6% | 0 |
| jab.DiamondStealer 5 | 7.7 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 70.5 | 2 / 35 | 3657 |
| 2 | 2 | 63.5 | 75.2 | 5 / 35 | 3392 |
| 3 | 2 | 63.0 | 73.0 | 5 / 35 | 3747 |
| 4 | 3 | 61.4 | 70.5 | 5 / 35 | 2996 |
| 5 | 2 | 63.0 | 72.4 | 3 / 35 | 3552 |
| 6 | 3 | 60.9 | 68.3 | 1 / 35 | 3173 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 42 | 12% |
| brainfade.melee.Dusk 0.44 | 10 | 80% |
| dummy.micro.Sparrow 2.5 | 7 | 86% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 0% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |

Hadur died in 189 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 135 | 71% | 141 |
| dummy.micro.Sparrow 2.5 | 18 | 10% | 24 |
| brainfade.melee.Dusk 0.44 | 16 | 8% | 21 |
| wcsv.melee.EngineerMelee 0.1 | 12 | 6% | 13 |
| Krabb.akim2.Akim2 1.1b | 5 | 3% | 7 |
| jab.DiamondStealer 5 | 1 | 1% | 2 |
| mz.NanoGod 2.02 | 1 | 1% | 1 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |

## Melee bench: F44

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 90.2 | 123 / 210 | 1.89 | 19.5% | 30925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 19.5% | 123 |
| tzu.TheArtOfWar 1.2 | 2.5 | 14.1% | 29 |
| stelo.Liblix 0.3.1 | 2.5 | 14.6% | 46 |
| wompi.Quokka 1.6 | 4.0 | 10.6% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 9.2% | 2 |
| jwirde.Gort 2.0 | 5.5 | 9.0% | 2 |
| disan.Chair 2.2.0 | 7.3 | 7.4% | 2 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.5% | 1 |
| sample.Crazy 1.0 | 9.5 | 4.5% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 95.6 | 26 / 35 | 5265 |
| 2 | 1 | 69.9 | 89.2 | 21 / 35 | 5327 |
| 3 | 1 | 69.0 | 89.2 | 17 / 35 | 5168 |
| 4 | 1 | 69.6 | 89.2 | 21 / 35 | 5119 |
| 5 | 1 | 69.4 | 90.5 | 19 / 35 | 4839 |
| 6 | 1 | 69.1 | 87.3 | 19 / 35 | 5207 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 75 | 60% |
| tzu.TheArtOfWar 1.2 | 66 | 77% |
| wompi.Quokka 1.6 | 13 | 77% |
| jwirde.Gort 2.0 | 6 | 83% |
| disan.Chair 2.2.0 | 5 | 80% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 100% |
| stf.PanzerGeneral 0.1 | 3 | 67% |
| sample.Crazy 1.0 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 44 | 51% | 89 |
| tzu.TheArtOfWar 1.2 | 26 | 30% | 76 |
| wompi.Quokka 1.6 | 7 | 8% | 13 |
| stf.PanzerGeneral 0.1 | 4 | 5% | 10 |
| disan.Chair 2.2.0 | 3 | 3% | 7 |
| jwirde.Gort 2.0 | 1 | 1% | 6 |
| sample.Crazy 1.0 | 1 | 1% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 1 | 1% | 3 |

## Melee bench: F45

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.1 | 104 / 210 | 2.07 | 19.8% | 33787 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseG1 0.2 | 1.0 | 19.8% | 104 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 12.9% | 88 |
| jje.BagPuss 1.2 | 3.0 | 11.8% | 8 |
| myl.nano.Graviton 1.10 | 4.5 | 9.8% | 2 |
| sul.Lunar 1.1 | 4.7 | 10.1% | 7 |
| hvilela.HVilela 0.9 | 6.0 | 9.0% | 0 |
| fm.claire 1.7 | 7.3 | 8.3% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 7.9% | 0 |
| wit.Deep7 2.0 | 9.3 | 5.5% | 1 |
| abud.ThirdRobo 1.0 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 91.7 | 19 / 35 | 5132 |
| 2 | 1 | 68.3 | 84.8 | 16 / 35 | 5365 |
| 3 | 1 | 71.7 | 93.7 | 21 / 35 | 6355 |
| 4 | 1 | 67.3 | 80.0 | 17 / 35 | 5204 |
| 5 | 1 | 70.5 | 91.7 | 18 / 35 | 5924 |
| 6 | 1 | 69.2 | 87.0 | 13 / 35 | 5807 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 106 | 47% |
| sul.Lunar 1.1 | 19 | 95% |
| jje.BagPuss 1.2 | 17 | 71% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 100% |
| myl.nano.Graviton 1.10 | 6 | 100% |
| fm.claire 1.7 | 3 | 100% |
| wit.Deep7 2.0 | 2 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 1967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 56 | 53% | 0 |
| jje.BagPuss 1.2 | 17 | 16% | 51 |
| myl.nano.Graviton 1.10 | 10 | 9% | 37 |
| sul.Lunar 1.1 | 8 | 8% | 63 |
| hvilela.HVilela 0.9 | 6 | 6% | 17 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 5% | 17 |
| fm.claire 1.7 | 2 | 2% | 11 |
| wit.Deep7 2.0 | 2 | 2% | 7 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |

## Melee bench: F46

hadur117.mini.DeiseG1 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 76.1 | 24 / 210 | 3.15 | 14.8% | 25142 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.2 | 17.5% | 100 |
| kc.mini.Mirage 0.2 | 1.8 | 16.7% | 62 |
| hadur117.mini.DeiseG1 0.2 | 3.0 | 14.8% | 24 |
| cx.Princess 1.0 | 4.3 | 10.3% | 15 |
| mz.MicroSheep 1.0 | 4.8 | 10.2% | 6 |
| sadoner.killer 0.2 | 5.8 | 9.1% | 3 |
| arthord.NanoSatanMelee Beta | 7.5 | 6.9% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.7 | 5.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.2 | 75.2 | 3 / 35 | 4362 |
| 2 | 3 | 62.6 | 73.0 | 6 / 35 | 4279 |
| 3 | 3 | 61.6 | 74.0 | 2 / 35 | 3714 |
| 4 | 3 | 65.4 | 82.2 | 5 / 35 | 4574 |
| 5 | 3 | 63.1 | 75.9 | 5 / 35 | 4069 |
| 6 | 3 | 63.1 | 76.5 | 3 / 35 | 4144 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 35 | 34% |
| rsalesc.melee.Medina 0.4.5 | 29 | 24% |
| cx.Princess 1.0 | 7 | 29% |
| mz.MicroSheep 1.0 | 3 | 33% |
| arthord.NanoSatanMelee Beta | 2 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 79 | 42% | 86 |
| kc.mini.Mirage 0.2 | 77 | 41% | 91 |
| cx.Princess 1.0 | 14 | 8% | 15 |
| mz.MicroSheep 1.0 | 9 | 5% | 11 |
| sadoner.killer 0.2 | 5 | 3% | 5 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |

