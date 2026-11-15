# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 145 over 4 battles (36.3 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 87.4 | 33 / 140 | 2.14 | 17.8% | 21791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.7% | 99 |
| hadur117.Hadur 3.22so | 2.0 | 17.8% | 33 |
| sgp.JollyNinja 3.53 | 3.5 | 11.3% | 8 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 11.0% | 0 |
| mz.MicroGodMelee 1 | 5.0 | 9.9% | 1 |
| lorneswork.Predator 1.0 | 5.5 | 9.7% | 0 |
| adt.Ar2 1.0 | 6.8 | 8.2% | 0 |
| skm.butterfly 1.0 | 8.3 | 4.8% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.8 | 5.0% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.7 | 89.5 | 10 / 35 | 5489 |
| 2 | 2 | 67.8 | 86.3 | 6 / 35 | 5553 |
| 3 | 2 | 68.0 | 86.3 | 11 / 35 | 5449 |
| 4 | 2 | 67.6 | 87.3 | 6 / 35 | 5300 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 85 | 12% |
| sgp.JollyNinja 3.53 | 13 | 62% |
| mz.MicroGodMelee 1 | 6 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 100% |
| lorneswork.Predator 1.0 | 3 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 108 of 140 rounds, at a mean tick of 1232. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 84 | 78% | 100 |
| sgp.JollyNinja 3.53 | 10 | 9% | 15 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 5% | 12 |
| lorneswork.Predator 1.0 | 4 | 4% | 7 |
| mz.MicroGodMelee 1 | 2 | 2% | 4 |
| adt.Ar2 1.0 | 1 | 1% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 133 rounds): 91445 melee ticks, 66249 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 48 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 28814 sent, 25424 reached their opponent, 4738 virtual hits (18.6% of those reached).

## Melee bench: F02

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 191 over 4 battles (47.8 per battle, most in one battle 57). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.9 | 67 / 140 | 2.18 | 18.9% | 20969 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 18.9% | 67 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.8% | 32 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.9% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.8% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.0% | 8 |
| fnc.bandit.Bandit 5.2.0 | 6.0 | 8.7% | 3 |
| Noran.BitchingElk 0.054 | 7.3 | 7.8% | 6 |
| sch.Simone 0.3d | 7.8 | 7.6% | 4 |
| stelo.PatternRobot 1.0 | 9.0 | 4.6% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 87.9 | 18 / 35 | 5485 |
| 2 | 1 | 69.1 | 87.9 | 17 / 35 | 5090 |
| 3 | 1 | 68.8 | 85.1 | 15 / 35 | 5459 |
| 4 | 1 | 68.5 | 86.7 | 17 / 35 | 4935 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 43 | 42% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 32 | 69% |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 80% |
| Noran.BitchingElk 0.054 | 6 | 50% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 100% |
| sch.Simone 0.3d | 3 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 33% |
| stelo.PatternRobot 1.0 | 2 | 100% |

Hadur died in 73 of 140 rounds, at a mean tick of 993. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 32 | 44% | 52 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 15 | 21% | 38 |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 14% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 6 | 8% | 8 |
| sch.Simone 0.3d | 3 | 4% | 11 |
| Noran.BitchingElk 0.054 | 3 | 4% | 6 |
| fnc.bandit.Bandit 5.2.0 | 3 | 4% | 4 |
| stelo.PatternRobot 1.0 | 1 | 1% | 2 |

Posture (Hadur's M records, 132 rounds): 107359 melee ticks, 32841 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 40 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 37582 sent, 34420 reached their opponent, 5268 virtual hits (15.3% of those reached).

## Melee bench: F03

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 147 over 4 battles (36.8 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 94.7 | 118 / 140 | 1.48 | 22.0% | 28868 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 22.0% | 118 |
| radnor.DoctorBob 1.42 | 2.0 | 13.3% | 11 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.3% | 3 |
| vuen.Cake 2.51 | 3.5 | 12.3% | 7 |
| urdos.URDOS 1.3 | 5.0 | 9.6% | 1 |
| adt.Ar1 2.1 | 6.3 | 7.4% | 0 |
| oa.weak.FlyMk1 0.1 | 6.8 | 7.0% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 8.0 | 5.9% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.3 | 5.3% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 90.5 | 27 / 35 | 6897 |
| 2 | 1 | 72.8 | 96.2 | 32 / 35 | 7043 |
| 3 | 1 | 72.6 | 94.6 | 28 / 35 | 7580 |
| 4 | 1 | 73.1 | 97.5 | 31 / 35 | 7348 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 53 | 92% |
| radnor.DoctorBob 1.42 | 31 | 97% |
| kawigi.nano.Lib 1.0 | 31 | 97% |
| urdos.URDOS 1.3 | 4 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 22 of 140 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 7 | 32% | 33 |
| kawigi.nano.Lib 1.0 | 5 | 23% | 33 |
| vuen.Cake 2.51 | 4 | 18% | 52 |
| urdos.URDOS 1.3 | 2 | 9% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 9% | 4 |
| oa.weak.FlyMk1 0.1 | 1 | 5% | 3 |
| adt.Ar1 2.1 | 1 | 5% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 132 rounds): 82632 melee ticks, 28854 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 42 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 24805 sent, 21645 reached their opponent, 5397 virtual hits (24.9% of those reached).

## Melee bench: F04

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 80 over 4 battles (20.0 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 84.8 | 11 / 140 | 2.37 | 17.6% | 23912 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.1% | 124 |
| hadur117.Hadur 3.22so | 2.0 | 17.6% | 11 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.0% | 1 |
| TNT.TNT 0.99.1 | 4.0 | 11.3% | 3 |
| josago.Jorgito 0.16 | 5.3 | 8.5% | 0 |
| css.Delitioner 0.11 | 6.3 | 7.6% | 1 |
| tj.zombie1n 1.0.1 | 7.0 | 6.3% | 0 |
| rampancy.Durandal 2.1d | 7.5 | 5.5% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.6% | 0 |
| sp.Nanos.Ember 1.1 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.5 | 86.7 | 2 / 35 | 6081 |
| 2 | 2 | 68.8 | 84.1 | 4 / 35 | 6206 |
| 3 | 2 | 67.6 | 83.2 | 2 / 35 | 5453 |
| 4 | 2 | 68.5 | 85.1 | 3 / 35 | 6172 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 96 | 4% |
| TNT.TNT 0.99.1 | 6 | 67% |
| apc.LeeroyJenkins2 1.0 | 3 | 67% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 130 of 140 rounds, at a mean tick of 1289. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 101 | 78% | 105 |
| TNT.TNT 0.99.1 | 11 | 8% | 15 |
| apc.LeeroyJenkins2 1.0 | 10 | 8% | 11 |
| css.Delitioner 0.11 | 3 | 2% | 4 |
| josago.Jorgito 0.16 | 3 | 2% | 3 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 1 |

Posture (Hadur's M records, 133 rounds): 122177 melee ticks, 48452 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 56 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 36871 sent, 33626 reached their opponent, 4834 virtual hits (14.4% of those reached).

## Melee bench: F05

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 93 over 4 battles (23.3 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 79.4 | 13 / 140 | 2.86 | 15.7% | 18331 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 17.9% | 71 |
| justin.DemonicRage 3.4 | 1.8 | 17.5% | 45 |
| hadur117.Hadur 3.22so | 3.0 | 15.7% | 13 |
| wompi.Numbat 2.1 | 4.0 | 12.8% | 11 |
| ms.Ares 0.19 | 5.3 | 8.7% | 0 |
| axeBots.HataMoto 3.09 | 5.8 | 8.2% | 0 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.8% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.3% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.1% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 67.2 | 84.1 | 7 / 35 | 4791 |
| 2 | 3 | 66.7 | 83.2 | 2 / 35 | 5095 |
| 3 | 3 | 62.5 | 72.1 | 2 / 35 | 4284 |
| 4 | 3 | 64.2 | 78.1 | 2 / 35 | 4161 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 32 | 6% |
| justin.DemonicRage 3.4 | 30 | 20% |
| wompi.Numbat 2.1 | 7 | 43% |
| axeBots.HataMoto 3.09 | 2 | 100% |

Hadur died in 127 of 140 rounds, at a mean tick of 1002. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 54 | 43% | 60 |
| cb.fire.Firestarter 2.0f | 44 | 35% | 47 |
| wompi.Numbat 2.1 | 20 | 16% | 21 |
| axeBots.HataMoto 3.09 | 4 | 3% | 5 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 3 |
| supersample.SuperBoxBot 1.0 | 2 | 2% | 2 |
| ms.Ares 0.19 | 0 | 0% | 1 |

Posture (Hadur's M records, 135 rounds): 105936 melee ticks, 29111 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (135 rounds): longest scan gap while four or more were alive 64 ticks (135 rounds over 8); rounds whose longest gap at any count was over 8: 135; robots dropped as dead without a death event: 0.

Targeting waves (135 rounds): 31057 sent, 27704 reached their opponent, 4292 virtual hits (15.5% of those reached).

## Melee bench: F06

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 7 other Robocode JVMs running (hadur.bench.MeleeRunner x7), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 111 over 4 battles (27.8 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.8 | 92 / 140 | 1.74 | 20.6% | 23509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 20.6% | 92 |
| origin.SleepSiphon 1.7b | 2.5 | 14.1% | 26 |
| jekl.StoneGhost 0.7 | 2.5 | 14.3% | 11 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.9% | 6 |
| mld.Wisdom 1.0 | 5.0 | 10.4% | 0 |
| gg.Wolverine 2.0 | 6.0 | 8.1% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 6.3% | 4 |
| spinnercat.Omen 1.0 | 7.8 | 6.2% | 0 |
| DBall.NUKE 0.1 | 8.8 | 5.5% | 0 |
| sample.Fire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.2 | 24 / 35 | 5770 |
| 2 | 1 | 70.3 | 91.1 | 18 / 35 | 5503 |
| 3 | 1 | 71.3 | 91.7 | 24 / 35 | 6029 |
| 4 | 1 | 72.3 | 94.3 | 26 / 35 | 6207 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 41 | 78% |
| jekl.StoneGhost 0.7 | 36 | 83% |
| pe.minimelee.SandboxMiniMelee 1.1 | 24 | 88% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 50% |
| gg.Wolverine 2.0 | 6 | 67% |
| DBall.NUKE 0.1 | 1 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 50 of 140 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 18 | 36% | 52 |
| jekl.StoneGhost 0.7 | 15 | 30% | 37 |
| pe.minimelee.SandboxMiniMelee 1.1 | 5 | 10% | 27 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 8% | 9 |
| gg.Wolverine 2.0 | 4 | 8% | 7 |
| mld.Wisdom 1.0 | 3 | 6% | 7 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 134 rounds): 95598 melee ticks, 30768 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (134 rounds): longest scan gap while four or more were alive 25 ticks (134 rounds over 8); rounds whose longest gap at any count was over 8: 134; robots dropped as dead without a death event: 0.

Targeting waves (134 rounds): 29138 sent, 25913 reached their opponent, 5395 virtual hits (20.8% of those reached).

## Melee bench: F07

hadur117.Hadur 3.22so against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 84 over 4 battles (21.0 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 75.0 | 95.0 | 99 / 140 | 1.40 | 25.5% | 30662 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 25.5% | 99 |
| rtk.Tachikoma 1.0 | 2.0 | 18.6% | 22 |
| franzor.Lizt 1.3.1 | 3.5 | 12.8% | 8 |
| oog.melee.CapuletDroid 1.1 | 3.5 | 12.9% | 11 |
| exauge.GateKeeper 1.1.121g | 5.5 | 9.6% | 0 |
| lrem.micro.MoggFanatic 0.2 | 5.5 | 10.3% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 5.5% | 0 |
| sample.Target 1.0 | 8.3 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 8.8 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 75.5 | 96.1 | 26 / 35 | 7878 |
| 2 | 1 | 75.1 | 96.1 | 27 / 35 | 7778 |
| 3 | 1 | 75.2 | 95.4 | 25 / 35 | 7701 |
| 4 | 1 | 74.2 | 92.5 | 21 / 35 | 7305 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 72 | 78% |
| oog.melee.CapuletDroid 1.1 | 29 | 76% |
| franzor.Lizt 1.3.1 | 24 | 79% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 41 of 140 rounds, at a mean tick of 1610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 24 | 59% | 82 |
| oog.melee.CapuletDroid 1.1 | 9 | 22% | 40 |
| franzor.Lizt 1.3.1 | 7 | 17% | 7 |
| exauge.GateKeeper 1.1.121g | 1 | 2% | 4 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 6 |

Posture (Hadur's M records, 132 rounds): 129875 melee ticks, 55200 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 41 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 34818 sent, 32012 reached their opponent, 6299 virtual hits (19.7% of those reached).

## Melee bench: F08

hadur117.Hadur 3.22so against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 214 over 4 battles (53.5 per battle, most in one battle 59). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.1 | 97 / 140 | 1.64 | 22.8% | 21911 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 22.8% | 97 |
| tm.Yuugao 1.0 | 2.0 | 15.0% | 24 |
| shrub.Vapour v159 | 3.3 | 13.1% | 9 |
| com.spp.robocode.MostlyHarmless 010 | 4.5 | 11.5% | 6 |
| m3thos.Eva00 1.1 | 5.0 | 10.2% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 5.3 | 9.3% | 2 |
| qualidafial.MajorDick 1.0.1 | 7.0 | 6.6% | 0 |
| SHAM.WOW 1.4 | 8.5 | 5.7% | 1 |
| zyx.nano.BacillusComma 1.0 | 8.5 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 91.1 | 25 / 35 | 5388 |
| 2 | 1 | 72.2 | 94.6 | 25 / 35 | 5949 |
| 3 | 1 | 71.1 | 92.1 | 23 / 35 | 5422 |
| 4 | 1 | 69.9 | 90.4 | 24 / 35 | 5152 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 45 | 62% |
| shrub.Vapour v159 | 32 | 78% |
| com.spp.robocode.MostlyHarmless 010 | 26 | 92% |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 88% |
| m3thos.Eva00 1.1 | 8 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 44 of 140 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 18 | 41% | 47 |
| shrub.Vapour v159 | 10 | 23% | 34 |
| com.spp.robocode.MostlyHarmless 010 | 6 | 14% | 24 |
| m3thos.Eva00 1.1 | 4 | 9% | 9 |
| jwst.DAD.DarkAndDarker 1.1 | 2 | 5% | 14 |
| SHAM.WOW 1.4 | 2 | 5% | 5 |
| zyx.nano.BacillusComma 1.0 | 2 | 5% | 4 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 132 rounds): 93442 melee ticks, 31107 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 44 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 44 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 27975 sent, 25146 reached their opponent, 4521 virtual hits (18.0% of those reached).

## Melee bench: F09

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 105 over 4 battles (26.3 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 78.7 | 31 / 140 | 2.91 | 15.7% | 15286 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.3% | 74 |
| hadur117.Hadur 3.22so | 2.0 | 15.7% | 31 |
| kc.micro.Figment 1.0 | 3.0 | 13.6% | 12 |
| pedersen.Grishnakh 1.0 | 4.3 | 10.9% | 14 |
| yagami.Tidus 0.11 | 5.0 | 10.5% | 2 |
| mc2.enemy.Original 0.9 | 6.0 | 8.6% | 6 |
| dft.Calliope 5.6 | 6.8 | 7.5% | 1 |
| step.nanoPri 1.0 | 8.3 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.0% | 0 |
| rdm.Dueler 0.4x | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 80.3 | 10 / 35 | 3744 |
| 2 | 2 | 63.4 | 79.0 | 5 / 35 | 3427 |
| 3 | 2 | 64.4 | 78.7 | 9 / 35 | 3713 |
| 4 | 2 | 64.7 | 76.8 | 7 / 35 | 4402 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 44 | 25% |
| kc.micro.Figment 1.0 | 16 | 69% |
| pedersen.Grishnakh 1.0 | 9 | 22% |
| yagami.Tidus 0.11 | 7 | 71% |
| mc2.enemy.Original 0.9 | 3 | 0% |
| dft.Calliope 5.6 | 2 | 100% |

Hadur died in 109 of 140 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 50 | 46% | 61 |
| mc2.enemy.Original 0.9 | 15 | 14% | 16 |
| kc.micro.Figment 1.0 | 13 | 12% | 24 |
| pedersen.Grishnakh 1.0 | 13 | 12% | 17 |
| yagami.Tidus 0.11 | 10 | 9% | 13 |
| robar.nano.Assertive_Melee 0.2 | 4 | 4% | 4 |
| step.nanoPri 1.0 | 3 | 3% | 3 |
| dft.Calliope 5.6 | 1 | 1% | 2 |

Posture (Hadur's M records, 133 rounds): 98717 melee ticks, 23760 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 32 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 31530 sent, 28345 reached their opponent, 4136 virtual hits (14.6% of those reached).

## Melee bench: F10

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 163 over 4 battles (40.8 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 95.4 | 115 / 140 | 1.41 | 21.1% | 23831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 21.1% | 115 |
| DTF.Kludgy 1.2b | 2.0 | 14.0% | 8 |
| ne.Chimera 1.2 | 3.3 | 12.8% | 5 |
| ejb.Polaris 1.0.1 | 3.8 | 12.4% | 7 |
| vStar.RAFzilla 2.15 | 5.3 | 10.2% | 3 |
| tvv.micro.Antares 1.1.1 | 5.8 | 9.5% | 2 |
| kurios.DOSexe .9b | 7.8 | 5.8% | 0 |
| sam.Samspin 1.0 | 8.0 | 5.4% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.0% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 97.5 | 30 / 35 | 5857 |
| 2 | 1 | 70.8 | 92.7 | 25 / 35 | 5959 |
| 3 | 1 | 71.3 | 93.3 | 29 / 35 | 5759 |
| 4 | 1 | 72.7 | 98.1 | 31 / 35 | 6256 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 39 | 90% |
| ejb.Polaris 1.0.1 | 37 | 89% |
| ne.Chimera 1.2 | 23 | 91% |
| vStar.RAFzilla 2.15 | 14 | 93% |
| tvv.micro.Antares 1.1.1 | 9 | 89% |
| kurios.DOSexe .9b | 2 | 100% |
| donjezza.Muncho 1.0 | 2 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 26 of 140 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ne.Chimera 1.2 | 8 | 31% | 28 |
| DTF.Kludgy 1.2b | 7 | 27% | 44 |
| ejb.Polaris 1.0.1 | 6 | 23% | 33 |
| tvv.micro.Antares 1.1.1 | 3 | 12% | 11 |
| vStar.RAFzilla 2.15 | 2 | 8% | 14 |
| kurios.DOSexe .9b | 0 | 0% | 6 |
| sam.Samspin 1.0 | 0 | 0% | 2 |
| donjezza.Muncho 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 132 rounds): 91027 melee ticks, 40494 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 79 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 1.

Targeting waves (132 rounds): 29132 sent, 25873 reached their opponent, 4576 virtual hits (17.7% of those reached).

## Melee bench: F11

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 158 over 4 battles (39.5 per battle, most in one battle 51). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 84.9 | 54 / 140 | 2.36 | 17.4% | 17216 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 17.4% | 54 |
| rz.Aleph 0.34 | 2.0 | 16.2% | 48 |
| cx.mini.Nimrod 0.55 | 3.5 | 12.7% | 13 |
| djc.DynaBot 0.1.1 | 4.0 | 10.8% | 9 |
| rdt199.Warlord 0.73 | 5.5 | 8.8% | 7 |
| br2.MobyDickBot 1.6 | 5.8 | 9.0% | 6 |
| uji.YellohFellah 1.0 | 6.8 | 7.7% | 2 |
| KiraNL.Chupacabra 0.4 | 7.8 | 6.9% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 8.8 | 5.7% | 1 |
| stelo.MirrorNano 1.3 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 87.3 | 14 / 35 | 4662 |
| 2 | 1 | 66.4 | 83.8 | 14 / 35 | 4371 |
| 3 | 1 | 65.5 | 83.5 | 10 / 35 | 4140 |
| 4 | 1 | 66.3 | 85.1 | 16 / 35 | 4043 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 37 | 38% |
| djc.DynaBot 0.1.1 | 18 | 83% |
| cx.mini.Nimrod 0.55 | 15 | 60% |
| br2.MobyDickBot 1.6 | 8 | 63% |
| rdt199.Warlord 0.73 | 8 | 50% |
| uji.YellohFellah 1.0 | 7 | 86% |
| KiraNL.Chupacabra 0.4 | 2 | 50% |

Hadur died in 87 of 140 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 37 | 43% | 55 |
| cx.mini.Nimrod 0.55 | 14 | 16% | 20 |
| rdt199.Warlord 0.73 | 14 | 16% | 16 |
| djc.DynaBot 0.1.1 | 6 | 7% | 19 |
| uji.YellohFellah 1.0 | 5 | 6% | 11 |
| br2.MobyDickBot 1.6 | 4 | 5% | 10 |
| stelo.MirrorNano 1.3 | 3 | 3% | 3 |
| KiraNL.Chupacabra 0.4 | 2 | 2% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 132 rounds): 101546 melee ticks, 28250 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 40 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 31975 sent, 28764 reached their opponent, 3703 virtual hits (12.9% of those reached).

## Melee bench: F12

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 7 other Robocode JVMs running (hadur.bench.MeleeRunner x7), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 143 over 4 battles (35.8 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 85.5 | 75 / 140 | 2.31 | 18.1% | 17113 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 18.1% | 75 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.7% | 19 |
| nat.PallasHawk 1.0 | 3.0 | 13.5% | 28 |
| darkcanuck.Leon 1.01 | 3.5 | 12.8% | 13 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.0% | 4 |
| jrm.Test0 1.0 | 6.0 | 8.2% | 0 |
| cs.sheldor.Talon 1.1 | 7.5 | 6.6% | 0 |
| stuff.Vlad 0.1 | 8.3 | 5.7% | 1 |
| jp.Perpy 16.0 | 8.5 | 6.0% | 0 |
| jaybot.bots.Oddball 4.0 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 87.6 | 19 / 35 | 4251 |
| 2 | 1 | 69.4 | 88.9 | 24 / 35 | 4687 |
| 3 | 1 | 64.6 | 78.4 | 14 / 35 | 3664 |
| 4 | 1 | 67.9 | 87.0 | 18 / 35 | 4511 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 39 | 72% |
| bts.wiki.RipCurl 0.9b | 26 | 73% |
| darkcanuck.Leon 1.01 | 21 | 81% |
| brainfade.melee.Genghis 0.36 | 8 | 75% |
| stuff.Vlad 0.1 | 2 | 50% |
| jrm.Test0 1.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| jaybot.bots.Oddball 4.0 | 1 | 100% |

Hadur died in 65 of 140 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 18 | 28% | 48 |
| bts.wiki.RipCurl 0.9b | 14 | 22% | 24 |
| darkcanuck.Leon 1.01 | 12 | 18% | 38 |
| brainfade.melee.Genghis 0.36 | 7 | 11% | 11 |
| jrm.Test0 1.0 | 7 | 11% | 9 |
| cs.sheldor.Talon 1.1 | 3 | 5% | 6 |
| jp.Perpy 16.0 | 2 | 3% | 2 |
| jaybot.bots.Oddball 4.0 | 1 | 2% | 2 |
| stuff.Vlad 0.1 | 1 | 2% | 0 |

Posture (Hadur's M records, 133 rounds): 84734 melee ticks, 23391 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 59 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 1.

Targeting waves (133 rounds): 28196 sent, 24895 reached their opponent, 3970 virtual hits (15.9% of those reached).

## Melee bench: F13

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 116 over 4 battles (29.0 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 81.1 | 37 / 140 | 2.70 | 16.1% | 17812 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.8 | 16.5% | 28 |
| mn.Combat 3.25.0 | 2.0 | 16.6% | 56 |
| hadur117.Hadur 3.22so | 2.3 | 16.1% | 37 |
| shinh.Entangled 0.3 | 4.5 | 11.8% | 12 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.7% | 5 |
| apc.Colossus2 0.17 | 6.0 | 8.2% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.1% | 2 |
| maribo.FollowFire 1 | 8.3 | 5.1% | 0 |
| ayk.WallHugger 1.0 | 9.0 | 4.6% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.9 | 80.3 | 8 / 35 | 4147 |
| 2 | 2 | 66.4 | 81.6 | 11 / 35 | 4839 |
| 3 | 3 | 64.7 | 78.4 | 5 / 35 | 4544 |
| 4 | 1 | 66.3 | 84.1 | 13 / 35 | 4282 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 33 | 21% |
| ags.Glacier 0.2.11 | 26 | 65% |
| shinh.Entangled 0.3 | 11 | 64% |
| gh.micro.Gruweltje 0.7 | 6 | 50% |
| apc.Colossus2 0.17 | 2 | 100% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 103 of 140 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 37 | 36% | 55 |
| mn.Combat 3.25.0 | 36 | 35% | 41 |
| shinh.Entangled 0.3 | 13 | 13% | 23 |
| gh.micro.Gruweltje 0.7 | 9 | 9% | 10 |
| stelo.Wang 1.0 | 4 | 4% | 5 |
| apc.Colossus2 0.17 | 2 | 2% | 3 |
| ayk.WallHugger 1.0 | 1 | 1% | 2 |
| maribo.FollowFire 1 | 1 | 1% | 1 |

Posture (Hadur's M records, 133 rounds): 97330 melee ticks, 25243 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 83 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 83 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 27517 sent, 24102 reached their opponent, 3756 virtual hits (15.6% of those reached).

## Melee bench: F14

hadur117.Hadur 3.22so against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 163 over 4 battles (40.8 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.4 | 96.3 | 125 / 140 | 1.29 | 24.6% | 25958 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 24.6% | 125 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.6% | 10 |
| Lo_Ian.Gandalf_V4 4.0 | 3.3 | 11.3% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 3.8 | 11.0% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 10.3% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.9% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 8.2% | 3 |
| pa.Improved 1.0 | 8.0 | 6.7% | 0 |
| sample.TrackFire 1.0 | 9.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.5 | 99.3 | 33 / 35 | 6830 |
| 2 | 1 | 73.6 | 97.5 | 31 / 35 | 6521 |
| 3 | 1 | 72.5 | 93.9 | 29 / 35 | 6015 |
| 4 | 1 | 73.1 | 94.6 | 32 / 35 | 6592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 78 | 95% |
| sanyi.mikrobi.Roberto 1.0 | 20 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 10 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 78% |
| pa.Improved 1.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 15 of 140 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 9 | 60% | 71 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 13% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 13% | 3 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 7% | 31 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 7% | 6 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 10 |
| pa.Improved 1.0 | 0 | 0% | 5 |

Posture (Hadur's M records, 133 rounds): 80876 melee ticks, 32909 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 40 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 23633 sent, 20818 reached their opponent, 5007 virtual hits (24.1% of those reached).

## Melee bench: F15

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 160 over 4 battles (40.0 per battle, most in one battle 46). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 89.2 | 76 / 140 | 1.97 | 19.5% | 21687 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 19.5% | 76 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.6% | 9 |
| emp.Yngwie 1.11 | 3.0 | 13.1% | 33 |
| mld.DustBunny 3.8 | 3.5 | 12.5% | 8 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.6% | 5 |
| kawigi.robot.Girl 1.2 | 5.8 | 8.8% | 7 |
| Grystrion.TrackerWO 1.0 | 7.5 | 7.0% | 1 |
| lambdaxy.TBot 0.1 | 7.5 | 6.7% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.4% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 93.7 | 23 / 35 | 5640 |
| 2 | 1 | 70.1 | 90.5 | 22 / 35 | 5430 |
| 3 | 1 | 69.6 | 89.2 | 17 / 35 | 5723 |
| 4 | 1 | 67.3 | 83.5 | 14 / 35 | 4894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 38 | 50% |
| kawigi.micro.Shiz 1.1 | 23 | 96% |
| mld.DustBunny 3.8 | 17 | 82% |
| kawigi.robot.Girl 1.2 | 11 | 91% |
| cb.nano.Insomnia 1.0 | 9 | 67% |
| divineomega.TrialBot 0.003 | 3 | 67% |
| lambdaxy.TBot 0.1 | 2 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 64 of 140 rounds, at a mean tick of 1033. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 29 | 45% | 62 |
| mld.DustBunny 3.8 | 13 | 20% | 27 |
| kawigi.micro.Shiz 1.1 | 7 | 11% | 21 |
| kawigi.robot.Girl 1.2 | 6 | 9% | 10 |
| cb.nano.Insomnia 1.0 | 6 | 9% | 8 |
| divineomega.TrialBot 0.003 | 1 | 2% | 7 |
| lambdaxy.TBot 0.1 | 1 | 2% | 4 |
| Grystrion.TrackerWO 1.0 | 1 | 2% | 1 |

Posture (Hadur's M records, 133 rounds): 110579 melee ticks, 31909 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 70 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 34467 sent, 31206 reached their opponent, 4959 virtual hits (15.9% of those reached).

## Melee bench: F16

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 7 other Robocode JVMs running (hadur.bench.MeleeRunner x7), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 140 over 4 battles (35.0 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 89.1 | 73 / 140 | 1.98 | 19.9% | 23509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 19.9% | 73 |
| gh.Griezel 0.5.2 | 2.0 | 16.1% | 35 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.3% | 4 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.6% | 20 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.0% | 2 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.6% | 4 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.7% | 0 |
| asd.Cthulhu 1.3 | 8.8 | 4.7% | 0 |
| repositorio.NanoStep 1.0 | 9.0 | 4.7% | 1 |
| divineomega.DivineBot 1.9.4.5 | 9.3 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 90.2 | 16 / 35 | 5783 |
| 2 | 1 | 70.6 | 89.5 | 19 / 35 | 6106 |
| 3 | 1 | 70.7 | 90.5 | 18 / 35 | 6017 |
| 4 | 1 | 69.6 | 86.3 | 20 / 35 | 5603 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 56 | 61% |
| techdude.forest.FlamingForest 1.1 | 27 | 52% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 94% |
| bvh.fnr.Fenrir 0.36l | 5 | 60% |
| stelo.IntrinsicVolatility 1.4 | 3 | 100% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |
| tvv.nano.Polaris 1.2 | 2 | 50% |

Hadur died in 67 of 140 rounds, at a mean tick of 1228. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 29 | 43% | 60 |
| techdude.forest.FlamingForest 1.1 | 17 | 25% | 31 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 6 | 9% | 17 |
| bvh.fnr.Fenrir 0.36l | 6 | 9% | 8 |
| stelo.IntrinsicVolatility 1.4 | 4 | 6% | 10 |
| asd.Cthulhu 1.3 | 3 | 4% | 5 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 5 |
| tvv.nano.Polaris 1.2 | 1 | 1% | 3 |

Posture (Hadur's M records, 132 rounds): 114148 melee ticks, 45053 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 49 ticks (131 rounds over 8); rounds whose longest gap at any count was over 8: 131; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 36360 sent, 33083 reached their opponent, 5338 virtual hits (16.1% of those reached).

## Melee bench: F17

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 141 over 4 battles (35.3 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 87.2 | 73 / 140 | 2.15 | 19.8% | 24565 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 19.8% | 73 |
| et.Predator 1.8 | 2.0 | 13.9% | 14 |
| oog.melee.Mercutio 1.0 | 3.3 | 13.0% | 28 |
| cx.BlestPain 1.41 | 4.0 | 11.3% | 17 |
| ahf.NanoAndrew .4 | 4.8 | 10.7% | 5 |
| nic.Nicator 2.4 | 6.5 | 8.2% | 3 |
| maribo.melee.BMV 0.1 | 6.5 | 8.5% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.0 | 6.4% | 0 |
| tex.Longbot 0.4 | 9.0 | 5.8% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 89.5 | 19 / 35 | 6877 |
| 2 | 1 | 68.0 | 82.2 | 14 / 35 | 5589 |
| 3 | 1 | 70.3 | 88.3 | 20 / 35 | 6177 |
| 4 | 1 | 70.4 | 88.9 | 20 / 35 | 5922 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 38 | 79% |
| oog.melee.Mercutio 1.0 | 28 | 57% |
| cx.BlestPain 1.41 | 22 | 45% |
| ahf.NanoAndrew .4 | 9 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 4 | 100% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| nic.Nicator 2.4 | 1 | 100% |

Hadur died in 68 of 140 rounds, at a mean tick of 1018. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 18 | 26% | 35 |
| cx.BlestPain 1.41 | 17 | 25% | 27 |
| et.Predator 1.8 | 15 | 22% | 39 |
| ahf.NanoAndrew .4 | 11 | 16% | 21 |
| maribo.melee.BMV 0.1 | 4 | 6% | 8 |
| nic.Nicator 2.4 | 2 | 3% | 4 |
| tex.Longbot 0.4 | 1 | 1% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 4 |

Posture (Hadur's M records, 132 rounds): 104101 melee ticks, 38730 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 65 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 33621 sent, 30485 reached their opponent, 6096 virtual hits (20.0% of those reached).

## Melee bench: F18

hadur117.Hadur 3.22so against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 213 over 4 battles (53.3 per battle, most in one battle 59). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 94.2 | 107 / 140 | 1.46 | 23.1% | 20569 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 23.1% | 107 |
| agd.Mooserwirt2 2.7 | 2.0 | 15.3% | 13 |
| uji.DBH 1.1 | 3.0 | 12.5% | 7 |
| spinnercat.Robovirus 2.718 | 4.0 | 10.5% | 5 |
| kawigi.mini.Fhqwhgads 1.1 | 5.8 | 8.2% | 2 |
| sigterm.Sigterm 1.0 | 6.0 | 8.8% | 3 |
| ratosh.Nobo 0.21 | 6.3 | 8.2% | 0 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.3 | 6.8% | 0 |
| stelo.WangRobot 1.0 | 8.8 | 6.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 94.6 | 27 / 35 | 5071 |
| 2 | 1 | 71.5 | 94.6 | 27 / 35 | 5178 |
| 3 | 1 | 71.6 | 94.6 | 29 / 35 | 5359 |
| 4 | 1 | 70.4 | 92.9 | 24 / 35 | 4961 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agd.Mooserwirt2 2.7 | 52 | 83% |
| uji.DBH 1.1 | 32 | 94% |
| spinnercat.Robovirus 2.718 | 11 | 73% |
| stelo.WangRobot 1.0 | 10 | 80% |
| sigterm.Sigterm 1.0 | 7 | 86% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 83% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 5 | 100% |
| ratosh.Nobo 0.21 | 2 | 100% |

Hadur died in 33 of 140 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 10 | 30% | 46 |
| spinnercat.Robovirus 2.718 | 7 | 21% | 18 |
| ratosh.Nobo 0.21 | 5 | 15% | 12 |
| uji.DBH 1.1 | 4 | 12% | 28 |
| sigterm.Sigterm 1.0 | 4 | 12% | 10 |
| stelo.WangRobot 1.0 | 2 | 6% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 3% | 8 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 12 |

Posture (Hadur's M records, 133 rounds): 86881 melee ticks, 37942 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 40 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 26358 sent, 23438 reached their opponent, 5105 virtual hits (21.8% of those reached).

## Melee bench: F19

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 135 over 4 battles (33.8 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.2 | 98.5 | 129 / 140 | 1.14 | 23.1% | 27036 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 23.1% | 129 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.9% | 4 |
| krillr.mini.JointStrike 2.0.0 | 3.5 | 11.7% | 2 |
| mld.Infinity 2.2 | 3.8 | 11.4% | 2 |
| erdnis.Rover 0.3 | 5.0 | 10.1% | 0 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.7% | 2 |
| mbh.Mbh 0.1 | 7.0 | 7.2% | 0 |
| pac.ABC 2.1 | 8.3 | 6.2% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.7% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 98.4 | 32 / 35 | 6621 |
| 2 | 1 | 74.2 | 97.8 | 33 / 35 | 6725 |
| 3 | 1 | 74.6 | 99.4 | 33 / 35 | 6982 |
| 4 | 1 | 73.9 | 98.4 | 31 / 35 | 6708 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 82 | 95% |
| krillr.mini.JointStrike 2.0.0 | 18 | 94% |
| mld.Infinity 2.2 | 15 | 100% |
| erdnis.Rover 0.3 | 9 | 100% |
| patson.PatsonTestBot 1.0 | 6 | 67% |
| pac.ABC 2.1 | 4 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 11 of 140 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| patson.PatsonTestBot 1.0 | 5 | 45% | 16 |
| davidalves.net.DuelistMiniMelee 1.2 | 3 | 27% | 42 |
| krillr.mini.JointStrike 2.0.0 | 2 | 18% | 23 |
| pbg.R2D2 1.0 | 1 | 9% | 10 |
| mld.Infinity 2.2 | 0 | 0% | 21 |
| erdnis.Rover 0.3 | 0 | 0% | 14 |
| mbh.Mbh 0.1 | 0 | 0% | 5 |
| pac.ABC 2.1 | 0 | 0% | 4 |

Posture (Hadur's M records, 132 rounds): 83626 melee ticks, 26738 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 47 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 27557 sent, 24373 reached their opponent, 5321 virtual hits (21.8% of those reached).

## Melee bench: F20

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 114 over 4 battles (28.5 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 93.0 | 99 / 140 | 1.63 | 21.7% | 26417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 21.7% | 99 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.1% | 15 |
| fwb.Nine 1.0.1 | 3.5 | 11.5% | 10 |
| catcat20.Rabbit 0.001 | 4.0 | 11.2% | 13 |
| nz.jdc.nano.GridFu 1.0 | 4.5 | 9.9% | 2 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.4% | 0 |
| bayen.nut.Squirrel 1.615 | 7.5 | 6.8% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 6.3% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.2% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 90.2 | 21 / 35 | 6218 |
| 2 | 1 | 71.9 | 92.7 | 23 / 35 | 6311 |
| 3 | 1 | 72.9 | 93.7 | 27 / 35 | 6973 |
| 4 | 1 | 73.4 | 95.6 | 28 / 35 | 6915 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 61 | 89% |
| fwb.Nine 1.0.1 | 27 | 89% |
| catcat20.Rabbit 0.001 | 21 | 57% |
| nz.jdc.nano.GridFu 1.0 | 4 | 100% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |

Hadur died in 41 of 140 rounds, at a mean tick of 997. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 19 | 46% | 66 |
| catcat20.Rabbit 0.001 | 10 | 24% | 29 |
| fwb.Nine 1.0.1 | 7 | 17% | 15 |
| bayen.nut.Squirrel 1.615 | 2 | 5% | 5 |
| nz.jdc.nano.GridFu 1.0 | 1 | 2% | 13 |
| m3thos.mini.Eva01 0.5.5 | 1 | 2% | 5 |
| ntc.ControlledChaos 1.1.4 | 1 | 2% | 1 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 132 rounds): 105531 melee ticks, 36389 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 32 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 1.

Targeting waves (132 rounds): 32841 sent, 29601 reached their opponent, 6330 virtual hits (21.4% of those reached).

## Melee bench: F21

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 112 over 4 battles (28.0 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 92.6 | 87 / 140 | 1.66 | 21.1% | 25651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 21.1% | 87 |
| eem.EvBot v4.6.16 | 2.0 | 16.1% | 40 |
| cf.RiO.RiOx 4.2.1 | 3.5 | 12.3% | 8 |
| dummy.mini.Scimitar 1.01 | 3.5 | 13.5% | 2 |
| eld.Hmm 1.0 | 5.0 | 8.3% | 4 |
| oa.weak.BotherBot 0.1 | 6.3 | 7.5% | 0 |
| fire219.CatBot 1.0 | 7.3 | 6.3% | 0 |
| PSW.Relentless 0.1 | 8.0 | 5.8% | 0 |
| el.JumpShoot 0.2 | 8.5 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 94.6 | 24 / 35 | 6616 |
| 2 | 1 | 71.9 | 92.7 | 21 / 35 | 6504 |
| 3 | 1 | 71.8 | 91.4 | 20 / 35 | 6392 |
| 4 | 1 | 71.3 | 91.7 | 22 / 35 | 6139 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 77 | 66% |
| cf.RiO.RiOx 4.2.1 | 17 | 76% |
| dummy.mini.Scimitar 1.01 | 15 | 93% |
| eld.Hmm 1.0 | 6 | 67% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 53 of 140 rounds, at a mean tick of 1294. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 29 | 55% | 71 |
| cf.RiO.RiOx 4.2.1 | 10 | 19% | 18 |
| dummy.mini.Scimitar 1.01 | 7 | 13% | 33 |
| eld.Hmm 1.0 | 5 | 9% | 13 |
| fire219.CatBot 1.0 | 1 | 2% | 1 |
| PSW.Relentless 0.1 | 1 | 2% | 1 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 3 |

Posture (Hadur's M records, 132 rounds): 113528 melee ticks, 52836 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 53 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 53 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 32373 sent, 29154 reached their opponent, 4924 virtual hits (16.9% of those reached).

## Melee bench: F22

hadur117.Hadur 3.22so against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 7 other Robocode JVMs running (hadur.bench.MeleeRunner x7), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 111 over 4 battles (27.8 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.8 | 80 / 140 | 1.89 | 20.9% | 18844 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 20.9% | 80 |
| pe.SandboxDT 2.71m | 2.3 | 16.7% | 34 |
| kvk.HebusLeTroll 0.35 | 2.8 | 15.0% | 11 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.4% | 10 |
| bigpete.Stewie 1.0 | 5.0 | 10.6% | 2 |
| tad.Dalek98 0.98 | 6.5 | 6.3% | 0 |
| yk.JahRoslav 1.1 | 6.8 | 6.4% | 1 |
| gg.Squaraus 0.6 | 7.8 | 5.8% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.5 | 17 / 35 | 4739 |
| 2 | 1 | 70.5 | 92.1 | 25 / 35 | 4684 |
| 3 | 1 | 68.8 | 88.9 | 18 / 35 | 4722 |
| 4 | 1 | 69.0 | 86.8 | 20 / 35 | 4699 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 33 | 79% |
| jlm.javaDisturbance 0.59 | 31 | 84% |
| pe.SandboxDT 2.71m | 30 | 33% |
| bigpete.Stewie 1.0 | 16 | 94% |
| pbg.NinjaX 1.2 | 2 | 50% |
| gg.Squaraus 0.6 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |

Hadur died in 60 of 140 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 29 | 48% | 44 |
| kvk.HebusLeTroll 0.35 | 15 | 25% | 37 |
| jlm.javaDisturbance 0.59 | 10 | 17% | 35 |
| bigpete.Stewie 1.0 | 3 | 5% | 16 |
| tad.Dalek98 0.98 | 2 | 3% | 2 |
| pbg.NinjaX 1.2 | 1 | 2% | 1 |
| yk.JahRoslav 1.1 | 0 | 0% | 3 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |

Posture (Hadur's M records, 133 rounds): 96159 melee ticks, 32186 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 24 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 28901 sent, 25986 reached their opponent, 3437 virtual hits (13.2% of those reached).

## Melee bench: F23

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 109 over 4 battles (27.3 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.5 | 96.2 | 121 / 140 | 1.34 | 22.4% | 26918 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 22.4% | 121 |
| pe.SandboxLump 1.52 | 2.0 | 16.0% | 16 |
| cre.Karolos 0.32 | 3.0 | 13.5% | 3 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.4% | 0 |
| cw.megas.Blade 0.8 | 5.8 | 8.5% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.8 | 8.7% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.5 | 8.1% | 0 |
| sample.Walls 1.0 | 8.0 | 6.9% | 0 |
| rrh.Iwillfindyou 2.0 | 9.0 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 98.7 | 32 / 35 | 6745 |
| 2 | 1 | 74.5 | 98.1 | 33 / 35 | 7090 |
| 3 | 1 | 72.4 | 94.0 | 27 / 35 | 6342 |
| 4 | 1 | 73.3 | 94.0 | 29 / 35 | 6741 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 69 | 90% |
| cre.Karolos 0.32 | 32 | 100% |
| stelo.RamTrackSurfer 1.2 | 9 | 100% |
| stelo.AreaTargetingBot 1.1 | 8 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 20 of 140 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 10 | 50% | 65 |
| cre.Karolos 0.32 | 3 | 15% | 29 |
| stelo.AreaTargetingBot 1.1 | 3 | 15% | 14 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 15% | 5 |
| cw.megas.Blade 0.8 | 1 | 5% | 4 |
| stelo.RamTrackSurfer 1.2 | 0 | 0% | 13 |
| sample.Walls 1.0 | 0 | 0% | 5 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 133 rounds): 79369 melee ticks, 31798 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 39 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 25005 sent, 21605 reached their opponent, 5831 virtual hits (27.0% of those reached).

## Melee bench: F24

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 124 over 4 battles (31.0 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 84.1 | 63 / 140 | 2.43 | 17.7% | 17889 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 17.7% | 63 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.6% | 30 |
| davidalves.Phoenix 0.54 | 3.3 | 12.8% | 27 |
| florent.XSeries.X2 0.12 | 3.5 | 12.2% | 5 |
| pedersen.Ugluk 1.1.1 | 5.0 | 10.8% | 7 |
| oog.melee.Corsair 1.0 | 6.0 | 9.5% | 5 |
| stelo.SoJNanoMelee 1.1 | 7.5 | 6.1% | 1 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.5% | 1 |
| as.FrankTheTank 1.3 | 9.0 | 5.2% | 1 |
| evd.X1 0.01 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 85.1 | 11 / 35 | 4434 |
| 2 | 1 | 66.6 | 82.5 | 14 / 35 | 4546 |
| 3 | 1 | 67.0 | 84.4 | 18 / 35 | 4260 |
| 4 | 1 | 67.8 | 84.4 | 20 / 35 | 4649 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 34 | 68% |
| davidalves.Phoenix 0.54 | 23 | 57% |
| florent.XSeries.X2 0.12 | 14 | 79% |
| oog.melee.Corsair 1.0 | 7 | 71% |
| pedersen.Ugluk 1.1.1 | 6 | 33% |
| stelo.SoJNanoMelee 1.1 | 5 | 100% |
| lunchie.Lunchbox 0.93 | 3 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 77 of 140 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 23 | 30% | 35 |
| rz.GlowBlowMelee 1.4 | 21 | 27% | 40 |
| pedersen.Ugluk 1.1.1 | 12 | 16% | 17 |
| florent.XSeries.X2 0.12 | 11 | 14% | 22 |
| oog.melee.Corsair 1.0 | 9 | 12% | 16 |
| stelo.SoJNanoMelee 1.1 | 1 | 1% | 4 |
| lunchie.Lunchbox 0.93 | 0 | 0% | 3 |
| as.FrankTheTank 1.3 | 0 | 0% | 2 |
| evd.X1 0.01 | 0 | 0% | 1 |

Posture (Hadur's M records, 133 rounds): 91372 melee ticks, 25617 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 41 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 29343 sent, 25948 reached their opponent, 4478 virtual hits (17.3% of those reached).

## Melee bench: F25

hadur117.Hadur 3.22so against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 7 other Robocode JVMs running (hadur.bench.MeleeRunner x7), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 88 over 4 battles (22.0 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 91.3 | 102 / 140 | 1.70 | 21.7% | 16247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 21.7% | 102 |
| voidious.mini.BrokenSword 2.0.3 | 2.0 | 15.5% | 18 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 13.9% | 4 |
| jdw.Hurricane 1.4 | 4.3 | 12.0% | 10 |
| ds.Oo 2.2 | 4.8 | 10.8% | 4 |
| adt.Ar2 1.1 | 6.5 | 7.7% | 1 |
| awesomeness.Elite 1.0 | 7.0 | 7.5% | 1 |
| gjr.Cephalosporin 0.1 | 7.5 | 6.3% | 0 |
| amk.ChumbaMini 0.2 | 9.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 93.9 | 29 / 35 | 4113 |
| 2 | 1 | 70.0 | 91.8 | 23 / 35 | 4089 |
| 3 | 1 | 70.6 | 92.5 | 27 / 35 | 4194 |
| 4 | 1 | 68.3 | 86.8 | 23 / 35 | 3851 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 47 | 85% |
| voidious.micro.BlitzBat 1.05 | 30 | 97% |
| jdw.Hurricane 1.4 | 19 | 95% |
| ds.Oo 2.2 | 12 | 83% |
| awesomeness.Elite 1.0 | 4 | 75% |
| amk.ChumbaMini 0.2 | 2 | 100% |
| adt.Ar2 1.1 | 1 | 0% |

Hadur died in 38 of 140 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 10 | 26% | 33 |
| voidious.mini.BrokenSword 2.0.3 | 10 | 26% | 31 |
| ds.Oo 2.2 | 8 | 21% | 26 |
| jdw.Hurricane 1.4 | 4 | 11% | 21 |
| awesomeness.Elite 1.0 | 4 | 11% | 12 |
| adt.Ar2 1.1 | 2 | 5% | 3 |
| amk.ChumbaMini 0.2 | 0 | 0% | 5 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 4 |

Posture (Hadur's M records, 133 rounds): 82074 melee ticks, 21387 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 32 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 25865 sent, 23010 reached their opponent, 3668 virtual hits (15.9% of those reached).

## Melee bench: F26

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 7 other Robocode JVMs running (hadur.bench.MeleeRunner x7), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 124 over 4 battles (31.0 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 93.3 | 100 / 140 | 1.60 | 21.9% | 28590 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 21.9% | 100 |
| ak.Fermat 2.0 | 2.0 | 15.1% | 17 |
| shu.nitro.LENIN .T34 | 3.3 | 12.6% | 14 |
| lrem.Spectre 0.4.4 | 4.0 | 11.6% | 5 |
| js.PinBall 1.6 | 5.0 | 10.4% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 5.8 | 9.6% | 1 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 7.8% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.3% | 2 |
| sample.SpinBot 1.0 | 9.0 | 3.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 91.4 | 20 / 35 | 7186 |
| 2 | 1 | 73.8 | 94.0 | 26 / 35 | 7483 |
| 3 | 1 | 73.6 | 94.9 | 28 / 35 | 7124 |
| 4 | 1 | 72.6 | 93.0 | 26 / 35 | 6797 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 43 | 86% |
| shu.nitro.LENIN .T34 | 34 | 79% |
| lrem.Spectre 0.4.4 | 25 | 92% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 86% |
| js.PinBall 1.6 | 7 | 86% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 33% |

Hadur died in 41 of 140 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 15 | 37% | 52 |
| shu.nitro.LENIN .T34 | 10 | 24% | 41 |
| lrem.Spectre 0.4.4 | 5 | 12% | 18 |
| js.PinBall 1.6 | 5 | 12% | 14 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 10% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 2% | 5 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 134 rounds): 104884 melee ticks, 32244 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 18 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (134 rounds): longest scan gap while four or more were alive 18 ticks (134 rounds over 8); rounds whose longest gap at any count was over 8: 134; robots dropped as dead without a death event: 0.

Targeting waves (134 rounds): 32369 sent, 29091 reached their opponent, 6666 virtual hits (22.9% of those reached).

## Melee bench: F27

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 117 over 4 battles (29.3 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.4 | 98 / 140 | 2.49 | 19.1% | 21394 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.3 | 19.1% | 98 |
| mk.Alpha 0.2.1 | 2.3 | 13.8% | 25 |
| EH.Eagle 1.0.6 | 2.8 | 11.2% | 0 |
| throxbot.ThroxBot 0.1 | 5.5 | 9.1% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 5.8 | 9.1% | 4 |
| techdude.kombat.FlamingKombat 1.5 | 5.8 | 9.3% | 1 |
| wee.Gem 1.8.4 | 6.5 | 8.4% | 7 |
| joe.ADinosaur 1.0 | 6.8 | 8.6% | 0 |
| caimano.Furia_Ceca 0.22 | 8.5 | 7.2% | 0 |
| cs.Grudge 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 93.7 | 28 / 35 | 5353 |
| 2 | 1 | 72.0 | 95.9 | 31 / 35 | 6025 |
| 3 | 1 | 70.2 | 91.4 | 26 / 35 | 5285 |
| 4 | 2 | 59.2 | 52.7 | 13 / 35 | 4731 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 53 | 89% |
| EH.Eagle 1.0.6 | 26 | 100% |
| throxbot.ThroxBot 0.1 | 7 | 86% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 100% |
| wee.Gem 1.8.4 | 2 | 50% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 42 of 140 rounds, at a mean tick of 541. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cs.Grudge 1.0 | 13 | 31% | 12 |
| mk.Alpha 0.2.1 | 11 | 26% | 47 |
| throxbot.ThroxBot 0.1 | 5 | 12% | 15 |
| EH.Eagle 1.0.6 | 4 | 10% | 29 |
| joe.ADinosaur 1.0 | 3 | 7% | 5 |
| wee.Gem 1.8.4 | 2 | 5% | 8 |
| caimano.Furia_Ceca 0.22 | 2 | 5% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 9 |
| sheldor.melee.nano.TestMelee 0.1 | 1 | 2% | 8 |

Posture (Hadur's M records, 132 rounds): 78754 melee ticks, 23228 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 39 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 25833 sent, 22644 reached their opponent, 5199 virtual hits (23.0% of those reached).

## Melee bench: F28

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 138 over 4 battles (34.5 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 93.1 | 108 / 140 | 1.62 | 20.0% | 18147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 20.0% | 108 |
| kid.test.NightFox .2 | 2.0 | 14.3% | 15 |
| uji.Antique 1.0 | 3.0 | 12.1% | 6 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.3% | 3 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.2% | 6 |
| ahr.ice.Ice 1.0.2 | 6.5 | 7.7% | 1 |
| amk.ChumbaWumba 0.3 | 6.8 | 7.8% | 1 |
| stelo.Lifestealer 1.0 | 8.5 | 5.9% | 0 |
| stelo.PianistNano 1.2 | 8.8 | 5.8% | 0 |
| matt.advanced.Katana 1.0 | 9.5 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 97.5 | 29 / 35 | 4864 |
| 2 | 1 | 70.2 | 94.3 | 26 / 35 | 4723 |
| 3 | 1 | 69.4 | 91.4 | 28 / 35 | 4333 |
| 4 | 1 | 68.3 | 89.2 | 25 / 35 | 4227 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 57 | 84% |
| uji.Antique 1.0 | 38 | 95% |
| qohnil.blot.BlotBot 3.61 | 12 | 83% |
| amk.ChumbaWumba 0.3 | 6 | 83% |
| pfvicm.Sobieski 7.2.3b | 5 | 80% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| ahr.ice.Ice 1.0.2 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 33 of 140 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 10 | 30% | 40 |
| pfvicm.Sobieski 7.2.3b | 7 | 21% | 17 |
| amk.ChumbaWumba 0.3 | 6 | 18% | 13 |
| uji.Antique 1.0 | 5 | 15% | 39 |
| qohnil.blot.BlotBot 3.61 | 2 | 6% | 15 |
| ahr.ice.Ice 1.0.2 | 1 | 3% | 6 |
| matt.advanced.Katana 1.0 | 1 | 3% | 4 |
| stelo.Lifestealer 1.0 | 1 | 3% | 3 |
| stelo.PianistNano 1.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 133 rounds): 84363 melee ticks, 29479 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 33 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 27906 sent, 24625 reached their opponent, 3257 virtual hits (13.2% of those reached).

## Melee bench: F29

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 103 over 4 battles (25.8 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 88.4 | 64 / 140 | 2.04 | 19.4% | 20428 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 19.4% | 64 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 14.4% | 27 |
| deewiant.Anomaly 0.2 | 2.5 | 15.0% | 34 |
| myl.micro.Troodon 1.10 | 4.5 | 12.0% | 2 |
| jok.PheonixM 0.1.2 | 4.5 | 11.8% | 9 |
| ph.melee.ArcherME 0.3 | 6.0 | 7.7% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.5 | 5.9% | 0 |
| DBall.Anarchy 0.1 | 8.0 | 5.7% | 4 |
| ap.Frederick 1.1 | 9.0 | 4.4% | 0 |
| jangs.ns51 1.0 | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 86.7 | 17 / 35 | 4992 |
| 2 | 1 | 69.4 | 88.3 | 15 / 35 | 4998 |
| 3 | 1 | 70.8 | 90.2 | 19 / 35 | 5153 |
| 4 | 1 | 69.8 | 88.6 | 13 / 35 | 5285 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 46 | 59% |
| zyx.mega.YersiniaPestis 3.1 | 33 | 52% |
| myl.micro.Troodon 1.10 | 12 | 92% |
| jok.PheonixM 0.1.2 | 12 | 67% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 77 of 140 rounds, at a mean tick of 1095. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 28 | 36% | 56 |
| zyx.mega.YersiniaPestis 3.1 | 25 | 32% | 43 |
| jok.PheonixM 0.1.2 | 12 | 16% | 18 |
| myl.micro.Troodon 1.10 | 9 | 12% | 17 |
| ph.melee.ArcherME 0.3 | 2 | 3% | 3 |
| DBall.Anarchy 0.1 | 1 | 1% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 132 rounds): 112918 melee ticks, 35547 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 40 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 35040 sent, 31810 reached their opponent, 4602 virtual hits (14.5% of those reached).

## Melee bench: F30

hadur117.Hadur 3.22so against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 99 over 4 battles (24.8 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 80.4 | 46 / 140 | 2.56 | 18.6% | 17836 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 18.6% | 46 |
| stelo.PastFuture 2.3.2 | 2.5 | 15.1% | 19 |
| darkcanuck.B26354 1.06 | 3.3 | 15.0% | 34 |
| oog.melee.Capulet 1.2 | 3.3 | 14.7% | 23 |
| intruder.PrairieWolf 2.61 | 5.5 | 10.1% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 6.5 | 7.3% | 5 |
| ntc.Opposite 1.5 | 6.8 | 8.3% | 0 |
| tripphippy.Alice 1.1 | 7.3 | 8.0% | 3 |
| GarmBox.Anger 1.0 | 9.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 85.0 | 16 / 35 | 5106 |
| 2 | 1 | 66.9 | 83.9 | 13 / 35 | 4570 |
| 3 | 1 | 63.1 | 74.6 | 5 / 35 | 3864 |
| 4 | 1 | 65.6 | 78.2 | 12 / 35 | 4296 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 31 | 58% |
| oog.melee.Capulet 1.2 | 26 | 50% |
| stelo.PastFuture 2.3.2 | 17 | 53% |
| intruder.PrairieWolf 2.61 | 8 | 50% |
| tripphippy.Alice 1.1 | 2 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 0% |

Hadur died in 95 of 140 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 28 | 29% | 46 |
| stelo.PastFuture 2.3.2 | 24 | 25% | 32 |
| oog.melee.Capulet 1.2 | 21 | 22% | 32 |
| fowl3628800.LightningBolt 2.6.0 | 9 | 9% | 9 |
| intruder.PrairieWolf 2.61 | 5 | 5% | 10 |
| tripphippy.Alice 1.1 | 4 | 4% | 6 |
| ntc.Opposite 1.5 | 3 | 3% | 4 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 133 rounds): 106539 melee ticks, 26761 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 41 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 2.

Targeting waves (133 rounds): 30213 sent, 27199 reached their opponent, 4407 virtual hits (16.2% of those reached).

## Melee bench: F31

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 104 over 4 battles (26.0 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 81.3 | 47 / 140 | 2.69 | 16.9% | 17220 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.5 | 16.9% | 47 |
| abc.Shadow 3.84i | 1.5 | 17.1% | 52 |
| gh.mini.Griezel 0.2 | 3.3 | 13.3% | 25 |
| d414.nano.Quantum 1.0.0 | 3.8 | 12.0% | 11 |
| spinnercat.micro.Tyger 0.1 | 5.0 | 10.6% | 2 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.3% | 4 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.2% | 1 |
| fm.mammillarias 1.3 | 7.8 | 5.3% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 4.9% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 82.9 | 13 / 35 | 4252 |
| 2 | 2 | 64.3 | 75.6 | 8 / 35 | 4094 |
| 3 | 1 | 67.7 | 82.5 | 14 / 35 | 4834 |
| 4 | 2 | 66.7 | 84.1 | 12 / 35 | 4040 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 30 | 33% |
| gh.mini.Griezel 0.2 | 27 | 78% |
| d414.nano.Quantum 1.0.0 | 14 | 64% |
| spinnercat.micro.Tyger 0.1 | 4 | 100% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 93 of 140 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 38 | 41% | 52 |
| gh.mini.Griezel 0.2 | 18 | 19% | 40 |
| d414.nano.Quantum 1.0.0 | 13 | 14% | 19 |
| spinnercat.micro.Tyger 0.1 | 10 | 11% | 13 |
| gh.nano.Grofvuil 0.2 | 5 | 5% | 6 |
| timmit.nano.TimDog 0.33 | 4 | 4% | 5 |
| fm.mammillarias 1.3 | 3 | 3% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 2% | 2 |

Posture (Hadur's M records, 134 rounds): 100239 melee ticks, 22813 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (134 rounds): longest scan gap while four or more were alive 31 ticks (134 rounds over 8); rounds whose longest gap at any count was over 8: 134; robots dropped as dead without a death event: 0.

Targeting waves (134 rounds): 31762 sent, 28454 reached their opponent, 4419 virtual hits (15.5% of those reached).

## Melee bench: F32

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 134 over 4 battles (33.5 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 91.0 | 83 / 140 | 1.81 | 19.3% | 20018 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 19.3% | 83 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.3% | 36 |
| apc.botM 3.0 | 3.3 | 12.4% | 9 |
| lxx.ConceptA 0.8 | 3.8 | 10.9% | 5 |
| vjik.UnViolation 1.1 | 5.0 | 9.8% | 3 |
| bayen.UbaMicro 1.4 | 6.3 | 8.5% | 2 |
| panzer.Panzer 0.2 | 6.8 | 7.7% | 0 |
| yk.JahMicro 1.0 | 8.0 | 6.9% | 0 |
| conscience.Electron 1.3g | 9.0 | 5.7% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 90.2 | 23 / 35 | 4777 |
| 2 | 1 | 70.1 | 94.0 | 23 / 35 | 5253 |
| 3 | 1 | 69.1 | 92.4 | 19 / 35 | 5082 |
| 4 | 1 | 68.0 | 87.3 | 18 / 35 | 4906 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 62 | 56% |
| apc.botM 3.0 | 32 | 84% |
| vjik.UnViolation 1.1 | 6 | 67% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| lxx.ConceptA 0.8 | 5 | 60% |
| yk.JahMicro 1.0 | 3 | 100% |
| donjezza.Jezza 1.0 | 3 | 67% |
| panzer.Panzer 0.2 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 57 of 140 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 32 | 56% | 63 |
| apc.botM 3.0 | 7 | 12% | 35 |
| vjik.UnViolation 1.1 | 4 | 7% | 15 |
| lxx.ConceptA 0.8 | 4 | 7% | 8 |
| panzer.Panzer 0.2 | 3 | 5% | 4 |
| conscience.Electron 1.3g | 3 | 5% | 4 |
| bayen.UbaMicro 1.4 | 2 | 4% | 7 |
| yk.JahMicro 1.0 | 1 | 2% | 2 |
| donjezza.Jezza 1.0 | 1 | 2% | 2 |

Posture (Hadur's M records, 132 rounds): 80617 melee ticks, 36296 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 75 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 75 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 26649 sent, 23367 reached their opponent, 4017 virtual hits (17.2% of those reached).

## Melee bench: F33

hadur117.Hadur 3.22so against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 126 over 4 battles (31.5 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 89.7 | 85 / 140 | 1.82 | 21.8% | 19484 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 21.8% | 85 |
| maribo.Quester 0.3 | 2.0 | 16.6% | 22 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 14.5% | 16 |
| labg.Cataclysm 2.05 | 4.0 | 12.5% | 14 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.0 | 10.0% | 3 |
| baal.nano.N 1.42 | 6.0 | 9.3% | 0 |
| zyx.micro.Ant 1.1 | 7.3 | 6.6% | 0 |
| sanja.First 0.1 | 7.8 | 5.5% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 86.8 | 19 / 35 | 4834 |
| 2 | 1 | 71.1 | 91.4 | 22 / 35 | 5117 |
| 3 | 1 | 68.6 | 85.0 | 16 / 35 | 4464 |
| 4 | 1 | 72.4 | 95.7 | 28 / 35 | 5069 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 51 | 78% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 90% |
| labg.Cataclysm 2.05 | 17 | 53% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 67% |
| baal.nano.N 1.42 | 4 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 55 of 140 rounds, at a mean tick of 973. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 22 | 40% | 65 |
| labg.Cataclysm 2.05 | 13 | 24% | 23 |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 16% | 14 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 8 | 15% | 28 |
| sanja.First 0.1 | 2 | 4% | 2 |
| baal.nano.N 1.42 | 1 | 2% | 6 |
| zyx.micro.Ant 1.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 133 rounds): 104575 melee ticks, 34471 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 56 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 30596 sent, 27669 reached their opponent, 4000 virtual hits (14.5% of those reached).

## Melee bench: F34

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 100 over 4 battles (25.0 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 90.3 | 70 / 140 | 1.87 | 19.7% | 23101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 19.7% | 70 |
| kid.Gladiator .7.2 | 2.3 | 15.9% | 25 |
| stelo.Spread 0.9 | 2.8 | 15.8% | 33 |
| jcs.Seth 1.8 | 4.0 | 11.6% | 13 |
| tcf.Reach 3 | 5.3 | 10.0% | 0 |
| cli.Dancer 1.1 | 5.8 | 9.4% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 6.8% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.9% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.3% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 91.1 | 20 / 35 | 6076 |
| 2 | 1 | 70.3 | 91.4 | 16 / 35 | 5370 |
| 3 | 1 | 71.3 | 91.1 | 20 / 35 | 5906 |
| 4 | 1 | 69.9 | 87.6 | 14 / 35 | 5749 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 46 | 61% |
| kid.Gladiator .7.2 | 44 | 61% |
| jcs.Seth 1.8 | 16 | 50% |
| tcf.Reach 3 | 6 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 71 of 140 rounds, at a mean tick of 1142. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 31 | 44% | 53 |
| stelo.Spread 0.9 | 24 | 34% | 51 |
| jcs.Seth 1.8 | 10 | 14% | 17 |
| tcf.Reach 3 | 3 | 4% | 11 |
| ratosh.Wesco 1.4 | 1 | 1% | 3 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
| cli.Dancer 1.1 | 0 | 0% | 3 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 133 rounds): 109349 melee ticks, 45815 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 41 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 33506 sent, 30249 reached their opponent, 4820 virtual hits (15.9% of those reached).

## Melee bench: F35

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 91 over 4 battles (22.8 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 79.9 | 23 / 140 | 2.81 | 15.7% | 15810 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.0% | 91 |
| hadur117.Hadur 3.22so | 2.0 | 15.7% | 23 |
| gh.mini.Gruwel 0.9 | 3.3 | 13.4% | 19 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.4% | 7 |
| rz.HawkOnFire 0.1 | 5.0 | 11.4% | 0 |
| wit.Chuliath 1.0 | 6.5 | 6.6% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.3 | 6.2% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.0 | 5.6% | 0 |
| dans.Cinnamon 1.2 | 8.8 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 79.7 | 4 / 35 | 4396 |
| 2 | 2 | 62.9 | 76.2 | 5 / 35 | 3489 |
| 3 | 2 | 66.6 | 83.2 | 8 / 35 | 4357 |
| 4 | 2 | 64.1 | 80.6 | 6 / 35 | 3568 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 54 | 15% |
| gh.mini.Gruwel 0.9 | 11 | 27% |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 71% |
| rz.HawkOnFire 0.1 | 6 | 100% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 117 of 140 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 68 | 58% | 78 |
| gh.mini.Gruwel 0.9 | 18 | 15% | 24 |
| dmh.robocode.robot.BlackDeath 9.2 | 17 | 15% | 19 |
| rz.HawkOnFire 0.1 | 8 | 7% | 11 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 5 | 4% | 5 |
| wit.Chuliath 1.0 | 1 | 1% | 2 |

Posture (Hadur's M records, 135 rounds): 94721 melee ticks, 29409 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (135 rounds): longest scan gap while four or more were alive 48 ticks (135 rounds over 8); rounds whose longest gap at any count was over 8: 135; robots dropped as dead without a death event: 0.

Targeting waves (135 rounds): 28994 sent, 25601 reached their opponent, 3964 virtual hits (15.5% of those reached).

## Melee bench: F36

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 152 over 4 battles (38.0 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 93.3 | 106 / 140 | 1.61 | 21.4% | 23683 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 21.4% | 106 |
| bzdp.Pansy 2.1 | 2.3 | 12.8% | 8 |
| alpha.RainingFire 1.0 | 2.8 | 12.0% | 12 |
| mz.Cork 0.1 | 5.0 | 10.4% | 4 |
| bvh.mini.Fenrir 0.39 | 5.3 | 9.9% | 0 |
| bvh.micro.Freya 0.3 | 5.5 | 10.0% | 4 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.4% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.3% | 0 |
| dl.BetterWalls 1.0 | 9.0 | 4.9% | 1 |
| sample.MyFirstRobot 1.0 | 9.8 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 91.4 | 25 / 35 | 5770 |
| 2 | 1 | 70.6 | 89.8 | 23 / 35 | 5569 |
| 3 | 1 | 72.3 | 94.3 | 28 / 35 | 6053 |
| 4 | 1 | 73.1 | 97.5 | 30 / 35 | 6291 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 37 | 97% |
| mz.Cork 0.1 | 21 | 86% |
| bvh.micro.Freya 0.3 | 20 | 90% |
| alpha.RainingFire 1.0 | 18 | 67% |
| bvh.mini.Fenrir 0.39 | 13 | 100% |
| m3thos.Eva02 0.7.1 | 9 | 89% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 34 of 140 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 12 | 35% | 28 |
| bzdp.Pansy 2.1 | 7 | 21% | 36 |
| mz.Cork 0.1 | 5 | 15% | 25 |
| bvh.micro.Freya 0.3 | 4 | 12% | 22 |
| m3thos.Eva02 0.7.1 | 3 | 9% | 14 |
| bvh.mini.Fenrir 0.39 | 3 | 9% | 10 |
| dl.BetterWalls 1.0 | 0 | 0% | 3 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 132 rounds): 93580 melee ticks, 32600 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 48 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 31495 sent, 28327 reached their opponent, 5520 virtual hits (19.5% of those reached).

## Melee bench: F37

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 178 over 4 battles (44.5 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.8 | 111 / 140 | 2.01 | 19.5% | 22867 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 19.5% | 111 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.5 | 10.9% | 2 |
| germ.TheMind .2 | 3.8 | 10.1% | 3 |
| EBBU.Sim2 1.02 | 4.8 | 9.2% | 3 |
| agrach.Dalek 1.0 | 5.5 | 9.1% | 5 |
| stelo.UntouchableNano 1.3 | 6.3 | 8.9% | 9 |
| lmk.ACPFinal 0.1 | 6.3 | 8.9% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 6.8 | 8.4% | 0 |
| skm.Ryubot 1.0 | 9.0 | 7.7% | 3 |
| mb.Beast 0.1 | 9.3 | 7.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 92.7 | 30 / 35 | 5755 |
| 2 | 1 | 65.5 | 79.4 | 24 / 35 | 5021 |
| 3 | 1 | 69.5 | 90.2 | 28 / 35 | 6007 |
| 4 | 1 | 69.9 | 93.0 | 29 / 35 | 6084 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 20 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 17 | 100% |
| lmk.ACPFinal 0.1 | 16 | 100% |
| stelo.UntouchableNano 1.3 | 15 | 93% |
| mb.Beast 0.1 | 13 | 100% |
| agrach.Dalek 1.0 | 11 | 100% |
| EBBU.Sim2 1.02 | 10 | 100% |
| skm.Ryubot 1.0 | 7 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 100% |

Hadur died in 29 of 140 rounds, at a mean tick of 353. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 8 | 28% | 26 |
| lmk.ACPFinal 0.1 | 6 | 21% | 20 |
| stelo.UntouchableNano 1.3 | 6 | 21% | 19 |
| mn.nano.perceptual.Impact 1.3.0 | 6 | 21% | 10 |
| EBBU.Sim2 1.02 | 2 | 7% | 11 |
| mb.Beast 0.1 | 1 | 3% | 13 |
| agrach.Dalek 1.0 | 0 | 0% | 19 |
| germ.TheMind .2 | 0 | 0% | 17 |
| skm.Ryubot 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 134 rounds): 59657 melee ticks, 18080 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (134 rounds): longest scan gap while four or more were alive 31 ticks (134 rounds over 8); rounds whose longest gap at any count was over 8: 134; robots dropped as dead without a death event: 1.

Targeting waves (134 rounds): 19929 sent, 16765 reached their opponent, 4704 virtual hits (28.1% of those reached).

## Melee bench: F38

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 151 over 4 battles (37.8 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.1 | 75 / 140 | 2.07 | 18.8% | 20142 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 18.8% | 75 |
| justin.Mallais 14.0 | 2.0 | 15.7% | 39 |
| bvh.mini.Freya 0.55 | 3.0 | 12.9% | 7 |
| cs.Wren 1.0 | 4.5 | 10.7% | 3 |
| kdf.KoulDestroyer 1.0 | 5.0 | 10.2% | 4 |
| bts.mega.Gnarly 1.4 | 5.5 | 10.4% | 10 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 7.6% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 5.7% | 0 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.3% | 1 |
| bzdp.BoxCar 2.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 85.7 | 15 / 35 | 4669 |
| 2 | 1 | 68.9 | 88.9 | 20 / 35 | 4854 |
| 3 | 1 | 70.1 | 91.4 | 20 / 35 | 5378 |
| 4 | 1 | 69.3 | 86.3 | 20 / 35 | 5241 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 44 | 66% |
| bvh.mini.Freya 0.55 | 16 | 94% |
| bts.mega.Gnarly 1.4 | 13 | 62% |
| cs.Wren 1.0 | 11 | 100% |
| kdf.KoulDestroyer 1.0 | 9 | 89% |
| davidalves.net.DuelistNanoMelee 1.01 | 2 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 65 of 140 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 34 | 52% | 65 |
| bvh.mini.Freya 0.55 | 12 | 18% | 21 |
| bts.mega.Gnarly 1.4 | 9 | 14% | 22 |
| cs.Wren 1.0 | 4 | 6% | 13 |
| kdf.KoulDestroyer 1.0 | 3 | 5% | 8 |
| matt.UnderDark3 2.4.34 | 1 | 2% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 2% | 3 |
| bzdp.BoxCar 2.0 | 1 | 2% | 1 |
| davidalves.net.DuelistNanoMelee 1.01 | 0 | 0% | 3 |

Posture (Hadur's M records, 132 rounds): 90939 melee ticks, 23673 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 63 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 28914 sent, 25573 reached their opponent, 5140 virtual hits (20.1% of those reached).

## Melee bench: F39

hadur117.Hadur 3.22so against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 124 over 4 battles (31.0 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 90.2 | 83 / 140 | 1.79 | 22.2% | 23497 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 22.2% | 83 |
| bvh.fry.Freya 0.82 | 2.3 | 15.9% | 18 |
| az.Ololobot 0.2.4 | 2.8 | 14.9% | 34 |
| winamp32.micro.MicroMacro 1.0 | 4.0 | 9.8% | 1 |
| apollokidd.ApolloKidd 0.9 | 5.8 | 8.5% | 1 |
| gimp.GimpBot 0.1 | 6.0 | 8.2% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 6.3 | 8.0% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.0 | 6.5% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.0 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 92.5 | 19 / 35 | 6174 |
| 2 | 1 | 71.1 | 92.1 | 24 / 35 | 5900 |
| 3 | 1 | 71.9 | 94.6 | 23 / 35 | 6376 |
| 4 | 1 | 66.9 | 81.4 | 17 / 35 | 5047 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 58 | 55% |
| bvh.fry.Freya 0.82 | 41 | 76% |
| winamp32.micro.MicroMacro 1.0 | 8 | 88% |
| apollokidd.ApolloKidd 0.9 | 4 | 100% |
| gimp.GimpBot 0.1 | 4 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 4 | 100% |

Hadur died in 57 of 140 rounds, at a mean tick of 1187. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 32 | 56% | 65 |
| bvh.fry.Freya 0.82 | 14 | 25% | 39 |
| apollokidd.ApolloKidd 0.9 | 3 | 5% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 3 | 5% | 5 |
| winamp32.micro.MicroMacro 1.0 | 2 | 4% | 10 |
| gimp.GimpBot 0.1 | 2 | 4% | 9 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 2% | 3 |

Posture (Hadur's M records, 132 rounds): 99428 melee ticks, 46345 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 620 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 338 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 28758 sent, 25927 reached their opponent, 4423 virtual hits (17.1% of those reached).

## Melee bench: F40

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 131 over 4 battles (32.8 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 92.5 | 101 / 140 | 1.67 | 21.1% | 23121 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 21.1% | 101 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.3% | 13 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 13.1% | 17 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.5% | 5 |
| mz.AntiGrav 1.0 | 4.5 | 10.8% | 2 |
| stelo.Randomness 1.0 | 6.5 | 8.4% | 0 |
| alpha.BlackIce 1.0 | 6.5 | 8.8% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.3% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 3.7% | 0 |
| sample.Corners 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 87.9 | 24 / 35 | 5415 |
| 2 | 1 | 72.9 | 94.9 | 27 / 35 | 6410 |
| 3 | 1 | 71.5 | 92.4 | 23 / 35 | 5704 |
| 4 | 1 | 72.2 | 94.9 | 27 / 35 | 5592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 49 | 84% |
| kano.gamma.KanoGamma 1.8 | 24 | 71% |
| mz.AntiGrav 1.0 | 19 | 100% |
| Polkwane.SmashMelee 1.0 | 15 | 100% |
| stelo.Randomness 1.0 | 7 | 100% |
| alpha.BlackIce 1.0 | 3 | 67% |

Hadur died in 39 of 140 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 12 | 31% | 46 |
| kano.gamma.KanoGamma 1.8 | 12 | 31% | 36 |
| Polkwane.SmashMelee 1.0 | 11 | 28% | 21 |
| alpha.BlackIce 1.0 | 3 | 8% | 6 |
| amk.superstrike.SuperStrike 0.3 | 1 | 3% | 2 |
| mz.AntiGrav 1.0 | 0 | 0% | 16 |
| stelo.Randomness 1.0 | 0 | 0% | 11 |
| sample.Corners 1.0 | 0 | 0% | 1 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 132 rounds): 96512 melee ticks, 30026 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 36 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 36 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 30566 sent, 27309 reached their opponent, 5317 virtual hits (19.5% of those reached).

## Melee bench: F41

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 126 over 4 battles (31.5 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.6 | 82 / 140 | 1.76 | 19.7% | 20261 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 19.7% | 82 |
| eem.EvBotNG v12.8 | 2.0 | 15.3% | 36 |
| lessonz.robocode.Oz 0.5.0 | 3.3 | 12.8% | 8 |
| ary.Swarm 1.1 | 3.8 | 12.5% | 4 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.9% | 6 |
| shrub.Silver v048 | 6.0 | 9.1% | 3 |
| zyx.nano.Ant 1.1 | 7.0 | 7.4% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 5.5% | 1 |
| stelo.Mirror 1.1 | 8.8 | 4.6% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 93.3 | 21 / 35 | 4801 |
| 2 | 1 | 71.7 | 94.9 | 25 / 35 | 5473 |
| 3 | 1 | 68.6 | 86.7 | 17 / 35 | 4737 |
| 4 | 1 | 70.4 | 91.4 | 19 / 35 | 5250 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 56 | 59% |
| lessonz.robocode.Oz 0.5.0 | 32 | 84% |
| ary.Swarm 1.1 | 13 | 100% |
| simonton.nano.MeleeSeed 1.8 | 9 | 78% |
| shrub.Silver v048 | 3 | 33% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 0% |

Hadur died in 58 of 140 rounds, at a mean tick of 1030. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 29 | 50% | 58 |
| lessonz.robocode.Oz 0.5.0 | 10 | 17% | 27 |
| ary.Swarm 1.1 | 6 | 10% | 24 |
| simonton.nano.MeleeSeed 1.8 | 6 | 10% | 17 |
| shrub.Silver v048 | 4 | 7% | 5 |
| stelo.Mirror 1.1 | 1 | 2% | 3 |
| zyx.nano.Ant 1.1 | 1 | 2% | 3 |
| jsal.Jsalbot 1.0 | 1 | 2% | 2 |
| acogdev.alpha 0.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 132 rounds): 101142 melee ticks, 38671 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 58 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 32361 sent, 29021 reached their opponent, 4214 virtual hits (14.5% of those reached).

## Melee bench: F42

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 116 over 4 battles (29.0 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.9 | 87 / 140 | 1.82 | 20.4% | 24512 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 20.4% | 87 |
| wompi.Wallaby 5.1 | 2.0 | 14.9% | 25 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.3% | 9 |
| ara.Shera 0.88 | 3.8 | 13.0% | 18 |
| amz.NanoClone 1.41 | 5.3 | 8.4% | 0 |
| dsw.StaticD 1.0 | 5.8 | 7.3% | 1 |
| maribo.IotaCT 1.1 | 7.3 | 6.5% | 0 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.7% | 0 |
| stelo.MirrorMicro 1.0 | 8.8 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 89.2 | 20 / 35 | 5959 |
| 2 | 1 | 70.4 | 91.7 | 22 / 35 | 5768 |
| 3 | 1 | 70.8 | 90.5 | 23 / 35 | 6120 |
| 4 | 1 | 71.7 | 92.1 | 22 / 35 | 6665 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 57 | 89% |
| maribo.mini.MiniQuester 0.1 | 23 | 83% |
| ara.Shera 0.88 | 18 | 61% |
| dsw.StaticD 1.0 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 55 of 140 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 22 | 40% | 36 |
| wompi.Wallaby 5.1 | 18 | 33% | 62 |
| maribo.mini.MiniQuester 0.1 | 9 | 16% | 28 |
| dsw.StaticD 1.0 | 2 | 4% | 7 |
| maribo.IotaCT 1.1 | 2 | 4% | 4 |
| stelo.MirrorMicro 1.0 | 1 | 2% | 1 |
| mme.NikeEnhanced 2.0 | 1 | 2% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 132 rounds): 103485 melee ticks, 29061 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 41 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 32706 sent, 29512 reached their opponent, 5515 virtual hits (18.7% of those reached).

## Melee bench: F43

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 97 over 4 battles (24.3 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 80.6 | 31 / 140 | 2.75 | 16.3% | 17320 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.2% | 86 |
| hadur117.Hadur 3.22so | 2.0 | 16.3% | 31 |
| brainfade.melee.Dusk 0.44 | 3.5 | 12.3% | 16 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.5% | 5 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.7% | 2 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.3% | 0 |
| mz.NanoGod 2.02 | 7.5 | 8.0% | 0 |
| jab.DiamondStealer 5 | 7.5 | 7.7% | 1 |
| cvt.Firsty 1.0 | 9.0 | 3.6% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 81.0 | 8 / 35 | 4320 |
| 2 | 2 | 66.3 | 80.0 | 8 / 35 | 4290 |
| 3 | 2 | 66.5 | 80.0 | 7 / 35 | 4412 |
| 4 | 2 | 66.8 | 81.3 | 8 / 35 | 4298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 56 | 32% |
| brainfade.melee.Dusk 0.44 | 10 | 30% |
| dummy.micro.Sparrow 2.5 | 7 | 57% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 75% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |
| jab.DiamondStealer 5 | 1 | 0% |

Hadur died in 110 of 140 rounds, at a mean tick of 934. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 65 | 59% | 86 |
| brainfade.melee.Dusk 0.44 | 15 | 14% | 19 |
| dummy.micro.Sparrow 2.5 | 13 | 12% | 14 |
| wcsv.melee.EngineerMelee 0.1 | 9 | 8% | 12 |
| mz.NanoGod 2.02 | 5 | 5% | 6 |
| jab.DiamondStealer 5 | 2 | 2% | 2 |
| Krabb.akim2.Akim2 1.1b | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 135 rounds): 99695 melee ticks, 31930 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (135 rounds): longest scan gap while four or more were alive 63 ticks (135 rounds over 8); rounds whose longest gap at any count was over 8: 135; robots dropped as dead without a death event: 1.

Targeting waves (135 rounds): 30982 sent, 27675 reached their opponent, 4450 virtual hits (16.1% of those reached).

## Melee bench: F44

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 93 over 4 battles (23.3 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 94.3 | 102 / 140 | 1.51 | 21.9% | 26002 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 21.9% | 102 |
| stelo.Liblix 0.3.1 | 2.0 | 15.8% | 27 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.1% | 8 |
| jwirde.Gort 2.0 | 4.5 | 9.1% | 2 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.8 | 9.3% | 2 |
| disan.Chair 2.2.0 | 5.8 | 8.4% | 0 |
| stf.PanzerGeneral 0.1 | 7.5 | 6.2% | 0 |
| wompi.Quokka 1.6 | 7.8 | 5.9% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.8% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 91.4 | 24 / 35 | 6372 |
| 2 | 1 | 72.8 | 95.6 | 25 / 35 | 6541 |
| 3 | 1 | 73.2 | 94.0 | 26 / 35 | 7002 |
| 4 | 1 | 72.7 | 96.2 | 27 / 35 | 6087 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 58 | 76% |
| tzu.TheArtOfWar 1.2 | 49 | 92% |
| jwirde.Gort 2.0 | 5 | 100% |
| disan.Chair 2.2.0 | 4 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 75% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 39 of 140 rounds, at a mean tick of 1001. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 24 | 62% | 71 |
| tzu.TheArtOfWar 1.2 | 8 | 21% | 45 |
| disan.Chair 2.2.0 | 2 | 5% | 4 |
| amk.jointstrike.JointStrike 0.2 | 2 | 5% | 3 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 1 | 3% | 6 |
| wompi.Quokka 1.6 | 1 | 3% | 1 |
| jwirde.Gort 2.0 | 0 | 0% | 9 |
| sample.Crazy 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 132 rounds): 101085 melee ticks, 33883 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 49 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 1.

Targeting waves (132 rounds): 33803 sent, 30673 reached their opponent, 6034 virtual hits (19.7% of those reached).

## Melee bench: F45

hadur117.Hadur 3.22so against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 127 over 4 battles (31.8 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.6 | 85 / 140 | 1.76 | 20.9% | 23483 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 20.9% | 85 |
| jje.BagPuss 1.2 | 3.0 | 11.7% | 7 |
| eem.IWillFireNoBullet v2.8 | 3.3 | 11.6% | 36 |
| myl.nano.Graviton 1.10 | 3.3 | 11.2% | 1 |
| sul.Lunar 1.1 | 4.5 | 10.2% | 6 |
| hvilela.HVilela 0.9 | 6.5 | 8.6% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 8.7% | 1 |
| fm.claire 1.7 | 7.8 | 7.7% | 1 |
| wit.Deep7 2.0 | 9.3 | 5.0% | 2 |
| abud.ThirdRobo 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 91.4 | 21 / 35 | 6126 |
| 2 | 1 | 70.0 | 89.2 | 20 / 35 | 5618 |
| 3 | 1 | 71.3 | 92.1 | 21 / 35 | 6033 |
| 4 | 1 | 71.3 | 93.7 | 23 / 35 | 5706 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 51 | 59% |
| jje.BagPuss 1.2 | 21 | 86% |
| sul.Lunar 1.1 | 15 | 80% |
| myl.nano.Graviton 1.10 | 11 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 89% |
| hvilela.HVilela 0.9 | 3 | 100% |
| fm.claire 1.7 | 2 | 50% |
| wit.Deep7 2.0 | 2 | 100% |

Hadur died in 56 of 140 rounds, at a mean tick of 1604. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 25 | 45% | 0 |
| jje.BagPuss 1.2 | 11 | 20% | 43 |
| sul.Lunar 1.1 | 6 | 11% | 30 |
| myl.nano.Graviton 1.10 | 5 | 9% | 23 |
| fm.claire 1.7 | 4 | 7% | 6 |
| pez.mini.ChironexFleckeri 0.5 | 3 | 5% | 18 |
| hvilela.HVilela 0.9 | 1 | 2% | 9 |
| wit.Deep7 2.0 | 1 | 2% | 5 |
| abud.ThirdRobo 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 133 rounds): 129136 melee ticks, 56761 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 38 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 39174 sent, 35925 reached their opponent, 4736 virtual hits (13.2% of those reached).

## Melee bench: F46

hadur117.Hadur 3.22so against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 73 over 4 battles (18.3 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 90.4 | 80 / 140 | 1.76 | 21.3% | 20248 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22so | 1.0 | 21.3% | 80 |
| kc.mini.Mirage 0.2 | 2.0 | 19.3% | 42 |
| cx.Princess 1.0 | 3.5 | 13.1% | 15 |
| mz.MicroSheep 1.0 | 3.8 | 11.7% | 3 |
| sadoner.killer 0.2 | 4.8 | 9.9% | 0 |
| jeremyreeder.collective.Prophet 5 | 6.5 | 7.6% | 0 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.6% | 0 |
| kurios.DOSexe .9a | 7.8 | 6.0% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.5 | 21 / 35 | 4852 |
| 2 | 1 | 68.7 | 87.5 | 13 / 35 | 5196 |
| 3 | 1 | 71.1 | 93.2 | 24 / 35 | 5145 |
| 4 | 1 | 70.4 | 93.6 | 22 / 35 | 5055 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 85 | 73% |
| cx.Princess 1.0 | 16 | 63% |
| mz.MicroSheep 1.0 | 5 | 100% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 60 of 140 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 42 | 70% | 97 |
| cx.Princess 1.0 | 12 | 20% | 23 |
| sadoner.killer 0.2 | 3 | 5% | 4 |
| mz.MicroSheep 1.0 | 2 | 3% | 10 |
| arthord.NanoSatanMelee Beta | 1 | 2% | 3 |
| jeremyreeder.collective.Prophet 5 | 0 | 0% | 2 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 133 rounds): 93740 melee ticks, 37114 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 24 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 25547 sent, 22623 reached their opponent, 3594 virtual hits (15.9% of those reached).

