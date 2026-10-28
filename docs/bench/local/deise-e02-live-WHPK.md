# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 72.5 | 17 / 210 | 3.48 | 14.6% | 29967 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.0% | 147 |
| hadur117.mini.DeiseWHPK 0.2 | 2.0 | 14.6% | 17 |
| mz.MicroGodMelee 1 | 3.7 | 11.7% | 16 |
| sgp.JollyNinja 3.53 | 3.8 | 11.6% | 18 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.7 | 10.9% | 8 |
| lorneswork.Predator 1.0 | 5.8 | 10.1% | 3 |
| adt.Ar2 1.0 | 7.0 | 7.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.7% | 1 |
| skm.butterfly 1.0 | 9.0 | 4.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 78.4 | 3 / 35 | 5279 |
| 2 | 2 | 64.5 | 78.4 | 4 / 35 | 5213 |
| 3 | 2 | 61.8 | 68.6 | 3 / 35 | 4991 |
| 4 | 2 | 62.0 | 71.1 | 3 / 35 | 4855 |
| 5 | 2 | 60.7 | 65.1 | 1 / 35 | 4883 |
| 6 | 2 | 62.7 | 73.3 | 3 / 35 | 4746 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 69 | 6% |
| mz.MicroGodMelee 1 | 12 | 17% |
| sgp.JollyNinja 3.53 | 10 | 80% |
| simonton.nano.WeekendObsession_Melee 1.0 | 1 | 100% |
| lorneswork.Predator 1.0 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 193 of 210 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 104 | 54% | 111 |
| mz.MicroGodMelee 1 | 31 | 16% | 32 |
| sgp.JollyNinja 3.53 | 24 | 12% | 29 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 9% | 18 |
| lorneswork.Predator 1.0 | 9 | 5% | 10 |
| kawigi.sbf.FloodSonnet 0.9 | 4 | 2% | 4 |
| skm.butterfly 1.0 | 2 | 1% | 2 |
| adt.Ar2 1.0 | 1 | 1% | 2 |
| mym.EdgeStalker 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 70.8 | 40 / 210 | 3.62 | 15.7% | 33326 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPK 0.2 | 1.5 | 15.7% | 40 |
| pulsar.PulsarMax 0.8.9 | 2.0 | 15.1% | 68 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 14.2% | 53 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.1% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.5 | 10.2% | 13 |
| sch.Simone 0.3d | 6.5 | 8.4% | 10 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 8.3% | 4 |
| Noran.BitchingElk 0.054 | 8.0 | 7.5% | 15 |
| stelo.PatternRobot 1.0 | 8.8 | 6.6% | 5 |
| fullsail.SweetTea 1.1 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 67.6 | 5 / 35 | 5712 |
| 2 | 1 | 67.1 | 80.3 | 12 / 35 | 5787 |
| 3 | 2 | 63.1 | 69.2 | 5 / 35 | 5440 |
| 4 | 1 | 63.6 | 71.7 | 5 / 35 | 5450 |
| 5 | 2 | 64.0 | 71.4 | 6 / 35 | 5646 |
| 6 | 1 | 61.6 | 64.8 | 7 / 35 | 5291 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 33 | 33% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 27 | 22% |
| Noran.BitchingElk 0.054 | 9 | 44% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 88% |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 63% |
| sch.Simone 0.3d | 6 | 67% |
| stelo.PatternRobot 1.0 | 4 | 75% |
| fnc.bandit.Bandit 5.2.0 | 1 | 0% |

Hadur died in 171 of 210 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 54 | 32% | 65 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 47 | 27% | 56 |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 9% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 8% | 16 |
| sch.Simone 0.3d | 12 | 7% | 19 |
| stelo.PatternRobot 1.0 | 12 | 7% | 14 |
| fnc.bandit.Bandit 5.2.0 | 9 | 5% | 9 |
| Noran.BitchingElk 0.054 | 5 | 3% | 5 |
| fullsail.SweetTea 1.1 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 84.2 | 73 / 210 | 2.42 | 18.0% | 38308 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPK 0.2 | 1.0 | 18.0% | 73 |
| radnor.DoctorBob 1.42 | 2.0 | 16.3% | 88 |
| kawigi.nano.Lib 1.0 | 3.3 | 12.7% | 15 |
| vuen.Cake 2.51 | 3.7 | 12.2% | 31 |
| urdos.URDOS 1.3 | 5.0 | 9.6% | 1 |
| adt.Ar1 2.1 | 6.0 | 7.6% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 6.7% | 0 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.6% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 89.8 | 16 / 35 | 6411 |
| 2 | 1 | 66.2 | 78.7 | 10 / 35 | 6472 |
| 3 | 1 | 67.3 | 82.9 | 12 / 35 | 6150 |
| 4 | 1 | 66.7 | 81.9 | 9 / 35 | 6293 |
| 5 | 1 | 68.4 | 86.0 | 14 / 35 | 6540 |
| 6 | 1 | 67.9 | 85.7 | 12 / 35 | 6442 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 50 | 20% |
| kawigi.nano.Lib 1.0 | 45 | 98% |
| vuen.Cake 2.51 | 25 | 28% |
| urdos.URDOS 1.3 | 4 | 100% |
| adt.Ar1 2.1 | 3 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 81 | 59% | 93 |
| vuen.Cake 2.51 | 28 | 20% | 43 |
| urdos.URDOS 1.3 | 12 | 9% | 17 |
| kawigi.nano.Lib 1.0 | 8 | 6% | 37 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 1% | 5 |
| oa.weak.FlyMk1 0.1 | 2 | 1% | 4 |
| adt.Ar1 2.1 | 1 | 1% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 1% | 3 |

## Melee bench: F04

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 65.6 | 6 / 210 | 4.10 | 13.7% | 30483 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.5% | 185 |
| apc.LeeroyJenkins2 1.0 | 2.2 | 14.5% | 11 |
| hadur117.mini.DeiseWHPK 0.2 | 2.8 | 13.7% | 6 |
| TNT.TNT 0.99.1 | 4.0 | 11.4% | 3 |
| josago.Jorgito 0.16 | 5.0 | 9.6% | 3 |
| css.Delitioner 0.11 | 6.2 | 7.4% | 1 |
| tj.zombie1n 1.0.1 | 6.8 | 6.8% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.3% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.8 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 62.9 | 1 / 35 | 5017 |
| 2 | 3 | 62.8 | 68.6 | 1 / 35 | 5321 |
| 3 | 3 | 61.7 | 64.8 | 0 / 35 | 5168 |
| 4 | 2 | 63.3 | 69.5 | 3 / 35 | 5315 |
| 5 | 3 | 60.2 | 61.6 | 1 / 35 | 4525 |
| 6 | 3 | 62.3 | 66.3 | 0 / 35 | 5137 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 39 | 3% |
| apc.LeeroyJenkins2 1.0 | 4 | 50% |
| TNT.TNT 0.99.1 | 4 | 75% |
| josago.Jorgito 0.16 | 2 | 0% |

Hadur died in 204 of 210 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 103 | 50% | 104 |
| apc.LeeroyJenkins2 1.0 | 47 | 23% | 49 |
| josago.Jorgito 0.16 | 28 | 14% | 29 |
| TNT.TNT 0.99.1 | 14 | 7% | 17 |
| css.Delitioner 0.11 | 6 | 3% | 6 |
| rampancy.Durandal 2.1d | 3 | 1% | 3 |
| tj.zombie1n 1.0.1 | 3 | 1% | 2 |

## Melee bench: F05

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.6 | 53.1 | 0 / 210 | 5.22 | 10.5% | 20424 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 19.0% | 126 |
| justin.DemonicRage 3.4 | 1.7 | 17.8% | 66 |
| wompi.Numbat 2.1 | 3.0 | 13.4% | 11 |
| hadur117.mini.DeiseWHPK 0.2 | 4.3 | 10.5% | 0 |
| axeBots.HataMoto 3.09 | 5.2 | 9.1% | 5 |
| ms.Ares 0.19 | 5.5 | 9.3% | 2 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.2% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.8% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.7% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.3 | 53.3 | 0 / 35 | 3182 |
| 2 | 5 | 54.3 | 54.0 | 0 / 35 | 3187 |
| 3 | 4 | 56.9 | 58.4 | 0 / 35 | 3630 |
| 4 | 4 | 55.0 | 51.7 | 0 / 35 | 3684 |
| 5 | 5 | 52.4 | 47.9 | 0 / 35 | 3425 |
| 6 | 4 | 54.5 | 53.0 | 0 / 35 | 3316 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 3 | 0% |
| justin.DemonicRage 3.4 | 3 | 0% |
| ms.Ares 0.19 | 1 | 0% |

Hadur died in 210 of 210 rounds, at a mean tick of 487. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 58 | 28% | 58 |
| cb.fire.Firestarter 2.0f | 55 | 26% | 55 |
| wompi.Numbat 2.1 | 44 | 21% | 44 |
| axeBots.HataMoto 3.09 | 17 | 8% | 17 |
| ms.Ares 0.19 | 14 | 7% | 14 |
| supersample.SuperBoxBot 1.0 | 10 | 5% | 10 |
| Queens_teamrobot.UltraRazor 1.0 | 5 | 2% | 5 |
| davidalves.net.DuelistMicroMelee 1.4 | 4 | 2% | 4 |
| GarmBox.Oranges 1.0 | 3 | 1% | 3 |

## Melee bench: F06

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 70.4 | 46 / 210 | 3.67 | 15.1% | 29494 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.7 | 15.2% | 46 |
| hadur117.mini.DeiseWHPK 0.2 | 2.0 | 15.1% | 46 |
| origin.SleepSiphon 1.7b | 2.7 | 13.9% | 65 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.4% | 26 |
| mld.Wisdom 1.0 | 4.8 | 10.6% | 7 |
| gg.Wolverine 2.0 | 6.2 | 8.4% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 7.4% | 13 |
| spinnercat.Omen 1.0 | 7.8 | 7.2% | 0 |
| DBall.NUKE 0.1 | 8.5 | 6.8% | 2 |
| sample.Fire 1.0 | 10.0 | 3.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 73.0 | 8 / 35 | 5139 |
| 2 | 1 | 64.8 | 76.5 | 8 / 35 | 5263 |
| 3 | 2 | 64.4 | 73.7 | 10 / 35 | 5109 |
| 4 | 2 | 62.7 | 69.5 | 8 / 35 | 4863 |
| 5 | 3 | 60.5 | 62.2 | 7 / 35 | 4644 |
| 6 | 3 | 61.3 | 67.3 | 5 / 35 | 4476 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 32 | 59% |
| origin.SleepSiphon 1.7b | 20 | 5% |
| pe.minimelee.SandboxMiniMelee 1.1 | 16 | 94% |
| gg.Wolverine 2.0 | 6 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 17% |
| mld.Wisdom 1.0 | 3 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 624. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 61 | 37% | 66 |
| jekl.StoneGhost 0.7 | 40 | 24% | 60 |
| pe.minimelee.SandboxMiniMelee 1.1 | 22 | 13% | 28 |
| ers.nano.hawk.HawkLA 3.0m | 17 | 10% | 19 |
| gg.Wolverine 2.0 | 13 | 8% | 17 |
| mld.Wisdom 1.0 | 8 | 5% | 16 |
| spinnercat.Omen 1.0 | 1 | 1% | 2 |
| sample.Fire 1.0 | 1 | 1% | 1 |
| DBall.NUKE 0.1 | 1 | 1% | 1 |

## Melee bench: F07

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 80.9 | 38 / 210 | 2.72 | 17.2% | 36803 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.7 | 18.7% | 76 |
| hadur117.mini.DeiseWHPK 0.2 | 2.0 | 17.2% | 38 |
| rtk.Tachikoma 1.0 | 2.3 | 17.4% | 73 |
| franzor.Lizt 1.3.1 | 4.3 | 11.3% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 11.0% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.5% | 1 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.3% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.9% | 0 |
| sample.Target 1.0 | 9.0 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 83.5 | 8 / 35 | 6702 |
| 2 | 2 | 67.8 | 79.4 | 8 / 35 | 6067 |
| 3 | 2 | 68.7 | 83.2 | 6 / 35 | 6171 |
| 4 | 2 | 67.7 | 81.3 | 5 / 35 | 5785 |
| 5 | 2 | 68.2 | 80.6 | 6 / 35 | 6037 |
| 6 | 3 | 67.1 | 77.5 | 5 / 35 | 6041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 62 | 31% |
| rsalesc.melee.Monk 0.3.6c | 37 | 5% |
| oog.melee.CapuletDroid 1.1 | 15 | 87% |
| franzor.Lizt 1.3.1 | 10 | 20% |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 1014. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 74 | 43% | 102 |
| rsalesc.melee.Monk 0.3.6c | 67 | 39% | 76 |
| franzor.Lizt 1.3.1 | 18 | 10% | 10 |
| oog.melee.CapuletDroid 1.1 | 5 | 3% | 13 |
| exauge.GateKeeper 1.1.121g | 4 | 2% | 5 |
| lrem.micro.MoggFanatic 0.2 | 3 | 2% | 3 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 70.2 | 38 / 210 | 3.68 | 15.1% | 30366 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPK 0.2 | 1.2 | 15.1% | 38 |
| tm.Yuugao 1.0 | 2.3 | 14.0% | 59 |
| shrub.Vapour v159 | 2.7 | 13.1% | 44 |
| Krabb.sliNk.Garm 0.9u | 4.5 | 11.1% | 28 |
| com.spp.robocode.MostlyHarmless 010 | 4.5 | 10.9% | 27 |
| m3thos.Eva00 1.1 | 6.2 | 9.0% | 7 |
| jwst.DAD.DarkAndDarker 1.1 | 7.7 | 7.6% | 4 |
| SHAM.WOW 1.4 | 8.2 | 6.9% | 4 |
| qualidafial.MajorDick 1.0.1 | 8.8 | 6.5% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.5 | 67.6 | 7 / 35 | 4891 |
| 2 | 1 | 64.0 | 75.2 | 7 / 35 | 5283 |
| 3 | 1 | 59.6 | 61.9 | 3 / 35 | 5032 |
| 4 | 1 | 65.3 | 77.5 | 9 / 35 | 5275 |
| 5 | 2 | 60.7 | 66.0 | 5 / 35 | 4590 |
| 6 | 1 | 63.6 | 73.0 | 7 / 35 | 5295 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 24 | 42% |
| com.spp.robocode.MostlyHarmless 010 | 18 | 22% |
| tm.Yuugao 1.0 | 16 | 19% |
| Krabb.sliNk.Garm 0.9u | 13 | 38% |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 88% |
| m3thos.Eva00 1.1 | 6 | 100% |
| SHAM.WOW 1.4 | 3 | 67% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 47 | 27% | 52 |
| com.spp.robocode.MostlyHarmless 010 | 37 | 22% | 43 |
| shrub.Vapour v159 | 32 | 19% | 42 |
| Krabb.sliNk.Garm 0.9u | 30 | 17% | 35 |
| m3thos.Eva00 1.1 | 8 | 5% | 10 |
| zyx.nano.BacillusComma 1.0 | 7 | 4% | 7 |
| SHAM.WOW 1.4 | 5 | 3% | 8 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 2% | 9 |
| qualidafial.MajorDick 1.0.1 | 2 | 1% | 4 |

## Melee bench: F09

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 57.7 | 8 / 210 | 4.80 | 12.2% | 25004 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 18.1% | 119 |
| kc.micro.Figment 1.0 | 1.8 | 15.3% | 49 |
| hadur117.mini.DeiseWHPK 0.2 | 3.5 | 12.2% | 8 |
| pedersen.Grishnakh 1.0 | 3.7 | 11.2% | 22 |
| yagami.Tidus 0.11 | 5.3 | 9.9% | 1 |
| mc2.enemy.Original 0.9 | 5.5 | 9.6% | 7 |
| dft.Calliope 5.6 | 7.0 | 8.0% | 4 |
| step.nanoPri 1.0 | 8.2 | 6.3% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.7% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.1 | 52.4 | 1 / 35 | 3776 |
| 2 | 5 | 53.2 | 49.5 | 0 / 35 | 3550 |
| 3 | 3 | 58.6 | 59.4 | 1 / 35 | 4370 |
| 4 | 3 | 58.8 | 60.0 | 1 / 35 | 4484 |
| 5 | 3 | 61.2 | 66.3 | 4 / 35 | 4632 |
| 6 | 3 | 57.9 | 58.7 | 1 / 35 | 4192 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 18 | 6% |
| kc.micro.Figment 1.0 | 16 | 6% |
| pedersen.Grishnakh 1.0 | 4 | 25% |
| mc2.enemy.Original 0.9 | 3 | 33% |
| rdm.Dueler 0.4x | 2 | 100% |
| dft.Calliope 5.6 | 1 | 100% |
| yagami.Tidus 0.11 | 1 | 100% |

Hadur died in 203 of 210 rounds, at a mean tick of 579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 73 | 36% | 75 |
| kc.micro.Figment 1.0 | 67 | 33% | 69 |
| pedersen.Grishnakh 1.0 | 16 | 8% | 17 |
| mc2.enemy.Original 0.9 | 12 | 6% | 13 |
| step.nanoPri 1.0 | 10 | 5% | 10 |
| yagami.Tidus 0.11 | 10 | 5% | 10 |
| dft.Calliope 5.6 | 6 | 3% | 7 |
| robar.nano.Assertive_Melee 0.2 | 5 | 2% | 6 |
| rdm.Dueler 0.4x | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 78.8 | 54 / 210 | 2.90 | 16.6% | 33863 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPK 0.2 | 1.3 | 16.6% | 54 |
| DTF.Kludgy 1.2b | 1.8 | 15.5% | 61 |
| ne.Chimera 1.2 | 3.3 | 13.3% | 29 |
| ejb.Polaris 1.0.1 | 3.5 | 12.8% | 36 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.6% | 13 |
| vStar.RAFzilla 2.15 | 5.5 | 10.6% | 14 |
| sam.Samspin 1.0 | 7.8 | 5.6% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.8 | 5.9% | 0 |
| kurios.DOSexe .9b | 8.3 | 5.5% | 3 |
| donjezza.Muncho 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 73.7 | 9 / 35 | 5320 |
| 2 | 1 | 65.2 | 78.4 | 9 / 35 | 5462 |
| 3 | 1 | 66.1 | 81.9 | 6 / 35 | 5668 |
| 4 | 1 | 67.1 | 81.9 | 13 / 35 | 5892 |
| 5 | 1 | 65.7 | 79.4 | 7 / 35 | 5675 |
| 6 | 2 | 65.7 | 77.8 | 10 / 35 | 5846 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 42 | 33% |
| ne.Chimera 1.2 | 26 | 69% |
| ejb.Polaris 1.0.1 | 25 | 28% |
| vStar.RAFzilla 2.15 | 13 | 46% |
| tvv.micro.Antares 1.1.1 | 8 | 75% |
| kurios.DOSexe .9b | 2 | 100% |
| donjezza.Muncho 1.0 | 1 | 100% |

Hadur died in 156 of 210 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 46 | 29% | 59 |
| ejb.Polaris 1.0.1 | 40 | 26% | 48 |
| ne.Chimera 1.2 | 26 | 17% | 47 |
| vStar.RAFzilla 2.15 | 20 | 13% | 27 |
| tvv.micro.Antares 1.1.1 | 14 | 9% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 4% | 6 |
| kurios.DOSexe .9b | 3 | 2% | 5 |
| sam.Samspin 1.0 | 1 | 1% | 1 |

## Melee bench: F11

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 65.1 | 26 / 210 | 4.14 | 13.8% | 27078 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 18.3% | 111 |
| hadur117.mini.DeiseWHPK 0.2 | 2.3 | 13.8% | 26 |
| cx.mini.Nimrod 0.55 | 2.7 | 12.6% | 27 |
| djc.DynaBot 0.1.1 | 4.3 | 10.7% | 18 |
| br2.MobyDickBot 1.6 | 5.2 | 9.4% | 15 |
| rdt199.Warlord 0.73 | 5.8 | 9.1% | 11 |
| uji.YellohFellah 1.0 | 7.0 | 8.1% | 3 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.3% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.4% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 66.3 | 6 / 35 | 4409 |
| 2 | 3 | 57.4 | 57.8 | 3 / 35 | 4128 |
| 3 | 2 | 64.4 | 75.6 | 7 / 35 | 4895 |
| 4 | 2 | 62.3 | 70.2 | 6 / 35 | 4641 |
| 5 | 2 | 61.1 | 66.0 | 2 / 35 | 4897 |
| 6 | 3 | 56.2 | 54.6 | 2 / 35 | 4108 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 33 | 15% |
| djc.DynaBot 0.1.1 | 12 | 58% |
| cx.mini.Nimrod 0.55 | 8 | 63% |
| rdt199.Warlord 0.73 | 7 | 71% |
| br2.MobyDickBot 1.6 | 4 | 75% |
| uji.YellohFellah 1.0 | 1 | 100% |

Hadur died in 184 of 210 rounds, at a mean tick of 658. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 100 | 54% | 108 |
| cx.mini.Nimrod 0.55 | 37 | 20% | 42 |
| djc.DynaBot 0.1.1 | 16 | 9% | 21 |
| stelo.MirrorNano 1.3 | 8 | 4% | 9 |
| rdt199.Warlord 0.73 | 7 | 4% | 11 |
| br2.MobyDickBot 1.6 | 5 | 3% | 7 |
| uji.YellohFellah 1.0 | 5 | 3% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 4 |
| KiraNL.Chupacabra 0.4 | 3 | 2% | 3 |

## Melee bench: F12

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 66.1 | 33 / 210 | 4.05 | 13.8% | 24764 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPK 0.2 | 2.2 | 13.8% | 33 |
| bts.wiki.RipCurl 0.9b | 2.3 | 14.3% | 58 |
| darkcanuck.Leon 1.01 | 2.7 | 13.7% | 55 |
| nat.PallasHawk 1.0 | 3.0 | 13.4% | 50 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.7% | 8 |
| jrm.Test0 1.0 | 6.0 | 8.5% | 0 |
| jp.Perpy 16.0 | 7.2 | 7.3% | 3 |
| cs.sheldor.Talon 1.1 | 8.0 | 6.7% | 1 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.9% | 1 |
| stuff.Vlad 0.1 | 9.5 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.5 | 63.8 | 7 / 35 | 4122 |
| 2 | 3 | 58.2 | 62.2 | 3 / 35 | 3844 |
| 3 | 3 | 59.2 | 64.4 | 6 / 35 | 4008 |
| 4 | 1 | 61.4 | 68.9 | 6 / 35 | 4338 |
| 5 | 3 | 61.3 | 67.9 | 7 / 35 | 4201 |
| 6 | 2 | 61.5 | 69.5 | 4 / 35 | 4251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 31 | 16% |
| bts.wiki.RipCurl 0.9b | 18 | 44% |
| nat.PallasHawk 1.0 | 13 | 62% |
| brainfade.melee.Genghis 0.36 | 6 | 83% |
| jrm.Test0 1.0 | 3 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 50% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 0% |

Hadur died in 178 of 210 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.Leon 1.01 | 62 | 35% | 67 |
| nat.PallasHawk 1.0 | 37 | 21% | 46 |
| bts.wiki.RipCurl 0.9b | 33 | 19% | 44 |
| jrm.Test0 1.0 | 11 | 6% | 13 |
| brainfade.melee.Genghis 0.36 | 11 | 6% | 12 |
| cs.sheldor.Talon 1.1 | 8 | 4% | 10 |
| jp.Perpy 16.0 | 7 | 4% | 8 |
| jaybot.bots.Oddball 4.0 | 6 | 3% | 7 |
| stuff.Vlad 0.1 | 3 | 2% | 3 |

## Melee bench: F13

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.7 | 60.6 | 2 / 210 | 4.54 | 11.8% | 23746 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.3 | 18.2% | 124 |
| ags.Glacier 0.2.11 | 1.7 | 16.7% | 48 |
| shinh.Entangled 0.3 | 3.7 | 12.7% | 22 |
| gh.micro.Gruweltje 0.7 | 4.2 | 12.0% | 13 |
| hadur117.mini.DeiseWHPK 0.2 | 4.2 | 11.8% | 2 |
| apc.Colossus2 0.17 | 6.2 | 8.2% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.1% | 1 |
| ayk.WallHugger 1.0 | 8.3 | 5.3% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.6% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.6 | 64.1 | 1 / 35 | 3807 |
| 2 | 3 | 59.0 | 63.8 | 0 / 35 | 4271 |
| 3 | 4 | 58.1 | 59.7 | 0 / 35 | 4147 |
| 4 | 5 | 57.5 | 59.4 | 0 / 35 | 4073 |
| 5 | 4 | 58.0 | 63.8 | 1 / 35 | 3821 |
| 6 | 5 | 54.9 | 53.0 | 0 / 35 | 3627 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 13 | 0% |
| ags.Glacier 0.2.11 | 11 | 9% |
| gh.micro.Gruweltje 0.7 | 3 | 0% |
| apc.Colossus2 0.17 | 1 | 100% |
| shinh.Entangled 0.3 | 1 | 0% |

Hadur died in 208 of 210 rounds, at a mean tick of 502. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 72 | 35% | 73 |
| mn.Combat 3.25.0 | 67 | 32% | 67 |
| shinh.Entangled 0.3 | 30 | 14% | 30 |
| gh.micro.Gruweltje 0.7 | 23 | 11% | 23 |
| stelo.Wang 1.0 | 6 | 3% | 6 |
| apc.Colossus2 0.17 | 5 | 2% | 6 |
| ayk.WallHugger 1.0 | 3 | 1% | 3 |
| maribo.FollowFire 1 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.5 | 95 / 210 | 2.48 | 18.2% | 35088 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPK 0.2 | 1.0 | 18.2% | 95 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.7% | 53 |
| catcat20.shape.Theta 0.018 | 3.0 | 13.0% | 38 |
| Lo_Ian.Gandalf_V4 4.0 | 4.5 | 9.9% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.2% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.8 | 9.6% | 7 |
| co.edu.usb.rc.LidisTron 1.0 | 6.5 | 9.0% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 8.1% | 10 |
| pa.Improved 1.0 | 9.0 | 5.5% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 78.4 | 12 / 35 | 5698 |
| 2 | 1 | 68.3 | 84.1 | 19 / 35 | 5898 |
| 3 | 1 | 68.8 | 87.6 | 19 / 35 | 5880 |
| 4 | 1 | 67.2 | 80.3 | 13 / 35 | 5670 |
| 5 | 1 | 68.1 | 85.4 | 15 / 35 | 5819 |
| 6 | 1 | 68.9 | 85.4 | 17 / 35 | 6123 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 74 | 76% |
| catcat20.shape.Theta 0.018 | 36 | 42% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 64% |
| sanyi.mikrobi.Roberto 1.0 | 8 | 50% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 75% |
| pa.Improved 1.0 | 1 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 35% | 96 |
| catcat20.shape.Theta 0.018 | 38 | 33% | 51 |
| sanyi.mikrobi.Roberto 1.0 | 11 | 9% | 19 |
| Lo_Ian.Gandalf_V4 4.0 | 9 | 8% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 7% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 6% | 15 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 1% | 4 |
| pa.Improved 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 80.0 | 93 / 210 | 2.80 | 18.2% | 36508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPK 0.2 | 1.0 | 18.2% | 93 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.0% | 22 |
| emp.Yngwie 1.11 | 2.8 | 13.1% | 55 |
| mld.DustBunny 3.8 | 3.7 | 12.5% | 9 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.5% | 14 |
| kawigi.robot.Girl 1.2 | 5.8 | 8.9% | 11 |
| Grystrion.TrackerWO 1.0 | 7.3 | 7.0% | 1 |
| lambdaxy.TBot 0.1 | 7.8 | 6.6% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.5% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 81.0 | 17 / 35 | 6303 |
| 2 | 1 | 67.2 | 79.4 | 16 / 35 | 5857 |
| 3 | 1 | 68.3 | 79.7 | 16 / 35 | 6464 |
| 4 | 1 | 67.4 | 78.4 | 14 / 35 | 6234 |
| 5 | 1 | 67.6 | 82.2 | 15 / 35 | 5784 |
| 6 | 1 | 67.2 | 79.4 | 15 / 35 | 5866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 43 | 56% |
| kawigi.micro.Shiz 1.1 | 25 | 100% |
| mld.DustBunny 3.8 | 23 | 91% |
| cb.nano.Insomnia 1.0 | 17 | 65% |
| kawigi.robot.Girl 1.2 | 13 | 62% |
| divineomega.TrialBot 0.003 | 6 | 33% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 41 | 35% | 79 |
| cb.nano.Insomnia 1.0 | 17 | 14% | 19 |
| mld.DustBunny 3.8 | 14 | 12% | 29 |
| kawigi.robot.Girl 1.2 | 12 | 10% | 22 |
| kawigi.micro.Shiz 1.1 | 10 | 8% | 29 |
| divineomega.TrialBot 0.003 | 10 | 8% | 17 |
| Grystrion.TrackerWO 1.0 | 7 | 6% | 9 |
| lambdaxy.TBot 0.1 | 5 | 4% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 69.8 | 28 / 210 | 3.71 | 15.2% | 31984 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.2 | 17.5% | 93 |
| hadur117.mini.DeiseWHPK 0.2 | 2.0 | 15.2% | 28 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.7% | 10 |
| techdude.forest.FlamingForest 1.1 | 3.8 | 12.8% | 59 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.6% | 10 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 9.2% | 1 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.4% | 5 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 5.1% | 4 |
| asd.Cthulhu 1.3 | 9.0 | 4.8% | 0 |
| repositorio.NanoStep 1.0 | 9.2 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 75.2 | 8 / 35 | 5865 |
| 2 | 2 | 63.1 | 69.5 | 5 / 35 | 4980 |
| 3 | 2 | 63.8 | 71.4 | 3 / 35 | 5425 |
| 4 | 2 | 63.5 | 69.2 | 5 / 35 | 5320 |
| 5 | 3 | 61.0 | 62.2 | 3 / 35 | 5061 |
| 6 | 2 | 63.9 | 71.4 | 4 / 35 | 5333 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 40 | 18% |
| techdude.forest.FlamingForest 1.1 | 21 | 19% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 14 | 93% |
| stelo.IntrinsicVolatility 1.4 | 4 | 50% |
| divineomega.DivineBot 1.9.4.5 | 2 | 50% |
| bvh.fnr.Fenrir 0.36l | 1 | 100% |
| tvv.nano.Polaris 1.2 | 1 | 0% |

Hadur died in 182 of 210 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 75 | 41% | 88 |
| techdude.forest.FlamingForest 1.1 | 43 | 24% | 48 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 19 | 10% | 23 |
| tvv.nano.Polaris 1.2 | 16 | 9% | 17 |
| bvh.fnr.Fenrir 0.36l | 13 | 7% | 15 |
| stelo.IntrinsicVolatility 1.4 | 9 | 5% | 11 |
| divineomega.DivineBot 1.9.4.5 | 4 | 2% | 6 |
| asd.Cthulhu 1.3 | 2 | 1% | 2 |
| repositorio.NanoStep 1.0 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 60.7 | 33 / 210 | 4.54 | 13.6% | 30985 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 2.0 | 14.0% | 43 |
| et.Predator 1.8 | 2.7 | 13.7% | 35 |
| hadur117.mini.DeiseWHPK 0.2 | 2.8 | 13.6% | 33 |
| cx.BlestPain 1.41 | 3.7 | 12.6% | 45 |
| ahf.NanoAndrew .4 | 4.5 | 11.8% | 34 |
| nic.Nicator 2.4 | 5.5 | 11.1% | 16 |
| maribo.melee.BMV 0.1 | 6.8 | 9.1% | 3 |
| tex.Longbot 0.4 | 8.3 | 5.9% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.5% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 58.5 | 58.1 | 2 / 35 | 4825 |
| 2 | 1 | 63.5 | 68.9 | 6 / 35 | 5870 |
| 3 | 3 | 60.3 | 60.6 | 7 / 35 | 4939 |
| 4 | 2 | 60.7 | 60.6 | 5 / 35 | 5249 |
| 5 | 3 | 59.0 | 53.7 | 8 / 35 | 4892 |
| 6 | 3 | 60.6 | 62.2 | 5 / 35 | 5210 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 16 | 69% |
| oog.melee.Mercutio 1.0 | 13 | 85% |
| nic.Nicator 2.4 | 11 | 64% |
| ahf.NanoAndrew .4 | 9 | 11% |
| cx.BlestPain 1.41 | 9 | 22% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 606. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 35 | 20% | 41 |
| cx.BlestPain 1.41 | 34 | 19% | 36 |
| et.Predator 1.8 | 32 | 18% | 46 |
| ahf.NanoAndrew .4 | 31 | 18% | 33 |
| maribo.melee.BMV 0.1 | 18 | 10% | 20 |
| nic.Nicator 2.4 | 18 | 10% | 20 |
| tex.Longbot 0.4 | 9 | 5% | 11 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 3 |

## Melee bench: F18

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 68.3 | 41 / 210 | 3.86 | 14.8% | 29887 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPK 0.2 | 1.5 | 14.8% | 41 |
| morbid.MorbidPriest 1.0 | 2.5 | 13.6% | 54 |
| agd.Mooserwirt2 2.7 | 2.8 | 12.6% | 41 |
| uji.DBH 1.1 | 3.3 | 12.1% | 33 |
| ratosh.Nobo 0.21 | 5.0 | 10.8% | 8 |
| spinnercat.Robovirus 2.718 | 5.8 | 9.6% | 11 |
| kawigi.mini.Fhqwhgads 1.1 | 7.5 | 7.2% | 5 |
| sigterm.Sigterm 1.0 | 7.5 | 7.5% | 12 |
| stelo.WangRobot 1.0 | 9.3 | 5.9% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 73.0 | 8 / 35 | 5481 |
| 2 | 2 | 59.6 | 60.6 | 4 / 35 | 4958 |
| 3 | 2 | 61.1 | 67.9 | 6 / 35 | 4640 |
| 4 | 2 | 60.9 | 66.0 | 4 / 35 | 5015 |
| 5 | 1 | 61.5 | 68.3 | 8 / 35 | 4771 |
| 6 | 1 | 63.8 | 73.7 | 11 / 35 | 5022 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 23 | 61% |
| agd.Mooserwirt2 2.7 | 16 | 19% |
| uji.DBH 1.1 | 14 | 21% |
| ratosh.Nobo 0.21 | 7 | 71% |
| sigterm.Sigterm 1.0 | 7 | 71% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 33% |
| stelo.WangRobot 1.0 | 5 | 60% |
| spinnercat.Robovirus 2.718 | 5 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.DBH 1.1 | 44 | 26% | 47 |
| morbid.MorbidPriest 1.0 | 37 | 22% | 49 |
| agd.Mooserwirt2 2.7 | 34 | 20% | 42 |
| ratosh.Nobo 0.21 | 17 | 10% | 21 |
| kawigi.mini.Fhqwhgads 1.1 | 11 | 6% | 13 |
| spinnercat.Robovirus 2.718 | 9 | 5% | 16 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9 | 5% | 9 |
| stelo.WangRobot 1.0 | 5 | 3% | 5 |
| sigterm.Sigterm 1.0 | 4 | 2% | 8 |

## Melee bench: F19

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 94.1 | 159 / 210 | 1.53 | 21.4% | 38505 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPK 0.2 | 1.0 | 21.4% | 159 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.0% | 16 |
| mld.Infinity 2.2 | 2.7 | 13.4% | 22 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 10.7% | 1 |
| erdnis.Rover 0.3 | 4.7 | 10.9% | 3 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.3% | 4 |
| pac.ABC 2.1 | 7.5 | 7.1% | 5 |
| mbh.Mbh 0.1 | 7.5 | 7.0% | 0 |
| pbg.R2D2 1.0 | 8.7 | 6.2% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 95.2 | 29 / 35 | 6532 |
| 2 | 1 | 73.1 | 98.1 | 30 / 35 | 6229 |
| 3 | 1 | 72.1 | 93.7 | 28 / 35 | 6148 |
| 4 | 1 | 70.9 | 87.3 | 21 / 35 | 6607 |
| 5 | 1 | 72.0 | 94.0 | 25 / 35 | 6157 |
| 6 | 1 | 73.0 | 96.2 | 26 / 35 | 6832 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 84 | 93% |
| mld.Infinity 2.2 | 44 | 70% |
| erdnis.Rover 0.3 | 15 | 80% |
| krillr.mini.JointStrike 2.0.0 | 14 | 100% |
| pac.ABC 2.1 | 10 | 90% |
| patson.PatsonTestBot 1.0 | 7 | 86% |
| pbg.R2D2 1.0 | 6 | 100% |
| mbh.Mbh 0.1 | 3 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 1202. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 16 | 31% | 44 |
| davidalves.net.DuelistMiniMelee 1.2 | 12 | 24% | 66 |
| erdnis.Rover 0.3 | 9 | 18% | 26 |
| patson.PatsonTestBot 1.0 | 8 | 16% | 25 |
| krillr.mini.JointStrike 2.0.0 | 3 | 6% | 19 |
| pac.ABC 2.1 | 2 | 4% | 15 |
| pbg.R2D2 1.0 | 1 | 2% | 9 |
| mbh.Mbh 0.1 | 0 | 0% | 5 |

## Melee bench: F20

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 80.8 | 66 / 210 | 2.73 | 18.0% | 37331 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPK 0.2 | 1.2 | 18.0% | 66 |
| trm.Wrekt 1.1.6.f | 1.8 | 17.2% | 89 |
| fwb.Nine 1.0.1 | 3.8 | 10.7% | 15 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 10.4% | 5 |
| catcat20.Rabbit 0.001 | 4.2 | 10.3% | 29 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 8.0% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.2 | 7.9% | 2 |
| bayen.nut.Squirrel 1.615 | 7.5 | 7.5% | 4 |
| ntc.ControlledChaos 1.1.4 | 8.7 | 5.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 79.4 | 12 / 35 | 5897 |
| 2 | 2 | 66.5 | 76.8 | 10 / 35 | 6259 |
| 3 | 1 | 68.0 | 81.9 | 12 / 35 | 6377 |
| 4 | 1 | 67.4 | 83.2 | 8 / 35 | 5938 |
| 5 | 1 | 68.3 | 82.5 | 11 / 35 | 6388 |
| 6 | 1 | 67.9 | 81.0 | 13 / 35 | 6472 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 75 | 41% |
| catcat20.Rabbit 0.001 | 25 | 32% |
| fwb.Nine 1.0.1 | 15 | 60% |
| nz.jdc.nano.GridFu 1.0 | 9 | 78% |
| bayen.nut.Squirrel 1.615 | 7 | 57% |
| m3thos.mini.Eva01 0.5.5 | 6 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 80 | 56% | 102 |
| catcat20.Rabbit 0.001 | 29 | 20% | 40 |
| fwb.Nine 1.0.1 | 15 | 10% | 15 |
| bayen.nut.Squirrel 1.615 | 7 | 5% | 18 |
| nz.jdc.nano.GridFu 1.0 | 7 | 5% | 17 |
| m3thos.mini.Eva01 0.5.5 | 3 | 2% | 10 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 5 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 1 |

## Melee bench: F21

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 87.3 | 89 / 210 | 2.14 | 19.6% | 39289 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPK 0.2 | 1.0 | 19.6% | 89 |
| eem.EvBot v4.6.16 | 2.0 | 17.0% | 91 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.5% | 8 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.0% | 8 |
| eld.Hmm 1.0 | 5.5 | 8.5% | 13 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.1% | 2 |
| fire219.CatBot 1.0 | 7.2 | 6.4% | 0 |
| el.JumpShoot 0.2 | 8.0 | 5.8% | 0 |
| PSW.Relentless 0.1 | 9.0 | 5.1% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 83.5 | 11 / 35 | 6278 |
| 2 | 1 | 71.5 | 90.8 | 16 / 35 | 6932 |
| 3 | 1 | 70.3 | 88.6 | 14 / 35 | 6712 |
| 4 | 1 | 70.4 | 90.8 | 17 / 35 | 6405 |
| 5 | 1 | 69.3 | 84.4 | 14 / 35 | 6553 |
| 6 | 1 | 69.8 | 85.7 | 17 / 35 | 6409 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 97 | 48% |
| dummy.mini.Scimitar 1.01 | 20 | 95% |
| cf.RiO.RiOx 4.2.1 | 20 | 90% |
| eld.Hmm 1.0 | 9 | 56% |
| oa.weak.BotherBot 0.1 | 1 | 0% |

Hadur died in 123 of 210 rounds, at a mean tick of 1134. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 78 | 63% | 117 |
| cf.RiO.RiOx 4.2.1 | 16 | 13% | 27 |
| dummy.mini.Scimitar 1.01 | 12 | 10% | 29 |
| eld.Hmm 1.0 | 7 | 6% | 23 |
| oa.weak.BotherBot 0.1 | 7 | 6% | 12 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 68.6 | 18 / 210 | 3.83 | 14.3% | 29817 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxDT 2.71m | 1.0 | 19.0% | 123 |
| kvk.HebusLeTroll 0.35 | 2.3 | 15.0% | 39 |
| hadur117.mini.DeiseWHPK 0.2 | 2.7 | 14.3% | 18 |
| jlm.javaDisturbance 0.59 | 4.3 | 12.6% | 19 |
| bigpete.Stewie 1.0 | 4.7 | 11.7% | 10 |
| yk.JahRoslav 1.1 | 6.5 | 6.7% | 0 |
| gg.Squaraus 0.6 | 7.0 | 6.5% | 0 |
| tad.Dalek98 0.98 | 7.7 | 6.3% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 5.1% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 73.0 | 6 / 35 | 5318 |
| 2 | 2 | 62.3 | 67.9 | 6 / 35 | 4812 |
| 3 | 3 | 61.8 | 66.7 | 2 / 35 | 4731 |
| 4 | 3 | 61.8 | 66.7 | 2 / 35 | 4889 |
| 5 | 3 | 61.8 | 66.7 | 2 / 35 | 4851 |
| 6 | 3 | 63.4 | 70.5 | 0 / 35 | 5216 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 31 | 13% |
| kvk.HebusLeTroll 0.35 | 17 | 59% |
| jlm.javaDisturbance 0.59 | 6 | 0% |
| bigpete.Stewie 1.0 | 4 | 50% |
| tad.Dalek98 0.98 | 2 | 100% |

Hadur died in 192 of 210 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 108 | 56% | 109 |
| kvk.HebusLeTroll 0.35 | 41 | 21% | 48 |
| jlm.javaDisturbance 0.59 | 19 | 10% | 24 |
| bigpete.Stewie 1.0 | 12 | 6% | 14 |
| tad.Dalek98 0.98 | 6 | 3% | 8 |
| yk.JahRoslav 1.1 | 4 | 2% | 5 |
| gg.Squaraus 0.6 | 2 | 1% | 2 |

## Melee bench: F23

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 82.2 | 58 / 210 | 2.60 | 17.4% | 32423 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.2 | 18.5% | 98 |
| hadur117.mini.DeiseWHPK 0.2 | 1.8 | 17.4% | 58 |
| cre.Karolos 0.32 | 3.0 | 13.7% | 37 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.4% | 7 |
| stelo.RamTrackSurfer 1.2 | 5.7 | 9.2% | 8 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.3 | 8.7% | 1 |
| cw.megas.Blade 0.8 | 6.5 | 8.4% | 0 |
| sample.Walls 1.0 | 7.5 | 8.1% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.0% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.6 | 83.8 | 13 / 35 | 5426 |
| 2 | 2 | 65.1 | 77.1 | 7 / 35 | 4626 |
| 3 | 1 | 68.9 | 86.0 | 11 / 35 | 5835 |
| 4 | 2 | 67.6 | 81.6 | 10 / 35 | 5288 |
| 5 | 2 | 68.4 | 84.4 | 11 / 35 | 5357 |
| 6 | 2 | 67.5 | 80.0 | 6 / 35 | 5891 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 72 | 28% |
| stelo.AreaTargetingBot 1.1 | 18 | 94% |
| cre.Karolos 0.32 | 16 | 31% |
| sample.Walls 1.0 | 12 | 92% |
| cw.megas.Blade 0.8 | 3 | 100% |
| stelo.RamTrackSurfer 1.2 | 3 | 0% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 90 | 59% | 115 |
| cre.Karolos 0.32 | 33 | 22% | 45 |
| stelo.AreaTargetingBot 1.1 | 10 | 7% | 19 |
| stelo.RamTrackSurfer 1.2 | 9 | 6% | 16 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 3% | 6 |
| sample.Walls 1.0 | 3 | 2% | 5 |
| cw.megas.Blade 0.8 | 3 | 2% | 4 |

## Melee bench: F24

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 61.3 | 23 / 210 | 4.48 | 12.7% | 24069 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.8 | 14.1% | 49 |
| florent.XSeries.X2 0.12 | 2.2 | 14.0% | 48 |
| davidalves.Phoenix 0.54 | 2.3 | 14.0% | 63 |
| hadur117.mini.DeiseWHPK 0.2 | 3.7 | 12.7% | 23 |
| oog.melee.Corsair 1.0 | 5.5 | 9.9% | 9 |
| pedersen.Ugluk 1.1.1 | 5.5 | 10.7% | 15 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 8.4% | 2 |
| lunchie.Lunchbox 0.93 | 7.8 | 7.0% | 1 |
| as.FrankTheTank 1.3 | 9.2 | 5.0% | 0 |
| evd.X1 0.01 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.2 | 60.3 | 3 / 35 | 4203 |
| 2 | 4 | 58.5 | 61.0 | 3 / 35 | 3982 |
| 3 | 4 | 56.4 | 56.5 | 2 / 35 | 3973 |
| 4 | 4 | 58.0 | 61.3 | 4 / 35 | 3965 |
| 5 | 2 | 61.1 | 69.5 | 8 / 35 | 4027 |
| 6 | 4 | 57.2 | 59.4 | 3 / 35 | 3919 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 15 | 60% |
| pedersen.Ugluk 1.1.1 | 12 | 33% |
| florent.XSeries.X2 0.12 | 10 | 20% |
| davidalves.Phoenix 0.54 | 9 | 22% |
| stelo.SoJNanoMelee 1.1 | 5 | 100% |
| oog.melee.Corsair 1.0 | 2 | 0% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 187 of 210 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 45 | 24% | 46 |
| davidalves.Phoenix 0.54 | 37 | 20% | 42 |
| rz.GlowBlowMelee 1.4 | 30 | 16% | 36 |
| oog.melee.Corsair 1.0 | 28 | 15% | 32 |
| pedersen.Ugluk 1.1.1 | 21 | 11% | 23 |
| lunchie.Lunchbox 0.93 | 9 | 5% | 11 |
| stelo.SoJNanoMelee 1.1 | 8 | 4% | 9 |
| evd.X1 0.01 | 6 | 3% | 7 |
| as.FrankTheTank 1.3 | 3 | 2% | 4 |

## Melee bench: F25

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 77.4 | 90 / 210 | 3.03 | 16.8% | 27632 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPK 0.2 | 1.0 | 16.8% | 90 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.4% | 30 |
| voidious.mini.BrokenSword 2.0.3 | 2.7 | 13.5% | 27 |
| jdw.Hurricane 1.4 | 4.2 | 11.5% | 18 |
| gre.svman4.Morfeas 1.4.1 | 4.8 | 10.4% | 25 |
| ds.Oo 2.2 | 6.2 | 8.9% | 11 |
| awesomeness.Elite 1.0 | 7.5 | 7.1% | 6 |
| gjr.Cephalosporin 0.1 | 7.8 | 7.1% | 5 |
| adt.Ar2 1.1 | 8.3 | 6.5% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 84.1 | 21 / 35 | 4709 |
| 2 | 1 | 68.1 | 83.5 | 17 / 35 | 5226 |
| 3 | 1 | 65.2 | 78.4 | 15 / 35 | 4463 |
| 4 | 1 | 63.2 | 71.7 | 13 / 35 | 4366 |
| 5 | 1 | 66.1 | 79.7 | 17 / 35 | 4540 |
| 6 | 1 | 61.5 | 67.0 | 7 / 35 | 4328 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 45 | 84% |
| voidious.micro.BlitzBat 1.05 | 31 | 77% |
| jdw.Hurricane 1.4 | 21 | 71% |
| gre.svman4.Morfeas 1.4.1 | 14 | 7% |
| ds.Oo 2.2 | 5 | 100% |
| gjr.Cephalosporin 0.1 | 5 | 80% |
| adt.Ar2 1.1 | 3 | 100% |
| awesomeness.Elite 1.0 | 1 | 0% |

Hadur died in 123 of 210 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 25 | 20% | 62 |
| voidious.micro.BlitzBat 1.05 | 25 | 20% | 40 |
| jdw.Hurricane 1.4 | 22 | 18% | 30 |
| gre.svman4.Morfeas 1.4.1 | 22 | 18% | 24 |
| awesomeness.Elite 1.0 | 12 | 10% | 14 |
| ds.Oo 2.2 | 7 | 6% | 16 |
| gjr.Cephalosporin 0.1 | 5 | 4% | 11 |
| adt.Ar2 1.1 | 2 | 2% | 6 |
| amk.ChumbaMini 0.2 | 1 | 1% | 4 |
2 death(s) with no robot to name.

## Melee bench: F26

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 74.5 | 40 / 210 | 3.30 | 16.0% | 35284 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.2 | 17.1% | 93 |
| hadur117.mini.DeiseWHPK 0.2 | 1.8 | 16.0% | 40 |
| shu.nitro.LENIN .T34 | 3.7 | 11.7% | 25 |
| lrem.Spectre 0.4.4 | 4.0 | 12.0% | 24 |
| js.PinBall 1.6 | 4.7 | 11.2% | 18 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.8% | 7 |
| gh.mini.GrubbmOne 1.0 | 6.7 | 9.6% | 3 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.7% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 75.2 | 7 / 35 | 6158 |
| 2 | 2 | 64.8 | 72.1 | 7 / 35 | 5763 |
| 3 | 2 | 64.4 | 72.7 | 7 / 35 | 5683 |
| 4 | 2 | 63.5 | 70.2 | 4 / 35 | 5477 |
| 5 | 1 | 67.1 | 80.0 | 6 / 35 | 6508 |
| 6 | 2 | 65.7 | 76.8 | 9 / 35 | 5695 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 25 | 16% |
| shu.nitro.LENIN .T34 | 21 | 67% |
| lrem.Spectre 0.4.4 | 17 | 65% |
| js.PinBall 1.6 | 15 | 47% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 33% |
| gh.mini.GrubbmOne 1.0 | 3 | 67% |

Hadur died in 171 of 210 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 77 | 45% | 81 |
| js.PinBall 1.6 | 27 | 16% | 32 |
| shu.nitro.LENIN .T34 | 18 | 11% | 33 |
| lrem.Spectre 0.4.4 | 15 | 9% | 25 |
| jaybot.adv.bots.JayBot 2.0 | 15 | 9% | 17 |
| gh.mini.GrubbmOne 1.0 | 10 | 6% | 12 |
| fullsail.LaxativeTeaTwo 1.0 | 9 | 5% | 9 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |

## Melee bench: F27

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 75.0 | 59 / 210 | 3.25 | 16.6% | 33018 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPK 0.2 | 1.3 | 16.6% | 59 |
| mk.Alpha 0.2.1 | 1.7 | 16.7% | 97 |
| wee.Gem 1.8.4 | 3.5 | 11.3% | 29 |
| EH.Eagle 1.0.6 | 3.8 | 11.1% | 7 |
| sheldor.melee.nano.TestMelee 0.1 | 5.3 | 9.9% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 6.2 | 9.1% | 3 |
| joe.ADinosaur 1.0 | 7.5 | 7.7% | 2 |
| throxbot.ThroxBot 0.1 | 7.5 | 7.6% | 3 |
| caimano.Furia_Ceca 0.22 | 8.7 | 5.9% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 77.8 | 12 / 35 | 4981 |
| 2 | 1 | 66.5 | 68.9 | 12 / 35 | 6453 |
| 3 | 1 | 68.1 | 78.4 | 10 / 35 | 6362 |
| 4 | 2 | 65.2 | 79.4 | 5 / 35 | 5288 |
| 5 | 2 | 61.8 | 66.7 | 8 / 35 | 4816 |
| 6 | 1 | 65.8 | 79.0 | 12 / 35 | 5118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 54 | 26% |
| EH.Eagle 1.0.6 | 14 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 75% |
| wee.Gem 1.8.4 | 10 | 60% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 100% |
| throxbot.ThroxBot 0.1 | 6 | 100% |
| joe.ADinosaur 1.0 | 4 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 80 | 52% | 101 |
| EH.Eagle 1.0.6 | 18 | 12% | 30 |
| wee.Gem 1.8.4 | 18 | 12% | 27 |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 7% | 17 |
| joe.ADinosaur 1.0 | 8 | 5% | 11 |
| throxbot.ThroxBot 0.1 | 6 | 4% | 7 |
| techdude.kombat.FlamingKombat 1.5 | 5 | 3% | 10 |
| cs.Grudge 1.0 | 5 | 3% | 5 |
| caimano.Furia_Ceca 0.22 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 80.9 | 72 / 210 | 2.72 | 16.9% | 28723 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPK 0.2 | 1.0 | 16.9% | 72 |
| kid.test.NightFox .2 | 2.2 | 14.4% | 34 |
| uji.Antique 1.0 | 2.8 | 12.9% | 60 |
| pfvicm.Sobieski 7.2.3b | 4.2 | 11.3% | 11 |
| qohnil.blot.BlotBot 3.61 | 4.8 | 10.2% | 17 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.4% | 5 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.5% | 8 |
| matt.advanced.Katana 1.0 | 8.2 | 6.6% | 3 |
| stelo.Lifestealer 1.0 | 9.3 | 5.5% | 0 |
| stelo.PianistNano 1.2 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 81.0 | 14 / 35 | 5184 |
| 2 | 1 | 65.6 | 80.3 | 15 / 35 | 4471 |
| 3 | 1 | 66.5 | 85.1 | 14 / 35 | 4641 |
| 4 | 1 | 67.5 | 87.0 | 15 / 35 | 4957 |
| 5 | 1 | 63.4 | 74.3 | 8 / 35 | 4734 |
| 6 | 1 | 63.9 | 77.8 | 6 / 35 | 4736 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 45 | 82% |
| uji.Antique 1.0 | 39 | 18% |
| qohnil.blot.BlotBot 3.61 | 12 | 58% |
| pfvicm.Sobieski 7.2.3b | 9 | 67% |
| amk.ChumbaWumba 0.3 | 8 | 88% |
| ahr.ice.Ice 1.0.2 | 7 | 71% |
| matt.advanced.Katana 1.0 | 4 | 50% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 61 | 44% | 76 |
| kid.test.NightFox .2 | 22 | 16% | 35 |
| pfvicm.Sobieski 7.2.3b | 18 | 13% | 27 |
| qohnil.blot.BlotBot 3.61 | 13 | 9% | 25 |
| amk.ChumbaWumba 0.3 | 10 | 7% | 14 |
| ahr.ice.Ice 1.0.2 | 9 | 6% | 20 |
| matt.advanced.Katana 1.0 | 3 | 2% | 4 |
| stelo.PianistNano 1.2 | 2 | 1% | 5 |
| stelo.Lifestealer 1.0 | 1 | 1% | 3 |

## Melee bench: F29

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 72.7 | 32 / 210 | 3.46 | 15.9% | 31748 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.5 | 16.9% | 83 |
| hadur117.mini.DeiseWHPK 0.2 | 2.2 | 15.9% | 32 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 16.0% | 80 |
| myl.micro.Troodon 1.10 | 4.2 | 11.0% | 4 |
| jok.PheonixM 0.1.2 | 5.0 | 10.3% | 7 |
| ph.melee.ArcherME 0.3 | 5.8 | 8.5% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.3 | 6.0% | 0 |
| DBall.Anarchy 0.1 | 8.3 | 5.7% | 3 |
| ap.Frederick 1.1 | 8.7 | 5.3% | 1 |
| jangs.ns51 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 73.0 | 3 / 35 | 5452 |
| 2 | 2 | 66.7 | 81.0 | 6 / 35 | 5181 |
| 3 | 2 | 65.7 | 75.6 | 6 / 35 | 5479 |
| 4 | 2 | 65.3 | 72.4 | 6 / 35 | 5698 |
| 5 | 2 | 64.4 | 68.6 | 9 / 35 | 5312 |
| 6 | 3 | 61.6 | 65.7 | 2 / 35 | 4626 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 50 | 14% |
| zyx.mega.YersiniaPestis 3.1 | 23 | 22% |
| myl.micro.Troodon 1.10 | 8 | 100% |
| jok.PheonixM 0.1.2 | 5 | 100% |
| ap.Frederick 1.1 | 2 | 50% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 90 | 50% | 102 |
| zyx.mega.YersiniaPestis 3.1 | 57 | 32% | 66 |
| jok.PheonixM 0.1.2 | 13 | 7% | 15 |
| myl.micro.Troodon 1.10 | 10 | 6% | 15 |
| fullsail.TimbotNoPrediction 1.0 | 4 | 2% | 5 |
| ph.melee.ArcherME 0.3 | 3 | 2% | 3 |
| DBall.Anarchy 0.1 | 1 | 1% | 4 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F30

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 51.5 | 45.9 | 3 / 210 | 5.87 | 9.8% | 21854 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.3 | 13.7% | 50 |
| oog.melee.Capulet 1.2 | 2.5 | 13.8% | 38 |
| darkcanuck.B26354 1.06 | 2.5 | 13.7% | 53 |
| stelo.PastFuture 2.3.2 | 2.7 | 13.5% | 44 |
| hadur117.mini.DeiseWHPK 0.2 | 5.5 | 9.8% | 3 |
| intruder.PrairieWolf 2.61 | 5.8 | 9.4% | 8 |
| fowl3628800.LightningBolt 2.6.0 | 7.5 | 8.0% | 9 |
| tripphippy.Alice 1.1 | 7.8 | 7.9% | 5 |
| ntc.Opposite 1.5 | 8.3 | 7.4% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.1 | 46.7 | 0 / 35 | 3868 |
| 2 | 7 | 49.2 | 41.6 | 0 / 35 | 3460 |
| 3 | 5 | 52.2 | 45.7 | 0 / 35 | 3944 |
| 4 | 6 | 49.4 | 43.2 | 1 / 35 | 3098 |
| 5 | 5 | 53.9 | 50.8 | 2 / 35 | 3771 |
| 6 | 5 | 52.3 | 47.6 | 0 / 35 | 3713 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 5 | 20% |
| stelo.PastFuture 2.3.2 | 3 | 33% |
| oog.melee.Capulet 1.2 | 2 | 0% |
| tripphippy.Alice 1.1 | 1 | 0% |
| intruder.PrairieWolf 2.61 | 1 | 100% |

Hadur died in 207 of 210 rounds, at a mean tick of 488. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 41 | 20% | 43 |
| oog.melee.Capulet 1.2 | 37 | 18% | 37 |
| darkcanuck.B26354 1.06 | 33 | 16% | 34 |
| catcat20.Matcha 0.006 | 31 | 15% | 32 |
| tripphippy.Alice 1.1 | 27 | 13% | 27 |
| intruder.PrairieWolf 2.61 | 14 | 7% | 14 |
| ntc.Opposite 1.5 | 13 | 6% | 13 |
| fowl3628800.LightningBolt 2.6.0 | 11 | 5% | 10 |

## Melee bench: F31

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.7 | 55.0 | 15 / 210 | 5.05 | 11.4% | 21758 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.8% | 136 |
| gh.mini.Griezel 0.2 | 2.0 | 14.0% | 35 |
| spinnercat.micro.Tyger 0.1 | 3.8 | 11.4% | 9 |
| d414.nano.Quantum 1.0.0 | 4.0 | 11.3% | 6 |
| hadur117.mini.DeiseWHPK 0.2 | 4.2 | 11.4% | 15 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.2% | 6 |
| timmit.nano.TimDog 0.33 | 7.7 | 6.8% | 2 |
| fm.mammillarias 1.3 | 8.0 | 6.4% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.7 | 5.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.7 | 49.5 | 3 / 35 | 3604 |
| 2 | 5 | 54.1 | 51.1 | 0 / 35 | 3498 |
| 3 | 5 | 54.2 | 54.0 | 1 / 35 | 3303 |
| 4 | 3 | 56.9 | 59.0 | 2 / 35 | 3662 |
| 5 | 3 | 58.8 | 61.0 | 6 / 35 | 3819 |
| 6 | 4 | 56.6 | 55.2 | 3 / 35 | 3872 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 9 | 11% |
| spinnercat.micro.Tyger 0.1 | 8 | 75% |
| d414.nano.Quantum 1.0.0 | 7 | 100% |
| gh.mini.Griezel 0.2 | 3 | 0% |
| gh.nano.Grofvuil 0.2 | 1 | 0% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 195 of 210 rounds, at a mean tick of 504. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 66 | 34% | 67 |
| gh.mini.Griezel 0.2 | 56 | 29% | 57 |
| d414.nano.Quantum 1.0.0 | 26 | 13% | 30 |
| spinnercat.micro.Tyger 0.1 | 19 | 10% | 27 |
| gh.nano.Grofvuil 0.2 | 12 | 6% | 13 |
| Gecko.ultimateGeckoBot 1.0 | 9 | 5% | 9 |
| tlp.ThreeLeggedPig 1 | 3 | 2% | 3 |
| timmit.nano.TimDog 0.33 | 3 | 2% | 3 |
| fm.mammillarias 1.3 | 1 | 1% | 1 |

## Melee bench: F32

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 72.5 | 47 / 210 | 3.48 | 15.1% | 28384 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.0 | 16.0% | 86 |
| hadur117.mini.DeiseWHPK 0.2 | 2.0 | 15.1% | 47 |
| apc.botM 3.0 | 3.2 | 12.4% | 37 |
| vjik.UnViolation 1.1 | 4.3 | 10.5% | 16 |
| lxx.ConceptA 0.8 | 5.2 | 10.1% | 4 |
| bayen.UbaMicro 1.4 | 5.3 | 9.8% | 10 |
| panzer.Panzer 0.2 | 7.7 | 7.6% | 0 |
| yk.JahMicro 1.0 | 7.8 | 7.3% | 7 |
| conscience.Electron 1.3g | 8.8 | 6.2% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 5.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 64.8 | 8 / 35 | 4719 |
| 2 | 2 | 62.7 | 73.7 | 7 / 35 | 4729 |
| 3 | 2 | 63.1 | 73.7 | 9 / 35 | 4773 |
| 4 | 2 | 61.4 | 70.2 | 6 / 35 | 4391 |
| 5 | 2 | 63.7 | 76.5 | 6 / 35 | 4955 |
| 6 | 2 | 64.1 | 76.2 | 11 / 35 | 4817 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 56 | 25% |
| vjik.UnViolation 1.1 | 16 | 69% |
| apc.botM 3.0 | 12 | 17% |
| lxx.ConceptA 0.8 | 10 | 90% |
| bayen.UbaMicro 1.4 | 6 | 50% |
| donjezza.Jezza 1.0 | 4 | 75% |
| panzer.Panzer 0.2 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 58 | 35% | 75 |
| apc.botM 3.0 | 40 | 24% | 48 |
| lxx.ConceptA 0.8 | 20 | 12% | 21 |
| bayen.UbaMicro 1.4 | 17 | 10% | 20 |
| vjik.UnViolation 1.1 | 16 | 10% | 28 |
| panzer.Panzer 0.2 | 5 | 3% | 5 |
| conscience.Electron 1.3g | 4 | 2% | 7 |
| yk.JahMicro 1.0 | 3 | 2% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 1 |

## Melee bench: F33

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 67.4 | 36 / 210 | 3.94 | 14.6% | 28926 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.3 | 15.9% | 63 |
| hadur117.mini.DeiseWHPK 0.2 | 1.7 | 14.6% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.3% | 25 |
| labg.Cataclysm 2.05 | 3.8 | 12.3% | 33 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 11.7% | 29 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 9.6% | 18 |
| baal.nano.N 1.42 | 6.5 | 9.3% | 4 |
| zyx.micro.Ant 1.1 | 8.2 | 5.6% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.3 | 4.4% | 1 |
| sanja.First 0.1 | 9.5 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.3 | 67.3 | 5 / 35 | 5102 |
| 2 | 2 | 62.6 | 66.0 | 6 / 35 | 5196 |
| 3 | 2 | 63.1 | 71.1 | 9 / 35 | 4597 |
| 4 | 2 | 62.5 | 68.9 | 4 / 35 | 4683 |
| 5 | 2 | 60.6 | 63.5 | 4 / 35 | 4504 |
| 6 | 1 | 62.1 | 67.3 | 8 / 35 | 4844 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 24 | 38% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 50% |
| gre.svman4.Leonidas 1.3.2 | 14 | 36% |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 44% |
| baal.nano.N 1.42 | 6 | 100% |
| labg.Cataclysm 2.05 | 5 | 20% |
| zyx.micro.Ant 1.1 | 3 | 100% |

Hadur died in 174 of 210 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 45 | 26% | 58 |
| labg.Cataclysm 2.05 | 40 | 23% | 45 |
| gre.svman4.Leonidas 1.3.2 | 34 | 20% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 11% | 25 |
| kinsen.melee.Angsaichmophobia 1.8c | 20 | 11% | 22 |
| baal.nano.N 1.42 | 10 | 6% | 15 |
| zyx.micro.Ant 1.1 | 3 | 2% | 3 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |
| sanja.First 0.1 | 1 | 1% | 1 |

## Melee bench: F34

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 66.2 | 8 / 210 | 4.04 | 13.7% | 28889 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.3 | 17.7% | 105 |
| kid.Gladiator .7.2 | 1.7 | 16.9% | 65 |
| hadur117.mini.DeiseWHPK 0.2 | 3.2 | 13.7% | 8 |
| tcf.Reach 3 | 4.0 | 11.9% | 16 |
| jcs.Seth 1.8 | 5.3 | 10.7% | 11 |
| cli.Dancer 1.1 | 5.5 | 10.5% | 3 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 1 |
| amk.Punbot.Punbot 0.01 | 8.2 | 4.8% | 1 |
| sample.VelociRobot 1.0 | 9.2 | 3.4% | 0 |
| sample.RamFire 1.0 | 9.7 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.5 | 68.9 | 2 / 35 | 4875 |
| 2 | 4 | 60.5 | 63.5 | 1 / 35 | 4516 |
| 3 | 3 | 63.3 | 70.5 | 2 / 35 | 5040 |
| 4 | 3 | 63.4 | 69.2 | 3 / 35 | 5170 |
| 5 | 3 | 60.0 | 63.8 | 0 / 35 | 4614 |
| 6 | 3 | 60.5 | 61.6 | 0 / 35 | 4674 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 26 | 12% |
| kid.Gladiator .7.2 | 12 | 17% |
| tcf.Reach 3 | 9 | 11% |
| cli.Dancer 1.1 | 1 | 0% |
| ratosh.Wesco 1.4 | 1 | 100% |
| jcs.Seth 1.8 | 1 | 100% |

Hadur died in 202 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 63 | 31% | 67 |
| kid.Gladiator .7.2 | 53 | 26% | 56 |
| tcf.Reach 3 | 46 | 23% | 47 |
| cli.Dancer 1.1 | 22 | 11% | 21 |
| jcs.Seth 1.8 | 13 | 6% | 14 |
| ratosh.Wesco 1.4 | 4 | 2% | 4 |
| amk.Punbot.Punbot 0.01 | 1 | 0% | 1 |

## Melee bench: F35

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 62.2 | 5 / 210 | 4.40 | 12.2% | 22622 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 171 |
| gh.mini.Gruwel 0.9 | 2.5 | 13.5% | 19 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.0 | 12.7% | 12 |
| hadur117.mini.DeiseWHPK 0.2 | 3.8 | 12.2% | 5 |
| rz.HawkOnFire 0.1 | 4.7 | 11.5% | 3 |
| wit.Chuliath 1.0 | 6.3 | 7.4% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.2 | 6.5% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.6% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.0 | 61.6 | 2 / 35 | 3575 |
| 2 | 4 | 57.9 | 61.3 | 0 / 35 | 3893 |
| 3 | 4 | 58.1 | 60.6 | 3 / 35 | 3724 |
| 4 | 3 | 58.1 | 61.9 | 0 / 35 | 3730 |
| 5 | 5 | 58.7 | 63.2 | 0 / 35 | 3910 |
| 6 | 3 | 58.6 | 64.8 | 0 / 35 | 3790 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 21 | 0% |
| gh.mini.Gruwel 0.9 | 4 | 0% |
| dmh.robocode.robot.BlackDeath 9.2 | 3 | 67% |
| rz.HawkOnFire 0.1 | 2 | 100% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 205 of 210 rounds, at a mean tick of 522. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 73 | 36% | 74 |
| gh.mini.Gruwel 0.9 | 52 | 25% | 52 |
| dmh.robocode.robot.BlackDeath 9.2 | 37 | 18% | 39 |
| wit.Chuliath 1.0 | 15 | 7% | 16 |
| rz.HawkOnFire 0.1 | 13 | 6% | 14 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 11 | 5% | 11 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 2 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |

## Melee bench: F36

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 81.9 | 104 / 210 | 2.63 | 18.6% | 35137 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPK 0.2 | 1.0 | 18.6% | 104 |
| alpha.RainingFire 1.0 | 2.5 | 12.3% | 28 |
| bzdp.Pansy 2.1 | 3.7 | 11.5% | 21 |
| mz.Cork 0.1 | 3.8 | 11.5% | 18 |
| bvh.micro.Freya 0.3 | 4.3 | 10.8% | 16 |
| m3thos.Eva02 0.7.1 | 6.0 | 10.0% | 14 |
| bvh.mini.Fenrir 0.39 | 6.7 | 8.6% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 6.6% | 2 |
| dl.BetterWalls 1.0 | 8.7 | 6.3% | 3 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 84.8 | 17 / 35 | 6016 |
| 2 | 1 | 67.3 | 78.1 | 16 / 35 | 5955 |
| 3 | 1 | 67.9 | 80.6 | 17 / 35 | 5818 |
| 4 | 1 | 66.1 | 77.5 | 16 / 35 | 5261 |
| 5 | 1 | 68.1 | 82.2 | 17 / 35 | 5901 |
| 6 | 1 | 69.8 | 87.9 | 21 / 35 | 6186 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 34 | 88% |
| bvh.micro.Freya 0.3 | 26 | 77% |
| alpha.RainingFire 1.0 | 22 | 64% |
| m3thos.Eva02 0.7.1 | 17 | 71% |
| mz.Cork 0.1 | 14 | 79% |
| bvh.mini.Fenrir 0.39 | 12 | 92% |
| sample.MyFirstRobot 1.0 | 4 | 100% |
| dl.BetterWalls 1.0 | 3 | 67% |

Hadur died in 107 of 210 rounds, at a mean tick of 687. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 27 | 25% | 45 |
| bvh.micro.Freya 0.3 | 20 | 19% | 37 |
| mz.Cork 0.1 | 14 | 13% | 36 |
| bzdp.Pansy 2.1 | 11 | 10% | 30 |
| m3thos.Eva02 0.7.1 | 10 | 9% | 25 |
| squidM.TentalceMeleeNano 1.1 | 9 | 8% | 10 |
| dl.BetterWalls 1.0 | 8 | 7% | 14 |
| bvh.mini.Fenrir 0.39 | 7 | 7% | 10 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 83.1 | 129 / 210 | 2.52 | 18.2% | 34206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPK 0.2 | 1.0 | 18.2% | 129 |
| agrach.Dalek 1.0 | 3.0 | 10.8% | 30 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.3 | 10.3% | 4 |
| germ.TheMind .2 | 3.5 | 10.2% | 12 |
| stelo.UntouchableNano 1.3 | 5.5 | 9.3% | 14 |
| EBBU.Sim2 1.02 | 5.7 | 9.2% | 6 |
| mb.Beast 0.1 | 7.8 | 8.3% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 8.1% | 1 |
| skm.Ryubot 1.0 | 8.2 | 8.0% | 2 |
| lmk.ACPFinal 0.1 | 9.0 | 7.5% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 89.8 | 26 / 35 | 6119 |
| 2 | 1 | 65.9 | 81.3 | 18 / 35 | 5745 |
| 3 | 1 | 65.6 | 83.2 | 20 / 35 | 5044 |
| 4 | 1 | 67.7 | 85.4 | 24 / 35 | 5662 |
| 5 | 1 | 69.0 | 87.6 | 25 / 35 | 6287 |
| 6 | 1 | 62.9 | 71.4 | 16 / 35 | 5349 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 32 | 56% |
| germ.TheMind .2 | 20 | 100% |
| EBBU.Sim2 1.02 | 19 | 84% |
| com.syncleus.robocode.Dreadnaught 0.1 | 19 | 100% |
| mb.Beast 0.1 | 16 | 94% |
| skm.Ryubot 1.0 | 15 | 100% |
| stelo.UntouchableNano 1.3 | 14 | 71% |
| lmk.ACPFinal 0.1 | 11 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 483. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 25 | 30% | 50 |
| stelo.UntouchableNano 1.3 | 16 | 19% | 22 |
| EBBU.Sim2 1.02 | 11 | 13% | 27 |
| mb.Beast 0.1 | 8 | 10% | 26 |
| lmk.ACPFinal 0.1 | 8 | 10% | 19 |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 6% | 13 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4 | 5% | 30 |
| germ.TheMind .2 | 4 | 5% | 16 |
| skm.Ryubot 1.0 | 2 | 2% | 4 |

## Melee bench: F38

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.7 | 59.0 | 15 / 210 | 4.69 | 12.1% | 23862 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.9% | 111 |
| bvh.mini.Freya 0.55 | 2.8 | 12.7% | 15 |
| bts.mega.Gnarly 1.4 | 3.3 | 12.5% | 35 |
| hadur117.mini.DeiseWHPK 0.2 | 3.5 | 12.1% | 15 |
| cs.Wren 1.0 | 4.5 | 11.3% | 13 |
| kdf.KoulDestroyer 1.0 | 6.2 | 9.8% | 12 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.7 | 9.9% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.5 | 5.5% | 1 |
| matt.UnderDark3 2.4.34 | 8.7 | 4.3% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.1 | 62.2 | 4 / 35 | 3984 |
| 2 | 3 | 57.6 | 59.4 | 4 / 35 | 3888 |
| 3 | 2 | 59.8 | 63.5 | 1 / 35 | 4440 |
| 4 | 5 | 55.2 | 53.0 | 3 / 35 | 3534 |
| 5 | 4 | 57.4 | 58.1 | 1 / 35 | 3963 |
| 6 | 4 | 57.5 | 57.8 | 2 / 35 | 4053 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 16 | 19% |
| bts.mega.Gnarly 1.4 | 9 | 22% |
| davidalves.net.DuelistNanoMelee 1.01 | 6 | 67% |
| cs.Wren 1.0 | 5 | 60% |
| bvh.mini.Freya 0.55 | 3 | 100% |
| kdf.KoulDestroyer 1.0 | 2 | 0% |

Hadur died in 195 of 210 rounds, at a mean tick of 536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 72 | 37% | 77 |
| bts.mega.Gnarly 1.4 | 40 | 21% | 43 |
| kdf.KoulDestroyer 1.0 | 36 | 18% | 36 |
| bvh.mini.Freya 0.55 | 20 | 10% | 24 |
| cs.Wren 1.0 | 17 | 9% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 3% | 6 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 2 |
| bzdp.BoxCar 2.0 | 2 | 1% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 1 |

## Melee bench: F39

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 66.8 | 39 / 210 | 3.99 | 14.1% | 28188 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.2 | 15.2% | 34 |
| hadur117.mini.DeiseWHPK 0.2 | 2.3 | 14.1% | 39 |
| az.Ololobot 0.2.4 | 3.0 | 13.3% | 65 |
| catcat20.Lambda 0.024 | 3.7 | 12.5% | 43 |
| apollokidd.ApolloKidd 0.9 | 6.0 | 8.5% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 6.2 | 9.1% | 17 |
| winamp32.micro.MicroMacro 1.0 | 6.5 | 8.4% | 8 |
| gimp.GimpBot 0.1 | 7.2 | 8.0% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.8% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.9 | 65.7 | 9 / 35 | 4709 |
| 2 | 2 | 60.5 | 66.0 | 6 / 35 | 4678 |
| 3 | 2 | 60.9 | 67.6 | 7 / 35 | 4778 |
| 4 | 2 | 60.8 | 65.4 | 7 / 35 | 4607 |
| 5 | 4 | 59.5 | 64.8 | 4 / 35 | 4395 |
| 6 | 1 | 62.6 | 71.4 | 6 / 35 | 5021 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 21 | 67% |
| az.Ololobot 0.2.4 | 14 | 14% |
| catcat20.Lambda 0.024 | 12 | 58% |
| stelo.SoRobotNanoMelee 1.2 | 10 | 100% |
| winamp32.micro.MicroMacro 1.0 | 6 | 83% |
| gimp.GimpBot 0.1 | 2 | 50% |

Hadur died in 173 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Lambda 0.024 | 46 | 27% | 55 |
| bvh.fry.Freya 0.82 | 39 | 23% | 52 |
| az.Ololobot 0.2.4 | 30 | 17% | 33 |
| gimp.GimpBot 0.1 | 20 | 12% | 22 |
| winamp32.micro.MicroMacro 1.0 | 12 | 7% | 16 |
| apollokidd.ApolloKidd 0.9 | 11 | 6% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 7 | 4% | 11 |
| whitesquare.robots.SkynetAdvanced 1.1 | 4 | 2% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F40

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 72.9 | 64 / 210 | 3.44 | 16.3% | 32437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPK 0.2 | 1.3 | 16.3% | 64 |
| kawigi.mini.Coriantumr 1.1 | 1.7 | 15.8% | 69 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.6% | 30 |
| mz.AntiGrav 1.0 | 5.2 | 10.1% | 10 |
| Polkwane.SmashMelee 1.0 | 5.2 | 10.1% | 9 |
| stelo.Randomness 1.0 | 5.7 | 9.5% | 18 |
| alpha.BlackIce 1.0 | 6.0 | 9.1% | 8 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.7% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.5% | 1 |
| sample.Corners 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 74.9 | 11 / 35 | 5446 |
| 2 | 1 | 64.2 | 73.0 | 8 / 35 | 5343 |
| 3 | 1 | 65.2 | 72.7 | 15 / 35 | 5185 |
| 4 | 1 | 67.2 | 79.4 | 11 / 35 | 5930 |
| 5 | 2 | 63.5 | 70.2 | 10 / 35 | 5058 |
| 6 | 2 | 63.2 | 67.3 | 9 / 35 | 5475 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 43 | 47% |
| kano.gamma.KanoGamma 1.8 | 22 | 77% |
| mz.AntiGrav 1.0 | 14 | 100% |
| stelo.Randomness 1.0 | 7 | 29% |
| Polkwane.SmashMelee 1.0 | 7 | 71% |
| alpha.BlackIce 1.0 | 5 | 80% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 67 | 46% | 77 |
| kano.gamma.KanoGamma 1.8 | 26 | 18% | 50 |
| stelo.Randomness 1.0 | 14 | 10% | 20 |
| mz.AntiGrav 1.0 | 11 | 8% | 17 |
| alpha.BlackIce 1.0 | 10 | 7% | 14 |
| Polkwane.SmashMelee 1.0 | 9 | 6% | 17 |
| amk.superstrike.SuperStrike 0.3 | 6 | 4% | 9 |
| testantiswapgun.AntiSwap 1.0 | 2 | 1% | 3 |
| sample.Corners 1.0 | 1 | 1% | 3 |

## Melee bench: F41

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 64.3 | 11 / 210 | 4.21 | 13.3% | 26820 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 17.8% | 122 |
| hadur117.mini.DeiseWHPK 0.2 | 2.7 | 13.3% | 11 |
| lessonz.robocode.Oz 0.5.0 | 3.3 | 12.9% | 31 |
| ary.Swarm 1.1 | 3.5 | 12.8% | 17 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 11.5% | 18 |
| shrub.Silver v048 | 6.0 | 9.6% | 6 |
| zyx.nano.Ant 1.1 | 7.0 | 7.8% | 0 |
| stelo.Mirror 1.1 | 8.3 | 6.2% | 4 |
| jsal.Jsalbot 1.0 | 8.7 | 5.7% | 2 |
| acogdev.alpha 0.2 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.3 | 63.8 | 1 / 35 | 4641 |
| 2 | 2 | 62.3 | 67.9 | 4 / 35 | 4659 |
| 3 | 2 | 62.1 | 68.9 | 1 / 35 | 4735 |
| 4 | 4 | 54.9 | 52.1 | 0 / 35 | 3939 |
| 5 | 3 | 60.4 | 65.4 | 3 / 35 | 4369 |
| 6 | 2 | 61.3 | 67.9 | 2 / 35 | 4477 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 20 | 5% |
| lessonz.robocode.Oz 0.5.0 | 8 | 25% |
| simonton.nano.MeleeSeed 1.8 | 4 | 75% |
| ary.Swarm 1.1 | 4 | 75% |
| stelo.Mirror 1.1 | 3 | 0% |
| shrub.Silver v048 | 2 | 50% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 201 of 210 rounds, at a mean tick of 618. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 97 | 48% | 100 |
| lessonz.robocode.Oz 0.5.0 | 38 | 19% | 40 |
| ary.Swarm 1.1 | 35 | 17% | 38 |
| shrub.Silver v048 | 15 | 7% | 15 |
| simonton.nano.MeleeSeed 1.8 | 8 | 4% | 8 |
| stelo.Mirror 1.1 | 4 | 2% | 4 |
| zyx.nano.Ant 1.1 | 3 | 1% | 3 |
| jsal.Jsalbot 1.0 | 1 | 0% | 2 |

## Melee bench: F42

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 64.7 | 13 / 210 | 4.18 | 13.7% | 30039 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.8% | 118 |
| maribo.mini.MiniQuester 0.1 | 2.8 | 13.8% | 22 |
| hadur117.mini.DeiseWHPK 0.2 | 2.8 | 13.7% | 13 |
| ara.Shera 0.88 | 3.3 | 13.5% | 45 |
| amz.NanoClone 1.41 | 5.2 | 9.0% | 3 |
| dsw.StaticD 1.0 | 6.0 | 7.9% | 8 |
| maribo.IotaCT 1.1 | 6.8 | 7.1% | 1 |
| stelo.MirrorMicro 1.0 | 8.3 | 6.4% | 0 |
| mme.NikeEnhanced 2.0 | 9.2 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.8 | 61.9 | 3 / 35 | 4782 |
| 2 | 2 | 63.4 | 69.8 | 4 / 35 | 5728 |
| 3 | 3 | 59.9 | 64.1 | 1 / 35 | 4767 |
| 4 | 2 | 61.8 | 67.9 | 2 / 35 | 5148 |
| 5 | 4 | 58.3 | 61.0 | 0 / 35 | 4570 |
| 6 | 3 | 60.3 | 63.5 | 3 / 35 | 5044 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 27 | 26% |
| ara.Shera 0.88 | 12 | 8% |
| maribo.mini.MiniQuester 0.1 | 12 | 8% |
| dsw.StaticD 1.0 | 3 | 33% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 197 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 59 | 30% | 67 |
| ara.Shera 0.88 | 54 | 27% | 56 |
| maribo.mini.MiniQuester 0.1 | 45 | 23% | 46 |
| amz.NanoClone 1.41 | 14 | 7% | 14 |
| dsw.StaticD 1.0 | 12 | 6% | 13 |
| stelo.MirrorMicro 1.0 | 6 | 3% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 5 | 3% | 6 |
| maribo.IotaCT 1.1 | 2 | 1% | 3 |

## Melee bench: F43

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.0 | 54.1 | 3 / 210 | 5.13 | 11.0% | 22021 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.2% | 176 |
| brainfade.melee.Dusk 0.44 | 2.0 | 13.0% | 19 |
| wcsv.melee.EngineerMelee 0.1 | 3.2 | 11.7% | 3 |
| hadur117.mini.DeiseWHPK 0.2 | 4.5 | 11.0% | 3 |
| dummy.micro.Sparrow 2.5 | 4.7 | 10.9% | 5 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 10.3% | 4 |
| mz.NanoGod 2.02 | 7.5 | 7.7% | 0 |
| jab.DiamondStealer 5 | 7.5 | 8.0% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.5% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.9 | 54.0 | 0 / 35 | 3730 |
| 2 | 4 | 59.1 | 59.4 | 1 / 35 | 3663 |
| 3 | 5 | 55.1 | 48.3 | 1 / 35 | 3564 |
| 4 | 6 | 56.5 | 50.8 | 1 / 35 | 3791 |
| 5 | 4 | 57.0 | 55.9 | 0 / 35 | 3681 |
| 6 | 4 | 57.2 | 56.5 | 0 / 35 | 3592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 18 | 0% |
| brainfade.melee.Dusk 0.44 | 1 | 0% |
| dummy.micro.Sparrow 2.5 | 1 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 207 of 210 rounds, at a mean tick of 502. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 108 | 52% | 109 |
| brainfade.melee.Dusk 0.44 | 28 | 14% | 28 |
| wcsv.melee.EngineerMelee 0.1 | 24 | 12% | 24 |
| jab.DiamondStealer 5 | 14 | 7% | 14 |
| dummy.micro.Sparrow 2.5 | 11 | 5% | 12 |
| mz.NanoGod 2.02 | 11 | 5% | 11 |
| Krabb.akim2.Akim2 1.1b | 9 | 4% | 10 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |

## Melee bench: F44

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 63.9 | 22 / 210 | 4.25 | 14.1% | 30864 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.0 | 17.0% | 96 |
| hadur117.mini.DeiseWHPK 0.2 | 2.5 | 14.1% | 22 |
| tzu.TheArtOfWar 1.2 | 2.7 | 14.6% | 51 |
| wompi.Quokka 1.6 | 4.0 | 11.1% | 14 |
| jwirde.Gort 2.0 | 5.3 | 10.1% | 20 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 9.9% | 4 |
| disan.Chair 2.2.0 | 7.3 | 7.4% | 0 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.7% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.8% | 1 |
| sample.Crazy 1.0 | 9.7 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.3 | 66.0 | 4 / 35 | 5149 |
| 2 | 2 | 62.2 | 65.7 | 4 / 35 | 5393 |
| 3 | 3 | 59.7 | 60.3 | 4 / 35 | 4940 |
| 4 | 2 | 62.2 | 66.0 | 4 / 35 | 5306 |
| 5 | 2 | 60.6 | 62.9 | 2 / 35 | 5248 |
| 6 | 3 | 60.7 | 62.2 | 4 / 35 | 4828 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 29 | 34% |
| tzu.TheArtOfWar 1.2 | 11 | 27% |
| jwirde.Gort 2.0 | 7 | 29% |
| wompi.Quokka 1.6 | 6 | 33% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 40% |
| stf.PanzerGeneral 0.1 | 3 | 67% |
| disan.Chair 2.2.0 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 0% |

Hadur died in 188 of 210 rounds, at a mean tick of 637. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 65 | 35% | 75 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 31 | 16% | 32 |
| tzu.TheArtOfWar 1.2 | 28 | 15% | 34 |
| wompi.Quokka 1.6 | 22 | 12% | 25 |
| jwirde.Gort 2.0 | 22 | 12% | 24 |
| stf.PanzerGeneral 0.1 | 9 | 5% | 9 |
| amk.jointstrike.JointStrike 0.2 | 7 | 4% | 7 |
| disan.Chair 2.2.0 | 4 | 2% | 4 |

## Melee bench: F45

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 80.5 | 49 / 210 | 2.76 | 18.0% | 35835 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPK 0.2 | 1.0 | 18.0% | 49 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 12.5% | 99 |
| jje.BagPuss 1.2 | 2.8 | 12.7% | 27 |
| sul.Lunar 1.1 | 4.5 | 10.5% | 21 |
| myl.nano.Graviton 1.10 | 5.0 | 10.0% | 5 |
| fm.claire 1.7 | 6.3 | 8.7% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 6.3 | 9.2% | 7 |
| hvilela.HVilela 0.9 | 7.5 | 8.3% | 1 |
| wit.Deep7 2.0 | 9.3 | 5.2% | 6 |
| abud.ThirdRobo 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 80.6 | 8 / 35 | 5683 |
| 2 | 1 | 68.3 | 83.2 | 13 / 35 | 6196 |
| 3 | 1 | 69.3 | 85.1 | 9 / 35 | 6596 |
| 4 | 1 | 65.2 | 75.2 | 3 / 35 | 5781 |
| 5 | 1 | 67.4 | 80.6 | 7 / 35 | 6375 |
| 6 | 1 | 65.4 | 78.1 | 9 / 35 | 5204 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 64 | 14% |
| sul.Lunar 1.1 | 24 | 50% |
| jje.BagPuss 1.2 | 20 | 20% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 91% |
| myl.nano.Graviton 1.10 | 7 | 86% |
| wit.Deep7 2.0 | 4 | 50% |
| abud.ThirdRobo 1.0 | 2 | 100% |
| fm.claire 1.7 | 1 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 163 of 210 rounds, at a mean tick of 1453. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 56 | 34% | 0 |
| jje.BagPuss 1.2 | 52 | 32% | 84 |
| sul.Lunar 1.1 | 24 | 15% | 48 |
| myl.nano.Graviton 1.10 | 9 | 6% | 15 |
| hvilela.HVilela 0.9 | 7 | 4% | 15 |
| wit.Deep7 2.0 | 5 | 3% | 13 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 2% | 17 |
| fm.claire 1.7 | 4 | 2% | 15 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |
2 death(s) with no robot to name.

## Melee bench: F46

hadur117.mini.DeiseWHPK 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 68.6 | 7 / 210 | 3.83 | 13.7% | 27031 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 18.3% | 96 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 17.1% | 91 |
| hadur117.mini.DeiseWHPK 0.2 | 3.0 | 13.7% | 7 |
| mz.MicroSheep 1.0 | 4.5 | 10.4% | 3 |
| cx.Princess 1.0 | 5.2 | 9.9% | 9 |
| sadoner.killer 0.2 | 5.3 | 9.1% | 2 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.0% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.3% | 1 |
| kurios.DOSexe .9a | 8.8 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.1 | 67.3 | 1 / 35 | 4641 |
| 2 | 3 | 62.1 | 72.1 | 0 / 35 | 4448 |
| 3 | 3 | 62.2 | 71.7 | 1 / 35 | 4631 |
| 4 | 3 | 60.9 | 66.3 | 2 / 35 | 4450 |
| 5 | 3 | 61.5 | 67.3 | 3 / 35 | 4493 |
| 6 | 3 | 60.3 | 66.7 | 0 / 35 | 4368 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 23 | 4% |
| rsalesc.melee.Medina 0.4.5 | 15 | 0% |
| mz.MicroSheep 1.0 | 5 | 60% |
| cx.Princess 1.0 | 2 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 0% |

Hadur died in 203 of 210 rounds, at a mean tick of 605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 99 | 49% | 101 |
| rsalesc.melee.Medina 0.4.5 | 55 | 27% | 56 |
| cx.Princess 1.0 | 15 | 7% | 16 |
| mz.MicroSheep 1.0 | 13 | 6% | 14 |
| sadoner.killer 0.2 | 11 | 5% | 11 |
| arthord.NanoSatanMelee Beta | 6 | 3% | 6 |
| jeremyreeder.collective.Prophet 5 | 3 | 1% | 5 |
| kurios.DOSexe .9a | 1 | 0% | 1 |

