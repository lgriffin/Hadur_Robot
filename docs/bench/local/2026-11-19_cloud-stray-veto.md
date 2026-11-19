# Overnight cloud tests, 18-19 Nov: own-fire veto (T2) and third-party bullets (M1)

Both arms were bench switches, off by default (ablations tmveto, suffix tv; mthird and mthird2, suffixes mt and m2). Neither passed, so the code was reverted on this branch (commits a6606537, 2f..., kept in history) and nothing reaches master but this record. Cloud box, 4 cores, parallel 2, live CPU constant, paired against aa (master under another name).

## Team: own-fire veto (TVETO-1, tv)
A reranked destination whose 30-tick drive meets a teammate's bullet is refused while another reranked destination meets none.
16 gap teams (gap16.txt), 10 rounds, 4 seeds a block.

| Block | Build | Share diff (pp) | Bullets on own members a battle, tv / aa | Skipped turns a battle, tv / aa |
|---|---|---|---|---|
| 28000 | first build | +0.4 ± 1.2 | 21.7 / 27.1 | 30.0 / 6.8 |
| 28100 | one pass, reach filter | +0.9 ± 1.4 | 20.3 / 27.6 | 5.7 / 6.5 |
| 28200 | same | -0.1 ± 1.6 | 21.1 / 28.6 | 5.0 / 6.5 |
| 28300 | same | -0.3 ± 1.7 | 19.8 / 27.5 | 7.0 / 7.0 |
| 28400 | same | +0.7 ± 2.1 | 21.0 / 26.8 | |
| 28500 | same | +0.5 ± 1.7 | 21.8 / 26.2 | |
| 28600 | same | -0.3 ± 1.3 | 21.6 / 27.8 | |
| 28700 | same | -0.8 ± 1.4 | 20.3 / 26.2 | |
| 28800 | same | +1.2 ± 1.4 | 21.1 / 27.1 | |
| 28900 | same | -0.3 ± 1.8 | 22.0 / 27.1 | |
| 29500 | same | -0.0 ± 1.5 | | |
| **Pooled 28100-29500 (40 seeds)** | | **+0.13 ± 0.50** | 20.9 / 27.3 (-23%) | level |

Mechanism passes (own hits down about a quarter, no CPU cost after the rebuild). Score does not: +0.13 ± 0.50 pp at 40 seeds on the 16 gap teams. Our own bullets landing on members were not where the team's points go.

## Melee: third-party bullets (MSTRAY-1/2, mt)
Each seen shot also makes head-on and linear bullets at each other living robot, weighted 41/17/12/9% by nearness rank from the shooter, each its own wave, kept only while its line can cross Hadur's reach.

Mechanism, 12 census fields traced at seed 29000, read by melee_strays.py:

| | Stray damage | Stray share | Aimed-at damage | Dropped today |
|---|---|---|---|---|
| aa | 6170 | 46% | 7243 | 32% |
| mt | 5492 | 42% | 7514 | 27% |

Stray damage -11%; the doc's gate was a share of 35% or less. Not met.

Paired census pilot, 46 fields x 3 seeds (29100-29300), 20 rounds: APS +0.01 ± 0.36 (per seed +0.11, -0.12, +0.03). Flat.

## No box time
- PC stray read (#921 card): M1 BUILD (avoidable strays 48%, 83% of stray damage is Hadur driving into a line in flight); M2 lane DO NOT BUILD.
- PC tempo read: rounds now 410 vs OgiTeam 389 ticks; the largest factor is damage a hit (1.10: power 1.95 vs 2.13). Own damage 14 vs 11 a round.
- T3 premise re-read on the TMODE-52 battles (closemove.py, shots landing inside 30 ticks): members that reversed were hit 17.5%, others about 23%, so the 13 Nov "turned back hit twice as often" fault does not show on master. Not built.

## Melee: heavier variant m2 (stray weight x2, ablation mthird2), 19 Nov morning
Mechanism, same 12 traced fields, seed 29000: stray damage 5361 (aa 6170, -13%), all damage taken 12629 (aa 13413, -6%).
Census 46 fields x 3 seeds (29100-29300) vs aa: APS -0.05 ± 0.33 (per seed +0.03, -0.20, +0.03). Flat, like mt.

## Verdict

T2 (own-fire veto) and M1 (third-party bullets, both weights) are closed. The stray read's avoidable damage is real, but drawing the bullets in the surfer cuts only 11-13% of it and gains nothing; a later melee try needs a different mechanism, not a heavier weight.
