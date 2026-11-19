# Hadur 3.23 live notes

3.23 was released on 2026-11-16. Its first full 1v1 pass finished at 16:10 UTC the same day, and it placed
**3rd of 1,205 at 93.03 ± 0.22** over all 1,204 pairings. The 1v1 and team passes used one cloud client on
Robocode 1.12.0, because the server no longer accepts 1.11.2 clients. No PC clients ran on the live rumble.

## 1v1

| Read (UTC) | Rank | APS | Pairings | Battles |
|---|---|---|---|---|
| 2026-11-16 16:10 | 3rd | 93.03 ± 0.22 | 1,204 | 1,396 |
| 2026-11-16 18:18 | 3rd | 93.04 ± 0.19 | 1,204 | 1,892 |

On the 1,203 opponents both versions met, 3.23 scores **+0.49 ± 0.21 APS over 3.22**. The release
projected +0.48.

| Source | Robots | Gain per robot (points) | APS |
|---|---|---|---|
| Robots with a new 3.23 per-opponent line | 48 | +5.5 ± 1.9 | +0.22 |
| All other robots (the shadow fix, MOVE-43) | 1,155 | +0.29 ± 0.20 | +0.27 |

The 48 robots are matched by name to the lines in [the 3.23 notes](../releases/v3.23.md), so a few
near-namesakes are counted too. The shadow fix gains most against the hardest opponents, at +1.7 points
a robot on the 100 robots DrussGT scores under 80 against, and reads level on the rest.

### Gaps to the top three

Each figure is the rival's score minus 3.23's, summed over shared opponents. Opponents are banded by
DrussGT's score against them, or by BeepBoop's in the DrussGT column. The Robots column counts the
DrussGT bands; by BeepBoop's score the bands hold 29, 196, 172, 232 and 573 robots.

| Opponent band | Robots | BeepBoop ahead by | Saguaro 1.1.4 ahead by | DrussGT 3.1.18 ahead by |
|---|---|---|---|---|
| Under 80 | 111 | +0.61 | -0.27 | -0.02 |
| 80 to 90 | 182 | +0.37 | -0.07 | -0.23 |
| 90 to 95 | 196 | +0.44 | +0.32 | +0.07 |
| 95 to 98 | 270 | +0.22 | +0.17 | +0.03 |
| 98 and up | 443 | +0.29 | +0.10 | +0.02 |
| Whole field | 1,202 | +1.93 | +0.25 | -0.14 |

- Saguaro's lead sits on mid-field robots, the 90 to 98 bands, while 3.23 already beats it on the hardest
  opponents. The target list is 114 robots where Saguaro beats 3.23 by 3 points or more. 64 of them
  trailed by 3 or more against 3.22 too, and those are worth 0.40 APS.
- BeepBoop leads in every band, including robots 3.23 already scores 98 or more against. That fits a
  field-wide movement gap, which per-opponent lines cannot reach.
- About 80% of pairings rest on one battle at full pairings, so single-robot scores are noisy. The class
  and band totals carry the conclusions.

## Team

HadurTeam 3.23 is **2nd of 48 at 83.37 ± 0.51** (47 pairings, 213 battles). That is +0.8 over 3.22's
82.56, against the +0.44 the bench read for MOMENTUM (TMODE-49). OgiTeam is 1st at 88.02. Two pairings
cannot be played: L337Team's battles return no result, and DeltaSquad's jar URL returns 404.

## Melee

The MeleeRumble entry stays `hadur117.Hadur 3.22` (7th of 418 at 69.69), and no melee client ran.

## Client notes

- The client fills its battle list from the priority file in order, after the robots below the
  battles-per-bot threshold, and the server rewrites that file after each upload. With 3.23's pairings
  kept at the head of the file, every battle in a batch was 3.23's.
- The cloud box was reclaimed twice (12:16 and 12:45), both times while the session sat idle between
  checks. The client lost about 15 minutes in total.

Saved pages: `data/rumble/pages/2026-11-16T1818Z_*` (3.23, 3.22, BeepBoop, Saguaro 1.1.4, DrussGT 3.1.18,
HadurTeam 3.23 and both rankings), parsed to `data/rumble/parsed/2026-11-16T1818Z_*.csv`.
