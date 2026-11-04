# Eveimear aim jitter against uCatcher (EVEIMEAR-13, EVEIMEAR-17), 2026-11-04

**Result: +52.0 ± 2.5 points against rsim.micro.uCatcher 0.1 (95%, 20 fresh seeds), A/A +1.6 ± 1.8. That is
+0.101 APS over 515 pairings. The build with no pick reads −0.13 ± 1.14 against the 0.3 base across 80 robots of
ranks 61-515 (A/A +0.44 ± 0.37), so it costs the rest of the field nothing.** Banked in eveimear/ as 0.4
(742 B through ProGuard). Not released.

## Why

uCatcher shoots Eveimear's bullets down. 0.2 scored about 40% against it live (the gap study, 2026-11-04). A random
aim offset breaks the catch. Eveimear's power picks do not (power 1 or 3 everywhere: 41-48% on 3 seeds), and JayLexi
has the same fix against BulletCatcher (#648, +57.3).

## How it works

    gun turn = ... + (best - MID + (Math.random() - 0.5) * ((int) tab & 6)) * bin width

tab is the robot's MODES char: wave speed × 16 plus a mode nibble. The nibbles in use are 0, 1 and 9, and for those
`& 6` is 0, so the term is ±0.0 bins. uCatcher's nibble goes from 9 to 15. That still holds stop-and-go for good,
and `& 6` is 6, so its aim moves by up to 3 bins (about 0.16 rad) either way. Eveimear's movement also draws
Math.random, so every robot's random stream shifts by one draw a scan. That is why the field check below is run.

It is 752 B with javac, so:
- a play-neutral golf moves w.x and w.y into the enemyX and enemyY lines (6 B);
- the jar goes through ProGuard (`eveimear/proguard.pro`), to 742 B.

`EveimearJarIT` loads the javac classes and the ProGuard jar with Math.random swapped for a seeded draw (ASM). It
checks that both give the same orders on seeded scripts for the field's row, a stop-and-go row and uCatcher's row
(EVEIMEAR-17), and that the jitter changes uCatcher's orders. The shipped jar also gives the benched jar's orders
on seeds 1-3.

## Confirm: uCatcher, 20 seeds from 48000, 35 rounds

c is the jitter build with no pick, aa its rebuild, pk with uCatcher's nibble at 15.

| Seed | c | aa | pk |
|---|---|---|---|
| 1 | 36.5 | 36.5 | 95.1 |
| 2 | 51.7 | 51.7 | 98.2 |
| 3 | 36.1 | 36.1 | 95.2 |
| 4 | 37.3 | 37.3 | 95.7 |
| 5 | 46.1 | 49.9 | 96.4 |
| 6 | 45.0 | 45.0 | 95.3 |
| 7 | 39.3 | 39.3 | 96.8 |
| 8 | 44.2 | 44.2 | 96.1 |
| 9 | 38.8 | 38.8 | 95.8 |
| 10 | 35.9 | 49.1 | 95.5 |
| 11 | 49.8 | 50.1 | 97.0 |
| 12 | 47.7 | 47.7 | 95.3 |
| 13 | 51.8 | 51.8 | 96.8 |
| 14 | 51.2 | 51.2 | 98.3 |
| 15 | 36.2 | 36.4 | 97.2 |
| 16 | 48.9 | 49.4 | 96.4 |
| 17 | 54.2 | 54.2 | 94.9 |
| 18 | 43.5 | 43.5 | 97.0 |
| 19 | 36.7 | 36.7 | 94.7 |
| 20 | 37.9 | 52.0 | 96.7 |

Means: c 43.4, aa 45.0, pk 96.2. pk − (c + aa)/2 = **+52.0 ± 2.5** (95%); aa − c = +1.6 ± 1.8.

## Field check: kitlab/micro-mid-field.txt, 80 robots, 2 seeds, 10 rounds (seeds from 49000)

c and aa are the 0.3 base (741 B), jg is the jitter build with no pick. jg − (c + aa)/2 = −0.13 ± 1.14 over 160
pairings; aa − c = +0.44 ± 0.37.
