# Plan-90 step 4: the 3.13 gate, read

**Result: 3.13 passes.** On the 200 robots on its shield list, it is +1.40 APS over 3.12 (+1.18
to +1.61). On the whole field it is +1.46 APS (+1.15 to +1.76). The 1,012 robots off the list
read level (-0.01 APS), as they should, since shield mode never acts on them.

Runs: Leigh's PC, 2026-10-13, `plans/plan90-gate.queue`. Reports:
`2026-10-13_plan90-gate-listed.md` (200 robots, 8 fresh seeds, 921-928) and
`2026-10-13_plan90-gate-census.md` (1,212 robots, 4 fresh seeds, 931-934). Each opponent's
paired difference comes from the report's "Paired A/B" table; APS sums them over 1,217
pairings. Both builds skipped about the same number of turns (census 38.6 against 39.5 a
battle; listed 14.1 against 14.9).

| Group | Listed run (8 seeds) | Census (4 seeds) |
|---|---|---|
| All 200 listed robots | **+8.5 pp, +1.40 APS** (170 up) | +1.46 APS for the whole field |
| The 103 new robots | +13.2 pp, +1.12 APS (103 of 103 up) | +13.8 pp, +1.17 APS |
| The 89 both lists name | +4.2 pp, +0.31 APS | +4.6 pp, +0.34 APS |
| The 8 on Hadur's list only | -4.2 pp, -0.03 APS (0 up) | -6.3 pp, -0.04 APS |
| The 1,012 off the list | (not run) | -0.01 pp, -0.006 APS |

Census by band (APS): band 1 -0.008, band 2 +0.20, band 3 +0.42, band 4 +0.50, band 5 +0.26,
band 6 +0.08.

The gate set three conditions: at least +0.6 APS with the interval above 0, the 103 new robots
positive together, and no band below -0.05 APS. All three hold.

## Left for after 3.13

- **The 8 robots on Hadur's list only** (AIR.iRobot, DM.mega.Bezier, ary.SMG, cf.mini.Chiva,
  cx.micro.Smoke, rcb.Vanessa03, stelo.Randomness, suh.micro.MirrorPM) lose to the new shield in
  both runs. Together that is about -0.03 to -0.04 APS. Taking them off the list plays them
  without a shield, which neither run measured.
- **Five robots from 3.10's list lose 12 to 19 points in both runs:** Toa, Crusader,
  Exterminator, Grrrrr and Shiva. These are robots whose aim moves once their bullets are met.
  3.12's exits suited them better. A per-robot sweep, shield on against shield off, under the
  3.13 design would settle whether they stay.
