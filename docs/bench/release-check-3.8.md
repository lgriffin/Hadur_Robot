# Release check: 3.8 against 3.7

The shipped 3.8 build (master after PR #104, with every review fix) against the released 3.7
jar, paired by seed (BENCH-2): 10 battles against DrussGT 3.1.16 and the top-10 set at 2
seeds, 35 rounds each, cold. Suite
[hadur-bench/release-check-38.txt](../../hadur-bench/release-check-38.txt). Run on 6 October
2026 in the Claude Code container (4 cores, Java 21), one bench at a time. The raw report is
[release-check-3.8-report.md](release-check-3.8-report.md).

This is the only bench of the code as shipped: the stage gates ran on jars built before D5, T1
and the review fixes merged.

| Set | 3.8 | 3.7 | Paired difference (points) |
|---|---|---|---|
| DrussGT, 10 battles | 45.5% ± 2.8 | 35.1% ± 2.5 | **+10.5 ± 3.1** (10 of 10 up) |
| Top 10, 2 seeds (20 battles) | | | **+7.2 ± 6.3** (14 of 20 up) |

| Top-10 opponent | 3.8 | 3.7 | Paired diff |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 25.9% | 18.5% | +7.5 |
| jk.mega.DrussGT 3.1.16 | 53.4% | 29.0% | +24.3 |
| oog.mega.saguaro.Saguaro 1.0 | 68.6% | 73.6% | -5.0 |
| aaa.r.ScalarR 0.005h.053-noshield | 42.9% | 20.7% | +22.3 |
| voidious.Diamond 1.8.22 | 49.8% | 25.6% | +24.2 |
| cb.fire.Firestarter 2.0f | 51.1% | 40.8% | +10.4 |
| dsekercioglu.mega.Raven 3.56j8 | 56.8% | 57.6% | -0.9 |
| xander.cat.XanderCat 12.9 | 46.6% | 53.8% | -7.2 |
| lxx.Tomcat 3.68 | 45.6% | 54.2% | -8.6 |
| rsalesc.mega.Knight 0.6.28 | 55.3% | 50.3% | +5.0 |

Two seeds per opponent: only the pooled figure is read, and the per-opponent rows are noise
at this size (the 3.7 shares swing by 50 points between seeds against some).

## Reading

- **DrussGT** is where the route was aimed: +10.5, in line with D1's +12.0 gate. D2 to D4 and
  the review fixes did not give it back.
- **The top 10 rose +7.2 ± 6.3**, in line with D1's +6.7 and the stack's +3.5 on top of it.
  The gains are on the surfers whose bullet power follows ours down (DrussGT, Diamond, ScalarR,
  Firestarter, BeepBoop); Tomcat, XanderCat and Saguaro read lower, inside the noise of two
  seeds.
- **Skipped turns**: 447 against 335 on the top 10 (20 battles), 298 against 314 on DrussGT.
  D4's shadow aim is the likely cost on the top 10; it is shed at TickBudget level 2 and up.
- Not measured here: the weak set (level in the D1 and stack gates), melee (no D stage touches
  the melee strand; T1 acts only on a team) and the team (T1 gate: share 28.8% to 48.2%).
