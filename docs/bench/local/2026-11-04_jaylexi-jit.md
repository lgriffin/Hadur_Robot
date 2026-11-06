# JayLexi aim jitter against bullet catchers (JAYLEXI-19, BENCH-190), 2026-11-04

**Result: +57.3 ± 3.3 points against rsim.mini.BulletCatcher 0.4 (95%, 20 fresh seeds), A/A +0.8 ± 2.0.
That is +0.086 APS over 669 pairings, and every other robot plays exactly as 0.5.** Banked in jaylexi/ as 0.6
(1,494 B through ProGuard). Not released.

## Why

The gap study (2026-11-04) found JayLexi 0.4 scores about 24% live against BulletCatcher, where FoilistMC scores
84%. BulletCatcher shoots our bullets down: JayLexi's GuessFactor gun aims where the catcher expects, and every
bullet caught costs JayLexi the energy it fired. A random turn of the gun breaks the catch. Lower power helped less
(54-60%), power 3 hurt, and dropping the bullet-hit-bullet log gave only about 9 points.

## How it works

The orbit char a robot already carries (pc-jaylexi-orb, hundredths of a radian, 0.95 to 1.35) also switches the
jitter on:

    gun turn += (Math.random() - 0.5) * ((int) orbit >> 2) / 4

Under 4 rad the factor is 0, so the term is ±0.0 and the aim is unchanged. JayLexi draws no other random numbers,
so the play is bit for bit 0.5's. BulletCatcher's char is 115 + 628 = 743. That is 2 pi more (0.0032 rad short),
which the drive and the danger read the same, because the orbit only enters sin, cos and tan. The factor is then 1,
and the gun jitters by up to 0.125 rad either way. No new table is needed. It costs 20 B: 1,507 with javac, 1,494
through ProGuard (ProGuard builds are allowed when they replay identically, 2026-11-04). JayLexiJarIT replays the
built jar against the readable reference, and the cloud replay harness gives 0.5's orders for every other name.

## Field screen: catchers only

Jitter for every robot (cloud, 10 rounds, 2 seeds; c and aa are the base, jt has jitter on every row):

| Panel | Robots | jt − (c, aa) | Robots at +3 or more | A/A null at +3 or more |
|---|---|---|---|---|
| kitlab/mini-mid-field.txt (ranks 61+) | 80 | −2.68 ± 0.67 | 7 | 5 |
| top 30 | 30 | −4.35 ± 1.74 | 7 | 11 |

The jitter hurts on average, and the count of robots at +3 or more is no larger than the null count. So there is no
field-wide card: BulletCatcher is the only pick. (Against rsim.micro.uCatcher, Eveimear goes from 31-45% to 98-99%
with the same jitter, but its per-robot form is 752 B through ProGuard, 3 over the limit; Eveimear's power picks do
not beat the catcher, at 41-48%.)

## Confirm: BulletCatcher, 20 seeds from 47000, 35 rounds

c is the jitter build with every char as shipped (0.5's play), aa its rebuild, pk the BulletCatcher pick.

| Seed | c | aa | pk |
|---|---|---|---|
| 1 | 10.3 | 11.9 | 75.1 |
| 2 | 15.8 | 23.2 | 65.6 |
| 3 | 14.9 | 14.8 | 73.9 |
| 4 | 13.1 | 13.1 | 71.3 |
| 5 | 23.0 | 23.0 | 71.1 |
| 6 | 12.3 | 14.1 | 72.8 |
| 7 | 17.0 | 9.5 | 74.9 |
| 8 | 14.8 | 19.1 | 81.8 |
| 9 | 15.0 | 20.9 | 62.0 |
| 10 | 16.5 | 22.8 | 75.7 |
| 11 | 16.5 | 19.1 | 85.0 |
| 12 | 11.3 | 16.5 | 77.8 |
| 13 | 14.6 | 19.0 | 73.5 |
| 14 | 13.0 | 8.7 | 73.1 |
| 15 | 15.8 | 18.8 | 72.1 |
| 16 | 17.1 | 19.4 | 69.5 |
| 17 | 23.0 | 18.7 | 65.8 |
| 18 | 11.2 | 10.9 | 79.2 |
| 19 | 13.4 | 6.8 | 73.7 |
| 20 | 17.9 | 11.9 | 66.5 |

Means: c 15.3, aa 16.1, pk 73.0. pk − (c + aa)/2 = **+57.3 ± 3.3** (95%); aa − c = +0.8 ± 2.0.

Pick file: hadur-bench/plans/jaylexi-jit-pick.tsv. Tool: hadur-bench/tools/jaylexi_jit.py (tests in
tools/test_jaylexi_jit.py).
