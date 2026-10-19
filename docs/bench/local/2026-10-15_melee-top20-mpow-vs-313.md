# Bench suite: melee-top20.txt

## Melee bench: A

hadur2.Hadur 3.13mw against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 5 over 3 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 51.6 | 56.1 | 1 / 105 | 4.95 | 10.3% | 6892 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.3 | 14.2% | 34 |
| aaa.r.ScalarR 0.005g.047 | 1.7 | 14.0% | 32 |
| ags.Glacier 0.2.11 | 4.0 | 10.5% | 7 |
| hadur2.Hadur 3.13mw | 4.0 | 10.3% | 1 |
| justin.Mallais 14.0 | 6.0 | 9.2% | 5 |
| catcat20.Matcha 0.006 | 6.3 | 9.5% | 9 |
| positive.Portia 1.26e | 6.7 | 9.2% | 6 |
| wompi.Wallaby 5.1 | 7.7 | 8.4% | 4 |
| rsalesc.melee.Medina 0.4.5 | 7.7 | 8.4% | 6 |
| stelo.PastFuture 2.3.2 | 9.7 | 6.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 49.8 | 53.0 | 0 / 35 | 2233 |
| 2 | 3 | 52.9 | 57.8 | 0 / 35 | 2530 |
| 3 | 4 | 52.0 | 57.5 | 1 / 35 | 2129 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 3 | 0% |
| aaa.r.ScalarR 0.005g.047 | 3 | 0% |
| ags.Glacier 0.2.11 | 2 | 0% |
| catcat20.Matcha 0.006 | 2 | 0% |
| justin.Mallais 14.0 | 2 | 0% |
| wompi.Wallaby 5.1 | 1 | 100% |

Hadur died in 104 of 105 rounds, at a mean tick of 579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 21 | 20% | 21 |
| aaa.r.ScalarR 0.005g.047 | 18 | 17% | 18 |
| justin.Mallais 14.0 | 17 | 16% | 17 |
| rsalesc.melee.Medina 0.4.5 | 11 | 11% | 11 |
| ags.Glacier 0.2.11 | 11 | 11% | 11 |
| catcat20.Matcha 0.006 | 10 | 10% | 10 |
| stelo.PastFuture 2.3.2 | 7 | 7% | 7 |
| wompi.Wallaby 5.1 | 5 | 5% | 5 |
| positive.Portia 1.26e | 4 | 4% | 5 |

Posture (Hadur's M records, 105 rounds): 57701 melee ticks, 3517 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 39 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 20569 sent, 17856 reached their opponent, 2095 virtual hits (11.7% of those reached).

## Paired A/B: hadur2.Hadur 3.13mw vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 3 of 3, baseline 3 of 3, 3 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 51.6% ± 3.9 | 53.2% ± 7.4 | -1.6 ± 3.5 |
| Survival | 56.1% ± 6.6 | 62.2% ± 14.5 | -6.1 ± 8.3 |
| Rounds won | 1.0% ± 4.1 | 5.7% ± 7.1 | -4.8 ± 4.1 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 42.3% ± 3.0 | 43.8% ± 11.5 | -1.6 ± 9.4 |
| jk.melee.Neuromancer 7.12 | 42.0% ± 2.9 | 40.8% ± 7.9 | +1.2 ± 5.1 |
| positive.Portia 1.26e | 52.7% ± 3.9 | 53.6% ± 7.6 | -0.8 ± 3.7 |
| ags.Glacier 0.2.11 | 49.6% ± 10.3 | 52.6% ± 7.5 | -2.9 ± 6.3 |
| rsalesc.melee.Medina 0.4.5 | 55.0% ± 2.1 | 55.0% ± 8.0 | -0.1 ± 10.1 |
| catcat20.Matcha 0.006 | 52.1% ± 4.7 | 56.8% ± 8.2 | -4.7 ± 7.2 |
| justin.Mallais 14.0 | 52.8% ± 7.7 | 53.1% ± 13.0 | -0.4 ± 5.5 |
| wompi.Wallaby 5.1 | 55.1% ± 14.0 | 59.1% ± 6.5 | -4.0 ± 8.0 |
| stelo.PastFuture 2.3.2 | 62.5% ± 11.1 | 63.9% ± 5.7 | -1.5 ± 12.0 |

## Melee bench: A

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

Skipped turns: 14 over 3 battles (4.7 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.2 | 62.2 | 6 / 105 | 4.40 | 10.9% | 5595 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 15.7% | 39 |
| aaa.r.ScalarR 0.005g.047 | 2.0 | 13.9% | 29 |
| hadur2.Hadur 3.13 | 3.7 | 10.9% | 6 |
| ags.Glacier 0.2.11 | 4.7 | 9.8% | 2 |
| positive.Portia 1.26e | 5.3 | 9.4% | 7 |
| justin.Mallais 14.0 | 6.0 | 9.6% | 4 |
| rsalesc.melee.Medina 0.4.5 | 6.3 | 8.9% | 6 |
| catcat20.Matcha 0.006 | 7.3 | 8.3% | 8 |
| wompi.Wallaby 5.1 | 8.7 | 7.5% | 1 |
| stelo.PastFuture 2.3.2 | 10.0 | 6.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 50.1 | 55.9 | 1 / 35 | 1606 |
| 2 | 3 | 56.0 | 67.3 | 2 / 35 | 2237 |
| 3 | 3 | 53.6 | 63.5 | 3 / 35 | 1752 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 7 | 0% |
| jk.melee.Neuromancer 7.12 | 6 | 17% |
| catcat20.Matcha 0.006 | 4 | 50% |
| justin.Mallais 14.0 | 3 | 33% |
| rsalesc.melee.Medina 0.4.5 | 1 | 0% |
| wompi.Wallaby 5.1 | 1 | 100% |
| ags.Glacier 0.2.11 | 1 | 100% |
| positive.Portia 1.26e | 1 | 0% |

Hadur died in 99 of 105 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 25 | 25% | 26 |
| aaa.r.ScalarR 0.005g.047 | 22 | 22% | 22 |
| catcat20.Matcha 0.006 | 11 | 11% | 13 |
| positive.Portia 1.26e | 10 | 10% | 10 |
| justin.Mallais 14.0 | 10 | 10% | 10 |
| wompi.Wallaby 5.1 | 6 | 6% | 8 |
| rsalesc.melee.Medina 0.4.5 | 6 | 6% | 6 |
| stelo.PastFuture 2.3.2 | 5 | 5% | 5 |
| ags.Glacier 0.2.11 | 4 | 4% | 5 |

Posture (Hadur's M records, 105 rounds): 64253 melee ticks, 6540 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 40 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 22878 sent, 20435 reached their opponent, 2681 virtual hits (13.1% of those reached).

## Melee bench: B

hadur2.Hadur 3.13mw against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 16 over 3 battles (5.3 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 51.8 | 54.3 | 7 / 105 | 5.11 | 10.3% | 7535 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.3 | 14.5% | 37 |
| justin.DemonicRage 3.4 | 1.7 | 12.8% | 17 |
| rz.Aleph 0.34 | 3.7 | 11.6% | 8 |
| abc.Shadow 3.84i | 4.3 | 11.2% | 13 |
| kc.mini.Mirage 0.2 | 4.3 | 11.5% | 9 |
| hadur2.Hadur 3.13mw | 5.7 | 10.3% | 7 |
| wompi.Wallaby 5.1 | 7.0 | 8.4% | 4 |
| stelo.Spread 0.9 | 8.0 | 7.5% | 8 |
| kc.micro.Figment 1.0 | 9.0 | 6.5% | 1 |
| stelo.PastFuture 2.3.2 | 10.0 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.7 | 59.0 | 4 / 35 | 2502 |
| 2 | 6 | 50.7 | 52.1 | 1 / 35 | 2423 |
| 3 | 6 | 51.0 | 51.7 | 2 / 35 | 2610 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 4 | 25% |
| stelo.Spread 0.9 | 3 | 33% |
| wompi.Wallaby 5.1 | 3 | 100% |
| justin.DemonicRage 3.4 | 2 | 50% |
| abc.Shadow 3.84i | 1 | 0% |
| rz.Aleph 0.34 | 1 | 100% |

Hadur died in 98 of 105 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 19 | 19% | 21 |
| justin.DemonicRage 3.4 | 18 | 18% | 20 |
| rz.Aleph 0.34 | 17 | 17% | 17 |
| kc.mini.Mirage 0.2 | 17 | 17% | 17 |
| abc.Shadow 3.84i | 13 | 13% | 14 |
| stelo.Spread 0.9 | 6 | 6% | 7 |
| kc.micro.Figment 1.0 | 4 | 4% | 4 |
| wompi.Wallaby 5.1 | 2 | 2% | 3 |
| stelo.PastFuture 2.3.2 | 2 | 2% | 2 |

Posture (Hadur's M records, 105 rounds): 59892 melee ticks, 2520 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 41 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 21308 sent, 18679 reached their opponent, 2130 virtual hits (11.4% of those reached).

## Paired A/B: hadur2.Hadur 3.13mw vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 3 of 3, baseline 3 of 3, 3 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 51.8% ± 4.2 | 50.1% ± 6.1 | +1.7 ± 10.1 |
| Survival | 54.3% ± 10.3 | 54.5% ± 12.7 | -0.2 ± 21.6 |
| Rounds won | 6.7% ± 10.8 | 4.8% ± 4.1 | +1.9 ± 14.8 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 41.6% ± 9.4 | 39.3% ± 11.3 | +2.3 ± 20.7 |
| justin.DemonicRage 3.4 | 44.6% ± 2.8 | 43.3% ± 6.0 | +1.3 ± 8.2 |
| abc.Shadow 3.84i | 47.8% ± 2.5 | 45.8% ± 7.9 | +2.1 ± 10.3 |
| kc.mini.Mirage 0.2 | 47.1% ± 6.5 | 45.1% ± 11.7 | +2.0 ± 15.8 |
| rz.Aleph 0.34 | 46.9% ± 5.6 | 46.4% ± 4.8 | +0.5 ± 10.4 |
| kc.micro.Figment 1.0 | 61.4% ± 2.6 | 60.7% ± 15.6 | +0.7 ± 17.0 |
| wompi.Wallaby 5.1 | 55.0% ± 8.1 | 53.4% ± 8.7 | +1.7 ± 15.6 |
| stelo.PastFuture 2.3.2 | 63.8% ± 3.4 | 61.2% ± 11.9 | +2.6 ± 8.5 |
| stelo.Spread 0.9 | 58.0% ± 6.2 | 55.9% ± 2.5 | +2.0 ± 8.2 |

## Melee bench: B

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

Skipped turns: 19 over 3 battles (6.3 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 50.1 | 54.5 | 5 / 105 | 5.10 | 9.6% | 5565 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.7 | 15.0% | 42 |
| justin.DemonicRage 3.4 | 1.7 | 12.6% | 16 |
| kc.mini.Mirage 0.2 | 3.7 | 11.8% | 12 |
| abc.Shadow 3.84i | 4.0 | 11.4% | 10 |
| rz.Aleph 0.34 | 4.3 | 11.1% | 10 |
| hadur2.Hadur 3.13 | 5.7 | 9.6% | 5 |
| wompi.Wallaby 5.1 | 7.7 | 8.4% | 3 |
| stelo.Spread 0.9 | 8.0 | 7.6% | 5 |
| kc.micro.Figment 1.0 | 9.0 | 6.3% | 1 |
| stelo.PastFuture 2.3.2 | 9.3 | 6.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 47.7 | 49.8 | 1 / 35 | 1682 |
| 2 | 5 | 52.7 | 60.0 | 2 / 35 | 2014 |
| 3 | 6 | 49.9 | 53.7 | 2 / 35 | 1869 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 4 | 0% |
| jk.melee.Neuromancer 7.12 | 2 | 0% |
| wompi.Wallaby 5.1 | 2 | 100% |
| rz.Aleph 0.34 | 2 | 50% |
| abc.Shadow 3.84i | 2 | 50% |
| kc.mini.Mirage 0.2 | 1 | 100% |

Hadur died in 100 of 105 rounds, at a mean tick of 588. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 21 | 21% | 21 |
| justin.DemonicRage 3.4 | 21 | 21% | 21 |
| kc.mini.Mirage 0.2 | 20 | 20% | 20 |
| rz.Aleph 0.34 | 15 | 15% | 16 |
| abc.Shadow 3.84i | 8 | 8% | 9 |
| wompi.Wallaby 5.1 | 6 | 6% | 9 |
| kc.micro.Figment 1.0 | 5 | 5% | 5 |
| stelo.PastFuture 2.3.2 | 3 | 3% | 3 |
| stelo.Spread 0.9 | 1 | 1% | 1 |

Posture (Hadur's M records, 105 rounds): 60559 melee ticks, 4073 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 66 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 22008 sent, 19716 reached their opponent, 2603 virtual hits (13.2% of those reached).

## Melee bench: C

hadur2.Hadur 3.13mw against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 8 over 3 battles (2.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 49.5 | 51.2 | 3 / 105 | 5.39 | 9.6% | 7036 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.3 | 14.2% | 27 |
| cb.fire.Firestarter 2.0f | 2.3 | 12.6% | 28 |
| ags.Glacier 0.2.11 | 4.3 | 10.3% | 5 |
| abc.Shadow 3.84i | 4.7 | 10.7% | 10 |
| justin.Mallais 14.0 | 4.7 | 9.9% | 9 |
| hadur2.Hadur 3.13mw | 5.3 | 9.6% | 3 |
| wompi.Numbat 2.1 | 6.0 | 9.6% | 9 |
| catcat20.Lambda 0.024 | 8.0 | 8.7% | 8 |
| wompi.Wallaby 5.1 | 8.3 | 7.8% | 3 |
| kc.micro.Figment 1.0 | 10.0 | 6.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 49.2 | 51.1 | 0 / 35 | 2296 |
| 2 | 5 | 49.8 | 51.7 | 2 / 35 | 2280 |
| 3 | 5 | 49.7 | 50.8 | 1 / 35 | 2460 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 6 | 0% |
| voidious.Diamond 1.8.28 | 3 | 0% |
| justin.Mallais 14.0 | 3 | 33% |
| wompi.Numbat 2.1 | 2 | 50% |
| ags.Glacier 0.2.11 | 2 | 0% |
| abc.Shadow 3.84i | 1 | 0% |
| catcat20.Lambda 0.024 | 1 | 0% |
| wompi.Wallaby 5.1 | 1 | 100% |

Hadur died in 102 of 105 rounds, at a mean tick of 590. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 17 | 17% | 17 |
| justin.Mallais 14.0 | 16 | 16% | 17 |
| cb.fire.Firestarter 2.0f | 15 | 15% | 16 |
| voidious.Diamond 1.8.28 | 13 | 13% | 13 |
| ags.Glacier 0.2.11 | 12 | 12% | 12 |
| catcat20.Lambda 0.024 | 9 | 9% | 9 |
| wompi.Wallaby 5.1 | 8 | 8% | 9 |
| wompi.Numbat 2.1 | 7 | 7% | 7 |
| kc.micro.Figment 1.0 | 5 | 5% | 5 |

Posture (Hadur's M records, 105 rounds): 56318 melee ticks, 6577 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 41 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 20446 sent, 17928 reached their opponent, 2105 virtual hits (11.7% of those reached).

## Paired A/B: hadur2.Hadur 3.13mw vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 3 of 3, baseline 3 of 3, 3 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 49.5% ± 0.8 | 49.6% ± 2.9 | -0.1 ± 2.6 |
| Survival | 51.2% ± 1.2 | 54.3% ± 7.5 | -3.1 ± 8.5 |
| Rounds won | 2.9% ± 7.1 | 3.8% ± 4.1 | -1.0 ± 10.8 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 43.3% ± 8.1 | 42.9% ± 9.9 | +0.3 ± 17.7 |
| voidious.Diamond 1.8.28 | 40.3% ± 2.1 | 41.3% ± 1.3 | -0.9 ± 3.3 |
| abc.Shadow 3.84i | 47.5% ± 8.1 | 44.7% ± 3.3 | +2.8 ± 6.2 |
| ags.Glacier 0.2.11 | 48.3% ± 4.8 | 46.1% ± 6.8 | +2.2 ± 10.8 |
| wompi.Numbat 2.1 | 50.1% ± 8.5 | 51.7% ± 4.1 | -1.6 ± 12.6 |
| justin.Mallais 14.0 | 49.5% ± 7.7 | 53.7% ± 6.3 | -4.2 ± 2.4 |
| kc.micro.Figment 1.0 | 59.4% ± 0.5 | 58.8% ± 8.6 | +0.6 ± 8.2 |
| catcat20.Lambda 0.024 | 52.4% ± 6.3 | 53.0% ± 0.8 | -0.6 ± 5.7 |
| wompi.Wallaby 5.1 | 55.1% ± 5.1 | 54.6% ± 5.6 | +0.5 ± 10.4 |

## Melee bench: C

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

Skipped turns: 12 over 3 battles (4.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 49.6 | 54.3 | 4 / 105 | 5.11 | 9.6% | 5815 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.3 | 13.7% | 30 |
| cb.fire.Firestarter 2.0f | 2.0 | 12.9% | 34 |
| ags.Glacier 0.2.11 | 3.3 | 11.3% | 8 |
| abc.Shadow 3.84i | 3.3 | 11.9% | 13 |
| hadur2.Hadur 3.13 | 5.0 | 9.6% | 4 |
| wompi.Numbat 2.1 | 7.0 | 9.0% | 5 |
| catcat20.Lambda 0.024 | 7.3 | 8.5% | 4 |
| justin.Mallais 14.0 | 7.7 | 8.3% | 2 |
| wompi.Wallaby 5.1 | 8.7 | 8.0% | 3 |
| kc.micro.Figment 1.0 | 9.3 | 6.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 48.8 | 52.7 | 2 / 35 | 1840 |
| 2 | 5 | 49.2 | 52.4 | 1 / 35 | 2057 |
| 3 | 5 | 51.0 | 57.8 | 1 / 35 | 1918 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 4 | 0% |
| voidious.Diamond 1.8.28 | 4 | 0% |
| abc.Shadow 3.84i | 4 | 50% |
| kc.micro.Figment 1.0 | 1 | 100% |
| ags.Glacier 0.2.11 | 1 | 0% |
| catcat20.Lambda 0.024 | 1 | 100% |

Hadur died in 101 of 105 rounds, at a mean tick of 617. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 24 | 24% | 24 |
| voidious.Diamond 1.8.28 | 23 | 23% | 24 |
| abc.Shadow 3.84i | 16 | 16% | 17 |
| justin.Mallais 14.0 | 9 | 9% | 9 |
| wompi.Numbat 2.1 | 9 | 9% | 9 |
| ags.Glacier 0.2.11 | 6 | 6% | 6 |
| catcat20.Lambda 0.024 | 5 | 5% | 6 |
| wompi.Wallaby 5.1 | 5 | 5% | 5 |
| kc.micro.Figment 1.0 | 4 | 4% | 5 |

Posture (Hadur's M records, 105 rounds): 62508 melee ticks, 3368 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 56 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 22942 sent, 20642 reached their opponent, 2687 virtual hits (13.0% of those reached).

## Melee bench: D

hadur2.Hadur 3.13mw against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 12 over 3 battles (4.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 52.8 | 59.8 | 2 / 105 | 4.62 | 10.7% | 6609 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 14.9% | 36 |
| kc.mini.Mirage 0.2 | 2.7 | 12.0% | 15 |
| hadur2.Hadur 3.13mw | 3.3 | 10.7% | 2 |
| cb.fire.Firestarter 2.0f | 3.3 | 11.0% | 17 |
| positive.Portia 1.26e | 6.0 | 10.0% | 9 |
| mn.Combat 3.25.0 | 6.3 | 9.7% | 9 |
| catcat20.Lambda 0.024 | 6.3 | 9.3% | 9 |
| catcat20.Matcha 0.006 | 7.3 | 9.2% | 4 |
| stelo.Spread 0.9 | 8.7 | 7.3% | 4 |
| kc.micro.Figment 1.0 | 10.0 | 6.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 53.2 | 59.4 | 1 / 35 | 2307 |
| 2 | 2 | 54.7 | 63.2 | 1 / 35 | 2378 |
| 3 | 5 | 50.4 | 56.8 | 0 / 35 | 1924 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 6 | 17% |
| positive.Portia 1.26e | 5 | 20% |
| kc.mini.Mirage 0.2 | 3 | 0% |
| cb.fire.Firestarter 2.0f | 2 | 0% |
| catcat20.Matcha 0.006 | 1 | 0% |
| stelo.Spread 0.9 | 1 | 0% |
| kc.micro.Figment 1.0 | 1 | 0% |

Hadur died in 103 of 105 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 27 | 26% | 28 |
| kc.mini.Mirage 0.2 | 19 | 18% | 19 |
| cb.fire.Firestarter 2.0f | 13 | 13% | 13 |
| positive.Portia 1.26e | 11 | 11% | 12 |
| mn.Combat 3.25.0 | 10 | 10% | 10 |
| catcat20.Lambda 0.024 | 8 | 8% | 8 |
| catcat20.Matcha 0.006 | 6 | 6% | 6 |
| stelo.Spread 0.9 | 6 | 6% | 6 |
| kc.micro.Figment 1.0 | 3 | 3% | 3 |

Posture (Hadur's M records, 105 rounds): 63103 melee ticks, 4289 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 25 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 20789 sent, 18262 reached their opponent, 2064 virtual hits (11.3% of those reached).

## Paired A/B: hadur2.Hadur 3.13mw vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 3 of 3, baseline 3 of 3, 3 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 52.8% ± 5.5 | 54.9% ± 1.4 | -2.1 ± 5.2 |
| Survival | 59.8% ± 7.9 | 66.0% ± 8.3 | -6.2 ± 6.7 |
| Rounds won | 1.9% ± 4.1 | 6.7% ± 4.1 | -4.8 ± 4.1 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 41.8% ± 3.6 | 42.7% ± 7.3 | -0.8 ± 7.9 |
| cb.fire.Firestarter 2.0f | 49.4% ± 7.0 | 48.6% ± 5.0 | +0.8 ± 11.8 |
| positive.Portia 1.26e | 51.8% ± 5.7 | 52.5% ± 1.9 | -0.7 ± 4.1 |
| kc.mini.Mirage 0.2 | 47.5% ± 8.6 | 50.4% ± 9.5 | -2.9 ± 7.8 |
| mn.Combat 3.25.0 | 52.7% ± 5.1 | 53.6% ± 2.4 | -0.9 ± 3.5 |
| catcat20.Matcha 0.006 | 54.0% ± 8.1 | 56.7% ± 5.7 | -2.7 ± 9.0 |
| kc.micro.Figment 1.0 | 64.3% ± 10.4 | 70.6% ± 12.7 | -6.2 ± 17.3 |
| catcat20.Lambda 0.024 | 53.7% ± 8.0 | 57.8% ± 2.3 | -4.1 ± 10.3 |
| stelo.Spread 0.9 | 59.8% ± 18.2 | 61.4% ± 7.2 | -1.5 ± 20.0 |

## Melee bench: D

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

Skipped turns: 16 over 3 battles (5.3 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.9 | 66.0 | 7 / 105 | 4.06 | 11.5% | 5736 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 15.5% | 44 |
| cb.fire.Firestarter 2.0f | 2.7 | 12.2% | 19 |
| hadur2.Hadur 3.13 | 3.3 | 11.5% | 7 |
| kc.mini.Mirage 0.2 | 3.7 | 11.3% | 11 |
| positive.Portia 1.26e | 4.7 | 10.4% | 7 |
| mn.Combat 3.25.0 | 5.7 | 9.9% | 11 |
| catcat20.Matcha 0.006 | 7.3 | 8.8% | 2 |
| catcat20.Lambda 0.024 | 7.7 | 8.4% | 4 |
| stelo.Spread 0.9 | 9.0 | 7.2% | 2 |
| kc.micro.Figment 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.3 | 62.9 | 3 / 35 | 1994 |
| 2 | 3 | 55.5 | 69.5 | 2 / 35 | 1785 |
| 3 | 3 | 54.9 | 65.7 | 2 / 35 | 1957 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 10 | 0% |
| positive.Portia 1.26e | 5 | 60% |
| cb.fire.Firestarter 2.0f | 3 | 0% |
| catcat20.Matcha 0.006 | 2 | 100% |
| mn.Combat 3.25.0 | 2 | 50% |
| kc.mini.Mirage 0.2 | 1 | 100% |

Hadur died in 98 of 105 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 32 | 33% | 32 |
| kc.mini.Mirage 0.2 | 16 | 16% | 17 |
| positive.Portia 1.26e | 11 | 11% | 13 |
| cb.fire.Firestarter 2.0f | 11 | 11% | 12 |
| stelo.Spread 0.9 | 9 | 9% | 9 |
| catcat20.Matcha 0.006 | 7 | 7% | 10 |
| mn.Combat 3.25.0 | 5 | 5% | 5 |
| catcat20.Lambda 0.024 | 5 | 5% | 5 |
| kc.micro.Figment 1.0 | 2 | 2% | 2 |

Posture (Hadur's M records, 105 rounds): 70280 melee ticks, 6863 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 38 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 23533 sent, 21187 reached their opponent, 2641 virtual hits (12.5% of those reached).

## Melee bench: E

hadur2.Hadur 3.13mw against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 11 over 3 battles (3.7 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 50.6 | 54.1 | 3 / 105 | 5.13 | 10.1% | 6864 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.3 | 12.9% | 24 |
| voidious.Diamond 1.8.28 | 2.7 | 11.0% | 18 |
| justin.DemonicRage 3.4 | 3.7 | 11.2% | 9 |
| jk.melee.Neuromancer 7.12 | 4.7 | 10.2% | 13 |
| hadur2.Hadur 3.13mw | 5.0 | 10.1% | 3 |
| mn.Combat 3.25.0 | 6.0 | 9.6% | 10 |
| rz.Aleph 0.34 | 6.7 | 9.1% | 7 |
| wompi.Numbat 2.1 | 7.3 | 9.2% | 4 |
| rsalesc.melee.Medina 0.4.5 | 8.7 | 8.5% | 9 |
| catcat20.Lambda 0.024 | 9.0 | 8.2% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 51.2 | 54.6 | 2 / 35 | 2290 |
| 2 | 6 | 49.7 | 52.7 | 0 / 35 | 2255 |
| 3 | 4 | 51.0 | 54.9 | 1 / 35 | 2319 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 5 | 0% |
| aaa.r.ScalarR 0.005g.047 | 3 | 0% |
| jk.melee.Neuromancer 7.12 | 2 | 0% |
| catcat20.Lambda 0.024 | 2 | 50% |
| rsalesc.melee.Medina 0.4.5 | 2 | 50% |
| mn.Combat 3.25.0 | 2 | 0% |
| justin.DemonicRage 3.4 | 1 | 100% |
| wompi.Numbat 2.1 | 1 | 0% |

Hadur died in 102 of 105 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 16 | 16% | 16 |
| aaa.r.ScalarR 0.005g.047 | 16 | 16% | 16 |
| justin.DemonicRage 3.4 | 15 | 15% | 16 |
| jk.melee.Neuromancer 7.12 | 12 | 12% | 12 |
| mn.Combat 3.25.0 | 11 | 11% | 11 |
| rz.Aleph 0.34 | 10 | 10% | 10 |
| wompi.Numbat 2.1 | 9 | 9% | 9 |
| rsalesc.melee.Medina 0.4.5 | 7 | 7% | 8 |
| catcat20.Lambda 0.024 | 6 | 6% | 7 |

Posture (Hadur's M records, 105 rounds): 57469 melee ticks, 4828 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 64 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 1.

Targeting waves (105 rounds): 20666 sent, 17980 reached their opponent, 2015 virtual hits (11.2% of those reached).

## Paired A/B: hadur2.Hadur 3.13mw vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 3 of 3, baseline 3 of 3, 3 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 50.6% ± 2.0 | 48.1% ± 4.9 | +2.6 ± 6.8 |
| Survival | 54.1% ± 3.0 | 51.3% ± 11.0 | +2.8 ± 13.6 |
| Rounds won | 2.9% ± 7.1 | 2.9% ± 0.0 | +0.0 ± 7.1 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 43.8% ± 0.9 | 39.1% ± 5.3 | +4.7 ± 4.9 |
| jk.melee.Neuromancer 7.12 | 49.7% ± 1.9 | 41.9% ± 14.2 | +7.8 ± 12.4 |
| voidious.Diamond 1.8.28 | 47.8% ± 2.8 | 45.1% ± 5.9 | +2.7 ± 6.4 |
| justin.DemonicRage 3.4 | 47.7% ± 9.9 | 47.5% ± 4.3 | +0.2 ± 8.4 |
| rsalesc.melee.Medina 0.4.5 | 54.4% ± 6.7 | 56.0% ± 6.5 | -1.6 ± 12.7 |
| mn.Combat 3.25.0 | 51.5% ± 12.6 | 47.4% ± 3.8 | +4.1 ± 14.1 |
| rz.Aleph 0.34 | 52.9% ± 9.1 | 48.6% ± 9.6 | +4.3 ± 8.5 |
| wompi.Numbat 2.1 | 52.3% ± 3.7 | 54.4% ± 1.1 | -2.0 ± 4.7 |
| catcat20.Lambda 0.024 | 55.6% ± 12.8 | 52.6% ± 10.3 | +3.0 ± 13.2 |

## Melee bench: E

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

Skipped turns: 10 over 3 battles (3.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 48.1 | 51.3 | 3 / 105 | 5.38 | 9.1% | 4984 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.3 | 14.2% | 29 |
| jk.melee.Neuromancer 7.12 | 2.0 | 12.8% | 28 |
| voidious.Diamond 1.8.28 | 2.7 | 11.1% | 11 |
| mn.Combat 3.25.0 | 5.0 | 10.1% | 6 |
| justin.DemonicRage 3.4 | 5.0 | 10.1% | 6 |
| rz.Aleph 0.34 | 6.0 | 9.6% | 3 |
| hadur2.Hadur 3.13 | 7.0 | 9.1% | 3 |
| catcat20.Lambda 0.024 | 7.7 | 8.3% | 7 |
| wompi.Numbat 2.1 | 9.0 | 7.7% | 6 |
| rsalesc.melee.Medina 0.4.5 | 9.3 | 7.2% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 7 | 46.4 | 47.0 | 1 / 35 | 1613 |
| 2 | 6 | 50.3 | 55.9 | 1 / 35 | 1853 |
| 3 | 8 | 47.6 | 51.1 | 1 / 35 | 1518 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 3 | 0% |
| rsalesc.melee.Medina 0.4.5 | 3 | 0% |
| rz.Aleph 0.34 | 2 | 100% |
| justin.DemonicRage 3.4 | 1 | 0% |
| voidious.Diamond 1.8.28 | 1 | 0% |
| catcat20.Lambda 0.024 | 1 | 100% |

Hadur died in 102 of 105 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 18 | 18% | 19 |
| jk.melee.Neuromancer 7.12 | 17 | 17% | 17 |
| mn.Combat 3.25.0 | 12 | 12% | 12 |
| voidious.Diamond 1.8.28 | 11 | 11% | 11 |
| justin.DemonicRage 3.4 | 11 | 11% | 11 |
| wompi.Numbat 2.1 | 9 | 9% | 9 |
| rsalesc.melee.Medina 0.4.5 | 9 | 9% | 9 |
| catcat20.Lambda 0.024 | 8 | 8% | 9 |
| rz.Aleph 0.34 | 7 | 7% | 8 |

Posture (Hadur's M records, 105 rounds): 57490 melee ticks, 2341 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 72 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 21476 sent, 19177 reached their opponent, 2434 virtual hits (12.7% of those reached).

