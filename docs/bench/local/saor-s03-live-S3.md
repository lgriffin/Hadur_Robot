# Bench suite: suite.txt

## Melee bench: F01

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 72.5 | 43 / 280 | 3.48 | 15.1% | 39301 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 211 |
| hadur117.micro.SaorS3 0.1 | 2.0 | 15.1% | 43 |
| sgp.JollyNinja 3.53 | 3.5 | 11.5% | 12 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 11.1% | 5 |
| lorneswork.Predator 1.0 | 5.1 | 10.0% | 0 |
| mz.MicroGodMelee 1 | 5.4 | 9.9% | 8 |
| adt.Ar2 1.0 | 7.3 | 7.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 6.0% | 1 |
| skm.butterfly 1.0 | 8.8 | 5.4% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 70.2 | 3 / 35 | 5176 |
| 2 | 2 | 63.2 | 70.5 | 5 / 35 | 4856 |
| 3 | 2 | 63.5 | 71.4 | 5 / 35 | 4971 |
| 4 | 2 | 60.7 | 65.7 | 2 / 35 | 4330 |
| 5 | 2 | 65.7 | 79.0 | 7 / 35 | 5337 |
| 6 | 2 | 64.0 | 73.0 | 9 / 35 | 4882 |
| 7 | 2 | 64.8 | 76.2 | 6 / 35 | 5080 |
| 8 | 2 | 63.6 | 74.0 | 6 / 35 | 4669 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 108 | 7% |
| sgp.JollyNinja 3.53 | 21 | 81% |
| mz.MicroGodMelee 1 | 9 | 67% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 100% |
| lorneswork.Predator 1.0 | 5 | 100% |

Hadur died in 237 of 280 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 154 | 65% | 169 |
| mz.MicroGodMelee 1 | 20 | 8% | 24 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 8% | 26 |
| sgp.JollyNinja 3.53 | 14 | 6% | 22 |
| lorneswork.Predator 1.0 | 12 | 5% | 17 |
| kawigi.sbf.FloodSonnet 0.9 | 8 | 3% | 9 |
| adt.Ar2 1.0 | 6 | 3% | 6 |
| skm.butterfly 1.0 | 5 | 2% | 7 |

## Melee bench: F02

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 82.8 | 118 / 280 | 2.55 | 18.4% | 43915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 18.4% | 118 |
| pulsar.PulsarMax 0.8.9 | 2.4 | 13.9% | 67 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.6 | 13.1% | 48 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.7% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.3 | 9.4% | 12 |
| fnc.bandit.Bandit 5.2.0 | 6.5 | 8.3% | 0 |
| sch.Simone 0.3d | 7.0 | 7.8% | 14 |
| Noran.BitchingElk 0.054 | 7.1 | 7.6% | 12 |
| stelo.PatternRobot 1.0 | 8.9 | 6.2% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 89.5 | 16 / 35 | 6176 |
| 2 | 1 | 67.3 | 82.5 | 14 / 35 | 5405 |
| 3 | 1 | 67.2 | 81.3 | 17 / 35 | 5050 |
| 4 | 1 | 67.6 | 81.3 | 14 / 35 | 5525 |
| 5 | 1 | 68.4 | 83.5 | 16 / 35 | 5588 |
| 6 | 1 | 67.3 | 82.5 | 14 / 35 | 5235 |
| 7 | 1 | 68.0 | 84.8 | 16 / 35 | 5462 |
| 8 | 1 | 66.4 | 77.1 | 11 / 35 | 5474 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 55 | 56% |
| pulsar.PulsarMax 0.8.9 | 53 | 43% |
| com.cohesiva.robocode.ManOwaR 1.0 | 20 | 75% |
| lrem.micro.SpikeSoldier 0.4 | 18 | 100% |
| sch.Simone 0.3d | 17 | 53% |
| Noran.BitchingElk 0.054 | 16 | 50% |
| stelo.PatternRobot 1.0 | 9 | 89% |
| fullsail.SweetTea 1.1 | 6 | 67% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |

Hadur died in 162 of 280 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 53 | 33% | 74 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 46 | 28% | 87 |
| lrem.micro.SpikeSoldier 0.4 | 16 | 10% | 21 |
| sch.Simone 0.3d | 13 | 8% | 26 |
| Noran.BitchingElk 0.054 | 11 | 7% | 19 |
| stelo.PatternRobot 1.0 | 9 | 6% | 14 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 4% | 27 |
| fullsail.SweetTea 1.1 | 4 | 2% | 8 |
| fnc.bandit.Bandit 5.2.0 | 3 | 2% | 4 |

## Melee bench: F03

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 76.3 | 150 / 280 | 3.13 | 17.4% | 45226 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 17.4% | 150 |
| radnor.DoctorBob 1.42 | 2.4 | 13.9% | 50 |
| kawigi.nano.Lib 1.0 | 3.0 | 12.8% | 39 |
| vuen.Cake 2.51 | 3.6 | 12.4% | 30 |
| urdos.URDOS 1.3 | 5.0 | 10.1% | 5 |
| adt.Ar1 2.1 | 6.5 | 8.0% | 3 |
| oa.weak.FlyMk1 0.1 | 7.4 | 7.1% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.6 | 7.1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.6 | 6.3% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 70.5 | 18 / 35 | 5383 |
| 2 | 1 | 64.3 | 69.8 | 17 / 35 | 5273 |
| 3 | 1 | 68.2 | 85.1 | 19 / 35 | 5961 |
| 4 | 1 | 67.5 | 81.6 | 22 / 35 | 5784 |
| 5 | 1 | 63.2 | 66.0 | 14 / 35 | 5354 |
| 6 | 1 | 66.4 | 75.6 | 19 / 35 | 5693 |
| 7 | 1 | 68.0 | 81.3 | 20 / 35 | 5862 |
| 8 | 1 | 67.9 | 80.6 | 21 / 35 | 5916 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 68 | 82% |
| vuen.Cake 2.51 | 61 | 80% |
| radnor.DoctorBob 1.42 | 40 | 83% |
| urdos.URDOS 1.3 | 4 | 100% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 131 of 280 rounds, at a mean tick of 490. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 35 | 27% | 89 |
| vuen.Cake 2.51 | 22 | 17% | 66 |
| radnor.DoctorBob 1.42 | 20 | 15% | 56 |
| bwbaugh.nano.Tirunculus 0.0.0a | 15 | 11% | 13 |
| urdos.URDOS 1.3 | 11 | 8% | 17 |
| adt.Ar1 2.1 | 10 | 8% | 13 |
| ghent.ArthurPanzergon 1.0.0 | 10 | 8% | 12 |
| oa.weak.FlyMk1 0.1 | 6 | 5% | 12 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 2% | 2 |

## Melee bench: F04

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 75.6 | 3 / 280 | 3.20 | 15.9% | 46028 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.7% | 258 |
| hadur117.micro.SaorS3 0.1 | 2.0 | 15.9% | 3 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.4% | 10 |
| TNT.TNT 0.99.1 | 4.3 | 10.0% | 7 |
| josago.Jorgito 0.16 | 4.9 | 9.0% | 0 |
| css.Delitioner 0.11 | 6.4 | 7.4% | 1 |
| tj.zombie1n 1.0.1 | 6.6 | 6.8% | 1 |
| rampancy.Durandal 2.1d | 7.9 | 5.6% | 0 |
| spin.Bugstard 0.012b | 9.1 | 4.2% | 0 |
| sp.Nanos.Ember 1.1 | 9.9 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 75.6 | 0 / 35 | 5528 |
| 2 | 2 | 65.0 | 72.4 | 0 / 35 | 5944 |
| 3 | 2 | 64.0 | 71.1 | 0 / 35 | 5307 |
| 4 | 2 | 66.3 | 76.5 | 0 / 35 | 5951 |
| 5 | 2 | 65.7 | 76.8 | 1 / 35 | 5686 |
| 6 | 2 | 66.9 | 81.6 | 1 / 35 | 5810 |
| 7 | 2 | 66.4 | 75.6 | 1 / 35 | 6216 |
| 8 | 2 | 65.6 | 75.2 | 0 / 35 | 5586 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 116 | 1% |
| TNT.TNT 0.99.1 | 6 | 33% |
| apc.LeeroyJenkins2 1.0 | 2 | 0% |

Hadur died in 277 of 280 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 207 | 75% | 208 |
| apc.LeeroyJenkins2 1.0 | 37 | 13% | 37 |
| TNT.TNT 0.99.1 | 12 | 4% | 14 |
| josago.Jorgito 0.16 | 11 | 4% | 11 |
| css.Delitioner 0.11 | 4 | 1% | 4 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |

## Melee bench: F05

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 60.6 | 8 / 280 | 4.55 | 12.7% | 34316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.1 | 18.1% | 153 |
| justin.DemonicRage 3.4 | 1.9 | 16.9% | 86 |
| wompi.Numbat 2.1 | 3.5 | 12.7% | 20 |
| hadur117.micro.SaorS3 0.1 | 3.5 | 12.7% | 8 |
| axeBots.HataMoto 3.09 | 5.3 | 9.5% | 8 |
| ms.Ares 0.19 | 5.8 | 9.0% | 4 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.4 | 5.9% | 1 |
| supersample.SuperBoxBot 1.0 | 7.6 | 6.0% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.4 | 4.8% | 0 |
| GarmBox.Oranges 1.0 | 9.6 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.6 | 54.3 | 1 / 35 | 3854 |
| 2 | 3 | 60.8 | 65.1 | 1 / 35 | 4502 |
| 3 | 4 | 57.4 | 54.3 | 2 / 35 | 4286 |
| 4 | 4 | 59.1 | 60.3 | 0 / 35 | 4187 |
| 5 | 3 | 58.9 | 60.0 | 0 / 35 | 4356 |
| 6 | 3 | 60.4 | 63.8 | 1 / 35 | 4452 |
| 7 | 4 | 58.4 | 59.0 | 2 / 35 | 4125 |
| 8 | 3 | 61.9 | 67.9 | 1 / 35 | 4554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 25 | 4% |
| cb.fire.Firestarter 2.0f | 22 | 0% |
| wompi.Numbat 2.1 | 8 | 63% |
| ms.Ares 0.19 | 3 | 33% |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 0% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 272 of 280 rounds, at a mean tick of 624. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 92 | 34% | 93 |
| cb.fire.Firestarter 2.0f | 85 | 31% | 86 |
| wompi.Numbat 2.1 | 30 | 11% | 34 |
| axeBots.HataMoto 3.09 | 21 | 8% | 22 |
| ms.Ares 0.19 | 16 | 6% | 17 |
| supersample.SuperBoxBot 1.0 | 13 | 5% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 7 | 3% | 7 |
| GarmBox.Oranges 1.0 | 5 | 2% | 5 |
| Queens_teamrobot.UltraRazor 1.0 | 3 | 1% | 3 |

## Melee bench: F06

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 75.6 | 110 / 280 | 3.19 | 16.5% | 37727 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.1 | 16.5% | 110 |
| jekl.StoneGhost 0.7 | 2.5 | 14.1% | 46 |
| origin.SleepSiphon 1.7b | 2.6 | 13.6% | 72 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.3 | 12.0% | 27 |
| mld.Wisdom 1.0 | 4.8 | 11.3% | 7 |
| gg.Wolverine 2.0 | 5.9 | 9.0% | 7 |
| spinnercat.Omen 1.0 | 7.8 | 6.8% | 3 |
| DBall.NUKE 0.1 | 8.0 | 6.6% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 8.1 | 6.4% | 3 |
| sample.Fire 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 72.7 | 15 / 35 | 4481 |
| 2 | 1 | 69.1 | 86.3 | 23 / 35 | 5445 |
| 3 | 1 | 64.2 | 74.0 | 12 / 35 | 4354 |
| 4 | 1 | 66.9 | 83.8 | 15 / 35 | 4702 |
| 5 | 2 | 62.9 | 69.2 | 9 / 35 | 4406 |
| 6 | 1 | 63.8 | 69.2 | 11 / 35 | 4727 |
| 7 | 1 | 63.1 | 71.1 | 10 / 35 | 4468 |
| 8 | 1 | 66.6 | 78.7 | 15 / 35 | 5144 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 50 | 84% |
| origin.SleepSiphon 1.7b | 47 | 38% |
| pe.minimelee.SandboxMiniMelee 1.1 | 28 | 79% |
| gg.Wolverine 2.0 | 15 | 80% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 100% |
| mld.Wisdom 1.0 | 6 | 67% |
| DBall.NUKE 0.1 | 3 | 100% |
| sample.Fire 1.0 | 2 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 174 of 280 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 56 | 32% | 78 |
| mld.Wisdom 1.0 | 34 | 20% | 42 |
| jekl.StoneGhost 0.7 | 33 | 19% | 61 |
| pe.minimelee.SandboxMiniMelee 1.1 | 21 | 12% | 47 |
| gg.Wolverine 2.0 | 11 | 6% | 20 |
| sample.Fire 1.0 | 7 | 4% | 7 |
| spinnercat.Omen 1.0 | 5 | 3% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 2% | 13 |
| DBall.NUKE 0.1 | 3 | 2% | 6 |

## Melee bench: F07

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 8 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 84.4 | 93 / 280 | 2.41 | 19.1% | 53014 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.4 | 19.1% | 93 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.5% | 83 |
| rtk.Tachikoma 1.0 | 2.6 | 16.2% | 75 |
| franzor.Lizt 1.3.1 | 4.1 | 11.2% | 21 |
| oog.melee.CapuletDroid 1.1 | 4.9 | 9.5% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6.1 | 8.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.9 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.4% | 0 |
| sample.Target 1.0 | 9.1 | 2.8% | 0 |
| drd.Dreadknoght 0.9 | 9.9 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 83.2 | 15 / 35 | 6639 |
| 2 | 1 | 70.3 | 84.8 | 11 / 35 | 7016 |
| 3 | 1 | 72.7 | 88.9 | 16 / 35 | 7589 |
| 4 | 1 | 70.7 | 89.5 | 11 / 35 | 6518 |
| 5 | 1 | 71.0 | 87.6 | 12 / 35 | 6856 |
| 6 | 2 | 68.8 | 81.0 | 7 / 35 | 6436 |
| 7 | 3 | 66.7 | 74.0 | 10 / 35 | 5557 |
| 8 | 1 | 70.2 | 86.0 | 11 / 35 | 6403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 88 | 45% |
| rsalesc.melee.Monk 0.3.6c | 55 | 16% |
| oog.melee.CapuletDroid 1.1 | 28 | 79% |
| franzor.Lizt 1.3.1 | 23 | 65% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| skm.PateranBotlock2 1.0 | 2 | 100% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 188 of 280 rounds, at a mean tick of 1189. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 82 | 44% | 108 |
| rtk.Tachikoma 1.0 | 73 | 39% | 137 |
| oog.melee.CapuletDroid 1.1 | 15 | 8% | 15 |
| franzor.Lizt 1.3.1 | 9 | 5% | 2 |
| exauge.GateKeeper 1.1.121g | 4 | 2% | 7 |
| lrem.micro.MoggFanatic 0.2 | 4 | 2% | 6 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 3 |

## Melee bench: F08

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 74.8 | 107 / 280 | 3.27 | 17.2% | 44903 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 17.2% | 107 |
| tm.Yuugao 1.0 | 2.1 | 13.8% | 73 |
| shrub.Vapour v159 | 3.6 | 11.5% | 38 |
| Krabb.sliNk.Garm 0.9u | 4.8 | 10.1% | 23 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 10.2% | 19 |
| m3thos.Eva00 1.1 | 5.4 | 9.7% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 6.4 | 8.8% | 8 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 7.2% | 2 |
| SHAM.WOW 1.4 | 9.4 | 5.9% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.4 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 71.4 | 13 / 35 | 5264 |
| 2 | 1 | 67.7 | 80.6 | 16 / 35 | 5832 |
| 3 | 1 | 67.4 | 79.0 | 14 / 35 | 5951 |
| 4 | 1 | 66.0 | 74.3 | 13 / 35 | 5801 |
| 5 | 1 | 64.8 | 72.4 | 15 / 35 | 5262 |
| 6 | 1 | 65.7 | 75.2 | 11 / 35 | 5527 |
| 7 | 1 | 66.3 | 74.0 | 17 / 35 | 5434 |
| 8 | 1 | 64.4 | 71.4 | 8 / 35 | 5832 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 53 | 38% |
| shrub.Vapour v159 | 41 | 63% |
| Krabb.sliNk.Garm 0.9u | 22 | 82% |
| com.spp.robocode.MostlyHarmless 010 | 21 | 76% |
| jwst.DAD.DarkAndDarker 1.1 | 15 | 93% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| m3thos.Eva00 1.1 | 4 | 75% |
| SHAM.WOW 1.4 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 174 of 280 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 68 | 39% | 95 |
| shrub.Vapour v159 | 26 | 15% | 54 |
| Krabb.sliNk.Garm 0.9u | 19 | 11% | 29 |
| com.spp.robocode.MostlyHarmless 010 | 18 | 10% | 38 |
| m3thos.Eva00 1.1 | 13 | 7% | 16 |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 7% | 24 |
| zyx.nano.BacillusComma 1.0 | 8 | 5% | 9 |
| SHAM.WOW 1.4 | 5 | 3% | 7 |
| qualidafial.MajorDick 1.0.1 | 5 | 3% | 6 |

## Melee bench: F09

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 8 battles (0.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 61.2 | 38 / 280 | 4.49 | 13.2% | 32925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.1 | 17.6% | 155 |
| kc.micro.Figment 1.0 | 2.4 | 13.2% | 42 |
| hadur117.micro.SaorS3 0.1 | 2.9 | 13.2% | 38 |
| yagami.Tidus 0.11 | 4.1 | 11.1% | 7 |
| pedersen.Grishnakh 1.0 | 5.3 | 10.1% | 13 |
| mc2.enemy.Original 0.9 | 5.4 | 9.8% | 22 |
| dft.Calliope 5.6 | 6.9 | 7.9% | 3 |
| robar.nano.Assertive_Melee 0.2 | 8.4 | 5.9% | 0 |
| step.nanoPri 1.0 | 8.9 | 5.9% | 0 |
| rdm.Dueler 0.4x | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 68.9 | 7 / 35 | 4258 |
| 2 | 3 | 55.8 | 52.1 | 5 / 35 | 3884 |
| 3 | 1 | 65.4 | 78.7 | 9 / 35 | 4723 |
| 4 | 4 | 57.1 | 54.6 | 2 / 35 | 4140 |
| 5 | 3 | 58.6 | 59.4 | 4 / 35 | 4044 |
| 6 | 3 | 62.5 | 72.7 | 5 / 35 | 3973 |
| 7 | 4 | 56.4 | 52.7 | 3 / 35 | 4047 |
| 8 | 3 | 55.8 | 50.8 | 3 / 35 | 3856 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 41 | 10% |
| kc.micro.Figment 1.0 | 30 | 40% |
| pedersen.Grishnakh 1.0 | 11 | 73% |
| yagami.Tidus 0.11 | 8 | 88% |
| mc2.enemy.Original 0.9 | 6 | 33% |
| robar.nano.Assertive_Melee 0.2 | 2 | 100% |
| dft.Calliope 5.6 | 2 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 243 of 280 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 90 | 37% | 94 |
| kc.micro.Figment 1.0 | 86 | 35% | 100 |
| mc2.enemy.Original 0.9 | 23 | 9% | 26 |
| yagami.Tidus 0.11 | 21 | 9% | 30 |
| pedersen.Grishnakh 1.0 | 11 | 5% | 13 |
| robar.nano.Assertive_Melee 0.2 | 8 | 3% | 8 |
| rdm.Dueler 0.4x | 3 | 1% | 3 |
| step.nanoPri 1.0 | 1 | 0% | 3 |
| dft.Calliope 5.6 | 0 | 0% | 3 |

## Melee bench: F10

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.3 | 132 / 280 | 2.59 | 18.1% | 46153 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 18.1% | 132 |
| DTF.Kludgy 1.2b | 2.0 | 15.2% | 80 |
| ne.Chimera 1.2 | 3.9 | 11.9% | 12 |
| ejb.Polaris 1.0.1 | 4.3 | 11.6% | 26 |
| vStar.RAFzilla 2.15 | 4.8 | 11.0% | 13 |
| tvv.micro.Antares 1.1.1 | 5.1 | 10.3% | 12 |
| sam.Samspin 1.0 | 7.6 | 6.0% | 0 |
| kurios.DOSexe .9b | 8.4 | 5.7% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.5% | 0 |
| donjezza.Muncho 1.0 | 9.5 | 4.7% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 77.5 | 15 / 35 | 5793 |
| 2 | 1 | 64.1 | 73.3 | 11 / 35 | 5246 |
| 3 | 1 | 69.1 | 86.3 | 20 / 35 | 6025 |
| 4 | 1 | 67.5 | 83.2 | 16 / 35 | 5290 |
| 5 | 1 | 66.8 | 80.0 | 16 / 35 | 5474 |
| 6 | 1 | 67.7 | 80.3 | 15 / 35 | 5990 |
| 7 | 1 | 68.5 | 86.7 | 15 / 35 | 5831 |
| 8 | 1 | 70.8 | 91.1 | 24 / 35 | 6504 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 62 | 32% |
| ne.Chimera 1.2 | 39 | 85% |
| ejb.Polaris 1.0.1 | 37 | 59% |
| vStar.RAFzilla 2.15 | 34 | 100% |
| tvv.micro.Antares 1.1.1 | 17 | 76% |
| donjezza.Muncho 1.0 | 7 | 100% |
| kurios.DOSexe .9b | 3 | 67% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 149 of 280 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 78 | 52% | 96 |
| ne.Chimera 1.2 | 22 | 15% | 51 |
| ejb.Polaris 1.0.1 | 20 | 13% | 44 |
| tvv.micro.Antares 1.1.1 | 14 | 9% | 26 |
| sam.Samspin 1.0 | 6 | 4% | 5 |
| kurios.DOSexe .9b | 5 | 3% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 1% | 2 |
| vStar.RAFzilla 2.15 | 1 | 1% | 38 |
| donjezza.Muncho 1.0 | 1 | 1% | 5 |

## Melee bench: F11

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 70.6 | 66 / 280 | 3.65 | 15.3% | 37450 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 16.5% | 118 |
| hadur117.micro.SaorS3 0.1 | 1.9 | 15.3% | 66 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.4% | 40 |
| djc.DynaBot 0.1.1 | 4.4 | 10.3% | 14 |
| rdt199.Warlord 0.73 | 5.4 | 9.2% | 14 |
| br2.MobyDickBot 1.6 | 6.0 | 8.7% | 13 |
| uji.YellohFellah 1.0 | 6.4 | 8.4% | 12 |
| KiraNL.Chupacabra 0.4 | 7.9 | 7.6% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.1 | 6.2% | 1 |
| stelo.MirrorNano 1.3 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 66.0 | 7 / 35 | 4584 |
| 2 | 1 | 64.8 | 77.1 | 11 / 35 | 4696 |
| 3 | 2 | 61.7 | 64.1 | 9 / 35 | 4890 |
| 4 | 2 | 62.1 | 70.2 | 6 / 35 | 4304 |
| 5 | 2 | 63.4 | 74.0 | 6 / 35 | 4727 |
| 6 | 1 | 64.4 | 73.0 | 10 / 35 | 4957 |
| 7 | 2 | 63.9 | 73.3 | 10 / 35 | 4707 |
| 8 | 3 | 61.6 | 67.0 | 7 / 35 | 4585 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 59 | 25% |
| cx.mini.Nimrod 0.55 | 20 | 60% |
| djc.DynaBot 0.1.1 | 19 | 84% |
| rdt199.Warlord 0.73 | 12 | 75% |
| br2.MobyDickBot 1.6 | 11 | 64% |
| uji.YellohFellah 1.0 | 9 | 78% |

Hadur died in 214 of 280 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 108 | 50% | 119 |
| cx.mini.Nimrod 0.55 | 38 | 18% | 51 |
| rdt199.Warlord 0.73 | 16 | 7% | 22 |
| KiraNL.Chupacabra 0.4 | 14 | 7% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 12 | 6% | 13 |
| djc.DynaBot 0.1.1 | 10 | 5% | 27 |
| br2.MobyDickBot 1.6 | 10 | 5% | 16 |
| uji.YellohFellah 1.0 | 4 | 2% | 15 |
| stelo.MirrorNano 1.3 | 2 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 75.5 | 101 / 280 | 3.21 | 16.1% | 33531 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.3 | 16.1% | 101 |
| nat.PallasHawk 1.0 | 2.5 | 14.0% | 63 |
| bts.wiki.RipCurl 0.9b | 2.9 | 13.5% | 50 |
| darkcanuck.Leon 1.01 | 3.5 | 13.0% | 41 |
| brainfade.melee.Genghis 0.36 | 4.9 | 10.7% | 18 |
| jrm.Test0 1.0 | 6.9 | 7.6% | 1 |
| cs.sheldor.Talon 1.1 | 6.9 | 7.3% | 0 |
| jp.Perpy 16.0 | 8.3 | 6.6% | 1 |
| jaybot.bots.Oddball 4.0 | 8.5 | 6.0% | 5 |
| stuff.Vlad 0.1 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 80.6 | 15 / 35 | 4230 |
| 2 | 1 | 62.9 | 74.0 | 10 / 35 | 3802 |
| 3 | 1 | 69.3 | 86.3 | 21 / 35 | 5149 |
| 4 | 2 | 62.5 | 71.4 | 8 / 35 | 3980 |
| 5 | 1 | 64.2 | 75.6 | 14 / 35 | 3864 |
| 6 | 1 | 64.8 | 74.3 | 12 / 35 | 4669 |
| 7 | 1 | 62.8 | 72.7 | 13 / 35 | 3683 |
| 8 | 2 | 62.3 | 68.9 | 8 / 35 | 4154 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 54 | 59% |
| bts.wiki.RipCurl 0.9b | 40 | 50% |
| darkcanuck.Leon 1.01 | 36 | 64% |
| brainfade.melee.Genghis 0.36 | 21 | 81% |
| jrm.Test0 1.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jp.Perpy 16.0 | 2 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 179 of 280 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 49 | 27% | 85 |
| bts.wiki.RipCurl 0.9b | 45 | 25% | 62 |
| darkcanuck.Leon 1.01 | 33 | 18% | 64 |
| brainfade.melee.Genghis 0.36 | 17 | 9% | 26 |
| cs.sheldor.Talon 1.1 | 14 | 8% | 14 |
| jp.Perpy 16.0 | 10 | 6% | 13 |
| jaybot.bots.Oddball 4.0 | 6 | 3% | 9 |
| jrm.Test0 1.0 | 5 | 3% | 6 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |

## Melee bench: F13

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 63.7 | 13 / 280 | 4.27 | 13.0% | 33825 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.4 | 16.9% | 128 |
| ags.Glacier 0.2.11 | 1.6 | 16.9% | 84 |
| shinh.Entangled 0.3 | 3.8 | 12.6% | 37 |
| hadur117.micro.SaorS3 0.1 | 3.8 | 13.0% | 13 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.9% | 14 |
| apc.Colossus2 0.17 | 6.4 | 7.7% | 1 |
| stelo.Wang 1.0 | 6.8 | 7.3% | 3 |
| ayk.WallHugger 1.0 | 8.1 | 5.3% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.8 | 67.0 | 1 / 35 | 4051 |
| 2 | 3 | 62.9 | 72.7 | 2 / 35 | 4493 |
| 3 | 4 | 57.3 | 56.2 | 1 / 35 | 4090 |
| 4 | 3 | 60.1 | 66.0 | 1 / 35 | 4287 |
| 5 | 5 | 56.2 | 55.6 | 3 / 35 | 3496 |
| 6 | 3 | 61.4 | 64.4 | 3 / 35 | 4524 |
| 7 | 5 | 57.4 | 54.3 | 0 / 35 | 4053 |
| 8 | 3 | 63.4 | 73.0 | 2 / 35 | 4831 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 29 | 14% |
| ags.Glacier 0.2.11 | 22 | 5% |
| shinh.Entangled 0.3 | 12 | 25% |
| gh.micro.Gruweltje 0.7 | 5 | 40% |
| stelo.Wang 1.0 | 2 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 267 of 280 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 86 | 32% | 90 |
| mn.Combat 3.25.0 | 83 | 31% | 85 |
| shinh.Entangled 0.3 | 38 | 14% | 41 |
| gh.micro.Gruweltje 0.7 | 19 | 7% | 21 |
| maribo.FollowFire 1 | 13 | 5% | 13 |
| stelo.Wang 1.0 | 10 | 4% | 11 |
| apc.Colossus2 0.17 | 9 | 3% | 9 |
| ayk.WallHugger 1.0 | 7 | 3% | 8 |
| sample.Tracker 1.0 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 74.3 | 154 / 280 | 3.31 | 17.1% | 42984 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 17.1% | 154 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 13.4% | 20 |
| catcat20.shape.Theta 0.018 | 2.8 | 12.8% | 68 |
| sanyi.mikrobi.Roberto 1.0 | 5.0 | 10.1% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 10.0% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 5.5 | 10.0% | 6 |
| co.edu.usb.rc.LidisTron 1.0 | 6.5 | 9.3% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 8.5% | 16 |
| pa.Improved 1.0 | 9.0 | 6.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 79.7 | 21 / 35 | 5600 |
| 2 | 1 | 64.2 | 68.3 | 15 / 35 | 5155 |
| 3 | 1 | 66.2 | 74.9 | 19 / 35 | 4992 |
| 4 | 1 | 65.8 | 71.1 | 19 / 35 | 5468 |
| 5 | 1 | 64.2 | 70.5 | 18 / 35 | 5001 |
| 6 | 1 | 66.5 | 74.9 | 19 / 35 | 5546 |
| 7 | 1 | 68.9 | 82.2 | 21 / 35 | 6039 |
| 8 | 1 | 65.8 | 72.7 | 22 / 35 | 5183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 86 | 91% |
| catcat20.shape.Theta 0.018 | 52 | 50% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 87% |
| sanyi.mikrobi.Roberto 1.0 | 14 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 12 | 92% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |

Hadur died in 127 of 280 rounds, at a mean tick of 532. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 54 | 43% | 133 |
| catcat20.shape.Theta 0.018 | 39 | 31% | 62 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 6% | 12 |
| co.edu.usb.rc.LidisTron 1.0 | 7 | 6% | 13 |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 5% | 8 |
| sanyi.mikrobi.Roberto 1.0 | 5 | 4% | 24 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 3% | 18 |
| pa.Improved 1.0 | 3 | 2% | 7 |
| sample.TrackFire 1.0 | 1 | 1% | 3 |

## Melee bench: F15

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 84.8 | 152 / 280 | 2.36 | 19.6% | 49648 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 19.6% | 152 |
| kawigi.micro.Shiz 1.1 | 2.4 | 13.1% | 21 |
| emp.Yngwie 1.11 | 3.1 | 12.9% | 60 |
| mld.DustBunny 3.8 | 3.8 | 12.2% | 12 |
| kawigi.robot.Girl 1.2 | 5.1 | 9.3% | 22 |
| cb.nano.Insomnia 1.0 | 5.6 | 9.4% | 10 |
| Grystrion.TrackerWO 1.0 | 7.5 | 7.0% | 1 |
| lambdaxy.TBot 0.1 | 7.5 | 6.7% | 1 |
| divineomega.TrialBot 0.003 | 9.5 | 5.1% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 80.0 | 17 / 35 | 6298 |
| 2 | 1 | 71.1 | 89.8 | 20 / 35 | 6501 |
| 3 | 1 | 68.1 | 81.3 | 17 / 35 | 5931 |
| 4 | 1 | 71.3 | 90.8 | 25 / 35 | 6171 |
| 5 | 1 | 69.3 | 83.8 | 19 / 35 | 6135 |
| 6 | 1 | 69.5 | 82.9 | 21 / 35 | 6293 |
| 7 | 1 | 70.2 | 87.3 | 18 / 35 | 6338 |
| 8 | 1 | 68.8 | 82.9 | 15 / 35 | 5981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 62 | 56% |
| kawigi.micro.Shiz 1.1 | 54 | 98% |
| mld.DustBunny 3.8 | 30 | 83% |
| kawigi.robot.Girl 1.2 | 29 | 66% |
| cb.nano.Insomnia 1.0 | 15 | 93% |
| divineomega.TrialBot 0.003 | 7 | 86% |

Hadur died in 128 of 280 rounds, at a mean tick of 975. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 49 | 38% | 97 |
| cb.nano.Insomnia 1.0 | 23 | 18% | 20 |
| kawigi.robot.Girl 1.2 | 18 | 14% | 30 |
| mld.DustBunny 3.8 | 14 | 11% | 52 |
| kawigi.micro.Shiz 1.1 | 8 | 6% | 51 |
| lambdaxy.TBot 0.1 | 6 | 5% | 8 |
| Grystrion.TrackerWO 1.0 | 5 | 4% | 8 |
| divineomega.TrialBot 0.003 | 4 | 3% | 10 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 80.4 | 75 / 280 | 2.77 | 17.8% | 46486 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.3 | 17.8% | 75 |
| gh.Griezel 0.5.2 | 1.8 | 17.6% | 132 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.1 | 13.0% | 8 |
| techdude.forest.FlamingForest 1.1 | 4.4 | 10.7% | 46 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.2% | 1 |
| tvv.nano.Polaris 1.2 | 5.3 | 9.1% | 9 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.5% | 4 |
| divineomega.DivineBot 1.9.4.5 | 8.5 | 5.4% | 5 |
| repositorio.NanoStep 1.0 | 8.9 | 5.3% | 0 |
| asd.Cthulhu 1.3 | 9.6 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 86.7 | 9 / 35 | 5921 |
| 2 | 1 | 65.9 | 75.2 | 9 / 35 | 5610 |
| 3 | 1 | 67.8 | 81.0 | 11 / 35 | 5884 |
| 4 | 1 | 67.9 | 80.6 | 11 / 35 | 5858 |
| 5 | 2 | 67.4 | 79.4 | 10 / 35 | 6027 |
| 6 | 1 | 68.5 | 83.5 | 9 / 35 | 6162 |
| 7 | 2 | 66.8 | 79.0 | 6 / 35 | 5550 |
| 8 | 1 | 66.4 | 77.5 | 10 / 35 | 5474 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 107 | 16% |
| techdude.forest.FlamingForest 1.1 | 25 | 52% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 19 | 89% |
| bvh.fnr.Fenrir 0.36l | 11 | 100% |
| tvv.nano.Polaris 1.2 | 8 | 75% |
| divineomega.DivineBot 1.9.4.5 | 7 | 100% |
| stelo.IntrinsicVolatility 1.4 | 3 | 67% |
| repositorio.NanoStep 1.0 | 1 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 205 of 280 rounds, at a mean tick of 1263. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 124 | 60% | 144 |
| techdude.forest.FlamingForest 1.1 | 26 | 13% | 41 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 6% | 26 |
| bvh.fnr.Fenrir 0.36l | 13 | 6% | 16 |
| tvv.nano.Polaris 1.2 | 10 | 5% | 18 |
| stelo.IntrinsicVolatility 1.4 | 7 | 3% | 12 |
| asd.Cthulhu 1.3 | 5 | 2% | 4 |
| repositorio.NanoStep 1.0 | 4 | 2% | 6 |
| divineomega.DivineBot 1.9.4.5 | 3 | 1% | 13 |

## Melee bench: F17

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.5 | 109 / 280 | 2.67 | 17.8% | 42332 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 17.8% | 109 |
| oog.melee.Mercutio 1.0 | 2.6 | 12.9% | 49 |
| et.Predator 1.8 | 2.9 | 12.8% | 33 |
| cx.BlestPain 1.41 | 4.0 | 11.8% | 52 |
| nic.Nicator 2.4 | 5.0 | 10.7% | 18 |
| ahf.NanoAndrew .4 | 5.6 | 10.4% | 13 |
| maribo.melee.BMV 0.1 | 6.9 | 9.1% | 5 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 6.2% | 1 |
| tex.Longbot 0.4 | 8.8 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 75.6 | 11 / 35 | 4868 |
| 2 | 1 | 67.2 | 79.7 | 14 / 35 | 5544 |
| 3 | 1 | 68.0 | 84.8 | 16 / 35 | 5091 |
| 4 | 1 | 66.6 | 78.7 | 14 / 35 | 5422 |
| 5 | 1 | 68.3 | 86.0 | 12 / 35 | 5520 |
| 6 | 1 | 68.8 | 84.4 | 16 / 35 | 5582 |
| 7 | 1 | 67.3 | 81.3 | 14 / 35 | 5367 |
| 8 | 1 | 66.5 | 81.3 | 12 / 35 | 4938 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 54 | 57% |
| oog.melee.Mercutio 1.0 | 48 | 65% |
| cx.BlestPain 1.41 | 38 | 18% |
| nic.Nicator 2.4 | 33 | 70% |
| ahf.NanoAndrew .4 | 15 | 100% |
| maribo.melee.BMV 0.1 | 2 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 0% |

Hadur died in 173 of 280 rounds, at a mean tick of 1055. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 50 | 29% | 57 |
| et.Predator 1.8 | 37 | 21% | 70 |
| oog.melee.Mercutio 1.0 | 34 | 20% | 61 |
| nic.Nicator 2.4 | 20 | 12% | 38 |
| ahf.NanoAndrew .4 | 12 | 7% | 25 |
| maribo.melee.BMV 0.1 | 12 | 7% | 17 |
| goblin.Bender 2.4 | 3 | 2% | 5 |
| tex.Longbot 0.4 | 3 | 2% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 1% | 4 |

## Melee bench: F18

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 81.1 | 144 / 280 | 2.70 | 17.9% | 38370 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 17.9% | 144 |
| morbid.MorbidPriest 1.0 | 2.1 | 12.7% | 35 |
| uji.DBH 1.1 | 4.3 | 10.8% | 15 |
| ratosh.Nobo 0.21 | 4.4 | 10.8% | 12 |
| agd.Mooserwirt2 2.7 | 4.5 | 10.9% | 32 |
| spinnercat.Robovirus 2.718 | 5.0 | 10.2% | 15 |
| sigterm.Sigterm 1.0 | 7.0 | 8.7% | 17 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.5% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.4% | 1 |
| stelo.WangRobot 1.0 | 9.5 | 5.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.3 | 18 / 35 | 4983 |
| 2 | 1 | 64.5 | 72.4 | 14 / 35 | 4641 |
| 3 | 1 | 66.8 | 82.2 | 16 / 35 | 4888 |
| 4 | 1 | 65.9 | 77.1 | 16 / 35 | 4533 |
| 5 | 1 | 67.0 | 80.3 | 19 / 35 | 4821 |
| 6 | 1 | 67.3 | 83.2 | 22 / 35 | 4781 |
| 7 | 1 | 67.4 | 82.9 | 21 / 35 | 4864 |
| 8 | 1 | 67.4 | 83.2 | 18 / 35 | 4859 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 45 | 78% |
| uji.DBH 1.1 | 34 | 74% |
| agd.Mooserwirt2 2.7 | 29 | 52% |
| spinnercat.Robovirus 2.718 | 27 | 74% |
| sigterm.Sigterm 1.0 | 21 | 90% |
| ratosh.Nobo 0.21 | 21 | 71% |
| stelo.WangRobot 1.0 | 9 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 67% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 138 of 280 rounds, at a mean tick of 722. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 34 | 25% | 71 |
| agd.Mooserwirt2 2.7 | 26 | 19% | 57 |
| ratosh.Nobo 0.21 | 16 | 12% | 33 |
| uji.DBH 1.1 | 16 | 12% | 29 |
| kawigi.mini.Fhqwhgads 1.1 | 13 | 9% | 22 |
| spinnercat.Robovirus 2.718 | 11 | 8% | 22 |
| sigterm.Sigterm 1.0 | 10 | 7% | 23 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9 | 7% | 10 |
| stelo.WangRobot 1.0 | 3 | 2% | 12 |

## Melee bench: F19

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 90.0 | 213 / 280 | 1.90 | 20.5% | 47142 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 20.5% | 213 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.4 | 14.3% | 24 |
| mld.Infinity 2.2 | 2.6 | 13.7% | 27 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 10.8% | 6 |
| erdnis.Rover 0.3 | 4.9 | 10.5% | 5 |
| patson.PatsonTestBot 1.0 | 6.1 | 8.4% | 3 |
| mbh.Mbh 0.1 | 7.0 | 7.5% | 0 |
| pac.ABC 2.1 | 7.6 | 7.2% | 2 |
| pbg.R2D2 1.0 | 8.9 | 5.9% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 86.7 | 26 / 35 | 5592 |
| 2 | 1 | 73.3 | 95.9 | 30 / 35 | 6788 |
| 3 | 1 | 71.3 | 90.8 | 28 / 35 | 5822 |
| 4 | 1 | 71.7 | 92.4 | 28 / 35 | 5842 |
| 5 | 1 | 70.2 | 88.6 | 25 / 35 | 5412 |
| 6 | 1 | 71.1 | 87.0 | 25 / 35 | 6018 |
| 7 | 1 | 70.6 | 88.9 | 23 / 35 | 6048 |
| 8 | 1 | 71.2 | 89.8 | 28 / 35 | 5620 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 106 | 90% |
| mld.Infinity 2.2 | 86 | 91% |
| krillr.mini.JointStrike 2.0.0 | 14 | 93% |
| erdnis.Rover 0.3 | 14 | 86% |
| patson.PatsonTestBot 1.0 | 7 | 86% |
| pac.ABC 2.1 | 6 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 68 of 280 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 23 | 34% | 135 |
| mld.Infinity 2.2 | 19 | 28% | 26 |
| erdnis.Rover 0.3 | 9 | 13% | 24 |
| krillr.mini.JointStrike 2.0.0 | 8 | 12% | 37 |
| patson.PatsonTestBot 1.0 | 3 | 4% | 16 |
| mbh.Mbh 0.1 | 3 | 4% | 15 |
| pac.ABC 2.1 | 3 | 4% | 10 |
| pbg.R2D2 1.0 | 0 | 0% | 13 |

## Melee bench: F20

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 87.1 | 134 / 280 | 2.16 | 19.5% | 47257 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 19.5% | 134 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.6% | 68 |
| fwb.Nine 1.0.1 | 3.3 | 12.2% | 56 |
| nz.jdc.nano.GridFu 1.0 | 4.4 | 10.5% | 2 |
| catcat20.Rabbit 0.001 | 4.5 | 9.4% | 14 |
| m3thos.mini.Eva01 0.5.5 | 6.4 | 8.0% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.1 | 7.3% | 3 |
| bayen.nut.Squirrel 1.615 | 7.6 | 7.1% | 2 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 6.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 87.6 | 19 / 35 | 6137 |
| 2 | 1 | 68.7 | 83.5 | 14 / 35 | 6048 |
| 3 | 1 | 69.1 | 87.6 | 17 / 35 | 5620 |
| 4 | 1 | 69.2 | 84.1 | 18 / 35 | 5680 |
| 5 | 1 | 71.1 | 93.0 | 21 / 35 | 6175 |
| 6 | 1 | 69.3 | 87.3 | 16 / 35 | 5889 |
| 7 | 1 | 70.5 | 92.1 | 18 / 35 | 6010 |
| 8 | 1 | 67.8 | 81.6 | 11 / 35 | 5698 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 102 | 57% |
| fwb.Nine 1.0.1 | 55 | 35% |
| catcat20.Rabbit 0.001 | 22 | 73% |
| nz.jdc.nano.GridFu 1.0 | 17 | 100% |
| bayen.nut.Squirrel 1.615 | 10 | 90% |
| m3thos.mini.Eva01 0.5.5 | 8 | 100% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 146 of 280 rounds, at a mean tick of 1248. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 73 | 50% | 119 |
| fwb.Nine 1.0.1 | 46 | 32% | 57 |
| catcat20.Rabbit 0.001 | 13 | 9% | 37 |
| nz.jdc.nano.GridFu 1.0 | 7 | 5% | 23 |
| djdjdj.NanoSkunk10 1.0 | 4 | 3% | 13 |
| bayen.nut.Squirrel 1.615 | 2 | 1% | 13 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 9 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F21

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 84.2 | 120 / 280 | 2.43 | 18.8% | 45512 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.1 | 18.8% | 120 |
| eem.EvBot v4.6.16 | 1.9 | 16.6% | 124 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.0% | 16 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.5% | 5 |
| eld.Hmm 1.0 | 5.3 | 8.3% | 14 |
| oa.weak.BotherBot 0.1 | 5.8 | 8.0% | 1 |
| el.JumpShoot 0.2 | 7.8 | 6.2% | 2 |
| fire219.CatBot 1.0 | 8.1 | 6.4% | 0 |
| PSW.Relentless 0.1 | 8.1 | 5.9% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 92.4 | 18 / 35 | 5888 |
| 2 | 2 | 67.3 | 76.8 | 13 / 35 | 5325 |
| 3 | 1 | 69.6 | 89.5 | 18 / 35 | 5475 |
| 4 | 1 | 69.3 | 81.9 | 16 / 35 | 6031 |
| 5 | 1 | 67.9 | 80.6 | 11 / 35 | 5935 |
| 6 | 1 | 67.6 | 78.4 | 12 / 35 | 5551 |
| 7 | 1 | 69.1 | 86.0 | 17 / 35 | 5540 |
| 8 | 1 | 69.1 | 87.6 | 15 / 35 | 5767 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 118 | 39% |
| dummy.mini.Scimitar 1.01 | 44 | 91% |
| cf.RiO.RiOx 4.2.1 | 26 | 100% |
| eld.Hmm 1.0 | 7 | 43% |
| oa.weak.BotherBot 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 160 of 280 rounds, at a mean tick of 1084. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 94 | 59% | 125 |
| dummy.mini.Scimitar 1.01 | 31 | 19% | 84 |
| cf.RiO.RiOx 4.2.1 | 8 | 5% | 28 |
| eld.Hmm 1.0 | 8 | 5% | 15 |
| fire219.CatBot 1.0 | 6 | 4% | 7 |
| PSW.Relentless 0.1 | 6 | 4% | 6 |
| oa.weak.BotherBot 0.1 | 3 | 2% | 8 |
| el.JumpShoot 0.2 | 3 | 2% | 4 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |

## Melee bench: F23

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 79.8 | 117 / 280 | 2.82 | 18.5% | 48082 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.1 | 18.5% | 117 |
| pe.SandboxLump 1.52 | 2.0 | 16.6% | 93 |
| cre.Karolos 0.32 | 2.9 | 13.7% | 31 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4.6 | 9.9% | 3 |
| stelo.AreaTargetingBot 1.1 | 5.3 | 9.6% | 15 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 9.4% | 12 |
| cw.megas.Blade 0.8 | 6.8 | 8.7% | 3 |
| sample.Walls 1.0 | 7.9 | 8.0% | 6 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.9% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 86.3 | 23 / 35 | 6686 |
| 2 | 1 | 69.6 | 83.5 | 15 / 35 | 6381 |
| 3 | 1 | 65.7 | 71.1 | 10 / 35 | 5420 |
| 4 | 1 | 70.6 | 87.3 | 17 / 35 | 6068 |
| 5 | 1 | 68.1 | 75.6 | 14 / 35 | 6011 |
| 6 | 1 | 68.0 | 78.4 | 12 / 35 | 5859 |
| 7 | 2 | 68.3 | 79.7 | 13 / 35 | 5634 |
| 8 | 1 | 68.4 | 76.5 | 13 / 35 | 6023 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 105 | 52% |
| cre.Karolos 0.32 | 38 | 66% |
| stelo.AreaTargetingBot 1.1 | 19 | 84% |
| stelo.RamTrackSurfer 1.2 | 12 | 75% |
| sample.Walls 1.0 | 5 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 164 of 280 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 78 | 48% | 133 |
| cre.Karolos 0.32 | 32 | 20% | 61 |
| stelo.AreaTargetingBot 1.1 | 15 | 9% | 24 |
| cw.megas.Blade 0.8 | 13 | 8% | 17 |
| stelo.RamTrackSurfer 1.2 | 11 | 7% | 20 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 5% | 12 |
| sample.Walls 1.0 | 5 | 3% | 10 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F24

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 70.4 | 58 / 280 | 3.66 | 14.8% | 34224 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.5 | 14.8% | 58 |
| florent.XSeries.X2 0.12 | 2.0 | 14.1% | 65 |
| rz.GlowBlowMelee 1.4 | 3.0 | 14.1% | 59 |
| davidalves.Phoenix 0.54 | 4.0 | 12.5% | 56 |
| pedersen.Ugluk 1.1.1 | 4.9 | 10.9% | 24 |
| oog.melee.Corsair 1.0 | 5.8 | 9.5% | 12 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.4% | 6 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.3% | 2 |
| as.FrankTheTank 1.3 | 9.0 | 5.5% | 0 |
| evd.X1 0.01 | 9.9 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 74.9 | 12 / 35 | 4051 |
| 2 | 2 | 61.7 | 70.2 | 5 / 35 | 4181 |
| 3 | 1 | 63.1 | 73.0 | 6 / 35 | 4589 |
| 4 | 1 | 63.9 | 71.4 | 7 / 35 | 4847 |
| 5 | 2 | 59.7 | 64.4 | 3 / 35 | 4138 |
| 6 | 3 | 60.2 | 63.8 | 8 / 35 | 4025 |
| 7 | 1 | 62.6 | 72.1 | 9 / 35 | 3981 |
| 8 | 1 | 62.8 | 73.3 | 8 / 35 | 4412 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 41 | 51% |
| florent.XSeries.X2 0.12 | 33 | 24% |
| davidalves.Phoenix 0.54 | 21 | 38% |
| pedersen.Ugluk 1.1.1 | 18 | 50% |
| stelo.SoJNanoMelee 1.1 | 7 | 100% |
| lunchie.Lunchbox 0.93 | 3 | 67% |
| oog.melee.Corsair 1.0 | 2 | 50% |
| evd.X1 0.01 | 1 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 223 of 280 rounds, at a mean tick of 687. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 72 | 32% | 80 |
| rz.GlowBlowMelee 1.4 | 46 | 21% | 68 |
| davidalves.Phoenix 0.54 | 41 | 18% | 50 |
| pedersen.Ugluk 1.1.1 | 22 | 10% | 26 |
| oog.melee.Corsair 1.0 | 16 | 7% | 19 |
| stelo.SoJNanoMelee 1.1 | 12 | 5% | 16 |
| evd.X1 0.01 | 9 | 4% | 11 |
| lunchie.Lunchbox 0.93 | 3 | 1% | 6 |
| as.FrankTheTank 1.3 | 2 | 1% | 4 |

## Melee bench: F25

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.8 | 166 / 280 | 2.64 | 18.2% | 36414 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 18.2% | 166 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.2% | 30 |
| voidious.micro.BlitzBat 1.05 | 3.3 | 12.0% | 19 |
| jdw.Hurricane 1.4 | 3.6 | 11.4% | 27 |
| gre.svman4.Morfeas 1.4.1 | 5.1 | 9.7% | 17 |
| ds.Oo 2.2 | 5.9 | 9.1% | 9 |
| gjr.Cephalosporin 0.1 | 7.6 | 7.5% | 7 |
| adt.Ar2 1.1 | 8.1 | 7.1% | 3 |
| awesomeness.Elite 1.0 | 8.3 | 7.0% | 4 |
| amk.ChumbaMini 0.2 | 9.9 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 80.3 | 22 / 35 | 4540 |
| 2 | 1 | 68.4 | 86.0 | 21 / 35 | 4783 |
| 3 | 1 | 67.9 | 82.5 | 19 / 35 | 4970 |
| 4 | 1 | 66.9 | 81.3 | 19 / 35 | 4558 |
| 5 | 1 | 67.8 | 85.1 | 23 / 35 | 4399 |
| 6 | 1 | 65.6 | 75.9 | 18 / 35 | 4303 |
| 7 | 1 | 67.8 | 82.9 | 24 / 35 | 4326 |
| 8 | 1 | 66.9 | 80.3 | 20 / 35 | 4535 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 65 | 83% |
| voidious.micro.BlitzBat 1.05 | 51 | 92% |
| jdw.Hurricane 1.4 | 26 | 92% |
| ds.Oo 2.2 | 13 | 85% |
| gre.svman4.Morfeas 1.4.1 | 12 | 92% |
| adt.Ar2 1.1 | 7 | 100% |
| gjr.Cephalosporin 0.1 | 6 | 100% |
| awesomeness.Elite 1.0 | 5 | 80% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 116 of 280 rounds, at a mean tick of 551. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 27 | 23% | 79 |
| jdw.Hurricane 1.4 | 21 | 18% | 42 |
| ds.Oo 2.2 | 18 | 16% | 33 |
| voidious.micro.BlitzBat 1.05 | 17 | 15% | 57 |
| gre.svman4.Morfeas 1.4.1 | 13 | 11% | 30 |
| awesomeness.Elite 1.0 | 8 | 7% | 14 |
| adt.Ar2 1.1 | 4 | 3% | 10 |
| amk.ChumbaMini 0.2 | 4 | 3% | 5 |
| gjr.Cephalosporin 0.1 | 3 | 3% | 8 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 80.6 | 100 / 280 | 2.75 | 17.7% | 46343 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 17.7% | 100 |
| ak.Fermat 2.0 | 2.0 | 15.5% | 90 |
| lrem.Spectre 0.4.4 | 3.6 | 12.3% | 36 |
| shu.nitro.LENIN .T34 | 4.4 | 11.5% | 38 |
| js.PinBall 1.6 | 4.4 | 10.9% | 8 |
| gh.mini.GrubbmOne 1.0 | 6.0 | 9.5% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.6 | 9.1% | 5 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.9% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 77.1 | 11 / 35 | 5443 |
| 2 | 1 | 66.5 | 78.4 | 11 / 35 | 5727 |
| 3 | 1 | 69.5 | 84.4 | 16 / 35 | 6671 |
| 4 | 1 | 66.3 | 77.1 | 8 / 35 | 5512 |
| 5 | 1 | 69.8 | 88.6 | 19 / 35 | 5914 |
| 6 | 1 | 67.5 | 82.5 | 11 / 35 | 5524 |
| 7 | 1 | 66.8 | 78.1 | 12 / 35 | 5826 |
| 8 | 1 | 67.1 | 78.1 | 12 / 35 | 5726 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 62 | 31% |
| lrem.Spectre 0.4.4 | 41 | 51% |
| shu.nitro.LENIN .T34 | 40 | 63% |
| js.PinBall 1.6 | 12 | 75% |
| gh.mini.GrubbmOne 1.0 | 11 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 88% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 80% |
| sample.SpinBot 1.0 | 4 | 100% |

Hadur died in 182 of 280 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 74 | 41% | 92 |
| shu.nitro.LENIN .T34 | 29 | 16% | 55 |
| lrem.Spectre 0.4.4 | 28 | 15% | 44 |
| js.PinBall 1.6 | 21 | 12% | 34 |
| fullsail.LaxativeTeaTwo 1.0 | 11 | 6% | 14 |
| jaybot.adv.bots.JayBot 2.0 | 8 | 4% | 15 |
| gh.mini.GrubbmOne 1.0 | 6 | 3% | 19 |
| sample.SpinBot 1.0 | 4 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 78.1 | 153 / 280 | 2.97 | 17.5% | 37954 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.3 | 17.5% | 153 |
| mk.Alpha 0.2.1 | 1.9 | 14.7% | 66 |
| EH.Eagle 1.0.6 | 3.6 | 11.0% | 13 |
| wee.Gem 1.8.4 | 3.9 | 11.0% | 26 |
| sheldor.melee.nano.TestMelee 0.1 | 6.0 | 9.2% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 6.1 | 8.8% | 3 |
| throxbot.ThroxBot 0.1 | 7.0 | 7.9% | 4 |
| joe.ADinosaur 1.0 | 7.3 | 8.1% | 1 |
| caimano.Furia_Ceca 0.22 | 8.5 | 6.9% | 2 |
| cs.Grudge 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 81.9 | 18 / 35 | 4599 |
| 2 | 3 | 57.6 | 51.1 | 7 / 35 | 4168 |
| 3 | 1 | 66.7 | 79.0 | 19 / 35 | 4704 |
| 4 | 1 | 68.8 | 83.8 | 26 / 35 | 5284 |
| 5 | 1 | 67.1 | 83.5 | 18 / 35 | 4797 |
| 6 | 1 | 66.3 | 77.1 | 21 / 35 | 4820 |
| 7 | 1 | 68.4 | 86.0 | 21 / 35 | 4936 |
| 8 | 1 | 67.5 | 82.2 | 23 / 35 | 4646 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 93 | 75% |
| EH.Eagle 1.0.6 | 31 | 94% |
| wee.Gem 1.8.4 | 29 | 83% |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 85% |
| throxbot.ThroxBot 0.1 | 8 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 100% |
| joe.ADinosaur 1.0 | 5 | 100% |

Hadur died in 127 of 280 rounds, at a mean tick of 570. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 42 | 33% | 119 |
| joe.ADinosaur 1.0 | 17 | 13% | 22 |
| wee.Gem 1.8.4 | 13 | 10% | 36 |
| cs.Grudge 1.0 | 13 | 10% | 12 |
| EH.Eagle 1.0.6 | 10 | 8% | 34 |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 7% | 20 |
| throxbot.ThroxBot 0.1 | 9 | 7% | 13 |
| techdude.kombat.FlamingKombat 1.5 | 8 | 6% | 15 |
| caimano.Furia_Ceca 0.22 | 6 | 5% | 9 |

## Melee bench: F28

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 84.2 | 141 / 280 | 2.42 | 18.2% | 37454 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 18.2% | 141 |
| kid.test.NightFox .2 | 2.1 | 14.4% | 46 |
| uji.Antique 1.0 | 3.3 | 11.6% | 39 |
| qohnil.blot.BlotBot 3.61 | 4.1 | 11.0% | 29 |
| pfvicm.Sobieski 7.2.3b | 4.9 | 10.0% | 5 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.1% | 6 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.1% | 6 |
| matt.advanced.Katana 1.0 | 7.9 | 7.1% | 7 |
| stelo.Lifestealer 1.0 | 9.3 | 5.8% | 1 |
| stelo.PianistNano 1.2 | 9.5 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 85.7 | 19 / 35 | 5338 |
| 2 | 1 | 66.7 | 80.6 | 18 / 35 | 4438 |
| 3 | 1 | 68.1 | 89.2 | 18 / 35 | 4770 |
| 4 | 1 | 66.1 | 80.0 | 18 / 35 | 4477 |
| 5 | 1 | 66.6 | 83.2 | 14 / 35 | 4540 |
| 6 | 1 | 68.2 | 87.0 | 19 / 35 | 4789 |
| 7 | 1 | 68.2 | 87.3 | 19 / 35 | 4572 |
| 8 | 1 | 66.1 | 81.0 | 16 / 35 | 4530 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 98 | 74% |
| uji.Antique 1.0 | 45 | 69% |
| qohnil.blot.BlotBot 3.61 | 28 | 46% |
| amk.ChumbaWumba 0.3 | 9 | 78% |
| ahr.ice.Ice 1.0.2 | 7 | 57% |
| pfvicm.Sobieski 7.2.3b | 6 | 100% |
| matt.advanced.Katana 1.0 | 5 | 60% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 140 of 280 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 32 | 23% | 85 |
| uji.Antique 1.0 | 31 | 22% | 69 |
| qohnil.blot.BlotBot 3.61 | 23 | 16% | 38 |
| pfvicm.Sobieski 7.2.3b | 18 | 13% | 25 |
| amk.ChumbaWumba 0.3 | 14 | 10% | 20 |
| ahr.ice.Ice 1.0.2 | 7 | 5% | 13 |
| matt.advanced.Katana 1.0 | 5 | 4% | 12 |
| stelo.Lifestealer 1.0 | 5 | 4% | 8 |
| stelo.PianistNano 1.2 | 4 | 3% | 7 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.5 | 105 / 280 | 2.66 | 17.8% | 39588 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 17.8% | 105 |
| zyx.mega.YersiniaPestis 3.1 | 2.4 | 14.9% | 81 |
| deewiant.Anomaly 0.2 | 2.6 | 14.4% | 71 |
| myl.micro.Troodon 1.10 | 4.0 | 11.6% | 8 |
| jok.PheonixM 0.1.2 | 5.1 | 10.1% | 5 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.1% | 1 |
| DBall.Anarchy 0.1 | 7.3 | 6.9% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 8.3 | 5.9% | 0 |
| ap.Frederick 1.1 | 9.1 | 5.2% | 0 |
| jangs.ns51 1.0 | 9.3 | 5.1% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 76.2 | 12 / 35 | 4751 |
| 2 | 1 | 69.9 | 90.8 | 15 / 35 | 5335 |
| 3 | 1 | 68.8 | 86.0 | 16 / 35 | 5202 |
| 4 | 1 | 66.3 | 80.3 | 9 / 35 | 4715 |
| 5 | 1 | 66.3 | 77.5 | 12 / 35 | 4847 |
| 6 | 1 | 65.7 | 77.1 | 14 / 35 | 4497 |
| 7 | 1 | 67.8 | 83.2 | 12 / 35 | 5008 |
| 8 | 1 | 67.9 | 81.3 | 15 / 35 | 5233 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 66 | 44% |
| zyx.mega.YersiniaPestis 3.1 | 57 | 30% |
| myl.micro.Troodon 1.10 | 33 | 88% |
| DBall.Anarchy 0.1 | 15 | 93% |
| jok.PheonixM 0.1.2 | 12 | 100% |
| jangs.ns51 1.0 | 3 | 33% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 175 of 280 rounds, at a mean tick of 932. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 72 | 41% | 88 |
| deewiant.Anomaly 0.2 | 62 | 35% | 96 |
| jok.PheonixM 0.1.2 | 12 | 7% | 27 |
| myl.micro.Troodon 1.10 | 10 | 6% | 29 |
| ph.melee.ArcherME 0.3 | 8 | 5% | 11 |
| fullsail.TimbotNoPrediction 1.0 | 5 | 3% | 6 |
| jangs.ns51 1.0 | 3 | 2% | 6 |
| DBall.Anarchy 0.1 | 2 | 1% | 17 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F30

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 55.6 | 28 / 280 | 5.00 | 12.1% | 32844 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.6 | 14.0% | 79 |
| darkcanuck.B26354 1.06 | 2.0 | 14.0% | 77 |
| stelo.PastFuture 2.3.2 | 3.5 | 12.5% | 37 |
| hadur117.micro.SaorS3 0.1 | 3.8 | 12.1% | 28 |
| oog.melee.Capulet 1.2 | 4.1 | 12.0% | 31 |
| intruder.PrairieWolf 2.61 | 6.3 | 9.4% | 17 |
| ntc.Opposite 1.5 | 7.6 | 7.9% | 0 |
| tripphippy.Alice 1.1 | 8.0 | 7.4% | 3 |
| fowl3628800.LightningBolt 2.6.0 | 8.1 | 7.5% | 8 |
| GarmBox.Anger 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.3 | 58.7 | 3 / 35 | 4127 |
| 2 | 4 | 56.7 | 55.6 | 4 / 35 | 3825 |
| 3 | 5 | 53.9 | 50.5 | 1 / 35 | 3866 |
| 4 | 3 | 56.8 | 56.2 | 3 / 35 | 4122 |
| 5 | 4 | 55.4 | 52.7 | 3 / 35 | 3961 |
| 6 | 5 | 55.8 | 50.8 | 4 / 35 | 4209 |
| 7 | 3 | 59.1 | 58.4 | 5 / 35 | 4603 |
| 8 | 2 | 59.2 | 61.6 | 5 / 35 | 4131 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 21 | 14% |
| darkcanuck.B26354 1.06 | 17 | 24% |
| oog.melee.Capulet 1.2 | 12 | 58% |
| stelo.PastFuture 2.3.2 | 11 | 64% |
| tripphippy.Alice 1.1 | 4 | 75% |
| intruder.PrairieWolf 2.61 | 4 | 25% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 100% |

Hadur died in 253 of 280 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 64 | 25% | 66 |
| oog.melee.Capulet 1.2 | 54 | 21% | 63 |
| darkcanuck.B26354 1.06 | 53 | 21% | 57 |
| stelo.PastFuture 2.3.2 | 23 | 9% | 29 |
| intruder.PrairieWolf 2.61 | 23 | 9% | 25 |
| tripphippy.Alice 1.1 | 11 | 4% | 13 |
| fowl3628800.LightningBolt 2.6.0 | 11 | 4% | 13 |
| ntc.Opposite 1.5 | 11 | 4% | 11 |
| GarmBox.Anger 1.0 | 3 | 1% | 3 |

## Melee bench: F31

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 67.0 | 32 / 280 | 3.97 | 13.8% | 31052 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.9% | 166 |
| hadur117.micro.SaorS3 0.1 | 2.3 | 13.8% | 32 |
| gh.mini.Griezel 0.2 | 2.9 | 13.2% | 54 |
| d414.nano.Quantum 1.0.0 | 4.4 | 11.2% | 11 |
| spinnercat.micro.Tyger 0.1 | 4.6 | 11.1% | 10 |
| gh.nano.Grofvuil 0.2 | 5.9 | 8.6% | 6 |
| timmit.nano.TimDog 0.33 | 7.4 | 6.8% | 1 |
| fm.mammillarias 1.3 | 7.9 | 6.3% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.1 | 5.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.6 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 68.3 | 6 / 35 | 3920 |
| 2 | 2 | 60.7 | 65.1 | 7 / 35 | 3961 |
| 3 | 2 | 62.8 | 74.0 | 2 / 35 | 4052 |
| 4 | 3 | 59.2 | 61.9 | 3 / 35 | 3772 |
| 5 | 2 | 63.3 | 75.6 | 3 / 35 | 4070 |
| 6 | 2 | 58.1 | 60.0 | 2 / 35 | 3653 |
| 7 | 2 | 60.7 | 66.0 | 6 / 35 | 3953 |
| 8 | 3 | 59.9 | 65.1 | 3 / 35 | 3671 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 57 | 16% |
| gh.mini.Griezel 0.2 | 24 | 13% |
| spinnercat.micro.Tyger 0.1 | 13 | 77% |
| d414.nano.Quantum 1.0.0 | 10 | 70% |
| fm.mammillarias 1.3 | 2 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 248 of 280 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 116 | 47% | 123 |
| gh.mini.Griezel 0.2 | 46 | 19% | 53 |
| spinnercat.micro.Tyger 0.1 | 23 | 9% | 32 |
| d414.nano.Quantum 1.0.0 | 18 | 7% | 22 |
| gh.nano.Grofvuil 0.2 | 17 | 7% | 18 |
| timmit.nano.TimDog 0.33 | 11 | 4% | 13 |
| fm.mammillarias 1.3 | 11 | 4% | 13 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 1% | 3 |
| tlp.ThreeLeggedPig 1 | 3 | 1% | 3 |

## Melee bench: F32

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 79.4 | 122 / 280 | 2.85 | 17.4% | 40329 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 17.4% | 122 |
| kawigi.sbf.FloodHT 0.9.2 | 2.1 | 14.8% | 97 |
| apc.botM 3.0 | 3.3 | 12.1% | 31 |
| lxx.ConceptA 0.8 | 4.3 | 10.7% | 5 |
| vjik.UnViolation 1.1 | 4.4 | 10.1% | 10 |
| bayen.UbaMicro 1.4 | 6.4 | 8.4% | 5 |
| panzer.Panzer 0.2 | 7.8 | 7.5% | 4 |
| yk.JahMicro 1.0 | 8.3 | 6.8% | 4 |
| conscience.Electron 1.3g | 8.4 | 6.5% | 2 |
| donjezza.Jezza 1.0 | 9.3 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 82.2 | 16 / 35 | 5434 |
| 2 | 1 | 65.2 | 77.1 | 11 / 35 | 5072 |
| 3 | 1 | 67.2 | 81.3 | 16 / 35 | 5304 |
| 4 | 1 | 64.2 | 72.1 | 13 / 35 | 5025 |
| 5 | 1 | 63.4 | 70.5 | 13 / 35 | 4707 |
| 6 | 1 | 65.2 | 80.6 | 13 / 35 | 4624 |
| 7 | 1 | 68.9 | 89.2 | 22 / 35 | 5152 |
| 8 | 1 | 67.0 | 82.2 | 18 / 35 | 5011 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 83 | 35% |
| apc.botM 3.0 | 37 | 76% |
| lxx.ConceptA 0.8 | 28 | 89% |
| yk.JahMicro 1.0 | 12 | 92% |
| vjik.UnViolation 1.1 | 12 | 92% |
| bayen.UbaMicro 1.4 | 10 | 80% |
| donjezza.Jezza 1.0 | 7 | 100% |
| panzer.Panzer 0.2 | 3 | 67% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 161 of 280 rounds, at a mean tick of 664. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 77 | 48% | 112 |
| lxx.ConceptA 0.8 | 26 | 16% | 40 |
| apc.botM 3.0 | 16 | 10% | 49 |
| conscience.Electron 1.3g | 11 | 7% | 14 |
| bayen.UbaMicro 1.4 | 10 | 6% | 13 |
| panzer.Panzer 0.2 | 8 | 5% | 10 |
| vjik.UnViolation 1.1 | 6 | 4% | 25 |
| yk.JahMicro 1.0 | 6 | 4% | 7 |
| donjezza.Jezza 1.0 | 1 | 1% | 7 |

## Melee bench: F33

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 83.5 | 137 / 280 | 2.48 | 18.9% | 43988 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 18.9% | 137 |
| maribo.Quester 0.3 | 2.0 | 15.6% | 62 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.2% | 23 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.3% | 16 |
| labg.Cataclysm 2.05 | 4.3 | 10.9% | 26 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.4 | 8.4% | 12 |
| baal.nano.N 1.42 | 6.6 | 8.4% | 1 |
| zyx.micro.Ant 1.1 | 8.3 | 5.7% | 1 |
| sanja.First 0.1 | 8.9 | 5.1% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.9 | 3.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 86.0 | 19 / 35 | 5404 |
| 2 | 1 | 67.8 | 82.5 | 12 / 35 | 5343 |
| 3 | 1 | 69.7 | 84.8 | 22 / 35 | 5527 |
| 4 | 1 | 70.6 | 88.6 | 18 / 35 | 5750 |
| 5 | 1 | 67.2 | 76.8 | 16 / 35 | 5169 |
| 6 | 1 | 70.4 | 87.9 | 18 / 35 | 5948 |
| 7 | 1 | 68.2 | 79.4 | 16 / 35 | 5442 |
| 8 | 1 | 68.6 | 82.2 | 16 / 35 | 5405 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 74 | 65% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 82% |
| gre.svman4.Leonidas 1.3.2 | 33 | 82% |
| labg.Cataclysm 2.05 | 20 | 45% |
| kinsen.melee.Angsaichmophobia 1.8c | 13 | 69% |
| baal.nano.N 1.42 | 2 | 100% |
| zyx.micro.Ant 1.1 | 2 | 50% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 144 of 280 rounds, at a mean tick of 931. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 65 | 45% | 115 |
| gre.svman4.Leonidas 1.3.2 | 20 | 14% | 43 |
| labg.Cataclysm 2.05 | 18 | 13% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 12% | 59 |
| kinsen.melee.Angsaichmophobia 1.8c | 12 | 8% | 14 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 5 | 3% | 6 |
| zyx.micro.Ant 1.1 | 3 | 2% | 5 |
| sanja.First 0.1 | 3 | 2% | 4 |
| baal.nano.N 1.42 | 1 | 1% | 7 |

## Melee bench: F34

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 77.0 | 48 / 280 | 3.07 | 16.3% | 41115 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.5 | 17.1% | 130 |
| hadur117.micro.SaorS3 0.1 | 2.0 | 16.3% | 48 |
| kid.Gladiator .7.2 | 2.5 | 16.0% | 69 |
| tcf.Reach 3 | 4.5 | 11.2% | 9 |
| jcs.Seth 1.8 | 4.8 | 11.1% | 25 |
| cli.Dancer 1.1 | 5.8 | 9.7% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 6.7% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.4 | 3.6% | 0 |
| sample.RamFire 1.0 | 9.6 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.9 | 70.5 | 5 / 35 | 5468 |
| 2 | 1 | 66.0 | 77.1 | 5 / 35 | 5225 |
| 3 | 2 | 65.5 | 76.8 | 8 / 35 | 5048 |
| 4 | 1 | 66.7 | 78.1 | 8 / 35 | 5118 |
| 5 | 2 | 65.9 | 78.4 | 3 / 35 | 5234 |
| 6 | 3 | 65.5 | 76.2 | 5 / 35 | 4980 |
| 7 | 1 | 67.2 | 81.6 | 6 / 35 | 5311 |
| 8 | 3 | 65.4 | 77.1 | 8 / 35 | 4731 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 67 | 25% |
| kid.Gladiator .7.2 | 44 | 34% |
| jcs.Seth 1.8 | 15 | 60% |
| tcf.Reach 3 | 6 | 67% |
| cli.Dancer 1.1 | 2 | 50% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 232 of 280 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 98 | 42% | 118 |
| kid.Gladiator .7.2 | 86 | 37% | 99 |
| jcs.Seth 1.8 | 17 | 7% | 22 |
| tcf.Reach 3 | 12 | 5% | 15 |
| cli.Dancer 1.1 | 8 | 3% | 11 |
| ratosh.Wesco 1.4 | 8 | 3% | 8 |
| sample.VelociRobot 1.0 | 2 | 1% | 4 |
| amk.Punbot.Punbot 0.01 | 1 | 0% | 1 |
| sample.RamFire 1.0 | 0 | 0% | 1 |

## Melee bench: F35

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 71.2 | 22 / 280 | 3.60 | 13.9% | 29586 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 222 |
| hadur117.micro.SaorS3 0.1 | 2.3 | 13.9% | 22 |
| gh.mini.Gruwel 0.9 | 3.3 | 12.6% | 24 |
| rz.HawkOnFire 0.1 | 4.3 | 11.7% | 3 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.5% | 8 |
| wit.Chuliath 1.0 | 6.3 | 7.5% | 2 |
| myl.nano.KomoriNinja 1.1 | 7.3 | 6.4% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.9 | 5.8% | 0 |
| dans.Cinnamon 1.2 | 8.9 | 5.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 74.0 | 3 / 35 | 3675 |
| 2 | 2 | 62.8 | 74.3 | 3 / 35 | 4004 |
| 3 | 2 | 63.5 | 79.0 | 3 / 35 | 3727 |
| 4 | 2 | 60.6 | 66.3 | 3 / 35 | 3774 |
| 5 | 2 | 61.9 | 73.3 | 3 / 35 | 3800 |
| 6 | 4 | 57.4 | 59.4 | 1 / 35 | 3411 |
| 7 | 2 | 63.6 | 77.5 | 5 / 35 | 3839 |
| 8 | 2 | 59.2 | 65.4 | 1 / 35 | 3356 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 63 | 3% |
| gh.mini.Gruwel 0.9 | 15 | 20% |
| rz.HawkOnFire 0.1 | 10 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 6 | 83% |
| wit.Chuliath 1.0 | 2 | 100% |

Hadur died in 258 of 280 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 159 | 62% | 164 |
| gh.mini.Gruwel 0.9 | 43 | 17% | 44 |
| dmh.robocode.robot.BlackDeath 9.2 | 17 | 7% | 25 |
| rz.HawkOnFire 0.1 | 17 | 7% | 24 |
| myl.nano.KomoriNinja 1.1 | 6 | 2% | 6 |
| wit.Chuliath 1.0 | 6 | 2% | 6 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 5 | 2% | 6 |
| stelo.MyAgileRobot 0.2 | 4 | 2% | 5 |
| dans.Cinnamon 1.2 | 1 | 0% | 0 |

## Melee bench: F36

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 87.7 | 185 / 280 | 2.11 | 20.1% | 45348 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 20.1% | 185 |
| bzdp.Pansy 2.1 | 3.0 | 11.7% | 17 |
| alpha.RainingFire 1.0 | 3.1 | 11.7% | 28 |
| mz.Cork 0.1 | 3.5 | 11.3% | 18 |
| bvh.micro.Freya 0.3 | 5.3 | 10.3% | 10 |
| m3thos.Eva02 0.7.1 | 5.9 | 9.7% | 12 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.4% | 5 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 6.6% | 0 |
| dl.BetterWalls 1.0 | 9.1 | 5.1% | 1 |
| sample.MyFirstRobot 1.0 | 9.9 | 4.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 84.8 | 25 / 35 | 5270 |
| 2 | 1 | 70.9 | 92.1 | 22 / 35 | 5783 |
| 3 | 1 | 71.0 | 91.4 | 26 / 35 | 5637 |
| 4 | 1 | 70.8 | 91.1 | 24 / 35 | 5740 |
| 5 | 1 | 69.1 | 84.4 | 21 / 35 | 5717 |
| 6 | 1 | 72.2 | 94.6 | 27 / 35 | 6033 |
| 7 | 1 | 70.5 | 89.8 | 24 / 35 | 5822 |
| 8 | 1 | 65.7 | 73.0 | 16 / 35 | 5346 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 62 | 87% |
| bvh.micro.Freya 0.3 | 37 | 95% |
| mz.Cork 0.1 | 37 | 81% |
| bvh.mini.Fenrir 0.39 | 27 | 93% |
| m3thos.Eva02 0.7.1 | 27 | 85% |
| alpha.RainingFire 1.0 | 21 | 62% |
| sample.MyFirstRobot 1.0 | 5 | 80% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 96 of 280 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 23 | 24% | 38 |
| mz.Cork 0.1 | 22 | 23% | 57 |
| bzdp.Pansy 2.1 | 18 | 19% | 74 |
| bvh.micro.Freya 0.3 | 8 | 8% | 32 |
| bvh.mini.Fenrir 0.39 | 8 | 8% | 16 |
| m3thos.Eva02 0.7.1 | 7 | 7% | 26 |
| sample.MyFirstRobot 1.0 | 4 | 4% | 12 |
| dl.BetterWalls 1.0 | 3 | 3% | 15 |
| squidM.TentalceMeleeNano 1.1 | 3 | 3% | 8 |

## Melee bench: F37

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.1 | 174 / 280 | 2.70 | 18.5% | 46610 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 18.5% | 174 |
| germ.TheMind .2 | 2.4 | 10.9% | 21 |
| EBBU.Sim2 1.02 | 3.8 | 10.1% | 10 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.4 | 10.1% | 17 |
| agrach.Dalek 1.0 | 6.0 | 9.0% | 15 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.8% | 19 |
| mb.Beast 0.1 | 6.9 | 8.4% | 9 |
| lmk.ACPFinal 0.1 | 7.8 | 8.3% | 8 |
| skm.Ryubot 1.0 | 8.0 | 8.0% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 8.1 | 7.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 75.9 | 20 / 35 | 5894 |
| 2 | 1 | 65.8 | 76.5 | 18 / 35 | 5905 |
| 3 | 1 | 68.2 | 84.4 | 24 / 35 | 5790 |
| 4 | 1 | 67.3 | 82.9 | 24 / 35 | 5612 |
| 5 | 1 | 69.4 | 88.3 | 23 / 35 | 6303 |
| 6 | 1 | 65.2 | 74.3 | 17 / 35 | 5642 |
| 7 | 1 | 70.5 | 91.4 | 27 / 35 | 6316 |
| 8 | 1 | 64.9 | 75.2 | 21 / 35 | 5148 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 41 | 93% |
| EBBU.Sim2 1.02 | 33 | 88% |
| com.syncleus.robocode.Dreadnaught 0.1 | 24 | 88% |
| stelo.UntouchableNano 1.3 | 24 | 92% |
| mb.Beast 0.1 | 21 | 95% |
| skm.Ryubot 1.0 | 21 | 100% |
| agrach.Dalek 1.0 | 15 | 87% |
| lmk.ACPFinal 0.1 | 10 | 90% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 108 of 280 rounds, at a mean tick of 384. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 19 | 18% | 47 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 16% | 19 |
| agrach.Dalek 1.0 | 16 | 15% | 32 |
| com.syncleus.robocode.Dreadnaught 0.1 | 15 | 14% | 42 |
| lmk.ACPFinal 0.1 | 15 | 14% | 34 |
| EBBU.Sim2 1.02 | 10 | 9% | 38 |
| mb.Beast 0.1 | 8 | 7% | 29 |
| stelo.UntouchableNano 1.3 | 6 | 6% | 23 |
| skm.Ryubot 1.0 | 2 | 2% | 14 |

## Melee bench: F38

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 73.3 | 76 / 280 | 3.41 | 15.5% | 36560 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.1 | 17.2% | 136 |
| hadur117.micro.SaorS3 0.1 | 1.9 | 15.5% | 76 |
| bvh.mini.Freya 0.55 | 3.3 | 12.3% | 18 |
| cs.Wren 1.0 | 4.3 | 11.3% | 18 |
| bts.mega.Gnarly 1.4 | 5.0 | 10.7% | 22 |
| kdf.KoulDestroyer 1.0 | 6.0 | 9.1% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.6 | 8.3% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.4 | 6.3% | 2 |
| matt.UnderDark3 2.4.34 | 8.9 | 4.9% | 0 |
| bzdp.BoxCar 2.0 | 9.6 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 73.3 | 11 / 35 | 4501 |
| 2 | 2 | 63.1 | 70.2 | 11 / 35 | 4471 |
| 3 | 2 | 60.1 | 64.1 | 4 / 35 | 4321 |
| 4 | 2 | 66.7 | 81.9 | 12 / 35 | 4772 |
| 5 | 2 | 65.0 | 73.7 | 12 / 35 | 5121 |
| 6 | 2 | 64.1 | 75.9 | 10 / 35 | 4376 |
| 7 | 1 | 65.1 | 79.7 | 10 / 35 | 4524 |
| 8 | 2 | 61.9 | 67.3 | 6 / 35 | 4474 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 62 | 24% |
| bvh.mini.Freya 0.55 | 20 | 75% |
| cs.Wren 1.0 | 19 | 84% |
| bts.mega.Gnarly 1.4 | 17 | 71% |
| kdf.KoulDestroyer 1.0 | 9 | 78% |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 100% |

Hadur died in 205 of 280 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 102 | 50% | 125 |
| bvh.mini.Freya 0.55 | 29 | 14% | 41 |
| bts.mega.Gnarly 1.4 | 25 | 12% | 39 |
| cs.Wren 1.0 | 15 | 7% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 5% | 19 |
| kdf.KoulDestroyer 1.0 | 11 | 5% | 16 |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 2% | 9 |
| matt.UnderDark3 2.4.34 | 4 | 2% | 4 |
| bzdp.BoxCar 2.0 | 3 | 1% | 3 |

## Melee bench: F39

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 77.9 | 94 / 280 | 2.99 | 17.3% | 44102 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 17.3% | 94 |
| bvh.fry.Freya 0.82 | 2.4 | 14.0% | 24 |
| az.Ololobot 0.2.4 | 3.0 | 12.9% | 94 |
| catcat20.Lambda 0.024 | 3.6 | 11.9% | 49 |
| gimp.GimpBot 0.1 | 6.1 | 8.2% | 2 |
| apollokidd.ApolloKidd 0.9 | 6.1 | 8.0% | 2 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.5% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 7.5 | 7.3% | 9 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 6.1% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 79.7 | 11 / 35 | 5513 |
| 2 | 1 | 68.1 | 84.8 | 17 / 35 | 5630 |
| 3 | 1 | 66.7 | 80.0 | 13 / 35 | 5651 |
| 4 | 1 | 65.8 | 74.9 | 11 / 35 | 5490 |
| 5 | 1 | 68.5 | 85.4 | 14 / 35 | 5914 |
| 6 | 1 | 64.3 | 70.5 | 10 / 35 | 5508 |
| 7 | 1 | 63.5 | 73.0 | 10 / 35 | 4912 |
| 8 | 1 | 64.5 | 74.6 | 8 / 35 | 5484 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 53 | 81% |
| az.Ololobot 0.2.4 | 49 | 18% |
| catcat20.Lambda 0.024 | 36 | 53% |
| stelo.SoRobotNanoMelee 1.2 | 14 | 93% |
| winamp32.micro.MicroMacro 1.0 | 5 | 60% |
| gimp.GimpBot 0.1 | 5 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 50% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 187 of 280 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 62 | 33% | 80 |
| bvh.fry.Freya 0.82 | 45 | 24% | 77 |
| catcat20.Lambda 0.024 | 33 | 18% | 47 |
| whitesquare.robots.SkynetAdvanced 1.1 | 13 | 7% | 13 |
| apollokidd.ApolloKidd 0.9 | 12 | 6% | 18 |
| stelo.SoRobotNanoMelee 1.2 | 9 | 5% | 16 |
| winamp32.micro.MicroMacro 1.0 | 9 | 5% | 13 |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 2% | 5 |
| gimp.GimpBot 0.1 | 1 | 1% | 11 |

## Melee bench: F40

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 81.1 | 154 / 280 | 2.70 | 18.4% | 41011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 18.4% | 154 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.9% | 59 |
| kano.gamma.KanoGamma 1.8 | 3.1 | 12.3% | 19 |
| mz.AntiGrav 1.0 | 4.5 | 10.7% | 9 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.2% | 19 |
| alpha.BlackIce 1.0 | 6.0 | 8.9% | 7 |
| stelo.Randomness 1.0 | 6.4 | 8.8% | 11 |
| amk.superstrike.SuperStrike 0.3 | 8.3 | 6.4% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.5% | 2 |
| sample.Corners 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 74.6 | 14 / 35 | 4492 |
| 2 | 1 | 68.2 | 81.9 | 21 / 35 | 5362 |
| 3 | 1 | 68.1 | 81.0 | 19 / 35 | 5056 |
| 4 | 1 | 68.9 | 82.9 | 20 / 35 | 5266 |
| 5 | 1 | 69.6 | 86.0 | 20 / 35 | 5379 |
| 6 | 1 | 70.3 | 87.3 | 26 / 35 | 5434 |
| 7 | 1 | 66.1 | 76.8 | 16 / 35 | 4836 |
| 8 | 1 | 67.8 | 78.4 | 18 / 35 | 5186 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 86 | 60% |
| kano.gamma.KanoGamma 1.8 | 38 | 89% |
| mz.AntiGrav 1.0 | 27 | 100% |
| Polkwane.SmashMelee 1.0 | 20 | 80% |
| stelo.Randomness 1.0 | 18 | 83% |
| alpha.BlackIce 1.0 | 6 | 83% |
| sample.Corners 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 126 of 280 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 47 | 37% | 83 |
| Polkwane.SmashMelee 1.0 | 20 | 16% | 34 |
| stelo.Randomness 1.0 | 14 | 11% | 33 |
| kano.gamma.KanoGamma 1.8 | 13 | 10% | 56 |
| mz.AntiGrav 1.0 | 13 | 10% | 34 |
| alpha.BlackIce 1.0 | 10 | 8% | 16 |
| amk.superstrike.SuperStrike 0.3 | 6 | 5% | 12 |
| testantiswapgun.AntiSwap 1.0 | 2 | 2% | 7 |
| sample.Corners 1.0 | 1 | 1% | 5 |

## Melee bench: F41

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 69.6 | 90 / 280 | 3.74 | 15.4% | 36851 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.5 | 16.0% | 105 |
| hadur117.micro.SaorS3 0.1 | 1.8 | 15.4% | 90 |
| ary.Swarm 1.1 | 3.4 | 12.8% | 21 |
| lessonz.robocode.Oz 0.5.0 | 3.4 | 12.8% | 37 |
| simonton.nano.MeleeSeed 1.8 | 5.1 | 10.3% | 16 |
| shrub.Silver v048 | 5.9 | 9.8% | 4 |
| zyx.nano.Ant 1.1 | 7.0 | 7.9% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 6.2% | 5 |
| stelo.Mirror 1.1 | 8.8 | 5.8% | 2 |
| acogdev.alpha 0.2 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 61.3 | 5 / 35 | 4377 |
| 2 | 2 | 63.1 | 70.2 | 8 / 35 | 4460 |
| 3 | 2 | 59.3 | 60.0 | 7 / 35 | 4248 |
| 4 | 1 | 65.4 | 73.7 | 13 / 35 | 5103 |
| 5 | 4 | 61.0 | 62.2 | 10 / 35 | 4292 |
| 6 | 1 | 66.3 | 75.6 | 16 / 35 | 4838 |
| 7 | 1 | 67.4 | 81.3 | 17 / 35 | 4910 |
| 8 | 1 | 65.1 | 72.7 | 14 / 35 | 4623 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 60 | 37% |
| lessonz.robocode.Oz 0.5.0 | 32 | 78% |
| ary.Swarm 1.1 | 26 | 77% |
| simonton.nano.MeleeSeed 1.8 | 20 | 80% |
| shrub.Silver v048 | 8 | 75% |
| jsal.Jsalbot 1.0 | 3 | 33% |

Hadur died in 190 of 280 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 98 | 52% | 125 |
| simonton.nano.MeleeSeed 1.8 | 24 | 13% | 40 |
| lessonz.robocode.Oz 0.5.0 | 21 | 11% | 38 |
| ary.Swarm 1.1 | 20 | 11% | 39 |
| zyx.nano.Ant 1.1 | 14 | 7% | 14 |
| shrub.Silver v048 | 5 | 3% | 11 |
| acogdev.alpha 0.2 | 3 | 2% | 5 |
| jsal.Jsalbot 1.0 | 3 | 2% | 5 |
| stelo.Mirror 1.1 | 2 | 1% | 2 |

## Melee bench: F42

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 76.5 | 67 / 280 | 3.11 | 16.4% | 42363 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.4 | 16.4% | 67 |
| wompi.Wallaby 5.1 | 1.6 | 16.7% | 118 |
| ara.Shera 0.88 | 3.5 | 12.9% | 40 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.4% | 42 |
| amz.NanoClone 1.41 | 5.0 | 9.5% | 5 |
| maribo.IotaCT 1.1 | 6.1 | 8.2% | 3 |
| dsw.StaticD 1.0 | 7.0 | 7.2% | 4 |
| stelo.MirrorMicro 1.0 | 8.1 | 5.9% | 1 |
| mme.NikeEnhanced 2.0 | 9.3 | 5.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 75.9 | 5 / 35 | 4827 |
| 2 | 1 | 66.0 | 81.0 | 9 / 35 | 5172 |
| 3 | 2 | 64.1 | 70.8 | 7 / 35 | 5191 |
| 4 | 1 | 67.2 | 78.7 | 9 / 35 | 5831 |
| 5 | 1 | 65.3 | 75.9 | 11 / 35 | 5418 |
| 6 | 1 | 66.1 | 77.5 | 13 / 35 | 5474 |
| 7 | 2 | 61.9 | 70.2 | 3 / 35 | 4553 |
| 8 | 1 | 67.7 | 82.5 | 10 / 35 | 5897 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 62 | 35% |
| ara.Shera 0.88 | 33 | 52% |
| maribo.mini.MiniQuester 0.1 | 32 | 69% |
| dsw.StaticD 1.0 | 5 | 60% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 0% |
| maribo.IotaCT 1.1 | 1 | 0% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 0% |

Hadur died in 218 of 280 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 103 | 47% | 123 |
| ara.Shera 0.88 | 48 | 22% | 64 |
| maribo.mini.MiniQuester 0.1 | 32 | 15% | 51 |
| dsw.StaticD 1.0 | 10 | 5% | 13 |
| amz.NanoClone 1.41 | 8 | 4% | 8 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 6 | 3% | 8 |
| stelo.MirrorMicro 1.0 | 6 | 3% | 7 |
| maribo.IotaCT 1.1 | 4 | 2% | 4 |
| mme.NikeEnhanced 2.0 | 1 | 0% | 2 |

## Melee bench: F43

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 70.1 | 20 / 280 | 3.69 | 14.0% | 32095 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.3% | 214 |
| hadur117.micro.SaorS3 0.1 | 2.1 | 14.0% | 20 |
| brainfade.melee.Dusk 0.44 | 3.4 | 12.3% | 26 |
| wcsv.melee.EngineerMelee 0.1 | 4.3 | 11.2% | 7 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.7% | 12 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.4% | 0 |
| mz.NanoGod 2.02 | 7.3 | 8.0% | 1 |
| jab.DiamondStealer 5 | 7.8 | 7.6% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.0% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 65.7 | 4 / 35 | 3926 |
| 2 | 2 | 63.5 | 72.7 | 2 / 35 | 4118 |
| 3 | 2 | 65.4 | 75.9 | 5 / 35 | 4340 |
| 4 | 2 | 62.5 | 69.2 | 3 / 35 | 4010 |
| 5 | 2 | 62.3 | 68.6 | 2 / 35 | 3915 |
| 6 | 2 | 61.3 | 67.0 | 1 / 35 | 3665 |
| 7 | 3 | 60.8 | 65.4 | 1 / 35 | 3676 |
| 8 | 2 | 65.2 | 76.2 | 2 / 35 | 4445 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 67 | 4% |
| brainfade.melee.Dusk 0.44 | 17 | 41% |
| dummy.micro.Sparrow 2.5 | 8 | 75% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 260 of 280 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 157 | 60% | 163 |
| brainfade.melee.Dusk 0.44 | 37 | 14% | 44 |
| wcsv.melee.EngineerMelee 0.1 | 22 | 8% | 22 |
| dummy.micro.Sparrow 2.5 | 17 | 7% | 22 |
| mz.NanoGod 2.02 | 11 | 4% | 12 |
| jab.DiamondStealer 5 | 10 | 4% | 10 |
| Krabb.akim2.Akim2 1.1b | 5 | 2% | 5 |
| cvt.Firsty 1.0 | 1 | 0% | 2 |

## Melee bench: F44

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 79.8 | 118 / 280 | 2.81 | 18.1% | 45436 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 18.1% | 118 |
| stelo.Liblix 0.3.1 | 2.1 | 15.6% | 103 |
| tzu.TheArtOfWar 1.2 | 2.9 | 13.0% | 35 |
| wompi.Quokka 1.6 | 4.6 | 10.0% | 7 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.1 | 9.5% | 3 |
| jwirde.Gort 2.0 | 5.3 | 9.3% | 12 |
| disan.Chair 2.2.0 | 7.1 | 7.5% | 0 |
| stf.PanzerGeneral 0.1 | 7.9 | 6.8% | 1 |
| sample.Crazy 1.0 | 9.5 | 5.1% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 83.5 | 19 / 35 | 5866 |
| 2 | 1 | 67.0 | 78.4 | 15 / 35 | 5574 |
| 3 | 1 | 66.1 | 75.2 | 14 / 35 | 5730 |
| 4 | 1 | 67.2 | 78.4 | 13 / 35 | 5546 |
| 5 | 1 | 69.5 | 87.6 | 13 / 35 | 5961 |
| 6 | 1 | 66.8 | 80.0 | 11 / 35 | 5481 |
| 7 | 1 | 69.9 | 87.9 | 18 / 35 | 5948 |
| 8 | 1 | 64.5 | 67.6 | 15 / 35 | 5330 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 98 | 36% |
| tzu.TheArtOfWar 1.2 | 57 | 68% |
| wompi.Quokka 1.6 | 16 | 94% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 78% |
| jwirde.Gort 2.0 | 8 | 100% |
| disan.Chair 2.2.0 | 8 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 162 of 280 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 85 | 52% | 127 |
| tzu.TheArtOfWar 1.2 | 37 | 23% | 67 |
| wompi.Quokka 1.6 | 12 | 7% | 23 |
| jwirde.Gort 2.0 | 11 | 7% | 25 |
| amk.jointstrike.JointStrike 0.2 | 6 | 4% | 9 |
| disan.Chair 2.2.0 | 4 | 2% | 9 |
| stf.PanzerGeneral 0.1 | 4 | 2% | 8 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 2% | 8 |
| sample.Crazy 1.0 | 0 | 0% | 4 |

## Melee bench: F45

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 82.8 | 112 / 280 | 2.55 | 19.1% | 47388 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS3 0.1 | 1.0 | 19.1% | 112 |
| eem.IWillFireNoBullet v2.8 | 2.1 | 12.7% | 138 |
| jje.BagPuss 1.2 | 3.1 | 11.6% | 7 |
| myl.nano.Graviton 1.10 | 4.5 | 10.1% | 3 |
| sul.Lunar 1.1 | 4.6 | 10.4% | 5 |
| fm.claire 1.7 | 6.0 | 9.0% | 2 |
| hvilela.HVilela 0.9 | 7.1 | 8.3% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.6 | 7.9% | 5 |
| wit.Deep7 2.0 | 9.4 | 5.4% | 7 |
| abud.ThirdRobo 1.0 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 81.9 | 13 / 35 | 5811 |
| 2 | 1 | 69.1 | 82.5 | 17 / 35 | 6052 |
| 3 | 1 | 69.1 | 83.2 | 16 / 35 | 6071 |
| 4 | 1 | 69.0 | 84.8 | 15 / 35 | 5755 |
| 5 | 1 | 67.8 | 81.3 | 11 / 35 | 5749 |
| 6 | 1 | 69.9 | 86.7 | 15 / 35 | 6390 |
| 7 | 1 | 66.3 | 76.8 | 13 / 35 | 5647 |
| 8 | 1 | 69.1 | 85.4 | 12 / 35 | 5913 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 127 | 28% |
| sul.Lunar 1.1 | 29 | 100% |
| jje.BagPuss 1.2 | 21 | 81% |
| pez.mini.ChironexFleckeri 0.5 | 15 | 87% |
| myl.nano.Graviton 1.10 | 13 | 100% |
| wit.Deep7 2.0 | 3 | 33% |
| fm.claire 1.7 | 2 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 168 of 280 rounds, at a mean tick of 1741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 94 | 56% | 0 |
| jje.BagPuss 1.2 | 23 | 14% | 67 |
| sul.Lunar 1.1 | 13 | 8% | 71 |
| pez.mini.ChironexFleckeri 0.5 | 9 | 5% | 29 |
| myl.nano.Graviton 1.10 | 8 | 5% | 44 |
| hvilela.HVilela 0.9 | 7 | 4% | 24 |
| fm.claire 1.7 | 6 | 4% | 16 |
| wit.Deep7 2.0 | 6 | 4% | 13 |
| abud.ThirdRobo 1.0 | 2 | 1% | 11 |

## Melee bench: F46

hadur117.micro.SaorS3 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 68.2 | 32 / 280 | 3.86 | 14.4% | 35960 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 17.2% | 109 |
| rsalesc.melee.Medina 0.4.5 | 1.6 | 16.4% | 113 |
| hadur117.micro.SaorS3 0.1 | 2.9 | 14.4% | 32 |
| mz.MicroSheep 1.0 | 4.5 | 10.4% | 5 |
| cx.Princess 1.0 | 4.8 | 10.0% | 17 |
| sadoner.killer 0.2 | 5.8 | 8.9% | 1 |
| arthord.NanoSatanMelee Beta | 7.1 | 7.4% | 2 |
| jeremyreeder.collective.Prophet 5 | 7.9 | 6.2% | 0 |
| kurios.DOSexe .9a | 9.1 | 5.1% | 0 |
| mbro.Detektor3 0.1.1 | 9.9 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 62.2 | 2 / 35 | 4028 |
| 2 | 3 | 63.1 | 71.7 | 1 / 35 | 4733 |
| 3 | 2 | 64.4 | 75.6 | 6 / 35 | 4911 |
| 4 | 3 | 62.6 | 69.8 | 5 / 35 | 4376 |
| 5 | 3 | 59.7 | 60.6 | 4 / 35 | 4310 |
| 6 | 3 | 62.1 | 67.9 | 5 / 35 | 4700 |
| 7 | 3 | 63.4 | 70.8 | 4 / 35 | 4775 |
| 8 | 3 | 61.5 | 67.0 | 5 / 35 | 4127 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 46 | 35% |
| rsalesc.melee.Medina 0.4.5 | 35 | 11% |
| arthord.NanoSatanMelee Beta | 4 | 100% |
| mz.MicroSheep 1.0 | 4 | 100% |
| cx.Princess 1.0 | 4 | 75% |
| kurios.DOSexe .9a | 1 | 100% |

Hadur died in 248 of 280 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 94 | 38% | 98 |
| kc.mini.Mirage 0.2 | 92 | 37% | 113 |
| cx.Princess 1.0 | 19 | 8% | 22 |
| mz.MicroSheep 1.0 | 11 | 4% | 12 |
| jeremyreeder.collective.Prophet 5 | 8 | 3% | 8 |
| sadoner.killer 0.2 | 8 | 3% | 8 |
| arthord.NanoSatanMelee Beta | 7 | 3% | 10 |
| kurios.DOSexe .9a | 5 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 4 | 2% | 5 |

