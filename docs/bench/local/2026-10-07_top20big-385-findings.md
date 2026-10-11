# Findings: Hadur 3.8.5 against 3.8 on the 1v1 top 20, 100 seeds

Run: `top20big-385`, finished 2026-10-07. Report `2026-10-07_top20big-385.md`, rows
`data/bench/2026-10-07_hadur-top20big-385-local_cold.tsv` (4000 rows) and `_rounds.tsv`
(140000 rows). A3 page: https://lgriffin.github.io/Hadur_Robot/bench/runs/2026-10-07_top20big-385/
Kaizen entry: `kaizen/2026-10-07-top20big-trusted-count.md`.

## Conditions

- 20 opponents (`top20.txt`), 100 seeds each, 35 rounds, 800x600, cold start, paired by seed
  and opponent: 2000 pairs, 4000 battles. Robocode 1.11.1.
- Threadripper PRO 9965WX, 48 logical cores. CPU constant 1488498, parallel 12, child JVMs
  `-XX:ActiveProcessorCount=2 -Xmx2G`. Run time 20122 s (5 h 35 min).
- Host CPU load min 0, mean 32.6, max 56.7 percent. Up to 3 other Robocode JVMs were seen beside
  the bench (the owner's live RoboRumble clients). The report header says none; the A3 page's
  "up to 3" is the maximum seen across battles and is the figure to use.
- Skipped turns per battle 22.8 (3.8.5) and 22.9 (3.8). Duress ticks per battle 22.7 and 18.2.
- The gate is CAUTION: 328 of 2000 pairs are untrusted (16%, duress or skipped turns), and the
  other JVMs. Not near the score floor, no opponent excluded.

## Result

| | difference (3.8.5 minus 3.8) | 95% interval |
|---|---|---|
| Pooled, per battle (n=2000) | -0.32 | [-0.63, -0.01] |
| Pooled, opponent-clustered (n=20) | -0.32 | [-0.71, +0.07] |
| Without duress pairs (1719) | -0.33 | clustered [-0.70, +0.03] |
| Fully trusted pairs (968: no duress, no skips, no R shortfall) | -0.36 | per battle +/- 0.44 |

TOST with a 1.0 point margin: equivalent, p 0.0009 per battle and per opponent. 3.8.5 is within
one point of 3.8, and the clustered interval includes zero, so this is **level**: no resolved
loss or gain. If there is a real loss it is under 0.7 points.

Per opponent (100 pairs each, interval about +/- 1.2 to 1.6): none resolves after Holm or
Benjamini-Hochberg (smallest Holm p 0.36). The largest raw differences are DrussGT -1.73 +/- 1.44,
Dookious -1.50 +/- 1.23 and ScalarR -1.47 +/- 1.27 (unadjusted p 0.018 to 0.024) and Wavelet
+1.58 +/- 1.52. All four intervals are narrow enough to rule out gaps over about 3 points.
So 100 seeds does narrow the per-opponent intervals to a third of what 16 seeds gave, but a
difference of 1 to 2 points on one opponent still cannot be called, and 20 comparisons are
expected to throw up three or four such raw p values by chance.

Seeds to resolve a 1.0 point half-width on each opponent (unpaired SD; pairing bought nothing,
variance ratio 0.96): 138 to 252 per opponent, 4009 per build over 20 opponents, so twice this run.

## Against the earlier numbers

| Run | Difference | Reads as |
|---|---|---|
| This run, 100 seeds x 20 opponents | -0.32 +/- 0.31 (clustered +/- 0.39) | level |
| 16 seeds, top 20 (PR #119) | -1.12 +/- 1.56 | consistent, wider |
| 40 seeds, DrussGT only (PR #119) | -0.41 +/- 3.66 | consistent; now -1.73 +/- 1.44 at 100 |
| 16 seeds, leak set (PR #119) | -0.26 +/- 0.35 | consistent |
| 3.8.5 against 3.7, top 20, 20 seeds | +2.32 +/- 0.98 (clustered +/- 3.27, not resolved) | different baseline |

Every earlier interval contains this run's pooled figure, so the larger sample confirms them
and tightens the answer. Taken together with the 3.7 run, 3.8.5 sits near 3.8, and 3.8 sits
above 3.7 by a small amount that is not resolved against opponents' own spread (different
sessions, so read as a rough chain, not a measured step).

## Where the gaps are

Hadur's absolute score share (Hadur's points over the two robots' total, 3.8.5 column). This is
the robot against each opponent, not a comparison with 3.8, so it is the loss list the owner
asked for. 3.8 is shown beside it; the two builds are within 1.7 points on every opponent.

| Opponent | 3.8.5 share | 3.8 share | Gap to 50 |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 25.3 | 25.7 | -24.7 |
| aaa.r.ScalarR 0.005h.053-noshield | 32.0 | 33.5 | -18.0 |
| jk.mega.DrussGT 3.1.16 | 46.6 | 48.3 | -3.4 |
| voidious.Diamond 1.8.22 | 48.0 | 48.2 | -2.0 |
| pc.Wavelet 1.5 | 48.2 | 46.7 | -1.8 |
| aw.Gilgalad 1.99.5c | 49.2 | 49.2 | -0.8 |
| jk.melee.Neuromancer 7.12 | 50.3 | 51.2 | +0.3 |
| cb.fire.Firestarter 2.0f | 50.3 | 49.6 | +0.3 |
| rsalesc.mega.Knight 0.6.28 | 54.0 | 55.0 | +4.0 |
| lxx.Tomcat 3.68 | 54.6 | 54.1 | +4.6 |
| dsekercioglu.mega.Raven 3.56j8 | 55.9 | 55.8 | +5.9 |
| xander.cat.XanderCat 12.9 | 56.8 | 56.6 | +6.8 |
| davidalves.Phoenix 1.02 | 57.2 | 58.4 | +7.2 |
| kc.serpent.WaveSerpent 2.11 | 58.2 | 58.0 | +8.2 |
| cs.Nene 1.0.5 | 58.2 | 58.9 | +8.2 |
| voidious.Dookious 1.573c | 59.6 | 61.1 | +9.6 |
| rsalesc.roborio.Roborio 1.2.4 | 61.0 | 60.6 | +11.0 |
| gh.GresSuffurd 0.4.13 | 62.4 | 62.4 | +12.4 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 68.1 | 68.5 | +18.1 |
| oog.mega.saguaro.Saguaro 1.0 | 72.7 | 73.6 | +22.7 |

Two clear losses (BeepBoop 25.3, ScalarR 32.0), each well outside its interval (+/- 0.8 and
+/- 0.9), one near-loss (DrussGT 46.6 +/- 1.0), and a band within a few points of even
(Diamond, Wavelet, Gilgalad, Neuromancer, Firestarter). Both builds lose to the first two to
the same degree, so the gap is older than 3.8 and not something 3.8.5 changed. BeepBoop's
Hadur survival share is 12.9% and its bullet-damage share 42.5%; ScalarR's are 25.2% and 40.4%.
In both, Hadur is damaged and killed more than it damages, while its bullet-damage share is not
as low as its score share, so the loss is mostly rounds lost, not shots missed. The report's
hit rates (BeepBoop: ours 5.0%, theirs 8.7%; ScalarR 6.7% against 10.6%) point the same way.
What changes those hit rates is a question for the owner and the robot's design; this run does
not say.

## Trust notes

- The report says 1359 of 2000 candidate battles are trusted. 1810 of 2000 are trusted once the
  last round's missing R record is not held against a battle (972 of the 982 battles short of an
  R record are short by exactly one, the final round, G14, on both builds). The analysis gate
  already makes that exception; the bench's own rule does not. Raised as a kaizen entry
  (harness change, not assigned).
- XanderCat "security errors 100" is one engine denial per battle (100 candidate battles, one each):
  the opponent tries to read `META-INF/services/java.time.zone.ZoneRulesProvider` from the bench's
  class directory and the engine blocks it ("You may only read files in your own root package
  directory"). The same line appears in the baseline battles. It is not in the trust rule, does
  not affect score, and does not invalidate XanderCat's rows. Its difference is +0.15 +/- 1.47.
- Missing R records are opponent-dependent: DrussGT 60, Diamond 56, Knight 56, Wavelet 43, Raven
  42, but Saguaro 1 and Nene 1 of 100. They matter for per-round diagnostics, not score share.
- Duress is concentrated in a few opponents (ScalarR 8399 ticks, WhiteFang 6171, Saguaro 5066,
  Neuromancer 4647). 3.8.5 has 4.5 more duress ticks per battle than 3.8. Dropping duress pairs
  moves the pooled difference by 0.01 points, so it does not drive the result, but the run is
  evidence about score share, not about timing.
- Selection: the opponent set is the rumble top 20, not picked on any Hadur result, so unlike the
  live-loser set it carries no selection bias.
