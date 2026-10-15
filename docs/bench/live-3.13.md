# 3.13 live (2026-10-15 05:56 UTC): 7th of 1,218 at 89.50

Pages saved by Leigh at 05:56 UTC: Hadur 3.13's BotDetails page and the 1v1 rankings, archived in
`data/rumble/pages/2026-10-15T0556Z_*` and parsed to `data/rumble/parsed/2026-10-15T0556Z_*`.
All 1,217 pairings are in, 1,968 battles. Two cloud clients (Robocode 1.11.1, `-Xmx6G`, user
`leigh`) ran from 21:58 UTC on 2026-10-14 alongside the other rumble clients.

| Release | APS | Rank | PWIN | Survival | Battles |
|---|---|---|---|---|---|
| 3.13 | **89.50** ± 0.19 | **7th** | 99.51 | 95.92% | 1,968 |
| 3.12 | 87.72 ± 0.20 | 9th | 99.42 | 95.27% | 1,949 |

| Rank | Robot | APS |
|---|---|---|
| 5 | ScalarR 0.005h.053-noshield | 91.23 |
| 6 | Diamond 1.8.22 | 90.15 |
| **7** | **Hadur 3.13** | **89.50** |
| 8 | Firestarter 2.0f | 88.10 |
| 9 | Raven 3.56j8 | 87.73 |
| 10 | XanderCat 12.9 | 87.70 |

## Where the +1.78 came from

Per opponent, 3.13's page minus 3.12's (1,216 opponents on both, plus KurtBot's version change), as APS (sum over the group
divided by 1,217). The groups are the shield list in `hadur-bench/shield-313.txt`:

| Opponents | Count | Mean change (points) | APS |
|---|---|---|---|
| 3.12's 97 listed robots | 97 | +4.82 | +0.38 |
| 103 robots added for 3.13 | 103 | +14.13 | +1.20 |
| Unlisted | 1,016 | +0.25 | +0.21 |
| KurtBot 0.2 in place of 0.1 (83.25 vs 3.12's 88.97) | 1 | -5.72 | -0.005 |

The four rows sum to the page's +1.78. KurtBot is the one opponent not on both pages: 0.2 replaced
0.1 between the two passes.

The listed robots carry +1.58 of it, against the plan90 gate's bench estimate of +1.40 for the
listed 200 (`docs/bench/local/2026-10-13_plan90-gate-read.md`). Shield mode acts only on listed
robots, so the unlisted +0.21 is single-battle noise in a pass where most pairings have one or
two battles.

By the opponent's rank: ranks 1-50 +4.1 points, 51-200 +3.9, 201-400 +3.7, 401-800 +1.2,
801-1,218 +0.4.

## Notes from the client

- Three Kotlin robots (e32.Omni, zen.Mirage, zen.Ronin) need `kotlin-stdlib` on the client's
  classpath. Without it the last three pairings never filled; with it they did.
- Against zen.Mirage 0.9.5 the engine logged "Unable to stop thread: hadur2.Hadur 3.13" at round
  ends, and Hadur won only 2403 to 2009. Worth a look on the bench.
