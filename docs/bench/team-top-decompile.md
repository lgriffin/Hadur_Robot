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

## 4. Team modes built (all team-only, requirements TMODE-1 to TMODE-4)

Each mode can be read from a per-team table (`melee.TeamModes`). With no living teammate,
none of it is reached. Solo and melee replay fixtures stay bit-identical with every mode forced
on: all 11 replay, and only the two team fixtures change.

| Mode | Source idea | What it does in Hadur | Ablation |
|---|---|---|---|
| **SOFT** (TMODE-2) | Ogi aimedAtUs, Firestarter target weight | Each detected shot's virtual bullets weigh 1/(1+k)², where k is the number of living teammates nearer the shooter. Under 0.1 the shot makes no bullets. This replaces the hard MMOVE-9 drop | `tmsoft` (ms) |
| **GANG** (TMODE-3) | Ogi gang defence | With 2 or more enemies within 250 px, the risk is scaled by e^(0.5 (to - from) / 100) toward the nearest teammate. If instead a teammate is ganged, the same pull applies toward it, floored at 300 px | `tmgang` (mg) |
| **FINISH** (TMODE-4) | Ogi finish pull, Combat's pull to disabled enemies | Last enemy alive and own energy >= 30: e^((to - from) / 100) toward it, floored at 350 px | `tmfin` (mf) |
| **LEARN** | Firestarter, Combat | MMOVE-10's learned aims, for the teams the table names | `tmlearn` (ml); screened already as team-s2 `dl` |

Not built:
- **Path danger** (Ogi withWaves, Firestarter). Scoring the route to each candidate was tried
  in melee M4 and cost 3 to 5 APS (docs/bench/m4-gates.md). Ogi makes it work with learned aims
  and soft weights, so it stays a later candidate once SOFT and LEARN have per-team results.
- **Pack hunting** (Nightmare's leader-assigned pincers). It needs a leader role and waypoint
  orders on the link, so it is stage 2 for the teams the table cannot fix.

**Already in hand from team-s2.** The LEARN screen exists: dl against aa, 6 seeds. Overall it
was +0.5 ± 0.8 (noise), but per team it gave **Ogi +4.9 ± 2.6** and **Nightmare -7.2 ± 4.3**.
That is exactly the per-team split the table is for. At 6 seeds a team's interval is ±3 to ±12
points, so the screen only catches large effects, and the confirm uses 12 fresh seeds.

## 5. Plan and PC card

Card `hadur-bench/plans/pc-team-modes.queue` (about 2,800 to 3,100 battles, 3 h at
--parallel 12, resumable):

1. **Screens:** bb (A/A), ms, mg and mf. Each runs against all 46 teams, 6 seeds, seed base
   2600, paired with aa. LEARN is read from team-s2's dl report.
2. **pick** (`tools/team_modes.py pick`): for each team, the mode whose paired gain has its 95%
   low end above zero, with ties going to the larger mean. Entries are keyed by the member
   classes in the team's jar. A class two teams share with different picks is left out. The
   step then builds the screen's table (`tmtab`, mt).
3. **confirm:** mt against aa on the picked teams only, 12 fresh seeds (base 2700).
4. **lock** (`team_modes.py lock`): keep a pick only where confirm gained at least +1.0 point.
   Then build `tmlock` (mk).
5. **census:** mk against aa, all 46 teams, 6 fresh seeds (base 2800). Gate: at least +3.0
   points with the interval above +1.5, and bb inside ±1.0.
6. Results PR from the PC (claude/pc-team-modes-results).

No PC run starts until pc-table-v1 is done and Leigh says go.

## 6. Results: pc-team-modes (2026-10-24, PR #246)

**Verdict: the gate FAILED. Every team mode stays off in 3.16.** The census of the locked table
(mk) against aa came out at **+0.2 ± 0.8** points over all 46 teams, against a bar of +3.0 with
the low end above +1.5. The A/A (bb) was clean at -0.3 ± 0.8. There were no failed battles.

| Screen (forced on vs every team) | Paired gain over aa |
|---|---|
| SOFT (ms) | -0.3 ± 0.8 |
| GANG (mg) | -0.8 ± 0.8 |
| FINISH (mf) | +0.4 ± 0.7 |
| PACK (mp) | **-15.2 ± 1.3** |
| SCREEN (mx) | +0.4 ± 0.7 |
| POOL (mo) | +0.6 ± 0.8 |

- **Pick, confirm and lock.** Pick chose a mode for 13 teams. Confirm kept 5 of them:
  - GlowingHawks: SCREEN
  - TroodonPack: LEARN
  - DiamondStealers: POOL
  - DrunkenTeam: SCREEN
  - FourProphets: POOL

  Only one held on the census's fresh seeds: **FourProphets with POOL, +4.1 ± 1.7**. TroodonPack
  gave +7.5 ± 7.0 and the other three were noise. Five teams out of 46 cannot move the mean by
  +3: even a real +4 on one team is +0.1 overall.
- **What it says.** The six team movement modes are each worth less than one point across the
  field. The team gap (members dying against the top 20) is not a movement-mode problem. Per-team
  tailoring only pays where a single mode is worth a lot against that team, and the screens found
  no such team apart from PACK's losses.
- **PACK is a design flaw, not a code bug.** The prey choice, the ranking and the slot geometry
  are all as designed. Two things combine to cause the loss:
  1. The pincer radius is 0.74 × the nearest member's *current* distance, recomputed every
     tick. Each step in shrinks it until it reaches the 150 px floor, so Hadur parks at
     point-blank range inside the prey's team.
  2. The pull has strength 1.0 and multiplies the *whole* risk, bullet risk included. A spot
     200 px closer is scaled by e^-2 ≈ 0.14, which all but switches the dodging off.

  NightmareTeam can play like this because its members carry 120 energy and fight close; Hadur's
  gun and surfing are built for range. If PACK is ever retried, it needs these changes:
  - a fixed radius of 300 px or more, set when the prey is chosen;
  - strength around 0.3;
  - the pull leaves the bullet term unscaled.
- **POOL costs CPU.** The mo screen skipped 143.7 turns a battle (aa: 7.8), and the table builds
  that carry POOL skipped more too (confirm 59.7, census 13.4). A pooled log fills five times as
  fast, up to its 1,000-sample cap, and each detected shot runs the kNN over it. On slower
  rumble clients that would cost more. Before POOL ships anywhere, cap the pooled log lower (for
  example 300) or limit the kNN.
