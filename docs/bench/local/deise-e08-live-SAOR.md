# Bench suite: suite.txt

## Melee bench: F01

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 75.0 | 24 / 210 | 3.25 | 15.0% | 27741 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 151 |
| hadur117.micro.Saor 0.2 | 2.0 | 15.0% | 24 |
| sgp.JollyNinja 3.53 | 3.3 | 11.9% | 17 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 11.2% | 7 |
| lorneswork.Predator 1.0 | 4.8 | 9.9% | 3 |
| mz.MicroGodMelee 1 | 5.3 | 10.3% | 8 |
| adt.Ar2 1.0 | 7.0 | 7.9% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.7% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 74.3 | 4 / 35 | 5028 |
| 2 | 2 | 65.4 | 78.7 | 5 / 35 | 4857 |
| 3 | 2 | 62.9 | 74.0 | 3 / 35 | 4491 |
| 4 | 2 | 62.1 | 72.4 | 4 / 35 | 4080 |
| 5 | 2 | 64.8 | 77.5 | 5 / 35 | 4854 |
| 6 | 2 | 62.6 | 73.0 | 3 / 35 | 4431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 86 | 5% |
| sgp.JollyNinja 3.53 | 16 | 63% |
| mz.MicroGodMelee 1 | 7 | 43% |
| lorneswork.Predator 1.0 | 6 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 33% |
| adt.Ar2 1.0 | 1 | 0% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 187 of 210 rounds, at a mean tick of 806. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 119 | 64% | 127 |
| sgp.JollyNinja 3.53 | 18 | 10% | 23 |
| lorneswork.Predator 1.0 | 17 | 9% | 22 |
| mz.MicroGodMelee 1 | 12 | 6% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 5% | 12 |
| adt.Ar2 1.0 | 5 | 3% | 5 |
| kawigi.sbf.FloodSonnet 0.9 | 4 | 2% | 5 |
| skm.butterfly 1.0 | 1 | 1% | 1 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F02

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 78.7 | 76 / 210 | 2.92 | 17.3% | 31291 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.3% | 76 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 13.5% | 55 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.2% | 40 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.1% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.1% | 10 |
| fnc.bandit.Bandit 5.2.0 | 6.3 | 8.3% | 1 |
| sch.Simone 0.3d | 7.2 | 8.3% | 11 |
| Noran.BitchingElk 0.054 | 7.3 | 7.6% | 13 |
| stelo.PatternRobot 1.0 | 9.0 | 6.3% | 0 |
| fullsail.SweetTea 1.1 | 10.0 | 5.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 83.2 | 16 / 35 | 5581 |
| 2 | 1 | 67.5 | 81.9 | 19 / 35 | 5158 |
| 3 | 1 | 63.1 | 72.4 | 8 / 35 | 4783 |
| 4 | 1 | 63.9 | 72.4 | 11 / 35 | 5025 |
| 5 | 1 | 67.9 | 82.9 | 13 / 35 | 5637 |
| 6 | 1 | 65.6 | 79.4 | 9 / 35 | 5107 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 41 | 32% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 33 | 55% |
| sch.Simone 0.3d | 13 | 62% |
| Noran.BitchingElk 0.054 | 12 | 50% |
| stelo.PatternRobot 1.0 | 11 | 100% |
| com.cohesiva.robocode.ManOwaR 1.0 | 9 | 56% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 100% |
| fullsail.SweetTea 1.1 | 6 | 83% |
| fnc.bandit.Bandit 5.2.0 | 4 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 44 | 33% | 64 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 36 | 27% | 52 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 10% | 20 |
| sch.Simone 0.3d | 13 | 10% | 19 |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 7% | 18 |
| Noran.BitchingElk 0.054 | 7 | 5% | 15 |
| stelo.PatternRobot 1.0 | 6 | 4% | 12 |
| fullsail.SweetTea 1.1 | 5 | 4% | 8 |
| fnc.bandit.Bandit 5.2.0 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 79.5 | 123 / 210 | 2.85 | 18.0% | 34315 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.0% | 123 |
| radnor.DoctorBob 1.42 | 2.0 | 14.2% | 27 |
| vuen.Cake 2.51 | 3.3 | 12.8% | 34 |
| kawigi.nano.Lib 1.0 | 3.8 | 11.8% | 20 |
| urdos.URDOS 1.3 | 4.8 | 10.3% | 5 |
| adt.Ar1 2.1 | 6.2 | 8.0% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 6.8 | 7.2% | 0 |
| oa.weak.FlyMk1 0.1 | 8.5 | 6.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 6.2% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 76.8 | 15 / 35 | 5705 |
| 2 | 1 | 66.7 | 77.1 | 20 / 35 | 5805 |
| 3 | 1 | 70.1 | 88.6 | 26 / 35 | 6202 |
| 4 | 1 | 66.4 | 78.4 | 20 / 35 | 5517 |
| 5 | 1 | 66.7 | 78.1 | 21 / 35 | 5583 |
| 6 | 1 | 66.9 | 77.8 | 21 / 35 | 5503 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 52 | 83% |
| kawigi.nano.Lib 1.0 | 44 | 89% |
| radnor.DoctorBob 1.42 | 38 | 84% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |
| urdos.URDOS 1.3 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 26% | 60 |
| vuen.Cake 2.51 | 18 | 20% | 54 |
| kawigi.nano.Lib 1.0 | 16 | 18% | 48 |
| adt.Ar1 2.1 | 10 | 11% | 13 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 9% | 8 |
| urdos.URDOS 1.3 | 6 | 7% | 9 |
| ghent.ArthurPanzergon 1.0.0 | 6 | 7% | 8 |
| oa.weak.FlyMk1 0.1 | 1 | 1% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 73.6 | 3 / 210 | 3.38 | 15.2% | 32088 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.2% | 196 |
| hadur117.micro.Saor 0.2 | 2.0 | 15.2% | 3 |
| apc.LeeroyJenkins2 1.0 | 3.2 | 13.1% | 7 |
| TNT.TNT 0.99.1 | 4.0 | 10.9% | 1 |
| josago.Jorgito 0.16 | 4.8 | 9.4% | 2 |
| css.Delitioner 0.11 | 6.3 | 6.9% | 1 |
| tj.zombie1n 1.0.1 | 7.0 | 6.4% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.5% | 0 |
| spin.Bugstard 0.012b | 9.3 | 4.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 74.0 | 1 / 35 | 5605 |
| 2 | 2 | 64.1 | 73.7 | 0 / 35 | 5368 |
| 3 | 2 | 64.6 | 71.7 | 1 / 35 | 5628 |
| 4 | 2 | 63.9 | 73.3 | 0 / 35 | 4940 |
| 5 | 2 | 66.0 | 77.8 | 1 / 35 | 5489 |
| 6 | 2 | 64.0 | 71.1 | 0 / 35 | 5058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 81 | 0% |
| apc.LeeroyJenkins2 1.0 | 3 | 33% |
| spin.Bugstard 0.012b | 1 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 0% |

Hadur died in 207 of 210 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 164 | 79% | 165 |
| apc.LeeroyJenkins2 1.0 | 18 | 9% | 19 |
| josago.Jorgito 0.16 | 10 | 5% | 10 |
| rampancy.Durandal 2.1d | 5 | 2% | 5 |
| TNT.TNT 0.99.1 | 4 | 2% | 4 |
| tj.zombie1n 1.0.1 | 3 | 1% | 3 |
| css.Delitioner 0.11 | 3 | 1% | 3 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 1 |

## Melee bench: F05

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 56.7 | 11 / 210 | 4.90 | 12.1% | 24316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.5 | 18.4% | 117 |
| justin.DemonicRage 3.4 | 1.5 | 17.3% | 66 |
| wompi.Numbat 2.1 | 3.2 | 13.0% | 9 |
| hadur117.micro.Saor 0.2 | 3.8 | 12.1% | 11 |
| ms.Ares 0.19 | 5.2 | 9.4% | 4 |
| axeBots.HataMoto 3.09 | 5.8 | 8.7% | 3 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.4% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.7% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.6% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.4 | 58.7 | 1 / 35 | 4015 |
| 2 | 4 | 59.3 | 58.4 | 5 / 35 | 4036 |
| 3 | 3 | 59.0 | 59.4 | 2 / 35 | 4220 |
| 4 | 4 | 57.3 | 55.9 | 1 / 35 | 4062 |
| 5 | 4 | 55.5 | 51.1 | 0 / 35 | 3748 |
| 6 | 4 | 58.6 | 56.8 | 2 / 35 | 4235 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 16 | 19% |
| justin.DemonicRage 3.4 | 15 | 20% |
| wompi.Numbat 2.1 | 6 | 50% |
| axeBots.HataMoto 3.09 | 2 | 100% |
| ms.Ares 0.19 | 2 | 0% |

Hadur died in 199 of 210 rounds, at a mean tick of 609. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 66 | 33% | 70 |
| justin.DemonicRage 3.4 | 46 | 23% | 48 |
| wompi.Numbat 2.1 | 31 | 16% | 34 |
| ms.Ares 0.19 | 16 | 8% | 16 |
| supersample.SuperBoxBot 1.0 | 14 | 7% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 7 | 4% | 7 |
| GarmBox.Oranges 1.0 | 7 | 4% | 7 |
| axeBots.HataMoto 3.09 | 6 | 3% | 8 |
| Queens_teamrobot.UltraRazor 1.0 | 6 | 3% | 6 |

## Melee bench: F06

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 77.2 | 95 / 210 | 3.05 | 16.5% | 26587 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 16.5% | 95 |
| origin.SleepSiphon 1.7b | 2.5 | 13.7% | 61 |
| jekl.StoneGhost 0.7 | 2.5 | 14.3% | 25 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.3 | 11.3% | 9 |
| mld.Wisdom 1.0 | 4.8 | 11.1% | 5 |
| gg.Wolverine 2.0 | 6.0 | 8.7% | 6 |
| spinnercat.Omen 1.0 | 7.2 | 7.3% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 6.7% | 5 |
| DBall.NUKE 0.1 | 8.5 | 6.6% | 2 |
| sample.Fire 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 83.8 | 18 / 35 | 4296 |
| 2 | 1 | 63.2 | 70.2 | 15 / 35 | 4303 |
| 3 | 1 | 66.0 | 81.0 | 15 / 35 | 4344 |
| 4 | 1 | 63.6 | 72.4 | 15 / 35 | 4392 |
| 5 | 1 | 66.0 | 79.4 | 16 / 35 | 4567 |
| 6 | 1 | 65.8 | 76.8 | 16 / 35 | 4685 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 37 | 89% |
| origin.SleepSiphon 1.7b | 35 | 40% |
| pe.minimelee.SandboxMiniMelee 1.1 | 27 | 85% |
| DBall.NUKE 0.1 | 11 | 100% |
| gg.Wolverine 2.0 | 10 | 80% |
| mld.Wisdom 1.0 | 5 | 60% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 36 | 31% | 53 |
| jekl.StoneGhost 0.7 | 23 | 20% | 49 |
| mld.Wisdom 1.0 | 21 | 18% | 30 |
| pe.minimelee.SandboxMiniMelee 1.1 | 14 | 12% | 35 |
| gg.Wolverine 2.0 | 10 | 9% | 20 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 5% | 10 |
| sample.Fire 1.0 | 2 | 2% | 3 |
| spinnercat.Omen 1.0 | 2 | 2% | 2 |
| DBall.NUKE 0.1 | 1 | 1% | 8 |

## Melee bench: F07

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 83.5 | 62 / 210 | 2.49 | 18.4% | 36832 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.5 | 18.4% | 62 |
| rsalesc.melee.Monk 0.3.6c | 1.5 | 18.3% | 72 |
| rtk.Tachikoma 1.0 | 3.0 | 16.4% | 56 |
| franzor.Lizt 1.3.1 | 4.2 | 10.9% | 17 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 9.7% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.9% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.7% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.0% | 0 |
| sample.Target 1.0 | 9.0 | 3.2% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 82.5 | 10 / 35 | 5739 |
| 2 | 2 | 68.8 | 79.7 | 8 / 35 | 6689 |
| 3 | 1 | 70.4 | 87.0 | 13 / 35 | 6247 |
| 4 | 2 | 69.3 | 83.5 | 9 / 35 | 6164 |
| 5 | 1 | 70.1 | 87.9 | 12 / 35 | 6108 |
| 6 | 2 | 68.5 | 80.3 | 10 / 35 | 5885 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 60 | 52% |
| rsalesc.melee.Monk 0.3.6c | 46 | 2% |
| oog.melee.CapuletDroid 1.1 | 17 | 94% |
| franzor.Lizt 1.3.1 | 15 | 60% |
| exauge.GateKeeper 1.1.121g | 5 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 1174. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 72 | 48% | 83 |
| rtk.Tachikoma 1.0 | 54 | 36% | 96 |
| franzor.Lizt 1.3.1 | 9 | 6% | 1 |
| oog.melee.CapuletDroid 1.1 | 8 | 5% | 14 |
| exauge.GateKeeper 1.1.121g | 4 | 3% | 10 |
| lrem.micro.MoggFanatic 0.2 | 2 | 1% | 4 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 77.3 | 89 / 210 | 3.04 | 17.5% | 32701 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.5% | 89 |
| tm.Yuugao 1.0 | 2.0 | 13.3% | 55 |
| shrub.Vapour v159 | 3.3 | 11.9% | 24 |
| com.spp.robocode.MostlyHarmless 010 | 4.0 | 10.8% | 14 |
| Krabb.sliNk.Garm 0.9u | 5.2 | 10.4% | 12 |
| m3thos.Eva00 1.1 | 5.5 | 9.5% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 7.2 | 8.4% | 12 |
| qualidafial.MajorDick 1.0.1 | 7.8 | 7.0% | 0 |
| SHAM.WOW 1.4 | 9.3 | 5.8% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 84.1 | 15 / 35 | 5800 |
| 2 | 1 | 66.7 | 78.1 | 17 / 35 | 5457 |
| 3 | 1 | 64.5 | 74.9 | 8 / 35 | 5210 |
| 4 | 1 | 65.4 | 73.3 | 16 / 35 | 5426 |
| 5 | 1 | 66.4 | 77.1 | 17 / 35 | 5249 |
| 6 | 1 | 66.3 | 76.2 | 16 / 35 | 5559 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 45 | 33% |
| shrub.Vapour v159 | 38 | 71% |
| com.spp.robocode.MostlyHarmless 010 | 15 | 73% |
| Krabb.sliNk.Garm 0.9u | 15 | 93% |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 79% |
| m3thos.Eva00 1.1 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 51 | 42% | 77 |
| shrub.Vapour v159 | 15 | 12% | 32 |
| com.spp.robocode.MostlyHarmless 010 | 11 | 9% | 25 |
| Krabb.sliNk.Garm 0.9u | 10 | 8% | 21 |
| zyx.nano.BacillusComma 1.0 | 10 | 8% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 7% | 19 |
| m3thos.Eva00 1.1 | 8 | 7% | 13 |
| SHAM.WOW 1.4 | 5 | 4% | 7 |
| qualidafial.MajorDick 1.0.1 | 4 | 3% | 5 |

## Melee bench: F09

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 64.1 | 39 / 210 | 4.23 | 13.8% | 24306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.1% | 101 |
| kc.micro.Figment 1.0 | 2.5 | 13.4% | 31 |
| hadur117.micro.Saor 0.2 | 2.7 | 13.8% | 39 |
| pedersen.Grishnakh 1.0 | 4.5 | 11.2% | 20 |
| yagami.Tidus 0.11 | 4.7 | 10.8% | 4 |
| mc2.enemy.Original 0.9 | 5.7 | 9.2% | 12 |
| dft.Calliope 5.6 | 7.0 | 7.7% | 2 |
| step.nanoPri 1.0 | 8.5 | 6.0% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.6% | 0 |
| rdm.Dueler 0.4x | 9.5 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.6 | 55.6 | 6 / 35 | 3841 |
| 2 | 2 | 60.7 | 67.0 | 7 / 35 | 3966 |
| 3 | 4 | 58.3 | 58.1 | 4 / 35 | 3967 |
| 4 | 2 | 62.9 | 71.1 | 9 / 35 | 4201 |
| 5 | 3 | 61.0 | 66.3 | 7 / 35 | 4030 |
| 6 | 2 | 61.6 | 66.7 | 6 / 35 | 4301 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 39 | 28% |
| kc.micro.Figment 1.0 | 30 | 50% |
| pedersen.Grishnakh 1.0 | 8 | 50% |
| yagami.Tidus 0.11 | 5 | 100% |
| mc2.enemy.Original 0.9 | 5 | 40% |
| step.nanoPri 1.0 | 1 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 69 | 40% | 75 |
| kc.micro.Figment 1.0 | 62 | 36% | 79 |
| mc2.enemy.Original 0.9 | 10 | 6% | 11 |
| pedersen.Grishnakh 1.0 | 9 | 5% | 11 |
| yagami.Tidus 0.11 | 8 | 5% | 17 |
| robar.nano.Assertive_Melee 0.2 | 7 | 4% | 8 |
| step.nanoPri 1.0 | 4 | 2% | 5 |
| rdm.Dueler 0.4x | 2 | 1% | 3 |
| dft.Calliope 5.6 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 82.1 | 93 / 210 | 2.61 | 17.6% | 32608 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 17.6% | 93 |
| DTF.Kludgy 1.2b | 1.7 | 16.3% | 74 |
| ne.Chimera 1.2 | 3.5 | 12.3% | 14 |
| ejb.Polaris 1.0.1 | 3.8 | 11.7% | 13 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.3% | 9 |
| vStar.RAFzilla 2.15 | 5.3 | 10.6% | 5 |
| sam.Samspin 1.0 | 7.7 | 5.9% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.6% | 0 |
| kurios.DOSexe .9b | 8.7 | 5.4% | 1 |
| donjezza.Muncho 1.0 | 9.7 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 77.5 | 12 / 35 | 5288 |
| 2 | 1 | 66.7 | 82.2 | 12 / 35 | 5557 |
| 3 | 2 | 66.8 | 78.7 | 15 / 35 | 5589 |
| 4 | 1 | 69.5 | 91.7 | 25 / 35 | 5394 |
| 5 | 1 | 66.5 | 79.7 | 13 / 35 | 5358 |
| 6 | 2 | 67.4 | 82.5 | 16 / 35 | 5422 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 54 | 28% |
| ejb.Polaris 1.0.1 | 29 | 76% |
| ne.Chimera 1.2 | 22 | 64% |
| vStar.RAFzilla 2.15 | 20 | 100% |
| tvv.micro.Antares 1.1.1 | 14 | 93% |
| kurios.DOSexe .9b | 5 | 80% |
| sam.Samspin 1.0 | 3 | 100% |
| donjezza.Muncho 1.0 | 2 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 68 | 58% | 84 |
| ne.Chimera 1.2 | 17 | 15% | 30 |
| ejb.Polaris 1.0.1 | 13 | 11% | 35 |
| kurios.DOSexe .9b | 5 | 4% | 12 |
| tvv.micro.Antares 1.1.1 | 4 | 3% | 12 |
| vStar.RAFzilla 2.15 | 3 | 3% | 24 |
| sam.Samspin 1.0 | 3 | 3% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 3% | 3 |
| donjezza.Muncho 1.0 | 1 | 1% | 3 |

## Melee bench: F11

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 70.2 | 51 / 210 | 3.68 | 15.1% | 26508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 17.2% | 96 |
| hadur117.micro.Saor 0.2 | 1.8 | 15.1% | 51 |
| cx.mini.Nimrod 0.55 | 3.3 | 11.8% | 26 |
| djc.DynaBot 0.1.1 | 3.8 | 10.6% | 6 |
| br2.MobyDickBot 1.6 | 5.3 | 9.1% | 12 |
| rdt199.Warlord 0.73 | 6.0 | 8.9% | 13 |
| uji.YellohFellah 1.0 | 7.0 | 8.3% | 8 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.9% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.8% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 67.0 | 10 / 35 | 4491 |
| 2 | 2 | 63.6 | 74.0 | 6 / 35 | 4706 |
| 3 | 2 | 60.9 | 67.0 | 7 / 35 | 4146 |
| 4 | 1 | 66.0 | 79.4 | 13 / 35 | 4611 |
| 5 | 2 | 61.8 | 69.8 | 9 / 35 | 4030 |
| 6 | 2 | 61.3 | 64.1 | 6 / 35 | 4524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 51 | 16% |
| cx.mini.Nimrod 0.55 | 17 | 71% |
| rdt199.Warlord 0.73 | 11 | 91% |
| uji.YellohFellah 1.0 | 10 | 90% |
| br2.MobyDickBot 1.6 | 9 | 67% |
| djc.DynaBot 0.1.1 | 6 | 83% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 770. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 88 | 55% | 99 |
| cx.mini.Nimrod 0.55 | 19 | 12% | 30 |
| KiraNL.Chupacabra 0.4 | 14 | 9% | 17 |
| rdt199.Warlord 0.73 | 8 | 5% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 5% | 8 |
| uji.YellohFellah 1.0 | 7 | 4% | 19 |
| br2.MobyDickBot 1.6 | 7 | 4% | 10 |
| djc.DynaBot 0.1.1 | 4 | 3% | 7 |
| stelo.MirrorNano 1.3 | 4 | 3% | 4 |

## Melee bench: F12

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 76.5 | 96 / 210 | 3.11 | 16.3% | 23269 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 16.3% | 96 |
| bts.wiki.RipCurl 0.9b | 2.2 | 14.1% | 43 |
| darkcanuck.Leon 1.01 | 3.3 | 13.0% | 25 |
| nat.PallasHawk 1.0 | 3.5 | 12.3% | 30 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.5% | 11 |
| jrm.Test0 1.0 | 6.3 | 8.3% | 1 |
| jp.Perpy 16.0 | 7.2 | 7.5% | 1 |
| cs.sheldor.Talon 1.1 | 7.5 | 7.1% | 1 |
| stuff.Vlad 0.1 | 9.3 | 5.7% | 0 |
| jaybot.bots.Oddball 4.0 | 9.7 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 76.8 | 17 / 35 | 3662 |
| 2 | 1 | 66.1 | 80.3 | 20 / 35 | 3929 |
| 3 | 2 | 61.3 | 68.9 | 9 / 35 | 3673 |
| 4 | 1 | 64.8 | 77.5 | 15 / 35 | 3845 |
| 5 | 1 | 63.9 | 73.0 | 13 / 35 | 3997 |
| 6 | 1 | 66.7 | 82.5 | 22 / 35 | 4163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 36 | 72% |
| darkcanuck.Leon 1.01 | 29 | 86% |
| bts.wiki.RipCurl 0.9b | 28 | 68% |
| brainfade.melee.Genghis 0.36 | 11 | 91% |
| jaybot.bots.Oddball 4.0 | 8 | 88% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| jrm.Test0 1.0 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 612. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 35 | 30% | 56 |
| darkcanuck.Leon 1.01 | 24 | 21% | 54 |
| nat.PallasHawk 1.0 | 22 | 19% | 50 |
| brainfade.melee.Genghis 0.36 | 14 | 12% | 17 |
| jrm.Test0 1.0 | 6 | 5% | 8 |
| cs.sheldor.Talon 1.1 | 5 | 4% | 7 |
| jp.Perpy 16.0 | 5 | 4% | 6 |
| jaybot.bots.Oddball 4.0 | 3 | 3% | 8 |
| stuff.Vlad 0.1 | 2 | 2% | 4 |

## Melee bench: F13

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 67.3 | 12 / 210 | 3.94 | 13.3% | 24557 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 16.8% | 94 |
| ags.Glacier 0.2.11 | 1.5 | 17.0% | 59 |
| hadur117.micro.Saor 0.2 | 3.3 | 13.3% | 12 |
| gh.micro.Gruweltje 0.7 | 4.2 | 12.3% | 20 |
| shinh.Entangled 0.3 | 4.5 | 12.4% | 23 |
| apc.Colossus2 0.17 | 6.2 | 7.8% | 1 |
| stelo.Wang 1.0 | 7.2 | 6.5% | 1 |
| ayk.WallHugger 1.0 | 8.2 | 5.5% | 0 |
| maribo.FollowFire 1 | 8.5 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 66.3 | 2 / 35 | 4359 |
| 2 | 4 | 59.8 | 66.0 | 3 / 35 | 3924 |
| 3 | 3 | 60.9 | 69.2 | 2 / 35 | 3890 |
| 4 | 3 | 61.6 | 70.8 | 1 / 35 | 4312 |
| 5 | 3 | 60.0 | 63.8 | 2 / 35 | 4165 |
| 6 | 4 | 60.5 | 67.6 | 2 / 35 | 3907 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 24 | 8% |
| ags.Glacier 0.2.11 | 22 | 9% |
| gh.micro.Gruweltje 0.7 | 9 | 33% |
| shinh.Entangled 0.3 | 9 | 33% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 198 of 210 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 83 | 42% | 85 |
| mn.Combat 3.25.0 | 49 | 25% | 51 |
| shinh.Entangled 0.3 | 23 | 12% | 26 |
| gh.micro.Gruweltje 0.7 | 20 | 10% | 23 |
| maribo.FollowFire 1 | 10 | 5% | 10 |
| stelo.Wang 1.0 | 6 | 3% | 8 |
| apc.Colossus2 0.17 | 5 | 3% | 5 |
| ayk.WallHugger 1.0 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 72.9 | 111 / 210 | 3.44 | 16.6% | 30523 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 16.6% | 111 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.4% | 27 |
| catcat20.shape.Theta 0.018 | 2.8 | 13.2% | 45 |
| Lo_Ian.Gandalf_V4 4.0 | 5.2 | 9.8% | 3 |
| co.edu.usb.rc.LidisTron 1.0 | 5.7 | 9.7% | 4 |
| sanyi.mikrobi.Roberto 1.0 | 5.7 | 9.7% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.3% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 8.1% | 8 |
| pa.Improved 1.0 | 9.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 67.3 | 17 / 35 | 5209 |
| 2 | 1 | 65.9 | 76.2 | 19 / 35 | 5174 |
| 3 | 1 | 64.6 | 69.8 | 19 / 35 | 5086 |
| 4 | 1 | 64.7 | 70.5 | 16 / 35 | 5210 |
| 5 | 1 | 64.9 | 74.3 | 17 / 35 | 4591 |
| 6 | 1 | 67.5 | 79.4 | 23 / 35 | 5253 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 67 | 93% |
| catcat20.shape.Theta 0.018 | 40 | 48% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 89% |
| sanyi.mikrobi.Roberto 1.0 | 8 | 88% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 45 | 45% | 106 |
| catcat20.shape.Theta 0.018 | 26 | 26% | 42 |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 9% | 12 |
| sanyi.mikrobi.Roberto 1.0 | 6 | 6% | 17 |
| pa.Improved 1.0 | 4 | 4% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 4% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 3% | 12 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |

## Melee bench: F15

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 83.8 | 113 / 210 | 2.46 | 19.0% | 34596 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.0% | 113 |
| kawigi.micro.Shiz 1.1 | 2.0 | 13.8% | 20 |
| emp.Yngwie 1.11 | 3.3 | 12.7% | 46 |
| mld.DustBunny 3.8 | 3.7 | 12.1% | 7 |
| kawigi.robot.Girl 1.2 | 5.3 | 9.4% | 15 |
| cb.nano.Insomnia 1.0 | 5.8 | 8.9% | 7 |
| lambdaxy.TBot 0.1 | 7.5 | 6.8% | 0 |
| Grystrion.TrackerWO 1.0 | 7.5 | 7.1% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.7% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 78.7 | 17 / 35 | 5623 |
| 2 | 1 | 70.9 | 90.2 | 22 / 35 | 6102 |
| 3 | 1 | 71.3 | 92.7 | 23 / 35 | 6259 |
| 4 | 1 | 66.6 | 79.0 | 15 / 35 | 5160 |
| 5 | 1 | 68.2 | 81.9 | 15 / 35 | 5913 |
| 6 | 1 | 67.9 | 80.3 | 21 / 35 | 5539 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 42 | 55% |
| kawigi.micro.Shiz 1.1 | 41 | 93% |
| kawigi.robot.Girl 1.2 | 21 | 86% |
| mld.DustBunny 3.8 | 20 | 90% |
| cb.nano.Insomnia 1.0 | 13 | 77% |
| divineomega.TrialBot 0.003 | 5 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 39 | 40% | 78 |
| mld.DustBunny 3.8 | 16 | 16% | 36 |
| kawigi.robot.Girl 1.2 | 12 | 12% | 22 |
| kawigi.micro.Shiz 1.1 | 9 | 9% | 41 |
| cb.nano.Insomnia 1.0 | 9 | 9% | 7 |
| Grystrion.TrackerWO 1.0 | 4 | 4% | 6 |
| divineomega.TrialBot 0.003 | 3 | 3% | 12 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 3 | 3% | 4 |
| lambdaxy.TBot 0.1 | 2 | 2% | 4 |

## Melee bench: F16

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 82.5 | 74 / 210 | 2.58 | 18.3% | 33906 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 18.3% | 74 |
| gh.Griezel 0.5.2 | 1.7 | 17.2% | 97 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.9% | 7 |
| techdude.forest.FlamingForest 1.1 | 4.7 | 10.1% | 23 |
| tvv.nano.Polaris 1.2 | 5.0 | 9.2% | 5 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 8.8% | 1 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 6.7% | 2 |
| repositorio.NanoStep 1.0 | 8.5 | 5.5% | 0 |
| asd.Cthulhu 1.3 | 8.8 | 5.4% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.5 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 86.7 | 20 / 35 | 5891 |
| 2 | 2 | 64.9 | 74.0 | 9 / 35 | 5122 |
| 3 | 1 | 68.8 | 82.9 | 12 / 35 | 6139 |
| 4 | 1 | 68.9 | 85.4 | 13 / 35 | 5725 |
| 5 | 1 | 69.4 | 88.3 | 11 / 35 | 5821 |
| 6 | 2 | 66.3 | 77.8 | 9 / 35 | 5208 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 81 | 17% |
| techdude.forest.FlamingForest 1.1 | 24 | 58% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 22 | 100% |
| bvh.fnr.Fenrir 0.36l | 7 | 100% |
| tvv.nano.Polaris 1.2 | 6 | 100% |
| divineomega.DivineBot 1.9.4.5 | 5 | 100% |
| stelo.IntrinsicVolatility 1.4 | 3 | 100% |
| asd.Cthulhu 1.3 | 2 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 1441. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 90 | 66% | 109 |
| techdude.forest.FlamingForest 1.1 | 17 | 13% | 34 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 11 | 8% | 31 |
| tvv.nano.Polaris 1.2 | 5 | 4% | 9 |
| bvh.fnr.Fenrir 0.36l | 5 | 4% | 8 |
| stelo.IntrinsicVolatility 1.4 | 3 | 2% | 9 |
| divineomega.DivineBot 1.9.4.5 | 3 | 2% | 7 |
| asd.Cthulhu 1.3 | 1 | 1% | 2 |
| repositorio.NanoStep 1.0 | 1 | 1% | 1 |

## Melee bench: F17

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.3 | 98 / 210 | 2.69 | 17.8% | 30309 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.8% | 98 |
| oog.melee.Mercutio 1.0 | 2.8 | 12.8% | 32 |
| et.Predator 1.8 | 3.3 | 12.6% | 19 |
| cx.BlestPain 1.41 | 4.0 | 12.0% | 40 |
| nic.Nicator 2.4 | 4.8 | 10.9% | 12 |
| ahf.NanoAndrew .4 | 5.5 | 10.3% | 9 |
| maribo.melee.BMV 0.1 | 6.5 | 9.0% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.8% | 0 |
| tex.Longbot 0.4 | 8.5 | 5.9% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 84.1 | 16 / 35 | 5414 |
| 2 | 1 | 69.0 | 86.3 | 20 / 35 | 5319 |
| 3 | 1 | 66.5 | 78.4 | 16 / 35 | 5035 |
| 4 | 1 | 66.9 | 78.4 | 16 / 35 | 5178 |
| 5 | 1 | 65.9 | 80.0 | 11 / 35 | 4585 |
| 6 | 1 | 67.2 | 80.3 | 19 / 35 | 4778 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 40 | 70% |
| et.Predator 1.8 | 36 | 89% |
| cx.BlestPain 1.41 | 33 | 30% |
| nic.Nicator 2.4 | 23 | 70% |
| ahf.NanoAndrew .4 | 10 | 80% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |
| maribo.melee.BMV 0.1 | 2 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1083. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 35 | 31% | 46 |
| oog.melee.Mercutio 1.0 | 23 | 21% | 51 |
| et.Predator 1.8 | 16 | 14% | 41 |
| ahf.NanoAndrew .4 | 15 | 13% | 27 |
| nic.Nicator 2.4 | 13 | 12% | 26 |
| maribo.melee.BMV 0.1 | 5 | 4% | 9 |
| goblin.Bender 2.4 | 2 | 2% | 3 |
| tex.Longbot 0.4 | 2 | 2% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 5 |

## Melee bench: F18

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.4 | 113 / 210 | 2.49 | 18.2% | 28840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.2% | 113 |
| morbid.MorbidPriest 1.0 | 2.5 | 13.3% | 27 |
| agd.Mooserwirt2 2.7 | 2.7 | 12.0% | 27 |
| ratosh.Nobo 0.21 | 4.8 | 10.3% | 6 |
| spinnercat.Robovirus 2.718 | 5.0 | 10.0% | 10 |
| uji.DBH 1.1 | 5.2 | 10.2% | 12 |
| sigterm.Sigterm 1.0 | 7.0 | 7.9% | 4 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.1% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.3 | 5.5% | 0 |
| stelo.WangRobot 1.0 | 9.7 | 5.4% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 79.0 | 18 / 35 | 4462 |
| 2 | 1 | 70.1 | 93.3 | 21 / 35 | 5225 |
| 3 | 1 | 67.1 | 83.5 | 17 / 35 | 4711 |
| 4 | 1 | 66.0 | 79.7 | 18 / 35 | 4740 |
| 5 | 1 | 68.0 | 82.9 | 21 / 35 | 5089 |
| 6 | 1 | 66.9 | 82.2 | 18 / 35 | 4613 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 47 | 83% |
| agd.Mooserwirt2 2.7 | 26 | 42% |
| uji.DBH 1.1 | 19 | 79% |
| spinnercat.Robovirus 2.718 | 17 | 82% |
| sigterm.Sigterm 1.0 | 16 | 94% |
| stelo.WangRobot 1.0 | 12 | 75% |
| ratosh.Nobo 0.21 | 8 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 50% |

Hadur died in 98 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 27 | 28% | 71 |
| agd.Mooserwirt2 2.7 | 24 | 24% | 44 |
| uji.DBH 1.1 | 11 | 11% | 18 |
| spinnercat.Robovirus 2.718 | 8 | 8% | 17 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 8% | 12 |
| ratosh.Nobo 0.21 | 7 | 7% | 18 |
| stelo.WangRobot 1.0 | 5 | 5% | 10 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 5 | 5% | 8 |
| sigterm.Sigterm 1.0 | 3 | 3% | 12 |

## Melee bench: F19

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 92.5 | 168 / 210 | 1.67 | 20.9% | 34466 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 20.9% | 168 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 14.6% | 21 |
| mld.Infinity 2.2 | 2.8 | 13.4% | 11 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.5% | 6 |
| erdnis.Rover 0.3 | 5.0 | 10.0% | 1 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.4% | 2 |
| mbh.Mbh 0.1 | 7.2 | 7.3% | 2 |
| pac.ABC 2.1 | 7.8 | 6.9% | 1 |
| pbg.R2D2 1.0 | 8.8 | 5.8% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.3 | 29 / 35 | 5329 |
| 2 | 1 | 72.1 | 93.0 | 30 / 35 | 5985 |
| 3 | 1 | 72.0 | 91.7 | 26 / 35 | 6011 |
| 4 | 1 | 70.6 | 89.8 | 26 / 35 | 5363 |
| 5 | 1 | 72.4 | 94.0 | 29 / 35 | 5909 |
| 6 | 1 | 71.7 | 93.3 | 28 / 35 | 5869 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 86 | 94% |
| mld.Infinity 2.2 | 60 | 93% |
| krillr.mini.JointStrike 2.0.0 | 12 | 92% |
| erdnis.Rover 0.3 | 9 | 100% |
| patson.PatsonTestBot 1.0 | 6 | 100% |
| pac.ABC 2.1 | 3 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 10 | 23% | 95 |
| mld.Infinity 2.2 | 9 | 20% | 24 |
| krillr.mini.JointStrike 2.0.0 | 9 | 20% | 23 |
| pbg.R2D2 1.0 | 5 | 11% | 15 |
| mbh.Mbh 0.1 | 5 | 11% | 7 |
| erdnis.Rover 0.3 | 4 | 9% | 28 |
| pac.ABC 2.1 | 1 | 2% | 5 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 7 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.2 | 111 / 210 | 2.15 | 19.4% | 34356 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.4% | 111 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.4% | 48 |
| fwb.Nine 1.0.1 | 3.5 | 11.3% | 27 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 11.0% | 7 |
| catcat20.Rabbit 0.001 | 4.7 | 9.9% | 14 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 8.1% | 0 |
| bayen.nut.Squirrel 1.615 | 7.2 | 7.4% | 3 |
| djdjdj.NanoSkunk10 1.0 | 7.5 | 7.6% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 94.0 | 21 / 35 | 5972 |
| 2 | 1 | 69.7 | 90.8 | 18 / 35 | 5724 |
| 3 | 1 | 67.9 | 81.0 | 20 / 35 | 5574 |
| 4 | 1 | 68.7 | 85.4 | 18 / 35 | 5715 |
| 5 | 1 | 69.4 | 87.3 | 16 / 35 | 5607 |
| 6 | 1 | 69.1 | 84.8 | 18 / 35 | 5764 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 80 | 59% |
| fwb.Nine 1.0.1 | 36 | 58% |
| catcat20.Rabbit 0.001 | 25 | 60% |
| nz.jdc.nano.GridFu 1.0 | 16 | 81% |
| djdjdj.NanoSkunk10 1.0 | 6 | 100% |
| bayen.nut.Squirrel 1.615 | 5 | 80% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1175. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 55 | 56% | 95 |
| fwb.Nine 1.0.1 | 18 | 18% | 14 |
| catcat20.Rabbit 0.001 | 15 | 15% | 33 |
| nz.jdc.nano.GridFu 1.0 | 8 | 8% | 30 |
| bayen.nut.Squirrel 1.615 | 1 | 1% | 12 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 10 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |

## Melee bench: F21

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 85.5 | 106 / 210 | 2.30 | 19.2% | 34380 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.2% | 106 |
| eem.EvBot v4.6.16 | 2.0 | 16.6% | 86 |
| dummy.mini.Scimitar 1.01 | 3.2 | 13.5% | 8 |
| cf.RiO.RiOx 4.2.1 | 3.8 | 11.8% | 4 |
| eld.Hmm 1.0 | 5.5 | 8.2% | 5 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.8% | 2 |
| fire219.CatBot 1.0 | 7.2 | 6.5% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.0% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 91.4 | 21 / 35 | 5512 |
| 2 | 1 | 69.1 | 83.8 | 14 / 35 | 5867 |
| 3 | 1 | 67.4 | 79.4 | 15 / 35 | 5282 |
| 4 | 1 | 67.4 | 78.4 | 18 / 35 | 5364 |
| 5 | 1 | 71.4 | 89.8 | 21 / 35 | 6355 |
| 6 | 1 | 70.5 | 90.2 | 17 / 35 | 6000 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 100 | 47% |
| dummy.mini.Scimitar 1.01 | 30 | 93% |
| cf.RiO.RiOx 4.2.1 | 20 | 95% |
| eld.Hmm 1.0 | 11 | 73% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 1240. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 65 | 62% | 93 |
| dummy.mini.Scimitar 1.01 | 10 | 10% | 52 |
| eld.Hmm 1.0 | 6 | 6% | 22 |
| cf.RiO.RiOx 4.2.1 | 6 | 6% | 21 |
| fire219.CatBot 1.0 | 6 | 6% | 6 |
| oa.weak.BotherBot 0.1 | 5 | 5% | 9 |
| PSW.Relentless 0.1 | 5 | 5% | 5 |
| el.JumpShoot 0.2 | 2 | 2% | 2 |

## Melee bench: F22

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.5 | 78 / 210 | 2.40 | 17.8% | 30506 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.8% | 78 |
| pe.SandboxDT 2.71m | 2.2 | 16.0% | 62 |
| kvk.HebusLeTroll 0.35 | 2.8 | 14.7% | 44 |
| jlm.javaDisturbance 0.59 | 4.2 | 12.7% | 24 |
| bigpete.Stewie 1.0 | 4.8 | 10.8% | 2 |
| gg.Squaraus 0.6 | 6.7 | 6.8% | 0 |
| yk.JahRoslav 1.1 | 7.3 | 6.6% | 0 |
| tad.Dalek98 0.98 | 7.5 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 8.5 | 5.4% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 80.0 | 7 / 35 | 4675 |
| 2 | 1 | 68.1 | 85.4 | 13 / 35 | 4940 |
| 3 | 1 | 68.4 | 87.0 | 13 / 35 | 5138 |
| 4 | 1 | 67.0 | 79.4 | 14 / 35 | 5092 |
| 5 | 1 | 68.7 | 85.1 | 17 / 35 | 5484 |
| 6 | 1 | 69.0 | 90.2 | 14 / 35 | 5177 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 53 | 51% |
| pe.SandboxDT 2.71m | 49 | 37% |
| jlm.javaDisturbance 0.59 | 33 | 58% |
| bigpete.Stewie 1.0 | 6 | 100% |
| tad.Dalek98 0.98 | 2 | 100% |
| yk.JahRoslav 1.1 | 2 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 2 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |
| gg.Squaraus 0.6 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 1016. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kvk.HebusLeTroll 0.35 | 49 | 37% | 68 |
| pe.SandboxDT 2.71m | 45 | 34% | 75 |
| jlm.javaDisturbance 0.59 | 21 | 16% | 38 |
| bigpete.Stewie 1.0 | 5 | 4% | 11 |
| pbg.NinjaX 1.2 | 5 | 4% | 7 |
| tad.Dalek98 0.98 | 4 | 3% | 5 |
| gg.Squaraus 0.6 | 3 | 2% | 4 |
| yk.JahRoslav 1.1 | 0 | 0% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 85.2 | 101 / 210 | 2.33 | 19.5% | 36336 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.5% | 101 |
| pe.SandboxLump 1.52 | 2.0 | 17.3% | 72 |
| cre.Karolos 0.32 | 3.0 | 13.4% | 19 |
| stelo.AreaTargetingBot 1.1 | 5.0 | 9.6% | 3 |
| stelo.RamTrackSurfer 1.2 | 5.0 | 9.7% | 11 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.2 | 9.6% | 3 |
| cw.megas.Blade 0.8 | 6.8 | 8.1% | 0 |
| sample.Walls 1.0 | 8.0 | 7.2% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.7% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 85.4 | 17 / 35 | 6175 |
| 2 | 1 | 71.0 | 87.6 | 22 / 35 | 6360 |
| 3 | 1 | 71.0 | 85.1 | 19 / 35 | 6459 |
| 4 | 1 | 70.2 | 85.4 | 15 / 35 | 6230 |
| 5 | 1 | 68.4 | 80.0 | 12 / 35 | 5595 |
| 6 | 1 | 70.3 | 87.9 | 16 / 35 | 5517 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 90 | 50% |
| cre.Karolos 0.32 | 36 | 78% |
| stelo.AreaTargetingBot 1.1 | 16 | 94% |
| stelo.RamTrackSurfer 1.2 | 9 | 89% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 80% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 61 | 55% | 106 |
| cre.Karolos 0.32 | 23 | 21% | 50 |
| stelo.AreaTargetingBot 1.1 | 8 | 7% | 18 |
| sample.Walls 1.0 | 5 | 5% | 8 |
| cw.megas.Blade 0.8 | 5 | 5% | 8 |
| stelo.RamTrackSurfer 1.2 | 4 | 4% | 11 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 3% | 5 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 2 |

## Melee bench: F24

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 70.3 | 39 / 210 | 3.68 | 14.4% | 23800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 2.0 | 14.0% | 49 |
| hadur117.micro.Saor 0.2 | 2.3 | 14.4% | 39 |
| rz.GlowBlowMelee 1.4 | 3.0 | 13.7% | 38 |
| davidalves.Phoenix 0.54 | 3.5 | 13.1% | 44 |
| pedersen.Ugluk 1.1.1 | 4.2 | 11.8% | 26 |
| oog.melee.Corsair 1.0 | 6.0 | 9.6% | 3 |
| lunchie.Lunchbox 0.93 | 7.7 | 6.3% | 0 |
| stelo.SoJNanoMelee 1.1 | 7.7 | 6.8% | 10 |
| as.FrankTheTank 1.3 | 8.8 | 5.2% | 1 |
| evd.X1 0.01 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 70.5 | 5 / 35 | 4143 |
| 2 | 4 | 59.5 | 64.8 | 6 / 35 | 3869 |
| 3 | 1 | 63.2 | 75.2 | 12 / 35 | 3572 |
| 4 | 5 | 59.6 | 62.5 | 5 / 35 | 3906 |
| 5 | 1 | 63.3 | 77.5 | 3 / 35 | 4235 |
| 6 | 1 | 62.3 | 71.1 | 8 / 35 | 4075 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 27 | 22% |
| rz.GlowBlowMelee 1.4 | 25 | 60% |
| davidalves.Phoenix 0.54 | 18 | 17% |
| pedersen.Ugluk 1.1.1 | 12 | 50% |
| stelo.SoJNanoMelee 1.1 | 8 | 88% |
| oog.melee.Corsair 1.0 | 3 | 67% |

Hadur died in 172 of 210 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 56 | 33% | 63 |
| davidalves.Phoenix 0.54 | 37 | 22% | 45 |
| rz.GlowBlowMelee 1.4 | 31 | 18% | 42 |
| pedersen.Ugluk 1.1.1 | 18 | 10% | 21 |
| oog.melee.Corsair 1.0 | 12 | 7% | 16 |
| stelo.SoJNanoMelee 1.1 | 9 | 5% | 9 |
| evd.X1 0.01 | 6 | 3% | 7 |
| as.FrankTheTank 1.3 | 2 | 1% | 4 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 2 |

## Melee bench: F25

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.7 | 141 / 210 | 2.20 | 18.9% | 26388 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.9% | 141 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 13.3% | 21 |
| voidious.micro.BlitzBat 1.05 | 3.2 | 12.4% | 11 |
| jdw.Hurricane 1.4 | 3.7 | 11.7% | 22 |
| ds.Oo 2.2 | 5.5 | 9.1% | 6 |
| gre.svman4.Morfeas 1.4.1 | 5.8 | 9.0% | 4 |
| awesomeness.Elite 1.0 | 7.5 | 7.2% | 2 |
| gjr.Cephalosporin 0.1 | 7.7 | 7.4% | 2 |
| adt.Ar2 1.1 | 8.5 | 6.7% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 83.5 | 21 / 35 | 4269 |
| 2 | 1 | 67.9 | 85.7 | 23 / 35 | 4195 |
| 3 | 1 | 68.9 | 87.9 | 22 / 35 | 4450 |
| 4 | 1 | 68.7 | 89.2 | 24 / 35 | 4396 |
| 5 | 1 | 70.5 | 91.4 | 28 / 35 | 4935 |
| 6 | 1 | 67.3 | 82.5 | 23 / 35 | 4143 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 46 | 96% |
| voidious.mini.BrokenSword 2.0.3 | 42 | 83% |
| jdw.Hurricane 1.4 | 27 | 89% |
| ds.Oo 2.2 | 10 | 80% |
| adt.Ar2 1.1 | 8 | 100% |
| gjr.Cephalosporin 0.1 | 8 | 100% |
| gre.svman4.Morfeas 1.4.1 | 7 | 100% |
| awesomeness.Elite 1.0 | 5 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 558. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 25 | 36% | 61 |
| jdw.Hurricane 1.4 | 15 | 21% | 34 |
| voidious.micro.BlitzBat 1.05 | 10 | 14% | 49 |
| ds.Oo 2.2 | 6 | 9% | 24 |
| awesomeness.Elite 1.0 | 5 | 7% | 9 |
| gre.svman4.Morfeas 1.4.1 | 3 | 4% | 10 |
| adt.Ar2 1.1 | 3 | 4% | 9 |
| amk.ChumbaMini 0.2 | 3 | 4% | 3 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 11 |

## Melee bench: F26

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.1 | 90 / 210 | 2.43 | 17.9% | 32038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.9% | 90 |
| ak.Fermat 2.0 | 2.0 | 15.6% | 56 |
| shu.nitro.LENIN .T34 | 3.7 | 12.0% | 31 |
| lrem.Spectre 0.4.4 | 4.0 | 12.0% | 16 |
| js.PinBall 1.6 | 4.7 | 11.0% | 10 |
| gh.mini.GrubbmOne 1.0 | 5.8 | 9.8% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 7.0 | 8.6% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.5% | 2 |
| sample.SpinBot 1.0 | 9.0 | 5.0% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 83.2 | 13 / 35 | 5166 |
| 2 | 1 | 66.7 | 80.6 | 9 / 35 | 5213 |
| 3 | 1 | 67.8 | 82.2 | 16 / 35 | 5416 |
| 4 | 1 | 66.4 | 79.0 | 16 / 35 | 5190 |
| 5 | 1 | 69.2 | 88.9 | 16 / 35 | 5423 |
| 6 | 1 | 69.8 | 90.5 | 20 / 35 | 5630 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 50 | 38% |
| shu.nitro.LENIN .T34 | 47 | 53% |
| lrem.Spectre 0.4.4 | 32 | 78% |
| js.PinBall 1.6 | 10 | 80% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 100% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 58 | 48% | 81 |
| shu.nitro.LENIN .T34 | 30 | 25% | 59 |
| lrem.Spectre 0.4.4 | 12 | 10% | 25 |
| js.PinBall 1.6 | 9 | 7% | 19 |
| sample.SpinBot 1.0 | 5 | 4% | 5 |
| jaybot.adv.bots.JayBot 2.0 | 3 | 2% | 9 |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 2% | 6 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 6 |

## Melee bench: F27

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 73.5 | 107 / 210 | 3.39 | 16.8% | 28561 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.5 | 16.8% | 107 |
| mk.Alpha 0.2.1 | 2.2 | 14.0% | 51 |
| wee.Gem 1.8.4 | 3.7 | 11.4% | 22 |
| EH.Eagle 1.0.6 | 4.0 | 11.0% | 8 |
| sheldor.melee.nano.TestMelee 0.1 | 4.0 | 11.0% | 19 |
| techdude.kombat.FlamingKombat 1.5 | 6.8 | 8.5% | 0 |
| joe.ADinosaur 1.0 | 6.8 | 8.4% | 3 |
| throxbot.ThroxBot 0.1 | 7.3 | 8.2% | 2 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.8% | 1 |
| cs.Grudge 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 88.3 | 23 / 35 | 4436 |
| 2 | 1 | 65.8 | 76.2 | 20 / 35 | 4795 |
| 3 | 3 | 55.4 | 42.5 | 5 / 35 | 4215 |
| 4 | 2 | 62.3 | 59.4 | 10 / 35 | 4824 |
| 5 | 1 | 67.9 | 83.2 | 22 / 35 | 5021 |
| 6 | 1 | 70.3 | 91.4 | 27 / 35 | 5270 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 50 | 70% |
| EH.Eagle 1.0.6 | 25 | 100% |
| wee.Gem 1.8.4 | 19 | 84% |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 100% |
| throxbot.ThroxBot 0.1 | 7 | 86% |
| techdude.kombat.FlamingKombat 1.5 | 5 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 548. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 35 | 34% | 68 |
| wee.Gem 1.8.4 | 16 | 15% | 34 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 12% | 27 |
| cs.Grudge 1.0 | 10 | 10% | 8 |
| throxbot.ThroxBot 0.1 | 9 | 9% | 19 |
| joe.ADinosaur 1.0 | 9 | 9% | 12 |
| EH.Eagle 1.0.6 | 6 | 6% | 28 |
| techdude.kombat.FlamingKombat 1.5 | 5 | 5% | 10 |
| caimano.Furia_Ceca 0.22 | 1 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 83.5 | 121 / 210 | 2.48 | 17.8% | 25094 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.8% | 121 |
| kid.test.NightFox .2 | 2.0 | 14.4% | 36 |
| uji.Antique 1.0 | 3.2 | 11.7% | 24 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.7% | 13 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.3% | 3 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.2% | 6 |
| amk.ChumbaWumba 0.3 | 7.0 | 8.1% | 4 |
| matt.advanced.Katana 1.0 | 7.8 | 6.9% | 1 |
| stelo.Lifestealer 1.0 | 9.0 | 5.9% | 0 |
| stelo.PianistNano 1.2 | 9.5 | 5.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 84.1 | 19 / 35 | 3570 |
| 2 | 1 | 65.1 | 79.4 | 15 / 35 | 4003 |
| 3 | 1 | 67.5 | 83.5 | 24 / 35 | 4353 |
| 4 | 1 | 66.2 | 80.0 | 19 / 35 | 4458 |
| 5 | 1 | 66.9 | 86.0 | 20 / 35 | 4039 |
| 6 | 1 | 69.1 | 88.3 | 24 / 35 | 4671 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 65 | 78% |
| uji.Antique 1.0 | 33 | 91% |
| qohnil.blot.BlotBot 3.61 | 17 | 65% |
| pfvicm.Sobieski 7.2.3b | 10 | 100% |
| ahr.ice.Ice 1.0.2 | 8 | 88% |
| matt.advanced.Katana 1.0 | 6 | 100% |
| amk.ChumbaWumba 0.3 | 5 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 618. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 22 | 24% | 65 |
| uji.Antique 1.0 | 15 | 17% | 49 |
| qohnil.blot.BlotBot 3.61 | 14 | 16% | 26 |
| amk.ChumbaWumba 0.3 | 14 | 16% | 15 |
| pfvicm.Sobieski 7.2.3b | 9 | 10% | 20 |
| ahr.ice.Ice 1.0.2 | 6 | 7% | 11 |
| stelo.Lifestealer 1.0 | 6 | 7% | 8 |
| stelo.PianistNano 1.2 | 4 | 4% | 6 |
| matt.advanced.Katana 1.0 | 0 | 0% | 9 |

## Melee bench: F29

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 76.0 | 62 / 210 | 3.16 | 16.5% | 27161 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.5 | 16.5% | 62 |
| zyx.mega.YersiniaPestis 3.1 | 1.7 | 16.0% | 71 |
| deewiant.Anomaly 0.2 | 2.8 | 14.5% | 55 |
| myl.micro.Troodon 1.10 | 4.2 | 12.0% | 5 |
| jok.PheonixM 0.1.2 | 4.8 | 10.0% | 7 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.3% | 2 |
| DBall.Anarchy 0.1 | 7.3 | 6.7% | 6 |
| ap.Frederick 1.1 | 8.5 | 5.6% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 8.7 | 5.7% | 0 |
| jangs.ns51 1.0 | 9.3 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 68.9 | 9 / 35 | 4343 |
| 2 | 1 | 66.8 | 82.5 | 12 / 35 | 4347 |
| 3 | 3 | 63.6 | 68.3 | 9 / 35 | 4414 |
| 4 | 1 | 64.9 | 75.2 | 9 / 35 | 4507 |
| 5 | 1 | 66.4 | 80.0 | 10 / 35 | 4501 |
| 6 | 1 | 67.6 | 81.3 | 13 / 35 | 5049 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 47 | 21% |
| deewiant.Anomaly 0.2 | 44 | 36% |
| myl.micro.Troodon 1.10 | 21 | 95% |
| jok.PheonixM 0.1.2 | 11 | 82% |
| DBall.Anarchy 0.1 | 3 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 50% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 56 | 38% | 75 |
| zyx.mega.YersiniaPestis 3.1 | 55 | 37% | 67 |
| myl.micro.Troodon 1.10 | 10 | 7% | 21 |
| jok.PheonixM 0.1.2 | 10 | 7% | 20 |
| fullsail.TimbotNoPrediction 1.0 | 7 | 5% | 10 |
| ph.melee.ArcherME 0.3 | 7 | 5% | 10 |
| DBall.Anarchy 0.1 | 3 | 2% | 6 |
| jangs.ns51 1.0 | 0 | 0% | 1 |

## Melee bench: F30

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 56.3 | 27 / 210 | 4.93 | 12.0% | 23403 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.5 | 14.2% | 60 |
| darkcanuck.B26354 1.06 | 2.2 | 13.7% | 48 |
| oog.melee.Capulet 1.2 | 3.5 | 12.9% | 27 |
| stelo.PastFuture 2.3.2 | 3.7 | 12.7% | 29 |
| hadur117.micro.Saor 0.2 | 4.2 | 12.0% | 27 |
| intruder.PrairieWolf 2.61 | 6.5 | 8.5% | 9 |
| ntc.Opposite 1.5 | 7.3 | 8.2% | 3 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.5% | 4 |
| tripphippy.Alice 1.1 | 8.3 | 7.6% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.9 | 60.0 | 5 / 35 | 3633 |
| 2 | 5 | 54.6 | 49.8 | 4 / 35 | 3756 |
| 3 | 3 | 57.5 | 57.1 | 5 / 35 | 3980 |
| 4 | 4 | 53.6 | 50.5 | 2 / 35 | 3721 |
| 5 | 3 | 59.2 | 60.6 | 7 / 35 | 4192 |
| 6 | 5 | 58.6 | 60.0 | 4 / 35 | 4121 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 16 | 69% |
| stelo.PastFuture 2.3.2 | 15 | 53% |
| catcat20.Matcha 0.006 | 15 | 20% |
| darkcanuck.B26354 1.06 | 9 | 22% |
| intruder.PrairieWolf 2.61 | 1 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 183 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 44 | 24% | 47 |
| darkcanuck.B26354 1.06 | 38 | 21% | 44 |
| oog.melee.Capulet 1.2 | 34 | 19% | 44 |
| stelo.PastFuture 2.3.2 | 24 | 13% | 31 |
| ntc.Opposite 1.5 | 14 | 8% | 14 |
| fowl3628800.LightningBolt 2.6.0 | 11 | 6% | 12 |
| intruder.PrairieWolf 2.61 | 9 | 5% | 9 |
| tripphippy.Alice 1.1 | 8 | 4% | 8 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |

## Melee bench: F31

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 67.4 | 18 / 210 | 3.94 | 13.4% | 21851 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 19.0% | 127 |
| hadur117.micro.Saor 0.2 | 2.5 | 13.4% | 18 |
| gh.mini.Griezel 0.2 | 3.0 | 12.6% | 41 |
| spinnercat.micro.Tyger 0.1 | 3.8 | 11.8% | 9 |
| d414.nano.Quantum 1.0.0 | 4.7 | 11.0% | 7 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.9% | 7 |
| timmit.nano.TimDog 0.33 | 7.0 | 6.7% | 1 |
| fm.mammillarias 1.3 | 8.0 | 6.0% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.5% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.8 | 69.8 | 3 / 35 | 3721 |
| 2 | 2 | 61.1 | 70.2 | 1 / 35 | 3834 |
| 3 | 3 | 59.5 | 64.8 | 1 / 35 | 3813 |
| 4 | 3 | 57.5 | 62.2 | 4 / 35 | 3003 |
| 5 | 3 | 61.0 | 69.5 | 4 / 35 | 3606 |
| 6 | 2 | 60.5 | 67.6 | 5 / 35 | 3874 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 39 | 8% |
| gh.mini.Griezel 0.2 | 19 | 16% |
| spinnercat.micro.Tyger 0.1 | 11 | 73% |
| d414.nano.Quantum 1.0.0 | 4 | 50% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 0% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 192 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 104 | 54% | 107 |
| gh.mini.Griezel 0.2 | 41 | 21% | 45 |
| spinnercat.micro.Tyger 0.1 | 12 | 6% | 18 |
| timmit.nano.TimDog 0.33 | 11 | 6% | 13 |
| gh.nano.Grofvuil 0.2 | 10 | 5% | 10 |
| d414.nano.Quantum 1.0.0 | 7 | 4% | 9 |
| fm.mammillarias 1.3 | 3 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 76.0 | 82 / 210 | 3.16 | 16.3% | 28280 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 16.3% | 82 |
| kawigi.sbf.FloodHT 0.9.2 | 1.8 | 15.0% | 77 |
| apc.botM 3.0 | 3.3 | 12.1% | 21 |
| vjik.UnViolation 1.1 | 4.3 | 10.7% | 13 |
| lxx.ConceptA 0.8 | 5.0 | 9.9% | 3 |
| bayen.UbaMicro 1.4 | 5.7 | 9.1% | 3 |
| panzer.Panzer 0.2 | 7.3 | 7.9% | 1 |
| yk.JahMicro 1.0 | 7.8 | 7.3% | 7 |
| conscience.Electron 1.3g | 8.8 | 6.5% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 5.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 71.4 | 12 / 35 | 4717 |
| 2 | 1 | 65.0 | 74.6 | 17 / 35 | 4813 |
| 3 | 1 | 63.5 | 72.4 | 14 / 35 | 4332 |
| 4 | 1 | 66.5 | 83.5 | 16 / 35 | 4943 |
| 5 | 1 | 64.0 | 75.2 | 12 / 35 | 4667 |
| 6 | 2 | 65.2 | 78.7 | 11 / 35 | 4808 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 61 | 31% |
| apc.botM 3.0 | 26 | 77% |
| lxx.ConceptA 0.8 | 21 | 95% |
| vjik.UnViolation 1.1 | 9 | 78% |
| panzer.Panzer 0.2 | 5 | 100% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| yk.JahMicro 1.0 | 4 | 75% |
| donjezza.Jezza 1.0 | 4 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 55 | 43% | 77 |
| lxx.ConceptA 0.8 | 16 | 13% | 24 |
| vjik.UnViolation 1.1 | 15 | 12% | 28 |
| apc.botM 3.0 | 13 | 10% | 38 |
| bayen.UbaMicro 1.4 | 10 | 8% | 13 |
| conscience.Electron 1.3g | 8 | 6% | 11 |
| panzer.Panzer 0.2 | 8 | 6% | 10 |
| yk.JahMicro 1.0 | 2 | 2% | 4 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

## Melee bench: F33

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 83.4 | 117 / 210 | 2.49 | 19.0% | 32693 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.0% | 117 |
| maribo.Quester 0.3 | 2.0 | 14.7% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.6% | 17 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 10.9% | 18 |
| labg.Cataclysm 2.05 | 4.8 | 10.6% | 18 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.5% | 5 |
| baal.nano.N 1.42 | 6.5 | 8.9% | 2 |
| zyx.micro.Ant 1.1 | 8.3 | 5.7% | 0 |
| sanja.First 0.1 | 8.8 | 5.1% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 84.4 | 20 / 35 | 5892 |
| 2 | 1 | 70.3 | 89.5 | 23 / 35 | 5468 |
| 3 | 1 | 68.8 | 81.9 | 19 / 35 | 5468 |
| 4 | 1 | 67.2 | 79.0 | 16 / 35 | 5071 |
| 5 | 1 | 68.3 | 81.3 | 16 / 35 | 5539 |
| 6 | 1 | 69.2 | 84.4 | 23 / 35 | 5255 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 52 | 69% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 50 | 92% |
| gre.svman4.Leonidas 1.3.2 | 24 | 79% |
| labg.Cataclysm 2.05 | 14 | 36% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 83% |
| baal.nano.N 1.42 | 4 | 100% |
| sanja.First 0.1 | 2 | 50% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 29 | 31% | 69 |
| gre.svman4.Leonidas 1.3.2 | 17 | 18% | 34 |
| labg.Cataclysm 2.05 | 13 | 14% | 18 |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 10% | 13 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 8 | 9% | 48 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 8 | 9% | 10 |
| zyx.micro.Ant 1.1 | 6 | 6% | 9 |
| baal.nano.N 1.42 | 2 | 2% | 5 |
| sanja.First 0.1 | 2 | 2% | 4 |

## Melee bench: F34

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 76.8 | 31 / 210 | 3.09 | 15.9% | 29006 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.7 | 17.1% | 85 |
| kid.Gladiator .7.2 | 1.7 | 16.6% | 65 |
| hadur117.micro.Saor 0.2 | 2.7 | 15.9% | 31 |
| tcf.Reach 3 | 4.3 | 10.7% | 7 |
| jcs.Seth 1.8 | 5.2 | 10.2% | 17 |
| cli.Dancer 1.1 | 5.5 | 9.7% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.7% | 4 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.3% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.9% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.1 | 76.5 | 5 / 35 | 4669 |
| 2 | 3 | 65.5 | 77.8 | 6 / 35 | 4851 |
| 3 | 1 | 66.6 | 78.7 | 7 / 35 | 5129 |
| 4 | 3 | 65.5 | 76.2 | 6 / 35 | 4995 |
| 5 | 3 | 63.0 | 72.1 | 3 / 35 | 4372 |
| 6 | 3 | 66.2 | 79.4 | 4 / 35 | 4990 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 52 | 25% |
| kid.Gladiator .7.2 | 33 | 21% |
| tcf.Reach 3 | 8 | 38% |
| jcs.Seth 1.8 | 7 | 57% |
| cli.Dancer 1.1 | 3 | 100% |
| ratosh.Wesco 1.4 | 2 | 0% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 985. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 73 | 41% | 77 |
| stelo.Spread 0.9 | 70 | 39% | 82 |
| tcf.Reach 3 | 12 | 7% | 16 |
| jcs.Seth 1.8 | 8 | 4% | 14 |
| ratosh.Wesco 1.4 | 8 | 4% | 8 |
| sample.RamFire 1.0 | 3 | 2% | 2 |
| cli.Dancer 1.1 | 2 | 1% | 7 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 3 |
| sample.VelociRobot 1.0 | 1 | 1% | 1 |

## Melee bench: F35

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 73.0 | 21 / 210 | 3.43 | 14.1% | 21221 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.6% | 166 |
| hadur117.micro.Saor 0.2 | 2.0 | 14.1% | 21 |
| gh.mini.Gruwel 0.9 | 3.7 | 12.5% | 17 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.1% | 6 |
| rz.HawkOnFire 0.1 | 4.5 | 11.5% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.5 | 6.8% | 0 |
| wit.Chuliath 1.0 | 6.7 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.5 | 5.5% | 0 |
| dans.Cinnamon 1.2 | 8.8 | 5.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 74.0 | 3 / 35 | 3628 |
| 2 | 2 | 60.0 | 68.6 | 3 / 35 | 3189 |
| 3 | 2 | 62.7 | 74.9 | 4 / 35 | 3493 |
| 4 | 2 | 61.6 | 71.7 | 3 / 35 | 3536 |
| 5 | 2 | 63.3 | 77.1 | 5 / 35 | 3730 |
| 6 | 2 | 61.8 | 71.7 | 3 / 35 | 3645 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 40 | 3% |
| dmh.robocode.robot.BlackDeath 9.2 | 14 | 86% |
| gh.mini.Gruwel 0.9 | 7 | 14% |
| rz.HawkOnFire 0.1 | 4 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 189 of 210 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 131 | 69% | 132 |
| gh.mini.Gruwel 0.9 | 17 | 9% | 20 |
| dmh.robocode.robot.BlackDeath 9.2 | 13 | 7% | 26 |
| rz.HawkOnFire 0.1 | 11 | 6% | 12 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7 | 4% | 7 |
| wit.Chuliath 1.0 | 3 | 2% | 5 |
| myl.nano.KomoriNinja 1.1 | 3 | 2% | 4 |
| stelo.MyAgileRobot 0.2 | 3 | 2% | 3 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 85.1 | 142 / 210 | 2.34 | 19.8% | 32882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.8% | 142 |
| alpha.RainingFire 1.0 | 2.3 | 12.2% | 21 |
| bzdp.Pansy 2.1 | 3.3 | 11.4% | 12 |
| bvh.micro.Freya 0.3 | 4.2 | 10.9% | 12 |
| mz.Cork 0.1 | 4.3 | 10.7% | 16 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.4% | 1 |
| m3thos.Eva02 0.7.1 | 6.5 | 9.0% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 6.6% | 0 |
| dl.BetterWalls 1.0 | 9.0 | 5.4% | 1 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 81.9 | 23 / 35 | 5533 |
| 2 | 1 | 71.1 | 92.4 | 27 / 35 | 5470 |
| 3 | 1 | 69.4 | 83.2 | 23 / 35 | 5420 |
| 4 | 1 | 70.7 | 88.9 | 24 / 35 | 5789 |
| 5 | 1 | 70.2 | 88.3 | 24 / 35 | 5557 |
| 6 | 1 | 67.0 | 76.2 | 21 / 35 | 5113 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 45 | 93% |
| mz.Cork 0.1 | 27 | 74% |
| bvh.micro.Freya 0.3 | 26 | 92% |
| alpha.RainingFire 1.0 | 25 | 76% |
| bvh.mini.Fenrir 0.39 | 18 | 94% |
| m3thos.Eva02 0.7.1 | 10 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| dl.BetterWalls 1.0 | 2 | 50% |

Hadur died in 68 of 210 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 24 | 35% | 39 |
| mz.Cork 0.1 | 13 | 19% | 39 |
| bzdp.Pansy 2.1 | 8 | 12% | 45 |
| bvh.micro.Freya 0.3 | 6 | 9% | 26 |
| bvh.mini.Fenrir 0.39 | 6 | 9% | 15 |
| m3thos.Eva02 0.7.1 | 4 | 6% | 18 |
| dl.BetterWalls 1.0 | 4 | 6% | 12 |
| squidM.TentalceMeleeNano 1.1 | 3 | 4% | 8 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 6 |

## Melee bench: F37

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 79.3 | 129 / 210 | 2.86 | 17.8% | 31520 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.8% | 129 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.8 | 10.7% | 13 |
| germ.TheMind .2 | 3.2 | 10.7% | 15 |
| EBBU.Sim2 1.02 | 3.7 | 10.3% | 8 |
| agrach.Dalek 1.0 | 6.2 | 8.9% | 13 |
| lmk.ACPFinal 0.1 | 6.7 | 8.8% | 10 |
| stelo.UntouchableNano 1.3 | 6.7 | 8.8% | 11 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 8.1% | 2 |
| skm.Ryubot 1.0 | 8.3 | 7.9% | 3 |
| mb.Beast 0.1 | 8.5 | 8.0% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 85.4 | 26 / 35 | 5786 |
| 2 | 1 | 66.4 | 80.0 | 22 / 35 | 5314 |
| 3 | 1 | 62.7 | 70.2 | 17 / 35 | 4620 |
| 4 | 1 | 65.7 | 77.5 | 22 / 35 | 4773 |
| 5 | 1 | 66.7 | 80.0 | 19 / 35 | 5574 |
| 6 | 1 | 67.1 | 82.9 | 23 / 35 | 5453 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 28 | 89% |
| com.syncleus.robocode.Dreadnaught 0.1 | 26 | 77% |
| EBBU.Sim2 1.02 | 21 | 100% |
| skm.Ryubot 1.0 | 17 | 100% |
| mb.Beast 0.1 | 16 | 100% |
| stelo.UntouchableNano 1.3 | 13 | 100% |
| lmk.ACPFinal 0.1 | 12 | 92% |
| agrach.Dalek 1.0 | 7 | 57% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 67% |

Hadur died in 83 of 210 rounds, at a mean tick of 349. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 21 | 25% | 23 |
| agrach.Dalek 1.0 | 14 | 17% | 28 |
| com.syncleus.robocode.Dreadnaught 0.1 | 11 | 13% | 40 |
| lmk.ACPFinal 0.1 | 9 | 11% | 17 |
| germ.TheMind .2 | 7 | 8% | 24 |
| stelo.UntouchableNano 1.3 | 7 | 8% | 15 |
| mb.Beast 0.1 | 6 | 7% | 22 |
| EBBU.Sim2 1.02 | 4 | 5% | 31 |
| skm.Ryubot 1.0 | 4 | 5% | 6 |

## Melee bench: F38

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 75.4 | 59 / 210 | 3.21 | 15.7% | 26685 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.2 | 16.9% | 104 |
| hadur117.micro.Saor 0.2 | 1.8 | 15.7% | 59 |
| bvh.mini.Freya 0.55 | 3.3 | 12.6% | 12 |
| bts.mega.Gnarly 1.4 | 4.5 | 10.9% | 19 |
| cs.Wren 1.0 | 4.7 | 10.8% | 4 |
| kdf.KoulDestroyer 1.0 | 5.7 | 9.7% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 8.3% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.7 | 5.5% | 0 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.9% | 2 |
| bzdp.BoxCar 2.0 | 9.2 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 75.6 | 11 / 35 | 3996 |
| 2 | 2 | 65.2 | 78.7 | 11 / 35 | 4490 |
| 3 | 2 | 64.2 | 75.9 | 12 / 35 | 4344 |
| 4 | 1 | 65.9 | 78.4 | 11 / 35 | 4979 |
| 5 | 2 | 61.8 | 70.8 | 5 / 35 | 4210 |
| 6 | 2 | 64.0 | 73.0 | 9 / 35 | 4666 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 50 | 12% |
| bts.mega.Gnarly 1.4 | 15 | 60% |
| bvh.mini.Freya 0.55 | 15 | 93% |
| kdf.KoulDestroyer 1.0 | 12 | 75% |
| cs.Wren 1.0 | 12 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 7 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 86 | 57% | 92 |
| bts.mega.Gnarly 1.4 | 21 | 14% | 35 |
| bvh.mini.Freya 0.55 | 19 | 13% | 30 |
| davidalves.net.DuelistNanoMelee 1.01 | 7 | 5% | 17 |
| cs.Wren 1.0 | 7 | 5% | 15 |
| kdf.KoulDestroyer 1.0 | 6 | 4% | 8 |
| matt.UnderDark3 2.4.34 | 3 | 2% | 6 |
| bzdp.BoxCar 2.0 | 2 | 1% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 4 |

## Melee bench: F39

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 78.6 | 74 / 210 | 2.92 | 17.0% | 30891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.0% | 74 |
| bvh.fry.Freya 0.82 | 2.0 | 14.9% | 32 |
| az.Ololobot 0.2.4 | 3.2 | 12.4% | 61 |
| catcat20.Lambda 0.024 | 4.0 | 10.8% | 26 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.2% | 8 |
| gimp.GimpBot 0.1 | 6.3 | 8.3% | 2 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 7.9% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 7.3 | 7.6% | 6 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 6.2% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.5 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 82.2 | 12 / 35 | 4976 |
| 2 | 1 | 62.4 | 66.7 | 8 / 35 | 5156 |
| 3 | 1 | 67.2 | 84.1 | 15 / 35 | 5444 |
| 4 | 1 | 65.0 | 76.8 | 11 / 35 | 5040 |
| 5 | 1 | 67.1 | 84.8 | 17 / 35 | 4960 |
| 6 | 1 | 65.5 | 77.1 | 11 / 35 | 5315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 50 | 68% |
| az.Ololobot 0.2.4 | 41 | 10% |
| catcat20.Lambda 0.024 | 32 | 59% |
| stelo.SoRobotNanoMelee 1.2 | 9 | 89% |
| apollokidd.ApolloKidd 0.9 | 4 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 100% |
| winamp32.micro.MicroMacro 1.0 | 1 | 100% |
| gimp.GimpBot 0.1 | 1 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 1035. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 49 | 36% | 61 |
| bvh.fry.Freya 0.82 | 33 | 24% | 62 |
| catcat20.Lambda 0.024 | 23 | 17% | 38 |
| apollokidd.ApolloKidd 0.9 | 10 | 7% | 14 |
| stelo.SoRobotNanoMelee 1.2 | 6 | 4% | 9 |
| whitesquare.robots.SkynetAdvanced 1.1 | 6 | 4% | 8 |
| gimp.GimpBot 0.1 | 5 | 4% | 7 |
| winamp32.micro.MicroMacro 1.0 | 2 | 1% | 6 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 1% | 5 |

## Melee bench: F40

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 77.8 | 102 / 210 | 3.00 | 17.4% | 28736 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 17.4% | 102 |
| kawigi.mini.Coriantumr 1.1 | 1.8 | 15.6% | 58 |
| kano.gamma.KanoGamma 1.8 | 3.5 | 12.1% | 11 |
| mz.AntiGrav 1.0 | 4.2 | 11.2% | 13 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.5% | 11 |
| alpha.BlackIce 1.0 | 6.2 | 9.0% | 4 |
| stelo.Randomness 1.0 | 6.7 | 8.6% | 8 |
| testantiswapgun.AntiSwap 1.0 | 8.5 | 5.6% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.5 | 6.0% | 0 |
| sample.Corners 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 80.3 | 21 / 35 | 5149 |
| 2 | 1 | 66.3 | 77.1 | 17 / 35 | 4788 |
| 3 | 1 | 66.0 | 74.6 | 17 / 35 | 4877 |
| 4 | 1 | 68.2 | 85.4 | 19 / 35 | 4645 |
| 5 | 1 | 66.0 | 75.2 | 17 / 35 | 4683 |
| 6 | 2 | 65.2 | 74.3 | 11 / 35 | 4594 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 67 | 55% |
| mz.AntiGrav 1.0 | 22 | 100% |
| kano.gamma.KanoGamma 1.8 | 20 | 100% |
| Polkwane.SmashMelee 1.0 | 18 | 83% |
| stelo.Randomness 1.0 | 6 | 67% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |
| alpha.BlackIce 1.0 | 1 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 55 | 50% | 81 |
| Polkwane.SmashMelee 1.0 | 15 | 14% | 27 |
| alpha.BlackIce 1.0 | 15 | 14% | 20 |
| stelo.Randomness 1.0 | 8 | 7% | 14 |
| kano.gamma.KanoGamma 1.8 | 7 | 6% | 34 |
| mz.AntiGrav 1.0 | 7 | 6% | 20 |
| amk.superstrike.SuperStrike 0.3 | 3 | 3% | 4 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 5 |
| sample.Corners 1.0 | 0 | 0% | 4 |

## Melee bench: F41

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 74.4 | 80 / 210 | 3.30 | 16.4% | 28800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.3 | 16.3% | 94 |
| hadur117.micro.Saor 0.2 | 1.7 | 16.4% | 80 |
| ary.Swarm 1.1 | 3.3 | 12.8% | 12 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.5% | 19 |
| simonton.nano.MeleeSeed 1.8 | 5.2 | 9.7% | 2 |
| shrub.Silver v048 | 6.0 | 9.1% | 0 |
| zyx.nano.Ant 1.1 | 6.8 | 7.6% | 1 |
| stelo.Mirror 1.1 | 8.5 | 6.2% | 1 |
| jsal.Jsalbot 1.0 | 8.5 | 6.4% | 1 |
| acogdev.alpha 0.2 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 79.7 | 17 / 35 | 4787 |
| 2 | 2 | 65.0 | 75.2 | 11 / 35 | 4812 |
| 3 | 2 | 64.9 | 73.0 | 11 / 35 | 4713 |
| 4 | 2 | 64.2 | 69.2 | 11 / 35 | 5119 |
| 5 | 2 | 62.7 | 67.0 | 11 / 35 | 4436 |
| 6 | 1 | 67.9 | 82.5 | 19 / 35 | 4933 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 50 | 24% |
| ary.Swarm 1.1 | 30 | 93% |
| lessonz.robocode.Oz 0.5.0 | 25 | 76% |
| simonton.nano.MeleeSeed 1.8 | 17 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |
| shrub.Silver v048 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 0% |

Hadur died in 130 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 64 | 49% | 79 |
| simonton.nano.MeleeSeed 1.8 | 21 | 16% | 39 |
| lessonz.robocode.Oz 0.5.0 | 14 | 11% | 22 |
| ary.Swarm 1.1 | 13 | 10% | 42 |
| zyx.nano.Ant 1.1 | 8 | 6% | 8 |
| shrub.Silver v048 | 5 | 4% | 8 |
| stelo.Mirror 1.1 | 3 | 2% | 6 |
| acogdev.alpha 0.2 | 2 | 2% | 3 |
| jsal.Jsalbot 1.0 | 0 | 0% | 2 |

## Melee bench: F42

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 75.3 | 45 / 210 | 3.22 | 15.9% | 30031 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.4% | 104 |
| hadur117.micro.Saor 0.2 | 2.0 | 15.9% | 45 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.2% | 27 |
| ara.Shera 0.88 | 3.7 | 12.7% | 28 |
| amz.NanoClone 1.41 | 5.2 | 9.0% | 3 |
| maribo.IotaCT 1.1 | 6.2 | 7.8% | 1 |
| stelo.MirrorMicro 1.0 | 7.5 | 6.6% | 1 |
| dsw.StaticD 1.0 | 7.5 | 6.9% | 1 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 74.3 | 9 / 35 | 4679 |
| 2 | 2 | 62.9 | 72.1 | 7 / 35 | 4738 |
| 3 | 2 | 65.2 | 75.2 | 8 / 35 | 5432 |
| 4 | 2 | 64.6 | 76.8 | 6 / 35 | 5325 |
| 5 | 2 | 63.4 | 71.7 | 9 / 35 | 4624 |
| 6 | 2 | 66.3 | 81.6 | 6 / 35 | 5233 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 50 | 26% |
| ara.Shera 0.88 | 28 | 46% |
| maribo.mini.MiniQuester 0.1 | 14 | 79% |
| amz.NanoClone 1.41 | 4 | 100% |
| dsw.StaticD 1.0 | 3 | 67% |
| maribo.IotaCT 1.1 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 168 of 210 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 97 | 58% | 110 |
| ara.Shera 0.88 | 34 | 20% | 47 |
| maribo.mini.MiniQuester 0.1 | 16 | 10% | 26 |
| dsw.StaticD 1.0 | 7 | 4% | 9 |
| stelo.MirrorMicro 1.0 | 7 | 4% | 7 |
| amz.NanoClone 1.41 | 4 | 2% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 1% | 2 |
| maribo.IotaCT 1.1 | 1 | 1% | 2 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 67.4 | 8 / 210 | 3.94 | 13.2% | 22076 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.1% | 177 |
| hadur117.micro.Saor 0.2 | 2.3 | 13.2% | 8 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.0% | 15 |
| dummy.micro.Sparrow 2.5 | 4.0 | 10.8% | 4 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 10.7% | 5 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.6% | 0 |
| mz.NanoGod 2.02 | 7.3 | 8.2% | 1 |
| jab.DiamondStealer 5 | 7.7 | 7.9% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.7% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.8 | 58.4 | 0 / 35 | 3326 |
| 2 | 2 | 62.2 | 70.5 | 1 / 35 | 3619 |
| 3 | 2 | 61.9 | 66.0 | 2 / 35 | 3992 |
| 4 | 2 | 62.7 | 72.1 | 1 / 35 | 3885 |
| 5 | 2 | 61.7 | 70.2 | 3 / 35 | 3530 |
| 6 | 2 | 61.0 | 67.0 | 1 / 35 | 3724 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 52 | 2% |
| brainfade.melee.Dusk 0.44 | 8 | 25% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 67% |
| dummy.micro.Sparrow 2.5 | 2 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 202 of 210 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 117 | 58% | 119 |
| brainfade.melee.Dusk 0.44 | 28 | 14% | 30 |
| wcsv.melee.EngineerMelee 0.1 | 22 | 11% | 25 |
| dummy.micro.Sparrow 2.5 | 13 | 6% | 13 |
| mz.NanoGod 2.02 | 12 | 6% | 12 |
| Krabb.akim2.Akim2 1.1b | 6 | 3% | 7 |
| jab.DiamondStealer 5 | 4 | 2% | 4 |

## Melee bench: F44

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 84.0 | 86 / 210 | 2.44 | 18.5% | 33322 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.5% | 86 |
| stelo.Liblix 0.3.1 | 2.0 | 16.6% | 92 |
| tzu.TheArtOfWar 1.2 | 3.0 | 12.6% | 21 |
| wompi.Quokka 1.6 | 4.2 | 10.1% | 3 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.3 | 9.1% | 1 |
| jwirde.Gort 2.0 | 5.7 | 9.0% | 5 |
| disan.Chair 2.2.0 | 7.2 | 7.4% | 1 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.9% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 5.0% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 85.1 | 12 / 35 | 5554 |
| 2 | 1 | 67.2 | 81.6 | 13 / 35 | 5392 |
| 3 | 1 | 68.2 | 83.5 | 15 / 35 | 5796 |
| 4 | 1 | 69.0 | 88.3 | 18 / 35 | 5408 |
| 5 | 1 | 67.5 | 80.6 | 13 / 35 | 5628 |
| 6 | 1 | 68.9 | 85.1 | 15 / 35 | 5544 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 81 | 28% |
| tzu.TheArtOfWar 1.2 | 43 | 79% |
| wompi.Quokka 1.6 | 9 | 78% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 88% |
| jwirde.Gort 2.0 | 6 | 67% |
| disan.Chair 2.2.0 | 6 | 83% |
| amk.jointstrike.JointStrike 0.2 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 75 | 60% | 104 |
| tzu.TheArtOfWar 1.2 | 29 | 23% | 63 |
| wompi.Quokka 1.6 | 10 | 8% | 14 |
| jwirde.Gort 2.0 | 4 | 3% | 10 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 2% | 6 |
| disan.Chair 2.2.0 | 2 | 2% | 4 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 5 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 1 |

## Melee bench: F45

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 85.1 | 83 / 210 | 2.34 | 19.6% | 36227 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.6% | 83 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 13.0% | 105 |
| jje.BagPuss 1.2 | 3.0 | 11.7% | 9 |
| myl.nano.Graviton 1.10 | 4.5 | 10.1% | 2 |
| sul.Lunar 1.1 | 5.0 | 10.1% | 4 |
| hvilela.HVilela 0.9 | 6.3 | 8.4% | 0 |
| fm.claire 1.7 | 6.8 | 8.3% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 8.2% | 6 |
| wit.Deep7 2.0 | 9.3 | 5.5% | 0 |
| abud.ThirdRobo 1.0 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 82.5 | 13 / 35 | 6321 |
| 2 | 1 | 69.1 | 86.7 | 14 / 35 | 5903 |
| 3 | 1 | 69.6 | 85.4 | 12 / 35 | 6414 |
| 4 | 1 | 69.9 | 86.7 | 16 / 35 | 6090 |
| 5 | 1 | 67.1 | 79.7 | 10 / 35 | 5447 |
| 6 | 1 | 70.7 | 89.8 | 18 / 35 | 6052 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 106 | 31% |
| sul.Lunar 1.1 | 21 | 95% |
| jje.BagPuss 1.2 | 12 | 92% |
| myl.nano.Graviton 1.10 | 11 | 91% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 71% |
| wit.Deep7 2.0 | 3 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 2019. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 73 | 57% | 0 |
| myl.nano.Graviton 1.10 | 15 | 12% | 50 |
| jje.BagPuss 1.2 | 13 | 10% | 48 |
| sul.Lunar 1.1 | 8 | 6% | 57 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 5% | 18 |
| fm.claire 1.7 | 5 | 4% | 13 |
| hvilela.HVilela 0.9 | 5 | 4% | 12 |
| wit.Deep7 2.0 | 2 | 2% | 8 |
| abud.ThirdRobo 1.0 | 0 | 0% | 1 |

## Melee bench: F46

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 70.1 | 19 / 210 | 3.69 | 14.4% | 27060 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.8% | 93 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.2% | 80 |
| hadur117.micro.Saor 0.2 | 2.8 | 14.4% | 19 |
| mz.MicroSheep 1.0 | 4.7 | 10.3% | 3 |
| cx.Princess 1.0 | 4.8 | 10.0% | 12 |
| sadoner.killer 0.2 | 5.5 | 9.5% | 2 |
| arthord.NanoSatanMelee Beta | 7.3 | 6.7% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.7 | 6.3% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.3 | 71.4 | 3 / 35 | 4815 |
| 2 | 2 | 63.5 | 74.6 | 5 / 35 | 4458 |
| 3 | 3 | 63.8 | 71.7 | 3 / 35 | 4874 |
| 4 | 3 | 61.0 | 65.7 | 1 / 35 | 4239 |
| 5 | 3 | 60.7 | 66.3 | 2 / 35 | 4277 |
| 6 | 3 | 62.3 | 70.8 | 5 / 35 | 4397 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 45 | 18% |
| rsalesc.melee.Medina 0.4.5 | 23 | 17% |
| cx.Princess 1.0 | 5 | 40% |
| mz.MicroSheep 1.0 | 4 | 75% |
| arthord.NanoSatanMelee Beta | 2 | 100% |

Hadur died in 192 of 210 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 78 | 41% | 88 |
| rsalesc.melee.Medina 0.4.5 | 67 | 35% | 71 |
| cx.Princess 1.0 | 20 | 10% | 22 |
| mz.MicroSheep 1.0 | 8 | 4% | 9 |
| sadoner.killer 0.2 | 6 | 3% | 7 |
| arthord.NanoSatanMelee Beta | 5 | 3% | 5 |
| jeremyreeder.collective.Prophet 5 | 4 | 2% | 4 |
| kurios.DOSexe .9a | 3 | 2% | 3 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |

