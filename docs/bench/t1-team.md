# T1 gate: teammate collisions and friendly fire against 3.7

The T1 build (`hadur2.HadurTeam 3.8`, on the D1-era master base, before D5's shield list)
against the released 3.7, with `hadur-bench/team-gates.txt`: 3 seeds x 8 teams x 10 rounds,
1200 x 1200, `--team true`, the same suite for both. The pairing is by (team, seed), as in
docs/team-plan-t1.md, section 6. The raw reports are [t1-team-38.md](t1-team-38.md) and
[t1-team-37.md](t1-team-37.md).

**Verdict: merged on score share and collisions; the friendly-fire bar is missed and recorded
as follow-up.**

| Gate (docs/team-plan-t1.md, section 6) | 3.7 | 3.8 (T1) | Result |
|---|---|---|---|
| Teammate collisions (`T` sum), down 90% or more | 101,322 | 65 | **Pass**, down 99.9% |
| Our bullets on a teammate (engine count), down 80% or more | 1,015 | 328 | **Misses**: down 68%, the bar was 177 or fewer |
| Score share, mean paired difference not below -2.0, no team worse | 28.8% | 48.2% | **Pass**, +19.4 points, every team up |
| Faults, LINK rejects, count below truth, stray shelf files | 0 | 0 | Pass, all zero |
| Skipped turns at most 2x 3.7's | 43 | 82 | Pass (limit 86) |
| Shots held for the lane, reported | 5,188 | 19,286 | 3.7x, above the plan's flag of about 3x |

## Score share, by team

| Opponent team | 3.7 | 3.8 | Difference |
|---|---|---|---|
| sampleteam.MyFirstTeam | 76.4% | 93.7% | +17.3 |
| abc.ShadowTeam 3.83 | 9.7% | 24.4% | +14.7 |
| rz.AlephTeam 0.34 | 11.0% | 28.6% | +17.6 |
| mn.CombatTeam 3.25.0 | 8.6% | 20.9% | +12.3 |
| lxx.ConceptATeam 0.8 | 75.1% | 83.4% | +8.3 |
| cb.mega.FirestarterTeam 1.14 | 9.9% | 27.7% | +17.8 |
| davidalves.PhoenixTeam 0.54 | 17.4% | 54.9% | +37.5 |
| apvteam.MambaTeam 0.7.5 | 22.5% | 51.8% | +29.3 |
| **All** | 28.8% | 48.2% | **+19.4** |

Rounds won rise from 61 to 100 of 240 and survival from 25.4% to 41.7%. Phoenix goes from 0 to 13 of 30 rounds
and Mamba from 4 to 22.

## What the records say

| Counter (sum over the suite) | 3.7 | 3.8 |
|---|---|---|
| Teammate collisions (`T` field 3, HitRobot naming a teammate) | 101,322 | 65 |
| Our bullets on a teammate (engine's count) | 1,015 | 328 |
| Teammate bullet hits (`T` field 1, a teammate's bullet hit our bullet) | 2,598 | 3,557 |
| Shots held for the fire lane | 5,188 | 19,286 |
| Drives fenced by `TeammateFence` | 0 | 11,762 |
| In-lane shots at fire time | 63 of 33,963 | 31 of 50,979 |

- **Collisions** went from about 422 a round to under 0.3. WORLD-9, MMOVE-6 to MMOVE-8 and
  WEAVE-8 do what the plan set out to do, and the fence acts in the duel's endgame without
  touching the pinned duel packages.
- **Friendly fire misses its bar.** 328 of our bullets still hit a member, down 68% where the
  plan asked for 80%. The in-lane count at fire time is small (31 of 50,979); most of the
  remaining hits are a teammate entering the lane in flight, and members that share a target
  still fire along near-parallel lines. `TURN_SLACK` is 3 px a tick (raised from 1.5 in the
  first smoke test, which cut friendly hits): widening it holds more shots and cuts friendly
  hits, narrowing it does the reverse. Recorded as a follow-up (spacing for a shared target),
  not a blocker: the score share and the collisions pass with room.
- **Bullet on teammate's bullet** rose from 2,598 to 3,557. That is the plan's RC5 (two
  members shooting the same target), out of scope for T1. Members also fired more
  (50,979 shots against 33,963), which accounts for part of the rise.
- **Held shots** rose 3.7x, above the plan's flag of about 3x, so `TURN_SLACK` (3 px a tick;
  wider holds more, narrower holds fewer but lets more friendly hits through) is the first knob
  for the follow-up. The lane check now also requires the bullet and the teammate to coincide
  along the lane in time, which drops the holds for a mate that has crossed and gone before any
  bullet arrives. The extra holds cost shots but the score share rose.
- **Skipped turns** 82 against 43, inside the 2x limit of 86 but close. Faults, LINK rejects, count-below-truth and stray shelf files are
  zero on both sides.

The candidate was benched before D5 merged (T1 on the D1-era base without the shield list);
the merged master adds D5, which acts only in a duel against its list and does not touch the
team link. The T1 rebase onto the D5 master re-pins the kernel, melee and conductor owners
and rewrites the two team telemetry snapshots (the `R` record is longer since D1); the team
order fixtures replay unchanged.

The full reports follow.

## Bench suite: team-gates.txt

### Team bench: team

hadur2.HadurTeam 3.8 against each team in turn, 10 rounds a battle, 1200x1200.

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| sampleteam.MyFirstTeam | 3 | 93.7% | 30/30 | 100.0% | 0 | 6 | 0 | 2/5955 | 0/895 | 0 |
| abc.ShadowTeam 3.83 | 3 | 24.4% | 2/30 | 6.7% | 0 | 17 | 0 | 2/7019 | 0/342 | 0 |
| rz.AlephTeam 0.34 | 3 | 28.6% | 3/30 | 10.0% | 0 | 25 | 0 | 6/6270 | 0/390 | 0 |
| mn.CombatTeam 3.25.0 | 3 | 20.9% | 0/30 | 0.0% | 0 | 0 | 0 | 4/5886 | 0/303 | 0 |
| lxx.ConceptATeam 0.8 | 3 | 83.4% | 30/30 | 100.0% | 0 | 11 | 0 | 3/3794 | 0/821 | 0 |
| cb.mega.FirestarterTeam 1.14 | 3 | 27.7% | 0/30 | 0.0% | 0 | 4 | 0 | 2/6983 | 0/379 | 0 |
| davidalves.PhoenixTeam 0.54 | 3 | 54.9% | 13/30 | 43.3% | 0 | 18 | 0 | 5/8714 | 0/630 | 0 |
| apvteam.MambaTeam 0.7.5 | 3 | 51.8% | 22/30 | 73.3% | 0 | 1 | 0 | 7/6358 | 0/592 | 0 |
| **All** | 24 | 48.2% | 100/240 | 41.7% | 0 | 82 | 0 | 31/50979 | 0/4352 | 0 |

Members' team records (sums): teammate hits 270, teammate bullet hits 3557, teammate collisions 65, shots held for the fire lane 19286, reports merged 3079204, drives fenced 11762.
Engine's count of our bullets that hit one of our own members: 328.

Data files written (any battle): abc/Shadow.data/Shadow.properties, hadur2/Hadur.data/health.hc, lxx/ConceptA.data/ConceptA.properties


## Baseline: team-gates.txt (3.7)

### Team bench: team

hadur2.HadurTeam 3.7 against each team in turn, 10 rounds a battle, 1200x1200.

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| sampleteam.MyFirstTeam | 3 | 76.4% | 28/30 | 93.3% | 0 | 5 | 0 | 10/5831 | 0/659 | 0 |
| abc.ShadowTeam 3.83 | 3 | 9.7% | 0/30 | 0.0% | 0 | 2 | 0 | 6/3869 | 0/196 | 0 |
| rz.AlephTeam 0.34 | 3 | 11.0% | 0/30 | 0.0% | 0 | 2 | 0 | 5/3600 | 0/215 | 0 |
| mn.CombatTeam 3.25.0 | 3 | 8.6% | 0/30 | 0.0% | 0 | 0 | 0 | 9/3682 | 0/178 | 0 |
| lxx.ConceptATeam 0.8 | 3 | 75.1% | 29/30 | 96.7% | 0 | 16 | 0 | 6/4584 | 0/730 | 0 |
| cb.mega.FirestarterTeam 1.14 | 3 | 9.9% | 0/30 | 0.0% | 0 | 6 | 0 | 3/3860 | 0/194 | 0 |
| davidalves.PhoenixTeam 0.54 | 3 | 17.4% | 0/30 | 0.0% | 0 | 11 | 0 | 7/4179 | 0/263 | 0 |
| apvteam.MambaTeam 0.7.5 | 3 | 22.5% | 4/30 | 13.3% | 0 | 1 | 0 | 17/4358 | 0/290 | 0 |
| **All** | 24 | 28.8% | 61/240 | 25.4% | 0 | 43 | 0 | 63/33963 | 0/2725 | 0 |

Members' team records (sums): teammate hits 840, teammate bullet hits 2598, teammate collisions 101322, shots held for the fire lane 5188, reports merged 1504651, drives fenced 0.
Engine's count of our bullets that hit one of our own members: 1015.

Data files written (any battle): abc/Shadow.data/Shadow.properties, hadur2/Hadur.data/health.hc, lxx/ConceptA.data/ConceptA.properties

