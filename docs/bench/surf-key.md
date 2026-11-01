# Per-opponent surf keys (SKEY-1 to SKEY-3, card pc-surf-key)

Lever 4 of `docs/bench/rival-2nd-read.md`. The new 2nd-place rival fits its surf's k-NN key weights and kernel width
for each opponent (247 names, +0.20 on its whole field). Our hit views search the nine MoveFormula values with the same
weights for everyone. This is the one per-opponent lever aimed at the 775 robots we and the rival both play in normal
mode, which hold +0.91 of its +2.07 lead.

## What was built

- **SKEY-1, record.** `MoveDesign.SURF_KEY_RECORD` (off; ablation `skrec`, suffix `kr`) writes one `SKN` line for each
  enemy wave at its first rating: fire time, power, and the 13 FlattenerFormula values (the first 9 are MoveFormula's).
  Behaviour is unchanged. With `oracle` and the truth log on, `gun_oracle.join_battle` gives each wave its true GF.
- **SKEY-2, play.** A `surf-key: m1 .. m9 bw name` line in the shield list multiplies the 9 MoveFormula weights of the
  7 hit views (normal, recent1 to recent6) and scales only their danger kernel's width by `bw`. The simple view and the
  three flatteners keep their weights and width, so the key changes only what the fit modelled. Duel only. No line = master. Ablation `sklist` reads `SURF_KEY=<file>` (suffix `kl`); `sklist,bb` is the weights-only arm.
- **SKEY-3, fit.** `data/tools/surf_key_fit.py join` turns record runs into one table; `fit` models the "normal" hit
  view (k = min(20, n/5), the surf's kernel), scores each held-out bullet in bits over uniform (5% uniform mixed in), and
  searches each weight by coordinate descent in quarter-log2 steps plus 6 widths. Two seeds fit, two score, both ways. A
  key ships when both folds gain 0.02 bits a bullet and the robot has 30 hits.

## Cloud read (2026-10-31, 4 cores)

- Record: 58 of the panel's 60 robots (two zen jars do not load) x 2 seeds, 207,972 enemy bullets, 19,277 hits.
  Report `local/2026-10-31_skey-rec.md`.
- Fit: **50 of 60 keys ship**. The worse fold gains +0.22 bits a bullet on average (median +0.15); 3 robots lose.
  Most picked the widest kernel (2.8 x 37, 2.0 x 12). The proxy models one view while the width acts on all seven hit views, so
  the card also runs a weights-only arm. Fit table `local/2026-10-31_skey-fit.md`, keys `local/2026-10-31_skey-keys.txt`.
- Smoke A/B, master vs keys, the 50 shipped robots x 2 fresh seeds from 6000 (200 battles):
  **+0.82 ± 1.03 points of score share, not significant**; 32 robots up, 18 down. Weaker robots gain (bands 4 to 6 +1.0
  to +1.7); the strong learners lose (WaveSerpent -8.4, SandboxDT -6.6, Diamond -6.5, PinkPanther -5.8, Dookious -4.1).
  On the 1,217 field that is about +0.03 APS. Reports `local/2026-10-31_skey-smoke.md` and
  `local/2026-10-31_skey-smoke-per-robot.md`.

The smoke ran an earlier form of SKEY-2 that also widened the flatteners' kernels (weights 50 and 500) and keyed the
light flattener; a review caught it, and the card tests the narrowed form. Widening the flatteners by 2.8 against
the strong learners, where they are on, fits those losses too.

The keys are fitted on 2 seeds of our own play, so a learner that adapts to us breaks them; that fits the losses. The
PC card has 4 seeds a robot to fit on, a weights-only arm, and a 3-point per-robot pick, so only robots whose key pays
on fresh seeds would ship.

## Card pc-surf-key (BENCH-160)

`hadur-bench/plans/pc-surf-key.queue`, about 1.5 h. Leigh starts it.

| Step | What |
|---|---|
| record | `oracle,skrec` x 198 robots (`panel-surf-key-200.txt`) x 4 seeds from 5800, truth log on, 792 battles |
| fit | weights + width (`keys.txt`) and weights only (`keys-nowidth.txt`); builds `kl` and `klbb` |
| confirm | c, aa, kl, klbb x 198 x 3 fresh seeds from 5900, 2,376 battles |
| gate | kl and klbb each +0.05 APS, 95% low end above 0, A/A in band; 3-point per-robot pick; every robot's difference |

Stop rules: record and confirm halt on fails 30, skips 40 over 200, stall 30m; confirm also on dead 8. A record halt
leaves the fit and the confirm unrun. Nothing ships from the card: on a pass a PR adds the picked robots' `surf-key:`
lines for the next census.
