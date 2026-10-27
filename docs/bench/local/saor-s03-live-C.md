# Bench suite: suite.txt

## Melee bench: F01

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 68.6 | 28 / 280 | 3.83 | 14.0% | 35587 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.8% | 190 |
| hadur117.micro.SaorC 0.1 | 2.1 | 14.0% | 28 |
| sgp.JollyNinja 3.53 | 3.5 | 11.9% | 33 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 11.3% | 11 |
| mz.MicroGodMelee 1 | 4.4 | 11.1% | 15 |
| lorneswork.Predator 1.0 | 5.8 | 9.8% | 3 |
| adt.Ar2 1.0 | 7.1 | 7.7% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.7% | 0 |
| skm.butterfly 1.0 | 8.8 | 5.2% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 67.6 | 6 / 35 | 4543 |
| 2 | 2 | 63.1 | 73.0 | 3 / 35 | 4522 |
| 3 | 2 | 60.8 | 64.1 | 4 / 35 | 4526 |
| 4 | 2 | 63.3 | 75.2 | 3 / 35 | 4686 |
| 5 | 2 | 60.7 | 66.0 | 3 / 35 | 4306 |
| 6 | 2 | 60.2 | 67.0 | 0 / 35 | 4269 |
| 7 | 3 | 59.2 | 61.3 | 3 / 35 | 4199 |
| 8 | 2 | 63.7 | 74.6 | 6 / 35 | 4536 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 88 | 3% |
| sgp.JollyNinja 3.53 | 13 | 46% |
| mz.MicroGodMelee 1 | 12 | 50% |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 78% |
| lorneswork.Predator 1.0 | 5 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 252 of 280 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 144 | 57% | 152 |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 10% | 27 |
| sgp.JollyNinja 3.53 | 23 | 9% | 29 |
| mz.MicroGodMelee 1 | 21 | 8% | 24 |
| lorneswork.Predator 1.0 | 14 | 6% | 21 |
| adt.Ar2 1.0 | 9 | 4% | 10 |
| skm.butterfly 1.0 | 6 | 2% | 7 |
| kawigi.sbf.FloodSonnet 0.9 | 5 | 2% | 5 |
| mym.EdgeStalker 1.0 | 5 | 2% | 5 |

## Melee bench: F02

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 74.5 | 99 / 280 | 3.30 | 16.1% | 36740 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.1% | 99 |
| pulsar.PulsarMax 0.8.9 | 2.1 | 14.4% | 68 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.9 | 13.5% | 57 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.0% | 6 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.5 | 9.4% | 12 |
| fnc.bandit.Bandit 5.2.0 | 6.5 | 8.4% | 2 |
| Noran.BitchingElk 0.054 | 6.9 | 8.2% | 18 |
| sch.Simone 0.3d | 7.4 | 7.5% | 13 |
| stelo.PatternRobot 1.0 | 8.9 | 6.1% | 5 |
| fullsail.SweetTea 1.1 | 9.9 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 74.3 | 13 / 35 | 4456 |
| 2 | 1 | 64.1 | 75.9 | 14 / 35 | 4348 |
| 3 | 1 | 62.9 | 69.8 | 9 / 35 | 4749 |
| 4 | 1 | 65.4 | 77.5 | 13 / 35 | 4638 |
| 5 | 1 | 65.2 | 78.4 | 12 / 35 | 4795 |
| 6 | 1 | 64.5 | 76.2 | 12 / 35 | 4586 |
| 7 | 1 | 62.6 | 68.9 | 12 / 35 | 4455 |
| 8 | 1 | 65.0 | 74.9 | 14 / 35 | 4713 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 55 | 60% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 49 | 53% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 94% |
| sch.Simone 0.3d | 8 | 63% |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 86% |
| fullsail.SweetTea 1.1 | 7 | 86% |
| Noran.BitchingElk 0.054 | 7 | 57% |
| stelo.PatternRobot 1.0 | 5 | 80% |
| fnc.bandit.Bandit 5.2.0 | 1 | 0% |

Hadur died in 184 of 280 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 56 | 30% | 83 |
| pulsar.PulsarMax 0.8.9 | 53 | 29% | 82 |
| lrem.micro.SpikeSoldier 0.4 | 23 | 13% | 33 |
| sch.Simone 0.3d | 13 | 7% | 19 |
| stelo.PatternRobot 1.0 | 13 | 7% | 17 |
| Noran.BitchingElk 0.054 | 7 | 4% | 16 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 4% | 14 |
| fnc.bandit.Bandit 5.2.0 | 7 | 4% | 9 |
| fullsail.SweetTea 1.1 | 5 | 3% | 7 |

## Melee bench: F03

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 74.8 | 136 / 280 | 3.27 | 16.6% | 41496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 16.6% | 136 |
| radnor.DoctorBob 1.42 | 1.9 | 15.0% | 65 |
| kawigi.nano.Lib 1.0 | 3.4 | 12.6% | 34 |
| vuen.Cake 2.51 | 3.6 | 12.8% | 40 |
| urdos.URDOS 1.3 | 5.0 | 10.0% | 3 |
| adt.Ar1 2.1 | 6.3 | 7.9% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 7.4% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.4 | 6.7% | 0 |
| oa.weak.FlyMk1 0.1 | 8.4 | 6.4% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 75.9 | 16 / 35 | 5124 |
| 2 | 1 | 64.0 | 71.7 | 16 / 35 | 4891 |
| 3 | 1 | 67.5 | 81.0 | 24 / 35 | 5458 |
| 4 | 1 | 65.1 | 74.0 | 16 / 35 | 5339 |
| 5 | 1 | 67.0 | 80.3 | 19 / 35 | 5586 |
| 6 | 1 | 64.7 | 72.1 | 17 / 35 | 5374 |
| 7 | 2 | 62.2 | 67.6 | 14 / 35 | 4561 |
| 8 | 1 | 65.1 | 75.6 | 14 / 35 | 5163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 54 | 81% |
| vuen.Cake 2.51 | 49 | 90% |
| radnor.DoctorBob 1.42 | 49 | 69% |
| urdos.URDOS 1.3 | 9 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |

Hadur died in 144 of 280 rounds, at a mean tick of 554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 43 | 30% | 80 |
| kawigi.nano.Lib 1.0 | 34 | 24% | 84 |
| vuen.Cake 2.51 | 18 | 13% | 48 |
| urdos.URDOS 1.3 | 16 | 11% | 25 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 8% | 12 |
| adt.Ar1 2.1 | 8 | 6% | 10 |
| ghent.ArthurPanzergon 1.0.0 | 6 | 4% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 5 | 3% | 9 |
| oa.weak.FlyMk1 0.1 | 2 | 1% | 5 |

## Melee bench: F04

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 72.6 | 9 / 280 | 3.47 | 14.9% | 39384 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.0% | 248 |
| hadur117.micro.SaorC 0.1 | 2.0 | 14.9% | 9 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.3% | 15 |
| TNT.TNT 0.99.1 | 4.1 | 10.9% | 6 |
| josago.Jorgito 0.16 | 4.9 | 9.6% | 1 |
| tj.zombie1n 1.0.1 | 6.3 | 7.0% | 0 |
| css.Delitioner 0.11 | 6.8 | 6.8% | 0 |
| rampancy.Durandal 2.1d | 8.1 | 5.3% | 0 |
| spin.Bugstard 0.012b | 9.4 | 4.1% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 72.7 | 1 / 35 | 4864 |
| 2 | 2 | 63.8 | 73.3 | 1 / 35 | 4699 |
| 3 | 2 | 63.7 | 71.1 | 0 / 35 | 4973 |
| 4 | 2 | 64.7 | 75.2 | 2 / 35 | 4975 |
| 5 | 2 | 64.1 | 71.1 | 2 / 35 | 4845 |
| 6 | 2 | 64.9 | 73.3 | 1 / 35 | 5233 |
| 7 | 2 | 64.2 | 75.9 | 2 / 35 | 4758 |
| 8 | 2 | 63.2 | 67.9 | 0 / 35 | 5037 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 86 | 5% |
| apc.LeeroyJenkins2 1.0 | 5 | 60% |
| TNT.TNT 0.99.1 | 4 | 50% |

Hadur died in 271 of 280 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 200 | 74% | 205 |
| apc.LeeroyJenkins2 1.0 | 30 | 11% | 32 |
| josago.Jorgito 0.16 | 15 | 6% | 14 |
| TNT.TNT 0.99.1 | 9 | 3% | 11 |
| css.Delitioner 0.11 | 6 | 2% | 6 |
| tj.zombie1n 1.0.1 | 5 | 2% | 5 |
| rampancy.Durandal 2.1d | 4 | 1% | 5 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |

## Melee bench: F05

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 56.5 | 9 / 280 | 4.91 | 11.8% | 30993 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.6% | 159 |
| justin.DemonicRage 3.4 | 1.8 | 17.2% | 77 |
| wompi.Numbat 2.1 | 3.3 | 12.9% | 22 |
| hadur117.micro.SaorC 0.1 | 3.8 | 11.8% | 9 |
| ms.Ares 0.19 | 5.5 | 9.1% | 7 |
| axeBots.HataMoto 3.09 | 5.5 | 9.1% | 6 |
| supersample.SuperBoxBot 1.0 | 7.0 | 6.5% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.1 | 5.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.7% | 0 |
| GarmBox.Oranges 1.0 | 9.6 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.0 | 56.2 | 0 / 35 | 3808 |
| 2 | 3 | 59.7 | 59.4 | 5 / 35 | 4131 |
| 3 | 4 | 56.5 | 55.6 | 1 / 35 | 3731 |
| 4 | 3 | 57.4 | 57.1 | 1 / 35 | 3738 |
| 5 | 4 | 57.0 | 57.8 | 0 / 35 | 3623 |
| 6 | 4 | 57.8 | 55.9 | 0 / 35 | 4036 |
| 7 | 4 | 55.9 | 53.3 | 1 / 35 | 3832 |
| 8 | 4 | 57.9 | 57.1 | 1 / 35 | 4094 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 20 | 10% |
| justin.DemonicRage 3.4 | 16 | 13% |
| wompi.Numbat 2.1 | 11 | 45% |
| ms.Ares 0.19 | 3 | 0% |
| axeBots.HataMoto 3.09 | 1 | 0% |

Hadur died in 272 of 280 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 90 | 33% | 91 |
| justin.DemonicRage 3.4 | 77 | 28% | 79 |
| wompi.Numbat 2.1 | 43 | 16% | 46 |
| supersample.SuperBoxBot 1.0 | 20 | 7% | 21 |
| ms.Ares 0.19 | 20 | 7% | 20 |
| axeBots.HataMoto 3.09 | 10 | 4% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 9 | 3% | 9 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 76.2 | 111 / 280 | 3.14 | 16.1% | 33676 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 16.1% | 111 |
| jekl.StoneGhost 0.7 | 2.4 | 14.4% | 40 |
| origin.SleepSiphon 1.7b | 2.8 | 13.8% | 69 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.1 | 11.5% | 27 |
| mld.Wisdom 1.0 | 4.5 | 11.0% | 12 |
| gg.Wolverine 2.0 | 6.1 | 8.6% | 5 |
| spinnercat.Omen 1.0 | 7.8 | 7.1% | 1 |
| DBall.NUKE 0.1 | 8.0 | 7.2% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 8.1 | 7.0% | 12 |
| sample.Fire 1.0 | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 74.6 | 12 / 35 | 4529 |
| 2 | 1 | 63.2 | 74.3 | 12 / 35 | 3850 |
| 3 | 1 | 66.4 | 83.5 | 14 / 35 | 4226 |
| 4 | 2 | 62.3 | 68.6 | 13 / 35 | 3830 |
| 5 | 2 | 60.4 | 65.1 | 7 / 35 | 3949 |
| 6 | 1 | 66.0 | 79.7 | 19 / 35 | 4122 |
| 7 | 1 | 66.1 | 79.4 | 15 / 35 | 4724 |
| 8 | 1 | 67.3 | 84.8 | 19 / 35 | 4446 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 55 | 78% |
| origin.SleepSiphon 1.7b | 53 | 45% |
| pe.minimelee.SandboxMiniMelee 1.1 | 28 | 68% |
| gg.Wolverine 2.0 | 11 | 64% |
| mld.Wisdom 1.0 | 7 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 83% |
| DBall.NUKE 0.1 | 5 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 169 of 280 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 58 | 34% | 86 |
| jekl.StoneGhost 0.7 | 39 | 23% | 75 |
| mld.Wisdom 1.0 | 26 | 15% | 35 |
| pe.minimelee.SandboxMiniMelee 1.1 | 24 | 14% | 44 |
| gg.Wolverine 2.0 | 12 | 7% | 16 |
| spinnercat.Omen 1.0 | 5 | 3% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 1% | 7 |
| sample.Fire 1.0 | 2 | 1% | 5 |
| DBall.NUKE 0.1 | 1 | 1% | 8 |

## Melee bench: F07

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 80.8 | 78 / 280 | 2.73 | 17.4% | 44101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.8 | 17.6% | 73 |
| rtk.Tachikoma 1.0 | 2.1 | 17.2% | 86 |
| hadur117.micro.SaorC 0.1 | 2.1 | 17.4% | 78 |
| franzor.Lizt 1.3.1 | 4.3 | 11.0% | 26 |
| oog.melee.CapuletDroid 1.1 | 4.9 | 10.1% | 15 |
| lrem.micro.MoggFanatic 0.2 | 6.4 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 8.0% | 2 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.3% | 0 |
| sample.Target 1.0 | 9.1 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 9.9 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.1 | 80.6 | 9 / 35 | 5630 |
| 2 | 2 | 68.3 | 78.7 | 10 / 35 | 6048 |
| 3 | 1 | 69.6 | 84.4 | 11 / 35 | 5716 |
| 4 | 3 | 67.2 | 78.7 | 9 / 35 | 5063 |
| 5 | 2 | 68.6 | 84.8 | 11 / 35 | 5451 |
| 6 | 3 | 64.8 | 71.7 | 8 / 35 | 4606 |
| 7 | 2 | 68.7 | 81.9 | 12 / 35 | 5678 |
| 8 | 2 | 69.2 | 85.1 | 8 / 35 | 5909 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 99 | 42% |
| rsalesc.melee.Monk 0.3.6c | 44 | 7% |
| oog.melee.CapuletDroid 1.1 | 27 | 67% |
| franzor.Lizt 1.3.1 | 23 | 57% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 202 of 280 rounds, at a mean tick of 1175. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 85 | 42% | 140 |
| rsalesc.melee.Monk 0.3.6c | 67 | 33% | 95 |
| oog.melee.CapuletDroid 1.1 | 21 | 10% | 17 |
| franzor.Lizt 1.3.1 | 12 | 6% | 1 |
| exauge.GateKeeper 1.1.121g | 9 | 4% | 13 |
| lrem.micro.MoggFanatic 0.2 | 7 | 3% | 11 |
| skm.PateranBotlock2 1.0 | 1 | 0% | 1 |

## Melee bench: F08

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 72.8 | 108 / 280 | 3.45 | 16.4% | 39943 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 16.4% | 108 |
| tm.Yuugao 1.0 | 2.1 | 13.6% | 63 |
| shrub.Vapour v159 | 3.1 | 11.9% | 38 |
| com.spp.robocode.MostlyHarmless 010 | 4.3 | 11.2% | 33 |
| Krabb.sliNk.Garm 0.9u | 4.8 | 10.6% | 19 |
| m3thos.Eva00 1.1 | 6.0 | 9.1% | 6 |
| jwst.DAD.DarkAndDarker 1.1 | 6.6 | 8.4% | 13 |
| qualidafial.MajorDick 1.0.1 | 8.1 | 7.0% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 6.0% | 0 |
| SHAM.WOW 1.4 | 9.5 | 6.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 72.7 | 17 / 35 | 5244 |
| 2 | 2 | 62.0 | 65.7 | 11 / 35 | 4609 |
| 3 | 1 | 60.6 | 62.2 | 9 / 35 | 4705 |
| 4 | 1 | 66.3 | 79.7 | 18 / 35 | 4855 |
| 5 | 1 | 67.2 | 81.9 | 16 / 35 | 5156 |
| 6 | 1 | 64.3 | 71.7 | 13 / 35 | 4942 |
| 7 | 2 | 64.0 | 71.4 | 9 / 35 | 5013 |
| 8 | 1 | 66.3 | 76.8 | 15 / 35 | 5419 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 53 | 51% |
| shrub.Vapour v159 | 38 | 71% |
| Krabb.sliNk.Garm 0.9u | 25 | 92% |
| com.spp.robocode.MostlyHarmless 010 | 23 | 52% |
| jwst.DAD.DarkAndDarker 1.1 | 13 | 77% |
| m3thos.Eva00 1.1 | 7 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 175 of 280 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 58 | 33% | 89 |
| com.spp.robocode.MostlyHarmless 010 | 32 | 18% | 43 |
| shrub.Vapour v159 | 30 | 17% | 47 |
| Krabb.sliNk.Garm 0.9u | 12 | 7% | 30 |
| SHAM.WOW 1.4 | 10 | 6% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 5% | 24 |
| zyx.nano.BacillusComma 1.0 | 9 | 5% | 12 |
| qualidafial.MajorDick 1.0.1 | 8 | 5% | 9 |
| m3thos.Eva00 1.1 | 7 | 4% | 13 |

## Melee bench: F09

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 60.7 | 32 / 280 | 4.54 | 12.5% | 28041 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.6% | 149 |
| kc.micro.Figment 1.0 | 2.4 | 13.4% | 45 |
| hadur117.micro.SaorC 0.1 | 2.8 | 12.5% | 32 |
| yagami.Tidus 0.11 | 4.5 | 10.8% | 5 |
| pedersen.Grishnakh 1.0 | 4.5 | 10.8% | 19 |
| mc2.enemy.Original 0.9 | 5.9 | 10.1% | 24 |
| dft.Calliope 5.6 | 7.0 | 7.8% | 5 |
| step.nanoPri 1.0 | 8.1 | 6.3% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.1 | 5.6% | 1 |
| rdm.Dueler 0.4x | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.2 | 66.0 | 8 / 35 | 3583 |
| 2 | 2 | 58.5 | 61.9 | 3 / 35 | 3508 |
| 3 | 3 | 60.1 | 67.6 | 5 / 35 | 3397 |
| 4 | 2 | 57.9 | 60.0 | 4 / 35 | 3532 |
| 5 | 3 | 58.2 | 60.6 | 5 / 35 | 3744 |
| 6 | 3 | 57.4 | 60.3 | 2 / 35 | 3276 |
| 7 | 4 | 56.4 | 56.8 | 3 / 35 | 3544 |
| 8 | 3 | 54.7 | 52.4 | 2 / 35 | 3457 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 46 | 11% |
| kc.micro.Figment 1.0 | 30 | 27% |
| pedersen.Grishnakh 1.0 | 10 | 60% |
| mc2.enemy.Original 0.9 | 9 | 56% |
| yagami.Tidus 0.11 | 8 | 75% |
| dft.Calliope 5.6 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 249 of 280 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 99 | 40% | 104 |
| kc.micro.Figment 1.0 | 81 | 33% | 92 |
| mc2.enemy.Original 0.9 | 17 | 7% | 21 |
| pedersen.Grishnakh 1.0 | 14 | 6% | 17 |
| yagami.Tidus 0.11 | 13 | 5% | 20 |
| robar.nano.Assertive_Melee 0.2 | 9 | 4% | 10 |
| step.nanoPri 1.0 | 9 | 4% | 8 |
| rdm.Dueler 0.4x | 6 | 2% | 6 |
| dft.Calliope 5.6 | 1 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 80.5 | 114 / 280 | 2.75 | 17.0% | 41364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 17.0% | 114 |
| DTF.Kludgy 1.2b | 2.1 | 14.9% | 80 |
| ne.Chimera 1.2 | 3.3 | 12.4% | 14 |
| ejb.Polaris 1.0.1 | 3.6 | 12.5% | 37 |
| vStar.RAFzilla 2.15 | 5.1 | 10.9% | 11 |
| tvv.micro.Antares 1.1.1 | 5.8 | 10.2% | 16 |
| kurios.DOSexe .9b | 8.0 | 5.9% | 5 |
| sam.Samspin 1.0 | 8.0 | 6.0% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.1 | 5.8% | 0 |
| donjezza.Muncho 1.0 | 9.9 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 80.0 | 15 / 35 | 5112 |
| 2 | 1 | 67.6 | 84.8 | 15 / 35 | 5443 |
| 3 | 1 | 66.4 | 81.0 | 18 / 35 | 5243 |
| 4 | 1 | 65.0 | 78.1 | 12 / 35 | 5066 |
| 5 | 1 | 66.4 | 82.2 | 13 / 35 | 5279 |
| 6 | 1 | 66.5 | 82.2 | 13 / 35 | 5100 |
| 7 | 2 | 66.8 | 82.9 | 12 / 35 | 5157 |
| 8 | 1 | 64.0 | 73.0 | 16 / 35 | 4964 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 52 | 19% |
| ejb.Polaris 1.0.1 | 50 | 66% |
| ne.Chimera 1.2 | 24 | 83% |
| tvv.micro.Antares 1.1.1 | 23 | 78% |
| vStar.RAFzilla 2.15 | 21 | 95% |
| donjezza.Muncho 1.0 | 6 | 83% |
| kurios.DOSexe .9b | 5 | 100% |
| sam.Samspin 1.0 | 3 | 100% |

Hadur died in 166 of 280 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 79 | 48% | 89 |
| ejb.Polaris 1.0.1 | 28 | 17% | 64 |
| ne.Chimera 1.2 | 25 | 15% | 46 |
| tvv.micro.Antares 1.1.1 | 18 | 11% | 29 |
| vStar.RAFzilla 2.15 | 5 | 3% | 29 |
| kurios.DOSexe .9b | 3 | 2% | 9 |
| sam.Samspin 1.0 | 3 | 2% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 2% | 3 |
| donjezza.Muncho 1.0 | 2 | 1% | 6 |

## Melee bench: F11

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 68.4 | 54 / 280 | 3.85 | 14.4% | 33763 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.7% | 140 |
| hadur117.micro.SaorC 0.1 | 2.0 | 14.4% | 54 |
| cx.mini.Nimrod 0.55 | 3.1 | 12.1% | 27 |
| djc.DynaBot 0.1.1 | 4.0 | 10.7% | 17 |
| br2.MobyDickBot 1.6 | 5.3 | 9.2% | 16 |
| rdt199.Warlord 0.73 | 6.6 | 8.5% | 16 |
| uji.YellohFellah 1.0 | 6.8 | 8.4% | 11 |
| KiraNL.Chupacabra 0.4 | 7.3 | 7.7% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 6.0% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 68.6 | 6 / 35 | 4012 |
| 2 | 2 | 63.7 | 74.3 | 10 / 35 | 4319 |
| 3 | 2 | 60.9 | 66.0 | 7 / 35 | 4201 |
| 4 | 2 | 63.4 | 75.6 | 9 / 35 | 4305 |
| 5 | 2 | 64.3 | 77.5 | 10 / 35 | 4503 |
| 6 | 2 | 59.4 | 61.3 | 4 / 35 | 4156 |
| 7 | 2 | 61.2 | 67.6 | 4 / 35 | 4451 |
| 8 | 2 | 56.6 | 56.2 | 4 / 35 | 3816 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 59 | 12% |
| cx.mini.Nimrod 0.55 | 21 | 67% |
| djc.DynaBot 0.1.1 | 15 | 80% |
| uji.YellohFellah 1.0 | 9 | 67% |
| br2.MobyDickBot 1.6 | 9 | 56% |
| rdt199.Warlord 0.73 | 8 | 63% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| KiraNL.Chupacabra 0.4 | 2 | 50% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 226 of 280 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 115 | 51% | 128 |
| cx.mini.Nimrod 0.55 | 37 | 16% | 47 |
| KiraNL.Chupacabra 0.4 | 15 | 7% | 16 |
| rdt199.Warlord 0.73 | 14 | 6% | 21 |
| jeremyreeder.Vincent 2011.12.09 | 13 | 6% | 13 |
| br2.MobyDickBot 1.6 | 12 | 5% | 20 |
| uji.YellohFellah 1.0 | 9 | 4% | 15 |
| stelo.MirrorNano 1.3 | 6 | 3% | 6 |
| djc.DynaBot 0.1.1 | 5 | 2% | 14 |

## Melee bench: F12

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 73.5 | 87 / 280 | 3.38 | 15.1% | 28939 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.8 | 15.1% | 87 |
| nat.PallasHawk 1.0 | 2.3 | 13.9% | 65 |
| bts.wiki.RipCurl 0.9b | 2.8 | 13.9% | 58 |
| darkcanuck.Leon 1.01 | 3.3 | 13.3% | 39 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.6% | 23 |
| jrm.Test0 1.0 | 6.8 | 7.6% | 1 |
| cs.sheldor.Talon 1.1 | 7.1 | 7.4% | 1 |
| jp.Perpy 16.0 | 7.3 | 7.2% | 2 |
| jaybot.bots.Oddball 4.0 | 9.4 | 5.5% | 3 |
| stuff.Vlad 0.1 | 9.5 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 71.7 | 12 / 35 | 3879 |
| 2 | 3 | 61.3 | 70.2 | 9 / 35 | 3607 |
| 3 | 2 | 61.6 | 70.2 | 12 / 35 | 3428 |
| 4 | 3 | 61.5 | 71.7 | 8 / 35 | 3331 |
| 5 | 1 | 66.5 | 83.5 | 18 / 35 | 3858 |
| 6 | 1 | 63.6 | 78.1 | 9 / 35 | 3466 |
| 7 | 1 | 62.7 | 71.4 | 10 / 35 | 3686 |
| 8 | 2 | 61.6 | 71.4 | 9 / 35 | 3684 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 54 | 50% |
| bts.wiki.RipCurl 0.9b | 36 | 56% |
| darkcanuck.Leon 1.01 | 35 | 74% |
| brainfade.melee.Genghis 0.36 | 14 | 50% |
| jrm.Test0 1.0 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 0% |

Hadur died in 197 of 280 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 51 | 26% | 77 |
| bts.wiki.RipCurl 0.9b | 51 | 26% | 70 |
| darkcanuck.Leon 1.01 | 26 | 13% | 56 |
| brainfade.melee.Genghis 0.36 | 24 | 12% | 29 |
| jp.Perpy 16.0 | 16 | 8% | 15 |
| jrm.Test0 1.0 | 15 | 8% | 15 |
| cs.sheldor.Talon 1.1 | 9 | 5% | 11 |
| stuff.Vlad 0.1 | 3 | 2% | 4 |
| jaybot.bots.Oddball 4.0 | 2 | 1% | 3 |

## Melee bench: F13

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 64.0 | 17 / 280 | 4.24 | 12.7% | 30591 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.3 | 17.3% | 80 |
| mn.Combat 3.25.0 | 1.8 | 16.8% | 129 |
| hadur117.micro.SaorC 0.1 | 3.5 | 12.7% | 17 |
| shinh.Entangled 0.3 | 3.6 | 12.8% | 39 |
| gh.micro.Gruweltje 0.7 | 4.9 | 11.7% | 12 |
| apc.Colossus2 0.17 | 6.0 | 8.1% | 1 |
| stelo.Wang 1.0 | 7.0 | 6.9% | 3 |
| ayk.WallHugger 1.0 | 8.1 | 5.4% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.7% | 0 |
| sample.Tracker 1.0 | 9.9 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.8 | 65.7 | 1 / 35 | 3679 |
| 2 | 3 | 59.0 | 62.2 | 0 / 35 | 3901 |
| 3 | 5 | 56.3 | 56.8 | 1 / 35 | 3538 |
| 4 | 4 | 59.4 | 61.0 | 3 / 35 | 3911 |
| 5 | 3 | 62.4 | 72.1 | 5 / 35 | 4123 |
| 6 | 3 | 61.5 | 68.9 | 3 / 35 | 4074 |
| 7 | 3 | 58.4 | 61.6 | 2 / 35 | 3799 |
| 8 | 4 | 58.8 | 63.8 | 2 / 35 | 3566 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 29 | 24% |
| mn.Combat 3.25.0 | 27 | 22% |
| shinh.Entangled 0.3 | 10 | 20% |
| gh.micro.Gruweltje 0.7 | 5 | 40% |

Hadur died in 263 of 280 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 102 | 39% | 112 |
| mn.Combat 3.25.0 | 74 | 28% | 79 |
| shinh.Entangled 0.3 | 38 | 14% | 39 |
| stelo.Wang 1.0 | 16 | 6% | 17 |
| gh.micro.Gruweltje 0.7 | 15 | 6% | 17 |
| maribo.FollowFire 1 | 10 | 4% | 10 |
| apc.Colossus2 0.17 | 4 | 2% | 4 |
| ayk.WallHugger 1.0 | 3 | 1% | 2 |
| sample.Tracker 1.0 | 1 | 0% | 0 |

## Melee bench: F14

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 72.5 | 133 / 280 | 3.48 | 16.2% | 38812 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 16.2% | 133 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.9% | 42 |
| catcat20.shape.Theta 0.018 | 2.8 | 13.2% | 66 |
| Lo_Ian.Gandalf_V4 4.0 | 4.8 | 10.3% | 7 |
| sanyi.mikrobi.Roberto 1.0 | 5.6 | 9.7% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 9.3% | 3 |
| co.edu.usb.rc.LidisTron 1.0 | 6.4 | 9.4% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 8.7% | 15 |
| pa.Improved 1.0 | 9.0 | 6.1% | 2 |
| sample.TrackFire 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 74.3 | 16 / 35 | 4764 |
| 2 | 1 | 64.8 | 71.1 | 15 / 35 | 4842 |
| 3 | 2 | 62.7 | 69.2 | 15 / 35 | 4247 |
| 4 | 1 | 65.4 | 75.6 | 16 / 35 | 4975 |
| 5 | 2 | 63.7 | 66.3 | 17 / 35 | 4745 |
| 6 | 1 | 64.6 | 71.1 | 17 / 35 | 5037 |
| 7 | 1 | 66.5 | 77.8 | 19 / 35 | 5174 |
| 8 | 1 | 66.0 | 74.6 | 18 / 35 | 5028 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 94 | 83% |
| catcat20.shape.Theta 0.018 | 52 | 35% |
| co.edu.usb.rc.LidisTron 1.0 | 14 | 93% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 75% |
| pa.Improved 1.0 | 2 | 50% |

Hadur died in 147 of 280 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 59 | 40% | 138 |
| catcat20.shape.Theta 0.018 | 48 | 33% | 67 |
| sanyi.mikrobi.Roberto 1.0 | 9 | 6% | 20 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 5% | 9 |
| co.edu.usb.rc.LidisTron 1.0 | 7 | 5% | 10 |
| sample.TrackFire 1.0 | 6 | 4% | 7 |
| pa.Improved 1.0 | 5 | 3% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 2% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 1% | 16 |

## Melee bench: F15

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 81.5 | 135 / 280 | 2.66 | 18.3% | 43826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.3% | 135 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.3% | 22 |
| emp.Yngwie 1.11 | 2.8 | 13.3% | 68 |
| mld.DustBunny 3.8 | 3.5 | 12.6% | 16 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.0% | 17 |
| kawigi.robot.Girl 1.2 | 5.6 | 9.3% | 19 |
| Grystrion.TrackerWO 1.0 | 7.3 | 7.2% | 1 |
| lambdaxy.TBot 0.1 | 7.6 | 6.7% | 1 |
| divineomega.TrialBot 0.003 | 9.4 | 5.3% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.6 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 81.9 | 15 / 35 | 5891 |
| 2 | 1 | 67.3 | 84.1 | 14 / 35 | 5236 |
| 3 | 1 | 66.7 | 77.8 | 16 / 35 | 5306 |
| 4 | 1 | 66.1 | 76.5 | 13 / 35 | 5278 |
| 5 | 1 | 68.0 | 80.6 | 15 / 35 | 5548 |
| 6 | 1 | 69.0 | 83.2 | 25 / 35 | 5223 |
| 7 | 1 | 66.9 | 80.3 | 16 / 35 | 5444 |
| 8 | 1 | 69.8 | 87.9 | 21 / 35 | 5900 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 68 | 47% |
| kawigi.micro.Shiz 1.1 | 44 | 95% |
| mld.DustBunny 3.8 | 38 | 84% |
| kawigi.robot.Girl 1.2 | 21 | 71% |
| cb.nano.Insomnia 1.0 | 14 | 57% |
| divineomega.TrialBot 0.003 | 5 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 146 of 280 rounds, at a mean tick of 1012. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 62 | 42% | 103 |
| cb.nano.Insomnia 1.0 | 23 | 16% | 16 |
| kawigi.robot.Girl 1.2 | 17 | 12% | 23 |
| mld.DustBunny 3.8 | 15 | 10% | 51 |
| kawigi.micro.Shiz 1.1 | 11 | 8% | 48 |
| Grystrion.TrackerWO 1.0 | 6 | 4% | 9 |
| divineomega.TrialBot 0.003 | 5 | 3% | 15 |
| lambdaxy.TBot 0.1 | 4 | 3% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 3 | 2% | 8 |

## Melee bench: F16

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 79.1 | 65 / 280 | 2.88 | 16.9% | 40448 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.1 | 17.8% | 136 |
| hadur117.micro.SaorC 0.1 | 1.9 | 16.9% | 65 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.7% | 8 |
| techdude.forest.FlamingForest 1.1 | 4.1 | 10.6% | 43 |
| tvv.nano.Polaris 1.2 | 5.4 | 9.3% | 12 |
| bvh.fnr.Fenrir 0.36l | 5.6 | 8.9% | 4 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 7.4% | 5 |
| divineomega.DivineBot 1.9.4.5 | 8.5 | 5.3% | 5 |
| repositorio.NanoStep 1.0 | 9.1 | 5.2% | 1 |
| asd.Cthulhu 1.3 | 9.4 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.9 | 81.0 | 7 / 35 | 5286 |
| 2 | 2 | 67.3 | 80.0 | 10 / 35 | 5249 |
| 3 | 2 | 66.8 | 83.2 | 7 / 35 | 5328 |
| 4 | 2 | 65.2 | 76.2 | 7 / 35 | 5087 |
| 5 | 2 | 65.8 | 78.1 | 8 / 35 | 4898 |
| 6 | 2 | 67.8 | 84.4 | 11 / 35 | 5207 |
| 7 | 1 | 65.0 | 75.6 | 9 / 35 | 4921 |
| 8 | 2 | 64.2 | 74.3 | 6 / 35 | 4472 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 113 | 16% |
| techdude.forest.FlamingForest 1.1 | 35 | 34% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 24 | 96% |
| bvh.fnr.Fenrir 0.36l | 6 | 100% |
| divineomega.DivineBot 1.9.4.5 | 5 | 80% |
| tvv.nano.Polaris 1.2 | 2 | 50% |
| stelo.IntrinsicVolatility 1.4 | 1 | 100% |

Hadur died in 215 of 280 rounds, at a mean tick of 1358. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 121 | 56% | 147 |
| techdude.forest.FlamingForest 1.1 | 30 | 14% | 42 |
| bvh.fnr.Fenrir 0.36l | 21 | 10% | 21 |
| tvv.nano.Polaris 1.2 | 12 | 6% | 15 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 10 | 5% | 24 |
| stelo.IntrinsicVolatility 1.4 | 8 | 4% | 12 |
| asd.Cthulhu 1.3 | 7 | 3% | 7 |
| divineomega.DivineBot 1.9.4.5 | 5 | 2% | 11 |
| repositorio.NanoStep 1.0 | 1 | 0% | 1 |

## Melee bench: F17

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 75.4 | 94 / 280 | 3.21 | 15.9% | 34800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 15.9% | 94 |
| et.Predator 1.8 | 2.4 | 13.5% | 42 |
| cx.BlestPain 1.41 | 3.6 | 12.0% | 49 |
| oog.melee.Mercutio 1.0 | 3.8 | 12.5% | 41 |
| nic.Nicator 2.4 | 4.8 | 11.2% | 24 |
| ahf.NanoAndrew .4 | 5.6 | 11.0% | 22 |
| maribo.melee.BMV 0.1 | 6.8 | 9.4% | 5 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.9% | 1 |
| tex.Longbot 0.4 | 8.8 | 5.6% | 0 |
| goblin.Bender 2.4 | 10.0 | 3.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 82.9 | 12 / 35 | 4494 |
| 2 | 1 | 67.7 | 84.4 | 13 / 35 | 5114 |
| 3 | 2 | 62.0 | 68.3 | 9 / 35 | 3861 |
| 4 | 1 | 63.5 | 73.7 | 10 / 35 | 4255 |
| 5 | 1 | 63.1 | 72.7 | 10 / 35 | 4152 |
| 6 | 1 | 62.4 | 66.7 | 13 / 35 | 4237 |
| 7 | 1 | 66.1 | 81.6 | 15 / 35 | 4329 |
| 8 | 1 | 63.8 | 73.3 | 12 / 35 | 4358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 44 | 68% |
| oog.melee.Mercutio 1.0 | 41 | 63% |
| cx.BlestPain 1.41 | 33 | 24% |
| nic.Nicator 2.4 | 26 | 58% |
| ahf.NanoAndrew .4 | 15 | 67% |
| maribo.melee.BMV 0.1 | 5 | 80% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 186 of 280 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 44 | 24% | 68 |
| cx.BlestPain 1.41 | 39 | 21% | 52 |
| oog.melee.Mercutio 1.0 | 30 | 16% | 53 |
| ahf.NanoAndrew .4 | 27 | 15% | 39 |
| nic.Nicator 2.4 | 16 | 9% | 31 |
| maribo.melee.BMV 0.1 | 15 | 8% | 20 |
| goblin.Bender 2.4 | 9 | 5% | 9 |
| tex.Longbot 0.4 | 3 | 2% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 2% | 4 |

## Melee bench: F18

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 79.9 | 147 / 280 | 2.81 | 17.1% | 33324 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.1% | 147 |
| morbid.MorbidPriest 1.0 | 2.3 | 13.3% | 43 |
| agd.Mooserwirt2 2.7 | 3.5 | 11.8% | 44 |
| uji.DBH 1.1 | 4.5 | 10.9% | 14 |
| ratosh.Nobo 0.21 | 4.9 | 10.5% | 7 |
| spinnercat.Robovirus 2.718 | 5.1 | 10.1% | 7 |
| sigterm.Sigterm 1.0 | 6.9 | 8.1% | 10 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 6.9% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.3 | 5.7% | 0 |
| stelo.WangRobot 1.0 | 9.6 | 5.6% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 86.0 | 19 / 35 | 4339 |
| 2 | 1 | 64.6 | 73.3 | 17 / 35 | 4300 |
| 3 | 1 | 66.9 | 83.5 | 23 / 35 | 4256 |
| 4 | 1 | 64.2 | 76.5 | 15 / 35 | 3900 |
| 5 | 1 | 66.6 | 82.9 | 16 / 35 | 4431 |
| 6 | 1 | 64.1 | 74.9 | 18 / 35 | 3896 |
| 7 | 1 | 64.7 | 74.9 | 19 / 35 | 3992 |
| 8 | 1 | 67.3 | 87.3 | 20 / 35 | 4210 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 50 | 72% |
| agd.Mooserwirt2 2.7 | 39 | 64% |
| uji.DBH 1.1 | 36 | 81% |
| spinnercat.Robovirus 2.718 | 18 | 83% |
| sigterm.Sigterm 1.0 | 17 | 82% |
| stelo.WangRobot 1.0 | 13 | 85% |
| ratosh.Nobo 0.21 | 10 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 133 of 280 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 41 | 31% | 93 |
| agd.Mooserwirt2 2.7 | 31 | 23% | 60 |
| uji.DBH 1.1 | 16 | 12% | 30 |
| spinnercat.Robovirus 2.718 | 10 | 8% | 23 |
| sigterm.Sigterm 1.0 | 10 | 8% | 20 |
| kawigi.mini.Fhqwhgads 1.1 | 10 | 8% | 20 |
| ratosh.Nobo 0.21 | 9 | 7% | 19 |
| stelo.WangRobot 1.0 | 5 | 4% | 12 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 3 |

## Melee bench: F19

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 89.7 | 200 / 280 | 1.93 | 20.1% | 44766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.1% | 200 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.4 | 14.5% | 32 |
| mld.Infinity 2.2 | 2.6 | 13.7% | 37 |
| krillr.mini.JointStrike 2.0.0 | 4.4 | 11.3% | 3 |
| erdnis.Rover 0.3 | 4.6 | 10.6% | 4 |
| patson.PatsonTestBot 1.0 | 6.1 | 8.6% | 2 |
| mbh.Mbh 0.1 | 7.5 | 7.0% | 0 |
| pac.ABC 2.1 | 7.6 | 6.8% | 2 |
| pbg.R2D2 1.0 | 8.8 | 6.0% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 88.3 | 23 / 35 | 5874 |
| 2 | 1 | 70.4 | 87.3 | 25 / 35 | 5485 |
| 3 | 1 | 70.9 | 91.7 | 27 / 35 | 5262 |
| 4 | 1 | 70.9 | 90.5 | 25 / 35 | 5754 |
| 5 | 1 | 70.7 | 91.1 | 22 / 35 | 5475 |
| 6 | 1 | 70.6 | 84.8 | 28 / 35 | 5892 |
| 7 | 1 | 71.7 | 94.9 | 29 / 35 | 5233 |
| 8 | 1 | 70.4 | 88.9 | 21 / 35 | 5791 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 120 | 88% |
| mld.Infinity 2.2 | 75 | 79% |
| krillr.mini.JointStrike 2.0.0 | 15 | 93% |
| patson.PatsonTestBot 1.0 | 11 | 91% |
| erdnis.Rover 0.3 | 5 | 100% |
| pac.ABC 2.1 | 5 | 80% |
| pbg.R2D2 1.0 | 2 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 81 of 280 rounds, at a mean tick of 1094. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 27 | 33% | 151 |
| mld.Infinity 2.2 | 22 | 27% | 20 |
| krillr.mini.JointStrike 2.0.0 | 12 | 15% | 41 |
| erdnis.Rover 0.3 | 6 | 7% | 20 |
| pac.ABC 2.1 | 5 | 6% | 9 |
| mbh.Mbh 0.1 | 4 | 5% | 11 |
| patson.PatsonTestBot 1.0 | 4 | 5% | 10 |
| pbg.R2D2 1.0 | 1 | 1% | 11 |

## Melee bench: F20

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 79.6 | 116 / 280 | 2.84 | 17.3% | 39381 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.4 | 17.3% | 116 |
| trm.Wrekt 1.1.6.f | 1.6 | 16.3% | 81 |
| fwb.Nine 1.0.1 | 3.1 | 12.2% | 35 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 10.6% | 10 |
| catcat20.Rabbit 0.001 | 4.8 | 10.3% | 26 |
| m3thos.mini.Eva01 0.5.5 | 6.4 | 8.3% | 3 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 8.0% | 4 |
| bayen.nut.Squirrel 1.615 | 7.9 | 7.0% | 5 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 79.4 | 15 / 35 | 4825 |
| 2 | 2 | 64.6 | 72.7 | 13 / 35 | 4572 |
| 3 | 2 | 65.1 | 76.5 | 12 / 35 | 4852 |
| 4 | 1 | 65.1 | 77.5 | 12 / 35 | 4724 |
| 5 | 1 | 68.9 | 86.7 | 18 / 35 | 5349 |
| 6 | 1 | 66.3 | 79.0 | 15 / 35 | 5076 |
| 7 | 2 | 66.1 | 79.7 | 11 / 35 | 4861 |
| 8 | 1 | 68.4 | 85.1 | 20 / 35 | 5122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 94 | 62% |
| fwb.Nine 1.0.1 | 25 | 60% |
| catcat20.Rabbit 0.001 | 22 | 64% |
| nz.jdc.nano.GridFu 1.0 | 15 | 80% |
| bayen.nut.Squirrel 1.615 | 10 | 100% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 50% |

Hadur died in 164 of 280 rounds, at a mean tick of 954. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 72 | 44% | 122 |
| fwb.Nine 1.0.1 | 40 | 24% | 51 |
| catcat20.Rabbit 0.001 | 20 | 12% | 41 |
| nz.jdc.nano.GridFu 1.0 | 19 | 12% | 33 |
| bayen.nut.Squirrel 1.615 | 5 | 3% | 8 |
| djdjdj.NanoSkunk10 1.0 | 3 | 2% | 12 |
| m3thos.mini.Eva01 0.5.5 | 3 | 2% | 7 |
| ntc.ControlledChaos 1.1.4 | 2 | 1% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F21

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 83.0 | 131 / 280 | 2.53 | 18.4% | 43162 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.4% | 131 |
| eem.EvBot v4.6.16 | 2.0 | 16.8% | 115 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.9% | 14 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.2% | 5 |
| eld.Hmm 1.0 | 5.0 | 9.2% | 14 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.7% | 0 |
| el.JumpShoot 0.2 | 7.4 | 6.4% | 1 |
| fire219.CatBot 1.0 | 8.3 | 6.1% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.8% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 81.6 | 17 / 35 | 5119 |
| 2 | 1 | 66.4 | 73.7 | 18 / 35 | 5089 |
| 3 | 1 | 69.5 | 86.7 | 19 / 35 | 5709 |
| 4 | 1 | 67.9 | 79.4 | 15 / 35 | 5645 |
| 5 | 1 | 69.3 | 90.2 | 13 / 35 | 5390 |
| 6 | 1 | 69.4 | 88.6 | 17 / 35 | 5486 |
| 7 | 1 | 66.9 | 77.8 | 16 / 35 | 5345 |
| 8 | 1 | 69.1 | 86.0 | 16 / 35 | 5379 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 117 | 51% |
| dummy.mini.Scimitar 1.01 | 43 | 84% |
| cf.RiO.RiOx 4.2.1 | 26 | 92% |
| eld.Hmm 1.0 | 13 | 77% |
| oa.weak.BotherBot 0.1 | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 0% |

Hadur died in 151 of 280 rounds, at a mean tick of 1089. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 85 | 56% | 125 |
| dummy.mini.Scimitar 1.01 | 30 | 20% | 78 |
| cf.RiO.RiOx 4.2.1 | 9 | 6% | 23 |
| eld.Hmm 1.0 | 7 | 5% | 27 |
| fire219.CatBot 1.0 | 5 | 3% | 7 |
| PSW.Relentless 0.1 | 5 | 3% | 5 |
| el.JumpShoot 0.2 | 4 | 3% | 5 |
| oa.weak.BotherBot 0.1 | 3 | 2% | 6 |
| arthord.MannyPacquiao Beta | 2 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 77.0 | 109 / 280 | 3.07 | 17.4% | 42231 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.5 | 17.4% | 109 |
| pe.SandboxLump 1.52 | 1.5 | 17.8% | 113 |
| cre.Karolos 0.32 | 3.1 | 13.5% | 29 |
| stelo.AreaTargetingBot 1.1 | 4.6 | 10.1% | 13 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.3 | 9.7% | 2 |
| stelo.RamTrackSurfer 1.2 | 5.8 | 9.2% | 8 |
| cw.megas.Blade 0.8 | 6.5 | 8.8% | 2 |
| sample.Walls 1.0 | 7.8 | 8.2% | 4 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.8% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 78.7 | 13 / 35 | 5395 |
| 2 | 1 | 68.3 | 80.3 | 15 / 35 | 5344 |
| 3 | 1 | 68.5 | 78.4 | 14 / 35 | 5716 |
| 4 | 2 | 67.8 | 79.0 | 15 / 35 | 5110 |
| 5 | 1 | 70.0 | 84.4 | 19 / 35 | 5548 |
| 6 | 2 | 67.0 | 74.6 | 10 / 35 | 5494 |
| 7 | 2 | 65.1 | 71.1 | 12 / 35 | 4725 |
| 8 | 2 | 65.3 | 69.5 | 11 / 35 | 4899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 105 | 51% |
| cre.Karolos 0.32 | 37 | 73% |
| stelo.AreaTargetingBot 1.1 | 19 | 84% |
| stelo.RamTrackSurfer 1.2 | 7 | 86% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 75% |
| sample.Walls 1.0 | 3 | 100% |

Hadur died in 171 of 280 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 83 | 49% | 133 |
| cre.Karolos 0.32 | 38 | 22% | 65 |
| stelo.AreaTargetingBot 1.1 | 21 | 12% | 35 |
| cw.megas.Blade 0.8 | 11 | 6% | 12 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 5% | 12 |
| stelo.RamTrackSurfer 1.2 | 7 | 4% | 13 |
| sample.Walls 1.0 | 2 | 1% | 6 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F24

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 67.3 | 50 / 280 | 3.94 | 13.7% | 29246 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 1.9 | 14.5% | 72 |
| rz.GlowBlowMelee 1.4 | 2.1 | 13.9% | 53 |
| hadur117.micro.SaorC 0.1 | 2.3 | 13.7% | 50 |
| davidalves.Phoenix 0.54 | 3.8 | 12.7% | 55 |
| pedersen.Ugluk 1.1.1 | 5.0 | 11.4% | 24 |
| oog.melee.Corsair 1.0 | 6.1 | 9.8% | 14 |
| lunchie.Lunchbox 0.93 | 7.5 | 6.9% | 1 |
| stelo.SoJNanoMelee 1.1 | 7.6 | 6.9% | 11 |
| as.FrankTheTank 1.3 | 8.9 | 5.3% | 1 |
| evd.X1 0.01 | 9.9 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.2 | 65.4 | 5 / 35 | 3402 |
| 2 | 1 | 61.4 | 70.5 | 9 / 35 | 3595 |
| 3 | 2 | 60.7 | 68.6 | 7 / 35 | 3644 |
| 4 | 1 | 61.5 | 72.1 | 7 / 35 | 3679 |
| 5 | 3 | 60.2 | 65.7 | 6 / 35 | 3676 |
| 6 | 4 | 57.8 | 61.0 | 4 / 35 | 3558 |
| 7 | 2 | 60.9 | 68.9 | 6 / 35 | 3807 |
| 8 | 2 | 60.9 | 66.3 | 6 / 35 | 3885 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 30 | 50% |
| florent.XSeries.X2 0.12 | 28 | 21% |
| davidalves.Phoenix 0.54 | 22 | 32% |
| pedersen.Ugluk 1.1.1 | 20 | 60% |
| stelo.SoJNanoMelee 1.1 | 7 | 86% |
| oog.melee.Corsair 1.0 | 4 | 50% |
| lunchie.Lunchbox 0.93 | 2 | 100% |

Hadur died in 231 of 280 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 74 | 32% | 79 |
| rz.GlowBlowMelee 1.4 | 47 | 20% | 59 |
| davidalves.Phoenix 0.54 | 37 | 16% | 48 |
| pedersen.Ugluk 1.1.1 | 25 | 11% | 35 |
| oog.melee.Corsair 1.0 | 20 | 9% | 23 |
| evd.X1 0.01 | 13 | 6% | 13 |
| stelo.SoJNanoMelee 1.1 | 6 | 3% | 13 |
| lunchie.Lunchbox 0.93 | 6 | 3% | 7 |
| as.FrankTheTank 1.3 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 84.8 | 168 / 280 | 2.37 | 18.3% | 34205 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.3% | 168 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.7% | 31 |
| voidious.micro.BlitzBat 1.05 | 3.3 | 12.5% | 25 |
| jdw.Hurricane 1.4 | 3.5 | 12.2% | 30 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 10.0% | 12 |
| ds.Oo 2.2 | 6.1 | 8.5% | 7 |
| gjr.Cephalosporin 0.1 | 7.0 | 7.5% | 6 |
| awesomeness.Elite 1.0 | 8.1 | 6.4% | 0 |
| adt.Ar2 1.1 | 8.8 | 6.1% | 0 |
| amk.ChumbaMini 0.2 | 9.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 83.5 | 22 / 35 | 4044 |
| 2 | 1 | 67.9 | 86.0 | 21 / 35 | 4259 |
| 3 | 1 | 64.9 | 77.1 | 15 / 35 | 4013 |
| 4 | 1 | 69.0 | 89.5 | 23 / 35 | 4513 |
| 5 | 1 | 69.5 | 89.2 | 22 / 35 | 4641 |
| 6 | 1 | 66.9 | 81.9 | 20 / 35 | 4317 |
| 7 | 1 | 69.7 | 91.4 | 25 / 35 | 4586 |
| 8 | 1 | 65.9 | 79.4 | 20 / 35 | 3832 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 61 | 89% |
| voidious.micro.BlitzBat 1.05 | 48 | 85% |
| jdw.Hurricane 1.4 | 37 | 73% |
| gjr.Cephalosporin 0.1 | 16 | 81% |
| ds.Oo 2.2 | 14 | 71% |
| gre.svman4.Morfeas 1.4.1 | 13 | 85% |
| adt.Ar2 1.1 | 8 | 100% |
| awesomeness.Elite 1.0 | 2 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 113 of 280 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 32 | 28% | 59 |
| voidious.mini.BrokenSword 2.0.3 | 22 | 19% | 73 |
| voidious.micro.BlitzBat 1.05 | 17 | 15% | 54 |
| gre.svman4.Morfeas 1.4.1 | 12 | 11% | 27 |
| ds.Oo 2.2 | 12 | 11% | 25 |
| gjr.Cephalosporin 0.1 | 6 | 5% | 19 |
| adt.Ar2 1.1 | 5 | 4% | 14 |
| awesomeness.Elite 1.0 | 4 | 4% | 4 |
| amk.ChumbaMini 0.2 | 3 | 3% | 5 |

## Melee bench: F26

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 80.9 | 106 / 280 | 2.72 | 17.1% | 41265 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 17.1% | 106 |
| ak.Fermat 2.0 | 1.8 | 16.2% | 90 |
| shu.nitro.LENIN .T34 | 3.8 | 12.2% | 42 |
| lrem.Spectre 0.4.4 | 3.9 | 11.9% | 22 |
| js.PinBall 1.6 | 5.1 | 10.7% | 11 |
| jaybot.adv.bots.JayBot 2.0 | 6.1 | 9.5% | 2 |
| gh.mini.GrubbmOne 1.0 | 6.1 | 9.3% | 5 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.5% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 79.0 | 14 / 35 | 4718 |
| 2 | 2 | 66.3 | 80.3 | 14 / 35 | 5004 |
| 3 | 1 | 69.5 | 88.3 | 18 / 35 | 5646 |
| 4 | 1 | 66.0 | 80.3 | 10 / 35 | 5046 |
| 5 | 1 | 67.8 | 81.3 | 16 / 35 | 5619 |
| 6 | 1 | 66.3 | 78.1 | 13 / 35 | 5390 |
| 7 | 1 | 65.6 | 78.7 | 10 / 35 | 4591 |
| 8 | 1 | 67.1 | 81.3 | 11 / 35 | 5251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 70 | 36% |
| shu.nitro.LENIN .T34 | 51 | 59% |
| lrem.Spectre 0.4.4 | 38 | 76% |
| jaybot.adv.bots.JayBot 2.0 | 11 | 91% |
| js.PinBall 1.6 | 6 | 50% |
| gh.mini.GrubbmOne 1.0 | 6 | 83% |
| sample.SpinBot 1.0 | 3 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 50% |

Hadur died in 175 of 280 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 77 | 44% | 106 |
| shu.nitro.LENIN .T34 | 32 | 18% | 65 |
| js.PinBall 1.6 | 22 | 13% | 27 |
| lrem.Spectre 0.4.4 | 17 | 10% | 38 |
| gh.mini.GrubbmOne 1.0 | 11 | 6% | 19 |
| jaybot.adv.bots.JayBot 2.0 | 8 | 5% | 15 |
| fullsail.LaxativeTeaTwo 1.0 | 7 | 4% | 8 |
| sample.SpinBot 1.0 | 1 | 1% | 2 |

## Melee bench: F27

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 78.3 | 143 / 280 | 2.95 | 16.8% | 33147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 16.8% | 143 |
| mk.Alpha 0.2.1 | 1.9 | 14.8% | 73 |
| wee.Gem 1.8.4 | 3.5 | 11.5% | 33 |
| EH.Eagle 1.0.6 | 4.0 | 11.0% | 11 |
| sheldor.melee.nano.TestMelee 0.1 | 4.9 | 10.1% | 12 |
| throxbot.ThroxBot 0.1 | 7.0 | 8.3% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 7.1 | 8.5% | 3 |
| joe.ADinosaur 1.0 | 7.3 | 7.7% | 3 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.5% | 1 |
| cs.Grudge 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 77.8 | 17 / 35 | 3926 |
| 2 | 1 | 64.8 | 79.7 | 17 / 35 | 3843 |
| 3 | 2 | 55.9 | 47.0 | 8 / 35 | 3740 |
| 4 | 1 | 67.0 | 82.5 | 22 / 35 | 4411 |
| 5 | 1 | 69.6 | 92.4 | 23 / 35 | 4725 |
| 6 | 1 | 64.4 | 75.2 | 16 / 35 | 4103 |
| 7 | 1 | 67.5 | 87.3 | 20 / 35 | 4172 |
| 8 | 1 | 66.7 | 84.8 | 20 / 35 | 4227 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 86 | 76% |
| EH.Eagle 1.0.6 | 30 | 93% |
| wee.Gem 1.8.4 | 24 | 71% |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 95% |
| throxbot.ThroxBot 0.1 | 8 | 75% |
| joe.ADinosaur 1.0 | 4 | 75% |
| techdude.kombat.FlamingKombat 1.5 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |

Hadur died in 137 of 280 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 47 | 34% | 113 |
| wee.Gem 1.8.4 | 18 | 13% | 34 |
| joe.ADinosaur 1.0 | 18 | 13% | 18 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 9% | 36 |
| techdude.kombat.FlamingKombat 1.5 | 12 | 9% | 18 |
| throxbot.ThroxBot 0.1 | 10 | 7% | 20 |
| caimano.Furia_Ceca 0.22 | 7 | 5% | 11 |
| cs.Grudge 1.0 | 7 | 5% | 7 |
| EH.Eagle 1.0.6 | 5 | 4% | 23 |

## Melee bench: F28

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 83.2 | 151 / 280 | 2.51 | 17.4% | 32166 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 17.4% | 151 |
| kid.test.NightFox .2 | 2.0 | 15.0% | 58 |
| uji.Antique 1.0 | 3.5 | 11.8% | 32 |
| qohnil.blot.BlotBot 3.61 | 4.1 | 10.9% | 20 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.5% | 9 |
| amk.ChumbaWumba 0.3 | 6.6 | 8.1% | 5 |
| ahr.ice.Ice 1.0.2 | 6.6 | 7.9% | 4 |
| matt.advanced.Katana 1.0 | 8.1 | 6.8% | 2 |
| stelo.PianistNano 1.2 | 9.1 | 5.9% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 85.4 | 22 / 35 | 3884 |
| 2 | 2 | 63.6 | 75.2 | 16 / 35 | 3581 |
| 3 | 1 | 64.8 | 81.0 | 14 / 35 | 3818 |
| 4 | 1 | 69.8 | 94.6 | 26 / 35 | 4412 |
| 5 | 1 | 66.6 | 84.1 | 17 / 35 | 4319 |
| 6 | 1 | 64.9 | 78.7 | 17 / 35 | 3989 |
| 7 | 1 | 65.0 | 80.0 | 16 / 35 | 3874 |
| 8 | 1 | 68.0 | 86.7 | 23 / 35 | 4289 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 104 | 78% |
| uji.Antique 1.0 | 47 | 83% |
| qohnil.blot.BlotBot 3.61 | 21 | 43% |
| pfvicm.Sobieski 7.2.3b | 14 | 71% |
| amk.ChumbaWumba 0.3 | 9 | 89% |
| ahr.ice.Ice 1.0.2 | 3 | 67% |
| matt.advanced.Katana 1.0 | 2 | 100% |

Hadur died in 131 of 280 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 36 | 27% | 93 |
| pfvicm.Sobieski 7.2.3b | 21 | 16% | 29 |
| amk.ChumbaWumba 0.3 | 21 | 16% | 29 |
| qohnil.blot.BlotBot 3.61 | 19 | 15% | 37 |
| uji.Antique 1.0 | 18 | 14% | 59 |
| stelo.Lifestealer 1.0 | 7 | 5% | 8 |
| stelo.PianistNano 1.2 | 4 | 3% | 6 |
| ahr.ice.Ice 1.0.2 | 3 | 2% | 8 |
| matt.advanced.Katana 1.0 | 1 | 1% | 7 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 77.2 | 65 / 280 | 3.05 | 16.1% | 33610 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.6 | 16.4% | 116 |
| hadur117.micro.SaorC 0.1 | 1.9 | 16.1% | 65 |
| deewiant.Anomaly 0.2 | 2.5 | 15.0% | 72 |
| myl.micro.Troodon 1.10 | 4.3 | 11.4% | 7 |
| jok.PheonixM 0.1.2 | 4.8 | 10.6% | 10 |
| ph.melee.ArcherME 0.3 | 6.4 | 7.8% | 0 |
| DBall.Anarchy 0.1 | 6.8 | 7.1% | 7 |
| fullsail.TimbotNoPrediction 1.0 | 8.1 | 6.3% | 0 |
| ap.Frederick 1.1 | 9.1 | 5.0% | 3 |
| jangs.ns51 1.0 | 9.6 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 75.9 | 11 / 35 | 4019 |
| 2 | 2 | 66.4 | 79.7 | 6 / 35 | 4539 |
| 3 | 1 | 65.0 | 78.1 | 9 / 35 | 4072 |
| 4 | 1 | 66.1 | 82.2 | 8 / 35 | 4327 |
| 5 | 3 | 64.0 | 77.1 | 5 / 35 | 4020 |
| 6 | 1 | 66.4 | 82.9 | 8 / 35 | 4309 |
| 7 | 2 | 66.9 | 79.0 | 12 / 35 | 4703 |
| 8 | 3 | 59.7 | 62.5 | 6 / 35 | 3621 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 67 | 31% |
| zyx.mega.YersiniaPestis 3.1 | 60 | 8% |
| myl.micro.Troodon 1.10 | 20 | 85% |
| jok.PheonixM 0.1.2 | 14 | 86% |
| DBall.Anarchy 0.1 | 8 | 100% |
| ap.Frederick 1.1 | 1 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 217 of 280 rounds, at a mean tick of 1010. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 92 | 42% | 114 |
| zyx.mega.YersiniaPestis 3.1 | 87 | 40% | 93 |
| myl.micro.Troodon 1.10 | 11 | 5% | 24 |
| jok.PheonixM 0.1.2 | 9 | 4% | 22 |
| fullsail.TimbotNoPrediction 1.0 | 8 | 4% | 10 |
| ph.melee.ArcherME 0.3 | 5 | 2% | 6 |
| jangs.ns51 1.0 | 3 | 1% | 3 |
| DBall.Anarchy 0.1 | 2 | 1% | 8 |

## Melee bench: F30

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.9 | 54.4 | 16 / 280 | 5.11 | 11.2% | 27881 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 1.9 | 14.1% | 76 |
| catcat20.Matcha 0.006 | 2.1 | 14.0% | 75 |
| oog.melee.Capulet 1.2 | 3.1 | 12.8% | 41 |
| stelo.PastFuture 2.3.2 | 3.1 | 12.8% | 36 |
| hadur117.micro.SaorC 0.1 | 4.8 | 11.2% | 16 |
| intruder.PrairieWolf 2.61 | 6.3 | 9.4% | 17 |
| tripphippy.Alice 1.1 | 7.6 | 8.0% | 7 |
| ntc.Opposite 1.5 | 7.8 | 7.7% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 8.4 | 7.2% | 11 |
| GarmBox.Anger 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.4 | 56.2 | 1 / 35 | 3544 |
| 2 | 5 | 54.2 | 50.5 | 3 / 35 | 3653 |
| 3 | 5 | 54.1 | 52.4 | 1 / 35 | 3468 |
| 4 | 5 | 54.4 | 54.3 | 1 / 35 | 3308 |
| 5 | 5 | 55.9 | 58.1 | 2 / 35 | 3392 |
| 6 | 3 | 57.7 | 59.0 | 3 / 35 | 3904 |
| 7 | 5 | 56.1 | 56.8 | 4 / 35 | 3445 |
| 8 | 5 | 51.5 | 47.6 | 1 / 35 | 3167 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 21 | 19% |
| darkcanuck.B26354 1.06 | 20 | 20% |
| oog.melee.Capulet 1.2 | 12 | 25% |
| stelo.PastFuture 2.3.2 | 10 | 40% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 0% |
| ntc.Opposite 1.5 | 1 | 100% |
| intruder.PrairieWolf 2.61 | 1 | 0% |

Hadur died in 264 of 280 rounds, at a mean tick of 647. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 71 | 27% | 74 |
| oog.melee.Capulet 1.2 | 60 | 23% | 64 |
| darkcanuck.B26354 1.06 | 54 | 20% | 58 |
| stelo.PastFuture 2.3.2 | 32 | 12% | 35 |
| ntc.Opposite 1.5 | 16 | 6% | 16 |
| fowl3628800.LightningBolt 2.6.0 | 11 | 4% | 12 |
| intruder.PrairieWolf 2.61 | 11 | 4% | 12 |
| tripphippy.Alice 1.1 | 7 | 3% | 7 |
| GarmBox.Anger 1.0 | 2 | 1% | 2 |

## Melee bench: F31

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 66.3 | 34 / 280 | 4.04 | 13.1% | 26222 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.5% | 163 |
| gh.mini.Griezel 0.2 | 2.5 | 13.2% | 55 |
| hadur117.micro.SaorC 0.1 | 2.5 | 13.1% | 34 |
| d414.nano.Quantum 1.0.0 | 4.4 | 11.6% | 15 |
| spinnercat.micro.Tyger 0.1 | 4.6 | 11.5% | 5 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.2% | 4 |
| fm.mammillarias 1.3 | 7.5 | 6.6% | 1 |
| timmit.nano.TimDog 0.33 | 7.6 | 6.7% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 9.9 | 4.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.7 | 63.5 | 3 / 35 | 3213 |
| 2 | 2 | 60.6 | 69.5 | 7 / 35 | 3310 |
| 3 | 3 | 57.3 | 60.6 | 2 / 35 | 3375 |
| 4 | 2 | 57.5 | 61.0 | 3 / 35 | 3278 |
| 5 | 2 | 61.9 | 72.7 | 6 / 35 | 3517 |
| 6 | 2 | 62.5 | 74.9 | 6 / 35 | 3493 |
| 7 | 3 | 57.7 | 61.9 | 4 / 35 | 3096 |
| 8 | 3 | 58.4 | 66.0 | 3 / 35 | 2940 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 48 | 8% |
| gh.mini.Griezel 0.2 | 24 | 17% |
| spinnercat.micro.Tyger 0.1 | 12 | 92% |
| d414.nano.Quantum 1.0.0 | 10 | 100% |
| gh.nano.Grofvuil 0.2 | 5 | 80% |
| timmit.nano.TimDog 0.33 | 2 | 50% |

Hadur died in 247 of 280 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 110 | 45% | 116 |
| gh.mini.Griezel 0.2 | 49 | 20% | 55 |
| spinnercat.micro.Tyger 0.1 | 24 | 10% | 33 |
| gh.nano.Grofvuil 0.2 | 22 | 9% | 26 |
| d414.nano.Quantum 1.0.0 | 14 | 6% | 21 |
| timmit.nano.TimDog 0.33 | 10 | 4% | 10 |
| fm.mammillarias 1.3 | 9 | 4% | 9 |
| Gecko.ultimateGeckoBot 1.0 | 8 | 3% | 9 |
| tlp.ThreeLeggedPig 1 | 1 | 0% | 1 |

## Melee bench: F32

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 77.1 | 106 / 280 | 3.06 | 16.1% | 34707 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 16.1% | 106 |
| kawigi.sbf.FloodHT 0.9.2 | 1.8 | 15.4% | 99 |
| apc.botM 3.0 | 3.4 | 12.0% | 32 |
| vjik.UnViolation 1.1 | 4.1 | 11.2% | 20 |
| lxx.ConceptA 0.8 | 4.8 | 10.8% | 9 |
| bayen.UbaMicro 1.4 | 5.9 | 9.1% | 7 |
| panzer.Panzer 0.2 | 7.4 | 7.6% | 0 |
| yk.JahMicro 1.0 | 8.0 | 6.8% | 3 |
| conscience.Electron 1.3g | 8.8 | 6.0% | 1 |
| donjezza.Jezza 1.0 | 9.8 | 5.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 73.3 | 10 / 35 | 4375 |
| 2 | 1 | 65.1 | 77.5 | 16 / 35 | 4433 |
| 3 | 1 | 65.0 | 78.4 | 15 / 35 | 4370 |
| 4 | 1 | 65.8 | 83.8 | 14 / 35 | 4302 |
| 5 | 2 | 61.2 | 70.8 | 6 / 35 | 4098 |
| 6 | 1 | 63.1 | 73.0 | 14 / 35 | 4271 |
| 7 | 1 | 66.6 | 84.1 | 17 / 35 | 4442 |
| 8 | 1 | 64.1 | 76.2 | 14 / 35 | 4416 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 82 | 27% |
| apc.botM 3.0 | 32 | 84% |
| lxx.ConceptA 0.8 | 26 | 92% |
| vjik.UnViolation 1.1 | 22 | 77% |
| bayen.UbaMicro 1.4 | 8 | 100% |
| yk.JahMicro 1.0 | 4 | 50% |
| panzer.Panzer 0.2 | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 176 of 280 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 86 | 49% | 113 |
| lxx.ConceptA 0.8 | 22 | 13% | 32 |
| vjik.UnViolation 1.1 | 19 | 11% | 43 |
| apc.botM 3.0 | 14 | 8% | 42 |
| bayen.UbaMicro 1.4 | 12 | 7% | 22 |
| conscience.Electron 1.3g | 10 | 6% | 11 |
| yk.JahMicro 1.0 | 8 | 5% | 9 |
| panzer.Panzer 0.2 | 4 | 2% | 4 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |

## Melee bench: F33

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 82.9 | 131 / 280 | 2.54 | 18.2% | 39504 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 18.2% | 131 |
| maribo.Quester 0.3 | 1.9 | 16.4% | 75 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.5% | 17 |
| labg.Cataclysm 2.05 | 4.1 | 11.0% | 25 |
| gre.svman4.Leonidas 1.3.2 | 4.6 | 10.7% | 22 |
| baal.nano.N 1.42 | 6.4 | 8.7% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 7.9% | 7 |
| zyx.micro.Ant 1.1 | 7.9 | 5.7% | 0 |
| sanja.First 0.1 | 9.3 | 5.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 77.8 | 15 / 35 | 4978 |
| 2 | 2 | 65.8 | 76.8 | 11 / 35 | 4718 |
| 3 | 1 | 68.2 | 84.8 | 16 / 35 | 4884 |
| 4 | 1 | 69.0 | 87.0 | 18 / 35 | 4947 |
| 5 | 1 | 67.6 | 79.7 | 18 / 35 | 4962 |
| 6 | 1 | 67.5 | 78.7 | 16 / 35 | 4812 |
| 7 | 1 | 69.6 | 89.5 | 21 / 35 | 4906 |
| 8 | 1 | 69.4 | 88.9 | 16 / 35 | 5297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 76 | 62% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 56 | 86% |
| gre.svman4.Leonidas 1.3.2 | 30 | 73% |
| labg.Cataclysm 2.05 | 14 | 29% |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 64% |
| baal.nano.N 1.42 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 151 of 280 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 67 | 44% | 120 |
| labg.Cataclysm 2.05 | 25 | 17% | 36 |
| gre.svman4.Leonidas 1.3.2 | 19 | 13% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 9% | 53 |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 6% | 14 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 7 | 5% | 8 |
| baal.nano.N 1.42 | 5 | 3% | 8 |
| sanja.First 0.1 | 3 | 2% | 3 |
| zyx.micro.Ant 1.1 | 2 | 1% | 5 |

## Melee bench: F34

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 75.1 | 45 / 280 | 3.24 | 15.4% | 36014 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.5 | 17.0% | 82 |
| stelo.Spread 0.9 | 2.0 | 16.2% | 104 |
| hadur117.micro.SaorC 0.1 | 2.5 | 15.4% | 45 |
| jcs.Seth 1.8 | 4.6 | 11.3% | 28 |
| tcf.Reach 3 | 4.9 | 10.9% | 12 |
| cli.Dancer 1.1 | 5.5 | 10.2% | 8 |
| ratosh.Wesco 1.4 | 7.0 | 7.2% | 0 |
| amk.Punbot.Punbot 0.01 | 8.3 | 4.9% | 0 |
| sample.VelociRobot 1.0 | 8.8 | 4.1% | 1 |
| sample.RamFire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 78.1 | 8 / 35 | 4673 |
| 2 | 2 | 66.1 | 80.6 | 6 / 35 | 4708 |
| 3 | 3 | 63.6 | 72.7 | 4 / 35 | 4520 |
| 4 | 3 | 64.0 | 74.6 | 5 / 35 | 4354 |
| 5 | 3 | 60.7 | 63.5 | 3 / 35 | 4223 |
| 6 | 3 | 63.3 | 71.7 | 6 / 35 | 4420 |
| 7 | 1 | 67.2 | 83.5 | 8 / 35 | 4727 |
| 8 | 3 | 64.3 | 76.2 | 5 / 35 | 4389 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 56 | 14% |
| kid.Gladiator .7.2 | 46 | 41% |
| jcs.Seth 1.8 | 23 | 48% |
| cli.Dancer 1.1 | 7 | 29% |
| tcf.Reach 3 | 6 | 50% |
| ratosh.Wesco 1.4 | 2 | 100% |

Hadur died in 235 of 280 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 89 | 38% | 102 |
| stelo.Spread 0.9 | 79 | 34% | 89 |
| tcf.Reach 3 | 23 | 10% | 29 |
| jcs.Seth 1.8 | 20 | 9% | 28 |
| cli.Dancer 1.1 | 14 | 6% | 18 |
| ratosh.Wesco 1.4 | 4 | 2% | 6 |
| sample.RamFire 1.0 | 3 | 1% | 3 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 3 |
| sample.VelociRobot 1.0 | 1 | 0% | 2 |

## Melee bench: F35

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 66.9 | 17 / 280 | 3.98 | 12.8% | 25044 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 218 |
| hadur117.micro.SaorC 0.1 | 2.6 | 12.8% | 17 |
| gh.mini.Gruwel 0.9 | 3.0 | 13.2% | 29 |
| rz.HawkOnFire 0.1 | 4.1 | 11.8% | 4 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.2% | 8 |
| myl.nano.KomoriNinja 1.1 | 6.5 | 7.4% | 0 |
| wit.Chuliath 1.0 | 6.9 | 7.3% | 3 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.9 | 5.9% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 5.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 71.7 | 2 / 35 | 3372 |
| 2 | 3 | 56.7 | 58.4 | 1 / 35 | 3146 |
| 3 | 2 | 60.2 | 68.9 | 4 / 35 | 3388 |
| 4 | 4 | 56.5 | 61.9 | 1 / 35 | 2540 |
| 5 | 3 | 59.3 | 67.9 | 2 / 35 | 3131 |
| 6 | 2 | 59.5 | 67.9 | 3 / 35 | 3057 |
| 7 | 3 | 59.4 | 66.7 | 1 / 35 | 3273 |
| 8 | 2 | 60.5 | 72.1 | 3 / 35 | 3137 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 49 | 2% |
| gh.mini.Gruwel 0.9 | 15 | 13% |
| rz.HawkOnFire 0.1 | 13 | 85% |
| dmh.robocode.robot.BlackDeath 9.2 | 5 | 60% |
| wit.Chuliath 1.0 | 1 | 0% |
| stelo.MyAgileRobot 0.2 | 1 | 0% |

Hadur died in 263 of 280 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 150 | 57% | 153 |
| gh.mini.Gruwel 0.9 | 45 | 17% | 51 |
| rz.HawkOnFire 0.1 | 24 | 9% | 29 |
| dmh.robocode.robot.BlackDeath 9.2 | 18 | 7% | 22 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 10 | 4% | 10 |
| stelo.MyAgileRobot 0.2 | 6 | 2% | 5 |
| myl.nano.KomoriNinja 1.1 | 5 | 2% | 6 |
| wit.Chuliath 1.0 | 4 | 2% | 3 |
| dans.Cinnamon 1.2 | 1 | 0% | 1 |

## Melee bench: F36

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 82.9 | 175 / 280 | 2.54 | 18.8% | 40761 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.8% | 175 |
| alpha.RainingFire 1.0 | 2.1 | 12.6% | 24 |
| bzdp.Pansy 2.1 | 3.8 | 11.4% | 18 |
| mz.Cork 0.1 | 4.4 | 11.1% | 18 |
| bvh.micro.Freya 0.3 | 4.8 | 10.5% | 17 |
| m3thos.Eva02 0.7.1 | 5.8 | 9.8% | 6 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.3% | 7 |
| squidM.TentalceMeleeNano 1.1 | 8.1 | 6.1% | 3 |
| dl.BetterWalls 1.0 | 9.0 | 5.7% | 2 |
| sample.MyFirstRobot 1.0 | 9.9 | 4.7% | 11 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 77.5 | 19 / 35 | 4910 |
| 2 | 1 | 69.6 | 87.6 | 25 / 35 | 5239 |
| 3 | 1 | 69.3 | 86.3 | 24 / 35 | 5273 |
| 4 | 1 | 67.3 | 80.3 | 21 / 35 | 4869 |
| 5 | 1 | 67.6 | 79.4 | 19 / 35 | 5253 |
| 6 | 1 | 69.5 | 89.2 | 26 / 35 | 4876 |
| 7 | 1 | 67.8 | 81.3 | 19 / 35 | 5375 |
| 8 | 1 | 68.2 | 81.9 | 22 / 35 | 4966 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 51 | 92% |
| mz.Cork 0.1 | 34 | 82% |
| bvh.micro.Freya 0.3 | 31 | 94% |
| alpha.RainingFire 1.0 | 31 | 81% |
| bvh.mini.Fenrir 0.39 | 20 | 95% |
| m3thos.Eva02 0.7.1 | 18 | 89% |
| sample.MyFirstRobot 1.0 | 7 | 57% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |

Hadur died in 107 of 280 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 23 | 21% | 48 |
| mz.Cork 0.1 | 21 | 20% | 52 |
| bvh.micro.Freya 0.3 | 14 | 13% | 31 |
| bzdp.Pansy 2.1 | 13 | 12% | 54 |
| m3thos.Eva02 0.7.1 | 11 | 10% | 33 |
| dl.BetterWalls 1.0 | 11 | 10% | 23 |
| bvh.mini.Fenrir 0.39 | 10 | 9% | 24 |
| sample.MyFirstRobot 1.0 | 3 | 3% | 7 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 6 |

## Melee bench: F37

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 74.0 | 147 / 280 | 3.34 | 16.6% | 39929 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.6% | 147 |
| germ.TheMind .2 | 2.5 | 11.4% | 32 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.1 | 10.7% | 20 |
| EBBU.Sim2 1.02 | 4.9 | 9.9% | 13 |
| agrach.Dalek 1.0 | 5.8 | 9.5% | 23 |
| mb.Beast 0.1 | 6.0 | 8.9% | 10 |
| lmk.ACPFinal 0.1 | 7.0 | 8.8% | 14 |
| stelo.UntouchableNano 1.3 | 7.1 | 8.7% | 13 |
| skm.Ryubot 1.0 | 8.3 | 8.1% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 9.4 | 7.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 74.0 | 21 / 35 | 5257 |
| 2 | 1 | 65.6 | 77.5 | 20 / 35 | 5172 |
| 3 | 1 | 61.4 | 68.9 | 13 / 35 | 4456 |
| 4 | 1 | 63.8 | 70.5 | 17 / 35 | 4873 |
| 5 | 1 | 65.4 | 76.2 | 19 / 35 | 5298 |
| 6 | 1 | 65.5 | 79.0 | 20 / 35 | 5101 |
| 7 | 1 | 65.7 | 80.6 | 21 / 35 | 4947 |
| 8 | 1 | 62.2 | 65.4 | 16 / 35 | 4825 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 42 | 79% |
| EBBU.Sim2 1.02 | 24 | 83% |
| stelo.UntouchableNano 1.3 | 22 | 95% |
| com.syncleus.robocode.Dreadnaught 0.1 | 22 | 82% |
| skm.Ryubot 1.0 | 20 | 95% |
| mb.Beast 0.1 | 18 | 100% |
| lmk.ACPFinal 0.1 | 10 | 90% |
| agrach.Dalek 1.0 | 9 | 89% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 133 of 280 rounds, at a mean tick of 344. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 22 | 17% | 38 |
| com.syncleus.robocode.Dreadnaught 0.1 | 19 | 14% | 45 |
| germ.TheMind .2 | 18 | 14% | 37 |
| EBBU.Sim2 1.02 | 18 | 14% | 36 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 11% | 23 |
| mb.Beast 0.1 | 12 | 9% | 34 |
| stelo.UntouchableNano 1.3 | 11 | 8% | 31 |
| lmk.ACPFinal 0.1 | 11 | 8% | 20 |
| skm.Ryubot 1.0 | 7 | 5% | 12 |

## Melee bench: F38

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 71.6 | 66 / 280 | 3.56 | 14.6% | 31412 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.0% | 134 |
| hadur117.micro.SaorC 0.1 | 2.0 | 14.6% | 66 |
| bvh.mini.Freya 0.55 | 3.5 | 12.2% | 25 |
| cs.Wren 1.0 | 4.6 | 10.9% | 11 |
| bts.mega.Gnarly 1.4 | 4.6 | 11.0% | 29 |
| kdf.KoulDestroyer 1.0 | 6.1 | 9.6% | 3 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.1 | 9.7% | 10 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.1 | 5.9% | 1 |
| bzdp.BoxCar 2.0 | 9.3 | 4.6% | 0 |
| matt.UnderDark3 2.4.34 | 9.6 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 77.5 | 10 / 35 | 3962 |
| 2 | 2 | 61.0 | 68.3 | 7 / 35 | 3866 |
| 3 | 2 | 62.0 | 72.1 | 6 / 35 | 3706 |
| 4 | 2 | 60.4 | 67.9 | 4 / 35 | 3729 |
| 5 | 2 | 63.7 | 77.1 | 11 / 35 | 4084 |
| 6 | 2 | 62.4 | 70.8 | 7 / 35 | 4279 |
| 7 | 2 | 59.8 | 64.4 | 7 / 35 | 3799 |
| 8 | 2 | 64.4 | 74.6 | 14 / 35 | 3987 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 57 | 12% |
| bts.mega.Gnarly 1.4 | 20 | 55% |
| cs.Wren 1.0 | 19 | 95% |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 93% |
| bvh.mini.Freya 0.55 | 10 | 90% |
| kdf.KoulDestroyer 1.0 | 8 | 100% |

Hadur died in 214 of 280 rounds, at a mean tick of 669. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 104 | 49% | 114 |
| bvh.mini.Freya 0.55 | 35 | 16% | 43 |
| bts.mega.Gnarly 1.4 | 20 | 9% | 31 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 8% | 34 |
| kdf.KoulDestroyer 1.0 | 14 | 7% | 21 |
| cs.Wren 1.0 | 12 | 6% | 24 |
| matt.UnderDark3 2.4.34 | 6 | 3% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 2% | 5 |
| bzdp.BoxCar 2.0 | 1 | 0% | 1 |

## Melee bench: F39

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 71.7 | 71 / 280 | 3.54 | 15.2% | 36792 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.5 | 15.2% | 71 |
| bvh.fry.Freya 0.82 | 1.9 | 15.1% | 48 |
| az.Ololobot 0.2.4 | 2.8 | 13.6% | 102 |
| catcat20.Lambda 0.024 | 3.9 | 11.2% | 37 |
| gimp.GimpBot 0.1 | 6.0 | 8.7% | 4 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.5% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 7.1 | 8.0% | 7 |
| apollokidd.ApolloKidd 0.9 | 7.1 | 7.9% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.1 | 6.1% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.6 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.4 | 66.3 | 7 / 35 | 4710 |
| 2 | 1 | 63.0 | 75.9 | 5 / 35 | 4651 |
| 3 | 1 | 65.5 | 76.5 | 15 / 35 | 5022 |
| 4 | 1 | 64.9 | 80.0 | 8 / 35 | 4721 |
| 5 | 1 | 62.2 | 70.8 | 8 / 35 | 4550 |
| 6 | 3 | 60.7 | 66.7 | 8 / 35 | 4321 |
| 7 | 2 | 62.8 | 70.5 | 10 / 35 | 4366 |
| 8 | 2 | 61.4 | 67.3 | 10 / 35 | 4451 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 50 | 22% |
| bvh.fry.Freya 0.82 | 45 | 67% |
| catcat20.Lambda 0.024 | 25 | 36% |
| stelo.SoRobotNanoMelee 1.2 | 12 | 100% |
| gimp.GimpBot 0.1 | 8 | 75% |
| apollokidd.ApolloKidd 0.9 | 2 | 50% |
| winamp32.micro.MicroMacro 1.0 | 2 | 100% |

Hadur died in 209 of 280 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 66 | 32% | 77 |
| bvh.fry.Freya 0.82 | 56 | 27% | 80 |
| catcat20.Lambda 0.024 | 34 | 16% | 42 |
| apollokidd.ApolloKidd 0.9 | 19 | 9% | 22 |
| stelo.SoRobotNanoMelee 1.2 | 10 | 5% | 17 |
| whitesquare.robots.SkynetAdvanced 1.1 | 10 | 5% | 11 |
| gimp.GimpBot 0.1 | 9 | 4% | 17 |
| winamp32.micro.MicroMacro 1.0 | 3 | 1% | 11 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 1% | 2 |

## Melee bench: F40

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 78.5 | 129 / 280 | 2.94 | 17.0% | 35491 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 17.0% | 129 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.6% | 65 |
| kano.gamma.KanoGamma 1.8 | 3.4 | 12.2% | 25 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.7% | 19 |
| mz.AntiGrav 1.0 | 4.9 | 10.7% | 14 |
| alpha.BlackIce 1.0 | 6.1 | 9.4% | 9 |
| stelo.Randomness 1.0 | 6.1 | 9.1% | 15 |
| amk.superstrike.SuperStrike 0.3 | 7.9 | 6.6% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.6% | 3 |
| sample.Corners 1.0 | 10.0 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 85.4 | 17 / 35 | 4841 |
| 2 | 1 | 67.4 | 81.6 | 18 / 35 | 4885 |
| 3 | 2 | 61.7 | 66.7 | 10 / 35 | 4007 |
| 4 | 1 | 66.7 | 80.3 | 19 / 35 | 4514 |
| 5 | 1 | 67.2 | 85.1 | 18 / 35 | 4311 |
| 6 | 1 | 66.3 | 79.7 | 17 / 35 | 4544 |
| 7 | 1 | 65.0 | 75.2 | 15 / 35 | 4267 |
| 8 | 1 | 64.7 | 74.0 | 15 / 35 | 4122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 66 | 42% |
| kano.gamma.KanoGamma 1.8 | 41 | 80% |
| mz.AntiGrav 1.0 | 32 | 100% |
| Polkwane.SmashMelee 1.0 | 19 | 79% |
| alpha.BlackIce 1.0 | 9 | 100% |
| stelo.Randomness 1.0 | 8 | 75% |
| sample.Corners 1.0 | 4 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 152 of 280 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 62 | 41% | 82 |
| Polkwane.SmashMelee 1.0 | 21 | 14% | 30 |
| kano.gamma.KanoGamma 1.8 | 20 | 13% | 57 |
| stelo.Randomness 1.0 | 14 | 9% | 23 |
| alpha.BlackIce 1.0 | 13 | 9% | 24 |
| mz.AntiGrav 1.0 | 10 | 7% | 38 |
| amk.superstrike.SuperStrike 0.3 | 6 | 4% | 9 |
| sample.Corners 1.0 | 3 | 2% | 10 |
| testantiswapgun.AntiSwap 1.0 | 3 | 2% | 5 |

## Melee bench: F41

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 68.9 | 75 / 280 | 3.80 | 14.7% | 33652 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.3 | 16.6% | 119 |
| hadur117.micro.SaorC 0.1 | 2.0 | 14.7% | 75 |
| ary.Swarm 1.1 | 2.8 | 13.5% | 30 |
| lessonz.robocode.Oz 0.5.0 | 4.4 | 11.8% | 24 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.9% | 18 |
| shrub.Silver v048 | 5.8 | 9.5% | 5 |
| zyx.nano.Ant 1.1 | 6.9 | 8.1% | 0 |
| jsal.Jsalbot 1.0 | 8.0 | 6.4% | 7 |
| stelo.Mirror 1.1 | 9.0 | 5.7% | 2 |
| acogdev.alpha 0.2 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 72.4 | 11 / 35 | 4177 |
| 2 | 1 | 63.8 | 70.5 | 9 / 35 | 4820 |
| 3 | 2 | 62.4 | 68.9 | 8 / 35 | 4196 |
| 4 | 3 | 61.7 | 66.3 | 7 / 35 | 3995 |
| 5 | 3 | 60.3 | 63.2 | 12 / 35 | 3694 |
| 6 | 2 | 63.1 | 71.4 | 7 / 35 | 4360 |
| 7 | 2 | 61.8 | 65.4 | 6 / 35 | 4477 |
| 8 | 1 | 64.1 | 73.0 | 15 / 35 | 3933 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 55 | 36% |
| ary.Swarm 1.1 | 23 | 87% |
| simonton.nano.MeleeSeed 1.8 | 20 | 85% |
| lessonz.robocode.Oz 0.5.0 | 20 | 75% |
| shrub.Silver v048 | 2 | 0% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 0% |

Hadur died in 205 of 280 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 97 | 47% | 127 |
| lessonz.robocode.Oz 0.5.0 | 28 | 14% | 34 |
| ary.Swarm 1.1 | 26 | 13% | 45 |
| simonton.nano.MeleeSeed 1.8 | 24 | 12% | 36 |
| zyx.nano.Ant 1.1 | 10 | 5% | 13 |
| acogdev.alpha 0.2 | 10 | 5% | 10 |
| stelo.Mirror 1.1 | 4 | 2% | 6 |
| shrub.Silver v048 | 3 | 1% | 6 |
| jsal.Jsalbot 1.0 | 3 | 1% | 3 |

## Melee bench: F42

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 71.8 | 44 / 280 | 3.54 | 14.6% | 34337 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.8% | 152 |
| hadur117.micro.SaorC 0.1 | 2.1 | 14.6% | 44 |
| maribo.mini.MiniQuester 0.1 | 3.4 | 13.5% | 28 |
| ara.Shera 0.88 | 3.5 | 13.4% | 43 |
| amz.NanoClone 1.41 | 5.3 | 9.1% | 3 |
| maribo.IotaCT 1.1 | 6.1 | 7.9% | 1 |
| dsw.StaticD 1.0 | 6.8 | 7.5% | 9 |
| stelo.MirrorMicro 1.0 | 7.9 | 6.5% | 0 |
| mme.NikeEnhanced 2.0 | 9.3 | 5.0% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 76.8 | 9 / 35 | 4066 |
| 2 | 2 | 60.9 | 67.0 | 6 / 35 | 4190 |
| 3 | 2 | 61.1 | 67.6 | 5 / 35 | 4176 |
| 4 | 2 | 63.0 | 72.4 | 5 / 35 | 4623 |
| 5 | 2 | 62.7 | 74.0 | 4 / 35 | 4449 |
| 6 | 2 | 63.4 | 73.7 | 5 / 35 | 4387 |
| 7 | 3 | 61.4 | 69.5 | 7 / 35 | 4003 |
| 8 | 2 | 63.0 | 73.3 | 3 / 35 | 4443 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 61 | 20% |
| maribo.mini.MiniQuester 0.1 | 24 | 63% |
| ara.Shera 0.88 | 22 | 55% |
| dsw.StaticD 1.0 | 4 | 50% |
| amz.NanoClone 1.41 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |

Hadur died in 236 of 280 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 132 | 56% | 146 |
| ara.Shera 0.88 | 48 | 20% | 61 |
| maribo.mini.MiniQuester 0.1 | 21 | 9% | 35 |
| dsw.StaticD 1.0 | 12 | 5% | 14 |
| amz.NanoClone 1.41 | 12 | 5% | 11 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 7 | 3% | 8 |
| maribo.IotaCT 1.1 | 3 | 1% | 3 |
| mme.NikeEnhanced 2.0 | 1 | 0% | 2 |

## Melee bench: F43

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 62.8 | 17 / 280 | 4.35 | 12.2% | 25802 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.8% | 221 |
| brainfade.melee.Dusk 0.44 | 2.5 | 12.7% | 27 |
| hadur117.micro.SaorC 0.1 | 3.4 | 12.2% | 17 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.5% | 9 |
| wcsv.melee.EngineerMelee 0.1 | 4.6 | 11.1% | 5 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 10.1% | 2 |
| mz.NanoGod 2.02 | 7.4 | 8.0% | 0 |
| jab.DiamondStealer 5 | 7.6 | 7.6% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.5 | 57.8 | 2 / 35 | 3081 |
| 2 | 3 | 58.9 | 63.8 | 0 / 35 | 3145 |
| 3 | 4 | 57.5 | 60.0 | 1 / 35 | 2795 |
| 4 | 2 | 62.1 | 69.5 | 3 / 35 | 3756 |
| 5 | 4 | 60.1 | 65.7 | 3 / 35 | 3187 |
| 6 | 2 | 61.4 | 67.6 | 5 / 35 | 3571 |
| 7 | 6 | 55.3 | 52.4 | 1 / 35 | 2993 |
| 8 | 2 | 60.5 | 65.7 | 2 / 35 | 3274 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 59 | 5% |
| brainfade.melee.Dusk 0.44 | 10 | 70% |
| dummy.micro.Sparrow 2.5 | 6 | 50% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 80% |

Hadur died in 263 of 280 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 141 | 54% | 144 |
| brainfade.melee.Dusk 0.44 | 29 | 11% | 36 |
| wcsv.melee.EngineerMelee 0.1 | 26 | 10% | 29 |
| dummy.micro.Sparrow 2.5 | 25 | 10% | 28 |
| mz.NanoGod 2.02 | 21 | 8% | 21 |
| jab.DiamondStealer 5 | 11 | 4% | 11 |
| Krabb.akim2.Akim2 1.1b | 8 | 3% | 9 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |

## Melee bench: F44

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 78.6 | 110 / 280 | 2.93 | 17.3% | 40525 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 17.3% | 110 |
| stelo.Liblix 0.3.1 | 1.9 | 15.6% | 118 |
| tzu.TheArtOfWar 1.2 | 3.1 | 13.0% | 34 |
| wompi.Quokka 1.6 | 4.3 | 10.8% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.3 | 9.6% | 4 |
| jwirde.Gort 2.0 | 5.5 | 9.4% | 6 |
| disan.Chair 2.2.0 | 6.9 | 8.3% | 3 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.4% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.8% | 1 |
| sample.Crazy 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 78.1 | 11 / 35 | 4999 |
| 2 | 1 | 65.5 | 73.7 | 15 / 35 | 4924 |
| 3 | 1 | 67.1 | 81.3 | 16 / 35 | 4984 |
| 4 | 1 | 66.3 | 79.0 | 14 / 35 | 4864 |
| 5 | 1 | 65.8 | 78.7 | 11 / 35 | 5274 |
| 6 | 1 | 69.5 | 88.6 | 18 / 35 | 5399 |
| 7 | 2 | 66.7 | 79.4 | 14 / 35 | 5016 |
| 8 | 1 | 63.7 | 70.2 | 11 / 35 | 5065 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 91 | 31% |
| tzu.TheArtOfWar 1.2 | 57 | 72% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 13 | 100% |
| wompi.Quokka 1.6 | 12 | 100% |
| disan.Chair 2.2.0 | 9 | 89% |
| jwirde.Gort 2.0 | 8 | 63% |
| sample.Crazy 1.0 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 170 of 280 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 89 | 52% | 121 |
| tzu.TheArtOfWar 1.2 | 42 | 25% | 83 |
| wompi.Quokka 1.6 | 13 | 8% | 21 |
| jwirde.Gort 2.0 | 7 | 4% | 19 |
| disan.Chair 2.2.0 | 6 | 4% | 13 |
| stf.PanzerGeneral 0.1 | 6 | 4% | 9 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 3% | 9 |
| sample.Crazy 1.0 | 1 | 1% | 4 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 1 |

## Melee bench: F45

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.5 | 103 / 280 | 2.48 | 18.7% | 44595 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.7% | 103 |
| eem.IWillFireNoBullet v2.8 | 2.1 | 13.0% | 142 |
| jje.BagPuss 1.2 | 3.1 | 11.3% | 5 |
| myl.nano.Graviton 1.10 | 4.3 | 10.4% | 5 |
| sul.Lunar 1.1 | 4.6 | 10.2% | 14 |
| hvilela.HVilela 0.9 | 6.5 | 8.9% | 0 |
| fm.claire 1.7 | 6.8 | 8.4% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.9 | 7.5% | 2 |
| wit.Deep7 2.0 | 9.3 | 6.1% | 8 |
| abud.ThirdRobo 1.0 | 9.5 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 75.2 | 9 / 35 | 5768 |
| 2 | 1 | 69.9 | 90.8 | 20 / 35 | 5416 |
| 3 | 1 | 68.6 | 86.7 | 14 / 35 | 5536 |
| 4 | 1 | 69.7 | 88.6 | 16 / 35 | 5684 |
| 5 | 1 | 67.0 | 80.6 | 10 / 35 | 5472 |
| 6 | 1 | 67.0 | 80.6 | 12 / 35 | 5510 |
| 7 | 1 | 69.1 | 85.7 | 12 / 35 | 6015 |
| 8 | 1 | 66.4 | 80.0 | 10 / 35 | 5194 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 158 | 29% |
| sul.Lunar 1.1 | 17 | 94% |
| jje.BagPuss 1.2 | 16 | 94% |
| myl.nano.Graviton 1.10 | 13 | 92% |
| wit.Deep7 2.0 | 8 | 50% |
| fm.claire 1.7 | 5 | 80% |
| pez.mini.ChironexFleckeri 0.5 | 4 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |

Hadur died in 177 of 280 rounds, at a mean tick of 2024. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 116 | 66% | 0 |
| myl.nano.Graviton 1.10 | 11 | 6% | 49 |
| jje.BagPuss 1.2 | 9 | 5% | 68 |
| sul.Lunar 1.1 | 8 | 5% | 72 |
| fm.claire 1.7 | 8 | 5% | 17 |
| wit.Deep7 2.0 | 8 | 5% | 16 |
| pez.mini.ChironexFleckeri 0.5 | 7 | 4% | 26 |
| hvilela.HVilela 0.9 | 7 | 4% | 16 |
| abud.ThirdRobo 1.0 | 3 | 2% | 11 |

## Melee bench: F46

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 64.0 | 17 / 280 | 4.24 | 13.0% | 30396 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.4 | 18.0% | 110 |
| rsalesc.melee.Medina 0.4.5 | 1.6 | 17.3% | 131 |
| hadur117.micro.SaorC 0.1 | 3.0 | 13.0% | 17 |
| cx.Princess 1.0 | 4.6 | 10.2% | 18 |
| mz.MicroSheep 1.0 | 4.9 | 10.2% | 2 |
| sadoner.killer 0.2 | 5.6 | 9.4% | 2 |
| arthord.NanoSatanMelee Beta | 7.4 | 6.7% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.5 | 6.5% | 0 |
| kurios.DOSexe .9a | 9.1 | 5.0% | 0 |
| mbro.Detektor3 0.1.1 | 9.9 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 61.3 | 2 / 35 | 3837 |
| 2 | 3 | 61.8 | 69.2 | 2 / 35 | 4052 |
| 3 | 3 | 59.5 | 68.3 | 1 / 35 | 3634 |
| 4 | 3 | 56.6 | 54.9 | 2 / 35 | 3430 |
| 5 | 3 | 59.5 | 63.5 | 2 / 35 | 3777 |
| 6 | 3 | 62.0 | 72.1 | 3 / 35 | 3910 |
| 7 | 3 | 59.9 | 60.0 | 2 / 35 | 4015 |
| 8 | 3 | 59.3 | 62.5 | 3 / 35 | 3741 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 55 | 22% |
| rsalesc.melee.Medina 0.4.5 | 20 | 5% |
| mz.MicroSheep 1.0 | 2 | 50% |
| cx.Princess 1.0 | 2 | 50% |
| sadoner.killer 0.2 | 1 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 263 of 280 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 112 | 43% | 125 |
| rsalesc.melee.Medina 0.4.5 | 80 | 30% | 80 |
| cx.Princess 1.0 | 28 | 11% | 28 |
| mz.MicroSheep 1.0 | 13 | 5% | 17 |
| sadoner.killer 0.2 | 12 | 5% | 13 |
| kurios.DOSexe .9a | 9 | 3% | 8 |
| arthord.NanoSatanMelee Beta | 5 | 2% | 5 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 2 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 2 |

