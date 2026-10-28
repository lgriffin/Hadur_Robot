# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 82.9 | 46 / 210 | 2.54 | 16.6% | 29872 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 137 |
| hadur117.mini.DeiseWB 0.2 | 2.0 | 16.6% | 46 |
| sgp.JollyNinja 3.53 | 3.7 | 11.1% | 15 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.2 | 11.1% | 3 |
| mz.MicroGodMelee 1 | 4.2 | 10.8% | 6 |
| lorneswork.Predator 1.0 | 6.0 | 9.8% | 1 |
| adt.Ar2 1.0 | 7.0 | 7.5% | 2 |
| skm.butterfly 1.0 | 8.5 | 4.8% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.5 | 4.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 82.5 | 8 / 35 | 5011 |
| 2 | 2 | 65.3 | 80.0 | 7 / 35 | 4953 |
| 3 | 2 | 65.2 | 78.7 | 10 / 35 | 4554 |
| 4 | 2 | 67.2 | 86.3 | 7 / 35 | 5103 |
| 5 | 2 | 67.5 | 87.6 | 8 / 35 | 5223 |
| 6 | 2 | 65.8 | 81.9 | 6 / 35 | 5028 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 102 | 21% |
| sgp.JollyNinja 3.53 | 20 | 70% |
| mz.MicroGodMelee 1 | 8 | 75% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 60% |
| lorneswork.Predator 1.0 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 0% |

Hadur died in 164 of 210 rounds, at a mean tick of 1009. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 107 | 65% | 131 |
| sgp.JollyNinja 3.53 | 21 | 13% | 28 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 8% | 18 |
| mz.MicroGodMelee 1 | 9 | 5% | 16 |
| lorneswork.Predator 1.0 | 8 | 5% | 9 |
| adt.Ar2 1.0 | 3 | 2% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 2 |
| skm.butterfly 1.0 | 1 | 1% | 2 |

## Melee bench: F02

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 82.2 | 99 / 210 | 2.60 | 17.9% | 30914 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 17.9% | 99 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.6% | 34 |
| pulsar.PulsarMax 0.8.9 | 2.7 | 13.4% | 41 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.1% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.3 | 9.5% | 10 |
| fnc.bandit.Bandit 5.2.0 | 6.2 | 8.5% | 1 |
| sch.Simone 0.3d | 7.0 | 7.8% | 10 |
| Noran.BitchingElk 0.054 | 7.7 | 7.3% | 8 |
| stelo.PatternRobot 1.0 | 8.7 | 6.7% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 4.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 89.5 | 21 / 35 | 5231 |
| 2 | 1 | 66.9 | 82.2 | 15 / 35 | 5025 |
| 3 | 1 | 67.6 | 82.9 | 15 / 35 | 5321 |
| 4 | 1 | 65.6 | 77.8 | 15 / 35 | 4992 |
| 5 | 1 | 67.0 | 81.3 | 17 / 35 | 5263 |
| 6 | 1 | 66.6 | 79.7 | 16 / 35 | 5082 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 53 | 70% |
| pulsar.PulsarMax 0.8.9 | 29 | 59% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 100% |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 50% |
| Noran.BitchingElk 0.054 | 10 | 80% |
| stelo.PatternRobot 1.0 | 9 | 78% |
| sch.Simone 0.3d | 6 | 100% |
| fnc.bandit.Bandit 5.2.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 1 | 0% |

Hadur died in 111 of 210 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 28 | 25% | 63 |
| pulsar.PulsarMax 0.8.9 | 28 | 25% | 54 |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 14% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 9% | 20 |
| stelo.PatternRobot 1.0 | 9 | 8% | 9 |
| sch.Simone 0.3d | 7 | 6% | 15 |
| fnc.bandit.Bandit 5.2.0 | 6 | 5% | 10 |
| Noran.BitchingElk 0.054 | 4 | 4% | 14 |
| fullsail.SweetTea 1.1 | 3 | 3% | 4 |

## Melee bench: F03

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.2 | 135 / 210 | 1.97 | 19.7% | 37701 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 19.7% | 135 |
| radnor.DoctorBob 1.42 | 2.3 | 14.3% | 22 |
| vuen.Cake 2.51 | 3.0 | 13.0% | 29 |
| kawigi.nano.Lib 1.0 | 3.7 | 12.5% | 15 |
| urdos.URDOS 1.3 | 5.0 | 9.7% | 7 |
| adt.Ar1 2.1 | 6.2 | 7.5% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.2 | 6.8% | 2 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.2 | 5.4% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 81.9 | 20 / 35 | 6008 |
| 2 | 1 | 69.3 | 89.8 | 21 / 35 | 6179 |
| 3 | 1 | 71.2 | 94.9 | 25 / 35 | 6614 |
| 4 | 1 | 68.5 | 83.2 | 19 / 35 | 6112 |
| 5 | 1 | 70.6 | 93.3 | 26 / 35 | 6293 |
| 6 | 1 | 70.8 | 92.1 | 24 / 35 | 6495 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 56 | 61% |
| radnor.DoctorBob 1.42 | 51 | 92% |
| kawigi.nano.Lib 1.0 | 48 | 94% |
| adt.Ar1 2.1 | 5 | 100% |
| urdos.URDOS 1.3 | 4 | 25% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 50% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 34 | 44% | 70 |
| radnor.DoctorBob 1.42 | 19 | 25% | 56 |
| kawigi.nano.Lib 1.0 | 10 | 13% | 51 |
| urdos.URDOS 1.3 | 9 | 12% | 10 |
| ghent.ArthurPanzergon 1.0.0 | 4 | 5% | 9 |
| oa.weak.FlyMk1 0.1 | 1 | 1% | 6 |
| adt.Ar1 2.1 | 0 | 0% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 | 0% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 82.1 | 26 / 210 | 2.61 | 16.8% | 33321 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.2% | 174 |
| hadur117.mini.DeiseWB 0.2 | 2.0 | 16.8% | 26 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.8% | 6 |
| TNT.TNT 0.99.1 | 4.2 | 10.9% | 1 |
| josago.Jorgito 0.16 | 4.8 | 9.7% | 2 |
| css.Delitioner 0.11 | 6.5 | 7.2% | 1 |
| tj.zombie1n 1.0.1 | 7.0 | 6.4% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.1% | 0 |
| sp.Nanos.Ember 1.1 | 8.8 | 4.4% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.1 | 85.7 | 5 / 35 | 5707 |
| 2 | 2 | 66.7 | 81.6 | 2 / 35 | 5339 |
| 3 | 2 | 68.9 | 87.0 | 7 / 35 | 5969 |
| 4 | 2 | 66.4 | 79.0 | 4 / 35 | 5450 |
| 5 | 2 | 66.0 | 79.4 | 4 / 35 | 5261 |
| 6 | 2 | 67.1 | 80.0 | 4 / 35 | 5595 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 133 | 14% |
| apc.LeeroyJenkins2 1.0 | 5 | 40% |
| josago.Jorgito 0.16 | 3 | 100% |
| TNT.TNT 0.99.1 | 3 | 67% |

Hadur died in 184 of 210 rounds, at a mean tick of 1180. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 144 | 78% | 163 |
| apc.LeeroyJenkins2 1.0 | 15 | 8% | 17 |
| josago.Jorgito 0.16 | 9 | 5% | 11 |
| css.Delitioner 0.11 | 6 | 3% | 6 |
| TNT.TNT 0.99.1 | 5 | 3% | 7 |
| rampancy.Durandal 2.1d | 3 | 2% | 3 |
| tj.zombie1n 1.0.1 | 2 | 1% | 3 |

## Melee bench: F05

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 69.4 | 23 / 210 | 3.75 | 13.3% | 21239 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.5% | 106 |
| justin.DemonicRage 3.4 | 1.7 | 17.2% | 62 |
| hadur117.mini.DeiseWB 0.2 | 3.2 | 13.3% | 23 |
| wompi.Numbat 2.1 | 3.8 | 12.5% | 14 |
| ms.Ares 0.19 | 5.2 | 9.4% | 1 |
| axeBots.HataMoto 3.09 | 5.8 | 8.7% | 3 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.0% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.9% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.6% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 67.0 | 6 / 35 | 3636 |
| 2 | 3 | 61.1 | 70.5 | 5 / 35 | 3594 |
| 3 | 3 | 60.5 | 70.5 | 4 / 35 | 3528 |
| 4 | 4 | 59.2 | 67.6 | 1 / 35 | 3251 |
| 5 | 3 | 60.5 | 68.9 | 4 / 35 | 3569 |
| 6 | 3 | 61.5 | 72.1 | 3 / 35 | 3661 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 25 | 28% |
| justin.DemonicRage 3.4 | 24 | 29% |
| wompi.Numbat 2.1 | 5 | 100% |
| axeBots.HataMoto 3.09 | 3 | 100% |
| ms.Ares 0.19 | 2 | 50% |

Hadur died in 187 of 210 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 66 | 35% | 74 |
| justin.DemonicRage 3.4 | 63 | 34% | 68 |
| wompi.Numbat 2.1 | 29 | 16% | 32 |
| ms.Ares 0.19 | 14 | 7% | 17 |
| supersample.SuperBoxBot 1.0 | 5 | 3% | 5 |
| axeBots.HataMoto 3.09 | 4 | 2% | 8 |
| Queens_teamrobot.UltraRazor 1.0 | 4 | 2% | 4 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 1 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 77.0 | 67 / 210 | 3.07 | 16.0% | 26859 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.5 | 16.0% | 67 |
| jekl.StoneGhost 0.7 | 2.0 | 14.7% | 36 |
| origin.SleepSiphon 1.7b | 2.7 | 13.5% | 50 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 12.1% | 27 |
| mld.Wisdom 1.0 | 4.8 | 11.2% | 11 |
| gg.Wolverine 2.0 | 5.8 | 8.8% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 6.8% | 9 |
| spinnercat.Omen 1.0 | 8.2 | 6.8% | 0 |
| DBall.NUKE 0.1 | 8.2 | 6.8% | 1 |
| sample.Fire 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.1 | 69.8 | 5 / 35 | 3990 |
| 2 | 2 | 62.7 | 70.5 | 8 / 35 | 4412 |
| 3 | 1 | 63.7 | 73.3 | 9 / 35 | 4595 |
| 4 | 1 | 66.7 | 81.9 | 16 / 35 | 4762 |
| 5 | 1 | 67.1 | 84.8 | 17 / 35 | 4857 |
| 6 | 1 | 65.4 | 81.6 | 12 / 35 | 4243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 36 | 72% |
| origin.SleepSiphon 1.7b | 32 | 44% |
| pe.minimelee.SandboxMiniMelee 1.1 | 24 | 67% |
| gg.Wolverine 2.0 | 6 | 50% |
| mld.Wisdom 1.0 | 4 | 75% |
| DBall.NUKE 0.1 | 3 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 36 | 25% | 56 |
| jekl.StoneGhost 0.7 | 35 | 24% | 53 |
| pe.minimelee.SandboxMiniMelee 1.1 | 31 | 22% | 46 |
| mld.Wisdom 1.0 | 23 | 16% | 28 |
| gg.Wolverine 2.0 | 8 | 6% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 3% | 6 |
| spinnercat.Omen 1.0 | 4 | 3% | 6 |
| DBall.NUKE 0.1 | 2 | 1% | 5 |

## Melee bench: F07

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 89.4 | 94 / 210 | 1.95 | 19.3% | 36021 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.2 | 19.3% | 94 |
| rsalesc.melee.Monk 0.3.6c | 1.8 | 17.8% | 58 |
| rtk.Tachikoma 1.0 | 3.0 | 15.9% | 37 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.9% | 7 |
| franzor.Lizt 1.3.1 | 4.5 | 10.9% | 15 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.7% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.3 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 88.9 | 18 / 35 | 5729 |
| 2 | 1 | 71.1 | 89.8 | 17 / 35 | 6219 |
| 3 | 1 | 71.4 | 91.7 | 19 / 35 | 6114 |
| 4 | 1 | 71.3 | 92.7 | 17 / 35 | 6088 |
| 5 | 1 | 69.8 | 87.0 | 11 / 35 | 6063 |
| 6 | 2 | 69.5 | 86.3 | 12 / 35 | 5808 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 84 | 69% |
| rsalesc.melee.Monk 0.3.6c | 56 | 25% |
| franzor.Lizt 1.3.1 | 15 | 53% |
| oog.melee.CapuletDroid 1.1 | 13 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 1221. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 63 | 54% | 85 |
| rtk.Tachikoma 1.0 | 38 | 33% | 94 |
| franzor.Lizt 1.3.1 | 9 | 8% | 7 |
| oog.melee.CapuletDroid 1.1 | 5 | 4% | 18 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 2 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.7 | 110 / 210 | 2.29 | 18.6% | 30857 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 18.6% | 110 |
| tm.Yuugao 1.0 | 2.3 | 12.9% | 41 |
| shrub.Vapour v159 | 2.7 | 12.5% | 27 |
| Krabb.sliNk.Garm 0.9u | 4.7 | 10.3% | 15 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 9.4% | 12 |
| m3thos.Eva00 1.1 | 6.2 | 8.4% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 8.0% | 1 |
| qualidafial.MajorDick 1.0.1 | 8.2 | 7.0% | 2 |
| SHAM.WOW 1.4 | 8.5 | 6.9% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.0 | 20 / 35 | 5375 |
| 2 | 1 | 68.5 | 86.7 | 23 / 35 | 5220 |
| 3 | 1 | 67.9 | 86.0 | 18 / 35 | 5247 |
| 4 | 1 | 66.9 | 83.5 | 14 / 35 | 5020 |
| 5 | 1 | 66.4 | 81.3 | 15 / 35 | 4931 |
| 6 | 1 | 68.5 | 89.5 | 20 / 35 | 5064 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 43 | 53% |
| shrub.Vapour v159 | 38 | 74% |
| Krabb.sliNk.Garm 0.9u | 24 | 79% |
| jwst.DAD.DarkAndDarker 1.1 | 17 | 100% |
| m3thos.Eva00 1.1 | 13 | 92% |
| com.spp.robocode.MostlyHarmless 010 | 9 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 50% |
| SHAM.WOW 1.4 | 2 | 50% |

Hadur died in 101 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 37 | 37% | 68 |
| shrub.Vapour v159 | 27 | 27% | 50 |
| Krabb.sliNk.Garm 0.9u | 11 | 11% | 25 |
| com.spp.robocode.MostlyHarmless 010 | 7 | 7% | 17 |
| m3thos.Eva00 1.1 | 6 | 6% | 12 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 5% | 24 |
| SHAM.WOW 1.4 | 4 | 4% | 6 |
| zyx.nano.BacillusComma 1.0 | 2 | 2% | 4 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 2 |

## Melee bench: F09

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 72.8 | 55 / 210 | 3.45 | 15.2% | 25107 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.8% | 97 |
| hadur117.mini.DeiseWB 0.2 | 2.0 | 15.2% | 55 |
| kc.micro.Figment 1.0 | 3.0 | 13.6% | 24 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.6% | 19 |
| yagami.Tidus 0.11 | 4.8 | 10.2% | 2 |
| mc2.enemy.Original 0.9 | 5.3 | 9.6% | 12 |
| dft.Calliope 5.6 | 7.0 | 7.7% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.3% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.7% | 1 |
| rdm.Dueler 0.4x | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 74.0 | 8 / 35 | 4238 |
| 2 | 2 | 62.4 | 71.7 | 6 / 35 | 4026 |
| 3 | 2 | 63.4 | 72.7 | 11 / 35 | 4086 |
| 4 | 2 | 64.1 | 74.6 | 9 / 35 | 4270 |
| 5 | 2 | 64.0 | 72.7 | 12 / 35 | 4170 |
| 6 | 2 | 63.4 | 70.8 | 9 / 35 | 4317 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 56 | 36% |
| kc.micro.Figment 1.0 | 22 | 59% |
| yagami.Tidus 0.11 | 9 | 89% |
| mc2.enemy.Original 0.9 | 8 | 75% |
| pedersen.Grishnakh 1.0 | 8 | 63% |
| step.nanoPri 1.0 | 2 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 0% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 739. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 76 | 49% | 100 |
| kc.micro.Figment 1.0 | 25 | 16% | 42 |
| mc2.enemy.Original 0.9 | 17 | 11% | 23 |
| yagami.Tidus 0.11 | 13 | 8% | 14 |
| pedersen.Grishnakh 1.0 | 12 | 8% | 18 |
| robar.nano.Assertive_Melee 0.2 | 6 | 4% | 6 |
| step.nanoPri 1.0 | 3 | 2% | 3 |
| dft.Calliope 5.6 | 2 | 1% | 3 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |

## Melee bench: F10

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 90.7 | 144 / 210 | 1.83 | 19.6% | 33942 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 19.6% | 144 |
| DTF.Kludgy 1.2b | 2.2 | 14.6% | 35 |
| ne.Chimera 1.2 | 3.2 | 12.4% | 7 |
| ejb.Polaris 1.0.1 | 3.8 | 12.0% | 12 |
| vStar.RAFzilla 2.15 | 5.3 | 10.4% | 7 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.2% | 2 |
| kurios.DOSexe .9b | 7.7 | 5.8% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.3% | 1 |
| sam.Samspin 1.0 | 8.3 | 5.3% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 94.6 | 27 / 35 | 5892 |
| 2 | 1 | 68.7 | 88.3 | 20 / 35 | 5417 |
| 3 | 1 | 68.3 | 87.6 | 18 / 35 | 5284 |
| 4 | 1 | 70.6 | 93.3 | 28 / 35 | 5550 |
| 5 | 1 | 70.8 | 92.7 | 26 / 35 | 6094 |
| 6 | 1 | 69.4 | 87.9 | 25 / 35 | 5705 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 67 | 72% |
| ne.Chimera 1.2 | 34 | 94% |
| ejb.Polaris 1.0.1 | 29 | 79% |
| vStar.RAFzilla 2.15 | 18 | 89% |
| tvv.micro.Antares 1.1.1 | 16 | 100% |
| kurios.DOSexe .9b | 6 | 83% |
| donjezza.Muncho 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 29 | 44% | 68 |
| ejb.Polaris 1.0.1 | 15 | 23% | 42 |
| ne.Chimera 1.2 | 9 | 14% | 38 |
| vStar.RAFzilla 2.15 | 4 | 6% | 16 |
| kurios.DOSexe .9b | 4 | 6% | 15 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 4 |
| tvv.micro.Antares 1.1.1 | 2 | 3% | 22 |
| sam.Samspin 1.0 | 0 | 0% | 3 |
| donjezza.Muncho 1.0 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 80.4 | 85 / 210 | 2.76 | 17.1% | 28088 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 17.1% | 85 |
| rz.Aleph 0.34 | 2.0 | 16.1% | 60 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.2% | 21 |
| djc.DynaBot 0.1.1 | 3.8 | 11.1% | 15 |
| br2.MobyDickBot 1.6 | 5.5 | 9.1% | 11 |
| rdt199.Warlord 0.73 | 5.8 | 9.0% | 11 |
| uji.YellohFellah 1.0 | 6.8 | 8.3% | 8 |
| KiraNL.Chupacabra 0.4 | 7.8 | 6.8% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 77.8 | 13 / 35 | 4510 |
| 2 | 1 | 66.7 | 81.3 | 16 / 35 | 4688 |
| 3 | 1 | 66.5 | 82.5 | 16 / 35 | 4625 |
| 4 | 1 | 66.6 | 82.5 | 14 / 35 | 4690 |
| 5 | 1 | 66.5 | 82.2 | 13 / 35 | 4921 |
| 6 | 1 | 64.7 | 76.2 | 13 / 35 | 4654 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 57 | 56% |
| cx.mini.Nimrod 0.55 | 23 | 83% |
| djc.DynaBot 0.1.1 | 17 | 76% |
| uji.YellohFellah 1.0 | 14 | 71% |
| rdt199.Warlord 0.73 | 9 | 78% |
| br2.MobyDickBot 1.6 | 4 | 50% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 53 | 42% | 82 |
| cx.mini.Nimrod 0.55 | 23 | 18% | 37 |
| djc.DynaBot 0.1.1 | 18 | 14% | 28 |
| rdt199.Warlord 0.73 | 11 | 9% | 21 |
| uji.YellohFellah 1.0 | 8 | 6% | 18 |
| KiraNL.Chupacabra 0.4 | 4 | 3% | 6 |
| br2.MobyDickBot 1.6 | 3 | 2% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 5 |
| stelo.MirrorNano 1.3 | 2 | 2% | 2 |

## Melee bench: F12

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 79.6 | 94 / 210 | 2.83 | 16.8% | 24897 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 16.8% | 94 |
| darkcanuck.Leon 1.01 | 2.8 | 13.4% | 35 |
| nat.PallasHawk 1.0 | 3.0 | 12.9% | 34 |
| bts.wiki.RipCurl 0.9b | 3.3 | 12.7% | 22 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.8% | 15 |
| jrm.Test0 1.0 | 6.3 | 8.1% | 4 |
| jp.Perpy 16.0 | 7.3 | 7.2% | 2 |
| cs.sheldor.Talon 1.1 | 7.7 | 6.9% | 1 |
| jaybot.bots.Oddball 4.0 | 8.8 | 6.0% | 3 |
| stuff.Vlad 0.1 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 84.1 | 17 / 35 | 4585 |
| 2 | 1 | 62.0 | 72.4 | 13 / 35 | 3474 |
| 3 | 1 | 62.6 | 71.7 | 11 / 35 | 3993 |
| 4 | 1 | 66.5 | 80.6 | 17 / 35 | 4438 |
| 5 | 1 | 66.0 | 82.2 | 18 / 35 | 4053 |
| 6 | 1 | 67.4 | 86.7 | 18 / 35 | 4354 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 39 | 72% |
| nat.PallasHawk 1.0 | 38 | 71% |
| bts.wiki.RipCurl 0.9b | 31 | 74% |
| brainfade.melee.Genghis 0.36 | 15 | 67% |
| jaybot.bots.Oddball 4.0 | 3 | 100% |
| jrm.Test0 1.0 | 2 | 50% |
| jp.Perpy 16.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 28 | 24% | 50 |
| darkcanuck.Leon 1.01 | 25 | 21% | 68 |
| bts.wiki.RipCurl 0.9b | 23 | 20% | 37 |
| brainfade.melee.Genghis 0.36 | 21 | 18% | 25 |
| jrm.Test0 1.0 | 11 | 9% | 12 |
| cs.sheldor.Talon 1.1 | 4 | 3% | 7 |
| jp.Perpy 16.0 | 4 | 3% | 6 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 2 |

## Melee bench: F13

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 80.5 | 52 / 210 | 2.75 | 16.0% | 27220 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 17.2% | 87 |
| ags.Glacier 0.2.11 | 2.2 | 16.8% | 46 |
| hadur117.mini.DeiseWB 0.2 | 2.3 | 16.0% | 52 |
| shinh.Entangled 0.3 | 4.2 | 11.7% | 14 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.1% | 10 |
| apc.Colossus2 0.17 | 6.0 | 7.8% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.2% | 1 |
| ayk.WallHugger 1.0 | 8.2 | 5.4% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.5% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 85.4 | 14 / 35 | 4739 |
| 2 | 2 | 66.1 | 84.1 | 9 / 35 | 4610 |
| 3 | 2 | 65.8 | 80.6 | 12 / 35 | 4486 |
| 4 | 3 | 64.6 | 77.5 | 6 / 35 | 4702 |
| 5 | 3 | 64.8 | 78.1 | 6 / 35 | 4402 |
| 6 | 3 | 63.9 | 77.5 | 5 / 35 | 4281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 51 | 37% |
| ags.Glacier 0.2.11 | 40 | 58% |
| shinh.Entangled 0.3 | 10 | 60% |
| gh.micro.Gruweltje 0.7 | 6 | 67% |

Hadur died in 158 of 210 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 61 | 39% | 82 |
| ags.Glacier 0.2.11 | 45 | 28% | 67 |
| shinh.Entangled 0.3 | 27 | 17% | 33 |
| gh.micro.Gruweltje 0.7 | 14 | 9% | 17 |
| stelo.Wang 1.0 | 5 | 3% | 5 |
| apc.Colossus2 0.17 | 3 | 2% | 3 |
| ayk.WallHugger 1.0 | 2 | 1% | 2 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 90.8 | 136 / 210 | 1.82 | 19.9% | 34241 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 19.9% | 136 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.5% | 36 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.3% | 20 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.7% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 9.2% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 5.7 | 9.1% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 8.5% | 8 |
| Lo_Ian.Gandalf_V4 4.0 | 6.8 | 8.5% | 0 |
| pa.Improved 1.0 | 9.0 | 5.5% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 92.7 | 26 / 35 | 5810 |
| 2 | 1 | 70.4 | 91.1 | 23 / 35 | 5575 |
| 3 | 1 | 69.1 | 88.9 | 16 / 35 | 5582 |
| 4 | 1 | 69.9 | 89.8 | 24 / 35 | 5533 |
| 5 | 1 | 70.8 | 92.1 | 24 / 35 | 5850 |
| 6 | 1 | 70.2 | 90.5 | 23 / 35 | 5891 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 82 | 82% |
| catcat20.shape.Theta 0.018 | 41 | 71% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 12 | 83% |
| sanyi.mikrobi.Roberto 1.0 | 9 | 78% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 30 | 41% | 94 |
| catcat20.shape.Theta 0.018 | 18 | 24% | 39 |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 12% | 18 |
| sanyi.mikrobi.Roberto 1.0 | 7 | 9% | 18 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 5% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 13 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 3% | 5 |
| pa.Improved 1.0 | 1 | 1% | 6 |
| sample.TrackFire 1.0 | 1 | 1% | 1 |

## Melee bench: F15

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 82.1 | 103 / 210 | 2.61 | 18.3% | 33078 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 18.3% | 103 |
| emp.Yngwie 1.11 | 2.7 | 13.3% | 47 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.0% | 17 |
| mld.DustBunny 3.8 | 3.5 | 12.8% | 15 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.5% | 3 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.7% | 23 |
| lambdaxy.TBot 0.1 | 7.2 | 6.5% | 0 |
| Grystrion.TrackerWO 1.0 | 8.3 | 6.1% | 1 |
| divineomega.TrialBot 0.003 | 8.7 | 5.3% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 86.7 | 20 / 35 | 5793 |
| 2 | 1 | 67.7 | 81.9 | 17 / 35 | 5434 |
| 3 | 1 | 66.9 | 79.7 | 15 / 35 | 5428 |
| 4 | 1 | 67.2 | 80.6 | 17 / 35 | 5339 |
| 5 | 1 | 68.4 | 83.5 | 17 / 35 | 5717 |
| 6 | 1 | 67.4 | 80.0 | 17 / 35 | 5367 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 36 | 64% |
| mld.DustBunny 3.8 | 26 | 96% |
| kawigi.micro.Shiz 1.1 | 22 | 91% |
| cb.nano.Insomnia 1.0 | 22 | 91% |
| kawigi.robot.Girl 1.2 | 15 | 73% |
| divineomega.TrialBot 0.003 | 5 | 80% |

Hadur died in 107 of 210 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 38 | 36% | 71 |
| mld.DustBunny 3.8 | 20 | 19% | 48 |
| kawigi.micro.Shiz 1.1 | 18 | 17% | 37 |
| kawigi.robot.Girl 1.2 | 13 | 12% | 21 |
| cb.nano.Insomnia 1.0 | 7 | 7% | 10 |
| divineomega.TrialBot 0.003 | 4 | 4% | 12 |
| lambdaxy.TBot 0.1 | 4 | 4% | 5 |
| Grystrion.TrackerWO 1.0 | 3 | 3% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.0 | 85 / 210 | 2.62 | 18.0% | 33415 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 18.0% | 85 |
| gh.Griezel 0.5.2 | 2.0 | 16.3% | 62 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.9% | 13 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.3% | 33 |
| tvv.nano.Polaris 1.2 | 5.7 | 8.9% | 5 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 9.2% | 5 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 7.6% | 4 |
| asd.Cthulhu 1.3 | 8.3 | 5.5% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.2 | 5.2% | 3 |
| repositorio.NanoStep 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 82.5 | 13 / 35 | 5443 |
| 2 | 1 | 68.4 | 83.2 | 16 / 35 | 5659 |
| 3 | 1 | 67.1 | 81.0 | 15 / 35 | 5468 |
| 4 | 1 | 67.7 | 83.5 | 13 / 35 | 5527 |
| 5 | 1 | 67.3 | 79.7 | 14 / 35 | 5619 |
| 6 | 1 | 67.7 | 81.9 | 14 / 35 | 5699 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 69 | 58% |
| techdude.forest.FlamingForest 1.1 | 22 | 50% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 100% |
| stelo.IntrinsicVolatility 1.4 | 8 | 75% |
| bvh.fnr.Fenrir 0.36l | 7 | 86% |
| tvv.nano.Polaris 1.2 | 6 | 100% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 995. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 54 | 43% | 95 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 22 | 18% | 35 |
| techdude.forest.FlamingForest 1.1 | 16 | 13% | 33 |
| bvh.fnr.Fenrir 0.36l | 16 | 13% | 20 |
| stelo.IntrinsicVolatility 1.4 | 6 | 5% | 10 |
| asd.Cthulhu 1.3 | 6 | 5% | 7 |
| tvv.nano.Polaris 1.2 | 3 | 2% | 6 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 4 |

## Melee bench: F17

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 79.2 | 87 / 210 | 2.87 | 17.2% | 31581 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 17.2% | 87 |
| oog.melee.Mercutio 1.0 | 2.8 | 12.7% | 36 |
| et.Predator 1.8 | 2.8 | 12.7% | 28 |
| cx.BlestPain 1.41 | 3.7 | 12.1% | 33 |
| ahf.NanoAndrew .4 | 5.2 | 11.1% | 12 |
| nic.Nicator 2.4 | 6.0 | 10.6% | 8 |
| maribo.melee.BMV 0.1 | 6.5 | 9.6% | 7 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.5% | 0 |
| tex.Longbot 0.4 | 8.5 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 80.0 | 18 / 35 | 5314 |
| 2 | 1 | 67.1 | 80.0 | 16 / 35 | 5252 |
| 3 | 1 | 65.4 | 75.6 | 13 / 35 | 5204 |
| 4 | 1 | 67.7 | 81.9 | 14 / 35 | 5738 |
| 5 | 1 | 66.9 | 81.6 | 16 / 35 | 5078 |
| 6 | 1 | 64.8 | 76.2 | 10 / 35 | 4995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 39 | 62% |
| oog.melee.Mercutio 1.0 | 29 | 79% |
| cx.BlestPain 1.41 | 21 | 62% |
| maribo.melee.BMV 0.1 | 11 | 82% |
| nic.Nicator 2.4 | 10 | 90% |
| ahf.NanoAndrew .4 | 9 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 33 | 27% | 55 |
| ahf.NanoAndrew .4 | 25 | 20% | 33 |
| oog.melee.Mercutio 1.0 | 24 | 19% | 47 |
| cx.BlestPain 1.41 | 22 | 18% | 37 |
| nic.Nicator 2.4 | 9 | 7% | 22 |
| maribo.melee.BMV 0.1 | 8 | 6% | 11 |
| tex.Longbot 0.4 | 2 | 2% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 3 |

## Melee bench: F18

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 84.3 | 120 / 210 | 2.41 | 18.2% | 29013 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 18.2% | 120 |
| morbid.MorbidPriest 1.0 | 2.5 | 13.4% | 30 |
| agd.Mooserwirt2 2.7 | 3.0 | 11.8% | 22 |
| uji.DBH 1.1 | 4.3 | 10.8% | 16 |
| ratosh.Nobo 0.21 | 4.7 | 10.4% | 3 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.6% | 5 |
| sigterm.Sigterm 1.0 | 7.2 | 7.8% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.4% | 4 |
| stelo.WangRobot 1.0 | 8.8 | 5.7% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 82.5 | 17 / 35 | 4176 |
| 2 | 1 | 65.2 | 78.1 | 14 / 35 | 4834 |
| 3 | 1 | 69.6 | 89.5 | 24 / 35 | 5269 |
| 4 | 1 | 67.8 | 83.8 | 21 / 35 | 5040 |
| 5 | 1 | 68.4 | 87.9 | 23 / 35 | 4819 |
| 6 | 1 | 67.3 | 83.8 | 21 / 35 | 4875 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 52 | 73% |
| agd.Mooserwirt2 2.7 | 35 | 80% |
| uji.DBH 1.1 | 24 | 67% |
| spinnercat.Robovirus 2.718 | 11 | 82% |
| ratosh.Nobo 0.21 | 11 | 91% |
| sigterm.Sigterm 1.0 | 9 | 78% |
| stelo.WangRobot 1.0 | 7 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 60% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 28 | 30% | 67 |
| uji.DBH 1.1 | 21 | 23% | 32 |
| agd.Mooserwirt2 2.7 | 13 | 14% | 39 |
| ratosh.Nobo 0.21 | 10 | 11% | 21 |
| spinnercat.Robovirus 2.718 | 6 | 6% | 14 |
| sigterm.Sigterm 1.0 | 4 | 4% | 12 |
| stelo.WangRobot 1.0 | 4 | 4% | 9 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 4% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 93.5 | 155 / 210 | 1.58 | 20.7% | 34142 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 20.7% | 155 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.8% | 23 |
| mld.Infinity 2.2 | 2.7 | 13.7% | 21 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.3% | 5 |
| erdnis.Rover 0.3 | 4.8 | 10.3% | 3 |
| patson.PatsonTestBot 1.0 | 6.3 | 9.0% | 2 |
| pac.ABC 2.1 | 7.0 | 7.2% | 1 |
| mbh.Mbh 0.1 | 8.0 | 6.8% | 0 |
| pbg.R2D2 1.0 | 8.7 | 5.4% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 94.6 | 27 / 35 | 5433 |
| 2 | 1 | 72.1 | 93.7 | 27 / 35 | 5886 |
| 3 | 1 | 72.4 | 95.9 | 28 / 35 | 5830 |
| 4 | 1 | 71.0 | 92.4 | 25 / 35 | 5294 |
| 5 | 1 | 71.6 | 94.0 | 25 / 35 | 5711 |
| 6 | 1 | 70.8 | 90.8 | 23 / 35 | 5988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 89 | 88% |
| mld.Infinity 2.2 | 51 | 86% |
| krillr.mini.JointStrike 2.0.0 | 16 | 94% |
| erdnis.Rover 0.3 | 8 | 88% |
| patson.PatsonTestBot 1.0 | 8 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |
| pac.ABC 2.1 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 22 | 40% | 90 |
| mld.Infinity 2.2 | 11 | 20% | 61 |
| krillr.mini.JointStrike 2.0.0 | 10 | 18% | 18 |
| erdnis.Rover 0.3 | 6 | 11% | 16 |
| patson.PatsonTestBot 1.0 | 3 | 5% | 10 |
| mbh.Mbh 0.1 | 2 | 4% | 6 |
| pac.ABC 2.1 | 1 | 2% | 5 |
| pbg.R2D2 1.0 | 0 | 0% | 3 |

## Melee bench: F20

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 85.4 | 108 / 210 | 2.31 | 19.0% | 34219 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 19.0% | 108 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.0% | 54 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.2% | 8 |
| fwb.Nine 1.0.1 | 4.2 | 10.8% | 16 |
| catcat20.Rabbit 0.001 | 4.7 | 10.2% | 14 |
| bayen.nut.Squirrel 1.615 | 6.8 | 7.7% | 6 |
| m3thos.mini.Eva01 0.5.5 | 6.8 | 7.7% | 3 |
| djdjdj.NanoSkunk10 1.0 | 7.2 | 7.5% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.8 | 23 / 35 | 5929 |
| 2 | 1 | 68.9 | 86.3 | 18 / 35 | 5683 |
| 3 | 1 | 66.4 | 79.4 | 12 / 35 | 5339 |
| 4 | 1 | 67.7 | 82.2 | 15 / 35 | 5642 |
| 5 | 1 | 68.9 | 85.1 | 22 / 35 | 5639 |
| 6 | 1 | 69.7 | 88.6 | 18 / 35 | 5987 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 70 | 59% |
| catcat20.Rabbit 0.001 | 25 | 72% |
| fwb.Nine 1.0.1 | 19 | 95% |
| nz.jdc.nano.GridFu 1.0 | 15 | 87% |
| bayen.nut.Squirrel 1.615 | 13 | 77% |
| m3thos.mini.Eva01 0.5.5 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 866. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 52 | 51% | 91 |
| fwb.Nine 1.0.1 | 18 | 18% | 31 |
| catcat20.Rabbit 0.001 | 13 | 13% | 32 |
| nz.jdc.nano.GridFu 1.0 | 7 | 7% | 28 |
| bayen.nut.Squirrel 1.615 | 5 | 5% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 3% | 5 |
| ntc.ControlledChaos 1.1.4 | 2 | 2% | 2 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 5 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 3 |

## Melee bench: F21

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 91.4 | 131 / 210 | 1.78 | 20.2% | 35813 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 20.2% | 131 |
| eem.EvBot v4.6.16 | 2.3 | 15.5% | 56 |
| dummy.mini.Scimitar 1.01 | 2.7 | 14.2% | 13 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 10.9% | 3 |
| eld.Hmm 1.0 | 5.2 | 8.6% | 7 |
| oa.weak.BotherBot 0.1 | 5.8 | 8.2% | 0 |
| fire219.CatBot 1.0 | 7.7 | 6.3% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.0% | 1 |
| PSW.Relentless 0.1 | 8.7 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 92.4 | 24 / 35 | 6013 |
| 2 | 1 | 70.9 | 92.4 | 24 / 35 | 6013 |
| 3 | 1 | 71.2 | 93.3 | 26 / 35 | 5920 |
| 4 | 1 | 69.6 | 89.2 | 17 / 35 | 5826 |
| 5 | 1 | 70.0 | 90.5 | 19 / 35 | 5879 |
| 6 | 1 | 70.7 | 90.5 | 21 / 35 | 6162 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 93 | 63% |
| dummy.mini.Scimitar 1.01 | 48 | 94% |
| cf.RiO.RiOx 4.2.1 | 17 | 94% |
| eld.Hmm 1.0 | 12 | 67% |
| oa.weak.BotherBot 0.1 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 1197. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 44 | 55% | 93 |
| dummy.mini.Scimitar 1.01 | 17 | 21% | 59 |
| cf.RiO.RiOx 4.2.1 | 10 | 13% | 24 |
| eld.Hmm 1.0 | 6 | 8% | 26 |
| oa.weak.BotherBot 0.1 | 2 | 3% | 6 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 82.2 | 76 / 210 | 2.60 | 17.5% | 31670 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 17.5% | 76 |
| kvk.HebusLeTroll 0.35 | 2.5 | 15.3% | 38 |
| pe.SandboxDT 2.71m | 2.5 | 16.3% | 63 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.0% | 24 |
| bigpete.Stewie 1.0 | 5.0 | 10.4% | 6 |
| yk.JahRoslav 1.1 | 6.0 | 7.2% | 2 |
| gg.Squaraus 0.6 | 7.5 | 5.9% | 0 |
| tad.Dalek98 0.98 | 7.5 | 6.3% | 1 |
| pbg.NinjaX 1.2 | 9.0 | 4.9% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 79.0 | 10 / 35 | 5267 |
| 2 | 1 | 68.3 | 83.8 | 17 / 35 | 5450 |
| 3 | 1 | 66.3 | 81.6 | 6 / 35 | 5082 |
| 4 | 1 | 67.9 | 82.5 | 13 / 35 | 5332 |
| 5 | 1 | 68.3 | 85.1 | 18 / 35 | 5282 |
| 6 | 1 | 67.5 | 81.0 | 12 / 35 | 5257 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 50 | 64% |
| pe.SandboxDT 2.71m | 35 | 54% |
| jlm.javaDisturbance 0.59 | 23 | 65% |
| bigpete.Stewie 1.0 | 5 | 80% |
| tad.Dalek98 0.98 | 2 | 100% |
| pbg.NinjaX 1.2 | 2 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kvk.HebusLeTroll 0.35 | 50 | 37% | 75 |
| pe.SandboxDT 2.71m | 42 | 31% | 68 |
| jlm.javaDisturbance 0.59 | 26 | 19% | 40 |
| bigpete.Stewie 1.0 | 7 | 5% | 11 |
| tad.Dalek98 0.98 | 5 | 4% | 7 |
| yk.JahRoslav 1.1 | 4 | 3% | 4 |
| pbg.NinjaX 1.2 | 0 | 0% | 4 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.4 | 119 / 210 | 1.95 | 19.2% | 31318 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 19.2% | 119 |
| pe.SandboxLump 1.52 | 2.0 | 17.0% | 60 |
| cre.Karolos 0.32 | 3.0 | 13.1% | 14 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.9% | 6 |
| stelo.RamTrackSurfer 1.2 | 5.2 | 9.5% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.2 | 8.7% | 1 |
| sample.Walls 1.0 | 7.3 | 8.3% | 4 |
| cw.megas.Blade 0.8 | 7.3 | 8.2% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.5% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 86.3 | 18 / 35 | 5233 |
| 2 | 1 | 70.2 | 89.8 | 20 / 35 | 5050 |
| 3 | 1 | 70.3 | 91.4 | 21 / 35 | 5130 |
| 4 | 1 | 71.4 | 94.3 | 25 / 35 | 5517 |
| 5 | 1 | 67.9 | 82.9 | 16 / 35 | 4995 |
| 6 | 1 | 70.4 | 91.7 | 19 / 35 | 5393 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 88 | 61% |
| cre.Karolos 0.32 | 30 | 83% |
| stelo.AreaTargetingBot 1.1 | 18 | 89% |
| sample.Walls 1.0 | 13 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 86% |
| stelo.RamTrackSurfer 1.2 | 6 | 50% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 55 | 60% | 109 |
| stelo.AreaTargetingBot 1.1 | 13 | 14% | 29 |
| cre.Karolos 0.32 | 11 | 12% | 34 |
| stelo.RamTrackSurfer 1.2 | 5 | 5% | 14 |
| cw.megas.Blade 0.8 | 3 | 3% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 2% | 9 |
| sample.Walls 1.0 | 2 | 2% | 8 |

## Melee bench: F24

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 75.8 | 59 / 210 | 3.18 | 15.2% | 22784 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.3 | 15.2% | 59 |
| rz.GlowBlowMelee 1.4 | 2.0 | 14.4% | 44 |
| florent.XSeries.X2 0.12 | 3.5 | 13.2% | 30 |
| davidalves.Phoenix 0.54 | 4.0 | 12.1% | 35 |
| pedersen.Ugluk 1.1.1 | 4.2 | 11.7% | 21 |
| oog.melee.Corsair 1.0 | 6.2 | 9.4% | 6 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.4% | 14 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.9% | 2 |
| evd.X1 0.01 | 9.5 | 4.2% | 0 |
| as.FrankTheTank 1.3 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 78.4 | 13 / 35 | 4269 |
| 2 | 2 | 62.5 | 74.0 | 7 / 35 | 3742 |
| 3 | 2 | 62.2 | 74.9 | 7 / 35 | 3739 |
| 4 | 1 | 61.7 | 73.3 | 9 / 35 | 3456 |
| 5 | 1 | 64.4 | 79.7 | 12 / 35 | 3917 |
| 6 | 1 | 62.7 | 74.3 | 11 / 35 | 3661 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 29 | 66% |
| florent.XSeries.X2 0.12 | 22 | 59% |
| davidalves.Phoenix 0.54 | 16 | 44% |
| pedersen.Ugluk 1.1.1 | 15 | 47% |
| stelo.SoJNanoMelee 1.1 | 9 | 78% |
| oog.melee.Corsair 1.0 | 3 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 45 | 30% | 69 |
| florent.XSeries.X2 0.12 | 36 | 24% | 50 |
| davidalves.Phoenix 0.54 | 28 | 19% | 34 |
| pedersen.Ugluk 1.1.1 | 21 | 14% | 25 |
| oog.melee.Corsair 1.0 | 6 | 4% | 11 |
| stelo.SoJNanoMelee 1.1 | 6 | 4% | 8 |
| lunchie.Lunchbox 0.93 | 5 | 3% | 7 |
| as.FrankTheTank 1.3 | 2 | 1% | 4 |
| evd.X1 0.01 | 2 | 1% | 2 |

## Melee bench: F25

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 83.4 | 117 / 210 | 2.49 | 18.1% | 27203 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 18.1% | 117 |
| voidious.mini.BrokenSword 2.0.3 | 2.7 | 13.5% | 24 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.7% | 22 |
| jdw.Hurricane 1.4 | 3.5 | 11.5% | 23 |
| ds.Oo 2.2 | 5.5 | 9.0% | 7 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.4% | 13 |
| gjr.Cephalosporin 0.1 | 7.8 | 7.5% | 3 |
| awesomeness.Elite 1.0 | 8.0 | 7.1% | 1 |
| adt.Ar2 1.1 | 8.2 | 6.9% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 82.5 | 21 / 35 | 4509 |
| 2 | 1 | 68.6 | 87.3 | 22 / 35 | 4592 |
| 3 | 1 | 65.2 | 77.8 | 15 / 35 | 4249 |
| 4 | 1 | 69.4 | 91.4 | 22 / 35 | 4726 |
| 5 | 1 | 65.5 | 77.1 | 17 / 35 | 4502 |
| 6 | 1 | 67.5 | 84.4 | 20 / 35 | 4625 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 54 | 83% |
| voidious.micro.BlitzBat 1.05 | 35 | 83% |
| jdw.Hurricane 1.4 | 25 | 84% |
| gre.svman4.Morfeas 1.4.1 | 6 | 33% |
| ds.Oo 2.2 | 6 | 100% |
| adt.Ar2 1.1 | 6 | 83% |
| gjr.Cephalosporin 0.1 | 5 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 21 | 22% | 57 |
| voidious.micro.BlitzBat 1.05 | 18 | 19% | 49 |
| ds.Oo 2.2 | 15 | 16% | 25 |
| jdw.Hurricane 1.4 | 14 | 15% | 29 |
| gre.svman4.Morfeas 1.4.1 | 12 | 13% | 18 |
| awesomeness.Elite 1.0 | 7 | 7% | 9 |
| adt.Ar2 1.1 | 4 | 4% | 10 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 11 |
| amk.ChumbaMini 0.2 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.2 | 105 / 210 | 2.24 | 18.5% | 33588 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.2 | 18.5% | 105 |
| ak.Fermat 2.0 | 1.8 | 15.7% | 61 |
| lrem.Spectre 0.4.4 | 3.0 | 12.4% | 19 |
| shu.nitro.LENIN .T34 | 4.0 | 11.4% | 18 |
| js.PinBall 1.6 | 5.0 | 10.4% | 5 |
| jaybot.adv.bots.JayBot 2.0 | 6.5 | 9.0% | 2 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 9.0% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 7.0% | 0 |
| sample.SpinBot 1.0 | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 88.9 | 19 / 35 | 5520 |
| 2 | 1 | 70.6 | 91.4 | 22 / 35 | 5989 |
| 3 | 1 | 69.1 | 86.7 | 17 / 35 | 5817 |
| 4 | 2 | 67.3 | 81.9 | 13 / 35 | 5410 |
| 5 | 1 | 68.8 | 87.0 | 20 / 35 | 5499 |
| 6 | 1 | 67.0 | 81.3 | 14 / 35 | 5353 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 47 | 53% |
| lrem.Spectre 0.4.4 | 44 | 86% |
| shu.nitro.LENIN .T34 | 32 | 81% |
| js.PinBall 1.6 | 5 | 80% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 50 | 48% | 81 |
| lrem.Spectre 0.4.4 | 16 | 15% | 42 |
| shu.nitro.LENIN .T34 | 15 | 14% | 45 |
| js.PinBall 1.6 | 12 | 11% | 18 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 5% | 8 |
| gh.mini.GrubbmOne 1.0 | 4 | 4% | 7 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 2% | 6 |
| sample.SpinBot 1.0 | 1 | 1% | 3 |

## Melee bench: F27

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 80.6 | 108 / 210 | 2.75 | 17.8% | 30228 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 17.8% | 108 |
| mk.Alpha 0.2.1 | 2.7 | 13.0% | 43 |
| wee.Gem 1.8.4 | 3.5 | 11.4% | 26 |
| EH.Eagle 1.0.6 | 3.8 | 11.2% | 6 |
| sheldor.melee.nano.TestMelee 0.1 | 4.0 | 11.3% | 20 |
| joe.ADinosaur 1.0 | 6.7 | 8.6% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 6.7 | 9.2% | 3 |
| throxbot.ThroxBot 0.1 | 7.7 | 8.2% | 2 |
| caimano.Furia_Ceca 0.22 | 9.3 | 5.3% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 92.4 | 23 / 35 | 4994 |
| 2 | 1 | 67.8 | 84.4 | 22 / 35 | 4756 |
| 3 | 1 | 63.8 | 66.7 | 10 / 35 | 5272 |
| 4 | 1 | 68.3 | 85.4 | 20 / 35 | 5148 |
| 5 | 1 | 67.9 | 76.5 | 19 / 35 | 5795 |
| 6 | 1 | 64.9 | 78.1 | 14 / 35 | 4263 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 45 | 67% |
| wee.Gem 1.8.4 | 25 | 76% |
| EH.Eagle 1.0.6 | 22 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 20 | 75% |
| joe.ADinosaur 1.0 | 8 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 100% |
| throxbot.ThroxBot 0.1 | 6 | 83% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 34 | 33% | 67 |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 18% | 32 |
| wee.Gem 1.8.4 | 15 | 15% | 37 |
| joe.ADinosaur 1.0 | 9 | 9% | 13 |
| throxbot.ThroxBot 0.1 | 8 | 8% | 12 |
| EH.Eagle 1.0.6 | 7 | 7% | 27 |
| techdude.kombat.FlamingKombat 1.5 | 4 | 4% | 13 |
| cs.Grudge 1.0 | 4 | 4% | 4 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 5 |

## Melee bench: F28

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.5 | 129 / 210 | 2.03 | 18.9% | 28513 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 18.9% | 129 |
| kid.test.NightFox .2 | 2.0 | 15.0% | 40 |
| qohnil.blot.BlotBot 3.61 | 3.7 | 11.3% | 17 |
| pfvicm.Sobieski 7.2.3b | 4.2 | 10.9% | 4 |
| uji.Antique 1.0 | 4.2 | 11.3% | 16 |
| ahr.ice.Ice 1.0.2 | 6.2 | 8.2% | 4 |
| amk.ChumbaWumba 0.3 | 7.2 | 7.6% | 1 |
| stelo.PianistNano 1.2 | 8.5 | 5.9% | 0 |
| matt.advanced.Katana 1.0 | 8.7 | 5.8% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 86.0 | 22 / 35 | 4521 |
| 2 | 1 | 68.5 | 87.6 | 18 / 35 | 4772 |
| 3 | 1 | 70.0 | 92.1 | 25 / 35 | 4862 |
| 4 | 1 | 70.0 | 92.1 | 27 / 35 | 4802 |
| 5 | 1 | 68.2 | 87.3 | 20 / 35 | 4914 |
| 6 | 1 | 67.3 | 86.0 | 17 / 35 | 4642 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 81 | 77% |
| uji.Antique 1.0 | 37 | 84% |
| qohnil.blot.BlotBot 3.61 | 16 | 69% |
| pfvicm.Sobieski 7.2.3b | 13 | 92% |
| amk.ChumbaWumba 0.3 | 7 | 86% |
| ahr.ice.Ice 1.0.2 | 3 | 100% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 33 | 40% | 90 |
| uji.Antique 1.0 | 16 | 20% | 51 |
| qohnil.blot.BlotBot 3.61 | 13 | 16% | 25 |
| pfvicm.Sobieski 7.2.3b | 9 | 11% | 15 |
| amk.ChumbaWumba 0.3 | 5 | 6% | 10 |
| ahr.ice.Ice 1.0.2 | 4 | 5% | 8 |
| matt.advanced.Katana 1.0 | 1 | 1% | 4 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |

## Melee bench: F29

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 80.2 | 74 / 210 | 2.78 | 17.3% | 29250 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.5 | 17.3% | 74 |
| zyx.mega.YersiniaPestis 3.1 | 1.8 | 16.0% | 72 |
| deewiant.Anomaly 0.2 | 2.7 | 14.6% | 46 |
| myl.micro.Troodon 1.10 | 4.2 | 11.3% | 5 |
| jok.PheonixM 0.1.2 | 4.8 | 10.6% | 10 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.6% | 0 |
| DBall.Anarchy 0.1 | 7.5 | 6.3% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 6.1% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.8% | 0 |
| jangs.ns51 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.3 | 69.5 | 8 / 35 | 4528 |
| 2 | 1 | 68.8 | 86.0 | 14 / 35 | 5326 |
| 3 | 1 | 68.6 | 85.7 | 15 / 35 | 5037 |
| 4 | 2 | 66.4 | 79.0 | 11 / 35 | 4797 |
| 5 | 1 | 67.2 | 81.6 | 11 / 35 | 4922 |
| 6 | 1 | 66.4 | 79.4 | 15 / 35 | 4640 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 56 | 48% |
| deewiant.Anomaly 0.2 | 38 | 47% |
| myl.micro.Troodon 1.10 | 18 | 94% |
| jok.PheonixM 0.1.2 | 6 | 83% |
| DBall.Anarchy 0.1 | 3 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 54 | 40% | 78 |
| zyx.mega.YersiniaPestis 3.1 | 45 | 33% | 71 |
| jok.PheonixM 0.1.2 | 15 | 11% | 21 |
| myl.micro.Troodon 1.10 | 12 | 9% | 22 |
| fullsail.TimbotNoPrediction 1.0 | 6 | 4% | 7 |
| ph.melee.ArcherME 0.3 | 3 | 2% | 6 |
| jangs.ns51 1.0 | 1 | 1% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 3 |

## Melee bench: F30

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 70.1 | 34 / 210 | 3.70 | 14.1% | 24052 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.2 | 14.0% | 52 |
| hadur117.mini.DeiseWB 0.2 | 2.3 | 14.1% | 34 |
| darkcanuck.B26354 1.06 | 3.2 | 13.7% | 48 |
| stelo.PastFuture 2.3.2 | 3.5 | 12.9% | 28 |
| oog.melee.Capulet 1.2 | 3.8 | 13.1% | 31 |
| intruder.PrairieWolf 2.61 | 6.2 | 8.7% | 8 |
| fowl3628800.LightningBolt 2.6.0 | 7.5 | 7.3% | 8 |
| ntc.Opposite 1.5 | 7.8 | 7.3% | 0 |
| tripphippy.Alice 1.1 | 8.5 | 6.6% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.4 | 69.5 | 2 / 35 | 4182 |
| 2 | 4 | 59.7 | 65.7 | 5 / 35 | 3784 |
| 3 | 1 | 62.9 | 72.7 | 10 / 35 | 3985 |
| 4 | 2 | 62.2 | 69.5 | 7 / 35 | 4264 |
| 5 | 1 | 62.6 | 73.7 | 8 / 35 | 3945 |
| 6 | 3 | 60.1 | 69.2 | 2 / 35 | 3892 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 28 | 32% |
| darkcanuck.B26354 1.06 | 14 | 29% |
| oog.melee.Capulet 1.2 | 11 | 64% |
| stelo.PastFuture 2.3.2 | 10 | 70% |
| intruder.PrairieWolf 2.61 | 4 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 50% |
| ntc.Opposite 1.5 | 2 | 100% |
| tripphippy.Alice 1.1 | 1 | 100% |

Hadur died in 176 of 210 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 45 | 26% | 53 |
| oog.melee.Capulet 1.2 | 37 | 21% | 46 |
| catcat20.Matcha 0.006 | 36 | 20% | 42 |
| stelo.PastFuture 2.3.2 | 33 | 19% | 38 |
| fowl3628800.LightningBolt 2.6.0 | 9 | 5% | 10 |
| ntc.Opposite 1.5 | 6 | 3% | 7 |
| intruder.PrairieWolf 2.61 | 6 | 3% | 7 |
| tripphippy.Alice 1.1 | 3 | 2% | 6 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |

## Melee bench: F31

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 67.7 | 31 / 210 | 3.91 | 13.5% | 21715 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.6% | 119 |
| gh.mini.Griezel 0.2 | 2.3 | 13.4% | 33 |
| hadur117.mini.DeiseWB 0.2 | 2.8 | 13.5% | 31 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.4% | 9 |
| d414.nano.Quantum 1.0.0 | 4.5 | 10.6% | 9 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.5% | 6 |
| fm.mammillarias 1.3 | 7.3 | 6.6% | 1 |
| timmit.nano.TimDog 0.33 | 7.8 | 6.4% | 3 |
| tlp.ThreeLeggedPig 1 | 9.3 | 4.9% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.4 | 66.3 | 2 / 35 | 3503 |
| 2 | 2 | 61.6 | 70.2 | 9 / 35 | 3540 |
| 3 | 2 | 63.6 | 74.3 | 11 / 35 | 4071 |
| 4 | 3 | 58.4 | 61.9 | 4 / 35 | 3553 |
| 5 | 3 | 59.9 | 68.3 | 3 / 35 | 3467 |
| 6 | 4 | 58.7 | 65.1 | 2 / 35 | 3581 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 37 | 27% |
| gh.mini.Griezel 0.2 | 14 | 57% |
| spinnercat.micro.Tyger 0.1 | 7 | 100% |
| d414.nano.Quantum 1.0.0 | 6 | 83% |
| gh.nano.Grofvuil 0.2 | 2 | 50% |

Hadur died in 179 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 76 | 42% | 86 |
| gh.mini.Griezel 0.2 | 41 | 23% | 47 |
| spinnercat.micro.Tyger 0.1 | 17 | 9% | 25 |
| d414.nano.Quantum 1.0.0 | 16 | 9% | 21 |
| gh.nano.Grofvuil 0.2 | 16 | 9% | 18 |
| fm.mammillarias 1.3 | 9 | 5% | 9 |
| timmit.nano.TimDog 0.33 | 3 | 2% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |

## Melee bench: F32

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.4 | 114 / 210 | 2.22 | 18.3% | 30036 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 18.3% | 114 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.9% | 56 |
| apc.botM 3.0 | 3.2 | 11.5% | 16 |
| lxx.ConceptA 0.8 | 4.5 | 10.3% | 8 |
| bayen.UbaMicro 1.4 | 5.0 | 9.5% | 5 |
| vjik.UnViolation 1.1 | 5.7 | 9.4% | 1 |
| panzer.Panzer 0.2 | 7.0 | 7.5% | 1 |
| conscience.Electron 1.3g | 8.5 | 6.5% | 0 |
| yk.JahMicro 1.0 | 8.8 | 6.4% | 6 |
| donjezza.Jezza 1.0 | 9.3 | 5.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 87.0 | 20 / 35 | 4781 |
| 2 | 1 | 65.9 | 82.2 | 14 / 35 | 4969 |
| 3 | 1 | 67.5 | 85.7 | 19 / 35 | 4973 |
| 4 | 1 | 69.1 | 89.8 | 22 / 35 | 5526 |
| 5 | 1 | 69.2 | 91.4 | 22 / 35 | 5186 |
| 6 | 1 | 65.8 | 82.2 | 17 / 35 | 4601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 78 | 60% |
| apc.botM 3.0 | 21 | 76% |
| lxx.ConceptA 0.8 | 15 | 87% |
| vjik.UnViolation 1.1 | 14 | 100% |
| bayen.UbaMicro 1.4 | 11 | 91% |
| panzer.Panzer 0.2 | 7 | 100% |
| donjezza.Jezza 1.0 | 5 | 80% |
| yk.JahMicro 1.0 | 3 | 67% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 47 | 48% | 91 |
| apc.botM 3.0 | 14 | 14% | 33 |
| lxx.ConceptA 0.8 | 12 | 12% | 21 |
| bayen.UbaMicro 1.4 | 10 | 10% | 16 |
| yk.JahMicro 1.0 | 5 | 5% | 7 |
| vjik.UnViolation 1.1 | 3 | 3% | 23 |
| panzer.Panzer 0.2 | 3 | 3% | 6 |
| donjezza.Jezza 1.0 | 2 | 2% | 8 |
| conscience.Electron 1.3g | 2 | 2% | 3 |

## Melee bench: F33

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 79.6 | 91 / 210 | 2.83 | 17.4% | 29709 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.2 | 17.4% | 91 |
| maribo.Quester 0.3 | 1.8 | 15.8% | 49 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.1% | 25 |
| labg.Cataclysm 2.05 | 3.7 | 11.4% | 21 |
| gre.svman4.Leonidas 1.3.2 | 4.8 | 10.4% | 18 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.2 | 8.8% | 4 |
| baal.nano.N 1.42 | 6.7 | 8.4% | 2 |
| zyx.micro.Ant 1.1 | 8.3 | 6.4% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.2 | 4.7% | 1 |
| sanja.First 0.1 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 80.6 | 17 / 35 | 4770 |
| 2 | 1 | 68.9 | 86.0 | 18 / 35 | 5395 |
| 3 | 1 | 67.6 | 81.3 | 17 / 35 | 5149 |
| 4 | 2 | 64.2 | 71.7 | 11 / 35 | 4704 |
| 5 | 1 | 64.8 | 76.5 | 11 / 35 | 4550 |
| 6 | 1 | 67.5 | 81.6 | 17 / 35 | 5141 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 45 | 80% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 59% |
| gre.svman4.Leonidas 1.3.2 | 26 | 88% |
| labg.Cataclysm 2.05 | 11 | 55% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 100% |
| baal.nano.N 1.42 | 2 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 45 | 38% | 84 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 20% | 45 |
| gre.svman4.Leonidas 1.3.2 | 21 | 18% | 34 |
| labg.Cataclysm 2.05 | 10 | 8% | 16 |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 7% | 13 |
| zyx.micro.Ant 1.1 | 5 | 4% | 7 |
| baal.nano.N 1.42 | 2 | 2% | 7 |
| sanja.First 0.1 | 2 | 2% | 3 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 2% | 1 |

## Melee bench: F34

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 83.8 | 77 / 210 | 2.46 | 17.6% | 31125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.3 | 17.6% | 77 |
| kid.Gladiator .7.2 | 2.2 | 16.0% | 41 |
| stelo.Spread 0.9 | 2.5 | 16.1% | 66 |
| jcs.Seth 1.8 | 4.5 | 11.4% | 15 |
| tcf.Reach 3 | 5.0 | 10.3% | 5 |
| cli.Dancer 1.1 | 5.5 | 9.9% | 3 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 1 |
| sample.VelociRobot 1.0 | 9.2 | 3.5% | 1 |
| sample.RamFire 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.5 | 83.5 | 11 / 35 | 5083 |
| 2 | 1 | 68.9 | 86.0 | 14 / 35 | 5480 |
| 3 | 2 | 67.4 | 82.9 | 11 / 35 | 5134 |
| 4 | 1 | 68.1 | 84.4 | 15 / 35 | 4939 |
| 5 | 1 | 68.9 | 86.0 | 15 / 35 | 5570 |
| 6 | 1 | 66.2 | 79.7 | 11 / 35 | 4919 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 56 | 52% |
| kid.Gladiator .7.2 | 48 | 60% |
| jcs.Seth 1.8 | 14 | 86% |
| tcf.Reach 3 | 5 | 60% |
| ratosh.Wesco 1.4 | 2 | 50% |
| cli.Dancer 1.1 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 52 | 39% | 83 |
| kid.Gladiator .7.2 | 48 | 36% | 67 |
| jcs.Seth 1.8 | 10 | 8% | 29 |
| tcf.Reach 3 | 10 | 8% | 15 |
| cli.Dancer 1.1 | 7 | 5% | 8 |
| ratosh.Wesco 1.4 | 5 | 4% | 6 |
| sample.VelociRobot 1.0 | 1 | 1% | 1 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |

## Melee bench: F35

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 79.7 | 38 / 210 | 2.82 | 15.4% | 23126 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.7% | 143 |
| hadur117.mini.DeiseWB 0.2 | 2.0 | 15.4% | 38 |
| gh.mini.Gruwel 0.9 | 3.3 | 12.8% | 19 |
| rz.HawkOnFire 0.1 | 4.2 | 11.5% | 2 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.5 | 11.3% | 8 |
| wit.Chuliath 1.0 | 6.2 | 7.1% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.2 | 6.5% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.7 | 6.3% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.7% | 0 |
| dans.Cinnamon 1.2 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 82.5 | 5 / 35 | 3809 |
| 2 | 2 | 64.6 | 79.0 | 10 / 35 | 3901 |
| 3 | 2 | 62.2 | 74.3 | 5 / 35 | 3710 |
| 4 | 2 | 63.9 | 78.4 | 7 / 35 | 3777 |
| 5 | 2 | 65.0 | 83.5 | 6 / 35 | 3808 |
| 6 | 2 | 64.6 | 80.6 | 5 / 35 | 4121 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 71 | 17% |
| gh.mini.Gruwel 0.9 | 12 | 67% |
| rz.HawkOnFire 0.1 | 12 | 92% |
| dmh.robocode.robot.BlackDeath 9.2 | 6 | 50% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| dans.Cinnamon 1.2 | 1 | 100% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 92 | 53% | 105 |
| gh.mini.Gruwel 0.9 | 39 | 23% | 48 |
| rz.HawkOnFire 0.1 | 20 | 12% | 28 |
| dmh.robocode.robot.BlackDeath 9.2 | 16 | 9% | 20 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 3 |
| wit.Chuliath 1.0 | 1 | 1% | 3 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 2 |

## Melee bench: F36

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 89.8 | 151 / 210 | 1.92 | 20.4% | 34291 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 20.4% | 151 |
| alpha.RainingFire 1.0 | 2.5 | 11.8% | 20 |
| bzdp.Pansy 2.1 | 2.8 | 11.4% | 10 |
| bvh.micro.Freya 0.3 | 4.5 | 10.7% | 12 |
| mz.Cork 0.1 | 5.0 | 10.1% | 9 |
| bvh.mini.Fenrir 0.39 | 5.5 | 9.8% | 2 |
| m3thos.Eva02 0.7.1 | 6.7 | 9.2% | 4 |
| dl.BetterWalls 1.0 | 8.3 | 6.7% | 2 |
| squidM.TentalceMeleeNano 1.1 | 9.0 | 5.7% | 0 |
| sample.MyFirstRobot 1.0 | 9.7 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 90.5 | 23 / 35 | 5819 |
| 2 | 1 | 70.7 | 91.7 | 27 / 35 | 5688 |
| 3 | 1 | 70.3 | 89.8 | 25 / 35 | 5668 |
| 4 | 1 | 71.3 | 90.8 | 27 / 35 | 6416 |
| 5 | 1 | 69.2 | 87.0 | 24 / 35 | 5328 |
| 6 | 1 | 70.0 | 88.9 | 25 / 35 | 5372 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.micro.Freya 0.3 | 43 | 88% |
| bzdp.Pansy 2.1 | 39 | 92% |
| bvh.mini.Fenrir 0.39 | 25 | 96% |
| mz.Cork 0.1 | 21 | 95% |
| alpha.RainingFire 1.0 | 19 | 84% |
| m3thos.Eva02 0.7.1 | 8 | 100% |
| dl.BetterWalls 1.0 | 6 | 83% |
| sample.MyFirstRobot 1.0 | 4 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 16 | 27% | 55 |
| bvh.micro.Freya 0.3 | 12 | 20% | 39 |
| alpha.RainingFire 1.0 | 9 | 15% | 27 |
| bvh.mini.Fenrir 0.39 | 8 | 13% | 16 |
| m3thos.Eva02 0.7.1 | 7 | 12% | 22 |
| mz.Cork 0.1 | 4 | 7% | 28 |
| dl.BetterWalls 1.0 | 2 | 3% | 10 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 5 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 8 |

## Melee bench: F37

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 90.2 | 162 / 210 | 1.89 | 19.7% | 34164 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 19.7% | 162 |
| germ.TheMind .2 | 2.5 | 11.2% | 10 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.0 | 10.3% | 5 |
| EBBU.Sim2 1.02 | 4.7 | 9.4% | 4 |
| stelo.UntouchableNano 1.3 | 5.3 | 9.0% | 10 |
| agrach.Dalek 1.0 | 5.8 | 8.9% | 7 |
| mb.Beast 0.1 | 7.7 | 8.1% | 3 |
| lmk.ACPFinal 0.1 | 7.8 | 7.9% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 7.7% | 0 |
| skm.Ryubot 1.0 | 8.8 | 7.8% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 90.2 | 28 / 35 | 5319 |
| 2 | 1 | 71.7 | 98.7 | 33 / 35 | 6223 |
| 3 | 1 | 68.5 | 88.3 | 25 / 35 | 5914 |
| 4 | 1 | 66.1 | 82.5 | 20 / 35 | 5497 |
| 5 | 1 | 69.6 | 92.1 | 28 / 35 | 5875 |
| 6 | 1 | 68.5 | 89.2 | 28 / 35 | 5336 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 41 | 93% |
| stelo.UntouchableNano 1.3 | 27 | 81% |
| EBBU.Sim2 1.02 | 27 | 100% |
| agrach.Dalek 1.0 | 25 | 96% |
| mb.Beast 0.1 | 14 | 93% |
| skm.Ryubot 1.0 | 14 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 13 | 92% |
| lmk.ACPFinal 0.1 | 8 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 444. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.UntouchableNano 1.3 | 10 | 20% | 28 |
| lmk.ACPFinal 0.1 | 8 | 16% | 23 |
| agrach.Dalek 1.0 | 7 | 14% | 33 |
| com.syncleus.robocode.Dreadnaught 0.1 | 7 | 14% | 27 |
| germ.TheMind .2 | 5 | 10% | 31 |
| mb.Beast 0.1 | 4 | 8% | 23 |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 8% | 9 |
| EBBU.Sim2 1.02 | 3 | 6% | 25 |
| skm.Ryubot 1.0 | 1 | 2% | 8 |

## Melee bench: F38

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 78.5 | 73 / 210 | 2.94 | 16.1% | 26364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.3 | 16.1% | 73 |
| justin.Mallais 14.0 | 1.7 | 15.8% | 80 |
| bvh.mini.Freya 0.55 | 3.2 | 12.3% | 17 |
| bts.mega.Gnarly 1.4 | 4.8 | 11.0% | 15 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.0 | 10.7% | 7 |
| cs.Wren 1.0 | 5.5 | 10.7% | 9 |
| kdf.KoulDestroyer 1.0 | 6.5 | 9.0% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 5.9% | 2 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.1% | 1 |
| bzdp.BoxCar 2.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 81.3 | 12 / 35 | 4543 |
| 2 | 1 | 64.7 | 78.1 | 13 / 35 | 4187 |
| 3 | 2 | 62.9 | 75.2 | 10 / 35 | 4016 |
| 4 | 1 | 68.3 | 85.1 | 17 / 35 | 5367 |
| 5 | 1 | 63.9 | 77.5 | 11 / 35 | 4253 |
| 6 | 2 | 63.1 | 73.7 | 10 / 35 | 3998 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 44 | 55% |
| cs.Wren 1.0 | 19 | 84% |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 88% |
| bvh.mini.Freya 0.55 | 13 | 69% |
| bts.mega.Gnarly 1.4 | 9 | 89% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 33% |
| kdf.KoulDestroyer 1.0 | 2 | 50% |

Hadur died in 138 of 210 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 59 | 43% | 82 |
| bvh.mini.Freya 0.55 | 21 | 15% | 25 |
| bts.mega.Gnarly 1.4 | 16 | 12% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 11% | 28 |
| cs.Wren 1.0 | 13 | 9% | 25 |
| kdf.KoulDestroyer 1.0 | 9 | 7% | 14 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 3% | 6 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

## Melee bench: F39

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 77.9 | 80 / 210 | 2.99 | 16.6% | 29239 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.2 | 16.6% | 80 |
| bvh.fry.Freya 0.82 | 2.0 | 15.0% | 33 |
| az.Ololobot 0.2.4 | 2.8 | 13.1% | 54 |
| catcat20.Lambda 0.024 | 4.0 | 10.8% | 25 |
| gimp.GimpBot 0.1 | 5.7 | 9.0% | 3 |
| winamp32.micro.MicroMacro 1.0 | 6.7 | 8.0% | 3 |
| stelo.SoRobotNanoMelee 1.2 | 6.8 | 8.2% | 11 |
| apollokidd.ApolloKidd 0.9 | 6.8 | 8.3% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.5 | 5.7% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 77.5 | 11 / 35 | 4719 |
| 2 | 1 | 66.4 | 82.5 | 15 / 35 | 4944 |
| 3 | 1 | 64.1 | 74.6 | 12 / 35 | 4995 |
| 4 | 2 | 60.3 | 64.8 | 7 / 35 | 4498 |
| 5 | 1 | 67.9 | 85.7 | 20 / 35 | 5228 |
| 6 | 1 | 66.2 | 82.2 | 15 / 35 | 4855 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 34 | 74% |
| catcat20.Lambda 0.024 | 31 | 71% |
| az.Ololobot 0.2.4 | 29 | 52% |
| stelo.SoRobotNanoMelee 1.2 | 13 | 77% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| winamp32.micro.MicroMacro 1.0 | 2 | 50% |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |
| gimp.GimpBot 0.1 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 46 | 35% | 69 |
| az.Ololobot 0.2.4 | 27 | 21% | 45 |
| catcat20.Lambda 0.024 | 24 | 18% | 39 |
| stelo.SoRobotNanoMelee 1.2 | 15 | 11% | 20 |
| gimp.GimpBot 0.1 | 9 | 7% | 16 |
| apollokidd.ApolloKidd 0.9 | 4 | 3% | 8 |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 2% | 4 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 2 |

## Melee bench: F40

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 82.6 | 110 / 210 | 2.57 | 18.2% | 30451 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 18.2% | 110 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.2% | 44 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 12.0% | 21 |
| mz.AntiGrav 1.0 | 4.3 | 10.7% | 8 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.1% | 8 |
| stelo.Randomness 1.0 | 6.0 | 9.2% | 11 |
| alpha.BlackIce 1.0 | 6.3 | 8.9% | 7 |
| amk.superstrike.SuperStrike 0.3 | 8.2 | 6.3% | 1 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.5% | 0 |
| sample.Corners 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 86.3 | 20 / 35 | 5154 |
| 2 | 1 | 66.9 | 80.6 | 18 / 35 | 4729 |
| 3 | 1 | 68.5 | 82.9 | 19 / 35 | 5444 |
| 4 | 1 | 66.8 | 79.7 | 16 / 35 | 5013 |
| 5 | 1 | 69.0 | 86.3 | 21 / 35 | 5471 |
| 6 | 1 | 66.0 | 79.7 | 16 / 35 | 4640 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 54 | 67% |
| mz.AntiGrav 1.0 | 27 | 93% |
| kano.gamma.KanoGamma 1.8 | 24 | 75% |
| Polkwane.SmashMelee 1.0 | 13 | 85% |
| stelo.Randomness 1.0 | 11 | 91% |
| alpha.BlackIce 1.0 | 8 | 75% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |
| sample.Corners 1.0 | 1 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 36 | 36% | 67 |
| kano.gamma.KanoGamma 1.8 | 19 | 19% | 48 |
| mz.AntiGrav 1.0 | 10 | 10% | 32 |
| stelo.Randomness 1.0 | 10 | 10% | 17 |
| alpha.BlackIce 1.0 | 10 | 10% | 16 |
| Polkwane.SmashMelee 1.0 | 8 | 8% | 15 |
| amk.superstrike.SuperStrike 0.3 | 3 | 3% | 6 |
| testantiswapgun.AntiSwap 1.0 | 3 | 3% | 6 |
| sample.Corners 1.0 | 1 | 1% | 3 |

## Melee bench: F41

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 82.9 | 81 / 210 | 2.54 | 17.1% | 26517 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.2 | 17.1% | 81 |
| eem.EvBotNG v12.8 | 1.8 | 16.2% | 76 |
| ary.Swarm 1.1 | 3.0 | 13.2% | 11 |
| lessonz.robocode.Oz 0.5.0 | 4.2 | 12.5% | 18 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.7% | 15 |
| shrub.Silver v048 | 6.0 | 8.5% | 2 |
| zyx.nano.Ant 1.1 | 7.0 | 7.4% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.7% | 5 |
| stelo.Mirror 1.1 | 8.5 | 5.8% | 2 |
| acogdev.alpha 0.2 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 81.9 | 12 / 35 | 4543 |
| 2 | 1 | 66.5 | 84.1 | 13 / 35 | 4105 |
| 3 | 1 | 67.3 | 84.8 | 14 / 35 | 4583 |
| 4 | 1 | 66.2 | 81.9 | 12 / 35 | 4426 |
| 5 | 1 | 67.4 | 84.4 | 15 / 35 | 4710 |
| 6 | 1 | 65.2 | 80.0 | 15 / 35 | 4150 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 60 | 43% |
| ary.Swarm 1.1 | 33 | 79% |
| lessonz.robocode.Oz 0.5.0 | 19 | 74% |
| simonton.nano.MeleeSeed 1.8 | 12 | 92% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| shrub.Silver v048 | 2 | 50% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 57 | 44% | 87 |
| ary.Swarm 1.1 | 25 | 19% | 46 |
| lessonz.robocode.Oz 0.5.0 | 20 | 16% | 33 |
| simonton.nano.MeleeSeed 1.8 | 14 | 11% | 24 |
| shrub.Silver v048 | 7 | 5% | 10 |
| stelo.Mirror 1.1 | 3 | 2% | 4 |
| zyx.nano.Ant 1.1 | 2 | 2% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |

## Melee bench: F42

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 79.9 | 85 / 210 | 2.80 | 17.1% | 30859 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.2 | 17.1% | 85 |
| wompi.Wallaby 5.1 | 1.8 | 16.0% | 70 |
| maribo.mini.MiniQuester 0.1 | 3.2 | 14.1% | 22 |
| ara.Shera 0.88 | 3.8 | 12.9% | 27 |
| amz.NanoClone 1.41 | 5.2 | 9.4% | 1 |
| maribo.IotaCT 1.1 | 6.2 | 7.4% | 2 |
| dsw.StaticD 1.0 | 6.8 | 6.7% | 1 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.5% | 0 |
| stelo.MirrorMicro 1.0 | 8.7 | 5.7% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 82.2 | 14 / 35 | 5330 |
| 2 | 1 | 66.2 | 79.7 | 16 / 35 | 5059 |
| 3 | 1 | 68.7 | 84.4 | 19 / 35 | 5793 |
| 4 | 1 | 66.0 | 78.4 | 14 / 35 | 5069 |
| 5 | 2 | 65.1 | 75.6 | 12 / 35 | 4914 |
| 6 | 1 | 65.0 | 79.4 | 10 / 35 | 4694 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 40 | 83% |
| ara.Shera 0.88 | 30 | 70% |
| maribo.mini.MiniQuester 0.1 | 27 | 85% |
| dsw.StaticD 1.0 | 6 | 100% |
| maribo.IotaCT 1.1 | 3 | 33% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 39 | 31% | 71 |
| ara.Shera 0.88 | 39 | 31% | 57 |
| maribo.mini.MiniQuester 0.1 | 29 | 23% | 56 |
| amz.NanoClone 1.41 | 8 | 6% | 11 |
| maribo.IotaCT 1.1 | 4 | 3% | 4 |
| dsw.StaticD 1.0 | 3 | 2% | 8 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 2% | 2 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 1 |

## Melee bench: F43

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 73.3 | 23 / 210 | 3.40 | 14.5% | 24068 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.2% | 155 |
| hadur117.mini.DeiseWB 0.2 | 2.2 | 14.5% | 23 |
| brainfade.melee.Dusk 0.44 | 2.8 | 12.8% | 20 |
| dummy.micro.Sparrow 2.5 | 4.7 | 11.0% | 5 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.9% | 3 |
| Krabb.akim2.Akim2 1.1b | 5.5 | 9.7% | 4 |
| jab.DiamondStealer 5 | 7.3 | 7.7% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.5% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.0% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 73.3 | 1 / 35 | 3915 |
| 2 | 2 | 64.7 | 75.6 | 3 / 35 | 4143 |
| 3 | 3 | 62.7 | 70.5 | 3 / 35 | 3834 |
| 4 | 2 | 63.4 | 71.7 | 7 / 35 | 3816 |
| 5 | 2 | 65.0 | 76.2 | 7 / 35 | 4393 |
| 6 | 2 | 63.0 | 72.7 | 2 / 35 | 3967 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 75 | 16% |
| brainfade.melee.Dusk 0.44 | 13 | 62% |
| dummy.micro.Sparrow 2.5 | 1 | 0% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 100% |

Hadur died in 187 of 210 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 110 | 59% | 120 |
| brainfade.melee.Dusk 0.44 | 23 | 12% | 31 |
| dummy.micro.Sparrow 2.5 | 17 | 9% | 19 |
| wcsv.melee.EngineerMelee 0.1 | 16 | 9% | 17 |
| Krabb.akim2.Akim2 1.1b | 12 | 6% | 14 |
| jab.DiamondStealer 5 | 5 | 3% | 5 |
| mz.NanoGod 2.02 | 4 | 2% | 4 |

## Melee bench: F44

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.2 | 103 / 210 | 2.24 | 18.9% | 33259 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 18.9% | 103 |
| stelo.Liblix 0.3.1 | 2.2 | 15.5% | 56 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.7% | 38 |
| wompi.Quokka 1.6 | 4.0 | 10.6% | 7 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 8.9% | 4 |
| jwirde.Gort 2.0 | 5.8 | 8.6% | 2 |
| disan.Chair 2.2.0 | 6.8 | 7.6% | 1 |
| stf.PanzerGeneral 0.1 | 7.7 | 7.2% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.6% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 82.2 | 15 / 35 | 5097 |
| 2 | 1 | 68.9 | 86.0 | 16 / 35 | 5465 |
| 3 | 1 | 69.8 | 88.3 | 18 / 35 | 5951 |
| 4 | 1 | 67.9 | 82.5 | 17 / 35 | 5501 |
| 5 | 1 | 69.2 | 88.6 | 18 / 35 | 5431 |
| 6 | 1 | 70.4 | 89.5 | 19 / 35 | 5814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 71 | 65% |
| tzu.TheArtOfWar 1.2 | 46 | 67% |
| wompi.Quokka 1.6 | 12 | 75% |
| disan.Chair 2.2.0 | 7 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 67% |
| jwirde.Gort 2.0 | 4 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 39 | 36% | 86 |
| tzu.TheArtOfWar 1.2 | 30 | 28% | 56 |
| wompi.Quokka 1.6 | 11 | 10% | 19 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 9% | 16 |
| stf.PanzerGeneral 0.1 | 5 | 5% | 6 |
| jwirde.Gort 2.0 | 4 | 4% | 11 |
| disan.Chair 2.2.0 | 3 | 3% | 6 |
| sample.Crazy 1.0 | 3 | 3% | 5 |
| amk.jointstrike.JointStrike 0.2 | 2 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 85.9 | 91 / 210 | 2.27 | 19.8% | 37696 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWB 0.2 | 1.0 | 19.8% | 91 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 12.8% | 101 |
| jje.BagPuss 1.2 | 2.8 | 12.0% | 5 |
| sul.Lunar 1.1 | 4.3 | 10.0% | 3 |
| myl.nano.Graviton 1.10 | 4.8 | 9.8% | 3 |
| hvilela.HVilela 0.9 | 6.8 | 8.3% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.3% | 6 |
| fm.claire 1.7 | 7.3 | 7.9% | 2 |
| wit.Deep7 2.0 | 8.7 | 6.2% | 1 |
| abud.ThirdRobo 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 83.5 | 11 / 35 | 6142 |
| 2 | 1 | 70.8 | 91.4 | 18 / 35 | 6319 |
| 3 | 1 | 71.3 | 90.8 | 21 / 35 | 6726 |
| 4 | 1 | 70.1 | 87.3 | 15 / 35 | 6604 |
| 5 | 1 | 67.6 | 79.0 | 13 / 35 | 5905 |
| 6 | 1 | 68.6 | 83.2 | 13 / 35 | 6000 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 97 | 34% |
| sul.Lunar 1.1 | 17 | 100% |
| jje.BagPuss 1.2 | 16 | 81% |
| pez.mini.ChironexFleckeri 0.5 | 13 | 77% |
| myl.nano.Graviton 1.10 | 12 | 92% |
| wit.Deep7 2.0 | 6 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 1787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 63 | 53% | 0 |
| jje.BagPuss 1.2 | 17 | 14% | 62 |
| pez.mini.ChironexFleckeri 0.5 | 9 | 8% | 23 |
| myl.nano.Graviton 1.10 | 8 | 7% | 29 |
| sul.Lunar 1.1 | 7 | 6% | 51 |
| fm.claire 1.7 | 6 | 5% | 14 |
| wit.Deep7 2.0 | 5 | 4% | 15 |
| hvilela.HVilela 0.9 | 3 | 3% | 12 |
| abud.ThirdRobo 1.0 | 1 | 1% | 3 |

## Melee bench: F46

hadur117.mini.DeiseWB 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 77.3 | 50 / 210 | 3.04 | 15.6% | 26294 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.3% | 68 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.8% | 77 |
| hadur117.mini.DeiseWB 0.2 | 2.8 | 15.6% | 50 |
| cx.Princess 1.0 | 4.2 | 10.4% | 13 |
| mz.MicroSheep 1.0 | 5.0 | 10.1% | 1 |
| sadoner.killer 0.2 | 5.8 | 8.7% | 1 |
| arthord.NanoSatanMelee Beta | 7.3 | 6.9% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.7 | 6.4% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.9 | 74.3 | 5 / 35 | 4128 |
| 2 | 3 | 63.3 | 75.6 | 6 / 35 | 4097 |
| 3 | 3 | 64.1 | 74.6 | 8 / 35 | 4233 |
| 4 | 3 | 66.0 | 81.0 | 10 / 35 | 4626 |
| 5 | 3 | 65.6 | 79.0 | 11 / 35 | 4632 |
| 6 | 2 | 65.4 | 79.4 | 10 / 35 | 4578 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 38 | 71% |
| rsalesc.melee.Medina 0.4.5 | 23 | 35% |
| cx.Princess 1.0 | 11 | 64% |
| mz.MicroSheep 1.0 | 5 | 100% |
| sadoner.killer 0.2 | 2 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 68 | 43% | 96 |
| rsalesc.melee.Medina 0.4.5 | 56 | 35% | 67 |
| cx.Princess 1.0 | 10 | 6% | 12 |
| mz.MicroSheep 1.0 | 9 | 6% | 14 |
| sadoner.killer 0.2 | 9 | 6% | 11 |
| arthord.NanoSatanMelee Beta | 7 | 4% | 8 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 2 |

