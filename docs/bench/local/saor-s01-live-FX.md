# Bench suite: suite.txt

## Melee bench: F01

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 71.5 | 26 / 280 | 3.56 | 14.6% | 37283 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 201 |
| hadur117.micro.SaorFX 0.1 | 2.0 | 14.6% | 26 |
| sgp.JollyNinja 3.53 | 3.8 | 11.8% | 28 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.9 | 11.2% | 6 |
| mz.MicroGodMelee 1 | 5.1 | 10.2% | 10 |
| lorneswork.Predator 1.0 | 5.3 | 10.0% | 8 |
| adt.Ar2 1.0 | 7.0 | 7.7% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.6% | 0 |
| skm.butterfly 1.0 | 8.8 | 5.1% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 72.7 | 4 / 35 | 4648 |
| 2 | 2 | 62.1 | 70.2 | 3 / 35 | 4442 |
| 3 | 2 | 63.3 | 74.6 | 6 / 35 | 4545 |
| 4 | 2 | 64.5 | 78.7 | 3 / 35 | 4688 |
| 5 | 2 | 59.3 | 61.0 | 2 / 35 | 4341 |
| 6 | 2 | 61.1 | 62.9 | 0 / 35 | 5139 |
| 7 | 2 | 65.5 | 80.6 | 5 / 35 | 4972 |
| 8 | 2 | 62.2 | 71.4 | 3 / 35 | 4508 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 105 | 2% |
| sgp.JollyNinja 3.53 | 13 | 62% |
| mz.MicroGodMelee 1 | 12 | 42% |
| lorneswork.Predator 1.0 | 7 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 80% |

Hadur died in 254 of 280 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 172 | 68% | 175 |
| lorneswork.Predator 1.0 | 22 | 9% | 29 |
| mz.MicroGodMelee 1 | 18 | 7% | 26 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 7% | 21 |
| sgp.JollyNinja 3.53 | 10 | 4% | 14 |
| skm.butterfly 1.0 | 6 | 2% | 6 |
| kawigi.sbf.FloodSonnet 0.9 | 5 | 2% | 5 |
| adt.Ar2 1.0 | 3 | 1% | 3 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.0 | 116 / 280 | 2.71 | 18.0% | 43369 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 18.0% | 116 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.3% | 53 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.5% | 56 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.4% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.1 | 9.5% | 10 |
| fnc.bandit.Bandit 5.2.0 | 6.5 | 8.0% | 1 |
| Noran.BitchingElk 0.054 | 6.9 | 8.1% | 17 |
| sch.Simone 0.3d | 7.5 | 8.0% | 14 |
| stelo.PatternRobot 1.0 | 8.5 | 6.5% | 5 |
| fullsail.SweetTea 1.1 | 10.0 | 4.8% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 83.8 | 15 / 35 | 5968 |
| 2 | 1 | 66.2 | 79.7 | 14 / 35 | 5050 |
| 3 | 1 | 68.0 | 84.4 | 15 / 35 | 5548 |
| 4 | 1 | 67.7 | 84.1 | 15 / 35 | 5538 |
| 5 | 1 | 65.4 | 77.5 | 11 / 35 | 4834 |
| 6 | 1 | 66.7 | 79.0 | 15 / 35 | 5368 |
| 7 | 1 | 66.8 | 80.0 | 13 / 35 | 5526 |
| 8 | 1 | 67.2 | 79.4 | 18 / 35 | 5537 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 61 | 46% |
| pulsar.PulsarMax 0.8.9 | 50 | 54% |
| Noran.BitchingElk 0.054 | 21 | 71% |
| com.cohesiva.robocode.ManOwaR 1.0 | 17 | 76% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 92% |
| stelo.PatternRobot 1.0 | 12 | 83% |
| sch.Simone 0.3d | 10 | 60% |
| fullsail.SweetTea 1.1 | 5 | 60% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |

Hadur died in 164 of 280 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 58 | 35% | 92 |
| pulsar.PulsarMax 0.8.9 | 52 | 32% | 76 |
| stelo.PatternRobot 1.0 | 16 | 10% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 7% | 16 |
| sch.Simone 0.3d | 8 | 5% | 14 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 4% | 22 |
| Noran.BitchingElk 0.054 | 6 | 4% | 26 |
| fullsail.SweetTea 1.1 | 5 | 3% | 8 |
| fnc.bandit.Bandit 5.2.0 | 1 | 1% | 6 |

## Melee bench: F03

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 79.1 | 157 / 280 | 2.88 | 17.7% | 45065 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 17.7% | 157 |
| radnor.DoctorBob 1.42 | 2.4 | 13.8% | 43 |
| vuen.Cake 2.51 | 3.1 | 12.8% | 39 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.4% | 35 |
| urdos.URDOS 1.3 | 5.1 | 10.1% | 4 |
| adt.Ar1 2.1 | 6.0 | 8.3% | 0 |
| oa.weak.FlyMk1 0.1 | 7.3 | 7.4% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 8.0 | 6.6% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.9% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 73.3 | 19 / 35 | 5619 |
| 2 | 1 | 68.1 | 81.9 | 24 / 35 | 5580 |
| 3 | 1 | 67.3 | 79.4 | 18 / 35 | 6118 |
| 4 | 1 | 67.3 | 80.0 | 20 / 35 | 5746 |
| 5 | 1 | 65.5 | 74.9 | 18 / 35 | 5322 |
| 6 | 1 | 66.2 | 75.9 | 17 / 35 | 5837 |
| 7 | 1 | 67.7 | 86.3 | 21 / 35 | 5172 |
| 8 | 1 | 67.2 | 81.3 | 20 / 35 | 5671 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 77 | 82% |
| kawigi.nano.Lib 1.0 | 51 | 82% |
| radnor.DoctorBob 1.42 | 47 | 79% |
| adt.Ar1 2.1 | 4 | 100% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 100% |
| urdos.URDOS 1.3 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 126 of 280 rounds, at a mean tick of 619. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 28 | 22% | 63 |
| kawigi.nano.Lib 1.0 | 27 | 21% | 72 |
| vuen.Cake 2.51 | 23 | 18% | 77 |
| urdos.URDOS 1.3 | 15 | 12% | 23 |
| adt.Ar1 2.1 | 9 | 7% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 7% | 7 |
| ghent.ArthurPanzergon 1.0.0 | 7 | 6% | 12 |
| oa.weak.FlyMk1 0.1 | 4 | 3% | 9 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 2% | 3 |
2 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 73.3 | 8 / 280 | 3.40 | 15.3% | 42245 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.7% | 249 |
| hadur117.micro.SaorFX 0.1 | 2.0 | 15.3% | 8 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.9% | 12 |
| TNT.TNT 0.99.1 | 4.0 | 10.9% | 6 |
| josago.Jorgito 0.16 | 5.1 | 8.7% | 5 |
| css.Delitioner 0.11 | 5.9 | 7.7% | 0 |
| tj.zombie1n 1.0.1 | 7.1 | 6.7% | 0 |
| rampancy.Durandal 2.1d | 7.9 | 5.9% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 4.2% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 74.3 | 1 / 35 | 5778 |
| 2 | 2 | 64.6 | 74.3 | 0 / 35 | 5243 |
| 3 | 2 | 64.1 | 73.7 | 1 / 35 | 4861 |
| 4 | 2 | 64.9 | 73.0 | 4 / 35 | 5351 |
| 5 | 2 | 64.5 | 71.4 | 2 / 35 | 5609 |
| 6 | 2 | 65.1 | 75.9 | 0 / 35 | 5295 |
| 7 | 2 | 64.5 | 72.1 | 0 / 35 | 5223 |
| 8 | 2 | 63.5 | 72.1 | 0 / 35 | 4885 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 106 | 4% |
| apc.LeeroyJenkins2 1.0 | 4 | 75% |
| TNT.TNT 0.99.1 | 3 | 0% |
| sp.Nanos.Ember 1.1 | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 0% |

Hadur died in 272 of 280 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 203 | 75% | 207 |
| apc.LeeroyJenkins2 1.0 | 23 | 8% | 26 |
| josago.Jorgito 0.16 | 15 | 6% | 16 |
| TNT.TNT 0.99.1 | 13 | 5% | 13 |
| css.Delitioner 0.11 | 8 | 3% | 8 |
| tj.zombie1n 1.0.1 | 5 | 2% | 5 |
| rampancy.Durandal 2.1d | 3 | 1% | 3 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |

## Melee bench: F05

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 60.6 | 17 / 280 | 4.55 | 12.6% | 32251 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.DemonicRage 3.4 | 1.5 | 17.6% | 86 |
| cb.fire.Firestarter 2.0f | 1.5 | 18.2% | 156 |
| wompi.Numbat 2.1 | 3.4 | 12.5% | 10 |
| hadur117.micro.SaorFX 0.1 | 3.6 | 12.6% | 17 |
| axeBots.HataMoto 3.09 | 5.5 | 9.2% | 8 |
| ms.Ares 0.19 | 5.5 | 8.9% | 3 |
| supersample.SuperBoxBot 1.0 | 7.4 | 6.3% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.7% | 0 |
| GarmBox.Oranges 1.0 | 9.4 | 4.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.3 | 57.5 | 0 / 35 | 3638 |
| 2 | 3 | 59.4 | 61.9 | 2 / 35 | 4169 |
| 3 | 3 | 60.2 | 64.1 | 3 / 35 | 4266 |
| 4 | 4 | 57.6 | 54.3 | 2 / 35 | 3912 |
| 5 | 4 | 57.8 | 57.8 | 2 / 35 | 3737 |
| 6 | 3 | 62.3 | 69.5 | 4 / 35 | 4242 |
| 7 | 4 | 58.2 | 58.4 | 1 / 35 | 4167 |
| 8 | 4 | 59.5 | 61.0 | 3 / 35 | 4120 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 24 | 8% |
| justin.DemonicRage 3.4 | 18 | 6% |
| wompi.Numbat 2.1 | 10 | 90% |
| axeBots.HataMoto 3.09 | 5 | 40% |
| ms.Ares 0.19 | 4 | 75% |

Hadur died in 263 of 280 rounds, at a mean tick of 624. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 101 | 38% | 102 |
| cb.fire.Firestarter 2.0f | 73 | 28% | 78 |
| wompi.Numbat 2.1 | 30 | 11% | 36 |
| ms.Ares 0.19 | 22 | 8% | 25 |
| axeBots.HataMoto 3.09 | 16 | 6% | 18 |
| supersample.SuperBoxBot 1.0 | 16 | 6% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 1% | 3 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 75.6 | 118 / 280 | 3.19 | 16.3% | 35303 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.1 | 16.3% | 118 |
| jekl.StoneGhost 0.7 | 2.3 | 14.5% | 47 |
| origin.SleepSiphon 1.7b | 3.0 | 13.3% | 79 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.3 | 11.5% | 18 |
| mld.Wisdom 1.0 | 4.4 | 11.5% | 6 |
| gg.Wolverine 2.0 | 6.0 | 8.7% | 7 |
| spinnercat.Omen 1.0 | 7.8 | 7.1% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.9 | 6.8% | 5 |
| DBall.NUKE 0.1 | 8.4 | 6.5% | 0 |
| sample.Fire 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 72.1 | 13 / 35 | 4196 |
| 2 | 1 | 64.5 | 74.6 | 14 / 35 | 4388 |
| 3 | 1 | 68.0 | 85.4 | 18 / 35 | 5013 |
| 4 | 1 | 64.3 | 73.7 | 12 / 35 | 4458 |
| 5 | 1 | 67.1 | 81.6 | 19 / 35 | 4766 |
| 6 | 1 | 62.7 | 68.9 | 15 / 35 | 3992 |
| 7 | 2 | 63.0 | 72.4 | 10 / 35 | 4034 |
| 8 | 1 | 65.3 | 76.5 | 17 / 35 | 4456 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 58 | 88% |
| origin.SleepSiphon 1.7b | 52 | 37% |
| pe.minimelee.SandboxMiniMelee 1.1 | 27 | 89% |
| gg.Wolverine 2.0 | 12 | 50% |
| mld.Wisdom 1.0 | 7 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 80% |
| DBall.NUKE 0.1 | 4 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 165 of 280 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 56 | 34% | 87 |
| mld.Wisdom 1.0 | 38 | 23% | 49 |
| jekl.StoneGhost 0.7 | 31 | 19% | 66 |
| pe.minimelee.SandboxMiniMelee 1.1 | 23 | 14% | 45 |
| gg.Wolverine 2.0 | 9 | 5% | 14 |
| spinnercat.Omen 1.0 | 5 | 3% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 7 |
| sample.Fire 1.0 | 1 | 1% | 2 |
| DBall.NUKE 0.1 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 84.2 | 97 / 280 | 2.42 | 18.4% | 47511 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.3 | 18.4% | 97 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.3% | 80 |
| rtk.Tachikoma 1.0 | 2.8 | 16.2% | 70 |
| franzor.Lizt 1.3.1 | 4.3 | 11.1% | 20 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 10.3% | 12 |
| exauge.GateKeeper 1.1.121g | 6.5 | 8.0% | 1 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.9% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.4% | 1 |
| sample.Target 1.0 | 9.3 | 2.8% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 70.0 | 88.9 | 14 / 35 | 5744 |
| 2 | 1 | 69.5 | 83.5 | 14 / 35 | 6139 |
| 3 | 1 | 69.0 | 82.2 | 11 / 35 | 6016 |
| 4 | 1 | 69.1 | 81.0 | 12 / 35 | 5901 |
| 5 | 2 | 69.6 | 83.8 | 13 / 35 | 6055 |
| 6 | 1 | 69.7 | 87.9 | 11 / 35 | 5876 |
| 7 | 1 | 69.0 | 82.9 | 10 / 35 | 6141 |
| 8 | 1 | 68.6 | 83.8 | 12 / 35 | 5639 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 81 | 47% |
| rsalesc.melee.Monk 0.3.6c | 57 | 16% |
| oog.melee.CapuletDroid 1.1 | 34 | 91% |
| franzor.Lizt 1.3.1 | 25 | 64% |
| exauge.GateKeeper 1.1.121g | 3 | 67% |
| skm.PateranBotlock2 1.0 | 1 | 0% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 183 of 280 rounds, at a mean tick of 1163. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 73 | 40% | 95 |
| rtk.Tachikoma 1.0 | 72 | 39% | 130 |
| oog.melee.CapuletDroid 1.1 | 18 | 10% | 30 |
| franzor.Lizt 1.3.1 | 13 | 7% | 5 |
| exauge.GateKeeper 1.1.121g | 5 | 3% | 11 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 5 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 77.5 | 115 / 280 | 3.03 | 17.6% | 43485 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 17.6% | 115 |
| tm.Yuugao 1.0 | 2.0 | 13.9% | 82 |
| shrub.Vapour v159 | 3.1 | 11.8% | 30 |
| Krabb.sliNk.Garm 0.9u | 4.9 | 9.9% | 16 |
| com.spp.robocode.MostlyHarmless 010 | 4.9 | 9.9% | 17 |
| m3thos.Eva00 1.1 | 6.0 | 9.1% | 7 |
| jwst.DAD.DarkAndDarker 1.1 | 6.3 | 8.8% | 12 |
| qualidafial.MajorDick 1.0.1 | 8.1 | 7.0% | 1 |
| SHAM.WOW 1.4 | 9.4 | 6.0% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.4 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 74.9 | 17 / 35 | 5224 |
| 2 | 1 | 64.9 | 72.4 | 10 / 35 | 5691 |
| 3 | 1 | 65.7 | 75.2 | 16 / 35 | 5200 |
| 4 | 1 | 65.3 | 76.2 | 14 / 35 | 5023 |
| 5 | 1 | 67.6 | 81.6 | 15 / 35 | 5598 |
| 6 | 1 | 67.0 | 82.2 | 13 / 35 | 5549 |
| 7 | 1 | 66.9 | 78.4 | 16 / 35 | 5540 |
| 8 | 1 | 67.1 | 79.0 | 14 / 35 | 5660 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 76 | 34% |
| shrub.Vapour v159 | 36 | 92% |
| Krabb.sliNk.Garm 0.9u | 25 | 68% |
| com.spp.robocode.MostlyHarmless 010 | 18 | 78% |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 91% |
| SHAM.WOW 1.4 | 5 | 100% |
| m3thos.Eva00 1.1 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 167 of 280 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 73 | 44% | 104 |
| Krabb.sliNk.Garm 0.9u | 27 | 16% | 41 |
| com.spp.robocode.MostlyHarmless 010 | 21 | 13% | 36 |
| shrub.Vapour v159 | 13 | 8% | 37 |
| zyx.nano.BacillusComma 1.0 | 10 | 6% | 14 |
| SHAM.WOW 1.4 | 8 | 5% | 14 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 4% | 16 |
| m3thos.Eva00 1.1 | 5 | 3% | 11 |
| qualidafial.MajorDick 1.0.1 | 4 | 2% | 7 |

## Melee bench: F09

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 66.1 | 56 / 280 | 4.05 | 14.1% | 32873 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.5% | 141 |
| hadur117.micro.SaorFX 0.1 | 2.3 | 14.1% | 56 |
| kc.micro.Figment 1.0 | 2.8 | 13.5% | 41 |
| yagami.Tidus 0.11 | 4.5 | 10.5% | 5 |
| pedersen.Grishnakh 1.0 | 4.6 | 10.3% | 19 |
| mc2.enemy.Original 0.9 | 5.9 | 9.4% | 14 |
| dft.Calliope 5.6 | 7.0 | 7.8% | 3 |
| robar.nano.Assertive_Melee 0.2 | 8.6 | 6.0% | 1 |
| step.nanoPri 1.0 | 8.8 | 5.9% | 0 |
| rdm.Dueler 0.4x | 9.6 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.7 | 63.8 | 4 / 35 | 4073 |
| 2 | 3 | 61.1 | 67.9 | 8 / 35 | 3949 |
| 3 | 3 | 57.3 | 56.2 | 3 / 35 | 3707 |
| 4 | 2 | 62.5 | 70.5 | 7 / 35 | 4251 |
| 5 | 2 | 61.7 | 67.6 | 7 / 35 | 4375 |
| 6 | 2 | 61.0 | 66.0 | 8 / 35 | 4044 |
| 7 | 2 | 61.4 | 67.3 | 8 / 35 | 4322 |
| 8 | 2 | 62.3 | 69.2 | 11 / 35 | 4152 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 49 | 14% |
| kc.micro.Figment 1.0 | 40 | 53% |
| yagami.Tidus 0.11 | 13 | 100% |
| mc2.enemy.Original 0.9 | 12 | 42% |
| pedersen.Grishnakh 1.0 | 10 | 70% |
| dft.Calliope 5.6 | 4 | 75% |

Hadur died in 224 of 280 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 82 | 37% | 93 |
| kc.micro.Figment 1.0 | 76 | 34% | 102 |
| mc2.enemy.Original 0.9 | 17 | 8% | 23 |
| robar.nano.Assertive_Melee 0.2 | 13 | 6% | 14 |
| pedersen.Grishnakh 1.0 | 11 | 5% | 12 |
| yagami.Tidus 0.11 | 9 | 4% | 17 |
| dft.Calliope 5.6 | 6 | 3% | 9 |
| rdm.Dueler 0.4x | 6 | 3% | 6 |
| step.nanoPri 1.0 | 4 | 2% | 4 |

## Melee bench: F10

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.0 | 120 / 280 | 2.35 | 18.0% | 43522 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.3 | 18.0% | 120 |
| DTF.Kludgy 1.2b | 1.9 | 15.8% | 89 |
| ne.Chimera 1.2 | 3.5 | 12.4% | 12 |
| ejb.Polaris 1.0.1 | 3.9 | 12.1% | 34 |
| vStar.RAFzilla 2.15 | 4.6 | 10.8% | 10 |
| tvv.micro.Antares 1.1.1 | 5.9 | 9.7% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.9 | 5.6% | 1 |
| sam.Samspin 1.0 | 8.0 | 5.7% | 0 |
| kurios.DOSexe .9b | 8.8 | 5.2% | 2 |
| donjezza.Muncho 1.0 | 9.4 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 89.8 | 19 / 35 | 5138 |
| 2 | 1 | 68.6 | 86.0 | 16 / 35 | 5869 |
| 3 | 1 | 66.2 | 82.5 | 12 / 35 | 5134 |
| 4 | 1 | 69.8 | 92.1 | 18 / 35 | 5619 |
| 5 | 2 | 66.1 | 77.1 | 9 / 35 | 5549 |
| 6 | 2 | 65.7 | 78.4 | 12 / 35 | 5176 |
| 7 | 1 | 68.5 | 87.9 | 18 / 35 | 5616 |
| 8 | 1 | 67.9 | 86.3 | 16 / 35 | 5421 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 83 | 27% |
| ejb.Polaris 1.0.1 | 55 | 67% |
| ne.Chimera 1.2 | 34 | 76% |
| vStar.RAFzilla 2.15 | 18 | 89% |
| tvv.micro.Antares 1.1.1 | 11 | 73% |
| donjezza.Muncho 1.0 | 7 | 86% |
| kurios.DOSexe .9b | 4 | 75% |
| sam.Samspin 1.0 | 2 | 100% |

Hadur died in 160 of 280 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 95 | 59% | 116 |
| ne.Chimera 1.2 | 22 | 14% | 48 |
| ejb.Polaris 1.0.1 | 21 | 13% | 64 |
| vStar.RAFzilla 2.15 | 6 | 4% | 17 |
| tvv.micro.Antares 1.1.1 | 6 | 4% | 14 |
| kurios.DOSexe .9b | 3 | 2% | 9 |
| donjezza.Muncho 1.0 | 3 | 2% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 1% | 4 |
| sam.Samspin 1.0 | 2 | 1% | 2 |

## Melee bench: F11

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 70.9 | 64 / 280 | 3.62 | 15.1% | 35007 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.7% | 135 |
| hadur117.micro.SaorFX 0.1 | 2.0 | 15.1% | 64 |
| cx.mini.Nimrod 0.55 | 3.3 | 11.9% | 28 |
| djc.DynaBot 0.1.1 | 4.1 | 10.6% | 18 |
| br2.MobyDickBot 1.6 | 5.5 | 9.1% | 12 |
| rdt199.Warlord 0.73 | 6.1 | 8.8% | 16 |
| uji.YellohFellah 1.0 | 6.6 | 8.3% | 7 |
| KiraNL.Chupacabra 0.4 | 7.4 | 7.9% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 74.9 | 11 / 35 | 4360 |
| 2 | 2 | 61.4 | 67.3 | 7 / 35 | 4255 |
| 3 | 2 | 61.1 | 66.7 | 5 / 35 | 4121 |
| 4 | 2 | 63.9 | 74.3 | 7 / 35 | 4568 |
| 5 | 2 | 62.2 | 69.8 | 7 / 35 | 4477 |
| 6 | 2 | 63.6 | 73.3 | 9 / 35 | 4525 |
| 7 | 2 | 62.6 | 70.8 | 9 / 35 | 4261 |
| 8 | 2 | 62.5 | 70.2 | 9 / 35 | 4440 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 73 | 14% |
| cx.mini.Nimrod 0.55 | 26 | 73% |
| djc.DynaBot 0.1.1 | 16 | 69% |
| rdt199.Warlord 0.73 | 11 | 73% |
| uji.YellohFellah 1.0 | 9 | 67% |
| br2.MobyDickBot 1.6 | 9 | 89% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 216 of 280 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 112 | 52% | 128 |
| cx.mini.Nimrod 0.55 | 33 | 15% | 47 |
| rdt199.Warlord 0.73 | 19 | 9% | 26 |
| KiraNL.Chupacabra 0.4 | 14 | 6% | 13 |
| br2.MobyDickBot 1.6 | 10 | 5% | 15 |
| djc.DynaBot 0.1.1 | 9 | 4% | 22 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 4% | 9 |
| uji.YellohFellah 1.0 | 6 | 3% | 12 |
| stelo.MirrorNano 1.3 | 5 | 2% | 7 |

## Melee bench: F12

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 79.0 | 114 / 280 | 2.89 | 16.4% | 31253 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.1 | 16.4% | 114 |
| bts.wiki.RipCurl 0.9b | 2.4 | 13.6% | 57 |
| nat.PallasHawk 1.0 | 3.0 | 13.2% | 53 |
| darkcanuck.Leon 1.01 | 3.5 | 12.5% | 29 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.4% | 14 |
| jrm.Test0 1.0 | 6.4 | 8.1% | 2 |
| cs.sheldor.Talon 1.1 | 7.1 | 7.2% | 3 |
| jp.Perpy 16.0 | 7.8 | 7.0% | 4 |
| jaybot.bots.Oddball 4.0 | 9.4 | 5.8% | 5 |
| stuff.Vlad 0.1 | 9.4 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 82.9 | 15 / 35 | 3864 |
| 2 | 1 | 65.6 | 78.7 | 18 / 35 | 3955 |
| 3 | 1 | 67.7 | 87.9 | 17 / 35 | 4511 |
| 4 | 2 | 62.0 | 69.5 | 12 / 35 | 3601 |
| 5 | 1 | 64.6 | 79.7 | 15 / 35 | 3859 |
| 6 | 1 | 64.7 | 79.4 | 11 / 35 | 3934 |
| 7 | 1 | 64.2 | 77.5 | 15 / 35 | 3663 |
| 8 | 1 | 63.6 | 76.5 | 11 / 35 | 3866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 42 | 64% |
| bts.wiki.RipCurl 0.9b | 40 | 43% |
| darkcanuck.Leon 1.01 | 39 | 85% |
| brainfade.melee.Genghis 0.36 | 26 | 81% |
| jrm.Test0 1.0 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 5 | 80% |
| jaybot.bots.Oddball 4.0 | 5 | 40% |
| jp.Perpy 16.0 | 4 | 75% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 168 of 280 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 48 | 29% | 68 |
| nat.PallasHawk 1.0 | 34 | 20% | 67 |
| darkcanuck.Leon 1.01 | 25 | 15% | 65 |
| brainfade.melee.Genghis 0.36 | 22 | 13% | 28 |
| jrm.Test0 1.0 | 13 | 8% | 16 |
| cs.sheldor.Talon 1.1 | 10 | 6% | 14 |
| jaybot.bots.Oddball 4.0 | 7 | 4% | 8 |
| jp.Perpy 16.0 | 6 | 4% | 7 |
| stuff.Vlad 0.1 | 3 | 2% | 5 |

## Melee bench: F13

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 66.7 | 13 / 280 | 4.00 | 13.3% | 33764 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.4 | 17.1% | 139 |
| ags.Glacier 0.2.11 | 1.6 | 16.9% | 77 |
| hadur117.micro.SaorFX 0.1 | 3.4 | 13.3% | 13 |
| shinh.Entangled 0.3 | 4.1 | 12.3% | 31 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.6% | 19 |
| apc.Colossus2 0.17 | 6.0 | 7.9% | 0 |
| stelo.Wang 1.0 | 7.1 | 6.5% | 1 |
| ayk.WallHugger 1.0 | 8.1 | 5.8% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 68.6 | 2 / 35 | 4248 |
| 2 | 3 | 58.8 | 60.3 | 1 / 35 | 4152 |
| 3 | 5 | 56.9 | 61.0 | 0 / 35 | 3482 |
| 4 | 3 | 60.5 | 66.0 | 3 / 35 | 3985 |
| 5 | 3 | 62.2 | 71.7 | 1 / 35 | 4446 |
| 6 | 3 | 62.3 | 70.8 | 3 / 35 | 4498 |
| 7 | 3 | 62.6 | 70.8 | 2 / 35 | 4870 |
| 8 | 4 | 59.4 | 64.1 | 1 / 35 | 4083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 34 | 3% |
| mn.Combat 3.25.0 | 28 | 14% |
| gh.micro.Gruweltje 0.7 | 8 | 25% |
| shinh.Entangled 0.3 | 7 | 43% |
| apc.Colossus2 0.17 | 1 | 100% |
| stelo.Wang 1.0 | 1 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |

Hadur died in 267 of 280 rounds, at a mean tick of 687. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 91 | 34% | 93 |
| mn.Combat 3.25.0 | 80 | 30% | 85 |
| shinh.Entangled 0.3 | 38 | 14% | 42 |
| gh.micro.Gruweltje 0.7 | 24 | 9% | 26 |
| stelo.Wang 1.0 | 9 | 3% | 9 |
| ayk.WallHugger 1.0 | 9 | 3% | 8 |
| apc.Colossus2 0.17 | 8 | 3% | 9 |
| maribo.FollowFire 1 | 7 | 3% | 7 |
| sample.Tracker 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 73.5 | 153 / 280 | 3.39 | 16.8% | 40837 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.1 | 16.8% | 153 |
| simonton.micro.Sprout 1.1.3 | 1.9 | 14.9% | 38 |
| catcat20.shape.Theta 0.018 | 3.4 | 12.3% | 53 |
| sanyi.mikrobi.Roberto 1.0 | 4.8 | 10.3% | 10 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 9.9% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.4 | 10.0% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 6.5 | 9.3% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 8.1% | 12 |
| pa.Improved 1.0 | 9.0 | 6.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 74.0 | 18 / 35 | 5668 |
| 2 | 1 | 66.4 | 73.7 | 22 / 35 | 5204 |
| 3 | 2 | 60.7 | 59.7 | 14 / 35 | 4597 |
| 4 | 1 | 69.4 | 88.3 | 22 / 35 | 5200 |
| 5 | 1 | 62.7 | 65.1 | 17 / 35 | 4765 |
| 6 | 1 | 66.9 | 78.1 | 20 / 35 | 5305 |
| 7 | 1 | 65.6 | 74.6 | 20 / 35 | 4634 |
| 8 | 1 | 66.6 | 74.3 | 20 / 35 | 5464 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 92 | 89% |
| catcat20.shape.Theta 0.018 | 46 | 63% |
| co.edu.usb.rc.LidisTron 1.0 | 18 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 73% |
| sanyi.mikrobi.Roberto 1.0 | 10 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 75% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |

Hadur died in 127 of 280 rounds, at a mean tick of 513. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 57 | 45% | 140 |
| catcat20.shape.Theta 0.018 | 26 | 20% | 52 |
| sanyi.mikrobi.Roberto 1.0 | 12 | 9% | 33 |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 9% | 21 |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 6% | 10 |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 5% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 3% | 8 |
| sample.TrackFire 1.0 | 2 | 2% | 2 |
| pa.Improved 1.0 | 1 | 1% | 3 |

## Melee bench: F15

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 84.0 | 161 / 280 | 2.44 | 19.3% | 47115 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 19.3% | 161 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.6% | 18 |
| emp.Yngwie 1.11 | 3.3 | 12.4% | 58 |
| mld.DustBunny 3.8 | 3.5 | 11.8% | 5 |
| kawigi.robot.Girl 1.2 | 5.3 | 9.9% | 26 |
| cb.nano.Insomnia 1.0 | 5.8 | 9.3% | 9 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.9% | 1 |
| lambdaxy.TBot 0.1 | 7.5 | 7.1% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 5.2% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 87.6 | 20 / 35 | 6275 |
| 2 | 1 | 69.4 | 85.4 | 19 / 35 | 5906 |
| 3 | 1 | 71.1 | 88.6 | 26 / 35 | 6175 |
| 4 | 1 | 66.2 | 76.2 | 16 / 35 | 5384 |
| 5 | 1 | 68.2 | 80.3 | 19 / 35 | 5832 |
| 6 | 1 | 68.9 | 84.1 | 19 / 35 | 5703 |
| 7 | 1 | 69.8 | 86.3 | 23 / 35 | 5983 |
| 8 | 1 | 68.7 | 83.2 | 19 / 35 | 5857 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 62 | 94% |
| emp.Yngwie 1.11 | 58 | 57% |
| kawigi.robot.Girl 1.2 | 33 | 73% |
| mld.DustBunny 3.8 | 28 | 100% |
| cb.nano.Insomnia 1.0 | 13 | 77% |
| divineomega.TrialBot 0.003 | 4 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 3 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 119 of 280 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 45 | 38% | 99 |
| cb.nano.Insomnia 1.0 | 20 | 17% | 18 |
| kawigi.robot.Girl 1.2 | 16 | 13% | 28 |
| kawigi.micro.Shiz 1.1 | 14 | 12% | 54 |
| mld.DustBunny 3.8 | 8 | 7% | 44 |
| divineomega.TrialBot 0.003 | 7 | 6% | 17 |
| Grystrion.TrackerWO 1.0 | 4 | 3% | 8 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 4 | 3% | 6 |
| lambdaxy.TBot 0.1 | 1 | 1% | 4 |

## Melee bench: F16

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.0 | 105 / 280 | 2.53 | 18.6% | 46795 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.1 | 18.6% | 105 |
| gh.Griezel 0.5.2 | 1.9 | 17.0% | 132 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.7% | 7 |
| techdude.forest.FlamingForest 1.1 | 4.6 | 10.0% | 29 |
| tvv.nano.Polaris 1.2 | 5.0 | 9.3% | 4 |
| bvh.fnr.Fenrir 0.36l | 5.6 | 8.9% | 1 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.6% | 2 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.3% | 0 |
| repositorio.NanoStep 1.0 | 9.0 | 5.1% | 0 |
| asd.Cthulhu 1.3 | 9.3 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 81.6 | 14 / 35 | 5787 |
| 2 | 2 | 68.3 | 84.1 | 9 / 35 | 5905 |
| 3 | 1 | 67.8 | 81.9 | 9 / 35 | 5866 |
| 4 | 1 | 69.6 | 84.4 | 14 / 35 | 6395 |
| 5 | 1 | 67.4 | 80.3 | 15 / 35 | 5310 |
| 6 | 1 | 69.3 | 85.1 | 11 / 35 | 5866 |
| 7 | 1 | 67.6 | 77.8 | 18 / 35 | 5485 |
| 8 | 1 | 70.0 | 88.6 | 15 / 35 | 6181 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 115 | 17% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 33 | 97% |
| techdude.forest.FlamingForest 1.1 | 30 | 50% |
| tvv.nano.Polaris 1.2 | 11 | 91% |
| bvh.fnr.Fenrir 0.36l | 11 | 100% |
| divineomega.DivineBot 1.9.4.5 | 9 | 100% |
| stelo.IntrinsicVolatility 1.4 | 6 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 175 of 280 rounds, at a mean tick of 1504. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 117 | 67% | 146 |
| techdude.forest.FlamingForest 1.1 | 19 | 11% | 33 |
| bvh.fnr.Fenrir 0.36l | 12 | 7% | 14 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 9 | 5% | 37 |
| stelo.IntrinsicVolatility 1.4 | 8 | 5% | 18 |
| divineomega.DivineBot 1.9.4.5 | 4 | 2% | 14 |
| tvv.nano.Polaris 1.2 | 4 | 2% | 12 |
| asd.Cthulhu 1.3 | 2 | 1% | 3 |
| repositorio.NanoStep 1.0 | 0 | 0% | 3 |

## Melee bench: F17

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 81.2 | 120 / 280 | 2.69 | 17.6% | 39915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 17.6% | 120 |
| et.Predator 1.8 | 2.6 | 12.9% | 28 |
| oog.melee.Mercutio 1.0 | 3.9 | 12.0% | 39 |
| cx.BlestPain 1.41 | 3.9 | 12.3% | 56 |
| nic.Nicator 2.4 | 4.5 | 11.5% | 22 |
| ahf.NanoAndrew .4 | 5.4 | 10.3% | 10 |
| maribo.melee.BMV 0.1 | 6.8 | 9.2% | 5 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 6.1% | 1 |
| tex.Longbot 0.4 | 8.8 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 76.2 | 15 / 35 | 4258 |
| 2 | 1 | 67.7 | 82.2 | 16 / 35 | 5373 |
| 3 | 1 | 63.4 | 71.1 | 10 / 35 | 4507 |
| 4 | 1 | 67.8 | 82.9 | 13 / 35 | 5414 |
| 5 | 1 | 69.8 | 88.6 | 18 / 35 | 5811 |
| 6 | 1 | 66.4 | 80.3 | 16 / 35 | 4725 |
| 7 | 1 | 67.8 | 84.4 | 18 / 35 | 4827 |
| 8 | 1 | 67.2 | 83.8 | 14 / 35 | 5000 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 54 | 72% |
| cx.BlestPain 1.41 | 47 | 36% |
| oog.melee.Mercutio 1.0 | 35 | 66% |
| nic.Nicator 2.4 | 34 | 68% |
| ahf.NanoAndrew .4 | 16 | 94% |
| maribo.melee.BMV 0.1 | 4 | 75% |

Hadur died in 161 of 280 rounds, at a mean tick of 1110. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 46 | 29% | 66 |
| et.Predator 1.8 | 40 | 25% | 77 |
| oog.melee.Mercutio 1.0 | 30 | 19% | 54 |
| ahf.NanoAndrew .4 | 17 | 11% | 34 |
| nic.Nicator 2.4 | 13 | 8% | 31 |
| maribo.melee.BMV 0.1 | 6 | 4% | 8 |
| goblin.Bender 2.4 | 4 | 2% | 4 |
| tex.Longbot 0.4 | 3 | 2% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 1% | 3 |

## Melee bench: F18

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.7 | 179 / 280 | 2.38 | 18.5% | 37323 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 18.5% | 179 |
| morbid.MorbidPriest 1.0 | 2.1 | 12.6% | 22 |
| agd.Mooserwirt2 2.7 | 3.0 | 11.7% | 30 |
| uji.DBH 1.1 | 4.9 | 10.5% | 8 |
| ratosh.Nobo 0.21 | 5.1 | 10.2% | 4 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.9% | 10 |
| sigterm.Sigterm 1.0 | 6.6 | 8.5% | 16 |
| kawigi.mini.Fhqwhgads 1.1 | 7.9 | 7.3% | 6 |
| stelo.WangRobot 1.0 | 9.4 | 5.3% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 88.9 | 23 / 35 | 4819 |
| 2 | 1 | 68.8 | 86.3 | 26 / 35 | 4834 |
| 3 | 1 | 67.3 | 84.4 | 20 / 35 | 4583 |
| 4 | 1 | 69.0 | 86.3 | 23 / 35 | 5234 |
| 5 | 1 | 68.2 | 86.0 | 25 / 35 | 4724 |
| 6 | 1 | 67.8 | 85.7 | 23 / 35 | 4392 |
| 7 | 1 | 65.8 | 80.0 | 19 / 35 | 4313 |
| 8 | 1 | 66.1 | 79.7 | 20 / 35 | 4424 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 50 | 88% |
| agd.Mooserwirt2 2.7 | 44 | 66% |
| uji.DBH 1.1 | 41 | 90% |
| spinnercat.Robovirus 2.718 | 25 | 88% |
| sigterm.Sigterm 1.0 | 22 | 95% |
| ratosh.Nobo 0.21 | 15 | 100% |
| stelo.WangRobot 1.0 | 8 | 88% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 80% |

Hadur died in 102 of 280 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 29 | 28% | 67 |
| morbid.MorbidPriest 1.0 | 19 | 19% | 72 |
| uji.DBH 1.1 | 12 | 12% | 31 |
| kawigi.mini.Fhqwhgads 1.1 | 10 | 10% | 18 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8 | 8% | 13 |
| spinnercat.Robovirus 2.718 | 7 | 7% | 27 |
| ratosh.Nobo 0.21 | 7 | 7% | 19 |
| sigterm.Sigterm 1.0 | 6 | 6% | 21 |
| stelo.WangRobot 1.0 | 4 | 4% | 11 |

## Melee bench: F19

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 91.6 | 218 / 280 | 1.76 | 20.8% | 46328 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 20.8% | 218 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.4 | 14.3% | 20 |
| mld.Infinity 2.2 | 2.6 | 13.9% | 26 |
| krillr.mini.JointStrike 2.0.0 | 4.6 | 10.7% | 5 |
| erdnis.Rover 0.3 | 4.6 | 10.7% | 4 |
| patson.PatsonTestBot 1.0 | 5.8 | 9.0% | 5 |
| mbh.Mbh 0.1 | 7.3 | 7.2% | 0 |
| pac.ABC 2.1 | 8.0 | 6.7% | 1 |
| pbg.R2D2 1.0 | 8.8 | 5.6% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 91.4 | 24 / 35 | 6193 |
| 2 | 1 | 72.9 | 95.2 | 30 / 35 | 6105 |
| 3 | 1 | 70.1 | 86.0 | 22 / 35 | 5879 |
| 4 | 1 | 71.5 | 89.8 | 28 / 35 | 5652 |
| 5 | 1 | 71.9 | 92.7 | 30 / 35 | 5646 |
| 6 | 1 | 72.4 | 95.9 | 31 / 35 | 5572 |
| 7 | 1 | 71.4 | 91.7 | 28 / 35 | 5714 |
| 8 | 1 | 70.8 | 89.8 | 25 / 35 | 5567 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 113 | 90% |
| mld.Infinity 2.2 | 80 | 90% |
| krillr.mini.JointStrike 2.0.0 | 18 | 94% |
| patson.PatsonTestBot 1.0 | 12 | 92% |
| erdnis.Rover 0.3 | 12 | 83% |
| pac.ABC 2.1 | 4 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 63 of 280 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 21 | 33% | 120 |
| mld.Infinity 2.2 | 13 | 21% | 28 |
| krillr.mini.JointStrike 2.0.0 | 9 | 14% | 50 |
| erdnis.Rover 0.3 | 6 | 10% | 22 |
| patson.PatsonTestBot 1.0 | 4 | 6% | 19 |
| pac.ABC 2.1 | 4 | 6% | 11 |
| pbg.R2D2 1.0 | 3 | 5% | 13 |
| mbh.Mbh 0.1 | 3 | 5% | 9 |

## Melee bench: F20

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 85.4 | 144 / 280 | 2.31 | 18.9% | 43490 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 18.9% | 144 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.9% | 68 |
| fwb.Nine 1.0.1 | 3.5 | 11.6% | 33 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 10.6% | 5 |
| catcat20.Rabbit 0.001 | 4.5 | 9.9% | 25 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.3% | 2 |
| bayen.nut.Squirrel 1.615 | 7.6 | 7.1% | 2 |
| djdjdj.NanoSkunk10 1.0 | 7.9 | 7.2% | 2 |
| ntc.ControlledChaos 1.1.4 | 8.3 | 6.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 90.5 | 22 / 35 | 5768 |
| 2 | 1 | 68.1 | 87.0 | 16 / 35 | 5174 |
| 3 | 1 | 68.4 | 86.0 | 14 / 35 | 5539 |
| 4 | 1 | 69.3 | 88.3 | 17 / 35 | 5494 |
| 5 | 1 | 69.4 | 86.7 | 22 / 35 | 5605 |
| 6 | 1 | 66.3 | 79.0 | 16 / 35 | 4987 |
| 7 | 1 | 69.6 | 87.6 | 19 / 35 | 5540 |
| 8 | 1 | 67.1 | 78.4 | 18 / 35 | 5383 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 98 | 66% |
| catcat20.Rabbit 0.001 | 36 | 58% |
| fwb.Nine 1.0.1 | 34 | 53% |
| nz.jdc.nano.GridFu 1.0 | 18 | 89% |
| bayen.nut.Squirrel 1.615 | 12 | 100% |
| m3thos.mini.Eva01 0.5.5 | 7 | 100% |
| djdjdj.NanoSkunk10 1.0 | 4 | 75% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 138 of 280 rounds, at a mean tick of 1143. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 66 | 48% | 115 |
| fwb.Nine 1.0.1 | 30 | 22% | 40 |
| catcat20.Rabbit 0.001 | 20 | 14% | 46 |
| nz.jdc.nano.GridFu 1.0 | 8 | 6% | 41 |
| bayen.nut.Squirrel 1.615 | 5 | 4% | 16 |
| m3thos.mini.Eva01 0.5.5 | 3 | 2% | 8 |
| djdjdj.NanoSkunk10 1.0 | 3 | 2% | 6 |
| ntc.ControlledChaos 1.1.4 | 2 | 1% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 85.6 | 148 / 280 | 2.30 | 19.1% | 44108 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.1 | 19.1% | 148 |
| eem.EvBot v4.6.16 | 1.9 | 16.7% | 105 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.4% | 10 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 4 |
| eld.Hmm 1.0 | 5.3 | 8.5% | 10 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.9% | 2 |
| fire219.CatBot 1.0 | 7.0 | 6.6% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.1% | 1 |
| PSW.Relentless 0.1 | 9.0 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 84.8 | 16 / 35 | 5322 |
| 2 | 1 | 69.0 | 85.4 | 22 / 35 | 5480 |
| 3 | 1 | 69.3 | 84.4 | 22 / 35 | 5652 |
| 4 | 1 | 70.1 | 91.7 | 20 / 35 | 5361 |
| 5 | 1 | 68.7 | 81.6 | 17 / 35 | 5526 |
| 6 | 2 | 67.2 | 78.4 | 13 / 35 | 5381 |
| 7 | 1 | 70.2 | 89.2 | 18 / 35 | 5608 |
| 8 | 1 | 70.3 | 88.9 | 20 / 35 | 5778 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 130 | 53% |
| dummy.mini.Scimitar 1.01 | 35 | 94% |
| cf.RiO.RiOx 4.2.1 | 27 | 100% |
| eld.Hmm 1.0 | 15 | 87% |
| oa.weak.BotherBot 0.1 | 7 | 86% |

Hadur died in 132 of 280 rounds, at a mean tick of 1094. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 86 | 65% | 140 |
| cf.RiO.RiOx 4.2.1 | 12 | 9% | 32 |
| dummy.mini.Scimitar 1.01 | 11 | 8% | 49 |
| oa.weak.BotherBot 0.1 | 7 | 5% | 17 |
| PSW.Relentless 0.1 | 5 | 4% | 6 |
| fire219.CatBot 1.0 | 4 | 3% | 4 |
| eld.Hmm 1.0 | 3 | 2% | 25 |
| arthord.MannyPacquiao Beta | 3 | 2% | 5 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |

## Melee bench: F23

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 80.5 | 119 / 280 | 2.76 | 18.6% | 47130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.1 | 18.6% | 119 |
| pe.SandboxLump 1.52 | 1.9 | 16.7% | 94 |
| cre.Karolos 0.32 | 3.0 | 13.8% | 35 |
| stelo.RamTrackSurfer 1.2 | 4.9 | 9.7% | 11 |
| stelo.AreaTargetingBot 1.1 | 5.1 | 9.7% | 13 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.4 | 9.4% | 1 |
| cw.megas.Blade 0.8 | 7.3 | 8.4% | 1 |
| sample.Walls 1.0 | 7.4 | 8.2% | 6 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.8% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 81.6 | 17 / 35 | 5946 |
| 2 | 1 | 68.9 | 79.7 | 16 / 35 | 5565 |
| 3 | 2 | 66.9 | 73.7 | 10 / 35 | 5833 |
| 4 | 1 | 66.6 | 72.1 | 11 / 35 | 5467 |
| 5 | 1 | 72.2 | 89.2 | 17 / 35 | 6753 |
| 6 | 1 | 68.0 | 75.6 | 16 / 35 | 5877 |
| 7 | 1 | 68.7 | 82.5 | 11 / 35 | 5523 |
| 8 | 1 | 71.0 | 89.5 | 21 / 35 | 6166 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 102 | 49% |
| cre.Karolos 0.32 | 51 | 67% |
| stelo.AreaTargetingBot 1.1 | 19 | 89% |
| stelo.RamTrackSurfer 1.2 | 9 | 89% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 86% |
| sample.Walls 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 161 of 280 rounds, at a mean tick of 687. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 85 | 53% | 141 |
| cre.Karolos 0.32 | 35 | 22% | 74 |
| cw.megas.Blade 0.8 | 12 | 7% | 13 |
| stelo.RamTrackSurfer 1.2 | 9 | 6% | 17 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 6% | 13 |
| stelo.AreaTargetingBot 1.1 | 7 | 4% | 15 |
| sample.Walls 1.0 | 3 | 2% | 6 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F24

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 71.8 | 66 / 280 | 3.54 | 14.9% | 32721 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.4 | 14.9% | 66 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.2% | 61 |
| florent.XSeries.X2 0.12 | 3.1 | 13.3% | 54 |
| davidalves.Phoenix 0.54 | 3.5 | 12.4% | 48 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.5% | 25 |
| oog.melee.Corsair 1.0 | 6.0 | 9.5% | 8 |
| stelo.SoJNanoMelee 1.1 | 7.6 | 6.8% | 12 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.6% | 1 |
| as.FrankTheTank 1.3 | 8.9 | 5.7% | 3 |
| evd.X1 0.01 | 9.8 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 77.5 | 10 / 35 | 4137 |
| 2 | 1 | 64.4 | 75.9 | 11 / 35 | 4518 |
| 3 | 2 | 60.1 | 66.3 | 8 / 35 | 3726 |
| 4 | 2 | 60.1 | 64.1 | 5 / 35 | 4133 |
| 5 | 1 | 63.7 | 75.6 | 8 / 35 | 4237 |
| 6 | 1 | 63.2 | 72.4 | 10 / 35 | 4307 |
| 7 | 1 | 62.0 | 74.3 | 6 / 35 | 3785 |
| 8 | 2 | 61.0 | 68.6 | 8 / 35 | 3878 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 46 | 59% |
| davidalves.Phoenix 0.54 | 33 | 33% |
| florent.XSeries.X2 0.12 | 29 | 34% |
| pedersen.Ugluk 1.1.1 | 12 | 50% |
| stelo.SoJNanoMelee 1.1 | 10 | 60% |
| as.FrankTheTank 1.3 | 3 | 100% |
| lunchie.Lunchbox 0.93 | 2 | 100% |
| oog.melee.Corsair 1.0 | 2 | 50% |

Hadur died in 214 of 280 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 69 | 32% | 79 |
| rz.GlowBlowMelee 1.4 | 48 | 22% | 76 |
| davidalves.Phoenix 0.54 | 35 | 16% | 46 |
| pedersen.Ugluk 1.1.1 | 19 | 9% | 25 |
| oog.melee.Corsair 1.0 | 18 | 8% | 22 |
| stelo.SoJNanoMelee 1.1 | 12 | 6% | 15 |
| evd.X1 0.01 | 9 | 4% | 9 |
| as.FrankTheTank 1.3 | 2 | 1% | 5 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 3 |

## Melee bench: F25

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.7 | 176 / 280 | 2.55 | 18.4% | 35942 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 18.4% | 176 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 12.8% | 28 |
| voidious.micro.BlitzBat 1.05 | 2.9 | 12.4% | 18 |
| jdw.Hurricane 1.4 | 4.1 | 11.0% | 24 |
| ds.Oo 2.2 | 5.3 | 9.7% | 12 |
| gre.svman4.Morfeas 1.4.1 | 6.0 | 9.1% | 14 |
| adt.Ar2 1.1 | 7.6 | 7.6% | 3 |
| awesomeness.Elite 1.0 | 7.9 | 7.1% | 2 |
| gjr.Cephalosporin 0.1 | 8.0 | 7.5% | 5 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 83.2 | 22 / 35 | 4412 |
| 2 | 1 | 68.5 | 84.8 | 22 / 35 | 4574 |
| 3 | 1 | 68.8 | 86.7 | 25 / 35 | 4544 |
| 4 | 1 | 67.1 | 81.9 | 24 / 35 | 4216 |
| 5 | 1 | 68.4 | 85.4 | 21 / 35 | 4693 |
| 6 | 1 | 66.0 | 78.4 | 19 / 35 | 4442 |
| 7 | 1 | 67.5 | 81.9 | 21 / 35 | 4753 |
| 8 | 1 | 66.8 | 79.7 | 22 / 35 | 4308 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 62 | 97% |
| voidious.mini.BrokenSword 2.0.3 | 58 | 90% |
| jdw.Hurricane 1.4 | 27 | 96% |
| ds.Oo 2.2 | 15 | 73% |
| gjr.Cephalosporin 0.1 | 14 | 93% |
| adt.Ar2 1.1 | 7 | 86% |
| gre.svman4.Morfeas 1.4.1 | 6 | 50% |
| awesomeness.Elite 1.0 | 4 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 105 of 280 rounds, at a mean tick of 562. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 25 | 24% | 77 |
| jdw.Hurricane 1.4 | 18 | 17% | 36 |
| voidious.mini.BrokenSword 2.0.3 | 16 | 15% | 61 |
| ds.Oo 2.2 | 13 | 12% | 31 |
| gre.svman4.Morfeas 1.4.1 | 11 | 10% | 23 |
| adt.Ar2 1.1 | 9 | 9% | 15 |
| awesomeness.Elite 1.0 | 9 | 9% | 14 |
| gjr.Cephalosporin 0.1 | 3 | 3% | 21 |
| amk.ChumbaMini 0.2 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.1 | 130 / 280 | 2.52 | 18.2% | 44566 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 18.2% | 130 |
| ak.Fermat 2.0 | 2.0 | 15.6% | 79 |
| shu.nitro.LENIN .T34 | 3.5 | 12.1% | 33 |
| lrem.Spectre 0.4.4 | 3.9 | 11.8% | 22 |
| js.PinBall 1.6 | 5.6 | 10.0% | 5 |
| gh.mini.GrubbmOne 1.0 | 5.8 | 9.7% | 9 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.2% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.6% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 85.1 | 16 / 35 | 5712 |
| 2 | 1 | 66.9 | 76.5 | 16 / 35 | 5571 |
| 3 | 1 | 69.1 | 85.4 | 18 / 35 | 5553 |
| 4 | 1 | 70.0 | 87.3 | 20 / 35 | 6097 |
| 5 | 1 | 67.1 | 82.5 | 14 / 35 | 5158 |
| 6 | 1 | 68.7 | 84.8 | 16 / 35 | 5519 |
| 7 | 1 | 68.2 | 83.2 | 15 / 35 | 5791 |
| 8 | 1 | 66.6 | 80.0 | 15 / 35 | 5165 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 72 | 43% |
| shu.nitro.LENIN .T34 | 49 | 67% |
| lrem.Spectre 0.4.4 | 41 | 85% |
| jaybot.adv.bots.JayBot 2.0 | 13 | 92% |
| js.PinBall 1.6 | 9 | 78% |
| gh.mini.GrubbmOne 1.0 | 7 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 150 of 280 rounds, at a mean tick of 889. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 69 | 46% | 107 |
| shu.nitro.LENIN .T34 | 29 | 19% | 62 |
| lrem.Spectre 0.4.4 | 19 | 13% | 41 |
| js.PinBall 1.6 | 15 | 10% | 27 |
| fullsail.LaxativeTeaTwo 1.0 | 7 | 5% | 11 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 3% | 15 |
| gh.mini.GrubbmOne 1.0 | 4 | 3% | 13 |
| sample.SpinBot 1.0 | 3 | 2% | 4 |

## Melee bench: F27

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 70.6 | 127 / 280 | 3.65 | 16.0% | 35358 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.8 | 16.0% | 127 |
| mk.Alpha 0.2.1 | 2.0 | 15.2% | 90 |
| wee.Gem 1.8.4 | 3.3 | 11.1% | 36 |
| sheldor.melee.nano.TestMelee 0.1 | 4.3 | 10.8% | 11 |
| EH.Eagle 1.0.6 | 5.3 | 9.3% | 4 |
| techdude.kombat.FlamingKombat 1.5 | 6.1 | 9.2% | 7 |
| joe.ADinosaur 1.0 | 6.8 | 8.9% | 1 |
| throxbot.ThroxBot 0.1 | 7.3 | 8.3% | 3 |
| caimano.Furia_Ceca 0.22 | 8.9 | 6.2% | 2 |
| cs.Grudge 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 94.0 | 25 / 35 | 4913 |
| 2 | 5 | 50.5 | 33.3 | 6 / 35 | 3628 |
| 3 | 1 | 67.3 | 83.8 | 18 / 35 | 4465 |
| 4 | 1 | 65.9 | 77.1 | 18 / 35 | 4544 |
| 5 | 1 | 67.5 | 87.0 | 24 / 35 | 4238 |
| 6 | 2 | 58.1 | 47.9 | 5 / 35 | 4337 |
| 7 | 2 | 59.7 | 54.6 | 9 / 35 | 4459 |
| 8 | 1 | 68.3 | 86.7 | 22 / 35 | 4774 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 88 | 69% |
| wee.Gem 1.8.4 | 20 | 80% |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 100% |
| EH.Eagle 1.0.6 | 16 | 94% |
| techdude.kombat.FlamingKombat 1.5 | 9 | 89% |
| throxbot.ThroxBot 0.1 | 8 | 88% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 153 of 280 rounds, at a mean tick of 564. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 50 | 33% | 108 |
| cs.Grudge 1.0 | 24 | 16% | 24 |
| sheldor.melee.nano.TestMelee 0.1 | 21 | 14% | 38 |
| wee.Gem 1.8.4 | 15 | 10% | 30 |
| joe.ADinosaur 1.0 | 14 | 9% | 19 |
| techdude.kombat.FlamingKombat 1.5 | 12 | 8% | 20 |
| EH.Eagle 1.0.6 | 8 | 5% | 23 |
| throxbot.ThroxBot 0.1 | 7 | 5% | 13 |
| caimano.Furia_Ceca 0.22 | 2 | 1% | 4 |

## Melee bench: F28

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 83.1 | 162 / 280 | 2.52 | 18.0% | 34843 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 18.0% | 162 |
| kid.test.NightFox .2 | 2.0 | 14.3% | 40 |
| uji.Antique 1.0 | 3.5 | 11.5% | 30 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 10.9% | 32 |
| pfvicm.Sobieski 7.2.3b | 4.6 | 10.8% | 5 |
| ahr.ice.Ice 1.0.2 | 6.4 | 8.1% | 6 |
| amk.ChumbaWumba 0.3 | 7.1 | 7.9% | 3 |
| matt.advanced.Katana 1.0 | 7.6 | 7.0% | 5 |
| stelo.PianistNano 1.2 | 9.1 | 5.9% | 1 |
| stelo.Lifestealer 1.0 | 9.6 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 81.0 | 18 / 35 | 4310 |
| 2 | 1 | 68.9 | 87.0 | 25 / 35 | 4642 |
| 3 | 1 | 66.4 | 82.5 | 18 / 35 | 4320 |
| 4 | 1 | 67.4 | 84.4 | 23 / 35 | 4046 |
| 5 | 1 | 68.7 | 88.9 | 23 / 35 | 4363 |
| 6 | 1 | 66.9 | 82.5 | 20 / 35 | 4255 |
| 7 | 1 | 67.9 | 83.2 | 20 / 35 | 4850 |
| 8 | 1 | 64.1 | 75.6 | 15 / 35 | 4057 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 105 | 80% |
| uji.Antique 1.0 | 52 | 87% |
| qohnil.blot.BlotBot 3.61 | 21 | 33% |
| amk.ChumbaWumba 0.3 | 9 | 78% |
| pfvicm.Sobieski 7.2.3b | 9 | 100% |
| ahr.ice.Ice 1.0.2 | 5 | 60% |
| matt.advanced.Katana 1.0 | 4 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |

Hadur died in 122 of 280 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 27 | 22% | 37 |
| kid.test.NightFox .2 | 26 | 21% | 92 |
| qohnil.blot.BlotBot 3.61 | 20 | 16% | 29 |
| uji.Antique 1.0 | 19 | 16% | 68 |
| amk.ChumbaWumba 0.3 | 10 | 8% | 17 |
| ahr.ice.Ice 1.0.2 | 8 | 7% | 14 |
| stelo.Lifestealer 1.0 | 7 | 6% | 12 |
| stelo.PianistNano 1.2 | 2 | 2% | 4 |
| matt.advanced.Katana 1.0 | 0 | 0% | 6 |
3 death(s) with no robot to name.

## Melee bench: F29

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.0 | 125 / 280 | 2.44 | 18.4% | 39597 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 18.4% | 125 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.0% | 77 |
| deewiant.Anomaly 0.2 | 2.9 | 13.5% | 58 |
| myl.micro.Troodon 1.10 | 4.0 | 11.7% | 8 |
| jok.PheonixM 0.1.2 | 4.9 | 10.6% | 5 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.1% | 0 |
| DBall.Anarchy 0.1 | 7.4 | 6.7% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 6.1% | 0 |
| ap.Frederick 1.1 | 9.1 | 5.2% | 1 |
| jangs.ns51 1.0 | 9.5 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 81.3 | 17 / 35 | 4939 |
| 2 | 1 | 68.7 | 88.3 | 15 / 35 | 4969 |
| 3 | 1 | 68.7 | 85.7 | 18 / 35 | 5095 |
| 4 | 1 | 66.6 | 77.5 | 13 / 35 | 4907 |
| 5 | 1 | 67.2 | 82.2 | 14 / 35 | 4760 |
| 6 | 1 | 68.8 | 87.3 | 15 / 35 | 4975 |
| 7 | 1 | 70.4 | 91.1 | 21 / 35 | 5204 |
| 8 | 1 | 66.3 | 79.0 | 12 / 35 | 4748 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 65 | 51% |
| zyx.mega.YersiniaPestis 3.1 | 57 | 35% |
| myl.micro.Troodon 1.10 | 32 | 97% |
| jok.PheonixM 0.1.2 | 19 | 95% |
| DBall.Anarchy 0.1 | 11 | 100% |
| jangs.ns51 1.0 | 5 | 80% |
| ap.Frederick 1.1 | 4 | 100% |
| ph.melee.ArcherME 0.3 | 4 | 100% |

Hadur died in 156 of 280 rounds, at a mean tick of 1045. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 62 | 40% | 105 |
| zyx.mega.YersiniaPestis 3.1 | 58 | 37% | 78 |
| jok.PheonixM 0.1.2 | 13 | 8% | 25 |
| myl.micro.Troodon 1.10 | 10 | 6% | 38 |
| DBall.Anarchy 0.1 | 4 | 3% | 16 |
| ph.melee.ArcherME 0.3 | 4 | 3% | 7 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 2% | 6 |
| jangs.ns51 1.0 | 2 | 1% | 5 |

## Melee bench: F30

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 58.7 | 29 / 280 | 4.71 | 12.3% | 31147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.8 | 14.3% | 79 |
| oog.melee.Capulet 1.2 | 2.8 | 12.9% | 44 |
| stelo.PastFuture 2.3.2 | 2.9 | 12.8% | 39 |
| darkcanuck.B26354 1.06 | 3.5 | 12.8% | 57 |
| hadur117.micro.SaorFX 0.1 | 4.1 | 12.3% | 29 |
| intruder.PrairieWolf 2.61 | 6.5 | 8.9% | 13 |
| fowl3628800.LightningBolt 2.6.0 | 7.1 | 8.1% | 13 |
| ntc.Opposite 1.5 | 8.1 | 7.6% | 2 |
| tripphippy.Alice 1.1 | 8.3 | 7.5% | 4 |
| GarmBox.Anger 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.1 | 59.0 | 3 / 35 | 3577 |
| 2 | 5 | 57.3 | 56.8 | 4 / 35 | 3840 |
| 3 | 3 | 58.3 | 62.2 | 2 / 35 | 3744 |
| 4 | 4 | 57.5 | 57.5 | 4 / 35 | 4186 |
| 5 | 3 | 58.9 | 62.5 | 3 / 35 | 4173 |
| 6 | 5 | 55.1 | 50.8 | 6 / 35 | 3888 |
| 7 | 5 | 57.3 | 58.1 | 4 / 35 | 3779 |
| 8 | 3 | 58.9 | 62.9 | 3 / 35 | 3960 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 20 | 40% |
| stelo.PastFuture 2.3.2 | 19 | 47% |
| catcat20.Matcha 0.006 | 18 | 0% |
| oog.melee.Capulet 1.2 | 15 | 40% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 50% |
| intruder.PrairieWolf 2.61 | 3 | 67% |
| tripphippy.Alice 1.1 | 2 | 100% |

Hadur died in 252 of 280 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 62 | 25% | 65 |
| oog.melee.Capulet 1.2 | 48 | 19% | 53 |
| stelo.PastFuture 2.3.2 | 47 | 19% | 56 |
| darkcanuck.B26354 1.06 | 41 | 16% | 51 |
| intruder.PrairieWolf 2.61 | 15 | 6% | 16 |
| tripphippy.Alice 1.1 | 14 | 6% | 16 |
| fowl3628800.LightningBolt 2.6.0 | 13 | 5% | 11 |
| ntc.Opposite 1.5 | 8 | 3% | 8 |
| GarmBox.Anger 1.0 | 4 | 2% | 4 |

## Melee bench: F31

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 71.0 | 34 / 280 | 3.61 | 14.1% | 30247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.8% | 160 |
| hadur117.micro.SaorFX 0.1 | 2.0 | 14.1% | 34 |
| gh.mini.Griezel 0.2 | 3.3 | 12.8% | 52 |
| d414.nano.Quantum 1.0.0 | 4.0 | 11.3% | 19 |
| spinnercat.micro.Tyger 0.1 | 4.8 | 10.8% | 11 |
| gh.nano.Grofvuil 0.2 | 6.1 | 8.7% | 2 |
| timmit.nano.TimDog 0.33 | 7.3 | 7.2% | 4 |
| fm.mammillarias 1.3 | 8.1 | 6.3% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 8.9 | 5.4% | 0 |
| tlp.ThreeLeggedPig 1 | 9.6 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 72.7 | 5 / 35 | 4092 |
| 2 | 2 | 60.9 | 72.1 | 1 / 35 | 3606 |
| 3 | 2 | 61.1 | 69.2 | 5 / 35 | 3770 |
| 4 | 2 | 61.4 | 70.2 | 6 / 35 | 3783 |
| 5 | 2 | 61.5 | 70.2 | 3 / 35 | 3832 |
| 6 | 2 | 61.9 | 72.7 | 6 / 35 | 3586 |
| 7 | 2 | 60.4 | 67.9 | 5 / 35 | 3620 |
| 8 | 2 | 62.4 | 73.0 | 3 / 35 | 3958 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 70 | 10% |
| gh.mini.Griezel 0.2 | 18 | 22% |
| spinnercat.micro.Tyger 0.1 | 12 | 75% |
| d414.nano.Quantum 1.0.0 | 7 | 71% |
| gh.nano.Grofvuil 0.2 | 5 | 100% |
| timmit.nano.TimDog 0.33 | 4 | 75% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 246 of 280 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 145 | 59% | 153 |
| gh.mini.Griezel 0.2 | 36 | 15% | 40 |
| spinnercat.micro.Tyger 0.1 | 18 | 7% | 28 |
| d414.nano.Quantum 1.0.0 | 14 | 6% | 19 |
| timmit.nano.TimDog 0.33 | 14 | 6% | 15 |
| gh.nano.Grofvuil 0.2 | 10 | 4% | 15 |
| fm.mammillarias 1.3 | 4 | 2% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 4 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 1 | 0% | 2 |

## Melee bench: F32

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 77.9 | 115 / 280 | 2.99 | 16.6% | 37420 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 16.6% | 115 |
| kawigi.sbf.FloodHT 0.9.2 | 2.1 | 14.4% | 81 |
| apc.botM 3.0 | 3.4 | 11.9% | 29 |
| vjik.UnViolation 1.1 | 4.0 | 11.3% | 22 |
| lxx.ConceptA 0.8 | 4.5 | 10.5% | 6 |
| bayen.UbaMicro 1.4 | 6.0 | 8.9% | 12 |
| panzer.Panzer 0.2 | 7.6 | 7.5% | 5 |
| yk.JahMicro 1.0 | 8.3 | 6.5% | 5 |
| conscience.Electron 1.3g | 8.4 | 6.5% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.8% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 80.0 | 17 / 35 | 4412 |
| 2 | 1 | 61.9 | 70.5 | 12 / 35 | 4368 |
| 3 | 1 | 63.9 | 70.2 | 17 / 35 | 4748 |
| 4 | 1 | 66.5 | 83.2 | 16 / 35 | 4928 |
| 5 | 1 | 64.8 | 78.4 | 11 / 35 | 4680 |
| 6 | 1 | 64.3 | 73.0 | 14 / 35 | 4724 |
| 7 | 1 | 65.9 | 83.8 | 9 / 35 | 4837 |
| 8 | 1 | 66.9 | 83.8 | 19 / 35 | 4723 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 78 | 35% |
| apc.botM 3.0 | 35 | 80% |
| lxx.ConceptA 0.8 | 27 | 100% |
| vjik.UnViolation 1.1 | 20 | 65% |
| bayen.UbaMicro 1.4 | 8 | 75% |
| donjezza.Jezza 1.0 | 7 | 86% |
| yk.JahMicro 1.0 | 7 | 71% |
| panzer.Panzer 0.2 | 3 | 67% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 166 of 280 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 72 | 43% | 100 |
| vjik.UnViolation 1.1 | 21 | 13% | 42 |
| conscience.Electron 1.3g | 19 | 11% | 22 |
| apc.botM 3.0 | 16 | 10% | 50 |
| lxx.ConceptA 0.8 | 16 | 10% | 31 |
| panzer.Panzer 0.2 | 8 | 5% | 11 |
| bayen.UbaMicro 1.4 | 8 | 5% | 11 |
| yk.JahMicro 1.0 | 4 | 2% | 6 |
| donjezza.Jezza 1.0 | 2 | 1% | 7 |

## Melee bench: F33

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 82.9 | 144 / 280 | 2.54 | 18.7% | 41787 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 18.7% | 144 |
| maribo.Quester 0.3 | 2.0 | 15.8% | 61 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.1 | 12.5% | 29 |
| gre.svman4.Leonidas 1.3.2 | 4.6 | 10.8% | 17 |
| labg.Cataclysm 2.05 | 5.1 | 9.9% | 19 |
| baal.nano.N 1.42 | 6.0 | 9.1% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.7% | 6 |
| sanja.First 0.1 | 8.4 | 5.4% | 0 |
| zyx.micro.Ant 1.1 | 8.5 | 5.5% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 86.7 | 19 / 35 | 5512 |
| 2 | 1 | 69.6 | 87.0 | 20 / 35 | 5354 |
| 3 | 1 | 67.0 | 76.2 | 18 / 35 | 5106 |
| 4 | 1 | 68.0 | 79.7 | 17 / 35 | 5138 |
| 5 | 1 | 67.6 | 78.4 | 17 / 35 | 5280 |
| 6 | 1 | 69.2 | 87.6 | 16 / 35 | 5423 |
| 7 | 1 | 70.3 | 89.8 | 21 / 35 | 5321 |
| 8 | 1 | 66.5 | 77.8 | 16 / 35 | 4653 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 84 | 67% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 50 | 84% |
| gre.svman4.Leonidas 1.3.2 | 33 | 91% |
| labg.Cataclysm 2.05 | 15 | 47% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 63% |
| sanja.First 0.1 | 2 | 100% |
| baal.nano.N 1.42 | 2 | 100% |

Hadur died in 139 of 280 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 66 | 47% | 123 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 13% | 59 |
| gre.svman4.Leonidas 1.3.2 | 18 | 13% | 39 |
| labg.Cataclysm 2.05 | 15 | 11% | 27 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 5% | 7 |
| baal.nano.N 1.42 | 6 | 4% | 11 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 4 | 3% | 6 |
| zyx.micro.Ant 1.1 | 4 | 3% | 5 |
| sanja.First 0.1 | 1 | 1% | 2 |

## Melee bench: F34

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 74.0 | 41 / 280 | 3.34 | 15.4% | 37548 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.0 | 17.8% | 135 |
| kid.Gladiator .7.2 | 2.4 | 16.0% | 69 |
| hadur117.micro.SaorFX 0.1 | 2.6 | 15.4% | 41 |
| tcf.Reach 3 | 4.6 | 11.1% | 11 |
| jcs.Seth 1.8 | 4.6 | 10.9% | 20 |
| cli.Dancer 1.1 | 5.8 | 9.5% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 7.0% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.5% | 1 |
| sample.VelociRobot 1.0 | 9.1 | 3.8% | 0 |
| sample.RamFire 1.0 | 9.9 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.7 | 76.5 | 4 / 35 | 4764 |
| 2 | 2 | 65.0 | 75.9 | 6 / 35 | 4502 |
| 3 | 2 | 67.0 | 81.6 | 5 / 35 | 5092 |
| 4 | 3 | 64.2 | 71.1 | 7 / 35 | 4478 |
| 5 | 3 | 62.4 | 67.0 | 4 / 35 | 4507 |
| 6 | 2 | 65.3 | 77.8 | 7 / 35 | 4616 |
| 7 | 3 | 64.4 | 73.3 | 4 / 35 | 4660 |
| 8 | 3 | 63.1 | 68.6 | 4 / 35 | 4929 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 71 | 18% |
| kid.Gladiator .7.2 | 49 | 29% |
| jcs.Seth 1.8 | 13 | 69% |
| tcf.Reach 3 | 7 | 29% |
| ratosh.Wesco 1.4 | 2 | 50% |
| cli.Dancer 1.1 | 2 | 50% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 239 of 280 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 98 | 41% | 111 |
| kid.Gladiator .7.2 | 84 | 35% | 96 |
| tcf.Reach 3 | 20 | 8% | 23 |
| ratosh.Wesco 1.4 | 11 | 5% | 12 |
| jcs.Seth 1.8 | 10 | 4% | 18 |
| cli.Dancer 1.1 | 8 | 3% | 12 |
| sample.RamFire 1.0 | 4 | 2% | 3 |
| amk.Punbot.Punbot 0.01 | 3 | 1% | 3 |
| sample.VelociRobot 1.0 | 1 | 0% | 2 |

## Melee bench: F35

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 71.2 | 20 / 280 | 3.60 | 13.7% | 28220 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.6% | 210 |
| hadur117.micro.SaorFX 0.1 | 2.5 | 13.7% | 20 |
| gh.mini.Gruwel 0.9 | 3.0 | 13.1% | 37 |
| rz.HawkOnFire 0.1 | 4.1 | 12.1% | 5 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.4 | 11.5% | 8 |
| myl.nano.KomoriNinja 1.1 | 6.1 | 7.2% | 0 |
| wit.Chuliath 1.0 | 7.4 | 6.6% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.1 | 5.4% | 0 |
| dans.Cinnamon 1.2 | 8.5 | 5.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.9 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 77.8 | 4 / 35 | 3717 |
| 2 | 2 | 62.6 | 76.8 | 4 / 35 | 3506 |
| 3 | 3 | 59.3 | 67.6 | 0 / 35 | 3434 |
| 4 | 4 | 59.4 | 67.0 | 3 / 35 | 3209 |
| 5 | 2 | 58.0 | 63.8 | 1 / 35 | 3365 |
| 6 | 2 | 63.3 | 76.8 | 5 / 35 | 3700 |
| 7 | 3 | 61.1 | 68.3 | 2 / 35 | 3740 |
| 8 | 2 | 61.4 | 71.1 | 1 / 35 | 3549 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 53 | 8% |
| gh.mini.Gruwel 0.9 | 18 | 0% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 80% |
| rz.HawkOnFire 0.1 | 9 | 78% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 260 of 280 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 158 | 61% | 165 |
| gh.mini.Gruwel 0.9 | 40 | 15% | 41 |
| dmh.robocode.robot.BlackDeath 9.2 | 26 | 10% | 31 |
| rz.HawkOnFire 0.1 | 21 | 8% | 26 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 9 | 3% | 9 |
| myl.nano.KomoriNinja 1.1 | 3 | 1% | 4 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 3 |
| wit.Chuliath 1.0 | 1 | 0% | 1 |

## Melee bench: F36

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.0 | 217 / 280 | 1.81 | 20.9% | 45915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 20.9% | 217 |
| bzdp.Pansy 2.1 | 2.6 | 11.7% | 7 |
| alpha.RainingFire 1.0 | 3.1 | 11.7% | 19 |
| bvh.micro.Freya 0.3 | 4.4 | 10.5% | 10 |
| mz.Cork 0.1 | 4.4 | 10.7% | 15 |
| bvh.mini.Fenrir 0.39 | 6.1 | 9.0% | 3 |
| m3thos.Eva02 0.7.1 | 6.4 | 9.0% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 6.5% | 0 |
| dl.BetterWalls 1.0 | 9.3 | 5.4% | 1 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 90.2 | 29 / 35 | 5457 |
| 2 | 1 | 71.2 | 93.7 | 28 / 35 | 5581 |
| 3 | 1 | 69.9 | 88.6 | 24 / 35 | 5655 |
| 4 | 1 | 70.7 | 87.9 | 27 / 35 | 5888 |
| 5 | 1 | 71.4 | 91.4 | 25 / 35 | 5967 |
| 6 | 1 | 71.9 | 93.3 | 28 / 35 | 5746 |
| 7 | 1 | 70.4 | 89.5 | 27 / 35 | 5808 |
| 8 | 1 | 71.7 | 93.7 | 29 / 35 | 5813 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 68 | 100% |
| bvh.micro.Freya 0.3 | 42 | 90% |
| alpha.RainingFire 1.0 | 38 | 84% |
| mz.Cork 0.1 | 30 | 87% |
| bvh.mini.Fenrir 0.39 | 27 | 89% |
| sample.MyFirstRobot 1.0 | 16 | 81% |
| m3thos.Eva02 0.7.1 | 16 | 100% |

Hadur died in 63 of 280 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.Cork 0.1 | 16 | 25% | 52 |
| alpha.RainingFire 1.0 | 15 | 24% | 49 |
| bvh.mini.Fenrir 0.39 | 8 | 13% | 17 |
| bvh.micro.Freya 0.3 | 7 | 11% | 32 |
| bzdp.Pansy 2.1 | 5 | 8% | 75 |
| dl.BetterWalls 1.0 | 4 | 6% | 18 |
| sample.MyFirstRobot 1.0 | 4 | 6% | 15 |
| m3thos.Eva02 0.7.1 | 3 | 5% | 19 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 1 |

## Melee bench: F37

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 79.7 | 174 / 280 | 2.83 | 18.0% | 43481 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 18.0% | 174 |
| germ.TheMind .2 | 3.0 | 10.7% | 20 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.3 | 10.9% | 14 |
| EBBU.Sim2 1.02 | 4.3 | 10.0% | 11 |
| agrach.Dalek 1.0 | 4.6 | 9.6% | 25 |
| lmk.ACPFinal 0.1 | 6.3 | 8.7% | 16 |
| mb.Beast 0.1 | 7.3 | 8.5% | 7 |
| stelo.UntouchableNano 1.3 | 7.5 | 8.1% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 8.8 | 7.8% | 1 |
| skm.Ryubot 1.0 | 9.1 | 7.7% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.3 | 67.6 | 18 / 35 | 4772 |
| 2 | 1 | 65.9 | 78.7 | 17 / 35 | 5707 |
| 3 | 1 | 67.3 | 85.1 | 25 / 35 | 5123 |
| 4 | 1 | 68.1 | 82.5 | 25 / 35 | 5677 |
| 5 | 1 | 66.0 | 76.2 | 22 / 35 | 5289 |
| 6 | 1 | 68.6 | 87.3 | 24 / 35 | 5681 |
| 7 | 1 | 67.6 | 84.8 | 24 / 35 | 5411 |
| 8 | 1 | 66.1 | 75.6 | 19 / 35 | 5821 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 39 | 90% |
| skm.Ryubot 1.0 | 28 | 100% |
| EBBU.Sim2 1.02 | 25 | 92% |
| stelo.UntouchableNano 1.3 | 23 | 91% |
| mb.Beast 0.1 | 23 | 96% |
| com.syncleus.robocode.Dreadnaught 0.1 | 21 | 90% |
| agrach.Dalek 1.0 | 16 | 75% |
| lmk.ACPFinal 0.1 | 14 | 93% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 107 of 280 rounds, at a mean tick of 359. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 25 | 23% | 54 |
| com.syncleus.robocode.Dreadnaught 0.1 | 15 | 14% | 53 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 14% | 19 |
| EBBU.Sim2 1.02 | 14 | 13% | 33 |
| germ.TheMind .2 | 11 | 10% | 35 |
| stelo.UntouchableNano 1.3 | 9 | 8% | 22 |
| lmk.ACPFinal 0.1 | 9 | 8% | 21 |
| mb.Beast 0.1 | 7 | 7% | 26 |
| skm.Ryubot 1.0 | 2 | 2% | 14 |

## Melee bench: F38

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 74.5 | 79 / 280 | 3.30 | 15.6% | 34915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.5% | 140 |
| hadur117.micro.SaorFX 0.1 | 2.0 | 15.6% | 79 |
| bvh.mini.Freya 0.55 | 3.3 | 12.1% | 20 |
| bts.mega.Gnarly 1.4 | 4.1 | 10.9% | 21 |
| cs.Wren 1.0 | 5.3 | 10.1% | 7 |
| kdf.KoulDestroyer 1.0 | 5.8 | 9.6% | 8 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.6 | 8.7% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.1 | 6.4% | 2 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.7% | 0 |
| bzdp.BoxCar 2.0 | 9.6 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 72.1 | 8 / 35 | 4255 |
| 2 | 2 | 62.4 | 68.3 | 10 / 35 | 4303 |
| 3 | 2 | 63.6 | 72.7 | 8 / 35 | 4308 |
| 4 | 2 | 63.4 | 73.7 | 9 / 35 | 4141 |
| 5 | 2 | 63.1 | 72.4 | 11 / 35 | 4163 |
| 6 | 2 | 64.9 | 77.1 | 13 / 35 | 4521 |
| 7 | 2 | 65.1 | 78.1 | 13 / 35 | 4439 |
| 8 | 2 | 65.5 | 81.6 | 7 / 35 | 4785 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 78 | 17% |
| bvh.mini.Freya 0.55 | 25 | 84% |
| bts.mega.Gnarly 1.4 | 16 | 56% |
| cs.Wren 1.0 | 16 | 94% |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 92% |
| kdf.KoulDestroyer 1.0 | 8 | 88% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 202 of 280 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 109 | 54% | 128 |
| bvh.mini.Freya 0.55 | 25 | 12% | 36 |
| bts.mega.Gnarly 1.4 | 19 | 9% | 34 |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 9% | 32 |
| kdf.KoulDestroyer 1.0 | 8 | 4% | 14 |
| cs.Wren 1.0 | 7 | 3% | 15 |
| bzdp.BoxCar 2.0 | 7 | 3% | 7 |
| matt.UnderDark3 2.4.34 | 6 | 3% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 1% | 7 |
1 death(s) with no robot to name.

## Melee bench: F39

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 76.7 | 80 / 280 | 3.10 | 16.6% | 41593 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.1 | 16.6% | 80 |
| bvh.fry.Freya 0.82 | 2.3 | 14.8% | 47 |
| az.Ololobot 0.2.4 | 2.9 | 13.5% | 99 |
| catcat20.Lambda 0.024 | 3.8 | 11.6% | 38 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.3% | 1 |
| apollokidd.ApolloKidd 0.9 | 5.8 | 8.5% | 3 |
| gimp.GimpBot 0.1 | 6.9 | 7.9% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 8.0 | 7.0% | 9 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.9 | 6.3% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 74.0 | 10 / 35 | 5578 |
| 2 | 1 | 65.6 | 78.1 | 9 / 35 | 5338 |
| 3 | 1 | 64.7 | 74.0 | 9 / 35 | 5287 |
| 4 | 1 | 63.8 | 74.6 | 12 / 35 | 4728 |
| 5 | 1 | 65.8 | 79.0 | 11 / 35 | 5072 |
| 6 | 1 | 66.6 | 82.9 | 10 / 35 | 5365 |
| 7 | 1 | 66.9 | 83.2 | 13 / 35 | 5522 |
| 8 | 2 | 61.7 | 67.6 | 6 / 35 | 4703 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 60 | 65% |
| az.Ololobot 0.2.4 | 51 | 12% |
| catcat20.Lambda 0.024 | 40 | 50% |
| stelo.SoRobotNanoMelee 1.2 | 11 | 91% |
| apollokidd.ApolloKidd 0.9 | 2 | 50% |
| winamp32.micro.MicroMacro 1.0 | 2 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |
| gimp.GimpBot 0.1 | 1 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 0% |

Hadur died in 200 of 280 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 69 | 35% | 82 |
| bvh.fry.Freya 0.82 | 50 | 25% | 81 |
| catcat20.Lambda 0.024 | 35 | 18% | 52 |
| apollokidd.ApolloKidd 0.9 | 16 | 8% | 18 |
| stelo.SoRobotNanoMelee 1.2 | 12 | 6% | 24 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9 | 5% | 10 |
| gimp.GimpBot 0.1 | 4 | 2% | 6 |
| winamp32.micro.MicroMacro 1.0 | 4 | 2% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 2 |

## Melee bench: F40

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 80.6 | 147 / 280 | 2.75 | 17.9% | 39218 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 17.9% | 147 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.0% | 68 |
| kano.gamma.KanoGamma 1.8 | 3.1 | 12.1% | 23 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.4% | 11 |
| mz.AntiGrav 1.0 | 4.9 | 10.6% | 10 |
| alpha.BlackIce 1.0 | 5.6 | 9.3% | 5 |
| stelo.Randomness 1.0 | 6.9 | 8.6% | 12 |
| amk.superstrike.SuperStrike 0.3 | 8.3 | 6.4% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.9 | 5.7% | 3 |
| sample.Corners 1.0 | 9.9 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 84.4 | 16 / 35 | 4593 |
| 2 | 1 | 63.1 | 67.6 | 15 / 35 | 4219 |
| 3 | 1 | 67.6 | 81.9 | 18 / 35 | 4900 |
| 4 | 1 | 67.4 | 78.7 | 17 / 35 | 5379 |
| 5 | 1 | 67.7 | 81.6 | 22 / 35 | 4918 |
| 6 | 1 | 68.8 | 85.7 | 18 / 35 | 5333 |
| 7 | 1 | 68.7 | 86.7 | 20 / 35 | 4898 |
| 8 | 1 | 67.2 | 78.1 | 21 / 35 | 4978 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 80 | 55% |
| kano.gamma.KanoGamma 1.8 | 39 | 85% |
| Polkwane.SmashMelee 1.0 | 29 | 90% |
| mz.AntiGrav 1.0 | 23 | 100% |
| stelo.Randomness 1.0 | 13 | 77% |
| alpha.BlackIce 1.0 | 7 | 86% |
| sample.Corners 1.0 | 3 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 133 of 280 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 49 | 37% | 88 |
| kano.gamma.KanoGamma 1.8 | 17 | 13% | 51 |
| stelo.Randomness 1.0 | 17 | 13% | 30 |
| alpha.BlackIce 1.0 | 16 | 12% | 22 |
| mz.AntiGrav 1.0 | 15 | 11% | 35 |
| Polkwane.SmashMelee 1.0 | 9 | 7% | 33 |
| amk.superstrike.SuperStrike 0.3 | 6 | 5% | 8 |
| sample.Corners 1.0 | 3 | 2% | 6 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 6 |

## Melee bench: F41

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 71.7 | 91 / 280 | 3.54 | 15.5% | 35435 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.3 | 16.3% | 123 |
| hadur117.micro.SaorFX 0.1 | 1.8 | 15.5% | 91 |
| lessonz.robocode.Oz 0.5.0 | 3.4 | 13.0% | 36 |
| ary.Swarm 1.1 | 3.6 | 12.6% | 13 |
| simonton.nano.MeleeSeed 1.8 | 5.5 | 9.6% | 7 |
| shrub.Silver v048 | 5.6 | 9.6% | 3 |
| zyx.nano.Ant 1.1 | 6.9 | 8.2% | 0 |
| jsal.Jsalbot 1.0 | 8.4 | 6.3% | 3 |
| stelo.Mirror 1.1 | 8.6 | 6.0% | 4 |
| acogdev.alpha 0.2 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 68.9 | 13 / 35 | 4580 |
| 2 | 2 | 63.7 | 72.4 | 11 / 35 | 4262 |
| 3 | 2 | 64.1 | 69.2 | 10 / 35 | 4920 |
| 4 | 2 | 62.6 | 70.2 | 10 / 35 | 4023 |
| 5 | 2 | 63.2 | 68.3 | 11 / 35 | 4479 |
| 6 | 1 | 65.3 | 77.5 | 12 / 35 | 4419 |
| 7 | 2 | 63.2 | 70.5 | 12 / 35 | 4177 |
| 8 | 1 | 65.0 | 77.1 | 12 / 35 | 4575 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 72 | 28% |
| lessonz.robocode.Oz 0.5.0 | 32 | 75% |
| ary.Swarm 1.1 | 26 | 88% |
| simonton.nano.MeleeSeed 1.8 | 19 | 79% |
| shrub.Silver v048 | 5 | 100% |
| stelo.Mirror 1.1 | 3 | 67% |
| jsal.Jsalbot 1.0 | 2 | 50% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 190 of 280 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 85 | 45% | 118 |
| simonton.nano.MeleeSeed 1.8 | 31 | 16% | 41 |
| ary.Swarm 1.1 | 20 | 11% | 45 |
| lessonz.robocode.Oz 0.5.0 | 20 | 11% | 29 |
| shrub.Silver v048 | 9 | 5% | 15 |
| stelo.Mirror 1.1 | 9 | 5% | 13 |
| zyx.nano.Ant 1.1 | 9 | 5% | 10 |
| acogdev.alpha 0.2 | 4 | 2% | 4 |
| jsal.Jsalbot 1.0 | 3 | 2% | 5 |

## Melee bench: F42

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 76.7 | 63 / 280 | 3.10 | 16.3% | 41796 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.4 | 17.1% | 121 |
| hadur117.micro.SaorFX 0.1 | 1.8 | 16.3% | 63 |
| ara.Shera 0.88 | 3.4 | 12.9% | 44 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.5% | 35 |
| amz.NanoClone 1.41 | 5.4 | 9.2% | 6 |
| maribo.IotaCT 1.1 | 6.0 | 7.8% | 1 |
| dsw.StaticD 1.0 | 6.6 | 7.5% | 9 |
| stelo.MirrorMicro 1.0 | 8.0 | 6.3% | 1 |
| mme.NikeEnhanced 2.0 | 9.3 | 5.0% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 82.5 | 9 / 35 | 5573 |
| 2 | 2 | 65.1 | 77.8 | 8 / 35 | 4724 |
| 3 | 1 | 66.9 | 81.6 | 11 / 35 | 5470 |
| 4 | 3 | 61.4 | 62.9 | 3 / 35 | 5113 |
| 5 | 1 | 67.6 | 84.4 | 13 / 35 | 5348 |
| 6 | 2 | 61.5 | 68.6 | 3 / 35 | 4505 |
| 7 | 2 | 67.4 | 81.6 | 10 / 35 | 5858 |
| 8 | 2 | 64.5 | 74.0 | 6 / 35 | 5205 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 61 | 38% |
| ara.Shera 0.88 | 41 | 49% |
| maribo.mini.MiniQuester 0.1 | 30 | 47% |
| amz.NanoClone 1.41 | 5 | 60% |
| dsw.StaticD 1.0 | 4 | 50% |
| stelo.MirrorMicro 1.0 | 2 | 50% |

Hadur died in 217 of 280 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 111 | 51% | 136 |
| ara.Shera 0.88 | 48 | 22% | 68 |
| maribo.mini.MiniQuester 0.1 | 28 | 13% | 40 |
| amz.NanoClone 1.41 | 13 | 6% | 15 |
| stelo.MirrorMicro 1.0 | 5 | 2% | 5 |
| dsw.StaticD 1.0 | 4 | 2% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 4 | 2% | 5 |
| maribo.IotaCT 1.1 | 2 | 1% | 3 |
| mme.NikeEnhanced 2.0 | 2 | 1% | 2 |

## Melee bench: F43

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 70.6 | 21 / 280 | 3.65 | 13.9% | 30761 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.7% | 223 |
| hadur117.micro.SaorFX 0.1 | 2.0 | 13.9% | 21 |
| brainfade.melee.Dusk 0.44 | 3.5 | 11.8% | 20 |
| wcsv.melee.EngineerMelee 0.1 | 4.0 | 11.4% | 7 |
| dummy.micro.Sparrow 2.5 | 4.6 | 11.0% | 7 |
| Krabb.akim2.Akim2 1.1b | 5.9 | 9.6% | 1 |
| mz.NanoGod 2.02 | 7.5 | 7.9% | 1 |
| jab.DiamondStealer 5 | 7.5 | 7.8% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 70.8 | 4 / 35 | 3959 |
| 2 | 2 | 64.0 | 74.9 | 4 / 35 | 3842 |
| 3 | 2 | 60.6 | 64.4 | 3 / 35 | 3418 |
| 4 | 2 | 64.6 | 75.2 | 4 / 35 | 4330 |
| 5 | 2 | 61.6 | 67.3 | 2 / 35 | 3691 |
| 6 | 2 | 62.3 | 71.1 | 1 / 35 | 3773 |
| 7 | 2 | 62.9 | 69.8 | 3 / 35 | 4088 |
| 8 | 2 | 62.1 | 70.8 | 0 / 35 | 3660 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 81 | 1% |
| brainfade.melee.Dusk 0.44 | 12 | 67% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 83% |
| dummy.micro.Sparrow 2.5 | 5 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |
| jab.DiamondStealer 5 | 1 | 100% |

Hadur died in 260 of 280 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 168 | 65% | 171 |
| brainfade.melee.Dusk 0.44 | 24 | 9% | 29 |
| wcsv.melee.EngineerMelee 0.1 | 20 | 8% | 26 |
| dummy.micro.Sparrow 2.5 | 15 | 6% | 19 |
| mz.NanoGod 2.02 | 13 | 5% | 14 |
| jab.DiamondStealer 5 | 9 | 3% | 9 |
| Krabb.akim2.Akim2 1.1b | 7 | 3% | 7 |
| cvt.Firsty 1.0 | 4 | 2% | 4 |

## Melee bench: F44

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.8 | 119 / 280 | 2.46 | 18.4% | 43762 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 18.4% | 119 |
| stelo.Liblix 0.3.1 | 2.1 | 15.0% | 99 |
| tzu.TheArtOfWar 1.2 | 3.1 | 13.0% | 40 |
| wompi.Quokka 1.6 | 4.3 | 10.3% | 1 |
| jwirde.Gort 2.0 | 5.0 | 9.6% | 15 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 9.2% | 4 |
| disan.Chair 2.2.0 | 7.5 | 7.4% | 2 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.9% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.0 | 5.5% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 82.9 | 14 / 35 | 5715 |
| 2 | 1 | 68.4 | 86.0 | 14 / 35 | 5231 |
| 3 | 1 | 69.6 | 88.3 | 19 / 35 | 5800 |
| 4 | 1 | 67.8 | 84.8 | 16 / 35 | 5210 |
| 5 | 1 | 66.5 | 79.7 | 11 / 35 | 5178 |
| 6 | 1 | 69.3 | 90.2 | 16 / 35 | 5494 |
| 7 | 1 | 66.9 | 78.1 | 13 / 35 | 5650 |
| 8 | 1 | 67.2 | 80.3 | 16 / 35 | 5484 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 95 | 28% |
| tzu.TheArtOfWar 1.2 | 75 | 69% |
| jwirde.Gort 2.0 | 15 | 53% |
| wompi.Quokka 1.6 | 14 | 100% |
| disan.Chair 2.2.0 | 8 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 83% |
| amk.jointstrike.JointStrike 0.2 | 3 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 161 of 280 rounds, at a mean tick of 932. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 91 | 57% | 120 |
| tzu.TheArtOfWar 1.2 | 32 | 20% | 72 |
| jwirde.Gort 2.0 | 14 | 9% | 33 |
| wompi.Quokka 1.6 | 8 | 5% | 23 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 3% | 8 |
| stf.PanzerGeneral 0.1 | 5 | 3% | 7 |
| amk.jointstrike.JointStrike 0.2 | 3 | 2% | 6 |
| disan.Chair 2.2.0 | 2 | 1% | 6 |
| sample.Crazy 1.0 | 1 | 1% | 4 |

## Melee bench: F45

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 83.4 | 117 / 280 | 2.50 | 19.0% | 46014 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorFX 0.1 | 1.0 | 19.0% | 117 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 12.4% | 133 |
| jje.BagPuss 1.2 | 3.6 | 11.4% | 7 |
| myl.nano.Graviton 1.10 | 4.1 | 10.8% | 8 |
| sul.Lunar 1.1 | 4.8 | 10.0% | 5 |
| fm.claire 1.7 | 6.6 | 8.4% | 0 |
| hvilela.HVilela 0.9 | 6.8 | 8.7% | 2 |
| pez.mini.ChironexFleckeri 0.5 | 7.6 | 7.6% | 3 |
| wit.Deep7 2.0 | 8.5 | 6.6% | 5 |
| abud.ThirdRobo 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 78.1 | 13 / 35 | 5832 |
| 2 | 1 | 67.1 | 78.4 | 15 / 35 | 5721 |
| 3 | 1 | 69.1 | 87.6 | 13 / 35 | 5754 |
| 4 | 1 | 66.5 | 77.1 | 15 / 35 | 5296 |
| 5 | 1 | 70.6 | 92.7 | 16 / 35 | 6161 |
| 6 | 1 | 68.3 | 83.8 | 10 / 35 | 5858 |
| 7 | 1 | 69.1 | 84.4 | 19 / 35 | 5701 |
| 8 | 1 | 68.9 | 84.8 | 16 / 35 | 5691 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 137 | 29% |
| myl.nano.Graviton 1.10 | 22 | 95% |
| jje.BagPuss 1.2 | 21 | 76% |
| sul.Lunar 1.1 | 19 | 100% |
| wit.Deep7 2.0 | 10 | 80% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 89% |
| fm.claire 1.7 | 5 | 100% |
| hvilela.HVilela 0.9 | 2 | 0% |

Hadur died in 163 of 280 rounds, at a mean tick of 2083. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 100 | 61% | 0 |
| jje.BagPuss 1.2 | 23 | 14% | 83 |
| myl.nano.Graviton 1.10 | 11 | 7% | 51 |
| hvilela.HVilela 0.9 | 7 | 4% | 15 |
| wit.Deep7 2.0 | 6 | 4% | 21 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 3% | 29 |
| fm.claire 1.7 | 5 | 3% | 15 |
| abud.ThirdRobo 1.0 | 4 | 2% | 10 |
| sul.Lunar 1.1 | 2 | 1% | 52 |

## Melee bench: F46

hadur117.micro.SaorFX 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 68.7 | 24 / 280 | 3.81 | 14.0% | 34386 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.4 | 17.4% | 100 |
| rsalesc.melee.Medina 0.4.5 | 1.6 | 17.3% | 130 |
| hadur117.micro.SaorFX 0.1 | 3.0 | 14.0% | 24 |
| mz.MicroSheep 1.0 | 4.6 | 10.6% | 6 |
| cx.Princess 1.0 | 5.0 | 9.9% | 15 |
| sadoner.killer 0.2 | 5.6 | 9.3% | 4 |
| arthord.NanoSatanMelee Beta | 7.3 | 6.5% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.5 | 6.4% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 66.3 | 2 / 35 | 4037 |
| 2 | 3 | 59.6 | 62.2 | 3 / 35 | 4086 |
| 3 | 3 | 63.1 | 74.3 | 5 / 35 | 4292 |
| 4 | 3 | 62.5 | 69.5 | 4 / 35 | 4579 |
| 5 | 3 | 62.7 | 73.3 | 2 / 35 | 4321 |
| 6 | 3 | 62.7 | 70.8 | 3 / 35 | 4242 |
| 7 | 3 | 62.8 | 68.6 | 3 / 35 | 4691 |
| 8 | 3 | 60.1 | 64.8 | 2 / 35 | 4138 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 37 | 16% |
| rsalesc.melee.Medina 0.4.5 | 26 | 8% |
| cx.Princess 1.0 | 9 | 44% |
| mz.MicroSheep 1.0 | 6 | 100% |
| sadoner.killer 0.2 | 4 | 100% |
| arthord.NanoSatanMelee Beta | 2 | 100% |

Hadur died in 257 of 280 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 107 | 42% | 115 |
| rsalesc.melee.Medina 0.4.5 | 93 | 36% | 98 |
| cx.Princess 1.0 | 29 | 11% | 33 |
| sadoner.killer 0.2 | 9 | 4% | 12 |
| kurios.DOSexe .9a | 7 | 3% | 7 |
| arthord.NanoSatanMelee Beta | 6 | 2% | 6 |
| mz.MicroSheep 1.0 | 3 | 1% | 6 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 1 |

