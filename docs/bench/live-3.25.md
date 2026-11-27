# Hadur 3.25 live notes

3.25 was released on 2026-11-27 for all three rumbles. A team-only 3.25.1 (the same code under a new version)
followed the same afternoon, so the TeamRumble page could restart clean after a first pass on a slowed client.
The reads below come from the rumble.robowiki.net pages saved in [data/rumble/pages/](../../data/rumble/pages/)
and parsed in [data/rumble/parsed/](../../data/rumble/parsed/).

## 1v1

| Read (UTC) | Rank | APS | PWIN | Survival | Pairings | Battles |
|---|---|---|---|---|---|---|
| 2026-11-27 17:21 | **2nd of 1,213** | **93.95** ± 0.19 | 99.83% | 98.35% | 1,212 | 1,975 |

BeepBoop 2.0 is 1st at 94.92, DrussGT 3.1.20 3rd at 93.20 and Saguaro 1.1.4 4th at 93.04.

On the 1,206 opponents both versions met, 3.25 scores **+0.51 ± 0.09 APS over 3.24** (93.44). The release
projected about +0.4 (range +0.3 to +0.5).

| Source | Robots | Gain per robot (points) | APS |
|---|---|---|---|
| Robots with a new 3.25 per-opponent line | 160 | +2.36 ± 0.27 | +0.31 |
| All other robots, BeepBoop under 90 against them | 198 | +1.02 ± 0.34 | +0.17 |
| All other robots, BeepBoop 90 or more against them | 847 | +0.04 ± 0.09 | +0.03 |

- **The per-opponent lines carried.** Their PC gate reads add up to about +302 points (+0.25 APS) over these
  160 robots; live they gave +377 (+0.31). The 160 robots are matched by name to the lines added between the
  v3.24 and v3.25 tags, so a few near-namesakes are counted too.
- **The rest of the gain sits on the hard opponents.** Robots without a new line gained a point each where
  BeepBoop scores under 90, and nothing elsewhere. Those are the heavy learners, where a skipped turn costs
  most, so TIME-11 to TIME-15 (a third fewer skipped turns) is the likely source, although the bench read it
  as level. The bench runs no other robots alongside, so it sees fewer stalls than a live client.
- **Two pairings lost, down from four.** PWIN rises from 99.67% to 99.83%: only BeepBoop (21.0) and ScalarR
  noshield (38.4) still beat 3.25. DrussGT moved from 35.2 to 50.8 and Saguaro from 43.8 to 55.0, both on
  two battles.
- About half the pairings rest on one battle and 88% on one or two, so single-robot scores are noisy. The class and band
  totals carry the conclusions.

### Gaps to the top three

Each figure is the rival's score minus 3.25's, summed over shared opponents and divided by the 1,212
pairings. Opponents are banded by BeepBoop's score against them.

| Opponent band | Robots | 3.25 over 3.24 | BeepBoop ahead by | (3.24: ahead by) | Saguaro 1.1.4 ahead by | DrussGT 3.1.20 ahead by |
|---|---|---|---|---|---|---|
| Under 80 | 34 | +0.12 | +0.16 | (+0.27) | -0.19 | -0.04 |
| 80 to 90 | 200 | +0.19 | +0.17 | (+0.39) | -0.63 | -0.25 |
| 90 to 95 | 174 | +0.03 | +0.12 | (+0.15) | -0.07 | -0.07 |
| 95 to 98 | 228 | +0.08 | +0.14 | (+0.22) | +0.02 | -0.15 |
| 98 and up | 575 | +0.09 | +0.33 | (+0.42) | -0.03 | -0.25 |
| Whole field | 1,211 | +0.51 | **+0.92** | (+1.45) | -0.90 | -0.76 |

- The lead over DrussGT and Saguaro is now about 0.8 to 0.9 APS, most of it on the 80 to 90 band.
- BeepBoop's lead shrank from 1.45 to 0.92. The largest piece left, 0.33, is on the 575 robots BeepBoop scores
  98 or more against: a little under a point a robot where both robots win easily. That is the share of
  bullets taken against easy opponents, which a per-opponent line does not reach.

## Team

HadurTeam 3.25.1 is **2nd of 48 at 85.77 ± 0.42** (47 pairings, 265 battles, survival 92.43%, PWIN 97.87%).
On the same 47 teams it scores **+1.20 ± 0.44 over 3.24** (84.57); the release projected about +1.2. OgiTeam
is 1st at 87.89, the only team that beats it (38.4), and CombatTeam 3rd at 81.51.

The first pass under 3.25 read 79.35 (4th). That pass ran on one client whose engine could not stop the threads
one opposing team leaves behind, so every later battle on that client ran with less CPU. The same code under
3.25.1 on a clean client reads at its projection.

## Melee

Hadur 3.25 is **7th of 416 at 69.67 ± 0.23** (415 pairings, 1,271 battles, survival 61.48%). On the 411
opponents both versions met it scores +0.11 ± 0.12 over 3.22 (69.65), against the +0.28 the bench read for
MEND-6. ScalarR leads at 72.63.
