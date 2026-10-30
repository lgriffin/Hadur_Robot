# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 85.6 | 48 / 210 | 2.30 | 16.7% | 27234 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.8% | 143 |
| hadur117.mini.DeisePW 0.3 | 2.0 | 16.7% | 48 |
| mz.MicroGodMelee 1 | 3.8 | 10.7% | 3 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.8 | 11.2% | 1 |
| sgp.JollyNinja 3.53 | 4.7 | 10.1% | 11 |
| lorneswork.Predator 1.0 | 5.8 | 9.2% | 3 |
| adt.Ar2 1.0 | 6.8 | 8.1% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.5% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 84.1 | 6 / 35 | 4361 |
| 2 | 2 | 66.4 | 87.6 | 7 / 35 | 4378 |
| 3 | 2 | 66.7 | 84.8 | 8 / 35 | 4735 |
| 4 | 2 | 67.1 | 86.3 | 11 / 35 | 4817 |
| 5 | 2 | 66.3 | 83.8 | 4 / 35 | 4565 |
| 6 | 2 | 67.1 | 86.7 | 12 / 35 | 4378 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 131 | 15% |
| mz.MicroGodMelee 1 | 13 | 85% |
| sgp.JollyNinja 3.53 | 10 | 70% |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 100% |
| lorneswork.Predator 1.0 | 2 | 50% |

Hadur died in 162 of 210 rounds, at a mean tick of 1248. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 125 | 77% | 144 |
| sgp.JollyNinja 3.53 | 14 | 9% | 18 |
| mz.MicroGodMelee 1 | 7 | 4% | 16 |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 4% | 14 |
| lorneswork.Predator 1.0 | 4 | 2% | 7 |
| adt.Ar2 1.0 | 4 | 2% | 7 |
| skm.butterfly 1.0 | 1 | 1% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 2 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 82.8 | 96 / 210 | 2.55 | 17.6% | 28055 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 17.6% | 96 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.4% | 23 |
| pulsar.PulsarMax 0.8.9 | 2.8 | 13.0% | 37 |
| lrem.micro.SpikeSoldier 0.4 | 3.8 | 11.4% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.3 | 9.5% | 9 |
| Noran.BitchingElk 0.054 | 6.3 | 8.7% | 18 |
| sch.Simone 0.3d | 7.0 | 8.2% | 13 |
| stelo.PatternRobot 1.0 | 8.0 | 6.7% | 6 |
| fnc.bandit.Bandit 5.2.0 | 8.2 | 7.2% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 83.5 | 17 / 35 | 4865 |
| 2 | 1 | 67.8 | 86.0 | 16 / 35 | 5002 |
| 3 | 1 | 67.4 | 86.3 | 15 / 35 | 4771 |
| 4 | 1 | 65.1 | 78.7 | 16 / 35 | 4391 |
| 5 | 1 | 65.5 | 79.7 | 18 / 35 | 4369 |
| 6 | 1 | 66.2 | 82.5 | 14 / 35 | 4657 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 42 | 86% |
| pulsar.PulsarMax 0.8.9 | 31 | 52% |
| Noran.BitchingElk 0.054 | 18 | 56% |
| sch.Simone 0.3d | 16 | 56% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 100% |
| stelo.PatternRobot 1.0 | 8 | 88% |
| com.cohesiva.robocode.ManOwaR 1.0 | 5 | 60% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| fnc.bandit.Bandit 5.2.0 | 2 | 50% |

Hadur died in 114 of 210 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 37 | 32% | 58 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 23 | 20% | 55 |
| lrem.micro.SpikeSoldier 0.4 | 16 | 14% | 25 |
| sch.Simone 0.3d | 12 | 11% | 17 |
| Noran.BitchingElk 0.054 | 10 | 9% | 20 |
| stelo.PatternRobot 1.0 | 6 | 5% | 12 |
| fnc.bandit.Bandit 5.2.0 | 4 | 4% | 9 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4 | 4% | 9 |
| fullsail.SweetTea 1.1 | 2 | 2% | 5 |

## Melee bench: F03

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 91.0 | 153 / 210 | 1.81 | 19.6% | 33803 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 19.6% | 153 |
| radnor.DoctorBob 1.42 | 2.8 | 13.4% | 18 |
| kawigi.nano.Lib 1.0 | 2.8 | 13.8% | 13 |
| vuen.Cake 2.51 | 3.3 | 12.9% | 26 |
| urdos.URDOS 1.3 | 5.2 | 9.5% | 0 |
| adt.Ar1 2.1 | 6.5 | 7.2% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 6.7 | 7.2% | 0 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.4% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.6 | 25 / 35 | 5411 |
| 2 | 1 | 69.2 | 89.8 | 23 / 35 | 5686 |
| 3 | 1 | 70.3 | 94.0 | 26 / 35 | 5589 |
| 4 | 1 | 70.0 | 91.4 | 28 / 35 | 5756 |
| 5 | 1 | 70.0 | 91.4 | 25 / 35 | 5856 |
| 6 | 1 | 69.3 | 91.4 | 26 / 35 | 5505 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 66 | 95% |
| vuen.Cake 2.51 | 58 | 79% |
| radnor.DoctorBob 1.42 | 36 | 97% |
| urdos.URDOS 1.3 | 4 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 19 | 33% | 81 |
| vuen.Cake 2.51 | 19 | 33% | 64 |
| radnor.DoctorBob 1.42 | 12 | 21% | 40 |
| adt.Ar1 2.1 | 3 | 5% | 4 |
| urdos.URDOS 1.3 | 2 | 3% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 3% | 2 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.4 | 45 / 210 | 2.13 | 17.7% | 33265 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.0% | 163 |
| hadur117.mini.DeisePW 0.3 | 2.0 | 17.7% | 45 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.0% | 3 |
| TNT.TNT 0.99.1 | 4.2 | 9.9% | 1 |
| josago.Jorgito 0.16 | 4.8 | 8.9% | 1 |
| tj.zombie1n 1.0.1 | 6.2 | 7.0% | 0 |
| css.Delitioner 0.11 | 7.2 | 6.5% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.7% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.2 | 88.9 | 8 / 35 | 5969 |
| 2 | 2 | 68.4 | 86.3 | 10 / 35 | 5502 |
| 3 | 2 | 68.3 | 88.6 | 7 / 35 | 5438 |
| 4 | 2 | 67.1 | 85.4 | 3 / 35 | 5242 |
| 5 | 2 | 68.3 | 88.6 | 7 / 35 | 5564 |
| 6 | 2 | 68.4 | 86.7 | 10 / 35 | 5550 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 166 | 20% |
| apc.LeeroyJenkins2 1.0 | 6 | 83% |
| sp.Nanos.Ember 1.1 | 2 | 100% |
| tj.zombie1n 1.0.1 | 2 | 100% |
| TNT.TNT 0.99.1 | 2 | 100% |
| josago.Jorgito 0.16 | 1 | 0% |

Hadur died in 168 of 210 rounds, at a mean tick of 1540. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 145 | 86% | 177 |
| apc.LeeroyJenkins2 1.0 | 11 | 7% | 18 |
| josago.Jorgito 0.16 | 4 | 2% | 5 |
| css.Delitioner 0.11 | 2 | 1% | 4 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |
| TNT.TNT 0.99.1 | 1 | 1% | 3 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 1 |
3 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 76.1 | 40 / 210 | 3.15 | 14.1% | 19496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 17.5% | 98 |
| justin.DemonicRage 3.4 | 1.7 | 16.9% | 55 |
| hadur117.mini.DeisePW 0.3 | 3.2 | 14.1% | 40 |
| wompi.Numbat 2.1 | 3.8 | 12.6% | 11 |
| ms.Ares 0.19 | 5.3 | 9.4% | 3 |
| axeBots.HataMoto 3.09 | 5.7 | 9.0% | 4 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.3% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.6% | 0 |
| GarmBox.Oranges 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.1 | 75.6 | 7 / 35 | 3440 |
| 2 | 3 | 61.3 | 73.3 | 7 / 35 | 3122 |
| 3 | 4 | 60.7 | 70.5 | 4 / 35 | 3132 |
| 4 | 3 | 62.9 | 79.4 | 6 / 35 | 3452 |
| 5 | 3 | 62.7 | 77.8 | 9 / 35 | 3368 |
| 6 | 3 | 62.6 | 80.0 | 7 / 35 | 2982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 40 | 58% |
| cb.fire.Firestarter 2.0f | 37 | 27% |
| wompi.Numbat 2.1 | 7 | 71% |
| axeBots.HataMoto 3.09 | 2 | 100% |
| ms.Ares 0.19 | 1 | 0% |

Hadur died in 170 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 65 | 38% | 83 |
| cb.fire.Firestarter 2.0f | 56 | 33% | 70 |
| wompi.Numbat 2.1 | 25 | 15% | 29 |
| ms.Ares 0.19 | 10 | 6% | 11 |
| axeBots.HataMoto 3.09 | 5 | 3% | 7 |
| supersample.SuperBoxBot 1.0 | 3 | 2% | 3 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 3 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 85.9 | 120 / 210 | 2.27 | 18.2% | 28336 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 18.2% | 120 |
| jekl.StoneGhost 0.7 | 2.0 | 14.7% | 24 |
| origin.SleepSiphon 1.7b | 3.2 | 12.9% | 34 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.4% | 23 |
| mld.Wisdom 1.0 | 5.0 | 10.3% | 3 |
| gg.Wolverine 2.0 | 6.2 | 8.6% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 6.9% | 2 |
| spinnercat.Omen 1.0 | 8.2 | 6.5% | 0 |
| DBall.NUKE 0.1 | 8.5 | 6.4% | 1 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.3 | 20 / 35 | 4820 |
| 2 | 1 | 69.1 | 89.8 | 23 / 35 | 5175 |
| 3 | 1 | 67.9 | 86.0 | 23 / 35 | 4480 |
| 4 | 1 | 67.2 | 85.4 | 16 / 35 | 4609 |
| 5 | 1 | 68.5 | 87.9 | 20 / 35 | 4611 |
| 6 | 1 | 66.4 | 79.0 | 18 / 35 | 4641 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 50 | 90% |
| origin.SleepSiphon 1.7b | 37 | 78% |
| pe.minimelee.SandboxMiniMelee 1.1 | 33 | 82% |
| gg.Wolverine 2.0 | 11 | 91% |
| mld.Wisdom 1.0 | 6 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 26 | 28% | 62 |
| jekl.StoneGhost 0.7 | 24 | 26% | 58 |
| pe.minimelee.SandboxMiniMelee 1.1 | 24 | 26% | 51 |
| mld.Wisdom 1.0 | 11 | 12% | 15 |
| gg.Wolverine 2.0 | 5 | 5% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 5 |
| DBall.NUKE 0.1 | 0 | 0% | 4 |
| sample.Fire 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 94.0 | 132 / 210 | 1.54 | 20.1% | 33704 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 20.1% | 132 |
| rtk.Tachikoma 1.0 | 2.3 | 16.8% | 36 |
| rsalesc.melee.Monk 0.3.6c | 2.7 | 16.3% | 33 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.2% | 3 |
| franzor.Lizt 1.3.1 | 4.7 | 10.5% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| sample.Target 1.0 | 9.3 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 91.4 | 18 / 35 | 5689 |
| 2 | 1 | 71.0 | 93.7 | 20 / 35 | 5435 |
| 3 | 1 | 71.7 | 94.9 | 24 / 35 | 5607 |
| 4 | 1 | 72.0 | 94.9 | 24 / 35 | 5706 |
| 5 | 1 | 72.0 | 94.9 | 25 / 35 | 5535 |
| 6 | 1 | 71.5 | 94.0 | 21 / 35 | 5732 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 103 | 74% |
| rsalesc.melee.Monk 0.3.6c | 48 | 42% |
| oog.melee.CapuletDroid 1.1 | 26 | 96% |
| franzor.Lizt 1.3.1 | 13 | 62% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 1517. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 36 | 46% | 111 |
| rsalesc.melee.Monk 0.3.6c | 32 | 41% | 57 |
| oog.melee.CapuletDroid 1.1 | 5 | 6% | 34 |
| franzor.Lizt 1.3.1 | 5 | 6% | 1 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 89.5 | 128 / 210 | 1.95 | 19.1% | 29457 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 19.1% | 128 |
| tm.Yuugao 1.0 | 2.3 | 13.6% | 41 |
| shrub.Vapour v159 | 2.7 | 12.8% | 19 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.6% | 17 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.4% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 7.8% | 2 |
| m3thos.Eva00 1.1 | 7.3 | 7.7% | 0 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 6.7% | 0 |
| SHAM.WOW 1.4 | 8.5 | 6.3% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.2 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 88.3 | 17 / 35 | 4710 |
| 2 | 1 | 69.8 | 93.7 | 27 / 35 | 4742 |
| 3 | 1 | 69.5 | 91.1 | 24 / 35 | 5131 |
| 4 | 1 | 68.1 | 85.7 | 18 / 35 | 5203 |
| 5 | 1 | 68.7 | 90.5 | 19 / 35 | 4988 |
| 6 | 1 | 68.1 | 87.6 | 23 / 35 | 4683 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 58 | 57% |
| shrub.Vapour v159 | 44 | 80% |
| Krabb.sliNk.Garm 0.9u | 21 | 86% |
| com.spp.robocode.MostlyHarmless 010 | 16 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 13 | 85% |
| m3thos.Eva00 1.1 | 7 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 4 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 1000. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 40 | 48% | 78 |
| shrub.Vapour v159 | 14 | 17% | 52 |
| Krabb.sliNk.Garm 0.9u | 13 | 15% | 23 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 7% | 14 |
| m3thos.Eva00 1.1 | 4 | 5% | 10 |
| com.spp.robocode.MostlyHarmless 010 | 3 | 4% | 23 |
| zyx.nano.BacillusComma 1.0 | 2 | 2% | 3 |
| SHAM.WOW 1.4 | 1 | 1% | 6 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 77.4 | 78 / 210 | 3.04 | 15.9% | 23460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 16.6% | 83 |
| hadur117.mini.DeisePW 0.3 | 1.7 | 15.9% | 78 |
| kc.micro.Figment 1.0 | 3.0 | 13.7% | 19 |
| yagami.Tidus 0.11 | 4.2 | 10.7% | 2 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.8% | 12 |
| mc2.enemy.Original 0.9 | 5.8 | 9.3% | 14 |
| dft.Calliope 5.6 | 7.2 | 7.2% | 2 |
| step.nanoPri 1.0 | 8.0 | 5.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 5.1% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 71.1 | 13 / 35 | 3716 |
| 2 | 2 | 63.7 | 75.9 | 11 / 35 | 3782 |
| 3 | 1 | 67.6 | 87.9 | 16 / 35 | 4348 |
| 4 | 1 | 65.8 | 81.0 | 16 / 35 | 3989 |
| 5 | 2 | 63.5 | 74.9 | 12 / 35 | 3645 |
| 6 | 2 | 63.1 | 73.3 | 10 / 35 | 3980 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 58 | 40% |
| kc.micro.Figment 1.0 | 36 | 89% |
| yagami.Tidus 0.11 | 8 | 100% |
| pedersen.Grishnakh 1.0 | 7 | 86% |
| mc2.enemy.Original 0.9 | 7 | 86% |
| dft.Calliope 5.6 | 2 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 56 | 42% | 82 |
| kc.micro.Figment 1.0 | 19 | 14% | 52 |
| pedersen.Grishnakh 1.0 | 18 | 14% | 21 |
| yagami.Tidus 0.11 | 14 | 11% | 21 |
| mc2.enemy.Original 0.9 | 10 | 8% | 17 |
| robar.nano.Assertive_Melee 0.2 | 7 | 5% | 7 |
| step.nanoPri 1.0 | 5 | 4% | 5 |
| dft.Calliope 5.6 | 3 | 2% | 5 |

## Melee bench: F10

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 94.5 | 173 / 210 | 1.50 | 20.2% | 31664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 20.2% | 173 |
| DTF.Kludgy 1.2b | 2.5 | 13.5% | 14 |
| ne.Chimera 1.2 | 3.2 | 12.8% | 7 |
| ejb.Polaris 1.0.1 | 3.3 | 12.5% | 10 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.0% | 1 |
| vStar.RAFzilla 2.15 | 5.7 | 10.1% | 3 |
| kurios.DOSexe .9b | 7.8 | 5.7% | 0 |
| sam.Samspin 1.0 | 8.0 | 5.6% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.3% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 93.7 | 27 / 35 | 4908 |
| 2 | 1 | 70.9 | 94.6 | 28 / 35 | 5442 |
| 3 | 1 | 72.0 | 98.1 | 31 / 35 | 5751 |
| 4 | 1 | 70.8 | 95.9 | 31 / 35 | 5338 |
| 5 | 1 | 70.1 | 92.7 | 28 / 35 | 5225 |
| 6 | 1 | 69.6 | 92.1 | 28 / 35 | 5000 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 48 | 92% |
| DTF.Kludgy 1.2b | 48 | 90% |
| ne.Chimera 1.2 | 39 | 90% |
| vStar.RAFzilla 2.15 | 24 | 100% |
| tvv.micro.Antares 1.1.1 | 14 | 100% |
| kurios.DOSexe .9b | 6 | 100% |
| donjezza.Muncho 1.0 | 5 | 80% |
| sam.Samspin 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 37 of 210 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 17 | 46% | 61 |
| ne.Chimera 1.2 | 8 | 22% | 43 |
| ejb.Polaris 1.0.1 | 6 | 16% | 49 |
| vStar.RAFzilla 2.15 | 3 | 8% | 22 |
| kurios.DOSexe .9b | 2 | 5% | 12 |
| donjezza.Muncho 1.0 | 1 | 3% | 5 |
| tvv.micro.Antares 1.1.1 | 0 | 0% | 11 |
| sam.Samspin 1.0 | 0 | 0% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 82.0 | 84 / 210 | 2.62 | 16.7% | 24786 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.2 | 16.7% | 84 |
| rz.Aleph 0.34 | 1.8 | 16.4% | 62 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.2% | 22 |
| djc.DynaBot 0.1.1 | 4.0 | 10.4% | 11 |
| rdt199.Warlord 0.73 | 5.0 | 9.5% | 14 |
| br2.MobyDickBot 1.6 | 6.5 | 8.2% | 11 |
| KiraNL.Chupacabra 0.4 | 7.2 | 8.1% | 2 |
| uji.YellohFellah 1.0 | 7.2 | 8.1% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 81.6 | 15 / 35 | 4375 |
| 2 | 1 | 66.1 | 83.5 | 17 / 35 | 3868 |
| 3 | 1 | 65.1 | 82.5 | 13 / 35 | 4060 |
| 4 | 1 | 67.0 | 86.0 | 17 / 35 | 4193 |
| 5 | 2 | 63.4 | 76.8 | 10 / 35 | 4019 |
| 6 | 1 | 65.2 | 81.6 | 12 / 35 | 4271 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 54 | 69% |
| djc.DynaBot 0.1.1 | 19 | 84% |
| cx.mini.Nimrod 0.55 | 17 | 59% |
| rdt199.Warlord 0.73 | 11 | 64% |
| br2.MobyDickBot 1.6 | 10 | 80% |
| uji.YellohFellah 1.0 | 6 | 67% |
| KiraNL.Chupacabra 0.4 | 3 | 67% |

Hadur died in 127 of 210 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 53 | 42% | 83 |
| cx.mini.Nimrod 0.55 | 30 | 24% | 35 |
| rdt199.Warlord 0.73 | 20 | 16% | 30 |
| djc.DynaBot 0.1.1 | 7 | 6% | 23 |
| uji.YellohFellah 1.0 | 6 | 5% | 13 |
| KiraNL.Chupacabra 0.4 | 5 | 4% | 9 |
| br2.MobyDickBot 1.6 | 3 | 2% | 13 |
| stelo.MirrorNano 1.3 | 1 | 1% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 89.0 | 145 / 210 | 1.99 | 18.6% | 23691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 18.6% | 145 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.5% | 23 |
| nat.PallasHawk 1.0 | 2.8 | 13.2% | 22 |
| darkcanuck.Leon 1.01 | 3.7 | 12.2% | 11 |
| brainfade.melee.Genghis 0.36 | 5.2 | 10.5% | 5 |
| jrm.Test0 1.0 | 6.2 | 8.0% | 0 |
| jp.Perpy 16.0 | 7.5 | 6.8% | 0 |
| cs.sheldor.Talon 1.1 | 7.8 | 6.6% | 1 |
| jaybot.bots.Oddball 4.0 | 8.8 | 5.5% | 3 |
| stuff.Vlad 0.1 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.6 | 23 / 35 | 3961 |
| 2 | 1 | 69.9 | 94.0 | 28 / 35 | 3966 |
| 3 | 1 | 69.1 | 93.0 | 22 / 35 | 4106 |
| 4 | 1 | 67.3 | 86.0 | 23 / 35 | 4005 |
| 5 | 1 | 69.1 | 92.1 | 26 / 35 | 3831 |
| 6 | 1 | 67.4 | 87.3 | 23 / 35 | 3822 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 52 | 92% |
| bts.wiki.RipCurl 0.9b | 46 | 80% |
| nat.PallasHawk 1.0 | 44 | 91% |
| brainfade.melee.Genghis 0.36 | 11 | 100% |
| jaybot.bots.Oddball 4.0 | 7 | 57% |
| jrm.Test0 1.0 | 4 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 17 | 26% | 54 |
| bts.wiki.RipCurl 0.9b | 17 | 26% | 44 |
| darkcanuck.Leon 1.01 | 8 | 12% | 66 |
| jrm.Test0 1.0 | 6 | 9% | 10 |
| jaybot.bots.Oddball 4.0 | 6 | 9% | 10 |
| brainfade.melee.Genghis 0.36 | 4 | 6% | 13 |
| cs.sheldor.Talon 1.1 | 4 | 6% | 6 |
| jp.Perpy 16.0 | 2 | 3% | 3 |
| stuff.Vlad 0.1 | 1 | 2% | 3 |

## Melee bench: F13

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 84.1 | 80 / 210 | 2.43 | 16.4% | 24335 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.8 | 16.5% | 77 |
| hadur117.mini.DeisePW 0.3 | 1.8 | 16.4% | 80 |
| ags.Glacier 0.2.11 | 2.3 | 16.4% | 39 |
| shinh.Entangled 0.3 | 4.3 | 11.8% | 7 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.4% | 7 |
| apc.Colossus2 0.17 | 6.3 | 7.8% | 0 |
| stelo.Wang 1.0 | 6.7 | 6.8% | 1 |
| ayk.WallHugger 1.0 | 8.2 | 5.3% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.4% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.8 | 80.6 | 13 / 35 | 4179 |
| 2 | 2 | 66.0 | 82.5 | 15 / 35 | 4080 |
| 3 | 1 | 67.1 | 87.0 | 15 / 35 | 4315 |
| 4 | 1 | 65.9 | 86.0 | 13 / 35 | 3925 |
| 5 | 2 | 65.4 | 82.5 | 13 / 35 | 3776 |
| 6 | 2 | 66.2 | 85.7 | 11 / 35 | 4060 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 66 | 70% |
| mn.Combat 3.25.0 | 62 | 45% |
| shinh.Entangled 0.3 | 5 | 80% |
| gh.micro.Gruweltje 0.7 | 2 | 50% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 54 | 41% | 79 |
| ags.Glacier 0.2.11 | 36 | 27% | 80 |
| shinh.Entangled 0.3 | 17 | 13% | 23 |
| gh.micro.Gruweltje 0.7 | 12 | 9% | 14 |
| stelo.Wang 1.0 | 6 | 5% | 7 |
| apc.Colossus2 0.17 | 2 | 2% | 4 |
| ayk.WallHugger 1.0 | 2 | 2% | 2 |
| maribo.FollowFire 1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 94.3 | 162 / 210 | 1.51 | 20.1% | 31213 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 20.1% | 162 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.3% | 21 |
| catcat20.shape.Theta 0.018 | 3.2 | 11.9% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.8 | 9.8% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.3 | 9.5% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 5.8 | 9.2% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 6.2 | 9.1% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 8.0% | 6 |
| pa.Improved 1.0 | 8.8 | 5.8% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 95.9 | 26 / 35 | 5339 |
| 2 | 1 | 68.6 | 90.2 | 23 / 35 | 4946 |
| 3 | 1 | 70.7 | 95.9 | 29 / 35 | 4928 |
| 4 | 1 | 69.9 | 91.4 | 27 / 35 | 5217 |
| 5 | 1 | 70.4 | 95.2 | 27 / 35 | 5253 |
| 6 | 1 | 71.4 | 97.5 | 30 / 35 | 5530 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 84 | 89% |
| catcat20.shape.Theta 0.018 | 50 | 80% |
| sheldor.micro.PointInLineRRAL 1.0 | 19 | 84% |
| sanyi.mikrobi.Roberto 1.0 | 13 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 978. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 20 | 42% | 90 |
| catcat20.shape.Theta 0.018 | 17 | 35% | 51 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 10% | 23 |
| sanyi.mikrobi.Roberto 1.0 | 2 | 4% | 17 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 4% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 6 |
| pa.Improved 1.0 | 0 | 0% | 4 |

## Melee bench: F15

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.7 | 112 / 210 | 2.29 | 18.7% | 31715 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 18.7% | 112 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.0% | 17 |
| emp.Yngwie 1.11 | 3.5 | 12.5% | 45 |
| cb.nano.Insomnia 1.0 | 3.8 | 11.9% | 5 |
| mld.DustBunny 3.8 | 4.2 | 11.9% | 12 |
| kawigi.robot.Girl 1.2 | 5.8 | 10.3% | 15 |
| lambdaxy.TBot 0.1 | 7.7 | 6.4% | 0 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.1% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.2% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 83.5 | 18 / 35 | 5195 |
| 2 | 1 | 70.2 | 88.6 | 24 / 35 | 5709 |
| 3 | 1 | 68.7 | 87.9 | 20 / 35 | 5039 |
| 4 | 1 | 68.0 | 85.1 | 15 / 35 | 5460 |
| 5 | 1 | 67.9 | 84.4 | 17 / 35 | 5176 |
| 6 | 1 | 68.1 | 84.8 | 18 / 35 | 5136 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 40 | 60% |
| kawigi.micro.Shiz 1.1 | 33 | 97% |
| kawigi.robot.Girl 1.2 | 24 | 79% |
| cb.nano.Insomnia 1.0 | 19 | 95% |
| mld.DustBunny 3.8 | 18 | 89% |
| divineomega.TrialBot 0.003 | 3 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 32 | 33% | 76 |
| mld.DustBunny 3.8 | 22 | 22% | 40 |
| cb.nano.Insomnia 1.0 | 19 | 19% | 21 |
| kawigi.robot.Girl 1.2 | 11 | 11% | 23 |
| kawigi.micro.Shiz 1.1 | 8 | 8% | 35 |
| divineomega.TrialBot 0.003 | 4 | 4% | 12 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 0 |
| lambdaxy.TBot 0.1 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.2 | 111 / 210 | 2.06 | 19.1% | 32840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 19.1% | 111 |
| gh.Griezel 0.5.2 | 2.2 | 15.9% | 55 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 14.3% | 9 |
| techdude.forest.FlamingForest 1.1 | 4.5 | 10.3% | 26 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.3% | 4 |
| tvv.nano.Polaris 1.2 | 5.7 | 8.9% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.6% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 4.9% | 3 |
| asd.Cthulhu 1.3 | 9.0 | 4.9% | 0 |
| repositorio.NanoStep 1.0 | 9.2 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 89.8 | 18 / 35 | 5408 |
| 2 | 1 | 68.4 | 85.7 | 16 / 35 | 5358 |
| 3 | 1 | 70.0 | 88.9 | 19 / 35 | 5827 |
| 4 | 1 | 68.9 | 87.6 | 19 / 35 | 5319 |
| 5 | 1 | 70.0 | 90.2 | 20 / 35 | 5613 |
| 6 | 1 | 68.8 | 87.0 | 19 / 35 | 5315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 82 | 59% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 29 | 100% |
| techdude.forest.FlamingForest 1.1 | 22 | 41% |
| tvv.nano.Polaris 1.2 | 8 | 88% |
| bvh.fnr.Fenrir 0.36l | 7 | 86% |
| divineomega.DivineBot 1.9.4.5 | 6 | 100% |
| stelo.IntrinsicVolatility 1.4 | 5 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 1292. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 48 | 48% | 105 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 17% | 39 |
| techdude.forest.FlamingForest 1.1 | 14 | 14% | 22 |
| bvh.fnr.Fenrir 0.36l | 10 | 10% | 16 |
| tvv.nano.Polaris 1.2 | 5 | 5% | 7 |
| stelo.IntrinsicVolatility 1.4 | 3 | 3% | 8 |
| asd.Cthulhu 1.3 | 2 | 2% | 4 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 7 |
| repositorio.NanoStep 1.0 | 0 | 0% | 2 |

## Melee bench: F17

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.1 | 111 / 210 | 2.16 | 18.4% | 29684 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 18.4% | 111 |
| et.Predator 1.8 | 2.2 | 13.7% | 28 |
| oog.melee.Mercutio 1.0 | 3.3 | 12.3% | 25 |
| cx.BlestPain 1.41 | 4.2 | 11.3% | 31 |
| nic.Nicator 2.4 | 4.5 | 10.8% | 12 |
| ahf.NanoAndrew .4 | 6.0 | 10.1% | 2 |
| maribo.melee.BMV 0.1 | 6.8 | 9.0% | 1 |
| tex.Longbot 0.4 | 8.3 | 6.0% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 82.9 | 14 / 35 | 4894 |
| 2 | 1 | 67.9 | 86.7 | 20 / 35 | 4722 |
| 3 | 1 | 69.9 | 90.5 | 23 / 35 | 5333 |
| 4 | 1 | 68.2 | 88.3 | 20 / 35 | 4646 |
| 5 | 1 | 68.1 | 87.6 | 21 / 35 | 5003 |
| 6 | 1 | 67.6 | 86.7 | 13 / 35 | 5086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 56 | 79% |
| oog.melee.Mercutio 1.0 | 34 | 74% |
| cx.BlestPain 1.41 | 25 | 32% |
| nic.Nicator 2.4 | 24 | 75% |
| ahf.NanoAndrew .4 | 9 | 100% |
| maribo.melee.BMV 0.1 | 6 | 83% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1109. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 28 | 28% | 42 |
| et.Predator 1.8 | 26 | 26% | 60 |
| oog.melee.Mercutio 1.0 | 20 | 20% | 44 |
| nic.Nicator 2.4 | 14 | 14% | 31 |
| ahf.NanoAndrew .4 | 6 | 6% | 15 |
| maribo.melee.BMV 0.1 | 4 | 4% | 10 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 5 |
| tex.Longbot 0.4 | 0 | 0% | 2 |

## Melee bench: F18

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 89.0 | 129 / 210 | 1.99 | 18.6% | 25869 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 18.6% | 129 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.1% | 24 |
| uji.DBH 1.1 | 3.7 | 11.3% | 8 |
| agd.Mooserwirt2 2.7 | 3.8 | 11.5% | 18 |
| ratosh.Nobo 0.21 | 4.7 | 10.6% | 6 |
| spinnercat.Robovirus 2.718 | 5.8 | 9.5% | 6 |
| sigterm.Sigterm 1.0 | 7.3 | 7.7% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 8.3 | 7.0% | 4 |
| stelo.WangRobot 1.0 | 8.5 | 6.0% | 8 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 88.9 | 19 / 35 | 4246 |
| 2 | 1 | 67.9 | 90.2 | 22 / 35 | 4362 |
| 3 | 1 | 68.8 | 90.2 | 24 / 35 | 4351 |
| 4 | 1 | 68.9 | 92.7 | 24 / 35 | 4238 |
| 5 | 1 | 67.9 | 87.3 | 21 / 35 | 4723 |
| 6 | 1 | 66.0 | 84.8 | 19 / 35 | 3949 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 43 | 79% |
| uji.DBH 1.1 | 31 | 94% |
| agd.Mooserwirt2 2.7 | 28 | 75% |
| spinnercat.Robovirus 2.718 | 18 | 83% |
| sigterm.Sigterm 1.0 | 14 | 86% |
| stelo.WangRobot 1.0 | 12 | 67% |
| ratosh.Nobo 0.21 | 8 | 88% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 75% |

Hadur died in 81 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 25 | 31% | 67 |
| agd.Mooserwirt2 2.7 | 12 | 15% | 34 |
| ratosh.Nobo 0.21 | 9 | 11% | 18 |
| uji.DBH 1.1 | 8 | 10% | 26 |
| spinnercat.Robovirus 2.718 | 7 | 9% | 19 |
| stelo.WangRobot 1.0 | 7 | 9% | 14 |
| sigterm.Sigterm 1.0 | 6 | 7% | 15 |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 6% | 10 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 6 |

## Melee bench: F19

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.9 | 168 / 210 | 1.55 | 20.8% | 33824 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 20.8% | 168 |
| mld.Infinity 2.2 | 2.3 | 14.8% | 22 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.7 | 14.5% | 15 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 10.7% | 3 |
| erdnis.Rover 0.3 | 4.7 | 10.2% | 0 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.5% | 1 |
| mbh.Mbh 0.1 | 7.5 | 6.9% | 0 |
| pac.ABC 2.1 | 7.7 | 6.8% | 1 |
| pbg.R2D2 1.0 | 8.7 | 5.6% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 92.1 | 29 / 35 | 4836 |
| 2 | 1 | 71.9 | 94.3 | 28 / 35 | 5790 |
| 3 | 1 | 73.1 | 96.2 | 30 / 35 | 6258 |
| 4 | 1 | 73.1 | 98.1 | 31 / 35 | 5965 |
| 5 | 1 | 69.6 | 87.6 | 23 / 35 | 5152 |
| 6 | 1 | 72.2 | 94.9 | 27 / 35 | 5823 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 77 | 95% |
| mld.Infinity 2.2 | 64 | 88% |
| krillr.mini.JointStrike 2.0.0 | 15 | 100% |
| erdnis.Rover 0.3 | 9 | 100% |
| patson.PatsonTestBot 1.0 | 6 | 100% |
| mbh.Mbh 0.1 | 4 | 100% |
| pac.ABC 2.1 | 3 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 1247. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 15 | 36% | 110 |
| mld.Infinity 2.2 | 13 | 31% | 26 |
| krillr.mini.JointStrike 2.0.0 | 8 | 19% | 24 |
| erdnis.Rover 0.3 | 3 | 7% | 18 |
| patson.PatsonTestBot 1.0 | 2 | 5% | 15 |
| pbg.R2D2 1.0 | 1 | 2% | 8 |
| mbh.Mbh 0.1 | 0 | 0% | 6 |
| pac.ABC 2.1 | 0 | 0% | 2 |

## Melee bench: F20

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 87.9 | 125 / 210 | 2.09 | 19.0% | 30908 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 19.0% | 125 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.2% | 29 |
| fwb.Nine 1.0.1 | 3.5 | 11.7% | 25 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 11.0% | 7 |
| catcat20.Rabbit 0.001 | 4.5 | 10.4% | 16 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 8.1% | 1 |
| bayen.nut.Squirrel 1.615 | 6.5 | 7.8% | 7 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 6.9% | 1 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 88.9 | 21 / 35 | 5179 |
| 2 | 1 | 69.7 | 91.4 | 22 / 35 | 5256 |
| 3 | 1 | 68.9 | 88.9 | 20 / 35 | 5063 |
| 4 | 1 | 66.4 | 81.9 | 16 / 35 | 4705 |
| 5 | 1 | 70.1 | 90.8 | 25 / 35 | 5244 |
| 6 | 1 | 68.6 | 85.4 | 21 / 35 | 5461 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 68 | 85% |
| fwb.Nine 1.0.1 | 29 | 62% |
| catcat20.Rabbit 0.001 | 20 | 80% |
| nz.jdc.nano.GridFu 1.0 | 14 | 93% |
| bayen.nut.Squirrel 1.615 | 11 | 82% |
| m3thos.mini.Eva01 0.5.5 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 1165. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| fwb.Nine 1.0.1 | 31 | 36% | 39 |
| trm.Wrekt 1.1.6.f | 28 | 32% | 71 |
| nz.jdc.nano.GridFu 1.0 | 10 | 11% | 34 |
| catcat20.Rabbit 0.001 | 9 | 10% | 31 |
| bayen.nut.Squirrel 1.615 | 6 | 7% | 19 |
| ntc.ControlledChaos 1.1.4 | 2 | 2% | 2 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 5 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 92.4 | 135 / 210 | 1.69 | 20.0% | 33088 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 20.0% | 135 |
| eem.EvBot v4.6.16 | 2.2 | 16.3% | 57 |
| dummy.mini.Scimitar 1.01 | 2.8 | 13.9% | 8 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.4% | 6 |
| eld.Hmm 1.0 | 5.3 | 8.0% | 3 |
| oa.weak.BotherBot 0.1 | 5.8 | 8.3% | 2 |
| fire219.CatBot 1.0 | 7.2 | 6.9% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.0% | 0 |
| PSW.Relentless 0.1 | 9.0 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 91.7 | 22 / 35 | 5462 |
| 2 | 1 | 71.5 | 95.2 | 27 / 35 | 5461 |
| 3 | 1 | 70.5 | 92.4 | 22 / 35 | 5527 |
| 4 | 1 | 70.9 | 93.3 | 22 / 35 | 5651 |
| 5 | 1 | 70.5 | 92.1 | 21 / 35 | 5571 |
| 6 | 1 | 69.8 | 89.5 | 21 / 35 | 5416 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 106 | 66% |
| dummy.mini.Scimitar 1.01 | 32 | 94% |
| cf.RiO.RiOx 4.2.1 | 23 | 96% |
| eld.Hmm 1.0 | 10 | 70% |
| el.JumpShoot 0.2 | 4 | 100% |
| oa.weak.BotherBot 0.1 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 1297. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 45 | 59% | 95 |
| dummy.mini.Scimitar 1.01 | 20 | 26% | 62 |
| cf.RiO.RiOx 4.2.1 | 6 | 8% | 21 |
| eld.Hmm 1.0 | 3 | 4% | 15 |
| PSW.Relentless 0.1 | 1 | 1% | 2 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 9 |
| el.JumpShoot 0.2 | 0 | 0% | 3 |
| fire219.CatBot 1.0 | 0 | 0% | 2 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.6 | 105 / 210 | 2.20 | 18.2% | 29797 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 18.2% | 105 |
| pe.SandboxDT 2.71m | 2.2 | 16.5% | 54 |
| kvk.HebusLeTroll 0.35 | 2.8 | 14.9% | 36 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.6% | 10 |
| bigpete.Stewie 1.0 | 5.0 | 9.4% | 3 |
| yk.JahRoslav 1.1 | 7.0 | 6.4% | 0 |
| tad.Dalek98 0.98 | 7.0 | 6.6% | 1 |
| gg.Squaraus 0.6 | 7.3 | 6.1% | 0 |
| pbg.NinjaX 1.2 | 8.7 | 5.3% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.3 | 17 / 35 | 5219 |
| 2 | 1 | 68.6 | 88.9 | 18 / 35 | 4655 |
| 3 | 1 | 68.2 | 87.0 | 17 / 35 | 5062 |
| 4 | 1 | 68.4 | 86.3 | 21 / 35 | 4928 |
| 5 | 1 | 68.8 | 86.7 | 18 / 35 | 5096 |
| 6 | 1 | 67.1 | 83.5 | 14 / 35 | 4837 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 53 | 55% |
| kvk.HebusLeTroll 0.35 | 52 | 67% |
| jlm.javaDisturbance 0.59 | 36 | 89% |
| bigpete.Stewie 1.0 | 7 | 86% |
| pbg.NinjaX 1.2 | 2 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 934. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 38 | 36% | 74 |
| kvk.HebusLeTroll 0.35 | 38 | 36% | 61 |
| jlm.javaDisturbance 0.59 | 19 | 18% | 53 |
| bigpete.Stewie 1.0 | 3 | 3% | 10 |
| yk.JahRoslav 1.1 | 3 | 3% | 4 |
| tad.Dalek98 0.98 | 3 | 3% | 3 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 3 |
| pbg.NinjaX 1.2 | 0 | 0% | 2 |

## Melee bench: F23

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 91.2 | 137 / 210 | 1.79 | 19.6% | 29630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 19.6% | 137 |
| pe.SandboxLump 1.52 | 2.0 | 17.0% | 51 |
| cre.Karolos 0.32 | 3.0 | 14.3% | 16 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.9% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.0% | 0 |
| cw.megas.Blade 0.8 | 6.5 | 8.4% | 0 |
| stelo.RamTrackSurfer 1.2 | 6.5 | 8.6% | 4 |
| sample.Walls 1.0 | 7.2 | 7.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.5% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 94.3 | 25 / 35 | 5555 |
| 2 | 1 | 70.8 | 90.8 | 23 / 35 | 5084 |
| 3 | 1 | 71.0 | 92.7 | 23 / 35 | 5222 |
| 4 | 1 | 70.7 | 91.4 | 23 / 35 | 4524 |
| 5 | 1 | 69.9 | 89.8 | 24 / 35 | 4400 |
| 6 | 1 | 69.4 | 88.3 | 19 / 35 | 4845 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 94 | 73% |
| cre.Karolos 0.32 | 38 | 87% |
| stelo.AreaTargetingBot 1.1 | 14 | 93% |
| sample.Walls 1.0 | 12 | 100% |
| stelo.RamTrackSurfer 1.2 | 5 | 80% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 43 | 59% | 113 |
| cre.Karolos 0.32 | 11 | 15% | 42 |
| stelo.AreaTargetingBot 1.1 | 10 | 14% | 18 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 8% | 11 |
| stelo.RamTrackSurfer 1.2 | 2 | 3% | 13 |
| cw.megas.Blade 0.8 | 1 | 1% | 5 |
| sample.Walls 1.0 | 0 | 0% | 5 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 80.7 | 90 / 210 | 2.73 | 16.2% | 21983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 16.2% | 90 |
| florent.XSeries.X2 0.12 | 2.8 | 13.9% | 34 |
| rz.GlowBlowMelee 1.4 | 3.0 | 13.6% | 30 |
| davidalves.Phoenix 0.54 | 3.7 | 12.6% | 36 |
| pedersen.Ugluk 1.1.1 | 4.5 | 11.7% | 17 |
| oog.melee.Corsair 1.0 | 6.3 | 8.4% | 2 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.6% | 1 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.1% | 1 |
| as.FrankTheTank 1.3 | 8.8 | 5.5% | 0 |
| evd.X1 0.01 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 81.9 | 18 / 35 | 3661 |
| 2 | 1 | 64.4 | 78.7 | 13 / 35 | 3929 |
| 3 | 1 | 64.4 | 81.3 | 15 / 35 | 3474 |
| 4 | 1 | 67.0 | 86.3 | 20 / 35 | 3867 |
| 5 | 1 | 63.4 | 79.0 | 11 / 35 | 3509 |
| 6 | 1 | 63.4 | 77.1 | 13 / 35 | 3543 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 30 | 73% |
| davidalves.Phoenix 0.54 | 27 | 52% |
| florent.XSeries.X2 0.12 | 24 | 88% |
| pedersen.Ugluk 1.1.1 | 20 | 70% |
| stelo.SoJNanoMelee 1.1 | 15 | 100% |
| oog.melee.Corsair 1.0 | 3 | 67% |
| as.FrankTheTank 1.3 | 2 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 30 | 25% | 48 |
| florent.XSeries.X2 0.12 | 28 | 23% | 45 |
| rz.GlowBlowMelee 1.4 | 26 | 22% | 53 |
| pedersen.Ugluk 1.1.1 | 24 | 20% | 34 |
| stelo.SoJNanoMelee 1.1 | 4 | 3% | 12 |
| oog.melee.Corsair 1.0 | 4 | 3% | 9 |
| as.FrankTheTank 1.3 | 2 | 2% | 4 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 4 |
| evd.X1 0.01 | 1 | 1% | 1 |

## Melee bench: F25

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 84.6 | 128 / 210 | 2.39 | 17.9% | 23871 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 17.9% | 128 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 13.6% | 28 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.7% | 9 |
| jdw.Hurricane 1.4 | 3.8 | 11.6% | 18 |
| ds.Oo 2.2 | 5.5 | 9.1% | 7 |
| gre.svman4.Morfeas 1.4.1 | 5.7 | 9.3% | 8 |
| gjr.Cephalosporin 0.1 | 7.2 | 7.5% | 7 |
| awesomeness.Elite 1.0 | 8.2 | 7.1% | 2 |
| adt.Ar2 1.1 | 8.5 | 6.7% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 83.5 | 22 / 35 | 3921 |
| 2 | 1 | 64.5 | 76.5 | 17 / 35 | 3928 |
| 3 | 1 | 68.0 | 87.6 | 23 / 35 | 4183 |
| 4 | 1 | 66.9 | 86.0 | 20 / 35 | 3880 |
| 5 | 1 | 68.3 | 88.3 | 24 / 35 | 4054 |
| 6 | 1 | 67.3 | 85.4 | 22 / 35 | 3905 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 52 | 87% |
| voidious.micro.BlitzBat 1.05 | 32 | 94% |
| jdw.Hurricane 1.4 | 23 | 96% |
| gre.svman4.Morfeas 1.4.1 | 10 | 80% |
| gjr.Cephalosporin 0.1 | 8 | 100% |
| ds.Oo 2.2 | 5 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |
| adt.Ar2 1.1 | 4 | 75% |
| amk.ChumbaMini 0.2 | 3 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 24 | 29% | 47 |
| voidious.micro.BlitzBat 1.05 | 18 | 22% | 53 |
| voidious.mini.BrokenSword 2.0.3 | 13 | 16% | 51 |
| ds.Oo 2.2 | 9 | 11% | 16 |
| gre.svman4.Morfeas 1.4.1 | 7 | 9% | 14 |
| adt.Ar2 1.1 | 5 | 6% | 8 |
| awesomeness.Elite 1.0 | 4 | 5% | 6 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 11 |
| amk.ChumbaMini 0.2 | 1 | 1% | 4 |

## Melee bench: F26

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 88.6 | 120 / 210 | 2.03 | 18.7% | 31458 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 18.7% | 120 |
| ak.Fermat 2.0 | 2.0 | 15.5% | 42 |
| lrem.Spectre 0.4.4 | 3.5 | 12.2% | 21 |
| shu.nitro.LENIN .T34 | 4.0 | 11.6% | 16 |
| js.PinBall 1.6 | 4.7 | 10.8% | 7 |
| gh.mini.GrubbmOne 1.0 | 6.3 | 9.1% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 6.5 | 8.9% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.8% | 2 |
| sample.SpinBot 1.0 | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 84.1 | 15 / 35 | 4882 |
| 2 | 1 | 70.6 | 92.4 | 25 / 35 | 5469 |
| 3 | 1 | 65.9 | 80.3 | 15 / 35 | 4715 |
| 4 | 1 | 70.4 | 92.1 | 21 / 35 | 5797 |
| 5 | 1 | 69.8 | 92.1 | 23 / 35 | 5194 |
| 6 | 1 | 69.3 | 90.5 | 21 / 35 | 5401 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 59 | 64% |
| lrem.Spectre 0.4.4 | 39 | 79% |
| shu.nitro.LENIN .T34 | 34 | 79% |
| js.PinBall 1.6 | 9 | 89% |
| jaybot.adv.bots.JayBot 2.0 | 9 | 100% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 39 | 43% | 75 |
| lrem.Spectre 0.4.4 | 18 | 20% | 36 |
| shu.nitro.LENIN .T34 | 17 | 19% | 56 |
| js.PinBall 1.6 | 8 | 9% | 20 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 4% | 8 |
| gh.mini.GrubbmOne 1.0 | 3 | 3% | 7 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 5 |
| sample.SpinBot 1.0 | 0 | 0% | 3 |

## Melee bench: F27

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 89.6 | 131 / 210 | 1.93 | 18.9% | 27201 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 18.9% | 131 |
| mk.Alpha 0.2.1 | 2.7 | 13.4% | 37 |
| wee.Gem 1.8.4 | 3.0 | 11.7% | 23 |
| sheldor.melee.nano.TestMelee 0.1 | 4.2 | 10.8% | 13 |
| EH.Eagle 1.0.6 | 4.8 | 10.5% | 1 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 9.1% | 2 |
| joe.ADinosaur 1.0 | 7.2 | 7.5% | 1 |
| throxbot.ThroxBot 0.1 | 7.8 | 6.9% | 0 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.8% | 2 |
| cs.Grudge 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 93.0 | 27 / 35 | 5013 |
| 2 | 1 | 68.3 | 82.5 | 16 / 35 | 5285 |
| 3 | 1 | 68.5 | 92.4 | 21 / 35 | 4354 |
| 4 | 1 | 67.4 | 87.6 | 22 / 35 | 4026 |
| 5 | 1 | 68.1 | 90.2 | 19 / 35 | 4367 |
| 6 | 1 | 68.7 | 92.1 | 26 / 35 | 4156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 66 | 71% |
| wee.Gem 1.8.4 | 37 | 76% |
| sheldor.melee.nano.TestMelee 0.1 | 28 | 71% |
| EH.Eagle 1.0.6 | 16 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 9 | 100% |
| joe.ADinosaur 1.0 | 4 | 100% |
| throxbot.ThroxBot 0.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 30 | 38% | 77 |
| wee.Gem 1.8.4 | 20 | 25% | 51 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 16% | 32 |
| joe.ADinosaur 1.0 | 6 | 8% | 10 |
| EH.Eagle 1.0.6 | 5 | 6% | 23 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 3% | 8 |
| caimano.Furia_Ceca 0.22 | 2 | 3% | 4 |
| throxbot.ThroxBot 0.1 | 1 | 1% | 4 |
| cs.Grudge 1.0 | 0 | 0% | 1 |

## Melee bench: F28

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 92.6 | 153 / 210 | 1.66 | 19.5% | 26130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 19.5% | 153 |
| kid.test.NightFox .2 | 2.0 | 15.2% | 32 |
| uji.Antique 1.0 | 3.5 | 11.5% | 18 |
| pfvicm.Sobieski 7.2.3b | 4.2 | 10.3% | 0 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 11.0% | 4 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.2% | 2 |
| amk.ChumbaWumba 0.3 | 6.5 | 7.9% | 1 |
| matt.advanced.Katana 1.0 | 8.5 | 5.9% | 1 |
| stelo.PianistNano 1.2 | 8.8 | 5.6% | 0 |
| stelo.Lifestealer 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 96.2 | 30 / 35 | 4630 |
| 2 | 1 | 69.8 | 95.2 | 25 / 35 | 4185 |
| 3 | 1 | 67.5 | 85.1 | 21 / 35 | 4147 |
| 4 | 1 | 69.1 | 92.7 | 24 / 35 | 4376 |
| 5 | 1 | 68.8 | 90.8 | 26 / 35 | 4226 |
| 6 | 1 | 70.4 | 95.9 | 27 / 35 | 4566 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 91 | 79% |
| uji.Antique 1.0 | 46 | 80% |
| qohnil.blot.BlotBot 3.61 | 18 | 94% |
| amk.ChumbaWumba 0.3 | 8 | 100% |
| ahr.ice.Ice 1.0.2 | 8 | 88% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |
| matt.advanced.Katana 1.0 | 4 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 22 | 38% | 91 |
| uji.Antique 1.0 | 11 | 19% | 44 |
| qohnil.blot.BlotBot 3.61 | 9 | 16% | 30 |
| pfvicm.Sobieski 7.2.3b | 8 | 14% | 18 |
| amk.ChumbaWumba 0.3 | 4 | 7% | 12 |
| ahr.ice.Ice 1.0.2 | 3 | 5% | 8 |
| matt.advanced.Katana 1.0 | 0 | 0% | 2 |
| stelo.Lifestealer 1.0 | 0 | 0% | 2 |
| stelo.PianistNano 1.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.4 | 110 / 210 | 2.31 | 18.3% | 27779 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 18.3% | 110 |
| deewiant.Anomaly 0.2 | 2.5 | 14.9% | 40 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 15.0% | 46 |
| myl.micro.Troodon 1.10 | 4.2 | 11.7% | 5 |
| jok.PheonixM 0.1.2 | 4.7 | 10.6% | 5 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.0% | 0 |
| DBall.Anarchy 0.1 | 6.8 | 6.9% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 6.0% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.5% | 1 |
| jangs.ns51 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 85.1 | 16 / 35 | 4803 |
| 2 | 1 | 67.5 | 82.9 | 16 / 35 | 4443 |
| 3 | 1 | 69.2 | 86.7 | 20 / 35 | 4964 |
| 4 | 1 | 69.1 | 87.6 | 21 / 35 | 4492 |
| 5 | 1 | 67.1 | 82.5 | 17 / 35 | 4321 |
| 6 | 1 | 69.0 | 87.9 | 20 / 35 | 4756 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 57 | 77% |
| zyx.mega.YersiniaPestis 3.1 | 45 | 71% |
| myl.micro.Troodon 1.10 | 18 | 100% |
| jok.PheonixM 0.1.2 | 10 | 90% |
| ap.Frederick 1.1 | 4 | 100% |
| DBall.Anarchy 0.1 | 2 | 50% |
| jangs.ns51 1.0 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 37 | 37% | 86 |
| zyx.mega.YersiniaPestis 3.1 | 29 | 29% | 57 |
| jok.PheonixM 0.1.2 | 15 | 15% | 24 |
| myl.micro.Troodon 1.10 | 9 | 9% | 25 |
| fullsail.TimbotNoPrediction 1.0 | 4 | 4% | 6 |
| DBall.Anarchy 0.1 | 2 | 2% | 6 |
| jangs.ns51 1.0 | 2 | 2% | 3 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 2 |

## Melee bench: F30

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 75.0 | 62 / 210 | 3.25 | 14.9% | 21983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.7 | 14.9% | 62 |
| catcat20.Matcha 0.006 | 2.3 | 14.0% | 49 |
| darkcanuck.B26354 1.06 | 3.5 | 13.2% | 39 |
| oog.melee.Capulet 1.2 | 3.7 | 12.9% | 29 |
| stelo.PastFuture 2.3.2 | 3.8 | 12.8% | 26 |
| intruder.PrairieWolf 2.61 | 6.5 | 8.1% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 7.3 | 7.4% | 2 |
| ntc.Opposite 1.5 | 7.8 | 7.4% | 0 |
| tripphippy.Alice 1.1 | 8.3 | 7.0% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 72.1 | 6 / 35 | 3523 |
| 2 | 1 | 62.3 | 74.0 | 11 / 35 | 3610 |
| 3 | 1 | 65.4 | 81.6 | 16 / 35 | 3899 |
| 4 | 2 | 60.5 | 70.2 | 6 / 35 | 3444 |
| 5 | 1 | 63.6 | 76.5 | 14 / 35 | 3786 |
| 6 | 2 | 62.8 | 75.6 | 9 / 35 | 3721 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 31 | 55% |
| oog.melee.Capulet 1.2 | 22 | 64% |
| darkcanuck.B26354 1.06 | 21 | 48% |
| stelo.PastFuture 2.3.2 | 19 | 79% |
| tripphippy.Alice 1.1 | 4 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 100% |
| intruder.PrairieWolf 2.61 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 34 | 23% | 48 |
| darkcanuck.B26354 1.06 | 31 | 21% | 42 |
| stelo.PastFuture 2.3.2 | 30 | 20% | 41 |
| catcat20.Matcha 0.006 | 29 | 20% | 45 |
| fowl3628800.LightningBolt 2.6.0 | 8 | 5% | 11 |
| tripphippy.Alice 1.1 | 6 | 4% | 9 |
| intruder.PrairieWolf 2.61 | 5 | 3% | 9 |
| ntc.Opposite 1.5 | 4 | 3% | 4 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |

## Melee bench: F31

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 77.2 | 60 / 210 | 3.05 | 15.0% | 19793 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.0% | 89 |
| hadur117.mini.DeisePW 0.3 | 2.0 | 15.0% | 60 |
| gh.mini.Griezel 0.2 | 3.5 | 13.0% | 41 |
| spinnercat.micro.Tyger 0.1 | 4.2 | 11.1% | 9 |
| d414.nano.Quantum 1.0.0 | 4.7 | 10.8% | 6 |
| gh.nano.Grofvuil 0.2 | 5.7 | 9.2% | 5 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.7% | 1 |
| fm.mammillarias 1.3 | 7.5 | 6.5% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 4.9% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 82.9 | 15 / 35 | 3675 |
| 2 | 2 | 62.3 | 74.6 | 10 / 35 | 3119 |
| 3 | 2 | 63.3 | 78.1 | 11 / 35 | 3299 |
| 4 | 2 | 61.7 | 74.6 | 8 / 35 | 3222 |
| 5 | 2 | 60.8 | 73.3 | 7 / 35 | 3008 |
| 6 | 2 | 63.9 | 79.7 | 9 / 35 | 3470 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 63 | 54% |
| gh.mini.Griezel 0.2 | 22 | 50% |
| d414.nano.Quantum 1.0.0 | 6 | 83% |
| spinnercat.micro.Tyger 0.1 | 5 | 80% |
| fm.mammillarias 1.3 | 2 | 100% |
| gh.nano.Grofvuil 0.2 | 2 | 50% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 56 | 37% | 85 |
| gh.mini.Griezel 0.2 | 40 | 26% | 53 |
| spinnercat.micro.Tyger 0.1 | 18 | 12% | 20 |
| d414.nano.Quantum 1.0.0 | 11 | 7% | 20 |
| gh.nano.Grofvuil 0.2 | 11 | 7% | 13 |
| fm.mammillarias 1.3 | 9 | 6% | 10 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 8 |
| Gecko.ultimateGeckoBot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 89.0 | 132 / 210 | 1.99 | 18.7% | 28269 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 18.7% | 132 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.7% | 45 |
| apc.botM 3.0 | 3.2 | 11.8% | 18 |
| lxx.ConceptA 0.8 | 4.0 | 10.5% | 1 |
| bayen.UbaMicro 1.4 | 5.0 | 9.6% | 4 |
| vjik.UnViolation 1.1 | 5.8 | 8.8% | 3 |
| yk.JahMicro 1.0 | 7.7 | 6.8% | 3 |
| panzer.Panzer 0.2 | 8.3 | 6.8% | 0 |
| conscience.Electron 1.3g | 8.7 | 6.4% | 1 |
| donjezza.Jezza 1.0 | 9.3 | 5.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 89.5 | 21 / 35 | 4570 |
| 2 | 1 | 67.6 | 89.5 | 23 / 35 | 4340 |
| 3 | 1 | 69.1 | 90.8 | 23 / 35 | 5061 |
| 4 | 1 | 67.6 | 87.9 | 22 / 35 | 4481 |
| 5 | 1 | 66.7 | 84.1 | 19 / 35 | 4755 |
| 6 | 1 | 69.6 | 92.1 | 24 / 35 | 5062 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 77 | 66% |
| apc.botM 3.0 | 27 | 78% |
| lxx.ConceptA 0.8 | 22 | 100% |
| bayen.UbaMicro 1.4 | 12 | 75% |
| vjik.UnViolation 1.1 | 10 | 90% |
| donjezza.Jezza 1.0 | 10 | 90% |
| yk.JahMicro 1.0 | 6 | 100% |
| panzer.Panzer 0.2 | 5 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 38 | 49% | 96 |
| apc.botM 3.0 | 12 | 15% | 32 |
| bayen.UbaMicro 1.4 | 9 | 12% | 21 |
| lxx.ConceptA 0.8 | 8 | 10% | 21 |
| panzer.Panzer 0.2 | 4 | 5% | 6 |
| vjik.UnViolation 1.1 | 2 | 3% | 17 |
| yk.JahMicro 1.0 | 2 | 3% | 6 |
| conscience.Electron 1.3g | 2 | 3% | 3 |
| donjezza.Jezza 1.0 | 1 | 1% | 6 |

## Melee bench: F33

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 90.0 | 141 / 210 | 1.90 | 19.6% | 29357 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 19.6% | 141 |
| maribo.Quester 0.3 | 2.0 | 15.9% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.7% | 16 |
| labg.Cataclysm 2.05 | 4.2 | 10.2% | 10 |
| gre.svman4.Leonidas 1.3.2 | 4.7 | 10.5% | 8 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.3% | 2 |
| baal.nano.N 1.42 | 6.5 | 8.3% | 1 |
| zyx.micro.Ant 1.1 | 8.2 | 5.8% | 0 |
| sanja.First 0.1 | 9.2 | 4.9% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 91.7 | 26 / 35 | 5164 |
| 2 | 1 | 70.2 | 91.1 | 25 / 35 | 4900 |
| 3 | 1 | 67.8 | 84.8 | 18 / 35 | 4744 |
| 4 | 1 | 70.7 | 93.7 | 26 / 35 | 4879 |
| 5 | 1 | 69.5 | 90.2 | 21 / 35 | 4958 |
| 6 | 1 | 69.5 | 88.6 | 25 / 35 | 4712 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 70 | 89% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 82% |
| gre.svman4.Leonidas 1.3.2 | 26 | 96% |
| labg.Cataclysm 2.05 | 14 | 86% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 30 | 43% | 96 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 23% | 51 |
| gre.svman4.Leonidas 1.3.2 | 6 | 9% | 20 |
| labg.Cataclysm 2.05 | 6 | 9% | 17 |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 6% | 9 |
| baal.nano.N 1.42 | 4 | 6% | 8 |
| zyx.micro.Ant 1.1 | 3 | 4% | 6 |
| sanja.First 0.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F34

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 84.1 | 72 / 210 | 2.43 | 17.1% | 27971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.5 | 17.1% | 72 |
| stelo.Spread 0.9 | 2.2 | 16.7% | 71 |
| kid.Gladiator .7.2 | 2.3 | 16.8% | 49 |
| jcs.Seth 1.8 | 4.3 | 10.8% | 9 |
| tcf.Reach 3 | 4.7 | 10.5% | 7 |
| cli.Dancer 1.1 | 6.0 | 9.3% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.5% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.5 | 3.2% | 0 |
| sample.RamFire 1.0 | 9.5 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 87.3 | 13 / 35 | 4447 |
| 2 | 3 | 66.3 | 80.0 | 11 / 35 | 4593 |
| 3 | 1 | 68.3 | 85.1 | 13 / 35 | 5171 |
| 4 | 2 | 65.9 | 81.9 | 10 / 35 | 4278 |
| 5 | 1 | 67.4 | 85.1 | 12 / 35 | 4673 |
| 6 | 1 | 67.8 | 85.1 | 13 / 35 | 4809 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 63 | 54% |
| kid.Gladiator .7.2 | 46 | 48% |
| jcs.Seth 1.8 | 12 | 75% |
| cli.Dancer 1.1 | 3 | 100% |
| tcf.Reach 3 | 2 | 50% |
| ratosh.Wesco 1.4 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 1006. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 57 | 41% | 89 |
| kid.Gladiator .7.2 | 56 | 40% | 72 |
| jcs.Seth 1.8 | 9 | 6% | 20 |
| tcf.Reach 3 | 9 | 6% | 16 |
| ratosh.Wesco 1.4 | 4 | 3% | 6 |
| cli.Dancer 1.1 | 3 | 2% | 6 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 0 |

## Melee bench: F35

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 80.0 | 39 / 210 | 2.80 | 15.1% | 20094 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.5% | 139 |
| hadur117.mini.DeisePW 0.3 | 2.2 | 15.1% | 39 |
| gh.mini.Gruwel 0.9 | 2.8 | 13.5% | 22 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 12.0% | 9 |
| rz.HawkOnFire 0.1 | 4.7 | 11.6% | 1 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 6.6% | 0 |
| wit.Chuliath 1.0 | 7.0 | 6.3% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.9% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 83.2 | 8 / 35 | 3275 |
| 2 | 2 | 64.0 | 81.9 | 5 / 35 | 3385 |
| 3 | 2 | 64.9 | 80.6 | 10 / 35 | 3569 |
| 4 | 2 | 63.3 | 80.3 | 3 / 35 | 3484 |
| 5 | 2 | 64.1 | 81.9 | 8 / 35 | 3268 |
| 6 | 3 | 60.7 | 72.1 | 5 / 35 | 3113 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 72 | 17% |
| gh.mini.Gruwel 0.9 | 29 | 41% |
| dmh.robocode.robot.BlackDeath 9.2 | 13 | 69% |
| rz.HawkOnFire 0.1 | 5 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 95 | 56% | 108 |
| gh.mini.Gruwel 0.9 | 39 | 23% | 52 |
| dmh.robocode.robot.BlackDeath 9.2 | 15 | 9% | 22 |
| rz.HawkOnFire 0.1 | 12 | 7% | 16 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 5 | 3% | 5 |
| dans.Cinnamon 1.2 | 3 | 2% | 3 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 3 |

## Melee bench: F36

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 95.0 | 183 / 210 | 1.45 | 21.2% | 31496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 21.2% | 183 |
| bzdp.Pansy 2.1 | 2.7 | 11.6% | 6 |
| alpha.RainingFire 1.0 | 3.5 | 10.7% | 1 |
| mz.Cork 0.1 | 3.8 | 10.8% | 8 |
| bvh.micro.Freya 0.3 | 4.7 | 10.2% | 4 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.9% | 1 |
| m3thos.Eva02 0.7.1 | 6.5 | 9.5% | 6 |
| dl.BetterWalls 1.0 | 8.5 | 5.8% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 5.6% | 0 |
| sample.MyFirstRobot 1.0 | 9.7 | 4.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 98.4 | 32 / 35 | 5195 |
| 2 | 1 | 71.2 | 94.6 | 31 / 35 | 5140 |
| 3 | 1 | 72.2 | 98.4 | 33 / 35 | 5138 |
| 4 | 1 | 70.7 | 92.7 | 29 / 35 | 5464 |
| 5 | 1 | 72.2 | 97.8 | 32 / 35 | 5332 |
| 6 | 1 | 69.6 | 87.9 | 26 / 35 | 5227 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 44 | 95% |
| bvh.micro.Freya 0.3 | 33 | 100% |
| mz.Cork 0.1 | 32 | 97% |
| bvh.mini.Fenrir 0.39 | 23 | 100% |
| alpha.RainingFire 1.0 | 19 | 100% |
| sample.MyFirstRobot 1.0 | 16 | 94% |
| m3thos.Eva02 0.7.1 | 15 | 80% |
| dl.BetterWalls 1.0 | 4 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |

Hadur died in 28 of 210 rounds, at a mean tick of 819. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 9 | 32% | 53 |
| m3thos.Eva02 0.7.1 | 5 | 18% | 22 |
| mz.Cork 0.1 | 3 | 11% | 39 |
| alpha.RainingFire 1.0 | 3 | 11% | 25 |
| bvh.micro.Freya 0.3 | 2 | 7% | 24 |
| bvh.mini.Fenrir 0.39 | 2 | 7% | 21 |
| sample.MyFirstRobot 1.0 | 2 | 7% | 7 |
| squidM.TentalceMeleeNano 1.1 | 1 | 4% | 5 |
| dl.BetterWalls 1.0 | 0 | 0% | 12 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 91.2 | 168 / 210 | 1.80 | 19.7% | 32997 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 19.7% | 168 |
| germ.TheMind .2 | 2.8 | 11.1% | 8 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.3 | 10.4% | 7 |
| EBBU.Sim2 1.02 | 4.2 | 10.3% | 6 |
| stelo.UntouchableNano 1.3 | 5.3 | 8.8% | 5 |
| agrach.Dalek 1.0 | 5.5 | 9.0% | 8 |
| mb.Beast 0.1 | 7.7 | 7.8% | 5 |
| lmk.ACPFinal 0.1 | 8.2 | 8.0% | 1 |
| skm.Ryubot 1.0 | 8.2 | 7.7% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 8.8 | 7.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 94.3 | 30 / 35 | 5695 |
| 2 | 1 | 68.7 | 92.7 | 26 / 35 | 5154 |
| 3 | 1 | 68.7 | 87.6 | 26 / 35 | 5733 |
| 4 | 1 | 68.9 | 90.5 | 28 / 35 | 5416 |
| 5 | 1 | 69.4 | 90.5 | 30 / 35 | 5782 |
| 6 | 1 | 68.7 | 91.4 | 28 / 35 | 5217 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 51 | 94% |
| EBBU.Sim2 1.02 | 27 | 96% |
| stelo.UntouchableNano 1.3 | 21 | 95% |
| com.syncleus.robocode.Dreadnaught 0.1 | 21 | 95% |
| agrach.Dalek 1.0 | 20 | 100% |
| skm.Ryubot 1.0 | 17 | 100% |
| mb.Beast 0.1 | 10 | 100% |
| lmk.ACPFinal 0.1 | 7 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 455. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 9 | 21% | 50 |
| stelo.UntouchableNano 1.3 | 6 | 14% | 18 |
| mb.Beast 0.1 | 6 | 14% | 17 |
| EBBU.Sim2 1.02 | 5 | 12% | 33 |
| lmk.ACPFinal 0.1 | 5 | 12% | 17 |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 12% | 8 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4 | 9% | 28 |
| agrach.Dalek 1.0 | 2 | 5% | 28 |
| skm.Ryubot 1.0 | 1 | 2% | 8 |

## Melee bench: F38

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 81.1 | 83 / 210 | 2.70 | 16.4% | 24397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.2 | 16.4% | 83 |
| justin.Mallais 14.0 | 1.8 | 15.2% | 66 |
| bvh.mini.Freya 0.55 | 3.2 | 13.1% | 20 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.7% | 22 |
| cs.Wren 1.0 | 5.0 | 10.7% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.5 | 10.4% | 5 |
| kdf.KoulDestroyer 1.0 | 7.0 | 9.0% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 5.7% | 0 |
| matt.UnderDark3 2.4.34 | 9.3 | 3.8% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 82.2 | 18 / 35 | 3906 |
| 2 | 1 | 64.6 | 79.4 | 12 / 35 | 4093 |
| 3 | 1 | 64.8 | 79.0 | 12 / 35 | 4063 |
| 4 | 1 | 66.6 | 83.8 | 18 / 35 | 4085 |
| 5 | 1 | 65.7 | 82.2 | 12 / 35 | 4266 |
| 6 | 2 | 64.6 | 80.0 | 11 / 35 | 3984 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 42 | 48% |
| bts.mega.Gnarly 1.4 | 21 | 71% |
| bvh.mini.Freya 0.55 | 19 | 95% |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 94% |
| cs.Wren 1.0 | 11 | 100% |
| kdf.KoulDestroyer 1.0 | 3 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 43 | 34% | 72 |
| bts.mega.Gnarly 1.4 | 24 | 19% | 44 |
| bvh.mini.Freya 0.55 | 20 | 16% | 30 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 12% | 29 |
| kdf.KoulDestroyer 1.0 | 14 | 11% | 16 |
| cs.Wren 1.0 | 9 | 7% | 15 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 1 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 1 |

## Melee bench: F39

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 86.5 | 111 / 210 | 2.22 | 18.1% | 28239 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 18.1% | 111 |
| bvh.fry.Freya 0.82 | 2.0 | 14.2% | 17 |
| az.Ololobot 0.2.4 | 3.2 | 12.6% | 48 |
| catcat20.Lambda 0.024 | 3.8 | 11.7% | 26 |
| apollokidd.ApolloKidd 0.9 | 6.0 | 8.2% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 6.3 | 8.8% | 5 |
| gimp.GimpBot 0.1 | 6.5 | 8.0% | 2 |
| winamp32.micro.MicroMacro 1.0 | 7.2 | 7.6% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.9% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 76.2 | 10 / 35 | 4531 |
| 2 | 1 | 66.7 | 86.0 | 18 / 35 | 4439 |
| 3 | 1 | 68.1 | 86.7 | 19 / 35 | 5047 |
| 4 | 1 | 68.5 | 89.2 | 24 / 35 | 4710 |
| 5 | 1 | 68.2 | 88.3 | 22 / 35 | 4860 |
| 6 | 1 | 68.2 | 92.4 | 18 / 35 | 4652 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 42 | 64% |
| bvh.fry.Freya 0.82 | 42 | 88% |
| catcat20.Lambda 0.024 | 38 | 61% |
| stelo.SoRobotNanoMelee 1.2 | 12 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| apollokidd.ApolloKidd 0.9 | 4 | 100% |
| gimp.GimpBot 0.1 | 3 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1049. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 30 | 30% | 59 |
| bvh.fry.Freya 0.82 | 27 | 27% | 63 |
| catcat20.Lambda 0.024 | 25 | 25% | 45 |
| stelo.SoRobotNanoMelee 1.2 | 8 | 8% | 11 |
| apollokidd.ApolloKidd 0.9 | 3 | 3% | 7 |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 3% | 4 |
| gimp.GimpBot 0.1 | 1 | 1% | 11 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 2 |

## Melee bench: F40

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.4 | 120 / 210 | 2.22 | 18.3% | 27364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 18.3% | 120 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.1% | 42 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.4% | 20 |
| mz.AntiGrav 1.0 | 4.3 | 10.6% | 10 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.7% | 12 |
| stelo.Randomness 1.0 | 6.5 | 8.9% | 4 |
| alpha.BlackIce 1.0 | 6.5 | 8.7% | 1 |
| amk.superstrike.SuperStrike 0.3 | 8.3 | 6.0% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.2% | 0 |
| sample.Corners 1.0 | 9.7 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 85.1 | 18 / 35 | 4478 |
| 2 | 1 | 69.1 | 88.3 | 24 / 35 | 4895 |
| 3 | 1 | 67.7 | 85.7 | 20 / 35 | 4814 |
| 4 | 1 | 68.8 | 88.6 | 21 / 35 | 4628 |
| 5 | 1 | 66.3 | 82.9 | 16 / 35 | 4155 |
| 6 | 1 | 68.2 | 87.9 | 21 / 35 | 4394 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 57 | 68% |
| kano.gamma.KanoGamma 1.8 | 34 | 79% |
| Polkwane.SmashMelee 1.0 | 21 | 90% |
| mz.AntiGrav 1.0 | 16 | 100% |
| stelo.Randomness 1.0 | 11 | 100% |
| alpha.BlackIce 1.0 | 5 | 80% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 36 | 40% | 66 |
| kano.gamma.KanoGamma 1.8 | 18 | 20% | 57 |
| Polkwane.SmashMelee 1.0 | 13 | 14% | 24 |
| mz.AntiGrav 1.0 | 9 | 10% | 28 |
| alpha.BlackIce 1.0 | 7 | 8% | 9 |
| stelo.Randomness 1.0 | 3 | 3% | 16 |
| testantiswapgun.AntiSwap 1.0 | 3 | 3% | 3 |
| sample.Corners 1.0 | 2 | 2% | 3 |
| amk.superstrike.SuperStrike 0.3 | 0 | 0% | 3 |

## Melee bench: F41

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 83.9 | 104 / 210 | 2.45 | 16.9% | 22627 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.2 | 16.9% | 104 |
| eem.EvBotNG v12.8 | 1.8 | 15.9% | 67 |
| ary.Swarm 1.1 | 3.2 | 13.6% | 11 |
| lessonz.robocode.Oz 0.5.0 | 4.2 | 12.7% | 15 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.7% | 11 |
| shrub.Silver v048 | 6.2 | 8.2% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.5% | 0 |
| stelo.Mirror 1.1 | 8.2 | 5.7% | 1 |
| jsal.Jsalbot 1.0 | 8.7 | 5.5% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 81.9 | 13 / 35 | 3490 |
| 2 | 1 | 67.2 | 85.7 | 18 / 35 | 4063 |
| 3 | 2 | 65.1 | 80.0 | 16 / 35 | 3487 |
| 4 | 1 | 67.3 | 84.4 | 21 / 35 | 3870 |
| 5 | 1 | 66.6 | 84.8 | 18 / 35 | 3806 |
| 6 | 1 | 66.9 | 86.3 | 18 / 35 | 3911 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 63 | 57% |
| lessonz.robocode.Oz 0.5.0 | 27 | 81% |
| ary.Swarm 1.1 | 25 | 84% |
| simonton.nano.MeleeSeed 1.8 | 20 | 95% |
| shrub.Silver v048 | 4 | 100% |
| jsal.Jsalbot 1.0 | 2 | 50% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 46 | 43% | 83 |
| ary.Swarm 1.1 | 24 | 22% | 53 |
| simonton.nano.MeleeSeed 1.8 | 16 | 15% | 33 |
| lessonz.robocode.Oz 0.5.0 | 12 | 11% | 26 |
| zyx.nano.Ant 1.1 | 3 | 3% | 3 |
| stelo.Mirror 1.1 | 2 | 2% | 6 |
| acogdev.alpha 0.2 | 2 | 2% | 2 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |
| shrub.Silver v048 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.9 | 108 / 210 | 2.09 | 18.3% | 29697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 18.3% | 108 |
| wompi.Wallaby 5.1 | 2.5 | 15.4% | 42 |
| ara.Shera 0.88 | 3.0 | 14.2% | 37 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.6% | 19 |
| amz.NanoClone 1.41 | 5.5 | 8.7% | 1 |
| maribo.IotaCT 1.1 | 5.8 | 7.3% | 0 |
| dsw.StaticD 1.0 | 7.5 | 6.1% | 2 |
| stelo.MirrorMicro 1.0 | 8.0 | 5.9% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 8.7 | 5.3% | 0 |
| mme.NikeEnhanced 2.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 88.9 | 21 / 35 | 4884 |
| 2 | 1 | 67.5 | 86.3 | 16 / 35 | 4950 |
| 3 | 1 | 69.3 | 90.2 | 21 / 35 | 4992 |
| 4 | 1 | 68.5 | 89.8 | 17 / 35 | 4987 |
| 5 | 1 | 66.9 | 83.2 | 15 / 35 | 4783 |
| 6 | 1 | 68.8 | 88.9 | 18 / 35 | 5101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ara.Shera 0.88 | 53 | 64% |
| wompi.Wallaby 5.1 | 49 | 76% |
| maribo.mini.MiniQuester 0.1 | 38 | 82% |
| dsw.StaticD 1.0 | 3 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 35 | 34% | 79 |
| ara.Shera 0.88 | 34 | 33% | 65 |
| maribo.mini.MiniQuester 0.1 | 27 | 26% | 56 |
| amz.NanoClone 1.41 | 4 | 4% | 4 |
| dsw.StaticD 1.0 | 1 | 1% | 2 |
| maribo.IotaCT 1.1 | 1 | 1% | 2 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 2 |

## Melee bench: F43

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 74.0 | 38 / 210 | 3.34 | 14.3% | 21273 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.2% | 149 |
| hadur117.mini.DeisePW 0.3 | 2.2 | 14.3% | 38 |
| brainfade.melee.Dusk 0.44 | 2.8 | 13.2% | 19 |
| dummy.micro.Sparrow 2.5 | 4.5 | 11.5% | 3 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.2% | 3 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.3% | 0 |
| jab.DiamondStealer 5 | 7.2 | 7.7% | 0 |
| mz.NanoGod 2.02 | 7.8 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 79.7 | 6 / 35 | 3654 |
| 2 | 2 | 63.1 | 74.6 | 6 / 35 | 3406 |
| 3 | 2 | 65.2 | 78.4 | 9 / 35 | 3946 |
| 4 | 2 | 62.1 | 68.6 | 7 / 35 | 3607 |
| 5 | 3 | 62.4 | 73.0 | 4 / 35 | 3259 |
| 6 | 2 | 62.2 | 69.8 | 6 / 35 | 3401 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 70 | 23% |
| brainfade.melee.Dusk 0.44 | 17 | 82% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 100% |
| dummy.micro.Sparrow 2.5 | 3 | 100% |

Hadur died in 174 of 210 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 90 | 52% | 109 |
| brainfade.melee.Dusk 0.44 | 36 | 21% | 50 |
| dummy.micro.Sparrow 2.5 | 18 | 10% | 19 |
| wcsv.melee.EngineerMelee 0.1 | 14 | 8% | 18 |
| mz.NanoGod 2.02 | 6 | 3% | 6 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 4 |
| jab.DiamondStealer 5 | 3 | 2% | 3 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 91.0 | 140 / 210 | 1.81 | 19.6% | 30557 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 19.6% | 140 |
| stelo.Liblix 0.3.1 | 2.2 | 14.9% | 36 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.5% | 28 |
| wompi.Quokka 1.6 | 4.2 | 10.5% | 3 |
| jwirde.Gort 2.0 | 5.5 | 8.6% | 3 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 8.7% | 1 |
| disan.Chair 2.2.0 | 6.8 | 7.5% | 0 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.4% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.6% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.9 | 21 / 35 | 4892 |
| 2 | 1 | 68.3 | 87.3 | 18 / 35 | 4602 |
| 3 | 1 | 70.5 | 91.4 | 25 / 35 | 5484 |
| 4 | 1 | 70.1 | 92.1 | 25 / 35 | 4998 |
| 5 | 1 | 71.6 | 95.6 | 30 / 35 | 5299 |
| 6 | 1 | 69.8 | 91.7 | 21 / 35 | 5282 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 73 | 90% |
| tzu.TheArtOfWar 1.2 | 58 | 81% |
| wompi.Quokka 1.6 | 9 | 89% |
| jwirde.Gort 2.0 | 6 | 100% |
| disan.Chair 2.2.0 | 6 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tzu.TheArtOfWar 1.2 | 31 | 44% | 70 |
| stelo.Liblix 0.3.1 | 25 | 35% | 98 |
| wompi.Quokka 1.6 | 7 | 10% | 16 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 3% | 5 |
| disan.Chair 2.2.0 | 2 | 3% | 4 |
| stf.PanzerGeneral 0.1 | 2 | 3% | 3 |
| jwirde.Gort 2.0 | 1 | 1% | 12 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 89.3 | 86 / 210 | 1.96 | 19.8% | 35088 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePW 0.3 | 1.0 | 19.8% | 86 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 13.3% | 108 |
| jje.BagPuss 1.2 | 3.0 | 11.7% | 5 |
| sul.Lunar 1.1 | 4.3 | 10.3% | 3 |
| myl.nano.Graviton 1.10 | 4.7 | 10.0% | 3 |
| pez.mini.ChironexFleckeri 0.5 | 6.5 | 8.3% | 3 |
| fm.claire 1.7 | 6.8 | 8.4% | 0 |
| hvilela.HVilela 0.9 | 7.5 | 7.6% | 0 |
| wit.Deep7 2.0 | 9.0 | 6.5% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 89.5 | 15 / 35 | 5783 |
| 2 | 1 | 70.8 | 92.7 | 16 / 35 | 6079 |
| 3 | 1 | 68.7 | 87.0 | 10 / 35 | 5833 |
| 4 | 1 | 70.2 | 88.9 | 17 / 35 | 6299 |
| 5 | 1 | 69.6 | 90.5 | 15 / 35 | 5718 |
| 6 | 1 | 68.5 | 87.3 | 13 / 35 | 5376 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 122 | 30% |
| jje.BagPuss 1.2 | 15 | 87% |
| myl.nano.Graviton 1.10 | 12 | 92% |
| sul.Lunar 1.1 | 11 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 67% |
| fm.claire 1.7 | 5 | 100% |
| wit.Deep7 2.0 | 3 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 2469. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 88 | 70% | 0 |
| jje.BagPuss 1.2 | 10 | 8% | 56 |
| sul.Lunar 1.1 | 7 | 6% | 66 |
| myl.nano.Graviton 1.10 | 6 | 5% | 32 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 4% | 15 |
| fm.claire 1.7 | 4 | 3% | 12 |
| wit.Deep7 2.0 | 3 | 2% | 12 |
| hvilela.HVilela 0.9 | 2 | 2% | 9 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |

## Melee bench: F46

hadur117.mini.DeisePW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 83.3 | 65 / 210 | 2.50 | 16.3% | 24517 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 16.7% | 59 |
| rsalesc.melee.Medina 0.4.5 | 2.2 | 16.3% | 71 |
| hadur117.mini.DeisePW 0.3 | 2.2 | 16.3% | 65 |
| mz.MicroSheep 1.0 | 4.2 | 10.4% | 2 |
| cx.Princess 1.0 | 5.2 | 9.6% | 9 |
| sadoner.killer 0.2 | 5.7 | 9.2% | 3 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.4% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.9% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.3 | 81.9 | 7 / 35 | 4379 |
| 2 | 1 | 66.8 | 84.8 | 15 / 35 | 4363 |
| 3 | 2 | 64.7 | 79.7 | 11 / 35 | 4175 |
| 4 | 3 | 64.8 | 81.0 | 9 / 35 | 3790 |
| 5 | 3 | 64.9 | 83.8 | 9 / 35 | 3876 |
| 6 | 1 | 66.7 | 88.9 | 14 / 35 | 3934 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 62 | 45% |
| rsalesc.melee.Medina 0.4.5 | 50 | 36% |
| mz.MicroSheep 1.0 | 9 | 100% |
| cx.Princess 1.0 | 6 | 67% |
| sadoner.killer 0.2 | 4 | 100% |
| arthord.NanoSatanMelee Beta | 2 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 1020. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 69 | 47% | 101 |
| rsalesc.melee.Medina 0.4.5 | 54 | 37% | 71 |
| mz.MicroSheep 1.0 | 8 | 5% | 15 |
| cx.Princess 1.0 | 5 | 3% | 8 |
| sadoner.killer 0.2 | 5 | 3% | 8 |
| arthord.NanoSatanMelee Beta | 3 | 2% | 5 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
| kurios.DOSexe .9a | 0 | 0% | 1 |
1 death(s) with no robot to name.

