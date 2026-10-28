# Bench suite: suite.txt

## Melee bench: F01

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 86.1 | 49 / 210 | 2.25 | 17.2% | 30990 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.1% | 144 |
| kc.mini.Mirage 0.2 | 2.0 | 17.2% | 49 |
| sgp.JollyNinja 3.53 | 3.3 | 11.5% | 7 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 10.6% | 4 |
| mz.MicroGodMelee 1 | 5.0 | 9.8% | 4 |
| lorneswork.Predator 1.0 | 5.3 | 9.6% | 1 |
| adt.Ar2 1.0 | 7.0 | 7.9% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.3% | 1 |
| skm.butterfly 1.0 | 8.8 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 87.3 | 11 / 35 | 5054 |
| 2 | 2 | 66.3 | 85.4 | 8 / 35 | 4831 |
| 3 | 2 | 68.1 | 87.0 | 9 / 35 | 5490 |
| 4 | 2 | 67.5 | 83.8 | 12 / 35 | 5509 |
| 5 | 2 | 66.8 | 87.0 | 5 / 35 | 4912 |
| 6 | 2 | 66.7 | 86.0 | 4 / 35 | 5194 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 122 | 11% |
| sgp.JollyNinja 3.53 | 14 | 79% |
| mz.MicroGodMelee 1 | 14 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 88% |
| lorneswork.Predator 1.0 | 3 | 67% |
| adt.Ar2 1.0 | 2 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 1018. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 119 | 74% | 135 |
| sgp.JollyNinja 3.53 | 21 | 13% | 32 |
| mz.MicroGodMelee 1 | 10 | 6% | 20 |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 6% | 16 |
| lorneswork.Predator 1.0 | 1 | 1% | 2 |
| skm.butterfly 1.0 | 1 | 1% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 2 |
| adt.Ar2 1.0 | 0 | 0% | 1 |

## Melee bench: F02

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.0 | 83 / 210 | 2.53 | 18.1% | 32089 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.1% | 83 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 15.0% | 68 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.0% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.0% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 9.5% | 9 |
| fnc.bandit.Bandit 5.2.0 | 6.2 | 8.6% | 1 |
| Noran.BitchingElk 0.054 | 7.0 | 7.8% | 10 |
| stelo.PatternRobot 1.0 | 7.8 | 7.0% | 6 |
| sch.Simone 0.3d | 8.7 | 6.7% | 6 |
| fullsail.SweetTea 1.1 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 86.0 | 21 / 35 | 5435 |
| 2 | 1 | 66.1 | 81.3 | 9 / 35 | 5259 |
| 3 | 1 | 67.1 | 81.0 | 14 / 35 | 5382 |
| 4 | 1 | 68.8 | 87.0 | 14 / 35 | 5612 |
| 5 | 1 | 66.7 | 80.0 | 13 / 35 | 5231 |
| 6 | 1 | 66.8 | 82.9 | 12 / 35 | 5170 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 59 | 34% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 50 | 72% |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 71% |
| Noran.BitchingElk 0.054 | 7 | 43% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 100% |
| stelo.PatternRobot 1.0 | 6 | 67% |
| fnc.bandit.Bandit 5.2.0 | 4 | 100% |
| sch.Simone 0.3d | 4 | 100% |
| fullsail.SweetTea 1.1 | 2 | 50% |

Hadur died in 127 of 210 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 60 | 47% | 80 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 24 | 19% | 55 |
| Noran.BitchingElk 0.054 | 11 | 9% | 14 |
| stelo.PatternRobot 1.0 | 10 | 8% | 14 |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 6% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 5 | 4% | 8 |
| sch.Simone 0.3d | 4 | 3% | 9 |
| fullsail.SweetTea 1.1 | 3 | 2% | 5 |
| fnc.bandit.Bandit 5.2.0 | 2 | 2% | 8 |

## Melee bench: F03

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.8 | 159 / 210 | 1.56 | 20.8% | 38116 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.8% | 159 |
| radnor.DoctorBob 1.42 | 2.2 | 13.3% | 12 |
| kawigi.nano.Lib 1.0 | 3.2 | 13.0% | 16 |
| vuen.Cake 2.51 | 3.7 | 12.5% | 20 |
| urdos.URDOS 1.3 | 5.0 | 9.2% | 1 |
| adt.Ar1 2.1 | 6.0 | 7.6% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.9% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.9% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.2 | 5.4% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 93.0 | 25 / 35 | 5782 |
| 2 | 1 | 71.8 | 95.9 | 29 / 35 | 6631 |
| 3 | 1 | 71.4 | 94.6 | 25 / 35 | 6517 |
| 4 | 1 | 71.0 | 93.0 | 28 / 35 | 6401 |
| 5 | 1 | 72.2 | 96.8 | 30 / 35 | 6487 |
| 6 | 1 | 69.8 | 89.5 | 22 / 35 | 6298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 59 | 76% |
| kawigi.nano.Lib 1.0 | 58 | 91% |
| radnor.DoctorBob 1.42 | 44 | 95% |
| adt.Ar1 2.1 | 5 | 100% |
| oa.weak.FlyMk1 0.1 | 5 | 100% |
| urdos.URDOS 1.3 | 4 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 19 | 37% | 63 |
| radnor.DoctorBob 1.42 | 14 | 27% | 58 |
| kawigi.nano.Lib 1.0 | 10 | 20% | 54 |
| urdos.URDOS 1.3 | 4 | 8% | 11 |
| adt.Ar1 2.1 | 2 | 4% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 4% | 3 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 8 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |

## Melee bench: F04

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.2 | 22 / 210 | 2.33 | 17.3% | 34091 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.1% | 173 |
| kc.mini.Mirage 0.2 | 2.0 | 17.3% | 22 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.9% | 7 |
| TNT.TNT 0.99.1 | 4.2 | 9.9% | 5 |
| josago.Jorgito 0.16 | 4.8 | 8.9% | 0 |
| tj.zombie1n 1.0.1 | 6.5 | 7.4% | 3 |
| css.Delitioner 0.11 | 6.7 | 6.9% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.6% | 0 |
| spin.Bugstard 0.012b | 9.3 | 4.1% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.7 | 86.7 | 4 / 35 | 6018 |
| 2 | 2 | 68.1 | 84.8 | 3 / 35 | 6036 |
| 3 | 2 | 66.7 | 81.3 | 6 / 35 | 5376 |
| 4 | 2 | 67.4 | 86.7 | 3 / 35 | 5259 |
| 5 | 2 | 67.9 | 85.4 | 3 / 35 | 5720 |
| 6 | 2 | 67.9 | 86.3 | 3 / 35 | 5682 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 141 | 7% |
| apc.LeeroyJenkins2 1.0 | 7 | 71% |
| tj.zombie1n 1.0.1 | 2 | 100% |
| TNT.TNT 0.99.1 | 2 | 50% |
| sp.Nanos.Ember 1.1 | 1 | 100% |
| css.Delitioner 0.11 | 1 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 188 of 210 rounds, at a mean tick of 1122. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 157 | 84% | 169 |
| apc.LeeroyJenkins2 1.0 | 14 | 7% | 18 |
| TNT.TNT 0.99.1 | 7 | 4% | 9 |
| josago.Jorgito 0.16 | 5 | 3% | 6 |
| tj.zombie1n 1.0.1 | 3 | 2% | 4 |
| css.Delitioner 0.11 | 1 | 1% | 1 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 1 |

## Melee bench: F05

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 73.2 | 27 / 210 | 3.41 | 14.0% | 21641 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.0% | 100 |
| justin.DemonicRage 3.4 | 1.7 | 17.4% | 59 |
| kc.mini.Mirage 0.2 | 3.0 | 14.0% | 27 |
| wompi.Numbat 2.1 | 4.0 | 12.8% | 19 |
| ms.Ares 0.19 | 5.2 | 9.0% | 2 |
| axeBots.HataMoto 3.09 | 5.8 | 8.2% | 3 |
| supersample.SuperBoxBot 1.0 | 7.0 | 6.5% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.4% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.8% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 70.8 | 5 / 35 | 3550 |
| 2 | 3 | 60.7 | 70.8 | 3 / 35 | 3386 |
| 3 | 3 | 62.9 | 78.7 | 4 / 35 | 3742 |
| 4 | 3 | 61.2 | 71.1 | 3 / 35 | 3581 |
| 5 | 3 | 62.9 | 73.7 | 6 / 35 | 3918 |
| 6 | 3 | 62.3 | 74.3 | 6 / 35 | 3464 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 40 | 25% |
| justin.DemonicRage 3.4 | 32 | 34% |
| wompi.Numbat 2.1 | 6 | 33% |
| axeBots.HataMoto 3.09 | 4 | 75% |
| ms.Ares 0.19 | 2 | 50% |

Hadur died in 183 of 210 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 64 | 35% | 76 |
| justin.DemonicRage 3.4 | 50 | 27% | 60 |
| wompi.Numbat 2.1 | 39 | 21% | 40 |
| axeBots.HataMoto 3.09 | 10 | 5% | 12 |
| ms.Ares 0.19 | 9 | 5% | 11 |
| supersample.SuperBoxBot 1.0 | 5 | 3% | 5 |
| davidalves.net.DuelistMicroMelee 1.4 | 5 | 3% | 5 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |

## Melee bench: F06

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.9 | 134 / 210 | 2.09 | 18.7% | 27643 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.7% | 134 |
| jekl.StoneGhost 0.7 | 2.3 | 14.4% | 25 |
| origin.SleepSiphon 1.7b | 3.2 | 12.7% | 30 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.7% | 17 |
| mld.Wisdom 1.0 | 4.5 | 11.1% | 0 |
| gg.Wolverine 2.0 | 6.2 | 8.2% | 2 |
| spinnercat.Omen 1.0 | 7.5 | 7.1% | 1 |
| DBall.NUKE 0.1 | 8.2 | 6.6% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 6.3% | 2 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 89.8 | 25 / 35 | 4513 |
| 2 | 1 | 67.5 | 84.1 | 20 / 35 | 4501 |
| 3 | 1 | 69.1 | 90.5 | 23 / 35 | 4513 |
| 4 | 1 | 67.3 | 83.2 | 20 / 35 | 4687 |
| 5 | 1 | 68.4 | 88.6 | 21 / 35 | 4530 |
| 6 | 1 | 69.9 | 91.4 | 25 / 35 | 4899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.minimelee.SandboxMiniMelee 1.1 | 45 | 87% |
| jekl.StoneGhost 0.7 | 44 | 93% |
| origin.SleepSiphon 1.7b | 38 | 76% |
| gg.Wolverine 2.0 | 7 | 86% |
| mld.Wisdom 1.0 | 7 | 100% |
| DBall.NUKE 0.1 | 4 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 789. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 25 | 32% | 68 |
| jekl.StoneGhost 0.7 | 22 | 28% | 56 |
| pe.minimelee.SandboxMiniMelee 1.1 | 19 | 24% | 46 |
| mld.Wisdom 1.0 | 7 | 9% | 17 |
| spinnercat.Omen 1.0 | 3 | 4% | 5 |
| gg.Wolverine 2.0 | 1 | 1% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 5 |
| DBall.NUKE 0.1 | 0 | 0% | 1 |
| sample.Fire 1.0 | 0 | 0% | 1 |

## Melee bench: F07

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.3 | 122 / 210 | 1.60 | 20.5% | 37741 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.5% | 122 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.2% | 49 |
| rtk.Tachikoma 1.0 | 3.0 | 15.7% | 25 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.9% | 7 |
| franzor.Lizt 1.3.1 | 4.7 | 10.1% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.3% | 1 |
| sample.Target 1.0 | 9.3 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 96.2 | 25 / 35 | 6550 |
| 2 | 1 | 70.9 | 90.8 | 18 / 35 | 6226 |
| 3 | 1 | 71.9 | 93.0 | 20 / 35 | 6202 |
| 4 | 1 | 72.5 | 95.6 | 23 / 35 | 6283 |
| 5 | 1 | 71.5 | 93.0 | 20 / 35 | 6043 |
| 6 | 1 | 71.3 | 91.4 | 16 / 35 | 6437 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 88 | 80% |
| rsalesc.melee.Monk 0.3.6c | 52 | 23% |
| oog.melee.CapuletDroid 1.1 | 25 | 88% |
| franzor.Lizt 1.3.1 | 17 | 82% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |
| skm.PateranBotlock2 1.0 | 1 | 0% |

Hadur died in 88 of 210 rounds, at a mean tick of 1196. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 47 | 53% | 73 |
| rtk.Tachikoma 1.0 | 27 | 31% | 96 |
| oog.melee.CapuletDroid 1.1 | 6 | 7% | 29 |
| franzor.Lizt 1.3.1 | 5 | 6% | 1 |
| exauge.GateKeeper 1.1.121g | 2 | 2% | 7 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 2 |

## Melee bench: F08

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 89.8 | 134 / 210 | 1.91 | 19.8% | 32477 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.8% | 134 |
| tm.Yuugao 1.0 | 2.2 | 12.9% | 31 |
| shrub.Vapour v159 | 2.8 | 12.3% | 19 |
| Krabb.sliNk.Garm 0.9u | 4.5 | 10.2% | 9 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.7% | 8 |
| jwst.DAD.DarkAndDarker 1.1 | 6.0 | 8.4% | 6 |
| m3thos.Eva00 1.1 | 6.5 | 8.4% | 3 |
| qualidafial.MajorDick 1.0.1 | 8.5 | 6.5% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.0% | 0 |
| SHAM.WOW 1.4 | 9.5 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.8 | 23 / 35 | 5455 |
| 2 | 1 | 68.9 | 89.5 | 19 / 35 | 5141 |
| 3 | 1 | 69.5 | 89.5 | 21 / 35 | 5843 |
| 4 | 1 | 69.5 | 90.8 | 20 / 35 | 5686 |
| 5 | 1 | 69.1 | 86.7 | 25 / 35 | 5034 |
| 6 | 1 | 70.2 | 91.7 | 26 / 35 | 5318 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 54 | 70% |
| shrub.Vapour v159 | 51 | 75% |
| Krabb.sliNk.Garm 0.9u | 27 | 85% |
| jwst.DAD.DarkAndDarker 1.1 | 15 | 87% |
| com.spp.robocode.MostlyHarmless 010 | 11 | 73% |
| m3thos.Eva00 1.1 | 8 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 28 | 36% | 72 |
| shrub.Vapour v159 | 19 | 25% | 44 |
| Krabb.sliNk.Garm 0.9u | 10 | 13% | 29 |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 9% | 24 |
| com.spp.robocode.MostlyHarmless 010 | 6 | 8% | 21 |
| m3thos.Eva00 1.1 | 3 | 4% | 11 |
| SHAM.WOW 1.4 | 2 | 3% | 4 |
| zyx.nano.BacillusComma 1.0 | 2 | 3% | 3 |

## Melee bench: F09

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 76.9 | 64 / 210 | 3.08 | 15.9% | 25001 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 16.4% | 91 |
| kc.mini.Mirage 0.2 | 1.7 | 15.9% | 64 |
| kc.micro.Figment 1.0 | 3.0 | 13.9% | 26 |
| yagami.Tidus 0.11 | 4.5 | 10.9% | 3 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.6% | 19 |
| mc2.enemy.Original 0.9 | 6.0 | 8.7% | 5 |
| dft.Calliope 5.6 | 6.8 | 7.5% | 2 |
| step.nanoPri 1.0 | 8.3 | 5.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 5.2% | 0 |
| rdm.Dueler 0.4x | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 80.0 | 14 / 35 | 4422 |
| 2 | 2 | 62.5 | 72.7 | 7 / 35 | 3852 |
| 3 | 2 | 63.0 | 73.0 | 10 / 35 | 4076 |
| 4 | 1 | 64.4 | 78.4 | 11 / 35 | 4142 |
| 5 | 2 | 65.8 | 80.0 | 12 / 35 | 4512 |
| 6 | 2 | 64.3 | 77.1 | 10 / 35 | 3997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 54 | 22% |
| kc.micro.Figment 1.0 | 41 | 85% |
| pedersen.Grishnakh 1.0 | 9 | 56% |
| yagami.Tidus 0.11 | 6 | 100% |
| mc2.enemy.Original 0.9 | 3 | 100% |
| dft.Calliope 5.6 | 2 | 100% |
| rdm.Dueler 0.4x | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 63 | 43% | 77 |
| kc.micro.Figment 1.0 | 31 | 21% | 67 |
| yagami.Tidus 0.11 | 16 | 11% | 19 |
| pedersen.Grishnakh 1.0 | 11 | 8% | 13 |
| mc2.enemy.Original 0.9 | 9 | 6% | 12 |
| rdm.Dueler 0.4x | 8 | 5% | 8 |
| robar.nano.Assertive_Melee 0.2 | 5 | 3% | 6 |
| dft.Calliope 5.6 | 2 | 1% | 6 |
| step.nanoPri 1.0 | 1 | 1% | 2 |

## Melee bench: F10

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 93.5 | 154 / 210 | 1.58 | 20.2% | 34119 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.2% | 154 |
| DTF.Kludgy 1.2b | 2.3 | 14.4% | 31 |
| ejb.Polaris 1.0.1 | 3.2 | 12.6% | 13 |
| ne.Chimera 1.2 | 3.5 | 12.0% | 5 |
| vStar.RAFzilla 2.15 | 5.3 | 10.4% | 2 |
| tvv.micro.Antares 1.1.1 | 5.7 | 10.0% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.2% | 0 |
| kurios.DOSexe .9b | 8.0 | 5.4% | 0 |
| sam.Samspin 1.0 | 8.3 | 5.5% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 94.0 | 29 / 35 | 5742 |
| 2 | 1 | 71.0 | 96.2 | 25 / 35 | 5684 |
| 3 | 1 | 69.0 | 88.6 | 21 / 35 | 5239 |
| 4 | 1 | 71.7 | 95.6 | 29 / 35 | 6168 |
| 5 | 1 | 70.8 | 95.2 | 26 / 35 | 5833 |
| 6 | 1 | 70.1 | 91.7 | 24 / 35 | 5453 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 71 | 70% |
| ejb.Polaris 1.0.1 | 43 | 86% |
| ne.Chimera 1.2 | 28 | 89% |
| vStar.RAFzilla 2.15 | 21 | 100% |
| tvv.micro.Antares 1.1.1 | 9 | 100% |
| donjezza.Muncho 1.0 | 5 | 100% |
| sam.Samspin 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 28 | 49% | 70 |
| ejb.Polaris 1.0.1 | 12 | 21% | 55 |
| ne.Chimera 1.2 | 10 | 18% | 35 |
| tvv.micro.Antares 1.1.1 | 5 | 9% | 13 |
| vStar.RAFzilla 2.15 | 1 | 2% | 21 |
| kurios.DOSexe .9b | 1 | 2% | 4 |
| donjezza.Muncho 1.0 | 0 | 0% | 7 |
| sam.Samspin 1.0 | 0 | 0% | 4 |

## Melee bench: F11

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 85.0 | 95 / 210 | 2.35 | 18.0% | 28264 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.0% | 95 |
| rz.Aleph 0.34 | 2.0 | 15.9% | 58 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.8% | 16 |
| djc.DynaBot 0.1.1 | 4.2 | 10.4% | 11 |
| rdt199.Warlord 0.73 | 5.7 | 8.8% | 12 |
| br2.MobyDickBot 1.6 | 5.8 | 8.7% | 11 |
| uji.YellohFellah 1.0 | 6.7 | 7.8% | 8 |
| KiraNL.Chupacabra 0.4 | 8.0 | 6.9% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.8 | 5.7% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.9 | 16 / 35 | 4794 |
| 2 | 1 | 68.5 | 87.3 | 19 / 35 | 4857 |
| 3 | 1 | 68.9 | 88.3 | 19 / 35 | 5041 |
| 4 | 1 | 66.3 | 83.2 | 13 / 35 | 4610 |
| 5 | 1 | 65.4 | 80.3 | 13 / 35 | 4507 |
| 6 | 1 | 66.0 | 82.9 | 15 / 35 | 4455 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 66 | 56% |
| cx.mini.Nimrod 0.55 | 25 | 76% |
| djc.DynaBot 0.1.1 | 19 | 79% |
| rdt199.Warlord 0.73 | 14 | 64% |
| br2.MobyDickBot 1.6 | 7 | 86% |
| uji.YellohFellah 1.0 | 5 | 100% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 51 | 44% | 91 |
| cx.mini.Nimrod 0.55 | 25 | 22% | 42 |
| rdt199.Warlord 0.73 | 11 | 9% | 22 |
| br2.MobyDickBot 1.6 | 11 | 9% | 20 |
| djc.DynaBot 0.1.1 | 9 | 8% | 25 |
| KiraNL.Chupacabra 0.4 | 4 | 3% | 4 |
| uji.YellohFellah 1.0 | 2 | 2% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 2 |
| stelo.MirrorNano 1.3 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F12

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.9 | 121 / 210 | 2.18 | 18.2% | 24767 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.2% | 121 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.0% | 24 |
| darkcanuck.Leon 1.01 | 2.8 | 13.0% | 27 |
| nat.PallasHawk 1.0 | 3.8 | 12.4% | 27 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.2% | 7 |
| jp.Perpy 16.0 | 6.7 | 7.5% | 1 |
| jrm.Test0 1.0 | 6.8 | 7.5% | 1 |
| cs.sheldor.Talon 1.1 | 8.0 | 6.7% | 0 |
| stuff.Vlad 0.1 | 9.2 | 5.7% | 0 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 93.0 | 22 / 35 | 4168 |
| 2 | 1 | 67.5 | 87.9 | 17 / 35 | 4195 |
| 3 | 1 | 67.1 | 83.5 | 20 / 35 | 4234 |
| 4 | 1 | 67.7 | 85.7 | 23 / 35 | 4184 |
| 5 | 1 | 66.2 | 84.1 | 19 / 35 | 3841 |
| 6 | 1 | 67.5 | 87.3 | 20 / 35 | 4145 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 52 | 77% |
| nat.PallasHawk 1.0 | 43 | 74% |
| bts.wiki.RipCurl 0.9b | 34 | 79% |
| brainfade.melee.Genghis 0.36 | 13 | 85% |
| jaybot.bots.Oddball 4.0 | 6 | 83% |
| jp.Perpy 16.0 | 4 | 75% |
| jrm.Test0 1.0 | 3 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 25 | 28% | 46 |
| darkcanuck.Leon 1.01 | 22 | 25% | 77 |
| nat.PallasHawk 1.0 | 20 | 22% | 45 |
| brainfade.melee.Genghis 0.36 | 9 | 10% | 14 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 7 |
| jrm.Test0 1.0 | 3 | 3% | 4 |
| jp.Perpy 16.0 | 3 | 3% | 4 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 7 |
| stuff.Vlad 0.1 | 1 | 1% | 4 |

## Melee bench: F13

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 81.9 | 53 / 210 | 2.63 | 16.0% | 25906 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.7 | 16.6% | 51 |
| mn.Combat 3.25.0 | 1.7 | 16.5% | 78 |
| kc.mini.Mirage 0.2 | 2.7 | 16.0% | 53 |
| shinh.Entangled 0.3 | 4.3 | 12.3% | 26 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.2% | 2 |
| apc.Colossus2 0.17 | 6.0 | 8.0% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.5% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 5.0% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.7 | 81.0 | 7 / 35 | 4195 |
| 2 | 2 | 66.0 | 84.1 | 13 / 35 | 4176 |
| 3 | 3 | 65.4 | 82.5 | 7 / 35 | 4375 |
| 4 | 3 | 64.4 | 76.2 | 5 / 35 | 4546 |
| 5 | 2 | 66.4 | 84.1 | 13 / 35 | 4226 |
| 6 | 3 | 65.7 | 83.5 | 8 / 35 | 4388 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 54 | 41% |
| ags.Glacier 0.2.11 | 48 | 46% |
| shinh.Entangled 0.3 | 19 | 37% |
| gh.micro.Gruweltje 0.7 | 2 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 65 | 41% | 86 |
| ags.Glacier 0.2.11 | 56 | 36% | 76 |
| shinh.Entangled 0.3 | 21 | 13% | 28 |
| stelo.Wang 1.0 | 7 | 4% | 7 |
| gh.micro.Gruweltje 0.7 | 6 | 4% | 11 |
| sample.Tracker 1.0 | 1 | 1% | 1 |
| apc.Colossus2 0.17 | 1 | 1% | 1 |

## Melee bench: F14

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 93.5 | 161 / 210 | 1.59 | 20.5% | 33620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.5% | 161 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.8% | 23 |
| catcat20.shape.Theta 0.018 | 3.2 | 11.8% | 21 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.7 | 9.9% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 5.0 | 9.8% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.8 | 9.3% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 6.5 | 8.9% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.4% | 4 |
| pa.Improved 1.0 | 9.0 | 5.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 91.7 | 22 / 35 | 5094 |
| 2 | 1 | 71.3 | 94.9 | 25 / 35 | 5769 |
| 3 | 1 | 71.7 | 94.9 | 29 / 35 | 5915 |
| 4 | 1 | 71.4 | 93.3 | 29 / 35 | 5950 |
| 5 | 1 | 71.1 | 94.6 | 30 / 35 | 5348 |
| 6 | 1 | 70.5 | 91.4 | 26 / 35 | 5544 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 96 | 93% |
| catcat20.shape.Theta 0.018 | 41 | 66% |
| co.edu.usb.rc.LidisTron 1.0 | 16 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 73% |
| sanyi.mikrobi.Roberto 1.0 | 9 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 22 | 45% | 51 |
| simonton.micro.Sprout 1.1.3 | 20 | 41% | 96 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 8% | 15 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 2% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 8 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 5 |
| sanyi.mikrobi.Roberto 1.0 | 0 | 0% | 14 |
| pa.Improved 1.0 | 0 | 0% | 6 |

## Melee bench: F15

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 88.1 | 133 / 210 | 2.07 | 19.9% | 35155 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.9% | 133 |
| kawigi.micro.Shiz 1.1 | 2.2 | 13.6% | 18 |
| mld.DustBunny 3.8 | 3.5 | 11.6% | 7 |
| emp.Yngwie 1.11 | 3.8 | 11.8% | 27 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.4% | 5 |
| kawigi.robot.Girl 1.2 | 5.7 | 9.6% | 17 |
| lambdaxy.TBot 0.1 | 7.2 | 7.2% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.9% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.9% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 92.7 | 25 / 35 | 5800 |
| 2 | 1 | 67.9 | 82.9 | 18 / 35 | 5374 |
| 3 | 1 | 70.9 | 90.2 | 25 / 35 | 6085 |
| 4 | 1 | 70.0 | 89.2 | 22 / 35 | 5983 |
| 5 | 1 | 69.8 | 86.3 | 22 / 35 | 5962 |
| 6 | 1 | 69.8 | 87.3 | 21 / 35 | 5951 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 42 | 90% |
| emp.Yngwie 1.11 | 31 | 71% |
| cb.nano.Insomnia 1.0 | 27 | 100% |
| mld.DustBunny 3.8 | 25 | 96% |
| kawigi.robot.Girl 1.2 | 22 | 82% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 26 | 34% | 71 |
| kawigi.micro.Shiz 1.1 | 16 | 21% | 50 |
| mld.DustBunny 3.8 | 13 | 17% | 45 |
| kawigi.robot.Girl 1.2 | 13 | 17% | 22 |
| cb.nano.Insomnia 1.0 | 6 | 8% | 8 |
| divineomega.TrialBot 0.003 | 2 | 3% | 9 |
| lambdaxy.TBot 0.1 | 1 | 1% | 2 |
| Grystrion.TrackerWO 1.0 | 0 | 0% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |

## Melee bench: F16

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 89.8 | 110 / 210 | 1.91 | 20.0% | 36704 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.0% | 110 |
| gh.Griezel 0.5.2 | 2.0 | 16.0% | 68 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.5% | 4 |
| techdude.forest.FlamingForest 1.1 | 4.5 | 9.7% | 21 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.1% | 2 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.6% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.2 | 8.6% | 4 |
| asd.Cthulhu 1.3 | 8.7 | 5.0% | 0 |
| repositorio.NanoStep 1.0 | 8.8 | 5.1% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 91.1 | 18 / 35 | 6187 |
| 2 | 1 | 70.5 | 91.1 | 19 / 35 | 6150 |
| 3 | 1 | 70.3 | 90.8 | 18 / 35 | 5913 |
| 4 | 1 | 70.7 | 90.5 | 20 / 35 | 6163 |
| 5 | 1 | 70.1 | 87.3 | 20 / 35 | 6128 |
| 6 | 1 | 69.5 | 88.3 | 15 / 35 | 6163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 90 | 42% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 34 | 97% |
| techdude.forest.FlamingForest 1.1 | 22 | 50% |
| stelo.IntrinsicVolatility 1.4 | 12 | 83% |
| tvv.nano.Polaris 1.2 | 10 | 90% |
| bvh.fnr.Fenrir 0.36l | 4 | 100% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 1563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 61 | 59% | 108 |
| techdude.forest.FlamingForest 1.1 | 14 | 14% | 29 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 9 | 9% | 32 |
| bvh.fnr.Fenrir 0.36l | 7 | 7% | 9 |
| stelo.IntrinsicVolatility 1.4 | 6 | 6% | 14 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 6 |
| tvv.nano.Polaris 1.2 | 1 | 1% | 9 |
| asd.Cthulhu 1.3 | 1 | 1% | 2 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F17

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 90.3 | 132 / 210 | 1.87 | 19.8% | 32613 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.8% | 132 |
| et.Predator 1.8 | 2.7 | 12.9% | 14 |
| cx.BlestPain 1.41 | 3.2 | 12.0% | 27 |
| oog.melee.Mercutio 1.0 | 3.3 | 12.1% | 26 |
| nic.Nicator 2.4 | 5.2 | 10.5% | 7 |
| ahf.NanoAndrew .4 | 6.0 | 9.8% | 3 |
| maribo.melee.BMV 0.1 | 6.7 | 8.9% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.8% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.8% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 92.7 | 24 / 35 | 5686 |
| 2 | 1 | 70.2 | 92.1 | 24 / 35 | 5037 |
| 3 | 1 | 70.3 | 89.5 | 24 / 35 | 5463 |
| 4 | 1 | 70.5 | 91.4 | 24 / 35 | 5750 |
| 5 | 1 | 70.0 | 91.1 | 22 / 35 | 5406 |
| 6 | 1 | 68.0 | 85.1 | 14 / 35 | 5271 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 54 | 89% |
| oog.melee.Mercutio 1.0 | 40 | 75% |
| cx.BlestPain 1.41 | 29 | 48% |
| nic.Nicator 2.4 | 26 | 85% |
| ahf.NanoAndrew .4 | 11 | 100% |
| maribo.melee.BMV 0.1 | 5 | 100% |
| goblin.Bender 2.4 | 1 | 100% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 1032. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 23 | 29% | 65 |
| cx.BlestPain 1.41 | 20 | 26% | 37 |
| oog.melee.Mercutio 1.0 | 18 | 23% | 50 |
| nic.Nicator 2.4 | 8 | 10% | 31 |
| ahf.NanoAndrew .4 | 6 | 8% | 19 |
| goblin.Bender 2.4 | 1 | 1% | 3 |
| maribo.melee.BMV 0.1 | 1 | 1% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 2 |

## Melee bench: F18

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 92.2 | 143 / 210 | 1.70 | 19.7% | 28854 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.7% | 143 |
| morbid.MorbidPriest 1.0 | 2.3 | 12.8% | 17 |
| uji.DBH 1.1 | 3.3 | 11.4% | 15 |
| agd.Mooserwirt2 2.7 | 3.7 | 10.8% | 15 |
| ratosh.Nobo 0.21 | 5.5 | 9.8% | 3 |
| spinnercat.Robovirus 2.718 | 5.7 | 9.4% | 4 |
| sigterm.Sigterm 1.0 | 7.2 | 8.0% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 7.3 | 7.3% | 3 |
| stelo.WangRobot 1.0 | 9.0 | 5.8% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 91.4 | 24 / 35 | 4723 |
| 2 | 1 | 68.9 | 92.1 | 23 / 35 | 4509 |
| 3 | 1 | 69.7 | 92.7 | 24 / 35 | 4959 |
| 4 | 1 | 69.9 | 93.0 | 25 / 35 | 4941 |
| 5 | 1 | 69.9 | 94.0 | 23 / 35 | 4956 |
| 6 | 1 | 68.9 | 89.8 | 24 / 35 | 4766 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 51 | 80% |
| uji.DBH 1.1 | 34 | 76% |
| agd.Mooserwirt2 2.7 | 29 | 76% |
| spinnercat.Robovirus 2.718 | 19 | 84% |
| sigterm.Sigterm 1.0 | 14 | 86% |
| ratosh.Nobo 0.21 | 13 | 92% |
| stelo.WangRobot 1.0 | 10 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 60% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 19 | 28% | 58 |
| uji.DBH 1.1 | 12 | 17% | 33 |
| agd.Mooserwirt2 2.7 | 11 | 16% | 35 |
| sigterm.Sigterm 1.0 | 8 | 12% | 18 |
| spinnercat.Robovirus 2.718 | 7 | 10% | 20 |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 9% | 14 |
| stelo.WangRobot 1.0 | 3 | 4% | 11 |
| ratosh.Nobo 0.21 | 2 | 3% | 16 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 5 |

## Melee bench: F19

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 96.6 | 182 / 210 | 1.30 | 21.8% | 35700 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 21.8% | 182 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.5 | 14.2% | 12 |
| mld.Infinity 2.2 | 2.7 | 14.1% | 14 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.2% | 1 |
| erdnis.Rover 0.3 | 5.0 | 9.8% | 1 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.2% | 0 |
| mbh.Mbh 0.1 | 7.5 | 7.1% | 0 |
| pac.ABC 2.1 | 7.5 | 6.7% | 0 |
| pbg.R2D2 1.0 | 8.7 | 5.9% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.8 | 99.0 | 33 / 35 | 6341 |
| 2 | 1 | 71.4 | 92.7 | 26 / 35 | 5546 |
| 3 | 1 | 73.6 | 98.4 | 33 / 35 | 6339 |
| 4 | 1 | 72.7 | 96.2 | 29 / 35 | 5608 |
| 5 | 1 | 72.9 | 96.5 | 32 / 35 | 5901 |
| 6 | 1 | 72.6 | 96.8 | 29 / 35 | 5965 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 91 | 93% |
| mld.Infinity 2.2 | 59 | 92% |
| krillr.mini.JointStrike 2.0.0 | 13 | 100% |
| erdnis.Rover 0.3 | 9 | 100% |
| patson.PatsonTestBot 1.0 | 8 | 100% |
| pac.ABC 2.1 | 8 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 28 of 210 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 15 | 54% | 95 |
| mld.Infinity 2.2 | 6 | 21% | 44 |
| krillr.mini.JointStrike 2.0.0 | 3 | 11% | 19 |
| erdnis.Rover 0.3 | 2 | 7% | 16 |
| patson.PatsonTestBot 1.0 | 1 | 4% | 17 |
| mbh.Mbh 0.1 | 1 | 4% | 8 |
| pbg.R2D2 1.0 | 0 | 0% | 5 |
| pac.ABC 2.1 | 0 | 0% | 3 |

## Melee bench: F20

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.5 | 139 / 210 | 1.58 | 20.7% | 35174 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.7% | 139 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.2% | 35 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 10.8% | 2 |
| fwb.Nine 1.0.1 | 3.7 | 10.8% | 11 |
| catcat20.Rabbit 0.001 | 4.8 | 9.8% | 17 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 7.9% | 0 |
| bayen.nut.Squirrel 1.615 | 7.2 | 7.4% | 6 |
| djdjdj.NanoSkunk10 1.0 | 7.5 | 7.2% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 94.0 | 26 / 35 | 5896 |
| 2 | 1 | 70.9 | 93.0 | 21 / 35 | 6013 |
| 3 | 1 | 71.1 | 92.7 | 25 / 35 | 5905 |
| 4 | 1 | 70.8 | 93.7 | 25 / 35 | 5663 |
| 5 | 1 | 70.7 | 92.4 | 18 / 35 | 6151 |
| 6 | 1 | 71.0 | 95.6 | 24 / 35 | 5546 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 79 | 63% |
| fwb.Nine 1.0.1 | 34 | 94% |
| catcat20.Rabbit 0.001 | 28 | 71% |
| bayen.nut.Squirrel 1.615 | 17 | 71% |
| nz.jdc.nano.GridFu 1.0 | 15 | 100% |
| djdjdj.NanoSkunk10 1.0 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 1019. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 39 | 55% | 91 |
| catcat20.Rabbit 0.001 | 11 | 15% | 34 |
| bayen.nut.Squirrel 1.615 | 8 | 11% | 21 |
| fwb.Nine 1.0.1 | 7 | 10% | 27 |
| nz.jdc.nano.GridFu 1.0 | 4 | 6% | 23 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 7 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F21

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 94.0 | 138 / 210 | 1.54 | 20.8% | 35336 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.8% | 138 |
| eem.EvBot v4.6.16 | 2.2 | 15.9% | 50 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.9% | 11 |
| cf.RiO.RiOx 4.2.1 | 3.8 | 11.9% | 4 |
| eld.Hmm 1.0 | 5.5 | 7.9% | 4 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.3% | 3 |
| fire219.CatBot 1.0 | 7.3 | 6.4% | 0 |
| el.JumpShoot 0.2 | 7.8 | 5.8% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 94.3 | 21 / 35 | 5815 |
| 2 | 1 | 72.1 | 94.0 | 25 / 35 | 6190 |
| 3 | 1 | 70.4 | 91.7 | 22 / 35 | 5622 |
| 4 | 1 | 71.8 | 94.9 | 26 / 35 | 5824 |
| 5 | 1 | 71.4 | 93.7 | 20 / 35 | 6079 |
| 6 | 1 | 71.4 | 95.2 | 24 / 35 | 5806 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 106 | 61% |
| dummy.mini.Scimitar 1.01 | 41 | 90% |
| cf.RiO.RiOx 4.2.1 | 25 | 96% |
| eld.Hmm 1.0 | 7 | 71% |
| oa.weak.BotherBot 0.1 | 5 | 80% |
| fire219.CatBot 1.0 | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 1320. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 49 | 67% | 100 |
| dummy.mini.Scimitar 1.01 | 11 | 15% | 60 |
| cf.RiO.RiOx 4.2.1 | 6 | 8% | 24 |
| eld.Hmm 1.0 | 4 | 5% | 15 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 7 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
| PSW.Relentless 0.1 | 1 | 1% | 2 |

## Melee bench: F22

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 90.4 | 122 / 210 | 1.86 | 19.2% | 31201 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.2% | 122 |
| pe.SandboxDT 2.71m | 2.5 | 15.4% | 42 |
| kvk.HebusLeTroll 0.35 | 2.8 | 14.4% | 24 |
| jlm.javaDisturbance 0.59 | 3.7 | 12.7% | 15 |
| bigpete.Stewie 1.0 | 5.0 | 9.9% | 4 |
| tad.Dalek98 0.98 | 6.5 | 7.1% | 1 |
| yk.JahRoslav 1.1 | 7.2 | 6.7% | 1 |
| gg.Squaraus 0.6 | 7.5 | 6.6% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 5.0% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 93.3 | 21 / 35 | 5378 |
| 2 | 1 | 70.0 | 92.1 | 21 / 35 | 5296 |
| 3 | 1 | 69.7 | 90.8 | 17 / 35 | 5295 |
| 4 | 1 | 68.7 | 86.7 | 17 / 35 | 5318 |
| 5 | 1 | 68.2 | 87.0 | 21 / 35 | 4710 |
| 6 | 1 | 70.6 | 92.7 | 25 / 35 | 5204 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 73 | 79% |
| jlm.javaDisturbance 0.59 | 48 | 83% |
| pe.SandboxDT 2.71m | 37 | 27% |
| bigpete.Stewie 1.0 | 9 | 89% |
| pbg.NinjaX 1.2 | 2 | 100% |
| tad.Dalek98 0.98 | 2 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 35 | 40% | 59 |
| kvk.HebusLeTroll 0.35 | 27 | 31% | 72 |
| jlm.javaDisturbance 0.59 | 17 | 19% | 56 |
| tad.Dalek98 0.98 | 6 | 7% | 8 |
| bigpete.Stewie 1.0 | 1 | 1% | 9 |
| gg.Squaraus 0.6 | 1 | 1% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 2 |
| yk.JahRoslav 1.1 | 0 | 0% | 1 |

## Melee bench: F23

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 90.6 | 130 / 210 | 1.85 | 19.8% | 32592 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.8% | 130 |
| pe.SandboxLump 1.52 | 2.0 | 16.9% | 57 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 16 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.4% | 3 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.2 | 9.6% | 0 |
| stelo.RamTrackSurfer 1.2 | 6.2 | 8.9% | 3 |
| cw.megas.Blade 0.8 | 7.0 | 8.1% | 0 |
| sample.Walls 1.0 | 7.3 | 7.5% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.3% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.0 | 20 / 35 | 4957 |
| 2 | 1 | 70.8 | 89.8 | 19 / 35 | 5742 |
| 3 | 1 | 71.0 | 91.4 | 23 / 35 | 5228 |
| 4 | 1 | 70.4 | 88.9 | 24 / 35 | 5471 |
| 5 | 1 | 70.6 | 90.2 | 21 / 35 | 5465 |
| 6 | 1 | 72.1 | 96.2 | 23 / 35 | 5729 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 93 | 62% |
| cre.Karolos 0.32 | 39 | 79% |
| stelo.AreaTargetingBot 1.1 | 21 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 100% |
| stelo.RamTrackSurfer 1.2 | 7 | 86% |
| sample.Walls 1.0 | 6 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 42 | 53% | 107 |
| cre.Karolos 0.32 | 21 | 26% | 45 |
| stelo.RamTrackSurfer 1.2 | 6 | 8% | 20 |
| stelo.AreaTargetingBot 1.1 | 6 | 8% | 14 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 4% | 9 |
| cw.megas.Blade 0.8 | 2 | 3% | 6 |
| sample.Walls 1.0 | 0 | 0% | 5 |

## Melee bench: F24

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 83.5 | 87 / 210 | 2.48 | 16.9% | 23897 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 16.9% | 87 |
| rz.GlowBlowMelee 1.4 | 2.7 | 13.3% | 29 |
| florent.XSeries.X2 0.12 | 2.8 | 13.2% | 29 |
| davidalves.Phoenix 0.54 | 3.8 | 12.7% | 43 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.6% | 15 |
| oog.melee.Corsair 1.0 | 6.0 | 9.6% | 3 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.4% | 4 |
| lunchie.Lunchbox 0.93 | 8.2 | 5.9% | 0 |
| as.FrankTheTank 1.3 | 9.2 | 4.9% | 0 |
| evd.X1 0.01 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 81.0 | 9 / 35 | 3827 |
| 2 | 1 | 64.0 | 78.7 | 11 / 35 | 3744 |
| 3 | 1 | 66.8 | 85.1 | 15 / 35 | 4361 |
| 4 | 1 | 63.8 | 80.0 | 11 / 35 | 3599 |
| 5 | 1 | 68.4 | 89.2 | 24 / 35 | 4147 |
| 6 | 1 | 67.3 | 87.3 | 17 / 35 | 4219 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 39 | 36% |
| florent.XSeries.X2 0.12 | 39 | 51% |
| rz.GlowBlowMelee 1.4 | 25 | 72% |
| pedersen.Ugluk 1.1.1 | 22 | 91% |
| stelo.SoJNanoMelee 1.1 | 10 | 100% |
| oog.melee.Corsair 1.0 | 3 | 100% |
| as.FrankTheTank 1.3 | 2 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 36 | 29% | 54 |
| davidalves.Phoenix 0.54 | 34 | 28% | 45 |
| rz.GlowBlowMelee 1.4 | 26 | 21% | 46 |
| pedersen.Ugluk 1.1.1 | 14 | 11% | 32 |
| oog.melee.Corsair 1.0 | 6 | 5% | 19 |
| stelo.SoJNanoMelee 1.1 | 2 | 2% | 6 |
| as.FrankTheTank 1.3 | 2 | 2% | 4 |
| lunchie.Lunchbox 0.93 | 2 | 2% | 2 |
| evd.X1 0.01 | 1 | 1% | 2 |

## Melee bench: F25

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.2 | 152 / 210 | 1.89 | 19.7% | 27283 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.7% | 152 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.4% | 18 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.5% | 7 |
| jdw.Hurricane 1.4 | 4.0 | 10.9% | 19 |
| gre.svman4.Morfeas 1.4.1 | 5.0 | 9.0% | 6 |
| ds.Oo 2.2 | 6.3 | 8.1% | 3 |
| gjr.Cephalosporin 0.1 | 7.7 | 7.3% | 3 |
| awesomeness.Elite 1.0 | 7.7 | 7.4% | 2 |
| adt.Ar2 1.1 | 8.3 | 7.1% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 90.2 | 24 / 35 | 4769 |
| 2 | 1 | 70.2 | 94.6 | 28 / 35 | 4352 |
| 3 | 1 | 69.8 | 91.4 | 26 / 35 | 4483 |
| 4 | 1 | 68.5 | 87.0 | 25 / 35 | 4490 |
| 5 | 1 | 68.8 | 87.9 | 23 / 35 | 4493 |
| 6 | 1 | 69.6 | 89.8 | 26 / 35 | 4696 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 54 | 89% |
| voidious.micro.BlitzBat 1.05 | 51 | 100% |
| jdw.Hurricane 1.4 | 27 | 89% |
| ds.Oo 2.2 | 8 | 100% |
| gjr.Cephalosporin 0.1 | 6 | 100% |
| gre.svman4.Morfeas 1.4.1 | 6 | 67% |
| awesomeness.Elite 1.0 | 6 | 83% |
| adt.Ar2 1.1 | 5 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 603. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 18 | 31% | 59 |
| jdw.Hurricane 1.4 | 16 | 28% | 40 |
| voidious.micro.BlitzBat 1.05 | 9 | 16% | 47 |
| gre.svman4.Morfeas 1.4.1 | 4 | 7% | 14 |
| adt.Ar2 1.1 | 4 | 7% | 13 |
| awesomeness.Elite 1.0 | 3 | 5% | 13 |
| ds.Oo 2.2 | 2 | 3% | 11 |
| gjr.Cephalosporin 0.1 | 1 | 2% | 10 |
| amk.ChumbaMini 0.2 | 1 | 2% | 3 |

## Melee bench: F26

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 90.7 | 127 / 210 | 1.83 | 19.5% | 33887 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.5% | 127 |
| ak.Fermat 2.0 | 2.2 | 15.0% | 44 |
| lrem.Spectre 0.4.4 | 3.3 | 12.2% | 15 |
| shu.nitro.LENIN .T34 | 4.0 | 11.3% | 19 |
| js.PinBall 1.6 | 4.8 | 10.7% | 2 |
| gh.mini.GrubbmOne 1.0 | 6.2 | 9.2% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 6.5 | 9.2% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.4% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 86.7 | 20 / 35 | 5257 |
| 2 | 1 | 68.5 | 87.0 | 16 / 35 | 5368 |
| 3 | 1 | 70.3 | 93.0 | 21 / 35 | 5643 |
| 4 | 1 | 71.2 | 93.3 | 25 / 35 | 6020 |
| 5 | 1 | 69.7 | 89.8 | 22 / 35 | 5664 |
| 6 | 1 | 71.6 | 94.6 | 23 / 35 | 5935 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 57 | 54% |
| lrem.Spectre 0.4.4 | 51 | 84% |
| shu.nitro.LENIN .T34 | 44 | 68% |
| js.PinBall 1.6 | 10 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 67% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 984. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 45 | 54% | 74 |
| shu.nitro.LENIN .T34 | 20 | 24% | 57 |
| lrem.Spectre 0.4.4 | 11 | 13% | 41 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 5% | 10 |
| js.PinBall 1.6 | 2 | 2% | 15 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 6 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 6 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |

## Melee bench: F27

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 89.2 | 149 / 210 | 1.98 | 19.4% | 29231 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.4% | 149 |
| mk.Alpha 0.2.1 | 2.0 | 14.4% | 31 |
| wee.Gem 1.8.4 | 4.3 | 10.6% | 12 |
| sheldor.melee.nano.TestMelee 0.1 | 4.3 | 10.6% | 7 |
| EH.Eagle 1.0.6 | 5.3 | 9.1% | 3 |
| joe.ADinosaur 1.0 | 6.0 | 8.8% | 1 |
| techdude.kombat.FlamingKombat 1.5 | 6.5 | 8.5% | 0 |
| throxbot.ThroxBot 0.1 | 7.3 | 7.6% | 5 |
| caimano.Furia_Ceca 0.22 | 8.3 | 6.9% | 2 |
| cs.Grudge 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.5 | 29 / 35 | 4918 |
| 2 | 1 | 69.5 | 92.4 | 25 / 35 | 4593 |
| 3 | 1 | 70.5 | 94.0 | 29 / 35 | 4794 |
| 4 | 1 | 69.1 | 91.7 | 24 / 35 | 4601 |
| 5 | 1 | 68.5 | 88.6 | 25 / 35 | 4458 |
| 6 | 1 | 67.9 | 77.8 | 17 / 35 | 5867 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 96 | 86% |
| sheldor.melee.nano.TestMelee 0.1 | 22 | 91% |
| wee.Gem 1.8.4 | 14 | 100% |
| EH.Eagle 1.0.6 | 14 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 100% |
| throxbot.ThroxBot 0.1 | 7 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 31 | 50% | 92 |
| joe.ADinosaur 1.0 | 9 | 15% | 15 |
| caimano.Furia_Ceca 0.22 | 7 | 11% | 9 |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 8% | 32 |
| EH.Eagle 1.0.6 | 3 | 5% | 18 |
| throxbot.ThroxBot 0.1 | 3 | 5% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 3% | 13 |
| wee.Gem 1.8.4 | 1 | 2% | 20 |
| cs.Grudge 1.0 | 1 | 2% | 1 |

## Melee bench: F28

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 90.9 | 132 / 210 | 1.82 | 19.0% | 26447 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.0% | 132 |
| kid.test.NightFox .2 | 2.0 | 14.6% | 30 |
| uji.Antique 1.0 | 3.3 | 11.9% | 27 |
| qohnil.blot.BlotBot 3.61 | 3.7 | 11.1% | 12 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.4% | 1 |
| ahr.ice.Ice 1.0.2 | 6.2 | 8.2% | 6 |
| amk.ChumbaWumba 0.3 | 6.7 | 7.9% | 2 |
| matt.advanced.Katana 1.0 | 8.3 | 6.3% | 0 |
| stelo.Lifestealer 1.0 | 9.0 | 5.9% | 1 |
| stelo.PianistNano 1.2 | 9.5 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 92.7 | 24 / 35 | 4895 |
| 2 | 1 | 68.5 | 90.2 | 23 / 35 | 4265 |
| 3 | 1 | 69.2 | 94.6 | 23 / 35 | 4302 |
| 4 | 1 | 68.6 | 89.8 | 24 / 35 | 4651 |
| 5 | 1 | 67.3 | 87.6 | 17 / 35 | 4399 |
| 6 | 1 | 68.1 | 90.5 | 21 / 35 | 3935 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 83 | 80% |
| uji.Antique 1.0 | 52 | 71% |
| qohnil.blot.BlotBot 3.61 | 21 | 57% |
| ahr.ice.Ice 1.0.2 | 9 | 78% |
| pfvicm.Sobieski 7.2.3b | 6 | 83% |
| amk.ChumbaWumba 0.3 | 3 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 25 | 31% | 86 |
| uji.Antique 1.0 | 22 | 28% | 51 |
| qohnil.blot.BlotBot 3.61 | 14 | 18% | 29 |
| ahr.ice.Ice 1.0.2 | 6 | 8% | 14 |
| pfvicm.Sobieski 7.2.3b | 4 | 5% | 13 |
| amk.ChumbaWumba 0.3 | 4 | 5% | 8 |
| matt.advanced.Katana 1.0 | 2 | 3% | 5 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |
| stelo.Lifestealer 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F29

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.5 | 114 / 210 | 2.21 | 19.0% | 29707 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.0% | 114 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.1% | 56 |
| deewiant.Anomaly 0.2 | 2.7 | 14.1% | 35 |
| myl.micro.Troodon 1.10 | 4.2 | 12.1% | 4 |
| jok.PheonixM 0.1.2 | 4.8 | 10.4% | 1 |
| ph.melee.ArcherME 0.3 | 6.2 | 7.9% | 0 |
| DBall.Anarchy 0.1 | 6.8 | 6.9% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.7% | 0 |
| ap.Frederick 1.1 | 9.5 | 4.3% | 0 |
| jangs.ns51 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.4 | 22 / 35 | 5442 |
| 2 | 1 | 69.1 | 86.3 | 23 / 35 | 4700 |
| 3 | 1 | 67.9 | 82.9 | 18 / 35 | 4599 |
| 4 | 1 | 68.9 | 86.0 | 18 / 35 | 4854 |
| 5 | 1 | 69.0 | 85.7 | 18 / 35 | 5115 |
| 6 | 1 | 68.7 | 85.7 | 15 / 35 | 4997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 64 | 69% |
| zyx.mega.YersiniaPestis 3.1 | 53 | 47% |
| myl.micro.Troodon 1.10 | 18 | 100% |
| jok.PheonixM 0.1.2 | 16 | 100% |
| DBall.Anarchy 0.1 | 8 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 43 | 45% | 70 |
| deewiant.Anomaly 0.2 | 32 | 33% | 78 |
| myl.micro.Troodon 1.10 | 8 | 8% | 26 |
| jok.PheonixM 0.1.2 | 4 | 4% | 16 |
| ph.melee.ArcherME 0.3 | 4 | 4% | 8 |
| fullsail.TimbotNoPrediction 1.0 | 4 | 4% | 4 |
| jangs.ns51 1.0 | 1 | 1% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 6 |

## Melee bench: F30

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 79.9 | 66 / 210 | 2.81 | 16.4% | 26572 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 16.4% | 66 |
| catcat20.Matcha 0.006 | 3.2 | 13.3% | 46 |
| darkcanuck.B26354 1.06 | 3.2 | 12.9% | 42 |
| oog.melee.Capulet 1.2 | 3.7 | 12.6% | 24 |
| stelo.PastFuture 2.3.2 | 4.0 | 12.5% | 21 |
| intruder.PrairieWolf 2.61 | 6.2 | 8.5% | 8 |
| ntc.Opposite 1.5 | 7.5 | 7.4% | 0 |
| tripphippy.Alice 1.1 | 8.0 | 6.7% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 8.3 | 7.1% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 81.3 | 10 / 35 | 4443 |
| 2 | 1 | 63.6 | 74.9 | 9 / 35 | 4266 |
| 3 | 1 | 66.0 | 81.9 | 13 / 35 | 4683 |
| 4 | 1 | 65.8 | 80.6 | 9 / 35 | 4815 |
| 5 | 1 | 63.5 | 77.5 | 11 / 35 | 3854 |
| 6 | 1 | 66.6 | 83.2 | 14 / 35 | 4511 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 32 | 44% |
| stelo.PastFuture 2.3.2 | 28 | 64% |
| darkcanuck.B26354 1.06 | 26 | 38% |
| oog.melee.Capulet 1.2 | 24 | 67% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 100% |
| tripphippy.Alice 1.1 | 4 | 100% |
| intruder.PrairieWolf 2.61 | 2 | 0% |

Hadur died in 145 of 210 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 36 | 25% | 45 |
| catcat20.Matcha 0.006 | 35 | 24% | 49 |
| oog.melee.Capulet 1.2 | 29 | 20% | 48 |
| stelo.PastFuture 2.3.2 | 25 | 17% | 42 |
| intruder.PrairieWolf 2.61 | 6 | 4% | 7 |
| fowl3628800.LightningBolt 2.6.0 | 5 | 3% | 7 |
| tripphippy.Alice 1.1 | 5 | 3% | 7 |
| ntc.Opposite 1.5 | 4 | 3% | 4 |

## Melee bench: F31

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 81.6 | 61 / 210 | 2.65 | 16.2% | 22870 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 18.1% | 94 |
| kc.mini.Mirage 0.2 | 1.8 | 16.2% | 61 |
| gh.mini.Griezel 0.2 | 3.7 | 12.3% | 34 |
| spinnercat.micro.Tyger 0.1 | 3.8 | 11.4% | 9 |
| d414.nano.Quantum 1.0.0 | 4.5 | 10.6% | 8 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.4% | 2 |
| timmit.nano.TimDog 0.33 | 7.3 | 6.7% | 2 |
| fm.mammillarias 1.3 | 7.8 | 6.3% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.0% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 85.4 | 10 / 35 | 3865 |
| 2 | 2 | 64.7 | 82.2 | 8 / 35 | 3748 |
| 3 | 2 | 66.0 | 84.1 | 13 / 35 | 3876 |
| 4 | 2 | 66.9 | 86.0 | 14 / 35 | 4081 |
| 5 | 2 | 62.8 | 75.9 | 5 / 35 | 3689 |
| 6 | 2 | 63.8 | 76.2 | 11 / 35 | 3611 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 70 | 29% |
| gh.mini.Griezel 0.2 | 33 | 42% |
| spinnercat.micro.Tyger 0.1 | 16 | 88% |
| d414.nano.Quantum 1.0.0 | 12 | 75% |
| timmit.nano.TimDog 0.33 | 3 | 67% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 77 | 52% | 98 |
| gh.mini.Griezel 0.2 | 34 | 23% | 51 |
| d414.nano.Quantum 1.0.0 | 12 | 8% | 20 |
| spinnercat.micro.Tyger 0.1 | 9 | 6% | 20 |
| fm.mammillarias 1.3 | 9 | 6% | 10 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 6 |
| gh.nano.Grofvuil 0.2 | 2 | 1% | 3 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 0 | 0% | 1 |

## Melee bench: F32

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 90.6 | 127 / 210 | 1.84 | 19.1% | 29351 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.1% | 127 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.8% | 54 |
| lxx.ConceptA 0.8 | 3.5 | 10.8% | 5 |
| apc.botM 3.0 | 3.7 | 11.2% | 15 |
| vjik.UnViolation 1.1 | 5.0 | 9.9% | 5 |
| bayen.UbaMicro 1.4 | 5.8 | 8.6% | 0 |
| panzer.Panzer 0.2 | 7.2 | 7.4% | 1 |
| yk.JahMicro 1.0 | 8.2 | 6.6% | 3 |
| conscience.Electron 1.3g | 9.0 | 6.1% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 88.9 | 20 / 35 | 4782 |
| 2 | 1 | 69.3 | 94.3 | 23 / 35 | 4639 |
| 3 | 1 | 68.6 | 89.2 | 21 / 35 | 5159 |
| 4 | 1 | 68.9 | 90.8 | 21 / 35 | 5063 |
| 5 | 1 | 68.1 | 87.3 | 22 / 35 | 4766 |
| 6 | 1 | 68.9 | 93.3 | 20 / 35 | 4942 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 88 | 55% |
| lxx.ConceptA 0.8 | 26 | 88% |
| apc.botM 3.0 | 21 | 76% |
| yk.JahMicro 1.0 | 9 | 100% |
| vjik.UnViolation 1.1 | 9 | 100% |
| bayen.UbaMicro 1.4 | 9 | 100% |
| panzer.Panzer 0.2 | 8 | 100% |
| donjezza.Jezza 1.0 | 5 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 819. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 46 | 55% | 95 |
| apc.botM 3.0 | 12 | 14% | 36 |
| lxx.ConceptA 0.8 | 12 | 14% | 22 |
| vjik.UnViolation 1.1 | 5 | 6% | 21 |
| yk.JahMicro 1.0 | 3 | 4% | 8 |
| bayen.UbaMicro 1.4 | 2 | 2% | 12 |
| conscience.Electron 1.3g | 2 | 2% | 5 |
| panzer.Panzer 0.2 | 1 | 1% | 5 |
| donjezza.Jezza 1.0 | 0 | 0% | 6 |

## Melee bench: F33

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 91.4 | 143 / 210 | 1.78 | 20.2% | 31493 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.2% | 143 |
| maribo.Quester 0.3 | 2.0 | 15.1% | 21 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.9% | 20 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.3% | 13 |
| labg.Cataclysm 2.05 | 5.3 | 9.8% | 8 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.2 | 7.9% | 2 |
| baal.nano.N 1.42 | 6.5 | 8.0% | 2 |
| sanja.First 0.1 | 8.5 | 5.1% | 0 |
| zyx.micro.Ant 1.1 | 8.5 | 6.0% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 96.5 | 28 / 35 | 5469 |
| 2 | 1 | 69.6 | 87.9 | 23 / 35 | 4998 |
| 3 | 1 | 71.0 | 93.0 | 24 / 35 | 5366 |
| 4 | 1 | 69.4 | 86.7 | 23 / 35 | 5059 |
| 5 | 1 | 69.0 | 89.5 | 19 / 35 | 4886 |
| 6 | 1 | 71.9 | 94.6 | 26 / 35 | 5715 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 62 | 85% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 80% |
| gre.svman4.Leonidas 1.3.2 | 38 | 87% |
| labg.Cataclysm 2.05 | 14 | 71% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 80% |
| zyx.micro.Ant 1.1 | 3 | 100% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 18 | 27% | 72 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 22% | 59 |
| gre.svman4.Leonidas 1.3.2 | 11 | 16% | 36 |
| labg.Cataclysm 2.05 | 8 | 12% | 20 |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 7% | 8 |
| zyx.micro.Ant 1.1 | 5 | 7% | 7 |
| baal.nano.N 1.42 | 2 | 3% | 3 |
| sanja.First 0.1 | 2 | 3% | 3 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |

## Melee bench: F34

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.1 | 98 / 210 | 2.07 | 18.7% | 31357 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.7% | 98 |
| kid.Gladiator .7.2 | 2.3 | 16.5% | 43 |
| stelo.Spread 0.9 | 2.7 | 16.0% | 53 |
| jcs.Seth 1.8 | 4.2 | 10.8% | 12 |
| cli.Dancer 1.1 | 5.3 | 9.7% | 1 |
| tcf.Reach 3 | 5.5 | 9.6% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.6% | 2 |
| amk.Punbot.Punbot 0.01 | 8.2 | 4.9% | 0 |
| sample.VelociRobot 1.0 | 8.8 | 3.8% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 85.1 | 15 / 35 | 4886 |
| 2 | 1 | 68.8 | 85.1 | 12 / 35 | 5630 |
| 3 | 1 | 70.1 | 89.5 | 19 / 35 | 5256 |
| 4 | 1 | 70.0 | 90.5 | 18 / 35 | 5059 |
| 5 | 1 | 69.4 | 87.9 | 17 / 35 | 5065 |
| 6 | 1 | 70.1 | 90.5 | 17 / 35 | 5461 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 81 | 64% |
| kid.Gladiator .7.2 | 52 | 58% |
| jcs.Seth 1.8 | 11 | 82% |
| ratosh.Wesco 1.4 | 4 | 50% |
| tcf.Reach 3 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 988. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 46 | 41% | 67 |
| stelo.Spread 0.9 | 43 | 38% | 95 |
| jcs.Seth 1.8 | 8 | 7% | 23 |
| tcf.Reach 3 | 6 | 5% | 12 |
| ratosh.Wesco 1.4 | 6 | 5% | 9 |
| cli.Dancer 1.1 | 3 | 3% | 3 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F35

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 82.8 | 39 / 210 | 2.55 | 15.7% | 21813 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.0% | 141 |
| kc.mini.Mirage 0.2 | 2.0 | 15.7% | 39 |
| gh.mini.Gruwel 0.9 | 3.8 | 12.6% | 21 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 11.6% | 5 |
| rz.HawkOnFire 0.1 | 4.2 | 11.9% | 4 |
| wit.Chuliath 1.0 | 6.5 | 6.8% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 6.7% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 5.6% | 0 |
| dans.Cinnamon 1.2 | 8.8 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 87.3 | 10 / 35 | 3714 |
| 2 | 2 | 65.3 | 85.7 | 7 / 35 | 3479 |
| 3 | 2 | 63.8 | 80.3 | 5 / 35 | 3417 |
| 4 | 2 | 64.8 | 81.6 | 5 / 35 | 3828 |
| 5 | 2 | 63.7 | 80.0 | 3 / 35 | 3703 |
| 6 | 2 | 64.9 | 81.9 | 9 / 35 | 3672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 91 | 9% |
| gh.mini.Gruwel 0.9 | 22 | 36% |
| rz.HawkOnFire 0.1 | 12 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 90% |
| wit.Chuliath 1.0 | 1 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 107 | 63% | 114 |
| gh.mini.Gruwel 0.9 | 33 | 19% | 44 |
| rz.HawkOnFire 0.1 | 14 | 8% | 21 |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 6% | 21 |
| stelo.MyAgileRobot 0.2 | 4 | 2% | 4 |
| wit.Chuliath 1.0 | 1 | 1% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 1% | 1 |
| myl.nano.KomoriNinja 1.1 | 0 | 0% | 3 |

## Melee bench: F36

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 96.0 | 182 / 210 | 1.36 | 22.0% | 35049 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 22.0% | 182 |
| bzdp.Pansy 2.1 | 2.0 | 11.8% | 7 |
| alpha.RainingFire 1.0 | 3.3 | 11.0% | 6 |
| bvh.micro.Freya 0.3 | 4.2 | 10.3% | 9 |
| mz.Cork 0.1 | 5.3 | 10.1% | 2 |
| m3thos.Eva02 0.7.1 | 5.7 | 9.8% | 3 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.0% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 6.4% | 0 |
| dl.BetterWalls 1.0 | 9.2 | 5.4% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 94.0 | 30 / 35 | 5425 |
| 2 | 1 | 71.6 | 93.7 | 29 / 35 | 5664 |
| 3 | 1 | 73.0 | 98.7 | 31 / 35 | 6033 |
| 4 | 1 | 72.4 | 97.5 | 30 / 35 | 5745 |
| 5 | 1 | 72.2 | 94.9 | 30 / 35 | 5934 |
| 6 | 1 | 73.2 | 97.5 | 32 / 35 | 6248 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 59 | 98% |
| bvh.micro.Freya 0.3 | 41 | 85% |
| mz.Cork 0.1 | 25 | 92% |
| bvh.mini.Fenrir 0.39 | 22 | 100% |
| m3thos.Eva02 0.7.1 | 21 | 95% |
| alpha.RainingFire 1.0 | 20 | 90% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 29 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 6 | 21% | 70 |
| bvh.micro.Freya 0.3 | 6 | 21% | 21 |
| alpha.RainingFire 1.0 | 5 | 17% | 29 |
| bvh.mini.Fenrir 0.39 | 4 | 14% | 20 |
| m3thos.Eva02 0.7.1 | 3 | 10% | 32 |
| mz.Cork 0.1 | 2 | 7% | 21 |
| dl.BetterWalls 1.0 | 2 | 7% | 6 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 2 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 8 |

## Melee bench: F37

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 93.0 | 175 / 210 | 1.63 | 20.4% | 35011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.4% | 175 |
| germ.TheMind .2 | 2.5 | 10.7% | 7 |
| EBBU.Sim2 1.02 | 3.2 | 10.3% | 3 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.0 | 9.8% | 4 |
| agrach.Dalek 1.0 | 5.0 | 9.2% | 7 |
| lmk.ACPFinal 0.1 | 6.3 | 8.7% | 4 |
| stelo.UntouchableNano 1.3 | 7.2 | 8.3% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 8.5 | 7.5% | 0 |
| skm.Ryubot 1.0 | 8.7 | 7.5% | 2 |
| mb.Beast 0.1 | 8.7 | 7.7% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 94.9 | 29 / 35 | 5649 |
| 2 | 1 | 69.1 | 90.8 | 28 / 35 | 5614 |
| 3 | 1 | 69.6 | 91.7 | 28 / 35 | 5886 |
| 4 | 1 | 71.1 | 97.8 | 34 / 35 | 5622 |
| 5 | 1 | 70.3 | 93.3 | 30 / 35 | 6011 |
| 6 | 1 | 69.4 | 89.2 | 26 / 35 | 6229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| EBBU.Sim2 1.02 | 32 | 100% |
| germ.TheMind .2 | 30 | 97% |
| stelo.UntouchableNano 1.3 | 26 | 88% |
| agrach.Dalek 1.0 | 26 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 19 | 89% |
| lmk.ACPFinal 0.1 | 18 | 89% |
| skm.Ryubot 1.0 | 17 | 100% |
| mb.Beast 0.1 | 14 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 448. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lmk.ACPFinal 0.1 | 8 | 22% | 21 |
| germ.TheMind .2 | 5 | 14% | 39 |
| EBBU.Sim2 1.02 | 5 | 14% | 35 |
| agrach.Dalek 1.0 | 4 | 11% | 39 |
| stelo.UntouchableNano 1.3 | 4 | 11% | 16 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3 | 8% | 31 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 8% | 5 |
| skm.Ryubot 1.0 | 2 | 6% | 4 |
| mb.Beast 0.1 | 1 | 3% | 17 |
1 death(s) with no robot to name.

## Melee bench: F38

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 87.6 | 110 / 210 | 2.12 | 18.1% | 26814 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.1% | 110 |
| justin.Mallais 14.0 | 2.0 | 15.9% | 63 |
| bvh.mini.Freya 0.55 | 3.0 | 12.3% | 10 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.8 | 10.1% | 3 |
| bts.mega.Gnarly 1.4 | 5.2 | 10.2% | 14 |
| cs.Wren 1.0 | 5.2 | 10.3% | 5 |
| kdf.KoulDestroyer 1.0 | 6.8 | 8.9% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 5.6% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 4.2% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 83.5 | 17 / 35 | 4351 |
| 2 | 1 | 68.6 | 90.5 | 20 / 35 | 4545 |
| 3 | 1 | 68.5 | 88.9 | 20 / 35 | 4736 |
| 4 | 1 | 68.1 | 87.3 | 19 / 35 | 4556 |
| 5 | 1 | 68.7 | 92.4 | 19 / 35 | 4239 |
| 6 | 1 | 66.5 | 82.9 | 15 / 35 | 4387 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 76 | 55% |
| bvh.mini.Freya 0.55 | 23 | 87% |
| cs.Wren 1.0 | 17 | 88% |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 100% |
| bts.mega.Gnarly 1.4 | 16 | 88% |
| kdf.KoulDestroyer 1.0 | 2 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 54 | 54% | 93 |
| bvh.mini.Freya 0.55 | 14 | 14% | 32 |
| bts.mega.Gnarly 1.4 | 13 | 13% | 28 |
| cs.Wren 1.0 | 7 | 7% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 5% | 21 |
| kdf.KoulDestroyer 1.0 | 4 | 4% | 10 |
| matt.UnderDark3 2.4.34 | 2 | 2% | 4 |
| bzdp.BoxCar 2.0 | 1 | 1% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 0 | 0% | 2 |

## Melee bench: F39

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.8 | 124 / 210 | 2.10 | 18.7% | 29938 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.7% | 124 |
| bvh.fry.Freya 0.82 | 2.0 | 15.3% | 27 |
| catcat20.Lambda 0.024 | 3.5 | 11.9% | 19 |
| az.Ololobot 0.2.4 | 3.5 | 11.9% | 31 |
| gimp.GimpBot 0.1 | 6.0 | 8.1% | 1 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 7.9% | 3 |
| stelo.SoRobotNanoMelee 1.2 | 6.5 | 8.1% | 5 |
| apollokidd.ApolloKidd 0.9 | 7.3 | 7.1% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.9% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 89.5 | 24 / 35 | 5053 |
| 2 | 1 | 68.4 | 89.5 | 20 / 35 | 5081 |
| 3 | 1 | 68.0 | 88.6 | 20 / 35 | 4737 |
| 4 | 1 | 69.0 | 91.4 | 22 / 35 | 4977 |
| 5 | 1 | 66.5 | 81.6 | 18 / 35 | 4808 |
| 6 | 1 | 68.5 | 86.3 | 20 / 35 | 5282 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Lambda 0.024 | 50 | 80% |
| bvh.fry.Freya 0.82 | 47 | 77% |
| az.Ololobot 0.2.4 | 39 | 67% |
| stelo.SoRobotNanoMelee 1.2 | 13 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| gimp.GimpBot 0.1 | 2 | 50% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 31 | 36% | 65 |
| catcat20.Lambda 0.024 | 21 | 24% | 48 |
| az.Ololobot 0.2.4 | 21 | 24% | 48 |
| stelo.SoRobotNanoMelee 1.2 | 7 | 8% | 17 |
| gimp.GimpBot 0.1 | 3 | 3% | 9 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 11 |
| apollokidd.ApolloKidd 0.9 | 1 | 1% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 3 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |

## Melee bench: F40

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.2 | 116 / 210 | 2.06 | 19.1% | 30091 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.1% | 116 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.0% | 50 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 11.7% | 12 |
| mz.AntiGrav 1.0 | 4.7 | 10.8% | 5 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.8% | 9 |
| alpha.BlackIce 1.0 | 5.8 | 9.0% | 4 |
| stelo.Randomness 1.0 | 6.3 | 8.9% | 14 |
| amk.superstrike.SuperStrike 0.3 | 8.3 | 5.7% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.7 | 5.3% | 0 |
| sample.Corners 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.2 | 21 / 35 | 5368 |
| 2 | 1 | 68.7 | 87.6 | 17 / 35 | 5066 |
| 3 | 1 | 69.1 | 90.5 | 20 / 35 | 4732 |
| 4 | 1 | 68.6 | 86.7 | 19 / 35 | 5089 |
| 5 | 1 | 68.9 | 87.6 | 19 / 35 | 4966 |
| 6 | 1 | 68.8 | 86.7 | 20 / 35 | 4870 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 65 | 52% |
| mz.AntiGrav 1.0 | 27 | 96% |
| Polkwane.SmashMelee 1.0 | 23 | 91% |
| kano.gamma.KanoGamma 1.8 | 19 | 95% |
| stelo.Randomness 1.0 | 14 | 71% |
| alpha.BlackIce 1.0 | 4 | 100% |
| sample.Corners 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 45 | 48% | 67 |
| kano.gamma.KanoGamma 1.8 | 15 | 16% | 51 |
| mz.AntiGrav 1.0 | 9 | 10% | 25 |
| stelo.Randomness 1.0 | 9 | 10% | 25 |
| Polkwane.SmashMelee 1.0 | 8 | 9% | 22 |
| alpha.BlackIce 1.0 | 6 | 6% | 10 |
| amk.superstrike.SuperStrike 0.3 | 2 | 2% | 3 |
| sample.Corners 1.0 | 0 | 0% | 3 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 3 |

## Melee bench: F41

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.8 | 122 / 210 | 2.01 | 18.7% | 27847 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.7% | 122 |
| eem.EvBotNG v12.8 | 2.0 | 15.3% | 52 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.6% | 13 |
| ary.Swarm 1.1 | 3.7 | 12.6% | 10 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.1% | 8 |
| shrub.Silver v048 | 6.0 | 9.0% | 2 |
| zyx.nano.Ant 1.1 | 7.0 | 7.6% | 0 |
| stelo.Mirror 1.1 | 8.3 | 5.6% | 2 |
| jsal.Jsalbot 1.0 | 8.7 | 5.2% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 95.6 | 29 / 35 | 5000 |
| 2 | 1 | 67.9 | 86.3 | 19 / 35 | 4357 |
| 3 | 1 | 68.9 | 89.5 | 21 / 35 | 4356 |
| 4 | 1 | 66.1 | 79.4 | 13 / 35 | 4510 |
| 5 | 1 | 69.6 | 91.4 | 20 / 35 | 4792 |
| 6 | 1 | 69.8 | 90.5 | 20 / 35 | 4832 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 62 | 60% |
| ary.Swarm 1.1 | 32 | 94% |
| simonton.nano.MeleeSeed 1.8 | 30 | 87% |
| lessonz.robocode.Oz 0.5.0 | 30 | 87% |
| stelo.Mirror 1.1 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 40 | 45% | 79 |
| ary.Swarm 1.1 | 19 | 22% | 51 |
| lessonz.robocode.Oz 0.5.0 | 16 | 18% | 37 |
| simonton.nano.MeleeSeed 1.8 | 6 | 7% | 27 |
| zyx.nano.Ant 1.1 | 3 | 3% | 5 |
| stelo.Mirror 1.1 | 2 | 2% | 4 |
| shrub.Silver v048 | 2 | 2% | 2 |
| jsal.Jsalbot 1.0 | 0 | 0% | 4 |

## Melee bench: F42

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.9 | 121 / 210 | 1.91 | 19.6% | 33871 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.6% | 121 |
| wompi.Wallaby 5.1 | 2.7 | 13.9% | 31 |
| maribo.mini.MiniQuester 0.1 | 3.0 | 13.8% | 23 |
| ara.Shera 0.88 | 3.3 | 12.9% | 29 |
| amz.NanoClone 1.41 | 5.0 | 9.5% | 3 |
| maribo.IotaCT 1.1 | 6.2 | 7.8% | 1 |
| dsw.StaticD 1.0 | 7.3 | 6.7% | 0 |
| stelo.MirrorMicro 1.0 | 7.8 | 6.2% | 1 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 92.4 | 22 / 35 | 5924 |
| 2 | 1 | 69.7 | 89.2 | 20 / 35 | 5710 |
| 3 | 1 | 70.4 | 91.4 | 23 / 35 | 5662 |
| 4 | 1 | 68.7 | 88.6 | 19 / 35 | 5410 |
| 5 | 1 | 67.6 | 84.8 | 12 / 35 | 5424 |
| 6 | 1 | 70.8 | 93.0 | 25 / 35 | 5741 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ara.Shera 0.88 | 59 | 78% |
| maribo.mini.MiniQuester 0.1 | 42 | 88% |
| wompi.Wallaby 5.1 | 40 | 73% |
| dsw.StaticD 1.0 | 4 | 100% |
| amz.NanoClone 1.41 | 2 | 0% |
| maribo.IotaCT 1.1 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 50% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 40 | 45% | 69 |
| ara.Shera 0.88 | 20 | 22% | 58 |
| maribo.mini.MiniQuester 0.1 | 15 | 17% | 56 |
| amz.NanoClone 1.41 | 5 | 6% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 3 | 3% | 6 |
| mme.NikeEnhanced 2.0 | 3 | 3% | 4 |
| dsw.StaticD 1.0 | 1 | 1% | 7 |
| maribo.IotaCT 1.1 | 1 | 1% | 2 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 2 |

## Melee bench: F43

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 80.2 | 35 / 210 | 2.79 | 15.7% | 23547 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.2% | 147 |
| kc.mini.Mirage 0.2 | 2.0 | 15.7% | 35 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.2% | 19 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.3% | 5 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.7% | 2 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.4% | 1 |
| jab.DiamondStealer 5 | 6.8 | 7.9% | 1 |
| mz.NanoGod 2.02 | 8.0 | 6.9% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 79.7 | 6 / 35 | 3820 |
| 2 | 2 | 66.9 | 84.4 | 7 / 35 | 4176 |
| 3 | 2 | 65.9 | 79.4 | 6 / 35 | 3978 |
| 4 | 2 | 64.0 | 75.6 | 3 / 35 | 3991 |
| 5 | 2 | 65.0 | 79.7 | 7 / 35 | 3513 |
| 6 | 2 | 66.3 | 82.2 | 6 / 35 | 4069 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 99 | 17% |
| brainfade.melee.Dusk 0.44 | 12 | 58% |
| dummy.micro.Sparrow 2.5 | 8 | 75% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 100% |
| mz.NanoGod 2.02 | 1 | 0% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 961. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 115 | 66% | 131 |
| brainfade.melee.Dusk 0.44 | 24 | 14% | 31 |
| dummy.micro.Sparrow 2.5 | 11 | 6% | 15 |
| wcsv.melee.EngineerMelee 0.1 | 10 | 6% | 15 |
| mz.NanoGod 2.02 | 7 | 4% | 7 |
| jab.DiamondStealer 5 | 5 | 3% | 7 |
| Krabb.akim2.Akim2 1.1b | 3 | 2% | 3 |
| cvt.Firsty 1.0 | 0 | 0% | 1 |

## Melee bench: F44

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 92.8 | 144 / 210 | 1.65 | 20.5% | 33414 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.5% | 144 |
| tzu.TheArtOfWar 1.2 | 2.3 | 14.5% | 25 |
| stelo.Liblix 0.3.1 | 2.7 | 14.1% | 34 |
| wompi.Quokka 1.6 | 4.5 | 10.1% | 0 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.2 | 9.1% | 1 |
| jwirde.Gort 2.0 | 5.3 | 9.1% | 4 |
| disan.Chair 2.2.0 | 7.0 | 7.4% | 2 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.3% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.7% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 94.9 | 26 / 35 | 5739 |
| 2 | 1 | 71.4 | 95.2 | 24 / 35 | 5728 |
| 3 | 1 | 71.2 | 93.0 | 23 / 35 | 5721 |
| 4 | 1 | 70.2 | 90.5 | 22 / 35 | 5550 |
| 5 | 1 | 71.3 | 94.9 | 26 / 35 | 5506 |
| 6 | 1 | 69.6 | 88.3 | 23 / 35 | 5170 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 81 | 73% |
| tzu.TheArtOfWar 1.2 | 70 | 76% |
| wompi.Quokka 1.6 | 13 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 90% |
| disan.Chair 2.2.0 | 7 | 86% |
| jwirde.Gort 2.0 | 4 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 25 | 38% | 86 |
| tzu.TheArtOfWar 1.2 | 25 | 38% | 71 |
| stf.PanzerGeneral 0.1 | 5 | 8% | 8 |
| wompi.Quokka 1.6 | 4 | 6% | 15 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 5% | 11 |
| disan.Chair 2.2.0 | 2 | 3% | 5 |
| jwirde.Gort 2.0 | 1 | 2% | 7 |
| amk.jointstrike.JointStrike 0.2 | 1 | 2% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 4 |

## Melee bench: F45

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.8 | 93 / 210 | 1.91 | 20.2% | 36526 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.2% | 93 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 12.6% | 97 |
| jje.BagPuss 1.2 | 3.5 | 11.1% | 7 |
| sul.Lunar 1.1 | 4.5 | 10.1% | 4 |
| myl.nano.Graviton 1.10 | 4.5 | 10.1% | 3 |
| fm.claire 1.7 | 6.5 | 8.6% | 1 |
| hvilela.HVilela 0.9 | 6.7 | 8.2% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 8.2% | 6 |
| wit.Deep7 2.0 | 9.0 | 6.0% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 90.8 | 16 / 35 | 6226 |
| 2 | 1 | 70.1 | 90.5 | 16 / 35 | 6144 |
| 3 | 1 | 68.9 | 86.0 | 12 / 35 | 6143 |
| 4 | 1 | 69.5 | 88.6 | 12 / 35 | 6119 |
| 5 | 1 | 69.6 | 89.5 | 17 / 35 | 5866 |
| 6 | 1 | 71.1 | 93.7 | 20 / 35 | 6028 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 102 | 26% |
| jje.BagPuss 1.2 | 22 | 86% |
| sul.Lunar 1.1 | 20 | 95% |
| myl.nano.Graviton 1.10 | 12 | 92% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 80% |
| wit.Deep7 2.0 | 7 | 100% |
| fm.claire 1.7 | 1 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 1960. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 76 | 64% | 0 |
| jje.BagPuss 1.2 | 12 | 10% | 58 |
| myl.nano.Graviton 1.10 | 9 | 8% | 34 |
| sul.Lunar 1.1 | 7 | 6% | 55 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 4% | 22 |
| fm.claire 1.7 | 5 | 4% | 13 |
| hvilela.HVilela 0.9 | 3 | 3% | 14 |
| abud.ThirdRobo 1.0 | 1 | 1% | 2 |
| wit.Deep7 2.0 | 0 | 0% | 10 |
1 death(s) with no robot to name.

## Melee bench: F46

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.7 | 80 / 210 | 2.20 | 17.7% | 28892 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.7% | 80 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 16.9% | 90 |
| hadur117.mini.Deise 0.2 | 3.0 | 14.5% | 24 |
| mz.MicroSheep 1.0 | 4.5 | 10.7% | 2 |
| cx.Princess 1.0 | 4.5 | 10.5% | 13 |
| sadoner.killer 0.2 | 6.0 | 8.6% | 1 |
| arthord.NanoSatanMelee Beta | 7.5 | 6.9% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.7 | 5.9% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.0% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 89.5 | 14 / 35 | 4728 |
| 2 | 1 | 65.8 | 84.1 | 9 / 35 | 4525 |
| 3 | 1 | 68.7 | 88.9 | 14 / 35 | 5218 |
| 4 | 2 | 67.5 | 86.0 | 14 / 35 | 4755 |
| 5 | 1 | 69.0 | 88.6 | 18 / 35 | 5314 |
| 6 | 2 | 65.5 | 83.2 | 11 / 35 | 4352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 83 | 20% |
| hadur117.mini.Deise 0.2 | 37 | 84% |
| cx.Princess 1.0 | 22 | 77% |
| mz.MicroSheep 1.0 | 13 | 92% |
| arthord.NanoSatanMelee Beta | 3 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 75 | 58% | 93 |
| hadur117.mini.Deise 0.2 | 28 | 22% | 60 |
| cx.Princess 1.0 | 12 | 9% | 26 |
| mz.MicroSheep 1.0 | 7 | 5% | 17 |
| arthord.NanoSatanMelee Beta | 4 | 3% | 7 |
| sadoner.killer 0.2 | 4 | 3% | 5 |
| jeremyreeder.collective.Prophet 5 | 0 | 0% | 2 |

