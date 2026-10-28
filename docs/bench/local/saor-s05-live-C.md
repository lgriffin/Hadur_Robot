# Bench suite: suite.txt

## Melee bench: F01

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 74.2 | 27 / 280 | 3.33 | 15.1% | 39272 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.6% | 208 |
| hadur117.micro.SaorC 0.1 | 2.0 | 15.1% | 27 |
| sgp.JollyNinja 3.53 | 3.3 | 12.0% | 24 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.7% | 4 |
| mz.MicroGodMelee 1 | 4.8 | 10.5% | 11 |
| lorneswork.Predator 1.0 | 5.5 | 10.0% | 4 |
| adt.Ar2 1.0 | 7.3 | 7.0% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.5% | 1 |
| skm.butterfly 1.0 | 8.6 | 5.2% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 69.2 | 2 / 35 | 4810 |
| 2 | 2 | 64.7 | 78.1 | 3 / 35 | 5072 |
| 3 | 2 | 62.8 | 71.7 | 2 / 35 | 4622 |
| 4 | 2 | 63.5 | 75.9 | 3 / 35 | 4320 |
| 5 | 2 | 63.6 | 72.4 | 4 / 35 | 5061 |
| 6 | 2 | 63.3 | 71.7 | 5 / 35 | 5086 |
| 7 | 2 | 65.5 | 78.4 | 2 / 35 | 5257 |
| 8 | 2 | 64.5 | 75.9 | 6 / 35 | 5044 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 101 | 5% |
| sgp.JollyNinja 3.53 | 16 | 44% |
| mz.MicroGodMelee 1 | 11 | 45% |
| lorneswork.Predator 1.0 | 5 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 100% |
| adt.Ar2 1.0 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 1 | 100% |

Hadur died in 253 of 280 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 158 | 62% | 165 |
| sgp.JollyNinja 3.53 | 26 | 10% | 32 |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 9% | 23 |
| mz.MicroGodMelee 1 | 17 | 7% | 21 |
| lorneswork.Predator 1.0 | 13 | 5% | 17 |
| kawigi.sbf.FloodSonnet 0.9 | 9 | 4% | 12 |
| adt.Ar2 1.0 | 5 | 2% | 7 |
| skm.butterfly 1.0 | 2 | 1% | 2 |
| mym.EdgeStalker 1.0 | 1 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 80.8 | 124 / 280 | 2.73 | 17.9% | 42262 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.9% | 124 |
| pulsar.PulsarMax 0.8.9 | 2.1 | 13.7% | 66 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 12.4% | 39 |
| lrem.micro.SpikeSoldier 0.4 | 3.9 | 11.0% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.4 | 9.7% | 15 |
| fnc.bandit.Bandit 5.2.0 | 6.6 | 8.4% | 3 |
| Noran.BitchingElk 0.054 | 6.9 | 8.5% | 20 |
| sch.Simone 0.3d | 7.3 | 7.8% | 8 |
| stelo.PatternRobot 1.0 | 8.9 | 6.2% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 82.2 | 18 / 35 | 5469 |
| 2 | 1 | 66.0 | 77.8 | 14 / 35 | 5238 |
| 3 | 1 | 66.4 | 76.8 | 14 / 35 | 5452 |
| 4 | 1 | 68.9 | 87.0 | 18 / 35 | 5344 |
| 5 | 1 | 66.2 | 76.5 | 15 / 35 | 5238 |
| 6 | 1 | 66.7 | 81.0 | 15 / 35 | 5069 |
| 7 | 1 | 67.2 | 82.5 | 14 / 35 | 5115 |
| 8 | 1 | 67.3 | 82.9 | 16 / 35 | 5337 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 60 | 50% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 44 | 61% |
| Noran.BitchingElk 0.054 | 19 | 68% |
| com.cohesiva.robocode.ManOwaR 1.0 | 17 | 71% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 93% |
| sch.Simone 0.3d | 13 | 92% |
| stelo.PatternRobot 1.0 | 11 | 100% |
| fnc.bandit.Bandit 5.2.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 157 of 280 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 58 | 37% | 85 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 44 | 28% | 73 |
| lrem.micro.SpikeSoldier 0.4 | 18 | 11% | 30 |
| Noran.BitchingElk 0.054 | 8 | 5% | 24 |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 5% | 22 |
| fnc.bandit.Bandit 5.2.0 | 7 | 4% | 11 |
| stelo.PatternRobot 1.0 | 6 | 4% | 12 |
| sch.Simone 0.3d | 5 | 3% | 18 |
| fullsail.SweetTea 1.1 | 3 | 2% | 5 |

## Melee bench: F03

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 79.6 | 166 / 280 | 2.83 | 17.8% | 44562 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.8% | 166 |
| radnor.DoctorBob 1.42 | 2.1 | 14.1% | 48 |
| vuen.Cake 2.51 | 3.3 | 12.7% | 33 |
| kawigi.nano.Lib 1.0 | 3.6 | 11.9% | 23 |
| urdos.URDOS 1.3 | 5.1 | 9.9% | 3 |
| adt.Ar1 2.1 | 6.1 | 8.1% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 7.4% | 3 |
| oa.weak.FlyMk1 0.1 | 7.9 | 6.9% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.3 | 5.8% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.6 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 79.4 | 22 / 35 | 5639 |
| 2 | 1 | 65.7 | 76.5 | 19 / 35 | 5399 |
| 3 | 1 | 66.9 | 75.6 | 21 / 35 | 5977 |
| 4 | 1 | 67.7 | 82.5 | 23 / 35 | 5256 |
| 5 | 1 | 69.5 | 88.3 | 22 / 35 | 6368 |
| 6 | 1 | 66.2 | 76.2 | 19 / 35 | 5657 |
| 7 | 1 | 63.2 | 69.2 | 13 / 35 | 4887 |
| 8 | 1 | 69.1 | 89.5 | 27 / 35 | 5379 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 62 | 87% |
| kawigi.nano.Lib 1.0 | 54 | 91% |
| radnor.DoctorBob 1.42 | 51 | 76% |
| oa.weak.FlyMk1 0.1 | 11 | 91% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 6 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 50% |
| urdos.URDOS 1.3 | 4 | 100% |
| adt.Ar1 2.1 | 2 | 100% |

Hadur died in 114 of 280 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 31 | 27% | 75 |
| kawigi.nano.Lib 1.0 | 18 | 16% | 70 |
| vuen.Cake 2.51 | 16 | 14% | 65 |
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 14% | 14 |
| urdos.URDOS 1.3 | 11 | 10% | 15 |
| ghent.ArthurPanzergon 1.0.0 | 10 | 9% | 11 |
| adt.Ar1 2.1 | 6 | 5% | 9 |
| oa.weak.FlyMk1 0.1 | 4 | 4% | 14 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 2% | 5 |

## Melee bench: F04

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 72.1 | 9 / 280 | 3.51 | 15.0% | 41645 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.7% | 249 |
| hadur117.micro.SaorC 0.1 | 2.3 | 15.0% | 9 |
| apc.LeeroyJenkins2 1.0 | 2.8 | 13.4% | 14 |
| TNT.TNT 0.99.1 | 4.3 | 10.9% | 5 |
| josago.Jorgito 0.16 | 4.8 | 9.4% | 0 |
| css.Delitioner 0.11 | 6.4 | 7.5% | 1 |
| tj.zombie1n 1.0.1 | 6.6 | 7.0% | 1 |
| rampancy.Durandal 2.1d | 8.1 | 5.2% | 0 |
| spin.Bugstard 0.012b | 9.4 | 4.1% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 69.8 | 0 / 35 | 5127 |
| 2 | 2 | 65.4 | 74.6 | 1 / 35 | 5762 |
| 3 | 2 | 65.0 | 74.0 | 1 / 35 | 5551 |
| 4 | 2 | 64.6 | 75.2 | 1 / 35 | 5167 |
| 5 | 2 | 66.1 | 75.2 | 3 / 35 | 5571 |
| 6 | 2 | 64.0 | 72.1 | 1 / 35 | 5009 |
| 7 | 3 | 61.8 | 65.7 | 0 / 35 | 4715 |
| 8 | 3 | 62.9 | 70.2 | 2 / 35 | 4743 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 100 | 5% |
| TNT.TNT 0.99.1 | 6 | 50% |
| apc.LeeroyJenkins2 1.0 | 3 | 33% |

Hadur died in 271 of 280 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 196 | 72% | 202 |
| apc.LeeroyJenkins2 1.0 | 29 | 11% | 30 |
| css.Delitioner 0.11 | 15 | 6% | 13 |
| josago.Jorgito 0.16 | 14 | 5% | 15 |
| TNT.TNT 0.99.1 | 9 | 3% | 12 |
| tj.zombie1n 1.0.1 | 6 | 2% | 6 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |

## Melee bench: F05

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 62.3 | 13 / 280 | 4.39 | 12.7% | 31457 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.4 | 18.0% | 135 |
| justin.DemonicRage 3.4 | 1.6 | 17.5% | 97 |
| wompi.Numbat 2.1 | 3.3 | 12.9% | 19 |
| hadur117.micro.SaorC 0.1 | 3.8 | 12.7% | 13 |
| axeBots.HataMoto 3.09 | 5.3 | 9.3% | 10 |
| ms.Ares 0.19 | 5.8 | 8.9% | 6 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.1% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.9 | 5.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.8% | 0 |
| GarmBox.Oranges 1.0 | 9.9 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.4 | 63.2 | 3 / 35 | 4202 |
| 2 | 4 | 57.9 | 59.7 | 2 / 35 | 3724 |
| 3 | 4 | 59.8 | 60.6 | 2 / 35 | 4319 |
| 4 | 4 | 59.5 | 65.7 | 1 / 35 | 3755 |
| 5 | 4 | 58.6 | 60.6 | 0 / 35 | 3862 |
| 6 | 3 | 60.4 | 67.9 | 1 / 35 | 3700 |
| 7 | 3 | 59.6 | 61.3 | 1 / 35 | 4102 |
| 8 | 4 | 58.3 | 59.7 | 3 / 35 | 3793 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 28 | 11% |
| justin.DemonicRage 3.4 | 24 | 4% |
| wompi.Numbat 2.1 | 12 | 50% |
| ms.Ares 0.19 | 3 | 33% |
| axeBots.HataMoto 3.09 | 3 | 33% |
| supersample.SuperBoxBot 1.0 | 1 | 100% |

Hadur died in 267 of 280 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 97 | 36% | 98 |
| cb.fire.Firestarter 2.0f | 80 | 30% | 81 |
| wompi.Numbat 2.1 | 40 | 15% | 47 |
| axeBots.HataMoto 3.09 | 14 | 5% | 15 |
| supersample.SuperBoxBot 1.0 | 12 | 4% | 14 |
| ms.Ares 0.19 | 12 | 4% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 5 | 2% | 5 |
| GarmBox.Oranges 1.0 | 5 | 2% | 5 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 78.9 | 136 / 280 | 2.90 | 17.0% | 36285 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.0% | 136 |
| jekl.StoneGhost 0.7 | 2.5 | 14.2% | 31 |
| origin.SleepSiphon 1.7b | 2.5 | 13.7% | 70 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.6% | 22 |
| mld.Wisdom 1.0 | 5.0 | 10.4% | 5 |
| gg.Wolverine 2.0 | 6.3 | 8.5% | 7 |
| spinnercat.Omen 1.0 | 7.5 | 7.5% | 2 |
| DBall.NUKE 0.1 | 7.8 | 7.2% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.5 | 6.6% | 7 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 75.2 | 14 / 35 | 4628 |
| 2 | 1 | 66.8 | 81.6 | 19 / 35 | 4445 |
| 3 | 1 | 63.7 | 72.4 | 13 / 35 | 4271 |
| 4 | 1 | 65.9 | 77.1 | 17 / 35 | 4470 |
| 5 | 1 | 68.4 | 86.3 | 23 / 35 | 4756 |
| 6 | 1 | 63.9 | 74.0 | 14 / 35 | 4174 |
| 7 | 1 | 66.4 | 78.7 | 18 / 35 | 4510 |
| 8 | 1 | 68.0 | 85.7 | 18 / 35 | 5031 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 69 | 87% |
| origin.SleepSiphon 1.7b | 50 | 50% |
| pe.minimelee.SandboxMiniMelee 1.1 | 27 | 85% |
| gg.Wolverine 2.0 | 11 | 73% |
| spinnercat.Omen 1.0 | 9 | 89% |
| mld.Wisdom 1.0 | 5 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 60% |
| DBall.NUKE 0.1 | 4 | 75% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 144 of 280 rounds, at a mean tick of 739. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 48 | 33% | 80 |
| jekl.StoneGhost 0.7 | 29 | 20% | 74 |
| pe.minimelee.SandboxMiniMelee 1.1 | 26 | 18% | 51 |
| mld.Wisdom 1.0 | 21 | 15% | 31 |
| gg.Wolverine 2.0 | 6 | 4% | 14 |
| DBall.NUKE 0.1 | 6 | 4% | 11 |
| sample.Fire 1.0 | 4 | 3% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 2% | 11 |
| spinnercat.Omen 1.0 | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 84.1 | 98 / 280 | 2.43 | 18.3% | 46896 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.4 | 18.2% | 82 |
| hadur117.micro.SaorC 0.1 | 1.6 | 18.3% | 98 |
| rtk.Tachikoma 1.0 | 3.0 | 16.4% | 75 |
| franzor.Lizt 1.3.1 | 4.1 | 10.8% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.9 | 10.1% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.4 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.6 | 7.4% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.3% | 1 |
| sample.Target 1.0 | 9.3 | 2.9% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 87.9 | 14 / 35 | 6091 |
| 2 | 2 | 68.9 | 82.9 | 12 / 35 | 5934 |
| 3 | 1 | 69.1 | 83.5 | 16 / 35 | 5555 |
| 4 | 2 | 68.9 | 84.4 | 10 / 35 | 5775 |
| 5 | 2 | 68.0 | 79.4 | 8 / 35 | 5741 |
| 6 | 2 | 67.8 | 79.4 | 10 / 35 | 5466 |
| 7 | 2 | 69.5 | 84.1 | 12 / 35 | 6030 |
| 8 | 1 | 71.1 | 91.4 | 16 / 35 | 6304 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 93 | 49% |
| rsalesc.melee.Monk 0.3.6c | 45 | 11% |
| oog.melee.CapuletDroid 1.1 | 29 | 86% |
| franzor.Lizt 1.3.1 | 27 | 70% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 182 of 280 rounds, at a mean tick of 1175. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 75 | 41% | 106 |
| rtk.Tachikoma 1.0 | 72 | 40% | 129 |
| oog.melee.CapuletDroid 1.1 | 17 | 9% | 21 |
| franzor.Lizt 1.3.1 | 11 | 6% | 8 |
| exauge.GateKeeper 1.1.121g | 4 | 2% | 6 |
| lrem.micro.MoggFanatic 0.2 | 3 | 2% | 6 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 77.5 | 121 / 280 | 3.03 | 17.7% | 44004 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.7% | 121 |
| tm.Yuugao 1.0 | 2.1 | 14.1% | 88 |
| shrub.Vapour v159 | 3.0 | 11.7% | 33 |
| com.spp.robocode.MostlyHarmless 010 | 4.5 | 9.9% | 12 |
| Krabb.sliNk.Garm 0.9u | 5.1 | 9.7% | 10 |
| m3thos.Eva00 1.1 | 5.5 | 9.3% | 8 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 8.2% | 4 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 7.3% | 2 |
| SHAM.WOW 1.4 | 8.9 | 6.6% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.9 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 76.2 | 14 / 35 | 5895 |
| 2 | 1 | 64.0 | 71.7 | 12 / 35 | 4983 |
| 3 | 1 | 67.0 | 79.0 | 17 / 35 | 5533 |
| 4 | 1 | 64.9 | 71.7 | 16 / 35 | 5014 |
| 5 | 1 | 68.9 | 86.0 | 18 / 35 | 5690 |
| 6 | 1 | 65.3 | 72.4 | 14 / 35 | 5457 |
| 7 | 1 | 66.6 | 77.8 | 14 / 35 | 5631 |
| 8 | 1 | 68.6 | 84.8 | 16 / 35 | 5801 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 72 | 42% |
| shrub.Vapour v159 | 43 | 81% |
| com.spp.robocode.MostlyHarmless 010 | 21 | 76% |
| Krabb.sliNk.Garm 0.9u | 20 | 75% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 92% |
| m3thos.Eva00 1.1 | 7 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |

Hadur died in 159 of 280 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 69 | 43% | 109 |
| Krabb.sliNk.Garm 0.9u | 19 | 12% | 27 |
| shrub.Vapour v159 | 18 | 11% | 43 |
| com.spp.robocode.MostlyHarmless 010 | 14 | 9% | 35 |
| SHAM.WOW 1.4 | 11 | 7% | 16 |
| m3thos.Eva00 1.1 | 8 | 5% | 15 |
| qualidafial.MajorDick 1.0.1 | 8 | 5% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 4% | 16 |
| zyx.nano.BacillusComma 1.0 | 6 | 4% | 7 |

## Melee bench: F09

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 63.6 | 41 / 280 | 4.28 | 13.4% | 31314 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.6% | 151 |
| kc.micro.Figment 1.0 | 2.5 | 13.6% | 45 |
| hadur117.micro.SaorC 0.1 | 2.6 | 13.4% | 41 |
| pedersen.Grishnakh 1.0 | 4.1 | 11.0% | 19 |
| yagami.Tidus 0.11 | 4.8 | 10.3% | 3 |
| mc2.enemy.Original 0.9 | 6.0 | 9.5% | 21 |
| dft.Calliope 5.6 | 7.0 | 8.0% | 0 |
| step.nanoPri 1.0 | 8.6 | 6.0% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.5% | 0 |
| rdm.Dueler 0.4x | 9.4 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.2 | 64.1 | 2 / 35 | 3779 |
| 2 | 2 | 61.2 | 67.0 | 7 / 35 | 4095 |
| 3 | 2 | 59.9 | 65.7 | 5 / 35 | 3823 |
| 4 | 4 | 57.7 | 57.1 | 4 / 35 | 3741 |
| 5 | 2 | 59.2 | 61.3 | 8 / 35 | 3842 |
| 6 | 3 | 61.5 | 67.9 | 6 / 35 | 4004 |
| 7 | 3 | 58.2 | 60.0 | 5 / 35 | 3763 |
| 8 | 2 | 60.7 | 65.4 | 4 / 35 | 4267 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 43 | 9% |
| kc.micro.Figment 1.0 | 40 | 55% |
| mc2.enemy.Original 0.9 | 9 | 11% |
| pedersen.Grishnakh 1.0 | 9 | 56% |
| yagami.Tidus 0.11 | 6 | 100% |
| step.nanoPri 1.0 | 1 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 239 of 280 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 94 | 39% | 101 |
| kc.micro.Figment 1.0 | 67 | 28% | 89 |
| yagami.Tidus 0.11 | 18 | 8% | 24 |
| mc2.enemy.Original 0.9 | 18 | 8% | 19 |
| pedersen.Grishnakh 1.0 | 13 | 5% | 15 |
| robar.nano.Assertive_Melee 0.2 | 10 | 4% | 11 |
| rdm.Dueler 0.4x | 9 | 4% | 9 |
| step.nanoPri 1.0 | 6 | 3% | 6 |
| dft.Calliope 5.6 | 4 | 2% | 5 |

## Melee bench: F10

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.5 | 135 / 280 | 2.48 | 17.9% | 42808 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 17.9% | 135 |
| DTF.Kludgy 1.2b | 1.9 | 16.0% | 88 |
| ne.Chimera 1.2 | 3.3 | 12.2% | 15 |
| ejb.Polaris 1.0.1 | 4.4 | 11.0% | 18 |
| vStar.RAFzilla 2.15 | 5.1 | 10.6% | 7 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.5% | 9 |
| sam.Samspin 1.0 | 7.8 | 6.1% | 1 |
| kurios.DOSexe .9b | 7.9 | 6.0% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.5% | 0 |
| donjezza.Muncho 1.0 | 9.9 | 4.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.0 | 18 / 35 | 5811 |
| 2 | 1 | 67.4 | 85.7 | 17 / 35 | 5075 |
| 3 | 1 | 69.1 | 87.6 | 19 / 35 | 5659 |
| 4 | 2 | 67.0 | 84.1 | 12 / 35 | 5068 |
| 5 | 1 | 68.1 | 82.5 | 19 / 35 | 5474 |
| 6 | 1 | 65.4 | 74.9 | 18 / 35 | 5050 |
| 7 | 1 | 65.6 | 77.8 | 16 / 35 | 5264 |
| 8 | 1 | 68.1 | 88.6 | 16 / 35 | 5407 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 79 | 37% |
| ne.Chimera 1.2 | 39 | 87% |
| ejb.Polaris 1.0.1 | 33 | 70% |
| vStar.RAFzilla 2.15 | 20 | 95% |
| tvv.micro.Antares 1.1.1 | 19 | 95% |
| kurios.DOSexe .9b | 8 | 88% |
| donjezza.Muncho 1.0 | 6 | 67% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 147 of 280 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 83 | 56% | 106 |
| ne.Chimera 1.2 | 25 | 17% | 52 |
| ejb.Polaris 1.0.1 | 11 | 7% | 40 |
| tvv.micro.Antares 1.1.1 | 8 | 5% | 23 |
| sam.Samspin 1.0 | 6 | 4% | 7 |
| kurios.DOSexe .9b | 5 | 3% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 3% | 6 |
| vStar.RAFzilla 2.15 | 3 | 2% | 25 |
| donjezza.Muncho 1.0 | 1 | 1% | 4 |

## Melee bench: F11

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 73.4 | 85 / 280 | 3.40 | 15.7% | 35493 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 16.6% | 108 |
| hadur117.micro.SaorC 0.1 | 1.8 | 15.7% | 85 |
| cx.mini.Nimrod 0.55 | 3.1 | 12.3% | 29 |
| djc.DynaBot 0.1.1 | 3.9 | 10.7% | 16 |
| br2.MobyDickBot 1.6 | 5.6 | 9.2% | 13 |
| rdt199.Warlord 0.73 | 6.1 | 8.8% | 16 |
| uji.YellohFellah 1.0 | 6.5 | 8.2% | 12 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.3% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.4 | 5.7% | 0 |
| stelo.MirrorNano 1.3 | 9.6 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 71.4 | 8 / 35 | 4413 |
| 2 | 2 | 63.3 | 70.8 | 12 / 35 | 4210 |
| 3 | 2 | 63.3 | 74.6 | 10 / 35 | 4106 |
| 4 | 2 | 64.2 | 75.2 | 12 / 35 | 4441 |
| 5 | 1 | 65.7 | 78.1 | 14 / 35 | 4934 |
| 6 | 2 | 61.9 | 69.5 | 12 / 35 | 4282 |
| 7 | 1 | 65.2 | 76.5 | 11 / 35 | 4951 |
| 8 | 2 | 61.9 | 70.8 | 6 / 35 | 4156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 63 | 30% |
| cx.mini.Nimrod 0.55 | 29 | 86% |
| djc.DynaBot 0.1.1 | 17 | 71% |
| br2.MobyDickBot 1.6 | 13 | 54% |
| uji.YellohFellah 1.0 | 12 | 67% |
| rdt199.Warlord 0.73 | 12 | 92% |
| KiraNL.Chupacabra 0.4 | 3 | 100% |

Hadur died in 195 of 280 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 92 | 47% | 118 |
| cx.mini.Nimrod 0.55 | 25 | 13% | 46 |
| KiraNL.Chupacabra 0.4 | 19 | 10% | 22 |
| djc.DynaBot 0.1.1 | 14 | 7% | 20 |
| rdt199.Warlord 0.73 | 13 | 7% | 21 |
| br2.MobyDickBot 1.6 | 12 | 6% | 19 |
| stelo.MirrorNano 1.3 | 9 | 5% | 9 |
| uji.YellohFellah 1.0 | 8 | 4% | 20 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 3 |

## Melee bench: F12

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 79.6 | 119 / 280 | 2.84 | 16.6% | 31353 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.6% | 119 |
| nat.PallasHawk 1.0 | 2.1 | 14.1% | 60 |
| bts.wiki.RipCurl 0.9b | 3.0 | 13.2% | 46 |
| darkcanuck.Leon 1.01 | 4.0 | 12.1% | 30 |
| brainfade.melee.Genghis 0.36 | 4.9 | 10.2% | 20 |
| jrm.Test0 1.0 | 6.4 | 8.1% | 2 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.2% | 0 |
| jp.Perpy 16.0 | 8.0 | 6.9% | 0 |
| jaybot.bots.Oddball 4.0 | 8.9 | 6.1% | 4 |
| stuff.Vlad 0.1 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 75.6 | 13 / 35 | 3541 |
| 2 | 1 | 64.8 | 79.7 | 15 / 35 | 3592 |
| 3 | 1 | 64.6 | 79.0 | 13 / 35 | 3916 |
| 4 | 1 | 65.2 | 78.7 | 18 / 35 | 3957 |
| 5 | 1 | 63.0 | 73.7 | 11 / 35 | 3889 |
| 6 | 1 | 65.7 | 80.6 | 14 / 35 | 4273 |
| 7 | 1 | 67.6 | 88.9 | 20 / 35 | 4052 |
| 8 | 1 | 65.6 | 80.6 | 15 / 35 | 4133 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 58 | 60% |
| bts.wiki.RipCurl 0.9b | 46 | 72% |
| darkcanuck.Leon 1.01 | 37 | 65% |
| brainfade.melee.Genghis 0.36 | 19 | 58% |
| jp.Perpy 16.0 | 6 | 100% |
| jaybot.bots.Oddball 4.0 | 4 | 75% |
| jrm.Test0 1.0 | 4 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 164 of 280 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 47 | 29% | 80 |
| bts.wiki.RipCurl 0.9b | 45 | 27% | 74 |
| darkcanuck.Leon 1.01 | 24 | 15% | 55 |
| brainfade.melee.Genghis 0.36 | 23 | 14% | 30 |
| jp.Perpy 16.0 | 9 | 5% | 14 |
| jrm.Test0 1.0 | 7 | 4% | 9 |
| cs.sheldor.Talon 1.1 | 6 | 4% | 12 |
| jaybot.bots.Oddball 4.0 | 2 | 1% | 4 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 64.5 | 13 / 280 | 4.20 | 12.9% | 32560 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.4 | 17.6% | 150 |
| ags.Glacier 0.2.11 | 1.6 | 17.1% | 75 |
| hadur117.micro.SaorC 0.1 | 3.5 | 12.9% | 13 |
| shinh.Entangled 0.3 | 3.8 | 12.3% | 26 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.3% | 16 |
| apc.Colossus2 0.17 | 6.0 | 8.3% | 0 |
| stelo.Wang 1.0 | 7.3 | 6.5% | 0 |
| ayk.WallHugger 1.0 | 8.1 | 5.6% | 0 |
| maribo.FollowFire 1 | 8.6 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 66.3 | 3 / 35 | 4237 |
| 2 | 4 | 58.4 | 63.8 | 0 / 35 | 3745 |
| 3 | 4 | 60.4 | 65.7 | 1 / 35 | 4048 |
| 4 | 3 | 60.6 | 68.3 | 2 / 35 | 3967 |
| 5 | 4 | 58.9 | 59.4 | 1 / 35 | 4197 |
| 6 | 3 | 61.8 | 67.3 | 2 / 35 | 4570 |
| 7 | 4 | 58.0 | 62.2 | 1 / 35 | 3918 |
| 8 | 3 | 58.9 | 62.9 | 3 / 35 | 3878 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 34 | 15% |
| ags.Glacier 0.2.11 | 28 | 11% |
| shinh.Entangled 0.3 | 6 | 50% |
| gh.micro.Gruweltje 0.7 | 3 | 33% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 267 of 280 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 96 | 36% | 100 |
| mn.Combat 3.25.0 | 80 | 30% | 84 |
| shinh.Entangled 0.3 | 34 | 13% | 38 |
| maribo.FollowFire 1 | 17 | 6% | 17 |
| gh.micro.Gruweltje 0.7 | 12 | 4% | 13 |
| ayk.WallHugger 1.0 | 12 | 4% | 11 |
| stelo.Wang 1.0 | 8 | 3% | 9 |
| apc.Colossus2 0.17 | 7 | 3% | 7 |
| sample.Tracker 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 77.9 | 169 / 280 | 2.99 | 17.6% | 41479 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.6% | 169 |
| simonton.micro.Sprout 1.1.3 | 2.4 | 13.9% | 24 |
| catcat20.shape.Theta 0.018 | 3.5 | 12.1% | 51 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.1 | 10.1% | 6 |
| sanyi.mikrobi.Roberto 1.0 | 5.4 | 9.8% | 7 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 10.0% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 5.6 | 9.8% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 8.3% | 14 |
| pa.Improved 1.0 | 9.0 | 5.9% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 77.8 | 17 / 35 | 4887 |
| 2 | 1 | 64.8 | 72.7 | 19 / 35 | 4630 |
| 3 | 1 | 64.2 | 66.7 | 18 / 35 | 4835 |
| 4 | 1 | 67.5 | 80.0 | 22 / 35 | 5101 |
| 5 | 1 | 67.7 | 81.6 | 22 / 35 | 5142 |
| 6 | 1 | 68.1 | 81.0 | 22 / 35 | 5830 |
| 7 | 1 | 68.4 | 79.0 | 25 / 35 | 5960 |
| 8 | 1 | 68.5 | 84.8 | 24 / 35 | 5094 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 102 | 93% |
| catcat20.shape.Theta 0.018 | 54 | 59% |
| co.edu.usb.rc.LidisTron 1.0 | 16 | 94% |
| sanyi.mikrobi.Roberto 1.0 | 12 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 80% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 50% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 111 of 280 rounds, at a mean tick of 551. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 35 | 32% | 127 |
| catcat20.shape.Theta 0.018 | 29 | 26% | 55 |
| co.edu.usb.rc.LidisTron 1.0 | 13 | 12% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 13 | 12% | 13 |
| Lo_Ian.Gandalf_V4 4.0 | 7 | 6% | 9 |
| sanyi.mikrobi.Roberto 1.0 | 6 | 5% | 25 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 5% | 20 |
| sample.TrackFire 1.0 | 2 | 2% | 6 |
| pa.Improved 1.0 | 0 | 0% | 2 |

## Melee bench: F15

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 82.8 | 142 / 280 | 2.55 | 18.7% | 45566 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.7% | 142 |
| kawigi.micro.Shiz 1.1 | 2.6 | 13.3% | 27 |
| emp.Yngwie 1.11 | 2.9 | 13.0% | 63 |
| mld.DustBunny 3.8 | 3.5 | 12.3% | 15 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.7% | 17 |
| kawigi.robot.Girl 1.2 | 5.8 | 8.7% | 13 |
| Grystrion.TrackerWO 1.0 | 7.0 | 7.3% | 1 |
| lambdaxy.TBot 0.1 | 7.9 | 6.8% | 0 |
| divineomega.TrialBot 0.003 | 9.1 | 5.4% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 78.7 | 17 / 35 | 5215 |
| 2 | 1 | 67.8 | 80.0 | 16 / 35 | 6012 |
| 3 | 1 | 69.5 | 87.3 | 21 / 35 | 5825 |
| 4 | 1 | 68.5 | 83.2 | 17 / 35 | 5451 |
| 5 | 1 | 67.9 | 80.6 | 19 / 35 | 5575 |
| 6 | 1 | 68.4 | 82.2 | 17 / 35 | 5817 |
| 7 | 1 | 69.5 | 87.6 | 19 / 35 | 5818 |
| 8 | 1 | 68.5 | 82.5 | 16 / 35 | 5853 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 55 | 49% |
| kawigi.micro.Shiz 1.1 | 50 | 92% |
| mld.DustBunny 3.8 | 32 | 88% |
| kawigi.robot.Girl 1.2 | 23 | 78% |
| cb.nano.Insomnia 1.0 | 18 | 61% |
| divineomega.TrialBot 0.003 | 7 | 100% |
| Grystrion.TrackerWO 1.0 | 3 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 3 | 67% |

Hadur died in 138 of 280 rounds, at a mean tick of 1018. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 48 | 35% | 88 |
| cb.nano.Insomnia 1.0 | 23 | 17% | 15 |
| kawigi.micro.Shiz 1.1 | 19 | 14% | 68 |
| mld.DustBunny 3.8 | 14 | 10% | 46 |
| kawigi.robot.Girl 1.2 | 13 | 9% | 27 |
| Grystrion.TrackerWO 1.0 | 10 | 7% | 13 |
| divineomega.TrialBot 0.003 | 6 | 4% | 12 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 3 | 2% | 5 |
| lambdaxy.TBot 0.1 | 2 | 1% | 6 |

## Melee bench: F16

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 85.7 | 106 / 280 | 2.29 | 19.0% | 47096 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.0% | 106 |
| gh.Griezel 0.5.2 | 2.0 | 17.4% | 125 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.3% | 3 |
| techdude.forest.FlamingForest 1.1 | 4.5 | 9.9% | 33 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 8.9% | 2 |
| tvv.nano.Polaris 1.2 | 5.3 | 8.9% | 6 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 6.9% | 1 |
| repositorio.NanoStep 1.0 | 8.9 | 5.2% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.2% | 4 |
| asd.Cthulhu 1.3 | 9.1 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 82.5 | 8 / 35 | 5074 |
| 2 | 1 | 70.8 | 90.5 | 16 / 35 | 6210 |
| 3 | 1 | 67.1 | 80.6 | 12 / 35 | 5345 |
| 4 | 1 | 68.1 | 84.1 | 13 / 35 | 5583 |
| 5 | 1 | 70.3 | 88.6 | 12 / 35 | 6163 |
| 6 | 1 | 68.8 | 84.4 | 12 / 35 | 5925 |
| 7 | 1 | 70.2 | 86.7 | 18 / 35 | 6209 |
| 8 | 1 | 70.7 | 88.3 | 15 / 35 | 6587 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 128 | 27% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 31 | 97% |
| techdude.forest.FlamingForest 1.1 | 29 | 41% |
| bvh.fnr.Fenrir 0.36l | 9 | 89% |
| tvv.nano.Polaris 1.2 | 9 | 100% |
| divineomega.DivineBot 1.9.4.5 | 9 | 100% |
| stelo.IntrinsicVolatility 1.4 | 3 | 67% |
| asd.Cthulhu 1.3 | 2 | 100% |

Hadur died in 175 of 280 rounds, at a mean tick of 1563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 114 | 65% | 152 |
| techdude.forest.FlamingForest 1.1 | 24 | 14% | 37 |
| bvh.fnr.Fenrir 0.36l | 13 | 7% | 15 |
| stelo.IntrinsicVolatility 1.4 | 9 | 5% | 13 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 7 | 4% | 36 |
| tvv.nano.Polaris 1.2 | 4 | 2% | 9 |
| divineomega.DivineBot 1.9.4.5 | 2 | 1% | 13 |
| asd.Cthulhu 1.3 | 2 | 1% | 4 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |

## Melee bench: F17

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 80.2 | 127 / 280 | 2.79 | 17.5% | 39992 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.5% | 127 |
| et.Predator 1.8 | 2.4 | 13.6% | 42 |
| oog.melee.Mercutio 1.0 | 3.6 | 12.0% | 39 |
| cx.BlestPain 1.41 | 3.8 | 12.1% | 46 |
| nic.Nicator 2.4 | 5.0 | 10.8% | 16 |
| ahf.NanoAndrew .4 | 5.4 | 10.2% | 9 |
| maribo.melee.BMV 0.1 | 6.9 | 8.7% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.4 | 6.1% | 0 |
| tex.Longbot 0.4 | 8.6 | 6.0% | 1 |
| goblin.Bender 2.4 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 79.4 | 17 / 35 | 4920 |
| 2 | 1 | 68.1 | 85.1 | 19 / 35 | 5151 |
| 3 | 1 | 65.7 | 76.8 | 17 / 35 | 4622 |
| 4 | 1 | 66.7 | 78.1 | 16 / 35 | 5127 |
| 5 | 1 | 67.0 | 83.5 | 14 / 35 | 5085 |
| 6 | 1 | 65.9 | 75.6 | 15 / 35 | 4969 |
| 7 | 1 | 66.7 | 81.3 | 14 / 35 | 4877 |
| 8 | 1 | 67.4 | 81.6 | 15 / 35 | 5241 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 68 | 78% |
| oog.melee.Mercutio 1.0 | 42 | 64% |
| nic.Nicator 2.4 | 33 | 70% |
| cx.BlestPain 1.41 | 28 | 39% |
| ahf.NanoAndrew .4 | 10 | 80% |
| tex.Longbot 0.4 | 3 | 67% |
| maribo.melee.BMV 0.1 | 2 | 100% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 155 of 280 rounds, at a mean tick of 975. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 35 | 23% | 54 |
| et.Predator 1.8 | 34 | 22% | 78 |
| oog.melee.Mercutio 1.0 | 27 | 17% | 58 |
| nic.Nicator 2.4 | 22 | 14% | 38 |
| ahf.NanoAndrew .4 | 11 | 7% | 19 |
| goblin.Bender 2.4 | 9 | 6% | 9 |
| maribo.melee.BMV 0.1 | 7 | 5% | 11 |
| tex.Longbot 0.4 | 6 | 4% | 6 |
| edu.otg.spr.TheTeacher 1.2 | 4 | 3% | 7 |

## Melee bench: F18

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 81.7 | 148 / 280 | 2.65 | 17.8% | 37076 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.8% | 148 |
| morbid.MorbidPriest 1.0 | 2.4 | 12.8% | 44 |
| agd.Mooserwirt2 2.7 | 2.8 | 12.0% | 37 |
| uji.DBH 1.1 | 4.4 | 10.8% | 11 |
| ratosh.Nobo 0.21 | 4.8 | 10.4% | 11 |
| spinnercat.Robovirus 2.718 | 5.9 | 10.0% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 7.4 | 8.0% | 7 |
| sigterm.Sigterm 1.0 | 7.5 | 8.0% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.5% | 0 |
| stelo.WangRobot 1.0 | 9.5 | 4.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 81.0 | 20 / 35 | 4172 |
| 2 | 1 | 68.0 | 85.7 | 21 / 35 | 4695 |
| 3 | 1 | 67.4 | 82.2 | 15 / 35 | 4789 |
| 4 | 1 | 68.1 | 87.0 | 21 / 35 | 4528 |
| 5 | 1 | 68.5 | 86.3 | 21 / 35 | 5178 |
| 6 | 1 | 65.0 | 75.9 | 18 / 35 | 4533 |
| 7 | 1 | 65.0 | 76.2 | 16 / 35 | 4510 |
| 8 | 1 | 65.8 | 79.0 | 16 / 35 | 4671 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 50 | 76% |
| agd.Mooserwirt2 2.7 | 41 | 61% |
| uji.DBH 1.1 | 31 | 94% |
| spinnercat.Robovirus 2.718 | 23 | 91% |
| sigterm.Sigterm 1.0 | 19 | 89% |
| ratosh.Nobo 0.21 | 16 | 75% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 60% |
| stelo.WangRobot 1.0 | 4 | 75% |

Hadur died in 133 of 280 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 41 | 31% | 70 |
| morbid.MorbidPriest 1.0 | 33 | 25% | 88 |
| uji.DBH 1.1 | 13 | 10% | 23 |
| kawigi.mini.Fhqwhgads 1.1 | 13 | 10% | 18 |
| ratosh.Nobo 0.21 | 10 | 8% | 26 |
| spinnercat.Robovirus 2.718 | 8 | 6% | 22 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 6 | 5% | 10 |
| sigterm.Sigterm 1.0 | 5 | 4% | 16 |
| stelo.WangRobot 1.0 | 4 | 3% | 7 |

## Melee bench: F19

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 93.7 | 224 / 280 | 1.56 | 21.2% | 47511 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 21.2% | 224 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.2% | 20 |
| mld.Infinity 2.2 | 2.9 | 13.5% | 28 |
| krillr.mini.JointStrike 2.0.0 | 4.1 | 11.4% | 7 |
| erdnis.Rover 0.3 | 4.8 | 10.7% | 1 |
| patson.PatsonTestBot 1.0 | 6.1 | 8.2% | 0 |
| mbh.Mbh 0.1 | 7.0 | 7.3% | 0 |
| pac.ABC 2.1 | 8.1 | 6.6% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.8% | 2 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 94.9 | 28 / 35 | 6366 |
| 2 | 1 | 72.2 | 94.3 | 28 / 35 | 5818 |
| 3 | 1 | 71.7 | 93.3 | 27 / 35 | 5650 |
| 4 | 1 | 71.0 | 92.4 | 24 / 35 | 5660 |
| 5 | 1 | 72.7 | 95.6 | 30 / 35 | 5893 |
| 6 | 1 | 72.7 | 94.0 | 30 / 35 | 6061 |
| 7 | 1 | 72.3 | 94.9 | 28 / 35 | 5849 |
| 8 | 1 | 71.7 | 90.5 | 29 / 35 | 6214 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 105 | 93% |
| mld.Infinity 2.2 | 97 | 89% |
| krillr.mini.JointStrike 2.0.0 | 18 | 89% |
| erdnis.Rover 0.3 | 15 | 93% |
| pac.ABC 2.1 | 3 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |
| patson.PatsonTestBot 1.0 | 2 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |
| pedersen.Moron 2.0 | 1 | 100% |

Hadur died in 57 of 280 rounds, at a mean tick of 1077. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 19 | 33% | 149 |
| mld.Infinity 2.2 | 14 | 25% | 20 |
| krillr.mini.JointStrike 2.0.0 | 11 | 19% | 38 |
| erdnis.Rover 0.3 | 6 | 11% | 32 |
| pbg.R2D2 1.0 | 2 | 4% | 13 |
| pac.ABC 2.1 | 2 | 4% | 6 |
| patson.PatsonTestBot 1.0 | 1 | 2% | 14 |
| mbh.Mbh 0.1 | 1 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.8 | 144 / 280 | 2.28 | 18.8% | 42657 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.8% | 144 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.3% | 60 |
| fwb.Nine 1.0.1 | 3.5 | 11.4% | 32 |
| nz.jdc.nano.GridFu 1.0 | 3.9 | 10.6% | 7 |
| catcat20.Rabbit 0.001 | 4.8 | 9.9% | 28 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.3% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 7.8% | 6 |
| bayen.nut.Squirrel 1.615 | 7.9 | 7.2% | 2 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 6.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.9 | 20 / 35 | 5099 |
| 2 | 1 | 68.1 | 85.7 | 17 / 35 | 5193 |
| 3 | 1 | 69.5 | 90.5 | 19 / 35 | 5589 |
| 4 | 1 | 67.6 | 82.2 | 18 / 35 | 5084 |
| 5 | 1 | 66.5 | 78.7 | 16 / 35 | 5067 |
| 6 | 1 | 69.8 | 89.2 | 16 / 35 | 5993 |
| 7 | 1 | 68.8 | 86.3 | 22 / 35 | 5372 |
| 8 | 1 | 68.0 | 85.4 | 16 / 35 | 5260 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 94 | 62% |
| fwb.Nine 1.0.1 | 37 | 65% |
| catcat20.Rabbit 0.001 | 27 | 59% |
| nz.jdc.nano.GridFu 1.0 | 22 | 91% |
| bayen.nut.Squirrel 1.615 | 16 | 100% |
| djdjdj.NanoSkunk10 1.0 | 5 | 60% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |

Hadur died in 137 of 280 rounds, at a mean tick of 1057. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 68 | 50% | 112 |
| fwb.Nine 1.0.1 | 30 | 22% | 42 |
| catcat20.Rabbit 0.001 | 20 | 15% | 39 |
| nz.jdc.nano.GridFu 1.0 | 8 | 6% | 35 |
| djdjdj.NanoSkunk10 1.0 | 5 | 4% | 12 |
| bayen.nut.Squirrel 1.615 | 2 | 1% | 18 |
| m3thos.mini.Eva01 0.5.5 | 2 | 1% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 10 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 2 |

## Melee bench: F21

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.8 | 140 / 280 | 2.19 | 19.1% | 43842 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.1% | 140 |
| eem.EvBot v4.6.16 | 2.0 | 16.4% | 108 |
| dummy.mini.Scimitar 1.01 | 3.1 | 13.7% | 12 |
| cf.RiO.RiOx 4.2.1 | 3.9 | 11.8% | 5 |
| eld.Hmm 1.0 | 5.4 | 8.4% | 12 |
| oa.weak.BotherBot 0.1 | 5.6 | 7.9% | 3 |
| fire219.CatBot 1.0 | 8.0 | 6.0% | 0 |
| PSW.Relentless 0.1 | 8.0 | 6.1% | 1 |
| el.JumpShoot 0.2 | 8.1 | 6.1% | 1 |
| arthord.MannyPacquiao Beta | 9.9 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 84.4 | 23 / 35 | 6013 |
| 2 | 1 | 68.0 | 81.0 | 15 / 35 | 5351 |
| 3 | 1 | 68.3 | 84.8 | 15 / 35 | 5281 |
| 4 | 1 | 70.4 | 90.8 | 21 / 35 | 5497 |
| 5 | 1 | 69.8 | 89.8 | 18 / 35 | 5617 |
| 6 | 1 | 69.6 | 90.2 | 17 / 35 | 5265 |
| 7 | 1 | 69.0 | 85.4 | 15 / 35 | 5662 |
| 8 | 1 | 68.7 | 87.9 | 16 / 35 | 5156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 138 | 43% |
| dummy.mini.Scimitar 1.01 | 41 | 95% |
| cf.RiO.RiOx 4.2.1 | 26 | 92% |
| eld.Hmm 1.0 | 11 | 91% |
| oa.weak.BotherBot 0.1 | 7 | 86% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| PSW.Relentless 0.1 | 1 | 0% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 141 of 280 rounds, at a mean tick of 1260. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 92 | 65% | 129 |
| cf.RiO.RiOx 4.2.1 | 14 | 10% | 27 |
| dummy.mini.Scimitar 1.01 | 12 | 9% | 55 |
| fire219.CatBot 1.0 | 8 | 6% | 8 |
| oa.weak.BotherBot 0.1 | 5 | 4% | 18 |
| PSW.Relentless 0.1 | 4 | 3% | 4 |
| el.JumpShoot 0.2 | 3 | 2% | 5 |
| eld.Hmm 1.0 | 1 | 1% | 24 |
| arthord.MannyPacquiao Beta | 1 | 1% | 6 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 79.4 | 115 / 280 | 2.86 | 18.1% | 45497 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 18.1% | 115 |
| pe.SandboxLump 1.52 | 1.8 | 17.2% | 91 |
| cre.Karolos 0.32 | 3.0 | 14.3% | 38 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 10.0% | 16 |
| stelo.RamTrackSurfer 1.2 | 4.9 | 9.7% | 15 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.6 | 9.6% | 1 |
| cw.megas.Blade 0.8 | 7.0 | 8.4% | 2 |
| sample.Walls 1.0 | 7.8 | 7.4% | 2 |
| cli.WasteOfAmmo 1.0 | 9.1 | 3.5% | 0 |
| rrh.Iwillfindyou 2.0 | 9.9 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 81.9 | 19 / 35 | 6145 |
| 2 | 1 | 68.5 | 78.7 | 14 / 35 | 5561 |
| 3 | 1 | 68.5 | 80.0 | 16 / 35 | 5801 |
| 4 | 2 | 68.0 | 76.5 | 14 / 35 | 5523 |
| 5 | 2 | 68.0 | 76.5 | 14 / 35 | 5588 |
| 6 | 1 | 67.3 | 77.5 | 11 / 35 | 5780 |
| 7 | 1 | 69.4 | 81.3 | 14 / 35 | 5800 |
| 8 | 1 | 68.3 | 82.5 | 13 / 35 | 5299 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 116 | 57% |
| cre.Karolos 0.32 | 43 | 65% |
| stelo.AreaTargetingBot 1.1 | 16 | 75% |
| stelo.RamTrackSurfer 1.2 | 8 | 88% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 165 of 280 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 82 | 50% | 137 |
| cre.Karolos 0.32 | 38 | 23% | 68 |
| stelo.AreaTargetingBot 1.1 | 16 | 10% | 29 |
| stelo.RamTrackSurfer 1.2 | 10 | 6% | 20 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 5% | 12 |
| sample.Walls 1.0 | 5 | 3% | 7 |
| cw.megas.Blade 0.8 | 5 | 3% | 7 |

## Melee bench: F24

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 69.8 | 60 / 280 | 3.72 | 14.4% | 31439 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 2.3 | 14.4% | 60 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.0% | 56 |
| florent.XSeries.X2 0.12 | 2.8 | 14.0% | 60 |
| davidalves.Phoenix 0.54 | 2.9 | 13.2% | 68 |
| pedersen.Ugluk 1.1.1 | 4.9 | 11.5% | 22 |
| oog.melee.Corsair 1.0 | 6.0 | 9.5% | 8 |
| stelo.SoJNanoMelee 1.1 | 7.4 | 6.7% | 7 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.3% | 0 |
| as.FrankTheTank 1.3 | 9.1 | 5.3% | 0 |
| evd.X1 0.01 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 76.8 | 13 / 35 | 4161 |
| 2 | 2 | 60.5 | 67.3 | 7 / 35 | 3902 |
| 3 | 2 | 62.7 | 72.7 | 7 / 35 | 4143 |
| 4 | 4 | 58.6 | 61.6 | 7 / 35 | 3658 |
| 5 | 1 | 64.3 | 78.1 | 8 / 35 | 4392 |
| 6 | 3 | 60.6 | 66.3 | 5 / 35 | 3794 |
| 7 | 2 | 62.6 | 71.1 | 8 / 35 | 3832 |
| 8 | 3 | 59.3 | 64.1 | 5 / 35 | 3557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 31 | 45% |
| davidalves.Phoenix 0.54 | 31 | 45% |
| florent.XSeries.X2 0.12 | 29 | 34% |
| stelo.SoJNanoMelee 1.1 | 15 | 73% |
| pedersen.Ugluk 1.1.1 | 13 | 54% |
| oog.melee.Corsair 1.0 | 8 | 50% |

Hadur died in 222 of 280 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 68 | 31% | 77 |
| rz.GlowBlowMelee 1.4 | 46 | 21% | 61 |
| davidalves.Phoenix 0.54 | 41 | 18% | 50 |
| pedersen.Ugluk 1.1.1 | 20 | 9% | 31 |
| oog.melee.Corsair 1.0 | 16 | 7% | 23 |
| stelo.SoJNanoMelee 1.1 | 12 | 5% | 16 |
| evd.X1 0.01 | 9 | 4% | 10 |
| as.FrankTheTank 1.3 | 6 | 3% | 7 |
| lunchie.Lunchbox 0.93 | 3 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 79.6 | 162 / 280 | 2.83 | 17.4% | 33643 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.4% | 162 |
| voidious.mini.BrokenSword 2.0.3 | 2.1 | 13.6% | 30 |
| voidious.micro.BlitzBat 1.05 | 3.1 | 12.7% | 24 |
| jdw.Hurricane 1.4 | 3.8 | 11.8% | 29 |
| gre.svman4.Morfeas 1.4.1 | 5.4 | 9.6% | 15 |
| ds.Oo 2.2 | 6.4 | 8.6% | 10 |
| gjr.Cephalosporin 0.1 | 6.6 | 8.1% | 8 |
| adt.Ar2 1.1 | 8.3 | 7.0% | 1 |
| awesomeness.Elite 1.0 | 8.4 | 6.6% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 81.3 | 23 / 35 | 4236 |
| 2 | 1 | 65.1 | 76.2 | 19 / 35 | 4079 |
| 3 | 1 | 64.3 | 73.7 | 17 / 35 | 4035 |
| 4 | 1 | 66.2 | 79.4 | 21 / 35 | 4014 |
| 5 | 1 | 66.6 | 81.6 | 20 / 35 | 4152 |
| 6 | 1 | 64.2 | 74.6 | 17 / 35 | 3873 |
| 7 | 1 | 67.4 | 83.5 | 21 / 35 | 4518 |
| 8 | 1 | 69.1 | 87.0 | 24 / 35 | 4736 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 54 | 96% |
| voidious.micro.BlitzBat 1.05 | 48 | 94% |
| jdw.Hurricane 1.4 | 33 | 82% |
| gjr.Cephalosporin 0.1 | 14 | 93% |
| gre.svman4.Morfeas 1.4.1 | 14 | 93% |
| adt.Ar2 1.1 | 8 | 88% |
| awesomeness.Elite 1.0 | 4 | 50% |
| ds.Oo 2.2 | 4 | 75% |

Hadur died in 120 of 280 rounds, at a mean tick of 527. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 31 | 26% | 47 |
| voidious.micro.BlitzBat 1.05 | 20 | 17% | 49 |
| voidious.mini.BrokenSword 2.0.3 | 19 | 16% | 75 |
| ds.Oo 2.2 | 12 | 10% | 21 |
| adt.Ar2 1.1 | 10 | 8% | 19 |
| gjr.Cephalosporin 0.1 | 8 | 7% | 28 |
| awesomeness.Elite 1.0 | 8 | 7% | 14 |
| gre.svman4.Morfeas 1.4.1 | 6 | 5% | 18 |
| amk.ChumbaMini 0.2 | 5 | 4% | 7 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.1 | 129 / 280 | 2.25 | 18.5% | 44972 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.5% | 129 |
| ak.Fermat 2.0 | 2.0 | 15.0% | 68 |
| shu.nitro.LENIN .T34 | 3.5 | 12.1% | 35 |
| lrem.Spectre 0.4.4 | 3.8 | 12.2% | 33 |
| js.PinBall 1.6 | 5.1 | 10.5% | 5 |
| gh.mini.GrubbmOne 1.0 | 6.1 | 9.6% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 6.5 | 8.7% | 5 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.6% | 3 |
| sample.SpinBot 1.0 | 9.0 | 5.0% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 85.1 | 14 / 35 | 5904 |
| 2 | 1 | 69.4 | 88.6 | 19 / 35 | 5626 |
| 3 | 1 | 68.9 | 87.6 | 16 / 35 | 5354 |
| 4 | 1 | 69.1 | 85.4 | 17 / 35 | 5906 |
| 5 | 1 | 69.3 | 88.3 | 15 / 35 | 6030 |
| 6 | 1 | 68.0 | 83.2 | 18 / 35 | 5299 |
| 7 | 1 | 67.1 | 82.2 | 15 / 35 | 5385 |
| 8 | 1 | 68.4 | 88.3 | 15 / 35 | 5468 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 64 | 42% |
| shu.nitro.LENIN .T34 | 53 | 64% |
| lrem.Spectre 0.4.4 | 52 | 62% |
| js.PinBall 1.6 | 16 | 81% |
| jaybot.adv.bots.JayBot 2.0 | 12 | 75% |
| fullsail.LaxativeTeaTwo 1.0 | 8 | 88% |
| gh.mini.GrubbmOne 1.0 | 7 | 100% |
| sample.SpinBot 1.0 | 1 | 0% |

Hadur died in 153 of 280 rounds, at a mean tick of 983. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 59 | 39% | 85 |
| shu.nitro.LENIN .T34 | 33 | 22% | 74 |
| lrem.Spectre 0.4.4 | 30 | 20% | 53 |
| js.PinBall 1.6 | 13 | 8% | 24 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 3% | 14 |
| gh.mini.GrubbmOne 1.0 | 5 | 3% | 13 |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 3% | 12 |
| sample.SpinBot 1.0 | 4 | 3% | 5 |

## Melee bench: F27

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 80.4 | 161 / 280 | 2.76 | 17.4% | 35500 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.4% | 161 |
| wee.Gem 1.8.4 | 3.1 | 11.4% | 25 |
| mk.Alpha 0.2.1 | 3.3 | 12.9% | 49 |
| sheldor.melee.nano.TestMelee 0.1 | 3.9 | 11.0% | 21 |
| EH.Eagle 1.0.6 | 4.5 | 10.5% | 13 |
| techdude.kombat.FlamingKombat 1.5 | 6.8 | 8.8% | 6 |
| joe.ADinosaur 1.0 | 7.3 | 7.8% | 4 |
| throxbot.ThroxBot 0.1 | 7.4 | 8.1% | 2 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.7% | 0 |
| cs.Grudge 1.0 | 9.1 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 82.2 | 21 / 35 | 4242 |
| 2 | 1 | 67.5 | 81.3 | 22 / 35 | 4923 |
| 3 | 1 | 65.9 | 79.7 | 20 / 35 | 4389 |
| 4 | 1 | 65.2 | 81.6 | 20 / 35 | 3898 |
| 5 | 1 | 64.4 | 74.3 | 19 / 35 | 4285 |
| 6 | 1 | 65.9 | 80.0 | 16 / 35 | 4441 |
| 7 | 1 | 68.4 | 87.0 | 22 / 35 | 4692 |
| 8 | 1 | 65.9 | 77.1 | 21 / 35 | 4630 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 78 | 77% |
| wee.Gem 1.8.4 | 45 | 91% |
| sheldor.melee.nano.TestMelee 0.1 | 25 | 92% |
| EH.Eagle 1.0.6 | 15 | 93% |
| throxbot.ThroxBot 0.1 | 11 | 91% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| cs.Grudge 1.0 | 1 | 100% |

Hadur died in 120 of 280 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 31 | 26% | 90 |
| joe.ADinosaur 1.0 | 23 | 19% | 23 |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 14% | 41 |
| wee.Gem 1.8.4 | 15 | 13% | 55 |
| techdude.kombat.FlamingKombat 1.5 | 10 | 8% | 18 |
| EH.Eagle 1.0.6 | 8 | 7% | 21 |
| caimano.Furia_Ceca 0.22 | 8 | 7% | 12 |
| throxbot.ThroxBot 0.1 | 7 | 6% | 17 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.1 | 169 / 280 | 2.25 | 18.5% | 34687 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.5% | 169 |
| kid.test.NightFox .2 | 2.1 | 14.3% | 37 |
| uji.Antique 1.0 | 3.3 | 12.0% | 36 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.7% | 22 |
| pfvicm.Sobieski 7.2.3b | 4.4 | 10.2% | 4 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.6% | 3 |
| ahr.ice.Ice 1.0.2 | 6.8 | 8.3% | 7 |
| matt.advanced.Katana 1.0 | 8.1 | 6.3% | 2 |
| stelo.PianistNano 1.2 | 9.3 | 5.7% | 1 |
| stelo.Lifestealer 1.0 | 9.6 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 86.3 | 23 / 35 | 4677 |
| 2 | 1 | 68.5 | 88.3 | 22 / 35 | 4528 |
| 3 | 1 | 68.5 | 90.8 | 21 / 35 | 4178 |
| 4 | 1 | 66.8 | 81.9 | 19 / 35 | 4444 |
| 5 | 1 | 67.1 | 85.1 | 19 / 35 | 4097 |
| 6 | 1 | 66.7 | 82.9 | 19 / 35 | 4153 |
| 7 | 1 | 67.3 | 83.2 | 23 / 35 | 4180 |
| 8 | 1 | 69.4 | 90.2 | 23 / 35 | 4430 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 95 | 86% |
| uji.Antique 1.0 | 51 | 84% |
| qohnil.blot.BlotBot 3.61 | 27 | 41% |
| ahr.ice.Ice 1.0.2 | 13 | 69% |
| amk.ChumbaWumba 0.3 | 10 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 100% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 112 of 280 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| qohnil.blot.BlotBot 3.61 | 21 | 19% | 39 |
| uji.Antique 1.0 | 20 | 18% | 73 |
| pfvicm.Sobieski 7.2.3b | 20 | 18% | 28 |
| kid.test.NightFox .2 | 19 | 17% | 83 |
| amk.ChumbaWumba 0.3 | 13 | 12% | 20 |
| ahr.ice.Ice 1.0.2 | 9 | 8% | 17 |
| stelo.Lifestealer 1.0 | 5 | 4% | 7 |
| matt.advanced.Katana 1.0 | 3 | 3% | 7 |
| stelo.PianistNano 1.2 | 2 | 2% | 4 |

## Melee bench: F29

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 79.8 | 85 / 280 | 2.82 | 17.1% | 37629 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 17.1% | 85 |
| zyx.mega.YersiniaPestis 3.1 | 1.8 | 16.4% | 104 |
| deewiant.Anomaly 0.2 | 3.0 | 14.3% | 70 |
| myl.micro.Troodon 1.10 | 4.1 | 11.4% | 8 |
| jok.PheonixM 0.1.2 | 4.9 | 10.2% | 6 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.6% | 1 |
| DBall.Anarchy 0.1 | 7.3 | 6.8% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 8.1 | 5.7% | 0 |
| ap.Frederick 1.1 | 8.8 | 5.1% | 1 |
| jangs.ns51 1.0 | 9.9 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 80.3 | 11 / 35 | 4939 |
| 2 | 1 | 68.8 | 84.4 | 14 / 35 | 5293 |
| 3 | 2 | 65.5 | 75.9 | 11 / 35 | 4587 |
| 4 | 1 | 65.8 | 79.0 | 9 / 35 | 4434 |
| 5 | 2 | 64.6 | 72.1 | 11 / 35 | 4540 |
| 6 | 1 | 67.4 | 86.7 | 11 / 35 | 4525 |
| 7 | 1 | 66.4 | 80.6 | 8 / 35 | 4733 |
| 8 | 1 | 66.1 | 79.0 | 10 / 35 | 4578 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 70 | 20% |
| deewiant.Anomaly 0.2 | 67 | 48% |
| myl.micro.Troodon 1.10 | 22 | 82% |
| jok.PheonixM 0.1.2 | 10 | 90% |
| DBall.Anarchy 0.1 | 9 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 0% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 196 of 280 rounds, at a mean tick of 988. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 81 | 41% | 97 |
| deewiant.Anomaly 0.2 | 71 | 36% | 106 |
| myl.micro.Troodon 1.10 | 15 | 8% | 32 |
| jok.PheonixM 0.1.2 | 10 | 5% | 17 |
| ph.melee.ArcherME 0.3 | 8 | 4% | 11 |
| DBall.Anarchy 0.1 | 6 | 3% | 11 |
| jangs.ns51 1.0 | 4 | 2% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |

## Melee bench: F30

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.6 | 56.7 | 30 / 280 | 4.90 | 12.0% | 30999 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.5 | 14.1% | 83 |
| darkcanuck.B26354 1.06 | 2.0 | 13.8% | 68 |
| oog.melee.Capulet 1.2 | 3.5 | 12.5% | 35 |
| stelo.PastFuture 2.3.2 | 3.8 | 12.6% | 34 |
| hadur117.micro.SaorC 0.1 | 4.3 | 12.0% | 30 |
| intruder.PrairieWolf 2.61 | 6.5 | 9.1% | 11 |
| ntc.Opposite 1.5 | 7.5 | 8.2% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.9 | 7.5% | 11 |
| tripphippy.Alice 1.1 | 8.1 | 7.4% | 8 |
| GarmBox.Anger 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.0 | 54.0 | 5 / 35 | 3768 |
| 2 | 5 | 55.3 | 54.0 | 3 / 35 | 3803 |
| 3 | 4 | 56.5 | 56.2 | 4 / 35 | 3755 |
| 4 | 5 | 53.4 | 51.1 | 2 / 35 | 3388 |
| 5 | 3 | 60.3 | 65.7 | 6 / 35 | 4244 |
| 6 | 3 | 58.2 | 61.0 | 2 / 35 | 4123 |
| 7 | 5 | 54.3 | 49.8 | 4 / 35 | 3695 |
| 8 | 4 | 59.1 | 61.9 | 4 / 35 | 4223 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 23 | 13% |
| darkcanuck.B26354 1.06 | 22 | 18% |
| stelo.PastFuture 2.3.2 | 15 | 80% |
| oog.melee.Capulet 1.2 | 12 | 42% |
| tripphippy.Alice 1.1 | 6 | 83% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 50% |
| intruder.PrairieWolf 2.61 | 2 | 0% |

Hadur died in 251 of 280 rounds, at a mean tick of 647. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 59 | 24% | 65 |
| oog.melee.Capulet 1.2 | 58 | 23% | 63 |
| darkcanuck.B26354 1.06 | 49 | 20% | 54 |
| stelo.PastFuture 2.3.2 | 28 | 11% | 37 |
| tripphippy.Alice 1.1 | 20 | 8% | 23 |
| intruder.PrairieWolf 2.61 | 14 | 6% | 14 |
| ntc.Opposite 1.5 | 11 | 4% | 11 |
| fowl3628800.LightningBolt 2.6.0 | 7 | 3% | 8 |
| GarmBox.Anger 1.0 | 5 | 2% | 5 |

## Melee bench: F31

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 69.8 | 39 / 280 | 3.72 | 13.8% | 28644 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.0% | 151 |
| hadur117.micro.SaorC 0.1 | 2.4 | 13.8% | 39 |
| gh.mini.Griezel 0.2 | 3.4 | 12.5% | 53 |
| spinnercat.micro.Tyger 0.1 | 4.0 | 11.7% | 15 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.3% | 9 |
| gh.nano.Grofvuil 0.2 | 6.1 | 8.8% | 7 |
| timmit.nano.TimDog 0.33 | 7.1 | 7.5% | 5 |
| fm.mammillarias 1.3 | 7.8 | 6.6% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.1% | 1 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.0 | 64.8 | 2 / 35 | 3508 |
| 2 | 2 | 59.8 | 67.3 | 6 / 35 | 3355 |
| 3 | 2 | 59.9 | 69.5 | 5 / 35 | 3370 |
| 4 | 3 | 61.5 | 70.2 | 6 / 35 | 3729 |
| 5 | 2 | 59.1 | 63.2 | 4 / 35 | 3582 |
| 6 | 2 | 62.5 | 74.6 | 3 / 35 | 3834 |
| 7 | 2 | 59.9 | 70.2 | 5 / 35 | 3294 |
| 8 | 2 | 64.1 | 78.4 | 8 / 35 | 3972 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 65 | 15% |
| gh.mini.Griezel 0.2 | 23 | 26% |
| spinnercat.micro.Tyger 0.1 | 14 | 79% |
| d414.nano.Quantum 1.0.0 | 11 | 64% |
| fm.mammillarias 1.3 | 3 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 50% |
| gh.nano.Grofvuil 0.2 | 2 | 50% |

Hadur died in 241 of 280 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 118 | 49% | 131 |
| spinnercat.micro.Tyger 0.1 | 27 | 11% | 36 |
| gh.mini.Griezel 0.2 | 27 | 11% | 32 |
| d414.nano.Quantum 1.0.0 | 23 | 10% | 32 |
| timmit.nano.TimDog 0.33 | 17 | 7% | 17 |
| gh.nano.Grofvuil 0.2 | 14 | 6% | 16 |
| fm.mammillarias 1.3 | 9 | 4% | 10 |
| Gecko.ultimateGeckoBot 1.0 | 5 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 1 | 0% | 1 |

## Melee bench: F32

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 82.3 | 113 / 280 | 2.59 | 17.4% | 39472 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 17.4% | 113 |
| kawigi.sbf.FloodHT 0.9.2 | 1.9 | 15.2% | 93 |
| apc.botM 3.0 | 3.4 | 12.0% | 37 |
| vjik.UnViolation 1.1 | 4.0 | 10.4% | 16 |
| lxx.ConceptA 0.8 | 4.6 | 10.1% | 3 |
| bayen.UbaMicro 1.4 | 6.1 | 8.7% | 2 |
| panzer.Panzer 0.2 | 7.4 | 7.8% | 2 |
| yk.JahMicro 1.0 | 7.9 | 6.6% | 9 |
| conscience.Electron 1.3g | 9.0 | 6.1% | 2 |
| donjezza.Jezza 1.0 | 9.6 | 5.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 77.8 | 15 / 35 | 4367 |
| 2 | 1 | 65.9 | 81.0 | 13 / 35 | 4800 |
| 3 | 1 | 67.8 | 85.4 | 18 / 35 | 5211 |
| 4 | 1 | 67.5 | 85.7 | 14 / 35 | 5232 |
| 5 | 2 | 65.9 | 80.0 | 10 / 35 | 5103 |
| 6 | 1 | 67.8 | 85.7 | 19 / 35 | 5166 |
| 7 | 1 | 64.1 | 76.8 | 8 / 35 | 4841 |
| 8 | 1 | 66.8 | 86.3 | 16 / 35 | 4752 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 91 | 25% |
| apc.botM 3.0 | 35 | 71% |
| vjik.UnViolation 1.1 | 21 | 86% |
| lxx.ConceptA 0.8 | 21 | 95% |
| donjezza.Jezza 1.0 | 9 | 89% |
| yk.JahMicro 1.0 | 7 | 86% |
| bayen.UbaMicro 1.4 | 7 | 100% |
| panzer.Panzer 0.2 | 6 | 100% |

Hadur died in 167 of 280 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 86 | 51% | 121 |
| apc.botM 3.0 | 20 | 12% | 47 |
| lxx.ConceptA 0.8 | 18 | 11% | 27 |
| vjik.UnViolation 1.1 | 15 | 9% | 40 |
| bayen.UbaMicro 1.4 | 10 | 6% | 14 |
| panzer.Panzer 0.2 | 7 | 4% | 7 |
| conscience.Electron 1.3g | 6 | 4% | 10 |
| yk.JahMicro 1.0 | 3 | 2% | 5 |
| donjezza.Jezza 1.0 | 2 | 1% | 9 |

## Melee bench: F33

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 85.2 | 151 / 280 | 2.33 | 19.2% | 42907 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.2% | 151 |
| maribo.Quester 0.3 | 2.0 | 15.5% | 58 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.4% | 15 |
| gre.svman4.Leonidas 1.3.2 | 4.1 | 11.2% | 19 |
| labg.Cataclysm 2.05 | 4.9 | 10.2% | 26 |
| baal.nano.N 1.42 | 6.0 | 9.1% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.5% | 8 |
| zyx.micro.Ant 1.1 | 8.4 | 5.5% | 1 |
| sanja.First 0.1 | 8.6 | 5.1% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 87.0 | 22 / 35 | 5680 |
| 2 | 1 | 69.6 | 88.3 | 19 / 35 | 5342 |
| 3 | 1 | 68.9 | 84.4 | 20 / 35 | 5121 |
| 4 | 1 | 66.6 | 75.2 | 16 / 35 | 4936 |
| 5 | 1 | 67.2 | 78.1 | 17 / 35 | 5279 |
| 6 | 1 | 70.9 | 92.4 | 22 / 35 | 5216 |
| 7 | 1 | 69.9 | 87.0 | 16 / 35 | 5924 |
| 8 | 1 | 70.1 | 89.5 | 19 / 35 | 5409 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 71 | 63% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 53 | 91% |
| gre.svman4.Leonidas 1.3.2 | 41 | 78% |
| labg.Cataclysm 2.05 | 16 | 44% |
| kinsen.melee.Angsaichmophobia 1.8c | 15 | 80% |
| baal.nano.N 1.42 | 4 | 100% |
| sanja.First 0.1 | 3 | 100% |

Hadur died in 131 of 280 rounds, at a mean tick of 969. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 57 | 44% | 113 |
| gre.svman4.Leonidas 1.3.2 | 19 | 15% | 42 |
| labg.Cataclysm 2.05 | 17 | 13% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 11% | 63 |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 8% | 14 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 8 | 6% | 9 |
| sanja.First 0.1 | 4 | 3% | 5 |
| zyx.micro.Ant 1.1 | 1 | 1% | 2 |
| baal.nano.N 1.42 | 0 | 0% | 5 |

## Melee bench: F34

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 76.7 | 39 / 280 | 3.09 | 15.8% | 38390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.1 | 17.3% | 134 |
| kid.Gladiator .7.2 | 2.4 | 16.2% | 73 |
| hadur117.micro.SaorC 0.1 | 2.5 | 15.8% | 39 |
| tcf.Reach 3 | 4.4 | 11.4% | 12 |
| jcs.Seth 1.8 | 4.8 | 10.6% | 19 |
| cli.Dancer 1.1 | 5.9 | 9.5% | 3 |
| ratosh.Wesco 1.4 | 7.0 | 7.2% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.9% | 0 |
| sample.RamFire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.4 | 77.1 | 3 / 35 | 4507 |
| 2 | 1 | 65.8 | 76.2 | 9 / 35 | 5058 |
| 3 | 3 | 65.9 | 80.3 | 3 / 35 | 4958 |
| 4 | 3 | 64.1 | 72.1 | 4 / 35 | 4577 |
| 5 | 3 | 64.6 | 75.2 | 3 / 35 | 4738 |
| 6 | 3 | 63.4 | 70.8 | 4 / 35 | 4636 |
| 7 | 2 | 66.6 | 83.2 | 6 / 35 | 4750 |
| 8 | 2 | 66.1 | 79.0 | 7 / 35 | 5166 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 78 | 15% |
| kid.Gladiator .7.2 | 44 | 25% |
| jcs.Seth 1.8 | 13 | 54% |
| tcf.Reach 3 | 8 | 50% |
| cli.Dancer 1.1 | 4 | 50% |
| ratosh.Wesco 1.4 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 241 of 280 rounds, at a mean tick of 997. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 100 | 41% | 115 |
| kid.Gladiator .7.2 | 84 | 35% | 90 |
| tcf.Reach 3 | 18 | 7% | 26 |
| jcs.Seth 1.8 | 15 | 6% | 20 |
| cli.Dancer 1.1 | 10 | 4% | 14 |
| sample.RamFire 1.0 | 7 | 3% | 5 |
| ratosh.Wesco 1.4 | 5 | 2% | 7 |
| amk.Punbot.Punbot 0.01 | 1 | 0% | 2 |
| sample.VelociRobot 1.0 | 1 | 0% | 1 |

## Melee bench: F35

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 68.1 | 14 / 280 | 3.88 | 13.4% | 28131 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.8% | 226 |
| hadur117.micro.SaorC 0.1 | 2.6 | 13.4% | 14 |
| gh.mini.Gruwel 0.9 | 2.6 | 13.1% | 20 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.1 | 11.8% | 16 |
| rz.HawkOnFire 0.1 | 4.6 | 11.3% | 3 |
| myl.nano.KomoriNinja 1.1 | 6.6 | 6.9% | 0 |
| wit.Chuliath 1.0 | 6.8 | 6.8% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.6 | 6.1% | 0 |
| dans.Cinnamon 1.2 | 9.4 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.6 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.3 | 65.7 | 3 / 35 | 3588 |
| 2 | 2 | 61.3 | 71.4 | 3 / 35 | 3435 |
| 3 | 3 | 58.8 | 64.1 | 0 / 35 | 3357 |
| 4 | 3 | 57.5 | 58.7 | 0 / 35 | 3318 |
| 5 | 2 | 63.8 | 78.4 | 2 / 35 | 3727 |
| 6 | 2 | 60.5 | 67.6 | 2 / 35 | 3664 |
| 7 | 3 | 61.8 | 71.4 | 3 / 35 | 3581 |
| 8 | 3 | 60.1 | 67.0 | 1 / 35 | 3461 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 57 | 4% |
| gh.mini.Gruwel 0.9 | 11 | 9% |
| dmh.robocode.robot.BlackDeath 9.2 | 9 | 78% |
| rz.HawkOnFire 0.1 | 5 | 60% |
| wit.Chuliath 1.0 | 2 | 50% |

Hadur died in 266 of 280 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 151 | 57% | 156 |
| gh.mini.Gruwel 0.9 | 39 | 15% | 40 |
| dmh.robocode.robot.BlackDeath 9.2 | 25 | 9% | 31 |
| rz.HawkOnFire 0.1 | 25 | 9% | 28 |
| stelo.MyAgileRobot 0.2 | 7 | 3% | 7 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7 | 3% | 7 |
| wit.Chuliath 1.0 | 7 | 3% | 6 |
| myl.nano.KomoriNinja 1.1 | 3 | 1% | 3 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |

## Melee bench: F36

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 86.7 | 195 / 280 | 2.20 | 20.0% | 44985 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.0% | 195 |
| alpha.RainingFire 1.0 | 2.5 | 12.0% | 25 |
| bzdp.Pansy 2.1 | 3.4 | 11.5% | 12 |
| mz.Cork 0.1 | 4.4 | 10.7% | 12 |
| bvh.micro.Freya 0.3 | 4.8 | 10.6% | 14 |
| m3thos.Eva02 0.7.1 | 5.5 | 9.8% | 10 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.1% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.4 | 6.3% | 2 |
| dl.BetterWalls 1.0 | 8.8 | 5.3% | 2 |
| sample.MyFirstRobot 1.0 | 9.9 | 4.6% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 92.7 | 26 / 35 | 6112 |
| 2 | 1 | 68.7 | 81.3 | 22 / 35 | 5437 |
| 3 | 1 | 70.4 | 89.8 | 27 / 35 | 5403 |
| 4 | 1 | 70.8 | 91.1 | 25 / 35 | 5917 |
| 5 | 1 | 70.4 | 88.6 | 27 / 35 | 5535 |
| 6 | 1 | 70.5 | 88.3 | 24 / 35 | 5767 |
| 7 | 1 | 67.7 | 78.7 | 22 / 35 | 5242 |
| 8 | 1 | 68.6 | 82.9 | 22 / 35 | 5572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 51 | 94% |
| bvh.micro.Freya 0.3 | 49 | 90% |
| bvh.mini.Fenrir 0.39 | 36 | 100% |
| mz.Cork 0.1 | 35 | 83% |
| alpha.RainingFire 1.0 | 22 | 77% |
| m3thos.Eva02 0.7.1 | 15 | 87% |
| sample.MyFirstRobot 1.0 | 9 | 78% |
| squidM.TentalceMeleeNano 1.1 | 1 | 0% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 86 of 280 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 21 | 24% | 44 |
| bvh.mini.Fenrir 0.39 | 14 | 16% | 29 |
| bzdp.Pansy 2.1 | 13 | 15% | 60 |
| bvh.micro.Freya 0.3 | 12 | 14% | 48 |
| mz.Cork 0.1 | 8 | 9% | 35 |
| m3thos.Eva02 0.7.1 | 8 | 9% | 31 |
| sample.MyFirstRobot 1.0 | 4 | 5% | 8 |
| dl.BetterWalls 1.0 | 3 | 3% | 17 |
| squidM.TentalceMeleeNano 1.1 | 3 | 3% | 7 |

## Melee bench: F37

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 78.8 | 181 / 280 | 2.91 | 17.8% | 42197 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.8% | 181 |
| germ.TheMind .2 | 2.6 | 11.0% | 19 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.9 | 10.0% | 16 |
| EBBU.Sim2 1.02 | 4.5 | 9.8% | 8 |
| agrach.Dalek 1.0 | 5.5 | 9.4% | 19 |
| stelo.UntouchableNano 1.3 | 6.0 | 8.9% | 10 |
| mb.Beast 0.1 | 7.3 | 8.6% | 10 |
| skm.Ryubot 1.0 | 7.5 | 8.4% | 11 |
| lmk.ACPFinal 0.1 | 8.4 | 8.1% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 8.4 | 8.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 82.9 | 25 / 35 | 5477 |
| 2 | 1 | 67.1 | 83.2 | 26 / 35 | 5094 |
| 3 | 1 | 66.1 | 80.6 | 22 / 35 | 5054 |
| 4 | 1 | 66.2 | 76.8 | 21 / 35 | 5560 |
| 5 | 1 | 65.7 | 77.5 | 22 / 35 | 5215 |
| 6 | 1 | 65.3 | 75.9 | 23 / 35 | 5107 |
| 7 | 1 | 68.0 | 83.5 | 24 / 35 | 5753 |
| 8 | 1 | 63.6 | 70.2 | 18 / 35 | 4937 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 41 | 95% |
| stelo.UntouchableNano 1.3 | 31 | 97% |
| skm.Ryubot 1.0 | 26 | 88% |
| EBBU.Sim2 1.02 | 26 | 96% |
| mb.Beast 0.1 | 23 | 100% |
| lmk.ACPFinal 0.1 | 15 | 93% |
| agrach.Dalek 1.0 | 13 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 11 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 100% |

Hadur died in 99 of 280 rounds, at a mean tick of 304. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 25 | 25% | 33 |
| com.syncleus.robocode.Dreadnaught 0.1 | 20 | 20% | 43 |
| agrach.Dalek 1.0 | 16 | 16% | 46 |
| germ.TheMind .2 | 10 | 10% | 42 |
| EBBU.Sim2 1.02 | 9 | 9% | 34 |
| skm.Ryubot 1.0 | 6 | 6% | 12 |
| lmk.ACPFinal 0.1 | 5 | 5% | 15 |
| mb.Beast 0.1 | 4 | 4% | 28 |
| stelo.UntouchableNano 1.3 | 4 | 4% | 24 |

## Melee bench: F38

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 75.3 | 82 / 280 | 3.22 | 15.7% | 35288 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.4 | 16.7% | 126 |
| hadur117.micro.SaorC 0.1 | 1.6 | 15.7% | 82 |
| bvh.mini.Freya 0.55 | 3.8 | 11.9% | 13 |
| bts.mega.Gnarly 1.4 | 4.4 | 11.1% | 30 |
| cs.Wren 1.0 | 4.6 | 10.5% | 7 |
| kdf.KoulDestroyer 1.0 | 6.1 | 9.8% | 10 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.3 | 8.8% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.1 | 6.4% | 2 |
| matt.UnderDark3 2.4.34 | 9.4 | 4.4% | 1 |
| bzdp.BoxCar 2.0 | 9.4 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 72.4 | 7 / 35 | 4628 |
| 2 | 2 | 65.2 | 80.3 | 10 / 35 | 4632 |
| 3 | 2 | 62.1 | 71.7 | 10 / 35 | 3840 |
| 4 | 2 | 63.4 | 74.0 | 8 / 35 | 4269 |
| 5 | 1 | 65.1 | 81.3 | 12 / 35 | 4346 |
| 6 | 1 | 64.4 | 75.6 | 12 / 35 | 4565 |
| 7 | 1 | 64.3 | 75.9 | 11 / 35 | 4536 |
| 8 | 2 | 63.4 | 71.4 | 12 / 35 | 4472 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 80 | 25% |
| bts.mega.Gnarly 1.4 | 21 | 52% |
| bvh.mini.Freya 0.55 | 16 | 88% |
| cs.Wren 1.0 | 14 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 93% |
| kdf.KoulDestroyer 1.0 | 9 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 50% |
| matt.UnderDark3 2.4.34 | 1 | 0% |

Hadur died in 198 of 280 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 116 | 59% | 137 |
| bts.mega.Gnarly 1.4 | 24 | 12% | 38 |
| bvh.mini.Freya 0.55 | 20 | 10% | 32 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 7% | 32 |
| cs.Wren 1.0 | 9 | 5% | 18 |
| kdf.KoulDestroyer 1.0 | 7 | 4% | 10 |
| bzdp.BoxCar 2.0 | 4 | 2% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 2% | 4 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 3 |

## Melee bench: F39

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 81.0 | 86 / 280 | 2.71 | 17.5% | 43151 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.1 | 17.5% | 86 |
| bvh.fry.Freya 0.82 | 1.9 | 14.7% | 41 |
| az.Ololobot 0.2.4 | 3.0 | 13.0% | 94 |
| catcat20.Lambda 0.024 | 4.0 | 10.5% | 39 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.3% | 4 |
| apollokidd.ApolloKidd 0.9 | 6.5 | 8.2% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 6.8 | 7.8% | 14 |
| gimp.GimpBot 0.1 | 7.0 | 7.8% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.9 | 6.3% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 85.1 | 9 / 35 | 5557 |
| 2 | 1 | 67.9 | 87.0 | 17 / 35 | 5328 |
| 3 | 2 | 63.3 | 72.1 | 7 / 35 | 4873 |
| 4 | 1 | 65.4 | 81.6 | 12 / 35 | 4858 |
| 5 | 1 | 67.4 | 83.5 | 11 / 35 | 5707 |
| 6 | 1 | 67.2 | 82.5 | 13 / 35 | 5621 |
| 7 | 1 | 65.1 | 77.1 | 8 / 35 | 5430 |
| 8 | 1 | 66.4 | 79.4 | 9 / 35 | 5777 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 68 | 15% |
| bvh.fry.Freya 0.82 | 50 | 64% |
| catcat20.Lambda 0.024 | 32 | 34% |
| stelo.SoRobotNanoMelee 1.2 | 18 | 83% |
| winamp32.micro.MicroMacro 1.0 | 8 | 63% |
| gimp.GimpBot 0.1 | 7 | 100% |
| apollokidd.ApolloKidd 0.9 | 5 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 195 of 280 rounds, at a mean tick of 1061. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 77 | 39% | 89 |
| bvh.fry.Freya 0.82 | 43 | 22% | 72 |
| catcat20.Lambda 0.024 | 39 | 20% | 47 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 6% | 19 |
| whitesquare.robots.SkynetAdvanced 1.1 | 11 | 6% | 15 |
| winamp32.micro.MicroMacro 1.0 | 6 | 3% | 11 |
| apollokidd.ApolloKidd 0.9 | 5 | 3% | 12 |
| gimp.GimpBot 0.1 | 2 | 1% | 12 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 3 |

## Melee bench: F40

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 79.6 | 141 / 280 | 2.83 | 17.7% | 38750 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.7% | 141 |
| kawigi.mini.Coriantumr 1.1 | 2.1 | 14.7% | 71 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.3% | 24 |
| mz.AntiGrav 1.0 | 4.3 | 10.7% | 11 |
| Polkwane.SmashMelee 1.0 | 4.9 | 10.4% | 12 |
| alpha.BlackIce 1.0 | 6.1 | 9.1% | 7 |
| stelo.Randomness 1.0 | 6.6 | 8.8% | 9 |
| amk.superstrike.SuperStrike 0.3 | 8.3 | 6.4% | 1 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.9% | 4 |
| sample.Corners 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 75.6 | 18 / 35 | 4612 |
| 2 | 1 | 67.8 | 85.1 | 16 / 35 | 4977 |
| 3 | 1 | 67.0 | 79.7 | 17 / 35 | 4776 |
| 4 | 1 | 68.6 | 84.1 | 21 / 35 | 5187 |
| 5 | 1 | 67.9 | 81.9 | 21 / 35 | 4906 |
| 6 | 1 | 64.0 | 70.2 | 12 / 35 | 4808 |
| 7 | 1 | 69.0 | 86.3 | 24 / 35 | 4938 |
| 8 | 1 | 64.8 | 74.3 | 12 / 35 | 4546 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 74 | 53% |
| kano.gamma.KanoGamma 1.8 | 36 | 89% |
| Polkwane.SmashMelee 1.0 | 30 | 77% |
| mz.AntiGrav 1.0 | 28 | 96% |
| stelo.Randomness 1.0 | 10 | 90% |
| alpha.BlackIce 1.0 | 6 | 83% |
| testantiswapgun.AntiSwap 1.0 | 4 | 100% |
| sample.Corners 1.0 | 1 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 139 of 280 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 63 | 45% | 98 |
| kano.gamma.KanoGamma 1.8 | 19 | 14% | 57 |
| Polkwane.SmashMelee 1.0 | 15 | 11% | 21 |
| stelo.Randomness 1.0 | 10 | 7% | 25 |
| mz.AntiGrav 1.0 | 9 | 6% | 35 |
| alpha.BlackIce 1.0 | 9 | 6% | 15 |
| amk.superstrike.SuperStrike 0.3 | 8 | 6% | 10 |
| testantiswapgun.AntiSwap 1.0 | 5 | 4% | 12 |
| sample.Corners 1.0 | 1 | 1% | 3 |

## Melee bench: F41

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 73.8 | 101 / 280 | 3.36 | 16.0% | 36611 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.5 | 16.0% | 101 |
| eem.EvBotNG v12.8 | 1.5 | 16.2% | 107 |
| ary.Swarm 1.1 | 3.4 | 12.7% | 24 |
| lessonz.robocode.Oz 0.5.0 | 3.9 | 12.3% | 27 |
| simonton.nano.MeleeSeed 1.8 | 5.4 | 9.9% | 11 |
| shrub.Silver v048 | 5.5 | 9.7% | 4 |
| zyx.nano.Ant 1.1 | 6.9 | 8.3% | 1 |
| stelo.Mirror 1.1 | 8.5 | 5.9% | 2 |
| jsal.Jsalbot 1.0 | 8.5 | 6.0% | 3 |
| acogdev.alpha 0.2 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 66.7 | 13 / 35 | 4659 |
| 2 | 2 | 63.2 | 69.2 | 12 / 35 | 4479 |
| 3 | 1 | 64.3 | 72.4 | 13 / 35 | 4802 |
| 4 | 1 | 67.0 | 84.1 | 15 / 35 | 4392 |
| 5 | 2 | 65.1 | 77.1 | 9 / 35 | 4607 |
| 6 | 2 | 63.1 | 70.8 | 11 / 35 | 4028 |
| 7 | 2 | 64.2 | 70.2 | 12 / 35 | 4880 |
| 8 | 1 | 66.9 | 79.7 | 16 / 35 | 4764 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 63 | 37% |
| lessonz.robocode.Oz 0.5.0 | 34 | 85% |
| ary.Swarm 1.1 | 25 | 84% |
| simonton.nano.MeleeSeed 1.8 | 20 | 95% |
| stelo.Mirror 1.1 | 5 | 80% |
| shrub.Silver v048 | 3 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 179 of 280 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 90 | 50% | 127 |
| simonton.nano.MeleeSeed 1.8 | 26 | 15% | 42 |
| ary.Swarm 1.1 | 22 | 12% | 41 |
| lessonz.robocode.Oz 0.5.0 | 17 | 9% | 33 |
| zyx.nano.Ant 1.1 | 11 | 6% | 11 |
| shrub.Silver v048 | 6 | 3% | 14 |
| stelo.Mirror 1.1 | 4 | 2% | 6 |
| acogdev.alpha 0.2 | 2 | 1% | 2 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |

## Melee bench: F42

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 76.0 | 68 / 280 | 3.16 | 16.4% | 41550 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.4 | 17.0% | 123 |
| hadur117.micro.SaorC 0.1 | 1.8 | 16.4% | 68 |
| maribo.mini.MiniQuester 0.1 | 3.1 | 13.5% | 40 |
| ara.Shera 0.88 | 3.8 | 12.8% | 40 |
| amz.NanoClone 1.41 | 5.1 | 9.0% | 4 |
| maribo.IotaCT 1.1 | 6.1 | 7.9% | 0 |
| dsw.StaticD 1.0 | 7.0 | 7.1% | 6 |
| stelo.MirrorMicro 1.0 | 8.0 | 6.2% | 0 |
| mme.NikeEnhanced 2.0 | 9.1 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.6 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 78.7 | 8 / 35 | 5295 |
| 2 | 1 | 66.6 | 80.0 | 9 / 35 | 5381 |
| 3 | 1 | 65.9 | 78.7 | 10 / 35 | 5328 |
| 4 | 2 | 65.2 | 78.1 | 8 / 35 | 5011 |
| 5 | 3 | 62.2 | 67.6 | 4 / 35 | 4793 |
| 6 | 1 | 64.9 | 73.0 | 10 / 35 | 4909 |
| 7 | 2 | 65.6 | 75.2 | 9 / 35 | 5239 |
| 8 | 2 | 66.0 | 76.8 | 10 / 35 | 5594 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 58 | 26% |
| maribo.mini.MiniQuester 0.1 | 38 | 58% |
| ara.Shera 0.88 | 36 | 69% |
| dsw.StaticD 1.0 | 7 | 57% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 0% |

Hadur died in 212 of 280 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 99 | 47% | 115 |
| ara.Shera 0.88 | 52 | 25% | 74 |
| maribo.mini.MiniQuester 0.1 | 33 | 16% | 55 |
| dsw.StaticD 1.0 | 8 | 4% | 11 |
| amz.NanoClone 1.41 | 7 | 3% | 9 |
| stelo.MirrorMicro 1.0 | 6 | 3% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 5 | 2% | 6 |
| maribo.IotaCT 1.1 | 1 | 0% | 2 |
| mme.NikeEnhanced 2.0 | 1 | 0% | 1 |

## Melee bench: F43

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 68.6 | 20 / 280 | 3.83 | 13.5% | 29866 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.8% | 222 |
| hadur117.micro.SaorC 0.1 | 2.4 | 13.5% | 20 |
| brainfade.melee.Dusk 0.44 | 2.9 | 12.3% | 22 |
| wcsv.melee.EngineerMelee 0.1 | 4.3 | 10.9% | 3 |
| dummy.micro.Sparrow 2.5 | 4.8 | 10.8% | 9 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 10.1% | 3 |
| jab.DiamondStealer 5 | 7.4 | 8.1% | 0 |
| mz.NanoGod 2.02 | 7.6 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.5% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 73.0 | 3 / 35 | 4035 |
| 2 | 2 | 62.5 | 70.8 | 3 / 35 | 3724 |
| 3 | 2 | 62.5 | 71.7 | 1 / 35 | 3725 |
| 4 | 3 | 59.3 | 63.5 | 2 / 35 | 3270 |
| 5 | 2 | 62.0 | 69.2 | 1 / 35 | 3775 |
| 6 | 2 | 62.2 | 67.9 | 5 / 35 | 3797 |
| 7 | 4 | 57.4 | 55.6 | 1 / 35 | 3462 |
| 8 | 2 | 65.2 | 77.1 | 4 / 35 | 4078 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 77 | 0% |
| brainfade.melee.Dusk 0.44 | 9 | 67% |
| dummy.micro.Sparrow 2.5 | 6 | 67% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 100% |
| mz.NanoGod 2.02 | 2 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |
| jab.DiamondStealer 5 | 1 | 100% |

Hadur died in 261 of 280 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 179 | 69% | 184 |
| brainfade.melee.Dusk 0.44 | 22 | 8% | 26 |
| wcsv.melee.EngineerMelee 0.1 | 17 | 7% | 20 |
| mz.NanoGod 2.02 | 14 | 5% | 17 |
| dummy.micro.Sparrow 2.5 | 12 | 5% | 14 |
| jab.DiamondStealer 5 | 9 | 3% | 11 |
| Krabb.akim2.Akim2 1.1b | 6 | 2% | 6 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |

## Melee bench: F44

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 84.2 | 133 / 280 | 2.42 | 18.8% | 44457 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.8% | 133 |
| stelo.Liblix 0.3.1 | 2.1 | 15.3% | 97 |
| tzu.TheArtOfWar 1.2 | 3.1 | 12.3% | 21 |
| wompi.Quokka 1.6 | 4.3 | 10.5% | 8 |
| jwirde.Gort 2.0 | 5.1 | 9.6% | 11 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.8 | 9.1% | 4 |
| disan.Chair 2.2.0 | 7.0 | 7.6% | 6 |
| stf.PanzerGeneral 0.1 | 7.6 | 7.3% | 0 |
| sample.Crazy 1.0 | 9.3 | 4.9% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 85.7 | 21 / 35 | 5839 |
| 2 | 1 | 67.9 | 82.5 | 18 / 35 | 5489 |
| 3 | 1 | 68.4 | 84.1 | 15 / 35 | 5721 |
| 4 | 1 | 69.3 | 86.3 | 17 / 35 | 5501 |
| 5 | 1 | 67.6 | 79.7 | 13 / 35 | 5639 |
| 6 | 1 | 68.9 | 86.3 | 17 / 35 | 5496 |
| 7 | 1 | 70.0 | 91.4 | 17 / 35 | 5811 |
| 8 | 1 | 65.9 | 77.8 | 15 / 35 | 4961 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 98 | 35% |
| tzu.TheArtOfWar 1.2 | 71 | 90% |
| wompi.Quokka 1.6 | 13 | 77% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 12 | 100% |
| disan.Chair 2.2.0 | 6 | 67% |
| jwirde.Gort 2.0 | 5 | 80% |
| sample.Crazy 1.0 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 2 | 50% |
| stf.PanzerGeneral 0.1 | 2 | 100% |

Hadur died in 147 of 280 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 82 | 56% | 130 |
| tzu.TheArtOfWar 1.2 | 27 | 18% | 82 |
| wompi.Quokka 1.6 | 13 | 9% | 19 |
| jwirde.Gort 2.0 | 7 | 5% | 14 |
| stf.PanzerGeneral 0.1 | 5 | 3% | 9 |
| disan.Chair 2.2.0 | 5 | 3% | 8 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 3% | 10 |
| amk.jointstrike.JointStrike 0.2 | 4 | 3% | 6 |
| sample.Crazy 1.0 | 0 | 0% | 2 |

## Melee bench: F45

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 85.2 | 113 / 280 | 2.33 | 19.3% | 46924 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.3% | 113 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 12.7% | 137 |
| jje.BagPuss 1.2 | 3.4 | 11.0% | 10 |
| myl.nano.Graviton 1.10 | 4.3 | 10.1% | 1 |
| sul.Lunar 1.1 | 4.8 | 10.0% | 5 |
| hvilela.HVilela 0.9 | 6.6 | 8.4% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.3% | 2 |
| fm.claire 1.7 | 7.1 | 8.3% | 3 |
| wit.Deep7 2.0 | 9.0 | 6.7% | 9 |
| abud.ThirdRobo 1.0 | 9.9 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 84.8 | 13 / 35 | 6015 |
| 2 | 1 | 65.1 | 74.6 | 11 / 35 | 5053 |
| 3 | 1 | 69.5 | 88.9 | 12 / 35 | 6020 |
| 4 | 1 | 69.2 | 88.3 | 14 / 35 | 5815 |
| 5 | 1 | 70.1 | 88.9 | 17 / 35 | 6088 |
| 6 | 1 | 68.7 | 84.4 | 16 / 35 | 5770 |
| 7 | 1 | 70.5 | 89.2 | 18 / 35 | 6362 |
| 8 | 1 | 68.1 | 82.9 | 12 / 35 | 5801 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 144 | 27% |
| jje.BagPuss 1.2 | 24 | 79% |
| sul.Lunar 1.1 | 21 | 95% |
| myl.nano.Graviton 1.10 | 20 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 86% |
| wit.Deep7 2.0 | 7 | 71% |
| fm.claire 1.7 | 5 | 80% |

Hadur died in 168 of 280 rounds, at a mean tick of 2053. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 107 | 64% | 0 |
| jje.BagPuss 1.2 | 13 | 8% | 61 |
| myl.nano.Graviton 1.10 | 10 | 6% | 57 |
| fm.claire 1.7 | 10 | 6% | 21 |
| pez.mini.ChironexFleckeri 0.5 | 8 | 5% | 34 |
| hvilela.HVilela 0.9 | 7 | 4% | 21 |
| sul.Lunar 1.1 | 6 | 4% | 58 |
| wit.Deep7 2.0 | 5 | 3% | 20 |
| abud.ThirdRobo 1.0 | 1 | 1% | 7 |
1 death(s) with no robot to name.

## Melee bench: F46

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 67.3 | 21 / 280 | 3.95 | 13.8% | 34109 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.1 | 17.5% | 106 |
| rsalesc.melee.Medina 0.4.5 | 1.9 | 16.5% | 115 |
| hadur117.micro.SaorC 0.1 | 3.0 | 13.8% | 21 |
| mz.MicroSheep 1.0 | 4.5 | 10.8% | 5 |
| cx.Princess 1.0 | 4.6 | 10.6% | 29 |
| sadoner.killer 0.2 | 5.9 | 9.1% | 1 |
| arthord.NanoSatanMelee Beta | 7.3 | 6.8% | 3 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.5% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 67.9 | 1 / 35 | 4265 |
| 2 | 3 | 58.7 | 60.6 | 1 / 35 | 4044 |
| 3 | 3 | 61.1 | 67.0 | 1 / 35 | 4178 |
| 4 | 3 | 62.4 | 69.8 | 3 / 35 | 4496 |
| 5 | 3 | 62.5 | 69.5 | 5 / 35 | 4356 |
| 6 | 3 | 62.8 | 70.5 | 6 / 35 | 4417 |
| 7 | 3 | 60.4 | 65.4 | 3 / 35 | 4014 |
| 8 | 3 | 61.5 | 67.3 | 1 / 35 | 4339 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 50 | 20% |
| rsalesc.melee.Medina 0.4.5 | 32 | 16% |
| mz.MicroSheep 1.0 | 7 | 71% |
| cx.Princess 1.0 | 5 | 20% |

Hadur died in 259 of 280 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 114 | 44% | 126 |
| rsalesc.melee.Medina 0.4.5 | 68 | 26% | 71 |
| cx.Princess 1.0 | 34 | 13% | 35 |
| mz.MicroSheep 1.0 | 14 | 5% | 18 |
| sadoner.killer 0.2 | 12 | 5% | 13 |
| arthord.NanoSatanMelee Beta | 7 | 3% | 7 |
| kurios.DOSexe .9a | 5 | 2% | 5 |
| jeremyreeder.collective.Prophet 5 | 3 | 1% | 3 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 2 |

