# Bench suite: suite.txt

## Melee bench: F01

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 80.4 | 33 / 280 | 2.76 | 15.0% | 32632 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 21.1% | 211 |
| wompi.Wallaby 5.1 | 2.0 | 15.0% | 33 |
| sgp.JollyNinja 3.53 | 3.1 | 12.3% | 22 |
| mz.MicroGodMelee 1 | 4.1 | 11.0% | 9 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.9 | 10.4% | 1 |
| lorneswork.Predator 1.0 | 5.9 | 9.5% | 4 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.5 | 5.2% | 0 |
| skm.butterfly 1.0 | 8.6 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 9.9 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 81.3 | 4 / 35 | 3853 |
| 2 | 2 | 62.6 | 79.4 | 3 / 35 | 3657 |
| 3 | 2 | 64.7 | 81.9 | 5 / 35 | 4216 |
| 4 | 2 | 63.2 | 80.3 | 3 / 35 | 3953 |
| 5 | 2 | 64.8 | 82.9 | 5 / 35 | 4327 |
| 6 | 2 | 64.2 | 81.6 | 3 / 35 | 4281 |
| 7 | 2 | 64.3 | 78.4 | 4 / 35 | 4617 |
| 8 | 2 | 62.8 | 77.8 | 6 / 35 | 3728 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 143 | 6% |
| sgp.JollyNinja 3.53 | 18 | 61% |
| mz.MicroGodMelee 1 | 9 | 67% |
| lorneswork.Predator 1.0 | 5 | 80% |
| simonton.nano.WeekendObsession_Melee 1.0 | 2 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 247 of 280 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 178 | 72% | 185 |
| sgp.JollyNinja 3.53 | 33 | 13% | 41 |
| mz.MicroGodMelee 1 | 17 | 7% | 28 |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 3% | 9 |
| lorneswork.Predator 1.0 | 6 | 2% | 9 |
| adt.Ar2 1.0 | 4 | 2% | 5 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 0% | 2 |
| skm.butterfly 1.0 | 1 | 0% | 1 |

## Melee bench: F02

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 79.1 | 77 / 280 | 2.88 | 16.0% | 33590 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.4 | 16.0% | 77 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.8% | 79 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 14.2% | 63 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.2% | 9 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.9 | 9.8% | 20 |
| Noran.BitchingElk 0.054 | 6.1 | 8.3% | 17 |
| sch.Simone 0.3d | 7.5 | 7.5% | 7 |
| fnc.bandit.Bandit 5.2.0 | 7.6 | 7.6% | 2 |
| stelo.PatternRobot 1.0 | 8.5 | 6.4% | 6 |
| fullsail.SweetTea 1.1 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 81.0 | 14 / 35 | 4091 |
| 2 | 2 | 62.4 | 73.7 | 6 / 35 | 4093 |
| 3 | 1 | 63.4 | 74.9 | 11 / 35 | 4197 |
| 4 | 1 | 65.2 | 82.5 | 10 / 35 | 4121 |
| 5 | 1 | 64.1 | 78.7 | 8 / 35 | 4581 |
| 6 | 2 | 63.0 | 76.8 | 9 / 35 | 3808 |
| 7 | 1 | 65.7 | 83.5 | 9 / 35 | 4592 |
| 8 | 1 | 64.9 | 81.6 | 10 / 35 | 4107 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 49 | 39% |
| pulsar.PulsarMax 0.8.9 | 40 | 30% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 76% |
| Noran.BitchingElk 0.054 | 14 | 79% |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 64% |
| stelo.PatternRobot 1.0 | 8 | 75% |
| sch.Simone 0.3d | 8 | 50% |
| fnc.bandit.Bandit 5.2.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 203 of 280 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 81 | 40% | 102 |
| pulsar.PulsarMax 0.8.9 | 59 | 29% | 79 |
| lrem.micro.SpikeSoldier 0.4 | 18 | 9% | 25 |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 6% | 20 |
| stelo.PatternRobot 1.0 | 11 | 5% | 14 |
| sch.Simone 0.3d | 9 | 4% | 14 |
| Noran.BitchingElk 0.054 | 7 | 3% | 17 |
| fnc.bandit.Bandit 5.2.0 | 5 | 2% | 8 |
| fullsail.SweetTea 1.1 | 0 | 0% | 1 |

## Melee bench: F03

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 90.0 | 174 / 280 | 1.90 | 18.8% | 42836 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 18.8% | 174 |
| radnor.DoctorBob 1.42 | 2.6 | 14.3% | 36 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.6% | 30 |
| vuen.Cake 2.51 | 3.4 | 13.1% | 34 |
| urdos.URDOS 1.3 | 5.0 | 9.6% | 2 |
| adt.Ar1 2.1 | 6.5 | 7.4% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 6.6 | 6.9% | 1 |
| oa.weak.FlyMk1 0.1 | 7.9 | 6.3% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.1 | 5.3% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 90.8 | 19 / 35 | 5186 |
| 2 | 1 | 69.0 | 90.2 | 25 / 35 | 5591 |
| 3 | 1 | 69.6 | 91.1 | 21 / 35 | 5845 |
| 4 | 1 | 69.9 | 93.3 | 26 / 35 | 5397 |
| 5 | 1 | 68.3 | 89.5 | 22 / 35 | 5051 |
| 6 | 1 | 68.5 | 91.1 | 21 / 35 | 5580 |
| 7 | 1 | 67.9 | 86.7 | 18 / 35 | 5275 |
| 8 | 1 | 67.7 | 87.6 | 22 / 35 | 4911 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 81 | 80% |
| vuen.Cake 2.51 | 75 | 76% |
| radnor.DoctorBob 1.42 | 44 | 82% |
| ghent.ArthurPanzergon 1.0.0 | 5 | 80% |
| urdos.URDOS 1.3 | 4 | 75% |
| adt.Ar1 2.1 | 4 | 75% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 100% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |

Hadur died in 107 of 280 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 43 | 40% | 84 |
| kawigi.nano.Lib 1.0 | 28 | 26% | 85 |
| vuen.Cake 2.51 | 25 | 23% | 81 |
| urdos.URDOS 1.3 | 4 | 4% | 8 |
| ghent.ArthurPanzergon 1.0.0 | 3 | 3% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 2% | 2 |
| oa.weak.FlyMk1 0.1 | 1 | 1% | 7 |
| adt.Ar1 2.1 | 1 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 3 |

## Melee bench: F04

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 79.1 | 6 / 280 | 2.88 | 15.1% | 36589 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.5% | 261 |
| wompi.Wallaby 5.1 | 2.0 | 15.1% | 6 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.1% | 7 |
| TNT.TNT 0.99.1 | 4.0 | 11.0% | 2 |
| josago.Jorgito 0.16 | 5.0 | 9.2% | 1 |
| css.Delitioner 0.11 | 6.3 | 6.9% | 1 |
| tj.zombie1n 1.0.1 | 6.8 | 6.7% | 0 |
| rampancy.Durandal 2.1d | 8.1 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.1 | 4.1% | 0 |
| spin.Bugstard 0.012b | 9.8 | 3.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 76.8 | 0 / 35 | 4697 |
| 2 | 2 | 65.8 | 81.6 | 1 / 35 | 5023 |
| 3 | 2 | 65.9 | 83.8 | 0 / 35 | 4614 |
| 4 | 2 | 63.9 | 75.6 | 2 / 35 | 4427 |
| 5 | 2 | 62.1 | 73.3 | 0 / 35 | 4125 |
| 6 | 2 | 65.7 | 84.1 | 2 / 35 | 4421 |
| 7 | 2 | 64.9 | 79.4 | 1 / 35 | 4617 |
| 8 | 2 | 64.6 | 78.1 | 0 / 35 | 4665 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 152 | 2% |
| apc.LeeroyJenkins2 1.0 | 2 | 0% |
| josago.Jorgito 0.16 | 2 | 100% |
| css.Delitioner 0.11 | 1 | 0% |
| sp.Nanos.Ember 1.1 | 1 | 100% |

Hadur died in 274 of 280 rounds, at a mean tick of 1052. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 208 | 76% | 212 |
| TNT.TNT 0.99.1 | 25 | 9% | 25 |
| apc.LeeroyJenkins2 1.0 | 24 | 9% | 25 |
| josago.Jorgito 0.16 | 10 | 4% | 10 |
| css.Delitioner 0.11 | 5 | 2% | 5 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 1 |

## Melee bench: F05

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 63.2 | 13 / 280 | 4.31 | 11.5% | 23011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.1 | 19.2% | 161 |
| justin.DemonicRage 3.4 | 1.9 | 17.7% | 75 |
| wompi.Numbat 2.1 | 3.0 | 13.2% | 22 |
| wompi.Wallaby 5.1 | 4.0 | 11.5% | 13 |
| ms.Ares 0.19 | 5.5 | 9.2% | 4 |
| axeBots.HataMoto 3.09 | 5.5 | 9.0% | 5 |
| supersample.SuperBoxBot 1.0 | 7.4 | 6.0% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.6 | 5.7% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.4% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.3 | 64.8 | 1 / 35 | 2784 |
| 2 | 4 | 57.4 | 64.4 | 3 / 35 | 2839 |
| 3 | 4 | 57.4 | 61.9 | 1 / 35 | 3025 |
| 4 | 4 | 55.6 | 60.6 | 0 / 35 | 2692 |
| 5 | 4 | 55.7 | 61.0 | 0 / 35 | 2742 |
| 6 | 4 | 59.5 | 67.6 | 5 / 35 | 3093 |
| 7 | 4 | 56.4 | 63.2 | 1 / 35 | 2565 |
| 8 | 4 | 57.6 | 61.9 | 2 / 35 | 3271 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 17 | 6% |
| justin.DemonicRage 3.4 | 14 | 21% |
| wompi.Numbat 2.1 | 10 | 70% |
| axeBots.HataMoto 3.09 | 1 | 100% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 267 of 280 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 93 | 35% | 95 |
| justin.DemonicRage 3.4 | 89 | 33% | 92 |
| wompi.Numbat 2.1 | 54 | 20% | 61 |
| axeBots.HataMoto 3.09 | 12 | 4% | 12 |
| ms.Ares 0.19 | 8 | 3% | 9 |
| supersample.SuperBoxBot 1.0 | 5 | 2% | 5 |
| davidalves.net.DuelistMicroMelee 1.4 | 5 | 2% | 5 |
| GarmBox.Oranges 1.0 | 1 | 0% | 1 |

## Melee bench: F06

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 83.4 | 120 / 280 | 2.49 | 16.6% | 30902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.1 | 16.6% | 120 |
| jekl.StoneGhost 0.7 | 1.9 | 14.9% | 58 |
| origin.SleepSiphon 1.7b | 3.3 | 12.6% | 44 |
| mld.Wisdom 1.0 | 4.3 | 11.8% | 11 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.5 | 11.7% | 28 |
| gg.Wolverine 2.0 | 6.0 | 9.0% | 12 |
| spinnercat.Omen 1.0 | 7.8 | 7.1% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.9 | 6.6% | 6 |
| DBall.NUKE 0.1 | 8.4 | 6.3% | 2 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 84.8 | 17 / 35 | 3807 |
| 2 | 1 | 66.4 | 86.0 | 19 / 35 | 3911 |
| 3 | 1 | 66.6 | 87.6 | 19 / 35 | 3707 |
| 4 | 1 | 65.2 | 83.5 | 12 / 35 | 3997 |
| 5 | 2 | 63.2 | 76.2 | 12 / 35 | 3762 |
| 6 | 1 | 64.0 | 81.3 | 12 / 35 | 3616 |
| 7 | 1 | 65.8 | 83.5 | 16 / 35 | 4071 |
| 8 | 1 | 66.3 | 84.4 | 13 / 35 | 4031 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 65 | 74% |
| pe.minimelee.SandboxMiniMelee 1.1 | 39 | 64% |
| origin.SleepSiphon 1.7b | 34 | 68% |
| gg.Wolverine 2.0 | 18 | 67% |
| mld.Wisdom 1.0 | 7 | 57% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 57% |
| DBall.NUKE 0.1 | 3 | 67% |
| spinnercat.Omen 1.0 | 2 | 50% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 164 of 280 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 43 | 26% | 84 |
| mld.Wisdom 1.0 | 38 | 23% | 45 |
| origin.SleepSiphon 1.7b | 30 | 18% | 59 |
| pe.minimelee.SandboxMiniMelee 1.1 | 29 | 18% | 48 |
| gg.Wolverine 2.0 | 10 | 6% | 17 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 4% | 10 |
| spinnercat.Omen 1.0 | 5 | 3% | 10 |
| DBall.NUKE 0.1 | 0 | 0% | 5 |
| sample.Fire 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

## Melee bench: F07

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.8 | 100 / 280 | 2.19 | 17.5% | 38660 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.6 | 18.2% | 91 |
| wompi.Wallaby 5.1 | 1.9 | 17.5% | 100 |
| rtk.Tachikoma 1.0 | 2.5 | 16.8% | 63 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.5% | 17 |
| franzor.Lizt 1.3.1 | 4.8 | 10.6% | 12 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.8% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| sample.Target 1.0 | 9.0 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.7 | 87.6 | 14 / 35 | 4954 |
| 2 | 1 | 68.1 | 86.3 | 14 / 35 | 4599 |
| 3 | 2 | 68.5 | 87.3 | 12 / 35 | 4773 |
| 4 | 1 | 69.6 | 91.4 | 16 / 35 | 5235 |
| 5 | 2 | 67.8 | 85.4 | 12 / 35 | 4584 |
| 6 | 3 | 66.8 | 83.8 | 8 / 35 | 4770 |
| 7 | 3 | 67.7 | 84.4 | 9 / 35 | 4605 |
| 8 | 1 | 69.2 | 88.3 | 15 / 35 | 5140 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 80 | 59% |
| rsalesc.melee.Monk 0.3.6c | 61 | 15% |
| oog.melee.CapuletDroid 1.1 | 36 | 83% |
| franzor.Lizt 1.3.1 | 12 | 92% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |
| skm.PateranBotlock2 1.0 | 1 | 100% |

Hadur died in 180 of 280 rounds, at a mean tick of 1079. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 97 | 54% | 110 |
| rtk.Tachikoma 1.0 | 56 | 31% | 106 |
| oog.melee.CapuletDroid 1.1 | 12 | 7% | 40 |
| franzor.Lizt 1.3.1 | 8 | 4% | 14 |
| exauge.GateKeeper 1.1.121g | 4 | 2% | 5 |
| skm.PateranBotlock2 1.0 | 2 | 1% | 4 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 1 |

## Melee bench: F08

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 82.1 | 120 / 280 | 2.61 | 17.0% | 35551 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.1 | 17.0% | 120 |
| tm.Yuugao 1.0 | 2.4 | 13.9% | 59 |
| shrub.Vapour v159 | 2.5 | 13.5% | 54 |
| Krabb.sliNk.Garm 0.9u | 4.4 | 10.8% | 15 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 9.5% | 17 |
| m3thos.Eva00 1.1 | 5.9 | 8.5% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.4% | 8 |
| qualidafial.MajorDick 1.0.1 | 8.4 | 6.5% | 3 |
| SHAM.WOW 1.4 | 9.3 | 6.0% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.4 | 5.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 84.1 | 13 / 35 | 4783 |
| 2 | 2 | 64.2 | 76.2 | 10 / 35 | 4655 |
| 3 | 1 | 65.6 | 81.3 | 15 / 35 | 4591 |
| 4 | 1 | 66.0 | 84.4 | 16 / 35 | 4486 |
| 5 | 1 | 67.2 | 88.6 | 17 / 35 | 4488 |
| 6 | 1 | 64.2 | 79.7 | 14 / 35 | 4143 |
| 7 | 1 | 63.8 | 78.1 | 16 / 35 | 3730 |
| 8 | 1 | 67.3 | 84.8 | 19 / 35 | 4675 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 44 | 68% |
| tm.Yuugao 1.0 | 43 | 67% |
| Krabb.sliNk.Garm 0.9u | 31 | 77% |
| com.spp.robocode.MostlyHarmless 010 | 17 | 59% |
| jwst.DAD.DarkAndDarker 1.1 | 17 | 82% |
| m3thos.Eva00 1.1 | 9 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 160 of 280 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 59 | 37% | 95 |
| shrub.Vapour v159 | 48 | 30% | 77 |
| Krabb.sliNk.Garm 0.9u | 17 | 11% | 31 |
| com.spp.robocode.MostlyHarmless 010 | 12 | 8% | 23 |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 7% | 26 |
| m3thos.Eva00 1.1 | 5 | 3% | 12 |
| SHAM.WOW 1.4 | 4 | 3% | 5 |
| zyx.nano.BacillusComma 1.0 | 3 | 2% | 8 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 3 |

## Melee bench: F09

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 71.5 | 38 / 280 | 3.56 | 13.9% | 28058 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.8% | 160 |
| kc.micro.Figment 1.0 | 2.3 | 14.5% | 41 |
| wompi.Wallaby 5.1 | 2.8 | 13.9% | 38 |
| yagami.Tidus 0.11 | 4.5 | 11.2% | 6 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.5% | 24 |
| mc2.enemy.Original 0.9 | 5.5 | 9.2% | 9 |
| dft.Calliope 5.6 | 7.0 | 7.1% | 2 |
| step.nanoPri 1.0 | 8.5 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.3% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 66.0 | 3 / 35 | 3649 |
| 2 | 2 | 62.8 | 76.2 | 7 / 35 | 3627 |
| 3 | 3 | 61.0 | 72.1 | 6 / 35 | 3422 |
| 4 | 2 | 62.1 | 74.9 | 6 / 35 | 3522 |
| 5 | 3 | 60.9 | 71.7 | 4 / 35 | 3424 |
| 6 | 3 | 59.6 | 67.9 | 4 / 35 | 3217 |
| 7 | 3 | 61.3 | 71.1 | 4 / 35 | 3685 |
| 8 | 3 | 61.4 | 72.1 | 4 / 35 | 3512 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 50 | 4% |
| kc.micro.Figment 1.0 | 23 | 57% |
| yagami.Tidus 0.11 | 18 | 89% |
| pedersen.Grishnakh 1.0 | 8 | 50% |
| mc2.enemy.Original 0.9 | 5 | 60% |

Hadur died in 242 of 280 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 115 | 48% | 118 |
| kc.micro.Figment 1.0 | 51 | 21% | 71 |
| yagami.Tidus 0.11 | 29 | 12% | 35 |
| pedersen.Grishnakh 1.0 | 14 | 6% | 19 |
| mc2.enemy.Original 0.9 | 14 | 6% | 18 |
| robar.nano.Assertive_Melee 0.2 | 9 | 4% | 9 |
| dft.Calliope 5.6 | 4 | 2% | 4 |
| rdm.Dueler 0.4x | 3 | 1% | 3 |
| step.nanoPri 1.0 | 3 | 1% | 3 |

## Melee bench: F10

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 92.2 | 187 / 280 | 1.70 | 18.9% | 37812 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 18.9% | 187 |
| DTF.Kludgy 1.2b | 2.1 | 14.4% | 42 |
| ne.Chimera 1.2 | 3.4 | 12.7% | 16 |
| ejb.Polaris 1.0.1 | 3.8 | 12.0% | 15 |
| tvv.micro.Antares 1.1.1 | 5.1 | 10.7% | 10 |
| vStar.RAFzilla 2.15 | 5.6 | 10.3% | 5 |
| sam.Samspin 1.0 | 7.6 | 5.6% | 1 |
| kurios.DOSexe .9b | 8.1 | 5.5% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.9 | 5.1% | 0 |
| donjezza.Muncho 1.0 | 9.4 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 92.7 | 24 / 35 | 4674 |
| 2 | 1 | 69.6 | 94.3 | 27 / 35 | 4797 |
| 3 | 1 | 68.6 | 90.8 | 23 / 35 | 4621 |
| 4 | 1 | 67.4 | 88.9 | 20 / 35 | 4663 |
| 5 | 1 | 68.2 | 88.6 | 23 / 35 | 4810 |
| 6 | 1 | 69.3 | 94.6 | 23 / 35 | 4945 |
| 7 | 1 | 69.0 | 93.3 | 22 / 35 | 4587 |
| 8 | 1 | 69.5 | 94.3 | 25 / 35 | 4715 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 75 | 73% |
| ne.Chimera 1.2 | 48 | 85% |
| ejb.Polaris 1.0.1 | 47 | 81% |
| tvv.micro.Antares 1.1.1 | 24 | 75% |
| vStar.RAFzilla 2.15 | 22 | 91% |
| kurios.DOSexe .9b | 9 | 78% |
| donjezza.Muncho 1.0 | 8 | 88% |
| sam.Samspin 1.0 | 1 | 0% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 93 of 280 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 38 | 41% | 86 |
| ne.Chimera 1.2 | 14 | 15% | 57 |
| ejb.Polaris 1.0.1 | 12 | 13% | 52 |
| tvv.micro.Antares 1.1.1 | 9 | 10% | 32 |
| vStar.RAFzilla 2.15 | 8 | 9% | 28 |
| kurios.DOSexe .9b | 5 | 5% | 12 |
| sam.Samspin 1.0 | 4 | 4% | 5 |
| donjezza.Muncho 1.0 | 2 | 2% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 1% | 1 |

## Melee bench: F11

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 76.2 | 69 / 280 | 3.14 | 15.0% | 29642 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.6% | 127 |
| wompi.Wallaby 5.1 | 2.1 | 15.0% | 69 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.6% | 29 |
| djc.DynaBot 0.1.1 | 4.3 | 10.8% | 17 |
| rdt199.Warlord 0.73 | 5.0 | 10.0% | 22 |
| br2.MobyDickBot 1.6 | 6.0 | 8.7% | 9 |
| uji.YellohFellah 1.0 | 6.9 | 8.1% | 8 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.2% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.4 | 5.1% | 0 |
| stelo.MirrorNano 1.3 | 9.6 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 74.3 | 7 / 35 | 3413 |
| 2 | 2 | 62.0 | 72.4 | 8 / 35 | 3743 |
| 3 | 2 | 65.4 | 82.2 | 10 / 35 | 4080 |
| 4 | 3 | 60.2 | 72.7 | 4 / 35 | 3281 |
| 5 | 2 | 62.8 | 76.5 | 9 / 35 | 3802 |
| 6 | 2 | 64.8 | 79.7 | 15 / 35 | 3812 |
| 7 | 2 | 63.1 | 76.2 | 9 / 35 | 3946 |
| 8 | 2 | 62.4 | 75.9 | 7 / 35 | 3565 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 65 | 34% |
| cx.mini.Nimrod 0.55 | 25 | 44% |
| djc.DynaBot 0.1.1 | 17 | 76% |
| rdt199.Warlord 0.73 | 14 | 57% |
| uji.YellohFellah 1.0 | 9 | 67% |
| br2.MobyDickBot 1.6 | 7 | 100% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |

Hadur died in 211 of 280 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 102 | 48% | 124 |
| cx.mini.Nimrod 0.55 | 44 | 21% | 54 |
| rdt199.Warlord 0.73 | 23 | 11% | 32 |
| djc.DynaBot 0.1.1 | 13 | 6% | 25 |
| uji.YellohFellah 1.0 | 9 | 4% | 16 |
| br2.MobyDickBot 1.6 | 8 | 4% | 17 |
| KiraNL.Chupacabra 0.4 | 8 | 4% | 8 |
| stelo.MirrorNano 1.3 | 4 | 2% | 4 |

## Melee bench: F12

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 83.0 | 122 / 280 | 2.53 | 16.4% | 26929 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 16.4% | 122 |
| bts.wiki.RipCurl 0.9b | 2.6 | 14.3% | 54 |
| nat.PallasHawk 1.0 | 3.1 | 13.2% | 47 |
| darkcanuck.Leon 1.01 | 3.3 | 13.3% | 39 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.0% | 12 |
| jrm.Test0 1.0 | 6.1 | 8.1% | 2 |
| jp.Perpy 16.0 | 7.6 | 7.1% | 1 |
| cs.sheldor.Talon 1.1 | 7.8 | 7.0% | 0 |
| stuff.Vlad 0.1 | 8.9 | 5.8% | 2 |
| jaybot.bots.Oddball 4.0 | 9.6 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 84.4 | 17 / 35 | 3561 |
| 2 | 1 | 64.7 | 83.2 | 12 / 35 | 3408 |
| 3 | 1 | 63.5 | 78.1 | 14 / 35 | 3275 |
| 4 | 1 | 67.2 | 89.2 | 21 / 35 | 3527 |
| 5 | 1 | 64.0 | 81.9 | 12 / 35 | 3406 |
| 6 | 1 | 64.7 | 81.3 | 18 / 35 | 3193 |
| 7 | 1 | 64.3 | 83.5 | 12 / 35 | 3211 |
| 8 | 1 | 65.0 | 82.5 | 16 / 35 | 3348 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 69 | 62% |
| nat.PallasHawk 1.0 | 52 | 60% |
| darkcanuck.Leon 1.01 | 47 | 64% |
| brainfade.melee.Genghis 0.36 | 14 | 64% |
| jrm.Test0 1.0 | 4 | 75% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| jp.Perpy 16.0 | 2 | 50% |
| jaybot.bots.Oddball 4.0 | 2 | 50% |

Hadur died in 159 of 280 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 53 | 33% | 86 |
| nat.PallasHawk 1.0 | 35 | 22% | 73 |
| darkcanuck.Leon 1.01 | 28 | 18% | 65 |
| jrm.Test0 1.0 | 15 | 9% | 17 |
| brainfade.melee.Genghis 0.36 | 11 | 7% | 16 |
| cs.sheldor.Talon 1.1 | 6 | 4% | 8 |
| jp.Perpy 16.0 | 5 | 3% | 8 |
| stuff.Vlad 0.1 | 4 | 3% | 4 |
| jaybot.bots.Oddball 4.0 | 2 | 1% | 3 |

## Melee bench: F13

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 73.6 | 30 / 280 | 3.38 | 13.7% | 29069 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.4 | 17.1% | 139 |
| ags.Glacier 0.2.11 | 1.6 | 17.5% | 75 |
| wompi.Wallaby 5.1 | 3.1 | 13.7% | 30 |
| shinh.Entangled 0.3 | 4.3 | 12.6% | 32 |
| gh.micro.Gruweltje 0.7 | 4.6 | 11.7% | 4 |
| apc.Colossus2 0.17 | 6.1 | 7.7% | 1 |
| stelo.Wang 1.0 | 6.9 | 6.6% | 0 |
| ayk.WallHugger 1.0 | 8.4 | 5.2% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.7% | 0 |
| sample.Tracker 1.0 | 9.9 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.2 | 73.0 | 1 / 35 | 3633 |
| 2 | 3 | 61.2 | 71.1 | 5 / 35 | 3777 |
| 3 | 3 | 62.3 | 75.6 | 4 / 35 | 3692 |
| 4 | 3 | 61.8 | 74.9 | 8 / 35 | 3306 |
| 5 | 3 | 62.7 | 77.5 | 4 / 35 | 3824 |
| 6 | 3 | 62.3 | 74.3 | 3 / 35 | 3965 |
| 7 | 3 | 60.7 | 70.8 | 3 / 35 | 3520 |
| 8 | 3 | 60.3 | 71.7 | 2 / 35 | 3352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 42 | 19% |
| ags.Glacier 0.2.11 | 32 | 41% |
| shinh.Entangled 0.3 | 11 | 45% |
| gh.micro.Gruweltje 0.7 | 2 | 100% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 251 of 280 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 100 | 40% | 112 |
| mn.Combat 3.25.0 | 80 | 32% | 90 |
| shinh.Entangled 0.3 | 39 | 16% | 44 |
| gh.micro.Gruweltje 0.7 | 15 | 6% | 16 |
| stelo.Wang 1.0 | 12 | 5% | 14 |
| ayk.WallHugger 1.0 | 2 | 1% | 2 |
| maribo.FollowFire 1 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F14

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 90.4 | 183 / 280 | 1.86 | 18.8% | 38291 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 18.8% | 183 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.6% | 36 |
| catcat20.shape.Theta 0.018 | 3.1 | 12.4% | 42 |
| sanyi.mikrobi.Roberto 1.0 | 4.9 | 9.7% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.1 | 9.6% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 6.0 | 9.2% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 6.1 | 8.9% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 8.2% | 12 |
| pa.Improved 1.0 | 9.0 | 5.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 86.7 | 19 / 35 | 4453 |
| 2 | 1 | 70.4 | 95.6 | 26 / 35 | 5131 |
| 3 | 1 | 69.2 | 89.2 | 24 / 35 | 5104 |
| 4 | 1 | 67.5 | 87.9 | 19 / 35 | 4463 |
| 5 | 1 | 68.9 | 90.5 | 24 / 35 | 4554 |
| 6 | 1 | 68.9 | 89.8 | 25 / 35 | 5015 |
| 7 | 1 | 67.5 | 88.3 | 19 / 35 | 4399 |
| 8 | 1 | 70.5 | 95.2 | 27 / 35 | 5172 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 104 | 88% |
| catcat20.shape.Theta 0.018 | 62 | 63% |
| sheldor.micro.PointInLineRRAL 1.0 | 25 | 84% |
| sanyi.mikrobi.Roberto 1.0 | 14 | 93% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 97 of 280 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 42 | 43% | 72 |
| simonton.micro.Sprout 1.1.3 | 31 | 32% | 119 |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 12% | 34 |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 6% | 7 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 3% | 15 |
| sanyi.mikrobi.Roberto 1.0 | 2 | 2% | 22 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 1% | 7 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |
| pa.Improved 1.0 | 0 | 0% | 1 |

## Melee bench: F15

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 82.2 | 124 / 280 | 2.60 | 17.5% | 39873 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.5% | 124 |
| emp.Yngwie 1.11 | 2.5 | 13.7% | 74 |
| kawigi.micro.Shiz 1.1 | 2.6 | 13.9% | 30 |
| mld.DustBunny 3.8 | 4.0 | 12.1% | 16 |
| cb.nano.Insomnia 1.0 | 5.3 | 10.6% | 8 |
| kawigi.robot.Girl 1.2 | 5.6 | 10.1% | 28 |
| Grystrion.TrackerWO 1.0 | 7.3 | 6.7% | 0 |
| lambdaxy.TBot 0.1 | 7.8 | 6.3% | 0 |
| divineomega.TrialBot 0.003 | 9.1 | 4.7% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.9 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.0 | 16 / 35 | 5183 |
| 2 | 1 | 68.4 | 86.3 | 19 / 35 | 5239 |
| 3 | 1 | 67.3 | 83.2 | 16 / 35 | 5252 |
| 4 | 1 | 66.5 | 80.6 | 14 / 35 | 5093 |
| 5 | 1 | 66.9 | 82.5 | 17 / 35 | 4858 |
| 6 | 1 | 66.7 | 81.9 | 15 / 35 | 4941 |
| 7 | 1 | 65.1 | 78.1 | 15 / 35 | 4611 |
| 8 | 1 | 65.1 | 78.1 | 12 / 35 | 4696 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 45 | 91% |
| emp.Yngwie 1.11 | 37 | 46% |
| kawigi.robot.Girl 1.2 | 30 | 80% |
| cb.nano.Insomnia 1.0 | 22 | 95% |
| mld.DustBunny 3.8 | 20 | 85% |
| divineomega.TrialBot 0.003 | 4 | 100% |

Hadur died in 156 of 280 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 71 | 46% | 112 |
| kawigi.micro.Shiz 1.1 | 26 | 17% | 65 |
| mld.DustBunny 3.8 | 21 | 13% | 44 |
| kawigi.robot.Girl 1.2 | 17 | 11% | 28 |
| cb.nano.Insomnia 1.0 | 11 | 7% | 13 |
| lambdaxy.TBot 0.1 | 5 | 3% | 6 |
| Grystrion.TrackerWO 1.0 | 3 | 2% | 5 |
| divineomega.TrialBot 0.003 | 2 | 1% | 7 |

## Melee bench: F16

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 80.7 | 89 / 280 | 2.74 | 16.4% | 35001 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.1 | 17.8% | 116 |
| wompi.Wallaby 5.1 | 2.0 | 16.4% | 89 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.9 | 14.3% | 16 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.8% | 32 |
| tvv.nano.Polaris 1.2 | 5.3 | 9.2% | 9 |
| bvh.fnr.Fenrir 0.36l | 5.8 | 9.0% | 5 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.3% | 2 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.4% | 10 |
| asd.Cthulhu 1.3 | 9.1 | 4.9% | 1 |
| repositorio.NanoStep 1.0 | 9.1 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.0 | 79.0 | 11 / 35 | 4149 |
| 2 | 2 | 66.3 | 84.4 | 8 / 35 | 4507 |
| 3 | 2 | 64.5 | 77.1 | 10 / 35 | 4337 |
| 4 | 1 | 67.4 | 86.0 | 15 / 35 | 4764 |
| 5 | 2 | 65.3 | 81.6 | 12 / 35 | 4304 |
| 6 | 2 | 64.0 | 76.8 | 9 / 35 | 4038 |
| 7 | 2 | 65.6 | 80.3 | 12 / 35 | 4407 |
| 8 | 2 | 65.6 | 80.3 | 12 / 35 | 4495 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 103 | 39% |
| techdude.forest.FlamingForest 1.1 | 29 | 86% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 23 | 78% |
| bvh.fnr.Fenrir 0.36l | 5 | 60% |
| divineomega.DivineBot 1.9.4.5 | 3 | 67% |
| tvv.nano.Polaris 1.2 | 2 | 50% |
| stelo.IntrinsicVolatility 1.4 | 1 | 0% |

Hadur died in 191 of 280 rounds, at a mean tick of 1042. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 97 | 51% | 144 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 27 | 14% | 43 |
| techdude.forest.FlamingForest 1.1 | 23 | 12% | 41 |
| bvh.fnr.Fenrir 0.36l | 21 | 11% | 23 |
| tvv.nano.Polaris 1.2 | 8 | 4% | 10 |
| divineomega.DivineBot 1.9.4.5 | 6 | 3% | 8 |
| stelo.IntrinsicVolatility 1.4 | 6 | 3% | 8 |
| asd.Cthulhu 1.3 | 2 | 1% | 2 |
| repositorio.NanoStep 1.0 | 1 | 1% | 1 |

## Melee bench: F17

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 80.8 | 115 / 280 | 2.73 | 16.5% | 34363 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 16.5% | 115 |
| et.Predator 1.8 | 2.8 | 13.4% | 32 |
| oog.melee.Mercutio 1.0 | 3.1 | 12.9% | 44 |
| cx.BlestPain 1.41 | 3.4 | 12.7% | 58 |
| nic.Nicator 2.4 | 5.1 | 11.4% | 20 |
| ahf.NanoAndrew .4 | 5.8 | 10.4% | 8 |
| maribo.melee.BMV 0.1 | 6.9 | 8.9% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.5% | 0 |
| tex.Longbot 0.4 | 8.5 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 83.2 | 15 / 35 | 4296 |
| 2 | 1 | 65.6 | 80.6 | 15 / 35 | 4355 |
| 3 | 1 | 65.1 | 80.3 | 14 / 35 | 4084 |
| 4 | 1 | 63.5 | 74.6 | 13 / 35 | 4230 |
| 5 | 1 | 66.3 | 81.6 | 17 / 35 | 4491 |
| 6 | 1 | 66.8 | 84.1 | 17 / 35 | 4421 |
| 7 | 1 | 65.7 | 83.2 | 11 / 35 | 4132 |
| 8 | 1 | 65.1 | 78.7 | 13 / 35 | 4354 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 58 | 71% |
| cx.BlestPain 1.41 | 37 | 41% |
| nic.Nicator 2.4 | 33 | 85% |
| oog.melee.Mercutio 1.0 | 20 | 75% |
| ahf.NanoAndrew .4 | 10 | 70% |
| maribo.melee.BMV 0.1 | 8 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 166 of 280 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 45 | 27% | 85 |
| cx.BlestPain 1.41 | 43 | 26% | 58 |
| oog.melee.Mercutio 1.0 | 25 | 15% | 42 |
| nic.Nicator 2.4 | 21 | 13% | 45 |
| ahf.NanoAndrew .4 | 17 | 10% | 27 |
| maribo.melee.BMV 0.1 | 9 | 5% | 14 |
| tex.Longbot 0.4 | 3 | 2% | 3 |
| goblin.Bender 2.4 | 2 | 1% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 4 |

## Melee bench: F18

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 87.5 | 153 / 280 | 2.13 | 17.8% | 31491 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.8% | 153 |
| morbid.MorbidPriest 1.0 | 2.4 | 13.4% | 30 |
| agd.Mooserwirt2 2.7 | 2.9 | 12.4% | 33 |
| uji.DBH 1.1 | 4.5 | 11.1% | 14 |
| ratosh.Nobo 0.21 | 4.8 | 10.6% | 10 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.9% | 15 |
| sigterm.Sigterm 1.0 | 7.1 | 8.2% | 15 |
| kawigi.mini.Fhqwhgads 1.1 | 8.1 | 6.5% | 4 |
| stelo.WangRobot 1.0 | 9.0 | 5.5% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 87.3 | 19 / 35 | 4054 |
| 2 | 1 | 67.1 | 88.3 | 19 / 35 | 4050 |
| 3 | 1 | 67.8 | 89.2 | 21 / 35 | 4204 |
| 4 | 1 | 67.0 | 87.9 | 17 / 35 | 4016 |
| 5 | 1 | 65.4 | 85.1 | 16 / 35 | 3464 |
| 6 | 1 | 66.1 | 86.0 | 19 / 35 | 3857 |
| 7 | 1 | 69.0 | 91.7 | 25 / 35 | 4195 |
| 8 | 1 | 65.4 | 84.4 | 17 / 35 | 3651 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 60 | 82% |
| agd.Mooserwirt2 2.7 | 40 | 60% |
| uji.DBH 1.1 | 34 | 76% |
| spinnercat.Robovirus 2.718 | 23 | 57% |
| sigterm.Sigterm 1.0 | 23 | 65% |
| ratosh.Nobo 0.21 | 20 | 65% |
| stelo.WangRobot 1.0 | 8 | 88% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 127 of 280 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 29 | 23% | 85 |
| agd.Mooserwirt2 2.7 | 27 | 21% | 62 |
| uji.DBH 1.1 | 19 | 15% | 30 |
| ratosh.Nobo 0.21 | 18 | 14% | 38 |
| spinnercat.Robovirus 2.718 | 13 | 10% | 25 |
| sigterm.Sigterm 1.0 | 9 | 7% | 17 |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 4% | 10 |
| stelo.WangRobot 1.0 | 4 | 3% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 2% | 4 |

## Melee bench: F19

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 90.3 | 178 / 280 | 1.87 | 18.7% | 36061 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 18.7% | 178 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.1 | 15.6% | 49 |
| mld.Infinity 2.2 | 2.9 | 14.3% | 35 |
| krillr.mini.JointStrike 2.0.0 | 4.4 | 11.4% | 7 |
| erdnis.Rover 0.3 | 4.9 | 10.5% | 4 |
| patson.PatsonTestBot 1.0 | 5.9 | 8.9% | 3 |
| mbh.Mbh 0.1 | 7.0 | 7.4% | 0 |
| pac.ABC 2.1 | 7.9 | 6.7% | 4 |
| pbg.R2D2 1.0 | 9.0 | 5.4% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 89.8 | 22 / 35 | 4586 |
| 2 | 1 | 68.9 | 88.9 | 20 / 35 | 4726 |
| 3 | 1 | 69.4 | 90.8 | 23 / 35 | 4745 |
| 4 | 1 | 69.5 | 89.8 | 26 / 35 | 4370 |
| 5 | 1 | 68.9 | 89.8 | 22 / 35 | 4315 |
| 6 | 1 | 68.3 | 89.2 | 19 / 35 | 4380 |
| 7 | 1 | 68.5 | 89.2 | 20 / 35 | 4357 |
| 8 | 1 | 70.6 | 94.9 | 26 / 35 | 4582 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 117 | 85% |
| mld.Infinity 2.2 | 55 | 71% |
| krillr.mini.JointStrike 2.0.0 | 18 | 83% |
| patson.PatsonTestBot 1.0 | 10 | 90% |
| erdnis.Rover 0.3 | 8 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |
| pac.ABC 2.1 | 2 | 50% |

Hadur died in 102 of 280 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 45 | 44% | 129 |
| mld.Infinity 2.2 | 30 | 29% | 79 |
| krillr.mini.JointStrike 2.0.0 | 11 | 11% | 29 |
| erdnis.Rover 0.3 | 7 | 7% | 13 |
| patson.PatsonTestBot 1.0 | 5 | 5% | 13 |
| pbg.R2D2 1.0 | 2 | 2% | 6 |
| pac.ABC 2.1 | 2 | 2% | 5 |
| mbh.Mbh 0.1 | 0 | 0% | 6 |

## Melee bench: F20

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 86.9 | 125 / 280 | 2.18 | 18.0% | 37634 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 18.0% | 125 |
| trm.Wrekt 1.1.6.f | 1.8 | 16.0% | 77 |
| nz.jdc.nano.GridFu 1.0 | 3.6 | 11.6% | 13 |
| fwb.Nine 1.0.1 | 3.8 | 11.8% | 43 |
| catcat20.Rabbit 0.001 | 4.6 | 9.9% | 19 |
| m3thos.mini.Eva01 0.5.5 | 6.9 | 7.7% | 1 |
| bayen.nut.Squirrel 1.615 | 7.3 | 7.5% | 3 |
| djdjdj.NanoSkunk10 1.0 | 7.3 | 7.7% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.6 | 5.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 85.7 | 16 / 35 | 4533 |
| 2 | 1 | 67.9 | 88.3 | 15 / 35 | 4643 |
| 3 | 2 | 65.7 | 82.5 | 13 / 35 | 4332 |
| 4 | 1 | 68.0 | 87.9 | 17 / 35 | 5040 |
| 5 | 1 | 68.6 | 90.2 | 18 / 35 | 4957 |
| 6 | 1 | 67.9 | 87.9 | 18 / 35 | 4822 |
| 7 | 2 | 67.1 | 85.7 | 14 / 35 | 4522 |
| 8 | 1 | 67.2 | 86.7 | 14 / 35 | 4785 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 93 | 57% |
| fwb.Nine 1.0.1 | 37 | 41% |
| catcat20.Rabbit 0.001 | 35 | 71% |
| nz.jdc.nano.GridFu 1.0 | 18 | 72% |
| bayen.nut.Squirrel 1.615 | 13 | 77% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |

Hadur died in 156 of 280 rounds, at a mean tick of 1140. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 65 | 42% | 109 |
| fwb.Nine 1.0.1 | 40 | 26% | 39 |
| nz.jdc.nano.GridFu 1.0 | 21 | 13% | 37 |
| catcat20.Rabbit 0.001 | 16 | 10% | 47 |
| bayen.nut.Squirrel 1.615 | 10 | 6% | 21 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 7 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 2 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 10 |
1 death(s) with no robot to name.

## Melee bench: F21

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 92.5 | 167 / 280 | 1.68 | 19.4% | 40186 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 19.4% | 167 |
| eem.EvBot v4.6.16 | 2.0 | 16.1% | 82 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.0% | 16 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.8% | 6 |
| eld.Hmm 1.0 | 5.4 | 8.4% | 7 |
| oa.weak.BotherBot 0.1 | 5.9 | 7.8% | 2 |
| fire219.CatBot 1.0 | 7.0 | 7.0% | 0 |
| el.JumpShoot 0.2 | 8.4 | 5.7% | 0 |
| PSW.Relentless 0.1 | 8.6 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 93.3 | 21 / 35 | 5088 |
| 2 | 1 | 70.0 | 93.3 | 26 / 35 | 4754 |
| 3 | 1 | 70.5 | 93.0 | 19 / 35 | 5717 |
| 4 | 1 | 68.7 | 92.4 | 17 / 35 | 4671 |
| 5 | 1 | 68.7 | 90.8 | 15 / 35 | 4872 |
| 6 | 1 | 69.6 | 91.1 | 19 / 35 | 5138 |
| 7 | 1 | 70.3 | 92.1 | 24 / 35 | 5192 |
| 8 | 1 | 69.9 | 93.7 | 26 / 35 | 4754 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 126 | 53% |
| dummy.mini.Scimitar 1.01 | 60 | 88% |
| cf.RiO.RiOx 4.2.1 | 30 | 93% |
| eld.Hmm 1.0 | 10 | 90% |
| oa.weak.BotherBot 0.1 | 9 | 89% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 114 of 280 rounds, at a mean tick of 1244. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 70 | 61% | 133 |
| dummy.mini.Scimitar 1.01 | 25 | 22% | 78 |
| cf.RiO.RiOx 4.2.1 | 12 | 11% | 29 |
| eld.Hmm 1.0 | 3 | 3% | 21 |
| el.JumpShoot 0.2 | 2 | 2% | 2 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 12 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F23

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.4 | 135 / 280 | 2.04 | 18.3% | 37084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.4 | 18.3% | 135 |
| pe.SandboxLump 1.52 | 1.6 | 17.9% | 82 |
| cre.Karolos 0.32 | 3.0 | 14.0% | 39 |
| stelo.AreaTargetingBot 1.1 | 4.4 | 10.8% | 12 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.1 | 9.4% | 5 |
| stelo.RamTrackSurfer 1.2 | 6.0 | 9.0% | 5 |
| cw.megas.Blade 0.8 | 6.9 | 8.2% | 1 |
| sample.Walls 1.0 | 7.6 | 7.9% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.4% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.2 | 87.3 | 16 / 35 | 4715 |
| 2 | 2 | 67.8 | 87.6 | 16 / 35 | 4396 |
| 3 | 1 | 69.0 | 87.9 | 16 / 35 | 4766 |
| 4 | 1 | 69.0 | 87.6 | 16 / 35 | 4778 |
| 5 | 1 | 69.8 | 91.1 | 16 / 35 | 5127 |
| 6 | 1 | 69.3 | 88.3 | 19 / 35 | 4881 |
| 7 | 2 | 67.9 | 86.3 | 16 / 35 | 4165 |
| 8 | 1 | 69.2 | 91.1 | 20 / 35 | 4256 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 114 | 64% |
| cre.Karolos 0.32 | 42 | 50% |
| stelo.AreaTargetingBot 1.1 | 30 | 73% |
| stelo.RamTrackSurfer 1.2 | 9 | 78% |
| sample.Walls 1.0 | 6 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 67% |
| cw.megas.Blade 0.8 | 3 | 67% |

Hadur died in 146 of 280 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 74 | 51% | 151 |
| cre.Karolos 0.32 | 38 | 26% | 58 |
| stelo.AreaTargetingBot 1.1 | 23 | 16% | 35 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 5% | 12 |
| stelo.RamTrackSurfer 1.2 | 2 | 1% | 14 |
| cw.megas.Blade 0.8 | 2 | 1% | 5 |
| sample.Walls 1.0 | 0 | 0% | 5 |

## Melee bench: F24

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 8 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 72.6 | 50 / 280 | 3.46 | 13.7% | 24686 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 2.0 | 14.4% | 67 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.0% | 51 |
| wompi.Wallaby 5.1 | 2.8 | 13.7% | 50 |
| davidalves.Phoenix 0.54 | 3.4 | 13.3% | 59 |
| pedersen.Ugluk 1.1.1 | 4.6 | 12.0% | 36 |
| oog.melee.Corsair 1.0 | 6.3 | 9.0% | 4 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.7% | 11 |
| lunchie.Lunchbox 0.93 | 7.9 | 6.0% | 2 |
| as.FrankTheTank 1.3 | 9.1 | 5.3% | 0 |
| evd.X1 0.01 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.2 | 66.7 | 7 / 35 | 2772 |
| 2 | 3 | 60.0 | 72.7 | 5 / 35 | 2955 |
| 3 | 2 | 61.5 | 75.9 | 6 / 35 | 3355 |
| 4 | 4 | 57.9 | 66.7 | 3 / 35 | 3153 |
| 5 | 2 | 61.7 | 76.2 | 8 / 35 | 3032 |
| 6 | 3 | 61.2 | 76.2 | 5 / 35 | 3154 |
| 7 | 2 | 61.4 | 75.2 | 9 / 35 | 3141 |
| 8 | 3 | 60.3 | 71.4 | 7 / 35 | 3124 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 28 | 32% |
| davidalves.Phoenix 0.54 | 26 | 38% |
| rz.GlowBlowMelee 1.4 | 20 | 65% |
| pedersen.Ugluk 1.1.1 | 13 | 31% |
| stelo.SoJNanoMelee 1.1 | 13 | 77% |
| oog.melee.Corsair 1.0 | 4 | 75% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 231 of 280 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 62 | 27% | 73 |
| rz.GlowBlowMelee 1.4 | 49 | 21% | 60 |
| pedersen.Ugluk 1.1.1 | 48 | 21% | 51 |
| davidalves.Phoenix 0.54 | 44 | 19% | 53 |
| oog.melee.Corsair 1.0 | 11 | 5% | 16 |
| stelo.SoJNanoMelee 1.1 | 8 | 3% | 17 |
| lunchie.Lunchbox 0.93 | 4 | 2% | 5 |
| evd.X1 0.01 | 3 | 1% | 3 |
| as.FrankTheTank 1.3 | 2 | 1% | 2 |

## Melee bench: F25

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 83.9 | 149 / 280 | 2.45 | 17.4% | 30368 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.4% | 149 |
| voidious.mini.BrokenSword 2.0.3 | 2.1 | 14.4% | 54 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.5% | 19 |
| jdw.Hurricane 1.4 | 4.1 | 11.3% | 32 |
| gre.svman4.Morfeas 1.4.1 | 5.4 | 9.4% | 10 |
| ds.Oo 2.2 | 5.8 | 9.1% | 10 |
| gjr.Cephalosporin 0.1 | 7.1 | 7.6% | 3 |
| awesomeness.Elite 1.0 | 7.9 | 7.2% | 1 |
| adt.Ar2 1.1 | 8.6 | 6.6% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 89.5 | 22 / 35 | 3844 |
| 2 | 1 | 67.1 | 88.6 | 18 / 35 | 3590 |
| 3 | 1 | 66.2 | 84.8 | 19 / 35 | 4039 |
| 4 | 1 | 66.1 | 82.2 | 17 / 35 | 3884 |
| 5 | 1 | 65.0 | 81.6 | 16 / 35 | 3579 |
| 6 | 1 | 65.7 | 81.6 | 19 / 35 | 3577 |
| 7 | 1 | 67.0 | 85.4 | 22 / 35 | 4016 |
| 8 | 1 | 64.7 | 77.8 | 16 / 35 | 3839 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 67 | 67% |
| voidious.micro.BlitzBat 1.05 | 54 | 81% |
| jdw.Hurricane 1.4 | 31 | 84% |
| gjr.Cephalosporin 0.1 | 13 | 100% |
| ds.Oo 2.2 | 10 | 80% |
| gre.svman4.Morfeas 1.4.1 | 9 | 33% |
| adt.Ar2 1.1 | 7 | 100% |
| awesomeness.Elite 1.0 | 3 | 100% |

Hadur died in 131 of 280 rounds, at a mean tick of 647. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 45 | 34% | 93 |
| jdw.Hurricane 1.4 | 29 | 22% | 50 |
| voidious.micro.BlitzBat 1.05 | 24 | 18% | 68 |
| gre.svman4.Morfeas 1.4.1 | 12 | 9% | 14 |
| ds.Oo 2.2 | 9 | 7% | 19 |
| adt.Ar2 1.1 | 6 | 5% | 11 |
| awesomeness.Elite 1.0 | 3 | 2% | 9 |
| amk.ChumbaMini 0.2 | 2 | 2% | 2 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 13 |

## Melee bench: F26

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 84.8 | 126 / 280 | 2.36 | 17.1% | 36140 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 17.1% | 126 |
| ak.Fermat 2.0 | 1.9 | 16.1% | 79 |
| shu.nitro.LENIN .T34 | 3.4 | 12.5% | 44 |
| lrem.Spectre 0.4.4 | 3.8 | 12.1% | 18 |
| js.PinBall 1.6 | 5.1 | 10.3% | 5 |
| gh.mini.GrubbmOne 1.0 | 6.0 | 9.5% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 6.6 | 9.0% | 5 |
| fullsail.LaxativeTeaTwo 1.0 | 8.1 | 6.3% | 1 |
| sample.SpinBot 1.0 | 8.9 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 83.8 | 13 / 35 | 4460 |
| 2 | 2 | 65.7 | 83.2 | 13 / 35 | 4242 |
| 3 | 1 | 68.4 | 87.3 | 20 / 35 | 5016 |
| 4 | 1 | 68.1 | 89.8 | 20 / 35 | 4556 |
| 5 | 1 | 66.0 | 82.9 | 13 / 35 | 4566 |
| 6 | 1 | 67.9 | 85.7 | 20 / 35 | 4645 |
| 7 | 1 | 64.2 | 79.0 | 11 / 35 | 4007 |
| 8 | 1 | 67.4 | 87.0 | 16 / 35 | 4648 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 53 | 62% |
| lrem.Spectre 0.4.4 | 44 | 84% |
| shu.nitro.LENIN .T34 | 34 | 82% |
| jaybot.adv.bots.JayBot 2.0 | 14 | 79% |
| js.PinBall 1.6 | 10 | 80% |
| gh.mini.GrubbmOne 1.0 | 6 | 83% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 80% |

Hadur died in 154 of 280 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 74 | 48% | 106 |
| lrem.Spectre 0.4.4 | 30 | 19% | 58 |
| shu.nitro.LENIN .T34 | 22 | 14% | 57 |
| jaybot.adv.bots.JayBot 2.0 | 10 | 6% | 19 |
| js.PinBall 1.6 | 8 | 5% | 20 |
| gh.mini.GrubbmOne 1.0 | 4 | 3% | 11 |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 3% | 6 |
| sample.SpinBot 1.0 | 2 | 1% | 2 |

## Melee bench: F27

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.5 | 158 / 280 | 2.39 | 18.3% | 37810 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 18.3% | 158 |
| mk.Alpha 0.2.1 | 2.4 | 13.7% | 58 |
| wee.Gem 1.8.4 | 3.5 | 11.2% | 30 |
| sheldor.melee.nano.TestMelee 0.1 | 4.1 | 11.0% | 20 |
| EH.Eagle 1.0.6 | 5.4 | 9.2% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 9.4% | 5 |
| joe.ADinosaur 1.0 | 7.0 | 8.6% | 1 |
| throxbot.ThroxBot 0.1 | 7.8 | 7.5% | 3 |
| caimano.Furia_Ceca 0.22 | 8.4 | 7.2% | 1 |
| cs.Grudge 1.0 | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.9 | 20 / 35 | 4937 |
| 2 | 1 | 68.9 | 82.2 | 16 / 35 | 5700 |
| 3 | 1 | 65.7 | 86.0 | 18 / 35 | 3501 |
| 4 | 1 | 66.4 | 87.3 | 19 / 35 | 3876 |
| 5 | 1 | 67.0 | 88.6 | 21 / 35 | 3817 |
| 6 | 1 | 68.1 | 80.6 | 21 / 35 | 5146 |
| 7 | 1 | 67.8 | 76.5 | 21 / 35 | 5530 |
| 8 | 1 | 69.7 | 87.0 | 22 / 35 | 5303 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 76 | 83% |
| sheldor.melee.nano.TestMelee 0.1 | 36 | 81% |
| wee.Gem 1.8.4 | 36 | 78% |
| EH.Eagle 1.0.6 | 23 | 96% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 88% |
| joe.ADinosaur 1.0 | 5 | 80% |
| throxbot.ThroxBot 0.1 | 4 | 75% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |

Hadur died in 122 of 280 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 37 | 30% | 95 |
| sheldor.melee.nano.TestMelee 0.1 | 22 | 18% | 54 |
| wee.Gem 1.8.4 | 15 | 12% | 41 |
| joe.ADinosaur 1.0 | 15 | 12% | 18 |
| EH.Eagle 1.0.6 | 10 | 8% | 33 |
| techdude.kombat.FlamingKombat 1.5 | 9 | 7% | 16 |
| throxbot.ThroxBot 0.1 | 6 | 5% | 10 |
| caimano.Furia_Ceca 0.22 | 6 | 5% | 10 |
| cs.Grudge 1.0 | 2 | 2% | 2 |

## Melee bench: F28

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 88.3 | 165 / 280 | 2.05 | 17.9% | 30205 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.1 | 17.9% | 165 |
| kid.test.NightFox .2 | 1.9 | 15.5% | 59 |
| uji.Antique 1.0 | 3.5 | 11.9% | 21 |
| qohnil.blot.BlotBot 3.61 | 3.9 | 11.1% | 21 |
| pfvicm.Sobieski 7.2.3b | 4.6 | 10.4% | 2 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.1% | 7 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.5% | 4 |
| stelo.PianistNano 1.2 | 8.3 | 6.2% | 1 |
| matt.advanced.Katana 1.0 | 8.9 | 5.9% | 0 |
| stelo.Lifestealer 1.0 | 9.6 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 84.1 | 17 / 35 | 3556 |
| 2 | 1 | 66.7 | 87.9 | 15 / 35 | 3949 |
| 3 | 2 | 64.8 | 81.3 | 16 / 35 | 3521 |
| 4 | 1 | 67.6 | 88.3 | 23 / 35 | 3861 |
| 5 | 1 | 68.2 | 92.7 | 22 / 35 | 3939 |
| 6 | 1 | 67.8 | 89.5 | 25 / 35 | 3789 |
| 7 | 1 | 68.5 | 93.0 | 25 / 35 | 3889 |
| 8 | 1 | 67.7 | 89.8 | 22 / 35 | 3701 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 119 | 71% |
| uji.Antique 1.0 | 60 | 93% |
| qohnil.blot.BlotBot 3.61 | 15 | 53% |
| amk.ChumbaWumba 0.3 | 9 | 44% |
| pfvicm.Sobieski 7.2.3b | 8 | 100% |
| ahr.ice.Ice 1.0.2 | 3 | 67% |
| stelo.PianistNano 1.2 | 1 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 115 of 280 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 57 | 50% | 139 |
| uji.Antique 1.0 | 16 | 14% | 60 |
| qohnil.blot.BlotBot 3.61 | 16 | 14% | 29 |
| amk.ChumbaWumba 0.3 | 12 | 10% | 16 |
| pfvicm.Sobieski 7.2.3b | 7 | 6% | 16 |
| ahr.ice.Ice 1.0.2 | 5 | 4% | 14 |
| matt.advanced.Katana 1.0 | 2 | 2% | 3 |
| stelo.Lifestealer 1.0 | 0 | 0% | 1 |
| stelo.PianistNano 1.2 | 0 | 0% | 1 |

## Melee bench: F29

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 83.3 | 101 / 280 | 2.51 | 16.9% | 31742 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.4 | 16.9% | 101 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.8% | 82 |
| deewiant.Anomaly 0.2 | 2.5 | 15.2% | 61 |
| myl.micro.Troodon 1.10 | 3.9 | 12.3% | 20 |
| jok.PheonixM 0.1.2 | 5.0 | 9.6% | 8 |
| ph.melee.ArcherME 0.3 | 6.1 | 7.9% | 0 |
| DBall.Anarchy 0.1 | 7.3 | 6.7% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 8.1 | 5.7% | 0 |
| jangs.ns51 1.0 | 9.1 | 5.0% | 1 |
| ap.Frederick 1.1 | 9.4 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 85.1 | 13 / 35 | 4179 |
| 2 | 1 | 66.6 | 83.5 | 15 / 35 | 4212 |
| 3 | 2 | 66.0 | 83.2 | 13 / 35 | 3783 |
| 4 | 1 | 66.1 | 85.4 | 10 / 35 | 3997 |
| 5 | 2 | 65.8 | 81.0 | 12 / 35 | 3935 |
| 6 | 1 | 66.6 | 84.8 | 14 / 35 | 3930 |
| 7 | 1 | 66.6 | 83.8 | 16 / 35 | 3876 |
| 8 | 2 | 64.8 | 79.4 | 8 / 35 | 3830 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 78 | 62% |
| zyx.mega.YersiniaPestis 3.1 | 58 | 29% |
| myl.micro.Troodon 1.10 | 30 | 70% |
| jok.PheonixM 0.1.2 | 10 | 70% |
| DBall.Anarchy 0.1 | 6 | 83% |
| jangs.ns51 1.0 | 2 | 50% |
| ap.Frederick 1.1 | 2 | 100% |

Hadur died in 179 of 280 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 64 | 36% | 80 |
| deewiant.Anomaly 0.2 | 53 | 30% | 100 |
| myl.micro.Troodon 1.10 | 29 | 16% | 45 |
| jok.PheonixM 0.1.2 | 18 | 10% | 26 |
| DBall.Anarchy 0.1 | 5 | 3% | 15 |
| jangs.ns51 1.0 | 4 | 2% | 6 |
| ph.melee.ArcherME 0.3 | 4 | 2% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 1% | 4 |

## Melee bench: F30

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 70.3 | 43 / 280 | 3.67 | 13.5% | 27368 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.1 | 14.0% | 74 |
| wompi.Wallaby 5.1 | 2.8 | 13.5% | 43 |
| oog.melee.Capulet 1.2 | 2.9 | 13.2% | 38 |
| darkcanuck.B26354 1.06 | 3.3 | 13.1% | 65 |
| stelo.PastFuture 2.3.2 | 4.0 | 12.8% | 45 |
| intruder.PrairieWolf 2.61 | 7.0 | 8.0% | 6 |
| fowl3628800.LightningBolt 2.6.0 | 7.1 | 8.0% | 6 |
| ntc.Opposite 1.5 | 7.4 | 7.7% | 0 |
| tripphippy.Alice 1.1 | 8.5 | 7.0% | 4 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 72.1 | 4 / 35 | 3702 |
| 2 | 2 | 61.9 | 74.9 | 7 / 35 | 3537 |
| 3 | 2 | 61.3 | 74.0 | 5 / 35 | 3686 |
| 4 | 3 | 58.8 | 68.9 | 4 / 35 | 3190 |
| 5 | 4 | 56.9 | 63.5 | 3 / 35 | 2972 |
| 6 | 2 | 61.6 | 72.7 | 9 / 35 | 3411 |
| 7 | 3 | 59.7 | 67.9 | 7 / 35 | 3504 |
| 8 | 4 | 59.7 | 68.6 | 4 / 35 | 3366 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 31 | 32% |
| darkcanuck.B26354 1.06 | 30 | 27% |
| stelo.PastFuture 2.3.2 | 20 | 50% |
| oog.melee.Capulet 1.2 | 14 | 57% |
| fowl3628800.LightningBolt 2.6.0 | 5 | 80% |
| intruder.PrairieWolf 2.61 | 3 | 67% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 239 of 280 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 73 | 31% | 83 |
| darkcanuck.B26354 1.06 | 58 | 24% | 68 |
| stelo.PastFuture 2.3.2 | 37 | 15% | 42 |
| oog.melee.Capulet 1.2 | 36 | 15% | 47 |
| tripphippy.Alice 1.1 | 11 | 5% | 12 |
| fowl3628800.LightningBolt 2.6.0 | 9 | 4% | 11 |
| intruder.PrairieWolf 2.61 | 7 | 3% | 10 |
| ntc.Opposite 1.5 | 7 | 3% | 7 |
1 death(s) with no robot to name.

## Melee bench: F31

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 74.4 | 34 / 280 | 3.30 | 13.6% | 22885 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 19.1% | 164 |
| wompi.Wallaby 5.1 | 2.4 | 13.6% | 34 |
| gh.mini.Griezel 0.2 | 3.0 | 12.7% | 44 |
| spinnercat.micro.Tyger 0.1 | 3.9 | 11.8% | 19 |
| d414.nano.Quantum 1.0.0 | 4.8 | 10.6% | 13 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.7% | 3 |
| fm.mammillarias 1.3 | 7.6 | 6.5% | 2 |
| timmit.nano.TimDog 0.33 | 7.8 | 6.8% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 8.9 | 5.5% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.5 | 73.0 | 5 / 35 | 2896 |
| 2 | 3 | 59.7 | 72.7 | 2 / 35 | 2869 |
| 3 | 2 | 61.2 | 77.1 | 3 / 35 | 2925 |
| 4 | 3 | 59.6 | 73.0 | 3 / 35 | 2915 |
| 5 | 2 | 61.7 | 76.5 | 6 / 35 | 2830 |
| 6 | 2 | 62.0 | 77.8 | 3 / 35 | 3236 |
| 7 | 3 | 59.3 | 71.1 | 6 / 35 | 2436 |
| 8 | 2 | 60.5 | 74.0 | 6 / 35 | 2778 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 65 | 14% |
| gh.mini.Griezel 0.2 | 24 | 42% |
| spinnercat.micro.Tyger 0.1 | 16 | 63% |
| d414.nano.Quantum 1.0.0 | 8 | 25% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 0% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 246 of 280 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 116 | 47% | 124 |
| gh.mini.Griezel 0.2 | 46 | 19% | 58 |
| spinnercat.micro.Tyger 0.1 | 33 | 13% | 42 |
| d414.nano.Quantum 1.0.0 | 25 | 10% | 26 |
| gh.nano.Grofvuil 0.2 | 9 | 4% | 12 |
| timmit.nano.TimDog 0.33 | 7 | 3% | 8 |
| Gecko.ultimateGeckoBot 1.0 | 5 | 2% | 5 |
| fm.mammillarias 1.3 | 5 | 2% | 5 |

## Melee bench: F32

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 84.7 | 134 / 280 | 2.38 | 17.0% | 32598 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.1 | 17.0% | 134 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.6% | 82 |
| apc.botM 3.0 | 2.9 | 12.7% | 28 |
| lxx.ConceptA 0.8 | 4.3 | 11.1% | 11 |
| bayen.UbaMicro 1.4 | 5.1 | 9.7% | 7 |
| vjik.UnViolation 1.1 | 5.6 | 9.3% | 9 |
| yk.JahMicro 1.0 | 7.8 | 7.0% | 4 |
| panzer.Panzer 0.2 | 7.9 | 6.8% | 0 |
| conscience.Electron 1.3g | 9.1 | 6.2% | 0 |
| donjezza.Jezza 1.0 | 9.3 | 5.7% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 82.5 | 14 / 35 | 4056 |
| 2 | 1 | 65.4 | 83.5 | 15 / 35 | 4189 |
| 3 | 1 | 65.7 | 86.0 | 17 / 35 | 3799 |
| 4 | 1 | 65.8 | 85.1 | 16 / 35 | 4088 |
| 5 | 2 | 64.7 | 82.9 | 12 / 35 | 4003 |
| 6 | 1 | 64.8 | 82.2 | 17 / 35 | 4038 |
| 7 | 1 | 66.4 | 86.3 | 22 / 35 | 4183 |
| 8 | 1 | 67.3 | 89.2 | 21 / 35 | 4242 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 88 | 45% |
| lxx.ConceptA 0.8 | 37 | 92% |
| apc.botM 3.0 | 25 | 72% |
| bayen.UbaMicro 1.4 | 15 | 93% |
| vjik.UnViolation 1.1 | 8 | 63% |
| donjezza.Jezza 1.0 | 8 | 100% |
| yk.JahMicro 1.0 | 7 | 100% |
| panzer.Panzer 0.2 | 5 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 147 of 280 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 77 | 52% | 120 |
| lxx.ConceptA 0.8 | 23 | 16% | 40 |
| apc.botM 3.0 | 18 | 12% | 42 |
| bayen.UbaMicro 1.4 | 15 | 10% | 25 |
| vjik.UnViolation 1.1 | 8 | 5% | 25 |
| conscience.Electron 1.3g | 2 | 1% | 8 |
| panzer.Panzer 0.2 | 2 | 1% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 8 |
| yk.JahMicro 1.0 | 1 | 1% | 6 |

## Melee bench: F33

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 85.5 | 165 / 280 | 2.31 | 18.0% | 34131 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 18.0% | 165 |
| maribo.Quester 0.3 | 2.0 | 15.3% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.4 | 12.6% | 26 |
| gre.svman4.Leonidas 1.3.2 | 4.4 | 11.3% | 22 |
| labg.Cataclysm 2.05 | 4.5 | 10.6% | 17 |
| baal.nano.N 1.42 | 6.1 | 8.7% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.6 | 8.5% | 6 |
| zyx.micro.Ant 1.1 | 8.4 | 5.5% | 1 |
| sanja.First 0.1 | 9.0 | 5.1% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.6 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 85.7 | 25 / 35 | 3897 |
| 2 | 1 | 67.6 | 87.0 | 18 / 35 | 4349 |
| 3 | 1 | 66.9 | 83.5 | 18 / 35 | 4409 |
| 4 | 1 | 68.0 | 85.4 | 20 / 35 | 4609 |
| 5 | 1 | 64.9 | 78.1 | 16 / 35 | 3981 |
| 6 | 1 | 69.1 | 89.5 | 22 / 35 | 4560 |
| 7 | 1 | 67.9 | 85.7 | 24 / 35 | 4233 |
| 8 | 1 | 68.3 | 88.9 | 22 / 35 | 4093 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 77 | 84% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 48 | 71% |
| gre.svman4.Leonidas 1.3.2 | 39 | 85% |
| labg.Cataclysm 2.05 | 16 | 75% |
| kinsen.melee.Angsaichmophobia 1.8c | 12 | 100% |
| zyx.micro.Ant 1.1 | 3 | 100% |
| sanja.First 0.1 | 2 | 100% |
| baal.nano.N 1.42 | 2 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 100% |

Hadur died in 116 of 280 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 30 | 26% | 94 |
| gre.svman4.Leonidas 1.3.2 | 21 | 18% | 45 |
| labg.Cataclysm 2.05 | 20 | 17% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 16% | 61 |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 9% | 17 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 8 | 7% | 8 |
| baal.nano.N 1.42 | 3 | 3% | 7 |
| zyx.micro.Ant 1.1 | 3 | 3% | 5 |
| sanja.First 0.1 | 2 | 2% | 6 |

## Melee bench: F34

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 81.8 | 72 / 280 | 2.64 | 16.1% | 33972 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.8 | 16.6% | 74 |
| stelo.Spread 0.9 | 1.9 | 16.9% | 109 |
| wompi.Wallaby 5.1 | 2.4 | 16.1% | 72 |
| jcs.Seth 1.8 | 4.4 | 11.1% | 20 |
| tcf.Reach 3 | 4.6 | 10.6% | 4 |
| cli.Dancer 1.1 | 6.0 | 9.3% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.3% | 1 |
| sample.VelociRobot 1.0 | 9.4 | 3.6% | 0 |
| sample.RamFire 1.0 | 9.6 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.9 | 82.2 | 9 / 35 | 4194 |
| 2 | 2 | 66.8 | 85.7 | 12 / 35 | 4186 |
| 3 | 3 | 63.4 | 75.6 | 5 / 35 | 4065 |
| 4 | 3 | 65.7 | 82.2 | 8 / 35 | 4194 |
| 5 | 1 | 67.3 | 87.0 | 13 / 35 | 4528 |
| 6 | 3 | 65.1 | 81.3 | 4 / 35 | 4363 |
| 7 | 1 | 65.5 | 83.5 | 11 / 35 | 4042 |
| 8 | 3 | 64.9 | 77.1 | 10 / 35 | 4400 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 82 | 43% |
| kid.Gladiator .7.2 | 53 | 32% |
| jcs.Seth 1.8 | 14 | 64% |
| tcf.Reach 3 | 7 | 86% |
| cli.Dancer 1.1 | 3 | 67% |
| ratosh.Wesco 1.4 | 3 | 100% |

Hadur died in 210 of 280 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 93 | 44% | 122 |
| kid.Gladiator .7.2 | 76 | 36% | 94 |
| jcs.Seth 1.8 | 17 | 8% | 28 |
| tcf.Reach 3 | 8 | 4% | 17 |
| cli.Dancer 1.1 | 5 | 2% | 8 |
| ratosh.Wesco 1.4 | 4 | 2% | 6 |
| amk.Punbot.Punbot 0.01 | 4 | 2% | 4 |
| sample.RamFire 1.0 | 1 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F35

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 73.5 | 22 / 280 | 3.39 | 13.3% | 23693 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 21.0% | 225 |
| wompi.Wallaby 5.1 | 2.3 | 13.3% | 22 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.8% | 14 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.6 | 12.2% | 14 |
| rz.HawkOnFire 0.1 | 4.6 | 11.6% | 3 |
| wit.Chuliath 1.0 | 6.6 | 7.0% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.9 | 6.9% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.6 | 6.0% | 0 |
| dans.Cinnamon 1.2 | 9.1 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 76.8 | 4 / 35 | 2862 |
| 2 | 2 | 62.5 | 78.4 | 1 / 35 | 3206 |
| 3 | 2 | 60.0 | 72.7 | 2 / 35 | 2899 |
| 4 | 2 | 60.2 | 71.7 | 4 / 35 | 2909 |
| 5 | 4 | 59.5 | 68.9 | 2 / 35 | 2889 |
| 6 | 2 | 60.0 | 73.3 | 3 / 35 | 2882 |
| 7 | 2 | 62.2 | 77.1 | 5 / 35 | 3172 |
| 8 | 2 | 58.9 | 68.6 | 1 / 35 | 2874 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 55 | 7% |
| gh.mini.Gruwel 0.9 | 13 | 62% |
| rz.HawkOnFire 0.1 | 6 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 3 | 100% |
| myl.nano.KomoriNinja 1.1 | 2 | 50% |

Hadur died in 258 of 280 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 173 | 67% | 179 |
| gh.mini.Gruwel 0.9 | 30 | 12% | 36 |
| rz.HawkOnFire 0.1 | 25 | 10% | 30 |
| dmh.robocode.robot.BlackDeath 9.2 | 13 | 5% | 17 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6 | 2% | 6 |
| myl.nano.KomoriNinja 1.1 | 4 | 2% | 5 |
| wit.Chuliath 1.0 | 3 | 1% | 3 |
| dans.Cinnamon 1.2 | 3 | 1% | 3 |
| stelo.MyAgileRobot 0.2 | 1 | 0% | 1 |

## Melee bench: F36

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 92.9 | 205 / 280 | 1.64 | 20.0% | 37817 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 20.0% | 205 |
| bzdp.Pansy 2.1 | 2.8 | 12.0% | 16 |
| alpha.RainingFire 1.0 | 3.3 | 12.1% | 23 |
| mz.Cork 0.1 | 4.0 | 10.9% | 13 |
| bvh.micro.Freya 0.3 | 4.9 | 10.4% | 15 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.3% | 4 |
| bvh.mini.Fenrir 0.39 | 6.1 | 9.5% | 3 |
| dl.BetterWalls 1.0 | 8.4 | 5.8% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.6 | 5.8% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 93.7 | 25 / 35 | 4844 |
| 2 | 1 | 69.7 | 91.4 | 24 / 35 | 4710 |
| 3 | 1 | 70.4 | 94.3 | 27 / 35 | 4718 |
| 4 | 1 | 69.6 | 91.7 | 23 / 35 | 4912 |
| 5 | 1 | 69.7 | 94.0 | 26 / 35 | 4510 |
| 6 | 1 | 70.2 | 93.3 | 28 / 35 | 4791 |
| 7 | 1 | 70.0 | 94.3 | 28 / 35 | 4535 |
| 8 | 1 | 69.3 | 90.5 | 24 / 35 | 4797 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 53 | 91% |
| bvh.micro.Freya 0.3 | 46 | 85% |
| mz.Cork 0.1 | 43 | 84% |
| bvh.mini.Fenrir 0.39 | 35 | 94% |
| alpha.RainingFire 1.0 | 32 | 69% |
| m3thos.Eva02 0.7.1 | 16 | 94% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 75 of 280 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 23 | 31% | 46 |
| bvh.micro.Freya 0.3 | 14 | 19% | 47 |
| mz.Cork 0.1 | 13 | 17% | 52 |
| bvh.mini.Fenrir 0.39 | 8 | 11% | 23 |
| bzdp.Pansy 2.1 | 7 | 9% | 60 |
| m3thos.Eva02 0.7.1 | 6 | 8% | 25 |
| dl.BetterWalls 1.0 | 2 | 3% | 12 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 8 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 5 |

## Melee bench: F37

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 88.7 | 192 / 280 | 2.02 | 18.5% | 39763 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 18.5% | 192 |
| germ.TheMind .2 | 2.5 | 11.1% | 25 |
| EBBU.Sim2 1.02 | 3.3 | 10.5% | 12 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.1 | 10.0% | 2 |
| agrach.Dalek 1.0 | 4.4 | 9.8% | 19 |
| stelo.UntouchableNano 1.3 | 6.6 | 8.5% | 13 |
| lmk.ACPFinal 0.1 | 7.9 | 8.3% | 5 |
| mb.Beast 0.1 | 8.3 | 7.7% | 7 |
| skm.Ryubot 1.0 | 8.3 | 8.0% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 8.8 | 7.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 88.3 | 24 / 35 | 5215 |
| 2 | 1 | 67.8 | 90.5 | 25 / 35 | 4991 |
| 3 | 1 | 65.8 | 85.4 | 21 / 35 | 4775 |
| 4 | 1 | 68.7 | 93.3 | 27 / 35 | 5181 |
| 5 | 1 | 66.4 | 85.7 | 18 / 35 | 5235 |
| 6 | 1 | 67.8 | 89.2 | 28 / 35 | 4815 |
| 7 | 1 | 67.7 | 90.2 | 25 / 35 | 4979 |
| 8 | 1 | 66.4 | 86.7 | 24 / 35 | 4572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 47 | 77% |
| EBBU.Sim2 1.02 | 33 | 91% |
| skm.Ryubot 1.0 | 27 | 100% |
| agrach.Dalek 1.0 | 26 | 81% |
| com.syncleus.robocode.Dreadnaught 0.1 | 26 | 96% |
| mb.Beast 0.1 | 22 | 95% |
| stelo.UntouchableNano 1.3 | 21 | 76% |
| lmk.ACPFinal 0.1 | 15 | 93% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 89 of 280 rounds, at a mean tick of 525. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 19 | 21% | 51 |
| germ.TheMind .2 | 19 | 21% | 49 |
| com.syncleus.robocode.Dreadnaught 0.1 | 15 | 17% | 46 |
| stelo.UntouchableNano 1.3 | 9 | 10% | 23 |
| EBBU.Sim2 1.02 | 8 | 9% | 31 |
| mb.Beast 0.1 | 6 | 7% | 26 |
| lmk.ACPFinal 0.1 | 6 | 7% | 25 |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 6% | 15 |
| skm.Ryubot 1.0 | 2 | 2% | 12 |

## Melee bench: F38

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 77.1 | 58 / 280 | 3.06 | 14.7% | 28592 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.3 | 16.7% | 122 |
| wompi.Wallaby 5.1 | 2.0 | 14.7% | 58 |
| bvh.mini.Freya 0.55 | 2.8 | 13.3% | 32 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.9 | 11.2% | 16 |
| bts.mega.Gnarly 1.4 | 5.0 | 11.0% | 33 |
| cs.Wren 1.0 | 5.1 | 10.9% | 12 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.6% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.1% | 2 |
| matt.UnderDark3 2.4.34 | 9.1 | 4.1% | 0 |
| bzdp.BoxCar 2.0 | 9.9 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 80.0 | 11 / 35 | 3582 |
| 2 | 2 | 63.5 | 79.7 | 5 / 35 | 3710 |
| 3 | 2 | 60.6 | 72.1 | 3 / 35 | 3312 |
| 4 | 2 | 61.9 | 74.6 | 4 / 35 | 3642 |
| 5 | 2 | 65.1 | 84.4 | 10 / 35 | 3853 |
| 6 | 2 | 63.4 | 79.7 | 9 / 35 | 3725 |
| 7 | 3 | 61.7 | 73.7 | 9 / 35 | 3381 |
| 8 | 2 | 61.4 | 73.0 | 7 / 35 | 3387 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 47 | 21% |
| davidalves.net.DuelistNanoMelee 1.01 | 27 | 63% |
| bvh.mini.Freya 0.55 | 22 | 73% |
| bts.mega.Gnarly 1.4 | 13 | 54% |
| cs.Wren 1.0 | 9 | 67% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 50% |
| matt.UnderDark3 2.4.34 | 1 | 100% |
| kdf.KoulDestroyer 1.0 | 1 | 0% |

Hadur died in 224 of 280 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 92 | 41% | 107 |
| bts.mega.Gnarly 1.4 | 34 | 15% | 45 |
| bvh.mini.Freya 0.55 | 33 | 15% | 36 |
| cs.Wren 1.0 | 28 | 13% | 35 |
| davidalves.net.DuelistNanoMelee 1.01 | 27 | 12% | 44 |
| kdf.KoulDestroyer 1.0 | 6 | 3% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 1% | 3 |
| matt.UnderDark3 2.4.34 | 1 | 0% | 2 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |

## Melee bench: F39

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 80.2 | 83 / 280 | 2.79 | 15.9% | 33338 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 15.9% | 83 |
| bvh.fry.Freya 0.82 | 2.0 | 14.9% | 44 |
| az.Ololobot 0.2.4 | 3.0 | 13.5% | 82 |
| catcat20.Lambda 0.024 | 3.9 | 11.5% | 43 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.7% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 6.1 | 8.9% | 20 |
| gimp.GimpBot 0.1 | 6.9 | 7.9% | 3 |
| apollokidd.ApolloKidd 0.9 | 6.9 | 8.0% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.5 | 5.4% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 86.7 | 12 / 35 | 4682 |
| 2 | 1 | 65.1 | 82.5 | 13 / 35 | 4358 |
| 3 | 1 | 63.2 | 79.0 | 8 / 35 | 4015 |
| 4 | 1 | 64.6 | 80.3 | 11 / 35 | 4205 |
| 5 | 1 | 65.1 | 84.1 | 10 / 35 | 4410 |
| 6 | 3 | 59.1 | 68.3 | 5 / 35 | 3741 |
| 7 | 1 | 64.7 | 82.5 | 13 / 35 | 3862 |
| 8 | 1 | 63.6 | 77.8 | 11 / 35 | 4065 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 56 | 34% |
| bvh.fry.Freya 0.82 | 42 | 64% |
| catcat20.Lambda 0.024 | 26 | 46% |
| stelo.SoRobotNanoMelee 1.2 | 17 | 76% |
| apollokidd.ApolloKidd 0.9 | 7 | 71% |
| gimp.GimpBot 0.1 | 5 | 80% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |

Hadur died in 197 of 280 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 56 | 28% | 82 |
| az.Ololobot 0.2.4 | 53 | 27% | 78 |
| catcat20.Lambda 0.024 | 36 | 18% | 45 |
| stelo.SoRobotNanoMelee 1.2 | 22 | 11% | 28 |
| gimp.GimpBot 0.1 | 13 | 7% | 19 |
| apollokidd.ApolloKidd 0.9 | 9 | 5% | 17 |
| winamp32.micro.MicroMacro 1.0 | 3 | 2% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 3 | 2% | 3 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 1% | 3 |

## Melee bench: F40

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 82.7 | 122 / 280 | 2.56 | 17.0% | 33219 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.1 | 17.0% | 122 |
| kawigi.mini.Coriantumr 1.1 | 1.9 | 15.5% | 75 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 12.4% | 35 |
| Polkwane.SmashMelee 1.0 | 4.4 | 10.6% | 11 |
| mz.AntiGrav 1.0 | 4.8 | 10.7% | 13 |
| stelo.Randomness 1.0 | 6.3 | 8.9% | 19 |
| alpha.BlackIce 1.0 | 6.4 | 8.6% | 3 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.9% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.1 | 5.5% | 2 |
| sample.Corners 1.0 | 9.9 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 82.2 | 14 / 35 | 4104 |
| 2 | 1 | 67.5 | 87.3 | 17 / 35 | 4384 |
| 3 | 1 | 64.2 | 81.6 | 11 / 35 | 3897 |
| 4 | 1 | 65.2 | 79.0 | 14 / 35 | 4072 |
| 5 | 1 | 66.6 | 85.4 | 17 / 35 | 4078 |
| 6 | 1 | 65.9 | 79.7 | 17 / 35 | 4387 |
| 7 | 1 | 66.0 | 83.5 | 14 / 35 | 4101 |
| 8 | 1 | 66.4 | 82.9 | 18 / 35 | 4196 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 66 | 52% |
| kano.gamma.KanoGamma 1.8 | 31 | 77% |
| Polkwane.SmashMelee 1.0 | 27 | 96% |
| mz.AntiGrav 1.0 | 25 | 92% |
| stelo.Randomness 1.0 | 15 | 53% |
| alpha.BlackIce 1.0 | 3 | 100% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 159 of 280 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 68 | 43% | 93 |
| kano.gamma.KanoGamma 1.8 | 32 | 20% | 61 |
| stelo.Randomness 1.0 | 15 | 9% | 28 |
| mz.AntiGrav 1.0 | 14 | 9% | 37 |
| Polkwane.SmashMelee 1.0 | 13 | 8% | 28 |
| alpha.BlackIce 1.0 | 7 | 4% | 11 |
| amk.superstrike.SuperStrike 0.3 | 5 | 3% | 9 |
| testantiswapgun.AntiSwap 1.0 | 3 | 2% | 9 |
| sample.Corners 1.0 | 1 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F41

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 87.3 | 138 / 280 | 2.15 | 17.5% | 31075 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.1 | 17.5% | 138 |
| eem.EvBotNG v12.8 | 1.9 | 16.0% | 95 |
| ary.Swarm 1.1 | 3.5 | 12.9% | 24 |
| lessonz.robocode.Oz 0.5.0 | 3.6 | 12.3% | 14 |
| simonton.nano.MeleeSeed 1.8 | 4.9 | 11.2% | 7 |
| shrub.Silver v048 | 6.0 | 8.8% | 2 |
| zyx.nano.Ant 1.1 | 7.0 | 7.4% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 5.8% | 0 |
| stelo.Mirror 1.1 | 8.8 | 5.2% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 86.7 | 17 / 35 | 4113 |
| 2 | 1 | 67.4 | 87.6 | 19 / 35 | 3699 |
| 3 | 1 | 68.4 | 91.7 | 18 / 35 | 4102 |
| 4 | 1 | 67.1 | 87.6 | 17 / 35 | 3935 |
| 5 | 1 | 67.4 | 85.7 | 21 / 35 | 3854 |
| 6 | 1 | 67.4 | 87.6 | 18 / 35 | 4021 |
| 7 | 1 | 66.5 | 84.8 | 15 / 35 | 3888 |
| 8 | 2 | 66.1 | 86.3 | 13 / 35 | 3463 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 87 | 43% |
| ary.Swarm 1.1 | 47 | 74% |
| lessonz.robocode.Oz 0.5.0 | 33 | 82% |
| simonton.nano.MeleeSeed 1.8 | 32 | 100% |
| stelo.Mirror 1.1 | 6 | 83% |
| shrub.Silver v048 | 3 | 67% |

Hadur died in 143 of 280 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 74 | 52% | 113 |
| ary.Swarm 1.1 | 28 | 20% | 59 |
| lessonz.robocode.Oz 0.5.0 | 18 | 13% | 47 |
| simonton.nano.MeleeSeed 1.8 | 10 | 7% | 35 |
| shrub.Silver v048 | 4 | 3% | 7 |
| zyx.nano.Ant 1.1 | 4 | 3% | 4 |
| stelo.Mirror 1.1 | 2 | 1% | 9 |
| acogdev.alpha 0.2 | 2 | 1% | 2 |
| jsal.Jsalbot 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F42

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 86.1 | 148 / 280 | 2.25 | 17.5% | 35154 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.5% | 148 |
| hadur117.micro.Saor 0.1 | 2.0 | 15.1% | 44 |
| maribo.mini.MiniQuester 0.1 | 3.4 | 13.4% | 39 |
| ara.Shera 0.88 | 3.8 | 12.9% | 36 |
| amz.NanoClone 1.41 | 5.1 | 9.4% | 2 |
| maribo.IotaCT 1.1 | 6.5 | 7.7% | 0 |
| dsw.StaticD 1.0 | 6.5 | 7.6% | 7 |
| stelo.MirrorMicro 1.0 | 8.0 | 6.2% | 3 |
| mme.NikeEnhanced 2.0 | 8.9 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.9 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 89.8 | 20 / 35 | 4796 |
| 2 | 1 | 67.1 | 85.4 | 21 / 35 | 4312 |
| 3 | 1 | 66.4 | 85.1 | 17 / 35 | 4321 |
| 4 | 1 | 67.1 | 84.8 | 20 / 35 | 4633 |
| 5 | 1 | 66.5 | 85.1 | 17 / 35 | 4307 |
| 6 | 1 | 68.3 | 91.4 | 22 / 35 | 4468 |
| 7 | 1 | 66.3 | 84.8 | 18 / 35 | 4280 |
| 8 | 1 | 64.9 | 82.5 | 13 / 35 | 4037 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| hadur117.micro.Saor 0.1 | 70 | 89% |
| maribo.mini.MiniQuester 0.1 | 53 | 66% |
| ara.Shera 0.88 | 47 | 72% |
| dsw.StaticD 1.0 | 10 | 60% |
| amz.NanoClone 1.41 | 6 | 83% |
| stelo.MirrorMicro 1.0 | 3 | 67% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 3 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 132 of 280 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 47 | 36% | 73 |
| maribo.mini.MiniQuester 0.1 | 35 | 27% | 70 |
| hadur117.micro.Saor 0.1 | 30 | 23% | 103 |
| amz.NanoClone 1.41 | 7 | 5% | 12 |
| dsw.StaticD 1.0 | 6 | 5% | 10 |
| maribo.IotaCT 1.1 | 3 | 2% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 2% | 4 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 2 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |

## Melee bench: F43

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 69.0 | 17 / 280 | 3.79 | 12.7% | 24027 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.3% | 234 |
| brainfade.melee.Dusk 0.44 | 2.5 | 12.8% | 17 |
| wompi.Wallaby 5.1 | 2.9 | 12.7% | 17 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.7% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.6% | 5 |
| Krabb.akim2.Akim2 1.1b | 5.9 | 9.7% | 0 |
| mz.NanoGod 2.02 | 7.3 | 7.9% | 1 |
| jab.DiamondStealer 5 | 7.8 | 7.5% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 68.3 | 1 / 35 | 2992 |
| 2 | 3 | 59.5 | 67.0 | 0 / 35 | 2982 |
| 3 | 2 | 63.1 | 77.1 | 5 / 35 | 3213 |
| 4 | 2 | 62.0 | 73.7 | 2 / 35 | 3050 |
| 5 | 5 | 58.3 | 61.6 | 3 / 35 | 2849 |
| 6 | 2 | 61.4 | 71.1 | 4 / 35 | 3028 |
| 7 | 4 | 58.9 | 64.1 | 0 / 35 | 2812 |
| 8 | 3 | 60.4 | 68.9 | 2 / 35 | 3101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 67 | 4% |
| brainfade.melee.Dusk 0.44 | 9 | 78% |
| dummy.micro.Sparrow 2.5 | 6 | 83% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 67% |
| mz.NanoGod 2.02 | 1 | 0% |

Hadur died in 263 of 280 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 173 | 66% | 177 |
| brainfade.melee.Dusk 0.44 | 28 | 11% | 35 |
| dummy.micro.Sparrow 2.5 | 18 | 7% | 19 |
| wcsv.melee.EngineerMelee 0.1 | 17 | 6% | 19 |
| mz.NanoGod 2.02 | 12 | 5% | 14 |
| Krabb.akim2.Akim2 1.1b | 9 | 3% | 9 |
| jab.DiamondStealer 5 | 6 | 2% | 6 |

## Melee bench: F44

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 84.9 | 104 / 280 | 2.36 | 17.3% | 35138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.1 | 17.3% | 104 |
| stelo.Liblix 0.3.1 | 2.0 | 16.2% | 107 |
| tzu.TheArtOfWar 1.2 | 2.9 | 14.7% | 51 |
| wompi.Quokka 1.6 | 4.1 | 10.6% | 7 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.3 | 9.2% | 3 |
| jwirde.Gort 2.0 | 5.6 | 8.9% | 7 |
| disan.Chair 2.2.0 | 7.3 | 7.4% | 1 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.5% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.8% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 84.1 | 13 / 35 | 4050 |
| 2 | 1 | 67.0 | 84.4 | 16 / 35 | 4357 |
| 3 | 1 | 67.3 | 87.3 | 11 / 35 | 4624 |
| 4 | 2 | 67.7 | 87.0 | 14 / 35 | 4583 |
| 5 | 1 | 66.1 | 83.2 | 13 / 35 | 4357 |
| 6 | 1 | 66.5 | 84.4 | 12 / 35 | 4562 |
| 7 | 1 | 67.0 | 86.3 | 15 / 35 | 4405 |
| 8 | 1 | 65.6 | 82.2 | 10 / 35 | 4200 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 99 | 36% |
| tzu.TheArtOfWar 1.2 | 66 | 59% |
| wompi.Quokka 1.6 | 12 | 83% |
| jwirde.Gort 2.0 | 5 | 60% |
| disan.Chair 2.2.0 | 5 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 60% |
| sample.Crazy 1.0 | 4 | 100% |
| amk.jointstrike.JointStrike 0.2 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 177 of 280 rounds, at a mean tick of 913. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 86 | 49% | 126 |
| tzu.TheArtOfWar 1.2 | 54 | 31% | 95 |
| wompi.Quokka 1.6 | 11 | 6% | 19 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 11 | 6% | 12 |
| jwirde.Gort 2.0 | 7 | 4% | 14 |
| disan.Chair 2.2.0 | 3 | 2% | 6 |
| stf.PanzerGeneral 0.1 | 2 | 1% | 4 |
| sample.Crazy 1.0 | 2 | 1% | 3 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 1 |

## Melee bench: F45

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.8 | 119 / 280 | 2.10 | 19.0% | 42199 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 19.0% | 119 |
| eem.IWillFireNoBullet v2.8 | 2.4 | 12.7% | 126 |
| jje.BagPuss 1.2 | 2.9 | 12.0% | 11 |
| sul.Lunar 1.1 | 4.3 | 10.3% | 12 |
| myl.nano.Graviton 1.10 | 4.9 | 9.9% | 3 |
| hvilela.HVilela 0.9 | 6.8 | 8.6% | 0 |
| fm.claire 1.7 | 6.9 | 8.7% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.5% | 5 |
| wit.Deep7 2.0 | 9.0 | 6.2% | 3 |
| abud.ThirdRobo 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 89.5 | 16 / 35 | 5893 |
| 2 | 1 | 68.5 | 87.6 | 15 / 35 | 5342 |
| 3 | 1 | 68.9 | 87.3 | 15 / 35 | 5511 |
| 4 | 1 | 69.1 | 89.2 | 19 / 35 | 5160 |
| 5 | 1 | 68.9 | 89.8 | 14 / 35 | 5408 |
| 6 | 1 | 69.8 | 91.1 | 20 / 35 | 5265 |
| 7 | 1 | 66.7 | 85.4 | 12 / 35 | 4706 |
| 8 | 1 | 66.0 | 82.2 | 8 / 35 | 4914 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 128 | 38% |
| sul.Lunar 1.1 | 36 | 86% |
| jje.BagPuss 1.2 | 17 | 76% |
| myl.nano.Graviton 1.10 | 16 | 81% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 75% |
| wit.Deep7 2.0 | 6 | 83% |
| fm.claire 1.7 | 2 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 161 of 280 rounds, at a mean tick of 1754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 83 | 52% | 0 |
| sul.Lunar 1.1 | 21 | 13% | 90 |
| jje.BagPuss 1.2 | 21 | 13% | 73 |
| myl.nano.Graviton 1.10 | 13 | 8% | 49 |
| hvilela.HVilela 0.9 | 8 | 5% | 12 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 4% | 26 |
| fm.claire 1.7 | 5 | 3% | 14 |
| wit.Deep7 2.0 | 4 | 2% | 12 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |

## Melee bench: F46

wompi.Wallaby 5.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 73.4 | 31 / 280 | 3.40 | 13.8% | 28380 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.0% | 121 |
| rsalesc.melee.Medina 0.4.5 | 2.0 | 16.7% | 105 |
| wompi.Wallaby 5.1 | 3.0 | 13.8% | 31 |
| mz.MicroSheep 1.0 | 4.5 | 10.5% | 4 |
| cx.Princess 1.0 | 5.3 | 9.9% | 16 |
| sadoner.killer 0.2 | 5.5 | 9.5% | 1 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.9% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.5% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 69.5 | 3 / 35 | 3737 |
| 2 | 3 | 60.1 | 68.9 | 3 / 35 | 3313 |
| 3 | 3 | 60.8 | 72.4 | 1 / 35 | 3552 |
| 4 | 3 | 60.6 | 72.4 | 4 / 35 | 3280 |
| 5 | 3 | 63.9 | 80.6 | 7 / 35 | 3730 |
| 6 | 3 | 61.8 | 74.3 | 3 / 35 | 3652 |
| 7 | 3 | 61.9 | 75.2 | 5 / 35 | 3599 |
| 8 | 3 | 61.6 | 73.7 | 5 / 35 | 3517 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 50 | 30% |
| rsalesc.melee.Medina 0.4.5 | 24 | 21% |
| mz.MicroSheep 1.0 | 9 | 78% |
| cx.Princess 1.0 | 7 | 43% |
| arthord.NanoSatanMelee Beta | 1 | 0% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 249 of 280 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 129 | 52% | 144 |
| rsalesc.melee.Medina 0.4.5 | 71 | 29% | 75 |
| mz.MicroSheep 1.0 | 14 | 6% | 19 |
| cx.Princess 1.0 | 14 | 6% | 17 |
| arthord.NanoSatanMelee Beta | 12 | 5% | 13 |
| sadoner.killer 0.2 | 7 | 3% | 10 |
| kurios.DOSexe .9a | 2 | 1% | 2 |

