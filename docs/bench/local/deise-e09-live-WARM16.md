# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 87.1 | 57 / 210 | 2.16 | 17.1% | 28789 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 138 |
| hadur117.mini.DeiseWARM16 0.4 | 2.0 | 17.1% | 57 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 10.8% | 1 |
| mz.MicroGodMelee 1 | 4.5 | 10.5% | 4 |
| lorneswork.Predator 1.0 | 4.5 | 10.0% | 0 |
| sgp.JollyNinja 3.53 | 4.7 | 10.6% | 10 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.6% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 87.0 | 10 / 35 | 4931 |
| 2 | 2 | 67.3 | 88.6 | 9 / 35 | 4774 |
| 3 | 2 | 66.7 | 85.7 | 7 / 35 | 4920 |
| 4 | 2 | 65.6 | 83.5 | 7 / 35 | 4628 |
| 5 | 2 | 68.0 | 89.5 | 13 / 35 | 4864 |
| 6 | 2 | 67.1 | 88.6 | 11 / 35 | 4672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 130 | 18% |
| sgp.JollyNinja 3.53 | 13 | 69% |
| mz.MicroGodMelee 1 | 12 | 92% |
| lorneswork.Predator 1.0 | 7 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 80% |
| adt.Ar2 1.0 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 1247. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 121 | 79% | 142 |
| sgp.JollyNinja 3.53 | 12 | 8% | 21 |
| mz.MicroGodMelee 1 | 8 | 5% | 19 |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 5% | 10 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 4 |
| lorneswork.Predator 1.0 | 1 | 1% | 10 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |
| adt.Ar2 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 85.0 | 120 / 210 | 2.35 | 18.2% | 28218 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 18.2% | 120 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.8% | 33 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.7% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.9% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.3 | 9.1% | 7 |
| Noran.BitchingElk 0.054 | 5.8 | 8.4% | 16 |
| sch.Simone 0.3d | 7.3 | 7.6% | 5 |
| fnc.bandit.Bandit 5.2.0 | 7.8 | 7.6% | 1 |
| stelo.PatternRobot 1.0 | 8.5 | 6.3% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 82.9 | 19 / 35 | 4496 |
| 2 | 1 | 68.6 | 87.0 | 19 / 35 | 5195 |
| 3 | 1 | 68.8 | 89.8 | 26 / 35 | 4457 |
| 4 | 1 | 67.0 | 84.1 | 17 / 35 | 4545 |
| 5 | 1 | 68.1 | 88.3 | 20 / 35 | 4906 |
| 6 | 1 | 65.6 | 78.1 | 19 / 35 | 4619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 48 | 79% |
| pulsar.PulsarMax 0.8.9 | 41 | 83% |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 81% |
| stelo.PatternRobot 1.0 | 10 | 90% |
| Noran.BitchingElk 0.054 | 8 | 75% |
| sch.Simone 0.3d | 8 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 67% |
| fullsail.SweetTea 1.1 | 2 | 50% |

Hadur died in 91 of 210 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 27 | 30% | 57 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 22 | 24% | 61 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 10% | 16 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 8% | 27 |
| Noran.BitchingElk 0.054 | 7 | 8% | 11 |
| stelo.PatternRobot 1.0 | 6 | 7% | 11 |
| fnc.bandit.Bandit 5.2.0 | 5 | 5% | 10 |
| sch.Simone 0.3d | 4 | 4% | 11 |
| fullsail.SweetTea 1.1 | 4 | 4% | 5 |

## Melee bench: F03

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 92.8 | 153 / 210 | 1.65 | 20.2% | 36583 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 20.2% | 153 |
| radnor.DoctorBob 1.42 | 2.3 | 13.6% | 15 |
| vuen.Cake 2.51 | 3.3 | 12.9% | 31 |
| kawigi.nano.Lib 1.0 | 3.3 | 12.9% | 9 |
| urdos.URDOS 1.3 | 5.2 | 9.0% | 0 |
| adt.Ar1 2.1 | 6.3 | 7.5% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 6.8 | 7.3% | 1 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 94.3 | 26 / 35 | 6050 |
| 2 | 1 | 69.7 | 92.4 | 22 / 35 | 6035 |
| 3 | 1 | 70.6 | 93.3 | 27 / 35 | 5960 |
| 4 | 1 | 72.4 | 98.1 | 30 / 35 | 6651 |
| 5 | 1 | 68.3 | 85.1 | 21 / 35 | 5684 |
| 6 | 1 | 70.8 | 93.3 | 27 / 35 | 6203 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 65 | 95% |
| vuen.Cake 2.51 | 62 | 71% |
| radnor.DoctorBob 1.42 | 44 | 89% |
| adt.Ar1 2.1 | 4 | 75% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 26 | 44% | 71 |
| radnor.DoctorBob 1.42 | 14 | 24% | 45 |
| kawigi.nano.Lib 1.0 | 11 | 19% | 71 |
| adt.Ar1 2.1 | 3 | 5% | 5 |
| urdos.URDOS 1.3 | 2 | 3% | 2 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 7 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 | 0% | 2 |

## Melee bench: F04

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.6 | 41 / 210 | 2.12 | 17.6% | 32336 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.9% | 162 |
| hadur117.mini.DeiseWARM16 0.4 | 2.0 | 17.6% | 41 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.1% | 6 |
| TNT.TNT 0.99.1 | 4.3 | 9.9% | 1 |
| josago.Jorgito 0.16 | 4.7 | 9.1% | 0 |
| css.Delitioner 0.11 | 6.3 | 6.9% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.3% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.2% | 0 |
| spin.Bugstard 0.012b | 9.7 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.3 | 87.9 | 7 / 35 | 5336 |
| 2 | 2 | 68.3 | 88.3 | 9 / 35 | 5492 |
| 3 | 2 | 68.5 | 89.2 | 8 / 35 | 5226 |
| 4 | 2 | 67.8 | 85.4 | 8 / 35 | 5400 |
| 5 | 2 | 67.9 | 88.3 | 4 / 35 | 5327 |
| 6 | 2 | 68.0 | 86.3 | 5 / 35 | 5555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 161 | 19% |
| apc.LeeroyJenkins2 1.0 | 7 | 71% |
| TNT.TNT 0.99.1 | 4 | 100% |
| css.Delitioner 0.11 | 1 | 100% |
| spin.Bugstard 0.012b | 1 | 0% |

Hadur died in 170 of 210 rounds, at a mean tick of 1514. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 144 | 85% | 175 |
| apc.LeeroyJenkins2 1.0 | 13 | 8% | 18 |
| tj.zombie1n 1.0.1 | 5 | 3% | 5 |
| josago.Jorgito 0.16 | 3 | 2% | 3 |
| TNT.TNT 0.99.1 | 2 | 1% | 7 |
| css.Delitioner 0.11 | 1 | 1% | 2 |
| spin.Bugstard 0.012b | 1 | 1% | 0 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 72.3 | 28 / 210 | 3.49 | 13.4% | 19153 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.9% | 121 |
| justin.DemonicRage 3.4 | 2.0 | 17.0% | 49 |
| hadur117.mini.DeiseWARM16 0.4 | 3.3 | 13.4% | 28 |
| wompi.Numbat 2.1 | 3.7 | 12.8% | 10 |
| ms.Ares 0.19 | 5.3 | 9.2% | 0 |
| axeBots.HataMoto 3.09 | 5.7 | 8.4% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.3 | 6.0% | 0 |
| supersample.SuperBoxBot 1.0 | 7.7 | 6.2% | 0 |
| GarmBox.Oranges 1.0 | 9.3 | 4.1% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 72.7 | 3 / 35 | 3032 |
| 2 | 3 | 61.7 | 72.7 | 6 / 35 | 3280 |
| 3 | 3 | 60.9 | 73.3 | 4 / 35 | 3227 |
| 4 | 4 | 60.9 | 71.1 | 6 / 35 | 3043 |
| 5 | 4 | 58.1 | 65.4 | 1 / 35 | 3087 |
| 6 | 3 | 63.5 | 78.7 | 8 / 35 | 3484 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 34 | 18% |
| justin.DemonicRage 3.4 | 25 | 48% |
| wompi.Numbat 2.1 | 9 | 78% |
| axeBots.HataMoto 3.09 | 2 | 100% |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 100% |

Hadur died in 182 of 210 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 66 | 36% | 72 |
| justin.DemonicRage 3.4 | 63 | 35% | 75 |
| wompi.Numbat 2.1 | 25 | 14% | 31 |
| ms.Ares 0.19 | 11 | 6% | 11 |
| axeBots.HataMoto 3.09 | 8 | 4% | 10 |
| davidalves.net.DuelistMicroMelee 1.4 | 5 | 3% | 6 |
| supersample.SuperBoxBot 1.0 | 3 | 2% | 3 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 0 | 0% | 1 |

## Melee bench: F06

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 87.3 | 120 / 210 | 2.14 | 18.2% | 27377 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 18.2% | 120 |
| jekl.StoneGhost 0.7 | 2.0 | 14.4% | 26 |
| origin.SleepSiphon 1.7b | 3.5 | 13.0% | 39 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.7 | 12.4% | 18 |
| mld.Wisdom 1.0 | 4.8 | 10.4% | 2 |
| gg.Wolverine 2.0 | 6.0 | 8.3% | 2 |
| spinnercat.Omen 1.0 | 7.5 | 7.0% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 6.7% | 4 |
| DBall.NUKE 0.1 | 8.3 | 6.4% | 0 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 86.3 | 22 / 35 | 4574 |
| 2 | 1 | 67.9 | 87.6 | 20 / 35 | 4507 |
| 3 | 1 | 68.0 | 85.7 | 20 / 35 | 4851 |
| 4 | 1 | 67.9 | 89.2 | 19 / 35 | 4385 |
| 5 | 1 | 67.6 | 87.3 | 18 / 35 | 4501 |
| 6 | 1 | 68.0 | 87.6 | 21 / 35 | 4559 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 56 | 79% |
| pe.minimelee.SandboxMiniMelee 1.1 | 33 | 76% |
| origin.SleepSiphon 1.7b | 31 | 77% |
| gg.Wolverine 2.0 | 11 | 91% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 67% |
| DBall.NUKE 0.1 | 5 | 100% |
| mld.Wisdom 1.0 | 4 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 24 | 26% | 54 |
| origin.SleepSiphon 1.7b | 23 | 25% | 59 |
| pe.minimelee.SandboxMiniMelee 1.1 | 23 | 25% | 47 |
| mld.Wisdom 1.0 | 14 | 15% | 25 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 4% | 10 |
| gg.Wolverine 2.0 | 2 | 2% | 10 |
| spinnercat.Omen 1.0 | 1 | 1% | 2 |
| DBall.NUKE 0.1 | 0 | 0% | 3 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 93.1 | 123 / 210 | 1.62 | 19.9% | 33965 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 19.9% | 123 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.3% | 47 |
| rtk.Tachikoma 1.0 | 2.8 | 16.3% | 22 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.8% | 10 |
| franzor.Lizt 1.3.1 | 5.0 | 10.5% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.5% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.4% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.5% | 0 |
| sample.Target 1.0 | 9.0 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 93.3 | 22 / 35 | 5511 |
| 2 | 1 | 71.6 | 93.7 | 21 / 35 | 5764 |
| 3 | 1 | 71.4 | 92.1 | 21 / 35 | 5667 |
| 4 | 1 | 71.3 | 93.3 | 22 / 35 | 5534 |
| 5 | 1 | 70.7 | 92.4 | 16 / 35 | 5510 |
| 6 | 1 | 71.6 | 94.0 | 21 / 35 | 5979 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 92 | 83% |
| rsalesc.melee.Monk 0.3.6c | 53 | 23% |
| oog.melee.CapuletDroid 1.1 | 28 | 82% |
| franzor.Lizt 1.3.1 | 15 | 73% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 1603. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 45 | 52% | 66 |
| rtk.Tachikoma 1.0 | 26 | 30% | 110 |
| oog.melee.CapuletDroid 1.1 | 10 | 11% | 30 |
| franzor.Lizt 1.3.1 | 4 | 5% | 1 |
| exauge.GateKeeper 1.1.121g | 2 | 2% | 3 |

## Melee bench: F08

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 88.5 | 124 / 210 | 2.04 | 18.8% | 29016 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 18.8% | 124 |
| tm.Yuugao 1.0 | 2.2 | 13.6% | 37 |
| shrub.Vapour v159 | 3.0 | 12.2% | 22 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 10.6% | 13 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 10.0% | 6 |
| jwst.DAD.DarkAndDarker 1.1 | 6.2 | 8.4% | 8 |
| m3thos.Eva00 1.1 | 6.7 | 8.1% | 0 |
| zyx.nano.BacillusComma 1.0 | 8.5 | 6.3% | 0 |
| SHAM.WOW 1.4 | 8.8 | 6.2% | 1 |
| qualidafial.MajorDick 1.0.1 | 9.7 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 82.5 | 18 / 35 | 4423 |
| 2 | 1 | 67.5 | 87.3 | 18 / 35 | 4930 |
| 3 | 1 | 69.6 | 91.1 | 23 / 35 | 5244 |
| 4 | 1 | 68.7 | 90.2 | 20 / 35 | 4943 |
| 5 | 1 | 69.9 | 96.2 | 27 / 35 | 4737 |
| 6 | 1 | 67.1 | 83.5 | 18 / 35 | 4739 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 56 | 77% |
| shrub.Vapour v159 | 31 | 74% |
| Krabb.sliNk.Garm 0.9u | 23 | 70% |
| com.spp.robocode.MostlyHarmless 010 | 22 | 91% |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 90% |
| SHAM.WOW 1.4 | 6 | 83% |
| m3thos.Eva00 1.1 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 27 | 31% | 69 |
| shrub.Vapour v159 | 24 | 28% | 45 |
| Krabb.sliNk.Garm 0.9u | 12 | 14% | 31 |
| com.spp.robocode.MostlyHarmless 010 | 11 | 13% | 29 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 3% | 14 |
| m3thos.Eva00 1.1 | 3 | 3% | 9 |
| SHAM.WOW 1.4 | 3 | 3% | 7 |
| zyx.nano.BacillusComma 1.0 | 2 | 2% | 4 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 75.8 | 57 / 210 | 3.18 | 15.3% | 23249 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 17.1% | 99 |
| hadur117.mini.DeiseWARM16 0.4 | 1.8 | 15.3% | 57 |
| kc.micro.Figment 1.0 | 2.8 | 14.0% | 22 |
| yagami.Tidus 0.11 | 4.0 | 10.8% | 3 |
| pedersen.Grishnakh 1.0 | 5.3 | 9.7% | 16 |
| mc2.enemy.Original 0.9 | 5.7 | 9.5% | 9 |
| dft.Calliope 5.6 | 7.0 | 7.8% | 4 |
| step.nanoPri 1.0 | 8.2 | 6.4% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.0% | 0 |
| rdm.Dueler 0.4x | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 82.2 | 9 / 35 | 3925 |
| 2 | 3 | 61.6 | 71.7 | 5 / 35 | 3781 |
| 3 | 2 | 62.0 | 69.2 | 7 / 35 | 4023 |
| 4 | 2 | 62.8 | 74.6 | 11 / 35 | 3668 |
| 5 | 2 | 63.7 | 78.1 | 7 / 35 | 3846 |
| 6 | 1 | 65.6 | 79.0 | 18 / 35 | 4006 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 62 | 24% |
| kc.micro.Figment 1.0 | 25 | 88% |
| yagami.Tidus 0.11 | 9 | 89% |
| pedersen.Grishnakh 1.0 | 7 | 57% |
| mc2.enemy.Original 0.9 | 5 | 100% |
| dft.Calliope 5.6 | 4 | 75% |

Hadur died in 153 of 210 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 77 | 50% | 93 |
| kc.micro.Figment 1.0 | 24 | 16% | 52 |
| yagami.Tidus 0.11 | 19 | 12% | 25 |
| pedersen.Grishnakh 1.0 | 9 | 6% | 11 |
| mc2.enemy.Original 0.9 | 8 | 5% | 11 |
| dft.Calliope 5.6 | 4 | 3% | 6 |
| step.nanoPri 1.0 | 4 | 3% | 4 |
| rdm.Dueler 0.4x | 4 | 3% | 4 |
| robar.nano.Assertive_Melee 0.2 | 4 | 3% | 4 |

## Melee bench: F10

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 96.3 | 173 / 210 | 1.33 | 20.6% | 32470 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 20.6% | 173 |
| DTF.Kludgy 1.2b | 2.5 | 13.8% | 17 |
| ejb.Polaris 1.0.1 | 3.0 | 12.5% | 8 |
| ne.Chimera 1.2 | 3.5 | 12.4% | 8 |
| tvv.micro.Antares 1.1.1 | 5.2 | 10.1% | 2 |
| vStar.RAFzilla 2.15 | 5.8 | 9.8% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.6% | 0 |
| sam.Samspin 1.0 | 8.3 | 5.4% | 1 |
| kurios.DOSexe .9b | 8.5 | 5.2% | 0 |
| donjezza.Muncho 1.0 | 9.2 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 96.5 | 29 / 35 | 5262 |
| 2 | 1 | 72.1 | 98.7 | 32 / 35 | 5879 |
| 3 | 1 | 70.4 | 94.6 | 27 / 35 | 5340 |
| 4 | 1 | 71.0 | 96.5 | 29 / 35 | 5592 |
| 5 | 1 | 71.1 | 96.8 | 29 / 35 | 5241 |
| 6 | 1 | 70.5 | 94.9 | 27 / 35 | 5156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 56 | 95% |
| DTF.Kludgy 1.2b | 49 | 86% |
| ne.Chimera 1.2 | 30 | 87% |
| vStar.RAFzilla 2.15 | 25 | 96% |
| tvv.micro.Antares 1.1.1 | 18 | 89% |
| kurios.DOSexe .9b | 5 | 100% |
| donjezza.Muncho 1.0 | 4 | 100% |
| sam.Samspin 1.0 | 3 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 1023. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 16 | 42% | 52 |
| ne.Chimera 1.2 | 10 | 26% | 35 |
| ejb.Polaris 1.0.1 | 6 | 16% | 63 |
| vStar.RAFzilla 2.15 | 2 | 5% | 21 |
| tvv.micro.Antares 1.1.1 | 2 | 5% | 18 |
| sam.Samspin 1.0 | 2 | 5% | 3 |
| kurios.DOSexe .9b | 0 | 0% | 10 |
| donjezza.Muncho 1.0 | 0 | 0% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 85.4 | 104 / 210 | 2.31 | 17.7% | 26196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.2 | 17.7% | 104 |
| rz.Aleph 0.34 | 1.8 | 16.5% | 61 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.4% | 18 |
| djc.DynaBot 0.1.1 | 4.0 | 10.8% | 10 |
| rdt199.Warlord 0.73 | 5.5 | 8.8% | 11 |
| uji.YellohFellah 1.0 | 6.5 | 8.0% | 3 |
| br2.MobyDickBot 1.6 | 6.7 | 7.8% | 5 |
| KiraNL.Chupacabra 0.4 | 7.3 | 7.5% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.6% | 0 |
| stelo.MirrorNano 1.3 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 84.8 | 18 / 35 | 4307 |
| 2 | 2 | 65.8 | 81.0 | 14 / 35 | 4479 |
| 3 | 1 | 66.9 | 82.9 | 20 / 35 | 4415 |
| 4 | 1 | 67.0 | 86.0 | 18 / 35 | 4444 |
| 5 | 1 | 68.2 | 91.4 | 19 / 35 | 4259 |
| 6 | 1 | 66.7 | 86.3 | 15 / 35 | 4292 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 72 | 64% |
| cx.mini.Nimrod 0.55 | 29 | 79% |
| djc.DynaBot 0.1.1 | 15 | 80% |
| rdt199.Warlord 0.73 | 11 | 91% |
| uji.YellohFellah 1.0 | 9 | 100% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |
| br2.MobyDickBot 1.6 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 54 | 50% | 101 |
| cx.mini.Nimrod 0.55 | 26 | 24% | 43 |
| djc.DynaBot 0.1.1 | 10 | 9% | 22 |
| rdt199.Warlord 0.73 | 8 | 7% | 17 |
| KiraNL.Chupacabra 0.4 | 3 | 3% | 6 |
| br2.MobyDickBot 1.6 | 2 | 2% | 10 |
| uji.YellohFellah 1.0 | 1 | 1% | 9 |
| stelo.MirrorNano 1.3 | 1 | 1% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F12

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 87.2 | 132 / 210 | 2.15 | 18.2% | 23821 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 18.2% | 132 |
| bts.wiki.RipCurl 0.9b | 2.3 | 13.8% | 23 |
| darkcanuck.Leon 1.01 | 3.3 | 12.7% | 19 |
| nat.PallasHawk 1.0 | 3.3 | 12.9% | 26 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.3% | 6 |
| jrm.Test0 1.0 | 6.5 | 7.7% | 2 |
| jp.Perpy 16.0 | 7.3 | 6.6% | 1 |
| cs.sheldor.Talon 1.1 | 7.8 | 6.9% | 0 |
| stuff.Vlad 0.1 | 9.2 | 5.4% | 0 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 88.6 | 24 / 35 | 3743 |
| 2 | 1 | 65.6 | 81.3 | 18 / 35 | 3686 |
| 3 | 1 | 68.2 | 89.2 | 20 / 35 | 4107 |
| 4 | 1 | 67.4 | 87.0 | 22 / 35 | 4017 |
| 5 | 1 | 69.6 | 93.7 | 26 / 35 | 4192 |
| 6 | 1 | 67.1 | 83.8 | 22 / 35 | 4076 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 46 | 80% |
| nat.PallasHawk 1.0 | 45 | 84% |
| darkcanuck.Leon 1.01 | 41 | 88% |
| brainfade.melee.Genghis 0.36 | 17 | 94% |
| jaybot.bots.Oddball 4.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 18 | 23% | 50 |
| bts.wiki.RipCurl 0.9b | 17 | 22% | 44 |
| darkcanuck.Leon 1.01 | 13 | 17% | 66 |
| brainfade.melee.Genghis 0.36 | 11 | 14% | 24 |
| jrm.Test0 1.0 | 7 | 9% | 8 |
| jp.Perpy 16.0 | 7 | 9% | 8 |
| jaybot.bots.Oddball 4.0 | 3 | 4% | 6 |
| stuff.Vlad 0.1 | 2 | 3% | 3 |
| cs.sheldor.Talon 1.1 | 0 | 0% | 1 |

## Melee bench: F13

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 85.6 | 83 / 210 | 2.30 | 16.8% | 25504 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.3 | 17.4% | 89 |
| hadur117.mini.DeiseWARM16 0.4 | 2.0 | 16.8% | 83 |
| ags.Glacier 0.2.11 | 2.7 | 15.3% | 23 |
| shinh.Entangled 0.3 | 4.2 | 11.9% | 12 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.1% | 4 |
| apc.Colossus2 0.17 | 6.0 | 7.8% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.9% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 5.2% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.5% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 92.4 | 20 / 35 | 4937 |
| 2 | 2 | 66.6 | 85.4 | 14 / 35 | 4255 |
| 3 | 3 | 65.6 | 84.8 | 11 / 35 | 3879 |
| 4 | 3 | 65.0 | 81.0 | 10 / 35 | 4243 |
| 5 | 2 | 65.3 | 83.2 | 12 / 35 | 3839 |
| 6 | 1 | 67.1 | 86.7 | 16 / 35 | 4351 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 74 | 43% |
| ags.Glacier 0.2.11 | 45 | 64% |
| shinh.Entangled 0.3 | 14 | 71% |
| gh.micro.Gruweltje 0.7 | 11 | 82% |
| stelo.Wang 1.0 | 3 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 1007. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 62 | 48% | 92 |
| ags.Glacier 0.2.11 | 28 | 22% | 57 |
| shinh.Entangled 0.3 | 18 | 14% | 30 |
| gh.micro.Gruweltje 0.7 | 8 | 6% | 19 |
| stelo.Wang 1.0 | 7 | 5% | 8 |
| apc.Colossus2 0.17 | 3 | 2% | 3 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 91.3 | 149 / 210 | 1.78 | 19.7% | 31933 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 19.7% | 149 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.7% | 32 |
| catcat20.shape.Theta 0.018 | 3.0 | 11.9% | 17 |
| sanyi.mikrobi.Roberto 1.0 | 5.2 | 9.7% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.5% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 5.8 | 9.4% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 6.7 | 8.8% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 8.5% | 5 |
| pa.Improved 1.0 | 9.0 | 5.0% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 94.6 | 26 / 35 | 5466 |
| 2 | 1 | 68.8 | 87.9 | 23 / 35 | 5060 |
| 3 | 1 | 71.0 | 95.6 | 26 / 35 | 5531 |
| 4 | 1 | 71.0 | 93.0 | 27 / 35 | 5730 |
| 5 | 1 | 69.2 | 89.2 | 23 / 35 | 5127 |
| 6 | 1 | 69.4 | 87.6 | 24 / 35 | 5019 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 78 | 83% |
| catcat20.shape.Theta 0.018 | 48 | 85% |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 81% |
| co.edu.usb.rc.LidisTron 1.0 | 13 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 10 | 90% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 28 | 46% | 98 |
| catcat20.shape.Theta 0.018 | 9 | 15% | 46 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 13% | 23 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 10% | 11 |
| co.edu.usb.rc.LidisTron 1.0 | 6 | 10% | 9 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 7% | 19 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 2 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |
| pa.Improved 1.0 | 0 | 0% | 1 |

## Melee bench: F15

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.9 | 110 / 210 | 2.54 | 18.0% | 30498 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 18.0% | 110 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.5% | 15 |
| emp.Yngwie 1.11 | 3.0 | 13.2% | 46 |
| mld.DustBunny 3.8 | 3.8 | 12.5% | 13 |
| cb.nano.Insomnia 1.0 | 4.8 | 11.4% | 10 |
| kawigi.robot.Girl 1.2 | 5.7 | 9.5% | 13 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.4% | 0 |
| lambdaxy.TBot 0.1 | 7.7 | 5.9% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.3% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 83.8 | 18 / 35 | 5009 |
| 2 | 1 | 67.4 | 82.5 | 18 / 35 | 5037 |
| 3 | 1 | 67.3 | 82.9 | 20 / 35 | 4768 |
| 4 | 1 | 66.7 | 81.9 | 17 / 35 | 4871 |
| 5 | 1 | 68.4 | 82.9 | 19 / 35 | 5626 |
| 6 | 1 | 68.0 | 83.2 | 18 / 35 | 5187 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 41 | 73% |
| kawigi.micro.Shiz 1.1 | 25 | 96% |
| cb.nano.Insomnia 1.0 | 24 | 83% |
| kawigi.robot.Girl 1.2 | 18 | 94% |
| mld.DustBunny 3.8 | 17 | 88% |
| divineomega.TrialBot 0.003 | 4 | 75% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 31 | 31% | 82 |
| mld.DustBunny 3.8 | 22 | 22% | 40 |
| cb.nano.Insomnia 1.0 | 16 | 16% | 15 |
| kawigi.micro.Shiz 1.1 | 11 | 11% | 36 |
| divineomega.TrialBot 0.003 | 9 | 9% | 17 |
| kawigi.robot.Girl 1.2 | 7 | 7% | 12 |
| lambdaxy.TBot 0.1 | 2 | 2% | 4 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.5 | 113 / 210 | 2.12 | 19.1% | 33286 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 19.1% | 113 |
| gh.Griezel 0.5.2 | 2.2 | 16.4% | 55 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 14.3% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.9% | 31 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.1% | 4 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 8.5% | 1 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.5% | 1 |
| asd.Cthulhu 1.3 | 8.5 | 5.0% | 0 |
| repositorio.NanoStep 1.0 | 9.0 | 4.7% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.5 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.3 | 18 / 35 | 5583 |
| 2 | 1 | 69.7 | 87.9 | 21 / 35 | 5309 |
| 3 | 1 | 68.5 | 86.3 | 16 / 35 | 5297 |
| 4 | 1 | 70.1 | 90.2 | 23 / 35 | 5467 |
| 5 | 1 | 69.1 | 86.3 | 18 / 35 | 5679 |
| 6 | 1 | 69.2 | 87.0 | 17 / 35 | 5951 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 84 | 62% |
| techdude.forest.FlamingForest 1.1 | 35 | 57% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 18 | 94% |
| stelo.IntrinsicVolatility 1.4 | 10 | 100% |
| bvh.fnr.Fenrir 0.36l | 7 | 86% |
| tvv.nano.Polaris 1.2 | 5 | 100% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1361. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 54 | 55% | 107 |
| techdude.forest.FlamingForest 1.1 | 17 | 17% | 39 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 12 | 12% | 32 |
| bvh.fnr.Fenrir 0.36l | 6 | 6% | 7 |
| asd.Cthulhu 1.3 | 3 | 3% | 4 |
| stelo.IntrinsicVolatility 1.4 | 2 | 2% | 13 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 3 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 3 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 82.1 | 102 / 210 | 2.61 | 17.4% | 28674 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 17.4% | 102 |
| et.Predator 1.8 | 2.8 | 13.2% | 26 |
| cx.BlestPain 1.41 | 3.2 | 12.8% | 36 |
| oog.melee.Mercutio 1.0 | 3.8 | 12.0% | 27 |
| nic.Nicator 2.4 | 4.5 | 11.7% | 11 |
| ahf.NanoAndrew .4 | 5.8 | 10.4% | 6 |
| maribo.melee.BMV 0.1 | 6.8 | 8.8% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.5% | 0 |
| tex.Longbot 0.4 | 8.5 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 83.5 | 15 / 35 | 4454 |
| 2 | 1 | 68.2 | 86.3 | 18 / 35 | 4999 |
| 3 | 1 | 65.6 | 78.4 | 16 / 35 | 4690 |
| 4 | 1 | 66.5 | 80.3 | 17 / 35 | 4763 |
| 5 | 1 | 65.3 | 76.5 | 15 / 35 | 4729 |
| 6 | 1 | 68.6 | 87.6 | 21 / 35 | 5039 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 44 | 75% |
| oog.melee.Mercutio 1.0 | 35 | 77% |
| cx.BlestPain 1.41 | 23 | 52% |
| nic.Nicator 2.4 | 18 | 89% |
| ahf.NanoAndrew .4 | 11 | 91% |
| maribo.melee.BMV 0.1 | 4 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 27 | 25% | 42 |
| et.Predator 1.8 | 25 | 23% | 55 |
| oog.melee.Mercutio 1.0 | 19 | 17% | 40 |
| ahf.NanoAndrew .4 | 14 | 13% | 28 |
| nic.Nicator 2.4 | 11 | 10% | 29 |
| maribo.melee.BMV 0.1 | 6 | 6% | 7 |
| edu.otg.spr.TheTeacher 1.2 | 4 | 4% | 5 |
| tex.Longbot 0.4 | 3 | 3% | 3 |

## Melee bench: F18

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 85.7 | 119 / 210 | 2.29 | 17.9% | 26638 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 17.9% | 119 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.3% | 34 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.0% | 28 |
| uji.DBH 1.1 | 4.2 | 11.0% | 11 |
| ratosh.Nobo 0.21 | 5.3 | 9.7% | 5 |
| spinnercat.Robovirus 2.718 | 5.3 | 9.8% | 6 |
| sigterm.Sigterm 1.0 | 7.0 | 8.1% | 3 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.4% | 3 |
| stelo.WangRobot 1.0 | 9.2 | 5.9% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 85.1 | 18 / 35 | 4491 |
| 2 | 1 | 67.6 | 86.3 | 23 / 35 | 4514 |
| 3 | 1 | 67.2 | 87.9 | 23 / 35 | 4353 |
| 4 | 1 | 67.2 | 87.0 | 17 / 35 | 4485 |
| 5 | 1 | 66.4 | 84.4 | 20 / 35 | 4189 |
| 6 | 1 | 66.7 | 83.2 | 18 / 35 | 4606 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 49 | 73% |
| agd.Mooserwirt2 2.7 | 32 | 72% |
| uji.DBH 1.1 | 18 | 89% |
| sigterm.Sigterm 1.0 | 16 | 100% |
| ratosh.Nobo 0.21 | 13 | 100% |
| spinnercat.Robovirus 2.718 | 10 | 80% |
| stelo.WangRobot 1.0 | 7 | 86% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 50% |

Hadur died in 93 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 37 | 40% | 75 |
| agd.Mooserwirt2 2.7 | 17 | 18% | 46 |
| ratosh.Nobo 0.21 | 10 | 11% | 24 |
| uji.DBH 1.1 | 9 | 10% | 19 |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 6% | 8 |
| spinnercat.Robovirus 2.718 | 5 | 5% | 15 |
| sigterm.Sigterm 1.0 | 4 | 4% | 12 |
| stelo.WangRobot 1.0 | 4 | 4% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 97.1 | 182 / 210 | 1.26 | 21.5% | 33921 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 21.5% | 182 |
| mld.Infinity 2.2 | 2.5 | 14.1% | 14 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.5 | 14.4% | 10 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 10.8% | 2 |
| erdnis.Rover 0.3 | 4.7 | 10.5% | 0 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.6% | 0 |
| pac.ABC 2.1 | 7.7 | 6.6% | 2 |
| mbh.Mbh 0.1 | 7.7 | 6.9% | 0 |
| pbg.R2D2 1.0 | 8.7 | 5.6% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 98.7 | 32 / 35 | 5846 |
| 2 | 1 | 71.8 | 94.6 | 28 / 35 | 5403 |
| 3 | 1 | 72.2 | 97.8 | 30 / 35 | 5398 |
| 4 | 1 | 72.5 | 97.1 | 30 / 35 | 5596 |
| 5 | 1 | 73.3 | 97.5 | 31 / 35 | 6147 |
| 6 | 1 | 72.2 | 97.1 | 31 / 35 | 5531 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 96 | 94% |
| mld.Infinity 2.2 | 68 | 88% |
| erdnis.Rover 0.3 | 10 | 100% |
| krillr.mini.JointStrike 2.0.0 | 9 | 100% |
| patson.PatsonTestBot 1.0 | 7 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |
| pac.ABC 2.1 | 2 | 100% |

Hadur died in 28 of 210 rounds, at a mean tick of 1448. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 11 | 39% | 115 |
| mld.Infinity 2.2 | 10 | 36% | 20 |
| krillr.mini.JointStrike 2.0.0 | 3 | 11% | 19 |
| erdnis.Rover 0.3 | 3 | 11% | 17 |
| pbg.R2D2 1.0 | 1 | 4% | 8 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 11 |
| pac.ABC 2.1 | 0 | 0% | 9 |
| mbh.Mbh 0.1 | 0 | 0% | 9 |

## Melee bench: F20

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 91.3 | 136 / 210 | 1.78 | 19.9% | 32887 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 19.9% | 136 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.2% | 30 |
| fwb.Nine 1.0.1 | 3.5 | 11.7% | 18 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 11.2% | 5 |
| catcat20.Rabbit 0.001 | 4.3 | 10.5% | 19 |
| djdjdj.NanoSkunk10 1.0 | 6.7 | 7.6% | 1 |
| m3thos.mini.Eva01 0.5.5 | 7.0 | 7.7% | 1 |
| bayen.nut.Squirrel 1.615 | 7.3 | 6.9% | 1 |
| ntc.ControlledChaos 1.1.4 | 9.3 | 4.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 90.8 | 22 / 35 | 5309 |
| 2 | 1 | 69.5 | 90.2 | 20 / 35 | 5288 |
| 3 | 1 | 71.2 | 93.7 | 25 / 35 | 6033 |
| 4 | 1 | 71.1 | 92.4 | 26 / 35 | 5833 |
| 5 | 1 | 69.5 | 91.1 | 18 / 35 | 5334 |
| 6 | 1 | 69.5 | 89.8 | 25 / 35 | 5090 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 69 | 84% |
| fwb.Nine 1.0.1 | 45 | 76% |
| catcat20.Rabbit 0.001 | 31 | 68% |
| nz.jdc.nano.GridFu 1.0 | 16 | 81% |
| bayen.nut.Squirrel 1.615 | 7 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 1259. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 30 | 40% | 77 |
| fwb.Nine 1.0.1 | 20 | 27% | 26 |
| catcat20.Rabbit 0.001 | 14 | 19% | 43 |
| nz.jdc.nano.GridFu 1.0 | 5 | 7% | 36 |
| bayen.nut.Squirrel 1.615 | 4 | 5% | 13 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 1 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 4 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.7 | 131 / 210 | 1.74 | 20.0% | 33306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 20.0% | 131 |
| eem.EvBot v4.6.16 | 2.0 | 16.3% | 59 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.0% | 5 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.4% | 6 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.5% | 0 |
| eld.Hmm 1.0 | 5.7 | 8.3% | 9 |
| fire219.CatBot 1.0 | 7.3 | 6.3% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.1% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.1% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 93.0 | 25 / 35 | 5748 |
| 2 | 1 | 69.6 | 90.5 | 18 / 35 | 5508 |
| 3 | 1 | 70.0 | 91.7 | 23 / 35 | 5514 |
| 4 | 1 | 69.9 | 92.1 | 20 / 35 | 5163 |
| 5 | 1 | 71.5 | 94.9 | 25 / 35 | 5645 |
| 6 | 1 | 69.9 | 88.3 | 20 / 35 | 5728 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 109 | 65% |
| dummy.mini.Scimitar 1.01 | 33 | 97% |
| cf.RiO.RiOx 4.2.1 | 25 | 88% |
| eld.Hmm 1.0 | 8 | 63% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 1339. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 43 | 54% | 94 |
| dummy.mini.Scimitar 1.01 | 20 | 25% | 64 |
| cf.RiO.RiOx 4.2.1 | 8 | 10% | 27 |
| eld.Hmm 1.0 | 4 | 5% | 12 |
| oa.weak.BotherBot 0.1 | 2 | 3% | 6 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F22

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.0 | 96 / 210 | 2.17 | 18.1% | 29621 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.3 | 18.1% | 96 |
| pe.SandboxDT 2.71m | 1.8 | 17.0% | 68 |
| kvk.HebusLeTroll 0.35 | 2.8 | 15.2% | 31 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.2% | 13 |
| bigpete.Stewie 1.0 | 5.0 | 9.8% | 2 |
| yk.JahRoslav 1.1 | 6.3 | 7.0% | 0 |
| tad.Dalek98 0.98 | 7.5 | 6.0% | 0 |
| gg.Squaraus 0.6 | 7.5 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 8.7 | 5.1% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 87.9 | 14 / 35 | 4778 |
| 2 | 1 | 68.1 | 87.3 | 13 / 35 | 5075 |
| 3 | 2 | 67.5 | 84.8 | 17 / 35 | 4514 |
| 4 | 1 | 69.3 | 89.8 | 19 / 35 | 5249 |
| 5 | 2 | 68.1 | 85.4 | 16 / 35 | 4962 |
| 6 | 1 | 68.6 | 86.7 | 17 / 35 | 5043 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 53 | 45% |
| kvk.HebusLeTroll 0.35 | 53 | 74% |
| jlm.javaDisturbance 0.59 | 29 | 79% |
| bigpete.Stewie 1.0 | 8 | 75% |
| yk.JahRoslav 1.1 | 3 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 1004. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 56 | 49% | 84 |
| kvk.HebusLeTroll 0.35 | 34 | 30% | 62 |
| jlm.javaDisturbance 0.59 | 18 | 16% | 43 |
| bigpete.Stewie 1.0 | 3 | 3% | 13 |
| pbg.NinjaX 1.2 | 2 | 2% | 2 |
| tad.Dalek98 0.98 | 1 | 1% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 2 |
| yk.JahRoslav 1.1 | 0 | 0% | 2 |

## Melee bench: F23

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.2 | 147 / 210 | 1.61 | 19.9% | 29647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 19.9% | 147 |
| pe.SandboxLump 1.52 | 2.0 | 17.1% | 42 |
| cre.Karolos 0.32 | 3.0 | 13.8% | 16 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.8% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.7 | 9.0% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.8 | 8.7% | 0 |
| sample.Walls 1.0 | 6.8 | 8.1% | 0 |
| cw.megas.Blade 0.8 | 7.3 | 7.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.4% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 93.7 | 23 / 35 | 4812 |
| 2 | 1 | 71.8 | 94.6 | 27 / 35 | 5279 |
| 3 | 1 | 70.5 | 90.8 | 22 / 35 | 4922 |
| 4 | 1 | 70.9 | 94.0 | 24 / 35 | 4945 |
| 5 | 1 | 70.9 | 90.8 | 24 / 35 | 4929 |
| 6 | 1 | 71.1 | 95.2 | 27 / 35 | 4760 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 101 | 81% |
| cre.Karolos 0.32 | 32 | 75% |
| stelo.AreaTargetingBot 1.1 | 27 | 93% |
| sample.Walls 1.0 | 9 | 100% |
| stelo.RamTrackSurfer 1.2 | 4 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 35 | 56% | 114 |
| cre.Karolos 0.32 | 14 | 22% | 42 |
| stelo.AreaTargetingBot 1.1 | 8 | 13% | 17 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 5% | 9 |
| stelo.RamTrackSurfer 1.2 | 1 | 2% | 15 |
| sample.Walls 1.0 | 1 | 2% | 6 |
| cw.megas.Blade 0.8 | 1 | 2% | 5 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |

## Melee bench: F24

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 78.7 | 79 / 210 | 2.91 | 15.7% | 21667 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 15.7% | 79 |
| rz.GlowBlowMelee 1.4 | 2.8 | 14.0% | 38 |
| florent.XSeries.X2 0.12 | 3.0 | 13.6% | 38 |
| davidalves.Phoenix 0.54 | 3.5 | 12.9% | 30 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.9% | 16 |
| oog.melee.Corsair 1.0 | 6.3 | 8.8% | 4 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.2% | 6 |
| lunchie.Lunchbox 0.93 | 8.2 | 5.8% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 5.2% | 0 |
| evd.X1 0.01 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 78.1 | 13 / 35 | 3364 |
| 2 | 1 | 63.6 | 76.8 | 14 / 35 | 3669 |
| 3 | 1 | 63.4 | 75.6 | 9 / 35 | 3847 |
| 4 | 1 | 67.0 | 87.6 | 20 / 35 | 3729 |
| 5 | 1 | 62.4 | 75.6 | 11 / 35 | 3371 |
| 6 | 1 | 64.3 | 78.7 | 12 / 35 | 3687 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 32 | 75% |
| davidalves.Phoenix 0.54 | 24 | 71% |
| florent.XSeries.X2 0.12 | 18 | 50% |
| pedersen.Ugluk 1.1.1 | 15 | 73% |
| stelo.SoJNanoMelee 1.1 | 14 | 86% |
| oog.melee.Corsair 1.0 | 5 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 739. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 36 | 27% | 52 |
| rz.GlowBlowMelee 1.4 | 33 | 25% | 53 |
| pedersen.Ugluk 1.1.1 | 28 | 21% | 39 |
| davidalves.Phoenix 0.54 | 23 | 18% | 42 |
| stelo.SoJNanoMelee 1.1 | 4 | 3% | 7 |
| oog.melee.Corsair 1.0 | 3 | 2% | 10 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 5 |
| as.FrankTheTank 1.3 | 1 | 1% | 2 |

## Melee bench: F25

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.7 | 148 / 210 | 2.10 | 18.9% | 25634 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 18.9% | 148 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 13.6% | 17 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.6% | 13 |
| jdw.Hurricane 1.4 | 3.8 | 11.2% | 17 |
| ds.Oo 2.2 | 5.2 | 9.7% | 6 |
| gre.svman4.Morfeas 1.4.1 | 5.8 | 8.9% | 4 |
| awesomeness.Elite 1.0 | 7.7 | 7.0% | 1 |
| gjr.Cephalosporin 0.1 | 7.8 | 7.2% | 4 |
| adt.Ar2 1.1 | 8.5 | 6.5% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 90.8 | 27 / 35 | 4145 |
| 2 | 1 | 69.7 | 91.1 | 25 / 35 | 4862 |
| 3 | 1 | 67.4 | 84.4 | 23 / 35 | 4114 |
| 4 | 1 | 68.0 | 86.0 | 23 / 35 | 4166 |
| 5 | 1 | 68.4 | 85.4 | 26 / 35 | 4260 |
| 6 | 1 | 68.3 | 88.6 | 24 / 35 | 4087 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 55 | 95% |
| voidious.micro.BlitzBat 1.05 | 46 | 98% |
| jdw.Hurricane 1.4 | 22 | 100% |
| ds.Oo 2.2 | 11 | 100% |
| gre.svman4.Morfeas 1.4.1 | 6 | 67% |
| awesomeness.Elite 1.0 | 6 | 100% |
| gjr.Cephalosporin 0.1 | 6 | 100% |
| adt.Ar2 1.1 | 2 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 567. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 18 | 29% | 58 |
| voidious.micro.BlitzBat 1.05 | 14 | 22% | 51 |
| jdw.Hurricane 1.4 | 12 | 19% | 29 |
| ds.Oo 2.2 | 6 | 10% | 25 |
| gre.svman4.Morfeas 1.4.1 | 5 | 8% | 21 |
| adt.Ar2 1.1 | 3 | 5% | 7 |
| amk.ChumbaMini 0.2 | 3 | 5% | 4 |
| awesomeness.Elite 1.0 | 1 | 2% | 9 |
| gjr.Cephalosporin 0.1 | 1 | 2% | 6 |

## Melee bench: F26

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 88.1 | 115 / 210 | 2.07 | 18.6% | 31871 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 18.6% | 115 |
| ak.Fermat 2.0 | 2.0 | 14.8% | 37 |
| shu.nitro.LENIN .T34 | 3.3 | 12.5% | 26 |
| lrem.Spectre 0.4.4 | 3.7 | 12.0% | 14 |
| js.PinBall 1.6 | 5.0 | 10.7% | 10 |
| jaybot.adv.bots.JayBot 2.0 | 6.5 | 9.1% | 5 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 9.0% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.9% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 85.7 | 15 / 35 | 4823 |
| 2 | 1 | 69.1 | 89.2 | 20 / 35 | 5456 |
| 3 | 1 | 67.7 | 84.4 | 19 / 35 | 5237 |
| 4 | 1 | 68.2 | 87.6 | 16 / 35 | 5272 |
| 5 | 1 | 69.6 | 89.8 | 22 / 35 | 5510 |
| 6 | 1 | 70.4 | 92.1 | 23 / 35 | 5573 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 52 | 73% |
| shu.nitro.LENIN .T34 | 37 | 70% |
| lrem.Spectre 0.4.4 | 30 | 87% |
| js.PinBall 1.6 | 12 | 67% |
| gh.mini.GrubbmOne 1.0 | 7 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 86% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 75% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 36 | 38% | 78 |
| shu.nitro.LENIN .T34 | 23 | 24% | 61 |
| lrem.Spectre 0.4.4 | 13 | 14% | 28 |
| js.PinBall 1.6 | 10 | 11% | 17 |
| jaybot.adv.bots.JayBot 2.0 | 7 | 7% | 12 |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 3% | 5 |
| gh.mini.GrubbmOne 1.0 | 2 | 2% | 7 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |

## Melee bench: F27

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.8 | 126 / 210 | 2.37 | 18.6% | 29521 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 18.6% | 126 |
| mk.Alpha 0.2.1 | 2.5 | 13.6% | 39 |
| sheldor.melee.nano.TestMelee 0.1 | 3.3 | 11.6% | 16 |
| wee.Gem 1.8.4 | 4.2 | 11.4% | 19 |
| EH.Eagle 1.0.6 | 4.3 | 10.9% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 8.9% | 1 |
| throxbot.ThroxBot 0.1 | 7.5 | 7.6% | 3 |
| joe.ADinosaur 1.0 | 7.8 | 7.6% | 0 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.7% | 0 |
| cs.Grudge 1.0 | 9.7 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 90.8 | 20 / 35 | 4287 |
| 2 | 1 | 67.9 | 88.6 | 23 / 35 | 4135 |
| 3 | 1 | 69.7 | 84.1 | 19 / 35 | 5653 |
| 4 | 1 | 67.8 | 76.5 | 20 / 35 | 5595 |
| 5 | 1 | 68.6 | 81.0 | 20 / 35 | 5714 |
| 6 | 1 | 67.8 | 87.6 | 24 / 35 | 4137 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 62 | 77% |
| wee.Gem 1.8.4 | 35 | 77% |
| sheldor.melee.nano.TestMelee 0.1 | 24 | 83% |
| EH.Eagle 1.0.6 | 21 | 100% |
| throxbot.ThroxBot 0.1 | 4 | 75% |
| techdude.kombat.FlamingKombat 1.5 | 3 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 781. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 25 | 30% | 78 |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 19% | 32 |
| wee.Gem 1.8.4 | 12 | 14% | 43 |
| throxbot.ThroxBot 0.1 | 9 | 11% | 12 |
| joe.ADinosaur 1.0 | 7 | 8% | 9 |
| EH.Eagle 1.0.6 | 6 | 7% | 21 |
| techdude.kombat.FlamingKombat 1.5 | 4 | 5% | 8 |
| caimano.Furia_Ceca 0.22 | 3 | 4% | 6 |
| cs.Grudge 1.0 | 2 | 2% | 1 |

## Melee bench: F28

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 92.6 | 150 / 210 | 1.67 | 19.4% | 25949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 19.4% | 150 |
| kid.test.NightFox .2 | 2.0 | 15.2% | 34 |
| uji.Antique 1.0 | 3.5 | 11.6% | 12 |
| qohnil.blot.BlotBot 3.61 | 3.8 | 10.7% | 8 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.1% | 3 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.2% | 2 |
| ahr.ice.Ice 1.0.2 | 6.7 | 7.3% | 0 |
| stelo.PianistNano 1.2 | 8.3 | 6.4% | 0 |
| matt.advanced.Katana 1.0 | 8.8 | 6.3% | 2 |
| stelo.Lifestealer 1.0 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 90.5 | 23 / 35 | 4291 |
| 2 | 1 | 70.6 | 96.5 | 28 / 35 | 4623 |
| 3 | 1 | 70.0 | 95.2 | 27 / 35 | 4459 |
| 4 | 1 | 67.7 | 88.6 | 21 / 35 | 4141 |
| 5 | 1 | 70.8 | 96.2 | 27 / 35 | 4673 |
| 6 | 1 | 67.3 | 88.6 | 24 / 35 | 3762 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 105 | 79% |
| uji.Antique 1.0 | 34 | 94% |
| qohnil.blot.BlotBot 3.61 | 18 | 89% |
| pfvicm.Sobieski 7.2.3b | 8 | 75% |
| amk.ChumbaWumba 0.3 | 6 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| ahr.ice.Ice 1.0.2 | 2 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 32 | 52% | 103 |
| pfvicm.Sobieski 7.2.3b | 9 | 15% | 20 |
| uji.Antique 1.0 | 8 | 13% | 40 |
| qohnil.blot.BlotBot 3.61 | 5 | 8% | 23 |
| amk.ChumbaWumba 0.3 | 3 | 5% | 8 |
| ahr.ice.Ice 1.0.2 | 2 | 3% | 7 |
| matt.advanced.Katana 1.0 | 1 | 2% | 4 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.0 | 103 / 210 | 2.44 | 18.0% | 27583 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 18.0% | 103 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.0% | 48 |
| deewiant.Anomaly 0.2 | 2.5 | 14.9% | 43 |
| myl.micro.Troodon 1.10 | 4.2 | 12.4% | 7 |
| jok.PheonixM 0.1.2 | 4.8 | 10.1% | 7 |
| ph.melee.ArcherME 0.3 | 6.0 | 7.8% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.5 | 6.5% | 0 |
| DBall.Anarchy 0.1 | 7.7 | 6.5% | 0 |
| jangs.ns51 1.0 | 9.0 | 4.7% | 0 |
| ap.Frederick 1.1 | 9.8 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 86.7 | 19 / 35 | 5149 |
| 2 | 1 | 68.0 | 85.1 | 17 / 35 | 4745 |
| 3 | 1 | 67.2 | 82.5 | 18 / 35 | 4397 |
| 4 | 1 | 67.0 | 81.9 | 17 / 35 | 4556 |
| 5 | 1 | 67.0 | 83.2 | 14 / 35 | 4333 |
| 6 | 1 | 68.4 | 84.4 | 18 / 35 | 4403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 53 | 74% |
| zyx.mega.YersiniaPestis 3.1 | 44 | 55% |
| myl.micro.Troodon 1.10 | 23 | 100% |
| jok.PheonixM 0.1.2 | 8 | 88% |
| DBall.Anarchy 0.1 | 6 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| ap.Frederick 1.1 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 36 | 34% | 70 |
| zyx.mega.YersiniaPestis 3.1 | 35 | 33% | 65 |
| myl.micro.Troodon 1.10 | 17 | 16% | 38 |
| jok.PheonixM 0.1.2 | 7 | 7% | 16 |
| ph.melee.ArcherME 0.3 | 6 | 6% | 7 |
| fullsail.TimbotNoPrediction 1.0 | 4 | 4% | 5 |
| DBall.Anarchy 0.1 | 1 | 1% | 7 |
| jangs.ns51 1.0 | 1 | 1% | 2 |

## Melee bench: F30

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 72.9 | 46 / 210 | 3.44 | 14.4% | 22478 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.0 | 14.2% | 46 |
| hadur117.mini.DeiseWARM16 0.4 | 2.0 | 14.4% | 46 |
| darkcanuck.B26354 1.06 | 3.0 | 13.7% | 46 |
| oog.melee.Capulet 1.2 | 3.5 | 13.4% | 38 |
| stelo.PastFuture 2.3.2 | 4.5 | 12.9% | 25 |
| intruder.PrairieWolf 2.61 | 6.2 | 8.3% | 6 |
| ntc.Opposite 1.5 | 7.7 | 7.4% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 6.8% | 2 |
| tripphippy.Alice 1.1 | 8.3 | 6.5% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.8 | 68.3 | 6 / 35 | 3421 |
| 2 | 2 | 62.9 | 75.9 | 7 / 35 | 3684 |
| 3 | 1 | 62.9 | 76.5 | 9 / 35 | 3704 |
| 4 | 1 | 62.8 | 72.7 | 8 / 35 | 4108 |
| 5 | 3 | 61.4 | 72.1 | 8 / 35 | 3575 |
| 6 | 1 | 62.1 | 71.7 | 8 / 35 | 3986 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 25 | 44% |
| darkcanuck.B26354 1.06 | 25 | 48% |
| oog.melee.Capulet 1.2 | 18 | 61% |
| stelo.PastFuture 2.3.2 | 17 | 47% |
| tripphippy.Alice 1.1 | 3 | 33% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |
| intruder.PrairieWolf 2.61 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 819. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 44 | 27% | 53 |
| catcat20.Matcha 0.006 | 34 | 21% | 50 |
| darkcanuck.B26354 1.06 | 30 | 18% | 40 |
| oog.melee.Capulet 1.2 | 22 | 13% | 30 |
| tripphippy.Alice 1.1 | 12 | 7% | 13 |
| fowl3628800.LightningBolt 2.6.0 | 8 | 5% | 9 |
| ntc.Opposite 1.5 | 7 | 4% | 7 |
| intruder.PrairieWolf 2.61 | 5 | 3% | 5 |
| GarmBox.Anger 1.0 | 2 | 1% | 2 |

## Melee bench: F31

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 72.9 | 48 / 210 | 3.44 | 14.2% | 19771 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.1% | 94 |
| gh.mini.Griezel 0.2 | 2.5 | 13.6% | 50 |
| hadur117.mini.DeiseWARM16 0.4 | 2.5 | 14.2% | 48 |
| spinnercat.micro.Tyger 0.1 | 4.2 | 11.9% | 5 |
| d414.nano.Quantum 1.0.0 | 4.8 | 10.9% | 7 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.2% | 5 |
| timmit.nano.TimDog 0.33 | 7.3 | 6.6% | 2 |
| fm.mammillarias 1.3 | 7.7 | 6.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.7% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 69.2 | 9 / 35 | 3341 |
| 2 | 2 | 61.9 | 75.2 | 8 / 35 | 3199 |
| 3 | 3 | 60.0 | 68.3 | 6 / 35 | 3213 |
| 4 | 3 | 61.1 | 69.5 | 8 / 35 | 3322 |
| 5 | 2 | 63.6 | 79.7 | 7 / 35 | 3438 |
| 6 | 2 | 62.5 | 75.2 | 10 / 35 | 3258 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 49 | 53% |
| gh.mini.Griezel 0.2 | 21 | 24% |
| spinnercat.micro.Tyger 0.1 | 13 | 92% |
| d414.nano.Quantum 1.0.0 | 5 | 80% |
| gh.nano.Grofvuil 0.2 | 3 | 33% |

Hadur died in 163 of 210 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 65 | 40% | 88 |
| gh.mini.Griezel 0.2 | 41 | 25% | 49 |
| spinnercat.micro.Tyger 0.1 | 24 | 15% | 35 |
| d414.nano.Quantum 1.0.0 | 12 | 7% | 16 |
| fm.mammillarias 1.3 | 9 | 6% | 9 |
| gh.nano.Grofvuil 0.2 | 7 | 4% | 8 |
| timmit.nano.TimDog 0.33 | 4 | 2% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 91.8 | 140 / 210 | 1.74 | 19.4% | 29268 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 19.4% | 140 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.8% | 47 |
| apc.botM 3.0 | 3.2 | 11.7% | 15 |
| lxx.ConceptA 0.8 | 4.0 | 10.4% | 2 |
| vjik.UnViolation 1.1 | 5.5 | 9.3% | 2 |
| bayen.UbaMicro 1.4 | 5.8 | 8.7% | 1 |
| panzer.Panzer 0.2 | 6.8 | 7.4% | 0 |
| yk.JahMicro 1.0 | 8.2 | 6.5% | 1 |
| conscience.Electron 1.3g | 9.2 | 6.1% | 0 |
| donjezza.Jezza 1.0 | 9.3 | 5.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 89.5 | 21 / 35 | 4589 |
| 2 | 1 | 69.8 | 95.2 | 24 / 35 | 4869 |
| 3 | 1 | 68.8 | 90.5 | 23 / 35 | 4971 |
| 4 | 1 | 68.1 | 90.2 | 21 / 35 | 4742 |
| 5 | 1 | 69.2 | 92.1 | 24 / 35 | 4978 |
| 6 | 1 | 70.0 | 93.3 | 27 / 35 | 5119 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 84 | 63% |
| apc.botM 3.0 | 35 | 83% |
| lxx.ConceptA 0.8 | 33 | 100% |
| vjik.UnViolation 1.1 | 13 | 100% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| yk.JahMicro 1.0 | 1 | 100% |
| panzer.Panzer 0.2 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 38 | 54% | 93 |
| apc.botM 3.0 | 13 | 18% | 45 |
| lxx.ConceptA 0.8 | 9 | 13% | 26 |
| bayen.UbaMicro 1.4 | 5 | 7% | 12 |
| vjik.UnViolation 1.1 | 4 | 6% | 21 |
| yk.JahMicro 1.0 | 2 | 3% | 5 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |
| panzer.Panzer 0.2 | 0 | 0% | 3 |
| conscience.Electron 1.3g | 0 | 0% | 1 |

## Melee bench: F33

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.8 | 132 / 210 | 2.01 | 19.3% | 30340 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 19.3% | 132 |
| maribo.Quester 0.3 | 2.0 | 15.8% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.6% | 18 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 10.9% | 7 |
| labg.Cataclysm 2.05 | 4.3 | 10.5% | 9 |
| baal.nano.N 1.42 | 6.3 | 8.5% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 7.6% | 1 |
| zyx.micro.Ant 1.1 | 8.2 | 5.7% | 0 |
| sanja.First 0.1 | 9.3 | 4.7% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 78.4 | 17 / 35 | 4612 |
| 2 | 1 | 69.7 | 90.2 | 20 / 35 | 5208 |
| 3 | 1 | 69.7 | 90.2 | 21 / 35 | 5010 |
| 4 | 1 | 70.3 | 90.8 | 24 / 35 | 5032 |
| 5 | 1 | 70.1 | 90.5 | 23 / 35 | 5534 |
| 6 | 1 | 70.6 | 92.7 | 27 / 35 | 4944 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 55 | 69% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 45 | 84% |
| gre.svman4.Leonidas 1.3.2 | 31 | 100% |
| labg.Cataclysm 2.05 | 15 | 93% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 100% |
| sanja.First 0.1 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 38 | 49% | 86 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 26% | 54 |
| gre.svman4.Leonidas 1.3.2 | 9 | 12% | 31 |
| baal.nano.N 1.42 | 5 | 6% | 10 |
| labg.Cataclysm 2.05 | 3 | 4% | 17 |
| zyx.micro.Ant 1.1 | 2 | 3% | 2 |
| sanja.First 0.1 | 1 | 1% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 0 | 0% | 7 |

## Melee bench: F34

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 85.3 | 79 / 210 | 2.32 | 17.5% | 28822 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.5 | 17.5% | 79 |
| stelo.Spread 0.9 | 2.2 | 16.5% | 74 |
| kid.Gladiator .7.2 | 2.3 | 16.4% | 41 |
| jcs.Seth 1.8 | 4.3 | 10.8% | 8 |
| tcf.Reach 3 | 4.7 | 10.5% | 4 |
| cli.Dancer 1.1 | 6.0 | 9.3% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 4 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.6% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 84.8 | 16 / 35 | 4685 |
| 2 | 1 | 68.6 | 87.9 | 15 / 35 | 5010 |
| 3 | 2 | 67.2 | 84.8 | 11 / 35 | 4552 |
| 4 | 1 | 67.8 | 86.7 | 13 / 35 | 4743 |
| 5 | 3 | 65.5 | 79.0 | 9 / 35 | 4755 |
| 6 | 1 | 68.7 | 88.9 | 15 / 35 | 5077 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 81 | 46% |
| kid.Gladiator .7.2 | 35 | 49% |
| jcs.Seth 1.8 | 17 | 76% |
| tcf.Reach 3 | 9 | 89% |
| ratosh.Wesco 1.4 | 4 | 50% |
| cli.Dancer 1.1 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 1097. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 72 | 55% | 108 |
| kid.Gladiator .7.2 | 38 | 29% | 53 |
| tcf.Reach 3 | 8 | 6% | 17 |
| jcs.Seth 1.8 | 5 | 4% | 20 |
| ratosh.Wesco 1.4 | 5 | 4% | 7 |
| cli.Dancer 1.1 | 3 | 2% | 5 |

## Melee bench: F35

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 83.1 | 49 / 210 | 2.52 | 15.8% | 21732 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.3% | 135 |
| hadur117.mini.DeiseWARM16 0.4 | 2.0 | 15.8% | 49 |
| gh.mini.Gruwel 0.9 | 3.2 | 12.9% | 16 |
| rz.HawkOnFire 0.1 | 4.3 | 11.4% | 3 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.5 | 11.9% | 7 |
| myl.nano.KomoriNinja 1.1 | 6.5 | 7.0% | 0 |
| wit.Chuliath 1.0 | 6.8 | 6.6% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 5.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.8% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 85.4 | 9 / 35 | 3627 |
| 2 | 2 | 65.7 | 86.7 | 9 / 35 | 3549 |
| 3 | 2 | 64.8 | 83.2 | 9 / 35 | 3738 |
| 4 | 2 | 65.0 | 82.5 | 10 / 35 | 3711 |
| 5 | 2 | 63.7 | 82.2 | 6 / 35 | 3218 |
| 6 | 2 | 63.8 | 78.7 | 6 / 35 | 3889 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 100 | 19% |
| gh.mini.Gruwel 0.9 | 19 | 68% |
| dmh.robocode.robot.BlackDeath 9.2 | 16 | 88% |
| rz.HawkOnFire 0.1 | 4 | 75% |

Hadur died in 161 of 210 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 106 | 66% | 125 |
| gh.mini.Gruwel 0.9 | 23 | 14% | 36 |
| rz.HawkOnFire 0.1 | 11 | 7% | 15 |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 6% | 21 |
| myl.nano.KomoriNinja 1.1 | 4 | 2% | 4 |
| wit.Chuliath 1.0 | 3 | 2% | 4 |
| stelo.MyAgileRobot 0.2 | 3 | 2% | 4 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 95.9 | 183 / 210 | 1.37 | 21.7% | 33144 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 21.7% | 183 |
| bzdp.Pansy 2.1 | 2.5 | 12.1% | 5 |
| alpha.RainingFire 1.0 | 3.7 | 11.2% | 8 |
| mz.Cork 0.1 | 4.0 | 10.9% | 2 |
| bvh.micro.Freya 0.3 | 4.7 | 10.5% | 4 |
| bvh.mini.Fenrir 0.39 | 5.8 | 10.0% | 2 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.3% | 6 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.3% | 0 |
| dl.BetterWalls 1.0 | 8.7 | 5.2% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 92.1 | 31 / 35 | 5513 |
| 2 | 1 | 71.9 | 96.2 | 30 / 35 | 5406 |
| 3 | 1 | 73.0 | 98.4 | 34 / 35 | 5549 |
| 4 | 1 | 71.7 | 95.9 | 28 / 35 | 5455 |
| 5 | 1 | 72.4 | 97.8 | 32 / 35 | 5481 |
| 6 | 1 | 72.1 | 95.2 | 28 / 35 | 5740 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 49 | 98% |
| mz.Cork 0.1 | 43 | 100% |
| bvh.micro.Freya 0.3 | 25 | 96% |
| alpha.RainingFire 1.0 | 23 | 87% |
| bvh.mini.Fenrir 0.39 | 22 | 95% |
| m3thos.Eva02 0.7.1 | 12 | 92% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| dl.BetterWalls 1.0 | 5 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 27 of 210 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.mini.Fenrir 0.39 | 9 | 33% | 18 |
| bzdp.Pansy 2.1 | 5 | 19% | 65 |
| bvh.micro.Freya 0.3 | 5 | 19% | 32 |
| alpha.RainingFire 1.0 | 4 | 15% | 25 |
| mz.Cork 0.1 | 2 | 7% | 37 |
| m3thos.Eva02 0.7.1 | 1 | 4% | 12 |
| squidM.TentalceMeleeNano 1.1 | 1 | 4% | 2 |
| dl.BetterWalls 1.0 | 0 | 0% | 12 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 6 |

## Melee bench: F37

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 93.3 | 179 / 210 | 1.60 | 20.3% | 34224 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 20.3% | 179 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.5 | 11.2% | 1 |
| germ.TheMind .2 | 2.8 | 10.7% | 9 |
| EBBU.Sim2 1.02 | 5.5 | 8.8% | 2 |
| stelo.UntouchableNano 1.3 | 5.5 | 8.8% | 8 |
| agrach.Dalek 1.0 | 6.5 | 8.5% | 6 |
| lmk.ACPFinal 0.1 | 6.8 | 8.4% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 7.7 | 7.8% | 0 |
| skm.Ryubot 1.0 | 8.2 | 7.7% | 1 |
| mb.Beast 0.1 | 8.5 | 7.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 91.4 | 29 / 35 | 5397 |
| 2 | 1 | 70.5 | 94.9 | 32 / 35 | 5953 |
| 3 | 1 | 68.9 | 91.4 | 29 / 35 | 5503 |
| 4 | 1 | 71.0 | 97.8 | 33 / 35 | 5764 |
| 5 | 1 | 69.9 | 94.0 | 29 / 35 | 5882 |
| 6 | 1 | 69.3 | 90.5 | 27 / 35 | 5725 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 45 | 93% |
| stelo.UntouchableNano 1.3 | 29 | 86% |
| mb.Beast 0.1 | 23 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 23 | 100% |
| EBBU.Sim2 1.02 | 21 | 100% |
| agrach.Dalek 1.0 | 18 | 100% |
| skm.Ryubot 1.0 | 18 | 100% |
| lmk.ACPFinal 0.1 | 8 | 88% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 33 of 210 rounds, at a mean tick of 461. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.UntouchableNano 1.3 | 8 | 24% | 22 |
| germ.TheMind .2 | 6 | 18% | 43 |
| lmk.ACPFinal 0.1 | 6 | 18% | 17 |
| com.syncleus.robocode.Dreadnaught 0.1 | 5 | 15% | 35 |
| EBBU.Sim2 1.02 | 4 | 12% | 20 |
| agrach.Dalek 1.0 | 1 | 3% | 33 |
| mb.Beast 0.1 | 1 | 3% | 23 |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 3% | 9 |
| skm.Ryubot 1.0 | 0 | 0% | 6 |
1 death(s) with no robot to name.

## Melee bench: F38

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 80.8 | 92 / 210 | 2.72 | 16.4% | 24290 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.3 | 16.4% | 92 |
| justin.Mallais 14.0 | 1.7 | 16.4% | 75 |
| bvh.mini.Freya 0.55 | 3.5 | 12.6% | 14 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.7 | 11.1% | 6 |
| cs.Wren 1.0 | 5.0 | 11.0% | 9 |
| bts.mega.Gnarly 1.4 | 5.0 | 10.3% | 12 |
| kdf.KoulDestroyer 1.0 | 6.8 | 8.3% | 0 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.0% | 1 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.3% | 1 |
| bzdp.BoxCar 2.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 81.9 | 16 / 35 | 4068 |
| 2 | 1 | 63.7 | 75.9 | 15 / 35 | 3841 |
| 3 | 2 | 63.5 | 76.2 | 8 / 35 | 4287 |
| 4 | 2 | 65.8 | 82.9 | 17 / 35 | 3692 |
| 5 | 1 | 67.3 | 86.7 | 19 / 35 | 4217 |
| 6 | 1 | 66.4 | 81.6 | 17 / 35 | 4185 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 52 | 62% |
| bvh.mini.Freya 0.55 | 18 | 89% |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 88% |
| bts.mega.Gnarly 1.4 | 13 | 85% |
| cs.Wren 1.0 | 13 | 92% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 100% |
| kdf.KoulDestroyer 1.0 | 3 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 0% |

Hadur died in 119 of 210 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 47 | 39% | 83 |
| cs.Wren 1.0 | 17 | 14% | 27 |
| bts.mega.Gnarly 1.4 | 16 | 13% | 29 |
| bvh.mini.Freya 0.55 | 16 | 13% | 27 |
| kdf.KoulDestroyer 1.0 | 10 | 8% | 10 |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 7% | 24 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 3% | 7 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 1 |
| bzdp.BoxCar 2.0 | 0 | 0% | 2 |

## Melee bench: F39

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 85.8 | 113 / 210 | 2.28 | 18.2% | 29288 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 18.2% | 113 |
| bvh.fry.Freya 0.82 | 2.0 | 14.9% | 17 |
| catcat20.Lambda 0.024 | 3.5 | 12.0% | 28 |
| az.Ololobot 0.2.4 | 3.5 | 12.3% | 44 |
| stelo.SoRobotNanoMelee 1.2 | 5.3 | 9.3% | 7 |
| apollokidd.ApolloKidd 0.9 | 6.3 | 8.2% | 1 |
| gimp.GimpBot 0.1 | 6.8 | 8.1% | 0 |
| winamp32.micro.MicroMacro 1.0 | 7.5 | 7.6% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.3% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 86.7 | 18 / 35 | 4997 |
| 2 | 1 | 67.2 | 85.4 | 14 / 35 | 4933 |
| 3 | 1 | 66.8 | 84.4 | 17 / 35 | 4621 |
| 4 | 1 | 67.0 | 84.1 | 22 / 35 | 4433 |
| 5 | 1 | 69.9 | 92.4 | 22 / 35 | 5530 |
| 6 | 1 | 66.7 | 81.9 | 20 / 35 | 4774 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 45 | 53% |
| catcat20.Lambda 0.024 | 38 | 79% |
| bvh.fry.Freya 0.82 | 37 | 89% |
| stelo.SoRobotNanoMelee 1.2 | 20 | 95% |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 100% |
| gimp.GimpBot 0.1 | 2 | 100% |
| winamp32.micro.MicroMacro 1.0 | 2 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 1073. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 29 | 30% | 58 |
| az.Ololobot 0.2.4 | 29 | 30% | 56 |
| catcat20.Lambda 0.024 | 17 | 17% | 46 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 11% | 18 |
| apollokidd.ApolloKidd 0.9 | 4 | 4% | 9 |
| gimp.GimpBot 0.1 | 3 | 3% | 11 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 6 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |

## Melee bench: F40

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.5 | 119 / 210 | 2.21 | 18.4% | 28119 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 18.4% | 119 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 14.4% | 36 |
| kano.gamma.KanoGamma 1.8 | 2.8 | 12.9% | 20 |
| mz.AntiGrav 1.0 | 4.3 | 10.8% | 8 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.3% | 13 |
| alpha.BlackIce 1.0 | 6.3 | 9.2% | 4 |
| stelo.Randomness 1.0 | 6.5 | 8.6% | 10 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.4% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 5.1% | 0 |
| sample.Corners 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 81.9 | 14 / 35 | 4551 |
| 2 | 1 | 68.4 | 88.3 | 22 / 35 | 4526 |
| 3 | 1 | 67.1 | 82.5 | 17 / 35 | 4717 |
| 4 | 1 | 69.2 | 89.5 | 22 / 35 | 4926 |
| 5 | 1 | 70.3 | 92.1 | 27 / 35 | 4917 |
| 6 | 1 | 66.9 | 84.8 | 17 / 35 | 4482 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 49 | 71% |
| kano.gamma.KanoGamma 1.8 | 38 | 79% |
| mz.AntiGrav 1.0 | 19 | 100% |
| Polkwane.SmashMelee 1.0 | 17 | 94% |
| stelo.Randomness 1.0 | 13 | 85% |
| alpha.BlackIce 1.0 | 5 | 100% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 33 | 36% | 64 |
| kano.gamma.KanoGamma 1.8 | 19 | 21% | 51 |
| mz.AntiGrav 1.0 | 16 | 18% | 40 |
| Polkwane.SmashMelee 1.0 | 11 | 12% | 19 |
| stelo.Randomness 1.0 | 7 | 8% | 18 |
| alpha.BlackIce 1.0 | 3 | 3% | 8 |
| amk.superstrike.SuperStrike 0.3 | 2 | 2% | 5 |
| sample.Corners 1.0 | 0 | 0% | 3 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 1 |

## Melee bench: F41

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 85.5 | 94 / 210 | 2.30 | 17.3% | 24002 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 17.3% | 94 |
| eem.EvBotNG v12.8 | 2.0 | 16.2% | 81 |
| ary.Swarm 1.1 | 3.3 | 13.2% | 9 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.2% | 12 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.9% | 10 |
| shrub.Silver v048 | 6.5 | 8.5% | 2 |
| zyx.nano.Ant 1.1 | 6.7 | 7.8% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 5.9% | 2 |
| stelo.Mirror 1.1 | 8.7 | 5.4% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 83.8 | 15 / 35 | 3625 |
| 2 | 1 | 67.3 | 86.3 | 15 / 35 | 4090 |
| 3 | 1 | 66.6 | 84.1 | 17 / 35 | 3976 |
| 4 | 1 | 66.9 | 84.4 | 15 / 35 | 4165 |
| 5 | 1 | 66.7 | 85.4 | 14 / 35 | 3921 |
| 6 | 1 | 67.9 | 88.9 | 18 / 35 | 4225 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 77 | 43% |
| lessonz.robocode.Oz 0.5.0 | 27 | 89% |
| ary.Swarm 1.1 | 25 | 80% |
| simonton.nano.MeleeSeed 1.8 | 15 | 93% |
| shrub.Silver v048 | 2 | 50% |
| jsal.Jsalbot 1.0 | 2 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 1005. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 60 | 52% | 94 |
| ary.Swarm 1.1 | 23 | 20% | 43 |
| lessonz.robocode.Oz 0.5.0 | 14 | 12% | 31 |
| simonton.nano.MeleeSeed 1.8 | 7 | 6% | 21 |
| shrub.Silver v048 | 5 | 4% | 8 |
| zyx.nano.Ant 1.1 | 4 | 3% | 6 |
| jsal.Jsalbot 1.0 | 2 | 2% | 4 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
| stelo.Mirror 1.1 | 0 | 0% | 1 |

## Melee bench: F42

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.0 | 119 / 210 | 2.08 | 18.7% | 31139 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 18.7% | 119 |
| wompi.Wallaby 5.1 | 2.2 | 15.4% | 45 |
| maribo.mini.MiniQuester 0.1 | 3.0 | 13.5% | 18 |
| ara.Shera 0.88 | 3.8 | 13.1% | 22 |
| amz.NanoClone 1.41 | 5.0 | 9.4% | 3 |
| maribo.IotaCT 1.1 | 6.3 | 7.1% | 0 |
| dsw.StaticD 1.0 | 6.7 | 7.0% | 2 |
| stelo.MirrorMicro 1.0 | 8.3 | 5.5% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 91.4 | 24 / 35 | 5295 |
| 2 | 1 | 68.1 | 86.7 | 17 / 35 | 5046 |
| 3 | 1 | 68.3 | 87.9 | 20 / 35 | 4944 |
| 4 | 1 | 67.9 | 86.3 | 16 / 35 | 5063 |
| 5 | 1 | 68.9 | 88.3 | 21 / 35 | 5218 |
| 6 | 1 | 68.9 | 87.3 | 21 / 35 | 5573 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 57 | 79% |
| maribo.mini.MiniQuester 0.1 | 39 | 82% |
| ara.Shera 0.88 | 35 | 83% |
| dsw.StaticD 1.0 | 10 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 31 | 33% | 79 |
| maribo.mini.MiniQuester 0.1 | 28 | 30% | 58 |
| ara.Shera 0.88 | 26 | 28% | 52 |
| amz.NanoClone 1.41 | 5 | 5% | 6 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 2 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 2 |
| maribo.IotaCT 1.1 | 1 | 1% | 2 |
| dsw.StaticD 1.0 | 0 | 0% | 9 |

## Melee bench: F43

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 74.3 | 34 / 210 | 3.31 | 14.2% | 20812 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.1% | 154 |
| hadur117.mini.DeiseWARM16 0.4 | 2.0 | 14.2% | 34 |
| dummy.micro.Sparrow 2.5 | 3.7 | 12.0% | 4 |
| brainfade.melee.Dusk 0.44 | 4.0 | 11.8% | 17 |
| wcsv.melee.EngineerMelee 0.1 | 4.3 | 11.6% | 1 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.6% | 2 |
| mz.NanoGod 2.02 | 7.3 | 7.9% | 0 |
| jab.DiamondStealer 5 | 7.7 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.7% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 74.6 | 10 / 35 | 3382 |
| 2 | 2 | 65.4 | 78.7 | 8 / 35 | 3962 |
| 3 | 2 | 63.3 | 75.2 | 3 / 35 | 3272 |
| 4 | 2 | 61.9 | 70.2 | 4 / 35 | 3582 |
| 5 | 2 | 62.3 | 73.3 | 6 / 35 | 3238 |
| 6 | 2 | 62.5 | 74.0 | 3 / 35 | 3376 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 75 | 21% |
| brainfade.melee.Dusk 0.44 | 8 | 88% |
| dummy.micro.Sparrow 2.5 | 5 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 75% |
| Krabb.akim2.Akim2 1.1b | 2 | 50% |
| mz.NanoGod 2.02 | 2 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 866. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 95 | 53% | 110 |
| dummy.micro.Sparrow 2.5 | 23 | 13% | 29 |
| wcsv.melee.EngineerMelee 0.1 | 22 | 12% | 26 |
| brainfade.melee.Dusk 0.44 | 19 | 11% | 24 |
| mz.NanoGod 2.02 | 6 | 3% | 8 |
| Krabb.akim2.Akim2 1.1b | 6 | 3% | 7 |
| jab.DiamondStealer 5 | 5 | 3% | 6 |
2 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 91.3 | 128 / 210 | 1.78 | 19.5% | 30647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 19.5% | 128 |
| stelo.Liblix 0.3.1 | 2.2 | 15.8% | 52 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.0% | 30 |
| wompi.Quokka 1.6 | 4.3 | 10.4% | 0 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.2 | 8.9% | 0 |
| jwirde.Gort 2.0 | 6.0 | 8.4% | 1 |
| disan.Chair 2.2.0 | 6.8 | 7.7% | 1 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.9% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.5% | 1 |
| sample.Crazy 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 89.8 | 21 / 35 | 5240 |
| 2 | 1 | 68.2 | 89.2 | 15 / 35 | 4669 |
| 3 | 1 | 69.7 | 91.1 | 22 / 35 | 4978 |
| 4 | 1 | 70.2 | 93.0 | 24 / 35 | 4925 |
| 5 | 1 | 71.2 | 92.4 | 23 / 35 | 5882 |
| 6 | 1 | 69.7 | 92.4 | 23 / 35 | 4953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 89 | 72% |
| tzu.TheArtOfWar 1.2 | 52 | 71% |
| disan.Chair 2.2.0 | 9 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 100% |
| wompi.Quokka 1.6 | 7 | 100% |
| jwirde.Gort 2.0 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 1006. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 44 | 52% | 109 |
| tzu.TheArtOfWar 1.2 | 30 | 35% | 65 |
| wompi.Quokka 1.6 | 3 | 4% | 11 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 4% | 11 |
| disan.Chair 2.2.0 | 1 | 1% | 5 |
| jwirde.Gort 2.0 | 1 | 1% | 5 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 3 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |
3 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.7 | 84 / 210 | 2.01 | 19.9% | 36225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM16 0.4 | 1.0 | 19.9% | 84 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.4% | 109 |
| jje.BagPuss 1.2 | 3.3 | 11.6% | 4 |
| myl.nano.Graviton 1.10 | 4.2 | 10.3% | 5 |
| sul.Lunar 1.1 | 4.5 | 10.3% | 3 |
| fm.claire 1.7 | 6.3 | 8.7% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 8.4% | 4 |
| hvilela.HVilela 0.9 | 7.8 | 7.5% | 0 |
| wit.Deep7 2.0 | 9.2 | 5.4% | 1 |
| abud.ThirdRobo 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 91.7 | 19 / 35 | 6375 |
| 2 | 1 | 70.4 | 90.2 | 16 / 35 | 6047 |
| 3 | 1 | 69.7 | 90.2 | 12 / 35 | 5923 |
| 4 | 1 | 69.6 | 86.3 | 15 / 35 | 6161 |
| 5 | 1 | 68.2 | 84.1 | 10 / 35 | 5927 |
| 6 | 1 | 69.2 | 89.8 | 12 / 35 | 5792 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 120 | 29% |
| sul.Lunar 1.1 | 14 | 100% |
| myl.nano.Graviton 1.10 | 13 | 92% |
| jje.BagPuss 1.2 | 9 | 89% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 89% |
| wit.Deep7 2.0 | 5 | 100% |
| fm.claire 1.7 | 2 | 50% |

Hadur died in 126 of 210 rounds, at a mean tick of 2315. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 88 | 70% | 0 |
| myl.nano.Graviton 1.10 | 11 | 9% | 36 |
| jje.BagPuss 1.2 | 8 | 6% | 59 |
| sul.Lunar 1.1 | 7 | 6% | 54 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 4% | 24 |
| fm.claire 1.7 | 4 | 3% | 16 |
| wit.Deep7 2.0 | 2 | 2% | 12 |
| hvilela.HVilela 0.9 | 1 | 1% | 5 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |

## Melee bench: F46

hadur117.mini.DeiseWARM16 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 83.1 | 61 / 210 | 2.52 | 16.2% | 24378 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 16.8% | 59 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.8% | 76 |
| hadur117.mini.DeiseWARM16 0.4 | 2.5 | 16.2% | 61 |
| cx.Princess 1.0 | 4.3 | 10.3% | 8 |
| mz.MicroSheep 1.0 | 4.7 | 10.1% | 4 |
| sadoner.killer 0.2 | 6.2 | 8.5% | 0 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.4% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.6% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.4 | 82.9 | 12 / 35 | 3956 |
| 2 | 3 | 63.6 | 79.4 | 8 / 35 | 3536 |
| 3 | 3 | 64.2 | 80.0 | 7 / 35 | 4099 |
| 4 | 2 | 66.0 | 83.8 | 8 / 35 | 4365 |
| 5 | 2 | 66.3 | 85.7 | 12 / 35 | 4131 |
| 6 | 2 | 67.3 | 86.7 | 14 / 35 | 4291 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 64 | 61% |
| rsalesc.melee.Medina 0.4.5 | 44 | 25% |
| cx.Princess 1.0 | 8 | 63% |
| mz.MicroSheep 1.0 | 6 | 67% |
| arthord.NanoSatanMelee Beta | 2 | 50% |
| kurios.DOSexe .9a | 1 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 1008. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 59 | 39% | 92 |
| rsalesc.melee.Medina 0.4.5 | 56 | 37% | 71 |
| mz.MicroSheep 1.0 | 11 | 7% | 14 |
| cx.Princess 1.0 | 9 | 6% | 15 |
| sadoner.killer 0.2 | 7 | 5% | 7 |
| arthord.NanoSatanMelee Beta | 6 | 4% | 7 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
| kurios.DOSexe .9a | 0 | 0% | 1 |

