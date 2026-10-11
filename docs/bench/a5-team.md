# A5 gate: the team baseline

The team jar `hadur2.HadurTeam 3.6` is five `hadur2.Hadur`. It fought each team in
`team-reference.txt` with `team-gates.txt`: 3 seeds of 10 rounds on 1200 x 1200, TeamRumble
style. The build was the one on this PR after its review fixes, run in the Claude Code
container (4 cores, Java 21). The members' transcripts went one per member.

**Verdict: the gate passes, and this is the team baseline on record.** Each gate item:

| Gate (A5) | Result |
|---|---|
| No shot ordered with a teammate's last known position in the fire lane (WEAVE-4) | Held by construction and tested (`TeamLinkTest`). 5001 shots were held for the lane over 240 rounds |
| Share of shots with a teammate truly in the lane, reported | 66 of 33133 shots (0.2%). These are teammates who moved into the lane after their last known position |
| No `.hp` or `.hm` file written in a team battle (SHELF-2) | 0 stray shelf files |
| Only the leader's store takes a write or a delete | The only Hadur file written was `hadur2/Hadur.data/health.hc`, the leader's health record |
| The count of enemies never below the truth (WORLD-8) | 0 of 2666 count changes went below the truth |
| No faults | 0 |
| Every message decodes (LINK-2) | 0 rejected; 1,466,025 reports merged |
| Skipped turns, teammate collisions and blocked shots counted | 21 skipped turns; 105,566 teammate collisions; 884 of our bullets hit a teammate, and 2610 hit a teammate's bullet |

The other teams' own data files (`abc/Shadow.data`, `lxx/ConceptA.data`) are theirs.

## The baseline

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| sampleteam.MyFirstTeam | 3 | 75.5% | 29/30 | 96.7% | 0 | 2 | 0 | 8/5821 | 0/643 | 0 |
| abc.ShadowTeam 3.83 | 3 | 7.4% | 1/30 | 3.3% | 0 | 1 | 0 | 12/3716 | 0/177 | 0 |
| rz.AlephTeam 0.34 | 3 | 8.9% | 0/30 | 0.0% | 0 | 4 | 0 | 6/3374 | 0/192 | 0 |
| mn.CombatTeam 3.25.0 | 3 | 9.4% | 0/30 | 0.0% | 0 | 0 | 0 | 5/3736 | 0/187 | 0 |
| lxx.ConceptATeam 0.8 | 3 | 74.4% | 29/30 | 96.7% | 0 | 3 | 0 | 8/4641 | 0/727 | 0 |
| cb.mega.FirestarterTeam 1.14 | 3 | 11.3% | 0/30 | 0.0% | 0 | 1 | 0 | 12/3778 | 0/205 | 0 |
| davidalves.PhoenixTeam 0.54 | 3 | 19.9% | 1/30 | 3.3% | 0 | 6 | 0 | 4/4159 | 0/274 | 0 |
| apvteam.MambaTeam 0.7.5 | 3 | 18.2% | 1/30 | 3.3% | 0 | 4 | 0 | 11/3908 | 0/261 | 0 |
| **All** | 24 | 28.1% | 61/240 | 25.4% | 0 | 21 | 0 | 66/33133 | 0/2666 | 0 |

The baseline beats the sample team and ConceptA and loses heavily to every real team. That
is what A5 set out to build: five Hadurs that no longer shoot or count each other. It is
not yet a team strategy. Each member still fights its own melee: there is no shared
target, and members drive through each other (about 440 teammate collisions a round). The team plan that follows A5 starts from these
numbers.
