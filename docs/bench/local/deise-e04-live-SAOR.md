# Bench suite: suite.txt

## Melee bench: F01

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 72.1 | 23 / 210 | 3.51 | 14.7% | 28314 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.3% | 146 |
| hadur117.micro.Saor 0.2 | 2.0 | 14.7% | 23 |
| sgp.JollyNinja 3.53 | 3.2 | 12.2% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.7 | 10.9% | 2 |
| lorneswork.Predator 1.0 | 5.0 | 10.5% | 2 |
| mz.MicroGodMelee 1 | 5.3 | 10.1% | 11 |
| adt.Ar2 1.0 | 6.8 | 8.5% | 3 |
| skm.butterfly 1.0 | 8.5 | 4.8% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.5 | 4.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 67.6 | 3 / 35 | 4878 |
| 2 | 2 | 63.9 | 73.3 | 4 / 35 | 5023 |
| 3 | 2 | 63.8 | 76.8 | 3 / 35 | 4591 |
| 4 | 2 | 61.7 | 70.5 | 3 / 35 | 4319 |
| 5 | 2 | 63.6 | 74.6 | 4 / 35 | 4588 |
| 6 | 2 | 63.1 | 69.5 | 6 / 35 | 4915 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 71 | 3% |
| sgp.JollyNinja 3.53 | 13 | 77% |
| mz.MicroGodMelee 1 | 7 | 57% |
| lorneswork.Predator 1.0 | 5 | 80% |
| adt.Ar2 1.0 | 2 | 50% |
| simonton.nano.WeekendObsession_Melee 1.0 | 2 | 100% |

Hadur died in 187 of 210 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 112 | 60% | 116 |
| sgp.JollyNinja 3.53 | 21 | 11% | 26 |
| mz.MicroGodMelee 1 | 15 | 8% | 20 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 7% | 15 |
| lorneswork.Predator 1.0 | 10 | 5% | 14 |
| kawigi.sbf.FloodSonnet 0.9 | 6 | 3% | 7 |
| adt.Ar2 1.0 | 6 | 3% | 7 |
| skm.butterfly 1.0 | 2 | 1% | 3 |
| mym.EdgeStalker 1.0 | 2 | 1% | 2 |

## Melee bench: F02

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 79.8 | 80 / 210 | 2.82 | 17.5% | 30775 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.5% | 80 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.9% | 48 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.7% | 40 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.1% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.8% | 6 |
| fnc.bandit.Bandit 5.2.0 | 6.3 | 8.3% | 5 |
| Noran.BitchingElk 0.054 | 7.2 | 7.8% | 15 |
| sch.Simone 0.3d | 7.8 | 7.2% | 10 |
| stelo.PatternRobot 1.0 | 8.8 | 5.9% | 1 |
| fullsail.SweetTea 1.1 | 9.7 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 79.7 | 13 / 35 | 4989 |
| 2 | 1 | 67.4 | 81.9 | 12 / 35 | 5553 |
| 3 | 1 | 64.8 | 74.9 | 12 / 35 | 4712 |
| 4 | 1 | 65.4 | 79.7 | 12 / 35 | 4864 |
| 5 | 1 | 67.7 | 82.2 | 17 / 35 | 5305 |
| 6 | 1 | 66.9 | 80.3 | 14 / 35 | 5352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 45 | 62% |
| pulsar.PulsarMax 0.8.9 | 43 | 42% |
| Noran.BitchingElk 0.054 | 15 | 67% |
| sch.Simone 0.3d | 9 | 78% |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 63% |
| stelo.PatternRobot 1.0 | 5 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 5 | 100% |
| fnc.bandit.Bandit 5.2.0 | 5 | 20% |
| fullsail.SweetTea 1.1 | 2 | 50% |

Hadur died in 130 of 210 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 40 | 31% | 59 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 39 | 30% | 64 |
| sch.Simone 0.3d | 10 | 8% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 8% | 16 |
| Noran.BitchingElk 0.054 | 9 | 7% | 17 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 5% | 15 |
| fnc.bandit.Bandit 5.2.0 | 7 | 5% | 11 |
| fullsail.SweetTea 1.1 | 5 | 4% | 5 |
| stelo.PatternRobot 1.0 | 3 | 2% | 6 |

## Melee bench: F03

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 76.7 | 118 / 210 | 3.10 | 17.4% | 33375 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.4% | 118 |
| radnor.DoctorBob 1.42 | 2.3 | 14.2% | 32 |
| kawigi.nano.Lib 1.0 | 3.2 | 12.7% | 27 |
| vuen.Cake 2.51 | 3.5 | 12.3% | 27 |
| urdos.URDOS 1.3 | 5.0 | 9.8% | 4 |
| adt.Ar1 2.1 | 6.5 | 8.2% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 6.8 | 7.6% | 1 |
| oa.weak.FlyMk1 0.1 | 8.2 | 6.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.9% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 78.1 | 20 / 35 | 5685 |
| 2 | 1 | 67.2 | 79.7 | 19 / 35 | 5641 |
| 3 | 1 | 66.7 | 77.1 | 21 / 35 | 5686 |
| 4 | 1 | 65.8 | 75.2 | 20 / 35 | 5526 |
| 5 | 1 | 64.6 | 69.8 | 19 / 35 | 5319 |
| 6 | 1 | 66.6 | 80.0 | 19 / 35 | 5518 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 46 | 80% |
| vuen.Cake 2.51 | 42 | 79% |
| radnor.DoctorBob 1.42 | 36 | 89% |
| urdos.URDOS 1.3 | 7 | 86% |
| oa.weak.FlyMk1 0.1 | 5 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 75% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 529. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 24 | 26% | 61 |
| radnor.DoctorBob 1.42 | 19 | 21% | 51 |
| vuen.Cake 2.51 | 13 | 14% | 41 |
| ghent.ArthurPanzergon 1.0.0 | 8 | 9% | 11 |
| adt.Ar1 2.1 | 8 | 9% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 9% | 9 |
| urdos.URDOS 1.3 | 6 | 7% | 13 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 4 | 4% | 6 |
| oa.weak.FlyMk1 0.1 | 2 | 2% | 8 |

## Melee bench: F04

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 75.7 | 7 / 210 | 3.19 | 15.7% | 32735 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.6% | 187 |
| hadur117.micro.Saor 0.2 | 2.0 | 15.7% | 7 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.6% | 9 |
| TNT.TNT 0.99.1 | 4.2 | 10.8% | 5 |
| josago.Jorgito 0.16 | 4.8 | 9.2% | 1 |
| css.Delitioner 0.11 | 6.3 | 7.1% | 0 |
| tj.zombie1n 1.0.1 | 7.2 | 6.1% | 0 |
| rampancy.Durandal 2.1d | 7.7 | 5.7% | 0 |
| spin.Bugstard 0.012b | 9.3 | 4.2% | 1 |
| sp.Nanos.Ember 1.1 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 81.0 | 2 / 35 | 5371 |
| 2 | 2 | 65.7 | 75.9 | 2 / 35 | 5419 |
| 3 | 2 | 65.5 | 76.2 | 1 / 35 | 5598 |
| 4 | 2 | 65.4 | 75.2 | 1 / 35 | 5432 |
| 5 | 2 | 64.7 | 72.1 | 0 / 35 | 5472 |
| 6 | 2 | 65.1 | 73.7 | 1 / 35 | 5443 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 69 | 0% |
| apc.LeeroyJenkins2 1.0 | 5 | 20% |
| TNT.TNT 0.99.1 | 5 | 40% |
| josago.Jorgito 0.16 | 2 | 100% |
| css.Delitioner 0.11 | 1 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 203 of 210 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 152 | 75% | 153 |
| apc.LeeroyJenkins2 1.0 | 24 | 12% | 27 |
| josago.Jorgito 0.16 | 8 | 4% | 10 |
| TNT.TNT 0.99.1 | 8 | 4% | 10 |
| css.Delitioner 0.11 | 5 | 2% | 4 |
| tj.zombie1n 1.0.1 | 4 | 2% | 4 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |

## Melee bench: F05

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 64.4 | 9 / 210 | 4.20 | 13.1% | 24496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.5% | 117 |
| justin.DemonicRage 3.4 | 2.0 | 17.3% | 67 |
| hadur117.micro.Saor 0.2 | 3.2 | 13.1% | 9 |
| wompi.Numbat 2.1 | 3.8 | 12.5% | 10 |
| axeBots.HataMoto 3.09 | 5.3 | 9.3% | 3 |
| ms.Ares 0.19 | 5.7 | 8.6% | 4 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.1% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.8% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.6% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.4 | 65.4 | 4 / 35 | 3875 |
| 2 | 3 | 59.4 | 59.7 | 1 / 35 | 4301 |
| 3 | 3 | 60.0 | 62.5 | 1 / 35 | 4277 |
| 4 | 3 | 60.7 | 66.3 | 0 / 35 | 4160 |
| 5 | 3 | 59.7 | 63.5 | 1 / 35 | 4143 |
| 6 | 3 | 60.7 | 69.2 | 2 / 35 | 3740 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 33 | 3% |
| justin.DemonicRage 3.4 | 22 | 9% |
| wompi.Numbat 2.1 | 7 | 71% |
| axeBots.HataMoto 3.09 | 2 | 50% |
| ms.Ares 0.19 | 1 | 0% |

Hadur died in 201 of 210 rounds, at a mean tick of 728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 73 | 36% | 74 |
| justin.DemonicRage 3.4 | 69 | 34% | 71 |
| wompi.Numbat 2.1 | 27 | 13% | 32 |
| ms.Ares 0.19 | 14 | 7% | 14 |
| supersample.SuperBoxBot 1.0 | 8 | 4% | 8 |
| axeBots.HataMoto 3.09 | 5 | 2% | 6 |
| davidalves.net.DuelistMicroMelee 1.4 | 4 | 2% | 4 |
| GarmBox.Oranges 1.0 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 75.3 | 90 / 210 | 3.22 | 16.1% | 26154 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 16.1% | 90 |
| jekl.StoneGhost 0.7 | 2.2 | 14.2% | 19 |
| origin.SleepSiphon 1.7b | 2.7 | 13.4% | 67 |
| mld.Wisdom 1.0 | 4.5 | 12.0% | 9 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.5 | 11.7% | 10 |
| gg.Wolverine 2.0 | 5.8 | 9.1% | 9 |
| spinnercat.Omen 1.0 | 7.5 | 7.0% | 1 |
| DBall.NUKE 0.1 | 8.0 | 6.8% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 8.5 | 6.4% | 3 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 77.1 | 11 / 35 | 4567 |
| 2 | 1 | 65.7 | 76.5 | 15 / 35 | 4637 |
| 3 | 1 | 67.2 | 83.8 | 19 / 35 | 4529 |
| 4 | 3 | 60.9 | 66.0 | 13 / 35 | 3522 |
| 5 | 1 | 64.4 | 72.4 | 16 / 35 | 4490 |
| 6 | 1 | 64.7 | 75.9 | 16 / 35 | 4409 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 44 | 98% |
| origin.SleepSiphon 1.7b | 39 | 28% |
| pe.minimelee.SandboxMiniMelee 1.1 | 21 | 81% |
| gg.Wolverine 2.0 | 9 | 56% |
| DBall.NUKE 0.1 | 7 | 100% |
| mld.Wisdom 1.0 | 6 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 44 | 36% | 58 |
| mld.Wisdom 1.0 | 27 | 22% | 35 |
| pe.minimelee.SandboxMiniMelee 1.1 | 20 | 17% | 41 |
| gg.Wolverine 2.0 | 14 | 12% | 17 |
| jekl.StoneGhost 0.7 | 9 | 7% | 40 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 2% | 5 |
| DBall.NUKE 0.1 | 2 | 2% | 11 |
| spinnercat.Omen 1.0 | 1 | 1% | 2 |
| sample.Fire 1.0 | 1 | 1% | 1 |

## Melee bench: F07

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 83.5 | 71 / 210 | 2.49 | 18.2% | 35227 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 18.2% | 71 |
| rtk.Tachikoma 1.0 | 2.3 | 17.2% | 62 |
| rsalesc.melee.Monk 0.3.6c | 2.5 | 17.3% | 49 |
| franzor.Lizt 1.3.1 | 4.5 | 10.8% | 17 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.1% | 12 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.9% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.9% | 1 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.1% | 0 |
| sample.Target 1.0 | 9.2 | 2.9% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 80.3 | 10 / 35 | 5714 |
| 2 | 2 | 69.5 | 83.8 | 11 / 35 | 6366 |
| 3 | 1 | 68.7 | 83.8 | 11 / 35 | 5456 |
| 4 | 1 | 68.8 | 83.5 | 10 / 35 | 5865 |
| 5 | 1 | 70.5 | 88.6 | 14 / 35 | 6026 |
| 6 | 1 | 68.9 | 81.0 | 15 / 35 | 5800 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 75 | 51% |
| rsalesc.melee.Monk 0.3.6c | 38 | 13% |
| oog.melee.CapuletDroid 1.1 | 23 | 87% |
| franzor.Lizt 1.3.1 | 12 | 50% |
| exauge.GateKeeper 1.1.121g | 3 | 67% |

Hadur died in 139 of 210 rounds, at a mean tick of 1220. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 56 | 40% | 109 |
| rsalesc.melee.Monk 0.3.6c | 53 | 38% | 74 |
| oog.melee.CapuletDroid 1.1 | 11 | 8% | 9 |
| franzor.Lizt 1.3.1 | 11 | 8% | 5 |
| exauge.GateKeeper 1.1.121g | 4 | 3% | 7 |
| lrem.micro.MoggFanatic 0.2 | 3 | 2% | 4 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 2 |

## Melee bench: F08

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 79.1 | 101 / 210 | 2.88 | 18.0% | 33016 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.0% | 101 |
| tm.Yuugao 1.0 | 2.3 | 13.5% | 51 |
| shrub.Vapour v159 | 3.0 | 12.7% | 30 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 10.7% | 12 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 9.6% | 9 |
| m3thos.Eva00 1.1 | 5.7 | 8.9% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 7.9% | 3 |
| qualidafial.MajorDick 1.0.1 | 8.2 | 7.0% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 5.6% | 0 |
| SHAM.WOW 1.4 | 9.5 | 6.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 78.7 | 18 / 35 | 5761 |
| 2 | 1 | 68.0 | 81.6 | 19 / 35 | 5534 |
| 3 | 1 | 64.1 | 69.2 | 14 / 35 | 5241 |
| 4 | 1 | 67.9 | 82.5 | 17 / 35 | 5316 |
| 5 | 1 | 66.6 | 78.1 | 15 / 35 | 5515 |
| 6 | 1 | 68.3 | 84.4 | 18 / 35 | 5649 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 43 | 40% |
| shrub.Vapour v159 | 41 | 73% |
| Krabb.sliNk.Garm 0.9u | 25 | 84% |
| com.spp.robocode.MostlyHarmless 010 | 17 | 82% |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 88% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| m3thos.Eva00 1.1 | 2 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 50 | 45% | 75 |
| shrub.Vapour v159 | 20 | 18% | 43 |
| Krabb.sliNk.Garm 0.9u | 9 | 8% | 23 |
| com.spp.robocode.MostlyHarmless 010 | 8 | 7% | 23 |
| zyx.nano.BacillusComma 1.0 | 6 | 5% | 10 |
| qualidafial.MajorDick 1.0.1 | 6 | 5% | 8 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 4% | 12 |
| m3thos.Eva00 1.1 | 4 | 4% | 8 |
| SHAM.WOW 1.4 | 4 | 4% | 7 |

## Melee bench: F09

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 63.5 | 30 / 210 | 4.29 | 13.2% | 22762 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 17.9% | 123 |
| hadur117.micro.Saor 0.2 | 2.3 | 13.2% | 30 |
| kc.micro.Figment 1.0 | 2.3 | 13.3% | 31 |
| pedersen.Grishnakh 1.0 | 4.3 | 10.9% | 13 |
| yagami.Tidus 0.11 | 4.7 | 10.6% | 3 |
| mc2.enemy.Original 0.9 | 6.2 | 9.0% | 7 |
| dft.Calliope 5.6 | 6.8 | 8.2% | 3 |
| robar.nano.Assertive_Melee 0.2 | 8.7 | 5.7% | 0 |
| step.nanoPri 1.0 | 9.2 | 5.7% | 0 |
| rdm.Dueler 0.4x | 9.2 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.1 | 65.4 | 5 / 35 | 3713 |
| 2 | 3 | 58.6 | 60.0 | 6 / 35 | 3895 |
| 3 | 2 | 62.5 | 74.3 | 6 / 35 | 4076 |
| 4 | 2 | 58.1 | 58.1 | 4 / 35 | 3924 |
| 5 | 3 | 55.1 | 51.1 | 5 / 35 | 3473 |
| 6 | 2 | 61.6 | 72.1 | 4 / 35 | 3681 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 39 | 8% |
| kc.micro.Figment 1.0 | 31 | 48% |
| pedersen.Grishnakh 1.0 | 8 | 38% |
| yagami.Tidus 0.11 | 6 | 100% |
| mc2.enemy.Original 0.9 | 4 | 75% |

Hadur died in 180 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 66 | 37% | 71 |
| kc.micro.Figment 1.0 | 56 | 31% | 71 |
| pedersen.Grishnakh 1.0 | 15 | 8% | 17 |
| yagami.Tidus 0.11 | 11 | 6% | 16 |
| robar.nano.Assertive_Melee 0.2 | 11 | 6% | 11 |
| mc2.enemy.Original 0.9 | 7 | 4% | 10 |
| step.nanoPri 1.0 | 6 | 3% | 6 |
| dft.Calliope 5.6 | 5 | 3% | 5 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |

## Melee bench: F10

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 83.9 | 96 / 210 | 2.45 | 17.9% | 32684 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.9% | 96 |
| DTF.Kludgy 1.2b | 2.0 | 15.7% | 68 |
| ne.Chimera 1.2 | 3.5 | 12.5% | 10 |
| ejb.Polaris 1.0.1 | 3.7 | 11.6% | 18 |
| tvv.micro.Antares 1.1.1 | 5.0 | 10.7% | 11 |
| vStar.RAFzilla 2.15 | 5.8 | 10.2% | 6 |
| sam.Samspin 1.0 | 7.5 | 6.1% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.5% | 0 |
| kurios.DOSexe .9b | 8.3 | 5.6% | 1 |
| donjezza.Muncho 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 80.0 | 12 / 35 | 5190 |
| 2 | 1 | 65.0 | 78.4 | 13 / 35 | 4868 |
| 3 | 1 | 69.3 | 88.3 | 18 / 35 | 5806 |
| 4 | 1 | 68.9 | 87.9 | 17 / 35 | 5924 |
| 5 | 1 | 67.3 | 81.3 | 16 / 35 | 5601 |
| 6 | 1 | 68.2 | 87.6 | 20 / 35 | 5295 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 57 | 26% |
| ejb.Polaris 1.0.1 | 31 | 77% |
| ne.Chimera 1.2 | 22 | 95% |
| vStar.RAFzilla 2.15 | 20 | 90% |
| tvv.micro.Antares 1.1.1 | 14 | 79% |
| kurios.DOSexe .9b | 4 | 100% |
| donjezza.Muncho 1.0 | 2 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 71 | 62% | 87 |
| ejb.Polaris 1.0.1 | 16 | 14% | 40 |
| tvv.micro.Antares 1.1.1 | 11 | 10% | 19 |
| ne.Chimera 1.2 | 10 | 9% | 30 |
| kurios.DOSexe .9b | 2 | 2% | 7 |
| sam.Samspin 1.0 | 2 | 2% | 3 |
| vStar.RAFzilla 2.15 | 1 | 1% | 22 |
| donjezza.Muncho 1.0 | 1 | 1% | 2 |

## Melee bench: F11

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 74.2 | 59 / 210 | 3.32 | 15.8% | 27176 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 16.9% | 94 |
| hadur117.micro.Saor 0.2 | 1.8 | 15.8% | 59 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.3% | 24 |
| djc.DynaBot 0.1.1 | 3.8 | 10.6% | 12 |
| rdt199.Warlord 0.73 | 5.8 | 8.9% | 5 |
| br2.MobyDickBot 1.6 | 6.2 | 8.9% | 6 |
| uji.YellohFellah 1.0 | 6.5 | 8.7% | 8 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.6% | 3 |
| stelo.MirrorNano 1.3 | 9.3 | 5.1% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 72.4 | 7 / 35 | 4746 |
| 2 | 1 | 65.0 | 76.2 | 11 / 35 | 4818 |
| 3 | 2 | 66.7 | 83.5 | 12 / 35 | 4555 |
| 4 | 2 | 60.6 | 66.3 | 5 / 35 | 4229 |
| 5 | 2 | 63.9 | 73.7 | 13 / 35 | 4500 |
| 6 | 2 | 63.9 | 73.3 | 11 / 35 | 4328 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 53 | 15% |
| cx.mini.Nimrod 0.55 | 18 | 67% |
| djc.DynaBot 0.1.1 | 13 | 69% |
| uji.YellohFellah 1.0 | 13 | 85% |
| rdt199.Warlord 0.73 | 11 | 82% |
| br2.MobyDickBot 1.6 | 8 | 88% |
| KiraNL.Chupacabra 0.4 | 3 | 33% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 80 | 53% | 88 |
| cx.mini.Nimrod 0.55 | 27 | 18% | 37 |
| KiraNL.Chupacabra 0.4 | 10 | 7% | 12 |
| djc.DynaBot 0.1.1 | 9 | 6% | 16 |
| rdt199.Warlord 0.73 | 7 | 5% | 19 |
| br2.MobyDickBot 1.6 | 6 | 4% | 15 |
| stelo.MirrorNano 1.3 | 6 | 4% | 7 |
| uji.YellohFellah 1.0 | 4 | 3% | 15 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 1% | 1 |

## Melee bench: F12

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 79.6 | 89 / 210 | 2.83 | 16.8% | 25106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 16.8% | 89 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.9% | 49 |
| nat.PallasHawk 1.0 | 3.2 | 12.9% | 38 |
| darkcanuck.Leon 1.01 | 3.3 | 12.6% | 23 |
| brainfade.melee.Genghis 0.36 | 5.0 | 9.9% | 5 |
| jrm.Test0 1.0 | 6.5 | 8.2% | 1 |
| jp.Perpy 16.0 | 7.3 | 7.2% | 0 |
| cs.sheldor.Talon 1.1 | 7.7 | 7.1% | 0 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.9% | 4 |
| stuff.Vlad 0.1 | 9.3 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 73.0 | 14 / 35 | 3831 |
| 2 | 1 | 63.2 | 74.0 | 14 / 35 | 3817 |
| 3 | 1 | 65.1 | 79.4 | 14 / 35 | 4094 |
| 4 | 1 | 66.8 | 83.8 | 17 / 35 | 4263 |
| 5 | 1 | 66.5 | 81.0 | 16 / 35 | 4500 |
| 6 | 1 | 67.3 | 86.7 | 14 / 35 | 4601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 37 | 68% |
| nat.PallasHawk 1.0 | 37 | 62% |
| bts.wiki.RipCurl 0.9b | 26 | 58% |
| brainfade.melee.Genghis 0.36 | 12 | 92% |
| jrm.Test0 1.0 | 6 | 100% |
| jaybot.bots.Oddball 4.0 | 5 | 60% |
| jp.Perpy 16.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 36 | 30% | 54 |
| bts.wiki.RipCurl 0.9b | 32 | 26% | 56 |
| darkcanuck.Leon 1.01 | 23 | 19% | 53 |
| brainfade.melee.Genghis 0.36 | 10 | 8% | 15 |
| jrm.Test0 1.0 | 8 | 7% | 10 |
| jaybot.bots.Oddball 4.0 | 5 | 4% | 8 |
| jp.Perpy 16.0 | 4 | 3% | 4 |
| stuff.Vlad 0.1 | 3 | 2% | 4 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 4 |

## Melee bench: F13

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 64.3 | 8 / 210 | 4.21 | 12.9% | 24434 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.3 | 17.0% | 64 |
| mn.Combat 3.25.0 | 1.7 | 16.8% | 93 |
| hadur117.micro.Saor 0.2 | 3.5 | 12.9% | 8 |
| shinh.Entangled 0.3 | 4.2 | 12.5% | 25 |
| gh.micro.Gruweltje 0.7 | 4.3 | 12.0% | 17 |
| apc.Colossus2 0.17 | 6.0 | 8.3% | 2 |
| stelo.Wang 1.0 | 7.0 | 6.9% | 1 |
| ayk.WallHugger 1.0 | 8.3 | 5.3% | 0 |
| maribo.FollowFire 1 | 8.7 | 5.2% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.5 | 66.0 | 3 / 35 | 4210 |
| 2 | 4 | 59.7 | 65.4 | 2 / 35 | 3874 |
| 3 | 3 | 60.9 | 67.6 | 2 / 35 | 4249 |
| 4 | 4 | 60.8 | 66.0 | 1 / 35 | 4159 |
| 5 | 3 | 58.5 | 60.0 | 0 / 35 | 4050 |
| 6 | 4 | 58.7 | 61.0 | 0 / 35 | 3892 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 24 | 8% |
| ags.Glacier 0.2.11 | 22 | 9% |
| shinh.Entangled 0.3 | 9 | 33% |
| gh.micro.Gruweltje 0.7 | 2 | 0% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 202 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 69 | 34% | 71 |
| ags.Glacier 0.2.11 | 67 | 33% | 69 |
| shinh.Entangled 0.3 | 21 | 10% | 24 |
| gh.micro.Gruweltje 0.7 | 21 | 10% | 21 |
| maribo.FollowFire 1 | 10 | 5% | 10 |
| stelo.Wang 1.0 | 7 | 3% | 7 |
| apc.Colossus2 0.17 | 6 | 3% | 7 |
| ayk.WallHugger 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 76.9 | 119 / 210 | 3.08 | 17.3% | 30663 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.3% | 119 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.7% | 23 |
| catcat20.shape.Theta 0.018 | 2.8 | 12.1% | 42 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.5 | 10.3% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 5.7 | 9.5% | 3 |
| co.edu.usb.rc.LidisTron 1.0 | 6.0 | 9.5% | 5 |
| sanyi.mikrobi.Roberto 1.0 | 6.2 | 9.2% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 8.5% | 11 |
| pa.Improved 1.0 | 9.0 | 6.3% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 78.1 | 21 / 35 | 4848 |
| 2 | 1 | 66.5 | 75.9 | 21 / 35 | 5018 |
| 3 | 1 | 64.0 | 68.9 | 17 / 35 | 4956 |
| 4 | 1 | 69.0 | 85.4 | 24 / 35 | 5716 |
| 5 | 1 | 65.3 | 73.7 | 15 / 35 | 5208 |
| 6 | 1 | 66.9 | 79.4 | 21 / 35 | 4917 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 72 | 90% |
| catcat20.shape.Theta 0.018 | 37 | 49% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 83% |
| sanyi.mikrobi.Roberto 1.0 | 12 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 39 | 43% | 99 |
| catcat20.shape.Theta 0.018 | 28 | 31% | 44 |
| sanyi.mikrobi.Roberto 1.0 | 6 | 7% | 17 |
| co.edu.usb.rc.LidisTron 1.0 | 6 | 7% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 4% | 19 |
| pa.Improved 1.0 | 2 | 2% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 2% | 4 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 2% | 1 |

## Melee bench: F15

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 85.7 | 129 / 210 | 2.29 | 19.7% | 35979 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.7% | 129 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.1% | 16 |
| mld.DustBunny 3.8 | 3.0 | 12.6% | 9 |
| emp.Yngwie 1.11 | 3.3 | 12.7% | 38 |
| cb.nano.Insomnia 1.0 | 5.5 | 8.9% | 6 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.1% | 12 |
| Grystrion.TrackerWO 1.0 | 7.0 | 7.5% | 0 |
| lambdaxy.TBot 0.1 | 7.7 | 6.8% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 5.0% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 89.5 | 22 / 35 | 6348 |
| 2 | 1 | 68.3 | 81.3 | 21 / 35 | 5703 |
| 3 | 1 | 68.7 | 82.9 | 21 / 35 | 5749 |
| 4 | 1 | 69.4 | 85.1 | 23 / 35 | 5901 |
| 5 | 1 | 71.4 | 91.4 | 24 / 35 | 6210 |
| 6 | 1 | 69.2 | 84.1 | 18 / 35 | 6068 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 50 | 60% |
| mld.DustBunny 3.8 | 35 | 94% |
| kawigi.micro.Shiz 1.1 | 35 | 97% |
| cb.nano.Insomnia 1.0 | 20 | 80% |
| kawigi.robot.Girl 1.2 | 11 | 100% |
| divineomega.TrialBot 0.003 | 4 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 35 | 43% | 87 |
| mld.DustBunny 3.8 | 13 | 16% | 37 |
| cb.nano.Insomnia 1.0 | 12 | 15% | 9 |
| kawigi.micro.Shiz 1.1 | 10 | 12% | 44 |
| kawigi.robot.Girl 1.2 | 5 | 6% | 11 |
| Grystrion.TrackerWO 1.0 | 4 | 5% | 7 |
| lambdaxy.TBot 0.1 | 1 | 1% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |
| divineomega.TrialBot 0.003 | 0 | 0% | 11 |

## Melee bench: F16

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 84.2 | 65 / 210 | 2.42 | 18.6% | 35617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 18.6% | 65 |
| gh.Griezel 0.5.2 | 1.7 | 17.7% | 101 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.2% | 5 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.5% | 29 |
| tvv.nano.Polaris 1.2 | 5.3 | 8.7% | 4 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 8.6% | 2 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.4% | 1 |
| repositorio.NanoStep 1.0 | 8.5 | 5.5% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.0% | 3 |
| asd.Cthulhu 1.3 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.4 | 76.8 | 8 / 35 | 5524 |
| 2 | 1 | 69.2 | 85.4 | 12 / 35 | 6203 |
| 3 | 1 | 69.2 | 85.1 | 17 / 35 | 5770 |
| 4 | 2 | 68.2 | 85.7 | 8 / 35 | 5622 |
| 5 | 1 | 68.7 | 86.7 | 8 / 35 | 6269 |
| 6 | 1 | 69.5 | 85.7 | 12 / 35 | 6229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 101 | 22% |
| techdude.forest.FlamingForest 1.1 | 29 | 34% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 100% |
| divineomega.DivineBot 1.9.4.5 | 5 | 80% |
| bvh.fnr.Fenrir 0.36l | 4 | 75% |
| stelo.IntrinsicVolatility 1.4 | 3 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| tvv.nano.Polaris 1.2 | 3 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 1628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 90 | 62% | 118 |
| techdude.forest.FlamingForest 1.1 | 23 | 16% | 36 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 8 | 6% | 19 |
| stelo.IntrinsicVolatility 1.4 | 6 | 4% | 9 |
| bvh.fnr.Fenrir 0.36l | 6 | 4% | 7 |
| divineomega.DivineBot 1.9.4.5 | 5 | 3% | 9 |
| tvv.nano.Polaris 1.2 | 5 | 3% | 7 |
| asd.Cthulhu 1.3 | 1 | 1% | 3 |
| repositorio.NanoStep 1.0 | 1 | 1% | 2 |

## Melee bench: F17

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 84.4 | 107 / 210 | 2.40 | 18.3% | 30300 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.3% | 107 |
| oog.melee.Mercutio 1.0 | 3.0 | 12.6% | 27 |
| cx.BlestPain 1.41 | 3.3 | 12.2% | 40 |
| et.Predator 1.8 | 3.3 | 12.5% | 20 |
| nic.Nicator 2.4 | 4.7 | 11.3% | 6 |
| ahf.NanoAndrew .4 | 5.7 | 10.5% | 9 |
| maribo.melee.BMV 0.1 | 7.0 | 8.1% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 6.0% | 1 |
| tex.Longbot 0.4 | 8.7 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 81.0 | 14 / 35 | 5149 |
| 2 | 1 | 69.1 | 87.9 | 20 / 35 | 5237 |
| 3 | 1 | 67.4 | 83.8 | 21 / 35 | 4743 |
| 4 | 1 | 66.5 | 81.9 | 13 / 35 | 4657 |
| 5 | 1 | 66.9 | 78.4 | 16 / 35 | 4960 |
| 6 | 1 | 70.9 | 93.7 | 23 / 35 | 5554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 47 | 83% |
| oog.melee.Mercutio 1.0 | 43 | 67% |
| cx.BlestPain 1.41 | 32 | 22% |
| nic.Nicator 2.4 | 22 | 91% |
| ahf.NanoAndrew .4 | 10 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 1217. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 35 | 34% | 46 |
| oog.melee.Mercutio 1.0 | 26 | 25% | 53 |
| et.Predator 1.8 | 19 | 18% | 51 |
| nic.Nicator 2.4 | 11 | 11% | 31 |
| ahf.NanoAndrew .4 | 6 | 6% | 15 |
| goblin.Bender 2.4 | 3 | 3% | 4 |
| maribo.melee.BMV 0.1 | 2 | 2% | 5 |
| tex.Longbot 0.4 | 1 | 1% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 2 |

## Melee bench: F18

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 84.6 | 131 / 210 | 2.39 | 18.4% | 27764 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.4% | 131 |
| morbid.MorbidPriest 1.0 | 2.3 | 12.6% | 23 |
| agd.Mooserwirt2 2.7 | 3.0 | 11.7% | 22 |
| ratosh.Nobo 0.21 | 4.3 | 10.5% | 5 |
| uji.DBH 1.1 | 4.8 | 10.3% | 10 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.6% | 3 |
| sigterm.Sigterm 1.0 | 7.3 | 8.1% | 5 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.6% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.2 | 5.8% | 1 |
| stelo.WangRobot 1.0 | 9.7 | 5.3% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 84.8 | 22 / 35 | 4684 |
| 2 | 1 | 67.5 | 84.8 | 24 / 35 | 4507 |
| 3 | 1 | 65.2 | 77.1 | 18 / 35 | 4284 |
| 4 | 1 | 69.0 | 87.3 | 23 / 35 | 5247 |
| 5 | 1 | 66.8 | 83.2 | 19 / 35 | 4527 |
| 6 | 1 | 69.0 | 90.2 | 25 / 35 | 4515 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 38 | 82% |
| agd.Mooserwirt2 2.7 | 34 | 71% |
| uji.DBH 1.1 | 23 | 91% |
| sigterm.Sigterm 1.0 | 20 | 90% |
| spinnercat.Robovirus 2.718 | 18 | 94% |
| ratosh.Nobo 0.21 | 10 | 90% |
| stelo.WangRobot 1.0 | 6 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 80% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 676. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 23 | 29% | 59 |
| agd.Mooserwirt2 2.7 | 15 | 19% | 45 |
| ratosh.Nobo 0.21 | 12 | 15% | 23 |
| uji.DBH 1.1 | 8 | 10% | 21 |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 9% | 16 |
| sigterm.Sigterm 1.0 | 5 | 6% | 15 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 5% | 4 |
| spinnercat.Robovirus 2.718 | 3 | 4% | 18 |
| stelo.WangRobot 1.0 | 2 | 3% | 9 |

## Melee bench: F19

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 91.8 | 168 / 210 | 1.74 | 21.2% | 36698 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 21.2% | 168 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.8% | 20 |
| mld.Infinity 2.2 | 2.8 | 13.5% | 16 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.1% | 3 |
| erdnis.Rover 0.3 | 5.0 | 9.7% | 1 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.1% | 1 |
| mbh.Mbh 0.1 | 7.0 | 7.6% | 0 |
| pac.ABC 2.1 | 7.7 | 7.0% | 1 |
| pbg.R2D2 1.0 | 9.0 | 5.7% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 87.6 | 26 / 35 | 5597 |
| 2 | 1 | 72.4 | 92.4 | 28 / 35 | 6322 |
| 3 | 1 | 72.5 | 91.1 | 30 / 35 | 6730 |
| 4 | 1 | 71.3 | 92.7 | 26 / 35 | 5706 |
| 5 | 1 | 73.5 | 97.8 | 31 / 35 | 6412 |
| 6 | 1 | 71.5 | 89.2 | 27 / 35 | 5931 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 93 | 92% |
| mld.Infinity 2.2 | 63 | 90% |
| krillr.mini.JointStrike 2.0.0 | 14 | 93% |
| patson.PatsonTestBot 1.0 | 5 | 100% |
| pac.ABC 2.1 | 4 | 75% |
| erdnis.Rover 0.3 | 3 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 14 | 33% | 114 |
| mld.Infinity 2.2 | 11 | 26% | 20 |
| pac.ABC 2.1 | 6 | 14% | 8 |
| krillr.mini.JointStrike 2.0.0 | 5 | 12% | 31 |
| erdnis.Rover 0.3 | 4 | 10% | 16 |
| mbh.Mbh 0.1 | 1 | 2% | 7 |
| pbg.R2D2 1.0 | 1 | 2% | 5 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 6 |

## Melee bench: F20

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 83.8 | 105 / 210 | 2.46 | 18.8% | 33854 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.8% | 105 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.9% | 51 |
| fwb.Nine 1.0.1 | 3.2 | 11.6% | 30 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.3% | 4 |
| catcat20.Rabbit 0.001 | 4.7 | 9.6% | 15 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 7.9% | 1 |
| m3thos.mini.Eva01 0.5.5 | 7.0 | 7.9% | 3 |
| bayen.nut.Squirrel 1.615 | 7.5 | 7.3% | 2 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 6.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.5 | 21 / 35 | 6282 |
| 2 | 1 | 69.2 | 88.3 | 17 / 35 | 5716 |
| 3 | 1 | 66.4 | 77.1 | 16 / 35 | 5256 |
| 4 | 1 | 69.3 | 86.3 | 20 / 35 | 5742 |
| 5 | 1 | 66.1 | 76.8 | 14 / 35 | 5371 |
| 6 | 1 | 68.3 | 83.8 | 17 / 35 | 5487 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 81 | 63% |
| fwb.Nine 1.0.1 | 38 | 50% |
| catcat20.Rabbit 0.001 | 17 | 65% |
| nz.jdc.nano.GridFu 1.0 | 13 | 100% |
| bayen.nut.Squirrel 1.615 | 5 | 80% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 1140. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 51 | 48% | 98 |
| fwb.Nine 1.0.1 | 22 | 21% | 16 |
| catcat20.Rabbit 0.001 | 9 | 8% | 27 |
| bayen.nut.Squirrel 1.615 | 8 | 8% | 16 |
| m3thos.mini.Eva01 0.5.5 | 6 | 6% | 9 |
| nz.jdc.nano.GridFu 1.0 | 5 | 5% | 23 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 17 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 86.4 | 105 / 210 | 2.22 | 19.2% | 33345 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.2% | 105 |
| eem.EvBot v4.6.16 | 2.0 | 16.1% | 75 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.1% | 16 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.3% | 5 |
| eld.Hmm 1.0 | 5.5 | 8.6% | 9 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.0% | 1 |
| fire219.CatBot 1.0 | 7.7 | 6.3% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.1% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.9% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 85.4 | 16 / 35 | 5394 |
| 2 | 1 | 69.6 | 87.6 | 18 / 35 | 5644 |
| 3 | 1 | 68.7 | 85.7 | 15 / 35 | 5423 |
| 4 | 1 | 69.2 | 87.0 | 13 / 35 | 5645 |
| 5 | 1 | 70.7 | 89.5 | 23 / 35 | 5792 |
| 6 | 1 | 68.6 | 83.2 | 20 / 35 | 5447 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 94 | 49% |
| dummy.mini.Scimitar 1.01 | 34 | 94% |
| cf.RiO.RiOx 4.2.1 | 15 | 100% |
| eld.Hmm 1.0 | 14 | 71% |
| el.JumpShoot 0.2 | 1 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 1185. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 63 | 59% | 91 |
| dummy.mini.Scimitar 1.01 | 15 | 14% | 57 |
| cf.RiO.RiOx 4.2.1 | 7 | 7% | 15 |
| eld.Hmm 1.0 | 6 | 6% | 25 |
| PSW.Relentless 0.1 | 5 | 5% | 6 |
| el.JumpShoot 0.2 | 4 | 4% | 4 |
| oa.weak.BotherBot 0.1 | 3 | 3% | 6 |
| fire219.CatBot 1.0 | 2 | 2% | 4 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |

## Melee bench: F22

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.2 | 78 / 210 | 2.24 | 18.1% | 31204 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.1% | 78 |
| pe.SandboxDT 2.71m | 2.0 | 16.5% | 64 |
| kvk.HebusLeTroll 0.35 | 3.2 | 14.1% | 41 |
| jlm.javaDisturbance 0.59 | 3.8 | 12.5% | 22 |
| bigpete.Stewie 1.0 | 5.0 | 10.1% | 3 |
| gg.Squaraus 0.6 | 6.7 | 6.9% | 1 |
| yk.JahRoslav 1.1 | 7.2 | 7.1% | 0 |
| tad.Dalek98 0.98 | 7.3 | 6.4% | 1 |
| pbg.NinjaX 1.2 | 8.8 | 4.9% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 89.5 | 15 / 35 | 5181 |
| 2 | 1 | 68.0 | 86.3 | 13 / 35 | 5009 |
| 3 | 1 | 66.7 | 79.4 | 8 / 35 | 5147 |
| 4 | 1 | 68.7 | 87.9 | 15 / 35 | 5224 |
| 5 | 1 | 68.0 | 86.7 | 13 / 35 | 5266 |
| 6 | 1 | 68.4 | 87.3 | 14 / 35 | 5377 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 54 | 33% |
| kvk.HebusLeTroll 0.35 | 44 | 59% |
| jlm.javaDisturbance 0.59 | 32 | 66% |
| bigpete.Stewie 1.0 | 7 | 86% |
| yk.JahRoslav 1.1 | 4 | 100% |
| pbg.NinjaX 1.2 | 3 | 67% |
| gg.Squaraus 0.6 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 1048. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kvk.HebusLeTroll 0.35 | 55 | 41% | 78 |
| pe.SandboxDT 2.71m | 47 | 35% | 68 |
| jlm.javaDisturbance 0.59 | 22 | 17% | 40 |
| bigpete.Stewie 1.0 | 3 | 2% | 8 |
| yk.JahRoslav 1.1 | 3 | 2% | 8 |
| pbg.NinjaX 1.2 | 1 | 1% | 5 |
| gg.Squaraus 0.6 | 1 | 1% | 2 |
| tad.Dalek98 0.98 | 1 | 1% | 1 |

## Melee bench: F23

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 78.1 | 82 / 210 | 2.97 | 17.8% | 33225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 17.8% | 82 |
| pe.SandboxLump 1.52 | 1.7 | 17.4% | 77 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 30 |
| stelo.RamTrackSurfer 1.2 | 4.7 | 10.0% | 11 |
| stelo.AreaTargetingBot 1.1 | 5.3 | 9.7% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 9.2% | 3 |
| cw.megas.Blade 0.8 | 6.5 | 8.6% | 1 |
| sample.Walls 1.0 | 7.7 | 7.7% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.9% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 82.5 | 15 / 35 | 5597 |
| 2 | 2 | 66.5 | 74.3 | 12 / 35 | 5545 |
| 3 | 1 | 69.7 | 82.9 | 16 / 35 | 5912 |
| 4 | 2 | 66.4 | 73.7 | 13 / 35 | 5269 |
| 5 | 1 | 67.4 | 77.5 | 11 / 35 | 5542 |
| 6 | 1 | 68.0 | 78.1 | 15 / 35 | 5360 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 80 | 53% |
| cre.Karolos 0.32 | 24 | 63% |
| stelo.AreaTargetingBot 1.1 | 13 | 100% |
| stelo.RamTrackSurfer 1.2 | 8 | 75% |
| sample.Walls 1.0 | 3 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 56 | 44% | 96 |
| cre.Karolos 0.32 | 33 | 26% | 53 |
| stelo.RamTrackSurfer 1.2 | 13 | 10% | 18 |
| cw.megas.Blade 0.8 | 9 | 7% | 11 |
| stelo.AreaTargetingBot 1.1 | 7 | 5% | 17 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 4% | 8 |
| sample.Walls 1.0 | 4 | 3% | 6 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F24

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 75.2 | 50 / 210 | 3.23 | 15.3% | 24513 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 15.3% | 50 |
| florent.XSeries.X2 0.12 | 2.5 | 14.1% | 48 |
| rz.GlowBlowMelee 1.4 | 2.7 | 14.1% | 46 |
| davidalves.Phoenix 0.54 | 3.8 | 12.8% | 45 |
| pedersen.Ugluk 1.1.1 | 4.8 | 10.6% | 13 |
| oog.melee.Corsair 1.0 | 5.8 | 9.2% | 2 |
| lunchie.Lunchbox 0.93 | 7.3 | 6.9% | 1 |
| stelo.SoJNanoMelee 1.1 | 8.0 | 6.8% | 5 |
| as.FrankTheTank 1.3 | 9.0 | 5.6% | 1 |
| evd.X1 0.01 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.5 | 69.2 | 6 / 35 | 3601 |
| 2 | 1 | 64.0 | 78.7 | 9 / 35 | 3957 |
| 3 | 1 | 63.4 | 73.3 | 9 / 35 | 4480 |
| 4 | 1 | 63.9 | 75.6 | 10 / 35 | 4271 |
| 5 | 1 | 62.7 | 74.6 | 6 / 35 | 4106 |
| 6 | 1 | 64.4 | 79.7 | 10 / 35 | 4098 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 37 | 43% |
| florent.XSeries.X2 0.12 | 25 | 32% |
| davidalves.Phoenix 0.54 | 23 | 9% |
| pedersen.Ugluk 1.1.1 | 16 | 63% |
| oog.melee.Corsair 1.0 | 9 | 89% |
| stelo.SoJNanoMelee 1.1 | 6 | 83% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 50 | 31% | 56 |
| rz.GlowBlowMelee 1.4 | 40 | 25% | 58 |
| davidalves.Phoenix 0.54 | 29 | 18% | 36 |
| pedersen.Ugluk 1.1.1 | 14 | 9% | 23 |
| oog.melee.Corsair 1.0 | 10 | 6% | 18 |
| stelo.SoJNanoMelee 1.1 | 6 | 4% | 7 |
| evd.X1 0.01 | 6 | 4% | 7 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 3 |
| as.FrankTheTank 1.3 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.8 | 123 / 210 | 2.64 | 18.1% | 26256 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.1% | 123 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.7% | 20 |
| jdw.Hurricane 1.4 | 3.2 | 11.8% | 23 |
| voidious.micro.BlitzBat 1.05 | 3.3 | 11.7% | 19 |
| gre.svman4.Morfeas 1.4.1 | 5.2 | 9.5% | 10 |
| ds.Oo 2.2 | 6.2 | 9.0% | 3 |
| gjr.Cephalosporin 0.1 | 7.3 | 7.8% | 7 |
| awesomeness.Elite 1.0 | 8.0 | 7.1% | 1 |
| adt.Ar2 1.1 | 8.3 | 6.8% | 4 |
| amk.ChumbaMini 0.2 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 79.4 | 18 / 35 | 4175 |
| 2 | 1 | 69.4 | 88.3 | 28 / 35 | 4531 |
| 3 | 1 | 66.7 | 78.4 | 19 / 35 | 4540 |
| 4 | 1 | 67.6 | 84.4 | 21 / 35 | 4364 |
| 5 | 1 | 66.5 | 82.5 | 18 / 35 | 4293 |
| 6 | 1 | 66.4 | 77.8 | 19 / 35 | 4353 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 42 | 83% |
| voidious.micro.BlitzBat 1.05 | 37 | 86% |
| jdw.Hurricane 1.4 | 33 | 73% |
| gjr.Cephalosporin 0.1 | 12 | 83% |
| ds.Oo 2.2 | 8 | 100% |
| awesomeness.Elite 1.0 | 7 | 100% |
| gre.svman4.Morfeas 1.4.1 | 7 | 43% |
| adt.Ar2 1.1 | 3 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 553. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 21 | 24% | 52 |
| jdw.Hurricane 1.4 | 20 | 23% | 39 |
| voidious.micro.BlitzBat 1.05 | 16 | 18% | 44 |
| gre.svman4.Morfeas 1.4.1 | 8 | 9% | 14 |
| ds.Oo 2.2 | 5 | 6% | 18 |
| gjr.Cephalosporin 0.1 | 5 | 6% | 17 |
| awesomeness.Elite 1.0 | 5 | 6% | 11 |
| adt.Ar2 1.1 | 5 | 6% | 10 |
| amk.ChumbaMini 0.2 | 3 | 3% | 5 |

## Melee bench: F26

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 82.9 | 100 / 210 | 2.54 | 18.0% | 32490 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.0% | 100 |
| ak.Fermat 2.0 | 2.0 | 15.2% | 53 |
| lrem.Spectre 0.4.4 | 3.3 | 12.5% | 19 |
| shu.nitro.LENIN .T34 | 4.2 | 11.6% | 26 |
| js.PinBall 1.6 | 5.0 | 10.8% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 5.8 | 9.5% | 5 |
| gh.mini.GrubbmOne 1.0 | 6.7 | 9.1% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 7.0% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 82.2 | 17 / 35 | 4873 |
| 2 | 1 | 68.2 | 84.8 | 15 / 35 | 5536 |
| 3 | 1 | 68.0 | 82.2 | 19 / 35 | 5426 |
| 4 | 1 | 67.8 | 82.9 | 15 / 35 | 5337 |
| 5 | 1 | 68.9 | 85.7 | 17 / 35 | 5918 |
| 6 | 1 | 67.4 | 79.4 | 17 / 35 | 5400 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 55 | 51% |
| lrem.Spectre 0.4.4 | 31 | 68% |
| shu.nitro.LENIN .T34 | 30 | 70% |
| js.PinBall 1.6 | 13 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 9 | 89% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 75% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 46 | 41% | 76 |
| lrem.Spectre 0.4.4 | 18 | 16% | 28 |
| js.PinBall 1.6 | 17 | 15% | 30 |
| shu.nitro.LENIN .T34 | 16 | 14% | 40 |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 5% | 11 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 4% | 13 |
| gh.mini.GrubbmOne 1.0 | 3 | 3% | 10 |
| sample.SpinBot 1.0 | 2 | 2% | 2 |

## Melee bench: F27

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 72.1 | 96 / 210 | 3.51 | 16.5% | 28087 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 16.5% | 96 |
| mk.Alpha 0.2.1 | 2.2 | 13.5% | 53 |
| wee.Gem 1.8.4 | 3.3 | 12.0% | 24 |
| EH.Eagle 1.0.6 | 4.0 | 11.1% | 13 |
| sheldor.melee.nano.TestMelee 0.1 | 4.2 | 10.9% | 17 |
| techdude.kombat.FlamingKombat 1.5 | 6.5 | 9.0% | 3 |
| joe.ADinosaur 1.0 | 7.3 | 8.0% | 1 |
| throxbot.ThroxBot 0.1 | 8.0 | 7.8% | 2 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.4% | 1 |
| cs.Grudge 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.4 | 47.0 | 8 / 35 | 4164 |
| 2 | 1 | 66.1 | 78.4 | 20 / 35 | 4663 |
| 3 | 1 | 64.0 | 65.4 | 15 / 35 | 4580 |
| 4 | 1 | 67.2 | 83.5 | 18 / 35 | 4701 |
| 5 | 1 | 66.8 | 79.4 | 18 / 35 | 4865 |
| 6 | 1 | 66.9 | 79.0 | 17 / 35 | 5114 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 44 | 64% |
| wee.Gem 1.8.4 | 28 | 86% |
| EH.Eagle 1.0.6 | 21 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 74% |
| throxbot.ThroxBot 0.1 | 4 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 590. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 39 | 34% | 67 |
| sheldor.melee.nano.TestMelee 0.1 | 22 | 19% | 36 |
| techdude.kombat.FlamingKombat 1.5 | 12 | 11% | 16 |
| cs.Grudge 1.0 | 12 | 11% | 14 |
| wee.Gem 1.8.4 | 10 | 9% | 35 |
| joe.ADinosaur 1.0 | 8 | 7% | 13 |
| EH.Eagle 1.0.6 | 5 | 4% | 17 |
| throxbot.ThroxBot 0.1 | 3 | 3% | 6 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 6 |

## Melee bench: F28

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.3 | 123 / 210 | 2.23 | 18.4% | 25988 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.4% | 123 |
| kid.test.NightFox .2 | 2.0 | 14.7% | 36 |
| uji.Antique 1.0 | 3.7 | 11.3% | 19 |
| qohnil.blot.BlotBot 3.61 | 3.8 | 11.4% | 23 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.2% | 2 |
| amk.ChumbaWumba 0.3 | 6.5 | 7.9% | 2 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.8% | 4 |
| matt.advanced.Katana 1.0 | 8.0 | 6.7% | 1 |
| stelo.PianistNano 1.2 | 9.2 | 5.9% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 83.8 | 21 / 35 | 4371 |
| 2 | 1 | 69.1 | 91.1 | 20 / 35 | 4610 |
| 3 | 1 | 65.5 | 79.7 | 18 / 35 | 4277 |
| 4 | 1 | 68.7 | 88.6 | 24 / 35 | 4352 |
| 5 | 1 | 68.0 | 88.9 | 23 / 35 | 3906 |
| 6 | 1 | 67.2 | 86.0 | 17 / 35 | 4472 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 76 | 79% |
| uji.Antique 1.0 | 42 | 88% |
| qohnil.blot.BlotBot 3.61 | 21 | 33% |
| amk.ChumbaWumba 0.3 | 8 | 100% |
| pfvicm.Sobieski 7.2.3b | 6 | 100% |
| ahr.ice.Ice 1.0.2 | 3 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 24 | 27% | 71 |
| qohnil.blot.BlotBot 3.61 | 20 | 23% | 31 |
| uji.Antique 1.0 | 17 | 19% | 53 |
| pfvicm.Sobieski 7.2.3b | 12 | 14% | 20 |
| amk.ChumbaWumba 0.3 | 8 | 9% | 15 |
| stelo.Lifestealer 1.0 | 3 | 3% | 6 |
| stelo.PianistNano 1.2 | 2 | 2% | 3 |
| ahr.ice.Ice 1.0.2 | 1 | 1% | 5 |
| matt.advanced.Katana 1.0 | 1 | 1% | 5 |

## Melee bench: F29

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 79.6 | 68 / 210 | 2.83 | 17.1% | 27149 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 17.1% | 68 |
| deewiant.Anomaly 0.2 | 1.8 | 15.9% | 73 |
| zyx.mega.YersiniaPestis 3.1 | 3.0 | 14.3% | 52 |
| myl.micro.Troodon 1.10 | 3.8 | 12.4% | 7 |
| jok.PheonixM 0.1.2 | 5.0 | 10.2% | 4 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.3% | 0 |
| DBall.Anarchy 0.1 | 7.7 | 6.1% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 5.8% | 0 |
| ap.Frederick 1.1 | 8.8 | 5.3% | 1 |
| jangs.ns51 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 71.1 | 8 / 35 | 4124 |
| 2 | 1 | 65.0 | 75.9 | 9 / 35 | 4379 |
| 3 | 1 | 69.1 | 90.5 | 13 / 35 | 4791 |
| 4 | 2 | 65.1 | 75.2 | 12 / 35 | 4298 |
| 5 | 1 | 67.6 | 81.6 | 13 / 35 | 4646 |
| 6 | 1 | 68.3 | 83.5 | 13 / 35 | 4911 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 67 | 39% |
| zyx.mega.YersiniaPestis 3.1 | 32 | 28% |
| myl.micro.Troodon 1.10 | 22 | 100% |
| jok.PheonixM 0.1.2 | 5 | 100% |
| DBall.Anarchy 0.1 | 4 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 1013. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 73 | 51% | 102 |
| zyx.mega.YersiniaPestis 3.1 | 43 | 30% | 54 |
| myl.micro.Troodon 1.10 | 10 | 7% | 28 |
| jok.PheonixM 0.1.2 | 7 | 5% | 12 |
| ph.melee.ArcherME 0.3 | 5 | 4% | 5 |
| DBall.Anarchy 0.1 | 4 | 3% | 8 |

## Melee bench: F30

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 58.2 | 30 / 210 | 4.76 | 12.5% | 23787 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.3 | 14.7% | 65 |
| darkcanuck.B26354 1.06 | 2.7 | 13.6% | 43 |
| oog.melee.Capulet 1.2 | 2.8 | 13.0% | 34 |
| hadur117.micro.Saor 0.2 | 3.7 | 12.5% | 30 |
| stelo.PastFuture 2.3.2 | 4.5 | 11.8% | 22 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.3% | 9 |
| ntc.Opposite 1.5 | 7.5 | 8.1% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 7.2% | 2 |
| tripphippy.Alice 1.1 | 8.5 | 6.9% | 4 |
| GarmBox.Anger 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.0 | 55.2 | 5 / 35 | 3713 |
| 2 | 4 | 59.5 | 61.6 | 6 / 35 | 4152 |
| 3 | 3 | 58.7 | 58.7 | 6 / 35 | 4174 |
| 4 | 4 | 58.3 | 61.3 | 3 / 35 | 3913 |
| 5 | 5 | 53.9 | 48.6 | 3 / 35 | 3665 |
| 6 | 2 | 60.1 | 63.8 | 7 / 35 | 4170 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 20 | 30% |
| darkcanuck.B26354 1.06 | 16 | 44% |
| stelo.PastFuture 2.3.2 | 13 | 54% |
| oog.melee.Capulet 1.2 | 12 | 67% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |
| intruder.PrairieWolf 2.61 | 1 | 0% |
| tripphippy.Alice 1.1 | 1 | 0% |

Hadur died in 181 of 210 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 50 | 28% | 54 |
| oog.melee.Capulet 1.2 | 37 | 20% | 46 |
| darkcanuck.B26354 1.06 | 35 | 19% | 41 |
| stelo.PastFuture 2.3.2 | 17 | 9% | 23 |
| intruder.PrairieWolf 2.61 | 12 | 7% | 15 |
| ntc.Opposite 1.5 | 10 | 6% | 11 |
| tripphippy.Alice 1.1 | 10 | 6% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 7 | 4% | 7 |
| GarmBox.Anger 1.0 | 3 | 2% | 3 |

## Melee bench: F31

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 70.8 | 31 / 210 | 3.62 | 14.1% | 21903 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.4% | 112 |
| hadur117.micro.Saor 0.2 | 2.3 | 14.1% | 31 |
| gh.mini.Griezel 0.2 | 2.7 | 13.3% | 44 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.0% | 9 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 10.9% | 8 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.4% | 2 |
| fm.mammillarias 1.3 | 7.7 | 6.0% | 0 |
| timmit.nano.TimDog 0.33 | 7.7 | 6.8% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.4% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 74.9 | 8 / 35 | 3640 |
| 2 | 2 | 61.6 | 72.1 | 5 / 35 | 3464 |
| 3 | 3 | 60.9 | 69.5 | 3 / 35 | 3915 |
| 4 | 2 | 62.1 | 71.1 | 6 / 35 | 3716 |
| 5 | 2 | 62.5 | 74.9 | 6 / 35 | 3827 |
| 6 | 3 | 58.5 | 62.5 | 3 / 35 | 3341 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 38 | 13% |
| gh.mini.Griezel 0.2 | 23 | 13% |
| spinnercat.micro.Tyger 0.1 | 15 | 93% |
| d414.nano.Quantum 1.0.0 | 7 | 86% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 96 | 53% | 106 |
| gh.mini.Griezel 0.2 | 39 | 22% | 42 |
| spinnercat.micro.Tyger 0.1 | 10 | 6% | 18 |
| gh.nano.Grofvuil 0.2 | 10 | 6% | 13 |
| d414.nano.Quantum 1.0.0 | 8 | 4% | 12 |
| fm.mammillarias 1.3 | 8 | 4% | 9 |
| timmit.nano.TimDog 0.33 | 6 | 3% | 8 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 0 |

## Melee bench: F32

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 81.1 | 92 / 210 | 2.70 | 17.5% | 30378 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 17.5% | 92 |
| kawigi.sbf.FloodHT 0.9.2 | 1.8 | 15.7% | 71 |
| apc.botM 3.0 | 3.3 | 11.2% | 18 |
| vjik.UnViolation 1.1 | 4.0 | 10.7% | 17 |
| lxx.ConceptA 0.8 | 4.8 | 10.0% | 3 |
| bayen.UbaMicro 1.4 | 6.5 | 8.4% | 3 |
| panzer.Panzer 0.2 | 7.0 | 8.0% | 1 |
| yk.JahMicro 1.0 | 7.8 | 7.1% | 4 |
| conscience.Electron 1.3g | 9.0 | 6.0% | 0 |
| donjezza.Jezza 1.0 | 9.5 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 78.1 | 17 / 35 | 5091 |
| 2 | 1 | 66.5 | 82.5 | 15 / 35 | 4939 |
| 3 | 1 | 65.4 | 79.0 | 16 / 35 | 4978 |
| 4 | 2 | 66.3 | 81.0 | 14 / 35 | 4964 |
| 5 | 1 | 67.8 | 86.7 | 14 / 35 | 5525 |
| 6 | 1 | 66.1 | 79.0 | 16 / 35 | 4881 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 78 | 37% |
| apc.botM 3.0 | 19 | 74% |
| vjik.UnViolation 1.1 | 16 | 69% |
| lxx.ConceptA 0.8 | 15 | 100% |
| panzer.Panzer 0.2 | 6 | 100% |
| yk.JahMicro 1.0 | 6 | 100% |
| bayen.UbaMicro 1.4 | 6 | 100% |
| donjezza.Jezza 1.0 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 60 | 51% | 93 |
| lxx.ConceptA 0.8 | 14 | 12% | 20 |
| vjik.UnViolation 1.1 | 12 | 10% | 32 |
| apc.botM 3.0 | 11 | 9% | 25 |
| conscience.Electron 1.3g | 9 | 8% | 9 |
| bayen.UbaMicro 1.4 | 4 | 3% | 11 |
| panzer.Panzer 0.2 | 4 | 3% | 5 |
| yk.JahMicro 1.0 | 2 | 2% | 9 |
| donjezza.Jezza 1.0 | 2 | 2% | 4 |

## Melee bench: F33

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 78.6 | 93 / 210 | 2.93 | 17.7% | 30633 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 17.7% | 93 |
| maribo.Quester 0.3 | 1.7 | 16.6% | 64 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.2% | 15 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 10.7% | 16 |
| labg.Cataclysm 2.05 | 5.0 | 10.1% | 12 |
| baal.nano.N 1.42 | 5.8 | 8.9% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.5% | 6 |
| sanja.First 0.1 | 8.5 | 5.6% | 2 |
| zyx.micro.Ant 1.1 | 8.5 | 5.6% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 4.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 84.1 | 18 / 35 | 5585 |
| 2 | 1 | 67.3 | 75.2 | 18 / 35 | 5320 |
| 3 | 2 | 66.1 | 74.6 | 16 / 35 | 5067 |
| 4 | 2 | 64.2 | 69.5 | 11 / 35 | 4677 |
| 5 | 1 | 69.5 | 88.6 | 21 / 35 | 5068 |
| 6 | 1 | 66.1 | 79.4 | 9 / 35 | 4916 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 61 | 62% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 90% |
| gre.svman4.Leonidas 1.3.2 | 22 | 73% |
| labg.Cataclysm 2.05 | 7 | 57% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 56 | 47% | 91 |
| gre.svman4.Leonidas 1.3.2 | 15 | 13% | 30 |
| labg.Cataclysm 2.05 | 13 | 11% | 17 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 10% | 40 |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 7% | 11 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 7 | 6% | 8 |
| zyx.micro.Ant 1.1 | 4 | 3% | 6 |
| baal.nano.N 1.42 | 2 | 2% | 4 |
| sanja.First 0.1 | 1 | 1% | 3 |

## Melee bench: F34

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 76.5 | 36 / 210 | 3.12 | 16.0% | 29370 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.5 | 17.1% | 66 |
| stelo.Spread 0.9 | 2.2 | 16.2% | 76 |
| hadur117.micro.Saor 0.2 | 2.3 | 16.0% | 36 |
| jcs.Seth 1.8 | 4.5 | 11.1% | 18 |
| tcf.Reach 3 | 4.7 | 10.8% | 8 |
| cli.Dancer 1.1 | 5.8 | 9.8% | 6 |
| ratosh.Wesco 1.4 | 7.0 | 6.8% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.4% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.8% | 0 |
| sample.RamFire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 77.5 | 6 / 35 | 4728 |
| 2 | 2 | 65.9 | 76.5 | 6 / 35 | 5197 |
| 3 | 2 | 65.6 | 79.7 | 6 / 35 | 4820 |
| 4 | 3 | 66.0 | 77.8 | 5 / 35 | 4886 |
| 5 | 3 | 64.1 | 70.2 | 7 / 35 | 4903 |
| 6 | 2 | 65.7 | 77.1 | 6 / 35 | 4836 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 44 | 36% |
| kid.Gladiator .7.2 | 36 | 25% |
| jcs.Seth 1.8 | 11 | 64% |
| tcf.Reach 3 | 5 | 20% |
| cli.Dancer 1.1 | 2 | 0% |
| ratosh.Wesco 1.4 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 969. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 67 | 38% | 78 |
| kid.Gladiator .7.2 | 64 | 37% | 74 |
| tcf.Reach 3 | 19 | 11% | 20 |
| jcs.Seth 1.8 | 12 | 7% | 22 |
| cli.Dancer 1.1 | 6 | 3% | 7 |
| ratosh.Wesco 1.4 | 4 | 2% | 6 |
| sample.RamFire 1.0 | 2 | 1% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |

## Melee bench: F35

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 67.9 | 14 / 210 | 3.89 | 13.2% | 20518 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.8% | 154 |
| hadur117.micro.Saor 0.2 | 2.7 | 13.2% | 14 |
| gh.mini.Gruwel 0.9 | 3.0 | 13.4% | 25 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.5 | 12.5% | 10 |
| rz.HawkOnFire 0.1 | 4.8 | 11.4% | 5 |
| wit.Chuliath 1.0 | 6.3 | 7.3% | 2 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.2 | 5.7% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.3 | 61.9 | 0 / 35 | 3187 |
| 2 | 3 | 61.8 | 69.8 | 4 / 35 | 3616 |
| 3 | 3 | 59.4 | 64.8 | 2 / 35 | 3545 |
| 4 | 2 | 60.0 | 69.2 | 2 / 35 | 3369 |
| 5 | 2 | 62.0 | 73.0 | 2 / 35 | 3661 |
| 6 | 2 | 60.1 | 68.9 | 4 / 35 | 3140 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 33 | 3% |
| gh.mini.Gruwel 0.9 | 20 | 25% |
| dmh.robocode.robot.BlackDeath 9.2 | 4 | 100% |
| rz.HawkOnFire 0.1 | 3 | 67% |
| myl.nano.KomoriNinja 1.1 | 2 | 100% |
| wit.Chuliath 1.0 | 1 | 0% |

Hadur died in 196 of 210 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 104 | 53% | 105 |
| gh.mini.Gruwel 0.9 | 33 | 17% | 38 |
| dmh.robocode.robot.BlackDeath 9.2 | 21 | 11% | 24 |
| rz.HawkOnFire 0.1 | 15 | 8% | 18 |
| stelo.MyAgileRobot 0.2 | 8 | 4% | 8 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6 | 3% | 6 |
| wit.Chuliath 1.0 | 4 | 2% | 4 |
| dans.Cinnamon 1.2 | 3 | 2% | 3 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 4 |

## Melee bench: F36

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.5 | 155 / 210 | 1.86 | 20.8% | 34425 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 20.8% | 155 |
| alpha.RainingFire 1.0 | 2.5 | 12.2% | 20 |
| bzdp.Pansy 2.1 | 2.8 | 11.8% | 12 |
| mz.Cork 0.1 | 4.5 | 10.5% | 7 |
| bvh.micro.Freya 0.3 | 4.8 | 10.0% | 7 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.2% | 2 |
| bvh.mini.Fenrir 0.39 | 6.3 | 8.9% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 6.4% | 1 |
| dl.BetterWalls 1.0 | 9.2 | 5.8% | 1 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.4% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.5 | 26 / 35 | 5670 |
| 2 | 1 | 69.5 | 84.1 | 24 / 35 | 5623 |
| 3 | 1 | 72.4 | 96.2 | 30 / 35 | 5895 |
| 4 | 1 | 71.2 | 91.4 | 26 / 35 | 5908 |
| 5 | 1 | 71.0 | 93.3 | 25 / 35 | 5458 |
| 6 | 1 | 70.2 | 87.3 | 24 / 35 | 5871 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 45 | 91% |
| bvh.micro.Freya 0.3 | 34 | 94% |
| alpha.RainingFire 1.0 | 33 | 76% |
| mz.Cork 0.1 | 24 | 92% |
| bvh.mini.Fenrir 0.39 | 16 | 100% |
| m3thos.Eva02 0.7.1 | 13 | 92% |
| sample.MyFirstRobot 1.0 | 7 | 86% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 21 | 38% | 41 |
| mz.Cork 0.1 | 8 | 14% | 28 |
| bvh.micro.Freya 0.3 | 7 | 13% | 27 |
| dl.BetterWalls 1.0 | 7 | 13% | 14 |
| bzdp.Pansy 2.1 | 6 | 11% | 62 |
| sample.MyFirstRobot 1.0 | 3 | 5% | 6 |
| bvh.mini.Fenrir 0.39 | 2 | 4% | 11 |
| m3thos.Eva02 0.7.1 | 1 | 2% | 17 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 4 |

## Melee bench: F37

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 80.2 | 134 / 210 | 2.79 | 17.8% | 30740 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.8% | 134 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.2 | 10.9% | 12 |
| EBBU.Sim2 1.02 | 3.5 | 10.6% | 9 |
| germ.TheMind .2 | 4.2 | 10.1% | 16 |
| agrach.Dalek 1.0 | 4.3 | 9.9% | 11 |
| stelo.UntouchableNano 1.3 | 6.5 | 8.8% | 15 |
| lmk.ACPFinal 0.1 | 6.7 | 8.7% | 4 |
| mb.Beast 0.1 | 8.2 | 8.0% | 6 |
| skm.Ryubot 1.0 | 8.7 | 7.5% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 8.8 | 7.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 74.3 | 21 / 35 | 4861 |
| 2 | 1 | 66.2 | 80.3 | 21 / 35 | 5179 |
| 3 | 1 | 67.3 | 82.9 | 24 / 35 | 5035 |
| 4 | 1 | 65.5 | 78.4 | 18 / 35 | 5322 |
| 5 | 1 | 66.5 | 81.6 | 26 / 35 | 4852 |
| 6 | 1 | 67.6 | 83.5 | 24 / 35 | 5491 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 31 | 84% |
| EBBU.Sim2 1.02 | 23 | 87% |
| com.syncleus.robocode.Dreadnaught 0.1 | 21 | 90% |
| skm.Ryubot 1.0 | 19 | 95% |
| agrach.Dalek 1.0 | 16 | 94% |
| stelo.UntouchableNano 1.3 | 16 | 88% |
| mb.Beast 0.1 | 12 | 100% |
| lmk.ACPFinal 0.1 | 10 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 330. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 18 | 24% | 41 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 22% | 21 |
| com.syncleus.robocode.Dreadnaught 0.1 | 10 | 13% | 37 |
| EBBU.Sim2 1.02 | 8 | 11% | 28 |
| stelo.UntouchableNano 1.3 | 8 | 11% | 16 |
| germ.TheMind .2 | 7 | 9% | 24 |
| mb.Beast 0.1 | 4 | 5% | 24 |
| lmk.ACPFinal 0.1 | 3 | 4% | 9 |
| skm.Ryubot 1.0 | 1 | 1% | 7 |

## Melee bench: F38

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 73.1 | 56 / 210 | 3.42 | 15.4% | 26903 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.2 | 16.3% | 92 |
| hadur117.micro.Saor 0.2 | 2.0 | 15.4% | 56 |
| bvh.mini.Freya 0.55 | 3.3 | 12.5% | 14 |
| bts.mega.Gnarly 1.4 | 3.8 | 11.7% | 25 |
| cs.Wren 1.0 | 5.0 | 10.8% | 7 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.2 | 8.9% | 6 |
| kdf.KoulDestroyer 1.0 | 6.7 | 9.2% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.3% | 1 |
| matt.UnderDark3 2.4.34 | 8.8 | 4.9% | 0 |
| bzdp.BoxCar 2.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 70.8 | 7 / 35 | 4051 |
| 2 | 2 | 64.4 | 74.9 | 11 / 35 | 4567 |
| 3 | 3 | 61.3 | 64.8 | 7 / 35 | 4419 |
| 4 | 2 | 63.3 | 73.0 | 6 / 35 | 4666 |
| 5 | 1 | 66.2 | 81.3 | 15 / 35 | 4673 |
| 6 | 2 | 63.7 | 74.0 | 10 / 35 | 4527 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 48 | 17% |
| bts.mega.Gnarly 1.4 | 19 | 42% |
| bvh.mini.Freya 0.55 | 19 | 68% |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 100% |
| cs.Wren 1.0 | 11 | 100% |
| kdf.KoulDestroyer 1.0 | 2 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 77 | 50% | 93 |
| bts.mega.Gnarly 1.4 | 23 | 15% | 30 |
| bvh.mini.Freya 0.55 | 23 | 15% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 8% | 27 |
| kdf.KoulDestroyer 1.0 | 7 | 5% | 7 |
| cs.Wren 1.0 | 6 | 4% | 15 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 3% | 6 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 2 |

## Melee bench: F39

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 77.9 | 64 / 210 | 2.99 | 16.8% | 30879 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 16.8% | 64 |
| bvh.fry.Freya 0.82 | 2.0 | 14.9% | 27 |
| az.Ololobot 0.2.4 | 3.0 | 13.1% | 72 |
| catcat20.Lambda 0.024 | 4.2 | 11.3% | 30 |
| gimp.GimpBot 0.1 | 6.2 | 8.5% | 5 |
| apollokidd.ApolloKidd 0.9 | 6.3 | 8.1% | 0 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.4% | 3 |
| stelo.SoRobotNanoMelee 1.2 | 7.0 | 7.7% | 8 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.5 | 5.8% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 83.8 | 14 / 35 | 4830 |
| 2 | 1 | 66.0 | 79.7 | 11 / 35 | 5432 |
| 3 | 1 | 66.6 | 81.6 | 8 / 35 | 5453 |
| 4 | 1 | 65.5 | 76.5 | 12 / 35 | 5110 |
| 5 | 1 | 64.3 | 73.0 | 9 / 35 | 5118 |
| 6 | 1 | 63.4 | 72.7 | 10 / 35 | 4936 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 42 | 19% |
| bvh.fry.Freya 0.82 | 42 | 76% |
| catcat20.Lambda 0.024 | 29 | 41% |
| stelo.SoRobotNanoMelee 1.2 | 10 | 60% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| gimp.GimpBot 0.1 | 3 | 67% |
| winamp32.micro.MicroMacro 1.0 | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 982. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 50 | 34% | 63 |
| catcat20.Lambda 0.024 | 34 | 23% | 39 |
| bvh.fry.Freya 0.82 | 29 | 20% | 55 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 8% | 17 |
| apollokidd.ApolloKidd 0.9 | 9 | 6% | 12 |
| whitesquare.robots.SkynetAdvanced 1.1 | 5 | 3% | 7 |
| winamp32.micro.MicroMacro 1.0 | 4 | 3% | 6 |
| gimp.GimpBot 0.1 | 3 | 2% | 8 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 3 |

## Melee bench: F40

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 82.7 | 117 / 210 | 2.56 | 18.4% | 29633 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.4% | 117 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.8% | 50 |
| kano.gamma.KanoGamma 1.8 | 3.5 | 11.9% | 17 |
| mz.AntiGrav 1.0 | 4.2 | 10.7% | 6 |
| Polkwane.SmashMelee 1.0 | 4.3 | 10.6% | 7 |
| stelo.Randomness 1.0 | 6.3 | 8.9% | 5 |
| alpha.BlackIce 1.0 | 6.8 | 8.2% | 4 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.4% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.9% | 2 |
| sample.Corners 1.0 | 9.8 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 76.5 | 14 / 35 | 5196 |
| 2 | 1 | 69.1 | 85.4 | 22 / 35 | 5050 |
| 3 | 1 | 68.9 | 85.4 | 22 / 35 | 5177 |
| 4 | 1 | 68.8 | 86.0 | 21 / 35 | 5055 |
| 5 | 1 | 67.6 | 84.1 | 17 / 35 | 4755 |
| 6 | 1 | 66.9 | 78.7 | 21 / 35 | 4400 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 66 | 62% |
| kano.gamma.KanoGamma 1.8 | 26 | 92% |
| Polkwane.SmashMelee 1.0 | 20 | 90% |
| mz.AntiGrav 1.0 | 17 | 100% |
| stelo.Randomness 1.0 | 9 | 89% |
| alpha.BlackIce 1.0 | 7 | 86% |
| sample.Corners 1.0 | 2 | 50% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 48 | 52% | 74 |
| kano.gamma.KanoGamma 1.8 | 13 | 14% | 42 |
| alpha.BlackIce 1.0 | 9 | 10% | 13 |
| Polkwane.SmashMelee 1.0 | 8 | 9% | 23 |
| mz.AntiGrav 1.0 | 4 | 4% | 24 |
| testantiswapgun.AntiSwap 1.0 | 4 | 4% | 7 |
| stelo.Randomness 1.0 | 3 | 3% | 20 |
| amk.superstrike.SuperStrike 0.3 | 3 | 3% | 4 |
| sample.Corners 1.0 | 1 | 1% | 2 |

## Melee bench: F41

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 73.9 | 72 / 210 | 3.35 | 16.0% | 27544 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.3 | 16.2% | 93 |
| hadur117.micro.Saor 0.2 | 1.7 | 16.0% | 72 |
| ary.Swarm 1.1 | 3.2 | 12.9% | 13 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.5% | 18 |
| simonton.nano.MeleeSeed 1.8 | 5.3 | 10.4% | 8 |
| shrub.Silver v048 | 5.7 | 10.1% | 3 |
| zyx.nano.Ant 1.1 | 7.0 | 7.3% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 6.0% | 2 |
| stelo.Mirror 1.1 | 8.8 | 5.5% | 1 |
| acogdev.alpha 0.2 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 78.7 | 13 / 35 | 5051 |
| 2 | 1 | 66.1 | 74.9 | 14 / 35 | 4880 |
| 3 | 2 | 64.4 | 75.9 | 11 / 35 | 4059 |
| 4 | 1 | 64.5 | 74.3 | 11 / 35 | 4591 |
| 5 | 2 | 63.2 | 68.9 | 11 / 35 | 4318 |
| 6 | 2 | 63.8 | 70.5 | 12 / 35 | 4645 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 53 | 36% |
| lessonz.robocode.Oz 0.5.0 | 25 | 80% |
| ary.Swarm 1.1 | 20 | 85% |
| simonton.nano.MeleeSeed 1.8 | 12 | 100% |
| shrub.Silver v048 | 3 | 100% |
| jsal.Jsalbot 1.0 | 1 | 0% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 71 | 51% | 99 |
| ary.Swarm 1.1 | 19 | 14% | 32 |
| simonton.nano.MeleeSeed 1.8 | 17 | 12% | 30 |
| lessonz.robocode.Oz 0.5.0 | 8 | 6% | 18 |
| shrub.Silver v048 | 6 | 4% | 11 |
| zyx.nano.Ant 1.1 | 6 | 4% | 8 |
| stelo.Mirror 1.1 | 4 | 3% | 5 |
| acogdev.alpha 0.2 | 4 | 3% | 4 |
| jsal.Jsalbot 1.0 | 3 | 2% | 3 |

## Melee bench: F42

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 75.8 | 59 / 210 | 3.18 | 16.1% | 29386 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.5 | 16.1% | 59 |
| wompi.Wallaby 5.1 | 1.5 | 16.3% | 82 |
| maribo.mini.MiniQuester 0.1 | 3.2 | 13.6% | 26 |
| ara.Shera 0.88 | 3.8 | 12.4% | 32 |
| amz.NanoClone 1.41 | 5.0 | 9.6% | 3 |
| dsw.StaticD 1.0 | 6.5 | 7.8% | 8 |
| maribo.IotaCT 1.1 | 6.5 | 7.6% | 0 |
| stelo.MirrorMicro 1.0 | 8.2 | 6.3% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 77.1 | 11 / 35 | 5324 |
| 2 | 1 | 64.9 | 79.7 | 9 / 35 | 4947 |
| 3 | 2 | 63.4 | 74.6 | 7 / 35 | 4736 |
| 4 | 2 | 63.5 | 71.4 | 8 / 35 | 4858 |
| 5 | 2 | 64.3 | 76.5 | 10 / 35 | 4456 |
| 6 | 1 | 65.3 | 75.6 | 14 / 35 | 5065 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 47 | 30% |
| maribo.mini.MiniQuester 0.1 | 28 | 68% |
| ara.Shera 0.88 | 24 | 79% |
| dsw.StaticD 1.0 | 7 | 71% |
| amz.NanoClone 1.41 | 2 | 50% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 74 | 49% | 88 |
| ara.Shera 0.88 | 30 | 20% | 49 |
| maribo.mini.MiniQuester 0.1 | 23 | 15% | 39 |
| dsw.StaticD 1.0 | 9 | 6% | 15 |
| amz.NanoClone 1.41 | 5 | 3% | 8 |
| mme.NikeEnhanced 2.0 | 4 | 3% | 5 |
| stelo.MirrorMicro 1.0 | 3 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 1% | 2 |
| maribo.IotaCT 1.1 | 1 | 1% | 1 |

## Melee bench: F43

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 69.0 | 12 / 210 | 3.79 | 13.5% | 21972 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.5% | 163 |
| hadur117.micro.Saor 0.2 | 2.2 | 13.5% | 12 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.3% | 20 |
| wcsv.melee.EngineerMelee 0.1 | 4.0 | 11.4% | 6 |
| dummy.micro.Sparrow 2.5 | 4.8 | 10.9% | 7 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.9% | 0 |
| jab.DiamondStealer 5 | 7.5 | 7.8% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.8% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 70.2 | 3 / 35 | 3544 |
| 2 | 3 | 61.4 | 67.9 | 1 / 35 | 3567 |
| 3 | 2 | 63.4 | 71.7 | 3 / 35 | 4162 |
| 4 | 2 | 60.8 | 67.3 | 2 / 35 | 3236 |
| 5 | 2 | 61.2 | 67.6 | 1 / 35 | 3618 |
| 6 | 2 | 62.3 | 69.2 | 2 / 35 | 3845 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 55 | 0% |
| brainfade.melee.Dusk 0.44 | 8 | 38% |
| dummy.micro.Sparrow 2.5 | 5 | 80% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 198 of 210 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 130 | 66% | 134 |
| dummy.micro.Sparrow 2.5 | 18 | 9% | 21 |
| brainfade.melee.Dusk 0.44 | 18 | 9% | 21 |
| wcsv.melee.EngineerMelee 0.1 | 17 | 9% | 18 |
| mz.NanoGod 2.02 | 7 | 4% | 8 |
| jab.DiamondStealer 5 | 6 | 3% | 6 |
| Krabb.akim2.Akim2 1.1b | 1 | 1% | 1 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |

## Melee bench: F44

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 79.6 | 82 / 210 | 2.83 | 17.7% | 32148 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 17.7% | 82 |
| stelo.Liblix 0.3.1 | 1.7 | 16.6% | 97 |
| tzu.TheArtOfWar 1.2 | 3.3 | 12.0% | 16 |
| wompi.Quokka 1.6 | 3.8 | 10.4% | 6 |
| jwirde.Gort 2.0 | 5.3 | 10.0% | 7 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.7 | 9.3% | 2 |
| disan.Chair 2.2.0 | 7.2 | 7.8% | 0 |
| stf.PanzerGeneral 0.1 | 7.7 | 7.0% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.9% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 76.2 | 8 / 35 | 5070 |
| 2 | 1 | 67.1 | 78.7 | 14 / 35 | 5451 |
| 3 | 1 | 68.6 | 85.4 | 15 / 35 | 5539 |
| 4 | 1 | 67.7 | 79.7 | 15 / 35 | 5711 |
| 5 | 1 | 68.9 | 87.3 | 17 / 35 | 5457 |
| 6 | 2 | 64.4 | 70.5 | 13 / 35 | 4920 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 70 | 31% |
| tzu.TheArtOfWar 1.2 | 37 | 86% |
| wompi.Quokka 1.6 | 12 | 92% |
| jwirde.Gort 2.0 | 7 | 71% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 100% |
| disan.Chair 2.2.0 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 69 | 53% | 94 |
| tzu.TheArtOfWar 1.2 | 22 | 17% | 48 |
| jwirde.Gort 2.0 | 9 | 7% | 20 |
| wompi.Quokka 1.6 | 9 | 7% | 15 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 6% | 10 |
| stf.PanzerGeneral 0.1 | 7 | 5% | 12 |
| disan.Chair 2.2.0 | 3 | 2% | 6 |
| sample.Crazy 1.0 | 1 | 1% | 2 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 2 |

## Melee bench: F45

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.6 | 78 / 210 | 2.39 | 19.0% | 34478 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.0% | 78 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.1% | 110 |
| jje.BagPuss 1.2 | 3.3 | 11.2% | 0 |
| myl.nano.Graviton 1.10 | 4.3 | 10.2% | 4 |
| sul.Lunar 1.1 | 4.5 | 10.3% | 10 |
| fm.claire 1.7 | 6.3 | 8.8% | 0 |
| hvilela.HVilela 0.9 | 7.2 | 8.4% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 7.9% | 1 |
| wit.Deep7 2.0 | 9.3 | 6.0% | 5 |
| abud.ThirdRobo 1.0 | 9.7 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 86.0 | 13 / 35 | 5800 |
| 2 | 1 | 65.1 | 75.2 | 6 / 35 | 5396 |
| 3 | 1 | 70.1 | 89.8 | 17 / 35 | 6260 |
| 4 | 1 | 69.6 | 89.2 | 14 / 35 | 5882 |
| 5 | 1 | 66.7 | 79.7 | 12 / 35 | 5340 |
| 6 | 1 | 69.5 | 87.3 | 16 / 35 | 5800 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 98 | 23% |
| sul.Lunar 1.1 | 14 | 86% |
| myl.nano.Graviton 1.10 | 13 | 92% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 91% |
| jje.BagPuss 1.2 | 11 | 100% |
| wit.Deep7 2.0 | 8 | 75% |
| fm.claire 1.7 | 4 | 100% |
| hvilela.HVilela 0.9 | 1 | 0% |

Hadur died in 132 of 210 rounds, at a mean tick of 2040. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 80 | 61% | 0 |
| jje.BagPuss 1.2 | 15 | 11% | 57 |
| sul.Lunar 1.1 | 10 | 8% | 50 |
| hvilela.HVilela 0.9 | 9 | 7% | 16 |
| wit.Deep7 2.0 | 6 | 5% | 14 |
| myl.nano.Graviton 1.10 | 5 | 4% | 37 |
| fm.claire 1.7 | 4 | 3% | 11 |
| pez.mini.ChironexFleckeri 0.5 | 3 | 2% | 17 |
| abud.ThirdRobo 1.0 | 0 | 0% | 5 |

## Melee bench: F46

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 68.0 | 25 / 210 | 3.88 | 14.0% | 25745 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 17.2% | 77 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.6% | 85 |
| hadur117.micro.Saor 0.2 | 3.0 | 14.0% | 25 |
| mz.MicroSheep 1.0 | 4.7 | 10.3% | 2 |
| cx.Princess 1.0 | 4.7 | 10.5% | 17 |
| sadoner.killer 0.2 | 5.8 | 9.0% | 1 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.2% | 3 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.2% | 0 |
| kurios.DOSexe .9a | 8.7 | 5.3% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.7 | 73.3 | 6 / 35 | 4757 |
| 2 | 3 | 63.4 | 72.4 | 3 / 35 | 4666 |
| 3 | 3 | 62.3 | 70.8 | 6 / 35 | 4124 |
| 4 | 3 | 61.8 | 69.8 | 7 / 35 | 4057 |
| 5 | 3 | 57.7 | 58.4 | 2 / 35 | 3791 |
| 6 | 3 | 60.3 | 63.5 | 1 / 35 | 4350 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 41 | 27% |
| rsalesc.melee.Medina 0.4.5 | 14 | 21% |
| mz.MicroSheep 1.0 | 5 | 80% |
| cx.Princess 1.0 | 5 | 60% |
| arthord.NanoSatanMelee Beta | 3 | 100% |
| sadoner.killer 0.2 | 2 | 50% |

Hadur died in 185 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 79 | 43% | 90 |
| rsalesc.melee.Medina 0.4.5 | 46 | 25% | 51 |
| cx.Princess 1.0 | 21 | 11% | 21 |
| mz.MicroSheep 1.0 | 12 | 6% | 18 |
| sadoner.killer 0.2 | 9 | 5% | 11 |
| arthord.NanoSatanMelee Beta | 7 | 4% | 8 |
| kurios.DOSexe .9a | 5 | 3% | 5 |
| jeremyreeder.collective.Prophet 5 | 3 | 2% | 3 |
| mbro.Detektor3 0.1.1 | 3 | 2% | 3 |

