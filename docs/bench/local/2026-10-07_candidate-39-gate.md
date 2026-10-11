# Candidate 3.9 gate: 3.9 against 3.8.5

Written 2026-10-07 after `./queue.sh run candidate-39` (plan `hadur-bench/plans/candidate-39.queue`)
and three reruns (rammers, leak set, top 20). 3.9 is the RAM-3 rammer trial: the rammer escape is tried and kept only where
it pays (#130). Nothing in `hadur-core` or `hadur-robot` was changed for this bench, and 3.9 has not
been released or tagged; that is the owner's call. This page reports what was measured and how
sure we are.

## Answer in one paragraph

On the live losers 3.9 is clearly ahead of 3.8.5 (+5.46 points, clustered 95% interval +3.08 to
+7.84). On the leak set and the 1v1 top 20 it is level, with intervals that sit inside the 1.0 point
margin on the leak set and on the clean 20-seed top-20 rerun (+0.22, -0.39 to +0.82). On 3.5's rammers the first run read
-0.69 (-1.01 to -0.38) and the clean rerun read +0.06 (-1.45 to +1.58): the set as a whole is level
but a few rammers are lower by 0.6 to 0.8 points, and that cost is the thing to watch. Every gate
has a trust caveat below; none is a clean TRUSTED run. The leak and top-20 reruns agree with their first runs;
the rammer reruns do not agree on the set mean (see below).

## Results

Score share, Hadur 3.9 minus Hadur 3.8.5, paired by opponent and seed, in points. The headline is
the opponent-clustered 95% interval. Raw rows are in `data/bench/2026-10-07_hadur-<run>-v385-local_cold.tsv`.

| Gate | Run | Opponents x seeds | Difference | Clustered 95% | Verdict | Trust gate |
|---|---|---|---|---|---|---|
| Live losers | `ll-39` | 39 x 8 | +5.46 | +3.08 to +7.84 | UP | CAUTION |
| 3.5's rammers | `weak-39` | 11 x 16 | -0.69 | -1.01 to -0.38 | LEVEL (TOST) | NOT_TRUSTED |
| 3.5's rammers, rerun | `weak-39r` | 11 x 16 | +0.06 | -1.45 to +1.58 | NOT RESOLVED | NOT_TRUSTED |
| Leak set | `leak-39` | 32 x 16 | +0.08 | -0.24 to +0.41 | LEVEL | NOT_TRUSTED |
| Leak set, rerun | `leak-39r` | 32 x 16 | -0.02 | -0.48 to +0.44 | LEVEL (TOST) | CAUTION |
| Top 20 | `top20-39` | 20 x 10 | +0.00 | -1.20 to +1.21 | LEVEL (marginal) | CAUTION |
| Top 20, rerun | `top20-39r` | 20 x 20 | +0.22 | -0.39 to +0.82 | LEVEL (TOST) | CAUTION |

### Live losers (`ll-39`)

Ten opponents are individually up after Holm adjustment (14 by Benjamini-Hochberg), led by
wiki.WaveRammer +22.0, shrub.Silver +20.5, lorneswork.Predator +21.1, marcinek.TopGun +20.1 and
ahr.ice.Ice +15.0. The unresolved downs are theo.QuarkSoup -5.59, dft.Immortal -1.81 and
kinsen.Quarrelet -1.76; none survives adjustment. zen.Ronin is excluded: it failed every battle in
this setup ("expected 2 robots; found 1"), as it did in earlier runs. Gate CAUTION: 44 of 312 pairs
untrusted; without the duress pairs the figure is +5.79.

### 3.5's rammers (`weak-39`, `weak-39r`)

The two runs disagree on the set mean because of one noisy opponent: stelo.MirrorMicro moves by
+6.4 with a +/-8.7 interval in the rerun. Across the runs the rammers are consistently a little
lower: in the rerun sample.RamFire -0.64 (Holm 0.0019) and PSW.Relentless -0.84 (Holm 0.0084)
resolve down, and bbo.RamboT, zyx.RedBull, vort.Chaser and Tirunculus sit near -0.6 to -0.8 each.
In the first run only PSW.Relentless (-1.09, Holm 0.0014) resolved. Both runs are NOT_TRUSTED
(31% and 27% of pairs with duress); without the duress pairs the rerun reads -0.26 (-1.45 to
+0.94). A 0.6 to 0.8 point cost is small, but it is the one place 3.9 is measurably below 3.8.5.

### Leak set (`leak-39`, `leak-39r`)

Level on both runs. The rerun, run alone, has a clustered interval of -0.48 to +0.44 and passes the
non-inferiority and equivalence tests at the 1.0 margin (both p < 0.0001). No opponent resolves
after adjustment. The first run was NOT_TRUSTED because the top-20 run was on the machine beside it
(up to 13 other Robocode JVMs); the rerun replaces it.

### Top 20 (`top20-39`, `top20-39r`)

First run, 10 seeds: +0.00 +/- 1.20, equivalence at the 1.0 margin only marginal (p 0.0498). The
largest raw losses were cs.Nene 1.0.5 (-5.76 +/- 3.59, Holm 0.11) and gh.GresSuffurd 0.4.13
(-6.24 +/- 5.47); neither resolved.

Rerun, 20 seeds, run on its own at 12 wide with the RoboRumble clients (up to 6 other Robocode
JVMs): +0.22 +/- 0.61 (-0.39 to +0.82), equivalent at the 1.0 margin (p 0.0070), non-inferior
(p 0.0002). Gate CAUTION: 75 of 400 pairs untrusted (19%); without the duress pairs +0.23 (-0.43 to
+0.90). No opponent resolves after adjustment. cs.Nene reads +1.63 and GresSuffurd -1.39, so the
first run's large losses on both were noise. The rerun's largest movements are ScalarR +2.97, DrussGT
-2.14, Firestarter +1.83 and Roborio -1.37, all unresolved.

## Conditions and caveats

- Engine Robocode 1.11.1, 35 rounds, child heap 2G, CPU constant 1488498, `--child-cpus 2`, the
  owner's live RoboRumble clients running beside the bench.
- Baseline is the released 3.8.5 jar. Candidate is 3.9 built from master (RAM-3, #130).
- `ll-39`, `weak-39`, `leak-39` and `top20-39` ran concurrently, 24 battles wide in total, so each
  saw the other's JVMs as "other Robocode JVMs" and drifted toward CAUTION or NOT_TRUSTED.
  `weak-39r` and `leak-39r` were rerun alone at 12 wide. `weak-39r` was still NOT_TRUSTED (27%
  duress pairs, one other JVM), so the cause is not only the concurrency; it is probably
  background load on the host, not a difference in the robots.
- The trusted-pair counts in the bench's Java rule and the analysis gate differ (kaizen item from
  the 3.8.5 work, still open).
- Intervals are opponent-clustered. The per-battle intervals are 1.8 to 3 times narrower and are
  not used for any claim.

## What this says for the release decision

- The expected gain (the live losers come back) is there and large.
- Nothing in the leak set or top 20 shows a loss that resolves, on either run.
- The cost to watch is a small drop against some rammers (sample.RamFire, PSW.Relentless).
- The top 20 is level on the clean rerun, and the two robots that looked worst in the first run (cs.Nene, GresSuffurd) are not lower.

Whether to cut 3.9 is the owner's decision.
