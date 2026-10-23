# 3.15 against its rivals, 4th to 7th (2026-10-23 10:00 UTC)

Live BotCompare pages of each rival against `hadur2.Hadur 3.15` over their 1,218 common opponents,
archived as `data/rumble/pages/2026-10-23T1000Z_*` (parsed under `data/rumble/parsed/`). Segments
are docs/plan-top5.md section 3 (`hadur-bench/plans/top5-segments.tsv`); movement and gun classes
are `docs/bench/local/2026-10-18_census-classes.tsv`. Each cell is a rival's lead in APS over Hadur,
contributed by that group (group sum of point differences / 1,218).

| Rival | Rank | APS | Lead over 3.15 | Lead over 3.13 final | Survival (Hadur 95.7) |
|---|---|---|---|---|---|
| Saguaro 1.0 | 4 | 91.73 | +2.47 | +2.33 | 95.16 |
| ScalarR 0.005h.053-noshield | 5 | 91.24 | +1.93 | +1.78 | 97.60 |
| Ogi v1 | 6 | 90.92 | +1.64 | +1.50 | 96.95 |
| Diamond 1.8.22 | 7 | 90.16 | +0.85 | +0.71 | 97.22 |

## By segment, lead over 3.15

| Segment | Bots | Saguaro | ScalarR | Ogi | Diamond |
|---|---|---|---|---|---|
| A rammers | 87 | +0.28 | +0.51 | +0.29 | +0.33 |
| B ranks 401+ | 719 | +0.98 | +0.90 | +0.05 | +0.50 |
| C large losses | 87 | +0.39 | +0.95 | +0.60 | +0.53 |
| D ranks 51-400 | 294 | +1.01 | -0.46 | +0.71 | -0.52 |
| E top 50 | 24 | -0.14 | -0.02 | -0.00 | -0.04 |

## By opponent's movement and gun (the groups worth 0.1 APS or more to any rival)

| Opponent class | Bots | Saguaro | ScalarR | Ogi | Diamond |
|---|---|---|---|---|---|
| flat mover, learning gun hitting Hadur 7%+ | 167 | +0.42 | +1.06 | +0.61 | +0.69 |
| flat mover, learning gun under 7% | 264 | +0.82 | +0.29 | +0.66 | +0.14 |
| stat-prone mover, learning gun under 7% | 145 | +0.31 | -0.25 | +0.15 | -0.36 |
| rammers, linear or mixed gun, 7%+ | 41 | +0.23 | +0.43 | +0.25 | +0.28 |
| flat mover, mixed gun under 7% | 38 | +0.14 | +0.12 | +0.06 | +0.10 |
| oscillator, learning gun under 7% | 20 | +0.07 | -0.05 | +0.11 | -0.05 |

## Reading

- **Every rival beats Hadur on rammers and on the large losses.** A plus C is worth +0.67 to +1.46
  APS to each of them. These are the only two segments all four lead in.
- **Hadur's strength is ranks 51-400 against ScalarR and Diamond** (they trail by about 0.5 there),
  and the top 50, where nobody gains on Hadur.
- **The weak tail splits them.** Saguaro, ScalarR and Diamond take 0.5-1.0 APS there; Ogi takes
  none and still sits 6th, by winning D and C.
- **A consensus set:** on 92 opponents every one of the four rivals beats 3.15 by 5 points or more
  (86 against 3.13's final page). Bringing Hadur to the rivals' average on those alone is worth
  about +1.0 APS (+0.9 against 3.13). By segment: 31 C, 26 D, 21 A, 14 B against 3.15; 41 C, 20 A,
  14 B, 11 D against 3.13. Almost all are flat or stat-prone movers with learning guns, and rammers
  with linear or mixed guns.
- **Top 5 needs +1.95 APS over 3.15.** The consensus set is about half of it; the other half has to
  come from the weak tail (where ScalarR and Saguaro lead by 0.9-1.0) without giving back D.
