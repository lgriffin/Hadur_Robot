# Ogi deep dive: how OgiTeam leads the team rumble, and what HadurTeam should take (2026-10-24)

Leigh's ask (2026-10-24 00:05 local): a deeper read of Ogi's code, the team version first, since
it leads the team rumble by a wide margin and sits above Hadur in 1v1. This builds on
`rivals-source-read.md` (1v1 Ogi) and `team-top-decompile.md` (first team read, which gave the
SOFT, GANG and FINISH modes). It does not repeat them; it goes through the whole jar.

Jar: `cz.libors.Ogi_v1.jar` from robocode-archive.strangeautomata.com/robots/, read with CFR 0.152
in a scratch directory. Nothing is copied into Hadur. Each idea is described so we can write our
own version.

## 1. The bot in one paragraph

Ogi is one class, `cz.libors.Ogi extends TeamRobot`, about 9,800 decompiled lines in 76 classes.
**The team, melee and 1v1 entries are the same jar** (OgiTeam_v1 and Ogi_v1 have the same SHA-1,
368d79cc). The team file is five plain copies of Ogi: no leader, no droid, no roles. Every
member runs the same code on the same inputs and so reaches the same plans. The robot
description reads "Team-first bot (walking skeleton)". About 1,500 lines are debug overlay and
logging (gun, movement and CPU traces), and the tuned constants step in factors of 1.4, 0.7 and
0.98 (8.23, 1.225, 0.686, 22.4, 7.84), which points to an offline tuning harness fed by those logs.

## 2. Versions and standings

The archive holds **one version only, v1**: the 1v1 jar was archived on 2026-10-20 19:40 and the
team jar on 2026-10-21 03:40 (same file). There is no history to compare, so "what changed when
it jumped" has no answer yet. The RoboWiki page (revision 70246) says a description, credits and
**the source on GitHub will follow "this weekend"**. When that lands, this read should be checked
against the real source and its credits.

Live standings (rumble.robowiki.net, read 2026-10-23 23:10 UTC):

| Division | Ogi | Rank | Next best | Hadur 3.15 |
|---|---|---|---|---|
| Team | **88.69**, survival **97.6** | 1st | CombatTeam 82.05 (survival 91.7) | 67.50, 9th (survival 73.2) |
| 1v1 | 90.95 | 6th | Diamond 90.15 below it | 89.34, 8th |
| Melee | 70.72 | 5th | Diamond 70.12 below it | 66.30, 17th |

OgiTeam's lowest pairings: Firestarter 60.4, Nightmare 64.0, Polylunar 67.7, Combat 69.3,
Aleph 72.0, Xmen 75.6, **HadurTeam 79.2** (Hadur takes 20.8). It has no ShadowTeam pairing yet.
**The defining number is survival: 97.6.** Its members almost never die, and Hadur's team plan
(`plan-team-top5.md`) already found that Hadur's gap is members dying.

## 3. Architecture

| Part | Classes | What it does |
|---|---|---|
| Phase | `Phase`, `BattleKind` | MELEE (2+ enemies), TEAM_ENDGAME (1 enemy, a mate alive), DUEL (1 enemy, alone). The battle kind (DUEL, MELEE, TEAM) is fixed at round 1. |
| Memory | `BattleMemory` (static) | Gun models, danger models, fire records, shield trial, power records, gang watch. Kept for all rounds. |
| Link | `TeamPacket`, `TeamOutbox`, `TeamFeed`, `EnergyEvents.team` | One serialized packet per member per tick (section 4.1). |
| Radar | `RadarControl`, `TeamRadar`, `MeleeRadar` | Team arc assignment in melee, lock in duel (4.2). |
| Fire detection | `FireDetector`, `Neighbours` | Energy drops from every member's scans, corrected by shared hit events (4.3). |
| Enemy waves | `EnemyWaves`, `EnemyWave`, `HitRange`, `BulletPath` | Waves with exact bot-width hit intervals, own-bullet shadows, teammates' bullets (4.4). |
| Danger model | `DangerModel`, `SimpleAims`, `LateralHistory` | kNN + 13 simple aims + flattener, mixed by exponential weights, one per enemy class (4.4). |
| Melee/team move | `MeleeMovement`, `GangWatch` | Minimum risk with team terms, pulls, and a path-simulated wave re-rank (4.5). |
| Duel move | `WaveSurfer`, `OrbitMovement` | True surfing on the two nearest waves, gun-heat pre-surf, ram evasion (5). |
| Guns | `MeleeGun`, `VirtualGuns`, `GunModel`, `MirrorAim`, `CircularAim` | Melee play-it-forward kNN over all enemies; duel virtual guns (4.6, 5). |
| Power | `BulletPower`, `RacePower` | 1.92 default, 3.0 close or when reading well, energy-race chooser in duels. |
| Shield | `Shield`, `ShieldPlanner`, `ShieldStance`, `ShieldTrial` | Duel battles only; tried on every opponent, dropped on failure (5). |

## 4. The team version in depth

### 4.1 Messaging: one packet, and every member sees the same picture

Each tick every member broadcasts one `TeamPacket`:

- **its own state**: position, heading, velocity, energy, **its next position** (from the move
  it just ordered, run through its physics model) and **its next radar heading**;
- every enemy it scanned this tick (`EnemySighting`: position, heading, velocity, energy, time);
- every bullet it fired (`TeamShot`: origin, heading, power, time);
- energy events: **its bullet hit enemy X for power p, enemy X's bullet hit it, it rammed X**.

The receiving side does not act on sightings straight away. `TeamFeed` holds them by tick and
flushes the previous tick once all reports for it are in. So all five members process the same
scans and events in the same order, one tick late, and their fire detectors agree. That is the
consensus that makes the radar plan (4.2) and the wave picture (4.4) identical on every member
without a leader.

### 4.2 Radar: the team splits the sky

`TeamRadar` gives each member a group of enemies to watch. Every member knows each mate's next
position and next radar heading, so each computes the same plan: members and enemies sorted by
name, then a dynamic programme over enemy subsets (up to 8 enemies) that minimises the total
sweep cost. A group's cost is roughly the ticks its arc needs to sweep (45 degrees a tick), plus
the turn to reach it, plus a small distance and group-size cost; an enemy beyond 1,200 px of a
member cannot be in its group. Each member then sweeps only the arc that covers its group.

The result is that every enemy is rescanned every tick or two, where a member spinning alone
sees each enemy once in 8 ticks. The plan is skipped (back to a spin) until every enemy has
been seen, and when the gun is about to fire the member looks at its own target first.

In TEAM_ENDGAME the radar sweeps the one enemy's arc; in a duel it locks.

### 4.3 Fire detection that counts teammates

Each enemy has a `FireDetector` fed by **every member's** scans (through the feed). When it
reads an energy drop it first subtracts known losses: hits by any member's bullets (shared
HIT_BY_US events), the energy an enemy gained by hitting any member (HIT_US), rams (0.6) and
inactivity zaps. It also models wall hits from the speed change, ignores drops of exactly 0.6,
1.2, 1.8 or 2.4 when the enemy was within 150 px of another robot (ram damage), tracks the
enemy's gun heat so a drop before the gun is cool is not a shot, and places the shot's origin
by interpolation between the two scans. Hadur's tracker does some of this
(`EnemyInfo.update`), but a teammate's hit in the same window as a shot hides the shot there.

### 4.4 Enemy waves and the danger model

Each detected shot becomes a wave aimed at the member's own position at fire time. Then:

- **Aimed at us**: `aimedAtUs = 1/(1+k)^2`, where k counts **teammates** nearer the shooter
  than this member (in melee it counts enemies). Waves under 0.1 (three or more mates nearer)
  are ignored. This is the source of Hadur's TMODE-2 SOFT.
- **Danger profile**: a 47-bin guess-factor profile from `DangerModel`, which mixes
  - a kNN over 10 features of the member's movement as the shooter saw it (flight time,
    lateral and advancing speed, acceleration, time since reversal and since deceleration,
    wall room both ways, 10-tick displacement, turn rate), blended with a running histogram
    as the kNN fills (share = n/(n + 9.8));
  - **13 simple aims** at this exact shot: head-on, linear (iterated, with walls), linear
    without walls, circular, lateral averages over 5, 20 and 40 ticks, a pattern replay and
    a truncated one, linear without asin, and linear at 0.5, 0.75 and 1.25 times the speed;
  - a flattener of its own visits.

  Each expert's weight is updated on every bullet that hits or is shot down, by the log of the
  share it gave to where the bullet went (decay 0.92, temper 0.245). A head-on or linear gun
  is matched within a few bullets; a learning gun takes over as the kNN fills.
- **Pooled by enemy class, kept across rounds.** The model is keyed by `Names.base(name)`,
  the name without its " (n)" copy number. In a team battle the five enemies are copies of
  one class, so each member learns one model of that team's gun from hits by all five
  enemies, and keeps it for all 35 rounds. (Members do not send models to each other; each
  member pools its own.)
- **Shadows**: Ogi's own bullets in flight cut shadows in each wave; the shadowed share of the
  profile is removed from that wave's danger.
- **Teammates' bullets**: each mate's `TeamShot` becomes a hit range against this member;
  a path that runs into one counts its full damage.

### 4.5 Movement: minimum risk, team terms, then a wave check along the path

Every tick (MELEE and TEAM_ENDGAME):

1. **Candidates**: the current destination (if not reached) plus 40 points in random
   directions at 80 to 220 px, capped at 0.6 times the distance to the nearest enemy, at least
   45 px from the walls.
2. **Risk of a point** = (sum over robots of a term) x crowding x pull:
   - each enemy: `threat x (1 + |cos(angle between my path and the line to the enemy)|) /
     (d^2 x (1 + closer))`. Threat is the enemy's energy over mine, clamped to 0.5..2.
     **`closer` counts the robots, teammates included, that are nearer that enemy than the
     point is.** A point with mates between it and an enemy is much safer: the movement-side
     twin of the aimed-at weight;
   - each teammate: `3 / d^2` (keep apart);
   - crowding: 1 + 400/d^2 for each of the last 20 own positions (every 5 ticks);
   - pull: `e^(strength x (to - from) / 100)`, distances to the pull point floored.
3. **Pulls**, one at a time:
   - **FINISH**: one enemy left, a mate alive and own energy >= 30: pull 1.0 toward it, floor 350 px;
   - **GANGED**: two or more enemies within 250 px of me: pull 0.5 to my nearest mate, no floor;
   - **HELPER**: a mate has two or more enemies within 250 px: pull 0.5 toward it, floor 300 px.
   Gang pulls are **off until `GangWatch` turns them on**: it counts, over the battle, every
   member's turns with two or more enemies within 250 px, and turns gang defence on once
   200 member-turns are seen and 4% or more of them were ganged. A team that never gangs up
   never triggers it.
4. **Hysteresis**: the current destination's score is multiplied by 0.9.
5. **Wave re-rank along the path**: the 8 lowest-risk candidates are each driven to for 30
   ticks with Ogi's exact physics, and every wave in reach (aimed-at >= 0.1) and every
   teammate bullet is checked against the robot's box tick by tick. A point's wave damage is
   the sum of aimed-at x profile mass over the hit interval x unshadowed share x bullet
   damage, plus full damage for teammate bullets it runs into. The final score is
   `risk / median(risk) + 3 x damage / max(0.1, median(damage))`, times 0.9 for the current
   destination.

Why this works where Hadur's route sampling did not (M4, 2026-10: -3 to -5 APS): Hadur scored
two **certain** point bullets per shot along the route, so every guessed path hemmed it in.
Ogi spreads each wave as a probability profile that sums to at most one bullet, weights it by
who the shot was aimed at, lets it re-rank only the eight safest points, and puts both terms on
the same scale with medians.

When the member is the last of its team alive against one enemy it is in DUEL phase and
surfs (section 5); the shield is never used in a team battle.

### 4.6 Gun

- **Target**: the closest enemy for power and the duel guns. In MELEE phase, once the gun is
  nearly cool, `MeleeGun` takes over the aim.
- **MeleeGun**: play-it-forward kNN. Every scan (own and mates') opens a record of where that
  enemy goes next, in its own heading frame, for up to 140 ticks. Features: speed,
  acceleration, turn, wall ahead, distance to its nearest robot (mates included), the
  direction to that robot (two terms), enemies alive, time since reversal and since
  deceleration, 16-tick travel, distance from the centre. For every enemy it takes 24
  neighbours, plays each forward to the bullet's flight time, and weights the angle by
  1/(match distance + 1.6) / enemyDistance^0.686 (team parameters). It fires at the angle with
  the most weight summed over **all** enemies, so a shot that lines up two enemies wins.
  Records are **pooled by class** (Names.base) and kept across rounds, up to 1,500.
- **Power**: 1.92, or 3.0 within 200 px or once it hits 55%+ of 20+ shots at that class.
  No race logic outside duels. Capped at the enemy's energy/4 + 0.1.
- **Friendly fire**: holds a shot when a mate nearer than the target is within atan2(30, d)
  of the gun line. Nothing more.

### 4.7 What Ogi does not have

No leader, no target assignment, no pincer, no per-team data in the jar, no roles, no droid,
no special energy rules in team play. Its tailoring is all online: the danger model's expert
weights, the hit records behind bullet power, GangWatch. **Its lead is architecture, not a
lookup table.**

## 5. The 1v1 version (same jar, BattleKind DUEL)

- **Shield first, everyone**: in a 1v1 battle Ogi starts every opponent with its bullet
  shield. `ShieldTrial` drops it for that opponent (for the rest of the battle) when damage
  taken exceeds 35 + 0.25 per enemy shot, after 2 lost rounds, or when 20+ ended bullets were
  under half shot down, or 6 hits with none shot down. While shielding the danger model does
  not learn. Shield movement: a stance at 38 + 3.4 px per bullet speed, with a retreat.
- **Surfing**: true surfing on the nearest wave and the next, with options orbit left, orbit
  right and stop (plus retreats against rammers), preferred distance 325 px (275 when Ogi hits
  under 18% after 30 shots). Between waves it surfs an **imaginary next wave** once the
  enemy's gun is cool (Hadur's RAM-4 / `hj` idea), and evades a detected rammer
  (`RamDetector`: mean approach speed within 200 px above 2).
- **Guns**: virtual guns GF-kNN (10 features, up to 100 neighbours), circular, anti-surfer
  (three views with decay windows 30, 150 and none), a random GF inside the reachable escape
  range, and a mirror gun for mirror movers. Circular is used until GF scores better; anti-surfer
  or random replace it only once the GF gun is hard to hit with (Wilson low end < 20%).
- **Shadow-aware aim**: just before firing at an anti-surfer target, it looks at up to 3
  alternative peaks with 70%+ of the main peak's weight and fires the one whose bullet shadow
  lowers its own surf danger most. Hadur has nothing like it.
- **Power**: as in 4.6, plus 1.45 when it hits under 25% of 30+ shots, and an energy-race
  chooser (both sides' damage per tick at each candidate power) when either side is low.
- **Finishing**: a disabled enemy is rammed, with 0.1-power taps if the gun lines up.

## 6. Hadur's team against Ogi's

| | OgiTeam | HadurTeam (master, team modes off) |
|---|---|---|
| Radar | Shared plan, each member sweeps its group's arc; every enemy rescanned every tick or two | Each member spins on its own (MRADAR-1); a sweep is 8 ticks |
| Link contents | State with next position and next radar heading, sightings, shots, hit/ram events | State, sightings, deaths, shots, dodge samples |
| Fire detection | All members' scans, corrected for every member's hits and rams, processed in tick order | All members' scans; own hits corrected, teammates' hits not |
| Who the shot is for | 1/(1+k)^2 by mates nearer the shooter, ignored under 0.1 | Every shot aimed at me (SOFT built, off) |
| Where enemy bullets go | Probability profile: kNN + 13 simple aims + flattener, expert-weighted, per enemy class, all rounds | Two point bullets (head-on, linear); LEARN kNN per enemy name (off) |
| When bullet danger counts | Along a 30-tick simulated drive to the 8 safest points, median-normalised | At the destination only, 160 candidates |
| Enemy term in risk | Divided by 1 + robots (mates included) nearer that enemy | Doubled where I would be the enemy's closest **opponent**; mates ignored |
| Teammates' bullets | Danger along the path | Fire lane only |
| Ganging | Regroup and help pulls, self-enabled per battle by GangWatch | GANG mode built, off; table-driven |
| Finishing | Pull to the last enemy when a mate lives | FINISH mode built, off |
| Gun data | Play-it-forward kNN pooled by enemy class, all members' scans | FieldGun per enemy name, mates' sightings (MGUN-8), k21 |

## 7. What to port, in order

All of it is team-only: reached only with a living teammate, behind its own switch and
ablation, and proven solo-inert by replaying the duel and melee fixtures bit for bit with the
switch on (Leigh's rule, 2026-10-11 and 2026-10-23). Estimates are guesses from the size of
the gap and from Hadur's earlier team screens; none is measured.

| # | Port | What changes in Hadur | Size | Guess (team APS) | Why this rank |
|---|---|---|---|---|---|
| 1 | **SCREEN**: count mates as "closer" | In the enemy risk term, divide by 1 + (robots, mates included, nearer that enemy than the point), replacing the closest-opponent doubling on a team | Small | +1 to +3 | Hits the measured cause (members die with 2+ enemies near) directly; a few lines; pairs with SOFT |
| 2 | **POOL**: key gun and danger logs by enemy class on a team | FieldGun histories and TeamDanger logs keyed by LineageKey base name when a teammate lives | Small | +0.5 to +1.5 | 5x the data from round 1 at no CPU cost; k12 to k21 alone was +2.4, so data depth pays |
| 3 | **WAVES**: Ogi-style path danger | Per detected shot, a GF probability profile (LEARN kNN + simple aims, below), weighted by SOFT's 1/(1+k)^2; score only the 8 safest candidates by a 30-tick physics drive; blend `risk/median + 3 x damage/median` | Large | +2 to +4 | Biggest ceiling, and the piece Ogi and Firestarter share. It answers M4 and team-s2 (point bullets hemmed Hadur in; 160 candidates cost skipped turns) |
| 4 | **EXPERTS**: 13 simple aims in the team danger profile | Simple-aim experts, exponentially weighted per enemy class, feeding #3 | Medium | in #3 | Most team bots shoot head-on or linear; matched in a few bullets. The same build is the 1v1 lead from rivals-source-read.md, but the duel side stays separate |
| 5 | **RADAR**: shared radar plan | Members send next radar heading and position; all compute the same arc assignment; each sweeps its group | Medium | +0.5 to +1.5 | Fresher scans for every enemy: better fire detection (needed by #3) and better gun data |
| 6 | **GANG gate**: GangWatch | GANG self-enables after 200 member-turns with >= 4% ganged, instead of (or under) the table | Small | +0 to +1 | Lets GANG help against gangers without hurting against spreaders; cuts the table's work |
| 7 | **EVENTS**: shared hit and ram events | Report carries "my bullet hit X for p", "X hit me", "I rammed X"; trackers subtract them; merge in tick order | Small | +0.2 to +0.5 | Cleaner shot detection, a prerequisite for #3 being trusted |
| 8 | **MATE BULLETS** as path danger | Teammates' shots in flight count against routes that cross them | Small, after #3 | +0.1 to +0.3 | Ogi and Firestarter both do it; Hadur's fire lane covers the shooting side only |

Not worth porting: Ogi's fire check (Hadur's T1 lane is stronger), its bullet power (firepower is
a closed door, `hadur-midrange-plan`), and its gun (Hadur's k21 FieldGun is close; pooling, #2,
is the part that matters).

**How this fits the per-team mode table.** Ogi has no table; it adapts online. Its pieces are
general rules, so #1, #2, #5 and #7 should be screened as field-wide team switches, and #3 and
#6 can become modes the table picks per team if a screen splits by team as LEARN did (Ogi +4.9,
Nightmare -7.2). The pc-team-modes card runs first, as planned; these switches go on the next
team card. Nothing here touches Leigh's PC or the pc-table-v1 run.

**Suggested order**: build #1 and #2 together (one cloud screen, a day), then #7 and #5 (they
feed #3), then #3 with #4 as one stage. Expected total if the guesses hold: +4 to +10 team APS,
which brackets the ~6.5 still needed for team top 5.

## 8. For the 1v1 side

The 1v1 read in `rivals-source-read.md` stands. Two additions from this pass:

- **Shadow-aware aim** (choose among near-equal anti-surfer peaks the one whose bullet shadow
  protects Hadur most): new, cheap, duel-only. Worth a duel screen.
- **Shield trial on everyone** is Ogi's whole shield policy (no list). The census thread's
  SHIELD-15/16 work already covers it.
