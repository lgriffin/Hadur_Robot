# Bench suite: suite.txt

## Melee bench: F01

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 71.6 | 31 / 280 | 3.56 | 14.7% | 38286 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.9% | 197 |
| hadur117.micro.SaorS2 0.1 | 2.0 | 14.7% | 31 |
| sgp.JollyNinja 3.53 | 3.4 | 11.9% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.9 | 11.6% | 5 |
| mz.MicroGodMelee 1 | 5.0 | 10.3% | 17 |
| lorneswork.Predator 1.0 | 5.8 | 9.6% | 4 |
| adt.Ar2 1.0 | 7.0 | 7.3% | 2 |
| skm.butterfly 1.0 | 8.5 | 5.6% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.5 | 5.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 79.4 | 1 / 35 | 4682 |
| 2 | 2 | 63.4 | 73.3 | 1 / 35 | 4857 |
| 3 | 2 | 62.0 | 67.6 | 4 / 35 | 4829 |
| 4 | 2 | 61.9 | 69.2 | 5 / 35 | 4512 |
| 5 | 2 | 60.8 | 67.3 | 1 / 35 | 4554 |
| 6 | 2 | 64.4 | 75.2 | 7 / 35 | 5117 |
| 7 | 2 | 63.2 | 69.2 | 7 / 35 | 5216 |
| 8 | 2 | 62.9 | 71.4 | 5 / 35 | 4519 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 109 | 3% |
| sgp.JollyNinja 3.53 | 14 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 100% |
| mz.MicroGodMelee 1 | 9 | 11% |
| lorneswork.Predator 1.0 | 3 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 100% |

Hadur died in 250 of 280 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 149 | 60% | 155 |
| mz.MicroGodMelee 1 | 28 | 11% | 32 |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 9% | 28 |
| sgp.JollyNinja 3.53 | 21 | 8% | 29 |
| lorneswork.Predator 1.0 | 12 | 5% | 14 |
| skm.butterfly 1.0 | 7 | 3% | 7 |
| adt.Ar2 1.0 | 6 | 2% | 6 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 4 |
| mym.EdgeStalker 1.0 | 2 | 1% | 4 |

## Melee bench: F02

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 79.0 | 117 / 280 | 2.89 | 17.6% | 41853 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 17.6% | 117 |
| pulsar.PulsarMax 0.8.9 | 2.4 | 13.7% | 56 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.6 | 13.2% | 48 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.2% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 9.8% | 11 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 8.3% | 1 |
| Noran.BitchingElk 0.054 | 7.1 | 7.9% | 22 |
| sch.Simone 0.3d | 7.5 | 7.6% | 9 |
| stelo.PatternRobot 1.0 | 8.6 | 6.8% | 9 |
| fullsail.SweetTea 1.1 | 10.0 | 4.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 81.3 | 18 / 35 | 5432 |
| 2 | 1 | 64.9 | 74.6 | 14 / 35 | 4789 |
| 3 | 1 | 66.9 | 81.0 | 16 / 35 | 5355 |
| 4 | 1 | 65.6 | 78.7 | 10 / 35 | 5024 |
| 5 | 1 | 63.7 | 71.4 | 12 / 35 | 4666 |
| 6 | 1 | 65.7 | 73.7 | 14 / 35 | 5370 |
| 7 | 1 | 69.8 | 89.5 | 21 / 35 | 5880 |
| 8 | 1 | 66.6 | 81.9 | 12 / 35 | 5337 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 60 | 55% |
| pulsar.PulsarMax 0.8.9 | 53 | 58% |
| Noran.BitchingElk 0.054 | 15 | 47% |
| com.cohesiva.robocode.ManOwaR 1.0 | 14 | 86% |
| sch.Simone 0.3d | 12 | 83% |
| stelo.PatternRobot 1.0 | 12 | 50% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 92% |
| fullsail.SweetTea 1.1 | 5 | 80% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |

Hadur died in 163 of 280 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 52 | 32% | 81 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 49 | 30% | 87 |
| lrem.micro.SpikeSoldier 0.4 | 17 | 10% | 21 |
| stelo.PatternRobot 1.0 | 13 | 8% | 21 |
| Noran.BitchingElk 0.054 | 10 | 6% | 18 |
| fullsail.SweetTea 1.1 | 6 | 4% | 9 |
| fnc.bandit.Bandit 5.2.0 | 6 | 4% | 7 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5 | 3% | 18 |
| sch.Simone 0.3d | 5 | 3% | 18 |

## Melee bench: F03

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 79.9 | 160 / 280 | 2.81 | 17.7% | 43459 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 17.7% | 160 |
| radnor.DoctorBob 1.42 | 2.3 | 13.9% | 41 |
| kawigi.nano.Lib 1.0 | 3.3 | 12.7% | 33 |
| vuen.Cake 2.51 | 3.6 | 12.2% | 33 |
| urdos.URDOS 1.3 | 4.9 | 10.2% | 9 |
| adt.Ar1 2.1 | 6.1 | 7.9% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 7.1% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.9 | 7.0% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 6.5% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 83.5 | 21 / 35 | 5662 |
| 2 | 1 | 65.4 | 75.9 | 19 / 35 | 5303 |
| 3 | 1 | 68.3 | 84.1 | 21 / 35 | 5835 |
| 4 | 1 | 65.4 | 76.2 | 19 / 35 | 5115 |
| 5 | 1 | 67.4 | 83.5 | 20 / 35 | 5375 |
| 6 | 1 | 68.2 | 84.4 | 22 / 35 | 5933 |
| 7 | 1 | 66.9 | 80.3 | 20 / 35 | 5372 |
| 8 | 1 | 64.5 | 71.1 | 18 / 35 | 4864 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 70 | 91% |
| vuen.Cake 2.51 | 52 | 75% |
| radnor.DoctorBob 1.42 | 45 | 91% |
| urdos.URDOS 1.3 | 7 | 71% |
| oa.weak.FlyMk1 0.1 | 6 | 83% |
| ghent.ArthurPanzergon 1.0.0 | 5 | 80% |
| adt.Ar1 2.1 | 2 | 100% |

Hadur died in 120 of 280 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 37 | 31% | 80 |
| kawigi.nano.Lib 1.0 | 27 | 23% | 94 |
| vuen.Cake 2.51 | 19 | 16% | 50 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 8% | 8 |
| urdos.URDOS 1.3 | 8 | 7% | 17 |
| ghent.ArthurPanzergon 1.0.0 | 8 | 7% | 12 |
| adt.Ar1 2.1 | 7 | 6% | 7 |
| oa.weak.FlyMk1 0.1 | 4 | 3% | 10 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 75.6 | 15 / 280 | 3.19 | 15.8% | 43795 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.6% | 251 |
| hadur117.micro.SaorS2 0.1 | 2.0 | 15.8% | 15 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.3% | 10 |
| TNT.TNT 0.99.1 | 4.0 | 10.8% | 2 |
| josago.Jorgito 0.16 | 5.0 | 9.0% | 0 |
| css.Delitioner 0.11 | 6.3 | 7.2% | 1 |
| tj.zombie1n 1.0.1 | 6.9 | 6.5% | 0 |
| rampancy.Durandal 2.1d | 7.9 | 5.6% | 0 |
| spin.Bugstard 0.012b | 9.3 | 4.2% | 1 |
| sp.Nanos.Ember 1.1 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 70.8 | 2 / 35 | 4901 |
| 2 | 2 | 65.3 | 75.6 | 1 / 35 | 5184 |
| 3 | 2 | 66.2 | 76.8 | 3 / 35 | 5782 |
| 4 | 2 | 65.4 | 74.6 | 2 / 35 | 5522 |
| 5 | 2 | 64.8 | 72.7 | 1 / 35 | 5228 |
| 6 | 2 | 67.0 | 78.7 | 2 / 35 | 5891 |
| 7 | 2 | 65.4 | 77.1 | 1 / 35 | 5503 |
| 8 | 2 | 66.8 | 78.7 | 3 / 35 | 5784 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 107 | 5% |
| apc.LeeroyJenkins2 1.0 | 10 | 60% |
| css.Delitioner 0.11 | 2 | 50% |
| josago.Jorgito 0.16 | 2 | 100% |
| TNT.TNT 0.99.1 | 1 | 100% |

Hadur died in 265 of 280 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 202 | 76% | 209 |
| apc.LeeroyJenkins2 1.0 | 28 | 11% | 33 |
| josago.Jorgito 0.16 | 18 | 7% | 20 |
| css.Delitioner 0.11 | 9 | 3% | 9 |
| TNT.TNT 0.99.1 | 3 | 1% | 4 |
| rampancy.Durandal 2.1d | 2 | 1% | 3 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 1 |
| tj.zombie1n 1.0.1 | 1 | 0% | 1 |

## Melee bench: F05

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 60.6 | 3 / 280 | 4.55 | 12.4% | 32279 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.1% | 156 |
| justin.DemonicRage 3.4 | 1.8 | 17.6% | 97 |
| wompi.Numbat 2.1 | 3.4 | 12.5% | 13 |
| hadur117.micro.SaorS2 0.1 | 3.6 | 12.4% | 3 |
| axeBots.HataMoto 3.09 | 5.5 | 9.2% | 7 |
| ms.Ares 0.19 | 5.5 | 9.2% | 4 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.6 | 5.9% | 0 |
| supersample.SuperBoxBot 1.0 | 7.9 | 5.9% | 0 |
| GarmBox.Oranges 1.0 | 9.1 | 4.4% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.4 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.6 | 61.0 | 0 / 35 | 4073 |
| 2 | 4 | 56.6 | 54.0 | 0 / 35 | 3975 |
| 3 | 3 | 59.6 | 62.2 | 2 / 35 | 4084 |
| 4 | 4 | 57.7 | 55.6 | 0 / 35 | 4061 |
| 5 | 4 | 58.8 | 61.3 | 0 / 35 | 3978 |
| 6 | 3 | 59.5 | 64.8 | 1 / 35 | 3811 |
| 7 | 3 | 60.4 | 62.2 | 0 / 35 | 4635 |
| 8 | 4 | 58.5 | 63.5 | 0 / 35 | 3662 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 27 | 0% |
| justin.DemonicRage 3.4 | 23 | 0% |
| wompi.Numbat 2.1 | 4 | 50% |
| axeBots.HataMoto 3.09 | 1 | 0% |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 100% |
| ms.Ares 0.19 | 1 | 0% |

Hadur died in 277 of 280 rounds, at a mean tick of 670. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 94 | 34% | 94 |
| justin.DemonicRage 3.4 | 92 | 33% | 93 |
| wompi.Numbat 2.1 | 33 | 12% | 35 |
| ms.Ares 0.19 | 19 | 7% | 19 |
| axeBots.HataMoto 3.09 | 17 | 6% | 17 |
| supersample.SuperBoxBot 1.0 | 13 | 5% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 4 | 1% | 6 |
| GarmBox.Oranges 1.0 | 3 | 1% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 78.5 | 154 / 280 | 2.94 | 17.2% | 37015 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.1 | 17.2% | 154 |
| jekl.StoneGhost 0.7 | 2.3 | 14.1% | 26 |
| origin.SleepSiphon 1.7b | 3.6 | 12.6% | 51 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.1% | 25 |
| mld.Wisdom 1.0 | 4.3 | 11.7% | 15 |
| gg.Wolverine 2.0 | 6.0 | 8.9% | 6 |
| DBall.NUKE 0.1 | 7.8 | 6.7% | 1 |
| spinnercat.Omen 1.0 | 7.8 | 6.9% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.5 | 6.2% | 3 |
| sample.Fire 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 80.3 | 20 / 35 | 4787 |
| 2 | 1 | 67.1 | 82.9 | 16 / 35 | 4646 |
| 3 | 1 | 66.7 | 83.5 | 19 / 35 | 4460 |
| 4 | 1 | 64.3 | 72.7 | 19 / 35 | 4109 |
| 5 | 1 | 66.8 | 77.8 | 21 / 35 | 4906 |
| 6 | 1 | 66.1 | 74.0 | 20 / 35 | 5064 |
| 7 | 2 | 65.5 | 75.9 | 20 / 35 | 4224 |
| 8 | 1 | 67.1 | 80.6 | 19 / 35 | 4819 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 71 | 96% |
| origin.SleepSiphon 1.7b | 45 | 62% |
| pe.minimelee.SandboxMiniMelee 1.1 | 32 | 88% |
| gg.Wolverine 2.0 | 12 | 58% |
| mld.Wisdom 1.0 | 10 | 80% |
| DBall.NUKE 0.1 | 7 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 67% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 126 of 280 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 32 | 25% | 66 |
| mld.Wisdom 1.0 | 30 | 24% | 38 |
| pe.minimelee.SandboxMiniMelee 1.1 | 19 | 15% | 57 |
| jekl.StoneGhost 0.7 | 18 | 14% | 74 |
| gg.Wolverine 2.0 | 14 | 11% | 18 |
| DBall.NUKE 0.1 | 4 | 3% | 9 |
| spinnercat.Omen 1.0 | 4 | 3% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 2% | 6 |
| sample.Fire 1.0 | 2 | 2% | 3 |

## Melee bench: F07

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 84.2 | 99 / 280 | 2.42 | 18.5% | 47688 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.4 | 18.5% | 99 |
| rsalesc.melee.Monk 0.3.6c | 2.1 | 18.0% | 89 |
| rtk.Tachikoma 1.0 | 2.5 | 17.1% | 73 |
| franzor.Lizt 1.3.1 | 4.1 | 10.5% | 17 |
| oog.melee.CapuletDroid 1.1 | 5.1 | 9.4% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.4 | 7.9% | 0 |
| exauge.GateKeeper 1.1.121g | 6.4 | 7.8% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.4% | 0 |
| drd.Dreadknoght 0.9 | 9.5 | 2.7% | 0 |
| sample.Target 1.0 | 9.5 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 83.5 | 13 / 35 | 6254 |
| 2 | 1 | 71.7 | 87.9 | 17 / 35 | 6647 |
| 3 | 2 | 68.8 | 84.1 | 13 / 35 | 5537 |
| 4 | 2 | 68.5 | 82.5 | 10 / 35 | 5752 |
| 5 | 1 | 70.5 | 88.6 | 14 / 35 | 5904 |
| 6 | 2 | 68.5 | 83.8 | 9 / 35 | 5508 |
| 7 | 1 | 68.9 | 80.3 | 14 / 35 | 5886 |
| 8 | 1 | 69.3 | 82.9 | 9 / 35 | 6200 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 102 | 52% |
| rsalesc.melee.Monk 0.3.6c | 50 | 16% |
| oog.melee.CapuletDroid 1.1 | 21 | 95% |
| franzor.Lizt 1.3.1 | 20 | 80% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 182 of 280 rounds, at a mean tick of 1160. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 80 | 44% | 110 |
| rtk.Tachikoma 1.0 | 72 | 40% | 139 |
| oog.melee.CapuletDroid 1.1 | 14 | 8% | 15 |
| franzor.Lizt 1.3.1 | 7 | 4% | 3 |
| exauge.GateKeeper 1.1.121g | 4 | 2% | 5 |
| lrem.micro.MoggFanatic 0.2 | 3 | 2% | 6 |
| drd.Dreadknoght 0.9 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 77.6 | 124 / 280 | 3.01 | 17.5% | 43026 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 17.5% | 124 |
| tm.Yuugao 1.0 | 2.3 | 13.3% | 68 |
| shrub.Vapour v159 | 2.8 | 12.6% | 36 |
| Krabb.sliNk.Garm 0.9u | 4.3 | 10.5% | 22 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 10.2% | 16 |
| m3thos.Eva00 1.1 | 6.3 | 9.0% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 8.4% | 9 |
| qualidafial.MajorDick 1.0.1 | 7.8 | 7.2% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.6% | 2 |
| SHAM.WOW 1.4 | 9.5 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 76.8 | 16 / 35 | 5056 |
| 2 | 1 | 65.7 | 74.3 | 14 / 35 | 5237 |
| 3 | 1 | 68.9 | 83.2 | 18 / 35 | 5950 |
| 4 | 1 | 65.2 | 73.3 | 13 / 35 | 5391 |
| 5 | 1 | 64.8 | 73.7 | 16 / 35 | 5093 |
| 6 | 1 | 65.6 | 75.9 | 16 / 35 | 5140 |
| 7 | 1 | 68.6 | 86.0 | 16 / 35 | 5791 |
| 8 | 1 | 66.0 | 77.8 | 15 / 35 | 5368 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 58 | 36% |
| shrub.Vapour v159 | 48 | 81% |
| Krabb.sliNk.Garm 0.9u | 34 | 79% |
| com.spp.robocode.MostlyHarmless 010 | 15 | 87% |
| jwst.DAD.DarkAndDarker 1.1 | 13 | 77% |
| m3thos.Eva00 1.1 | 8 | 88% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 159 of 280 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 72 | 45% | 107 |
| shrub.Vapour v159 | 25 | 16% | 49 |
| Krabb.sliNk.Garm 0.9u | 13 | 8% | 32 |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 7% | 21 |
| com.spp.robocode.MostlyHarmless 010 | 10 | 6% | 26 |
| qualidafial.MajorDick 1.0.1 | 9 | 6% | 10 |
| zyx.nano.BacillusComma 1.0 | 7 | 4% | 10 |
| m3thos.Eva00 1.1 | 6 | 4% | 15 |
| SHAM.WOW 1.4 | 5 | 3% | 9 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 62.1 | 42 / 280 | 4.41 | 13.2% | 31414 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.2% | 141 |
| hadur117.micro.SaorS2 0.1 | 2.4 | 13.2% | 42 |
| kc.micro.Figment 1.0 | 2.9 | 13.1% | 38 |
| yagami.Tidus 0.11 | 4.4 | 11.0% | 6 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.8% | 29 |
| mc2.enemy.Original 0.9 | 5.6 | 10.0% | 21 |
| dft.Calliope 5.6 | 7.0 | 7.8% | 3 |
| step.nanoPri 1.0 | 8.3 | 6.1% | 0 |
| rdm.Dueler 0.4x | 9.3 | 5.3% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.1 | 62.9 | 2 / 35 | 3878 |
| 2 | 2 | 63.2 | 73.0 | 8 / 35 | 4265 |
| 3 | 2 | 59.4 | 61.9 | 6 / 35 | 4067 |
| 4 | 3 | 58.2 | 60.3 | 2 / 35 | 3858 |
| 5 | 2 | 60.9 | 67.6 | 5 / 35 | 3833 |
| 6 | 3 | 57.7 | 57.8 | 6 / 35 | 3609 |
| 7 | 2 | 60.2 | 62.2 | 8 / 35 | 4154 |
| 8 | 3 | 56.0 | 51.4 | 5 / 35 | 3750 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 49 | 12% |
| kc.micro.Figment 1.0 | 31 | 48% |
| pedersen.Grishnakh 1.0 | 15 | 33% |
| yagami.Tidus 0.11 | 9 | 100% |
| mc2.enemy.Original 0.9 | 5 | 80% |
| dft.Calliope 5.6 | 4 | 75% |

Hadur died in 238 of 280 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 90 | 38% | 101 |
| kc.micro.Figment 1.0 | 71 | 30% | 88 |
| mc2.enemy.Original 0.9 | 21 | 9% | 25 |
| yagami.Tidus 0.11 | 18 | 8% | 23 |
| pedersen.Grishnakh 1.0 | 17 | 7% | 20 |
| robar.nano.Assertive_Melee 0.2 | 7 | 3% | 8 |
| dft.Calliope 5.6 | 5 | 2% | 6 |
| step.nanoPri 1.0 | 5 | 2% | 5 |
| rdm.Dueler 0.4x | 4 | 2% | 4 |

## Melee bench: F10

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 83.1 | 131 / 280 | 2.52 | 17.8% | 42896 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.3 | 17.8% | 131 |
| DTF.Kludgy 1.2b | 2.0 | 15.6% | 87 |
| ne.Chimera 1.2 | 3.1 | 12.5% | 17 |
| ejb.Polaris 1.0.1 | 4.1 | 11.4% | 26 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.4% | 9 |
| vStar.RAFzilla 2.15 | 5.3 | 10.5% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.6 | 6.1% | 0 |
| kurios.DOSexe .9b | 8.0 | 6.0% | 2 |
| sam.Samspin 1.0 | 8.5 | 5.6% | 0 |
| donjezza.Muncho 1.0 | 9.9 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 83.8 | 20 / 35 | 4999 |
| 2 | 2 | 64.7 | 76.2 | 13 / 35 | 4781 |
| 3 | 1 | 69.1 | 89.8 | 21 / 35 | 5378 |
| 4 | 1 | 67.7 | 87.0 | 17 / 35 | 5477 |
| 5 | 2 | 66.6 | 81.3 | 13 / 35 | 5397 |
| 6 | 1 | 68.1 | 83.5 | 16 / 35 | 5487 |
| 7 | 1 | 66.1 | 77.5 | 16 / 35 | 5315 |
| 8 | 1 | 68.5 | 85.7 | 15 / 35 | 6062 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 77 | 27% |
| ejb.Polaris 1.0.1 | 46 | 72% |
| ne.Chimera 1.2 | 30 | 77% |
| vStar.RAFzilla 2.15 | 24 | 96% |
| tvv.micro.Antares 1.1.1 | 22 | 91% |
| kurios.DOSexe .9b | 6 | 100% |
| donjezza.Muncho 1.0 | 4 | 75% |
| sam.Samspin 1.0 | 2 | 100% |

Hadur died in 151 of 280 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 89 | 59% | 108 |
| ejb.Polaris 1.0.1 | 19 | 13% | 60 |
| ne.Chimera 1.2 | 14 | 9% | 40 |
| tvv.micro.Antares 1.1.1 | 9 | 6% | 24 |
| Grystrion.RandomTrackerNOREV 1.0 | 9 | 6% | 9 |
| vStar.RAFzilla 2.15 | 4 | 3% | 20 |
| kurios.DOSexe .9b | 3 | 2% | 10 |
| donjezza.Muncho 1.0 | 2 | 1% | 5 |
| sam.Samspin 1.0 | 2 | 1% | 3 |

## Melee bench: F11

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 72.1 | 74 / 280 | 3.51 | 15.4% | 36051 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.6% | 134 |
| hadur117.micro.SaorS2 0.1 | 2.1 | 15.4% | 74 |
| cx.mini.Nimrod 0.55 | 3.3 | 12.2% | 25 |
| djc.DynaBot 0.1.1 | 3.6 | 10.5% | 11 |
| rdt199.Warlord 0.73 | 5.5 | 9.0% | 15 |
| br2.MobyDickBot 1.6 | 6.1 | 8.7% | 4 |
| uji.YellohFellah 1.0 | 7.0 | 7.9% | 14 |
| KiraNL.Chupacabra 0.4 | 7.4 | 7.7% | 2 |
| stelo.MirrorNano 1.3 | 9.4 | 5.5% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.6 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 76.2 | 14 / 35 | 4507 |
| 2 | 2 | 65.6 | 81.6 | 9 / 35 | 4596 |
| 3 | 2 | 63.9 | 74.0 | 10 / 35 | 4571 |
| 4 | 2 | 61.9 | 65.4 | 9 / 35 | 4922 |
| 5 | 2 | 60.9 | 65.1 | 6 / 35 | 4363 |
| 6 | 2 | 63.1 | 73.3 | 9 / 35 | 4444 |
| 7 | 3 | 61.3 | 67.3 | 6 / 35 | 4080 |
| 8 | 2 | 64.0 | 74.0 | 11 / 35 | 4568 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 78 | 17% |
| cx.mini.Nimrod 0.55 | 25 | 88% |
| djc.DynaBot 0.1.1 | 20 | 100% |
| uji.YellohFellah 1.0 | 11 | 55% |
| rdt199.Warlord 0.73 | 8 | 88% |
| br2.MobyDickBot 1.6 | 6 | 83% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 206 of 280 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 116 | 56% | 129 |
| cx.mini.Nimrod 0.55 | 26 | 13% | 46 |
| KiraNL.Chupacabra 0.4 | 19 | 9% | 22 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 5% | 13 |
| rdt199.Warlord 0.73 | 10 | 5% | 20 |
| uji.YellohFellah 1.0 | 10 | 5% | 17 |
| br2.MobyDickBot 1.6 | 6 | 3% | 11 |
| stelo.MirrorNano 1.3 | 5 | 2% | 5 |
| djc.DynaBot 0.1.1 | 3 | 1% | 17 |

## Melee bench: F12

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 78.4 | 120 / 280 | 2.95 | 16.5% | 31644 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 16.5% | 120 |
| bts.wiki.RipCurl 0.9b | 2.9 | 13.5% | 47 |
| darkcanuck.Leon 1.01 | 3.0 | 13.2% | 47 |
| nat.PallasHawk 1.0 | 3.3 | 12.6% | 42 |
| brainfade.melee.Genghis 0.36 | 4.9 | 10.2% | 14 |
| jrm.Test0 1.0 | 6.3 | 8.6% | 2 |
| jp.Perpy 16.0 | 7.4 | 7.4% | 0 |
| cs.sheldor.Talon 1.1 | 7.5 | 7.2% | 2 |
| stuff.Vlad 0.1 | 9.4 | 5.4% | 1 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.3% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 74.0 | 14 / 35 | 3876 |
| 2 | 1 | 63.9 | 74.3 | 14 / 35 | 3947 |
| 3 | 1 | 65.6 | 78.7 | 15 / 35 | 4045 |
| 4 | 1 | 66.5 | 82.5 | 16 / 35 | 4191 |
| 5 | 1 | 63.7 | 74.9 | 11 / 35 | 3972 |
| 6 | 1 | 64.8 | 78.7 | 16 / 35 | 3691 |
| 7 | 1 | 65.3 | 81.3 | 16 / 35 | 3933 |
| 8 | 1 | 66.2 | 82.5 | 18 / 35 | 3989 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 50 | 58% |
| nat.PallasHawk 1.0 | 46 | 70% |
| darkcanuck.Leon 1.01 | 44 | 68% |
| brainfade.melee.Genghis 0.36 | 11 | 73% |
| jrm.Test0 1.0 | 10 | 100% |
| jp.Perpy 16.0 | 7 | 100% |
| jaybot.bots.Oddball 4.0 | 3 | 33% |
| cs.sheldor.Talon 1.1 | 3 | 67% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 163 of 280 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 46 | 28% | 68 |
| darkcanuck.Leon 1.01 | 35 | 21% | 76 |
| nat.PallasHawk 1.0 | 31 | 19% | 64 |
| brainfade.melee.Genghis 0.36 | 18 | 11% | 27 |
| jrm.Test0 1.0 | 14 | 9% | 20 |
| jp.Perpy 16.0 | 10 | 6% | 11 |
| cs.sheldor.Talon 1.1 | 5 | 3% | 7 |
| jaybot.bots.Oddball 4.0 | 4 | 2% | 7 |

## Melee bench: F13

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 66.4 | 16 / 280 | 4.03 | 13.1% | 32159 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.4 | 17.5% | 91 |
| mn.Combat 3.25.0 | 1.6 | 16.7% | 121 |
| hadur117.micro.SaorS2 0.1 | 3.4 | 13.1% | 16 |
| shinh.Entangled 0.3 | 4.1 | 12.1% | 35 |
| gh.micro.Gruweltje 0.7 | 4.5 | 12.0% | 16 |
| apc.Colossus2 0.17 | 6.0 | 8.1% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.6% | 1 |
| ayk.WallHugger 1.0 | 8.1 | 5.6% | 0 |
| maribo.FollowFire 1 | 8.9 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.2 | 64.1 | 3 / 35 | 3529 |
| 2 | 3 | 59.4 | 64.4 | 0 / 35 | 3892 |
| 3 | 4 | 58.5 | 60.3 | 2 / 35 | 4069 |
| 4 | 3 | 61.0 | 68.6 | 3 / 35 | 4197 |
| 5 | 3 | 62.2 | 71.4 | 3 / 35 | 4308 |
| 6 | 4 | 58.7 | 62.2 | 1 / 35 | 3791 |
| 7 | 3 | 60.4 | 65.7 | 2 / 35 | 4233 |
| 8 | 3 | 62.3 | 74.3 | 2 / 35 | 4140 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 41 | 15% |
| mn.Combat 3.25.0 | 31 | 16% |
| shinh.Entangled 0.3 | 10 | 40% |
| gh.micro.Gruweltje 0.7 | 5 | 0% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 264 of 280 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 106 | 40% | 115 |
| mn.Combat 3.25.0 | 82 | 31% | 87 |
| shinh.Entangled 0.3 | 23 | 9% | 25 |
| gh.micro.Gruweltje 0.7 | 19 | 7% | 21 |
| stelo.Wang 1.0 | 12 | 5% | 12 |
| maribo.FollowFire 1 | 12 | 5% | 10 |
| apc.Colossus2 0.17 | 6 | 2% | 6 |
| ayk.WallHugger 1.0 | 2 | 1% | 2 |
| sample.Tracker 1.0 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 76.9 | 155 / 280 | 3.08 | 17.3% | 41163 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 17.3% | 155 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.1% | 35 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.8% | 56 |
| Lo_Ian.Gandalf_V4 4.0 | 5.0 | 10.0% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.7% | 3 |
| co.edu.usb.rc.LidisTron 1.0 | 5.8 | 9.6% | 8 |
| sanyi.mikrobi.Roberto 1.0 | 6.0 | 9.2% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.9 | 7.7% | 11 |
| pa.Improved 1.0 | 8.9 | 6.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 76.2 | 15 / 35 | 4939 |
| 2 | 1 | 64.6 | 69.8 | 19 / 35 | 4789 |
| 3 | 1 | 67.7 | 80.6 | 21 / 35 | 5510 |
| 4 | 1 | 68.1 | 81.3 | 21 / 35 | 5614 |
| 5 | 1 | 65.1 | 74.3 | 18 / 35 | 4710 |
| 6 | 1 | 65.8 | 75.9 | 18 / 35 | 4768 |
| 7 | 1 | 66.8 | 74.6 | 21 / 35 | 5540 |
| 8 | 1 | 68.3 | 82.9 | 22 / 35 | 5293 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 106 | 86% |
| catcat20.shape.Theta 0.018 | 55 | 51% |
| co.edu.usb.rc.LidisTron 1.0 | 15 | 87% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 89% |
| sanyi.mikrobi.Roberto 1.0 | 7 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |

Hadur died in 125 of 280 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 52 | 42% | 151 |
| catcat20.shape.Theta 0.018 | 35 | 28% | 57 |
| sanyi.mikrobi.Roberto 1.0 | 13 | 10% | 25 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 4% | 10 |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 4% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 4% | 7 |
| sample.TrackFire 1.0 | 5 | 4% | 7 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 2% | 6 |
| pa.Improved 1.0 | 2 | 2% | 7 |

## Melee bench: F15

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 81.7 | 143 / 280 | 2.65 | 18.6% | 45999 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 18.6% | 143 |
| kawigi.micro.Shiz 1.1 | 2.6 | 13.4% | 30 |
| emp.Yngwie 1.11 | 2.6 | 13.2% | 64 |
| mld.DustBunny 3.8 | 3.8 | 12.0% | 16 |
| kawigi.robot.Girl 1.2 | 5.4 | 9.2% | 16 |
| cb.nano.Insomnia 1.0 | 5.8 | 8.7% | 8 |
| Grystrion.TrackerWO 1.0 | 7.6 | 7.0% | 0 |
| lambdaxy.TBot 0.1 | 7.8 | 7.1% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.9% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 80.0 | 19 / 35 | 5054 |
| 2 | 1 | 67.7 | 79.7 | 18 / 35 | 5835 |
| 3 | 1 | 67.0 | 77.1 | 17 / 35 | 5689 |
| 4 | 1 | 69.2 | 86.0 | 17 / 35 | 6030 |
| 5 | 1 | 69.4 | 84.4 | 18 / 35 | 6058 |
| 6 | 1 | 69.4 | 83.2 | 23 / 35 | 5753 |
| 7 | 1 | 65.9 | 77.5 | 11 / 35 | 5479 |
| 8 | 1 | 69.5 | 85.4 | 20 / 35 | 6101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 66 | 55% |
| kawigi.micro.Shiz 1.1 | 49 | 96% |
| kawigi.robot.Girl 1.2 | 31 | 74% |
| mld.DustBunny 3.8 | 19 | 89% |
| cb.nano.Insomnia 1.0 | 12 | 75% |
| divineomega.TrialBot 0.003 | 9 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 137 of 280 rounds, at a mean tick of 940. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 59 | 43% | 108 |
| mld.DustBunny 3.8 | 16 | 12% | 42 |
| cb.nano.Insomnia 1.0 | 16 | 12% | 14 |
| kawigi.micro.Shiz 1.1 | 14 | 10% | 55 |
| kawigi.robot.Girl 1.2 | 12 | 9% | 26 |
| lambdaxy.TBot 0.1 | 6 | 4% | 9 |
| Grystrion.TrackerWO 1.0 | 6 | 4% | 9 |
| divineomega.TrialBot 0.003 | 5 | 4% | 14 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 3 | 2% | 3 |

## Melee bench: F16

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 79.4 | 94 / 280 | 2.85 | 17.8% | 45178 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.4 | 17.8% | 94 |
| gh.Griezel 0.5.2 | 1.6 | 17.4% | 120 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.0% | 8 |
| techdude.forest.FlamingForest 1.1 | 4.1 | 10.5% | 38 |
| bvh.fnr.Fenrir 0.36l | 5.4 | 9.0% | 3 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.0% | 10 |
| stelo.IntrinsicVolatility 1.4 | 7.1 | 7.4% | 3 |
| divineomega.DivineBot 1.9.4.5 | 8.4 | 5.7% | 3 |
| repositorio.NanoStep 1.0 | 8.8 | 5.4% | 1 |
| asd.Cthulhu 1.3 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 85.4 | 16 / 35 | 5658 |
| 2 | 2 | 66.0 | 77.8 | 8 / 35 | 5311 |
| 3 | 1 | 67.6 | 78.7 | 11 / 35 | 6163 |
| 4 | 1 | 68.8 | 83.5 | 14 / 35 | 6098 |
| 5 | 2 | 62.1 | 67.6 | 8 / 35 | 4509 |
| 6 | 1 | 68.7 | 83.8 | 14 / 35 | 5941 |
| 7 | 1 | 68.8 | 82.2 | 14 / 35 | 6027 |
| 8 | 2 | 66.2 | 76.2 | 9 / 35 | 5471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 101 | 26% |
| techdude.forest.FlamingForest 1.1 | 36 | 61% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 26 | 92% |
| bvh.fnr.Fenrir 0.36l | 9 | 100% |
| divineomega.DivineBot 1.9.4.5 | 8 | 88% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |
| tvv.nano.Polaris 1.2 | 2 | 100% |

Hadur died in 187 of 280 rounds, at a mean tick of 1315. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 100 | 53% | 133 |
| bvh.fnr.Fenrir 0.36l | 21 | 11% | 26 |
| techdude.forest.FlamingForest 1.1 | 19 | 10% | 42 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 15 | 8% | 35 |
| divineomega.DivineBot 1.9.4.5 | 11 | 6% | 16 |
| tvv.nano.Polaris 1.2 | 10 | 5% | 14 |
| stelo.IntrinsicVolatility 1.4 | 5 | 3% | 8 |
| asd.Cthulhu 1.3 | 5 | 3% | 5 |
| repositorio.NanoStep 1.0 | 1 | 1% | 1 |

## Melee bench: F17

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.1 | 131 / 280 | 2.70 | 17.7% | 39784 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 17.7% | 131 |
| et.Predator 1.8 | 2.3 | 13.3% | 35 |
| oog.melee.Mercutio 1.0 | 3.6 | 11.7% | 24 |
| cx.BlestPain 1.41 | 4.0 | 11.9% | 58 |
| nic.Nicator 2.4 | 4.4 | 11.6% | 21 |
| ahf.NanoAndrew .4 | 5.8 | 10.2% | 8 |
| maribo.melee.BMV 0.1 | 7.0 | 8.9% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.9% | 1 |
| tex.Longbot 0.4 | 8.5 | 6.0% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 79.4 | 15 / 35 | 5125 |
| 2 | 1 | 68.3 | 83.8 | 21 / 35 | 5220 |
| 3 | 1 | 66.7 | 81.6 | 16 / 35 | 4588 |
| 4 | 1 | 66.3 | 78.7 | 15 / 35 | 5041 |
| 5 | 1 | 68.4 | 87.9 | 16 / 35 | 5006 |
| 6 | 1 | 68.1 | 85.1 | 16 / 35 | 4967 |
| 7 | 1 | 65.4 | 73.3 | 16 / 35 | 4788 |
| 8 | 1 | 66.5 | 78.7 | 16 / 35 | 5049 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 59 | 75% |
| cx.BlestPain 1.41 | 49 | 33% |
| oog.melee.Mercutio 1.0 | 36 | 69% |
| nic.Nicator 2.4 | 32 | 75% |
| ahf.NanoAndrew .4 | 14 | 100% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| goblin.Bender 2.4 | 1 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 150 of 280 rounds, at a mean tick of 1112. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 46 | 31% | 62 |
| et.Predator 1.8 | 30 | 20% | 74 |
| oog.melee.Mercutio 1.0 | 28 | 19% | 53 |
| nic.Nicator 2.4 | 15 | 10% | 34 |
| ahf.NanoAndrew .4 | 12 | 8% | 30 |
| maribo.melee.BMV 0.1 | 8 | 5% | 12 |
| edu.otg.spr.TheTeacher 1.2 | 4 | 3% | 5 |
| tex.Longbot 0.4 | 4 | 3% | 4 |
| goblin.Bender 2.4 | 2 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 81.7 | 153 / 280 | 2.65 | 17.7% | 35442 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 17.7% | 153 |
| morbid.MorbidPriest 1.0 | 2.1 | 13.3% | 43 |
| agd.Mooserwirt2 2.7 | 3.6 | 11.3% | 31 |
| uji.DBH 1.1 | 4.6 | 10.5% | 17 |
| ratosh.Nobo 0.21 | 5.0 | 10.0% | 6 |
| spinnercat.Robovirus 2.718 | 5.4 | 9.7% | 7 |
| sigterm.Sigterm 1.0 | 6.8 | 8.4% | 12 |
| kawigi.mini.Fhqwhgads 1.1 | 7.5 | 7.9% | 5 |
| stelo.WangRobot 1.0 | 9.4 | 5.9% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.6 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 84.1 | 19 / 35 | 4456 |
| 2 | 1 | 65.6 | 80.0 | 18 / 35 | 4215 |
| 3 | 1 | 68.8 | 86.7 | 25 / 35 | 4819 |
| 4 | 1 | 66.0 | 78.4 | 16 / 35 | 4418 |
| 5 | 1 | 64.6 | 75.9 | 16 / 35 | 4345 |
| 6 | 1 | 68.3 | 87.3 | 22 / 35 | 4680 |
| 7 | 1 | 68.3 | 88.3 | 20 / 35 | 4610 |
| 8 | 1 | 63.5 | 73.0 | 17 / 35 | 3899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 62 | 69% |
| agd.Mooserwirt2 2.7 | 43 | 70% |
| uji.DBH 1.1 | 26 | 81% |
| sigterm.Sigterm 1.0 | 21 | 86% |
| spinnercat.Robovirus 2.718 | 16 | 88% |
| stelo.WangRobot 1.0 | 13 | 77% |
| ratosh.Nobo 0.21 | 12 | 92% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 67% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 129 of 280 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 38 | 29% | 91 |
| agd.Mooserwirt2 2.7 | 32 | 25% | 64 |
| uji.DBH 1.1 | 17 | 13% | 28 |
| kawigi.mini.Fhqwhgads 1.1 | 12 | 9% | 21 |
| stelo.WangRobot 1.0 | 9 | 7% | 17 |
| sigterm.Sigterm 1.0 | 7 | 5% | 18 |
| spinnercat.Robovirus 2.718 | 7 | 5% | 18 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 3% | 7 |
| ratosh.Nobo 0.21 | 3 | 2% | 15 |

## Melee bench: F19

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 91.7 | 209 / 280 | 1.74 | 20.6% | 46028 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 20.6% | 209 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.6% | 18 |
| mld.Infinity 2.2 | 2.8 | 13.8% | 43 |
| erdnis.Rover 0.3 | 4.5 | 10.8% | 2 |
| krillr.mini.JointStrike 2.0.0 | 4.6 | 10.7% | 2 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.6% | 4 |
| mbh.Mbh 0.1 | 7.5 | 7.4% | 2 |
| pac.ABC 2.1 | 7.9 | 6.6% | 1 |
| pbg.R2D2 1.0 | 8.5 | 5.7% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 94.3 | 28 / 35 | 5665 |
| 2 | 1 | 70.6 | 87.0 | 24 / 35 | 5501 |
| 3 | 1 | 72.4 | 94.9 | 26 / 35 | 6062 |
| 4 | 1 | 71.4 | 91.1 | 25 / 35 | 5728 |
| 5 | 1 | 70.9 | 89.2 | 24 / 35 | 5851 |
| 6 | 1 | 71.9 | 92.7 | 28 / 35 | 5840 |
| 7 | 1 | 70.9 | 92.1 | 26 / 35 | 5479 |
| 8 | 1 | 72.0 | 92.7 | 28 / 35 | 5902 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 109 | 93% |
| mld.Infinity 2.2 | 82 | 82% |
| krillr.mini.JointStrike 2.0.0 | 17 | 94% |
| erdnis.Rover 0.3 | 10 | 80% |
| mbh.Mbh 0.1 | 8 | 75% |
| patson.PatsonTestBot 1.0 | 7 | 86% |
| pac.ABC 2.1 | 2 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 72 of 280 rounds, at a mean tick of 1087. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 19 | 26% | 25 |
| davidalves.net.DuelistMiniMelee 1.2 | 18 | 25% | 136 |
| erdnis.Rover 0.3 | 12 | 17% | 31 |
| krillr.mini.JointStrike 2.0.0 | 10 | 14% | 33 |
| mbh.Mbh 0.1 | 4 | 6% | 14 |
| pac.ABC 2.1 | 4 | 6% | 11 |
| pbg.R2D2 1.0 | 2 | 3% | 14 |
| patson.PatsonTestBot 1.0 | 2 | 3% | 14 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.1 | 144 / 280 | 2.07 | 19.4% | 45811 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 19.4% | 144 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.7% | 69 |
| fwb.Nine 1.0.1 | 3.3 | 11.5% | 36 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 10.7% | 2 |
| catcat20.Rabbit 0.001 | 4.8 | 9.9% | 23 |
| m3thos.mini.Eva01 0.5.5 | 6.6 | 8.0% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.1 | 7.4% | 0 |
| bayen.nut.Squirrel 1.615 | 7.5 | 7.0% | 4 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 6.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 90.5 | 22 / 35 | 5779 |
| 2 | 1 | 69.6 | 89.8 | 17 / 35 | 5644 |
| 3 | 1 | 68.3 | 81.3 | 15 / 35 | 5990 |
| 4 | 1 | 70.1 | 92.1 | 20 / 35 | 5776 |
| 5 | 1 | 69.6 | 90.2 | 21 / 35 | 5469 |
| 6 | 1 | 68.7 | 86.0 | 17 / 35 | 5453 |
| 7 | 1 | 69.9 | 90.2 | 20 / 35 | 5778 |
| 8 | 1 | 68.4 | 84.8 | 12 / 35 | 5922 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 102 | 55% |
| fwb.Nine 1.0.1 | 49 | 55% |
| catcat20.Rabbit 0.001 | 35 | 66% |
| nz.jdc.nano.GridFu 1.0 | 22 | 100% |
| bayen.nut.Squirrel 1.615 | 8 | 100% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 136 of 280 rounds, at a mean tick of 1235. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 75 | 55% | 123 |
| fwb.Nine 1.0.1 | 25 | 18% | 29 |
| catcat20.Rabbit 0.001 | 20 | 15% | 53 |
| bayen.nut.Squirrel 1.615 | 5 | 4% | 13 |
| nz.jdc.nano.GridFu 1.0 | 4 | 3% | 29 |
| m3thos.mini.Eva01 0.5.5 | 3 | 2% | 10 |
| djdjdj.NanoSkunk10 1.0 | 2 | 1% | 10 |
| ntc.ControlledChaos 1.1.4 | 2 | 1% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 4 |

## Melee bench: F21

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.2 | 141 / 280 | 2.33 | 18.9% | 43589 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.1 | 18.9% | 141 |
| eem.EvBot v4.6.16 | 1.9 | 16.7% | 111 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.8% | 11 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 3 |
| eld.Hmm 1.0 | 5.4 | 8.2% | 9 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.9% | 5 |
| fire219.CatBot 1.0 | 7.3 | 6.4% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.4% | 1 |
| PSW.Relentless 0.1 | 8.6 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 86.3 | 17 / 35 | 5221 |
| 2 | 2 | 66.3 | 73.7 | 14 / 35 | 5376 |
| 3 | 1 | 70.3 | 87.6 | 21 / 35 | 5661 |
| 4 | 1 | 70.7 | 90.2 | 19 / 35 | 5834 |
| 5 | 1 | 69.1 | 84.1 | 15 / 35 | 5501 |
| 6 | 1 | 70.0 | 87.9 | 23 / 35 | 5356 |
| 7 | 1 | 68.5 | 85.7 | 16 / 35 | 5531 |
| 8 | 1 | 68.1 | 86.3 | 16 / 35 | 5109 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 131 | 47% |
| dummy.mini.Scimitar 1.01 | 45 | 87% |
| cf.RiO.RiOx 4.2.1 | 23 | 100% |
| eld.Hmm 1.0 | 11 | 91% |
| oa.weak.BotherBot 0.1 | 7 | 86% |
| el.JumpShoot 0.2 | 2 | 50% |

Hadur died in 141 of 280 rounds, at a mean tick of 1181. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 92 | 65% | 137 |
| dummy.mini.Scimitar 1.01 | 19 | 13% | 62 |
| fire219.CatBot 1.0 | 6 | 4% | 7 |
| eld.Hmm 1.0 | 5 | 4% | 26 |
| PSW.Relentless 0.1 | 5 | 4% | 6 |
| cf.RiO.RiOx 4.2.1 | 4 | 3% | 19 |
| oa.weak.BotherBot 0.1 | 4 | 3% | 11 |
| el.JumpShoot 0.2 | 4 | 3% | 5 |
| arthord.MannyPacquiao Beta | 1 | 1% | 7 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 80.3 | 120 / 280 | 2.77 | 18.2% | 45378 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.5 | 18.2% | 120 |
| pe.SandboxLump 1.52 | 1.6 | 16.8% | 94 |
| cre.Karolos 0.32 | 2.9 | 14.3% | 41 |
| stelo.RamTrackSurfer 1.2 | 4.8 | 10.0% | 11 |
| stelo.AreaTargetingBot 1.1 | 5.3 | 9.8% | 11 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.6% | 1 |
| cw.megas.Blade 0.8 | 6.5 | 8.6% | 1 |
| sample.Walls 1.0 | 8.0 | 7.6% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.6% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.1 | 70.5 | 7 / 35 | 5402 |
| 2 | 1 | 68.8 | 80.0 | 20 / 35 | 5401 |
| 3 | 1 | 69.0 | 82.9 | 14 / 35 | 5724 |
| 4 | 1 | 69.3 | 82.5 | 21 / 35 | 5758 |
| 5 | 2 | 67.2 | 75.2 | 10 / 35 | 5778 |
| 6 | 1 | 71.2 | 89.2 | 21 / 35 | 5797 |
| 7 | 2 | 68.6 | 80.0 | 9 / 35 | 5849 |
| 8 | 1 | 69.5 | 82.2 | 18 / 35 | 5669 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 108 | 48% |
| cre.Karolos 0.32 | 47 | 66% |
| stelo.AreaTargetingBot 1.1 | 18 | 89% |
| stelo.RamTrackSurfer 1.2 | 11 | 91% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 161 of 280 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 79 | 49% | 133 |
| cre.Karolos 0.32 | 37 | 23% | 73 |
| stelo.AreaTargetingBot 1.1 | 15 | 9% | 26 |
| stelo.RamTrackSurfer 1.2 | 9 | 6% | 19 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 6% | 11 |
| cw.megas.Blade 0.8 | 7 | 4% | 8 |
| sample.Walls 1.0 | 4 | 2% | 9 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 0 |

## Melee bench: F24

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 69.1 | 67 / 280 | 3.78 | 14.3% | 31294 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.6 | 14.3% | 67 |
| rz.GlowBlowMelee 1.4 | 2.5 | 13.9% | 58 |
| florent.XSeries.X2 0.12 | 3.0 | 13.5% | 51 |
| davidalves.Phoenix 0.54 | 3.1 | 13.2% | 69 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.4% | 25 |
| oog.melee.Corsair 1.0 | 6.0 | 9.1% | 5 |
| stelo.SoJNanoMelee 1.1 | 7.3 | 7.3% | 6 |
| lunchie.Lunchbox 0.93 | 7.9 | 6.5% | 0 |
| as.FrankTheTank 1.3 | 9.3 | 5.5% | 0 |
| evd.X1 0.01 | 9.6 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.8 | 71.7 | 7 / 35 | 3728 |
| 2 | 2 | 60.0 | 67.0 | 6 / 35 | 3736 |
| 3 | 1 | 61.0 | 69.5 | 11 / 35 | 3630 |
| 4 | 1 | 61.6 | 69.2 | 7 / 35 | 4116 |
| 5 | 2 | 61.7 | 67.6 | 12 / 35 | 3974 |
| 6 | 2 | 59.6 | 64.8 | 6 / 35 | 4003 |
| 7 | 1 | 62.9 | 75.6 | 9 / 35 | 3785 |
| 8 | 1 | 61.7 | 67.6 | 9 / 35 | 4322 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 34 | 59% |
| davidalves.Phoenix 0.54 | 27 | 37% |
| florent.XSeries.X2 0.12 | 26 | 42% |
| pedersen.Ugluk 1.1.1 | 17 | 53% |
| stelo.SoJNanoMelee 1.1 | 10 | 90% |
| oog.melee.Corsair 1.0 | 6 | 83% |
| lunchie.Lunchbox 0.93 | 3 | 100% |

Hadur died in 213 of 280 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 63 | 30% | 76 |
| davidalves.Phoenix 0.54 | 45 | 21% | 56 |
| rz.GlowBlowMelee 1.4 | 40 | 19% | 55 |
| pedersen.Ugluk 1.1.1 | 23 | 11% | 32 |
| stelo.SoJNanoMelee 1.1 | 16 | 8% | 22 |
| oog.melee.Corsair 1.0 | 12 | 6% | 21 |
| evd.X1 0.01 | 7 | 3% | 8 |
| as.FrankTheTank 1.3 | 4 | 2% | 5 |
| lunchie.Lunchbox 0.93 | 3 | 1% | 5 |

## Melee bench: F25

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.9 | 180 / 280 | 2.45 | 18.5% | 35866 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 18.5% | 180 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.2% | 23 |
| voidious.micro.BlitzBat 1.05 | 3.4 | 11.8% | 18 |
| jdw.Hurricane 1.4 | 3.5 | 11.9% | 29 |
| ds.Oo 2.2 | 5.4 | 9.6% | 15 |
| gre.svman4.Morfeas 1.4.1 | 5.8 | 9.4% | 8 |
| gjr.Cephalosporin 0.1 | 7.4 | 7.4% | 2 |
| awesomeness.Elite 1.0 | 8.1 | 6.8% | 1 |
| adt.Ar2 1.1 | 8.3 | 7.0% | 4 |
| amk.ChumbaMini 0.2 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.6 | 23 / 35 | 4407 |
| 2 | 1 | 66.3 | 78.7 | 21 / 35 | 4135 |
| 3 | 1 | 67.7 | 83.2 | 23 / 35 | 4463 |
| 4 | 1 | 66.0 | 76.5 | 20 / 35 | 4433 |
| 5 | 1 | 65.9 | 80.6 | 20 / 35 | 3908 |
| 6 | 1 | 69.7 | 87.6 | 23 / 35 | 5167 |
| 7 | 1 | 69.4 | 88.9 | 25 / 35 | 4734 |
| 8 | 1 | 69.1 | 88.3 | 25 / 35 | 4619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 58 | 90% |
| voidious.micro.BlitzBat 1.05 | 48 | 100% |
| jdw.Hurricane 1.4 | 44 | 82% |
| ds.Oo 2.2 | 26 | 77% |
| gjr.Cephalosporin 0.1 | 15 | 93% |
| gre.svman4.Morfeas 1.4.1 | 5 | 100% |
| adt.Ar2 1.1 | 3 | 100% |
| awesomeness.Elite 1.0 | 2 | 100% |

Hadur died in 100 of 280 rounds, at a mean tick of 546. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 27 | 27% | 70 |
| jdw.Hurricane 1.4 | 26 | 26% | 63 |
| ds.Oo 2.2 | 19 | 19% | 44 |
| voidious.micro.BlitzBat 1.05 | 9 | 9% | 44 |
| gjr.Cephalosporin 0.1 | 6 | 6% | 22 |
| adt.Ar2 1.1 | 6 | 6% | 11 |
| awesomeness.Elite 1.0 | 4 | 4% | 13 |
| gre.svman4.Morfeas 1.4.1 | 3 | 3% | 11 |
| amk.ChumbaMini 0.2 | 0 | 0% | 1 |

## Melee bench: F26

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.5 | 125 / 280 | 2.48 | 18.1% | 44939 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 18.1% | 125 |
| ak.Fermat 2.0 | 2.1 | 15.1% | 77 |
| lrem.Spectre 0.4.4 | 3.5 | 12.2% | 19 |
| shu.nitro.LENIN .T34 | 3.6 | 12.3% | 48 |
| js.PinBall 1.6 | 5.1 | 10.4% | 5 |
| gh.mini.GrubbmOne 1.0 | 6.1 | 9.5% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 6.5 | 9.2% | 4 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.7% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 81.3 | 13 / 35 | 5436 |
| 2 | 1 | 69.1 | 84.8 | 17 / 35 | 5858 |
| 3 | 1 | 65.5 | 76.2 | 8 / 35 | 5425 |
| 4 | 1 | 69.4 | 90.5 | 18 / 35 | 5350 |
| 5 | 1 | 67.8 | 83.8 | 17 / 35 | 5435 |
| 6 | 1 | 69.0 | 86.3 | 17 / 35 | 5796 |
| 7 | 1 | 69.5 | 85.4 | 22 / 35 | 5946 |
| 8 | 1 | 67.5 | 80.0 | 13 / 35 | 5693 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 62 | 34% |
| shu.nitro.LENIN .T34 | 55 | 62% |
| lrem.Spectre 0.4.4 | 43 | 79% |
| js.PinBall 1.6 | 19 | 79% |
| gh.mini.GrubbmOne 1.0 | 9 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 100% |

Hadur died in 156 of 280 rounds, at a mean tick of 924. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 75 | 48% | 99 |
| shu.nitro.LENIN .T34 | 29 | 19% | 60 |
| lrem.Spectre 0.4.4 | 20 | 13% | 49 |
| js.PinBall 1.6 | 14 | 9% | 27 |
| fullsail.LaxativeTeaTwo 1.0 | 9 | 6% | 15 |
| sample.SpinBot 1.0 | 4 | 3% | 5 |
| jaybot.adv.bots.JayBot 2.0 | 3 | 2% | 12 |
| gh.mini.GrubbmOne 1.0 | 2 | 1% | 13 |

## Melee bench: F27

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 79.1 | 151 / 280 | 2.88 | 17.3% | 35769 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.4 | 17.3% | 151 |
| mk.Alpha 0.2.1 | 1.9 | 15.2% | 76 |
| wee.Gem 1.8.4 | 3.6 | 11.0% | 21 |
| EH.Eagle 1.0.6 | 4.4 | 10.4% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 4.5 | 10.2% | 16 |
| techdude.kombat.FlamingKombat 1.5 | 6.5 | 8.5% | 4 |
| joe.ADinosaur 1.0 | 6.9 | 8.4% | 2 |
| throxbot.ThroxBot 0.1 | 7.1 | 8.2% | 5 |
| caimano.Furia_Ceca 0.22 | 9.0 | 6.2% | 1 |
| cs.Grudge 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 78.4 | 16 / 35 | 4282 |
| 2 | 4 | 57.5 | 46.7 | 10 / 35 | 4253 |
| 3 | 1 | 68.3 | 87.0 | 23 / 35 | 4648 |
| 4 | 1 | 68.0 | 89.5 | 22 / 35 | 4406 |
| 5 | 1 | 66.6 | 82.9 | 19 / 35 | 4382 |
| 6 | 1 | 66.4 | 79.7 | 19 / 35 | 4516 |
| 7 | 1 | 67.3 | 83.8 | 21 / 35 | 4701 |
| 8 | 1 | 67.7 | 84.8 | 21 / 35 | 4581 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 116 | 68% |
| wee.Gem 1.8.4 | 22 | 91% |
| EH.Eagle 1.0.6 | 20 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 93% |
| joe.ADinosaur 1.0 | 7 | 100% |
| throxbot.ThroxBot 0.1 | 7 | 86% |
| techdude.kombat.FlamingKombat 1.5 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 131 of 280 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 59 | 45% | 130 |
| joe.ADinosaur 1.0 | 16 | 12% | 18 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 10% | 23 |
| throxbot.ThroxBot 0.1 | 11 | 8% | 15 |
| cs.Grudge 1.0 | 9 | 7% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 8 | 6% | 18 |
| wee.Gem 1.8.4 | 7 | 5% | 34 |
| caimano.Furia_Ceca 0.22 | 5 | 4% | 8 |
| EH.Eagle 1.0.6 | 3 | 2% | 24 |

## Melee bench: F28

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 88.0 | 172 / 280 | 2.08 | 18.7% | 34784 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 18.7% | 172 |
| kid.test.NightFox .2 | 2.0 | 15.4% | 51 |
| uji.Antique 1.0 | 3.1 | 11.8% | 22 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.5% | 22 |
| pfvicm.Sobieski 7.2.3b | 5.4 | 9.1% | 1 |
| ahr.ice.Ice 1.0.2 | 5.8 | 8.5% | 9 |
| amk.ChumbaWumba 0.3 | 6.6 | 7.9% | 3 |
| matt.advanced.Katana 1.0 | 8.1 | 6.7% | 0 |
| stelo.PianistNano 1.2 | 9.3 | 5.8% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 93.7 | 26 / 35 | 4605 |
| 2 | 1 | 67.0 | 85.4 | 17 / 35 | 4360 |
| 3 | 1 | 66.7 | 86.0 | 18 / 35 | 4002 |
| 4 | 1 | 69.8 | 93.7 | 23 / 35 | 4358 |
| 5 | 1 | 67.8 | 85.4 | 23 / 35 | 4326 |
| 6 | 1 | 67.8 | 84.8 | 19 / 35 | 4552 |
| 7 | 1 | 69.2 | 91.7 | 24 / 35 | 4455 |
| 8 | 1 | 67.2 | 83.2 | 22 / 35 | 4126 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 120 | 76% |
| uji.Antique 1.0 | 56 | 86% |
| qohnil.blot.BlotBot 3.61 | 22 | 55% |
| matt.advanced.Katana 1.0 | 7 | 100% |
| amk.ChumbaWumba 0.3 | 6 | 83% |
| ahr.ice.Ice 1.0.2 | 5 | 60% |
| pfvicm.Sobieski 7.2.3b | 4 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 108 of 280 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 44 | 41% | 111 |
| qohnil.blot.BlotBot 3.61 | 15 | 14% | 35 |
| uji.Antique 1.0 | 14 | 13% | 70 |
| pfvicm.Sobieski 7.2.3b | 14 | 13% | 19 |
| amk.ChumbaWumba 0.3 | 11 | 10% | 16 |
| ahr.ice.Ice 1.0.2 | 5 | 5% | 11 |
| stelo.Lifestealer 1.0 | 3 | 3% | 6 |
| stelo.PianistNano 1.2 | 2 | 2% | 3 |
| matt.advanced.Katana 1.0 | 0 | 0% | 6 |

## Melee bench: F29

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 78.4 | 101 / 280 | 2.94 | 17.2% | 37996 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.1 | 17.2% | 101 |
| zyx.mega.YersiniaPestis 3.1 | 2.4 | 14.9% | 89 |
| deewiant.Anomaly 0.2 | 2.5 | 14.2% | 71 |
| myl.micro.Troodon 1.10 | 4.1 | 12.3% | 6 |
| jok.PheonixM 0.1.2 | 5.1 | 10.3% | 5 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.1% | 1 |
| DBall.Anarchy 0.1 | 7.0 | 7.2% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 6.2% | 0 |
| ap.Frederick 1.1 | 9.1 | 5.2% | 2 |
| jangs.ns51 1.0 | 9.9 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 73.3 | 10 / 35 | 4215 |
| 2 | 1 | 67.6 | 81.3 | 15 / 35 | 4905 |
| 3 | 1 | 68.0 | 85.4 | 14 / 35 | 4912 |
| 4 | 1 | 68.4 | 85.7 | 16 / 35 | 5195 |
| 5 | 1 | 65.5 | 74.3 | 11 / 35 | 4756 |
| 6 | 2 | 62.1 | 68.3 | 7 / 35 | 3949 |
| 7 | 1 | 68.2 | 82.2 | 14 / 35 | 5187 |
| 8 | 1 | 66.4 | 76.8 | 14 / 35 | 4877 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 72 | 49% |
| zyx.mega.YersiniaPestis 3.1 | 48 | 25% |
| myl.micro.Troodon 1.10 | 34 | 100% |
| jok.PheonixM 0.1.2 | 13 | 85% |
| DBall.Anarchy 0.1 | 5 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 181 of 280 rounds, at a mean tick of 1005. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 73 | 40% | 116 |
| zyx.mega.YersiniaPestis 3.1 | 68 | 38% | 82 |
| jok.PheonixM 0.1.2 | 15 | 8% | 24 |
| myl.micro.Troodon 1.10 | 10 | 6% | 34 |
| jangs.ns51 1.0 | 5 | 3% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 5 | 3% | 5 |
| ph.melee.ArcherME 0.3 | 4 | 2% | 6 |
| DBall.Anarchy 0.1 | 1 | 1% | 7 |

## Melee bench: F30

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.4 | 55.2 | 28 / 280 | 5.04 | 11.8% | 30799 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 2.0 | 13.9% | 72 |
| catcat20.Matcha 0.006 | 2.1 | 14.2% | 76 |
| stelo.PastFuture 2.3.2 | 3.1 | 12.8% | 36 |
| oog.melee.Capulet 1.2 | 3.4 | 12.5% | 43 |
| hadur117.micro.SaorS2 0.1 | 4.4 | 11.8% | 28 |
| intruder.PrairieWolf 2.61 | 6.1 | 9.5% | 12 |
| ntc.Opposite 1.5 | 7.5 | 7.8% | 1 |
| tripphippy.Alice 1.1 | 8.1 | 7.4% | 7 |
| fowl3628800.LightningBolt 2.6.0 | 8.3 | 7.4% | 5 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.8 | 51.7 | 3 / 35 | 4042 |
| 2 | 5 | 55.4 | 55.2 | 1 / 35 | 3539 |
| 3 | 5 | 55.8 | 53.7 | 2 / 35 | 3865 |
| 4 | 5 | 53.1 | 48.6 | 2 / 35 | 3751 |
| 5 | 4 | 57.0 | 54.6 | 4 / 35 | 4072 |
| 6 | 4 | 56.2 | 54.0 | 3 / 35 | 3880 |
| 7 | 5 | 57.6 | 59.4 | 4 / 35 | 3733 |
| 8 | 2 | 60.1 | 64.1 | 9 / 35 | 3917 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 20 | 15% |
| darkcanuck.B26354 1.06 | 15 | 40% |
| oog.melee.Capulet 1.2 | 14 | 36% |
| stelo.PastFuture 2.3.2 | 10 | 60% |
| intruder.PrairieWolf 2.61 | 5 | 60% |
| tripphippy.Alice 1.1 | 3 | 67% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 252 of 280 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 62 | 25% | 63 |
| oog.melee.Capulet 1.2 | 57 | 23% | 64 |
| darkcanuck.B26354 1.06 | 44 | 17% | 50 |
| stelo.PastFuture 2.3.2 | 34 | 13% | 40 |
| tripphippy.Alice 1.1 | 15 | 6% | 17 |
| ntc.Opposite 1.5 | 13 | 5% | 15 |
| intruder.PrairieWolf 2.61 | 12 | 5% | 15 |
| fowl3628800.LightningBolt 2.6.0 | 10 | 4% | 10 |
| GarmBox.Anger 1.0 | 5 | 2% | 6 |

## Melee bench: F31

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 72.1 | 45 / 280 | 3.51 | 14.4% | 29539 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.6% | 166 |
| hadur117.micro.SaorS2 0.1 | 2.1 | 14.4% | 45 |
| gh.mini.Griezel 0.2 | 3.0 | 12.7% | 47 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.2% | 6 |
| spinnercat.micro.Tyger 0.1 | 4.8 | 10.7% | 10 |
| gh.nano.Grofvuil 0.2 | 5.9 | 9.2% | 4 |
| timmit.nano.TimDog 0.33 | 7.4 | 6.7% | 1 |
| fm.mammillarias 1.3 | 8.0 | 6.3% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.9 | 5.2% | 1 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 74.3 | 5 / 35 | 3583 |
| 2 | 2 | 64.2 | 78.4 | 8 / 35 | 3937 |
| 3 | 2 | 60.1 | 67.3 | 3 / 35 | 3648 |
| 4 | 2 | 62.5 | 73.3 | 7 / 35 | 3672 |
| 5 | 2 | 60.1 | 68.6 | 3 / 35 | 3655 |
| 6 | 2 | 62.7 | 72.7 | 7 / 35 | 3795 |
| 7 | 3 | 59.9 | 67.0 | 5 / 35 | 3335 |
| 8 | 2 | 63.6 | 75.6 | 7 / 35 | 3914 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 53 | 11% |
| gh.mini.Griezel 0.2 | 28 | 21% |
| spinnercat.micro.Tyger 0.1 | 18 | 89% |
| d414.nano.Quantum 1.0.0 | 9 | 89% |
| gh.nano.Grofvuil 0.2 | 7 | 86% |
| fm.mammillarias 1.3 | 1 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 235 of 280 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 118 | 50% | 123 |
| gh.mini.Griezel 0.2 | 51 | 22% | 58 |
| spinnercat.micro.Tyger 0.1 | 19 | 8% | 32 |
| d414.nano.Quantum 1.0.0 | 14 | 6% | 29 |
| gh.nano.Grofvuil 0.2 | 12 | 5% | 16 |
| timmit.nano.TimDog 0.33 | 12 | 5% | 13 |
| fm.mammillarias 1.3 | 5 | 2% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 78.4 | 112 / 280 | 2.94 | 16.7% | 38605 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.3 | 16.7% | 112 |
| kawigi.sbf.FloodHT 0.9.2 | 1.8 | 15.7% | 103 |
| apc.botM 3.0 | 3.1 | 12.3% | 24 |
| lxx.ConceptA 0.8 | 4.4 | 10.5% | 8 |
| vjik.UnViolation 1.1 | 4.5 | 10.5% | 17 |
| bayen.UbaMicro 1.4 | 6.3 | 8.3% | 8 |
| panzer.Panzer 0.2 | 7.4 | 7.3% | 0 |
| yk.JahMicro 1.0 | 7.9 | 6.8% | 5 |
| conscience.Electron 1.3g | 8.6 | 6.4% | 0 |
| donjezza.Jezza 1.0 | 9.9 | 5.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 74.3 | 13 / 35 | 4891 |
| 2 | 1 | 67.0 | 83.5 | 17 / 35 | 5170 |
| 3 | 1 | 67.2 | 81.6 | 17 / 35 | 5261 |
| 4 | 1 | 64.9 | 76.5 | 12 / 35 | 4980 |
| 5 | 2 | 62.8 | 72.7 | 14 / 35 | 4088 |
| 6 | 2 | 63.7 | 73.7 | 13 / 35 | 4387 |
| 7 | 1 | 66.7 | 85.7 | 12 / 35 | 5042 |
| 8 | 1 | 65.7 | 79.4 | 14 / 35 | 4786 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 89 | 30% |
| apc.botM 3.0 | 36 | 89% |
| lxx.ConceptA 0.8 | 29 | 90% |
| vjik.UnViolation 1.1 | 11 | 73% |
| bayen.UbaMicro 1.4 | 9 | 44% |
| donjezza.Jezza 1.0 | 6 | 83% |
| panzer.Panzer 0.2 | 5 | 100% |
| yk.JahMicro 1.0 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 170 of 280 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 83 | 49% | 114 |
| lxx.ConceptA 0.8 | 29 | 17% | 41 |
| vjik.UnViolation 1.1 | 17 | 10% | 38 |
| bayen.UbaMicro 1.4 | 13 | 8% | 15 |
| apc.botM 3.0 | 11 | 6% | 36 |
| conscience.Electron 1.3g | 9 | 5% | 15 |
| panzer.Panzer 0.2 | 6 | 4% | 7 |
| yk.JahMicro 1.0 | 1 | 1% | 6 |
| donjezza.Jezza 1.0 | 1 | 1% | 6 |

## Melee bench: F33

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 84.3 | 161 / 280 | 2.41 | 19.0% | 41717 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 19.0% | 161 |
| maribo.Quester 0.3 | 2.0 | 15.4% | 51 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.1 | 12.2% | 13 |
| labg.Cataclysm 2.05 | 4.5 | 10.6% | 26 |
| gre.svman4.Leonidas 1.3.2 | 4.8 | 10.4% | 16 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.1 | 9.0% | 6 |
| baal.nano.N 1.42 | 6.5 | 8.8% | 4 |
| zyx.micro.Ant 1.1 | 8.5 | 5.6% | 3 |
| sanja.First 0.1 | 8.8 | 5.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 85.1 | 15 / 35 | 5115 |
| 2 | 1 | 70.1 | 86.3 | 23 / 35 | 5467 |
| 3 | 1 | 66.7 | 78.4 | 17 / 35 | 4762 |
| 4 | 1 | 70.2 | 89.5 | 21 / 35 | 5205 |
| 5 | 1 | 66.0 | 75.2 | 16 / 35 | 5049 |
| 6 | 1 | 71.0 | 89.8 | 28 / 35 | 5672 |
| 7 | 1 | 69.3 | 85.1 | 21 / 35 | 5039 |
| 8 | 1 | 69.3 | 84.8 | 20 / 35 | 5408 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 80 | 69% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 51 | 98% |
| gre.svman4.Leonidas 1.3.2 | 31 | 87% |
| labg.Cataclysm 2.05 | 22 | 59% |
| kinsen.melee.Angsaichmophobia 1.8c | 13 | 69% |
| baal.nano.N 1.42 | 4 | 75% |
| sanja.First 0.1 | 3 | 100% |
| zyx.micro.Ant 1.1 | 2 | 50% |

Hadur died in 120 of 280 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 50 | 42% | 118 |
| labg.Cataclysm 2.05 | 19 | 16% | 30 |
| kinsen.melee.Angsaichmophobia 1.8c | 17 | 14% | 21 |
| gre.svman4.Leonidas 1.3.2 | 13 | 11% | 35 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 7 | 6% | 9 |
| zyx.micro.Ant 1.1 | 6 | 5% | 9 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 5 | 4% | 51 |
| baal.nano.N 1.42 | 3 | 3% | 6 |

## Melee bench: F34

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 77.1 | 46 / 280 | 3.06 | 15.9% | 38111 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.5 | 17.1% | 122 |
| kid.Gladiator .7.2 | 1.9 | 16.4% | 77 |
| hadur117.micro.SaorS2 0.1 | 2.6 | 15.9% | 46 |
| jcs.Seth 1.8 | 4.6 | 11.3% | 22 |
| tcf.Reach 3 | 4.8 | 10.5% | 9 |
| cli.Dancer 1.1 | 5.6 | 9.9% | 3 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.1 | 3.6% | 0 |
| sample.RamFire 1.0 | 9.9 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.9 | 74.6 | 5 / 35 | 4888 |
| 2 | 3 | 65.1 | 78.1 | 7 / 35 | 4351 |
| 3 | 1 | 64.8 | 73.7 | 7 / 35 | 5043 |
| 4 | 3 | 65.5 | 78.1 | 5 / 35 | 4550 |
| 5 | 3 | 63.8 | 72.7 | 5 / 35 | 4557 |
| 6 | 2 | 66.1 | 80.3 | 6 / 35 | 4693 |
| 7 | 3 | 66.0 | 78.4 | 5 / 35 | 4974 |
| 8 | 3 | 66.9 | 81.3 | 6 / 35 | 5055 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 75 | 25% |
| kid.Gladiator .7.2 | 43 | 23% |
| jcs.Seth 1.8 | 17 | 53% |
| tcf.Reach 3 | 6 | 67% |
| ratosh.Wesco 1.4 | 2 | 100% |
| cli.Dancer 1.1 | 2 | 50% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 234 of 280 rounds, at a mean tick of 989. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 99 | 42% | 115 |
| kid.Gladiator .7.2 | 84 | 36% | 94 |
| jcs.Seth 1.8 | 21 | 9% | 33 |
| tcf.Reach 3 | 16 | 7% | 22 |
| cli.Dancer 1.1 | 6 | 3% | 5 |
| ratosh.Wesco 1.4 | 4 | 2% | 7 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
| sample.VelociRobot 1.0 | 1 | 0% | 2 |
| sample.RamFire 1.0 | 1 | 0% | 0 |

## Melee bench: F35

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 68.2 | 24 / 280 | 3.86 | 13.4% | 27681 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 222 |
| hadur117.micro.SaorS2 0.1 | 2.4 | 13.4% | 24 |
| gh.mini.Gruwel 0.9 | 3.4 | 12.6% | 18 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.9 | 11.9% | 10 |
| rz.HawkOnFire 0.1 | 4.4 | 11.6% | 5 |
| myl.nano.KomoriNinja 1.1 | 6.3 | 7.3% | 0 |
| wit.Chuliath 1.0 | 7.3 | 6.7% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.9 | 6.3% | 1 |
| dans.Cinnamon 1.2 | 8.6 | 5.4% | 0 |
| stelo.MyAgileRobot 0.2 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 68.9 | 1 / 35 | 3819 |
| 2 | 2 | 61.1 | 72.4 | 3 / 35 | 3407 |
| 3 | 2 | 59.6 | 67.0 | 2 / 35 | 3237 |
| 4 | 2 | 62.2 | 73.7 | 6 / 35 | 3466 |
| 5 | 2 | 59.7 | 65.7 | 1 / 35 | 3575 |
| 6 | 2 | 61.8 | 71.4 | 5 / 35 | 3675 |
| 7 | 3 | 58.8 | 62.2 | 3 / 35 | 3456 |
| 8 | 4 | 58.6 | 64.1 | 3 / 35 | 3046 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 54 | 9% |
| rz.HawkOnFire 0.1 | 15 | 80% |
| gh.mini.Gruwel 0.9 | 13 | 23% |
| dmh.robocode.robot.BlackDeath 9.2 | 2 | 50% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 257 of 280 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 146 | 57% | 150 |
| dmh.robocode.robot.BlackDeath 9.2 | 35 | 14% | 40 |
| gh.mini.Gruwel 0.9 | 33 | 13% | 36 |
| rz.HawkOnFire 0.1 | 17 | 7% | 26 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8 | 3% | 9 |
| stelo.MyAgileRobot 0.2 | 7 | 3% | 7 |
| wit.Chuliath 1.0 | 4 | 2% | 5 |
| myl.nano.KomoriNinja 1.1 | 4 | 2% | 5 |
| dans.Cinnamon 1.2 | 3 | 1% | 2 |

## Melee bench: F36

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.5 | 213 / 280 | 1.95 | 20.5% | 44390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 20.5% | 213 |
| bzdp.Pansy 2.1 | 2.5 | 11.8% | 12 |
| alpha.RainingFire 1.0 | 2.9 | 11.5% | 19 |
| mz.Cork 0.1 | 4.1 | 10.7% | 12 |
| bvh.micro.Freya 0.3 | 5.0 | 10.4% | 5 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.6% | 9 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.0% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.4 | 6.5% | 3 |
| dl.BetterWalls 1.0 | 9.0 | 5.5% | 1 |
| sample.MyFirstRobot 1.0 | 9.6 | 4.6% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 87.9 | 27 / 35 | 5571 |
| 2 | 1 | 69.4 | 86.3 | 25 / 35 | 5243 |
| 3 | 1 | 70.9 | 92.1 | 27 / 35 | 5942 |
| 4 | 1 | 70.2 | 88.9 | 24 / 35 | 5600 |
| 5 | 1 | 70.1 | 86.7 | 27 / 35 | 5562 |
| 6 | 1 | 70.7 | 91.7 | 28 / 35 | 5278 |
| 7 | 1 | 71.6 | 93.7 | 30 / 35 | 5616 |
| 8 | 1 | 70.5 | 88.6 | 25 / 35 | 5578 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 63 | 97% |
| bvh.micro.Freya 0.3 | 46 | 100% |
| mz.Cork 0.1 | 37 | 86% |
| alpha.RainingFire 1.0 | 34 | 79% |
| bvh.mini.Fenrir 0.39 | 25 | 100% |
| m3thos.Eva02 0.7.1 | 19 | 84% |
| sample.MyFirstRobot 1.0 | 7 | 57% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 68 of 280 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 20 | 29% | 38 |
| mz.Cork 0.1 | 13 | 19% | 52 |
| bzdp.Pansy 2.1 | 8 | 12% | 65 |
| m3thos.Eva02 0.7.1 | 7 | 10% | 31 |
| bvh.micro.Freya 0.3 | 6 | 9% | 40 |
| bvh.mini.Fenrir 0.39 | 4 | 6% | 19 |
| dl.BetterWalls 1.0 | 4 | 6% | 15 |
| sample.MyFirstRobot 1.0 | 3 | 4% | 11 |
| squidM.TentalceMeleeNano 1.1 | 3 | 4% | 8 |

## Melee bench: F37

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 82.4 | 175 / 280 | 2.58 | 18.4% | 44314 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 18.4% | 175 |
| germ.TheMind .2 | 3.0 | 10.8% | 20 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.4 | 10.5% | 12 |
| EBBU.Sim2 1.02 | 3.5 | 10.1% | 10 |
| agrach.Dalek 1.0 | 4.8 | 9.6% | 26 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.7% | 14 |
| mb.Beast 0.1 | 7.3 | 8.4% | 9 |
| lmk.ACPFinal 0.1 | 7.5 | 8.2% | 4 |
| skm.Ryubot 1.0 | 8.4 | 7.9% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 7.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 89.2 | 26 / 35 | 5628 |
| 2 | 1 | 66.7 | 80.3 | 20 / 35 | 5601 |
| 3 | 1 | 63.4 | 69.5 | 17 / 35 | 4981 |
| 4 | 1 | 66.0 | 81.0 | 20 / 35 | 5048 |
| 5 | 1 | 67.1 | 81.9 | 21 / 35 | 5643 |
| 6 | 1 | 66.7 | 81.9 | 21 / 35 | 5537 |
| 7 | 1 | 69.1 | 87.9 | 21 / 35 | 6192 |
| 8 | 1 | 69.0 | 87.6 | 29 / 35 | 5684 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 51 | 84% |
| stelo.UntouchableNano 1.3 | 28 | 86% |
| EBBU.Sim2 1.02 | 27 | 85% |
| com.syncleus.robocode.Dreadnaught 0.1 | 21 | 95% |
| mb.Beast 0.1 | 20 | 100% |
| skm.Ryubot 1.0 | 20 | 80% |
| lmk.ACPFinal 0.1 | 17 | 100% |
| agrach.Dalek 1.0 | 14 | 71% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 105 of 280 rounds, at a mean tick of 408. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 24 | 23% | 47 |
| mn.nano.perceptual.Impact 1.3.0 | 21 | 20% | 23 |
| germ.TheMind .2 | 18 | 17% | 57 |
| com.syncleus.robocode.Dreadnaught 0.1 | 8 | 8% | 37 |
| EBBU.Sim2 1.02 | 8 | 8% | 29 |
| stelo.UntouchableNano 1.3 | 8 | 8% | 24 |
| mb.Beast 0.1 | 7 | 7% | 26 |
| skm.Ryubot 1.0 | 7 | 7% | 16 |
| lmk.ACPFinal 0.1 | 4 | 4% | 17 |

## Melee bench: F38

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 71.0 | 72 / 280 | 3.61 | 14.7% | 32869 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.1 | 17.2% | 135 |
| hadur117.micro.SaorS2 0.1 | 1.9 | 14.7% | 72 |
| bvh.mini.Freya 0.55 | 3.3 | 12.4% | 15 |
| bts.mega.Gnarly 1.4 | 4.1 | 11.5% | 29 |
| cs.Wren 1.0 | 4.9 | 10.3% | 7 |
| kdf.KoulDestroyer 1.0 | 6.3 | 9.5% | 12 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.6 | 9.2% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.9 | 6.5% | 3 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.3% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 79.7 | 15 / 35 | 4484 |
| 2 | 2 | 60.6 | 64.4 | 7 / 35 | 4230 |
| 3 | 2 | 62.5 | 72.4 | 10 / 35 | 3801 |
| 4 | 2 | 61.0 | 65.4 | 10 / 35 | 4059 |
| 5 | 2 | 61.1 | 66.7 | 9 / 35 | 4071 |
| 6 | 2 | 63.7 | 77.1 | 7 / 35 | 4108 |
| 7 | 2 | 63.5 | 77.1 | 9 / 35 | 4131 |
| 8 | 2 | 60.5 | 64.8 | 5 / 35 | 3985 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 71 | 24% |
| bvh.mini.Freya 0.55 | 18 | 89% |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 93% |
| bts.mega.Gnarly 1.4 | 15 | 33% |
| cs.Wren 1.0 | 10 | 100% |
| kdf.KoulDestroyer 1.0 | 5 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 208 of 280 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 113 | 54% | 132 |
| bvh.mini.Freya 0.55 | 31 | 15% | 39 |
| bts.mega.Gnarly 1.4 | 22 | 11% | 34 |
| cs.Wren 1.0 | 15 | 7% | 23 |
| kdf.KoulDestroyer 1.0 | 10 | 5% | 13 |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 4% | 24 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 2% | 11 |
| matt.UnderDark3 2.4.34 | 3 | 1% | 3 |
| bzdp.BoxCar 2.0 | 1 | 0% | 1 |

## Melee bench: F39

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 74.4 | 77 / 280 | 3.31 | 16.1% | 40271 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.4 | 16.1% | 77 |
| bvh.fry.Freya 0.82 | 2.0 | 15.0% | 41 |
| az.Ololobot 0.2.4 | 2.6 | 13.4% | 100 |
| catcat20.Lambda 0.024 | 4.1 | 10.7% | 37 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.5% | 6 |
| apollokidd.ApolloKidd 0.9 | 6.4 | 8.2% | 2 |
| gimp.GimpBot 0.1 | 6.8 | 8.2% | 3 |
| stelo.SoRobotNanoMelee 1.2 | 7.0 | 7.7% | 12 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.9 | 6.3% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.6 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 71.1 | 9 / 35 | 4758 |
| 2 | 1 | 64.4 | 76.2 | 12 / 35 | 4958 |
| 3 | 1 | 64.3 | 73.3 | 10 / 35 | 5266 |
| 4 | 1 | 63.9 | 72.4 | 8 / 35 | 5177 |
| 5 | 1 | 65.2 | 78.7 | 11 / 35 | 4928 |
| 6 | 3 | 60.7 | 64.8 | 5 / 35 | 4767 |
| 7 | 2 | 64.1 | 74.0 | 10 / 35 | 4916 |
| 8 | 1 | 67.0 | 84.4 | 12 / 35 | 5501 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 52 | 65% |
| az.Ololobot 0.2.4 | 46 | 13% |
| catcat20.Lambda 0.024 | 24 | 50% |
| stelo.SoRobotNanoMelee 1.2 | 18 | 89% |
| gimp.GimpBot 0.1 | 5 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 33% |

Hadur died in 204 of 280 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 60 | 29% | 92 |
| az.Ololobot 0.2.4 | 59 | 29% | 71 |
| catcat20.Lambda 0.024 | 35 | 17% | 43 |
| apollokidd.ApolloKidd 0.9 | 16 | 8% | 20 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 7% | 20 |
| gimp.GimpBot 0.1 | 6 | 3% | 12 |
| winamp32.micro.MicroMacro 1.0 | 6 | 3% | 11 |
| whitesquare.robots.SkynetAdvanced 1.1 | 6 | 3% | 8 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 1% | 2 |

## Melee bench: F40

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 79.9 | 141 / 280 | 2.81 | 17.7% | 38348 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 17.7% | 141 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.6% | 58 |
| kano.gamma.KanoGamma 1.8 | 3.1 | 12.4% | 29 |
| mz.AntiGrav 1.0 | 4.3 | 10.9% | 14 |
| Polkwane.SmashMelee 1.0 | 4.9 | 10.5% | 17 |
| stelo.Randomness 1.0 | 6.3 | 8.8% | 12 |
| alpha.BlackIce 1.0 | 6.5 | 8.7% | 6 |
| amk.superstrike.SuperStrike 0.3 | 8.3 | 6.5% | 2 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.8% | 2 |
| sample.Corners 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 70.5 | 16 / 35 | 4388 |
| 2 | 1 | 69.4 | 88.6 | 19 / 35 | 5221 |
| 3 | 1 | 65.3 | 76.2 | 14 / 35 | 4627 |
| 4 | 1 | 66.3 | 77.1 | 19 / 35 | 4702 |
| 5 | 1 | 65.9 | 79.4 | 14 / 35 | 4647 |
| 6 | 1 | 68.3 | 81.9 | 19 / 35 | 5039 |
| 7 | 1 | 68.6 | 85.1 | 20 / 35 | 4964 |
| 8 | 1 | 67.4 | 80.3 | 20 / 35 | 4760 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 69 | 54% |
| kano.gamma.KanoGamma 1.8 | 47 | 83% |
| mz.AntiGrav 1.0 | 40 | 95% |
| Polkwane.SmashMelee 1.0 | 21 | 76% |
| stelo.Randomness 1.0 | 7 | 86% |
| alpha.BlackIce 1.0 | 5 | 60% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |

Hadur died in 141 of 280 rounds, at a mean tick of 749. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 58 | 41% | 86 |
| kano.gamma.KanoGamma 1.8 | 23 | 16% | 61 |
| Polkwane.SmashMelee 1.0 | 15 | 11% | 22 |
| mz.AntiGrav 1.0 | 14 | 10% | 44 |
| stelo.Randomness 1.0 | 13 | 9% | 26 |
| amk.superstrike.SuperStrike 0.3 | 9 | 6% | 14 |
| alpha.BlackIce 1.0 | 8 | 6% | 16 |
| sample.Corners 1.0 | 1 | 1% | 6 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 5 |

## Melee bench: F41

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 71.0 | 95 / 280 | 3.61 | 15.5% | 36092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.3 | 16.2% | 115 |
| hadur117.micro.SaorS2 0.1 | 1.8 | 15.5% | 95 |
| ary.Swarm 1.1 | 3.3 | 12.9% | 20 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.7% | 24 |
| simonton.nano.MeleeSeed 1.8 | 5.5 | 10.0% | 18 |
| shrub.Silver v048 | 5.6 | 9.6% | 5 |
| zyx.nano.Ant 1.1 | 6.9 | 8.0% | 0 |
| jsal.Jsalbot 1.0 | 8.4 | 6.2% | 5 |
| stelo.Mirror 1.1 | 8.6 | 5.7% | 0 |
| acogdev.alpha 0.2 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 70.2 | 14 / 35 | 4364 |
| 2 | 2 | 62.8 | 66.7 | 8 / 35 | 4710 |
| 3 | 2 | 63.5 | 69.8 | 12 / 35 | 4391 |
| 4 | 1 | 62.9 | 67.9 | 12 / 35 | 4577 |
| 5 | 2 | 63.0 | 69.2 | 9 / 35 | 4505 |
| 6 | 2 | 64.8 | 74.6 | 15 / 35 | 4304 |
| 7 | 1 | 66.0 | 77.1 | 12 / 35 | 4977 |
| 8 | 2 | 64.3 | 72.7 | 13 / 35 | 4264 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 55 | 29% |
| lessonz.robocode.Oz 0.5.0 | 35 | 77% |
| ary.Swarm 1.1 | 31 | 87% |
| simonton.nano.MeleeSeed 1.8 | 21 | 90% |
| shrub.Silver v048 | 4 | 75% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 186 of 280 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 94 | 51% | 121 |
| simonton.nano.MeleeSeed 1.8 | 28 | 15% | 51 |
| ary.Swarm 1.1 | 22 | 12% | 44 |
| lessonz.robocode.Oz 0.5.0 | 21 | 11% | 34 |
| zyx.nano.Ant 1.1 | 9 | 5% | 11 |
| shrub.Silver v048 | 4 | 2% | 7 |
| acogdev.alpha 0.2 | 4 | 2% | 4 |
| jsal.Jsalbot 1.0 | 2 | 1% | 6 |
| stelo.Mirror 1.1 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 74.1 | 50 / 280 | 3.33 | 15.7% | 40110 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.1 | 17.0% | 131 |
| hadur117.micro.SaorS2 0.1 | 2.0 | 15.7% | 50 |
| ara.Shera 0.88 | 3.4 | 13.2% | 44 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.7% | 44 |
| amz.NanoClone 1.41 | 5.3 | 9.0% | 1 |
| dsw.StaticD 1.0 | 6.4 | 7.5% | 8 |
| maribo.IotaCT 1.1 | 6.8 | 7.6% | 2 |
| stelo.MirrorMicro 1.0 | 7.6 | 6.6% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 75.6 | 8 / 35 | 5118 |
| 2 | 2 | 65.6 | 79.0 | 6 / 35 | 5401 |
| 3 | 2 | 63.2 | 72.1 | 5 / 35 | 4713 |
| 4 | 2 | 62.7 | 70.8 | 4 / 35 | 4772 |
| 5 | 2 | 63.5 | 69.5 | 8 / 35 | 4850 |
| 6 | 2 | 65.7 | 78.4 | 7 / 35 | 5417 |
| 7 | 3 | 62.6 | 72.1 | 2 / 35 | 4580 |
| 8 | 1 | 65.4 | 75.2 | 10 / 35 | 5259 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 59 | 17% |
| maribo.mini.MiniQuester 0.1 | 37 | 57% |
| ara.Shera 0.88 | 28 | 46% |
| dsw.StaticD 1.0 | 6 | 83% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 230 of 280 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 109 | 47% | 121 |
| ara.Shera 0.88 | 52 | 23% | 64 |
| maribo.mini.MiniQuester 0.1 | 43 | 19% | 62 |
| amz.NanoClone 1.41 | 11 | 5% | 11 |
| dsw.StaticD 1.0 | 8 | 3% | 14 |
| maribo.IotaCT 1.1 | 4 | 2% | 4 |
| stelo.MirrorMicro 1.0 | 2 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 0% | 2 |

## Melee bench: F43

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 72.3 | 19 / 280 | 3.49 | 14.0% | 29612 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.6% | 222 |
| hadur117.micro.SaorS2 0.1 | 2.1 | 14.0% | 19 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.4% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 4.1 | 11.1% | 5 |
| dummy.micro.Sparrow 2.5 | 4.9 | 10.9% | 5 |
| Krabb.akim2.Akim2 1.1b | 5.9 | 10.0% | 6 |
| mz.NanoGod 2.02 | 7.4 | 7.3% | 0 |
| jab.DiamondStealer 5 | 7.6 | 7.6% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 77.1 | 5 / 35 | 3815 |
| 2 | 2 | 62.8 | 71.1 | 5 / 35 | 3692 |
| 3 | 3 | 62.0 | 71.7 | 2 / 35 | 3446 |
| 4 | 2 | 62.3 | 72.1 | 1 / 35 | 3628 |
| 5 | 2 | 62.0 | 67.6 | 1 / 35 | 3747 |
| 6 | 2 | 63.0 | 70.8 | 4 / 35 | 3810 |
| 7 | 2 | 62.3 | 72.4 | 0 / 35 | 3666 |
| 8 | 2 | 63.9 | 75.9 | 1 / 35 | 3808 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 79 | 4% |
| brainfade.melee.Dusk 0.44 | 14 | 57% |
| dummy.micro.Sparrow 2.5 | 6 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 0% |
| Krabb.akim2.Akim2 1.1b | 3 | 33% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 261 of 280 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 178 | 68% | 181 |
| brainfade.melee.Dusk 0.44 | 26 | 10% | 34 |
| wcsv.melee.EngineerMelee 0.1 | 26 | 10% | 26 |
| dummy.micro.Sparrow 2.5 | 14 | 5% | 19 |
| mz.NanoGod 2.02 | 8 | 3% | 9 |
| Krabb.akim2.Akim2 1.1b | 6 | 2% | 7 |
| jab.DiamondStealer 5 | 3 | 1% | 3 |
| cvt.Firsty 1.0 | 0 | 0% | 1 |

## Melee bench: F44

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 83.1 | 133 / 280 | 2.52 | 18.6% | 45217 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 18.6% | 133 |
| stelo.Liblix 0.3.1 | 2.0 | 15.4% | 100 |
| tzu.TheArtOfWar 1.2 | 3.0 | 12.9% | 28 |
| wompi.Quokka 1.6 | 4.6 | 9.9% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.4 | 9.2% | 1 |
| jwirde.Gort 2.0 | 5.5 | 9.5% | 10 |
| disan.Chair 2.2.0 | 6.9 | 7.8% | 1 |
| stf.PanzerGeneral 0.1 | 7.6 | 7.0% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.8% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 70.2 | 12 / 35 | 5248 |
| 2 | 1 | 68.8 | 85.1 | 17 / 35 | 5880 |
| 3 | 1 | 69.4 | 85.7 | 18 / 35 | 5925 |
| 4 | 1 | 68.9 | 84.8 | 18 / 35 | 5746 |
| 5 | 1 | 69.0 | 87.3 | 18 / 35 | 5751 |
| 6 | 1 | 68.8 | 85.1 | 19 / 35 | 5601 |
| 7 | 1 | 68.9 | 84.4 | 16 / 35 | 5689 |
| 8 | 1 | 67.9 | 82.5 | 15 / 35 | 5377 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 89 | 38% |
| tzu.TheArtOfWar 1.2 | 71 | 75% |
| jwirde.Gort 2.0 | 16 | 69% |
| wompi.Quokka 1.6 | 13 | 92% |
| disan.Chair 2.2.0 | 10 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 148 of 280 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 73 | 49% | 125 |
| tzu.TheArtOfWar 1.2 | 38 | 26% | 80 |
| jwirde.Gort 2.0 | 11 | 7% | 29 |
| wompi.Quokka 1.6 | 8 | 5% | 15 |
| stf.PanzerGeneral 0.1 | 8 | 5% | 11 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 3% | 10 |
| disan.Chair 2.2.0 | 4 | 3% | 8 |
| sample.Crazy 1.0 | 1 | 1% | 1 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |

## Melee bench: F45

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 87.2 | 130 / 280 | 2.15 | 19.9% | 47618 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS2 0.1 | 1.0 | 19.9% | 130 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 12.5% | 125 |
| jje.BagPuss 1.2 | 2.8 | 11.8% | 9 |
| myl.nano.Graviton 1.10 | 4.3 | 10.5% | 4 |
| sul.Lunar 1.1 | 4.9 | 10.2% | 9 |
| hvilela.HVilela 0.9 | 6.3 | 8.7% | 1 |
| fm.claire 1.7 | 6.8 | 8.4% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.9 | 7.0% | 1 |
| wit.Deep7 2.0 | 9.0 | 6.0% | 0 |
| abud.ThirdRobo 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 85.7 | 15 / 35 | 5942 |
| 2 | 1 | 70.4 | 87.0 | 19 / 35 | 6205 |
| 3 | 1 | 68.7 | 87.0 | 14 / 35 | 5451 |
| 4 | 1 | 69.2 | 86.3 | 12 / 35 | 6096 |
| 5 | 1 | 69.7 | 86.0 | 16 / 35 | 6255 |
| 6 | 1 | 69.5 | 86.0 | 13 / 35 | 5932 |
| 7 | 1 | 71.7 | 92.7 | 23 / 35 | 6300 |
| 8 | 1 | 69.0 | 86.7 | 18 / 35 | 5437 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 136 | 32% |
| jje.BagPuss 1.2 | 31 | 84% |
| sul.Lunar 1.1 | 24 | 96% |
| myl.nano.Graviton 1.10 | 17 | 82% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 100% |
| fm.claire 1.7 | 5 | 80% |
| wit.Deep7 2.0 | 4 | 100% |
| hvilela.HVilela 0.9 | 4 | 100% |

Hadur died in 150 of 280 rounds, at a mean tick of 2032. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 93 | 62% | 0 |
| jje.BagPuss 1.2 | 17 | 11% | 90 |
| sul.Lunar 1.1 | 9 | 6% | 67 |
| myl.nano.Graviton 1.10 | 9 | 6% | 43 |
| hvilela.HVilela 0.9 | 9 | 6% | 18 |
| fm.claire 1.7 | 6 | 4% | 22 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 3% | 26 |
| wit.Deep7 2.0 | 2 | 1% | 10 |
| abud.ThirdRobo 1.0 | 1 | 1% | 3 |

## Melee bench: F46

hadur117.micro.SaorS2 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 67.1 | 21 / 280 | 3.96 | 13.8% | 34151 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.7% | 121 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.4% | 109 |
| hadur117.micro.SaorS2 0.1 | 3.0 | 13.8% | 21 |
| mz.MicroSheep 1.0 | 4.4 | 10.8% | 6 |
| cx.Princess 1.0 | 4.8 | 9.9% | 20 |
| sadoner.killer 0.2 | 5.9 | 9.1% | 2 |
| arthord.NanoSatanMelee Beta | 7.3 | 7.0% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.4% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 62.2 | 2 / 35 | 4028 |
| 2 | 3 | 61.2 | 67.9 | 1 / 35 | 4312 |
| 3 | 3 | 61.2 | 68.3 | 3 / 35 | 4097 |
| 4 | 3 | 59.8 | 60.3 | 3 / 35 | 4156 |
| 5 | 3 | 60.0 | 65.1 | 3 / 35 | 3987 |
| 6 | 3 | 61.0 | 67.0 | 4 / 35 | 4427 |
| 7 | 3 | 62.2 | 69.5 | 2 / 35 | 4519 |
| 8 | 3 | 64.0 | 76.2 | 3 / 35 | 4625 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 50 | 18% |
| rsalesc.melee.Medina 0.4.5 | 28 | 18% |
| mz.MicroSheep 1.0 | 5 | 100% |
| cx.Princess 1.0 | 3 | 33% |
| sadoner.killer 0.2 | 2 | 50% |

Hadur died in 259 of 280 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 123 | 47% | 136 |
| rsalesc.melee.Medina 0.4.5 | 67 | 26% | 72 |
| cx.Princess 1.0 | 17 | 7% | 17 |
| sadoner.killer 0.2 | 15 | 6% | 15 |
| arthord.NanoSatanMelee Beta | 13 | 5% | 13 |
| mz.MicroSheep 1.0 | 8 | 3% | 11 |
| kurios.DOSexe .9a | 8 | 3% | 7 |
| mbro.Detektor3 0.1.1 | 5 | 2% | 5 |
| jeremyreeder.collective.Prophet 5 | 3 | 1% | 4 |

