# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 71.9 | 15 / 210 | 3.53 | 14.4% | 29250 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.8% | 157 |
| hadur117.mini.DeiseWHPT 0.2 | 2.2 | 14.4% | 15 |
| sgp.JollyNinja 3.53 | 3.0 | 12.6% | 22 |
| mz.MicroGodMelee 1 | 4.0 | 11.5% | 10 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.8 | 10.6% | 2 |
| lorneswork.Predator 1.0 | 6.0 | 9.5% | 2 |
| adt.Ar2 1.0 | 7.0 | 7.0% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.3% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 9.8 | 3.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 67.3 | 1 / 35 | 4659 |
| 2 | 2 | 64.5 | 79.4 | 4 / 35 | 4717 |
| 3 | 2 | 61.4 | 69.8 | 1 / 35 | 4659 |
| 4 | 2 | 65.5 | 77.8 | 3 / 35 | 5571 |
| 5 | 3 | 60.9 | 67.6 | 2 / 35 | 4647 |
| 6 | 2 | 62.5 | 69.2 | 4 / 35 | 4997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 46 | 0% |
| sgp.JollyNinja 3.53 | 11 | 55% |
| mz.MicroGodMelee 1 | 6 | 0% |
| lorneswork.Predator 1.0 | 5 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 67% |
| skm.butterfly 1.0 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 0% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 195 of 210 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 99 | 51% | 101 |
| sgp.JollyNinja 3.53 | 32 | 16% | 35 |
| mz.MicroGodMelee 1 | 29 | 15% | 29 |
| lorneswork.Predator 1.0 | 17 | 9% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 8% | 19 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 2 |
| adt.Ar2 1.0 | 1 | 1% | 1 |

## Melee bench: F02

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 68.3 | 37 / 210 | 3.85 | 15.1% | 31461 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPT 0.2 | 1.8 | 15.1% | 37 |
| pulsar.PulsarMax 0.8.9 | 2.0 | 15.0% | 62 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.2 | 14.3% | 53 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.3% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.2% | 20 |
| sch.Simone 0.3d | 6.7 | 8.3% | 15 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 8.3% | 3 |
| Noran.BitchingElk 0.054 | 7.2 | 8.1% | 13 |
| stelo.PatternRobot 1.0 | 9.0 | 5.8% | 3 |
| fullsail.SweetTea 1.1 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 75.9 | 8 / 35 | 5526 |
| 2 | 1 | 63.9 | 72.7 | 6 / 35 | 5363 |
| 3 | 3 | 59.6 | 60.3 | 4 / 35 | 4922 |
| 4 | 2 | 58.2 | 56.2 | 6 / 35 | 4816 |
| 5 | 2 | 63.5 | 71.4 | 5 / 35 | 5396 |
| 6 | 2 | 64.5 | 73.3 | 8 / 35 | 5438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 28 | 50% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 22 | 18% |
| Noran.BitchingElk 0.054 | 13 | 54% |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 13% |
| sch.Simone 0.3d | 6 | 17% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 67% |
| stelo.PatternRobot 1.0 | 3 | 67% |
| fnc.bandit.Bandit 5.2.0 | 3 | 67% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 173 of 210 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 57 | 33% | 64 |
| pulsar.PulsarMax 0.8.9 | 39 | 23% | 50 |
| com.cohesiva.robocode.ManOwaR 1.0 | 23 | 13% | 27 |
| sch.Simone 0.3d | 18 | 10% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 6% | 14 |
| Noran.BitchingElk 0.054 | 9 | 5% | 11 |
| fnc.bandit.Bandit 5.2.0 | 9 | 5% | 11 |
| stelo.PatternRobot 1.0 | 5 | 3% | 6 |
| fullsail.SweetTea 1.1 | 2 | 1% | 3 |

## Melee bench: F03

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 82.5 | 72 / 210 | 2.58 | 17.3% | 34814 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPT 0.2 | 1.2 | 17.3% | 72 |
| radnor.DoctorBob 1.42 | 1.8 | 15.9% | 83 |
| vuen.Cake 2.51 | 3.5 | 12.4% | 34 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.8% | 14 |
| urdos.URDOS 1.3 | 5.0 | 9.4% | 4 |
| adt.Ar1 2.1 | 6.5 | 7.8% | 1 |
| oa.weak.FlyMk1 0.1 | 7.0 | 7.3% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 7.0% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 85.1 | 10 / 35 | 5681 |
| 2 | 1 | 66.8 | 83.5 | 14 / 35 | 5504 |
| 3 | 1 | 65.5 | 80.0 | 12 / 35 | 5595 |
| 4 | 1 | 66.2 | 82.2 | 11 / 35 | 5908 |
| 5 | 1 | 67.8 | 83.8 | 12 / 35 | 6633 |
| 6 | 1 | 65.5 | 80.3 | 13 / 35 | 5493 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 50 | 12% |
| kawigi.nano.Lib 1.0 | 40 | 100% |
| vuen.Cake 2.51 | 33 | 42% |
| oa.weak.FlyMk1 0.1 | 5 | 80% |
| urdos.URDOS 1.3 | 3 | 67% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 86 | 62% | 97 |
| vuen.Cake 2.51 | 30 | 22% | 50 |
| kawigi.nano.Lib 1.0 | 11 | 8% | 36 |
| urdos.URDOS 1.3 | 5 | 4% | 11 |
| oa.weak.FlyMk1 0.1 | 3 | 2% | 7 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 1% | 2 |
| adt.Ar1 2.1 | 1 | 1% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 3 |

## Melee bench: F04

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 65.1 | 1 / 210 | 4.14 | 13.7% | 30735 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.5% | 188 |
| apc.LeeroyJenkins2 1.0 | 2.3 | 14.0% | 12 |
| hadur117.mini.DeiseWHPT 0.2 | 2.7 | 13.7% | 1 |
| TNT.TNT 0.99.1 | 4.0 | 11.7% | 8 |
| josago.Jorgito 0.16 | 5.0 | 9.2% | 1 |
| css.Delitioner 0.11 | 6.2 | 7.9% | 0 |
| tj.zombie1n 1.0.1 | 7.3 | 6.5% | 0 |
| rampancy.Durandal 2.1d | 7.7 | 5.5% | 0 |
| spin.Bugstard 0.012b | 9.2 | 4.1% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.4 | 65.4 | 0 / 35 | 5394 |
| 2 | 3 | 62.9 | 67.6 | 0 / 35 | 5270 |
| 3 | 3 | 61.5 | 65.1 | 0 / 35 | 4958 |
| 4 | 2 | 61.4 | 63.8 | 1 / 35 | 4917 |
| 5 | 2 | 63.1 | 67.0 | 0 / 35 | 5284 |
| 6 | 3 | 60.3 | 61.9 | 0 / 35 | 4912 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 31 | 0% |
| TNT.TNT 0.99.1 | 2 | 50% |

Hadur died in 209 of 210 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 120 | 57% | 120 |
| apc.LeeroyJenkins2 1.0 | 34 | 16% | 34 |
| josago.Jorgito 0.16 | 21 | 10% | 21 |
| TNT.TNT 0.99.1 | 20 | 10% | 21 |
| css.Delitioner 0.11 | 6 | 3% | 6 |
| tj.zombie1n 1.0.1 | 5 | 2% | 5 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |
| rampancy.Durandal 2.1d | 1 | 0% | 1 |

## Melee bench: F05

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.2 | 53.1 | 2 / 210 | 5.22 | 10.3% | 19262 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.DemonicRage 3.4 | 1.5 | 18.3% | 71 |
| cb.fire.Firestarter 2.0f | 1.5 | 18.8% | 120 |
| wompi.Numbat 2.1 | 3.0 | 13.0% | 13 |
| hadur117.mini.DeiseWHPT 0.2 | 4.5 | 10.3% | 2 |
| ms.Ares 0.19 | 5.2 | 9.5% | 1 |
| axeBots.HataMoto 3.09 | 5.3 | 9.3% | 3 |
| supersample.SuperBoxBot 1.0 | 7.5 | 6.2% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.5 | 5.9% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.5% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 53.2 | 50.2 | 0 / 35 | 3145 |
| 2 | 5 | 51.6 | 48.3 | 0 / 35 | 2933 |
| 3 | 4 | 53.4 | 52.1 | 1 / 35 | 3225 |
| 4 | 4 | 56.6 | 57.1 | 1 / 35 | 3578 |
| 5 | 4 | 54.9 | 55.9 | 0 / 35 | 3056 |
| 6 | 4 | 55.2 | 54.9 | 0 / 35 | 3325 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 13 | 15% |
| wompi.Numbat 2.1 | 2 | 0% |
| cb.fire.Firestarter 2.0f | 1 | 0% |

Hadur died in 208 of 210 rounds, at a mean tick of 488. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 73 | 35% | 75 |
| wompi.Numbat 2.1 | 47 | 23% | 47 |
| cb.fire.Firestarter 2.0f | 45 | 22% | 45 |
| axeBots.HataMoto 3.09 | 15 | 7% | 15 |
| ms.Ares 0.19 | 12 | 6% | 12 |
| supersample.SuperBoxBot 1.0 | 8 | 4% | 8 |
| davidalves.net.DuelistMicroMelee 1.4 | 5 | 2% | 5 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 68.7 | 27 / 210 | 3.82 | 14.4% | 28580 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 2.0 | 15.3% | 87 |
| jekl.StoneGhost 0.7 | 2.0 | 15.3% | 49 |
| hadur117.mini.DeiseWHPT 0.2 | 2.2 | 14.4% | 27 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.3% | 26 |
| mld.Wisdom 1.0 | 5.3 | 10.2% | 2 |
| gg.Wolverine 2.0 | 5.5 | 9.1% | 6 |
| spinnercat.Omen 1.0 | 7.8 | 6.7% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 6.8% | 11 |
| DBall.NUKE 0.1 | 8.2 | 6.8% | 2 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 68.6 | 5 / 35 | 4596 |
| 2 | 2 | 62.8 | 70.5 | 4 / 35 | 4611 |
| 3 | 2 | 62.4 | 68.3 | 7 / 35 | 4781 |
| 4 | 2 | 63.7 | 71.4 | 7 / 35 | 5285 |
| 5 | 3 | 60.4 | 65.7 | 2 / 35 | 4564 |
| 6 | 2 | 61.3 | 67.6 | 2 / 35 | 4743 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 25 | 48% |
| origin.SleepSiphon 1.7b | 19 | 0% |
| pe.minimelee.SandboxMiniMelee 1.1 | 12 | 67% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 20% |
| gg.Wolverine 2.0 | 4 | 75% |
| mld.Wisdom 1.0 | 2 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 183 of 210 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 68 | 37% | 72 |
| jekl.StoneGhost 0.7 | 52 | 28% | 59 |
| pe.minimelee.SandboxMiniMelee 1.1 | 19 | 10% | 25 |
| gg.Wolverine 2.0 | 12 | 7% | 15 |
| mld.Wisdom 1.0 | 11 | 6% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 11 | 6% | 12 |
| spinnercat.Omen 1.0 | 8 | 4% | 10 |
| DBall.NUKE 0.1 | 1 | 1% | 2 |
| sample.Fire 1.0 | 1 | 1% | 2 |

## Melee bench: F07

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 81.1 | 36 / 210 | 2.70 | 17.1% | 35847 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.2 | 18.9% | 89 |
| hadur117.mini.DeiseWHPT 0.2 | 2.2 | 17.1% | 36 |
| rtk.Tachikoma 1.0 | 2.7 | 16.7% | 52 |
| franzor.Lizt 1.3.1 | 4.2 | 11.3% | 25 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 10.8% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 7.9% | 1 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.3 | 2.8% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.5 | 82.5 | 9 / 35 | 6073 |
| 2 | 3 | 66.5 | 79.0 | 3 / 35 | 5530 |
| 3 | 1 | 69.4 | 86.3 | 6 / 35 | 6494 |
| 4 | 2 | 67.5 | 78.4 | 7 / 35 | 5894 |
| 5 | 2 | 68.5 | 81.9 | 6 / 35 | 6251 |
| 6 | 3 | 66.7 | 78.4 | 5 / 35 | 5605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 47 | 43% |
| rsalesc.melee.Monk 0.3.6c | 42 | 7% |
| oog.melee.CapuletDroid 1.1 | 13 | 69% |
| franzor.Lizt 1.3.1 | 9 | 44% |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% |

Hadur died in 175 of 210 rounds, at a mean tick of 1057. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 79 | 45% | 86 |
| rtk.Tachikoma 1.0 | 70 | 40% | 94 |
| franzor.Lizt 1.3.1 | 12 | 7% | 9 |
| oog.melee.CapuletDroid 1.1 | 7 | 4% | 15 |
| lrem.micro.MoggFanatic 0.2 | 3 | 2% | 3 |
| exauge.GateKeeper 1.1.121g | 2 | 1% | 2 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 72.0 | 44 / 210 | 3.52 | 15.2% | 28062 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPT 0.2 | 1.0 | 15.2% | 44 |
| tm.Yuugao 1.0 | 2.3 | 13.5% | 54 |
| shrub.Vapour v159 | 3.0 | 13.1% | 49 |
| com.spp.robocode.MostlyHarmless 010 | 4.3 | 10.9% | 27 |
| Krabb.sliNk.Garm 0.9u | 4.5 | 11.0% | 21 |
| m3thos.Eva00 1.1 | 6.0 | 8.6% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 8.1% | 8 |
| SHAM.WOW 1.4 | 8.3 | 6.9% | 3 |
| qualidafial.MajorDick 1.0.1 | 9.0 | 6.5% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 6.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.9 | 68.6 | 9 / 35 | 4440 |
| 2 | 1 | 61.8 | 70.5 | 8 / 35 | 4466 |
| 3 | 1 | 62.9 | 73.3 | 7 / 35 | 4654 |
| 4 | 1 | 63.0 | 74.9 | 5 / 35 | 4830 |
| 5 | 1 | 62.0 | 69.2 | 7 / 35 | 4921 |
| 6 | 1 | 63.3 | 75.2 | 8 / 35 | 4751 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 24 | 33% |
| com.spp.robocode.MostlyHarmless 010 | 17 | 35% |
| tm.Yuugao 1.0 | 17 | 12% |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 93% |
| Krabb.sliNk.Garm 0.9u | 12 | 42% |
| SHAM.WOW 1.4 | 4 | 75% |
| m3thos.Eva00 1.1 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 50 | 30% | 57 |
| shrub.Vapour v159 | 37 | 22% | 46 |
| com.spp.robocode.MostlyHarmless 010 | 36 | 22% | 44 |
| Krabb.sliNk.Garm 0.9u | 28 | 17% | 29 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 4% | 17 |
| m3thos.Eva00 1.1 | 4 | 2% | 7 |
| SHAM.WOW 1.4 | 3 | 2% | 6 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 3 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.0 | 55.5 | 8 / 210 | 5.00 | 11.5% | 22193 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.8% | 131 |
| kc.micro.Figment 1.0 | 2.0 | 15.4% | 41 |
| hadur117.mini.DeiseWHPT 0.2 | 3.5 | 11.5% | 8 |
| pedersen.Grishnakh 1.0 | 4.3 | 10.8% | 11 |
| mc2.enemy.Original 0.9 | 5.2 | 9.9% | 16 |
| yagami.Tidus 0.11 | 5.2 | 9.9% | 1 |
| dft.Calliope 5.6 | 6.8 | 8.0% | 2 |
| step.nanoPri 1.0 | 8.7 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 4.9% | 0 |
| rdm.Dueler 0.4x | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.0 | 55.2 | 0 / 35 | 3584 |
| 2 | 3 | 61.2 | 67.3 | 1 / 35 | 4179 |
| 3 | 4 | 54.8 | 51.1 | 1 / 35 | 3633 |
| 4 | 4 | 54.0 | 50.8 | 1 / 35 | 3414 |
| 5 | 3 | 55.1 | 52.1 | 3 / 35 | 3715 |
| 6 | 4 | 56.1 | 56.5 | 2 / 35 | 3668 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 15 | 20% |
| kc.micro.Figment 1.0 | 7 | 0% |
| mc2.enemy.Original 0.9 | 2 | 50% |
| pedersen.Grishnakh 1.0 | 2 | 100% |
| dft.Calliope 5.6 | 1 | 100% |
| yagami.Tidus 0.11 | 1 | 100% |

Hadur died in 202 of 210 rounds, at a mean tick of 551. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 81 | 40% | 83 |
| kc.micro.Figment 1.0 | 55 | 27% | 55 |
| mc2.enemy.Original 0.9 | 26 | 13% | 28 |
| yagami.Tidus 0.11 | 13 | 6% | 13 |
| pedersen.Grishnakh 1.0 | 11 | 5% | 12 |
| dft.Calliope 5.6 | 8 | 4% | 10 |
| robar.nano.Assertive_Melee 0.2 | 3 | 1% | 3 |
| rdm.Dueler 0.4x | 3 | 1% | 3 |
| step.nanoPri 1.0 | 2 | 1% | 3 |

## Melee bench: F10

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 76.4 | 48 / 210 | 3.12 | 15.7% | 31671 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPT 0.2 | 1.2 | 15.7% | 48 |
| DTF.Kludgy 1.2b | 2.5 | 14.2% | 52 |
| ejb.Polaris 1.0.1 | 2.8 | 13.6% | 44 |
| ne.Chimera 1.2 | 3.8 | 12.8% | 20 |
| vStar.RAFzilla 2.15 | 5.2 | 11.4% | 19 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.9% | 23 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.8 | 6.0% | 0 |
| sam.Samspin 1.0 | 8.0 | 5.3% | 0 |
| kurios.DOSexe .9b | 8.2 | 5.8% | 3 |
| donjezza.Muncho 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 76.2 | 11 / 35 | 4929 |
| 2 | 1 | 64.0 | 74.3 | 9 / 35 | 5240 |
| 3 | 1 | 63.8 | 76.5 | 6 / 35 | 5335 |
| 4 | 2 | 63.6 | 75.6 | 7 / 35 | 4887 |
| 5 | 1 | 65.3 | 77.8 | 8 / 35 | 5781 |
| 6 | 1 | 64.7 | 78.1 | 7 / 35 | 5499 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ne.Chimera 1.2 | 29 | 59% |
| ejb.Polaris 1.0.1 | 28 | 32% |
| DTF.Kludgy 1.2b | 23 | 26% |
| vStar.RAFzilla 2.15 | 18 | 44% |
| tvv.micro.Antares 1.1.1 | 13 | 46% |
| donjezza.Muncho 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 0% |

Hadur died in 162 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ejb.Polaris 1.0.1 | 43 | 27% | 53 |
| DTF.Kludgy 1.2b | 38 | 23% | 45 |
| ne.Chimera 1.2 | 29 | 18% | 46 |
| vStar.RAFzilla 2.15 | 22 | 14% | 32 |
| tvv.micro.Antares 1.1.1 | 17 | 10% | 20 |
| kurios.DOSexe .9b | 7 | 4% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 2% | 4 |
| sam.Samspin 1.0 | 2 | 1% | 2 |

## Melee bench: F11

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 64.7 | 19 / 210 | 4.18 | 13.4% | 25160 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 18.4% | 108 |
| hadur117.mini.DeiseWHPT 0.2 | 2.2 | 13.4% | 19 |
| cx.mini.Nimrod 0.55 | 2.8 | 12.1% | 21 |
| djc.DynaBot 0.1.1 | 4.0 | 11.1% | 31 |
| br2.MobyDickBot 1.6 | 5.5 | 9.8% | 14 |
| rdt199.Warlord 0.73 | 6.0 | 9.0% | 4 |
| KiraNL.Chupacabra 0.4 | 6.8 | 8.4% | 4 |
| uji.YellohFellah 1.0 | 7.7 | 7.6% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.7% | 1 |
| stelo.MirrorNano 1.3 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 68.3 | 4 / 35 | 3879 |
| 2 | 2 | 61.6 | 69.5 | 4 / 35 | 4384 |
| 3 | 2 | 59.2 | 61.3 | 2 / 35 | 4381 |
| 4 | 2 | 58.5 | 61.9 | 3 / 35 | 4202 |
| 5 | 2 | 59.6 | 64.4 | 2 / 35 | 4313 |
| 6 | 3 | 58.7 | 62.9 | 4 / 35 | 4001 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 32 | 22% |
| djc.DynaBot 0.1.1 | 12 | 25% |
| uji.YellohFellah 1.0 | 4 | 75% |
| cx.mini.Nimrod 0.55 | 4 | 50% |
| br2.MobyDickBot 1.6 | 4 | 50% |
| rdt199.Warlord 0.73 | 2 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 0% |

Hadur died in 191 of 210 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 87 | 46% | 94 |
| cx.mini.Nimrod 0.55 | 31 | 16% | 35 |
| djc.DynaBot 0.1.1 | 19 | 10% | 22 |
| rdt199.Warlord 0.73 | 17 | 9% | 19 |
| KiraNL.Chupacabra 0.4 | 11 | 6% | 11 |
| br2.MobyDickBot 1.6 | 8 | 4% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 4% | 7 |
| stelo.MirrorNano 1.3 | 6 | 3% | 6 |
| uji.YellohFellah 1.0 | 5 | 3% | 8 |

## Melee bench: F12

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.1 | 62.2 | 25 / 210 | 4.40 | 12.7% | 22098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.7 | 14.8% | 56 |
| darkcanuck.Leon 1.01 | 1.7 | 14.5% | 67 |
| nat.PallasHawk 1.0 | 3.0 | 13.3% | 39 |
| hadur117.mini.DeiseWHPT 0.2 | 3.7 | 12.7% | 25 |
| brainfade.melee.Genghis 0.36 | 5.2 | 10.5% | 15 |
| jrm.Test0 1.0 | 6.2 | 8.3% | 4 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.2% | 3 |
| jp.Perpy 16.0 | 8.2 | 6.7% | 2 |
| stuff.Vlad 0.1 | 8.8 | 6.0% | 1 |
| jaybot.bots.Oddball 4.0 | 9.3 | 6.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.0 | 61.0 | 2 / 35 | 3863 |
| 2 | 3 | 59.7 | 66.0 | 5 / 35 | 3884 |
| 3 | 4 | 56.6 | 59.0 | 5 / 35 | 3294 |
| 4 | 3 | 58.3 | 63.5 | 3 / 35 | 3683 |
| 5 | 4 | 58.2 | 63.2 | 3 / 35 | 3715 |
| 6 | 4 | 58.1 | 60.6 | 7 / 35 | 3659 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 21 | 5% |
| bts.wiki.RipCurl 0.9b | 13 | 23% |
| nat.PallasHawk 1.0 | 11 | 64% |
| brainfade.melee.Genghis 0.36 | 6 | 83% |
| jaybot.bots.Oddball 4.0 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jp.Perpy 16.0 | 2 | 50% |
| jrm.Test0 1.0 | 1 | 100% |

Hadur died in 187 of 210 rounds, at a mean tick of 602. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.Leon 1.01 | 62 | 33% | 66 |
| bts.wiki.RipCurl 0.9b | 41 | 22% | 44 |
| nat.PallasHawk 1.0 | 31 | 17% | 40 |
| jrm.Test0 1.0 | 17 | 9% | 19 |
| brainfade.melee.Genghis 0.36 | 14 | 7% | 15 |
| cs.sheldor.Talon 1.1 | 9 | 5% | 10 |
| jp.Perpy 16.0 | 7 | 4% | 8 |
| jaybot.bots.Oddball 4.0 | 3 | 2% | 6 |
| stuff.Vlad 0.1 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.6 | 55.2 | 0 / 210 | 5.03 | 10.9% | 22474 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.0 | 18.3% | 122 |
| ags.Glacier 0.2.11 | 2.0 | 16.6% | 43 |
| gh.micro.Gruweltje 0.7 | 3.3 | 12.9% | 16 |
| shinh.Entangled 0.3 | 3.7 | 12.8% | 26 |
| hadur117.mini.DeiseWHPT 0.2 | 5.0 | 10.9% | 0 |
| apc.Colossus2 0.17 | 6.0 | 8.1% | 2 |
| stelo.Wang 1.0 | 7.0 | 7.0% | 1 |
| ayk.WallHugger 1.0 | 8.0 | 5.4% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.4 | 56.8 | 0 / 35 | 3541 |
| 2 | 5 | 55.4 | 53.3 | 0 / 35 | 3859 |
| 3 | 5 | 55.3 | 52.1 | 0 / 35 | 3791 |
| 4 | 5 | 55.8 | 55.2 | 0 / 35 | 3806 |
| 5 | 5 | 57.9 | 62.2 | 0 / 35 | 3940 |
| 6 | 5 | 53.8 | 51.7 | 0 / 35 | 3537 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 5 | 0% |
| shinh.Entangled 0.3 | 3 | 0% |
| ags.Glacier 0.2.11 | 3 | 0% |
| gh.micro.Gruweltje 0.7 | 2 | 0% |

Hadur died in 210 of 210 rounds, at a mean tick of 465. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 68 | 32% | 68 |
| ags.Glacier 0.2.11 | 58 | 28% | 58 |
| gh.micro.Gruweltje 0.7 | 32 | 15% | 32 |
| shinh.Entangled 0.3 | 30 | 14% | 30 |
| stelo.Wang 1.0 | 7 | 3% | 7 |
| apc.Colossus2 0.17 | 6 | 3% | 6 |
| maribo.FollowFire 1 | 5 | 2% | 5 |
| ayk.WallHugger 1.0 | 4 | 2% | 4 |

## Melee bench: F14

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 81.2 | 82 / 210 | 2.70 | 17.3% | 32630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPT 0.2 | 1.2 | 17.3% | 82 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.4% | 57 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.4% | 44 |
| sanyi.mikrobi.Roberto 1.0 | 4.5 | 10.4% | 8 |
| Lo_Ian.Gandalf_V4 4.0 | 5.7 | 9.7% | 3 |
| co.edu.usb.rc.LidisTron 1.0 | 6.2 | 9.4% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 9.3% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 8.2% | 9 |
| pa.Improved 1.0 | 9.0 | 6.0% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 76.5 | 10 / 35 | 5216 |
| 2 | 1 | 67.3 | 83.8 | 15 / 35 | 5289 |
| 3 | 1 | 66.7 | 78.1 | 14 / 35 | 5589 |
| 4 | 1 | 68.1 | 85.1 | 16 / 35 | 5734 |
| 5 | 1 | 66.9 | 82.2 | 11 / 35 | 5601 |
| 6 | 1 | 66.6 | 81.3 | 16 / 35 | 5201 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 54 | 59% |
| catcat20.shape.Theta 0.018 | 33 | 52% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 73% |
| sanyi.mikrobi.Roberto 1.0 | 10 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 6 | 83% |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 67% |
| pa.Improved 1.0 | 3 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 45 | 35% | 75 |
| catcat20.shape.Theta 0.018 | 39 | 30% | 59 |
| dmh.robocode.robot.RedDwarf 0.4 | 12 | 9% | 15 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 8% | 16 |
| sanyi.mikrobi.Roberto 1.0 | 9 | 7% | 22 |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 6% | 13 |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 3% | 8 |
| pa.Improved 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 78.5 | 73 / 210 | 2.94 | 17.3% | 32691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPT 0.2 | 1.0 | 17.3% | 73 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.2% | 16 |
| mld.DustBunny 3.8 | 3.2 | 12.5% | 13 |
| emp.Yngwie 1.11 | 3.3 | 13.2% | 64 |
| cb.nano.Insomnia 1.0 | 4.7 | 11.5% | 17 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.5% | 25 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.6% | 0 |
| lambdaxy.TBot 0.1 | 7.7 | 6.6% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.0% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 79.7 | 13 / 35 | 4985 |
| 2 | 1 | 65.2 | 74.0 | 12 / 35 | 5525 |
| 3 | 1 | 64.5 | 72.7 | 10 / 35 | 5185 |
| 4 | 1 | 66.7 | 79.0 | 9 / 35 | 5733 |
| 5 | 1 | 68.3 | 83.5 | 15 / 35 | 5824 |
| 6 | 1 | 67.5 | 81.9 | 14 / 35 | 5439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 36 | 36% |
| kawigi.micro.Shiz 1.1 | 23 | 96% |
| kawigi.robot.Girl 1.2 | 20 | 55% |
| mld.DustBunny 3.8 | 19 | 89% |
| cb.nano.Insomnia 1.0 | 13 | 46% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 46 | 33% | 79 |
| kawigi.robot.Girl 1.2 | 25 | 18% | 31 |
| cb.nano.Insomnia 1.0 | 20 | 14% | 17 |
| mld.DustBunny 3.8 | 16 | 12% | 31 |
| kawigi.micro.Shiz 1.1 | 16 | 12% | 28 |
| Grystrion.TrackerWO 1.0 | 7 | 5% | 8 |
| divineomega.TrialBot 0.003 | 6 | 4% | 12 |
| lambdaxy.TBot 0.1 | 2 | 1% | 4 |

## Melee bench: F16

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 69.2 | 25 / 210 | 3.78 | 15.0% | 31137 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 17.6% | 87 |
| hadur117.mini.DeiseWHPT 0.2 | 2.7 | 15.0% | 25 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.7 | 14.1% | 8 |
| techdude.forest.FlamingForest 1.1 | 3.7 | 13.0% | 72 |
| tvv.nano.Polaris 1.2 | 5.3 | 9.4% | 7 |
| bvh.fnr.Fenrir 0.36l | 5.8 | 9.0% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.1% | 5 |
| asd.Cthulhu 1.3 | 8.7 | 5.3% | 0 |
| repositorio.NanoStep 1.0 | 9.2 | 4.9% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.2 | 4.7% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 73.0 | 6 / 35 | 5473 |
| 2 | 3 | 60.6 | 62.9 | 3 / 35 | 4741 |
| 3 | 2 | 64.2 | 73.0 | 4 / 35 | 5443 |
| 4 | 3 | 62.5 | 67.6 | 5 / 35 | 5014 |
| 5 | 4 | 59.3 | 59.4 | 3 / 35 | 4573 |
| 6 | 2 | 66.6 | 79.0 | 4 / 35 | 5893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 38 | 18% |
| techdude.forest.FlamingForest 1.1 | 17 | 6% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 10 | 100% |
| tvv.nano.Polaris 1.2 | 5 | 80% |
| bvh.fnr.Fenrir 0.36l | 2 | 100% |
| stelo.IntrinsicVolatility 1.4 | 1 | 0% |
| divineomega.DivineBot 1.9.4.5 | 1 | 100% |

Hadur died in 185 of 210 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 79 | 43% | 90 |
| techdude.forest.FlamingForest 1.1 | 46 | 25% | 50 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 23 | 12% | 25 |
| bvh.fnr.Fenrir 0.36l | 20 | 11% | 20 |
| tvv.nano.Polaris 1.2 | 8 | 4% | 12 |
| stelo.IntrinsicVolatility 1.4 | 4 | 2% | 6 |
| divineomega.DivineBot 1.9.4.5 | 3 | 2% | 4 |
| asd.Cthulhu 1.3 | 2 | 1% | 3 |

## Melee bench: F17

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.1 | 57.4 | 20 / 210 | 4.84 | 12.5% | 27916 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 1.8 | 13.8% | 52 |
| cx.BlestPain 1.41 | 2.5 | 13.6% | 61 |
| et.Predator 1.8 | 2.5 | 13.2% | 32 |
| hadur117.mini.DeiseWHPT 0.2 | 3.8 | 12.5% | 20 |
| ahf.NanoAndrew .4 | 4.8 | 11.7% | 25 |
| nic.Nicator 2.4 | 5.5 | 11.1% | 15 |
| maribo.melee.BMV 0.1 | 7.0 | 9.2% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 6.3% | 1 |
| tex.Longbot 0.4 | 8.7 | 5.8% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.4 | 59.4 | 3 / 35 | 4748 |
| 2 | 4 | 58.1 | 58.7 | 2 / 35 | 4414 |
| 3 | 4 | 56.4 | 53.0 | 5 / 35 | 4481 |
| 4 | 1 | 61.7 | 64.4 | 6 / 35 | 5237 |
| 5 | 4 | 58.2 | 56.5 | 2 / 35 | 4872 |
| 6 | 6 | 55.1 | 52.1 | 2 / 35 | 4164 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 9 | 56% |
| oog.melee.Mercutio 1.0 | 8 | 50% |
| cx.BlestPain 1.41 | 8 | 25% |
| ahf.NanoAndrew .4 | 4 | 25% |
| nic.Nicator 2.4 | 3 | 100% |
| tex.Longbot 0.4 | 2 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 190 of 210 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 41 | 22% | 44 |
| oog.melee.Mercutio 1.0 | 35 | 18% | 39 |
| ahf.NanoAndrew .4 | 34 | 18% | 34 |
| et.Predator 1.8 | 31 | 16% | 37 |
| maribo.melee.BMV 0.1 | 24 | 13% | 25 |
| nic.Nicator 2.4 | 13 | 7% | 16 |
| tex.Longbot 0.4 | 10 | 5% | 11 |
| goblin.Bender 2.4 | 2 | 1% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 2 |

## Melee bench: F18

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 60.7 | 30 / 210 | 4.54 | 13.2% | 27157 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.3 | 15.0% | 68 |
| hadur117.mini.DeiseWHPT 0.2 | 2.8 | 13.2% | 30 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.6% | 44 |
| uji.DBH 1.1 | 3.2 | 12.4% | 33 |
| ratosh.Nobo 0.21 | 5.2 | 10.6% | 4 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.9% | 6 |
| sigterm.Sigterm 1.0 | 7.0 | 8.9% | 19 |
| kawigi.mini.Fhqwhgads 1.1 | 8.3 | 6.7% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.2 | 5.4% | 2 |
| stelo.WangRobot 1.0 | 9.5 | 5.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 67.0 | 10 / 35 | 5282 |
| 2 | 4 | 56.9 | 54.9 | 3 / 35 | 4413 |
| 3 | 1 | 63.1 | 71.7 | 7 / 35 | 4983 |
| 4 | 4 | 56.8 | 57.1 | 3 / 35 | 4133 |
| 5 | 4 | 56.6 | 57.1 | 2 / 35 | 4163 |
| 6 | 3 | 56.6 | 56.2 | 5 / 35 | 4183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 24 | 58% |
| uji.DBH 1.1 | 13 | 38% |
| agd.Mooserwirt2 2.7 | 11 | 27% |
| stelo.WangRobot 1.0 | 5 | 60% |
| sigterm.Sigterm 1.0 | 5 | 40% |
| spinnercat.Robovirus 2.718 | 2 | 50% |
| ratosh.Nobo 0.21 | 2 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.DBH 1.1 | 44 | 24% | 46 |
| morbid.MorbidPriest 1.0 | 41 | 23% | 55 |
| agd.Mooserwirt2 2.7 | 34 | 19% | 41 |
| ratosh.Nobo 0.21 | 21 | 12% | 23 |
| spinnercat.Robovirus 2.718 | 13 | 7% | 16 |
| kawigi.mini.Fhqwhgads 1.1 | 11 | 6% | 12 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 7 | 4% | 7 |
| sigterm.Sigterm 1.0 | 5 | 3% | 4 |
| stelo.WangRobot 1.0 | 4 | 2% | 6 |

## Melee bench: F19

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.2 | 155 / 210 | 1.61 | 20.8% | 35858 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPT 0.2 | 1.0 | 20.8% | 155 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.8% | 27 |
| mld.Infinity 2.2 | 3.0 | 13.2% | 22 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 10.9% | 1 |
| erdnis.Rover 0.3 | 4.7 | 10.7% | 3 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.7% | 2 |
| mbh.Mbh 0.1 | 7.3 | 7.1% | 0 |
| pac.ABC 2.1 | 8.2 | 6.3% | 1 |
| pbg.R2D2 1.0 | 8.5 | 6.3% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 90.5 | 25 / 35 | 6009 |
| 2 | 1 | 72.2 | 95.2 | 26 / 35 | 6130 |
| 3 | 1 | 72.1 | 94.9 | 28 / 35 | 6079 |
| 4 | 1 | 71.5 | 92.4 | 27 / 35 | 5656 |
| 5 | 1 | 70.9 | 90.5 | 23 / 35 | 6029 |
| 6 | 1 | 72.3 | 95.6 | 26 / 35 | 5955 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 105 | 86% |
| mld.Infinity 2.2 | 35 | 63% |
| krillr.mini.JointStrike 2.0.0 | 17 | 100% |
| erdnis.Rover 0.3 | 12 | 92% |
| patson.PatsonTestBot 1.0 | 9 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |
| pac.ABC 2.1 | 2 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 1202. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 18 | 32% | 42 |
| davidalves.net.DuelistMiniMelee 1.2 | 17 | 30% | 71 |
| erdnis.Rover 0.3 | 9 | 16% | 22 |
| patson.PatsonTestBot 1.0 | 5 | 9% | 29 |
| krillr.mini.JointStrike 2.0.0 | 5 | 9% | 22 |
| pbg.R2D2 1.0 | 1 | 2% | 9 |
| pac.ABC 2.1 | 0 | 0% | 7 |
| mbh.Mbh 0.1 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 80.5 | 55 / 210 | 2.75 | 17.6% | 35659 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPT 0.2 | 1.3 | 17.6% | 55 |
| trm.Wrekt 1.1.6.f | 1.7 | 16.9% | 87 |
| catcat20.Rabbit 0.001 | 3.5 | 10.5% | 25 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 10.4% | 8 |
| fwb.Nine 1.0.1 | 4.5 | 10.2% | 19 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 8.7% | 3 |
| bayen.nut.Squirrel 1.615 | 7.2 | 8.0% | 10 |
| djdjdj.NanoSkunk10 1.0 | 7.3 | 7.7% | 2 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 5.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 76.2 | 7 / 35 | 5842 |
| 2 | 1 | 67.2 | 82.9 | 9 / 35 | 6006 |
| 3 | 1 | 68.4 | 85.7 | 12 / 35 | 6025 |
| 4 | 1 | 68.4 | 84.4 | 13 / 35 | 6234 |
| 5 | 2 | 64.7 | 74.3 | 6 / 35 | 5696 |
| 6 | 1 | 66.7 | 79.7 | 8 / 35 | 5856 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 68 | 35% |
| catcat20.Rabbit 0.001 | 18 | 61% |
| fwb.Nine 1.0.1 | 16 | 25% |
| bayen.nut.Squirrel 1.615 | 9 | 56% |
| nz.jdc.nano.GridFu 1.0 | 8 | 63% |
| m3thos.mini.Eva01 0.5.5 | 5 | 80% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 156 of 210 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 77 | 49% | 98 |
| catcat20.Rabbit 0.001 | 20 | 13% | 33 |
| fwb.Nine 1.0.1 | 18 | 12% | 19 |
| nz.jdc.nano.GridFu 1.0 | 10 | 6% | 16 |
| bayen.nut.Squirrel 1.615 | 10 | 6% | 13 |
| djdjdj.NanoSkunk10 1.0 | 9 | 6% | 11 |
| m3thos.mini.Eva01 0.5.5 | 7 | 4% | 11 |
| ntc.ControlledChaos 1.1.4 | 3 | 2% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 1% | 5 |

## Melee bench: F21

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.5 | 81 / 210 | 2.30 | 18.7% | 35989 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPT 0.2 | 1.2 | 18.7% | 81 |
| eem.EvBot v4.6.16 | 1.8 | 17.0% | 98 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.3% | 14 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.0% | 8 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.8% | 0 |
| eld.Hmm 1.0 | 5.5 | 8.6% | 13 |
| fire219.CatBot 1.0 | 7.5 | 6.4% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.1% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 82.9 | 9 / 35 | 6506 |
| 2 | 1 | 69.6 | 88.9 | 14 / 35 | 6106 |
| 3 | 1 | 69.3 | 86.7 | 16 / 35 | 6065 |
| 4 | 1 | 68.3 | 86.0 | 13 / 35 | 5744 |
| 5 | 2 | 66.5 | 79.4 | 10 / 35 | 5539 |
| 6 | 1 | 70.3 | 89.2 | 19 / 35 | 6029 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 84 | 40% |
| dummy.mini.Scimitar 1.01 | 25 | 80% |
| cf.RiO.RiOx 4.2.1 | 21 | 95% |
| eld.Hmm 1.0 | 10 | 30% |
| oa.weak.BotherBot 0.1 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 1085. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 89 | 68% | 116 |
| dummy.mini.Scimitar 1.01 | 17 | 13% | 33 |
| cf.RiO.RiOx 4.2.1 | 12 | 9% | 33 |
| eld.Hmm 1.0 | 7 | 5% | 20 |
| oa.weak.BotherBot 0.1 | 2 | 2% | 6 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 71.1 | 26 / 210 | 3.60 | 14.9% | 30389 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxDT 2.71m | 1.0 | 18.3% | 108 |
| hadur117.mini.DeiseWHPT 0.2 | 2.5 | 14.9% | 26 |
| kvk.HebusLeTroll 0.35 | 2.7 | 14.5% | 35 |
| jlm.javaDisturbance 0.59 | 4.2 | 12.5% | 23 |
| bigpete.Stewie 1.0 | 4.7 | 11.1% | 15 |
| yk.JahRoslav 1.1 | 6.7 | 7.0% | 1 |
| gg.Squaraus 0.6 | 7.0 | 6.9% | 0 |
| tad.Dalek98 0.98 | 7.3 | 6.5% | 1 |
| pbg.NinjaX 1.2 | 9.0 | 5.1% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 74.3 | 5 / 35 | 5299 |
| 2 | 4 | 60.6 | 64.4 | 1 / 35 | 4528 |
| 3 | 2 | 64.5 | 72.7 | 9 / 35 | 5219 |
| 4 | 2 | 63.9 | 73.3 | 5 / 35 | 5184 |
| 5 | 2 | 63.5 | 73.0 | 4 / 35 | 4946 |
| 6 | 3 | 62.7 | 68.6 | 2 / 35 | 5213 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 23 | 4% |
| kvk.HebusLeTroll 0.35 | 13 | 69% |
| bigpete.Stewie 1.0 | 12 | 67% |
| jlm.javaDisturbance 0.59 | 12 | 50% |
| yk.JahRoslav 1.1 | 1 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 187 of 210 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 102 | 55% | 103 |
| kvk.HebusLeTroll 0.35 | 46 | 25% | 51 |
| jlm.javaDisturbance 0.59 | 18 | 10% | 26 |
| bigpete.Stewie 1.0 | 17 | 9% | 23 |
| tad.Dalek98 0.98 | 2 | 1% | 2 |
| yk.JahRoslav 1.1 | 1 | 1% | 3 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 79.2 | 52 / 210 | 2.87 | 16.8% | 31840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 18.7% | 107 |
| hadur117.mini.DeiseWHPT 0.2 | 2.0 | 16.8% | 52 |
| cre.Karolos 0.32 | 3.0 | 14.9% | 38 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.3% | 4 |
| stelo.RamTrackSurfer 1.2 | 5.2 | 9.3% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.5 | 8.5% | 0 |
| sample.Walls 1.0 | 6.5 | 8.5% | 1 |
| cw.megas.Blade 0.8 | 7.2 | 8.3% | 2 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.5% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.4 | 80.3 | 11 / 35 | 5206 |
| 2 | 2 | 67.8 | 79.4 | 11 / 35 | 5540 |
| 3 | 2 | 66.2 | 77.8 | 6 / 35 | 5310 |
| 4 | 2 | 67.5 | 81.3 | 9 / 35 | 5269 |
| 5 | 2 | 66.3 | 76.8 | 6 / 35 | 5520 |
| 6 | 2 | 66.8 | 79.7 | 9 / 35 | 4995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 59 | 19% |
| cre.Karolos 0.32 | 17 | 41% |
| stelo.AreaTargetingBot 1.1 | 16 | 88% |
| stelo.RamTrackSurfer 1.2 | 9 | 67% |
| sample.Walls 1.0 | 8 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 3 | 67% |

Hadur died in 158 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 91 | 58% | 108 |
| cre.Karolos 0.32 | 42 | 27% | 56 |
| stelo.RamTrackSurfer 1.2 | 9 | 6% | 18 |
| stelo.AreaTargetingBot 1.1 | 7 | 4% | 11 |
| cw.megas.Blade 0.8 | 7 | 4% | 9 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 1% | 6 |
| sample.Walls 1.0 | 1 | 1% | 1 |
| cli.WasteOfAmmo 1.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.8 | 56.6 | 13 / 210 | 4.90 | 11.5% | 22003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 1.7 | 14.1% | 61 |
| rz.GlowBlowMelee 1.4 | 1.8 | 14.5% | 47 |
| florent.XSeries.X2 0.12 | 2.5 | 13.9% | 45 |
| hadur117.mini.DeiseWHPT 0.2 | 4.5 | 11.5% | 13 |
| pedersen.Ugluk 1.1.1 | 4.5 | 11.7% | 22 |
| oog.melee.Corsair 1.0 | 6.0 | 10.0% | 11 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 8.1% | 8 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.6% | 3 |
| as.FrankTheTank 1.3 | 9.2 | 5.0% | 0 |
| evd.X1 0.01 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.9 | 56.5 | 3 / 35 | 3803 |
| 2 | 5 | 54.6 | 54.6 | 3 / 35 | 3339 |
| 3 | 4 | 56.6 | 60.0 | 1 / 35 | 3670 |
| 4 | 5 | 56.8 | 58.4 | 1 / 35 | 3924 |
| 5 | 5 | 54.8 | 53.7 | 3 / 35 | 3610 |
| 6 | 4 | 55.9 | 56.5 | 2 / 35 | 3657 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 7 | 0% |
| rz.GlowBlowMelee 1.4 | 6 | 67% |
| davidalves.Phoenix 0.54 | 6 | 33% |
| pedersen.Ugluk 1.1.1 | 4 | 75% |
| stelo.SoJNanoMelee 1.1 | 4 | 75% |
| lunchie.Lunchbox 0.93 | 2 | 50% |
| oog.melee.Corsair 1.0 | 2 | 0% |

Hadur died in 197 of 210 rounds, at a mean tick of 525. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 46 | 23% | 46 |
| rz.GlowBlowMelee 1.4 | 42 | 21% | 46 |
| davidalves.Phoenix 0.54 | 35 | 18% | 38 |
| oog.melee.Corsair 1.0 | 31 | 16% | 32 |
| pedersen.Ugluk 1.1.1 | 17 | 9% | 19 |
| lunchie.Lunchbox 0.93 | 12 | 6% | 13 |
| stelo.SoJNanoMelee 1.1 | 8 | 4% | 10 |
| evd.X1 0.01 | 4 | 2% | 4 |
| as.FrankTheTank 1.3 | 2 | 1% | 2 |

## Melee bench: F25

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 75.4 | 88 / 210 | 3.21 | 16.2% | 25792 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPT 0.2 | 1.0 | 16.2% | 88 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 13.6% | 32 |
| voidious.micro.BlitzBat 1.05 | 3.2 | 12.8% | 24 |
| jdw.Hurricane 1.4 | 3.7 | 12.1% | 33 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.4% | 14 |
| ds.Oo 2.2 | 6.3 | 8.6% | 5 |
| gjr.Cephalosporin 0.1 | 7.2 | 8.0% | 8 |
| awesomeness.Elite 1.0 | 7.3 | 8.3% | 6 |
| adt.Ar2 1.1 | 8.8 | 6.5% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 73.0 | 12 / 35 | 4272 |
| 2 | 1 | 65.5 | 80.3 | 16 / 35 | 4302 |
| 3 | 1 | 62.6 | 72.4 | 12 / 35 | 3787 |
| 4 | 1 | 64.8 | 75.9 | 16 / 35 | 4431 |
| 5 | 1 | 64.4 | 74.0 | 16 / 35 | 4494 |
| 6 | 1 | 65.3 | 77.1 | 16 / 35 | 4506 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 37 | 86% |
| voidious.mini.BrokenSword 2.0.3 | 28 | 68% |
| jdw.Hurricane 1.4 | 27 | 70% |
| gjr.Cephalosporin 0.1 | 6 | 83% |
| gre.svman4.Morfeas 1.4.1 | 5 | 60% |
| awesomeness.Elite 1.0 | 4 | 75% |
| adt.Ar2 1.1 | 3 | 100% |
| ds.Oo 2.2 | 3 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 573. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 25 | 20% | 57 |
| jdw.Hurricane 1.4 | 19 | 15% | 31 |
| voidious.micro.BlitzBat 1.05 | 15 | 12% | 30 |
| ds.Oo 2.2 | 15 | 12% | 22 |
| awesomeness.Elite 1.0 | 14 | 11% | 20 |
| gre.svman4.Morfeas 1.4.1 | 11 | 9% | 16 |
| adt.Ar2 1.1 | 11 | 9% | 14 |
| gjr.Cephalosporin 0.1 | 9 | 7% | 17 |
| amk.ChumbaMini 0.2 | 3 | 2% | 3 |
2 death(s) with no robot to name.

## Melee bench: F26

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 69.3 | 29 / 210 | 3.76 | 14.9% | 32975 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.7% | 84 |
| hadur117.mini.DeiseWHPT 0.2 | 2.0 | 14.9% | 29 |
| lrem.Spectre 0.4.4 | 3.7 | 12.4% | 28 |
| shu.nitro.LENIN .T34 | 3.8 | 12.5% | 40 |
| js.PinBall 1.6 | 4.8 | 11.3% | 13 |
| gh.mini.GrubbmOne 1.0 | 6.3 | 9.9% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.6% | 10 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 7.0% | 5 |
| sample.SpinBot 1.0 | 9.0 | 4.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 66.3 | 2 / 35 | 5425 |
| 2 | 2 | 63.8 | 69.5 | 6 / 35 | 5751 |
| 3 | 2 | 61.6 | 67.9 | 4 / 35 | 4952 |
| 4 | 2 | 64.6 | 73.3 | 3 / 35 | 5907 |
| 5 | 2 | 63.4 | 69.5 | 6 / 35 | 5452 |
| 6 | 2 | 64.3 | 69.2 | 8 / 35 | 5488 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 31 | 13% |
| lrem.Spectre 0.4.4 | 18 | 78% |
| shu.nitro.LENIN .T34 | 11 | 73% |
| js.PinBall 1.6 | 5 | 20% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 20% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 0% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 79 | 44% | 86 |
| js.PinBall 1.6 | 24 | 13% | 25 |
| lrem.Spectre 0.4.4 | 19 | 10% | 29 |
| shu.nitro.LENIN .T34 | 18 | 10% | 25 |
| gh.mini.GrubbmOne 1.0 | 18 | 10% | 19 |
| jaybot.adv.bots.JayBot 2.0 | 14 | 8% | 17 |
| fullsail.LaxativeTeaTwo 1.0 | 9 | 5% | 9 |

## Melee bench: F27

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 73.0 | 55 / 210 | 3.43 | 15.6% | 28973 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.5 | 16.3% | 102 |
| hadur117.mini.DeiseWHPT 0.2 | 1.5 | 15.6% | 55 |
| EH.Eagle 1.0.6 | 3.7 | 11.9% | 12 |
| wee.Gem 1.8.4 | 4.0 | 11.5% | 23 |
| sheldor.melee.nano.TestMelee 0.1 | 5.5 | 9.9% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 9.1% | 4 |
| joe.ADinosaur 1.0 | 6.8 | 8.1% | 1 |
| throxbot.ThroxBot 0.1 | 7.2 | 8.0% | 2 |
| caimano.Furia_Ceca 0.22 | 9.2 | 5.3% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 68.9 | 8 / 35 | 4583 |
| 2 | 1 | 64.3 | 76.2 | 11 / 35 | 4578 |
| 3 | 1 | 65.7 | 71.1 | 10 / 35 | 5712 |
| 4 | 2 | 62.7 | 71.7 | 9 / 35 | 4445 |
| 5 | 2 | 61.2 | 68.6 | 6 / 35 | 4324 |
| 6 | 1 | 66.5 | 81.6 | 11 / 35 | 5331 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 44 | 18% |
| EH.Eagle 1.0.6 | 24 | 92% |
| wee.Gem 1.8.4 | 9 | 78% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 50% |
| throxbot.ThroxBot 0.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 77 | 50% | 88 |
| joe.ADinosaur 1.0 | 25 | 16% | 25 |
| wee.Gem 1.8.4 | 15 | 10% | 28 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 8% | 19 |
| EH.Eagle 1.0.6 | 11 | 7% | 25 |
| techdude.kombat.FlamingKombat 1.5 | 6 | 4% | 13 |
| throxbot.ThroxBot 0.1 | 5 | 3% | 10 |
| cs.Grudge 1.0 | 2 | 1% | 1 |
| caimano.Furia_Ceca 0.22 | 1 | 1% | 1 |

## Melee bench: F28

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 78.4 | 63 / 210 | 2.94 | 16.4% | 28638 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPT 0.2 | 1.0 | 16.4% | 63 |
| kid.test.NightFox .2 | 2.0 | 14.7% | 41 |
| uji.Antique 1.0 | 3.0 | 12.9% | 53 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 11.3% | 26 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.5% | 8 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.4% | 11 |
| amk.ChumbaWumba 0.3 | 6.7 | 8.1% | 4 |
| matt.advanced.Katana 1.0 | 8.2 | 6.5% | 3 |
| stelo.PianistNano 1.2 | 9.2 | 5.6% | 1 |
| stelo.Lifestealer 1.0 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 75.9 | 9 / 35 | 4584 |
| 2 | 1 | 65.9 | 82.9 | 9 / 35 | 4902 |
| 3 | 1 | 64.1 | 76.8 | 9 / 35 | 4659 |
| 4 | 1 | 65.8 | 81.0 | 14 / 35 | 4705 |
| 5 | 1 | 65.9 | 79.4 | 11 / 35 | 5260 |
| 6 | 1 | 63.5 | 74.6 | 11 / 35 | 4528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 52 | 69% |
| uji.Antique 1.0 | 31 | 19% |
| qohnil.blot.BlotBot 3.61 | 14 | 36% |
| ahr.ice.Ice 1.0.2 | 9 | 56% |
| pfvicm.Sobieski 7.2.3b | 8 | 63% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| amk.ChumbaWumba 0.3 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 57 | 39% | 68 |
| kid.test.NightFox .2 | 29 | 20% | 39 |
| qohnil.blot.BlotBot 3.61 | 23 | 16% | 36 |
| pfvicm.Sobieski 7.2.3b | 15 | 10% | 23 |
| amk.ChumbaWumba 0.3 | 10 | 7% | 13 |
| ahr.ice.Ice 1.0.2 | 9 | 6% | 18 |
| stelo.PianistNano 1.2 | 2 | 1% | 3 |
| stelo.Lifestealer 1.0 | 2 | 1% | 3 |
| matt.advanced.Katana 1.0 | 1 | 1% | 7 |

## Melee bench: F29

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 67.8 | 23 / 210 | 3.90 | 14.7% | 29256 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.3 | 16.8% | 91 |
| deewiant.Anomaly 0.2 | 1.8 | 16.5% | 72 |
| hadur117.mini.DeiseWHPT 0.2 | 2.8 | 14.7% | 23 |
| myl.micro.Troodon 1.10 | 4.2 | 11.4% | 9 |
| jok.PheonixM 0.1.2 | 4.8 | 10.1% | 8 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.8% | 0 |
| DBall.Anarchy 0.1 | 7.8 | 6.0% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.8% | 0 |
| ap.Frederick 1.1 | 8.3 | 5.8% | 4 |
| jangs.ns51 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.8 | 68.9 | 2 / 35 | 4693 |
| 2 | 2 | 62.8 | 68.9 | 4 / 35 | 4793 |
| 3 | 3 | 64.8 | 69.8 | 7 / 35 | 5505 |
| 4 | 3 | 63.0 | 67.3 | 4 / 35 | 4780 |
| 5 | 3 | 62.5 | 67.6 | 3 / 35 | 4862 |
| 6 | 3 | 61.3 | 64.4 | 3 / 35 | 4623 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 33 | 18% |
| zyx.mega.YersiniaPestis 3.1 | 25 | 8% |
| myl.micro.Troodon 1.10 | 10 | 70% |
| jok.PheonixM 0.1.2 | 4 | 100% |
| ap.Frederick 1.1 | 2 | 50% |
| DBall.Anarchy 0.1 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 188 of 210 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 80 | 43% | 87 |
| zyx.mega.YersiniaPestis 3.1 | 70 | 37% | 75 |
| myl.micro.Troodon 1.10 | 16 | 9% | 20 |
| ph.melee.ArcherME 0.3 | 9 | 5% | 10 |
| jok.PheonixM 0.1.2 | 7 | 4% | 11 |
| jangs.ns51 1.0 | 4 | 2% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |
| ap.Frederick 1.1 | 1 | 1% | 0 |
| DBall.Anarchy 0.1 | 0 | 0% | 2 |

## Melee bench: F30

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 49.7 | 42.5 | 2 / 210 | 6.17 | 9.1% | 20272 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 1.3 | 14.7% | 65 |
| catcat20.Matcha 0.006 | 2.2 | 14.6% | 59 |
| stelo.PastFuture 2.3.2 | 3.0 | 13.3% | 29 |
| oog.melee.Capulet 1.2 | 3.5 | 12.7% | 31 |
| intruder.PrairieWolf 2.61 | 5.5 | 9.8% | 11 |
| hadur117.mini.DeiseWHPT 0.2 | 6.3 | 9.1% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 6.8 | 8.3% | 9 |
| tripphippy.Alice 1.1 | 8.2 | 7.3% | 4 |
| ntc.Opposite 1.5 | 8.2 | 7.4% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 8 | 47.8 | 38.4 | 1 / 35 | 3184 |
| 2 | 6 | 47.8 | 38.7 | 0 / 35 | 3235 |
| 3 | 7 | 49.0 | 40.3 | 0 / 35 | 3345 |
| 4 | 5 | 49.9 | 43.5 | 0 / 35 | 3454 |
| 5 | 6 | 52.4 | 48.6 | 1 / 35 | 3566 |
| 6 | 6 | 51.2 | 45.7 | 0 / 35 | 3488 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| fowl3628800.LightningBolt 2.6.0 | 3 | 67% |
| stelo.PastFuture 2.3.2 | 2 | 0% |
| intruder.PrairieWolf 2.61 | 1 | 0% |
| catcat20.Matcha 0.006 | 1 | 0% |
| darkcanuck.B26354 1.06 | 1 | 0% |

Hadur died in 208 of 210 rounds, at a mean tick of 445. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 45 | 22% | 45 |
| stelo.PastFuture 2.3.2 | 39 | 19% | 39 |
| oog.melee.Capulet 1.2 | 31 | 15% | 32 |
| catcat20.Matcha 0.006 | 29 | 14% | 29 |
| tripphippy.Alice 1.1 | 21 | 10% | 21 |
| intruder.PrairieWolf 2.61 | 18 | 9% | 18 |
| fowl3628800.LightningBolt 2.6.0 | 12 | 6% | 13 |
| ntc.Opposite 1.5 | 12 | 6% | 12 |
| GarmBox.Anger 1.0 | 1 | 0% | 1 |

## Melee bench: F31

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.2 | 50.7 | 4 / 210 | 5.43 | 10.3% | 19666 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 19.3% | 133 |
| gh.mini.Griezel 0.2 | 2.0 | 14.5% | 49 |
| d414.nano.Quantum 1.0.0 | 3.5 | 11.8% | 9 |
| spinnercat.micro.Tyger 0.1 | 4.0 | 10.9% | 9 |
| hadur117.mini.DeiseWHPT 0.2 | 4.7 | 10.3% | 4 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.5% | 5 |
| timmit.nano.TimDog 0.33 | 7.2 | 7.3% | 3 |
| fm.mammillarias 1.3 | 8.0 | 6.4% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.1 | 53.7 | 0 / 35 | 3634 |
| 2 | 5 | 53.5 | 52.7 | 1 / 35 | 3068 |
| 3 | 5 | 52.8 | 49.8 | 0 / 35 | 3372 |
| 4 | 4 | 52.5 | 48.9 | 1 / 35 | 3349 |
| 5 | 4 | 55.3 | 54.9 | 1 / 35 | 3543 |
| 6 | 6 | 49.7 | 44.4 | 1 / 35 | 2700 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 13 | 8% |
| gh.mini.Griezel 0.2 | 4 | 0% |
| spinnercat.micro.Tyger 0.1 | 2 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 0% |
| d414.nano.Quantum 1.0.0 | 1 | 100% |

Hadur died in 206 of 210 rounds, at a mean tick of 498. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 66 | 32% | 69 |
| gh.mini.Griezel 0.2 | 58 | 28% | 58 |
| d414.nano.Quantum 1.0.0 | 22 | 11% | 22 |
| timmit.nano.TimDog 0.33 | 17 | 8% | 17 |
| spinnercat.micro.Tyger 0.1 | 16 | 8% | 17 |
| gh.nano.Grofvuil 0.2 | 16 | 8% | 16 |
| fm.mammillarias 1.3 | 5 | 2% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 5 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 1 | 0% | 1 |

## Melee bench: F32

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 70.9 | 41 / 210 | 3.62 | 14.7% | 27417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.2 | 15.7% | 80 |
| hadur117.mini.DeiseWHPT 0.2 | 2.0 | 14.7% | 41 |
| apc.botM 3.0 | 2.8 | 13.2% | 42 |
| vjik.UnViolation 1.1 | 4.5 | 10.6% | 18 |
| lxx.ConceptA 0.8 | 4.7 | 10.6% | 9 |
| bayen.UbaMicro 1.4 | 6.0 | 8.9% | 7 |
| yk.JahMicro 1.0 | 7.7 | 7.4% | 11 |
| panzer.Panzer 0.2 | 7.8 | 6.9% | 1 |
| conscience.Electron 1.3g | 8.3 | 6.7% | 1 |
| donjezza.Jezza 1.0 | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 72.7 | 8 / 35 | 4875 |
| 2 | 1 | 64.0 | 79.7 | 9 / 35 | 4436 |
| 3 | 2 | 59.7 | 64.4 | 7 / 35 | 4465 |
| 4 | 2 | 61.8 | 69.8 | 5 / 35 | 5075 |
| 5 | 3 | 61.3 | 69.8 | 6 / 35 | 4268 |
| 6 | 2 | 61.0 | 68.9 | 6 / 35 | 4298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 46 | 37% |
| apc.botM 3.0 | 20 | 10% |
| lxx.ConceptA 0.8 | 14 | 79% |
| vjik.UnViolation 1.1 | 9 | 67% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 604. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 59 | 35% | 74 |
| apc.botM 3.0 | 48 | 28% | 52 |
| vjik.UnViolation 1.1 | 14 | 8% | 28 |
| bayen.UbaMicro 1.4 | 13 | 8% | 17 |
| lxx.ConceptA 0.8 | 12 | 7% | 13 |
| conscience.Electron 1.3g | 10 | 6% | 10 |
| panzer.Panzer 0.2 | 10 | 6% | 10 |
| yk.JahMicro 1.0 | 3 | 2% | 5 |
| donjezza.Jezza 1.0 | 0 | 0% | 1 |

## Melee bench: F33

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 62.7 | 19 / 210 | 4.36 | 13.3% | 25882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.8% | 84 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 13.2% | 27 |
| hadur117.mini.DeiseWHPT 0.2 | 3.3 | 13.3% | 19 |
| labg.Cataclysm 2.05 | 3.7 | 12.2% | 38 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 12.0% | 32 |
| baal.nano.N 1.42 | 6.3 | 8.9% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.6% | 6 |
| zyx.micro.Ant 1.1 | 8.3 | 5.3% | 0 |
| sanja.First 0.1 | 9.2 | 4.4% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 67.9 | 3 / 35 | 4816 |
| 2 | 4 | 58.6 | 60.0 | 3 / 35 | 3752 |
| 3 | 5 | 57.2 | 53.7 | 3 / 35 | 4193 |
| 4 | 2 | 62.6 | 69.8 | 5 / 35 | 4495 |
| 5 | 4 | 58.9 | 60.3 | 1 / 35 | 4268 |
| 6 | 3 | 61.1 | 64.4 | 4 / 35 | 4358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 23 | 43% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 40% |
| labg.Cataclysm 2.05 | 9 | 11% |
| gre.svman4.Leonidas 1.3.2 | 8 | 25% |
| baal.nano.N 1.42 | 2 | 50% |
| kinsen.melee.Angsaichmophobia 1.8c | 1 | 100% |

Hadur died in 192 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 62 | 32% | 72 |
| gre.svman4.Leonidas 1.3.2 | 35 | 18% | 37 |
| labg.Cataclysm 2.05 | 28 | 15% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 14% | 29 |
| kinsen.melee.Angsaichmophobia 1.8c | 17 | 9% | 18 |
| baal.nano.N 1.42 | 13 | 7% | 14 |
| zyx.micro.Ant 1.1 | 6 | 3% | 6 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 4 | 2% | 4 |
| sanja.First 0.1 | 1 | 1% | 1 |

## Melee bench: F34

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 63.4 | 13 / 210 | 4.29 | 13.1% | 26646 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.5 | 17.8% | 95 |
| kid.Gladiator .7.2 | 1.5 | 17.6% | 67 |
| hadur117.mini.DeiseWHPT 0.2 | 3.5 | 13.1% | 13 |
| tcf.Reach 3 | 4.0 | 12.1% | 16 |
| jcs.Seth 1.8 | 4.8 | 10.8% | 16 |
| cli.Dancer 1.1 | 5.7 | 10.2% | 4 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.9% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.8% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.7 | 67.3 | 4 / 35 | 4868 |
| 2 | 3 | 61.1 | 66.0 | 2 / 35 | 4450 |
| 3 | 4 | 60.2 | 61.0 | 4 / 35 | 4289 |
| 4 | 3 | 61.4 | 66.7 | 1 / 35 | 4468 |
| 5 | 5 | 57.5 | 56.5 | 1 / 35 | 3905 |
| 6 | 3 | 60.8 | 63.2 | 1 / 35 | 4666 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 17 | 6% |
| kid.Gladiator .7.2 | 12 | 50% |
| jcs.Seth 1.8 | 4 | 100% |
| cli.Dancer 1.1 | 4 | 25% |
| tcf.Reach 3 | 4 | 0% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 197 of 210 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 75 | 38% | 76 |
| kid.Gladiator .7.2 | 58 | 29% | 63 |
| tcf.Reach 3 | 25 | 13% | 26 |
| jcs.Seth 1.8 | 17 | 9% | 21 |
| cli.Dancer 1.1 | 17 | 9% | 19 |
| ratosh.Wesco 1.4 | 3 | 2% | 3 |
| sample.RamFire 1.0 | 1 | 1% | 1 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |

## Melee bench: F35

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 60.0 | 6 / 210 | 4.60 | 11.8% | 21426 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.9% | 178 |
| gh.mini.Gruwel 0.9 | 2.3 | 13.3% | 14 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.3 | 12.8% | 12 |
| hadur117.mini.DeiseWHPT 0.2 | 4.0 | 11.8% | 6 |
| rz.HawkOnFire 0.1 | 4.3 | 11.7% | 0 |
| wit.Chuliath 1.0 | 6.2 | 7.3% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 7.0% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.3 | 5.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.7% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.0 | 63.5 | 1 / 35 | 3202 |
| 2 | 2 | 60.0 | 66.3 | 2 / 35 | 4032 |
| 3 | 5 | 56.5 | 57.1 | 1 / 35 | 3580 |
| 4 | 5 | 57.7 | 59.4 | 0 / 35 | 3858 |
| 5 | 3 | 58.8 | 62.5 | 1 / 35 | 3796 |
| 6 | 5 | 53.1 | 51.1 | 1 / 35 | 2958 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 16 | 6% |
| rz.HawkOnFire 0.1 | 3 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 2 | 0% |
| gh.mini.Gruwel 0.9 | 2 | 0% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |
| dans.Cinnamon 1.2 | 1 | 100% |

Hadur died in 204 of 210 rounds, at a mean tick of 490. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 85 | 42% | 86 |
| dmh.robocode.robot.BlackDeath 9.2 | 46 | 23% | 47 |
| gh.mini.Gruwel 0.9 | 35 | 17% | 36 |
| rz.HawkOnFire 0.1 | 18 | 9% | 18 |
| wit.Chuliath 1.0 | 6 | 3% | 7 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6 | 3% | 6 |
| myl.nano.KomoriNinja 1.1 | 5 | 2% | 6 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 0% | 2 |

## Melee bench: F36

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 75.6 | 78 / 210 | 3.20 | 16.9% | 32250 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPT 0.2 | 1.0 | 16.9% | 78 |
| alpha.RainingFire 1.0 | 2.2 | 13.1% | 39 |
| bvh.micro.Freya 0.3 | 3.2 | 11.9% | 30 |
| bzdp.Pansy 2.1 | 4.3 | 11.3% | 19 |
| mz.Cork 0.1 | 4.7 | 10.9% | 15 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.4% | 14 |
| bvh.mini.Fenrir 0.39 | 6.7 | 8.7% | 4 |
| dl.BetterWalls 1.0 | 8.0 | 7.4% | 7 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 6.5% | 3 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.0% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 79.4 | 15 / 35 | 6007 |
| 2 | 1 | 66.0 | 78.7 | 12 / 35 | 5247 |
| 3 | 1 | 66.7 | 80.0 | 13 / 35 | 5307 |
| 4 | 1 | 64.0 | 72.7 | 10 / 35 | 5237 |
| 5 | 1 | 63.2 | 69.2 | 11 / 35 | 5152 |
| 6 | 1 | 65.3 | 73.3 | 17 / 35 | 5300 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.micro.Freya 0.3 | 31 | 58% |
| bzdp.Pansy 2.1 | 26 | 85% |
| alpha.RainingFire 1.0 | 22 | 45% |
| mz.Cork 0.1 | 18 | 83% |
| m3thos.Eva02 0.7.1 | 10 | 30% |
| dl.BetterWalls 1.0 | 8 | 75% |
| bvh.mini.Fenrir 0.39 | 4 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 36 | 27% | 48 |
| bvh.micro.Freya 0.3 | 28 | 21% | 45 |
| mz.Cork 0.1 | 18 | 14% | 31 |
| bzdp.Pansy 2.1 | 13 | 10% | 31 |
| m3thos.Eva02 0.7.1 | 12 | 9% | 19 |
| dl.BetterWalls 1.0 | 9 | 7% | 14 |
| squidM.TentalceMeleeNano 1.1 | 8 | 6% | 11 |
| bvh.mini.Fenrir 0.39 | 6 | 5% | 8 |
| sample.MyFirstRobot 1.0 | 2 | 2% | 3 |

## Melee bench: F37

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 84.2 | 124 / 210 | 2.42 | 18.1% | 34415 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPT 0.2 | 1.0 | 18.1% | 124 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.8 | 11.0% | 7 |
| germ.TheMind .2 | 2.8 | 10.7% | 15 |
| agrach.Dalek 1.0 | 5.0 | 9.2% | 19 |
| EBBU.Sim2 1.02 | 5.3 | 9.4% | 8 |
| lmk.ACPFinal 0.1 | 6.2 | 8.9% | 12 |
| stelo.UntouchableNano 1.3 | 6.5 | 9.2% | 14 |
| mb.Beast 0.1 | 7.8 | 8.2% | 10 |
| mn.nano.perceptual.Impact 1.3.0 | 8.2 | 8.1% | 0 |
| skm.Ryubot 1.0 | 9.3 | 7.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 92.1 | 22 / 35 | 6430 |
| 2 | 1 | 65.8 | 81.6 | 20 / 35 | 5569 |
| 3 | 1 | 65.8 | 83.8 | 19 / 35 | 5205 |
| 4 | 1 | 66.7 | 81.0 | 20 / 35 | 6120 |
| 5 | 1 | 65.5 | 80.0 | 21 / 35 | 5380 |
| 6 | 1 | 67.4 | 86.7 | 22 / 35 | 5711 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 31 | 61% |
| germ.TheMind .2 | 29 | 97% |
| stelo.UntouchableNano 1.3 | 21 | 67% |
| com.syncleus.robocode.Dreadnaught 0.1 | 18 | 94% |
| mb.Beast 0.1 | 15 | 93% |
| EBBU.Sim2 1.02 | 14 | 86% |
| skm.Ryubot 1.0 | 12 | 100% |
| lmk.ACPFinal 0.1 | 8 | 88% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 20 | 23% | 44 |
| stelo.UntouchableNano 1.3 | 16 | 18% | 29 |
| mb.Beast 0.1 | 12 | 14% | 25 |
| lmk.ACPFinal 0.1 | 11 | 13% | 22 |
| com.syncleus.robocode.Dreadnaught 0.1 | 10 | 11% | 40 |
| EBBU.Sim2 1.02 | 8 | 9% | 19 |
| mn.nano.perceptual.Impact 1.3.0 | 8 | 9% | 15 |
| germ.TheMind .2 | 2 | 2% | 11 |
| skm.Ryubot 1.0 | 1 | 1% | 3 |

## Melee bench: F38

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 59.6 | 13 / 210 | 4.63 | 12.1% | 23651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.8% | 120 |
| bvh.mini.Freya 0.55 | 2.5 | 12.9% | 20 |
| hadur117.mini.DeiseWHPT 0.2 | 3.3 | 12.1% | 13 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.8% | 31 |
| cs.Wren 1.0 | 4.5 | 11.4% | 12 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.8 | 10.0% | 6 |
| kdf.KoulDestroyer 1.0 | 6.7 | 9.0% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 6.3% | 2 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.5% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.7 | 48.9 | 2 / 35 | 3666 |
| 2 | 5 | 55.9 | 55.6 | 3 / 35 | 3873 |
| 3 | 3 | 56.9 | 61.3 | 1 / 35 | 3702 |
| 4 | 2 | 58.8 | 61.3 | 4 / 35 | 3983 |
| 5 | 3 | 58.7 | 61.9 | 1 / 35 | 4003 |
| 6 | 2 | 61.5 | 68.9 | 2 / 35 | 4424 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 24 | 4% |
| bts.mega.Gnarly 1.4 | 11 | 27% |
| bvh.mini.Freya 0.55 | 7 | 29% |
| cs.Wren 1.0 | 4 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 100% |

Hadur died in 198 of 210 rounds, at a mean tick of 561. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 79 | 40% | 85 |
| bts.mega.Gnarly 1.4 | 41 | 21% | 43 |
| bvh.mini.Freya 0.55 | 23 | 12% | 24 |
| cs.Wren 1.0 | 17 | 9% | 18 |
| kdf.KoulDestroyer 1.0 | 16 | 8% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 5% | 12 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7 | 4% | 7 |
| bzdp.BoxCar 2.0 | 3 | 2% | 3 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 2 |

## Melee bench: F39

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 68.1 | 38 / 210 | 3.87 | 14.2% | 27543 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.0 | 15.3% | 42 |
| hadur117.mini.DeiseWHPT 0.2 | 2.3 | 14.2% | 38 |
| az.Ololobot 0.2.4 | 3.2 | 12.6% | 63 |
| catcat20.Lambda 0.024 | 3.5 | 12.1% | 36 |
| stelo.SoRobotNanoMelee 1.2 | 5.7 | 9.6% | 18 |
| gimp.GimpBot 0.1 | 6.0 | 8.8% | 5 |
| winamp32.micro.MicroMacro 1.0 | 6.8 | 8.4% | 7 |
| apollokidd.ApolloKidd 0.9 | 7.5 | 7.7% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.2% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 66.0 | 6 / 35 | 4714 |
| 2 | 3 | 59.7 | 64.1 | 7 / 35 | 4352 |
| 3 | 2 | 61.8 | 70.5 | 8 / 35 | 4760 |
| 4 | 2 | 63.4 | 74.9 | 8 / 35 | 4885 |
| 5 | 3 | 58.7 | 64.1 | 5 / 35 | 4104 |
| 6 | 2 | 61.4 | 68.9 | 4 / 35 | 4728 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 29 | 62% |
| az.Ololobot 0.2.4 | 11 | 0% |
| catcat20.Lambda 0.024 | 10 | 50% |
| stelo.SoRobotNanoMelee 1.2 | 7 | 100% |
| gimp.GimpBot 0.1 | 4 | 50% |
| winamp32.micro.MicroMacro 1.0 | 3 | 67% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 173 of 210 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 62 | 36% | 76 |
| az.Ololobot 0.2.4 | 34 | 20% | 36 |
| catcat20.Lambda 0.024 | 26 | 15% | 32 |
| gimp.GimpBot 0.1 | 15 | 9% | 21 |
| stelo.SoRobotNanoMelee 1.2 | 12 | 7% | 14 |
| winamp32.micro.MicroMacro 1.0 | 11 | 6% | 14 |
| apollokidd.ApolloKidd 0.9 | 8 | 5% | 11 |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 2% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 1% | 3 |

## Melee bench: F40

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 69.7 | 50 / 210 | 3.72 | 15.2% | 29260 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 1.3 | 15.8% | 70 |
| hadur117.mini.DeiseWHPT 0.2 | 1.7 | 15.2% | 50 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.7% | 37 |
| mz.AntiGrav 1.0 | 4.2 | 11.0% | 19 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.7% | 7 |
| alpha.BlackIce 1.0 | 6.0 | 9.7% | 10 |
| stelo.Randomness 1.0 | 6.8 | 8.7% | 14 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.7% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.6% | 2 |
| sample.Corners 1.0 | 10.0 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 71.4 | 12 / 35 | 4935 |
| 2 | 1 | 64.0 | 72.7 | 8 / 35 | 5272 |
| 3 | 2 | 60.9 | 66.0 | 5 / 35 | 4405 |
| 4 | 2 | 64.4 | 72.1 | 10 / 35 | 5150 |
| 5 | 1 | 63.4 | 71.7 | 8 / 35 | 4793 |
| 6 | 2 | 61.5 | 64.4 | 7 / 35 | 4705 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 36 | 44% |
| kano.gamma.KanoGamma 1.8 | 16 | 56% |
| Polkwane.SmashMelee 1.0 | 12 | 75% |
| mz.AntiGrav 1.0 | 8 | 88% |
| alpha.BlackIce 1.0 | 4 | 25% |
| stelo.Randomness 1.0 | 3 | 67% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |
| sample.Corners 1.0 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 65 | 41% | 75 |
| kano.gamma.KanoGamma 1.8 | 35 | 22% | 51 |
| alpha.BlackIce 1.0 | 14 | 9% | 15 |
| stelo.Randomness 1.0 | 12 | 8% | 17 |
| amk.superstrike.SuperStrike 0.3 | 12 | 8% | 14 |
| Polkwane.SmashMelee 1.0 | 9 | 6% | 13 |
| mz.AntiGrav 1.0 | 8 | 5% | 17 |
| testantiswapgun.AntiSwap 1.0 | 5 | 3% | 6 |
| sample.Corners 1.0 | 0 | 0% | 2 |

## Melee bench: F41

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 61.5 | 15 / 210 | 4.46 | 12.8% | 25518 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 17.5% | 112 |
| ary.Swarm 1.1 | 3.0 | 13.0% | 18 |
| lessonz.robocode.Oz 0.5.0 | 3.2 | 13.1% | 38 |
| hadur117.mini.DeiseWHPT 0.2 | 3.3 | 12.8% | 15 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.1% | 16 |
| shrub.Silver v048 | 5.8 | 9.7% | 8 |
| zyx.nano.Ant 1.1 | 7.2 | 7.3% | 1 |
| stelo.Mirror 1.1 | 8.2 | 6.2% | 1 |
| jsal.Jsalbot 1.0 | 8.7 | 6.3% | 3 |
| acogdev.alpha 0.2 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.3 | 53.0 | 1 / 35 | 3962 |
| 2 | 3 | 60.1 | 64.1 | 4 / 35 | 4348 |
| 3 | 2 | 60.7 | 64.4 | 2 / 35 | 4737 |
| 4 | 4 | 59.7 | 63.8 | 3 / 35 | 4397 |
| 5 | 2 | 60.8 | 67.0 | 2 / 35 | 4255 |
| 6 | 4 | 57.1 | 56.8 | 3 / 35 | 3819 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 22 | 5% |
| lessonz.robocode.Oz 0.5.0 | 7 | 43% |
| ary.Swarm 1.1 | 6 | 83% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| shrub.Silver v048 | 3 | 0% |
| simonton.nano.MeleeSeed 1.8 | 3 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 196 of 210 rounds, at a mean tick of 589. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 91 | 46% | 95 |
| lessonz.robocode.Oz 0.5.0 | 32 | 16% | 35 |
| ary.Swarm 1.1 | 29 | 15% | 33 |
| shrub.Silver v048 | 18 | 9% | 18 |
| simonton.nano.MeleeSeed 1.8 | 12 | 6% | 14 |
| jsal.Jsalbot 1.0 | 5 | 3% | 7 |
| stelo.Mirror 1.1 | 4 | 2% | 4 |
| zyx.nano.Ant 1.1 | 3 | 2% | 3 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 65.3 | 9 / 210 | 4.12 | 13.6% | 29196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.9% | 115 |
| maribo.mini.MiniQuester 0.1 | 2.3 | 14.5% | 39 |
| hadur117.mini.DeiseWHPT 0.2 | 3.2 | 13.6% | 9 |
| ara.Shera 0.88 | 3.5 | 13.3% | 39 |
| amz.NanoClone 1.41 | 5.5 | 8.9% | 1 |
| maribo.IotaCT 1.1 | 6.3 | 7.7% | 0 |
| dsw.StaticD 1.0 | 6.3 | 8.1% | 7 |
| stelo.MirrorMicro 1.0 | 7.8 | 6.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 5.0% | 0 |
| mme.NikeEnhanced 2.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.0 | 68.6 | 2 / 35 | 5586 |
| 2 | 2 | 60.5 | 64.4 | 0 / 35 | 5300 |
| 3 | 4 | 60.8 | 66.3 | 2 / 35 | 4839 |
| 4 | 3 | 60.9 | 67.9 | 1 / 35 | 4672 |
| 5 | 4 | 58.8 | 60.6 | 3 / 35 | 4400 |
| 6 | 3 | 59.0 | 63.8 | 1 / 35 | 4399 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 26 | 8% |
| maribo.mini.MiniQuester 0.1 | 18 | 22% |
| ara.Shera 0.88 | 4 | 50% |
| amz.NanoClone 1.41 | 1 | 0% |
| dsw.StaticD 1.0 | 1 | 100% |

Hadur died in 201 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 78 | 39% | 79 |
| maribo.mini.MiniQuester 0.1 | 49 | 24% | 52 |
| ara.Shera 0.88 | 43 | 21% | 46 |
| amz.NanoClone 1.41 | 13 | 6% | 13 |
| dsw.StaticD 1.0 | 12 | 6% | 13 |
| stelo.MirrorMicro 1.0 | 3 | 1% | 4 |
| maribo.IotaCT 1.1 | 3 | 1% | 3 |

## Melee bench: F43

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.3 | 53.4 | 3 / 210 | 5.19 | 10.8% | 21209 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.8% | 169 |
| brainfade.melee.Dusk 0.44 | 2.3 | 12.6% | 21 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.3% | 5 |
| wcsv.melee.EngineerMelee 0.1 | 4.0 | 11.3% | 7 |
| hadur117.mini.DeiseWHPT 0.2 | 5.2 | 10.8% | 3 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.7% | 3 |
| jab.DiamondStealer 5 | 7.2 | 8.4% | 0 |
| mz.NanoGod 2.02 | 7.3 | 8.3% | 2 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 54.7 | 47.9 | 1 / 35 | 3439 |
| 2 | 7 | 52.2 | 45.4 | 0 / 35 | 2933 |
| 3 | 5 | 55.9 | 51.7 | 0 / 35 | 3689 |
| 4 | 3 | 60.8 | 64.4 | 1 / 35 | 4050 |
| 5 | 5 | 56.6 | 54.3 | 0 / 35 | 3570 |
| 6 | 5 | 57.7 | 56.8 | 1 / 35 | 3528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 19 | 0% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 50% |
| brainfade.melee.Dusk 0.44 | 3 | 0% |
| jab.DiamondStealer 5 | 1 | 100% |
| mz.NanoGod 2.02 | 1 | 0% |

Hadur died in 207 of 210 rounds, at a mean tick of 508. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 86 | 42% | 86 |
| wcsv.melee.EngineerMelee 0.1 | 32 | 15% | 34 |
| brainfade.melee.Dusk 0.44 | 31 | 15% | 31 |
| dummy.micro.Sparrow 2.5 | 21 | 10% | 22 |
| jab.DiamondStealer 5 | 15 | 7% | 15 |
| mz.NanoGod 2.02 | 13 | 6% | 13 |
| Krabb.akim2.Akim2 1.1b | 9 | 4% | 9 |

## Melee bench: F44

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 65.9 | 30 / 210 | 4.07 | 14.4% | 30786 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.2 | 16.2% | 95 |
| tzu.TheArtOfWar 1.2 | 2.3 | 14.3% | 42 |
| hadur117.mini.DeiseWHPT 0.2 | 2.5 | 14.4% | 30 |
| jwirde.Gort 2.0 | 4.3 | 11.1% | 23 |
| wompi.Quokka 1.6 | 5.3 | 10.4% | 10 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.3 | 10.2% | 9 |
| disan.Chair 2.2.0 | 7.3 | 8.1% | 2 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.2% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 67.3 | 8 / 35 | 5102 |
| 2 | 3 | 61.6 | 65.4 | 4 / 35 | 5188 |
| 3 | 3 | 62.3 | 66.3 | 4 / 35 | 5179 |
| 4 | 3 | 61.4 | 64.1 | 5 / 35 | 5214 |
| 5 | 2 | 62.4 | 67.9 | 4 / 35 | 5104 |
| 6 | 3 | 60.9 | 64.1 | 5 / 35 | 4999 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 33 | 36% |
| tzu.TheArtOfWar 1.2 | 18 | 50% |
| jwirde.Gort 2.0 | 10 | 10% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 57% |
| wompi.Quokka 1.6 | 4 | 50% |
| disan.Chair 2.2.0 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 182 of 210 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 57 | 31% | 68 |
| jwirde.Gort 2.0 | 35 | 19% | 37 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 26 | 14% | 30 |
| tzu.TheArtOfWar 1.2 | 24 | 13% | 31 |
| wompi.Quokka 1.6 | 19 | 10% | 21 |
| disan.Chair 2.2.0 | 13 | 7% | 15 |
| amk.jointstrike.JointStrike 0.2 | 6 | 3% | 6 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 77.1 | 37 / 210 | 3.06 | 17.1% | 34088 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPT 0.2 | 1.0 | 17.1% | 37 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 13.1% | 114 |
| jje.BagPuss 1.2 | 2.5 | 12.9% | 21 |
| sul.Lunar 1.1 | 4.2 | 10.7% | 25 |
| myl.nano.Graviton 1.10 | 5.5 | 10.0% | 3 |
| fm.claire 1.7 | 6.0 | 8.9% | 1 |
| hvilela.HVilela 0.9 | 6.8 | 8.5% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 7.9% | 3 |
| wit.Deep7 2.0 | 9.5 | 5.5% | 6 |
| abud.ThirdRobo 1.0 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 79.4 | 7 / 35 | 5604 |
| 2 | 1 | 66.0 | 78.7 | 8 / 35 | 5562 |
| 3 | 1 | 67.8 | 80.0 | 6 / 35 | 6458 |
| 4 | 1 | 64.5 | 74.6 | 5 / 35 | 5420 |
| 5 | 1 | 65.8 | 77.8 | 8 / 35 | 5474 |
| 6 | 1 | 64.4 | 72.4 | 3 / 35 | 5570 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 64 | 6% |
| jje.BagPuss 1.2 | 20 | 30% |
| sul.Lunar 1.1 | 17 | 41% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 89% |
| myl.nano.Graviton 1.10 | 8 | 100% |
| fm.claire 1.7 | 3 | 100% |
| wit.Deep7 2.0 | 3 | 33% |

Hadur died in 175 of 210 rounds, at a mean tick of 1409. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 64 | 37% | 0 |
| jje.BagPuss 1.2 | 51 | 29% | 89 |
| sul.Lunar 1.1 | 22 | 13% | 41 |
| hvilela.HVilela 0.9 | 10 | 6% | 16 |
| myl.nano.Graviton 1.10 | 9 | 5% | 20 |
| fm.claire 1.7 | 9 | 5% | 13 |
| pez.mini.ChironexFleckeri 0.5 | 7 | 4% | 16 |
| wit.Deep7 2.0 | 2 | 1% | 10 |
| abud.ThirdRobo 1.0 | 1 | 1% | 3 |

## Melee bench: F46

hadur117.mini.DeiseWHPT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 64.3 | 11 / 210 | 4.21 | 12.8% | 24080 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 18.5% | 96 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 17.3% | 91 |
| hadur117.mini.DeiseWHPT 0.2 | 3.2 | 12.8% | 11 |
| mz.MicroSheep 1.0 | 4.2 | 10.5% | 2 |
| cx.Princess 1.0 | 5.2 | 9.7% | 8 |
| sadoner.killer 0.2 | 5.7 | 9.3% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.4% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.8 | 58.1 | 1 / 35 | 3656 |
| 2 | 3 | 59.3 | 65.1 | 2 / 35 | 3887 |
| 3 | 3 | 60.9 | 67.3 | 3 / 35 | 4201 |
| 4 | 3 | 62.1 | 68.6 | 4 / 35 | 4570 |
| 5 | 4 | 57.9 | 61.9 | 1 / 35 | 3680 |
| 6 | 3 | 59.8 | 65.1 | 0 / 35 | 4086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 20 | 10% |
| rsalesc.melee.Medina 0.4.5 | 12 | 25% |
| sadoner.killer 0.2 | 2 | 100% |
| mz.MicroSheep 1.0 | 1 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |
| cx.Princess 1.0 | 1 | 100% |

Hadur died in 199 of 210 rounds, at a mean tick of 552. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 94 | 47% | 98 |
| rsalesc.melee.Medina 0.4.5 | 58 | 29% | 61 |
| sadoner.killer 0.2 | 12 | 6% | 14 |
| cx.Princess 1.0 | 10 | 5% | 11 |
| mz.MicroSheep 1.0 | 8 | 4% | 9 |
| jeremyreeder.collective.Prophet 5 | 7 | 4% | 8 |
| arthord.NanoSatanMelee Beta | 6 | 3% | 6 |
| kurios.DOSexe .9a | 3 | 2% | 3 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 0 |

