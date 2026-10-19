# Census classification

1212 opponents from `hadur-bench/work/pc-1018-stack-census-20261018-105321`. One row each in `2026-10-18_census-classes.tsv`. Share = Hadur's score share; paired = candidate minus baseline share at the same seeds, in points; APS weight = that class's paired sum over the field, the APS it moves.

## Movement classes

| Class | Bots | Base share | Paired (pts) | APS weight | Their hit | Dmg taken/rd | Our hit | Shots/100 | Power |
|---|---|---|---|---|---|---|---|---|---|
| flat | 549 | 83.9 | 0.07 | 0.032 | 0.053 | 16.3 | 0.149 | 6.21 | 1.88 |
| stat-prone | 337 | 94.7 | 0.38 | 0.106 | 0.034 | 6.3 | 0.250 | 5.75 | 2.04 |
| rammer | 87 | 87.5 | 0.41 | 0.029 | 0.203 | 24.8 | 0.616 | 4.86 | 2.41 |
| head-on-prone | 75 | 97.8 | 0.05 | 0.003 | 0.017 | 2.2 | 0.349 | 4.01 | 1.99 |
| oscillator | 39 | 88.7 | -0.24 | -0.008 | 0.046 | 12.2 | 0.148 | 5.94 | 1.94 |
| circular-prone | 33 | 95.7 | -0.06 | -0.002 | 0.025 | 3.6 | 0.178 | 5.89 | 1.70 |
| wall-runner | 32 | 97.4 | 0.03 | 0.001 | 0.021 | 2.7 | 0.272 | 5.02 | 2.02 |
| sitting | 29 | 97.4 | 0.97 | 0.023 | 0.011 | 2.0 | 0.518 | 4.08 | 2.08 |
| linear-prone | 24 | 97.5 | 0.53 | 0.011 | 0.031 | 3.5 | 0.385 | 5.32 | 1.73 |
| mixed | 7 | 93.9 | 0.21 | 0.001 | 0.032 | 7.0 | 0.218 | 4.64 | 2.62 |

## Gun classes

| Class | Bots | Base share | Paired (pts) | APS weight | Their hit | Dmg taken/rd | Our hit | Shots/100 | Power |
|---|---|---|---|---|---|---|---|---|---|
| learning | 750 | 86.3 | 0.18 | 0.108 | 0.049 | 13.9 | 0.168 | 6.06 | 1.99 |
| mixed | 143 | 91.5 | 0.29 | 0.034 | 0.081 | 12.8 | 0.331 | 5.74 | 2.02 |
| head-on | 125 | 98.3 | 0.16 | 0.016 | 0.017 | 1.9 | 0.382 | 4.59 | 2.00 |
| linear+learning | 66 | 95.5 | 0.24 | 0.013 | 0.039 | 6.4 | 0.317 | 6.05 | 1.87 |
| linear | 65 | 90.9 | 0.18 | 0.010 | 0.147 | 18.3 | 0.421 | 5.81 | 1.83 |
| head-on+learning | 35 | 96.7 | 0.28 | 0.008 | 0.032 | 4.4 | 0.353 | 5.04 | 1.84 |
| silent | 20 | 99.4 | 0.34 | 0.006 | 0.005 | 0.2 | 0.512 | 0.09 | 1.96 |
| unread | 8 | 96.7 | 0.31 | 0.002 | 0.004 | 1.2 | 0.007 | 5.92 | 1.85 |

## Movement by gun (bots, base share)

| Movement \ gun | head-on | head-on+learning | learning | linear | linear+learning | mixed | silent | unread |
|---|---|---|---|---|---|---|---|---|
| circular-prone | 2, 99 | 2, 98 | 20, 94 | 1, 98 | 5, 97 | 2, 100 |  | 1, 93 |
| flat | 27, 96 | 9, 95 | 432, 81 | 13, 96 | 17, 96 | 48, 91 | 3, 98 |  |
| head-on-prone | 21, 100 | 4, 100 | 35, 96 | 2, 99 | 4, 98 | 3, 97 | 5, 100 | 1, 97 |
| linear-prone | 5, 98 |  | 6, 97 | 5, 98 | 5, 96 | 3, 97 |  |  |
| mixed | 1, 99 |  | 6, 93 |  |  |  |  |  |
| oscillator |  |  | 30, 87 | 1, 98 | 3, 96 | 5, 93 |  |  |
| rammer | 16, 98 | 5, 95 | 14, 96 | 19, 74 | 4, 85 | 28, 85 | 1, 99 |  |
| sitting | 8, 100 |  | 8, 93 | 1, 98 | 1, 99 | 3, 95 | 7, 100 | 1, 99 |
| stat-prone | 38, 99 | 13, 97 | 178, 93 | 23, 98 | 27, 96 | 49, 95 | 4, 99 | 5, 97 |
| wall-runner | 7, 99 | 2, 99 | 21, 97 |  |  | 2, 96 |  |  |

## Clustering cross-check (k-means, k=8, standardised)

| Cluster | Bots | Most distinctive | Largest movement class | Largest gun class | Base share |
|---|---|---|---|---|---|
| 0 | 46 | adv_speed high, their_hit high, dist low | rammer (46) | linear (17) | 81.4 |
| 1 | 36 | stopped high, off_linear high, off_circular high | sitting (28) | learning (15) | 97.2 |
| 2 | 150 | aim_headon high, aim_other low, aim_linear low | stat-prone (64) | head-on (69) | 97.1 |
| 3 | 194 | turn_rate high, near_wall low, dist low | stat-prone (76) | learning (137) | 91.9 |
| 4 | 129 | aim_linear high, aim_other low, dist low | stat-prone (63) | linear+learning (55) | 96.6 |
| 5 | 274 | power_sd high, power low, off_seg low | flat (231) | learning (239) | 80.8 |
| 6 | 94 | shots_100 low, speed low, lat_speed low | head-on-prone (48) | head-on (37) | 98.4 |
| 7 | 289 | aim_other high, power high, off_seg low | flat (192) | learning (265) | 86.5 |

## Rules

Movement (first that fits):

```
sitting      mean speed under 1 px/tick
rammer       closes in: under 150 px a third of the time, or advancing at 2+ px/tick
wall-runner  within 60 px of a wall over 60% of the time, reversing under 1.5 times per 100 ticks
head-on-prone  a head-on gun hits it 30%+ (it barely moves sideways)
linear-prone / circular-prone  that gun hits it 30%+
oscillator   reverses 4+ times per 100 ticks with a short regular run (dwell under 15 ticks)
stat-prone   a guess-factor average or segmented gun hits it 22%+ (a learnable pattern)
flat         none of the offline guns hits it 22%: a surfer or a well-randomised mover
mixed        anything else
```

Gun:

```
silent        under 0.5 shots per 100 ticks
head-on / linear / circular   that aim explains 60%+ of the shots that read (still shots
              excluded); 40%+ with the rest 'other' gives e.g. 'head-on+learning'
learning      60%+ of reading shots match no simple aim (guess-factor, k-NN, pattern, or random spread)
mixed         anything else; under 20 reading shots it is 'unread'
The HF classes of the bullets that hit us (candidate builds only) are kept as a cross-check.
```

Offline guns aim a power-2 bullet from Hadur's true position every few ticks and count a hit when the enemy's true position at arrival lies within 18 px of the aim; the gf and segmented guns learn only from earlier ticks of the same battle. They rate the movement, not Hadur's gun.
