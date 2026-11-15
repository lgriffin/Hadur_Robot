# The leaning field as one portfolio (BENCH-230)

Each robot's gain is its lever's score share less master's over the runs given, shrunk toward its lever's mean by how much of the gains' variance is spread between robots and not noise. A robot is kept when its shrunk gain is above +0.0 points.

| Lever | Robots | Mean gain | Noise sd a robot | Spread between robots | Kept | Kept robots' shrunk gain, sum |
|---|---:|---:|---:|---:|---:|---:|
| x5 | 50 | +0.04 | 2.02 | 0.00 | 50 | +2.1 |
| gs | 47 | +0.43 | 1.68 | 0.84 | 40 | +21.5 |
| fp | 71 | -0.03 | 2.25 | 0.00 | 0 | +0.0 |
| sg | 19 | -2.39 | 5.46 | 4.51 | 2 | +0.9 |
| sw | 17 | +0.40 | 1.97 | 0.00 | 17 | +6.8 |
| hj | 93 | -0.14 | 2.70 | 0.00 | 0 | +0.0 |
| fl | 39 | +0.20 | 1.93 | 0.00 | 39 | +7.9 |
| mm | 49 | -0.40 | 2.24 | 0.00 | 0 | +0.0 |

Kept: **148 robots**, projected **+0.032 APS** over 1217 pairings (the sum of the shrunk gains; the confirm on fresh seeds is the measurement).
Left out: 80 the table already carries a lever for, 26 shield-mode robots on gs or fl, 0 with under two battles of an arm.
