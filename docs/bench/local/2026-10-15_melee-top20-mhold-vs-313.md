# Bench suite: melee-top20.txt

## Melee bench: A

hadur2.Hadur 3.13mh against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 10 over 3 battles (3.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 45.7 | 53.5 | 4 / 105 | 5.18 | 8.3% | 1358 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.3 | 15.0% | 37 |
| jk.melee.Neuromancer 7.12 | 1.7 | 13.9% | 28 |
| catcat20.Matcha 0.006 | 4.3 | 10.1% | 8 |
| ags.Glacier 0.2.11 | 4.3 | 10.4% | 9 |
| positive.Portia 1.26e | 5.0 | 9.5% | 5 |
| rsalesc.melee.Medina 0.4.5 | 6.0 | 9.0% | 10 |
| justin.Mallais 14.0 | 7.0 | 8.8% | 1 |
| hadur2.Hadur 3.13mh | 7.7 | 8.3% | 4 |
| wompi.Wallaby 5.1 | 7.7 | 8.3% | 1 |
| stelo.PastFuture 2.3.2 | 10.0 | 6.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 47.7 | 58.1 | 0 / 35 | 520 |
| 2 | 8 | 44.6 | 51.1 | 2 / 35 | 417 |
| 3 | 9 | 44.7 | 51.4 | 2 / 35 | 421 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 6 | 33% |
| aaa.r.ScalarR 0.005g.047 | 4 | 0% |
| catcat20.Matcha 0.006 | 4 | 25% |
| positive.Portia 1.26e | 2 | 50% |
| rsalesc.melee.Medina 0.4.5 | 1 | 0% |
| ags.Glacier 0.2.11 | 1 | 0% |

Hadur died in 101 of 105 rounds, at a mean tick of 593. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 22 | 22% | 24 |
| aaa.r.ScalarR 0.005g.047 | 20 | 20% | 21 |
| catcat20.Matcha 0.006 | 17 | 17% | 17 |
| rsalesc.melee.Medina 0.4.5 | 13 | 13% | 13 |
| positive.Portia 1.26e | 10 | 10% | 11 |
| ags.Glacier 0.2.11 | 8 | 8% | 8 |
| justin.Mallais 14.0 | 5 | 5% | 5 |
| wompi.Wallaby 5.1 | 4 | 4% | 4 |
| stelo.PastFuture 2.3.2 | 2 | 2% | 2 |

Posture (Hadur's M records, 105 rounds): 59684 melee ticks, 4161 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 48 ticks (103 rounds over 8); rounds whose longest gap at any count was over 8: 103; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 2578 sent, 1475 reached their opponent, 144 virtual hits (9.8% of those reached).

## Paired A/B: hadur2.Hadur 3.13mh vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 3 of 3, baseline 3 of 3, 3 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 45.7% ± 4.4 | 51.3% ± 3.0 | -5.7 ± 6.4 |
| Survival | 53.5% ± 9.8 | 58.3% ± 5.7 | -4.8 ± 13.2 |
| Rounds won | 3.8% ± 8.2 | 7.6% ± 14.8 | -3.8 ± 14.8 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 35.6% ± 1.9 | 40.3% ± 2.0 | -4.7 ± 3.9 |
| jk.melee.Neuromancer 7.12 | 37.3% ± 8.4 | 43.5% ± 9.0 | -6.2 ± 11.6 |
| positive.Portia 1.26e | 46.6% ± 4.6 | 51.2% ± 12.7 | -4.6 ± 15.6 |
| ags.Glacier 0.2.11 | 44.5% ± 7.2 | 50.3% ± 5.9 | -5.8 ± 5.8 |
| rsalesc.melee.Medina 0.4.5 | 48.1% ± 13.1 | 57.5% ± 0.3 | -9.4 ± 13.4 |
| catcat20.Matcha 0.006 | 45.3% ± 6.7 | 53.1% ± 8.0 | -7.8 ± 1.8 |
| justin.Mallais 14.0 | 48.6% ± 10.3 | 51.9% ± 5.1 | -3.3 ± 14.2 |
| wompi.Wallaby 5.1 | 49.9% ± 4.8 | 55.7% ± 0.1 | -5.7 ± 4.7 |
| stelo.PastFuture 2.3.2 | 54.9% ± 11.5 | 58.3% ± 5.8 | -3.4 ± 17.0 |

## Melee bench: A

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

Skipped turns: 13 over 3 battles (4.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 51.3 | 58.3 | 8 / 105 | 4.75 | 10.2% | 5183 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 15.1% | 38 |
| jk.melee.Neuromancer 7.12 | 2.0 | 13.3% | 25 |
| ags.Glacier 0.2.11 | 4.0 | 10.1% | 4 |
| hadur2.Hadur 3.13 | 4.3 | 10.2% | 8 |
| justin.Mallais 14.0 | 5.3 | 9.4% | 4 |
| positive.Portia 1.26e | 5.7 | 9.8% | 6 |
| catcat20.Matcha 0.006 | 6.0 | 9.1% | 9 |
| wompi.Wallaby 5.1 | 7.7 | 8.1% | 4 |
| rsalesc.melee.Medina 0.4.5 | 9.3 | 7.5% | 3 |
| stelo.PastFuture 2.3.2 | 9.7 | 7.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 50.6 | 57.1 | 2 / 35 | 1642 |
| 2 | 5 | 50.6 | 56.8 | 1 / 35 | 1797 |
| 3 | 3 | 52.7 | 61.0 | 5 / 35 | 1744 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 7 | 14% |
| jk.melee.Neuromancer 7.12 | 4 | 0% |
| catcat20.Matcha 0.006 | 3 | 67% |
| wompi.Wallaby 5.1 | 2 | 50% |
| justin.Mallais 14.0 | 2 | 50% |
| stelo.PastFuture 2.3.2 | 2 | 50% |
| ags.Glacier 0.2.11 | 1 | 0% |
| rsalesc.melee.Medina 0.4.5 | 1 | 100% |
| positive.Portia 1.26e | 1 | 100% |

Hadur died in 97 of 105 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 19 | 20% | 20 |
| positive.Portia 1.26e | 14 | 14% | 16 |
| jk.melee.Neuromancer 7.12 | 13 | 13% | 13 |
| catcat20.Matcha 0.006 | 11 | 11% | 12 |
| ags.Glacier 0.2.11 | 10 | 10% | 11 |
| justin.Mallais 14.0 | 10 | 10% | 11 |
| wompi.Wallaby 5.1 | 9 | 9% | 9 |
| stelo.PastFuture 2.3.2 | 8 | 8% | 9 |
| rsalesc.melee.Medina 0.4.5 | 3 | 3% | 4 |

Posture (Hadur's M records, 105 rounds): 60357 melee ticks, 5965 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 42 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 22277 sent, 19996 reached their opponent, 2665 virtual hits (13.3% of those reached).

## Melee bench: B

hadur2.Hadur 3.13mh against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 5 over 3 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 42.4 | 47.5 | 2 / 105 | 5.72 | 7.3% | 1602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 15.7% | 47 |
| justin.DemonicRage 3.4 | 2.0 | 12.4% | 17 |
| rz.Aleph 0.34 | 3.3 | 11.3% | 8 |
| abc.Shadow 3.84i | 4.3 | 11.2% | 8 |
| kc.mini.Mirage 0.2 | 4.3 | 11.2% | 6 |
| wompi.Wallaby 5.1 | 7.0 | 8.1% | 1 |
| stelo.Spread 0.9 | 7.3 | 8.1% | 9 |
| kc.micro.Figment 1.0 | 8.3 | 7.5% | 3 |
| hadur2.Hadur 3.13mh | 8.7 | 7.3% | 2 |
| stelo.PastFuture 2.3.2 | 8.7 | 7.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 7 | 46.0 | 54.0 | 0 / 35 | 665 |
| 2 | 10 | 42.0 | 46.7 | 2 / 35 | 497 |
| 3 | 9 | 39.1 | 41.9 | 0 / 35 | 440 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 4 | 0% |
| stelo.Spread 0.9 | 4 | 0% |
| kc.mini.Mirage 0.2 | 2 | 50% |
| abc.Shadow 3.84i | 2 | 0% |
| rz.Aleph 0.34 | 1 | 100% |
| stelo.PastFuture 2.3.2 | 1 | 0% |

Hadur died in 103 of 105 rounds, at a mean tick of 574. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 22 | 21% | 23 |
| jk.melee.Neuromancer 7.12 | 17 | 17% | 17 |
| rz.Aleph 0.34 | 15 | 15% | 16 |
| stelo.Spread 0.9 | 11 | 11% | 11 |
| justin.DemonicRage 3.4 | 10 | 10% | 10 |
| abc.Shadow 3.84i | 9 | 9% | 9 |
| stelo.PastFuture 2.3.2 | 7 | 7% | 7 |
| wompi.Wallaby 5.1 | 6 | 6% | 6 |
| kc.micro.Figment 1.0 | 6 | 6% | 6 |

Posture (Hadur's M records, 103 rounds): 56013 melee ticks, 3350 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (103 rounds): longest scan gap while four or more were alive 32 ticks (103 rounds over 8); rounds whose longest gap at any count was over 8: 103; robots dropped as dead without a death event: 0.

Targeting waves (103 rounds): 2190 sent, 1162 reached their opponent, 98 virtual hits (8.4% of those reached).

## Paired A/B: hadur2.Hadur 3.13mh vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 3 of 3, baseline 3 of 3, 3 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 42.4% ± 8.6 | 49.3% ± 2.2 | -6.9 ± 10.7 |
| Survival | 47.5% ± 15.1 | 53.3% ± 2.8 | -5.8 ± 17.4 |
| Rounds won | 1.9% ± 8.2 | 4.8% ± 10.8 | -2.9 ± 7.1 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 31.7% ± 7.5 | 39.2% ± 4.0 | -7.5 ± 9.6 |
| justin.DemonicRage 3.4 | 37.1% ± 5.8 | 43.4% ± 6.8 | -6.3 ± 12.1 |
| abc.Shadow 3.84i | 39.4% ± 9.5 | 45.3% ± 3.5 | -5.8 ± 12.9 |
| kc.mini.Mirage 0.2 | 39.5% ± 10.2 | 45.4% ± 3.8 | -6.0 ± 11.6 |
| rz.Aleph 0.34 | 39.2% ± 10.0 | 44.2% ± 1.8 | -5.0 ± 8.3 |
| kc.micro.Figment 1.0 | 49.1% ± 12.4 | 57.4% ± 7.5 | -8.3 ± 19.9 |
| wompi.Wallaby 5.1 | 47.5% ± 17.5 | 53.2% ± 4.9 | -5.7 ± 13.3 |
| stelo.PastFuture 2.3.2 | 49.6% ± 16.7 | 59.9% ± 4.8 | -10.3 ± 17.3 |
| stelo.Spread 0.9 | 48.3% ± 13.9 | 55.4% ± 8.0 | -7.1 ± 16.4 |

## Melee bench: B

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

Skipped turns: 8 over 3 battles (2.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 49.3 | 53.3 | 5 / 105 | 5.20 | 9.4% | 5347 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 14.6% | 33 |
| justin.DemonicRage 3.4 | 2.7 | 12.3% | 16 |
| rz.Aleph 0.34 | 3.3 | 11.9% | 11 |
| abc.Shadow 3.84i | 4.0 | 11.4% | 7 |
| kc.mini.Mirage 0.2 | 4.0 | 11.3% | 18 |
| hadur2.Hadur 3.13 | 6.0 | 9.4% | 5 |
| wompi.Wallaby 5.1 | 7.7 | 8.3% | 3 |
| stelo.Spread 0.9 | 8.3 | 7.6% | 10 |
| kc.micro.Figment 1.0 | 8.3 | 7.0% | 2 |
| stelo.PastFuture 2.3.2 | 9.7 | 6.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 48.3 | 52.1 | 2 / 35 | 1593 |
| 2 | 6 | 49.6 | 54.3 | 3 / 35 | 1675 |
| 3 | 6 | 49.9 | 53.7 | 0 / 35 | 2079 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 5 | 20% |
| jk.melee.Neuromancer 7.12 | 4 | 0% |
| stelo.Spread 0.9 | 3 | 0% |
| kc.mini.Mirage 0.2 | 3 | 33% |
| rz.Aleph 0.34 | 2 | 50% |
| abc.Shadow 3.84i | 2 | 50% |
| wompi.Wallaby 5.1 | 1 | 100% |

Hadur died in 100 of 105 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 22 | 22% | 22 |
| rz.Aleph 0.34 | 15 | 15% | 15 |
| kc.mini.Mirage 0.2 | 14 | 14% | 15 |
| stelo.Spread 0.9 | 13 | 13% | 13 |
| justin.DemonicRage 3.4 | 11 | 11% | 12 |
| abc.Shadow 3.84i | 10 | 10% | 10 |
| kc.micro.Figment 1.0 | 7 | 7% | 7 |
| stelo.PastFuture 2.3.2 | 5 | 5% | 6 |
| wompi.Wallaby 5.1 | 3 | 3% | 5 |

Posture (Hadur's M records, 104 rounds): 60278 melee ticks, 5641 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (104 rounds): longest scan gap while four or more were alive 30 ticks (104 rounds over 8); rounds whose longest gap at any count was over 8: 104; robots dropped as dead without a death event: 0.

Targeting waves (104 rounds): 21996 sent, 19740 reached their opponent, 2595 virtual hits (13.1% of those reached).

## Melee bench: C

hadur2.Hadur 3.13mh against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 9 over 3 battles (3.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 41.2 | 45.8 | 2 / 105 | 5.88 | 7.1% | 1539 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.3 | 14.5% | 33 |
| abc.Shadow 3.84i | 2.3 | 12.1% | 16 |
| cb.fire.Firestarter 2.0f | 3.7 | 11.2% | 19 |
| ags.Glacier 0.2.11 | 5.0 | 10.2% | 6 |
| wompi.Numbat 2.1 | 5.3 | 10.0% | 8 |
| catcat20.Lambda 0.024 | 5.3 | 9.9% | 8 |
| justin.Mallais 14.0 | 6.0 | 9.9% | 8 |
| wompi.Wallaby 5.1 | 7.3 | 8.8% | 4 |
| hadur2.Hadur 3.13mh | 8.7 | 7.1% | 2 |
| kc.micro.Figment 1.0 | 10.0 | 6.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 9 | 39.7 | 42.9 | 1 / 35 | 412 |
| 2 | 8 | 45.6 | 53.0 | 1 / 35 | 797 |
| 3 | 9 | 38.2 | 41.6 | 0 / 35 | 330 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 3 | 0% |
| abc.Shadow 3.84i | 2 | 0% |
| justin.Mallais 14.0 | 1 | 100% |
| wompi.Numbat 2.1 | 1 | 100% |
| catcat20.Lambda 0.024 | 1 | 0% |
| cb.fire.Firestarter 2.0f | 1 | 0% |

Hadur died in 103 of 105 rounds, at a mean tick of 550. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 23 | 22% | 23 |
| ags.Glacier 0.2.11 | 18 | 17% | 18 |
| justin.Mallais 14.0 | 13 | 13% | 13 |
| abc.Shadow 3.84i | 11 | 11% | 12 |
| wompi.Numbat 2.1 | 11 | 11% | 12 |
| wompi.Wallaby 5.1 | 8 | 8% | 8 |
| catcat20.Lambda 0.024 | 7 | 7% | 7 |
| cb.fire.Firestarter 2.0f | 7 | 7% | 7 |
| kc.micro.Figment 1.0 | 5 | 5% | 5 |

Posture (Hadur's M records, 105 rounds): 56608 melee ticks, 2121 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 64 ticks (104 rounds over 8); rounds whose longest gap at any count was over 8: 104; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 2295 sent, 1299 reached their opponent, 134 virtual hits (10.3% of those reached).

## Paired A/B: hadur2.Hadur 3.13mh vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 3 of 3, baseline 3 of 3, 3 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 41.2% ± 9.7 | 49.7% ± 4.9 | -8.5 ± 13.4 |
| Survival | 45.8% ± 15.6 | 54.8% ± 9.6 | -9.0 ± 23.3 |
| Rounds won | 1.9% ± 4.1 | 4.8% ± 4.1 | -2.9 ± 7.1 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 39.0% ± 15.6 | 43.7% ± 5.1 | -4.7 ± 19.1 |
| voidious.Diamond 1.8.28 | 32.9% ± 12.4 | 41.2% ± 5.1 | -8.3 ± 14.2 |
| abc.Shadow 3.84i | 36.8% ± 12.4 | 45.5% ± 5.6 | -8.7 ± 17.3 |
| ags.Glacier 0.2.11 | 40.8% ± 7.8 | 47.9% ± 11.3 | -7.2 ± 17.5 |
| wompi.Numbat 2.1 | 41.2% ± 7.8 | 50.2% ± 4.5 | -9.0 ± 12.3 |
| justin.Mallais 14.0 | 41.5% ± 10.1 | 50.9% ± 6.3 | -9.4 ± 15.5 |
| kc.micro.Figment 1.0 | 52.7% ± 2.5 | 59.6% ± 10.4 | -6.9 ± 12.9 |
| catcat20.Lambda 0.024 | 41.5% ± 13.1 | 52.5% ± 4.3 | -11.0 ± 15.3 |
| wompi.Wallaby 5.1 | 44.4% ± 14.5 | 55.9% ± 6.7 | -11.6 ± 20.1 |

## Melee bench: C

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

Skipped turns: 13 over 3 battles (4.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 49.7 | 54.8 | 5 / 105 | 5.07 | 9.7% | 5532 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.3 | 13.8% | 26 |
| cb.fire.Firestarter 2.0f | 2.0 | 12.5% | 25 |
| abc.Shadow 3.84i | 2.7 | 11.6% | 10 |
| ags.Glacier 0.2.11 | 4.7 | 10.5% | 8 |
| hadur2.Hadur 3.13 | 5.3 | 9.7% | 5 |
| wompi.Numbat 2.1 | 5.3 | 9.6% | 8 |
| justin.Mallais 14.0 | 6.7 | 9.3% | 7 |
| catcat20.Lambda 0.024 | 8.0 | 8.7% | 11 |
| wompi.Wallaby 5.1 | 9.3 | 7.6% | 4 |
| kc.micro.Figment 1.0 | 9.7 | 6.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 51.9 | 59.0 | 1 / 35 | 1988 |
| 2 | 7 | 48.0 | 51.4 | 2 / 35 | 1769 |
| 3 | 5 | 49.3 | 54.0 | 2 / 35 | 1775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 5 | 20% |
| voidious.Diamond 1.8.28 | 4 | 0% |
| justin.Mallais 14.0 | 2 | 50% |
| abc.Shadow 3.84i | 2 | 50% |
| ags.Glacier 0.2.11 | 2 | 50% |
| wompi.Numbat 2.1 | 1 | 0% |
| wompi.Wallaby 5.1 | 1 | 0% |
| catcat20.Lambda 0.024 | 1 | 100% |

Hadur died in 100 of 105 rounds, at a mean tick of 606. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 19 | 19% | 20 |
| abc.Shadow 3.84i | 16 | 16% | 17 |
| voidious.Diamond 1.8.28 | 14 | 14% | 15 |
| catcat20.Lambda 0.024 | 11 | 11% | 11 |
| ags.Glacier 0.2.11 | 10 | 10% | 11 |
| wompi.Numbat 2.1 | 10 | 10% | 10 |
| wompi.Wallaby 5.1 | 8 | 8% | 8 |
| justin.Mallais 14.0 | 6 | 6% | 7 |
| kc.micro.Figment 1.0 | 6 | 6% | 6 |

Posture (Hadur's M records, 105 rounds): 61530 melee ticks, 4379 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 40 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 22854 sent, 20534 reached their opponent, 2696 virtual hits (13.1% of those reached).

## Melee bench: D

hadur2.Hadur 3.13mh against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 10 over 3 battles (3.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 45.9 | 54.9 | 0 / 105 | 5.06 | 8.3% | 1317 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 15.0% | 36 |
| cb.fire.Firestarter 2.0f | 2.0 | 13.3% | 32 |
| kc.mini.Mirage 0.2 | 3.0 | 11.8% | 8 |
| mn.Combat 3.25.0 | 5.0 | 10.0% | 10 |
| catcat20.Lambda 0.024 | 5.7 | 9.6% | 7 |
| positive.Portia 1.26e | 6.0 | 9.7% | 2 |
| catcat20.Matcha 0.006 | 6.3 | 9.0% | 6 |
| hadur2.Hadur 3.13mh | 7.3 | 8.3% | 0 |
| stelo.Spread 0.9 | 9.0 | 7.3% | 2 |
| kc.micro.Figment 1.0 | 9.7 | 6.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 8 | 44.9 | 54.0 | 0 / 35 | 362 |
| 2 | 8 | 45.6 | 54.0 | 0 / 35 | 463 |
| 3 | 6 | 47.1 | 56.8 | 0 / 35 | 492 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 6 | 0% |
| cb.fire.Firestarter 2.0f | 5 | 0% |
| catcat20.Lambda 0.024 | 2 | 0% |
| catcat20.Matcha 0.006 | 1 | 0% |
| mn.Combat 3.25.0 | 1 | 0% |

Hadur died in 105 of 105 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 26 | 25% | 26 |
| cb.fire.Firestarter 2.0f | 21 | 20% | 21 |
| catcat20.Lambda 0.024 | 15 | 14% | 15 |
| kc.mini.Mirage 0.2 | 15 | 14% | 15 |
| positive.Portia 1.26e | 9 | 9% | 9 |
| stelo.Spread 0.9 | 8 | 8% | 8 |
| catcat20.Matcha 0.006 | 5 | 5% | 5 |
| mn.Combat 3.25.0 | 5 | 5% | 5 |
| kc.micro.Figment 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 105 rounds): 62773 melee ticks, 3032 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 32 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 2648 sent, 1527 reached their opponent, 159 virtual hits (10.4% of those reached).

## Paired A/B: hadur2.Hadur 3.13mh vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 3 of 3, baseline 3 of 3, 3 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 45.9% ± 2.9 | 51.6% ± 1.3 | -5.7 ± 3.1 |
| Survival | 54.9% ± 4.1 | 58.8% ± 3.6 | -3.9 ± 7.7 |
| Rounds won | 0.0% ± 0.0 | 3.8% ± 4.1 | -3.8 ± 4.1 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 35.7% ± 0.5 | 41.7% ± 7.3 | -6.1 ± 7.4 |
| cb.fire.Firestarter 2.0f | 38.5% ± 2.9 | 43.9% ± 1.2 | -5.4 ± 3.6 |
| positive.Portia 1.26e | 46.2% ± 2.5 | 53.1% ± 2.8 | -6.9 ± 4.2 |
| kc.mini.Mirage 0.2 | 41.2% ± 4.0 | 45.7% ± 2.2 | -4.5 ± 4.3 |
| mn.Combat 3.25.0 | 45.3% ± 3.5 | 49.2% ± 2.8 | -3.9 ± 5.5 |
| catcat20.Matcha 0.006 | 48.0% ± 11.2 | 53.2% ± 6.7 | -5.2 ± 8.5 |
| kc.micro.Figment 1.0 | 58.2% ± 14.2 | 62.2% ± 12.5 | -4.0 ± 11.8 |
| catcat20.Lambda 0.024 | 46.6% ± 10.4 | 55.8% ± 6.0 | -9.2 ± 14.0 |
| stelo.Spread 0.9 | 53.1% ± 1.8 | 59.3% ± 6.5 | -6.2 ± 6.3 |

## Melee bench: D

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

Skipped turns: 20 over 3 battles (6.7 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 51.6 | 58.8 | 4 / 105 | 4.70 | 10.2% | 5506 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.3 | 14.4% | 30 |
| cb.fire.Firestarter 2.0f | 1.7 | 13.1% | 27 |
| kc.mini.Mirage 0.2 | 3.0 | 12.2% | 17 |
| mn.Combat 3.25.0 | 4.3 | 10.6% | 9 |
| hadur2.Hadur 3.13 | 4.7 | 10.2% | 4 |
| positive.Portia 1.26e | 6.3 | 9.1% | 1 |
| catcat20.Matcha 0.006 | 6.7 | 9.0% | 7 |
| catcat20.Lambda 0.024 | 8.3 | 8.1% | 7 |
| stelo.Spread 0.9 | 9.0 | 7.1% | 2 |
| kc.micro.Figment 1.0 | 9.7 | 6.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 51.2 | 59.7 | 1 / 35 | 1641 |
| 2 | 4 | 52.1 | 59.7 | 1 / 35 | 1957 |
| 3 | 5 | 51.4 | 57.1 | 2 / 35 | 1908 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 5 | 0% |
| catcat20.Matcha 0.006 | 3 | 33% |
| cb.fire.Firestarter 2.0f | 3 | 33% |
| catcat20.Lambda 0.024 | 1 | 0% |
| kc.mini.Mirage 0.2 | 1 | 100% |
| mn.Combat 3.25.0 | 1 | 0% |
| kc.micro.Figment 1.0 | 1 | 100% |

Hadur died in 101 of 105 rounds, at a mean tick of 636. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 23 | 23% | 24 |
| cb.fire.Firestarter 2.0f | 18 | 18% | 19 |
| kc.mini.Mirage 0.2 | 13 | 13% | 13 |
| positive.Portia 1.26e | 13 | 13% | 13 |
| catcat20.Matcha 0.006 | 11 | 11% | 12 |
| mn.Combat 3.25.0 | 8 | 8% | 8 |
| stelo.Spread 0.9 | 6 | 6% | 6 |
| catcat20.Lambda 0.024 | 5 | 5% | 5 |
| kc.micro.Figment 1.0 | 4 | 4% | 5 |

Posture (Hadur's M records, 105 rounds): 64824 melee ticks, 4004 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 34 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 22420 sent, 20068 reached their opponent, 2576 virtual hits (12.8% of those reached).

## Melee bench: E

hadur2.Hadur 3.13mh against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 6 over 3 battles (2.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 44.1 | 50.3 | 2 / 105 | 5.48 | 7.8% | 1429 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 14.6% | 30 |
| justin.DemonicRage 3.4 | 2.3 | 12.8% | 15 |
| jk.melee.Neuromancer 7.12 | 3.0 | 12.0% | 24 |
| voidious.Diamond 1.8.28 | 4.3 | 11.2% | 17 |
| mn.Combat 3.25.0 | 4.3 | 10.9% | 8 |
| rz.Aleph 0.34 | 6.3 | 8.9% | 2 |
| hadur2.Hadur 3.13mh | 7.7 | 7.8% | 2 |
| rsalesc.melee.Medina 0.4.5 | 8.3 | 7.2% | 4 |
| catcat20.Lambda 0.024 | 8.3 | 7.8% | 3 |
| wompi.Numbat 2.1 | 9.3 | 7.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 7 | 46.1 | 54.3 | 1 / 35 | 419 |
| 2 | 7 | 46.3 | 54.6 | 0 / 35 | 558 |
| 3 | 9 | 39.9 | 41.9 | 1 / 35 | 452 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 4 | 0% |
| rsalesc.melee.Medina 0.4.5 | 2 | 50% |
| voidious.Diamond 1.8.28 | 1 | 100% |
| jk.melee.Neuromancer 7.12 | 1 | 0% |
| justin.DemonicRage 3.4 | 1 | 0% |
| mn.Combat 3.25.0 | 1 | 0% |

Hadur died in 103 of 105 rounds, at a mean tick of 567. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 21 | 20% | 21 |
| jk.melee.Neuromancer 7.12 | 15 | 15% | 15 |
| rz.Aleph 0.34 | 14 | 14% | 14 |
| justin.DemonicRage 3.4 | 14 | 14% | 14 |
| mn.Combat 3.25.0 | 14 | 14% | 14 |
| voidious.Diamond 1.8.28 | 9 | 9% | 10 |
| rsalesc.melee.Medina 0.4.5 | 7 | 7% | 8 |
| wompi.Numbat 2.1 | 5 | 5% | 5 |
| catcat20.Lambda 0.024 | 4 | 4% | 4 |

Posture (Hadur's M records, 105 rounds): 58305 melee ticks, 2546 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 55 ticks (104 rounds over 8); rounds whose longest gap at any count was over 8: 104; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 2576 sent, 1468 reached their opponent, 139 virtual hits (9.5% of those reached).

## Paired A/B: hadur2.Hadur 3.13mh vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 3 of 3, baseline 3 of 3, 3 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 44.1% ± 9.0 | 46.8% ± 7.0 | -2.7 ± 15.0 |
| Survival | 50.3% ± 18.0 | 49.7% ± 16.7 | +0.5 ± 32.2 |
| Rounds won | 1.9% ± 4.1 | 1.0% ± 4.1 | +1.0 ± 8.2 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 34.8% ± 9.8 | 40.0% ± 13.2 | -5.2 ± 19.9 |
| jk.melee.Neuromancer 7.12 | 39.4% ± 12.9 | 41.0% ± 4.8 | -1.6 ± 17.5 |
| voidious.Diamond 1.8.28 | 41.1% ± 13.3 | 44.0% ± 13.4 | -2.9 ± 24.3 |
| justin.DemonicRage 3.4 | 37.8% ± 7.9 | 44.9% ± 2.9 | -7.1 ± 8.3 |
| rsalesc.melee.Medina 0.4.5 | 52.0% ± 6.3 | 56.4% ± 2.7 | -4.3 ± 5.8 |
| mn.Combat 3.25.0 | 41.7% ± 5.8 | 47.8% ± 16.4 | -6.2 ± 16.5 |
| rz.Aleph 0.34 | 46.7% ± 5.4 | 49.6% ± 4.0 | -2.9 ± 9.4 |
| wompi.Numbat 2.1 | 52.9% ± 10.0 | 48.8% ± 7.2 | +4.1 ± 17.0 |
| catcat20.Lambda 0.024 | 50.4% ± 22.1 | 48.7% ± 6.4 | +1.7 ± 28.3 |

## Melee bench: E

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

Skipped turns: 5 over 3 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 46.8 | 49.7 | 1 / 105 | 5.52 | 8.8% | 4951 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.7 | 12.5% | 27 |
| aaa.r.ScalarR 0.005g.047 | 1.7 | 13.2% | 23 |
| voidious.Diamond 1.8.28 | 3.7 | 11.2% | 15 |
| justin.DemonicRage 3.4 | 4.0 | 10.8% | 10 |
| wompi.Numbat 2.1 | 6.0 | 9.2% | 8 |
| catcat20.Lambda 0.024 | 6.3 | 9.2% | 6 |
| rz.Aleph 0.34 | 7.0 | 8.9% | 4 |
| mn.Combat 3.25.0 | 7.0 | 9.6% | 7 |
| hadur2.Hadur 3.13 | 7.7 | 8.8% | 1 |
| rsalesc.melee.Medina 0.4.5 | 10.0 | 6.8% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 9 | 47.5 | 51.7 | 0 / 35 | 1553 |
| 2 | 9 | 43.7 | 42.2 | 1 / 35 | 1590 |
| 3 | 5 | 49.2 | 55.2 | 0 / 35 | 1808 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 4 | 0% |
| jk.melee.Neuromancer 7.12 | 3 | 0% |
| aaa.r.ScalarR 0.005g.047 | 2 | 0% |
| rsalesc.melee.Medina 0.4.5 | 1 | 0% |
| rz.Aleph 0.34 | 1 | 100% |
| catcat20.Lambda 0.024 | 1 | 0% |
| mn.Combat 3.25.0 | 1 | 0% |

Hadur died in 104 of 105 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 20 | 19% | 20 |
| aaa.r.ScalarR 0.005g.047 | 17 | 16% | 17 |
| jk.melee.Neuromancer 7.12 | 15 | 14% | 15 |
| rz.Aleph 0.34 | 12 | 12% | 13 |
| catcat20.Lambda 0.024 | 12 | 12% | 12 |
| rsalesc.melee.Medina 0.4.5 | 8 | 8% | 8 |
| justin.DemonicRage 3.4 | 8 | 8% | 8 |
| wompi.Numbat 2.1 | 6 | 6% | 6 |
| mn.Combat 3.25.0 | 6 | 6% | 6 |

Posture (Hadur's M records, 105 rounds): 55455 melee ticks, 3371 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 49 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 20689 sent, 18390 reached their opponent, 2358 virtual hits (12.8% of those reached).

