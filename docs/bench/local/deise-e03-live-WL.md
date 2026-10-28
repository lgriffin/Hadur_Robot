# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 77.7 | 20 / 210 | 3.01 | 15.2% | 28844 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 153 |
| hadur117.mini.DeiseWL 0.2 | 2.0 | 15.2% | 20 |
| mz.MicroGodMelee 1 | 3.7 | 11.8% | 11 |
| sgp.JollyNinja 3.53 | 3.8 | 11.4% | 16 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.7 | 11.0% | 6 |
| lorneswork.Predator 1.0 | 5.8 | 9.9% | 4 |
| adt.Ar2 1.0 | 7.0 | 7.7% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.0% | 0 |
| skm.butterfly 1.0 | 8.7 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 76.5 | 2 / 35 | 4241 |
| 2 | 2 | 64.7 | 81.6 | 3 / 35 | 4769 |
| 3 | 2 | 64.6 | 79.7 | 3 / 35 | 4853 |
| 4 | 2 | 64.1 | 74.9 | 6 / 35 | 5109 |
| 5 | 2 | 63.7 | 76.5 | 3 / 35 | 4894 |
| 6 | 2 | 64.4 | 76.8 | 3 / 35 | 4978 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 71 | 8% |
| mz.MicroGodMelee 1 | 10 | 40% |
| sgp.JollyNinja 3.53 | 9 | 67% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 25% |
| lorneswork.Predator 1.0 | 3 | 33% |
| adt.Ar2 1.0 | 2 | 100% |

Hadur died in 190 of 210 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 113 | 59% | 122 |
| mz.MicroGodMelee 1 | 36 | 19% | 40 |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 7% | 15 |
| sgp.JollyNinja 3.53 | 13 | 7% | 17 |
| lorneswork.Predator 1.0 | 9 | 5% | 10 |
| adt.Ar2 1.0 | 5 | 3% | 6 |

## Melee bench: F02

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 70.6 | 31 / 210 | 3.64 | 15.2% | 30237 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWL 0.2 | 1.5 | 15.2% | 31 |
| pulsar.PulsarMax 0.8.9 | 1.8 | 15.1% | 73 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.9% | 43 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.3 | 10.9% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.6% | 5 |
| Noran.BitchingElk 0.054 | 6.8 | 8.5% | 17 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 8.2% | 5 |
| sch.Simone 0.3d | 7.5 | 7.7% | 9 |
| stelo.PatternRobot 1.0 | 8.8 | 6.3% | 5 |
| fullsail.SweetTea 1.1 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 67.9 | 8 / 35 | 4906 |
| 2 | 1 | 64.5 | 73.7 | 4 / 35 | 5734 |
| 3 | 1 | 62.0 | 67.9 | 5 / 35 | 5058 |
| 4 | 2 | 60.7 | 67.3 | 3 / 35 | 4552 |
| 5 | 2 | 63.7 | 72.1 | 6 / 35 | 5090 |
| 6 | 2 | 64.2 | 74.9 | 5 / 35 | 4897 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 29 | 28% |
| pulsar.PulsarMax 0.8.9 | 24 | 17% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 88% |
| Noran.BitchingElk 0.054 | 6 | 67% |
| com.cohesiva.robocode.ManOwaR 1.0 | 5 | 40% |
| stelo.PatternRobot 1.0 | 3 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 67% |
| sch.Simone 0.3d | 2 | 50% |

Hadur died in 179 of 210 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 55 | 31% | 61 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 53 | 30% | 64 |
| com.cohesiva.robocode.ManOwaR 1.0 | 25 | 14% | 31 |
| sch.Simone 0.3d | 12 | 7% | 13 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 6% | 13 |
| fnc.bandit.Bandit 5.2.0 | 8 | 4% | 10 |
| Noran.BitchingElk 0.054 | 7 | 4% | 8 |
| stelo.PatternRobot 1.0 | 7 | 4% | 7 |
| fullsail.SweetTea 1.1 | 1 | 1% | 3 |

## Melee bench: F03

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.9 | 102 / 210 | 2.09 | 18.7% | 36737 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWL 0.2 | 1.0 | 18.7% | 102 |
| radnor.DoctorBob 1.42 | 2.0 | 15.5% | 58 |
| vuen.Cake 2.51 | 3.3 | 12.5% | 32 |
| kawigi.nano.Lib 1.0 | 3.7 | 12.4% | 11 |
| urdos.URDOS 1.3 | 5.3 | 8.8% | 1 |
| adt.Ar1 2.1 | 6.5 | 7.8% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 7.2% | 2 |
| oa.weak.FlyMk1 0.1 | 7.2 | 7.0% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.5% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 93.3 | 23 / 35 | 5829 |
| 2 | 1 | 66.0 | 81.0 | 14 / 35 | 5556 |
| 3 | 1 | 68.4 | 86.7 | 15 / 35 | 6382 |
| 4 | 1 | 68.1 | 87.6 | 16 / 35 | 6000 |
| 5 | 1 | 68.3 | 87.9 | 13 / 35 | 6363 |
| 6 | 1 | 70.0 | 90.8 | 21 / 35 | 6607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 50 | 58% |
| vuen.Cake 2.51 | 45 | 49% |
| kawigi.nano.Lib 1.0 | 44 | 93% |
| ghent.ArthurPanzergon 1.0.0 | 6 | 83% |
| oa.weak.FlyMk1 0.1 | 5 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 65 | 60% | 97 |
| vuen.Cake 2.51 | 28 | 26% | 54 |
| kawigi.nano.Lib 1.0 | 6 | 6% | 29 |
| urdos.URDOS 1.3 | 4 | 4% | 8 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 2% | 9 |
| oa.weak.FlyMk1 0.1 | 1 | 1% | 9 |
| adt.Ar1 2.1 | 1 | 1% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 1% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 71.1 | 7 / 210 | 3.60 | 14.6% | 30912 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.3% | 184 |
| hadur117.mini.DeiseWL 0.2 | 2.3 | 14.6% | 7 |
| apc.LeeroyJenkins2 1.0 | 2.7 | 14.0% | 12 |
| TNT.TNT 0.99.1 | 4.2 | 11.4% | 5 |
| josago.Jorgito 0.16 | 4.8 | 9.9% | 1 |
| css.Delitioner 0.11 | 6.3 | 7.1% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 6.3% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.4% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 70.8 | 2 / 35 | 5223 |
| 2 | 2 | 63.4 | 70.2 | 1 / 35 | 5303 |
| 3 | 2 | 62.6 | 68.6 | 0 / 35 | 5063 |
| 4 | 3 | 63.3 | 70.8 | 0 / 35 | 5126 |
| 5 | 2 | 65.1 | 75.9 | 2 / 35 | 5404 |
| 6 | 3 | 62.9 | 70.2 | 2 / 35 | 4793 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 47 | 6% |
| apc.LeeroyJenkins2 1.0 | 3 | 33% |
| josago.Jorgito 0.16 | 2 | 100% |
| tj.zombie1n 1.0.1 | 1 | 100% |

Hadur died in 203 of 210 rounds, at a mean tick of 819. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 113 | 56% | 117 |
| apc.LeeroyJenkins2 1.0 | 32 | 16% | 33 |
| TNT.TNT 0.99.1 | 25 | 12% | 25 |
| josago.Jorgito 0.16 | 21 | 10% | 23 |
| css.Delitioner 0.11 | 5 | 2% | 5 |
| tj.zombie1n 1.0.1 | 4 | 2% | 4 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 1 |

## Melee bench: F05

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.1 | 58.3 | 3 / 210 | 4.76 | 11.1% | 19454 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 19.1% | 125 |
| justin.DemonicRage 3.4 | 1.8 | 17.5% | 62 |
| wompi.Numbat 2.1 | 3.0 | 12.9% | 10 |
| hadur117.mini.DeiseWL 0.2 | 4.0 | 11.1% | 3 |
| axeBots.HataMoto 3.09 | 5.5 | 9.1% | 7 |
| ms.Ares 0.19 | 5.5 | 9.7% | 2 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.4% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.2 | 5.3% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.5% | 1 |
| GarmBox.Oranges 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.4 | 56.2 | 0 / 35 | 3247 |
| 2 | 4 | 56.6 | 59.4 | 1 / 35 | 3164 |
| 3 | 4 | 57.6 | 61.3 | 2 / 35 | 3440 |
| 4 | 4 | 55.8 | 58.4 | 0 / 35 | 3176 |
| 5 | 4 | 56.3 | 59.7 | 0 / 35 | 3188 |
| 6 | 4 | 54.9 | 54.6 | 0 / 35 | 3239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 9 | 11% |
| cb.fire.Firestarter 2.0f | 7 | 0% |
| wompi.Numbat 2.1 | 2 | 100% |

Hadur died in 207 of 210 rounds, at a mean tick of 535. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 71 | 34% | 72 |
| cb.fire.Firestarter 2.0f | 69 | 33% | 69 |
| wompi.Numbat 2.1 | 30 | 14% | 32 |
| ms.Ares 0.19 | 16 | 8% | 16 |
| axeBots.HataMoto 3.09 | 10 | 5% | 10 |
| supersample.SuperBoxBot 1.0 | 4 | 2% | 4 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 1% | 3 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 70.4 | 30 / 210 | 3.66 | 14.5% | 26686 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 1.8 | 15.1% | 81 |
| jekl.StoneGhost 0.7 | 2.0 | 15.1% | 51 |
| hadur117.mini.DeiseWL 0.2 | 2.3 | 14.5% | 30 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 11.6% | 20 |
| mld.Wisdom 1.0 | 5.0 | 10.9% | 9 |
| gg.Wolverine 2.0 | 5.7 | 9.9% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.1% | 7 |
| spinnercat.Omen 1.0 | 7.8 | 6.7% | 1 |
| DBall.NUKE 0.1 | 8.8 | 6.1% | 0 |
| sample.Fire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.7 | 67.3 | 6 / 35 | 4671 |
| 2 | 2 | 63.7 | 74.9 | 6 / 35 | 4685 |
| 3 | 3 | 60.7 | 69.5 | 3 / 35 | 3999 |
| 4 | 3 | 61.4 | 68.9 | 5 / 35 | 4414 |
| 5 | 2 | 64.6 | 75.9 | 6 / 35 | 5005 |
| 6 | 3 | 60.3 | 66.0 | 4 / 35 | 3912 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 25 | 52% |
| origin.SleepSiphon 1.7b | 13 | 0% |
| pe.minimelee.SandboxMiniMelee 1.1 | 11 | 82% |
| mld.Wisdom 1.0 | 8 | 50% |
| gg.Wolverine 2.0 | 5 | 20% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 50% |
| DBall.NUKE 0.1 | 1 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 71 | 39% | 74 |
| jekl.StoneGhost 0.7 | 46 | 25% | 50 |
| pe.minimelee.SandboxMiniMelee 1.1 | 21 | 12% | 33 |
| gg.Wolverine 2.0 | 16 | 9% | 18 |
| mld.Wisdom 1.0 | 15 | 8% | 22 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 3% | 5 |
| spinnercat.Omen 1.0 | 4 | 2% | 5 |
| DBall.NUKE 0.1 | 2 | 1% | 2 |
| sample.Fire 1.0 | 1 | 1% | 1 |

## Melee bench: F07

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 84.9 | 63 / 210 | 2.36 | 18.2% | 36584 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWL 0.2 | 1.3 | 18.2% | 63 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 18.0% | 63 |
| rtk.Tachikoma 1.0 | 2.5 | 17.3% | 64 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.3% | 6 |
| franzor.Lizt 1.3.1 | 4.8 | 10.7% | 14 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.5% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| sample.Target 1.0 | 9.2 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 82.9 | 10 / 35 | 5911 |
| 2 | 1 | 70.2 | 88.6 | 14 / 35 | 6201 |
| 3 | 2 | 69.3 | 85.1 | 10 / 35 | 6059 |
| 4 | 2 | 67.6 | 80.6 | 8 / 35 | 5611 |
| 5 | 1 | 70.4 | 87.9 | 9 / 35 | 6557 |
| 6 | 1 | 69.6 | 84.1 | 12 / 35 | 6245 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 68 | 35% |
| rsalesc.melee.Monk 0.3.6c | 30 | 13% |
| oog.melee.CapuletDroid 1.1 | 25 | 96% |
| franzor.Lizt 1.3.1 | 11 | 82% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 69 | 47% | 98 |
| rsalesc.melee.Monk 0.3.6c | 61 | 41% | 67 |
| franzor.Lizt 1.3.1 | 7 | 5% | 6 |
| oog.melee.CapuletDroid 1.1 | 6 | 4% | 34 |
| exauge.GateKeeper 1.1.121g | 3 | 2% | 3 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 79.8 | 51 / 210 | 2.82 | 16.8% | 30754 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWL 0.2 | 1.0 | 16.8% | 51 |
| tm.Yuugao 1.0 | 2.5 | 13.6% | 58 |
| shrub.Vapour v159 | 3.0 | 12.7% | 44 |
| com.spp.robocode.MostlyHarmless 010 | 3.8 | 11.0% | 27 |
| Krabb.sliNk.Garm 0.9u | 4.7 | 10.3% | 20 |
| m3thos.Eva00 1.1 | 6.2 | 8.5% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 7.3 | 7.7% | 4 |
| SHAM.WOW 1.4 | 8.7 | 6.7% | 2 |
| qualidafial.MajorDick 1.0.1 | 8.8 | 6.5% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 78.7 | 9 / 35 | 5187 |
| 2 | 1 | 62.5 | 74.3 | 6 / 35 | 4569 |
| 3 | 1 | 65.2 | 78.7 | 7 / 35 | 5397 |
| 4 | 1 | 65.8 | 81.6 | 7 / 35 | 5295 |
| 5 | 1 | 65.7 | 81.0 | 9 / 35 | 5264 |
| 6 | 1 | 66.6 | 84.4 | 13 / 35 | 5042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 37 | 22% |
| com.spp.robocode.MostlyHarmless 010 | 28 | 46% |
| shrub.Vapour v159 | 28 | 25% |
| Krabb.sliNk.Garm 0.9u | 13 | 62% |
| m3thos.Eva00 1.1 | 7 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 50% |
| SHAM.WOW 1.4 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 57 | 36% | 72 |
| com.spp.robocode.MostlyHarmless 010 | 35 | 22% | 46 |
| shrub.Vapour v159 | 34 | 21% | 45 |
| Krabb.sliNk.Garm 0.9u | 20 | 13% | 26 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 3% | 8 |
| SHAM.WOW 1.4 | 4 | 3% | 4 |
| m3thos.Eva00 1.1 | 2 | 1% | 4 |
| qualidafial.MajorDick 1.0.1 | 2 | 1% | 2 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 3 |

## Melee bench: F09

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 60.6 | 7 / 210 | 4.54 | 12.3% | 22828 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.5% | 122 |
| kc.micro.Figment 1.0 | 2.0 | 15.6% | 51 |
| hadur117.mini.DeiseWL 0.2 | 3.0 | 12.3% | 7 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.7% | 17 |
| mc2.enemy.Original 0.9 | 5.2 | 9.7% | 9 |
| yagami.Tidus 0.11 | 5.2 | 10.6% | 2 |
| dft.Calliope 5.6 | 7.2 | 7.3% | 2 |
| step.nanoPri 1.0 | 8.0 | 6.0% | 0 |
| rdm.Dueler 0.4x | 9.0 | 4.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 66.0 | 2 / 35 | 4106 |
| 2 | 3 | 58.7 | 62.2 | 2 / 35 | 3745 |
| 3 | 3 | 56.9 | 56.8 | 1 / 35 | 3781 |
| 4 | 3 | 59.2 | 62.2 | 2 / 35 | 3951 |
| 5 | 3 | 57.5 | 60.3 | 0 / 35 | 3598 |
| 6 | 3 | 55.8 | 56.2 | 0 / 35 | 3647 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 16 | 0% |
| kc.micro.Figment 1.0 | 11 | 18% |
| mc2.enemy.Original 0.9 | 5 | 40% |
| yagami.Tidus 0.11 | 2 | 100% |
| pedersen.Grishnakh 1.0 | 2 | 50% |

Hadur died in 204 of 210 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 75 | 37% | 75 |
| kc.micro.Figment 1.0 | 63 | 31% | 68 |
| pedersen.Grishnakh 1.0 | 21 | 10% | 21 |
| mc2.enemy.Original 0.9 | 19 | 9% | 21 |
| yagami.Tidus 0.11 | 17 | 8% | 16 |
| step.nanoPri 1.0 | 3 | 1% | 3 |
| dft.Calliope 5.6 | 3 | 1% | 3 |
| robar.nano.Assertive_Melee 0.2 | 2 | 1% | 2 |
| rdm.Dueler 0.4x | 1 | 0% | 1 |

## Melee bench: F10

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 81.6 | 55 / 210 | 2.65 | 16.9% | 33215 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWL 0.2 | 1.5 | 16.9% | 55 |
| DTF.Kludgy 1.2b | 1.7 | 15.6% | 70 |
| ne.Chimera 1.2 | 3.2 | 13.6% | 23 |
| ejb.Polaris 1.0.1 | 4.2 | 12.5% | 37 |
| vStar.RAFzilla 2.15 | 5.0 | 10.8% | 11 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.3% | 14 |
| sam.Samspin 1.0 | 7.7 | 5.6% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.8 | 5.5% | 0 |
| kurios.DOSexe .9b | 8.5 | 5.2% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 83.8 | 13 / 35 | 5794 |
| 2 | 2 | 65.8 | 78.4 | 7 / 35 | 5731 |
| 3 | 2 | 66.6 | 84.1 | 7 / 35 | 5523 |
| 4 | 2 | 63.8 | 77.1 | 6 / 35 | 4889 |
| 5 | 1 | 66.1 | 81.0 | 8 / 35 | 5766 |
| 6 | 1 | 67.4 | 85.4 | 14 / 35 | 5512 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 45 | 24% |
| ne.Chimera 1.2 | 26 | 65% |
| ejb.Polaris 1.0.1 | 20 | 25% |
| vStar.RAFzilla 2.15 | 15 | 80% |
| tvv.micro.Antares 1.1.1 | 10 | 50% |
| sam.Samspin 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |
| donjezza.Muncho 1.0 | 1 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 58 | 37% | 69 |
| ne.Chimera 1.2 | 34 | 22% | 53 |
| ejb.Polaris 1.0.1 | 32 | 21% | 38 |
| tvv.micro.Antares 1.1.1 | 17 | 11% | 22 |
| vStar.RAFzilla 2.15 | 9 | 6% | 21 |
| kurios.DOSexe .9b | 3 | 2% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 1% | 2 |
| donjezza.Muncho 1.0 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 71.4 | 36 / 210 | 3.58 | 14.8% | 26704 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 18.0% | 107 |
| hadur117.mini.DeiseWL 0.2 | 2.0 | 14.8% | 36 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.6% | 29 |
| djc.DynaBot 0.1.1 | 4.2 | 11.3% | 12 |
| uji.YellohFellah 1.0 | 6.0 | 8.5% | 7 |
| br2.MobyDickBot 1.6 | 6.2 | 8.5% | 7 |
| rdt199.Warlord 0.73 | 6.5 | 8.6% | 11 |
| KiraNL.Chupacabra 0.4 | 7.2 | 7.4% | 1 |
| stelo.MirrorNano 1.3 | 9.5 | 5.1% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 70.8 | 0 / 35 | 4666 |
| 2 | 2 | 60.5 | 69.2 | 6 / 35 | 3800 |
| 3 | 2 | 64.3 | 73.7 | 8 / 35 | 4987 |
| 4 | 2 | 59.9 | 67.6 | 8 / 35 | 3767 |
| 5 | 2 | 63.4 | 74.0 | 7 / 35 | 4479 |
| 6 | 2 | 64.2 | 73.0 | 7 / 35 | 5005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 31 | 23% |
| cx.mini.Nimrod 0.55 | 15 | 53% |
| uji.YellohFellah 1.0 | 8 | 100% |
| djc.DynaBot 0.1.1 | 6 | 67% |
| br2.MobyDickBot 1.6 | 6 | 67% |
| KiraNL.Chupacabra 0.4 | 5 | 80% |
| rdt199.Warlord 0.73 | 1 | 0% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 174 of 210 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 81 | 47% | 90 |
| cx.mini.Nimrod 0.55 | 46 | 26% | 53 |
| djc.DynaBot 0.1.1 | 17 | 10% | 24 |
| rdt199.Warlord 0.73 | 15 | 9% | 18 |
| uji.YellohFellah 1.0 | 4 | 2% | 9 |
| KiraNL.Chupacabra 0.4 | 4 | 2% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 4 |
| br2.MobyDickBot 1.6 | 2 | 1% | 3 |
| stelo.MirrorNano 1.3 | 2 | 1% | 3 |

## Melee bench: F12

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 71.5 | 43 / 210 | 3.56 | 14.6% | 24102 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.5 | 14.8% | 59 |
| hadur117.mini.DeiseWL 0.2 | 2.0 | 14.6% | 43 |
| darkcanuck.Leon 1.01 | 2.8 | 13.7% | 47 |
| nat.PallasHawk 1.0 | 3.7 | 13.5% | 40 |
| brainfade.melee.Genghis 0.36 | 5.2 | 10.1% | 14 |
| jrm.Test0 1.0 | 6.0 | 8.7% | 4 |
| jp.Perpy 16.0 | 7.3 | 7.0% | 0 |
| cs.sheldor.Talon 1.1 | 7.8 | 6.7% | 0 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.8% | 4 |
| stuff.Vlad 0.1 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 73.7 | 9 / 35 | 4012 |
| 2 | 2 | 62.5 | 74.6 | 4 / 35 | 4033 |
| 3 | 2 | 60.8 | 69.5 | 3 / 35 | 4109 |
| 4 | 1 | 64.2 | 78.7 | 10 / 35 | 4051 |
| 5 | 3 | 59.1 | 62.5 | 8 / 35 | 3757 |
| 6 | 2 | 62.2 | 70.2 | 9 / 35 | 4140 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 30 | 50% |
| darkcanuck.Leon 1.01 | 25 | 16% |
| nat.PallasHawk 1.0 | 24 | 63% |
| brainfade.melee.Genghis 0.36 | 7 | 57% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jaybot.bots.Oddball 4.0 | 1 | 100% |
| jrm.Test0 1.0 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 168 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.Leon 1.01 | 47 | 28% | 54 |
| bts.wiki.RipCurl 0.9b | 39 | 23% | 54 |
| nat.PallasHawk 1.0 | 34 | 20% | 50 |
| brainfade.melee.Genghis 0.36 | 17 | 10% | 18 |
| jrm.Test0 1.0 | 15 | 9% | 17 |
| cs.sheldor.Talon 1.1 | 7 | 4% | 7 |
| jaybot.bots.Oddball 4.0 | 4 | 2% | 4 |
| jp.Perpy 16.0 | 3 | 2% | 5 |
| stuff.Vlad 0.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 64.8 | 5 / 210 | 4.17 | 12.3% | 22650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.2 | 18.2% | 124 |
| ags.Glacier 0.2.11 | 1.8 | 17.3% | 52 |
| shinh.Entangled 0.3 | 3.8 | 12.1% | 19 |
| gh.micro.Gruweltje 0.7 | 4.0 | 12.1% | 10 |
| hadur117.mini.DeiseWL 0.2 | 4.2 | 12.3% | 5 |
| apc.Colossus2 0.17 | 6.2 | 7.8% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.7% | 0 |
| ayk.WallHugger 1.0 | 8.0 | 5.3% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.3 | 66.0 | 1 / 35 | 4317 |
| 2 | 5 | 56.4 | 60.6 | 0 / 35 | 3247 |
| 3 | 4 | 58.0 | 63.2 | 1 / 35 | 3505 |
| 4 | 5 | 58.3 | 63.8 | 1 / 35 | 3576 |
| 5 | 3 | 60.0 | 66.3 | 2 / 35 | 4204 |
| 6 | 4 | 59.8 | 68.6 | 0 / 35 | 3801 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 15 | 20% |
| shinh.Entangled 0.3 | 6 | 33% |
| mn.Combat 3.25.0 | 5 | 0% |
| gh.micro.Gruweltje 0.7 | 1 | 0% |

Hadur died in 205 of 210 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 71 | 35% | 73 |
| mn.Combat 3.25.0 | 65 | 32% | 66 |
| gh.micro.Gruweltje 0.7 | 27 | 13% | 28 |
| shinh.Entangled 0.3 | 22 | 11% | 24 |
| stelo.Wang 1.0 | 9 | 4% | 9 |
| apc.Colossus2 0.17 | 4 | 2% | 4 |
| ayk.WallHugger 1.0 | 4 | 2% | 3 |
| maribo.FollowFire 1 | 3 | 1% | 3 |

## Melee bench: F14

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 87.1 | 97 / 210 | 2.16 | 18.8% | 34949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWL 0.2 | 1.0 | 18.8% | 97 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.2% | 48 |
| catcat20.shape.Theta 0.018 | 3.0 | 13.1% | 46 |
| sanyi.mikrobi.Roberto 1.0 | 4.8 | 9.6% | 6 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 9.3% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.4% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 6.3 | 9.2% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.6% | 6 |
| pa.Improved 1.0 | 8.8 | 5.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 88.9 | 14 / 35 | 6002 |
| 2 | 1 | 68.7 | 87.0 | 17 / 35 | 5927 |
| 3 | 1 | 67.9 | 85.1 | 13 / 35 | 5549 |
| 4 | 1 | 68.8 | 86.7 | 16 / 35 | 5790 |
| 5 | 1 | 68.4 | 86.3 | 18 / 35 | 5465 |
| 6 | 1 | 69.9 | 88.9 | 19 / 35 | 6216 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 59 | 53% |
| catcat20.shape.Theta 0.018 | 49 | 55% |
| sanyi.mikrobi.Roberto 1.0 | 15 | 87% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 79% |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 89% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 43 | 38% | 71 |
| catcat20.shape.Theta 0.018 | 42 | 37% | 69 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 7% | 11 |
| sanyi.mikrobi.Roberto 1.0 | 7 | 6% | 26 |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 4% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 4% | 14 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 3% | 7 |
| pa.Improved 1.0 | 1 | 1% | 3 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

## Melee bench: F15

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 77.3 | 78 / 210 | 3.04 | 17.2% | 33286 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWL 0.2 | 1.0 | 17.2% | 78 |
| emp.Yngwie 1.11 | 2.3 | 13.9% | 70 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.4% | 15 |
| mld.DustBunny 3.8 | 4.2 | 12.0% | 10 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.9% | 13 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.9% | 20 |
| lambdaxy.TBot 0.1 | 7.2 | 6.9% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.3% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.6% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 79.4 | 16 / 35 | 5548 |
| 2 | 1 | 63.9 | 70.2 | 10 / 35 | 5174 |
| 3 | 1 | 67.8 | 80.3 | 14 / 35 | 5813 |
| 4 | 1 | 64.4 | 71.7 | 11 / 35 | 5343 |
| 5 | 1 | 65.6 | 76.8 | 12 / 35 | 5445 |
| 6 | 1 | 69.1 | 85.4 | 15 / 35 | 5963 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 38 | 34% |
| kawigi.micro.Shiz 1.1 | 23 | 100% |
| mld.DustBunny 3.8 | 21 | 90% |
| kawigi.robot.Girl 1.2 | 12 | 83% |
| cb.nano.Insomnia 1.0 | 11 | 91% |
| divineomega.TrialBot 0.003 | 5 | 60% |

Hadur died in 132 of 210 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 59 | 45% | 81 |
| kawigi.micro.Shiz 1.1 | 15 | 11% | 28 |
| mld.DustBunny 3.8 | 14 | 11% | 30 |
| kawigi.robot.Girl 1.2 | 14 | 11% | 23 |
| cb.nano.Insomnia 1.0 | 13 | 10% | 17 |
| divineomega.TrialBot 0.003 | 10 | 8% | 20 |
| Grystrion.TrackerWO 1.0 | 4 | 3% | 6 |
| lambdaxy.TBot 0.1 | 3 | 2% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 70.3 | 27 / 210 | 3.67 | 15.2% | 31175 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.2 | 17.1% | 85 |
| hadur117.mini.DeiseWL 0.2 | 2.0 | 15.2% | 27 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.7% | 8 |
| techdude.forest.FlamingForest 1.1 | 3.8 | 12.2% | 63 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.5% | 12 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 9.1% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.8% | 5 |
| asd.Cthulhu 1.3 | 8.5 | 5.3% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.2% | 7 |
| repositorio.NanoStep 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 69.5 | 7 / 35 | 5253 |
| 2 | 3 | 59.7 | 62.2 | 1 / 35 | 4769 |
| 3 | 1 | 63.2 | 70.5 | 6 / 35 | 5081 |
| 4 | 2 | 61.8 | 66.7 | 5 / 35 | 4967 |
| 5 | 2 | 65.3 | 77.5 | 4 / 35 | 5507 |
| 6 | 2 | 65.5 | 75.6 | 4 / 35 | 5598 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 44 | 14% |
| techdude.forest.FlamingForest 1.1 | 14 | 36% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 7 | 71% |
| tvv.nano.Polaris 1.2 | 5 | 80% |
| stelo.IntrinsicVolatility 1.4 | 3 | 33% |
| bvh.fnr.Fenrir 0.36l | 3 | 100% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |

Hadur died in 183 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 86 | 47% | 95 |
| techdude.forest.FlamingForest 1.1 | 40 | 22% | 46 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 11% | 21 |
| bvh.fnr.Fenrir 0.36l | 10 | 5% | 10 |
| stelo.IntrinsicVolatility 1.4 | 9 | 5% | 12 |
| divineomega.DivineBot 1.9.4.5 | 9 | 5% | 12 |
| tvv.nano.Polaris 1.2 | 6 | 3% | 11 |
| asd.Cthulhu 1.3 | 3 | 2% | 3 |

## Melee bench: F17

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 63.9 | 31 / 210 | 4.25 | 13.7% | 29004 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWL 0.2 | 2.2 | 13.7% | 31 |
| et.Predator 1.8 | 2.3 | 13.3% | 34 |
| oog.melee.Mercutio 1.0 | 3.0 | 13.0% | 50 |
| cx.BlestPain 1.41 | 3.0 | 13.0% | 50 |
| nic.Nicator 2.4 | 4.7 | 11.6% | 17 |
| ahf.NanoAndrew .4 | 6.0 | 10.9% | 23 |
| maribo.melee.BMV 0.1 | 6.8 | 9.8% | 4 |
| tex.Longbot 0.4 | 8.3 | 6.3% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.8% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 68.6 | 6 / 35 | 5161 |
| 2 | 3 | 59.1 | 58.4 | 6 / 35 | 4537 |
| 3 | 1 | 63.5 | 71.4 | 7 / 35 | 5298 |
| 4 | 3 | 59.9 | 61.6 | 4 / 35 | 4772 |
| 5 | 1 | 60.3 | 64.4 | 5 / 35 | 4844 |
| 6 | 3 | 58.1 | 59.0 | 3 / 35 | 4392 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 20 | 50% |
| oog.melee.Mercutio 1.0 | 13 | 62% |
| nic.Nicator 2.4 | 11 | 55% |
| ahf.NanoAndrew .4 | 8 | 25% |
| cx.BlestPain 1.41 | 4 | 75% |
| maribo.melee.BMV 0.1 | 3 | 67% |

Hadur died in 179 of 210 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 36 | 20% | 43 |
| cx.BlestPain 1.41 | 33 | 18% | 39 |
| et.Predator 1.8 | 31 | 17% | 40 |
| ahf.NanoAndrew .4 | 30 | 17% | 31 |
| nic.Nicator 2.4 | 26 | 15% | 32 |
| maribo.melee.BMV 0.1 | 15 | 8% | 17 |
| tex.Longbot 0.4 | 6 | 3% | 6 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 1 |

## Melee bench: F18

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 68.0 | 46 / 210 | 3.88 | 14.5% | 27413 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWL 0.2 | 1.2 | 14.5% | 46 |
| morbid.MorbidPriest 1.0 | 2.3 | 13.5% | 47 |
| agd.Mooserwirt2 2.7 | 2.7 | 12.9% | 46 |
| uji.DBH 1.1 | 4.2 | 12.0% | 30 |
| spinnercat.Robovirus 2.718 | 5.2 | 10.4% | 16 |
| ratosh.Nobo 0.21 | 5.7 | 9.9% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 7.5 | 7.5% | 3 |
| sigterm.Sigterm 1.0 | 7.7 | 7.9% | 10 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.3 | 5.6% | 2 |
| stelo.WangRobot 1.0 | 9.3 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.9 | 63.2 | 5 / 35 | 4756 |
| 2 | 1 | 61.4 | 67.9 | 8 / 35 | 4515 |
| 3 | 1 | 62.3 | 70.5 | 6 / 35 | 4607 |
| 4 | 1 | 62.1 | 69.5 | 9 / 35 | 4556 |
| 5 | 2 | 60.1 | 64.4 | 8 / 35 | 4356 |
| 6 | 1 | 62.8 | 72.4 | 10 / 35 | 4623 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 33 | 55% |
| agd.Mooserwirt2 2.7 | 19 | 32% |
| uji.DBH 1.1 | 12 | 33% |
| spinnercat.Robovirus 2.718 | 7 | 100% |
| ratosh.Nobo 0.21 | 5 | 100% |
| stelo.WangRobot 1.0 | 4 | 100% |
| sigterm.Sigterm 1.0 | 2 | 50% |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 587. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 43 | 26% | 50 |
| morbid.MorbidPriest 1.0 | 35 | 21% | 52 |
| uji.DBH 1.1 | 35 | 21% | 41 |
| ratosh.Nobo 0.21 | 14 | 8% | 18 |
| spinnercat.Robovirus 2.718 | 10 | 6% | 16 |
| kawigi.mini.Fhqwhgads 1.1 | 9 | 5% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9 | 5% | 10 |
| sigterm.Sigterm 1.0 | 8 | 5% | 9 |
| stelo.WangRobot 1.0 | 2 | 1% | 3 |

## Melee bench: F19

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 96.7 | 180 / 210 | 1.30 | 21.7% | 35877 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWL 0.2 | 1.0 | 21.7% | 180 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.4% | 14 |
| mld.Infinity 2.2 | 3.0 | 13.1% | 9 |
| erdnis.Rover 0.3 | 4.3 | 10.4% | 1 |
| krillr.mini.JointStrike 2.0.0 | 4.7 | 10.6% | 0 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.7% | 4 |
| mbh.Mbh 0.1 | 7.3 | 7.5% | 0 |
| pac.ABC 2.1 | 7.7 | 7.1% | 2 |
| pbg.R2D2 1.0 | 9.0 | 5.6% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 96.2 | 32 / 35 | 6570 |
| 2 | 1 | 73.1 | 98.4 | 31 / 35 | 6337 |
| 3 | 1 | 73.3 | 98.7 | 33 / 35 | 5871 |
| 4 | 1 | 72.7 | 96.2 | 31 / 35 | 5997 |
| 5 | 1 | 71.9 | 96.2 | 27 / 35 | 5434 |
| 6 | 1 | 71.6 | 94.3 | 26 / 35 | 5668 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 107 | 93% |
| mld.Infinity 2.2 | 36 | 92% |
| krillr.mini.JointStrike 2.0.0 | 17 | 100% |
| erdnis.Rover 0.3 | 14 | 93% |
| patson.PatsonTestBot 1.0 | 10 | 60% |
| pac.ABC 2.1 | 4 | 100% |
| mbh.Mbh 0.1 | 4 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 31 of 210 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 12 | 39% | 59 |
| patson.PatsonTestBot 1.0 | 6 | 19% | 22 |
| mld.Infinity 2.2 | 5 | 16% | 65 |
| erdnis.Rover 0.3 | 4 | 13% | 23 |
| krillr.mini.JointStrike 2.0.0 | 2 | 6% | 17 |
| pbg.R2D2 1.0 | 2 | 6% | 5 |
| pac.ABC 2.1 | 0 | 0% | 8 |
| mbh.Mbh 0.1 | 0 | 0% | 4 |

## Melee bench: F20

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 82.7 | 76 / 210 | 2.56 | 18.3% | 36010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWL 0.2 | 1.2 | 18.3% | 76 |
| trm.Wrekt 1.1.6.f | 1.8 | 16.5% | 85 |
| fwb.Nine 1.0.1 | 4.0 | 10.5% | 11 |
| catcat20.Rabbit 0.001 | 4.2 | 10.2% | 22 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.4% | 3 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 8.1% | 1 |
| djdjdj.NanoSkunk10 1.0 | 6.7 | 8.0% | 2 |
| bayen.nut.Squirrel 1.615 | 7.3 | 8.0% | 10 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 6.0% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 84.4 | 12 / 35 | 6113 |
| 2 | 1 | 69.5 | 87.9 | 17 / 35 | 6135 |
| 3 | 2 | 66.2 | 77.5 | 8 / 35 | 5882 |
| 4 | 1 | 66.9 | 78.7 | 13 / 35 | 6048 |
| 5 | 1 | 66.8 | 80.6 | 12 / 35 | 5555 |
| 6 | 1 | 69.1 | 87.0 | 14 / 35 | 6277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 55 | 40% |
| fwb.Nine 1.0.1 | 20 | 90% |
| catcat20.Rabbit 0.001 | 15 | 80% |
| nz.jdc.nano.GridFu 1.0 | 10 | 100% |
| bayen.nut.Squirrel 1.615 | 9 | 67% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 80 | 59% | 97 |
| catcat20.Rabbit 0.001 | 23 | 17% | 39 |
| nz.jdc.nano.GridFu 1.0 | 10 | 7% | 23 |
| bayen.nut.Squirrel 1.615 | 10 | 7% | 20 |
| fwb.Nine 1.0.1 | 4 | 3% | 8 |
| ntc.ControlledChaos 1.1.4 | 4 | 3% | 7 |
| djdjdj.NanoSkunk10 1.0 | 2 | 1% | 7 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 2 |

## Melee bench: F21

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.0 | 71 / 210 | 2.26 | 18.7% | 35928 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWL 0.2 | 1.0 | 18.7% | 71 |
| eem.EvBot v4.6.16 | 2.0 | 17.4% | 106 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.3% | 9 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 11 |
| eld.Hmm 1.0 | 5.3 | 8.7% | 12 |
| oa.weak.BotherBot 0.1 | 5.7 | 8.5% | 5 |
| fire219.CatBot 1.0 | 7.2 | 6.3% | 0 |
| PSW.Relentless 0.1 | 8.3 | 5.7% | 0 |
| el.JumpShoot 0.2 | 8.8 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 88.9 | 10 / 35 | 6201 |
| 2 | 1 | 70.2 | 87.3 | 15 / 35 | 6495 |
| 3 | 1 | 67.4 | 81.6 | 12 / 35 | 5477 |
| 4 | 1 | 69.0 | 86.7 | 8 / 35 | 6425 |
| 5 | 1 | 68.7 | 86.3 | 12 / 35 | 5940 |
| 6 | 1 | 68.1 | 85.1 | 14 / 35 | 5390 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 86 | 28% |
| dummy.mini.Scimitar 1.01 | 21 | 95% |
| cf.RiO.RiOx 4.2.1 | 14 | 86% |
| eld.Hmm 1.0 | 10 | 70% |
| oa.weak.BotherBot 0.1 | 6 | 83% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 1093. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 94 | 67% | 117 |
| dummy.mini.Scimitar 1.01 | 15 | 11% | 32 |
| cf.RiO.RiOx 4.2.1 | 14 | 10% | 24 |
| eld.Hmm 1.0 | 9 | 6% | 22 |
| oa.weak.BotherBot 0.1 | 6 | 4% | 14 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 73.9 | 27 / 210 | 3.35 | 15.2% | 29904 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxDT 2.71m | 1.0 | 17.9% | 105 |
| kvk.HebusLeTroll 0.35 | 2.3 | 15.6% | 42 |
| hadur117.mini.DeiseWL 0.2 | 2.7 | 15.2% | 27 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.9% | 27 |
| bigpete.Stewie 1.0 | 5.0 | 10.4% | 7 |
| yk.JahRoslav 1.1 | 6.2 | 7.2% | 1 |
| tad.Dalek98 0.98 | 7.5 | 6.2% | 0 |
| gg.Squaraus 0.6 | 7.8 | 5.9% | 0 |
| pbg.NinjaX 1.2 | 8.5 | 5.3% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.8 | 73.0 | 4 / 35 | 4938 |
| 2 | 3 | 62.3 | 70.5 | 2 / 35 | 4645 |
| 3 | 2 | 64.5 | 74.6 | 3 / 35 | 5177 |
| 4 | 3 | 64.0 | 73.3 | 4 / 35 | 5175 |
| 5 | 2 | 65.5 | 79.0 | 9 / 35 | 5009 |
| 6 | 3 | 64.3 | 73.0 | 5 / 35 | 4960 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 24 | 50% |
| pe.SandboxDT 2.71m | 21 | 10% |
| jlm.javaDisturbance 0.59 | 17 | 41% |
| bigpete.Stewie 1.0 | 4 | 50% |
| yk.JahRoslav 1.1 | 3 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |

Hadur died in 183 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 91 | 50% | 93 |
| kvk.HebusLeTroll 0.35 | 50 | 27% | 60 |
| jlm.javaDisturbance 0.59 | 23 | 13% | 28 |
| bigpete.Stewie 1.0 | 13 | 7% | 17 |
| yk.JahRoslav 1.1 | 3 | 2% | 8 |
| tad.Dalek98 0.98 | 3 | 2% | 3 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 79.4 | 55 / 210 | 2.86 | 16.9% | 31771 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.5 | 18.2% | 96 |
| hadur117.mini.DeiseWL 0.2 | 1.7 | 16.9% | 55 |
| cre.Karolos 0.32 | 2.8 | 15.1% | 44 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.0% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.7 | 9.0% | 0 |
| stelo.RamTrackSurfer 1.2 | 6.2 | 8.7% | 7 |
| cw.megas.Blade 0.8 | 7.0 | 8.2% | 0 |
| sample.Walls 1.0 | 7.2 | 8.2% | 3 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.4 | 80.3 | 6 / 35 | 4714 |
| 2 | 1 | 66.7 | 78.1 | 9 / 35 | 5506 |
| 3 | 3 | 66.1 | 74.3 | 8 / 35 | 5412 |
| 4 | 1 | 67.9 | 81.0 | 12 / 35 | 5360 |
| 5 | 1 | 68.5 | 84.4 | 12 / 35 | 5489 |
| 6 | 2 | 67.0 | 78.1 | 8 / 35 | 5290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 55 | 25% |
| cre.Karolos 0.32 | 24 | 25% |
| sample.Walls 1.0 | 16 | 100% |
| stelo.AreaTargetingBot 1.1 | 13 | 100% |
| stelo.RamTrackSurfer 1.2 | 7 | 29% |
| cw.megas.Blade 0.8 | 4 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 640. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 85 | 55% | 102 |
| cre.Karolos 0.32 | 48 | 31% | 60 |
| stelo.RamTrackSurfer 1.2 | 9 | 6% | 14 |
| stelo.AreaTargetingBot 1.1 | 8 | 5% | 16 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 2% | 6 |
| sample.Walls 1.0 | 1 | 1% | 6 |
| cw.megas.Blade 0.8 | 1 | 1% | 5 |

## Melee bench: F24

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 62.9 | 27 / 210 | 4.34 | 12.9% | 22961 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.8 | 14.2% | 43 |
| florent.XSeries.X2 0.12 | 2.3 | 13.8% | 48 |
| hadur117.mini.DeiseWL 0.2 | 3.3 | 12.9% | 27 |
| davidalves.Phoenix 0.54 | 3.3 | 12.6% | 40 |
| pedersen.Ugluk 1.1.1 | 4.5 | 11.3% | 25 |
| oog.melee.Corsair 1.0 | 5.7 | 10.6% | 11 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 8.8% | 13 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.4% | 1 |
| as.FrankTheTank 1.3 | 8.8 | 5.5% | 2 |
| evd.X1 0.01 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 63.5 | 5 / 35 | 4101 |
| 2 | 3 | 59.9 | 67.0 | 5 / 35 | 3822 |
| 3 | 2 | 59.6 | 64.8 | 6 / 35 | 3879 |
| 4 | 4 | 58.6 | 64.1 | 4 / 35 | 3794 |
| 5 | 5 | 55.7 | 56.5 | 1 / 35 | 3569 |
| 6 | 3 | 58.0 | 61.6 | 6 / 35 | 3796 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 16 | 63% |
| florent.XSeries.X2 0.12 | 13 | 23% |
| davidalves.Phoenix 0.54 | 7 | 57% |
| stelo.SoJNanoMelee 1.1 | 6 | 83% |
| pedersen.Ugluk 1.1.1 | 4 | 75% |
| oog.melee.Corsair 1.0 | 3 | 33% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 183 of 210 rounds, at a mean tick of 565. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 44 | 24% | 48 |
| davidalves.Phoenix 0.54 | 40 | 22% | 44 |
| rz.GlowBlowMelee 1.4 | 36 | 20% | 44 |
| oog.melee.Corsair 1.0 | 28 | 15% | 34 |
| pedersen.Ugluk 1.1.1 | 17 | 9% | 20 |
| stelo.SoJNanoMelee 1.1 | 10 | 5% | 11 |
| as.FrankTheTank 1.3 | 5 | 3% | 5 |
| evd.X1 0.01 | 2 | 1% | 2 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 2 |

## Melee bench: F25

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 84.4 | 106 / 210 | 2.40 | 18.0% | 27498 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWL 0.2 | 1.0 | 18.0% | 106 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 13.3% | 30 |
| jdw.Hurricane 1.4 | 3.3 | 11.9% | 18 |
| voidious.micro.BlitzBat 1.05 | 3.7 | 11.7% | 11 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.3% | 15 |
| ds.Oo 2.2 | 5.5 | 9.5% | 19 |
| awesomeness.Elite 1.0 | 7.3 | 7.7% | 5 |
| gjr.Cephalosporin 0.1 | 7.8 | 7.5% | 6 |
| adt.Ar2 1.1 | 8.8 | 6.5% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 79.4 | 15 / 35 | 4179 |
| 2 | 1 | 67.4 | 84.1 | 21 / 35 | 4531 |
| 3 | 1 | 66.8 | 83.2 | 16 / 35 | 4888 |
| 4 | 1 | 66.9 | 86.0 | 16 / 35 | 4429 |
| 5 | 1 | 66.9 | 84.1 | 16 / 35 | 4472 |
| 6 | 1 | 69.4 | 89.8 | 22 / 35 | 4999 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 42 | 71% |
| jdw.Hurricane 1.4 | 35 | 86% |
| voidious.micro.BlitzBat 1.05 | 34 | 85% |
| gre.svman4.Morfeas 1.4.1 | 10 | 20% |
| awesomeness.Elite 1.0 | 8 | 63% |
| ds.Oo 2.2 | 6 | 17% |
| gjr.Cephalosporin 0.1 | 5 | 80% |
| amk.ChumbaMini 0.2 | 3 | 67% |
| adt.Ar2 1.1 | 2 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 23 | 22% | 60 |
| jdw.Hurricane 1.4 | 21 | 20% | 40 |
| ds.Oo 2.2 | 19 | 18% | 24 |
| voidious.micro.BlitzBat 1.05 | 13 | 12% | 29 |
| gre.svman4.Morfeas 1.4.1 | 11 | 10% | 18 |
| awesomeness.Elite 1.0 | 10 | 10% | 18 |
| adt.Ar2 1.1 | 3 | 3% | 7 |
| gjr.Cephalosporin 0.1 | 2 | 2% | 10 |
| amk.ChumbaMini 0.2 | 2 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 77.4 | 33 / 210 | 3.03 | 16.2% | 33505 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWL 0.2 | 1.5 | 16.2% | 33 |
| ak.Fermat 2.0 | 1.5 | 17.0% | 92 |
| shu.nitro.LENIN .T34 | 3.5 | 12.5% | 35 |
| lrem.Spectre 0.4.4 | 3.8 | 12.3% | 28 |
| js.PinBall 1.6 | 4.8 | 11.0% | 14 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.3% | 6 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 8.9% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.3% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 77.5 | 8 / 35 | 5572 |
| 2 | 1 | 65.0 | 78.4 | 6 / 35 | 5278 |
| 3 | 2 | 66.0 | 78.4 | 5 / 35 | 5604 |
| 4 | 2 | 65.8 | 79.4 | 4 / 35 | 5667 |
| 5 | 1 | 65.3 | 75.9 | 6 / 35 | 5693 |
| 6 | 2 | 65.1 | 74.9 | 4 / 35 | 5691 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 35 | 3% |
| lrem.Spectre 0.4.4 | 25 | 60% |
| shu.nitro.LENIN .T34 | 15 | 47% |
| js.PinBall 1.6 | 13 | 31% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 40% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 33% |

Hadur died in 177 of 210 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 94 | 53% | 98 |
| lrem.Spectre 0.4.4 | 28 | 16% | 35 |
| shu.nitro.LENIN .T34 | 22 | 12% | 30 |
| js.PinBall 1.6 | 14 | 8% | 17 |
| jaybot.adv.bots.JayBot 2.0 | 12 | 7% | 13 |
| gh.mini.GrubbmOne 1.0 | 4 | 2% | 11 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 1% | 4 |
| sample.SpinBot 1.0 | 1 | 1% | 2 |

## Melee bench: F27

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 79.0 | 78 / 210 | 2.89 | 17.1% | 30685 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWL 0.2 | 1.2 | 17.1% | 78 |
| mk.Alpha 0.2.1 | 2.3 | 14.6% | 77 |
| EH.Eagle 1.0.6 | 3.5 | 11.0% | 12 |
| wee.Gem 1.8.4 | 4.2 | 10.8% | 16 |
| sheldor.melee.nano.TestMelee 0.1 | 4.2 | 10.7% | 15 |
| joe.ADinosaur 1.0 | 6.0 | 9.3% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 6.7 | 9.1% | 4 |
| throxbot.ThroxBot 0.1 | 8.2 | 7.9% | 3 |
| caimano.Furia_Ceca 0.22 | 9.2 | 5.5% | 2 |
| cs.Grudge 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 84.8 | 17 / 35 | 4530 |
| 2 | 1 | 67.8 | 87.9 | 18 / 35 | 4941 |
| 3 | 1 | 66.9 | 75.9 | 10 / 35 | 5816 |
| 4 | 2 | 64.1 | 76.2 | 10 / 35 | 4504 |
| 5 | 1 | 65.4 | 69.2 | 10 / 35 | 5773 |
| 6 | 1 | 66.1 | 80.0 | 13 / 35 | 5121 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 45 | 31% |
| EH.Eagle 1.0.6 | 25 | 96% |
| wee.Gem 1.8.4 | 13 | 85% |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 85% |
| throxbot.ThroxBot 0.1 | 10 | 100% |
| joe.ADinosaur 1.0 | 5 | 40% |
| caimano.Furia_Ceca 0.22 | 5 | 60% |
| techdude.kombat.FlamingKombat 1.5 | 4 | 75% |

Hadur died in 132 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 65 | 49% | 80 |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 13% | 34 |
| joe.ADinosaur 1.0 | 16 | 12% | 21 |
| EH.Eagle 1.0.6 | 12 | 9% | 31 |
| wee.Gem 1.8.4 | 11 | 8% | 23 |
| techdude.kombat.FlamingKombat 1.5 | 5 | 4% | 10 |
| caimano.Furia_Ceca 0.22 | 5 | 4% | 7 |
| throxbot.ThroxBot 0.1 | 1 | 1% | 4 |

## Melee bench: F28

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 82.7 | 85 / 210 | 2.56 | 17.5% | 28995 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWL 0.2 | 1.0 | 17.5% | 85 |
| kid.test.NightFox .2 | 2.2 | 13.8% | 25 |
| uji.Antique 1.0 | 3.0 | 13.1% | 58 |
| pfvicm.Sobieski 7.2.3b | 4.0 | 11.0% | 15 |
| qohnil.blot.BlotBot 3.61 | 4.8 | 10.2% | 14 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.2% | 9 |
| amk.ChumbaWumba 0.3 | 6.8 | 8.1% | 2 |
| matt.advanced.Katana 1.0 | 8.3 | 6.8% | 0 |
| stelo.PianistNano 1.2 | 8.7 | 6.5% | 2 |
| stelo.Lifestealer 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 73.7 | 12 / 35 | 4265 |
| 2 | 1 | 66.5 | 82.9 | 18 / 35 | 4656 |
| 3 | 1 | 66.9 | 84.4 | 16 / 35 | 4822 |
| 4 | 1 | 66.5 | 84.4 | 10 / 35 | 5186 |
| 5 | 1 | 66.7 | 84.1 | 12 / 35 | 5058 |
| 6 | 1 | 68.1 | 86.7 | 17 / 35 | 5008 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 47 | 87% |
| uji.Antique 1.0 | 41 | 34% |
| qohnil.blot.BlotBot 3.61 | 14 | 50% |
| pfvicm.Sobieski 7.2.3b | 9 | 56% |
| matt.advanced.Katana 1.0 | 7 | 100% |
| ahr.ice.Ice 1.0.2 | 5 | 60% |
| amk.ChumbaWumba 0.3 | 4 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 647. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 52 | 41% | 77 |
| pfvicm.Sobieski 7.2.3b | 23 | 18% | 28 |
| kid.test.NightFox .2 | 13 | 10% | 35 |
| qohnil.blot.BlotBot 3.61 | 12 | 10% | 18 |
| ahr.ice.Ice 1.0.2 | 11 | 9% | 18 |
| amk.ChumbaWumba 0.3 | 10 | 8% | 14 |
| matt.advanced.Katana 1.0 | 3 | 2% | 13 |
| stelo.PianistNano 1.2 | 2 | 2% | 4 |
| stelo.Lifestealer 1.0 | 0 | 0% | 2 |

## Melee bench: F29

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 72.4 | 45 / 210 | 3.49 | 15.6% | 28153 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.5 | 16.3% | 69 |
| hadur117.mini.DeiseWL 0.2 | 2.0 | 15.6% | 45 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.3% | 68 |
| myl.micro.Troodon 1.10 | 4.0 | 12.6% | 11 |
| jok.PheonixM 0.1.2 | 5.0 | 10.2% | 8 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.3% | 0 |
| DBall.Anarchy 0.1 | 7.2 | 6.9% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 8.3 | 5.6% | 0 |
| ap.Frederick 1.1 | 8.7 | 5.0% | 4 |
| jangs.ns51 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.3 | 67.6 | 10 / 35 | 4565 |
| 2 | 1 | 65.2 | 74.9 | 8 / 35 | 4887 |
| 3 | 2 | 63.3 | 71.4 | 4 / 35 | 4549 |
| 4 | 1 | 66.9 | 80.3 | 10 / 35 | 5043 |
| 5 | 3 | 63.6 | 71.7 | 6 / 35 | 4493 |
| 6 | 2 | 62.5 | 68.3 | 7 / 35 | 4616 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 36 | 28% |
| zyx.mega.YersiniaPestis 3.1 | 28 | 29% |
| myl.micro.Troodon 1.10 | 11 | 100% |
| jok.PheonixM 0.1.2 | 5 | 100% |
| ph.melee.ArcherME 0.3 | 4 | 100% |
| DBall.Anarchy 0.1 | 3 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| ap.Frederick 1.1 | 1 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 92 | 55% | 106 |
| zyx.mega.YersiniaPestis 3.1 | 48 | 29% | 62 |
| myl.micro.Troodon 1.10 | 10 | 6% | 12 |
| jok.PheonixM 0.1.2 | 6 | 4% | 10 |
| ph.melee.ArcherME 0.3 | 4 | 2% | 8 |
| fullsail.TimbotNoPrediction 1.0 | 4 | 2% | 4 |
| DBall.Anarchy 0.1 | 1 | 1% | 6 |
| jangs.ns51 1.0 | 1 | 1% | 2 |

## Melee bench: F30

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.1 | 52.3 | 7 / 210 | 5.30 | 10.7% | 21906 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.7 | 14.4% | 64 |
| darkcanuck.B26354 1.06 | 2.0 | 14.1% | 62 |
| stelo.PastFuture 2.3.2 | 3.0 | 13.1% | 29 |
| oog.melee.Capulet 1.2 | 3.3 | 12.9% | 22 |
| hadur117.mini.DeiseWL 0.2 | 5.2 | 10.7% | 7 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.4% | 13 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.7% | 9 |
| ntc.Opposite 1.5 | 8.0 | 7.3% | 0 |
| tripphippy.Alice 1.1 | 8.0 | 7.7% | 4 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.0 | 57.8 | 1 / 35 | 3704 |
| 2 | 5 | 54.5 | 50.8 | 3 / 35 | 3806 |
| 3 | 5 | 52.8 | 49.2 | 1 / 35 | 3491 |
| 4 | 5 | 53.9 | 50.8 | 0 / 35 | 3870 |
| 5 | 5 | 56.3 | 57.5 | 2 / 35 | 3706 |
| 6 | 6 | 51.2 | 47.6 | 0 / 35 | 3329 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 10 | 40% |
| darkcanuck.B26354 1.06 | 3 | 0% |
| intruder.PrairieWolf 2.61 | 1 | 100% |
| oog.melee.Capulet 1.2 | 1 | 0% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 0% |
| stelo.PastFuture 2.3.2 | 1 | 100% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 203 of 210 rounds, at a mean tick of 522. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 51 | 25% | 55 |
| stelo.PastFuture 2.3.2 | 36 | 18% | 37 |
| oog.melee.Capulet 1.2 | 34 | 17% | 35 |
| darkcanuck.B26354 1.06 | 31 | 15% | 31 |
| intruder.PrairieWolf 2.61 | 21 | 10% | 22 |
| tripphippy.Alice 1.1 | 13 | 6% | 13 |
| fowl3628800.LightningBolt 2.6.0 | 10 | 5% | 10 |
| ntc.Opposite 1.5 | 7 | 3% | 7 |

## Melee bench: F31

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 59.3 | 8 / 210 | 4.66 | 11.8% | 21011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 19.3% | 128 |
| gh.mini.Griezel 0.2 | 2.0 | 14.1% | 48 |
| hadur117.mini.DeiseWL 0.2 | 3.7 | 11.8% | 8 |
| spinnercat.micro.Tyger 0.1 | 4.0 | 11.7% | 12 |
| d414.nano.Quantum 1.0.0 | 4.8 | 10.8% | 6 |
| gh.nano.Grofvuil 0.2 | 5.5 | 9.5% | 5 |
| timmit.nano.TimDog 0.33 | 7.0 | 7.3% | 1 |
| fm.mammillarias 1.3 | 8.2 | 6.3% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.1% | 1 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 65.4 | 1 / 35 | 3883 |
| 2 | 3 | 58.2 | 61.9 | 2 / 35 | 3507 |
| 3 | 6 | 51.9 | 49.5 | 1 / 35 | 2888 |
| 4 | 3 | 57.7 | 60.3 | 1 / 35 | 3650 |
| 5 | 4 | 55.8 | 56.5 | 2 / 35 | 3525 |
| 6 | 3 | 57.9 | 62.2 | 1 / 35 | 3558 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 13 | 15% |
| gh.mini.Griezel 0.2 | 13 | 8% |
| spinnercat.micro.Tyger 0.1 | 3 | 100% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |

Hadur died in 202 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 73 | 36% | 75 |
| gh.mini.Griezel 0.2 | 54 | 27% | 55 |
| gh.nano.Grofvuil 0.2 | 22 | 11% | 24 |
| spinnercat.micro.Tyger 0.1 | 18 | 9% | 19 |
| d414.nano.Quantum 1.0.0 | 13 | 6% | 14 |
| timmit.nano.TimDog 0.33 | 11 | 5% | 12 |
| fm.mammillarias 1.3 | 6 | 3% | 6 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 1% | 3 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 74.1 | 37 / 210 | 3.33 | 15.4% | 29428 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWL 0.2 | 1.5 | 15.4% | 37 |
| kawigi.sbf.FloodHT 0.9.2 | 1.7 | 15.2% | 78 |
| apc.botM 3.0 | 2.8 | 13.1% | 46 |
| lxx.ConceptA 0.8 | 4.5 | 10.7% | 13 |
| vjik.UnViolation 1.1 | 4.8 | 9.7% | 9 |
| bayen.UbaMicro 1.4 | 5.7 | 9.0% | 7 |
| panzer.Panzer 0.2 | 7.7 | 7.5% | 4 |
| yk.JahMicro 1.0 | 7.7 | 7.4% | 10 |
| conscience.Electron 1.3g | 9.0 | 6.7% | 3 |
| donjezza.Jezza 1.0 | 9.7 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.2 | 72.1 | 7 / 35 | 4720 |
| 2 | 2 | 63.6 | 73.7 | 6 / 35 | 5190 |
| 3 | 1 | 63.4 | 74.0 | 7 / 35 | 4973 |
| 4 | 1 | 64.7 | 80.3 | 5 / 35 | 5337 |
| 5 | 2 | 60.6 | 68.6 | 4 / 35 | 4489 |
| 6 | 2 | 63.5 | 75.9 | 8 / 35 | 4719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 40 | 23% |
| apc.botM 3.0 | 22 | 23% |
| lxx.ConceptA 0.8 | 12 | 33% |
| vjik.UnViolation 1.1 | 10 | 90% |
| donjezza.Jezza 1.0 | 6 | 83% |
| yk.JahMicro 1.0 | 5 | 20% |
| bayen.UbaMicro 1.4 | 4 | 75% |
| conscience.Electron 1.3g | 2 | 50% |

Hadur died in 174 of 210 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 61 | 35% | 69 |
| apc.botM 3.0 | 48 | 28% | 56 |
| lxx.ConceptA 0.8 | 23 | 13% | 25 |
| bayen.UbaMicro 1.4 | 14 | 8% | 15 |
| vjik.UnViolation 1.1 | 10 | 6% | 21 |
| yk.JahMicro 1.0 | 8 | 5% | 10 |
| panzer.Panzer 0.2 | 5 | 3% | 5 |
| conscience.Electron 1.3g | 4 | 2% | 6 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

## Melee bench: F33

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 72.0 | 38 / 210 | 3.52 | 15.2% | 27824 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.3 | 17.1% | 88 |
| hadur117.mini.DeiseWL 0.2 | 1.7 | 15.2% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.6% | 19 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.8% | 30 |
| labg.Cataclysm 2.05 | 4.5 | 11.3% | 25 |
| baal.nano.N 1.42 | 6.2 | 9.0% | 5 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.5% | 5 |
| zyx.micro.Ant 1.1 | 8.8 | 5.1% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 4.9% | 0 |
| sanja.First 0.1 | 9.2 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 76.5 | 5 / 35 | 4826 |
| 2 | 2 | 64.3 | 71.1 | 9 / 35 | 4966 |
| 3 | 2 | 61.9 | 67.0 | 6 / 35 | 4349 |
| 4 | 2 | 61.5 | 68.3 | 6 / 35 | 4156 |
| 5 | 2 | 63.4 | 73.0 | 5 / 35 | 4447 |
| 6 | 1 | 64.7 | 75.9 | 7 / 35 | 5080 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 28 | 25% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 68% |
| gre.svman4.Leonidas 1.3.2 | 14 | 50% |
| labg.Cataclysm 2.05 | 11 | 36% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 80% |
| baal.nano.N 1.42 | 2 | 0% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 69 | 40% | 78 |
| gre.svman4.Leonidas 1.3.2 | 35 | 20% | 43 |
| labg.Cataclysm 2.05 | 22 | 13% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 11% | 30 |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 6% | 12 |
| baal.nano.N 1.42 | 9 | 5% | 15 |
| sanja.First 0.1 | 3 | 2% | 3 |
| zyx.micro.Ant 1.1 | 3 | 2% | 3 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |

## Melee bench: F34

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 69.6 | 14 / 210 | 3.73 | 14.0% | 27058 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.5 | 18.2% | 100 |
| kid.Gladiator .7.2 | 1.5 | 17.7% | 72 |
| hadur117.mini.DeiseWL 0.2 | 3.0 | 14.0% | 14 |
| tcf.Reach 3 | 4.2 | 11.5% | 10 |
| cli.Dancer 1.1 | 5.3 | 10.1% | 2 |
| jcs.Seth 1.8 | 5.5 | 10.2% | 11 |
| ratosh.Wesco 1.4 | 7.0 | 6.9% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.7% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.8% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.4 | 70.2 | 0 / 35 | 4568 |
| 2 | 3 | 64.2 | 73.3 | 5 / 35 | 4911 |
| 3 | 3 | 63.9 | 74.3 | 3 / 35 | 4868 |
| 4 | 3 | 62.3 | 70.2 | 3 / 35 | 4294 |
| 5 | 3 | 60.3 | 66.0 | 1 / 35 | 4105 |
| 6 | 3 | 60.7 | 63.8 | 2 / 35 | 4312 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 21 | 14% |
| kid.Gladiator .7.2 | 11 | 45% |
| tcf.Reach 3 | 5 | 40% |
| jcs.Seth 1.8 | 2 | 50% |
| cli.Dancer 1.1 | 2 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 196 of 210 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 80 | 41% | 84 |
| kid.Gladiator .7.2 | 54 | 28% | 57 |
| tcf.Reach 3 | 34 | 17% | 36 |
| cli.Dancer 1.1 | 13 | 7% | 17 |
| jcs.Seth 1.8 | 9 | 5% | 10 |
| ratosh.Wesco 1.4 | 4 | 2% | 4 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |

## Melee bench: F35

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 65.2 | 6 / 210 | 4.13 | 12.6% | 21764 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.6% | 174 |
| gh.mini.Gruwel 0.9 | 2.5 | 13.6% | 15 |
| hadur117.mini.DeiseWL 0.2 | 3.2 | 12.6% | 6 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.7 | 12.3% | 9 |
| rz.HawkOnFire 0.1 | 4.7 | 11.5% | 3 |
| myl.nano.KomoriNinja 1.1 | 6.5 | 7.3% | 2 |
| wit.Chuliath 1.0 | 6.7 | 6.9% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 5.9% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 65.7 | 2 / 35 | 3419 |
| 2 | 4 | 58.5 | 63.8 | 2 / 35 | 3597 |
| 3 | 4 | 58.0 | 62.5 | 2 / 35 | 3335 |
| 4 | 3 | 59.3 | 66.7 | 0 / 35 | 3580 |
| 5 | 3 | 59.4 | 64.8 | 0 / 35 | 3967 |
| 6 | 2 | 60.1 | 67.6 | 0 / 35 | 3866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 25 | 20% |
| gh.mini.Gruwel 0.9 | 2 | 50% |
| dmh.robocode.robot.BlackDeath 9.2 | 1 | 0% |

Hadur died in 204 of 210 rounds, at a mean tick of 536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 85 | 42% | 88 |
| dmh.robocode.robot.BlackDeath 9.2 | 50 | 25% | 52 |
| gh.mini.Gruwel 0.9 | 38 | 19% | 39 |
| rz.HawkOnFire 0.1 | 11 | 5% | 11 |
| myl.nano.KomoriNinja 1.1 | 8 | 4% | 8 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 5 | 2% | 5 |
| wit.Chuliath 1.0 | 5 | 2% | 5 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |

## Melee bench: F36

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.1 | 119 / 210 | 2.07 | 19.6% | 34204 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWL 0.2 | 1.0 | 19.6% | 119 |
| alpha.RainingFire 1.0 | 2.8 | 11.9% | 20 |
| bzdp.Pansy 2.1 | 3.2 | 11.9% | 14 |
| mz.Cork 0.1 | 3.5 | 11.9% | 13 |
| bvh.micro.Freya 0.3 | 4.5 | 11.0% | 29 |
| m3thos.Eva02 0.7.1 | 6.0 | 8.9% | 6 |
| bvh.mini.Fenrir 0.39 | 7.2 | 8.2% | 5 |
| dl.BetterWalls 1.0 | 8.2 | 6.5% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 6.1% | 1 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 88.3 | 20 / 35 | 5891 |
| 2 | 1 | 67.9 | 85.4 | 17 / 35 | 5144 |
| 3 | 1 | 69.6 | 87.9 | 20 / 35 | 5757 |
| 4 | 1 | 69.9 | 89.2 | 22 / 35 | 5725 |
| 5 | 1 | 69.2 | 85.7 | 18 / 35 | 6071 |
| 6 | 1 | 70.4 | 92.1 | 22 / 35 | 5616 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 51 | 84% |
| mz.Cork 0.1 | 31 | 84% |
| bvh.micro.Freya 0.3 | 27 | 41% |
| alpha.RainingFire 1.0 | 25 | 68% |
| bvh.mini.Fenrir 0.39 | 11 | 100% |
| dl.BetterWalls 1.0 | 8 | 75% |
| m3thos.Eva02 0.7.1 | 6 | 67% |
| sample.MyFirstRobot 1.0 | 2 | 50% |

Hadur died in 91 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.micro.Freya 0.3 | 24 | 26% | 35 |
| mz.Cork 0.1 | 16 | 18% | 45 |
| alpha.RainingFire 1.0 | 16 | 18% | 34 |
| bzdp.Pansy 2.1 | 14 | 15% | 42 |
| dl.BetterWalls 1.0 | 5 | 5% | 18 |
| m3thos.Eva02 0.7.1 | 5 | 5% | 12 |
| bvh.mini.Fenrir 0.39 | 5 | 5% | 11 |
| squidM.TentalceMeleeNano 1.1 | 5 | 5% | 10 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 3 |

## Melee bench: F37

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 85.1 | 133 / 210 | 2.34 | 18.3% | 32585 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWL 0.2 | 1.0 | 18.3% | 133 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.8 | 10.8% | 15 |
| germ.TheMind .2 | 3.2 | 10.7% | 5 |
| agrach.Dalek 1.0 | 4.0 | 9.9% | 20 |
| EBBU.Sim2 1.02 | 4.7 | 9.6% | 4 |
| lmk.ACPFinal 0.1 | 7.3 | 8.3% | 5 |
| mb.Beast 0.1 | 7.5 | 8.3% | 9 |
| stelo.UntouchableNano 1.3 | 7.8 | 8.4% | 12 |
| mn.nano.perceptual.Impact 1.3.0 | 7.8 | 8.0% | 2 |
| skm.Ryubot 1.0 | 8.8 | 7.7% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 82.5 | 20 / 35 | 5534 |
| 2 | 1 | 67.3 | 85.7 | 21 / 35 | 5766 |
| 3 | 1 | 66.4 | 84.4 | 21 / 35 | 5241 |
| 4 | 1 | 67.5 | 85.4 | 24 / 35 | 5752 |
| 5 | 1 | 67.8 | 86.0 | 24 / 35 | 5519 |
| 6 | 1 | 66.6 | 86.7 | 23 / 35 | 4773 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 41 | 100% |
| agrach.Dalek 1.0 | 22 | 73% |
| EBBU.Sim2 1.02 | 21 | 86% |
| stelo.UntouchableNano 1.3 | 18 | 72% |
| skm.Ryubot 1.0 | 16 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 14 | 71% |
| mb.Beast 0.1 | 12 | 100% |
| lmk.ACPFinal 0.1 | 8 | 88% |

Hadur died in 79 of 210 rounds, at a mean tick of 465. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 17 | 22% | 42 |
| lmk.ACPFinal 0.1 | 16 | 20% | 31 |
| stelo.UntouchableNano 1.3 | 12 | 15% | 26 |
| com.syncleus.robocode.Dreadnaught 0.1 | 11 | 14% | 36 |
| mb.Beast 0.1 | 10 | 13% | 25 |
| EBBU.Sim2 1.02 | 7 | 9% | 24 |
| mn.nano.perceptual.Impact 1.3.0 | 6 | 8% | 10 |
| germ.TheMind .2 | 0 | 0% | 11 |
| skm.Ryubot 1.0 | 0 | 0% | 3 |

## Melee bench: F38

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 64.6 | 18 / 210 | 4.19 | 13.0% | 23515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.9% | 113 |
| bvh.mini.Freya 0.55 | 2.7 | 13.3% | 24 |
| hadur117.mini.DeiseWL 0.2 | 2.8 | 13.0% | 18 |
| bts.mega.Gnarly 1.4 | 4.0 | 11.7% | 33 |
| cs.Wren 1.0 | 5.0 | 11.2% | 8 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.8 | 10.0% | 4 |
| kdf.KoulDestroyer 1.0 | 6.7 | 9.0% | 8 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 5.7% | 1 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.3% | 1 |
| bzdp.BoxCar 2.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 65.4 | 4 / 35 | 3968 |
| 2 | 3 | 57.6 | 59.4 | 1 / 35 | 3976 |
| 3 | 2 | 59.9 | 65.4 | 3 / 35 | 3966 |
| 4 | 3 | 61.1 | 69.8 | 4 / 35 | 3935 |
| 5 | 3 | 59.2 | 64.8 | 4 / 35 | 3749 |
| 6 | 3 | 58.9 | 62.5 | 2 / 35 | 3921 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 23 | 0% |
| cs.Wren 1.0 | 9 | 100% |
| bvh.mini.Freya 0.55 | 8 | 63% |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 100% |
| bts.mega.Gnarly 1.4 | 3 | 0% |
| kdf.KoulDestroyer 1.0 | 1 | 0% |

Hadur died in 192 of 210 rounds, at a mean tick of 589. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 88 | 46% | 91 |
| bts.mega.Gnarly 1.4 | 32 | 17% | 33 |
| bvh.mini.Freya 0.55 | 19 | 10% | 24 |
| kdf.KoulDestroyer 1.0 | 17 | 9% | 18 |
| cs.Wren 1.0 | 16 | 8% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 6% | 14 |
| bzdp.BoxCar 2.0 | 4 | 2% | 5 |
| matt.UnderDark3 2.4.34 | 3 | 2% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 1% | 2 |

## Melee bench: F39

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 67.2 | 34 / 210 | 3.95 | 14.1% | 27845 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.0 | 15.6% | 50 |
| hadur117.mini.DeiseWL 0.2 | 2.3 | 14.1% | 34 |
| az.Ololobot 0.2.4 | 3.2 | 12.8% | 63 |
| catcat20.Lambda 0.024 | 3.5 | 11.8% | 37 |
| stelo.SoRobotNanoMelee 1.2 | 5.5 | 9.6% | 12 |
| winamp32.micro.MicroMacro 1.0 | 6.5 | 8.6% | 5 |
| gimp.GimpBot 0.1 | 6.8 | 8.7% | 3 |
| apollokidd.ApolloKidd 0.9 | 7.2 | 8.3% | 6 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 5.6% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 71.1 | 8 / 35 | 4935 |
| 2 | 3 | 58.8 | 60.6 | 5 / 35 | 4727 |
| 3 | 2 | 61.9 | 70.5 | 7 / 35 | 4549 |
| 4 | 2 | 61.2 | 70.5 | 5 / 35 | 4585 |
| 5 | 3 | 59.5 | 64.4 | 5 / 35 | 4544 |
| 6 | 2 | 60.1 | 66.3 | 4 / 35 | 4505 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 24 | 50% |
| catcat20.Lambda 0.024 | 13 | 38% |
| az.Ololobot 0.2.4 | 13 | 31% |
| stelo.SoRobotNanoMelee 1.2 | 7 | 86% |
| gimp.GimpBot 0.1 | 6 | 83% |
| winamp32.micro.MicroMacro 1.0 | 4 | 50% |
| apollokidd.ApolloKidd 0.9 | 1 | 0% |

Hadur died in 176 of 210 rounds, at a mean tick of 669. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 64 | 36% | 73 |
| az.Ololobot 0.2.4 | 35 | 20% | 39 |
| catcat20.Lambda 0.024 | 27 | 15% | 34 |
| apollokidd.ApolloKidd 0.9 | 18 | 10% | 18 |
| gimp.GimpBot 0.1 | 13 | 7% | 21 |
| winamp32.micro.MicroMacro 1.0 | 9 | 5% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 8 | 5% | 10 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 1 |

## Melee bench: F40

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 70.7 | 39 / 210 | 3.64 | 15.0% | 28143 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 1.3 | 16.5% | 82 |
| hadur117.mini.DeiseWL 0.2 | 1.8 | 15.0% | 39 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.9% | 33 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.4% | 14 |
| alpha.BlackIce 1.0 | 5.2 | 9.9% | 12 |
| mz.AntiGrav 1.0 | 5.5 | 10.0% | 13 |
| stelo.Randomness 1.0 | 6.3 | 9.6% | 17 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.5% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.3% | 0 |
| sample.Corners 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 67.9 | 3 / 35 | 4645 |
| 2 | 2 | 60.5 | 65.1 | 6 / 35 | 4529 |
| 3 | 1 | 66.9 | 82.5 | 12 / 35 | 5172 |
| 4 | 2 | 63.8 | 73.3 | 7 / 35 | 4741 |
| 5 | 3 | 59.8 | 64.4 | 3 / 35 | 4143 |
| 6 | 1 | 63.5 | 70.8 | 8 / 35 | 4913 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 31 | 16% |
| kano.gamma.KanoGamma 1.8 | 19 | 32% |
| Polkwane.SmashMelee 1.0 | 16 | 88% |
| alpha.BlackIce 1.0 | 7 | 14% |
| stelo.Randomness 1.0 | 7 | 57% |
| mz.AntiGrav 1.0 | 5 | 100% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 662. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 69 | 40% | 78 |
| kano.gamma.KanoGamma 1.8 | 44 | 26% | 52 |
| stelo.Randomness 1.0 | 17 | 10% | 23 |
| alpha.BlackIce 1.0 | 16 | 9% | 18 |
| amk.superstrike.SuperStrike 0.3 | 8 | 5% | 13 |
| Polkwane.SmashMelee 1.0 | 8 | 5% | 12 |
| mz.AntiGrav 1.0 | 8 | 5% | 11 |
| sample.Corners 1.0 | 1 | 1% | 2 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 1 |

## Melee bench: F41

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 71.4 | 32 / 210 | 3.57 | 14.6% | 26140 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.2 | 17.3% | 104 |
| hadur117.mini.DeiseWL 0.2 | 2.0 | 14.6% | 32 |
| lessonz.robocode.Oz 0.5.0 | 3.0 | 13.2% | 31 |
| ary.Swarm 1.1 | 3.8 | 12.6% | 11 |
| simonton.nano.MeleeSeed 1.8 | 5.2 | 10.6% | 20 |
| shrub.Silver v048 | 6.2 | 9.6% | 7 |
| zyx.nano.Ant 1.1 | 6.7 | 8.3% | 1 |
| stelo.Mirror 1.1 | 8.0 | 6.1% | 3 |
| jsal.Jsalbot 1.0 | 9.0 | 5.4% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 71.4 | 8 / 35 | 4352 |
| 2 | 2 | 61.6 | 69.5 | 3 / 35 | 3909 |
| 3 | 2 | 63.5 | 73.3 | 7 / 35 | 4670 |
| 4 | 3 | 59.5 | 64.8 | 1 / 35 | 3886 |
| 5 | 2 | 64.2 | 73.7 | 6 / 35 | 4670 |
| 6 | 1 | 63.9 | 75.9 | 7 / 35 | 4653 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 36 | 33% |
| ary.Swarm 1.1 | 12 | 75% |
| lessonz.robocode.Oz 0.5.0 | 11 | 45% |
| shrub.Silver v048 | 5 | 60% |
| stelo.Mirror 1.1 | 2 | 50% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| simonton.nano.MeleeSeed 1.8 | 1 | 0% |

Hadur died in 178 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 84 | 47% | 95 |
| lessonz.robocode.Oz 0.5.0 | 39 | 22% | 42 |
| ary.Swarm 1.1 | 25 | 14% | 31 |
| shrub.Silver v048 | 15 | 8% | 22 |
| simonton.nano.MeleeSeed 1.8 | 9 | 5% | 12 |
| jsal.Jsalbot 1.0 | 2 | 1% | 4 |
| stelo.Mirror 1.1 | 2 | 1% | 2 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
| zyx.nano.Ant 1.1 | 1 | 1% | 1 |

## Melee bench: F42

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 72.5 | 15 / 210 | 3.47 | 14.9% | 30150 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.9% | 109 |
| hadur117.mini.DeiseWL 0.2 | 2.2 | 14.9% | 15 |
| maribo.mini.MiniQuester 0.1 | 3.2 | 13.8% | 35 |
| ara.Shera 0.88 | 3.7 | 13.5% | 39 |
| amz.NanoClone 1.41 | 5.3 | 8.6% | 1 |
| maribo.IotaCT 1.1 | 6.0 | 7.7% | 3 |
| dsw.StaticD 1.0 | 6.7 | 7.2% | 8 |
| stelo.MirrorMicro 1.0 | 8.3 | 6.1% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 75.6 | 4 / 35 | 5043 |
| 2 | 3 | 61.3 | 69.2 | 2 / 35 | 4848 |
| 3 | 2 | 63.4 | 72.7 | 3 / 35 | 5156 |
| 4 | 2 | 61.8 | 69.5 | 0 / 35 | 4992 |
| 5 | 2 | 63.6 | 73.0 | 5 / 35 | 5151 |
| 6 | 2 | 63.2 | 75.2 | 1 / 35 | 4960 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 41 | 20% |
| ara.Shera 0.88 | 16 | 19% |
| maribo.mini.MiniQuester 0.1 | 13 | 15% |
| dsw.StaticD 1.0 | 2 | 50% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 195 of 210 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 87 | 45% | 94 |
| ara.Shera 0.88 | 51 | 26% | 56 |
| maribo.mini.MiniQuester 0.1 | 37 | 19% | 39 |
| dsw.StaticD 1.0 | 8 | 4% | 9 |
| maribo.IotaCT 1.1 | 4 | 2% | 4 |
| stelo.MirrorMicro 1.0 | 3 | 2% | 3 |
| amz.NanoClone 1.41 | 2 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 1% | 2 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |

## Melee bench: F43

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 61.6 | 5 / 210 | 4.45 | 12.3% | 22398 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.7% | 173 |
| hadur117.mini.DeiseWL 0.2 | 3.0 | 12.3% | 5 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.5% | 14 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.8% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 4.3 | 11.5% | 6 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 10.1% | 3 |
| jab.DiamondStealer 5 | 7.5 | 7.9% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.8% | 1 |
| cvt.Firsty 1.0 | 9.0 | 3.8% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.0 | 64.1 | 2 / 35 | 3643 |
| 2 | 3 | 59.9 | 61.3 | 1 / 35 | 3902 |
| 3 | 3 | 58.0 | 56.5 | 0 / 35 | 3719 |
| 4 | 5 | 59.2 | 61.3 | 0 / 35 | 3536 |
| 5 | 3 | 58.9 | 61.0 | 0 / 35 | 3570 |
| 6 | 2 | 61.5 | 65.7 | 2 / 35 | 4028 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 27 | 0% |
| dummy.micro.Sparrow 2.5 | 3 | 67% |
| brainfade.melee.Dusk 0.44 | 3 | 33% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 50% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 205 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 94 | 46% | 96 |
| brainfade.melee.Dusk 0.44 | 28 | 14% | 29 |
| wcsv.melee.EngineerMelee 0.1 | 28 | 14% | 28 |
| dummy.micro.Sparrow 2.5 | 21 | 10% | 22 |
| Krabb.akim2.Akim2 1.1b | 14 | 7% | 15 |
| mz.NanoGod 2.02 | 12 | 6% | 12 |
| jab.DiamondStealer 5 | 6 | 3% | 6 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |

## Melee bench: F44

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 73.5 | 25 / 210 | 3.38 | 15.7% | 32510 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWL 0.2 | 1.7 | 15.7% | 25 |
| stelo.Liblix 0.3.1 | 1.7 | 16.2% | 100 |
| tzu.TheArtOfWar 1.2 | 2.7 | 14.0% | 50 |
| wompi.Quokka 1.6 | 4.3 | 11.1% | 13 |
| jwirde.Gort 2.0 | 5.2 | 10.4% | 16 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 9.4% | 2 |
| disan.Chair 2.2.0 | 7.2 | 7.6% | 2 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.4% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.9% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 79.7 | 7 / 35 | 5795 |
| 2 | 2 | 64.0 | 71.7 | 5 / 35 | 5422 |
| 3 | 1 | 64.7 | 74.0 | 3 / 35 | 5825 |
| 4 | 2 | 64.0 | 74.3 | 5 / 35 | 5172 |
| 5 | 2 | 63.3 | 72.7 | 2 / 35 | 4961 |
| 6 | 2 | 62.6 | 68.9 | 3 / 35 | 5335 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 40 | 28% |
| tzu.TheArtOfWar 1.2 | 24 | 21% |
| jwirde.Gort 2.0 | 9 | 22% |
| wompi.Quokka 1.6 | 7 | 57% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 67% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 185 of 210 rounds, at a mean tick of 718. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 67 | 36% | 79 |
| tzu.TheArtOfWar 1.2 | 42 | 23% | 47 |
| jwirde.Gort 2.0 | 25 | 14% | 29 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 23 | 12% | 23 |
| wompi.Quokka 1.6 | 18 | 10% | 19 |
| stf.PanzerGeneral 0.1 | 4 | 2% | 6 |
| disan.Chair 2.2.0 | 3 | 2% | 3 |
| amk.jointstrike.JointStrike 0.2 | 2 | 1% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 1 |

## Melee bench: F45

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 85.8 | 78 / 210 | 2.28 | 19.3% | 36126 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWL 0.2 | 1.0 | 19.3% | 78 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 12.7% | 94 |
| jje.BagPuss 1.2 | 2.7 | 12.2% | 15 |
| sul.Lunar 1.1 | 4.5 | 10.3% | 13 |
| myl.nano.Graviton 1.10 | 4.8 | 10.0% | 3 |
| fm.claire 1.7 | 6.2 | 8.7% | 0 |
| hvilela.HVilela 0.9 | 7.2 | 8.0% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 7.6% | 4 |
| wit.Deep7 2.0 | 8.8 | 6.0% | 3 |
| abud.ThirdRobo 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 89.5 | 12 / 35 | 6396 |
| 2 | 1 | 68.9 | 87.3 | 14 / 35 | 5824 |
| 3 | 1 | 69.1 | 86.0 | 16 / 35 | 6109 |
| 4 | 1 | 69.0 | 86.7 | 13 / 35 | 6017 |
| 5 | 1 | 66.5 | 77.5 | 12 / 35 | 5490 |
| 6 | 1 | 69.4 | 87.6 | 11 / 35 | 6290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 89 | 38% |
| jje.BagPuss 1.2 | 20 | 65% |
| sul.Lunar 1.1 | 19 | 74% |
| myl.nano.Graviton 1.10 | 6 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 5 | 80% |
| fm.claire 1.7 | 3 | 100% |
| wit.Deep7 2.0 | 2 | 50% |
| hvilela.HVilela 0.9 | 2 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 1595. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 57 | 43% | 0 |
| jje.BagPuss 1.2 | 30 | 23% | 81 |
| sul.Lunar 1.1 | 17 | 13% | 49 |
| wit.Deep7 2.0 | 7 | 5% | 23 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 5% | 17 |
| myl.nano.Graviton 1.10 | 6 | 5% | 16 |
| hvilela.HVilela 0.9 | 6 | 5% | 11 |
| fm.claire 1.7 | 4 | 3% | 9 |
| abud.ThirdRobo 1.0 | 0 | 0% | 4 |

## Melee bench: F46

hadur117.mini.DeiseWL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 70.0 | 6 / 210 | 3.70 | 13.7% | 25176 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 18.7% | 99 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 17.2% | 91 |
| hadur117.mini.DeiseWL 0.2 | 3.0 | 13.7% | 6 |
| mz.MicroSheep 1.0 | 4.3 | 10.4% | 4 |
| cx.Princess 1.0 | 4.7 | 10.1% | 10 |
| sadoner.killer 0.2 | 6.0 | 8.9% | 0 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.2% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 6.1% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.5% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.3 | 72.1 | 3 / 35 | 4341 |
| 2 | 3 | 62.6 | 72.7 | 1 / 35 | 4355 |
| 3 | 3 | 61.2 | 69.2 | 1 / 35 | 4029 |
| 4 | 3 | 62.1 | 71.1 | 1 / 35 | 4211 |
| 5 | 3 | 59.7 | 65.7 | 0 / 35 | 4025 |
| 6 | 3 | 60.9 | 69.2 | 0 / 35 | 4215 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 30 | 7% |
| rsalesc.melee.Medina 0.4.5 | 13 | 0% |
| mz.MicroSheep 1.0 | 2 | 100% |
| cx.Princess 1.0 | 2 | 100% |

Hadur died in 204 of 210 rounds, at a mean tick of 603. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 102 | 50% | 104 |
| rsalesc.melee.Medina 0.4.5 | 69 | 34% | 70 |
| cx.Princess 1.0 | 11 | 5% | 12 |
| sadoner.killer 0.2 | 9 | 4% | 10 |
| mz.MicroSheep 1.0 | 7 | 3% | 8 |
| arthord.NanoSatanMelee Beta | 3 | 1% | 3 |
| jeremyreeder.collective.Prophet 5 | 1 | 0% | 1 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 1 |
| kurios.DOSexe .9a | 1 | 0% | 1 |

