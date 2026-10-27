# Bench suite: suite.txt

## Melee bench: F01

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 73.5 | 29 / 280 | 3.38 | 14.9% | 37534 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 206 |
| hadur117.micro.SaorS1 0.1 | 2.0 | 14.9% | 29 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.6 | 11.5% | 10 |
| sgp.JollyNinja 3.53 | 3.6 | 11.4% | 17 |
| mz.MicroGodMelee 1 | 5.1 | 10.5% | 12 |
| lorneswork.Predator 1.0 | 5.6 | 9.7% | 4 |
| adt.Ar2 1.0 | 7.0 | 7.3% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.8% | 1 |
| skm.butterfly 1.0 | 8.9 | 5.1% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 73.3 | 5 / 35 | 4643 |
| 2 | 2 | 62.9 | 72.4 | 0 / 35 | 4597 |
| 3 | 2 | 63.3 | 74.6 | 5 / 35 | 4476 |
| 4 | 2 | 63.2 | 74.0 | 1 / 35 | 4540 |
| 5 | 2 | 63.6 | 74.3 | 7 / 35 | 4699 |
| 6 | 2 | 63.1 | 72.7 | 1 / 35 | 4863 |
| 7 | 2 | 63.2 | 72.1 | 5 / 35 | 5000 |
| 8 | 2 | 64.0 | 74.9 | 5 / 35 | 4716 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 100 | 2% |
| sgp.JollyNinja 3.53 | 14 | 79% |
| mz.MicroGodMelee 1 | 14 | 43% |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 75% |
| lorneswork.Predator 1.0 | 4 | 75% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 0% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 251 of 280 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 148 | 59% | 155 |
| simonton.nano.WeekendObsession_Melee 1.0 | 29 | 12% | 33 |
| sgp.JollyNinja 3.53 | 20 | 8% | 26 |
| mz.MicroGodMelee 1 | 20 | 8% | 25 |
| lorneswork.Predator 1.0 | 14 | 6% | 18 |
| kawigi.sbf.FloodSonnet 0.9 | 6 | 2% | 8 |
| adt.Ar2 1.0 | 6 | 2% | 6 |
| skm.butterfly 1.0 | 4 | 2% | 5 |
| mym.EdgeStalker 1.0 | 4 | 2% | 4 |

## Melee bench: F02

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 80.9 | 101 / 280 | 2.72 | 17.6% | 41682 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.1 | 17.6% | 101 |
| pulsar.PulsarMax 0.8.9 | 2.4 | 14.4% | 71 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.3% | 56 |
| lrem.micro.SpikeSoldier 0.4 | 4.4 | 10.3% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.3 | 9.4% | 9 |
| fnc.bandit.Bandit 5.2.0 | 6.3 | 8.3% | 0 |
| Noran.BitchingElk 0.054 | 7.1 | 7.9% | 20 |
| sch.Simone 0.3d | 7.4 | 7.5% | 13 |
| stelo.PatternRobot 1.0 | 8.8 | 6.2% | 5 |
| fullsail.SweetTea 1.1 | 9.9 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 82.5 | 11 / 35 | 5154 |
| 2 | 1 | 63.8 | 71.4 | 11 / 35 | 4778 |
| 3 | 1 | 68.7 | 86.3 | 18 / 35 | 5437 |
| 4 | 1 | 65.2 | 76.2 | 11 / 35 | 5083 |
| 5 | 1 | 67.5 | 81.6 | 18 / 35 | 5247 |
| 6 | 2 | 65.0 | 77.1 | 6 / 35 | 4986 |
| 7 | 1 | 67.8 | 85.1 | 13 / 35 | 5355 |
| 8 | 1 | 68.1 | 86.7 | 13 / 35 | 5642 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 65 | 46% |
| pulsar.PulsarMax 0.8.9 | 48 | 40% |
| Noran.BitchingElk 0.054 | 19 | 58% |
| stelo.PatternRobot 1.0 | 13 | 92% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 91% |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 64% |
| sch.Simone 0.3d | 10 | 60% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |

Hadur died in 180 of 280 rounds, at a mean tick of 978. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 64 | 36% | 85 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 54 | 30% | 87 |
| sch.Simone 0.3d | 12 | 7% | 17 |
| Noran.BitchingElk 0.054 | 11 | 6% | 27 |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 6% | 18 |
| stelo.PatternRobot 1.0 | 10 | 6% | 14 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 5% | 15 |
| fnc.bandit.Bandit 5.2.0 | 8 | 4% | 10 |
| fullsail.SweetTea 1.1 | 2 | 1% | 7 |

## Melee bench: F03

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 77.5 | 150 / 280 | 3.03 | 17.4% | 44166 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.1 | 17.4% | 150 |
| radnor.DoctorBob 1.42 | 2.0 | 14.5% | 49 |
| kawigi.nano.Lib 1.0 | 3.4 | 12.8% | 39 |
| vuen.Cake 2.51 | 3.5 | 12.6% | 33 |
| urdos.URDOS 1.3 | 5.0 | 9.8% | 5 |
| adt.Ar1 2.1 | 6.4 | 7.6% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.1 | 7.1% | 1 |
| oa.weak.FlyMk1 0.1 | 7.6 | 6.9% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 6.1% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 81.9 | 20 / 35 | 5619 |
| 2 | 1 | 66.0 | 74.9 | 17 / 35 | 5590 |
| 3 | 1 | 64.7 | 71.7 | 18 / 35 | 5107 |
| 4 | 2 | 64.2 | 72.4 | 13 / 35 | 5156 |
| 5 | 1 | 68.6 | 82.9 | 26 / 35 | 5819 |
| 6 | 1 | 67.4 | 79.7 | 17 / 35 | 6163 |
| 7 | 1 | 67.0 | 81.0 | 21 / 35 | 5310 |
| 8 | 1 | 65.7 | 75.6 | 18 / 35 | 5402 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 62 | 85% |
| kawigi.nano.Lib 1.0 | 51 | 84% |
| radnor.DoctorBob 1.42 | 50 | 80% |
| urdos.URDOS 1.3 | 6 | 67% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 100% |
| oa.weak.FlyMk1 0.1 | 3 | 67% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| adt.Ar1 2.1 | 2 | 100% |

Hadur died in 131 of 280 rounds, at a mean tick of 544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 38 | 29% | 82 |
| kawigi.nano.Lib 1.0 | 33 | 25% | 79 |
| bwbaugh.nano.Tirunculus 0.0.0a | 18 | 14% | 16 |
| vuen.Cake 2.51 | 14 | 11% | 56 |
| urdos.URDOS 1.3 | 14 | 11% | 19 |
| ghent.ArthurPanzergon 1.0.0 | 6 | 5% | 8 |
| adt.Ar1 2.1 | 4 | 3% | 7 |
| oa.weak.FlyMk1 0.1 | 2 | 2% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 2% | 4 |

## Melee bench: F04

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 73.4 | 11 / 280 | 3.39 | 15.2% | 42172 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.3% | 243 |
| hadur117.micro.SaorS1 0.1 | 2.0 | 15.2% | 11 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.2% | 14 |
| TNT.TNT 0.99.1 | 4.0 | 11.5% | 6 |
| josago.Jorgito 0.16 | 5.0 | 9.1% | 4 |
| tj.zombie1n 1.0.1 | 6.4 | 7.0% | 0 |
| css.Delitioner 0.11 | 6.6 | 6.8% | 2 |
| rampancy.Durandal 2.1d | 8.1 | 5.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.4% | 0 |
| spin.Bugstard 0.012b | 9.6 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 75.6 | 1 / 35 | 5256 |
| 2 | 2 | 64.4 | 72.1 | 2 / 35 | 5256 |
| 3 | 2 | 63.1 | 69.2 | 0 / 35 | 4894 |
| 4 | 2 | 63.3 | 69.8 | 1 / 35 | 4907 |
| 5 | 2 | 67.2 | 79.4 | 1 / 35 | 6069 |
| 6 | 2 | 64.7 | 72.7 | 4 / 35 | 5353 |
| 7 | 2 | 64.9 | 77.8 | 1 / 35 | 5030 |
| 8 | 2 | 64.0 | 70.8 | 1 / 35 | 5407 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 97 | 4% |
| apc.LeeroyJenkins2 1.0 | 7 | 43% |
| TNT.TNT 0.99.1 | 5 | 40% |
| josago.Jorgito 0.16 | 1 | 0% |
| sp.Nanos.Ember 1.1 | 1 | 100% |
| tj.zombie1n 1.0.1 | 1 | 100% |

Hadur died in 269 of 280 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 193 | 72% | 198 |
| apc.LeeroyJenkins2 1.0 | 34 | 13% | 38 |
| josago.Jorgito 0.16 | 17 | 6% | 17 |
| TNT.TNT 0.99.1 | 12 | 4% | 15 |
| tj.zombie1n 1.0.1 | 5 | 2% | 5 |
| css.Delitioner 0.11 | 5 | 2% | 5 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 0 |

## Melee bench: F05

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 58.0 | 10 / 280 | 4.78 | 12.1% | 32040 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.1 | 18.8% | 166 |
| justin.DemonicRage 3.4 | 1.9 | 16.8% | 80 |
| wompi.Numbat 2.1 | 3.3 | 12.8% | 14 |
| hadur117.micro.SaorS1 0.1 | 3.8 | 12.1% | 10 |
| axeBots.HataMoto 3.09 | 5.3 | 9.5% | 9 |
| ms.Ares 0.19 | 5.8 | 8.8% | 1 |
| supersample.SuperBoxBot 1.0 | 7.1 | 6.2% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.5% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.9% | 0 |
| GarmBox.Oranges 1.0 | 9.6 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.8 | 59.4 | 3 / 35 | 3741 |
| 2 | 4 | 56.3 | 54.6 | 1 / 35 | 3954 |
| 3 | 3 | 58.7 | 58.1 | 3 / 35 | 4154 |
| 4 | 4 | 57.8 | 57.5 | 0 / 35 | 4144 |
| 5 | 4 | 57.8 | 57.5 | 1 / 35 | 3907 |
| 6 | 4 | 56.7 | 54.9 | 0 / 35 | 3906 |
| 7 | 4 | 59.4 | 62.5 | 1 / 35 | 4027 |
| 8 | 4 | 59.1 | 59.7 | 1 / 35 | 4207 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 31 | 3% |
| justin.DemonicRage 3.4 | 13 | 15% |
| wompi.Numbat 2.1 | 9 | 56% |
| axeBots.HataMoto 3.09 | 3 | 67% |

Hadur died in 270 of 280 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 103 | 38% | 104 |
| justin.DemonicRage 3.4 | 76 | 28% | 78 |
| wompi.Numbat 2.1 | 27 | 10% | 31 |
| supersample.SuperBoxBot 1.0 | 19 | 7% | 19 |
| axeBots.HataMoto 3.09 | 13 | 5% | 16 |
| ms.Ares 0.19 | 13 | 5% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 11 | 4% | 12 |
| GarmBox.Oranges 1.0 | 6 | 2% | 5 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 76.9 | 139 / 280 | 3.08 | 16.5% | 35106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 16.5% | 139 |
| jekl.StoneGhost 0.7 | 2.3 | 14.9% | 46 |
| origin.SleepSiphon 1.7b | 3.0 | 13.3% | 58 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.9% | 20 |
| mld.Wisdom 1.0 | 4.8 | 10.8% | 4 |
| gg.Wolverine 2.0 | 6.3 | 8.4% | 5 |
| spinnercat.Omen 1.0 | 7.1 | 7.3% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.1 | 6.8% | 6 |
| DBall.NUKE 0.1 | 8.5 | 6.4% | 1 |
| sample.Fire 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 82.9 | 19 / 35 | 4492 |
| 2 | 1 | 63.7 | 73.7 | 16 / 35 | 3928 |
| 3 | 1 | 65.0 | 76.2 | 17 / 35 | 4434 |
| 4 | 1 | 66.7 | 82.2 | 18 / 35 | 4365 |
| 5 | 1 | 64.8 | 75.2 | 18 / 35 | 4450 |
| 6 | 1 | 64.2 | 73.7 | 19 / 35 | 4053 |
| 7 | 1 | 67.2 | 80.6 | 20 / 35 | 4879 |
| 8 | 1 | 63.4 | 70.5 | 12 / 35 | 4505 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 66 | 82% |
| origin.SleepSiphon 1.7b | 50 | 64% |
| pe.minimelee.SandboxMiniMelee 1.1 | 29 | 93% |
| gg.Wolverine 2.0 | 16 | 88% |
| mld.Wisdom 1.0 | 4 | 100% |
| DBall.NUKE 0.1 | 3 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 141 of 280 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 39 | 28% | 46 |
| origin.SleepSiphon 1.7b | 30 | 21% | 68 |
| jekl.StoneGhost 0.7 | 29 | 21% | 67 |
| pe.minimelee.SandboxMiniMelee 1.1 | 23 | 16% | 55 |
| gg.Wolverine 2.0 | 7 | 5% | 21 |
| sample.Fire 1.0 | 5 | 4% | 5 |
| DBall.NUKE 0.1 | 4 | 3% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 1% | 7 |
| spinnercat.Omen 1.0 | 2 | 1% | 5 |

## Melee bench: F07

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 83.8 | 90 / 280 | 2.46 | 18.4% | 48704 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.3 | 18.4% | 90 |
| rsalesc.melee.Monk 0.3.6c | 2.1 | 17.6% | 78 |
| rtk.Tachikoma 1.0 | 2.6 | 16.2% | 74 |
| franzor.Lizt 1.3.1 | 4.4 | 11.2% | 25 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 10.2% | 14 |
| lrem.micro.MoggFanatic 0.2 | 6.1 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.2% | 0 |
| sample.Target 1.0 | 9.3 | 2.9% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 84.4 | 10 / 35 | 6310 |
| 2 | 3 | 68.1 | 80.3 | 9 / 35 | 5724 |
| 3 | 1 | 68.6 | 82.9 | 8 / 35 | 5857 |
| 4 | 1 | 69.3 | 84.4 | 8 / 35 | 6150 |
| 5 | 1 | 67.9 | 78.7 | 11 / 35 | 6025 |
| 6 | 1 | 71.0 | 88.9 | 14 / 35 | 6544 |
| 7 | 1 | 69.5 | 85.1 | 13 / 35 | 5882 |
| 8 | 1 | 70.4 | 85.7 | 17 / 35 | 6212 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 87 | 47% |
| rsalesc.melee.Monk 0.3.6c | 60 | 15% |
| franzor.Lizt 1.3.1 | 26 | 69% |
| oog.melee.CapuletDroid 1.1 | 23 | 78% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |
| skm.PateranBotlock2 1.0 | 1 | 100% |

Hadur died in 191 of 280 rounds, at a mean tick of 1248. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 83 | 43% | 114 |
| rtk.Tachikoma 1.0 | 70 | 37% | 128 |
| oog.melee.CapuletDroid 1.1 | 19 | 10% | 20 |
| franzor.Lizt 1.3.1 | 11 | 6% | 6 |
| exauge.GateKeeper 1.1.121g | 3 | 2% | 7 |
| lrem.micro.MoggFanatic 0.2 | 3 | 2% | 3 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 76.8 | 121 / 280 | 3.09 | 17.5% | 42919 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 17.5% | 121 |
| tm.Yuugao 1.0 | 2.3 | 13.2% | 80 |
| shrub.Vapour v159 | 3.1 | 11.6% | 30 |
| Krabb.sliNk.Garm 0.9u | 4.4 | 10.5% | 20 |
| com.spp.robocode.MostlyHarmless 010 | 4.6 | 10.4% | 17 |
| m3thos.Eva00 1.1 | 6.1 | 9.2% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 8.2% | 8 |
| qualidafial.MajorDick 1.0.1 | 7.9 | 7.3% | 1 |
| SHAM.WOW 1.4 | 9.3 | 6.1% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.4 | 6.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 67.3 | 13 / 35 | 4854 |
| 2 | 1 | 69.2 | 86.0 | 19 / 35 | 5893 |
| 3 | 1 | 66.2 | 76.8 | 17 / 35 | 5402 |
| 4 | 1 | 65.3 | 74.6 | 11 / 35 | 5670 |
| 5 | 1 | 65.5 | 73.3 | 15 / 35 | 5611 |
| 6 | 1 | 66.5 | 78.4 | 16 / 35 | 5175 |
| 7 | 1 | 65.7 | 75.6 | 17 / 35 | 4991 |
| 8 | 1 | 67.2 | 82.2 | 13 / 35 | 5323 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 65 | 31% |
| shrub.Vapour v159 | 46 | 72% |
| Krabb.sliNk.Garm 0.9u | 24 | 92% |
| com.spp.robocode.MostlyHarmless 010 | 21 | 81% |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 93% |
| m3thos.Eva00 1.1 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| SHAM.WOW 1.4 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 161 of 280 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 69 | 43% | 100 |
| shrub.Vapour v159 | 25 | 16% | 45 |
| com.spp.robocode.MostlyHarmless 010 | 15 | 9% | 40 |
| Krabb.sliNk.Garm 0.9u | 14 | 9% | 23 |
| zyx.nano.BacillusComma 1.0 | 13 | 8% | 15 |
| SHAM.WOW 1.4 | 7 | 4% | 13 |
| qualidafial.MajorDick 1.0.1 | 7 | 4% | 10 |
| m3thos.Eva00 1.1 | 6 | 4% | 18 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 3% | 16 |

## Melee bench: F09

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.1 | 59.0 | 34 / 280 | 4.69 | 12.6% | 30953 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.8% | 156 |
| kc.micro.Figment 1.0 | 2.5 | 13.3% | 38 |
| hadur117.micro.SaorS1 0.1 | 3.0 | 12.6% | 34 |
| yagami.Tidus 0.11 | 3.8 | 11.1% | 1 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.5% | 26 |
| mc2.enemy.Original 0.9 | 5.8 | 9.9% | 19 |
| dft.Calliope 5.6 | 7.0 | 8.0% | 6 |
| step.nanoPri 1.0 | 8.3 | 6.0% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.4 | 5.3% | 0 |
| rdm.Dueler 0.4x | 9.4 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.9 | 61.9 | 3 / 35 | 3841 |
| 2 | 3 | 59.9 | 61.9 | 6 / 35 | 3985 |
| 3 | 3 | 58.1 | 60.3 | 4 / 35 | 3666 |
| 4 | 3 | 58.5 | 58.4 | 8 / 35 | 3945 |
| 5 | 4 | 54.2 | 49.8 | 0 / 35 | 3817 |
| 6 | 3 | 60.3 | 66.3 | 4 / 35 | 3831 |
| 7 | 3 | 56.4 | 52.7 | 3 / 35 | 4061 |
| 8 | 3 | 58.5 | 61.0 | 6 / 35 | 3807 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 45 | 7% |
| kc.micro.Figment 1.0 | 29 | 52% |
| pedersen.Grishnakh 1.0 | 8 | 50% |
| mc2.enemy.Original 0.9 | 7 | 71% |
| yagami.Tidus 0.11 | 4 | 100% |
| dft.Calliope 5.6 | 4 | 75% |

Hadur died in 247 of 280 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 89 | 36% | 97 |
| kc.micro.Figment 1.0 | 76 | 31% | 91 |
| mc2.enemy.Original 0.9 | 22 | 9% | 25 |
| yagami.Tidus 0.11 | 18 | 7% | 21 |
| dft.Calliope 5.6 | 10 | 4% | 11 |
| pedersen.Grishnakh 1.0 | 9 | 4% | 11 |
| step.nanoPri 1.0 | 9 | 4% | 9 |
| robar.nano.Assertive_Melee 0.2 | 8 | 3% | 9 |
| rdm.Dueler 0.4x | 6 | 2% | 6 |

## Melee bench: F10

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 81.6 | 117 / 280 | 2.66 | 17.4% | 42581 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.1 | 17.4% | 117 |
| DTF.Kludgy 1.2b | 1.9 | 15.8% | 94 |
| ejb.Polaris 1.0.1 | 3.5 | 12.4% | 33 |
| ne.Chimera 1.2 | 3.6 | 12.6% | 12 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.3% | 13 |
| vStar.RAFzilla 2.15 | 5.6 | 10.2% | 9 |
| sam.Samspin 1.0 | 7.6 | 5.9% | 0 |
| kurios.DOSexe .9b | 8.1 | 5.6% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.5% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 79.7 | 13 / 35 | 5444 |
| 2 | 1 | 68.5 | 86.7 | 17 / 35 | 5697 |
| 3 | 1 | 66.8 | 83.8 | 12 / 35 | 5175 |
| 4 | 1 | 66.6 | 80.3 | 19 / 35 | 5161 |
| 5 | 1 | 67.0 | 84.1 | 16 / 35 | 5071 |
| 6 | 2 | 61.8 | 67.3 | 6 / 35 | 4855 |
| 7 | 1 | 69.5 | 91.7 | 19 / 35 | 5718 |
| 8 | 1 | 66.5 | 79.0 | 15 / 35 | 5460 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 82 | 28% |
| ejb.Polaris 1.0.1 | 35 | 54% |
| ne.Chimera 1.2 | 35 | 89% |
| tvv.micro.Antares 1.1.1 | 19 | 84% |
| vStar.RAFzilla 2.15 | 16 | 100% |
| donjezza.Muncho 1.0 | 4 | 100% |
| sam.Samspin 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 163 of 280 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 97 | 60% | 121 |
| ne.Chimera 1.2 | 27 | 17% | 54 |
| ejb.Polaris 1.0.1 | 21 | 13% | 46 |
| tvv.micro.Antares 1.1.1 | 6 | 4% | 18 |
| vStar.RAFzilla 2.15 | 3 | 2% | 20 |
| sam.Samspin 1.0 | 3 | 2% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 2% | 3 |
| kurios.DOSexe .9b | 2 | 1% | 7 |
| donjezza.Muncho 1.0 | 1 | 1% | 4 |

## Melee bench: F11

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 69.4 | 52 / 280 | 3.75 | 14.8% | 35904 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 18.1% | 150 |
| hadur117.micro.SaorS1 0.1 | 2.0 | 14.8% | 52 |
| cx.mini.Nimrod 0.55 | 3.1 | 12.1% | 31 |
| djc.DynaBot 0.1.1 | 4.0 | 10.8% | 18 |
| br2.MobyDickBot 1.6 | 5.6 | 8.9% | 9 |
| rdt199.Warlord 0.73 | 6.0 | 8.6% | 13 |
| uji.YellohFellah 1.0 | 7.0 | 8.0% | 10 |
| KiraNL.Chupacabra 0.4 | 7.3 | 7.7% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.9% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.8 | 67.0 | 6 / 35 | 4296 |
| 2 | 2 | 62.9 | 72.4 | 5 / 35 | 4398 |
| 3 | 2 | 64.8 | 75.2 | 7 / 35 | 4832 |
| 4 | 2 | 63.9 | 72.4 | 9 / 35 | 4668 |
| 5 | 2 | 63.6 | 73.7 | 5 / 35 | 4462 |
| 6 | 2 | 61.9 | 68.3 | 7 / 35 | 4530 |
| 7 | 2 | 60.5 | 63.8 | 8 / 35 | 4407 |
| 8 | 2 | 59.8 | 62.9 | 5 / 35 | 4311 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 74 | 16% |
| djc.DynaBot 0.1.1 | 19 | 74% |
| cx.mini.Nimrod 0.55 | 12 | 75% |
| uji.YellohFellah 1.0 | 11 | 73% |
| rdt199.Warlord 0.73 | 9 | 44% |
| br2.MobyDickBot 1.6 | 7 | 57% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 229 of 280 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 113 | 49% | 131 |
| cx.mini.Nimrod 0.55 | 32 | 14% | 39 |
| rdt199.Warlord 0.73 | 20 | 9% | 25 |
| br2.MobyDickBot 1.6 | 17 | 7% | 23 |
| KiraNL.Chupacabra 0.4 | 13 | 6% | 13 |
| djc.DynaBot 0.1.1 | 11 | 5% | 21 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 4% | 11 |
| uji.YellohFellah 1.0 | 8 | 3% | 12 |
| stelo.MirrorNano 1.3 | 4 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 76.7 | 109 / 280 | 3.10 | 16.1% | 30946 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.3 | 16.1% | 109 |
| bts.wiki.RipCurl 0.9b | 2.8 | 13.7% | 59 |
| nat.PallasHawk 1.0 | 2.9 | 13.3% | 44 |
| darkcanuck.Leon 1.01 | 3.1 | 12.9% | 42 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.5% | 14 |
| jrm.Test0 1.0 | 6.4 | 8.2% | 4 |
| cs.sheldor.Talon 1.1 | 7.4 | 7.2% | 1 |
| jp.Perpy 16.0 | 8.0 | 6.7% | 0 |
| jaybot.bots.Oddball 4.0 | 9.1 | 5.7% | 6 |
| stuff.Vlad 0.1 | 9.1 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 66.7 | 11 / 35 | 3733 |
| 2 | 1 | 65.7 | 80.3 | 14 / 35 | 4164 |
| 3 | 1 | 65.0 | 79.7 | 17 / 35 | 3531 |
| 4 | 2 | 59.7 | 66.0 | 8 / 35 | 3503 |
| 5 | 1 | 65.5 | 81.0 | 15 / 35 | 3678 |
| 6 | 1 | 65.7 | 81.6 | 13 / 35 | 4229 |
| 7 | 1 | 64.4 | 78.7 | 13 / 35 | 3915 |
| 8 | 1 | 66.0 | 79.4 | 18 / 35 | 4193 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 50 | 60% |
| nat.PallasHawk 1.0 | 48 | 67% |
| darkcanuck.Leon 1.01 | 45 | 69% |
| brainfade.melee.Genghis 0.36 | 13 | 92% |
| jaybot.bots.Oddball 4.0 | 3 | 0% |
| jrm.Test0 1.0 | 2 | 100% |
| jp.Perpy 16.0 | 2 | 100% |

Hadur died in 171 of 280 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 49 | 29% | 70 |
| nat.PallasHawk 1.0 | 45 | 26% | 76 |
| darkcanuck.Leon 1.01 | 22 | 13% | 65 |
| brainfade.melee.Genghis 0.36 | 21 | 12% | 28 |
| jrm.Test0 1.0 | 13 | 8% | 15 |
| jaybot.bots.Oddball 4.0 | 8 | 5% | 9 |
| cs.sheldor.Talon 1.1 | 6 | 4% | 8 |
| jp.Perpy 16.0 | 4 | 2% | 5 |
| stuff.Vlad 0.1 | 3 | 2% | 4 |

## Melee bench: F13

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 64.8 | 16 / 280 | 4.16 | 13.2% | 32677 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.1 | 17.6% | 87 |
| mn.Combat 3.25.0 | 1.9 | 16.8% | 134 |
| hadur117.micro.SaorS1 0.1 | 3.1 | 13.2% | 16 |
| shinh.Entangled 0.3 | 4.3 | 11.8% | 26 |
| gh.micro.Gruweltje 0.7 | 4.6 | 11.6% | 15 |
| apc.Colossus2 0.17 | 6.1 | 8.1% | 1 |
| stelo.Wang 1.0 | 6.9 | 7.1% | 1 |
| ayk.WallHugger 1.0 | 8.0 | 5.8% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.5% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.5 | 63.8 | 1 / 35 | 4051 |
| 2 | 4 | 59.0 | 60.3 | 1 / 35 | 4002 |
| 3 | 3 | 58.5 | 59.7 | 3 / 35 | 3701 |
| 4 | 3 | 61.8 | 67.9 | 2 / 35 | 4449 |
| 5 | 3 | 60.1 | 64.4 | 1 / 35 | 4200 |
| 6 | 3 | 62.3 | 74.3 | 1 / 35 | 3910 |
| 7 | 3 | 61.4 | 68.6 | 3 / 35 | 4266 |
| 8 | 3 | 59.5 | 59.7 | 4 / 35 | 4098 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 36 | 14% |
| mn.Combat 3.25.0 | 26 | 15% |
| shinh.Entangled 0.3 | 9 | 33% |
| gh.micro.Gruweltje 0.7 | 5 | 60% |
| stelo.Wang 1.0 | 2 | 50% |

Hadur died in 265 of 280 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 100 | 38% | 104 |
| mn.Combat 3.25.0 | 77 | 29% | 81 |
| shinh.Entangled 0.3 | 25 | 9% | 27 |
| gh.micro.Gruweltje 0.7 | 16 | 6% | 19 |
| stelo.Wang 1.0 | 14 | 5% | 15 |
| apc.Colossus2 0.17 | 13 | 5% | 13 |
| maribo.FollowFire 1 | 12 | 5% | 12 |
| ayk.WallHugger 1.0 | 7 | 3% | 8 |
| sample.Tracker 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 74.1 | 150 / 280 | 3.33 | 16.8% | 40458 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.3 | 16.8% | 150 |
| simonton.micro.Sprout 1.1.3 | 2.1 | 14.3% | 31 |
| catcat20.shape.Theta 0.018 | 2.8 | 13.0% | 64 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 9.9% | 9 |
| Lo_Ian.Gandalf_V4 4.0 | 5.4 | 10.0% | 5 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 10.0% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.9 | 9.7% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 7.6% | 10 |
| pa.Improved 1.0 | 8.9 | 6.2% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 68.3 | 14 / 35 | 4772 |
| 2 | 1 | 68.7 | 84.1 | 22 / 35 | 5506 |
| 3 | 1 | 64.8 | 74.9 | 17 / 35 | 4477 |
| 4 | 1 | 66.7 | 76.8 | 19 / 35 | 5393 |
| 5 | 1 | 66.3 | 74.9 | 24 / 35 | 5103 |
| 6 | 2 | 64.1 | 68.9 | 17 / 35 | 5034 |
| 7 | 1 | 67.0 | 78.4 | 21 / 35 | 4930 |
| 8 | 1 | 63.8 | 66.7 | 16 / 35 | 5243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 89 | 92% |
| catcat20.shape.Theta 0.018 | 48 | 48% |
| co.edu.usb.rc.LidisTron 1.0 | 20 | 90% |
| sanyi.mikrobi.Roberto 1.0 | 12 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 90% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 130 of 280 rounds, at a mean tick of 608. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 44 | 34% | 127 |
| catcat20.shape.Theta 0.018 | 41 | 32% | 58 |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 8% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 8% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 6% | 17 |
| sanyi.mikrobi.Roberto 1.0 | 7 | 5% | 29 |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 4% | 8 |
| sample.TrackFire 1.0 | 3 | 2% | 5 |
| pa.Improved 1.0 | 1 | 1% | 6 |

## Melee bench: F15

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 82.7 | 158 / 280 | 2.55 | 19.2% | 47938 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 19.2% | 158 |
| kawigi.micro.Shiz 1.1 | 2.9 | 12.8% | 27 |
| emp.Yngwie 1.11 | 2.9 | 12.6% | 55 |
| mld.DustBunny 3.8 | 3.3 | 12.4% | 9 |
| kawigi.robot.Girl 1.2 | 5.3 | 9.5% | 20 |
| cb.nano.Insomnia 1.0 | 5.9 | 9.2% | 6 |
| Grystrion.TrackerWO 1.0 | 7.1 | 7.6% | 1 |
| lambdaxy.TBot 0.1 | 8.3 | 6.5% | 1 |
| divineomega.TrialBot 0.003 | 8.6 | 5.8% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.9 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.6 | 21 / 35 | 6046 |
| 2 | 1 | 67.8 | 79.7 | 17 / 35 | 6217 |
| 3 | 1 | 67.5 | 78.1 | 19 / 35 | 5539 |
| 4 | 1 | 67.1 | 77.5 | 18 / 35 | 5651 |
| 5 | 1 | 68.3 | 81.3 | 19 / 35 | 5758 |
| 6 | 1 | 70.8 | 86.7 | 20 / 35 | 6396 |
| 7 | 1 | 71.0 | 87.6 | 22 / 35 | 6496 |
| 8 | 1 | 68.8 | 83.5 | 22 / 35 | 5835 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 58 | 62% |
| kawigi.micro.Shiz 1.1 | 53 | 96% |
| mld.DustBunny 3.8 | 34 | 91% |
| kawigi.robot.Girl 1.2 | 21 | 71% |
| cb.nano.Insomnia 1.0 | 15 | 80% |
| divineomega.TrialBot 0.003 | 9 | 100% |
| lambdaxy.TBot 0.1 | 3 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 122 of 280 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 44 | 36% | 102 |
| cb.nano.Insomnia 1.0 | 22 | 18% | 20 |
| mld.DustBunny 3.8 | 17 | 14% | 45 |
| kawigi.robot.Girl 1.2 | 12 | 10% | 25 |
| kawigi.micro.Shiz 1.1 | 11 | 9% | 52 |
| lambdaxy.TBot 0.1 | 9 | 7% | 13 |
| Grystrion.TrackerWO 1.0 | 3 | 2% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 3 | 2% | 3 |
| divineomega.TrialBot 0.003 | 1 | 1% | 13 |

## Melee bench: F16

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 81.2 | 80 / 280 | 2.69 | 17.9% | 45401 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.3 | 17.9% | 80 |
| gh.Griezel 0.5.2 | 1.8 | 17.3% | 129 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.2% | 13 |
| techdude.forest.FlamingForest 1.1 | 4.1 | 10.7% | 40 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.0% | 9 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 8.8% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 7.2% | 2 |
| repositorio.NanoStep 1.0 | 8.6 | 5.8% | 1 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.2% | 4 |
| asd.Cthulhu 1.3 | 9.4 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 79.0 | 11 / 35 | 5842 |
| 2 | 1 | 68.2 | 83.8 | 9 / 35 | 5966 |
| 3 | 1 | 68.6 | 84.4 | 11 / 35 | 5839 |
| 4 | 1 | 65.4 | 75.9 | 9 / 35 | 5231 |
| 5 | 2 | 65.6 | 74.9 | 9 / 35 | 5436 |
| 6 | 2 | 68.5 | 84.8 | 7 / 35 | 5882 |
| 7 | 1 | 67.0 | 78.7 | 13 / 35 | 5442 |
| 8 | 1 | 69.2 | 88.3 | 11 / 35 | 5763 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 110 | 17% |
| techdude.forest.FlamingForest 1.1 | 35 | 43% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 24 | 92% |
| divineomega.DivineBot 1.9.4.5 | 8 | 100% |
| tvv.nano.Polaris 1.2 | 7 | 86% |
| stelo.IntrinsicVolatility 1.4 | 6 | 100% |
| bvh.fnr.Fenrir 0.36l | 5 | 80% |

Hadur died in 200 of 280 rounds, at a mean tick of 1438. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 121 | 61% | 140 |
| techdude.forest.FlamingForest 1.1 | 22 | 11% | 38 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 8% | 33 |
| bvh.fnr.Fenrir 0.36l | 13 | 7% | 17 |
| stelo.IntrinsicVolatility 1.4 | 10 | 5% | 18 |
| tvv.nano.Polaris 1.2 | 7 | 4% | 16 |
| divineomega.DivineBot 1.9.4.5 | 5 | 3% | 10 |
| asd.Cthulhu 1.3 | 4 | 2% | 4 |
| repositorio.NanoStep 1.0 | 2 | 1% | 4 |

## Melee bench: F17

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 79.8 | 135 / 280 | 2.81 | 17.6% | 39816 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 17.6% | 135 |
| et.Predator 1.8 | 2.5 | 13.0% | 35 |
| oog.melee.Mercutio 1.0 | 2.9 | 12.7% | 36 |
| cx.BlestPain 1.41 | 4.6 | 11.5% | 49 |
| nic.Nicator 2.4 | 4.9 | 11.1% | 16 |
| ahf.NanoAndrew .4 | 5.1 | 10.7% | 9 |
| maribo.melee.BMV 0.1 | 7.0 | 9.1% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.4 | 5.9% | 0 |
| tex.Longbot 0.4 | 8.6 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 78.7 | 17 / 35 | 4501 |
| 2 | 1 | 65.0 | 72.4 | 14 / 35 | 4730 |
| 3 | 1 | 66.9 | 75.9 | 19 / 35 | 5294 |
| 4 | 1 | 68.6 | 85.4 | 17 / 35 | 5313 |
| 5 | 1 | 67.8 | 83.8 | 19 / 35 | 4890 |
| 6 | 1 | 67.6 | 81.9 | 19 / 35 | 5033 |
| 7 | 1 | 66.2 | 76.5 | 16 / 35 | 5089 |
| 8 | 1 | 67.4 | 84.1 | 14 / 35 | 4966 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 57 | 72% |
| et.Predator 1.8 | 43 | 70% |
| cx.BlestPain 1.41 | 34 | 35% |
| nic.Nicator 2.4 | 32 | 91% |
| ahf.NanoAndrew .4 | 17 | 100% |
| maribo.melee.BMV 0.1 | 5 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 145 of 280 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 34 | 23% | 70 |
| oog.melee.Mercutio 1.0 | 31 | 21% | 71 |
| cx.BlestPain 1.41 | 29 | 20% | 43 |
| nic.Nicator 2.4 | 22 | 15% | 46 |
| ahf.NanoAndrew .4 | 12 | 8% | 26 |
| maribo.melee.BMV 0.1 | 6 | 4% | 11 |
| goblin.Bender 2.4 | 5 | 3% | 5 |
| tex.Longbot 0.4 | 4 | 3% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 1% | 4 |

## Melee bench: F18

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 82.8 | 145 / 280 | 2.55 | 18.0% | 37152 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 18.0% | 145 |
| morbid.MorbidPriest 1.0 | 2.1 | 13.5% | 48 |
| agd.Mooserwirt2 2.7 | 3.5 | 11.6% | 32 |
| uji.DBH 1.1 | 3.9 | 11.0% | 22 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.7% | 7 |
| ratosh.Nobo 0.21 | 5.5 | 9.6% | 1 |
| sigterm.Sigterm 1.0 | 6.8 | 8.1% | 13 |
| kawigi.mini.Fhqwhgads 1.1 | 7.9 | 7.3% | 6 |
| stelo.WangRobot 1.0 | 9.3 | 5.6% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.6 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 88.6 | 19 / 35 | 5078 |
| 2 | 1 | 68.8 | 91.1 | 22 / 35 | 4441 |
| 3 | 1 | 68.4 | 85.1 | 21 / 35 | 5121 |
| 4 | 1 | 67.8 | 86.3 | 19 / 35 | 4860 |
| 5 | 1 | 61.4 | 69.5 | 11 / 35 | 3701 |
| 6 | 1 | 65.6 | 76.8 | 17 / 35 | 4414 |
| 7 | 1 | 66.7 | 81.6 | 18 / 35 | 4652 |
| 8 | 1 | 67.5 | 83.2 | 18 / 35 | 4885 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 57 | 72% |
| uji.DBH 1.1 | 43 | 74% |
| agd.Mooserwirt2 2.7 | 33 | 52% |
| sigterm.Sigterm 1.0 | 20 | 85% |
| spinnercat.Robovirus 2.718 | 17 | 76% |
| ratosh.Nobo 0.21 | 14 | 100% |
| stelo.WangRobot 1.0 | 9 | 78% |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 57% |

Hadur died in 136 of 280 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 41 | 30% | 94 |
| agd.Mooserwirt2 2.7 | 30 | 22% | 61 |
| uji.DBH 1.1 | 18 | 13% | 32 |
| kawigi.mini.Fhqwhgads 1.1 | 14 | 10% | 19 |
| spinnercat.Robovirus 2.718 | 11 | 8% | 26 |
| ratosh.Nobo 0.21 | 8 | 6% | 22 |
| stelo.WangRobot 1.0 | 5 | 4% | 8 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 5 | 4% | 5 |
| sigterm.Sigterm 1.0 | 4 | 3% | 13 |

## Melee bench: F19

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.2 | 224 / 280 | 1.61 | 21.1% | 47338 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 21.1% | 224 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.4 | 13.7% | 19 |
| mld.Infinity 2.2 | 2.6 | 13.4% | 19 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 11.3% | 7 |
| erdnis.Rover 0.3 | 4.5 | 11.0% | 3 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.2% | 4 |
| mbh.Mbh 0.1 | 6.9 | 7.5% | 0 |
| pac.ABC 2.1 | 8.4 | 6.5% | 5 |
| pbg.R2D2 1.0 | 8.5 | 6.0% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 92.7 | 27 / 35 | 5473 |
| 2 | 1 | 71.5 | 93.3 | 27 / 35 | 5598 |
| 3 | 1 | 73.2 | 97.8 | 31 / 35 | 6218 |
| 4 | 1 | 69.0 | 83.2 | 22 / 35 | 5489 |
| 5 | 1 | 72.7 | 95.2 | 29 / 35 | 6234 |
| 6 | 1 | 71.6 | 89.8 | 27 / 35 | 6208 |
| 7 | 1 | 72.4 | 94.3 | 28 / 35 | 6137 |
| 8 | 1 | 73.3 | 99.4 | 33 / 35 | 5981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 101 | 90% |
| mld.Infinity 2.2 | 89 | 93% |
| erdnis.Rover 0.3 | 17 | 88% |
| krillr.mini.JointStrike 2.0.0 | 13 | 92% |
| patson.PatsonTestBot 1.0 | 9 | 100% |
| pac.ABC 2.1 | 9 | 89% |
| mbh.Mbh 0.1 | 4 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 58 of 280 rounds, at a mean tick of 940. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 17 | 29% | 123 |
| mld.Infinity 2.2 | 14 | 24% | 28 |
| krillr.mini.JointStrike 2.0.0 | 9 | 16% | 40 |
| erdnis.Rover 0.3 | 7 | 12% | 30 |
| mbh.Mbh 0.1 | 4 | 7% | 26 |
| pac.ABC 2.1 | 3 | 5% | 11 |
| patson.PatsonTestBot 1.0 | 2 | 3% | 9 |
| pbg.R2D2 1.0 | 1 | 2% | 9 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.7 | 146 / 280 | 2.19 | 19.3% | 45070 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 19.3% | 146 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.5% | 70 |
| fwb.Nine 1.0.1 | 3.3 | 11.7% | 34 |
| nz.jdc.nano.GridFu 1.0 | 4.4 | 10.4% | 2 |
| catcat20.Rabbit 0.001 | 4.6 | 10.1% | 21 |
| m3thos.mini.Eva01 0.5.5 | 6.1 | 8.6% | 3 |
| djdjdj.NanoSkunk10 1.0 | 6.9 | 7.8% | 1 |
| bayen.nut.Squirrel 1.615 | 8.1 | 6.7% | 3 |
| ntc.ControlledChaos 1.1.4 | 8.6 | 6.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 85.1 | 21 / 35 | 5123 |
| 2 | 1 | 69.3 | 89.5 | 14 / 35 | 5603 |
| 3 | 1 | 67.2 | 81.3 | 17 / 35 | 5356 |
| 4 | 1 | 70.1 | 89.5 | 17 / 35 | 6042 |
| 5 | 1 | 70.8 | 91.4 | 21 / 35 | 5989 |
| 6 | 1 | 70.2 | 90.5 | 20 / 35 | 5754 |
| 7 | 1 | 66.7 | 77.8 | 15 / 35 | 5432 |
| 8 | 1 | 69.9 | 88.9 | 21 / 35 | 5771 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 104 | 58% |
| fwb.Nine 1.0.1 | 57 | 60% |
| catcat20.Rabbit 0.001 | 27 | 63% |
| nz.jdc.nano.GridFu 1.0 | 18 | 100% |
| djdjdj.NanoSkunk10 1.0 | 7 | 100% |
| m3thos.mini.Eva01 0.5.5 | 4 | 100% |
| bayen.nut.Squirrel 1.615 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 134 of 280 rounds, at a mean tick of 1212. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 66 | 49% | 114 |
| fwb.Nine 1.0.1 | 31 | 23% | 30 |
| catcat20.Rabbit 0.001 | 20 | 15% | 54 |
| m3thos.mini.Eva01 0.5.5 | 7 | 5% | 9 |
| bayen.nut.Squirrel 1.615 | 4 | 3% | 14 |
| nz.jdc.nano.GridFu 1.0 | 2 | 1% | 38 |
| djdjdj.NanoSkunk10 1.0 | 2 | 1% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 6 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 2 |

## Melee bench: F21

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 86.7 | 140 / 280 | 2.20 | 19.3% | 45220 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 19.3% | 140 |
| eem.EvBot v4.6.16 | 2.0 | 16.6% | 115 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.5% | 7 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 6 |
| eld.Hmm 1.0 | 5.1 | 8.2% | 8 |
| oa.weak.BotherBot 0.1 | 6.1 | 7.5% | 3 |
| el.JumpShoot 0.2 | 7.5 | 6.7% | 1 |
| fire219.CatBot 1.0 | 7.9 | 6.6% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.9 | 23 / 35 | 4862 |
| 2 | 1 | 67.7 | 78.4 | 13 / 35 | 5690 |
| 3 | 1 | 69.7 | 87.6 | 16 / 35 | 6096 |
| 4 | 1 | 68.2 | 82.9 | 14 / 35 | 5523 |
| 5 | 1 | 69.7 | 86.0 | 18 / 35 | 5592 |
| 6 | 1 | 70.1 | 89.5 | 19 / 35 | 5507 |
| 7 | 1 | 71.1 | 94.0 | 18 / 35 | 6007 |
| 8 | 1 | 70.1 | 86.3 | 19 / 35 | 5943 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 143 | 46% |
| dummy.mini.Scimitar 1.01 | 37 | 95% |
| cf.RiO.RiOx 4.2.1 | 31 | 97% |
| eld.Hmm 1.0 | 4 | 75% |
| el.JumpShoot 0.2 | 4 | 100% |
| oa.weak.BotherBot 0.1 | 3 | 67% |

Hadur died in 141 of 280 rounds, at a mean tick of 1228. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 93 | 66% | 135 |
| dummy.mini.Scimitar 1.01 | 16 | 11% | 57 |
| cf.RiO.RiOx 4.2.1 | 8 | 6% | 34 |
| eld.Hmm 1.0 | 6 | 4% | 21 |
| fire219.CatBot 1.0 | 6 | 4% | 7 |
| oa.weak.BotherBot 0.1 | 5 | 4% | 10 |
| PSW.Relentless 0.1 | 5 | 4% | 6 |
| el.JumpShoot 0.2 | 2 | 1% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 5 |

## Melee bench: F23

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 80.6 | 118 / 280 | 2.75 | 18.6% | 48497 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.1 | 18.6% | 118 |
| pe.SandboxLump 1.52 | 1.9 | 17.1% | 99 |
| cre.Karolos 0.32 | 3.0 | 13.8% | 36 |
| stelo.RamTrackSurfer 1.2 | 4.8 | 9.5% | 9 |
| stelo.AreaTargetingBot 1.1 | 5.5 | 9.4% | 8 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 9.2% | 2 |
| cw.megas.Blade 0.8 | 6.0 | 9.1% | 5 |
| sample.Walls 1.0 | 8.0 | 7.7% | 3 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.6% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 75.2 | 15 / 35 | 5700 |
| 2 | 1 | 69.7 | 83.5 | 19 / 35 | 5871 |
| 3 | 1 | 69.6 | 82.9 | 18 / 35 | 6112 |
| 4 | 1 | 68.7 | 79.7 | 14 / 35 | 5969 |
| 5 | 1 | 69.1 | 80.0 | 12 / 35 | 6595 |
| 6 | 1 | 69.8 | 82.5 | 13 / 35 | 6083 |
| 7 | 1 | 70.1 | 85.1 | 17 / 35 | 6264 |
| 8 | 2 | 67.8 | 75.6 | 10 / 35 | 5903 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 117 | 54% |
| cre.Karolos 0.32 | 37 | 62% |
| stelo.AreaTargetingBot 1.1 | 15 | 100% |
| stelo.RamTrackSurfer 1.2 | 11 | 82% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 67% |
| sample.Walls 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |

Hadur died in 162 of 280 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 83 | 51% | 139 |
| cre.Karolos 0.32 | 36 | 22% | 61 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 11 | 7% | 17 |
| stelo.RamTrackSurfer 1.2 | 9 | 6% | 17 |
| cw.megas.Blade 0.8 | 9 | 6% | 16 |
| stelo.AreaTargetingBot 1.1 | 8 | 5% | 19 |
| sample.Walls 1.0 | 5 | 3% | 9 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 2 |

## Melee bench: F24

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 69.3 | 63 / 280 | 3.76 | 14.4% | 32176 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 2.0 | 14.4% | 63 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.2% | 64 |
| florent.XSeries.X2 0.12 | 2.5 | 14.0% | 61 |
| davidalves.Phoenix 0.54 | 3.4 | 13.2% | 60 |
| pedersen.Ugluk 1.1.1 | 4.9 | 11.5% | 22 |
| oog.melee.Corsair 1.0 | 6.0 | 9.2% | 5 |
| lunchie.Lunchbox 0.93 | 7.4 | 6.5% | 1 |
| stelo.SoJNanoMelee 1.1 | 7.9 | 6.7% | 6 |
| as.FrankTheTank 1.3 | 9.1 | 5.2% | 0 |
| evd.X1 0.01 | 9.6 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.2 | 61.3 | 5 / 35 | 3913 |
| 2 | 4 | 59.7 | 63.2 | 8 / 35 | 3700 |
| 3 | 1 | 61.4 | 67.3 | 12 / 35 | 3877 |
| 4 | 2 | 62.0 | 70.2 | 6 / 35 | 4197 |
| 5 | 1 | 63.1 | 74.0 | 6 / 35 | 4194 |
| 6 | 1 | 63.3 | 77.8 | 9 / 35 | 3848 |
| 7 | 2 | 62.2 | 71.1 | 6 / 35 | 4206 |
| 8 | 1 | 62.8 | 69.5 | 11 / 35 | 4241 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 42 | 50% |
| davidalves.Phoenix 0.54 | 34 | 38% |
| florent.XSeries.X2 0.12 | 25 | 28% |
| pedersen.Ugluk 1.1.1 | 14 | 71% |
| stelo.SoJNanoMelee 1.1 | 9 | 89% |
| oog.melee.Corsair 1.0 | 5 | 80% |

Hadur died in 220 of 280 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 64 | 29% | 72 |
| rz.GlowBlowMelee 1.4 | 51 | 23% | 67 |
| davidalves.Phoenix 0.54 | 50 | 23% | 63 |
| oog.melee.Corsair 1.0 | 18 | 8% | 25 |
| pedersen.Ugluk 1.1.1 | 15 | 7% | 28 |
| stelo.SoJNanoMelee 1.1 | 7 | 3% | 11 |
| evd.X1 0.01 | 6 | 3% | 6 |
| lunchie.Lunchbox 0.93 | 4 | 2% | 5 |
| as.FrankTheTank 1.3 | 3 | 1% | 3 |
2 death(s) with no robot to name.

## Melee bench: F25

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 83.0 | 163 / 280 | 2.53 | 18.1% | 34798 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 18.1% | 163 |
| voidious.mini.BrokenSword 2.0.3 | 2.0 | 13.4% | 33 |
| voidious.micro.BlitzBat 1.05 | 3.1 | 12.1% | 16 |
| jdw.Hurricane 1.4 | 4.0 | 11.3% | 28 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.5% | 15 |
| ds.Oo 2.2 | 5.6 | 9.2% | 15 |
| gjr.Cephalosporin 0.1 | 7.8 | 7.4% | 6 |
| awesomeness.Elite 1.0 | 7.9 | 7.1% | 3 |
| adt.Ar2 1.1 | 8.1 | 7.1% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 81.3 | 20 / 35 | 4015 |
| 2 | 1 | 68.3 | 87.0 | 23 / 35 | 4357 |
| 3 | 1 | 68.2 | 87.9 | 20 / 35 | 4444 |
| 4 | 1 | 65.5 | 77.5 | 19 / 35 | 3865 |
| 5 | 1 | 67.3 | 83.2 | 20 / 35 | 4581 |
| 6 | 1 | 67.1 | 81.6 | 20 / 35 | 4304 |
| 7 | 1 | 65.7 | 77.8 | 16 / 35 | 4527 |
| 8 | 1 | 69.3 | 87.9 | 25 / 35 | 4705 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 54 | 72% |
| voidious.micro.BlitzBat 1.05 | 50 | 96% |
| jdw.Hurricane 1.4 | 33 | 76% |
| ds.Oo 2.2 | 16 | 81% |
| gre.svman4.Morfeas 1.4.1 | 13 | 77% |
| gjr.Cephalosporin 0.1 | 12 | 92% |
| adt.Ar2 1.1 | 10 | 90% |
| awesomeness.Elite 1.0 | 8 | 100% |

Hadur died in 117 of 280 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 34 | 29% | 79 |
| jdw.Hurricane 1.4 | 26 | 22% | 49 |
| ds.Oo 2.2 | 15 | 13% | 31 |
| voidious.micro.BlitzBat 1.05 | 13 | 11% | 58 |
| gre.svman4.Morfeas 1.4.1 | 8 | 7% | 16 |
| gjr.Cephalosporin 0.1 | 7 | 6% | 20 |
| adt.Ar2 1.1 | 6 | 5% | 14 |
| awesomeness.Elite 1.0 | 4 | 3% | 8 |
| amk.ChumbaMini 0.2 | 4 | 3% | 5 |

## Melee bench: F26

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.5 | 119 / 280 | 2.49 | 18.0% | 44036 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 18.0% | 119 |
| ak.Fermat 2.0 | 2.0 | 15.5% | 74 |
| lrem.Spectre 0.4.4 | 3.4 | 12.3% | 27 |
| shu.nitro.LENIN .T34 | 3.8 | 12.0% | 43 |
| js.PinBall 1.6 | 5.0 | 10.8% | 13 |
| gh.mini.GrubbmOne 1.0 | 6.3 | 9.1% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.8 | 8.6% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.7% | 1 |
| sample.SpinBot 1.0 | 8.9 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 75.9 | 12 / 35 | 5557 |
| 2 | 1 | 67.5 | 80.3 | 17 / 35 | 5351 |
| 3 | 1 | 68.2 | 85.7 | 14 / 35 | 5456 |
| 4 | 1 | 66.5 | 80.6 | 11 / 35 | 5055 |
| 5 | 1 | 68.0 | 86.0 | 15 / 35 | 5244 |
| 6 | 1 | 68.8 | 87.3 | 14 / 35 | 5641 |
| 7 | 1 | 69.0 | 86.3 | 17 / 35 | 5762 |
| 8 | 1 | 69.3 | 85.4 | 19 / 35 | 5970 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 61 | 34% |
| lrem.Spectre 0.4.4 | 53 | 72% |
| shu.nitro.LENIN .T34 | 41 | 66% |
| js.PinBall 1.6 | 18 | 78% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 100% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 161 of 280 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 73 | 45% | 105 |
| shu.nitro.LENIN .T34 | 34 | 21% | 67 |
| lrem.Spectre 0.4.4 | 26 | 16% | 48 |
| js.PinBall 1.6 | 13 | 8% | 25 |
| sample.SpinBot 1.0 | 5 | 3% | 6 |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 2% | 9 |
| gh.mini.GrubbmOne 1.0 | 3 | 2% | 10 |
| jaybot.adv.bots.JayBot 2.0 | 3 | 2% | 10 |

## Melee bench: F27

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 76.2 | 152 / 280 | 3.15 | 17.2% | 38015 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.6 | 17.2% | 152 |
| mk.Alpha 0.2.1 | 1.8 | 14.0% | 68 |
| EH.Eagle 1.0.6 | 3.6 | 11.1% | 8 |
| wee.Gem 1.8.4 | 4.0 | 11.0% | 31 |
| sheldor.melee.nano.TestMelee 0.1 | 4.3 | 10.9% | 15 |
| techdude.kombat.FlamingKombat 1.5 | 6.5 | 8.9% | 1 |
| throxbot.ThroxBot 0.1 | 7.1 | 8.3% | 3 |
| joe.ADinosaur 1.0 | 8.0 | 7.0% | 3 |
| caimano.Furia_Ceca 0.22 | 8.9 | 6.5% | 1 |
| cs.Grudge 1.0 | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 86.3 | 21 / 35 | 4775 |
| 2 | 5 | 53.5 | 40.6 | 3 / 35 | 3901 |
| 3 | 2 | 60.8 | 55.6 | 11 / 35 | 4594 |
| 4 | 1 | 67.8 | 84.1 | 22 / 35 | 4806 |
| 5 | 1 | 69.8 | 89.8 | 27 / 35 | 5238 |
| 6 | 1 | 68.4 | 85.7 | 25 / 35 | 4964 |
| 7 | 1 | 68.1 | 85.7 | 22 / 35 | 4921 |
| 8 | 1 | 67.4 | 81.3 | 21 / 35 | 4816 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 86 | 78% |
| EH.Eagle 1.0.6 | 28 | 96% |
| wee.Gem 1.8.4 | 20 | 80% |
| sheldor.melee.nano.TestMelee 0.1 | 20 | 90% |
| techdude.kombat.FlamingKombat 1.5 | 11 | 100% |
| throxbot.ThroxBot 0.1 | 9 | 89% |
| joe.ADinosaur 1.0 | 4 | 50% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |

Hadur died in 130 of 280 rounds, at a mean tick of 589. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 38 | 29% | 106 |
| joe.ADinosaur 1.0 | 16 | 12% | 19 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 9% | 29 |
| throxbot.ThroxBot 0.1 | 12 | 9% | 17 |
| cs.Grudge 1.0 | 12 | 9% | 12 |
| wee.Gem 1.8.4 | 11 | 8% | 33 |
| caimano.Furia_Ceca 0.22 | 11 | 8% | 16 |
| EH.Eagle 1.0.6 | 8 | 6% | 29 |
| techdude.kombat.FlamingKombat 1.5 | 8 | 6% | 17 |
2 death(s) with no robot to name.

## Melee bench: F28

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 83.9 | 162 / 280 | 2.45 | 17.8% | 33426 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 17.8% | 162 |
| kid.test.NightFox .2 | 2.0 | 15.1% | 54 |
| uji.Antique 1.0 | 3.1 | 12.1% | 32 |
| pfvicm.Sobieski 7.2.3b | 4.4 | 10.3% | 5 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.7% | 17 |
| amk.ChumbaWumba 0.3 | 6.4 | 8.3% | 3 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.8% | 4 |
| matt.advanced.Katana 1.0 | 8.6 | 6.4% | 3 |
| stelo.PianistNano 1.2 | 8.8 | 6.1% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 81.0 | 21 / 35 | 4253 |
| 2 | 1 | 69.9 | 92.4 | 27 / 35 | 4536 |
| 3 | 1 | 65.1 | 78.1 | 18 / 35 | 3852 |
| 4 | 1 | 66.9 | 82.9 | 17 / 35 | 4524 |
| 5 | 1 | 68.7 | 90.2 | 22 / 35 | 4480 |
| 6 | 1 | 66.6 | 84.4 | 22 / 35 | 3663 |
| 7 | 1 | 65.7 | 80.0 | 19 / 35 | 4059 |
| 8 | 1 | 66.1 | 82.5 | 16 / 35 | 4059 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 102 | 77% |
| uji.Antique 1.0 | 58 | 81% |
| qohnil.blot.BlotBot 3.61 | 17 | 59% |
| pfvicm.Sobieski 7.2.3b | 9 | 100% |
| ahr.ice.Ice 1.0.2 | 8 | 88% |
| stelo.PianistNano 1.2 | 5 | 100% |
| amk.ChumbaWumba 0.3 | 4 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 118 of 280 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 35 | 30% | 93 |
| pfvicm.Sobieski 7.2.3b | 21 | 18% | 28 |
| uji.Antique 1.0 | 20 | 17% | 71 |
| qohnil.blot.BlotBot 3.61 | 13 | 11% | 28 |
| amk.ChumbaWumba 0.3 | 12 | 10% | 16 |
| stelo.Lifestealer 1.0 | 6 | 5% | 9 |
| ahr.ice.Ice 1.0.2 | 5 | 4% | 18 |
| stelo.PianistNano 1.2 | 4 | 3% | 5 |
| matt.advanced.Katana 1.0 | 2 | 2% | 7 |

## Melee bench: F29

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 80.8 | 103 / 280 | 2.73 | 17.4% | 36893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 17.4% | 103 |
| deewiant.Anomaly 0.2 | 2.5 | 14.7% | 66 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.2% | 83 |
| myl.micro.Troodon 1.10 | 4.4 | 12.1% | 11 |
| jok.PheonixM 0.1.2 | 4.6 | 10.4% | 8 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.2% | 0 |
| DBall.Anarchy 0.1 | 7.4 | 6.3% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 8.3 | 5.7% | 0 |
| ap.Frederick 1.1 | 8.4 | 5.6% | 3 |
| jangs.ns51 1.0 | 10.0 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 83.5 | 19 / 35 | 4834 |
| 2 | 1 | 65.9 | 79.7 | 13 / 35 | 4104 |
| 3 | 1 | 65.7 | 77.1 | 10 / 35 | 4473 |
| 4 | 1 | 67.9 | 83.2 | 15 / 35 | 4650 |
| 5 | 1 | 65.6 | 78.1 | 8 / 35 | 4502 |
| 6 | 1 | 68.4 | 86.3 | 14 / 35 | 5039 |
| 7 | 1 | 66.8 | 81.0 | 11 / 35 | 4453 |
| 8 | 1 | 66.3 | 77.8 | 13 / 35 | 4838 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 72 | 39% |
| zyx.mega.YersiniaPestis 3.1 | 58 | 36% |
| myl.micro.Troodon 1.10 | 26 | 92% |
| jok.PheonixM 0.1.2 | 14 | 93% |
| DBall.Anarchy 0.1 | 10 | 100% |
| ap.Frederick 1.1 | 5 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 0% |

Hadur died in 177 of 280 rounds, at a mean tick of 1008. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 78 | 44% | 108 |
| zyx.mega.YersiniaPestis 3.1 | 68 | 38% | 90 |
| jok.PheonixM 0.1.2 | 11 | 6% | 22 |
| myl.micro.Troodon 1.10 | 10 | 6% | 32 |
| ph.melee.ArcherME 0.3 | 6 | 3% | 8 |
| jangs.ns51 1.0 | 2 | 1% | 4 |
| DBall.Anarchy 0.1 | 1 | 1% | 13 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 3 |

## Melee bench: F30

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 56.5 | 30 / 280 | 4.91 | 12.1% | 31924 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.6 | 14.3% | 84 |
| darkcanuck.B26354 1.06 | 2.8 | 13.5% | 73 |
| stelo.PastFuture 2.3.2 | 2.8 | 12.7% | 29 |
| hadur117.micro.SaorS1 0.1 | 3.9 | 12.1% | 30 |
| oog.melee.Capulet 1.2 | 4.0 | 12.0% | 38 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.6% | 16 |
| ntc.Opposite 1.5 | 7.6 | 8.1% | 1 |
| tripphippy.Alice 1.1 | 8.1 | 7.5% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 8.3 | 7.0% | 7 |
| GarmBox.Anger 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.7 | 59.0 | 1 / 35 | 4053 |
| 2 | 5 | 56.3 | 55.2 | 3 / 35 | 3903 |
| 3 | 2 | 59.8 | 61.3 | 8 / 35 | 4198 |
| 4 | 4 | 58.4 | 60.0 | 3 / 35 | 4367 |
| 5 | 3 | 58.6 | 63.5 | 3 / 35 | 3694 |
| 6 | 5 | 52.5 | 44.8 | 5 / 35 | 3707 |
| 7 | 5 | 53.8 | 48.3 | 5 / 35 | 3819 |
| 8 | 3 | 58.0 | 60.0 | 2 / 35 | 4183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 21 | 24% |
| oog.melee.Capulet 1.2 | 19 | 47% |
| darkcanuck.B26354 1.06 | 16 | 13% |
| stelo.PastFuture 2.3.2 | 16 | 56% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 67% |
| ntc.Opposite 1.5 | 1 | 100% |
| intruder.PrairieWolf 2.61 | 1 | 100% |
| tripphippy.Alice 1.1 | 1 | 100% |

Hadur died in 250 of 280 rounds, at a mean tick of 620. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 62 | 25% | 69 |
| oog.melee.Capulet 1.2 | 50 | 20% | 60 |
| darkcanuck.B26354 1.06 | 47 | 19% | 49 |
| stelo.PastFuture 2.3.2 | 32 | 13% | 41 |
| fowl3628800.LightningBolt 2.6.0 | 18 | 7% | 19 |
| ntc.Opposite 1.5 | 15 | 6% | 15 |
| intruder.PrairieWolf 2.61 | 13 | 5% | 13 |
| tripphippy.Alice 1.1 | 9 | 4% | 9 |
| GarmBox.Anger 1.0 | 4 | 2% | 5 |

## Melee bench: F31

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 67.6 | 37 / 280 | 3.92 | 13.6% | 29349 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 19.2% | 175 |
| hadur117.micro.SaorS1 0.1 | 2.3 | 13.6% | 37 |
| gh.mini.Griezel 0.2 | 3.4 | 12.4% | 46 |
| d414.nano.Quantum 1.0.0 | 4.1 | 11.3% | 7 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.0% | 10 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.1% | 3 |
| timmit.nano.TimDog 0.33 | 7.1 | 6.9% | 1 |
| fm.mammillarias 1.3 | 8.0 | 6.1% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.1 | 5.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 72.4 | 8 / 35 | 3876 |
| 2 | 3 | 60.9 | 68.3 | 4 / 35 | 3750 |
| 3 | 2 | 60.2 | 67.3 | 5 / 35 | 3600 |
| 4 | 2 | 62.5 | 72.4 | 7 / 35 | 3923 |
| 5 | 2 | 60.9 | 71.7 | 1 / 35 | 3587 |
| 6 | 2 | 57.5 | 60.0 | 6 / 35 | 3474 |
| 7 | 2 | 60.6 | 66.3 | 5 / 35 | 3760 |
| 8 | 3 | 58.3 | 62.2 | 1 / 35 | 3379 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 63 | 13% |
| gh.mini.Griezel 0.2 | 24 | 13% |
| d414.nano.Quantum 1.0.0 | 13 | 85% |
| spinnercat.micro.Tyger 0.1 | 10 | 80% |
| gh.nano.Grofvuil 0.2 | 4 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 243 of 280 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 132 | 54% | 142 |
| gh.mini.Griezel 0.2 | 42 | 17% | 48 |
| spinnercat.micro.Tyger 0.1 | 19 | 8% | 23 |
| d414.nano.Quantum 1.0.0 | 14 | 6% | 21 |
| gh.nano.Grofvuil 0.2 | 11 | 5% | 16 |
| Gecko.ultimateGeckoBot 1.0 | 11 | 5% | 11 |
| timmit.nano.TimDog 0.33 | 10 | 4% | 14 |
| fm.mammillarias 1.3 | 3 | 1% | 4 |
| tlp.ThreeLeggedPig 1 | 1 | 0% | 1 |

## Melee bench: F32

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 81.2 | 117 / 280 | 2.69 | 17.1% | 37801 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.1 | 17.1% | 117 |
| kawigi.sbf.FloodHT 0.9.2 | 1.9 | 15.6% | 98 |
| apc.botM 3.0 | 3.1 | 12.0% | 33 |
| lxx.ConceptA 0.8 | 4.6 | 10.2% | 6 |
| vjik.UnViolation 1.1 | 4.8 | 10.6% | 10 |
| bayen.UbaMicro 1.4 | 5.8 | 8.7% | 5 |
| panzer.Panzer 0.2 | 7.0 | 7.3% | 3 |
| yk.JahMicro 1.0 | 8.6 | 6.5% | 5 |
| conscience.Electron 1.3g | 8.8 | 6.3% | 0 |
| donjezza.Jezza 1.0 | 9.4 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 87.3 | 16 / 35 | 5277 |
| 2 | 1 | 66.6 | 83.2 | 16 / 35 | 4811 |
| 3 | 1 | 65.7 | 81.0 | 12 / 35 | 4951 |
| 4 | 2 | 63.4 | 72.1 | 13 / 35 | 4382 |
| 5 | 1 | 64.6 | 76.2 | 14 / 35 | 4537 |
| 6 | 1 | 65.0 | 80.3 | 14 / 35 | 4470 |
| 7 | 1 | 67.3 | 86.3 | 16 / 35 | 4707 |
| 8 | 1 | 66.2 | 83.2 | 16 / 35 | 4666 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 96 | 33% |
| apc.botM 3.0 | 35 | 66% |
| lxx.ConceptA 0.8 | 24 | 88% |
| vjik.UnViolation 1.1 | 21 | 81% |
| bayen.UbaMicro 1.4 | 11 | 91% |
| donjezza.Jezza 1.0 | 11 | 100% |
| yk.JahMicro 1.0 | 2 | 50% |
| conscience.Electron 1.3g | 1 | 100% |
| panzer.Panzer 0.2 | 1 | 100% |

Hadur died in 163 of 280 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 76 | 47% | 113 |
| lxx.ConceptA 0.8 | 23 | 14% | 36 |
| apc.botM 3.0 | 18 | 11% | 39 |
| vjik.UnViolation 1.1 | 13 | 8% | 36 |
| conscience.Electron 1.3g | 12 | 7% | 17 |
| panzer.Panzer 0.2 | 9 | 6% | 7 |
| bayen.UbaMicro 1.4 | 8 | 5% | 18 |
| yk.JahMicro 1.0 | 3 | 2% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 7 |

## Melee bench: F33

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 82.5 | 142 / 280 | 2.57 | 18.6% | 42293 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.1 | 18.6% | 142 |
| maribo.Quester 0.3 | 1.9 | 16.0% | 68 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 11.8% | 16 |
| gre.svman4.Leonidas 1.3.2 | 4.1 | 10.9% | 22 |
| labg.Cataclysm 2.05 | 4.5 | 10.8% | 27 |
| baal.nano.N 1.42 | 6.3 | 8.8% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.4 | 8.1% | 4 |
| zyx.micro.Ant 1.1 | 8.4 | 5.8% | 1 |
| sanja.First 0.1 | 8.8 | 5.1% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.9 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 78.7 | 22 / 35 | 5351 |
| 2 | 1 | 68.9 | 85.4 | 16 / 35 | 5190 |
| 3 | 1 | 67.1 | 80.6 | 13 / 35 | 5013 |
| 4 | 1 | 69.2 | 84.8 | 21 / 35 | 5348 |
| 5 | 1 | 68.8 | 82.2 | 20 / 35 | 5596 |
| 6 | 1 | 70.5 | 90.5 | 21 / 35 | 5665 |
| 7 | 2 | 66.8 | 77.1 | 11 / 35 | 5122 |
| 8 | 1 | 67.9 | 81.0 | 18 / 35 | 5008 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 68 | 68% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 50 | 90% |
| gre.svman4.Leonidas 1.3.2 | 35 | 80% |
| labg.Cataclysm 2.05 | 24 | 46% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 100% |
| baal.nano.N 1.42 | 3 | 100% |
| sanja.First 0.1 | 3 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 140 of 280 rounds, at a mean tick of 905. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 64 | 46% | 115 |
| labg.Cataclysm 2.05 | 23 | 16% | 33 |
| gre.svman4.Leonidas 1.3.2 | 15 | 11% | 31 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 11 | 8% | 14 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 7% | 56 |
| baal.nano.N 1.42 | 6 | 4% | 9 |
| zyx.micro.Ant 1.1 | 6 | 4% | 8 |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 4% | 10 |
| sanja.First 0.1 | 0 | 0% | 3 |

## Melee bench: F34

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 73.3 | 44 / 280 | 3.41 | 15.4% | 37851 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.6 | 16.8% | 86 |
| stelo.Spread 0.9 | 1.9 | 16.4% | 110 |
| hadur117.micro.SaorS1 0.1 | 2.5 | 15.4% | 44 |
| jcs.Seth 1.8 | 4.5 | 11.1% | 21 |
| tcf.Reach 3 | 4.6 | 11.1% | 12 |
| cli.Dancer 1.1 | 5.9 | 9.7% | 3 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 4 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.8% | 1 |
| sample.RamFire 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.9 | 69.2 | 2 / 35 | 4815 |
| 2 | 3 | 64.9 | 72.7 | 5 / 35 | 5068 |
| 3 | 3 | 63.5 | 72.7 | 4 / 35 | 4170 |
| 4 | 1 | 66.5 | 81.6 | 10 / 35 | 4762 |
| 5 | 2 | 66.0 | 79.0 | 8 / 35 | 4736 |
| 6 | 3 | 62.6 | 68.6 | 4 / 35 | 4626 |
| 7 | 2 | 64.5 | 72.1 | 5 / 35 | 5037 |
| 8 | 3 | 63.9 | 70.2 | 6 / 35 | 4637 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 53 | 32% |
| stelo.Spread 0.9 | 52 | 17% |
| jcs.Seth 1.8 | 14 | 43% |
| tcf.Reach 3 | 11 | 64% |
| ratosh.Wesco 1.4 | 4 | 75% |
| sample.VelociRobot 1.0 | 1 | 100% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 236 of 280 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 89 | 38% | 104 |
| kid.Gladiator .7.2 | 79 | 33% | 83 |
| jcs.Seth 1.8 | 23 | 10% | 33 |
| tcf.Reach 3 | 18 | 8% | 28 |
| cli.Dancer 1.1 | 9 | 4% | 10 |
| ratosh.Wesco 1.4 | 7 | 3% | 10 |
| sample.RamFire 1.0 | 5 | 2% | 5 |
| sample.VelociRobot 1.0 | 3 | 1% | 4 |
| amk.Punbot.Punbot 0.01 | 3 | 1% | 3 |

## Melee bench: F35

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 70.2 | 14 / 280 | 3.68 | 13.4% | 26773 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.8% | 215 |
| hadur117.micro.SaorS1 0.1 | 2.1 | 13.4% | 14 |
| gh.mini.Gruwel 0.9 | 2.9 | 13.0% | 29 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.8% | 17 |
| rz.HawkOnFire 0.1 | 4.8 | 11.5% | 2 |
| wit.Chuliath 1.0 | 6.9 | 6.6% | 1 |
| myl.nano.KomoriNinja 1.1 | 6.9 | 7.2% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.4 | 6.1% | 1 |
| dans.Cinnamon 1.2 | 9.3 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.6 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.6 | 68.9 | 0 / 35 | 3766 |
| 2 | 3 | 60.8 | 73.0 | 1 / 35 | 2940 |
| 3 | 2 | 60.5 | 69.8 | 1 / 35 | 3443 |
| 4 | 2 | 61.5 | 71.1 | 3 / 35 | 3513 |
| 5 | 2 | 60.0 | 69.2 | 2 / 35 | 3280 |
| 6 | 2 | 60.6 | 71.4 | 3 / 35 | 3151 |
| 7 | 2 | 60.5 | 67.9 | 2 / 35 | 3478 |
| 8 | 2 | 60.2 | 70.2 | 2 / 35 | 3202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 55 | 11% |
| gh.mini.Gruwel 0.9 | 16 | 6% |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 57% |
| rz.HawkOnFire 0.1 | 3 | 67% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 266 of 280 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 154 | 58% | 161 |
| gh.mini.Gruwel 0.9 | 49 | 18% | 50 |
| dmh.robocode.robot.BlackDeath 9.2 | 25 | 9% | 29 |
| rz.HawkOnFire 0.1 | 20 | 8% | 21 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6 | 2% | 6 |
| wit.Chuliath 1.0 | 5 | 2% | 5 |
| myl.nano.KomoriNinja 1.1 | 4 | 2% | 5 |
| stelo.MyAgileRobot 0.2 | 3 | 1% | 3 |

## Melee bench: F36

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 88.1 | 201 / 280 | 2.08 | 20.2% | 44250 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 20.2% | 201 |
| alpha.RainingFire 1.0 | 2.9 | 12.0% | 26 |
| mz.Cork 0.1 | 3.4 | 11.4% | 17 |
| bzdp.Pansy 2.1 | 3.8 | 11.4% | 11 |
| bvh.micro.Freya 0.3 | 5.0 | 10.2% | 8 |
| bvh.mini.Fenrir 0.39 | 5.3 | 9.8% | 5 |
| m3thos.Eva02 0.7.1 | 6.8 | 9.0% | 8 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 6.2% | 0 |
| dl.BetterWalls 1.0 | 9.3 | 5.0% | 2 |
| sample.MyFirstRobot 1.0 | 9.5 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 94.0 | 27 / 35 | 5732 |
| 2 | 1 | 69.4 | 84.4 | 22 / 35 | 5704 |
| 3 | 1 | 70.4 | 90.5 | 27 / 35 | 5149 |
| 4 | 1 | 69.8 | 85.4 | 23 / 35 | 5661 |
| 5 | 1 | 71.6 | 93.0 | 30 / 35 | 5764 |
| 6 | 1 | 70.4 | 86.7 | 27 / 35 | 5664 |
| 7 | 1 | 69.3 | 86.0 | 23 / 35 | 5254 |
| 8 | 1 | 69.0 | 84.4 | 22 / 35 | 5322 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 56 | 95% |
| bvh.micro.Freya 0.3 | 42 | 90% |
| alpha.RainingFire 1.0 | 39 | 77% |
| mz.Cork 0.1 | 39 | 85% |
| bvh.mini.Fenrir 0.39 | 19 | 95% |
| m3thos.Eva02 0.7.1 | 16 | 94% |
| sample.MyFirstRobot 1.0 | 14 | 100% |
| dl.BetterWalls 1.0 | 1 | 0% |

Hadur died in 79 of 280 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 21 | 27% | 44 |
| bzdp.Pansy 2.1 | 12 | 15% | 58 |
| mz.Cork 0.1 | 11 | 14% | 53 |
| bvh.micro.Freya 0.3 | 9 | 11% | 34 |
| bvh.mini.Fenrir 0.39 | 9 | 11% | 26 |
| dl.BetterWalls 1.0 | 9 | 11% | 17 |
| m3thos.Eva02 0.7.1 | 5 | 6% | 26 |
| squidM.TentalceMeleeNano 1.1 | 3 | 4% | 5 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 13 |

## Melee bench: F37

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 80.8 | 182 / 280 | 2.73 | 18.1% | 43125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 18.1% | 182 |
| germ.TheMind .2 | 2.8 | 11.2% | 20 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.1 | 10.9% | 23 |
| EBBU.Sim2 1.02 | 4.3 | 9.9% | 8 |
| stelo.UntouchableNano 1.3 | 5.5 | 9.2% | 14 |
| agrach.Dalek 1.0 | 5.9 | 9.2% | 14 |
| mb.Beast 0.1 | 7.3 | 8.3% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 8.0% | 3 |
| lmk.ACPFinal 0.1 | 8.3 | 7.7% | 5 |
| skm.Ryubot 1.0 | 9.0 | 7.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 79.0 | 18 / 35 | 5542 |
| 2 | 1 | 66.1 | 77.5 | 23 / 35 | 5309 |
| 3 | 1 | 66.9 | 78.1 | 24 / 35 | 5777 |
| 4 | 1 | 68.8 | 87.0 | 26 / 35 | 5520 |
| 5 | 1 | 66.7 | 80.6 | 22 / 35 | 5520 |
| 6 | 1 | 66.0 | 77.1 | 24 / 35 | 5315 |
| 7 | 1 | 66.1 | 80.3 | 19 / 35 | 5324 |
| 8 | 1 | 67.6 | 86.3 | 26 / 35 | 4818 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 52 | 96% |
| stelo.UntouchableNano 1.3 | 28 | 93% |
| EBBU.Sim2 1.02 | 27 | 96% |
| com.syncleus.robocode.Dreadnaught 0.1 | 26 | 73% |
| mb.Beast 0.1 | 18 | 94% |
| skm.Ryubot 1.0 | 17 | 100% |
| agrach.Dalek 1.0 | 17 | 94% |
| lmk.ACPFinal 0.1 | 11 | 100% |

Hadur died in 99 of 280 rounds, at a mean tick of 340. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 25 | 25% | 28 |
| com.syncleus.robocode.Dreadnaught 0.1 | 19 | 19% | 41 |
| agrach.Dalek 1.0 | 15 | 15% | 45 |
| germ.TheMind .2 | 10 | 10% | 50 |
| lmk.ACPFinal 0.1 | 9 | 9% | 19 |
| EBBU.Sim2 1.02 | 8 | 8% | 33 |
| mb.Beast 0.1 | 5 | 5% | 26 |
| stelo.UntouchableNano 1.3 | 5 | 5% | 20 |
| skm.Ryubot 1.0 | 3 | 3% | 8 |

## Melee bench: F38

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 76.1 | 77 / 280 | 3.15 | 15.8% | 35360 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.4 | 16.8% | 132 |
| hadur117.micro.SaorS1 0.1 | 1.6 | 15.8% | 77 |
| bvh.mini.Freya 0.55 | 3.3 | 12.2% | 16 |
| bts.mega.Gnarly 1.4 | 4.4 | 10.9% | 25 |
| cs.Wren 1.0 | 5.0 | 10.5% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.1 | 9.3% | 9 |
| kdf.KoulDestroyer 1.0 | 6.3 | 9.2% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.5 | 6.2% | 1 |
| matt.UnderDark3 2.4.34 | 9.1 | 4.7% | 2 |
| bzdp.BoxCar 2.0 | 9.4 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 70.8 | 7 / 35 | 3921 |
| 2 | 1 | 67.1 | 82.9 | 13 / 35 | 5112 |
| 3 | 1 | 65.5 | 81.0 | 11 / 35 | 4382 |
| 4 | 1 | 63.5 | 73.3 | 11 / 35 | 4446 |
| 5 | 2 | 61.3 | 65.4 | 7 / 35 | 4331 |
| 6 | 2 | 65.4 | 81.6 | 8 / 35 | 4567 |
| 7 | 2 | 65.1 | 80.6 | 13 / 35 | 4311 |
| 8 | 2 | 63.3 | 73.3 | 7 / 35 | 4290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 80 | 18% |
| davidalves.net.DuelistNanoMelee 1.01 | 22 | 95% |
| bts.mega.Gnarly 1.4 | 22 | 59% |
| bvh.mini.Freya 0.55 | 14 | 86% |
| cs.Wren 1.0 | 12 | 100% |
| kdf.KoulDestroyer 1.0 | 5 | 100% |

Hadur died in 203 of 280 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 113 | 56% | 128 |
| bts.mega.Gnarly 1.4 | 29 | 14% | 46 |
| bvh.mini.Freya 0.55 | 23 | 11% | 33 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 7% | 33 |
| kdf.KoulDestroyer 1.0 | 9 | 4% | 13 |
| cs.Wren 1.0 | 8 | 4% | 14 |
| matt.UnderDark3 2.4.34 | 4 | 2% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 1% | 5 |
| bzdp.BoxCar 2.0 | 1 | 0% | 2 |

## Melee bench: F39

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 76.5 | 79 / 280 | 3.11 | 16.5% | 41159 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.3 | 16.5% | 79 |
| bvh.fry.Freya 0.82 | 1.8 | 15.0% | 46 |
| az.Ololobot 0.2.4 | 3.0 | 13.2% | 95 |
| catcat20.Lambda 0.024 | 4.0 | 10.8% | 39 |
| winamp32.micro.MicroMacro 1.0 | 5.4 | 9.1% | 6 |
| gimp.GimpBot 0.1 | 6.3 | 8.4% | 2 |
| apollokidd.ApolloKidd 0.9 | 7.3 | 7.8% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 7.4 | 7.5% | 13 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.9 | 6.1% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 78.1 | 12 / 35 | 5396 |
| 2 | 1 | 65.2 | 75.6 | 12 / 35 | 5168 |
| 3 | 1 | 65.0 | 78.1 | 10 / 35 | 4935 |
| 4 | 1 | 65.4 | 78.7 | 9 / 35 | 5274 |
| 5 | 1 | 63.6 | 73.7 | 8 / 35 | 4900 |
| 6 | 2 | 63.6 | 69.8 | 9 / 35 | 5389 |
| 7 | 1 | 65.1 | 78.7 | 7 / 35 | 5266 |
| 8 | 2 | 65.7 | 79.7 | 12 / 35 | 4831 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 53 | 13% |
| bvh.fry.Freya 0.82 | 48 | 71% |
| catcat20.Lambda 0.024 | 26 | 46% |
| stelo.SoRobotNanoMelee 1.2 | 17 | 94% |
| gimp.GimpBot 0.1 | 6 | 83% |
| apollokidd.ApolloKidd 0.9 | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 33% |

Hadur died in 202 of 280 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 65 | 32% | 79 |
| bvh.fry.Freya 0.82 | 44 | 22% | 69 |
| catcat20.Lambda 0.024 | 40 | 20% | 50 |
| stelo.SoRobotNanoMelee 1.2 | 21 | 10% | 26 |
| whitesquare.robots.SkynetAdvanced 1.1 | 11 | 5% | 13 |
| apollokidd.ApolloKidd 0.9 | 8 | 4% | 13 |
| winamp32.micro.MicroMacro 1.0 | 7 | 3% | 13 |
| gimp.GimpBot 0.1 | 5 | 2% | 14 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 0% | 3 |

## Melee bench: F40

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 82.7 | 151 / 280 | 2.56 | 18.5% | 40050 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 18.5% | 151 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.0% | 70 |
| kano.gamma.KanoGamma 1.8 | 3.1 | 11.9% | 20 |
| mz.AntiGrav 1.0 | 4.4 | 10.9% | 7 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.8% | 18 |
| stelo.Randomness 1.0 | 6.4 | 8.7% | 9 |
| alpha.BlackIce 1.0 | 6.9 | 8.2% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.1 | 6.4% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.6 | 5.9% | 3 |
| sample.Corners 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 84.4 | 20 / 35 | 4987 |
| 2 | 1 | 68.1 | 83.8 | 18 / 35 | 4978 |
| 3 | 1 | 70.1 | 90.8 | 24 / 35 | 4991 |
| 4 | 1 | 69.6 | 84.1 | 21 / 35 | 5600 |
| 5 | 1 | 68.0 | 81.6 | 19 / 35 | 4857 |
| 6 | 1 | 67.4 | 80.0 | 19 / 35 | 4972 |
| 7 | 1 | 67.1 | 81.6 | 16 / 35 | 4867 |
| 8 | 1 | 65.4 | 75.2 | 14 / 35 | 4798 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 81 | 54% |
| kano.gamma.KanoGamma 1.8 | 40 | 83% |
| mz.AntiGrav 1.0 | 34 | 100% |
| Polkwane.SmashMelee 1.0 | 32 | 84% |
| stelo.Randomness 1.0 | 11 | 73% |
| alpha.BlackIce 1.0 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 129 of 280 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 53 | 41% | 86 |
| Polkwane.SmashMelee 1.0 | 17 | 13% | 33 |
| stelo.Randomness 1.0 | 16 | 12% | 35 |
| kano.gamma.KanoGamma 1.8 | 15 | 12% | 55 |
| alpha.BlackIce 1.0 | 11 | 9% | 14 |
| amk.superstrike.SuperStrike 0.3 | 8 | 6% | 9 |
| mz.AntiGrav 1.0 | 5 | 4% | 31 |
| testantiswapgun.AntiSwap 1.0 | 2 | 2% | 8 |
| sample.Corners 1.0 | 2 | 2% | 8 |

## Melee bench: F41

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 69.5 | 82 / 280 | 3.75 | 15.2% | 36935 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.1 | 16.3% | 121 |
| hadur117.micro.SaorS1 0.1 | 2.1 | 15.2% | 82 |
| ary.Swarm 1.1 | 3.1 | 13.0% | 22 |
| lessonz.robocode.Oz 0.5.0 | 3.6 | 12.6% | 34 |
| shrub.Silver v048 | 5.5 | 10.0% | 5 |
| simonton.nano.MeleeSeed 1.8 | 5.6 | 9.7% | 9 |
| zyx.nano.Ant 1.1 | 6.9 | 7.8% | 0 |
| jsal.Jsalbot 1.0 | 8.4 | 6.3% | 5 |
| stelo.Mirror 1.1 | 8.6 | 6.2% | 2 |
| acogdev.alpha 0.2 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.3 | 60.3 | 8 / 35 | 4478 |
| 2 | 2 | 64.3 | 69.2 | 12 / 35 | 4871 |
| 3 | 2 | 63.5 | 69.2 | 9 / 35 | 4621 |
| 4 | 2 | 62.9 | 68.3 | 10 / 35 | 4656 |
| 5 | 2 | 63.5 | 70.5 | 10 / 35 | 4565 |
| 6 | 2 | 65.4 | 74.6 | 15 / 35 | 4690 |
| 7 | 1 | 64.8 | 74.6 | 14 / 35 | 4661 |
| 8 | 2 | 62.4 | 69.2 | 4 / 35 | 4393 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 62 | 27% |
| lessonz.robocode.Oz 0.5.0 | 32 | 78% |
| ary.Swarm 1.1 | 20 | 90% |
| simonton.nano.MeleeSeed 1.8 | 15 | 100% |
| jsal.Jsalbot 1.0 | 5 | 80% |
| shrub.Silver v048 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 201 of 280 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 96 | 48% | 116 |
| simonton.nano.MeleeSeed 1.8 | 26 | 13% | 38 |
| ary.Swarm 1.1 | 25 | 12% | 50 |
| lessonz.robocode.Oz 0.5.0 | 25 | 12% | 38 |
| zyx.nano.Ant 1.1 | 13 | 6% | 14 |
| stelo.Mirror 1.1 | 7 | 3% | 8 |
| shrub.Silver v048 | 5 | 2% | 7 |
| jsal.Jsalbot 1.0 | 3 | 1% | 6 |
| acogdev.alpha 0.2 | 1 | 0% | 3 |

## Melee bench: F42

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 78.7 | 85 / 280 | 2.91 | 16.8% | 41161 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 16.9% | 128 |
| hadur117.micro.SaorS1 0.1 | 1.8 | 16.8% | 85 |
| maribo.mini.MiniQuester 0.1 | 3.4 | 13.3% | 26 |
| ara.Shera 0.88 | 3.6 | 12.4% | 31 |
| amz.NanoClone 1.41 | 5.1 | 9.2% | 1 |
| maribo.IotaCT 1.1 | 6.3 | 8.0% | 0 |
| dsw.StaticD 1.0 | 6.9 | 7.1% | 7 |
| stelo.MirrorMicro 1.0 | 7.9 | 6.3% | 2 |
| mme.NikeEnhanced 2.0 | 8.9 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 76.8 | 11 / 35 | 5199 |
| 2 | 2 | 63.4 | 73.0 | 7 / 35 | 4736 |
| 3 | 2 | 67.2 | 82.5 | 10 / 35 | 5268 |
| 4 | 1 | 65.8 | 76.5 | 11 / 35 | 5387 |
| 5 | 1 | 66.8 | 82.9 | 14 / 35 | 5406 |
| 6 | 2 | 66.5 | 81.0 | 13 / 35 | 4950 |
| 7 | 2 | 65.4 | 78.7 | 9 / 35 | 5040 |
| 8 | 2 | 66.0 | 78.4 | 10 / 35 | 5175 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 73 | 30% |
| ara.Shera 0.88 | 39 | 72% |
| maribo.mini.MiniQuester 0.1 | 37 | 86% |
| dsw.StaticD 1.0 | 4 | 50% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 195 of 280 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 103 | 53% | 129 |
| ara.Shera 0.88 | 38 | 19% | 61 |
| maribo.mini.MiniQuester 0.1 | 28 | 14% | 61 |
| dsw.StaticD 1.0 | 12 | 6% | 15 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 6 | 3% | 6 |
| amz.NanoClone 1.41 | 5 | 3% | 5 |
| stelo.MirrorMicro 1.0 | 3 | 2% | 2 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 70.7 | 29 / 280 | 3.64 | 13.9% | 29961 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.7% | 203 |
| hadur117.micro.SaorS1 0.1 | 2.3 | 13.9% | 29 |
| brainfade.melee.Dusk 0.44 | 3.4 | 12.4% | 30 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.6% | 11 |
| wcsv.melee.EngineerMelee 0.1 | 4.3 | 11.4% | 9 |
| Krabb.akim2.Akim2 1.1b | 5.9 | 9.8% | 1 |
| mz.NanoGod 2.02 | 7.3 | 7.9% | 0 |
| jab.DiamondStealer 5 | 7.8 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 73.0 | 1 / 35 | 4044 |
| 2 | 2 | 64.6 | 75.6 | 5 / 35 | 3772 |
| 3 | 2 | 62.8 | 68.3 | 5 / 35 | 4139 |
| 4 | 2 | 63.1 | 70.2 | 5 / 35 | 3907 |
| 5 | 3 | 60.1 | 66.0 | 3 / 35 | 3086 |
| 6 | 2 | 63.3 | 74.6 | 4 / 35 | 3767 |
| 7 | 3 | 61.0 | 67.0 | 3 / 35 | 3482 |
| 8 | 2 | 62.6 | 71.1 | 3 / 35 | 3764 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 81 | 2% |
| dummy.micro.Sparrow 2.5 | 16 | 75% |
| brainfade.melee.Dusk 0.44 | 15 | 60% |
| wcsv.melee.EngineerMelee 0.1 | 7 | 71% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 253 of 280 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 156 | 62% | 159 |
| brainfade.melee.Dusk 0.44 | 41 | 16% | 50 |
| wcsv.melee.EngineerMelee 0.1 | 25 | 10% | 29 |
| dummy.micro.Sparrow 2.5 | 13 | 5% | 23 |
| mz.NanoGod 2.02 | 7 | 3% | 9 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 4 |
| jab.DiamondStealer 5 | 3 | 1% | 3 |
| cvt.Firsty 1.0 | 2 | 1% | 3 |
2 death(s) with no robot to name.

## Melee bench: F44

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 80.9 | 118 / 280 | 2.72 | 18.0% | 43164 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.1 | 18.0% | 118 |
| stelo.Liblix 0.3.1 | 2.0 | 15.8% | 113 |
| tzu.TheArtOfWar 1.2 | 2.9 | 13.2% | 28 |
| wompi.Quokka 1.6 | 4.4 | 10.5% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.4 | 9.3% | 1 |
| jwirde.Gort 2.0 | 5.5 | 9.4% | 11 |
| stf.PanzerGeneral 0.1 | 7.4 | 7.2% | 3 |
| disan.Chair 2.2.0 | 7.4 | 7.5% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.7% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 78.1 | 14 / 35 | 5666 |
| 2 | 1 | 68.5 | 85.1 | 16 / 35 | 5516 |
| 3 | 1 | 68.5 | 82.2 | 18 / 35 | 5646 |
| 4 | 1 | 66.4 | 76.8 | 12 / 35 | 5098 |
| 5 | 1 | 66.9 | 77.5 | 17 / 35 | 5288 |
| 6 | 1 | 67.3 | 80.3 | 16 / 35 | 5274 |
| 7 | 1 | 67.5 | 84.1 | 14 / 35 | 5104 |
| 8 | 2 | 67.8 | 83.2 | 11 / 35 | 5572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 92 | 32% |
| tzu.TheArtOfWar 1.2 | 72 | 79% |
| disan.Chair 2.2.0 | 10 | 90% |
| jwirde.Gort 2.0 | 9 | 67% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 100% |
| wompi.Quokka 1.6 | 6 | 100% |
| stf.PanzerGeneral 0.1 | 5 | 80% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 163 of 280 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 87 | 53% | 123 |
| tzu.TheArtOfWar 1.2 | 36 | 22% | 81 |
| stf.PanzerGeneral 0.1 | 11 | 7% | 18 |
| jwirde.Gort 2.0 | 10 | 6% | 23 |
| wompi.Quokka 1.6 | 9 | 6% | 14 |
| amk.jointstrike.JointStrike 0.2 | 5 | 3% | 7 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 2% | 5 |
| disan.Chair 2.2.0 | 2 | 1% | 6 |
| sample.Crazy 1.0 | 0 | 0% | 3 |

## Melee bench: F45

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.9 | 115 / 280 | 2.45 | 19.1% | 45773 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorS1 0.1 | 1.0 | 19.1% | 115 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.1% | 139 |
| jje.BagPuss 1.2 | 3.3 | 11.3% | 6 |
| sul.Lunar 1.1 | 4.4 | 10.0% | 6 |
| myl.nano.Graviton 1.10 | 4.5 | 10.3% | 7 |
| fm.claire 1.7 | 6.5 | 8.5% | 1 |
| hvilela.HVilela 0.9 | 7.1 | 8.0% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 7.9% | 1 |
| wit.Deep7 2.0 | 9.3 | 6.1% | 5 |
| abud.ThirdRobo 1.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 84.1 | 10 / 35 | 5872 |
| 2 | 1 | 69.5 | 87.3 | 17 / 35 | 5592 |
| 3 | 1 | 68.6 | 83.8 | 12 / 35 | 6002 |
| 4 | 1 | 67.3 | 80.3 | 14 / 35 | 5535 |
| 5 | 1 | 68.8 | 84.4 | 15 / 35 | 5535 |
| 6 | 1 | 69.9 | 87.3 | 16 / 35 | 6152 |
| 7 | 1 | 69.1 | 85.7 | 16 / 35 | 5895 |
| 8 | 1 | 66.6 | 78.4 | 15 / 35 | 5190 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 140 | 34% |
| jje.BagPuss 1.2 | 19 | 95% |
| sul.Lunar 1.1 | 16 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 100% |
| wit.Deep7 2.0 | 9 | 100% |
| myl.nano.Graviton 1.10 | 9 | 89% |
| fm.claire 1.7 | 4 | 75% |
| hvilela.HVilela 0.9 | 2 | 100% |

Hadur died in 165 of 280 rounds, at a mean tick of 1974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 97 | 59% | 0 |
| jje.BagPuss 1.2 | 13 | 8% | 71 |
| sul.Lunar 1.1 | 13 | 8% | 63 |
| myl.nano.Graviton 1.10 | 11 | 7% | 38 |
| fm.claire 1.7 | 11 | 7% | 22 |
| hvilela.HVilela 0.9 | 8 | 5% | 28 |
| wit.Deep7 2.0 | 6 | 4% | 18 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 3% | 29 |
| abud.ThirdRobo 1.0 | 1 | 1% | 7 |

## Melee bench: F46

hadur117.micro.SaorS1 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 70.4 | 27 / 280 | 3.66 | 14.4% | 34782 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.4% | 112 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.3% | 116 |
| hadur117.micro.SaorS1 0.1 | 3.0 | 14.4% | 27 |
| cx.Princess 1.0 | 4.5 | 10.7% | 12 |
| mz.MicroSheep 1.0 | 4.8 | 10.5% | 9 |
| sadoner.killer 0.2 | 5.8 | 9.1% | 1 |
| arthord.NanoSatanMelee Beta | 7.6 | 6.8% | 2 |
| jeremyreeder.collective.Prophet 5 | 7.6 | 6.3% | 1 |
| kurios.DOSexe .9a | 8.8 | 5.2% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 63.2 | 2 / 35 | 4136 |
| 2 | 3 | 63.0 | 73.3 | 4 / 35 | 4328 |
| 3 | 3 | 63.6 | 73.7 | 6 / 35 | 4418 |
| 4 | 3 | 62.5 | 70.5 | 4 / 35 | 4292 |
| 5 | 3 | 64.1 | 74.3 | 4 / 35 | 4862 |
| 6 | 3 | 62.7 | 72.4 | 1 / 35 | 4178 |
| 7 | 3 | 60.4 | 63.8 | 4 / 35 | 4229 |
| 8 | 3 | 62.3 | 72.4 | 2 / 35 | 4339 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 46 | 24% |
| rsalesc.melee.Medina 0.4.5 | 38 | 16% |
| mz.MicroSheep 1.0 | 11 | 45% |
| cx.Princess 1.0 | 4 | 50% |
| sadoner.killer 0.2 | 3 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 0% |

Hadur died in 253 of 280 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 109 | 43% | 123 |
| rsalesc.melee.Medina 0.4.5 | 77 | 30% | 83 |
| cx.Princess 1.0 | 30 | 12% | 31 |
| sadoner.killer 0.2 | 13 | 5% | 14 |
| mz.MicroSheep 1.0 | 10 | 4% | 15 |
| arthord.NanoSatanMelee Beta | 6 | 2% | 6 |
| kurios.DOSexe .9a | 5 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 2 |
| jeremyreeder.collective.Prophet 5 | 1 | 0% | 2 |

