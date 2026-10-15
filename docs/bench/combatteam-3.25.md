# How mn.CombatTeam 3.25.0 plays, and what HadurTeam can take from it (2026-10-15)

CombatTeam is 1st in the TeamRumble (83.40 APS on 2026-10-11). HadurTeam 3.13 is 9th (68.33,
2026-10-15 first pass) and takes 32.97 APS and 10% survival off it
(`/mnt/project-files/data/2026-10-15T0710Z_teamrumble_botdetails_hadur2.HadurTeam_3.13.html`).
This note reads CombatTeam's code, compares it with HadurTeam, and proposes team-only stages.
It changes no robot code.

**Source.** The 3.25.0 team jar (Leigh's upload) holds `mn/CombatTeam.team` and a nested
`Combat-3.25.0.jar`: 56 classes, obfuscated (one-letter names), no source
(`robot.include.source=false`). Decompiled with CFR 0.152 to about 5,300 lines. The decompile is
readable but loses some local names, so a few thresholds below are inferred from context and
marked so.

## 1. The team in one paragraph

Five identical `mn.Combat` (a `TeamRobot`, the same robot that is 12th in melee). No droids, no
leader role, no target calling. What makes it a team is that **the five members learn as one**:
every tick each member broadcasts what it scanned, the bullets it fired, and every learning sample
it finished (gun waves that reached an enemy, enemy bullets that hit or passed). Each member feeds
its teammates' samples into its own kNN logs, so each gun learns each enemy from five robots'
shots, and each member's movement learns each enemy's gun from the hits on all five. Movement is
anti-gravity with wave forces built from that shared enemy-gun model. The gun is a multi-enemy
density gun with k = 21. Power is high (2.95 to 3.0 most of the time).

## 2. What each part does

### 2.1 The link (one message per member per tick)

Each member broadcasts one Java-serialized object every tick (`mn.c.a`, `mn.c.b`) carrying:

| Field | What it is | What a receiver does with it |
|---|---|---|
| state | the member's own predicted position | teammate repulsion; "who is the enemy shooting at" |
| scans | every enemy it scanned this tick (x, y, energy, heading, velocity, tick) | merged into the shared enemy picture; **gaps between two scans are filled by linear interpolation**, tick by tick |
| gun samples | each resolved real-bullet gun wave: the 13-feature situation and the guess factor that would have hit | added to the receiver's own gun log for that enemy |
| enemy-gun samples | each enemy wave that hit or passed the sender: the 15-feature situation and the angle the bullet took | added to the receiver's own enemy-gun (surf) log |
| bullets fired | position, heading, power, tick of each own shot | **friendly bullets in flight**, used as repulsors in movement |
| bullet hits / bullet-hit-bullet / misses | which shots ended, and how | friendly bullet removed; enemy wave matched and removed |
| colour | the lowest-named member picks a random colour | all five paint the same |

Data survives deaths. Each member keeps, for each teammate, the samples broadcast after that
teammate died; at the start of the next round it sends them to that teammate in ten chunks
(`mn.c.j`). So a member that died early in round 3 starts round 4 knowing everything the team
learnt while it was dead.

Log sizes: 4,000 samples per enemy for the gun, 4,000 for enemy hits, 4,000 for enemy waves that
passed (the visit log). The distance is Manhattan over features weighted by 1 / running standard
deviation (online z-scores), so new features need no hand tuning.

### 2.2 Enemy fire detection and who it is aimed at

An enemy's energy drop between two scans of 0.1 to 3.0 is a shot, after taking out the damage of
the member's own bullets that hit it, wall hits, rams and the hit bonus. The wave is then
**assumed to be aimed at the team member nearest the shooter** (teammates' positions come from
the link). A member only dodges waves aimed at itself, or waves from an enemy it hit this round
(revenge), or every wave once it is alone against one enemy.

### 2.3 Movement: wave-aware anti-gravity

While any teammate lives, or more than one enemy is alive, the member drives at full speed along
the sum of these forces (`mn.d.d`):

- **Enemies** push away with weight `50 · E_enemy / (E_enemy + E_me)` over `(distance − 36)²`.
  A stronger enemy pushes harder. An enemy with no energy left (disabled), or at 0.6 or less while
  we have more (inferred), and with no wave in flight, **pulls** instead (−50): the member closes
  in to finish it.
- **Enemy waves** aimed at this member push sideways, perpendicular to each likely bullet's path,
  with the bullet's damage over the distance to that bullet squared. The likely bullets are the
  18 nearest neighbours in the shared enemy-gun log, each weighted by its kernel. With no data
  yet, the bullet is assumed head-on.
- **Teammates' bullets in flight** push sideways the same way, until they pass.
- **Teammates** push away with weight 25 over `(distance − 36)²`, half an even enemy's.
- There is no wall force. Instead the member looks a full turning circle ahead (about 230 px);
  when that point leaves the field it simulates turning left and right and takes the turn that
  stays inside longer.

Only when it is the last member alive against one enemy, and that enemy is beyond 400 px, does it
switch to true wave surfing (three options, forward, back, stop; precise prediction).

### 2.4 Gun: one aim across all enemies

Every tick (`mn.g.b`):

1. **Targets.** If any enemy is within 150 px, only those are candidates; otherwise every enemy
   seen in the last 16 ticks.
2. **Predictions.** For each candidate the 21 nearest situations in the (team-shared) gun log
   give 21 guess factors, kernel-weighted.
3. **Aim.** Every candidate's predicted angle is scored by the summed kernel density of all
   candidates' predictions at that angle (bot width as the bandwidth). The best angle can serve
   two enemies at once.
4. **Power.** 3.0 when a candidate is within 150 px. Otherwise 2.95 when the chance that the shot
   hits someone is at least 1/3 (two or more enemies) or 1 (one enemy); else
   `min(1.95, 0.025 · E_me)`. Then capped at the power that kills the strongest candidate, and
   never more than the member's energy minus 0.01.
5. **Fire** only when the gun is cool and the turn has finished (the aim is last tick's).

It never checks whether a teammate is in the line of fire. Friendly fire is left to the
teammates' movement, which dodges the bullets it was told about.

Gun features (13): power, distance, |velocity|, heading relative to the bearing, angular change,
acceleration, forward and reverse escape angle (wall-limited), ticks since direction change,
disabled, shots fired at it so far, living teammates, enemies alive. The last two let one log
serve every stage of a round.

### 2.5 Radar

Melee "oldest first": once it knows every enemy, it sweeps toward the one scanned longest ago;
otherwise it spins. With five members scanning and the link interpolating gaps, every member has
a fresh picture of every enemy almost every tick.

## 3. Side by side

| | CombatTeam 3.25.0 | HadurTeam 3.13 |
|---|---|---|
| Members | 5 identical, no roles | 5 identical, no roles |
| Shared picture | scans, deaths, bullets fired, interpolated gaps | scans, deaths, own state (WORLD-4, LINK-4); bullets fired are sent but not read |
| **Gun learning** | **one log per enemy fed by all five members' real shots, kept across deaths** | each member learns only from its own waves |
| Gun depth | k = 21 | k = 3 on a team (MGUN-7's 12 is melee only) |
| Gun target | all enemies; only those within 150 px if any | field gun over enemies alive |
| Power | 3.0 close, 2.95 when likely to hit, else 1.95, kill-capped | 3 from 30 energy (MGUN-6), kill-capped |
| Friendly fire | none checked; teammates dodge the bullets | fire lane held (WEAVE-4, WEAVE-7): 19,286 shots held in the T1 gate, about 16 per member-round |
| **Movement danger** | **learned: enemy-gun kNN from hits on all five members** | virtual bullets head-on and linear (MMOVE-3) |
| Whose waves | the member nearest the shooter; plus revenge | every detected shot treated as aimed at this member |
| Movement form | continuous anti-gravity at full speed | minimum risk over 160 points, 100-300 px |
| Disabled enemy | attracts (go finish it) | no special rule found |
| Teammates' bullets | repel | not modelled (the shooter holds instead) |

The two largest differences are the shared learning (rows in bold). Both explain the earlier
finding that HadurTeam's gap is firepower (`team-lower-half.md`): CombatTeam's gun has five times
the data and seven times the depth, fires without holding for teammates, and at higher power.

## 4. Proposed team stages

All of these are team-only by construction: they act only while a teammate lives (the
`onTeam` / living-teammate test MGUN-6 and MGUN-7 already use), so duel and melee fixtures stay
bit-identical (Leigh's rule of 2026-10-11). Each starts as an ablation switch in
`build-ablation.sh`, screened on the cloud and then gated on the PC on `team-census45` (6 seeds,
the T2 protocol), and ships only on a whole-field gain.

| Stage | Change | Cost | Why it should pay |
|---|---|---|---|
| **T3 gun depth** (`tk12`, `tk21`) | `FieldGun.K` on a team 3 → 12 or 21 | one constant | MGUN-7 found 3 → 12 worth +0.85 APS in melee; CombatTeam uses 21. Never screened on a team |
| **T4 fire lane** (`tlane0`, `tlane4`) | fire through teammates (CombatTeam's way), or keep only WEAVE-4's point test and drop WEAVE-7's track test | one switch each | about 16 held shots per member-round is a large share of a member's fire; friendly hits cost energy but no score |
| **T5 shared gun learning** | each report carries the member's resolved gun samples (situation + guess factor); members add teammates' samples to their own per-enemy kNN, and catch up after a death | link codec v2, team-only reader | five times the data per enemy; the largest structural gap |
| **T6 learned team movement** | record the angle of each enemy bullet that hits or passes any member, share it, and use the kNN angles in place of head-on/linear virtual bullets in the team's risk; treat a shot as aimed at the member nearest the shooter | larger: new log, codec, risk term | Hadur takes 40% more hits than HOFSwarm on the lower half; learned danger is how the top teams survive |
| **T7 small movement rules** | attract toward a disabled enemy; teammates' bullets in flight as a risk term (pairs with `tlane0`) | small | cheap finishes; makes T4's fire-through safe |

Suggested order: T3 and T4 first (each one constant or switch, screens can start now), then T5,
then T6. T7 rides with T4 if `tlane0` wins.

**CPU.** CombatTeam scans its 4,000-sample logs linearly. Hadur's kd-tree keeps lookups cheap, but
T5 multiplies the samples inserted per tick by up to five, so its gate should report skipped
turns beside the score (a 5-member team battle already runs about 75 s on the cloud).

## 5. Method notes

- Decompiled with `java -jar cfr-0.152.jar Combat-3.25.0.jar` in a scratch directory; the source
  is not committed (the author did not include it).
- Class map, for whoever reads it next: `mn.b.b` main loop, `mn.c.*` link messages, `mn.e.c`
  per-enemy state and enemy-wave detection, `mn.e.h` enemy registry and scan interpolation,
  `mn.e.m` radar, `mn.d.d` movement, `mn.d.g` endgame surf, `mn.g.b` gun, `mn.h.c` / `mn.h.e`
  feature vectors and online normalisation.
