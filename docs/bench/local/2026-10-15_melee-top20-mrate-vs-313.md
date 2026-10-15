# Bench suite: melee-top20.txt

## Melee bench: A

hadur2.Hadur 3.13mr against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 9 over 3 battles (3.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 51.7 | 59.5 | 4 / 105 | 4.65 | 10.3% | 5171 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 15.9% | 44 |
| jk.melee.Neuromancer 7.12 | 2.0 | 13.1% | 25 |
| hadur2.Hadur 3.13mr | 4.3 | 10.3% | 4 |
| ags.Glacier 0.2.11 | 4.7 | 10.1% | 7 |
| rsalesc.melee.Medina 0.4.5 | 5.3 | 9.2% | 6 |
| positive.Portia 1.26e | 5.7 | 9.4% | 5 |
| catcat20.Matcha 0.006 | 6.3 | 9.2% | 6 |
| justin.Mallais 14.0 | 6.7 | 8.9% | 4 |
| wompi.Wallaby 5.1 | 9.0 | 7.9% | 3 |
| stelo.PastFuture 2.3.2 | 10.0 | 6.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 52.4 | 62.2 | 0 / 35 | 1667 |
| 2 | 3 | 53.7 | 63.5 | 3 / 35 | 1752 |
| 3 | 6 | 49.2 | 52.7 | 1 / 35 | 1752 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 3 | 33% |
| aaa.r.ScalarR 0.005g.047 | 3 | 0% |
| catcat20.Matcha 0.006 | 3 | 33% |
| ags.Glacier 0.2.11 | 3 | 67% |
| jk.melee.Neuromancer 7.12 | 2 | 0% |
| justin.Mallais 14.0 | 2 | 0% |
| positive.Portia 1.26e | 1 | 0% |
| rsalesc.melee.Medina 0.4.5 | 1 | 0% |

Hadur died in 101 of 105 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 25 | 25% | 26 |
| jk.melee.Neuromancer 7.12 | 18 | 18% | 18 |
| rsalesc.melee.Medina 0.4.5 | 13 | 13% | 13 |
| positive.Portia 1.26e | 11 | 11% | 12 |
| ags.Glacier 0.2.11 | 9 | 9% | 10 |
| justin.Mallais 14.0 | 9 | 9% | 9 |
| wompi.Wallaby 5.1 | 7 | 7% | 7 |
| catcat20.Matcha 0.006 | 6 | 6% | 7 |
| stelo.PastFuture 2.3.2 | 3 | 3% | 3 |

Posture (Hadur's M records, 105 rounds): 62842 melee ticks, 5416 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 40 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 23674 sent, 21185 reached their opponent, 2739 virtual hits (12.9% of those reached).

## Paired A/B: hadur2.Hadur 3.13mr vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 3 of 3, baseline 3 of 3, 3 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 51.7% ± 5.8 | 51.0% ± 8.1 | +0.8 ± 7.3 |
| Survival | 59.5% ± 14.7 | 57.4% ± 13.8 | +2.1 ± 11.9 |
| Rounds won | 3.8% ± 10.8 | 3.8% ± 10.8 | +0.0 ± 18.8 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 39.3% ± 9.9 | 39.6% ± 6.5 | -0.3 ± 7.2 |
| jk.melee.Neuromancer 7.12 | 44.0% ± 1.7 | 42.6% ± 9.3 | +1.5 ± 9.5 |
| positive.Portia 1.26e | 52.4% ± 5.9 | 50.7% ± 3.5 | +1.7 ± 9.1 |
| ags.Glacier 0.2.11 | 50.6% ± 13.3 | 51.1% ± 11.0 | -0.4 ± 4.9 |
| rsalesc.melee.Medina 0.4.5 | 52.9% ± 7.1 | 50.6% ± 14.2 | +2.3 ± 10.7 |
| catcat20.Matcha 0.006 | 52.9% ± 3.6 | 52.4% ± 12.3 | +0.5 ± 11.5 |
| justin.Mallais 14.0 | 53.9% ± 15.5 | 53.7% ± 10.3 | +0.2 ± 10.8 |
| wompi.Wallaby 5.1 | 56.6% ± 5.9 | 56.4% ± 10.0 | +0.2 ± 6.2 |
| stelo.PastFuture 2.3.2 | 63.0% ± 5.7 | 61.9% ± 2.5 | +1.0 ± 6.2 |

## Melee bench: A

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

Skipped turns: 7 over 3 battles (2.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 51.0 | 57.4 | 4 / 105 | 4.84 | 10.1% | 5496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 15.3% | 34 |
| jk.melee.Neuromancer 7.12 | 2.0 | 13.6% | 27 |
| ags.Glacier 0.2.11 | 4.3 | 9.6% | 8 |
| rsalesc.melee.Medina 0.4.5 | 4.7 | 9.9% | 13 |
| hadur2.Hadur 3.13 | 5.3 | 10.1% | 4 |
| positive.Portia 1.26e | 5.3 | 9.8% | 6 |
| catcat20.Matcha 0.006 | 6.0 | 9.1% | 6 |
| justin.Mallais 14.0 | 7.3 | 8.7% | 3 |
| wompi.Wallaby 5.1 | 9.0 | 7.8% | 0 |
| stelo.PastFuture 2.3.2 | 10.0 | 6.2% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 54.6 | 63.5 | 3 / 35 | 2205 |
| 2 | 6 | 50.1 | 55.9 | 1 / 35 | 1633 |
| 3 | 7 | 48.3 | 52.7 | 0 / 35 | 1658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 13 | 8% |
| jk.melee.Neuromancer 7.12 | 6 | 17% |
| catcat20.Matcha 0.006 | 1 | 100% |
| wompi.Wallaby 5.1 | 1 | 100% |
| rsalesc.melee.Medina 0.4.5 | 1 | 0% |

Hadur died in 101 of 105 rounds, at a mean tick of 617. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 22 | 22% | 23 |
| jk.melee.Neuromancer 7.12 | 19 | 19% | 19 |
| rsalesc.melee.Medina 0.4.5 | 15 | 15% | 15 |
| justin.Mallais 14.0 | 12 | 12% | 12 |
| ags.Glacier 0.2.11 | 11 | 11% | 12 |
| stelo.PastFuture 2.3.2 | 8 | 8% | 8 |
| catcat20.Matcha 0.006 | 7 | 7% | 8 |
| positive.Portia 1.26e | 7 | 7% | 7 |
| wompi.Wallaby 5.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 104 rounds): 59420 melee ticks, 6003 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (104 rounds): longest scan gap while four or more were alive 39 ticks (104 rounds over 8); rounds whose longest gap at any count was over 8: 104; robots dropped as dead without a death event: 0.

Targeting waves (104 rounds): 22071 sent, 19704 reached their opponent, 2633 virtual hits (13.4% of those reached).

## Melee bench: B

hadur2.Hadur 3.13mr against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 15 over 3 battles (5.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 49.2 | 52.7 | 3 / 105 | 5.26 | 9.3% | 5726 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 15.4% | 35 |
| kc.mini.Mirage 0.2 | 3.0 | 12.0% | 18 |
| justin.DemonicRage 3.4 | 3.0 | 12.0% | 15 |
| rz.Aleph 0.34 | 3.7 | 11.7% | 11 |
| abc.Shadow 3.84i | 4.3 | 11.2% | 15 |
| hadur2.Hadur 3.13mr | 6.7 | 9.3% | 3 |
| wompi.Wallaby 5.1 | 6.7 | 8.7% | 2 |
| kc.micro.Figment 1.0 | 8.7 | 7.1% | 2 |
| stelo.Spread 0.9 | 8.7 | 6.5% | 4 |
| stelo.PastFuture 2.3.2 | 9.3 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 51.1 | 57.1 | 1 / 35 | 1892 |
| 2 | 6 | 51.5 | 56.5 | 1 / 35 | 1995 |
| 3 | 8 | 45.0 | 44.4 | 1 / 35 | 1839 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 5 | 20% |
| kc.mini.Mirage 0.2 | 4 | 50% |
| abc.Shadow 3.84i | 2 | 0% |
| justin.DemonicRage 3.4 | 2 | 0% |
| stelo.Spread 0.9 | 1 | 0% |

Hadur died in 102 of 105 rounds, at a mean tick of 595. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 21 | 21% | 22 |
| jk.melee.Neuromancer 7.12 | 21 | 21% | 22 |
| rz.Aleph 0.34 | 17 | 17% | 17 |
| kc.mini.Mirage 0.2 | 13 | 13% | 14 |
| abc.Shadow 3.84i | 9 | 9% | 9 |
| stelo.Spread 0.9 | 6 | 6% | 6 |
| kc.micro.Figment 1.0 | 6 | 6% | 6 |
| wompi.Wallaby 5.1 | 6 | 6% | 6 |
| stelo.PastFuture 2.3.2 | 3 | 3% | 3 |

Posture (Hadur's M records, 105 rounds): 59772 melee ticks, 4179 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 32 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 23180 sent, 20811 reached their opponent, 2738 virtual hits (13.2% of those reached).

## Paired A/B: hadur2.Hadur 3.13mr vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 3 of 3, baseline 3 of 3, 3 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 49.2% ± 9.0 | 49.8% ± 1.8 | -0.6 ± 9.6 |
| Survival | 52.7% ± 17.8 | 53.9% ± 4.6 | -1.2 ± 20.0 |
| Rounds won | 2.9% ± 0.0 | 1.9% ± 4.1 | +1.0 ± 4.1 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 37.7% ± 7.9 | 39.0% ± 5.0 | -1.2 ± 12.7 |
| justin.DemonicRage 3.4 | 43.7% ± 10.5 | 46.4% ± 5.7 | -2.7 ± 5.1 |
| abc.Shadow 3.84i | 45.3% ± 5.1 | 46.3% ± 1.5 | -1.0 ± 5.7 |
| kc.mini.Mirage 0.2 | 43.7% ± 5.9 | 44.1% ± 2.2 | -0.4 ± 3.8 |
| rz.Aleph 0.34 | 44.5% ± 3.4 | 44.9% ± 3.0 | -0.4 ± 6.3 |
| kc.micro.Figment 1.0 | 56.6% ± 6.4 | 56.8% ± 4.8 | -0.2 ± 7.2 |
| wompi.Wallaby 5.1 | 51.6% ± 10.7 | 53.4% ± 10.2 | -1.8 ± 14.1 |
| stelo.PastFuture 2.3.2 | 60.8% ± 16.1 | 60.1% ± 5.8 | +0.8 ± 18.5 |
| stelo.Spread 0.9 | 59.0% ± 21.7 | 57.7% ± 7.3 | +1.3 ± 29.0 |

## Melee bench: B

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

Skipped turns: 18 over 3 battles (6.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 49.8 | 53.9 | 2 / 105 | 5.15 | 9.6% | 5919 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 15.0% | 44 |
| kc.mini.Mirage 0.2 | 2.3 | 12.2% | 20 |
| rz.Aleph 0.34 | 3.0 | 11.8% | 10 |
| abc.Shadow 3.84i | 4.3 | 11.1% | 9 |
| justin.DemonicRage 3.4 | 4.3 | 11.1% | 9 |
| hadur2.Hadur 3.13 | 6.3 | 9.6% | 2 |
| wompi.Wallaby 5.1 | 7.0 | 8.4% | 0 |
| kc.micro.Figment 1.0 | 8.3 | 7.3% | 2 |
| stelo.Spread 0.9 | 8.3 | 7.1% | 6 |
| stelo.PastFuture 2.3.2 | 10.0 | 6.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 7 | 49.0 | 51.7 | 0 / 35 | 2119 |
| 2 | 6 | 50.4 | 55.2 | 1 / 35 | 1888 |
| 3 | 6 | 50.1 | 54.6 | 1 / 35 | 1912 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 5 | 0% |
| rz.Aleph 0.34 | 2 | 0% |
| kc.mini.Mirage 0.2 | 1 | 0% |
| abc.Shadow 3.84i | 1 | 100% |
| justin.DemonicRage 3.4 | 1 | 100% |

Hadur died in 103 of 105 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 23 | 22% | 24 |
| rz.Aleph 0.34 | 20 | 19% | 20 |
| kc.mini.Mirage 0.2 | 18 | 17% | 18 |
| justin.DemonicRage 3.4 | 13 | 13% | 14 |
| abc.Shadow 3.84i | 12 | 12% | 12 |
| stelo.Spread 0.9 | 6 | 6% | 6 |
| wompi.Wallaby 5.1 | 5 | 5% | 5 |
| kc.micro.Figment 1.0 | 4 | 4% | 4 |
| stelo.PastFuture 2.3.2 | 2 | 2% | 2 |

Posture (Hadur's M records, 105 rounds): 62898 melee ticks, 2520 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 40 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 23304 sent, 21031 reached their opponent, 2839 virtual hits (13.5% of those reached).

## Melee bench: C

hadur2.Hadur 3.13mr against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 10 over 3 battles (3.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 48.4 | 50.6 | 6 / 105 | 5.45 | 9.2% | 5784 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.3 | 14.0% | 26 |
| cb.fire.Firestarter 2.0f | 2.3 | 12.7% | 28 |
| abc.Shadow 3.84i | 3.7 | 11.0% | 9 |
| ags.Glacier 0.2.11 | 5.0 | 10.1% | 2 |
| justin.Mallais 14.0 | 5.7 | 9.7% | 10 |
| wompi.Numbat 2.1 | 6.0 | 9.5% | 8 |
| hadur2.Hadur 3.13mr | 6.3 | 9.2% | 6 |
| catcat20.Lambda 0.024 | 7.0 | 9.0% | 8 |
| wompi.Wallaby 5.1 | 7.7 | 8.3% | 7 |
| kc.micro.Figment 1.0 | 10.0 | 6.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 7 | 47.0 | 47.9 | 0 / 35 | 1867 |
| 2 | 6 | 48.5 | 51.1 | 3 / 35 | 1861 |
| 3 | 6 | 49.6 | 52.7 | 3 / 35 | 2056 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Numbat 2.1 | 3 | 100% |
| voidious.Diamond 1.8.28 | 3 | 0% |
| ags.Glacier 0.2.11 | 2 | 100% |
| catcat20.Lambda 0.024 | 1 | 0% |
| abc.Shadow 3.84i | 1 | 0% |
| kc.micro.Figment 1.0 | 1 | 0% |
| wompi.Wallaby 5.1 | 1 | 100% |
| cb.fire.Firestarter 2.0f | 1 | 0% |

Hadur died in 99 of 105 rounds, at a mean tick of 586. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 17 | 17% | 17 |
| justin.Mallais 14.0 | 17 | 17% | 17 |
| voidious.Diamond 1.8.28 | 16 | 16% | 18 |
| abc.Shadow 3.84i | 13 | 13% | 13 |
| ags.Glacier 0.2.11 | 9 | 9% | 10 |
| catcat20.Lambda 0.024 | 9 | 9% | 9 |
| kc.micro.Figment 1.0 | 8 | 8% | 9 |
| wompi.Wallaby 5.1 | 8 | 8% | 9 |
| wompi.Numbat 2.1 | 2 | 2% | 3 |

Posture (Hadur's M records, 105 rounds): 60357 melee ticks, 3480 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 49 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 23168 sent, 20749 reached their opponent, 2768 virtual hits (13.3% of those reached).

## Paired A/B: hadur2.Hadur 3.13mr vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 3 of 3, baseline 3 of 3, 3 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 48.4% ± 3.2 | 53.0% ± 2.3 | -4.6 ± 4.4 |
| Survival | 50.6% ± 6.0 | 61.0% ± 8.7 | -10.4 ± 13.4 |
| Rounds won | 5.7% ± 12.3 | 5.7% ± 7.1 | +0.0 ± 18.8 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 42.3% ± 12.6 | 44.4% ± 11.7 | -2.1 ± 18.7 |
| voidious.Diamond 1.8.28 | 39.7% ± 5.1 | 46.0% ± 4.1 | -6.3 ± 9.2 |
| abc.Shadow 3.84i | 45.6% ± 7.1 | 49.1% ± 6.9 | -3.5 ± 10.7 |
| ags.Glacier 0.2.11 | 47.6% ± 2.6 | 50.2% ± 7.0 | -2.6 ± 9.3 |
| wompi.Numbat 2.1 | 49.7% ± 11.0 | 52.5% ± 2.9 | -2.8 ± 13.1 |
| justin.Mallais 14.0 | 48.9% ± 13.7 | 55.0% ± 9.5 | -6.1 ± 22.3 |
| kc.micro.Figment 1.0 | 58.6% ± 3.4 | 63.3% ± 8.8 | -4.7 ± 11.0 |
| catcat20.Lambda 0.024 | 50.5% ± 11.7 | 57.4% ± 8.4 | -6.8 ± 13.9 |
| wompi.Wallaby 5.1 | 52.4% ± 2.4 | 58.9% ± 3.8 | -6.5 ± 4.8 |

## Melee bench: C

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

Skipped turns: 37 over 3 battles (12.3 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.0 | 61.0 | 6 / 105 | 4.51 | 10.8% | 6352 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 13.7% | 36 |
| voidious.Diamond 1.8.28 | 2.0 | 12.7% | 20 |
| hadur2.Hadur 3.13 | 4.0 | 10.8% | 6 |
| abc.Shadow 3.84i | 4.0 | 11.3% | 8 |
| ags.Glacier 0.2.11 | 4.3 | 10.8% | 9 |
| wompi.Numbat 2.1 | 6.0 | 9.8% | 6 |
| justin.Mallais 14.0 | 7.0 | 8.9% | 7 |
| catcat20.Lambda 0.024 | 7.7 | 8.1% | 5 |
| wompi.Wallaby 5.1 | 8.7 | 7.6% | 4 |
| kc.micro.Figment 1.0 | 10.0 | 6.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 53.6 | 64.4 | 3 / 35 | 1960 |
| 2 | 5 | 51.9 | 57.5 | 2 / 35 | 2085 |
| 3 | 4 | 53.4 | 61.0 | 1 / 35 | 2307 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 3 | 33% |
| kc.micro.Figment 1.0 | 3 | 67% |
| catcat20.Lambda 0.024 | 2 | 100% |
| wompi.Numbat 2.1 | 2 | 50% |
| cb.fire.Firestarter 2.0f | 2 | 0% |
| abc.Shadow 3.84i | 1 | 0% |
| wompi.Wallaby 5.1 | 1 | 0% |
| voidious.Diamond 1.8.28 | 1 | 0% |

Hadur died in 99 of 105 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 20 | 20% | 20 |
| voidious.Diamond 1.8.28 | 17 | 17% | 17 |
| ags.Glacier 0.2.11 | 13 | 13% | 14 |
| wompi.Numbat 2.1 | 12 | 12% | 12 |
| abc.Shadow 3.84i | 10 | 10% | 11 |
| justin.Mallais 14.0 | 9 | 9% | 10 |
| wompi.Wallaby 5.1 | 7 | 7% | 7 |
| kc.micro.Figment 1.0 | 6 | 6% | 8 |
| catcat20.Lambda 0.024 | 5 | 5% | 6 |

Posture (Hadur's M records, 105 rounds): 68378 melee ticks, 4516 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 46 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 24402 sent, 21973 reached their opponent, 2838 virtual hits (12.9% of those reached).

## Melee bench: D

hadur2.Hadur 3.13mr against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 10 over 3 battles (3.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 51.9 | 59.5 | 2 / 105 | 4.65 | 10.3% | 5537 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 15.2% | 37 |
| kc.mini.Mirage 0.2 | 2.3 | 12.0% | 13 |
| cb.fire.Firestarter 2.0f | 2.7 | 11.9% | 20 |
| hadur2.Hadur 3.13mr | 4.7 | 10.3% | 2 |
| mn.Combat 3.25.0 | 5.7 | 10.2% | 7 |
| positive.Portia 1.26e | 6.0 | 9.8% | 5 |
| catcat20.Matcha 0.006 | 6.7 | 9.2% | 12 |
| catcat20.Lambda 0.024 | 7.3 | 8.9% | 5 |
| stelo.Spread 0.9 | 9.0 | 7.1% | 3 |
| kc.micro.Figment 1.0 | 9.7 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 51.4 | 59.0 | 1 / 35 | 1868 |
| 2 | 4 | 51.8 | 60.6 | 0 / 35 | 1613 |
| 3 | 5 | 52.6 | 58.7 | 1 / 35 | 2056 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 9 | 0% |
| catcat20.Matcha 0.006 | 5 | 0% |
| kc.mini.Mirage 0.2 | 4 | 25% |
| positive.Portia 1.26e | 2 | 50% |
| catcat20.Lambda 0.024 | 1 | 0% |
| stelo.Spread 0.9 | 1 | 0% |
| cb.fire.Firestarter 2.0f | 1 | 0% |

Hadur died in 103 of 105 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 22 | 21% | 23 |
| aaa.r.ScalarR 0.005g.047 | 21 | 20% | 22 |
| cb.fire.Firestarter 2.0f | 15 | 15% | 15 |
| catcat20.Matcha 0.006 | 13 | 13% | 13 |
| catcat20.Lambda 0.024 | 10 | 10% | 10 |
| positive.Portia 1.26e | 9 | 9% | 9 |
| mn.Combat 3.25.0 | 6 | 6% | 6 |
| stelo.Spread 0.9 | 6 | 6% | 6 |
| kc.micro.Figment 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 104 rounds): 62760 melee ticks, 6268 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (104 rounds): longest scan gap while four or more were alive 41 ticks (104 rounds over 8); rounds whose longest gap at any count was over 8: 104; robots dropped as dead without a death event: 0.

Targeting waves (104 rounds): 23215 sent, 20953 reached their opponent, 2758 virtual hits (13.2% of those reached).

## Paired A/B: hadur2.Hadur 3.13mr vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 3 of 3, baseline 3 of 3, 3 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 51.9% ± 1.4 | 50.2% ± 8.2 | +1.8 ± 9.1 |
| Survival | 59.5% ± 2.5 | 56.6% ± 18.6 | +2.9 ± 16.2 |
| Rounds won | 1.9% ± 4.1 | 1.9% ± 4.1 | +0.0 ± 7.1 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 40.6% ± 7.5 | 39.7% ± 11.1 | +0.9 ± 18.6 |
| cb.fire.Firestarter 2.0f | 46.5% ± 4.7 | 44.3% ± 9.5 | +2.3 ± 11.9 |
| positive.Portia 1.26e | 51.4% ± 6.5 | 47.2% ± 10.3 | +4.2 ± 9.2 |
| kc.mini.Mirage 0.2 | 46.2% ± 3.4 | 46.7% ± 4.0 | -0.5 ± 6.5 |
| mn.Combat 3.25.0 | 50.4% ± 6.2 | 51.4% ± 5.5 | -1.0 ± 10.7 |
| catcat20.Matcha 0.006 | 52.9% ± 5.6 | 50.8% ± 10.0 | +2.2 ± 15.7 |
| kc.micro.Figment 1.0 | 65.8% ± 8.1 | 63.5% ± 7.3 | +2.3 ± 15.1 |
| catcat20.Lambda 0.024 | 53.9% ± 10.7 | 53.3% ± 15.9 | +0.6 ± 25.8 |
| stelo.Spread 0.9 | 59.5% ± 11.3 | 54.8% ± 15.2 | +4.8 ± 5.2 |

## Melee bench: D

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

Skipped turns: 12 over 3 battles (4.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 50.2 | 56.6 | 2 / 105 | 4.90 | 9.8% | 5080 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 14.8% | 37 |
| cb.fire.Firestarter 2.0f | 2.3 | 12.3% | 20 |
| kc.mini.Mirage 0.2 | 3.0 | 11.1% | 8 |
| positive.Portia 1.26e | 4.3 | 10.9% | 11 |
| catcat20.Matcha 0.006 | 6.0 | 9.4% | 6 |
| hadur2.Hadur 3.13 | 6.3 | 9.8% | 2 |
| mn.Combat 3.25.0 | 6.7 | 9.3% | 8 |
| catcat20.Lambda 0.024 | 7.3 | 8.6% | 6 |
| stelo.Spread 0.9 | 8.0 | 8.1% | 5 |
| kc.micro.Figment 1.0 | 10.0 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 49.8 | 55.9 | 0 / 35 | 1674 |
| 2 | 5 | 53.6 | 64.4 | 1 / 35 | 1848 |
| 3 | 8 | 47.1 | 49.5 | 1 / 35 | 1558 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 6 | 0% |
| stelo.Spread 0.9 | 4 | 25% |
| kc.mini.Mirage 0.2 | 3 | 0% |
| catcat20.Lambda 0.024 | 3 | 33% |
| kc.micro.Figment 1.0 | 1 | 0% |
| cb.fire.Firestarter 2.0f | 1 | 0% |
| mn.Combat 3.25.0 | 1 | 0% |

Hadur died in 103 of 105 rounds, at a mean tick of 622. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 20 | 19% | 21 |
| kc.mini.Mirage 0.2 | 18 | 17% | 18 |
| cb.fire.Firestarter 2.0f | 13 | 13% | 13 |
| positive.Portia 1.26e | 10 | 10% | 10 |
| mn.Combat 3.25.0 | 10 | 10% | 10 |
| stelo.Spread 0.9 | 10 | 10% | 10 |
| catcat20.Lambda 0.024 | 9 | 9% | 10 |
| catcat20.Matcha 0.006 | 9 | 9% | 9 |
| kc.micro.Figment 1.0 | 4 | 4% | 4 |

Posture (Hadur's M records, 105 rounds): 61874 melee ticks, 4451 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 41 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 21866 sent, 19634 reached their opponent, 2612 virtual hits (13.3% of those reached).

## Melee bench: E

hadur2.Hadur 3.13mr against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 3 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 47.6 | 50.2 | 3 / 105 | 5.49 | 9.0% | 5029 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 14.0% | 31 |
| jk.melee.Neuromancer 7.12 | 2.7 | 11.5% | 20 |
| justin.DemonicRage 3.4 | 2.7 | 11.5% | 11 |
| voidious.Diamond 1.8.28 | 4.7 | 10.4% | 10 |
| mn.Combat 3.25.0 | 5.0 | 10.1% | 13 |
| rz.Aleph 0.34 | 6.3 | 10.0% | 5 |
| hadur2.Hadur 3.13mr | 6.7 | 9.0% | 3 |
| catcat20.Lambda 0.024 | 8.3 | 8.0% | 6 |
| wompi.Numbat 2.1 | 8.7 | 8.4% | 3 |
| rsalesc.melee.Medina 0.4.5 | 9.0 | 7.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 47.4 | 49.5 | 1 / 35 | 1678 |
| 2 | 7 | 47.4 | 49.8 | 0 / 35 | 1693 |
| 3 | 7 | 47.9 | 51.1 | 2 / 35 | 1658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 5 | 40% |
| jk.melee.Neuromancer 7.12 | 3 | 0% |
| wompi.Numbat 2.1 | 2 | 50% |
| voidious.Diamond 1.8.28 | 1 | 0% |
| rsalesc.melee.Medina 0.4.5 | 1 | 0% |
| mn.Combat 3.25.0 | 1 | 0% |

Hadur died in 102 of 105 rounds, at a mean tick of 544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 20 | 20% | 20 |
| aaa.r.ScalarR 0.005g.047 | 19 | 19% | 21 |
| justin.DemonicRage 3.4 | 17 | 17% | 17 |
| voidious.Diamond 1.8.28 | 12 | 12% | 12 |
| rz.Aleph 0.34 | 11 | 11% | 11 |
| wompi.Numbat 2.1 | 7 | 7% | 8 |
| mn.Combat 3.25.0 | 7 | 7% | 7 |
| catcat20.Lambda 0.024 | 5 | 5% | 5 |
| rsalesc.melee.Medina 0.4.5 | 4 | 4% | 4 |

Posture (Hadur's M records, 104 rounds): 54219 melee ticks, 3304 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (104 rounds): longest scan gap while four or more were alive 81 ticks (104 rounds over 8); rounds whose longest gap at any count was over 8: 104; robots dropped as dead without a death event: 0.

Targeting waves (104 rounds): 21481 sent, 19128 reached their opponent, 2386 virtual hits (12.5% of those reached).

## Paired A/B: hadur2.Hadur 3.13mr vs hadur2.Hadur 3.13

Each row pairs the candidate's and the baseline's battle on the same field at the same seed, so noise common to both cancels out of the difference (BENCH-2). Shares are mean ± 95% interval over seeds; positive is better for the candidate. Pairwise share is Hadur's share of the pair's scores against that one opponent, 100 H / (H + X).

Battles used on this field: candidate 3 of 3, baseline 3 of 3, 3 paired seeds.

| Measure | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| APS | 47.6% ± 0.7 | 49.8% ± 6.8 | -2.3 ± 6.3 |
| Survival | 50.2% ± 2.1 | 54.7% ± 16.7 | -4.6 ± 14.8 |
| Rounds won | 2.9% ± 7.1 | 5.7% ± 0.0 | -2.9 ± 7.1 |

Pairwise share against each opponent:

| Opponent | Candidate | Baseline | Paired diff (pp) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 39.2% ± 6.3 | 41.0% ± 4.8 | -1.8 ± 5.8 |
| jk.melee.Neuromancer 7.12 | 43.8% ± 4.1 | 45.5% ± 19.6 | -1.7 ± 19.1 |
| voidious.Diamond 1.8.28 | 46.2% ± 2.9 | 47.9% ± 12.1 | -1.7 ± 9.5 |
| justin.DemonicRage 3.4 | 43.8% ± 1.1 | 45.2% ± 4.0 | -1.4 ± 3.5 |
| rsalesc.melee.Medina 0.4.5 | 55.9% ± 11.3 | 59.4% ± 6.3 | -3.4 ± 13.5 |
| mn.Combat 3.25.0 | 47.3% ± 10.0 | 51.6% ± 0.8 | -4.3 ± 10.6 |
| rz.Aleph 0.34 | 47.4% ± 6.0 | 50.9% ± 3.7 | -3.5 ± 2.4 |
| wompi.Numbat 2.1 | 51.6% ± 2.9 | 56.1% ± 10.4 | -4.5 ± 13.3 |
| catcat20.Lambda 0.024 | 52.9% ± 8.6 | 51.1% ± 13.3 | +1.8 ± 21.9 |

## Melee bench: E

hadur2.Hadur 3.13 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

Skipped turns: 13 over 3 battles (4.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 49.8 | 54.7 | 6 / 105 | 5.08 | 9.7% | 5080 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.3 | 14.0% | 29 |
| justin.DemonicRage 3.4 | 2.7 | 11.8% | 12 |
| jk.melee.Neuromancer 7.12 | 4.0 | 11.9% | 24 |
| voidious.Diamond 1.8.28 | 4.0 | 10.6% | 12 |
| hadur2.Hadur 3.13 | 5.0 | 9.7% | 6 |
| rz.Aleph 0.34 | 6.0 | 9.3% | 5 |
| catcat20.Lambda 0.024 | 6.7 | 9.3% | 6 |
| mn.Combat 3.25.0 | 6.7 | 9.1% | 7 |
| wompi.Numbat 2.1 | 9.0 | 7.6% | 1 |
| rsalesc.melee.Medina 0.4.5 | 9.7 | 6.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 7 | 46.8 | 47.6 | 2 / 35 | 1625 |
| 2 | 4 | 50.6 | 55.6 | 2 / 35 | 1837 |
| 3 | 4 | 52.1 | 61.0 | 2 / 35 | 1618 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 5 | 60% |
| aaa.r.ScalarR 0.005g.047 | 5 | 0% |
| mn.Combat 3.25.0 | 4 | 50% |
| rsalesc.melee.Medina 0.4.5 | 1 | 100% |
| voidious.Diamond 1.8.28 | 1 | 0% |

Hadur died in 99 of 105 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 18 | 18% | 18 |
| jk.melee.Neuromancer 7.12 | 15 | 15% | 15 |
| justin.DemonicRage 3.4 | 14 | 14% | 16 |
| mn.Combat 3.25.0 | 12 | 12% | 14 |
| voidious.Diamond 1.8.28 | 12 | 12% | 12 |
| catcat20.Lambda 0.024 | 10 | 10% | 10 |
| rsalesc.melee.Medina 0.4.5 | 7 | 7% | 9 |
| rz.Aleph 0.34 | 6 | 6% | 6 |
| wompi.Numbat 2.1 | 5 | 5% | 5 |

Posture (Hadur's M records, 105 rounds): 57748 melee ticks, 4253 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 57 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 21785 sent, 19425 reached their opponent, 2560 virtual hits (13.2% of those reached).

