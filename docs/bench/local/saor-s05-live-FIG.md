# Bench suite: suite.txt

## Melee bench: F01

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 70.6 | 33 / 280 | 3.65 | 14.4% | 36460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.3% | 193 |
| kc.micro.Figment 1.0 | 2.0 | 14.4% | 33 |
| sgp.JollyNinja 3.53 | 3.6 | 11.8% | 26 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 11.2% | 4 |
| mz.MicroGodMelee 1 | 4.9 | 10.7% | 16 |
| lorneswork.Predator 1.0 | 5.3 | 10.5% | 6 |
| adt.Ar2 1.0 | 7.1 | 7.4% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.4% | 0 |
| skm.butterfly 1.0 | 8.6 | 5.0% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 72.4 | 5 / 35 | 5095 |
| 2 | 2 | 62.9 | 68.9 | 6 / 35 | 4728 |
| 3 | 2 | 64.0 | 74.3 | 5 / 35 | 4901 |
| 4 | 2 | 60.9 | 67.6 | 1 / 35 | 4155 |
| 5 | 2 | 64.5 | 79.0 | 4 / 35 | 4521 |
| 6 | 2 | 60.5 | 65.1 | 5 / 35 | 4232 |
| 7 | 2 | 61.6 | 70.5 | 3 / 35 | 4571 |
| 8 | 2 | 61.0 | 66.7 | 4 / 35 | 4257 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 101 | 4% |
| sgp.JollyNinja 3.53 | 17 | 71% |
| mz.MicroGodMelee 1 | 14 | 43% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 83% |
| lorneswork.Predator 1.0 | 6 | 67% |
| skm.butterfly 1.0 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 247 of 280 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 143 | 58% | 149 |
| mz.MicroGodMelee 1 | 27 | 11% | 35 |
| sgp.JollyNinja 3.53 | 22 | 9% | 28 |
| lorneswork.Predator 1.0 | 19 | 8% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 7% | 23 |
| adt.Ar2 1.0 | 8 | 3% | 12 |
| kawigi.sbf.FloodSonnet 0.9 | 6 | 2% | 6 |
| skm.butterfly 1.0 | 3 | 1% | 3 |
| mym.EdgeStalker 1.0 | 1 | 0% | 1 |

## Melee bench: F02

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 79.9 | 117 / 280 | 2.81 | 17.8% | 42133 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.8% | 117 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.4 | 13.6% | 55 |
| pulsar.PulsarMax 0.8.9 | 2.8 | 13.2% | 53 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.9% | 5 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.1 | 9.4% | 10 |
| fnc.bandit.Bandit 5.2.0 | 6.1 | 8.6% | 6 |
| sch.Simone 0.3d | 7.4 | 7.9% | 16 |
| Noran.BitchingElk 0.054 | 7.9 | 7.3% | 13 |
| stelo.PatternRobot 1.0 | 8.8 | 6.1% | 4 |
| fullsail.SweetTea 1.1 | 9.6 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 74.3 | 14 / 35 | 5052 |
| 2 | 1 | 68.4 | 85.4 | 18 / 35 | 5307 |
| 3 | 1 | 65.9 | 80.0 | 15 / 35 | 4749 |
| 4 | 1 | 65.9 | 75.9 | 13 / 35 | 5282 |
| 5 | 1 | 66.9 | 79.0 | 16 / 35 | 5234 |
| 6 | 1 | 68.5 | 85.1 | 15 / 35 | 5646 |
| 7 | 1 | 67.1 | 80.0 | 15 / 35 | 5456 |
| 8 | 1 | 66.4 | 79.7 | 11 / 35 | 5407 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 62 | 47% |
| pulsar.PulsarMax 0.8.9 | 52 | 46% |
| lrem.micro.SpikeSoldier 0.4 | 18 | 94% |
| Noran.BitchingElk 0.054 | 17 | 71% |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 85% |
| stelo.PatternRobot 1.0 | 10 | 90% |
| sch.Simone 0.3d | 9 | 56% |
| fullsail.SweetTea 1.1 | 5 | 100% |
| fnc.bandit.Bandit 5.2.0 | 5 | 100% |

Hadur died in 164 of 280 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 53 | 32% | 73 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 51 | 31% | 85 |
| lrem.micro.SpikeSoldier 0.4 | 18 | 11% | 29 |
| sch.Simone 0.3d | 11 | 7% | 18 |
| stelo.PatternRobot 1.0 | 8 | 5% | 15 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 4% | 24 |
| Noran.BitchingElk 0.054 | 7 | 4% | 18 |
| fnc.bandit.Bandit 5.2.0 | 6 | 4% | 10 |
| fullsail.SweetTea 1.1 | 3 | 2% | 8 |

## Melee bench: F03

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 77.5 | 159 / 280 | 3.03 | 17.5% | 44108 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.1 | 17.5% | 159 |
| radnor.DoctorBob 1.42 | 1.9 | 14.6% | 48 |
| kawigi.nano.Lib 1.0 | 3.6 | 12.6% | 28 |
| vuen.Cake 2.51 | 3.6 | 12.5% | 32 |
| urdos.URDOS 1.3 | 4.8 | 9.8% | 10 |
| adt.Ar1 2.1 | 6.8 | 7.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 7.4% | 0 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.9% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 6.2% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 72.1 | 15 / 35 | 5098 |
| 2 | 2 | 63.1 | 66.7 | 17 / 35 | 5087 |
| 3 | 1 | 66.7 | 77.8 | 17 / 35 | 5940 |
| 4 | 1 | 65.6 | 74.6 | 19 / 35 | 5316 |
| 5 | 1 | 68.0 | 84.1 | 24 / 35 | 5278 |
| 6 | 1 | 67.0 | 80.6 | 24 / 35 | 5253 |
| 7 | 1 | 69.5 | 85.4 | 24 / 35 | 6198 |
| 8 | 1 | 67.1 | 78.4 | 19 / 35 | 5938 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 60 | 88% |
| radnor.DoctorBob 1.42 | 54 | 85% |
| kawigi.nano.Lib 1.0 | 52 | 90% |
| oa.weak.FlyMk1 0.1 | 6 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 100% |
| urdos.URDOS 1.3 | 3 | 67% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |

Hadur died in 122 of 280 rounds, at a mean tick of 500. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 38 | 31% | 80 |
| bwbaugh.nano.Tirunculus 0.0.0a | 23 | 19% | 24 |
| kawigi.nano.Lib 1.0 | 20 | 16% | 67 |
| vuen.Cake 2.51 | 15 | 12% | 61 |
| urdos.URDOS 1.3 | 11 | 9% | 15 |
| ghent.ArthurPanzergon 1.0.0 | 5 | 4% | 7 |
| adt.Ar1 2.1 | 4 | 3% | 4 |
| oa.weak.FlyMk1 0.1 | 3 | 2% | 15 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 2% | 6 |

## Melee bench: F04

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 73.3 | 6 / 280 | 3.41 | 15.4% | 43719 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.9% | 255 |
| kc.micro.Figment 1.0 | 2.0 | 15.4% | 6 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.3% | 14 |
| TNT.TNT 0.99.1 | 4.0 | 10.9% | 4 |
| josago.Jorgito 0.16 | 5.0 | 9.1% | 1 |
| tj.zombie1n 1.0.1 | 6.5 | 6.8% | 0 |
| css.Delitioner 0.11 | 6.6 | 6.8% | 0 |
| rampancy.Durandal 2.1d | 7.9 | 5.7% | 0 |
| spin.Bugstard 0.012b | 9.4 | 4.0% | 0 |
| sp.Nanos.Ember 1.1 | 9.6 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.9 | 82.5 | 4 / 35 | 5896 |
| 2 | 2 | 65.5 | 74.0 | 0 / 35 | 5689 |
| 3 | 2 | 63.2 | 67.6 | 0 / 35 | 5237 |
| 4 | 2 | 62.8 | 67.6 | 1 / 35 | 5100 |
| 5 | 2 | 65.9 | 76.8 | 1 / 35 | 5558 |
| 6 | 2 | 66.1 | 77.8 | 0 / 35 | 5644 |
| 7 | 2 | 63.6 | 70.2 | 0 / 35 | 5158 |
| 8 | 2 | 64.1 | 69.5 | 0 / 35 | 5437 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 115 | 2% |
| TNT.TNT 0.99.1 | 5 | 60% |
| apc.LeeroyJenkins2 1.0 | 3 | 0% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 274 of 280 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 208 | 76% | 210 |
| apc.LeeroyJenkins2 1.0 | 24 | 9% | 25 |
| josago.Jorgito 0.16 | 15 | 5% | 15 |
| css.Delitioner 0.11 | 9 | 3% | 10 |
| TNT.TNT 0.99.1 | 8 | 3% | 11 |
| tj.zombie1n 1.0.1 | 5 | 2% | 4 |
| sp.Nanos.Ember 1.1 | 3 | 1% | 3 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |

## Melee bench: F05

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 57.3 | 11 / 280 | 4.84 | 11.9% | 31461 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.5% | 149 |
| justin.DemonicRage 3.4 | 2.0 | 17.4% | 88 |
| wompi.Numbat 2.1 | 3.4 | 12.8% | 24 |
| kc.micro.Figment 1.0 | 3.6 | 11.9% | 11 |
| axeBots.HataMoto 3.09 | 5.3 | 9.4% | 5 |
| ms.Ares 0.19 | 5.9 | 8.7% | 3 |
| supersample.SuperBoxBot 1.0 | 7.0 | 6.5% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.3 | 5.4% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 8.9 | 5.0% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.1 | 54.9 | 0 / 35 | 4072 |
| 2 | 3 | 59.7 | 62.9 | 3 / 35 | 4077 |
| 3 | 4 | 56.9 | 55.9 | 1 / 35 | 3883 |
| 4 | 4 | 55.5 | 50.2 | 0 / 35 | 3884 |
| 5 | 4 | 57.8 | 56.8 | 0 / 35 | 4162 |
| 6 | 4 | 54.0 | 48.9 | 1 / 35 | 3473 |
| 7 | 3 | 60.7 | 65.1 | 4 / 35 | 4171 |
| 8 | 3 | 58.8 | 63.8 | 2 / 35 | 3739 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 21 | 10% |
| cb.fire.Firestarter 2.0f | 20 | 5% |
| wompi.Numbat 2.1 | 10 | 70% |
| axeBots.HataMoto 3.09 | 2 | 50% |
| ms.Ares 0.19 | 1 | 0% |

Hadur died in 269 of 280 rounds, at a mean tick of 617. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 105 | 39% | 107 |
| cb.fire.Firestarter 2.0f | 71 | 26% | 72 |
| wompi.Numbat 2.1 | 37 | 14% | 44 |
| supersample.SuperBoxBot 1.0 | 20 | 7% | 20 |
| ms.Ares 0.19 | 14 | 5% | 14 |
| axeBots.HataMoto 3.09 | 11 | 4% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 7 | 3% | 7 |
| GarmBox.Oranges 1.0 | 3 | 1% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 0% | 1 |

## Melee bench: F06

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 78.2 | 134 / 280 | 2.96 | 17.0% | 36902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.0% | 134 |
| jekl.StoneGhost 0.7 | 2.1 | 14.6% | 39 |
| origin.SleepSiphon 1.7b | 3.4 | 13.2% | 72 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.9 | 11.7% | 13 |
| mld.Wisdom 1.0 | 4.6 | 11.2% | 8 |
| gg.Wolverine 2.0 | 6.0 | 8.7% | 8 |
| DBall.NUKE 0.1 | 7.5 | 7.2% | 2 |
| spinnercat.Omen 1.0 | 7.6 | 7.1% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.9 | 6.1% | 3 |
| sample.Fire 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 72.4 | 16 / 35 | 4768 |
| 2 | 1 | 64.7 | 74.9 | 15 / 35 | 4390 |
| 3 | 1 | 64.7 | 74.9 | 14 / 35 | 4374 |
| 4 | 1 | 69.4 | 89.2 | 20 / 35 | 5133 |
| 5 | 1 | 65.8 | 78.1 | 18 / 35 | 4294 |
| 6 | 1 | 65.8 | 81.3 | 18 / 35 | 4280 |
| 7 | 1 | 66.9 | 80.6 | 16 / 35 | 4811 |
| 8 | 1 | 65.8 | 74.0 | 17 / 35 | 4852 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 65 | 89% |
| origin.SleepSiphon 1.7b | 48 | 35% |
| pe.minimelee.SandboxMiniMelee 1.1 | 41 | 90% |
| gg.Wolverine 2.0 | 13 | 54% |
| mld.Wisdom 1.0 | 10 | 80% |
| DBall.NUKE 0.1 | 4 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 67% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 146 of 280 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 50 | 34% | 79 |
| mld.Wisdom 1.0 | 36 | 25% | 44 |
| jekl.StoneGhost 0.7 | 23 | 16% | 62 |
| pe.minimelee.SandboxMiniMelee 1.1 | 16 | 11% | 54 |
| gg.Wolverine 2.0 | 12 | 8% | 22 |
| DBall.NUKE 0.1 | 4 | 3% | 9 |
| sample.Fire 1.0 | 2 | 1% | 4 |
| spinnercat.Omen 1.0 | 2 | 1% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 3 |

## Melee bench: F07

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 84.3 | 87 / 280 | 2.41 | 18.5% | 49797 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 18.5% | 87 |
| rsalesc.melee.Monk 0.3.6c | 1.8 | 17.4% | 85 |
| rtk.Tachikoma 1.0 | 2.8 | 16.3% | 77 |
| franzor.Lizt 1.3.1 | 4.1 | 11.0% | 19 |
| oog.melee.CapuletDroid 1.1 | 5.3 | 9.7% | 11 |
| lrem.micro.MoggFanatic 0.2 | 5.9 | 8.5% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.8% | 1 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.5% | 0 |
| sample.Target 1.0 | 9.4 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 9.6 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.3 | 82.5 | 9 / 35 | 6003 |
| 2 | 1 | 69.5 | 85.1 | 10 / 35 | 6487 |
| 3 | 1 | 69.8 | 86.0 | 13 / 35 | 6147 |
| 4 | 3 | 66.9 | 75.6 | 7 / 35 | 5621 |
| 5 | 1 | 70.7 | 89.2 | 15 / 35 | 6196 |
| 6 | 2 | 69.1 | 84.4 | 10 / 35 | 5908 |
| 7 | 1 | 70.1 | 86.3 | 10 / 35 | 6585 |
| 8 | 1 | 70.4 | 85.4 | 13 / 35 | 6850 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 102 | 39% |
| rsalesc.melee.Monk 0.3.6c | 51 | 6% |
| oog.melee.CapuletDroid 1.1 | 33 | 88% |
| franzor.Lizt 1.3.1 | 25 | 56% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 194 of 280 rounds, at a mean tick of 1240. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 78 | 40% | 131 |
| rsalesc.melee.Monk 0.3.6c | 74 | 38% | 93 |
| oog.melee.CapuletDroid 1.1 | 18 | 9% | 31 |
| franzor.Lizt 1.3.1 | 13 | 7% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6 | 3% | 8 |
| exauge.GateKeeper 1.1.121g | 4 | 2% | 9 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 77.9 | 125 / 280 | 2.99 | 17.7% | 43698 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.7% | 125 |
| tm.Yuugao 1.0 | 2.0 | 13.4% | 75 |
| shrub.Vapour v159 | 3.4 | 11.5% | 28 |
| Krabb.sliNk.Garm 0.9u | 4.1 | 10.8% | 20 |
| com.spp.robocode.MostlyHarmless 010 | 4.9 | 10.3% | 15 |
| jwst.DAD.DarkAndDarker 1.1 | 6.3 | 9.0% | 12 |
| m3thos.Eva00 1.1 | 6.4 | 9.0% | 3 |
| qualidafial.MajorDick 1.0.1 | 8.4 | 6.9% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 5.8% | 0 |
| SHAM.WOW 1.4 | 9.6 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 78.1 | 15 / 35 | 6041 |
| 2 | 1 | 68.0 | 82.2 | 16 / 35 | 5852 |
| 3 | 1 | 67.6 | 80.6 | 19 / 35 | 5531 |
| 4 | 1 | 65.3 | 74.3 | 13 / 35 | 5469 |
| 5 | 1 | 65.5 | 75.9 | 14 / 35 | 5214 |
| 6 | 1 | 65.9 | 76.8 | 16 / 35 | 4919 |
| 7 | 1 | 67.3 | 80.3 | 16 / 35 | 5303 |
| 8 | 1 | 65.6 | 75.2 | 16 / 35 | 5369 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 59 | 36% |
| Krabb.sliNk.Garm 0.9u | 33 | 82% |
| shrub.Vapour v159 | 32 | 78% |
| jwst.DAD.DarkAndDarker 1.1 | 23 | 91% |
| com.spp.robocode.MostlyHarmless 010 | 19 | 74% |
| m3thos.Eva00 1.1 | 9 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 156 of 280 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 68 | 44% | 101 |
| Krabb.sliNk.Garm 0.9u | 17 | 11% | 37 |
| com.spp.robocode.MostlyHarmless 010 | 15 | 10% | 35 |
| shrub.Vapour v159 | 13 | 8% | 35 |
| m3thos.Eva00 1.1 | 12 | 8% | 17 |
| SHAM.WOW 1.4 | 12 | 8% | 14 |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 6% | 27 |
| zyx.nano.BacillusComma 1.0 | 6 | 4% | 8 |
| qualidafial.MajorDick 1.0.1 | 4 | 3% | 6 |

## Melee bench: F09

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 8 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 63.0 | 50 / 280 | 4.33 | 13.6% | 32620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 16.6% | 130 |
| kc.micro.Figment 1.0 | 2.3 | 13.6% | 50 |
| hadur117.micro.Saor 0.2 | 2.8 | 13.2% | 40 |
| pedersen.Grishnakh 1.0 | 4.1 | 11.2% | 23 |
| mc2.enemy.Original 0.9 | 5.3 | 10.1% | 28 |
| yagami.Tidus 0.11 | 5.5 | 10.2% | 1 |
| dft.Calliope 5.6 | 7.0 | 8.1% | 6 |
| step.nanoPri 1.0 | 8.5 | 5.9% | 2 |
| robar.nano.Assertive_Melee 0.2 | 8.9 | 5.6% | 0 |
| rdm.Dueler 0.4x | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 65.7 | 9 / 35 | 3799 |
| 2 | 1 | 63.5 | 71.1 | 8 / 35 | 4902 |
| 3 | 2 | 61.9 | 71.1 | 7 / 35 | 4089 |
| 4 | 4 | 55.1 | 49.8 | 5 / 35 | 3689 |
| 5 | 1 | 63.0 | 70.8 | 9 / 35 | 4383 |
| 6 | 2 | 59.8 | 64.1 | 5 / 35 | 3907 |
| 7 | 2 | 59.0 | 60.3 | 4 / 35 | 4093 |
| 8 | 4 | 55.5 | 51.1 | 3 / 35 | 3758 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 43 | 7% |
| hadur117.micro.Saor 0.2 | 42 | 52% |
| mc2.enemy.Original 0.9 | 13 | 31% |
| yagami.Tidus 0.11 | 13 | 92% |
| pedersen.Grishnakh 1.0 | 11 | 64% |
| dft.Calliope 5.6 | 3 | 67% |

Hadur died in 230 of 280 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 92 | 40% | 95 |
| hadur117.micro.Saor 0.2 | 76 | 33% | 104 |
| yagami.Tidus 0.11 | 14 | 6% | 22 |
| mc2.enemy.Original 0.9 | 14 | 6% | 18 |
| pedersen.Grishnakh 1.0 | 11 | 5% | 13 |
| robar.nano.Assertive_Melee 0.2 | 9 | 4% | 9 |
| rdm.Dueler 0.4x | 8 | 3% | 9 |
| step.nanoPri 1.0 | 4 | 2% | 4 |
| dft.Calliope 5.6 | 2 | 1% | 5 |

## Melee bench: F10

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 83.8 | 137 / 280 | 2.46 | 18.1% | 44424 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 18.1% | 137 |
| DTF.Kludgy 1.2b | 2.1 | 15.1% | 80 |
| ne.Chimera 1.2 | 3.1 | 12.5% | 19 |
| ejb.Polaris 1.0.1 | 4.0 | 11.9% | 24 |
| vStar.RAFzilla 2.15 | 5.0 | 10.9% | 13 |
| tvv.micro.Antares 1.1.1 | 5.8 | 10.2% | 5 |
| kurios.DOSexe .9b | 8.0 | 5.6% | 1 |
| sam.Samspin 1.0 | 8.3 | 5.6% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.4 | 5.5% | 0 |
| donjezza.Muncho 1.0 | 9.4 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 88.6 | 21 / 35 | 5492 |
| 2 | 1 | 67.3 | 81.6 | 14 / 35 | 5773 |
| 3 | 1 | 69.4 | 88.6 | 20 / 35 | 5528 |
| 4 | 1 | 66.6 | 80.6 | 18 / 35 | 5320 |
| 5 | 1 | 67.5 | 82.5 | 16 / 35 | 5583 |
| 6 | 1 | 67.8 | 84.4 | 17 / 35 | 5336 |
| 7 | 1 | 68.0 | 83.5 | 16 / 35 | 5821 |
| 8 | 1 | 66.8 | 80.3 | 15 / 35 | 5571 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 64 | 31% |
| ejb.Polaris 1.0.1 | 48 | 75% |
| ne.Chimera 1.2 | 34 | 85% |
| vStar.RAFzilla 2.15 | 22 | 100% |
| tvv.micro.Antares 1.1.1 | 17 | 100% |
| donjezza.Muncho 1.0 | 7 | 100% |
| kurios.DOSexe .9b | 5 | 80% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 144 of 280 rounds, at a mean tick of 789. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 87 | 60% | 105 |
| ejb.Polaris 1.0.1 | 20 | 14% | 57 |
| ne.Chimera 1.2 | 20 | 14% | 50 |
| vStar.RAFzilla 2.15 | 5 | 3% | 27 |
| tvv.micro.Antares 1.1.1 | 4 | 3% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 2% | 4 |
| kurios.DOSexe .9b | 2 | 1% | 10 |
| sam.Samspin 1.0 | 2 | 1% | 2 |
| donjezza.Muncho 1.0 | 1 | 1% | 8 |

## Melee bench: F11

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 71.9 | 67 / 280 | 3.53 | 15.3% | 35785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.1 | 17.7% | 137 |
| kc.micro.Figment 1.0 | 1.9 | 15.3% | 67 |
| cx.mini.Nimrod 0.55 | 3.3 | 12.1% | 28 |
| djc.DynaBot 0.1.1 | 4.3 | 10.6% | 10 |
| br2.MobyDickBot 1.6 | 5.6 | 9.3% | 15 |
| rdt199.Warlord 0.73 | 5.9 | 8.8% | 17 |
| KiraNL.Chupacabra 0.4 | 6.9 | 7.9% | 1 |
| uji.YellohFellah 1.0 | 7.1 | 7.8% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 9.4 | 5.7% | 0 |
| stelo.MirrorNano 1.3 | 9.6 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 66.3 | 8 / 35 | 4752 |
| 2 | 2 | 62.3 | 66.7 | 6 / 35 | 4827 |
| 3 | 2 | 64.0 | 76.5 | 9 / 35 | 4458 |
| 4 | 1 | 62.9 | 73.3 | 10 / 35 | 4089 |
| 5 | 2 | 62.1 | 69.2 | 8 / 35 | 4141 |
| 6 | 2 | 64.5 | 74.9 | 13 / 35 | 4587 |
| 7 | 2 | 63.7 | 72.7 | 8 / 35 | 4621 |
| 8 | 2 | 63.6 | 75.9 | 5 / 35 | 4310 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 83 | 18% |
| cx.mini.Nimrod 0.55 | 20 | 65% |
| rdt199.Warlord 0.73 | 16 | 69% |
| djc.DynaBot 0.1.1 | 15 | 93% |
| br2.MobyDickBot 1.6 | 10 | 80% |
| uji.YellohFellah 1.0 | 8 | 63% |
| KiraNL.Chupacabra 0.4 | 2 | 50% |

Hadur died in 214 of 280 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 114 | 53% | 129 |
| cx.mini.Nimrod 0.55 | 31 | 14% | 44 |
| rdt199.Warlord 0.73 | 19 | 9% | 26 |
| KiraNL.Chupacabra 0.4 | 19 | 9% | 22 |
| uji.YellohFellah 1.0 | 7 | 3% | 15 |
| djc.DynaBot 0.1.1 | 6 | 3% | 21 |
| br2.MobyDickBot 1.6 | 6 | 3% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 3% | 6 |
| stelo.MirrorNano 1.3 | 6 | 3% | 6 |

## Melee bench: F12

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 77.9 | 116 / 280 | 2.99 | 16.5% | 31915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 16.5% | 116 |
| bts.wiki.RipCurl 0.9b | 2.3 | 14.1% | 58 |
| nat.PallasHawk 1.0 | 2.8 | 13.8% | 54 |
| darkcanuck.Leon 1.01 | 4.0 | 11.8% | 23 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.4% | 22 |
| jrm.Test0 1.0 | 6.0 | 8.4% | 2 |
| jp.Perpy 16.0 | 7.5 | 6.9% | 2 |
| cs.sheldor.Talon 1.1 | 7.8 | 6.7% | 1 |
| jaybot.bots.Oddball 4.0 | 9.1 | 5.6% | 2 |
| stuff.Vlad 0.1 | 9.6 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 82.9 | 18 / 35 | 4135 |
| 2 | 1 | 67.7 | 86.3 | 17 / 35 | 4486 |
| 3 | 1 | 63.6 | 75.6 | 15 / 35 | 3538 |
| 4 | 1 | 63.9 | 72.7 | 13 / 35 | 4121 |
| 5 | 1 | 63.5 | 75.2 | 12 / 35 | 3670 |
| 6 | 1 | 64.6 | 76.8 | 12 / 35 | 4172 |
| 7 | 1 | 66.0 | 83.2 | 15 / 35 | 3776 |
| 8 | 1 | 63.4 | 70.8 | 14 / 35 | 4017 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 54 | 61% |
| nat.PallasHawk 1.0 | 51 | 69% |
| darkcanuck.Leon 1.01 | 28 | 89% |
| brainfade.melee.Genghis 0.36 | 18 | 61% |
| jp.Perpy 16.0 | 5 | 100% |
| jrm.Test0 1.0 | 3 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 164 of 280 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 50 | 30% | 82 |
| nat.PallasHawk 1.0 | 36 | 22% | 66 |
| darkcanuck.Leon 1.01 | 25 | 15% | 62 |
| brainfade.melee.Genghis 0.36 | 23 | 14% | 29 |
| jrm.Test0 1.0 | 12 | 7% | 13 |
| cs.sheldor.Talon 1.1 | 11 | 7% | 14 |
| jp.Perpy 16.0 | 5 | 3% | 8 |
| jaybot.bots.Oddball 4.0 | 2 | 1% | 6 |

## Melee bench: F13

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 63.3 | 17 / 280 | 4.30 | 12.7% | 31699 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.4 | 16.9% | 132 |
| ags.Glacier 0.2.11 | 1.6 | 16.8% | 81 |
| kc.micro.Figment 1.0 | 3.4 | 12.7% | 17 |
| shinh.Entangled 0.3 | 4.3 | 12.2% | 27 |
| gh.micro.Gruweltje 0.7 | 4.4 | 12.0% | 20 |
| apc.Colossus2 0.17 | 6.1 | 8.3% | 1 |
| stelo.Wang 1.0 | 7.0 | 7.0% | 1 |
| ayk.WallHugger 1.0 | 8.4 | 5.3% | 1 |
| maribo.FollowFire 1 | 8.6 | 5.1% | 0 |
| sample.Tracker 1.0 | 9.9 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.9 | 64.1 | 1 / 35 | 3759 |
| 2 | 3 | 59.9 | 64.8 | 1 / 35 | 4090 |
| 3 | 4 | 57.6 | 57.8 | 3 / 35 | 3915 |
| 4 | 3 | 61.5 | 69.8 | 3 / 35 | 4145 |
| 5 | 4 | 58.8 | 62.5 | 2 / 35 | 3828 |
| 6 | 3 | 60.4 | 66.0 | 3 / 35 | 4073 |
| 7 | 3 | 59.0 | 60.6 | 2 / 35 | 3923 |
| 8 | 4 | 58.4 | 61.0 | 2 / 35 | 3966 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 42 | 17% |
| ags.Glacier 0.2.11 | 21 | 19% |
| shinh.Entangled 0.3 | 7 | 14% |
| gh.micro.Gruweltje 0.7 | 6 | 33% |
| stelo.Wang 1.0 | 2 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 263 of 280 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 89 | 34% | 92 |
| mn.Combat 3.25.0 | 85 | 32% | 91 |
| shinh.Entangled 0.3 | 38 | 14% | 39 |
| gh.micro.Gruweltje 0.7 | 15 | 6% | 21 |
| maribo.FollowFire 1 | 14 | 5% | 14 |
| stelo.Wang 1.0 | 12 | 5% | 13 |
| apc.Colossus2 0.17 | 4 | 2% | 5 |
| ayk.WallHugger 1.0 | 4 | 2% | 3 |
| sample.Tracker 1.0 | 2 | 1% | 2 |

## Melee bench: F14

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 74.9 | 159 / 280 | 3.26 | 17.1% | 41262 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.1% | 159 |
| simonton.micro.Sprout 1.1.3 | 2.1 | 14.7% | 31 |
| catcat20.shape.Theta 0.018 | 2.9 | 12.9% | 62 |
| Lo_Ian.Gandalf_V4 4.0 | 5.1 | 10.0% | 3 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 9.8% | 7 |
| co.edu.usb.rc.LidisTron 1.0 | 5.8 | 9.6% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.5% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.6 | 8.1% | 12 |
| pa.Improved 1.0 | 9.0 | 5.8% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 80.6 | 23 / 35 | 4835 |
| 2 | 1 | 69.4 | 84.4 | 22 / 35 | 5851 |
| 3 | 1 | 65.6 | 72.7 | 19 / 35 | 5235 |
| 4 | 1 | 66.2 | 73.0 | 18 / 35 | 5110 |
| 5 | 1 | 65.1 | 71.1 | 20 / 35 | 4900 |
| 6 | 1 | 66.3 | 74.6 | 20 / 35 | 5107 |
| 7 | 1 | 65.8 | 73.3 | 19 / 35 | 5268 |
| 8 | 1 | 64.4 | 69.5 | 18 / 35 | 4956 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 101 | 89% |
| catcat20.shape.Theta 0.018 | 51 | 67% |
| co.edu.usb.rc.LidisTron 1.0 | 15 | 93% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 6 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |

Hadur died in 121 of 280 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 47 | 39% | 144 |
| catcat20.shape.Theta 0.018 | 28 | 23% | 54 |
| co.edu.usb.rc.LidisTron 1.0 | 13 | 11% | 22 |
| dmh.robocode.robot.RedDwarf 0.4 | 11 | 9% | 16 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 8% | 17 |
| sanyi.mikrobi.Roberto 1.0 | 6 | 5% | 14 |
| pa.Improved 1.0 | 3 | 2% | 4 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 1% | 3 |

## Melee bench: F15

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 83.7 | 153 / 280 | 2.47 | 19.2% | 47068 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 19.2% | 153 |
| emp.Yngwie 1.11 | 2.6 | 13.1% | 62 |
| kawigi.micro.Shiz 1.1 | 2.8 | 12.9% | 21 |
| mld.DustBunny 3.8 | 3.6 | 11.8% | 10 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.5% | 10 |
| kawigi.robot.Girl 1.2 | 5.6 | 9.3% | 21 |
| lambdaxy.TBot 0.1 | 7.5 | 6.9% | 0 |
| Grystrion.TrackerWO 1.0 | 7.5 | 7.1% | 1 |
| divineomega.TrialBot 0.003 | 9.3 | 5.3% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.6 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 79.4 | 19 / 35 | 6042 |
| 2 | 1 | 68.9 | 83.8 | 20 / 35 | 5814 |
| 3 | 1 | 71.6 | 93.3 | 22 / 35 | 6136 |
| 4 | 1 | 67.5 | 77.1 | 18 / 35 | 5816 |
| 5 | 1 | 68.2 | 82.9 | 17 / 35 | 5578 |
| 6 | 1 | 68.4 | 82.2 | 19 / 35 | 5781 |
| 7 | 1 | 69.7 | 89.8 | 19 / 35 | 5753 |
| 8 | 1 | 68.5 | 81.0 | 19 / 35 | 6148 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 67 | 55% |
| kawigi.micro.Shiz 1.1 | 57 | 89% |
| mld.DustBunny 3.8 | 29 | 97% |
| cb.nano.Insomnia 1.0 | 23 | 87% |
| kawigi.robot.Girl 1.2 | 20 | 60% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |
| divineomega.TrialBot 0.003 | 1 | 100% |

Hadur died in 127 of 280 rounds, at a mean tick of 1024. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 56 | 44% | 115 |
| cb.nano.Insomnia 1.0 | 18 | 14% | 18 |
| kawigi.micro.Shiz 1.1 | 16 | 13% | 53 |
| kawigi.robot.Girl 1.2 | 12 | 9% | 21 |
| mld.DustBunny 3.8 | 9 | 7% | 39 |
| Grystrion.TrackerWO 1.0 | 8 | 6% | 13 |
| lambdaxy.TBot 0.1 | 4 | 3% | 4 |
| divineomega.TrialBot 0.003 | 2 | 2% | 13 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 2% | 2 |

## Melee bench: F16

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.1 | 98 / 280 | 2.34 | 18.9% | 47329 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 18.9% | 98 |
| gh.Griezel 0.5.2 | 2.0 | 16.6% | 109 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.3% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.8% | 48 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.0% | 7 |
| bvh.fnr.Fenrir 0.36l | 5.6 | 8.9% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 7.6% | 1 |
| divineomega.DivineBot 1.9.4.5 | 8.6 | 5.2% | 8 |
| repositorio.NanoStep 1.0 | 8.6 | 5.4% | 0 |
| asd.Cthulhu 1.3 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 86.7 | 11 / 35 | 6072 |
| 2 | 1 | 70.9 | 89.8 | 17 / 35 | 6531 |
| 3 | 1 | 67.6 | 82.2 | 9 / 35 | 5827 |
| 4 | 1 | 69.1 | 86.0 | 14 / 35 | 5788 |
| 5 | 1 | 69.7 | 87.0 | 17 / 35 | 6029 |
| 6 | 1 | 66.7 | 79.7 | 9 / 35 | 5376 |
| 7 | 1 | 67.8 | 82.2 | 9 / 35 | 5733 |
| 8 | 1 | 69.5 | 87.3 | 12 / 35 | 5973 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 110 | 24% |
| techdude.forest.FlamingForest 1.1 | 49 | 43% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 31 | 90% |
| bvh.fnr.Fenrir 0.36l | 12 | 92% |
| tvv.nano.Polaris 1.2 | 7 | 86% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |
| divineomega.DivineBot 1.9.4.5 | 3 | 67% |

Hadur died in 182 of 280 rounds, at a mean tick of 1502. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 106 | 58% | 140 |
| techdude.forest.FlamingForest 1.1 | 33 | 18% | 55 |
| stelo.IntrinsicVolatility 1.4 | 12 | 7% | 17 |
| bvh.fnr.Fenrir 0.36l | 11 | 6% | 15 |
| tvv.nano.Polaris 1.2 | 8 | 4% | 17 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 7 | 4% | 27 |
| divineomega.DivineBot 1.9.4.5 | 3 | 2% | 6 |
| asd.Cthulhu 1.3 | 2 | 1% | 2 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |

## Melee bench: F17

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 80.5 | 131 / 280 | 2.76 | 17.7% | 40300 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.7% | 131 |
| et.Predator 1.8 | 3.0 | 12.9% | 30 |
| oog.melee.Mercutio 1.0 | 3.0 | 12.9% | 40 |
| cx.BlestPain 1.41 | 4.0 | 12.0% | 53 |
| nic.Nicator 2.4 | 4.9 | 10.8% | 14 |
| ahf.NanoAndrew .4 | 5.3 | 10.6% | 11 |
| maribo.melee.BMV 0.1 | 6.9 | 8.9% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.6% | 0 |
| tex.Longbot 0.4 | 8.5 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 86.3 | 17 / 35 | 4901 |
| 2 | 1 | 67.9 | 84.1 | 18 / 35 | 4970 |
| 3 | 1 | 68.0 | 83.2 | 18 / 35 | 5144 |
| 4 | 1 | 65.4 | 74.6 | 13 / 35 | 4892 |
| 5 | 1 | 66.7 | 78.7 | 19 / 35 | 4993 |
| 6 | 1 | 66.9 | 79.4 | 17 / 35 | 4979 |
| 7 | 1 | 68.5 | 82.5 | 15 / 35 | 5899 |
| 8 | 1 | 65.1 | 74.9 | 14 / 35 | 4522 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 59 | 83% |
| oog.melee.Mercutio 1.0 | 48 | 81% |
| cx.BlestPain 1.41 | 37 | 24% |
| nic.Nicator 2.4 | 23 | 57% |
| ahf.NanoAndrew .4 | 14 | 93% |
| maribo.melee.BMV 0.1 | 7 | 100% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 149 of 280 rounds, at a mean tick of 1020. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 44 | 30% | 55 |
| et.Predator 1.8 | 27 | 18% | 73 |
| oog.melee.Mercutio 1.0 | 25 | 17% | 65 |
| nic.Nicator 2.4 | 20 | 13% | 33 |
| ahf.NanoAndrew .4 | 17 | 11% | 31 |
| maribo.melee.BMV 0.1 | 11 | 7% | 16 |
| goblin.Bender 2.4 | 2 | 1% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 1% | 2 |
| tex.Longbot 0.4 | 1 | 1% | 1 |

## Melee bench: F18

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 83.3 | 154 / 280 | 2.50 | 18.1% | 37608 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 18.1% | 154 |
| morbid.MorbidPriest 1.0 | 2.5 | 12.6% | 36 |
| agd.Mooserwirt2 2.7 | 2.9 | 12.2% | 39 |
| uji.DBH 1.1 | 4.3 | 10.9% | 23 |
| spinnercat.Robovirus 2.718 | 5.3 | 9.8% | 4 |
| ratosh.Nobo 0.21 | 5.3 | 10.0% | 6 |
| sigterm.Sigterm 1.0 | 7.1 | 8.3% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.2% | 3 |
| stelo.WangRobot 1.0 | 9.3 | 5.5% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 83.8 | 23 / 35 | 4860 |
| 2 | 1 | 68.7 | 87.9 | 22 / 35 | 4923 |
| 3 | 1 | 67.2 | 82.9 | 18 / 35 | 4747 |
| 4 | 1 | 65.3 | 78.4 | 20 / 35 | 4361 |
| 5 | 1 | 68.0 | 88.3 | 19 / 35 | 4629 |
| 6 | 1 | 65.5 | 80.6 | 14 / 35 | 4509 |
| 7 | 1 | 67.1 | 83.5 | 17 / 35 | 4680 |
| 8 | 1 | 67.3 | 81.3 | 21 / 35 | 4899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 49 | 73% |
| agd.Mooserwirt2 2.7 | 40 | 50% |
| uji.DBH 1.1 | 33 | 85% |
| spinnercat.Robovirus 2.718 | 26 | 100% |
| sigterm.Sigterm 1.0 | 22 | 82% |
| ratosh.Nobo 0.21 | 13 | 85% |
| stelo.WangRobot 1.0 | 10 | 90% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 83% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 126 of 280 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 35 | 28% | 79 |
| agd.Mooserwirt2 2.7 | 35 | 28% | 68 |
| uji.DBH 1.1 | 13 | 10% | 24 |
| kawigi.mini.Fhqwhgads 1.1 | 11 | 9% | 21 |
| ratosh.Nobo 0.21 | 9 | 7% | 21 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8 | 6% | 11 |
| spinnercat.Robovirus 2.718 | 6 | 5% | 23 |
| sigterm.Sigterm 1.0 | 5 | 4% | 19 |
| stelo.WangRobot 1.0 | 4 | 3% | 14 |

## Melee bench: F19

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 93.5 | 232 / 280 | 1.59 | 21.5% | 49016 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 21.5% | 232 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.4% | 18 |
| mld.Infinity 2.2 | 2.8 | 13.2% | 22 |
| erdnis.Rover 0.3 | 4.5 | 10.6% | 0 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 10.7% | 5 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.7% | 0 |
| pac.ABC 2.1 | 7.6 | 7.1% | 3 |
| mbh.Mbh 0.1 | 8.0 | 6.7% | 0 |
| pbg.R2D2 1.0 | 8.4 | 5.8% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 90.8 | 29 / 35 | 5834 |
| 2 | 1 | 72.2 | 96.2 | 31 / 35 | 5341 |
| 3 | 1 | 72.5 | 95.2 | 28 / 35 | 6323 |
| 4 | 1 | 73.0 | 94.6 | 30 / 35 | 6472 |
| 5 | 1 | 72.9 | 92.7 | 30 / 35 | 6658 |
| 6 | 1 | 71.5 | 89.8 | 27 / 35 | 5835 |
| 7 | 1 | 73.5 | 98.4 | 31 / 35 | 6298 |
| 8 | 1 | 71.8 | 89.8 | 26 / 35 | 6255 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 124 | 94% |
| mld.Infinity 2.2 | 82 | 87% |
| patson.PatsonTestBot 1.0 | 14 | 100% |
| krillr.mini.JointStrike 2.0.0 | 13 | 77% |
| erdnis.Rover 0.3 | 8 | 100% |
| pbg.R2D2 1.0 | 6 | 100% |
| pac.ABC 2.1 | 6 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 48 of 280 rounds, at a mean tick of 1166. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 17 | 35% | 30 |
| davidalves.net.DuelistMiniMelee 1.2 | 13 | 27% | 133 |
| krillr.mini.JointStrike 2.0.0 | 8 | 17% | 44 |
| erdnis.Rover 0.3 | 4 | 8% | 20 |
| patson.PatsonTestBot 1.0 | 2 | 4% | 20 |
| pac.ABC 2.1 | 2 | 4% | 7 |
| mbh.Mbh 0.1 | 1 | 2% | 12 |
| pbg.R2D2 1.0 | 1 | 2% | 11 |

## Melee bench: F20

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.7 | 127 / 280 | 2.20 | 19.1% | 45377 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 19.1% | 127 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.7% | 61 |
| fwb.Nine 1.0.1 | 3.1 | 12.3% | 54 |
| nz.jdc.nano.GridFu 1.0 | 4.4 | 10.5% | 5 |
| catcat20.Rabbit 0.001 | 4.6 | 10.1% | 30 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.0% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.3 | 7.1% | 0 |
| bayen.nut.Squirrel 1.615 | 7.5 | 7.1% | 2 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 85.7 | 15 / 35 | 5854 |
| 2 | 1 | 66.7 | 81.3 | 14 / 35 | 4990 |
| 3 | 1 | 68.5 | 85.4 | 13 / 35 | 5742 |
| 4 | 1 | 70.1 | 92.7 | 19 / 35 | 5743 |
| 5 | 1 | 70.2 | 90.2 | 20 / 35 | 5803 |
| 6 | 1 | 68.1 | 85.1 | 16 / 35 | 5432 |
| 7 | 1 | 69.6 | 88.3 | 15 / 35 | 5913 |
| 8 | 1 | 68.9 | 85.1 | 15 / 35 | 5900 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 103 | 65% |
| fwb.Nine 1.0.1 | 55 | 31% |
| catcat20.Rabbit 0.001 | 26 | 42% |
| nz.jdc.nano.GridFu 1.0 | 13 | 85% |
| bayen.nut.Squirrel 1.615 | 10 | 100% |
| djdjdj.NanoSkunk10 1.0 | 7 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 155 of 280 rounds, at a mean tick of 1366. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 64 | 41% | 131 |
| fwb.Nine 1.0.1 | 47 | 30% | 15 |
| catcat20.Rabbit 0.001 | 27 | 17% | 52 |
| nz.jdc.nano.GridFu 1.0 | 9 | 6% | 33 |
| djdjdj.NanoSkunk10 1.0 | 3 | 2% | 14 |
| bayen.nut.Squirrel 1.615 | 3 | 2% | 14 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 3 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 8 |

## Melee bench: F21

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.1 | 137 / 280 | 2.34 | 18.9% | 44458 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 18.9% | 137 |
| eem.EvBot v4.6.16 | 2.0 | 16.7% | 113 |
| dummy.mini.Scimitar 1.01 | 3.1 | 13.5% | 9 |
| cf.RiO.RiOx 4.2.1 | 3.9 | 11.9% | 6 |
| eld.Hmm 1.0 | 5.3 | 8.3% | 11 |
| oa.weak.BotherBot 0.1 | 5.8 | 8.0% | 3 |
| fire219.CatBot 1.0 | 7.5 | 6.4% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.0% | 1 |
| PSW.Relentless 0.1 | 8.6 | 5.9% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 84.4 | 17 / 35 | 5360 |
| 2 | 1 | 66.5 | 74.6 | 16 / 35 | 5194 |
| 3 | 1 | 69.4 | 85.7 | 17 / 35 | 5643 |
| 4 | 1 | 69.1 | 85.4 | 16 / 35 | 5669 |
| 5 | 1 | 69.8 | 88.6 | 19 / 35 | 5761 |
| 6 | 1 | 67.2 | 80.6 | 11 / 35 | 5306 |
| 7 | 1 | 70.9 | 91.7 | 20 / 35 | 6046 |
| 8 | 1 | 69.9 | 89.8 | 21 / 35 | 5479 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 129 | 45% |
| dummy.mini.Scimitar 1.01 | 40 | 93% |
| cf.RiO.RiOx 4.2.1 | 29 | 97% |
| eld.Hmm 1.0 | 11 | 73% |
| oa.weak.BotherBot 0.1 | 5 | 80% |
| PSW.Relentless 0.1 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 0% |

Hadur died in 143 of 280 rounds, at a mean tick of 1133. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 94 | 66% | 146 |
| dummy.mini.Scimitar 1.01 | 15 | 10% | 51 |
| cf.RiO.RiOx 4.2.1 | 9 | 6% | 31 |
| PSW.Relentless 0.1 | 8 | 6% | 11 |
| eld.Hmm 1.0 | 5 | 3% | 23 |
| oa.weak.BotherBot 0.1 | 5 | 3% | 9 |
| fire219.CatBot 1.0 | 5 | 3% | 6 |
| el.JumpShoot 0.2 | 2 | 1% | 2 |

## Melee bench: F23

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 81.7 | 115 / 280 | 2.64 | 18.6% | 46823 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 18.6% | 115 |
| pe.SandboxLump 1.52 | 1.8 | 17.1% | 108 |
| cre.Karolos 0.32 | 3.1 | 13.7% | 30 |
| stelo.AreaTargetingBot 1.1 | 4.4 | 10.3% | 13 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.1 | 9.9% | 6 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 9.4% | 7 |
| cw.megas.Blade 0.8 | 7.0 | 8.5% | 0 |
| sample.Walls 1.0 | 7.9 | 7.4% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.7% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 78.7 | 16 / 35 | 5836 |
| 2 | 1 | 69.7 | 81.9 | 19 / 35 | 5901 |
| 3 | 1 | 68.3 | 78.1 | 10 / 35 | 5808 |
| 4 | 2 | 67.9 | 80.0 | 11 / 35 | 5395 |
| 5 | 1 | 70.0 | 83.5 | 13 / 35 | 6302 |
| 6 | 2 | 65.8 | 73.0 | 8 / 35 | 5189 |
| 7 | 1 | 71.1 | 90.5 | 20 / 35 | 6254 |
| 8 | 1 | 71.3 | 88.3 | 18 / 35 | 6138 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 108 | 46% |
| cre.Karolos 0.32 | 39 | 67% |
| stelo.AreaTargetingBot 1.1 | 31 | 84% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 89% |
| stelo.RamTrackSurfer 1.2 | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 165 of 280 rounds, at a mean tick of 722. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 82 | 50% | 133 |
| cre.Karolos 0.32 | 47 | 28% | 77 |
| stelo.AreaTargetingBot 1.1 | 14 | 8% | 31 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 5% | 14 |
| sample.Walls 1.0 | 7 | 4% | 9 |
| cw.megas.Blade 0.8 | 4 | 2% | 6 |
| stelo.RamTrackSurfer 1.2 | 2 | 1% | 8 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 73.8 | 72 / 280 | 3.35 | 15.1% | 32325 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.1 | 15.1% | 72 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.1% | 60 |
| florent.XSeries.X2 0.12 | 3.3 | 13.6% | 63 |
| davidalves.Phoenix 0.54 | 3.5 | 12.5% | 47 |
| pedersen.Ugluk 1.1.1 | 4.9 | 10.9% | 22 |
| oog.melee.Corsair 1.0 | 6.0 | 9.0% | 7 |
| stelo.SoJNanoMelee 1.1 | 7.5 | 7.4% | 8 |
| lunchie.Lunchbox 0.93 | 8.1 | 6.6% | 0 |
| as.FrankTheTank 1.3 | 8.9 | 5.6% | 3 |
| evd.X1 0.01 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 73.7 | 7 / 35 | 3992 |
| 2 | 1 | 65.4 | 81.0 | 10 / 35 | 4262 |
| 3 | 1 | 60.8 | 69.2 | 7 / 35 | 3890 |
| 4 | 1 | 64.6 | 80.6 | 10 / 35 | 4254 |
| 5 | 1 | 62.5 | 70.2 | 12 / 35 | 3977 |
| 6 | 1 | 61.0 | 67.6 | 12 / 35 | 3740 |
| 7 | 2 | 60.8 | 71.4 | 4 / 35 | 3792 |
| 8 | 1 | 64.2 | 77.1 | 10 / 35 | 4418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 43 | 42% |
| davidalves.Phoenix 0.54 | 34 | 65% |
| florent.XSeries.X2 0.12 | 28 | 18% |
| pedersen.Ugluk 1.1.1 | 19 | 42% |
| stelo.SoJNanoMelee 1.1 | 13 | 92% |
| oog.melee.Corsair 1.0 | 5 | 60% |
| lunchie.Lunchbox 0.93 | 3 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 210 of 280 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 70 | 33% | 84 |
| rz.GlowBlowMelee 1.4 | 51 | 24% | 72 |
| davidalves.Phoenix 0.54 | 33 | 16% | 45 |
| pedersen.Ugluk 1.1.1 | 21 | 10% | 28 |
| oog.melee.Corsair 1.0 | 13 | 6% | 22 |
| stelo.SoJNanoMelee 1.1 | 8 | 4% | 11 |
| evd.X1 0.01 | 6 | 3% | 7 |
| lunchie.Lunchbox 0.93 | 3 | 1% | 7 |
| as.FrankTheTank 1.3 | 3 | 1% | 4 |
2 death(s) with no robot to name.

## Melee bench: F25

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.8 | 180 / 280 | 2.37 | 18.5% | 34505 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 18.5% | 180 |
| voidious.mini.BrokenSword 2.0.3 | 2.1 | 13.4% | 30 |
| voidious.micro.BlitzBat 1.05 | 3.4 | 12.0% | 12 |
| jdw.Hurricane 1.4 | 3.6 | 11.4% | 27 |
| gre.svman4.Morfeas 1.4.1 | 5.4 | 9.6% | 10 |
| ds.Oo 2.2 | 5.8 | 9.6% | 14 |
| awesomeness.Elite 1.0 | 7.4 | 7.5% | 1 |
| gjr.Cephalosporin 0.1 | 7.6 | 7.2% | 3 |
| adt.Ar2 1.1 | 8.8 | 6.4% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 79.0 | 19 / 35 | 4037 |
| 2 | 1 | 68.4 | 84.8 | 22 / 35 | 4513 |
| 3 | 1 | 65.3 | 76.2 | 18 / 35 | 4234 |
| 4 | 1 | 69.6 | 89.5 | 26 / 35 | 4582 |
| 5 | 1 | 67.7 | 85.1 | 22 / 35 | 4202 |
| 6 | 1 | 68.8 | 89.8 | 24 / 35 | 4308 |
| 7 | 1 | 69.1 | 89.2 | 25 / 35 | 4411 |
| 8 | 1 | 67.9 | 84.8 | 24 / 35 | 4218 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 65 | 86% |
| voidious.micro.BlitzBat 1.05 | 60 | 98% |
| jdw.Hurricane 1.4 | 38 | 74% |
| ds.Oo 2.2 | 14 | 71% |
| gjr.Cephalosporin 0.1 | 10 | 90% |
| gre.svman4.Morfeas 1.4.1 | 9 | 78% |
| awesomeness.Elite 1.0 | 6 | 100% |
| adt.Ar2 1.1 | 4 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 101 of 280 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 34 | 34% | 64 |
| voidious.mini.BrokenSword 2.0.3 | 25 | 25% | 73 |
| voidious.micro.BlitzBat 1.05 | 15 | 15% | 60 |
| ds.Oo 2.2 | 9 | 9% | 25 |
| awesomeness.Elite 1.0 | 7 | 7% | 13 |
| gre.svman4.Morfeas 1.4.1 | 6 | 6% | 18 |
| adt.Ar2 1.1 | 4 | 4% | 8 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 17 |
| amk.ChumbaMini 0.2 | 0 | 0% | 2 |

## Melee bench: F26

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.5 | 113 / 280 | 2.58 | 17.7% | 43968 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.7% | 113 |
| ak.Fermat 2.0 | 2.0 | 15.7% | 81 |
| lrem.Spectre 0.4.4 | 3.3 | 12.2% | 27 |
| shu.nitro.LENIN .T34 | 4.0 | 11.7% | 44 |
| js.PinBall 1.6 | 4.8 | 11.0% | 10 |
| jaybot.adv.bots.JayBot 2.0 | 6.5 | 8.9% | 2 |
| gh.mini.GrubbmOne 1.0 | 6.6 | 9.3% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.6% | 1 |
| sample.SpinBot 1.0 | 8.9 | 5.1% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 88.9 | 13 / 35 | 5576 |
| 2 | 1 | 65.4 | 73.0 | 12 / 35 | 5448 |
| 3 | 1 | 65.9 | 78.1 | 12 / 35 | 5122 |
| 4 | 1 | 67.3 | 80.6 | 13 / 35 | 5470 |
| 5 | 1 | 67.7 | 82.9 | 12 / 35 | 5780 |
| 6 | 1 | 70.0 | 88.9 | 18 / 35 | 6217 |
| 7 | 1 | 67.0 | 81.0 | 15 / 35 | 5090 |
| 8 | 1 | 68.4 | 86.7 | 18 / 35 | 5265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 67 | 37% |
| shu.nitro.LENIN .T34 | 48 | 50% |
| lrem.Spectre 0.4.4 | 40 | 70% |
| js.PinBall 1.6 | 17 | 65% |
| jaybot.adv.bots.JayBot 2.0 | 11 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 7 | 86% |
| gh.mini.GrubbmOne 1.0 | 5 | 100% |
| sample.SpinBot 1.0 | 3 | 100% |

Hadur died in 169 of 280 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 74 | 44% | 102 |
| shu.nitro.LENIN .T34 | 35 | 21% | 65 |
| lrem.Spectre 0.4.4 | 25 | 15% | 43 |
| js.PinBall 1.6 | 19 | 11% | 31 |
| fullsail.LaxativeTeaTwo 1.0 | 8 | 5% | 15 |
| sample.SpinBot 1.0 | 4 | 2% | 7 |
| jaybot.adv.bots.JayBot 2.0 | 2 | 1% | 9 |
| gh.mini.GrubbmOne 1.0 | 2 | 1% | 7 |

## Melee bench: F27

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 81.6 | 164 / 280 | 2.65 | 17.8% | 36761 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.8% | 164 |
| mk.Alpha 0.2.1 | 2.4 | 13.8% | 65 |
| wee.Gem 1.8.4 | 3.8 | 10.8% | 25 |
| EH.Eagle 1.0.6 | 4.5 | 9.9% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 4.6 | 10.2% | 9 |
| throxbot.ThroxBot 0.1 | 6.5 | 9.0% | 4 |
| joe.ADinosaur 1.0 | 6.9 | 8.3% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 7.4 | 7.9% | 3 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.8% | 3 |
| cs.Grudge 1.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 85.4 | 23 / 35 | 4720 |
| 2 | 1 | 66.1 | 80.6 | 20 / 35 | 4383 |
| 3 | 1 | 65.7 | 78.7 | 19 / 35 | 4554 |
| 4 | 1 | 66.6 | 83.8 | 19 / 35 | 4226 |
| 5 | 1 | 68.8 | 87.0 | 24 / 35 | 4834 |
| 6 | 1 | 67.7 | 84.4 | 21 / 35 | 4619 |
| 7 | 1 | 65.1 | 75.2 | 17 / 35 | 4672 |
| 8 | 1 | 65.9 | 77.8 | 21 / 35 | 4753 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 83 | 67% |
| wee.Gem 1.8.4 | 36 | 97% |
| EH.Eagle 1.0.6 | 30 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 23 | 96% |
| throxbot.ThroxBot 0.1 | 8 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 83% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| joe.ADinosaur 1.0 | 4 | 100% |

Hadur died in 119 of 280 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 51 | 43% | 110 |
| joe.ADinosaur 1.0 | 19 | 16% | 27 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 11% | 37 |
| caimano.Furia_Ceca 0.22 | 9 | 8% | 10 |
| throxbot.ThroxBot 0.1 | 8 | 7% | 16 |
| techdude.kombat.FlamingKombat 1.5 | 8 | 7% | 11 |
| wee.Gem 1.8.4 | 6 | 5% | 36 |
| EH.Eagle 1.0.6 | 3 | 3% | 28 |
| cs.Grudge 1.0 | 2 | 2% | 3 |

## Melee bench: F28

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 82.8 | 159 / 280 | 2.55 | 17.8% | 34114 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.8% | 159 |
| kid.test.NightFox .2 | 2.0 | 14.6% | 39 |
| uji.Antique 1.0 | 3.6 | 11.6% | 35 |
| qohnil.blot.BlotBot 3.61 | 3.8 | 11.5% | 35 |
| pfvicm.Sobieski 7.2.3b | 4.6 | 10.6% | 6 |
| amk.ChumbaWumba 0.3 | 6.6 | 8.2% | 2 |
| ahr.ice.Ice 1.0.2 | 6.6 | 7.9% | 3 |
| matt.advanced.Katana 1.0 | 8.0 | 6.8% | 3 |
| stelo.PianistNano 1.2 | 9.1 | 5.8% | 0 |
| stelo.Lifestealer 1.0 | 9.6 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 87.3 | 20 / 35 | 4680 |
| 2 | 1 | 65.4 | 77.1 | 12 / 35 | 4268 |
| 3 | 1 | 67.8 | 85.1 | 25 / 35 | 4295 |
| 4 | 1 | 64.6 | 75.2 | 18 / 35 | 4032 |
| 5 | 1 | 68.5 | 91.1 | 24 / 35 | 3882 |
| 6 | 1 | 64.0 | 73.7 | 16 / 35 | 4193 |
| 7 | 1 | 69.1 | 89.2 | 21 / 35 | 4576 |
| 8 | 1 | 67.0 | 83.8 | 23 / 35 | 4188 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 104 | 85% |
| uji.Antique 1.0 | 41 | 73% |
| qohnil.blot.BlotBot 3.61 | 26 | 42% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| amk.ChumbaWumba 0.3 | 7 | 100% |
| ahr.ice.Ice 1.0.2 | 7 | 86% |
| matt.advanced.Katana 1.0 | 6 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |

Hadur died in 122 of 280 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 27 | 22% | 92 |
| uji.Antique 1.0 | 27 | 22% | 66 |
| qohnil.blot.BlotBot 3.61 | 24 | 20% | 41 |
| amk.ChumbaWumba 0.3 | 16 | 13% | 20 |
| pfvicm.Sobieski 7.2.3b | 13 | 11% | 23 |
| stelo.Lifestealer 1.0 | 6 | 5% | 8 |
| ahr.ice.Ice 1.0.2 | 4 | 3% | 10 |
| matt.advanced.Katana 1.0 | 2 | 2% | 13 |
| stelo.PianistNano 1.2 | 2 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F29

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 79.0 | 87 / 280 | 2.89 | 17.2% | 38631 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.1 | 17.2% | 87 |
| zyx.mega.YersiniaPestis 3.1 | 2.0 | 15.8% | 99 |
| deewiant.Anomaly 0.2 | 3.1 | 13.6% | 61 |
| myl.micro.Troodon 1.10 | 3.9 | 11.7% | 12 |
| jok.PheonixM 0.1.2 | 4.9 | 10.3% | 12 |
| ph.melee.ArcherME 0.3 | 6.1 | 8.3% | 0 |
| DBall.Anarchy 0.1 | 6.9 | 7.2% | 7 |
| fullsail.TimbotNoPrediction 1.0 | 8.3 | 6.0% | 0 |
| ap.Frederick 1.1 | 9.1 | 5.4% | 1 |
| jangs.ns51 1.0 | 9.6 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 78.4 | 11 / 35 | 4775 |
| 2 | 1 | 67.4 | 81.9 | 11 / 35 | 4957 |
| 3 | 2 | 65.4 | 76.2 | 7 / 35 | 4771 |
| 4 | 1 | 69.4 | 87.9 | 18 / 35 | 5054 |
| 5 | 1 | 68.1 | 85.1 | 13 / 35 | 5125 |
| 6 | 1 | 65.0 | 75.9 | 11 / 35 | 4349 |
| 7 | 1 | 65.3 | 73.3 | 11 / 35 | 4737 |
| 8 | 1 | 64.6 | 73.7 | 5 / 35 | 4863 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 62 | 39% |
| zyx.mega.YersiniaPestis 3.1 | 57 | 23% |
| myl.micro.Troodon 1.10 | 24 | 92% |
| jok.PheonixM 0.1.2 | 14 | 86% |
| ap.Frederick 1.1 | 6 | 100% |
| DBall.Anarchy 0.1 | 5 | 100% |
| ph.melee.ArcherME 0.3 | 3 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 193 of 280 rounds, at a mean tick of 989. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 73 | 38% | 104 |
| zyx.mega.YersiniaPestis 3.1 | 71 | 37% | 82 |
| jok.PheonixM 0.1.2 | 19 | 10% | 32 |
| myl.micro.Troodon 1.10 | 11 | 6% | 28 |
| ph.melee.ArcherME 0.3 | 8 | 4% | 15 |
| DBall.Anarchy 0.1 | 4 | 2% | 9 |
| jangs.ns51 1.0 | 4 | 2% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 2% | 4 |

## Melee bench: F30

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 61.9 | 40 / 280 | 4.43 | 13.0% | 32559 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 2.1 | 13.4% | 73 |
| catcat20.Matcha 0.006 | 2.6 | 13.8% | 67 |
| stelo.PastFuture 2.3.2 | 3.0 | 12.8% | 36 |
| kc.micro.Figment 1.0 | 3.0 | 13.0% | 40 |
| oog.melee.Capulet 1.2 | 4.3 | 11.9% | 41 |
| intruder.PrairieWolf 2.61 | 6.6 | 8.7% | 10 |
| ntc.Opposite 1.5 | 7.1 | 8.1% | 0 |
| tripphippy.Alice 1.1 | 7.8 | 7.9% | 5 |
| fowl3628800.LightningBolt 2.6.0 | 8.5 | 7.4% | 8 |
| GarmBox.Anger 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.4 | 57.5 | 5 / 35 | 3936 |
| 2 | 4 | 55.8 | 53.0 | 2 / 35 | 4087 |
| 3 | 2 | 60.1 | 64.1 | 9 / 35 | 4036 |
| 4 | 4 | 58.9 | 61.3 | 2 / 35 | 4153 |
| 5 | 3 | 58.3 | 60.3 | 3 / 35 | 4063 |
| 6 | 3 | 58.7 | 62.9 | 5 / 35 | 4022 |
| 7 | 1 | 60.6 | 66.7 | 8 / 35 | 4073 |
| 8 | 2 | 61.1 | 69.2 | 6 / 35 | 4189 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 22 | 18% |
| stelo.PastFuture 2.3.2 | 18 | 56% |
| oog.melee.Capulet 1.2 | 17 | 59% |
| darkcanuck.B26354 1.06 | 17 | 35% |
| intruder.PrairieWolf 2.61 | 4 | 75% |
| tripphippy.Alice 1.1 | 4 | 50% |
| ntc.Opposite 1.5 | 3 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |

Hadur died in 240 of 280 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 72 | 30% | 75 |
| oog.melee.Capulet 1.2 | 45 | 19% | 58 |
| stelo.PastFuture 2.3.2 | 39 | 16% | 49 |
| darkcanuck.B26354 1.06 | 39 | 16% | 46 |
| tripphippy.Alice 1.1 | 15 | 6% | 16 |
| intruder.PrairieWolf 2.61 | 9 | 4% | 13 |
| ntc.Opposite 1.5 | 9 | 4% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 7 | 3% | 8 |
| GarmBox.Anger 1.0 | 5 | 2% | 5 |

## Melee bench: F31

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 67.9 | 40 / 280 | 3.89 | 13.7% | 29428 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.4% | 159 |
| kc.micro.Figment 1.0 | 2.3 | 13.7% | 40 |
| gh.mini.Griezel 0.2 | 2.9 | 13.0% | 56 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.2% | 6 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 10.9% | 11 |
| gh.nano.Grofvuil 0.2 | 5.9 | 8.9% | 4 |
| timmit.nano.TimDog 0.33 | 7.8 | 6.7% | 2 |
| fm.mammillarias 1.3 | 7.8 | 6.9% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.4% | 2 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 72.1 | 4 / 35 | 4167 |
| 2 | 2 | 59.3 | 65.1 | 7 / 35 | 3485 |
| 3 | 2 | 61.0 | 68.9 | 4 / 35 | 3675 |
| 4 | 2 | 59.2 | 65.1 | 4 / 35 | 3621 |
| 5 | 3 | 59.1 | 61.3 | 8 / 35 | 3662 |
| 6 | 3 | 59.1 | 68.3 | 2 / 35 | 3138 |
| 7 | 2 | 63.6 | 72.4 | 9 / 35 | 4077 |
| 8 | 2 | 60.5 | 70.2 | 2 / 35 | 3603 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 54 | 4% |
| gh.mini.Griezel 0.2 | 29 | 28% |
| d414.nano.Quantum 1.0.0 | 16 | 88% |
| spinnercat.micro.Tyger 0.1 | 9 | 78% |
| gh.nano.Grofvuil 0.2 | 7 | 86% |
| timmit.nano.TimDog 0.33 | 1 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |

Hadur died in 240 of 280 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 121 | 50% | 125 |
| gh.mini.Griezel 0.2 | 43 | 18% | 54 |
| spinnercat.micro.Tyger 0.1 | 19 | 8% | 24 |
| gh.nano.Grofvuil 0.2 | 16 | 7% | 21 |
| d414.nano.Quantum 1.0.0 | 15 | 6% | 28 |
| timmit.nano.TimDog 0.33 | 12 | 5% | 14 |
| Gecko.ultimateGeckoBot 1.0 | 6 | 3% | 6 |
| fm.mammillarias 1.3 | 4 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 4 | 2% | 3 |

## Melee bench: F32

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 78.0 | 101 / 280 | 2.98 | 16.4% | 37187 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.4 | 16.4% | 101 |
| kawigi.sbf.FloodHT 0.9.2 | 1.6 | 15.8% | 111 |
| apc.botM 3.0 | 3.4 | 12.3% | 32 |
| vjik.UnViolation 1.1 | 4.3 | 10.8% | 13 |
| lxx.ConceptA 0.8 | 4.6 | 10.5% | 4 |
| bayen.UbaMicro 1.4 | 5.8 | 8.9% | 4 |
| yk.JahMicro 1.0 | 7.4 | 7.1% | 9 |
| panzer.Panzer 0.2 | 8.3 | 6.6% | 0 |
| conscience.Electron 1.3g | 8.4 | 6.5% | 3 |
| donjezza.Jezza 1.0 | 10.0 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 85.1 | 13 / 35 | 4922 |
| 2 | 2 | 63.7 | 74.9 | 11 / 35 | 4744 |
| 3 | 2 | 64.1 | 76.8 | 11 / 35 | 4382 |
| 4 | 1 | 64.7 | 77.8 | 12 / 35 | 4693 |
| 5 | 2 | 61.9 | 71.7 | 10 / 35 | 3998 |
| 6 | 1 | 64.9 | 76.8 | 12 / 35 | 5098 |
| 7 | 1 | 66.2 | 81.9 | 17 / 35 | 4370 |
| 8 | 1 | 66.1 | 78.7 | 15 / 35 | 4980 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 94 | 24% |
| apc.botM 3.0 | 29 | 79% |
| lxx.ConceptA 0.8 | 28 | 93% |
| vjik.UnViolation 1.1 | 14 | 93% |
| bayen.UbaMicro 1.4 | 8 | 75% |
| yk.JahMicro 1.0 | 6 | 67% |
| panzer.Panzer 0.2 | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 50% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 179 of 280 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 92 | 51% | 116 |
| lxx.ConceptA 0.8 | 26 | 15% | 38 |
| apc.botM 3.0 | 19 | 11% | 47 |
| vjik.UnViolation 1.1 | 13 | 7% | 36 |
| bayen.UbaMicro 1.4 | 9 | 5% | 15 |
| conscience.Electron 1.3g | 7 | 4% | 10 |
| panzer.Panzer 0.2 | 6 | 3% | 7 |
| yk.JahMicro 1.0 | 5 | 3% | 7 |
| donjezza.Jezza 1.0 | 2 | 1% | 4 |

## Melee bench: F33

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 83.4 | 158 / 280 | 2.50 | 18.9% | 42098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 18.9% | 158 |
| maribo.Quester 0.3 | 2.0 | 15.3% | 51 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.7% | 23 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 10.9% | 22 |
| labg.Cataclysm 2.05 | 4.9 | 10.3% | 18 |
| baal.nano.N 1.42 | 6.3 | 9.0% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.6 | 8.6% | 5 |
| zyx.micro.Ant 1.1 | 8.1 | 5.8% | 1 |
| sanja.First 0.1 | 8.9 | 4.8% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 79.7 | 21 / 35 | 4740 |
| 2 | 1 | 68.3 | 83.5 | 17 / 35 | 5100 |
| 3 | 1 | 67.8 | 76.8 | 18 / 35 | 5497 |
| 4 | 1 | 69.7 | 87.3 | 18 / 35 | 5326 |
| 5 | 1 | 70.3 | 91.4 | 22 / 35 | 5132 |
| 6 | 1 | 67.3 | 74.6 | 20 / 35 | 5388 |
| 7 | 1 | 70.4 | 87.9 | 22 / 35 | 5410 |
| 8 | 1 | 69.6 | 85.7 | 20 / 35 | 5505 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 79 | 70% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 57 | 88% |
| gre.svman4.Leonidas 1.3.2 | 34 | 88% |
| labg.Cataclysm 2.05 | 16 | 44% |
| kinsen.melee.Angsaichmophobia 1.8c | 14 | 93% |
| baal.nano.N 1.42 | 3 | 100% |

Hadur died in 124 of 280 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 50 | 40% | 107 |
| gre.svman4.Leonidas 1.3.2 | 17 | 14% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 13% | 57 |
| labg.Cataclysm 2.05 | 15 | 12% | 24 |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 6% | 15 |
| baal.nano.N 1.42 | 6 | 5% | 12 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 6 | 5% | 10 |
| sanja.First 0.1 | 4 | 3% | 5 |
| zyx.micro.Ant 1.1 | 2 | 2% | 5 |

## Melee bench: F34

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 75.7 | 43 / 280 | 3.19 | 15.8% | 39859 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.8 | 16.7% | 107 |
| kid.Gladiator .7.2 | 1.8 | 17.0% | 95 |
| kc.micro.Figment 1.0 | 2.5 | 15.8% | 43 |
| jcs.Seth 1.8 | 4.5 | 11.2% | 21 |
| tcf.Reach 3 | 4.9 | 10.7% | 11 |
| cli.Dancer 1.1 | 5.6 | 9.8% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 6.9% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.3% | 0 |
| sample.VelociRobot 1.0 | 9.1 | 3.8% | 0 |
| sample.RamFire 1.0 | 9.9 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.0 | 84.1 | 5 / 35 | 4986 |
| 2 | 3 | 64.3 | 73.7 | 5 / 35 | 4788 |
| 3 | 3 | 63.8 | 71.1 | 5 / 35 | 4715 |
| 4 | 3 | 65.4 | 76.2 | 4 / 35 | 4919 |
| 5 | 2 | 65.0 | 75.6 | 6 / 35 | 5179 |
| 6 | 1 | 66.4 | 77.5 | 7 / 35 | 5547 |
| 7 | 3 | 63.3 | 70.2 | 4 / 35 | 4712 |
| 8 | 3 | 65.6 | 77.1 | 7 / 35 | 5013 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 56 | 23% |
| kid.Gladiator .7.2 | 45 | 31% |
| jcs.Seth 1.8 | 19 | 63% |
| tcf.Reach 3 | 6 | 50% |
| cli.Dancer 1.1 | 2 | 0% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 238 of 280 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 93 | 39% | 103 |
| stelo.Spread 0.9 | 86 | 36% | 98 |
| jcs.Seth 1.8 | 22 | 9% | 36 |
| tcf.Reach 3 | 17 | 7% | 21 |
| ratosh.Wesco 1.4 | 6 | 3% | 7 |
| cli.Dancer 1.1 | 6 | 3% | 7 |
| amk.Punbot.Punbot 0.01 | 3 | 1% | 3 |
| sample.VelociRobot 1.0 | 2 | 1% | 3 |
| sample.RamFire 1.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F35

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 70.1 | 17 / 280 | 3.69 | 13.6% | 28192 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.1% | 216 |
| kc.micro.Figment 1.0 | 2.5 | 13.6% | 17 |
| gh.mini.Gruwel 0.9 | 3.1 | 12.8% | 25 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.0% | 19 |
| rz.HawkOnFire 0.1 | 4.6 | 11.1% | 3 |
| wit.Chuliath 1.0 | 6.5 | 7.4% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 7.0% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.9 | 6.3% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 5.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.9 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 80.6 | 4 / 35 | 4013 |
| 2 | 2 | 61.5 | 72.4 | 3 / 35 | 3537 |
| 3 | 3 | 59.4 | 67.3 | 2 / 35 | 3232 |
| 4 | 3 | 60.0 | 67.9 | 2 / 35 | 3371 |
| 5 | 2 | 61.3 | 70.5 | 2 / 35 | 3600 |
| 6 | 4 | 57.7 | 61.9 | 1 / 35 | 3160 |
| 7 | 2 | 59.1 | 65.4 | 2 / 35 | 3473 |
| 8 | 2 | 62.0 | 74.6 | 1 / 35 | 3806 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 54 | 2% |
| gh.mini.Gruwel 0.9 | 15 | 13% |
| dmh.robocode.robot.BlackDeath 9.2 | 9 | 67% |
| rz.HawkOnFire 0.1 | 6 | 83% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 263 of 280 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 155 | 59% | 158 |
| gh.mini.Gruwel 0.9 | 41 | 16% | 43 |
| dmh.robocode.robot.BlackDeath 9.2 | 31 | 12% | 37 |
| rz.HawkOnFire 0.1 | 18 | 7% | 21 |
| stelo.MyAgileRobot 0.2 | 5 | 2% | 5 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 4 |
| dans.Cinnamon 1.2 | 4 | 2% | 4 |
| myl.nano.KomoriNinja 1.1 | 3 | 1% | 5 |
| wit.Chuliath 1.0 | 2 | 1% | 3 |

## Melee bench: F36

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 8 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 87.2 | 202 / 280 | 2.15 | 20.1% | 44891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 20.1% | 202 |
| bzdp.Pansy 2.1 | 2.5 | 12.1% | 15 |
| alpha.RainingFire 1.0 | 3.1 | 11.8% | 26 |
| mz.Cork 0.1 | 4.3 | 10.8% | 11 |
| bvh.micro.Freya 0.3 | 5.1 | 10.2% | 10 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.3% | 6 |
| m3thos.Eva02 0.7.1 | 6.3 | 8.9% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.1 | 6.3% | 0 |
| dl.BetterWalls 1.0 | 8.9 | 5.8% | 4 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 83.8 | 22 / 35 | 5428 |
| 2 | 1 | 71.6 | 91.7 | 27 / 35 | 6015 |
| 3 | 1 | 69.5 | 86.7 | 22 / 35 | 5324 |
| 4 | 1 | 70.5 | 91.4 | 24 / 35 | 5401 |
| 5 | 1 | 71.5 | 89.8 | 30 / 35 | 5792 |
| 6 | 1 | 71.1 | 90.5 | 26 / 35 | 6024 |
| 7 | 1 | 69.0 | 83.5 | 26 / 35 | 5702 |
| 8 | 1 | 67.9 | 80.0 | 25 / 35 | 5205 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 68 | 96% |
| bvh.micro.Freya 0.3 | 40 | 95% |
| mz.Cork 0.1 | 34 | 91% |
| alpha.RainingFire 1.0 | 31 | 71% |
| bvh.mini.Fenrir 0.39 | 21 | 95% |
| sample.MyFirstRobot 1.0 | 13 | 92% |
| m3thos.Eva02 0.7.1 | 13 | 92% |
| dl.BetterWalls 1.0 | 1 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 79 of 280 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 22 | 28% | 41 |
| mz.Cork 0.1 | 12 | 15% | 45 |
| bzdp.Pansy 2.1 | 10 | 13% | 78 |
| bvh.micro.Freya 0.3 | 8 | 10% | 27 |
| bvh.mini.Fenrir 0.39 | 8 | 10% | 25 |
| dl.BetterWalls 1.0 | 7 | 9% | 19 |
| m3thos.Eva02 0.7.1 | 6 | 8% | 25 |
| sample.MyFirstRobot 1.0 | 3 | 4% | 11 |
| squidM.TentalceMeleeNano 1.1 | 3 | 4% | 8 |

## Melee bench: F37

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 80.4 | 181 / 280 | 2.76 | 18.2% | 43216 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 18.2% | 181 |
| germ.TheMind .2 | 3.1 | 10.5% | 13 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.3 | 10.9% | 17 |
| EBBU.Sim2 1.02 | 4.1 | 10.2% | 10 |
| stelo.UntouchableNano 1.3 | 5.6 | 9.1% | 17 |
| agrach.Dalek 1.0 | 5.9 | 8.9% | 14 |
| lmk.ACPFinal 0.1 | 6.9 | 8.6% | 11 |
| mb.Beast 0.1 | 7.0 | 8.7% | 12 |
| skm.Ryubot 1.0 | 8.9 | 7.6% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 7.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 81.6 | 24 / 35 | 5534 |
| 2 | 1 | 67.7 | 82.2 | 23 / 35 | 5626 |
| 3 | 1 | 65.8 | 77.5 | 23 / 35 | 5462 |
| 4 | 1 | 64.0 | 72.7 | 18 / 35 | 5024 |
| 5 | 1 | 68.2 | 87.9 | 27 / 35 | 5111 |
| 6 | 1 | 67.2 | 82.2 | 22 / 35 | 5268 |
| 7 | 1 | 66.1 | 74.6 | 21 / 35 | 5619 |
| 8 | 1 | 67.9 | 84.4 | 23 / 35 | 5572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 40 | 98% |
| EBBU.Sim2 1.02 | 35 | 100% |
| stelo.UntouchableNano 1.3 | 33 | 91% |
| mb.Beast 0.1 | 27 | 96% |
| com.syncleus.robocode.Dreadnaught 0.1 | 18 | 94% |
| agrach.Dalek 1.0 | 13 | 92% |
| skm.Ryubot 1.0 | 13 | 100% |
| lmk.ACPFinal 0.1 | 10 | 90% |

Hadur died in 101 of 280 rounds, at a mean tick of 332. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 23 | 23% | 24 |
| agrach.Dalek 1.0 | 19 | 19% | 44 |
| com.syncleus.robocode.Dreadnaught 0.1 | 14 | 14% | 43 |
| mb.Beast 0.1 | 10 | 10% | 27 |
| germ.TheMind .2 | 8 | 8% | 41 |
| EBBU.Sim2 1.02 | 7 | 7% | 40 |
| stelo.UntouchableNano 1.3 | 7 | 7% | 26 |
| lmk.ACPFinal 0.1 | 6 | 6% | 20 |
| skm.Ryubot 1.0 | 6 | 6% | 11 |
1 death(s) with no robot to name.

## Melee bench: F38

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 8 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 74.0 | 67 / 280 | 3.34 | 15.5% | 36022 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.1 | 17.4% | 143 |
| kc.micro.Figment 1.0 | 1.9 | 15.5% | 67 |
| bvh.mini.Freya 0.55 | 3.4 | 12.3% | 15 |
| bts.mega.Gnarly 1.4 | 4.1 | 11.2% | 29 |
| cs.Wren 1.0 | 4.8 | 10.4% | 11 |
| kdf.KoulDestroyer 1.0 | 6.1 | 9.4% | 6 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.6 | 8.7% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 6.1% | 3 |
| bzdp.BoxCar 2.0 | 9.3 | 4.5% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 76.5 | 10 / 35 | 4569 |
| 2 | 2 | 61.1 | 68.9 | 4 / 35 | 3870 |
| 3 | 2 | 62.4 | 70.2 | 9 / 35 | 4450 |
| 4 | 1 | 63.7 | 74.0 | 12 / 35 | 4405 |
| 5 | 2 | 62.6 | 68.3 | 9 / 35 | 4514 |
| 6 | 2 | 65.4 | 78.1 | 8 / 35 | 4935 |
| 7 | 2 | 66.1 | 81.9 | 9 / 35 | 4792 |
| 8 | 2 | 63.8 | 74.6 | 6 / 35 | 4487 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 80 | 15% |
| bvh.mini.Freya 0.55 | 14 | 79% |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 93% |
| bts.mega.Gnarly 1.4 | 13 | 46% |
| cs.Wren 1.0 | 12 | 100% |
| kdf.KoulDestroyer 1.0 | 10 | 90% |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 100% |

Hadur died in 215 of 280 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 106 | 49% | 120 |
| bvh.mini.Freya 0.55 | 37 | 17% | 42 |
| bts.mega.Gnarly 1.4 | 25 | 12% | 39 |
| cs.Wren 1.0 | 16 | 7% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 4% | 23 |
| kdf.KoulDestroyer 1.0 | 8 | 4% | 13 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7 | 3% | 11 |
| matt.UnderDark3 2.4.34 | 6 | 3% | 6 |
| bzdp.BoxCar 2.0 | 2 | 1% | 2 |

## Melee bench: F39

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 77.5 | 72 / 280 | 3.03 | 16.7% | 42083 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 16.7% | 72 |
| bvh.fry.Freya 0.82 | 2.0 | 15.1% | 41 |
| az.Ololobot 0.2.4 | 2.8 | 13.9% | 112 |
| catcat20.Lambda 0.024 | 4.0 | 11.0% | 42 |
| gimp.GimpBot 0.1 | 5.9 | 8.3% | 2 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.0% | 2 |
| apollokidd.ApolloKidd 0.9 | 6.4 | 7.9% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 7.6 | 7.4% | 8 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.4% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 76.5 | 7 / 35 | 5324 |
| 2 | 1 | 64.5 | 74.9 | 8 / 35 | 5280 |
| 3 | 1 | 65.3 | 74.9 | 8 / 35 | 5686 |
| 4 | 1 | 66.0 | 83.8 | 10 / 35 | 4862 |
| 5 | 1 | 66.2 | 81.6 | 7 / 35 | 5329 |
| 6 | 2 | 64.6 | 74.0 | 10 / 35 | 5219 |
| 7 | 1 | 64.4 | 74.6 | 8 / 35 | 5154 |
| 8 | 1 | 66.4 | 79.4 | 14 / 35 | 5229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 69 | 12% |
| bvh.fry.Freya 0.82 | 56 | 64% |
| catcat20.Lambda 0.024 | 30 | 37% |
| stelo.SoRobotNanoMelee 1.2 | 11 | 91% |
| gimp.GimpBot 0.1 | 6 | 83% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 0% |

Hadur died in 210 of 280 rounds, at a mean tick of 1002. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 79 | 38% | 90 |
| bvh.fry.Freya 0.82 | 44 | 21% | 66 |
| catcat20.Lambda 0.024 | 42 | 20% | 51 |
| stelo.SoRobotNanoMelee 1.2 | 16 | 8% | 22 |
| apollokidd.ApolloKidd 0.9 | 13 | 6% | 18 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8 | 4% | 10 |
| gimp.GimpBot 0.1 | 4 | 2% | 16 |
| winamp32.micro.MicroMacro 1.0 | 3 | 1% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 0% | 2 |

## Melee bench: F40

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 79.6 | 143 / 280 | 2.84 | 17.6% | 37565 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.1 | 17.6% | 143 |
| kawigi.mini.Coriantumr 1.1 | 1.9 | 15.5% | 74 |
| kano.gamma.KanoGamma 1.8 | 3.4 | 11.7% | 21 |
| mz.AntiGrav 1.0 | 4.5 | 11.1% | 10 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.8% | 11 |
| alpha.BlackIce 1.0 | 6.3 | 8.8% | 5 |
| stelo.Randomness 1.0 | 6.4 | 8.4% | 11 |
| amk.superstrike.SuperStrike 0.3 | 8.4 | 6.4% | 1 |
| testantiswapgun.AntiSwap 1.0 | 8.6 | 5.8% | 3 |
| sample.Corners 1.0 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 70.8 | 14 / 35 | 4576 |
| 2 | 1 | 66.3 | 74.0 | 20 / 35 | 4684 |
| 3 | 1 | 67.0 | 81.3 | 20 / 35 | 4527 |
| 4 | 1 | 66.1 | 77.8 | 14 / 35 | 4706 |
| 5 | 1 | 69.3 | 87.9 | 20 / 35 | 4951 |
| 6 | 1 | 69.9 | 88.9 | 25 / 35 | 4962 |
| 7 | 2 | 65.5 | 76.2 | 13 / 35 | 4688 |
| 8 | 1 | 66.5 | 79.7 | 17 / 35 | 4471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 75 | 53% |
| mz.AntiGrav 1.0 | 45 | 96% |
| kano.gamma.KanoGamma 1.8 | 26 | 81% |
| Polkwane.SmashMelee 1.0 | 20 | 90% |
| stelo.Randomness 1.0 | 12 | 83% |
| alpha.BlackIce 1.0 | 7 | 71% |
| amk.superstrike.SuperStrike 0.3 | 6 | 100% |

Hadur died in 137 of 280 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 56 | 41% | 85 |
| Polkwane.SmashMelee 1.0 | 19 | 14% | 35 |
| mz.AntiGrav 1.0 | 15 | 11% | 49 |
| kano.gamma.KanoGamma 1.8 | 13 | 9% | 43 |
| stelo.Randomness 1.0 | 12 | 9% | 26 |
| alpha.BlackIce 1.0 | 11 | 8% | 18 |
| amk.superstrike.SuperStrike 0.3 | 8 | 6% | 14 |
| testantiswapgun.AntiSwap 1.0 | 3 | 2% | 3 |
| sample.Corners 1.0 | 0 | 0% | 3 |

## Melee bench: F41

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 73.4 | 99 / 280 | 3.40 | 16.0% | 36431 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.4 | 16.0% | 99 |
| eem.EvBotNG v12.8 | 1.6 | 15.9% | 109 |
| ary.Swarm 1.1 | 3.3 | 12.8% | 18 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.7% | 33 |
| simonton.nano.MeleeSeed 1.8 | 5.1 | 10.3% | 13 |
| shrub.Silver v048 | 5.9 | 9.3% | 3 |
| zyx.nano.Ant 1.1 | 7.1 | 7.9% | 1 |
| jsal.Jsalbot 1.0 | 8.3 | 6.1% | 3 |
| stelo.Mirror 1.1 | 8.6 | 5.9% | 0 |
| acogdev.alpha 0.2 | 10.0 | 3.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 80.6 | 13 / 35 | 4908 |
| 2 | 2 | 62.7 | 67.9 | 9 / 35 | 4596 |
| 3 | 1 | 63.7 | 72.4 | 14 / 35 | 4141 |
| 4 | 1 | 65.0 | 72.1 | 12 / 35 | 4963 |
| 5 | 2 | 61.0 | 63.8 | 10 / 35 | 4244 |
| 6 | 2 | 64.1 | 74.0 | 10 / 35 | 4441 |
| 7 | 1 | 66.2 | 75.9 | 16 / 35 | 4457 |
| 8 | 1 | 66.6 | 80.3 | 15 / 35 | 4681 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 62 | 31% |
| ary.Swarm 1.1 | 37 | 89% |
| lessonz.robocode.Oz 0.5.0 | 29 | 66% |
| simonton.nano.MeleeSeed 1.8 | 23 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| stelo.Mirror 1.1 | 2 | 100% |
| shrub.Silver v048 | 2 | 50% |

Hadur died in 181 of 280 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 96 | 53% | 128 |
| ary.Swarm 1.1 | 25 | 14% | 53 |
| lessonz.robocode.Oz 0.5.0 | 25 | 14% | 34 |
| simonton.nano.MeleeSeed 1.8 | 20 | 11% | 36 |
| zyx.nano.Ant 1.1 | 7 | 4% | 10 |
| shrub.Silver v048 | 3 | 2% | 8 |
| acogdev.alpha 0.2 | 2 | 1% | 4 |
| stelo.Mirror 1.1 | 2 | 1% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |

## Melee bench: F42

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 77.7 | 66 / 280 | 3.01 | 16.4% | 40870 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 17.4% | 136 |
| kc.micro.Figment 1.0 | 1.8 | 16.4% | 66 |
| ara.Shera 0.88 | 3.5 | 12.7% | 40 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 12.5% | 25 |
| amz.NanoClone 1.41 | 5.0 | 9.2% | 6 |
| maribo.IotaCT 1.1 | 6.0 | 8.3% | 2 |
| dsw.StaticD 1.0 | 7.3 | 7.0% | 5 |
| stelo.MirrorMicro 1.0 | 8.4 | 6.2% | 0 |
| mme.NikeEnhanced 2.0 | 8.6 | 5.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 76.2 | 9 / 35 | 5078 |
| 2 | 2 | 64.2 | 73.3 | 7 / 35 | 5137 |
| 3 | 2 | 65.6 | 81.3 | 7 / 35 | 5008 |
| 4 | 2 | 65.5 | 75.6 | 9 / 35 | 5497 |
| 5 | 1 | 66.6 | 80.0 | 11 / 35 | 5401 |
| 6 | 1 | 67.4 | 86.3 | 10 / 35 | 5293 |
| 7 | 2 | 60.8 | 65.1 | 7 / 35 | 4339 |
| 8 | 2 | 66.9 | 83.5 | 6 / 35 | 5117 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 79 | 25% |
| ara.Shera 0.88 | 31 | 61% |
| maribo.mini.MiniQuester 0.1 | 24 | 63% |
| dsw.StaticD 1.0 | 7 | 100% |
| amz.NanoClone 1.41 | 5 | 80% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 214 of 280 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 122 | 57% | 146 |
| ara.Shera 0.88 | 39 | 18% | 57 |
| maribo.mini.MiniQuester 0.1 | 22 | 10% | 36 |
| amz.NanoClone 1.41 | 13 | 6% | 15 |
| dsw.StaticD 1.0 | 7 | 3% | 15 |
| mme.NikeEnhanced 2.0 | 4 | 2% | 4 |
| stelo.MirrorMicro 1.0 | 3 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 3 | 1% | 3 |
| maribo.IotaCT 1.1 | 1 | 0% | 1 |

## Melee bench: F43

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 70.5 | 24 / 280 | 3.65 | 14.0% | 30580 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.4% | 219 |
| kc.micro.Figment 1.0 | 2.0 | 14.0% | 24 |
| brainfade.melee.Dusk 0.44 | 3.4 | 12.2% | 26 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.7% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.5% | 3 |
| Krabb.akim2.Akim2 1.1b | 5.9 | 9.6% | 1 |
| jab.DiamondStealer 5 | 7.3 | 8.0% | 0 |
| mz.NanoGod 2.02 | 7.8 | 7.7% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 66.3 | 5 / 35 | 3638 |
| 2 | 2 | 62.4 | 70.8 | 1 / 35 | 3688 |
| 3 | 2 | 62.8 | 71.1 | 3 / 35 | 3776 |
| 4 | 2 | 62.3 | 67.6 | 2 / 35 | 3940 |
| 5 | 2 | 62.8 | 71.1 | 2 / 35 | 3868 |
| 6 | 2 | 65.2 | 77.8 | 6 / 35 | 3954 |
| 7 | 2 | 63.1 | 71.1 | 2 / 35 | 4045 |
| 8 | 2 | 62.0 | 68.3 | 3 / 35 | 3671 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 83 | 6% |
| brainfade.melee.Dusk 0.44 | 13 | 62% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 83% |
| dummy.micro.Sparrow 2.5 | 6 | 67% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |

Hadur died in 256 of 280 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 168 | 66% | 174 |
| brainfade.melee.Dusk 0.44 | 31 | 12% | 39 |
| wcsv.melee.EngineerMelee 0.1 | 18 | 7% | 22 |
| dummy.micro.Sparrow 2.5 | 14 | 5% | 17 |
| jab.DiamondStealer 5 | 10 | 4% | 10 |
| Krabb.akim2.Akim2 1.1b | 6 | 2% | 9 |
| mz.NanoGod 2.02 | 6 | 2% | 6 |
| cvt.Firsty 1.0 | 3 | 1% | 3 |

## Melee bench: F44

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 80.7 | 117 / 280 | 2.74 | 18.1% | 44659 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.1 | 18.1% | 117 |
| stelo.Liblix 0.3.1 | 1.9 | 15.9% | 116 |
| tzu.TheArtOfWar 1.2 | 3.1 | 12.7% | 26 |
| wompi.Quokka 1.6 | 4.4 | 10.3% | 5 |
| jwirde.Gort 2.0 | 5.1 | 9.5% | 7 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.4 | 9.0% | 5 |
| stf.PanzerGeneral 0.1 | 7.4 | 7.7% | 1 |
| disan.Chair 2.2.0 | 7.6 | 7.4% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.8% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 82.2 | 12 / 35 | 5811 |
| 2 | 1 | 68.3 | 80.6 | 18 / 35 | 5642 |
| 3 | 1 | 69.5 | 89.5 | 16 / 35 | 5657 |
| 4 | 1 | 66.1 | 74.9 | 12 / 35 | 5504 |
| 5 | 1 | 67.5 | 81.3 | 13 / 35 | 5587 |
| 6 | 1 | 67.7 | 81.0 | 18 / 35 | 5528 |
| 7 | 2 | 66.3 | 74.0 | 12 / 35 | 5684 |
| 8 | 1 | 67.3 | 81.9 | 16 / 35 | 5246 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 106 | 30% |
| tzu.TheArtOfWar 1.2 | 59 | 85% |
| wompi.Quokka 1.6 | 16 | 94% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 89% |
| disan.Chair 2.2.0 | 7 | 86% |
| jwirde.Gort 2.0 | 6 | 83% |
| sample.Crazy 1.0 | 1 | 0% |

Hadur died in 163 of 280 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 94 | 58% | 139 |
| tzu.TheArtOfWar 1.2 | 34 | 21% | 76 |
| disan.Chair 2.2.0 | 10 | 6% | 15 |
| stf.PanzerGeneral 0.1 | 9 | 6% | 10 |
| wompi.Quokka 1.6 | 7 | 4% | 19 |
| jwirde.Gort 2.0 | 3 | 2% | 12 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 2% | 6 |
| sample.Crazy 1.0 | 2 | 1% | 2 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 1 |

## Melee bench: F45

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 86.2 | 133 / 280 | 2.24 | 19.7% | 47143 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 19.7% | 133 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 12.3% | 115 |
| jje.BagPuss 1.2 | 3.1 | 11.5% | 8 |
| sul.Lunar 1.1 | 4.4 | 10.3% | 12 |
| myl.nano.Graviton 1.10 | 4.8 | 9.9% | 4 |
| hvilela.HVilela 0.9 | 6.5 | 8.7% | 0 |
| fm.claire 1.7 | 6.8 | 8.2% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 8.2% | 3 |
| wit.Deep7 2.0 | 8.8 | 6.1% | 6 |
| abud.ThirdRobo 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 79.7 | 17 / 35 | 5850 |
| 2 | 1 | 71.2 | 92.1 | 22 / 35 | 5827 |
| 3 | 1 | 66.8 | 79.4 | 15 / 35 | 5376 |
| 4 | 1 | 69.6 | 87.9 | 16 / 35 | 5929 |
| 5 | 1 | 69.8 | 87.3 | 12 / 35 | 6504 |
| 6 | 1 | 70.5 | 90.8 | 18 / 35 | 6131 |
| 7 | 1 | 70.3 | 88.9 | 20 / 35 | 5963 |
| 8 | 1 | 68.0 | 83.8 | 13 / 35 | 5563 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 139 | 39% |
| sul.Lunar 1.1 | 29 | 100% |
| myl.nano.Graviton 1.10 | 19 | 100% |
| jje.BagPuss 1.2 | 14 | 79% |
| pez.mini.ChironexFleckeri 0.5 | 12 | 100% |
| wit.Deep7 2.0 | 4 | 75% |
| hvilela.HVilela 0.9 | 3 | 100% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 149 of 280 rounds, at a mean tick of 1973. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 92 | 62% | 0 |
| jje.BagPuss 1.2 | 21 | 14% | 77 |
| myl.nano.Graviton 1.10 | 11 | 7% | 51 |
| hvilela.HVilela 0.9 | 6 | 4% | 17 |
| sul.Lunar 1.1 | 5 | 3% | 74 |
| fm.claire 1.7 | 5 | 3% | 15 |
| pez.mini.ChironexFleckeri 0.5 | 3 | 2% | 23 |
| wit.Deep7 2.0 | 3 | 2% | 13 |
| abud.ThirdRobo 1.0 | 2 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F46

kc.micro.Figment 1.0 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 71.2 | 25 / 280 | 3.59 | 14.5% | 36284 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.5% | 106 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.8% | 119 |
| kc.micro.Figment 1.0 | 3.0 | 14.5% | 25 |
| mz.MicroSheep 1.0 | 4.5 | 10.4% | 4 |
| cx.Princess 1.0 | 4.5 | 10.7% | 23 |
| sadoner.killer 0.2 | 6.0 | 8.9% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.3 | 6.5% | 0 |
| arthord.NanoSatanMelee Beta | 7.9 | 6.2% | 3 |
| kurios.DOSexe .9a | 8.9 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 70.5 | 2 / 35 | 4212 |
| 2 | 3 | 64.2 | 73.3 | 7 / 35 | 4888 |
| 3 | 3 | 60.9 | 66.0 | 2 / 35 | 4179 |
| 4 | 3 | 64.5 | 74.6 | 8 / 35 | 4802 |
| 5 | 3 | 63.6 | 73.0 | 1 / 35 | 4751 |
| 6 | 3 | 61.4 | 68.3 | 1 / 35 | 4291 |
| 7 | 3 | 61.9 | 69.5 | 3 / 35 | 4355 |
| 8 | 3 | 63.5 | 74.3 | 1 / 35 | 4806 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 51 | 14% |
| rsalesc.melee.Medina 0.4.5 | 27 | 11% |
| mz.MicroSheep 1.0 | 6 | 100% |
| arthord.NanoSatanMelee Beta | 4 | 100% |
| sadoner.killer 0.2 | 3 | 100% |
| cx.Princess 1.0 | 3 | 67% |

Hadur died in 255 of 280 rounds, at a mean tick of 722. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 113 | 44% | 124 |
| rsalesc.melee.Medina 0.4.5 | 84 | 33% | 87 |
| cx.Princess 1.0 | 25 | 10% | 26 |
| sadoner.killer 0.2 | 11 | 4% | 14 |
| mz.MicroSheep 1.0 | 8 | 3% | 14 |
| arthord.NanoSatanMelee Beta | 6 | 2% | 7 |
| jeremyreeder.collective.Prophet 5 | 6 | 2% | 6 |
| kurios.DOSexe .9a | 2 | 1% | 2 |

