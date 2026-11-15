# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 142 over 4 battles (35.5 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.3 | 32 / 140 | 2.14 | 18.0% | 22837 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.5% | 93 |
| hadur117.Hadur 3.22aa | 2.0 | 18.0% | 32 |
| sgp.JollyNinja 3.53 | 3.3 | 11.9% | 9 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 11.0% | 2 |
| mz.MicroGodMelee 1 | 5.3 | 9.7% | 2 |
| lorneswork.Predator 1.0 | 5.5 | 9.8% | 3 |
| adt.Ar2 1.0 | 7.0 | 7.8% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 4.9% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.2% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 84.4 | 6 / 35 | 5230 |
| 2 | 2 | 68.9 | 87.6 | 10 / 35 | 5843 |
| 3 | 2 | 69.5 | 89.8 | 11 / 35 | 6010 |
| 4 | 2 | 68.2 | 87.3 | 5 / 35 | 5754 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 84 | 11% |
| sgp.JollyNinja 3.53 | 11 | 55% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 86% |
| mz.MicroGodMelee 1 | 6 | 83% |
| lorneswork.Predator 1.0 | 6 | 83% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 109 of 140 rounds, at a mean tick of 1223. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 88 | 81% | 99 |
| sgp.JollyNinja 3.53 | 8 | 7% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 5% | 9 |
| lorneswork.Predator 1.0 | 4 | 4% | 9 |
| mz.MicroGodMelee 1 | 2 | 2% | 7 |
| adt.Ar2 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 132 rounds): 93135 melee ticks, 63116 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 38 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 28798 sent, 25522 reached their opponent, 4828 virtual hits (18.9% of those reached).

## Melee bench: F02

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 193 over 4 battles (48.3 per battle, most in one battle 51). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.0 | 76 / 140 | 1.99 | 19.6% | 21768 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 19.6% | 76 |
| pulsar.PulsarMax 0.8.9 | 2.0 | 14.4% | 26 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 13.2% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.0% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.5 | 10.4% | 11 |
| sch.Simone 0.3d | 6.5 | 7.8% | 5 |
| Noran.BitchingElk 0.054 | 6.8 | 7.5% | 7 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 7.6% | 1 |
| stelo.PatternRobot 1.0 | 9.0 | 5.1% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 89.2 | 22 / 35 | 5449 |
| 2 | 1 | 70.7 | 90.5 | 20 / 35 | 5866 |
| 3 | 1 | 68.8 | 87.9 | 16 / 35 | 5160 |
| 4 | 1 | 69.1 | 88.6 | 18 / 35 | 5293 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 38 | 61% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 26 | 81% |
| com.cohesiva.robocode.ManOwaR 1.0 | 14 | 50% |
| sch.Simone 0.3d | 12 | 83% |
| Noran.BitchingElk 0.054 | 10 | 60% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 100% |
| stelo.PatternRobot 1.0 | 3 | 67% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 64 of 140 rounds, at a mean tick of 1017. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 21 | 33% | 46 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 12 | 19% | 36 |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 17% | 21 |
| Noran.BitchingElk 0.054 | 6 | 9% | 13 |
| sch.Simone 0.3d | 6 | 9% | 13 |
| lrem.micro.SpikeSoldier 0.4 | 3 | 5% | 5 |
| fnc.bandit.Bandit 5.2.0 | 3 | 5% | 4 |
| stelo.PatternRobot 1.0 | 2 | 3% | 2 |

Posture (Hadur's M records, 133 rounds): 111787 melee ticks, 33637 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 33 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 38301 sent, 35039 reached their opponent, 5666 virtual hits (16.2% of those reached).

## Melee bench: F03

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 132 over 4 battles (33.0 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 93.9 | 117 / 140 | 1.55 | 21.4% | 27022 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 21.4% | 117 |
| radnor.DoctorBob 1.42 | 2.3 | 13.9% | 13 |
| vuen.Cake 2.51 | 3.3 | 12.4% | 4 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.8% | 4 |
| urdos.URDOS 1.3 | 5.0 | 9.0% | 1 |
| adt.Ar1 2.1 | 6.0 | 7.5% | 1 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.5% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.8 | 6.1% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 95.9 | 30 / 35 | 6338 |
| 2 | 1 | 72.4 | 94.6 | 30 / 35 | 7146 |
| 3 | 1 | 71.4 | 91.1 | 27 / 35 | 6834 |
| 4 | 1 | 71.8 | 94.0 | 30 / 35 | 6704 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 48 | 98% |
| radnor.DoctorBob 1.42 | 38 | 97% |
| kawigi.nano.Lib 1.0 | 26 | 100% |
| urdos.URDOS 1.3 | 3 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 23 of 140 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 13 | 57% | 41 |
| kawigi.nano.Lib 1.0 | 3 | 13% | 29 |
| urdos.URDOS 1.3 | 2 | 9% | 7 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 9% | 4 |
| vuen.Cake 2.51 | 1 | 4% | 48 |
| adt.Ar1 2.1 | 1 | 4% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 4% | 2 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 133 rounds): 81983 melee ticks, 25832 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 56 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 24293 sent, 21044 reached their opponent, 5151 virtual hits (24.5% of those reached).

## Melee bench: F04

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 97 over 4 battles (24.3 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 86.9 | 20 / 140 | 2.18 | 18.3% | 24499 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.4% | 108 |
| hadur117.Hadur 3.22aa | 2.0 | 18.3% | 20 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.8% | 8 |
| josago.Jorgito 0.16 | 4.5 | 9.3% | 2 |
| TNT.TNT 0.99.1 | 4.5 | 10.6% | 2 |
| css.Delitioner 0.11 | 6.5 | 7.1% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.3% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.2% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.3% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.2 | 86.3 | 4 / 35 | 6065 |
| 2 | 2 | 69.8 | 85.7 | 8 / 35 | 6422 |
| 3 | 2 | 69.2 | 86.7 | 2 / 35 | 6133 |
| 4 | 2 | 69.5 | 88.9 | 6 / 35 | 5879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 95 | 13% |
| apc.LeeroyJenkins2 1.0 | 9 | 56% |
| josago.Jorgito 0.16 | 3 | 67% |
| TNT.TNT 0.99.1 | 3 | 33% |

Hadur died in 120 of 140 rounds, at a mean tick of 1301. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 94 | 78% | 108 |
| apc.LeeroyJenkins2 1.0 | 15 | 13% | 19 |
| TNT.TNT 0.99.1 | 5 | 4% | 6 |
| josago.Jorgito 0.16 | 5 | 4% | 5 |
| css.Delitioner 0.11 | 1 | 1% | 2 |

Posture (Hadur's M records, 132 rounds): 124587 melee ticks, 48711 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 73 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 37335 sent, 34121 reached their opponent, 4778 virtual hits (14.0% of those reached).

## Melee bench: F05

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 116 over 4 battles (29.0 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 78.3 | 13 / 140 | 2.95 | 15.1% | 16439 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.9% | 82 |
| justin.DemonicRage 3.4 | 2.0 | 17.2% | 38 |
| hadur117.Hadur 3.22aa | 3.0 | 15.1% | 13 |
| wompi.Numbat 2.1 | 4.0 | 12.4% | 6 |
| ms.Ares 0.19 | 5.5 | 9.0% | 0 |
| axeBots.HataMoto 3.09 | 5.5 | 8.6% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.5 | 5.3% | 0 |
| supersample.SuperBoxBot 1.0 | 7.5 | 5.3% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.1% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.5 | 79.4 | 4 / 35 | 4008 |
| 2 | 3 | 65.7 | 82.5 | 1 / 35 | 4535 |
| 3 | 3 | 63.4 | 74.9 | 5 / 35 | 4004 |
| 4 | 3 | 63.6 | 76.5 | 3 / 35 | 3892 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 27 | 26% |
| cb.fire.Firestarter 2.0f | 24 | 4% |
| wompi.Numbat 2.1 | 4 | 50% |
| axeBots.HataMoto 3.09 | 2 | 50% |
| ms.Ares 0.19 | 2 | 100% |

Hadur died in 127 of 140 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 55 | 43% | 61 |
| cb.fire.Firestarter 2.0f | 43 | 34% | 45 |
| wompi.Numbat 2.1 | 19 | 15% | 21 |
| axeBots.HataMoto 3.09 | 5 | 4% | 6 |
| ms.Ares 0.19 | 4 | 3% | 6 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 134 rounds): 100634 melee ticks, 21468 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (134 rounds): longest scan gap while four or more were alive 51 ticks (134 rounds over 8); rounds whose longest gap at any count was over 8: 134; robots dropped as dead without a death event: 0.

Targeting waves (134 rounds): 30580 sent, 27149 reached their opponent, 4294 virtual hits (15.8% of those reached).

## Melee bench: F06

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 127 over 4 battles (31.8 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 92.4 | 95 / 140 | 1.69 | 20.8% | 23575 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 20.8% | 95 |
| jekl.StoneGhost 0.7 | 2.3 | 14.0% | 10 |
| origin.SleepSiphon 1.7b | 2.8 | 13.2% | 18 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.8% | 11 |
| mld.Wisdom 1.0 | 5.0 | 10.4% | 1 |
| gg.Wolverine 2.0 | 6.3 | 8.3% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 7.1% | 2 |
| spinnercat.Omen 1.0 | 8.3 | 5.9% | 1 |
| DBall.NUKE 0.1 | 8.8 | 5.8% | 0 |
| sample.Fire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 94.0 | 26 / 35 | 5905 |
| 2 | 1 | 70.1 | 88.6 | 19 / 35 | 5817 |
| 3 | 1 | 72.0 | 94.3 | 25 / 35 | 5923 |
| 4 | 1 | 71.5 | 92.7 | 25 / 35 | 5930 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 38 | 97% |
| origin.SleepSiphon 1.7b | 37 | 73% |
| pe.minimelee.SandboxMiniMelee 1.1 | 20 | 75% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 100% |
| gg.Wolverine 2.0 | 4 | 75% |
| mld.Wisdom 1.0 | 4 | 100% |
| DBall.NUKE 0.1 | 2 | 100% |

Hadur died in 45 of 140 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 16 | 36% | 48 |
| jekl.StoneGhost 0.7 | 11 | 24% | 37 |
| pe.minimelee.SandboxMiniMelee 1.1 | 8 | 18% | 22 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 7% | 13 |
| mld.Wisdom 1.0 | 3 | 7% | 11 |
| gg.Wolverine 2.0 | 3 | 7% | 7 |
| spinnercat.Omen 1.0 | 1 | 2% | 1 |
| DBall.NUKE 0.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 135 rounds): 101183 melee ticks, 29578 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (135 rounds): longest scan gap while four or more were alive 33 ticks (135 rounds over 8); rounds whose longest gap at any count was over 8: 135; robots dropped as dead without a death event: 2.

Targeting waves (135 rounds): 30430 sent, 27232 reached their opponent, 5577 virtual hits (20.5% of those reached).

## Melee bench: F07

hadur117.Hadur 3.22aa against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 83 over 4 battles (20.8 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 75.5 | 95.6 | 101 / 140 | 1.35 | 26.0% | 31907 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 26.0% | 101 |
| rtk.Tachikoma 1.0 | 2.0 | 19.1% | 21 |
| oog.melee.CapuletDroid 1.1 | 3.0 | 13.0% | 7 |
| franzor.Lizt 1.3.1 | 4.0 | 12.5% | 11 |
| lrem.micro.MoggFanatic 0.2 | 5.3 | 9.6% | 0 |
| exauge.GateKeeper 1.1.121g | 5.8 | 8.6% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 6.3% | 0 |
| drd.Dreadknoght 0.9 | 8.3 | 2.5% | 0 |
| sample.Target 1.0 | 8.8 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 75.5 | 96.8 | 27 / 35 | 7843 |
| 2 | 1 | 75.2 | 94.3 | 23 / 35 | 7984 |
| 3 | 1 | 75.2 | 95.0 | 25 / 35 | 7879 |
| 4 | 1 | 75.9 | 96.4 | 26 / 35 | 8201 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 85 | 80% |
| oog.melee.CapuletDroid 1.1 | 23 | 83% |
| franzor.Lizt 1.3.1 | 22 | 59% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 39 of 140 rounds, at a mean tick of 1634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 23 | 59% | 94 |
| franzor.Lizt 1.3.1 | 10 | 26% | 0 |
| oog.melee.CapuletDroid 1.1 | 5 | 13% | 36 |
| lrem.micro.MoggFanatic 0.2 | 1 | 3% | 2 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 6 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

Posture (Hadur's M records, 132 rounds): 125330 melee ticks, 61191 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 24 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 34236 sent, 31461 reached their opponent, 6456 virtual hits (20.5% of those reached).

## Melee bench: F08

hadur117.Hadur 3.22aa against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 196 over 4 battles (49.0 per battle, most in one battle 54). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 93.5 | 98 / 140 | 1.52 | 23.1% | 21828 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 23.1% | 98 |
| tm.Yuugao 1.0 | 2.5 | 14.7% | 14 |
| shrub.Vapour v159 | 2.5 | 14.8% | 20 |
| com.spp.robocode.MostlyHarmless 010 | 4.0 | 10.8% | 5 |
| m3thos.Eva00 1.1 | 5.3 | 9.0% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 5.8 | 8.9% | 2 |
| SHAM.WOW 1.4 | 7.8 | 6.4% | 0 |
| qualidafial.MajorDick 1.0.1 | 7.8 | 6.6% | 1 |
| zyx.nano.BacillusComma 1.0 | 8.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 96.4 | 28 / 35 | 5763 |
| 2 | 1 | 70.4 | 92.5 | 24 / 35 | 5028 |
| 3 | 1 | 72.2 | 93.9 | 25 / 35 | 5873 |
| 4 | 1 | 70.3 | 91.1 | 21 / 35 | 5164 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 45 | 69% |
| tm.Yuugao 1.0 | 39 | 77% |
| com.spp.robocode.MostlyHarmless 010 | 20 | 95% |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 86% |
| m3thos.Eva00 1.1 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 42 of 140 rounds, at a mean tick of 987. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 17 | 40% | 44 |
| tm.Yuugao 1.0 | 13 | 31% | 45 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 12% | 15 |
| com.spp.robocode.MostlyHarmless 010 | 4 | 10% | 21 |
| SHAM.WOW 1.4 | 1 | 2% | 3 |
| zyx.nano.BacillusComma 1.0 | 1 | 2% | 2 |
| qualidafial.MajorDick 1.0.1 | 1 | 2% | 2 |
| m3thos.Eva00 1.1 | 0 | 0% | 7 |

Posture (Hadur's M records, 134 rounds): 99881 melee ticks, 34635 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 113 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (134 rounds): longest scan gap while four or more were alive 113 ticks (134 rounds over 8); rounds whose longest gap at any count was over 8: 134; robots dropped as dead without a death event: 1.

Targeting waves (134 rounds): 29468 sent, 26549 reached their opponent, 4713 virtual hits (17.8% of those reached).

## Melee bench: F09

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 125 over 4 battles (31.3 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 78.3 | 49 / 140 | 2.95 | 16.2% | 15788 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.8 | 16.2% | 49 |
| positive.Portia 1.26e | 1.8 | 15.4% | 45 |
| kc.micro.Figment 1.0 | 2.5 | 14.3% | 24 |
| yagami.Tidus 0.11 | 4.0 | 11.5% | 1 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.7% | 11 |
| mc2.enemy.Original 0.9 | 6.0 | 9.4% | 8 |
| dft.Calliope 5.6 | 7.0 | 7.5% | 1 |
| step.nanoPri 1.0 | 8.3 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 4.9% | 1 |
| rdm.Dueler 0.4x | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 78.4 | 14 / 35 | 4009 |
| 2 | 1 | 67.2 | 84.8 | 16 / 35 | 4241 |
| 3 | 2 | 63.3 | 73.3 | 9 / 35 | 3735 |
| 4 | 2 | 63.9 | 76.8 | 10 / 35 | 3803 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 27 | 89% |
| positive.Portia 1.26e | 22 | 41% |
| yagami.Tidus 0.11 | 9 | 100% |
| pedersen.Grishnakh 1.0 | 7 | 57% |
| mc2.enemy.Original 0.9 | 5 | 20% |
| dft.Calliope 5.6 | 2 | 100% |

Hadur died in 91 of 140 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 30 | 33% | 42 |
| kc.micro.Figment 1.0 | 18 | 20% | 41 |
| mc2.enemy.Original 0.9 | 15 | 16% | 18 |
| yagami.Tidus 0.11 | 11 | 12% | 18 |
| pedersen.Grishnakh 1.0 | 8 | 9% | 10 |
| dft.Calliope 5.6 | 3 | 3% | 5 |
| step.nanoPri 1.0 | 3 | 3% | 3 |
| robar.nano.Assertive_Melee 0.2 | 2 | 2% | 2 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |

Posture (Hadur's M records, 135 rounds): 97033 melee ticks, 21994 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (135 rounds): longest scan gap while four or more were alive 39 ticks (135 rounds over 8); rounds whose longest gap at any count was over 8: 135; robots dropped as dead without a death event: 0.

Targeting waves (135 rounds): 31682 sent, 28554 reached their opponent, 3982 virtual hits (13.9% of those reached).

## Melee bench: F10

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 164 over 4 battles (41.0 per battle, most in one battle 46). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 96.0 | 113 / 140 | 1.36 | 21.2% | 24123 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 21.2% | 113 |
| DTF.Kludgy 1.2b | 2.0 | 14.1% | 12 |
| ejb.Polaris 1.0.1 | 3.0 | 13.4% | 11 |
| ne.Chimera 1.2 | 4.0 | 12.1% | 2 |
| vStar.RAFzilla 2.15 | 5.3 | 10.0% | 0 |
| tvv.micro.Antares 1.1.1 | 5.8 | 9.6% | 1 |
| kurios.DOSexe .9b | 7.3 | 6.1% | 1 |
| sam.Samspin 1.0 | 8.5 | 5.0% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 4.7% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 94.6 | 26 / 35 | 5901 |
| 2 | 1 | 71.9 | 96.5 | 28 / 35 | 6065 |
| 3 | 1 | 72.1 | 95.9 | 30 / 35 | 6051 |
| 4 | 1 | 72.3 | 96.8 | 29 / 35 | 6106 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 41 | 78% |
| ejb.Polaris 1.0.1 | 38 | 95% |
| ne.Chimera 1.2 | 17 | 88% |
| tvv.micro.Antares 1.1.1 | 13 | 100% |
| vStar.RAFzilla 2.15 | 13 | 100% |
| sam.Samspin 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 100% |
| donjezza.Muncho 1.0 | 1 | 100% |

Hadur died in 27 of 140 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 13 | 48% | 45 |
| ejb.Polaris 1.0.1 | 5 | 19% | 34 |
| ne.Chimera 1.2 | 5 | 19% | 26 |
| vStar.RAFzilla 2.15 | 3 | 11% | 15 |
| tvv.micro.Antares 1.1.1 | 1 | 4% | 14 |
| sam.Samspin 1.0 | 0 | 0% | 2 |
| donjezza.Muncho 1.0 | 0 | 0% | 2 |
| kurios.DOSexe .9b | 0 | 0% | 2 |

Posture (Hadur's M records, 132 rounds): 92624 melee ticks, 37052 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 66 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 29707 sent, 26512 reached their opponent, 4667 virtual hits (17.6% of those reached).

## Melee bench: F11

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 159 over 4 battles (39.8 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 82.7 | 61 / 140 | 2.56 | 17.2% | 16679 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.3 | 17.2% | 61 |
| rz.Aleph 0.34 | 1.8 | 15.8% | 35 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.8% | 18 |
| djc.DynaBot 0.1.1 | 4.3 | 10.5% | 8 |
| br2.MobyDickBot 1.6 | 5.0 | 9.6% | 8 |
| rdt199.Warlord 0.73 | 6.3 | 8.5% | 7 |
| uji.YellohFellah 1.0 | 7.3 | 8.0% | 4 |
| KiraNL.Chupacabra 0.4 | 7.3 | 7.7% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.6% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 86.3 | 14 / 35 | 4439 |
| 2 | 2 | 63.3 | 75.6 | 12 / 35 | 3772 |
| 3 | 1 | 66.7 | 85.1 | 16 / 35 | 4155 |
| 4 | 1 | 67.2 | 83.8 | 19 / 35 | 4313 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 33 | 67% |
| djc.DynaBot 0.1.1 | 13 | 77% |
| cx.mini.Nimrod 0.55 | 12 | 58% |
| br2.MobyDickBot 1.6 | 10 | 60% |
| rdt199.Warlord 0.73 | 9 | 89% |
| uji.YellohFellah 1.0 | 8 | 88% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 79 of 140 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 26 | 33% | 50 |
| cx.mini.Nimrod 0.55 | 16 | 20% | 24 |
| br2.MobyDickBot 1.6 | 9 | 11% | 13 |
| djc.DynaBot 0.1.1 | 8 | 10% | 16 |
| rdt199.Warlord 0.73 | 8 | 10% | 16 |
| uji.YellohFellah 1.0 | 5 | 6% | 12 |
| stelo.MirrorNano 1.3 | 4 | 5% | 4 |
| KiraNL.Chupacabra 0.4 | 3 | 4% | 4 |

Posture (Hadur's M records, 134 rounds): 100942 melee ticks, 26042 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 128 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (134 rounds): longest scan gap while four or more were alive 128 ticks (134 rounds over 8); rounds whose longest gap at any count was over 8: 134; robots dropped as dead without a death event: 0.

Targeting waves (134 rounds): 32443 sent, 29121 reached their opponent, 3838 virtual hits (13.2% of those reached).

## Melee bench: F12

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 113 over 4 battles (28.3 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.2 | 77 / 140 | 2.24 | 18.1% | 16696 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 18.1% | 77 |
| bts.wiki.RipCurl 0.9b | 2.0 | 14.3% | 22 |
| nat.PallasHawk 1.0 | 3.5 | 12.3% | 20 |
| darkcanuck.Leon 1.01 | 3.5 | 12.5% | 15 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.6% | 5 |
| jrm.Test0 1.0 | 6.5 | 7.5% | 0 |
| cs.sheldor.Talon 1.1 | 6.5 | 7.4% | 1 |
| jp.Perpy 16.0 | 8.5 | 6.4% | 0 |
| stuff.Vlad 0.1 | 8.8 | 5.7% | 0 |
| jaybot.bots.Oddball 4.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 91.1 | 23 / 35 | 4406 |
| 2 | 1 | 65.5 | 81.3 | 17 / 35 | 3748 |
| 3 | 1 | 68.7 | 89.8 | 20 / 35 | 4295 |
| 4 | 1 | 66.4 | 82.5 | 17 / 35 | 4247 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 33 | 79% |
| nat.PallasHawk 1.0 | 31 | 68% |
| darkcanuck.Leon 1.01 | 28 | 82% |
| brainfade.melee.Genghis 0.36 | 5 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| jrm.Test0 1.0 | 1 | 100% |

Hadur died in 63 of 140 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 18 | 29% | 32 |
| nat.PallasHawk 1.0 | 12 | 19% | 32 |
| darkcanuck.Leon 1.01 | 10 | 16% | 35 |
| brainfade.melee.Genghis 0.36 | 9 | 14% | 17 |
| jrm.Test0 1.0 | 4 | 6% | 9 |
| cs.sheldor.Talon 1.1 | 4 | 6% | 6 |
| jp.Perpy 16.0 | 3 | 5% | 3 |
| stuff.Vlad 0.1 | 2 | 3% | 2 |
| jaybot.bots.Oddball 4.0 | 1 | 2% | 2 |

Posture (Hadur's M records, 132 rounds): 83589 melee ticks, 24264 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 34 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 28017 sent, 24621 reached their opponent, 3941 virtual hits (16.0% of those reached).

## Melee bench: F13

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 107 over 4 battles (26.8 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 82.1 | 40 / 140 | 2.61 | 16.4% | 17685 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.8 | 16.4% | 40 |
| mn.Combat 3.25.0 | 1.8 | 16.2% | 53 |
| ags.Glacier 0.2.11 | 2.5 | 15.8% | 28 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.9% | 3 |
| shinh.Entangled 0.3 | 4.5 | 12.2% | 16 |
| apc.Colossus2 0.17 | 6.3 | 7.6% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.0% | 0 |
| maribo.FollowFire 1 | 8.3 | 5.1% | 0 |
| ayk.WallHugger 1.0 | 8.8 | 5.0% | 0 |
| sample.Tracker 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 88.3 | 12 / 35 | 4384 |
| 2 | 2 | 65.7 | 81.3 | 9 / 35 | 4568 |
| 3 | 3 | 64.7 | 76.2 | 9 / 35 | 4358 |
| 4 | 1 | 65.7 | 82.5 | 10 / 35 | 4375 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 35 | 26% |
| ags.Glacier 0.2.11 | 34 | 62% |
| shinh.Entangled 0.3 | 14 | 43% |
| stelo.Wang 1.0 | 3 | 100% |
| gh.micro.Gruweltje 0.7 | 2 | 50% |

Hadur died in 100 of 140 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 37 | 37% | 48 |
| ags.Glacier 0.2.11 | 29 | 29% | 46 |
| shinh.Entangled 0.3 | 15 | 15% | 20 |
| gh.micro.Gruweltje 0.7 | 11 | 11% | 11 |
| maribo.FollowFire 1 | 5 | 5% | 7 |
| stelo.Wang 1.0 | 3 | 3% | 6 |
| apc.Colossus2 0.17 | 0 | 0% | 2 |

Posture (Hadur's M records, 134 rounds): 93990 melee ticks, 29439 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 90 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (134 rounds): longest scan gap while four or more were alive 84 ticks (134 rounds over 8); rounds whose longest gap at any count was over 8: 134; robots dropped as dead without a death event: 0.

Targeting waves (134 rounds): 27395 sent, 23939 reached their opponent, 3719 virtual hits (15.5% of those reached).

## Melee bench: F14

hadur117.Hadur 3.22aa against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 149 over 4 battles (37.3 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 95.3 | 122 / 140 | 1.38 | 24.0% | 24823 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 24.0% | 122 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.6% | 12 |
| Lo_Ian.Gandalf_V4 4.0 | 4.3 | 10.3% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 4.8 | 10.4% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.0 | 10.5% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 5.3 | 9.8% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.5% | 1 |
| pa.Improved 1.0 | 7.8 | 7.4% | 0 |
| sample.TrackFire 1.0 | 9.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 93.2 | 28 / 35 | 6010 |
| 2 | 1 | 72.7 | 97.9 | 31 / 35 | 5859 |
| 3 | 1 | 72.4 | 91.4 | 30 / 35 | 6391 |
| 4 | 1 | 74.1 | 98.6 | 33 / 35 | 6563 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 77 | 94% |
| sanyi.mikrobi.Roberto 1.0 | 19 | 95% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 85% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 18 of 140 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 11 | 61% | 70 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 17% | 18 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 11% | 8 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 6% | 24 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 6% | 5 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 8 |
| pa.Improved 1.0 | 0 | 0% | 4 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 132 rounds): 81477 melee ticks, 31375 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 42 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 23914 sent, 21181 reached their opponent, 5125 virtual hits (24.2% of those reached).

## Melee bench: F15

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 168 over 4 battles (42.0 per battle, most in one battle 50). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.8 | 78 / 140 | 2.19 | 19.0% | 21120 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 19.0% | 78 |
| mld.DustBunny 3.8 | 2.8 | 13.2% | 6 |
| emp.Yngwie 1.11 | 3.0 | 13.3% | 32 |
| kawigi.micro.Shiz 1.1 | 3.3 | 12.9% | 12 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.5% | 4 |
| kawigi.robot.Girl 1.2 | 5.5 | 9.5% | 8 |
| lambdaxy.TBot 0.1 | 7.3 | 6.9% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.6% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.0 | 5.0% | 0 |
| divineomega.TrialBot 0.003 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 84.4 | 17 / 35 | 5133 |
| 2 | 1 | 70.9 | 90.5 | 22 / 35 | 5871 |
| 3 | 1 | 67.6 | 85.4 | 16 / 35 | 4922 |
| 4 | 1 | 69.0 | 87.0 | 23 / 35 | 5194 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 40 | 55% |
| mld.DustBunny 3.8 | 21 | 95% |
| kawigi.micro.Shiz 1.1 | 18 | 89% |
| kawigi.robot.Girl 1.2 | 13 | 85% |
| cb.nano.Insomnia 1.0 | 5 | 100% |
| divineomega.TrialBot 0.003 | 2 | 100% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |

Hadur died in 62 of 140 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 34 | 55% | 59 |
| kawigi.robot.Girl 1.2 | 9 | 15% | 15 |
| kawigi.micro.Shiz 1.1 | 7 | 11% | 20 |
| mld.DustBunny 3.8 | 5 | 8% | 21 |
| cb.nano.Insomnia 1.0 | 4 | 6% | 7 |
| lambdaxy.TBot 0.1 | 2 | 3% | 5 |
| divineomega.TrialBot 0.003 | 1 | 2% | 6 |
| Grystrion.TrackerWO 1.0 | 0 | 0% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 131 rounds): 100703 melee ticks, 30774 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (131 rounds): longest scan gap while four or more were alive 34 ticks (131 rounds over 8); rounds whose longest gap at any count was over 8: 131; robots dropped as dead without a death event: 0.

Targeting waves (131 rounds): 32589 sent, 29375 reached their opponent, 4484 virtual hits (15.3% of those reached).

## Melee bench: F16

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 130 over 4 battles (32.5 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 89.6 | 83 / 140 | 1.94 | 20.2% | 24212 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 20.2% | 83 |
| gh.Griezel 0.5.2 | 2.0 | 16.4% | 32 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.1% | 3 |
| techdude.forest.FlamingForest 1.1 | 4.8 | 10.6% | 18 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.3% | 3 |
| tvv.nano.Polaris 1.2 | 5.5 | 8.4% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.3% | 0 |
| repositorio.NanoStep 1.0 | 8.5 | 5.3% | 0 |
| asd.Cthulhu 1.3 | 9.0 | 4.7% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 85.1 | 18 / 35 | 5757 |
| 2 | 1 | 71.4 | 91.1 | 21 / 35 | 6032 |
| 3 | 1 | 70.2 | 88.6 | 19 / 35 | 5928 |
| 4 | 1 | 72.3 | 93.7 | 25 / 35 | 6495 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 65 | 75% |
| techdude.forest.FlamingForest 1.1 | 18 | 72% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 15 | 93% |
| bvh.fnr.Fenrir 0.36l | 6 | 67% |
| stelo.IntrinsicVolatility 1.4 | 1 | 100% |
| divineomega.DivineBot 1.9.4.5 | 1 | 100% |
| tvv.nano.Polaris 1.2 | 1 | 100% |

Hadur died in 59 of 140 rounds, at a mean tick of 1094. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 22 | 37% | 75 |
| bvh.fnr.Fenrir 0.36l | 13 | 22% | 15 |
| techdude.forest.FlamingForest 1.1 | 11 | 19% | 25 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 11 | 19% | 16 |
| stelo.IntrinsicVolatility 1.4 | 1 | 2% | 5 |
| divineomega.DivineBot 1.9.4.5 | 0 | 0% | 2 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |
| tvv.nano.Polaris 1.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 134 rounds): 112765 melee ticks, 41849 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (134 rounds): longest scan gap while four or more were alive 51 ticks (134 rounds over 8); rounds whose longest gap at any count was over 8: 134; robots dropped as dead without a death event: 0.

Targeting waves (134 rounds): 35993 sent, 32771 reached their opponent, 5308 virtual hits (16.2% of those reached).

## Melee bench: F17

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 154 over 4 battles (38.5 per battle, most in one battle 46). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 87.8 | 80 / 140 | 2.10 | 20.1% | 24644 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 20.1% | 80 |
| et.Predator 1.8 | 3.0 | 13.3% | 11 |
| oog.melee.Mercutio 1.0 | 3.0 | 13.2% | 21 |
| cx.BlestPain 1.41 | 3.3 | 12.1% | 24 |
| ahf.NanoAndrew .4 | 5.3 | 10.0% | 1 |
| maribo.melee.BMV 0.1 | 6.3 | 9.3% | 1 |
| nic.Nicator 2.4 | 6.3 | 9.1% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.0 | 5.9% | 0 |
| tex.Longbot 0.4 | 9.0 | 4.8% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 91.1 | 19 / 35 | 6274 |
| 2 | 1 | 69.5 | 83.8 | 18 / 35 | 6095 |
| 3 | 1 | 70.4 | 87.0 | 21 / 35 | 6059 |
| 4 | 1 | 71.1 | 89.2 | 22 / 35 | 6216 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 41 | 73% |
| et.Predator 1.8 | 35 | 86% |
| cx.BlestPain 1.41 | 22 | 50% |
| ahf.NanoAndrew .4 | 5 | 80% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| nic.Nicator 2.4 | 2 | 50% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 60 of 140 rounds, at a mean tick of 1090. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 16 | 27% | 46 |
| cx.BlestPain 1.41 | 16 | 27% | 31 |
| et.Predator 1.8 | 15 | 25% | 41 |
| ahf.NanoAndrew .4 | 5 | 8% | 9 |
| maribo.melee.BMV 0.1 | 5 | 8% | 7 |
| nic.Nicator 2.4 | 3 | 5% | 5 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 133 rounds): 104853 melee ticks, 43105 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 42 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 34130 sent, 31028 reached their opponent, 6388 virtual hits (20.6% of those reached).

## Melee bench: F18

hadur117.Hadur 3.22aa against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 218 over 4 battles (54.5 per battle, most in one battle 59). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.6 | 102 / 140 | 1.67 | 22.4% | 19992 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 22.4% | 102 |
| agd.Mooserwirt2 2.7 | 2.3 | 13.2% | 15 |
| uji.DBH 1.1 | 2.8 | 12.7% | 9 |
| spinnercat.Robovirus 2.718 | 4.0 | 10.8% | 3 |
| sigterm.Sigterm 1.0 | 5.5 | 10.1% | 2 |
| ratosh.Nobo 0.21 | 6.0 | 10.1% | 2 |
| kawigi.mini.Fhqwhgads 1.1 | 6.8 | 9.0% | 3 |
| stelo.WangRobot 1.0 | 8.0 | 6.3% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.8 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 93.2 | 28 / 35 | 4969 |
| 2 | 1 | 69.4 | 86.8 | 24 / 35 | 4890 |
| 3 | 1 | 70.5 | 93.9 | 25 / 35 | 4847 |
| 4 | 1 | 71.0 | 92.5 | 25 / 35 | 5286 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| uji.DBH 1.1 | 38 | 82% |
| sigterm.Sigterm 1.0 | 25 | 92% |
| agd.Mooserwirt2 2.7 | 24 | 83% |
| spinnercat.Robovirus 2.718 | 10 | 70% |
| ratosh.Nobo 0.21 | 9 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 86% |
| stelo.WangRobot 1.0 | 6 | 83% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 50% |

Hadur died in 38 of 140 rounds, at a mean tick of 805. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.DBH 1.1 | 9 | 24% | 29 |
| agd.Mooserwirt2 2.7 | 8 | 21% | 30 |
| sigterm.Sigterm 1.0 | 5 | 13% | 25 |
| spinnercat.Robovirus 2.718 | 5 | 13% | 16 |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 13% | 14 |
| ratosh.Nobo 0.21 | 4 | 11% | 15 |
| stelo.WangRobot 1.0 | 1 | 3% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 3% | 4 |

Posture (Hadur's M records, 132 rounds): 83438 melee ticks, 28909 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 660 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 393 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 25820 sent, 22913 reached their opponent, 4877 virtual hits (21.3% of those reached).

## Melee bench: F19

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 122 over 4 battles (30.5 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.5 | 99.0 | 136 / 140 | 1.09 | 23.4% | 27410 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 23.4% | 136 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.4% | 1 |
| mld.Infinity 2.2 | 3.5 | 11.8% | 3 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.5% | 0 |
| erdnis.Rover 0.3 | 4.5 | 10.4% | 0 |
| patson.PatsonTestBot 1.0 | 6.8 | 8.0% | 0 |
| mbh.Mbh 0.1 | 7.0 | 7.4% | 0 |
| pac.ABC 2.1 | 7.5 | 6.8% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.4% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.3 | 98.4 | 33 / 35 | 6815 |
| 2 | 1 | 74.6 | 100.0 | 35 / 35 | 6930 |
| 3 | 1 | 74.6 | 100.0 | 35 / 35 | 6834 |
| 4 | 1 | 74.3 | 97.8 | 33 / 35 | 6831 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 72 | 100% |
| krillr.mini.JointStrike 2.0.0 | 20 | 100% |
| mld.Infinity 2.2 | 18 | 100% |
| erdnis.Rover 0.3 | 14 | 100% |
| pac.ABC 2.1 | 9 | 100% |
| patson.PatsonTestBot 1.0 | 2 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 4 of 140 rounds, at a mean tick of 605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1 | 25% | 47 |
| erdnis.Rover 0.3 | 1 | 25% | 20 |
| mld.Infinity 2.2 | 1 | 25% | 16 |
| pbg.R2D2 1.0 | 1 | 25% | 2 |
| krillr.mini.JointStrike 2.0.0 | 0 | 0% | 26 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 10 |
| pac.ABC 2.1 | 0 | 0% | 10 |
| mbh.Mbh 0.1 | 0 | 0% | 4 |

Posture (Hadur's M records, 132 rounds): 80729 melee ticks, 32608 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 50 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 26894 sent, 23760 reached their opponent, 5329 virtual hits (22.4% of those reached).

## Melee bench: F20

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 119 over 4 battles (29.8 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 93.1 | 98 / 140 | 1.62 | 21.7% | 26222 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 21.7% | 98 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.4% | 22 |
| fwb.Nine 1.0.1 | 3.5 | 11.0% | 5 |
| catcat20.Rabbit 0.001 | 3.5 | 11.7% | 13 |
| nz.jdc.nano.GridFu 1.0 | 5.0 | 10.2% | 2 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.4% | 0 |
| bayen.nut.Squirrel 1.615 | 7.5 | 6.1% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.0 | 5.8% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.5 | 5.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 94.9 | 27 / 35 | 6635 |
| 2 | 1 | 72.5 | 93.7 | 26 / 35 | 6577 |
| 3 | 1 | 72.0 | 91.1 | 24 / 35 | 6548 |
| 4 | 1 | 71.8 | 92.7 | 21 / 35 | 6462 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 69 | 77% |
| catcat20.Rabbit 0.001 | 26 | 65% |
| fwb.Nine 1.0.1 | 19 | 95% |
| m3thos.mini.Eva01 0.5.5 | 5 | 100% |
| nz.jdc.nano.GridFu 1.0 | 3 | 100% |
| bayen.nut.Squirrel 1.615 | 2 | 100% |

Hadur died in 43 of 140 rounds, at a mean tick of 1047. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 24 | 56% | 64 |
| catcat20.Rabbit 0.001 | 8 | 19% | 34 |
| fwb.Nine 1.0.1 | 6 | 14% | 13 |
| nz.jdc.nano.GridFu 1.0 | 3 | 7% | 13 |
| bayen.nut.Squirrel 1.615 | 1 | 2% | 9 |
| m3thos.mini.Eva01 0.5.5 | 1 | 2% | 6 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |

Posture (Hadur's M records, 132 rounds): 106474 melee ticks, 39232 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 41 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 32428 sent, 29213 reached their opponent, 6072 virtual hits (20.8% of those reached).

## Melee bench: F21

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 94 over 4 battles (23.5 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 92.9 | 92 / 140 | 1.64 | 20.9% | 24585 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 20.9% | 92 |
| eem.EvBot v4.6.16 | 2.0 | 15.5% | 35 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.5% | 5 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.4% | 6 |
| eld.Hmm 1.0 | 5.3 | 8.1% | 3 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.9% | 0 |
| fire219.CatBot 1.0 | 7.3 | 6.9% | 0 |
| el.JumpShoot 0.2 | 8.0 | 5.6% | 0 |
| PSW.Relentless 0.1 | 9.0 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 89.5 | 22 / 35 | 6329 |
| 2 | 1 | 71.6 | 95.2 | 24 / 35 | 5848 |
| 3 | 1 | 72.8 | 95.2 | 26 / 35 | 6499 |
| 4 | 1 | 70.8 | 91.4 | 20 / 35 | 5909 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 73 | 67% |
| dummy.mini.Scimitar 1.01 | 26 | 92% |
| cf.RiO.RiOx 4.2.1 | 16 | 88% |
| eld.Hmm 1.0 | 6 | 50% |
| el.JumpShoot 0.2 | 1 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 49 of 140 rounds, at a mean tick of 1258. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 25 | 51% | 62 |
| dummy.mini.Scimitar 1.01 | 10 | 20% | 42 |
| cf.RiO.RiOx 4.2.1 | 7 | 14% | 18 |
| eld.Hmm 1.0 | 4 | 8% | 12 |
| oa.weak.BotherBot 0.1 | 1 | 2% | 3 |
| PSW.Relentless 0.1 | 1 | 2% | 1 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 133 rounds): 113259 melee ticks, 49590 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 42 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 1.

Targeting waves (133 rounds): 32342 sent, 29178 reached their opponent, 4772 virtual hits (16.4% of those reached).

## Melee bench: F22

hadur117.Hadur 3.22aa against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 106 over 4 battles (26.5 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.4 | 64 / 140 | 2.01 | 20.0% | 17941 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 20.0% | 64 |
| pe.SandboxDT 2.71m | 2.0 | 17.9% | 42 |
| kvk.HebusLeTroll 0.35 | 3.0 | 15.2% | 17 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.3% | 13 |
| bigpete.Stewie 1.0 | 5.0 | 10.2% | 3 |
| gg.Squaraus 0.6 | 7.0 | 6.3% | 0 |
| tad.Dalek98 0.98 | 7.0 | 6.3% | 0 |
| yk.JahRoslav 1.1 | 7.0 | 6.6% | 1 |
| pbg.NinjaX 1.2 | 9.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 85.4 | 15 / 35 | 4549 |
| 2 | 1 | 68.0 | 86.8 | 17 / 35 | 4577 |
| 3 | 1 | 68.7 | 88.9 | 14 / 35 | 4568 |
| 4 | 1 | 68.5 | 88.6 | 18 / 35 | 4247 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 43 | 44% |
| jlm.javaDisturbance 0.59 | 30 | 67% |
| kvk.HebusLeTroll 0.35 | 28 | 75% |
| bigpete.Stewie 1.0 | 4 | 50% |
| tad.Dalek98 0.98 | 2 | 100% |
| yk.JahRoslav 1.1 | 1 | 0% |

Hadur died in 77 of 140 rounds, at a mean tick of 1012. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 34 | 44% | 52 |
| jlm.javaDisturbance 0.59 | 18 | 23% | 42 |
| kvk.HebusLeTroll 0.35 | 17 | 22% | 27 |
| bigpete.Stewie 1.0 | 3 | 4% | 8 |
| gg.Squaraus 0.6 | 1 | 1% | 5 |
| tad.Dalek98 0.98 | 1 | 1% | 3 |
| yk.JahRoslav 1.1 | 1 | 1% | 2 |
| pbg.NinjaX 1.2 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 132 rounds): 101540 melee ticks, 33004 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 30 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 1.

Targeting waves (132 rounds): 29245 sent, 26448 reached their opponent, 3436 virtual hits (13.0% of those reached).

## Melee bench: F23

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 120 over 4 battles (30.0 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.9 | 96.7 | 120 / 140 | 1.29 | 22.7% | 27370 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 22.7% | 120 |
| pe.SandboxLump 1.52 | 2.3 | 15.7% | 14 |
| cre.Karolos 0.32 | 2.8 | 13.7% | 5 |
| stelo.RamTrackSurfer 1.2 | 4.8 | 9.0% | 1 |
| stelo.AreaTargetingBot 1.1 | 5.0 | 9.6% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 8.8% | 0 |
| cw.megas.Blade 0.8 | 6.8 | 8.3% | 0 |
| sample.Walls 1.0 | 7.8 | 7.1% | 0 |
| rrh.Iwillfindyou 2.0 | 9.0 | 2.6% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 95.6 | 29 / 35 | 6855 |
| 2 | 1 | 74.1 | 97.8 | 31 / 35 | 6903 |
| 3 | 1 | 73.7 | 95.2 | 29 / 35 | 6789 |
| 4 | 1 | 74.1 | 98.4 | 31 / 35 | 6823 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 65 | 91% |
| cre.Karolos 0.32 | 45 | 96% |
| stelo.RamTrackSurfer 1.2 | 7 | 86% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| stelo.AreaTargetingBot 1.1 | 3 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 20 of 140 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 12 | 60% | 62 |
| cre.Karolos 0.32 | 4 | 20% | 36 |
| stelo.AreaTargetingBot 1.1 | 2 | 10% | 10 |
| stelo.RamTrackSurfer 1.2 | 1 | 5% | 16 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 5% | 9 |
| sample.Walls 1.0 | 0 | 0% | 5 |
| cw.megas.Blade 0.8 | 0 | 0% | 1 |
| cli.WasteOfAmmo 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 132 rounds): 80415 melee ticks, 34138 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 39 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 24493 sent, 21228 reached their opponent, 5984 virtual hits (28.2% of those reached).

## Melee bench: F24

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 118 over 4 battles (29.5 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 84.6 | 58 / 140 | 2.39 | 17.8% | 18432 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 17.8% | 58 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.5% | 33 |
| pedersen.Ugluk 1.1.1 | 3.8 | 12.2% | 10 |
| davidalves.Phoenix 0.54 | 4.0 | 12.4% | 16 |
| florent.XSeries.X2 0.12 | 4.0 | 12.5% | 21 |
| oog.melee.Corsair 1.0 | 6.3 | 9.0% | 1 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.0% | 0 |
| stelo.SoJNanoMelee 1.1 | 7.8 | 6.4% | 2 |
| evd.X1 0.01 | 9.0 | 4.6% | 0 |
| as.FrankTheTank 1.3 | 9.3 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 86.3 | 14 / 35 | 4448 |
| 2 | 1 | 67.7 | 84.1 | 16 / 35 | 4744 |
| 3 | 1 | 66.8 | 83.5 | 12 / 35 | 4669 |
| 4 | 1 | 67.6 | 84.4 | 16 / 35 | 4571 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 27 | 37% |
| davidalves.Phoenix 0.54 | 21 | 62% |
| florent.XSeries.X2 0.12 | 19 | 68% |
| pedersen.Ugluk 1.1.1 | 16 | 75% |
| oog.melee.Corsair 1.0 | 4 | 75% |
| stelo.SoJNanoMelee 1.1 | 4 | 75% |
| lunchie.Lunchbox 0.93 | 3 | 100% |

Hadur died in 82 of 140 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 28 | 34% | 44 |
| florent.XSeries.X2 0.12 | 19 | 23% | 27 |
| davidalves.Phoenix 0.54 | 15 | 18% | 27 |
| pedersen.Ugluk 1.1.1 | 12 | 15% | 20 |
| oog.melee.Corsair 1.0 | 5 | 6% | 11 |
| stelo.SoJNanoMelee 1.1 | 3 | 4% | 5 |
| as.FrankTheTank 1.3 | 0 | 0% | 2 |
| lunchie.Lunchbox 0.93 | 0 | 0% | 2 |
| evd.X1 0.01 | 0 | 0% | 1 |

Posture (Hadur's M records, 132 rounds): 90946 melee ticks, 26147 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 81 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 1.

Targeting waves (132 rounds): 29348 sent, 26010 reached their opponent, 4583 virtual hits (17.6% of those reached).

## Melee bench: F25

hadur117.Hadur 3.22aa against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 122 over 4 battles (30.5 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 87.9 | 94 / 140 | 1.96 | 20.7% | 15161 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 20.7% | 94 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 14.7% | 14 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 14.3% | 9 |
| jdw.Hurricane 1.4 | 3.5 | 13.0% | 12 |
| ds.Oo 2.2 | 5.8 | 9.6% | 3 |
| adt.Ar2 1.1 | 5.8 | 8.8% | 3 |
| awesomeness.Elite 1.0 | 6.5 | 8.0% | 5 |
| gjr.Cephalosporin 0.1 | 8.0 | 6.3% | 0 |
| amk.ChumbaMini 0.2 | 9.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 85.4 | 23 / 35 | 4083 |
| 2 | 1 | 68.5 | 88.2 | 24 / 35 | 3543 |
| 3 | 1 | 67.9 | 87.5 | 21 / 35 | 3596 |
| 4 | 1 | 69.6 | 90.7 | 26 / 35 | 3939 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 35 | 86% |
| voidious.micro.BlitzBat 1.05 | 28 | 89% |
| jdw.Hurricane 1.4 | 22 | 91% |
| ds.Oo 2.2 | 7 | 86% |
| awesomeness.Elite 1.0 | 5 | 100% |
| adt.Ar2 1.1 | 4 | 100% |
| gjr.Cephalosporin 0.1 | 4 | 100% |
| amk.ChumbaMini 0.2 | 1 | 0% |

Hadur died in 46 of 140 rounds, at a mean tick of 619. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 11 | 24% | 24 |
| jdw.Hurricane 1.4 | 10 | 22% | 26 |
| voidious.micro.BlitzBat 1.05 | 6 | 13% | 25 |
| ds.Oo 2.2 | 6 | 13% | 22 |
| adt.Ar2 1.1 | 6 | 13% | 13 |
| awesomeness.Elite 1.0 | 3 | 7% | 16 |
| gjr.Cephalosporin 0.1 | 2 | 4% | 8 |
| amk.ChumbaMini 0.2 | 2 | 4% | 3 |

Posture (Hadur's M records, 133 rounds): 80603 melee ticks, 16807 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 25 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 25799 sent, 22914 reached their opponent, 3569 virtual hits (15.6% of those reached).

## Melee bench: F26

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 119 over 4 battles (29.8 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 94.9 | 108 / 140 | 1.46 | 22.0% | 28099 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 22.0% | 108 |
| ak.Fermat 2.0 | 2.0 | 14.6% | 13 |
| lrem.Spectre 0.4.4 | 3.5 | 11.9% | 4 |
| shu.nitro.LENIN .T34 | 3.8 | 12.1% | 12 |
| js.PinBall 1.6 | 5.0 | 10.5% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.2% | 1 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 8.3% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.5 | 6.2% | 1 |
| sample.SpinBot 1.0 | 9.0 | 3.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 94.9 | 26 / 35 | 6973 |
| 2 | 1 | 73.3 | 94.3 | 27 / 35 | 7316 |
| 3 | 1 | 73.2 | 95.9 | 27 / 35 | 6752 |
| 4 | 1 | 73.0 | 94.6 | 28 / 35 | 7058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 56 | 80% |
| shu.nitro.LENIN .T34 | 28 | 86% |
| lrem.Spectre 0.4.4 | 24 | 92% |
| js.PinBall 1.6 | 10 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 80% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |

Hadur died in 32 of 140 rounds, at a mean tick of 1027. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 17 | 53% | 48 |
| shu.nitro.LENIN .T34 | 6 | 19% | 38 |
| lrem.Spectre 0.4.4 | 5 | 16% | 23 |
| js.PinBall 1.6 | 3 | 9% | 17 |
| jaybot.adv.bots.JayBot 2.0 | 1 | 3% | 6 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 4 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 3 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 133 rounds): 104563 melee ticks, 31397 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 24 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 32510 sent, 29211 reached their opponent, 6684 virtual hits (22.9% of those reached).

## Melee bench: F27

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 127 over 4 battles (31.8 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 87.9 | 101 / 140 | 2.09 | 20.1% | 22294 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.3 | 20.1% | 101 |
| mk.Alpha 0.2.1 | 2.0 | 14.1% | 25 |
| EH.Eagle 1.0.6 | 2.8 | 11.6% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 4.5 | 9.6% | 0 |
| wee.Gem 1.8.4 | 6.0 | 8.9% | 5 |
| throxbot.ThroxBot 0.1 | 6.3 | 8.5% | 1 |
| joe.ADinosaur 1.0 | 6.5 | 8.5% | 2 |
| sheldor.melee.nano.TestMelee 0.1 | 7.3 | 8.1% | 0 |
| caimano.Furia_Ceca 0.22 | 8.5 | 7.0% | 1 |
| cs.Grudge 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 92.7 | 28 / 35 | 5293 |
| 2 | 1 | 71.8 | 95.2 | 30 / 35 | 5673 |
| 3 | 1 | 72.9 | 98.7 | 32 / 35 | 6053 |
| 4 | 2 | 63.3 | 64.8 | 11 / 35 | 5275 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 60 | 88% |
| EH.Eagle 1.0.6 | 29 | 93% |
| throxbot.ThroxBot 0.1 | 7 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 100% |
| wee.Gem 1.8.4 | 5 | 80% |
| joe.ADinosaur 1.0 | 3 | 67% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 39 of 140 rounds, at a mean tick of 575. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 14 | 36% | 53 |
| cs.Grudge 1.0 | 8 | 21% | 10 |
| EH.Eagle 1.0.6 | 5 | 13% | 33 |
| joe.ADinosaur 1.0 | 5 | 13% | 10 |
| throxbot.ThroxBot 0.1 | 3 | 8% | 10 |
| wee.Gem 1.8.4 | 2 | 5% | 9 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 3% | 11 |
| caimano.Furia_Ceca 0.22 | 1 | 3% | 1 |
| sheldor.melee.nano.TestMelee 0.1 | 0 | 0% | 3 |

Posture (Hadur's M records, 133 rounds): 81649 melee ticks, 21701 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 57 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 26671 sent, 23424 reached their opponent, 5394 virtual hits (23.0% of those reached).

## Melee bench: F28

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 145 over 4 battles (36.3 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 88.9 | 87 / 140 | 2.00 | 18.9% | 17638 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 18.9% | 87 |
| kid.test.NightFox .2 | 2.0 | 14.6% | 21 |
| uji.Antique 1.0 | 3.3 | 12.4% | 12 |
| qohnil.blot.BlotBot 3.61 | 3.8 | 11.0% | 7 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.0% | 3 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.4% | 6 |
| amk.ChumbaWumba 0.3 | 6.8 | 7.7% | 3 |
| matt.advanced.Katana 1.0 | 8.3 | 6.3% | 0 |
| stelo.PianistNano 1.2 | 9.3 | 5.5% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 91.1 | 25 / 35 | 4883 |
| 2 | 1 | 69.2 | 92.4 | 25 / 35 | 4282 |
| 3 | 1 | 67.1 | 84.8 | 17 / 35 | 4431 |
| 4 | 1 | 67.7 | 87.3 | 20 / 35 | 4042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 42 | 74% |
| uji.Antique 1.0 | 39 | 85% |
| qohnil.blot.BlotBot 3.61 | 12 | 83% |
| ahr.ice.Ice 1.0.2 | 9 | 56% |
| amk.ChumbaWumba 0.3 | 5 | 80% |
| pfvicm.Sobieski 7.2.3b | 3 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 54 of 140 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 13 | 24% | 27 |
| uji.Antique 1.0 | 12 | 22% | 32 |
| pfvicm.Sobieski 7.2.3b | 11 | 20% | 17 |
| ahr.ice.Ice 1.0.2 | 8 | 15% | 15 |
| qohnil.blot.BlotBot 3.61 | 4 | 7% | 24 |
| amk.ChumbaWumba 0.3 | 4 | 7% | 11 |
| stelo.PianistNano 1.2 | 2 | 4% | 6 |
| matt.advanced.Katana 1.0 | 0 | 0% | 6 |

Posture (Hadur's M records, 132 rounds): 85721 melee ticks, 23867 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 27 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 27 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 1.

Targeting waves (132 rounds): 28010 sent, 24869 reached their opponent, 3340 virtual hits (13.4% of those reached).

## Melee bench: F29

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 7 other Robocode JVMs running (hadur.bench.MeleeRunner x7), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 131 over 4 battles (32.8 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 90.5 | 82 / 140 | 1.86 | 20.2% | 21243 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 20.2% | 82 |
| deewiant.Anomaly 0.2 | 2.5 | 15.2% | 27 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 14.9% | 24 |
| myl.micro.Troodon 1.10 | 4.3 | 11.1% | 2 |
| jok.PheonixM 0.1.2 | 4.8 | 10.7% | 3 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.4% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.3 | 6.1% | 0 |
| DBall.Anarchy 0.1 | 7.8 | 5.4% | 2 |
| ap.Frederick 1.1 | 9.0 | 4.4% | 0 |
| jangs.ns51 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 93.7 | 25 / 35 | 5434 |
| 2 | 1 | 71.2 | 92.1 | 23 / 35 | 5125 |
| 3 | 1 | 69.6 | 86.7 | 16 / 35 | 5151 |
| 4 | 1 | 70.8 | 89.5 | 18 / 35 | 5533 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 48 | 71% |
| zyx.mega.YersiniaPestis 3.1 | 37 | 62% |
| myl.micro.Troodon 1.10 | 11 | 91% |
| jok.PheonixM 0.1.2 | 9 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 58 of 140 rounds, at a mean tick of 1082. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 28 | 48% | 65 |
| zyx.mega.YersiniaPestis 3.1 | 22 | 38% | 45 |
| jok.PheonixM 0.1.2 | 5 | 9% | 16 |
| myl.micro.Troodon 1.10 | 1 | 2% | 10 |
| ph.melee.ArcherME 0.3 | 1 | 2% | 1 |
| DBall.Anarchy 0.1 | 1 | 2% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 132 rounds): 112405 melee ticks, 36663 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 31 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 1.

Targeting waves (132 rounds): 34872 sent, 31725 reached their opponent, 4520 virtual hits (14.2% of those reached).

## Melee bench: F30

hadur117.Hadur 3.22aa against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 97 over 4 battles (24.3 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 79.9 | 49 / 140 | 2.61 | 18.5% | 17903 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 18.5% | 49 |
| darkcanuck.B26354 1.06 | 2.5 | 15.2% | 29 |
| stelo.PastFuture 2.3.2 | 3.3 | 14.3% | 20 |
| oog.melee.Capulet 1.2 | 3.3 | 14.5% | 20 |
| intruder.PrairieWolf 2.61 | 5.0 | 9.9% | 12 |
| fowl3628800.LightningBolt 2.6.0 | 6.8 | 8.3% | 8 |
| tripphippy.Alice 1.1 | 7.0 | 8.3% | 2 |
| ntc.Opposite 1.5 | 7.3 | 8.1% | 0 |
| GarmBox.Anger 1.0 | 9.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 82.9 | 10 / 35 | 4754 |
| 2 | 1 | 66.7 | 81.8 | 14 / 35 | 4593 |
| 3 | 1 | 65.0 | 77.9 | 12 / 35 | 4289 |
| 4 | 1 | 64.9 | 77.1 | 13 / 35 | 4267 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 32 | 56% |
| oog.melee.Capulet 1.2 | 23 | 57% |
| stelo.PastFuture 2.3.2 | 15 | 53% |
| intruder.PrairieWolf 2.61 | 9 | 44% |
| fowl3628800.LightningBolt 2.6.0 | 7 | 57% |
| tripphippy.Alice 1.1 | 2 | 100% |

Hadur died in 91 of 140 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 25 | 27% | 42 |
| oog.melee.Capulet 1.2 | 19 | 21% | 31 |
| stelo.PastFuture 2.3.2 | 18 | 20% | 28 |
| intruder.PrairieWolf 2.61 | 11 | 12% | 17 |
| tripphippy.Alice 1.1 | 7 | 8% | 9 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 7% | 8 |
| ntc.Opposite 1.5 | 4 | 4% | 4 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 133 rounds): 99794 melee ticks, 26417 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 46 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 29248 sent, 26340 reached their opponent, 4418 virtual hits (16.8% of those reached).

## Melee bench: F31

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 96 over 4 battles (24.0 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 84.4 | 43 / 140 | 2.41 | 17.1% | 16750 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.5 | 17.2% | 60 |
| hadur117.Hadur 3.22aa | 1.5 | 17.1% | 43 |
| gh.mini.Griezel 0.2 | 3.5 | 12.8% | 25 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.9% | 4 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 10.7% | 5 |
| gh.nano.Grofvuil 0.2 | 5.8 | 8.7% | 2 |
| timmit.nano.TimDog 0.33 | 7.0 | 7.0% | 1 |
| fm.mammillarias 1.3 | 8.3 | 5.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.3 | 4.6% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 82.2 | 8 / 35 | 4129 |
| 2 | 1 | 66.9 | 84.4 | 13 / 35 | 4244 |
| 3 | 2 | 65.5 | 82.9 | 11 / 35 | 3718 |
| 4 | 1 | 68.0 | 87.9 | 11 / 35 | 4659 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 43 | 37% |
| gh.mini.Griezel 0.2 | 23 | 52% |
| d414.nano.Quantum 1.0.0 | 9 | 78% |
| spinnercat.micro.Tyger 0.1 | 8 | 75% |
| timmit.nano.TimDog 0.33 | 2 | 100% |

Hadur died in 97 of 140 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 51 | 53% | 65 |
| gh.mini.Griezel 0.2 | 20 | 21% | 34 |
| d414.nano.Quantum 1.0.0 | 10 | 10% | 16 |
| spinnercat.micro.Tyger 0.1 | 8 | 8% | 13 |
| timmit.nano.TimDog 0.33 | 4 | 4% | 6 |
| gh.nano.Grofvuil 0.2 | 4 | 4% | 5 |
| fm.mammillarias 1.3 | 0 | 0% | 1 |

Posture (Hadur's M records, 136 rounds): 106513 melee ticks, 25908 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (136 rounds): longest scan gap while four or more were alive 31 ticks (136 rounds over 8); rounds whose longest gap at any count was over 8: 136; robots dropped as dead without a death event: 1.

Targeting waves (136 rounds): 33273 sent, 29951 reached their opponent, 4586 virtual hits (15.3% of those reached).

## Melee bench: F32

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 129 over 4 battles (32.3 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 89.4 | 91 / 140 | 1.96 | 19.3% | 19846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 19.3% | 91 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.5% | 25 |
| apc.botM 3.0 | 3.0 | 12.2% | 13 |
| lxx.ConceptA 0.8 | 4.3 | 10.1% | 1 |
| vjik.UnViolation 1.1 | 5.3 | 9.6% | 4 |
| bayen.UbaMicro 1.4 | 5.8 | 9.3% | 2 |
| panzer.Panzer 0.2 | 7.3 | 7.5% | 0 |
| yk.JahMicro 1.0 | 8.0 | 7.0% | 3 |
| conscience.Electron 1.3g | 8.8 | 5.9% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 91.7 | 24 / 35 | 5109 |
| 2 | 1 | 68.3 | 86.7 | 21 / 35 | 4890 |
| 3 | 1 | 69.6 | 90.2 | 25 / 35 | 5045 |
| 4 | 1 | 68.6 | 88.9 | 21 / 35 | 4802 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 58 | 72% |
| apc.botM 3.0 | 26 | 85% |
| vjik.UnViolation 1.1 | 11 | 91% |
| lxx.ConceptA 0.8 | 8 | 88% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| yk.JahMicro 1.0 | 6 | 67% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 49 of 140 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 20 | 41% | 57 |
| apc.botM 3.0 | 11 | 22% | 36 |
| lxx.ConceptA 0.8 | 5 | 10% | 8 |
| bayen.UbaMicro 1.4 | 4 | 8% | 8 |
| vjik.UnViolation 1.1 | 3 | 6% | 18 |
| yk.JahMicro 1.0 | 3 | 6% | 7 |
| panzer.Panzer 0.2 | 2 | 4% | 2 |
| donjezza.Jezza 1.0 | 1 | 2% | 2 |
| conscience.Electron 1.3g | 0 | 0% | 2 |

Posture (Hadur's M records, 133 rounds): 80726 melee ticks, 37137 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 47 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 1.

Targeting waves (133 rounds): 27003 sent, 23713 reached their opponent, 4036 virtual hits (17.0% of those reached).

## Melee bench: F33

hadur117.Hadur 3.22aa against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 231 over 4 battles (57.8 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 91.8 | 93 / 140 | 1.66 | 22.6% | 20416 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 22.6% | 93 |
| maribo.Quester 0.3 | 2.0 | 17.5% | 20 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 14.3% | 16 |
| labg.Cataclysm 2.05 | 4.0 | 11.3% | 5 |
| baal.nano.N 1.42 | 5.3 | 10.1% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.8 | 9.8% | 5 |
| sanja.First 0.1 | 7.3 | 5.6% | 1 |
| zyx.micro.Ant 1.1 | 7.8 | 5.5% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 93.6 | 26 / 35 | 5411 |
| 2 | 1 | 70.7 | 90.7 | 23 / 35 | 4883 |
| 3 | 1 | 71.5 | 92.1 | 20 / 35 | 5094 |
| 4 | 1 | 71.2 | 90.7 | 24 / 35 | 5028 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 60 | 87% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 71% |
| labg.Cataclysm 2.05 | 13 | 85% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 80% |
| baal.nano.N 1.42 | 4 | 100% |
| sanja.First 0.1 | 2 | 100% |

Hadur died in 49 of 140 rounds, at a mean tick of 1077. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 21 | 43% | 67 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 20% | 33 |
| labg.Cataclysm 2.05 | 10 | 20% | 19 |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 10% | 7 |
| baal.nano.N 1.42 | 1 | 2% | 10 |
| zyx.micro.Ant 1.1 | 1 | 2% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 134 rounds): 106494 melee ticks, 35614 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 137 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (134 rounds): longest scan gap while four or more were alive 137 ticks (134 rounds over 8); rounds whose longest gap at any count was over 8: 134; robots dropped as dead without a death event: 0.

Targeting waves (134 rounds): 31545 sent, 28590 reached their opponent, 4013 virtual hits (14.0% of those reached).

## Melee bench: F34

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 91 over 4 battles (22.8 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 89.5 | 71 / 140 | 1.94 | 19.5% | 22909 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 19.5% | 71 |
| kid.Gladiator .7.2 | 2.5 | 15.6% | 25 |
| stelo.Spread 0.9 | 2.5 | 15.4% | 29 |
| jcs.Seth 1.8 | 4.3 | 11.1% | 10 |
| tcf.Reach 3 | 5.0 | 10.8% | 5 |
| cli.Dancer 1.1 | 5.8 | 9.2% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.2% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 84.4 | 15 / 35 | 5329 |
| 2 | 1 | 71.0 | 90.2 | 19 / 35 | 5936 |
| 3 | 1 | 71.3 | 93.3 | 21 / 35 | 5752 |
| 4 | 1 | 70.6 | 90.2 | 16 / 35 | 5892 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 46 | 70% |
| kid.Gladiator .7.2 | 43 | 60% |
| jcs.Seth 1.8 | 12 | 50% |
| tcf.Reach 3 | 5 | 80% |
| ratosh.Wesco 1.4 | 2 | 100% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 70 of 140 rounds, at a mean tick of 1095. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 27 | 39% | 54 |
| kid.Gladiator .7.2 | 26 | 37% | 50 |
| jcs.Seth 1.8 | 8 | 11% | 17 |
| tcf.Reach 3 | 7 | 10% | 13 |
| cli.Dancer 1.1 | 1 | 1% | 4 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
| ratosh.Wesco 1.4 | 0 | 0% | 1 |

Posture (Hadur's M records, 133 rounds): 102898 melee ticks, 44128 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 33 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 31967 sent, 28594 reached their opponent, 4554 virtual hits (15.9% of those reached).

## Melee bench: F35

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 89 over 4 battles (22.3 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 81.7 | 26 / 140 | 2.64 | 15.9% | 15452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.7% | 97 |
| hadur117.Hadur 3.22aa | 2.0 | 15.9% | 26 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.1% | 9 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.8% | 7 |
| rz.HawkOnFire 0.1 | 4.3 | 11.7% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6.5 | 6.7% | 0 |
| wit.Chuliath 1.0 | 6.8 | 6.4% | 0 |
| dans.Cinnamon 1.2 | 8.5 | 5.4% | 1 |
| myl.nano.KomoriNinja 1.1 | 9.0 | 5.5% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.4 | 87.0 | 10 / 35 | 4386 |
| 2 | 2 | 62.6 | 76.5 | 5 / 35 | 3452 |
| 3 | 2 | 65.6 | 84.1 | 7 / 35 | 3758 |
| 4 | 2 | 63.8 | 79.4 | 4 / 35 | 3856 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 57 | 11% |
| gh.mini.Gruwel 0.9 | 11 | 55% |
| rz.HawkOnFire 0.1 | 10 | 90% |
| dmh.robocode.robot.BlackDeath 9.2 | 6 | 67% |
| dans.Cinnamon 1.2 | 1 | 0% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 115 of 140 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 66 | 57% | 77 |
| dmh.robocode.robot.BlackDeath 9.2 | 18 | 16% | 21 |
| gh.mini.Gruwel 0.9 | 16 | 14% | 21 |
| rz.HawkOnFire 0.1 | 8 | 7% | 12 |
| dans.Cinnamon 1.2 | 3 | 3% | 3 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 2% | 2 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 2 |
| wit.Chuliath 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 132 rounds): 94232 melee ticks, 32115 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 33 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 28476 sent, 25170 reached their opponent, 3624 virtual hits (14.4% of those reached).

## Melee bench: F36

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 183 over 4 battles (45.8 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 94.0 | 105 / 140 | 1.54 | 21.5% | 23970 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 21.5% | 105 |
| bzdp.Pansy 2.1 | 2.5 | 12.4% | 7 |
| alpha.RainingFire 1.0 | 2.8 | 12.3% | 12 |
| bvh.micro.Freya 0.3 | 4.0 | 11.2% | 7 |
| mz.Cork 0.1 | 5.5 | 10.3% | 3 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.4% | 4 |
| m3thos.Eva02 0.7.1 | 6.5 | 8.7% | 1 |
| dl.BetterWalls 1.0 | 8.5 | 5.4% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 5.1% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 95.2 | 28 / 35 | 5920 |
| 2 | 1 | 71.7 | 93.3 | 25 / 35 | 6324 |
| 3 | 1 | 71.7 | 92.4 | 27 / 35 | 5926 |
| 4 | 1 | 71.9 | 94.9 | 25 / 35 | 5800 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 33 | 91% |
| bvh.micro.Freya 0.3 | 26 | 88% |
| alpha.RainingFire 1.0 | 24 | 67% |
| mz.Cork 0.1 | 16 | 94% |
| bvh.mini.Fenrir 0.39 | 8 | 75% |
| m3thos.Eva02 0.7.1 | 8 | 100% |
| sample.MyFirstRobot 1.0 | 3 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 35 of 140 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 10 | 29% | 27 |
| bvh.mini.Fenrir 0.39 | 7 | 20% | 13 |
| bzdp.Pansy 2.1 | 6 | 17% | 33 |
| bvh.micro.Freya 0.3 | 5 | 14% | 24 |
| mz.Cork 0.1 | 4 | 11% | 20 |
| m3thos.Eva02 0.7.1 | 3 | 9% | 15 |
| dl.BetterWalls 1.0 | 0 | 0% | 4 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 132 rounds): 94150 melee ticks, 32692 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 79 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 31439 sent, 28295 reached their opponent, 5447 virtual hits (19.3% of those reached).

## Melee bench: F37

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 164 over 4 battles (41.0 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 88.8 | 110 / 140 | 2.01 | 19.6% | 22984 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 19.6% | 110 |
| germ.TheMind .2 | 3.0 | 10.7% | 10 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.3 | 10.0% | 7 |
| EBBU.Sim2 1.02 | 4.8 | 9.0% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 5.5 | 8.9% | 0 |
| stelo.UntouchableNano 1.3 | 5.5 | 9.1% | 2 |
| agrach.Dalek 1.0 | 6.8 | 8.7% | 2 |
| lmk.ACPFinal 0.1 | 7.5 | 8.4% | 0 |
| mb.Beast 0.1 | 7.8 | 8.2% | 4 |
| skm.Ryubot 1.0 | 10.0 | 7.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 88.9 | 29 / 35 | 5309 |
| 2 | 1 | 68.1 | 87.0 | 26 / 35 | 5721 |
| 3 | 1 | 69.5 | 89.8 | 29 / 35 | 6059 |
| 4 | 1 | 69.1 | 89.5 | 26 / 35 | 5895 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 21 | 90% |
| agrach.Dalek 1.0 | 17 | 100% |
| mb.Beast 0.1 | 15 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 15 | 87% |
| stelo.UntouchableNano 1.3 | 15 | 87% |
| EBBU.Sim2 1.02 | 14 | 100% |
| skm.Ryubot 1.0 | 9 | 100% |
| lmk.ACPFinal 0.1 | 8 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 30 of 140 rounds, at a mean tick of 383. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 10 | 33% | 21 |
| com.syncleus.robocode.Dreadnaught 0.1 | 6 | 20% | 27 |
| lmk.ACPFinal 0.1 | 4 | 13% | 15 |
| germ.TheMind .2 | 4 | 13% | 12 |
| agrach.Dalek 1.0 | 2 | 7% | 28 |
| EBBU.Sim2 1.02 | 2 | 7% | 13 |
| stelo.UntouchableNano 1.3 | 2 | 7% | 12 |
| mb.Beast 0.1 | 0 | 0% | 8 |
| skm.Ryubot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 133 rounds): 60210 melee ticks, 18278 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 32 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 1.

Targeting waves (133 rounds): 19960 sent, 16909 reached their opponent, 4679 virtual hits (27.7% of those reached).

## Melee bench: F38

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 127 over 4 battles (31.8 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.6 | 72 / 140 | 1.94 | 19.0% | 20081 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 19.0% | 72 |
| justin.Mallais 14.0 | 2.0 | 17.0% | 46 |
| bvh.mini.Freya 0.55 | 3.5 | 11.9% | 3 |
| bts.mega.Gnarly 1.4 | 3.8 | 10.9% | 11 |
| cs.Wren 1.0 | 5.3 | 9.9% | 2 |
| kdf.KoulDestroyer 1.0 | 5.5 | 9.6% | 2 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 8.0% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.8% | 2 |
| bzdp.BoxCar 2.0 | 9.5 | 3.4% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.9 | 18 / 35 | 5240 |
| 2 | 1 | 68.0 | 87.3 | 15 / 35 | 4675 |
| 3 | 1 | 69.4 | 89.2 | 17 / 35 | 4989 |
| 4 | 1 | 70.5 | 93.0 | 22 / 35 | 5177 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 65 | 60% |
| bts.mega.Gnarly 1.4 | 12 | 67% |
| bvh.mini.Freya 0.55 | 12 | 83% |
| cs.Wren 1.0 | 8 | 100% |
| kdf.KoulDestroyer 1.0 | 6 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 1 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 0% |

Hadur died in 69 of 140 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 41 | 59% | 77 |
| bts.mega.Gnarly 1.4 | 11 | 16% | 17 |
| bvh.mini.Freya 0.55 | 7 | 10% | 17 |
| cs.Wren 1.0 | 6 | 9% | 12 |
| kdf.KoulDestroyer 1.0 | 2 | 3% | 11 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 3% | 4 |
| davidalves.net.DuelistNanoMelee 1.01 | 0 | 0% | 2 |

Posture (Hadur's M records, 134 rounds): 94607 melee ticks, 29465 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (134 rounds): longest scan gap while four or more were alive 57 ticks (134 rounds over 8); rounds whose longest gap at any count was over 8: 134; robots dropped as dead without a death event: 0.

Targeting waves (134 rounds): 29532 sent, 26044 reached their opponent, 5132 virtual hits (19.7% of those reached).

## Melee bench: F39

hadur117.Hadur 3.22aa against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 95 over 4 battles (23.8 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.2 | 90 / 140 | 1.54 | 22.7% | 23205 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 22.7% | 90 |
| bvh.fry.Freya 0.82 | 2.0 | 16.7% | 15 |
| az.Ololobot 0.2.4 | 3.0 | 13.9% | 31 |
| winamp32.micro.MicroMacro 1.0 | 4.0 | 9.9% | 0 |
| apollokidd.ApolloKidd 0.9 | 5.5 | 8.7% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 6.3 | 8.4% | 2 |
| gimp.GimpBot 0.1 | 6.8 | 7.9% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 7.8 | 6.4% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 92.5 | 21 / 35 | 6162 |
| 2 | 1 | 70.5 | 92.9 | 22 / 35 | 5335 |
| 3 | 1 | 71.0 | 94.6 | 21 / 35 | 5838 |
| 4 | 1 | 71.1 | 92.9 | 26 / 35 | 5870 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 59 | 54% |
| bvh.fry.Freya 0.82 | 54 | 85% |
| stelo.SoRobotNanoMelee 1.2 | 5 | 80% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |
| gimp.GimpBot 0.1 | 1 | 100% |

Hadur died in 50 of 140 rounds, at a mean tick of 1258. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 27 | 54% | 66 |
| bvh.fry.Freya 0.82 | 16 | 32% | 50 |
| apollokidd.ApolloKidd 0.9 | 3 | 6% | 4 |
| winamp32.micro.MicroMacro 1.0 | 2 | 4% | 6 |
| gimp.GimpBot 0.1 | 1 | 2% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 1 | 2% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 4 |

Posture (Hadur's M records, 132 rounds): 99816 melee ticks, 53619 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 25 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 1.

Targeting waves (132 rounds): 29101 sent, 26270 reached their opponent, 4826 virtual hits (18.4% of those reached).

## Melee bench: F40

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 118 over 4 battles (29.5 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 92.3 | 100 / 140 | 1.69 | 20.9% | 22599 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 20.9% | 100 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.9% | 16 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 13.5% | 11 |
| mz.AntiGrav 1.0 | 4.3 | 10.7% | 6 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.6% | 4 |
| alpha.BlackIce 1.0 | 6.5 | 8.5% | 0 |
| stelo.Randomness 1.0 | 6.8 | 8.5% | 3 |
| amk.superstrike.SuperStrike 0.3 | 7.8 | 6.2% | 0 |
| sample.Corners 1.0 | 9.5 | 2.8% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.5 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 88.9 | 22 / 35 | 5373 |
| 2 | 1 | 71.6 | 92.4 | 25 / 35 | 5568 |
| 3 | 1 | 72.2 | 92.4 | 26 / 35 | 5992 |
| 4 | 1 | 72.6 | 95.6 | 27 / 35 | 5666 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 44 | 77% |
| kano.gamma.KanoGamma 1.8 | 36 | 92% |
| Polkwane.SmashMelee 1.0 | 16 | 94% |
| mz.AntiGrav 1.0 | 14 | 86% |
| stelo.Randomness 1.0 | 3 | 100% |
| alpha.BlackIce 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 41 of 140 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 15 | 37% | 43 |
| kano.gamma.KanoGamma 1.8 | 9 | 22% | 50 |
| stelo.Randomness 1.0 | 5 | 12% | 11 |
| mz.AntiGrav 1.0 | 4 | 10% | 14 |
| alpha.BlackIce 1.0 | 4 | 10% | 7 |
| Polkwane.SmashMelee 1.0 | 3 | 7% | 10 |
| amk.superstrike.SuperStrike 0.3 | 1 | 2% | 3 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 1 |
| sample.Corners 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 133 rounds): 101130 melee ticks, 29251 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 409 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 219 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 32281 sent, 28932 reached their opponent, 5710 virtual hits (19.7% of those reached).

## Melee bench: F41

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 139 over 4 battles (34.8 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 89.9 | 75 / 140 | 1.91 | 19.1% | 19298 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 19.1% | 75 |
| eem.EvBotNG v12.8 | 2.0 | 16.0% | 49 |
| ary.Swarm 1.1 | 3.3 | 13.0% | 2 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.3% | 10 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.7% | 4 |
| shrub.Silver v048 | 6.3 | 8.4% | 0 |
| zyx.nano.Ant 1.1 | 6.8 | 7.6% | 0 |
| stelo.Mirror 1.1 | 8.3 | 5.5% | 0 |
| jsal.Jsalbot 1.0 | 8.8 | 5.2% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 88.3 | 18 / 35 | 4445 |
| 2 | 1 | 70.5 | 94.0 | 22 / 35 | 4908 |
| 3 | 1 | 70.0 | 92.4 | 18 / 35 | 4844 |
| 4 | 1 | 69.0 | 85.1 | 17 / 35 | 5101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 60 | 45% |
| lessonz.robocode.Oz 0.5.0 | 18 | 72% |
| ary.Swarm 1.1 | 17 | 94% |
| simonton.nano.MeleeSeed 1.8 | 15 | 93% |
| shrub.Silver v048 | 2 | 100% |
| stelo.Mirror 1.1 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 65 of 140 rounds, at a mean tick of 984. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 44 | 68% | 73 |
| lessonz.robocode.Oz 0.5.0 | 8 | 12% | 19 |
| simonton.nano.MeleeSeed 1.8 | 6 | 9% | 20 |
| ary.Swarm 1.1 | 4 | 6% | 15 |
| zyx.nano.Ant 1.1 | 2 | 3% | 2 |
| shrub.Silver v048 | 1 | 2% | 6 |
| jsal.Jsalbot 1.0 | 0 | 0% | 3 |
| stelo.Mirror 1.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 133 rounds): 100260 melee ticks, 35835 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 45 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 45 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 32099 sent, 28778 reached their opponent, 4372 virtual hits (15.2% of those reached).

## Melee bench: F42

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 136 over 4 battles (34.0 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.2 | 102 / 140 | 1.61 | 21.2% | 25132 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 21.2% | 102 |
| wompi.Wallaby 5.1 | 2.0 | 15.4% | 22 |
| maribo.mini.MiniQuester 0.1 | 3.0 | 13.5% | 6 |
| ara.Shera 0.88 | 4.0 | 11.8% | 10 |
| amz.NanoClone 1.41 | 5.0 | 8.6% | 0 |
| maribo.IotaCT 1.1 | 6.5 | 6.6% | 0 |
| dsw.StaticD 1.0 | 6.8 | 7.1% | 0 |
| stelo.MirrorMicro 1.0 | 7.8 | 6.4% | 0 |
| mme.NikeEnhanced 2.0 | 9.3 | 5.0% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 94.3 | 27 / 35 | 6186 |
| 2 | 1 | 72.1 | 94.0 | 25 / 35 | 6577 |
| 3 | 1 | 71.9 | 92.7 | 26 / 35 | 6340 |
| 4 | 1 | 70.8 | 91.7 | 24 / 35 | 6029 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 65 | 83% |
| maribo.mini.MiniQuester 0.1 | 32 | 94% |
| ara.Shera 0.88 | 14 | 86% |
| amz.NanoClone 1.41 | 3 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |
| dsw.StaticD 1.0 | 1 | 100% |

Hadur died in 38 of 140 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 16 | 42% | 68 |
| ara.Shera 0.88 | 10 | 26% | 23 |
| maribo.mini.MiniQuester 0.1 | 7 | 18% | 34 |
| dsw.StaticD 1.0 | 4 | 11% | 6 |
| amz.NanoClone 1.41 | 1 | 3% | 2 |
| maribo.IotaCT 1.1 | 0 | 0% | 3 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 3 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 134 rounds): 106772 melee ticks, 33574 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (134 rounds): longest scan gap while four or more were alive 39 ticks (134 rounds over 8); rounds whose longest gap at any count was over 8: 134; robots dropped as dead without a death event: 0.

Targeting waves (134 rounds): 32945 sent, 29706 reached their opponent, 5479 virtual hits (18.4% of those reached).

## Melee bench: F43

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 90 over 4 battles (22.5 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 81.3 | 27 / 140 | 2.68 | 16.5% | 17812 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.3% | 95 |
| hadur117.Hadur 3.22aa | 2.0 | 16.5% | 27 |
| dummy.micro.Sparrow 2.5 | 3.5 | 12.6% | 4 |
| brainfade.melee.Dusk 0.44 | 4.0 | 11.9% | 12 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.2% | 0 |
| Krabb.akim2.Akim2 1.1b | 5.5 | 10.0% | 1 |
| mz.NanoGod 2.02 | 7.0 | 8.0% | 1 |
| jab.DiamondStealer 5 | 8.0 | 7.1% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.0% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.3 | 84.1 | 12 / 35 | 4559 |
| 2 | 2 | 64.8 | 76.5 | 4 / 35 | 4007 |
| 3 | 2 | 67.2 | 81.3 | 5 / 35 | 4656 |
| 4 | 2 | 67.5 | 83.5 | 6 / 35 | 4590 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 67 | 22% |
| brainfade.melee.Dusk 0.44 | 7 | 43% |
| dummy.micro.Sparrow 2.5 | 4 | 75% |
| Krabb.akim2.Akim2 1.1b | 3 | 67% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 113 of 140 rounds, at a mean tick of 973. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 69 | 61% | 82 |
| dummy.micro.Sparrow 2.5 | 16 | 14% | 23 |
| brainfade.melee.Dusk 0.44 | 14 | 12% | 17 |
| wcsv.melee.EngineerMelee 0.1 | 7 | 6% | 7 |
| mz.NanoGod 2.02 | 3 | 3% | 6 |
| Krabb.akim2.Akim2 1.1b | 3 | 3% | 4 |
| jab.DiamondStealer 5 | 1 | 1% | 1 |

Posture (Hadur's M records, 132 rounds): 95345 melee ticks, 36394 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 24 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 30058 sent, 26737 reached their opponent, 4137 virtual hits (15.5% of those reached).

## Melee bench: F44

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 103 over 4 battles (25.8 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 91.8 | 96 / 140 | 1.74 | 21.0% | 24154 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 21.0% | 96 |
| stelo.Liblix 0.3.1 | 2.0 | 15.8% | 27 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.4% | 9 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.3 | 9.2% | 2 |
| jwirde.Gort 2.0 | 4.8 | 9.3% | 6 |
| disan.Chair 2.2.0 | 7.0 | 6.9% | 1 |
| stf.PanzerGeneral 0.1 | 7.0 | 7.0% | 0 |
| wompi.Quokka 1.6 | 7.0 | 6.9% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 92.4 | 21 / 35 | 6041 |
| 2 | 1 | 70.8 | 89.5 | 24 / 35 | 5764 |
| 3 | 1 | 71.2 | 89.8 | 25 / 35 | 5976 |
| 4 | 1 | 72.7 | 95.6 | 26 / 35 | 6373 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 59 | 71% |
| tzu.TheArtOfWar 1.2 | 43 | 93% |
| jwirde.Gort 2.0 | 5 | 80% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 100% |
| disan.Chair 2.2.0 | 2 | 100% |
| wompi.Quokka 1.6 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 44 of 140 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 26 | 59% | 68 |
| tzu.TheArtOfWar 1.2 | 8 | 18% | 42 |
| jwirde.Gort 2.0 | 4 | 9% | 10 |
| wompi.Quokka 1.6 | 3 | 7% | 4 |
| amk.jointstrike.JointStrike 0.2 | 2 | 5% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 1 | 2% | 7 |
| disan.Chair 2.2.0 | 0 | 0% | 3 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 133 rounds): 101083 melee ticks, 28268 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 31 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 1.

Targeting waves (133 rounds): 33248 sent, 30145 reached their opponent, 5786 virtual hits (19.2% of those reached).

## Melee bench: F45

hadur117.Hadur 3.22aa against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 133 over 4 battles (33.3 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 89.2 | 82 / 140 | 1.97 | 20.5% | 23327 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.0 | 20.5% | 82 |
| jje.BagPuss 1.2 | 2.5 | 11.9% | 8 |
| myl.nano.Graviton 1.10 | 3.3 | 11.1% | 5 |
| eem.IWillFireNoBullet v2.8 | 3.5 | 10.9% | 34 |
| sul.Lunar 1.1 | 5.3 | 9.7% | 5 |
| fm.claire 1.7 | 6.0 | 9.3% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 6.5 | 8.9% | 3 |
| hvilela.HVilela 0.9 | 8.0 | 7.5% | 0 |
| abud.ThirdRobo 1.0 | 9.5 | 4.5% | 0 |
| wit.Deep7 2.0 | 9.5 | 5.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 88.9 | 19 / 35 | 5631 |
| 2 | 1 | 72.1 | 93.3 | 24 / 35 | 6275 |
| 3 | 1 | 70.1 | 89.8 | 20 / 35 | 5633 |
| 4 | 1 | 69.4 | 84.8 | 19 / 35 | 5788 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 46 | 63% |
| jje.BagPuss 1.2 | 18 | 72% |
| sul.Lunar 1.1 | 14 | 100% |
| myl.nano.Graviton 1.10 | 13 | 85% |
| pez.mini.ChironexFleckeri 0.5 | 6 | 100% |
| wit.Deep7 2.0 | 6 | 83% |
| fm.claire 1.7 | 3 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 58 of 140 rounds, at a mean tick of 1445. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 22 | 38% | 0 |
| jje.BagPuss 1.2 | 16 | 28% | 44 |
| myl.nano.Graviton 1.10 | 5 | 9% | 25 |
| fm.claire 1.7 | 4 | 7% | 12 |
| wit.Deep7 2.0 | 4 | 7% | 6 |
| sul.Lunar 1.1 | 3 | 5% | 28 |
| pez.mini.ChironexFleckeri 0.5 | 3 | 5% | 13 |
| hvilela.HVilela 0.9 | 1 | 2% | 8 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 132 rounds): 122322 melee ticks, 50120 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 40 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 37391 sent, 34243 reached their opponent, 4932 virtual hits (14.4% of those reached).

## Melee bench: F46

hadur117.Hadur 3.22aa against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 92 over 4 battles (23.0 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.5 | 82 / 140 | 1.92 | 20.8% | 19635 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22aa | 1.3 | 20.8% | 82 |
| kc.mini.Mirage 0.2 | 1.8 | 19.3% | 47 |
| cx.Princess 1.0 | 3.3 | 12.0% | 8 |
| mz.MicroSheep 1.0 | 3.8 | 12.0% | 0 |
| sadoner.killer 0.2 | 5.0 | 10.9% | 2 |
| arthord.NanoSatanMelee Beta | 6.0 | 9.3% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.3 | 6.6% | 0 |
| kurios.DOSexe .9a | 7.8 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 85.7 | 19 / 35 | 4919 |
| 2 | 2 | 68.7 | 88.2 | 18 / 35 | 4806 |
| 3 | 1 | 68.9 | 86.8 | 20 / 35 | 4741 |
| 4 | 1 | 70.7 | 93.2 | 25 / 35 | 5169 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 86 | 72% |
| cx.Princess 1.0 | 7 | 71% |
| mz.MicroSheep 1.0 | 7 | 100% |
| arthord.NanoSatanMelee Beta | 6 | 100% |
| sadoner.killer 0.2 | 2 | 50% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 58 of 140 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 34 | 59% | 93 |
| sadoner.killer 0.2 | 12 | 21% | 14 |
| cx.Princess 1.0 | 4 | 7% | 7 |
| mz.MicroSheep 1.0 | 3 | 5% | 15 |
| arthord.NanoSatanMelee Beta | 3 | 5% | 7 |
| kurios.DOSexe .9a | 2 | 3% | 3 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 133 rounds): 87370 melee ticks, 35195 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 33 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 24804 sent, 21778 reached their opponent, 3204 virtual hits (14.7% of those reached).

