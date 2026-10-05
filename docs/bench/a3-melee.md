# A3 gate: melee and hand-off, paired against A2

A3 (the World promoted to the kernel, only the charter's roles built) against the A2 jar,
both built at 3.6 from the same tree but for the stage. The suite is `melee-gates-a3.txt`:
the sentry set (3 rounds x 3 seeds, sentry border 100), the melee reference set and the
hand-off set (35 rounds x 3 seeds each), 1000x1000. The two benches ran side by side on the
same machine, so they shared its load. In the A2 report the robot is labelled 3.5.1; the jar
is A2's (`cand-a2.jar`).

| Set | A2 APS | A3 APS | Change | A2 survival | A3 survival | Skipped turns (A2, A3) |
|---|---|---|---|---|---|---|
| Sentry | 63.2 | 71.8 | +8.6 | 61.1 | 77.8 | 11, 13 |
| Melee reference | 52.3 | 52.7 | +0.4 | 57.1 | 59.2 | 39, 39 |
| Hand-off | 50.3 | 52.2 | +1.9 | 56.1 | 59.4 | 36, 14 |

The sentry set is 9 rounds a side, so its +8.6 is noise in A3's favour, not a gain. The
two 35-round sets are within noise and on the right side of it (the same jar has given
51.3 and 53.7 on the reference set; see the M6 sweep notes).

The M records the gate holds still:

| Counter | A2 | A3 |
|---|---|---|
| Melee faults (GATE-4) | 0, 0, 0 | 0, 0, 0 |
| Ticks aimed at a dead robot | 0, 0, 0 | 0, 0, 0 |
| Robots dropped as dead without a death event | 0, 0 | 0, 0 |
| Rounds vetoed by a sentry | 8 | 7 |
| Shots at a sentry (sentry set) | 8 | 11 |
| Virtual hits, reference set | 14.3% | 14.4% |
| Virtual hits, hand-off set | 14.4% | 14.5% |

The longest scan gap with four or more alive is a per-run maximum and swings with one
round: 56 to 34 ticks on the reference set, 54 to 101 on the hand-off set. No round in
either jar met the 8-tick mark at that count, as before A2, so A3 changes nothing there.

Verdict: the gate passes. Melee and hand-off are level or better within noise, and no
fault, dead-robot or ghost counter moved.

The review fix that followed the bench (the melee seam books a scan only against the
World's view of that robot) changes nothing on the conductor's path, where the names
always match; every replay fixture is unchanged.
