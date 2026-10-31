# Team brain CONCORD (TMODE-33): cloud smokes (2026-10-31)

Leigh, 2026-10-30 23:38 GMT: "I want a meaningful shift APS wise. We have the Ogi code and we have taken
baby steps. Let's be bold", and "I don't want bytes for byte stylistically use it and adapt to our own".
CONCORD takes Ogi's design (docs/bench/ogi-deep-dive.md) as one team brain, written our own way.

## Read

Cloud, 4 cores, parallel 2, 12 rounds, the top 9 teams by our lost points (work/dodge-top9.txt), seeds 6600-6601.

| Opponent | aa (master) | cn, all parts | cn, second cut |
|---|---|---|---|
| OgiTeam | 38.4 | 22.2 | 24.4 |
| CombatTeam | 48.8 | 41.1 | 59.8 |
| FirestarterTeam | 51.5 | 40.5 | 47.1 |
| ShadowTeam | 51.8 | 35.1 | 58.4 |
| AlephTeam | 48.6 | 42.5 | 59.8 |
| NightmareTeam | 49.4 | 50.8 | 37.9 |
| Xmen | 54.6 | 54.9 | 54.1 |
| Polylunar | 59.9 | 65.7 | 56.9 |
| HOFSwarm | 73.0 | 79.5 | 82.0 |
| **All** | **52.9** | **48.0** (-4.8 ± 5.3) | **53.4** (+0.5) |
| Own members hit by our bullets | 835 | 1,156 | 1,030 |
| Skipped turns a battle | 4.4 | 9.9 | 9.0 |

- **All parts** (group radar, the hunt dropped, mate-aware risk, gang watch, FINISH, pooled gun at 1.9):
  lost 4.8 share points, with own hits up 38%.
- **Each part alone against Ogi** (seeds 6500-6501, aa 40.3 and 42.3): radar 35, gun 28 (pooling alone 34),
  movement with the hunt dropped 24, with it kept 30. Our bullets on our own members per battle: radar 41,
  movement without the hunt 42, gun 27, movement with the hunt 25 (aa about 30). The group radar and
  dropping the pack hunt raised own fire, so both are off in the second cut.
- **Second cut** (hunt and shipped radar kept; mate-aware risk, gang watch, FINISH and the pooled gun on):
  level overall, but split by team: Combat, Shadow, Aleph and HOFSwarm up 7 to 11 points, Ogi and Nightmare
  down 11 to 14. Two seeds swing about 15 points a team, so the card pc-team-concord (BENCH-150) reads it
  on the whole field, globally and per team.

Reports: work/concord-top9.md (all parts, paired), work/concord2-top9.md (second cut, candidate only,
same seeds as the first run's aa).

After the review fix that gives each enemy class one tree (one kNN query, not one per copy), cn against
Ogi at seeds 6500-6501 skips 5.5 turns a battle (aa 3 to 8 on these seeds; before the fix 9 to 10) and
scores 32.4 and 34.6 (aa 40.3 and 42.3).
