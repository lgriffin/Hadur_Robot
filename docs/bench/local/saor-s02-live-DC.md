# Bench suite: suite.txt

## Melee bench: F01

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 74.2 | 28 / 280 | 3.32 | 15.2% | 39234 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 206 |
| hadur117.micro.SaorDC 0.1 | 2.0 | 15.2% | 28 |
| sgp.JollyNinja 3.53 | 3.3 | 12.1% | 30 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.1 | 10.9% | 5 |
| lorneswork.Predator 1.0 | 5.3 | 10.3% | 2 |
| mz.MicroGodMelee 1 | 5.4 | 10.0% | 6 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 8.4 | 5.3% | 0 |
| skm.butterfly 1.0 | 8.6 | 5.3% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 82.2 | 5 / 35 | 5371 |
| 2 | 2 | 65.3 | 74.6 | 2 / 35 | 5344 |
| 3 | 2 | 63.6 | 72.4 | 4 / 35 | 4748 |
| 4 | 2 | 64.4 | 73.0 | 3 / 35 | 5356 |
| 5 | 2 | 63.5 | 75.2 | 2 / 35 | 4682 |
| 6 | 2 | 63.5 | 74.0 | 5 / 35 | 4714 |
| 7 | 2 | 63.5 | 73.7 | 5 / 35 | 4695 |
| 8 | 2 | 61.2 | 68.6 | 2 / 35 | 4324 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 104 | 1% |
| sgp.JollyNinja 3.53 | 25 | 64% |
| mz.MicroGodMelee 1 | 8 | 50% |
| lorneswork.Predator 1.0 | 5 | 80% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 50% |
| adt.Ar2 1.0 | 1 | 0% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 252 of 280 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 162 | 64% | 169 |
| sgp.JollyNinja 3.53 | 20 | 8% | 30 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 8% | 22 |
| lorneswork.Predator 1.0 | 18 | 7% | 21 |
| mz.MicroGodMelee 1 | 17 | 7% | 20 |
| adt.Ar2 1.0 | 7 | 3% | 7 |
| kawigi.sbf.FloodSonnet 0.9 | 5 | 2% | 6 |
| skm.butterfly 1.0 | 2 | 1% | 4 |
| mym.EdgeStalker 1.0 | 1 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 79.9 | 110 / 280 | 2.81 | 17.6% | 42305 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 17.6% | 110 |
| pulsar.PulsarMax 0.8.9 | 2.4 | 14.1% | 67 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 12.9% | 49 |
| lrem.micro.SpikeSoldier 0.4 | 4.1 | 10.7% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.5 | 9.5% | 14 |
| fnc.bandit.Bandit 5.2.0 | 6.5 | 8.4% | 1 |
| sch.Simone 0.3d | 6.8 | 8.0% | 13 |
| Noran.BitchingElk 0.054 | 7.5 | 7.6% | 15 |
| stelo.PatternRobot 1.0 | 8.6 | 6.6% | 7 |
| fullsail.SweetTea 1.1 | 9.9 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 80.0 | 12 / 35 | 5188 |
| 2 | 1 | 67.1 | 81.0 | 16 / 35 | 5173 |
| 3 | 1 | 67.0 | 80.0 | 16 / 35 | 5276 |
| 4 | 1 | 66.3 | 78.1 | 14 / 35 | 5459 |
| 5 | 1 | 65.3 | 76.8 | 14 / 35 | 4850 |
| 6 | 1 | 66.3 | 79.0 | 9 / 35 | 5552 |
| 7 | 1 | 67.2 | 82.2 | 15 / 35 | 5068 |
| 8 | 1 | 68.0 | 82.2 | 14 / 35 | 5739 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 59 | 47% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 53 | 58% |
| sch.Simone 0.3d | 15 | 73% |
| Noran.BitchingElk 0.054 | 14 | 43% |
| stelo.PatternRobot 1.0 | 12 | 75% |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 50% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 100% |
| fullsail.SweetTea 1.1 | 7 | 86% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 171 of 280 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 68 | 40% | 90 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 40 | 23% | 75 |
| stelo.PatternRobot 1.0 | 13 | 8% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 7% | 24 |
| Noran.BitchingElk 0.054 | 12 | 7% | 18 |
| sch.Simone 0.3d | 9 | 5% | 21 |
| com.cohesiva.robocode.ManOwaR 1.0 | 9 | 5% | 19 |
| fullsail.SweetTea 1.1 | 5 | 3% | 11 |
| fnc.bandit.Bandit 5.2.0 | 2 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 72.7 | 138 / 280 | 3.45 | 16.4% | 42140 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.4 | 16.4% | 138 |
| radnor.DoctorBob 1.42 | 1.8 | 14.4% | 59 |
| vuen.Cake 2.51 | 3.4 | 13.0% | 43 |
| kawigi.nano.Lib 1.0 | 3.9 | 12.1% | 27 |
| urdos.URDOS 1.3 | 4.6 | 10.3% | 7 |
| adt.Ar1 2.1 | 6.4 | 8.0% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 7.2% | 2 |
| oa.weak.FlyMk1 0.1 | 7.6 | 7.1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 6.2% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 80.3 | 20 / 35 | 5493 |
| 2 | 1 | 67.8 | 82.9 | 22 / 35 | 5768 |
| 3 | 1 | 60.7 | 61.6 | 13 / 35 | 4598 |
| 4 | 1 | 66.0 | 75.2 | 19 / 35 | 5419 |
| 5 | 1 | 67.0 | 81.0 | 21 / 35 | 5359 |
| 6 | 1 | 63.0 | 66.0 | 15 / 35 | 5089 |
| 7 | 2 | 65.1 | 71.7 | 16 / 35 | 5691 |
| 8 | 3 | 60.8 | 63.2 | 12 / 35 | 4723 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 55 | 80% |
| radnor.DoctorBob 1.42 | 47 | 72% |
| kawigi.nano.Lib 1.0 | 44 | 93% |
| oa.weak.FlyMk1 0.1 | 6 | 83% |
| urdos.URDOS 1.3 | 5 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 4 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 143 of 280 rounds, at a mean tick of 489. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 35 | 24% | 64 |
| kawigi.nano.Lib 1.0 | 29 | 20% | 73 |
| vuen.Cake 2.51 | 19 | 13% | 60 |
| ghent.ArthurPanzergon 1.0.0 | 16 | 11% | 19 |
| urdos.URDOS 1.3 | 13 | 9% | 20 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 8% | 13 |
| adt.Ar1 2.1 | 10 | 7% | 12 |
| oa.weak.FlyMk1 0.1 | 8 | 6% | 12 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 1% | 6 |

## Melee bench: F04

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 71.3 | 9 / 280 | 3.58 | 14.9% | 41462 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.8% | 254 |
| hadur117.micro.SaorDC 0.1 | 2.0 | 14.9% | 9 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.3% | 11 |
| TNT.TNT 0.99.1 | 4.0 | 11.1% | 4 |
| josago.Jorgito 0.16 | 5.0 | 9.2% | 1 |
| tj.zombie1n 1.0.1 | 6.6 | 6.9% | 1 |
| css.Delitioner 0.11 | 6.6 | 6.9% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.9% | 0 |
| sp.Nanos.Ember 1.1 | 9.4 | 4.0% | 0 |
| spin.Bugstard 0.012b | 9.6 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.4 | 79.4 | 3 / 35 | 5574 |
| 2 | 2 | 62.9 | 67.3 | 0 / 35 | 4976 |
| 3 | 2 | 64.3 | 72.4 | 2 / 35 | 5071 |
| 4 | 2 | 63.7 | 68.9 | 1 / 35 | 5063 |
| 5 | 2 | 63.7 | 72.4 | 0 / 35 | 4886 |
| 6 | 2 | 65.0 | 72.1 | 1 / 35 | 5527 |
| 7 | 2 | 62.4 | 65.4 | 1 / 35 | 4962 |
| 8 | 2 | 64.6 | 72.7 | 1 / 35 | 5403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 90 | 1% |
| apc.LeeroyJenkins2 1.0 | 7 | 29% |
| TNT.TNT 0.99.1 | 4 | 75% |
| tj.zombie1n 1.0.1 | 2 | 50% |
| sp.Nanos.Ember 1.1 | 1 | 100% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 271 of 280 rounds, at a mean tick of 913. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 201 | 74% | 203 |
| apc.LeeroyJenkins2 1.0 | 27 | 10% | 29 |
| josago.Jorgito 0.16 | 15 | 6% | 15 |
| TNT.TNT 0.99.1 | 9 | 3% | 12 |
| css.Delitioner 0.11 | 8 | 3% | 9 |
| tj.zombie1n 1.0.1 | 6 | 2% | 7 |
| rampancy.Durandal 2.1d | 3 | 1% | 3 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 2 |
| spin.Bugstard 0.012b | 1 | 0% | 0 |

## Melee bench: F05

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.3 | 57.1 | 6 / 280 | 4.86 | 11.8% | 30388 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.1 | 18.6% | 166 |
| justin.DemonicRage 3.4 | 1.9 | 17.1% | 84 |
| wompi.Numbat 2.1 | 3.1 | 12.7% | 17 |
| hadur117.micro.SaorDC 0.1 | 3.9 | 11.8% | 6 |
| axeBots.HataMoto 3.09 | 5.1 | 9.4% | 6 |
| ms.Ares 0.19 | 5.9 | 8.6% | 1 |
| supersample.SuperBoxBot 1.0 | 7.0 | 6.6% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.8% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.9% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.0 | 51.4 | 0 / 35 | 3424 |
| 2 | 4 | 57.1 | 57.8 | 0 / 35 | 3790 |
| 3 | 4 | 56.3 | 55.6 | 0 / 35 | 3629 |
| 4 | 4 | 60.2 | 63.8 | 1 / 35 | 4283 |
| 5 | 4 | 59.1 | 62.2 | 0 / 35 | 3958 |
| 6 | 4 | 58.1 | 56.5 | 3 / 35 | 3955 |
| 7 | 3 | 57.0 | 54.9 | 1 / 35 | 3762 |
| 8 | 4 | 55.8 | 54.6 | 1 / 35 | 3587 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 23 | 4% |
| cb.fire.Firestarter 2.0f | 23 | 0% |
| wompi.Numbat 2.1 | 3 | 100% |
| axeBots.HataMoto 3.09 | 1 | 100% |
| supersample.SuperBoxBot 1.0 | 1 | 100% |
| ms.Ares 0.19 | 1 | 0% |

Hadur died in 274 of 280 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 93 | 34% | 95 |
| cb.fire.Firestarter 2.0f | 84 | 31% | 84 |
| wompi.Numbat 2.1 | 37 | 14% | 40 |
| axeBots.HataMoto 3.09 | 19 | 7% | 20 |
| supersample.SuperBoxBot 1.0 | 14 | 5% | 13 |
| ms.Ares 0.19 | 12 | 4% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 9 | 3% | 9 |
| GarmBox.Oranges 1.0 | 5 | 2% | 5 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 77.6 | 135 / 280 | 3.02 | 16.7% | 35411 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 16.7% | 135 |
| jekl.StoneGhost 0.7 | 2.1 | 14.6% | 35 |
| origin.SleepSiphon 1.7b | 3.1 | 13.2% | 65 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.1 | 11.7% | 22 |
| mld.Wisdom 1.0 | 4.8 | 11.0% | 7 |
| gg.Wolverine 2.0 | 5.9 | 8.5% | 9 |
| spinnercat.Omen 1.0 | 7.8 | 7.1% | 0 |
| DBall.NUKE 0.1 | 8.0 | 6.8% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 8.3 | 6.8% | 5 |
| sample.Fire 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 82.2 | 18 / 35 | 4442 |
| 2 | 1 | 64.0 | 74.0 | 16 / 35 | 4110 |
| 3 | 1 | 67.1 | 82.9 | 20 / 35 | 4522 |
| 4 | 1 | 67.1 | 81.0 | 18 / 35 | 4810 |
| 5 | 1 | 64.3 | 77.5 | 14 / 35 | 4054 |
| 6 | 1 | 66.5 | 77.8 | 20 / 35 | 4853 |
| 7 | 1 | 63.9 | 71.4 | 16 / 35 | 4198 |
| 8 | 1 | 64.4 | 74.0 | 13 / 35 | 4422 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 65 | 88% |
| origin.SleepSiphon 1.7b | 45 | 47% |
| pe.minimelee.SandboxMiniMelee 1.1 | 41 | 85% |
| gg.Wolverine 2.0 | 10 | 50% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 86% |
| mld.Wisdom 1.0 | 6 | 83% |
| DBall.NUKE 0.1 | 6 | 83% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 146 of 280 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 36 | 25% | 77 |
| origin.SleepSiphon 1.7b | 35 | 24% | 71 |
| mld.Wisdom 1.0 | 29 | 20% | 34 |
| pe.minimelee.SandboxMiniMelee 1.1 | 24 | 16% | 62 |
| gg.Wolverine 2.0 | 12 | 8% | 17 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 3% | 8 |
| DBall.NUKE 0.1 | 2 | 1% | 6 |
| spinnercat.Omen 1.0 | 2 | 1% | 3 |
| sample.Fire 1.0 | 1 | 1% | 2 |

## Melee bench: F07

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 84.8 | 104 / 280 | 2.37 | 18.6% | 47778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.1 | 18.6% | 104 |
| rsalesc.melee.Monk 0.3.6c | 2.4 | 17.3% | 71 |
| rtk.Tachikoma 1.0 | 2.5 | 16.4% | 72 |
| franzor.Lizt 1.3.1 | 4.3 | 10.9% | 22 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 10.0% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.4 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.6 | 7.8% | 1 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.3% | 0 |
| sample.Target 1.0 | 9.3 | 2.9% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 79.4 | 13 / 35 | 5368 |
| 2 | 1 | 70.9 | 87.3 | 14 / 35 | 6543 |
| 3 | 1 | 69.6 | 88.3 | 13 / 35 | 5820 |
| 4 | 1 | 68.4 | 81.6 | 9 / 35 | 5863 |
| 5 | 2 | 68.2 | 80.3 | 11 / 35 | 5382 |
| 6 | 1 | 70.6 | 91.1 | 13 / 35 | 6274 |
| 7 | 1 | 70.5 | 85.1 | 15 / 35 | 6454 |
| 8 | 1 | 69.9 | 85.1 | 16 / 35 | 6074 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 107 | 52% |
| rsalesc.melee.Monk 0.3.6c | 38 | 8% |
| oog.melee.CapuletDroid 1.1 | 30 | 83% |
| franzor.Lizt 1.3.1 | 25 | 64% |
| exauge.GateKeeper 1.1.121g | 4 | 100% |

Hadur died in 178 of 280 rounds, at a mean tick of 1213. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 74 | 42% | 141 |
| rsalesc.melee.Monk 0.3.6c | 67 | 38% | 100 |
| oog.melee.CapuletDroid 1.1 | 13 | 7% | 14 |
| franzor.Lizt 1.3.1 | 12 | 7% | 4 |
| lrem.micro.MoggFanatic 0.2 | 5 | 3% | 11 |
| exauge.GateKeeper 1.1.121g | 3 | 2% | 6 |
| skm.PateranBotlock2 1.0 | 2 | 1% | 2 |
| drd.Dreadknoght 0.9 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 78.3 | 120 / 280 | 2.95 | 17.8% | 43976 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 17.8% | 120 |
| tm.Yuugao 1.0 | 2.1 | 13.8% | 82 |
| shrub.Vapour v159 | 3.0 | 11.5% | 35 |
| com.spp.robocode.MostlyHarmless 010 | 4.0 | 10.5% | 19 |
| Krabb.sliNk.Garm 0.9u | 5.1 | 9.7% | 14 |
| m3thos.Eva00 1.1 | 6.3 | 9.0% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 8.6% | 4 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 7.1% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.1 | 6.0% | 1 |
| SHAM.WOW 1.4 | 9.6 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 79.7 | 19 / 35 | 5373 |
| 2 | 1 | 65.5 | 73.0 | 14 / 35 | 5367 |
| 3 | 1 | 65.5 | 74.0 | 13 / 35 | 5621 |
| 4 | 1 | 67.0 | 81.0 | 18 / 35 | 5404 |
| 5 | 1 | 67.2 | 82.5 | 13 / 35 | 5519 |
| 6 | 1 | 64.7 | 70.8 | 12 / 35 | 5451 |
| 7 | 1 | 68.7 | 83.8 | 16 / 35 | 5912 |
| 8 | 1 | 67.5 | 81.6 | 15 / 35 | 5329 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 64 | 33% |
| shrub.Vapour v159 | 48 | 69% |
| com.spp.robocode.MostlyHarmless 010 | 28 | 86% |
| Krabb.sliNk.Garm 0.9u | 17 | 94% |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 86% |
| qualidafial.MajorDick 1.0.1 | 7 | 86% |
| m3thos.Eva00 1.1 | 4 | 100% |
| SHAM.WOW 1.4 | 4 | 100% |

Hadur died in 161 of 280 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 66 | 41% | 93 |
| shrub.Vapour v159 | 28 | 17% | 51 |
| com.spp.robocode.MostlyHarmless 010 | 15 | 9% | 46 |
| zyx.nano.BacillusComma 1.0 | 13 | 8% | 15 |
| Krabb.sliNk.Garm 0.9u | 12 | 7% | 24 |
| m3thos.Eva00 1.1 | 8 | 5% | 12 |
| qualidafial.MajorDick 1.0.1 | 8 | 5% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 4% | 17 |
| SHAM.WOW 1.4 | 5 | 3% | 11 |

## Melee bench: F09

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 61.8 | 33 / 280 | 4.44 | 12.9% | 29955 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.7% | 154 |
| kc.micro.Figment 1.0 | 2.1 | 14.0% | 52 |
| hadur117.micro.SaorDC 0.1 | 3.0 | 12.9% | 33 |
| yagami.Tidus 0.11 | 4.3 | 11.0% | 1 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.6% | 16 |
| mc2.enemy.Original 0.9 | 5.9 | 9.5% | 18 |
| dft.Calliope 5.6 | 7.0 | 7.8% | 5 |
| step.nanoPri 1.0 | 8.3 | 5.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.1 | 5.6% | 1 |
| rdm.Dueler 0.4x | 9.6 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 66.7 | 6 / 35 | 4187 |
| 2 | 3 | 58.7 | 61.6 | 5 / 35 | 3839 |
| 3 | 3 | 56.6 | 56.5 | 4 / 35 | 3522 |
| 4 | 3 | 60.1 | 66.3 | 4 / 35 | 3590 |
| 5 | 3 | 58.2 | 61.3 | 3 / 35 | 3562 |
| 6 | 4 | 56.2 | 54.3 | 3 / 35 | 3485 |
| 7 | 2 | 59.5 | 63.5 | 3 / 35 | 3940 |
| 8 | 3 | 59.9 | 64.1 | 5 / 35 | 3830 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 50 | 8% |
| kc.micro.Figment 1.0 | 34 | 41% |
| mc2.enemy.Original 0.9 | 5 | 80% |
| yagami.Tidus 0.11 | 5 | 100% |
| dft.Calliope 5.6 | 4 | 100% |
| pedersen.Grishnakh 1.0 | 3 | 33% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 247 of 280 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 90 | 36% | 96 |
| kc.micro.Figment 1.0 | 77 | 31% | 93 |
| yagami.Tidus 0.11 | 20 | 8% | 22 |
| pedersen.Grishnakh 1.0 | 17 | 7% | 20 |
| robar.nano.Assertive_Melee 0.2 | 13 | 5% | 13 |
| mc2.enemy.Original 0.9 | 10 | 4% | 13 |
| rdm.Dueler 0.4x | 9 | 4% | 9 |
| dft.Calliope 5.6 | 8 | 3% | 10 |
| step.nanoPri 1.0 | 3 | 1% | 3 |

## Melee bench: F10

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 81.5 | 113 / 280 | 2.66 | 17.3% | 41565 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.4 | 17.3% | 113 |
| DTF.Kludgy 1.2b | 1.6 | 16.3% | 103 |
| ejb.Polaris 1.0.1 | 3.9 | 11.9% | 24 |
| ne.Chimera 1.2 | 4.0 | 11.6% | 7 |
| vStar.RAFzilla 2.15 | 4.3 | 11.1% | 11 |
| tvv.micro.Antares 1.1.1 | 5.9 | 10.3% | 14 |
| kurios.DOSexe .9b | 7.9 | 5.6% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.9 | 5.8% | 0 |
| sam.Samspin 1.0 | 8.4 | 5.5% | 0 |
| donjezza.Muncho 1.0 | 9.9 | 4.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 85.1 | 19 / 35 | 5916 |
| 2 | 1 | 66.6 | 80.6 | 14 / 35 | 5224 |
| 3 | 2 | 66.3 | 80.3 | 14 / 35 | 4739 |
| 4 | 1 | 64.9 | 75.6 | 13 / 35 | 4863 |
| 5 | 2 | 65.9 | 80.3 | 14 / 35 | 4890 |
| 6 | 1 | 68.1 | 86.7 | 15 / 35 | 5427 |
| 7 | 1 | 67.7 | 86.0 | 13 / 35 | 5436 |
| 8 | 2 | 65.4 | 77.5 | 11 / 35 | 5070 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 80 | 23% |
| ejb.Polaris 1.0.1 | 44 | 70% |
| vStar.RAFzilla 2.15 | 32 | 97% |
| ne.Chimera 1.2 | 21 | 90% |
| tvv.micro.Antares 1.1.1 | 11 | 64% |
| kurios.DOSexe .9b | 3 | 67% |
| donjezza.Muncho 1.0 | 3 | 67% |
| sam.Samspin 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 168 of 280 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 101 | 60% | 119 |
| ne.Chimera 1.2 | 18 | 11% | 36 |
| ejb.Polaris 1.0.1 | 17 | 10% | 52 |
| tvv.micro.Antares 1.1.1 | 9 | 5% | 15 |
| kurios.DOSexe .9b | 8 | 5% | 10 |
| sam.Samspin 1.0 | 5 | 3% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 3% | 4 |
| vStar.RAFzilla 2.15 | 4 | 2% | 32 |
| donjezza.Muncho 1.0 | 1 | 1% | 3 |

## Melee bench: F11

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 69.3 | 59 / 280 | 3.76 | 14.8% | 35563 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.1 | 17.1% | 126 |
| hadur117.micro.SaorDC 0.1 | 2.0 | 14.8% | 59 |
| cx.mini.Nimrod 0.55 | 3.3 | 12.4% | 30 |
| djc.DynaBot 0.1.1 | 4.0 | 10.9% | 20 |
| br2.MobyDickBot 1.6 | 5.6 | 9.2% | 18 |
| rdt199.Warlord 0.73 | 6.1 | 8.8% | 11 |
| uji.YellohFellah 1.0 | 6.9 | 8.2% | 14 |
| KiraNL.Chupacabra 0.4 | 7.0 | 7.9% | 2 |
| stelo.MirrorNano 1.3 | 9.4 | 5.3% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.6 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 77.5 | 7 / 35 | 4665 |
| 2 | 2 | 56.5 | 57.8 | 3 / 35 | 3713 |
| 3 | 2 | 64.4 | 75.9 | 6 / 35 | 4708 |
| 4 | 2 | 63.7 | 72.1 | 10 / 35 | 4580 |
| 5 | 2 | 61.3 | 64.1 | 9 / 35 | 4440 |
| 6 | 3 | 60.8 | 67.9 | 3 / 35 | 4202 |
| 7 | 2 | 61.7 | 64.8 | 11 / 35 | 4334 |
| 8 | 1 | 64.5 | 74.3 | 10 / 35 | 4921 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 62 | 15% |
| cx.mini.Nimrod 0.55 | 28 | 71% |
| djc.DynaBot 0.1.1 | 12 | 83% |
| rdt199.Warlord 0.73 | 11 | 64% |
| uji.YellohFellah 1.0 | 10 | 80% |
| br2.MobyDickBot 1.6 | 8 | 63% |

Hadur died in 221 of 280 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 106 | 48% | 112 |
| cx.mini.Nimrod 0.55 | 39 | 18% | 58 |
| br2.MobyDickBot 1.6 | 16 | 7% | 22 |
| KiraNL.Chupacabra 0.4 | 15 | 7% | 16 |
| rdt199.Warlord 0.73 | 14 | 6% | 24 |
| djc.DynaBot 0.1.1 | 12 | 5% | 20 |
| uji.YellohFellah 1.0 | 9 | 4% | 18 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 4% | 9 |
| stelo.MirrorNano 1.3 | 1 | 0% | 1 |

## Melee bench: F12

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 78.3 | 115 / 280 | 2.95 | 16.3% | 31146 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 16.3% | 115 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.7% | 53 |
| darkcanuck.Leon 1.01 | 3.1 | 13.0% | 48 |
| nat.PallasHawk 1.0 | 3.4 | 12.7% | 40 |
| brainfade.melee.Genghis 0.36 | 5.4 | 10.2% | 18 |
| jrm.Test0 1.0 | 6.3 | 8.1% | 1 |
| jp.Perpy 16.0 | 7.3 | 7.2% | 1 |
| cs.sheldor.Talon 1.1 | 7.4 | 7.2% | 2 |
| jaybot.bots.Oddball 4.0 | 9.1 | 5.9% | 3 |
| stuff.Vlad 0.1 | 9.6 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 76.8 | 10 / 35 | 3515 |
| 2 | 1 | 65.0 | 79.4 | 13 / 35 | 4057 |
| 3 | 1 | 65.4 | 81.3 | 14 / 35 | 4203 |
| 4 | 1 | 63.6 | 74.6 | 14 / 35 | 3792 |
| 5 | 1 | 63.8 | 75.9 | 15 / 35 | 3501 |
| 6 | 1 | 66.3 | 82.5 | 18 / 35 | 4089 |
| 7 | 1 | 67.0 | 84.8 | 17 / 35 | 4210 |
| 8 | 1 | 62.8 | 71.4 | 14 / 35 | 3779 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 48 | 71% |
| bts.wiki.RipCurl 0.9b | 43 | 67% |
| darkcanuck.Leon 1.01 | 42 | 67% |
| brainfade.melee.Genghis 0.36 | 21 | 71% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| jaybot.bots.Oddball 4.0 | 4 | 75% |
| jp.Perpy 16.0 | 2 | 100% |

Hadur died in 166 of 280 rounds, at a mean tick of 693. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 47 | 28% | 75 |
| darkcanuck.Leon 1.01 | 34 | 20% | 71 |
| nat.PallasHawk 1.0 | 30 | 18% | 63 |
| brainfade.melee.Genghis 0.36 | 26 | 16% | 32 |
| cs.sheldor.Talon 1.1 | 9 | 5% | 13 |
| jrm.Test0 1.0 | 7 | 4% | 7 |
| stuff.Vlad 0.1 | 5 | 3% | 6 |
| jaybot.bots.Oddball 4.0 | 4 | 2% | 7 |
| jp.Perpy 16.0 | 4 | 2% | 5 |

## Melee bench: F13

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 63.3 | 15 / 280 | 4.31 | 12.8% | 31902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 17.0% | 128 |
| ags.Glacier 0.2.11 | 1.5 | 17.4% | 82 |
| hadur117.micro.SaorDC 0.1 | 3.6 | 12.8% | 15 |
| shinh.Entangled 0.3 | 3.9 | 12.5% | 30 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.9% | 22 |
| apc.Colossus2 0.17 | 6.1 | 8.1% | 1 |
| stelo.Wang 1.0 | 6.9 | 7.0% | 2 |
| ayk.WallHugger 1.0 | 8.1 | 5.5% | 0 |
| maribo.FollowFire 1 | 8.9 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 62.2 | 3 / 35 | 3855 |
| 2 | 3 | 60.0 | 63.2 | 3 / 35 | 3864 |
| 3 | 4 | 60.2 | 65.4 | 1 / 35 | 4036 |
| 4 | 3 | 62.6 | 73.3 | 3 / 35 | 4460 |
| 5 | 5 | 55.8 | 53.0 | 1 / 35 | 3452 |
| 6 | 5 | 58.7 | 59.7 | 2 / 35 | 3905 |
| 7 | 3 | 59.7 | 65.1 | 1 / 35 | 4103 |
| 8 | 3 | 60.4 | 64.1 | 1 / 35 | 4227 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 33 | 12% |
| mn.Combat 3.25.0 | 22 | 18% |
| shinh.Entangled 0.3 | 9 | 44% |
| gh.micro.Gruweltje 0.7 | 4 | 50% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 265 of 280 rounds, at a mean tick of 612. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 103 | 39% | 107 |
| mn.Combat 3.25.0 | 76 | 29% | 80 |
| shinh.Entangled 0.3 | 33 | 12% | 37 |
| gh.micro.Gruweltje 0.7 | 19 | 7% | 21 |
| stelo.Wang 1.0 | 13 | 5% | 13 |
| apc.Colossus2 0.17 | 8 | 3% | 9 |
| maribo.FollowFire 1 | 7 | 3% | 7 |
| ayk.WallHugger 1.0 | 5 | 2% | 5 |
| sample.Tracker 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 72.4 | 144 / 280 | 3.49 | 16.6% | 40292 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.1 | 16.6% | 144 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.9% | 41 |
| catcat20.shape.Theta 0.018 | 2.9 | 13.0% | 63 |
| Lo_Ian.Gandalf_V4 4.0 | 4.8 | 10.1% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.6 | 9.7% | 3 |
| sanyi.mikrobi.Roberto 1.0 | 5.8 | 9.7% | 5 |
| co.edu.usb.rc.LidisTron 1.0 | 6.4 | 9.1% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 8.4% | 11 |
| pa.Improved 1.0 | 9.0 | 6.2% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 72.4 | 17 / 35 | 5024 |
| 2 | 1 | 65.2 | 74.0 | 17 / 35 | 4827 |
| 3 | 1 | 66.0 | 74.3 | 17 / 35 | 5325 |
| 4 | 1 | 63.6 | 67.9 | 16 / 35 | 5047 |
| 5 | 1 | 68.8 | 80.3 | 24 / 35 | 5694 |
| 6 | 1 | 66.2 | 74.9 | 19 / 35 | 5001 |
| 7 | 1 | 66.9 | 77.8 | 19 / 35 | 4992 |
| 8 | 2 | 60.7 | 57.5 | 15 / 35 | 4382 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 98 | 90% |
| catcat20.shape.Theta 0.018 | 44 | 45% |
| co.edu.usb.rc.LidisTron 1.0 | 12 | 92% |
| sanyi.mikrobi.Roberto 1.0 | 9 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |

Hadur died in 136 of 280 rounds, at a mean tick of 544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 56 | 41% | 137 |
| catcat20.shape.Theta 0.018 | 37 | 27% | 54 |
| sanyi.mikrobi.Roberto 1.0 | 13 | 10% | 30 |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 7% | 16 |
| Lo_Ian.Gandalf_V4 4.0 | 7 | 5% | 10 |
| co.edu.usb.rc.LidisTron 1.0 | 6 | 4% | 12 |
| sample.TrackFire 1.0 | 3 | 2% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 1% | 10 |
| pa.Improved 1.0 | 2 | 1% | 3 |

## Melee bench: F15

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 83.3 | 155 / 280 | 2.50 | 19.0% | 46275 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 19.0% | 155 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.7% | 25 |
| emp.Yngwie 1.11 | 3.1 | 12.6% | 59 |
| mld.DustBunny 3.8 | 3.4 | 12.2% | 13 |
| kawigi.robot.Girl 1.2 | 5.4 | 9.3% | 16 |
| cb.nano.Insomnia 1.0 | 5.6 | 8.9% | 8 |
| Grystrion.TrackerWO 1.0 | 7.4 | 6.8% | 0 |
| lambdaxy.TBot 0.1 | 7.6 | 6.6% | 0 |
| divineomega.TrialBot 0.003 | 9.1 | 5.8% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.9 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 81.9 | 16 / 35 | 5655 |
| 2 | 1 | 67.5 | 80.0 | 16 / 35 | 5769 |
| 3 | 1 | 68.9 | 84.1 | 22 / 35 | 5597 |
| 4 | 1 | 69.0 | 84.1 | 16 / 35 | 5885 |
| 5 | 1 | 67.8 | 79.7 | 19 / 35 | 5686 |
| 6 | 1 | 69.7 | 86.0 | 23 / 35 | 5931 |
| 7 | 1 | 69.2 | 85.1 | 21 / 35 | 5904 |
| 8 | 1 | 69.3 | 85.7 | 22 / 35 | 5848 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 56 | 96% |
| emp.Yngwie 1.11 | 54 | 52% |
| mld.DustBunny 3.8 | 24 | 92% |
| kawigi.robot.Girl 1.2 | 24 | 83% |
| cb.nano.Insomnia 1.0 | 22 | 91% |
| divineomega.TrialBot 0.003 | 11 | 82% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 125 of 280 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 58 | 46% | 106 |
| mld.DustBunny 3.8 | 19 | 15% | 49 |
| cb.nano.Insomnia 1.0 | 13 | 10% | 10 |
| kawigi.micro.Shiz 1.1 | 11 | 9% | 61 |
| kawigi.robot.Girl 1.2 | 11 | 9% | 21 |
| divineomega.TrialBot 0.003 | 5 | 4% | 15 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 4 | 3% | 5 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 6 |
| lambdaxy.TBot 0.1 | 2 | 2% | 5 |

## Melee bench: F16

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 81.9 | 91 / 280 | 2.63 | 18.0% | 44142 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.5 | 18.0% | 91 |
| gh.Griezel 0.5.2 | 1.5 | 17.4% | 129 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.5% | 10 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 10.4% | 37 |
| bvh.fnr.Fenrir 0.36l | 5.1 | 9.2% | 2 |
| tvv.nano.Polaris 1.2 | 5.6 | 9.1% | 7 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.3% | 3 |
| asd.Cthulhu 1.3 | 8.8 | 5.1% | 0 |
| repositorio.NanoStep 1.0 | 8.9 | 5.3% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.4 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 80.6 | 17 / 35 | 5735 |
| 2 | 1 | 69.9 | 85.1 | 14 / 35 | 6404 |
| 3 | 1 | 68.6 | 85.4 | 12 / 35 | 5542 |
| 4 | 1 | 66.9 | 84.4 | 7 / 35 | 5046 |
| 5 | 2 | 66.9 | 81.6 | 9 / 35 | 5447 |
| 6 | 2 | 66.9 | 78.1 | 13 / 35 | 5300 |
| 7 | 2 | 66.9 | 77.8 | 12 / 35 | 5226 |
| 8 | 2 | 67.4 | 82.5 | 7 / 35 | 5442 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 115 | 23% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 32 | 97% |
| techdude.forest.FlamingForest 1.1 | 31 | 39% |
| bvh.fnr.Fenrir 0.36l | 13 | 100% |
| tvv.nano.Polaris 1.2 | 4 | 100% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |
| stelo.IntrinsicVolatility 1.4 | 2 | 50% |

Hadur died in 189 of 280 rounds, at a mean tick of 1427. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 116 | 61% | 151 |
| techdude.forest.FlamingForest 1.1 | 25 | 13% | 39 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 8% | 37 |
| bvh.fnr.Fenrir 0.36l | 14 | 7% | 20 |
| stelo.IntrinsicVolatility 1.4 | 7 | 4% | 12 |
| tvv.nano.Polaris 1.2 | 7 | 4% | 12 |
| divineomega.DivineBot 1.9.4.5 | 2 | 1% | 7 |
| asd.Cthulhu 1.3 | 1 | 1% | 1 |
| repositorio.NanoStep 1.0 | 1 | 1% | 1 |

## Melee bench: F17

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 83.3 | 142 / 280 | 2.50 | 18.0% | 38395 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 18.0% | 142 |
| et.Predator 1.8 | 2.3 | 13.3% | 34 |
| oog.melee.Mercutio 1.0 | 3.1 | 12.4% | 32 |
| cx.BlestPain 1.41 | 4.5 | 11.1% | 38 |
| nic.Nicator 2.4 | 5.0 | 10.7% | 15 |
| ahf.NanoAndrew .4 | 5.3 | 10.4% | 15 |
| maribo.melee.BMV 0.1 | 6.9 | 9.1% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 6.3% | 2 |
| tex.Longbot 0.4 | 8.8 | 5.9% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 76.8 | 15 / 35 | 4404 |
| 2 | 1 | 69.9 | 88.3 | 24 / 35 | 5335 |
| 3 | 1 | 68.5 | 87.6 | 16 / 35 | 5062 |
| 4 | 1 | 67.5 | 84.4 | 19 / 35 | 4529 |
| 5 | 1 | 67.5 | 86.0 | 16 / 35 | 4564 |
| 6 | 1 | 66.1 | 77.8 | 15 / 35 | 4812 |
| 7 | 1 | 66.6 | 80.3 | 15 / 35 | 4815 |
| 8 | 1 | 68.5 | 85.1 | 22 / 35 | 4874 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 64 | 78% |
| oog.melee.Mercutio 1.0 | 45 | 80% |
| nic.Nicator 2.4 | 36 | 78% |
| cx.BlestPain 1.41 | 33 | 30% |
| ahf.NanoAndrew .4 | 14 | 79% |
| edu.otg.spr.TheTeacher 1.2 | 5 | 60% |
| maribo.melee.BMV 0.1 | 4 | 100% |

Hadur died in 139 of 280 rounds, at a mean tick of 1039. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 34 | 24% | 85 |
| cx.BlestPain 1.41 | 29 | 21% | 42 |
| oog.melee.Mercutio 1.0 | 22 | 16% | 53 |
| nic.Nicator 2.4 | 18 | 13% | 41 |
| ahf.NanoAndrew .4 | 12 | 9% | 24 |
| maribo.melee.BMV 0.1 | 8 | 6% | 11 |
| edu.otg.spr.TheTeacher 1.2 | 7 | 5% | 14 |
| tex.Longbot 0.4 | 5 | 4% | 5 |
| goblin.Bender 2.4 | 4 | 3% | 4 |

## Melee bench: F18

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 81.5 | 148 / 280 | 2.66 | 17.7% | 36350 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 17.7% | 148 |
| morbid.MorbidPriest 1.0 | 2.4 | 13.0% | 34 |
| agd.Mooserwirt2 2.7 | 3.1 | 11.9% | 37 |
| ratosh.Nobo 0.21 | 4.3 | 10.5% | 9 |
| uji.DBH 1.1 | 4.6 | 10.6% | 18 |
| spinnercat.Robovirus 2.718 | 6.0 | 9.3% | 12 |
| sigterm.Sigterm 1.0 | 7.0 | 8.3% | 12 |
| kawigi.mini.Fhqwhgads 1.1 | 7.9 | 7.4% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.1 | 5.9% | 2 |
| stelo.WangRobot 1.0 | 9.6 | 5.4% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 84.8 | 26 / 35 | 4617 |
| 2 | 1 | 66.0 | 79.0 | 16 / 35 | 4693 |
| 3 | 1 | 66.7 | 81.0 | 19 / 35 | 4691 |
| 4 | 1 | 65.8 | 81.0 | 17 / 35 | 4145 |
| 5 | 1 | 65.0 | 79.0 | 14 / 35 | 4365 |
| 6 | 1 | 67.8 | 82.9 | 22 / 35 | 4837 |
| 7 | 1 | 66.7 | 83.5 | 17 / 35 | 4459 |
| 8 | 1 | 66.4 | 81.0 | 17 / 35 | 4543 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 51 | 76% |
| agd.Mooserwirt2 2.7 | 33 | 70% |
| uji.DBH 1.1 | 28 | 82% |
| sigterm.Sigterm 1.0 | 23 | 91% |
| ratosh.Nobo 0.21 | 20 | 85% |
| spinnercat.Robovirus 2.718 | 19 | 74% |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 100% |
| stelo.WangRobot 1.0 | 5 | 60% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 133 of 280 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 35 | 26% | 85 |
| agd.Mooserwirt2 2.7 | 27 | 20% | 62 |
| uji.DBH 1.1 | 15 | 11% | 29 |
| ratosh.Nobo 0.21 | 12 | 9% | 27 |
| kawigi.mini.Fhqwhgads 1.1 | 12 | 9% | 19 |
| sigterm.Sigterm 1.0 | 10 | 8% | 21 |
| spinnercat.Robovirus 2.718 | 10 | 8% | 20 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 6 | 5% | 10 |
| stelo.WangRobot 1.0 | 5 | 4% | 7 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 91.2 | 212 / 280 | 1.80 | 20.6% | 46562 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 20.6% | 212 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.1 | 14.6% | 21 |
| mld.Infinity 2.2 | 2.9 | 13.6% | 29 |
| krillr.mini.JointStrike 2.0.0 | 4.4 | 11.2% | 6 |
| erdnis.Rover 0.3 | 4.8 | 10.8% | 7 |
| patson.PatsonTestBot 1.0 | 6.4 | 8.0% | 2 |
| mbh.Mbh 0.1 | 7.0 | 7.2% | 0 |
| pac.ABC 2.1 | 7.6 | 6.8% | 3 |
| pbg.R2D2 1.0 | 8.9 | 5.9% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 96.2 | 29 / 35 | 6219 |
| 2 | 1 | 70.5 | 87.3 | 22 / 35 | 5754 |
| 3 | 1 | 71.2 | 91.7 | 27 / 35 | 5572 |
| 4 | 1 | 71.4 | 90.2 | 25 / 35 | 6185 |
| 5 | 1 | 69.5 | 84.1 | 25 / 35 | 5244 |
| 6 | 1 | 71.3 | 91.1 | 27 / 35 | 5687 |
| 7 | 1 | 72.2 | 95.6 | 28 / 35 | 5718 |
| 8 | 1 | 72.4 | 93.0 | 29 / 35 | 6183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 113 | 90% |
| mld.Infinity 2.2 | 83 | 86% |
| erdnis.Rover 0.3 | 18 | 100% |
| krillr.mini.JointStrike 2.0.0 | 16 | 81% |
| pbg.R2D2 1.0 | 3 | 100% |
| pac.ABC 2.1 | 3 | 100% |
| patson.PatsonTestBot 1.0 | 2 | 100% |

Hadur died in 68 of 280 rounds, at a mean tick of 1065. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 20 | 29% | 27 |
| davidalves.net.DuelistMiniMelee 1.2 | 17 | 25% | 131 |
| krillr.mini.JointStrike 2.0.0 | 9 | 13% | 29 |
| erdnis.Rover 0.3 | 9 | 13% | 27 |
| pac.ABC 2.1 | 6 | 9% | 15 |
| patson.PatsonTestBot 1.0 | 4 | 6% | 21 |
| mbh.Mbh 0.1 | 2 | 3% | 14 |
| pbg.R2D2 1.0 | 1 | 1% | 14 |

## Melee bench: F20

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.9 | 150 / 280 | 2.18 | 19.3% | 44635 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.1 | 19.3% | 150 |
| trm.Wrekt 1.1.6.f | 1.9 | 15.1% | 61 |
| fwb.Nine 1.0.1 | 3.3 | 11.5% | 34 |
| nz.jdc.nano.GridFu 1.0 | 4.4 | 10.4% | 6 |
| catcat20.Rabbit 0.001 | 4.6 | 9.9% | 17 |
| bayen.nut.Squirrel 1.615 | 6.4 | 8.3% | 10 |
| m3thos.mini.Eva01 0.5.5 | 6.8 | 8.0% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 7.5% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.9 | 5.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 82.2 | 15 / 35 | 5150 |
| 2 | 1 | 70.2 | 91.4 | 21 / 35 | 5561 |
| 3 | 1 | 70.0 | 87.6 | 23 / 35 | 6060 |
| 4 | 1 | 69.7 | 87.9 | 22 / 35 | 5571 |
| 5 | 1 | 70.6 | 89.5 | 24 / 35 | 5838 |
| 6 | 1 | 68.8 | 85.4 | 17 / 35 | 5854 |
| 7 | 2 | 66.9 | 81.3 | 12 / 35 | 5299 |
| 8 | 1 | 69.3 | 90.2 | 16 / 35 | 5302 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 99 | 65% |
| fwb.Nine 1.0.1 | 49 | 55% |
| catcat20.Rabbit 0.001 | 31 | 68% |
| nz.jdc.nano.GridFu 1.0 | 17 | 88% |
| bayen.nut.Squirrel 1.615 | 12 | 75% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |
| m3thos.mini.Eva01 0.5.5 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 130 of 280 rounds, at a mean tick of 1238. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 59 | 45% | 105 |
| fwb.Nine 1.0.1 | 31 | 24% | 42 |
| catcat20.Rabbit 0.001 | 16 | 12% | 44 |
| nz.jdc.nano.GridFu 1.0 | 12 | 9% | 38 |
| bayen.nut.Squirrel 1.615 | 6 | 5% | 18 |
| ntc.ControlledChaos 1.1.4 | 3 | 2% | 4 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 14 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 6 |

## Melee bench: F21

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 84.2 | 119 / 280 | 2.43 | 18.6% | 44179 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.1 | 18.6% | 119 |
| eem.EvBot v4.6.16 | 1.9 | 16.9% | 132 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.8% | 10 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 10 |
| eld.Hmm 1.0 | 5.5 | 8.1% | 7 |
| oa.weak.BotherBot 0.1 | 5.6 | 7.9% | 1 |
| el.JumpShoot 0.2 | 7.5 | 6.6% | 1 |
| fire219.CatBot 1.0 | 7.9 | 6.4% | 0 |
| PSW.Relentless 0.1 | 8.6 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 85.4 | 17 / 35 | 5300 |
| 2 | 1 | 70.2 | 89.8 | 18 / 35 | 5468 |
| 3 | 1 | 68.1 | 82.2 | 18 / 35 | 5482 |
| 4 | 1 | 68.6 | 85.4 | 13 / 35 | 5689 |
| 5 | 1 | 69.3 | 83.5 | 18 / 35 | 5859 |
| 6 | 1 | 68.9 | 85.1 | 10 / 35 | 5912 |
| 7 | 1 | 67.8 | 85.1 | 14 / 35 | 5022 |
| 8 | 2 | 66.6 | 76.8 | 11 / 35 | 5447 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 136 | 37% |
| dummy.mini.Scimitar 1.01 | 36 | 92% |
| cf.RiO.RiOx 4.2.1 | 28 | 93% |
| eld.Hmm 1.0 | 8 | 88% |
| oa.weak.BotherBot 0.1 | 2 | 100% |
| el.JumpShoot 0.2 | 2 | 50% |

Hadur died in 161 of 280 rounds, at a mean tick of 1173. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 109 | 68% | 144 |
| dummy.mini.Scimitar 1.01 | 18 | 11% | 54 |
| PSW.Relentless 0.1 | 8 | 5% | 8 |
| oa.weak.BotherBot 0.1 | 7 | 4% | 11 |
| eld.Hmm 1.0 | 6 | 4% | 27 |
| cf.RiO.RiOx 4.2.1 | 4 | 2% | 21 |
| el.JumpShoot 0.2 | 4 | 2% | 6 |
| fire219.CatBot 1.0 | 3 | 2% | 2 |
| arthord.MannyPacquiao Beta | 2 | 1% | 5 |

## Melee bench: F23

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 77.7 | 108 / 280 | 3.01 | 17.9% | 45342 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.5 | 17.9% | 108 |
| pe.SandboxLump 1.52 | 1.5 | 18.0% | 114 |
| cre.Karolos 0.32 | 3.0 | 13.5% | 33 |
| stelo.RamTrackSurfer 1.2 | 4.8 | 9.8% | 9 |
| stelo.AreaTargetingBot 1.1 | 5.4 | 9.4% | 9 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.4% | 4 |
| cw.megas.Blade 0.8 | 6.5 | 8.6% | 1 |
| sample.Walls 1.0 | 7.9 | 7.9% | 2 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.9% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 83.5 | 16 / 35 | 5730 |
| 2 | 1 | 68.7 | 79.4 | 13 / 35 | 5537 |
| 3 | 2 | 67.0 | 74.0 | 16 / 35 | 5264 |
| 4 | 2 | 66.2 | 72.4 | 11 / 35 | 5752 |
| 5 | 1 | 68.9 | 80.6 | 15 / 35 | 5754 |
| 6 | 2 | 69.0 | 79.7 | 10 / 35 | 6221 |
| 7 | 1 | 67.6 | 73.7 | 14 / 35 | 5587 |
| 8 | 2 | 68.2 | 78.4 | 13 / 35 | 5497 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 114 | 47% |
| cre.Karolos 0.32 | 34 | 74% |
| stelo.AreaTargetingBot 1.1 | 17 | 82% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 78% |
| sample.Walls 1.0 | 4 | 100% |
| stelo.RamTrackSurfer 1.2 | 4 | 75% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 172 of 280 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 93 | 54% | 144 |
| cre.Karolos 0.32 | 33 | 19% | 59 |
| stelo.AreaTargetingBot 1.1 | 15 | 9% | 25 |
| cw.megas.Blade 0.8 | 11 | 6% | 11 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 5% | 16 |
| stelo.RamTrackSurfer 1.2 | 8 | 5% | 15 |
| sample.Walls 1.0 | 2 | 1% | 6 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F24

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 71.7 | 64 / 280 | 3.54 | 14.6% | 31065 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.6 | 14.6% | 64 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.0% | 65 |
| davidalves.Phoenix 0.54 | 3.1 | 13.3% | 65 |
| florent.XSeries.X2 0.12 | 3.3 | 13.2% | 48 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.0% | 21 |
| oog.melee.Corsair 1.0 | 6.0 | 9.2% | 8 |
| stelo.SoJNanoMelee 1.1 | 7.3 | 7.2% | 7 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.8% | 2 |
| as.FrankTheTank 1.3 | 9.3 | 5.7% | 1 |
| evd.X1 0.01 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 74.6 | 8 / 35 | 3994 |
| 2 | 2 | 61.4 | 71.4 | 9 / 35 | 3668 |
| 3 | 1 | 61.7 | 73.0 | 9 / 35 | 3774 |
| 4 | 1 | 62.4 | 72.1 | 9 / 35 | 4195 |
| 5 | 3 | 59.1 | 64.4 | 8 / 35 | 3511 |
| 6 | 1 | 63.3 | 74.6 | 8 / 35 | 4089 |
| 7 | 1 | 63.0 | 73.7 | 10 / 35 | 4077 |
| 8 | 3 | 60.7 | 70.2 | 3 / 35 | 3757 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 40 | 30% |
| rz.GlowBlowMelee 1.4 | 36 | 42% |
| pedersen.Ugluk 1.1.1 | 26 | 65% |
| florent.XSeries.X2 0.12 | 25 | 32% |
| stelo.SoJNanoMelee 1.1 | 7 | 100% |
| as.FrankTheTank 1.3 | 3 | 100% |
| oog.melee.Corsair 1.0 | 3 | 67% |

Hadur died in 217 of 280 rounds, at a mean tick of 728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 57 | 26% | 69 |
| rz.GlowBlowMelee 1.4 | 49 | 23% | 66 |
| davidalves.Phoenix 0.54 | 49 | 23% | 59 |
| pedersen.Ugluk 1.1.1 | 27 | 12% | 34 |
| oog.melee.Corsair 1.0 | 10 | 5% | 20 |
| as.FrankTheTank 1.3 | 8 | 4% | 10 |
| evd.X1 0.01 | 8 | 4% | 8 |
| stelo.SoJNanoMelee 1.1 | 5 | 2% | 10 |
| lunchie.Lunchbox 0.93 | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.6 | 170 / 280 | 2.65 | 18.1% | 35180 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 18.1% | 170 |
| voidious.mini.BrokenSword 2.0.3 | 2.6 | 12.7% | 24 |
| jdw.Hurricane 1.4 | 3.3 | 11.8% | 32 |
| voidious.micro.BlitzBat 1.05 | 3.4 | 12.0% | 24 |
| gre.svman4.Morfeas 1.4.1 | 4.9 | 9.8% | 13 |
| ds.Oo 2.2 | 6.6 | 8.6% | 10 |
| gjr.Cephalosporin 0.1 | 6.8 | 8.2% | 9 |
| awesomeness.Elite 1.0 | 7.8 | 7.4% | 0 |
| adt.Ar2 1.1 | 8.8 | 6.8% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 86.0 | 20 / 35 | 4569 |
| 2 | 1 | 66.1 | 77.8 | 22 / 35 | 4234 |
| 3 | 1 | 67.3 | 81.6 | 22 / 35 | 4215 |
| 4 | 1 | 68.0 | 83.8 | 24 / 35 | 4388 |
| 5 | 1 | 67.7 | 82.5 | 21 / 35 | 4636 |
| 6 | 1 | 66.0 | 78.7 | 20 / 35 | 4292 |
| 7 | 1 | 67.4 | 84.1 | 21 / 35 | 4441 |
| 8 | 1 | 66.4 | 78.4 | 20 / 35 | 4405 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 54 | 87% |
| voidious.mini.BrokenSword 2.0.3 | 48 | 90% |
| jdw.Hurricane 1.4 | 35 | 80% |
| ds.Oo 2.2 | 18 | 94% |
| gre.svman4.Morfeas 1.4.1 | 13 | 69% |
| awesomeness.Elite 1.0 | 10 | 100% |
| gjr.Cephalosporin 0.1 | 10 | 100% |
| adt.Ar2 1.1 | 5 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 110 of 280 rounds, at a mean tick of 541. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 22% | 64 |
| voidious.mini.BrokenSword 2.0.3 | 22 | 20% | 67 |
| jdw.Hurricane 1.4 | 20 | 18% | 47 |
| gre.svman4.Morfeas 1.4.1 | 12 | 11% | 21 |
| ds.Oo 2.2 | 11 | 10% | 30 |
| adt.Ar2 1.1 | 7 | 6% | 11 |
| gjr.Cephalosporin 0.1 | 6 | 5% | 20 |
| awesomeness.Elite 1.0 | 4 | 4% | 15 |
| amk.ChumbaMini 0.2 | 4 | 4% | 5 |

## Melee bench: F26

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.8 | 117 / 280 | 2.46 | 18.1% | 44873 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.1 | 18.1% | 117 |
| ak.Fermat 2.0 | 2.0 | 15.8% | 88 |
| lrem.Spectre 0.4.4 | 3.4 | 12.0% | 25 |
| shu.nitro.LENIN .T34 | 3.8 | 11.6% | 32 |
| js.PinBall 1.6 | 5.5 | 10.3% | 10 |
| gh.mini.GrubbmOne 1.0 | 5.8 | 9.8% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.5 | 9.0% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.6% | 3 |
| sample.SpinBot 1.0 | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 87.0 | 19 / 35 | 5965 |
| 2 | 1 | 68.9 | 87.3 | 17 / 35 | 5807 |
| 3 | 1 | 68.0 | 84.1 | 11 / 35 | 5544 |
| 4 | 1 | 66.1 | 77.1 | 14 / 35 | 5200 |
| 5 | 1 | 69.4 | 89.2 | 14 / 35 | 5818 |
| 6 | 1 | 67.1 | 80.6 | 13 / 35 | 5504 |
| 7 | 2 | 68.1 | 84.1 | 13 / 35 | 5569 |
| 8 | 1 | 67.4 | 80.6 | 16 / 35 | 5466 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 83 | 37% |
| shu.nitro.LENIN .T34 | 51 | 67% |
| lrem.Spectre 0.4.4 | 38 | 71% |
| js.PinBall 1.6 | 11 | 73% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 67% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 164 of 280 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 83 | 51% | 110 |
| shu.nitro.LENIN .T34 | 29 | 18% | 66 |
| lrem.Spectre 0.4.4 | 17 | 10% | 37 |
| js.PinBall 1.6 | 16 | 10% | 26 |
| fullsail.LaxativeTeaTwo 1.0 | 7 | 4% | 13 |
| jaybot.adv.bots.JayBot 2.0 | 6 | 4% | 13 |
| gh.mini.GrubbmOne 1.0 | 4 | 2% | 11 |
| sample.SpinBot 1.0 | 2 | 1% | 3 |

## Melee bench: F27

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 79.8 | 168 / 280 | 2.82 | 17.6% | 35928 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.5 | 17.6% | 168 |
| mk.Alpha 0.2.1 | 1.9 | 14.0% | 72 |
| wee.Gem 1.8.4 | 3.8 | 10.9% | 14 |
| EH.Eagle 1.0.6 | 4.0 | 10.5% | 6 |
| sheldor.melee.nano.TestMelee 0.1 | 4.9 | 10.3% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 6.6 | 8.9% | 3 |
| joe.ADinosaur 1.0 | 7.1 | 8.1% | 0 |
| throxbot.ThroxBot 0.1 | 7.1 | 8.3% | 5 |
| caimano.Furia_Ceca 0.22 | 9.0 | 5.9% | 0 |
| cs.Grudge 1.0 | 9.1 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.2 | 41.6 | 8 / 35 | 3670 |
| 2 | 1 | 67.4 | 84.4 | 23 / 35 | 4536 |
| 3 | 1 | 68.6 | 87.9 | 24 / 35 | 4594 |
| 4 | 1 | 66.9 | 81.3 | 21 / 35 | 4525 |
| 5 | 1 | 67.2 | 82.9 | 22 / 35 | 4388 |
| 6 | 1 | 68.9 | 88.6 | 27 / 35 | 4665 |
| 7 | 1 | 65.5 | 80.3 | 16 / 35 | 4325 |
| 8 | 1 | 70.1 | 91.1 | 27 / 35 | 5225 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 91 | 71% |
| wee.Gem 1.8.4 | 35 | 97% |
| EH.Eagle 1.0.6 | 30 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 94% |
| throxbot.ThroxBot 0.1 | 11 | 91% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 100% |
| joe.ADinosaur 1.0 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 113 of 280 rounds, at a mean tick of 579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 42 | 37% | 111 |
| joe.ADinosaur 1.0 | 22 | 19% | 29 |
| cs.Grudge 1.0 | 13 | 12% | 16 |
| wee.Gem 1.8.4 | 10 | 9% | 38 |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 5% | 21 |
| EH.Eagle 1.0.6 | 5 | 4% | 29 |
| techdude.kombat.FlamingKombat 1.5 | 5 | 4% | 13 |
| throxbot.ThroxBot 0.1 | 5 | 4% | 13 |
| caimano.Furia_Ceca 0.22 | 5 | 4% | 9 |

## Melee bench: F28

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 85.4 | 171 / 280 | 2.31 | 18.1% | 33053 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.1 | 18.1% | 171 |
| kid.test.NightFox .2 | 1.9 | 14.8% | 41 |
| uji.Antique 1.0 | 3.6 | 11.6% | 27 |
| qohnil.blot.BlotBot 3.61 | 3.9 | 11.2% | 25 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.3% | 5 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.3% | 2 |
| ahr.ice.Ice 1.0.2 | 6.9 | 8.0% | 5 |
| matt.advanced.Katana 1.0 | 8.1 | 6.7% | 3 |
| stelo.PianistNano 1.2 | 9.0 | 5.8% | 1 |
| stelo.Lifestealer 1.0 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 87.0 | 24 / 35 | 3940 |
| 2 | 1 | 65.4 | 79.0 | 18 / 35 | 4201 |
| 3 | 1 | 67.7 | 87.6 | 19 / 35 | 4287 |
| 4 | 1 | 67.9 | 86.7 | 22 / 35 | 4395 |
| 5 | 2 | 63.5 | 74.3 | 15 / 35 | 3804 |
| 6 | 1 | 69.3 | 92.4 | 25 / 35 | 4202 |
| 7 | 1 | 69.0 | 91.1 | 25 / 35 | 4222 |
| 8 | 1 | 67.6 | 85.4 | 23 / 35 | 4002 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 106 | 81% |
| uji.Antique 1.0 | 51 | 86% |
| qohnil.blot.BlotBot 3.61 | 26 | 50% |
| amk.ChumbaWumba 0.3 | 9 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 100% |
| matt.advanced.Katana 1.0 | 6 | 100% |
| ahr.ice.Ice 1.0.2 | 4 | 75% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 109 of 280 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 28 | 26% | 98 |
| qohnil.blot.BlotBot 3.61 | 22 | 20% | 42 |
| uji.Antique 1.0 | 18 | 17% | 66 |
| pfvicm.Sobieski 7.2.3b | 16 | 15% | 27 |
| amk.ChumbaWumba 0.3 | 16 | 15% | 22 |
| stelo.Lifestealer 1.0 | 3 | 3% | 5 |
| stelo.PianistNano 1.2 | 3 | 3% | 4 |
| ahr.ice.Ice 1.0.2 | 2 | 2% | 5 |
| matt.advanced.Katana 1.0 | 1 | 1% | 8 |

## Melee bench: F29

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 77.4 | 89 / 280 | 3.03 | 16.7% | 36692 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.1 | 16.7% | 89 |
| zyx.mega.YersiniaPestis 3.1 | 2.0 | 15.4% | 92 |
| deewiant.Anomaly 0.2 | 2.9 | 14.3% | 63 |
| myl.micro.Troodon 1.10 | 4.0 | 12.0% | 14 |
| jok.PheonixM 0.1.2 | 5.3 | 10.0% | 8 |
| ph.melee.ArcherME 0.3 | 5.9 | 8.6% | 0 |
| DBall.Anarchy 0.1 | 7.3 | 7.0% | 7 |
| ap.Frederick 1.1 | 8.3 | 6.0% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 8.4 | 5.7% | 0 |
| jangs.ns51 1.0 | 10.0 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 74.6 | 9 / 35 | 4525 |
| 2 | 1 | 64.2 | 70.8 | 11 / 35 | 4723 |
| 3 | 1 | 67.8 | 82.5 | 15 / 35 | 4919 |
| 4 | 1 | 65.2 | 73.0 | 12 / 35 | 4684 |
| 5 | 1 | 65.6 | 80.3 | 10 / 35 | 4141 |
| 6 | 1 | 65.6 | 77.8 | 13 / 35 | 4328 |
| 7 | 1 | 67.5 | 82.5 | 12 / 35 | 4981 |
| 8 | 2 | 65.4 | 77.8 | 7 / 35 | 4391 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 72 | 51% |
| zyx.mega.YersiniaPestis 3.1 | 55 | 9% |
| myl.micro.Troodon 1.10 | 25 | 92% |
| jok.PheonixM 0.1.2 | 14 | 93% |
| DBall.Anarchy 0.1 | 8 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 191 of 280 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 81 | 42% | 86 |
| deewiant.Anomaly 0.2 | 74 | 39% | 109 |
| jok.PheonixM 0.1.2 | 12 | 6% | 26 |
| myl.micro.Troodon 1.10 | 10 | 5% | 32 |
| ph.melee.ArcherME 0.3 | 10 | 5% | 12 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 1% | 3 |
| DBall.Anarchy 0.1 | 1 | 1% | 9 |
| jangs.ns51 1.0 | 1 | 1% | 2 |

## Melee bench: F30

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.9 | 54.2 | 26 / 280 | 5.12 | 11.6% | 30728 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.3 | 14.6% | 84 |
| darkcanuck.B26354 1.06 | 2.3 | 13.7% | 69 |
| stelo.PastFuture 2.3.2 | 3.5 | 11.9% | 28 |
| oog.melee.Capulet 1.2 | 3.6 | 12.6% | 40 |
| hadur117.micro.SaorDC 0.1 | 4.4 | 11.6% | 26 |
| intruder.PrairieWolf 2.61 | 6.3 | 9.3% | 18 |
| fowl3628800.LightningBolt 2.6.0 | 7.6 | 7.9% | 12 |
| tripphippy.Alice 1.1 | 8.0 | 7.8% | 4 |
| ntc.Opposite 1.5 | 8.1 | 7.8% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.2 | 51.7 | 5 / 35 | 3964 |
| 2 | 4 | 56.8 | 57.8 | 5 / 35 | 3771 |
| 3 | 5 | 57.0 | 56.8 | 6 / 35 | 3743 |
| 4 | 5 | 52.8 | 46.7 | 1 / 35 | 3751 |
| 5 | 5 | 56.7 | 57.5 | 2 / 35 | 3948 |
| 6 | 3 | 57.8 | 58.7 | 2 / 35 | 4124 |
| 7 | 4 | 55.4 | 55.2 | 1 / 35 | 3692 |
| 8 | 4 | 54.3 | 49.2 | 4 / 35 | 3735 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 24 | 17% |
| darkcanuck.B26354 1.06 | 15 | 13% |
| oog.melee.Capulet 1.2 | 13 | 46% |
| intruder.PrairieWolf 2.61 | 9 | 67% |
| stelo.PastFuture 2.3.2 | 5 | 60% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 50% |
| tripphippy.Alice 1.1 | 3 | 67% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 255 of 280 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 74 | 29% | 78 |
| oog.melee.Capulet 1.2 | 53 | 21% | 60 |
| darkcanuck.B26354 1.06 | 49 | 19% | 51 |
| stelo.PastFuture 2.3.2 | 28 | 11% | 34 |
| tripphippy.Alice 1.1 | 13 | 5% | 15 |
| fowl3628800.LightningBolt 2.6.0 | 11 | 4% | 11 |
| intruder.PrairieWolf 2.61 | 10 | 4% | 14 |
| ntc.Opposite 1.5 | 9 | 4% | 10 |
| GarmBox.Anger 1.0 | 7 | 3% | 7 |
1 death(s) with no robot to name.

## Melee bench: F31

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 72.6 | 49 / 280 | 3.47 | 14.6% | 30662 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.6% | 153 |
| hadur117.micro.SaorDC 0.1 | 2.3 | 14.6% | 49 |
| gh.mini.Griezel 0.2 | 2.8 | 13.7% | 57 |
| d414.nano.Quantum 1.0.0 | 4.4 | 10.7% | 7 |
| spinnercat.micro.Tyger 0.1 | 4.6 | 10.3% | 9 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.9% | 3 |
| timmit.nano.TimDog 0.33 | 7.4 | 6.8% | 0 |
| fm.mammillarias 1.3 | 7.9 | 6.3% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.4 | 5.1% | 1 |
| tlp.ThreeLeggedPig 1 | 9.4 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 72.7 | 6 / 35 | 4034 |
| 2 | 2 | 61.9 | 70.5 | 9 / 35 | 3785 |
| 3 | 3 | 61.4 | 69.8 | 6 / 35 | 3646 |
| 4 | 2 | 62.0 | 72.7 | 7 / 35 | 3625 |
| 5 | 2 | 61.8 | 73.3 | 3 / 35 | 3630 |
| 6 | 3 | 61.9 | 71.1 | 6 / 35 | 3859 |
| 7 | 2 | 62.2 | 71.4 | 4 / 35 | 4204 |
| 8 | 2 | 64.2 | 79.0 | 8 / 35 | 3879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 57 | 14% |
| gh.mini.Griezel 0.2 | 36 | 44% |
| d414.nano.Quantum 1.0.0 | 12 | 83% |
| spinnercat.micro.Tyger 0.1 | 10 | 80% |
| gh.nano.Grofvuil 0.2 | 4 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |

Hadur died in 231 of 280 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 120 | 52% | 130 |
| gh.mini.Griezel 0.2 | 50 | 22% | 71 |
| spinnercat.micro.Tyger 0.1 | 14 | 6% | 19 |
| gh.nano.Grofvuil 0.2 | 13 | 6% | 16 |
| d414.nano.Quantum 1.0.0 | 11 | 5% | 18 |
| timmit.nano.TimDog 0.33 | 10 | 4% | 12 |
| fm.mammillarias 1.3 | 6 | 3% | 6 |
| Gecko.ultimateGeckoBot 1.0 | 5 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 3 |

## Melee bench: F32

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 74.9 | 100 / 280 | 3.26 | 16.1% | 37653 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.5 | 15.7% | 107 |
| hadur117.micro.SaorDC 0.1 | 1.5 | 16.1% | 100 |
| apc.botM 3.0 | 3.3 | 12.0% | 31 |
| vjik.UnViolation 1.1 | 4.1 | 11.3% | 22 |
| lxx.ConceptA 0.8 | 4.9 | 9.7% | 4 |
| bayen.UbaMicro 1.4 | 6.0 | 8.6% | 2 |
| yk.JahMicro 1.0 | 7.8 | 7.1% | 7 |
| panzer.Panzer 0.2 | 8.1 | 7.1% | 0 |
| conscience.Electron 1.3g | 8.5 | 6.5% | 2 |
| donjezza.Jezza 1.0 | 9.4 | 5.8% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 73.7 | 12 / 35 | 4714 |
| 2 | 1 | 62.5 | 69.2 | 16 / 35 | 4229 |
| 3 | 2 | 65.8 | 84.8 | 11 / 35 | 4552 |
| 4 | 1 | 64.2 | 75.6 | 14 / 35 | 4418 |
| 5 | 2 | 62.6 | 71.4 | 10 / 35 | 4613 |
| 6 | 2 | 64.4 | 73.7 | 11 / 35 | 4996 |
| 7 | 1 | 66.5 | 82.9 | 14 / 35 | 4995 |
| 8 | 1 | 63.4 | 68.3 | 12 / 35 | 5136 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 94 | 30% |
| apc.botM 3.0 | 30 | 67% |
| vjik.UnViolation 1.1 | 22 | 86% |
| yk.JahMicro 1.0 | 9 | 78% |
| lxx.ConceptA 0.8 | 9 | 100% |
| donjezza.Jezza 1.0 | 9 | 78% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| panzer.Panzer 0.2 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 181 of 280 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 82 | 45% | 107 |
| lxx.ConceptA 0.8 | 20 | 11% | 26 |
| apc.botM 3.0 | 19 | 10% | 44 |
| vjik.UnViolation 1.1 | 16 | 9% | 43 |
| conscience.Electron 1.3g | 16 | 9% | 19 |
| bayen.UbaMicro 1.4 | 15 | 8% | 17 |
| yk.JahMicro 1.0 | 6 | 3% | 12 |
| panzer.Panzer 0.2 | 5 | 3% | 6 |
| donjezza.Jezza 1.0 | 2 | 1% | 6 |

## Melee bench: F33

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 81.3 | 141 / 280 | 2.68 | 18.4% | 41985 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 18.4% | 141 |
| maribo.Quester 0.3 | 2.1 | 15.0% | 58 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.1 | 12.8% | 20 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 10.8% | 22 |
| labg.Cataclysm 2.05 | 4.6 | 10.5% | 25 |
| baal.nano.N 1.42 | 5.8 | 9.2% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.9 | 8.4% | 10 |
| zyx.micro.Ant 1.1 | 8.1 | 5.8% | 1 |
| sanja.First 0.1 | 9.0 | 4.9% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.9 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 82.5 | 19 / 35 | 5570 |
| 2 | 1 | 68.6 | 84.1 | 18 / 35 | 5208 |
| 3 | 1 | 66.7 | 77.1 | 16 / 35 | 4950 |
| 4 | 1 | 69.9 | 86.3 | 22 / 35 | 5545 |
| 5 | 1 | 68.8 | 85.7 | 19 / 35 | 5211 |
| 6 | 1 | 66.8 | 76.8 | 19 / 35 | 4922 |
| 7 | 1 | 67.7 | 79.7 | 15 / 35 | 5436 |
| 8 | 1 | 66.9 | 78.4 | 13 / 35 | 5143 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 72 | 64% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 58 | 91% |
| gre.svman4.Leonidas 1.3.2 | 32 | 84% |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 67% |
| labg.Cataclysm 2.05 | 9 | 33% |
| baal.nano.N 1.42 | 5 | 80% |
| zyx.micro.Ant 1.1 | 2 | 100% |

Hadur died in 141 of 280 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 62 | 44% | 115 |
| labg.Cataclysm 2.05 | 17 | 12% | 24 |
| kinsen.melee.Angsaichmophobia 1.8c | 17 | 12% | 20 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 10% | 61 |
| gre.svman4.Leonidas 1.3.2 | 13 | 9% | 34 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 8 | 6% | 11 |
| zyx.micro.Ant 1.1 | 6 | 4% | 6 |
| baal.nano.N 1.42 | 3 | 2% | 6 |
| sanja.First 0.1 | 1 | 1% | 3 |

## Melee bench: F34

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 76.2 | 52 / 280 | 3.14 | 15.8% | 38009 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.3 | 17.3% | 91 |
| stelo.Spread 0.9 | 2.3 | 16.2% | 106 |
| hadur117.micro.SaorDC 0.1 | 2.5 | 15.8% | 52 |
| jcs.Seth 1.8 | 4.3 | 11.0% | 17 |
| cli.Dancer 1.1 | 5.4 | 10.2% | 5 |
| tcf.Reach 3 | 5.4 | 10.2% | 7 |
| ratosh.Wesco 1.4 | 7.0 | 7.2% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.3% | 0 |
| sample.VelociRobot 1.0 | 9.4 | 3.6% | 0 |
| sample.RamFire 1.0 | 9.6 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.0 | 77.8 | 6 / 35 | 4537 |
| 2 | 3 | 66.1 | 78.1 | 8 / 35 | 4850 |
| 3 | 3 | 62.1 | 71.1 | 4 / 35 | 4027 |
| 4 | 3 | 65.1 | 76.8 | 6 / 35 | 4647 |
| 5 | 1 | 67.2 | 82.5 | 11 / 35 | 5118 |
| 6 | 3 | 62.5 | 68.3 | 2 / 35 | 4560 |
| 7 | 2 | 65.8 | 79.0 | 7 / 35 | 4666 |
| 8 | 2 | 66.8 | 76.2 | 8 / 35 | 5604 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 61 | 23% |
| stelo.Spread 0.9 | 49 | 31% |
| jcs.Seth 1.8 | 19 | 74% |
| cli.Dancer 1.1 | 6 | 50% |
| tcf.Reach 3 | 3 | 67% |
| ratosh.Wesco 1.4 | 3 | 67% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 228 of 280 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 98 | 43% | 106 |
| stelo.Spread 0.9 | 73 | 32% | 86 |
| jcs.Seth 1.8 | 20 | 9% | 34 |
| tcf.Reach 3 | 15 | 7% | 21 |
| cli.Dancer 1.1 | 11 | 5% | 20 |
| ratosh.Wesco 1.4 | 7 | 3% | 9 |
| sample.RamFire 1.0 | 3 | 1% | 3 |
| sample.VelociRobot 1.0 | 1 | 0% | 1 |

## Melee bench: F35

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 70.5 | 23 / 280 | 3.65 | 13.7% | 28336 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.1% | 210 |
| hadur117.micro.SaorDC 0.1 | 2.6 | 13.7% | 23 |
| gh.mini.Gruwel 0.9 | 2.8 | 13.1% | 30 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.1% | 13 |
| rz.HawkOnFire 0.1 | 4.9 | 11.1% | 4 |
| myl.nano.KomoriNinja 1.1 | 6.5 | 7.1% | 0 |
| wit.Chuliath 1.0 | 7.0 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 5.8% | 0 |
| dans.Cinnamon 1.2 | 9.1 | 5.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.4 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 75.6 | 6 / 35 | 3690 |
| 2 | 2 | 59.6 | 67.0 | 3 / 35 | 3462 |
| 3 | 2 | 61.5 | 70.8 | 3 / 35 | 3767 |
| 4 | 4 | 58.3 | 61.6 | 0 / 35 | 3303 |
| 5 | 3 | 62.5 | 75.2 | 4 / 35 | 3564 |
| 6 | 2 | 61.8 | 75.2 | 2 / 35 | 3436 |
| 7 | 2 | 61.6 | 72.7 | 3 / 35 | 3500 |
| 8 | 4 | 59.5 | 66.0 | 2 / 35 | 3614 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 49 | 8% |
| gh.mini.Gruwel 0.9 | 21 | 19% |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 73% |
| rz.HawkOnFire 0.1 | 6 | 83% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 257 of 280 rounds, at a mean tick of 718. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 149 | 58% | 154 |
| gh.mini.Gruwel 0.9 | 45 | 18% | 52 |
| dmh.robocode.robot.BlackDeath 9.2 | 25 | 10% | 30 |
| rz.HawkOnFire 0.1 | 15 | 6% | 18 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7 | 3% | 7 |
| wit.Chuliath 1.0 | 5 | 2% | 7 |
| myl.nano.KomoriNinja 1.1 | 5 | 2% | 6 |
| stelo.MyAgileRobot 0.2 | 3 | 1% | 3 |
| dans.Cinnamon 1.2 | 3 | 1% | 3 |

## Melee bench: F36

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 88.2 | 204 / 280 | 2.06 | 20.3% | 45354 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 20.3% | 204 |
| bzdp.Pansy 2.1 | 2.6 | 12.2% | 12 |
| alpha.RainingFire 1.0 | 2.8 | 12.0% | 19 |
| mz.Cork 0.1 | 4.3 | 10.8% | 14 |
| bvh.micro.Freya 0.3 | 4.6 | 10.5% | 12 |
| bvh.mini.Fenrir 0.39 | 6.4 | 9.1% | 7 |
| m3thos.Eva02 0.7.1 | 6.4 | 9.1% | 8 |
| squidM.TentalceMeleeNano 1.1 | 8.1 | 6.4% | 0 |
| sample.MyFirstRobot 1.0 | 9.4 | 4.7% | 3 |
| dl.BetterWalls 1.0 | 9.5 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 91.7 | 26 / 35 | 5423 |
| 2 | 1 | 70.4 | 87.3 | 26 / 35 | 5693 |
| 3 | 1 | 68.9 | 84.1 | 21 / 35 | 5486 |
| 4 | 1 | 71.3 | 91.7 | 27 / 35 | 6045 |
| 5 | 1 | 70.6 | 89.8 | 27 / 35 | 5572 |
| 6 | 1 | 71.0 | 89.5 | 28 / 35 | 5832 |
| 7 | 1 | 70.0 | 86.7 | 25 / 35 | 5411 |
| 8 | 1 | 69.9 | 84.8 | 24 / 35 | 5892 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 71 | 97% |
| bvh.micro.Freya 0.3 | 37 | 92% |
| bvh.mini.Fenrir 0.39 | 35 | 91% |
| alpha.RainingFire 1.0 | 33 | 85% |
| mz.Cork 0.1 | 25 | 80% |
| sample.MyFirstRobot 1.0 | 11 | 91% |
| m3thos.Eva02 0.7.1 | 11 | 91% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 76 of 280 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.mini.Fenrir 0.39 | 17 | 22% | 31 |
| alpha.RainingFire 1.0 | 16 | 21% | 48 |
| mz.Cork 0.1 | 13 | 17% | 42 |
| bzdp.Pansy 2.1 | 8 | 11% | 77 |
| m3thos.Eva02 0.7.1 | 7 | 9% | 27 |
| dl.BetterWalls 1.0 | 7 | 9% | 10 |
| bvh.micro.Freya 0.3 | 5 | 7% | 29 |
| sample.MyFirstRobot 1.0 | 3 | 4% | 11 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 5 |

## Melee bench: F37

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 75.5 | 156 / 280 | 3.21 | 17.2% | 42862 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 17.2% | 156 |
| germ.TheMind .2 | 2.4 | 11.0% | 17 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.9 | 10.1% | 22 |
| EBBU.Sim2 1.02 | 4.1 | 10.1% | 10 |
| agrach.Dalek 1.0 | 5.4 | 9.5% | 25 |
| mb.Beast 0.1 | 6.5 | 8.9% | 15 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.9% | 14 |
| lmk.ACPFinal 0.1 | 7.3 | 8.5% | 12 |
| skm.Ryubot 1.0 | 8.5 | 8.0% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 9.0 | 7.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 81.6 | 24 / 35 | 5666 |
| 2 | 1 | 65.5 | 78.1 | 16 / 35 | 5416 |
| 3 | 1 | 65.9 | 77.1 | 20 / 35 | 5491 |
| 4 | 1 | 60.4 | 61.6 | 16 / 35 | 4687 |
| 5 | 1 | 65.2 | 76.2 | 19 / 35 | 5262 |
| 6 | 1 | 64.1 | 71.4 | 18 / 35 | 5181 |
| 7 | 1 | 68.4 | 85.1 | 24 / 35 | 5911 |
| 8 | 1 | 64.7 | 72.7 | 19 / 35 | 5248 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 45 | 93% |
| stelo.UntouchableNano 1.3 | 30 | 93% |
| skm.Ryubot 1.0 | 22 | 95% |
| mb.Beast 0.1 | 18 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 17 | 82% |
| EBBU.Sim2 1.02 | 16 | 94% |
| agrach.Dalek 1.0 | 13 | 69% |
| lmk.ACPFinal 0.1 | 9 | 100% |

Hadur died in 124 of 280 rounds, at a mean tick of 340. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 28 | 23% | 54 |
| mn.nano.perceptual.Impact 1.3.0 | 24 | 19% | 25 |
| com.syncleus.robocode.Dreadnaught 0.1 | 17 | 14% | 43 |
| EBBU.Sim2 1.02 | 14 | 11% | 31 |
| germ.TheMind .2 | 13 | 10% | 42 |
| lmk.ACPFinal 0.1 | 11 | 9% | 21 |
| stelo.UntouchableNano 1.3 | 8 | 6% | 20 |
| mb.Beast 0.1 | 5 | 4% | 23 |
| skm.Ryubot 1.0 | 4 | 3% | 14 |

## Melee bench: F38

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 72.5 | 66 / 280 | 3.47 | 15.1% | 34467 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.1 | 17.8% | 143 |
| hadur117.micro.SaorDC 0.1 | 1.9 | 15.1% | 66 |
| bvh.mini.Freya 0.55 | 3.1 | 13.0% | 23 |
| bts.mega.Gnarly 1.4 | 4.5 | 10.9% | 25 |
| cs.Wren 1.0 | 4.8 | 10.5% | 12 |
| kdf.KoulDestroyer 1.0 | 5.9 | 9.4% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 8.4% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.4 | 5.7% | 3 |
| bzdp.BoxCar 2.0 | 9.3 | 4.6% | 0 |
| matt.UnderDark3 2.4.34 | 9.4 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 75.9 | 9 / 35 | 4463 |
| 2 | 1 | 65.9 | 82.2 | 12 / 35 | 4564 |
| 3 | 2 | 62.0 | 68.3 | 8 / 35 | 4341 |
| 4 | 2 | 62.0 | 64.8 | 10 / 35 | 4181 |
| 5 | 2 | 61.6 | 69.2 | 7 / 35 | 4107 |
| 6 | 2 | 62.7 | 72.4 | 9 / 35 | 4120 |
| 7 | 2 | 63.5 | 73.7 | 6 / 35 | 4214 |
| 8 | 2 | 63.8 | 74.0 | 5 / 35 | 4477 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 77 | 16% |
| bvh.mini.Freya 0.55 | 22 | 86% |
| bts.mega.Gnarly 1.4 | 15 | 53% |
| cs.Wren 1.0 | 13 | 85% |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 100% |
| kdf.KoulDestroyer 1.0 | 7 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 214 of 280 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 120 | 56% | 138 |
| bvh.mini.Freya 0.55 | 25 | 12% | 34 |
| bts.mega.Gnarly 1.4 | 21 | 10% | 35 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 7% | 24 |
| kdf.KoulDestroyer 1.0 | 13 | 6% | 17 |
| cs.Wren 1.0 | 12 | 6% | 19 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 2% | 7 |
| bzdp.BoxCar 2.0 | 3 | 1% | 3 |
| matt.UnderDark3 2.4.34 | 1 | 0% | 2 |

## Melee bench: F39

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 78.0 | 85 / 280 | 2.98 | 16.9% | 41610 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 16.9% | 85 |
| bvh.fry.Freya 0.82 | 2.1 | 14.6% | 37 |
| az.Ololobot 0.2.4 | 2.9 | 13.5% | 96 |
| catcat20.Lambda 0.024 | 4.1 | 10.5% | 34 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.7% | 5 |
| gimp.GimpBot 0.1 | 6.3 | 8.4% | 4 |
| apollokidd.ApolloKidd 0.9 | 6.5 | 8.1% | 3 |
| stelo.SoRobotNanoMelee 1.2 | 7.5 | 7.5% | 14 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.1 | 6.1% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 83.8 | 9 / 35 | 5499 |
| 2 | 1 | 66.2 | 81.9 | 11 / 35 | 5223 |
| 3 | 1 | 67.0 | 82.2 | 12 / 35 | 5566 |
| 4 | 1 | 62.7 | 70.8 | 10 / 35 | 4777 |
| 5 | 1 | 64.5 | 74.3 | 8 / 35 | 5092 |
| 6 | 1 | 66.1 | 81.9 | 10 / 35 | 5228 |
| 7 | 1 | 63.1 | 67.9 | 12 / 35 | 4958 |
| 8 | 1 | 66.5 | 81.3 | 13 / 35 | 5267 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 62 | 15% |
| bvh.fry.Freya 0.82 | 59 | 63% |
| catcat20.Lambda 0.024 | 28 | 57% |
| gimp.GimpBot 0.1 | 10 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 9 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 67% |
| winamp32.micro.MicroMacro 1.0 | 3 | 67% |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 0% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 195 of 280 rounds, at a mean tick of 1003. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 70 | 36% | 86 |
| bvh.fry.Freya 0.82 | 54 | 28% | 83 |
| catcat20.Lambda 0.024 | 25 | 13% | 37 |
| stelo.SoRobotNanoMelee 1.2 | 15 | 8% | 20 |
| apollokidd.ApolloKidd 0.9 | 12 | 6% | 16 |
| gimp.GimpBot 0.1 | 7 | 4% | 21 |
| winamp32.micro.MicroMacro 1.0 | 5 | 3% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 5 | 3% | 7 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 1% | 3 |

## Melee bench: F40

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 81.8 | 157 / 280 | 2.64 | 18.4% | 39284 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 18.4% | 157 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.6% | 62 |
| kano.gamma.KanoGamma 1.8 | 3.8 | 11.9% | 25 |
| mz.AntiGrav 1.0 | 3.9 | 11.4% | 14 |
| Polkwane.SmashMelee 1.0 | 4.6 | 10.7% | 10 |
| alpha.BlackIce 1.0 | 6.0 | 9.2% | 5 |
| stelo.Randomness 1.0 | 6.8 | 8.5% | 6 |
| amk.superstrike.SuperStrike 0.3 | 8.1 | 6.2% | 1 |
| testantiswapgun.AntiSwap 1.0 | 8.9 | 5.5% | 0 |
| sample.Corners 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 88.3 | 22 / 35 | 5107 |
| 2 | 1 | 69.5 | 84.8 | 23 / 35 | 5096 |
| 3 | 1 | 68.6 | 84.8 | 20 / 35 | 4703 |
| 4 | 1 | 68.1 | 83.2 | 20 / 35 | 4768 |
| 5 | 1 | 66.4 | 76.2 | 16 / 35 | 5280 |
| 6 | 1 | 66.5 | 77.8 | 18 / 35 | 4623 |
| 7 | 1 | 66.8 | 80.0 | 20 / 35 | 4510 |
| 8 | 1 | 67.7 | 79.7 | 18 / 35 | 5197 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 66 | 59% |
| kano.gamma.KanoGamma 1.8 | 43 | 77% |
| mz.AntiGrav 1.0 | 35 | 97% |
| Polkwane.SmashMelee 1.0 | 30 | 90% |
| alpha.BlackIce 1.0 | 11 | 100% |
| stelo.Randomness 1.0 | 9 | 89% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |

Hadur died in 124 of 280 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 40 | 32% | 69 |
| kano.gamma.KanoGamma 1.8 | 24 | 19% | 65 |
| mz.AntiGrav 1.0 | 18 | 15% | 48 |
| Polkwane.SmashMelee 1.0 | 12 | 10% | 30 |
| stelo.Randomness 1.0 | 9 | 7% | 22 |
| alpha.BlackIce 1.0 | 9 | 7% | 17 |
| amk.superstrike.SuperStrike 0.3 | 9 | 7% | 14 |
| testantiswapgun.AntiSwap 1.0 | 2 | 2% | 10 |
| sample.Corners 1.0 | 1 | 1% | 3 |

## Melee bench: F41

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 72.3 | 105 / 280 | 3.50 | 15.8% | 36164 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.4 | 16.5% | 122 |
| hadur117.micro.SaorDC 0.1 | 1.6 | 15.8% | 105 |
| ary.Swarm 1.1 | 3.4 | 13.2% | 21 |
| lessonz.robocode.Oz 0.5.0 | 3.6 | 12.3% | 20 |
| shrub.Silver v048 | 5.4 | 9.6% | 3 |
| simonton.nano.MeleeSeed 1.8 | 5.6 | 9.8% | 7 |
| zyx.nano.Ant 1.1 | 7.0 | 7.9% | 1 |
| jsal.Jsalbot 1.0 | 8.4 | 6.2% | 0 |
| stelo.Mirror 1.1 | 8.6 | 5.8% | 2 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 74.9 | 16 / 35 | 4770 |
| 2 | 2 | 63.7 | 69.2 | 12 / 35 | 4448 |
| 3 | 1 | 66.3 | 76.8 | 19 / 35 | 4476 |
| 4 | 2 | 61.9 | 65.1 | 7 / 35 | 4514 |
| 5 | 2 | 66.1 | 78.1 | 14 / 35 | 4440 |
| 6 | 1 | 64.1 | 70.5 | 14 / 35 | 4593 |
| 7 | 2 | 65.2 | 73.3 | 14 / 35 | 4842 |
| 8 | 2 | 62.9 | 70.2 | 9 / 35 | 4081 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 67 | 39% |
| ary.Swarm 1.1 | 36 | 86% |
| lessonz.robocode.Oz 0.5.0 | 30 | 83% |
| simonton.nano.MeleeSeed 1.8 | 17 | 100% |
| shrub.Silver v048 | 3 | 100% |
| stelo.Mirror 1.1 | 2 | 50% |
| jsal.Jsalbot 1.0 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 176 of 280 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 83 | 47% | 118 |
| ary.Swarm 1.1 | 27 | 15% | 57 |
| simonton.nano.MeleeSeed 1.8 | 23 | 13% | 40 |
| lessonz.robocode.Oz 0.5.0 | 16 | 9% | 26 |
| zyx.nano.Ant 1.1 | 12 | 7% | 13 |
| stelo.Mirror 1.1 | 6 | 3% | 7 |
| acogdev.alpha 0.2 | 5 | 3% | 6 |
| shrub.Silver v048 | 3 | 2% | 9 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |

## Melee bench: F42

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 78.9 | 68 / 280 | 2.90 | 16.9% | 43391 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.4 | 16.9% | 121 |
| hadur117.micro.SaorDC 0.1 | 1.6 | 16.9% | 68 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.4% | 34 |
| ara.Shera 0.88 | 3.8 | 12.9% | 43 |
| amz.NanoClone 1.41 | 5.1 | 9.1% | 3 |
| maribo.IotaCT 1.1 | 6.5 | 7.8% | 0 |
| dsw.StaticD 1.0 | 6.6 | 7.5% | 10 |
| stelo.MirrorMicro 1.0 | 8.4 | 5.8% | 1 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.9 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 78.4 | 6 / 35 | 5534 |
| 2 | 2 | 66.2 | 76.8 | 12 / 35 | 5034 |
| 3 | 2 | 65.6 | 77.5 | 5 / 35 | 5646 |
| 4 | 1 | 68.7 | 84.4 | 15 / 35 | 5923 |
| 5 | 2 | 65.5 | 77.1 | 9 / 35 | 5224 |
| 6 | 2 | 66.0 | 78.1 | 4 / 35 | 5726 |
| 7 | 2 | 64.5 | 75.9 | 8 / 35 | 4690 |
| 8 | 1 | 67.4 | 83.2 | 9 / 35 | 5614 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 67 | 28% |
| ara.Shera 0.88 | 42 | 62% |
| maribo.mini.MiniQuester 0.1 | 32 | 63% |
| dsw.StaticD 1.0 | 6 | 33% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 214 of 280 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 112 | 52% | 133 |
| ara.Shera 0.88 | 43 | 20% | 67 |
| maribo.mini.MiniQuester 0.1 | 32 | 15% | 47 |
| dsw.StaticD 1.0 | 11 | 5% | 15 |
| maribo.IotaCT 1.1 | 5 | 2% | 5 |
| amz.NanoClone 1.41 | 5 | 2% | 5 |
| mme.NikeEnhanced 2.0 | 3 | 1% | 3 |
| stelo.MirrorMicro 1.0 | 2 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 0% | 2 |

## Melee bench: F43

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 71.0 | 27 / 280 | 3.61 | 14.0% | 29906 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.6% | 222 |
| hadur117.micro.SaorDC 0.1 | 2.0 | 14.0% | 27 |
| brainfade.melee.Dusk 0.44 | 3.1 | 12.1% | 13 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.4% | 9 |
| wcsv.melee.EngineerMelee 0.1 | 4.6 | 10.8% | 8 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.4% | 1 |
| jab.DiamondStealer 5 | 7.1 | 8.3% | 0 |
| mz.NanoGod 2.02 | 7.9 | 7.5% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 67.0 | 4 / 35 | 3847 |
| 2 | 2 | 62.3 | 70.5 | 4 / 35 | 3376 |
| 3 | 2 | 61.4 | 70.5 | 2 / 35 | 3581 |
| 4 | 2 | 62.3 | 71.7 | 2 / 35 | 3758 |
| 5 | 2 | 63.3 | 72.7 | 4 / 35 | 3654 |
| 6 | 2 | 63.6 | 71.4 | 6 / 35 | 3951 |
| 7 | 2 | 64.4 | 76.5 | 2 / 35 | 4024 |
| 8 | 2 | 61.6 | 67.9 | 3 / 35 | 3715 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 81 | 1% |
| brainfade.melee.Dusk 0.44 | 21 | 71% |
| wcsv.melee.EngineerMelee 0.1 | 8 | 50% |
| dummy.micro.Sparrow 2.5 | 4 | 100% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 253 of 280 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 170 | 67% | 174 |
| brainfade.melee.Dusk 0.44 | 23 | 9% | 36 |
| wcsv.melee.EngineerMelee 0.1 | 21 | 8% | 27 |
| dummy.micro.Sparrow 2.5 | 14 | 6% | 16 |
| mz.NanoGod 2.02 | 12 | 5% | 12 |
| jab.DiamondStealer 5 | 8 | 3% | 8 |
| Krabb.akim2.Akim2 1.1b | 5 | 2% | 7 |

## Melee bench: F44

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 82.6 | 132 / 280 | 2.57 | 18.3% | 42853 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 18.3% | 132 |
| stelo.Liblix 0.3.1 | 2.0 | 15.7% | 105 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.1% | 25 |
| wompi.Quokka 1.6 | 4.4 | 10.2% | 8 |
| jwirde.Gort 2.0 | 5.4 | 9.3% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.4 | 9.2% | 2 |
| disan.Chair 2.2.0 | 7.0 | 7.6% | 3 |
| stf.PanzerGeneral 0.1 | 7.9 | 7.3% | 0 |
| sample.Crazy 1.0 | 9.4 | 4.7% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.6 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 78.1 | 16 / 35 | 5274 |
| 2 | 1 | 68.9 | 85.1 | 18 / 35 | 5669 |
| 3 | 1 | 68.3 | 85.1 | 13 / 35 | 5698 |
| 4 | 1 | 68.3 | 84.1 | 16 / 35 | 5520 |
| 5 | 1 | 68.9 | 83.5 | 21 / 35 | 5633 |
| 6 | 1 | 66.5 | 77.5 | 14 / 35 | 5191 |
| 7 | 1 | 67.9 | 83.5 | 16 / 35 | 5204 |
| 8 | 1 | 67.4 | 83.8 | 18 / 35 | 4664 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 98 | 31% |
| tzu.TheArtOfWar 1.2 | 74 | 88% |
| wompi.Quokka 1.6 | 14 | 100% |
| jwirde.Gort 2.0 | 8 | 88% |
| disan.Chair 2.2.0 | 7 | 86% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 86% |
| stf.PanzerGeneral 0.1 | 3 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 150 of 280 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 98 | 65% | 137 |
| tzu.TheArtOfWar 1.2 | 26 | 17% | 86 |
| wompi.Quokka 1.6 | 8 | 5% | 17 |
| stf.PanzerGeneral 0.1 | 5 | 3% | 7 |
| jwirde.Gort 2.0 | 4 | 3% | 14 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 2% | 7 |
| disan.Chair 2.2.0 | 3 | 2% | 7 |
| amk.jointstrike.JointStrike 0.2 | 2 | 1% | 2 |
| sample.Crazy 1.0 | 1 | 1% | 3 |

## Melee bench: F45

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 85.0 | 124 / 280 | 2.35 | 19.4% | 46032 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorDC 0.1 | 1.0 | 19.4% | 124 |
| eem.IWillFireNoBullet v2.8 | 2.4 | 12.6% | 135 |
| jje.BagPuss 1.2 | 3.3 | 11.9% | 10 |
| myl.nano.Graviton 1.10 | 4.4 | 10.2% | 1 |
| sul.Lunar 1.1 | 5.3 | 9.9% | 5 |
| hvilela.HVilela 0.9 | 6.4 | 8.8% | 0 |
| fm.claire 1.7 | 6.4 | 8.4% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.0% | 3 |
| wit.Deep7 2.0 | 9.5 | 5.7% | 2 |
| abud.ThirdRobo 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.3 | 17 / 35 | 5866 |
| 2 | 1 | 69.5 | 86.0 | 14 / 35 | 6025 |
| 3 | 1 | 69.5 | 83.8 | 17 / 35 | 5977 |
| 4 | 1 | 69.1 | 87.9 | 19 / 35 | 5341 |
| 5 | 1 | 68.9 | 87.6 | 10 / 35 | 5950 |
| 6 | 1 | 67.8 | 82.9 | 14 / 35 | 5447 |
| 7 | 1 | 68.8 | 83.2 | 17 / 35 | 5885 |
| 8 | 1 | 68.0 | 81.6 | 16 / 35 | 5541 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 141 | 32% |
| jje.BagPuss 1.2 | 26 | 81% |
| sul.Lunar 1.1 | 23 | 100% |
| myl.nano.Graviton 1.10 | 19 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 90% |
| wit.Deep7 2.0 | 4 | 75% |
| abud.ThirdRobo 1.0 | 2 | 100% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 156 of 280 rounds, at a mean tick of 2112. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 97 | 62% | 0 |
| jje.BagPuss 1.2 | 14 | 9% | 81 |
| pez.mini.ChironexFleckeri 0.5 | 10 | 6% | 29 |
| sul.Lunar 1.1 | 8 | 5% | 71 |
| myl.nano.Graviton 1.10 | 8 | 5% | 47 |
| hvilela.HVilela 0.9 | 7 | 4% | 20 |
| fm.claire 1.7 | 6 | 4% | 14 |
| wit.Deep7 2.0 | 4 | 3% | 12 |
| abud.ThirdRobo 1.0 | 2 | 1% | 5 |

## Melee bench: F46

hadur117.micro.SaorDC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 69.8 | 29 / 280 | 3.72 | 14.2% | 34309 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.4 | 17.3% | 107 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.7% | 120 |
| hadur117.micro.SaorDC 0.1 | 2.9 | 14.2% | 29 |
| mz.MicroSheep 1.0 | 4.4 | 10.6% | 2 |
| cx.Princess 1.0 | 5.1 | 9.9% | 15 |
| sadoner.killer 0.2 | 5.5 | 9.8% | 4 |
| arthord.NanoSatanMelee Beta | 7.5 | 6.5% | 2 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.2% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.0% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.3 | 65.7 | 3 / 35 | 3887 |
| 2 | 2 | 63.8 | 74.6 | 8 / 35 | 4628 |
| 3 | 3 | 62.8 | 71.7 | 3 / 35 | 4338 |
| 4 | 3 | 63.5 | 73.7 | 3 / 35 | 4413 |
| 5 | 3 | 59.5 | 62.2 | 3 / 35 | 4170 |
| 6 | 3 | 63.2 | 72.1 | 5 / 35 | 4542 |
| 7 | 3 | 60.3 | 65.7 | 2 / 35 | 3981 |
| 8 | 3 | 62.6 | 72.7 | 2 / 35 | 4350 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 59 | 17% |
| rsalesc.melee.Medina 0.4.5 | 29 | 21% |
| mz.MicroSheep 1.0 | 8 | 100% |
| cx.Princess 1.0 | 7 | 57% |
| sadoner.killer 0.2 | 1 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 0% |

Hadur died in 251 of 280 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 103 | 41% | 114 |
| rsalesc.melee.Medina 0.4.5 | 76 | 30% | 82 |
| cx.Princess 1.0 | 25 | 10% | 30 |
| sadoner.killer 0.2 | 15 | 6% | 15 |
| mz.MicroSheep 1.0 | 9 | 4% | 16 |
| arthord.NanoSatanMelee Beta | 9 | 4% | 9 |
| kurios.DOSexe .9a | 8 | 3% | 8 |
| jeremyreeder.collective.Prophet 5 | 3 | 1% | 3 |
| mbro.Detektor3 0.1.1 | 3 | 1% | 3 |

