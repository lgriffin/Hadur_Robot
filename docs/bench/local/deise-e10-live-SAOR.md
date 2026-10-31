# Bench suite: suite.txt

## Melee bench: F01

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 73.3 | 16 / 210 | 3.40 | 14.7% | 27458 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.7% | 160 |
| hadur117.micro.Saor 0.2 | 2.0 | 14.7% | 16 |
| sgp.JollyNinja 3.53 | 3.5 | 11.4% | 20 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.7 | 11.3% | 4 |
| lorneswork.Predator 1.0 | 5.5 | 9.7% | 5 |
| mz.MicroGodMelee 1 | 5.5 | 9.9% | 5 |
| adt.Ar2 1.0 | 6.8 | 8.2% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.5% | 0 |
| skm.butterfly 1.0 | 8.7 | 5.4% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 67.6 | 4 / 35 | 4790 |
| 2 | 2 | 62.0 | 67.9 | 2 / 35 | 4651 |
| 3 | 2 | 62.6 | 72.4 | 3 / 35 | 4614 |
| 4 | 2 | 63.0 | 76.8 | 1 / 35 | 4106 |
| 5 | 2 | 63.2 | 75.6 | 4 / 35 | 4475 |
| 6 | 2 | 65.0 | 79.7 | 2 / 35 | 4822 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 89 | 1% |
| sgp.JollyNinja 3.53 | 13 | 54% |
| mz.MicroGodMelee 1 | 6 | 33% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 100% |
| lorneswork.Predator 1.0 | 2 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 194 of 210 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 133 | 69% | 135 |
| sgp.JollyNinja 3.53 | 17 | 9% | 21 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 8% | 17 |
| mz.MicroGodMelee 1 | 9 | 5% | 11 |
| lorneswork.Predator 1.0 | 8 | 4% | 12 |
| kawigi.sbf.FloodSonnet 0.9 | 6 | 3% | 5 |
| adt.Ar2 1.0 | 4 | 2% | 6 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |

## Melee bench: F02

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 79.4 | 81 / 210 | 2.85 | 17.4% | 30160 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.4% | 81 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.9% | 51 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.6% | 48 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.3% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.7 | 9.2% | 6 |
| sch.Simone 0.3d | 5.8 | 8.6% | 9 |
| fnc.bandit.Bandit 5.2.0 | 7.2 | 8.0% | 2 |
| Noran.BitchingElk 0.054 | 7.2 | 8.1% | 8 |
| stelo.PatternRobot 1.0 | 9.0 | 6.0% | 5 |
| fullsail.SweetTea 1.1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 83.2 | 14 / 35 | 5180 |
| 2 | 1 | 65.4 | 77.1 | 13 / 35 | 4969 |
| 3 | 1 | 65.4 | 76.5 | 13 / 35 | 5023 |
| 4 | 1 | 65.4 | 76.2 | 14 / 35 | 4834 |
| 5 | 1 | 66.7 | 81.6 | 13 / 35 | 4984 |
| 6 | 1 | 67.2 | 81.9 | 14 / 35 | 5170 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 51 | 43% |
| pulsar.PulsarMax 0.8.9 | 41 | 46% |
| sch.Simone 0.3d | 17 | 76% |
| Noran.BitchingElk 0.054 | 13 | 69% |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 100% |
| stelo.PatternRobot 1.0 | 6 | 83% |
| lrem.micro.SpikeSoldier 0.4 | 4 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |
| fnc.bandit.Bandit 5.2.0 | 1 | 0% |

Hadur died in 129 of 210 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 48 | 37% | 72 |
| pulsar.PulsarMax 0.8.9 | 45 | 35% | 64 |
| Noran.BitchingElk 0.054 | 9 | 7% | 21 |
| sch.Simone 0.3d | 6 | 5% | 14 |
| fullsail.SweetTea 1.1 | 5 | 4% | 7 |
| stelo.PatternRobot 1.0 | 5 | 4% | 5 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4 | 3% | 14 |
| lrem.micro.SpikeSoldier 0.4 | 4 | 3% | 10 |
| fnc.bandit.Bandit 5.2.0 | 3 | 2% | 3 |

## Melee bench: F03

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 77.3 | 120 / 210 | 3.04 | 17.3% | 31923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.3% | 120 |
| radnor.DoctorBob 1.42 | 2.7 | 13.7% | 36 |
| kawigi.nano.Lib 1.0 | 2.8 | 13.2% | 24 |
| vuen.Cake 2.51 | 3.5 | 12.6% | 24 |
| urdos.URDOS 1.3 | 5.0 | 10.1% | 3 |
| adt.Ar1 2.1 | 6.5 | 7.8% | 1 |
| oa.weak.FlyMk1 0.1 | 7.3 | 7.1% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 7.0% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 6.2% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 86.3 | 26 / 35 | 5847 |
| 2 | 1 | 64.0 | 72.7 | 15 / 35 | 4951 |
| 3 | 1 | 67.4 | 78.4 | 20 / 35 | 5670 |
| 4 | 1 | 64.1 | 73.3 | 16 / 35 | 4946 |
| 5 | 1 | 66.5 | 77.5 | 23 / 35 | 5202 |
| 6 | 1 | 66.0 | 75.6 | 20 / 35 | 5307 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 54 | 91% |
| vuen.Cake 2.51 | 46 | 85% |
| radnor.DoctorBob 1.42 | 32 | 75% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 100% |
| urdos.URDOS 1.3 | 3 | 67% |
| adt.Ar1 2.1 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 525. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 23 | 26% | 69 |
| radnor.DoctorBob 1.42 | 14 | 16% | 40 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 12% | 14 |
| vuen.Cake 2.51 | 10 | 11% | 43 |
| ghent.ArthurPanzergon 1.0.0 | 10 | 11% | 13 |
| adt.Ar1 2.1 | 10 | 11% | 12 |
| urdos.URDOS 1.3 | 8 | 9% | 10 |
| oa.weak.FlyMk1 0.1 | 4 | 4% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 3 |

## Melee bench: F04

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 74.2 | 7 / 210 | 3.32 | 15.3% | 31952 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.7% | 191 |
| hadur117.micro.Saor 0.2 | 2.0 | 15.3% | 7 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.2% | 5 |
| TNT.TNT 0.99.1 | 4.0 | 10.6% | 5 |
| josago.Jorgito 0.16 | 5.2 | 9.0% | 1 |
| css.Delitioner 0.11 | 6.3 | 7.1% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.7% | 0 |
| rampancy.Durandal 2.1d | 7.5 | 6.0% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.7 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 74.9 | 2 / 35 | 5079 |
| 2 | 2 | 64.5 | 72.1 | 2 / 35 | 5404 |
| 3 | 2 | 65.8 | 77.8 | 1 / 35 | 5676 |
| 4 | 2 | 63.5 | 70.2 | 1 / 35 | 4982 |
| 5 | 2 | 65.1 | 74.0 | 0 / 35 | 5580 |
| 6 | 2 | 65.2 | 76.2 | 1 / 35 | 5231 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 69 | 3% |
| apc.LeeroyJenkins2 1.0 | 3 | 67% |
| TNT.TNT 0.99.1 | 3 | 67% |
| josago.Jorgito 0.16 | 1 | 0% |
| sp.Nanos.Ember 1.1 | 1 | 100% |

Hadur died in 203 of 210 rounds, at a mean tick of 947. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 161 | 79% | 162 |
| apc.LeeroyJenkins2 1.0 | 17 | 8% | 20 |
| josago.Jorgito 0.16 | 10 | 5% | 10 |
| TNT.TNT 0.99.1 | 4 | 2% | 6 |
| css.Delitioner 0.11 | 4 | 2% | 4 |
| rampancy.Durandal 2.1d | 3 | 1% | 3 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 3 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |

## Melee bench: F05

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 57.3 | 4 / 210 | 4.84 | 11.9% | 23792 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.0% | 108 |
| justin.DemonicRage 3.4 | 1.7 | 17.4% | 65 |
| wompi.Numbat 2.1 | 3.2 | 13.1% | 25 |
| hadur117.micro.Saor 0.2 | 3.8 | 11.9% | 4 |
| axeBots.HataMoto 3.09 | 5.3 | 9.3% | 6 |
| ms.Ares 0.19 | 5.7 | 8.8% | 2 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.2% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.8% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.8% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 60.6 | 2 / 35 | 4419 |
| 2 | 4 | 57.9 | 57.1 | 0 / 35 | 4229 |
| 3 | 4 | 55.9 | 53.3 | 1 / 35 | 3914 |
| 4 | 4 | 58.7 | 60.3 | 0 / 35 | 4033 |
| 5 | 4 | 56.7 | 56.5 | 1 / 35 | 3695 |
| 6 | 4 | 56.1 | 55.9 | 0 / 35 | 3502 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 17 | 6% |
| cb.fire.Firestarter 2.0f | 14 | 0% |
| wompi.Numbat 2.1 | 7 | 43% |
| ms.Ares 0.19 | 1 | 0% |

Hadur died in 206 of 210 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 64 | 31% | 65 |
| cb.fire.Firestarter 2.0f | 58 | 28% | 58 |
| wompi.Numbat 2.1 | 32 | 16% | 35 |
| axeBots.HataMoto 3.09 | 18 | 9% | 19 |
| supersample.SuperBoxBot 1.0 | 12 | 6% | 12 |
| ms.Ares 0.19 | 11 | 5% | 10 |
| davidalves.net.DuelistMicroMelee 1.4 | 10 | 5% | 10 |
| GarmBox.Oranges 1.0 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 73.5 | 102 / 210 | 3.39 | 16.3% | 27140 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 16.3% | 102 |
| origin.SleepSiphon 1.7b | 2.3 | 14.0% | 60 |
| jekl.StoneGhost 0.7 | 2.8 | 14.1% | 23 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.3 | 11.2% | 13 |
| mld.Wisdom 1.0 | 4.5 | 10.9% | 3 |
| gg.Wolverine 2.0 | 6.0 | 8.9% | 2 |
| spinnercat.Omen 1.0 | 7.3 | 7.3% | 4 |
| DBall.NUKE 0.1 | 8.3 | 6.9% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.3 | 6.8% | 3 |
| sample.Fire 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 75.2 | 16 / 35 | 4184 |
| 2 | 1 | 68.0 | 81.6 | 21 / 35 | 5012 |
| 3 | 1 | 65.2 | 75.6 | 19 / 35 | 4298 |
| 4 | 1 | 63.4 | 71.1 | 14 / 35 | 4354 |
| 5 | 1 | 64.9 | 71.7 | 18 / 35 | 4758 |
| 6 | 1 | 62.6 | 65.7 | 14 / 35 | 4534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 51 | 96% |
| origin.SleepSiphon 1.7b | 38 | 42% |
| pe.minimelee.SandboxMiniMelee 1.1 | 20 | 100% |
| gg.Wolverine 2.0 | 7 | 71% |
| mld.Wisdom 1.0 | 4 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 100% |
| DBall.NUKE 0.1 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 34 | 31% | 55 |
| mld.Wisdom 1.0 | 29 | 27% | 37 |
| pe.minimelee.SandboxMiniMelee 1.1 | 14 | 13% | 37 |
| jekl.StoneGhost 0.7 | 13 | 12% | 50 |
| gg.Wolverine 2.0 | 7 | 6% | 10 |
| spinnercat.Omen 1.0 | 5 | 5% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 6 |
| DBall.NUKE 0.1 | 2 | 2% | 4 |
| sample.Fire 1.0 | 2 | 2% | 3 |

## Melee bench: F07

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 82.6 | 68 / 210 | 2.56 | 18.4% | 36902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.7 | 18.5% | 68 |
| hadur117.micro.Saor 0.2 | 1.7 | 18.4% | 68 |
| rtk.Tachikoma 1.0 | 2.7 | 15.9% | 57 |
| franzor.Lizt 1.3.1 | 4.2 | 10.7% | 12 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 10.0% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.7% | 0 |
| sample.Target 1.0 | 9.3 | 2.9% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 70.2 | 85.4 | 14 / 35 | 6712 |
| 2 | 1 | 69.1 | 81.9 | 12 / 35 | 6168 |
| 3 | 2 | 68.1 | 76.8 | 12 / 35 | 5590 |
| 4 | 2 | 69.9 | 85.7 | 11 / 35 | 5920 |
| 5 | 2 | 68.3 | 78.7 | 10 / 35 | 6260 |
| 6 | 1 | 69.9 | 87.3 | 9 / 35 | 6252 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 56 | 48% |
| rsalesc.melee.Monk 0.3.6c | 53 | 13% |
| oog.melee.CapuletDroid 1.1 | 23 | 91% |
| franzor.Lizt 1.3.1 | 16 | 75% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 1151. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 74 | 52% | 92 |
| rtk.Tachikoma 1.0 | 46 | 32% | 89 |
| oog.melee.CapuletDroid 1.1 | 9 | 6% | 16 |
| exauge.GateKeeper 1.1.121g | 6 | 4% | 9 |
| franzor.Lizt 1.3.1 | 5 | 3% | 1 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 2 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 77.8 | 90 / 210 | 3.00 | 17.5% | 32102 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.5% | 90 |
| tm.Yuugao 1.0 | 2.3 | 13.4% | 60 |
| shrub.Vapour v159 | 2.8 | 11.9% | 26 |
| Krabb.sliNk.Garm 0.9u | 5.0 | 10.1% | 10 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 10.2% | 14 |
| jwst.DAD.DarkAndDarker 1.1 | 6.2 | 8.9% | 4 |
| m3thos.Eva00 1.1 | 6.2 | 9.1% | 3 |
| qualidafial.MajorDick 1.0.1 | 7.5 | 7.5% | 2 |
| SHAM.WOW 1.4 | 9.3 | 5.8% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.7 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 76.8 | 13 / 35 | 5552 |
| 2 | 1 | 67.8 | 82.5 | 17 / 35 | 5694 |
| 3 | 1 | 65.8 | 76.8 | 16 / 35 | 5007 |
| 4 | 1 | 64.8 | 74.3 | 8 / 35 | 5499 |
| 5 | 1 | 67.2 | 80.6 | 18 / 35 | 5292 |
| 6 | 1 | 66.0 | 75.9 | 18 / 35 | 5058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 46 | 28% |
| Krabb.sliNk.Garm 0.9u | 27 | 85% |
| shrub.Vapour v159 | 27 | 85% |
| jwst.DAD.DarkAndDarker 1.1 | 15 | 93% |
| com.spp.robocode.MostlyHarmless 010 | 11 | 82% |
| m3thos.Eva00 1.1 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 67% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 59 | 49% | 77 |
| Krabb.sliNk.Garm 0.9u | 13 | 11% | 26 |
| com.spp.robocode.MostlyHarmless 010 | 9 | 7% | 23 |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 7% | 21 |
| shrub.Vapour v159 | 8 | 7% | 26 |
| zyx.nano.BacillusComma 1.0 | 7 | 6% | 8 |
| SHAM.WOW 1.4 | 6 | 5% | 10 |
| m3thos.Eva00 1.1 | 5 | 4% | 12 |
| qualidafial.MajorDick 1.0.1 | 5 | 4% | 7 |

## Melee bench: F09

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 63.5 | 38 / 210 | 4.28 | 13.4% | 22774 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 16.6% | 99 |
| kc.micro.Figment 1.0 | 2.5 | 13.3% | 27 |
| hadur117.micro.Saor 0.2 | 2.5 | 13.4% | 38 |
| yagami.Tidus 0.11 | 4.5 | 11.0% | 7 |
| pedersen.Grishnakh 1.0 | 5.2 | 10.3% | 17 |
| mc2.enemy.Original 0.9 | 5.3 | 10.4% | 18 |
| dft.Calliope 5.6 | 7.2 | 8.0% | 4 |
| step.nanoPri 1.0 | 8.2 | 6.4% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.9% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.8 | 56.2 | 7 / 35 | 3776 |
| 2 | 3 | 58.1 | 60.0 | 4 / 35 | 3616 |
| 3 | 3 | 57.2 | 60.0 | 2 / 35 | 3533 |
| 4 | 2 | 60.1 | 64.1 | 7 / 35 | 3997 |
| 5 | 2 | 61.9 | 71.1 | 8 / 35 | 3834 |
| 6 | 2 | 62.3 | 69.8 | 10 / 35 | 4018 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 34 | 56% |
| positive.Portia 1.26e | 30 | 17% |
| pedersen.Grishnakh 1.0 | 8 | 63% |
| yagami.Tidus 0.11 | 6 | 100% |
| mc2.enemy.Original 0.9 | 4 | 0% |
| dft.Calliope 5.6 | 4 | 75% |

Hadur died in 172 of 210 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 60 | 35% | 68 |
| kc.micro.Figment 1.0 | 59 | 34% | 77 |
| yagami.Tidus 0.11 | 13 | 8% | 18 |
| mc2.enemy.Original 0.9 | 13 | 8% | 13 |
| robar.nano.Assertive_Melee 0.2 | 9 | 5% | 9 |
| pedersen.Grishnakh 1.0 | 6 | 3% | 8 |
| step.nanoPri 1.0 | 5 | 3% | 6 |
| rdm.Dueler 0.4x | 4 | 2% | 4 |
| dft.Calliope 5.6 | 3 | 2% | 7 |

## Melee bench: F10

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 83.2 | 93 / 210 | 2.51 | 17.6% | 31367 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.6% | 93 |
| DTF.Kludgy 1.2b | 2.0 | 14.7% | 54 |
| ejb.Polaris 1.0.1 | 3.5 | 12.6% | 31 |
| ne.Chimera 1.2 | 3.8 | 12.1% | 11 |
| vStar.RAFzilla 2.15 | 4.8 | 10.8% | 9 |
| tvv.micro.Antares 1.1.1 | 5.8 | 10.1% | 8 |
| sam.Samspin 1.0 | 7.7 | 6.0% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 6.2% | 0 |
| kurios.DOSexe .9b | 8.5 | 5.7% | 3 |
| donjezza.Muncho 1.0 | 9.7 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 84.8 | 18 / 35 | 5506 |
| 2 | 1 | 67.0 | 82.2 | 14 / 35 | 5388 |
| 3 | 1 | 66.7 | 84.1 | 15 / 35 | 5029 |
| 4 | 1 | 67.7 | 85.4 | 18 / 35 | 5452 |
| 5 | 1 | 66.5 | 81.0 | 15 / 35 | 5009 |
| 6 | 1 | 66.3 | 81.9 | 13 / 35 | 4983 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 50 | 28% |
| ejb.Polaris 1.0.1 | 41 | 61% |
| ne.Chimera 1.2 | 22 | 77% |
| vStar.RAFzilla 2.15 | 21 | 81% |
| tvv.micro.Antares 1.1.1 | 12 | 75% |
| donjezza.Muncho 1.0 | 5 | 80% |
| kurios.DOSexe .9b | 3 | 100% |
| sam.Samspin 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 52 | 44% | 65 |
| ejb.Polaris 1.0.1 | 22 | 19% | 47 |
| ne.Chimera 1.2 | 16 | 14% | 31 |
| tvv.micro.Antares 1.1.1 | 8 | 7% | 16 |
| vStar.RAFzilla 2.15 | 6 | 5% | 22 |
| kurios.DOSexe .9b | 5 | 4% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 4% | 7 |
| donjezza.Muncho 1.0 | 2 | 2% | 7 |
| sam.Samspin 1.0 | 1 | 1% | 4 |

## Melee bench: F11

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 75.4 | 50 / 210 | 3.21 | 15.8% | 27262 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 17.7% | 98 |
| hadur117.micro.Saor 0.2 | 1.8 | 15.8% | 50 |
| cx.mini.Nimrod 0.55 | 3.2 | 11.6% | 21 |
| djc.DynaBot 0.1.1 | 4.0 | 10.5% | 9 |
| br2.MobyDickBot 1.6 | 5.0 | 9.1% | 10 |
| uji.YellohFellah 1.0 | 6.2 | 8.3% | 9 |
| rdt199.Warlord 0.73 | 6.7 | 8.4% | 10 |
| KiraNL.Chupacabra 0.4 | 8.2 | 7.6% | 3 |
| stelo.MirrorNano 1.3 | 9.3 | 5.4% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 68.3 | 9 / 35 | 4261 |
| 2 | 2 | 64.8 | 79.0 | 9 / 35 | 4616 |
| 3 | 2 | 61.5 | 67.0 | 6 / 35 | 4350 |
| 4 | 2 | 64.6 | 78.1 | 8 / 35 | 4484 |
| 5 | 1 | 65.9 | 81.0 | 11 / 35 | 4811 |
| 6 | 2 | 64.9 | 79.4 | 7 / 35 | 4740 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 58 | 22% |
| cx.mini.Nimrod 0.55 | 20 | 55% |
| djc.DynaBot 0.1.1 | 11 | 91% |
| uji.YellohFellah 1.0 | 11 | 73% |
| br2.MobyDickBot 1.6 | 6 | 67% |
| rdt199.Warlord 0.73 | 5 | 80% |

Hadur died in 160 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 95 | 59% | 108 |
| cx.mini.Nimrod 0.55 | 23 | 14% | 33 |
| rdt199.Warlord 0.73 | 11 | 7% | 12 |
| br2.MobyDickBot 1.6 | 9 | 6% | 15 |
| KiraNL.Chupacabra 0.4 | 9 | 6% | 11 |
| djc.DynaBot 0.1.1 | 4 | 3% | 12 |
| stelo.MirrorNano 1.3 | 4 | 3% | 5 |
| uji.YellohFellah 1.0 | 3 | 2% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 1% | 3 |

## Melee bench: F12

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 76.2 | 87 / 210 | 3.14 | 16.2% | 23946 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 16.2% | 87 |
| nat.PallasHawk 1.0 | 2.8 | 13.1% | 41 |
| bts.wiki.RipCurl 0.9b | 2.8 | 13.3% | 31 |
| darkcanuck.Leon 1.01 | 3.3 | 13.3% | 29 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.3% | 15 |
| jrm.Test0 1.0 | 6.2 | 8.5% | 2 |
| cs.sheldor.Talon 1.1 | 7.5 | 7.1% | 0 |
| jp.Perpy 16.0 | 8.2 | 7.1% | 2 |
| jaybot.bots.Oddball 4.0 | 8.8 | 5.8% | 3 |
| stuff.Vlad 0.1 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 73.7 | 12 / 35 | 3861 |
| 2 | 1 | 62.9 | 70.5 | 13 / 35 | 3936 |
| 3 | 1 | 66.0 | 82.9 | 16 / 35 | 4065 |
| 4 | 1 | 62.7 | 71.7 | 12 / 35 | 3781 |
| 5 | 1 | 65.2 | 76.5 | 17 / 35 | 4066 |
| 6 | 1 | 66.3 | 82.2 | 17 / 35 | 4237 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 45 | 78% |
| nat.PallasHawk 1.0 | 29 | 66% |
| bts.wiki.RipCurl 0.9b | 22 | 64% |
| brainfade.melee.Genghis 0.36 | 11 | 91% |
| jaybot.bots.Oddball 4.0 | 4 | 50% |
| jrm.Test0 1.0 | 3 | 67% |
| jp.Perpy 16.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 658. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 38 | 31% | 53 |
| darkcanuck.Leon 1.01 | 23 | 19% | 62 |
| nat.PallasHawk 1.0 | 23 | 19% | 40 |
| brainfade.melee.Genghis 0.36 | 13 | 11% | 18 |
| jp.Perpy 16.0 | 8 | 7% | 11 |
| cs.sheldor.Talon 1.1 | 7 | 6% | 11 |
| jrm.Test0 1.0 | 7 | 6% | 8 |
| jaybot.bots.Oddball 4.0 | 3 | 2% | 5 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |

## Melee bench: F13

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 65.4 | 7 / 210 | 4.11 | 13.1% | 24795 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 17.1% | 61 |
| mn.Combat 3.25.0 | 1.5 | 17.0% | 107 |
| hadur117.micro.Saor 0.2 | 3.2 | 13.1% | 7 |
| shinh.Entangled 0.3 | 4.3 | 12.1% | 24 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.6% | 10 |
| apc.Colossus2 0.17 | 6.0 | 8.3% | 1 |
| stelo.Wang 1.0 | 7.2 | 7.1% | 1 |
| ayk.WallHugger 1.0 | 7.8 | 5.7% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.6 | 60.6 | 1 / 35 | 3899 |
| 2 | 3 | 59.6 | 64.1 | 0 / 35 | 4204 |
| 3 | 4 | 59.9 | 62.9 | 0 / 35 | 4334 |
| 4 | 3 | 63.0 | 72.7 | 1 / 35 | 4708 |
| 5 | 3 | 59.1 | 64.8 | 3 / 35 | 3638 |
| 6 | 3 | 60.5 | 67.6 | 2 / 35 | 4012 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 27 | 4% |
| ags.Glacier 0.2.11 | 25 | 8% |
| shinh.Entangled 0.3 | 8 | 38% |
| gh.micro.Gruweltje 0.7 | 3 | 33% |

Hadur died in 204 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 69 | 34% | 71 |
| mn.Combat 3.25.0 | 66 | 32% | 67 |
| shinh.Entangled 0.3 | 25 | 12% | 26 |
| gh.micro.Gruweltje 0.7 | 14 | 7% | 17 |
| stelo.Wang 1.0 | 10 | 5% | 10 |
| maribo.FollowFire 1 | 8 | 4% | 8 |
| ayk.WallHugger 1.0 | 5 | 2% | 5 |
| apc.Colossus2 0.17 | 4 | 2% | 4 |
| sample.Tracker 1.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 75.7 | 116 / 210 | 3.19 | 17.1% | 30155 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.1% | 116 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.1% | 23 |
| catcat20.shape.Theta 0.018 | 3.2 | 12.7% | 43 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.6% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 9.8% | 7 |
| sanyi.mikrobi.Roberto 1.0 | 5.7 | 9.7% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 5.7 | 9.7% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 8.3% | 12 |
| pa.Improved 1.0 | 9.0 | 6.2% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 79.7 | 18 / 35 | 4991 |
| 2 | 1 | 66.4 | 77.5 | 20 / 35 | 4914 |
| 3 | 1 | 62.3 | 63.5 | 13 / 35 | 4816 |
| 4 | 1 | 67.9 | 83.8 | 20 / 35 | 5320 |
| 5 | 1 | 68.0 | 80.3 | 26 / 35 | 5172 |
| 6 | 1 | 64.2 | 69.2 | 19 / 35 | 4942 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 66 | 88% |
| catcat20.shape.Theta 0.018 | 37 | 59% |
| co.edu.usb.rc.LidisTron 1.0 | 16 | 94% |
| sanyi.mikrobi.Roberto 1.0 | 10 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 38% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 603. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 40 | 43% | 105 |
| catcat20.shape.Theta 0.018 | 23 | 24% | 43 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 11% | 19 |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 11% | 12 |
| sanyi.mikrobi.Roberto 1.0 | 5 | 5% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 2% | 6 |
| pa.Improved 1.0 | 2 | 2% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 2% | 5 |

## Melee bench: F15

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 81.0 | 105 / 210 | 2.71 | 18.6% | 35245 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.6% | 105 |
| emp.Yngwie 1.11 | 2.3 | 13.5% | 59 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.0% | 15 |
| mld.DustBunny 3.8 | 4.2 | 11.7% | 4 |
| kawigi.robot.Girl 1.2 | 5.3 | 9.8% | 17 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.0% | 8 |
| Grystrion.TrackerWO 1.0 | 7.7 | 7.1% | 1 |
| lambdaxy.TBot 0.1 | 7.8 | 6.7% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.8% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 80.6 | 16 / 35 | 6280 |
| 2 | 1 | 68.1 | 80.3 | 19 / 35 | 5849 |
| 3 | 1 | 67.4 | 79.0 | 19 / 35 | 5591 |
| 4 | 1 | 67.5 | 80.3 | 17 / 35 | 5594 |
| 5 | 1 | 67.7 | 79.7 | 17 / 35 | 5804 |
| 6 | 1 | 69.3 | 85.7 | 17 / 35 | 6127 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 53 | 45% |
| kawigi.micro.Shiz 1.1 | 38 | 92% |
| mld.DustBunny 3.8 | 21 | 100% |
| kawigi.robot.Girl 1.2 | 11 | 91% |
| divineomega.TrialBot 0.003 | 9 | 89% |
| cb.nano.Insomnia 1.0 | 7 | 71% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 966. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 50 | 48% | 86 |
| cb.nano.Insomnia 1.0 | 14 | 13% | 11 |
| kawigi.micro.Shiz 1.1 | 10 | 10% | 39 |
| kawigi.robot.Girl 1.2 | 8 | 8% | 15 |
| mld.DustBunny 3.8 | 7 | 7% | 33 |
| lambdaxy.TBot 0.1 | 5 | 5% | 8 |
| Grystrion.TrackerWO 1.0 | 5 | 5% | 5 |
| divineomega.TrialBot 0.003 | 4 | 4% | 10 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 2% | 2 |

## Melee bench: F16

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 82.9 | 81 / 210 | 2.54 | 18.5% | 34437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.5% | 81 |
| gh.Griezel 0.5.2 | 2.2 | 16.6% | 79 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.4% | 5 |
| techdude.forest.FlamingForest 1.1 | 3.8 | 11.3% | 35 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.0% | 1 |
| tvv.nano.Polaris 1.2 | 5.7 | 8.6% | 4 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.5% | 3 |
| asd.Cthulhu 1.3 | 8.5 | 5.2% | 0 |
| repositorio.NanoStep 1.0 | 9.0 | 5.2% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.3 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 89.2 | 17 / 35 | 6269 |
| 2 | 1 | 68.4 | 86.3 | 15 / 35 | 5179 |
| 3 | 1 | 66.4 | 78.4 | 12 / 35 | 5350 |
| 4 | 1 | 68.2 | 80.3 | 11 / 35 | 5936 |
| 5 | 1 | 68.7 | 81.3 | 12 / 35 | 6116 |
| 6 | 1 | 68.1 | 81.9 | 14 / 35 | 5587 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 83 | 31% |
| techdude.forest.FlamingForest 1.1 | 28 | 39% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 25 | 96% |
| bvh.fnr.Fenrir 0.36l | 7 | 100% |
| stelo.IntrinsicVolatility 1.4 | 7 | 86% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| tvv.nano.Polaris 1.2 | 3 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 1424. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 70 | 54% | 103 |
| techdude.forest.FlamingForest 1.1 | 20 | 16% | 30 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 12 | 9% | 31 |
| stelo.IntrinsicVolatility 1.4 | 9 | 7% | 16 |
| bvh.fnr.Fenrir 0.36l | 9 | 7% | 11 |
| tvv.nano.Polaris 1.2 | 3 | 2% | 5 |
| asd.Cthulhu 1.3 | 3 | 2% | 3 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 8 |
| repositorio.NanoStep 1.0 | 1 | 1% | 2 |

## Melee bench: F17

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 82.5 | 92 / 210 | 2.57 | 17.8% | 29535 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.8% | 92 |
| et.Predator 1.8 | 3.2 | 12.3% | 22 |
| oog.melee.Mercutio 1.0 | 3.2 | 12.7% | 31 |
| cx.BlestPain 1.41 | 4.0 | 11.7% | 36 |
| nic.Nicator 2.4 | 4.2 | 11.6% | 21 |
| ahf.NanoAndrew .4 | 5.7 | 10.2% | 6 |
| maribo.melee.BMV 0.1 | 6.8 | 9.0% | 2 |
| tex.Longbot 0.4 | 8.2 | 6.3% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.8 | 5.7% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 87.3 | 19 / 35 | 4790 |
| 2 | 1 | 68.5 | 87.3 | 17 / 35 | 5110 |
| 3 | 1 | 63.4 | 71.1 | 10 / 35 | 4420 |
| 4 | 1 | 68.8 | 86.0 | 19 / 35 | 5343 |
| 5 | 1 | 66.2 | 79.0 | 13 / 35 | 4825 |
| 6 | 1 | 67.7 | 84.4 | 14 / 35 | 5047 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 36 | 75% |
| oog.melee.Mercutio 1.0 | 35 | 51% |
| nic.Nicator 2.4 | 33 | 70% |
| cx.BlestPain 1.41 | 25 | 36% |
| ahf.NanoAndrew .4 | 10 | 100% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 1055. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 28 | 24% | 54 |
| cx.BlestPain 1.41 | 28 | 24% | 44 |
| oog.melee.Mercutio 1.0 | 24 | 20% | 36 |
| nic.Nicator 2.4 | 17 | 14% | 36 |
| ahf.NanoAndrew .4 | 12 | 10% | 23 |
| maribo.melee.BMV 0.1 | 5 | 4% | 7 |
| tex.Longbot 0.4 | 3 | 3% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 3 |
| goblin.Bender 2.4 | 1 | 1% | 3 |

## Melee bench: F18

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 81.9 | 115 / 210 | 2.63 | 17.9% | 27559 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.9% | 115 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.8% | 37 |
| agd.Mooserwirt2 2.7 | 3.3 | 11.8% | 24 |
| uji.DBH 1.1 | 4.5 | 10.2% | 9 |
| ratosh.Nobo 0.21 | 4.7 | 10.2% | 5 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.4% | 6 |
| sigterm.Sigterm 1.0 | 7.2 | 8.0% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.8% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.2 | 5.8% | 0 |
| stelo.WangRobot 1.0 | 9.8 | 5.1% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 84.1 | 24 / 35 | 4484 |
| 2 | 1 | 66.4 | 80.0 | 18 / 35 | 4725 |
| 3 | 1 | 62.9 | 71.7 | 14 / 35 | 3833 |
| 4 | 1 | 68.1 | 83.8 | 19 / 35 | 5265 |
| 5 | 1 | 66.2 | 81.3 | 16 / 35 | 4467 |
| 6 | 1 | 69.6 | 90.5 | 24 / 35 | 4785 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 45 | 73% |
| uji.DBH 1.1 | 25 | 80% |
| agd.Mooserwirt2 2.7 | 25 | 72% |
| sigterm.Sigterm 1.0 | 20 | 95% |
| ratosh.Nobo 0.21 | 13 | 77% |
| spinnercat.Robovirus 2.718 | 7 | 71% |
| stelo.WangRobot 1.0 | 7 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 50% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 33 | 34% | 67 |
| agd.Mooserwirt2 2.7 | 23 | 24% | 47 |
| uji.DBH 1.1 | 12 | 12% | 20 |
| kawigi.mini.Fhqwhgads 1.1 | 11 | 11% | 19 |
| ratosh.Nobo 0.21 | 8 | 8% | 18 |
| sigterm.Sigterm 1.0 | 4 | 4% | 18 |
| stelo.WangRobot 1.0 | 3 | 3% | 8 |
| spinnercat.Robovirus 2.718 | 3 | 3% | 8 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 3 |

## Melee bench: F19

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 90.7 | 163 / 210 | 1.83 | 20.3% | 33201 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 20.3% | 163 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.7% | 17 |
| mld.Infinity 2.2 | 3.0 | 13.6% | 23 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.3% | 1 |
| erdnis.Rover 0.3 | 4.8 | 10.9% | 1 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.0% | 4 |
| pac.ABC 2.1 | 7.2 | 7.1% | 1 |
| mbh.Mbh 0.1 | 7.8 | 6.9% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.9% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 89.5 | 25 / 35 | 5097 |
| 2 | 1 | 71.7 | 94.0 | 27 / 35 | 5524 |
| 3 | 1 | 71.1 | 91.4 | 28 / 35 | 5667 |
| 4 | 1 | 71.5 | 91.7 | 26 / 35 | 5789 |
| 5 | 1 | 70.9 | 87.9 | 29 / 35 | 5965 |
| 6 | 1 | 70.7 | 89.8 | 28 / 35 | 5159 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 92 | 91% |
| mld.Infinity 2.2 | 53 | 91% |
| erdnis.Rover 0.3 | 8 | 100% |
| krillr.mini.JointStrike 2.0.0 | 8 | 100% |
| patson.PatsonTestBot 1.0 | 7 | 86% |
| mbh.Mbh 0.1 | 4 | 100% |
| pac.ABC 2.1 | 2 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 17 | 35% | 33 |
| davidalves.net.DuelistMiniMelee 1.2 | 15 | 31% | 96 |
| krillr.mini.JointStrike 2.0.0 | 5 | 10% | 20 |
| erdnis.Rover 0.3 | 4 | 8% | 21 |
| patson.PatsonTestBot 1.0 | 3 | 6% | 7 |
| pac.ABC 2.1 | 2 | 4% | 9 |
| pbg.R2D2 1.0 | 1 | 2% | 12 |
| mbh.Mbh 0.1 | 0 | 0% | 11 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.0 | 117 / 210 | 2.08 | 19.7% | 34402 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.7% | 117 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.5% | 47 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 10.8% | 1 |
| fwb.Nine 1.0.1 | 4.0 | 10.5% | 19 |
| catcat20.Rabbit 0.001 | 4.2 | 10.3% | 19 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 8.1% | 1 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 8.1% | 1 |
| bayen.nut.Squirrel 1.615 | 7.8 | 6.9% | 4 |
| ntc.ControlledChaos 1.1.4 | 8.7 | 6.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 92.4 | 20 / 35 | 5881 |
| 2 | 1 | 67.9 | 83.2 | 18 / 35 | 5339 |
| 3 | 1 | 70.0 | 89.2 | 21 / 35 | 5736 |
| 4 | 1 | 68.9 | 83.8 | 18 / 35 | 5854 |
| 5 | 1 | 69.2 | 87.9 | 20 / 35 | 5511 |
| 6 | 1 | 71.0 | 91.7 | 20 / 35 | 6081 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 87 | 62% |
| fwb.Nine 1.0.1 | 30 | 67% |
| catcat20.Rabbit 0.001 | 28 | 64% |
| nz.jdc.nano.GridFu 1.0 | 12 | 100% |
| bayen.nut.Squirrel 1.615 | 7 | 86% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 1094. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 49 | 53% | 92 |
| catcat20.Rabbit 0.001 | 17 | 18% | 41 |
| fwb.Nine 1.0.1 | 14 | 15% | 10 |
| djdjdj.NanoSkunk10 1.0 | 6 | 6% | 14 |
| nz.jdc.nano.GridFu 1.0 | 3 | 3% | 23 |
| bayen.nut.Squirrel 1.615 | 3 | 3% | 13 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 7 |

## Melee bench: F21

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 86.0 | 118 / 210 | 2.26 | 19.3% | 33180 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.3% | 118 |
| eem.EvBot v4.6.16 | 2.0 | 16.5% | 70 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.7% | 7 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 4 |
| eld.Hmm 1.0 | 5.3 | 8.3% | 8 |
| oa.weak.BotherBot 0.1 | 5.8 | 8.1% | 1 |
| el.JumpShoot 0.2 | 7.3 | 6.5% | 2 |
| fire219.CatBot 1.0 | 8.3 | 5.8% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.9% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 88.3 | 23 / 35 | 5602 |
| 2 | 1 | 68.2 | 83.2 | 15 / 35 | 5349 |
| 3 | 1 | 69.3 | 83.2 | 22 / 35 | 5655 |
| 4 | 1 | 69.6 | 89.2 | 22 / 35 | 5316 |
| 5 | 1 | 69.3 | 85.7 | 19 / 35 | 5370 |
| 6 | 1 | 69.8 | 86.3 | 17 / 35 | 5888 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 90 | 52% |
| dummy.mini.Scimitar 1.01 | 41 | 93% |
| cf.RiO.RiOx 4.2.1 | 20 | 95% |
| eld.Hmm 1.0 | 10 | 90% |
| oa.weak.BotherBot 0.1 | 5 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 1083. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 49 | 53% | 84 |
| dummy.mini.Scimitar 1.01 | 15 | 16% | 56 |
| cf.RiO.RiOx 4.2.1 | 8 | 9% | 21 |
| oa.weak.BotherBot 0.1 | 6 | 7% | 10 |
| fire219.CatBot 1.0 | 5 | 5% | 5 |
| eld.Hmm 1.0 | 3 | 3% | 25 |
| arthord.MannyPacquiao Beta | 3 | 3% | 5 |
| el.JumpShoot 0.2 | 3 | 3% | 4 |

## Melee bench: F22

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.5 | 77 / 210 | 2.48 | 17.5% | 29814 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.5 | 17.5% | 77 |
| pe.SandboxDT 2.71m | 1.8 | 16.4% | 66 |
| kvk.HebusLeTroll 0.35 | 2.8 | 14.7% | 44 |
| jlm.javaDisturbance 0.59 | 3.8 | 12.6% | 21 |
| bigpete.Stewie 1.0 | 5.0 | 10.4% | 2 |
| yk.JahRoslav 1.1 | 6.8 | 6.6% | 0 |
| gg.Squaraus 0.6 | 7.0 | 6.7% | 0 |
| tad.Dalek98 0.98 | 7.3 | 6.7% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 5.2% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 78.4 | 17 / 35 | 4698 |
| 2 | 1 | 68.8 | 88.9 | 13 / 35 | 5281 |
| 3 | 2 | 65.7 | 78.7 | 9 / 35 | 4778 |
| 4 | 2 | 68.3 | 85.7 | 14 / 35 | 5126 |
| 5 | 1 | 67.8 | 86.7 | 12 / 35 | 5173 |
| 6 | 2 | 67.0 | 82.9 | 12 / 35 | 4758 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 53 | 49% |
| pe.SandboxDT 2.71m | 51 | 39% |
| jlm.javaDisturbance 0.59 | 35 | 57% |
| bigpete.Stewie 1.0 | 7 | 86% |
| yk.JahRoslav 1.1 | 3 | 100% |
| pbg.NinjaX 1.2 | 2 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 988. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 47 | 35% | 75 |
| kvk.HebusLeTroll 0.35 | 47 | 35% | 66 |
| jlm.javaDisturbance 0.59 | 30 | 23% | 46 |
| tad.Dalek98 0.98 | 5 | 4% | 3 |
| bigpete.Stewie 1.0 | 3 | 2% | 9 |
| gg.Squaraus 0.6 | 1 | 1% | 4 |
| pbg.NinjaX 1.2 | 0 | 0% | 4 |
| yk.JahRoslav 1.1 | 0 | 0% | 3 |

## Melee bench: F23

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 78.2 | 82 / 210 | 2.96 | 18.1% | 35556 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 18.1% | 82 |
| pe.SandboxLump 1.52 | 1.7 | 17.5% | 78 |
| cre.Karolos 0.32 | 3.0 | 13.8% | 30 |
| stelo.AreaTargetingBot 1.1 | 5.2 | 9.5% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.3 | 9.3% | 3 |
| stelo.RamTrackSurfer 1.2 | 5.7 | 9.3% | 6 |
| cw.megas.Blade 0.8 | 6.5 | 8.7% | 0 |
| sample.Walls 1.0 | 7.3 | 8.1% | 5 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.8% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 71.4 | 11 / 35 | 5670 |
| 2 | 1 | 68.3 | 79.0 | 14 / 35 | 5908 |
| 3 | 1 | 69.5 | 82.9 | 14 / 35 | 6272 |
| 4 | 1 | 68.9 | 79.4 | 15 / 35 | 6141 |
| 5 | 2 | 67.4 | 77.1 | 14 / 35 | 5720 |
| 6 | 1 | 69.1 | 79.4 | 14 / 35 | 5845 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 74 | 45% |
| cre.Karolos 0.32 | 25 | 60% |
| stelo.AreaTargetingBot 1.1 | 17 | 94% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 100% |
| stelo.RamTrackSurfer 1.2 | 6 | 83% |
| sample.Walls 1.0 | 2 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 670. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 69 | 54% | 103 |
| cre.Karolos 0.32 | 26 | 20% | 42 |
| stelo.AreaTargetingBot 1.1 | 14 | 11% | 29 |
| sample.Walls 1.0 | 7 | 5% | 10 |
| cw.megas.Blade 0.8 | 5 | 4% | 8 |
| stelo.RamTrackSurfer 1.2 | 5 | 4% | 8 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 2% | 8 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 69.6 | 48 / 210 | 3.73 | 14.3% | 23141 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.5 | 14.3% | 48 |
| rz.GlowBlowMelee 1.4 | 2.2 | 13.8% | 45 |
| florent.XSeries.X2 0.12 | 2.7 | 13.5% | 43 |
| davidalves.Phoenix 0.54 | 3.8 | 12.9% | 46 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.9% | 18 |
| oog.melee.Corsair 1.0 | 6.0 | 9.0% | 3 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 7.5% | 6 |
| lunchie.Lunchbox 0.93 | 8.5 | 6.3% | 1 |
| as.FrankTheTank 1.3 | 8.7 | 5.8% | 0 |
| evd.X1 0.01 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.1 | 71.4 | 9 / 35 | 3418 |
| 2 | 1 | 63.9 | 77.5 | 9 / 35 | 4140 |
| 3 | 3 | 60.2 | 65.4 | 4 / 35 | 4027 |
| 4 | 1 | 62.1 | 70.8 | 6 / 35 | 4075 |
| 5 | 2 | 59.8 | 65.4 | 10 / 35 | 3679 |
| 6 | 1 | 60.8 | 67.3 | 10 / 35 | 3802 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 27 | 33% |
| rz.GlowBlowMelee 1.4 | 27 | 44% |
| florent.XSeries.X2 0.12 | 25 | 32% |
| pedersen.Ugluk 1.1.1 | 13 | 69% |
| stelo.SoJNanoMelee 1.1 | 9 | 78% |
| oog.melee.Corsair 1.0 | 2 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 163 of 210 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 44 | 27% | 54 |
| rz.GlowBlowMelee 1.4 | 33 | 20% | 45 |
| davidalves.Phoenix 0.54 | 32 | 20% | 38 |
| pedersen.Ugluk 1.1.1 | 16 | 10% | 24 |
| evd.X1 0.01 | 15 | 9% | 15 |
| stelo.SoJNanoMelee 1.1 | 10 | 6% | 16 |
| oog.melee.Corsair 1.0 | 7 | 4% | 12 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 4 |
| as.FrankTheTank 1.3 | 3 | 2% | 2 |

## Melee bench: F25

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 82.9 | 126 / 210 | 2.54 | 18.2% | 26317 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.2% | 126 |
| voidious.mini.BrokenSword 2.0.3 | 2.8 | 12.9% | 19 |
| voidious.micro.BlitzBat 1.05 | 3.2 | 12.2% | 12 |
| jdw.Hurricane 1.4 | 3.3 | 11.7% | 26 |
| ds.Oo 2.2 | 5.0 | 9.9% | 12 |
| gre.svman4.Morfeas 1.4.1 | 5.7 | 9.3% | 8 |
| gjr.Cephalosporin 0.1 | 7.2 | 7.8% | 5 |
| awesomeness.Elite 1.0 | 7.8 | 7.4% | 2 |
| adt.Ar2 1.1 | 9.0 | 6.2% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.9 | 24 / 35 | 4703 |
| 2 | 1 | 69.0 | 89.5 | 23 / 35 | 4558 |
| 3 | 1 | 66.2 | 79.0 | 20 / 35 | 4169 |
| 4 | 1 | 67.3 | 82.2 | 20 / 35 | 4455 |
| 5 | 1 | 66.5 | 80.0 | 18 / 35 | 4487 |
| 6 | 1 | 65.7 | 77.8 | 21 / 35 | 3945 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 43 | 88% |
| voidious.micro.BlitzBat 1.05 | 41 | 95% |
| jdw.Hurricane 1.4 | 25 | 80% |
| ds.Oo 2.2 | 13 | 69% |
| gre.svman4.Morfeas 1.4.1 | 9 | 67% |
| gjr.Cephalosporin 0.1 | 6 | 100% |
| awesomeness.Elite 1.0 | 6 | 100% |
| adt.Ar2 1.1 | 2 | 50% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 21 | 25% | 39 |
| voidious.mini.BrokenSword 2.0.3 | 17 | 20% | 52 |
| voidious.micro.BlitzBat 1.05 | 14 | 16% | 51 |
| ds.Oo 2.2 | 10 | 12% | 26 |
| gre.svman4.Morfeas 1.4.1 | 9 | 11% | 14 |
| awesomeness.Elite 1.0 | 6 | 7% | 9 |
| adt.Ar2 1.1 | 4 | 5% | 7 |
| amk.ChumbaMini 0.2 | 2 | 2% | 3 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 9 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 80.8 | 86 / 210 | 2.73 | 17.4% | 31827 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.4% | 86 |
| ak.Fermat 2.0 | 2.2 | 15.5% | 62 |
| shu.nitro.LENIN .T34 | 3.3 | 12.1% | 28 |
| lrem.Spectre 0.4.4 | 3.8 | 12.0% | 20 |
| js.PinBall 1.6 | 5.3 | 10.4% | 5 |
| gh.mini.GrubbmOne 1.0 | 5.5 | 10.3% | 5 |
| jaybot.adv.bots.JayBot 2.0 | 6.8 | 8.9% | 4 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 7.0% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 76.8 | 9 / 35 | 5197 |
| 2 | 1 | 66.7 | 77.8 | 14 / 35 | 5355 |
| 3 | 1 | 68.0 | 82.5 | 14 / 35 | 5355 |
| 4 | 1 | 67.5 | 80.6 | 17 / 35 | 5321 |
| 5 | 1 | 68.3 | 86.7 | 15 / 35 | 5720 |
| 6 | 1 | 67.0 | 80.3 | 17 / 35 | 4879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 52 | 35% |
| shu.nitro.LENIN .T34 | 34 | 59% |
| lrem.Spectre 0.4.4 | 33 | 67% |
| js.PinBall 1.6 | 11 | 91% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 100% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 57 | 45% | 69 |
| shu.nitro.LENIN .T34 | 24 | 19% | 49 |
| lrem.Spectre 0.4.4 | 16 | 13% | 31 |
| js.PinBall 1.6 | 10 | 8% | 23 |
| fullsail.LaxativeTeaTwo 1.0 | 8 | 6% | 15 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 4% | 12 |
| gh.mini.GrubbmOne 1.0 | 5 | 4% | 11 |
| sample.SpinBot 1.0 | 1 | 1% | 0 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 82.3 | 123 / 210 | 2.60 | 18.1% | 28393 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.1% | 123 |
| mk.Alpha 0.2.1 | 2.0 | 14.4% | 50 |
| sheldor.melee.nano.TestMelee 0.1 | 3.5 | 10.8% | 11 |
| EH.Eagle 1.0.6 | 4.0 | 10.6% | 5 |
| wee.Gem 1.8.4 | 4.7 | 10.1% | 15 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 9.3% | 2 |
| caimano.Furia_Ceca 0.22 | 8.0 | 7.3% | 2 |
| joe.ADinosaur 1.0 | 8.0 | 7.7% | 1 |
| throxbot.ThroxBot 0.1 | 8.3 | 6.9% | 1 |
| cs.Grudge 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 82.2 | 19 / 35 | 4373 |
| 2 | 1 | 66.5 | 80.3 | 19 / 35 | 4769 |
| 3 | 1 | 65.4 | 75.2 | 19 / 35 | 4386 |
| 4 | 1 | 69.1 | 87.0 | 25 / 35 | 5260 |
| 5 | 1 | 66.4 | 77.8 | 23 / 35 | 4548 |
| 6 | 1 | 69.1 | 91.1 | 18 / 35 | 5057 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 75 | 73% |
| EH.Eagle 1.0.6 | 23 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 21 | 90% |
| wee.Gem 1.8.4 | 19 | 89% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| throxbot.ThroxBot 0.1 | 1 | 0% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 38 | 43% | 96 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 13% | 32 |
| joe.ADinosaur 1.0 | 11 | 13% | 14 |
| caimano.Furia_Ceca 0.22 | 8 | 9% | 10 |
| wee.Gem 1.8.4 | 7 | 8% | 16 |
| EH.Eagle 1.0.6 | 6 | 7% | 26 |
| throxbot.ThroxBot 0.1 | 4 | 5% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 3% | 10 |

## Melee bench: F28

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.1 | 130 / 210 | 2.16 | 18.7% | 26989 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.7% | 130 |
| kid.test.NightFox .2 | 2.2 | 14.1% | 24 |
| uji.Antique 1.0 | 3.5 | 11.3% | 23 |
| qohnil.blot.BlotBot 3.61 | 3.7 | 11.6% | 24 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.1% | 3 |
| ahr.ice.Ice 1.0.2 | 6.5 | 7.8% | 1 |
| amk.ChumbaWumba 0.3 | 7.0 | 7.7% | 3 |
| matt.advanced.Katana 1.0 | 8.0 | 6.8% | 2 |
| stelo.Lifestealer 1.0 | 9.2 | 5.8% | 0 |
| stelo.PianistNano 1.2 | 9.3 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 82.9 | 21 / 35 | 4111 |
| 2 | 1 | 69.5 | 90.8 | 25 / 35 | 4670 |
| 3 | 1 | 68.5 | 87.6 | 20 / 35 | 4867 |
| 4 | 1 | 68.6 | 88.6 | 21 / 35 | 4685 |
| 5 | 1 | 67.1 | 84.8 | 19 / 35 | 4275 |
| 6 | 1 | 68.3 | 87.9 | 24 / 35 | 4381 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 81 | 83% |
| uji.Antique 1.0 | 35 | 77% |
| qohnil.blot.BlotBot 3.61 | 27 | 59% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| amk.ChumbaWumba 0.3 | 5 | 80% |
| ahr.ice.Ice 1.0.2 | 4 | 100% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 21 | 26% | 45 |
| kid.test.NightFox .2 | 20 | 25% | 76 |
| pfvicm.Sobieski 7.2.3b | 15 | 19% | 20 |
| qohnil.blot.BlotBot 3.61 | 14 | 18% | 35 |
| amk.ChumbaWumba 0.3 | 6 | 8% | 15 |
| ahr.ice.Ice 1.0.2 | 2 | 3% | 7 |
| stelo.PianistNano 1.2 | 1 | 1% | 4 |
| stelo.Lifestealer 1.0 | 1 | 1% | 3 |
| matt.advanced.Katana 1.0 | 0 | 0% | 3 |

## Melee bench: F29

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.2 | 83 / 210 | 2.69 | 17.7% | 28756 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.7% | 83 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.6% | 67 |
| deewiant.Anomaly 0.2 | 3.3 | 13.7% | 43 |
| myl.micro.Troodon 1.10 | 3.8 | 11.4% | 4 |
| jok.PheonixM 0.1.2 | 4.7 | 10.4% | 8 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.3% | 0 |
| DBall.Anarchy 0.1 | 6.8 | 7.1% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 5.8% | 0 |
| ap.Frederick 1.1 | 8.8 | 5.6% | 2 |
| jangs.ns51 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 80.0 | 12 / 35 | 4883 |
| 2 | 1 | 67.7 | 83.2 | 17 / 35 | 4659 |
| 3 | 1 | 67.3 | 81.3 | 14 / 35 | 4720 |
| 4 | 1 | 65.9 | 78.4 | 10 / 35 | 4737 |
| 5 | 1 | 69.5 | 87.9 | 16 / 35 | 5184 |
| 6 | 1 | 66.0 | 76.5 | 14 / 35 | 4573 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 50 | 58% |
| zyx.mega.YersiniaPestis 3.1 | 48 | 21% |
| myl.micro.Troodon 1.10 | 21 | 100% |
| DBall.Anarchy 0.1 | 12 | 100% |
| jok.PheonixM 0.1.2 | 9 | 89% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 991. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 56 | 44% | 69 |
| deewiant.Anomaly 0.2 | 43 | 34% | 79 |
| myl.micro.Troodon 1.10 | 13 | 10% | 27 |
| jok.PheonixM 0.1.2 | 9 | 7% | 14 |
| ph.melee.ArcherME 0.3 | 4 | 3% | 6 |
| DBall.Anarchy 0.1 | 1 | 1% | 12 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 2 |

## Melee bench: F30

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 61.5 | 28 / 210 | 4.47 | 12.8% | 23390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.7 | 14.4% | 57 |
| darkcanuck.B26354 1.06 | 2.2 | 13.4% | 50 |
| hadur117.micro.Saor 0.2 | 3.0 | 12.8% | 28 |
| stelo.PastFuture 2.3.2 | 4.0 | 12.0% | 23 |
| oog.melee.Capulet 1.2 | 4.2 | 12.0% | 29 |
| intruder.PrairieWolf 2.61 | 6.3 | 9.4% | 14 |
| fowl3628800.LightningBolt 2.6.0 | 7.7 | 7.7% | 5 |
| ntc.Opposite 1.5 | 7.8 | 7.7% | 0 |
| tripphippy.Alice 1.1 | 8.2 | 7.6% | 4 |
| GarmBox.Anger 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.9 | 63.5 | 5 / 35 | 4224 |
| 2 | 4 | 57.2 | 55.6 | 4 / 35 | 4103 |
| 3 | 4 | 55.0 | 55.6 | 3 / 35 | 3223 |
| 4 | 3 | 59.0 | 62.9 | 6 / 35 | 3970 |
| 5 | 3 | 59.9 | 66.7 | 2 / 35 | 4100 |
| 6 | 2 | 59.1 | 64.8 | 8 / 35 | 3770 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 18 | 17% |
| catcat20.Matcha 0.006 | 17 | 24% |
| oog.melee.Capulet 1.2 | 16 | 56% |
| stelo.PastFuture 2.3.2 | 10 | 60% |
| intruder.PrairieWolf 2.61 | 5 | 40% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 67% |
| tripphippy.Alice 1.1 | 2 | 100% |

Hadur died in 182 of 210 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 48 | 26% | 52 |
| darkcanuck.B26354 1.06 | 38 | 21% | 42 |
| oog.melee.Capulet 1.2 | 33 | 18% | 40 |
| stelo.PastFuture 2.3.2 | 21 | 12% | 27 |
| intruder.PrairieWolf 2.61 | 15 | 8% | 18 |
| fowl3628800.LightningBolt 2.6.0 | 10 | 5% | 12 |
| tripphippy.Alice 1.1 | 10 | 5% | 12 |
| ntc.Opposite 1.5 | 4 | 2% | 4 |
| GarmBox.Anger 1.0 | 3 | 2% | 3 |

## Melee bench: F31

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 68.9 | 30 / 210 | 3.80 | 13.7% | 21160 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 19.0% | 123 |
| hadur117.micro.Saor 0.2 | 2.3 | 13.7% | 30 |
| gh.mini.Griezel 0.2 | 2.8 | 13.1% | 38 |
| spinnercat.micro.Tyger 0.1 | 4.0 | 12.0% | 9 |
| d414.nano.Quantum 1.0.0 | 4.8 | 11.0% | 6 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.5% | 2 |
| timmit.nano.TimDog 0.33 | 7.3 | 7.0% | 2 |
| fm.mammillarias 1.3 | 8.2 | 5.9% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.6 | 68.3 | 6 / 35 | 3431 |
| 2 | 2 | 61.2 | 69.2 | 3 / 35 | 3814 |
| 3 | 2 | 62.3 | 72.7 | 7 / 35 | 3645 |
| 4 | 3 | 59.4 | 63.5 | 7 / 35 | 3552 |
| 5 | 3 | 59.8 | 68.3 | 3 / 35 | 3282 |
| 6 | 2 | 61.4 | 71.7 | 4 / 35 | 3436 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 43 | 16% |
| gh.mini.Griezel 0.2 | 15 | 33% |
| spinnercat.micro.Tyger 0.1 | 10 | 90% |
| d414.nano.Quantum 1.0.0 | 6 | 67% |
| gh.nano.Grofvuil 0.2 | 5 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 0% |

Hadur died in 181 of 210 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 92 | 51% | 98 |
| gh.mini.Griezel 0.2 | 31 | 17% | 35 |
| spinnercat.micro.Tyger 0.1 | 18 | 10% | 27 |
| d414.nano.Quantum 1.0.0 | 12 | 7% | 16 |
| gh.nano.Grofvuil 0.2 | 9 | 5% | 15 |
| timmit.nano.TimDog 0.33 | 9 | 5% | 10 |
| Gecko.ultimateGeckoBot 1.0 | 5 | 3% | 4 |
| fm.mammillarias 1.3 | 4 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |

## Melee bench: F32

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 76.6 | 80 / 210 | 3.10 | 16.3% | 27566 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 16.3% | 80 |
| kawigi.sbf.FloodHT 0.9.2 | 1.7 | 15.3% | 77 |
| apc.botM 3.0 | 3.2 | 12.3% | 21 |
| lxx.ConceptA 0.8 | 4.3 | 10.4% | 5 |
| vjik.UnViolation 1.1 | 4.7 | 10.2% | 14 |
| bayen.UbaMicro 1.4 | 6.0 | 8.8% | 5 |
| panzer.Panzer 0.2 | 7.0 | 7.8% | 0 |
| yk.JahMicro 1.0 | 8.5 | 6.9% | 2 |
| conscience.Electron 1.3g | 8.5 | 6.7% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.2% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 74.3 | 12 / 35 | 4236 |
| 2 | 1 | 65.3 | 78.4 | 15 / 35 | 4669 |
| 3 | 1 | 67.2 | 87.3 | 14 / 35 | 4861 |
| 4 | 1 | 64.6 | 76.8 | 15 / 35 | 4737 |
| 5 | 2 | 60.4 | 67.0 | 11 / 35 | 3989 |
| 6 | 1 | 65.3 | 75.9 | 13 / 35 | 5074 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 68 | 34% |
| apc.botM 3.0 | 22 | 82% |
| lxx.ConceptA 0.8 | 12 | 100% |
| vjik.UnViolation 1.1 | 10 | 90% |
| donjezza.Jezza 1.0 | 9 | 67% |
| yk.JahMicro 1.0 | 8 | 75% |
| bayen.UbaMicro 1.4 | 5 | 60% |
| panzer.Panzer 0.2 | 3 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 64 | 49% | 92 |
| lxx.ConceptA 0.8 | 17 | 13% | 27 |
| apc.botM 3.0 | 12 | 9% | 31 |
| vjik.UnViolation 1.1 | 9 | 7% | 21 |
| bayen.UbaMicro 1.4 | 9 | 7% | 12 |
| conscience.Electron 1.3g | 7 | 5% | 9 |
| panzer.Panzer 0.2 | 5 | 4% | 6 |
| yk.JahMicro 1.0 | 4 | 3% | 7 |
| donjezza.Jezza 1.0 | 3 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F33

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 81.1 | 110 / 210 | 2.70 | 18.2% | 29551 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.2% | 110 |
| maribo.Quester 0.3 | 2.0 | 15.9% | 52 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.4% | 15 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 10.9% | 9 |
| labg.Cataclysm 2.05 | 4.8 | 10.5% | 17 |
| baal.nano.N 1.42 | 6.3 | 9.2% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.3% | 6 |
| zyx.micro.Ant 1.1 | 8.3 | 5.7% | 1 |
| sanja.First 0.1 | 8.7 | 5.2% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 80.0 | 20 / 35 | 4586 |
| 2 | 1 | 67.2 | 79.4 | 20 / 35 | 4712 |
| 3 | 1 | 67.4 | 80.3 | 15 / 35 | 4825 |
| 4 | 1 | 69.1 | 85.7 | 20 / 35 | 4974 |
| 5 | 1 | 68.2 | 81.3 | 17 / 35 | 5162 |
| 6 | 1 | 68.0 | 80.0 | 18 / 35 | 5292 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 52 | 63% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 42 | 98% |
| gre.svman4.Leonidas 1.3.2 | 24 | 88% |
| labg.Cataclysm 2.05 | 14 | 50% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 71% |
| baal.nano.N 1.42 | 2 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 41 | 41% | 77 |
| labg.Cataclysm 2.05 | 18 | 18% | 29 |
| gre.svman4.Leonidas 1.3.2 | 17 | 17% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 9% | 49 |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 9% | 12 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 3% | 5 |
| zyx.micro.Ant 1.1 | 2 | 2% | 3 |
| sanja.First 0.1 | 1 | 1% | 1 |
| baal.nano.N 1.42 | 0 | 0% | 2 |

## Melee bench: F34

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 74.8 | 37 / 210 | 3.27 | 15.7% | 28689 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.3 | 17.1% | 59 |
| stelo.Spread 0.9 | 1.8 | 16.6% | 87 |
| hadur117.micro.Saor 0.2 | 2.8 | 15.7% | 37 |
| tcf.Reach 3 | 4.5 | 11.2% | 8 |
| jcs.Seth 1.8 | 4.7 | 10.9% | 16 |
| cli.Dancer 1.1 | 5.8 | 9.5% | 3 |
| ratosh.Wesco 1.4 | 7.0 | 6.8% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 4.1% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.6 | 77.8 | 5 / 35 | 4857 |
| 2 | 3 | 65.6 | 75.6 | 9 / 35 | 5055 |
| 3 | 3 | 65.5 | 74.9 | 8 / 35 | 4801 |
| 4 | 3 | 64.9 | 77.1 | 5 / 35 | 4454 |
| 5 | 3 | 63.5 | 70.5 | 5 / 35 | 4524 |
| 6 | 2 | 64.6 | 72.7 | 5 / 35 | 4998 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 47 | 23% |
| kid.Gladiator .7.2 | 28 | 39% |
| jcs.Seth 1.8 | 12 | 58% |
| tcf.Reach 3 | 6 | 17% |
| cli.Dancer 1.1 | 5 | 80% |
| ratosh.Wesco 1.4 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 174 of 210 rounds, at a mean tick of 963. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 68 | 39% | 77 |
| kid.Gladiator .7.2 | 63 | 36% | 72 |
| tcf.Reach 3 | 15 | 9% | 18 |
| jcs.Seth 1.8 | 14 | 8% | 22 |
| cli.Dancer 1.1 | 6 | 3% | 11 |
| sample.RamFire 1.0 | 4 | 2% | 3 |
| ratosh.Wesco 1.4 | 2 | 1% | 4 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F35

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 70.8 | 12 / 210 | 3.63 | 13.6% | 21015 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.7% | 167 |
| hadur117.micro.Saor 0.2 | 2.5 | 13.6% | 12 |
| gh.mini.Gruwel 0.9 | 3.2 | 12.8% | 14 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.5 | 12.6% | 14 |
| rz.HawkOnFire 0.1 | 4.8 | 11.2% | 1 |
| myl.nano.KomoriNinja 1.1 | 6.3 | 7.0% | 2 |
| wit.Chuliath 1.0 | 7.0 | 6.6% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.7% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 72.4 | 4 / 35 | 3216 |
| 2 | 2 | 61.4 | 72.1 | 3 / 35 | 3643 |
| 3 | 2 | 62.2 | 72.7 | 1 / 35 | 3917 |
| 4 | 4 | 58.9 | 65.7 | 1 / 35 | 3229 |
| 5 | 2 | 62.3 | 75.2 | 2 / 35 | 3472 |
| 6 | 3 | 59.7 | 66.7 | 1 / 35 | 3538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 37 | 8% |
| dmh.robocode.robot.BlackDeath 9.2 | 12 | 50% |
| gh.mini.Gruwel 0.9 | 7 | 0% |
| rz.HawkOnFire 0.1 | 2 | 50% |
| myl.nano.KomoriNinja 1.1 | 2 | 100% |

Hadur died in 198 of 210 rounds, at a mean tick of 687. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 115 | 58% | 119 |
| gh.mini.Gruwel 0.9 | 33 | 17% | 34 |
| dmh.robocode.robot.BlackDeath 9.2 | 22 | 11% | 26 |
| rz.HawkOnFire 0.1 | 15 | 8% | 16 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 4 |
| myl.nano.KomoriNinja 1.1 | 3 | 2% | 5 |
| wit.Chuliath 1.0 | 3 | 2% | 3 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 87.6 | 145 / 210 | 2.12 | 20.0% | 32778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 20.0% | 145 |
| bzdp.Pansy 2.1 | 2.3 | 12.2% | 14 |
| alpha.RainingFire 1.0 | 3.3 | 12.1% | 20 |
| mz.Cork 0.1 | 3.8 | 10.9% | 10 |
| bvh.micro.Freya 0.3 | 5.0 | 10.6% | 3 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.3% | 7 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.0% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 6.3% | 1 |
| dl.BetterWalls 1.0 | 9.2 | 5.1% | 0 |
| sample.MyFirstRobot 1.0 | 9.7 | 4.6% | 9 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 88.9 | 27 / 35 | 5488 |
| 2 | 1 | 69.5 | 87.3 | 27 / 35 | 5021 |
| 3 | 1 | 70.4 | 90.2 | 25 / 35 | 5677 |
| 4 | 1 | 68.8 | 83.8 | 20 / 35 | 5558 |
| 5 | 1 | 70.0 | 88.9 | 21 / 35 | 5312 |
| 6 | 1 | 70.1 | 86.3 | 25 / 35 | 5722 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 50 | 96% |
| alpha.RainingFire 1.0 | 29 | 69% |
| bvh.micro.Freya 0.3 | 26 | 92% |
| mz.Cork 0.1 | 25 | 92% |
| bvh.mini.Fenrir 0.39 | 17 | 94% |
| m3thos.Eva02 0.7.1 | 8 | 88% |
| sample.MyFirstRobot 1.0 | 6 | 67% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 21 | 32% | 42 |
| mz.Cork 0.1 | 13 | 20% | 32 |
| bzdp.Pansy 2.1 | 9 | 14% | 54 |
| bvh.micro.Freya 0.3 | 6 | 9% | 23 |
| m3thos.Eva02 0.7.1 | 6 | 9% | 19 |
| dl.BetterWalls 1.0 | 3 | 5% | 9 |
| sample.MyFirstRobot 1.0 | 3 | 5% | 5 |
| bvh.mini.Fenrir 0.39 | 2 | 3% | 19 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 7 |

## Melee bench: F37

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 82.2 | 141 / 210 | 2.60 | 18.5% | 32423 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.5% | 141 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.3 | 10.8% | 10 |
| germ.TheMind .2 | 3.5 | 10.4% | 10 |
| agrach.Dalek 1.0 | 4.7 | 9.7% | 15 |
| EBBU.Sim2 1.02 | 4.7 | 9.5% | 5 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.6% | 12 |
| skm.Ryubot 1.0 | 7.3 | 8.1% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 7.7 | 8.3% | 2 |
| mb.Beast 0.1 | 7.8 | 8.1% | 5 |
| lmk.ACPFinal 0.1 | 8.2 | 8.1% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 86.7 | 25 / 35 | 5883 |
| 2 | 1 | 64.7 | 76.2 | 19 / 35 | 4901 |
| 3 | 1 | 67.2 | 80.3 | 23 / 35 | 5475 |
| 4 | 1 | 67.2 | 83.5 | 26 / 35 | 5084 |
| 5 | 1 | 64.2 | 72.7 | 17 / 35 | 5173 |
| 6 | 1 | 70.8 | 94.0 | 31 / 35 | 5907 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 29 | 93% |
| EBBU.Sim2 1.02 | 26 | 92% |
| stelo.UntouchableNano 1.3 | 22 | 95% |
| skm.Ryubot 1.0 | 20 | 100% |
| mb.Beast 0.1 | 16 | 88% |
| agrach.Dalek 1.0 | 13 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 12 | 83% |
| lmk.ACPFinal 0.1 | 9 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 344. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 14 | 20% | 37 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 19% | 15 |
| com.syncleus.robocode.Dreadnaught 0.1 | 9 | 13% | 25 |
| mb.Beast 0.1 | 8 | 12% | 26 |
| EBBU.Sim2 1.02 | 6 | 9% | 25 |
| germ.TheMind .2 | 5 | 7% | 37 |
| lmk.ACPFinal 0.1 | 5 | 7% | 17 |
| skm.Ryubot 1.0 | 5 | 7% | 15 |
| stelo.UntouchableNano 1.3 | 4 | 6% | 11 |

## Melee bench: F38

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 75.6 | 60 / 210 | 3.20 | 15.7% | 26311 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.2 | 16.7% | 96 |
| hadur117.micro.Saor 0.2 | 1.8 | 15.7% | 60 |
| bvh.mini.Freya 0.55 | 3.0 | 12.5% | 10 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.2% | 22 |
| cs.Wren 1.0 | 5.2 | 10.6% | 7 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.8 | 9.3% | 8 |
| kdf.KoulDestroyer 1.0 | 6.8 | 8.9% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.3% | 2 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.6% | 1 |
| bzdp.BoxCar 2.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 80.6 | 10 / 35 | 4371 |
| 2 | 2 | 62.4 | 68.6 | 11 / 35 | 4246 |
| 3 | 2 | 64.1 | 76.5 | 10 / 35 | 4500 |
| 4 | 2 | 64.9 | 79.7 | 9 / 35 | 4405 |
| 5 | 2 | 65.1 | 78.1 | 11 / 35 | 4431 |
| 6 | 1 | 62.6 | 70.2 | 9 / 35 | 4358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 48 | 19% |
| bts.mega.Gnarly 1.4 | 18 | 50% |
| bvh.mini.Freya 0.55 | 17 | 82% |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 77% |
| cs.Wren 1.0 | 11 | 91% |
| kdf.KoulDestroyer 1.0 | 7 | 86% |
| matt.UnderDark3 2.4.34 | 2 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 72 | 48% | 79 |
| bts.mega.Gnarly 1.4 | 20 | 13% | 36 |
| bvh.mini.Freya 0.55 | 18 | 12% | 30 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 9% | 26 |
| cs.Wren 1.0 | 12 | 8% | 17 |
| kdf.KoulDestroyer 1.0 | 9 | 6% | 11 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 3% | 6 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 3 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |

## Melee bench: F39

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 79.1 | 66 / 210 | 2.88 | 17.0% | 31101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.0% | 66 |
| bvh.fry.Freya 0.82 | 2.2 | 15.2% | 39 |
| az.Ololobot 0.2.4 | 3.0 | 13.0% | 62 |
| catcat20.Lambda 0.024 | 3.8 | 11.3% | 27 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.3% | 6 |
| apollokidd.ApolloKidd 0.9 | 6.3 | 8.0% | 3 |
| gimp.GimpBot 0.1 | 6.8 | 8.0% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 7.5 | 7.4% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 5.9% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.3 | 5.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 78.7 | 12 / 35 | 5132 |
| 2 | 1 | 66.9 | 83.2 | 16 / 35 | 5065 |
| 3 | 1 | 66.3 | 81.9 | 10 / 35 | 5203 |
| 4 | 1 | 65.1 | 77.1 | 11 / 35 | 5139 |
| 5 | 1 | 65.6 | 78.4 | 9 / 35 | 5177 |
| 6 | 1 | 65.2 | 75.2 | 8 / 35 | 5385 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 40 | 18% |
| bvh.fry.Freya 0.82 | 35 | 66% |
| catcat20.Lambda 0.024 | 27 | 63% |
| stelo.SoRobotNanoMelee 1.2 | 13 | 100% |
| gimp.GimpBot 0.1 | 3 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 33% |
| apollokidd.ApolloKidd 0.9 | 3 | 67% |

Hadur died in 145 of 210 rounds, at a mean tick of 981. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 47 | 32% | 65 |
| bvh.fry.Freya 0.82 | 31 | 21% | 48 |
| catcat20.Lambda 0.024 | 24 | 17% | 34 |
| stelo.SoRobotNanoMelee 1.2 | 20 | 14% | 29 |
| winamp32.micro.MicroMacro 1.0 | 5 | 3% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 5 | 3% | 7 |
| apollokidd.ApolloKidd 0.9 | 5 | 3% | 6 |
| gimp.GimpBot 0.1 | 4 | 3% | 8 |
| dcs.Eater_of_Worlds 1.1.3-A | 4 | 3% | 5 |

## Melee bench: F40

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 81.5 | 117 / 210 | 2.67 | 18.1% | 28887 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.1% | 117 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.0% | 46 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 12.5% | 16 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.6% | 7 |
| mz.AntiGrav 1.0 | 4.8 | 10.7% | 7 |
| alpha.BlackIce 1.0 | 5.7 | 9.1% | 10 |
| stelo.Randomness 1.0 | 6.7 | 8.3% | 6 |
| amk.superstrike.SuperStrike 0.3 | 8.3 | 6.0% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.7 | 5.6% | 1 |
| sample.Corners 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 75.6 | 18 / 35 | 4442 |
| 2 | 1 | 67.5 | 80.6 | 19 / 35 | 4764 |
| 3 | 1 | 66.7 | 79.7 | 20 / 35 | 4486 |
| 4 | 1 | 70.0 | 89.8 | 22 / 35 | 5175 |
| 5 | 1 | 67.9 | 80.6 | 20 / 35 | 4941 |
| 6 | 1 | 67.7 | 82.5 | 18 / 35 | 5079 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 47 | 64% |
| kano.gamma.KanoGamma 1.8 | 31 | 81% |
| Polkwane.SmashMelee 1.0 | 25 | 96% |
| mz.AntiGrav 1.0 | 22 | 91% |
| alpha.BlackIce 1.0 | 7 | 86% |
| stelo.Randomness 1.0 | 6 | 100% |
| sample.Corners 1.0 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 37 | 40% | 62 |
| stelo.Randomness 1.0 | 12 | 13% | 24 |
| alpha.BlackIce 1.0 | 12 | 13% | 19 |
| mz.AntiGrav 1.0 | 10 | 11% | 24 |
| kano.gamma.KanoGamma 1.8 | 8 | 9% | 48 |
| Polkwane.SmashMelee 1.0 | 7 | 8% | 18 |
| testantiswapgun.AntiSwap 1.0 | 4 | 4% | 7 |
| amk.superstrike.SuperStrike 0.3 | 3 | 3% | 4 |
| sample.Corners 1.0 | 0 | 0% | 3 |

## Melee bench: F41

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 74.9 | 69 / 210 | 3.26 | 16.2% | 27958 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 16.2% | 69 |
| eem.EvBotNG v12.8 | 1.7 | 16.2% | 86 |
| ary.Swarm 1.1 | 3.3 | 12.5% | 9 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.5% | 25 |
| simonton.nano.MeleeSeed 1.8 | 5.7 | 9.9% | 5 |
| shrub.Silver v048 | 5.7 | 9.5% | 5 |
| zyx.nano.Ant 1.1 | 6.7 | 8.1% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.6% | 9 |
| stelo.Mirror 1.1 | 9.0 | 5.7% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 77.8 | 13 / 35 | 4883 |
| 2 | 2 | 62.3 | 67.0 | 5 / 35 | 4674 |
| 3 | 1 | 66.0 | 77.1 | 14 / 35 | 4763 |
| 4 | 2 | 63.5 | 70.8 | 10 / 35 | 4488 |
| 5 | 1 | 66.7 | 81.9 | 13 / 35 | 4432 |
| 6 | 1 | 65.2 | 74.9 | 14 / 35 | 4718 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 59 | 25% |
| lessonz.robocode.Oz 0.5.0 | 26 | 58% |
| ary.Swarm 1.1 | 20 | 90% |
| simonton.nano.MeleeSeed 1.8 | 16 | 100% |
| shrub.Silver v048 | 5 | 60% |
| stelo.Mirror 1.1 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 64 | 45% | 84 |
| lessonz.robocode.Oz 0.5.0 | 19 | 13% | 29 |
| ary.Swarm 1.1 | 18 | 13% | 31 |
| simonton.nano.MeleeSeed 1.8 | 16 | 11% | 27 |
| zyx.nano.Ant 1.1 | 7 | 5% | 9 |
| shrub.Silver v048 | 5 | 4% | 15 |
| jsal.Jsalbot 1.0 | 5 | 4% | 8 |
| stelo.Mirror 1.1 | 4 | 3% | 3 |
| acogdev.alpha 0.2 | 3 | 2% | 3 |

## Melee bench: F42

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 77.9 | 49 / 210 | 2.99 | 16.5% | 31303 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 16.5% | 49 |
| wompi.Wallaby 5.1 | 1.7 | 17.0% | 92 |
| ara.Shera 0.88 | 3.5 | 13.4% | 36 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.6% | 28 |
| amz.NanoClone 1.41 | 5.0 | 9.1% | 1 |
| maribo.IotaCT 1.1 | 6.2 | 7.9% | 0 |
| dsw.StaticD 1.0 | 7.0 | 7.1% | 4 |
| stelo.MirrorMicro 1.0 | 7.8 | 5.9% | 0 |
| mme.NikeEnhanced 2.0 | 9.2 | 4.9% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 81.9 | 9 / 35 | 5233 |
| 2 | 1 | 66.6 | 80.0 | 9 / 35 | 5493 |
| 3 | 2 | 65.6 | 76.8 | 6 / 35 | 5569 |
| 4 | 2 | 61.5 | 66.0 | 6 / 35 | 4690 |
| 5 | 1 | 67.2 | 82.9 | 13 / 35 | 4978 |
| 6 | 1 | 65.5 | 79.7 | 6 / 35 | 5340 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 46 | 30% |
| maribo.mini.MiniQuester 0.1 | 29 | 62% |
| ara.Shera 0.88 | 26 | 50% |
| amz.NanoClone 1.41 | 3 | 67% |
| dsw.StaticD 1.0 | 2 | 50% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 82 | 51% | 99 |
| ara.Shera 0.88 | 30 | 19% | 43 |
| maribo.mini.MiniQuester 0.1 | 26 | 16% | 41 |
| amz.NanoClone 1.41 | 10 | 6% | 12 |
| dsw.StaticD 1.0 | 4 | 2% | 6 |
| maribo.IotaCT 1.1 | 4 | 2% | 5 |
| stelo.MirrorMicro 1.0 | 3 | 2% | 2 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 1 |

## Melee bench: F43

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 73.0 | 21 / 210 | 3.43 | 14.2% | 22692 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.4% | 166 |
| hadur117.micro.Saor 0.2 | 2.0 | 14.2% | 21 |
| brainfade.melee.Dusk 0.44 | 3.7 | 12.0% | 13 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.5% | 4 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 10.8% | 3 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.8% | 0 |
| mz.NanoGod 2.02 | 7.3 | 8.0% | 1 |
| jab.DiamondStealer 5 | 7.7 | 7.5% | 2 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 73.7 | 3 / 35 | 3615 |
| 2 | 2 | 62.7 | 72.7 | 3 / 35 | 3626 |
| 3 | 2 | 64.2 | 76.5 | 3 / 35 | 3839 |
| 4 | 2 | 62.5 | 70.5 | 3 / 35 | 3849 |
| 5 | 2 | 63.7 | 73.7 | 5 / 35 | 4081 |
| 6 | 2 | 62.8 | 71.1 | 4 / 35 | 3682 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 63 | 3% |
| brainfade.melee.Dusk 0.44 | 12 | 58% |
| dummy.micro.Sparrow 2.5 | 7 | 86% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 75% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |
| jab.DiamondStealer 5 | 1 | 100% |

Hadur died in 189 of 210 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 129 | 68% | 133 |
| brainfade.melee.Dusk 0.44 | 24 | 13% | 31 |
| wcsv.melee.EngineerMelee 0.1 | 14 | 7% | 15 |
| dummy.micro.Sparrow 2.5 | 9 | 5% | 16 |
| mz.NanoGod 2.02 | 8 | 4% | 8 |
| Krabb.akim2.Akim2 1.1b | 2 | 1% | 4 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |

## Melee bench: F44

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 81.8 | 85 / 210 | 2.64 | 18.0% | 32279 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 18.0% | 85 |
| stelo.Liblix 0.3.1 | 2.0 | 16.5% | 92 |
| tzu.TheArtOfWar 1.2 | 3.0 | 12.6% | 21 |
| wompi.Quokka 1.6 | 4.5 | 9.9% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.7 | 9.6% | 1 |
| jwirde.Gort 2.0 | 5.7 | 9.2% | 5 |
| disan.Chair 2.2.0 | 7.5 | 7.0% | 0 |
| stf.PanzerGeneral 0.1 | 7.7 | 7.3% | 1 |
| sample.Crazy 1.0 | 9.0 | 5.1% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 79.0 | 13 / 35 | 5177 |
| 2 | 1 | 68.0 | 81.9 | 12 / 35 | 5770 |
| 3 | 2 | 67.2 | 82.5 | 12 / 35 | 5348 |
| 4 | 1 | 66.8 | 79.0 | 15 / 35 | 5311 |
| 5 | 1 | 68.5 | 83.2 | 14 / 35 | 5732 |
| 6 | 1 | 68.3 | 85.1 | 19 / 35 | 4941 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 82 | 32% |
| tzu.TheArtOfWar 1.2 | 47 | 72% |
| wompi.Quokka 1.6 | 12 | 83% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 100% |
| jwirde.Gort 2.0 | 5 | 100% |
| disan.Chair 2.2.0 | 3 | 100% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 69 | 55% | 103 |
| tzu.TheArtOfWar 1.2 | 22 | 17% | 47 |
| wompi.Quokka 1.6 | 9 | 7% | 15 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 7% | 13 |
| amk.jointstrike.JointStrike 0.2 | 5 | 4% | 6 |
| stf.PanzerGeneral 0.1 | 4 | 3% | 8 |
| disan.Chair 2.2.0 | 4 | 3% | 6 |
| jwirde.Gort 2.0 | 3 | 2% | 11 |
| sample.Crazy 1.0 | 1 | 1% | 1 |

## Melee bench: F45

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 83.8 | 87 / 210 | 2.46 | 19.3% | 35220 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.3% | 87 |
| eem.IWillFireNoBullet v2.8 | 2.8 | 12.7% | 104 |
| jje.BagPuss 1.2 | 2.8 | 11.9% | 5 |
| sul.Lunar 1.1 | 3.8 | 10.7% | 7 |
| myl.nano.Graviton 1.10 | 4.8 | 10.0% | 1 |
| hvilela.HVilela 0.9 | 7.0 | 8.1% | 0 |
| fm.claire 1.7 | 7.0 | 8.0% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 7.9% | 1 |
| wit.Deep7 2.0 | 8.7 | 6.2% | 5 |
| abud.ThirdRobo 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 87.3 | 12 / 35 | 6055 |
| 2 | 1 | 65.9 | 75.6 | 13 / 35 | 5104 |
| 3 | 1 | 69.6 | 84.1 | 13 / 35 | 6491 |
| 4 | 1 | 70.3 | 89.8 | 16 / 35 | 6137 |
| 5 | 1 | 67.9 | 81.6 | 15 / 35 | 5659 |
| 6 | 1 | 69.3 | 84.4 | 18 / 35 | 5774 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 97 | 28% |
| sul.Lunar 1.1 | 20 | 95% |
| jje.BagPuss 1.2 | 17 | 82% |
| myl.nano.Graviton 1.10 | 15 | 93% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 100% |
| wit.Deep7 2.0 | 6 | 67% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 1992. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 71 | 58% | 0 |
| jje.BagPuss 1.2 | 16 | 13% | 53 |
| myl.nano.Graviton 1.10 | 10 | 8% | 38 |
| wit.Deep7 2.0 | 7 | 6% | 12 |
| hvilela.HVilela 0.9 | 6 | 5% | 13 |
| sul.Lunar 1.1 | 5 | 4% | 58 |
| fm.claire 1.7 | 5 | 4% | 11 |
| abud.ThirdRobo 1.0 | 2 | 2% | 8 |
| pez.mini.ChironexFleckeri 0.5 | 1 | 1% | 13 |

## Melee bench: F46

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 70.1 | 19 / 210 | 3.69 | 14.5% | 26549 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.3% | 74 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.6% | 94 |
| hadur117.micro.Saor 0.2 | 2.8 | 14.5% | 19 |
| cx.Princess 1.0 | 4.3 | 10.6% | 16 |
| mz.MicroSheep 1.0 | 4.8 | 10.1% | 5 |
| sadoner.killer 0.2 | 5.8 | 9.1% | 1 |
| arthord.NanoSatanMelee Beta | 7.2 | 6.9% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 5.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.3 | 68.6 | 2 / 35 | 4530 |
| 2 | 3 | 62.9 | 71.7 | 4 / 35 | 4595 |
| 3 | 3 | 61.1 | 66.0 | 3 / 35 | 4317 |
| 4 | 3 | 62.7 | 69.8 | 2 / 35 | 4614 |
| 5 | 2 | 63.1 | 73.0 | 5 / 35 | 4366 |
| 6 | 3 | 62.2 | 71.4 | 3 / 35 | 4127 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 36 | 19% |
| rsalesc.melee.Medina 0.4.5 | 21 | 19% |
| mz.MicroSheep 1.0 | 4 | 75% |
| cx.Princess 1.0 | 3 | 33% |
| arthord.NanoSatanMelee Beta | 3 | 67% |
| sadoner.killer 0.2 | 2 | 100% |

Hadur died in 191 of 210 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 82 | 43% | 90 |
| rsalesc.melee.Medina 0.4.5 | 64 | 34% | 68 |
| cx.Princess 1.0 | 21 | 11% | 24 |
| sadoner.killer 0.2 | 9 | 5% | 10 |
| mz.MicroSheep 1.0 | 8 | 4% | 9 |
| arthord.NanoSatanMelee Beta | 3 | 2% | 5 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |
| kurios.DOSexe .9a | 1 | 1% | 1 |

