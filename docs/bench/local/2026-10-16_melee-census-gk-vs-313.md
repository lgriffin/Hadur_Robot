# Bench suite: melee-census-313.txt

## Melee bench: F01

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 16 over 2 battles (8.0 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 74.8 | 16 / 70 | 3.27 | 15.1% | 7941 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.DemonicRage 3.4 | 1.0 | 18.3% | 25 |
| hadur2.Hadur 3.13gk | 2.5 | 15.1% | 16 |
| kawigi.mini.Coriantumr 1.1 | 3.0 | 14.5% | 9 |
| wompi.Wallaby 5.1 | 3.5 | 14.2% | 12 |
| rtk.Tachikoma 1.0 | 5.0 | 11.2% | 6 |
| uji.YellohFellah 1.0 | 6.5 | 7.5% | 2 |
| maribo.melee.BMV 0.1 | 6.5 | 7.1% | 0 |
| exauge.GateKeeper 1.1.121g | 8.0 | 5.0% | 0 |
| matt.UnderDark3 2.4.34 | 9.0 | 3.7% | 0 |
| skm.butterfly 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.9 | 70.5 | 7 / 35 | 3900 |
| 2 | 2 | 65.3 | 79.0 | 9 / 35 | 4041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 15 | 40% |
| rtk.Tachikoma 1.0 | 3 | 67% |
| wompi.Wallaby 5.1 | 3 | 67% |
| kawigi.mini.Coriantumr 1.1 | 3 | 100% |
| uji.YellohFellah 1.0 | 2 | 100% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 54 of 70 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 26 | 48% | 35 |
| kawigi.mini.Coriantumr 1.1 | 10 | 19% | 13 |
| rtk.Tachikoma 1.0 | 8 | 15% | 9 |
| wompi.Wallaby 5.1 | 7 | 13% | 9 |
| uji.YellohFellah 1.0 | 1 | 2% | 2 |
| exauge.GateKeeper 1.1.121g | 1 | 2% | 1 |
| maribo.melee.BMV 0.1 | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 55895 melee ticks, 8759 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 24 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 18863 sent, 17353 reached their opponent, 2855 virtual hits (16.5% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 64.1% ± 15.6 | 63.0% ± 11.4 | +1.1 ± 27.0 |
| Survival | 74.8% ± 54.5 | 74.6% ± 24.2 | +0.2 ± 78.7 |
| Rounds won | 22.9% ± 36.3 | 21.4% ± 18.2 | +1.4 ± 54.5 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| uji.YellohFellah 1.0 | 66.8% ± 20.4 | 68.2% ± 13.5 | -1.4 ± 33.8 |
| rtk.Tachikoma 1.0 | 57.5% ± 36.7 | 57.4% ± 9.2 | +0.1 ± 45.8 |
| maribo.melee.BMV 0.1 | 68.2% ± 8.4 | 62.9% ± 36.2 | +5.2 ± 27.8 |
| justin.DemonicRage 3.4 | 45.1% ± 8.1 | 42.7% ± 17.6 | +2.4 ± 9.4 |
| kawigi.mini.Coriantumr 1.1 | 50.9% ± 26.0 | 52.3% ± 7.4 | -1.3 ± 33.4 |
| exauge.GateKeeper 1.1.121g | 75.1% ± 21.6 | 72.0% ± 4.7 | +3.2 ± 26.3 |
| skm.butterfly 1.0 | 81.6% ± 11.9 | 83.3% ± 9.6 | -1.7 ± 21.5 |
| matt.UnderDark3 2.4.34 | 80.1% ± 8.7 | 77.5% ± 23.0 | +2.6 ± 31.8 |
| wompi.Wallaby 5.1 | 51.5% ± 15.7 | 50.5% ± 16.6 | +1.1 ± 32.3 |

## Melee bench: F01

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 11 over 2 battles (5.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 74.6 | 15 / 70 | 3.29 | 14.5% | 6683 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.DemonicRage 3.4 | 1.0 | 19.5% | 38 |
| hadur2.Hadur 3.13 | 2.5 | 14.5% | 15 |
| wompi.Wallaby 5.1 | 2.5 | 14.2% | 9 |
| kawigi.mini.Coriantumr 1.1 | 4.0 | 13.2% | 5 |
| rtk.Tachikoma 1.0 | 5.0 | 10.7% | 2 |
| maribo.melee.BMV 0.1 | 6.0 | 8.5% | 0 |
| uji.YellohFellah 1.0 | 7.0 | 6.7% | 1 |
| exauge.GateKeeper 1.1.121g | 8.0 | 5.6% | 0 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.2% | 0 |
| skm.butterfly 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 76.5 | 8 / 35 | 3398 |
| 2 | 3 | 62.1 | 72.7 | 7 / 35 | 3285 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 14 | 36% |
| wompi.Wallaby 5.1 | 5 | 80% |
| rtk.Tachikoma 1.0 | 3 | 67% |
| kawigi.mini.Coriantumr 1.1 | 3 | 67% |
| maribo.melee.BMV 0.1 | 1 | 100% |
| uji.YellohFellah 1.0 | 1 | 100% |

Hadur died in 55 of 70 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 26 | 47% | 32 |
| kawigi.mini.Coriantumr 1.1 | 11 | 20% | 13 |
| rtk.Tachikoma 1.0 | 7 | 13% | 10 |
| wompi.Wallaby 5.1 | 7 | 13% | 10 |
| maribo.melee.BMV 0.1 | 3 | 5% | 4 |
| skm.butterfly 1.0 | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 53558 melee ticks, 7458 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 32 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 18442 sent, 16879 reached their opponent, 2516 virtual hits (14.9% of those reached).

## Melee bench: F02

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 25 over 2 battles (12.5 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 82.5 | 27 / 70 | 2.57 | 16.2% | 8514 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.5 | 16.2% | 27 |
| darkcanuck.B26354 1.06 | 1.5 | 15.1% | 26 |
| kc.micro.Figment 1.0 | 3.5 | 14.2% | 11 |
| radnor.DoctorBob 1.42 | 3.5 | 14.2% | 5 |
| panzer.Panzer 0.2 | 5.5 | 8.9% | 0 |
| stelo.Randomness 1.0 | 5.5 | 9.3% | 1 |
| sample.Crazy 1.0 | 8.0 | 5.8% | 0 |
| skm.PateranBotlock2 1.0 | 8.5 | 5.4% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.5 | 5.4% | 0 |
| mn.nano.perceptual.Impact 1.3.0 | 9.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 85.7 | 18 / 35 | 4285 |
| 2 | 2 | 63.8 | 79.4 | 9 / 35 | 4229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 15 | 40% |
| kc.micro.Figment 1.0 | 12 | 92% |
| radnor.DoctorBob 1.42 | 10 | 90% |
| panzer.Panzer 0.2 | 1 | 100% |
| stelo.Randomness 1.0 | 1 | 0% |

Hadur died in 43 of 70 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 16 | 37% | 21 |
| radnor.DoctorBob 1.42 | 12 | 28% | 20 |
| kc.micro.Figment 1.0 | 8 | 19% | 19 |
| panzer.Panzer 0.2 | 3 | 7% | 3 |
| stelo.Randomness 1.0 | 2 | 5% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 5% | 2 |

Posture (Hadur's M records, 70 rounds): 51388 melee ticks, 13476 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 55 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 15127 sent, 13593 reached their opponent, 2405 virtual hits (17.7% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 65.0% ± 16.2 | 62.8% ± 10.9 | +2.3 ± 27.1 |
| Survival | 82.5% ± 40.3 | 77.5% ± 36.3 | +5.1 ± 76.6 |
| Rounds won | 38.6% ± 163.4 | 34.3% ± 36.3 | +4.3 ± 199.7 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 53.3% ± 13.3 | 52.8% ± 0.7 | +0.5 ± 14.0 |
| mn.nano.perceptual.Impact 1.3.0 | 75.2% ± 25.6 | 70.4% ± 22.3 | +4.8 ± 47.8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 74.9% ± 4.5 | 75.6% ± 6.0 | -0.7 ± 1.5 |
| darkcanuck.B26354 1.06 | 51.7% ± 23.5 | 48.8% ± 11.7 | +2.9 ± 35.2 |
| kc.micro.Figment 1.0 | 53.3% ± 7.8 | 49.9% ± 14.0 | +3.5 ± 21.9 |
| panzer.Panzer 0.2 | 64.6% ± 11.4 | 64.5% ± 3.5 | +0.0 ± 14.9 |
| stelo.Randomness 1.0 | 63.6% ± 52.5 | 61.0% ± 33.0 | +2.6 ± 85.5 |
| sample.Crazy 1.0 | 73.6% ± 29.6 | 70.5% ± 14.3 | +3.1 ± 43.9 |
| skm.PateranBotlock2 1.0 | 75.1% ± 22.6 | 71.5% ± 4.9 | +3.6 ± 17.7 |

## Melee bench: F02

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 8 over 2 battles (4.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 77.5 | 24 / 70 | 3.03 | 14.9% | 7481 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 1.0 | 15.7% | 29 |
| kc.micro.Figment 1.0 | 2.5 | 15.0% | 8 |
| hadur2.Hadur 3.13 | 2.5 | 14.9% | 24 |
| radnor.DoctorBob 1.42 | 4.0 | 13.4% | 5 |
| stelo.Randomness 1.0 | 5.0 | 9.6% | 4 |
| panzer.Panzer 0.2 | 6.0 | 8.2% | 0 |
| sample.Crazy 1.0 | 7.5 | 6.2% | 0 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 6.3% | 0 |
| skm.PateranBotlock2 1.0 | 8.5 | 6.0% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.9 | 74.6 | 11 / 35 | 3759 |
| 2 | 2 | 63.6 | 80.3 | 13 / 35 | 3722 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 15 | 87% |
| darkcanuck.B26354 1.06 | 13 | 38% |
| radnor.DoctorBob 1.42 | 5 | 80% |
| stelo.Randomness 1.0 | 2 | 50% |
| panzer.Panzer 0.2 | 1 | 100% |

Hadur died in 46 of 70 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 18 | 39% | 23 |
| radnor.DoctorBob 1.42 | 12 | 26% | 15 |
| kc.micro.Figment 1.0 | 7 | 15% | 20 |
| stelo.Randomness 1.0 | 3 | 7% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 4% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 4% | 2 |
| panzer.Panzer 0.2 | 1 | 2% | 2 |
| sample.Crazy 1.0 | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 49932 melee ticks, 12544 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 40 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 14592 sent, 13066 reached their opponent, 2140 virtual hits (16.4% of those reached).

## Melee bench: F03

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 18 over 2 battles (9.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 87.8 | 30 / 70 | 2.10 | 17.9% | 8297 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.5 | 17.9% | 30 |
| catcat20.Matcha 0.006 | 1.5 | 16.9% | 27 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.1% | 7 |
| ejb.Polaris 1.0.1 | 4.0 | 10.7% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 5.0 | 8.6% | 0 |
| ratosh.Nobo 0.21 | 6.5 | 8.2% | 0 |
| sheldor.melee.nano.TestMelee 0.1 | 7.0 | 7.7% | 1 |
| m3thos.Eva00 1.1 | 7.5 | 7.7% | 1 |
| tlp.ThreeLeggedPig 1 | 9.0 | 5.8% | 1 |
| pbg.R2D2 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 88.3 | 17 / 35 | 4114 |
| 2 | 2 | 67.2 | 87.3 | 13 / 35 | 4183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 32 | 50% |
| ejb.Polaris 1.0.1 | 6 | 67% |
| apc.LeeroyJenkins2 1.0 | 6 | 83% |
| ratosh.Nobo 0.21 | 3 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 2 | 100% |
| m3thos.Eva00 1.1 | 1 | 0% |
| tlp.ThreeLeggedPig 1 | 1 | 0% |

Hadur died in 40 of 70 rounds, at a mean tick of 995. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 24 | 60% | 37 |
| apc.LeeroyJenkins2 1.0 | 7 | 18% | 13 |
| ejb.Polaris 1.0.1 | 4 | 10% | 12 |
| ratosh.Nobo 0.21 | 3 | 8% | 5 |
| tlp.ThreeLeggedPig 1 | 1 | 3% | 1 |
| m3thos.Eva00 1.1 | 1 | 3% | 1 |
| techdude.kombat.FlamingKombat 1.5 | 0 | 0% | 1 |

Posture (Hadur's M records, 68 rounds): 52651 melee ticks, 16788 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (68 rounds): longest scan gap while four or more were alive 42 ticks (68 rounds over 8); rounds whose longest gap at any count was over 8: 68; robots dropped as dead without a death event: 0.

Targeting waves (68 rounds): 17192 sent, 15700 reached their opponent, 3401 virtual hits (21.7% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 67.6% ± 4.4 | 66.4% ± 1.8 | +1.2 ± 6.2 |
| Survival | 87.8% ± 6.1 | 86.2% ± 14.1 | +1.6 ± 20.2 |
| Rounds won | 42.9% ± 72.6 | 40.0% ± 36.3 | +2.9 ± 36.3 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| apc.LeeroyJenkins2 1.0 | 57.7% ± 8.9 | 62.7% ± 27.7 | -5.0 ± 36.6 |
| pbg.R2D2 1.0 | 84.6% ± 3.6 | 80.8% ± 20.0 | +3.7 ± 16.4 |
| techdude.kombat.FlamingKombat 1.5 | 67.5% ± 0.9 | 66.7% ± 38.5 | +0.8 ± 39.4 |
| m3thos.Eva00 1.1 | 69.9% ± 7.3 | 67.9% ± 5.4 | +2.0 ± 12.7 |
| sheldor.melee.nano.TestMelee 0.1 | 69.9% ± 30.2 | 67.1% ± 26.1 | +2.8 ± 56.3 |
| catcat20.Matcha 0.006 | 51.5% ± 20.1 | 48.0% ± 5.5 | +3.5 ± 25.6 |
| ejb.Polaris 1.0.1 | 62.7% ± 17.6 | 61.1% ± 4.8 | +1.6 ± 22.4 |
| tlp.ThreeLeggedPig 1 | 75.8% ± 19.5 | 74.4% ± 4.1 | +1.3 ± 15.5 |
| ratosh.Nobo 0.21 | 68.6% ± 2.8 | 68.5% ± 9.9 | +0.1 ± 7.1 |

## Melee bench: F03

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 27 over 2 battles (13.5 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 86.2 | 28 / 70 | 2.24 | 17.2% | 7691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.0 | 18.6% | 38 |
| hadur2.Hadur 3.13 | 2.0 | 17.2% | 28 |
| ejb.Polaris 1.0.1 | 3.5 | 10.9% | 3 |
| apc.LeeroyJenkins2 1.0 | 4.0 | 10.2% | 1 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 8.6% | 0 |
| m3thos.Eva00 1.1 | 6.0 | 8.1% | 0 |
| sheldor.melee.nano.TestMelee 0.1 | 6.5 | 8.4% | 0 |
| ratosh.Nobo 0.21 | 7.0 | 7.9% | 0 |
| tlp.ThreeLeggedPig 1 | 9.0 | 5.9% | 0 |
| pbg.R2D2 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 85.1 | 15 / 35 | 3776 |
| 2 | 2 | 66.5 | 87.3 | 13 / 35 | 3915 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 36 | 42% |
| ejb.Polaris 1.0.1 | 7 | 57% |
| apc.LeeroyJenkins2 1.0 | 6 | 100% |
| m3thos.Eva00 1.1 | 1 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 1 | 100% |
| ratosh.Nobo 0.21 | 1 | 100% |

Hadur died in 42 of 70 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 32 | 76% | 45 |
| ejb.Polaris 1.0.1 | 5 | 12% | 12 |
| apc.LeeroyJenkins2 1.0 | 3 | 7% | 8 |
| sheldor.melee.nano.TestMelee 0.1 | 1 | 2% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 1 |
| techdude.kombat.FlamingKombat 1.5 | 0 | 0% | 1 |
| m3thos.Eva00 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 69 rounds): 51895 melee ticks, 17189 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (69 rounds): longest scan gap while four or more were alive 41 ticks (69 rounds over 8); rounds whose longest gap at any count was over 8: 69; robots dropped as dead without a death event: 0.

Targeting waves (69 rounds): 16943 sent, 15332 reached their opponent, 3173 virtual hits (20.7% of those reached).

## Melee bench: F04

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 23 over 2 battles (11.5 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 90.2 | 52 / 70 | 1.89 | 18.9% | 9115 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 18.9% | 52 |
| myl.micro.Troodon 1.10 | 2.5 | 13.8% | 10 |
| cs.Wren 1.0 | 2.5 | 13.6% | 3 |
| cli.Dancer 1.1 | 4.5 | 10.7% | 0 |
| tripphippy.Alice 1.1 | 5.5 | 9.6% | 2 |
| mz.Cork 0.1 | 6.0 | 9.4% | 2 |
| gimp.GimpBot 0.1 | 6.0 | 9.5% | 1 |
| hvilela.HVilela 0.9 | 8.0 | 7.2% | 0 |
| kurios.DOSexe .9b | 9.0 | 5.3% | 0 |
| skm.Ryubot 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 92.4 | 28 / 35 | 4712 |
| 2 | 1 | 67.9 | 87.9 | 24 / 35 | 4403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 18 | 94% |
| cs.Wren 1.0 | 17 | 100% |
| tripphippy.Alice 1.1 | 10 | 80% |
| gimp.GimpBot 0.1 | 7 | 100% |
| cli.Dancer 1.1 | 2 | 100% |
| mz.Cork 0.1 | 1 | 100% |

Hadur died in 18 of 70 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cs.Wren 1.0 | 4 | 22% | 18 |
| myl.micro.Troodon 1.10 | 4 | 22% | 11 |
| gimp.GimpBot 0.1 | 3 | 17% | 10 |
| cli.Dancer 1.1 | 2 | 11% | 12 |
| tripphippy.Alice 1.1 | 2 | 11% | 10 |
| hvilela.HVilela 0.9 | 2 | 11% | 3 |
| mz.Cork 0.1 | 1 | 6% | 4 |
| kurios.DOSexe .9b | 0 | 0% | 2 |

Posture (Hadur's M records, 70 rounds): 48699 melee ticks, 13876 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 39 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 16962 sent, 15416 reached their opponent, 3447 virtual hits (22.4% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 68.9% ± 12.9 | 68.9% ± 3.1 | -0.0 ± 9.8 |
| Survival | 90.2% ± 28.2 | 90.3% ± 18.2 | -0.2 ± 10.1 |
| Rounds won | 74.3% ± 72.6 | 71.4% ± 36.3 | +2.9 ± 36.3 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| gimp.GimpBot 0.1 | 66.5% ± 27.5 | 69.3% ± 3.5 | -2.8 ± 31.0 |
| hvilela.HVilela 0.9 | 72.5% ± 20.1 | 73.8% ± 7.3 | -1.3 ± 12.8 |
| mz.Cork 0.1 | 66.8% ± 20.9 | 64.5% ± 8.6 | +2.3 ± 29.4 |
| skm.Ryubot 1.0 | 90.4% ± 13.5 | 88.8% ± 18.4 | +1.5 ± 4.9 |
| cs.Wren 1.0 | 58.1% ± 3.4 | 56.2% ± 17.6 | +1.8 ± 21.0 |
| myl.micro.Troodon 1.10 | 57.8% ± 10.3 | 57.2% ± 25.0 | +0.5 ± 35.3 |
| cli.Dancer 1.1 | 63.9% ± 6.7 | 65.4% ± 8.0 | -1.6 ± 1.3 |
| tripphippy.Alice 1.1 | 66.3% ± 38.5 | 63.3% ± 2.0 | +3.0 ± 40.5 |
| kurios.DOSexe .9b | 78.1% ± 2.3 | 81.8% ± 34.7 | -3.7 ± 37.0 |

## Melee bench: F04

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 24 over 2 battles (12.0 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 90.3 | 50 / 70 | 1.87 | 18.7% | 8666 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.0 | 18.7% | 50 |
| cs.Wren 1.0 | 2.0 | 14.6% | 8 |
| myl.micro.Troodon 1.10 | 3.0 | 14.0% | 7 |
| tripphippy.Alice 1.1 | 4.0 | 10.9% | 3 |
| mz.Cork 0.1 | 5.5 | 10.3% | 1 |
| cli.Dancer 1.1 | 5.5 | 9.9% | 0 |
| gimp.GimpBot 0.1 | 7.0 | 8.3% | 1 |
| hvilela.HVilela 0.9 | 8.0 | 6.7% | 0 |
| kurios.DOSexe .9b | 9.0 | 4.2% | 0 |
| skm.Ryubot 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 91.7 | 26 / 35 | 4400 |
| 2 | 1 | 68.7 | 88.9 | 24 / 35 | 4266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cs.Wren 1.0 | 21 | 95% |
| myl.micro.Troodon 1.10 | 15 | 93% |
| tripphippy.Alice 1.1 | 8 | 88% |
| mz.Cork 0.1 | 5 | 100% |
| cli.Dancer 1.1 | 2 | 100% |
| gimp.GimpBot 0.1 | 2 | 50% |

Hadur died in 21 of 70 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tripphippy.Alice 1.1 | 9 | 43% | 16 |
| cs.Wren 1.0 | 4 | 19% | 18 |
| myl.micro.Troodon 1.10 | 3 | 14% | 17 |
| gimp.GimpBot 0.1 | 3 | 14% | 5 |
| cli.Dancer 1.1 | 2 | 10% | 5 |
| mz.Cork 0.1 | 0 | 0% | 8 |
| kurios.DOSexe .9b | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 52049 melee ticks, 10174 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 26 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 17461 sent, 15964 reached their opponent, 3111 virtual hits (19.5% of those reached).

## Melee bench: F05

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 22 over 2 battles (11.0 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 97.5 | 61 / 70 | 1.23 | 22.0% | 13012 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 22.0% | 61 |
| oog.melee.CapuletDroid 1.1 | 2.0 | 14.6% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3.0 | 11.5% | 2 |
| shrub.Silver v048 | 4.0 | 9.7% | 0 |
| bzdp.BoxCar 2.0 | 5.0 | 8.9% | 0 |
| adt.Ar2 1.1 | 6.0 | 8.4% | 0 |
| urdos.URDOS 1.3 | 7.5 | 7.5% | 0 |
| wit.Deep7 2.0 | 7.5 | 7.7% | 0 |
| GarmBox.Oranges 1.0 | 9.0 | 6.5% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 98.1 | 31 / 35 | 6615 |
| 2 | 1 | 72.4 | 96.8 | 30 / 35 | 6397 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.CapuletDroid 1.1 | 39 | 92% |
| kawigi.spare.SpareParts 0.7.6nosnd | 9 | 89% |
| wit.Deep7 2.0 | 8 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |
| drd.Dreadknoght 0.9 | 2 | 100% |
| shrub.Silver v048 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| adt.Ar2 1.1 | 1 | 100% |

Hadur died in 9 of 70 rounds, at a mean tick of 1294. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 3 | 33% | 42 |
| shrub.Silver v048 | 3 | 33% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 22% | 11 |
| bzdp.BoxCar 2.0 | 1 | 11% | 3 |
| adt.Ar2 1.1 | 0 | 0% | 3 |
| wit.Deep7 2.0 | 0 | 0% | 2 |
| GarmBox.Oranges 1.0 | 0 | 0% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 53758 melee ticks, 29191 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 41 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 1.

Targeting waves (70 rounds): 17034 sent, 15562 reached their opponent, 3699 virtual hits (23.8% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 72.5% ± 0.7 | 72.3% ± 10.8 | +0.2 ± 11.5 |
| Survival | 97.5% ± 8.1 | 95.9% ± 28.2 | +1.6 ± 36.3 |
| Rounds won | 87.1% ± 18.2 | 84.3% ± 127.1 | +2.9 ± 145.2 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| GarmBox.Oranges 1.0 | 77.3% ± 23.2 | 74.7% ± 6.5 | +2.6 ± 16.7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 65.7% ± 37.1 | 64.9% ± 64.0 | +0.8 ± 101.0 |
| oog.melee.CapuletDroid 1.1 | 60.1% ± 6.6 | 61.2% ± 9.5 | -1.1 ± 16.1 |
| adt.Ar2 1.1 | 72.3% ± 12.5 | 72.1% ± 0.4 | +0.2 ± 13.0 |
| wit.Deep7 2.0 | 74.2% ± 11.3 | 73.6% ± 9.2 | +0.6 ± 20.5 |
| shrub.Silver v048 | 69.4% ± 8.6 | 71.6% ± 0.8 | -2.3 ± 7.8 |
| urdos.URDOS 1.3 | 74.6% ± 10.0 | 76.1% ± 26.4 | -1.5 ± 16.4 |
| drd.Dreadknoght 0.9 | 87.8% ± 33.4 | 86.3% ± 9.1 | +1.5 ± 42.5 |
| bzdp.BoxCar 2.0 | 71.2% ± 7.0 | 70.3% ± 3.3 | +0.9 ± 3.7 |

## Melee bench: F05

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 25 over 2 battles (12.5 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 95.9 | 59 / 70 | 1.37 | 21.9% | 13579 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.0 | 21.9% | 59 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2.5 | 12.0% | 4 |
| oog.melee.CapuletDroid 1.1 | 2.5 | 13.9% | 6 |
| bzdp.BoxCar 2.0 | 4.0 | 9.3% | 0 |
| shrub.Silver v048 | 5.0 | 8.7% | 0 |
| adt.Ar2 1.1 | 6.0 | 8.5% | 0 |
| wit.Deep7 2.0 | 7.5 | 7.9% | 1 |
| GarmBox.Oranges 1.0 | 8.0 | 7.5% | 0 |
| urdos.URDOS 1.3 | 8.5 | 6.9% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 93.7 | 26 / 35 | 6483 |
| 2 | 1 | 73.2 | 98.1 | 33 / 35 | 7096 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.CapuletDroid 1.1 | 33 | 91% |
| kawigi.spare.SpareParts 0.7.6nosnd | 10 | 80% |
| wit.Deep7 2.0 | 9 | 100% |
| shrub.Silver v048 | 5 | 100% |
| bzdp.BoxCar 2.0 | 3 | 100% |
| adt.Ar2 1.1 | 2 | 100% |
| drd.Dreadknoght 0.9 | 2 | 100% |

Hadur died in 11 of 70 rounds, at a mean tick of 1486. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 5 | 45% | 40 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 27% | 12 |
| shrub.Silver v048 | 2 | 18% | 5 |
| adt.Ar2 1.1 | 1 | 9% | 2 |
| wit.Deep7 2.0 | 0 | 0% | 5 |
| bzdp.BoxCar 2.0 | 0 | 0% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |
| GarmBox.Oranges 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 56544 melee ticks, 32001 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 20 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 17224 sent, 15834 reached their opponent, 3911 virtual hits (24.7% of those reached).

## Melee bench: F06

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 17 over 2 battles (8.5 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 81.4 | 33 / 70 | 2.67 | 16.5% | 7569 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 16.5% | 33 |
| tm.Yuugao 1.0 | 2.0 | 13.9% | 15 |
| mld.DustBunny 3.8 | 3.0 | 13.3% | 2 |
| fwb.Nine 1.0.1 | 4.0 | 12.6% | 8 |
| gre.svman4.Leonidas 1.3.2 | 5.0 | 11.8% | 8 |
| wit.Chuliath 1.0 | 6.5 | 7.1% | 0 |
| yk.JahMicro 1.0 | 6.5 | 7.8% | 3 |
| stuff.Vlad 0.1 | 8.5 | 6.1% | 0 |
| amk.superstrike.SuperStrike 0.3 | 9.0 | 5.8% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 77.8 | 13 / 35 | 3482 |
| 2 | 1 | 66.8 | 85.1 | 20 / 35 | 4087 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 12 | 75% |
| gre.svman4.Leonidas 1.3.2 | 12 | 75% |
| fwb.Nine 1.0.1 | 9 | 100% |
| mld.DustBunny 3.8 | 4 | 100% |
| yk.JahMicro 1.0 | 4 | 50% |

Hadur died in 37 of 70 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 10 | 27% | 24 |
| gre.svman4.Leonidas 1.3.2 | 8 | 22% | 16 |
| mld.DustBunny 3.8 | 6 | 16% | 13 |
| fwb.Nine 1.0.1 | 5 | 14% | 11 |
| wit.Chuliath 1.0 | 3 | 8% | 3 |
| yk.JahMicro 1.0 | 3 | 8% | 1 |
| amk.superstrike.SuperStrike 0.3 | 2 | 5% | 2 |

Posture (Hadur's M records, 70 rounds): 55091 melee ticks, 13041 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 16 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 16 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 17102 sent, 15562 reached their opponent, 2553 virtual hits (16.4% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 65.0% ± 23.5 | 64.3% ± 8.8 | +0.7 ± 32.3 |
| Survival | 81.4% ± 46.4 | 82.7% ± 26.2 | -1.3 ± 72.6 |
| Rounds won | 47.1% ± 127.1 | 34.3% ± 72.6 | +12.9 ± 199.7 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| ghent.ArthurPanzergon 1.0.0 | 76.1% ± 0.6 | 71.5% ± 2.2 | +4.6 ± 1.6 |
| amk.superstrike.SuperStrike 0.3 | 73.8% ± 38.1 | 71.7% ± 1.4 | +2.2 ± 36.7 |
| wit.Chuliath 1.0 | 69.9% ± 47.1 | 69.0% ± 15.2 | +0.9 ± 62.2 |
| yk.JahMicro 1.0 | 67.9% ± 13.1 | 72.8% ± 3.6 | -4.9 ± 16.7 |
| stuff.Vlad 0.1 | 72.9% ± 10.4 | 73.3% ± 18.1 | -0.4 ± 28.5 |
| mld.DustBunny 3.8 | 55.3% ± 25.3 | 54.8% ± 6.9 | +0.6 ± 32.2 |
| gre.svman4.Leonidas 1.3.2 | 58.1% ± 27.7 | 56.0% ± 7.6 | +2.1 ± 35.3 |
| tm.Yuugao 1.0 | 54.1% ± 34.5 | 52.7% ± 36.3 | +1.4 ± 70.8 |
| fwb.Nine 1.0.1 | 56.7% ± 14.7 | 56.8% ± 4.9 | -0.1 ± 9.8 |

## Melee bench: F06

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 12 over 2 battles (6.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 82.7 | 24 / 70 | 2.56 | 16.0% | 6840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.5 | 16.0% | 24 |
| tm.Yuugao 1.0 | 2.0 | 14.4% | 19 |
| mld.DustBunny 3.8 | 2.5 | 13.2% | 3 |
| fwb.Nine 1.0.1 | 4.5 | 12.2% | 8 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 12.5% | 15 |
| wit.Chuliath 1.0 | 6.0 | 7.2% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 6.4% | 0 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.3% | 1 |
| yk.JahMicro 1.0 | 9.5 | 6.0% | 1 |
| stuff.Vlad 0.1 | 9.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 84.8 | 14 / 35 | 3459 |
| 2 | 2 | 63.6 | 80.6 | 10 / 35 | 3381 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 15 | 40% |
| gre.svman4.Leonidas 1.3.2 | 10 | 60% |
| mld.DustBunny 3.8 | 7 | 86% |
| fwb.Nine 1.0.1 | 6 | 83% |
| yk.JahMicro 1.0 | 1 | 0% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 46 of 70 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 16 | 35% | 23 |
| gre.svman4.Leonidas 1.3.2 | 14 | 30% | 19 |
| mld.DustBunny 3.8 | 10 | 22% | 20 |
| yk.JahMicro 1.0 | 2 | 4% | 2 |
| fwb.Nine 1.0.1 | 1 | 2% | 2 |
| amk.superstrike.SuperStrike 0.3 | 1 | 2% | 2 |
| wit.Chuliath 1.0 | 1 | 2% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 0 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 57004 melee ticks, 13510 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 17 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 17 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 17478 sent, 15961 reached their opponent, 2648 virtual hits (16.6% of those reached).

## Melee bench: F07

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 21 over 2 battles (10.5 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 81.0 | 30 / 70 | 2.71 | 16.2% | 6801 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 16.2% | 30 |
| trm.Wrekt 1.1.6.f | 2.0 | 14.3% | 13 |
| morbid.MorbidPriest 1.0 | 3.5 | 11.3% | 8 |
| ara.Shera 0.88 | 3.5 | 10.8% | 8 |
| intruder.PrairieWolf 2.61 | 5.5 | 9.8% | 6 |
| ph.melee.ArcherME 0.3 | 7.5 | 8.3% | 0 |
| tcf.Reach 3 | 7.5 | 8.2% | 0 |
| uji.DBH 1.1 | 7.5 | 8.2% | 1 |
| stelo.AreaTargetingBot 1.1 | 7.5 | 7.6% | 3 |
| com.spp.robocode.MostlyHarmless 010 | 9.5 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 84.8 | 16 / 35 | 3620 |
| 2 | 1 | 63.0 | 77.1 | 14 / 35 | 3181 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 15 | 67% |
| morbid.MorbidPriest 1.0 | 10 | 50% |
| ara.Shera 0.88 | 9 | 78% |
| intruder.PrairieWolf 2.61 | 5 | 40% |
| com.spp.robocode.MostlyHarmless 010 | 3 | 100% |
| tcf.Reach 3 | 2 | 100% |
| stelo.AreaTargetingBot 1.1 | 2 | 50% |

Hadur died in 41 of 70 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 11 | 27% | 17 |
| trm.Wrekt 1.1.6.f | 10 | 24% | 17 |
| intruder.PrairieWolf 2.61 | 7 | 17% | 10 |
| ara.Shera 0.88 | 5 | 12% | 10 |
| com.spp.robocode.MostlyHarmless 010 | 3 | 7% | 6 |
| tcf.Reach 3 | 2 | 5% | 5 |
| stelo.AreaTargetingBot 1.1 | 2 | 5% | 3 |
| ph.melee.ArcherME 0.3 | 1 | 2% | 1 |

Posture (Hadur's M records, 69 rounds): 48492 melee ticks, 11476 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 23 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (69 rounds): longest scan gap while four or more were alive 23 ticks (69 rounds over 8); rounds whose longest gap at any count was over 8: 69; robots dropped as dead without a death event: 0.

Targeting waves (69 rounds): 17590 sent, 16021 reached their opponent, 2946 virtual hits (18.4% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 64.1% ± 15.1 | 61.4% ± 11.7 | +2.7 ± 26.8 |
| Survival | 81.0% ± 48.4 | 75.6% ± 20.2 | +5.4 ± 68.6 |
| Rounds won | 42.9% ± 36.3 | 25.7% ± 0.0 | +17.1 ± 36.3 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 53.0% ± 22.8 | 54.4% ± 9.1 | -1.4 ± 31.8 |
| stelo.AreaTargetingBot 1.1 | 68.7% ± 98.1 | 69.1% ± 14.9 | -0.4 ± 113.0 |
| morbid.MorbidPriest 1.0 | 58.9% ± 0.9 | 54.4% ± 9.0 | +4.5 ± 8.1 |
| uji.DBH 1.1 | 66.4% ± 39.2 | 60.3% ± 16.7 | +6.1 ± 55.9 |
| ara.Shera 0.88 | 59.9% ± 19.5 | 53.5% ± 19.9 | +6.5 ± 0.4 |
| ph.melee.ArcherME 0.3 | 66.1% ± 15.2 | 66.6% ± 40.8 | -0.5 ± 25.6 |
| intruder.PrairieWolf 2.61 | 62.2% ± 9.1 | 60.1% ± 16.0 | +2.1 ± 6.9 |
| com.spp.robocode.MostlyHarmless 010 | 75.6% ± 38.1 | 67.0% ± 15.7 | +8.6 ± 22.3 |
| tcf.Reach 3 | 66.4% ± 1.2 | 67.6% ± 34.9 | -1.1 ± 36.1 |

## Melee bench: F07

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 17 over 2 battles (8.5 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 75.6 | 18 / 70 | 3.20 | 14.7% | 6280 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.0 | 14.7% | 18 |
| morbid.MorbidPriest 1.0 | 2.5 | 12.3% | 13 |
| ara.Shera 0.88 | 3.0 | 12.9% | 15 |
| trm.Wrekt 1.1.6.f | 3.5 | 12.3% | 8 |
| uji.DBH 1.1 | 5.5 | 9.7% | 1 |
| intruder.PrairieWolf 2.61 | 5.5 | 9.8% | 10 |
| ph.melee.ArcherME 0.3 | 7.5 | 7.4% | 0 |
| com.spp.robocode.MostlyHarmless 010 | 8.0 | 7.2% | 3 |
| tcf.Reach 3 | 9.0 | 7.1% | 0 |
| stelo.AreaTargetingBot 1.1 | 9.5 | 6.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.5 | 74.0 | 9 / 35 | 2944 |
| 2 | 1 | 62.4 | 77.1 | 9 / 35 | 3336 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ara.Shera 0.88 | 12 | 50% |
| trm.Wrekt 1.1.6.f | 9 | 56% |
| intruder.PrairieWolf 2.61 | 7 | 0% |
| morbid.MorbidPriest 1.0 | 3 | 67% |
| uji.DBH 1.1 | 2 | 100% |
| tcf.Reach 3 | 1 | 100% |
| com.spp.robocode.MostlyHarmless 010 | 1 | 100% |
| stelo.AreaTargetingBot 1.1 | 1 | 100% |

Hadur died in 52 of 70 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 15 | 29% | 20 |
| morbid.MorbidPriest 1.0 | 9 | 17% | 11 |
| trm.Wrekt 1.1.6.f | 8 | 15% | 12 |
| intruder.PrairieWolf 2.61 | 7 | 13% | 6 |
| uji.DBH 1.1 | 4 | 8% | 7 |
| stelo.AreaTargetingBot 1.1 | 3 | 6% | 3 |
| ph.melee.ArcherME 0.3 | 3 | 6% | 3 |
| com.spp.robocode.MostlyHarmless 010 | 2 | 4% | 3 |
| tcf.Reach 3 | 1 | 2% | 5 |

Posture (Hadur's M records, 69 rounds): 49576 melee ticks, 9398 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (69 rounds): longest scan gap while four or more were alive 57 ticks (69 rounds over 8); rounds whose longest gap at any count was over 8: 69; robots dropped as dead without a death event: 0.

Targeting waves (69 rounds): 17619 sent, 16069 reached their opponent, 2821 virtual hits (17.6% of those reached).

## Melee bench: F08

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 26 over 2 battles (13.0 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 89.5 | 39 / 70 | 1.94 | 18.7% | 9586 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 18.7% | 39 |
| darkcanuck.Leon 1.01 | 2.0 | 15.9% | 14 |
| bts.mega.Gnarly 1.4 | 3.0 | 14.6% | 13 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.4% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 5.5 | 7.5% | 1 |
| tad.Dalek98 0.98 | 6.0 | 7.8% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 6.5 | 7.1% | 0 |
| spinnercat.Omen 1.0 | 8.5 | 6.1% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 6.1% | 0 |
| kurios.DOSexe .9a | 9.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 91.1 | 21 / 35 | 4812 |
| 2 | 1 | 67.7 | 87.9 | 18 / 35 | 4774 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 30 | 90% |
| bts.mega.Gnarly 1.4 | 10 | 70% |
| lrem.micro.SpikeSoldier 0.4 | 3 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 0% |

Hadur died in 31 of 70 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.mega.Gnarly 1.4 | 15 | 48% | 27 |
| darkcanuck.Leon 1.01 | 9 | 29% | 30 |
| tad.Dalek98 0.98 | 4 | 13% | 4 |
| lrem.micro.SpikeSoldier 0.4 | 2 | 6% | 5 |
| spinnercat.Omen 1.0 | 1 | 3% | 3 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 49204 melee ticks, 14818 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 54 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 14838 sent, 13277 reached their opponent, 2680 virtual hits (20.2% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 68.4% ± 9.2 | 67.7% ± 1.5 | +0.7 ± 7.7 |
| Survival | 89.5% ± 20.2 | 90.2% ± 24.2 | -0.6 ± 4.0 |
| Rounds won | 55.7% ± 54.5 | 62.9% ± 36.3 | -7.1 ± 18.2 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| darkcanuck.Leon 1.01 | 54.0% ± 0.5 | 54.6% ± 5.0 | -0.6 ± 5.5 |
| kawigi.sbf.FloodSonnet 0.9 | 71.3% ± 12.8 | 72.3% ± 7.3 | -1.0 ± 20.0 |
| kurios.DOSexe .9a | 76.2% ± 21.1 | 77.7% ± 11.3 | -1.5 ± 9.7 |
| spinnercat.Omen 1.0 | 75.5% ± 16.5 | 72.3% ± 0.3 | +3.2 ± 16.2 |
| bts.mega.Gnarly 1.4 | 56.1% ± 0.5 | 56.5% ± 17.4 | -0.4 ± 16.9 |
| tad.Dalek98 0.98 | 70.5% ± 35.2 | 69.0% ± 20.9 | +1.5 ± 56.1 |
| jeremyreeder.Vincent 2011.12.09 | 75.4% ± 6.9 | 72.0% ± 5.0 | +3.5 ± 1.9 |
| lrem.micro.SpikeSoldier 0.4 | 64.2% ± 15.9 | 62.0% ± 3.8 | +2.2 ± 12.0 |
| dcs.Eater_of_Worlds 1.1.3-A | 72.4% ± 5.8 | 73.0% ± 6.0 | -0.6 ± 0.2 |

## Melee bench: F08

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 20 over 2 battles (10.0 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 90.2 | 44 / 70 | 1.89 | 18.3% | 8106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.0 | 18.3% | 44 |
| darkcanuck.Leon 1.01 | 2.0 | 15.2% | 13 |
| bts.mega.Gnarly 1.4 | 3.0 | 14.1% | 11 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.2% | 0 |
| tad.Dalek98 0.98 | 5.0 | 8.2% | 2 |
| spinnercat.Omen 1.0 | 7.0 | 7.0% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 7.0 | 7.1% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 7.5 | 7.0% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.5 | 6.7% | 0 |
| kurios.DOSexe .9a | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 92.1 | 23 / 35 | 3857 |
| 2 | 1 | 67.6 | 88.3 | 21 / 35 | 4249 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 29 | 79% |
| bts.mega.Gnarly 1.4 | 16 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 4 | 100% |
| tad.Dalek98 0.98 | 3 | 33% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 27 of 70 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.mega.Gnarly 1.4 | 9 | 33% | 24 |
| darkcanuck.Leon 1.01 | 8 | 30% | 30 |
| lrem.micro.SpikeSoldier 0.4 | 3 | 11% | 5 |
| tad.Dalek98 0.98 | 2 | 7% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 4% | 3 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 4% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 4% | 1 |
| spinnercat.Omen 1.0 | 1 | 4% | 1 |
| kurios.DOSexe .9a | 1 | 4% | 1 |

Posture (Hadur's M records, 70 rounds): 46727 melee ticks, 15095 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 44 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 44 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 14654 sent, 13139 reached their opponent, 2432 virtual hits (18.5% of those reached).

## Melee bench: F09

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 22 over 2 battles (11.0 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 81.0 | 8 / 70 | 2.71 | 15.3% | 7353 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 19.6% | 40 |
| abc.Shadow 3.84i | 2.0 | 18.6% | 19 |
| hadur2.Hadur 3.13gk | 3.0 | 15.3% | 8 |
| shrub.Vapour v159 | 4.0 | 12.3% | 3 |
| EH.Eagle 1.0.6 | 5.0 | 9.8% | 0 |
| amk.ChumbaWumba 0.3 | 6.0 | 6.2% | 0 |
| mbh.Mbh 0.1 | 7.0 | 5.5% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 4.9% | 0 |
| sam.Samspin 1.0 | 8.5 | 5.0% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.2 | 80.6 | 4 / 35 | 3878 |
| 2 | 3 | 64.8 | 81.3 | 4 / 35 | 3475 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 16 | 38% |
| cb.fire.Firestarter 2.0f | 15 | 0% |
| shrub.Vapour v159 | 2 | 100% |

Hadur died in 62 of 70 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 30 | 48% | 36 |
| cb.fire.Firestarter 2.0f | 25 | 40% | 25 |
| shrub.Vapour v159 | 5 | 8% | 7 |
| sam.Samspin 1.0 | 1 | 2% | 1 |
| mbh.Mbh 0.1 | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 56620 melee ticks, 13111 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 46 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 1.

Targeting waves (70 rounds): 17282 sent, 15704 reached their opponent, 2762 virtual hits (17.6% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 65.0% ± 2.3 | 65.8% ± 6.6 | -0.8 ± 8.9 |
| Survival | 81.0% ± 4.0 | 83.7% ± 26.2 | -2.7 ± 22.2 |
| Rounds won | 11.4% ± 0.0 | 17.1% ± 36.3 | -5.7 ± 36.3 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 43.8% ± 2.3 | 44.9% ± 12.6 | -1.1 ± 10.3 |
| amk.ChumbaWumba 0.3 | 71.3% ± 9.3 | 71.0% ± 3.8 | +0.3 ± 5.5 |
| EH.Eagle 1.0.6 | 60.9% ± 21.7 | 62.2% ± 7.7 | -1.3 ± 29.3 |
| mym.EdgeStalker 1.0 | 84.1% ± 19.8 | 84.1% ± 10.1 | -0.0 ± 9.7 |
| shrub.Vapour v159 | 55.5% ± 1.8 | 56.6% ± 15.4 | -1.2 ± 17.2 |
| jsal.Jsalbot 1.0 | 75.7% ± 8.2 | 77.1% ± 13.7 | -1.5 ± 21.9 |
| sam.Samspin 1.0 | 75.4% ± 4.1 | 76.3% ± 7.0 | -0.9 ± 11.0 |
| abc.Shadow 3.84i | 45.1% ± 5.8 | 46.3% ± 15.4 | -1.2 ± 21.2 |
| mbh.Mbh 0.1 | 73.4% ± 13.1 | 73.5% ± 21.4 | -0.0 ± 8.3 |

## Melee bench: F09

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 18 over 2 battles (9.0 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 83.7 | 12 / 70 | 2.47 | 15.8% | 7257 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 19.4% | 35 |
| abc.Shadow 3.84i | 2.0 | 18.3% | 20 |
| hadur2.Hadur 3.13 | 3.0 | 15.8% | 12 |
| shrub.Vapour v159 | 4.0 | 12.1% | 3 |
| EH.Eagle 1.0.6 | 5.0 | 9.6% | 0 |
| amk.ChumbaWumba 0.3 | 6.0 | 6.5% | 0 |
| mbh.Mbh 0.1 | 7.0 | 5.7% | 0 |
| sam.Samspin 1.0 | 8.5 | 4.9% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.3 | 81.6 | 5 / 35 | 3685 |
| 2 | 3 | 66.3 | 85.7 | 7 / 35 | 3572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 21 | 10% |
| abc.Shadow 3.84i | 18 | 39% |
| shrub.Vapour v159 | 2 | 50% |
| EH.Eagle 1.0.6 | 2 | 100% |

Hadur died in 58 of 70 rounds, at a mean tick of 1059. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 29 | 50% | 33 |
| abc.Shadow 3.84i | 23 | 40% | 28 |
| shrub.Vapour v159 | 4 | 7% | 5 |
| EH.Eagle 1.0.6 | 2 | 3% | 4 |

Posture (Hadur's M records, 70 rounds): 59706 melee ticks, 16426 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 48 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 17388 sent, 15871 reached their opponent, 2512 virtual hits (15.8% of those reached).

## Melee bench: F10

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 26 over 2 battles (13.0 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 84.3 | 18 / 70 | 2.41 | 16.5% | 7437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 19.5% | 37 |
| hadur2.Hadur 3.13gk | 2.0 | 16.5% | 18 |
| brainfade.melee.Genghis 0.36 | 3.5 | 11.0% | 5 |
| mc2.enemy.Original 0.9 | 3.5 | 11.4% | 8 |
| arthord.NanoSatanMelee Beta | 5.5 | 9.2% | 2 |
| kawigi.mini.Fhqwhgads 1.1 | 6.5 | 7.6% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.0 | 6.9% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 6.7% | 0 |
| mld.Infinity 2.2 | 8.0 | 6.5% | 0 |
| dl.BetterWalls 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 85.4 | 10 / 35 | 3538 |
| 2 | 2 | 65.4 | 83.2 | 8 / 35 | 3899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 32 | 25% |
| mc2.enemy.Original 0.9 | 10 | 50% |
| arthord.NanoSatanMelee Beta | 4 | 50% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 100% |
| brainfade.melee.Genghis 0.36 | 1 | 100% |

Hadur died in 52 of 70 rounds, at a mean tick of 988. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 32 | 62% | 39 |
| mc2.enemy.Original 0.9 | 12 | 23% | 17 |
| arthord.NanoSatanMelee Beta | 4 | 8% | 5 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 4% | 2 |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 2% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 2% | 1 |
| brainfade.melee.Genghis 0.36 | 0 | 0% | 3 |

Posture (Hadur's M records, 69 rounds): 45716 melee ticks, 23644 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (69 rounds): longest scan gap while four or more were alive 33 ticks (69 rounds over 8); rounds whose longest gap at any count was over 8: 69; robots dropped as dead without a death event: 0.

Targeting waves (69 rounds): 15368 sent, 13868 reached their opponent, 2737 virtual hits (19.7% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 65.4% ± 1.0 | 66.2% ± 2.9 | -0.8 ± 3.9 |
| Survival | 84.3% ± 14.1 | 84.8% ± 8.1 | -0.5 ± 22.2 |
| Rounds won | 25.7% ± 36.3 | 37.1% ± 36.3 | -11.4 ± 0.0 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| fullsail.TimbotNoPrediction 1.0 | 70.8% ± 61.2 | 73.0% ± 17.2 | -2.2 ± 44.0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 71.1% ± 7.8 | 70.8% ± 31.6 | +0.3 ± 23.8 |
| brainfade.melee.Genghis 0.36 | 60.0% ± 30.5 | 62.1% ± 29.9 | -2.0 ± 0.6 |
| mld.Infinity 2.2 | 71.7% ± 7.0 | 66.8% ± 16.0 | +4.9 ± 9.0 |
| mc2.enemy.Original 0.9 | 59.0% ± 0.2 | 60.7% ± 5.4 | -1.6 ± 5.7 |
| arthord.NanoSatanMelee Beta | 64.3% ± 29.1 | 65.2% ± 29.2 | -0.9 ± 58.3 |
| positive.Portia 1.26e | 45.8% ± 7.0 | 47.4% ± 1.0 | -1.6 ± 8.0 |
| dl.BetterWalls 1.0 | 77.7% ± 6.5 | 78.4% ± 6.5 | -0.7 ± 12.9 |
| kawigi.mini.Fhqwhgads 1.1 | 68.4% ± 7.6 | 71.8% ± 27.2 | -3.5 ± 34.7 |

## Melee bench: F10

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 22 over 2 battles (11.0 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 84.8 | 26 / 70 | 2.37 | 17.1% | 7680 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.9% | 34 |
| hadur2.Hadur 3.13 | 2.0 | 17.1% | 26 |
| mc2.enemy.Original 0.9 | 3.5 | 11.1% | 6 |
| brainfade.melee.Genghis 0.36 | 4.0 | 10.5% | 1 |
| arthord.NanoSatanMelee Beta | 4.5 | 9.1% | 1 |
| mld.Infinity 2.2 | 6.0 | 8.5% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 7.1% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 6.3% | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 8.5 | 6.7% | 0 |
| dl.BetterWalls 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 84.1 | 14 / 35 | 3736 |
| 2 | 2 | 66.5 | 85.4 | 12 / 35 | 3944 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 31 | 39% |
| mc2.enemy.Original 0.9 | 13 | 77% |
| brainfade.melee.Genghis 0.36 | 3 | 67% |
| arthord.NanoSatanMelee Beta | 3 | 67% |

Hadur died in 44 of 70 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 23 | 52% | 37 |
| mc2.enemy.Original 0.9 | 9 | 20% | 19 |
| brainfade.melee.Genghis 0.36 | 4 | 9% | 5 |
| arthord.NanoSatanMelee Beta | 3 | 7% | 4 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 5% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 5% | 2 |
| dl.BetterWalls 1.0 | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 47828 melee ticks, 20046 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 55 ticks (69 rounds over 8); rounds whose longest gap at any count was over 8: 69; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 15553 sent, 14101 reached their opponent, 2703 virtual hits (19.2% of those reached).

## Melee bench: F11

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 24 over 2 battles (12.0 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 86.8 | 21 / 70 | 2.19 | 17.3% | 8473 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.0 | 20.0% | 41 |
| hadur2.Hadur 3.13gk | 2.0 | 17.3% | 21 |
| d414.nano.Quantum 1.0.0 | 3.0 | 15.0% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.0 | 12.2% | 4 |
| awesomeness.Elite 1.0 | 5.0 | 8.6% | 0 |
| jaybot.bots.Oddball 4.0 | 6.0 | 7.3% | 0 |
| fullsail.SweetTea 1.1 | 7.5 | 5.6% | 0 |
| stelo.WangRobot 1.0 | 8.0 | 5.3% | 0 |
| oa.weak.FlyMk1 0.1 | 8.5 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.9 | 86.7 | 12 / 35 | 4454 |
| 2 | 2 | 67.2 | 87.0 | 9 / 35 | 4019 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 30 | 13% |
| com.cohesiva.robocode.ManOwaR 1.0 | 9 | 78% |
| d414.nano.Quantum 1.0.0 | 7 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 50 of 70 rounds, at a mean tick of 1070. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 38 | 76% | 45 |
| d414.nano.Quantum 1.0.0 | 6 | 12% | 11 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5 | 10% | 11 |
| awesomeness.Elite 1.0 | 1 | 2% | 2 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 69 rounds): 58713 melee ticks, 16786 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (69 rounds): longest scan gap while four or more were alive 65 ticks (69 rounds over 8); rounds whose longest gap at any count was over 8: 69; robots dropped as dead without a death event: 0.

Targeting waves (69 rounds): 18456 sent, 16972 reached their opponent, 3053 virtual hits (18.0% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 67.6% ± 4.7 | 66.0% ± 6.6 | +1.6 ± 11.4 |
| Survival | 86.8% ± 2.0 | 84.6% ± 26.2 | +2.2 ± 24.2 |
| Rounds won | 30.0% ± 54.5 | 27.1% ± 90.8 | +2.9 ± 145.2 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| arthord.MannyPacquiao Beta | 84.5% ± 21.3 | 82.9% ± 42.4 | +1.6 ± 63.7 |
| jaybot.bots.Oddball 4.0 | 70.4% ± 1.1 | 70.7% ± 5.6 | -0.3 ± 4.5 |
| mn.Combat 3.25.0 | 46.3% ± 9.4 | 43.8% ± 10.4 | +2.5 ± 19.8 |
| com.cohesiva.robocode.ManOwaR 1.0 | 58.6% ± 1.6 | 58.1% ± 6.4 | +0.5 ± 4.8 |
| awesomeness.Elite 1.0 | 66.7% ± 17.5 | 67.2% ± 29.7 | -0.5 ± 47.2 |
| oa.weak.FlyMk1 0.1 | 75.8% ± 2.7 | 74.2% ± 17.2 | +1.6 ± 20.0 |
| stelo.WangRobot 1.0 | 76.7% ± 37.0 | 70.7% ± 37.3 | +6.1 ± 74.3 |
| d414.nano.Quantum 1.0.0 | 53.5% ± 6.5 | 51.2% ± 11.2 | +2.4 ± 17.7 |
| fullsail.SweetTea 1.1 | 75.5% ± 1.2 | 75.4% ± 18.7 | +0.1 ± 17.6 |

## Melee bench: F11

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 18 over 2 battles (9.0 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 84.6 | 19 / 70 | 2.39 | 16.2% | 7105 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.0 | 20.8% | 46 |
| hadur2.Hadur 3.13 | 2.0 | 16.2% | 19 |
| d414.nano.Quantum 1.0.0 | 3.0 | 15.5% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.0 | 11.7% | 2 |
| awesomeness.Elite 1.0 | 5.0 | 7.9% | 0 |
| jaybot.bots.Oddball 4.0 | 6.5 | 6.7% | 0 |
| stelo.WangRobot 1.0 | 7.0 | 6.8% | 0 |
| oa.weak.FlyMk1 0.1 | 8.0 | 5.7% | 0 |
| fullsail.SweetTea 1.1 | 8.5 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 82.5 | 7 / 35 | 3591 |
| 2 | 2 | 66.5 | 86.7 | 12 / 35 | 3514 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 31 | 13% |
| d414.nano.Quantum 1.0.0 | 14 | 93% |
| com.cohesiva.robocode.ManOwaR 1.0 | 3 | 67% |

Hadur died in 51 of 70 rounds, at a mean tick of 1016. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 34 | 67% | 43 |
| d414.nano.Quantum 1.0.0 | 7 | 14% | 14 |
| com.cohesiva.robocode.ManOwaR 1.0 | 3 | 6% | 6 |
| awesomeness.Elite 1.0 | 3 | 6% | 3 |
| stelo.WangRobot 1.0 | 1 | 2% | 1 |
| arthord.MannyPacquiao Beta | 1 | 2% | 1 |
| fullsail.SweetTea 1.1 | 1 | 2% | 1 |
| jaybot.bots.Oddball 4.0 | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 56411 melee ticks, 17351 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 65 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 18405 sent, 16849 reached their opponent, 2845 virtual hits (16.9% of those reached).

## Melee bench: F12

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 25 over 2 battles (12.5 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 92.2 | 38 / 70 | 1.70 | 20.3% | 12390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 20.3% | 38 |
| stelo.Liblix 0.3.1 | 2.0 | 15.9% | 11 |
| lxx.ConceptA 0.8 | 3.5 | 12.4% | 1 |
| techdude.forest.FlamingForest 1.1 | 3.5 | 12.9% | 16 |
| qohnil.blot.BlotBot 3.61 | 5.0 | 11.2% | 4 |
| bvh.mini.Fenrir 0.39 | 6.0 | 8.9% | 0 |
| sample.VelociRobot 1.0 | 7.5 | 5.3% | 0 |
| acogdev.alpha 0.2 | 8.0 | 5.2% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.5 | 4.7% | 0 |
| sample.Target 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 89.2 | 15 / 35 | 6213 |
| 2 | 1 | 72.0 | 95.2 | 23 / 35 | 6177 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| techdude.forest.FlamingForest 1.1 | 31 | 58% |
| stelo.Liblix 0.3.1 | 21 | 57% |
| qohnil.blot.BlotBot 3.61 | 7 | 57% |
| lxx.ConceptA 0.8 | 3 | 100% |
| bvh.mini.Fenrir 0.39 | 1 | 100% |

Hadur died in 33 of 70 rounds, at a mean tick of 1461. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| techdude.forest.FlamingForest 1.1 | 15 | 45% | 31 |
| stelo.Liblix 0.3.1 | 11 | 33% | 23 |
| qohnil.blot.BlotBot 3.61 | 3 | 9% | 7 |
| lxx.ConceptA 0.8 | 2 | 6% | 5 |
| bvh.mini.Fenrir 0.39 | 2 | 6% | 3 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 69 rounds): 60197 melee ticks, 34288 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (69 rounds): longest scan gap while four or more were alive 42 ticks (69 rounds over 8); rounds whose longest gap at any count was over 8: 69; robots dropped as dead without a death event: 0.

Targeting waves (69 rounds): 18606 sent, 17025 reached their opponent, 4811 virtual hits (28.3% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 71.1% ± 11.5 | 69.6% ± 2.6 | +1.5 ± 8.9 |
| Survival | 92.2% ± 38.3 | 88.1% ± 10.1 | +4.1 ± 28.2 |
| Rounds won | 54.3% ± 145.2 | 41.4% ± 18.2 | +12.9 ± 163.4 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| acogdev.alpha 0.2 | 79.6% ± 35.5 | 81.2% ± 17.8 | -1.7 ± 17.7 |
| techdude.forest.FlamingForest 1.1 | 61.1% ± 17.1 | 61.4% ± 8.6 | -0.2 ± 25.7 |
| sample.Target 1.0 | 86.1% ± 1.4 | 87.0% ± 6.3 | -0.9 ± 4.9 |
| lxx.ConceptA 0.8 | 62.1% ± 29.4 | 61.3% ± 3.1 | +0.8 ± 26.3 |
| stelo.Liblix 0.3.1 | 56.1% ± 21.1 | 51.9% ± 10.3 | +4.1 ± 31.4 |
| testantiswapgun.AntiSwap 1.0 | 81.2% ± 7.6 | 78.3% ± 6.9 | +2.9 ± 14.5 |
| qohnil.blot.BlotBot 3.61 | 64.5% ± 28.7 | 61.2% ± 16.2 | +3.4 ± 12.5 |
| sample.VelociRobot 1.0 | 79.5% ± 10.3 | 78.9% ± 5.0 | +0.5 ± 15.3 |
| bvh.mini.Fenrir 0.39 | 69.8% ± 24.3 | 65.5% ± 13.1 | +4.3 ± 37.4 |

## Melee bench: F12

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 16 over 2 battles (8.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.1 | 29 / 70 | 2.07 | 19.0% | 11437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.0 | 19.0% | 29 |
| stelo.Liblix 0.3.1 | 2.0 | 17.6% | 23 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 12.0% | 3 |
| lxx.ConceptA 0.8 | 4.0 | 12.0% | 2 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.9% | 11 |
| bvh.mini.Fenrir 0.39 | 6.0 | 10.0% | 1 |
| sample.VelociRobot 1.0 | 7.5 | 5.1% | 1 |
| testantiswapgun.AntiSwap 1.0 | 7.5 | 5.3% | 0 |
| acogdev.alpha 0.2 | 9.0 | 4.4% | 0 |
| sample.Target 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.3 | 15 / 35 | 5694 |
| 2 | 1 | 69.8 | 88.9 | 14 / 35 | 5743 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 31 | 45% |
| techdude.forest.FlamingForest 1.1 | 13 | 46% |
| qohnil.blot.BlotBot 3.61 | 7 | 100% |
| lxx.ConceptA 0.8 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 41 of 70 rounds, at a mean tick of 1131. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 19 | 46% | 31 |
| techdude.forest.FlamingForest 1.1 | 7 | 17% | 14 |
| qohnil.blot.BlotBot 3.61 | 5 | 12% | 13 |
| bvh.mini.Fenrir 0.39 | 5 | 12% | 6 |
| lxx.ConceptA 0.8 | 4 | 10% | 4 |
| testantiswapgun.AntiSwap 1.0 | 1 | 2% | 1 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 68 rounds): 56222 melee ticks, 22454 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (68 rounds): longest scan gap while four or more were alive 32 ticks (68 rounds over 8); rounds whose longest gap at any count was over 8: 68; robots dropped as dead without a death event: 0.

Targeting waves (68 rounds): 17978 sent, 16418 reached their opponent, 4554 virtual hits (27.7% of those reached).

## Melee bench: F13

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 21 over 2 battles (10.5 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.6 | 40 / 70 | 1.84 | 19.6% | 9925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 19.6% | 40 |
| az.Ololobot 0.2.4 | 2.0 | 15.4% | 19 |
| cre.Karolos 0.32 | 3.0 | 13.5% | 9 |
| fm.claire 1.7 | 4.0 | 11.7% | 0 |
| supersample.SuperBoxBot 1.0 | 5.0 | 10.4% | 1 |
| jp.Perpy 16.0 | 6.0 | 9.5% | 0 |
| stelo.Mirror 1.1 | 7.0 | 8.3% | 1 |
| dans.Cinnamon 1.2 | 8.0 | 6.9% | 0 |
| logiblocs.SittingDroid 1.0 | 9.0 | 3.6% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 87.9 | 20 / 35 | 4953 |
| 2 | 1 | 71.2 | 93.3 | 20 / 35 | 4972 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 33 | 58% |
| cre.Karolos 0.32 | 17 | 82% |
| stelo.Mirror 1.1 | 3 | 67% |
| fm.claire 1.7 | 2 | 100% |
| supersample.SuperBoxBot 1.0 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 30 of 70 rounds, at a mean tick of 1179. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 14 | 47% | 35 |
| cre.Karolos 0.32 | 7 | 23% | 15 |
| stelo.Mirror 1.1 | 4 | 13% | 7 |
| supersample.SuperBoxBot 1.0 | 2 | 7% | 7 |
| fm.claire 1.7 | 2 | 7% | 5 |
| jp.Perpy 16.0 | 1 | 3% | 1 |

Posture (Hadur's M records, 69 rounds): 45150 melee ticks, 30319 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (69 rounds): longest scan gap while four or more were alive 71 ticks (69 rounds over 8); rounds whose longest gap at any count was over 8: 69; robots dropped as dead without a death event: 0.

Targeting waves (69 rounds): 13949 sent, 12529 reached their opponent, 3296 virtual hits (26.3% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 70.4% ± 10.7 | 69.7% ± 17.5 | +0.6 ± 6.8 |
| Survival | 90.6% ± 34.3 | 91.9% ± 42.4 | -1.3 ± 8.1 |
| Rounds won | 57.1% ± 0.0 | 65.7% ± 145.2 | -8.6 ± 145.2 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| jp.Perpy 16.0 | 67.4% ± 20.4 | 67.5% ± 61.6 | -0.2 ± 41.3 |
| stelo.Mirror 1.1 | 70.1% ± 29.0 | 68.8% ± 39.0 | +1.3 ± 10.1 |
| logiblocs.SittingDroid 1.0 | 84.5% ± 8.6 | 84.4% ± 10.2 | +0.2 ± 18.8 |
| fm.claire 1.7 | 62.7% ± 5.5 | 62.2% ± 16.0 | +0.5 ± 21.5 |
| az.Ololobot 0.2.4 | 55.9% ± 3.5 | 55.2% ± 29.7 | +0.7 ± 33.1 |
| cre.Karolos 0.32 | 59.2% ± 11.5 | 59.5% ± 6.1 | -0.3 ± 17.5 |
| supersample.SuperBoxBot 1.0 | 65.2% ± 1.2 | 65.8% ± 2.9 | -0.6 ± 1.7 |
| rrh.Iwillfindyou 2.0 | 94.2% ± 31.2 | 90.9% ± 12.8 | +3.3 ± 18.4 |
| dans.Cinnamon 1.2 | 73.9% ± 3.3 | 73.1% ± 11.5 | +0.9 ± 8.3 |

## Melee bench: F13

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 30 over 2 battles (15.0 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 91.9 | 46 / 70 | 1.73 | 19.2% | 8793 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.0 | 19.2% | 46 |
| az.Ololobot 0.2.4 | 2.0 | 15.5% | 15 |
| cre.Karolos 0.32 | 3.0 | 13.1% | 6 |
| fm.claire 1.7 | 4.0 | 11.6% | 0 |
| supersample.SuperBoxBot 1.0 | 5.5 | 10.0% | 1 |
| jp.Perpy 16.0 | 6.0 | 9.3% | 1 |
| stelo.Mirror 1.1 | 6.5 | 8.7% | 1 |
| dans.Cinnamon 1.2 | 8.0 | 7.1% | 0 |
| logiblocs.SittingDroid 1.0 | 9.0 | 3.6% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 88.6 | 19 / 35 | 4159 |
| 2 | 1 | 71.1 | 95.2 | 27 / 35 | 4634 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 29 | 76% |
| cre.Karolos 0.32 | 15 | 80% |
| supersample.SuperBoxBot 1.0 | 5 | 100% |
| fm.claire 1.7 | 4 | 100% |
| stelo.Mirror 1.1 | 2 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 0% |

Hadur died in 25 of 70 rounds, at a mean tick of 980. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cre.Karolos 0.32 | 9 | 36% | 16 |
| az.Ololobot 0.2.4 | 7 | 28% | 32 |
| fm.claire 1.7 | 5 | 20% | 9 |
| jp.Perpy 16.0 | 2 | 8% | 3 |
| supersample.SuperBoxBot 1.0 | 1 | 4% | 5 |
| stelo.Mirror 1.1 | 1 | 4% | 5 |

Posture (Hadur's M records, 69 rounds): 47169 melee ticks, 24280 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (69 rounds): longest scan gap while four or more were alive 57 ticks (69 rounds over 8); rounds whose longest gap at any count was over 8: 69; robots dropped as dead without a death event: 0.

Targeting waves (69 rounds): 14742 sent, 13259 reached their opponent, 3339 virtual hits (25.2% of those reached).

## Melee bench: F14

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 24 over 2 battles (12.0 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 76.5 | 16 / 70 | 3.11 | 15.0% | 7100 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.1% | 26 |
| hadur2.Hadur 3.13gk | 2.5 | 15.0% | 16 |
| gh.mini.Griezel 0.2 | 2.5 | 15.5% | 21 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.5 | 12.6% | 3 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 12.3% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.0 | 8.4% | 2 |
| throxbot.ThroxBot 0.1 | 7.0 | 6.7% | 0 |
| patson.PatsonTestBot 1.0 | 8.0 | 6.2% | 0 |
| gjr.Cephalosporin 0.1 | 9.0 | 4.3% | 0 |
| sample.Tracker 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 76.5 | 8 / 35 | 3521 |
| 2 | 3 | 64.1 | 76.5 | 8 / 35 | 3579 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 13 | 38% |
| gh.mini.Griezel 0.2 | 9 | 44% |
| pe.minimelee.SandboxMiniMelee 1.1 | 3 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 100% |
| throxbot.ThroxBot 0.1 | 1 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 1 | 0% |

Hadur died in 54 of 70 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 18 | 33% | 21 |
| gh.mini.Griezel 0.2 | 17 | 31% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 10 | 19% | 12 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4 | 7% | 6 |
| kinsen.melee.Angsaichmophobia 1.8c | 3 | 6% | 5 |
| throxbot.ThroxBot 0.1 | 1 | 2% | 1 |
| gjr.Cephalosporin 0.1 | 1 | 2% | 1 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 53560 melee ticks, 11720 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 25 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 17307 sent, 15722 reached their opponent, 2889 virtual hits (18.4% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 63.9% ± 2.3 | 63.1% ± 14.7 | +0.9 ± 17.0 |
| Survival | 76.5% ± 0.0 | 76.8% ± 56.5 | -0.3 ± 56.5 |
| Rounds won | 22.9% ± 0.0 | 21.4% ± 54.5 | +1.4 ± 54.5 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 49.2% ± 19.3 | 50.0% ± 39.0 | -0.9 ± 19.6 |
| gjr.Cephalosporin 0.1 | 77.7% ± 17.1 | 74.4% ± 6.2 | +3.3 ± 23.3 |
| rz.Aleph 0.34 | 46.7% ± 7.1 | 44.2% ± 24.6 | +2.5 ± 31.7 |
| pe.minimelee.SandboxMiniMelee 1.1 | 54.5% ± 31.4 | 55.6% ± 10.5 | -1.1 ± 41.9 |
| sample.Tracker 1.0 | 88.9% ± 22.1 | 84.9% ± 1.8 | +4.0 ± 23.9 |
| kinsen.melee.Angsaichmophobia 1.8c | 64.1% ± 21.1 | 66.0% ± 23.0 | -1.9 ± 44.1 |
| throxbot.ThroxBot 0.1 | 69.0% ± 8.0 | 68.3% ± 32.9 | +0.7 ± 41.0 |
| patson.PatsonTestBot 1.0 | 70.6% ± 12.3 | 69.5% ± 26.8 | +1.1 ± 14.5 |
| wcsv.melee.EngineerMelee 0.1 | 54.8% ± 12.6 | 54.7% ± 13.9 | +0.1 ± 1.2 |

## Melee bench: F14

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 14 over 2 battles (7.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 76.8 | 15 / 70 | 3.09 | 14.7% | 6639 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 18.5% | 29 |
| hadur2.Hadur 3.13 | 2.5 | 14.7% | 15 |
| gh.mini.Griezel 0.2 | 2.5 | 14.7% | 18 |
| wcsv.melee.EngineerMelee 0.1 | 4.0 | 12.1% | 5 |
| pe.minimelee.SandboxMiniMelee 1.1 | 5.0 | 11.7% | 2 |
| throxbot.ThroxBot 0.1 | 6.5 | 6.8% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 7.0 | 7.6% | 1 |
| patson.PatsonTestBot 1.0 | 7.5 | 6.4% | 0 |
| gjr.Cephalosporin 0.1 | 9.0 | 5.0% | 0 |
| sample.Tracker 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 81.3 | 9 / 35 | 3302 |
| 2 | 3 | 61.9 | 72.4 | 6 / 35 | 3337 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.mini.Griezel 0.2 | 10 | 40% |
| rz.Aleph 0.34 | 10 | 40% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 75% |
| pe.minimelee.SandboxMiniMelee 1.1 | 3 | 67% |
| patson.PatsonTestBot 1.0 | 1 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 1 | 100% |

Hadur died in 55 of 70 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 23 | 42% | 29 |
| gh.mini.Griezel 0.2 | 14 | 25% | 18 |
| wcsv.melee.EngineerMelee 0.1 | 8 | 15% | 10 |
| pe.minimelee.SandboxMiniMelee 1.1 | 7 | 13% | 8 |
| kinsen.melee.Angsaichmophobia 1.8c | 2 | 4% | 3 |
| gjr.Cephalosporin 0.1 | 1 | 2% | 1 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 68 rounds): 54968 melee ticks, 9699 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (68 rounds): longest scan gap while four or more were alive 33 ticks (68 rounds over 8); rounds whose longest gap at any count was over 8: 68; robots dropped as dead without a death event: 0.

Targeting waves (68 rounds): 16821 sent, 15304 reached their opponent, 2658 virtual hits (17.4% of those reached).

## Melee bench: F15

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 17 over 2 battles (8.5 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 88.4 | 46 / 70 | 2.04 | 18.8% | 8010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 18.8% | 46 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.5% | 10 |
| yagami.Tidus 0.11 | 3.0 | 11.6% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.7% | 3 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 10.0% | 2 |
| krillr.mini.JointStrike 2.0.0 | 6.0 | 9.3% | 2 |
| Grystrion.TrackerWO 1.0 | 7.5 | 8.1% | 3 |
| ahr.ice.Ice 1.0.2 | 7.5 | 6.7% | 2 |
| donjezza.Jezza 1.0 | 9.5 | 5.2% | 1 |
| amk.ChumbaMini 0.2 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 87.3 | 22 / 35 | 3923 |
| 2 | 1 | 68.8 | 89.5 | 24 / 35 | 4087 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 26 | 88% |
| yagami.Tidus 0.11 | 11 | 100% |
| bvh.fnr.Fenrir 0.36l | 8 | 75% |
| stelo.SoRobotNanoMelee 1.2 | 4 | 100% |
| donjezza.Jezza 1.0 | 2 | 50% |
| Grystrion.TrackerWO 1.0 | 2 | 50% |
| ahr.ice.Ice 1.0.2 | 1 | 0% |

Hadur died in 24 of 70 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 7 | 29% | 16 |
| yagami.Tidus 0.11 | 4 | 17% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 3 | 13% | 14 |
| ahr.ice.Ice 1.0.2 | 3 | 13% | 3 |
| bvh.fnr.Fenrir 0.36l | 2 | 8% | 10 |
| krillr.mini.JointStrike 2.0.0 | 2 | 8% | 5 |
| amk.ChumbaMini 0.2 | 1 | 4% | 4 |
| Grystrion.TrackerWO 1.0 | 1 | 4% | 3 |
| donjezza.Jezza 1.0 | 1 | 4% | 2 |

Posture (Hadur's M records, 70 rounds): 47024 melee ticks, 12060 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 43 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 16440 sent, 14903 reached their opponent, 3117 virtual hits (20.9% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 68.3% ± 7.5 | 66.2% ± 20.3 | +2.1 ± 27.9 |
| Survival | 88.4% ± 14.1 | 82.7% ± 54.5 | +5.7 ± 68.6 |
| Rounds won | 65.7% ± 36.3 | 60.0% ± 108.9 | +5.7 ± 145.2 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| yagami.Tidus 0.11 | 61.9% ± 13.9 | 57.6% ± 47.7 | +4.3 ± 61.6 |
| amk.ChumbaMini 0.2 | 78.2% ± 15.2 | 74.5% ± 6.2 | +3.7 ± 21.4 |
| krillr.mini.JointStrike 2.0.0 | 66.9% ± 0.6 | 62.3% ± 1.9 | +4.6 ± 1.3 |
| donjezza.Jezza 1.0 | 78.3% ± 21.9 | 75.5% ± 19.0 | +2.8 ± 40.9 |
| kawigi.micro.Shiz 1.1 | 56.5% ± 23.5 | 55.8% ± 12.3 | +0.6 ± 11.2 |
| Grystrion.TrackerWO 1.0 | 69.9% ± 35.6 | 70.1% ± 37.0 | -0.2 ± 72.6 |
| bvh.fnr.Fenrir 0.36l | 65.3% ± 0.8 | 66.4% ± 14.5 | -1.0 ± 13.7 |
| ahr.ice.Ice 1.0.2 | 73.6% ± 12.9 | 71.0% ± 22.8 | +2.6 ± 9.9 |
| stelo.SoRobotNanoMelee 1.2 | 63.7% ± 19.2 | 62.2% ± 21.7 | +1.5 ± 40.9 |

## Melee bench: F15

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 17 over 2 battles (8.5 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 82.7 | 42 / 70 | 2.56 | 17.4% | 7343 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.0 | 17.4% | 42 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.7% | 11 |
| yagami.Tidus 0.11 | 2.5 | 12.8% | 5 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 10.5% | 3 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.5% | 2 |
| bvh.fnr.Fenrir 0.36l | 6.0 | 8.8% | 2 |
| ahr.ice.Ice 1.0.2 | 7.5 | 7.1% | 2 |
| Grystrion.TrackerWO 1.0 | 7.5 | 7.4% | 1 |
| amk.ChumbaMini 0.2 | 9.5 | 6.0% | 0 |
| donjezza.Jezza 1.0 | 9.5 | 5.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 87.0 | 24 / 35 | 3850 |
| 2 | 1 | 64.6 | 78.4 | 18 / 35 | 3493 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 16 | 94% |
| yagami.Tidus 0.11 | 11 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 5 | 100% |
| bvh.fnr.Fenrir 0.36l | 4 | 100% |
| Grystrion.TrackerWO 1.0 | 3 | 100% |
| krillr.mini.JointStrike 2.0.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |

Hadur died in 29 of 70 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 7 | 24% | 15 |
| yagami.Tidus 0.11 | 6 | 21% | 18 |
| krillr.mini.JointStrike 2.0.0 | 6 | 21% | 10 |
| Grystrion.TrackerWO 1.0 | 4 | 14% | 4 |
| bvh.fnr.Fenrir 0.36l | 3 | 10% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 1 | 3% | 9 |
| amk.ChumbaMini 0.2 | 1 | 3% | 4 |
| ahr.ice.Ice 1.0.2 | 0 | 0% | 1 |
| donjezza.Jezza 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 70 rounds): 45391 melee ticks, 8775 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 47 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 15946 sent, 14390 reached their opponent, 2619 virtual hits (18.2% of those reached).

## Melee bench: F16

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 29 over 2 battles (14.5 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 75.1 | 20 / 70 | 3.24 | 14.8% | 7525 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.6% | 34 |
| hadur2.Hadur 3.13gk | 2.5 | 14.8% | 20 |
| gh.mini.Gruwel 0.9 | 2.5 | 14.0% | 15 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 4.0 | 11.2% | 0 |
| mz.AntiGrav 1.0 | 5.5 | 9.8% | 0 |
| vjik.UnViolation 1.1 | 5.5 | 9.6% | 1 |
| ahf.NanoAndrew .4 | 7.0 | 8.4% | 0 |
| sadoner.killer 0.2 | 8.0 | 7.8% | 0 |
| PSW.Relentless 0.1 | 9.0 | 3.5% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 79.4 | 13 / 35 | 4273 |
| 2 | 3 | 61.0 | 70.8 | 7 / 35 | 3252 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 21 | 57% |
| gh.mini.Gruwel 0.9 | 10 | 40% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2 | 100% |
| mz.AntiGrav 1.0 | 1 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |
| vjik.UnViolation 1.1 | 1 | 0% |

Hadur died in 50 of 70 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 21 | 42% | 33 |
| gh.mini.Gruwel 0.9 | 13 | 26% | 17 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 5 | 10% | 7 |
| mz.AntiGrav 1.0 | 3 | 6% | 4 |
| vjik.UnViolation 1.1 | 3 | 6% | 3 |
| PSW.Relentless 0.1 | 2 | 4% | 2 |
| sadoner.killer 0.2 | 2 | 4% | 2 |
| ahf.NanoAndrew .4 | 1 | 2% | 2 |

Posture (Hadur's M records, 70 rounds): 49492 melee ticks, 13134 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 25 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 15992 sent, 14469 reached their opponent, 2467 virtual hits (17.1% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 63.2% ± 28.4 | 65.5% ± 9.8 | -2.3 ± 18.6 |
| Survival | 75.1% ± 54.5 | 82.9% ± 28.2 | -7.8 ± 26.2 |
| Rounds won | 28.6% ± 108.9 | 37.1% ± 72.6 | -8.6 ± 36.3 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| sadoner.killer 0.2 | 65.4% ± 39.9 | 67.9% ± 27.2 | -2.5 ± 12.7 |
| ahf.NanoAndrew .4 | 63.6% ± 38.5 | 65.3% ± 21.3 | -1.8 ± 17.2 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 56.7% ± 17.0 | 58.4% ± 19.1 | -1.6 ± 2.1 |
| gh.mini.Gruwel 0.9 | 51.2% ± 23.6 | 55.8% ± 8.4 | -4.6 ± 15.2 |
| vjik.UnViolation 1.1 | 60.4% ± 52.7 | 64.2% ± 1.8 | -3.8 ± 50.9 |
| mz.AntiGrav 1.0 | 60.1% ± 47.6 | 64.1% ± 15.4 | -4.1 ± 63.0 |
| kc.mini.Mirage 0.2 | 44.2% ± 26.5 | 46.7% ± 15.0 | -2.5 ± 11.5 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 86.4% ± 12.0 | 84.0% ± 8.2 | +2.5 ± 20.2 |
| PSW.Relentless 0.1 | 80.8% ± 21.6 | 82.8% ± 2.0 | -2.0 ± 19.6 |

## Melee bench: F16

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 13 over 2 battles (6.5 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 82.9 | 26 / 70 | 2.54 | 16.2% | 7991 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.5% | 31 |
| hadur2.Hadur 3.13 | 2.0 | 16.2% | 26 |
| gh.mini.Gruwel 0.9 | 3.0 | 12.8% | 10 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 4.0 | 11.6% | 0 |
| mz.AntiGrav 1.0 | 6.0 | 9.1% | 0 |
| vjik.UnViolation 1.1 | 6.0 | 9.0% | 3 |
| ahf.NanoAndrew .4 | 6.0 | 8.6% | 0 |
| sadoner.killer 0.2 | 8.0 | 7.7% | 0 |
| PSW.Relentless 0.1 | 9.0 | 3.4% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 85.1 | 15 / 35 | 4000 |
| 2 | 2 | 64.7 | 80.6 | 11 / 35 | 3991 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 37 | 51% |
| gh.mini.Gruwel 0.9 | 4 | 75% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3 | 100% |
| vjik.UnViolation 1.1 | 2 | 0% |
| mz.AntiGrav 1.0 | 1 | 100% |

Hadur died in 44 of 70 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 25 | 57% | 43 |
| gh.mini.Gruwel 0.9 | 9 | 20% | 13 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3 | 7% | 5 |
| ahf.NanoAndrew .4 | 3 | 7% | 4 |
| vjik.UnViolation 1.1 | 2 | 5% | 2 |
| mz.AntiGrav 1.0 | 1 | 2% | 2 |
| sadoner.killer 0.2 | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 51144 melee ticks, 14313 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 39 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 16139 sent, 14667 reached their opponent, 2343 virtual hits (16.0% of those reached).

## Melee bench: F17

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 23 over 2 battles (11.5 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 93.8 | 52 / 70 | 1.56 | 20.6% | 11590 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 20.6% | 52 |
| pe.SandboxLump 1.52 | 2.0 | 15.8% | 10 |
| lrem.Spectre 0.4.4 | 3.5 | 11.6% | 1 |
| josago.Jorgito 0.16 | 4.0 | 11.1% | 4 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 11.1% | 1 |
| ratosh.Wesco 1.4 | 6.5 | 8.3% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 7.4% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.0 | 6.5% | 0 |
| sample.MyFirstRobot 1.0 | 9.0 | 4.0% | 0 |
| sample.Fire 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 94.0 | 27 / 35 | 5961 |
| 2 | 1 | 70.8 | 93.7 | 25 / 35 | 5629 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 27 | 85% |
| lrem.Spectre 0.4.4 | 16 | 100% |
| josago.Jorgito 0.16 | 11 | 73% |
| ratosh.Wesco 1.4 | 3 | 33% |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |
| sample.MyFirstRobot 1.0 | 1 | 100% |

Hadur died in 18 of 70 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 10 | 56% | 31 |
| josago.Jorgito 0.16 | 5 | 28% | 12 |
| ratosh.Wesco 1.4 | 3 | 17% | 5 |
| lrem.Spectre 0.4.4 | 0 | 0% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 0 | 0% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 1 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 48100 melee ticks, 19375 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 32 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 16182 sent, 14692 reached their opponent, 5248 virtual hits (35.7% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 71.2% ± 5.3 | 68.8% ± 1.3 | +2.4 ± 6.6 |
| Survival | 93.8% ± 2.0 | 91.4% ± 8.1 | +2.4 ± 6.1 |
| Rounds won | 74.3% ± 36.3 | 58.6% ± 54.5 | +15.7 ± 90.8 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| davidalves.net.DuelistMicroMelee 1.4 | 64.9% ± 6.0 | 64.4% ± 7.9 | +0.5 ± 13.9 |
| dmh.robocode.robot.RedDwarf 0.4 | 73.6% ± 22.2 | 69.3% ± 15.5 | +4.3 ± 37.8 |
| lrem.Spectre 0.4.4 | 64.1% ± 13.4 | 59.8% ± 8.5 | +4.3 ± 4.9 |
| pe.SandboxLump 1.52 | 56.6% ± 13.0 | 56.6% ± 6.2 | -0.0 ± 6.8 |
| djdjdj.NanoSkunk10 1.0 | 76.0% ± 25.6 | 73.3% ± 9.6 | +2.7 ± 35.2 |
| ratosh.Wesco 1.4 | 71.2% ± 7.7 | 70.1% ± 18.1 | +1.1 ± 25.8 |
| josago.Jorgito 0.16 | 65.0% ± 5.0 | 63.0% ± 0.9 | +1.9 ± 4.1 |
| sample.MyFirstRobot 1.0 | 83.9% ± 3.6 | 80.5% ± 6.2 | +3.4 ± 9.8 |
| sample.Fire 1.0 | 85.4% ± 12.3 | 82.4% ± 17.5 | +3.0 ± 29.9 |

## Melee bench: F17

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 26 over 2 battles (13.0 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 91.4 | 41 / 70 | 1.77 | 19.0% | 9823 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.0 | 19.0% | 41 |
| pe.SandboxLump 1.52 | 2.0 | 14.5% | 10 |
| lrem.Spectre 0.4.4 | 3.0 | 12.8% | 10 |
| josago.Jorgito 0.16 | 4.0 | 11.1% | 3 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.0 | 10.5% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 8.4% | 0 |
| ratosh.Wesco 1.4 | 6.5 | 8.1% | 1 |
| djdjdj.NanoSkunk10 1.0 | 8.0 | 6.9% | 0 |
| sample.MyFirstRobot 1.0 | 9.0 | 4.6% | 1 |
| sample.Fire 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 92.1 | 19 / 35 | 4985 |
| 2 | 1 | 68.9 | 90.8 | 22 / 35 | 4838 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 24 | 63% |
| lrem.Spectre 0.4.4 | 21 | 76% |
| ratosh.Wesco 1.4 | 4 | 75% |
| josago.Jorgito 0.16 | 4 | 50% |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 67% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 29 of 70 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 13 | 45% | 25 |
| lrem.Spectre 0.4.4 | 7 | 24% | 21 |
| josago.Jorgito 0.16 | 5 | 17% | 8 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 10% | 8 |
| ratosh.Wesco 1.4 | 1 | 3% | 2 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 4 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 50171 melee ticks, 17971 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 25 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 16457 sent, 14896 reached their opponent, 4819 virtual hits (32.4% of those reached).

## Melee bench: F18

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 23 over 2 battles (11.5 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 87.3 | 35 / 70 | 2.14 | 17.6% | 7950 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 17.6% | 35 |
| zyx.mega.YersiniaPestis 3.1 | 2.0 | 15.7% | 17 |
| ak.Fermat 2.0 | 3.0 | 13.6% | 9 |
| pedersen.Ugluk 1.1.1 | 4.0 | 12.8% | 3 |
| jdw.Hurricane 1.4 | 5.0 | 10.8% | 3 |
| tvv.micro.Antares 1.1.1 | 6.0 | 9.2% | 2 |
| jeremyreeder.collective.Prophet 5 | 7.5 | 6.7% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.5% | 1 |
| pac.ABC 2.1 | 8.5 | 6.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 86.7 | 17 / 35 | 4044 |
| 2 | 1 | 67.7 | 87.9 | 18 / 35 | 3906 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 20 | 60% |
| ak.Fermat 2.0 | 11 | 64% |
| pedersen.Ugluk 1.1.1 | 11 | 91% |
| jdw.Hurricane 1.4 | 3 | 67% |
| tvv.micro.Antares 1.1.1 | 2 | 100% |
| pac.ABC 2.1 | 2 | 100% |
| rampancy.Durandal 2.1d | 1 | 0% |

Hadur died in 35 of 70 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 13 | 37% | 29 |
| ak.Fermat 2.0 | 10 | 29% | 20 |
| jdw.Hurricane 1.4 | 8 | 23% | 11 |
| pedersen.Ugluk 1.1.1 | 2 | 6% | 5 |
| rampancy.Durandal 2.1d | 2 | 6% | 2 |
| tvv.micro.Antares 1.1.1 | 0 | 0% | 2 |
| jeremyreeder.collective.Prophet 5 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 53150 melee ticks, 12185 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 41 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 17459 sent, 15913 reached their opponent, 3136 virtual hits (19.7% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 67.6% ± 1.5 | 66.1% ± 12.5 | +1.5 ± 10.9 |
| Survival | 87.3% ± 8.1 | 84.0% ± 34.3 | +3.3 ± 26.2 |
| Rounds won | 50.0% ± 18.2 | 37.1% ± 72.6 | +12.9 ± 54.5 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| rampancy.Durandal 2.1d | 76.4% ± 46.6 | 72.9% ± 22.5 | +3.5 ± 24.1 |
| zyx.mega.YersiniaPestis 3.1 | 52.8% ± 16.4 | 52.1% ± 25.1 | +0.7 ± 8.7 |
| tvv.micro.Antares 1.1.1 | 65.7% ± 31.6 | 65.4% ± 32.4 | +0.3 ± 64.0 |
| jeremyreeder.collective.Prophet 5 | 72.4% ± 13.7 | 72.2% ± 26.3 | +0.2 ± 39.9 |
| sample.TrackFire 1.0 | 91.0% ± 2.5 | 90.8% ± 10.9 | +0.2 ± 13.3 |
| pac.ABC 2.1 | 73.3% ± 8.7 | 76.1% ± 2.0 | -2.8 ± 10.7 |
| pedersen.Ugluk 1.1.1 | 57.9% ± 8.1 | 57.3% ± 17.4 | +0.6 ± 25.6 |
| jdw.Hurricane 1.4 | 62.1% ± 2.5 | 58.9% ± 3.1 | +3.2 ± 5.6 |
| ak.Fermat 2.0 | 56.5% ± 3.4 | 49.2% ± 13.8 | +7.3 ± 17.2 |

## Melee bench: F18

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 13 over 2 battles (6.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 84.0 | 26 / 70 | 2.44 | 16.4% | 7254 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.5 | 16.9% | 22 |
| hadur2.Hadur 3.13 | 1.5 | 16.4% | 26 |
| zyx.mega.YersiniaPestis 3.1 | 3.0 | 15.1% | 14 |
| pedersen.Ugluk 1.1.1 | 4.0 | 12.3% | 4 |
| jdw.Hurricane 1.4 | 5.0 | 11.4% | 4 |
| tvv.micro.Antares 1.1.1 | 6.0 | 8.7% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.0 | 6.3% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 6.1% | 0 |
| pac.ABC 2.1 | 9.0 | 5.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 81.3 | 11 / 35 | 3558 |
| 2 | 1 | 67.1 | 86.7 | 15 / 35 | 3696 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 17 | 41% |
| zyx.mega.YersiniaPestis 3.1 | 11 | 55% |
| pedersen.Ugluk 1.1.1 | 8 | 75% |
| jdw.Hurricane 1.4 | 5 | 80% |
| pac.ABC 2.1 | 2 | 100% |
| tvv.micro.Antares 1.1.1 | 1 | 100% |

Hadur died in 45 of 70 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 19 | 42% | 27 |
| zyx.mega.YersiniaPestis 3.1 | 13 | 29% | 21 |
| pedersen.Ugluk 1.1.1 | 7 | 16% | 11 |
| jdw.Hurricane 1.4 | 5 | 11% | 9 |
| jeremyreeder.collective.Prophet 5 | 1 | 2% | 1 |
| tvv.micro.Antares 1.1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 49198 melee ticks, 14665 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 26 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 16562 sent, 15010 reached their opponent, 2720 virtual hits (18.1% of those reached).

## Melee bench: F19

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 22 over 2 battles (11.0 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 89.5 | 42 / 70 | 1.94 | 18.4% | 8570 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 18.4% | 42 |
| rz.HawkOnFire 0.1 | 2.0 | 15.8% | 3 |
| agd.Mooserwirt2 2.7 | 3.5 | 13.3% | 10 |
| cx.BlestPain 1.41 | 3.5 | 13.4% | 14 |
| cs.sheldor.Talon 1.1 | 5.0 | 8.8% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 6.0 | 7.6% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 7.0 | 7.1% | 0 |
| stelo.MyAgileRobot 0.2 | 8.0 | 6.9% | 0 |
| fire219.CatBot 1.0 | 9.0 | 6.0% | 0 |
| pedersen.Moron 2.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 89.2 | 20 / 35 | 4285 |
| 2 | 1 | 68.4 | 89.8 | 22 / 35 | 4285 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 21 | 100% |
| cx.BlestPain 1.41 | 14 | 50% |
| agd.Mooserwirt2 2.7 | 13 | 77% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 28 of 70 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 10 | 36% | 22 |
| rz.HawkOnFire 0.1 | 8 | 29% | 21 |
| agd.Mooserwirt2 2.7 | 8 | 29% | 17 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 4% | 5 |
| fire219.CatBot 1.0 | 1 | 4% | 1 |
| cs.sheldor.Talon 1.1 | 0 | 0% | 1 |
| stelo.MyAgileRobot 0.2 | 0 | 0% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 69 rounds): 52211 melee ticks, 19853 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (69 rounds): longest scan gap while four or more were alive 40 ticks (69 rounds over 8); rounds whose longest gap at any count was over 8: 69; robots dropped as dead without a death event: 0.

Targeting waves (69 rounds): 16103 sent, 14599 reached their opponent, 2453 virtual hits (16.8% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 68.4% ± 0.5 | 66.5% ± 6.9 | +1.9 ± 7.4 |
| Survival | 89.5% ± 4.0 | 85.6% ± 10.1 | +4.0 ± 6.1 |
| Rounds won | 60.0% ± 36.3 | 38.6% ± 54.5 | +21.4 ± 18.2 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| fullsail.LaxativeTeaTwo 1.0 | 70.9% ± 4.9 | 70.3% ± 7.4 | +0.6 ± 12.4 |
| stelo.MyAgileRobot 0.2 | 72.8% ± 0.6 | 70.7% ± 5.7 | +2.1 ± 5.0 |
| cs.sheldor.Talon 1.1 | 67.7% ± 2.6 | 68.3% ± 26.2 | -0.6 ± 23.6 |
| rz.HawkOnFire 0.1 | 53.9% ± 12.5 | 52.8% ± 2.6 | +1.1 ± 9.8 |
| cx.BlestPain 1.41 | 58.0% ± 6.2 | 52.8% ± 13.7 | +5.2 ± 7.5 |
| agd.Mooserwirt2 2.7 | 58.0% ± 9.1 | 52.0% ± 4.6 | +6.1 ± 4.5 |
| edu.otg.spr.TheTeacher 1.2 | 72.3% ± 3.8 | 70.9% ± 23.8 | +1.3 ± 27.6 |
| pedersen.Moron 2.0 | 86.7% ± 1.7 | 86.6% ± 14.3 | +0.0 ± 12.7 |
| fire219.CatBot 1.0 | 75.6% ± 24.3 | 74.1% ± 3.6 | +1.5 ± 27.9 |

## Melee bench: F19

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 17 over 2 battles (8.5 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 85.6 | 27 / 70 | 2.30 | 16.9% | 7822 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.0 | 16.9% | 27 |
| agd.Mooserwirt2 2.7 | 2.0 | 15.6% | 16 |
| cx.BlestPain 1.41 | 3.5 | 15.1% | 23 |
| rz.HawkOnFire 0.1 | 3.5 | 15.1% | 4 |
| cs.sheldor.Talon 1.1 | 5.5 | 7.8% | 0 |
| stelo.MyAgileRobot 0.2 | 6.5 | 7.0% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 7.0 | 6.9% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.0 | 7.1% | 0 |
| fire219.CatBot 1.0 | 9.0 | 5.9% | 0 |
| pedersen.Moron 2.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 84.8 | 12 / 35 | 3704 |
| 2 | 1 | 67.0 | 86.3 | 15 / 35 | 4118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cx.BlestPain 1.41 | 16 | 13% |
| rz.HawkOnFire 0.1 | 16 | 81% |
| agd.Mooserwirt2 2.7 | 12 | 83% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 43 of 70 rounds, at a mean tick of 1067. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 26 | 60% | 32 |
| agd.Mooserwirt2 2.7 | 7 | 16% | 17 |
| rz.HawkOnFire 0.1 | 6 | 14% | 11 |
| cs.sheldor.Talon 1.1 | 1 | 2% | 3 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 2% | 3 |
| fire219.CatBot 1.0 | 1 | 2% | 2 |
| stelo.MyAgileRobot 0.2 | 1 | 2% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 53639 melee ticks, 19549 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 24 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 16676 sent, 15155 reached their opponent, 2300 virtual hits (15.2% of those reached).

## Melee bench: F20

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 60 over 2 battles (30.0 per battle, most in one battle 50). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 83.7 | 35 / 70 | 2.47 | 17.0% | 7958 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 17.0% | 35 |
| jcs.Seth 1.8 | 3.0 | 12.9% | 14 |
| oog.melee.Corsair 1.0 | 3.0 | 14.0% | 6 |
| labg.Cataclysm 2.05 | 3.0 | 13.3% | 12 |
| erdnis.Rover 0.3 | 5.0 | 9.5% | 1 |
| SHAM.WOW 1.4 | 6.5 | 7.6% | 1 |
| lambdaxy.TBot 0.1 | 6.5 | 7.3% | 0 |
| stelo.UntouchableNano 1.3 | 8.5 | 6.3% | 2 |
| adt.Ar2 1.0 | 8.5 | 6.8% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 82.5 | 17 / 35 | 3901 |
| 2 | 1 | 66.2 | 84.8 | 18 / 35 | 4057 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| labg.Cataclysm 2.05 | 16 | 81% |
| jcs.Seth 1.8 | 13 | 54% |
| oog.melee.Corsair 1.0 | 12 | 83% |
| SHAM.WOW 1.4 | 4 | 100% |
| erdnis.Rover 0.3 | 1 | 100% |
| stelo.UntouchableNano 1.3 | 1 | 0% |

Hadur died in 36 of 70 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jcs.Seth 1.8 | 12 | 33% | 19 |
| oog.melee.Corsair 1.0 | 8 | 22% | 20 |
| lambdaxy.TBot 0.1 | 6 | 17% | 6 |
| stelo.UntouchableNano 1.3 | 4 | 11% | 4 |
| labg.Cataclysm 2.05 | 3 | 8% | 14 |
| erdnis.Rover 0.3 | 1 | 3% | 4 |
| SHAM.WOW 1.4 | 1 | 3% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 68 rounds): 46283 melee ticks, 16714 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (68 rounds): longest scan gap while four or more were alive 79 ticks (68 rounds over 8); rounds whose longest gap at any count was over 8: 68; robots dropped as dead without a death event: 2.

Targeting waves (68 rounds): 14653 sent, 13200 reached their opponent, 2490 virtual hits (18.9% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 65.8% ± 5.3 | 65.7% ± 5.6 | +0.1 ± 10.9 |
| Survival | 83.7% ± 14.1 | 85.1% ± 12.1 | -1.4 ± 26.2 |
| Rounds won | 50.0% ± 18.2 | 51.4% ± 0.0 | -1.4 ± 18.2 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| lambdaxy.TBot 0.1 | 70.0% ± 14.3 | 70.6% ± 9.8 | -0.5 ± 24.1 |
| erdnis.Rover 0.3 | 64.3% ± 4.4 | 62.2% ± 8.4 | +2.1 ± 12.8 |
| jcs.Seth 1.8 | 56.9% ± 34.1 | 58.3% ± 33.9 | -1.4 ± 68.1 |
| adt.Ar2 1.0 | 71.5% ± 14.2 | 66.4% ± 2.4 | +5.1 ± 16.6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 76.4% ± 18.5 | 74.3% ± 17.6 | +2.1 ± 36.1 |
| SHAM.WOW 1.4 | 69.0% ± 11.3 | 71.0% ± 12.3 | -2.0 ± 23.7 |
| stelo.UntouchableNano 1.3 | 73.1% ± 24.1 | 74.0% ± 3.4 | -0.8 ± 20.7 |
| labg.Cataclysm 2.05 | 56.1% ± 12.9 | 57.4% ± 8.3 | -1.3 ± 4.6 |
| oog.melee.Corsair 1.0 | 54.9% ± 5.5 | 57.0% ± 2.5 | -2.1 ± 8.0 |

## Melee bench: F20

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 48 over 2 battles (24.0 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 85.1 | 36 / 70 | 2.34 | 17.1% | 7395 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.0 | 17.1% | 36 |
| oog.melee.Corsair 1.0 | 3.0 | 12.9% | 6 |
| labg.Cataclysm 2.05 | 3.0 | 12.7% | 9 |
| jcs.Seth 1.8 | 3.0 | 12.3% | 12 |
| erdnis.Rover 0.3 | 5.0 | 10.4% | 5 |
| adt.Ar2 1.0 | 6.0 | 8.7% | 0 |
| lambdaxy.TBot 0.1 | 7.5 | 7.1% | 0 |
| SHAM.WOW 1.4 | 7.5 | 7.0% | 1 |
| stelo.UntouchableNano 1.3 | 9.5 | 6.0% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9.5 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 86.0 | 18 / 35 | 3915 |
| 2 | 1 | 65.2 | 84.1 | 18 / 35 | 3480 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jcs.Seth 1.8 | 16 | 38% |
| labg.Cataclysm 2.05 | 16 | 81% |
| oog.melee.Corsair 1.0 | 13 | 85% |
| erdnis.Rover 0.3 | 7 | 43% |
| SHAM.WOW 1.4 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 100% |
| stelo.UntouchableNano 1.3 | 1 | 100% |

Hadur died in 34 of 70 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jcs.Seth 1.8 | 11 | 32% | 20 |
| labg.Cataclysm 2.05 | 7 | 21% | 17 |
| oog.melee.Corsair 1.0 | 5 | 15% | 17 |
| erdnis.Rover 0.3 | 4 | 12% | 9 |
| SHAM.WOW 1.4 | 3 | 9% | 3 |
| adt.Ar2 1.0 | 2 | 6% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 6% | 2 |

Posture (Hadur's M records, 67 rounds): 43732 melee ticks, 18781 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (67 rounds): longest scan gap while four or more were alive 33 ticks (67 rounds over 8); rounds whose longest gap at any count was over 8: 67; robots dropped as dead without a death event: 0.

Targeting waves (67 rounds): 14291 sent, 12798 reached their opponent, 2233 virtual hits (17.4% of those reached).

## Melee bench: F21

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 13 over 2 battles (6.5 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 80.3 | 24 / 70 | 2.77 | 15.6% | 6851 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 15.6% | 24 |
| florent.XSeries.X2 0.12 | 2.5 | 14.2% | 15 |
| catcat20.Lambda 0.024 | 2.5 | 13.5% | 16 |
| tzu.TheArtOfWar 1.2 | 4.0 | 11.9% | 5 |
| shu.nitro.LENIN .T34 | 5.0 | 10.2% | 6 |
| sgp.JollyNinja 3.53 | 6.5 | 9.0% | 4 |
| nz.jdc.nano.GridFu 1.0 | 7.0 | 8.1% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 7.5 | 6.8% | 0 |
| dsw.StaticD 1.0 | 9.0 | 6.1% | 0 |
| bayen.nut.Squirrel 1.615 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 81.9 | 12 / 35 | 3377 |
| 2 | 1 | 63.3 | 78.7 | 12 / 35 | 3474 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Lambda 0.024 | 13 | 46% |
| tzu.TheArtOfWar 1.2 | 8 | 63% |
| florent.XSeries.X2 0.12 | 8 | 38% |
| shu.nitro.LENIN .T34 | 8 | 100% |
| sgp.JollyNinja 3.53 | 2 | 0% |
| bayen.nut.Squirrel 1.615 | 1 | 100% |
| nz.jdc.nano.GridFu 1.0 | 1 | 100% |

Hadur died in 46 of 70 rounds, at a mean tick of 789. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 16 | 35% | 19 |
| catcat20.Lambda 0.024 | 13 | 28% | 17 |
| tzu.TheArtOfWar 1.2 | 7 | 15% | 11 |
| sgp.JollyNinja 3.53 | 5 | 11% | 8 |
| shu.nitro.LENIN .T34 | 3 | 7% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 1 | 2% | 1 |
| dsw.StaticD 1.0 | 1 | 2% | 1 |
| bayen.nut.Squirrel 1.615 | 0 | 0% | 1 |
| nz.jdc.nano.GridFu 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 69 rounds): 47315 melee ticks, 12324 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (69 rounds): longest scan gap while four or more were alive 49 ticks (69 rounds over 8); rounds whose longest gap at any count was over 8: 69; robots dropped as dead without a death event: 1.

Targeting waves (69 rounds): 16143 sent, 14531 reached their opponent, 2523 virtual hits (17.4% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 63.6% ± 3.2 | 60.1% ± 3.7 | +3.5 ± 0.5 |
| Survival | 80.3% ± 20.2 | 72.7% ± 12.1 | +7.6 ± 8.1 |
| Rounds won | 34.3% ± 0.0 | 22.9% ± 36.3 | +11.4 ± 36.3 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| dsw.StaticD 1.0 | 71.9% ± 10.8 | 70.2% ± 11.2 | +1.7 ± 22.0 |
| tzu.TheArtOfWar 1.2 | 56.7% ± 3.9 | 55.1% ± 23.0 | +1.7 ± 19.1 |
| jwst.DAD.DarkAndDarker 1.1 | 69.8% ± 27.5 | 66.2% ± 29.8 | +3.6 ± 57.3 |
| sgp.JollyNinja 3.53 | 63.6% ± 4.4 | 56.1% ± 16.0 | +7.5 ± 11.6 |
| shu.nitro.LENIN .T34 | 60.5% ± 12.8 | 57.8% ± 8.8 | +2.7 ± 3.9 |
| bayen.nut.Squirrel 1.615 | 77.5% ± 13.2 | 73.9% ± 26.7 | +3.6 ± 39.9 |
| nz.jdc.nano.GridFu 1.0 | 65.9% ± 25.4 | 62.6% ± 16.2 | +3.3 ± 9.2 |
| catcat20.Lambda 0.024 | 53.7% ± 13.8 | 49.3% ± 10.2 | +4.4 ± 3.5 |
| florent.XSeries.X2 0.12 | 52.4% ± 5.3 | 49.5% ± 6.0 | +2.9 ± 11.3 |

## Melee bench: F21

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 12 over 2 battles (6.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 72.7 | 16 / 70 | 3.46 | 13.8% | 5794 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 1.5 | 14.1% | 18 |
| catcat20.Lambda 0.024 | 2.0 | 14.1% | 21 |
| hadur2.Hadur 3.13 | 2.5 | 13.8% | 16 |
| tzu.TheArtOfWar 1.2 | 4.0 | 11.2% | 5 |
| sgp.JollyNinja 3.53 | 5.0 | 10.8% | 4 |
| shu.nitro.LENIN .T34 | 6.0 | 10.0% | 3 |
| nz.jdc.nano.GridFu 1.0 | 7.0 | 8.2% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 8.0 | 7.1% | 1 |
| dsw.StaticD 1.0 | 9.0 | 5.8% | 0 |
| bayen.nut.Squirrel 1.615 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 73.7 | 9 / 35 | 2885 |
| 2 | 3 | 59.8 | 71.7 | 7 / 35 | 2909 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 8 | 25% |
| catcat20.Lambda 0.024 | 7 | 43% |
| tzu.TheArtOfWar 1.2 | 5 | 80% |
| jwst.DAD.DarkAndDarker 1.1 | 2 | 100% |
| sgp.JollyNinja 3.53 | 2 | 100% |
| shu.nitro.LENIN .T34 | 2 | 50% |
| nz.jdc.nano.GridFu 1.0 | 1 | 100% |
| bayen.nut.Squirrel 1.615 | 1 | 100% |

Hadur died in 54 of 70 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 19 | 35% | 20 |
| catcat20.Lambda 0.024 | 8 | 15% | 11 |
| tzu.TheArtOfWar 1.2 | 7 | 13% | 10 |
| shu.nitro.LENIN .T34 | 4 | 7% | 8 |
| sgp.JollyNinja 3.53 | 4 | 7% | 6 |
| nz.jdc.nano.GridFu 1.0 | 4 | 7% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 7% | 5 |
| bayen.nut.Squirrel 1.615 | 2 | 4% | 3 |
| dsw.StaticD 1.0 | 2 | 4% | 2 |

Posture (Hadur's M records, 70 rounds): 45512 melee ticks, 7682 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 17 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 17 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 15253 sent, 13713 reached their opponent, 2169 virtual hits (15.8% of those reached).

## Melee bench: F22

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 17 over 2 battles (8.5 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 93.7 | 40 / 70 | 1.57 | 19.6% | 10367 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 19.6% | 40 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.6% | 19 |
| shinh.Entangled 0.3 | 3.0 | 14.8% | 11 |
| myl.nano.Graviton 1.10 | 4.0 | 11.6% | 0 |
| nic.Nicator 2.4 | 5.0 | 8.6% | 0 |
| ntc.ControlledChaos 1.1.4 | 6.0 | 7.2% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.0 | 6.0% | 0 |
| matt.advanced.Katana 1.0 | 8.0 | 6.0% | 0 |
| DBall.Anarchy 0.1 | 8.0 | 6.2% | 0 |
| sample.Corners 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 93.0 | 18 / 35 | 5285 |
| 2 | 1 | 70.5 | 94.3 | 22 / 35 | 5082 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shinh.Entangled 0.3 | 29 | 76% |
| rsalesc.melee.Monk 0.3.6c | 24 | 29% |
| myl.nano.Graviton 1.10 | 6 | 100% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 30 of 70 rounds, at a mean tick of 1306. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 18 | 60% | 28 |
| shinh.Entangled 0.3 | 12 | 40% | 30 |
| myl.nano.Graviton 1.10 | 0 | 0% | 6 |
| divineomega.DivineBot 1.9.4.5 | 0 | 0% | 5 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 54057 melee ticks, 31855 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 26 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 17564 sent, 16016 reached their opponent, 3992 virtual hits (24.9% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 70.3% ± 1.5 | 70.4% ± 3.0 | -0.1 ± 1.5 |
| Survival | 93.7% ± 8.1 | 92.1% ± 12.1 | +1.6 ± 4.0 |
| Rounds won | 57.1% ± 72.6 | 60.0% ± 36.3 | -2.9 ± 108.9 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| ntc.ControlledChaos 1.1.4 | 73.1% ± 9.4 | 72.6% ± 7.5 | +0.5 ± 1.9 |
| nic.Nicator 2.4 | 69.6% ± 19.8 | 67.6% ± 21.7 | +2.1 ± 1.9 |
| myl.nano.Graviton 1.10 | 62.9% ± 1.1 | 63.9% ± 14.0 | -1.0 ± 12.9 |
| DBall.Anarchy 0.1 | 75.9% ± 9.0 | 77.8% ± 3.8 | -1.8 ± 5.2 |
| sample.Corners 1.0 | 88.9% ± 6.4 | 86.3% ± 21.5 | +2.7 ± 27.9 |
| rsalesc.melee.Monk 0.3.6c | 52.7% ± 20.7 | 53.2% ± 14.5 | -0.6 ± 6.2 |
| divineomega.DivineBot 1.9.4.5 | 76.6% ± 17.1 | 77.5% ± 0.5 | -0.8 ± 17.6 |
| shinh.Entangled 0.3 | 56.9% ± 3.3 | 56.9% ± 13.4 | +0.0 ± 10.1 |
| matt.advanced.Katana 1.0 | 76.4% ± 3.5 | 77.8% ± 8.9 | -1.4 ± 5.4 |

## Melee bench: F22

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 39 over 2 battles (19.5 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 92.1 | 42 / 70 | 1.71 | 19.7% | 10920 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.0 | 19.7% | 42 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.3% | 16 |
| shinh.Entangled 0.3 | 3.0 | 14.9% | 10 |
| myl.nano.Graviton 1.10 | 4.0 | 11.1% | 1 |
| nic.Nicator 2.4 | 5.0 | 9.5% | 0 |
| ntc.ControlledChaos 1.1.4 | 6.0 | 7.4% | 0 |
| divineomega.DivineBot 1.9.4.5 | 7.5 | 5.7% | 1 |
| matt.advanced.Katana 1.0 | 8.0 | 5.6% | 0 |
| DBall.Anarchy 0.1 | 8.5 | 5.6% | 0 |
| sample.Corners 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 91.1 | 22 / 35 | 5374 |
| 2 | 1 | 70.6 | 93.0 | 20 / 35 | 5546 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shinh.Entangled 0.3 | 26 | 73% |
| rsalesc.melee.Monk 0.3.6c | 18 | 39% |
| myl.nano.Graviton 1.10 | 12 | 92% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |
| nic.Nicator 2.4 | 2 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |

Hadur died in 28 of 70 rounds, at a mean tick of 1264. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shinh.Entangled 0.3 | 12 | 43% | 29 |
| rsalesc.melee.Monk 0.3.6c | 11 | 39% | 21 |
| myl.nano.Graviton 1.10 | 2 | 7% | 10 |
| nic.Nicator 2.4 | 1 | 4% | 5 |
| divineomega.DivineBot 1.9.4.5 | 1 | 4% | 3 |
| ntc.ControlledChaos 1.1.4 | 1 | 4% | 1 |
| DBall.Anarchy 0.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 55219 melee ticks, 32955 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 41 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 17929 sent, 16383 reached their opponent, 4107 virtual hits (25.1% of those reached).

## Melee bench: F23

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 31 over 2 battles (15.5 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 92.7 | 51 / 70 | 1.66 | 19.7% | 10307 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 19.7% | 51 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 15.1% | 3 |
| et.Predator 1.8 | 3.0 | 14.2% | 12 |
| gh.nano.Grofvuil 0.2 | 4.0 | 12.0% | 4 |
| apollokidd.ApolloKidd 0.9 | 5.5 | 9.4% | 0 |
| zyx.nano.Ant 1.1 | 5.5 | 9.9% | 1 |
| cw.megas.Blade 0.8 | 7.0 | 6.7% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 8.0 | 6.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.0 | 5.5% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 92.7 | 26 / 35 | 5222 |
| 2 | 1 | 70.3 | 92.7 | 25 / 35 | 5085 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 23 | 78% |
| voidious.micro.BlitzBat 1.05 | 18 | 89% |
| gh.nano.Grofvuil 0.2 | 12 | 83% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 19 of 70 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 6 | 32% | 20 |
| voidious.micro.BlitzBat 1.05 | 4 | 21% | 19 |
| gh.nano.Grofvuil 0.2 | 4 | 21% | 16 |
| apollokidd.ApolloKidd 0.9 | 3 | 16% | 6 |
| zyx.nano.Ant 1.1 | 2 | 11% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 0 | 0% | 1 |
| cw.megas.Blade 0.8 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 52215 melee ticks, 17724 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 40 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 16590 sent, 15118 reached their opponent, 3725 virtual hits (24.6% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 70.5% ± 2.3 | 70.4% ± 2.8 | +0.1 ± 0.5 |
| Survival | 92.7% ± 0.0 | 92.2% ± 10.1 | +0.5 ± 10.1 |
| Rounds won | 72.9% ± 18.2 | 72.9% ± 18.2 | +0.0 ± 0.0 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| apollokidd.ApolloKidd 0.9 | 67.6% ± 7.7 | 67.8% ± 19.2 | -0.1 ± 26.9 |
| gh.nano.Grofvuil 0.2 | 62.2% ± 5.0 | 60.4% ± 1.0 | +1.8 ± 4.0 |
| zyx.nano.Ant 1.1 | 66.5% ± 8.4 | 67.2% ± 23.7 | -0.7 ± 32.1 |
| cli.WasteOfAmmo 1.0 | 95.3% ± 10.4 | 95.0% ± 15.0 | +0.4 ± 25.4 |
| voidious.micro.BlitzBat 1.05 | 56.6% ± 2.4 | 57.3% ± 15.0 | -0.7 ± 17.4 |
| sample.MyFirstJuniorRobot 1.0 | 78.2% ± 4.7 | 78.0% ± 12.4 | +0.2 ± 17.0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 75.4% ± 9.4 | 75.2% ± 3.7 | +0.2 ± 5.7 |
| cw.megas.Blade 0.8 | 74.5% ± 10.0 | 74.6% ± 1.3 | -0.1 ± 8.7 |
| et.Predator 1.8 | 58.2% ± 7.8 | 58.5% ± 11.0 | -0.3 ± 18.8 |

## Melee bench: F23

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 15 over 2 battles (7.5 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 92.2 | 51 / 70 | 1.70 | 19.7% | 10460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.0 | 19.7% | 51 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 14.7% | 4 |
| et.Predator 1.8 | 3.0 | 14.0% | 13 |
| gh.nano.Grofvuil 0.2 | 4.0 | 12.9% | 3 |
| zyx.nano.Ant 1.1 | 5.5 | 9.6% | 0 |
| apollokidd.ApolloKidd 0.9 | 5.5 | 9.4% | 0 |
| cw.megas.Blade 0.8 | 7.0 | 6.7% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 8.0 | 6.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.0 | 5.5% | 1 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 93.0 | 26 / 35 | 5187 |
| 2 | 1 | 70.2 | 91.4 | 25 / 35 | 5273 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 26 | 77% |
| voidious.micro.BlitzBat 1.05 | 18 | 94% |
| gh.nano.Grofvuil 0.2 | 10 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 20 of 70 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 10 | 50% | 23 |
| voidious.micro.BlitzBat 1.05 | 4 | 20% | 20 |
| gh.nano.Grofvuil 0.2 | 2 | 10% | 12 |
| apollokidd.ApolloKidd 0.9 | 1 | 5% | 6 |
| zyx.nano.Ant 1.1 | 1 | 5% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 5% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 70 rounds): 50346 melee ticks, 17639 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 29 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 29 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 15924 sent, 14465 reached their opponent, 3303 virtual hits (22.8% of those reached).

## Melee bench: F24

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 14 over 2 battles (7.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 81.6 | 34 / 70 | 2.66 | 17.1% | 9058 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 17.1% | 34 |
| jje.BagPuss 1.2 | 2.5 | 12.9% | 6 |
| jrm.Test0 1.0 | 3.5 | 11.8% | 4 |
| catcat20.shape.Theta 0.018 | 4.0 | 13.0% | 10 |
| TNT.TNT 0.99.1 | 5.0 | 11.0% | 8 |
| djc.DynaBot 0.1.1 | 5.0 | 11.4% | 7 |
| apc.Colossus2 0.17 | 7.0 | 8.2% | 1 |
| lmk.ACPFinal 0.1 | 8.0 | 5.1% | 0 |
| ayk.WallHugger 1.0 | 9.0 | 4.9% | 0 |
| sample.Walls 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 85.7 | 20 / 35 | 4675 |
| 2 | 1 | 64.6 | 77.5 | 14 / 35 | 4383 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jje.BagPuss 1.2 | 12 | 75% |
| catcat20.shape.Theta 0.018 | 10 | 80% |
| TNT.TNT 0.99.1 | 10 | 90% |
| djc.DynaBot 0.1.1 | 10 | 80% |

Hadur died in 36 of 70 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jrm.Test0 1.0 | 8 | 22% | 8 |
| catcat20.shape.Theta 0.018 | 7 | 19% | 15 |
| jje.BagPuss 1.2 | 6 | 17% | 17 |
| djc.DynaBot 0.1.1 | 4 | 11% | 11 |
| TNT.TNT 0.99.1 | 4 | 11% | 11 |
| apc.Colossus2 0.17 | 3 | 8% | 4 |
| lmk.ACPFinal 0.1 | 3 | 8% | 3 |
| ayk.WallHugger 1.0 | 1 | 3% | 1 |

Posture (Hadur's M records, 70 rounds): 54183 melee ticks, 13913 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 64 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 17716 sent, 16226 reached their opponent, 3271 virtual hits (20.2% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 66.2% ± 20.3 | 67.3% ± 14.2 | -1.2 ± 6.1 |
| Survival | 81.6% ± 52.4 | 84.6% ± 38.3 | -3.0 ± 14.1 |
| Rounds won | 48.6% ± 108.9 | 45.7% ± 36.3 | +2.9 ± 72.6 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 57.0% ± 42.9 | 54.6% ± 4.8 | +2.3 ± 38.2 |
| ayk.WallHugger 1.0 | 77.7% ± 36.7 | 79.2% ± 10.7 | -1.5 ± 26.0 |
| djc.DynaBot 0.1.1 | 60.0% ± 2.4 | 59.6% ± 32.5 | +0.3 ± 30.1 |
| apc.Colossus2 0.17 | 67.5% ± 22.7 | 70.6% ± 28.1 | -3.2 ± 5.3 |
| jje.BagPuss 1.2 | 57.0% ± 34.6 | 59.6% ± 12.3 | -2.5 ± 46.9 |
| sample.Walls 1.0 | 79.0% ± 19.6 | 78.4% ± 12.0 | +0.7 ± 7.7 |
| jrm.Test0 1.0 | 59.3% ± 6.2 | 65.6% ± 3.3 | -6.3 ± 9.4 |
| lmk.ACPFinal 0.1 | 76.9% ± 29.2 | 77.4% ± 36.4 | -0.6 ± 7.2 |
| TNT.TNT 0.99.1 | 61.1% ± 12.0 | 60.9% ± 19.0 | +0.2 ± 31.0 |

## Melee bench: F24

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 23 over 2 battles (11.5 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.6 | 32 / 70 | 2.39 | 17.9% | 9419 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.0 | 17.9% | 32 |
| catcat20.shape.Theta 0.018 | 2.0 | 14.8% | 11 |
| djc.DynaBot 0.1.1 | 3.5 | 12.1% | 8 |
| jje.BagPuss 1.2 | 4.0 | 12.2% | 5 |
| TNT.TNT 0.99.1 | 4.5 | 11.4% | 14 |
| jrm.Test0 1.0 | 6.0 | 9.4% | 0 |
| apc.Colossus2 0.17 | 7.0 | 7.4% | 0 |
| sample.Walls 1.0 | 8.5 | 4.9% | 0 |
| lmk.ACPFinal 0.1 | 9.0 | 5.2% | 0 |
| ayk.WallHugger 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.6 | 17 / 35 | 4818 |
| 2 | 1 | 66.2 | 81.6 | 15 / 35 | 4601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.shape.Theta 0.018 | 14 | 71% |
| TNT.TNT 0.99.1 | 13 | 54% |
| djc.DynaBot 0.1.1 | 10 | 60% |
| jje.BagPuss 1.2 | 8 | 88% |
| jrm.Test0 1.0 | 1 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 38 of 70 rounds, at a mean tick of 1072. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 14 | 37% | 23 |
| TNT.TNT 0.99.1 | 7 | 18% | 15 |
| djc.DynaBot 0.1.1 | 5 | 13% | 12 |
| jje.BagPuss 1.2 | 5 | 13% | 12 |
| jrm.Test0 1.0 | 4 | 11% | 5 |
| lmk.ACPFinal 0.1 | 2 | 5% | 2 |
| ayk.WallHugger 1.0 | 1 | 3% | 1 |

Posture (Hadur's M records, 70 rounds): 63539 melee ticks, 17064 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 71 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 19298 sent, 17822 reached their opponent, 3085 virtual hits (17.3% of those reached).

## Melee bench: F25

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 25 over 2 battles (12.5 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 91.0 | 50 / 70 | 1.81 | 19.8% | 10256 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 19.8% | 50 |
| ary.Swarm 1.1 | 2.0 | 14.8% | 3 |
| kawigi.robot.Girl 1.2 | 3.0 | 10.9% | 6 |
| sch.Simone 0.3d | 5.0 | 9.7% | 3 |
| jwirde.Gort 2.0 | 5.0 | 9.2% | 2 |
| lunchie.Lunchbox 0.93 | 5.0 | 9.3% | 2 |
| as.FrankTheTank 1.3 | 7.5 | 7.0% | 0 |
| stelo.MirrorNano 1.3 | 7.5 | 7.2% | 1 |
| caimano.Furia_Ceca 0.22 | 9.0 | 6.7% | 1 |
| donjezza.Muncho 1.0 | 10.0 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 89.8 | 24 / 35 | 5180 |
| 2 | 1 | 70.0 | 92.1 | 26 / 35 | 5076 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ary.Swarm 1.1 | 19 | 100% |
| kawigi.robot.Girl 1.2 | 19 | 84% |
| sch.Simone 0.3d | 8 | 100% |
| donjezza.Muncho 1.0 | 2 | 50% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |
| as.FrankTheTank 1.3 | 2 | 100% |
| jwirde.Gort 2.0 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 20 of 70 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ary.Swarm 1.1 | 5 | 25% | 24 |
| kawigi.robot.Girl 1.2 | 5 | 25% | 11 |
| sch.Simone 0.3d | 2 | 10% | 11 |
| donjezza.Muncho 1.0 | 2 | 10% | 6 |
| caimano.Furia_Ceca 0.22 | 2 | 10% | 4 |
| stelo.MirrorNano 1.3 | 2 | 10% | 3 |
| lunchie.Lunchbox 0.93 | 1 | 5% | 4 |
| as.FrankTheTank 1.3 | 1 | 5% | 3 |
| jwirde.Gort 2.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 70 rounds): 57526 melee ticks, 16133 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 39 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 20003 sent, 18460 reached their opponent, 3856 virtual hits (20.9% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 69.6% ± 4.6 | 68.9% ± 0.3 | +0.7 ± 4.3 |
| Survival | 91.0% ± 14.1 | 89.5% ± 0.0 | +1.4 ± 14.1 |
| Rounds won | 71.4% ± 36.3 | 62.9% ± 36.3 | +8.6 ± 0.0 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| lunchie.Lunchbox 0.93 | 68.1% ± 19.4 | 68.5% ± 25.4 | -0.5 ± 6.0 |
| stelo.MirrorNano 1.3 | 73.3% ± 10.8 | 71.6% ± 8.0 | +1.7 ± 2.8 |
| kawigi.robot.Girl 1.2 | 64.6% ± 6.8 | 60.1% ± 18.8 | +4.6 ± 12.0 |
| sch.Simone 0.3d | 67.1% ± 16.2 | 65.9% ± 46.7 | +1.1 ± 63.0 |
| jwirde.Gort 2.0 | 68.3% ± 13.8 | 66.3% ± 7.8 | +2.0 ± 21.7 |
| caimano.Furia_Ceca 0.22 | 74.9% ± 8.2 | 75.5% ± 0.6 | -0.7 ± 8.8 |
| donjezza.Muncho 1.0 | 79.1% ± 52.6 | 82.8% ± 7.8 | -3.7 ± 44.8 |
| as.FrankTheTank 1.3 | 73.8% ± 13.8 | 73.9% ± 28.9 | -0.0 ± 15.0 |
| ary.Swarm 1.1 | 57.4% ± 12.3 | 55.2% ± 20.3 | +2.2 ± 32.6 |

## Melee bench: F25

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 40 over 2 battles (20.0 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 89.5 | 44 / 70 | 1.94 | 19.0% | 9424 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.0 | 19.0% | 44 |
| ary.Swarm 1.1 | 2.0 | 15.5% | 4 |
| kawigi.robot.Girl 1.2 | 3.0 | 12.7% | 13 |
| sch.Simone 0.3d | 4.5 | 9.9% | 5 |
| jwirde.Gort 2.0 | 5.0 | 9.7% | 2 |
| lunchie.Lunchbox 0.93 | 5.5 | 8.8% | 2 |
| stelo.MirrorNano 1.3 | 7.5 | 7.5% | 0 |
| as.FrankTheTank 1.3 | 8.0 | 6.8% | 0 |
| caimano.Furia_Ceca 0.22 | 8.5 | 6.2% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 89.5 | 21 / 35 | 4638 |
| 2 | 1 | 68.9 | 89.5 | 23 / 35 | 4786 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ary.Swarm 1.1 | 19 | 100% |
| kawigi.robot.Girl 1.2 | 14 | 71% |
| sch.Simone 0.3d | 8 | 88% |
| lunchie.Lunchbox 0.93 | 4 | 75% |
| jwirde.Gort 2.0 | 3 | 67% |
| as.FrankTheTank 1.3 | 2 | 100% |
| donjezza.Muncho 1.0 | 1 | 100% |

Hadur died in 27 of 70 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ary.Swarm 1.1 | 9 | 33% | 26 |
| sch.Simone 0.3d | 4 | 15% | 13 |
| jwirde.Gort 2.0 | 4 | 15% | 9 |
| kawigi.robot.Girl 1.2 | 4 | 15% | 9 |
| as.FrankTheTank 1.3 | 3 | 11% | 4 |
| lunchie.Lunchbox 0.93 | 2 | 7% | 6 |
| donjezza.Muncho 1.0 | 1 | 4% | 3 |

Posture (Hadur's M records, 70 rounds): 59098 melee ticks, 13161 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 55 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 19729 sent, 18263 reached their opponent, 3194 virtual hits (17.5% of those reached).

## Melee bench: F26

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 19 over 2 battles (9.5 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 74.4 | 20 / 70 | 3.30 | 14.7% | 6703 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 14.7% | 20 |
| nat.PallasHawk 1.0 | 2.5 | 13.7% | 13 |
| simonton.micro.Sprout 1.1.3 | 3.5 | 12.8% | 9 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.7% | 12 |
| bvh.mini.Freya 0.55 | 4.5 | 12.6% | 6 |
| spinnercat.micro.Tyger 0.1 | 6.0 | 11.1% | 6 |
| vStar.RAFzilla 2.15 | 7.0 | 10.4% | 4 |
| gg.Squaraus 0.6 | 8.0 | 4.8% | 0 |
| repositorio.NanoStep 1.0 | 9.0 | 3.8% | 0 |
| stelo.PianistNano 1.2 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 74.3 | 11 / 35 | 3349 |
| 2 | 1 | 62.3 | 74.6 | 9 / 35 | 3354 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 10 | 30% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 7 | 57% |
| bvh.mini.Freya 0.55 | 5 | 100% |
| simonton.micro.Sprout 1.1.3 | 5 | 80% |
| spinnercat.micro.Tyger 0.1 | 4 | 75% |
| vStar.RAFzilla 2.15 | 2 | 50% |

Hadur died in 50 of 70 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 14 | 28% | 17 |
| simonton.micro.Sprout 1.1.3 | 11 | 22% | 16 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 18% | 12 |
| bvh.mini.Freya 0.55 | 8 | 16% | 12 |
| spinnercat.micro.Tyger 0.1 | 5 | 10% | 7 |
| vStar.RAFzilla 2.15 | 3 | 6% | 5 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 44975 melee ticks, 12325 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 41 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 15499 sent, 13934 reached their opponent, 2434 virtual hits (17.5% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 62.7% ± 5.4 | 64.6% ± 14.1 | -1.9 ± 8.8 |
| Survival | 74.4% ± 2.0 | 80.3% ± 48.4 | -5.9 ± 50.4 |
| Rounds won | 28.6% ± 36.3 | 47.1% ± 54.5 | -18.6 ± 18.2 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| stelo.PianistNano 1.2 | 81.2% ± 16.4 | 77.3% ± 33.8 | +3.8 ± 17.4 |
| spinnercat.micro.Tyger 0.1 | 57.1% ± 9.0 | 58.4% ± 1.4 | -1.3 ± 10.4 |
| bvh.mini.Freya 0.55 | 54.0% ± 12.4 | 58.5% ± 9.3 | -4.5 ± 3.1 |
| repositorio.NanoStep 1.0 | 79.4% ± 29.6 | 80.5% ± 13.2 | -1.1 ± 16.4 |
| gg.Squaraus 0.6 | 75.3% ± 9.9 | 78.3% ± 10.4 | -3.0 ± 20.3 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 53.7% ± 9.6 | 58.7% ± 0.3 | -5.0 ± 9.8 |
| vStar.RAFzilla 2.15 | 58.7% ± 4.2 | 60.2% ± 29.7 | -1.5 ± 25.5 |
| simonton.micro.Sprout 1.1.3 | 53.5% ± 31.0 | 54.2% ± 23.0 | -0.7 ± 54.0 |
| nat.PallasHawk 1.0 | 51.7% ± 6.4 | 55.2% ± 27.5 | -3.5 ± 21.1 |

## Melee bench: F26

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 22 over 2 battles (11.0 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 80.3 | 33 / 70 | 2.77 | 16.0% | 6402 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.0 | 16.0% | 33 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 13.5% | 11 |
| nat.PallasHawk 1.0 | 3.0 | 13.0% | 10 |
| spinnercat.micro.Tyger 0.1 | 5.0 | 11.4% | 4 |
| bvh.mini.Freya 0.55 | 5.0 | 11.4% | 1 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 6.0 | 11.2% | 4 |
| vStar.RAFzilla 2.15 | 6.0 | 10.6% | 7 |
| gg.Squaraus 0.6 | 8.5 | 4.4% | 0 |
| stelo.PianistNano 1.2 | 8.5 | 4.7% | 0 |
| repositorio.NanoStep 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 84.1 | 18 / 35 | 3266 |
| 2 | 1 | 63.5 | 76.5 | 15 / 35 | 3136 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 100% |
| simonton.micro.Sprout 1.1.3 | 8 | 75% |
| spinnercat.micro.Tyger 0.1 | 7 | 86% |
| bvh.mini.Freya 0.55 | 7 | 86% |
| nat.PallasHawk 1.0 | 7 | 43% |
| vStar.RAFzilla 2.15 | 4 | 75% |

Hadur died in 37 of 70 rounds, at a mean tick of 676. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 10 | 27% | 17 |
| nat.PallasHawk 1.0 | 9 | 24% | 13 |
| spinnercat.micro.Tyger 0.1 | 6 | 16% | 13 |
| bvh.mini.Freya 0.55 | 6 | 16% | 10 |
| vStar.RAFzilla 2.15 | 3 | 8% | 5 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2 | 5% | 11 |
| stelo.PianistNano 1.2 | 1 | 3% | 1 |

Posture (Hadur's M records, 70 rounds): 45038 melee ticks, 12172 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 24 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 1.

Targeting waves (70 rounds): 15238 sent, 13699 reached their opponent, 2183 virtual hits (15.9% of those reached).

## Melee bench: F27

hadur2.Hadur 3.13gk against 8 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 10 over 2 battles (5.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 80.7 | 22 / 70 | 2.54 | 18.8% | 9279 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 18.8% | 22 |
| Krabb.sliNk.Garm 0.9u | 2.5 | 14.3% | 5 |
| oog.melee.Mercutio 1.0 | 3.0 | 13.2% | 6 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 12.9% | 3 |
| eem.IWillFireNoBullet v2.8 | 4.5 | 12.1% | 29 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6.0 | 11.0% | 1 |
| franzor.Lizt 1.3.1 | 7.5 | 8.8% | 4 |
| bvh.micro.Freya 0.3 | 7.5 | 8.8% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 0.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 81.8 | 12 / 35 | 4799 |
| 2 | 1 | 66.3 | 79.6 | 10 / 35 | 4480 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 17 | 24% |
| Krabb.sliNk.Garm 0.9u | 9 | 78% |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 71% |
| franzor.Lizt 1.3.1 | 4 | 25% |
| oog.melee.Mercutio 1.0 | 4 | 75% |
| bvh.micro.Freya 0.3 | 2 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 1 | 0% |

Hadur died in 48 of 70 rounds, at a mean tick of 1510. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 13 | 27% | 0 |
| Krabb.sliNk.Garm 0.9u | 9 | 19% | 17 |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 15% | 13 |
| franzor.Lizt 1.3.1 | 6 | 13% | 2 |
| oog.melee.Mercutio 1.0 | 5 | 10% | 21 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 10% | 8 |
| bvh.micro.Freya 0.3 | 3 | 6% | 9 |

Posture (Hadur's M records, 70 rounds): 77002 melee ticks, 25305 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 25 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 22718 sent, 21329 reached their opponent, 3045 virtual hits (14.3% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 66.9% ± 7.3 | 65.1% ± 14.9 | +1.8 ± 22.2 |
| Survival | 80.7% ± 13.6 | 77.7% ± 43.1 | +3.0 ± 56.7 |
| Rounds won | 31.4% ± 36.3 | 20.0% ± 36.3 | +11.4 ± 72.6 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| simonton.nano.WeekendObsession_Melee 1.0 | 63.2% ± 7.8 | 64.6% ± 0.2 | -1.4 ± 7.6 |
| bvh.micro.Freya 0.3 | 68.1% ± 27.8 | 67.5% ± 6.2 | +0.6 ± 21.6 |
| eem.IWillFireNoBullet v2.8 | 60.9% ± 1.8 | 59.7% ± 39.1 | +1.2 ± 40.9 |
| Krabb.sliNk.Garm 0.9u | 57.0% ± 47.5 | 52.2% ± 43.7 | +4.8 ± 91.2 |
| sample.SittingDuck 1.0 | 99.4% ± 3.4 | 98.3% ± 6.8 | +1.1 ± 3.4 |
| oog.melee.Mercutio 1.0 | 58.8% ± 6.8 | 56.1% ± 8.0 | +2.6 ± 14.7 |
| dmh.robocode.robot.BlackDeath 9.2 | 59.4% ± 26.8 | 55.7% ± 6.8 | +3.6 ± 33.6 |
| franzor.Lizt 1.3.1 | 68.4% ± 40.7 | 66.5% ± 21.0 | +1.9 ± 19.8 |

## Melee bench: F27

hadur2.Hadur 3.13 against 8 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 21 over 2 battles (10.5 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 77.7 | 14 / 70 | 2.79 | 17.5% | 8446 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| Krabb.sliNk.Garm 0.9u | 1.5 | 16.1% | 9 |
| hadur2.Hadur 3.13 | 1.5 | 17.5% | 14 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.0 | 13.9% | 7 |
| oog.melee.Mercutio 1.0 | 4.0 | 13.6% | 12 |
| eem.IWillFireNoBullet v2.8 | 5.0 | 11.8% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6.0 | 9.6% | 0 |
| franzor.Lizt 1.3.1 | 7.5 | 8.8% | 3 |
| bvh.micro.Freya 0.3 | 7.5 | 8.4% | 2 |
| sample.SittingDuck 1.0 | 9.0 | 0.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 74.3 | 6 / 35 | 4027 |
| 2 | 1 | 66.3 | 81.1 | 8 / 35 | 4419 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 11 | 27% |
| oog.melee.Mercutio 1.0 | 9 | 22% |
| Krabb.sliNk.Garm 0.9u | 8 | 38% |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 57% |
| franzor.Lizt 1.3.1 | 3 | 67% |
| bvh.micro.Freya 0.3 | 1 | 0% |

Hadur died in 56 of 70 rounds, at a mean tick of 1346. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 14 | 25% | 22 |
| Krabb.sliNk.Garm 0.9u | 12 | 21% | 21 |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 20% | 17 |
| eem.IWillFireNoBullet v2.8 | 8 | 14% | 0 |
| bvh.micro.Freya 0.3 | 4 | 7% | 5 |
| franzor.Lizt 1.3.1 | 4 | 7% | 0 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 5% | 5 |

Posture (Hadur's M records, 70 rounds): 77280 melee ticks, 18194 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 33 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 22201 sent, 20851 reached their opponent, 2755 virtual hits (13.2% of those reached).

## Melee bench: F28

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 21 over 2 battles (10.5 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 90.5 | 49 / 70 | 1.86 | 19.0% | 9525 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 19.0% | 49 |
| kdf.KoulDestroyer 1.0 | 2.5 | 13.5% | 3 |
| origin.SleepSiphon 1.7b | 2.5 | 14.8% | 13 |
| jab.DiamondStealer 5 | 4.0 | 11.8% | 1 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.0 | 10.8% | 3 |
| gre.svman4.Morfeas 1.4.1 | 6.0 | 8.6% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 7.0 | 7.7% | 0 |
| spin.Bugstard 0.012b | 8.5 | 4.9% | 1 |
| maribo.FollowFire 1 | 8.5 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 91.1 | 26 / 35 | 4801 |
| 2 | 1 | 68.7 | 89.8 | 23 / 35 | 4724 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 29 | 79% |
| kdf.KoulDestroyer 1.0 | 17 | 82% |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 100% |
| spin.Bugstard 0.012b | 2 | 50% |
| jab.DiamondStealer 5 | 2 | 100% |
| gre.svman4.Morfeas 1.4.1 | 1 | 100% |

Hadur died in 22 of 70 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 10 | 45% | 33 |
| kdf.KoulDestroyer 1.0 | 5 | 23% | 16 |
| jab.DiamondStealer 5 | 2 | 9% | 4 |
| maribo.FollowFire 1 | 2 | 9% | 2 |
| gre.svman4.Morfeas 1.4.1 | 1 | 5% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 5% | 3 |
| davidalves.net.DuelistNanoMelee 1.01 | 0 | 0% | 8 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 70 rounds): 47075 melee ticks, 17535 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 27 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 27 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 15045 sent, 13540 reached their opponent, 3483 virtual hits (25.7% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 69.1% ± 5.7 | 67.0% ± 17.4 | +2.1 ± 23.0 |
| Survival | 90.5% ± 8.1 | 86.3% ± 84.7 | +4.1 ± 92.8 |
| Rounds won | 70.0% ± 54.5 | 58.6% ± 54.5 | +11.4 ± 108.9 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| maribo.FollowFire 1 | 79.6% ± 32.6 | 75.9% ± 17.6 | +3.6 ± 50.3 |
| spin.Bugstard 0.012b | 79.5% ± 2.3 | 79.6% ± 9.8 | -0.1 ± 7.4 |
| origin.SleepSiphon 1.7b | 56.3% ± 31.5 | 53.6% ± 23.6 | +2.6 ± 55.1 |
| mbro.Detektor3 0.1.1 | 83.0% ± 0.7 | 81.9% ± 27.4 | +1.1 ± 26.7 |
| kdf.KoulDestroyer 1.0 | 58.5% ± 1.5 | 56.7% ± 20.3 | +1.8 ± 21.8 |
| co.edu.usb.rc.LidisTron 1.0 | 71.2% ± 0.1 | 69.0% ± 5.7 | +2.2 ± 5.8 |
| davidalves.net.DuelistNanoMelee 1.01 | 63.9% ± 11.7 | 62.0% ± 44.0 | +1.8 ± 32.2 |
| gre.svman4.Morfeas 1.4.1 | 68.8% ± 0.3 | 64.6% ± 17.2 | +4.2 ± 16.9 |
| jab.DiamondStealer 5 | 61.6% ± 0.5 | 59.7% ± 2.2 | +2.0 ± 2.7 |

## Melee bench: F28

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 23 over 2 battles (11.5 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 86.3 | 41 / 70 | 2.23 | 17.5% | 8252 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.0 | 17.5% | 41 |
| origin.SleepSiphon 1.7b | 2.0 | 15.1% | 17 |
| kdf.KoulDestroyer 1.0 | 3.0 | 13.4% | 4 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.5 | 10.7% | 5 |
| jab.DiamondStealer 5 | 4.5 | 11.8% | 0 |
| gre.svman4.Morfeas 1.4.1 | 6.0 | 9.6% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 7.0 | 7.9% | 0 |
| maribo.FollowFire 1 | 8.0 | 5.5% | 0 |
| spin.Bugstard 0.012b | 9.0 | 4.5% | 1 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 79.7 | 19 / 35 | 4196 |
| 2 | 1 | 68.4 | 93.0 | 22 / 35 | 4056 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 26 | 69% |
| kdf.KoulDestroyer 1.0 | 15 | 80% |
| davidalves.net.DuelistNanoMelee 1.01 | 7 | 57% |
| gre.svman4.Morfeas 1.4.1 | 5 | 80% |
| jab.DiamondStealer 5 | 3 | 100% |

Hadur died in 30 of 70 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 14 | 47% | 34 |
| kdf.KoulDestroyer 1.0 | 5 | 17% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 13% | 10 |
| maribo.FollowFire 1 | 3 | 10% | 3 |
| gre.svman4.Morfeas 1.4.1 | 2 | 7% | 7 |
| jab.DiamondStealer 5 | 2 | 7% | 7 |

Posture (Hadur's M records, 70 rounds): 44919 melee ticks, 16767 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 24 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 14026 sent, 12515 reached their opponent, 2895 virtual hits (23.1% of those reached).

## Melee bench: F29

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 22 over 2 battles (11.0 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 85.7 | 32 / 70 | 2.29 | 16.7% | 7352 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 16.7% | 32 |
| eem.EvBot v4.6.16 | 2.0 | 14.9% | 24 |
| jekl.StoneGhost 0.7 | 3.0 | 14.1% | 3 |
| cx.Princess 1.0 | 4.5 | 12.4% | 8 |
| m3thos.Eva02 0.7.1 | 4.5 | 11.1% | 2 |
| css.Delitioner 0.11 | 6.5 | 7.8% | 1 |
| amz.NanoClone 1.41 | 6.5 | 8.7% | 0 |
| fnc.bandit.Bandit 5.2.0 | 8.0 | 6.9% | 0 |
| com.syncleus.robocode.Dreadnaught 0.1 | 9.0 | 4.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 83.5 | 15 / 35 | 3440 |
| 2 | 1 | 66.9 | 87.9 | 17 / 35 | 3912 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 18 | 61% |
| cx.Princess 1.0 | 12 | 50% |
| jekl.StoneGhost 0.7 | 8 | 100% |
| m3thos.Eva02 0.7.1 | 4 | 75% |
| css.Delitioner 0.11 | 2 | 100% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 38 of 70 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 13 | 34% | 24 |
| cx.Princess 1.0 | 11 | 29% | 15 |
| jekl.StoneGhost 0.7 | 9 | 24% | 16 |
| m3thos.Eva02 0.7.1 | 3 | 8% | 8 |
| amz.NanoClone 1.41 | 1 | 3% | 2 |
| com.syncleus.robocode.Dreadnaught 0.1 | 1 | 3% | 1 |
| css.Delitioner 0.11 | 0 | 0% | 2 |
| fnc.bandit.Bandit 5.2.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 70 rounds): 51297 melee ticks, 16396 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 33 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 1.

Targeting waves (70 rounds): 16554 sent, 15055 reached their opponent, 2277 virtual hits (15.1% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 66.0% ± 11.8 | 64.8% ± 17.7 | +1.1 ± 29.5 |
| Survival | 85.7% ± 28.2 | 83.5% ± 32.3 | +2.2 ± 60.5 |
| Rounds won | 45.7% ± 36.3 | 38.6% ± 90.8 | +7.1 ± 127.1 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| fnc.bandit.Bandit 5.2.0 | 70.7% ± 19.9 | 69.0% ± 14.1 | +1.8 ± 5.8 |
| m3thos.Eva02 0.7.1 | 60.2% ± 11.1 | 60.0% ± 17.4 | +0.1 ± 6.4 |
| css.Delitioner 0.11 | 68.3% ± 36.8 | 63.8% ± 25.3 | +4.5 ± 62.0 |
| com.syncleus.robocode.Dreadnaught 0.1 | 78.1% ± 5.2 | 75.3% ± 40.1 | +2.8 ± 45.3 |
| jekl.StoneGhost 0.7 | 54.2% ± 8.2 | 52.6% ± 35.9 | +1.6 ± 44.2 |
| eem.EvBot v4.6.16 | 52.8% ± 12.2 | 50.5% ± 11.8 | +2.4 ± 24.1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 86.0% ± 0.4 | 83.8% ± 18.9 | +2.2 ± 18.5 |
| cx.Princess 1.0 | 57.5% ± 32.8 | 60.0% ± 4.4 | -2.4 ± 37.2 |
| amz.NanoClone 1.41 | 65.9% ± 2.6 | 68.4% ± 19.8 | -2.6 ± 22.4 |

## Melee bench: F29

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 10 over 2 battles (5.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 83.5 | 27 / 70 | 2.49 | 16.1% | 6921 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.5 | 15.8% | 28 |
| hadur2.Hadur 3.13 | 2.0 | 16.1% | 27 |
| jekl.StoneGhost 0.7 | 2.5 | 14.5% | 6 |
| cx.Princess 1.0 | 4.5 | 10.7% | 6 |
| m3thos.Eva02 0.7.1 | 4.5 | 10.7% | 0 |
| css.Delitioner 0.11 | 6.0 | 9.1% | 3 |
| fnc.bandit.Bandit 5.2.0 | 7.5 | 7.3% | 0 |
| amz.NanoClone 1.41 | 7.5 | 7.4% | 0 |
| com.syncleus.robocode.Dreadnaught 0.1 | 9.0 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 86.0 | 16 / 35 | 3736 |
| 2 | 3 | 63.4 | 81.0 | 11 / 35 | 3185 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 25 | 44% |
| jekl.StoneGhost 0.7 | 12 | 75% |
| cx.Princess 1.0 | 8 | 50% |
| m3thos.Eva02 0.7.1 | 2 | 100% |
| css.Delitioner 0.11 | 2 | 50% |

Hadur died in 43 of 70 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 21 | 49% | 30 |
| jekl.StoneGhost 0.7 | 7 | 16% | 16 |
| cx.Princess 1.0 | 6 | 14% | 9 |
| css.Delitioner 0.11 | 3 | 7% | 4 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3 | 7% | 3 |
| m3thos.Eva02 0.7.1 | 1 | 2% | 5 |
| fnc.bandit.Bandit 5.2.0 | 1 | 2% | 2 |
| amz.NanoClone 1.41 | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 51132 melee ticks, 19246 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 39 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 16519 sent, 15030 reached their opponent, 2037 virtual hits (13.6% of those reached).

## Melee bench: F30

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 20 over 2 battles (10.0 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 81.9 | 27 / 70 | 2.63 | 17.3% | 9192 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Numbat 2.1 | 1.5 | 15.8% | 21 |
| hadur2.Hadur 3.13gk | 1.5 | 17.3% | 27 |
| brainfade.melee.Dusk 0.44 | 3.5 | 12.7% | 9 |
| maribo.Quester 0.3 | 3.5 | 12.3% | 7 |
| axeBots.HataMoto 3.09 | 5.0 | 8.8% | 3 |
| stelo.SoJNanoMelee 1.1 | 6.5 | 8.1% | 0 |
| ntc.Opposite 1.5 | 7.0 | 7.9% | 1 |
| cf.RiO.RiOx 4.2.1 | 7.5 | 7.6% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 9.0 | 5.4% | 0 |
| maribo.IotaCT 1.1 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 78.1 | 10 / 35 | 4528 |
| 2 | 1 | 67.6 | 85.7 | 17 / 35 | 4664 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Numbat 2.1 | 12 | 75% |
| brainfade.melee.Dusk 0.44 | 11 | 64% |
| maribo.Quester 0.3 | 6 | 83% |
| axeBots.HataMoto 3.09 | 2 | 0% |
| stelo.SoJNanoMelee 1.1 | 2 | 100% |
| cf.RiO.RiOx 4.2.1 | 2 | 100% |
| ntc.Opposite 1.5 | 2 | 50% |
| sanyi.mikrobi.Roberto 1.0 | 1 | 100% |

Hadur died in 43 of 70 rounds, at a mean tick of 963. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Numbat 2.1 | 18 | 42% | 27 |
| brainfade.melee.Dusk 0.44 | 8 | 19% | 17 |
| maribo.Quester 0.3 | 7 | 16% | 12 |
| axeBots.HataMoto 3.09 | 5 | 12% | 5 |
| stelo.SoJNanoMelee 1.1 | 1 | 2% | 3 |
| ntc.Opposite 1.5 | 1 | 2% | 2 |
| cf.RiO.RiOx 4.2.1 | 1 | 2% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 2% | 1 |
| maribo.IotaCT 1.1 | 1 | 2% | 1 |

Posture (Hadur's M records, 69 rounds): 58934 melee ticks, 10815 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 27 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (69 rounds): longest scan gap while four or more were alive 27 ticks (69 rounds over 8); rounds whose longest gap at any count was over 8: 69; robots dropped as dead without a death event: 0.

Targeting waves (69 rounds): 19030 sent, 17547 reached their opponent, 3658 virtual hits (20.8% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 66.5% ± 12.9 | 65.8% ± 8.0 | +0.7 ± 21.0 |
| Survival | 81.9% ± 48.4 | 81.1% ± 2.0 | +0.8 ± 46.4 |
| Rounds won | 38.6% ± 127.1 | 42.9% ± 72.6 | -4.3 ± 199.7 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| ntc.Opposite 1.5 | 68.6% ± 0.2 | 67.2% ± 0.1 | +1.4 ± 0.3 |
| stelo.SoJNanoMelee 1.1 | 68.2% ± 24.2 | 66.6% ± 25.9 | +1.6 ± 50.1 |
| wompi.Numbat 2.1 | 52.3% ± 41.5 | 51.6% ± 7.4 | +0.7 ± 34.1 |
| brainfade.melee.Dusk 0.44 | 57.9% ± 60.1 | 60.0% ± 14.8 | -2.1 ± 75.0 |
| axeBots.HataMoto 3.09 | 66.3% ± 13.9 | 68.3% ± 23.9 | -2.0 ± 37.8 |
| sanyi.mikrobi.Roberto 1.0 | 76.4% ± 6.4 | 74.8% ± 7.1 | +1.7 ± 13.6 |
| maribo.IotaCT 1.1 | 81.2% ± 17.5 | 78.8% ± 12.3 | +2.4 ± 29.8 |
| maribo.Quester 0.3 | 58.5% ± 12.1 | 54.8% ± 15.0 | +3.7 ± 2.9 |
| cf.RiO.RiOx 4.2.1 | 69.5% ± 12.5 | 70.5% ± 19.4 | -1.0 ± 31.9 |

## Melee bench: F30

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 19 over 2 battles (9.5 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 81.1 | 30 / 70 | 2.70 | 16.9% | 8395 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.0 | 16.9% | 30 |
| wompi.Numbat 2.1 | 2.0 | 15.9% | 20 |
| maribo.Quester 0.3 | 3.0 | 14.0% | 8 |
| brainfade.melee.Dusk 0.44 | 4.0 | 11.3% | 7 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 8.5% | 1 |
| ntc.Opposite 1.5 | 6.0 | 8.2% | 0 |
| axeBots.HataMoto 3.09 | 6.5 | 7.9% | 2 |
| cf.RiO.RiOx 4.2.1 | 8.0 | 7.1% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 9.0 | 5.7% | 0 |
| maribo.IotaCT 1.1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.0 | 17 / 35 | 4505 |
| 2 | 1 | 65.2 | 81.3 | 13 / 35 | 3890 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Numbat 2.1 | 19 | 68% |
| maribo.Quester 0.3 | 10 | 90% |
| stelo.SoJNanoMelee 1.1 | 6 | 83% |
| brainfade.melee.Dusk 0.44 | 3 | 67% |
| ntc.Opposite 1.5 | 1 | 100% |
| axeBots.HataMoto 3.09 | 1 | 0% |

Hadur died in 40 of 70 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Numbat 2.1 | 17 | 43% | 30 |
| maribo.Quester 0.3 | 11 | 28% | 20 |
| brainfade.melee.Dusk 0.44 | 4 | 10% | 6 |
| ntc.Opposite 1.5 | 3 | 8% | 4 |
| axeBots.HataMoto 3.09 | 2 | 5% | 2 |
| cf.RiO.RiOx 4.2.1 | 2 | 5% | 2 |
| stelo.SoJNanoMelee 1.1 | 1 | 3% | 4 |
| sanyi.mikrobi.Roberto 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 70 rounds): 55111 melee ticks, 11945 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 32 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 18557 sent, 17039 reached their opponent, 3278 virtual hits (19.2% of those reached).

## Melee bench: F31

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 15 over 2 battles (7.5 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 78.1 | 24 / 70 | 2.97 | 15.4% | 6457 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 15.4% | 24 |
| stelo.Spread 0.9 | 2.0 | 14.3% | 19 |
| bts.wiki.RipCurl 0.9b | 3.0 | 13.6% | 8 |
| voidious.mini.BrokenSword 2.0.3 | 4.5 | 12.1% | 5 |
| davidalves.Phoenix 0.54 | 4.5 | 11.9% | 10 |
| simonton.nano.MeleeSeed 1.8 | 6.0 | 9.1% | 2 |
| alpha.BlackIce 1.0 | 8.0 | 5.9% | 1 |
| yk.JahRoslav 1.1 | 8.5 | 6.1% | 1 |
| myl.nano.KomoriNinja 1.1 | 8.5 | 6.1% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 77.5 | 12 / 35 | 3231 |
| 2 | 1 | 63.5 | 78.7 | 12 / 35 | 3226 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 15 | 73% |
| stelo.Spread 0.9 | 12 | 50% |
| voidious.mini.BrokenSword 2.0.3 | 6 | 67% |
| davidalves.Phoenix 0.54 | 4 | 25% |
| alpha.BlackIce 1.0 | 2 | 50% |
| simonton.nano.MeleeSeed 1.8 | 1 | 100% |

Hadur died in 46 of 70 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 16 | 35% | 22 |
| stelo.Spread 0.9 | 11 | 24% | 18 |
| davidalves.Phoenix 0.54 | 6 | 13% | 8 |
| voidious.mini.BrokenSword 2.0.3 | 6 | 13% | 8 |
| alpha.BlackIce 1.0 | 3 | 7% | 4 |
| simonton.nano.MeleeSeed 1.8 | 1 | 2% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 2% | 4 |
| yk.JahRoslav 1.1 | 1 | 2% | 1 |
| myl.nano.KomoriNinja 1.1 | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 43486 melee ticks, 9390 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 41 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 15024 sent, 13459 reached their opponent, 2476 virtual hits (18.4% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 63.2% ± 2.9 | 61.6% ± 1.2 | +1.6 ± 1.7 |
| Survival | 78.1% ± 8.1 | 75.2% ± 12.1 | +2.9 ± 4.0 |
| Rounds won | 34.3% ± 0.0 | 28.6% ± 0.0 | +5.7 ± 0.0 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 53.0% ± 0.8 | 54.2% ± 35.3 | -1.2 ± 34.5 |
| alpha.BlackIce 1.0 | 72.2% ± 11.5 | 71.7% ± 24.3 | +0.4 ± 12.7 |
| davidalves.Phoenix 0.54 | 56.3% ± 9.0 | 53.1% ± 13.0 | +3.2 ± 4.0 |
| Gecko.ultimateGeckoBot 1.0 | 74.1% ± 27.5 | 73.0% ± 7.9 | +1.1 ± 19.6 |
| simonton.nano.MeleeSeed 1.8 | 62.9% ± 0.4 | 59.7% ± 19.2 | +3.2 ± 19.7 |
| stelo.Spread 0.9 | 51.7% ± 10.6 | 50.0% ± 15.8 | +1.7 ± 26.4 |
| yk.JahRoslav 1.1 | 71.5% ± 6.4 | 71.3% ± 7.8 | +0.3 ± 14.1 |
| voidious.mini.BrokenSword 2.0.3 | 56.0% ± 24.7 | 54.9% ± 28.2 | +1.0 ± 52.9 |
| myl.nano.KomoriNinja 1.1 | 71.5% ± 12.7 | 66.6% ± 19.6 | +4.9 ± 6.9 |

## Melee bench: F31

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 14 over 2 battles (7.0 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 75.2 | 20 / 70 | 3.23 | 14.5% | 5734 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.5 | 14.5% | 23 |
| hadur2.Hadur 3.13 | 1.5 | 14.5% | 20 |
| davidalves.Phoenix 0.54 | 3.5 | 12.8% | 13 |
| bts.wiki.RipCurl 0.9b | 4.0 | 12.3% | 8 |
| voidious.mini.BrokenSword 2.0.3 | 4.5 | 11.9% | 1 |
| simonton.nano.MeleeSeed 1.8 | 6.0 | 9.8% | 4 |
| myl.nano.KomoriNinja 1.1 | 7.0 | 7.3% | 1 |
| yk.JahRoslav 1.1 | 8.5 | 5.8% | 1 |
| alpha.BlackIce 1.0 | 9.0 | 5.7% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 74.3 | 10 / 35 | 2947 |
| 2 | 1 | 61.7 | 76.2 | 10 / 35 | 2787 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 12 | 33% |
| bts.wiki.RipCurl 0.9b | 8 | 63% |
| davidalves.Phoenix 0.54 | 8 | 25% |
| simonton.nano.MeleeSeed 1.8 | 7 | 71% |
| voidious.mini.BrokenSword 2.0.3 | 3 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 50 of 70 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 14 | 28% | 15 |
| stelo.Spread 0.9 | 11 | 22% | 16 |
| simonton.nano.MeleeSeed 1.8 | 9 | 18% | 14 |
| bts.wiki.RipCurl 0.9b | 8 | 16% | 13 |
| voidious.mini.BrokenSword 2.0.3 | 5 | 10% | 7 |
| myl.nano.KomoriNinja 1.1 | 2 | 4% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 2% | 1 |
| yk.JahRoslav 1.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 70 rounds): 44656 melee ticks, 9509 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 24 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 14759 sent, 13265 reached their opponent, 2429 virtual hits (18.3% of those reached).

## Melee bench: F32

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 21 over 2 battles (10.5 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 83.7 | 33 / 70 | 2.47 | 16.6% | 7612 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 16.6% | 33 |
| kid.test.NightFox .2 | 2.5 | 15.1% | 8 |
| deewiant.Anomaly 0.2 | 2.5 | 15.1% | 18 |
| mz.NanoGod 2.02 | 4.5 | 11.4% | 5 |
| jok.PheonixM 0.1.2 | 4.5 | 11.7% | 5 |
| tvv.nano.Polaris 1.2 | 6.0 | 9.4% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 6.6% | 0 |
| asd.Cthulhu 1.3 | 7.5 | 6.2% | 0 |
| stelo.Lifestealer 1.0 | 9.0 | 4.8% | 0 |
| sample.RamFire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 82.9 | 13 / 35 | 3741 |
| 2 | 1 | 66.5 | 84.4 | 20 / 35 | 3871 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 15 | 60% |
| kid.test.NightFox .2 | 11 | 82% |
| jok.PheonixM 0.1.2 | 10 | 80% |
| mz.NanoGod 2.02 | 4 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 100% |
| tvv.nano.Polaris 1.2 | 1 | 100% |

Hadur died in 37 of 70 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 14 | 38% | 24 |
| kid.test.NightFox .2 | 10 | 27% | 19 |
| mz.NanoGod 2.02 | 7 | 19% | 11 |
| jok.PheonixM 0.1.2 | 4 | 11% | 10 |
| tvv.nano.Polaris 1.2 | 1 | 3% | 3 |
| stelo.Lifestealer 1.0 | 1 | 3% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 0 | 0% | 2 |

Posture (Hadur's M records, 70 rounds): 55101 melee ticks, 11788 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 32 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 17478 sent, 15897 reached their opponent, 2485 virtual hits (15.6% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 65.9% ± 7.0 | 66.4% ± 19.8 | -0.5 ± 12.8 |
| Survival | 83.7% ± 10.1 | 86.2% ± 34.3 | -2.5 ± 24.2 |
| Rounds won | 47.1% ± 127.1 | 47.1% ± 236.0 | +0.0 ± 108.9 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| kid.test.NightFox .2 | 52.5% ± 15.3 | 53.5% ± 33.0 | -1.0 ± 17.6 |
| asd.Cthulhu 1.3 | 72.8% ± 2.3 | 76.3% ± 39.4 | -3.5 ± 41.6 |
| tvv.nano.Polaris 1.2 | 64.1% ± 21.5 | 63.4% ± 13.6 | +0.7 ± 35.1 |
| mz.NanoGod 2.02 | 59.4% ± 33.6 | 60.0% ± 9.2 | -0.6 ± 24.5 |
| deewiant.Anomaly 0.2 | 52.4% ± 1.1 | 52.2% ± 28.7 | +0.2 ± 27.7 |
| stelo.Lifestealer 1.0 | 77.7% ± 22.0 | 78.6% ± 14.1 | -0.8 ± 7.9 |
| ers.nano.hawk.HawkLA 3.0m | 71.5% ± 25.4 | 70.0% ± 2.9 | +1.6 ± 22.4 |
| sample.RamFire 1.0 | 84.1% ± 16.4 | 82.0% ± 13.8 | +2.1 ± 30.2 |
| jok.PheonixM 0.1.2 | 58.8% ± 5.9 | 62.1% ± 23.3 | -3.3 ± 17.4 |

## Melee bench: F32

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 22 over 2 battles (11.0 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 86.2 | 33 / 70 | 2.24 | 17.1% | 7677 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.5 | 15.6% | 15 |
| hadur2.Hadur 3.13 | 1.5 | 17.1% | 33 |
| kid.test.NightFox .2 | 3.0 | 14.8% | 12 |
| mz.NanoGod 2.02 | 4.0 | 11.4% | 2 |
| jok.PheonixM 0.1.2 | 5.0 | 10.4% | 1 |
| tvv.nano.Polaris 1.2 | 6.0 | 9.8% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.3% | 4 |
| asd.Cthulhu 1.3 | 8.0 | 5.3% | 0 |
| stelo.Lifestealer 1.0 | 9.0 | 4.6% | 0 |
| sample.RamFire 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 83.5 | 10 / 35 | 3649 |
| 2 | 1 | 68.0 | 88.9 | 23 / 35 | 4028 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 23 | 61% |
| kid.test.NightFox .2 | 12 | 83% |
| jok.PheonixM 0.1.2 | 6 | 83% |
| mz.NanoGod 2.02 | 3 | 67% |
| tvv.nano.Polaris 1.2 | 2 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 0% |

Hadur died in 37 of 70 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 17 | 46% | 32 |
| kid.test.NightFox .2 | 8 | 22% | 16 |
| mz.NanoGod 2.02 | 5 | 14% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 8% | 3 |
| tvv.nano.Polaris 1.2 | 2 | 5% | 5 |
| jok.PheonixM 0.1.2 | 1 | 3% | 6 |
| asd.Cthulhu 1.3 | 1 | 3% | 2 |

Posture (Hadur's M records, 69 rounds): 56143 melee ticks, 15431 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (69 rounds): longest scan gap while four or more were alive 31 ticks (69 rounds over 8); rounds whose longest gap at any count was over 8: 69; robots dropped as dead without a death event: 0.

Targeting waves (69 rounds): 17397 sent, 15826 reached their opponent, 2284 virtual hits (14.4% of those reached).

## Melee bench: F33

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 19 over 2 battles (9.5 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 81.7 | 28 / 70 | 2.64 | 16.6% | 8369 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 16.6% | 28 |
| cx.mini.Nimrod 0.55 | 2.0 | 13.6% | 10 |
| pulsar.PulsarMax 0.8.9 | 3.0 | 12.7% | 9 |
| maribo.mini.MiniQuester 0.1 | 4.0 | 11.7% | 7 |
| rdt199.Warlord 0.73 | 5.0 | 11.2% | 9 |
| catcat20.Rabbit 0.001 | 6.0 | 9.6% | 7 |
| bigpete.Stewie 1.0 | 7.0 | 9.0% | 0 |
| apc.botM 3.0 | 8.0 | 7.1% | 0 |
| wompi.Quokka 1.6 | 9.0 | 6.3% | 0 |
| abud.ThirdRobo 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 80.3 | 11 / 35 | 4291 |
| 2 | 1 | 66.2 | 83.2 | 17 / 35 | 4078 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 11 | 73% |
| rdt199.Warlord 0.73 | 8 | 75% |
| maribo.mini.MiniQuester 0.1 | 7 | 71% |
| catcat20.Rabbit 0.001 | 5 | 80% |
| cx.mini.Nimrod 0.55 | 5 | 60% |
| bigpete.Stewie 1.0 | 2 | 100% |

Hadur died in 42 of 70 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 13 | 31% | 17 |
| maribo.mini.MiniQuester 0.1 | 10 | 24% | 18 |
| cx.mini.Nimrod 0.55 | 7 | 17% | 9 |
| rdt199.Warlord 0.73 | 6 | 14% | 13 |
| catcat20.Rabbit 0.001 | 3 | 7% | 5 |
| bigpete.Stewie 1.0 | 2 | 5% | 5 |
| apc.botM 3.0 | 1 | 2% | 3 |

Posture (Hadur's M records, 70 rounds): 53529 melee ticks, 10275 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 30 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 18390 sent, 16836 reached their opponent, 3506 virtual hits (20.8% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 65.5% ± 9.2 | 64.1% ± 15.6 | +1.4 ± 6.4 |
| Survival | 81.7% ± 18.2 | 79.4% ± 28.2 | +2.4 ± 10.1 |
| Rounds won | 40.0% ± 108.9 | 32.9% ± 90.8 | +7.1 ± 18.2 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 56.7% ± 2.9 | 58.5% ± 15.0 | -1.8 ± 17.8 |
| bigpete.Stewie 1.0 | 64.8% ± 11.9 | 68.5% ± 17.6 | -3.7 ± 5.7 |
| cx.mini.Nimrod 0.55 | 55.0% ± 14.6 | 52.3% ± 15.9 | +2.7 ± 1.3 |
| wompi.Quokka 1.6 | 72.4% ± 16.6 | 72.6% ± 7.8 | -0.2 ± 8.8 |
| catcat20.Rabbit 0.001 | 63.3% ± 6.9 | 61.3% ± 33.1 | +2.0 ± 26.2 |
| rdt199.Warlord 0.73 | 59.7% ± 7.5 | 61.3% ± 31.3 | -1.6 ± 23.9 |
| apc.botM 3.0 | 70.1% ± 10.8 | 62.9% ± 12.5 | +7.2 ± 1.7 |
| maribo.mini.MiniQuester 0.1 | 58.8% ± 18.7 | 52.6% ± 8.5 | +6.1 ± 10.2 |
| abud.ThirdRobo 1.0 | 88.7% ± 1.4 | 87.0% ± 1.6 | +1.7 ± 0.2 |

## Melee bench: F33

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 13 over 2 battles (6.5 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 79.4 | 23 / 70 | 2.86 | 15.7% | 7509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.0 | 15.7% | 23 |
| cx.mini.Nimrod 0.55 | 2.5 | 14.3% | 10 |
| maribo.mini.MiniQuester 0.1 | 2.5 | 14.1% | 12 |
| pulsar.PulsarMax 0.8.9 | 4.0 | 11.2% | 8 |
| rdt199.Warlord 0.73 | 5.5 | 9.9% | 9 |
| catcat20.Rabbit 0.001 | 6.0 | 9.9% | 7 |
| apc.botM 3.0 | 6.5 | 9.3% | 1 |
| bigpete.Stewie 1.0 | 8.0 | 7.2% | 1 |
| wompi.Quokka 1.6 | 9.0 | 5.9% | 0 |
| abud.ThirdRobo 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 77.1 | 9 / 35 | 3533 |
| 2 | 1 | 65.3 | 81.6 | 14 / 35 | 3976 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.mini.MiniQuester 0.1 | 12 | 83% |
| rdt199.Warlord 0.73 | 8 | 50% |
| catcat20.Rabbit 0.001 | 6 | 33% |
| pulsar.PulsarMax 0.8.9 | 4 | 50% |
| cx.mini.Nimrod 0.55 | 4 | 50% |
| apc.botM 3.0 | 3 | 67% |
| bigpete.Stewie 1.0 | 2 | 50% |

Hadur died in 48 of 70 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.mini.MiniQuester 0.1 | 12 | 25% | 18 |
| pulsar.PulsarMax 0.8.9 | 11 | 23% | 14 |
| catcat20.Rabbit 0.001 | 7 | 15% | 10 |
| rdt199.Warlord 0.73 | 6 | 13% | 11 |
| cx.mini.Nimrod 0.55 | 5 | 10% | 9 |
| apc.botM 3.0 | 4 | 8% | 6 |
| bigpete.Stewie 1.0 | 2 | 4% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 70 rounds): 54694 melee ticks, 10777 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 32 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 17672 sent, 16225 reached their opponent, 3041 virtual hits (18.7% of those reached).

## Melee bench: F34

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 30 over 2 battles (15.0 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 95.2 | 57 / 70 | 1.43 | 20.9% | 10589 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 20.9% | 57 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2.5 | 11.6% | 2 |
| br2.MobyDickBot 1.6 | 2.5 | 12.2% | 5 |
| Krabb.akim2.Akim2 1.1b | 4.0 | 10.7% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 5.5 | 9.6% | 3 |
| pez.mini.ChironexFleckeri 0.5 | 5.5 | 9.4% | 1 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.8% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 6.6% | 0 |
| stelo.RamTrackSurfer 1.2 | 9.0 | 6.1% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 94.9 | 27 / 35 | 5380 |
| 2 | 1 | 71.0 | 95.6 | 30 / 35 | 5209 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| br2.MobyDickBot 1.6 | 16 | 75% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 91% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 82% |
| whitesquare.robots.SkynetAdvanced 1.1 | 9 | 100% |
| sp.Nanos.Ember 1.1 | 9 | 89% |
| Krabb.akim2.Akim2 1.1b | 9 | 89% |
| stelo.RamTrackSurfer 1.2 | 1 | 100% |

Hadur died in 13 of 70 rounds, at a mean tick of 1255. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| br2.MobyDickBot 1.6 | 5 | 38% | 15 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 23% | 12 |
| Krabb.akim2.Akim2 1.1b | 1 | 8% | 15 |
| sp.Nanos.Ember 1.1 | 1 | 8% | 8 |
| pez.mini.ChironexFleckeri 0.5 | 1 | 8% | 8 |
| stelo.RamTrackSurfer 1.2 | 1 | 8% | 4 |
| squidM.TentalceMeleeNano 1.1 | 1 | 8% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 6 |

Posture (Hadur's M records, 70 rounds): 51858 melee ticks, 21408 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 34 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 16901 sent, 15499 reached their opponent, 3300 virtual hits (21.3% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 70.9% ± 0.9 | 67.1% ± 4.1 | +3.8 ± 3.2 |
| Survival | 95.2% ± 4.0 | 88.7% ± 2.0 | +6.5 ± 2.0 |
| Rounds won | 81.4% ± 54.5 | 50.0% ± 54.5 | +31.4 ± 0.0 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 80.7% ± 31.2 | 80.3% ± 2.2 | +0.4 ± 33.5 |
| sheldor.micro.PointInLineRRAL 1.0 | 68.4% ± 2.4 | 67.4% ± 21.9 | +1.1 ± 19.4 |
| br2.MobyDickBot 1.6 | 63.1% ± 3.8 | 57.9% ± 25.0 | +5.2 ± 28.9 |
| squidM.TentalceMeleeNano 1.1 | 76.1% ± 8.4 | 74.0% ± 27.0 | +2.1 ± 18.7 |
| Krabb.akim2.Akim2 1.1b | 66.1% ± 7.2 | 59.8% ± 16.1 | +6.2 ± 8.9 |
| whitesquare.robots.SkynetAdvanced 1.1 | 64.3% ± 15.7 | 59.6% ± 20.5 | +4.7 ± 4.8 |
| pez.mini.ChironexFleckeri 0.5 | 69.0% ± 15.5 | 62.4% ± 35.7 | +6.6 ± 51.2 |
| stelo.RamTrackSurfer 1.2 | 77.4% ± 35.8 | 70.3% ± 5.4 | +7.1 ± 41.2 |
| sp.Nanos.Ember 1.1 | 72.7% ± 11.2 | 72.4% ± 8.2 | +0.4 ± 19.4 |

## Melee bench: F34

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 16 over 2 battles (8.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 88.7 | 35 / 70 | 2.01 | 18.0% | 8468 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.0 | 18.0% | 35 |
| br2.MobyDickBot 1.6 | 2.0 | 13.1% | 16 |
| whitesquare.robots.SkynetAdvanced 1.1 | 3.5 | 12.2% | 3 |
| Krabb.akim2.Akim2 1.1b | 3.5 | 12.1% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 5.0 | 10.8% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.0 | 8.7% | 5 |
| stelo.RamTrackSurfer 1.2 | 7.0 | 7.6% | 2 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.9% | 3 |
| squidM.TentalceMeleeNano 1.1 | 9.0 | 6.3% | 1 |
| robar.nano.Assertive_Melee 0.2 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 88.6 | 16 / 35 | 4029 |
| 2 | 1 | 67.5 | 88.9 | 19 / 35 | 4439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| br2.MobyDickBot 1.6 | 16 | 31% |
| pez.mini.ChironexFleckeri 0.5 | 12 | 67% |
| whitesquare.robots.SkynetAdvanced 1.1 | 9 | 89% |
| Krabb.akim2.Akim2 1.1b | 6 | 100% |
| stelo.RamTrackSurfer 1.2 | 5 | 60% |
| sp.Nanos.Ember 1.1 | 4 | 75% |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 67% |

Hadur died in 36 of 70 rounds, at a mean tick of 1134. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| br2.MobyDickBot 1.6 | 12 | 33% | 13 |
| pez.mini.ChironexFleckeri 0.5 | 7 | 19% | 12 |
| Krabb.akim2.Akim2 1.1b | 5 | 14% | 14 |
| stelo.RamTrackSurfer 1.2 | 3 | 8% | 6 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 6% | 11 |
| sp.Nanos.Ember 1.1 | 2 | 6% | 6 |
| robar.nano.Assertive_Melee 0.2 | 2 | 6% | 2 |
| squidM.TentalceMeleeNano 1.1 | 2 | 6% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 1 | 3% | 4 |

Posture (Hadur's M records, 70 rounds): 53581 melee ticks, 21618 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 33 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 17457 sent, 16009 reached their opponent, 2938 virtual hits (18.4% of those reached).

## Melee bench: F35

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 40 over 2 battles (20.0 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 83.2 | 13 / 70 | 2.51 | 16.1% | 8170 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 21.2% | 53 |
| hadur2.Hadur 3.13gk | 2.0 | 16.1% | 13 |
| mz.MicroSheep 1.0 | 3.5 | 10.2% | 1 |
| cb.nano.Insomnia 1.0 | 4.0 | 10.3% | 3 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 9.4% | 0 |
| mz.MicroGodMelee 1 | 5.5 | 9.1% | 0 |
| jaybot.adv.bots.JayBot 2.0 | 6.5 | 8.1% | 0 |
| zyx.nano.BacillusComma 1.0 | 8.0 | 6.5% | 0 |
| stelo.MirrorMicro 1.0 | 9.0 | 5.3% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 79.0 | 6 / 35 | 4137 |
| 2 | 2 | 66.2 | 87.3 | 7 / 35 | 4033 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 42 | 7% |
| mz.MicroSheep 1.0 | 5 | 80% |
| cb.nano.Insomnia 1.0 | 2 | 100% |
| mz.MicroGodMelee 1 | 2 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 100% |

Hadur died in 57 of 70 rounds, at a mean tick of 1029. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 41 | 72% | 45 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 9% | 6 |
| mz.MicroSheep 1.0 | 4 | 7% | 8 |
| cb.nano.Insomnia 1.0 | 3 | 5% | 3 |
| zyx.nano.BacillusComma 1.0 | 2 | 4% | 2 |
| stelo.MirrorMicro 1.0 | 1 | 2% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 1 | 2% | 1 |
| mz.MicroGodMelee 1 | 0 | 0% | 4 |

Posture (Hadur's M records, 70 rounds): 47613 melee ticks, 25378 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 33 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 15701 sent, 14147 reached their opponent, 3338 virtual hits (23.6% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 65.1% ± 13.0 | 65.3% ± 8.6 | -0.2 ± 21.6 |
| Survival | 83.2% ± 52.4 | 84.3% ± 14.1 | -1.1 ± 66.6 |
| Rounds won | 18.6% ± 18.2 | 30.0% ± 18.2 | -11.4 ± 0.0 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| com.cgarias.rc.AdvancedTrackerII 1.0 | 80.5% ± 18.5 | 82.4% ± 14.5 | -1.9 ± 33.0 |
| voidious.Diamond 1.8.28 | 43.1% ± 3.6 | 44.4% ± 7.9 | -1.3 ± 11.5 |
| cb.nano.Insomnia 1.0 | 61.1% ± 35.3 | 64.6% ± 7.6 | -3.5 ± 42.9 |
| mz.MicroGodMelee 1 | 64.1% ± 28.4 | 60.8% ± 4.2 | +3.3 ± 24.3 |
| mz.MicroSheep 1.0 | 61.2% ± 1.8 | 58.9% ± 11.4 | +2.3 ± 9.7 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 63.1% ± 21.4 | 63.9% ± 0.0 | -0.7 ± 21.4 |
| stelo.MirrorMicro 1.0 | 75.3% ± 1.0 | 77.9% ± 45.0 | -2.6 ± 46.0 |
| zyx.nano.BacillusComma 1.0 | 71.2% ± 32.8 | 70.5% ± 2.8 | +0.8 ± 30.0 |
| jaybot.adv.bots.JayBot 2.0 | 66.7% ± 34.6 | 64.6% ± 10.5 | +2.1 ± 24.1 |

## Melee bench: F35

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 25 over 2 battles (12.5 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 84.3 | 21 / 70 | 2.41 | 16.2% | 7356 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.3% | 45 |
| hadur2.Hadur 3.13 | 2.0 | 16.2% | 21 |
| mz.MicroSheep 1.0 | 3.0 | 11.3% | 3 |
| mz.MicroGodMelee 1 | 4.0 | 10.4% | 1 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 9.2% | 0 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 8.9% | 0 |
| cb.nano.Insomnia 1.0 | 6.5 | 8.9% | 0 |
| zyx.nano.BacillusComma 1.0 | 8.0 | 6.8% | 0 |
| stelo.MirrorMicro 1.0 | 9.0 | 4.6% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 85.4 | 10 / 35 | 3874 |
| 2 | 2 | 64.6 | 83.2 | 11 / 35 | 3482 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 32 | 16% |
| mz.MicroSheep 1.0 | 5 | 80% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 100% |
| mz.MicroGodMelee 1 | 5 | 80% |
| jaybot.adv.bots.JayBot 2.0 | 3 | 100% |

Hadur died in 49 of 70 rounds, at a mean tick of 1062. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 28 | 57% | 40 |
| cb.nano.Insomnia 1.0 | 6 | 12% | 7 |
| mz.MicroGodMelee 1 | 5 | 10% | 9 |
| mz.MicroSheep 1.0 | 4 | 8% | 7 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 8% | 4 |
| zyx.nano.BacillusComma 1.0 | 1 | 2% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 1 | 2% | 1 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 69 rounds): 50681 melee ticks, 22353 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (69 rounds): longest scan gap while four or more were alive 34 ticks (69 rounds over 8); rounds whose longest gap at any count was over 8: 69; robots dropped as dead without a death event: 0.

Targeting waves (69 rounds): 16168 sent, 14590 reached their opponent, 2962 virtual hits (20.3% of those reached).

## Melee bench: F36

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 21 over 2 battles (10.5 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 90.5 | 47 / 70 | 1.86 | 19.1% | 8828 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 19.1% | 47 |
| kvk.HebusLeTroll 0.35 | 2.0 | 15.0% | 14 |
| Polkwane.SmashMelee 1.0 | 3.0 | 11.3% | 6 |
| qualidafial.MajorDick 1.0.1 | 4.0 | 9.0% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 5.0 | 8.3% | 1 |
| zyx.micro.Ant 1.1 | 7.0 | 7.8% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 6.9% | 0 |
| DBall.NUKE 0.1 | 8.0 | 7.4% | 1 |
| EBBU.Sim2 1.02 | 8.5 | 7.6% | 0 |
| conscience.Electron 1.3g | 8.5 | 7.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 93.3 | 25 / 35 | 4619 |
| 2 | 1 | 67.7 | 87.6 | 22 / 35 | 4209 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 26 | 77% |
| Polkwane.SmashMelee 1.0 | 13 | 85% |
| zyx.micro.Ant 1.1 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| DBall.NUKE 0.1 | 1 | 0% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 24 of 70 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kvk.HebusLeTroll 0.35 | 9 | 38% | 30 |
| Polkwane.SmashMelee 1.0 | 8 | 33% | 15 |
| EBBU.Sim2 1.02 | 2 | 8% | 5 |
| qualidafial.MajorDick 1.0.1 | 2 | 8% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 4% | 5 |
| DBall.NUKE 0.1 | 1 | 4% | 2 |
| conscience.Electron 1.3g | 1 | 4% | 1 |
| zyx.micro.Ant 1.1 | 0 | 0% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 69 rounds): 44581 melee ticks, 12772 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (69 rounds): longest scan gap while four or more were alive 40 ticks (69 rounds over 8); rounds whose longest gap at any count was over 8: 69; robots dropped as dead without a death event: 0.

Targeting waves (69 rounds): 14502 sent, 13054 reached their opponent, 3233 virtual hits (24.8% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 68.5% ± 9.9 | 67.9% ± 12.2 | +0.6 ± 2.2 |
| Survival | 90.5% ± 36.3 | 89.5% ± 28.2 | +1.0 ± 8.1 |
| Rounds won | 67.1% ± 54.5 | 70.0% ± 18.2 | -2.9 ± 36.3 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| Polkwane.SmashMelee 1.0 | 62.8% ± 15.2 | 62.4% ± 2.3 | +0.4 ± 12.9 |
| qualidafial.MajorDick 1.0.1 | 67.9% ± 7.2 | 67.5% ± 19.4 | +0.4 ± 26.6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 69.6% ± 2.5 | 70.2% ± 20.8 | -0.6 ± 23.3 |
| Grystrion.RandomTrackerNOREV 1.0 | 73.5% ± 26.6 | 71.5% ± 22.2 | +2.1 ± 48.8 |
| DBall.NUKE 0.1 | 72.2% ± 1.4 | 71.4% ± 13.8 | +0.8 ± 15.2 |
| conscience.Electron 1.3g | 71.7% ± 25.4 | 72.1% ± 51.9 | -0.3 ± 26.5 |
| kvk.HebusLeTroll 0.35 | 56.1% ± 40.4 | 56.6% ± 21.8 | -0.5 ± 18.6 |
| EBBU.Sim2 1.02 | 71.6% ± 23.0 | 68.9% ± 12.0 | +2.7 ± 11.0 |
| zyx.micro.Ant 1.1 | 71.0% ± 17.9 | 70.7% ± 13.0 | +0.4 ± 31.0 |

## Melee bench: F36

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 15 over 2 battles (7.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 89.5 | 49 / 70 | 1.94 | 18.7% | 8319 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.0 | 18.7% | 49 |
| kvk.HebusLeTroll 0.35 | 2.0 | 14.4% | 9 |
| Polkwane.SmashMelee 1.0 | 3.0 | 11.3% | 4 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 9.0% | 2 |
| EBBU.Sim2 1.02 | 6.0 | 8.5% | 0 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 7.0 | 8.0% | 2 |
| zyx.micro.Ant 1.1 | 7.5 | 7.8% | 2 |
| DBall.NUKE 0.1 | 8.0 | 7.5% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 7.5% | 0 |
| conscience.Electron 1.3g | 8.0 | 7.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 91.7 | 25 / 35 | 4453 |
| 2 | 1 | 66.9 | 87.3 | 24 / 35 | 3866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 24 | 88% |
| Polkwane.SmashMelee 1.0 | 11 | 91% |
| zyx.micro.Ant 1.1 | 7 | 86% |
| DBall.NUKE 0.1 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 50% |
| EBBU.Sim2 1.02 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 21 of 70 rounds, at a mean tick of 636. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kvk.HebusLeTroll 0.35 | 6 | 29% | 22 |
| Polkwane.SmashMelee 1.0 | 4 | 19% | 15 |
| zyx.micro.Ant 1.1 | 4 | 19% | 8 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 14% | 6 |
| EBBU.Sim2 1.02 | 2 | 10% | 9 |
| DBall.NUKE 0.1 | 2 | 10% | 6 |
| conscience.Electron 1.3g | 0 | 0% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 42334 melee ticks, 12154 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 48 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 14178 sent, 12661 reached their opponent, 2821 virtual hits (22.3% of those reached).

## Melee bench: F37

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 23 over 2 battles (11.5 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 88.9 | 34 / 70 | 2.00 | 18.5% | 9788 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 18.5% | 34 |
| oog.melee.Capulet 1.2 | 2.0 | 16.5% | 29 |
| dummy.micro.Sparrow 2.5 | 3.0 | 13.3% | 5 |
| m3thos.mini.Eva01 0.5.5 | 4.5 | 10.2% | 0 |
| timmit.nano.TimDog 0.33 | 4.5 | 9.7% | 1 |
| pa.Improved 1.0 | 6.5 | 8.2% | 1 |
| amk.jointstrike.JointStrike 0.2 | 7.5 | 6.6% | 0 |
| sanja.First 0.1 | 8.0 | 6.1% | 0 |
| agrach.Dalek 1.0 | 8.0 | 6.0% | 0 |
| cvt.Firsty 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 89.2 | 19 / 35 | 4804 |
| 2 | 1 | 68.2 | 88.6 | 15 / 35 | 4984 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 29 | 52% |
| dummy.micro.Sparrow 2.5 | 8 | 75% |
| m3thos.mini.Eva01 0.5.5 | 6 | 100% |
| timmit.nano.TimDog 0.33 | 4 | 100% |
| agrach.Dalek 1.0 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 36 of 70 rounds, at a mean tick of 1080. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 23 | 64% | 38 |
| dummy.micro.Sparrow 2.5 | 9 | 25% | 13 |
| m3thos.mini.Eva01 0.5.5 | 2 | 6% | 7 |
| timmit.nano.TimDog 0.33 | 2 | 6% | 7 |
| pa.Improved 1.0 | 0 | 0% | 2 |
| agrach.Dalek 1.0 | 0 | 0% | 2 |
| cvt.Firsty 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 58970 melee ticks, 18848 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 70 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 19469 sent, 17990 reached their opponent, 3164 virtual hits (17.6% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 68.2% ± 0.3 | 67.5% ± 27.5 | +0.7 ± 27.2 |
| Survival | 88.9% ± 4.0 | 87.3% ± 80.7 | +1.6 ± 84.7 |
| Rounds won | 48.6% ± 72.6 | 48.6% ± 217.8 | -0.0 ± 290.4 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 58.2% ± 14.8 | 57.2% ± 43.1 | +1.0 ± 28.3 |
| m3thos.mini.Eva01 0.5.5 | 64.6% ± 17.6 | 63.7% ± 35.9 | +0.9 ± 18.4 |
| sanja.First 0.1 | 75.0% ± 12.3 | 74.2% ± 6.8 | +0.8 ± 5.5 |
| pa.Improved 1.0 | 69.3% ± 30.6 | 69.9% ± 25.6 | -0.5 ± 56.2 |
| timmit.nano.TimDog 0.33 | 65.4% ± 2.2 | 66.0% ± 5.9 | -0.6 ± 3.7 |
| cvt.Firsty 1.0 | 79.1% ± 17.5 | 76.6% ± 59.4 | +2.5 ± 41.9 |
| oog.melee.Capulet 1.2 | 52.9% ± 20.4 | 51.8% ± 33.0 | +1.1 ± 53.3 |
| agrach.Dalek 1.0 | 75.4% ± 17.2 | 75.5% ± 33.0 | -0.1 ± 50.2 |
| amk.jointstrike.JointStrike 0.2 | 73.7% ± 31.2 | 72.3% ± 18.5 | +1.4 ± 12.7 |

## Melee bench: F37

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 27 over 2 battles (13.5 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 87.3 | 34 / 70 | 2.14 | 18.1% | 9574 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.5 | 16.8% | 25 |
| hadur2.Hadur 3.13 | 1.5 | 18.1% | 34 |
| dummy.micro.Sparrow 2.5 | 3.0 | 13.5% | 7 |
| m3thos.mini.Eva01 0.5.5 | 4.5 | 10.2% | 1 |
| timmit.nano.TimDog 0.33 | 4.5 | 9.3% | 1 |
| pa.Improved 1.0 | 6.0 | 7.7% | 0 |
| amk.jointstrike.JointStrike 0.2 | 7.5 | 6.9% | 2 |
| sanja.First 0.1 | 8.5 | 6.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 5.5% | 0 |
| agrach.Dalek 1.0 | 9.0 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 81.0 | 11 / 35 | 4627 |
| 2 | 1 | 69.6 | 93.7 | 23 / 35 | 4947 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 35 | 54% |
| dummy.micro.Sparrow 2.5 | 8 | 63% |
| timmit.nano.TimDog 0.33 | 4 | 75% |
| m3thos.mini.Eva01 0.5.5 | 4 | 100% |
| cvt.Firsty 1.0 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 0% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 36 of 70 rounds, at a mean tick of 1093. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 21 | 58% | 38 |
| dummy.micro.Sparrow 2.5 | 9 | 25% | 14 |
| amk.jointstrike.JointStrike 0.2 | 3 | 8% | 3 |
| timmit.nano.TimDog 0.33 | 2 | 6% | 7 |
| pa.Improved 1.0 | 1 | 3% | 1 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 3 |
| sanja.First 0.1 | 0 | 0% | 2 |
| cvt.Firsty 1.0 | 0 | 0% | 1 |
| agrach.Dalek 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 56567 melee ticks, 23230 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 32 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 18710 sent, 17194 reached their opponent, 2844 virtual hits (16.5% of those reached).

## Melee bench: F38

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 10 over 2 battles (5.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 75.9 | 1 / 70 | 3.17 | 13.8% | 6085 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.3% | 62 |
| justin.Mallais 14.0 | 2.0 | 15.0% | 5 |
| hadur2.Hadur 3.13gk | 3.0 | 13.8% | 1 |
| kano.gamma.KanoGamma 1.8 | 4.0 | 9.9% | 1 |
| uji.Antique 1.0 | 5.0 | 9.5% | 1 |
| baal.nano.N 1.42 | 6.0 | 8.2% | 0 |
| kawigi.nano.Lib 1.0 | 7.0 | 7.3% | 0 |
| eld.Hmm 1.0 | 8.0 | 6.4% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.5% | 0 |
| sample.SpinBot 1.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.9 | 73.7 | 1 / 35 | 3049 |
| 2 | 3 | 63.3 | 78.1 | 0 / 35 | 3036 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 29 | 0% |
| justin.Mallais 14.0 | 5 | 0% |
| uji.Antique 1.0 | 2 | 50% |

Hadur died in 69 of 70 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 37 | 54% | 38 |
| justin.Mallais 14.0 | 20 | 29% | 20 |
| kano.gamma.KanoGamma 1.8 | 4 | 6% | 4 |
| kawigi.nano.Lib 1.0 | 3 | 4% | 3 |
| uji.Antique 1.0 | 3 | 4% | 3 |
| baal.nano.N 1.42 | 2 | 3% | 2 |

Posture (Hadur's M records, 68 rounds): 50127 melee ticks, 11468 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (68 rounds): longest scan gap while four or more were alive 33 ticks (68 rounds over 8); rounds whose longest gap at any count was over 8: 68; robots dropped as dead without a death event: 0.

Targeting waves (68 rounds): 16693 sent, 15140 reached their opponent, 2454 virtual hits (16.2% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 62.6% ± 8.9 | 63.7% ± 13.3 | -1.1 ± 22.2 |
| Survival | 75.9% ± 28.2 | 78.6% ± 26.2 | -2.7 ± 54.5 |
| Rounds won | 1.4% ± 18.2 | 8.6% ± 36.3 | -7.1 ± 18.2 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| eld.Hmm 1.0 | 68.4% ± 36.6 | 69.7% ± 1.7 | -1.3 ± 34.9 |
| mme.NikeEnhanced 2.0 | 71.4% ± 14.7 | 73.0% ± 20.6 | -1.6 ± 5.9 |
| kano.gamma.KanoGamma 1.8 | 58.3% ± 8.2 | 56.8% ± 36.5 | +1.5 ± 44.7 |
| sample.SpinBot 1.0 | 92.6% ± 4.8 | 92.7% ± 23.8 | -0.0 ± 28.7 |
| baal.nano.N 1.42 | 62.8% ± 15.3 | 62.9% ± 13.4 | -0.1 ± 28.7 |
| kawigi.nano.Lib 1.0 | 65.5% ± 1.2 | 63.2% ± 15.0 | +2.3 ± 16.2 |
| aaa.r.ScalarR 0.005g.047 | 37.3% ± 7.7 | 38.7% ± 11.1 | -1.5 ± 18.7 |
| justin.Mallais 14.0 | 48.1% ± 10.4 | 51.4% ± 21.6 | -3.3 ± 11.2 |
| uji.Antique 1.0 | 59.2% ± 1.8 | 64.6% ± 20.7 | -5.4 ± 22.6 |

## Melee bench: F38

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 12 over 2 battles (6.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 78.6 | 6 / 70 | 2.93 | 14.5% | 6121 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.9% | 58 |
| hadur2.Hadur 3.13 | 2.5 | 14.5% | 6 |
| justin.Mallais 14.0 | 2.5 | 13.7% | 4 |
| kano.gamma.KanoGamma 1.8 | 4.0 | 11.0% | 2 |
| baal.nano.N 1.42 | 5.0 | 8.6% | 0 |
| kawigi.nano.Lib 1.0 | 6.0 | 8.4% | 0 |
| uji.Antique 1.0 | 7.0 | 7.9% | 0 |
| eld.Hmm 1.0 | 8.0 | 6.3% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.4% | 0 |
| sample.SpinBot 1.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 80.6 | 4 / 35 | 3261 |
| 2 | 3 | 62.6 | 76.5 | 2 / 35 | 2860 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 29 | 7% |
| justin.Mallais 14.0 | 3 | 33% |
| uji.Antique 1.0 | 2 | 100% |
| baal.nano.N 1.42 | 1 | 100% |
| kano.gamma.KanoGamma 1.8 | 1 | 0% |

Hadur died in 64 of 70 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 35 | 55% | 38 |
| justin.Mallais 14.0 | 20 | 31% | 22 |
| kano.gamma.KanoGamma 1.8 | 5 | 8% | 5 |
| uji.Antique 1.0 | 2 | 3% | 3 |
| kawigi.nano.Lib 1.0 | 2 | 3% | 2 |

Posture (Hadur's M records, 70 rounds): 55030 melee ticks, 10332 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 40 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 17633 sent, 16072 reached their opponent, 2541 virtual hits (15.8% of those reached).

## Melee bench: F39

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 13 over 2 battles (6.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 91.6 | 56 / 70 | 1.76 | 21.1% | 13391 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 21.1% | 56 |
| lessonz.robocode.Oz 0.5.0 | 2.0 | 16.6% | 9 |
| tj.zombie1n 1.0.1 | 4.0 | 10.8% | 0 |
| disan.Chair 2.2.0 | 4.0 | 10.8% | 0 |
| gg.Wolverine 2.0 | 6.0 | 9.4% | 4 |
| rdm.Dueler 0.4x | 7.5 | 5.0% | 0 |
| el.JumpShoot 0.2 | 7.5 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 7.5 | 6.9% | 1 |
| cs.Grudge 1.0 | 8.0 | 6.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 100.0 | 35 / 35 | 6877 |
| 2 | 1 | 69.8 | 83.2 | 21 / 35 | 6514 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| lessonz.robocode.Oz 0.5.0 | 36 | 94% |
| tj.zombie1n 1.0.1 | 8 | 100% |
| disan.Chair 2.2.0 | 6 | 100% |
| gg.Wolverine 2.0 | 5 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |

Hadur died in 14 of 70 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lessonz.robocode.Oz 0.5.0 | 8 | 57% | 37 |
| cs.Grudge 1.0 | 3 | 21% | 5 |
| el.JumpShoot 0.2 | 1 | 7% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 7% | 5 |
| tj.zombie1n 1.0.1 | 1 | 7% | 2 |
| disan.Chair 2.2.0 | 0 | 0% | 7 |
| gg.Wolverine 2.0 | 0 | 0% | 4 |
| rdm.Dueler 0.4x | 0 | 0% | 2 |
| jangs.ns51 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 58383 melee ticks, 18331 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 51 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 18780 sent, 17317 reached their opponent, 3733 virtual hits (21.6% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 71.6% ± 23.4 | 69.3% ± 31.3 | +2.3 ± 7.9 |
| Survival | 91.6% ± 106.9 | 87.1% ± 127.1 | +4.4 ± 20.2 |
| Rounds won | 80.0% ± 254.1 | 70.0% ± 163.4 | +10.0 ± 90.8 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| jangs.ns51 1.0 | 77.0% ± 19.7 | 73.1% ± 8.2 | +3.8 ± 11.5 |
| cs.Grudge 1.0 | 75.4% ± 58.7 | 74.8% ± 86.4 | +0.6 ± 27.7 |
| tj.zombie1n 1.0.1 | 66.1% ± 17.0 | 65.2% ± 25.3 | +0.8 ± 8.3 |
| el.JumpShoot 0.2 | 76.7% ± 10.0 | 75.4% ± 30.9 | +1.3 ± 20.8 |
| gg.Wolverine 2.0 | 69.7% ± 122.2 | 66.3% ± 92.7 | +3.4 ± 29.5 |
| rdm.Dueler 0.4x | 82.9% ± 121.9 | 81.1% ± 95.7 | +1.7 ± 26.2 |
| lessonz.robocode.Oz 0.5.0 | 55.9% ± 35.4 | 53.3% ± 36.9 | +2.5 ± 1.4 |
| disan.Chair 2.2.0 | 65.9% ± 27.1 | 65.7% ± 53.9 | +0.2 ± 26.8 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 75.2% ± 42.7 | 69.1% ± 43.1 | +6.1 ± 0.4 |

## Melee bench: F39

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 14 over 2 battles (7.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.1 | 49 / 70 | 2.16 | 19.4% | 11697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.0 | 19.4% | 49 |
| lessonz.robocode.Oz 0.5.0 | 2.0 | 16.9% | 15 |
| tj.zombie1n 1.0.1 | 4.0 | 10.3% | 1 |
| disan.Chair 2.2.0 | 4.0 | 10.0% | 2 |
| gg.Wolverine 2.0 | 5.0 | 9.9% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 5.5 | 8.6% | 1 |
| rdm.Dueler 0.4x | 8.0 | 5.0% | 1 |
| jangs.ns51 1.0 | 8.0 | 7.1% | 0 |
| cs.Grudge 1.0 | 8.5 | 6.5% | 0 |
| el.JumpShoot 0.2 | 9.0 | 6.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 97.1 | 29 / 35 | 6173 |
| 2 | 1 | 66.9 | 77.1 | 20 / 35 | 5524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| lessonz.robocode.Oz 0.5.0 | 34 | 88% |
| tj.zombie1n 1.0.1 | 6 | 83% |
| gg.Wolverine 2.0 | 6 | 83% |
| jangs.ns51 1.0 | 5 | 100% |
| disan.Chair 2.2.0 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 100% |

Hadur died in 21 of 70 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lessonz.robocode.Oz 0.5.0 | 9 | 43% | 34 |
| cs.Grudge 1.0 | 7 | 33% | 8 |
| gg.Wolverine 2.0 | 2 | 10% | 7 |
| tj.zombie1n 1.0.1 | 2 | 10% | 4 |
| el.JumpShoot 0.2 | 1 | 5% | 2 |
| jangs.ns51 1.0 | 0 | 0% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 4 |
| disan.Chair 2.2.0 | 0 | 0% | 4 |
| rdm.Dueler 0.4x | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 58950 melee ticks, 16699 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 47 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 18696 sent, 17154 reached their opponent, 3443 virtual hits (20.1% of those reached).

## Melee bench: F40

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 19 over 2 battles (9.5 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.5 | 34 / 70 | 2.21 | 18.3% | 10022 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 18.3% | 34 |
| stelo.PastFuture 2.3.2 | 2.5 | 15.2% | 10 |
| bvh.fry.Freya 0.82 | 2.5 | 15.0% | 3 |
| emp.Yngwie 1.11 | 4.0 | 12.0% | 17 |
| jlm.javaDisturbance 0.59 | 5.0 | 10.5% | 6 |
| fm.mammillarias 1.3 | 6.0 | 8.5% | 0 |
| oa.weak.BotherBot 0.1 | 7.0 | 6.5% | 0 |
| stelo.PatternRobot 1.0 | 8.0 | 6.2% | 0 |
| amk.Punbot.Punbot 0.01 | 9.0 | 4.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 86.7 | 15 / 35 | 4756 |
| 2 | 1 | 68.8 | 86.3 | 19 / 35 | 5266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 14 | 100% |
| stelo.PastFuture 2.3.2 | 12 | 75% |
| emp.Yngwie 1.11 | 11 | 27% |
| jlm.javaDisturbance 0.59 | 9 | 78% |
| stelo.PatternRobot 1.0 | 1 | 100% |

Hadur died in 36 of 70 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 13 | 36% | 16 |
| stelo.PastFuture 2.3.2 | 9 | 25% | 24 |
| bvh.fry.Freya 0.82 | 7 | 19% | 19 |
| stelo.PatternRobot 1.0 | 3 | 8% | 4 |
| jlm.javaDisturbance 0.59 | 2 | 6% | 5 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 1 |
| fm.mammillarias 1.3 | 1 | 3% | 1 |

Posture (Hadur's M records, 70 rounds): 58588 melee ticks, 14083 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 35 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 18649 sent, 17050 reached their opponent, 3978 virtual hits (23.3% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 68.4% ± 4.1 | 66.9% ± 10.4 | +1.5 ± 14.5 |
| Survival | 86.5% ± 2.0 | 83.8% ± 32.3 | +2.7 ± 30.3 |
| Rounds won | 48.6% ± 72.6 | 42.9% ± 36.3 | +5.7 ± 36.3 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| stelo.PatternRobot 1.0 | 74.8% ± 2.1 | 70.9% ± 16.4 | +3.9 ± 18.4 |
| bvh.fry.Freya 0.82 | 55.1% ± 0.0 | 53.7% ± 4.3 | +1.4 ± 4.3 |
| fm.mammillarias 1.3 | 68.3% ± 15.5 | 67.4% ± 19.7 | +0.9 ± 35.2 |
| goblin.Bender 2.4 | 85.2% ± 4.1 | 85.6% ± 12.7 | -0.4 ± 16.8 |
| emp.Yngwie 1.11 | 60.6% ± 24.7 | 59.2% ± 1.8 | +1.4 ± 22.8 |
| oa.weak.BotherBot 0.1 | 73.9% ± 7.7 | 74.7% ± 8.6 | -0.8 ± 1.0 |
| stelo.PastFuture 2.3.2 | 54.8% ± 29.7 | 52.4% ± 37.1 | +2.4 ± 66.9 |
| jlm.javaDisturbance 0.59 | 63.5% ± 0.1 | 62.5% ± 14.5 | +1.0 ± 14.6 |
| amk.Punbot.Punbot 0.01 | 79.7% ± 23.5 | 75.9% ± 16.1 | +3.8 ± 7.4 |

## Melee bench: F40

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 15 over 2 battles (7.5 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 83.8 | 30 / 70 | 2.46 | 17.3% | 8769 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.5 | 17.3% | 30 |
| stelo.PastFuture 2.3.2 | 2.0 | 15.8% | 17 |
| bvh.fry.Freya 0.82 | 2.5 | 14.9% | 7 |
| emp.Yngwie 1.11 | 4.0 | 11.9% | 14 |
| jlm.javaDisturbance 0.59 | 5.0 | 10.4% | 1 |
| fm.mammillarias 1.3 | 6.0 | 8.4% | 0 |
| stelo.PatternRobot 1.0 | 7.0 | 7.1% | 1 |
| oa.weak.BotherBot 0.1 | 8.0 | 5.8% | 0 |
| amk.Punbot.Punbot 0.01 | 9.0 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 86.3 | 14 / 35 | 4670 |
| 2 | 2 | 66.1 | 81.3 | 16 / 35 | 4099 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 14 | 43% |
| stelo.PastFuture 2.3.2 | 13 | 77% |
| bvh.fry.Freya 0.82 | 13 | 69% |
| stelo.PatternRobot 1.0 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |
| jlm.javaDisturbance 0.59 | 1 | 100% |

Hadur died in 41 of 70 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 12 | 29% | 24 |
| emp.Yngwie 1.11 | 10 | 24% | 16 |
| stelo.PastFuture 2.3.2 | 9 | 22% | 17 |
| jlm.javaDisturbance 0.59 | 5 | 12% | 7 |
| fm.mammillarias 1.3 | 3 | 7% | 3 |
| stelo.PatternRobot 1.0 | 2 | 5% | 2 |
| goblin.Bender 2.4 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 59352 melee ticks, 12447 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 45 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 45 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 19237 sent, 17633 reached their opponent, 3736 virtual hits (21.2% of those reached).

## Melee bench: F41

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 24 over 2 battles (12.0 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 88.1 | 33 / 70 | 2.07 | 18.1% | 9196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 18.1% | 33 |
| gh.Griezel 0.5.2 | 2.0 | 14.3% | 12 |
| kid.Gladiator .7.2 | 3.0 | 13.5% | 9 |
| vuen.Cake 2.51 | 4.0 | 12.0% | 16 |
| ds.Oo 2.2 | 5.5 | 9.0% | 0 |
| lorneswork.Predator 1.0 | 6.0 | 9.0% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 6.5 | 8.5% | 0 |
| germ.TheMind .2 | 8.0 | 6.6% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 5.0% | 0 |
| tex.Longbot 0.4 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 87.3 | 17 / 35 | 4570 |
| 2 | 1 | 67.8 | 88.9 | 16 / 35 | 4626 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 28 | 64% |
| vuen.Cake 2.51 | 14 | 50% |
| kid.Gladiator .7.2 | 11 | 64% |
| germ.TheMind .2 | 1 | 100% |

Hadur died in 37 of 70 rounds, at a mean tick of 1281. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 13 | 35% | 28 |
| vuen.Cake 2.51 | 10 | 27% | 17 |
| kid.Gladiator .7.2 | 9 | 24% | 15 |
| lorneswork.Predator 1.0 | 2 | 5% | 4 |
| ds.Oo 2.2 | 1 | 3% | 2 |
| tex.Longbot 0.4 | 1 | 3% | 2 |
| germ.TheMind .2 | 1 | 3% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 62311 melee ticks, 24481 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 41 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 18655 sent, 17104 reached their opponent, 3090 virtual hits (18.1% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 67.6% ± 2.6 | 66.0% ± 13.9 | +1.5 ± 16.6 |
| Survival | 88.1% ± 10.1 | 84.8% ± 28.2 | +3.3 ± 38.3 |
| Rounds won | 47.1% ± 18.2 | 40.0% ± 0.0 | +7.1 ± 18.2 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 55.8% ± 0.4 | 51.5% ± 11.6 | +4.3 ± 11.2 |
| ds.Oo 2.2 | 66.8% ± 2.5 | 64.2% ± 27.2 | +2.6 ± 24.7 |
| lorneswork.Predator 1.0 | 66.8% ± 36.7 | 66.7% ± 0.3 | +0.2 ± 37.0 |
| kid.Gladiator .7.2 | 57.2% ± 6.3 | 55.3% ± 24.6 | +1.9 ± 18.3 |
| tex.Longbot 0.4 | 81.6% ± 3.4 | 82.1% ± 15.2 | -0.5 ± 18.6 |
| Lo_Ian.Gandalf_V4 4.0 | 67.9% ± 6.5 | 66.0% ± 5.8 | +1.9 ± 0.6 |
| vuen.Cake 2.51 | 60.2% ± 6.4 | 58.7% ± 15.0 | +1.5 ± 8.6 |
| pbg.NinjaX 1.2 | 78.5% ± 35.4 | 78.8% ± 41.6 | -0.3 ± 6.2 |
| germ.TheMind .2 | 73.3% ± 28.0 | 71.0% ± 4.2 | +2.3 ± 23.8 |

## Melee bench: F41

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 15 over 2 battles (7.5 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 84.8 | 28 / 70 | 2.37 | 16.9% | 8339 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.0 | 16.9% | 28 |
| gh.Griezel 0.5.2 | 2.0 | 15.9% | 23 |
| kid.Gladiator .7.2 | 3.0 | 13.6% | 7 |
| vuen.Cake 2.51 | 4.0 | 11.9% | 9 |
| Lo_Ian.Gandalf_V4 4.0 | 5.5 | 8.7% | 0 |
| ds.Oo 2.2 | 5.5 | 9.4% | 3 |
| lorneswork.Predator 1.0 | 7.0 | 8.4% | 0 |
| germ.TheMind .2 | 8.0 | 6.9% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.5% | 0 |
| tex.Longbot 0.4 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 87.0 | 14 / 35 | 4442 |
| 2 | 1 | 64.9 | 82.5 | 14 / 35 | 3897 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 27 | 63% |
| vuen.Cake 2.51 | 6 | 83% |
| kid.Gladiator .7.2 | 6 | 83% |
| ds.Oo 2.2 | 1 | 0% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 42 of 70 rounds, at a mean tick of 1103. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 23 | 55% | 39 |
| kid.Gladiator .7.2 | 8 | 19% | 13 |
| ds.Oo 2.2 | 5 | 12% | 7 |
| vuen.Cake 2.51 | 3 | 7% | 7 |
| lorneswork.Predator 1.0 | 2 | 5% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 2 |

Posture (Hadur's M records, 69 rounds): 59902 melee ticks, 17534 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (69 rounds): longest scan gap while four or more were alive 33 ticks (69 rounds over 8); rounds whose longest gap at any count was over 8: 69; robots dropped as dead without a death event: 0.

Targeting waves (69 rounds): 17839 sent, 16362 reached their opponent, 2804 virtual hits (17.1% of those reached).

## Melee bench: F42

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 21 over 2 battles (10.5 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 81.3 | 26 / 70 | 2.69 | 16.3% | 7831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.5 | 16.1% | 24 |
| hadur2.Hadur 3.13gk | 1.5 | 16.3% | 26 |
| gh.micro.Gruweltje 0.7 | 3.0 | 13.4% | 10 |
| alpha.RainingFire 1.0 | 4.0 | 11.4% | 3 |
| wee.Gem 1.8.4 | 5.5 | 9.3% | 3 |
| pfvicm.Sobieski 7.2.3b | 6.5 | 9.2% | 2 |
| stelo.Wang 1.0 | 7.0 | 7.9% | 1 |
| bayen.UbaMicro 1.4 | 7.0 | 7.8% | 1 |
| lrem.micro.MoggFanatic 0.2 | 9.0 | 4.7% | 0 |
| ap.Frederick 1.1 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 77.1 | 11 / 35 | 3815 |
| 2 | 1 | 66.3 | 85.4 | 15 / 35 | 4016 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 24 | 38% |
| gh.micro.Gruweltje 0.7 | 9 | 56% |
| alpha.RainingFire 1.0 | 5 | 80% |
| stelo.Wang 1.0 | 3 | 100% |
| bayen.UbaMicro 1.4 | 2 | 100% |
| wee.Gem 1.8.4 | 2 | 100% |
| pfvicm.Sobieski 7.2.3b | 1 | 100% |

Hadur died in 45 of 70 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 19 | 42% | 28 |
| gh.micro.Gruweltje 0.7 | 9 | 20% | 16 |
| alpha.RainingFire 1.0 | 6 | 13% | 11 |
| pfvicm.Sobieski 7.2.3b | 5 | 11% | 5 |
| stelo.Wang 1.0 | 3 | 7% | 4 |
| lrem.micro.MoggFanatic 0.2 | 2 | 4% | 2 |
| bayen.UbaMicro 1.4 | 1 | 2% | 2 |
| wee.Gem 1.8.4 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 43801 melee ticks, 14653 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 24 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 14853 sent, 13366 reached their opponent, 2710 virtual hits (20.3% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 64.9% ± 17.2 | 65.0% ± 24.9 | -0.1 ± 7.8 |
| Survival | 81.3% ± 52.4 | 83.7% ± 62.5 | -2.4 ± 10.1 |
| Rounds won | 37.1% ± 72.6 | 42.9% ± 72.6 | -5.7 ± 0.0 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 54.8% ± 1.8 | 59.2% ± 1.7 | -4.4 ± 3.6 |
| alpha.RainingFire 1.0 | 58.9% ± 6.3 | 57.3% ± 26.9 | +1.5 ± 20.5 |
| bayen.UbaMicro 1.4 | 67.6% ± 0.7 | 69.6% ± 15.8 | -2.0 ± 15.1 |
| wee.Gem 1.8.4 | 63.5% ± 4.2 | 62.3% ± 19.8 | +1.2 ± 15.6 |
| kawigi.sbf.FloodHT 0.9.2 | 50.2% ± 23.3 | 50.9% ± 4.0 | -0.7 ± 19.3 |
| lrem.micro.MoggFanatic 0.2 | 77.5% ± 45.0 | 74.1% ± 10.1 | +3.4 ± 34.9 |
| ap.Frederick 1.1 | 80.8% ± 15.6 | 76.9% ± 1.5 | +4.0 ± 17.1 |
| pfvicm.Sobieski 7.2.3b | 64.0% ± 50.4 | 66.6% ± 77.3 | -2.6 ± 26.8 |
| stelo.Wang 1.0 | 67.2% ± 7.0 | 68.3% ± 73.8 | -1.2 ± 66.9 |

## Melee bench: F42

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 20 over 2 battles (10.0 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 83.7 | 30 / 70 | 2.47 | 16.5% | 7427 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.0 | 16.5% | 30 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.9% | 23 |
| alpha.RainingFire 1.0 | 3.5 | 12.3% | 6 |
| gh.micro.Gruweltje 0.7 | 3.5 | 11.4% | 4 |
| wee.Gem 1.8.4 | 5.5 | 9.9% | 2 |
| pfvicm.Sobieski 7.2.3b | 6.0 | 8.3% | 2 |
| bayen.UbaMicro 1.4 | 7.0 | 7.2% | 0 |
| stelo.Wang 1.0 | 7.5 | 7.7% | 3 |
| lrem.micro.MoggFanatic 0.2 | 9.0 | 5.8% | 0 |
| ap.Frederick 1.1 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 78.7 | 13 / 35 | 3415 |
| 2 | 1 | 67.0 | 88.6 | 17 / 35 | 4012 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 25 | 56% |
| gh.micro.Gruweltje 0.7 | 7 | 71% |
| alpha.RainingFire 1.0 | 4 | 50% |
| wee.Gem 1.8.4 | 4 | 75% |
| stelo.Wang 1.0 | 4 | 75% |
| ap.Frederick 1.1 | 3 | 100% |
| pfvicm.Sobieski 7.2.3b | 2 | 0% |

Hadur died in 40 of 70 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 14 | 35% | 29 |
| alpha.RainingFire 1.0 | 9 | 23% | 12 |
| gh.micro.Gruweltje 0.7 | 5 | 13% | 11 |
| pfvicm.Sobieski 7.2.3b | 5 | 13% | 5 |
| wee.Gem 1.8.4 | 3 | 8% | 7 |
| stelo.Wang 1.0 | 2 | 5% | 4 |
| bayen.UbaMicro 1.4 | 2 | 5% | 2 |

Posture (Hadur's M records, 70 rounds): 45092 melee ticks, 15966 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 16 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 15 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 15282 sent, 13828 reached their opponent, 2578 virtual hits (18.6% of those reached).

## Melee bench: F43

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 21 over 2 battles (10.5 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 81.3 | 23 / 70 | 2.69 | 15.9% | 6971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.0 | 15.9% | 23 |
| rz.GlowBlowMelee 1.4 | 2.0 | 14.9% | 17 |
| dummy.mini.Scimitar 1.01 | 3.0 | 12.4% | 6 |
| ne.Chimera 1.2 | 4.0 | 11.1% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 5.5 | 10.3% | 13 |
| pedersen.Grishnakh 1.0 | 6.0 | 9.4% | 6 |
| sigterm.Sigterm 1.0 | 7.0 | 8.3% | 3 |
| js.PinBall 1.6 | 7.5 | 8.2% | 0 |
| step.nanoPri 1.0 | 9.0 | 6.0% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 80.0 | 10 / 35 | 3598 |
| 2 | 1 | 64.5 | 82.5 | 13 / 35 | 3373 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 14 | 36% |
| fowl3628800.LightningBolt 2.6.0 | 8 | 63% |
| pedersen.Grishnakh 1.0 | 4 | 75% |
| dummy.mini.Scimitar 1.01 | 4 | 100% |
| ne.Chimera 1.2 | 4 | 75% |
| sigterm.Sigterm 1.0 | 3 | 33% |
| js.PinBall 1.6 | 2 | 100% |

Hadur died in 47 of 70 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 15 | 32% | 23 |
| fowl3628800.LightningBolt 2.6.0 | 10 | 21% | 12 |
| dummy.mini.Scimitar 1.01 | 6 | 13% | 9 |
| ne.Chimera 1.2 | 5 | 11% | 9 |
| pedersen.Grishnakh 1.0 | 4 | 9% | 6 |
| sigterm.Sigterm 1.0 | 4 | 9% | 5 |
| step.nanoPri 1.0 | 2 | 4% | 2 |
| js.PinBall 1.6 | 1 | 2% | 4 |

Posture (Hadur's M records, 70 rounds): 51687 melee ticks, 13311 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 31 ticks (69 rounds over 8); rounds whose longest gap at any count was over 8: 69; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 17180 sent, 15562 reached their opponent, 2013 virtual hits (12.9% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 64.0% ± 5.5 | 61.8% ± 6.9 | +2.2 ± 1.4 |
| Survival | 81.3% ± 16.1 | 77.0% ± 10.1 | +4.3 ± 6.1 |
| Rounds won | 32.9% ± 54.5 | 27.1% ± 54.5 | +5.7 ± 0.0 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| js.PinBall 1.6 | 65.9% ± 6.1 | 60.3% ± 0.4 | +5.6 ± 6.5 |
| rz.GlowBlowMelee 1.4 | 51.6% ± 4.2 | 50.2% ± 24.1 | +1.3 ± 28.3 |
| pedersen.Grishnakh 1.0 | 62.9% ± 32.3 | 54.4% ± 5.2 | +8.5 ± 27.0 |
| fowl3628800.LightningBolt 2.6.0 | 60.7% ± 1.5 | 62.0% ± 60.2 | -1.3 ± 58.6 |
| GarmBox.Anger 1.0 | 81.9% ± 30.0 | 81.4% ± 18.0 | +0.5 ± 12.0 |
| ne.Chimera 1.2 | 58.9% ± 8.0 | 60.7% ± 34.1 | -1.8 ± 42.1 |
| sigterm.Sigterm 1.0 | 65.8% ± 8.0 | 63.9% ± 12.0 | +1.9 ± 3.9 |
| step.nanoPri 1.0 | 72.5% ± 8.9 | 68.8% ± 35.8 | +3.7 ± 44.7 |
| dummy.mini.Scimitar 1.01 | 56.2% ± 11.3 | 54.7% ± 17.3 | +1.5 ± 6.0 |

## Melee bench: F43

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 10 over 2 battles (5.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 77.0 | 19 / 70 | 3.07 | 14.6% | 6119 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.5 | 14.5% | 11 |
| hadur2.Hadur 3.13 | 1.5 | 14.6% | 19 |
| dummy.mini.Scimitar 1.01 | 3.5 | 12.1% | 5 |
| pedersen.Grishnakh 1.0 | 3.5 | 12.2% | 14 |
| js.PinBall 1.6 | 6.0 | 9.6% | 4 |
| ne.Chimera 1.2 | 6.5 | 9.5% | 5 |
| sigterm.Sigterm 1.0 | 7.0 | 8.3% | 3 |
| fowl3628800.LightningBolt 2.6.0 | 7.0 | 9.1% | 8 |
| step.nanoPri 1.0 | 8.5 | 6.6% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 76.2 | 8 / 35 | 2990 |
| 2 | 1 | 62.4 | 77.8 | 11 / 35 | 3129 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 10 | 50% |
| pedersen.Grishnakh 1.0 | 7 | 29% |
| fowl3628800.LightningBolt 2.6.0 | 7 | 57% |
| dummy.mini.Scimitar 1.01 | 5 | 60% |
| js.PinBall 1.6 | 3 | 67% |
| ne.Chimera 1.2 | 3 | 33% |
| sigterm.Sigterm 1.0 | 2 | 100% |

Hadur died in 51 of 70 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 15 | 29% | 21 |
| pedersen.Grishnakh 1.0 | 9 | 18% | 11 |
| fowl3628800.LightningBolt 2.6.0 | 7 | 14% | 11 |
| dummy.mini.Scimitar 1.01 | 6 | 12% | 9 |
| js.PinBall 1.6 | 4 | 8% | 6 |
| ne.Chimera 1.2 | 4 | 8% | 5 |
| step.nanoPri 1.0 | 4 | 8% | 4 |
| sigterm.Sigterm 1.0 | 2 | 4% | 3 |

Posture (Hadur's M records, 68 rounds): 47122 melee ticks, 9738 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (68 rounds): longest scan gap while four or more were alive 39 ticks (68 rounds over 8); rounds whose longest gap at any count was over 8: 68; robots dropped as dead without a death event: 0.

Targeting waves (68 rounds): 15941 sent, 14482 reached their opponent, 1719 virtual hits (11.9% of those reached).

## Melee bench: F44

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 9 over 2 battles (4.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 81.3 | 13 / 70 | 2.69 | 15.6% | 7537 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.3% | 51 |
| hadur2.Hadur 3.13gk | 2.0 | 15.6% | 13 |
| mk.Alpha 0.2.1 | 3.0 | 13.5% | 5 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 4.5 | 11.2% | 1 |
| bzdp.Pansy 2.1 | 4.5 | 10.7% | 0 |
| winamp32.micro.MicroMacro 1.0 | 6.5 | 7.4% | 0 |
| stf.PanzerGeneral 0.1 | 6.5 | 7.0% | 0 |
| stelo.IntrinsicVolatility 1.4 | 8.0 | 6.4% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.5% | 0 |
| mb.Beast 0.1 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 79.4 | 5 / 35 | 3794 |
| 2 | 2 | 65.7 | 83.2 | 8 / 35 | 3743 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 31 | 23% |
| mk.Alpha 0.2.1 | 6 | 50% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2 | 100% |
| bzdp.Pansy 2.1 | 1 | 100% |

Hadur died in 57 of 70 rounds, at a mean tick of 1010. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 39 | 68% | 47 |
| mk.Alpha 0.2.1 | 10 | 18% | 12 |
| bzdp.Pansy 2.1 | 3 | 5% | 4 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2 | 4% | 4 |
| stelo.IntrinsicVolatility 1.4 | 2 | 4% | 2 |
| stf.PanzerGeneral 0.1 | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 53982 melee ticks, 19012 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 31 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 17501 sent, 15984 reached their opponent, 2423 virtual hits (15.2% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 65.1% ± 6.9 | 65.1% ± 6.7 | +0.0 ± 13.6 |
| Survival | 81.3% ± 24.2 | 83.3% ± 18.2 | -2.1 ± 42.4 |
| Rounds won | 18.6% ± 54.5 | 17.1% ± 72.6 | +1.4 ± 127.1 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| stelo.IntrinsicVolatility 1.4 | 70.9% ± 1.5 | 70.1% ± 19.2 | +0.8 ± 20.7 |
| Queens_teamrobot.UltraRazor 1.0 | 77.5% ± 1.3 | 79.1% ± 4.3 | -1.6 ± 3.0 |
| jk.melee.Neuromancer 7.12 | 42.4% ± 21.5 | 43.1% ± 29.3 | -0.7 ± 50.8 |
| stf.PanzerGeneral 0.1 | 69.2% ± 3.8 | 70.1% ± 9.6 | -0.9 ± 5.8 |
| mk.Alpha 0.2.1 | 53.6% ± 3.0 | 53.4% ± 19.8 | +0.2 ± 22.8 |
| bzdp.Pansy 2.1 | 59.3% ± 9.3 | 61.4% ± 11.1 | -2.0 ± 1.8 |
| winamp32.micro.MicroMacro 1.0 | 68.0% ± 22.1 | 66.1% ± 25.4 | +1.9 ± 3.4 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 58.4% ± 6.9 | 58.0% ± 10.2 | +0.4 ± 3.3 |
| mb.Beast 0.1 | 86.8% ± 21.3 | 84.8% ± 3.1 | +2.0 ± 24.4 |

## Melee bench: F44

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 9 over 2 battles (4.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 83.3 | 12 / 70 | 2.50 | 15.7% | 7202 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.8% | 49 |
| hadur2.Hadur 3.13 | 2.0 | 15.7% | 12 |
| mk.Alpha 0.2.1 | 3.0 | 13.7% | 4 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 4.0 | 11.4% | 3 |
| bzdp.Pansy 2.1 | 5.0 | 9.9% | 1 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.1% | 1 |
| stf.PanzerGeneral 0.1 | 7.5 | 6.7% | 0 |
| stelo.IntrinsicVolatility 1.4 | 7.5 | 6.7% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.1% | 0 |
| mb.Beast 0.1 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 84.8 | 8 / 35 | 3703 |
| 2 | 2 | 64.6 | 81.9 | 4 / 35 | 3499 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 28 | 14% |
| mk.Alpha 0.2.1 | 5 | 80% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 5 | 40% |
| winamp32.micro.MicroMacro 1.0 | 2 | 100% |
| bzdp.Pansy 2.1 | 1 | 0% |

Hadur died in 58 of 70 rounds, at a mean tick of 1005. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 39 | 67% | 43 |
| mk.Alpha 0.2.1 | 10 | 17% | 13 |
| bzdp.Pansy 2.1 | 4 | 7% | 4 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3 | 5% | 7 |
| winamp32.micro.MicroMacro 1.0 | 1 | 2% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 56684 melee ticks, 17081 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 22 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 22 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 18014 sent, 16505 reached their opponent, 2431 virtual hits (14.7% of those reached).

## Melee bench: F45

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 16 over 2 battles (8.0 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 82.5 | 13 / 70 | 2.57 | 16.4% | 8910 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.0 | 20.3% | 47 |
| hadur2.Hadur 3.13gk | 2.0 | 16.4% | 13 |
| ms.Ares 0.19 | 3.0 | 12.5% | 4 |
| sul.Lunar 1.1 | 4.0 | 9.7% | 1 |
| mld.Wisdom 1.0 | 5.0 | 8.6% | 0 |
| KiraNL.Chupacabra 0.4 | 6.0 | 8.0% | 0 |
| Noran.BitchingElk 0.054 | 7.0 | 7.9% | 4 |
| spinnercat.Robovirus 2.718 | 8.0 | 6.4% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.8% | 1 |
| gh.mini.GrubbmOne 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 84.8 | 7 / 35 | 4714 |
| 2 | 2 | 64.6 | 80.3 | 6 / 35 | 4196 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 33 | 6% |
| sul.Lunar 1.1 | 5 | 100% |
| Noran.BitchingElk 0.054 | 5 | 20% |
| ms.Ares 0.19 | 4 | 75% |
| divineomega.TrialBot 0.003 | 2 | 50% |
| spinnercat.Robovirus 2.718 | 1 | 100% |

Hadur died in 57 of 70 rounds, at a mean tick of 1141. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 38 | 67% | 41 |
| ms.Ares 0.19 | 6 | 11% | 9 |
| Noran.BitchingElk 0.054 | 5 | 9% | 6 |
| divineomega.TrialBot 0.003 | 3 | 5% | 4 |
| mld.Wisdom 1.0 | 3 | 5% | 3 |
| KiraNL.Chupacabra 0.4 | 2 | 4% | 2 |
| sul.Lunar 1.1 | 0 | 0% | 4 |
| spinnercat.Robovirus 2.718 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 53698 melee ticks, 27332 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 32 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 17386 sent, 15846 reached their opponent, 3192 virtual hits (20.1% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 65.5% ± 10.7 | 63.6% ± 5.5 | +1.9 ± 5.2 |
| Survival | 82.5% ± 28.2 | 77.1% ± 20.2 | +5.4 ± 8.1 |
| Rounds won | 18.6% ± 18.2 | 20.0% ± 36.3 | -1.4 ± 18.2 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| spinnercat.Robovirus 2.718 | 71.8% ± 14.5 | 68.6% ± 4.3 | +3.2 ± 18.8 |
| divineomega.TrialBot 0.003 | 74.0% ± 7.6 | 73.4% ± 7.7 | +0.6 ± 0.1 |
| Noran.BitchingElk 0.054 | 67.4% ± 20.8 | 63.1% ± 25.2 | +4.3 ± 4.4 |
| gh.mini.GrubbmOne 1.0 | 79.3% ± 23.7 | 78.9% ± 22.6 | +0.4 ± 46.2 |
| KiraNL.Chupacabra 0.4 | 67.1% ± 21.4 | 65.5% ± 14.5 | +1.7 ± 6.9 |
| ms.Ares 0.19 | 56.7% ± 2.9 | 57.8% ± 26.2 | -1.0 ± 23.3 |
| rsalesc.melee.Medina 0.4.5 | 44.7% ± 13.3 | 42.8% ± 8.2 | +1.9 ± 5.1 |
| sul.Lunar 1.1 | 62.7% ± 30.3 | 61.2% ± 8.6 | +1.6 ± 38.9 |
| mld.Wisdom 1.0 | 65.6% ± 24.8 | 61.3% ± 26.6 | +4.3 ± 51.4 |

## Melee bench: F45

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 25 over 2 battles (12.5 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 77.1 | 14 / 70 | 3.06 | 15.3% | 8245 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.0 | 20.4% | 44 |
| hadur2.Hadur 3.13 | 2.0 | 15.3% | 14 |
| ms.Ares 0.19 | 3.5 | 11.2% | 4 |
| mld.Wisdom 1.0 | 4.5 | 9.7% | 0 |
| sul.Lunar 1.1 | 5.0 | 9.7% | 2 |
| Noran.BitchingElk 0.054 | 5.0 | 9.0% | 5 |
| KiraNL.Chupacabra 0.4 | 7.0 | 8.1% | 1 |
| spinnercat.Robovirus 2.718 | 8.0 | 7.0% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.5% | 0 |
| gh.mini.GrubbmOne 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 78.7 | 8 / 35 | 4083 |
| 2 | 2 | 63.2 | 75.6 | 6 / 35 | 4162 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 31 | 19% |
| ms.Ares 0.19 | 5 | 100% |
| sul.Lunar 1.1 | 2 | 100% |
| Noran.BitchingElk 0.054 | 2 | 0% |
| mld.Wisdom 1.0 | 1 | 100% |

Hadur died in 56 of 70 rounds, at a mean tick of 1046. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 35 | 63% | 41 |
| ms.Ares 0.19 | 10 | 18% | 15 |
| mld.Wisdom 1.0 | 3 | 5% | 5 |
| divineomega.TrialBot 0.003 | 3 | 5% | 3 |
| Noran.BitchingElk 0.054 | 2 | 4% | 1 |
| sul.Lunar 1.1 | 1 | 2% | 3 |
| spinnercat.Robovirus 2.718 | 1 | 2% | 1 |
| KiraNL.Chupacabra 0.4 | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 56441 melee ticks, 21462 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 55 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 17709 sent, 16184 reached their opponent, 2929 virtual hits (18.1% of those reached).

## Melee bench: F46

hadur2.Hadur 3.13gk against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v139, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 16 over 2 battles (8.0 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 76.5 | 18 / 70 | 3.11 | 14.5% | 5885 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13gk | 1.5 | 14.5% | 18 |
| ags.Glacier 0.2.11 | 2.0 | 15.3% | 15 |
| pe.SandboxDT 2.71m | 2.5 | 13.8% | 13 |
| eem.EvBotNG v12.8 | 4.0 | 13.6% | 17 |
| davidalves.net.DuelistMiniMelee 1.2 | 5.0 | 12.2% | 4 |
| DTF.Kludgy 1.2b | 6.0 | 10.0% | 1 |
| dft.Calliope 5.6 | 7.0 | 7.2% | 1 |
| joe.ADinosaur 1.0 | 8.0 | 5.6% | 0 |
| adt.Ar1 2.1 | 9.0 | 4.5% | 1 |
| evd.X1 0.01 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 81.6 | 11 / 35 | 3091 |
| 2 | 2 | 60.3 | 71.4 | 7 / 35 | 2794 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 11 | 64% |
| eem.EvBotNG v12.8 | 10 | 50% |
| davidalves.net.DuelistMiniMelee 1.2 | 4 | 50% |
| pe.SandboxDT 2.71m | 3 | 33% |
| dft.Calliope 5.6 | 2 | 100% |
| DTF.Kludgy 1.2b | 2 | 50% |

Hadur died in 52 of 70 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 15 | 29% | 21 |
| eem.EvBotNG v12.8 | 11 | 21% | 15 |
| pe.SandboxDT 2.71m | 11 | 21% | 14 |
| davidalves.net.DuelistMiniMelee 1.2 | 5 | 10% | 8 |
| DTF.Kludgy 1.2b | 5 | 10% | 6 |
| dft.Calliope 5.6 | 2 | 4% | 3 |
| adt.Ar1 2.1 | 2 | 4% | 2 |
| joe.ADinosaur 1.0 | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 49473 melee ticks, 11335 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 51 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 15981 sent, 14473 reached their opponent, 1921 virtual hits (13.3% of those reached).

## Paired A/B: hadur2.Hadur 3.13gk vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 2 of 2, baseline 2 of 2, 2 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 62.4% ± 26.3 | 62.0% ± 6.6 | +0.3 ± 19.7 |
| Survival | 76.5% ± 64.5 | 77.0% ± 14.1 | -0.5 ± 50.4 |
| Rounds won | 25.7% ± 72.6 | 21.4% ± 18.2 | +4.3 ± 90.8 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 51.2% ± 12.0 | 51.8% ± 19.0 | -0.6 ± 7.1 |
| davidalves.net.DuelistMiniMelee 1.2 | 54.2% ± 32.5 | 54.5% ± 20.2 | -0.3 ± 52.7 |
| eem.EvBotNG v12.8 | 51.5% ± 9.1 | 51.7% ± 3.7 | -0.2 ± 12.7 |
| ags.Glacier 0.2.11 | 48.6% ± 46.0 | 49.1% ± 16.8 | -0.5 ± 29.2 |
| joe.ADinosaur 1.0 | 72.0% ± 42.9 | 73.4% ± 25.0 | -1.5 ± 18.0 |
| dft.Calliope 5.6 | 66.9% ± 56.7 | 62.3% ± 9.1 | +4.6 ± 47.6 |
| evd.X1 0.01 | 81.5% ± 31.3 | 81.2% ± 25.5 | +0.3 ± 5.8 |
| DTF.Kludgy 1.2b | 59.3% ± 11.8 | 60.6% ± 23.0 | -1.4 ± 34.8 |
| adt.Ar1 2.1 | 76.3% ± 18.0 | 73.7% ± 35.3 | +2.6 ± 53.3 |

## Melee bench: F46

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

Skipped turns: 9 over 2 battles (4.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 77.0 | 15 / 70 | 3.07 | 14.4% | 5770 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 1.5 | 14.4% | 15 |
| ags.Glacier 0.2.11 | 1.5 | 14.9% | 12 |
| eem.EvBotNG v12.8 | 3.5 | 13.4% | 18 |
| pe.SandboxDT 2.71m | 4.0 | 13.4% | 17 |
| davidalves.net.DuelistMiniMelee 1.2 | 4.5 | 12.1% | 4 |
| DTF.Kludgy 1.2b | 6.0 | 9.4% | 3 |
| dft.Calliope 5.6 | 7.0 | 8.7% | 1 |
| adt.Ar1 2.1 | 8.5 | 5.2% | 0 |
| joe.ADinosaur 1.0 | 8.5 | 5.2% | 0 |
| evd.X1 0.01 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 78.1 | 7 / 35 | 3042 |
| 2 | 2 | 61.5 | 75.9 | 8 / 35 | 2728 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 10 | 20% |
| pe.SandboxDT 2.71m | 7 | 43% |
| ags.Glacier 0.2.11 | 5 | 40% |
| davidalves.net.DuelistMiniMelee 1.2 | 3 | 100% |
| DTF.Kludgy 1.2b | 3 | 100% |
| dft.Calliope 5.6 | 2 | 100% |

Hadur died in 55 of 70 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 17 | 31% | 20 |
| eem.EvBotNG v12.8 | 15 | 27% | 18 |
| pe.SandboxDT 2.71m | 10 | 18% | 13 |
| davidalves.net.DuelistMiniMelee 1.2 | 6 | 11% | 8 |
| DTF.Kludgy 1.2b | 4 | 7% | 6 |
| dft.Calliope 5.6 | 2 | 4% | 4 |
| joe.ADinosaur 1.0 | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 48199 melee ticks, 12106 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 39 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 16141 sent, 14597 reached their opponent, 1866 virtual hits (12.8% of those reached).

