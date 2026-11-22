# Requirements: Deise (MiniMelee)

Deise, the MiniMelee entry ([deise.md](../deise.md)).

EARS requirements, one row each; [README](README.md) gives the rules. IDs never change meaning and are never reused; a requirement that is dropped moves to [retired.md](retired.md).

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| DEISE-1 | Ubiquitous | Each tick the bot shall drive toward the least-risk of 36 points on a ring of radius 0.45 of the target's distance, within 36 to 160 px, that keep 18 px off the walls (0.2 also kept its destination unless a ring point was 10% safer or the destination was within 16 px; off since 0.3). | E2 |
| DEISE-2 | Ubiquitous | The risk of a point shall include, for each live opponent, 106,667 plus 213,333 times its weight (DEISE-5's, set at every scan), over the squared distance to it (0.3: a flat 80,000; 0.2: 50,000 plus 500 times its energy). | E3 |
| DEISE-3 | State | While no other robot is within 0.9 of the bot's distance from an opponent, the risk of a point shall include the absolute cosine between the heading to the point and the bearing from the point to that opponent (0.2 only; off since 0.3, `Move.ACROSS`). | E2 |
| DEISE-4 | State | While 4 or more opponents remain, the risk of a point shall include the number of opponents times its distance to the nearest corner over 5,000 (0.2 only; off since 0.3, `Move.CORNERS`). | E2 |
| DEISE-5 | Event | When an opponent is scanned, the bot shall set its weight to 1 if no other robot is within 0.9 of the bot's distance from it and 0.25 otherwise (since 0.4; 0.3 weighed only its shots). When its energy has dropped by 0.1 to 3 since its last scan, the bot shall record a wave, fired halfway back to that scan (at most 8 ticks), with a head-on and a linear line, weighed by that weight, in a ring of 64 slots; its danger at a point not yet passed is, for each line, the weight times 4,000 over 800 plus the squared distance from the point to that line's bullet at the point's range, added to the risk (in the shipped class since 0.3; 0.2 left the waves out). | E3 |
| DEISE-6 | Event | When any opponent is scanned 1 to 8 ticks after its last scan, the bot shall record the transition from its last state to its present one, the turn spread over the gap, in that opponent's table, kept across rounds; a full row shall replace a random sample. | E0 |
| DEISE-7 | State | While the target's present Markov row holds no sample, the gun shall play the target on with that state held, which is circular projection. | E0 |
| DEISE-8 | State | While it holds a sample, the gun shall play the target out by sampling its Markov chain, 400 playouts since 0.5 (200 in 0.3 and 0.4, 64 in 0.2), where a playout through a row of fewer than 8 samples votes at most 5 plus 12 for each sample of that row. | E0 |
| DEISE-9 | Ubiquitous | A playout's vote shall cover the 1,024-bin circle over half the target's width at its distance, atan(9 / distance) either side since 0.5 (atan(18 / distance) to 0.4), and a playout that leaves the field shall vote 1. | E0 |
| DEISE-10 | Ubiquitous | Bullet power shall be log10(energy) times 325 over the distance, capped at 3, and at least 0.1 (0.3 also capped it at 1.9 plus one for every 3 opponents left, and 0.2 at the power that kills the target). | E3 |
| DEISE-11 | Unwanted | If gun turn remaining is non-zero, or the bot's energy is not above the power, then the bot shall not fire. | E2 |
| DEISE-12 | Unwanted | If Robocode's codesize tool reports more than MiniMelee's 1,499 bytes for the shipped jar, or more than one class in it, then the build shall fail. | E0 |
| DEISE-13 | Ubiquitous | The live-shaped MiniMelee census shall run fields drawn from the whole MeleeRumble list and score the seated robot only on its pairings against MiniMelee robots, with Deise in the field in place of a seated robot. | E0 |
| DEISE-14 | Ubiquitous | The domain core (`hadur117.mini.core`) shall depend on the JDK only, and the module on no Hadur, Saor or TwinSaor module. | E0 |
| DEISE-15 | Ubiquitous | The shipped jar shall carry the robot's properties at the release version and its source. | E0 |
| DEISE-16 | Ubiquitous | The shipped class, the core flattened by hand, shall give the same orders, to the bit, as the bench adapter (`DeiseLab`, which calls the core) in the same melees, both as compiled and as shipped. | E0 |
| DEISE-17 | Event | When an opponent is scanned, the bot shall make it the target if it is the target already or if its distance times the square root of (the shots fired at it + 10) over (the bot's hits on it + 1.5), both kept across rounds, is less than the target's at the target's last scan; a shot counts when the gun fires it, and any robot's death opens the choice to the next robot scanned (since 0.5; 0.4 took the nearest, and only the target's death opened the choice). | E7 |
