# JayLexi with FoilistMC's gun (cloud-jaylexi-foil, BENCH-201)

Run on the cloud box 2026-11-06 03:10 to 04:29 GMT (1,792 battles, 3 workers, 2 failed). Card and arm removed after
the read (no dead experiment code); the card text is in git history at PR #679.

**FG fails: -0.43 +- 0.57 points against 0.6.** FoilistMC's gun and power on JayLexi 0.6's body do not beat
JayLexi's own GuessFactor gun. **FoilistMC itself reads +1.42 +- 0.60**, about the 0.54 the live pass showed and more,
so the leader's edge on this panel is not its gun. The A/A is clean (-0.04 +- 0.25, band +- 0.55).

One caveat: FoilistMC's matcher scans up to 10,000 history entries a turn. On the 4-core cloud box the engine disabled F
and FG 17 and 11 times per 100 battles, against 2 for 0.6, which costs them a little here and less on a
live client's faster machine. It does not turn FG's -0.43 into a gain: F carries the same cost and still leads.

Next: `cloud-jaylexi-foil2` (BENCH-203) asks the other half. FM is FoilistMC 1.0's movement, radar and surfing with
JayLexi 0.6's gun. If FM reads near F, the lead is movement, and the byte port is FoilistMC's movement with our gun.

## Read (multiarm.py)

A/A: aa - c = -0.04 ± 0.25 points over 112 opponents; 1% band ± 0.55, inside: the run stands.

| Arm | Opponents | Level | vs ref | Field (census-weighted) | Skips a battle | Skips a round | Trusted | Disables /100 | Battles |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| F | 111 | 86.37 | +1.42 ± 0.60 | - | 0.6 | 0.02 | 100% | 17.1 | 444 of 448 |
| FG | 112 | 84.14 | -0.43 ± 0.57 | - | 0.5 | 0.02 | 100% | 10.7 | 448 of 448 |
| aa | 112 | 84.55 | -0.04 ± 0.25 | - | 0.1 | 0.00 | 100% | 1.3 | 448 of 448 |
| c | 112 | 84.58 | ref | - | 0.2 | 0.00 | 100% | 2.0 | 448 of 448 |
