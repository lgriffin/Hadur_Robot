Deise 0.4, a MiniMelee robot built to take 1st (docs/deise.md). One class, 1,499 bytes, at MiniMelee's limit.

- Crowd survival: at every scan Deise tests whether each opponent is likely aiming at it (no other robot nearer that opponent). A likely shooter weighs 1 and the rest 0.25, and the weight now scales the opponent's push as well as its waves, so a likely shooter pushes twice as hard. Every push is about twice 0.3's.
- Range power capped at 3 only; 0.3's cap by the number of opponents left is gone.
- Unchanged from 0.3: the seen-shot waves (head-on and linear lines), 200 playouts of Saor's graded Markov gun learning every robot it scans, and the least-risk ring of 36 points.

Bench (pc-deise-e06, PR #443, fresh seeds, the live-shaped MiniMelee census): +0.39 ± 0.22 over 0.3, with Mirage's bench lead down from 1.21 to about 0.85. The shipped class gives the same orders, to the bit, as the core-driven build (DEISE-16).

MeleeRumble participants line (LiteRumble scores it in MiniMelee and MeleeRumble), replacing 0.3's:
`hadur117.mini.Deise 0.4,https://github.com/lgriffin/Hadur_Robot/releases/download/deise-v0.4/hadur117.mini.Deise_0.4.jar`
