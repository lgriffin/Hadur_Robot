# Plan: HadurTeam to top 5 in the TeamRumble

Date: 2026-10-23. Asked by Leigh after 3.15's first team pass: "Our team results are in and we
didn't improve by a serious amount. Why? Come up with a plan to get me top 5."

Sources: the live TeamRumble pages fetched at 10:05 UTC for HadurTeam 3.15, HadurTeam 3.13
(retired, its final state) and the eight teams above Hadur, archived in
`data/rumble/pages/2026-10-23T1005Z_teamrumble_botdetails_*.html` and parsed to
`data/rumble/parsed/2026-10-23T1005Z_*.csv`; the rankings of 09:34 UTC
(`2026-10-23T0934Z_teamrumble_rankings.tsv`); every team bench report since 2026-10-11
(`docs/bench/team-lower-half.md`, `docs/bench/combatteam-3.25.md`,
`docs/bench/local/2026-10-1*_team-*.md`). Team changes follow Leigh's isolation rule of
2026-10-11: team-only code paths, 1v1 and melee bit-identical.

## Summary

- **3.15 is level with 3.13 because nothing that was measured to work was in it.** The only team
  change in 3.15 is MGUN-8 (teammates' sightings feed the gun), whose cloud screen read
  +1.5 ± 1.8 alone and −0.5 ± 1.7 on top of a deeper gun. The change that did pass on the PC,
  team gun depth 21 (T3, +2.6 ± 0.9 on 2026-10-17), was never shipped. Live, 3.15 against 3.13
  is −0.05 ± 1.1 points a pairing over the same 45 teams.
- **The 68.33 flatters 3.15.** Its page is missing the ShadowTeam pairing (3.13 took 31 there).
  With it, 3.15 is about 67.5, the same as 3.13's final 67.57. OgiTeam's entry at 1st on
  2026-10-23 costs every team below it about 1 APS (Hadur takes 21 there), which is why both
  read lower than 3.13's 68.30 first pass.
- **5th is NightmareTeam at 77.37: about +9.9 APS from where Hadur really stands.** Nearly all
  of it is the top 20. Against NightmareTeam's own scores, the gap is 4.4 APS against the top
  8, 3.8 against ranks 9-20 and 1.6 against three ramming teams; ranks 21-47 are level or
  better. In every one of those segments the cause is the same: Hadur's members die.
  Survival is 15-29 points lower.
- **What we have measured adds about +3.6.** T3 (+2.6 on the PC) and a new switch built today,
  shoot rammers (TR1: +15.7 points a pairing on the three ramming teams in a cloud screen, about
  +1.0 APS), are cheap and team-only. That is about 71, 7th, passing Polylunar and Xmen.
- **Top 5 needs learned movement on a team (T6).** Members dodge with head-on and linear virtual
  bullets only; the top teams aim with learning guns, which is why survival collapses from rank
  20 up. CombatTeam shares every hit on every member into one learned danger model. This is the
  only lever large enough, and it is a real build (two to three days), not a switch.
- **Central estimate for the whole plan: about +8 APS, top 5 needs +9.9.** Top 5 is reachable
  only if T6 lands at the top of its range, or if the shared-learning pieces (T5b, T6) stack
  better than the screens so far suggest. Section 6 says what ends each line.

## 1. 3.15 against 3.13, like for like

| | 3.15 (first pass) | 3.13 (final, retired) | 3.13 (first pass, 2026-10-15) |
|---|---|---|---|
| APS on the page | 68.33 | 67.57 | 68.30 |
| Pairings | 45 of 46 (no ShadowTeam) | 46 | 45 (no OgiTeam yet) |
| Battles | 113 | 198 | |
| APS with all 46 pairings | about 67.5 (ShadowTeam at 3.13's 31.3) | 67.57 | |
| Same 44 opponents as 3.13's first pass | 69.41 | | 69.18 |

- Paired over the 45 common opponents, 3.15 minus 3.13 final is **−0.05 points, ±1.1** (95%,
  per-pairing sd 3.6). 19 pairings fell, 24 rose, 2 stayed at 100. The largest moves are 1-2 battle pairings
  (Xmen −8.9 at 2 battles, Firestarter −8.7 at 1, RadnorMedSchool +7.3 at 3, Nightmare +5.6 at 3)
  and sit inside one pairing's noise (a 1-battle team pairing carries ±7.8).
- Survival is level (74.4 against 74.1).
- **Rank**: 9th on both pages. When ShadowTeam's pairing arrives 3.15 should drop to about 67.5,
  within 0.2 of GlowingHawks (67.36, 10th).

So 3.15 did not regress and did not improve. That is what its one team change predicted:
MGUN-8 was built as a capability (the cloud screen said "does not earn its place on this
evidence", `docs/bench/local/2026-10-16_team-t5-screen.md`), and the measured gain was left out.
The gap between the PC verdict on T3 (2026-10-17) and the 3.15 release (2026-10-23) is a process
miss: the 1v1 top-5 work took the PC and the release, and nobody carried T3 to master.

## 2. The bench and the live ladder agree on levels

The PC census of 3.14 on all 45 teams (6 seeds, `2026-10-17_team-census-k21.md`) scored 68.6%;
3.13/3.15 live sit at 68.3 before Ogi. 3.11's census read 63.2% against 64.61 live. Team APS is the
mean score share over pairings, which is what the census measures, so **a bench point is close to
a live APS point** on this ladder (MGUN-6: bench +5.7, live 3.11 to 3.13 +3.7 with other changes
in between). Plan figures below use bench points as APS.

Live noise is large: 113 battles over 46 pairings, about 2.5 a pairing, and a 10-round team
battle is one sample. A change smaller than about 1.5 APS cannot be read from one pass.

## 3. Where the 9.9 APS to 5th are

Hadur's per-opponent score pools 3.15 and 3.13 final by battles (both are the same team on this
evidence). Each rival's lead over Hadur, summed by segment and divided by 45 (APS units; the
head-to-head pairing is left out):

| Rival | Total | A: top 8 | B: ranks 9-20 | C: ramming trio | D: ranks 21-33 other | E: ranks 34-47 |
|---|---|---|---|---|---|---|
| 2nd CombatTeam | +14.0 | +3.55 | +4.66 | +2.25 | +2.43 | +1.10 |
| 4th ShadowTeam | +10.8 | +1.95 | +4.24 | +1.82 | +1.82 | +1.00 |
| **5th NightmareTeam** | **+8.8** | **+4.44** | **+3.79** | **+1.59** | +0.16 | −1.20 |
| 6th AlephTeam | +8.9 | +1.70 | +2.54 | +2.11 | +1.78 | +0.81 |
| 7th Xmen | +3.3 | +1.25 | +0.97 | +1.35 | +0.26 | −0.51 |

Per pairing, NightmareTeam takes 29 points more than Hadur against the top 8, 15 more against
ranks 9-20 and 24 more against the ramming trio, with survival higher by 29, 15 and 22. Add the
head-to-head (Hadur about 20 against Nightmare's 77, about 1.3 APS) and the total is the 9.9.

**A and B: the top 20 kill Hadur's members.** Against the top 7 Hadur survives 0-20% of rounds
(3.13's final page: Ogi 0, Polylunar 7, Nightmare 8, CombatTeam 8, Firestarter 16, Shadow 20,
Aleph 20). These teams aim with
learning guns. HadurTeam's members dodge using only head-on and linear virtual bullets (MMOVE-3),
treat every detected shot as aimed at themselves, and learn nothing from the hits on their
teammates. Firepower was the lower half's gap in October (MGUN-6 fixed most of it); against the
top 20 the gap is defence.

**C: three teams that ram.** amz.TeamDeathTeam 1, jab.Enjambre 3, mn.nano.perceptual.ImpactTeam 1.3.0.
Hadur takes 39, 53 and 55 there; NightmareTeam, Aleph, Shadow and Xmen average 73, 77 and 75.
Their non-bullet score against Hadur (ram damage and kill bonuses) was 1,700-2,400 a battle
against 340-1,040 for HOFSwarm in October's cloud run. The field gun **skips any enemy closing on
the member inside 100 px** (`FieldGun.rams`, a melee rule: move rather than trade at point blank)
unless it can finish it, so a member being rammed does not shoot the robot ramming it. T3's deeper
gun did nothing here (TeamDeath −0.9, Enjambre +2.4, Impact +2.9), as expected if the gun is not
firing. CombatTeam does the opposite: inside 150 px it shoots only the close enemies, at power 3.

**D and E: level with NightmareTeam.** The lower half was the gap in October; MGUN-6 closed it.
Aleph and Shadow still lead there by 1.8 APS each, so there is more to take, but not first.

## 4. Shoot rammers (TR1): cloud screen, 2026-10-23

`build-ablation.sh tram` (team only, suffix `rm`): `FieldGun.solutions` keeps the rammer skip only
off a team. Against the ramming trio (`hadur-bench/team-rammers3.txt`), 4 seeds, 10 rounds,
1200x1200, engine 1.11.1, two battles at once on a 4-core cloud container, paired with 3.15aa
(the same master rebuilt with no change):

| Ramming team | 3.15rm | 3.15aa | Paired (pp) |
|---|---|---|---|
| amz.TeamDeathTeam 1 | 59.9% | 40.0% | **+19.9 ± 13.9** |
| jab.Enjambre 3 | 75.2% | 57.8% | **+17.4 ± 6.2** |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 63.3% | 53.5% | **+9.8 ± 6.3** |
| Rounds won (pooled) | 95.8% | 70.0% | +25.8 ± 10.7 |

Report: `docs/bench/local/2026-10-23_team-tram-screen.md`. All three teams clear of zero; skipped
turns 1.8 a battle against 3.0. The mean, +15.7 points a pairing over three pairings, is **+1.0
APS** spread over the 46-team field, about two thirds of what the rivals take from these three.
This is a screen on the teams it was built for: the PC gate (section 6) checks the other 43 teams,
where an enemy that comes inside 100 px is rarer but now also gets shot.

## 5. The plan

Expected values are bench points (≈ live APS, section 2). "Range" is the plausible span from what
each step's evidence says, not a confidence interval. Every step is team-only (reached only while
a member has a living teammate); every gate is the whole team field, 46 teams, 6 seeds, paired.

| Stage | What | Evidence so far | Expected | Range | Cost |
|---|---|---|---|---|---|
| **S1 T3** | team gun depth 3 → 21 (`tk21`) | PC +2.6 ± 0.9 on 3.14, 2 hosts screened +3.5 to +4.3 (k12) | +2.6 | +1.7 to +3.5 | one constant |
| **S1 TR1** | shoot rammers on a team (`tram`) | cloud screen +15.7 pts on the 3 ramming teams (section 4) | +1.0 | +0.6 to +1.4 | one condition |
| **Release 3.16 team** | S1 gate passes | | **≈ 71.1** | 7th | release.yml |
| **S2 T6** | learned team danger: every member logs each enemy bullet that hits or passes it (situation, angle) and broadcasts it; one shared kNN per enemy gun replaces head-on/linear virtual bullets in the team's risk; a detected shot is treated as aimed at the member nearest the shooter (CombatTeam's rule) | top 20 survival gap 15-29 points; CombatTeam's design (combatteam-3.25.md 2.2, 2.3) | +3.0 | +1.5 to +4.5 | 2-3 days build, new link codec field |
| **S3 T5b** | shared gun *samples*: resolved gun waves (situation, guess factor) broadcast and added to every member's kNN, with catch-up after a death | MGUN-8 (sightings) added nothing over k12; samples are the labels, sightings were only context | +1.0 | 0 to +2.0 | link codec v2 |
| **S4 T7** | small team rules: attract to a disabled enemy; teammates' bullets in flight as a risk term, then retest firing through teammates (`tlane0` read +0.5 ± 3.4 without it) | CombatTeam does both | +0.5 | 0 to +1.0 | small |
| **Total** | | | **+8.1** | **+3.8 to +12.4** | |

Top 5 needs +9.9 from 67.5, and the field will not stand still. The central estimate lands at
about 75.6, 6th today. **Top 5 needs S2 at the top of its range or S3 stacking with it.** Two
cheap reads before S2's build can sharpen this, both from logs the S1 run keeps:

1. **Who kills members against the top 20, and with what aim.** `team_aim.py` already tags each
   enemy bullet that hits a member (head-on, linear, other). If learning guns (other) are most
   of the hits from the top 8, S2 is the lever; if head-on and linear are, Hadur's existing
   virtual bullets are failing and S2 is the wrong build.
2. **Leader deaths.** The leader (200 energy) dying costs every living teammate 30 energy. If
   the leader dies early against the top 20 more often than other members, a team-only "leader
   stays back" rule is cheap and whole-field.

### 5.1 Requirements when S1 ships

| ID | Type | Requirement | Stage |
|---|---|---|---|
| MGUN-9 | State | While in melee on a team with a living teammate, the field gun shall take 21 situations per opponent from its kNN in place of MGUN-1's three. | T3 |
| MGUN-10 | State | While in melee on a team with a living teammate, the field gun shall keep an opponent closing on Hadur within 100 px among its targets, in place of the melee rule that skips it. | TR1 |

## 6. PC cards and stop rules

**Card team-s1 (about 3 h, needs Leigh's go).** `hadur-bench/plans/pc-team-s1.queue`, run from
master after this PR merges, RoboRumble workers at 0:
`./queue.sh run pc-team-s1` (or `.\queue.ps1 run pc-team-s1`).
Four steps, each 552 battles paired with the 3.15 release jar on the 46-team field
(`team-census46.txt` = the 45 of October plus OgiTeam), 6 seeds, `--parallel 8`, resumable:
`aa` (A/A), `k21`, `rm`, `k21rm`. The last step commits the four reports to
`claude/pc-team-s1-results` and opens the PR.

- Ship rule: `k21rm` mean paired difference at least +1.0, interval above zero, no team worse
  beyond its 6-seed spread, A/A inside ±1.0, and `k21rm` not below `k21`. Then 3.16 is 3.15 with
  MGUN-9 (and MGUN-10 if `rm` holds), team-only, 1v1 and melee fixtures unchanged.
- If `rm` alone is level, ship `k21` only.

**Card team-s2 (later, about 3 h).** S2's gate, written when the build is ready: `t6` and `t6`
on top of S1, same protocol. Ship rule as above.

**Stop rules.**
- After S1 ships and settles (about 4 battles a pairing, a week of live play): if live gains less
  than half the bench figure, stop and find out why before S2.
- After S2's gate: if S1 + S2 together are below +5.5 bench points, top 5 is out of reach with
  this team design. The remaining option is the larger one: a team movement built on CombatTeam's
  anti-gravity with learned danger in full, which is a new team strand, not a switch.
- No PC run is stopped or restarted on a guess; every step resumes.

## 7. What changed in the repo with this plan

- `hadur-bench/build-ablation.sh`: `tram` (TR1), team only, suffix `rm`.
- `hadur-bench/team-rammers3.txt`, `hadur-bench/team-census46.txt`, `hadur-bench/plans/pc-team-s1.queue`
  and its four `team-s1-*.args`.
- The live team pages (see Sources), the TR1 screen report `docs/bench/local/2026-10-23_team-tram-screen.md` and this plan. No robot code.

## 8. After 3.16: 7th live, and the plan adjusted (2026-10-24)

**Where 3.16 stands.** HadurTeam 3.16 is 7th at **72.13 ± 0.80** after 114 battles (about 2.5 a
pairing, so it will move). That is the team's best ever: 3.15 settled near 67.5. The bench
predicted +3.4 for stage 1 (k21 and shooting rammers), and live shows about +4.6, so the first stop
rule holds: the bench does not overstate live. To reach 5th, Hadur needs +5.1 over NightmareTeam
(77.19); to reach 6th, +4.8 over AlephTeam (76.90).

**Where the gap is.** These are the live pages of Hadur, Aleph and Nightmare over the 44 teams
all three have met, split by the opponent's rank. APS points are each segment's share of the
46-team mean.

| Opponents | Hadur | Aleph (6th) | Nightmare (5th) | Survival H / A / N |
|---|---|---|---|---|
| ranks 1-6 | 4.55 | 5.45 (+0.9) | 7.79 (+3.2) | 21 / 32 / 45 |
| ranks 7-20 | 21.02 | 22.42 (+1.4) | 23.42 (+2.4) | 80 / 93 / 82 |
| ranks 21-46 | 45.11 | 46.89 (+1.8) | 43.06 (-2.0) | 98 / 99 / 89 |

- **Aleph beats Hadur by a little everywhere**, and most of all against the lower half. Its
  biggest margins are TeamDeath +20, DiamondStealers +17, Mamba +11, Enjambre +9 and Drunken +9:
  rammers and the ranks 21-33 group again. Survival there is level (98 against 99), so Aleph's
  edge is points per pairing (damage and kill bonuses, faster kills), not who survives.
- **Nightmare's lead is survival against the top 20.** Its members live 45% of top-6 rounds
  against Hadur's 21%. Its biggest margins are Shadow +41, Polylunar +37, ArmyOfShiz +26 and
  Combat +24. It gives back 2 points against the lower half.
- **What failed.** Per-team mode tables (pc-team-modes, +0.2 ± 0.8), learned team dodging (S2)
  and PACK all changed the risk sum of the same minimum-risk movement. None of them moved
  survival against the top 20.

**The plan from here.**

| Step | What | Why | Expected | Cost |
|---|---|---|---|---|
| A | S4 screens (DISABLED, MATEFIRE, REAR) on the combined PC card | built and queued | 0 to +0.5 | 3 PC hours, already on the card |
| B | **Lower-half margin read**: bench Aleph itself as the subject against ranks 21-46, with Hadur alongside, and compare the score parts (bullet damage, kill bonus, survival) team by team | Aleph's +1.8 there is the cheapest gap; measure before building | read only | cloud, small teams run fast |
| C | Fix what B finds: likely kill speed against rammers and weak teams (team fire power and target choice at close range) | the k21 and full-power steps (+2.4, +5.7) show gun-side changes carry live | +1.0 to +1.8 | small build, one PC gate |
| D | **New team movement: Ogi's waves** (docs/bench/ogi-deep-dive.md port 3): a danger profile per enemy shot weighted by whom it was aimed at, driving to the safest of 8 points over 30 ticks | the stop rule's "new strand": survival against the top 20 is where Nightmare's +5.6 is, and only a different movement can change it | +2 to +4 | 2 to 3 days in the cloud, team-only, one PC gate |
| E | Shared radar arcs (Ogi port 5) | fresher scans for the k21 gun on every member | +0.5 to +1.5 | small |

Central estimate: B+C +1.4, D +3, E +0.8, so about +5 on 72, which is level with 5th. **D is
the step that decides 5th**, so it starts in the cloud now, while the PC runs the combined card.
Everything stays team-only, with the same isolation proof as before (switches forced on, duel and
melee replays bit-identical).

**Stop rule.** If D's PC gate is below +1.5, 5th place needs Nightmare's structure (a leader
giving orders, 120-energy droids), which is a new team, not a movement. Report that before
building anything more.

**Step B result (cloud, 2026-10-24).** AlephTeam and HadurTeam 3.16 were each benched as the
subject against the 25 lower teams of hadur-bench/team-lower25.txt (ranks 21-46 without the
engine's sampleteam.MyFirstTeam; seeds 3000-3001, 10 rounds), then Hadur again on the five worst
of them, with every enemy bullet that hit a member classified by aim (head-on, linear, other)
from the bench's bullets.log. The tlane0 smoke used seeds 3100-3101.

- Aleph's lower-half edge is four teams: TeamDeath +20, GrofGroup +17.5, DiamondStealers +12.5 and
  ImpactTeam +12 share points. The other 21 are within ±2.
- It is not dodging. The enemy's hit rate on our members matches its rate on Aleph's (TeamDeath
  36% and 38%, Grof 16% and 13%, Impact 34% and 35%), and our hit rate matches Aleph's.
- It is tempo. Aleph fires 14.8 shots a round per 50 ticks, near five members' cap; Hadur fires
  9.6. Our rounds run 35-40% longer, so the enemy fires about 40% more bullets at us.
- The cause is the fire lane (WEAVE-4, WEAVE-7): 7,069 shots held for a teammate in 10 battles,
  about a third of our fire. Aleph fires through its teammates (about 50 hits on its own members
  a battle) and still wins.
- Cloud smoke of `tlane0` (no lane, team only) against the 3.16 aa build on those five teams,
  2 seeds: **+10.8 ± 4.8** share points, TeamDeath +15.9 ± 2.2.

A second smoke on the top 6 (Combat, Shadow, Aleph, Nightmare, Xmen, Polylunar), seeds 3200-3201:
`tlane0` **+8.8 ± 7.0**. Then Ogi's own rule (`tlaneo`, docs/bench/ogi-deep-dive.md 4.6: hold only
for a teammate nearer than the target and within atan2(30, d) of the gun line) against `tlane0`
on those 11 teams, seeds 3400-3401: **+3.9 ± 3.1** for `tlaneo`, with 3,125 shots held against
7,400 for the 3.16 lane.

So step C is the fire lane: `tlane0`, `tlaneo` and `tlaneo` with MATEFIRE (teammates dodge our
bullets), screened on all 46 teams (plans/team-c.steps, about 2.5 PC hours). Ship an arm at +1.0 or more with the low end above zero and the A/A within ±1.0.

**Step A result (PC, 2026-10-25, PR #261): S4 fails its gate.** 46 teams, 6 seeds, against 3.16
(share points, paired):

| Arm | Paired diff |
|---|---|
| `bb` (A/A) | -0.2 ± 0.8 |
| `md` finish a disabled enemy (TMODE-8) | +0.1 ± 0.7 |
| `mb` dodge teammates' bullets (TMODE-9) | +0.6 ± 0.8 |
| `mr` leader keeps back (TMODE-10) | -0.3 ± 0.7 |
| `mdmbmr` all three | +0.2 ± 0.7 |

No arm reaches +1.0 with its low end above zero, so all three switches stay off. Small rules on
the current team play do not move the share; C (the fire lane) is the remaining lever on tonight's
card.

**Step D result (cloud, 2026-10-24): Ogi's wave check does not move us.** WAVES (TMODE-11, off,
team only) re-ranks the eight lowest-risk destinations by the shots their 30-tick drive would
cross, each shot a profile over its virtual bullets and its escape angle. Three cloud smokes against
the 3.16 aa build on the 11 teams of step C, 2 seeds each:

| Arm | Paired diff (share points) | Skipped turns a battle (baseline) |
|---|---|---|
| `tmwaves` (head-on and linear profile, seeds 3500-3501) | -0.3 ± 4.0 | 176 (122) |
| `tmwaves,tmlearn,tmpool` (learned aims pooled by class, Ogi's setup) | -4.4 ± 4.1 | 1,593 (124) |
| `tmwaves,tmwk` (kernel 2.5 bot widths wide, seeds 3600-3601) | +0.5 ± 3.2 | 172 (123) |
| `tmwaves,tmwk` after the signed-risk scaling fix (seeds 3700-3701) | +1.6 ± 4.1 | 174 (124) |

The re-smoke after the review fix (risk medians shifted by the least risk) stays inside its
noise. None earns PC time, so D is closed as built: the code stays on master with the mode off. By the
stop rule, movement is not where 5th comes from. The team lever is C (the fire lane), and what is
left after C's gate is read from the census against 77.2.

**Step C result (PC, 2026-10-25, PR #264): the narrow fire lane passes, and ships with MATEFIRE.**
46 teams, 6 seeds, against 3.16 (share points, paired):

| Arm | Paired diff |
|---|---|
| `bb` (A/A) | +0.6 ± 0.7 |
| `tlane0` no lane | +0.9 ± 1.0 |
| `tlaneo` Ogi's narrow lane | +2.2 ± 0.9 |
| `tlaneo,tmfire` narrow lane, dodging teammates' bullets | **+2.9 ± 0.9** |

Both narrow-lane arms clear the gate (+1.0 or more, low end above zero, A/A within ±1). The pair
gains most where step B said the tempo was lost: TeamDeath +14.8, ImpactTeam +11.5, Enjambre +8.3,
and against the top: Nightmare +15.1, Polylunar +19.8, CombatTeam +7.8, ShadowTeam +4.1, Ogi +3.5.
MATEFIRE, flat on its own in S4 (+0.6), adds +0.7 here: with the narrow lane our bullets pass near
teammates far more often. The pair is built as WEAVE-9 and TMODE-12 (team-only; the duel and melee
fixtures replay bit for bit) and goes on master with no release.

Projection: 3.16 live 72.13 plus +2.3 to +2.9 is about 74.5 to 75.0, behind Nightmare's 77.2 by
about 2.3. That is not top 5, so under the release rule there is no team release yet. What is left
is E (shared radar) and a fresh read of where the remaining 2.3 sits once the narrow lane is on.

**Step E result (cloud, 2026-10-25): the radar is not where the team loses.** Teammates already
share every scan, so against Nightmare an enemy's freshest position is 1.7 ticks old on average
(2.8 to 4.3 for one member's own radar); Ogi's arc plan could reach about 1.1. The cheap part,
MRADAR-3 (`MeleeRadar.TEAM_LOOK`, off, ablation `tlook`: look at the gun's target just before a
shot when every member's scan of it is two ticks old), smoked flat against master with step C on:
-0.2 ± 3.2 share points (11 teams, seeds 3800-3801). E is closed as built: no PC time, the switch
stays off, and the full arc planner is not worth its build for at most 0.6 ticks of freshness.

**Gap read with step C on (2026-10-25).** Live pages of Hadur 3.16, Nightmare and Aleph (all 46
pairings each; 44 teams all three have met), with each team's step C bench gain (`tlaneo,tmfire`,
PR #264) added to Hadur's live score. APS points are each segment's share of the 46-team mean.

| Opponents | Hadur 3.16 | Hadur + C | Nightmare (5th) | Aleph (6th) |
|---|---|---|---|---|
| ranks 1-6 (4 teams) | 2.68 | 2.99 | 4.87 (+1.9) | 3.44 (+0.5) |
| ranks 7-20 | 18.10 | 18.58 | 21.45 (+2.9) | 19.31 (+0.7) |
| ranks 21-46 | 49.90 | 51.58 | 47.95 (-3.6) | 52.00 (+0.4) |

- After C the lower half is no longer where we lose: we lead Nightmare there by 3.6 and are level
  with Aleph.
- The whole remaining gap is the top 20, where Nightmare's members survive (pack hunting: two or
  three members per target, leader-assigned). Its biggest leads after C: Shadow, Aleph, ArmyOfShiz,
  Firestarter, DemoniacNimrods, TroodonPack, Polylunar, CombatTeam, TMNR, Ogi (0.3 to 0.8 APS each).
- Three attempts at survival through the minimum-risk movement (S2, PACK, D) were flat or worse,
  and E shows the scans are not the limit. What is left is a different team structure against the
  top 20 (Nightmare's assigned pincers rebuilt with PACK's retry fixes, or Ogi's leaderless
  formation), a multi-day build with an uncertain return.

## 9. Pack hunting passes (TMODE-13, 2026-10-25)

Leigh chose to build a top-20 structure. HUNT is Nightmare's assigned pincers with PACK's three
flaws fixed:
- members are assigned two or three to an enemy, leaderless, in name order;
- each holds a slot at a fixed 350 px from its prey, ranked by bearing;
- the pull is 0.3 strong and leaves the bullets' risk unscaled, so members keep dodging.

The cloud could not smoke it (only 8 of the top-20 jars are there), so it went straight to the PC.
The card was pc-team-hunt (PR #282): 46 teams, 6 seeds, paired with 3.17. The first run was void
because it named 3.16 jars; PR #280 made the card read the version from the pom.

| Arm | Paired diff (share pts) |
|---|---|
| A/A (`bb`) | -0.4 ± 0.7 |
| HUNT (`tmhunt`) | **+4.1 ± 0.9** |

The gain is where the gap was: the top 20.
- ShadowTeam +16.5, Aleph +15.3, ArmyOfShiz +15.8, OmegaSquad +14.1, CombatTeam +12.7,
  TMNR +11.6, Valkiries +10.9, DemoniacNimrods +10.8, Xmen +8.9, GlowingHawks +8.6, Ogi +8.1,
  TroodonPack +8.3.
- Rounds won rose from 2155 to 2341 of 2760, and survival from 78.1% to 84.8%.
- The only top-20 loss is Nightmare, -3.2 ± 7.2, within noise. The lower half is flat (all within
  ±3).

HUNT ships as the team default (TMODE-14, `FORCE_HUNT`; ablation `tmnohunt`). It is team-only: the
duel and melee fixtures replay bit for bit.

**Projection.** 3.17 is live at 74.80 (65 battles), and team gains have carried over about 1:1
(C: bench +2.9, live +2.7). With HUNT the projection is about 78.9. That is above Nightmare (77.02,
5th) and Aleph (76.92), so HUNT projects 5th; ShadowTeam (79.17, 4th) is 0.3 above the point
estimate, so 4th is an uncertain upside. This meets the release rule (projection > Nightmare).
Leigh released it as the team-only patch 3.17.1 (minors move together across the rumbles).

## 10. From 4th to 2nd (2026-10-25 22:30 GMT)

3.17.1 went live 4th at 79.39 ± 1.00 after 69 battles (+4.6 over 3.17; the bench gave HUNT +4.1).
2nd is Firestarter at 81.99 and 3rd is Combat at 81.85, so 2nd is +2.6 away. Comparing our live page
with theirs opponent by opponent:

| Opponents | Gap to Firestarter | Gap to Combat | Our survival | Theirs (F / C) |
|---|---|---|---|---|
| Top 6 (Ogi, Aleph, Shadow, Nightmare, Xmen, Polylunar) | 0.30 | 0.51 | 42% | 61% / 54% |
| 14 mid teams (HOFSwarm, Hawks, ArmyOfShiz, Phoenix, Troodon, Mamba, ...) | 2.10 | 1.62 | 84% | 98% / 97% |
| Bottom 25 | 0.09 | 0.33 | 99% | 100% / 100% |

The gap is rounds lost to mid-table teams that Firestarter and Combat almost never lose, not the top
teams we lose to. The 46x6 bench agrees (HOFSwarm 63%, Hawks 75%, ArmyOfShiz and Phoenix 78%).

Steps, all team-only, each a PC card Leigh starts:

1. **Friendly-fire lane** (card pc-team-lane, 3 arms x 552 battles, about 1.8 h). Our bullets hit our
   own members 21,600 times a 46x6 run with the narrow lane, against 6,100 before it. WEAVE-10 (tlanep)
   judges a nearer teammate where it will be when the bullet arrives; WEAVE-11 (tlaneb) holds for a
   teammate up to 450 px beyond the target. Expected +0.5..+1.5 (a guess). Pass: +1.0 with the low end
   above zero and A/A within 1.0.
2. **Per-team table over the 20 teams that cost us** (14 mid + top 6): HUNT on/off, pack size, slot
   distance, fire lane. Table v1 failed at 6 seeds a team (about ±7 a team); this uses 20 seeds a team
   (about ±3). Screen about 2.5 h, fresh-seed gate about 1 h. Expected +0.5..+1.0.

Together +1.0..+2.5 against +2.6: 2nd only at the top of the range.

### 10.1 Results so far (2026-10-26)

- **Friendly-fire lane failed** (results PR #293). Against master: A/A -0.1 ± 0.6, WEAVE-10 -0.4 ± 0.7
  (own-member hits 19.6k down to 14.7k, held shots doubled), WEAVE-11 -0.3 ± 0.7 (hits unchanged).
  Both stay off. Our own fire is not what loses rounds to the mid teams.
- **How we lose rounds** (PR #300, tools/team_losses.py on the lane card's A/A logs, 12 battles a team):

| Band | Round wins | Members lost a round | Lost in a won round | Round length | Dmg taken / dealt | Their / our hit % |
|---|---|---|---|---|---|---|
| top 8 | 39.9% | 4.09 | 2.72 | 956 | 363 / 369 | 17.6 / 16.1 |
| mid 14 | 85.5% | 2.42 | 1.98 | 878 | 251 / 378 | 14.1 / 14.9 |
| rest | 99.8% | 0.46 | 0.45 | 452 | 137 / 475 | 16.3 / 21.2 |

  Against the mid 14 we out-trade them and win most rounds, but rounds run twice as long as against
  the rest because we hit them less (14.9% against 21.2%), and we lose two members even in a round we
  win. Earlier screens rule out the cheap readings: head-on and linear aims are about 12% of the hits
  on us (docs/bench/team-lower-half.md), converging fire lost 2.2 (tfocus), and fire power already
  ships (MGUN-6).
- **Next (card pc-team-compare, about 15 min):** bench Firestarter and Combat as the subject against
  the mid 14 on the same seeds and read them with the same tool, to see where they differ (round
  length, hit rate, members lost) before building anything.

### 10.2 Team lines of fire (2026-10-26)

- **Compare result (PR #313, docs/bench/local/team-compare-read.md):** against the mid 14 our own
  bullets do 60 damage a round to our members; Firestarter's 10, Combat's 17. That is about half
  of the extra bullet damage we take. Their hit rate on us is the same as on them (14.1% against
  13.0%); we hit the mid teams less (14.9% against 17.9% and 16.2%). Both rivals hold almost no
  shots (about 2% fly with a mate in the lane), so they keep members out of each other's lines
  rather than holding fire, which is what WEAVE-10/11 did and lost.
- **TMODE-15 LINES (off):** a member's destination risk adds a cone behind each teammate's nearest
  fresh enemy, as the teammate sees it, where its misses fly (0.3 on the line, none 0.3 rad off,
  up to 800 px past the enemy). Ablations tmlines and tmlinesw (0.6, 0.45 rad).
- **BENCH-114:** each friendly hit is logged as lane, walkin, beyond, noline or unseen, so the
  card says where the 60 a round comes from even if both arms fail.
- **Card pc-team-lines (about 1.8 h):** A/A, ml and mlw on all 46 teams, 6 seeds from 4200. Gate
  +1.0 share points with the low end above zero and the A/A within 1.0.
- **Result (PR #326): failed.** ml +0.1 ± 0.7, mlw -0.3 ± 0.7 (A/A +0.3); own hits unchanged at
  about 69 a battle. By kind against the mid 14: lane 4%, walkin 25%, beyond 13%, noline 57%. Most
  friendly hits come from shots with no enemy within 60 px of the line when fired (lead shots), so a
  cone round the enemy's current spot could not reach them. LINES stays off.
- **Next (card pc-team-ffread, no battles):** `tools/friendly_hits.py` on the A/A logs says how far
  off the line those victims stood and whether they were ahead of the shooter.

### 10.3 Per-team table v2 (2026-10-27)

- **Why per team.** The rumble has 47 teams, so each pairing is about 2% of the team APS. The lane
  (WEAVE-10/11, PR #293) and lines (TMODE-15, PR #326) screens lost across the field but several
  teams gained by 3 to 9 share points. A table entry plays a variant only against the teams it helps.
- **Modes (team-only, off unless a table entry names them; TABLE ships empty):** TMODE-16 LINESW
  (lines at 0.6 / 0.45 rad), TMODE-17 LANEP (WEAVE-10 for that team), TMODE-18 LANEB (WEAVE-11).
  Every entry keeps the shipped MATEFIRE and HUNT. With all three forced on against every team,
  only the team fixtures change; the duel and melee fixtures replay bit for bit.
- **Picks, no new screens:** each mode scored against both of its card's baselines (paired gain
  less half the A/A), best mode at +3.0 points or more: Ogi LANEB +8.5, Xmen LANEP +8.8, Shadow
  LINES +5.5, GrubbmGroup LINESW +5.9, GrofGroup LANEP +5.0, OmegaTeam LINES +3.5, Enjambre LANEB
  +3.2. Intervals are wide (3.6 to 14.8 points): these are max-of-four picks on 6 seeds, so expect
  half or less to hold.
- **Card pc-team-table (about 45 min, ~700 battles):** confirm the table on those 7 teams at 12
  fresh seeds with a bb A/A, keep picks at +1.0 or more, then gate the kept table at 16 fresh seeds.
  Gate: projected team APS change (summed gains / 46) at least +0.30 with the low end above zero.
  The v1 table (2026-10-24, PR #246) kept 5 of 13 picks and its census read +0.2 ± 0.8 across all
  46 teams; this gate measures only the teams the table changes, so the noise of the other 39 is
  left out.
- **Expected:** +0.2 to +0.5 APS. It does not close the 2.6 gap to 2nd on its own.

### 10.4 Gun lines (2026-10-27)

- **Friendly-fire read (PR #332, A/A logs, 38,673 own hits):** lane 5%, walkin 21%, beyond 17%,
  noline 57%. Noline victims stood ahead of the shooter in 98 to 100% of hits: 20% within 36 px of
  the line when the shot left, 44% at 36 to 100 px, 28% at 100 to 250 px. These are lead shots: the
  bullet flies to where the enemy will be, and a teammate is on that line, not near the enemy.
- **TMODE-19 GUNLINE (off):** each member's report states its gun heading and heat; a member's
  destination risk adds the line ahead of each teammate's gun that fires within 6 ticks (0.4 on the
  line, none 70 px off, 20 to 900 px ahead). That keeps members out of where their teammates' next
  shots go, which is what Firestarter and Combat appear to do (they hold about 2% of shots and take a
  sixth of our own-fire damage). Team-only; the report is unchanged where GUNLINE is not played.
- **Card pc-team-gunline (about 1.8 h, 1,656 battles):** A/A, mgl and mglw (1.0, 100 px) on all 46
  teams, 6 seeds from 4500. Gate +1.0 share points with the low end above zero and the A/A within 1.0.
  The read reports own hits per arm, so it says whether the term moved them even if the score did not.
- **Expected:** if own-fire damage falls by half, about +0.5 to +1.0 APS (half our extra damage
  against the mid 14 is own fire). Run after pc-team-table.


## 11. One counter per opponent (2026-10-27)

Plan doc: "Team rumble: plan from 4th to 2nd" (https://claude.ai/artifact/WJJuSZcEDftxfD7FMLgVbB).
Gun lines failed (PR #344), and no team gain has landed since 3.17.1. Every flat card since HUNT was
a tweak to our own movement, and both per-team tables (PR #246, PR #339) only picked among those
tweaks on 6 seeds. In 1v1, tailoring pays because each mode counters a bot type. This section does
the same for team: read each costly team's code, then give it a counter that exploits what it does.

- **Reads.** The 16 teams Firestarter beats us on by 5 to 13 points, from their decompiled jars:
  10 shoot their closest enemy, 9 cut power with distance, 5 aim only head-on or only linear.
- **Counters** (team-only table modes; no FORCE switch, `TeamModes.TABLE` ships empty):
  - OWN (TMODE-20): shot ownership via MMOVE-9's nearest rule. It lost globally, but against a team
    that shoots its closest it is exact.
  - HEADON / LINEAR (TMODE-21/22): one virtual bullet per shot, on the team's only aim, weighing
    both guesses' total (`ONE_AIM_WEIGHT` 2).
  - FAR / FARTHER (TMODE-23/24): the hunt's slot at 500 / 650 px, not 350, against power that
    falls with distance.
  - With all of them forced into the default, only the team replay fixtures move; the duel and
    melee fixtures replay bit for bit.
- **Card** plans/pc-team-counters.queue (BENCH-123): plans/team-counters.tsv gives each of 15 teams
  up to three counters (screens s1..s3, one table jar each: ka, kb, kc), each played only against
  its team, 16 seeds from 4600, beside a bb A/A.
  - Pick per team: best screen at +3.0 points or more over both baselines, with the low end above 0.
  - Gate: the picked table (mk) on 16 fresh seeds from 4700; projection at least +0.30 APS with the
    low end above zero. `lock` keeps the teams at +1.0 or more as the table to ship.
  - About 2,500 battles at most, ~2.8 h on the PC.
- **Not built yet:** radar first against TroodonPack (two radar bots feed three droids); break the
  focus (Mamba's shared target); wounded members back off (Valkiries, OmegaSquad). Firestarter's
  path check on mate bullets comes after the table, as the one general step.
- **Expected:** the table +0.8 to +1.8 APS, if half of Firestarter's lead on these teams closes.
