# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 81.7 | 39 / 210 | 2.65 | 16.2% | 29412 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.7% | 139 |
| hadur117.mini.DeiseWP 0.2 | 2.0 | 16.2% | 39 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.7 | 11.1% | 5 |
| sgp.JollyNinja 3.53 | 4.2 | 11.1% | 17 |
| mz.MicroGodMelee 1 | 4.3 | 10.7% | 5 |
| lorneswork.Predator 1.0 | 5.8 | 9.6% | 3 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 6.1% | 2 |
| skm.butterfly 1.0 | 8.8 | 5.1% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 85.4 | 6 / 35 | 4988 |
| 2 | 2 | 66.9 | 85.1 | 13 / 35 | 4845 |
| 3 | 2 | 65.0 | 81.6 | 5 / 35 | 4673 |
| 4 | 2 | 64.0 | 77.5 | 7 / 35 | 4636 |
| 5 | 2 | 64.9 | 78.4 | 6 / 35 | 5343 |
| 6 | 2 | 65.4 | 82.2 | 2 / 35 | 4927 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 106 | 15% |
| sgp.JollyNinja 3.53 | 17 | 47% |
| lorneswork.Predator 1.0 | 6 | 100% |
| mz.MicroGodMelee 1 | 6 | 67% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 80% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 0% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 1086. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 114 | 67% | 132 |
| sgp.JollyNinja 3.53 | 18 | 11% | 26 |
| mz.MicroGodMelee 1 | 11 | 6% | 15 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 6% | 14 |
| lorneswork.Predator 1.0 | 9 | 5% | 14 |
| adt.Ar2 1.0 | 6 | 4% | 6 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 2 |
| skm.butterfly 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 82.3 | 111 / 210 | 2.60 | 18.2% | 30866 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 18.2% | 111 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.2 | 14.1% | 30 |
| pulsar.PulsarMax 0.8.9 | 2.8 | 13.5% | 34 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.0% | 5 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 9.7% | 12 |
| fnc.bandit.Bandit 5.2.0 | 6.3 | 8.1% | 2 |
| Noran.BitchingElk 0.054 | 7.2 | 7.6% | 10 |
| sch.Simone 0.3d | 7.7 | 7.1% | 5 |
| stelo.PatternRobot 1.0 | 8.7 | 6.2% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 77.8 | 17 / 35 | 5239 |
| 2 | 1 | 65.6 | 79.4 | 16 / 35 | 4618 |
| 3 | 1 | 67.8 | 83.2 | 17 / 35 | 5378 |
| 4 | 1 | 67.5 | 81.6 | 17 / 35 | 5156 |
| 5 | 1 | 67.6 | 83.2 | 20 / 35 | 5168 |
| 6 | 1 | 69.8 | 88.6 | 24 / 35 | 5307 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 46 | 76% |
| pulsar.PulsarMax 0.8.9 | 38 | 71% |
| Noran.BitchingElk 0.054 | 13 | 77% |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 100% |
| sch.Simone 0.3d | 11 | 73% |
| stelo.PatternRobot 1.0 | 9 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 75% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 33 | 33% | 63 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 24 | 24% | 60 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 15% | 20 |
| fnc.bandit.Bandit 5.2.0 | 6 | 6% | 9 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5 | 5% | 19 |
| Noran.BitchingElk 0.054 | 5 | 5% | 18 |
| sch.Simone 0.3d | 5 | 5% | 9 |
| stelo.PatternRobot 1.0 | 4 | 4% | 9 |
| fullsail.SweetTea 1.1 | 2 | 2% | 3 |

## Melee bench: F03

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 92.5 | 153 / 210 | 1.67 | 20.4% | 37871 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 20.4% | 153 |
| radnor.DoctorBob 1.42 | 2.7 | 13.4% | 15 |
| vuen.Cake 2.51 | 3.2 | 12.8% | 24 |
| kawigi.nano.Lib 1.0 | 3.2 | 12.9% | 16 |
| urdos.URDOS 1.3 | 5.0 | 9.8% | 2 |
| adt.Ar1 2.1 | 6.2 | 7.6% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 5.9% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 92.1 | 25 / 35 | 6189 |
| 2 | 1 | 71.5 | 93.3 | 25 / 35 | 6952 |
| 3 | 1 | 70.2 | 91.1 | 24 / 35 | 6310 |
| 4 | 1 | 69.8 | 90.2 | 23 / 35 | 6164 |
| 5 | 1 | 70.9 | 92.4 | 25 / 35 | 6246 |
| 6 | 1 | 71.5 | 96.2 | 31 / 35 | 6010 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 68 | 76% |
| kawigi.nano.Lib 1.0 | 58 | 88% |
| radnor.DoctorBob 1.42 | 32 | 97% |
| oa.weak.FlyMk1 0.1 | 7 | 100% |
| urdos.URDOS 1.3 | 6 | 83% |
| ghent.ArthurPanzergon 1.0.0 | 5 | 100% |
| adt.Ar1 2.1 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 22 | 38% | 73 |
| kawigi.nano.Lib 1.0 | 17 | 29% | 71 |
| radnor.DoctorBob 1.42 | 10 | 17% | 33 |
| urdos.URDOS 1.3 | 3 | 5% | 9 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 3% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 3% | 3 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 10 |
| adt.Ar1 2.1 | 1 | 2% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.3 | 33 / 210 | 2.50 | 17.2% | 33502 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.6% | 157 |
| hadur117.mini.DeiseWP 0.2 | 2.0 | 17.2% | 33 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.1% | 12 |
| TNT.TNT 0.99.1 | 4.0 | 10.7% | 6 |
| josago.Jorgito 0.16 | 5.0 | 8.9% | 1 |
| tj.zombie1n 1.0.1 | 6.3 | 6.9% | 0 |
| css.Delitioner 0.11 | 6.8 | 6.5% | 0 |
| rampancy.Durandal 2.1d | 8.5 | 5.0% | 0 |
| sp.Nanos.Ember 1.1 | 8.5 | 5.0% | 0 |
| spin.Bugstard 0.012b | 9.8 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 78.4 | 6 / 35 | 5106 |
| 2 | 2 | 67.6 | 83.8 | 5 / 35 | 5602 |
| 3 | 2 | 66.7 | 80.3 | 5 / 35 | 5733 |
| 4 | 2 | 68.4 | 84.8 | 5 / 35 | 6019 |
| 5 | 2 | 67.4 | 85.1 | 6 / 35 | 5369 |
| 6 | 2 | 68.3 | 87.3 | 6 / 35 | 5673 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 139 | 19% |
| apc.LeeroyJenkins2 1.0 | 12 | 42% |
| TNT.TNT 0.99.1 | 5 | 20% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 1279. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 132 | 75% | 160 |
| apc.LeeroyJenkins2 1.0 | 24 | 14% | 28 |
| TNT.TNT 0.99.1 | 10 | 6% | 10 |
| josago.Jorgito 0.16 | 6 | 3% | 7 |
| css.Delitioner 0.11 | 3 | 2% | 3 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |

## Melee bench: F05

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 67.6 | 16 / 210 | 3.91 | 12.9% | 20886 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 19.3% | 127 |
| justin.DemonicRage 3.4 | 2.0 | 17.1% | 50 |
| hadur117.mini.DeiseWP 0.2 | 3.3 | 12.9% | 16 |
| wompi.Numbat 2.1 | 3.7 | 12.4% | 14 |
| ms.Ares 0.19 | 5.2 | 8.9% | 0 |
| axeBots.HataMoto 3.09 | 5.8 | 8.4% | 3 |
| supersample.SuperBoxBot 1.0 | 7.5 | 6.1% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.2 | 5.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 8.5 | 4.9% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 66.3 | 3 / 35 | 3308 |
| 2 | 4 | 60.8 | 69.5 | 2 / 35 | 3638 |
| 3 | 3 | 60.6 | 68.6 | 3 / 35 | 3562 |
| 4 | 3 | 60.2 | 67.0 | 2 / 35 | 3702 |
| 5 | 4 | 59.3 | 65.4 | 3 / 35 | 3408 |
| 6 | 3 | 59.8 | 68.9 | 3 / 35 | 3268 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 32 | 6% |
| justin.DemonicRage 3.4 | 23 | 39% |
| wompi.Numbat 2.1 | 7 | 57% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 194 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 76 | 39% | 79 |
| justin.DemonicRage 3.4 | 57 | 29% | 63 |
| wompi.Numbat 2.1 | 26 | 13% | 30 |
| ms.Ares 0.19 | 16 | 8% | 16 |
| axeBots.HataMoto 3.09 | 10 | 5% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 4 | 2% | 5 |
| GarmBox.Oranges 1.0 | 3 | 2% | 3 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 0 | 0% | 1 |

## Melee bench: F06

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 81.6 | 99 / 210 | 2.66 | 17.3% | 27952 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 17.3% | 99 |
| jekl.StoneGhost 0.7 | 2.2 | 14.8% | 34 |
| origin.SleepSiphon 1.7b | 2.8 | 13.9% | 46 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.8% | 20 |
| mld.Wisdom 1.0 | 5.0 | 10.5% | 5 |
| gg.Wolverine 2.0 | 6.0 | 8.8% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 6.7% | 3 |
| spinnercat.Omen 1.0 | 8.0 | 6.4% | 0 |
| DBall.NUKE 0.1 | 8.3 | 6.6% | 1 |
| sample.Fire 1.0 | 10.0 | 3.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 81.0 | 18 / 35 | 4771 |
| 2 | 1 | 65.9 | 79.4 | 15 / 35 | 4598 |
| 3 | 1 | 67.5 | 84.8 | 19 / 35 | 4622 |
| 4 | 1 | 66.2 | 81.6 | 12 / 35 | 4895 |
| 5 | 1 | 66.6 | 81.3 | 18 / 35 | 4608 |
| 6 | 1 | 66.5 | 81.6 | 17 / 35 | 4458 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 44 | 82% |
| origin.SleepSiphon 1.7b | 38 | 71% |
| pe.minimelee.SandboxMiniMelee 1.1 | 19 | 84% |
| gg.Wolverine 2.0 | 8 | 100% |
| mld.Wisdom 1.0 | 6 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 711. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 40 | 36% | 70 |
| origin.SleepSiphon 1.7b | 29 | 26% | 61 |
| pe.minimelee.SandboxMiniMelee 1.1 | 24 | 22% | 39 |
| mld.Wisdom 1.0 | 12 | 11% | 18 |
| gg.Wolverine 2.0 | 2 | 2% | 5 |
| spinnercat.Omen 1.0 | 2 | 2% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 8 |
| DBall.NUKE 0.1 | 1 | 1% | 3 |
| sample.Fire 1.0 | 0 | 0% | 1 |

## Melee bench: F07

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 90.6 | 111 / 210 | 1.84 | 19.6% | 35872 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 19.6% | 111 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 17.1% | 45 |
| rtk.Tachikoma 1.0 | 2.7 | 16.6% | 43 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.3% | 11 |
| franzor.Lizt 1.3.1 | 4.8 | 10.5% | 3 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.9% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.5% | 0 |
| sample.Target 1.0 | 9.0 | 2.8% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 89.5 | 17 / 35 | 5721 |
| 2 | 1 | 71.9 | 93.3 | 21 / 35 | 6170 |
| 3 | 1 | 69.6 | 86.3 | 14 / 35 | 5886 |
| 4 | 1 | 70.6 | 90.5 | 18 / 35 | 5668 |
| 5 | 1 | 71.9 | 91.7 | 20 / 35 | 6330 |
| 6 | 1 | 71.4 | 92.4 | 21 / 35 | 6097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 79 | 71% |
| rsalesc.melee.Monk 0.3.6c | 44 | 32% |
| oog.melee.CapuletDroid 1.1 | 28 | 75% |
| franzor.Lizt 1.3.1 | 20 | 90% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 1335. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 42 | 42% | 107 |
| rsalesc.melee.Monk 0.3.6c | 42 | 42% | 66 |
| oog.melee.CapuletDroid 1.1 | 11 | 11% | 28 |
| franzor.Lizt 1.3.1 | 3 | 3% | 2 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F08

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.6 | 128 / 210 | 2.21 | 19.0% | 31020 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 19.0% | 128 |
| tm.Yuugao 1.0 | 2.7 | 12.7% | 27 |
| Krabb.sliNk.Garm 0.9u | 3.3 | 11.6% | 17 |
| shrub.Vapour v159 | 3.3 | 11.8% | 24 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 9.5% | 5 |
| m3thos.Eva00 1.1 | 5.8 | 8.7% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 7.7 | 7.6% | 7 |
| SHAM.WOW 1.4 | 8.3 | 6.7% | 1 |
| qualidafial.MajorDick 1.0.1 | 8.8 | 6.4% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.2 | 6.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 84.8 | 18 / 35 | 5201 |
| 2 | 1 | 68.8 | 87.9 | 22 / 35 | 5063 |
| 3 | 1 | 68.8 | 87.3 | 22 / 35 | 5275 |
| 4 | 1 | 64.7 | 75.2 | 17 / 35 | 4630 |
| 5 | 1 | 71.0 | 94.9 | 28 / 35 | 5288 |
| 6 | 1 | 68.9 | 89.2 | 21 / 35 | 5563 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 47 | 79% |
| shrub.Vapour v159 | 35 | 71% |
| Krabb.sliNk.Garm 0.9u | 35 | 86% |
| com.spp.robocode.MostlyHarmless 010 | 17 | 82% |
| m3thos.Eva00 1.1 | 10 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 75% |
| SHAM.WOW 1.4 | 4 | 75% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 28 | 33% | 70 |
| shrub.Vapour v159 | 20 | 24% | 46 |
| Krabb.sliNk.Garm 0.9u | 10 | 12% | 26 |
| com.spp.robocode.MostlyHarmless 010 | 8 | 9% | 23 |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 9% | 16 |
| zyx.nano.BacillusComma 1.0 | 3 | 4% | 11 |
| m3thos.Eva00 1.1 | 2 | 2% | 8 |
| SHAM.WOW 1.4 | 2 | 2% | 6 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 4 |
2 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 72.9 | 62 / 210 | 3.44 | 15.3% | 25602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 16.9% | 91 |
| hadur117.mini.DeiseWP 0.2 | 2.0 | 15.3% | 62 |
| kc.micro.Figment 1.0 | 2.8 | 14.0% | 27 |
| yagami.Tidus 0.11 | 4.7 | 10.6% | 3 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.7% | 15 |
| mc2.enemy.Original 0.9 | 5.7 | 8.9% | 10 |
| dft.Calliope 5.6 | 7.2 | 7.3% | 2 |
| step.nanoPri 1.0 | 8.2 | 6.3% | 0 |
| rdm.Dueler 0.4x | 9.2 | 5.1% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 70.5 | 9 / 35 | 4159 |
| 2 | 1 | 65.1 | 78.4 | 11 / 35 | 4603 |
| 3 | 2 | 62.7 | 70.5 | 10 / 35 | 4107 |
| 4 | 2 | 63.9 | 73.0 | 12 / 35 | 4339 |
| 5 | 2 | 63.5 | 73.3 | 11 / 35 | 4311 |
| 6 | 3 | 62.7 | 71.7 | 9 / 35 | 4083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 45 | 42% |
| kc.micro.Figment 1.0 | 34 | 71% |
| yagami.Tidus 0.11 | 9 | 100% |
| mc2.enemy.Original 0.9 | 7 | 71% |
| pedersen.Grishnakh 1.0 | 4 | 75% |
| step.nanoPri 1.0 | 2 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 58 | 39% | 79 |
| kc.micro.Figment 1.0 | 36 | 24% | 63 |
| yagami.Tidus 0.11 | 18 | 12% | 27 |
| mc2.enemy.Original 0.9 | 9 | 6% | 12 |
| pedersen.Grishnakh 1.0 | 8 | 5% | 10 |
| step.nanoPri 1.0 | 8 | 5% | 8 |
| dft.Calliope 5.6 | 6 | 4% | 6 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |
| robar.nano.Assertive_Melee 0.2 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 93.2 | 153 / 210 | 1.61 | 20.1% | 33462 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 20.1% | 153 |
| DTF.Kludgy 1.2b | 2.5 | 14.0% | 32 |
| ne.Chimera 1.2 | 3.0 | 12.9% | 7 |
| ejb.Polaris 1.0.1 | 3.5 | 12.2% | 10 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.0% | 4 |
| vStar.RAFzilla 2.15 | 5.7 | 9.8% | 4 |
| kurios.DOSexe .9b | 7.7 | 5.6% | 0 |
| sam.Samspin 1.0 | 8.2 | 5.6% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.3% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 93.7 | 23 / 35 | 5587 |
| 2 | 1 | 69.9 | 92.7 | 25 / 35 | 5379 |
| 3 | 1 | 69.9 | 90.8 | 25 / 35 | 5673 |
| 4 | 1 | 69.3 | 89.5 | 22 / 35 | 5243 |
| 5 | 1 | 71.0 | 94.6 | 27 / 35 | 5692 |
| 6 | 1 | 71.7 | 98.1 | 31 / 35 | 5888 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 55 | 93% |
| DTF.Kludgy 1.2b | 52 | 65% |
| ne.Chimera 1.2 | 35 | 86% |
| vStar.RAFzilla 2.15 | 14 | 79% |
| tvv.micro.Antares 1.1.1 | 14 | 93% |
| kurios.DOSexe .9b | 6 | 100% |
| donjezza.Muncho 1.0 | 5 | 100% |
| sam.Samspin 1.0 | 1 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 29 | 51% | 62 |
| ne.Chimera 1.2 | 14 | 25% | 38 |
| ejb.Polaris 1.0.1 | 9 | 16% | 59 |
| vStar.RAFzilla 2.15 | 3 | 5% | 20 |
| kurios.DOSexe .9b | 1 | 2% | 12 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 9 |
| donjezza.Muncho 1.0 | 0 | 0% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 2 |
| sam.Samspin 1.0 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 75.2 | 70 / 210 | 3.23 | 15.5% | 24407 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 16.3% | 63 |
| hadur117.mini.DeiseWP 0.2 | 1.8 | 15.5% | 70 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.2% | 27 |
| djc.DynaBot 0.1.1 | 4.0 | 11.0% | 16 |
| rdt199.Warlord 0.73 | 5.5 | 9.8% | 16 |
| br2.MobyDickBot 1.6 | 5.5 | 9.6% | 14 |
| KiraNL.Chupacabra 0.4 | 7.3 | 7.5% | 0 |
| uji.YellohFellah 1.0 | 7.3 | 7.9% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.5 | 67.6 | 8 / 35 | 3834 |
| 2 | 1 | 63.5 | 75.9 | 8 / 35 | 4134 |
| 3 | 2 | 63.7 | 76.2 | 13 / 35 | 3939 |
| 4 | 2 | 64.5 | 77.5 | 13 / 35 | 4313 |
| 5 | 2 | 63.8 | 75.2 | 12 / 35 | 4146 |
| 6 | 1 | 64.9 | 79.0 | 16 / 35 | 4041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 39 | 64% |
| cx.mini.Nimrod 0.55 | 18 | 67% |
| djc.DynaBot 0.1.1 | 17 | 65% |
| rdt199.Warlord 0.73 | 15 | 80% |
| uji.YellohFellah 1.0 | 7 | 86% |
| br2.MobyDickBot 1.6 | 5 | 60% |

Hadur died in 141 of 210 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 51 | 36% | 77 |
| cx.mini.Nimrod 0.55 | 33 | 23% | 41 |
| djc.DynaBot 0.1.1 | 19 | 13% | 28 |
| rdt199.Warlord 0.73 | 10 | 7% | 21 |
| br2.MobyDickBot 1.6 | 8 | 6% | 16 |
| KiraNL.Chupacabra 0.4 | 8 | 6% | 8 |
| uji.YellohFellah 1.0 | 6 | 4% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 4 |
| stelo.MirrorNano 1.3 | 2 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 80.2 | 100 / 210 | 2.79 | 16.8% | 23902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 16.8% | 100 |
| bts.wiki.RipCurl 0.9b | 2.8 | 13.6% | 35 |
| nat.PallasHawk 1.0 | 2.8 | 13.3% | 40 |
| darkcanuck.Leon 1.01 | 3.3 | 12.3% | 17 |
| brainfade.melee.Genghis 0.36 | 5.2 | 10.2% | 11 |
| jrm.Test0 1.0 | 5.8 | 9.1% | 1 |
| cs.sheldor.Talon 1.1 | 7.8 | 6.7% | 0 |
| jp.Perpy 16.0 | 7.8 | 6.6% | 1 |
| jaybot.bots.Oddball 4.0 | 9.0 | 5.9% | 5 |
| stuff.Vlad 0.1 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 78.1 | 12 / 35 | 3860 |
| 2 | 1 | 67.2 | 85.7 | 17 / 35 | 4367 |
| 3 | 1 | 63.8 | 73.3 | 17 / 35 | 3981 |
| 4 | 1 | 64.4 | 78.4 | 15 / 35 | 3745 |
| 5 | 1 | 64.1 | 76.5 | 15 / 35 | 3867 |
| 6 | 1 | 68.3 | 88.9 | 24 / 35 | 4082 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 42 | 69% |
| darkcanuck.Leon 1.01 | 34 | 82% |
| bts.wiki.RipCurl 0.9b | 30 | 83% |
| brainfade.melee.Genghis 0.36 | 12 | 67% |
| jaybot.bots.Oddball 4.0 | 6 | 33% |
| jrm.Test0 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 24 | 22% | 44 |
| nat.PallasHawk 1.0 | 22 | 20% | 52 |
| darkcanuck.Leon 1.01 | 18 | 16% | 50 |
| brainfade.melee.Genghis 0.36 | 16 | 14% | 22 |
| cs.sheldor.Talon 1.1 | 10 | 9% | 11 |
| jrm.Test0 1.0 | 7 | 6% | 9 |
| jp.Perpy 16.0 | 7 | 6% | 8 |
| jaybot.bots.Oddball 4.0 | 6 | 5% | 10 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |

## Melee bench: F13

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 82.0 | 61 / 210 | 2.62 | 15.9% | 24977 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.7 | 16.7% | 51 |
| mn.Combat 3.25.0 | 1.8 | 16.6% | 84 |
| hadur117.mini.DeiseWP 0.2 | 2.5 | 15.9% | 61 |
| shinh.Entangled 0.3 | 4.2 | 12.0% | 9 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.3% | 5 |
| apc.Colossus2 0.17 | 6.0 | 7.9% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.8% | 0 |
| ayk.WallHugger 1.0 | 8.7 | 4.9% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.2% | 0 |
| sample.Tracker 1.0 | 9.5 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 83.2 | 13 / 35 | 4254 |
| 2 | 3 | 65.8 | 84.4 | 11 / 35 | 4013 |
| 3 | 2 | 66.0 | 82.2 | 9 / 35 | 4495 |
| 4 | 2 | 65.0 | 81.9 | 13 / 35 | 3862 |
| 5 | 3 | 63.4 | 77.5 | 5 / 35 | 3983 |
| 6 | 3 | 65.6 | 82.5 | 10 / 35 | 4370 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 51 | 39% |
| ags.Glacier 0.2.11 | 50 | 58% |
| shinh.Entangled 0.3 | 13 | 69% |
| gh.micro.Gruweltje 0.7 | 3 | 33% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 59 | 40% | 87 |
| mn.Combat 3.25.0 | 55 | 37% | 75 |
| shinh.Entangled 0.3 | 14 | 9% | 21 |
| gh.micro.Gruweltje 0.7 | 13 | 9% | 18 |
| stelo.Wang 1.0 | 3 | 2% | 4 |
| apc.Colossus2 0.17 | 2 | 1% | 2 |
| ayk.WallHugger 1.0 | 2 | 1% | 2 |
| maribo.FollowFire 1 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 92.5 | 154 / 210 | 1.68 | 20.3% | 34077 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 20.3% | 154 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.7% | 23 |
| catcat20.shape.Theta 0.018 | 3.0 | 11.9% | 21 |
| sanyi.mikrobi.Roberto 1.0 | 4.5 | 10.0% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 9.3% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.3% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 6.3 | 9.1% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.5% | 5 |
| pa.Improved 1.0 | 9.0 | 5.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 88.9 | 23 / 35 | 5842 |
| 2 | 1 | 71.5 | 95.9 | 29 / 35 | 5724 |
| 3 | 1 | 71.7 | 96.2 | 28 / 35 | 5887 |
| 4 | 1 | 69.6 | 88.6 | 23 / 35 | 5635 |
| 5 | 1 | 70.4 | 92.7 | 25 / 35 | 5467 |
| 6 | 1 | 70.8 | 92.7 | 26 / 35 | 5522 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 73 | 85% |
| catcat20.shape.Theta 0.018 | 56 | 84% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 93% |
| sanyi.mikrobi.Roberto 1.0 | 12 | 83% |
| co.edu.usb.rc.LidisTron 1.0 | 12 | 92% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 24 | 43% | 85 |
| catcat20.shape.Theta 0.018 | 16 | 29% | 54 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 9% | 18 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 7% | 25 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 5% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 8 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 3 |
| pa.Improved 1.0 | 0 | 0% | 3 |

## Melee bench: F15

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 80.1 | 92 / 210 | 2.80 | 17.6% | 32001 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 17.6% | 92 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.5% | 15 |
| emp.Yngwie 1.11 | 3.3 | 12.9% | 58 |
| mld.DustBunny 3.8 | 3.7 | 12.5% | 13 |
| cb.nano.Insomnia 1.0 | 4.8 | 11.2% | 7 |
| kawigi.robot.Girl 1.2 | 5.7 | 9.9% | 23 |
| lambdaxy.TBot 0.1 | 7.5 | 6.7% | 0 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.4% | 2 |
| divineomega.TrialBot 0.003 | 8.8 | 5.1% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 75.6 | 12 / 35 | 4965 |
| 2 | 1 | 68.0 | 82.9 | 19 / 35 | 5311 |
| 3 | 1 | 67.6 | 84.1 | 17 / 35 | 5238 |
| 4 | 1 | 66.4 | 79.4 | 15 / 35 | 5291 |
| 5 | 1 | 67.0 | 78.7 | 17 / 35 | 5351 |
| 6 | 1 | 67.5 | 79.7 | 12 / 35 | 5845 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 35 | 57% |
| kawigi.micro.Shiz 1.1 | 33 | 97% |
| cb.nano.Insomnia 1.0 | 16 | 94% |
| mld.DustBunny 3.8 | 15 | 80% |
| kawigi.robot.Girl 1.2 | 14 | 57% |
| divineomega.TrialBot 0.003 | 4 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 41 | 34% | 64 |
| kawigi.micro.Shiz 1.1 | 25 | 21% | 47 |
| kawigi.robot.Girl 1.2 | 16 | 13% | 23 |
| mld.DustBunny 3.8 | 14 | 12% | 39 |
| cb.nano.Insomnia 1.0 | 13 | 11% | 16 |
| divineomega.TrialBot 0.003 | 5 | 4% | 10 |
| Grystrion.TrackerWO 1.0 | 3 | 3% | 7 |
| lambdaxy.TBot 0.1 | 1 | 1% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.2 | 79 / 210 | 2.51 | 18.1% | 33022 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.3 | 18.1% | 79 |
| gh.Griezel 0.5.2 | 1.7 | 17.3% | 82 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.8% | 8 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.6% | 27 |
| tvv.nano.Polaris 1.2 | 5.5 | 8.8% | 4 |
| bvh.fnr.Fenrir 0.36l | 5.8 | 8.9% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.3% | 5 |
| divineomega.DivineBot 1.9.4.5 | 8.3 | 5.3% | 2 |
| repositorio.NanoStep 1.0 | 9.0 | 5.1% | 0 |
| asd.Cthulhu 1.3 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 86.0 | 18 / 35 | 5891 |
| 2 | 1 | 68.7 | 85.4 | 15 / 35 | 5611 |
| 3 | 1 | 67.1 | 80.0 | 12 / 35 | 5580 |
| 4 | 1 | 66.9 | 82.5 | 14 / 35 | 4966 |
| 5 | 2 | 67.3 | 82.5 | 10 / 35 | 5317 |
| 6 | 2 | 67.8 | 82.9 | 10 / 35 | 5657 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 75 | 49% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 18 | 89% |
| techdude.forest.FlamingForest 1.1 | 18 | 50% |
| tvv.nano.Polaris 1.2 | 6 | 83% |
| stelo.IntrinsicVolatility 1.4 | 6 | 50% |
| divineomega.DivineBot 1.9.4.5 | 5 | 100% |
| bvh.fnr.Fenrir 0.36l | 4 | 75% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 1195. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 68 | 52% | 105 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 15 | 11% | 33 |
| techdude.forest.FlamingForest 1.1 | 14 | 11% | 22 |
| bvh.fnr.Fenrir 0.36l | 14 | 11% | 17 |
| divineomega.DivineBot 1.9.4.5 | 8 | 6% | 12 |
| stelo.IntrinsicVolatility 1.4 | 6 | 5% | 11 |
| tvv.nano.Polaris 1.2 | 3 | 2% | 7 |
| asd.Cthulhu 1.3 | 3 | 2% | 3 |

## Melee bench: F17

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 78.7 | 85 / 210 | 2.92 | 16.9% | 30223 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 16.9% | 85 |
| et.Predator 1.8 | 2.3 | 13.3% | 29 |
| oog.melee.Mercutio 1.0 | 3.2 | 12.6% | 34 |
| cx.BlestPain 1.41 | 3.8 | 12.4% | 42 |
| nic.Nicator 2.4 | 4.7 | 11.4% | 9 |
| ahf.NanoAndrew .4 | 6.0 | 10.3% | 9 |
| maribo.melee.BMV 0.1 | 7.0 | 8.7% | 1 |
| tex.Longbot 0.4 | 8.3 | 5.9% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.6% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 74.9 | 14 / 35 | 4812 |
| 2 | 1 | 68.8 | 85.1 | 17 / 35 | 5621 |
| 3 | 1 | 66.7 | 80.0 | 13 / 35 | 5465 |
| 4 | 1 | 60.9 | 66.3 | 10 / 35 | 4201 |
| 5 | 1 | 66.5 | 80.0 | 17 / 35 | 5147 |
| 6 | 1 | 67.7 | 85.7 | 14 / 35 | 4977 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 45 | 71% |
| oog.melee.Mercutio 1.0 | 24 | 63% |
| nic.Nicator 2.4 | 24 | 88% |
| cx.BlestPain 1.41 | 24 | 42% |
| ahf.NanoAndrew .4 | 7 | 71% |
| maribo.melee.BMV 0.1 | 2 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 36 | 29% | 52 |
| et.Predator 1.8 | 26 | 21% | 54 |
| oog.melee.Mercutio 1.0 | 24 | 19% | 35 |
| nic.Nicator 2.4 | 15 | 12% | 37 |
| ahf.NanoAndrew .4 | 12 | 10% | 16 |
| maribo.melee.BMV 0.1 | 8 | 6% | 11 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 2% | 3 |
| tex.Longbot 0.4 | 2 | 2% | 2 |

## Melee bench: F18

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 84.8 | 110 / 210 | 2.37 | 18.1% | 28279 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 18.1% | 110 |
| morbid.MorbidPriest 1.0 | 2.5 | 13.3% | 31 |
| agd.Mooserwirt2 2.7 | 2.8 | 12.2% | 29 |
| uji.DBH 1.1 | 4.0 | 10.8% | 9 |
| spinnercat.Robovirus 2.718 | 5.2 | 9.8% | 13 |
| ratosh.Nobo 0.21 | 6.0 | 9.3% | 2 |
| kawigi.mini.Fhqwhgads 1.1 | 7.2 | 7.9% | 4 |
| sigterm.Sigterm 1.0 | 7.5 | 8.2% | 10 |
| stelo.WangRobot 1.0 | 9.0 | 5.3% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 86.3 | 18 / 35 | 4978 |
| 2 | 1 | 65.2 | 79.0 | 14 / 35 | 4607 |
| 3 | 1 | 65.9 | 81.3 | 17 / 35 | 4462 |
| 4 | 1 | 68.6 | 89.2 | 24 / 35 | 4710 |
| 5 | 1 | 67.0 | 83.2 | 17 / 35 | 4806 |
| 6 | 1 | 68.6 | 89.8 | 20 / 35 | 4716 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 50 | 84% |
| agd.Mooserwirt2 2.7 | 34 | 50% |
| uji.DBH 1.1 | 16 | 81% |
| sigterm.Sigterm 1.0 | 14 | 86% |
| spinnercat.Robovirus 2.718 | 13 | 69% |
| stelo.WangRobot 1.0 | 7 | 86% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 67% |
| ratosh.Nobo 0.21 | 5 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 25 | 25% | 48 |
| morbid.MorbidPriest 1.0 | 21 | 21% | 62 |
| spinnercat.Robovirus 2.718 | 14 | 14% | 20 |
| ratosh.Nobo 0.21 | 12 | 12% | 23 |
| uji.DBH 1.1 | 10 | 10% | 17 |
| kawigi.mini.Fhqwhgads 1.1 | 9 | 9% | 16 |
| sigterm.Sigterm 1.0 | 5 | 5% | 16 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 3% | 4 |
| stelo.WangRobot 1.0 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 94.2 | 156 / 210 | 1.52 | 20.9% | 34618 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 20.9% | 156 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 15.0% | 18 |
| mld.Infinity 2.2 | 3.0 | 13.4% | 27 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.0% | 4 |
| erdnis.Rover 0.3 | 4.8 | 10.3% | 0 |
| patson.PatsonTestBot 1.0 | 6.5 | 8.5% | 1 |
| mbh.Mbh 0.1 | 7.2 | 7.5% | 0 |
| pac.ABC 2.1 | 7.5 | 6.8% | 4 |
| pbg.R2D2 1.0 | 8.8 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 94.9 | 27 / 35 | 5536 |
| 2 | 1 | 71.7 | 93.7 | 25 / 35 | 5999 |
| 3 | 1 | 73.0 | 98.7 | 32 / 35 | 5919 |
| 4 | 1 | 71.0 | 93.3 | 22 / 35 | 5583 |
| 5 | 1 | 71.5 | 92.1 | 24 / 35 | 5876 |
| 6 | 1 | 71.4 | 92.7 | 26 / 35 | 5705 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 87 | 86% |
| mld.Infinity 2.2 | 56 | 79% |
| erdnis.Rover 0.3 | 12 | 100% |
| krillr.mini.JointStrike 2.0.0 | 10 | 90% |
| patson.PatsonTestBot 1.0 | 7 | 86% |
| pac.ABC 2.1 | 5 | 100% |
| mbh.Mbh 0.1 | 4 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 1219. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 22 | 41% | 115 |
| mld.Infinity 2.2 | 21 | 39% | 27 |
| krillr.mini.JointStrike 2.0.0 | 5 | 9% | 19 |
| patson.PatsonTestBot 1.0 | 2 | 4% | 10 |
| pac.ABC 2.1 | 2 | 4% | 4 |
| erdnis.Rover 0.3 | 1 | 2% | 20 |
| pbg.R2D2 1.0 | 1 | 2% | 7 |
| mbh.Mbh 0.1 | 0 | 0% | 6 |

## Melee bench: F20

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.6 | 113 / 210 | 2.20 | 19.2% | 33901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 19.2% | 113 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.7% | 32 |
| fwb.Nine 1.0.1 | 3.7 | 11.0% | 28 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 10.6% | 4 |
| catcat20.Rabbit 0.001 | 4.3 | 10.1% | 22 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 8.0% | 3 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 7.7% | 0 |
| bayen.nut.Squirrel 1.615 | 7.3 | 7.6% | 7 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 85.1 | 21 / 35 | 5278 |
| 2 | 1 | 69.1 | 86.3 | 18 / 35 | 5729 |
| 3 | 1 | 69.5 | 86.0 | 18 / 35 | 6163 |
| 4 | 1 | 67.9 | 86.0 | 16 / 35 | 5180 |
| 5 | 1 | 69.0 | 87.9 | 18 / 35 | 5702 |
| 6 | 1 | 69.8 | 88.3 | 22 / 35 | 5849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 76 | 82% |
| fwb.Nine 1.0.1 | 28 | 32% |
| catcat20.Rabbit 0.001 | 25 | 60% |
| nz.jdc.nano.GridFu 1.0 | 13 | 77% |
| bayen.nut.Squirrel 1.615 | 8 | 88% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| m3thos.mini.Eva01 0.5.5 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 67% |

Hadur died in 97 of 210 rounds, at a mean tick of 1237. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 37 | 38% | 88 |
| fwb.Nine 1.0.1 | 25 | 26% | 16 |
| catcat20.Rabbit 0.001 | 17 | 18% | 38 |
| nz.jdc.nano.GridFu 1.0 | 8 | 8% | 37 |
| bayen.nut.Squirrel 1.615 | 5 | 5% | 15 |
| m3thos.mini.Eva01 0.5.5 | 2 | 2% | 8 |
| ntc.ControlledChaos 1.1.4 | 2 | 2% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 3 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 2 |

## Melee bench: F21

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 91.2 | 127 / 210 | 1.79 | 20.1% | 34686 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 20.1% | 127 |
| eem.EvBot v4.6.16 | 2.0 | 15.8% | 60 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.8% | 12 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.8% | 5 |
| eld.Hmm 1.0 | 5.3 | 8.4% | 6 |
| oa.weak.BotherBot 0.1 | 5.7 | 8.2% | 0 |
| fire219.CatBot 1.0 | 7.3 | 6.4% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 93.3 | 24 / 35 | 5645 |
| 2 | 1 | 69.9 | 90.2 | 18 / 35 | 5667 |
| 3 | 1 | 70.1 | 89.5 | 22 / 35 | 5626 |
| 4 | 1 | 70.8 | 93.7 | 22 / 35 | 5496 |
| 5 | 1 | 71.3 | 91.1 | 23 / 35 | 6287 |
| 6 | 1 | 70.1 | 89.5 | 18 / 35 | 5965 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 104 | 61% |
| dummy.mini.Scimitar 1.01 | 35 | 86% |
| cf.RiO.RiOx 4.2.1 | 22 | 100% |
| oa.weak.BotherBot 0.1 | 7 | 100% |
| eld.Hmm 1.0 | 5 | 60% |
| el.JumpShoot 0.2 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 1341. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 49 | 58% | 82 |
| dummy.mini.Scimitar 1.01 | 23 | 27% | 71 |
| cf.RiO.RiOx 4.2.1 | 7 | 8% | 23 |
| eld.Hmm 1.0 | 2 | 2% | 17 |
| el.JumpShoot 0.2 | 2 | 2% | 2 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 10 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |
| fire219.CatBot 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.0 | 82 / 210 | 2.44 | 17.7% | 30915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.2 | 17.7% | 82 |
| pe.SandboxDT 2.71m | 1.8 | 16.3% | 67 |
| kvk.HebusLeTroll 0.35 | 3.3 | 14.6% | 39 |
| jlm.javaDisturbance 0.59 | 3.7 | 13.1% | 21 |
| bigpete.Stewie 1.0 | 5.0 | 10.7% | 5 |
| gg.Squaraus 0.6 | 6.5 | 6.6% | 0 |
| tad.Dalek98 0.98 | 7.2 | 6.5% | 0 |
| yk.JahRoslav 1.1 | 7.3 | 6.8% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.9% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 86.7 | 13 / 35 | 5239 |
| 2 | 1 | 67.6 | 83.5 | 14 / 35 | 5010 |
| 3 | 1 | 68.1 | 86.3 | 14 / 35 | 5047 |
| 4 | 2 | 66.3 | 79.0 | 11 / 35 | 5259 |
| 5 | 1 | 67.3 | 82.2 | 13 / 35 | 5022 |
| 6 | 1 | 68.6 | 86.0 | 17 / 35 | 5338 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 49 | 53% |
| kvk.HebusLeTroll 0.35 | 36 | 56% |
| jlm.javaDisturbance 0.59 | 31 | 68% |
| bigpete.Stewie 1.0 | 14 | 79% |
| tad.Dalek98 0.98 | 2 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 48 | 37% | 75 |
| kvk.HebusLeTroll 0.35 | 39 | 30% | 52 |
| jlm.javaDisturbance 0.59 | 28 | 22% | 54 |
| bigpete.Stewie 1.0 | 9 | 7% | 21 |
| yk.JahRoslav 1.1 | 2 | 2% | 4 |
| tad.Dalek98 0.98 | 2 | 2% | 3 |
| gg.Squaraus 0.6 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 89.4 | 118 / 210 | 1.95 | 19.2% | 31068 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 19.2% | 118 |
| pe.SandboxLump 1.52 | 2.0 | 17.8% | 60 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 20 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.7% | 6 |
| stelo.RamTrackSurfer 1.2 | 5.7 | 8.8% | 3 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 8.8% | 1 |
| cw.megas.Blade 0.8 | 6.8 | 7.9% | 0 |
| sample.Walls 1.0 | 7.7 | 7.5% | 2 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 88.6 | 21 / 35 | 5207 |
| 2 | 1 | 69.0 | 87.3 | 20 / 35 | 5029 |
| 3 | 1 | 70.8 | 91.1 | 22 / 35 | 4953 |
| 4 | 1 | 70.4 | 89.8 | 19 / 35 | 5528 |
| 5 | 1 | 69.7 | 88.6 | 16 / 35 | 5136 |
| 6 | 1 | 70.0 | 91.1 | 20 / 35 | 5215 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 89 | 65% |
| cre.Karolos 0.32 | 30 | 80% |
| stelo.AreaTargetingBot 1.1 | 15 | 93% |
| stelo.RamTrackSurfer 1.2 | 8 | 88% |
| sample.Walls 1.0 | 8 | 88% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 53 | 58% | 113 |
| cre.Karolos 0.32 | 19 | 21% | 44 |
| stelo.AreaTargetingBot 1.1 | 8 | 9% | 17 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 4% | 12 |
| sample.Walls 1.0 | 4 | 4% | 7 |
| stelo.RamTrackSurfer 1.2 | 3 | 3% | 13 |
| cw.megas.Blade 0.8 | 1 | 1% | 3 |

## Melee bench: F24

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 72.4 | 62 / 210 | 3.49 | 14.6% | 22130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.5 | 14.6% | 62 |
| rz.GlowBlowMelee 1.4 | 2.3 | 13.7% | 43 |
| florent.XSeries.X2 0.12 | 3.5 | 13.0% | 35 |
| pedersen.Ugluk 1.1.1 | 3.8 | 12.5% | 20 |
| davidalves.Phoenix 0.54 | 3.8 | 12.7% | 43 |
| oog.melee.Corsair 1.0 | 6.0 | 9.8% | 1 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.7% | 5 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.9% | 1 |
| as.FrankTheTank 1.3 | 9.0 | 4.9% | 0 |
| evd.X1 0.01 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.2 | 70.5 | 8 / 35 | 3650 |
| 2 | 2 | 61.0 | 69.2 | 7 / 35 | 3753 |
| 3 | 1 | 63.7 | 78.1 | 12 / 35 | 3710 |
| 4 | 1 | 61.7 | 70.8 | 15 / 35 | 3493 |
| 5 | 1 | 63.5 | 75.2 | 13 / 35 | 3879 |
| 6 | 3 | 61.2 | 70.5 | 7 / 35 | 3645 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 25 | 52% |
| pedersen.Ugluk 1.1.1 | 19 | 79% |
| florent.XSeries.X2 0.12 | 15 | 67% |
| rz.GlowBlowMelee 1.4 | 14 | 57% |
| stelo.SoJNanoMelee 1.1 | 13 | 77% |
| oog.melee.Corsair 1.0 | 6 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 33 | 22% | 43 |
| florent.XSeries.X2 0.12 | 32 | 22% | 46 |
| davidalves.Phoenix 0.54 | 32 | 22% | 43 |
| pedersen.Ugluk 1.1.1 | 28 | 19% | 40 |
| stelo.SoJNanoMelee 1.1 | 8 | 5% | 9 |
| oog.melee.Corsair 1.0 | 7 | 5% | 18 |
| lunchie.Lunchbox 0.93 | 4 | 3% | 4 |
| evd.X1 0.01 | 2 | 1% | 3 |
| as.FrankTheTank 1.3 | 2 | 1% | 2 |

## Melee bench: F25

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 85.4 | 132 / 210 | 2.31 | 18.6% | 26861 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 18.6% | 132 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.0% | 23 |
| voidious.micro.BlitzBat 1.05 | 3.2 | 12.2% | 10 |
| jdw.Hurricane 1.4 | 3.5 | 11.6% | 27 |
| ds.Oo 2.2 | 5.7 | 9.4% | 8 |
| gre.svman4.Morfeas 1.4.1 | 5.8 | 8.9% | 2 |
| gjr.Cephalosporin 0.1 | 7.5 | 7.8% | 3 |
| awesomeness.Elite 1.0 | 7.8 | 7.3% | 1 |
| adt.Ar2 1.1 | 8.2 | 7.0% | 4 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 86.3 | 18 / 35 | 4400 |
| 2 | 1 | 70.7 | 93.7 | 28 / 35 | 4870 |
| 3 | 1 | 66.7 | 81.3 | 19 / 35 | 4298 |
| 4 | 1 | 67.2 | 83.2 | 20 / 35 | 4501 |
| 5 | 1 | 67.9 | 83.8 | 24 / 35 | 4413 |
| 6 | 1 | 67.7 | 84.4 | 23 / 35 | 4379 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 39 | 90% |
| voidious.micro.BlitzBat 1.05 | 39 | 95% |
| jdw.Hurricane 1.4 | 28 | 86% |
| awesomeness.Elite 1.0 | 9 | 100% |
| gjr.Cephalosporin 0.1 | 9 | 89% |
| adt.Ar2 1.1 | 9 | 100% |
| ds.Oo 2.2 | 6 | 100% |
| gre.svman4.Morfeas 1.4.1 | 6 | 67% |

Hadur died in 78 of 210 rounds, at a mean tick of 592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 21 | 27% | 53 |
| jdw.Hurricane 1.4 | 15 | 19% | 36 |
| voidious.micro.BlitzBat 1.05 | 11 | 14% | 52 |
| gre.svman4.Morfeas 1.4.1 | 9 | 12% | 17 |
| ds.Oo 2.2 | 7 | 9% | 19 |
| gjr.Cephalosporin 0.1 | 5 | 6% | 12 |
| awesomeness.Elite 1.0 | 4 | 5% | 10 |
| adt.Ar2 1.1 | 3 | 4% | 8 |
| amk.ChumbaMini 0.2 | 3 | 4% | 3 |

## Melee bench: F26

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 85.0 | 116 / 210 | 2.35 | 18.5% | 33432 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 18.5% | 116 |
| ak.Fermat 2.0 | 2.0 | 15.3% | 48 |
| shu.nitro.LENIN .T34 | 3.5 | 12.0% | 25 |
| lrem.Spectre 0.4.4 | 3.5 | 12.3% | 17 |
| js.PinBall 1.6 | 5.5 | 10.0% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.5% | 6 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 8.9% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 7.1% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 85.7 | 21 / 35 | 5665 |
| 2 | 1 | 68.3 | 86.3 | 19 / 35 | 5313 |
| 3 | 1 | 68.5 | 84.1 | 20 / 35 | 5731 |
| 4 | 1 | 69.3 | 86.0 | 19 / 35 | 5674 |
| 5 | 1 | 68.4 | 83.8 | 19 / 35 | 5484 |
| 6 | 1 | 68.4 | 84.1 | 18 / 35 | 5565 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 55 | 69% |
| lrem.Spectre 0.4.4 | 32 | 88% |
| shu.nitro.LENIN .T34 | 25 | 84% |
| js.PinBall 1.6 | 11 | 91% |
| fullsail.LaxativeTeaTwo 1.0 | 8 | 100% |
| gh.mini.GrubbmOne 1.0 | 5 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 80% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 39 | 40% | 74 |
| shu.nitro.LENIN .T34 | 17 | 18% | 46 |
| lrem.Spectre 0.4.4 | 16 | 16% | 39 |
| jaybot.adv.bots.JayBot 2.0 | 9 | 9% | 18 |
| js.PinBall 1.6 | 9 | 9% | 17 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 2% | 10 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 4 |
| sample.SpinBot 1.0 | 1 | 1% | 2 |
3 death(s) with no robot to name.

## Melee bench: F27

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 84.3 | 119 / 210 | 2.41 | 18.4% | 29866 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 18.4% | 119 |
| mk.Alpha 0.2.1 | 3.2 | 12.6% | 35 |
| wee.Gem 1.8.4 | 3.3 | 11.5% | 30 |
| EH.Eagle 1.0.6 | 3.8 | 11.0% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 3.8 | 11.1% | 10 |
| joe.ADinosaur 1.0 | 6.5 | 9.0% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 6.7 | 8.7% | 2 |
| throxbot.ThroxBot 0.1 | 7.7 | 8.0% | 3 |
| caimano.Furia_Ceca 0.22 | 9.2 | 6.3% | 3 |
| cs.Grudge 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 83.5 | 20 / 35 | 4450 |
| 2 | 1 | 67.2 | 86.0 | 20 / 35 | 4475 |
| 3 | 1 | 69.8 | 83.5 | 20 / 35 | 6096 |
| 4 | 1 | 67.7 | 86.3 | 22 / 35 | 4511 |
| 5 | 1 | 67.9 | 77.5 | 16 / 35 | 5786 |
| 6 | 1 | 68.0 | 88.9 | 21 / 35 | 4548 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 54 | 78% |
| wee.Gem 1.8.4 | 27 | 74% |
| EH.Eagle 1.0.6 | 20 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 79% |
| techdude.kombat.FlamingKombat 1.5 | 10 | 90% |
| throxbot.ThroxBot 0.1 | 7 | 86% |
| joe.ADinosaur 1.0 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 33% |

Hadur died in 92 of 210 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 28 | 30% | 69 |
| sheldor.melee.nano.TestMelee 0.1 | 20 | 22% | 39 |
| wee.Gem 1.8.4 | 19 | 21% | 41 |
| EH.Eagle 1.0.6 | 9 | 10% | 27 |
| joe.ADinosaur 1.0 | 6 | 7% | 10 |
| throxbot.ThroxBot 0.1 | 5 | 5% | 7 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 2% | 13 |
| caimano.Furia_Ceca 0.22 | 2 | 2% | 3 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F28

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 88.6 | 125 / 210 | 2.02 | 18.8% | 28253 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 18.8% | 125 |
| kid.test.NightFox .2 | 2.0 | 14.6% | 34 |
| uji.Antique 1.0 | 3.2 | 12.2% | 32 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.7% | 10 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.2% | 5 |
| ahr.ice.Ice 1.0.2 | 6.2 | 8.1% | 2 |
| amk.ChumbaWumba 0.3 | 6.7 | 8.2% | 2 |
| matt.advanced.Katana 1.0 | 8.7 | 6.1% | 1 |
| stelo.PianistNano 1.2 | 9.2 | 5.5% | 0 |
| stelo.Lifestealer 1.0 | 9.2 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 87.0 | 19 / 35 | 4829 |
| 2 | 1 | 68.7 | 91.1 | 22 / 35 | 4776 |
| 3 | 1 | 67.1 | 84.4 | 16 / 35 | 4552 |
| 4 | 1 | 69.3 | 89.2 | 25 / 35 | 5085 |
| 5 | 1 | 68.2 | 87.9 | 20 / 35 | 4420 |
| 6 | 1 | 69.1 | 92.1 | 23 / 35 | 4591 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 72 | 74% |
| uji.Antique 1.0 | 39 | 82% |
| qohnil.blot.BlotBot 3.61 | 19 | 79% |
| pfvicm.Sobieski 7.2.3b | 12 | 83% |
| ahr.ice.Ice 1.0.2 | 8 | 100% |
| amk.ChumbaWumba 0.3 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| matt.advanced.Katana 1.0 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 28 | 32% | 74 |
| uji.Antique 1.0 | 23 | 26% | 59 |
| qohnil.blot.BlotBot 3.61 | 11 | 13% | 27 |
| pfvicm.Sobieski 7.2.3b | 11 | 13% | 17 |
| amk.ChumbaWumba 0.3 | 8 | 9% | 13 |
| matt.advanced.Katana 1.0 | 2 | 2% | 7 |
| stelo.Lifestealer 1.0 | 2 | 2% | 3 |
| ahr.ice.Ice 1.0.2 | 0 | 0% | 8 |
| stelo.PianistNano 1.2 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F29

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 79.7 | 90 / 210 | 2.82 | 17.4% | 28421 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 17.4% | 90 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 14.5% | 44 |
| deewiant.Anomaly 0.2 | 2.8 | 14.8% | 46 |
| myl.micro.Troodon 1.10 | 3.7 | 12.4% | 14 |
| jok.PheonixM 0.1.2 | 5.2 | 10.6% | 9 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.3% | 0 |
| DBall.Anarchy 0.1 | 7.0 | 6.9% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 7.7 | 6.1% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.8% | 0 |
| jangs.ns51 1.0 | 9.8 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 74.0 | 11 / 35 | 4500 |
| 2 | 1 | 67.9 | 82.5 | 17 / 35 | 5094 |
| 3 | 1 | 68.1 | 83.8 | 16 / 35 | 4883 |
| 4 | 1 | 66.9 | 79.4 | 18 / 35 | 4499 |
| 5 | 1 | 65.9 | 74.9 | 15 / 35 | 4757 |
| 6 | 1 | 67.5 | 83.8 | 13 / 35 | 4688 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 44 | 68% |
| deewiant.Anomaly 0.2 | 44 | 61% |
| myl.micro.Troodon 1.10 | 18 | 100% |
| jok.PheonixM 0.1.2 | 8 | 88% |
| DBall.Anarchy 0.1 | 4 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 49 | 41% | 82 |
| zyx.mega.YersiniaPestis 3.1 | 30 | 25% | 56 |
| myl.micro.Troodon 1.10 | 16 | 13% | 32 |
| jok.PheonixM 0.1.2 | 14 | 12% | 20 |
| ph.melee.ArcherME 0.3 | 4 | 3% | 4 |
| DBall.Anarchy 0.1 | 3 | 3% | 8 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 3% | 4 |
| jangs.ns51 1.0 | 1 | 1% | 2 |

## Melee bench: F30

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 69.1 | 46 / 210 | 3.78 | 14.0% | 23106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.2 | 14.0% | 44 |
| darkcanuck.B26354 1.06 | 2.5 | 13.7% | 47 |
| hadur117.mini.DeiseWP 0.2 | 2.5 | 14.0% | 46 |
| stelo.PastFuture 2.3.2 | 3.7 | 12.9% | 28 |
| oog.melee.Capulet 1.2 | 4.2 | 12.6% | 32 |
| intruder.PrairieWolf 2.61 | 6.5 | 8.5% | 7 |
| ntc.Opposite 1.5 | 7.2 | 8.0% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 7.7 | 7.2% | 3 |
| tripphippy.Alice 1.1 | 8.7 | 6.4% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.5 | 66.7 | 7 / 35 | 3834 |
| 2 | 1 | 63.1 | 72.4 | 12 / 35 | 4387 |
| 3 | 1 | 61.6 | 72.1 | 7 / 35 | 3802 |
| 4 | 2 | 61.1 | 70.2 | 8 / 35 | 3718 |
| 5 | 3 | 61.1 | 69.8 | 7 / 35 | 3746 |
| 6 | 4 | 58.8 | 63.5 | 5 / 35 | 3619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.PastFuture 2.3.2 | 22 | 77% |
| catcat20.Matcha 0.006 | 18 | 39% |
| darkcanuck.B26354 1.06 | 17 | 59% |
| oog.melee.Capulet 1.2 | 13 | 54% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 67% |
| intruder.PrairieWolf 2.61 | 2 | 50% |
| tripphippy.Alice 1.1 | 1 | 100% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 35 | 21% | 41 |
| darkcanuck.B26354 1.06 | 33 | 20% | 46 |
| stelo.PastFuture 2.3.2 | 32 | 20% | 49 |
| oog.melee.Capulet 1.2 | 29 | 18% | 36 |
| tripphippy.Alice 1.1 | 10 | 6% | 11 |
| intruder.PrairieWolf 2.61 | 10 | 6% | 11 |
| ntc.Opposite 1.5 | 9 | 5% | 9 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 4% | 7 |

## Melee bench: F31

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 70.2 | 48 / 210 | 3.68 | 14.1% | 21285 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.2% | 84 |
| hadur117.mini.DeiseWP 0.2 | 2.2 | 14.1% | 48 |
| gh.mini.Griezel 0.2 | 3.0 | 13.8% | 42 |
| spinnercat.micro.Tyger 0.1 | 4.2 | 12.0% | 22 |
| d414.nano.Quantum 1.0.0 | 4.8 | 10.7% | 6 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.4% | 6 |
| fm.mammillarias 1.3 | 7.3 | 6.6% | 2 |
| timmit.nano.TimDog 0.33 | 8.0 | 6.4% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.4% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 71.4 | 7 / 35 | 3554 |
| 2 | 3 | 59.8 | 67.0 | 6 / 35 | 3349 |
| 3 | 2 | 62.3 | 72.1 | 7 / 35 | 3845 |
| 4 | 2 | 59.7 | 67.0 | 7 / 35 | 3272 |
| 5 | 2 | 62.0 | 70.8 | 11 / 35 | 3419 |
| 6 | 2 | 63.0 | 73.0 | 10 / 35 | 3846 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 40 | 63% |
| gh.mini.Griezel 0.2 | 19 | 37% |
| spinnercat.micro.Tyger 0.1 | 14 | 57% |
| d414.nano.Quantum 1.0.0 | 8 | 88% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 50 | 31% | 58 |
| abc.Shadow 3.84i | 43 | 27% | 66 |
| spinnercat.micro.Tyger 0.1 | 26 | 16% | 33 |
| d414.nano.Quantum 1.0.0 | 13 | 8% | 19 |
| gh.nano.Grofvuil 0.2 | 12 | 7% | 14 |
| fm.mammillarias 1.3 | 7 | 4% | 8 |
| Gecko.ultimateGeckoBot 1.0 | 5 | 3% | 5 |
| timmit.nano.TimDog 0.33 | 4 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 87.5 | 123 / 210 | 2.13 | 18.5% | 28879 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 18.5% | 123 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.7% | 49 |
| apc.botM 3.0 | 3.2 | 11.7% | 15 |
| lxx.ConceptA 0.8 | 4.3 | 10.3% | 6 |
| vjik.UnViolation 1.1 | 4.5 | 10.2% | 4 |
| bayen.UbaMicro 1.4 | 6.3 | 8.9% | 7 |
| panzer.Panzer 0.2 | 7.0 | 7.7% | 2 |
| yk.JahMicro 1.0 | 8.3 | 6.3% | 3 |
| conscience.Electron 1.3g | 8.7 | 6.3% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 82.2 | 16 / 35 | 4890 |
| 2 | 1 | 67.7 | 89.2 | 21 / 35 | 4350 |
| 3 | 1 | 67.3 | 84.4 | 23 / 35 | 4739 |
| 4 | 1 | 67.6 | 90.2 | 17 / 35 | 4749 |
| 5 | 1 | 69.2 | 89.8 | 26 / 35 | 4999 |
| 6 | 1 | 68.6 | 88.9 | 20 / 35 | 5152 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 78 | 60% |
| lxx.ConceptA 0.8 | 24 | 92% |
| apc.botM 3.0 | 23 | 91% |
| vjik.UnViolation 1.1 | 14 | 100% |
| yk.JahMicro 1.0 | 9 | 78% |
| panzer.Panzer 0.2 | 6 | 83% |
| bayen.UbaMicro 1.4 | 6 | 67% |
| donjezza.Jezza 1.0 | 3 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 43 | 49% | 92 |
| apc.botM 3.0 | 11 | 13% | 36 |
| lxx.ConceptA 0.8 | 10 | 11% | 23 |
| bayen.UbaMicro 1.4 | 7 | 8% | 12 |
| panzer.Panzer 0.2 | 6 | 7% | 9 |
| vjik.UnViolation 1.1 | 5 | 6% | 28 |
| yk.JahMicro 1.0 | 4 | 5% | 7 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F33

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.6 | 120 / 210 | 2.21 | 18.9% | 30373 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 18.9% | 120 |
| maribo.Quester 0.3 | 2.0 | 15.6% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.6% | 22 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 10.7% | 13 |
| labg.Cataclysm 2.05 | 4.7 | 10.6% | 15 |
| baal.nano.N 1.42 | 6.3 | 8.6% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.1% | 2 |
| zyx.micro.Ant 1.1 | 8.5 | 5.6% | 2 |
| sanja.First 0.1 | 9.0 | 4.8% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 81.0 | 17 / 35 | 4636 |
| 2 | 1 | 69.2 | 88.6 | 19 / 35 | 5279 |
| 3 | 1 | 69.3 | 85.7 | 22 / 35 | 5200 |
| 4 | 1 | 68.5 | 84.8 | 22 / 35 | 4830 |
| 5 | 1 | 70.0 | 90.2 | 22 / 35 | 5159 |
| 6 | 1 | 69.6 | 89.2 | 18 / 35 | 5269 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 49 | 82% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 78% |
| labg.Cataclysm 2.05 | 25 | 68% |
| gre.svman4.Leonidas 1.3.2 | 24 | 83% |
| baal.nano.N 1.42 | 7 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 80% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 31 | 34% | 80 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 25% | 55 |
| gre.svman4.Leonidas 1.3.2 | 11 | 12% | 19 |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 11% | 12 |
| labg.Cataclysm 2.05 | 9 | 10% | 27 |
| zyx.micro.Ant 1.1 | 3 | 3% | 5 |
| sanja.First 0.1 | 2 | 2% | 3 |
| baal.nano.N 1.42 | 1 | 1% | 7 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 2 |

## Melee bench: F34

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 81.7 | 68 / 210 | 2.65 | 17.0% | 29353 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.8 | 17.0% | 68 |
| kid.Gladiator .7.2 | 2.0 | 16.6% | 45 |
| stelo.Spread 0.9 | 2.2 | 16.4% | 75 |
| jcs.Seth 1.8 | 4.5 | 10.9% | 12 |
| tcf.Reach 3 | 4.8 | 10.6% | 8 |
| cli.Dancer 1.1 | 5.7 | 9.8% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.2% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.6 | 85.4 | 10 / 35 | 4888 |
| 2 | 1 | 67.6 | 82.9 | 13 / 35 | 5170 |
| 3 | 1 | 68.0 | 84.4 | 14 / 35 | 4948 |
| 4 | 3 | 66.4 | 80.3 | 8 / 35 | 4770 |
| 5 | 1 | 66.7 | 78.4 | 15 / 35 | 5195 |
| 6 | 3 | 65.4 | 78.7 | 8 / 35 | 4382 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 64 | 45% |
| kid.Gladiator .7.2 | 40 | 50% |
| jcs.Seth 1.8 | 17 | 71% |
| tcf.Reach 3 | 4 | 25% |
| cli.Dancer 1.1 | 4 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 59 | 42% | 82 |
| kid.Gladiator .7.2 | 44 | 31% | 68 |
| jcs.Seth 1.8 | 16 | 11% | 29 |
| tcf.Reach 3 | 11 | 8% | 13 |
| ratosh.Wesco 1.4 | 6 | 4% | 7 |
| cli.Dancer 1.1 | 4 | 3% | 7 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |
| sample.RamFire 1.0 | 0 | 0% | 1 |

## Melee bench: F35

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 78.3 | 40 / 210 | 2.95 | 15.3% | 23353 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.7% | 140 |
| hadur117.mini.DeiseWP 0.2 | 2.2 | 15.3% | 40 |
| gh.mini.Gruwel 0.9 | 2.8 | 13.1% | 20 |
| rz.HawkOnFire 0.1 | 4.3 | 11.4% | 2 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.7 | 11.1% | 6 |
| wit.Chuliath 1.0 | 6.2 | 7.4% | 2 |
| myl.nano.KomoriNinja 1.1 | 7.2 | 6.3% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.5 | 5.8% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 83.5 | 7 / 35 | 4088 |
| 2 | 2 | 62.7 | 74.3 | 6 / 35 | 3723 |
| 3 | 2 | 64.3 | 79.4 | 7 / 35 | 3929 |
| 4 | 2 | 65.8 | 84.4 | 9 / 35 | 4209 |
| 5 | 2 | 63.4 | 78.4 | 5 / 35 | 3697 |
| 6 | 3 | 61.6 | 69.8 | 6 / 35 | 3707 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 81 | 23% |
| gh.mini.Gruwel 0.9 | 19 | 42% |
| rz.HawkOnFire 0.1 | 6 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 4 | 100% |
| wit.Chuliath 1.0 | 3 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 91 | 54% | 107 |
| gh.mini.Gruwel 0.9 | 38 | 22% | 48 |
| rz.HawkOnFire 0.1 | 15 | 9% | 22 |
| dmh.robocode.robot.BlackDeath 9.2 | 15 | 9% | 20 |
| wit.Chuliath 1.0 | 5 | 3% | 6 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 3 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.9 | 153 / 210 | 1.91 | 20.3% | 33223 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 20.3% | 153 |
| alpha.RainingFire 1.0 | 2.2 | 12.6% | 22 |
| bzdp.Pansy 2.1 | 3.2 | 11.6% | 11 |
| mz.Cork 0.1 | 4.7 | 10.2% | 7 |
| bvh.micro.Freya 0.3 | 5.0 | 10.1% | 9 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.1% | 4 |
| bvh.mini.Fenrir 0.39 | 6.2 | 9.4% | 3 |
| dl.BetterWalls 1.0 | 8.2 | 6.5% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 6.0% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.0 | 25 / 35 | 5809 |
| 2 | 1 | 70.3 | 91.4 | 26 / 35 | 5234 |
| 3 | 1 | 70.8 | 90.2 | 27 / 35 | 5854 |
| 4 | 1 | 70.3 | 91.1 | 25 / 35 | 5486 |
| 5 | 1 | 68.9 | 85.4 | 23 / 35 | 5345 |
| 6 | 1 | 71.5 | 94.3 | 27 / 35 | 5495 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 46 | 96% |
| mz.Cork 0.1 | 32 | 94% |
| alpha.RainingFire 1.0 | 30 | 67% |
| bvh.micro.Freya 0.3 | 26 | 96% |
| bvh.mini.Fenrir 0.39 | 16 | 100% |
| m3thos.Eva02 0.7.1 | 12 | 92% |
| dl.BetterWalls 1.0 | 3 | 100% |
| sample.MyFirstRobot 1.0 | 3 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 24 | 42% | 46 |
| mz.Cork 0.1 | 10 | 18% | 36 |
| bvh.mini.Fenrir 0.39 | 6 | 11% | 15 |
| bzdp.Pansy 2.1 | 5 | 9% | 49 |
| bvh.micro.Freya 0.3 | 5 | 9% | 25 |
| m3thos.Eva02 0.7.1 | 3 | 5% | 20 |
| dl.BetterWalls 1.0 | 3 | 5% | 12 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 5 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F37

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 89.9 | 163 / 210 | 1.90 | 19.6% | 33590 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 19.6% | 163 |
| germ.TheMind .2 | 3.0 | 10.7% | 10 |
| EBBU.Sim2 1.02 | 3.7 | 9.7% | 1 |
| stelo.UntouchableNano 1.3 | 4.2 | 9.6% | 9 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.8 | 9.2% | 7 |
| agrach.Dalek 1.0 | 5.5 | 9.3% | 6 |
| skm.Ryubot 1.0 | 8.0 | 7.9% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 8.2 | 8.0% | 0 |
| mb.Beast 0.1 | 8.3 | 8.1% | 5 |
| lmk.ACPFinal 0.1 | 8.3 | 8.0% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 92.7 | 28 / 35 | 5652 |
| 2 | 1 | 67.6 | 86.3 | 26 / 35 | 5305 |
| 3 | 1 | 68.9 | 89.5 | 28 / 35 | 5563 |
| 4 | 1 | 69.1 | 90.2 | 26 / 35 | 5890 |
| 5 | 1 | 68.2 | 87.6 | 27 / 35 | 5476 |
| 6 | 1 | 69.6 | 93.3 | 28 / 35 | 5704 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 33 | 82% |
| stelo.UntouchableNano 1.3 | 30 | 90% |
| com.syncleus.robocode.Dreadnaught 0.1 | 27 | 100% |
| EBBU.Sim2 1.02 | 26 | 100% |
| agrach.Dalek 1.0 | 19 | 100% |
| skm.Ryubot 1.0 | 17 | 94% |
| mb.Beast 0.1 | 10 | 100% |
| lmk.ACPFinal 0.1 | 10 | 80% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 444. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.UntouchableNano 1.3 | 9 | 19% | 28 |
| lmk.ACPFinal 0.1 | 9 | 19% | 23 |
| germ.TheMind .2 | 8 | 17% | 34 |
| com.syncleus.robocode.Dreadnaught 0.1 | 6 | 13% | 34 |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 11% | 10 |
| agrach.Dalek 1.0 | 4 | 9% | 26 |
| mb.Beast 0.1 | 4 | 9% | 20 |
| skm.Ryubot 1.0 | 2 | 4% | 6 |
| EBBU.Sim2 1.02 | 0 | 0% | 23 |

## Melee bench: F38

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 81.0 | 88 / 210 | 2.71 | 16.7% | 26473 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.2 | 16.7% | 88 |
| justin.Mallais 14.0 | 1.8 | 15.8% | 68 |
| bvh.mini.Freya 0.55 | 3.5 | 12.1% | 14 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.3% | 25 |
| cs.Wren 1.0 | 4.8 | 11.0% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.5 | 10.6% | 7 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.8% | 3 |
| matt.UnderDark3 2.4.34 | 8.5 | 4.6% | 0 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.7 | 5.3% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 73.0 | 10 / 35 | 4232 |
| 2 | 1 | 64.6 | 79.4 | 11 / 35 | 4074 |
| 3 | 1 | 67.0 | 83.2 | 19 / 35 | 4600 |
| 4 | 1 | 67.9 | 86.3 | 19 / 35 | 4563 |
| 5 | 1 | 66.3 | 82.9 | 15 / 35 | 4573 |
| 6 | 1 | 65.9 | 81.0 | 14 / 35 | 4431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 49 | 55% |
| bvh.mini.Freya 0.55 | 17 | 76% |
| bts.mega.Gnarly 1.4 | 16 | 75% |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 94% |
| cs.Wren 1.0 | 15 | 100% |
| kdf.KoulDestroyer 1.0 | 3 | 67% |
| matt.UnderDark3 2.4.34 | 3 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 44 | 35% | 72 |
| bvh.mini.Freya 0.55 | 24 | 19% | 30 |
| cs.Wren 1.0 | 20 | 16% | 32 |
| bts.mega.Gnarly 1.4 | 17 | 14% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 8% | 31 |
| kdf.KoulDestroyer 1.0 | 8 | 6% | 13 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 0 | 0% | 2 |

## Melee bench: F39

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 82.9 | 99 / 210 | 2.54 | 17.6% | 29574 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 17.6% | 99 |
| bvh.fry.Freya 0.82 | 2.2 | 14.3% | 25 |
| az.Ololobot 0.2.4 | 2.8 | 12.7% | 56 |
| catcat20.Lambda 0.024 | 4.0 | 10.9% | 18 |
| stelo.SoRobotNanoMelee 1.2 | 6.2 | 8.8% | 7 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.6% | 3 |
| apollokidd.ApolloKidd 0.9 | 6.5 | 8.2% | 1 |
| gimp.GimpBot 0.1 | 7.0 | 8.0% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 6.0% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 80.6 | 14 / 35 | 4555 |
| 2 | 1 | 68.2 | 89.2 | 21 / 35 | 5090 |
| 3 | 1 | 65.8 | 81.0 | 16 / 35 | 4716 |
| 4 | 1 | 66.4 | 82.5 | 17 / 35 | 4910 |
| 5 | 1 | 66.5 | 81.6 | 13 / 35 | 5219 |
| 6 | 1 | 67.1 | 82.5 | 18 / 35 | 5084 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 51 | 84% |
| az.Ololobot 0.2.4 | 46 | 50% |
| catcat20.Lambda 0.024 | 30 | 77% |
| stelo.SoRobotNanoMelee 1.2 | 6 | 83% |
| winamp32.micro.MicroMacro 1.0 | 3 | 67% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |
| gimp.GimpBot 0.1 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 41 | 37% | 79 |
| az.Ololobot 0.2.4 | 36 | 32% | 62 |
| catcat20.Lambda 0.024 | 17 | 15% | 35 |
| winamp32.micro.MicroMacro 1.0 | 5 | 4% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 5 | 4% | 9 |
| apollokidd.ApolloKidd 0.9 | 3 | 3% | 6 |
| gimp.GimpBot 0.1 | 3 | 3% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 2 |

## Melee bench: F40

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.3 | 104 / 210 | 2.50 | 18.1% | 29641 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 18.1% | 104 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.1% | 38 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 12.2% | 23 |
| mz.AntiGrav 1.0 | 3.8 | 11.3% | 10 |
| Polkwane.SmashMelee 1.0 | 5.3 | 10.0% | 10 |
| stelo.Randomness 1.0 | 5.8 | 9.5% | 14 |
| alpha.BlackIce 1.0 | 6.7 | 8.7% | 9 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.9% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.3 | 4.9% | 1 |
| sample.Corners 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 87.0 | 21 / 35 | 4906 |
| 2 | 1 | 65.4 | 78.1 | 10 / 35 | 4713 |
| 3 | 1 | 68.2 | 84.8 | 20 / 35 | 4983 |
| 4 | 1 | 67.6 | 85.1 | 17 / 35 | 4825 |
| 5 | 1 | 65.4 | 76.8 | 14 / 35 | 4783 |
| 6 | 1 | 69.5 | 87.9 | 22 / 35 | 5431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 37 | 73% |
| kano.gamma.KanoGamma 1.8 | 32 | 81% |
| mz.AntiGrav 1.0 | 18 | 94% |
| Polkwane.SmashMelee 1.0 | 17 | 82% |
| stelo.Randomness 1.0 | 11 | 82% |
| alpha.BlackIce 1.0 | 6 | 67% |
| amk.superstrike.SuperStrike 0.3 | 4 | 75% |
| sample.Corners 1.0 | 3 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 30 | 28% | 48 |
| stelo.Randomness 1.0 | 17 | 16% | 31 |
| kano.gamma.KanoGamma 1.8 | 16 | 15% | 44 |
| Polkwane.SmashMelee 1.0 | 16 | 15% | 22 |
| mz.AntiGrav 1.0 | 13 | 12% | 33 |
| amk.superstrike.SuperStrike 0.3 | 6 | 6% | 13 |
| alpha.BlackIce 1.0 | 6 | 6% | 10 |
| testantiswapgun.AntiSwap 1.0 | 2 | 2% | 5 |
| sample.Corners 1.0 | 0 | 0% | 4 |

## Melee bench: F41

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 82.3 | 84 / 210 | 2.60 | 17.1% | 26758 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.2 | 17.1% | 84 |
| eem.EvBotNG v12.8 | 1.8 | 16.4% | 83 |
| ary.Swarm 1.1 | 3.2 | 13.1% | 16 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.2% | 15 |
| simonton.nano.MeleeSeed 1.8 | 5.2 | 10.5% | 10 |
| shrub.Silver v048 | 6.0 | 8.8% | 1 |
| zyx.nano.Ant 1.1 | 6.8 | 7.4% | 0 |
| stelo.Mirror 1.1 | 8.3 | 5.8% | 1 |
| jsal.Jsalbot 1.0 | 8.7 | 5.7% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 85.4 | 12 / 35 | 4923 |
| 2 | 1 | 66.2 | 82.2 | 13 / 35 | 4443 |
| 3 | 2 | 65.8 | 78.7 | 15 / 35 | 4392 |
| 4 | 1 | 65.9 | 78.7 | 14 / 35 | 4254 |
| 5 | 1 | 67.3 | 83.8 | 18 / 35 | 4380 |
| 6 | 1 | 66.7 | 84.8 | 12 / 35 | 4366 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 63 | 30% |
| simonton.nano.MeleeSeed 1.8 | 24 | 92% |
| lessonz.robocode.Oz 0.5.0 | 22 | 82% |
| ary.Swarm 1.1 | 21 | 81% |
| stelo.Mirror 1.1 | 5 | 80% |
| shrub.Silver v048 | 3 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 66 | 52% | 89 |
| ary.Swarm 1.1 | 24 | 19% | 45 |
| lessonz.robocode.Oz 0.5.0 | 19 | 15% | 28 |
| simonton.nano.MeleeSeed 1.8 | 7 | 6% | 25 |
| shrub.Silver v048 | 4 | 3% | 11 |
| zyx.nano.Ant 1.1 | 3 | 2% | 3 |
| jsal.Jsalbot 1.0 | 2 | 2% | 4 |
| stelo.Mirror 1.1 | 1 | 1% | 5 |

## Melee bench: F42

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 82.6 | 86 / 210 | 2.57 | 17.6% | 31509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 17.6% | 86 |
| wompi.Wallaby 5.1 | 2.0 | 15.7% | 63 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.1% | 24 |
| ara.Shera 0.88 | 3.5 | 13.2% | 29 |
| amz.NanoClone 1.41 | 5.0 | 9.4% | 4 |
| maribo.IotaCT 1.1 | 6.5 | 7.4% | 0 |
| dsw.StaticD 1.0 | 6.7 | 7.4% | 5 |
| stelo.MirrorMicro 1.0 | 8.7 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.0 | 5.3% | 0 |
| mme.NikeEnhanced 2.0 | 9.2 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 80.6 | 15 / 35 | 5024 |
| 2 | 1 | 67.1 | 85.7 | 15 / 35 | 5052 |
| 3 | 1 | 67.1 | 81.3 | 17 / 35 | 5111 |
| 4 | 1 | 67.2 | 84.1 | 13 / 35 | 5290 |
| 5 | 1 | 66.8 | 80.6 | 12 / 35 | 5425 |
| 6 | 1 | 67.7 | 83.2 | 14 / 35 | 5607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ara.Shera 0.88 | 42 | 69% |
| wompi.Wallaby 5.1 | 38 | 55% |
| maribo.mini.MiniQuester 0.1 | 33 | 79% |
| amz.NanoClone 1.41 | 4 | 75% |
| stelo.MirrorMicro 1.0 | 3 | 100% |
| dsw.StaticD 1.0 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 43 | 34% | 72 |
| ara.Shera 0.88 | 36 | 29% | 58 |
| maribo.mini.MiniQuester 0.1 | 29 | 23% | 52 |
| amz.NanoClone 1.41 | 7 | 6% | 9 |
| dsw.StaticD 1.0 | 3 | 2% | 6 |
| maribo.IotaCT 1.1 | 3 | 2% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 2% | 3 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F43

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 71.4 | 36 / 210 | 3.57 | 14.3% | 23563 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.4% | 139 |
| hadur117.mini.DeiseWP 0.2 | 2.2 | 14.3% | 36 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.9% | 20 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.6% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 11.5% | 5 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.7% | 2 |
| jab.DiamondStealer 5 | 7.0 | 7.9% | 0 |
| mz.NanoGod 2.02 | 8.0 | 7.1% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 72.7 | 6 / 35 | 4129 |
| 2 | 2 | 64.2 | 73.0 | 6 / 35 | 4076 |
| 3 | 3 | 61.9 | 68.6 | 6 / 35 | 3626 |
| 4 | 2 | 66.4 | 79.7 | 8 / 35 | 4525 |
| 5 | 2 | 61.0 | 66.3 | 5 / 35 | 3535 |
| 6 | 2 | 62.0 | 68.3 | 5 / 35 | 3672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 60 | 20% |
| brainfade.melee.Dusk 0.44 | 11 | 82% |
| dummy.micro.Sparrow 2.5 | 10 | 90% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 100% |
| cvt.Firsty 1.0 | 2 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 90 | 51% | 104 |
| brainfade.melee.Dusk 0.44 | 23 | 13% | 32 |
| wcsv.melee.EngineerMelee 0.1 | 22 | 13% | 24 |
| dummy.micro.Sparrow 2.5 | 18 | 10% | 25 |
| mz.NanoGod 2.02 | 8 | 5% | 8 |
| Krabb.akim2.Akim2 1.1b | 7 | 4% | 9 |
| jab.DiamondStealer 5 | 4 | 2% | 5 |
| cvt.Firsty 1.0 | 2 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.4 | 113 / 210 | 2.31 | 19.0% | 33029 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 19.0% | 113 |
| stelo.Liblix 0.3.1 | 2.2 | 15.7% | 58 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.3% | 29 |
| wompi.Quokka 1.6 | 4.3 | 9.9% | 2 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 8.9% | 1 |
| jwirde.Gort 2.0 | 5.7 | 8.9% | 5 |
| disan.Chair 2.2.0 | 7.2 | 7.5% | 2 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.3% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 90.2 | 23 / 35 | 5541 |
| 2 | 1 | 67.9 | 81.9 | 14 / 35 | 5630 |
| 3 | 1 | 69.5 | 87.3 | 22 / 35 | 5407 |
| 4 | 1 | 67.7 | 83.5 | 16 / 35 | 5235 |
| 5 | 1 | 68.9 | 84.4 | 19 / 35 | 5622 |
| 6 | 1 | 69.4 | 85.4 | 19 / 35 | 5594 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 76 | 68% |
| tzu.TheArtOfWar 1.2 | 51 | 71% |
| wompi.Quokka 1.6 | 9 | 89% |
| disan.Chair 2.2.0 | 9 | 89% |
| jwirde.Gort 2.0 | 3 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 67% |
| amk.jointstrike.JointStrike 0.2 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 51 | 53% | 102 |
| tzu.TheArtOfWar 1.2 | 26 | 27% | 63 |
| disan.Chair 2.2.0 | 6 | 6% | 11 |
| wompi.Quokka 1.6 | 6 | 6% | 10 |
| amk.jointstrike.JointStrike 0.2 | 4 | 4% | 6 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 3% | 8 |
| jwirde.Gort 2.0 | 1 | 1% | 10 |

## Melee bench: F45

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.3 | 79 / 210 | 2.23 | 19.4% | 35821 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWP 0.2 | 1.0 | 19.4% | 79 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.1% | 115 |
| jje.BagPuss 1.2 | 3.0 | 11.8% | 7 |
| sul.Lunar 1.1 | 4.5 | 9.8% | 3 |
| myl.nano.Graviton 1.10 | 4.8 | 9.7% | 1 |
| fm.claire 1.7 | 6.3 | 8.6% | 0 |
| hvilela.HVilela 0.9 | 6.8 | 8.5% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 8.3% | 3 |
| wit.Deep7 2.0 | 9.0 | 6.1% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.9 | 13 / 35 | 6026 |
| 2 | 1 | 69.7 | 88.9 | 15 / 35 | 6132 |
| 3 | 1 | 68.9 | 87.6 | 14 / 35 | 5680 |
| 4 | 1 | 67.3 | 82.9 | 10 / 35 | 5521 |
| 5 | 1 | 68.7 | 84.1 | 15 / 35 | 5977 |
| 6 | 1 | 69.5 | 86.3 | 12 / 35 | 6485 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 98 | 17% |
| sul.Lunar 1.1 | 18 | 94% |
| jje.BagPuss 1.2 | 17 | 82% |
| pez.mini.ChironexFleckeri 0.5 | 13 | 92% |
| myl.nano.Graviton 1.10 | 8 | 100% |
| fm.claire 1.7 | 5 | 100% |
| hvilela.HVilela 0.9 | 3 | 100% |
| wit.Deep7 2.0 | 2 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 2058. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 83 | 63% | 0 |
| jje.BagPuss 1.2 | 17 | 13% | 51 |
| fm.claire 1.7 | 10 | 8% | 21 |
| pez.mini.ChironexFleckeri 0.5 | 7 | 5% | 23 |
| myl.nano.Graviton 1.10 | 6 | 5% | 25 |
| hvilela.HVilela 0.9 | 5 | 4% | 14 |
| sul.Lunar 1.1 | 3 | 2% | 59 |
| wit.Deep7 2.0 | 1 | 1% | 9 |
| abud.ThirdRobo 1.0 | 0 | 0% | 8 |

## Melee bench: F46

hadur117.mini.DeiseWP 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 78.4 | 43 / 210 | 2.95 | 15.6% | 25894 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 16.8% | 65 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.8% | 84 |
| hadur117.mini.DeiseWP 0.2 | 2.7 | 15.6% | 43 |
| mz.MicroSheep 1.0 | 4.5 | 10.3% | 5 |
| cx.Princess 1.0 | 5.3 | 9.4% | 12 |
| sadoner.killer 0.2 | 5.5 | 9.6% | 1 |
| arthord.NanoSatanMelee Beta | 6.7 | 7.7% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.5 | 80.6 | 9 / 35 | 4468 |
| 2 | 3 | 61.8 | 71.4 | 5 / 35 | 3887 |
| 3 | 2 | 65.6 | 83.5 | 5 / 35 | 4384 |
| 4 | 2 | 65.1 | 79.4 | 9 / 35 | 4476 |
| 5 | 3 | 63.5 | 75.9 | 6 / 35 | 4327 |
| 6 | 3 | 65.0 | 79.4 | 9 / 35 | 4352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 49 | 29% |
| kc.mini.Mirage 0.2 | 32 | 47% |
| mz.MicroSheep 1.0 | 6 | 83% |
| cx.Princess 1.0 | 4 | 75% |
| sadoner.killer 0.2 | 3 | 100% |
| arthord.NanoSatanMelee Beta | 3 | 100% |

Hadur died in 167 of 210 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 71 | 43% | 88 |
| rsalesc.melee.Medina 0.4.5 | 60 | 36% | 74 |
| mz.MicroSheep 1.0 | 12 | 7% | 17 |
| cx.Princess 1.0 | 9 | 5% | 11 |
| sadoner.killer 0.2 | 9 | 5% | 11 |
| arthord.NanoSatanMelee Beta | 6 | 4% | 9 |

