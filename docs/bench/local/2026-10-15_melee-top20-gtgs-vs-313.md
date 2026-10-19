# Bench suite: melee-top20.txt

## Melee bench: A

hadur2.Hadur 3.13gtgs against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 23 over 3 battles (7.7 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 49.2 | 54.0 | 3 / 105 | 5.14 | 9.4% | 5033 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.3 | 14.6% | 32 |
| jk.melee.Neuromancer 7.12 | 1.7 | 14.1% | 34 |
| ags.Glacier 0.2.11 | 3.7 | 10.8% | 5 |
| positive.Portia 1.26e | 5.0 | 10.0% | 9 |
| justin.Mallais 14.0 | 5.7 | 9.5% | 5 |
| rsalesc.melee.Medina 0.4.5 | 5.7 | 9.3% | 8 |
| hadur2.Hadur 3.13gtgs | 6.0 | 9.4% | 3 |
| catcat20.Matcha 0.006 | 8.0 | 7.9% | 8 |
| wompi.Wallaby 5.1 | 8.0 | 7.8% | 0 |
| stelo.PastFuture 2.3.2 | 10.0 | 6.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 8 | 46.9 | 49.5 | 0 / 35 | 1578 |
| 2 | 6 | 47.9 | 50.8 | 1 / 35 | 1632 |
| 3 | 4 | 52.9 | 61.6 | 2 / 35 | 1823 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 6 | 0% |
| positive.Portia 1.26e | 3 | 33% |
| aaa.r.ScalarR 0.005g.047 | 3 | 0% |
| catcat20.Matcha 0.006 | 2 | 50% |
| rsalesc.melee.Medina 0.4.5 | 1 | 0% |
| justin.Mallais 14.0 | 1 | 0% |
| ags.Glacier 0.2.11 | 1 | 100% |

Hadur died in 102 of 105 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 20 | 20% | 20 |
| aaa.r.ScalarR 0.005g.047 | 15 | 15% | 15 |
| rsalesc.melee.Medina 0.4.5 | 15 | 15% | 14 |
| positive.Portia 1.26e | 14 | 14% | 15 |
| justin.Mallais 14.0 | 13 | 13% | 14 |
| ags.Glacier 0.2.11 | 10 | 10% | 11 |
| catcat20.Matcha 0.006 | 9 | 9% | 10 |
| stelo.PastFuture 2.3.2 | 5 | 5% | 5 |
| wompi.Wallaby 5.1 | 1 | 1% | 1 |

Posture (Hadur's M records, 105 rounds): 57290 melee ticks, 5228 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 41 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 21986 sent, 19541 reached their opponent, 2657 virtual hits (13.6% of those reached).

## Paired A/B: hadur2.Hadur 3.13gtgs vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 3 of 3, baseline 3 of 3, 3 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 49.2% ± 8.0 | 51.5% ± 6.5 | -2.3 ± 6.5 |
| Survival | 54.0% ± 16.5 | 58.0% ± 14.1 | -4.0 ± 18.2 |
| Rounds won | 2.9% ± 7.1 | 3.8% ± 10.8 | -1.0 ± 4.1 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 39.3% ± 9.7 | 36.8% ± 5.2 | +2.5 ± 6.5 |
| jk.melee.Neuromancer 7.12 | 40.1% ± 9.3 | 40.6% ± 5.6 | -0.5 ± 14.1 |
| positive.Portia 1.26e | 48.5% ± 10.0 | 51.1% ± 9.5 | -2.7 ± 5.4 |
| ags.Glacier 0.2.11 | 46.6% ± 13.4 | 50.9% ± 11.7 | -4.4 ± 12.3 |
| rsalesc.melee.Medina 0.4.5 | 50.3% ± 3.7 | 57.3% ± 8.3 | -7.0 ± 7.7 |
| catcat20.Matcha 0.006 | 54.4% ± 15.4 | 53.9% ± 6.7 | +0.4 ± 9.5 |
| justin.Mallais 14.0 | 49.7% ± 15.9 | 53.3% ± 9.6 | -3.6 ± 15.7 |
| wompi.Wallaby 5.1 | 54.7% ± 5.5 | 57.8% ± 2.1 | -3.2 ± 3.8 |
| stelo.PastFuture 2.3.2 | 59.3% ± 6.3 | 62.0% ± 4.7 | -2.7 ± 8.6 |

## Melee bench: A

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

Skipped turns: 8 over 3 battles (2.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 51.5 | 58.0 | 4 / 105 | 4.78 | 10.1% | 5217 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 17.3% | 44 |
| jk.melee.Neuromancer 7.12 | 2.0 | 14.8% | 34 |
| ags.Glacier 0.2.11 | 4.0 | 9.7% | 4 |
| hadur2.Hadur 3.13 | 4.0 | 10.1% | 4 |
| positive.Portia 1.26e | 4.3 | 9.6% | 5 |
| justin.Mallais 14.0 | 6.0 | 8.8% | 3 |
| catcat20.Matcha 0.006 | 6.7 | 8.6% | 5 |
| wompi.Wallaby 5.1 | 8.3 | 7.4% | 1 |
| rsalesc.melee.Medina 0.4.5 | 8.7 | 7.5% | 4 |
| stelo.PastFuture 2.3.2 | 10.0 | 6.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 48.5 | 51.7 | 0 / 35 | 1700 |
| 2 | 3 | 53.1 | 62.9 | 1 / 35 | 1682 |
| 3 | 3 | 53.0 | 59.4 | 3 / 35 | 1835 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 6 | 17% |
| positive.Portia 1.26e | 3 | 33% |
| jk.melee.Neuromancer 7.12 | 2 | 0% |
| rsalesc.melee.Medina 0.4.5 | 1 | 0% |
| catcat20.Matcha 0.006 | 1 | 100% |
| ags.Glacier 0.2.11 | 1 | 0% |
| wompi.Wallaby 5.1 | 1 | 100% |

Hadur died in 101 of 105 rounds, at a mean tick of 605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 26 | 26% | 27 |
| ags.Glacier 0.2.11 | 15 | 15% | 16 |
| jk.melee.Neuromancer 7.12 | 15 | 15% | 15 |
| positive.Portia 1.26e | 10 | 10% | 10 |
| rsalesc.melee.Medina 0.4.5 | 9 | 9% | 10 |
| stelo.PastFuture 2.3.2 | 8 | 8% | 8 |
| catcat20.Matcha 0.006 | 6 | 6% | 7 |
| wompi.Wallaby 5.1 | 6 | 6% | 6 |
| justin.Mallais 14.0 | 6 | 6% | 6 |

Posture (Hadur's M records, 105 rounds): 61584 melee ticks, 3649 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 31 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 22292 sent, 19990 reached their opponent, 2706 virtual hits (13.5% of those reached).

## Melee bench: B

hadur2.Hadur 3.13gtgs against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 9 over 3 battles (3.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 49.2 | 53.5 | 3 / 105 | 5.18 | 9.4% | 5436 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 14.8% | 36 |
| justin.DemonicRage 3.4 | 2.3 | 12.7% | 12 |
| kc.mini.Mirage 0.2 | 3.7 | 12.0% | 15 |
| abc.Shadow 3.84i | 4.0 | 11.1% | 12 |
| rz.Aleph 0.34 | 4.3 | 11.4% | 14 |
| hadur2.Hadur 3.13gtgs | 5.7 | 9.4% | 3 |
| wompi.Wallaby 5.1 | 7.3 | 8.1% | 4 |
| stelo.Spread 0.9 | 8.0 | 7.6% | 5 |
| stelo.PastFuture 2.3.2 | 9.0 | 6.6% | 3 |
| kc.micro.Figment 1.0 | 9.7 | 6.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 49.4 | 55.6 | 0 / 35 | 1764 |
| 2 | 6 | 47.0 | 49.2 | 0 / 35 | 1675 |
| 3 | 5 | 51.3 | 55.9 | 3 / 35 | 1997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 5 | 0% |
| kc.mini.Mirage 0.2 | 5 | 40% |
| rz.Aleph 0.34 | 3 | 33% |
| wompi.Wallaby 5.1 | 1 | 0% |
| justin.DemonicRage 3.4 | 1 | 0% |
| abc.Shadow 3.84i | 1 | 0% |

Hadur died in 102 of 105 rounds, at a mean tick of 608. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 23 | 23% | 23 |
| jk.melee.Neuromancer 7.12 | 19 | 19% | 19 |
| justin.DemonicRage 3.4 | 12 | 12% | 12 |
| kc.mini.Mirage 0.2 | 11 | 11% | 13 |
| stelo.PastFuture 2.3.2 | 10 | 10% | 10 |
| abc.Shadow 3.84i | 9 | 9% | 10 |
| wompi.Wallaby 5.1 | 7 | 7% | 7 |
| kc.micro.Figment 1.0 | 6 | 6% | 6 |
| stelo.Spread 0.9 | 5 | 5% | 5 |

Posture (Hadur's M records, 105 rounds): 61415 melee ticks, 3636 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 48 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 23148 sent, 20783 reached their opponent, 2739 virtual hits (13.2% of those reached).

## Paired A/B: hadur2.Hadur 3.13gtgs vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 3 of 3, baseline 3 of 3, 3 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 49.2% ± 5.4 | 49.8% ± 11.2 | -0.5 ± 13.5 |
| Survival | 53.5% ± 9.3 | 54.2% ± 19.1 | -0.6 ± 25.7 |
| Rounds won | 2.9% ± 12.3 | 4.8% ± 10.8 | -1.9 ± 8.2 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 38.9% ± 10.1 | 40.6% ± 2.9 | -1.7 ± 12.9 |
| justin.DemonicRage 3.4 | 42.4% ± 3.2 | 44.0% ± 17.7 | -1.6 ± 17.2 |
| abc.Shadow 3.84i | 45.7% ± 6.3 | 45.0% ± 7.1 | +0.7 ± 9.1 |
| kc.mini.Mirage 0.2 | 43.9% ± 2.4 | 45.3% ± 19.9 | -1.4 ± 17.5 |
| rz.Aleph 0.34 | 45.3% ± 13.2 | 46.0% ± 13.1 | -0.7 ± 15.0 |
| kc.micro.Figment 1.0 | 59.7% ± 3.4 | 58.3% ± 4.7 | +1.4 ± 8.0 |
| wompi.Wallaby 5.1 | 53.5% ± 8.6 | 52.0% ± 9.0 | +1.5 ± 9.9 |
| stelo.PastFuture 2.3.2 | 58.5% ± 11.2 | 58.7% ± 19.8 | -0.2 ± 28.2 |
| stelo.Spread 0.9 | 55.3% ± 1.4 | 58.0% ± 16.3 | -2.7 ± 15.9 |

## Melee bench: B

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

Skipped turns: 14 over 3 battles (4.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 49.8 | 54.2 | 5 / 105 | 5.12 | 9.6% | 5609 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.7 | 14.1% | 31 |
| justin.DemonicRage 3.4 | 3.0 | 12.3% | 18 |
| kc.mini.Mirage 0.2 | 3.3 | 11.7% | 16 |
| abc.Shadow 3.84i | 3.7 | 11.7% | 10 |
| rz.Aleph 0.34 | 4.0 | 11.3% | 12 |
| hadur2.Hadur 3.13 | 6.0 | 9.6% | 5 |
| wompi.Wallaby 5.1 | 6.7 | 8.8% | 3 |
| kc.micro.Figment 1.0 | 8.7 | 6.9% | 3 |
| stelo.PastFuture 2.3.2 | 9.0 | 6.7% | 4 |
| stelo.Spread 0.9 | 9.0 | 6.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 8 | 44.6 | 45.4 | 0 / 35 | 1508 |
| 2 | 5 | 53.0 | 59.7 | 2 / 35 | 2213 |
| 3 | 5 | 51.6 | 57.5 | 3 / 35 | 1888 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 3 | 67% |
| jk.melee.Neuromancer 7.12 | 3 | 0% |
| kc.mini.Mirage 0.2 | 2 | 0% |
| rz.Aleph 0.34 | 2 | 100% |
| wompi.Wallaby 5.1 | 1 | 0% |
| abc.Shadow 3.84i | 1 | 0% |
| kc.micro.Figment 1.0 | 1 | 100% |

Hadur died in 100 of 105 rounds, at a mean tick of 588. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 17 | 17% | 18 |
| justin.DemonicRage 3.4 | 14 | 14% | 16 |
| abc.Shadow 3.84i | 14 | 14% | 14 |
| jk.melee.Neuromancer 7.12 | 14 | 14% | 14 |
| kc.mini.Mirage 0.2 | 12 | 12% | 13 |
| stelo.PastFuture 2.3.2 | 10 | 10% | 10 |
| stelo.Spread 0.9 | 8 | 8% | 8 |
| wompi.Wallaby 5.1 | 6 | 6% | 6 |
| kc.micro.Figment 1.0 | 5 | 5% | 6 |

Posture (Hadur's M records, 105 rounds): 61146 melee ticks, 3443 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 55 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 22757 sent, 20366 reached their opponent, 2663 virtual hits (13.1% of those reached).

## Melee bench: C

hadur2.Hadur 3.13gtgs against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 9 over 3 battles (3.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 50.9 | 57.6 | 7 / 105 | 4.82 | 10.1% | 5545 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.7 | 12.4% | 21 |
| cb.fire.Firestarter 2.0f | 2.0 | 12.4% | 24 |
| abc.Shadow 3.84i | 3.7 | 11.1% | 16 |
| hadur2.Hadur 3.13gtgs | 4.7 | 10.1% | 7 |
| wompi.Numbat 2.1 | 5.0 | 10.5% | 10 |
| ags.Glacier 0.2.11 | 5.3 | 10.4% | 6 |
| catcat20.Lambda 0.024 | 6.7 | 9.2% | 9 |
| justin.Mallais 14.0 | 7.3 | 9.4% | 7 |
| wompi.Wallaby 5.1 | 9.0 | 7.7% | 3 |
| kc.micro.Figment 1.0 | 9.7 | 6.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 50.9 | 57.1 | 3 / 35 | 1847 |
| 2 | 5 | 51.0 | 58.7 | 2 / 35 | 1757 |
| 3 | 4 | 50.9 | 56.8 | 2 / 35 | 1941 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Lambda 0.024 | 6 | 50% |
| cb.fire.Firestarter 2.0f | 5 | 0% |
| voidious.Diamond 1.8.28 | 5 | 0% |
| wompi.Numbat 2.1 | 2 | 100% |
| ags.Glacier 0.2.11 | 2 | 50% |
| abc.Shadow 3.84i | 2 | 50% |
| kc.micro.Figment 1.0 | 1 | 0% |

Hadur died in 98 of 105 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 18 | 18% | 18 |
| justin.Mallais 14.0 | 17 | 17% | 17 |
| voidious.Diamond 1.8.28 | 17 | 17% | 17 |
| kc.micro.Figment 1.0 | 11 | 11% | 11 |
| abc.Shadow 3.84i | 10 | 10% | 10 |
| catcat20.Lambda 0.024 | 8 | 8% | 12 |
| ags.Glacier 0.2.11 | 8 | 8% | 10 |
| wompi.Wallaby 5.1 | 5 | 5% | 5 |
| wompi.Numbat 2.1 | 4 | 4% | 5 |

Posture (Hadur's M records, 105 rounds): 63432 melee ticks, 5115 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 34 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 24068 sent, 21654 reached their opponent, 2741 virtual hits (12.7% of those reached).

## Paired A/B: hadur2.Hadur 3.13gtgs vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 3 of 3, baseline 3 of 3, 3 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 50.9% ± 0.1 | 50.9% ± 5.3 | +0.0 ± 5.3 |
| Survival | 57.6% ± 2.5 | 56.9% ± 13.8 | +0.6 ± 14.5 |
| Rounds won | 6.7% ± 4.1 | 7.6% ± 4.1 | -1.0 ± 8.2 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 45.1% ± 6.5 | 45.3% ± 4.5 | -0.2 ± 10.7 |
| voidious.Diamond 1.8.28 | 45.0% ± 3.7 | 43.2% ± 8.4 | +1.7 ± 6.1 |
| abc.Shadow 3.84i | 47.8% ± 8.0 | 46.1% ± 10.7 | +1.7 ± 10.4 |
| ags.Glacier 0.2.11 | 49.4% ± 5.6 | 49.2% ± 5.5 | +0.1 ± 9.9 |
| wompi.Numbat 2.1 | 49.3% ± 3.9 | 49.9% ± 1.2 | -0.7 ± 2.8 |
| justin.Mallais 14.0 | 51.9% ± 1.7 | 50.8% ± 12.7 | +1.2 ± 12.9 |
| kc.micro.Figment 1.0 | 60.2% ± 6.8 | 60.8% ± 5.9 | -0.6 ± 4.7 |
| catcat20.Lambda 0.024 | 52.7% ± 9.4 | 56.2% ± 10.8 | -3.6 ± 16.5 |
| wompi.Wallaby 5.1 | 57.0% ± 4.9 | 56.7% ± 3.7 | +0.3 ± 8.6 |

## Melee bench: C

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

Skipped turns: 15 over 3 battles (5.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 50.9 | 56.9 | 8 / 105 | 4.88 | 10.1% | 5560 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.7 | 13.3% | 28 |
| cb.fire.Firestarter 2.0f | 2.0 | 12.2% | 22 |
| abc.Shadow 3.84i | 2.3 | 11.9% | 10 |
| ags.Glacier 0.2.11 | 5.3 | 10.4% | 5 |
| wompi.Numbat 2.1 | 5.3 | 10.1% | 11 |
| hadur2.Hadur 3.13 | 5.3 | 10.1% | 8 |
| justin.Mallais 14.0 | 6.3 | 9.8% | 9 |
| catcat20.Lambda 0.024 | 8.3 | 7.9% | 8 |
| wompi.Wallaby 5.1 | 8.3 | 7.7% | 3 |
| kc.micro.Figment 1.0 | 10.0 | 6.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 7 | 48.6 | 51.4 | 2 / 35 | 1938 |
| 2 | 5 | 51.3 | 56.8 | 3 / 35 | 1870 |
| 3 | 4 | 52.9 | 62.5 | 3 / 35 | 1752 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Lambda 0.024 | 5 | 40% |
| voidious.Diamond 1.8.28 | 5 | 20% |
| abc.Shadow 3.84i | 4 | 75% |
| cb.fire.Firestarter 2.0f | 2 | 50% |
| wompi.Numbat 2.1 | 1 | 0% |
| justin.Mallais 14.0 | 1 | 0% |

Hadur died in 97 of 105 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 19 | 20% | 20 |
| cb.fire.Firestarter 2.0f | 16 | 16% | 17 |
| wompi.Numbat 2.1 | 15 | 15% | 15 |
| justin.Mallais 14.0 | 11 | 11% | 13 |
| abc.Shadow 3.84i | 10 | 10% | 13 |
| catcat20.Lambda 0.024 | 8 | 8% | 9 |
| ags.Glacier 0.2.11 | 8 | 8% | 8 |
| wompi.Wallaby 5.1 | 6 | 6% | 6 |
| kc.micro.Figment 1.0 | 4 | 4% | 4 |

Posture (Hadur's M records, 105 rounds): 64180 melee ticks, 4468 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 48 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 23672 sent, 21369 reached their opponent, 2748 virtual hits (12.9% of those reached).

## Melee bench: D

hadur2.Hadur 3.13gtgs against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 8 over 3 battles (2.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 51.9 | 61.0 | 2 / 105 | 4.51 | 10.3% | 4981 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 15.0% | 40 |
| cb.fire.Firestarter 2.0f | 2.3 | 12.8% | 25 |
| kc.mini.Mirage 0.2 | 3.0 | 11.8% | 8 |
| hadur2.Hadur 3.13gtgs | 4.3 | 10.3% | 2 |
| mn.Combat 3.25.0 | 5.3 | 10.2% | 7 |
| positive.Portia 1.26e | 6.0 | 9.6% | 8 |
| catcat20.Lambda 0.024 | 6.7 | 8.6% | 6 |
| catcat20.Matcha 0.006 | 7.3 | 9.1% | 5 |
| stelo.Spread 0.9 | 9.3 | 6.7% | 3 |
| kc.micro.Figment 1.0 | 9.7 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 52.7 | 63.8 | 1 / 35 | 1577 |
| 2 | 4 | 51.9 | 61.6 | 0 / 35 | 1641 |
| 3 | 6 | 51.2 | 57.5 | 1 / 35 | 1763 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 9 | 0% |
| catcat20.Lambda 0.024 | 3 | 0% |
| cb.fire.Firestarter 2.0f | 3 | 0% |
| catcat20.Matcha 0.006 | 1 | 0% |
| mn.Combat 3.25.0 | 1 | 100% |
| positive.Portia 1.26e | 1 | 0% |
| kc.mini.Mirage 0.2 | 1 | 100% |

Hadur died in 103 of 105 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 32 | 31% | 32 |
| cb.fire.Firestarter 2.0f | 15 | 15% | 15 |
| kc.mini.Mirage 0.2 | 14 | 14% | 15 |
| stelo.Spread 0.9 | 9 | 9% | 9 |
| positive.Portia 1.26e | 9 | 9% | 9 |
| mn.Combat 3.25.0 | 8 | 8% | 9 |
| catcat20.Matcha 0.006 | 8 | 8% | 8 |
| catcat20.Lambda 0.024 | 7 | 7% | 7 |
| kc.micro.Figment 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 105 rounds): 63661 melee ticks, 5723 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 48 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 23035 sent, 20617 reached their opponent, 2704 virtual hits (13.1% of those reached).

## Paired A/B: hadur2.Hadur 3.13gtgs vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 3 of 3, baseline 3 of 3, 3 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 51.9% ± 1.9 | 50.6% ± 4.4 | +1.4 ± 2.8 |
| Survival | 61.0% ± 8.0 | 57.6% ± 10.1 | +3.4 ± 7.7 |
| Rounds won | 1.9% ± 4.1 | 2.9% ± 7.1 | -1.0 ± 4.1 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 40.7% ± 3.8 | 41.3% ± 10.0 | -0.6 ± 6.2 |
| cb.fire.Firestarter 2.0f | 44.7% ± 8.5 | 43.5% ± 5.2 | +1.2 ± 10.5 |
| positive.Portia 1.26e | 51.9% ± 9.3 | 48.8% ± 1.7 | +3.0 ± 10.9 |
| kc.mini.Mirage 0.2 | 46.6% ± 8.0 | 47.5% ± 7.0 | -0.9 ± 5.6 |
| mn.Combat 3.25.0 | 50.2% ± 3.9 | 48.2% ± 7.9 | +2.0 ± 10.7 |
| catcat20.Matcha 0.006 | 53.2% ± 2.0 | 52.5% ± 6.2 | +0.7 ± 4.8 |
| kc.micro.Figment 1.0 | 64.4% ± 9.9 | 64.6% ± 15.6 | -0.2 ± 18.2 |
| catcat20.Lambda 0.024 | 54.9% ± 13.5 | 49.8% ± 10.6 | +5.1 ± 17.0 |
| stelo.Spread 0.9 | 60.7% ± 6.3 | 58.7% ± 9.1 | +2.0 ± 7.5 |

## Melee bench: D

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

Skipped turns: 13 over 3 battles (4.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 50.6 | 57.6 | 3 / 105 | 4.82 | 9.9% | 4946 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.3 | 14.1% | 30 |
| cb.fire.Firestarter 2.0f | 1.7 | 12.8% | 25 |
| kc.mini.Mirage 0.2 | 4.3 | 10.9% | 4 |
| positive.Portia 1.26e | 4.7 | 10.3% | 12 |
| mn.Combat 3.25.0 | 4.7 | 10.6% | 14 |
| catcat20.Lambda 0.024 | 5.3 | 9.9% | 11 |
| hadur2.Hadur 3.13 | 6.0 | 9.9% | 3 |
| catcat20.Matcha 0.006 | 8.0 | 8.9% | 6 |
| stelo.Spread 0.9 | 9.0 | 7.0% | 2 |
| kc.micro.Figment 1.0 | 10.0 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.6 | 62.2 | 2 / 35 | 1744 |
| 2 | 7 | 49.6 | 54.6 | 0 / 35 | 1549 |
| 3 | 6 | 49.5 | 55.9 | 1 / 35 | 1653 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 6 | 0% |
| mn.Combat 3.25.0 | 3 | 0% |
| positive.Portia 1.26e | 2 | 100% |
| cb.fire.Firestarter 2.0f | 2 | 0% |
| catcat20.Lambda 0.024 | 1 | 0% |
| catcat20.Matcha 0.006 | 1 | 0% |
| kc.mini.Mirage 0.2 | 1 | 100% |

Hadur died in 102 of 105 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 20 | 20% | 20 |
| aaa.r.ScalarR 0.005g.047 | 19 | 19% | 19 |
| kc.mini.Mirage 0.2 | 13 | 13% | 14 |
| mn.Combat 3.25.0 | 12 | 12% | 12 |
| positive.Portia 1.26e | 10 | 10% | 12 |
| catcat20.Matcha 0.006 | 10 | 10% | 10 |
| catcat20.Lambda 0.024 | 7 | 7% | 7 |
| stelo.Spread 0.9 | 7 | 7% | 7 |
| kc.micro.Figment 1.0 | 4 | 4% | 4 |

Posture (Hadur's M records, 105 rounds): 62312 melee ticks, 5650 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 30 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 22106 sent, 19781 reached their opponent, 2653 virtual hits (13.4% of those reached).

## Melee bench: E

hadur2.Hadur 3.13gtgs against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 14 over 3 battles (4.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 49.3 | 53.8 | 3 / 105 | 5.16 | 9.5% | 5193 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 14.2% | 28 |
| voidious.Diamond 1.8.28 | 3.0 | 10.9% | 16 |
| jk.melee.Neuromancer 7.12 | 3.3 | 11.4% | 19 |
| justin.DemonicRage 3.4 | 3.3 | 10.9% | 14 |
| mn.Combat 3.25.0 | 6.3 | 9.8% | 9 |
| rz.Aleph 0.34 | 6.3 | 9.8% | 2 |
| hadur2.Hadur 3.13gtgs | 7.0 | 9.5% | 3 |
| catcat20.Lambda 0.024 | 7.0 | 8.8% | 8 |
| wompi.Numbat 2.1 | 7.7 | 8.4% | 6 |
| rsalesc.melee.Medina 0.4.5 | 10.0 | 6.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 8 | 48.1 | 51.7 | 1 / 35 | 1643 |
| 2 | 5 | 49.9 | 54.0 | 1 / 35 | 1834 |
| 3 | 8 | 49.9 | 55.6 | 1 / 35 | 1716 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 4 | 0% |
| mn.Combat 3.25.0 | 4 | 50% |
| voidious.Diamond 1.8.28 | 2 | 50% |
| jk.melee.Neuromancer 7.12 | 2 | 0% |
| justin.DemonicRage 3.4 | 2 | 0% |
| catcat20.Lambda 0.024 | 1 | 0% |
| rsalesc.melee.Medina 0.4.5 | 1 | 0% |
| wompi.Numbat 2.1 | 1 | 0% |

Hadur died in 102 of 105 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 15 | 15% | 17 |
| aaa.r.ScalarR 0.005g.047 | 15 | 15% | 15 |
| jk.melee.Neuromancer 7.12 | 13 | 13% | 13 |
| voidious.Diamond 1.8.28 | 12 | 12% | 13 |
| justin.DemonicRage 3.4 | 12 | 12% | 12 |
| rz.Aleph 0.34 | 11 | 11% | 11 |
| wompi.Numbat 2.1 | 10 | 10% | 10 |
| catcat20.Lambda 0.024 | 8 | 8% | 8 |
| rsalesc.melee.Medina 0.4.5 | 6 | 6% | 6 |

Posture (Hadur's M records, 104 rounds): 56590 melee ticks, 4991 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (104 rounds): longest scan gap while four or more were alive 74 ticks (104 rounds over 8); rounds whose longest gap at any count was over 8: 104; robots dropped as dead without a death event: 0.

Targeting waves (104 rounds): 22262 sent, 19871 reached their opponent, 2472 virtual hits (12.4% of those reached).

## Paired A/B: hadur2.Hadur 3.13gtgs vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 3 of 3, baseline 3 of 3, 3 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 49.3% ± 2.6 | 47.8% ± 3.7 | +1.5 ± 6.1 |
| Survival | 53.8% ± 4.8 | 50.9% ± 7.2 | +2.9 ± 11.0 |
| Rounds won | 2.9% ± 0.0 | 1.9% ± 4.1 | +1.0 ± 4.1 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 40.2% ± 6.5 | 39.6% ± 6.6 | +0.6 ± 10.4 |
| jk.melee.Neuromancer 7.12 | 45.6% ± 6.2 | 45.2% ± 17.4 | +0.4 ± 11.7 |
| voidious.Diamond 1.8.28 | 46.6% ± 4.0 | 46.0% ± 2.2 | +0.6 ± 5.7 |
| justin.DemonicRage 3.4 | 46.7% ± 3.7 | 45.5% ± 6.9 | +1.2 ± 8.1 |
| rsalesc.melee.Medina 0.4.5 | 60.3% ± 1.8 | 56.8% ± 11.8 | +3.4 ± 10.8 |
| mn.Combat 3.25.0 | 49.4% ± 4.9 | 47.0% ± 4.8 | +2.4 ± 7.9 |
| rz.Aleph 0.34 | 49.4% ± 3.5 | 48.9% ± 7.9 | +0.5 ± 10.4 |
| wompi.Numbat 2.1 | 53.3% ± 13.7 | 52.3% ± 7.8 | +1.0 ± 14.6 |
| catcat20.Lambda 0.024 | 52.2% ± 10.3 | 48.4% ± 3.6 | +3.8 ± 13.2 |

## Melee bench: E

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

Skipped turns: 10 over 3 battles (3.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 47.8 | 50.9 | 2 / 105 | 5.42 | 9.0% | 5025 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 13.8% | 24 |
| justin.DemonicRage 3.4 | 3.3 | 10.8% | 10 |
| voidious.Diamond 1.8.28 | 3.7 | 10.6% | 13 |
| jk.melee.Neuromancer 7.12 | 4.3 | 11.2% | 18 |
| mn.Combat 3.25.0 | 4.7 | 10.2% | 15 |
| catcat20.Lambda 0.024 | 5.7 | 9.6% | 8 |
| rz.Aleph 0.34 | 6.7 | 9.5% | 6 |
| hadur2.Hadur 3.13 | 7.3 | 9.0% | 2 |
| wompi.Numbat 2.1 | 8.7 | 8.3% | 4 |
| rsalesc.melee.Medina 0.4.5 | 9.7 | 6.9% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 7 | 49.3 | 54.0 | 1 / 35 | 1696 |
| 2 | 8 | 46.3 | 48.3 | 0 / 35 | 1630 |
| 3 | 7 | 47.7 | 50.5 | 1 / 35 | 1699 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 5 | 0% |
| aaa.r.ScalarR 0.005g.047 | 4 | 0% |
| justin.DemonicRage 3.4 | 2 | 50% |
| mn.Combat 3.25.0 | 2 | 0% |
| catcat20.Lambda 0.024 | 1 | 100% |
| voidious.Diamond 1.8.28 | 1 | 0% |

Hadur died in 103 of 105 rounds, at a mean tick of 572. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 21 | 20% | 21 |
| jk.melee.Neuromancer 7.12 | 15 | 15% | 15 |
| catcat20.Lambda 0.024 | 12 | 12% | 13 |
| justin.DemonicRage 3.4 | 11 | 11% | 12 |
| mn.Combat 3.25.0 | 10 | 10% | 10 |
| voidious.Diamond 1.8.28 | 10 | 10% | 10 |
| wompi.Numbat 2.1 | 9 | 9% | 9 |
| rsalesc.melee.Medina 0.4.5 | 8 | 8% | 8 |
| rz.Aleph 0.34 | 7 | 7% | 7 |

Posture (Hadur's M records, 105 rounds): 57708 melee ticks, 3739 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 104 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 104 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 21065 sent, 18807 reached their opponent, 2366 virtual hits (12.6% of those reached).

