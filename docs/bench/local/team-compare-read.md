# Team compare read: HadurTeam, Firestarter and Combat against the mid 14

Firestarter and Combat: this PR's runs (laptop, 6 seeds from 4100, 84 battles each, cpu constant
calibrated for that host). HadurTeam: the pc-team-lane A/A logs on the PC (same 14 teams, same seed
base, 12 battles per team), from docs/bench/local/team-losses.md (PR #300). The laptop had no copy of
those logs, so tcread stopped; the numbers below need no new battles. "Last shot" is missing for
HadurTeam because that report predates the column.

| Mid 14 | HadurTeam | Firestarter | Combat |
|---|---|---|---|
| Rounds won | 85.5% | 98.1% | 98.2% |
| Members lost per round | 2.42 | 0.99 | 1.10 |
| Members lost per won round | 1.98 | 0.91 | 1.03 |
| Enemy bullet damage taken per round | 251 | 209 | 204 |
| **Own bullets' damage on own members per round** | **60** | **10** | **17** |
| All bullet damage on us per round | 311 | 219 | 221 |
| Damage dealt per round | 378 | 407 | 394 |
| Their hit rate on us | 14.1% | 13.0% | 13.0% |
| Our hit rate on them | 14.9% | 17.9% | 16.2% |
| Enemy focus (share on the most-hit member) | 33% | 42% | 40% |

Reading:

1. Friendly fire is the largest single difference. Our bullets do 60 damage a round to our own
   members against 10 (Firestarter) and 17 (Combat). That is half of the extra ~90 bullet damage a
   round we take. Engine counts agree: Firestarter's bullets hit its own members 679 times in 84
   battles, Combat's 1,604; ours about 19,000 in a 46x6 run (~70 per battle against 8 and 19).
2. The enemy hits us no more often than it hits them (14.1% against 13.0%). We take more enemy damage
   because rounds last longer and the enemy fires more shots at us, not because we dodge worse.
3. We hit the mid teams less (14.9% against 17.9% / 16.2%), so their fights end later.
4. Enemy focus on our hardest-hit member is lower (33% against 40-42%): the damage we take is spread
   over more members, matching 2.4 deaths a round against 1.0.

The pc-team-lane screen (PR #293) held shots to cut friendly fire: WEAVE-10 cut our own hits by a
quarter but held 37,000 more shots and scored -0.4. Neither Firestarter nor Combat holds many shots
(in-lane shots 2.5% and 2.3%). They keep teammates out of each other's lines. The next team step is a
team-only movement term that keeps a member off its mates' firing lines, not a fire hold.
