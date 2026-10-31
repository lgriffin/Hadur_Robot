# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 210 over 6 battles (35.0 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 86.8 | 45 / 210 | 2.19 | 17.4% | 30695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.7% | 147 |
| hadur117.Hadur 3.20la | 2.0 | 17.4% | 45 |
| sgp.JollyNinja 3.53 | 3.5 | 11.2% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 11.4% | 1 |
| mz.MicroGodMelee 1 | 4.8 | 10.0% | 2 |
| lorneswork.Predator 1.0 | 5.7 | 9.6% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.1% | 0 |
| skm.butterfly 1.0 | 8.3 | 5.2% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.7 | 5.1% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 80.6 | 5 / 35 | 4863 |
| 2 | 2 | 67.7 | 88.9 | 5 / 35 | 5205 |
| 3 | 2 | 68.3 | 90.2 | 6 / 35 | 5329 |
| 4 | 2 | 68.7 | 90.2 | 11 / 35 | 5114 |
| 5 | 2 | 67.8 | 87.9 | 10 / 35 | 5241 |
| 6 | 2 | 66.1 | 83.2 | 8 / 35 | 4943 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 135 | 10% |
| sgp.JollyNinja 3.53 | 19 | 63% |
| mz.MicroGodMelee 1 | 9 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 100% |
| lorneswork.Predator 1.0 | 3 | 100% |
| skm.butterfly 1.0 | 3 | 67% |

Hadur died in 166 of 210 rounds, at a mean tick of 1211. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 130 | 78% | 147 |
| sgp.JollyNinja 3.53 | 13 | 8% | 19 |
| lorneswork.Predator 1.0 | 8 | 5% | 13 |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 5% | 13 |
| mz.MicroGodMelee 1 | 3 | 2% | 12 |
| adt.Ar2 1.0 | 1 | 1% | 2 |
| skm.butterfly 1.0 | 1 | 1% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 143020 melee ticks, 100949 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 72 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 46015 sent, 40932 reached their opponent, 8124 virtual hits (19.8% of those reached).

## Melee bench: F02

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 299 over 6 battles (49.8 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 89.2 | 125 / 210 | 1.98 | 19.6% | 31054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 19.6% | 125 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.8% | 34 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.0% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.8% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.3% | 8 |
| Noran.BitchingElk 0.054 | 6.8 | 8.4% | 8 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 8.1% | 1 |
| sch.Simone 0.3d | 7.2 | 7.8% | 11 |
| stelo.PatternRobot 1.0 | 9.0 | 4.9% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 93.7 | 23 / 35 | 5533 |
| 2 | 1 | 70.1 | 91.7 | 22 / 35 | 5432 |
| 3 | 1 | 67.5 | 83.5 | 14 / 35 | 4862 |
| 4 | 1 | 70.7 | 91.4 | 23 / 35 | 5343 |
| 5 | 1 | 67.6 | 83.5 | 18 / 35 | 4564 |
| 6 | 1 | 70.6 | 91.1 | 25 / 35 | 5320 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 56 | 63% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 43 | 79% |
| com.cohesiva.robocode.ManOwaR 1.0 | 25 | 84% |
| sch.Simone 0.3d | 17 | 76% |
| Noran.BitchingElk 0.054 | 15 | 60% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 90% |
| stelo.PatternRobot 1.0 | 3 | 100% |
| fnc.bandit.Bandit 5.2.0 | 2 | 50% |

Hadur died in 86 of 210 rounds, at a mean tick of 1048. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 30 | 35% | 66 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 14 | 16% | 47 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 13% | 21 |
| sch.Simone 0.3d | 10 | 12% | 24 |
| Noran.BitchingElk 0.054 | 9 | 10% | 19 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 8% | 27 |
| fnc.bandit.Bandit 5.2.0 | 2 | 2% | 4 |
| stelo.PatternRobot 1.0 | 2 | 2% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 167731 melee ticks, 58543 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 47 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 59919 sent, 55073 reached their opponent, 9243 virtual hits (16.8% of those reached).

## Melee bench: F03

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 110 over 6 battles (18.3 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 95.2 | 180 / 210 | 1.43 | 21.4% | 38766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 21.4% | 180 |
| radnor.DoctorBob 1.42 | 2.2 | 13.7% | 14 |
| kawigi.nano.Lib 1.0 | 3.2 | 12.7% | 7 |
| vuen.Cake 2.51 | 3.7 | 12.2% | 8 |
| urdos.URDOS 1.3 | 5.0 | 9.4% | 1 |
| adt.Ar1 2.1 | 6.7 | 7.1% | 0 |
| oa.weak.FlyMk1 0.1 | 7.0 | 6.6% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 6.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.3 | 5.1% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 94.3 | 29 / 35 | 5967 |
| 2 | 1 | 72.1 | 97.1 | 30 / 35 | 6432 |
| 3 | 1 | 72.5 | 98.1 | 33 / 35 | 6547 |
| 4 | 1 | 72.1 | 94.9 | 30 / 35 | 6729 |
| 5 | 1 | 71.6 | 91.4 | 29 / 35 | 6696 |
| 6 | 1 | 71.5 | 95.6 | 29 / 35 | 6395 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 66 | 95% |
| kawigi.nano.Lib 1.0 | 57 | 95% |
| radnor.DoctorBob 1.42 | 57 | 100% |
| adt.Ar1 2.1 | 3 | 100% |
| urdos.URDOS 1.3 | 3 | 67% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |

Hadur died in 32 of 210 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 9 | 28% | 61 |
| vuen.Cake 2.51 | 8 | 25% | 66 |
| kawigi.nano.Lib 1.0 | 6 | 19% | 52 |
| urdos.URDOS 1.3 | 5 | 16% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 6% | 2 |
| oa.weak.FlyMk1 0.1 | 1 | 3% | 9 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 3% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 201 rounds): 127556 melee ticks, 42209 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 56 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 38395 sent, 33836 reached their opponent, 8811 virtual hits (26.0% of those reached).

## Melee bench: F04

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 185 over 6 battles (30.8 per battle, most in one battle 116). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.2 | 26 / 210 | 2.15 | 17.7% | 33149 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.5% | 163 |
| hadur117.Hadur 3.20la | 2.0 | 17.7% | 26 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.5% | 14 |
| TNT.TNT 0.99.1 | 4.0 | 10.8% | 6 |
| josago.Jorgito 0.16 | 5.0 | 8.9% | 1 |
| css.Delitioner 0.11 | 6.5 | 7.0% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.7% | 0 |
| rampancy.Durandal 2.1d | 7.7 | 5.5% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.7% | 1 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.7 | 86.0 | 1 / 35 | 5555 |
| 2 | 2 | 68.3 | 86.7 | 3 / 35 | 5680 |
| 3 | 2 | 67.9 | 86.3 | 5 / 35 | 5292 |
| 4 | 2 | 68.5 | 89.2 | 4 / 35 | 5327 |
| 5 | 2 | 69.6 | 88.6 | 7 / 35 | 6011 |
| 6 | 2 | 68.0 | 86.3 | 6 / 35 | 5284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 145 | 11% |
| TNT.TNT 0.99.1 | 9 | 56% |
| apc.LeeroyJenkins2 1.0 | 8 | 13% |
| josago.Jorgito 0.16 | 3 | 67% |
| spin.Bugstard 0.012b | 1 | 100% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 1355. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 141 | 76% | 159 |
| apc.LeeroyJenkins2 1.0 | 25 | 13% | 27 |
| TNT.TNT 0.99.1 | 13 | 7% | 16 |
| josago.Jorgito 0.16 | 4 | 2% | 6 |
| css.Delitioner 0.11 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 196717 melee ticks, 78615 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 65 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 59603 sent, 54713 reached their opponent, 8057 virtual hits (14.7% of those reached).

## Melee bench: F05

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 530 over 6 battles (88.3 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 77.9 | 32 / 210 | 2.99 | 15.1% | 23639 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 17.8% | 101 |
| justin.DemonicRage 3.4 | 1.7 | 17.2% | 57 |
| hadur117.Hadur 3.20la | 3.0 | 15.1% | 32 |
| wompi.Numbat 2.1 | 4.0 | 12.6% | 13 |
| axeBots.HataMoto 3.09 | 5.3 | 9.3% | 5 |
| ms.Ares 0.19 | 5.7 | 9.2% | 2 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.5% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.2% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.4 | 78.1 | 6 / 35 | 3971 |
| 2 | 3 | 63.8 | 75.9 | 4 / 35 | 4090 |
| 3 | 3 | 64.2 | 79.7 | 4 / 35 | 3702 |
| 4 | 3 | 63.4 | 75.9 | 5 / 35 | 3923 |
| 5 | 3 | 64.2 | 78.7 | 7 / 35 | 3775 |
| 6 | 3 | 64.7 | 79.4 | 6 / 35 | 4178 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 40 | 38% |
| cb.fire.Firestarter 2.0f | 37 | 3% |
| wompi.Numbat 2.1 | 16 | 81% |
| axeBots.HataMoto 3.09 | 6 | 50% |

Hadur died in 182 of 210 rounds, at a mean tick of 924. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 68 | 37% | 72 |
| justin.DemonicRage 3.4 | 63 | 35% | 75 |
| wompi.Numbat 2.1 | 23 | 13% | 34 |
| axeBots.HataMoto 3.09 | 11 | 6% | 14 |
| ms.Ares 0.19 | 10 | 5% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 3 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 156659 melee ticks, 39018 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 72 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 48165 sent, 43004 reached their opponent, 7093 virtual hits (16.5% of those reached).

## Melee bench: F06

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 122 over 6 battles (20.3 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.0 | 143 / 210 | 1.81 | 20.0% | 32366 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 20.0% | 143 |
| jekl.StoneGhost 0.7 | 2.2 | 14.8% | 27 |
| origin.SleepSiphon 1.7b | 3.2 | 12.7% | 24 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 11.8% | 11 |
| mld.Wisdom 1.0 | 4.8 | 10.8% | 2 |
| gg.Wolverine 2.0 | 6.0 | 8.2% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 6.7% | 1 |
| DBall.NUKE 0.1 | 8.0 | 6.2% | 2 |
| spinnercat.Omen 1.0 | 8.3 | 6.0% | 1 |
| sample.Fire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.7 | 21 / 35 | 5652 |
| 2 | 1 | 70.4 | 92.7 | 23 / 35 | 5065 |
| 3 | 1 | 70.2 | 90.5 | 27 / 35 | 5135 |
| 4 | 1 | 70.0 | 89.5 | 22 / 35 | 5486 |
| 5 | 1 | 71.6 | 92.4 | 27 / 35 | 6028 |
| 6 | 1 | 69.7 | 88.9 | 23 / 35 | 5000 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 65 | 85% |
| origin.SleepSiphon 1.7b | 39 | 77% |
| pe.minimelee.SandboxMiniMelee 1.1 | 33 | 91% |
| gg.Wolverine 2.0 | 11 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 89% |
| mld.Wisdom 1.0 | 7 | 86% |
| DBall.NUKE 0.1 | 3 | 67% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 23 | 33% | 66 |
| jekl.StoneGhost 0.7 | 23 | 33% | 59 |
| pe.minimelee.SandboxMiniMelee 1.1 | 7 | 10% | 34 |
| mld.Wisdom 1.0 | 7 | 10% | 19 |
| gg.Wolverine 2.0 | 4 | 6% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 11 |
| DBall.NUKE 0.1 | 2 | 3% | 4 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 143574 melee ticks, 41471 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 45403 sent, 40705 reached their opponent, 9056 virtual hits (22.2% of those reached).

## Melee bench: F07

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 521 over 6 battles (86.8 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 94.3 | 131 / 210 | 1.51 | 21.2% | 39378 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 21.2% | 131 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 16.4% | 42 |
| rtk.Tachikoma 1.0 | 2.7 | 15.9% | 24 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.5% | 3 |
| franzor.Lizt 1.3.1 | 4.8 | 10.7% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.7% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.4% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.0 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 95.9 | 27 / 35 | 7025 |
| 2 | 1 | 73.1 | 95.6 | 22 / 35 | 6577 |
| 3 | 1 | 72.4 | 92.7 | 18 / 35 | 6481 |
| 4 | 1 | 73.4 | 95.6 | 23 / 35 | 6861 |
| 5 | 1 | 72.6 | 93.7 | 21 / 35 | 6354 |
| 6 | 1 | 71.7 | 92.7 | 20 / 35 | 6080 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 92 | 77% |
| rsalesc.melee.Monk 0.3.6c | 45 | 31% |
| oog.melee.CapuletDroid 1.1 | 31 | 94% |
| franzor.Lizt 1.3.1 | 26 | 65% |

Hadur died in 83 of 210 rounds, at a mean tick of 1488. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 35 | 42% | 59 |
| rtk.Tachikoma 1.0 | 28 | 34% | 101 |
| franzor.Lizt 1.3.1 | 9 | 11% | 0 |
| oog.melee.CapuletDroid 1.1 | 6 | 7% | 43 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 1 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 3 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 190643 melee ticks, 96382 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 87 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 87 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 57488 sent, 52617 reached their opponent, 10705 virtual hits (20.3% of those reached).

## Melee bench: F08

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 456 over 6 battles (76.0 per battle, most in one battle 156). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 91.1 | 142 / 210 | 1.80 | 19.8% | 30172 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 19.8% | 142 |
| tm.Yuugao 1.0 | 2.3 | 13.0% | 31 |
| shrub.Vapour v159 | 3.0 | 12.2% | 16 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.8% | 12 |
| com.spp.robocode.MostlyHarmless 010 | 4.7 | 10.2% | 2 |
| m3thos.Eva00 1.1 | 6.2 | 8.7% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 8.3% | 7 |
| qualidafial.MajorDick 1.0.1 | 8.2 | 6.6% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.2 | 5.4% | 0 |
| SHAM.WOW 1.4 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 91.1 | 24 / 35 | 5072 |
| 2 | 1 | 68.2 | 87.9 | 21 / 35 | 4667 |
| 3 | 1 | 70.3 | 93.0 | 26 / 35 | 4983 |
| 4 | 1 | 68.0 | 85.7 | 19 / 35 | 4939 |
| 5 | 1 | 70.6 | 93.0 | 26 / 35 | 5314 |
| 6 | 1 | 70.7 | 95.6 | 26 / 35 | 5197 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 52 | 85% |
| shrub.Vapour v159 | 43 | 81% |
| Krabb.sliNk.Garm 0.9u | 28 | 71% |
| com.spp.robocode.MostlyHarmless 010 | 25 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 44% |
| m3thos.Eva00 1.1 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 4 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 18 | 25% | 70 |
| shrub.Vapour v159 | 16 | 22% | 45 |
| Krabb.sliNk.Garm 0.9u | 14 | 19% | 29 |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 12% | 16 |
| com.spp.robocode.MostlyHarmless 010 | 7 | 10% | 29 |
| zyx.nano.BacillusComma 1.0 | 3 | 4% | 4 |
| qualidafial.MajorDick 1.0.1 | 2 | 3% | 2 |
| m3thos.Eva00 1.1 | 1 | 1% | 11 |
| SHAM.WOW 1.4 | 0 | 0% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 145330 melee ticks, 48394 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 50 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 2.

Targeting waves (204 rounds): 47927 sent, 42970 reached their opponent, 7768 virtual hits (18.1% of those reached).

## Melee bench: F09

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 338 over 6 battles (56.3 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 73.7 | 47 / 210 | 3.37 | 14.7% | 21209 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.2% | 99 |
| hadur117.Hadur 3.20la | 2.3 | 14.7% | 47 |
| kc.micro.Figment 1.0 | 2.7 | 14.4% | 33 |
| yagami.Tidus 0.11 | 4.3 | 11.2% | 3 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.4% | 11 |
| mc2.enemy.Original 0.9 | 5.8 | 9.5% | 13 |
| dft.Calliope 5.6 | 7.0 | 7.7% | 4 |
| step.nanoPri 1.0 | 8.2 | 5.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 4.9% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 74.0 | 9 / 35 | 3515 |
| 2 | 3 | 61.9 | 73.0 | 5 / 35 | 3488 |
| 3 | 2 | 62.9 | 73.0 | 10 / 35 | 3731 |
| 4 | 2 | 63.3 | 77.5 | 6 / 35 | 3539 |
| 5 | 3 | 59.8 | 65.1 | 6 / 35 | 3252 |
| 6 | 2 | 64.7 | 79.7 | 11 / 35 | 3684 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 45 | 22% |
| kc.micro.Figment 1.0 | 25 | 88% |
| pedersen.Grishnakh 1.0 | 8 | 63% |
| mc2.enemy.Original 0.9 | 7 | 29% |
| yagami.Tidus 0.11 | 6 | 50% |
| dft.Calliope 5.6 | 5 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 63 | 38% | 74 |
| kc.micro.Figment 1.0 | 30 | 18% | 51 |
| mc2.enemy.Original 0.9 | 20 | 12% | 24 |
| yagami.Tidus 0.11 | 19 | 11% | 21 |
| pedersen.Grishnakh 1.0 | 15 | 9% | 20 |
| dft.Calliope 5.6 | 7 | 4% | 10 |
| robar.nano.Assertive_Melee 0.2 | 6 | 4% | 6 |
| step.nanoPri 1.0 | 2 | 1% | 2 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 145016 melee ticks, 31834 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 63 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 48056 sent, 43217 reached their opponent, 6235 virtual hits (14.4% of those reached).

## Melee bench: F10

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 248 over 6 battles (41.3 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 97.0 | 179 / 210 | 1.27 | 21.1% | 33916 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 21.1% | 179 |
| DTF.Kludgy 1.2b | 2.0 | 13.9% | 12 |
| ne.Chimera 1.2 | 3.3 | 13.0% | 9 |
| ejb.Polaris 1.0.1 | 3.8 | 12.2% | 8 |
| vStar.RAFzilla 2.15 | 5.3 | 10.0% | 1 |
| tvv.micro.Antares 1.1.1 | 5.5 | 9.9% | 2 |
| kurios.DOSexe .9b | 7.7 | 5.4% | 0 |
| sam.Samspin 1.0 | 8.2 | 5.0% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 4.9% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 97.5 | 33 / 35 | 5511 |
| 2 | 1 | 71.3 | 96.2 | 28 / 35 | 5340 |
| 3 | 1 | 72.0 | 98.4 | 30 / 35 | 5772 |
| 4 | 1 | 72.0 | 98.1 | 30 / 35 | 5758 |
| 5 | 1 | 71.8 | 95.6 | 30 / 35 | 5932 |
| 6 | 1 | 71.5 | 96.5 | 28 / 35 | 5603 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 63 | 86% |
| ne.Chimera 1.2 | 45 | 84% |
| ejb.Polaris 1.0.1 | 44 | 91% |
| vStar.RAFzilla 2.15 | 23 | 100% |
| tvv.micro.Antares 1.1.1 | 19 | 95% |
| donjezza.Muncho 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 34 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 13 | 38% | 65 |
| ne.Chimera 1.2 | 11 | 32% | 45 |
| ejb.Polaris 1.0.1 | 6 | 18% | 51 |
| vStar.RAFzilla 2.15 | 1 | 3% | 27 |
| tvv.micro.Antares 1.1.1 | 1 | 3% | 14 |
| kurios.DOSexe .9b | 0 | 0% | 4 |
| sam.Samspin 1.0 | 0 | 0% | 2 |
| donjezza.Muncho 1.0 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 142249 melee ticks, 58282 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 518 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 286 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 46571 sent, 41833 reached their opponent, 7758 virtual hits (18.5% of those reached).

## Melee bench: F11

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 692 over 6 battles (115.3 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 80.6 | 68 / 210 | 2.75 | 16.3% | 23767 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 17.1% | 79 |
| hadur117.Hadur 3.20la | 1.7 | 16.3% | 68 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.7% | 23 |
| djc.DynaBot 0.1.1 | 4.3 | 10.3% | 8 |
| rdt199.Warlord 0.73 | 5.3 | 9.3% | 15 |
| uji.YellohFellah 1.0 | 5.8 | 8.7% | 12 |
| br2.MobyDickBot 1.6 | 7.0 | 8.2% | 6 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.3% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.6% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 87.0 | 17 / 35 | 4450 |
| 2 | 2 | 63.7 | 77.5 | 10 / 35 | 3665 |
| 3 | 2 | 63.6 | 77.8 | 7 / 35 | 3883 |
| 4 | 1 | 67.8 | 87.6 | 17 / 35 | 4330 |
| 5 | 2 | 63.0 | 77.5 | 7 / 35 | 3599 |
| 6 | 2 | 63.6 | 76.2 | 10 / 35 | 3840 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 55 | 38% |
| cx.mini.Nimrod 0.55 | 21 | 52% |
| rdt199.Warlord 0.73 | 17 | 59% |
| uji.YellohFellah 1.0 | 16 | 81% |
| djc.DynaBot 0.1.1 | 14 | 64% |
| br2.MobyDickBot 1.6 | 4 | 25% |
| KiraNL.Chupacabra 0.4 | 3 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 70 | 47% | 97 |
| cx.mini.Nimrod 0.55 | 23 | 15% | 36 |
| rdt199.Warlord 0.73 | 14 | 9% | 23 |
| djc.DynaBot 0.1.1 | 10 | 7% | 17 |
| uji.YellohFellah 1.0 | 9 | 6% | 15 |
| br2.MobyDickBot 1.6 | 8 | 5% | 11 |
| KiraNL.Chupacabra 0.4 | 6 | 4% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 1% | 2 |
| stelo.MirrorNano 1.3 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 156711 melee ticks, 41269 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 58 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 51009 sent, 46035 reached their opponent, 6261 virtual hits (13.6% of those reached).

## Melee bench: F12

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 244 over 6 battles (40.7 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 87.5 | 123 / 210 | 2.12 | 18.1% | 23024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 18.1% | 123 |
| bts.wiki.RipCurl 0.9b | 2.7 | 12.7% | 22 |
| nat.PallasHawk 1.0 | 3.0 | 13.0% | 27 |
| darkcanuck.Leon 1.01 | 3.3 | 12.6% | 20 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.7% | 15 |
| jrm.Test0 1.0 | 6.2 | 8.4% | 0 |
| cs.sheldor.Talon 1.1 | 6.8 | 7.4% | 1 |
| jp.Perpy 16.0 | 8.0 | 6.5% | 1 |
| stuff.Vlad 0.1 | 9.3 | 5.5% | 0 |
| jaybot.bots.Oddball 4.0 | 9.7 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 93.3 | 23 / 35 | 4060 |
| 2 | 1 | 67.9 | 87.9 | 22 / 35 | 3942 |
| 3 | 1 | 68.2 | 91.1 | 20 / 35 | 3792 |
| 4 | 1 | 65.4 | 80.6 | 19 / 35 | 3619 |
| 5 | 1 | 66.2 | 84.4 | 19 / 35 | 3864 |
| 6 | 1 | 67.3 | 87.6 | 20 / 35 | 3747 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 42 | 88% |
| nat.PallasHawk 1.0 | 40 | 73% |
| bts.wiki.RipCurl 0.9b | 39 | 82% |
| brainfade.melee.Genghis 0.36 | 18 | 72% |
| jrm.Test0 1.0 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| jp.Perpy 16.0 | 3 | 67% |
| jaybot.bots.Oddball 4.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 24 | 27% | 51 |
| brainfade.melee.Genghis 0.36 | 18 | 20% | 27 |
| nat.PallasHawk 1.0 | 16 | 18% | 49 |
| darkcanuck.Leon 1.01 | 15 | 17% | 50 |
| jrm.Test0 1.0 | 7 | 8% | 11 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 14 |
| jp.Perpy 16.0 | 1 | 1% | 4 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 3 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 129595 melee ticks, 35622 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 58 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 44805 sent, 39798 reached their opponent, 6574 virtual hits (16.5% of those reached).

## Melee bench: F13

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 99 over 6 battles (16.5 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 81.3 | 72 / 210 | 2.68 | 16.0% | 24232 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.7 | 16.2% | 30 |
| hadur117.Hadur 3.20la | 2.2 | 16.0% | 72 |
| mn.Combat 3.25.0 | 2.2 | 16.0% | 83 |
| gh.micro.Gruweltje 0.7 | 4.5 | 12.1% | 8 |
| shinh.Entangled 0.3 | 4.5 | 11.9% | 17 |
| apc.Colossus2 0.17 | 6.0 | 8.1% | 0 |
| stelo.Wang 1.0 | 7.0 | 7.0% | 0 |
| maribo.FollowFire 1 | 8.5 | 4.8% | 0 |
| ayk.WallHugger 1.0 | 8.5 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 81.9 | 12 / 35 | 4551 |
| 2 | 1 | 67.1 | 86.0 | 15 / 35 | 4408 |
| 3 | 3 | 64.3 | 79.4 | 13 / 35 | 3757 |
| 4 | 2 | 65.7 | 83.2 | 13 / 35 | 4051 |
| 5 | 3 | 63.2 | 77.5 | 8 / 35 | 3556 |
| 6 | 3 | 64.7 | 80.0 | 11 / 35 | 3909 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 55 | 78% |
| mn.Combat 3.25.0 | 40 | 30% |
| shinh.Entangled 0.3 | 19 | 63% |
| gh.micro.Gruweltje 0.7 | 6 | 50% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 48 | 35% | 85 |
| mn.Combat 3.25.0 | 42 | 30% | 58 |
| gh.micro.Gruweltje 0.7 | 19 | 14% | 22 |
| shinh.Entangled 0.3 | 15 | 11% | 29 |
| maribo.FollowFire 1 | 7 | 5% | 6 |
| stelo.Wang 1.0 | 6 | 4% | 8 |
| apc.Colossus2 0.17 | 1 | 1% | 2 |

Posture (Hadur's M records, 202 rounds): 142031 melee ticks, 42317 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 66 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 42475 sent, 37345 reached their opponent, 5890 virtual hits (15.8% of those reached).

## Melee bench: F14

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 159 over 6 battles (26.5 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 94.1 | 163 / 210 | 1.53 | 21.0% | 35562 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 21.0% | 163 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.8% | 13 |
| catcat20.shape.Theta 0.018 | 3.0 | 11.8% | 16 |
| sanyi.mikrobi.Roberto 1.0 | 5.0 | 9.5% | 4 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 9.4% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 5.8 | 9.0% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.3 | 8.6% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.5 | 8.0% | 1 |
| pa.Improved 1.0 | 9.0 | 5.9% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 94.0 | 28 / 35 | 6071 |
| 2 | 1 | 70.0 | 91.1 | 25 / 35 | 5395 |
| 3 | 1 | 72.3 | 96.2 | 31 / 35 | 6019 |
| 4 | 1 | 71.5 | 94.6 | 26 / 35 | 6047 |
| 5 | 1 | 71.1 | 92.7 | 26 / 35 | 5716 |
| 6 | 1 | 72.5 | 96.2 | 27 / 35 | 6314 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 76 | 91% |
| catcat20.shape.Theta 0.018 | 54 | 80% |
| sanyi.mikrobi.Roberto 1.0 | 19 | 89% |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 82% |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 80% |
| pa.Improved 1.0 | 5 | 80% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 15 | 32% | 69 |
| catcat20.shape.Theta 0.018 | 14 | 30% | 60 |
| sanyi.mikrobi.Roberto 1.0 | 6 | 13% | 32 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 6% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 6% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 4% | 11 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 4% | 9 |
| pa.Improved 1.0 | 2 | 4% | 6 |

Posture (Hadur's M records, 200 rounds): 141934 melee ticks, 56171 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 50 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 44584 sent, 39889 reached their opponent, 9663 virtual hits (24.2% of those reached).

## Melee bench: F15

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 388 over 6 battles (64.7 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 89.0 | 127 / 210 | 1.99 | 19.5% | 31504 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 19.5% | 127 |
| emp.Yngwie 1.11 | 2.8 | 13.1% | 44 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.3% | 12 |
| mld.DustBunny 3.8 | 3.2 | 12.4% | 7 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.3% | 9 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.3% | 10 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.4% | 0 |
| lambdaxy.TBot 0.1 | 7.5 | 6.9% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.7% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.8 | 22 / 35 | 5276 |
| 2 | 1 | 69.3 | 89.2 | 19 / 35 | 5223 |
| 3 | 1 | 68.7 | 87.9 | 21 / 35 | 4865 |
| 4 | 1 | 68.4 | 84.1 | 21 / 35 | 5237 |
| 5 | 1 | 70.7 | 91.7 | 23 / 35 | 5541 |
| 6 | 1 | 70.2 | 90.5 | 21 / 35 | 5362 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 59 | 54% |
| kawigi.micro.Shiz 1.1 | 43 | 98% |
| mld.DustBunny 3.8 | 25 | 88% |
| kawigi.robot.Girl 1.2 | 20 | 90% |
| cb.nano.Insomnia 1.0 | 12 | 83% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |
| divineomega.TrialBot 0.003 | 2 | 50% |

Hadur died in 85 of 210 rounds, at a mean tick of 1013. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 41 | 48% | 84 |
| cb.nano.Insomnia 1.0 | 13 | 15% | 15 |
| mld.DustBunny 3.8 | 10 | 12% | 34 |
| kawigi.micro.Shiz 1.1 | 7 | 8% | 41 |
| kawigi.robot.Girl 1.2 | 7 | 8% | 17 |
| divineomega.TrialBot 0.003 | 3 | 4% | 12 |
| lambdaxy.TBot 0.1 | 2 | 2% | 4 |
| Grystrion.TrackerWO 1.0 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 168870 melee ticks, 51606 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 50 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 2.

Targeting waves (204 rounds): 54611 sent, 49824 reached their opponent, 8016 virtual hits (16.1% of those reached).

## Melee bench: F16

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 250 over 6 battles (41.7 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.3 | 119 / 210 | 2.06 | 19.6% | 33803 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 19.6% | 119 |
| gh.Griezel 0.5.2 | 2.0 | 16.2% | 47 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.8% | 7 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.2% | 27 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.3% | 6 |
| tvv.nano.Polaris 1.2 | 5.7 | 8.6% | 1 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.5% | 1 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 5.2% | 5 |
| asd.Cthulhu 1.3 | 8.8 | 5.0% | 0 |
| repositorio.NanoStep 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 84.1 | 17 / 35 | 5172 |
| 2 | 1 | 70.7 | 91.1 | 22 / 35 | 5696 |
| 3 | 1 | 71.2 | 92.4 | 22 / 35 | 5699 |
| 4 | 1 | 69.8 | 89.2 | 19 / 35 | 5861 |
| 5 | 1 | 69.7 | 88.6 | 20 / 35 | 5682 |
| 6 | 1 | 68.9 | 84.1 | 19 / 35 | 5693 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 82 | 73% |
| techdude.forest.FlamingForest 1.1 | 30 | 60% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 85% |
| bvh.fnr.Fenrir 0.36l | 9 | 100% |
| divineomega.DivineBot 1.9.4.5 | 7 | 86% |
| stelo.IntrinsicVolatility 1.4 | 5 | 100% |
| tvv.nano.Polaris 1.2 | 3 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 1187. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 37 | 39% | 95 |
| techdude.forest.FlamingForest 1.1 | 18 | 19% | 37 |
| bvh.fnr.Fenrir 0.36l | 13 | 14% | 20 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 12 | 13% | 29 |
| divineomega.DivineBot 1.9.4.5 | 5 | 5% | 14 |
| asd.Cthulhu 1.3 | 4 | 4% | 5 |
| stelo.IntrinsicVolatility 1.4 | 2 | 2% | 5 |
| tvv.nano.Polaris 1.2 | 0 | 0% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 175945 melee ticks, 63650 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 59 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 56549 sent, 51871 reached their opponent, 8825 virtual hits (17.0% of those reached).

## Melee bench: F17

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 599 over 6 battles (99.8 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 89.2 | 122 / 210 | 1.98 | 20.1% | 36123 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 20.1% | 122 |
| et.Predator 1.8 | 2.5 | 12.8% | 19 |
| oog.melee.Mercutio 1.0 | 2.8 | 12.9% | 30 |
| cx.BlestPain 1.41 | 3.7 | 12.3% | 34 |
| ahf.NanoAndrew .4 | 5.3 | 10.3% | 2 |
| maribo.melee.BMV 0.1 | 6.3 | 8.8% | 3 |
| nic.Nicator 2.4 | 6.3 | 8.8% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.2 | 6.0% | 0 |
| tex.Longbot 0.4 | 8.8 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.5 | 22 / 35 | 5922 |
| 2 | 1 | 70.0 | 88.6 | 18 / 35 | 5949 |
| 3 | 1 | 71.4 | 90.5 | 23 / 35 | 6373 |
| 4 | 1 | 69.9 | 87.6 | 18 / 35 | 5922 |
| 5 | 1 | 69.0 | 85.7 | 18 / 35 | 5738 |
| 6 | 1 | 71.4 | 92.1 | 23 / 35 | 6219 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 56 | 77% |
| et.Predator 1.8 | 50 | 78% |
| cx.BlestPain 1.41 | 36 | 39% |
| ahf.NanoAndrew .4 | 12 | 92% |
| nic.Nicator 2.4 | 6 | 100% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 4 | 100% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 1141. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 35 | 36% | 54 |
| oog.melee.Mercutio 1.0 | 22 | 23% | 58 |
| et.Predator 1.8 | 15 | 16% | 49 |
| ahf.NanoAndrew .4 | 8 | 8% | 18 |
| maribo.melee.BMV 0.1 | 6 | 6% | 9 |
| tex.Longbot 0.4 | 3 | 3% | 4 |
| nic.Nicator 2.4 | 1 | 1% | 10 |
| goblin.Bender 2.4 | 1 | 1% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 5 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 162263 melee ticks, 72013 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 48 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 54482 sent, 49581 reached their opponent, 10525 virtual hits (21.2% of those reached).

## Melee bench: F18

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 323 over 6 battles (53.8 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 91.3 | 131 / 210 | 1.79 | 19.8% | 30309 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 19.8% | 131 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.5% | 25 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.5% | 20 |
| uji.DBH 1.1 | 3.8 | 12.0% | 15 |
| spinnercat.Robovirus 2.718 | 5.7 | 8.9% | 7 |
| sigterm.Sigterm 1.0 | 6.0 | 8.9% | 10 |
| kawigi.mini.Fhqwhgads 1.1 | 7.2 | 7.5% | 1 |
| ratosh.Nobo 0.21 | 7.2 | 7.6% | 1 |
| stelo.WangRobot 1.0 | 9.2 | 5.1% | 0 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 95.2 | 25 / 35 | 5535 |
| 2 | 1 | 69.4 | 90.2 | 19 / 35 | 5102 |
| 3 | 1 | 68.8 | 88.9 | 20 / 35 | 4851 |
| 4 | 1 | 70.4 | 94.0 | 23 / 35 | 5150 |
| 5 | 1 | 69.3 | 89.2 | 24 / 35 | 4853 |
| 6 | 1 | 69.0 | 90.2 | 20 / 35 | 4818 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 59 | 80% |
| uji.DBH 1.1 | 39 | 79% |
| agd.Mooserwirt2 2.7 | 35 | 83% |
| sigterm.Sigterm 1.0 | 12 | 83% |
| spinnercat.Robovirus 2.718 | 12 | 58% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 80% |
| stelo.WangRobot 1.0 | 2 | 100% |
| ratosh.Nobo 0.21 | 1 | 0% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 23 | 28% | 76 |
| agd.Mooserwirt2 2.7 | 16 | 20% | 40 |
| uji.DBH 1.1 | 14 | 17% | 33 |
| sigterm.Sigterm 1.0 | 11 | 14% | 19 |
| spinnercat.Robovirus 2.718 | 10 | 12% | 18 |
| ratosh.Nobo 0.21 | 5 | 6% | 10 |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 1% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 4 |
| stelo.WangRobot 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 139798 melee ticks, 46073 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 95 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 95 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 3.

Targeting waves (200 rounds): 46470 sent, 41693 reached their opponent, 8964 virtual hits (21.5% of those reached).

## Melee bench: F19

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 363 over 6 battles (60.5 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.5 | 98.0 | 197 / 210 | 1.18 | 22.5% | 37179 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 22.5% | 197 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.4% | 4 |
| mld.Infinity 2.2 | 3.8 | 11.3% | 4 |
| erdnis.Rover 0.3 | 4.0 | 11.3% | 2 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.2% | 1 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.4% | 0 |
| mbh.Mbh 0.1 | 7.3 | 7.3% | 0 |
| pac.ABC 2.1 | 7.8 | 6.8% | 2 |
| pbg.R2D2 1.0 | 8.8 | 5.7% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 99.7 | 34 / 35 | 6344 |
| 2 | 1 | 73.3 | 98.4 | 33 / 35 | 5881 |
| 3 | 1 | 73.8 | 99.4 | 34 / 35 | 6109 |
| 4 | 1 | 73.7 | 99.7 | 34 / 35 | 6133 |
| 5 | 1 | 73.1 | 95.2 | 31 / 35 | 6369 |
| 6 | 1 | 73.3 | 95.9 | 31 / 35 | 6343 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 115 | 99% |
| krillr.mini.JointStrike 2.0.0 | 24 | 96% |
| mld.Infinity 2.2 | 22 | 100% |
| erdnis.Rover 0.3 | 21 | 95% |
| pac.ABC 2.1 | 11 | 91% |
| patson.PatsonTestBot 1.0 | 4 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 15 of 210 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 6 | 40% | 70 |
| erdnis.Rover 0.3 | 4 | 27% | 29 |
| krillr.mini.JointStrike 2.0.0 | 1 | 7% | 36 |
| patson.PatsonTestBot 1.0 | 1 | 7% | 12 |
| pac.ABC 2.1 | 1 | 7% | 6 |
| mld.Infinity 2.2 | 0 | 0% | 22 |
| pbg.R2D2 1.0 | 0 | 0% | 17 |
| mbh.Mbh 0.1 | 0 | 0% | 13 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 132192 melee ticks, 46455 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 32 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 43874 sent, 39171 reached their opponent, 9069 virtual hits (23.2% of those reached).

## Melee bench: F20

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 438 over 6 battles (73.0 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 94.0 | 154 / 210 | 1.54 | 21.5% | 37018 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 21.5% | 154 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.7% | 35 |
| fwb.Nine 1.0.1 | 3.7 | 10.9% | 4 |
| catcat20.Rabbit 0.001 | 4.2 | 10.6% | 11 |
| nz.jdc.nano.GridFu 1.0 | 4.5 | 10.0% | 4 |
| m3thos.mini.Eva01 0.5.5 | 5.7 | 8.4% | 1 |
| bayen.nut.Squirrel 1.615 | 7.2 | 6.7% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 6.4% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 93.7 | 22 / 35 | 5880 |
| 2 | 1 | 73.1 | 96.5 | 30 / 35 | 6559 |
| 3 | 1 | 72.6 | 94.6 | 27 / 35 | 6767 |
| 4 | 1 | 70.0 | 88.3 | 22 / 35 | 5682 |
| 5 | 1 | 72.8 | 96.5 | 28 / 35 | 6171 |
| 6 | 1 | 71.8 | 94.6 | 25 / 35 | 5959 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 94 | 79% |
| fwb.Nine 1.0.1 | 39 | 97% |
| catcat20.Rabbit 0.001 | 29 | 83% |
| nz.jdc.nano.GridFu 1.0 | 9 | 89% |
| m3thos.mini.Eva01 0.5.5 | 8 | 88% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| bayen.nut.Squirrel 1.615 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 1054. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 34 | 58% | 101 |
| catcat20.Rabbit 0.001 | 11 | 19% | 42 |
| fwb.Nine 1.0.1 | 5 | 8% | 30 |
| nz.jdc.nano.GridFu 1.0 | 4 | 7% | 17 |
| m3thos.mini.Eva01 0.5.5 | 2 | 3% | 9 |
| bayen.nut.Squirrel 1.615 | 0 | 0% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 165260 melee ticks, 59649 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 41 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 51866 sent, 46928 reached their opponent, 10673 virtual hits (22.7% of those reached).

## Melee bench: F21

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 531 over 6 battles (88.5 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 92.5 | 138 / 210 | 1.67 | 20.4% | 33683 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 20.4% | 138 |
| eem.EvBot v4.6.16 | 2.0 | 15.8% | 53 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.8% | 10 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.8% | 0 |
| eld.Hmm 1.0 | 5.2 | 8.3% | 9 |
| oa.weak.BotherBot 0.1 | 6.3 | 7.3% | 0 |
| fire219.CatBot 1.0 | 7.2 | 6.4% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.0% | 0 |
| PSW.Relentless 0.1 | 8.3 | 5.9% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 91.4 | 28 / 35 | 5584 |
| 2 | 1 | 71.9 | 93.7 | 25 / 35 | 6081 |
| 3 | 1 | 69.4 | 90.2 | 20 / 35 | 5206 |
| 4 | 1 | 72.0 | 96.8 | 26 / 35 | 5766 |
| 5 | 1 | 69.9 | 90.2 | 19 / 35 | 5517 |
| 6 | 1 | 70.6 | 93.0 | 20 / 35 | 5529 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 106 | 64% |
| dummy.mini.Scimitar 1.01 | 35 | 86% |
| cf.RiO.RiOx 4.2.1 | 26 | 100% |
| eld.Hmm 1.0 | 18 | 67% |
| oa.weak.BotherBot 0.1 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 1228. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 41 | 54% | 99 |
| dummy.mini.Scimitar 1.01 | 13 | 17% | 42 |
| eld.Hmm 1.0 | 7 | 9% | 28 |
| PSW.Relentless 0.1 | 4 | 5% | 4 |
| cf.RiO.RiOx 4.2.1 | 3 | 4% | 26 |
| el.JumpShoot 0.2 | 3 | 4% | 4 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 5 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 178419 melee ticks, 77365 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 101 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 101 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 52812 sent, 48042 reached their opponent, 8032 virtual hits (16.7% of those reached).

## Melee bench: F22

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 223 over 6 battles (37.2 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 89.3 | 105 / 210 | 1.96 | 18.7% | 29443 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.2 | 18.7% | 105 |
| pe.SandboxDT 2.71m | 1.8 | 16.4% | 55 |
| kvk.HebusLeTroll 0.35 | 3.3 | 13.4% | 21 |
| jlm.javaDisturbance 0.59 | 3.7 | 13.2% | 21 |
| bigpete.Stewie 1.0 | 5.0 | 10.9% | 3 |
| yk.JahRoslav 1.1 | 6.5 | 7.0% | 4 |
| tad.Dalek98 0.98 | 6.8 | 6.7% | 1 |
| gg.Squaraus 0.6 | 7.7 | 6.4% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.9% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 84.1 | 11 / 35 | 4794 |
| 2 | 1 | 69.9 | 90.2 | 18 / 35 | 5157 |
| 3 | 1 | 69.5 | 89.8 | 18 / 35 | 5054 |
| 4 | 1 | 69.3 | 90.8 | 19 / 35 | 4612 |
| 5 | 1 | 69.5 | 91.7 | 19 / 35 | 4807 |
| 6 | 1 | 69.5 | 89.2 | 20 / 35 | 5019 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 61 | 56% |
| jlm.javaDisturbance 0.59 | 48 | 71% |
| kvk.HebusLeTroll 0.35 | 34 | 74% |
| bigpete.Stewie 1.0 | 9 | 100% |
| pbg.NinjaX 1.2 | 3 | 67% |
| tad.Dalek98 0.98 | 2 | 50% |
| yk.JahRoslav 1.1 | 1 | 0% |

Hadur died in 106 of 210 rounds, at a mean tick of 1025. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 41 | 39% | 82 |
| jlm.javaDisturbance 0.59 | 27 | 25% | 55 |
| kvk.HebusLeTroll 0.35 | 26 | 25% | 45 |
| bigpete.Stewie 1.0 | 4 | 4% | 12 |
| tad.Dalek98 0.98 | 3 | 3% | 8 |
| yk.JahRoslav 1.1 | 2 | 2% | 3 |
| pbg.NinjaX 1.2 | 1 | 1% | 4 |
| gg.Squaraus 0.6 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 164694 melee ticks, 50687 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 105 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 105 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 52102 sent, 47345 reached their opponent, 7189 virtual hits (15.2% of those reached).

## Melee bench: F23

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 290 over 6 battles (48.3 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 95.7 | 170 / 210 | 1.39 | 21.9% | 37544 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 21.9% | 170 |
| pe.SandboxLump 1.52 | 2.0 | 16.3% | 26 |
| cre.Karolos 0.32 | 3.0 | 13.8% | 7 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.2% | 2 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 9.2% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 8.8% | 0 |
| cw.megas.Blade 0.8 | 6.7 | 8.1% | 0 |
| sample.Walls 1.0 | 7.8 | 7.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 2.5% | 0 |
| rrh.Iwillfindyou 2.0 | 9.7 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 95.6 | 29 / 35 | 6684 |
| 2 | 1 | 72.7 | 95.2 | 28 / 35 | 5878 |
| 3 | 1 | 72.6 | 95.6 | 28 / 35 | 5713 |
| 4 | 1 | 74.1 | 96.8 | 28 / 35 | 6807 |
| 5 | 1 | 73.4 | 96.2 | 28 / 35 | 6186 |
| 6 | 1 | 73.0 | 94.6 | 29 / 35 | 6276 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 100 | 81% |
| cre.Karolos 0.32 | 57 | 96% |
| stelo.AreaTargetingBot 1.1 | 10 | 100% |
| stelo.RamTrackSurfer 1.2 | 10 | 100% |
| sample.Walls 1.0 | 7 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 28 | 65% | 100 |
| cre.Karolos 0.32 | 6 | 14% | 55 |
| stelo.AreaTargetingBot 1.1 | 3 | 7% | 13 |
| stelo.RamTrackSurfer 1.2 | 2 | 5% | 16 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 2% | 10 |
| cw.megas.Blade 0.8 | 1 | 2% | 6 |
| sample.Walls 1.0 | 0 | 0% | 6 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 127523 melee ticks, 47053 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 71 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 40088 sent, 35314 reached their opponent, 10470 virtual hits (29.6% of those reached).

## Melee bench: F24

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 448 over 6 battles (74.7 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 85.5 | 98 / 210 | 2.30 | 17.6% | 24823 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 17.6% | 98 |
| rz.GlowBlowMelee 1.4 | 2.5 | 14.2% | 38 |
| florent.XSeries.X2 0.12 | 3.0 | 13.2% | 26 |
| davidalves.Phoenix 0.54 | 3.7 | 12.7% | 33 |
| pedersen.Ugluk 1.1.1 | 4.8 | 10.8% | 7 |
| oog.melee.Corsair 1.0 | 6.0 | 9.9% | 6 |
| stelo.SoJNanoMelee 1.1 | 7.5 | 6.3% | 1 |
| lunchie.Lunchbox 0.93 | 7.7 | 6.0% | 1 |
| as.FrankTheTank 1.3 | 9.0 | 5.1% | 0 |
| evd.X1 0.01 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 81.0 | 14 / 35 | 3964 |
| 2 | 1 | 67.6 | 88.3 | 17 / 35 | 4286 |
| 3 | 1 | 66.2 | 81.9 | 16 / 35 | 4159 |
| 4 | 1 | 67.8 | 87.6 | 18 / 35 | 4037 |
| 5 | 1 | 67.5 | 86.7 | 17 / 35 | 4265 |
| 6 | 1 | 67.4 | 87.6 | 16 / 35 | 4112 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 43 | 60% |
| davidalves.Phoenix 0.54 | 35 | 57% |
| florent.XSeries.X2 0.12 | 28 | 50% |
| pedersen.Ugluk 1.1.1 | 19 | 84% |
| oog.melee.Corsair 1.0 | 17 | 76% |
| as.FrankTheTank 1.3 | 3 | 100% |
| stelo.SoJNanoMelee 1.1 | 3 | 100% |
| lunchie.Lunchbox 0.93 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 30 | 26% | 61 |
| florent.XSeries.X2 0.12 | 26 | 23% | 46 |
| davidalves.Phoenix 0.54 | 24 | 21% | 38 |
| pedersen.Ugluk 1.1.1 | 13 | 11% | 25 |
| oog.melee.Corsair 1.0 | 10 | 9% | 24 |
| lunchie.Lunchbox 0.93 | 5 | 4% | 6 |
| evd.X1 0.01 | 4 | 3% | 4 |
| stelo.SoJNanoMelee 1.1 | 0 | 0% | 3 |
| as.FrankTheTank 1.3 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 141088 melee ticks, 43464 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 65 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 46590 sent, 41462 reached their opponent, 7469 virtual hits (18.0% of those reached).

## Melee bench: F25

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 333 over 6 battles (55.5 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 90.2 | 144 / 210 | 1.89 | 19.1% | 24087 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 19.1% | 144 |
| voidious.mini.BrokenSword 2.0.3 | 2.0 | 13.8% | 27 |
| jdw.Hurricane 1.4 | 3.5 | 11.9% | 19 |
| voidious.micro.BlitzBat 1.05 | 3.5 | 12.1% | 8 |
| gre.svman4.Morfeas 1.4.1 | 5.7 | 8.7% | 3 |
| ds.Oo 2.2 | 5.7 | 8.7% | 6 |
| adt.Ar2 1.1 | 7.7 | 7.4% | 0 |
| awesomeness.Elite 1.0 | 7.8 | 7.4% | 1 |
| gjr.Cephalosporin 0.1 | 8.2 | 6.9% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 86.0 | 19 / 35 | 3979 |
| 2 | 1 | 66.9 | 85.7 | 21 / 35 | 3779 |
| 3 | 1 | 69.3 | 91.1 | 24 / 35 | 4382 |
| 4 | 1 | 70.7 | 94.9 | 31 / 35 | 4278 |
| 5 | 1 | 68.4 | 90.2 | 23 / 35 | 3746 |
| 6 | 1 | 69.4 | 93.0 | 26 / 35 | 3923 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 65 | 83% |
| voidious.micro.BlitzBat 1.05 | 42 | 93% |
| jdw.Hurricane 1.4 | 30 | 73% |
| ds.Oo 2.2 | 13 | 85% |
| gre.svman4.Morfeas 1.4.1 | 6 | 67% |
| adt.Ar2 1.1 | 5 | 100% |
| awesomeness.Elite 1.0 | 5 | 100% |
| gjr.Cephalosporin 0.1 | 3 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 19 | 28% | 39 |
| voidious.mini.BrokenSword 2.0.3 | 16 | 24% | 58 |
| voidious.micro.BlitzBat 1.05 | 8 | 12% | 32 |
| adt.Ar2 1.1 | 7 | 10% | 13 |
| gre.svman4.Morfeas 1.4.1 | 5 | 7% | 15 |
| awesomeness.Elite 1.0 | 4 | 6% | 15 |
| ds.Oo 2.2 | 3 | 4% | 25 |
| gjr.Cephalosporin 0.1 | 3 | 4% | 9 |
| amk.ChumbaMini 0.2 | 1 | 1% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 128588 melee ticks, 36296 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 38 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45467 sent, 40644 reached their opponent, 6576 virtual hits (16.2% of those reached).

## Melee bench: F26

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 573 over 6 battles (95.5 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 92.1 | 148 / 210 | 1.71 | 21.0% | 38980 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 21.0% | 148 |
| ak.Fermat 2.0 | 2.3 | 14.7% | 32 |
| lrem.Spectre 0.4.4 | 3.3 | 12.3% | 8 |
| shu.nitro.LENIN .T34 | 3.7 | 12.3% | 13 |
| js.PinBall 1.6 | 5.0 | 10.6% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 5.8 | 9.2% | 5 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 7.8% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.7% | 0 |
| sample.SpinBot 1.0 | 9.0 | 4.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 94.9 | 27 / 35 | 6818 |
| 2 | 1 | 71.9 | 91.1 | 25 / 35 | 6595 |
| 3 | 1 | 73.2 | 95.6 | 29 / 35 | 6662 |
| 4 | 1 | 70.3 | 87.9 | 19 / 35 | 6069 |
| 5 | 1 | 72.7 | 94.0 | 27 / 35 | 6742 |
| 6 | 1 | 70.8 | 88.9 | 21 / 35 | 6094 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 56 | 73% |
| shu.nitro.LENIN .T34 | 50 | 92% |
| lrem.Spectre 0.4.4 | 39 | 92% |
| jaybot.adv.bots.JayBot 2.0 | 10 | 80% |
| js.PinBall 1.6 | 10 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 100% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 26 | 38% | 64 |
| shu.nitro.LENIN .T34 | 12 | 18% | 63 |
| lrem.Spectre 0.4.4 | 9 | 13% | 42 |
| jaybot.adv.bots.JayBot 2.0 | 9 | 13% | 14 |
| js.PinBall 1.6 | 6 | 9% | 18 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 6 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 160720 melee ticks, 51319 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 26 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 52334 sent, 47404 reached their opponent, 11861 virtual hits (25.0% of those reached).

## Melee bench: F27

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 510 over 6 battles (85.0 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.1 | 171 / 210 | 1.62 | 20.9% | 32986 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 20.9% | 171 |
| mk.Alpha 0.2.1 | 2.2 | 13.9% | 20 |
| EH.Eagle 1.0.6 | 2.8 | 11.1% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 5.3 | 9.0% | 0 |
| sheldor.melee.nano.TestMelee 0.1 | 5.3 | 9.1% | 7 |
| wee.Gem 1.8.4 | 5.8 | 8.8% | 7 |
| throxbot.ThroxBot 0.1 | 7.2 | 7.5% | 3 |
| joe.ADinosaur 1.0 | 7.7 | 8.0% | 0 |
| caimano.Furia_Ceca 0.22 | 8.2 | 7.0% | 1 |
| cs.Grudge 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 96.2 | 31 / 35 | 5771 |
| 2 | 1 | 70.9 | 94.9 | 30 / 35 | 5135 |
| 3 | 1 | 69.0 | 84.1 | 24 / 35 | 5240 |
| 4 | 1 | 71.6 | 95.2 | 28 / 35 | 5634 |
| 5 | 1 | 71.8 | 95.6 | 31 / 35 | 5627 |
| 6 | 1 | 70.8 | 92.4 | 27 / 35 | 5579 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 105 | 94% |
| EH.Eagle 1.0.6 | 35 | 97% |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 85% |
| throxbot.ThroxBot 0.1 | 8 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 100% |
| wee.Gem 1.8.4 | 5 | 100% |
| joe.ADinosaur 1.0 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |

Hadur died in 45 of 210 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 11 | 24% | 97 |
| joe.ADinosaur 1.0 | 6 | 13% | 13 |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 11% | 15 |
| EH.Eagle 1.0.6 | 4 | 9% | 40 |
| wee.Gem 1.8.4 | 4 | 9% | 11 |
| throxbot.ThroxBot 0.1 | 4 | 9% | 9 |
| cs.Grudge 1.0 | 4 | 9% | 4 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 15 |
| caimano.Furia_Ceca 0.22 | 1 | 2% | 5 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 130604 melee ticks, 46545 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 40 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 43259 sent, 38381 reached their opponent, 9487 virtual hits (24.7% of those reached).

## Melee bench: F28

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 422 over 6 battles (70.3 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 90.8 | 139 / 210 | 1.83 | 18.9% | 24393 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 18.9% | 139 |
| kid.test.NightFox .2 | 2.2 | 14.1% | 22 |
| uji.Antique 1.0 | 3.0 | 12.7% | 26 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.2% | 9 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.3% | 6 |
| amk.ChumbaWumba 0.3 | 6.7 | 7.6% | 1 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.0% | 3 |
| matt.advanced.Katana 1.0 | 8.5 | 6.2% | 1 |
| stelo.Lifestealer 1.0 | 8.8 | 6.3% | 2 |
| stelo.PianistNano 1.2 | 9.3 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 91.4 | 22 / 35 | 4060 |
| 2 | 1 | 68.5 | 91.4 | 24 / 35 | 3998 |
| 3 | 1 | 68.8 | 91.4 | 26 / 35 | 4133 |
| 4 | 1 | 68.1 | 89.5 | 24 / 35 | 3840 |
| 5 | 1 | 67.9 | 89.8 | 19 / 35 | 4227 |
| 6 | 1 | 68.6 | 91.1 | 24 / 35 | 4135 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 67 | 82% |
| uji.Antique 1.0 | 56 | 89% |
| qohnil.blot.BlotBot 3.61 | 12 | 67% |
| amk.ChumbaWumba 0.3 | 9 | 100% |
| ahr.ice.Ice 1.0.2 | 8 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 71% |
| matt.advanced.Katana 1.0 | 4 | 75% |
| stelo.PianistNano 1.2 | 2 | 50% |
| stelo.Lifestealer 1.0 | 1 | 0% |

Hadur died in 76 of 210 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 21 | 28% | 66 |
| kid.test.NightFox .2 | 13 | 17% | 43 |
| pfvicm.Sobieski 7.2.3b | 12 | 16% | 19 |
| qohnil.blot.BlotBot 3.61 | 11 | 14% | 30 |
| amk.ChumbaWumba 0.3 | 8 | 11% | 17 |
| stelo.Lifestealer 1.0 | 3 | 4% | 5 |
| ahr.ice.Ice 1.0.2 | 2 | 3% | 17 |
| stelo.PianistNano 1.2 | 2 | 3% | 4 |
| matt.advanced.Katana 1.0 | 1 | 1% | 6 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 133105 melee ticks, 37872 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 98 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 98 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 44808 sent, 39834 reached their opponent, 5736 virtual hits (14.4% of those reached).

## Melee bench: F29

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 769 over 6 battles (128.2 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.5 | 111 / 210 | 2.04 | 19.2% | 29130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 19.2% | 111 |
| deewiant.Anomaly 0.2 | 2.5 | 14.8% | 46 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 14.6% | 37 |
| myl.micro.Troodon 1.10 | 3.8 | 12.2% | 7 |
| jok.PheonixM 0.1.2 | 5.0 | 10.4% | 7 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.5% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 7.5 | 5.5% | 0 |
| DBall.Anarchy 0.1 | 7.8 | 5.8% | 2 |
| ap.Frederick 1.1 | 8.8 | 5.0% | 1 |
| jangs.ns51 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.9 | 17 / 35 | 4824 |
| 2 | 1 | 68.7 | 87.6 | 18 / 35 | 4343 |
| 3 | 1 | 67.5 | 83.2 | 13 / 35 | 4451 |
| 4 | 1 | 70.6 | 92.7 | 21 / 35 | 5081 |
| 5 | 1 | 70.8 | 90.2 | 20 / 35 | 5293 |
| 6 | 1 | 70.3 | 89.2 | 22 / 35 | 5138 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 72 | 56% |
| zyx.mega.YersiniaPestis 3.1 | 47 | 70% |
| myl.micro.Troodon 1.10 | 20 | 95% |
| jok.PheonixM 0.1.2 | 14 | 100% |
| ap.Frederick 1.1 | 2 | 50% |
| jangs.ns51 1.0 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 1069. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 47 | 44% | 83 |
| zyx.mega.YersiniaPestis 3.1 | 32 | 30% | 68 |
| jok.PheonixM 0.1.2 | 7 | 7% | 26 |
| fullsail.TimbotNoPrediction 1.0 | 5 | 5% | 6 |
| myl.micro.Troodon 1.10 | 4 | 4% | 19 |
| jangs.ns51 1.0 | 3 | 3% | 3 |
| ap.Frederick 1.1 | 1 | 1% | 0 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 3 |
| DBall.Anarchy 0.1 | 0 | 0% | 2 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 171833 melee ticks, 57652 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 40 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 55174 sent, 50350 reached their opponent, 7787 virtual hits (15.5% of those reached).

## Melee bench: F30

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 654 over 6 battles (109.0 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 78.3 | 55 / 210 | 2.96 | 15.6% | 23595 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 15.6% | 55 |
| catcat20.Matcha 0.006 | 2.8 | 13.5% | 47 |
| darkcanuck.B26354 1.06 | 3.2 | 13.1% | 43 |
| oog.melee.Capulet 1.2 | 4.0 | 12.3% | 24 |
| stelo.PastFuture 2.3.2 | 4.0 | 12.3% | 19 |
| intruder.PrairieWolf 2.61 | 6.2 | 9.3% | 13 |
| tripphippy.Alice 1.1 | 7.7 | 7.6% | 7 |
| ntc.Opposite 1.5 | 8.0 | 7.3% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 6.5% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 81.0 | 9 / 35 | 3866 |
| 2 | 1 | 62.8 | 75.6 | 12 / 35 | 3543 |
| 3 | 1 | 63.7 | 77.1 | 6 / 35 | 4192 |
| 4 | 1 | 65.5 | 81.9 | 13 / 35 | 4242 |
| 5 | 1 | 63.1 | 76.5 | 8 / 35 | 3852 |
| 6 | 1 | 63.6 | 77.5 | 7 / 35 | 3900 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 33 | 45% |
| catcat20.Matcha 0.006 | 29 | 31% |
| oog.melee.Capulet 1.2 | 24 | 54% |
| stelo.PastFuture 2.3.2 | 14 | 57% |
| intruder.PrairieWolf 2.61 | 5 | 80% |
| tripphippy.Alice 1.1 | 4 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 67% |

Hadur died in 160 of 210 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 41 | 26% | 53 |
| darkcanuck.B26354 1.06 | 31 | 19% | 42 |
| stelo.PastFuture 2.3.2 | 31 | 19% | 41 |
| oog.melee.Capulet 1.2 | 26 | 16% | 43 |
| tripphippy.Alice 1.1 | 11 | 7% | 11 |
| intruder.PrairieWolf 2.61 | 7 | 4% | 7 |
| fowl3628800.LightningBolt 2.6.0 | 4 | 3% | 7 |
| ntc.Opposite 1.5 | 4 | 3% | 6 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 159768 melee ticks, 32101 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 63 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 2.

Targeting waves (206 rounds): 51496 sent, 46450 reached their opponent, 7993 virtual hits (17.2% of those reached).

## Melee bench: F31

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 675 over 6 battles (112.5 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 82.1 | 75 / 210 | 2.61 | 16.7% | 23239 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 18.0% | 89 |
| hadur117.Hadur 3.20la | 1.8 | 16.7% | 75 |
| gh.mini.Griezel 0.2 | 3.2 | 13.2% | 37 |
| d414.nano.Quantum 1.0.0 | 4.0 | 11.4% | 2 |
| spinnercat.micro.Tyger 0.1 | 5.0 | 10.7% | 4 |
| gh.nano.Grofvuil 0.2 | 5.8 | 8.6% | 3 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.6% | 0 |
| fm.mammillarias 1.3 | 8.0 | 5.4% | 0 |
| tlp.ThreeLeggedPig 1 | 9.2 | 4.9% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.5 | 86.7 | 16 / 35 | 3898 |
| 2 | 2 | 63.8 | 76.2 | 10 / 35 | 3704 |
| 3 | 2 | 66.1 | 81.9 | 14 / 35 | 3758 |
| 4 | 1 | 68.3 | 88.6 | 18 / 35 | 4373 |
| 5 | 2 | 65.4 | 81.6 | 9 / 35 | 3980 |
| 6 | 2 | 64.1 | 77.8 | 8 / 35 | 3526 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 52 | 44% |
| gh.mini.Griezel 0.2 | 38 | 55% |
| d414.nano.Quantum 1.0.0 | 14 | 93% |
| spinnercat.micro.Tyger 0.1 | 9 | 89% |
| gh.nano.Grofvuil 0.2 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 67% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 63 | 45% | 86 |
| gh.mini.Griezel 0.2 | 40 | 28% | 65 |
| spinnercat.micro.Tyger 0.1 | 12 | 9% | 16 |
| d414.nano.Quantum 1.0.0 | 7 | 5% | 17 |
| gh.nano.Grofvuil 0.2 | 7 | 5% | 15 |
| timmit.nano.TimDog 0.33 | 4 | 3% | 6 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 160675 melee ticks, 38836 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 40 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 51508 sent, 46426 reached their opponent, 7452 virtual hits (16.1% of those reached).

## Melee bench: F32

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 791 over 6 battles (131.8 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 88.6 | 119 / 210 | 2.02 | 18.5% | 27721 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 18.5% | 119 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.4% | 54 |
| apc.botM 3.0 | 3.0 | 11.9% | 19 |
| lxx.ConceptA 0.8 | 4.2 | 9.7% | 0 |
| vjik.UnViolation 1.1 | 5.0 | 9.2% | 8 |
| bayen.UbaMicro 1.4 | 6.2 | 8.5% | 3 |
| panzer.Panzer 0.2 | 7.5 | 7.5% | 0 |
| yk.JahMicro 1.0 | 7.5 | 7.5% | 7 |
| conscience.Electron 1.3g | 8.7 | 6.6% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 88.3 | 23 / 35 | 4566 |
| 2 | 1 | 69.9 | 94.6 | 22 / 35 | 5116 |
| 3 | 1 | 66.9 | 87.0 | 16 / 35 | 4426 |
| 4 | 1 | 66.4 | 85.1 | 20 / 35 | 4141 |
| 5 | 1 | 67.6 | 87.9 | 19 / 35 | 4595 |
| 6 | 1 | 68.0 | 88.9 | 19 / 35 | 4877 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 102 | 66% |
| apc.botM 3.0 | 34 | 68% |
| vjik.UnViolation 1.1 | 10 | 80% |
| yk.JahMicro 1.0 | 8 | 38% |
| lxx.ConceptA 0.8 | 5 | 100% |
| panzer.Panzer 0.2 | 5 | 100% |
| donjezza.Jezza 1.0 | 4 | 100% |
| bayen.UbaMicro 1.4 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 37 | 38% | 87 |
| apc.botM 3.0 | 14 | 14% | 44 |
| lxx.ConceptA 0.8 | 13 | 13% | 24 |
| yk.JahMicro 1.0 | 7 | 7% | 12 |
| bayen.UbaMicro 1.4 | 7 | 7% | 11 |
| vjik.UnViolation 1.1 | 5 | 5% | 21 |
| panzer.Panzer 0.2 | 4 | 4% | 4 |
| conscience.Electron 1.3g | 4 | 4% | 4 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 123875 melee ticks, 60056 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 102 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 102 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 3.

Targeting waves (204 rounds): 42390 sent, 37511 reached their opponent, 6642 virtual hits (17.7% of those reached).

## Melee bench: F33

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 646 over 6 battles (107.7 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.2 | 115 / 210 | 2.06 | 19.2% | 29880 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 19.2% | 115 |
| maribo.Quester 0.3 | 2.2 | 15.6% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.7% | 17 |
| gre.svman4.Leonidas 1.3.2 | 3.8 | 11.9% | 21 |
| labg.Cataclysm 2.05 | 4.8 | 10.7% | 17 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.4% | 5 |
| baal.nano.N 1.42 | 6.7 | 8.5% | 0 |
| zyx.micro.Ant 1.1 | 8.0 | 5.4% | 0 |
| sanja.First 0.1 | 9.0 | 4.5% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 91.7 | 22 / 35 | 5701 |
| 2 | 1 | 68.6 | 85.7 | 19 / 35 | 4856 |
| 3 | 1 | 69.1 | 87.6 | 19 / 35 | 4787 |
| 4 | 1 | 70.4 | 91.7 | 22 / 35 | 5049 |
| 5 | 1 | 69.2 | 86.0 | 16 / 35 | 5115 |
| 6 | 1 | 68.3 | 86.3 | 17 / 35 | 4372 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 70 | 81% |
| gre.svman4.Leonidas 1.3.2 | 30 | 73% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 66% |
| labg.Cataclysm 2.05 | 14 | 57% |
| baal.nano.N 1.42 | 5 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 75% |

Hadur died in 101 of 210 rounds, at a mean tick of 1054. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 29 | 29% | 81 |
| gre.svman4.Leonidas 1.3.2 | 24 | 24% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 19% | 40 |
| labg.Cataclysm 2.05 | 13 | 13% | 24 |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 8% | 11 |
| baal.nano.N 1.42 | 2 | 2% | 11 |
| zyx.micro.Ant 1.1 | 1 | 1% | 2 |
| sanja.First 0.1 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 175588 melee ticks, 50838 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 63 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 55746 sent, 50789 reached their opponent, 7276 virtual hits (14.3% of those reached).

## Melee bench: F34

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 752 over 6 battles (125.3 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.7 | 100 / 210 | 1.93 | 18.9% | 31235 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 18.9% | 100 |
| stelo.Spread 0.9 | 2.3 | 16.1% | 59 |
| kid.Gladiator .7.2 | 2.7 | 15.6% | 33 |
| jcs.Seth 1.8 | 4.2 | 11.1% | 12 |
| tcf.Reach 3 | 4.8 | 10.7% | 5 |
| cli.Dancer 1.1 | 6.0 | 9.5% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.7% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.5% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 87.0 | 16 / 35 | 5331 |
| 2 | 1 | 68.6 | 87.3 | 12 / 35 | 5063 |
| 3 | 1 | 69.5 | 89.8 | 17 / 35 | 5086 |
| 4 | 1 | 70.0 | 91.4 | 19 / 35 | 5189 |
| 5 | 1 | 69.9 | 91.1 | 16 / 35 | 5165 |
| 6 | 1 | 70.8 | 91.4 | 20 / 35 | 5401 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 71 | 46% |
| kid.Gladiator .7.2 | 60 | 67% |
| jcs.Seth 1.8 | 21 | 62% |
| tcf.Reach 3 | 6 | 83% |
| cli.Dancer 1.1 | 6 | 100% |
| ratosh.Wesco 1.4 | 3 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 1123. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 54 | 46% | 86 |
| kid.Gladiator .7.2 | 40 | 34% | 69 |
| jcs.Seth 1.8 | 9 | 8% | 26 |
| tcf.Reach 3 | 6 | 5% | 14 |
| cli.Dancer 1.1 | 1 | 1% | 8 |
| ratosh.Wesco 1.4 | 1 | 1% | 5 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 174159 melee ticks, 58392 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 359 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 275 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 53678 sent, 48673 reached their opponent, 8103 virtual hits (16.6% of those reached).

## Melee bench: F35

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 730 over 6 battles (121.7 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 83.0 | 46 / 210 | 2.53 | 16.2% | 23100 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.4% | 138 |
| hadur117.Hadur 3.20la | 2.0 | 16.2% | 46 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.7 | 12.3% | 8 |
| gh.mini.Gruwel 0.9 | 3.8 | 12.5% | 13 |
| rz.HawkOnFire 0.1 | 4.5 | 11.5% | 3 |
| wit.Chuliath 1.0 | 6.7 | 6.5% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 5.8% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.7 | 5.7% | 1 |
| dans.Cinnamon 1.2 | 8.7 | 5.3% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 85.7 | 9 / 35 | 3861 |
| 2 | 2 | 65.4 | 81.6 | 7 / 35 | 3939 |
| 3 | 2 | 66.1 | 86.0 | 9 / 35 | 3675 |
| 4 | 2 | 65.5 | 82.5 | 7 / 35 | 4056 |
| 5 | 2 | 64.0 | 78.4 | 7 / 35 | 3806 |
| 6 | 2 | 65.3 | 83.8 | 7 / 35 | 3763 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 95 | 20% |
| dmh.robocode.robot.BlackDeath 9.2 | 16 | 69% |
| gh.mini.Gruwel 0.9 | 14 | 64% |
| rz.HawkOnFire 0.1 | 9 | 67% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 0% |

Hadur died in 170 of 210 rounds, at a mean tick of 957. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 107 | 63% | 126 |
| dmh.robocode.robot.BlackDeath 9.2 | 20 | 12% | 29 |
| rz.HawkOnFire 0.1 | 18 | 11% | 24 |
| gh.mini.Gruwel 0.9 | 14 | 8% | 24 |
| stelo.MyAgileRobot 0.2 | 3 | 2% | 4 |
| wit.Chuliath 1.0 | 1 | 1% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 147442 melee ticks, 53266 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 41 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 46417 sent, 41278 reached their opponent, 6329 virtual hits (15.3% of those reached).

## Melee bench: F36

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 361 over 6 battles (60.2 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 95.8 | 172 / 210 | 1.38 | 21.7% | 33939 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 21.7% | 172 |
| bzdp.Pansy 2.1 | 2.2 | 12.7% | 10 |
| alpha.RainingFire 1.0 | 3.0 | 11.9% | 13 |
| bvh.micro.Freya 0.3 | 4.3 | 10.3% | 6 |
| mz.Cork 0.1 | 5.0 | 10.2% | 5 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.4% | 2 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.1% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.6% | 0 |
| dl.BetterWalls 1.0 | 8.7 | 5.1% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 95.9 | 30 / 35 | 5794 |
| 2 | 1 | 71.6 | 94.9 | 27 / 35 | 5439 |
| 3 | 1 | 72.6 | 96.5 | 29 / 35 | 5751 |
| 4 | 1 | 72.9 | 96.8 | 32 / 35 | 6001 |
| 5 | 1 | 71.1 | 93.0 | 25 / 35 | 5353 |
| 6 | 1 | 72.3 | 97.8 | 29 / 35 | 5601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 61 | 87% |
| mz.Cork 0.1 | 31 | 87% |
| alpha.RainingFire 1.0 | 30 | 87% |
| bvh.micro.Freya 0.3 | 27 | 93% |
| m3thos.Eva02 0.7.1 | 23 | 96% |
| bvh.mini.Fenrir 0.39 | 16 | 100% |
| sample.MyFirstRobot 1.0 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 12 | 30% | 54 |
| alpha.RainingFire 1.0 | 9 | 23% | 38 |
| bvh.mini.Fenrir 0.39 | 6 | 15% | 19 |
| mz.Cork 0.1 | 5 | 13% | 37 |
| bvh.micro.Freya 0.3 | 5 | 13% | 29 |
| m3thos.Eva02 0.7.1 | 1 | 3% | 23 |
| dl.BetterWalls 1.0 | 0 | 0% | 8 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 145682 melee ticks, 53379 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 55 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 50214 sent, 45553 reached their opponent, 9329 virtual hits (20.5% of those reached).

## Melee bench: F37

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 367 over 6 battles (61.2 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.7 | 156 / 210 | 2.20 | 18.9% | 33155 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 18.9% | 156 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.8 | 10.4% | 7 |
| germ.TheMind .2 | 3.2 | 9.9% | 9 |
| EBBU.Sim2 1.02 | 4.5 | 9.7% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 6.3 | 8.9% | 4 |
| lmk.ACPFinal 0.1 | 6.5 | 9.0% | 8 |
| agrach.Dalek 1.0 | 6.5 | 8.9% | 8 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.8% | 10 |
| mb.Beast 0.1 | 7.8 | 8.4% | 5 |
| skm.Ryubot 1.0 | 9.3 | 7.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.0 | 25 / 35 | 5819 |
| 2 | 1 | 66.6 | 84.4 | 24 / 35 | 5249 |
| 3 | 1 | 68.0 | 86.3 | 28 / 35 | 5451 |
| 4 | 1 | 68.7 | 89.8 | 26 / 35 | 5539 |
| 5 | 1 | 67.7 | 85.7 | 26 / 35 | 5477 |
| 6 | 1 | 67.9 | 86.7 | 27 / 35 | 5620 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 26 | 96% |
| stelo.UntouchableNano 1.3 | 26 | 88% |
| mb.Beast 0.1 | 23 | 100% |
| EBBU.Sim2 1.02 | 23 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 18 | 100% |
| agrach.Dalek 1.0 | 18 | 100% |
| lmk.ACPFinal 0.1 | 16 | 94% |
| skm.Ryubot 1.0 | 12 | 92% |

Hadur died in 56 of 210 rounds, at a mean tick of 380. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 17 | 30% | 18 |
| com.syncleus.robocode.Dreadnaught 0.1 | 10 | 18% | 38 |
| mb.Beast 0.1 | 6 | 11% | 22 |
| agrach.Dalek 1.0 | 5 | 9% | 30 |
| germ.TheMind .2 | 5 | 9% | 24 |
| EBBU.Sim2 1.02 | 5 | 9% | 22 |
| lmk.ACPFinal 0.1 | 3 | 5% | 21 |
| stelo.UntouchableNano 1.3 | 2 | 4% | 20 |
| skm.Ryubot 1.0 | 1 | 2% | 10 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 93390 melee ticks, 26445 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 33 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 31948 sent, 27294 reached their opponent, 8210 virtual hits (30.1% of those reached).

## Melee bench: F38

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 228 over 6 battles (38.0 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 87.0 | 110 / 210 | 2.17 | 18.2% | 27526 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 18.2% | 110 |
| justin.Mallais 14.0 | 2.0 | 15.4% | 52 |
| bvh.mini.Freya 0.55 | 3.2 | 12.6% | 12 |
| cs.Wren 1.0 | 4.7 | 10.8% | 7 |
| bts.mega.Gnarly 1.4 | 4.8 | 10.9% | 19 |
| kdf.KoulDestroyer 1.0 | 5.5 | 9.9% | 7 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 8.0% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.8 | 6.5% | 2 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.1% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 79.7 | 11 / 35 | 4516 |
| 2 | 1 | 68.0 | 86.7 | 21 / 35 | 4415 |
| 3 | 1 | 68.0 | 84.8 | 22 / 35 | 4499 |
| 4 | 1 | 70.1 | 93.0 | 20 / 35 | 5086 |
| 5 | 1 | 68.6 | 90.5 | 19 / 35 | 4421 |
| 6 | 1 | 68.1 | 87.3 | 17 / 35 | 4589 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 70 | 63% |
| bvh.mini.Freya 0.55 | 24 | 83% |
| bts.mega.Gnarly 1.4 | 21 | 52% |
| cs.Wren 1.0 | 18 | 83% |
| kdf.KoulDestroyer 1.0 | 10 | 80% |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 88% |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 80% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 41 | 40% | 80 |
| bvh.mini.Freya 0.55 | 20 | 19% | 40 |
| bts.mega.Gnarly 1.4 | 20 | 19% | 39 |
| cs.Wren 1.0 | 9 | 9% | 21 |
| kdf.KoulDestroyer 1.0 | 8 | 8% | 15 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 2% | 4 |
| matt.UnderDark3 2.4.34 | 2 | 2% | 3 |
| davidalves.net.DuelistNanoMelee 1.01 | 0 | 0% | 6 |
| bzdp.BoxCar 2.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 137967 melee ticks, 38259 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 49 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 2.

Targeting waves (203 rounds): 45434 sent, 40360 reached their opponent, 8517 virtual hits (21.1% of those reached).

## Melee bench: F39

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 565 over 6 battles (94.2 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.6 | 119 / 210 | 2.03 | 19.1% | 31219 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 19.1% | 119 |
| bvh.fry.Freya 0.82 | 2.0 | 14.4% | 23 |
| az.Ololobot 0.2.4 | 3.3 | 12.7% | 38 |
| catcat20.Lambda 0.024 | 3.7 | 11.7% | 25 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 8.7% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 6.7 | 7.7% | 2 |
| gimp.GimpBot 0.1 | 6.8 | 7.8% | 2 |
| apollokidd.ApolloKidd 0.9 | 7.5 | 7.2% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.5% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 86.3 | 17 / 35 | 4899 |
| 2 | 1 | 69.8 | 90.2 | 23 / 35 | 5530 |
| 3 | 1 | 70.1 | 92.4 | 21 / 35 | 5439 |
| 4 | 1 | 69.2 | 89.8 | 19 / 35 | 5518 |
| 5 | 1 | 67.1 | 85.1 | 18 / 35 | 4682 |
| 6 | 1 | 68.6 | 87.6 | 21 / 35 | 5151 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 54 | 67% |
| bvh.fry.Freya 0.82 | 49 | 84% |
| catcat20.Lambda 0.024 | 44 | 61% |
| winamp32.micro.MicroMacro 1.0 | 7 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 6 | 83% |
| gimp.GimpBot 0.1 | 2 | 50% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 1041. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 28 | 29% | 47 |
| az.Ololobot 0.2.4 | 26 | 27% | 74 |
| catcat20.Lambda 0.024 | 26 | 27% | 48 |
| winamp32.micro.MicroMacro 1.0 | 4 | 4% | 13 |
| apollokidd.ApolloKidd 0.9 | 3 | 3% | 4 |
| stelo.SoRobotNanoMelee 1.2 | 2 | 2% | 9 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 5 |
| gimp.GimpBot 0.1 | 1 | 1% | 7 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 164938 melee ticks, 59877 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 426 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 278 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 53097 sent, 48049 reached their opponent, 8505 virtual hits (17.7% of those reached).

## Melee bench: F40

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 345 over 6 battles (57.5 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 92.1 | 144 / 210 | 1.71 | 20.4% | 31241 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 20.4% | 144 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 13.8% | 21 |
| kano.gamma.KanoGamma 1.8 | 3.5 | 12.4% | 19 |
| mz.AntiGrav 1.0 | 3.7 | 11.6% | 9 |
| Polkwane.SmashMelee 1.0 | 5.3 | 10.2% | 8 |
| alpha.BlackIce 1.0 | 6.2 | 8.6% | 2 |
| stelo.Randomness 1.0 | 6.3 | 9.0% | 5 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.6% | 2 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.3% | 0 |
| sample.Corners 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 92.4 | 27 / 35 | 5400 |
| 2 | 1 | 71.4 | 95.2 | 23 / 35 | 5499 |
| 3 | 1 | 70.0 | 89.2 | 22 / 35 | 5012 |
| 4 | 1 | 71.0 | 91.4 | 23 / 35 | 5463 |
| 5 | 1 | 70.9 | 93.7 | 27 / 35 | 4886 |
| 6 | 1 | 69.9 | 90.5 | 22 / 35 | 4981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 54 | 83% |
| kano.gamma.KanoGamma 1.8 | 41 | 78% |
| mz.AntiGrav 1.0 | 39 | 90% |
| Polkwane.SmashMelee 1.0 | 17 | 88% |
| stelo.Randomness 1.0 | 11 | 91% |
| alpha.BlackIce 1.0 | 5 | 80% |
| amk.superstrike.SuperStrike 0.3 | 4 | 75% |

Hadur died in 69 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 23 | 33% | 58 |
| kano.gamma.KanoGamma 1.8 | 17 | 25% | 54 |
| Polkwane.SmashMelee 1.0 | 7 | 10% | 20 |
| mz.AntiGrav 1.0 | 6 | 9% | 30 |
| amk.superstrike.SuperStrike 0.3 | 5 | 7% | 11 |
| stelo.Randomness 1.0 | 4 | 6% | 17 |
| alpha.BlackIce 1.0 | 4 | 6% | 12 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 5 |
| sample.Corners 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 153921 melee ticks, 44962 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 96 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 96 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 50446 sent, 45468 reached their opponent, 9291 virtual hits (20.4% of those reached).

## Melee bench: F41

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 395 over 6 battles (65.8 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 90.4 | 117 / 210 | 1.87 | 18.8% | 26788 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 18.8% | 117 |
| eem.EvBotNG v12.8 | 2.2 | 15.4% | 67 |
| ary.Swarm 1.1 | 2.8 | 13.5% | 7 |
| lessonz.robocode.Oz 0.5.0 | 4.2 | 12.2% | 10 |
| simonton.nano.MeleeSeed 1.8 | 5.2 | 10.6% | 8 |
| shrub.Silver v048 | 5.8 | 8.9% | 0 |
| zyx.nano.Ant 1.1 | 6.8 | 7.5% | 0 |
| stelo.Mirror 1.1 | 8.5 | 5.5% | 1 |
| jsal.Jsalbot 1.0 | 8.5 | 5.4% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 90.2 | 17 / 35 | 4358 |
| 2 | 1 | 69.8 | 92.4 | 22 / 35 | 4583 |
| 3 | 1 | 69.1 | 89.2 | 21 / 35 | 4513 |
| 4 | 1 | 69.8 | 93.3 | 21 / 35 | 4545 |
| 5 | 1 | 67.1 | 85.1 | 14 / 35 | 4134 |
| 6 | 1 | 70.2 | 92.1 | 22 / 35 | 4655 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 80 | 40% |
| lessonz.robocode.Oz 0.5.0 | 35 | 94% |
| ary.Swarm 1.1 | 34 | 94% |
| simonton.nano.MeleeSeed 1.8 | 17 | 88% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| shrub.Silver v048 | 2 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 1031. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 54 | 56% | 89 |
| ary.Swarm 1.1 | 17 | 18% | 36 |
| lessonz.robocode.Oz 0.5.0 | 11 | 11% | 37 |
| simonton.nano.MeleeSeed 1.8 | 8 | 8% | 29 |
| shrub.Silver v048 | 2 | 2% | 9 |
| jsal.Jsalbot 1.0 | 1 | 1% | 6 |
| stelo.Mirror 1.1 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 151081 melee ticks, 55879 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 81 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 50067 sent, 45044 reached their opponent, 6936 virtual hits (15.4% of those reached).

## Melee bench: F42

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 331 over 6 battles (55.2 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 91.9 | 150 / 210 | 1.73 | 20.4% | 34652 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 20.4% | 150 |
| wompi.Wallaby 5.1 | 2.0 | 15.1% | 26 |
| maribo.mini.MiniQuester 0.1 | 3.2 | 13.5% | 16 |
| ara.Shera 0.88 | 3.8 | 12.3% | 13 |
| amz.NanoClone 1.41 | 5.0 | 8.9% | 1 |
| dsw.StaticD 1.0 | 6.2 | 7.1% | 2 |
| maribo.IotaCT 1.1 | 7.7 | 6.1% | 0 |
| stelo.MirrorMicro 1.0 | 8.0 | 5.9% | 1 |
| mme.NikeEnhanced 2.0 | 8.2 | 5.8% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 92.4 | 25 / 35 | 5560 |
| 2 | 1 | 71.7 | 94.3 | 29 / 35 | 5916 |
| 3 | 1 | 70.0 | 90.8 | 19 / 35 | 5737 |
| 4 | 1 | 71.1 | 93.0 | 28 / 35 | 5753 |
| 5 | 1 | 71.1 | 91.4 | 25 / 35 | 5891 |
| 6 | 1 | 70.1 | 89.5 | 24 / 35 | 5795 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 97 | 89% |
| maribo.mini.MiniQuester 0.1 | 49 | 92% |
| ara.Shera 0.88 | 24 | 67% |
| dsw.StaticD 1.0 | 3 | 67% |
| amz.NanoClone 1.41 | 2 | 50% |
| mme.NikeEnhanced 2.0 | 1 | 0% |

Hadur died in 62 of 210 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 21 | 34% | 106 |
| ara.Shera 0.88 | 21 | 34% | 38 |
| maribo.mini.MiniQuester 0.1 | 11 | 18% | 50 |
| amz.NanoClone 1.41 | 3 | 5% | 4 |
| dsw.StaticD 1.0 | 2 | 3% | 6 |
| stelo.MirrorMicro 1.0 | 1 | 2% | 2 |
| mme.NikeEnhanced 2.0 | 1 | 2% | 1 |
| maribo.IotaCT 1.1 | 0 | 0% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 159032 melee ticks, 60172 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 518 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 329 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 51193 sent, 46338 reached their opponent, 9245 virtual hits (20.0% of those reached).

## Melee bench: F43

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 401 over 6 battles (66.8 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 80.5 | 38 / 210 | 2.75 | 15.9% | 23994 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.7% | 134 |
| hadur117.Hadur 3.20la | 2.0 | 15.9% | 38 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.3% | 25 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.4% | 7 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.3% | 2 |
| Krabb.akim2.Akim2 1.1b | 5.5 | 9.8% | 3 |
| mz.NanoGod 2.02 | 7.3 | 7.7% | 0 |
| jab.DiamondStealer 5 | 7.7 | 7.6% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.7% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 78.4 | 4 / 35 | 3980 |
| 2 | 2 | 67.1 | 83.8 | 9 / 35 | 4222 |
| 3 | 2 | 65.8 | 79.0 | 5 / 35 | 4047 |
| 4 | 2 | 65.0 | 78.1 | 8 / 35 | 3631 |
| 5 | 2 | 67.2 | 83.8 | 7 / 35 | 4165 |
| 6 | 2 | 66.0 | 80.0 | 5 / 35 | 3949 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 84 | 27% |
| brainfade.melee.Dusk 0.44 | 16 | 19% |
| wcsv.melee.EngineerMelee 0.1 | 7 | 71% |
| dummy.micro.Sparrow 2.5 | 5 | 60% |
| Krabb.akim2.Akim2 1.1b | 3 | 33% |
| mz.NanoGod 2.02 | 2 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 96 | 55% | 121 |
| brainfade.melee.Dusk 0.44 | 33 | 19% | 36 |
| dummy.micro.Sparrow 2.5 | 20 | 11% | 25 |
| wcsv.melee.EngineerMelee 0.1 | 13 | 7% | 16 |
| Krabb.akim2.Akim2 1.1b | 5 | 3% | 5 |
| mz.NanoGod 2.02 | 3 | 2% | 5 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
| jab.DiamondStealer 5 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 156910 melee ticks, 49869 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 32 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 50263 sent, 45174 reached their opponent, 7565 virtual hits (16.7% of those reached).

## Melee bench: F44

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 120 over 6 battles (20.0 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 91.3 | 138 / 210 | 1.78 | 20.5% | 34576 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 20.5% | 138 |
| stelo.Liblix 0.3.1 | 2.0 | 15.7% | 52 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.6% | 14 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.3 | 9.9% | 1 |
| jwirde.Gort 2.0 | 4.7 | 9.4% | 2 |
| disan.Chair 2.2.0 | 6.5 | 7.6% | 1 |
| wompi.Quokka 1.6 | 6.8 | 7.2% | 1 |
| stf.PanzerGeneral 0.1 | 7.7 | 7.3% | 2 |
| sample.Crazy 1.0 | 9.3 | 4.6% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 92.4 | 23 / 35 | 5482 |
| 2 | 1 | 71.0 | 90.2 | 22 / 35 | 6017 |
| 3 | 1 | 70.6 | 89.5 | 22 / 35 | 5888 |
| 4 | 1 | 72.1 | 94.6 | 27 / 35 | 6011 |
| 5 | 1 | 70.7 | 91.4 | 23 / 35 | 5534 |
| 6 | 1 | 70.3 | 89.8 | 21 / 35 | 5644 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 77 | 68% |
| tzu.TheArtOfWar 1.2 | 55 | 87% |
| disan.Chair 2.2.0 | 14 | 93% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 100% |
| jwirde.Gort 2.0 | 9 | 89% |
| stf.PanzerGeneral 0.1 | 5 | 60% |
| wompi.Quokka 1.6 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 959. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 41 | 55% | 97 |
| tzu.TheArtOfWar 1.2 | 17 | 23% | 56 |
| jwirde.Gort 2.0 | 4 | 5% | 22 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 5% | 13 |
| stf.PanzerGeneral 0.1 | 4 | 5% | 9 |
| disan.Chair 2.2.0 | 1 | 1% | 5 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 4 |
| wompi.Quokka 1.6 | 1 | 1% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 149535 melee ticks, 48346 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 32 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 51372 sent, 46664 reached their opponent, 9815 virtual hits (21.0% of those reached).

## Melee bench: F45

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 540 over 6 battles (90.0 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 87.7 | 111 / 210 | 2.11 | 19.9% | 34062 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20la | 1.0 | 19.9% | 111 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 12.3% | 71 |
| jje.BagPuss 1.2 | 2.7 | 12.6% | 13 |
| myl.nano.Graviton 1.10 | 4.2 | 10.9% | 2 |
| sul.Lunar 1.1 | 4.8 | 10.2% | 7 |
| fm.claire 1.7 | 6.2 | 8.9% | 0 |
| hvilela.HVilela 0.9 | 7.2 | 8.2% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 7.8% | 6 |
| wit.Deep7 2.0 | 9.2 | 5.3% | 1 |
| abud.ThirdRobo 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.6 | 17 / 35 | 5731 |
| 2 | 1 | 70.0 | 88.3 | 19 / 35 | 5791 |
| 3 | 1 | 69.7 | 88.6 | 18 / 35 | 5607 |
| 4 | 1 | 69.1 | 86.0 | 18 / 35 | 5627 |
| 5 | 1 | 71.0 | 90.8 | 24 / 35 | 5603 |
| 6 | 1 | 68.8 | 84.8 | 15 / 35 | 5703 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 93 | 60% |
| jje.BagPuss 1.2 | 20 | 55% |
| sul.Lunar 1.1 | 18 | 83% |
| myl.nano.Graviton 1.10 | 14 | 93% |
| pez.mini.ChironexFleckeri 0.5 | 13 | 69% |
| fm.claire 1.7 | 4 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |
| wit.Deep7 2.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 1589. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 41 | 39% | 0 |
| jje.BagPuss 1.2 | 19 | 18% | 64 |
| sul.Lunar 1.1 | 11 | 10% | 47 |
| myl.nano.Graviton 1.10 | 9 | 9% | 36 |
| pez.mini.ChironexFleckeri 0.5 | 9 | 9% | 23 |
| fm.claire 1.7 | 5 | 5% | 18 |
| hvilela.HVilela 0.9 | 3 | 3% | 13 |
| wit.Deep7 2.0 | 3 | 3% | 7 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 200433 melee ticks, 101470 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 70 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 60466 sent, 55639 reached their opponent, 8293 virtual hits (14.9% of those reached).

## Melee bench: F46

hadur117.Hadur 3.20la against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 527 over 6 battles (87.8 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 85.8 | 74 / 210 | 2.28 | 16.8% | 24024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 16.7% | 58 |
| hadur117.Hadur 3.20la | 1.7 | 16.8% | 74 |
| rsalesc.melee.Medina 0.4.5 | 2.8 | 16.0% | 65 |
| mz.MicroSheep 1.0 | 4.3 | 10.5% | 5 |
| cx.Princess 1.0 | 5.0 | 9.5% | 6 |
| sadoner.killer 0.2 | 5.7 | 9.1% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.1% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 6.0% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.1% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 84.1 | 12 / 35 | 3958 |
| 2 | 2 | 66.2 | 84.1 | 11 / 35 | 4297 |
| 3 | 2 | 65.7 | 84.1 | 13 / 35 | 3857 |
| 4 | 1 | 67.2 | 87.3 | 13 / 35 | 4276 |
| 5 | 1 | 66.8 | 88.6 | 13 / 35 | 3865 |
| 6 | 2 | 66.2 | 86.7 | 12 / 35 | 3771 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 76 | 67% |
| rsalesc.melee.Medina 0.4.5 | 38 | 24% |
| cx.Princess 1.0 | 7 | 71% |
| mz.MicroSheep 1.0 | 4 | 100% |
| arthord.NanoSatanMelee Beta | 4 | 75% |
| sadoner.killer 0.2 | 3 | 67% |

Hadur died in 141 of 210 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 62 | 44% | 80 |
| kc.mini.Mirage 0.2 | 44 | 31% | 88 |
| cx.Princess 1.0 | 11 | 8% | 13 |
| sadoner.killer 0.2 | 7 | 5% | 8 |
| arthord.NanoSatanMelee Beta | 6 | 4% | 7 |
| mz.MicroSheep 1.0 | 4 | 3% | 10 |
| jeremyreeder.collective.Prophet 5 | 3 | 2% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 161160 melee ticks, 42689 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 35 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 46847 sent, 41798 reached their opponent, 6220 virtual hits (14.9% of those reached).

