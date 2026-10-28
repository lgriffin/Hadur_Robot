# Bench suite: suite.txt

## Melee bench: F01

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 73.4 | 28 / 280 | 3.40 | 15.1% | 39727 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 208 |
| hadur117.micro.SaorLA 0.1 | 2.0 | 15.1% | 28 |
| sgp.JollyNinja 3.53 | 3.8 | 11.5% | 24 |
| mz.MicroGodMelee 1 | 4.5 | 10.5% | 12 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.8 | 10.4% | 2 |
| lorneswork.Predator 1.0 | 5.0 | 10.4% | 6 |
| adt.Ar2 1.0 | 7.3 | 7.5% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 6.1% | 0 |
| skm.butterfly 1.0 | 8.8 | 5.1% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 69.5 | 3 / 35 | 5081 |
| 2 | 2 | 63.0 | 71.1 | 2 / 35 | 4986 |
| 3 | 2 | 66.2 | 79.7 | 6 / 35 | 5303 |
| 4 | 2 | 65.3 | 78.4 | 3 / 35 | 5017 |
| 5 | 2 | 63.9 | 75.2 | 5 / 35 | 4747 |
| 6 | 2 | 61.7 | 67.3 | 3 / 35 | 4758 |
| 7 | 2 | 62.6 | 72.4 | 3 / 35 | 4703 |
| 8 | 2 | 63.7 | 73.3 | 3 / 35 | 5132 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 113 | 5% |
| sgp.JollyNinja 3.53 | 16 | 44% |
| mz.MicroGodMelee 1 | 9 | 22% |
| lorneswork.Predator 1.0 | 6 | 67% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 80% |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 252 of 280 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 150 | 60% | 158 |
| sgp.JollyNinja 3.53 | 25 | 10% | 28 |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 9% | 26 |
| lorneswork.Predator 1.0 | 19 | 8% | 22 |
| mz.MicroGodMelee 1 | 17 | 7% | 21 |
| kawigi.sbf.FloodSonnet 0.9 | 10 | 4% | 11 |
| adt.Ar2 1.0 | 7 | 3% | 10 |
| skm.butterfly 1.0 | 1 | 0% | 2 |
| mym.EdgeStalker 1.0 | 1 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 78.8 | 117 / 280 | 2.90 | 17.7% | 42695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 17.7% | 117 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.1% | 55 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 12.6% | 50 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.9% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.6 | 10.3% | 17 |
| fnc.bandit.Bandit 5.2.0 | 6.6 | 8.4% | 5 |
| Noran.BitchingElk 0.054 | 6.8 | 8.3% | 22 |
| sch.Simone 0.3d | 8.3 | 7.0% | 8 |
| stelo.PatternRobot 1.0 | 8.3 | 7.0% | 3 |
| fullsail.SweetTea 1.1 | 10.0 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 84.4 | 19 / 35 | 5695 |
| 2 | 1 | 67.6 | 81.6 | 18 / 35 | 5234 |
| 3 | 1 | 64.9 | 74.0 | 12 / 35 | 5460 |
| 4 | 1 | 64.6 | 75.2 | 11 / 35 | 4853 |
| 5 | 1 | 65.6 | 77.5 | 16 / 35 | 4916 |
| 6 | 1 | 67.6 | 79.4 | 14 / 35 | 5831 |
| 7 | 1 | 66.1 | 77.1 | 11 / 35 | 5475 |
| 8 | 1 | 67.6 | 81.6 | 16 / 35 | 5231 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 57 | 49% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 49 | 53% |
| com.cohesiva.robocode.ManOwaR 1.0 | 19 | 89% |
| Noran.BitchingElk 0.054 | 17 | 59% |
| stelo.PatternRobot 1.0 | 13 | 100% |
| sch.Simone 0.3d | 12 | 58% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 163 of 280 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 52 | 32% | 80 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 39 | 24% | 63 |
| lrem.micro.SpikeSoldier 0.4 | 18 | 11% | 28 |
| sch.Simone 0.3d | 13 | 8% | 22 |
| Noran.BitchingElk 0.054 | 13 | 8% | 20 |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 7% | 34 |
| fullsail.SweetTea 1.1 | 6 | 4% | 9 |
| stelo.PatternRobot 1.0 | 5 | 3% | 13 |
| fnc.bandit.Bandit 5.2.0 | 5 | 3% | 10 |

## Melee bench: F03

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 79.2 | 163 / 280 | 2.87 | 17.9% | 45984 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 17.9% | 163 |
| radnor.DoctorBob 1.42 | 2.3 | 14.3% | 46 |
| vuen.Cake 2.51 | 3.4 | 12.3% | 25 |
| kawigi.nano.Lib 1.0 | 3.4 | 12.5% | 34 |
| urdos.URDOS 1.3 | 5.0 | 9.6% | 7 |
| adt.Ar1 2.1 | 6.6 | 7.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 7.4% | 2 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.8% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.4 | 6.4% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 76.2 | 19 / 35 | 5827 |
| 2 | 1 | 65.2 | 74.3 | 17 / 35 | 5337 |
| 3 | 1 | 64.3 | 73.7 | 17 / 35 | 4917 |
| 4 | 1 | 69.6 | 85.4 | 24 / 35 | 6520 |
| 5 | 1 | 66.1 | 76.5 | 20 / 35 | 5491 |
| 6 | 1 | 67.7 | 83.5 | 21 / 35 | 5774 |
| 7 | 1 | 69.3 | 86.7 | 24 / 35 | 6009 |
| 8 | 1 | 67.5 | 77.5 | 21 / 35 | 6109 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 61 | 85% |
| vuen.Cake 2.51 | 59 | 83% |
| radnor.DoctorBob 1.42 | 57 | 84% |
| urdos.URDOS 1.3 | 9 | 89% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 117 of 280 rounds, at a mean tick of 512. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 36 | 31% | 85 |
| radnor.DoctorBob 1.42 | 27 | 23% | 75 |
| vuen.Cake 2.51 | 20 | 17% | 64 |
| urdos.URDOS 1.3 | 8 | 7% | 15 |
| adt.Ar1 2.1 | 8 | 7% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 7% | 9 |
| ghent.ArthurPanzergon 1.0.0 | 6 | 5% | 9 |
| oa.weak.FlyMk1 0.1 | 3 | 3% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 75.2 | 7 / 280 | 3.23 | 15.7% | 44274 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.7% | 252 |
| hadur117.micro.SaorLA 0.1 | 2.0 | 15.7% | 7 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.4% | 12 |
| TNT.TNT 0.99.1 | 4.1 | 10.8% | 5 |
| josago.Jorgito 0.16 | 4.9 | 8.9% | 1 |
| css.Delitioner 0.11 | 6.3 | 7.1% | 0 |
| tj.zombie1n 1.0.1 | 6.9 | 6.5% | 0 |
| rampancy.Durandal 2.1d | 8.1 | 5.6% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.1% | 1 |
| spin.Bugstard 0.012b | 9.5 | 4.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 76.5 | 2 / 35 | 5279 |
| 2 | 2 | 65.4 | 75.6 | 1 / 35 | 5562 |
| 3 | 2 | 67.3 | 81.3 | 1 / 35 | 6073 |
| 4 | 2 | 66.7 | 77.1 | 0 / 35 | 5974 |
| 5 | 2 | 63.9 | 70.5 | 1 / 35 | 5169 |
| 6 | 2 | 63.2 | 69.5 | 1 / 35 | 4917 |
| 7 | 2 | 66.5 | 79.0 | 0 / 35 | 5857 |
| 8 | 2 | 64.9 | 72.4 | 1 / 35 | 5443 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 112 | 1% |
| apc.LeeroyJenkins2 1.0 | 6 | 33% |
| TNT.TNT 0.99.1 | 4 | 25% |
| sp.Nanos.Ember 1.1 | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 0% |
| tj.zombie1n 1.0.1 | 1 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 273 of 280 rounds, at a mean tick of 1004. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 209 | 77% | 210 |
| apc.LeeroyJenkins2 1.0 | 34 | 12% | 38 |
| josago.Jorgito 0.16 | 12 | 4% | 11 |
| tj.zombie1n 1.0.1 | 6 | 2% | 6 |
| css.Delitioner 0.11 | 6 | 2% | 6 |
| TNT.TNT 0.99.1 | 5 | 2% | 6 |
| rampancy.Durandal 2.1d | 1 | 0% | 1 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 1 |

## Melee bench: F05

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 60.8 | 11 / 280 | 4.53 | 12.5% | 31780 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 19.0% | 164 |
| justin.DemonicRage 3.4 | 2.0 | 17.1% | 82 |
| hadur117.micro.SaorLA 0.1 | 3.5 | 12.5% | 11 |
| wompi.Numbat 2.1 | 3.5 | 12.4% | 13 |
| axeBots.HataMoto 3.09 | 5.5 | 9.2% | 8 |
| ms.Ares 0.19 | 5.5 | 8.8% | 2 |
| supersample.SuperBoxBot 1.0 | 7.5 | 6.1% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.6 | 5.9% | 0 |
| GarmBox.Oranges 1.0 | 9.4 | 4.4% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 61.6 | 3 / 35 | 3948 |
| 2 | 4 | 58.6 | 58.4 | 3 / 35 | 3791 |
| 3 | 3 | 58.8 | 60.6 | 1 / 35 | 4009 |
| 4 | 3 | 63.0 | 71.7 | 1 / 35 | 4702 |
| 5 | 4 | 56.8 | 56.2 | 0 / 35 | 3688 |
| 6 | 4 | 57.2 | 57.1 | 1 / 35 | 3797 |
| 7 | 3 | 59.3 | 61.0 | 2 / 35 | 3973 |
| 8 | 4 | 58.1 | 59.7 | 0 / 35 | 3872 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 30 | 7% |
| justin.DemonicRage 3.4 | 20 | 5% |
| wompi.Numbat 2.1 | 10 | 70% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 269 of 280 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 100 | 37% | 102 |
| cb.fire.Firestarter 2.0f | 88 | 33% | 91 |
| wompi.Numbat 2.1 | 31 | 12% | 35 |
| axeBots.HataMoto 3.09 | 16 | 6% | 17 |
| supersample.SuperBoxBot 1.0 | 11 | 4% | 10 |
| davidalves.net.DuelistMicroMelee 1.4 | 9 | 3% | 9 |
| Queens_teamrobot.UltraRazor 1.0 | 7 | 3% | 7 |
| ms.Ares 0.19 | 6 | 2% | 6 |
| GarmBox.Oranges 1.0 | 1 | 0% | 2 |

## Melee bench: F06

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 78.7 | 142 / 280 | 2.92 | 17.1% | 36296 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 17.1% | 142 |
| jekl.StoneGhost 0.7 | 2.4 | 14.1% | 28 |
| origin.SleepSiphon 1.7b | 2.8 | 13.9% | 73 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.9 | 11.6% | 19 |
| mld.Wisdom 1.0 | 5.0 | 10.7% | 3 |
| gg.Wolverine 2.0 | 6.4 | 8.2% | 7 |
| spinnercat.Omen 1.0 | 7.0 | 7.7% | 3 |
| DBall.NUKE 0.1 | 8.1 | 6.9% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 8.5 | 6.2% | 3 |
| sample.Fire 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.3 | 23 / 35 | 5121 |
| 2 | 1 | 65.0 | 72.4 | 17 / 35 | 4558 |
| 3 | 1 | 66.6 | 75.9 | 20 / 35 | 4829 |
| 4 | 1 | 65.5 | 79.4 | 16 / 35 | 4103 |
| 5 | 1 | 66.8 | 79.4 | 19 / 35 | 4869 |
| 6 | 1 | 64.1 | 74.9 | 15 / 35 | 4034 |
| 7 | 1 | 65.0 | 78.1 | 17 / 35 | 4129 |
| 8 | 1 | 66.7 | 81.9 | 15 / 35 | 4653 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 67 | 90% |
| origin.SleepSiphon 1.7b | 56 | 50% |
| pe.minimelee.SandboxMiniMelee 1.1 | 35 | 94% |
| gg.Wolverine 2.0 | 11 | 55% |
| mld.Wisdom 1.0 | 10 | 90% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 50% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 138 of 280 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 47 | 34% | 82 |
| mld.Wisdom 1.0 | 26 | 19% | 36 |
| jekl.StoneGhost 0.7 | 24 | 17% | 68 |
| pe.minimelee.SandboxMiniMelee 1.1 | 18 | 13% | 50 |
| gg.Wolverine 2.0 | 10 | 7% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 4% | 8 |
| DBall.NUKE 0.1 | 4 | 3% | 12 |
| sample.Fire 1.0 | 4 | 3% | 5 |
| spinnercat.Omen 1.0 | 0 | 0% | 4 |

## Melee bench: F07

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 83.8 | 98 / 280 | 2.46 | 18.6% | 49403 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.1 | 18.6% | 98 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.4% | 78 |
| rtk.Tachikoma 1.0 | 2.9 | 16.1% | 72 |
| franzor.Lizt 1.3.1 | 4.1 | 11.4% | 20 |
| oog.melee.CapuletDroid 1.1 | 5.1 | 9.9% | 13 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.4% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 8.0% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.9% | 0 |
| sample.Target 1.0 | 9.0 | 3.0% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 79.0 | 10 / 35 | 5776 |
| 2 | 1 | 68.3 | 79.4 | 9 / 35 | 6250 |
| 3 | 1 | 70.2 | 86.7 | 13 / 35 | 6344 |
| 4 | 2 | 68.4 | 80.0 | 12 / 35 | 5890 |
| 5 | 1 | 70.6 | 88.3 | 13 / 35 | 6187 |
| 6 | 1 | 70.0 | 85.1 | 12 / 35 | 6229 |
| 7 | 1 | 70.2 | 84.8 | 16 / 35 | 6261 |
| 8 | 1 | 70.5 | 87.3 | 13 / 35 | 6466 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 93 | 54% |
| rsalesc.melee.Monk 0.3.6c | 49 | 2% |
| oog.melee.CapuletDroid 1.1 | 28 | 86% |
| franzor.Lizt 1.3.1 | 27 | 70% |
| exauge.GateKeeper 1.1.121g | 4 | 100% |

Hadur died in 182 of 280 rounds, at a mean tick of 1211. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 77 | 42% | 102 |
| rtk.Tachikoma 1.0 | 64 | 35% | 128 |
| oog.melee.CapuletDroid 1.1 | 21 | 12% | 25 |
| franzor.Lizt 1.3.1 | 9 | 5% | 3 |
| exauge.GateKeeper 1.1.121g | 5 | 3% | 12 |
| lrem.micro.MoggFanatic 0.2 | 4 | 2% | 6 |
| drd.Dreadknoght 0.9 | 2 | 1% | 2 |

## Melee bench: F08

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 81.5 | 142 / 280 | 2.66 | 18.7% | 46302 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 18.7% | 142 |
| tm.Yuugao 1.0 | 2.3 | 13.1% | 66 |
| shrub.Vapour v159 | 3.1 | 11.7% | 26 |
| com.spp.robocode.MostlyHarmless 010 | 4.6 | 10.1% | 15 |
| Krabb.sliNk.Garm 0.9u | 5.3 | 9.7% | 12 |
| jwst.DAD.DarkAndDarker 1.1 | 5.8 | 8.9% | 13 |
| m3thos.Eva00 1.1 | 6.1 | 8.7% | 2 |
| qualidafial.MajorDick 1.0.1 | 8.4 | 6.8% | 2 |
| SHAM.WOW 1.4 | 9.0 | 6.4% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 6.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 83.2 | 17 / 35 | 5867 |
| 2 | 1 | 66.8 | 77.8 | 19 / 35 | 5280 |
| 3 | 1 | 69.7 | 87.6 | 19 / 35 | 6337 |
| 4 | 1 | 68.7 | 84.1 | 17 / 35 | 6012 |
| 5 | 1 | 65.5 | 74.6 | 15 / 35 | 5307 |
| 6 | 1 | 68.9 | 86.3 | 20 / 35 | 5868 |
| 7 | 1 | 69.8 | 86.3 | 21 / 35 | 6037 |
| 8 | 1 | 65.5 | 72.4 | 14 / 35 | 5594 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 67 | 36% |
| shrub.Vapour v159 | 54 | 85% |
| jwst.DAD.DarkAndDarker 1.1 | 24 | 92% |
| Krabb.sliNk.Garm 0.9u | 24 | 92% |
| com.spp.robocode.MostlyHarmless 010 | 14 | 79% |
| m3thos.Eva00 1.1 | 9 | 100% |
| SHAM.WOW 1.4 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 0% |

Hadur died in 138 of 280 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 59 | 43% | 102 |
| shrub.Vapour v159 | 20 | 14% | 54 |
| Krabb.sliNk.Garm 0.9u | 14 | 10% | 29 |
| com.spp.robocode.MostlyHarmless 010 | 10 | 7% | 30 |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 6% | 24 |
| zyx.nano.BacillusComma 1.0 | 8 | 6% | 10 |
| SHAM.WOW 1.4 | 7 | 5% | 9 |
| m3thos.Eva00 1.1 | 6 | 4% | 11 |
| qualidafial.MajorDick 1.0.1 | 6 | 4% | 10 |

## Melee bench: F09

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 65.1 | 55 / 280 | 4.14 | 14.1% | 33710 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.5% | 147 |
| hadur117.micro.SaorLA 0.1 | 2.1 | 14.1% | 55 |
| kc.micro.Figment 1.0 | 3.1 | 12.5% | 29 |
| pedersen.Grishnakh 1.0 | 4.4 | 10.8% | 16 |
| yagami.Tidus 0.11 | 4.9 | 10.4% | 6 |
| mc2.enemy.Original 0.9 | 5.5 | 10.0% | 20 |
| dft.Calliope 5.6 | 7.1 | 7.7% | 3 |
| step.nanoPri 1.0 | 8.1 | 6.5% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 5.3% | 1 |
| rdm.Dueler 0.4x | 9.5 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.6 | 62.5 | 4 / 35 | 4308 |
| 2 | 2 | 60.6 | 64.1 | 9 / 35 | 4026 |
| 3 | 2 | 62.5 | 65.7 | 10 / 35 | 4489 |
| 4 | 2 | 64.5 | 76.5 | 7 / 35 | 4636 |
| 5 | 2 | 60.0 | 62.5 | 5 / 35 | 4269 |
| 6 | 2 | 57.9 | 56.5 | 5 / 35 | 3881 |
| 7 | 3 | 60.1 | 64.1 | 6 / 35 | 3962 |
| 8 | 2 | 61.9 | 68.6 | 9 / 35 | 4139 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 40 | 13% |
| kc.micro.Figment 1.0 | 40 | 65% |
| mc2.enemy.Original 0.9 | 16 | 44% |
| pedersen.Grishnakh 1.0 | 10 | 60% |
| yagami.Tidus 0.11 | 8 | 100% |
| dft.Calliope 5.6 | 3 | 100% |
| rdm.Dueler 0.4x | 1 | 0% |

Hadur died in 225 of 280 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 92 | 41% | 100 |
| kc.micro.Figment 1.0 | 52 | 23% | 81 |
| mc2.enemy.Original 0.9 | 21 | 9% | 27 |
| yagami.Tidus 0.11 | 17 | 8% | 23 |
| robar.nano.Assertive_Melee 0.2 | 15 | 7% | 17 |
| pedersen.Grishnakh 1.0 | 15 | 7% | 16 |
| step.nanoPri 1.0 | 7 | 3% | 7 |
| rdm.Dueler 0.4x | 5 | 2% | 4 |
| dft.Calliope 5.6 | 1 | 0% | 5 |

## Melee bench: F10

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.9 | 144 / 280 | 2.63 | 17.8% | 43765 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 17.8% | 144 |
| DTF.Kludgy 1.2b | 2.1 | 14.2% | 69 |
| ejb.Polaris 1.0.1 | 3.6 | 12.1% | 27 |
| ne.Chimera 1.2 | 3.8 | 12.3% | 15 |
| vStar.RAFzilla 2.15 | 5.0 | 11.1% | 11 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.5% | 9 |
| kurios.DOSexe .9b | 7.9 | 5.9% | 4 |
| sam.Samspin 1.0 | 8.0 | 5.9% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.5% | 0 |
| donjezza.Muncho 1.0 | 9.9 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 83.8 | 20 / 35 | 5559 |
| 2 | 1 | 69.1 | 86.3 | 19 / 35 | 6060 |
| 3 | 1 | 65.1 | 73.3 | 14 / 35 | 5500 |
| 4 | 1 | 68.0 | 83.8 | 19 / 35 | 5573 |
| 5 | 1 | 68.5 | 86.0 | 21 / 35 | 5690 |
| 6 | 1 | 65.2 | 75.6 | 14 / 35 | 5080 |
| 7 | 1 | 66.3 | 80.3 | 18 / 35 | 5152 |
| 8 | 1 | 67.8 | 85.7 | 19 / 35 | 5151 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 54 | 80% |
| DTF.Kludgy 1.2b | 51 | 29% |
| ne.Chimera 1.2 | 39 | 74% |
| vStar.RAFzilla 2.15 | 29 | 100% |
| tvv.micro.Antares 1.1.1 | 13 | 100% |
| sam.Samspin 1.0 | 6 | 100% |
| donjezza.Muncho 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 137 of 280 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 64 | 47% | 77 |
| ne.Chimera 1.2 | 30 | 22% | 62 |
| ejb.Polaris 1.0.1 | 16 | 12% | 62 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 6% | 12 |
| sam.Samspin 1.0 | 6 | 4% | 9 |
| tvv.micro.Antares 1.1.1 | 5 | 4% | 13 |
| kurios.DOSexe .9b | 5 | 4% | 12 |
| vStar.RAFzilla 2.15 | 2 | 1% | 28 |
| donjezza.Muncho 1.0 | 1 | 1% | 3 |

## Melee bench: F11

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 72.4 | 65 / 280 | 3.48 | 15.4% | 35656 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.5% | 140 |
| hadur117.micro.SaorLA 0.1 | 2.0 | 15.4% | 65 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.5% | 35 |
| djc.DynaBot 0.1.1 | 4.3 | 10.3% | 10 |
| rdt199.Warlord 0.73 | 6.0 | 8.5% | 12 |
| br2.MobyDickBot 1.6 | 6.1 | 8.7% | 9 |
| uji.YellohFellah 1.0 | 6.8 | 8.0% | 10 |
| KiraNL.Chupacabra 0.4 | 7.0 | 7.9% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.8% | 0 |
| stelo.MirrorNano 1.3 | 9.6 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 69.5 | 8 / 35 | 4375 |
| 2 | 2 | 66.2 | 78.7 | 11 / 35 | 4854 |
| 3 | 2 | 59.0 | 65.4 | 5 / 35 | 3633 |
| 4 | 2 | 60.3 | 64.4 | 6 / 35 | 4470 |
| 5 | 2 | 64.9 | 79.7 | 13 / 35 | 4222 |
| 6 | 2 | 63.4 | 73.3 | 5 / 35 | 4711 |
| 7 | 2 | 64.5 | 75.2 | 8 / 35 | 4854 |
| 8 | 2 | 64.0 | 73.0 | 9 / 35 | 4537 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 88 | 13% |
| cx.mini.Nimrod 0.55 | 27 | 67% |
| djc.DynaBot 0.1.1 | 18 | 94% |
| br2.MobyDickBot 1.6 | 7 | 100% |
| rdt199.Warlord 0.73 | 7 | 86% |
| uji.YellohFellah 1.0 | 5 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 215 of 280 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 130 | 60% | 141 |
| cx.mini.Nimrod 0.55 | 35 | 16% | 53 |
| KiraNL.Chupacabra 0.4 | 15 | 7% | 17 |
| br2.MobyDickBot 1.6 | 8 | 4% | 12 |
| rdt199.Warlord 0.73 | 7 | 3% | 15 |
| stelo.MirrorNano 1.3 | 7 | 3% | 7 |
| djc.DynaBot 0.1.1 | 5 | 2% | 17 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 2% | 6 |
| uji.YellohFellah 1.0 | 3 | 1% | 12 |

## Melee bench: F12

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 80.0 | 120 / 280 | 2.80 | 16.7% | 31313 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.1 | 16.7% | 120 |
| bts.wiki.RipCurl 0.9b | 2.8 | 13.6% | 54 |
| darkcanuck.Leon 1.01 | 3.1 | 13.0% | 30 |
| nat.PallasHawk 1.0 | 3.1 | 12.7% | 46 |
| brainfade.melee.Genghis 0.36 | 4.9 | 10.7% | 22 |
| jrm.Test0 1.0 | 6.3 | 8.4% | 2 |
| cs.sheldor.Talon 1.1 | 7.5 | 7.1% | 1 |
| jp.Perpy 16.0 | 7.8 | 6.8% | 1 |
| stuff.Vlad 0.1 | 9.0 | 5.9% | 0 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 86.3 | 16 / 35 | 4170 |
| 2 | 2 | 62.8 | 72.7 | 9 / 35 | 4041 |
| 3 | 1 | 65.5 | 82.5 | 16 / 35 | 3690 |
| 4 | 1 | 66.2 | 79.7 | 15 / 35 | 4172 |
| 5 | 1 | 65.5 | 82.2 | 16 / 35 | 3786 |
| 6 | 1 | 66.8 | 83.8 | 17 / 35 | 4149 |
| 7 | 1 | 63.5 | 76.5 | 15 / 35 | 3521 |
| 8 | 1 | 64.7 | 75.9 | 16 / 35 | 3784 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 53 | 70% |
| bts.wiki.RipCurl 0.9b | 52 | 54% |
| darkcanuck.Leon 1.01 | 29 | 79% |
| brainfade.melee.Genghis 0.36 | 24 | 63% |
| jrm.Test0 1.0 | 7 | 86% |
| jp.Perpy 16.0 | 5 | 100% |
| jaybot.bots.Oddball 4.0 | 4 | 25% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |

Hadur died in 161 of 280 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 52 | 32% | 77 |
| nat.PallasHawk 1.0 | 39 | 24% | 77 |
| darkcanuck.Leon 1.01 | 19 | 12% | 54 |
| brainfade.melee.Genghis 0.36 | 17 | 11% | 26 |
| jp.Perpy 16.0 | 13 | 8% | 17 |
| jrm.Test0 1.0 | 11 | 7% | 13 |
| cs.sheldor.Talon 1.1 | 5 | 3% | 7 |
| jaybot.bots.Oddball 4.0 | 5 | 3% | 6 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |

## Melee bench: F13

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 67.1 | 12 / 280 | 3.96 | 13.4% | 33478 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.4 | 17.5% | 88 |
| mn.Combat 3.25.0 | 1.6 | 17.1% | 136 |
| hadur117.micro.SaorLA 0.1 | 3.3 | 13.4% | 12 |
| shinh.Entangled 0.3 | 4.1 | 12.4% | 29 |
| gh.micro.Gruweltje 0.7 | 4.6 | 11.5% | 14 |
| apc.Colossus2 0.17 | 6.0 | 8.1% | 1 |
| stelo.Wang 1.0 | 7.3 | 6.4% | 0 |
| ayk.WallHugger 1.0 | 8.0 | 5.6% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.3 | 62.2 | 3 / 35 | 4532 |
| 2 | 3 | 61.4 | 68.9 | 1 / 35 | 4124 |
| 3 | 3 | 60.6 | 64.4 | 1 / 35 | 4330 |
| 4 | 3 | 60.3 | 69.5 | 0 / 35 | 3871 |
| 5 | 3 | 62.1 | 72.1 | 1 / 35 | 4223 |
| 6 | 3 | 60.4 | 65.7 | 2 / 35 | 4128 |
| 7 | 3 | 61.5 | 68.6 | 3 / 35 | 4282 |
| 8 | 4 | 60.7 | 65.7 | 1 / 35 | 3988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 32 | 13% |
| mn.Combat 3.25.0 | 24 | 13% |
| shinh.Entangled 0.3 | 6 | 17% |
| stelo.Wang 1.0 | 3 | 100% |
| gh.micro.Gruweltje 0.7 | 2 | 50% |

Hadur died in 268 of 280 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 101 | 38% | 104 |
| ags.Glacier 0.2.11 | 99 | 37% | 104 |
| shinh.Entangled 0.3 | 30 | 11% | 31 |
| gh.micro.Gruweltje 0.7 | 11 | 4% | 12 |
| stelo.Wang 1.0 | 10 | 4% | 12 |
| maribo.FollowFire 1 | 7 | 3% | 7 |
| ayk.WallHugger 1.0 | 7 | 3% | 7 |
| apc.Colossus2 0.17 | 3 | 1% | 3 |

## Melee bench: F14

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 78.2 | 170 / 280 | 2.96 | 17.7% | 41881 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.1 | 17.7% | 170 |
| simonton.micro.Sprout 1.1.3 | 1.9 | 14.9% | 31 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.2% | 46 |
| Lo_Ian.Gandalf_V4 4.0 | 4.6 | 10.0% | 6 |
| sanyi.mikrobi.Roberto 1.0 | 5.6 | 9.6% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.9 | 9.6% | 3 |
| co.edu.usb.rc.LidisTron 1.0 | 6.0 | 9.6% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 8.0% | 13 |
| pa.Improved 1.0 | 8.9 | 6.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 69.5 | 18 / 35 | 5293 |
| 2 | 1 | 67.1 | 78.1 | 22 / 35 | 5225 |
| 3 | 1 | 66.9 | 76.8 | 23 / 35 | 5265 |
| 4 | 1 | 67.5 | 79.7 | 21 / 35 | 5464 |
| 5 | 1 | 66.7 | 79.4 | 18 / 35 | 5122 |
| 6 | 2 | 64.4 | 69.8 | 18 / 35 | 4799 |
| 7 | 1 | 71.7 | 94.6 | 30 / 35 | 5915 |
| 8 | 1 | 66.3 | 77.8 | 20 / 35 | 4798 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 118 | 92% |
| catcat20.shape.Theta 0.018 | 49 | 59% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 92% |
| sanyi.mikrobi.Roberto 1.0 | 11 | 91% |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 111 of 280 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 49 | 44% | 146 |
| catcat20.shape.Theta 0.018 | 26 | 23% | 52 |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 10% | 14 |
| sanyi.mikrobi.Roberto 1.0 | 9 | 8% | 22 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 6% | 22 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 5% | 9 |
| sample.TrackFire 1.0 | 2 | 2% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 1% | 4 |
| pa.Improved 1.0 | 1 | 1% | 4 |

## Melee bench: F15

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 85.8 | 167 / 280 | 2.28 | 19.8% | 48731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 19.8% | 167 |
| kawigi.micro.Shiz 1.1 | 2.9 | 12.8% | 14 |
| mld.DustBunny 3.8 | 3.0 | 12.5% | 9 |
| emp.Yngwie 1.11 | 3.1 | 12.7% | 62 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.2% | 10 |
| kawigi.robot.Girl 1.2 | 5.6 | 9.0% | 17 |
| Grystrion.TrackerWO 1.0 | 7.3 | 7.2% | 0 |
| lambdaxy.TBot 0.1 | 7.8 | 6.6% | 0 |
| divineomega.TrialBot 0.003 | 8.9 | 5.5% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 84.1 | 21 / 35 | 5924 |
| 2 | 1 | 68.7 | 84.1 | 18 / 35 | 5699 |
| 3 | 1 | 69.4 | 87.0 | 20 / 35 | 5779 |
| 4 | 1 | 69.9 | 83.8 | 22 / 35 | 6453 |
| 5 | 1 | 70.5 | 87.3 | 22 / 35 | 6342 |
| 6 | 1 | 70.5 | 87.3 | 24 / 35 | 6177 |
| 7 | 1 | 68.1 | 81.3 | 14 / 35 | 6123 |
| 8 | 1 | 71.5 | 91.7 | 26 / 35 | 6234 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 55 | 45% |
| kawigi.micro.Shiz 1.1 | 48 | 100% |
| mld.DustBunny 3.8 | 45 | 100% |
| kawigi.robot.Girl 1.2 | 27 | 78% |
| cb.nano.Insomnia 1.0 | 19 | 89% |
| divineomega.TrialBot 0.003 | 6 | 100% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 113 of 280 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 58 | 51% | 105 |
| cb.nano.Insomnia 1.0 | 16 | 14% | 15 |
| mld.DustBunny 3.8 | 13 | 12% | 53 |
| kawigi.robot.Girl 1.2 | 10 | 9% | 22 |
| kawigi.micro.Shiz 1.1 | 7 | 6% | 48 |
| Grystrion.TrackerWO 1.0 | 6 | 5% | 11 |
| lambdaxy.TBot 0.1 | 2 | 2% | 9 |
| divineomega.TrialBot 0.003 | 1 | 1% | 11 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 84.3 | 115 / 280 | 2.41 | 18.9% | 47139 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 18.9% | 115 |
| gh.Griezel 0.5.2 | 2.0 | 16.7% | 107 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.1 | 13.0% | 10 |
| techdude.forest.FlamingForest 1.1 | 3.9 | 10.5% | 32 |
| tvv.nano.Polaris 1.2 | 5.6 | 8.8% | 6 |
| bvh.fnr.Fenrir 0.36l | 5.8 | 8.8% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 7.6% | 5 |
| repositorio.NanoStep 1.0 | 8.5 | 5.7% | 1 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.3% | 2 |
| asd.Cthulhu 1.3 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 86.0 | 13 / 35 | 5711 |
| 2 | 1 | 67.9 | 79.0 | 17 / 35 | 5719 |
| 3 | 1 | 70.2 | 88.6 | 14 / 35 | 6190 |
| 4 | 1 | 70.9 | 91.4 | 22 / 35 | 6025 |
| 5 | 1 | 67.1 | 82.2 | 10 / 35 | 5308 |
| 6 | 1 | 69.3 | 83.5 | 13 / 35 | 6340 |
| 7 | 1 | 69.0 | 84.8 | 12 / 35 | 5832 |
| 8 | 1 | 67.8 | 78.7 | 14 / 35 | 6014 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 114 | 29% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 41 | 93% |
| techdude.forest.FlamingForest 1.1 | 33 | 42% |
| divineomega.DivineBot 1.9.4.5 | 12 | 100% |
| tvv.nano.Polaris 1.2 | 7 | 71% |
| bvh.fnr.Fenrir 0.36l | 6 | 83% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 165 of 280 rounds, at a mean tick of 1493. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 100 | 61% | 144 |
| techdude.forest.FlamingForest 1.1 | 21 | 13% | 37 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 12 | 7% | 37 |
| bvh.fnr.Fenrir 0.36l | 11 | 7% | 13 |
| stelo.IntrinsicVolatility 1.4 | 8 | 5% | 18 |
| tvv.nano.Polaris 1.2 | 4 | 2% | 8 |
| divineomega.DivineBot 1.9.4.5 | 3 | 2% | 12 |
| repositorio.NanoStep 1.0 | 3 | 2% | 7 |
| asd.Cthulhu 1.3 | 3 | 2% | 3 |

## Melee bench: F17

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 80.6 | 124 / 280 | 2.75 | 17.6% | 40159 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 17.6% | 124 |
| et.Predator 1.8 | 2.9 | 12.9% | 31 |
| oog.melee.Mercutio 1.0 | 3.0 | 12.6% | 39 |
| cx.BlestPain 1.41 | 3.8 | 12.2% | 61 |
| nic.Nicator 2.4 | 5.1 | 11.1% | 13 |
| ahf.NanoAndrew .4 | 5.3 | 10.6% | 10 |
| maribo.melee.BMV 0.1 | 7.0 | 8.7% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.4 | 5.9% | 0 |
| tex.Longbot 0.4 | 8.6 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 75.6 | 16 / 35 | 4636 |
| 2 | 1 | 62.9 | 68.9 | 9 / 35 | 4666 |
| 3 | 1 | 68.5 | 88.6 | 17 / 35 | 4792 |
| 4 | 1 | 66.3 | 77.8 | 14 / 35 | 5252 |
| 5 | 1 | 69.9 | 88.3 | 20 / 35 | 5515 |
| 6 | 1 | 68.6 | 85.7 | 17 / 35 | 5329 |
| 7 | 1 | 66.2 | 77.5 | 14 / 35 | 4928 |
| 8 | 1 | 67.7 | 82.2 | 17 / 35 | 5041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 48 | 75% |
| cx.BlestPain 1.41 | 46 | 22% |
| oog.melee.Mercutio 1.0 | 41 | 76% |
| nic.Nicator 2.4 | 27 | 78% |
| ahf.NanoAndrew .4 | 20 | 100% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 158 of 280 rounds, at a mean tick of 1093. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 43 | 27% | 54 |
| oog.melee.Mercutio 1.0 | 33 | 21% | 67 |
| et.Predator 1.8 | 31 | 20% | 63 |
| ahf.NanoAndrew .4 | 19 | 12% | 40 |
| nic.Nicator 2.4 | 16 | 10% | 38 |
| maribo.melee.BMV 0.1 | 5 | 3% | 7 |
| goblin.Bender 2.4 | 5 | 3% | 5 |
| tex.Longbot 0.4 | 5 | 3% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 2 |

## Melee bench: F18

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.2 | 157 / 280 | 2.43 | 18.3% | 37546 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 18.3% | 157 |
| morbid.MorbidPriest 1.0 | 2.3 | 12.8% | 43 |
| agd.Mooserwirt2 2.7 | 2.9 | 12.2% | 43 |
| uji.DBH 1.1 | 4.8 | 10.4% | 9 |
| ratosh.Nobo 0.21 | 4.9 | 10.1% | 3 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.6% | 6 |
| sigterm.Sigterm 1.0 | 7.1 | 7.9% | 13 |
| kawigi.mini.Fhqwhgads 1.1 | 7.9 | 7.5% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.0 | 5.6% | 0 |
| stelo.WangRobot 1.0 | 9.8 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 83.2 | 19 / 35 | 4586 |
| 2 | 1 | 66.6 | 80.6 | 17 / 35 | 4665 |
| 3 | 1 | 67.9 | 87.0 | 20 / 35 | 4634 |
| 4 | 1 | 66.7 | 82.2 | 17 / 35 | 4788 |
| 5 | 1 | 69.1 | 88.3 | 24 / 35 | 4937 |
| 6 | 1 | 67.1 | 81.3 | 21 / 35 | 4800 |
| 7 | 1 | 66.6 | 83.8 | 18 / 35 | 4422 |
| 8 | 1 | 68.6 | 87.0 | 21 / 35 | 4714 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 51 | 61% |
| agd.Mooserwirt2 2.7 | 40 | 75% |
| uji.DBH 1.1 | 37 | 89% |
| sigterm.Sigterm 1.0 | 23 | 74% |
| spinnercat.Robovirus 2.718 | 16 | 88% |
| ratosh.Nobo 0.21 | 15 | 93% |
| stelo.WangRobot 1.0 | 12 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 83% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 124 of 280 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 38 | 31% | 76 |
| agd.Mooserwirt2 2.7 | 30 | 24% | 69 |
| uji.DBH 1.1 | 13 | 10% | 29 |
| kawigi.mini.Fhqwhgads 1.1 | 11 | 9% | 18 |
| spinnercat.Robovirus 2.718 | 8 | 6% | 21 |
| sigterm.Sigterm 1.0 | 8 | 6% | 21 |
| ratosh.Nobo 0.21 | 7 | 6% | 25 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 7 | 6% | 12 |
| stelo.WangRobot 1.0 | 2 | 2% | 9 |

## Melee bench: F19

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 92.6 | 240 / 280 | 1.66 | 21.2% | 47342 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 21.2% | 240 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.1% | 14 |
| mld.Infinity 2.2 | 2.8 | 12.9% | 12 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 10.6% | 2 |
| erdnis.Rover 0.3 | 4.6 | 10.6% | 3 |
| patson.PatsonTestBot 1.0 | 6.3 | 9.0% | 5 |
| mbh.Mbh 0.1 | 7.3 | 7.3% | 1 |
| pac.ABC 2.1 | 7.4 | 7.1% | 3 |
| pbg.R2D2 1.0 | 9.0 | 5.8% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 89.5 | 30 / 35 | 5976 |
| 2 | 1 | 72.3 | 94.6 | 30 / 35 | 5903 |
| 3 | 1 | 71.9 | 92.7 | 31 / 35 | 5730 |
| 4 | 1 | 72.0 | 92.7 | 31 / 35 | 5739 |
| 5 | 1 | 71.8 | 93.0 | 27 / 35 | 5923 |
| 6 | 1 | 72.4 | 93.0 | 30 / 35 | 6142 |
| 7 | 1 | 71.2 | 90.8 | 29 / 35 | 5821 |
| 8 | 1 | 72.7 | 94.6 | 32 / 35 | 6108 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 119 | 95% |
| mld.Infinity 2.2 | 85 | 99% |
| krillr.mini.JointStrike 2.0.0 | 15 | 87% |
| erdnis.Rover 0.3 | 14 | 93% |
| patson.PatsonTestBot 1.0 | 10 | 100% |
| pac.ABC 2.1 | 6 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 41 of 280 rounds, at a mean tick of 550. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 14 | 34% | 136 |
| erdnis.Rover 0.3 | 8 | 20% | 26 |
| mld.Infinity 2.2 | 7 | 17% | 32 |
| krillr.mini.JointStrike 2.0.0 | 5 | 12% | 29 |
| mbh.Mbh 0.1 | 3 | 7% | 22 |
| pac.ABC 2.1 | 2 | 5% | 7 |
| patson.PatsonTestBot 1.0 | 1 | 2% | 12 |
| pbg.R2D2 1.0 | 1 | 2% | 7 |

## Melee bench: F20

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.6 | 145 / 280 | 2.20 | 19.2% | 44554 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 19.2% | 145 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.7% | 63 |
| fwb.Nine 1.0.1 | 3.1 | 12.3% | 42 |
| catcat20.Rabbit 0.001 | 4.3 | 9.9% | 18 |
| nz.jdc.nano.GridFu 1.0 | 4.9 | 9.3% | 4 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 7.9% | 3 |
| bayen.nut.Squirrel 1.615 | 7.3 | 7.6% | 5 |
| djdjdj.NanoSkunk10 1.0 | 7.4 | 7.4% | 2 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 6.0% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 87.0 | 16 / 35 | 5274 |
| 2 | 1 | 67.9 | 85.4 | 15 / 35 | 5454 |
| 3 | 1 | 68.9 | 86.3 | 16 / 35 | 5581 |
| 4 | 1 | 68.2 | 83.5 | 17 / 35 | 5751 |
| 5 | 1 | 68.3 | 84.4 | 19 / 35 | 5253 |
| 6 | 1 | 70.2 | 89.8 | 24 / 35 | 5617 |
| 7 | 1 | 70.5 | 94.0 | 21 / 35 | 5805 |
| 8 | 1 | 68.7 | 82.5 | 17 / 35 | 5819 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 88 | 67% |
| fwb.Nine 1.0.1 | 52 | 54% |
| catcat20.Rabbit 0.001 | 24 | 83% |
| bayen.nut.Squirrel 1.615 | 13 | 100% |
| nz.jdc.nano.GridFu 1.0 | 12 | 92% |
| djdjdj.NanoSkunk10 1.0 | 7 | 100% |
| m3thos.mini.Eva01 0.5.5 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 140 of 280 rounds, at a mean tick of 1205. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 69 | 49% | 122 |
| fwb.Nine 1.0.1 | 35 | 25% | 49 |
| catcat20.Rabbit 0.001 | 14 | 10% | 37 |
| bayen.nut.Squirrel 1.615 | 6 | 4% | 17 |
| nz.jdc.nano.GridFu 1.0 | 5 | 4% | 25 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 2% | 7 |
| m3thos.mini.Eva01 0.5.5 | 2 | 1% | 9 |
| djdjdj.NanoSkunk10 1.0 | 2 | 1% | 9 |
| ntc.ControlledChaos 1.1.4 | 2 | 1% | 4 |
2 death(s) with no robot to name.

## Melee bench: F21

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.0 | 144 / 280 | 2.08 | 19.5% | 45195 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.1 | 19.5% | 144 |
| eem.EvBot v4.6.16 | 1.9 | 16.2% | 105 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.9% | 15 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 5 |
| eld.Hmm 1.0 | 5.4 | 8.1% | 10 |
| oa.weak.BotherBot 0.1 | 5.6 | 8.0% | 1 |
| fire219.CatBot 1.0 | 7.3 | 6.5% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.2% | 1 |
| PSW.Relentless 0.1 | 9.0 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 86.3 | 17 / 35 | 6281 |
| 2 | 1 | 71.0 | 93.0 | 20 / 35 | 5678 |
| 3 | 1 | 69.7 | 89.5 | 22 / 35 | 5044 |
| 4 | 2 | 68.1 | 82.5 | 14 / 35 | 5199 |
| 5 | 1 | 70.9 | 92.1 | 23 / 35 | 5806 |
| 6 | 1 | 69.7 | 89.5 | 16 / 35 | 5607 |
| 7 | 1 | 68.8 | 85.1 | 15 / 35 | 5702 |
| 8 | 1 | 69.4 | 86.0 | 17 / 35 | 5878 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 125 | 44% |
| dummy.mini.Scimitar 1.01 | 47 | 89% |
| cf.RiO.RiOx 4.2.1 | 32 | 94% |
| eld.Hmm 1.0 | 12 | 83% |
| oa.weak.BotherBot 0.1 | 4 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 136 of 280 rounds, at a mean tick of 1288. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 87 | 64% | 137 |
| dummy.mini.Scimitar 1.01 | 21 | 15% | 69 |
| cf.RiO.RiOx 4.2.1 | 6 | 4% | 27 |
| oa.weak.BotherBot 0.1 | 6 | 4% | 11 |
| eld.Hmm 1.0 | 5 | 4% | 21 |
| PSW.Relentless 0.1 | 4 | 3% | 4 |
| el.JumpShoot 0.2 | 3 | 2% | 3 |
| arthord.MannyPacquiao Beta | 2 | 1% | 5 |
| fire219.CatBot 1.0 | 2 | 1% | 3 |

## Melee bench: F23

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 82.8 | 135 / 280 | 2.55 | 19.2% | 48753 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.1 | 19.2% | 135 |
| pe.SandboxLump 1.52 | 1.9 | 16.7% | 96 |
| cre.Karolos 0.32 | 3.0 | 13.7% | 29 |
| stelo.RamTrackSurfer 1.2 | 4.3 | 10.0% | 8 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.2% | 1 |
| stelo.AreaTargetingBot 1.1 | 5.6 | 9.3% | 6 |
| cw.megas.Blade 0.8 | 6.6 | 8.5% | 3 |
| sample.Walls 1.0 | 8.0 | 7.7% | 2 |
| cli.WasteOfAmmo 1.0 | 9.1 | 3.7% | 0 |
| rrh.Iwillfindyou 2.0 | 9.9 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 85.4 | 18 / 35 | 6019 |
| 2 | 1 | 69.2 | 80.3 | 16 / 35 | 5814 |
| 3 | 1 | 69.5 | 83.2 | 16 / 35 | 6148 |
| 4 | 1 | 68.9 | 79.4 | 17 / 35 | 5857 |
| 5 | 1 | 68.7 | 79.0 | 18 / 35 | 5937 |
| 6 | 2 | 70.1 | 85.4 | 15 / 35 | 5935 |
| 7 | 1 | 71.3 | 87.9 | 18 / 35 | 6703 |
| 8 | 1 | 70.2 | 81.9 | 17 / 35 | 6340 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 114 | 50% |
| cre.Karolos 0.32 | 41 | 71% |
| stelo.AreaTargetingBot 1.1 | 26 | 88% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 13 | 100% |
| stelo.RamTrackSurfer 1.2 | 9 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 146 of 280 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 86 | 59% | 151 |
| cre.Karolos 0.32 | 25 | 17% | 53 |
| stelo.AreaTargetingBot 1.1 | 15 | 10% | 30 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 5% | 16 |
| cw.megas.Blade 0.8 | 7 | 5% | 12 |
| stelo.RamTrackSurfer 1.2 | 4 | 3% | 12 |
| sample.Walls 1.0 | 1 | 1% | 4 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 66.8 | 63 / 280 | 3.99 | 14.1% | 32192 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 2.1 | 14.1% | 63 |
| rz.GlowBlowMelee 1.4 | 2.3 | 13.9% | 56 |
| davidalves.Phoenix 0.54 | 2.9 | 13.4% | 68 |
| florent.XSeries.X2 0.12 | 3.0 | 13.6% | 55 |
| pedersen.Ugluk 1.1.1 | 4.9 | 11.4% | 24 |
| oog.melee.Corsair 1.0 | 6.0 | 9.3% | 7 |
| stelo.SoJNanoMelee 1.1 | 7.1 | 7.0% | 5 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.4% | 1 |
| as.FrankTheTank 1.3 | 8.9 | 5.7% | 2 |
| evd.X1 0.01 | 9.9 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 75.2 | 10 / 35 | 4006 |
| 2 | 2 | 60.3 | 66.3 | 6 / 35 | 3691 |
| 3 | 2 | 62.0 | 68.9 | 11 / 35 | 4001 |
| 4 | 5 | 55.4 | 52.7 | 5 / 35 | 3644 |
| 5 | 1 | 62.0 | 67.0 | 10 / 35 | 4327 |
| 6 | 1 | 63.1 | 71.4 | 11 / 35 | 4228 |
| 7 | 2 | 62.2 | 71.1 | 6 / 35 | 4332 |
| 8 | 3 | 58.8 | 61.9 | 4 / 35 | 3963 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 27 | 33% |
| rz.GlowBlowMelee 1.4 | 27 | 63% |
| davidalves.Phoenix 0.54 | 24 | 13% |
| pedersen.Ugluk 1.1.1 | 20 | 65% |
| stelo.SoJNanoMelee 1.1 | 17 | 88% |
| oog.melee.Corsair 1.0 | 5 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 218 of 280 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 65 | 30% | 77 |
| davidalves.Phoenix 0.54 | 47 | 22% | 54 |
| rz.GlowBlowMelee 1.4 | 36 | 17% | 56 |
| pedersen.Ugluk 1.1.1 | 26 | 12% | 32 |
| oog.melee.Corsair 1.0 | 12 | 6% | 20 |
| stelo.SoJNanoMelee 1.1 | 10 | 5% | 19 |
| as.FrankTheTank 1.3 | 8 | 4% | 9 |
| evd.X1 0.01 | 7 | 3% | 7 |
| lunchie.Lunchbox 0.93 | 6 | 3% | 6 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 83.0 | 164 / 280 | 2.53 | 18.1% | 35275 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 18.1% | 164 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 12.9% | 26 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.4% | 20 |
| jdw.Hurricane 1.4 | 3.9 | 11.4% | 25 |
| gre.svman4.Morfeas 1.4.1 | 5.1 | 10.0% | 17 |
| ds.Oo 2.2 | 5.5 | 9.5% | 20 |
| gjr.Cephalosporin 0.1 | 7.4 | 7.6% | 8 |
| adt.Ar2 1.1 | 8.1 | 6.7% | 2 |
| awesomeness.Elite 1.0 | 8.5 | 6.7% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 79.7 | 18 / 35 | 4273 |
| 2 | 1 | 68.8 | 87.9 | 23 / 35 | 4434 |
| 3 | 1 | 69.0 | 88.6 | 21 / 35 | 4840 |
| 4 | 1 | 66.9 | 81.3 | 22 / 35 | 4432 |
| 5 | 1 | 67.4 | 82.9 | 21 / 35 | 4362 |
| 6 | 1 | 62.9 | 71.1 | 13 / 35 | 3990 |
| 7 | 1 | 69.1 | 90.5 | 23 / 35 | 4443 |
| 8 | 1 | 67.6 | 82.2 | 23 / 35 | 4501 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 56 | 93% |
| voidious.mini.BrokenSword 2.0.3 | 53 | 87% |
| jdw.Hurricane 1.4 | 40 | 78% |
| gre.svman4.Morfeas 1.4.1 | 16 | 69% |
| ds.Oo 2.2 | 12 | 50% |
| gjr.Cephalosporin 0.1 | 11 | 100% |
| awesomeness.Elite 1.0 | 5 | 100% |
| adt.Ar2 1.1 | 4 | 50% |
| amk.ChumbaMini 0.2 | 1 | 0% |

Hadur died in 117 of 280 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 26 | 22% | 56 |
| voidious.mini.BrokenSword 2.0.3 | 25 | 21% | 69 |
| voidious.micro.BlitzBat 1.05 | 22 | 19% | 67 |
| ds.Oo 2.2 | 14 | 12% | 23 |
| gre.svman4.Morfeas 1.4.1 | 12 | 10% | 25 |
| adt.Ar2 1.1 | 8 | 7% | 10 |
| awesomeness.Elite 1.0 | 4 | 3% | 10 |
| gjr.Cephalosporin 0.1 | 3 | 3% | 15 |
| amk.ChumbaMini 0.2 | 2 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 84.8 | 132 / 280 | 2.37 | 18.5% | 45258 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 18.5% | 132 |
| ak.Fermat 2.0 | 2.0 | 14.8% | 71 |
| lrem.Spectre 0.4.4 | 3.5 | 12.2% | 30 |
| shu.nitro.LENIN .T34 | 3.5 | 12.5% | 38 |
| js.PinBall 1.6 | 5.3 | 10.3% | 6 |
| gh.mini.GrubbmOne 1.0 | 6.1 | 9.5% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.6 | 8.7% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 7.1% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 74.0 | 16 / 35 | 5181 |
| 2 | 1 | 69.6 | 89.2 | 17 / 35 | 6033 |
| 3 | 1 | 68.3 | 84.8 | 18 / 35 | 5531 |
| 4 | 1 | 68.3 | 85.1 | 14 / 35 | 5605 |
| 5 | 1 | 68.5 | 85.1 | 14 / 35 | 5601 |
| 6 | 1 | 69.0 | 87.0 | 15 / 35 | 5793 |
| 7 | 1 | 68.7 | 83.5 | 22 / 35 | 5694 |
| 8 | 1 | 69.8 | 89.8 | 16 / 35 | 5820 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shu.nitro.LENIN .T34 | 64 | 70% |
| ak.Fermat 2.0 | 56 | 39% |
| lrem.Spectre 0.4.4 | 40 | 68% |
| js.PinBall 1.6 | 13 | 77% |
| jaybot.adv.bots.JayBot 2.0 | 12 | 100% |
| gh.mini.GrubbmOne 1.0 | 9 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 83% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 150 of 280 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 69 | 46% | 89 |
| shu.nitro.LENIN .T34 | 31 | 21% | 82 |
| lrem.Spectre 0.4.4 | 21 | 14% | 39 |
| js.PinBall 1.6 | 12 | 8% | 29 |
| gh.mini.GrubbmOne 1.0 | 5 | 3% | 17 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 3% | 14 |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 3% | 9 |
| sample.SpinBot 1.0 | 2 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 87.4 | 194 / 280 | 2.14 | 19.2% | 39798 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 19.2% | 194 |
| mk.Alpha 0.2.1 | 2.4 | 13.1% | 49 |
| sheldor.melee.nano.TestMelee 0.1 | 3.6 | 10.7% | 7 |
| wee.Gem 1.8.4 | 4.1 | 10.7% | 13 |
| EH.Eagle 1.0.6 | 4.6 | 9.8% | 6 |
| throxbot.ThroxBot 0.1 | 6.5 | 8.5% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 6.8 | 8.7% | 4 |
| joe.ADinosaur 1.0 | 7.9 | 7.2% | 1 |
| caimano.Furia_Ceca 0.22 | 8.9 | 6.7% | 2 |
| cs.Grudge 1.0 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 79.4 | 19 / 35 | 4784 |
| 2 | 1 | 71.0 | 93.7 | 27 / 35 | 5477 |
| 3 | 1 | 69.7 | 91.1 | 28 / 35 | 4806 |
| 4 | 1 | 69.2 | 88.9 | 22 / 35 | 5159 |
| 5 | 1 | 67.7 | 84.8 | 24 / 35 | 4948 |
| 6 | 1 | 69.5 | 90.5 | 27 / 35 | 4888 |
| 7 | 1 | 67.5 | 82.9 | 21 / 35 | 4706 |
| 8 | 1 | 69.1 | 87.9 | 26 / 35 | 5030 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 99 | 78% |
| wee.Gem 1.8.4 | 37 | 97% |
| sheldor.melee.nano.TestMelee 0.1 | 32 | 100% |
| EH.Eagle 1.0.6 | 19 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 11 | 100% |
| throxbot.ThroxBot 0.1 | 10 | 90% |
| joe.ADinosaur 1.0 | 7 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |

Hadur died in 88 of 280 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 33 | 38% | 101 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 13% | 45 |
| joe.ADinosaur 1.0 | 9 | 10% | 13 |
| wee.Gem 1.8.4 | 8 | 9% | 49 |
| throxbot.ThroxBot 0.1 | 8 | 9% | 16 |
| caimano.Furia_Ceca 0.22 | 6 | 7% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 5 | 6% | 17 |
| EH.Eagle 1.0.6 | 4 | 5% | 21 |
| cs.Grudge 1.0 | 3 | 3% | 4 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 84.4 | 162 / 280 | 2.40 | 18.1% | 35613 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 18.1% | 162 |
| kid.test.NightFox .2 | 2.1 | 14.2% | 46 |
| uji.Antique 1.0 | 3.4 | 11.7% | 31 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 11.3% | 25 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.3% | 6 |
| amk.ChumbaWumba 0.3 | 6.6 | 8.1% | 4 |
| ahr.ice.Ice 1.0.2 | 6.8 | 8.1% | 2 |
| matt.advanced.Katana 1.0 | 7.6 | 6.9% | 3 |
| stelo.PianistNano 1.2 | 9.1 | 5.9% | 1 |
| stelo.Lifestealer 1.0 | 9.6 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 80.3 | 18 / 35 | 3778 |
| 2 | 1 | 68.7 | 87.3 | 25 / 35 | 4752 |
| 3 | 1 | 67.5 | 86.0 | 22 / 35 | 4395 |
| 4 | 1 | 67.6 | 84.8 | 18 / 35 | 4552 |
| 5 | 1 | 67.7 | 84.1 | 20 / 35 | 4603 |
| 6 | 1 | 66.8 | 81.3 | 19 / 35 | 4563 |
| 7 | 1 | 67.7 | 84.8 | 21 / 35 | 4640 |
| 8 | 1 | 67.6 | 86.7 | 19 / 35 | 4330 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 98 | 76% |
| uji.Antique 1.0 | 41 | 83% |
| qohnil.blot.BlotBot 3.61 | 28 | 46% |
| ahr.ice.Ice 1.0.2 | 13 | 85% |
| amk.ChumbaWumba 0.3 | 12 | 100% |
| pfvicm.Sobieski 7.2.3b | 11 | 91% |
| stelo.PianistNano 1.2 | 4 | 100% |
| matt.advanced.Katana 1.0 | 4 | 100% |

Hadur died in 120 of 280 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 32 | 27% | 90 |
| qohnil.blot.BlotBot 3.61 | 25 | 21% | 50 |
| pfvicm.Sobieski 7.2.3b | 21 | 18% | 29 |
| uji.Antique 1.0 | 16 | 13% | 57 |
| amk.ChumbaWumba 0.3 | 11 | 9% | 15 |
| stelo.Lifestealer 1.0 | 6 | 5% | 7 |
| ahr.ice.Ice 1.0.2 | 5 | 4% | 17 |
| matt.advanced.Katana 1.0 | 2 | 2% | 9 |
| stelo.PianistNano 1.2 | 2 | 2% | 4 |

## Melee bench: F29

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 79.6 | 113 / 280 | 2.83 | 17.5% | 38194 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.1 | 17.5% | 113 |
| zyx.mega.YersiniaPestis 3.1 | 2.1 | 15.3% | 90 |
| deewiant.Anomaly 0.2 | 3.0 | 13.6% | 52 |
| myl.micro.Troodon 1.10 | 4.1 | 11.4% | 7 |
| jok.PheonixM 0.1.2 | 4.6 | 10.3% | 10 |
| ph.melee.ArcherME 0.3 | 6.1 | 8.4% | 0 |
| DBall.Anarchy 0.1 | 7.1 | 7.3% | 8 |
| fullsail.TimbotNoPrediction 1.0 | 7.9 | 6.3% | 0 |
| ap.Frederick 1.1 | 9.0 | 5.3% | 0 |
| jangs.ns51 1.0 | 9.9 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 77.8 | 10 / 35 | 4964 |
| 2 | 1 | 66.9 | 79.7 | 19 / 35 | 4449 |
| 3 | 2 | 63.8 | 69.8 | 10 / 35 | 4462 |
| 4 | 1 | 67.9 | 85.4 | 14 / 35 | 4995 |
| 5 | 1 | 67.1 | 81.3 | 13 / 35 | 4964 |
| 6 | 1 | 68.7 | 86.3 | 14 / 35 | 4867 |
| 7 | 1 | 67.9 | 84.4 | 17 / 35 | 4675 |
| 8 | 1 | 65.3 | 72.4 | 16 / 35 | 4818 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 70 | 56% |
| zyx.mega.YersiniaPestis 3.1 | 56 | 27% |
| myl.micro.Troodon 1.10 | 27 | 100% |
| jok.PheonixM 0.1.2 | 15 | 87% |
| DBall.Anarchy 0.1 | 11 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 169 of 280 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 69 | 41% | 86 |
| deewiant.Anomaly 0.2 | 59 | 35% | 107 |
| myl.micro.Troodon 1.10 | 13 | 8% | 33 |
| jok.PheonixM 0.1.2 | 12 | 7% | 22 |
| ph.melee.ArcherME 0.3 | 6 | 4% | 9 |
| fullsail.TimbotNoPrediction 1.0 | 5 | 3% | 8 |
| DBall.Anarchy 0.1 | 2 | 1% | 11 |
| jangs.ns51 1.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F30

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 57.5 | 34 / 280 | 4.83 | 12.4% | 33224 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 1.6 | 14.1% | 70 |
| catcat20.Matcha 0.006 | 2.3 | 13.7% | 68 |
| stelo.PastFuture 2.3.2 | 3.1 | 12.5% | 37 |
| hadur117.micro.SaorLA 0.1 | 4.0 | 12.4% | 34 |
| oog.melee.Capulet 1.2 | 4.0 | 12.3% | 38 |
| intruder.PrairieWolf 2.61 | 6.3 | 9.5% | 16 |
| ntc.Opposite 1.5 | 7.8 | 7.7% | 0 |
| tripphippy.Alice 1.1 | 7.9 | 7.2% | 8 |
| fowl3628800.LightningBolt 2.6.0 | 8.1 | 7.5% | 9 |
| GarmBox.Anger 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.2 | 64.4 | 5 / 35 | 4449 |
| 2 | 5 | 55.2 | 51.1 | 4 / 35 | 3870 |
| 3 | 5 | 57.9 | 56.5 | 7 / 35 | 4198 |
| 4 | 4 | 58.3 | 59.4 | 5 / 35 | 4199 |
| 5 | 2 | 62.2 | 71.1 | 4 / 35 | 4401 |
| 6 | 5 | 55.6 | 53.3 | 5 / 35 | 3907 |
| 7 | 5 | 55.5 | 52.4 | 2 / 35 | 4111 |
| 8 | 4 | 55.5 | 51.7 | 2 / 35 | 4089 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 27 | 37% |
| stelo.PastFuture 2.3.2 | 19 | 47% |
| catcat20.Matcha 0.006 | 15 | 33% |
| oog.melee.Capulet 1.2 | 8 | 50% |
| intruder.PrairieWolf 2.61 | 4 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 50% |
| tripphippy.Alice 1.1 | 2 | 100% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 247 of 280 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 63 | 26% | 67 |
| oog.melee.Capulet 1.2 | 48 | 19% | 57 |
| darkcanuck.B26354 1.06 | 47 | 19% | 56 |
| stelo.PastFuture 2.3.2 | 41 | 17% | 50 |
| tripphippy.Alice 1.1 | 14 | 6% | 14 |
| intruder.PrairieWolf 2.61 | 12 | 5% | 14 |
| ntc.Opposite 1.5 | 10 | 4% | 11 |
| fowl3628800.LightningBolt 2.6.0 | 9 | 4% | 8 |
| GarmBox.Anger 1.0 | 3 | 1% | 3 |

## Melee bench: F31

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 69.3 | 38 / 280 | 3.76 | 14.0% | 30127 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.3% | 150 |
| hadur117.micro.SaorLA 0.1 | 2.3 | 14.0% | 38 |
| gh.mini.Griezel 0.2 | 2.8 | 13.6% | 67 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.3% | 8 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.1% | 13 |
| gh.nano.Grofvuil 0.2 | 6.1 | 8.4% | 3 |
| fm.mammillarias 1.3 | 7.5 | 6.4% | 0 |
| timmit.nano.TimDog 0.33 | 7.8 | 6.8% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.5% | 0 |
| tlp.ThreeLeggedPig 1 | 9.9 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 69.2 | 6 / 35 | 3668 |
| 2 | 2 | 62.1 | 71.4 | 6 / 35 | 3949 |
| 3 | 3 | 59.8 | 64.8 | 4 / 35 | 3721 |
| 4 | 2 | 60.8 | 70.5 | 3 / 35 | 3782 |
| 5 | 2 | 61.6 | 71.7 | 4 / 35 | 3764 |
| 6 | 3 | 61.3 | 68.3 | 5 / 35 | 3871 |
| 7 | 2 | 60.1 | 66.3 | 5 / 35 | 3529 |
| 8 | 2 | 62.1 | 72.4 | 5 / 35 | 3843 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 56 | 7% |
| gh.mini.Griezel 0.2 | 30 | 17% |
| d414.nano.Quantum 1.0.0 | 15 | 80% |
| spinnercat.micro.Tyger 0.1 | 14 | 64% |
| gh.nano.Grofvuil 0.2 | 4 | 100% |
| timmit.nano.TimDog 0.33 | 3 | 67% |
| fm.mammillarias 1.3 | 1 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 242 of 280 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 124 | 51% | 133 |
| gh.mini.Griezel 0.2 | 41 | 17% | 51 |
| spinnercat.micro.Tyger 0.1 | 26 | 11% | 31 |
| d414.nano.Quantum 1.0.0 | 17 | 7% | 26 |
| gh.nano.Grofvuil 0.2 | 9 | 4% | 11 |
| fm.mammillarias 1.3 | 9 | 4% | 9 |
| timmit.nano.TimDog 0.33 | 8 | 3% | 9 |
| tlp.ThreeLeggedPig 1 | 5 | 2% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 1% | 5 |

## Melee bench: F32

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 77.8 | 119 / 280 | 3.00 | 16.9% | 39124 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 16.9% | 119 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.1% | 91 |
| apc.botM 3.0 | 3.3 | 11.9% | 27 |
| lxx.ConceptA 0.8 | 4.4 | 10.4% | 7 |
| vjik.UnViolation 1.1 | 4.4 | 10.4% | 15 |
| bayen.UbaMicro 1.4 | 6.3 | 8.8% | 9 |
| yk.JahMicro 1.0 | 7.5 | 7.1% | 3 |
| panzer.Panzer 0.2 | 7.8 | 7.3% | 0 |
| conscience.Electron 1.3g | 8.9 | 6.4% | 1 |
| donjezza.Jezza 1.0 | 9.6 | 5.7% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 74.6 | 12 / 35 | 5220 |
| 2 | 1 | 66.1 | 77.1 | 20 / 35 | 5072 |
| 3 | 1 | 66.1 | 81.0 | 15 / 35 | 4729 |
| 4 | 1 | 64.4 | 75.6 | 11 / 35 | 5011 |
| 5 | 1 | 67.4 | 85.4 | 15 / 35 | 5093 |
| 6 | 1 | 64.9 | 74.0 | 17 / 35 | 4999 |
| 7 | 1 | 62.9 | 71.4 | 12 / 35 | 4402 |
| 8 | 1 | 66.3 | 83.5 | 17 / 35 | 4598 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 76 | 39% |
| apc.botM 3.0 | 36 | 78% |
| lxx.ConceptA 0.8 | 29 | 93% |
| vjik.UnViolation 1.1 | 13 | 92% |
| donjezza.Jezza 1.0 | 10 | 80% |
| panzer.Panzer 0.2 | 5 | 100% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| yk.JahMicro 1.0 | 5 | 60% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 165 of 280 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 73 | 44% | 105 |
| lxx.ConceptA 0.8 | 29 | 18% | 39 |
| apc.botM 3.0 | 16 | 10% | 50 |
| vjik.UnViolation 1.1 | 13 | 8% | 35 |
| conscience.Electron 1.3g | 12 | 7% | 13 |
| yk.JahMicro 1.0 | 9 | 5% | 12 |
| bayen.UbaMicro 1.4 | 6 | 4% | 9 |
| panzer.Panzer 0.2 | 5 | 3% | 8 |
| donjezza.Jezza 1.0 | 2 | 1% | 9 |

## Melee bench: F33

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 82.4 | 143 / 280 | 2.59 | 18.6% | 42223 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 18.6% | 143 |
| maribo.Quester 0.3 | 2.0 | 15.8% | 65 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.4 | 12.0% | 19 |
| gre.svman4.Leonidas 1.3.2 | 4.1 | 11.1% | 19 |
| labg.Cataclysm 2.05 | 4.8 | 10.4% | 17 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.9% | 13 |
| baal.nano.N 1.42 | 6.5 | 8.9% | 4 |
| sanja.First 0.1 | 8.5 | 5.2% | 0 |
| zyx.micro.Ant 1.1 | 8.6 | 5.2% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.9 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 71.4 | 15 / 35 | 4978 |
| 2 | 1 | 70.5 | 86.0 | 23 / 35 | 5846 |
| 3 | 1 | 70.3 | 88.9 | 20 / 35 | 5536 |
| 4 | 1 | 69.3 | 86.3 | 16 / 35 | 5621 |
| 5 | 1 | 68.7 | 84.1 | 18 / 35 | 5027 |
| 6 | 1 | 67.0 | 79.0 | 17 / 35 | 5192 |
| 7 | 1 | 68.3 | 83.8 | 17 / 35 | 5152 |
| 8 | 1 | 67.4 | 79.4 | 17 / 35 | 4871 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 77 | 68% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 48 | 92% |
| gre.svman4.Leonidas 1.3.2 | 40 | 85% |
| labg.Cataclysm 2.05 | 15 | 27% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 63% |
| baal.nano.N 1.42 | 3 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 138 of 280 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 57 | 41% | 116 |
| labg.Cataclysm 2.05 | 20 | 14% | 32 |
| gre.svman4.Leonidas 1.3.2 | 19 | 14% | 43 |
| kinsen.melee.Angsaichmophobia 1.8c | 13 | 9% | 14 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 7% | 52 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 8 | 6% | 9 |
| zyx.micro.Ant 1.1 | 7 | 5% | 8 |
| baal.nano.N 1.42 | 2 | 1% | 3 |
| sanja.First 0.1 | 2 | 1% | 3 |

## Melee bench: F34

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 76.4 | 55 / 280 | 3.12 | 16.2% | 40265 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.8 | 16.7% | 112 |
| hadur117.micro.SaorLA 0.1 | 2.0 | 16.2% | 55 |
| kid.Gladiator .7.2 | 2.3 | 16.3% | 76 |
| jcs.Seth 1.8 | 4.4 | 11.3% | 26 |
| tcf.Reach 3 | 4.8 | 10.8% | 7 |
| cli.Dancer 1.1 | 5.9 | 9.6% | 4 |
| ratosh.Wesco 1.4 | 7.0 | 6.9% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.1 | 3.9% | 0 |
| sample.RamFire 1.0 | 9.9 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.2 | 82.2 | 8 / 35 | 5041 |
| 2 | 3 | 65.7 | 72.7 | 8 / 35 | 5031 |
| 3 | 1 | 66.7 | 81.3 | 9 / 35 | 5311 |
| 4 | 1 | 65.9 | 78.4 | 7 / 35 | 5065 |
| 5 | 1 | 67.0 | 80.6 | 6 / 35 | 5556 |
| 6 | 2 | 64.4 | 71.7 | 8 / 35 | 4705 |
| 7 | 3 | 65.0 | 73.0 | 7 / 35 | 4897 |
| 8 | 3 | 63.8 | 71.4 | 2 / 35 | 4659 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 76 | 28% |
| kid.Gladiator .7.2 | 36 | 39% |
| jcs.Seth 1.8 | 16 | 69% |
| cli.Dancer 1.1 | 7 | 43% |
| tcf.Reach 3 | 7 | 43% |
| ratosh.Wesco 1.4 | 1 | 100% |
| sample.RamFire 1.0 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 225 of 280 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 92 | 41% | 110 |
| kid.Gladiator .7.2 | 81 | 36% | 96 |
| tcf.Reach 3 | 20 | 9% | 24 |
| jcs.Seth 1.8 | 13 | 6% | 25 |
| cli.Dancer 1.1 | 9 | 4% | 13 |
| ratosh.Wesco 1.4 | 5 | 2% | 7 |
| sample.RamFire 1.0 | 2 | 1% | 2 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
| sample.VelociRobot 1.0 | 1 | 0% | 1 |

## Melee bench: F35

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 72.1 | 22 / 280 | 3.51 | 14.0% | 29515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.0% | 207 |
| hadur117.micro.SaorLA 0.1 | 2.4 | 14.0% | 22 |
| gh.mini.Gruwel 0.9 | 3.1 | 12.9% | 35 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.9 | 12.1% | 9 |
| rz.HawkOnFire 0.1 | 4.6 | 11.2% | 4 |
| wit.Chuliath 1.0 | 6.5 | 7.0% | 2 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 6.7% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.3 | 5.7% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 5.4% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 74.9 | 4 / 35 | 3936 |
| 2 | 2 | 63.6 | 78.4 | 4 / 35 | 3964 |
| 3 | 3 | 60.5 | 70.8 | 0 / 35 | 3465 |
| 4 | 2 | 62.1 | 72.4 | 6 / 35 | 3739 |
| 5 | 3 | 61.5 | 69.8 | 1 / 35 | 3970 |
| 6 | 3 | 59.5 | 65.7 | 2 / 35 | 3489 |
| 7 | 2 | 62.0 | 74.9 | 3 / 35 | 3509 |
| 8 | 2 | 60.9 | 69.8 | 2 / 35 | 3443 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 54 | 4% |
| gh.mini.Gruwel 0.9 | 24 | 13% |
| dmh.robocode.robot.BlackDeath 9.2 | 13 | 77% |
| rz.HawkOnFire 0.1 | 7 | 71% |
| myl.nano.KomoriNinja 1.1 | 2 | 100% |
| wit.Chuliath 1.0 | 2 | 0% |

Hadur died in 258 of 280 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 146 | 57% | 149 |
| gh.mini.Gruwel 0.9 | 47 | 18% | 50 |
| dmh.robocode.robot.BlackDeath 9.2 | 25 | 10% | 34 |
| rz.HawkOnFire 0.1 | 20 | 8% | 24 |
| wit.Chuliath 1.0 | 8 | 3% | 8 |
| stelo.MyAgileRobot 0.2 | 5 | 2% | 5 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 5 | 2% | 5 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 5 |

## Melee bench: F36

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 88.3 | 210 / 280 | 2.06 | 20.4% | 44651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 20.4% | 210 |
| alpha.RainingFire 1.0 | 2.5 | 12.1% | 22 |
| bzdp.Pansy 2.1 | 2.6 | 12.0% | 19 |
| mz.Cork 0.1 | 4.6 | 10.4% | 7 |
| bvh.micro.Freya 0.3 | 5.1 | 10.0% | 10 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.3% | 7 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.0% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 6.8% | 0 |
| dl.BetterWalls 1.0 | 8.9 | 5.7% | 1 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 92.7 | 27 / 35 | 5771 |
| 2 | 1 | 69.8 | 84.1 | 26 / 35 | 5675 |
| 3 | 1 | 70.9 | 90.5 | 25 / 35 | 5829 |
| 4 | 1 | 70.9 | 88.3 | 28 / 35 | 5664 |
| 5 | 1 | 68.6 | 81.3 | 23 / 35 | 5286 |
| 6 | 1 | 71.8 | 94.9 | 27 / 35 | 5838 |
| 7 | 1 | 69.8 | 87.6 | 26 / 35 | 5502 |
| 8 | 1 | 70.0 | 86.7 | 28 / 35 | 5086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 62 | 94% |
| bvh.micro.Freya 0.3 | 37 | 97% |
| mz.Cork 0.1 | 37 | 92% |
| alpha.RainingFire 1.0 | 34 | 79% |
| bvh.mini.Fenrir 0.39 | 24 | 100% |
| m3thos.Eva02 0.7.1 | 20 | 100% |
| sample.MyFirstRobot 1.0 | 7 | 86% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 70 of 280 rounds, at a mean tick of 669. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 18 | 26% | 75 |
| alpha.RainingFire 1.0 | 18 | 26% | 40 |
| mz.Cork 0.1 | 13 | 19% | 47 |
| bvh.mini.Fenrir 0.39 | 6 | 9% | 20 |
| bvh.micro.Freya 0.3 | 5 | 7% | 31 |
| m3thos.Eva02 0.7.1 | 3 | 4% | 31 |
| dl.BetterWalls 1.0 | 3 | 4% | 17 |
| squidM.TentalceMeleeNano 1.1 | 3 | 4% | 8 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 11 |

## Melee bench: F37

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 77.7 | 161 / 280 | 3.01 | 17.6% | 43372 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 17.6% | 161 |
| germ.TheMind .2 | 2.9 | 10.9% | 19 |
| EBBU.Sim2 1.02 | 3.5 | 10.7% | 16 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.6 | 10.4% | 14 |
| stelo.UntouchableNano 1.3 | 6.0 | 8.9% | 10 |
| agrach.Dalek 1.0 | 6.1 | 9.3% | 22 |
| mb.Beast 0.1 | 7.1 | 8.5% | 18 |
| lmk.ACPFinal 0.1 | 7.6 | 8.1% | 8 |
| skm.Ryubot 1.0 | 7.9 | 8.2% | 10 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 7.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 81.6 | 22 / 35 | 5719 |
| 2 | 1 | 66.2 | 77.5 | 18 / 35 | 5598 |
| 3 | 1 | 66.5 | 77.5 | 21 / 35 | 5812 |
| 4 | 1 | 66.7 | 77.8 | 22 / 35 | 5675 |
| 5 | 1 | 63.7 | 73.0 | 18 / 35 | 4860 |
| 6 | 1 | 67.1 | 82.2 | 21 / 35 | 5544 |
| 7 | 1 | 64.1 | 71.4 | 18 / 35 | 5068 |
| 8 | 1 | 66.0 | 80.3 | 21 / 35 | 5096 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 44 | 86% |
| EBBU.Sim2 1.02 | 33 | 88% |
| stelo.UntouchableNano 1.3 | 29 | 93% |
| mb.Beast 0.1 | 22 | 95% |
| skm.Ryubot 1.0 | 15 | 100% |
| agrach.Dalek 1.0 | 15 | 73% |
| com.syncleus.robocode.Dreadnaught 0.1 | 12 | 100% |
| lmk.ACPFinal 0.1 | 7 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 0% |

Hadur died in 121 of 280 rounds, at a mean tick of 364. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 22 | 18% | 48 |
| mn.nano.perceptual.Impact 1.3.0 | 21 | 17% | 21 |
| EBBU.Sim2 1.02 | 18 | 15% | 40 |
| germ.TheMind .2 | 16 | 13% | 42 |
| com.syncleus.robocode.Dreadnaught 0.1 | 14 | 12% | 36 |
| stelo.UntouchableNano 1.3 | 10 | 8% | 29 |
| lmk.ACPFinal 0.1 | 10 | 8% | 26 |
| mb.Beast 0.1 | 6 | 5% | 25 |
| skm.Ryubot 1.0 | 4 | 3% | 11 |

## Melee bench: F38

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 74.3 | 77 / 280 | 3.31 | 15.5% | 35057 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.3 | 17.0% | 135 |
| hadur117.micro.SaorLA 0.1 | 1.8 | 15.5% | 77 |
| bvh.mini.Freya 0.55 | 3.1 | 12.7% | 29 |
| bts.mega.Gnarly 1.4 | 4.3 | 10.9% | 19 |
| cs.Wren 1.0 | 5.0 | 10.4% | 7 |
| kdf.KoulDestroyer 1.0 | 6.1 | 9.2% | 6 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.5 | 8.7% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 6.0% | 0 |
| bzdp.BoxCar 2.0 | 9.3 | 4.9% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.1 | 64.1 | 4 / 35 | 4411 |
| 2 | 2 | 63.7 | 73.3 | 9 / 35 | 4372 |
| 3 | 1 | 64.6 | 76.8 | 13 / 35 | 4291 |
| 4 | 2 | 64.2 | 73.7 | 12 / 35 | 4541 |
| 5 | 2 | 64.3 | 76.2 | 8 / 35 | 4332 |
| 6 | 1 | 62.8 | 72.7 | 10 / 35 | 4287 |
| 7 | 2 | 65.7 | 83.5 | 11 / 35 | 4385 |
| 8 | 2 | 63.8 | 74.3 | 10 / 35 | 4438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 75 | 16% |
| bvh.mini.Freya 0.55 | 29 | 62% |
| bts.mega.Gnarly 1.4 | 22 | 68% |
| cs.Wren 1.0 | 17 | 94% |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 83% |
| kdf.KoulDestroyer 1.0 | 8 | 75% |
| matt.UnderDark3 2.4.34 | 1 | 0% |

Hadur died in 204 of 280 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 107 | 52% | 125 |
| bvh.mini.Freya 0.55 | 27 | 13% | 35 |
| bts.mega.Gnarly 1.4 | 21 | 10% | 45 |
| kdf.KoulDestroyer 1.0 | 15 | 7% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 5% | 22 |
| cs.Wren 1.0 | 10 | 5% | 17 |
| matt.UnderDark3 2.4.34 | 7 | 3% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 6 | 3% | 7 |
| bzdp.BoxCar 2.0 | 1 | 0% | 1 |

## Melee bench: F39

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 77.3 | 81 / 280 | 3.04 | 16.6% | 40469 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.1 | 16.6% | 81 |
| bvh.fry.Freya 0.82 | 2.3 | 14.5% | 44 |
| az.Ololobot 0.2.4 | 2.8 | 13.0% | 92 |
| catcat20.Lambda 0.024 | 3.9 | 11.3% | 45 |
| gimp.GimpBot 0.1 | 6.1 | 8.5% | 1 |
| winamp32.micro.MicroMacro 1.0 | 6.4 | 8.4% | 5 |
| apollokidd.ApolloKidd 0.9 | 6.6 | 7.9% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 6.9 | 7.8% | 12 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.4 | 6.2% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.6 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 73.0 | 6 / 35 | 5136 |
| 2 | 1 | 67.2 | 83.5 | 14 / 35 | 5620 |
| 3 | 1 | 64.0 | 74.6 | 15 / 35 | 4574 |
| 4 | 1 | 64.5 | 74.9 | 11 / 35 | 4987 |
| 5 | 2 | 63.6 | 74.3 | 6 / 35 | 4830 |
| 6 | 1 | 64.9 | 78.1 | 10 / 35 | 5074 |
| 7 | 1 | 65.5 | 79.7 | 10 / 35 | 5048 |
| 8 | 1 | 65.5 | 80.3 | 9 / 35 | 5200 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 59 | 15% |
| bvh.fry.Freya 0.82 | 44 | 61% |
| catcat20.Lambda 0.024 | 42 | 52% |
| stelo.SoRobotNanoMelee 1.2 | 19 | 95% |
| winamp32.micro.MicroMacro 1.0 | 3 | 67% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 199 of 280 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 69 | 35% | 82 |
| bvh.fry.Freya 0.82 | 50 | 25% | 75 |
| catcat20.Lambda 0.024 | 41 | 21% | 61 |
| stelo.SoRobotNanoMelee 1.2 | 12 | 6% | 21 |
| apollokidd.ApolloKidd 0.9 | 10 | 5% | 12 |
| winamp32.micro.MicroMacro 1.0 | 6 | 3% | 10 |
| gimp.GimpBot 0.1 | 4 | 2% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 4 | 2% | 4 |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 2% | 7 |

## Melee bench: F40

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 82.2 | 164 / 280 | 2.60 | 18.4% | 38839 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 18.4% | 164 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.0% | 61 |
| kano.gamma.KanoGamma 1.8 | 3.5 | 11.7% | 19 |
| mz.AntiGrav 1.0 | 4.3 | 10.7% | 9 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.4% | 9 |
| alpha.BlackIce 1.0 | 6.4 | 8.7% | 5 |
| stelo.Randomness 1.0 | 6.5 | 8.9% | 10 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.6% | 1 |
| testantiswapgun.AntiSwap 1.0 | 8.9 | 5.6% | 2 |
| sample.Corners 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 79.0 | 17 / 35 | 4668 |
| 2 | 1 | 69.1 | 82.2 | 23 / 35 | 5309 |
| 3 | 1 | 69.3 | 85.1 | 23 / 35 | 5211 |
| 4 | 1 | 65.5 | 74.3 | 16 / 35 | 4610 |
| 5 | 1 | 68.6 | 85.7 | 19 / 35 | 4877 |
| 6 | 1 | 69.5 | 89.2 | 25 / 35 | 4662 |
| 7 | 1 | 68.5 | 85.1 | 23 / 35 | 4828 |
| 8 | 1 | 66.0 | 76.8 | 18 / 35 | 4674 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 80 | 61% |
| kano.gamma.KanoGamma 1.8 | 41 | 88% |
| mz.AntiGrav 1.0 | 40 | 100% |
| Polkwane.SmashMelee 1.0 | 22 | 91% |
| stelo.Randomness 1.0 | 9 | 100% |
| alpha.BlackIce 1.0 | 6 | 83% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 116 of 280 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 49 | 42% | 89 |
| kano.gamma.KanoGamma 1.8 | 13 | 11% | 53 |
| stelo.Randomness 1.0 | 13 | 11% | 30 |
| mz.AntiGrav 1.0 | 10 | 9% | 40 |
| Polkwane.SmashMelee 1.0 | 10 | 9% | 26 |
| amk.superstrike.SuperStrike 0.3 | 9 | 8% | 14 |
| alpha.BlackIce 1.0 | 8 | 7% | 15 |
| testantiswapgun.AntiSwap 1.0 | 2 | 2% | 7 |
| sample.Corners 1.0 | 2 | 2% | 4 |

## Melee bench: F41

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 70.9 | 92 / 280 | 3.62 | 15.4% | 35979 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.4 | 16.3% | 113 |
| hadur117.micro.SaorLA 0.1 | 1.6 | 15.4% | 92 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.4% | 23 |
| ary.Swarm 1.1 | 3.5 | 12.8% | 30 |
| simonton.nano.MeleeSeed 1.8 | 5.4 | 10.1% | 12 |
| shrub.Silver v048 | 5.6 | 9.8% | 7 |
| zyx.nano.Ant 1.1 | 7.0 | 8.1% | 1 |
| jsal.Jsalbot 1.0 | 8.4 | 6.2% | 3 |
| stelo.Mirror 1.1 | 8.6 | 5.9% | 1 |
| acogdev.alpha 0.2 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 67.3 | 11 / 35 | 4305 |
| 2 | 2 | 60.2 | 62.2 | 6 / 35 | 4119 |
| 3 | 2 | 62.1 | 64.8 | 10 / 35 | 4695 |
| 4 | 2 | 63.0 | 65.4 | 12 / 35 | 4742 |
| 5 | 2 | 63.9 | 73.7 | 11 / 35 | 4261 |
| 6 | 1 | 66.8 | 82.5 | 14 / 35 | 4594 |
| 7 | 1 | 64.1 | 70.5 | 13 / 35 | 4538 |
| 8 | 1 | 67.0 | 80.6 | 15 / 35 | 4725 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 64 | 36% |
| lessonz.robocode.Oz 0.5.0 | 29 | 86% |
| ary.Swarm 1.1 | 24 | 83% |
| simonton.nano.MeleeSeed 1.8 | 19 | 84% |
| shrub.Silver v048 | 7 | 100% |
| jsal.Jsalbot 1.0 | 2 | 50% |

Hadur died in 188 of 280 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 87 | 46% | 118 |
| simonton.nano.MeleeSeed 1.8 | 36 | 19% | 50 |
| ary.Swarm 1.1 | 27 | 14% | 52 |
| zyx.nano.Ant 1.1 | 13 | 7% | 13 |
| lessonz.robocode.Oz 0.5.0 | 11 | 6% | 26 |
| acogdev.alpha 0.2 | 6 | 3% | 6 |
| shrub.Silver v048 | 4 | 2% | 9 |
| stelo.Mirror 1.1 | 3 | 2% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 2 |

## Melee bench: F42

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 80.0 | 80 / 280 | 2.80 | 17.0% | 42448 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.4 | 17.0% | 80 |
| wompi.Wallaby 5.1 | 1.6 | 17.2% | 123 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.0% | 31 |
| ara.Shera 0.88 | 3.8 | 12.7% | 37 |
| amz.NanoClone 1.41 | 5.1 | 9.0% | 2 |
| maribo.IotaCT 1.1 | 6.0 | 7.7% | 0 |
| dsw.StaticD 1.0 | 6.9 | 7.3% | 6 |
| stelo.MirrorMicro 1.0 | 8.4 | 5.9% | 1 |
| mme.NikeEnhanced 2.0 | 8.6 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 83.5 | 11 / 35 | 5787 |
| 2 | 2 | 65.6 | 77.5 | 7 / 35 | 5452 |
| 3 | 2 | 64.1 | 73.3 | 8 / 35 | 4789 |
| 4 | 1 | 66.8 | 82.5 | 9 / 35 | 5273 |
| 5 | 2 | 64.4 | 74.6 | 10 / 35 | 5028 |
| 6 | 1 | 66.1 | 81.3 | 9 / 35 | 5197 |
| 7 | 1 | 67.5 | 84.1 | 13 / 35 | 5231 |
| 8 | 1 | 68.2 | 83.2 | 13 / 35 | 5691 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 86 | 36% |
| ara.Shera 0.88 | 39 | 56% |
| maribo.mini.MiniQuester 0.1 | 30 | 77% |
| dsw.StaticD 1.0 | 4 | 75% |
| stelo.MirrorMicro 1.0 | 1 | 0% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 200 of 280 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 115 | 58% | 144 |
| ara.Shera 0.88 | 43 | 22% | 67 |
| maribo.mini.MiniQuester 0.1 | 21 | 11% | 43 |
| dsw.StaticD 1.0 | 6 | 3% | 9 |
| amz.NanoClone 1.41 | 6 | 3% | 6 |
| stelo.MirrorMicro 1.0 | 5 | 3% | 6 |
| maribo.IotaCT 1.1 | 3 | 2% | 3 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 71.7 | 25 / 280 | 3.55 | 14.0% | 30214 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.8% | 224 |
| hadur117.micro.SaorLA 0.1 | 2.1 | 14.0% | 25 |
| dummy.micro.Sparrow 2.5 | 3.6 | 12.0% | 10 |
| brainfade.melee.Dusk 0.44 | 3.9 | 11.7% | 14 |
| wcsv.melee.EngineerMelee 0.1 | 4.6 | 10.9% | 5 |
| Krabb.akim2.Akim2 1.1b | 5.9 | 9.3% | 1 |
| jab.DiamondStealer 5 | 7.0 | 7.9% | 0 |
| mz.NanoGod 2.02 | 7.9 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.6% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 67.0 | 2 / 35 | 3585 |
| 2 | 2 | 63.6 | 76.2 | 3 / 35 | 3781 |
| 3 | 2 | 63.9 | 73.3 | 5 / 35 | 3911 |
| 4 | 3 | 60.6 | 66.7 | 2 / 35 | 3574 |
| 5 | 2 | 62.4 | 71.1 | 3 / 35 | 3569 |
| 6 | 2 | 64.1 | 75.2 | 2 / 35 | 3951 |
| 7 | 2 | 62.8 | 71.4 | 6 / 35 | 3655 |
| 8 | 2 | 63.8 | 72.7 | 2 / 35 | 4188 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 81 | 5% |
| dummy.micro.Sparrow 2.5 | 12 | 83% |
| brainfade.melee.Dusk 0.44 | 9 | 44% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 100% |
| cvt.Firsty 1.0 | 2 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |

Hadur died in 255 of 280 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 178 | 70% | 182 |
| brainfade.melee.Dusk 0.44 | 26 | 10% | 32 |
| dummy.micro.Sparrow 2.5 | 17 | 7% | 26 |
| wcsv.melee.EngineerMelee 0.1 | 16 | 6% | 19 |
| jab.DiamondStealer 5 | 9 | 4% | 10 |
| mz.NanoGod 2.02 | 5 | 2% | 6 |
| Krabb.akim2.Akim2 1.1b | 2 | 1% | 3 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |

## Melee bench: F44

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 82.3 | 111 / 280 | 2.59 | 18.2% | 44414 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.1 | 18.2% | 111 |
| stelo.Liblix 0.3.1 | 1.9 | 16.5% | 136 |
| tzu.TheArtOfWar 1.2 | 3.3 | 12.0% | 16 |
| wompi.Quokka 1.6 | 4.9 | 9.9% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.9 | 9.6% | 5 |
| jwirde.Gort 2.0 | 5.0 | 9.6% | 6 |
| disan.Chair 2.2.0 | 7.4 | 7.4% | 2 |
| stf.PanzerGeneral 0.1 | 7.6 | 7.1% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.9% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 84.4 | 17 / 35 | 5931 |
| 2 | 1 | 68.1 | 81.6 | 15 / 35 | 5871 |
| 3 | 2 | 66.4 | 78.1 | 11 / 35 | 5581 |
| 4 | 1 | 67.4 | 80.3 | 10 / 35 | 5474 |
| 5 | 1 | 67.2 | 81.6 | 14 / 35 | 5245 |
| 6 | 1 | 69.1 | 87.3 | 15 / 35 | 5811 |
| 7 | 1 | 67.1 | 81.0 | 12 / 35 | 5397 |
| 8 | 1 | 67.4 | 84.1 | 17 / 35 | 5104 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 117 | 21% |
| tzu.TheArtOfWar 1.2 | 53 | 89% |
| wompi.Quokka 1.6 | 14 | 93% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 11 | 100% |
| disan.Chair 2.2.0 | 10 | 90% |
| jwirde.Gort 2.0 | 7 | 57% |
| sample.Crazy 1.0 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 170 of 280 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 111 | 65% | 144 |
| tzu.TheArtOfWar 1.2 | 22 | 13% | 60 |
| jwirde.Gort 2.0 | 10 | 6% | 25 |
| wompi.Quokka 1.6 | 10 | 6% | 19 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 4% | 15 |
| disan.Chair 2.2.0 | 5 | 3% | 7 |
| stf.PanzerGeneral 0.1 | 3 | 2% | 3 |
| sample.Crazy 1.0 | 2 | 1% | 4 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 2 |

## Melee bench: F45

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 85.4 | 125 / 280 | 2.31 | 19.7% | 48591 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLA 0.1 | 1.0 | 19.7% | 125 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 12.5% | 128 |
| jje.BagPuss 1.2 | 3.4 | 11.5% | 5 |
| myl.nano.Graviton 1.10 | 4.3 | 10.1% | 6 |
| sul.Lunar 1.1 | 4.4 | 10.2% | 7 |
| hvilela.HVilela 0.9 | 6.1 | 8.8% | 1 |
| fm.claire 1.7 | 7.4 | 7.9% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 7.8% | 2 |
| wit.Deep7 2.0 | 8.9 | 6.2% | 5 |
| abud.ThirdRobo 1.0 | 9.6 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 88.9 | 16 / 35 | 6103 |
| 2 | 1 | 68.0 | 82.5 | 15 / 35 | 5590 |
| 3 | 1 | 67.8 | 79.4 | 10 / 35 | 5975 |
| 4 | 1 | 69.2 | 84.4 | 17 / 35 | 5859 |
| 5 | 1 | 69.2 | 84.4 | 17 / 35 | 6145 |
| 6 | 1 | 69.8 | 85.4 | 17 / 35 | 6174 |
| 7 | 1 | 70.9 | 89.8 | 15 / 35 | 6831 |
| 8 | 1 | 70.0 | 88.6 | 18 / 35 | 5914 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 144 | 33% |
| sul.Lunar 1.1 | 21 | 100% |
| myl.nano.Graviton 1.10 | 19 | 89% |
| jje.BagPuss 1.2 | 18 | 89% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 100% |
| wit.Deep7 2.0 | 10 | 80% |
| fm.claire 1.7 | 3 | 67% |
| hvilela.HVilela 0.9 | 2 | 100% |

Hadur died in 155 of 280 rounds, at a mean tick of 2123. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 96 | 62% | 0 |
| myl.nano.Graviton 1.10 | 16 | 10% | 53 |
| jje.BagPuss 1.2 | 12 | 8% | 73 |
| fm.claire 1.7 | 8 | 5% | 16 |
| pez.mini.ChironexFleckeri 0.5 | 7 | 5% | 36 |
| sul.Lunar 1.1 | 5 | 3% | 58 |
| hvilela.HVilela 0.9 | 5 | 3% | 16 |
| wit.Deep7 2.0 | 4 | 3% | 13 |
| abud.ThirdRobo 1.0 | 2 | 1% | 11 |

## Melee bench: F46

hadur117.micro.SaorLA 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 68.8 | 22 / 280 | 3.81 | 14.2% | 35217 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.5 | 17.2% | 134 |
| kc.mini.Mirage 0.2 | 1.5 | 17.1% | 92 |
| hadur117.micro.SaorLA 0.1 | 3.0 | 14.2% | 22 |
| mz.MicroSheep 1.0 | 4.4 | 10.4% | 6 |
| cx.Princess 1.0 | 4.6 | 10.4% | 19 |
| sadoner.killer 0.2 | 6.1 | 8.9% | 2 |
| arthord.NanoSatanMelee Beta | 6.9 | 7.1% | 5 |
| jeremyreeder.collective.Prophet 5 | 8.3 | 5.8% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.1% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.8 | 63.2 | 2 / 35 | 4139 |
| 2 | 3 | 64.3 | 73.3 | 5 / 35 | 4602 |
| 3 | 3 | 61.7 | 67.9 | 0 / 35 | 4471 |
| 4 | 3 | 60.7 | 65.4 | 3 / 35 | 4323 |
| 5 | 3 | 63.7 | 75.6 | 3 / 35 | 4343 |
| 6 | 3 | 62.2 | 68.9 | 1 / 35 | 4409 |
| 7 | 3 | 62.9 | 71.4 | 5 / 35 | 4437 |
| 8 | 3 | 61.4 | 64.8 | 3 / 35 | 4493 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 49 | 18% |
| rsalesc.melee.Medina 0.4.5 | 30 | 20% |
| cx.Princess 1.0 | 9 | 33% |
| mz.MicroSheep 1.0 | 3 | 67% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| sadoner.killer 0.2 | 1 | 0% |

Hadur died in 258 of 280 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 116 | 45% | 125 |
| rsalesc.melee.Medina 0.4.5 | 73 | 28% | 82 |
| cx.Princess 1.0 | 22 | 9% | 22 |
| sadoner.killer 0.2 | 12 | 5% | 12 |
| arthord.NanoSatanMelee Beta | 12 | 5% | 12 |
| mz.MicroSheep 1.0 | 9 | 3% | 13 |
| kurios.DOSexe .9a | 6 | 2% | 6 |
| mbro.Detektor3 0.1.1 | 5 | 2% | 5 |
| jeremyreeder.collective.Prophet 5 | 3 | 1% | 3 |

