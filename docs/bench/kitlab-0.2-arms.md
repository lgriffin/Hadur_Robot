# JayLexi and Eveimear 0.2: the first three rounds of arms (29 Oct)

These arms come from the live read in [live-kitlab-0.1.md](live-kitlab-0.1.md). Each one runs on
two 48-bot samples, `kitlab/<rumble>-field.txt` (seed 1) and `kitlab/<rumble>2-field.txt`
(seed 2, drawn on 29 Oct). Each sample is paired against its reference (Komarious 1.88 at 87.54
and 87.45, Épéeist 3.7 at 85.06 and 84.99). Battles are 2 seeds unless marked, and every
interval is about ±0.45 per sample.

Read on both samples together, the 0.1 builds come out at 86.93 (live 86.95) and 83.62 (live
83.36). Sample 1 alone had read Eveimear at 84.28, so a second sample is worth keeping.

| Bot | Arm | Change | Sample 1 | Sample 2 | Mean | Against 0.1 |
|---|---|---|---|---|---|---|
| JayLexi | 0.1 | orbit 1.15 | 87.05 (4 seeds) | 86.81 | 86.93 | |
| JayLexi | Ja | power by own energy, Komarious-style | 85.12 | 85.31 | 85.22 | -1.71 |
| JayLexi | Jb | danger over the nearer of the enemy and the wave | 86.56 | 87.11 | 86.84 | -0.09 |
| JayLexi | Jc | gun segment for the wall behind the enemy | 86.09 | 86.37 | 86.23 | -0.70 |
| JayLexi | Jac | Ja and Jc | 85.55 | 87.06 | 86.31 | -0.62 |
| JayLexi | Jp200 | power 3 inside 200 px | 86.68 | 86.60 | 86.64 | -0.29 |
| JayLexi | Jp22 | power 2.2 beyond 150 px | 86.27 | 86.01 | 86.14 | -0.79 |
| JayLexi | Jp25 | power 2.5 beyond 150 px | 86.04 | 86.63 | 86.34 | -0.59 |
| JayLexi | Jd1 | orbit 1.0 + distance / 2000 | 86.07 | 86.95 | 86.51 | -0.42 |
| JayLexi | Jd2 | orbit 0.95 + distance / 1500 | 86.63 | 86.93 | 86.78 | -0.15 |
| Eveimear | 0.1 | | 84.28 | 82.96 | 83.62 | |
| Eveimear | Ea | radar lock (twice the turn) | 83.34 | 82.79 | 83.07 | -0.55 |
| Eveimear | Eb | random reversal by enemy bullet speed over distance | 84.69 | 82.85 | 83.77 | +0.15 |
| Eveimear | Eb (4 seeds) | same, re-read | 83.91 | 83.11 | 83.51 | -0.11 |
| Eveimear | Eab | Ea and Eb | 84.22 | 83.68 | 83.95 | +0.33 |
| Eveimear | Eab (4 seeds) | same, re-read | 84.20 | 83.11 | 83.66 | +0.04 |
| Eveimear | Ec | gun segment for the wall ahead of the enemy (+74 bytes) | 83.71 | 83.95 | 83.83 | +0.21 |
| Eveimear | Eg1 | gun lateral speed in 3 bands | 83.63 | 82.27 | 82.95 | -0.67 |
| Eveimear | Eg2 | gun distance in 256 px bands | 83.03 | 82.86 | 82.95 | -0.67 |
| Eveimear | Eg12 | Eg1 and Eg2 | 83.37 | 82.25 | 82.81 | -0.81 |

No arm beats 0.1 by more than the noise. JayLexi's power rule, orbit, danger and gun segments sit
at their best values already, and so do Eveimear's gun segments and movement settings. The 0.1
builds are a local optimum for changes this small. What the live read asks for (survival against
learning guns for JayLexi, and against even and strong bots for Eveimear) needs bigger changes,
which cost bytes and have to be traded for.
