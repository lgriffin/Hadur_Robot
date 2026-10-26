# Bench suite: suite.txt

## Melee bench: F01

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 68.8 | 15 / 280 | 3.80 | 13.8% | 33931 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.7% | 206 |
| hadur117.micro.SaorC 0.1 | 2.1 | 13.8% | 15 |
| sgp.JollyNinja 3.53 | 3.5 | 11.9% | 30 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.8 | 11.4% | 4 |
| mz.MicroGodMelee 1 | 4.9 | 10.5% | 15 |
| lorneswork.Predator 1.0 | 5.8 | 9.9% | 9 |
| adt.Ar2 1.0 | 7.0 | 7.6% | 1 |
| skm.butterfly 1.0 | 8.4 | 5.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.6 | 5.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 68.3 | 3 / 35 | 4109 |
| 2 | 2 | 62.1 | 67.9 | 4 / 35 | 4871 |
| 3 | 2 | 63.0 | 72.4 | 3 / 35 | 4437 |
| 4 | 2 | 62.3 | 72.7 | 0 / 35 | 4343 |
| 5 | 3 | 58.0 | 62.5 | 2 / 35 | 3575 |
| 6 | 2 | 61.6 | 72.1 | 1 / 35 | 4051 |
| 7 | 2 | 61.2 | 67.9 | 0 / 35 | 4114 |
| 8 | 2 | 60.7 | 67.0 | 2 / 35 | 4431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 87 | 2% |
| mz.MicroGodMelee 1 | 11 | 18% |
| sgp.JollyNinja 3.53 | 9 | 33% |
| lorneswork.Predator 1.0 | 5 | 60% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 80% |
| adt.Ar2 1.0 | 2 | 50% |

Hadur died in 265 of 280 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 149 | 56% | 153 |
| simonton.nano.WeekendObsession_Melee 1.0 | 33 | 12% | 35 |
| mz.MicroGodMelee 1 | 32 | 12% | 33 |
| sgp.JollyNinja 3.53 | 24 | 9% | 27 |
| lorneswork.Predator 1.0 | 14 | 5% | 17 |
| adt.Ar2 1.0 | 5 | 2% | 6 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 1% | 4 |
| mym.EdgeStalker 1.0 | 3 | 1% | 3 |
| skm.butterfly 1.0 | 2 | 1% | 2 |

## Melee bench: F02

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 74.0 | 78 / 280 | 3.34 | 15.8% | 36236 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.4 | 15.8% | 78 |
| pulsar.PulsarMax 0.8.9 | 1.9 | 15.1% | 83 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.9 | 13.3% | 55 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.4% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.3% | 18 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 7.9% | 1 |
| Noran.BitchingElk 0.054 | 7.0 | 8.0% | 20 |
| sch.Simone 0.3d | 7.4 | 7.7% | 11 |
| stelo.PatternRobot 1.0 | 8.8 | 6.5% | 10 |
| fullsail.SweetTea 1.1 | 9.8 | 5.0% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 80.6 | 9 / 35 | 5006 |
| 2 | 1 | 63.4 | 72.1 | 10 / 35 | 4572 |
| 3 | 2 | 60.4 | 65.1 | 9 / 35 | 3910 |
| 4 | 2 | 64.9 | 74.6 | 10 / 35 | 4740 |
| 5 | 1 | 63.9 | 74.9 | 12 / 35 | 4537 |
| 6 | 1 | 63.5 | 71.7 | 10 / 35 | 4697 |
| 7 | 1 | 64.5 | 76.5 | 11 / 35 | 4543 |
| 8 | 2 | 63.5 | 76.8 | 7 / 35 | 4231 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 60 | 37% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 40 | 43% |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 75% |
| sch.Simone 0.3d | 12 | 58% |
| Noran.BitchingElk 0.054 | 11 | 27% |
| stelo.PatternRobot 1.0 | 9 | 78% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 100% |
| fullsail.SweetTea 1.1 | 4 | 75% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 203 of 280 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 64 | 32% | 83 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 49 | 24% | 69 |
| lrem.micro.SpikeSoldier 0.4 | 21 | 10% | 25 |
| stelo.PatternRobot 1.0 | 21 | 10% | 24 |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 6% | 26 |
| Noran.BitchingElk 0.054 | 11 | 5% | 16 |
| sch.Simone 0.3d | 10 | 5% | 15 |
| fnc.bandit.Bandit 5.2.0 | 8 | 4% | 13 |
| fullsail.SweetTea 1.1 | 7 | 3% | 9 |

## Melee bench: F03

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 77.0 | 125 / 280 | 3.07 | 17.0% | 43225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.0% | 125 |
| radnor.DoctorBob 1.42 | 2.1 | 14.6% | 63 |
| vuen.Cake 2.51 | 3.3 | 13.2% | 51 |
| kawigi.nano.Lib 1.0 | 3.6 | 12.3% | 34 |
| urdos.URDOS 1.3 | 5.1 | 9.5% | 4 |
| adt.Ar1 2.1 | 6.1 | 8.2% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 7.3% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.3 | 6.4% | 2 |
| oa.weak.FlyMk1 0.1 | 8.3 | 6.7% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 78.4 | 15 / 35 | 5685 |
| 2 | 1 | 66.2 | 79.7 | 17 / 35 | 5286 |
| 3 | 1 | 67.9 | 81.3 | 20 / 35 | 5860 |
| 4 | 1 | 64.1 | 73.3 | 18 / 35 | 4761 |
| 5 | 1 | 65.2 | 73.7 | 17 / 35 | 5294 |
| 6 | 1 | 64.9 | 74.9 | 13 / 35 | 5077 |
| 7 | 1 | 65.2 | 77.5 | 11 / 35 | 5445 |
| 8 | 1 | 66.5 | 77.5 | 14 / 35 | 5817 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 61 | 77% |
| kawigi.nano.Lib 1.0 | 53 | 74% |
| radnor.DoctorBob 1.42 | 38 | 63% |
| urdos.URDOS 1.3 | 6 | 100% |
| adt.Ar1 2.1 | 4 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |

Hadur died in 155 of 280 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 50 | 32% | 74 |
| kawigi.nano.Lib 1.0 | 37 | 24% | 76 |
| vuen.Cake 2.51 | 19 | 12% | 62 |
| ghent.ArthurPanzergon 1.0.0 | 12 | 8% | 15 |
| adt.Ar1 2.1 | 10 | 6% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 6% | 10 |
| urdos.URDOS 1.3 | 8 | 5% | 14 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 6 | 4% | 9 |
| oa.weak.FlyMk1 0.1 | 3 | 2% | 4 |

## Melee bench: F04

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 71.4 | 3 / 280 | 3.57 | 14.5% | 38310 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.4% | 263 |
| hadur117.micro.SaorC 0.1 | 2.1 | 14.5% | 3 |
| apc.LeeroyJenkins2 1.0 | 2.9 | 13.4% | 8 |
| TNT.TNT 0.99.1 | 4.1 | 11.2% | 5 |
| josago.Jorgito 0.16 | 4.9 | 9.2% | 0 |
| tj.zombie1n 1.0.1 | 6.5 | 7.0% | 0 |
| css.Delitioner 0.11 | 6.6 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 8.1 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.5% | 1 |
| spin.Bugstard 0.012b | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 71.7 | 0 / 35 | 4489 |
| 2 | 3 | 62.3 | 67.9 | 0 / 35 | 4747 |
| 3 | 2 | 63.0 | 70.5 | 1 / 35 | 4628 |
| 4 | 2 | 63.9 | 73.0 | 0 / 35 | 5014 |
| 5 | 2 | 63.7 | 71.7 | 0 / 35 | 4767 |
| 6 | 2 | 64.2 | 71.4 | 0 / 35 | 5055 |
| 7 | 2 | 63.7 | 72.7 | 1 / 35 | 4759 |
| 8 | 2 | 64.0 | 72.4 | 1 / 35 | 4851 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 76 | 1% |
| TNT.TNT 0.99.1 | 2 | 50% |
| tj.zombie1n 1.0.1 | 1 | 100% |
| apc.LeeroyJenkins2 1.0 | 1 | 0% |

Hadur died in 277 of 280 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 188 | 68% | 191 |
| apc.LeeroyJenkins2 1.0 | 35 | 13% | 36 |
| josago.Jorgito 0.16 | 16 | 6% | 16 |
| TNT.TNT 0.99.1 | 14 | 5% | 15 |
| css.Delitioner 0.11 | 14 | 5% | 12 |
| tj.zombie1n 1.0.1 | 5 | 2% | 5 |
| sp.Nanos.Ember 1.1 | 3 | 1% | 3 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |

## Melee bench: F05

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 57.1 | 11 / 280 | 4.86 | 11.8% | 29767 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.4% | 159 |
| justin.DemonicRage 3.4 | 2.0 | 17.5% | 81 |
| wompi.Numbat 2.1 | 3.0 | 12.9% | 21 |
| hadur117.micro.SaorC 0.1 | 4.0 | 11.8% | 11 |
| ms.Ares 0.19 | 5.5 | 9.0% | 2 |
| axeBots.HataMoto 3.09 | 5.5 | 9.1% | 6 |
| supersample.SuperBoxBot 1.0 | 7.1 | 6.2% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.8% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.8% | 0 |
| GarmBox.Oranges 1.0 | 9.6 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.8 | 55.9 | 0 / 35 | 3872 |
| 2 | 4 | 58.0 | 59.4 | 2 / 35 | 3817 |
| 3 | 4 | 57.6 | 56.5 | 2 / 35 | 3715 |
| 4 | 4 | 56.2 | 55.6 | 0 / 35 | 3554 |
| 5 | 4 | 55.5 | 51.7 | 1 / 35 | 3670 |
| 6 | 4 | 59.5 | 63.5 | 1 / 35 | 3652 |
| 7 | 4 | 57.3 | 55.2 | 2 / 35 | 3737 |
| 8 | 4 | 58.4 | 59.4 | 3 / 35 | 3750 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 18 | 6% |
| justin.DemonicRage 3.4 | 14 | 21% |
| wompi.Numbat 2.1 | 7 | 86% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 269 of 280 rounds, at a mean tick of 599. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 90 | 33% | 92 |
| justin.DemonicRage 3.4 | 86 | 32% | 88 |
| wompi.Numbat 2.1 | 38 | 14% | 43 |
| supersample.SuperBoxBot 1.0 | 18 | 7% | 18 |
| axeBots.HataMoto 3.09 | 11 | 4% | 12 |
| ms.Ares 0.19 | 11 | 4% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 7 | 3% | 8 |
| GarmBox.Oranges 1.0 | 6 | 2% | 7 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 1 |

## Melee bench: F06

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 77.7 | 118 / 280 | 3.01 | 16.4% | 34570 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.4% | 118 |
| jekl.StoneGhost 0.7 | 2.5 | 14.2% | 35 |
| origin.SleepSiphon 1.7b | 2.8 | 13.8% | 79 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.3 | 11.4% | 26 |
| mld.Wisdom 1.0 | 4.5 | 11.2% | 7 |
| gg.Wolverine 2.0 | 6.3 | 8.6% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.9 | 7.0% | 9 |
| DBall.NUKE 0.1 | 7.9 | 6.9% | 1 |
| spinnercat.Omen 1.0 | 8.0 | 7.1% | 1 |
| sample.Fire 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 81.6 | 19 / 35 | 4278 |
| 2 | 1 | 64.1 | 74.9 | 15 / 35 | 4056 |
| 3 | 1 | 63.9 | 74.9 | 14 / 35 | 4066 |
| 4 | 1 | 64.0 | 72.4 | 14 / 35 | 4494 |
| 5 | 1 | 66.3 | 82.5 | 14 / 35 | 4558 |
| 6 | 1 | 68.4 | 87.6 | 19 / 35 | 4861 |
| 7 | 1 | 62.1 | 69.8 | 10 / 35 | 3953 |
| 8 | 1 | 64.8 | 77.5 | 13 / 35 | 4304 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 63 | 87% |
| origin.SleepSiphon 1.7b | 54 | 33% |
| pe.minimelee.SandboxMiniMelee 1.1 | 22 | 82% |
| gg.Wolverine 2.0 | 12 | 75% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 82% |
| mld.Wisdom 1.0 | 7 | 86% |
| DBall.NUKE 0.1 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 162 of 280 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 54 | 33% | 76 |
| mld.Wisdom 1.0 | 33 | 20% | 40 |
| jekl.StoneGhost 0.7 | 31 | 19% | 73 |
| pe.minimelee.SandboxMiniMelee 1.1 | 18 | 11% | 40 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 4% | 16 |
| gg.Wolverine 2.0 | 6 | 4% | 12 |
| DBall.NUKE 0.1 | 5 | 3% | 11 |
| spinnercat.Omen 1.0 | 4 | 2% | 6 |
| sample.Fire 1.0 | 4 | 2% | 4 |

## Melee bench: F07

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 79.2 | 69 / 280 | 2.87 | 17.1% | 43566 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.6 | 17.8% | 89 |
| hadur117.micro.SaorC 0.1 | 2.0 | 17.1% | 69 |
| rtk.Tachikoma 1.0 | 2.4 | 16.8% | 79 |
| franzor.Lizt 1.3.1 | 4.4 | 10.8% | 26 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 10.4% | 17 |
| lrem.micro.MoggFanatic 0.2 | 5.9 | 8.5% | 0 |
| exauge.GateKeeper 1.1.121g | 7.0 | 7.7% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.4% | 1 |
| sample.Target 1.0 | 9.4 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 9.6 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 67.3 | 77.5 | 8 / 35 | 5210 |
| 2 | 2 | 66.8 | 75.9 | 6 / 35 | 5381 |
| 3 | 3 | 66.6 | 78.4 | 7 / 35 | 5097 |
| 4 | 1 | 68.3 | 82.9 | 11 / 35 | 5446 |
| 5 | 1 | 66.7 | 74.3 | 7 / 35 | 6015 |
| 6 | 1 | 70.0 | 85.1 | 12 / 35 | 6217 |
| 7 | 3 | 66.2 | 76.5 | 9 / 35 | 4996 |
| 8 | 2 | 68.1 | 83.5 | 9 / 35 | 5204 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 84 | 42% |
| rsalesc.melee.Monk 0.3.6c | 39 | 5% |
| oog.melee.CapuletDroid 1.1 | 33 | 70% |
| franzor.Lizt 1.3.1 | 14 | 36% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |
| skm.PateranBotlock2 1.0 | 1 | 100% |

Hadur died in 212 of 280 rounds, at a mean tick of 1154. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 87 | 41% | 141 |
| rsalesc.melee.Monk 0.3.6c | 73 | 34% | 94 |
| oog.melee.CapuletDroid 1.1 | 25 | 12% | 23 |
| franzor.Lizt 1.3.1 | 14 | 7% | 3 |
| exauge.GateKeeper 1.1.121g | 6 | 3% | 7 |
| lrem.micro.MoggFanatic 0.2 | 3 | 1% | 6 |
| drd.Dreadknoght 0.9 | 2 | 1% | 4 |
| skm.PateranBotlock2 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 72.1 | 94 / 280 | 3.51 | 15.9% | 38120 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 15.9% | 94 |
| tm.Yuugao 1.0 | 2.3 | 14.1% | 75 |
| shrub.Vapour v159 | 2.8 | 13.1% | 47 |
| com.spp.robocode.MostlyHarmless 010 | 4.5 | 10.6% | 25 |
| Krabb.sliNk.Garm 0.9u | 4.8 | 10.6% | 24 |
| m3thos.Eva00 1.1 | 6.3 | 8.6% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.3% | 6 |
| qualidafial.MajorDick 1.0.1 | 8.4 | 6.9% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 5.9% | 1 |
| SHAM.WOW 1.4 | 9.4 | 6.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 74.0 | 14 / 35 | 4612 |
| 2 | 1 | 65.7 | 77.1 | 14 / 35 | 5054 |
| 3 | 1 | 63.9 | 74.9 | 10 / 35 | 4674 |
| 4 | 1 | 64.3 | 73.7 | 12 / 35 | 5006 |
| 5 | 1 | 65.0 | 77.1 | 13 / 35 | 4548 |
| 6 | 1 | 63.6 | 70.5 | 10 / 35 | 4563 |
| 7 | 1 | 61.8 | 62.9 | 12 / 35 | 4926 |
| 8 | 1 | 61.8 | 67.0 | 9 / 35 | 4737 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 65 | 35% |
| shrub.Vapour v159 | 35 | 83% |
| Krabb.sliNk.Garm 0.9u | 26 | 69% |
| com.spp.robocode.MostlyHarmless 010 | 16 | 50% |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 82% |
| m3thos.Eva00 1.1 | 4 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 187 of 280 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 67 | 36% | 99 |
| shrub.Vapour v159 | 31 | 17% | 53 |
| com.spp.robocode.MostlyHarmless 010 | 27 | 14% | 38 |
| Krabb.sliNk.Garm 0.9u | 20 | 11% | 36 |
| zyx.nano.BacillusComma 1.0 | 12 | 6% | 13 |
| m3thos.Eva00 1.1 | 8 | 4% | 11 |
| SHAM.WOW 1.4 | 8 | 4% | 8 |
| qualidafial.MajorDick 1.0.1 | 8 | 4% | 8 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 3% | 13 |

## Melee bench: F09

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 64.1 | 27 / 280 | 4.23 | 12.9% | 27632 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.4% | 167 |
| kc.micro.Figment 1.0 | 2.4 | 14.2% | 49 |
| hadur117.micro.SaorC 0.1 | 2.6 | 12.9% | 27 |
| yagami.Tidus 0.11 | 4.8 | 10.3% | 1 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.2% | 17 |
| mc2.enemy.Original 0.9 | 5.3 | 9.8% | 17 |
| dft.Calliope 5.6 | 7.0 | 7.7% | 2 |
| step.nanoPri 1.0 | 8.4 | 6.2% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.9 | 5.6% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.0 | 55.2 | 2 / 35 | 2844 |
| 2 | 3 | 58.0 | 61.9 | 2 / 35 | 3387 |
| 3 | 2 | 59.3 | 66.0 | 3 / 35 | 3481 |
| 4 | 2 | 60.0 | 65.7 | 5 / 35 | 3855 |
| 5 | 3 | 57.8 | 61.3 | 1 / 35 | 3424 |
| 6 | 3 | 59.3 | 65.7 | 4 / 35 | 3469 |
| 7 | 2 | 60.8 | 67.3 | 6 / 35 | 3636 |
| 8 | 3 | 60.5 | 69.8 | 4 / 35 | 3536 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 54 | 7% |
| kc.micro.Figment 1.0 | 29 | 31% |
| yagami.Tidus 0.11 | 7 | 100% |
| mc2.enemy.Original 0.9 | 6 | 67% |
| pedersen.Grishnakh 1.0 | 3 | 33% |
| step.nanoPri 1.0 | 1 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |
| dft.Calliope 5.6 | 1 | 0% |

Hadur died in 254 of 280 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 97 | 38% | 102 |
| kc.micro.Figment 1.0 | 79 | 31% | 87 |
| mc2.enemy.Original 0.9 | 19 | 7% | 23 |
| robar.nano.Assertive_Melee 0.2 | 16 | 6% | 17 |
| pedersen.Grishnakh 1.0 | 16 | 6% | 17 |
| yagami.Tidus 0.11 | 13 | 5% | 19 |
| dft.Calliope 5.6 | 6 | 2% | 6 |
| rdm.Dueler 0.4x | 5 | 2% | 5 |
| step.nanoPri 1.0 | 3 | 1% | 4 |

## Melee bench: F10

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 79.7 | 105 / 280 | 2.83 | 16.7% | 39390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.4 | 16.7% | 105 |
| DTF.Kludgy 1.2b | 1.6 | 16.2% | 91 |
| ne.Chimera 1.2 | 3.4 | 12.9% | 19 |
| ejb.Polaris 1.0.1 | 3.9 | 12.2% | 37 |
| vStar.RAFzilla 2.15 | 5.3 | 10.7% | 7 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.3% | 18 |
| kurios.DOSexe .9b | 7.9 | 5.6% | 2 |
| sam.Samspin 1.0 | 8.0 | 5.8% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.2% | 0 |
| donjezza.Muncho 1.0 | 9.9 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.0 | 21 / 35 | 5127 |
| 2 | 2 | 63.5 | 74.0 | 7 / 35 | 4649 |
| 3 | 1 | 64.5 | 75.9 | 12 / 35 | 4995 |
| 4 | 1 | 67.4 | 81.9 | 16 / 35 | 5109 |
| 5 | 1 | 64.3 | 78.1 | 13 / 35 | 4585 |
| 6 | 2 | 66.5 | 82.5 | 9 / 35 | 5135 |
| 7 | 1 | 65.3 | 78.7 | 13 / 35 | 4753 |
| 8 | 2 | 66.0 | 79.7 | 14 / 35 | 5037 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 72 | 36% |
| ejb.Polaris 1.0.1 | 40 | 48% |
| ne.Chimera 1.2 | 29 | 79% |
| vStar.RAFzilla 2.15 | 23 | 83% |
| tvv.micro.Antares 1.1.1 | 19 | 63% |
| donjezza.Muncho 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 177 of 280 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 80 | 45% | 101 |
| ne.Chimera 1.2 | 32 | 18% | 52 |
| ejb.Polaris 1.0.1 | 28 | 16% | 54 |
| tvv.micro.Antares 1.1.1 | 14 | 8% | 20 |
| vStar.RAFzilla 2.15 | 6 | 3% | 30 |
| kurios.DOSexe .9b | 6 | 3% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 3% | 5 |
| donjezza.Muncho 1.0 | 4 | 2% | 7 |
| sam.Samspin 1.0 | 2 | 1% | 2 |

## Melee bench: F11

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 68.7 | 43 / 280 | 3.82 | 14.2% | 32427 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 18.1% | 145 |
| hadur117.micro.SaorC 0.1 | 2.0 | 14.2% | 43 |
| cx.mini.Nimrod 0.55 | 3.3 | 11.9% | 29 |
| djc.DynaBot 0.1.1 | 4.3 | 10.8% | 20 |
| br2.MobyDickBot 1.6 | 5.4 | 9.6% | 16 |
| rdt199.Warlord 0.73 | 5.6 | 9.2% | 17 |
| uji.YellohFellah 1.0 | 6.8 | 8.2% | 11 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.1% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.7% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.6 | 68.6 | 4 / 35 | 4011 |
| 2 | 2 | 60.3 | 68.6 | 4 / 35 | 3629 |
| 3 | 2 | 57.5 | 58.7 | 2 / 35 | 3924 |
| 4 | 2 | 63.1 | 74.9 | 6 / 35 | 4251 |
| 5 | 2 | 58.4 | 61.3 | 4 / 35 | 3884 |
| 6 | 2 | 64.0 | 75.6 | 9 / 35 | 4358 |
| 7 | 2 | 61.6 | 70.2 | 6 / 35 | 4120 |
| 8 | 2 | 62.6 | 71.4 | 8 / 35 | 4250 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 79 | 14% |
| cx.mini.Nimrod 0.55 | 14 | 57% |
| djc.DynaBot 0.1.1 | 11 | 64% |
| br2.MobyDickBot 1.6 | 10 | 70% |
| uji.YellohFellah 1.0 | 9 | 44% |
| rdt199.Warlord 0.73 | 8 | 75% |

Hadur died in 237 of 280 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 126 | 53% | 138 |
| cx.mini.Nimrod 0.55 | 26 | 11% | 35 |
| rdt199.Warlord 0.73 | 24 | 10% | 30 |
| KiraNL.Chupacabra 0.4 | 18 | 8% | 18 |
| br2.MobyDickBot 1.6 | 13 | 5% | 22 |
| djc.DynaBot 0.1.1 | 10 | 4% | 15 |
| uji.YellohFellah 1.0 | 8 | 3% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 3% | 6 |
| stelo.MirrorNano 1.3 | 6 | 3% | 6 |

## Melee bench: F12

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 73.8 | 92 / 280 | 3.36 | 15.1% | 28944 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.4 | 15.1% | 92 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.5% | 58 |
| nat.PallasHawk 1.0 | 2.9 | 13.5% | 62 |
| darkcanuck.Leon 1.01 | 3.3 | 12.9% | 36 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.9% | 24 |
| jrm.Test0 1.0 | 6.6 | 8.1% | 2 |
| cs.sheldor.Talon 1.1 | 7.5 | 7.1% | 0 |
| jp.Perpy 16.0 | 7.8 | 7.0% | 1 |
| stuff.Vlad 0.1 | 8.4 | 6.4% | 0 |
| jaybot.bots.Oddball 4.0 | 9.8 | 5.6% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 74.0 | 14 / 35 | 3618 |
| 2 | 1 | 64.1 | 76.5 | 12 / 35 | 3817 |
| 3 | 2 | 62.7 | 76.2 | 12 / 35 | 3380 |
| 4 | 1 | 63.1 | 75.2 | 11 / 35 | 3824 |
| 5 | 1 | 64.9 | 79.0 | 15 / 35 | 3841 |
| 6 | 3 | 59.5 | 66.0 | 8 / 35 | 3233 |
| 7 | 1 | 62.1 | 74.0 | 10 / 35 | 3387 |
| 8 | 1 | 61.6 | 69.2 | 10 / 35 | 3844 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 47 | 51% |
| darkcanuck.Leon 1.01 | 37 | 68% |
| bts.wiki.RipCurl 0.9b | 37 | 51% |
| brainfade.melee.Genghis 0.36 | 20 | 75% |
| jaybot.bots.Oddball 4.0 | 5 | 40% |
| jp.Perpy 16.0 | 2 | 100% |
| jrm.Test0 1.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 189 of 280 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 52 | 28% | 65 |
| nat.PallasHawk 1.0 | 42 | 22% | 67 |
| darkcanuck.Leon 1.01 | 38 | 20% | 72 |
| brainfade.melee.Genghis 0.36 | 18 | 10% | 27 |
| jrm.Test0 1.0 | 16 | 8% | 19 |
| jp.Perpy 16.0 | 8 | 4% | 8 |
| jaybot.bots.Oddball 4.0 | 7 | 4% | 9 |
| cs.sheldor.Talon 1.1 | 6 | 3% | 9 |
| stuff.Vlad 0.1 | 2 | 1% | 2 |

## Melee bench: F13

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 64.2 | 9 / 280 | 4.22 | 12.6% | 30038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.4 | 17.4% | 146 |
| ags.Glacier 0.2.11 | 1.6 | 17.0% | 76 |
| hadur117.micro.SaorC 0.1 | 3.6 | 12.6% | 9 |
| shinh.Entangled 0.3 | 4.0 | 12.3% | 33 |
| gh.micro.Gruweltje 0.7 | 4.4 | 11.9% | 13 |
| apc.Colossus2 0.17 | 6.1 | 8.0% | 0 |
| stelo.Wang 1.0 | 6.9 | 7.2% | 3 |
| ayk.WallHugger 1.0 | 8.3 | 5.3% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.6 | 67.9 | 2 / 35 | 3860 |
| 2 | 4 | 58.9 | 64.8 | 1 / 35 | 3823 |
| 3 | 3 | 59.6 | 63.8 | 1 / 35 | 3666 |
| 4 | 3 | 59.3 | 65.7 | 0 / 35 | 3705 |
| 5 | 3 | 60.2 | 66.0 | 3 / 35 | 3802 |
| 6 | 4 | 59.0 | 64.8 | 1 / 35 | 3686 |
| 7 | 5 | 57.0 | 59.4 | 0 / 35 | 3393 |
| 8 | 4 | 58.7 | 61.6 | 1 / 35 | 4103 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 32 | 16% |
| ags.Glacier 0.2.11 | 25 | 8% |
| shinh.Entangled 0.3 | 6 | 0% |
| stelo.Wang 1.0 | 2 | 100% |
| gh.micro.Gruweltje 0.7 | 1 | 0% |

Hadur died in 271 of 280 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 88 | 32% | 90 |
| ags.Glacier 0.2.11 | 86 | 32% | 90 |
| shinh.Entangled 0.3 | 38 | 14% | 38 |
| gh.micro.Gruweltje 0.7 | 25 | 9% | 25 |
| stelo.Wang 1.0 | 15 | 6% | 18 |
| apc.Colossus2 0.17 | 9 | 3% | 9 |
| maribo.FollowFire 1 | 5 | 2% | 5 |
| ayk.WallHugger 1.0 | 5 | 2% | 5 |

## Melee bench: F14

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 73.1 | 126 / 280 | 3.42 | 16.3% | 39030 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 16.3% | 126 |
| simonton.micro.Sprout 1.1.3 | 1.9 | 14.9% | 57 |
| catcat20.shape.Theta 0.018 | 3.0 | 13.5% | 69 |
| sanyi.mikrobi.Roberto 1.0 | 5.0 | 10.1% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 5.1 | 10.1% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.6% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 6.3 | 8.8% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.6 | 8.1% | 10 |
| pa.Improved 1.0 | 9.0 | 6.2% | 2 |
| sample.TrackFire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 73.7 | 15 / 35 | 4713 |
| 2 | 1 | 66.9 | 78.4 | 18 / 35 | 5272 |
| 3 | 1 | 64.5 | 71.1 | 16 / 35 | 4940 |
| 4 | 1 | 65.1 | 72.7 | 17 / 35 | 4879 |
| 5 | 1 | 64.7 | 73.7 | 17 / 35 | 4785 |
| 6 | 1 | 65.1 | 73.0 | 19 / 35 | 4721 |
| 7 | 1 | 64.7 | 73.7 | 12 / 35 | 4828 |
| 8 | 2 | 63.9 | 68.6 | 12 / 35 | 4892 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 76 | 80% |
| catcat20.shape.Theta 0.018 | 56 | 52% |
| co.edu.usb.rc.LidisTron 1.0 | 13 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 78% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 5 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 75% |
| pa.Improved 1.0 | 3 | 67% |

Hadur died in 154 of 280 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 69 | 45% | 131 |
| catcat20.shape.Theta 0.018 | 42 | 27% | 65 |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 6% | 14 |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 5% | 11 |
| sanyi.mikrobi.Roberto 1.0 | 7 | 5% | 20 |
| co.edu.usb.rc.LidisTron 1.0 | 7 | 5% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 3% | 17 |
| pa.Improved 1.0 | 3 | 2% | 6 |
| sample.TrackFire 1.0 | 3 | 2% | 3 |

## Melee bench: F15

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 82.4 | 149 / 280 | 2.59 | 18.9% | 46323 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.9% | 149 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.6% | 23 |
| emp.Yngwie 1.11 | 2.9 | 13.1% | 64 |
| mld.DustBunny 3.8 | 3.9 | 11.7% | 8 |
| kawigi.robot.Girl 1.2 | 4.9 | 10.2% | 23 |
| cb.nano.Insomnia 1.0 | 6.1 | 8.6% | 12 |
| Grystrion.TrackerWO 1.0 | 7.3 | 6.9% | 0 |
| lambdaxy.TBot 0.1 | 7.9 | 6.5% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.7% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 76.8 | 14 / 35 | 5701 |
| 2 | 1 | 69.2 | 84.1 | 18 / 35 | 6002 |
| 3 | 1 | 69.7 | 87.0 | 17 / 35 | 6150 |
| 4 | 1 | 69.4 | 85.1 | 17 / 35 | 6345 |
| 5 | 1 | 66.2 | 75.2 | 15 / 35 | 5318 |
| 6 | 1 | 69.9 | 88.3 | 24 / 35 | 5509 |
| 7 | 1 | 70.3 | 86.0 | 25 / 35 | 5957 |
| 8 | 1 | 66.6 | 76.5 | 19 / 35 | 5341 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 62 | 61% |
| kawigi.micro.Shiz 1.1 | 51 | 94% |
| kawigi.robot.Girl 1.2 | 25 | 84% |
| mld.DustBunny 3.8 | 23 | 96% |
| cb.nano.Insomnia 1.0 | 20 | 85% |
| divineomega.TrialBot 0.003 | 3 | 67% |

Hadur died in 131 of 280 rounds, at a mean tick of 924. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 58 | 44% | 107 |
| mld.DustBunny 3.8 | 17 | 13% | 41 |
| kawigi.micro.Shiz 1.1 | 15 | 11% | 55 |
| kawigi.robot.Girl 1.2 | 13 | 10% | 28 |
| divineomega.TrialBot 0.003 | 7 | 5% | 19 |
| lambdaxy.TBot 0.1 | 7 | 5% | 9 |
| cb.nano.Insomnia 1.0 | 6 | 5% | 6 |
| Grystrion.TrackerWO 1.0 | 5 | 4% | 11 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 3 | 2% | 3 |

## Melee bench: F16

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 80.5 | 72 / 280 | 2.76 | 17.2% | 41301 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.5 | 17.2% | 72 |
| gh.Griezel 0.5.2 | 1.5 | 17.4% | 131 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.8% | 9 |
| techdude.forest.FlamingForest 1.1 | 4.6 | 10.0% | 43 |
| tvv.nano.Polaris 1.2 | 5.0 | 9.7% | 15 |
| bvh.fnr.Fenrir 0.36l | 5.4 | 9.3% | 5 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.8% | 1 |
| repositorio.NanoStep 1.0 | 8.6 | 5.0% | 1 |
| asd.Cthulhu 1.3 | 9.0 | 5.0% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.4 | 4.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 81.0 | 8 / 35 | 5160 |
| 2 | 1 | 67.8 | 84.4 | 11 / 35 | 5246 |
| 3 | 2 | 66.5 | 81.0 | 11 / 35 | 4732 |
| 4 | 2 | 65.6 | 78.1 | 7 / 35 | 4938 |
| 5 | 2 | 65.2 | 74.3 | 5 / 35 | 5395 |
| 6 | 1 | 66.9 | 81.0 | 11 / 35 | 5323 |
| 7 | 2 | 65.8 | 79.0 | 10 / 35 | 4719 |
| 8 | 1 | 68.5 | 85.1 | 9 / 35 | 5788 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 102 | 19% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 26 | 85% |
| techdude.forest.FlamingForest 1.1 | 21 | 43% |
| bvh.fnr.Fenrir 0.36l | 9 | 89% |
| tvv.nano.Polaris 1.2 | 7 | 86% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |

Hadur died in 209 of 280 rounds, at a mean tick of 1308. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 111 | 53% | 133 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 25 | 12% | 45 |
| techdude.forest.FlamingForest 1.1 | 25 | 12% | 35 |
| bvh.fnr.Fenrir 0.36l | 18 | 9% | 21 |
| stelo.IntrinsicVolatility 1.4 | 15 | 7% | 20 |
| tvv.nano.Polaris 1.2 | 10 | 5% | 15 |
| divineomega.DivineBot 1.9.4.5 | 2 | 1% | 7 |
| repositorio.NanoStep 1.0 | 2 | 1% | 2 |
| asd.Cthulhu 1.3 | 1 | 0% | 2 |

## Melee bench: F17

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 78.0 | 104 / 280 | 2.98 | 16.5% | 35949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.5% | 104 |
| et.Predator 1.8 | 2.4 | 13.5% | 40 |
| oog.melee.Mercutio 1.0 | 3.0 | 12.9% | 48 |
| cx.BlestPain 1.41 | 4.0 | 12.1% | 51 |
| nic.Nicator 2.4 | 5.0 | 11.0% | 21 |
| ahf.NanoAndrew .4 | 5.8 | 10.4% | 15 |
| maribo.melee.BMV 0.1 | 6.9 | 9.2% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 6.1% | 0 |
| tex.Longbot 0.4 | 8.8 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 81.3 | 13 / 35 | 4702 |
| 2 | 1 | 64.1 | 73.7 | 11 / 35 | 4277 |
| 3 | 1 | 62.4 | 71.1 | 10 / 35 | 4035 |
| 4 | 1 | 65.9 | 77.1 | 15 / 35 | 4680 |
| 5 | 1 | 64.2 | 75.9 | 10 / 35 | 4262 |
| 6 | 1 | 67.3 | 84.1 | 15 / 35 | 4724 |
| 7 | 1 | 65.8 | 77.1 | 16 / 35 | 4482 |
| 8 | 1 | 67.0 | 83.5 | 14 / 35 | 4787 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 47 | 68% |
| oog.melee.Mercutio 1.0 | 39 | 62% |
| cx.BlestPain 1.41 | 33 | 36% |
| nic.Nicator 2.4 | 31 | 77% |
| ahf.NanoAndrew .4 | 10 | 80% |
| edu.otg.spr.TheTeacher 1.2 | 3 | 100% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 176 of 280 rounds, at a mean tick of 982. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 38 | 22% | 55 |
| et.Predator 1.8 | 37 | 21% | 69 |
| oog.melee.Mercutio 1.0 | 34 | 19% | 57 |
| nic.Nicator 2.4 | 23 | 13% | 41 |
| ahf.NanoAndrew .4 | 22 | 13% | 31 |
| maribo.melee.BMV 0.1 | 11 | 6% | 14 |
| tex.Longbot 0.4 | 5 | 3% | 4 |
| goblin.Bender 2.4 | 4 | 2% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 1% | 5 |

## Melee bench: F18

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 77.3 | 129 / 280 | 3.05 | 16.6% | 33589 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.6% | 129 |
| morbid.MorbidPriest 1.0 | 2.5 | 13.2% | 45 |
| agd.Mooserwirt2 2.7 | 2.8 | 12.9% | 48 |
| uji.DBH 1.1 | 4.6 | 10.4% | 16 |
| spinnercat.Robovirus 2.718 | 5.1 | 10.3% | 9 |
| ratosh.Nobo 0.21 | 5.1 | 10.4% | 10 |
| sigterm.Sigterm 1.0 | 7.4 | 8.2% | 13 |
| kawigi.mini.Fhqwhgads 1.1 | 7.5 | 7.4% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.4% | 0 |
| stelo.WangRobot 1.0 | 9.5 | 5.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 85.1 | 19 / 35 | 4361 |
| 2 | 1 | 63.4 | 73.3 | 14 / 35 | 3977 |
| 3 | 1 | 64.9 | 77.8 | 17 / 35 | 4177 |
| 4 | 1 | 65.6 | 80.3 | 17 / 35 | 4356 |
| 5 | 1 | 64.8 | 75.2 | 18 / 35 | 4166 |
| 6 | 1 | 64.9 | 77.5 | 18 / 35 | 4129 |
| 7 | 1 | 63.1 | 72.4 | 12 / 35 | 3913 |
| 8 | 1 | 65.2 | 76.5 | 14 / 35 | 4510 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 41 | 66% |
| agd.Mooserwirt2 2.7 | 41 | 61% |
| uji.DBH 1.1 | 25 | 88% |
| sigterm.Sigterm 1.0 | 21 | 76% |
| ratosh.Nobo 0.21 | 15 | 87% |
| spinnercat.Robovirus 2.718 | 15 | 87% |
| stelo.WangRobot 1.0 | 10 | 60% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 152 of 280 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 39 | 26% | 72 |
| agd.Mooserwirt2 2.7 | 37 | 24% | 67 |
| kawigi.mini.Fhqwhgads 1.1 | 16 | 11% | 28 |
| uji.DBH 1.1 | 15 | 10% | 29 |
| spinnercat.Robovirus 2.718 | 12 | 8% | 18 |
| ratosh.Nobo 0.21 | 10 | 7% | 23 |
| sigterm.Sigterm 1.0 | 8 | 5% | 16 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8 | 5% | 12 |
| stelo.WangRobot 1.0 | 7 | 5% | 14 |

## Melee bench: F19

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 89.6 | 193 / 280 | 1.93 | 20.0% | 44866 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.0% | 193 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.4 | 14.1% | 24 |
| mld.Infinity 2.2 | 2.6 | 13.8% | 39 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.9% | 15 |
| erdnis.Rover 0.3 | 4.8 | 10.7% | 5 |
| patson.PatsonTestBot 1.0 | 6.1 | 8.6% | 3 |
| mbh.Mbh 0.1 | 7.3 | 7.2% | 0 |
| pac.ABC 2.1 | 7.8 | 6.9% | 1 |
| pbg.R2D2 1.0 | 8.9 | 5.6% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 90.5 | 26 / 35 | 5902 |
| 2 | 1 | 70.0 | 87.6 | 23 / 35 | 5352 |
| 3 | 1 | 69.7 | 87.9 | 18 / 35 | 5391 |
| 4 | 1 | 71.0 | 91.4 | 24 / 35 | 5777 |
| 5 | 1 | 71.5 | 93.3 | 23 / 35 | 5566 |
| 6 | 1 | 69.8 | 82.5 | 25 / 35 | 5595 |
| 7 | 1 | 70.2 | 89.8 | 26 / 35 | 5543 |
| 8 | 1 | 71.5 | 94.0 | 28 / 35 | 5740 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 106 | 88% |
| mld.Infinity 2.2 | 77 | 79% |
| krillr.mini.JointStrike 2.0.0 | 21 | 67% |
| patson.PatsonTestBot 1.0 | 12 | 100% |
| erdnis.Rover 0.3 | 7 | 86% |
| pbg.R2D2 1.0 | 4 | 75% |
| pac.ABC 2.1 | 4 | 100% |

Hadur died in 89 of 280 rounds, at a mean tick of 1024. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 28 | 31% | 28 |
| davidalves.net.DuelistMiniMelee 1.2 | 26 | 29% | 132 |
| krillr.mini.JointStrike 2.0.0 | 15 | 17% | 40 |
| erdnis.Rover 0.3 | 9 | 10% | 23 |
| mbh.Mbh 0.1 | 4 | 4% | 10 |
| pbg.R2D2 1.0 | 3 | 3% | 20 |
| pac.ABC 2.1 | 3 | 3% | 8 |
| patson.PatsonTestBot 1.0 | 1 | 1% | 13 |

## Melee bench: F20

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 78.6 | 104 / 280 | 2.93 | 17.0% | 38852 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.5 | 17.0% | 104 |
| trm.Wrekt 1.1.6.f | 1.5 | 16.2% | 79 |
| fwb.Nine 1.0.1 | 3.4 | 11.9% | 41 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 10.7% | 9 |
| catcat20.Rabbit 0.001 | 4.4 | 10.7% | 33 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 8.0% | 2 |
| m3thos.mini.Eva01 0.5.5 | 6.8 | 8.0% | 4 |
| bayen.nut.Squirrel 1.615 | 7.5 | 7.4% | 6 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.8% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 85.1 | 16 / 35 | 5052 |
| 2 | 2 | 61.9 | 67.9 | 9 / 35 | 4374 |
| 3 | 2 | 65.3 | 75.6 | 10 / 35 | 4899 |
| 4 | 2 | 66.8 | 82.5 | 12 / 35 | 4812 |
| 5 | 1 | 68.1 | 84.8 | 17 / 35 | 4957 |
| 6 | 1 | 62.6 | 69.5 | 12 / 35 | 4351 |
| 7 | 2 | 66.0 | 79.0 | 14 / 35 | 4908 |
| 8 | 1 | 67.8 | 84.1 | 14 / 35 | 5499 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 81 | 60% |
| fwb.Nine 1.0.1 | 28 | 39% |
| catcat20.Rabbit 0.001 | 27 | 63% |
| nz.jdc.nano.GridFu 1.0 | 15 | 87% |
| bayen.nut.Squirrel 1.615 | 10 | 90% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% |

Hadur died in 177 of 280 rounds, at a mean tick of 985. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 75 | 42% | 114 |
| fwb.Nine 1.0.1 | 44 | 25% | 50 |
| catcat20.Rabbit 0.001 | 25 | 14% | 46 |
| nz.jdc.nano.GridFu 1.0 | 13 | 7% | 30 |
| djdjdj.NanoSkunk10 1.0 | 8 | 5% | 15 |
| bayen.nut.Squirrel 1.615 | 4 | 2% | 12 |
| ntc.ControlledChaos 1.1.4 | 4 | 2% | 5 |
| m3thos.mini.Eva01 0.5.5 | 3 | 2% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 2 |

## Melee bench: F21

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 85.5 | 138 / 280 | 2.30 | 18.9% | 43344 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.9% | 138 |
| eem.EvBot v4.6.16 | 2.0 | 16.6% | 107 |
| dummy.mini.Scimitar 1.01 | 3.1 | 13.6% | 12 |
| cf.RiO.RiOx 4.2.1 | 3.9 | 11.6% | 4 |
| eld.Hmm 1.0 | 5.3 | 8.5% | 17 |
| oa.weak.BotherBot 0.1 | 5.8 | 8.0% | 4 |
| fire219.CatBot 1.0 | 7.6 | 6.6% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.3% | 0 |
| PSW.Relentless 0.1 | 8.6 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.6 | 20 / 35 | 5582 |
| 2 | 1 | 68.7 | 84.8 | 16 / 35 | 5425 |
| 3 | 1 | 71.4 | 90.5 | 22 / 35 | 6236 |
| 4 | 1 | 65.6 | 79.4 | 15 / 35 | 4535 |
| 5 | 1 | 69.3 | 86.0 | 15 / 35 | 5770 |
| 6 | 1 | 69.5 | 87.9 | 16 / 35 | 5684 |
| 7 | 1 | 68.6 | 83.8 | 19 / 35 | 4826 |
| 8 | 1 | 68.4 | 84.1 | 15 / 35 | 5286 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 133 | 53% |
| dummy.mini.Scimitar 1.01 | 34 | 97% |
| cf.RiO.RiOx 4.2.1 | 25 | 100% |
| eld.Hmm 1.0 | 9 | 44% |
| oa.weak.BotherBot 0.1 | 5 | 80% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 144 of 280 rounds, at a mean tick of 1146. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 96 | 67% | 138 |
| dummy.mini.Scimitar 1.01 | 11 | 8% | 56 |
| eld.Hmm 1.0 | 9 | 6% | 26 |
| cf.RiO.RiOx 4.2.1 | 8 | 6% | 31 |
| oa.weak.BotherBot 0.1 | 6 | 4% | 12 |
| PSW.Relentless 0.1 | 6 | 4% | 6 |
| fire219.CatBot 1.0 | 3 | 2% | 4 |
| el.JumpShoot 0.2 | 3 | 2% | 3 |
| arthord.MannyPacquiao Beta | 2 | 1% | 3 |

## Melee bench: F23

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 80.6 | 109 / 280 | 2.74 | 17.9% | 42846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.4 | 17.7% | 104 |
| hadur117.micro.SaorC 0.1 | 1.6 | 17.9% | 109 |
| cre.Karolos 0.32 | 3.0 | 13.5% | 35 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4.8 | 9.9% | 4 |
| stelo.RamTrackSurfer 1.2 | 5.6 | 9.4% | 12 |
| stelo.AreaTargetingBot 1.1 | 5.8 | 9.5% | 8 |
| cw.megas.Blade 0.8 | 6.1 | 8.9% | 1 |
| sample.Walls 1.0 | 7.8 | 7.9% | 7 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.5% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.8 | 78.7 | 13 / 35 | 5181 |
| 2 | 2 | 67.8 | 80.0 | 12 / 35 | 5548 |
| 3 | 2 | 68.8 | 81.0 | 13 / 35 | 5435 |
| 4 | 2 | 66.8 | 77.5 | 15 / 35 | 4850 |
| 5 | 1 | 68.4 | 81.9 | 13 / 35 | 5170 |
| 6 | 1 | 67.9 | 76.8 | 15 / 35 | 5121 |
| 7 | 2 | 68.2 | 82.5 | 14 / 35 | 5338 |
| 8 | 1 | 69.6 | 86.7 | 14 / 35 | 6203 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 111 | 52% |
| cre.Karolos 0.32 | 40 | 58% |
| stelo.AreaTargetingBot 1.1 | 17 | 76% |
| stelo.RamTrackSurfer 1.2 | 8 | 75% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| sample.Walls 1.0 | 4 | 100% |

Hadur died in 171 of 280 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 83 | 49% | 132 |
| cre.Karolos 0.32 | 39 | 23% | 66 |
| stelo.AreaTargetingBot 1.1 | 23 | 13% | 33 |
| stelo.RamTrackSurfer 1.2 | 10 | 6% | 19 |
| sample.Walls 1.0 | 8 | 5% | 12 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 2% | 9 |
| cw.megas.Blade 0.8 | 4 | 2% | 6 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 62.7 | 44 / 280 | 4.36 | 12.7% | 27214 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 1.5 | 14.9% | 69 |
| rz.GlowBlowMelee 1.4 | 1.8 | 14.5% | 64 |
| davidalves.Phoenix 0.54 | 3.1 | 13.6% | 57 |
| hadur117.micro.SaorC 0.1 | 4.1 | 12.7% | 44 |
| pedersen.Ugluk 1.1.1 | 4.5 | 11.2% | 31 |
| oog.melee.Corsair 1.0 | 6.0 | 9.4% | 7 |
| stelo.SoJNanoMelee 1.1 | 7.6 | 6.7% | 8 |
| lunchie.Lunchbox 0.93 | 7.6 | 6.6% | 0 |
| as.FrankTheTank 1.3 | 9.3 | 5.5% | 1 |
| evd.X1 0.01 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.8 | 65.4 | 8 / 35 | 3479 |
| 2 | 5 | 54.6 | 53.0 | 5 / 35 | 3244 |
| 3 | 4 | 59.4 | 64.8 | 3 / 35 | 3662 |
| 4 | 3 | 59.6 | 67.0 | 5 / 35 | 3396 |
| 5 | 5 | 57.4 | 60.3 | 5 / 35 | 3312 |
| 6 | 4 | 58.4 | 60.6 | 6 / 35 | 3517 |
| 7 | 4 | 59.3 | 67.3 | 6 / 35 | 3204 |
| 8 | 4 | 58.6 | 63.2 | 6 / 35 | 3400 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 36 | 39% |
| florent.XSeries.X2 0.12 | 26 | 23% |
| davidalves.Phoenix 0.54 | 24 | 42% |
| pedersen.Ugluk 1.1.1 | 10 | 60% |
| stelo.SoJNanoMelee 1.1 | 5 | 100% |
| oog.melee.Corsair 1.0 | 3 | 100% |

Hadur died in 237 of 280 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 76 | 32% | 85 |
| rz.GlowBlowMelee 1.4 | 48 | 20% | 65 |
| davidalves.Phoenix 0.54 | 45 | 19% | 51 |
| pedersen.Ugluk 1.1.1 | 20 | 8% | 22 |
| oog.melee.Corsair 1.0 | 13 | 5% | 18 |
| evd.X1 0.01 | 11 | 5% | 13 |
| stelo.SoJNanoMelee 1.1 | 10 | 4% | 12 |
| lunchie.Lunchbox 0.93 | 10 | 4% | 10 |
| as.FrankTheTank 1.3 | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 81.5 | 150 / 280 | 2.66 | 17.4% | 31717 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.4% | 150 |
| voidious.mini.BrokenSword 2.0.3 | 2.1 | 13.8% | 45 |
| voidious.micro.BlitzBat 1.05 | 3.1 | 12.4% | 12 |
| jdw.Hurricane 1.4 | 4.0 | 11.5% | 31 |
| gre.svman4.Morfeas 1.4.1 | 5.4 | 9.5% | 21 |
| ds.Oo 2.2 | 5.6 | 9.5% | 10 |
| gjr.Cephalosporin 0.1 | 7.4 | 7.9% | 9 |
| awesomeness.Elite 1.0 | 7.9 | 7.3% | 2 |
| adt.Ar2 1.1 | 8.5 | 6.5% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 74.6 | 18 / 35 | 4130 |
| 2 | 1 | 65.3 | 80.6 | 16 / 35 | 3857 |
| 3 | 1 | 68.7 | 88.6 | 23 / 35 | 4271 |
| 4 | 1 | 68.5 | 88.9 | 20 / 35 | 4187 |
| 5 | 1 | 64.0 | 75.2 | 15 / 35 | 3733 |
| 6 | 1 | 66.6 | 81.9 | 21 / 35 | 3799 |
| 7 | 1 | 65.8 | 81.9 | 16 / 35 | 3895 |
| 8 | 1 | 66.3 | 80.3 | 21 / 35 | 3845 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 60 | 75% |
| voidious.micro.BlitzBat 1.05 | 56 | 95% |
| jdw.Hurricane 1.4 | 26 | 73% |
| ds.Oo 2.2 | 17 | 76% |
| gre.svman4.Morfeas 1.4.1 | 8 | 100% |
| gjr.Cephalosporin 0.1 | 7 | 86% |
| awesomeness.Elite 1.0 | 4 | 100% |
| adt.Ar2 1.1 | 2 | 100% |

Hadur died in 132 of 280 rounds, at a mean tick of 595. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 32 | 24% | 77 |
| jdw.Hurricane 1.4 | 28 | 21% | 43 |
| voidious.micro.BlitzBat 1.05 | 20 | 15% | 64 |
| gre.svman4.Morfeas 1.4.1 | 13 | 10% | 21 |
| ds.Oo 2.2 | 10 | 8% | 24 |
| awesomeness.Elite 1.0 | 9 | 7% | 15 |
| gjr.Cephalosporin 0.1 | 8 | 6% | 18 |
| adt.Ar2 1.1 | 6 | 5% | 11 |
| amk.ChumbaMini 0.2 | 6 | 5% | 7 |

## Melee bench: F26

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 78.9 | 95 / 280 | 2.90 | 16.6% | 39418 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 16.6% | 95 |
| ak.Fermat 2.0 | 1.9 | 15.0% | 76 |
| shu.nitro.LENIN .T34 | 3.3 | 12.7% | 55 |
| lrem.Spectre 0.4.4 | 3.8 | 12.3% | 31 |
| js.PinBall 1.6 | 5.3 | 11.3% | 11 |
| gh.mini.GrubbmOne 1.0 | 6.1 | 9.6% | 7 |
| jaybot.adv.bots.JayBot 2.0 | 6.6 | 9.1% | 3 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 7.0% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 78.1 | 14 / 35 | 5043 |
| 2 | 2 | 63.9 | 74.6 | 9 / 35 | 4369 |
| 3 | 1 | 66.8 | 81.3 | 12 / 35 | 5178 |
| 4 | 1 | 65.5 | 78.7 | 11 / 35 | 4814 |
| 5 | 1 | 64.6 | 75.9 | 11 / 35 | 4694 |
| 6 | 1 | 66.2 | 80.3 | 12 / 35 | 4930 |
| 7 | 1 | 66.7 | 81.0 | 11 / 35 | 5277 |
| 8 | 1 | 67.3 | 81.6 | 15 / 35 | 5113 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 55 | 40% |
| shu.nitro.LENIN .T34 | 54 | 52% |
| lrem.Spectre 0.4.4 | 29 | 59% |
| js.PinBall 1.6 | 19 | 74% |
| gh.mini.GrubbmOne 1.0 | 8 | 88% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 1 | 0% |

Hadur died in 185 of 280 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 68 | 37% | 92 |
| shu.nitro.LENIN .T34 | 39 | 21% | 72 |
| js.PinBall 1.6 | 28 | 15% | 44 |
| lrem.Spectre 0.4.4 | 24 | 13% | 37 |
| fullsail.LaxativeTeaTwo 1.0 | 12 | 6% | 15 |
| jaybot.adv.bots.JayBot 2.0 | 8 | 4% | 8 |
| gh.mini.GrubbmOne 1.0 | 5 | 3% | 11 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |

## Melee bench: F27

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 60.1 | 91 / 280 | 4.59 | 13.8% | 31580 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.6 | 14.8% | 98 |
| hadur117.micro.SaorC 0.1 | 3.1 | 13.8% | 91 |
| wee.Gem 1.8.4 | 3.3 | 11.6% | 34 |
| sheldor.melee.nano.TestMelee 0.1 | 3.5 | 11.4% | 26 |
| EH.Eagle 1.0.6 | 5.5 | 9.4% | 20 |
| joe.ADinosaur 1.0 | 6.4 | 9.2% | 7 |
| throxbot.ThroxBot 0.1 | 6.5 | 8.9% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 6.6 | 9.0% | 3 |
| caimano.Furia_Ceca 0.22 | 8.8 | 7.5% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 81.6 | 17 / 35 | 4159 |
| 2 | 7 | 49.8 | 34.9 | 3 / 35 | 3309 |
| 3 | 1 | 64.6 | 75.6 | 16 / 35 | 4210 |
| 4 | 1 | 64.3 | 76.2 | 16 / 35 | 4162 |
| 5 | 5 | 51.7 | 38.4 | 4 / 35 | 3586 |
| 6 | 5 | 53.4 | 41.9 | 4 / 35 | 3501 |
| 7 | 4 | 55.7 | 43.2 | 8 / 35 | 3873 |
| 8 | 1 | 68.6 | 88.9 | 23 / 35 | 4780 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 55 | 55% |
| wee.Gem 1.8.4 | 17 | 82% |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 80% |
| EH.Eagle 1.0.6 | 11 | 91% |
| throxbot.ThroxBot 0.1 | 9 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| joe.ADinosaur 1.0 | 4 | 100% |

Hadur died in 189 of 280 rounds, at a mean tick of 485. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 43 | 23% | 79 |
| sheldor.melee.nano.TestMelee 0.1 | 29 | 15% | 43 |
| joe.ADinosaur 1.0 | 29 | 15% | 32 |
| cs.Grudge 1.0 | 25 | 13% | 30 |
| wee.Gem 1.8.4 | 18 | 10% | 31 |
| techdude.kombat.FlamingKombat 1.5 | 15 | 8% | 21 |
| throxbot.ThroxBot 0.1 | 14 | 7% | 22 |
| EH.Eagle 1.0.6 | 8 | 4% | 12 |
| caimano.Furia_Ceca 0.22 | 8 | 4% | 9 |

## Melee bench: F28

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 84.7 | 161 / 280 | 2.38 | 17.9% | 33034 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.9% | 161 |
| kid.test.NightFox .2 | 2.1 | 14.8% | 49 |
| uji.Antique 1.0 | 3.4 | 12.2% | 34 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 10.9% | 25 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.4% | 3 |
| ahr.ice.Ice 1.0.2 | 6.4 | 7.9% | 6 |
| amk.ChumbaWumba 0.3 | 6.6 | 8.3% | 0 |
| matt.advanced.Katana 1.0 | 8.3 | 6.5% | 2 |
| stelo.Lifestealer 1.0 | 9.4 | 5.7% | 0 |
| stelo.PianistNano 1.2 | 9.4 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 84.4 | 18 / 35 | 4235 |
| 2 | 1 | 67.4 | 85.7 | 23 / 35 | 4165 |
| 3 | 1 | 66.7 | 82.5 | 18 / 35 | 4336 |
| 4 | 1 | 67.0 | 85.4 | 19 / 35 | 3715 |
| 5 | 1 | 67.6 | 84.8 | 24 / 35 | 4330 |
| 6 | 1 | 66.9 | 85.4 | 16 / 35 | 4259 |
| 7 | 1 | 67.6 | 87.0 | 22 / 35 | 4075 |
| 8 | 1 | 66.3 | 82.5 | 21 / 35 | 3919 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 103 | 78% |
| uji.Antique 1.0 | 50 | 84% |
| qohnil.blot.BlotBot 3.61 | 20 | 30% |
| pfvicm.Sobieski 7.2.3b | 12 | 100% |
| amk.ChumbaWumba 0.3 | 10 | 100% |
| ahr.ice.Ice 1.0.2 | 5 | 100% |
| matt.advanced.Katana 1.0 | 5 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 119 of 280 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 36 | 30% | 98 |
| qohnil.blot.BlotBot 3.61 | 24 | 20% | 33 |
| pfvicm.Sobieski 7.2.3b | 21 | 18% | 33 |
| uji.Antique 1.0 | 20 | 17% | 70 |
| amk.ChumbaWumba 0.3 | 13 | 11% | 18 |
| ahr.ice.Ice 1.0.2 | 2 | 2% | 14 |
| stelo.Lifestealer 1.0 | 2 | 2% | 4 |
| matt.advanced.Katana 1.0 | 1 | 1% | 5 |
| stelo.PianistNano 1.2 | 0 | 0% | 3 |

## Melee bench: F29

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 74.6 | 76 / 280 | 3.29 | 16.0% | 34585 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.5 | 16.0% | 76 |
| zyx.mega.YersiniaPestis 3.1 | 2.1 | 15.9% | 102 |
| deewiant.Anomaly 0.2 | 2.5 | 14.7% | 73 |
| myl.micro.Troodon 1.10 | 3.9 | 12.2% | 12 |
| jok.PheonixM 0.1.2 | 5.0 | 9.9% | 3 |
| ph.melee.ArcherME 0.3 | 6.3 | 8.2% | 0 |
| DBall.Anarchy 0.1 | 7.0 | 7.4% | 8 |
| fullsail.TimbotNoPrediction 1.0 | 8.5 | 5.9% | 0 |
| ap.Frederick 1.1 | 8.8 | 5.4% | 3 |
| jangs.ns51 1.0 | 9.5 | 4.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 83.8 | 13 / 35 | 4432 |
| 2 | 2 | 64.1 | 73.3 | 9 / 35 | 4195 |
| 3 | 2 | 62.5 | 70.2 | 8 / 35 | 3895 |
| 4 | 2 | 62.9 | 72.4 | 8 / 35 | 3775 |
| 5 | 1 | 65.7 | 74.9 | 12 / 35 | 4721 |
| 6 | 2 | 63.3 | 69.8 | 7 / 35 | 4495 |
| 7 | 1 | 65.3 | 74.3 | 10 / 35 | 4722 |
| 8 | 1 | 65.2 | 78.1 | 9 / 35 | 4350 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 55 | 44% |
| zyx.mega.YersiniaPestis 3.1 | 43 | 23% |
| myl.micro.Troodon 1.10 | 21 | 90% |
| DBall.Anarchy 0.1 | 11 | 91% |
| jok.PheonixM 0.1.2 | 11 | 91% |
| ap.Frederick 1.1 | 3 | 100% |

Hadur died in 204 of 280 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 83 | 41% | 108 |
| zyx.mega.YersiniaPestis 3.1 | 71 | 35% | 82 |
| myl.micro.Troodon 1.10 | 18 | 9% | 31 |
| ph.melee.ArcherME 0.3 | 12 | 6% | 15 |
| jok.PheonixM 0.1.2 | 9 | 4% | 18 |
| DBall.Anarchy 0.1 | 5 | 2% | 16 |
| fullsail.TimbotNoPrediction 1.0 | 5 | 2% | 8 |
| jangs.ns51 1.0 | 1 | 0% | 2 |

## Melee bench: F30

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.7 | 55.5 | 30 / 280 | 5.01 | 11.5% | 28452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.8 | 14.0% | 78 |
| darkcanuck.B26354 1.06 | 2.3 | 13.6% | 63 |
| oog.melee.Capulet 1.2 | 3.1 | 13.0% | 47 |
| stelo.PastFuture 2.3.2 | 3.1 | 13.0% | 37 |
| hadur117.micro.SaorC 0.1 | 4.8 | 11.5% | 30 |
| intruder.PrairieWolf 2.61 | 6.1 | 9.5% | 16 |
| ntc.Opposite 1.5 | 7.8 | 7.8% | 1 |
| tripphippy.Alice 1.1 | 7.9 | 7.6% | 3 |
| fowl3628800.LightningBolt 2.6.0 | 8.3 | 7.3% | 5 |
| GarmBox.Anger 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.5 | 54.9 | 3 / 35 | 3130 |
| 2 | 3 | 58.6 | 61.3 | 5 / 35 | 4094 |
| 3 | 5 | 52.8 | 47.6 | 4 / 35 | 3160 |
| 4 | 5 | 54.4 | 53.3 | 2 / 35 | 3361 |
| 5 | 5 | 55.5 | 54.3 | 4 / 35 | 3721 |
| 6 | 5 | 56.8 | 58.7 | 4 / 35 | 3706 |
| 7 | 5 | 56.1 | 56.2 | 4 / 35 | 3511 |
| 8 | 5 | 57.0 | 57.5 | 4 / 35 | 3769 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 24 | 8% |
| oog.melee.Capulet 1.2 | 18 | 50% |
| stelo.PastFuture 2.3.2 | 16 | 75% |
| darkcanuck.B26354 1.06 | 16 | 19% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 50% |
| tripphippy.Alice 1.1 | 2 | 100% |
| intruder.PrairieWolf 2.61 | 1 | 0% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 250 of 280 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 77 | 31% | 81 |
| oog.melee.Capulet 1.2 | 48 | 19% | 55 |
| stelo.PastFuture 2.3.2 | 38 | 15% | 48 |
| darkcanuck.B26354 1.06 | 35 | 14% | 40 |
| ntc.Opposite 1.5 | 14 | 6% | 15 |
| intruder.PrairieWolf 2.61 | 13 | 5% | 14 |
| tripphippy.Alice 1.1 | 12 | 5% | 12 |
| fowl3628800.LightningBolt 2.6.0 | 11 | 4% | 13 |
| GarmBox.Anger 1.0 | 2 | 1% | 2 |

## Melee bench: F31

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 67.5 | 32 / 280 | 3.93 | 13.1% | 25379 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.8% | 170 |
| hadur117.micro.SaorC 0.1 | 2.6 | 13.1% | 32 |
| gh.mini.Griezel 0.2 | 3.1 | 12.6% | 50 |
| d414.nano.Quantum 1.0.0 | 4.1 | 11.5% | 11 |
| spinnercat.micro.Tyger 0.1 | 4.1 | 11.4% | 10 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.3% | 2 |
| timmit.nano.TimDog 0.33 | 7.1 | 7.3% | 5 |
| fm.mammillarias 1.3 | 7.9 | 6.4% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.4 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 9.6 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.0 | 64.8 | 4 / 35 | 3025 |
| 2 | 2 | 61.4 | 74.3 | 5 / 35 | 3386 |
| 3 | 2 | 60.4 | 69.8 | 2 / 35 | 3318 |
| 4 | 3 | 57.0 | 60.6 | 3 / 35 | 3105 |
| 5 | 2 | 63.1 | 77.5 | 8 / 35 | 3390 |
| 6 | 2 | 58.8 | 64.4 | 4 / 35 | 3012 |
| 7 | 5 | 54.9 | 57.1 | 3 / 35 | 2828 |
| 8 | 2 | 60.6 | 71.4 | 3 / 35 | 3315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 61 | 10% |
| gh.mini.Griezel 0.2 | 22 | 14% |
| d414.nano.Quantum 1.0.0 | 12 | 83% |
| spinnercat.micro.Tyger 0.1 | 10 | 90% |
| gh.nano.Grofvuil 0.2 | 3 | 67% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 0% |

Hadur died in 248 of 280 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 136 | 55% | 144 |
| gh.mini.Griezel 0.2 | 35 | 14% | 44 |
| spinnercat.micro.Tyger 0.1 | 22 | 9% | 26 |
| gh.nano.Grofvuil 0.2 | 20 | 8% | 21 |
| d414.nano.Quantum 1.0.0 | 13 | 5% | 18 |
| timmit.nano.TimDog 0.33 | 12 | 5% | 17 |
| fm.mammillarias 1.3 | 7 | 3% | 8 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 0% | 1 |

## Melee bench: F32

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 78.9 | 114 / 280 | 2.90 | 16.6% | 36274 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.6% | 114 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.8% | 90 |
| apc.botM 3.0 | 3.3 | 11.7% | 25 |
| vjik.UnViolation 1.1 | 4.5 | 10.6% | 22 |
| lxx.ConceptA 0.8 | 4.8 | 10.2% | 11 |
| bayen.UbaMicro 1.4 | 5.8 | 9.4% | 8 |
| panzer.Panzer 0.2 | 7.3 | 7.6% | 0 |
| yk.JahMicro 1.0 | 7.8 | 7.1% | 6 |
| conscience.Electron 1.3g | 9.0 | 6.2% | 1 |
| donjezza.Jezza 1.0 | 9.8 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 74.6 | 15 / 35 | 4826 |
| 2 | 1 | 63.8 | 74.0 | 12 / 35 | 4684 |
| 3 | 1 | 63.3 | 73.7 | 14 / 35 | 4202 |
| 4 | 1 | 65.5 | 82.5 | 15 / 35 | 4352 |
| 5 | 1 | 65.5 | 82.9 | 14 / 35 | 4487 |
| 6 | 1 | 67.0 | 84.8 | 17 / 35 | 4724 |
| 7 | 1 | 64.9 | 79.7 | 14 / 35 | 4382 |
| 8 | 1 | 65.2 | 79.0 | 13 / 35 | 4617 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 73 | 27% |
| apc.botM 3.0 | 32 | 84% |
| lxx.ConceptA 0.8 | 25 | 84% |
| vjik.UnViolation 1.1 | 17 | 88% |
| bayen.UbaMicro 1.4 | 14 | 100% |
| donjezza.Jezza 1.0 | 11 | 82% |
| yk.JahMicro 1.0 | 6 | 83% |
| panzer.Panzer 0.2 | 3 | 100% |

Hadur died in 169 of 280 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 76 | 45% | 108 |
| lxx.ConceptA 0.8 | 23 | 14% | 31 |
| conscience.Electron 1.3g | 18 | 11% | 21 |
| apc.botM 3.0 | 17 | 10% | 43 |
| vjik.UnViolation 1.1 | 14 | 8% | 35 |
| bayen.UbaMicro 1.4 | 9 | 5% | 22 |
| panzer.Panzer 0.2 | 6 | 4% | 5 |
| yk.JahMicro 1.0 | 4 | 2% | 8 |
| donjezza.Jezza 1.0 | 2 | 1% | 7 |

## Melee bench: F33

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 76.0 | 104 / 280 | 3.16 | 16.7% | 37749 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 16.7% | 104 |
| maribo.Quester 0.3 | 1.9 | 16.2% | 88 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.5% | 34 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.3% | 14 |
| labg.Cataclysm 2.05 | 4.6 | 10.5% | 27 |
| baal.nano.N 1.42 | 6.4 | 8.8% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.3% | 9 |
| zyx.micro.Ant 1.1 | 8.3 | 6.2% | 2 |
| sanja.First 0.1 | 9.1 | 5.2% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.6 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 73.3 | 9 / 35 | 4670 |
| 2 | 1 | 65.8 | 77.5 | 13 / 35 | 4632 |
| 3 | 1 | 66.0 | 72.1 | 20 / 35 | 4835 |
| 4 | 1 | 64.9 | 75.6 | 11 / 35 | 4581 |
| 5 | 1 | 65.2 | 75.6 | 11 / 35 | 4704 |
| 6 | 1 | 67.5 | 78.7 | 18 / 35 | 4887 |
| 7 | 1 | 64.1 | 73.0 | 10 / 35 | 4651 |
| 8 | 1 | 67.0 | 82.2 | 12 / 35 | 4789 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 72 | 49% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 68% |
| gre.svman4.Leonidas 1.3.2 | 31 | 87% |
| labg.Cataclysm 2.05 | 13 | 31% |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 70% |
| baal.nano.N 1.42 | 2 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 177 of 280 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 74 | 42% | 114 |
| labg.Cataclysm 2.05 | 23 | 13% | 27 |
| gre.svman4.Leonidas 1.3.2 | 22 | 12% | 45 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 11% | 49 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 14 | 8% | 14 |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 5% | 12 |
| zyx.micro.Ant 1.1 | 7 | 4% | 7 |
| sanja.First 0.1 | 5 | 3% | 7 |
| baal.nano.N 1.42 | 3 | 2% | 5 |

## Melee bench: F34

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 73.1 | 34 / 280 | 3.43 | 15.0% | 35182 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.4 | 17.5% | 93 |
| stelo.Spread 0.9 | 1.8 | 16.9% | 111 |
| hadur117.micro.SaorC 0.1 | 2.9 | 15.0% | 34 |
| jcs.Seth 1.8 | 4.4 | 11.3% | 28 |
| tcf.Reach 3 | 5.0 | 10.4% | 8 |
| cli.Dancer 1.1 | 5.6 | 10.2% | 5 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.8% | 1 |
| sample.VelociRobot 1.0 | 9.0 | 3.9% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 74.3 | 5 / 35 | 4124 |
| 2 | 3 | 62.3 | 67.0 | 2 / 35 | 4122 |
| 3 | 3 | 64.6 | 74.6 | 6 / 35 | 4534 |
| 4 | 3 | 61.9 | 67.3 | 2 / 35 | 4275 |
| 5 | 3 | 64.4 | 74.9 | 3 / 35 | 4575 |
| 6 | 3 | 64.6 | 75.2 | 6 / 35 | 4547 |
| 7 | 3 | 65.4 | 74.6 | 6 / 35 | 4650 |
| 8 | 3 | 64.4 | 76.5 | 4 / 35 | 4355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 54 | 17% |
| kid.Gladiator .7.2 | 51 | 27% |
| jcs.Seth 1.8 | 14 | 50% |
| tcf.Reach 3 | 4 | 25% |
| cli.Dancer 1.1 | 3 | 0% |
| ratosh.Wesco 1.4 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 246 of 280 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 101 | 41% | 109 |
| stelo.Spread 0.9 | 87 | 35% | 101 |
| jcs.Seth 1.8 | 17 | 7% | 22 |
| tcf.Reach 3 | 14 | 6% | 16 |
| ratosh.Wesco 1.4 | 10 | 4% | 13 |
| cli.Dancer 1.1 | 10 | 4% | 11 |
| sample.RamFire 1.0 | 4 | 2% | 5 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
| sample.VelociRobot 1.0 | 1 | 0% | 1 |

## Melee bench: F35

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 67.8 | 20 / 280 | 3.90 | 12.9% | 25050 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 222 |
| gh.mini.Gruwel 0.9 | 2.8 | 12.9% | 29 |
| hadur117.micro.SaorC 0.1 | 2.8 | 12.9% | 20 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.1 | 11.9% | 10 |
| rz.HawkOnFire 0.1 | 4.4 | 11.7% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.5 | 7.5% | 0 |
| wit.Chuliath 1.0 | 7.1 | 6.9% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.6 | 6.1% | 0 |
| dans.Cinnamon 1.2 | 9.4 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.4 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 69.8 | 2 / 35 | 2862 |
| 2 | 3 | 60.3 | 71.1 | 2 / 35 | 3309 |
| 3 | 2 | 60.8 | 68.6 | 4 / 35 | 3444 |
| 4 | 2 | 61.1 | 70.5 | 4 / 35 | 3498 |
| 5 | 2 | 60.4 | 70.2 | 2 / 35 | 3118 |
| 6 | 5 | 57.5 | 63.5 | 2 / 35 | 2745 |
| 7 | 2 | 60.1 | 69.5 | 2 / 35 | 3065 |
| 8 | 3 | 56.7 | 59.0 | 2 / 35 | 3009 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 37 | 3% |
| gh.mini.Gruwel 0.9 | 18 | 11% |
| rz.HawkOnFire 0.1 | 10 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 75% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 260 of 280 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 148 | 57% | 150 |
| gh.mini.Gruwel 0.9 | 42 | 16% | 44 |
| rz.HawkOnFire 0.1 | 20 | 8% | 27 |
| dmh.robocode.robot.BlackDeath 9.2 | 19 | 7% | 27 |
| myl.nano.KomoriNinja 1.1 | 8 | 3% | 9 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7 | 3% | 7 |
| stelo.MyAgileRobot 0.2 | 7 | 3% | 7 |
| wit.Chuliath 1.0 | 7 | 3% | 7 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |

## Melee bench: F36

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 84.0 | 182 / 280 | 2.44 | 19.0% | 40670 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.0% | 182 |
| alpha.RainingFire 1.0 | 2.6 | 12.2% | 28 |
| bzdp.Pansy 2.1 | 2.8 | 12.1% | 21 |
| mz.Cork 0.1 | 4.3 | 11.0% | 19 |
| bvh.micro.Freya 0.3 | 4.8 | 10.7% | 12 |
| m3thos.Eva02 0.7.1 | 6.1 | 9.2% | 9 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.2% | 5 |
| squidM.TentalceMeleeNano 1.1 | 8.1 | 6.8% | 0 |
| dl.BetterWalls 1.0 | 9.0 | 5.3% | 1 |
| sample.MyFirstRobot 1.0 | 9.9 | 4.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 80.6 | 21 / 35 | 5533 |
| 2 | 1 | 69.1 | 86.3 | 25 / 35 | 5039 |
| 3 | 1 | 68.2 | 82.9 | 24 / 35 | 4653 |
| 4 | 1 | 68.6 | 85.1 | 21 / 35 | 5112 |
| 5 | 1 | 70.2 | 91.4 | 25 / 35 | 5225 |
| 6 | 1 | 64.6 | 71.7 | 17 / 35 | 4616 |
| 7 | 1 | 70.4 | 88.3 | 27 / 35 | 5596 |
| 8 | 1 | 68.5 | 85.7 | 22 / 35 | 4896 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 63 | 90% |
| bvh.micro.Freya 0.3 | 35 | 89% |
| mz.Cork 0.1 | 32 | 81% |
| alpha.RainingFire 1.0 | 32 | 78% |
| bvh.mini.Fenrir 0.39 | 31 | 97% |
| m3thos.Eva02 0.7.1 | 13 | 62% |
| sample.MyFirstRobot 1.0 | 5 | 80% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 99 of 280 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 22 | 22% | 50 |
| bvh.micro.Freya 0.3 | 15 | 15% | 35 |
| bvh.mini.Fenrir 0.39 | 14 | 14% | 22 |
| mz.Cork 0.1 | 12 | 12% | 53 |
| m3thos.Eva02 0.7.1 | 12 | 12% | 27 |
| dl.BetterWalls 1.0 | 10 | 10% | 21 |
| bzdp.Pansy 2.1 | 9 | 9% | 58 |
| sample.MyFirstRobot 1.0 | 2 | 2% | 7 |
| squidM.TentalceMeleeNano 1.1 | 2 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 78.2 | 163 / 280 | 2.96 | 17.1% | 38969 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.1% | 163 |
| germ.TheMind .2 | 2.4 | 11.7% | 27 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.0 | 11.0% | 19 |
| EBBU.Sim2 1.02 | 4.5 | 10.1% | 10 |
| agrach.Dalek 1.0 | 5.6 | 9.6% | 19 |
| stelo.UntouchableNano 1.3 | 6.6 | 8.8% | 7 |
| mb.Beast 0.1 | 7.0 | 8.7% | 18 |
| lmk.ACPFinal 0.1 | 7.6 | 8.1% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 8.1 | 7.6% | 3 |
| skm.Ryubot 1.0 | 9.1 | 7.3% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 81.0 | 22 / 35 | 4728 |
| 2 | 1 | 64.9 | 75.9 | 21 / 35 | 4920 |
| 3 | 1 | 64.3 | 75.2 | 21 / 35 | 4766 |
| 4 | 1 | 66.3 | 80.6 | 20 / 35 | 5186 |
| 5 | 1 | 63.9 | 76.5 | 19 / 35 | 4253 |
| 6 | 1 | 67.3 | 83.8 | 24 / 35 | 5291 |
| 7 | 1 | 66.4 | 82.9 | 20 / 35 | 4968 |
| 8 | 1 | 63.1 | 69.8 | 16 / 35 | 4857 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 41 | 90% |
| mb.Beast 0.1 | 28 | 96% |
| EBBU.Sim2 1.02 | 28 | 79% |
| stelo.UntouchableNano 1.3 | 25 | 96% |
| com.syncleus.robocode.Dreadnaught 0.1 | 20 | 80% |
| skm.Ryubot 1.0 | 15 | 93% |
| agrach.Dalek 1.0 | 12 | 83% |
| lmk.ACPFinal 0.1 | 12 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 117 of 280 rounds, at a mean tick of 383. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 28 | 24% | 58 |
| germ.TheMind .2 | 20 | 17% | 53 |
| mn.nano.perceptual.Impact 1.3.0 | 18 | 15% | 18 |
| com.syncleus.robocode.Dreadnaught 0.1 | 13 | 11% | 39 |
| EBBU.Sim2 1.02 | 12 | 10% | 37 |
| stelo.UntouchableNano 1.3 | 10 | 9% | 20 |
| lmk.ACPFinal 0.1 | 7 | 6% | 19 |
| mb.Beast 0.1 | 6 | 5% | 21 |
| skm.Ryubot 1.0 | 3 | 3% | 8 |

## Melee bench: F38

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 73.1 | 67 / 280 | 3.42 | 15.1% | 33518 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.3 | 17.2% | 140 |
| hadur117.micro.SaorC 0.1 | 1.8 | 15.1% | 67 |
| bvh.mini.Freya 0.55 | 3.0 | 12.6% | 30 |
| bts.mega.Gnarly 1.4 | 4.8 | 10.7% | 21 |
| cs.Wren 1.0 | 4.9 | 10.8% | 8 |
| kdf.KoulDestroyer 1.0 | 5.8 | 9.6% | 8 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 8.4% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.9 | 6.6% | 3 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.6% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.6 | 67.0 | 8 / 35 | 3858 |
| 2 | 2 | 62.9 | 71.7 | 6 / 35 | 4381 |
| 3 | 2 | 62.2 | 69.5 | 7 / 35 | 4393 |
| 4 | 2 | 62.1 | 70.5 | 6 / 35 | 4094 |
| 5 | 1 | 65.3 | 81.0 | 12 / 35 | 4165 |
| 6 | 1 | 65.0 | 78.1 | 10 / 35 | 4643 |
| 7 | 2 | 63.1 | 74.0 | 11 / 35 | 3845 |
| 8 | 2 | 62.7 | 73.0 | 7 / 35 | 4139 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 66 | 12% |
| bvh.mini.Freya 0.55 | 28 | 79% |
| cs.Wren 1.0 | 18 | 89% |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 93% |
| bts.mega.Gnarly 1.4 | 9 | 22% |
| kdf.KoulDestroyer 1.0 | 6 | 83% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 50% |

Hadur died in 213 of 280 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 112 | 53% | 126 |
| bvh.mini.Freya 0.55 | 26 | 12% | 34 |
| bts.mega.Gnarly 1.4 | 23 | 11% | 35 |
| cs.Wren 1.0 | 20 | 9% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 8% | 33 |
| kdf.KoulDestroyer 1.0 | 13 | 6% | 19 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 1% | 3 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 1 |

## Melee bench: F39

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 75.4 | 75 / 280 | 3.22 | 15.9% | 37335 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 15.9% | 75 |
| bvh.fry.Freya 0.82 | 1.9 | 15.1% | 44 |
| az.Ololobot 0.2.4 | 3.1 | 12.8% | 87 |
| catcat20.Lambda 0.024 | 3.8 | 11.5% | 50 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.1% | 10 |
| apollokidd.ApolloKidd 0.9 | 6.4 | 8.5% | 1 |
| gimp.GimpBot 0.1 | 6.5 | 8.4% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 7.8 | 7.4% | 11 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.4 | 5.7% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 70.8 | 10 / 35 | 4709 |
| 2 | 1 | 64.7 | 78.7 | 10 / 35 | 4817 |
| 3 | 1 | 64.5 | 76.8 | 12 / 35 | 4607 |
| 4 | 2 | 63.9 | 76.2 | 9 / 35 | 4610 |
| 5 | 1 | 64.6 | 77.5 | 9 / 35 | 4838 |
| 6 | 2 | 62.4 | 73.7 | 6 / 35 | 4283 |
| 7 | 1 | 64.9 | 76.8 | 11 / 35 | 4854 |
| 8 | 1 | 63.2 | 72.4 | 8 / 35 | 4617 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 54 | 59% |
| az.Ololobot 0.2.4 | 46 | 15% |
| catcat20.Lambda 0.024 | 38 | 42% |
| winamp32.micro.MicroMacro 1.0 | 10 | 40% |
| stelo.SoRobotNanoMelee 1.2 | 7 | 100% |
| gimp.GimpBot 0.1 | 6 | 100% |
| apollokidd.ApolloKidd 0.9 | 4 | 75% |

Hadur died in 206 of 280 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 57 | 28% | 80 |
| az.Ololobot 0.2.4 | 52 | 25% | 62 |
| catcat20.Lambda 0.024 | 40 | 19% | 58 |
| apollokidd.ApolloKidd 0.9 | 22 | 11% | 25 |
| stelo.SoRobotNanoMelee 1.2 | 10 | 5% | 15 |
| winamp32.micro.MicroMacro 1.0 | 9 | 4% | 16 |
| gimp.GimpBot 0.1 | 6 | 3% | 15 |
| whitesquare.robots.SkynetAdvanced 1.1 | 6 | 3% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 4 | 2% | 4 |

## Melee bench: F40

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 77.1 | 118 / 280 | 3.06 | 16.8% | 35805 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.4 | 16.8% | 118 |
| kawigi.mini.Coriantumr 1.1 | 1.8 | 15.7% | 85 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.4% | 31 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.7% | 13 |
| mz.AntiGrav 1.0 | 4.6 | 10.5% | 15 |
| alpha.BlackIce 1.0 | 6.3 | 9.1% | 7 |
| stelo.Randomness 1.0 | 6.5 | 8.8% | 9 |
| amk.superstrike.SuperStrike 0.3 | 8.3 | 6.2% | 1 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.6% | 1 |
| sample.Corners 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 83.2 | 16 / 35 | 4626 |
| 2 | 1 | 67.1 | 77.5 | 18 / 35 | 4972 |
| 3 | 1 | 66.7 | 79.4 | 17 / 35 | 4853 |
| 4 | 1 | 64.5 | 74.3 | 13 / 35 | 4329 |
| 5 | 2 | 64.4 | 72.4 | 16 / 35 | 4130 |
| 6 | 2 | 66.3 | 81.0 | 13 / 35 | 4480 |
| 7 | 1 | 64.5 | 74.0 | 14 / 35 | 4152 |
| 8 | 2 | 64.3 | 74.9 | 11 / 35 | 4263 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 70 | 47% |
| kano.gamma.KanoGamma 1.8 | 36 | 72% |
| mz.AntiGrav 1.0 | 27 | 96% |
| Polkwane.SmashMelee 1.0 | 16 | 88% |
| stelo.Randomness 1.0 | 10 | 80% |
| alpha.BlackIce 1.0 | 10 | 80% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 162 of 280 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 73 | 45% | 106 |
| kano.gamma.KanoGamma 1.8 | 21 | 13% | 48 |
| stelo.Randomness 1.0 | 16 | 10% | 33 |
| alpha.BlackIce 1.0 | 15 | 9% | 20 |
| Polkwane.SmashMelee 1.0 | 14 | 9% | 23 |
| mz.AntiGrav 1.0 | 10 | 6% | 30 |
| amk.superstrike.SuperStrike 0.3 | 8 | 5% | 9 |
| testantiswapgun.AntiSwap 1.0 | 4 | 2% | 8 |
| sample.Corners 1.0 | 1 | 1% | 2 |

## Melee bench: F41

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 73.6 | 91 / 280 | 3.38 | 15.6% | 33882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.1 | 16.9% | 125 |
| hadur117.micro.SaorC 0.1 | 1.9 | 15.6% | 91 |
| ary.Swarm 1.1 | 3.3 | 13.2% | 14 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.7% | 29 |
| simonton.nano.MeleeSeed 1.8 | 5.3 | 10.2% | 14 |
| shrub.Silver v048 | 5.8 | 9.3% | 3 |
| zyx.nano.Ant 1.1 | 7.0 | 7.9% | 1 |
| jsal.Jsalbot 1.0 | 8.1 | 6.3% | 3 |
| stelo.Mirror 1.1 | 8.9 | 5.3% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 76.5 | 14 / 35 | 4167 |
| 2 | 2 | 64.4 | 75.6 | 10 / 35 | 4206 |
| 3 | 2 | 63.4 | 70.8 | 14 / 35 | 4105 |
| 4 | 2 | 64.8 | 72.7 | 15 / 35 | 4401 |
| 5 | 2 | 64.5 | 75.6 | 9 / 35 | 4407 |
| 6 | 1 | 64.5 | 76.5 | 13 / 35 | 4026 |
| 7 | 2 | 62.0 | 66.3 | 9 / 35 | 4108 |
| 8 | 2 | 64.5 | 74.9 | 7 / 35 | 4462 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 68 | 34% |
| lessonz.robocode.Oz 0.5.0 | 29 | 72% |
| ary.Swarm 1.1 | 27 | 85% |
| simonton.nano.MeleeSeed 1.8 | 22 | 82% |
| jsal.Jsalbot 1.0 | 4 | 50% |
| shrub.Silver v048 | 3 | 67% |
| stelo.Mirror 1.1 | 2 | 100% |

Hadur died in 189 of 280 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 95 | 50% | 127 |
| simonton.nano.MeleeSeed 1.8 | 27 | 14% | 41 |
| lessonz.robocode.Oz 0.5.0 | 26 | 14% | 40 |
| ary.Swarm 1.1 | 22 | 12% | 38 |
| acogdev.alpha 0.2 | 6 | 3% | 8 |
| zyx.nano.Ant 1.1 | 5 | 3% | 5 |
| jsal.Jsalbot 1.0 | 3 | 2% | 7 |
| stelo.Mirror 1.1 | 3 | 2% | 6 |
| shrub.Silver v048 | 2 | 1% | 6 |

## Melee bench: F42

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 72.3 | 44 / 280 | 3.50 | 14.9% | 36591 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.2% | 138 |
| hadur117.micro.SaorC 0.1 | 2.3 | 14.9% | 44 |
| maribo.mini.MiniQuester 0.1 | 2.9 | 14.1% | 48 |
| ara.Shera 0.88 | 3.9 | 13.2% | 44 |
| amz.NanoClone 1.41 | 5.3 | 9.2% | 4 |
| maribo.IotaCT 1.1 | 6.3 | 8.0% | 0 |
| dsw.StaticD 1.0 | 6.8 | 7.3% | 3 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.9% | 1 |
| mme.NikeEnhanced 2.0 | 8.6 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.6 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 71.1 | 8 / 35 | 4505 |
| 2 | 2 | 63.8 | 74.6 | 6 / 35 | 4966 |
| 3 | 2 | 63.3 | 70.8 | 4 / 35 | 5041 |
| 4 | 3 | 58.2 | 61.0 | 3 / 35 | 3981 |
| 5 | 2 | 65.8 | 79.4 | 8 / 35 | 4850 |
| 6 | 2 | 64.4 | 76.8 | 7 / 35 | 4479 |
| 7 | 3 | 61.0 | 68.6 | 5 / 35 | 4060 |
| 8 | 2 | 63.8 | 75.9 | 3 / 35 | 4709 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 54 | 17% |
| maribo.mini.MiniQuester 0.1 | 30 | 47% |
| ara.Shera 0.88 | 28 | 61% |
| dsw.StaticD 1.0 | 3 | 67% |
| amz.NanoClone 1.41 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 0% |

Hadur died in 238 of 280 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 122 | 51% | 131 |
| ara.Shera 0.88 | 42 | 18% | 58 |
| maribo.mini.MiniQuester 0.1 | 38 | 16% | 52 |
| amz.NanoClone 1.41 | 11 | 5% | 12 |
| dsw.StaticD 1.0 | 8 | 3% | 11 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 5 | 2% | 5 |
| maribo.IotaCT 1.1 | 5 | 2% | 5 |
| stelo.MirrorMicro 1.0 | 4 | 2% | 4 |
| mme.NikeEnhanced 2.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F43

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 67.5 | 9 / 280 | 3.92 | 12.9% | 26633 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.3% | 233 |
| hadur117.micro.SaorC 0.1 | 2.1 | 12.9% | 9 |
| brainfade.melee.Dusk 0.44 | 3.8 | 11.7% | 22 |
| dummy.micro.Sparrow 2.5 | 3.9 | 11.3% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 4.4 | 11.1% | 5 |
| Krabb.akim2.Akim2 1.1b | 5.9 | 10.0% | 2 |
| mz.NanoGod 2.02 | 7.4 | 8.0% | 2 |
| jab.DiamondStealer 5 | 7.6 | 7.7% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.4 | 62.5 | 1 / 35 | 3368 |
| 2 | 2 | 60.2 | 66.3 | 1 / 35 | 3342 |
| 3 | 2 | 60.7 | 68.3 | 1 / 35 | 3395 |
| 4 | 3 | 59.3 | 65.4 | 1 / 35 | 2774 |
| 5 | 2 | 62.7 | 73.0 | 2 / 35 | 3445 |
| 6 | 2 | 61.2 | 67.0 | 1 / 35 | 3514 |
| 7 | 2 | 61.4 | 68.9 | 2 / 35 | 3544 |
| 8 | 2 | 60.7 | 68.9 | 0 / 35 | 3251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 83 | 0% |
| brainfade.melee.Dusk 0.44 | 5 | 80% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 67% |
| dummy.micro.Sparrow 2.5 | 3 | 67% |
| mz.NanoGod 2.02 | 1 | 0% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 271 of 280 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 177 | 65% | 179 |
| brainfade.melee.Dusk 0.44 | 29 | 11% | 32 |
| wcsv.melee.EngineerMelee 0.1 | 20 | 7% | 20 |
| mz.NanoGod 2.02 | 16 | 6% | 16 |
| dummy.micro.Sparrow 2.5 | 15 | 6% | 18 |
| Krabb.akim2.Akim2 1.1b | 7 | 3% | 8 |
| jab.DiamondStealer 5 | 6 | 2% | 6 |
| cvt.Firsty 1.0 | 1 | 0% | 1 |

## Melee bench: F44

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 78.5 | 95 / 280 | 2.94 | 16.9% | 39499 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.4 | 16.9% | 95 |
| stelo.Liblix 0.3.1 | 1.6 | 16.1% | 117 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.2% | 36 |
| wompi.Quokka 1.6 | 4.4 | 10.6% | 9 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 9.2% | 2 |
| jwirde.Gort 2.0 | 5.6 | 9.5% | 14 |
| disan.Chair 2.2.0 | 6.6 | 8.2% | 6 |
| stf.PanzerGeneral 0.1 | 7.9 | 7.0% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.4 | 4.8% | 0 |
| sample.Crazy 1.0 | 9.6 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 81.9 | 15 / 35 | 5214 |
| 2 | 2 | 63.4 | 69.2 | 12 / 35 | 4706 |
| 3 | 2 | 64.3 | 72.4 | 10 / 35 | 4750 |
| 4 | 1 | 68.4 | 87.6 | 15 / 35 | 4995 |
| 5 | 2 | 64.1 | 73.0 | 9 / 35 | 4793 |
| 6 | 1 | 67.2 | 83.8 | 13 / 35 | 5037 |
| 7 | 1 | 65.6 | 77.5 | 10 / 35 | 5096 |
| 8 | 1 | 66.8 | 82.5 | 11 / 35 | 4908 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 86 | 31% |
| tzu.TheArtOfWar 1.2 | 57 | 72% |
| wompi.Quokka 1.6 | 11 | 64% |
| disan.Chair 2.2.0 | 11 | 64% |
| jwirde.Gort 2.0 | 9 | 33% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 187 of 280 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 89 | 48% | 123 |
| tzu.TheArtOfWar 1.2 | 42 | 22% | 68 |
| jwirde.Gort 2.0 | 15 | 8% | 29 |
| wompi.Quokka 1.6 | 13 | 7% | 16 |
| disan.Chair 2.2.0 | 11 | 6% | 15 |
| stf.PanzerGeneral 0.1 | 7 | 4% | 12 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 3% | 10 |
| amk.jointstrike.JointStrike 0.2 | 3 | 2% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 4 |

## Melee bench: F45

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 82.1 | 98 / 280 | 2.61 | 18.3% | 42884 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.3% | 98 |
| eem.IWillFireNoBullet v2.8 | 2.4 | 12.6% | 142 |
| jje.BagPuss 1.2 | 3.3 | 11.3% | 9 |
| myl.nano.Graviton 1.10 | 4.3 | 10.5% | 6 |
| sul.Lunar 1.1 | 4.9 | 10.2% | 12 |
| hvilela.HVilela 0.9 | 5.9 | 9.4% | 1 |
| fm.claire 1.7 | 6.6 | 9.0% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.9 | 7.4% | 2 |
| wit.Deep7 2.0 | 9.3 | 5.9% | 8 |
| abud.ThirdRobo 1.0 | 9.6 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 83.5 | 12 / 35 | 5353 |
| 2 | 1 | 67.5 | 81.6 | 18 / 35 | 5077 |
| 3 | 1 | 65.9 | 79.4 | 11 / 35 | 4889 |
| 4 | 1 | 69.8 | 88.6 | 20 / 35 | 5627 |
| 5 | 1 | 66.9 | 81.6 | 7 / 35 | 5389 |
| 6 | 1 | 69.9 | 87.9 | 13 / 35 | 6229 |
| 7 | 1 | 64.1 | 74.6 | 7 / 35 | 4868 |
| 8 | 1 | 66.9 | 80.0 | 10 / 35 | 5452 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 114 | 20% |
| jje.BagPuss 1.2 | 24 | 83% |
| sul.Lunar 1.1 | 23 | 91% |
| myl.nano.Graviton 1.10 | 16 | 94% |
| pez.mini.ChironexFleckeri 0.5 | 12 | 100% |
| wit.Deep7 2.0 | 8 | 38% |
| fm.claire 1.7 | 3 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 182 of 280 rounds, at a mean tick of 1921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 97 | 53% | 0 |
| jje.BagPuss 1.2 | 24 | 13% | 77 |
| sul.Lunar 1.1 | 16 | 9% | 61 |
| myl.nano.Graviton 1.10 | 11 | 6% | 43 |
| hvilela.HVilela 0.9 | 11 | 6% | 26 |
| wit.Deep7 2.0 | 9 | 5% | 18 |
| fm.claire 1.7 | 7 | 4% | 14 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 3% | 24 |
| abud.ThirdRobo 1.0 | 2 | 1% | 14 |

## Melee bench: F46

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 64.7 | 27 / 280 | 4.18 | 13.3% | 31809 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.9% | 113 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.4% | 121 |
| hadur117.micro.SaorC 0.1 | 3.0 | 13.3% | 27 |
| mz.MicroSheep 1.0 | 4.4 | 10.5% | 4 |
| cx.Princess 1.0 | 5.0 | 10.2% | 11 |
| sadoner.killer 0.2 | 5.6 | 9.5% | 2 |
| arthord.NanoSatanMelee Beta | 7.4 | 6.8% | 2 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.3% | 0 |
| kurios.DOSexe .9a | 8.9 | 5.2% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.8 | 70.8 | 4 / 35 | 4414 |
| 2 | 3 | 55.8 | 51.1 | 2 / 35 | 3674 |
| 3 | 3 | 62.0 | 71.4 | 5 / 35 | 3942 |
| 4 | 3 | 60.6 | 65.1 | 3 / 35 | 4224 |
| 5 | 3 | 59.3 | 63.2 | 4 / 35 | 3788 |
| 6 | 3 | 60.4 | 67.9 | 2 / 35 | 3939 |
| 7 | 3 | 62.1 | 71.7 | 6 / 35 | 4001 |
| 8 | 3 | 57.7 | 56.5 | 1 / 35 | 3827 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 48 | 31% |
| rsalesc.melee.Medina 0.4.5 | 15 | 20% |
| cx.Princess 1.0 | 6 | 67% |
| mz.MicroSheep 1.0 | 6 | 67% |
| arthord.NanoSatanMelee Beta | 1 | 0% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 253 of 280 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 104 | 41% | 119 |
| rsalesc.melee.Medina 0.4.5 | 71 | 28% | 74 |
| cx.Princess 1.0 | 29 | 11% | 32 |
| sadoner.killer 0.2 | 15 | 6% | 16 |
| mz.MicroSheep 1.0 | 9 | 4% | 15 |
| arthord.NanoSatanMelee Beta | 9 | 4% | 9 |
| jeremyreeder.collective.Prophet 5 | 8 | 3% | 8 |
| kurios.DOSexe .9a | 5 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 3 | 1% | 3 |

