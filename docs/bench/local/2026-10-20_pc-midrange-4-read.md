# pc-midrange-4 read: the surf stack is real and small, +0.6 on the class, +0.9 on the top 50

Queue `hadur-bench/plans/pc-midrange-4.queue` (docs/plan-midrange.md stage 2), run on the PC
2026-10-20, reports in PR #215 (`docs/bench/local/2026-10-20_pc-midrange4-*`). hitclr + pkern +
keep2 stacked on 3.14hjsw, with and without the 8% flattener, on the 149 random movers with
guess-factor guns at 8 fresh seeds (1071-1078), paired against 3.14hjsw; the plain stack on the
census top 50 at 4 seeds (1081-1084).

| Step | Candidate | Score (pp) | Survival (pp) | Bullet damage (pp) | Trusted pairs |
|---|---|---|---|---|---|
| s3 | 3.14hjswhcpkw2 on the 149 | **+0.6 ± 0.3** | +0.7 ± 0.4 | +0.5 ± 0.3 | +0.7 ± 0.4 |
| s3f8 | + flattener 8% on the 149 | +0.5 ± 0.3 | +0.8 ± 0.4 | +0.1 ± 0.3 | +0.5 ± 0.4 |
| guard | 3.14hjswhcpkw2 on the top 50 | +0.9 ± 1.1 | +1.0 ± 1.5 | +0.1 ± 1.0 | +1.7 ± 1.3 |

## Verdict

- The three switches together are a real gain on the class: +0.6 with the interval +0.3 to
  +0.9, under the +1.0 keep rule, and worth about +0.07 APS on the field from this class alone.
  The three single reads (+0.4, +0.5, +0.4 at 4 seeds) did not add; they overlapped.
- The flattener at 8% adds nothing on top of the stack (+0.5 against +0.6): the stack's sharper
  kernel and fresher ratings take the room the flattener used to fill. `flt8` stays off.
- The guard is the surprise: +0.9 ± 1.1 on the top 50, +1.7 ± 1.3 on the trusted pairs, with
  Diamond, Dookious, XanderCat and YersiniaPestis up and Firestarter, Foilist and CassiusClay
  down, all inside their own intervals. The sign is the same as on the class, which it did not
  have to be: the switches help against the strong guns at least as much as against the weak.
- So stage 2's answer for the midrange class is "small": the surf port is faithful, and the
  three fidelity-and-sharpness switches recover +0.6 of the 5 or so points the class costs
  against Diamond. The class is not lost in the surf's details.

## What follows

The keep rule was written for the class; the switches' value is on the whole field, where the
stop-and-start stack already reads +0.20 APS against 3.13 (`2026-10-19_stack-census-read.md`)
and the release gate is +0.3. The one run that answers it is the census: 3.14hjswhcpkw2 against
the 3.13 release on `census-312.txt` at 4 fresh seeds, the same shape as pc-1018-stack, queue
`pc-midrange-census` (13-14 hours). Gate +0.3 APS with the interval above 0 and no band below
-0.05. A pass makes the five switches the next release's 1v1 defaults; a miss closes stage 2 at
"faithful enough, small gains", with the three switches kept as a stack for whatever passes
next, and the midrange work moves to stage 3, the gun.
