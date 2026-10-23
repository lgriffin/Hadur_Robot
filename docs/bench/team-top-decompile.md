# How the top teams play together, and a per-team mode table for HadurTeam (2026-10-23)

Leigh's ask (2026-10-23 22:52 local): decompile the top teams, work out their teamwork and core
team movement, bring the best of it into HadurTeam, and pick a mode per opposing team as the
1v1 mode table does. This is the read. Section 5 is the plan.

Jars read with CFR 0.152 (none ships source): cz.libors.OgiTeam v1 (5x cz.libors.Ogi),
cb.fire.FirestarterTeam (5x cb.fire.Firestarter 2.0), abc.ShadowTeam 3.83 (5x abc.Shadow),
ustimaw.NightmareTeam 3.3 (4x Nightmare + NigitmareDroid) and mn.CombatTeam 3.25.0 (read in
full on 2026-10-15, docs/bench/combatteam-3.25.md). These are the five teams that beat Hadur
3.15 hardest on the PC census: Ogi 16.8% share for Hadur, Nightmare 29.4, Shadow 32.4,
Firestarter 37.3, Combat 39.4.

Nothing below is copied code. Each idea is described so we can write our own version.

## 1. The five teams in one line each

| Team | Teamwork | Core team movement |
|---|---|---|
| **OgiTeam** | Per-tick packet with each member's next position and radar heading, events, shots, sightings. Radar coverage split across members. Holds fire when a teammate is within atan2(30, d) of the line. | Minimum risk over 40 random points 80-220 px away, then the 8 best re-scored with **bullet danger simulated along the path** to each point. **Soft aimed-at weight** 1/(1+k)^2, where k is the number of teammates nearer the shooter. **Gang defence**: when 2 or more enemies are within 250 px of a member, it is pulled to its nearest teammate. A member that is not ganged is pulled toward a ganged teammate, to 300 px. **Finish pull**: last enemy alive and own energy >= 30, close in to 350 px. |
| **FirestarterTeam** | Broadcasts every scan, its own bullet fired, bullet hit, hit by bullet and bullet-hit-bullet. All members feed one picture. | Each enemy is treated as firing a wave every tick, made real when its energy drops. Each wave holds one aim model **per teammate**, weighted 1/d² by distance. Each model is a 123-bin guess-factor histogram learned from hits on **any** member. Shadows from own and teammates' bullets. Movement: anti-gravity gives a few candidates, and the final pick is the **lowest wave danger along the simulated path** (waves within 15 ticks). Teammates' bullets in the air count as danger. |
| **ShadowTeam** | Messages feed the gun only. | Classic minimum risk on 50 points at a random radius. One team twist: an enemy counts as "targeting me" when I am within 100 px of its nearest teammate distance, and such an enemy's risk doubles. Positions where it was threatened are remembered and avoided. Teammates repel 200/d² within 500 px. No waves in melee. Its edge is the gun, not the movement. |
| **NightmareTeam** | **Leader commands.** Every few ticks the leader assigns each member to an enemy. The cost is (distance + 1.2 × enemy energy)², times 1.6 when an enemy gets 1 or more than 3 members. So 2-3 members go to each target. The leader then sends each member a waypoint on an arc round its target at 0.74 × the nearest member's distance: a pincer. A droid carries the 120-energy body. | Members move to their waypoint. Without an order they use minimum risk, attracted to a rally point and repelled by teammates. **Pack hunting:** they gang up on one enemy at a time. |
| **CombatTeam** | Shares every gun sample and every enemy-gun sample, so one log per enemy is fed by all five (k=21, 4,000 per enemy). | Wave-aware anti-gravity driven by the shared enemy-gun model. Every enemy shot is taken as aimed at the member **nearest** the shooter. Disabled enemies attract. Teammates' bullets repel. |

## 2. What they share, and what Hadur does today

| | Top teams | HadurTeam 3.15 (+ T6 code, switches off) |
|---|---|---|
| Whose bullet is it | Soft: Ogi uses 1/(1+k)^2, Firestarter uses 1/d² over teammates, Combat assigns it to the nearest member, Shadow uses its "targeting me" test | Every detected shot is aimed at me. MMOVE-9 hard nearest rule built, **-0.7 ± 0.8** on the census |
| Where bullets go | Learned per shooter, shared by the team (Firestarter histogram, Combat kNN, Ogi model) | Head-on and linear guesses. MMOVE-10 learned kNN built, **+0.5 ± 0.8** (noise) |
| When bullet danger is scored | **Along the path** to each candidate (Ogi, Firestarter) | At the destination only (bulletRisk) |
| Ganging | Ogi regroups and helps, Nightmare attacks in pairs and threes | Teammates only repel (MMOVE-6/7). Nothing pulls a member toward a mate who is under pressure |
| Finishing | Ogi closes on the last enemy, Combat is drawn to disabled enemies | Endgame ring 80-200 px (solo melee rule) |
| Fire coordination | Nightmare assigns targets centrally; Ogi holds fire through teammates | Fire lane (T1), shared sightings (MGUN-8) |

The 2026-10-11 analysis found Hadur's members die in rounds where **2 or more enemies are
near them** (62% of member-rounds against the seven teams Hadur struggles with). Ogi's gang
defence and Nightmare's pack hunting answer exactly that, from the defensive and the attacking
side. The hard nearest rule and the learned aims failed because each was a single switch on
top of destination-only risk. Ogi and Firestarter get their gain from combining soft weights
with danger measured along the path.

## 3. Why one mode will not fit 46 teams

Different teams punish different things:
- Ogi and Firestarter surf well and shoot accurately, so path danger matters most against them.
- Nightmare gangs up, so gang defence (regroup) matters most.
- Rammer and bully teams need the opposite: spread out and finish.

So the mode table approach from 1v1 applies: a few team movement modes, and one mode picked
per opposing team, locked only after a screen and a fresh-seed confirm.

## 4. Team modes to build (all team-only)

Each mode is a switch that can be read from a per-team table. With no teammate alive, none of
it is reached. Solo and melee replay fixtures must stay bit-identical with every mode forced on.

| Mode | Source idea | What it does in Hadur | Size |
|---|---|---|---|
| **TM-SOFT** | Ogi aimedAtUs, Firestarter target weight | Each virtual bullet's weight × 1/(1+k)^2, where k is the number of living teammates nearer the shooter at fire time (replaces the hard MMOVE-9 drop) | small |
| **TM-GANG** | Ogi gang defence and finish pull | When 2 or more enemies are within 250 px of me, multiply the candidate's risk by a pull toward my nearest teammate. Otherwise, if a teammate is ganged, pull toward it, with a 300 px floor. Last enemy alive and energy >= 30: pull toward it, with a 350 px floor | medium |
| **TM-PATH** | Ogi withWaves, Firestarter path danger | Score bullet risk along the predicted path to each candidate, not only at the end. Re-rank the 8 best by risk/median + 3 × danger/median | medium |
| **TM-LEARN** | Firestarter, Combat | The existing MMOVE-10 learned aims, now a mode in the table instead of a global switch | built |
| **TM-PACK** (later) | Nightmare leader | Leader assigns 2-3 members per enemy and sends arc waypoints | large, stage 2 |

## 5. Plan

1. **Build TM-SOFT, TM-GANG and TM-PATH** behind a per-team table (`TeamModeTable`). The key is
   the opposing team's member class, and the default is today's movement. Each mode gets an
   ablation build that forces it on for every team. Unit tests, EARS rows and the
   team-only proof come with each mode.
2. **One PC screen per mode across all 46 teams** (6 seeds, paired against 3.15aa, about 276
   battles and 20-25 min per mode). Each run gives every team's score under that mode, so 4
   runs plus an A/A fill the whole table.
3. **Build the table.** For each team, take the best mode whose gain is more than 2 standard
   errors on the screen. Confirm those teams on fresh seeds; lock only the confirmed ones
   (the 1v1 lesson: tonight's 2-seed +6.7 became -8.9).
4. **Census the table build** against 3.15 on all 46 teams with an A/A. Gate: +3 APS with a
   low end above +1.5.
5. Stage 2 if needed: TM-PACK for the teams the table cannot fix.

No PC run starts until pc-table-v1 is done and Leigh says go.
