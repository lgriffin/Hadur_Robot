# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1494306. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 216 over 6 battles (36.0 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 87.5 | 59 / 210 | 2.12 | 18.2% | 34188 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.2 | 19.5% | 135 |
| hadur117.Hadur 3.21ek | 1.8 | 18.2% | 59 |
| sgp.JollyNinja 3.53 | 3.3 | 11.2% | 6 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 11.1% | 3 |
| mz.MicroGodMelee 1 | 5.2 | 10.3% | 4 |
| lorneswork.Predator 1.0 | 5.5 | 9.7% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.8% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.0% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.2% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.9 | 88.3 | 11 / 35 | 5821 |
| 2 | 2 | 68.4 | 86.3 | 12 / 35 | 5694 |
| 3 | 2 | 67.2 | 83.2 | 7 / 35 | 5618 |
| 4 | 1 | 68.9 | 89.2 | 12 / 35 | 5656 |
| 5 | 2 | 69.1 | 88.9 | 9 / 35 | 5858 |
| 6 | 2 | 68.7 | 89.2 | 8 / 35 | 5541 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 128 | 15% |
| sgp.JollyNinja 3.53 | 19 | 79% |
| mz.MicroGodMelee 1 | 10 | 80% |
| lorneswork.Predator 1.0 | 9 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 80% |
| adt.Ar2 1.0 | 4 | 50% |
| skm.butterfly 1.0 | 1 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 1151. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 111 | 74% | 134 |
| sgp.JollyNinja 3.53 | 17 | 11% | 28 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 4% | 10 |
| adt.Ar2 1.0 | 6 | 4% | 7 |
| lorneswork.Predator 1.0 | 5 | 3% | 15 |
| mz.MicroGodMelee 1 | 5 | 3% | 14 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 138248 melee ticks, 82264 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 87 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 87 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43586 sent, 38987 reached their opponent, 8183 virtual hits (21.0% of those reached).

## Melee bench: F02

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474881. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 200 over 6 battles (33.3 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 87.5 | 109 / 210 | 2.13 | 19.0% | 30894 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 19.0% | 109 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.7% | 27 |
| pulsar.PulsarMax 0.8.9 | 2.7 | 14.3% | 43 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.1% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.1% | 11 |
| fnc.bandit.Bandit 5.2.0 | 6.3 | 8.5% | 3 |
| sch.Simone 0.3d | 7.2 | 7.5% | 6 |
| Noran.BitchingElk 0.054 | 7.3 | 6.9% | 11 |
| stelo.PatternRobot 1.0 | 9.2 | 5.2% | 0 |
| fullsail.SweetTea 1.1 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.9 | 17 / 35 | 4992 |
| 2 | 1 | 71.3 | 93.0 | 20 / 35 | 5678 |
| 3 | 1 | 69.2 | 88.6 | 18 / 35 | 5157 |
| 4 | 1 | 67.9 | 85.4 | 18 / 35 | 4812 |
| 5 | 1 | 69.7 | 89.8 | 20 / 35 | 5351 |
| 6 | 1 | 67.0 | 80.0 | 16 / 35 | 4904 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 54 | 57% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 45 | 71% |
| sch.Simone 0.3d | 16 | 81% |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 75% |
| Noran.BitchingElk 0.054 | 13 | 54% |
| fnc.bandit.Bandit 5.2.0 | 10 | 80% |
| lrem.micro.SpikeSoldier 0.4 | 7 | 86% |

Hadur died in 104 of 210 rounds, at a mean tick of 940. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 31 | 30% | 61 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 25 | 24% | 60 |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 10% | 27 |
| sch.Simone 0.3d | 10 | 10% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 9% | 13 |
| Noran.BitchingElk 0.054 | 7 | 7% | 15 |
| fnc.bandit.Bandit 5.2.0 | 7 | 7% | 11 |
| stelo.PatternRobot 1.0 | 5 | 5% | 7 |

Posture (Hadur's M records, 200 rounds): 160819 melee ticks, 40479 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 41 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 57354 sent, 52586 reached their opponent, 8726 virtual hits (16.6% of those reached).

## Melee bench: F03

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480250. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 156 over 6 battles (26.0 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 95.3 | 181 / 210 | 1.42 | 21.6% | 39620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 21.6% | 181 |
| radnor.DoctorBob 1.42 | 2.2 | 13.7% | 13 |
| kawigi.nano.Lib 1.0 | 3.2 | 12.3% | 4 |
| vuen.Cake 2.51 | 3.7 | 12.5% | 10 |
| urdos.URDOS 1.3 | 5.2 | 9.7% | 1 |
| adt.Ar1 2.1 | 5.8 | 7.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 6.5% | 0 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.2% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.2% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 94.9 | 29 / 35 | 6381 |
| 2 | 1 | 72.2 | 95.9 | 29 / 35 | 6678 |
| 3 | 1 | 72.3 | 94.6 | 31 / 35 | 6786 |
| 4 | 1 | 72.5 | 96.2 | 32 / 35 | 6744 |
| 5 | 1 | 70.6 | 93.3 | 27 / 35 | 5976 |
| 6 | 1 | 72.8 | 97.1 | 33 / 35 | 7055 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 74 | 93% |
| radnor.DoctorBob 1.42 | 60 | 100% |
| kawigi.nano.Lib 1.0 | 45 | 98% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| urdos.URDOS 1.3 | 3 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 29 of 210 rounds, at a mean tick of 728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 13 | 45% | 63 |
| vuen.Cake 2.51 | 5 | 17% | 79 |
| kawigi.nano.Lib 1.0 | 5 | 17% | 37 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 14% | 6 |
| urdos.URDOS 1.3 | 2 | 7% | 7 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 8 |
| adt.Ar1 2.1 | 0 | 0% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 123925 melee ticks, 41314 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 32 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 38031 sent, 33330 reached their opponent, 8541 virtual hits (25.6% of those reached).

## Melee bench: F04

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1473865. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 92 over 6 battles (15.3 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.5 | 25 / 210 | 2.21 | 17.8% | 34930 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.7% | 168 |
| hadur117.Hadur 3.21ek | 2.0 | 17.8% | 25 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.5% | 9 |
| TNT.TNT 0.99.1 | 4.0 | 10.7% | 6 |
| josago.Jorgito 0.16 | 5.2 | 8.9% | 2 |
| css.Delitioner 0.11 | 6.0 | 7.4% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.2% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.1% | 0 |
| sp.Nanos.Ember 1.1 | 8.8 | 4.1% | 0 |
| spin.Bugstard 0.012b | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.1 | 87.6 | 4 / 35 | 6125 |
| 2 | 2 | 68.5 | 86.7 | 5 / 35 | 5734 |
| 3 | 2 | 68.6 | 85.7 | 2 / 35 | 6043 |
| 4 | 2 | 68.3 | 85.1 | 6 / 35 | 5558 |
| 5 | 2 | 68.5 | 87.6 | 3 / 35 | 5624 |
| 6 | 2 | 68.9 | 86.3 | 5 / 35 | 5846 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 138 | 11% |
| apc.LeeroyJenkins2 1.0 | 11 | 64% |
| TNT.TNT 0.99.1 | 7 | 29% |
| css.Delitioner 0.11 | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 0% |

Hadur died in 185 of 210 rounds, at a mean tick of 1297. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 143 | 77% | 158 |
| apc.LeeroyJenkins2 1.0 | 25 | 14% | 32 |
| TNT.TNT 0.99.1 | 8 | 4% | 10 |
| josago.Jorgito 0.16 | 6 | 3% | 6 |
| css.Delitioner 0.11 | 3 | 2% | 4 |

Posture (Hadur's M records, 199 rounds): 187443 melee ticks, 69595 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 49 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 57660 sent, 52912 reached their opponent, 7921 virtual hits (15.0% of those reached).

## Melee bench: F05

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1463838. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 122 over 6 battles (20.3 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 78.8 | 24 / 210 | 2.90 | 15.5% | 25438 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.1% | 104 |
| justin.DemonicRage 3.4 | 2.0 | 17.0% | 61 |
| hadur117.Hadur 3.21ek | 2.8 | 15.5% | 24 |
| wompi.Numbat 2.1 | 4.0 | 12.3% | 10 |
| ms.Ares 0.19 | 5.2 | 9.2% | 1 |
| axeBots.HataMoto 3.09 | 5.8 | 9.2% | 10 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.6% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.3% | 0 |
| GarmBox.Oranges 1.0 | 9.2 | 4.1% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.9 | 79.4 | 3 / 35 | 4305 |
| 2 | 2 | 66.0 | 82.2 | 8 / 35 | 4250 |
| 3 | 3 | 63.7 | 77.8 | 2 / 35 | 4115 |
| 4 | 3 | 64.4 | 78.1 | 2 / 35 | 4206 |
| 5 | 3 | 64.5 | 78.1 | 3 / 35 | 4408 |
| 6 | 3 | 64.8 | 77.5 | 6 / 35 | 4154 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 42 | 33% |
| cb.fire.Firestarter 2.0f | 35 | 6% |
| wompi.Numbat 2.1 | 9 | 67% |
| axeBots.HataMoto 3.09 | 3 | 33% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 75 | 40% | 89 |
| cb.fire.Firestarter 2.0f | 60 | 32% | 63 |
| wompi.Numbat 2.1 | 28 | 15% | 33 |
| axeBots.HataMoto 3.09 | 12 | 6% | 13 |
| ms.Ares 0.19 | 7 | 4% | 8 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |

Posture (Hadur's M records, 203 rounds): 157283 melee ticks, 30076 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 65 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 47947 sent, 42995 reached their opponent, 7194 virtual hits (16.7% of those reached).

## Melee bench: F06

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1467969. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 163 over 6 battles (27.2 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 91.4 | 142 / 210 | 1.78 | 20.2% | 33149 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 20.2% | 142 |
| jekl.StoneGhost 0.7 | 2.0 | 14.7% | 23 |
| origin.SleepSiphon 1.7b | 3.2 | 12.7% | 19 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 11.7% | 11 |
| mld.Wisdom 1.0 | 5.0 | 10.7% | 3 |
| gg.Wolverine 2.0 | 6.3 | 8.0% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 7.0% | 10 |
| DBall.NUKE 0.1 | 7.7 | 6.7% | 0 |
| spinnercat.Omen 1.0 | 8.5 | 5.7% | 0 |
| sample.Fire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 94.3 | 27 / 35 | 5784 |
| 2 | 1 | 70.4 | 90.2 | 23 / 35 | 5553 |
| 3 | 1 | 70.6 | 91.1 | 22 / 35 | 5505 |
| 4 | 1 | 71.0 | 93.7 | 23 / 35 | 5617 |
| 5 | 1 | 70.0 | 89.8 | 24 / 35 | 5051 |
| 6 | 1 | 70.4 | 89.2 | 23 / 35 | 5639 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 66 | 82% |
| origin.SleepSiphon 1.7b | 44 | 84% |
| pe.minimelee.SandboxMiniMelee 1.1 | 38 | 87% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 67% |
| mld.Wisdom 1.0 | 8 | 88% |
| gg.Wolverine 2.0 | 5 | 80% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 20 | 29% | 72 |
| origin.SleepSiphon 1.7b | 19 | 28% | 60 |
| pe.minimelee.SandboxMiniMelee 1.1 | 14 | 21% | 40 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 10% | 16 |
| mld.Wisdom 1.0 | 6 | 9% | 11 |
| gg.Wolverine 2.0 | 2 | 3% | 4 |
| sample.Fire 1.0 | 0 | 0% | 3 |
| spinnercat.Omen 1.0 | 0 | 0% | 2 |
| DBall.NUKE 0.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 147303 melee ticks, 37016 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 33 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 45554 sent, 40964 reached their opponent, 9270 virtual hits (22.6% of those reached).

## Melee bench: F07

hadur117.Hadur 3.21ek against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1481367. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 97 over 6 battles (16.2 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 75.3 | 96.7 | 169 / 210 | 1.27 | 25.9% | 45941 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 25.9% | 169 |
| rtk.Tachikoma 1.0 | 2.0 | 19.2% | 32 |
| oog.melee.CapuletDroid 1.1 | 3.3 | 12.5% | 7 |
| franzor.Lizt 1.3.1 | 3.7 | 12.1% | 2 |
| lrem.micro.MoggFanatic 0.2 | 5.0 | 10.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.0 | 8.6% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 6.3% | 0 |
| sample.Target 1.0 | 8.5 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 8.5 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 75.4 | 97.1 | 28 / 35 | 7515 |
| 2 | 1 | 75.2 | 97.1 | 27 / 35 | 7639 |
| 3 | 1 | 74.8 | 96.8 | 27 / 35 | 7328 |
| 4 | 1 | 75.7 | 96.8 | 29 / 35 | 7840 |
| 5 | 1 | 75.4 | 97.5 | 30 / 35 | 7624 |
| 6 | 1 | 75.4 | 94.6 | 28 / 35 | 7995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 137 | 80% |
| franzor.Lizt 1.3.1 | 34 | 94% |
| oog.melee.CapuletDroid 1.1 | 31 | 84% |
| skm.PateranBotlock2 1.0 | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 1383. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 32 | 78% | 143 |
| oog.melee.CapuletDroid 1.1 | 5 | 12% | 50 |
| franzor.Lizt 1.3.1 | 2 | 5% | 2 |
| lrem.micro.MoggFanatic 0.2 | 1 | 2% | 6 |
| skm.PateranBotlock2 1.0 | 1 | 2% | 2 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 5 |

Posture (Hadur's M records, 198 rounds): 184234 melee ticks, 69615 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 49 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 52153 sent, 48171 reached their opponent, 10457 virtual hits (21.7% of those reached).

## Melee bench: F08

hadur117.Hadur 3.21ek against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480010. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 259 over 6 battles (43.2 per battle, most in one battle 57). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.8 | 136 / 210 | 1.74 | 22.1% | 31220 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 22.1% | 136 |
| shrub.Vapour v159 | 2.5 | 14.9% | 26 |
| tm.Yuugao 1.0 | 2.5 | 15.0% | 31 |
| com.spp.robocode.MostlyHarmless 010 | 4.5 | 10.9% | 8 |
| m3thos.Eva00 1.1 | 4.8 | 10.0% | 6 |
| jwst.DAD.DarkAndDarker 1.1 | 6.2 | 8.9% | 3 |
| qualidafial.MajorDick 1.0.1 | 7.2 | 6.7% | 0 |
| SHAM.WOW 1.4 | 8.2 | 5.7% | 1 |
| zyx.nano.BacillusComma 1.0 | 8.2 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 91.8 | 21 / 35 | 5535 |
| 2 | 1 | 71.5 | 92.9 | 26 / 35 | 5369 |
| 3 | 1 | 71.0 | 91.4 | 25 / 35 | 5303 |
| 4 | 1 | 69.3 | 86.4 | 21 / 35 | 5043 |
| 5 | 1 | 71.1 | 94.3 | 26 / 35 | 5265 |
| 6 | 1 | 68.2 | 87.9 | 17 / 35 | 4705 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 64 | 70% |
| shrub.Vapour v159 | 63 | 76% |
| com.spp.robocode.MostlyHarmless 010 | 27 | 96% |
| m3thos.Eva00 1.1 | 8 | 88% |
| SHAM.WOW 1.4 | 6 | 83% |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 80% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 26 | 35% | 68 |
| shrub.Vapour v159 | 23 | 31% | 77 |
| com.spp.robocode.MostlyHarmless 010 | 11 | 15% | 27 |
| m3thos.Eva00 1.1 | 5 | 7% | 14 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 4% | 12 |
| SHAM.WOW 1.4 | 2 | 3% | 6 |
| zyx.nano.BacillusComma 1.0 | 2 | 3% | 3 |
| qualidafial.MajorDick 1.0.1 | 2 | 3% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 140592 melee ticks, 45803 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 45 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 45 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 2.

Targeting waves (199 rounds): 43206 sent, 39032 reached their opponent, 7227 virtual hits (18.5% of those reached).

## Melee bench: F09

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1471006. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 153 over 6 battles (25.5 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 83.3 | 82 / 210 | 2.50 | 17.2% | 24681 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.5 | 17.2% | 82 |
| positive.Portia 1.26e | 1.7 | 17.1% | 89 |
| kc.micro.Figment 1.0 | 2.8 | 14.8% | 22 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.0% | 7 |
| yagami.Tidus 0.11 | 5.0 | 10.1% | 1 |
| mc2.enemy.Original 0.9 | 5.5 | 9.3% | 9 |
| dft.Calliope 5.6 | 6.8 | 7.4% | 0 |
| step.nanoPri 1.0 | 8.3 | 5.3% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 4.8% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.5 | 81.9 | 13 / 35 | 4136 |
| 2 | 1 | 68.8 | 89.8 | 17 / 35 | 4424 |
| 3 | 1 | 66.4 | 81.3 | 15 / 35 | 4130 |
| 4 | 2 | 65.5 | 80.6 | 11 / 35 | 3887 |
| 5 | 2 | 64.7 | 80.0 | 11 / 35 | 3647 |
| 6 | 1 | 68.2 | 86.0 | 15 / 35 | 4457 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 65 | 34% |
| kc.micro.Figment 1.0 | 48 | 90% |
| yagami.Tidus 0.11 | 7 | 100% |
| pedersen.Grishnakh 1.0 | 7 | 71% |
| mc2.enemy.Original 0.9 | 6 | 67% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 58 | 45% | 77 |
| kc.micro.Figment 1.0 | 26 | 20% | 66 |
| mc2.enemy.Original 0.9 | 14 | 11% | 20 |
| pedersen.Grishnakh 1.0 | 12 | 9% | 16 |
| yagami.Tidus 0.11 | 10 | 8% | 19 |
| dft.Calliope 5.6 | 3 | 2% | 7 |
| robar.nano.Assertive_Melee 0.2 | 2 | 2% | 2 |
| step.nanoPri 1.0 | 2 | 2% | 2 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |

Posture (Hadur's M records, 201 rounds): 153483 melee ticks, 39581 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 47 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 48953 sent, 44359 reached their opponent, 6370 virtual hits (14.4% of those reached).

## Melee bench: F10

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1486088. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 207 over 6 battles (34.5 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 95.4 | 167 / 210 | 1.41 | 20.9% | 34759 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 20.9% | 167 |
| DTF.Kludgy 1.2b | 2.0 | 14.7% | 24 |
| ejb.Polaris 1.0.1 | 3.5 | 12.2% | 8 |
| ne.Chimera 1.2 | 3.5 | 12.6% | 5 |
| vStar.RAFzilla 2.15 | 5.3 | 9.9% | 4 |
| tvv.micro.Antares 1.1.1 | 5.7 | 9.9% | 1 |
| sam.Samspin 1.0 | 7.5 | 5.5% | 0 |
| kurios.DOSexe .9b | 8.3 | 5.2% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.0% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 95.6 | 28 / 35 | 5960 |
| 2 | 1 | 71.6 | 96.8 | 29 / 35 | 5800 |
| 3 | 1 | 72.0 | 95.6 | 29 / 35 | 5985 |
| 4 | 1 | 72.0 | 96.8 | 28 / 35 | 5858 |
| 5 | 1 | 70.6 | 92.1 | 26 / 35 | 5552 |
| 6 | 1 | 71.2 | 95.9 | 27 / 35 | 5604 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 78 | 78% |
| ejb.Polaris 1.0.1 | 42 | 93% |
| ne.Chimera 1.2 | 34 | 97% |
| vStar.RAFzilla 2.15 | 16 | 88% |
| tvv.micro.Antares 1.1.1 | 12 | 100% |
| kurios.DOSexe .9b | 5 | 100% |
| sam.Samspin 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 19 | 44% | 74 |
| ne.Chimera 1.2 | 9 | 21% | 35 |
| ejb.Polaris 1.0.1 | 7 | 16% | 51 |
| vStar.RAFzilla 2.15 | 5 | 12% | 18 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 16 |
| kurios.DOSexe .9b | 1 | 2% | 7 |
| sam.Samspin 1.0 | 1 | 2% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 142122 melee ticks, 50584 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 70 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 46729 sent, 42047 reached their opponent, 8046 virtual hits (19.1% of those reached).

## Melee bench: F11

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1472518. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 181 over 6 battles (30.2 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 82.9 | 83 / 210 | 2.54 | 16.9% | 24235 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.3 | 16.9% | 83 |
| rz.Aleph 0.34 | 1.7 | 15.9% | 62 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.9% | 24 |
| djc.DynaBot 0.1.1 | 4.0 | 11.0% | 14 |
| rdt199.Warlord 0.73 | 5.0 | 9.8% | 17 |
| br2.MobyDickBot 1.6 | 6.3 | 8.4% | 7 |
| uji.YellohFellah 1.0 | 6.8 | 7.8% | 4 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.5% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 4.7% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 79.7 | 12 / 35 | 3883 |
| 2 | 1 | 64.8 | 80.6 | 11 / 35 | 4020 |
| 3 | 2 | 65.0 | 80.6 | 12 / 35 | 3942 |
| 4 | 1 | 67.8 | 88.6 | 20 / 35 | 4211 |
| 5 | 1 | 67.2 | 88.3 | 18 / 35 | 4109 |
| 6 | 1 | 64.5 | 79.4 | 10 / 35 | 4070 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 53 | 51% |
| cx.mini.Nimrod 0.55 | 28 | 64% |
| rdt199.Warlord 0.73 | 17 | 59% |
| uji.YellohFellah 1.0 | 16 | 88% |
| djc.DynaBot 0.1.1 | 13 | 54% |
| br2.MobyDickBot 1.6 | 6 | 67% |
| KiraNL.Chupacabra 0.4 | 3 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 43 | 34% | 76 |
| cx.mini.Nimrod 0.55 | 28 | 22% | 44 |
| rdt199.Warlord 0.73 | 21 | 16% | 30 |
| djc.DynaBot 0.1.1 | 17 | 13% | 24 |
| uji.YellohFellah 1.0 | 6 | 5% | 16 |
| br2.MobyDickBot 1.6 | 5 | 4% | 7 |
| KiraNL.Chupacabra 0.4 | 4 | 3% | 9 |
| stelo.MirrorNano 1.3 | 3 | 2% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 153689 melee ticks, 35961 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 71 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 49925 sent, 45179 reached their opponent, 6176 virtual hits (13.7% of those reached).

## Melee bench: F12

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1487077. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 162 over 6 battles (27.0 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 87.6 | 127 / 210 | 2.12 | 18.6% | 25262 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 18.6% | 127 |
| nat.PallasHawk 1.0 | 2.7 | 13.6% | 32 |
| bts.wiki.RipCurl 0.9b | 2.8 | 13.2% | 22 |
| darkcanuck.Leon 1.01 | 3.5 | 12.6% | 18 |
| brainfade.melee.Genghis 0.36 | 5.2 | 10.2% | 6 |
| jrm.Test0 1.0 | 6.5 | 8.1% | 1 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.0% | 0 |
| jp.Perpy 16.0 | 7.3 | 6.7% | 2 |
| jaybot.bots.Oddball 4.0 | 9.3 | 4.9% | 1 |
| stuff.Vlad 0.1 | 9.3 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.3 | 23 / 35 | 4407 |
| 2 | 1 | 68.8 | 88.9 | 23 / 35 | 4126 |
| 3 | 1 | 67.2 | 83.2 | 21 / 35 | 4188 |
| 4 | 1 | 68.9 | 90.8 | 22 / 35 | 4295 |
| 5 | 1 | 68.6 | 89.2 | 21 / 35 | 4217 |
| 6 | 1 | 67.2 | 86.0 | 17 / 35 | 4029 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 56 | 71% |
| darkcanuck.Leon 1.01 | 51 | 84% |
| bts.wiki.RipCurl 0.9b | 37 | 76% |
| brainfade.melee.Genghis 0.36 | 13 | 77% |
| jp.Perpy 16.0 | 2 | 100% |
| stuff.Vlad 0.1 | 2 | 50% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jrm.Test0 1.0 | 1 | 0% |
| jaybot.bots.Oddball 4.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 26 | 31% | 63 |
| bts.wiki.RipCurl 0.9b | 17 | 20% | 37 |
| darkcanuck.Leon 1.01 | 16 | 19% | 63 |
| brainfade.melee.Genghis 0.36 | 9 | 11% | 15 |
| jrm.Test0 1.0 | 9 | 11% | 11 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 10 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 4 |
| jp.Perpy 16.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 126297 melee ticks, 34490 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 87 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 87 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43313 sent, 38468 reached their opponent, 6417 virtual hits (16.7% of those reached).

## Melee bench: F13

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477119. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 152 over 6 battles (25.3 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 80.2 | 47 / 210 | 2.78 | 15.6% | 24747 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 17.3% | 111 |
| ags.Glacier 0.2.11 | 1.8 | 16.6% | 32 |
| hadur117.Hadur 3.21ek | 2.7 | 15.6% | 47 |
| shinh.Entangled 0.3 | 4.3 | 12.1% | 14 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.1% | 4 |
| apc.Colossus2 0.17 | 6.2 | 8.0% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.8% | 2 |
| maribo.FollowFire 1 | 8.3 | 4.8% | 0 |
| ayk.WallHugger 1.0 | 8.7 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.2 | 79.7 | 9 / 35 | 4408 |
| 2 | 3 | 64.8 | 79.7 | 10 / 35 | 4181 |
| 3 | 3 | 64.4 | 79.7 | 5 / 35 | 4214 |
| 4 | 1 | 65.6 | 82.5 | 8 / 35 | 4257 |
| 5 | 3 | 64.8 | 80.3 | 7 / 35 | 4018 |
| 6 | 3 | 63.9 | 79.4 | 8 / 35 | 3669 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 48 | 13% |
| ags.Glacier 0.2.11 | 44 | 61% |
| shinh.Entangled 0.3 | 11 | 64% |
| gh.micro.Gruweltje 0.7 | 6 | 100% |
| stelo.Wang 1.0 | 3 | 33% |

Hadur died in 163 of 210 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 65 | 40% | 74 |
| ags.Glacier 0.2.11 | 49 | 30% | 70 |
| shinh.Entangled 0.3 | 25 | 15% | 32 |
| gh.micro.Gruweltje 0.7 | 11 | 7% | 19 |
| stelo.Wang 1.0 | 5 | 3% | 7 |
| maribo.FollowFire 1 | 4 | 2% | 4 |
| apc.Colossus2 0.17 | 4 | 2% | 4 |

Posture (Hadur's M records, 199 rounds): 142347 melee ticks, 32882 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 65 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 41905 sent, 36905 reached their opponent, 5994 virtual hits (16.2% of those reached).

## Melee bench: F14

hadur117.Hadur 3.21ek against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1487810. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 182 over 6 battles (30.3 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 97.0 | 191 / 210 | 1.24 | 24.2% | 36466 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 24.2% | 191 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.7% | 13 |
| Lo_Ian.Gandalf_V4 4.0 | 3.7 | 11.4% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 4.0 | 11.0% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.0 | 9.9% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.4% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.3 | 9.0% | 2 |
| pa.Improved 1.0 | 8.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 9.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 95.7 | 30 / 35 | 6164 |
| 2 | 1 | 73.2 | 99.3 | 33 / 35 | 6054 |
| 3 | 1 | 72.9 | 96.4 | 31 / 35 | 6176 |
| 4 | 1 | 73.2 | 98.9 | 33 / 35 | 6041 |
| 5 | 1 | 73.0 | 96.4 | 33 / 35 | 6260 |
| 6 | 1 | 72.3 | 95.4 | 31 / 35 | 5771 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 127 | 94% |
| sanyi.mikrobi.Roberto 1.0 | 23 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 22 | 95% |
| Lo_Ian.Gandalf_V4 4.0 | 13 | 92% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 88% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 19 of 210 rounds, at a mean tick of 665. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 11 | 58% | 110 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 16% | 19 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 11% | 14 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 5% | 31 |
| sheldor.micro.PointInLineRRAL 1.0 | 1 | 5% | 22 |
| pa.Improved 1.0 | 1 | 5% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 9 |

Posture (Hadur's M records, 198 rounds): 119568 melee ticks, 43857 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 56 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 35852 sent, 31932 reached their opponent, 8188 virtual hits (25.6% of those reached).

## Melee bench: F15

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1470789. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 178 over 6 battles (29.7 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.8 | 122 / 210 | 2.19 | 19.1% | 31541 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 19.1% | 122 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.7% | 13 |
| mld.DustBunny 3.8 | 3.2 | 12.9% | 9 |
| emp.Yngwie 1.11 | 3.5 | 12.7% | 45 |
| cb.nano.Insomnia 1.0 | 5.3 | 10.5% | 5 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.5% | 16 |
| lambdaxy.TBot 0.1 | 7.3 | 7.0% | 0 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.7% | 0 |
| divineomega.TrialBot 0.003 | 9.5 | 4.2% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 84.8 | 16 / 35 | 5235 |
| 2 | 1 | 68.9 | 84.8 | 21 / 35 | 5245 |
| 3 | 1 | 67.4 | 85.7 | 18 / 35 | 4498 |
| 4 | 1 | 70.9 | 91.7 | 23 / 35 | 5624 |
| 5 | 1 | 69.3 | 86.3 | 23 / 35 | 5314 |
| 6 | 1 | 69.9 | 87.6 | 21 / 35 | 5625 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 47 | 49% |
| kawigi.micro.Shiz 1.1 | 41 | 98% |
| mld.DustBunny 3.8 | 28 | 86% |
| kawigi.robot.Girl 1.2 | 22 | 91% |
| cb.nano.Insomnia 1.0 | 12 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |
| divineomega.TrialBot 0.003 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 36 | 41% | 75 |
| mld.DustBunny 3.8 | 14 | 16% | 53 |
| cb.nano.Insomnia 1.0 | 12 | 14% | 18 |
| kawigi.micro.Shiz 1.1 | 11 | 13% | 33 |
| kawigi.robot.Girl 1.2 | 8 | 9% | 16 |
| Grystrion.TrackerWO 1.0 | 4 | 5% | 7 |
| lambdaxy.TBot 0.1 | 2 | 2% | 3 |
| divineomega.TrialBot 0.003 | 1 | 1% | 5 |

Posture (Hadur's M records, 198 rounds): 161598 melee ticks, 38014 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 57 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 51716 sent, 47000 reached their opponent, 7739 virtual hits (16.5% of those reached).

## Melee bench: F16

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1469398. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 178 over 6 battles (29.7 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 90.6 | 141 / 210 | 1.85 | 20.4% | 34511 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 20.4% | 141 |
| gh.Griezel 0.5.2 | 2.0 | 15.9% | 33 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.5% | 12 |
| techdude.forest.FlamingForest 1.1 | 4.5 | 10.3% | 19 |
| bvh.fnr.Fenrir 0.36l | 5.2 | 9.2% | 1 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.1% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.4% | 1 |
| asd.Cthulhu 1.3 | 8.5 | 4.5% | 0 |
| repositorio.NanoStep 1.0 | 9.2 | 4.3% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.3 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 93.3 | 26 / 35 | 6217 |
| 2 | 1 | 69.7 | 87.6 | 23 / 35 | 5347 |
| 3 | 1 | 70.8 | 89.8 | 20 / 35 | 5844 |
| 4 | 1 | 69.1 | 85.4 | 18 / 35 | 5416 |
| 5 | 1 | 72.2 | 94.3 | 27 / 35 | 5954 |
| 6 | 1 | 71.9 | 93.0 | 27 / 35 | 5733 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 82 | 78% |
| techdude.forest.FlamingForest 1.1 | 37 | 86% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 22 | 91% |
| bvh.fnr.Fenrir 0.36l | 11 | 100% |
| tvv.nano.Polaris 1.2 | 11 | 100% |
| stelo.IntrinsicVolatility 1.4 | 2 | 100% |
| divineomega.DivineBot 1.9.4.5 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 989. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 22 | 32% | 89 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 15 | 22% | 28 |
| techdude.forest.FlamingForest 1.1 | 10 | 14% | 37 |
| bvh.fnr.Fenrir 0.36l | 10 | 14% | 16 |
| stelo.IntrinsicVolatility 1.4 | 4 | 6% | 10 |
| asd.Cthulhu 1.3 | 4 | 6% | 5 |
| divineomega.DivineBot 1.9.4.5 | 2 | 3% | 8 |
| tvv.nano.Polaris 1.2 | 1 | 1% | 14 |
| repositorio.NanoStep 1.0 | 1 | 1% | 3 |

Posture (Hadur's M records, 200 rounds): 171128 melee ticks, 46994 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 34 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 55708 sent, 50960 reached their opponent, 8905 virtual hits (17.5% of those reached).

## Melee bench: F17

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1470838. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 171 over 6 battles (28.5 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 87.4 | 107 / 210 | 2.14 | 19.4% | 35180 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 19.4% | 107 |
| et.Predator 1.8 | 2.8 | 13.6% | 23 |
| cx.BlestPain 1.41 | 3.0 | 13.1% | 41 |
| oog.melee.Mercutio 1.0 | 3.2 | 13.3% | 33 |
| ahf.NanoAndrew .4 | 5.5 | 10.0% | 2 |
| nic.Nicator 2.4 | 6.2 | 8.9% | 4 |
| maribo.melee.BMV 0.1 | 6.3 | 8.6% | 0 |
| tex.Longbot 0.4 | 8.3 | 5.6% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 88.6 | 17 / 35 | 5894 |
| 2 | 1 | 70.9 | 90.5 | 21 / 35 | 6219 |
| 3 | 1 | 70.7 | 87.9 | 21 / 35 | 5984 |
| 4 | 1 | 69.9 | 88.9 | 20 / 35 | 5694 |
| 5 | 1 | 67.8 | 82.5 | 12 / 35 | 5637 |
| 6 | 1 | 69.3 | 85.7 | 16 / 35 | 5752 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 54 | 74% |
| cx.BlestPain 1.41 | 42 | 50% |
| et.Predator 1.8 | 41 | 76% |
| nic.Nicator 2.4 | 9 | 78% |
| ahf.NanoAndrew .4 | 4 | 75% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 1046. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 34 | 33% | 59 |
| oog.melee.Mercutio 1.0 | 26 | 25% | 61 |
| et.Predator 1.8 | 25 | 24% | 56 |
| ahf.NanoAndrew .4 | 10 | 10% | 14 |
| maribo.melee.BMV 0.1 | 4 | 4% | 6 |
| nic.Nicator 2.4 | 3 | 3% | 8 |
| tex.Longbot 0.4 | 1 | 1% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 3 |

Posture (Hadur's M records, 199 rounds): 158086 melee ticks, 58484 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 44 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 44 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 52360 sent, 47723 reached their opponent, 10016 virtual hits (21.0% of those reached).

## Melee bench: F18

hadur117.Hadur 3.21ek against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1468624. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 276 over 6 battles (46.0 per battle, most in one battle 52). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 92.4 | 153 / 210 | 1.60 | 22.1% | 28202 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 22.1% | 153 |
| agd.Mooserwirt2 2.7 | 2.5 | 13.4% | 21 |
| uji.DBH 1.1 | 2.8 | 13.0% | 15 |
| sigterm.Sigterm 1.0 | 4.7 | 10.2% | 9 |
| spinnercat.Robovirus 2.718 | 4.8 | 10.6% | 3 |
| ratosh.Nobo 0.21 | 5.5 | 9.5% | 2 |
| kawigi.mini.Fhqwhgads 1.1 | 6.7 | 9.1% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.2 | 6.5% | 1 |
| stelo.WangRobot 1.0 | 8.8 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 91.8 | 24 / 35 | 4544 |
| 2 | 1 | 70.1 | 91.4 | 25 / 35 | 4748 |
| 3 | 1 | 69.5 | 91.1 | 24 / 35 | 4750 |
| 4 | 1 | 70.3 | 92.5 | 28 / 35 | 4840 |
| 5 | 1 | 70.6 | 95.0 | 26 / 35 | 4629 |
| 6 | 1 | 70.1 | 92.9 | 26 / 35 | 4691 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| uji.DBH 1.1 | 53 | 85% |
| agd.Mooserwirt2 2.7 | 40 | 80% |
| sigterm.Sigterm 1.0 | 39 | 79% |
| spinnercat.Robovirus 2.718 | 20 | 95% |
| kawigi.mini.Fhqwhgads 1.1 | 13 | 85% |
| stelo.WangRobot 1.0 | 8 | 100% |
| ratosh.Nobo 0.21 | 5 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 15 | 26% | 53 |
| uji.DBH 1.1 | 13 | 23% | 43 |
| sigterm.Sigterm 1.0 | 9 | 16% | 34 |
| ratosh.Nobo 0.21 | 9 | 16% | 17 |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 9% | 23 |
| spinnercat.Robovirus 2.718 | 3 | 5% | 22 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 4% | 11 |
| stelo.WangRobot 1.0 | 1 | 2% | 6 |

Posture (Hadur's M records, 200 rounds): 128434 melee ticks, 48253 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 56 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 39971 sent, 35737 reached their opponent, 8134 virtual hits (22.8% of those reached).

## Melee bench: F19

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1471028. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 211 over 6 battles (35.2 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.4 | 97.7 | 189 / 210 | 1.20 | 22.4% | 38025 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 22.4% | 189 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.8% | 12 |
| mld.Infinity 2.2 | 3.7 | 12.0% | 3 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.2% | 3 |
| erdnis.Rover 0.3 | 4.7 | 10.1% | 3 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.3% | 0 |
| mbh.Mbh 0.1 | 7.0 | 7.5% | 0 |
| pac.ABC 2.1 | 7.7 | 7.0% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.4% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.0 | 98.4 | 31 / 35 | 6783 |
| 2 | 1 | 73.7 | 97.5 | 32 / 35 | 6528 |
| 3 | 1 | 73.2 | 97.1 | 33 / 35 | 6127 |
| 4 | 1 | 73.5 | 97.8 | 31 / 35 | 6540 |
| 5 | 1 | 73.4 | 98.7 | 32 / 35 | 6209 |
| 6 | 1 | 72.8 | 96.8 | 30 / 35 | 5838 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 112 | 96% |
| mld.Infinity 2.2 | 30 | 97% |
| krillr.mini.JointStrike 2.0.0 | 24 | 88% |
| erdnis.Rover 0.3 | 10 | 80% |
| patson.PatsonTestBot 1.0 | 10 | 100% |
| pac.ABC 2.1 | 8 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |
| pedersen.Moron 2.0 | 1 | 100% |

Hadur died in 21 of 210 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 9 | 43% | 73 |
| krillr.mini.JointStrike 2.0.0 | 5 | 24% | 36 |
| erdnis.Rover 0.3 | 4 | 19% | 20 |
| mld.Infinity 2.2 | 2 | 10% | 35 |
| patson.PatsonTestBot 1.0 | 1 | 5% | 20 |
| mbh.Mbh 0.1 | 0 | 0% | 13 |
| pac.ABC 2.1 | 0 | 0% | 6 |
| pbg.R2D2 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 199 rounds): 127512 melee ticks, 38309 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 47 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 42525 sent, 38008 reached their opponent, 9188 virtual hits (24.2% of those reached).

## Melee bench: F20

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480947. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 134 over 6 battles (22.3 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 93.7 | 147 / 210 | 1.57 | 21.3% | 37427 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 21.3% | 147 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.9% | 33 |
| fwb.Nine 1.0.1 | 3.8 | 11.0% | 12 |
| catcat20.Rabbit 0.001 | 4.0 | 10.8% | 15 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.9% | 1 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 8.2% | 1 |
| bayen.nut.Squirrel 1.615 | 7.2 | 6.9% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.3 | 5.6% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.3 | 6.0% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 95.6 | 26 / 35 | 6171 |
| 2 | 1 | 71.0 | 90.8 | 23 / 35 | 6163 |
| 3 | 1 | 72.3 | 94.9 | 24 / 35 | 6472 |
| 4 | 1 | 72.2 | 93.3 | 26 / 35 | 6202 |
| 5 | 1 | 72.0 | 93.3 | 23 / 35 | 6317 |
| 6 | 1 | 71.9 | 94.0 | 25 / 35 | 6102 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 94 | 80% |
| catcat20.Rabbit 0.001 | 36 | 69% |
| fwb.Nine 1.0.1 | 33 | 94% |
| nz.jdc.nano.GridFu 1.0 | 10 | 100% |
| m3thos.mini.Eva01 0.5.5 | 5 | 80% |
| bayen.nut.Squirrel 1.615 | 1 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 1013. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 31 | 49% | 104 |
| catcat20.Rabbit 0.001 | 17 | 27% | 52 |
| fwb.Nine 1.0.1 | 9 | 14% | 21 |
| nz.jdc.nano.GridFu 1.0 | 2 | 3% | 15 |
| m3thos.mini.Eva01 0.5.5 | 2 | 3% | 5 |
| bayen.nut.Squirrel 1.615 | 2 | 3% | 5 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 159662 melee ticks, 52664 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 33 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 49679 sent, 45048 reached their opponent, 10045 virtual hits (22.3% of those reached).

## Melee bench: F21

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1482340. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 128 over 6 battles (21.3 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 93.9 | 149 / 210 | 1.55 | 21.5% | 37835 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 21.5% | 149 |
| eem.EvBot v4.6.16 | 2.0 | 16.0% | 51 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.2% | 6 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.5% | 2 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.0% | 1 |
| eld.Hmm 1.0 | 5.5 | 8.2% | 2 |
| fire219.CatBot 1.0 | 7.3 | 6.0% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.4% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 92.1 | 24 / 35 | 6293 |
| 2 | 1 | 72.2 | 93.7 | 25 / 35 | 6338 |
| 3 | 1 | 72.6 | 96.2 | 26 / 35 | 6127 |
| 4 | 1 | 72.3 | 93.3 | 23 / 35 | 6487 |
| 5 | 1 | 72.2 | 92.7 | 27 / 35 | 6290 |
| 6 | 1 | 72.5 | 95.6 | 24 / 35 | 6300 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 125 | 74% |
| dummy.mini.Scimitar 1.01 | 31 | 84% |
| cf.RiO.RiOx 4.2.1 | 24 | 100% |
| eld.Hmm 1.0 | 7 | 71% |
| oa.weak.BotherBot 0.1 | 2 | 50% |

Hadur died in 62 of 210 rounds, at a mean tick of 1237. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 37 | 60% | 94 |
| dummy.mini.Scimitar 1.01 | 8 | 13% | 59 |
| cf.RiO.RiOx 4.2.1 | 7 | 11% | 29 |
| eld.Hmm 1.0 | 4 | 6% | 16 |
| oa.weak.BotherBot 0.1 | 3 | 5% | 6 |
| PSW.Relentless 0.1 | 2 | 3% | 3 |
| fire219.CatBot 1.0 | 1 | 2% | 1 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 174114 melee ticks, 68687 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 55 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 50542 sent, 46025 reached their opponent, 8060 virtual hits (17.5% of those reached).

## Melee bench: F22

hadur117.Hadur 3.21ek against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1471584. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 170 over 6 battles (28.3 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.5 | 106 / 210 | 1.92 | 20.3% | 26833 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 20.3% | 106 |
| pe.SandboxDT 2.71m | 2.3 | 16.6% | 43 |
| kvk.HebusLeTroll 0.35 | 2.7 | 15.8% | 29 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.6% | 24 |
| bigpete.Stewie 1.0 | 5.0 | 10.8% | 6 |
| yk.JahRoslav 1.1 | 6.3 | 6.7% | 2 |
| tad.Dalek98 0.98 | 7.2 | 6.1% | 1 |
| gg.Squaraus 0.6 | 7.7 | 5.6% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 90.7 | 17 / 35 | 4644 |
| 2 | 1 | 69.2 | 89.6 | 22 / 35 | 4587 |
| 3 | 1 | 68.6 | 87.5 | 12 / 35 | 4695 |
| 4 | 1 | 66.0 | 83.2 | 17 / 35 | 3797 |
| 5 | 1 | 68.7 | 88.2 | 18 / 35 | 4398 |
| 6 | 1 | 70.2 | 91.4 | 20 / 35 | 4712 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 55 | 45% |
| kvk.HebusLeTroll 0.35 | 54 | 80% |
| jlm.javaDisturbance 0.59 | 41 | 68% |
| bigpete.Stewie 1.0 | 9 | 67% |
| yk.JahRoslav 1.1 | 2 | 100% |
| tad.Dalek98 0.98 | 2 | 50% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 44 | 42% | 74 |
| kvk.HebusLeTroll 0.35 | 27 | 26% | 63 |
| jlm.javaDisturbance 0.59 | 22 | 21% | 44 |
| bigpete.Stewie 1.0 | 7 | 7% | 18 |
| yk.JahRoslav 1.1 | 2 | 2% | 4 |
| tad.Dalek98 0.98 | 1 | 1% | 2 |
| gg.Squaraus 0.6 | 1 | 1% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 3 |

Posture (Hadur's M records, 199 rounds): 150962 melee ticks, 42822 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 49 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 45133 sent, 41026 reached their opponent, 5646 virtual hits (13.8% of those reached).

## Melee bench: F23

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1476043. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 168 over 6 battles (28.0 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 96.3 | 181 / 210 | 1.33 | 22.2% | 39108 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 22.2% | 181 |
| pe.SandboxLump 1.52 | 2.0 | 16.3% | 21 |
| cre.Karolos 0.32 | 3.0 | 13.7% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 9.6% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.1% | 2 |
| stelo.RamTrackSurfer 1.2 | 5.7 | 8.7% | 0 |
| cw.megas.Blade 0.8 | 6.5 | 8.1% | 0 |
| sample.Walls 1.0 | 7.8 | 6.9% | 0 |
| rrh.Iwillfindyou 2.0 | 9.0 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 95.6 | 26 / 35 | 6706 |
| 2 | 1 | 72.6 | 93.7 | 31 / 35 | 6142 |
| 3 | 1 | 73.0 | 94.9 | 31 / 35 | 6329 |
| 4 | 1 | 73.7 | 99.0 | 33 / 35 | 6422 |
| 5 | 1 | 74.3 | 98.7 | 32 / 35 | 6930 |
| 6 | 1 | 73.3 | 96.2 | 28 / 35 | 6579 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 111 | 89% |
| cre.Karolos 0.32 | 56 | 98% |
| stelo.AreaTargetingBot 1.1 | 8 | 100% |
| stelo.RamTrackSurfer 1.2 | 7 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |

Hadur died in 29 of 210 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 20 | 69% | 110 |
| cre.Karolos 0.32 | 5 | 17% | 59 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 7% | 8 |
| stelo.AreaTargetingBot 1.1 | 1 | 3% | 7 |
| cw.megas.Blade 0.8 | 1 | 3% | 4 |
| stelo.RamTrackSurfer 1.2 | 0 | 0% | 14 |
| sample.Walls 1.0 | 0 | 0% | 4 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 122907 melee ticks, 46123 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 50 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 38950 sent, 34187 reached their opponent, 9881 virtual hits (28.9% of those reached).

## Melee bench: F24

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475791. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 183 over 6 battles (30.5 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 84.6 | 89 / 210 | 2.39 | 17.6% | 26334 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 17.6% | 89 |
| rz.GlowBlowMelee 1.4 | 2.2 | 14.3% | 37 |
| davidalves.Phoenix 0.54 | 3.3 | 13.0% | 38 |
| florent.XSeries.X2 0.12 | 3.8 | 12.5% | 25 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.6% | 13 |
| oog.melee.Corsair 1.0 | 6.0 | 9.5% | 5 |
| stelo.SoJNanoMelee 1.1 | 7.5 | 6.6% | 2 |
| lunchie.Lunchbox 0.93 | 7.7 | 6.0% | 1 |
| as.FrankTheTank 1.3 | 9.2 | 4.8% | 0 |
| evd.X1 0.01 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 79.4 | 11 / 35 | 4377 |
| 2 | 1 | 65.6 | 81.0 | 14 / 35 | 3953 |
| 3 | 1 | 69.0 | 90.2 | 20 / 35 | 4703 |
| 4 | 1 | 65.5 | 80.3 | 13 / 35 | 4285 |
| 5 | 1 | 69.0 | 89.8 | 16 / 35 | 4561 |
| 6 | 1 | 67.8 | 86.7 | 15 / 35 | 4455 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 41 | 63% |
| davidalves.Phoenix 0.54 | 36 | 42% |
| pedersen.Ugluk 1.1.1 | 29 | 72% |
| florent.XSeries.X2 0.12 | 22 | 68% |
| stelo.SoJNanoMelee 1.1 | 6 | 100% |
| oog.melee.Corsair 1.0 | 6 | 67% |
| lunchie.Lunchbox 0.93 | 2 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 36 | 30% | 67 |
| davidalves.Phoenix 0.54 | 36 | 30% | 47 |
| florent.XSeries.X2 0.12 | 20 | 16% | 37 |
| pedersen.Ugluk 1.1.1 | 16 | 13% | 27 |
| oog.melee.Corsair 1.0 | 11 | 9% | 23 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 4 |
| stelo.SoJNanoMelee 1.1 | 1 | 1% | 3 |
| as.FrankTheTank 1.3 | 1 | 1% | 1 |
| evd.X1 0.01 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 139814 melee ticks, 33853 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 40 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45718 sent, 40894 reached their opponent, 7484 virtual hits (18.3% of those reached).

## Melee bench: F25

hadur117.Hadur 3.21ek against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1466731. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 149 over 6 battles (24.8 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 89.5 | 149 / 210 | 1.84 | 21.2% | 23503 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 21.2% | 149 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 14.9% | 14 |
| voidious.mini.BrokenSword 2.0.3 | 2.7 | 14.3% | 17 |
| jdw.Hurricane 1.4 | 4.0 | 12.6% | 19 |
| ds.Oo 2.2 | 4.8 | 10.4% | 6 |
| awesomeness.Elite 1.0 | 6.8 | 7.7% | 1 |
| adt.Ar2 1.1 | 6.8 | 7.4% | 0 |
| gjr.Cephalosporin 0.1 | 7.3 | 6.7% | 4 |
| amk.ChumbaMini 0.2 | 9.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 83.2 | 20 / 35 | 3516 |
| 2 | 1 | 66.8 | 82.9 | 20 / 35 | 3695 |
| 3 | 1 | 71.5 | 95.7 | 29 / 35 | 4286 |
| 4 | 1 | 69.1 | 90.0 | 25 / 35 | 3786 |
| 5 | 1 | 70.6 | 93.2 | 28 / 35 | 4190 |
| 6 | 1 | 70.0 | 91.8 | 27 / 35 | 4030 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 52 | 92% |
| voidious.mini.BrokenSword 2.0.3 | 50 | 92% |
| jdw.Hurricane 1.4 | 31 | 81% |
| ds.Oo 2.2 | 15 | 80% |
| awesomeness.Elite 1.0 | 7 | 100% |
| adt.Ar2 1.1 | 7 | 100% |
| amk.ChumbaMini 0.2 | 3 | 100% |
| gjr.Cephalosporin 0.1 | 2 | 50% |

Hadur died in 61 of 210 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 18 | 30% | 56 |
| jdw.Hurricane 1.4 | 13 | 21% | 41 |
| voidious.mini.BrokenSword 2.0.3 | 10 | 16% | 54 |
| ds.Oo 2.2 | 10 | 16% | 23 |
| gjr.Cephalosporin 0.1 | 4 | 7% | 7 |
| adt.Ar2 1.1 | 3 | 5% | 14 |
| awesomeness.Elite 1.0 | 3 | 5% | 8 |
| amk.ChumbaMini 0.2 | 0 | 0% | 4 |

Posture (Hadur's M records, 198 rounds): 118926 melee ticks, 28394 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 27 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 27 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 38593 sent, 34425 reached their opponent, 5655 virtual hits (16.4% of those reached).

## Melee bench: F26

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1468040. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 212 over 6 battles (35.3 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 92.9 | 143 / 210 | 1.64 | 21.2% | 39977 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 21.2% | 143 |
| ak.Fermat 2.0 | 2.0 | 14.9% | 35 |
| lrem.Spectre 0.4.4 | 3.3 | 12.3% | 16 |
| shu.nitro.LENIN .T34 | 3.7 | 12.1% | 13 |
| js.PinBall 1.6 | 5.2 | 10.5% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.3% | 0 |
| gh.mini.GrubbmOne 1.0 | 6.8 | 7.9% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.7% | 1 |
| sample.SpinBot 1.0 | 9.0 | 3.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 89.5 | 23 / 35 | 6212 |
| 2 | 1 | 70.6 | 88.3 | 18 / 35 | 6277 |
| 3 | 1 | 73.9 | 97.5 | 28 / 35 | 7136 |
| 4 | 1 | 71.5 | 90.5 | 21 / 35 | 6590 |
| 5 | 1 | 73.4 | 94.9 | 26 / 35 | 7208 |
| 6 | 1 | 73.1 | 96.8 | 27 / 35 | 6554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 65 | 69% |
| shu.nitro.LENIN .T34 | 40 | 90% |
| lrem.Spectre 0.4.4 | 38 | 82% |
| js.PinBall 1.6 | 22 | 91% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |
| gh.mini.GrubbmOne 1.0 | 1 | 0% |

Hadur died in 68 of 210 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 34 | 50% | 79 |
| shu.nitro.LENIN .T34 | 13 | 19% | 52 |
| lrem.Spectre 0.4.4 | 9 | 13% | 36 |
| jaybot.adv.bots.JayBot 2.0 | 6 | 9% | 12 |
| js.PinBall 1.6 | 2 | 3% | 21 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 3% | 5 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 3 |
| sample.SpinBot 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 152433 melee ticks, 43593 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 31 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 50077 sent, 45389 reached their opponent, 10861 virtual hits (23.9% of those reached).

## Melee bench: F27

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475401. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 161 over 6 battles (26.8 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 85.8 | 159 / 210 | 2.28 | 19.5% | 31568 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 19.5% | 159 |
| mk.Alpha 0.2.1 | 2.0 | 14.4% | 24 |
| EH.Eagle 1.0.6 | 3.2 | 11.1% | 4 |
| wee.Gem 1.8.4 | 4.8 | 9.8% | 12 |
| joe.ADinosaur 1.0 | 5.7 | 8.9% | 0 |
| sheldor.melee.nano.TestMelee 0.1 | 5.7 | 9.2% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 6.8 | 8.1% | 2 |
| throxbot.ThroxBot 0.1 | 7.3 | 7.5% | 2 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.8% | 2 |
| cs.Grudge 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 99.0 | 34 / 35 | 5338 |
| 2 | 1 | 70.7 | 94.0 | 29 / 35 | 5200 |
| 3 | 1 | 72.5 | 97.1 | 32 / 35 | 5658 |
| 4 | 1 | 62.7 | 62.9 | 17 / 35 | 4877 |
| 5 | 1 | 64.4 | 66.3 | 19 / 35 | 5289 |
| 6 | 1 | 70.9 | 95.2 | 28 / 35 | 5206 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 102 | 95% |
| EH.Eagle 1.0.6 | 29 | 100% |
| throxbot.ThroxBot 0.1 | 8 | 100% |
| wee.Gem 1.8.4 | 8 | 88% |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |
| joe.ADinosaur 1.0 | 3 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 451. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cs.Grudge 1.0 | 16 | 31% | 19 |
| mk.Alpha 0.2.1 | 13 | 25% | 100 |
| EH.Eagle 1.0.6 | 5 | 10% | 34 |
| wee.Gem 1.8.4 | 4 | 8% | 14 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 8% | 14 |
| throxbot.ThroxBot 0.1 | 4 | 8% | 9 |
| joe.ADinosaur 1.0 | 3 | 6% | 9 |
| caimano.Furia_Ceca 0.22 | 2 | 4% | 7 |
| techdude.kombat.FlamingKombat 1.5 | 0 | 0% | 4 |

Posture (Hadur's M records, 198 rounds): 117229 melee ticks, 34234 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 34 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 38853 sent, 34217 reached their opponent, 8416 virtual hits (24.6% of those reached).

## Melee bench: F28

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1472526. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 163 over 6 battles (27.2 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 89.2 | 131 / 210 | 1.98 | 18.5% | 24059 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 18.5% | 131 |
| kid.test.NightFox .2 | 2.0 | 14.8% | 33 |
| uji.Antique 1.0 | 3.2 | 12.7% | 23 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 10.6% | 9 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.1% | 4 |
| amk.ChumbaWumba 0.3 | 6.0 | 8.4% | 5 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.8% | 4 |
| matt.advanced.Katana 1.0 | 8.5 | 6.2% | 2 |
| stelo.Lifestealer 1.0 | 9.2 | 5.7% | 0 |
| stelo.PianistNano 1.2 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 93.0 | 25 / 35 | 3976 |
| 2 | 1 | 66.8 | 85.7 | 18 / 35 | 3996 |
| 3 | 1 | 65.5 | 81.6 | 18 / 35 | 3652 |
| 4 | 1 | 68.6 | 91.1 | 22 / 35 | 4304 |
| 5 | 1 | 69.8 | 94.3 | 26 / 35 | 4175 |
| 6 | 1 | 68.0 | 89.2 | 22 / 35 | 3956 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 77 | 83% |
| uji.Antique 1.0 | 50 | 84% |
| qohnil.blot.BlotBot 3.61 | 12 | 83% |
| amk.ChumbaWumba 0.3 | 6 | 83% |
| ahr.ice.Ice 1.0.2 | 5 | 60% |
| matt.advanced.Katana 1.0 | 5 | 60% |
| pfvicm.Sobieski 7.2.3b | 5 | 60% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 26 | 31% | 57 |
| uji.Antique 1.0 | 16 | 19% | 58 |
| pfvicm.Sobieski 7.2.3b | 11 | 13% | 21 |
| amk.ChumbaWumba 0.3 | 11 | 13% | 19 |
| qohnil.blot.BlotBot 3.61 | 8 | 10% | 24 |
| ahr.ice.Ice 1.0.2 | 5 | 6% | 15 |
| matt.advanced.Katana 1.0 | 3 | 4% | 8 |
| stelo.Lifestealer 1.0 | 2 | 2% | 4 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |

Posture (Hadur's M records, 199 rounds): 130382 melee ticks, 31642 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 70 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43788 sent, 39132 reached their opponent, 5657 virtual hits (14.5% of those reached).

## Melee bench: F29

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1476405. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 164 over 6 battles (27.3 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.1 | 117 / 210 | 1.90 | 19.8% | 30099 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 19.8% | 117 |
| deewiant.Anomaly 0.2 | 2.2 | 15.2% | 40 |
| zyx.mega.YersiniaPestis 3.1 | 2.8 | 14.4% | 39 |
| myl.micro.Troodon 1.10 | 4.0 | 11.9% | 8 |
| jok.PheonixM 0.1.2 | 5.0 | 10.2% | 2 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.4% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.3 | 6.1% | 0 |
| DBall.Anarchy 0.1 | 8.3 | 5.2% | 0 |
| ap.Frederick 1.1 | 8.5 | 4.9% | 3 |
| jangs.ns51 1.0 | 9.8 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 90.8 | 21 / 35 | 4777 |
| 2 | 1 | 69.3 | 87.0 | 18 / 35 | 4739 |
| 3 | 1 | 71.6 | 91.7 | 24 / 35 | 5526 |
| 4 | 1 | 70.7 | 92.1 | 20 / 35 | 5185 |
| 5 | 1 | 71.3 | 92.7 | 21 / 35 | 5300 |
| 6 | 1 | 68.2 | 86.0 | 13 / 35 | 4572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 77 | 69% |
| zyx.mega.YersiniaPestis 3.1 | 44 | 55% |
| myl.micro.Troodon 1.10 | 26 | 92% |
| jok.PheonixM 0.1.2 | 10 | 90% |
| ap.Frederick 1.1 | 4 | 100% |
| jangs.ns51 1.0 | 2 | 50% |
| DBall.Anarchy 0.1 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 1029. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 38 | 40% | 99 |
| zyx.mega.YersiniaPestis 3.1 | 32 | 34% | 56 |
| myl.micro.Troodon 1.10 | 9 | 10% | 24 |
| jok.PheonixM 0.1.2 | 5 | 5% | 14 |
| ph.melee.ArcherME 0.3 | 4 | 4% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 3% | 3 |
| jangs.ns51 1.0 | 2 | 2% | 3 |
| DBall.Anarchy 0.1 | 1 | 1% | 7 |

Posture (Hadur's M records, 198 rounds): 169947 melee ticks, 47149 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 40 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 53916 sent, 49293 reached their opponent, 7419 virtual hits (15.1% of those reached).

## Melee bench: F30

hadur117.Hadur 3.21ek against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1472127. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 154 over 6 battles (25.7 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 82.2 | 86 / 210 | 2.42 | 18.8% | 25774 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 18.8% | 86 |
| darkcanuck.B26354 1.06 | 2.3 | 15.2% | 46 |
| stelo.PastFuture 2.3.2 | 3.2 | 14.8% | 27 |
| oog.melee.Capulet 1.2 | 3.5 | 14.3% | 36 |
| intruder.PrairieWolf 2.61 | 5.5 | 9.6% | 7 |
| tripphippy.Alice 1.1 | 6.2 | 8.7% | 4 |
| fowl3628800.LightningBolt 2.6.0 | 7.0 | 7.5% | 4 |
| ntc.Opposite 1.5 | 7.3 | 8.0% | 0 |
| GarmBox.Anger 1.0 | 9.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 78.2 | 11 / 35 | 4034 |
| 2 | 1 | 67.1 | 84.6 | 14 / 35 | 4349 |
| 3 | 1 | 67.1 | 83.2 | 14 / 35 | 4394 |
| 4 | 1 | 67.7 | 85.4 | 17 / 35 | 4612 |
| 5 | 1 | 64.9 | 79.3 | 13 / 35 | 4003 |
| 6 | 1 | 66.6 | 82.5 | 17 / 35 | 4382 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 41 | 59% |
| oog.melee.Capulet 1.2 | 36 | 67% |
| stelo.PastFuture 2.3.2 | 33 | 55% |
| intruder.PrairieWolf 2.61 | 9 | 100% |
| tripphippy.Alice 1.1 | 6 | 67% |
| fowl3628800.LightningBolt 2.6.0 | 6 | 100% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 37 | 30% | 62 |
| darkcanuck.B26354 1.06 | 34 | 27% | 55 |
| stelo.PastFuture 2.3.2 | 27 | 22% | 47 |
| tripphippy.Alice 1.1 | 9 | 7% | 14 |
| intruder.PrairieWolf 2.61 | 8 | 6% | 17 |
| fowl3628800.LightningBolt 2.6.0 | 5 | 4% | 8 |
| ntc.Opposite 1.5 | 5 | 4% | 7 |

Posture (Hadur's M records, 202 rounds): 160592 melee ticks, 36035 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 73 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 47248 sent, 42869 reached their opponent, 7307 virtual hits (17.0% of those reached).

## Melee bench: F31

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474107. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 165 over 6 battles (27.5 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 83.4 | 82 / 210 | 2.49 | 17.1% | 24236 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.3 | 17.7% | 80 |
| hadur117.Hadur 3.21ek | 1.7 | 17.1% | 82 |
| gh.mini.Griezel 0.2 | 3.2 | 12.7% | 40 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.0% | 2 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.2% | 5 |
| gh.nano.Grofvuil 0.2 | 6.2 | 8.7% | 2 |
| timmit.nano.TimDog 0.33 | 7.0 | 6.5% | 0 |
| fm.mammillarias 1.3 | 8.5 | 5.5% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 4.9% | 0 |
| tlp.ThreeLeggedPig 1 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 86.0 | 15 / 35 | 4229 |
| 2 | 1 | 67.9 | 87.0 | 18 / 35 | 4278 |
| 3 | 2 | 67.4 | 85.7 | 15 / 35 | 3970 |
| 4 | 2 | 65.2 | 80.0 | 13 / 35 | 3905 |
| 5 | 2 | 65.9 | 81.3 | 11 / 35 | 3873 |
| 6 | 2 | 65.1 | 80.6 | 10 / 35 | 3981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 63 | 56% |
| gh.mini.Griezel 0.2 | 40 | 55% |
| spinnercat.micro.Tyger 0.1 | 12 | 92% |
| d414.nano.Quantum 1.0.0 | 11 | 91% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 54 | 42% | 91 |
| gh.mini.Griezel 0.2 | 36 | 28% | 60 |
| d414.nano.Quantum 1.0.0 | 14 | 11% | 25 |
| gh.nano.Grofvuil 0.2 | 10 | 8% | 12 |
| spinnercat.micro.Tyger 0.1 | 6 | 5% | 10 |
| timmit.nano.TimDog 0.33 | 3 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 3 | 2% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 2 |
| fm.mammillarias 1.3 | 1 | 1% | 1 |

Posture (Hadur's M records, 200 rounds): 151006 melee ticks, 35761 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 40 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 2.

Targeting waves (200 rounds): 48433 sent, 43664 reached their opponent, 7139 virtual hits (16.3% of those reached).

## Melee bench: F32

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478626. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 178 over 6 battles (29.7 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 90.6 | 132 / 210 | 1.85 | 19.2% | 29391 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 19.2% | 132 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.0% | 46 |
| apc.botM 3.0 | 3.0 | 12.2% | 15 |
| lxx.ConceptA 0.8 | 4.3 | 10.2% | 4 |
| vjik.UnViolation 1.1 | 4.8 | 9.8% | 4 |
| bayen.UbaMicro 1.4 | 5.8 | 9.1% | 2 |
| yk.JahMicro 1.0 | 7.8 | 7.1% | 6 |
| panzer.Panzer 0.2 | 7.8 | 6.9% | 0 |
| conscience.Electron 1.3g | 8.3 | 6.3% | 1 |
| donjezza.Jezza 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 94.6 | 25 / 35 | 5319 |
| 2 | 1 | 67.7 | 88.9 | 20 / 35 | 4562 |
| 3 | 1 | 69.1 | 90.2 | 19 / 35 | 4973 |
| 4 | 1 | 69.8 | 91.7 | 23 / 35 | 5173 |
| 5 | 1 | 68.9 | 89.5 | 24 / 35 | 4793 |
| 6 | 1 | 68.0 | 88.6 | 21 / 35 | 4571 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 90 | 67% |
| apc.botM 3.0 | 38 | 79% |
| lxx.ConceptA 0.8 | 14 | 79% |
| vjik.UnViolation 1.1 | 14 | 100% |
| yk.JahMicro 1.0 | 12 | 83% |
| bayen.UbaMicro 1.4 | 4 | 75% |
| donjezza.Jezza 1.0 | 2 | 100% |
| panzer.Panzer 0.2 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 34 | 43% | 85 |
| apc.botM 3.0 | 14 | 18% | 48 |
| lxx.ConceptA 0.8 | 13 | 16% | 22 |
| bayen.UbaMicro 1.4 | 9 | 11% | 14 |
| vjik.UnViolation 1.1 | 4 | 5% | 24 |
| yk.JahMicro 1.0 | 2 | 3% | 9 |
| conscience.Electron 1.3g | 2 | 3% | 5 |
| panzer.Panzer 0.2 | 1 | 1% | 2 |

Posture (Hadur's M records, 200 rounds): 120471 melee ticks, 48241 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 39 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 40915 sent, 36205 reached their opponent, 6674 virtual hits (18.4% of those reached).

## Melee bench: F33

hadur117.Hadur 3.21ek against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1473997. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 159 over 6 battles (26.5 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 88.5 | 133 / 210 | 1.92 | 21.7% | 28913 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 21.7% | 133 |
| maribo.Quester 0.3 | 2.0 | 18.0% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 13.5% | 16 |
| labg.Cataclysm 2.05 | 3.8 | 12.2% | 15 |
| baal.nano.N 1.42 | 5.5 | 9.6% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.5 | 9.8% | 5 |
| zyx.micro.Ant 1.1 | 7.0 | 6.9% | 1 |
| sanja.First 0.1 | 8.0 | 5.1% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 91.1 | 23 / 35 | 4870 |
| 2 | 1 | 70.2 | 87.1 | 21 / 35 | 4840 |
| 3 | 1 | 71.0 | 90.4 | 25 / 35 | 4768 |
| 4 | 1 | 70.4 | 91.4 | 22 / 35 | 4627 |
| 5 | 1 | 70.5 | 86.4 | 24 / 35 | 5087 |
| 6 | 1 | 69.2 | 84.3 | 18 / 35 | 4721 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 80 | 83% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 46 | 80% |
| labg.Cataclysm 2.05 | 21 | 76% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 75% |
| baal.nano.N 1.42 | 6 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 30 | 38% | 86 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 21% | 57 |
| labg.Cataclysm 2.05 | 13 | 17% | 28 |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 13% | 16 |
| zyx.micro.Ant 1.1 | 5 | 6% | 8 |
| sanja.First 0.1 | 2 | 3% | 4 |
| baal.nano.N 1.42 | 1 | 1% | 10 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 155127 melee ticks, 43591 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 45969 sent, 41877 reached their opponent, 6350 virtual hits (15.2% of those reached).

## Melee bench: F34

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475399. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 162 over 6 battles (27.0 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 91.0 | 115 / 210 | 1.81 | 19.5% | 32238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 19.5% | 115 |
| kid.Gladiator .7.2 | 2.2 | 16.4% | 45 |
| stelo.Spread 0.9 | 2.8 | 15.3% | 36 |
| tcf.Reach 3 | 4.5 | 11.2% | 4 |
| jcs.Seth 1.8 | 4.5 | 11.0% | 10 |
| cli.Dancer 1.1 | 6.0 | 9.0% | 0 |
| ratosh.Wesco 1.4 | 7.2 | 6.9% | 0 |
| amk.Punbot.Punbot 0.01 | 7.8 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.1% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.4 | 21 / 35 | 5369 |
| 2 | 1 | 70.8 | 91.1 | 20 / 35 | 5455 |
| 3 | 1 | 70.7 | 89.8 | 18 / 35 | 5491 |
| 4 | 1 | 69.5 | 89.2 | 16 / 35 | 5107 |
| 5 | 1 | 70.3 | 92.1 | 20 / 35 | 5278 |
| 6 | 1 | 70.9 | 92.4 | 20 / 35 | 5538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 73 | 59% |
| stelo.Spread 0.9 | 58 | 79% |
| jcs.Seth 1.8 | 21 | 76% |
| tcf.Reach 3 | 7 | 57% |
| ratosh.Wesco 1.4 | 4 | 100% |
| cli.Dancer 1.1 | 2 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 1076. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 48 | 50% | 84 |
| stelo.Spread 0.9 | 27 | 28% | 66 |
| jcs.Seth 1.8 | 11 | 11% | 34 |
| tcf.Reach 3 | 9 | 9% | 17 |
| ratosh.Wesco 1.4 | 1 | 1% | 3 |
| cli.Dancer 1.1 | 0 | 0% | 5 |

Posture (Hadur's M records, 200 rounds): 166476 melee ticks, 56249 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 34 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 51256 sent, 46607 reached their opponent, 7563 virtual hits (16.2% of those reached).

## Melee bench: F35

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1473888. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 130 over 6 battles (21.7 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 85.3 | 51 / 210 | 2.32 | 16.8% | 24254 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.6% | 135 |
| hadur117.Hadur 3.21ek | 2.0 | 16.8% | 51 |
| gh.mini.Gruwel 0.9 | 3.3 | 12.6% | 16 |
| rz.HawkOnFire 0.1 | 4.3 | 11.3% | 4 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.6% | 4 |
| wit.Chuliath 1.0 | 6.0 | 7.1% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.8% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.3 | 5.3% | 0 |
| dans.Cinnamon 1.2 | 8.8 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.2 | 87.6 | 10 / 35 | 4246 |
| 2 | 2 | 66.0 | 85.7 | 2 / 35 | 4047 |
| 3 | 2 | 65.8 | 83.5 | 8 / 35 | 4125 |
| 4 | 2 | 67.2 | 87.0 | 11 / 35 | 3945 |
| 5 | 2 | 67.4 | 87.9 | 12 / 35 | 4066 |
| 6 | 2 | 64.8 | 80.0 | 8 / 35 | 3825 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 106 | 23% |
| gh.mini.Gruwel 0.9 | 28 | 57% |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 63% |
| rz.HawkOnFire 0.1 | 6 | 67% |
| wit.Chuliath 1.0 | 1 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 106 | 67% | 133 |
| gh.mini.Gruwel 0.9 | 24 | 15% | 37 |
| dmh.robocode.robot.BlackDeath 9.2 | 17 | 11% | 21 |
| rz.HawkOnFire 0.1 | 6 | 4% | 12 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 3% | 4 |
| wit.Chuliath 1.0 | 1 | 1% | 2 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |

Posture (Hadur's M records, 199 rounds): 144224 melee ticks, 52757 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 49 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 44796 sent, 39945 reached their opponent, 6148 virtual hits (15.4% of those reached).

## Melee bench: F36

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1473899. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 214 over 6 battles (35.7 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 93.7 | 158 / 210 | 1.57 | 21.1% | 33629 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 21.1% | 158 |
| alpha.RainingFire 1.0 | 2.7 | 12.3% | 14 |
| bzdp.Pansy 2.1 | 2.8 | 12.1% | 11 |
| bvh.micro.Freya 0.3 | 4.3 | 10.9% | 10 |
| mz.Cork 0.1 | 5.0 | 10.8% | 7 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.9% | 3 |
| bvh.mini.Fenrir 0.39 | 6.2 | 9.5% | 6 |
| dl.BetterWalls 1.0 | 8.5 | 4.9% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 5.3% | 1 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 95.2 | 27 / 35 | 5416 |
| 2 | 1 | 71.8 | 93.3 | 27 / 35 | 5615 |
| 3 | 1 | 71.0 | 92.4 | 26 / 35 | 5633 |
| 4 | 1 | 70.9 | 91.1 | 25 / 35 | 5244 |
| 5 | 1 | 72.5 | 95.6 | 28 / 35 | 5942 |
| 6 | 1 | 71.9 | 94.3 | 25 / 35 | 5779 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 50 | 88% |
| bvh.micro.Freya 0.3 | 34 | 88% |
| alpha.RainingFire 1.0 | 31 | 74% |
| mz.Cork 0.1 | 27 | 89% |
| m3thos.Eva02 0.7.1 | 21 | 90% |
| bvh.mini.Fenrir 0.39 | 15 | 87% |
| dl.BetterWalls 1.0 | 5 | 80% |
| sample.MyFirstRobot 1.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 15 | 28% | 39 |
| bzdp.Pansy 2.1 | 12 | 22% | 56 |
| bvh.micro.Freya 0.3 | 7 | 13% | 32 |
| bvh.mini.Fenrir 0.39 | 7 | 13% | 17 |
| m3thos.Eva02 0.7.1 | 5 | 9% | 30 |
| mz.Cork 0.1 | 5 | 9% | 26 |
| dl.BetterWalls 1.0 | 1 | 2% | 5 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 139460 melee ticks, 43788 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 48 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 48118 sent, 43546 reached their opponent, 8698 virtual hits (20.0% of those reached).

## Melee bench: F37

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1476587. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 257 over 6 battles (42.8 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.7 | 164 / 210 | 2.01 | 19.5% | 34474 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 19.5% | 164 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.8 | 10.9% | 6 |
| germ.TheMind .2 | 3.5 | 10.1% | 8 |
| EBBU.Sim2 1.02 | 5.0 | 9.2% | 3 |
| agrach.Dalek 1.0 | 5.7 | 9.0% | 4 |
| mb.Beast 0.1 | 6.3 | 9.0% | 10 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.4% | 7 |
| lmk.ACPFinal 0.1 | 7.2 | 8.4% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 7.2 | 8.4% | 2 |
| skm.Ryubot 1.0 | 9.3 | 7.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 86.7 | 26 / 35 | 5529 |
| 2 | 1 | 68.5 | 87.3 | 27 / 35 | 5703 |
| 3 | 1 | 70.4 | 97.8 | 32 / 35 | 5547 |
| 4 | 1 | 68.6 | 86.3 | 25 / 35 | 6091 |
| 5 | 1 | 67.5 | 84.8 | 26 / 35 | 5510 |
| 6 | 1 | 69.2 | 89.5 | 28 / 35 | 6094 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 32 | 97% |
| agrach.Dalek 1.0 | 27 | 100% |
| EBBU.Sim2 1.02 | 23 | 100% |
| germ.TheMind .2 | 22 | 100% |
| stelo.UntouchableNano 1.3 | 21 | 81% |
| mb.Beast 0.1 | 21 | 95% |
| skm.Ryubot 1.0 | 11 | 100% |
| lmk.ACPFinal 0.1 | 11 | 91% |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 75% |

Hadur died in 46 of 210 rounds, at a mean tick of 366. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 16 | 35% | 25 |
| com.syncleus.robocode.Dreadnaught 0.1 | 9 | 20% | 42 |
| stelo.UntouchableNano 1.3 | 6 | 13% | 17 |
| lmk.ACPFinal 0.1 | 5 | 11% | 18 |
| germ.TheMind .2 | 4 | 9% | 23 |
| mb.Beast 0.1 | 4 | 9% | 17 |
| agrach.Dalek 1.0 | 1 | 2% | 33 |
| EBBU.Sim2 1.02 | 1 | 2% | 26 |
| skm.Ryubot 1.0 | 0 | 0% | 6 |

Posture (Hadur's M records, 200 rounds): 91739 melee ticks, 23150 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 104 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 104 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 31353 sent, 26881 reached their opponent, 7987 virtual hits (29.7% of those reached).

## Melee bench: F38

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478431. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 182 over 6 battles (30.3 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 89.8 | 122 / 210 | 1.91 | 18.9% | 28337 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 18.9% | 122 |
| justin.Mallais 14.0 | 2.0 | 15.9% | 54 |
| bvh.mini.Freya 0.55 | 3.2 | 12.3% | 11 |
| cs.Wren 1.0 | 4.7 | 10.6% | 2 |
| bts.mega.Gnarly 1.4 | 4.7 | 10.7% | 14 |
| kdf.KoulDestroyer 1.0 | 5.5 | 10.0% | 4 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 8.4% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 5.4% | 1 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.0% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 90.8 | 22 / 35 | 4957 |
| 2 | 1 | 69.8 | 92.1 | 24 / 35 | 4701 |
| 3 | 1 | 69.3 | 92.1 | 20 / 35 | 4863 |
| 4 | 1 | 68.2 | 88.9 | 17 / 35 | 4483 |
| 5 | 1 | 67.2 | 85.1 | 17 / 35 | 4191 |
| 6 | 1 | 69.8 | 90.2 | 22 / 35 | 5142 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 76 | 67% |
| bts.mega.Gnarly 1.4 | 31 | 71% |
| bvh.mini.Freya 0.55 | 23 | 74% |
| cs.Wren 1.0 | 13 | 100% |
| kdf.KoulDestroyer 1.0 | 13 | 92% |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 75% |
| matt.UnderDark3 2.4.34 | 3 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 50% |

Hadur died in 91 of 210 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 41 | 45% | 86 |
| bts.mega.Gnarly 1.4 | 15 | 16% | 41 |
| bvh.mini.Freya 0.55 | 15 | 16% | 29 |
| kdf.KoulDestroyer 1.0 | 10 | 11% | 15 |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 4% | 10 |
| cs.Wren 1.0 | 3 | 3% | 19 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 2% | 5 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 4 |

Posture (Hadur's M records, 200 rounds): 138287 melee ticks, 40236 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 39 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 44842 sent, 39917 reached their opponent, 8646 virtual hits (21.7% of those reached).

## Melee bench: F39

hadur117.Hadur 3.21ek against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1468406. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 146 over 6 battles (24.3 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 93.3 | 146 / 210 | 1.54 | 22.8% | 34460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 22.8% | 146 |
| bvh.fry.Freya 0.82 | 2.0 | 16.5% | 16 |
| az.Ololobot 0.2.4 | 3.0 | 14.1% | 39 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.3% | 3 |
| gimp.GimpBot 0.1 | 5.3 | 8.7% | 1 |
| apollokidd.ApolloKidd 0.9 | 5.5 | 8.6% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 6.0 | 8.3% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.2 | 6.3% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.8 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 95.0 | 26 / 35 | 6131 |
| 2 | 1 | 72.5 | 97.1 | 30 / 35 | 5953 |
| 3 | 1 | 70.1 | 90.0 | 22 / 35 | 5448 |
| 4 | 1 | 69.7 | 88.2 | 19 / 35 | 5773 |
| 5 | 1 | 70.2 | 93.6 | 22 / 35 | 5089 |
| 6 | 1 | 72.0 | 95.7 | 27 / 35 | 6066 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 82 | 70% |
| bvh.fry.Freya 0.82 | 81 | 88% |
| winamp32.micro.MicroMacro 1.0 | 9 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 4 | 100% |
| gimp.GimpBot 0.1 | 3 | 67% |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 50% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 1091. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 29 | 45% | 88 |
| bvh.fry.Freya 0.82 | 17 | 27% | 74 |
| stelo.SoRobotNanoMelee 1.2 | 5 | 8% | 12 |
| winamp32.micro.MicroMacro 1.0 | 4 | 6% | 12 |
| apollokidd.ApolloKidd 0.9 | 4 | 6% | 6 |
| gimp.GimpBot 0.1 | 3 | 5% | 10 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 2% | 4 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 2% | 3 |

Posture (Hadur's M records, 198 rounds): 153033 melee ticks, 58685 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 63 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 45036 sent, 40934 reached their opponent, 7777 virtual hits (19.0% of those reached).

## Melee bench: F40

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474247. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 187 over 6 battles (31.2 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 91.7 | 141 / 210 | 1.74 | 20.4% | 32259 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 20.4% | 141 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.1% | 31 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.0% | 15 |
| mz.AntiGrav 1.0 | 4.3 | 10.8% | 5 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.3% | 4 |
| stelo.Randomness 1.0 | 6.0 | 9.0% | 11 |
| alpha.BlackIce 1.0 | 6.7 | 8.8% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.6% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 4.0% | 0 |
| sample.Corners 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.8 | 22 / 35 | 5536 |
| 2 | 1 | 70.4 | 89.8 | 22 / 35 | 5387 |
| 3 | 1 | 71.3 | 93.0 | 25 / 35 | 5361 |
| 4 | 1 | 70.9 | 92.4 | 24 / 35 | 5240 |
| 5 | 1 | 71.1 | 92.7 | 24 / 35 | 5201 |
| 6 | 1 | 71.1 | 91.7 | 24 / 35 | 5534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 75 | 80% |
| kano.gamma.KanoGamma 1.8 | 35 | 83% |
| mz.AntiGrav 1.0 | 19 | 95% |
| Polkwane.SmashMelee 1.0 | 17 | 100% |
| stelo.Randomness 1.0 | 13 | 54% |
| alpha.BlackIce 1.0 | 10 | 80% |
| amk.superstrike.SuperStrike 0.3 | 3 | 67% |

Hadur died in 69 of 210 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 23 | 33% | 66 |
| kano.gamma.KanoGamma 1.8 | 15 | 22% | 50 |
| stelo.Randomness 1.0 | 13 | 19% | 28 |
| Polkwane.SmashMelee 1.0 | 8 | 12% | 22 |
| alpha.BlackIce 1.0 | 4 | 6% | 15 |
| mz.AntiGrav 1.0 | 3 | 4% | 17 |
| amk.superstrike.SuperStrike 0.3 | 3 | 4% | 6 |
| sample.Corners 1.0 | 0 | 0% | 3 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 201 rounds): 147990 melee ticks, 39836 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 103 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 103 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 48562 sent, 43841 reached their opponent, 9094 virtual hits (20.7% of those reached).

## Melee bench: F41

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1468508. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 142 over 6 battles (23.7 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 89.6 | 108 / 210 | 1.94 | 18.5% | 26381 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.2 | 18.5% | 108 |
| eem.EvBotNG v12.8 | 1.8 | 16.3% | 73 |
| ary.Swarm 1.1 | 3.5 | 12.5% | 8 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.3% | 12 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.2% | 8 |
| shrub.Silver v048 | 6.0 | 9.1% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.6% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.0% | 0 |
| stelo.Mirror 1.1 | 8.5 | 5.4% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 92.7 | 18 / 35 | 4635 |
| 2 | 1 | 70.0 | 92.7 | 25 / 35 | 4637 |
| 3 | 2 | 67.9 | 88.6 | 16 / 35 | 4089 |
| 4 | 1 | 69.1 | 89.5 | 21 / 35 | 4441 |
| 5 | 1 | 67.7 | 87.3 | 15 / 35 | 4099 |
| 6 | 1 | 67.9 | 86.7 | 13 / 35 | 4480 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 79 | 49% |
| lessonz.robocode.Oz 0.5.0 | 39 | 77% |
| ary.Swarm 1.1 | 20 | 80% |
| simonton.nano.MeleeSeed 1.8 | 19 | 89% |
| stelo.Mirror 1.1 | 3 | 100% |
| shrub.Silver v048 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 55 | 54% | 91 |
| lessonz.robocode.Oz 0.5.0 | 19 | 19% | 40 |
| ary.Swarm 1.1 | 16 | 16% | 32 |
| simonton.nano.MeleeSeed 1.8 | 8 | 8% | 25 |
| zyx.nano.Ant 1.1 | 2 | 2% | 3 |
| shrub.Silver v048 | 1 | 1% | 8 |
| stelo.Mirror 1.1 | 1 | 1% | 6 |
| jsal.Jsalbot 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 200 rounds): 151332 melee ticks, 42249 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 41 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 49134 sent, 44331 reached their opponent, 6831 virtual hits (15.4% of those reached).

## Melee bench: F42

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1486271. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 161 over 6 battles (26.8 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 92.6 | 143 / 210 | 1.67 | 20.7% | 36222 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 20.7% | 143 |
| wompi.Wallaby 5.1 | 2.0 | 15.9% | 34 |
| ara.Shera 0.88 | 3.3 | 13.2% | 21 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 13.1% | 12 |
| amz.NanoClone 1.41 | 5.0 | 8.5% | 0 |
| dsw.StaticD 1.0 | 6.3 | 6.8% | 0 |
| maribo.IotaCT 1.1 | 7.5 | 6.1% | 0 |
| stelo.MirrorMicro 1.0 | 7.7 | 5.9% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.1% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 95.9 | 27 / 35 | 6143 |
| 2 | 1 | 71.4 | 91.4 | 23 / 35 | 6285 |
| 3 | 1 | 70.5 | 90.5 | 22 / 35 | 5677 |
| 4 | 1 | 71.8 | 94.0 | 25 / 35 | 6184 |
| 5 | 1 | 71.1 | 93.3 | 25 / 35 | 5845 |
| 6 | 1 | 70.7 | 90.5 | 21 / 35 | 6088 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 102 | 85% |
| maribo.mini.MiniQuester 0.1 | 39 | 85% |
| ara.Shera 0.88 | 27 | 70% |
| dsw.StaticD 1.0 | 2 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 31 | 46% | 111 |
| ara.Shera 0.88 | 22 | 32% | 38 |
| maribo.mini.MiniQuester 0.1 | 11 | 16% | 47 |
| amz.NanoClone 1.41 | 3 | 4% | 5 |
| dsw.StaticD 1.0 | 1 | 1% | 6 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 161720 melee ticks, 44529 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 31 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 50712 sent, 45983 reached their opponent, 9018 virtual hits (19.6% of those reached).

## Melee bench: F43

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479865. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 126 over 6 battles (21.0 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 81.5 | 39 / 210 | 2.66 | 16.2% | 25289 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.4% | 129 |
| hadur117.Hadur 3.21ek | 2.0 | 16.2% | 39 |
| brainfade.melee.Dusk 0.44 | 3.5 | 12.8% | 33 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.5% | 4 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 11.0% | 4 |
| Krabb.akim2.Akim2 1.1b | 6.2 | 9.0% | 1 |
| mz.NanoGod 2.02 | 7.3 | 7.7% | 1 |
| jab.DiamondStealer 5 | 7.5 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 81.3 | 3 / 35 | 4421 |
| 2 | 2 | 66.3 | 81.3 | 6 / 35 | 4112 |
| 3 | 2 | 67.1 | 82.9 | 8 / 35 | 4271 |
| 4 | 2 | 66.7 | 81.0 | 8 / 35 | 4104 |
| 5 | 2 | 66.0 | 81.6 | 4 / 35 | 4186 |
| 6 | 2 | 66.7 | 81.3 | 10 / 35 | 4195 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 83 | 27% |
| brainfade.melee.Dusk 0.44 | 24 | 29% |
| dummy.micro.Sparrow 2.5 | 9 | 78% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 33% |
| mz.NanoGod 2.02 | 1 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 100 | 58% | 120 |
| brainfade.melee.Dusk 0.44 | 31 | 18% | 39 |
| dummy.micro.Sparrow 2.5 | 25 | 15% | 32 |
| wcsv.melee.EngineerMelee 0.1 | 9 | 5% | 9 |
| mz.NanoGod 2.02 | 3 | 2% | 4 |
| Krabb.akim2.Akim2 1.1b | 2 | 1% | 5 |
| jab.DiamondStealer 5 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 156343 melee ticks, 46472 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 25 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 49046 sent, 44235 reached their opponent, 7280 virtual hits (16.5% of those reached).

## Melee bench: F44

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478733. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 163 over 6 battles (27.2 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 94.8 | 152 / 210 | 1.47 | 21.5% | 36209 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 21.5% | 152 |
| stelo.Liblix 0.3.1 | 2.2 | 15.5% | 41 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.4% | 13 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.5 | 9.2% | 0 |
| jwirde.Gort 2.0 | 4.5 | 9.4% | 4 |
| disan.Chair 2.2.0 | 6.7 | 7.6% | 1 |
| wompi.Quokka 1.6 | 7.0 | 7.0% | 0 |
| stf.PanzerGeneral 0.1 | 7.3 | 6.7% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.4% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 96.2 | 27 / 35 | 6033 |
| 2 | 1 | 71.7 | 94.6 | 25 / 35 | 5864 |
| 3 | 1 | 71.7 | 93.0 | 22 / 35 | 5974 |
| 4 | 1 | 70.7 | 90.5 | 20 / 35 | 5939 |
| 5 | 1 | 73.5 | 97.5 | 28 / 35 | 6431 |
| 6 | 1 | 72.6 | 97.1 | 30 / 35 | 5968 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 95 | 69% |
| tzu.TheArtOfWar 1.2 | 72 | 92% |
| jwirde.Gort 2.0 | 10 | 80% |
| disan.Chair 2.2.0 | 4 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 100% |
| wompi.Quokka 1.6 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 1020. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 36 | 61% | 116 |
| tzu.TheArtOfWar 1.2 | 13 | 22% | 62 |
| jwirde.Gort 2.0 | 5 | 8% | 15 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 5% | 5 |
| disan.Chair 2.2.0 | 1 | 2% | 5 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 4 |
| wompi.Quokka 1.6 | 0 | 0% | 1 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |
| sample.Crazy 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 197 rounds): 149323 melee ticks, 47967 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (197 rounds): longest scan gap while four or more were alive 73 ticks (197 rounds over 8); rounds whose longest gap at any count was over 8: 197; robots dropped as dead without a death event: 0.

Targeting waves (197 rounds): 51156 sent, 46564 reached their opponent, 9719 virtual hits (20.9% of those reached).

## Melee bench: F45

hadur117.Hadur 3.21ek against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474664. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 188 over 6 battles (31.3 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.8 | 125 / 210 | 1.91 | 20.2% | 33350 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 20.2% | 125 |
| jje.BagPuss 1.2 | 2.7 | 12.1% | 12 |
| eem.IWillFireNoBullet v2.8 | 3.7 | 11.2% | 51 |
| myl.nano.Graviton 1.10 | 3.8 | 11.1% | 6 |
| sul.Lunar 1.1 | 4.2 | 10.8% | 12 |
| fm.claire 1.7 | 6.2 | 9.1% | 2 |
| hvilela.HVilela 0.9 | 6.8 | 8.8% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.7 | 8.0% | 1 |
| wit.Deep7 2.0 | 9.0 | 4.8% | 1 |
| abud.ThirdRobo 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 86.3 | 18 / 35 | 4998 |
| 2 | 1 | 70.3 | 88.9 | 22 / 35 | 5670 |
| 3 | 1 | 70.6 | 92.1 | 22 / 35 | 5361 |
| 4 | 1 | 70.0 | 88.9 | 18 / 35 | 5783 |
| 5 | 1 | 70.4 | 88.9 | 20 / 35 | 5898 |
| 6 | 1 | 71.3 | 94.0 | 25 / 35 | 5640 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 65 | 68% |
| sul.Lunar 1.1 | 29 | 86% |
| jje.BagPuss 1.2 | 22 | 68% |
| myl.nano.Graviton 1.10 | 20 | 90% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 90% |
| fm.claire 1.7 | 8 | 88% |
| wit.Deep7 2.0 | 6 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 1418. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 28 | 33% | 0 |
| jje.BagPuss 1.2 | 18 | 21% | 53 |
| sul.Lunar 1.1 | 13 | 15% | 59 |
| hvilela.HVilela 0.9 | 12 | 14% | 22 |
| myl.nano.Graviton 1.10 | 7 | 8% | 28 |
| fm.claire 1.7 | 5 | 6% | 17 |
| pez.mini.ChironexFleckeri 0.5 | 2 | 2% | 18 |
| wit.Deep7 2.0 | 0 | 0% | 7 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 200 rounds): 193589 melee ticks, 67940 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 41 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 59507 sent, 54710 reached their opponent, 8097 virtual hits (14.8% of those reached).

## Melee bench: F46

hadur117.Hadur 3.21ek against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475325. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 139 over 6 battles (23.2 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 91.2 | 133 / 210 | 1.70 | 21.3% | 29003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21ek | 1.0 | 21.3% | 133 |
| kc.mini.Mirage 0.2 | 2.0 | 18.7% | 57 |
| cx.Princess 1.0 | 3.3 | 12.2% | 11 |
| mz.MicroSheep 1.0 | 3.7 | 11.8% | 7 |
| sadoner.killer 0.2 | 5.3 | 10.3% | 0 |
| arthord.NanoSatanMelee Beta | 5.7 | 9.7% | 3 |
| jeremyreeder.collective.Prophet 5 | 7.3 | 6.6% | 0 |
| kurios.DOSexe .9a | 7.7 | 6.0% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 90.7 | 24 / 35 | 4506 |
| 2 | 1 | 69.4 | 87.1 | 20 / 35 | 5059 |
| 3 | 1 | 70.1 | 92.1 | 22 / 35 | 4866 |
| 4 | 1 | 69.6 | 92.9 | 23 / 35 | 4508 |
| 5 | 1 | 70.2 | 93.2 | 21 / 35 | 4985 |
| 6 | 1 | 70.2 | 91.1 | 23 / 35 | 5079 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 122 | 77% |
| cx.Princess 1.0 | 25 | 76% |
| mz.MicroSheep 1.0 | 11 | 91% |
| arthord.NanoSatanMelee Beta | 7 | 86% |
| sadoner.killer 0.2 | 2 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 43 | 55% | 127 |
| cx.Princess 1.0 | 12 | 15% | 32 |
| arthord.NanoSatanMelee Beta | 9 | 12% | 15 |
| sadoner.killer 0.2 | 7 | 9% | 13 |
| mz.MicroSheep 1.0 | 6 | 8% | 20 |
| jeremyreeder.collective.Prophet 5 | 0 | 0% | 2 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 136516 melee ticks, 45554 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 42 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 38649 sent, 34417 reached their opponent, 5506 virtual hits (16.0% of those reached).

