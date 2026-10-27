# Bench suite: suite.txt

## Melee bench: F01

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 74.5 | 29 / 280 | 3.30 | 15.2% | 39657 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 202 |
| hadur117.micro.SaorLAU 0.1 | 2.0 | 15.2% | 29 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.3 | 11.5% | 9 |
| sgp.JollyNinja 3.53 | 3.8 | 11.3% | 20 |
| lorneswork.Predator 1.0 | 5.3 | 10.1% | 6 |
| mz.MicroGodMelee 1 | 5.8 | 9.9% | 15 |
| adt.Ar2 1.0 | 7.0 | 7.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.7% | 0 |
| skm.butterfly 1.0 | 8.8 | 5.1% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 73.0 | 4 / 35 | 4742 |
| 2 | 2 | 65.0 | 79.0 | 5 / 35 | 5112 |
| 3 | 2 | 65.4 | 81.3 | 6 / 35 | 4778 |
| 4 | 2 | 63.4 | 74.6 | 2 / 35 | 4646 |
| 5 | 2 | 64.0 | 71.7 | 4 / 35 | 5432 |
| 6 | 2 | 62.2 | 67.6 | 2 / 35 | 4958 |
| 7 | 2 | 62.7 | 72.7 | 3 / 35 | 4753 |
| 8 | 2 | 64.6 | 75.9 | 3 / 35 | 5236 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 129 | 5% |
| sgp.JollyNinja 3.53 | 13 | 77% |
| mz.MicroGodMelee 1 | 11 | 27% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 71% |
| lorneswork.Predator 1.0 | 5 | 80% |

Hadur died in 251 of 280 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 158 | 63% | 168 |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 10% | 28 |
| mz.MicroGodMelee 1 | 21 | 8% | 26 |
| sgp.JollyNinja 3.53 | 20 | 8% | 25 |
| lorneswork.Predator 1.0 | 14 | 6% | 18 |
| adt.Ar2 1.0 | 7 | 3% | 7 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 1% | 4 |
| mym.EdgeStalker 1.0 | 3 | 1% | 3 |
| skm.butterfly 1.0 | 1 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 79.0 | 119 / 280 | 2.89 | 17.7% | 42739 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.1 | 17.7% | 119 |
| pulsar.PulsarMax 0.8.9 | 2.4 | 12.7% | 51 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 12.6% | 55 |
| lrem.micro.SpikeSoldier 0.4 | 4.1 | 10.8% | 5 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.9 | 10.0% | 15 |
| fnc.bandit.Bandit 5.2.0 | 6.3 | 8.7% | 5 |
| Noran.BitchingElk 0.054 | 6.6 | 8.4% | 17 |
| sch.Simone 0.3d | 8.3 | 7.5% | 10 |
| stelo.PatternRobot 1.0 | 8.6 | 6.7% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 83.2 | 16 / 35 | 5220 |
| 2 | 1 | 67.0 | 79.7 | 17 / 35 | 5384 |
| 3 | 1 | 63.2 | 70.5 | 8 / 35 | 4986 |
| 4 | 2 | 62.5 | 66.7 | 13 / 35 | 4625 |
| 5 | 1 | 68.6 | 84.1 | 17 / 35 | 5958 |
| 6 | 1 | 67.9 | 84.4 | 16 / 35 | 5415 |
| 7 | 1 | 66.9 | 80.3 | 15 / 35 | 5584 |
| 8 | 1 | 67.9 | 83.2 | 17 / 35 | 5567 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 51 | 43% |
| pulsar.PulsarMax 0.8.9 | 50 | 54% |
| com.cohesiva.robocode.ManOwaR 1.0 | 18 | 83% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 88% |
| Noran.BitchingElk 0.054 | 15 | 67% |
| stelo.PatternRobot 1.0 | 12 | 83% |
| sch.Simone 0.3d | 8 | 100% |
| fullsail.SweetTea 1.1 | 7 | 100% |
| fnc.bandit.Bandit 5.2.0 | 6 | 83% |

Hadur died in 163 of 280 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 52 | 32% | 78 |
| pulsar.PulsarMax 0.8.9 | 43 | 26% | 73 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 9% | 20 |
| stelo.PatternRobot 1.0 | 15 | 9% | 20 |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 7% | 26 |
| fnc.bandit.Bandit 5.2.0 | 8 | 5% | 14 |
| sch.Simone 0.3d | 7 | 4% | 16 |
| Noran.BitchingElk 0.054 | 6 | 4% | 21 |
| fullsail.SweetTea 1.1 | 5 | 3% | 11 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 79.5 | 154 / 280 | 2.85 | 17.9% | 46287 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 17.9% | 154 |
| radnor.DoctorBob 1.42 | 2.1 | 14.3% | 47 |
| vuen.Cake 2.51 | 3.4 | 12.7% | 43 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.6% | 30 |
| urdos.URDOS 1.3 | 5.0 | 9.9% | 3 |
| adt.Ar1 2.1 | 6.4 | 7.8% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.1 | 7.0% | 1 |
| oa.weak.FlyMk1 0.1 | 8.0 | 6.8% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 6.0% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 82.9 | 20 / 35 | 5823 |
| 2 | 1 | 65.9 | 74.3 | 18 / 35 | 5464 |
| 3 | 1 | 68.3 | 81.0 | 24 / 35 | 5975 |
| 4 | 1 | 66.5 | 75.9 | 17 / 35 | 6150 |
| 5 | 1 | 68.2 | 82.5 | 23 / 35 | 5736 |
| 6 | 1 | 65.0 | 73.3 | 14 / 35 | 5525 |
| 7 | 1 | 66.6 | 78.1 | 16 / 35 | 5817 |
| 8 | 1 | 68.9 | 87.9 | 22 / 35 | 5797 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 68 | 81% |
| kawigi.nano.Lib 1.0 | 53 | 85% |
| radnor.DoctorBob 1.42 | 50 | 84% |
| urdos.URDOS 1.3 | 5 | 80% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 100% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 126 of 280 rounds, at a mean tick of 617. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 35 | 28% | 76 |
| kawigi.nano.Lib 1.0 | 21 | 17% | 74 |
| vuen.Cake 2.51 | 21 | 17% | 63 |
| urdos.URDOS 1.3 | 17 | 13% | 23 |
| ghent.ArthurPanzergon 1.0.0 | 12 | 10% | 16 |
| adt.Ar1 2.1 | 8 | 6% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 6% | 8 |
| oa.weak.FlyMk1 0.1 | 3 | 2% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 2% | 3 |

## Melee bench: F04

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 75.3 | 6 / 280 | 3.23 | 15.6% | 43092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.8% | 258 |
| hadur117.micro.SaorLAU 0.1 | 2.0 | 15.6% | 6 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.4% | 10 |
| TNT.TNT 0.99.1 | 4.1 | 10.5% | 4 |
| josago.Jorgito 0.16 | 4.9 | 9.4% | 1 |
| css.Delitioner 0.11 | 6.1 | 7.4% | 1 |
| tj.zombie1n 1.0.1 | 7.0 | 6.3% | 0 |
| rampancy.Durandal 2.1d | 7.9 | 5.6% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.9% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 76.5 | 0 / 35 | 5495 |
| 2 | 2 | 65.5 | 76.2 | 0 / 35 | 5378 |
| 3 | 2 | 66.1 | 78.7 | 2 / 35 | 5279 |
| 4 | 2 | 65.2 | 71.7 | 1 / 35 | 5775 |
| 5 | 2 | 64.9 | 73.3 | 1 / 35 | 5437 |
| 6 | 2 | 65.5 | 75.9 | 1 / 35 | 5296 |
| 7 | 2 | 64.5 | 74.6 | 1 / 35 | 4975 |
| 8 | 2 | 65.2 | 75.2 | 0 / 35 | 5457 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 111 | 2% |
| apc.LeeroyJenkins2 1.0 | 7 | 29% |
| TNT.TNT 0.99.1 | 3 | 33% |
| sp.Nanos.Ember 1.1 | 1 | 100% |

Hadur died in 274 of 280 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 206 | 75% | 209 |
| apc.LeeroyJenkins2 1.0 | 25 | 9% | 27 |
| josago.Jorgito 0.16 | 15 | 5% | 15 |
| css.Delitioner 0.11 | 13 | 5% | 13 |
| rampancy.Durandal 2.1d | 4 | 1% | 4 |
| tj.zombie1n 1.0.1 | 4 | 1% | 4 |
| TNT.TNT 0.99.1 | 4 | 1% | 4 |
| sp.Nanos.Ember 1.1 | 3 | 1% | 4 |

## Melee bench: F05

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 59.2 | 11 / 280 | 4.67 | 12.4% | 32346 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 19.1% | 166 |
| justin.DemonicRage 3.4 | 2.0 | 16.6% | 75 |
| wompi.Numbat 2.1 | 3.1 | 13.1% | 18 |
| hadur117.micro.SaorLAU 0.1 | 3.9 | 12.4% | 11 |
| ms.Ares 0.19 | 5.5 | 9.2% | 2 |
| axeBots.HataMoto 3.09 | 5.5 | 9.4% | 8 |
| supersample.SuperBoxBot 1.0 | 7.4 | 6.0% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.1 | 5.4% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 8.8 | 4.6% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.0 | 57.5 | 1 / 35 | 4167 |
| 2 | 4 | 59.7 | 61.9 | 0 / 35 | 4069 |
| 3 | 4 | 58.0 | 53.7 | 3 / 35 | 4365 |
| 4 | 4 | 57.5 | 56.5 | 1 / 35 | 3961 |
| 5 | 4 | 57.5 | 57.1 | 0 / 35 | 3879 |
| 6 | 3 | 61.1 | 67.3 | 3 / 35 | 3954 |
| 7 | 4 | 58.7 | 60.0 | 1 / 35 | 3963 |
| 8 | 4 | 59.0 | 60.0 | 2 / 35 | 3988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 31 | 10% |
| justin.DemonicRage 3.4 | 13 | 8% |
| wompi.Numbat 2.1 | 7 | 71% |
| ms.Ares 0.19 | 2 | 50% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 269 of 280 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 88 | 33% | 92 |
| justin.DemonicRage 3.4 | 85 | 32% | 86 |
| wompi.Numbat 2.1 | 37 | 14% | 42 |
| supersample.SuperBoxBot 1.0 | 17 | 6% | 17 |
| axeBots.HataMoto 3.09 | 16 | 6% | 16 |
| ms.Ares 0.19 | 13 | 5% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 8 | 3% | 8 |
| GarmBox.Oranges 1.0 | 4 | 1% | 4 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 78.5 | 123 / 280 | 2.93 | 17.0% | 37007 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 17.0% | 123 |
| origin.SleepSiphon 1.7b | 2.5 | 13.5% | 76 |
| jekl.StoneGhost 0.7 | 2.5 | 14.2% | 31 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.3 | 11.2% | 27 |
| mld.Wisdom 1.0 | 4.9 | 10.7% | 7 |
| gg.Wolverine 2.0 | 5.9 | 9.0% | 11 |
| spinnercat.Omen 1.0 | 7.6 | 7.4% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.1 | 6.6% | 3 |
| DBall.NUKE 0.1 | 8.3 | 6.7% | 1 |
| sample.Fire 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 79.7 | 17 / 35 | 4707 |
| 2 | 1 | 64.6 | 74.3 | 12 / 35 | 4500 |
| 3 | 1 | 65.9 | 78.7 | 17 / 35 | 4643 |
| 4 | 1 | 65.9 | 76.8 | 17 / 35 | 4450 |
| 5 | 1 | 67.3 | 83.2 | 16 / 35 | 5026 |
| 6 | 1 | 66.2 | 79.0 | 17 / 35 | 4664 |
| 7 | 1 | 64.6 | 77.5 | 13 / 35 | 4076 |
| 8 | 1 | 66.1 | 79.0 | 14 / 35 | 4941 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 66 | 41% |
| jekl.StoneGhost 0.7 | 59 | 81% |
| pe.minimelee.SandboxMiniMelee 1.1 | 34 | 85% |
| gg.Wolverine 2.0 | 17 | 47% |
| mld.Wisdom 1.0 | 8 | 50% |
| DBall.NUKE 0.1 | 3 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 100% |

Hadur died in 158 of 280 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 59 | 37% | 95 |
| jekl.StoneGhost 0.7 | 30 | 19% | 66 |
| mld.Wisdom 1.0 | 25 | 16% | 31 |
| gg.Wolverine 2.0 | 16 | 10% | 21 |
| pe.minimelee.SandboxMiniMelee 1.1 | 14 | 9% | 43 |
| DBall.NUKE 0.1 | 6 | 4% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 2% | 7 |
| sample.Fire 1.0 | 3 | 2% | 4 |
| spinnercat.Omen 1.0 | 2 | 1% | 3 |

## Melee bench: F07

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 84.5 | 103 / 280 | 2.39 | 18.6% | 48458 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.3 | 18.6% | 103 |
| rsalesc.melee.Monk 0.3.6c | 2.1 | 17.2% | 75 |
| rtk.Tachikoma 1.0 | 2.6 | 16.3% | 73 |
| franzor.Lizt 1.3.1 | 4.0 | 11.1% | 20 |
| oog.melee.CapuletDroid 1.1 | 5.1 | 9.8% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.4% | 1 |
| exauge.GateKeeper 1.1.121g | 6.6 | 7.9% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.2% | 0 |
| sample.Target 1.0 | 9.5 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 9.5 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 82.5 | 13 / 35 | 6369 |
| 2 | 1 | 69.6 | 86.0 | 18 / 35 | 5468 |
| 3 | 2 | 68.8 | 80.6 | 11 / 35 | 6291 |
| 4 | 1 | 70.1 | 85.4 | 15 / 35 | 6352 |
| 5 | 1 | 69.9 | 86.3 | 11 / 35 | 6274 |
| 6 | 1 | 69.4 | 86.7 | 9 / 35 | 6041 |
| 7 | 1 | 69.5 | 83.5 | 15 / 35 | 6118 |
| 8 | 2 | 68.6 | 85.1 | 11 / 35 | 5545 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 95 | 51% |
| rsalesc.melee.Monk 0.3.6c | 48 | 8% |
| oog.melee.CapuletDroid 1.1 | 32 | 84% |
| franzor.Lizt 1.3.1 | 26 | 73% |
| exauge.GateKeeper 1.1.121g | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 50% |

Hadur died in 178 of 280 rounds, at a mean tick of 1203. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 73 | 41% | 141 |
| rsalesc.melee.Monk 0.3.6c | 67 | 38% | 93 |
| oog.melee.CapuletDroid 1.1 | 11 | 6% | 12 |
| franzor.Lizt 1.3.1 | 10 | 6% | 4 |
| exauge.GateKeeper 1.1.121g | 7 | 4% | 10 |
| lrem.micro.MoggFanatic 0.2 | 5 | 3% | 9 |
| skm.PateranBotlock2 1.0 | 4 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 76.6 | 120 / 280 | 3.11 | 17.6% | 44179 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 17.6% | 120 |
| tm.Yuugao 1.0 | 2.0 | 13.7% | 78 |
| shrub.Vapour v159 | 3.4 | 11.4% | 30 |
| Krabb.sliNk.Garm 0.9u | 4.4 | 10.4% | 18 |
| com.spp.robocode.MostlyHarmless 010 | 4.4 | 10.6% | 23 |
| m3thos.Eva00 1.1 | 6.4 | 9.0% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.7% | 8 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 7.1% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 5.8% | 0 |
| SHAM.WOW 1.4 | 9.5 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 69.8 | 9 / 35 | 5432 |
| 2 | 1 | 66.0 | 77.5 | 16 / 35 | 5261 |
| 3 | 1 | 65.0 | 71.4 | 14 / 35 | 5610 |
| 4 | 1 | 65.9 | 74.0 | 15 / 35 | 5417 |
| 5 | 1 | 67.2 | 78.1 | 18 / 35 | 5781 |
| 6 | 1 | 68.3 | 82.9 | 17 / 35 | 5778 |
| 7 | 1 | 66.1 | 78.1 | 14 / 35 | 5297 |
| 8 | 1 | 67.8 | 81.0 | 17 / 35 | 5603 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 61 | 33% |
| shrub.Vapour v159 | 35 | 86% |
| Krabb.sliNk.Garm 0.9u | 32 | 81% |
| com.spp.robocode.MostlyHarmless 010 | 26 | 81% |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 86% |
| SHAM.WOW 1.4 | 4 | 75% |
| m3thos.Eva00 1.1 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 160 of 280 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 63 | 39% | 93 |
| shrub.Vapour v159 | 22 | 14% | 48 |
| Krabb.sliNk.Garm 0.9u | 21 | 13% | 36 |
| com.spp.robocode.MostlyHarmless 010 | 15 | 9% | 38 |
| SHAM.WOW 1.4 | 10 | 6% | 14 |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 6% | 23 |
| m3thos.Eva00 1.1 | 8 | 5% | 17 |
| zyx.nano.BacillusComma 1.0 | 6 | 4% | 6 |
| qualidafial.MajorDick 1.0.1 | 6 | 4% | 5 |

## Melee bench: F09

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 65.1 | 42 / 280 | 4.14 | 13.8% | 32286 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.1 | 17.9% | 157 |
| hadur117.micro.SaorLAU 0.1 | 2.1 | 13.8% | 42 |
| kc.micro.Figment 1.0 | 2.8 | 12.9% | 37 |
| yagami.Tidus 0.11 | 4.8 | 10.3% | 0 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.6% | 21 |
| mc2.enemy.Original 0.9 | 5.3 | 9.8% | 22 |
| dft.Calliope 5.6 | 7.0 | 7.5% | 1 |
| step.nanoPri 1.0 | 8.5 | 6.3% | 0 |
| rdm.Dueler 0.4x | 9.0 | 5.4% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.9 | 61.9 | 4 / 35 | 3848 |
| 2 | 3 | 57.0 | 56.2 | 4 / 35 | 3680 |
| 3 | 2 | 60.1 | 64.1 | 5 / 35 | 3957 |
| 4 | 1 | 64.5 | 74.9 | 10 / 35 | 4412 |
| 5 | 2 | 62.4 | 72.4 | 7 / 35 | 4203 |
| 6 | 3 | 57.6 | 56.5 | 3 / 35 | 3869 |
| 7 | 2 | 62.1 | 69.8 | 4 / 35 | 4081 |
| 8 | 2 | 60.4 | 65.1 | 5 / 35 | 4236 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 57 | 14% |
| kc.micro.Figment 1.0 | 39 | 54% |
| pedersen.Grishnakh 1.0 | 8 | 25% |
| mc2.enemy.Original 0.9 | 7 | 14% |
| yagami.Tidus 0.11 | 6 | 100% |
| dft.Calliope 5.6 | 3 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 238 of 280 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 108 | 45% | 115 |
| kc.micro.Figment 1.0 | 53 | 22% | 76 |
| pedersen.Grishnakh 1.0 | 15 | 6% | 18 |
| robar.nano.Assertive_Melee 0.2 | 15 | 6% | 16 |
| yagami.Tidus 0.11 | 14 | 6% | 17 |
| mc2.enemy.Original 0.9 | 11 | 5% | 12 |
| rdm.Dueler 0.4x | 9 | 4% | 9 |
| step.nanoPri 1.0 | 7 | 3% | 7 |
| dft.Calliope 5.6 | 6 | 3% | 10 |

## Melee bench: F10

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.3 | 133 / 280 | 2.33 | 18.2% | 44359 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 18.2% | 133 |
| DTF.Kludgy 1.2b | 2.1 | 15.1% | 81 |
| ne.Chimera 1.2 | 3.0 | 13.1% | 21 |
| ejb.Polaris 1.0.1 | 4.1 | 11.8% | 25 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.3% | 13 |
| vStar.RAFzilla 2.15 | 5.5 | 10.2% | 5 |
| sam.Samspin 1.0 | 8.0 | 5.7% | 0 |
| kurios.DOSexe .9b | 8.1 | 5.6% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.6% | 0 |
| donjezza.Muncho 1.0 | 9.6 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 85.1 | 13 / 35 | 5470 |
| 2 | 1 | 67.1 | 81.9 | 16 / 35 | 5307 |
| 3 | 1 | 68.7 | 89.5 | 15 / 35 | 5531 |
| 4 | 1 | 68.3 | 87.0 | 16 / 35 | 5829 |
| 5 | 1 | 69.1 | 89.2 | 18 / 35 | 5736 |
| 6 | 1 | 68.3 | 83.8 | 20 / 35 | 5576 |
| 7 | 1 | 66.4 | 80.6 | 17 / 35 | 5094 |
| 8 | 1 | 68.7 | 85.1 | 18 / 35 | 5816 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 69 | 26% |
| ne.Chimera 1.2 | 49 | 80% |
| ejb.Polaris 1.0.1 | 49 | 78% |
| vStar.RAFzilla 2.15 | 17 | 88% |
| tvv.micro.Antares 1.1.1 | 13 | 85% |
| kurios.DOSexe .9b | 7 | 86% |
| donjezza.Muncho 1.0 | 2 | 100% |
| sam.Samspin 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 147 of 280 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 76 | 52% | 94 |
| ne.Chimera 1.2 | 28 | 19% | 66 |
| ejb.Polaris 1.0.1 | 20 | 14% | 61 |
| vStar.RAFzilla 2.15 | 9 | 6% | 21 |
| tvv.micro.Antares 1.1.1 | 7 | 5% | 18 |
| kurios.DOSexe .9b | 3 | 2% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 1% | 4 |
| donjezza.Muncho 1.0 | 1 | 1% | 3 |
| sam.Samspin 1.0 | 1 | 1% | 2 |

## Melee bench: F11

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 71.0 | 56 / 280 | 3.61 | 15.0% | 35782 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.8% | 141 |
| hadur117.micro.SaorLAU 0.1 | 2.0 | 15.0% | 56 |
| cx.mini.Nimrod 0.55 | 3.0 | 11.7% | 23 |
| djc.DynaBot 0.1.1 | 4.1 | 10.4% | 17 |
| br2.MobyDickBot 1.6 | 5.6 | 9.3% | 17 |
| rdt199.Warlord 0.73 | 6.4 | 8.9% | 17 |
| uji.YellohFellah 1.0 | 6.6 | 8.5% | 10 |
| KiraNL.Chupacabra 0.4 | 7.3 | 7.7% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.8% | 0 |
| stelo.MirrorNano 1.3 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 71.7 | 8 / 35 | 4463 |
| 2 | 2 | 63.0 | 72.7 | 6 / 35 | 4392 |
| 3 | 2 | 63.2 | 73.0 | 10 / 35 | 4253 |
| 4 | 2 | 61.8 | 68.6 | 6 / 35 | 4478 |
| 5 | 2 | 63.0 | 74.3 | 6 / 35 | 4549 |
| 6 | 2 | 63.5 | 72.7 | 7 / 35 | 4905 |
| 7 | 2 | 59.3 | 61.9 | 5 / 35 | 4046 |
| 8 | 2 | 64.0 | 73.3 | 8 / 35 | 4696 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 84 | 13% |
| cx.mini.Nimrod 0.55 | 19 | 84% |
| uji.YellohFellah 1.0 | 13 | 62% |
| rdt199.Warlord 0.73 | 11 | 73% |
| djc.DynaBot 0.1.1 | 10 | 60% |
| br2.MobyDickBot 1.6 | 7 | 57% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 224 of 280 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 123 | 55% | 132 |
| cx.mini.Nimrod 0.55 | 27 | 12% | 42 |
| KiraNL.Chupacabra 0.4 | 14 | 6% | 15 |
| rdt199.Warlord 0.73 | 12 | 5% | 23 |
| djc.DynaBot 0.1.1 | 12 | 5% | 19 |
| br2.MobyDickBot 1.6 | 12 | 5% | 18 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 4% | 10 |
| uji.YellohFellah 1.0 | 9 | 4% | 14 |
| stelo.MirrorNano 1.3 | 5 | 2% | 6 |

## Melee bench: F12

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 80.0 | 119 / 280 | 2.80 | 16.7% | 32431 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.1 | 16.7% | 119 |
| nat.PallasHawk 1.0 | 2.9 | 13.1% | 57 |
| bts.wiki.RipCurl 0.9b | 3.0 | 13.2% | 45 |
| darkcanuck.Leon 1.01 | 3.3 | 13.0% | 31 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.4% | 17 |
| jrm.Test0 1.0 | 6.3 | 8.3% | 2 |
| jp.Perpy 16.0 | 7.5 | 6.9% | 3 |
| cs.sheldor.Talon 1.1 | 7.6 | 6.9% | 0 |
| stuff.Vlad 0.1 | 9.3 | 5.8% | 3 |
| jaybot.bots.Oddball 4.0 | 9.4 | 5.7% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 85.1 | 20 / 35 | 4172 |
| 2 | 1 | 65.3 | 79.4 | 14 / 35 | 4375 |
| 3 | 1 | 65.6 | 81.0 | 13 / 35 | 4191 |
| 4 | 1 | 66.7 | 86.7 | 16 / 35 | 4096 |
| 5 | 1 | 63.7 | 74.0 | 13 / 35 | 3973 |
| 6 | 1 | 64.4 | 78.1 | 14 / 35 | 3738 |
| 7 | 2 | 62.7 | 73.0 | 11 / 35 | 3759 |
| 8 | 1 | 66.7 | 83.2 | 18 / 35 | 4127 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 57 | 47% |
| bts.wiki.RipCurl 0.9b | 50 | 64% |
| darkcanuck.Leon 1.01 | 48 | 79% |
| brainfade.melee.Genghis 0.36 | 16 | 88% |
| jaybot.bots.Oddball 4.0 | 5 | 60% |
| jp.Perpy 16.0 | 4 | 50% |
| jrm.Test0 1.0 | 3 | 100% |

Hadur died in 163 of 280 rounds, at a mean tick of 722. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 45 | 28% | 76 |
| bts.wiki.RipCurl 0.9b | 42 | 26% | 70 |
| darkcanuck.Leon 1.01 | 25 | 15% | 70 |
| brainfade.melee.Genghis 0.36 | 14 | 9% | 22 |
| jrm.Test0 1.0 | 10 | 6% | 11 |
| cs.sheldor.Talon 1.1 | 8 | 5% | 9 |
| stuff.Vlad 0.1 | 7 | 4% | 8 |
| jaybot.bots.Oddball 4.0 | 6 | 4% | 7 |
| jp.Perpy 16.0 | 6 | 4% | 7 |

## Melee bench: F13

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 67.2 | 21 / 280 | 3.95 | 13.4% | 32822 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 17.1% | 141 |
| ags.Glacier 0.2.11 | 1.5 | 16.7% | 67 |
| hadur117.micro.SaorLAU 0.1 | 3.3 | 13.4% | 21 |
| shinh.Entangled 0.3 | 4.1 | 12.4% | 35 |
| gh.micro.Gruweltje 0.7 | 4.6 | 12.0% | 16 |
| apc.Colossus2 0.17 | 6.0 | 8.1% | 0 |
| stelo.Wang 1.0 | 7.1 | 6.7% | 0 |
| ayk.WallHugger 1.0 | 8.0 | 5.3% | 0 |
| maribo.FollowFire 1 | 8.9 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 63.2 | 0 / 35 | 4279 |
| 2 | 4 | 60.9 | 65.4 | 4 / 35 | 4233 |
| 3 | 3 | 62.0 | 72.1 | 4 / 35 | 4143 |
| 4 | 3 | 61.9 | 71.1 | 1 / 35 | 4012 |
| 5 | 3 | 59.8 | 64.1 | 2 / 35 | 4146 |
| 6 | 4 | 59.3 | 63.8 | 2 / 35 | 3710 |
| 7 | 3 | 61.2 | 67.6 | 3 / 35 | 4181 |
| 8 | 3 | 61.4 | 70.5 | 5 / 35 | 4118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 35 | 11% |
| mn.Combat 3.25.0 | 28 | 39% |
| shinh.Entangled 0.3 | 20 | 20% |
| gh.micro.Gruweltje 0.7 | 4 | 25% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 259 of 280 rounds, at a mean tick of 687. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 88 | 34% | 94 |
| mn.Combat 3.25.0 | 71 | 27% | 81 |
| shinh.Entangled 0.3 | 47 | 18% | 50 |
| gh.micro.Gruweltje 0.7 | 26 | 10% | 28 |
| maribo.FollowFire 1 | 11 | 4% | 10 |
| apc.Colossus2 0.17 | 6 | 2% | 7 |
| stelo.Wang 1.0 | 6 | 2% | 6 |
| ayk.WallHugger 1.0 | 4 | 2% | 4 |

## Melee bench: F14

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 76.3 | 160 / 280 | 3.13 | 17.4% | 42001 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 17.4% | 160 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.4% | 33 |
| catcat20.shape.Theta 0.018 | 2.9 | 12.7% | 57 |
| Lo_Ian.Gandalf_V4 4.0 | 4.6 | 10.2% | 8 |
| sanyi.mikrobi.Roberto 1.0 | 5.6 | 9.6% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.6 | 9.6% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 6.1 | 9.4% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.9 | 8.1% | 11 |
| pa.Improved 1.0 | 9.0 | 6.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 81.6 | 22 / 35 | 4896 |
| 2 | 1 | 67.1 | 74.9 | 23 / 35 | 5262 |
| 3 | 1 | 67.7 | 80.3 | 21 / 35 | 5512 |
| 4 | 1 | 68.6 | 83.2 | 21 / 35 | 5844 |
| 5 | 1 | 64.1 | 72.1 | 17 / 35 | 4770 |
| 6 | 1 | 66.0 | 72.1 | 18 / 35 | 5420 |
| 7 | 1 | 63.9 | 70.2 | 16 / 35 | 4771 |
| 8 | 1 | 67.2 | 76.5 | 22 / 35 | 5526 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 97 | 90% |
| catcat20.shape.Theta 0.018 | 45 | 53% |
| co.edu.usb.rc.LidisTron 1.0 | 16 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 87% |
| sanyi.mikrobi.Roberto 1.0 | 11 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| pa.Improved 1.0 | 1 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 120 of 280 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 48 | 40% | 144 |
| catcat20.shape.Theta 0.018 | 37 | 31% | 59 |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 8% | 16 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 7% | 18 |
| sanyi.mikrobi.Roberto 1.0 | 6 | 5% | 23 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 5% | 10 |
| pa.Improved 1.0 | 2 | 2% | 5 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 2% | 4 |
| sample.TrackFire 1.0 | 1 | 1% | 1 |

## Melee bench: F15

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 84.6 | 156 / 280 | 2.39 | 19.4% | 47899 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 19.4% | 156 |
| emp.Yngwie 1.11 | 2.5 | 13.1% | 65 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.3% | 20 |
| mld.DustBunny 3.8 | 3.8 | 12.0% | 10 |
| kawigi.robot.Girl 1.2 | 5.4 | 9.3% | 14 |
| cb.nano.Insomnia 1.0 | 6.4 | 8.5% | 10 |
| Grystrion.TrackerWO 1.0 | 7.0 | 7.4% | 0 |
| lambdaxy.TBot 0.1 | 7.3 | 7.2% | 1 |
| divineomega.TrialBot 0.003 | 9.3 | 5.4% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 85.4 | 17 / 35 | 5725 |
| 2 | 1 | 69.3 | 83.5 | 18 / 35 | 6414 |
| 3 | 1 | 72.0 | 90.8 | 26 / 35 | 6556 |
| 4 | 1 | 68.6 | 83.8 | 15 / 35 | 5747 |
| 5 | 1 | 68.1 | 81.9 | 20 / 35 | 5501 |
| 6 | 1 | 69.2 | 83.5 | 23 / 35 | 5754 |
| 7 | 1 | 69.5 | 83.8 | 19 / 35 | 6302 |
| 8 | 1 | 68.4 | 84.1 | 18 / 35 | 5900 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 67 | 54% |
| kawigi.micro.Shiz 1.1 | 55 | 96% |
| mld.DustBunny 3.8 | 27 | 85% |
| kawigi.robot.Girl 1.2 | 22 | 91% |
| cb.nano.Insomnia 1.0 | 10 | 80% |
| divineomega.TrialBot 0.003 | 9 | 100% |
| lambdaxy.TBot 0.1 | 5 | 80% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 125 of 280 rounds, at a mean tick of 940. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 59 | 47% | 107 |
| mld.DustBunny 3.8 | 14 | 11% | 49 |
| cb.nano.Insomnia 1.0 | 14 | 11% | 14 |
| lambdaxy.TBot 0.1 | 10 | 8% | 13 |
| kawigi.micro.Shiz 1.1 | 9 | 7% | 45 |
| kawigi.robot.Girl 1.2 | 9 | 7% | 23 |
| divineomega.TrialBot 0.003 | 5 | 4% | 18 |
| Grystrion.TrackerWO 1.0 | 3 | 2% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 2% | 4 |

## Melee bench: F16

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 83.4 | 103 / 280 | 2.50 | 18.5% | 45723 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.1 | 18.5% | 103 |
| gh.Griezel 0.5.2 | 1.9 | 17.1% | 118 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.4% | 13 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.8% | 39 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.2% | 2 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.9% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.6% | 1 |
| repositorio.NanoStep 1.0 | 9.0 | 4.9% | 0 |
| asd.Cthulhu 1.3 | 9.0 | 4.9% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.3 | 15 / 35 | 5493 |
| 2 | 1 | 70.3 | 86.7 | 15 / 35 | 6492 |
| 3 | 1 | 67.0 | 81.0 | 13 / 35 | 5029 |
| 4 | 2 | 66.8 | 78.4 | 9 / 35 | 5411 |
| 5 | 1 | 67.9 | 79.7 | 15 / 35 | 5575 |
| 6 | 1 | 69.3 | 87.9 | 11 / 35 | 5937 |
| 7 | 1 | 68.5 | 82.2 | 11 / 35 | 5857 |
| 8 | 1 | 68.9 | 83.8 | 14 / 35 | 5929 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 118 | 32% |
| techdude.forest.FlamingForest 1.1 | 30 | 43% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 21 | 100% |
| bvh.fnr.Fenrir 0.36l | 13 | 85% |
| stelo.IntrinsicVolatility 1.4 | 8 | 100% |
| tvv.nano.Polaris 1.2 | 6 | 100% |
| divineomega.DivineBot 1.9.4.5 | 6 | 83% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 178 of 280 rounds, at a mean tick of 1442. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 105 | 59% | 148 |
| techdude.forest.FlamingForest 1.1 | 20 | 11% | 38 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 9% | 36 |
| bvh.fnr.Fenrir 0.36l | 15 | 8% | 17 |
| stelo.IntrinsicVolatility 1.4 | 10 | 6% | 14 |
| asd.Cthulhu 1.3 | 6 | 3% | 7 |
| tvv.nano.Polaris 1.2 | 3 | 2% | 8 |
| repositorio.NanoStep 1.0 | 2 | 1% | 2 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 10 |

## Melee bench: F17

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.5 | 128 / 280 | 2.66 | 17.7% | 39862 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 17.7% | 128 |
| et.Predator 1.8 | 2.9 | 13.0% | 34 |
| cx.BlestPain 1.41 | 3.3 | 12.4% | 61 |
| nic.Nicator 2.4 | 4.3 | 11.5% | 20 |
| oog.melee.Mercutio 1.0 | 4.5 | 11.5% | 23 |
| ahf.NanoAndrew .4 | 5.3 | 10.6% | 10 |
| maribo.melee.BMV 0.1 | 6.9 | 9.1% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.4 | 5.7% | 1 |
| tex.Longbot 0.4 | 8.6 | 5.6% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 81.6 | 11 / 35 | 4822 |
| 2 | 1 | 65.8 | 73.7 | 15 / 35 | 5258 |
| 3 | 1 | 66.8 | 76.8 | 20 / 35 | 4748 |
| 4 | 1 | 67.7 | 82.9 | 16 / 35 | 5177 |
| 5 | 1 | 68.1 | 86.7 | 17 / 35 | 4856 |
| 6 | 1 | 65.6 | 77.1 | 13 / 35 | 4565 |
| 7 | 1 | 68.8 | 86.3 | 18 / 35 | 5140 |
| 8 | 1 | 68.4 | 87.3 | 18 / 35 | 5296 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cx.BlestPain 1.41 | 62 | 42% |
| et.Predator 1.8 | 60 | 70% |
| oog.melee.Mercutio 1.0 | 30 | 80% |
| nic.Nicator 2.4 | 27 | 63% |
| ahf.NanoAndrew .4 | 15 | 80% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |
| goblin.Bender 2.4 | 1 | 0% |

Hadur died in 153 of 280 rounds, at a mean tick of 1068. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 54 | 35% | 78 |
| et.Predator 1.8 | 29 | 19% | 71 |
| oog.melee.Mercutio 1.0 | 20 | 13% | 45 |
| nic.Nicator 2.4 | 20 | 13% | 35 |
| ahf.NanoAndrew .4 | 14 | 9% | 30 |
| maribo.melee.BMV 0.1 | 6 | 4% | 11 |
| goblin.Bender 2.4 | 5 | 3% | 5 |
| tex.Longbot 0.4 | 4 | 3% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 2 |

## Melee bench: F18

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 85.0 | 175 / 280 | 2.35 | 18.8% | 39047 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 18.8% | 175 |
| morbid.MorbidPriest 1.0 | 2.1 | 13.1% | 39 |
| agd.Mooserwirt2 2.7 | 3.4 | 11.1% | 23 |
| uji.DBH 1.1 | 3.8 | 11.0% | 20 |
| ratosh.Nobo 0.21 | 5.5 | 9.6% | 4 |
| spinnercat.Robovirus 2.718 | 5.6 | 9.8% | 8 |
| sigterm.Sigterm 1.0 | 7.0 | 8.2% | 9 |
| kawigi.mini.Fhqwhgads 1.1 | 7.6 | 7.2% | 1 |
| stelo.WangRobot 1.0 | 9.5 | 5.7% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 83.2 | 20 / 35 | 4534 |
| 2 | 1 | 69.2 | 88.3 | 22 / 35 | 5168 |
| 3 | 1 | 68.0 | 82.5 | 21 / 35 | 4932 |
| 4 | 1 | 69.6 | 89.5 | 25 / 35 | 5144 |
| 5 | 1 | 67.6 | 81.0 | 22 / 35 | 4767 |
| 6 | 1 | 68.6 | 88.3 | 22 / 35 | 4843 |
| 7 | 1 | 67.1 | 82.5 | 22 / 35 | 4407 |
| 8 | 1 | 68.6 | 84.4 | 21 / 35 | 5252 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 63 | 75% |
| uji.DBH 1.1 | 40 | 78% |
| agd.Mooserwirt2 2.7 | 32 | 75% |
| sigterm.Sigterm 1.0 | 27 | 93% |
| spinnercat.Robovirus 2.718 | 17 | 94% |
| ratosh.Nobo 0.21 | 14 | 100% |
| stelo.WangRobot 1.0 | 13 | 92% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 80% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 105 of 280 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 37 | 35% | 99 |
| agd.Mooserwirt2 2.7 | 25 | 24% | 59 |
| uji.DBH 1.1 | 18 | 17% | 30 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 8% | 14 |
| sigterm.Sigterm 1.0 | 5 | 5% | 24 |
| ratosh.Nobo 0.21 | 4 | 4% | 20 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 4% | 10 |
| spinnercat.Robovirus 2.718 | 3 | 3% | 13 |
| stelo.WangRobot 1.0 | 1 | 1% | 11 |

## Melee bench: F19

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 92.4 | 223 / 280 | 1.69 | 21.2% | 49051 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 21.2% | 223 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.4 | 14.1% | 19 |
| mld.Infinity 2.2 | 2.6 | 13.8% | 24 |
| krillr.mini.JointStrike 2.0.0 | 4.6 | 10.4% | 6 |
| erdnis.Rover 0.3 | 4.8 | 10.4% | 3 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.6% | 4 |
| mbh.Mbh 0.1 | 7.5 | 7.1% | 0 |
| pac.ABC 2.1 | 7.9 | 6.7% | 1 |
| pbg.R2D2 1.0 | 8.5 | 6.1% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 87.6 | 27 / 35 | 6271 |
| 2 | 1 | 73.0 | 98.1 | 31 / 35 | 6124 |
| 3 | 1 | 70.3 | 88.6 | 25 / 35 | 5627 |
| 4 | 1 | 73.2 | 93.3 | 30 / 35 | 6807 |
| 5 | 1 | 72.0 | 93.0 | 28 / 35 | 6051 |
| 6 | 1 | 71.6 | 92.1 | 28 / 35 | 5986 |
| 7 | 1 | 72.4 | 94.0 | 28 / 35 | 6064 |
| 8 | 1 | 71.8 | 92.4 | 26 / 35 | 6121 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 98 | 95% |
| mld.Infinity 2.2 | 91 | 92% |
| krillr.mini.JointStrike 2.0.0 | 14 | 93% |
| patson.PatsonTestBot 1.0 | 14 | 93% |
| erdnis.Rover 0.3 | 13 | 92% |
| pbg.R2D2 1.0 | 4 | 100% |
| pac.ABC 2.1 | 3 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 59 of 280 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 17 | 29% | 28 |
| davidalves.net.DuelistMiniMelee 1.2 | 16 | 27% | 131 |
| krillr.mini.JointStrike 2.0.0 | 12 | 20% | 33 |
| erdnis.Rover 0.3 | 4 | 7% | 21 |
| patson.PatsonTestBot 1.0 | 4 | 7% | 13 |
| pac.ABC 2.1 | 3 | 5% | 11 |
| mbh.Mbh 0.1 | 1 | 2% | 17 |
| pbg.R2D2 1.0 | 1 | 2% | 17 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 86.7 | 148 / 280 | 2.20 | 19.6% | 47421 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 19.6% | 148 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.7% | 67 |
| fwb.Nine 1.0.1 | 3.5 | 11.5% | 32 |
| nz.jdc.nano.GridFu 1.0 | 4.5 | 10.4% | 3 |
| catcat20.Rabbit 0.001 | 4.5 | 9.7% | 26 |
| m3thos.mini.Eva01 0.5.5 | 5.8 | 8.2% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.1 | 7.5% | 2 |
| bayen.nut.Squirrel 1.615 | 7.6 | 7.2% | 1 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 91.7 | 18 / 35 | 6002 |
| 2 | 1 | 70.1 | 87.3 | 22 / 35 | 5983 |
| 3 | 1 | 70.7 | 89.8 | 21 / 35 | 6058 |
| 4 | 1 | 68.6 | 83.5 | 19 / 35 | 5622 |
| 5 | 1 | 68.9 | 85.7 | 12 / 35 | 6103 |
| 6 | 1 | 68.4 | 84.8 | 17 / 35 | 5461 |
| 7 | 1 | 71.2 | 91.1 | 21 / 35 | 6475 |
| 8 | 1 | 67.7 | 79.7 | 18 / 35 | 5717 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 89 | 60% |
| fwb.Nine 1.0.1 | 50 | 60% |
| nz.jdc.nano.GridFu 1.0 | 28 | 100% |
| catcat20.Rabbit 0.001 | 22 | 59% |
| bayen.nut.Squirrel 1.615 | 13 | 100% |
| m3thos.mini.Eva01 0.5.5 | 5 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 132 of 280 rounds, at a mean tick of 1144. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 71 | 54% | 116 |
| fwb.Nine 1.0.1 | 29 | 22% | 34 |
| catcat20.Rabbit 0.001 | 21 | 16% | 48 |
| nz.jdc.nano.GridFu 1.0 | 6 | 5% | 40 |
| m3thos.mini.Eva01 0.5.5 | 2 | 2% | 15 |
| bayen.nut.Squirrel 1.615 | 1 | 1% | 10 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 5 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 7 |

## Melee bench: F21

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 87.4 | 148 / 280 | 2.14 | 19.5% | 45915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 19.5% | 148 |
| eem.EvBot v4.6.16 | 2.0 | 16.5% | 99 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.6% | 15 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.8% | 7 |
| eld.Hmm 1.0 | 5.3 | 8.3% | 10 |
| oa.weak.BotherBot 0.1 | 5.9 | 7.5% | 3 |
| el.JumpShoot 0.2 | 7.6 | 6.2% | 1 |
| fire219.CatBot 1.0 | 8.0 | 6.1% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 86.7 | 21 / 35 | 5575 |
| 2 | 1 | 69.5 | 86.0 | 16 / 35 | 5889 |
| 3 | 1 | 70.0 | 88.9 | 20 / 35 | 5935 |
| 4 | 1 | 70.0 | 88.6 | 20 / 35 | 5391 |
| 5 | 1 | 69.8 | 86.3 | 19 / 35 | 5714 |
| 6 | 1 | 68.9 | 83.8 | 15 / 35 | 5401 |
| 7 | 1 | 69.7 | 87.9 | 18 / 35 | 5776 |
| 8 | 1 | 71.0 | 90.8 | 19 / 35 | 6234 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 141 | 52% |
| dummy.mini.Scimitar 1.01 | 38 | 87% |
| cf.RiO.RiOx 4.2.1 | 23 | 96% |
| eld.Hmm 1.0 | 13 | 85% |
| oa.weak.BotherBot 0.1 | 5 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 133 of 280 rounds, at a mean tick of 1166. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 78 | 59% | 128 |
| dummy.mini.Scimitar 1.01 | 22 | 17% | 68 |
| cf.RiO.RiOx 4.2.1 | 13 | 10% | 30 |
| PSW.Relentless 0.1 | 6 | 5% | 8 |
| eld.Hmm 1.0 | 5 | 4% | 26 |
| oa.weak.BotherBot 0.1 | 3 | 2% | 12 |
| fire219.CatBot 1.0 | 3 | 2% | 4 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 81.8 | 111 / 280 | 2.64 | 18.6% | 47680 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.1 | 18.6% | 111 |
| pe.SandboxLump 1.52 | 1.9 | 17.2% | 96 |
| cre.Karolos 0.32 | 3.0 | 14.2% | 52 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 9.6% | 8 |
| stelo.RamTrackSurfer 1.2 | 5.1 | 9.4% | 9 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.2% | 1 |
| cw.megas.Blade 0.8 | 6.9 | 8.4% | 0 |
| sample.Walls 1.0 | 7.8 | 7.8% | 3 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.7% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 82.5 | 13 / 35 | 6156 |
| 2 | 1 | 69.4 | 81.6 | 14 / 35 | 6134 |
| 3 | 1 | 72.0 | 92.1 | 21 / 35 | 6539 |
| 4 | 1 | 68.2 | 78.4 | 17 / 35 | 5582 |
| 5 | 2 | 67.9 | 77.8 | 8 / 35 | 5734 |
| 6 | 1 | 68.2 | 81.6 | 11 / 35 | 5265 |
| 7 | 1 | 68.7 | 80.6 | 12 / 35 | 6579 |
| 8 | 1 | 68.9 | 80.0 | 15 / 35 | 5691 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 118 | 47% |
| cre.Karolos 0.32 | 44 | 52% |
| stelo.AreaTargetingBot 1.1 | 16 | 88% |
| stelo.RamTrackSurfer 1.2 | 8 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 100% |
| sample.Walls 1.0 | 4 | 100% |

Hadur died in 169 of 280 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 93 | 55% | 145 |
| cre.Karolos 0.32 | 38 | 22% | 68 |
| stelo.AreaTargetingBot 1.1 | 11 | 7% | 21 |
| cw.megas.Blade 0.8 | 10 | 6% | 12 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 4% | 11 |
| stelo.RamTrackSurfer 1.2 | 6 | 4% | 16 |
| sample.Walls 1.0 | 3 | 2% | 4 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F24

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 69.7 | 63 / 280 | 3.73 | 14.5% | 32503 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.9 | 14.5% | 63 |
| florent.XSeries.X2 0.12 | 2.3 | 14.3% | 70 |
| rz.GlowBlowMelee 1.4 | 2.4 | 13.9% | 57 |
| davidalves.Phoenix 0.54 | 4.0 | 12.9% | 58 |
| pedersen.Ugluk 1.1.1 | 4.6 | 11.7% | 23 |
| oog.melee.Corsair 1.0 | 5.9 | 9.1% | 5 |
| lunchie.Lunchbox 0.93 | 7.6 | 6.3% | 0 |
| stelo.SoJNanoMelee 1.1 | 7.6 | 7.0% | 6 |
| as.FrankTheTank 1.3 | 9.1 | 5.4% | 0 |
| evd.X1 0.01 | 9.6 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.6 | 63.5 | 6 / 35 | 4300 |
| 2 | 1 | 63.7 | 75.9 | 8 / 35 | 4165 |
| 3 | 1 | 61.2 | 67.3 | 10 / 35 | 3783 |
| 4 | 4 | 60.2 | 66.0 | 4 / 35 | 4076 |
| 5 | 1 | 64.7 | 79.0 | 11 / 35 | 4188 |
| 6 | 4 | 60.6 | 67.0 | 6 / 35 | 3911 |
| 7 | 1 | 62.0 | 70.2 | 8 / 35 | 3988 |
| 8 | 1 | 61.8 | 68.6 | 10 / 35 | 4092 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 41 | 44% |
| davidalves.Phoenix 0.54 | 25 | 40% |
| florent.XSeries.X2 0.12 | 22 | 41% |
| pedersen.Ugluk 1.1.1 | 15 | 67% |
| stelo.SoJNanoMelee 1.1 | 13 | 92% |
| oog.melee.Corsair 1.0 | 4 | 75% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 219 of 280 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 76 | 35% | 85 |
| rz.GlowBlowMelee 1.4 | 47 | 21% | 62 |
| davidalves.Phoenix 0.54 | 38 | 17% | 48 |
| pedersen.Ugluk 1.1.1 | 24 | 11% | 34 |
| oog.melee.Corsair 1.0 | 10 | 5% | 19 |
| as.FrankTheTank 1.3 | 8 | 4% | 8 |
| evd.X1 0.01 | 7 | 3% | 8 |
| stelo.SoJNanoMelee 1.1 | 5 | 2% | 13 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 3 |
2 death(s) with no robot to name.

## Melee bench: F25

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 84.1 | 182 / 280 | 2.43 | 18.6% | 35722 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 18.6% | 182 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.0% | 18 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.3% | 18 |
| jdw.Hurricane 1.4 | 3.6 | 11.7% | 30 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.6% | 17 |
| ds.Oo 2.2 | 5.5 | 9.0% | 6 |
| gjr.Cephalosporin 0.1 | 7.9 | 7.2% | 5 |
| awesomeness.Elite 1.0 | 8.0 | 7.0% | 2 |
| adt.Ar2 1.1 | 8.0 | 7.1% | 4 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 81.0 | 21 / 35 | 4526 |
| 2 | 1 | 70.1 | 90.8 | 26 / 35 | 4733 |
| 3 | 1 | 65.7 | 75.9 | 19 / 35 | 4227 |
| 4 | 1 | 68.0 | 85.7 | 21 / 35 | 4288 |
| 5 | 1 | 68.3 | 84.4 | 23 / 35 | 4577 |
| 6 | 1 | 68.3 | 87.0 | 23 / 35 | 4549 |
| 7 | 1 | 65.1 | 74.0 | 18 / 35 | 4385 |
| 8 | 1 | 70.6 | 94.3 | 31 / 35 | 4437 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 69 | 93% |
| voidious.micro.BlitzBat 1.05 | 49 | 94% |
| jdw.Hurricane 1.4 | 42 | 90% |
| ds.Oo 2.2 | 15 | 87% |
| gjr.Cephalosporin 0.1 | 15 | 93% |
| gre.svman4.Morfeas 1.4.1 | 8 | 50% |
| awesomeness.Elite 1.0 | 3 | 67% |
| adt.Ar2 1.1 | 1 | 100% |

Hadur died in 99 of 280 rounds, at a mean tick of 558. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 24 | 24% | 61 |
| voidious.mini.BrokenSword 2.0.3 | 19 | 19% | 78 |
| voidious.micro.BlitzBat 1.05 | 14 | 14% | 54 |
| ds.Oo 2.2 | 12 | 12% | 26 |
| gre.svman4.Morfeas 1.4.1 | 10 | 10% | 22 |
| awesomeness.Elite 1.0 | 6 | 6% | 10 |
| amk.ChumbaMini 0.2 | 6 | 6% | 6 |
| adt.Ar2 1.1 | 5 | 5% | 9 |
| gjr.Cephalosporin 0.1 | 2 | 2% | 14 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.7 | 122 / 280 | 2.47 | 18.1% | 44293 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 18.1% | 122 |
| ak.Fermat 2.0 | 2.1 | 14.9% | 76 |
| lrem.Spectre 0.4.4 | 3.3 | 12.4% | 33 |
| shu.nitro.LENIN .T34 | 3.8 | 12.1% | 30 |
| js.PinBall 1.6 | 4.9 | 10.6% | 12 |
| gh.mini.GrubbmOne 1.0 | 6.3 | 9.5% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.8 | 9.1% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.7% | 2 |
| sample.SpinBot 1.0 | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 85.4 | 17 / 35 | 5369 |
| 2 | 1 | 66.8 | 82.2 | 14 / 35 | 5018 |
| 3 | 1 | 69.7 | 89.5 | 18 / 35 | 5697 |
| 4 | 1 | 66.4 | 78.7 | 15 / 35 | 5259 |
| 5 | 1 | 67.2 | 81.0 | 14 / 35 | 5403 |
| 6 | 1 | 68.0 | 84.8 | 14 / 35 | 5366 |
| 7 | 1 | 69.2 | 84.4 | 15 / 35 | 6266 |
| 8 | 1 | 68.3 | 83.5 | 15 / 35 | 5915 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 68 | 41% |
| lrem.Spectre 0.4.4 | 46 | 65% |
| shu.nitro.LENIN .T34 | 45 | 71% |
| js.PinBall 1.6 | 12 | 67% |
| jaybot.adv.bots.JayBot 2.0 | 11 | 100% |
| gh.mini.GrubbmOne 1.0 | 8 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 80% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 158 of 280 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 75 | 47% | 98 |
| lrem.Spectre 0.4.4 | 27 | 17% | 47 |
| shu.nitro.LENIN .T34 | 25 | 16% | 66 |
| fullsail.LaxativeTeaTwo 1.0 | 9 | 6% | 15 |
| jaybot.adv.bots.JayBot 2.0 | 8 | 5% | 21 |
| js.PinBall 1.6 | 8 | 5% | 20 |
| sample.SpinBot 1.0 | 4 | 3% | 5 |
| gh.mini.GrubbmOne 1.0 | 2 | 1% | 8 |

## Melee bench: F27

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 77.3 | 158 / 280 | 3.04 | 17.3% | 36527 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.4 | 17.3% | 158 |
| mk.Alpha 0.2.1 | 2.3 | 13.7% | 65 |
| wee.Gem 1.8.4 | 4.1 | 10.5% | 21 |
| EH.Eagle 1.0.6 | 4.4 | 10.3% | 10 |
| sheldor.melee.nano.TestMelee 0.1 | 4.6 | 10.5% | 14 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 9.2% | 2 |
| joe.ADinosaur 1.0 | 6.9 | 8.5% | 2 |
| throxbot.ThroxBot 0.1 | 7.3 | 8.4% | 8 |
| caimano.Furia_Ceca 0.22 | 8.5 | 7.3% | 3 |
| cs.Grudge 1.0 | 9.6 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.2 | 42.9 | 5 / 35 | 3880 |
| 2 | 1 | 65.0 | 73.0 | 21 / 35 | 4474 |
| 3 | 1 | 67.6 | 84.4 | 21 / 35 | 4743 |
| 4 | 1 | 68.9 | 87.3 | 23 / 35 | 4772 |
| 5 | 1 | 66.7 | 82.5 | 20 / 35 | 4554 |
| 6 | 1 | 68.4 | 85.7 | 25 / 35 | 4845 |
| 7 | 1 | 65.6 | 76.5 | 18 / 35 | 4497 |
| 8 | 1 | 68.3 | 86.3 | 25 / 35 | 4762 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 82 | 73% |
| wee.Gem 1.8.4 | 35 | 83% |
| sheldor.melee.nano.TestMelee 0.1 | 24 | 100% |
| EH.Eagle 1.0.6 | 22 | 95% |
| techdude.kombat.FlamingKombat 1.5 | 14 | 100% |
| throxbot.ThroxBot 0.1 | 7 | 71% |
| joe.ADinosaur 1.0 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |

Hadur died in 124 of 280 rounds, at a mean tick of 570. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 42 | 34% | 99 |
| joe.ADinosaur 1.0 | 16 | 13% | 19 |
| wee.Gem 1.8.4 | 14 | 11% | 35 |
| cs.Grudge 1.0 | 14 | 11% | 13 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 9% | 34 |
| caimano.Furia_Ceca 0.22 | 9 | 7% | 14 |
| techdude.kombat.FlamingKombat 1.5 | 8 | 6% | 29 |
| throxbot.ThroxBot 0.1 | 7 | 6% | 12 |
| EH.Eagle 1.0.6 | 3 | 2% | 25 |

## Melee bench: F28

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 84.1 | 163 / 280 | 2.43 | 18.0% | 34357 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 18.0% | 163 |
| kid.test.NightFox .2 | 2.0 | 15.1% | 53 |
| uji.Antique 1.0 | 3.8 | 11.4% | 22 |
| qohnil.blot.BlotBot 3.61 | 3.9 | 11.0% | 23 |
| pfvicm.Sobieski 7.2.3b | 4.6 | 10.0% | 8 |
| amk.ChumbaWumba 0.3 | 6.4 | 8.1% | 3 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.2% | 6 |
| matt.advanced.Katana 1.0 | 8.1 | 6.7% | 1 |
| stelo.PianistNano 1.2 | 9.3 | 5.6% | 1 |
| stelo.Lifestealer 1.0 | 9.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 89.5 | 23 / 35 | 4353 |
| 2 | 1 | 67.5 | 85.7 | 21 / 35 | 4347 |
| 3 | 1 | 66.7 | 80.6 | 19 / 35 | 4710 |
| 4 | 1 | 68.1 | 88.6 | 20 / 35 | 4391 |
| 5 | 1 | 65.5 | 81.9 | 17 / 35 | 3751 |
| 6 | 1 | 65.8 | 78.4 | 19 / 35 | 4301 |
| 7 | 1 | 66.1 | 80.0 | 21 / 35 | 4137 |
| 8 | 1 | 68.2 | 87.9 | 23 / 35 | 4367 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 104 | 76% |
| uji.Antique 1.0 | 52 | 87% |
| qohnil.blot.BlotBot 3.61 | 22 | 55% |
| pfvicm.Sobieski 7.2.3b | 12 | 92% |
| ahr.ice.Ice 1.0.2 | 8 | 88% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| stelo.Lifestealer 1.0 | 2 | 100% |
| amk.ChumbaWumba 0.3 | 2 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 118 of 280 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 35 | 30% | 93 |
| pfvicm.Sobieski 7.2.3b | 21 | 18% | 26 |
| qohnil.blot.BlotBot 3.61 | 17 | 14% | 32 |
| amk.ChumbaWumba 0.3 | 17 | 14% | 23 |
| uji.Antique 1.0 | 13 | 11% | 70 |
| stelo.Lifestealer 1.0 | 8 | 7% | 9 |
| ahr.ice.Ice 1.0.2 | 6 | 5% | 17 |
| matt.advanced.Katana 1.0 | 1 | 1% | 5 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |

## Melee bench: F29

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 81.0 | 99 / 280 | 2.71 | 17.7% | 39313 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 17.7% | 99 |
| deewiant.Anomaly 0.2 | 2.5 | 14.4% | 70 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 14.6% | 78 |
| myl.micro.Troodon 1.10 | 4.3 | 11.0% | 8 |
| jok.PheonixM 0.1.2 | 4.9 | 10.5% | 9 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.6% | 0 |
| DBall.Anarchy 0.1 | 7.1 | 7.3% | 12 |
| fullsail.TimbotNoPrediction 1.0 | 8.1 | 5.9% | 0 |
| ap.Frederick 1.1 | 9.0 | 5.2% | 2 |
| jangs.ns51 1.0 | 9.6 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 80.3 | 15 / 35 | 4870 |
| 2 | 1 | 64.7 | 76.2 | 10 / 35 | 4103 |
| 3 | 1 | 65.3 | 76.8 | 9 / 35 | 4529 |
| 4 | 1 | 67.2 | 79.7 | 13 / 35 | 5424 |
| 5 | 1 | 68.2 | 85.7 | 14 / 35 | 5011 |
| 6 | 1 | 66.6 | 79.4 | 11 / 35 | 4761 |
| 7 | 1 | 66.5 | 80.0 | 9 / 35 | 4940 |
| 8 | 1 | 70.1 | 90.2 | 18 / 35 | 5675 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 79 | 42% |
| zyx.mega.YersiniaPestis 3.1 | 54 | 26% |
| myl.micro.Troodon 1.10 | 21 | 95% |
| jok.PheonixM 0.1.2 | 16 | 100% |
| DBall.Anarchy 0.1 | 10 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 182 of 280 rounds, at a mean tick of 1044. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 77 | 42% | 94 |
| deewiant.Anomaly 0.2 | 74 | 41% | 106 |
| myl.micro.Troodon 1.10 | 8 | 4% | 24 |
| jok.PheonixM 0.1.2 | 8 | 4% | 21 |
| fullsail.TimbotNoPrediction 1.0 | 6 | 3% | 7 |
| ph.melee.ArcherME 0.3 | 5 | 3% | 11 |
| DBall.Anarchy 0.1 | 2 | 1% | 13 |
| jangs.ns51 1.0 | 2 | 1% | 4 |

## Melee bench: F30

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 58.4 | 40 / 280 | 4.75 | 12.6% | 33114 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 1.6 | 14.1% | 65 |
| catcat20.Matcha 0.006 | 2.5 | 13.6% | 67 |
| oog.melee.Capulet 1.2 | 2.8 | 13.4% | 46 |
| hadur117.micro.SaorLAU 0.1 | 3.6 | 12.6% | 40 |
| stelo.PastFuture 2.3.2 | 4.5 | 12.0% | 34 |
| intruder.PrairieWolf 2.61 | 6.1 | 9.2% | 15 |
| ntc.Opposite 1.5 | 7.6 | 7.7% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.1 | 7.2% | 7 |
| tripphippy.Alice 1.1 | 8.1 | 7.3% | 6 |
| GarmBox.Anger 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.8 | 55.2 | 4 / 35 | 4362 |
| 2 | 2 | 60.3 | 67.0 | 6 / 35 | 3958 |
| 3 | 4 | 56.7 | 53.0 | 4 / 35 | 4442 |
| 4 | 1 | 60.3 | 66.7 | 6 / 35 | 4204 |
| 5 | 5 | 56.6 | 54.0 | 5 / 35 | 3860 |
| 6 | 5 | 56.9 | 57.5 | 5 / 35 | 3913 |
| 7 | 4 | 57.4 | 54.0 | 7 / 35 | 4260 |
| 8 | 4 | 58.2 | 59.7 | 3 / 35 | 4115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 24 | 50% |
| catcat20.Matcha 0.006 | 19 | 21% |
| oog.melee.Capulet 1.2 | 16 | 69% |
| stelo.PastFuture 2.3.2 | 12 | 58% |
| intruder.PrairieWolf 2.61 | 5 | 20% |
| tripphippy.Alice 1.1 | 2 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 241 of 280 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 56 | 23% | 67 |
| darkcanuck.B26354 1.06 | 52 | 22% | 65 |
| catcat20.Matcha 0.006 | 49 | 20% | 56 |
| stelo.PastFuture 2.3.2 | 32 | 13% | 37 |
| tripphippy.Alice 1.1 | 15 | 6% | 16 |
| fowl3628800.LightningBolt 2.6.0 | 14 | 6% | 14 |
| intruder.PrairieWolf 2.61 | 13 | 5% | 14 |
| ntc.Opposite 1.5 | 7 | 3% | 8 |
| GarmBox.Anger 1.0 | 3 | 1% | 3 |

## Melee bench: F31

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 72.7 | 36 / 280 | 3.46 | 14.5% | 30504 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.8% | 159 |
| hadur117.micro.SaorLAU 0.1 | 2.1 | 14.5% | 36 |
| gh.mini.Griezel 0.2 | 3.1 | 13.3% | 69 |
| spinnercat.micro.Tyger 0.1 | 4.4 | 11.1% | 7 |
| d414.nano.Quantum 1.0.0 | 4.5 | 10.8% | 8 |
| gh.nano.Grofvuil 0.2 | 5.9 | 8.8% | 1 |
| timmit.nano.TimDog 0.33 | 7.4 | 6.9% | 2 |
| fm.mammillarias 1.3 | 8.0 | 6.0% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.6 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 70.5 | 5 / 35 | 4048 |
| 2 | 2 | 61.7 | 70.2 | 3 / 35 | 3878 |
| 3 | 2 | 63.0 | 75.2 | 2 / 35 | 4128 |
| 4 | 2 | 64.0 | 76.5 | 5 / 35 | 4175 |
| 5 | 2 | 62.8 | 75.2 | 8 / 35 | 3560 |
| 6 | 3 | 61.6 | 71.1 | 4 / 35 | 3646 |
| 7 | 2 | 60.9 | 70.2 | 6 / 35 | 3480 |
| 8 | 2 | 61.8 | 72.7 | 3 / 35 | 3589 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 66 | 12% |
| gh.mini.Griezel 0.2 | 41 | 15% |
| spinnercat.micro.Tyger 0.1 | 12 | 83% |
| d414.nano.Quantum 1.0.0 | 8 | 88% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| fm.mammillarias 1.3 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 0% |

Hadur died in 244 of 280 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 125 | 51% | 134 |
| gh.mini.Griezel 0.2 | 54 | 22% | 62 |
| spinnercat.micro.Tyger 0.1 | 17 | 7% | 23 |
| timmit.nano.TimDog 0.33 | 15 | 6% | 16 |
| d414.nano.Quantum 1.0.0 | 12 | 5% | 21 |
| gh.nano.Grofvuil 0.2 | 11 | 5% | 15 |
| Gecko.ultimateGeckoBot 1.0 | 4 | 2% | 4 |
| fm.mammillarias 1.3 | 3 | 1% | 3 |
| tlp.ThreeLeggedPig 1 | 3 | 1% | 2 |

## Melee bench: F32

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 79.3 | 114 / 280 | 2.86 | 17.0% | 39118 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.4 | 17.0% | 114 |
| kawigi.sbf.FloodHT 0.9.2 | 1.6 | 15.6% | 101 |
| apc.botM 3.0 | 3.5 | 11.7% | 23 |
| vjik.UnViolation 1.1 | 3.9 | 10.7% | 20 |
| lxx.ConceptA 0.8 | 4.8 | 9.9% | 5 |
| bayen.UbaMicro 1.4 | 5.9 | 8.9% | 5 |
| panzer.Panzer 0.2 | 7.6 | 7.3% | 1 |
| yk.JahMicro 1.0 | 7.6 | 7.1% | 6 |
| conscience.Electron 1.3g | 9.0 | 6.2% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.5% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 79.7 | 13 / 35 | 5172 |
| 2 | 1 | 66.2 | 82.9 | 18 / 35 | 4759 |
| 3 | 2 | 63.1 | 70.2 | 13 / 35 | 4665 |
| 4 | 2 | 65.1 | 79.4 | 10 / 35 | 4757 |
| 5 | 1 | 65.2 | 78.4 | 14 / 35 | 4870 |
| 6 | 1 | 67.7 | 85.4 | 15 / 35 | 5028 |
| 7 | 2 | 64.4 | 72.7 | 16 / 35 | 4771 |
| 8 | 1 | 67.2 | 86.0 | 15 / 35 | 5096 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 94 | 28% |
| apc.botM 3.0 | 37 | 78% |
| lxx.ConceptA 0.8 | 18 | 94% |
| vjik.UnViolation 1.1 | 13 | 69% |
| yk.JahMicro 1.0 | 13 | 77% |
| panzer.Panzer 0.2 | 9 | 100% |
| bayen.UbaMicro 1.4 | 8 | 75% |
| donjezza.Jezza 1.0 | 7 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 167 of 280 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 88 | 53% | 121 |
| apc.botM 3.0 | 16 | 10% | 55 |
| lxx.ConceptA 0.8 | 16 | 10% | 23 |
| bayen.UbaMicro 1.4 | 14 | 8% | 22 |
| vjik.UnViolation 1.1 | 13 | 8% | 29 |
| yk.JahMicro 1.0 | 7 | 4% | 10 |
| conscience.Electron 1.3g | 7 | 4% | 9 |
| panzer.Panzer 0.2 | 6 | 4% | 9 |
| donjezza.Jezza 1.0 | 0 | 0% | 2 |

## Melee bench: F33

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 83.5 | 153 / 280 | 2.49 | 18.9% | 42009 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 18.9% | 153 |
| maribo.Quester 0.3 | 2.0 | 15.9% | 66 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.8% | 24 |
| labg.Cataclysm 2.05 | 4.3 | 10.5% | 17 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 10.6% | 13 |
| baal.nano.N 1.42 | 6.3 | 8.6% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.9 | 7.8% | 5 |
| zyx.micro.Ant 1.1 | 8.3 | 5.7% | 0 |
| sanja.First 0.1 | 8.8 | 5.6% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.9 | 3.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 83.2 | 19 / 35 | 4721 |
| 2 | 1 | 71.1 | 89.8 | 25 / 35 | 5418 |
| 3 | 1 | 70.1 | 87.6 | 20 / 35 | 5369 |
| 4 | 1 | 66.1 | 76.8 | 17 / 35 | 4485 |
| 5 | 1 | 71.3 | 90.8 | 20 / 35 | 6096 |
| 6 | 1 | 68.6 | 81.6 | 17 / 35 | 5399 |
| 7 | 1 | 68.7 | 81.6 | 20 / 35 | 5438 |
| 8 | 1 | 66.3 | 76.2 | 15 / 35 | 5083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 75 | 60% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 67 | 91% |
| gre.svman4.Leonidas 1.3.2 | 34 | 91% |
| labg.Cataclysm 2.05 | 8 | 63% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 88% |
| baal.nano.N 1.42 | 3 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 129 of 280 rounds, at a mean tick of 934. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 60 | 47% | 113 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 15% | 70 |
| kinsen.melee.Angsaichmophobia 1.8c | 15 | 12% | 20 |
| gre.svman4.Leonidas 1.3.2 | 12 | 9% | 37 |
| labg.Cataclysm 2.05 | 8 | 6% | 18 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 7 | 5% | 7 |
| zyx.micro.Ant 1.1 | 5 | 4% | 5 |
| baal.nano.N 1.42 | 2 | 2% | 8 |
| sanja.First 0.1 | 1 | 1% | 2 |

## Melee bench: F34

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 76.3 | 51 / 280 | 3.13 | 16.0% | 39364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.8 | 16.8% | 117 |
| kid.Gladiator .7.2 | 1.8 | 16.4% | 80 |
| hadur117.micro.SaorLAU 0.1 | 2.5 | 16.0% | 51 |
| tcf.Reach 3 | 4.5 | 11.0% | 10 |
| jcs.Seth 1.8 | 4.5 | 11.5% | 20 |
| cli.Dancer 1.1 | 6.0 | 9.3% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 6.9% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.2% | 0 |
| sample.VelociRobot 1.0 | 9.4 | 3.7% | 0 |
| sample.RamFire 1.0 | 9.6 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 74.9 | 6 / 35 | 4768 |
| 2 | 3 | 65.4 | 76.5 | 4 / 35 | 4875 |
| 3 | 3 | 64.3 | 72.4 | 5 / 35 | 5134 |
| 4 | 3 | 65.8 | 80.0 | 4 / 35 | 4876 |
| 5 | 3 | 65.1 | 75.2 | 7 / 35 | 4673 |
| 6 | 2 | 66.5 | 76.8 | 13 / 35 | 4919 |
| 7 | 3 | 64.5 | 72.7 | 5 / 35 | 4936 |
| 8 | 1 | 66.9 | 82.2 | 7 / 35 | 5183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 66 | 27% |
| kid.Gladiator .7.2 | 50 | 24% |
| jcs.Seth 1.8 | 20 | 70% |
| tcf.Reach 3 | 7 | 29% |
| cli.Dancer 1.1 | 3 | 100% |
| ratosh.Wesco 1.4 | 2 | 100% |

Hadur died in 229 of 280 rounds, at a mean tick of 995. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 93 | 41% | 102 |
| stelo.Spread 0.9 | 89 | 39% | 106 |
| tcf.Reach 3 | 18 | 8% | 25 |
| jcs.Seth 1.8 | 14 | 6% | 25 |
| ratosh.Wesco 1.4 | 6 | 3% | 6 |
| cli.Dancer 1.1 | 4 | 2% | 9 |
| sample.RamFire 1.0 | 4 | 2% | 4 |
| amk.Punbot.Punbot 0.01 | 1 | 0% | 2 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F35

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 71.3 | 23 / 280 | 3.58 | 14.0% | 29609 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.1% | 212 |
| hadur117.micro.SaorLAU 0.1 | 2.1 | 14.0% | 23 |
| gh.mini.Gruwel 0.9 | 3.1 | 12.8% | 27 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 12.4% | 11 |
| rz.HawkOnFire 0.1 | 4.8 | 11.3% | 7 |
| myl.nano.KomoriNinja 1.1 | 6.9 | 6.9% | 0 |
| wit.Chuliath 1.0 | 7.1 | 6.5% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.4% | 0 |
| dans.Cinnamon 1.2 | 8.9 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.6 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 73.3 | 5 / 35 | 3877 |
| 2 | 2 | 61.7 | 70.8 | 2 / 35 | 3595 |
| 3 | 2 | 63.5 | 77.1 | 3 / 35 | 3779 |
| 4 | 2 | 61.2 | 68.9 | 3 / 35 | 3975 |
| 5 | 2 | 61.4 | 72.1 | 2 / 35 | 3547 |
| 6 | 2 | 60.5 | 65.4 | 2 / 35 | 3607 |
| 7 | 3 | 60.3 | 66.7 | 1 / 35 | 3571 |
| 8 | 2 | 62.8 | 76.5 | 5 / 35 | 3658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 61 | 7% |
| gh.mini.Gruwel 0.9 | 18 | 28% |
| dmh.robocode.robot.BlackDeath 9.2 | 14 | 64% |
| rz.HawkOnFire 0.1 | 8 | 63% |

Hadur died in 257 of 280 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 146 | 57% | 150 |
| gh.mini.Gruwel 0.9 | 46 | 18% | 55 |
| dmh.robocode.robot.BlackDeath 9.2 | 32 | 12% | 41 |
| rz.HawkOnFire 0.1 | 19 | 7% | 22 |
| stelo.MyAgileRobot 0.2 | 7 | 3% | 5 |
| wit.Chuliath 1.0 | 3 | 1% | 3 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 1% | 3 |
| myl.nano.KomoriNinja 1.1 | 1 | 0% | 1 |

## Melee bench: F36

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 85.0 | 197 / 280 | 2.35 | 19.9% | 44881 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 19.9% | 197 |
| bzdp.Pansy 2.1 | 3.1 | 12.1% | 16 |
| alpha.RainingFire 1.0 | 3.3 | 12.0% | 23 |
| bvh.micro.Freya 0.3 | 3.6 | 11.2% | 14 |
| mz.Cork 0.1 | 4.0 | 11.0% | 12 |
| m3thos.Eva02 0.7.1 | 6.4 | 8.7% | 5 |
| bvh.mini.Fenrir 0.39 | 6.6 | 8.5% | 6 |
| squidM.TentalceMeleeNano 1.1 | 8.1 | 6.7% | 4 |
| dl.BetterWalls 1.0 | 9.1 | 5.4% | 1 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 74.3 | 20 / 35 | 5590 |
| 2 | 1 | 71.0 | 87.9 | 25 / 35 | 6181 |
| 3 | 1 | 71.0 | 89.2 | 28 / 35 | 5583 |
| 4 | 1 | 67.0 | 78.4 | 23 / 35 | 4828 |
| 5 | 1 | 70.7 | 89.2 | 27 / 35 | 5562 |
| 6 | 1 | 71.2 | 91.4 | 28 / 35 | 5688 |
| 7 | 1 | 67.3 | 77.1 | 18 / 35 | 5390 |
| 8 | 1 | 71.9 | 92.7 | 28 / 35 | 6059 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 70 | 96% |
| bvh.micro.Freya 0.3 | 48 | 94% |
| mz.Cork 0.1 | 28 | 89% |
| alpha.RainingFire 1.0 | 27 | 70% |
| bvh.mini.Fenrir 0.39 | 24 | 96% |
| m3thos.Eva02 0.7.1 | 8 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 83 of 280 rounds, at a mean tick of 589. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 18 | 22% | 42 |
| mz.Cork 0.1 | 17 | 20% | 47 |
| bzdp.Pansy 2.1 | 11 | 13% | 74 |
| bvh.mini.Fenrir 0.39 | 10 | 12% | 24 |
| bvh.micro.Freya 0.3 | 8 | 10% | 39 |
| m3thos.Eva02 0.7.1 | 8 | 10% | 21 |
| dl.BetterWalls 1.0 | 5 | 6% | 16 |
| squidM.TentalceMeleeNano 1.1 | 4 | 5% | 7 |
| sample.MyFirstRobot 1.0 | 2 | 2% | 10 |

## Melee bench: F37

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.2 | 188 / 280 | 2.69 | 18.5% | 44607 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 18.5% | 188 |
| germ.TheMind .2 | 3.3 | 10.3% | 18 |
| EBBU.Sim2 1.02 | 3.4 | 10.2% | 6 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.4 | 10.5% | 18 |
| stelo.UntouchableNano 1.3 | 5.9 | 9.2% | 13 |
| agrach.Dalek 1.0 | 6.3 | 9.0% | 15 |
| mb.Beast 0.1 | 7.5 | 8.1% | 11 |
| lmk.ACPFinal 0.1 | 8.0 | 8.0% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 8.1 | 8.2% | 3 |
| skm.Ryubot 1.0 | 8.3 | 8.0% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 88.6 | 26 / 35 | 6129 |
| 2 | 1 | 67.9 | 83.5 | 26 / 35 | 5660 |
| 3 | 1 | 68.7 | 86.3 | 27 / 35 | 5708 |
| 4 | 1 | 67.6 | 82.5 | 23 / 35 | 5872 |
| 5 | 1 | 62.2 | 64.1 | 16 / 35 | 5067 |
| 6 | 1 | 68.5 | 85.1 | 26 / 35 | 5505 |
| 7 | 1 | 63.7 | 70.5 | 19 / 35 | 4980 |
| 8 | 1 | 69.1 | 88.9 | 25 / 35 | 5686 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| EBBU.Sim2 1.02 | 42 | 95% |
| germ.TheMind .2 | 32 | 94% |
| skm.Ryubot 1.0 | 30 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 30 | 83% |
| stelo.UntouchableNano 1.3 | 24 | 100% |
| mb.Beast 0.1 | 17 | 88% |
| lmk.ACPFinal 0.1 | 14 | 86% |
| agrach.Dalek 1.0 | 10 | 90% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 100% |

Hadur died in 92 of 280 rounds, at a mean tick of 310. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 24 | 26% | 29 |
| agrach.Dalek 1.0 | 16 | 17% | 33 |
| EBBU.Sim2 1.02 | 13 | 14% | 44 |
| com.syncleus.robocode.Dreadnaught 0.1 | 11 | 12% | 51 |
| lmk.ACPFinal 0.1 | 11 | 12% | 21 |
| mb.Beast 0.1 | 6 | 7% | 24 |
| germ.TheMind .2 | 5 | 5% | 38 |
| stelo.UntouchableNano 1.3 | 4 | 4% | 15 |
| skm.Ryubot 1.0 | 2 | 2% | 17 |

## Melee bench: F38

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 75.4 | 89 / 280 | 3.21 | 15.9% | 35386 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.4 | 16.5% | 122 |
| hadur117.micro.SaorLAU 0.1 | 1.6 | 15.9% | 89 |
| bvh.mini.Freya 0.55 | 3.4 | 12.2% | 17 |
| bts.mega.Gnarly 1.4 | 4.1 | 11.0% | 24 |
| cs.Wren 1.0 | 5.3 | 10.5% | 8 |
| kdf.KoulDestroyer 1.0 | 6.0 | 9.5% | 8 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.3 | 9.5% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 6.3% | 2 |
| matt.UnderDark3 2.4.34 | 9.4 | 4.5% | 1 |
| bzdp.BoxCar 2.0 | 9.4 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 76.8 | 13 / 35 | 4728 |
| 2 | 2 | 62.2 | 70.5 | 8 / 35 | 4121 |
| 3 | 2 | 63.0 | 70.2 | 7 / 35 | 4372 |
| 4 | 2 | 64.7 | 75.9 | 13 / 35 | 4377 |
| 5 | 1 | 65.3 | 77.1 | 10 / 35 | 4858 |
| 6 | 2 | 66.2 | 82.9 | 13 / 35 | 4307 |
| 7 | 1 | 64.8 | 77.1 | 14 / 35 | 4351 |
| 8 | 2 | 63.4 | 73.0 | 11 / 35 | 4272 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 77 | 21% |
| bts.mega.Gnarly 1.4 | 29 | 79% |
| bvh.mini.Freya 0.55 | 24 | 83% |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 86% |
| cs.Wren 1.0 | 12 | 100% |
| kdf.KoulDestroyer 1.0 | 5 | 80% |
| matt.UnderDark3 2.4.34 | 1 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 192 of 280 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 100 | 52% | 120 |
| bts.mega.Gnarly 1.4 | 26 | 14% | 53 |
| bvh.mini.Freya 0.55 | 23 | 12% | 37 |
| cs.Wren 1.0 | 10 | 5% | 17 |
| kdf.KoulDestroyer 1.0 | 10 | 5% | 13 |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 5% | 22 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8 | 4% | 11 |
| matt.UnderDark3 2.4.34 | 5 | 3% | 5 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |

## Melee bench: F39

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 75.2 | 74 / 280 | 3.24 | 16.4% | 42051 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 16.4% | 74 |
| bvh.fry.Freya 0.82 | 2.1 | 14.6% | 39 |
| az.Ololobot 0.2.4 | 3.0 | 13.7% | 102 |
| catcat20.Lambda 0.024 | 4.4 | 11.0% | 46 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.6% | 6 |
| apollokidd.ApolloKidd 0.9 | 6.3 | 8.1% | 0 |
| gimp.GimpBot 0.1 | 6.4 | 8.3% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 7.4 | 7.2% | 12 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.1 | 6.3% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.6 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 75.9 | 7 / 35 | 5611 |
| 2 | 1 | 63.9 | 71.4 | 8 / 35 | 5369 |
| 3 | 1 | 65.6 | 81.3 | 6 / 35 | 5098 |
| 4 | 1 | 65.2 | 73.0 | 14 / 35 | 5373 |
| 5 | 1 | 63.4 | 72.4 | 8 / 35 | 5095 |
| 6 | 1 | 64.3 | 74.9 | 10 / 35 | 5122 |
| 7 | 1 | 64.7 | 75.9 | 9 / 35 | 5203 |
| 8 | 1 | 65.7 | 76.5 | 12 / 35 | 5180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 65 | 15% |
| bvh.fry.Freya 0.82 | 40 | 65% |
| catcat20.Lambda 0.024 | 36 | 56% |
| stelo.SoRobotNanoMelee 1.2 | 11 | 82% |
| winamp32.micro.MicroMacro 1.0 | 4 | 75% |
| gimp.GimpBot 0.1 | 4 | 75% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |

Hadur died in 206 of 280 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 77 | 37% | 93 |
| bvh.fry.Freya 0.82 | 49 | 24% | 70 |
| catcat20.Lambda 0.024 | 35 | 17% | 51 |
| stelo.SoRobotNanoMelee 1.2 | 12 | 6% | 14 |
| apollokidd.ApolloKidd 0.9 | 11 | 5% | 15 |
| whitesquare.robots.SkynetAdvanced 1.1 | 10 | 5% | 12 |
| winamp32.micro.MicroMacro 1.0 | 7 | 3% | 14 |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 1% | 5 |
| gimp.GimpBot 0.1 | 2 | 1% | 6 |

## Melee bench: F40

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 80.0 | 158 / 280 | 2.80 | 17.9% | 38397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 17.9% | 158 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.7% | 66 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 11.8% | 17 |
| mz.AntiGrav 1.0 | 4.1 | 11.1% | 8 |
| Polkwane.SmashMelee 1.0 | 4.9 | 10.5% | 14 |
| alpha.BlackIce 1.0 | 6.1 | 9.0% | 4 |
| stelo.Randomness 1.0 | 6.6 | 8.8% | 11 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.6% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.5% | 1 |
| sample.Corners 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 81.6 | 19 / 35 | 5042 |
| 2 | 1 | 66.9 | 81.9 | 16 / 35 | 4613 |
| 3 | 1 | 65.4 | 72.1 | 19 / 35 | 4677 |
| 4 | 1 | 65.9 | 75.2 | 19 / 35 | 4543 |
| 5 | 1 | 68.4 | 82.5 | 23 / 35 | 4819 |
| 6 | 1 | 67.2 | 80.3 | 20 / 35 | 4743 |
| 7 | 1 | 67.2 | 81.0 | 21 / 35 | 4553 |
| 8 | 1 | 69.1 | 85.4 | 21 / 35 | 5407 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 70 | 61% |
| mz.AntiGrav 1.0 | 39 | 100% |
| kano.gamma.KanoGamma 1.8 | 34 | 94% |
| Polkwane.SmashMelee 1.0 | 23 | 87% |
| stelo.Randomness 1.0 | 13 | 92% |
| alpha.BlackIce 1.0 | 9 | 89% |
| amk.superstrike.SuperStrike 0.3 | 4 | 75% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 122 of 280 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 54 | 44% | 84 |
| kano.gamma.KanoGamma 1.8 | 16 | 13% | 50 |
| Polkwane.SmashMelee 1.0 | 15 | 12% | 35 |
| stelo.Randomness 1.0 | 10 | 8% | 29 |
| mz.AntiGrav 1.0 | 9 | 7% | 41 |
| alpha.BlackIce 1.0 | 9 | 7% | 14 |
| amk.superstrike.SuperStrike 0.3 | 7 | 6% | 15 |
| testantiswapgun.AntiSwap 1.0 | 2 | 2% | 5 |
| sample.Corners 1.0 | 0 | 0% | 6 |

## Melee bench: F41

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 74.9 | 106 / 280 | 3.26 | 16.3% | 37878 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.5 | 16.3% | 106 |
| eem.EvBotNG v12.8 | 1.5 | 16.3% | 119 |
| ary.Swarm 1.1 | 3.4 | 13.1% | 12 |
| lessonz.robocode.Oz 0.5.0 | 3.6 | 12.5% | 25 |
| simonton.nano.MeleeSeed 1.8 | 5.3 | 10.2% | 11 |
| shrub.Silver v048 | 5.9 | 9.3% | 5 |
| zyx.nano.Ant 1.1 | 6.9 | 7.8% | 1 |
| jsal.Jsalbot 1.0 | 8.3 | 6.2% | 2 |
| stelo.Mirror 1.1 | 8.8 | 5.5% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 83.2 | 16 / 35 | 5084 |
| 2 | 1 | 66.4 | 77.5 | 14 / 35 | 4931 |
| 3 | 2 | 64.1 | 70.2 | 9 / 35 | 4958 |
| 4 | 1 | 66.2 | 77.1 | 18 / 35 | 4478 |
| 5 | 2 | 63.4 | 71.4 | 10 / 35 | 4297 |
| 6 | 2 | 66.3 | 77.8 | 13 / 35 | 4984 |
| 7 | 1 | 65.5 | 73.7 | 16 / 35 | 4748 |
| 8 | 2 | 62.6 | 68.3 | 10 / 35 | 4398 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 67 | 31% |
| ary.Swarm 1.1 | 34 | 100% |
| lessonz.robocode.Oz 0.5.0 | 33 | 82% |
| simonton.nano.MeleeSeed 1.8 | 18 | 89% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| shrub.Silver v048 | 2 | 50% |
| stelo.Mirror 1.1 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 174 of 280 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 93 | 53% | 120 |
| simonton.nano.MeleeSeed 1.8 | 22 | 13% | 36 |
| ary.Swarm 1.1 | 17 | 10% | 52 |
| lessonz.robocode.Oz 0.5.0 | 15 | 9% | 33 |
| acogdev.alpha 0.2 | 12 | 7% | 12 |
| zyx.nano.Ant 1.1 | 6 | 3% | 6 |
| shrub.Silver v048 | 4 | 2% | 7 |
| stelo.Mirror 1.1 | 3 | 2% | 5 |
| jsal.Jsalbot 1.0 | 2 | 1% | 7 |

## Melee bench: F42

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 77.7 | 68 / 280 | 3.01 | 16.5% | 41931 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.4 | 17.1% | 129 |
| hadur117.micro.SaorLAU 0.1 | 1.6 | 16.5% | 68 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.5% | 34 |
| ara.Shera 0.88 | 3.8 | 12.2% | 41 |
| amz.NanoClone 1.41 | 5.1 | 8.7% | 0 |
| maribo.IotaCT 1.1 | 6.0 | 7.8% | 1 |
| dsw.StaticD 1.0 | 7.1 | 7.1% | 6 |
| stelo.MirrorMicro 1.0 | 8.3 | 6.3% | 1 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.9% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 79.0 | 9 / 35 | 5586 |
| 2 | 2 | 65.8 | 79.4 | 8 / 35 | 5357 |
| 3 | 1 | 67.4 | 82.5 | 12 / 35 | 5619 |
| 4 | 2 | 64.3 | 75.2 | 8 / 35 | 4708 |
| 5 | 1 | 68.0 | 85.1 | 11 / 35 | 5860 |
| 6 | 2 | 63.0 | 72.7 | 6 / 35 | 5025 |
| 7 | 2 | 64.1 | 74.0 | 9 / 35 | 4737 |
| 8 | 2 | 63.8 | 73.7 | 5 / 35 | 5039 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 78 | 21% |
| maribo.mini.MiniQuester 0.1 | 35 | 71% |
| ara.Shera 0.88 | 32 | 56% |
| dsw.StaticD 1.0 | 5 | 80% |
| amz.NanoClone 1.41 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 212 of 280 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 118 | 56% | 140 |
| ara.Shera 0.88 | 45 | 21% | 60 |
| maribo.mini.MiniQuester 0.1 | 29 | 14% | 49 |
| amz.NanoClone 1.41 | 7 | 3% | 11 |
| dsw.StaticD 1.0 | 4 | 2% | 8 |
| stelo.MirrorMicro 1.0 | 4 | 2% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 3 | 1% | 5 |
| mme.NikeEnhanced 2.0 | 1 | 0% | 1 |
| maribo.IotaCT 1.1 | 1 | 0% | 1 |

## Melee bench: F43

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 71.6 | 20 / 280 | 3.56 | 14.1% | 31609 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.6% | 219 |
| hadur117.micro.SaorLAU 0.1 | 2.1 | 14.1% | 20 |
| brainfade.melee.Dusk 0.44 | 2.9 | 12.5% | 28 |
| wcsv.melee.EngineerMelee 0.1 | 4.3 | 11.0% | 4 |
| dummy.micro.Sparrow 2.5 | 5.1 | 10.6% | 7 |
| Krabb.akim2.Akim2 1.1b | 5.6 | 10.1% | 0 |
| mz.NanoGod 2.02 | 7.3 | 7.6% | 1 |
| jab.DiamondStealer 5 | 7.8 | 7.5% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 68.6 | 2 / 35 | 4121 |
| 2 | 2 | 63.8 | 76.2 | 5 / 35 | 3849 |
| 3 | 3 | 62.2 | 67.9 | 3 / 35 | 3960 |
| 4 | 2 | 63.6 | 74.6 | 2 / 35 | 3853 |
| 5 | 2 | 62.0 | 67.9 | 4 / 35 | 3784 |
| 6 | 2 | 63.7 | 74.9 | 0 / 35 | 3979 |
| 7 | 2 | 62.8 | 70.8 | 3 / 35 | 3955 |
| 8 | 2 | 63.0 | 71.7 | 1 / 35 | 4108 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 83 | 2% |
| brainfade.melee.Dusk 0.44 | 15 | 40% |
| dummy.micro.Sparrow 2.5 | 9 | 78% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 80% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 260 of 280 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 178 | 68% | 181 |
| brainfade.melee.Dusk 0.44 | 28 | 11% | 36 |
| wcsv.melee.EngineerMelee 0.1 | 26 | 10% | 31 |
| dummy.micro.Sparrow 2.5 | 14 | 5% | 18 |
| mz.NanoGod 2.02 | 7 | 3% | 7 |
| jab.DiamondStealer 5 | 5 | 2% | 5 |
| Krabb.akim2.Akim2 1.1b | 1 | 0% | 1 |
| cvt.Firsty 1.0 | 1 | 0% | 1 |

## Melee bench: F44

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 79.6 | 111 / 280 | 2.83 | 17.7% | 43188 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.1 | 17.7% | 111 |
| stelo.Liblix 0.3.1 | 2.0 | 16.2% | 126 |
| tzu.TheArtOfWar 1.2 | 2.9 | 13.1% | 31 |
| wompi.Quokka 1.6 | 4.4 | 9.9% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.1 | 9.3% | 0 |
| jwirde.Gort 2.0 | 5.9 | 9.2% | 7 |
| disan.Chair 2.2.0 | 6.9 | 7.7% | 0 |
| stf.PanzerGeneral 0.1 | 7.8 | 7.0% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.1 | 5.2% | 0 |
| sample.Crazy 1.0 | 9.9 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 80.0 | 9 / 35 | 5238 |
| 2 | 1 | 66.2 | 75.9 | 13 / 35 | 5396 |
| 3 | 1 | 65.3 | 76.5 | 12 / 35 | 4909 |
| 4 | 1 | 68.5 | 81.6 | 16 / 35 | 5709 |
| 5 | 1 | 66.1 | 75.9 | 12 / 35 | 5276 |
| 6 | 1 | 67.9 | 81.9 | 15 / 35 | 5654 |
| 7 | 1 | 67.2 | 80.3 | 15 / 35 | 5244 |
| 8 | 1 | 69.1 | 85.1 | 19 / 35 | 5762 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 105 | 30% |
| tzu.TheArtOfWar 1.2 | 63 | 81% |
| wompi.Quokka 1.6 | 10 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 100% |
| disan.Chair 2.2.0 | 8 | 100% |
| jwirde.Gort 2.0 | 1 | 0% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 169 of 280 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 95 | 56% | 132 |
| tzu.TheArtOfWar 1.2 | 40 | 24% | 84 |
| wompi.Quokka 1.6 | 10 | 6% | 21 |
| jwirde.Gort 2.0 | 7 | 4% | 10 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 4% | 11 |
| stf.PanzerGeneral 0.1 | 6 | 4% | 8 |
| disan.Chair 2.2.0 | 3 | 2% | 8 |
| amk.jointstrike.JointStrike 0.2 | 2 | 1% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 2 |

## Melee bench: F45

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 84.9 | 117 / 280 | 2.36 | 19.4% | 47078 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 19.4% | 117 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.8% | 137 |
| jje.BagPuss 1.2 | 3.0 | 12.0% | 10 |
| sul.Lunar 1.1 | 4.4 | 10.2% | 7 |
| myl.nano.Graviton 1.10 | 4.5 | 10.2% | 2 |
| fm.claire 1.7 | 6.6 | 8.3% | 0 |
| hvilela.HVilela 0.9 | 6.6 | 8.7% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.6 | 7.5% | 2 |
| wit.Deep7 2.0 | 9.0 | 5.9% | 5 |
| abud.ThirdRobo 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 80.3 | 11 / 35 | 5562 |
| 2 | 1 | 69.3 | 85.1 | 16 / 35 | 5918 |
| 3 | 1 | 68.9 | 84.1 | 17 / 35 | 5741 |
| 4 | 1 | 70.2 | 89.8 | 14 / 35 | 6279 |
| 5 | 1 | 70.0 | 90.2 | 15 / 35 | 5830 |
| 6 | 1 | 68.9 | 83.2 | 14 / 35 | 6040 |
| 7 | 1 | 66.8 | 80.0 | 11 / 35 | 5470 |
| 8 | 1 | 70.2 | 86.3 | 19 / 35 | 6238 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 134 | 33% |
| jje.BagPuss 1.2 | 26 | 81% |
| myl.nano.Graviton 1.10 | 19 | 95% |
| sul.Lunar 1.1 | 16 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 6 | 100% |
| hvilela.HVilela 0.9 | 6 | 100% |
| wit.Deep7 2.0 | 4 | 75% |
| fm.claire 1.7 | 2 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 163 of 280 rounds, at a mean tick of 2014. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 96 | 59% | 0 |
| jje.BagPuss 1.2 | 21 | 13% | 83 |
| sul.Lunar 1.1 | 12 | 7% | 62 |
| hvilela.HVilela 0.9 | 10 | 6% | 25 |
| myl.nano.Graviton 1.10 | 7 | 4% | 45 |
| fm.claire 1.7 | 7 | 4% | 17 |
| wit.Deep7 2.0 | 5 | 3% | 17 |
| pez.mini.ChironexFleckeri 0.5 | 3 | 2% | 19 |
| abud.ThirdRobo 1.0 | 2 | 1% | 10 |

## Melee bench: F46

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 68.2 | 26 / 280 | 3.86 | 14.1% | 35277 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.4 | 17.4% | 128 |
| kc.mini.Mirage 0.2 | 1.6 | 17.3% | 99 |
| hadur117.micro.SaorLAU 0.1 | 3.0 | 14.1% | 26 |
| mz.MicroSheep 1.0 | 4.5 | 10.0% | 5 |
| cx.Princess 1.0 | 4.9 | 10.1% | 20 |
| sadoner.killer 0.2 | 5.9 | 8.9% | 0 |
| arthord.NanoSatanMelee Beta | 7.1 | 7.2% | 2 |
| jeremyreeder.collective.Prophet 5 | 7.6 | 6.4% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 67.9 | 4 / 35 | 4174 |
| 2 | 3 | 62.9 | 70.5 | 4 / 35 | 4594 |
| 3 | 3 | 62.1 | 70.2 | 4 / 35 | 4116 |
| 4 | 3 | 60.0 | 62.9 | 4 / 35 | 4297 |
| 5 | 3 | 61.1 | 65.1 | 1 / 35 | 4571 |
| 6 | 3 | 61.6 | 67.6 | 4 / 35 | 4430 |
| 7 | 3 | 63.6 | 73.7 | 4 / 35 | 4596 |
| 8 | 3 | 62.2 | 67.6 | 1 / 35 | 4499 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 43 | 12% |
| kc.mini.Mirage 0.2 | 41 | 37% |
| cx.Princess 1.0 | 5 | 40% |
| mz.MicroSheep 1.0 | 2 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 254 of 280 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 96 | 38% | 101 |
| kc.mini.Mirage 0.2 | 93 | 37% | 110 |
| cx.Princess 1.0 | 29 | 11% | 31 |
| sadoner.killer 0.2 | 13 | 5% | 14 |
| arthord.NanoSatanMelee Beta | 11 | 4% | 11 |
| kurios.DOSexe .9a | 6 | 2% | 6 |
| mz.MicroSheep 1.0 | 3 | 1% | 3 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 2 |

