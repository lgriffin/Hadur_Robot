Deise 0.5, a MiniMelee robot built to take 1st (docs/deise.md). One class, 1,499 bytes, at MiniMelee's limit.

- Whom to shoot: Deise keeps, per opponent and across rounds, the shots it has fired at it and its hits on it, and takes as target the robot with the least distance times the square root of (shots + 10) over (hits + 1.5). A robot it hits half as often must be about 0.7 as far to be shot. The present target stays the target at its own scans; any robot's death reopens the choice (DEISE-17).
- Aim: 400 playouts of the Markov gun (200 in 0.4), each voting over half the target's width (DEISE-8, DEISE-9).
- Unchanged from 0.4: the aim-weighted push and seen-shot waves, range power within 0.1 to 3, the least-risk ring of 36 points.

Bench: the two parts were measured over 0.4, not together. 400 playouts at half width (arm PN, pc-deise-e10, PR #509): +0.13 ± 0.21. Learned targeting (arm LEARNH, cloud census, 46 fields, 203 opponents): +0.45 ± 0.40, living longer at the same damage a round. 0.4 is 2nd in MiniMelee live, 0.58 behind kc.mini.Mirage. The shipped class gives the same orders, to the bit, as the core-driven build (DEISE-16).

MeleeRumble participants line (LiteRumble scores it in MiniMelee and MeleeRumble), replacing 0.4's:
`hadur117.mini.Deise 0.5,https://github.com/lgriffin/Hadur_Robot/releases/download/deise-v0.5/hadur117.mini.Deise_0.5.jar`
