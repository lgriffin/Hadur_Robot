# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 74.3 | 34 / 350 | 3.32 | 14.1% | 39101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 21.1% | 269 |
| hadur117.nano.SanaroGG 0.1 | 2.0 | 14.1% | 34 |
| mz.MicroGodMelee 1 | 3.5 | 11.6% | 11 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.6 | 11.2% | 10 |
| lorneswork.Predator 1.0 | 5.2 | 10.5% | 10 |
| sgp.JollyNinja 3.53 | 5.7 | 10.2% | 11 |
| adt.Ar2 1.0 | 7.0 | 7.6% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.8% | 1 |
| skm.butterfly 1.0 | 8.9 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 77.8 | 6 / 35 | 4008 |
| 2 | 2 | 61.2 | 70.2 | 4 / 35 | 4095 |
| 3 | 2 | 61.6 | 74.0 | 1 / 35 | 3791 |
| 4 | 2 | 62.4 | 75.6 | 3 / 35 | 4030 |
| 5 | 2 | 58.4 | 63.5 | 2 / 35 | 3666 |
| 6 | 2 | 63.2 | 79.7 | 6 / 35 | 3710 |
| 7 | 2 | 61.8 | 74.3 | 2 / 35 | 3655 |
| 8 | 2 | 61.5 | 72.7 | 1 / 35 | 3907 |
| 9 | 2 | 63.3 | 77.5 | 7 / 35 | 4314 |
| 10 | 2 | 62.7 | 77.5 | 2 / 35 | 3925 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 154 | 5% |
| mz.MicroGodMelee 1 | 13 | 62% |
| sgp.JollyNinja 3.53 | 12 | 67% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 71% |
| lorneswork.Predator 1.0 | 6 | 50% |
| adt.Ar2 1.0 | 2 | 100% |
| mym.EdgeStalker 1.0 | 2 | 0% |
| skm.butterfly 1.0 | 1 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 0% |

Hadur died in 316 of 350 rounds, at a mean tick of 1117. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 182 | 58% | 192 |
| simonton.nano.WeekendObsession_Melee 1.0 | 41 | 13% | 43 |
| lorneswork.Predator 1.0 | 30 | 9% | 35 |
| sgp.JollyNinja 3.53 | 22 | 7% | 29 |
| mz.MicroGodMelee 1 | 15 | 5% | 24 |
| adt.Ar2 1.0 | 13 | 4% | 14 |
| kawigi.sbf.FloodSonnet 0.9 | 9 | 3% | 9 |
| mym.EdgeStalker 1.0 | 4 | 1% | 4 |

## Melee bench: F02

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 69.2 | 71 / 350 | 3.77 | 14.5% | 43998 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.9 | 15.0% | 103 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.9 | 14.9% | 94 |
| hadur117.nano.SanaroGG 0.1 | 2.2 | 14.5% | 71 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 11.2% | 5 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.1 | 9.7% | 23 |
| fnc.bandit.Bandit 5.2.0 | 6.5 | 8.3% | 5 |
| Noran.BitchingElk 0.054 | 7.6 | 7.5% | 16 |
| stelo.PatternRobot 1.0 | 7.8 | 7.0% | 12 |
| sch.Simone 0.3d | 7.8 | 7.4% | 17 |
| fullsail.SweetTea 1.1 | 10.0 | 4.6% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 72.7 | 9 / 35 | 4444 |
| 2 | 2 | 64.7 | 77.8 | 10 / 35 | 4508 |
| 3 | 1 | 63.8 | 74.0 | 14 / 35 | 4515 |
| 4 | 3 | 57.1 | 58.4 | 4 / 35 | 3928 |
| 5 | 3 | 59.6 | 64.1 | 4 / 35 | 4161 |
| 6 | 3 | 62.3 | 72.1 | 3 / 35 | 4592 |
| 7 | 1 | 62.2 | 70.8 | 8 / 35 | 4813 |
| 8 | 3 | 60.9 | 66.3 | 7 / 35 | 4261 |
| 9 | 1 | 62.4 | 69.5 | 10 / 35 | 4672 |
| 10 | 3 | 59.3 | 66.0 | 2 / 35 | 4104 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 57 | 56% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 45 | 13% |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 63% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 92% |
| sch.Simone 0.3d | 11 | 64% |
| stelo.PatternRobot 1.0 | 6 | 33% |
| Noran.BitchingElk 0.054 | 4 | 25% |
| fullsail.SweetTea 1.1 | 3 | 0% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 280 of 350 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 81 | 29% | 91 |
| pulsar.PulsarMax 0.8.9 | 68 | 24% | 97 |
| lrem.micro.SpikeSoldier 0.4 | 39 | 14% | 46 |
| stelo.PatternRobot 1.0 | 23 | 8% | 26 |
| com.cohesiva.robocode.ManOwaR 1.0 | 21 | 8% | 30 |
| sch.Simone 0.3d | 19 | 7% | 27 |
| fnc.bandit.Bandit 5.2.0 | 16 | 6% | 17 |
| Noran.BitchingElk 0.054 | 7 | 3% | 10 |
| fullsail.SweetTea 1.1 | 5 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 78.3 | 62 / 350 | 2.95 | 15.1% | 43079 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 2.0 | 15.0% | 95 |
| hadur117.nano.SanaroGG 0.1 | 2.0 | 15.1% | 62 |
| radnor.DoctorBob 1.42 | 2.4 | 14.9% | 95 |
| vuen.Cake 2.51 | 3.6 | 13.1% | 80 |
| urdos.URDOS 1.3 | 5.0 | 10.6% | 15 |
| adt.Ar1 2.1 | 6.3 | 7.6% | 1 |
| oa.weak.FlyMk1 0.1 | 7.0 | 7.0% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.5% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.1 | 5.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.6 | 75.2 | 7 / 35 | 4223 |
| 2 | 2 | 61.2 | 74.0 | 5 / 35 | 4044 |
| 3 | 1 | 64.2 | 81.0 | 8 / 35 | 4513 |
| 4 | 1 | 65.2 | 85.4 | 11 / 35 | 4462 |
| 5 | 1 | 65.3 | 84.1 | 10 / 35 | 4754 |
| 6 | 3 | 60.8 | 72.1 | 3 / 35 | 4066 |
| 7 | 2 | 61.6 | 73.0 | 5 / 35 | 4358 |
| 8 | 2 | 63.6 | 79.0 | 4 / 35 | 4594 |
| 9 | 2 | 62.6 | 79.4 | 6 / 35 | 4102 |
| 10 | 3 | 62.3 | 80.3 | 3 / 35 | 3963 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 60 | 37% |
| radnor.DoctorBob 1.42 | 55 | 36% |
| kawigi.nano.Lib 1.0 | 51 | 6% |
| urdos.URDOS 1.3 | 15 | 60% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 289 of 350 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 98 | 34% | 104 |
| radnor.DoctorBob 1.42 | 77 | 27% | 92 |
| vuen.Cake 2.51 | 49 | 17% | 69 |
| urdos.URDOS 1.3 | 33 | 11% | 42 |
| adt.Ar1 2.1 | 13 | 4% | 17 |
| oa.weak.FlyMk1 0.1 | 7 | 2% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 2% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 4 | 1% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 1% | 4 |

## Melee bench: F04

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 72.9 | 7 / 350 | 3.44 | 14.2% | 44884 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.9% | 313 |
| hadur117.nano.SanaroGG 0.1 | 2.4 | 14.2% | 7 |
| apc.LeeroyJenkins2 1.0 | 2.6 | 14.1% | 18 |
| TNT.TNT 0.99.1 | 4.0 | 10.3% | 5 |
| josago.Jorgito 0.16 | 5.4 | 8.5% | 1 |
| css.Delitioner 0.11 | 5.8 | 8.0% | 3 |
| tj.zombie1n 1.0.1 | 7.1 | 6.8% | 1 |
| rampancy.Durandal 2.1d | 7.8 | 5.7% | 1 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.6% | 0 |
| spin.Bugstard 0.012b | 9.9 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.9 | 73.3 | 1 / 35 | 4450 |
| 2 | 2 | 63.7 | 75.6 | 0 / 35 | 4769 |
| 3 | 2 | 62.1 | 71.4 | 0 / 35 | 4310 |
| 4 | 2 | 64.3 | 76.8 | 1 / 35 | 4766 |
| 5 | 2 | 63.4 | 73.7 | 1 / 35 | 4647 |
| 6 | 2 | 64.9 | 77.1 | 2 / 35 | 4938 |
| 7 | 3 | 58.9 | 63.2 | 0 / 35 | 4057 |
| 8 | 3 | 60.8 | 67.9 | 0 / 35 | 4226 |
| 9 | 2 | 64.0 | 77.1 | 0 / 35 | 4382 |
| 10 | 3 | 62.5 | 72.7 | 2 / 35 | 4339 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 141 | 1% |
| apc.LeeroyJenkins2 1.0 | 9 | 44% |
| josago.Jorgito 0.16 | 1 | 100% |
| TNT.TNT 0.99.1 | 1 | 0% |
| tj.zombie1n 1.0.1 | 1 | 0% |

Hadur died in 343 of 350 rounds, at a mean tick of 1229. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 234 | 68% | 237 |
| apc.LeeroyJenkins2 1.0 | 49 | 14% | 52 |
| josago.Jorgito 0.16 | 22 | 6% | 23 |
| TNT.TNT 0.99.1 | 12 | 3% | 12 |
| css.Delitioner 0.11 | 8 | 2% | 8 |
| tj.zombie1n 1.0.1 | 8 | 2% | 8 |
| rampancy.Durandal 2.1d | 8 | 2% | 8 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 72.5 | 77 / 350 | 3.47 | 14.0% | 33649 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.2 | 16.0% | 98 |
| origin.SleepSiphon 1.7b | 2.4 | 14.3% | 99 |
| hadur117.nano.SanaroGG 0.1 | 2.9 | 14.0% | 77 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.6 | 12.7% | 51 |
| mld.Wisdom 1.0 | 4.9 | 10.9% | 8 |
| gg.Wolverine 2.0 | 6.8 | 8.0% | 5 |
| spinnercat.Omen 1.0 | 7.2 | 7.4% | 2 |
| DBall.NUKE 0.1 | 7.4 | 7.3% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 8.6 | 6.5% | 5 |
| sample.Fire 1.0 | 10.0 | 3.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 76.2 | 7 / 35 | 3413 |
| 2 | 3 | 61.2 | 73.3 | 6 / 35 | 3484 |
| 3 | 4 | 57.3 | 61.9 | 5 / 35 | 3292 |
| 4 | 2 | 63.5 | 78.7 | 8 / 35 | 3695 |
| 5 | 4 | 61.3 | 72.1 | 10 / 35 | 3224 |
| 6 | 3 | 62.7 | 75.6 | 12 / 35 | 3344 |
| 7 | 3 | 60.3 | 70.8 | 7 / 35 | 3267 |
| 8 | 3 | 60.7 | 72.4 | 8 / 35 | 3208 |
| 9 | 3 | 59.8 | 69.2 | 8 / 35 | 3188 |
| 10 | 2 | 62.1 | 74.9 | 6 / 35 | 3534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 52 | 38% |
| jekl.StoneGhost 0.7 | 50 | 48% |
| pe.minimelee.SandboxMiniMelee 1.1 | 41 | 46% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 100% |
| mld.Wisdom 1.0 | 5 | 60% |
| DBall.NUKE 0.1 | 4 | 50% |
| gg.Wolverine 2.0 | 3 | 67% |
| spinnercat.Omen 1.0 | 2 | 50% |

Hadur died in 273 of 350 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 81 | 30% | 100 |
| origin.SleepSiphon 1.7b | 73 | 27% | 95 |
| pe.minimelee.SandboxMiniMelee 1.1 | 51 | 19% | 71 |
| mld.Wisdom 1.0 | 32 | 12% | 36 |
| spinnercat.Omen 1.0 | 13 | 5% | 15 |
| gg.Wolverine 2.0 | 11 | 4% | 12 |
| DBall.NUKE 0.1 | 7 | 3% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 1% | 10 |
| sample.Fire 1.0 | 1 | 0% | 1 |

## Melee bench: F07

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 81.5 | 94 / 350 | 2.67 | 16.7% | 50925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.4 | 18.0% | 111 |
| rtk.Tachikoma 1.0 | 1.9 | 17.7% | 89 |
| hadur117.nano.SanaroGG 0.1 | 2.7 | 16.7% | 94 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.9% | 27 |
| franzor.Lizt 1.3.1 | 4.8 | 11.1% | 31 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 7.9% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.4% | 1 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.4 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.6 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 67.0 | 82.2 | 11 / 35 | 4548 |
| 2 | 3 | 66.9 | 81.0 | 9 / 35 | 4797 |
| 3 | 3 | 67.2 | 81.3 | 9 / 35 | 4913 |
| 4 | 3 | 65.9 | 77.8 | 6 / 35 | 4768 |
| 5 | 3 | 66.9 | 81.6 | 11 / 35 | 4799 |
| 6 | 2 | 67.9 | 81.3 | 12 / 35 | 5211 |
| 7 | 3 | 67.0 | 78.1 | 10 / 35 | 5404 |
| 8 | 2 | 66.7 | 80.0 | 10 / 35 | 5154 |
| 9 | 3 | 67.8 | 83.8 | 7 / 35 | 5073 |
| 10 | 2 | 70.2 | 87.9 | 9 / 35 | 6258 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 100 | 63% |
| rsalesc.melee.Monk 0.3.6c | 58 | 7% |
| oog.melee.CapuletDroid 1.1 | 26 | 69% |
| franzor.Lizt 1.3.1 | 11 | 64% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 256 of 350 rounds, at a mean tick of 1298. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 119 | 46% | 191 |
| rsalesc.melee.Monk 0.3.6c | 99 | 39% | 105 |
| oog.melee.CapuletDroid 1.1 | 24 | 9% | 39 |
| franzor.Lizt 1.3.1 | 6 | 2% | 3 |
| exauge.GateKeeper 1.1.121g | 4 | 2% | 5 |
| lrem.micro.MoggFanatic 0.2 | 4 | 2% | 4 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 72.3 | 93 / 350 | 3.49 | 14.3% | 35356 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroGG 0.1 | 1.8 | 14.3% | 93 |
| tm.Yuugao 1.0 | 1.9 | 13.8% | 96 |
| shrub.Vapour v159 | 2.3 | 13.3% | 73 |
| Krabb.sliNk.Garm 0.9u | 4.5 | 10.8% | 27 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 9.8% | 30 |
| m3thos.Eva00 1.1 | 6.0 | 9.2% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 6.6 | 8.5% | 16 |
| SHAM.WOW 1.4 | 8.5 | 7.0% | 2 |
| zyx.nano.BacillusComma 1.0 | 8.8 | 6.8% | 3 |
| qualidafial.MajorDick 1.0.1 | 9.3 | 6.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.8 | 74.3 | 14 / 35 | 3416 |
| 2 | 3 | 60.2 | 68.3 | 8 / 35 | 3830 |
| 3 | 1 | 64.7 | 83.2 | 13 / 35 | 3959 |
| 4 | 3 | 57.1 | 63.5 | 7 / 35 | 3285 |
| 5 | 3 | 58.5 | 66.7 | 8 / 35 | 3343 |
| 6 | 2 | 60.2 | 71.7 | 6 / 35 | 3379 |
| 7 | 1 | 62.6 | 75.2 | 12 / 35 | 3906 |
| 8 | 1 | 61.2 | 74.6 | 11 / 35 | 3499 |
| 9 | 1 | 60.4 | 75.2 | 7 / 35 | 3296 |
| 10 | 2 | 60.3 | 70.2 | 7 / 35 | 3443 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 73 | 44% |
| shrub.Vapour v159 | 27 | 44% |
| com.spp.robocode.MostlyHarmless 010 | 23 | 48% |
| Krabb.sliNk.Garm 0.9u | 19 | 74% |
| jwst.DAD.DarkAndDarker 1.1 | 16 | 88% |
| m3thos.Eva00 1.1 | 12 | 50% |
| SHAM.WOW 1.4 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 50% |

Hadur died in 259 of 350 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 77 | 30% | 116 |
| shrub.Vapour v159 | 53 | 20% | 67 |
| com.spp.robocode.MostlyHarmless 010 | 37 | 14% | 44 |
| Krabb.sliNk.Garm 0.9u | 26 | 10% | 32 |
| zyx.nano.BacillusComma 1.0 | 22 | 8% | 25 |
| m3thos.Eva00 1.1 | 21 | 8% | 28 |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 5% | 26 |
| qualidafial.MajorDick 1.0.1 | 5 | 2% | 5 |
| SHAM.WOW 1.4 | 4 | 2% | 7 |

## Melee bench: F09

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 64.1 | 38 / 350 | 4.23 | 12.4% | 31229 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.8% | 182 |
| kc.micro.Figment 1.0 | 2.0 | 14.8% | 75 |
| hadur117.nano.SanaroGG 0.1 | 3.2 | 12.4% | 38 |
| yagami.Tidus 0.11 | 4.4 | 10.7% | 6 |
| pedersen.Grishnakh 1.0 | 4.9 | 10.5% | 24 |
| mc2.enemy.Original 0.9 | 5.6 | 9.6% | 23 |
| dft.Calliope 5.6 | 6.9 | 8.1% | 3 |
| step.nanoPri 1.0 | 8.3 | 5.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.4% | 0 |
| rdm.Dueler 0.4x | 9.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 67.9 | 4 / 35 | 3452 |
| 2 | 3 | 58.4 | 65.4 | 3 / 35 | 3252 |
| 3 | 3 | 60.4 | 70.8 | 7 / 35 | 3125 |
| 4 | 3 | 55.6 | 58.1 | 2 / 35 | 2945 |
| 5 | 3 | 59.7 | 68.9 | 4 / 35 | 3324 |
| 6 | 3 | 56.7 | 61.0 | 5 / 35 | 2859 |
| 7 | 4 | 56.5 | 59.4 | 3 / 35 | 3176 |
| 8 | 4 | 54.9 | 57.8 | 1 / 35 | 2943 |
| 9 | 3 | 58.5 | 65.4 | 3 / 35 | 3292 |
| 10 | 3 | 58.6 | 66.7 | 6 / 35 | 2861 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 64 | 30% |
| kc.micro.Figment 1.0 | 39 | 21% |
| yagami.Tidus 0.11 | 8 | 75% |
| pedersen.Grishnakh 1.0 | 7 | 43% |
| mc2.enemy.Original 0.9 | 6 | 17% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 313 of 350 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 96 | 31% | 116 |
| kc.micro.Figment 1.0 | 85 | 27% | 94 |
| yagami.Tidus 0.11 | 42 | 13% | 47 |
| mc2.enemy.Original 0.9 | 28 | 9% | 29 |
| pedersen.Grishnakh 1.0 | 26 | 8% | 27 |
| dft.Calliope 5.6 | 11 | 4% | 13 |
| step.nanoPri 1.0 | 11 | 4% | 11 |
| robar.nano.Assertive_Melee 0.2 | 9 | 3% | 9 |
| rdm.Dueler 0.4x | 4 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 77.9 | 91 / 350 | 2.99 | 15.2% | 42190 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| DTF.Kludgy 1.2b | 1.5 | 15.5% | 105 |
| hadur117.nano.SanaroGG 0.1 | 1.6 | 15.2% | 91 |
| ne.Chimera 1.2 | 3.4 | 13.1% | 42 |
| ejb.Polaris 1.0.1 | 3.5 | 12.9% | 44 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.6% | 25 |
| vStar.RAFzilla 2.15 | 5.5 | 10.5% | 30 |
| sam.Samspin 1.0 | 7.2 | 6.7% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.6% | 0 |
| kurios.DOSexe .9b | 8.8 | 5.3% | 6 |
| donjezza.Muncho 1.0 | 9.5 | 4.6% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 75.9 | 7 / 35 | 4155 |
| 2 | 2 | 62.3 | 73.7 | 11 / 35 | 4039 |
| 3 | 1 | 65.0 | 83.2 | 10 / 35 | 4781 |
| 4 | 1 | 63.8 | 80.3 | 8 / 35 | 4310 |
| 5 | 2 | 63.6 | 78.7 | 9 / 35 | 4231 |
| 6 | 2 | 60.8 | 72.7 | 6 / 35 | 3750 |
| 7 | 1 | 64.2 | 78.7 | 13 / 35 | 4225 |
| 8 | 1 | 64.2 | 79.0 | 10 / 35 | 4496 |
| 9 | 2 | 62.5 | 77.5 | 8 / 35 | 3872 |
| 10 | 2 | 63.7 | 79.4 | 9 / 35 | 4331 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 64 | 31% |
| ejb.Polaris 1.0.1 | 46 | 72% |
| vStar.RAFzilla 2.15 | 27 | 48% |
| tvv.micro.Antares 1.1.1 | 22 | 45% |
| ne.Chimera 1.2 | 21 | 29% |
| donjezza.Muncho 1.0 | 6 | 33% |
| kurios.DOSexe .9b | 4 | 50% |
| sam.Samspin 1.0 | 4 | 75% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 260 of 350 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 88 | 34% | 101 |
| ne.Chimera 1.2 | 66 | 25% | 75 |
| ejb.Polaris 1.0.1 | 35 | 13% | 77 |
| vStar.RAFzilla 2.15 | 22 | 8% | 35 |
| tvv.micro.Antares 1.1.1 | 20 | 8% | 20 |
| sam.Samspin 1.0 | 15 | 6% | 19 |
| donjezza.Muncho 1.0 | 7 | 3% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 2% | 7 |
| kurios.DOSexe .9b | 2 | 1% | 7 |

## Melee bench: F11

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 65.7 | 53 / 350 | 4.09 | 13.0% | 34089 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 16.9% | 132 |
| cx.mini.Nimrod 0.55 | 2.3 | 12.8% | 50 |
| hadur117.nano.SanaroGG 0.1 | 2.7 | 13.0% | 53 |
| djc.DynaBot 0.1.1 | 4.4 | 10.9% | 33 |
| rdt199.Warlord 0.73 | 5.5 | 9.8% | 25 |
| br2.MobyDickBot 1.6 | 5.8 | 9.4% | 30 |
| uji.YellohFellah 1.0 | 6.4 | 9.0% | 28 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.4% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 8.9 | 6.0% | 0 |
| stelo.MirrorNano 1.3 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.3 | 63.5 | 6 / 35 | 3475 |
| 2 | 3 | 58.8 | 67.6 | 2 / 35 | 3372 |
| 3 | 3 | 56.6 | 61.3 | 3 / 35 | 3280 |
| 4 | 2 | 60.5 | 69.8 | 9 / 35 | 3486 |
| 5 | 3 | 58.4 | 62.2 | 5 / 35 | 3643 |
| 6 | 2 | 59.9 | 69.2 | 8 / 35 | 3375 |
| 7 | 2 | 60.4 | 68.3 | 8 / 35 | 3599 |
| 8 | 3 | 58.4 | 68.6 | 3 / 35 | 3162 |
| 9 | 3 | 58.0 | 64.4 | 3 / 35 | 3443 |
| 10 | 3 | 56.8 | 61.6 | 6 / 35 | 3254 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 65 | 48% |
| uji.YellohFellah 1.0 | 15 | 7% |
| djc.DynaBot 0.1.1 | 15 | 47% |
| cx.mini.Nimrod 0.55 | 14 | 43% |
| rdt199.Warlord 0.73 | 8 | 50% |
| br2.MobyDickBot 1.6 | 7 | 43% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 297 of 350 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 107 | 36% | 134 |
| cx.mini.Nimrod 0.55 | 62 | 21% | 64 |
| rdt199.Warlord 0.73 | 29 | 10% | 37 |
| djc.DynaBot 0.1.1 | 24 | 8% | 29 |
| uji.YellohFellah 1.0 | 23 | 8% | 27 |
| br2.MobyDickBot 1.6 | 20 | 7% | 24 |
| KiraNL.Chupacabra 0.4 | 16 | 5% | 19 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 4% | 11 |
| stelo.MirrorNano 1.3 | 5 | 2% | 5 |

## Melee bench: F12

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 67.7 | 52 / 350 | 3.91 | 12.9% | 29894 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.7 | 14.6% | 88 |
| nat.PallasHawk 1.0 | 2.4 | 13.8% | 91 |
| darkcanuck.Leon 1.01 | 2.6 | 13.6% | 76 |
| hadur117.nano.SanaroGG 0.1 | 3.3 | 12.9% | 52 |
| brainfade.melee.Genghis 0.36 | 5.1 | 10.9% | 30 |
| jrm.Test0 1.0 | 6.3 | 8.6% | 2 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.5% | 2 |
| jp.Perpy 16.0 | 7.5 | 7.2% | 3 |
| jaybot.bots.Oddball 4.0 | 9.4 | 5.3% | 5 |
| stuff.Vlad 0.1 | 9.5 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.7 | 59.7 | 4 / 35 | 3030 |
| 2 | 2 | 60.6 | 71.4 | 8 / 35 | 3083 |
| 3 | 3 | 58.8 | 68.3 | 3 / 35 | 3076 |
| 4 | 3 | 58.6 | 67.6 | 4 / 35 | 3221 |
| 5 | 4 | 58.3 | 64.4 | 7 / 35 | 3136 |
| 6 | 4 | 58.7 | 68.6 | 5 / 35 | 2784 |
| 7 | 3 | 58.8 | 69.8 | 5 / 35 | 2863 |
| 8 | 3 | 60.4 | 71.7 | 5 / 35 | 3112 |
| 9 | 3 | 59.8 | 72.1 | 6 / 35 | 2792 |
| 10 | 4 | 56.5 | 63.2 | 5 / 35 | 2797 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 47 | 38% |
| nat.PallasHawk 1.0 | 38 | 24% |
| darkcanuck.Leon 1.01 | 36 | 33% |
| brainfade.melee.Genghis 0.36 | 13 | 54% |
| jrm.Test0 1.0 | 3 | 67% |
| jaybot.bots.Oddball 4.0 | 3 | 0% |
| jp.Perpy 16.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 50% |
| stuff.Vlad 0.1 | 2 | 50% |

Hadur died in 299 of 350 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 80 | 27% | 92 |
| nat.PallasHawk 1.0 | 64 | 21% | 77 |
| darkcanuck.Leon 1.01 | 62 | 21% | 77 |
| brainfade.melee.Genghis 0.36 | 37 | 12% | 40 |
| jrm.Test0 1.0 | 20 | 7% | 22 |
| cs.sheldor.Talon 1.1 | 12 | 4% | 14 |
| jp.Perpy 16.0 | 10 | 3% | 14 |
| jaybot.bots.Oddball 4.0 | 8 | 3% | 7 |
| stuff.Vlad 0.1 | 6 | 2% | 7 |

## Melee bench: F13

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 72.1 | 37 / 350 | 3.51 | 13.1% | 32177 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.2 | 17.2% | 151 |
| ags.Glacier 0.2.11 | 1.8 | 16.8% | 91 |
| hadur117.nano.SanaroGG 0.1 | 3.5 | 13.1% | 37 |
| shinh.Entangled 0.3 | 4.1 | 12.4% | 32 |
| gh.micro.Gruweltje 0.7 | 4.4 | 12.5% | 35 |
| apc.Colossus2 0.17 | 6.3 | 8.2% | 1 |
| stelo.Wang 1.0 | 6.8 | 6.8% | 3 |
| ayk.WallHugger 1.0 | 8.1 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.9 | 4.4% | 0 |
| sample.Tracker 1.0 | 9.9 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.4 | 69.2 | 3 / 35 | 3130 |
| 2 | 4 | 58.8 | 69.2 | 1 / 35 | 3014 |
| 3 | 5 | 58.3 | 69.8 | 2 / 35 | 2658 |
| 4 | 3 | 60.9 | 73.7 | 4 / 35 | 3340 |
| 5 | 3 | 62.1 | 78.1 | 5 / 35 | 3199 |
| 6 | 3 | 61.3 | 73.0 | 6 / 35 | 3330 |
| 7 | 4 | 60.5 | 70.2 | 3 / 35 | 3665 |
| 8 | 3 | 61.2 | 72.4 | 5 / 35 | 3535 |
| 9 | 3 | 62.9 | 78.1 | 5 / 35 | 3689 |
| 10 | 4 | 57.7 | 67.6 | 3 / 35 | 2617 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 66 | 32% |
| ags.Glacier 0.2.11 | 46 | 13% |
| shinh.Entangled 0.3 | 20 | 45% |
| gh.micro.Gruweltje 0.7 | 13 | 8% |
| stelo.Wang 1.0 | 2 | 0% |

Hadur died in 313 of 350 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 92 | 29% | 97 |
| mn.Combat 3.25.0 | 84 | 27% | 106 |
| shinh.Entangled 0.3 | 53 | 17% | 62 |
| gh.micro.Gruweltje 0.7 | 44 | 14% | 45 |
| stelo.Wang 1.0 | 25 | 8% | 25 |
| apc.Colossus2 0.17 | 8 | 3% | 8 |
| maribo.FollowFire 1 | 4 | 1% | 4 |
| ayk.WallHugger 1.0 | 3 | 1% | 3 |

## Melee bench: F14

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 76.6 | 86 / 350 | 3.10 | 14.6% | 35276 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.9% | 151 |
| hadur117.nano.SanaroGG 0.1 | 2.2 | 14.6% | 86 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.3% | 63 |
| Lo_Ian.Gandalf_V4 4.0 | 4.9 | 10.3% | 14 |
| co.edu.usb.rc.LidisTron 1.0 | 5.1 | 10.2% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.4 | 10.0% | 3 |
| sanyi.mikrobi.Roberto 1.0 | 6.6 | 9.4% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.9% | 12 |
| pa.Improved 1.0 | 9.0 | 5.5% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 79.7 | 11 / 35 | 3631 |
| 2 | 3 | 61.8 | 76.2 | 9 / 35 | 3293 |
| 3 | 2 | 61.9 | 75.9 | 6 / 35 | 3476 |
| 4 | 2 | 62.3 | 77.8 | 6 / 35 | 3446 |
| 5 | 2 | 63.0 | 78.7 | 8 / 35 | 3560 |
| 6 | 2 | 63.0 | 80.0 | 3 / 35 | 3558 |
| 7 | 3 | 59.8 | 67.6 | 6 / 35 | 3407 |
| 8 | 2 | 64.6 | 81.6 | 12 / 35 | 3907 |
| 9 | 2 | 59.8 | 67.6 | 8 / 35 | 3163 |
| 10 | 2 | 65.1 | 81.3 | 17 / 35 | 3835 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 99 | 39% |
| catcat20.shape.Theta 0.018 | 46 | 52% |
| Lo_Ian.Gandalf_V4 4.0 | 11 | 36% |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 67% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 86% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 80% |
| sanyi.mikrobi.Roberto 1.0 | 5 | 40% |
| pa.Improved 1.0 | 2 | 50% |

Hadur died in 264 of 350 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 129 | 49% | 164 |
| catcat20.shape.Theta 0.018 | 36 | 14% | 57 |
| dmh.robocode.robot.RedDwarf 0.4 | 34 | 13% | 38 |
| Lo_Ian.Gandalf_V4 4.0 | 19 | 7% | 23 |
| co.edu.usb.rc.LidisTron 1.0 | 15 | 6% | 17 |
| sanyi.mikrobi.Roberto 1.0 | 13 | 5% | 22 |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 5% | 21 |
| pa.Improved 1.0 | 6 | 2% | 8 |

## Melee bench: F15

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 64.2 | 52 / 350 | 4.22 | 13.0% | 38300 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.3 | 15.0% | 82 |
| emp.Yngwie 1.11 | 2.8 | 13.4% | 100 |
| mld.DustBunny 3.8 | 3.2 | 13.2% | 39 |
| hadur117.nano.SanaroGG 0.1 | 3.5 | 13.0% | 52 |
| cb.nano.Insomnia 1.0 | 4.5 | 11.8% | 22 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.6% | 48 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.7% | 2 |
| lambdaxy.TBot 0.1 | 7.7 | 6.4% | 1 |
| divineomega.TrialBot 0.003 | 8.8 | 5.7% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.2 | 57.8 | 5 / 35 | 3416 |
| 2 | 5 | 57.0 | 58.1 | 5 / 35 | 3835 |
| 3 | 4 | 60.0 | 66.3 | 5 / 35 | 3857 |
| 4 | 4 | 59.2 | 62.5 | 5 / 35 | 4013 |
| 5 | 3 | 60.2 | 67.9 | 5 / 35 | 4028 |
| 6 | 2 | 61.4 | 70.8 | 6 / 35 | 3979 |
| 7 | 3 | 60.0 | 63.2 | 7 / 35 | 4187 |
| 8 | 3 | 58.7 | 66.0 | 7 / 35 | 3331 |
| 9 | 2 | 59.9 | 65.4 | 4 / 35 | 4159 |
| 10 | 4 | 57.8 | 64.1 | 3 / 35 | 3495 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 28 | 32% |
| emp.Yngwie 1.11 | 22 | 64% |
| kawigi.robot.Girl 1.2 | 19 | 58% |
| mld.DustBunny 3.8 | 17 | 24% |
| cb.nano.Insomnia 1.0 | 15 | 80% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |
| divineomega.TrialBot 0.003 | 1 | 100% |

Hadur died in 298 of 350 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 71 | 24% | 78 |
| kawigi.micro.Shiz 1.1 | 61 | 20% | 70 |
| emp.Yngwie 1.11 | 52 | 17% | 75 |
| cb.nano.Insomnia 1.0 | 39 | 13% | 38 |
| kawigi.robot.Girl 1.2 | 36 | 12% | 42 |
| Grystrion.TrackerWO 1.0 | 13 | 4% | 15 |
| lambdaxy.TBot 0.1 | 13 | 4% | 13 |
| divineomega.TrialBot 0.003 | 7 | 2% | 12 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 6 | 2% | 6 |

## Melee bench: F16

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 65.8 | 41 / 350 | 4.08 | 13.5% | 42217 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.2% | 180 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.2 | 14.8% | 27 |
| hadur117.nano.SanaroGG 0.1 | 2.8 | 13.5% | 41 |
| techdude.forest.FlamingForest 1.1 | 4.1 | 11.4% | 65 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.1% | 4 |
| tvv.nano.Polaris 1.2 | 5.6 | 9.3% | 14 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.9% | 8 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.4% | 10 |
| asd.Cthulhu 1.3 | 9.0 | 5.1% | 2 |
| repositorio.NanoStep 1.0 | 9.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 66.7 | 6 / 35 | 4259 |
| 2 | 3 | 59.9 | 66.0 | 4 / 35 | 3993 |
| 3 | 3 | 60.4 | 66.7 | 4 / 35 | 4118 |
| 4 | 2 | 61.7 | 69.8 | 6 / 35 | 4263 |
| 5 | 3 | 61.6 | 69.2 | 6 / 35 | 3937 |
| 6 | 3 | 59.6 | 64.8 | 2 / 35 | 4298 |
| 7 | 3 | 58.4 | 57.8 | 5 / 35 | 4104 |
| 8 | 2 | 62.3 | 70.8 | 1 / 35 | 4466 |
| 9 | 3 | 59.9 | 64.1 | 2 / 35 | 4342 |
| 10 | 3 | 59.4 | 61.9 | 5 / 35 | 4437 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 79 | 4% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 23 | 70% |
| techdude.forest.FlamingForest 1.1 | 11 | 27% |
| tvv.nano.Polaris 1.2 | 8 | 63% |
| bvh.fnr.Fenrir 0.36l | 7 | 86% |
| stelo.IntrinsicVolatility 1.4 | 6 | 67% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 309 of 350 rounds, at a mean tick of 1193. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 158 | 51% | 164 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 57 | 18% | 64 |
| bvh.fnr.Fenrir 0.36l | 27 | 9% | 29 |
| techdude.forest.FlamingForest 1.1 | 19 | 6% | 23 |
| stelo.IntrinsicVolatility 1.4 | 15 | 5% | 21 |
| tvv.nano.Polaris 1.2 | 14 | 5% | 19 |
| divineomega.DivineBot 1.9.4.5 | 9 | 3% | 18 |
| asd.Cthulhu 1.3 | 6 | 2% | 7 |
| repositorio.NanoStep 1.0 | 4 | 1% | 5 |

## Melee bench: F17

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 65.7 | 50 / 350 | 4.09 | 13.1% | 37380 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 2.1 | 13.8% | 80 |
| cx.BlestPain 1.41 | 2.5 | 13.5% | 75 |
| et.Predator 1.8 | 2.5 | 13.6% | 67 |
| hadur117.nano.SanaroGG 0.1 | 3.4 | 13.1% | 50 |
| nic.Nicator 2.4 | 4.7 | 11.8% | 42 |
| ahf.NanoAndrew .4 | 5.9 | 10.8% | 25 |
| maribo.melee.BMV 0.1 | 6.9 | 9.1% | 8 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.8% | 3 |
| tex.Longbot 0.4 | 8.7 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.0 | 67.6 | 4 / 35 | 3788 |
| 2 | 3 | 59.8 | 67.6 | 4 / 35 | 3628 |
| 3 | 1 | 62.0 | 73.3 | 10 / 35 | 3837 |
| 4 | 4 | 58.4 | 60.6 | 7 / 35 | 3569 |
| 5 | 6 | 56.3 | 60.0 | 2 / 35 | 3324 |
| 6 | 3 | 59.2 | 64.4 | 5 / 35 | 3816 |
| 7 | 4 | 57.7 | 62.2 | 2 / 35 | 3739 |
| 8 | 2 | 60.4 | 67.9 | 8 / 35 | 3805 |
| 9 | 4 | 60.0 | 66.3 | 4 / 35 | 3799 |
| 10 | 3 | 60.1 | 66.3 | 4 / 35 | 4075 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 35 | 29% |
| cx.BlestPain 1.41 | 33 | 73% |
| oog.melee.Mercutio 1.0 | 28 | 32% |
| nic.Nicator 2.4 | 16 | 31% |
| ahf.NanoAndrew .4 | 4 | 0% |
| maribo.melee.BMV 0.1 | 4 | 50% |
| edu.otg.spr.TheTeacher 1.2 | 3 | 0% |

Hadur died in 301 of 350 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 72 | 24% | 83 |
| oog.melee.Mercutio 1.0 | 53 | 18% | 61 |
| ahf.NanoAndrew .4 | 51 | 17% | 52 |
| cx.BlestPain 1.41 | 42 | 14% | 66 |
| nic.Nicator 2.4 | 38 | 13% | 42 |
| maribo.melee.BMV 0.1 | 24 | 8% | 25 |
| edu.otg.spr.TheTeacher 1.2 | 11 | 4% | 11 |
| tex.Longbot 0.4 | 9 | 3% | 9 |
| goblin.Bender 2.4 | 1 | 0% | 1 |

## Melee bench: F18

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 10 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 71.1 | 91 / 350 | 3.60 | 14.3% | 36505 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroGG 0.1 | 1.4 | 14.3% | 91 |
| morbid.MorbidPriest 1.0 | 1.8 | 14.3% | 81 |
| agd.Mooserwirt2 2.7 | 3.1 | 12.3% | 62 |
| uji.DBH 1.1 | 4.2 | 11.4% | 32 |
| ratosh.Nobo 0.21 | 4.9 | 10.8% | 18 |
| spinnercat.Robovirus 2.718 | 6.1 | 9.9% | 16 |
| sigterm.Sigterm 1.0 | 6.5 | 9.1% | 32 |
| kawigi.mini.Fhqwhgads 1.1 | 8.3 | 7.1% | 7 |
| stelo.WangRobot 1.0 | 8.9 | 5.7% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.4 | 69.5 | 9 / 35 | 3713 |
| 2 | 1 | 61.7 | 73.0 | 8 / 35 | 3956 |
| 3 | 1 | 62.6 | 74.0 | 11 / 35 | 3920 |
| 4 | 2 | 61.9 | 73.0 | 11 / 35 | 3628 |
| 5 | 1 | 62.0 | 76.2 | 10 / 35 | 3610 |
| 6 | 2 | 60.1 | 69.5 | 10 / 35 | 3434 |
| 7 | 2 | 58.2 | 64.1 | 6 / 35 | 3430 |
| 8 | 1 | 60.9 | 72.1 | 8 / 35 | 3464 |
| 9 | 1 | 60.9 | 69.8 | 10 / 35 | 3616 |
| 10 | 2 | 61.0 | 69.8 | 8 / 35 | 3734 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 46 | 50% |
| agd.Mooserwirt2 2.7 | 40 | 55% |
| uji.DBH 1.1 | 23 | 52% |
| spinnercat.Robovirus 2.718 | 20 | 75% |
| sigterm.Sigterm 1.0 | 19 | 37% |
| ratosh.Nobo 0.21 | 13 | 62% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 60% |
| stelo.WangRobot 1.0 | 4 | 0% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 260 of 350 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 75 | 29% | 99 |
| agd.Mooserwirt2 2.7 | 49 | 19% | 75 |
| ratosh.Nobo 0.21 | 38 | 15% | 48 |
| uji.DBH 1.1 | 30 | 12% | 40 |
| sigterm.Sigterm 1.0 | 24 | 9% | 32 |
| spinnercat.Robovirus 2.718 | 18 | 7% | 21 |
| stelo.WangRobot 1.0 | 13 | 5% | 16 |
| kawigi.mini.Fhqwhgads 1.1 | 9 | 3% | 13 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 2% | 6 |

## Melee bench: F19

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 80.9 | 107 / 350 | 2.72 | 16.3% | 43524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroGG 0.1 | 1.6 | 16.3% | 107 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 16.1% | 101 |
| mld.Infinity 2.2 | 2.4 | 16.1% | 109 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.1% | 7 |
| erdnis.Rover 0.3 | 4.7 | 10.7% | 13 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.5% | 6 |
| pac.ABC 2.1 | 7.6 | 7.0% | 5 |
| mbh.Mbh 0.1 | 7.7 | 7.0% | 0 |
| pbg.R2D2 1.0 | 8.5 | 6.2% | 3 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 81.9 | 12 / 35 | 4495 |
| 2 | 1 | 66.4 | 84.1 | 9 / 35 | 4457 |
| 3 | 1 | 66.5 | 80.0 | 11 / 35 | 4702 |
| 4 | 2 | 63.9 | 76.2 | 7 / 35 | 4200 |
| 5 | 2 | 66.4 | 83.8 | 10 / 35 | 4239 |
| 6 | 2 | 66.8 | 82.9 | 15 / 35 | 4470 |
| 7 | 1 | 67.2 | 84.8 | 12 / 35 | 4587 |
| 8 | 1 | 67.3 | 83.2 | 13 / 35 | 4643 |
| 9 | 3 | 60.6 | 67.9 | 5 / 35 | 3551 |
| 10 | 1 | 66.5 | 83.8 | 13 / 35 | 4180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 120 | 53% |
| davidalves.net.DuelistMiniMelee 1.2 | 74 | 19% |
| krillr.mini.JointStrike 2.0.0 | 15 | 87% |
| erdnis.Rover 0.3 | 7 | 57% |
| patson.PatsonTestBot 1.0 | 6 | 67% |
| pbg.R2D2 1.0 | 5 | 100% |
| pac.ABC 2.1 | 3 | 100% |

Hadur died in 243 of 350 rounds, at a mean tick of 1142. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 109 | 45% | 173 |
| mld.Infinity 2.2 | 78 | 32% | 37 |
| erdnis.Rover 0.3 | 19 | 8% | 33 |
| krillr.mini.JointStrike 2.0.0 | 14 | 6% | 36 |
| patson.PatsonTestBot 1.0 | 12 | 5% | 28 |
| mbh.Mbh 0.1 | 6 | 2% | 15 |
| pbg.R2D2 1.0 | 3 | 1% | 12 |
| pac.ABC 2.1 | 2 | 1% | 12 |

## Melee bench: F20

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 68.3 | 51 / 350 | 3.86 | 13.5% | 36929 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.9% | 158 |
| hadur117.nano.SanaroGG 0.1 | 2.2 | 13.5% | 51 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.9% | 26 |
| fwb.Nine 1.0.1 | 3.7 | 11.7% | 41 |
| catcat20.Rabbit 0.001 | 5.1 | 9.8% | 32 |
| m3thos.mini.Eva01 0.5.5 | 6.8 | 8.7% | 8 |
| bayen.nut.Squirrel 1.615 | 6.9 | 8.5% | 20 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 8.4% | 11 |
| ntc.ControlledChaos 1.1.4 | 9.3 | 5.2% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.7 | 4.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.2 | 59.7 | 4 / 35 | 3451 |
| 2 | 2 | 59.5 | 67.9 | 4 / 35 | 3816 |
| 3 | 2 | 60.6 | 70.2 | 6 / 35 | 3686 |
| 4 | 2 | 59.9 | 70.2 | 3 / 35 | 3683 |
| 5 | 2 | 61.5 | 71.4 | 8 / 35 | 3964 |
| 6 | 2 | 60.5 | 70.2 | 6 / 35 | 3615 |
| 7 | 2 | 61.0 | 70.2 | 6 / 35 | 3786 |
| 8 | 2 | 58.6 | 66.7 | 3 / 35 | 3489 |
| 9 | 2 | 58.8 | 66.7 | 4 / 35 | 3547 |
| 10 | 2 | 60.8 | 69.5 | 7 / 35 | 3892 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 78 | 31% |
| nz.jdc.nano.GridFu 1.0 | 13 | 31% |
| fwb.Nine 1.0.1 | 12 | 92% |
| catcat20.Rabbit 0.001 | 9 | 56% |
| m3thos.mini.Eva01 0.5.5 | 5 | 40% |
| bayen.nut.Squirrel 1.615 | 5 | 80% |
| djdjdj.NanoSkunk10 1.0 | 2 | 0% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 300 of 350 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 135 | 45% | 148 |
| fwb.Nine 1.0.1 | 58 | 19% | 67 |
| nz.jdc.nano.GridFu 1.0 | 32 | 11% | 42 |
| catcat20.Rabbit 0.001 | 26 | 9% | 29 |
| bayen.nut.Squirrel 1.615 | 17 | 6% | 23 |
| djdjdj.NanoSkunk10 1.0 | 15 | 5% | 20 |
| m3thos.mini.Eva01 0.5.5 | 11 | 4% | 14 |
| sample.MyFirstJuniorRobot 1.0 | 6 | 2% | 6 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |

## Melee bench: F21

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 84.6 | 144 / 350 | 2.39 | 17.6% | 48581 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroGG 0.1 | 1.3 | 17.6% | 144 |
| eem.EvBot v4.6.16 | 1.7 | 16.6% | 130 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.3% | 20 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 20 |
| oa.weak.BotherBot 0.1 | 5.3 | 8.5% | 7 |
| eld.Hmm 1.0 | 5.7 | 8.2% | 23 |
| fire219.CatBot 1.0 | 7.5 | 6.6% | 0 |
| el.JumpShoot 0.2 | 7.9 | 6.4% | 9 |
| PSW.Relentless 0.1 | 8.7 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 89.5 | 16 / 35 | 4958 |
| 2 | 1 | 67.3 | 86.0 | 14 / 35 | 4639 |
| 3 | 1 | 67.2 | 84.8 | 17 / 35 | 4770 |
| 4 | 1 | 67.7 | 84.8 | 12 / 35 | 5355 |
| 5 | 1 | 66.5 | 82.5 | 14 / 35 | 4894 |
| 6 | 2 | 66.9 | 85.1 | 12 / 35 | 4793 |
| 7 | 2 | 66.0 | 82.9 | 13 / 35 | 4326 |
| 8 | 1 | 68.2 | 83.8 | 14 / 35 | 5469 |
| 9 | 1 | 67.4 | 84.8 | 17 / 35 | 4985 |
| 10 | 2 | 65.7 | 81.9 | 15 / 35 | 4392 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 144 | 56% |
| dummy.mini.Scimitar 1.01 | 45 | 89% |
| cf.RiO.RiOx 4.2.1 | 21 | 57% |
| eld.Hmm 1.0 | 11 | 45% |
| el.JumpShoot 0.2 | 9 | 22% |
| oa.weak.BotherBot 0.1 | 7 | 43% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 209 of 350 rounds, at a mean tick of 1236. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 98 | 47% | 149 |
| dummy.mini.Scimitar 1.01 | 42 | 20% | 98 |
| cf.RiO.RiOx 4.2.1 | 34 | 16% | 48 |
| eld.Hmm 1.0 | 10 | 5% | 19 |
| el.JumpShoot 0.2 | 9 | 4% | 12 |
| oa.weak.BotherBot 0.1 | 7 | 3% | 13 |
| fire219.CatBot 1.0 | 5 | 2% | 5 |
| PSW.Relentless 0.1 | 2 | 1% | 2 |
| arthord.MannyPacquiao Beta | 1 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 81.5 | 99 / 350 | 2.67 | 16.1% | 40214 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 18.1% | 137 |
| hadur117.nano.SanaroGG 0.1 | 2.0 | 16.1% | 99 |
| cre.Karolos 0.32 | 3.0 | 14.9% | 71 |
| stelo.AreaTargetingBot 1.1 | 4.1 | 11.0% | 16 |
| stelo.RamTrackSurfer 1.2 | 5.7 | 9.4% | 16 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 9.2% | 2 |
| sample.Walls 1.0 | 6.7 | 8.9% | 9 |
| cw.megas.Blade 0.8 | 7.5 | 8.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.9% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 85.1 | 8 / 35 | 3971 |
| 2 | 2 | 66.5 | 83.2 | 8 / 35 | 4174 |
| 3 | 2 | 65.5 | 80.0 | 12 / 35 | 3766 |
| 4 | 2 | 66.6 | 81.0 | 13 / 35 | 4225 |
| 5 | 2 | 66.0 | 82.2 | 10 / 35 | 4263 |
| 6 | 2 | 65.5 | 81.0 | 12 / 35 | 3686 |
| 7 | 2 | 66.4 | 83.2 | 9 / 35 | 3997 |
| 8 | 2 | 65.7 | 82.5 | 11 / 35 | 3816 |
| 9 | 2 | 65.8 | 79.4 | 11 / 35 | 4334 |
| 10 | 2 | 64.6 | 77.1 | 5 / 35 | 3982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 111 | 42% |
| cre.Karolos 0.32 | 53 | 36% |
| sample.Walls 1.0 | 21 | 81% |
| stelo.AreaTargetingBot 1.1 | 20 | 55% |
| stelo.RamTrackSurfer 1.2 | 5 | 40% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 50% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 251 of 350 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 118 | 47% | 165 |
| cre.Karolos 0.32 | 73 | 29% | 94 |
| stelo.AreaTargetingBot 1.1 | 24 | 10% | 32 |
| stelo.RamTrackSurfer 1.2 | 11 | 4% | 22 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 10 | 4% | 12 |
| sample.Walls 1.0 | 9 | 4% | 16 |
| cw.megas.Blade 0.8 | 6 | 2% | 8 |

## Melee bench: F24

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.8 | 60.8 | 42 / 350 | 4.53 | 11.6% | 28509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.4 | 15.0% | 93 |
| florent.XSeries.X2 0.12 | 2.5 | 13.9% | 67 |
| davidalves.Phoenix 0.54 | 2.6 | 13.4% | 76 |
| pedersen.Ugluk 1.1.1 | 3.9 | 12.3% | 43 |
| hadur117.nano.SanaroGG 0.1 | 4.7 | 11.6% | 42 |
| oog.melee.Corsair 1.0 | 6.2 | 9.2% | 11 |
| stelo.SoJNanoMelee 1.1 | 6.9 | 8.3% | 13 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.2% | 4 |
| as.FrankTheTank 1.3 | 9.3 | 5.1% | 1 |
| evd.X1 0.01 | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.0 | 63.2 | 5 / 35 | 2921 |
| 2 | 5 | 54.8 | 57.5 | 5 / 35 | 2936 |
| 3 | 3 | 58.2 | 67.0 | 3 / 35 | 3038 |
| 4 | 4 | 55.8 | 61.0 | 4 / 35 | 2864 |
| 5 | 6 | 52.2 | 52.1 | 2 / 35 | 2745 |
| 6 | 5 | 57.1 | 64.8 | 5 / 35 | 2748 |
| 7 | 5 | 54.9 | 57.5 | 6 / 35 | 2757 |
| 8 | 4 | 58.6 | 68.6 | 4 / 35 | 3030 |
| 9 | 5 | 54.1 | 56.5 | 3 / 35 | 2745 |
| 10 | 5 | 55.5 | 59.7 | 5 / 35 | 2725 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 28 | 54% |
| florent.XSeries.X2 0.12 | 23 | 57% |
| davidalves.Phoenix 0.54 | 22 | 41% |
| pedersen.Ugluk 1.1.1 | 9 | 44% |
| stelo.SoJNanoMelee 1.1 | 3 | 0% |
| oog.melee.Corsair 1.0 | 3 | 0% |
| lunchie.Lunchbox 0.93 | 3 | 33% |

Hadur died in 308 of 350 rounds, at a mean tick of 599. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 75 | 24% | 86 |
| rz.GlowBlowMelee 1.4 | 66 | 21% | 81 |
| davidalves.Phoenix 0.54 | 61 | 20% | 69 |
| pedersen.Ugluk 1.1.1 | 51 | 17% | 55 |
| stelo.SoJNanoMelee 1.1 | 19 | 6% | 19 |
| oog.melee.Corsair 1.0 | 16 | 5% | 18 |
| lunchie.Lunchbox 0.93 | 8 | 3% | 10 |
| as.FrankTheTank 1.3 | 6 | 2% | 6 |
| evd.X1 0.01 | 6 | 2% | 6 |

## Melee bench: F25

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 69.9 | 70 / 350 | 3.71 | 13.7% | 31457 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.4 | 14.9% | 87 |
| hadur117.nano.SanaroGG 0.1 | 2.5 | 13.7% | 70 |
| voidious.micro.BlitzBat 1.05 | 2.6 | 13.3% | 62 |
| jdw.Hurricane 1.4 | 3.7 | 11.9% | 51 |
| gre.svman4.Morfeas 1.4.1 | 5.0 | 10.8% | 32 |
| ds.Oo 2.2 | 6.1 | 9.3% | 20 |
| gjr.Cephalosporin 0.1 | 6.8 | 8.3% | 18 |
| awesomeness.Elite 1.0 | 8.4 | 7.1% | 7 |
| adt.Ar2 1.1 | 8.6 | 6.5% | 4 |
| amk.ChumbaMini 0.2 | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.2 | 67.9 | 5 / 35 | 3179 |
| 2 | 2 | 58.8 | 67.6 | 5 / 35 | 3019 |
| 3 | 1 | 60.2 | 72.1 | 7 / 35 | 3213 |
| 4 | 3 | 59.3 | 68.9 | 4 / 35 | 3085 |
| 5 | 2 | 61.3 | 74.9 | 6 / 35 | 3122 |
| 6 | 2 | 62.0 | 74.6 | 7 / 35 | 3423 |
| 7 | 3 | 57.8 | 64.4 | 4 / 35 | 3146 |
| 8 | 2 | 64.6 | 80.3 | 13 / 35 | 3409 |
| 9 | 3 | 57.9 | 65.1 | 8 / 35 | 2890 |
| 10 | 4 | 58.2 | 63.2 | 11 / 35 | 2971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 57 | 37% |
| voidious.micro.BlitzBat 1.05 | 32 | 31% |
| jdw.Hurricane 1.4 | 26 | 54% |
| ds.Oo 2.2 | 16 | 44% |
| gre.svman4.Morfeas 1.4.1 | 12 | 58% |
| gjr.Cephalosporin 0.1 | 7 | 57% |
| adt.Ar2 1.1 | 6 | 67% |
| awesomeness.Elite 1.0 | 4 | 50% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 281 of 350 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 81 | 29% | 102 |
| voidious.micro.BlitzBat 1.05 | 71 | 25% | 87 |
| jdw.Hurricane 1.4 | 39 | 14% | 48 |
| ds.Oo 2.2 | 25 | 9% | 32 |
| gre.svman4.Morfeas 1.4.1 | 21 | 7% | 26 |
| gjr.Cephalosporin 0.1 | 17 | 6% | 19 |
| awesomeness.Elite 1.0 | 13 | 5% | 16 |
| adt.Ar2 1.1 | 11 | 4% | 16 |
| amk.ChumbaMini 0.2 | 3 | 1% | 4 |

## Melee bench: F26

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 73.7 | 60 / 350 | 3.37 | 14.3% | 40206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.3 | 16.1% | 135 |
| hadur117.nano.SanaroGG 0.1 | 1.9 | 14.3% | 60 |
| shu.nitro.LENIN .T34 | 3.4 | 12.5% | 56 |
| lrem.Spectre 0.4.4 | 3.7 | 12.4% | 40 |
| js.PinBall 1.6 | 5.3 | 11.3% | 17 |
| gh.mini.GrubbmOne 1.0 | 5.4 | 11.3% | 27 |
| jaybot.adv.bots.JayBot 2.0 | 7.0 | 9.0% | 6 |
| fullsail.LaxativeTeaTwo 1.0 | 8.1 | 6.6% | 8 |
| sample.SpinBot 1.0 | 8.9 | 5.2% | 3 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.2 | 69.8 | 6 / 35 | 3738 |
| 2 | 2 | 61.4 | 71.7 | 4 / 35 | 3775 |
| 3 | 1 | 65.4 | 81.3 | 9 / 35 | 4341 |
| 4 | 1 | 63.6 | 77.5 | 8 / 35 | 4185 |
| 5 | 2 | 62.3 | 73.0 | 5 / 35 | 4313 |
| 6 | 2 | 61.8 | 71.7 | 5 / 35 | 3952 |
| 7 | 2 | 60.4 | 70.5 | 5 / 35 | 3795 |
| 8 | 2 | 61.4 | 73.0 | 7 / 35 | 3582 |
| 9 | 1 | 62.5 | 73.0 | 6 / 35 | 4553 |
| 10 | 2 | 62.1 | 74.9 | 5 / 35 | 3972 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 70 | 23% |
| shu.nitro.LENIN .T34 | 31 | 42% |
| lrem.Spectre 0.4.4 | 26 | 54% |
| gh.mini.GrubbmOne 1.0 | 13 | 23% |
| js.PinBall 1.6 | 12 | 67% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 3 | 67% |
| sample.SpinBot 1.0 | 1 | 0% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |

Hadur died in 291 of 350 rounds, at a mean tick of 819. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 114 | 39% | 128 |
| shu.nitro.LENIN .T34 | 47 | 16% | 64 |
| lrem.Spectre 0.4.4 | 40 | 14% | 48 |
| gh.mini.GrubbmOne 1.0 | 39 | 13% | 43 |
| js.PinBall 1.6 | 20 | 7% | 29 |
| jaybot.adv.bots.JayBot 2.0 | 15 | 5% | 19 |
| sample.SpinBot 1.0 | 10 | 3% | 11 |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 69.5 | 71 / 350 | 3.75 | 13.5% | 32157 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.0 | 15.8% | 129 |
| hadur117.nano.SanaroGG 0.1 | 2.4 | 13.5% | 71 |
| sheldor.melee.nano.TestMelee 0.1 | 3.5 | 12.5% | 51 |
| wee.Gem 1.8.4 | 3.6 | 12.1% | 56 |
| EH.Eagle 1.0.6 | 4.6 | 11.6% | 28 |
| joe.ADinosaur 1.0 | 7.1 | 7.9% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 7.1 | 8.2% | 7 |
| throxbot.ThroxBot 0.1 | 7.5 | 7.5% | 5 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.2% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 75.6 | 11 / 35 | 2911 |
| 2 | 2 | 59.5 | 72.1 | 8 / 35 | 2712 |
| 3 | 2 | 59.8 | 71.7 | 8 / 35 | 2852 |
| 4 | 2 | 58.9 | 55.6 | 4 / 35 | 4827 |
| 5 | 3 | 57.5 | 65.4 | 5 / 35 | 2933 |
| 6 | 2 | 62.2 | 81.6 | 9 / 35 | 2987 |
| 7 | 3 | 58.7 | 70.2 | 6 / 35 | 2670 |
| 8 | 3 | 59.9 | 73.3 | 7 / 35 | 2981 |
| 9 | 2 | 61.6 | 76.5 | 8 / 35 | 3067 |
| 10 | 3 | 57.7 | 53.0 | 5 / 35 | 4217 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 75 | 51% |
| sheldor.melee.nano.TestMelee 0.1 | 26 | 31% |
| wee.Gem 1.8.4 | 21 | 43% |
| EH.Eagle 1.0.6 | 20 | 70% |
| techdude.kombat.FlamingKombat 1.5 | 3 | 33% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 282 of 350 rounds, at a mean tick of 789. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 114 | 40% | 153 |
| sheldor.melee.nano.TestMelee 0.1 | 57 | 20% | 65 |
| wee.Gem 1.8.4 | 32 | 11% | 42 |
| EH.Eagle 1.0.6 | 24 | 9% | 37 |
| throxbot.ThroxBot 0.1 | 15 | 5% | 15 |
| joe.ADinosaur 1.0 | 13 | 5% | 14 |
| caimano.Furia_Ceca 0.22 | 10 | 4% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 8 | 3% | 8 |
| cs.Grudge 1.0 | 6 | 2% | 6 |
3 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 80.6 | 110 / 350 | 2.75 | 15.9% | 37368 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroGG 0.1 | 1.4 | 15.9% | 110 |
| kid.test.NightFox .2 | 1.6 | 15.6% | 107 |
| uji.Antique 1.0 | 3.2 | 12.3% | 58 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.7% | 34 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.9% | 16 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.3% | 10 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.9% | 9 |
| matt.advanced.Katana 1.0 | 7.9 | 7.0% | 7 |
| stelo.PianistNano 1.2 | 9.1 | 6.1% | 0 |
| stelo.Lifestealer 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 85.1 | 11 / 35 | 3883 |
| 2 | 1 | 66.1 | 86.3 | 18 / 35 | 3728 |
| 3 | 1 | 63.0 | 75.2 | 11 / 35 | 3956 |
| 4 | 1 | 63.5 | 77.8 | 14 / 35 | 3488 |
| 5 | 1 | 63.5 | 78.4 | 11 / 35 | 3825 |
| 6 | 2 | 63.5 | 79.7 | 9 / 35 | 3661 |
| 7 | 2 | 63.7 | 81.6 | 8 / 35 | 3676 |
| 8 | 2 | 62.9 | 79.7 | 9 / 35 | 3518 |
| 9 | 1 | 65.4 | 84.1 | 11 / 35 | 4050 |
| 10 | 2 | 62.9 | 78.1 | 8 / 35 | 3583 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 109 | 43% |
| uji.Antique 1.0 | 51 | 49% |
| qohnil.blot.BlotBot 3.61 | 19 | 47% |
| pfvicm.Sobieski 7.2.3b | 15 | 73% |
| matt.advanced.Katana 1.0 | 8 | 75% |
| amk.ChumbaWumba 0.3 | 8 | 63% |
| ahr.ice.Ice 1.0.2 | 7 | 71% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 241 of 350 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 94 | 39% | 115 |
| uji.Antique 1.0 | 43 | 18% | 78 |
| pfvicm.Sobieski 7.2.3b | 33 | 14% | 36 |
| amk.ChumbaWumba 0.3 | 22 | 9% | 29 |
| qohnil.blot.BlotBot 3.61 | 20 | 8% | 40 |
| matt.advanced.Katana 1.0 | 11 | 5% | 17 |
| ahr.ice.Ice 1.0.2 | 10 | 4% | 22 |
| stelo.Lifestealer 1.0 | 5 | 2% | 6 |
| stelo.PianistNano 1.2 | 3 | 1% | 3 |

## Melee bench: F29

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 72.0 | 64 / 350 | 3.52 | 14.6% | 38132 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.8 | 15.8% | 108 |
| hadur117.nano.SanaroGG 0.1 | 2.3 | 14.6% | 64 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.0% | 99 |
| myl.micro.Troodon 1.10 | 3.8 | 13.1% | 32 |
| jok.PheonixM 0.1.2 | 4.8 | 11.4% | 24 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.2% | 3 |
| DBall.Anarchy 0.1 | 7.0 | 7.4% | 15 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.8% | 0 |
| jangs.ns51 1.0 | 9.2 | 4.4% | 5 |
| ap.Frederick 1.1 | 9.6 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 70.5 | 6 / 35 | 4102 |
| 2 | 4 | 59.4 | 63.8 | 6 / 35 | 3138 |
| 3 | 1 | 63.9 | 76.2 | 7 / 35 | 3857 |
| 4 | 3 | 61.5 | 70.2 | 5 / 35 | 3862 |
| 5 | 3 | 62.3 | 71.1 | 5 / 35 | 3988 |
| 6 | 2 | 61.8 | 71.1 | 4 / 35 | 3578 |
| 7 | 3 | 61.8 | 70.8 | 6 / 35 | 3485 |
| 8 | 1 | 64.1 | 77.1 | 7 / 35 | 4018 |
| 9 | 1 | 64.7 | 77.5 | 10 / 35 | 4071 |
| 10 | 3 | 63.0 | 71.7 | 8 / 35 | 4033 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 62 | 21% |
| zyx.mega.YersiniaPestis 3.1 | 49 | 41% |
| myl.micro.Troodon 1.10 | 25 | 60% |
| jok.PheonixM 0.1.2 | 15 | 60% |
| DBall.Anarchy 0.1 | 12 | 58% |
| ph.melee.ArcherME 0.3 | 1 | 0% |

Hadur died in 288 of 350 rounds, at a mean tick of 1078. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 104 | 36% | 120 |
| zyx.mega.YersiniaPestis 3.1 | 61 | 21% | 79 |
| myl.micro.Troodon 1.10 | 46 | 16% | 60 |
| jok.PheonixM 0.1.2 | 42 | 15% | 49 |
| ph.melee.ArcherME 0.3 | 17 | 6% | 17 |
| DBall.Anarchy 0.1 | 9 | 3% | 16 |
| fullsail.TimbotNoPrediction 1.0 | 5 | 2% | 5 |
| jangs.ns51 1.0 | 4 | 1% | 4 |

## Melee bench: F30

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.4 | 58.3 | 22 / 350 | 4.75 | 11.3% | 31343 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.2 | 14.2% | 99 |
| oog.melee.Capulet 1.2 | 2.3 | 13.6% | 67 |
| darkcanuck.B26354 1.06 | 2.4 | 13.5% | 83 |
| stelo.PastFuture 2.3.2 | 3.2 | 13.2% | 38 |
| hadur117.nano.SanaroGG 0.1 | 5.0 | 11.3% | 22 |
| intruder.PrairieWolf 2.61 | 6.2 | 9.2% | 22 |
| tripphippy.Alice 1.1 | 7.7 | 7.7% | 9 |
| ntc.Opposite 1.5 | 7.8 | 7.4% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 7.3% | 10 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.8 | 57.1 | 2 / 35 | 3081 |
| 2 | 5 | 57.1 | 61.3 | 2 / 35 | 3438 |
| 3 | 5 | 53.2 | 53.0 | 2 / 35 | 2971 |
| 4 | 5 | 56.8 | 61.9 | 3 / 35 | 3166 |
| 5 | 5 | 55.8 | 59.0 | 2 / 35 | 3215 |
| 6 | 5 | 55.1 | 56.8 | 0 / 35 | 3355 |
| 7 | 6 | 53.1 | 54.0 | 0 / 35 | 2954 |
| 8 | 5 | 56.2 | 60.6 | 3 / 35 | 3025 |
| 9 | 4 | 56.6 | 60.3 | 5 / 35 | 3136 |
| 10 | 5 | 55.4 | 59.0 | 3 / 35 | 3002 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 34 | 26% |
| darkcanuck.B26354 1.06 | 16 | 0% |
| oog.melee.Capulet 1.2 | 12 | 25% |
| intruder.PrairieWolf 2.61 | 7 | 29% |
| stelo.PastFuture 2.3.2 | 7 | 57% |
| tripphippy.Alice 1.1 | 5 | 40% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 67% |
| ntc.Opposite 1.5 | 1 | 0% |

Hadur died in 329 of 350 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 76 | 23% | 85 |
| stelo.PastFuture 2.3.2 | 56 | 17% | 59 |
| darkcanuck.B26354 1.06 | 50 | 15% | 51 |
| oog.melee.Capulet 1.2 | 48 | 15% | 51 |
| intruder.PrairieWolf 2.61 | 28 | 9% | 29 |
| ntc.Opposite 1.5 | 26 | 8% | 26 |
| tripphippy.Alice 1.1 | 24 | 7% | 26 |
| fowl3628800.LightningBolt 2.6.0 | 15 | 5% | 17 |
| GarmBox.Anger 1.0 | 6 | 2% | 6 |

## Melee bench: F31

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.8 | 58.1 | 17 / 350 | 4.77 | 11.0% | 26991 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.4% | 177 |
| gh.mini.Griezel 0.2 | 2.1 | 14.1% | 95 |
| spinnercat.micro.Tyger 0.1 | 3.6 | 12.2% | 23 |
| d414.nano.Quantum 1.0.0 | 3.7 | 11.8% | 27 |
| hadur117.nano.SanaroGG 0.1 | 4.6 | 11.0% | 17 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.4% | 6 |
| timmit.nano.TimDog 0.33 | 7.4 | 6.7% | 7 |
| fm.mammillarias 1.3 | 7.6 | 6.7% | 0 |
| tlp.ThreeLeggedPig 1 | 9.4 | 4.9% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.6 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.9 | 61.6 | 1 / 35 | 2776 |
| 2 | 4 | 54.1 | 55.9 | 1 / 35 | 2800 |
| 3 | 5 | 55.2 | 60.0 | 2 / 35 | 2708 |
| 4 | 4 | 56.4 | 61.0 | 2 / 35 | 2762 |
| 5 | 5 | 55.1 | 57.8 | 3 / 35 | 2684 |
| 6 | 5 | 51.8 | 50.8 | 0 / 35 | 2764 |
| 7 | 3 | 57.8 | 65.4 | 3 / 35 | 2985 |
| 8 | 5 | 54.5 | 55.2 | 3 / 35 | 2779 |
| 9 | 5 | 51.6 | 52.1 | 0 / 35 | 2329 |
| 10 | 5 | 55.2 | 61.3 | 2 / 35 | 2404 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 40 | 30% |
| gh.mini.Griezel 0.2 | 35 | 6% |
| d414.nano.Quantum 1.0.0 | 9 | 0% |
| spinnercat.micro.Tyger 0.1 | 4 | 25% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 333 of 350 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 90 | 27% | 91 |
| abc.Shadow 3.84i | 83 | 25% | 93 |
| spinnercat.micro.Tyger 0.1 | 51 | 15% | 53 |
| d414.nano.Quantum 1.0.0 | 48 | 14% | 49 |
| fm.mammillarias 1.3 | 22 | 7% | 22 |
| gh.nano.Grofvuil 0.2 | 21 | 6% | 23 |
| timmit.nano.TimDog 0.33 | 11 | 3% | 11 |
| Gecko.ultimateGeckoBot 1.0 | 5 | 2% | 6 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 75.5 | 101 / 350 | 3.20 | 14.8% | 37499 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.4 | 15.6% | 121 |
| hadur117.nano.SanaroGG 0.1 | 1.6 | 14.8% | 101 |
| apc.botM 3.0 | 3.2 | 12.5% | 55 |
| vjik.UnViolation 1.1 | 4.5 | 10.9% | 36 |
| lxx.ConceptA 0.8 | 4.7 | 10.8% | 4 |
| bayen.UbaMicro 1.4 | 6.3 | 8.7% | 9 |
| panzer.Panzer 0.2 | 7.2 | 7.5% | 1 |
| yk.JahMicro 1.0 | 7.4 | 7.4% | 13 |
| conscience.Electron 1.3g | 8.8 | 6.5% | 1 |
| donjezza.Jezza 1.0 | 9.9 | 5.3% | 10 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 76.2 | 9 / 35 | 3477 |
| 2 | 2 | 62.5 | 78.1 | 8 / 35 | 3721 |
| 3 | 2 | 63.2 | 77.8 | 11 / 35 | 3901 |
| 4 | 2 | 59.2 | 67.9 | 5 / 35 | 3575 |
| 5 | 1 | 64.1 | 81.0 | 12 / 35 | 4069 |
| 6 | 1 | 63.3 | 79.0 | 10 / 35 | 3942 |
| 7 | 1 | 61.5 | 73.0 | 10 / 35 | 3871 |
| 8 | 2 | 61.4 | 72.7 | 14 / 35 | 3545 |
| 9 | 2 | 60.7 | 72.1 | 10 / 35 | 3497 |
| 10 | 1 | 62.9 | 77.5 | 12 / 35 | 3901 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 90 | 39% |
| apc.botM 3.0 | 37 | 51% |
| vjik.UnViolation 1.1 | 26 | 46% |
| lxx.ConceptA 0.8 | 19 | 95% |
| yk.JahMicro 1.0 | 14 | 36% |
| donjezza.Jezza 1.0 | 8 | 25% |
| bayen.UbaMicro 1.4 | 7 | 100% |
| panzer.Panzer 0.2 | 3 | 100% |

Hadur died in 252 of 350 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 90 | 36% | 129 |
| lxx.ConceptA 0.8 | 43 | 17% | 54 |
| apc.botM 3.0 | 32 | 13% | 53 |
| vjik.UnViolation 1.1 | 22 | 9% | 38 |
| bayen.UbaMicro 1.4 | 20 | 8% | 25 |
| yk.JahMicro 1.0 | 16 | 6% | 17 |
| panzer.Panzer 0.2 | 15 | 6% | 16 |
| donjezza.Jezza 1.0 | 7 | 3% | 9 |
| conscience.Electron 1.3g | 6 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F33

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 70.1 | 55 / 350 | 3.69 | 14.2% | 39153 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 18.2% | 140 |
| hadur117.nano.SanaroGG 0.1 | 2.4 | 14.2% | 55 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.4% | 62 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.3% | 36 |
| labg.Cataclysm 2.05 | 4.7 | 10.6% | 28 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.9% | 22 |
| baal.nano.N 1.42 | 6.6 | 8.5% | 4 |
| zyx.micro.Ant 1.1 | 8.4 | 5.6% | 1 |
| sanja.First 0.1 | 9.1 | 4.8% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 73.0 | 5 / 35 | 4009 |
| 2 | 2 | 61.7 | 70.2 | 4 / 35 | 3920 |
| 3 | 2 | 63.8 | 77.1 | 6 / 35 | 3976 |
| 4 | 2 | 62.7 | 72.4 | 6 / 35 | 4220 |
| 5 | 3 | 59.3 | 63.5 | 4 / 35 | 3817 |
| 6 | 2 | 61.6 | 71.1 | 5 / 35 | 3970 |
| 7 | 3 | 61.1 | 68.9 | 8 / 35 | 3587 |
| 8 | 3 | 58.5 | 61.3 | 4 / 35 | 3766 |
| 9 | 3 | 59.1 | 63.8 | 3 / 35 | 3658 |
| 10 | 2 | 65.7 | 80.0 | 10 / 35 | 4230 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 57 | 37% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 56% |
| gre.svman4.Leonidas 1.3.2 | 18 | 39% |
| labg.Cataclysm 2.05 | 12 | 33% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 25% |
| baal.nano.N 1.42 | 3 | 0% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 296 of 350 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 116 | 39% | 138 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 55 | 19% | 73 |
| gre.svman4.Leonidas 1.3.2 | 42 | 14% | 45 |
| kinsen.melee.Angsaichmophobia 1.8c | 35 | 12% | 35 |
| labg.Cataclysm 2.05 | 29 | 10% | 32 |
| baal.nano.N 1.42 | 11 | 4% | 14 |
| sanja.First 0.1 | 4 | 1% | 6 |
| zyx.micro.Ant 1.1 | 4 | 1% | 5 |

## Melee bench: F34

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 71.2 | 52 / 350 | 3.59 | 14.0% | 39323 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.4 | 17.4% | 125 |
| stelo.Spread 0.9 | 1.6 | 17.3% | 127 |
| hadur117.nano.SanaroGG 0.1 | 3.0 | 14.0% | 52 |
| jcs.Seth 1.8 | 4.4 | 11.2% | 28 |
| tcf.Reach 3 | 4.8 | 10.8% | 10 |
| cli.Dancer 1.1 | 5.8 | 9.8% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 7.6% | 5 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 4.0% | 1 |
| sample.RamFire 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.3 | 73.7 | 6 / 35 | 3951 |
| 2 | 3 | 59.4 | 62.9 | 4 / 35 | 3703 |
| 3 | 3 | 61.0 | 69.2 | 1 / 35 | 3832 |
| 4 | 3 | 62.3 | 71.7 | 5 / 35 | 4048 |
| 5 | 3 | 59.9 | 67.3 | 2 / 35 | 3506 |
| 6 | 3 | 63.4 | 72.4 | 8 / 35 | 4257 |
| 7 | 3 | 58.9 | 64.8 | 6 / 35 | 3294 |
| 8 | 3 | 61.9 | 73.0 | 3 / 35 | 3831 |
| 9 | 3 | 65.3 | 79.4 | 11 / 35 | 4327 |
| 10 | 3 | 64.7 | 77.5 | 6 / 35 | 4574 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 65 | 51% |
| kid.Gladiator .7.2 | 48 | 10% |
| jcs.Seth 1.8 | 16 | 44% |
| tcf.Reach 3 | 5 | 40% |
| ratosh.Wesco 1.4 | 4 | 75% |
| sample.VelociRobot 1.0 | 1 | 0% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 298 of 350 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 125 | 42% | 128 |
| stelo.Spread 0.9 | 97 | 33% | 131 |
| jcs.Seth 1.8 | 21 | 7% | 28 |
| tcf.Reach 3 | 21 | 7% | 25 |
| ratosh.Wesco 1.4 | 20 | 7% | 23 |
| cli.Dancer 1.1 | 8 | 3% | 9 |
| sample.VelociRobot 1.0 | 3 | 1% | 3 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
| sample.RamFire 1.0 | 1 | 0% | 1 |

## Melee bench: F35

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 69.2 | 13 / 350 | 3.77 | 12.5% | 27940 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.9% | 282 |
| gh.mini.Gruwel 0.9 | 2.9 | 13.2% | 29 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.4 | 12.3% | 22 |
| hadur117.nano.SanaroGG 0.1 | 3.8 | 12.5% | 13 |
| rz.HawkOnFire 0.1 | 3.9 | 12.2% | 4 |
| wit.Chuliath 1.0 | 6.5 | 7.0% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.6 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.3 | 5.7% | 0 |
| dans.Cinnamon 1.2 | 8.9 | 5.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.5 | 64.8 | 1 / 35 | 2718 |
| 2 | 3 | 59.0 | 72.1 | 2 / 35 | 2468 |
| 3 | 4 | 59.7 | 73.3 | 2 / 35 | 2494 |
| 4 | 5 | 56.8 | 61.3 | 0 / 35 | 3006 |
| 5 | 3 | 60.1 | 71.4 | 3 / 35 | 3013 |
| 6 | 3 | 60.4 | 74.0 | 1 / 35 | 2992 |
| 7 | 2 | 62.0 | 76.5 | 2 / 35 | 3202 |
| 8 | 4 | 59.9 | 69.8 | 1 / 35 | 3092 |
| 9 | 5 | 57.2 | 64.8 | 0 / 35 | 2521 |
| 10 | 5 | 56.5 | 64.1 | 1 / 35 | 2434 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 86 | 3% |
| gh.mini.Gruwel 0.9 | 15 | 7% |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 63% |
| rz.HawkOnFire 0.1 | 5 | 80% |

Hadur died in 337 of 350 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 161 | 48% | 163 |
| gh.mini.Gruwel 0.9 | 56 | 17% | 57 |
| rz.HawkOnFire 0.1 | 48 | 14% | 52 |
| dmh.robocode.robot.BlackDeath 9.2 | 41 | 12% | 46 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 9 | 3% | 10 |
| myl.nano.KomoriNinja 1.1 | 9 | 3% | 9 |
| wit.Chuliath 1.0 | 6 | 2% | 6 |
| stelo.MyAgileRobot 0.2 | 4 | 1% | 5 |
| dans.Cinnamon 1.2 | 3 | 1% | 2 |

## Melee bench: F36

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 72.6 | 108 / 350 | 3.47 | 14.8% | 37659 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroGG 0.1 | 1.0 | 14.8% | 108 |
| alpha.RainingFire 1.0 | 2.2 | 13.5% | 70 |
| bzdp.Pansy 2.1 | 3.1 | 12.5% | 46 |
| mz.Cork 0.1 | 4.7 | 11.0% | 27 |
| bvh.micro.Freya 0.3 | 4.8 | 11.0% | 37 |
| m3thos.Eva02 0.7.1 | 6.1 | 9.8% | 24 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.7% | 10 |
| dl.BetterWalls 1.0 | 8.4 | 6.8% | 10 |
| squidM.TentalceMeleeNano 1.1 | 8.6 | 6.4% | 3 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.5% | 16 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.6 | 70.8 | 9 / 35 | 3928 |
| 2 | 1 | 62.7 | 71.7 | 14 / 35 | 3938 |
| 3 | 1 | 62.6 | 73.0 | 11 / 35 | 3942 |
| 4 | 1 | 62.7 | 73.3 | 12 / 35 | 3626 |
| 5 | 1 | 63.0 | 76.5 | 10 / 35 | 3849 |
| 6 | 1 | 63.2 | 77.8 | 12 / 35 | 3779 |
| 7 | 1 | 61.9 | 72.1 | 13 / 35 | 3815 |
| 8 | 1 | 60.7 | 72.1 | 7 / 35 | 3591 |
| 9 | 1 | 60.7 | 67.6 | 12 / 35 | 3545 |
| 10 | 1 | 60.5 | 70.8 | 8 / 35 | 3646 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 43 | 65% |
| alpha.RainingFire 1.0 | 38 | 63% |
| bvh.micro.Freya 0.3 | 26 | 81% |
| mz.Cork 0.1 | 23 | 65% |
| m3thos.Eva02 0.7.1 | 18 | 28% |
| bvh.mini.Fenrir 0.39 | 11 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 0% |
| dl.BetterWalls 1.0 | 6 | 33% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 242 of 350 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 54 | 22% | 73 |
| bzdp.Pansy 2.1 | 47 | 19% | 81 |
| bvh.micro.Freya 0.3 | 33 | 14% | 50 |
| mz.Cork 0.1 | 27 | 11% | 46 |
| bvh.mini.Fenrir 0.39 | 27 | 11% | 34 |
| m3thos.Eva02 0.7.1 | 24 | 10% | 31 |
| dl.BetterWalls 1.0 | 11 | 5% | 13 |
| squidM.TentalceMeleeNano 1.1 | 10 | 4% | 12 |
| sample.MyFirstRobot 1.0 | 9 | 4% | 10 |

## Melee bench: F37

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 77.7 | 108 / 350 | 3.01 | 15.5% | 45791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroGG 0.1 | 1.0 | 15.5% | 108 |
| germ.TheMind .2 | 2.7 | 11.4% | 50 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.4 | 11.1% | 33 |
| EBBU.Sim2 1.02 | 4.4 | 10.2% | 24 |
| agrach.Dalek 1.0 | 4.6 | 10.0% | 38 |
| stelo.UntouchableNano 1.3 | 6.3 | 9.2% | 29 |
| lmk.ACPFinal 0.1 | 7.6 | 8.4% | 13 |
| mb.Beast 0.1 | 7.7 | 8.4% | 25 |
| skm.Ryubot 1.0 | 8.5 | 8.0% | 27 |
| mn.nano.perceptual.Impact 1.3.0 | 8.8 | 7.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.2 | 69.8 | 8 / 35 | 5011 |
| 2 | 1 | 59.8 | 73.0 | 4 / 35 | 4287 |
| 3 | 1 | 61.3 | 74.9 | 7 / 35 | 4588 |
| 4 | 1 | 63.0 | 78.1 | 10 / 35 | 4668 |
| 5 | 1 | 64.5 | 83.2 | 16 / 35 | 4672 |
| 6 | 1 | 63.8 | 81.0 | 11 / 35 | 4797 |
| 7 | 1 | 61.8 | 78.1 | 11 / 35 | 4055 |
| 8 | 1 | 64.3 | 81.9 | 15 / 35 | 4690 |
| 9 | 1 | 63.3 | 80.0 | 16 / 35 | 4250 |
| 10 | 1 | 62.3 | 77.1 | 10 / 35 | 4773 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 42 | 40% |
| agrach.Dalek 1.0 | 29 | 48% |
| com.syncleus.robocode.Dreadnaught 0.1 | 25 | 68% |
| EBBU.Sim2 1.02 | 23 | 70% |
| stelo.UntouchableNano 1.3 | 22 | 68% |
| mb.Beast 0.1 | 21 | 57% |
| skm.Ryubot 1.0 | 20 | 40% |
| lmk.ACPFinal 0.1 | 12 | 58% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 67% |

Hadur died in 245 of 350 rounds, at a mean tick of 576. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 59 | 24% | 74 |
| EBBU.Sim2 1.02 | 29 | 12% | 43 |
| agrach.Dalek 1.0 | 28 | 11% | 45 |
| com.syncleus.robocode.Dreadnaught 0.1 | 27 | 11% | 47 |
| mb.Beast 0.1 | 26 | 11% | 39 |
| stelo.UntouchableNano 1.3 | 23 | 9% | 33 |
| skm.Ryubot 1.0 | 22 | 9% | 28 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 7% | 17 |
| lmk.ACPFinal 0.1 | 15 | 6% | 24 |

## Melee bench: F38

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 64.8 | 35 / 350 | 4.17 | 12.4% | 32428 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.3% | 174 |
| bvh.mini.Freya 0.55 | 2.8 | 12.8% | 33 |
| hadur117.nano.SanaroGG 0.1 | 3.2 | 12.4% | 35 |
| bts.mega.Gnarly 1.4 | 4.1 | 11.9% | 52 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.6 | 11.4% | 29 |
| cs.Wren 1.0 | 5.6 | 10.7% | 12 |
| kdf.KoulDestroyer 1.0 | 6.7 | 9.1% | 10 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 6.3% | 4 |
| matt.UnderDark3 2.4.34 | 9.4 | 4.3% | 1 |
| bzdp.BoxCar 2.0 | 9.4 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.0 | 61.9 | 3 / 35 | 2998 |
| 2 | 4 | 56.7 | 63.2 | 1 / 35 | 3137 |
| 3 | 3 | 58.5 | 65.1 | 3 / 35 | 3461 |
| 4 | 3 | 59.4 | 68.3 | 3 / 35 | 3314 |
| 5 | 5 | 55.9 | 60.3 | 4 / 35 | 2728 |
| 6 | 3 | 57.5 | 60.3 | 4 / 35 | 3436 |
| 7 | 2 | 59.3 | 67.3 | 4 / 35 | 3464 |
| 8 | 2 | 59.3 | 67.6 | 4 / 35 | 3427 |
| 9 | 2 | 60.6 | 70.8 | 7 / 35 | 3437 |
| 10 | 4 | 56.9 | 62.9 | 2 / 35 | 3026 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 63 | 27% |
| bts.mega.Gnarly 1.4 | 19 | 21% |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 13% |
| bvh.mini.Freya 0.55 | 8 | 50% |
| cs.Wren 1.0 | 6 | 50% |
| kdf.KoulDestroyer 1.0 | 4 | 75% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 67% |

Hadur died in 315 of 350 rounds, at a mean tick of 670. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 98 | 31% | 115 |
| bts.mega.Gnarly 1.4 | 51 | 16% | 55 |
| bvh.mini.Freya 0.55 | 50 | 16% | 55 |
| davidalves.net.DuelistNanoMelee 1.01 | 46 | 15% | 49 |
| cs.Wren 1.0 | 29 | 9% | 32 |
| kdf.KoulDestroyer 1.0 | 27 | 9% | 28 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7 | 2% | 9 |
| bzdp.BoxCar 2.0 | 5 | 2% | 5 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 2 |

## Melee bench: F39

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 67.5 | 42 / 350 | 3.92 | 13.0% | 35151 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.2 | 15.6% | 91 |
| hadur117.nano.SanaroGG 0.1 | 2.4 | 13.0% | 42 |
| az.Ololobot 0.2.4 | 2.7 | 13.0% | 112 |
| catcat20.Lambda 0.024 | 3.9 | 11.5% | 47 |
| stelo.SoRobotNanoMelee 1.2 | 5.1 | 10.1% | 41 |
| winamp32.micro.MicroMacro 1.0 | 6.4 | 9.0% | 9 |
| apollokidd.ApolloKidd 0.9 | 6.7 | 8.4% | 2 |
| gimp.GimpBot 0.1 | 7.6 | 8.1% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.1 | 6.3% | 4 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.3 | 65.4 | 2 / 35 | 3318 |
| 2 | 2 | 60.0 | 71.7 | 2 / 35 | 3801 |
| 3 | 3 | 55.7 | 60.0 | 5 / 35 | 3302 |
| 4 | 2 | 58.0 | 67.0 | 6 / 35 | 3402 |
| 5 | 3 | 58.1 | 65.4 | 4 / 35 | 3582 |
| 6 | 3 | 57.4 | 64.8 | 2 / 35 | 3470 |
| 7 | 4 | 54.1 | 58.4 | 3 / 35 | 3011 |
| 8 | 1 | 61.3 | 73.7 | 9 / 35 | 3679 |
| 9 | 2 | 59.2 | 70.8 | 2 / 35 | 3531 |
| 10 | 1 | 62.5 | 78.1 | 7 / 35 | 4055 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 46 | 4% |
| bvh.fry.Freya 0.82 | 37 | 30% |
| catcat20.Lambda 0.024 | 30 | 60% |
| stelo.SoRobotNanoMelee 1.2 | 17 | 29% |
| winamp32.micro.MicroMacro 1.0 | 5 | 40% |
| whitesquare.robots.SkynetAdvanced 1.1 | 3 | 67% |
| gimp.GimpBot 0.1 | 2 | 50% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 308 of 350 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 98 | 32% | 107 |
| az.Ololobot 0.2.4 | 63 | 20% | 68 |
| stelo.SoRobotNanoMelee 1.2 | 42 | 14% | 44 |
| apollokidd.ApolloKidd 0.9 | 34 | 11% | 37 |
| catcat20.Lambda 0.024 | 32 | 10% | 45 |
| winamp32.micro.MicroMacro 1.0 | 20 | 6% | 23 |
| gimp.GimpBot 0.1 | 10 | 3% | 14 |
| whitesquare.robots.SkynetAdvanced 1.1 | 6 | 2% | 9 |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 1% | 3 |

## Melee bench: F41

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 70.9 | 80 / 350 | 3.62 | 13.8% | 32494 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 16.7% | 158 |
| ary.Swarm 1.1 | 2.5 | 13.9% | 40 |
| hadur117.nano.SanaroGG 0.1 | 2.9 | 13.8% | 80 |
| lessonz.robocode.Oz 0.5.0 | 3.9 | 12.9% | 37 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.6% | 28 |
| shrub.Silver v048 | 6.1 | 9.2% | 3 |
| zyx.nano.Ant 1.1 | 6.9 | 7.6% | 0 |
| jsal.Jsalbot 1.0 | 8.4 | 6.0% | 4 |
| stelo.Mirror 1.1 | 8.6 | 5.9% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.1 | 71.7 | 7 / 35 | 3141 |
| 2 | 4 | 59.1 | 66.0 | 8 / 35 | 3125 |
| 3 | 4 | 59.4 | 64.8 | 7 / 35 | 3253 |
| 4 | 2 | 62.2 | 74.0 | 9 / 35 | 3391 |
| 5 | 2 | 63.8 | 79.4 | 9 / 35 | 3539 |
| 6 | 2 | 61.5 | 72.4 | 8 / 35 | 3402 |
| 7 | 3 | 59.4 | 65.7 | 7 / 35 | 3120 |
| 8 | 2 | 61.8 | 74.0 | 10 / 35 | 3194 |
| 9 | 3 | 60.9 | 70.2 | 10 / 35 | 3164 |
| 10 | 3 | 60.7 | 70.8 | 5 / 35 | 3165 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 62 | 40% |
| ary.Swarm 1.1 | 29 | 76% |
| lessonz.robocode.Oz 0.5.0 | 28 | 61% |
| simonton.nano.MeleeSeed 1.8 | 13 | 62% |
| stelo.Mirror 1.1 | 4 | 100% |
| shrub.Silver v048 | 3 | 100% |
| jsal.Jsalbot 1.0 | 1 | 0% |

Hadur died in 270 of 350 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 88 | 33% | 114 |
| ary.Swarm 1.1 | 63 | 23% | 86 |
| lessonz.robocode.Oz 0.5.0 | 53 | 20% | 60 |
| simonton.nano.MeleeSeed 1.8 | 28 | 10% | 40 |
| shrub.Silver v048 | 16 | 6% | 18 |
| zyx.nano.Ant 1.1 | 8 | 3% | 8 |
| stelo.Mirror 1.1 | 7 | 3% | 13 |
| jsal.Jsalbot 1.0 | 4 | 1% | 8 |
| acogdev.alpha 0.2 | 3 | 1% | 3 |

## Melee bench: F42

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 71.1 | 52 / 350 | 3.60 | 13.9% | 38211 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.4% | 173 |
| ara.Shera 0.88 | 2.6 | 14.5% | 84 |
| maribo.mini.MiniQuester 0.1 | 3.1 | 13.9% | 30 |
| hadur117.nano.SanaroGG 0.1 | 3.3 | 13.9% | 52 |
| amz.NanoClone 1.41 | 5.0 | 9.2% | 3 |
| maribo.IotaCT 1.1 | 6.8 | 7.4% | 3 |
| dsw.StaticD 1.0 | 6.8 | 7.0% | 4 |
| stelo.MirrorMicro 1.0 | 8.3 | 6.0% | 0 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.7% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.6 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.1 | 63.5 | 4 / 35 | 3575 |
| 2 | 3 | 60.7 | 70.2 | 6 / 35 | 3718 |
| 3 | 4 | 61.8 | 72.7 | 6 / 35 | 3933 |
| 4 | 2 | 63.0 | 74.9 | 6 / 35 | 4298 |
| 5 | 2 | 63.6 | 77.5 | 12 / 35 | 4023 |
| 6 | 4 | 59.7 | 69.2 | 3 / 35 | 3542 |
| 7 | 4 | 60.1 | 70.2 | 4 / 35 | 3455 |
| 8 | 3 | 60.0 | 68.6 | 3 / 35 | 3752 |
| 9 | 3 | 60.9 | 72.1 | 3 / 35 | 3821 |
| 10 | 4 | 62.0 | 72.4 | 5 / 35 | 4094 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 77 | 26% |
| ara.Shera 0.88 | 36 | 36% |
| maribo.mini.MiniQuester 0.1 | 18 | 83% |
| dsw.StaticD 1.0 | 4 | 75% |
| amz.NanoClone 1.41 | 2 | 0% |
| maribo.IotaCT 1.1 | 2 | 0% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 0% |

Hadur died in 298 of 350 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 109 | 37% | 126 |
| ara.Shera 0.88 | 84 | 28% | 97 |
| maribo.mini.MiniQuester 0.1 | 53 | 18% | 70 |
| amz.NanoClone 1.41 | 17 | 6% | 17 |
| maribo.IotaCT 1.1 | 10 | 3% | 10 |
| mme.NikeEnhanced 2.0 | 9 | 3% | 9 |
| dsw.StaticD 1.0 | 8 | 3% | 11 |
| stelo.MirrorMicro 1.0 | 4 | 1% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 4 | 1% | 4 |

## Melee bench: F43

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 63.7 | 16 / 350 | 4.27 | 12.2% | 33302 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.7% | 278 |
| brainfade.melee.Dusk 0.44 | 2.8 | 12.8% | 35 |
| dummy.micro.Sparrow 2.5 | 2.9 | 12.4% | 12 |
| hadur117.nano.SanaroGG 0.1 | 3.5 | 12.2% | 16 |
| wcsv.melee.EngineerMelee 0.1 | 5.3 | 10.5% | 6 |
| Krabb.akim2.Akim2 1.1b | 5.5 | 10.1% | 2 |
| mz.NanoGod 2.02 | 7.2 | 8.0% | 1 |
| jab.DiamondStealer 5 | 7.8 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.0 | 69.2 | 1 / 35 | 4004 |
| 2 | 4 | 59.3 | 62.9 | 1 / 35 | 3205 |
| 3 | 4 | 59.7 | 61.6 | 3 / 35 | 3381 |
| 4 | 4 | 58.1 | 61.3 | 1 / 35 | 3016 |
| 5 | 2 | 60.4 | 66.3 | 1 / 35 | 3523 |
| 6 | 3 | 58.7 | 64.1 | 2 / 35 | 3022 |
| 7 | 4 | 58.5 | 61.6 | 1 / 35 | 3200 |
| 8 | 4 | 58.8 | 62.5 | 1 / 35 | 3299 |
| 9 | 5 | 57.8 | 59.4 | 3 / 35 | 3077 |
| 10 | 2 | 61.5 | 67.9 | 2 / 35 | 3575 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 81 | 7% |
| dummy.micro.Sparrow 2.5 | 9 | 67% |
| brainfade.melee.Dusk 0.44 | 8 | 50% |
| cvt.Firsty 1.0 | 1 | 0% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |

Hadur died in 334 of 350 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 176 | 53% | 183 |
| brainfade.melee.Dusk 0.44 | 40 | 12% | 43 |
| dummy.micro.Sparrow 2.5 | 39 | 12% | 45 |
| wcsv.melee.EngineerMelee 0.1 | 34 | 10% | 34 |
| Krabb.akim2.Akim2 1.1b | 18 | 5% | 18 |
| mz.NanoGod 2.02 | 17 | 5% | 17 |
| jab.DiamondStealer 5 | 9 | 3% | 9 |
| cvt.Firsty 1.0 | 1 | 0% | 1 |

## Melee bench: F44

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 71.1 | 70 / 350 | 3.60 | 14.3% | 38892 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.5 | 16.3% | 140 |
| tzu.TheArtOfWar 1.2 | 2.0 | 15.4% | 94 |
| hadur117.nano.SanaroGG 0.1 | 2.5 | 14.3% | 70 |
| jwirde.Gort 2.0 | 4.4 | 11.0% | 29 |
| wompi.Quokka 1.6 | 4.7 | 10.6% | 12 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6.0 | 8.8% | 3 |
| disan.Chair 2.2.0 | 7.0 | 7.6% | 1 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.7% | 1 |
| sample.Crazy 1.0 | 9.4 | 4.6% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.8 | 70.2 | 10 / 35 | 3593 |
| 2 | 2 | 64.2 | 78.1 | 10 / 35 | 4000 |
| 3 | 3 | 61.0 | 69.5 | 5 / 35 | 3771 |
| 4 | 3 | 60.3 | 67.9 | 3 / 35 | 4027 |
| 5 | 2 | 61.5 | 70.5 | 5 / 35 | 4179 |
| 6 | 2 | 61.8 | 70.8 | 9 / 35 | 3834 |
| 7 | 3 | 59.1 | 65.4 | 5 / 35 | 3592 |
| 8 | 2 | 62.2 | 73.3 | 8 / 35 | 4055 |
| 9 | 2 | 63.3 | 73.7 | 10 / 35 | 4035 |
| 10 | 3 | 61.7 | 72.1 | 5 / 35 | 3806 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 74 | 50% |
| tzu.TheArtOfWar 1.2 | 48 | 31% |
| jwirde.Gort 2.0 | 14 | 29% |
| wompi.Quokka 1.6 | 7 | 71% |
| disan.Chair 2.2.0 | 5 | 80% |
| stf.PanzerGeneral 0.1 | 3 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 280 of 350 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 96 | 34% | 130 |
| tzu.TheArtOfWar 1.2 | 74 | 26% | 94 |
| jwirde.Gort 2.0 | 32 | 11% | 41 |
| wompi.Quokka 1.6 | 28 | 10% | 29 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 17 | 6% | 18 |
| stf.PanzerGeneral 0.1 | 11 | 4% | 13 |
| disan.Chair 2.2.0 | 11 | 4% | 11 |
| amk.jointstrike.JointStrike 0.2 | 9 | 3% | 9 |
| sample.Crazy 1.0 | 2 | 1% | 4 |

## Melee bench: F45

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 71.4 | 57 / 350 | 3.57 | 14.7% | 40735 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroGG 0.1 | 1.1 | 14.7% | 57 |
| eem.IWillFireNoBullet v2.8 | 1.9 | 13.6% | 196 |
| jje.BagPuss 1.2 | 3.1 | 12.3% | 19 |
| sul.Lunar 1.1 | 4.4 | 11.0% | 28 |
| myl.nano.Graviton 1.10 | 4.8 | 10.7% | 15 |
| hvilela.HVilela 0.9 | 6.3 | 9.1% | 1 |
| fm.claire 1.7 | 7.1 | 8.3% | 2 |
| pez.mini.ChironexFleckeri 0.5 | 7.6 | 8.2% | 6 |
| wit.Deep7 2.0 | 9.1 | 6.5% | 26 |
| abud.ThirdRobo 1.0 | 9.6 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 73.7 | 6 / 35 | 4168 |
| 2 | 1 | 62.2 | 74.6 | 6 / 35 | 4043 |
| 3 | 1 | 60.9 | 69.2 | 4 / 35 | 4146 |
| 4 | 2 | 60.8 | 68.9 | 6 / 35 | 4070 |
| 5 | 1 | 62.6 | 71.4 | 9 / 35 | 4418 |
| 6 | 1 | 61.1 | 71.7 | 4 / 35 | 3915 |
| 7 | 1 | 61.1 | 68.3 | 8 / 35 | 4147 |
| 8 | 1 | 61.6 | 72.1 | 4 / 35 | 4084 |
| 9 | 1 | 61.7 | 72.4 | 4 / 35 | 4079 |
| 10 | 1 | 61.0 | 71.7 | 6 / 35 | 3665 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 104 | 27% |
| sul.Lunar 1.1 | 14 | 57% |
| wit.Deep7 2.0 | 12 | 0% |
| jje.BagPuss 1.2 | 12 | 58% |
| myl.nano.Graviton 1.10 | 9 | 44% |
| fm.claire 1.7 | 5 | 80% |
| pez.mini.ChironexFleckeri 0.5 | 4 | 75% |
| hvilela.HVilela 0.9 | 2 | 100% |
| abud.ThirdRobo 1.0 | 1 | 0% |

Hadur died in 294 of 350 rounds, at a mean tick of 1313. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 85 | 29% | 0 |
| jje.BagPuss 1.2 | 48 | 16% | 95 |
| sul.Lunar 1.1 | 40 | 14% | 80 |
| myl.nano.Graviton 1.10 | 36 | 12% | 54 |
| hvilela.HVilela 0.9 | 26 | 9% | 35 |
| pez.mini.ChironexFleckeri 0.5 | 17 | 6% | 27 |
| fm.claire 1.7 | 17 | 6% | 25 |
| wit.Deep7 2.0 | 17 | 6% | 23 |
| abud.ThirdRobo 1.0 | 8 | 3% | 11 |

## Melee bench: F46

hadur117.nano.SanaroGG 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 70.0 | 37 / 350 | 3.70 | 12.9% | 30705 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.6% | 137 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 16.7% | 135 |
| hadur117.nano.SanaroGG 0.1 | 3.1 | 12.9% | 37 |
| mz.MicroSheep 1.0 | 4.1 | 11.2% | 10 |
| cx.Princess 1.0 | 5.0 | 10.5% | 27 |
| sadoner.killer 0.2 | 6.0 | 9.2% | 1 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.8% | 3 |
| jeremyreeder.collective.Prophet 5 | 8.1 | 5.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.9 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.5 | 70.8 | 5 / 35 | 2841 |
| 2 | 3 | 59.4 | 67.9 | 5 / 35 | 3258 |
| 3 | 3 | 59.5 | 68.3 | 4 / 35 | 3124 |
| 4 | 3 | 58.3 | 67.0 | 3 / 35 | 3183 |
| 5 | 3 | 59.2 | 70.2 | 4 / 35 | 2821 |
| 6 | 3 | 61.6 | 76.5 | 6 / 35 | 3103 |
| 7 | 3 | 60.9 | 73.0 | 4 / 35 | 3215 |
| 8 | 3 | 57.9 | 67.0 | 3 / 35 | 2778 |
| 9 | 4 | 57.0 | 63.8 | 0 / 35 | 2974 |
| 10 | 3 | 61.5 | 75.6 | 3 / 35 | 3408 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 59 | 24% |
| rsalesc.melee.Medina 0.4.5 | 49 | 33% |
| cx.Princess 1.0 | 11 | 45% |
| mz.MicroSheep 1.0 | 4 | 25% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 313 of 350 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 129 | 41% | 147 |
| rsalesc.melee.Medina 0.4.5 | 81 | 26% | 94 |
| mz.MicroSheep 1.0 | 28 | 9% | 29 |
| sadoner.killer 0.2 | 24 | 8% | 24 |
| cx.Princess 1.0 | 23 | 7% | 27 |
| arthord.NanoSatanMelee Beta | 18 | 6% | 19 |
| jeremyreeder.collective.Prophet 5 | 10 | 3% | 10 |

