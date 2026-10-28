Deise 0.3, a MiniMelee robot built to take 1st (docs/deise.md). One class, 1,494 bytes, under MiniMelee's 1,499.

- Seen-shot waves: when an opponent's energy drops by 0.1 to 3, Deise records the shot and steers off its head-on and linear lines. A shot from a robot that is probably aiming at someone else counts a quarter.
- 200 playouts of Saor's graded Markov gun, up from 64. It still learns every robot it scans.
- Range power capped at 3 and by the field. The cap at what kills the target is gone.
- Least-risk movement over a ring of 36 points, with a flat push from every opponent. The across term, the 10% hold on the destination and the corners are gone, which frees the bytes for the waves.

Bench (pc-deise-e03): this build's parts read +0.48 to +0.83 over 0.2 on the live-shaped MiniMelee census. The fitted class as a whole is measured by pc-deise-e04. The shipped class gives the same orders, to the bit, as the core-driven build (DEISE-16).

MeleeRumble participants line (LiteRumble scores it in MiniMelee and MeleeRumble), replacing 0.2's:
`hadur117.mini.Deise 0.3,https://github.com/lgriffin/Hadur_Robot/releases/download/deise-v0.3/hadur117.mini.Deise_0.3.jar`
