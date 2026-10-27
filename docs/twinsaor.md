# TwinSaor: a Twin Duel team built on Saor

Leigh, 2026-10-27: "I want to now design a twin duel strategy for Saor, TwinSaor is the robot's
name. This gives us 2000 code size to play with so 2x Saor core logic and a small bit of team
logic. Analyse the number 1 attached and see what we can do team logic wise. We will not run a
PC bench until we run a live run later."

This is the design. Nothing is built yet. Section 1 reads the Twin Duel rules and the live
table, section 2 takes apart the leader, LunarTwins 1.4a, and sections 3 to 6 are TwinSaor
itself: what it keeps from Saor, the team layer, the byte budget and the stages to a live run.

## 1. The rumble

From the RoboWiki page [Twin Duel](https://robowiki.net/wiki/Twin_Duel), read 2026-10-27:

- **Two robots a side, 800 x 800 field.** Saor's field is 1000 x 1000, so its constants move.
- **Code size: under 2000 bytes for the team, measured by the codesize utility on the team's
  jar.** The page says this "can mean two instances of one bot that is under 2000, or two bots
  that total under 2000, including shared code". So **one class run twice may be up to 1,999
  bytes**. TwinSaor does not need to fit two Saor cores side by side: one class holds Saor's
  core once, and both twins run it. That leaves about 1,250 bytes for the team layer and the
  duel play, not "a small bit".
- **No file IO.** The rules are kept on the honour system since the 2009 RoboRumble move.
- **Team rules from the engine** (as Hadur's own team code relies on, `BattleFacts`,
  docs/plan-team-top5.md): the first member listed is the leader and starts with 200 energy,
  a `Droid` starts with 120 and has no radar, any other member with 100. When a leader dies,
  every living teammate loses 30 energy. Messages sent in one tick arrive the next.

The live table ([rumble.robowiki.net, twinduel](https://rumble.robowiki.net/Rankings?game=twinduel),
read 2026-10-27) has 27 teams, 26 pairings each:

| Rank | Team | APS | PWIN | Survival |
|---|---|---|---|---|
| 1 | ags.lunartwins.LunarTwins 1.4a | 70.43 | 96.15 | 79.72 |
| 2 | voidious.twin.LuminariousDuo 1.13 | 69.70 | 88.46 | 80.68 |
| 3 | jk.team.NightAndDay 1.6 | 69.53 | 92.31 | 77.86 |
| 4 | kc.twins.GeminiTeam 2.1 | 68.75 | 92.31 | 77.49 |
| 5 | kawigi.twin.MarioBros 1.0 | 68.54 | 84.62 | 77.64 |
| 6 | wompi.TassieDevils 1.8 | 65.50 | 69.23 | 71.58 |
| 7 | wiki.twin.KomariousTeam 1.0 | 63.73 | 80.77 | 75.05 |

The top five sit within 1.9 APS of each other, and the field is small: each pairing is 1/26 of
the score, so one matchup moved by 10 points moves APS by 0.38. Below 7th the field falls away
fast (8th 59.9, 15th 54.0, 25th 14.3), so a solid team scores well against most of it.

## 2. LunarTwins 1.4a, taken apart

The jar ships its source (`robot.include.source=true`). Seven classes, about 1,940 bytes of
method bytecode by a `javap` count (the codesize utility itself was not run here). Its
description is "Divide, Pin, and Conquer!", and the code does exactly that.

### Roles

| Class | Kind | Energy | Does |
|---|---|---|---|
| `LunarLeader` | `TeamRobot`, listed first | 200 | Owns the only radar. Tracks two enemies, picks the target, computes **both** robots' move goals, and broadcasts the second goal with a copy of the target's state. |
| `LunarRover` | `TeamRobot implements Droid` | 120 | No radar and no decisions. Each tick it sends the leader its own location and drives to the goal the leader last sent, aiming from the leader's copy of the target. |
| `LunarBase` | shared base | | The loop: aim at `getTarget()`, `setFire` every tick, drive to `getGoal()` (reversing when the goal is behind), then `doRadar()`. |

### Target choice: kill the small one first

The leader keeps two slots. A scanned enemy with 150 energy or more, or the one already in that
slot by name, is the enemy leader; anything else is `otherenemy`. While two enemies live, the
target is `otherenemy`: the 100- or 120-energy member, which dies in half the damage. That turns
the round into two against one early. It gives up the other order: killing the enemy leader
first would cost its partner 30 energy as well, which LunarTwins never tries.

### Movement: a closing pincer

Every tick the leader:

1. Takes the team's midpoint (its own position and the rover's last report).
2. Predicts the target one tick ahead.
3. Puts two goals on either side of the target, perpendicular to the midpoint-to-target line,
   at `max(50, distance - 10)`. Each tick the goal is 10 px nearer, so the pair close in on the
   target until they sit 50 px from it, one each side.
4. **Untangles the paths:** swaps the goals if the pair would otherwise cross, then clamps each
   goal to within 90 degrees of its robot's current bearing from the target, so the robots
   circle round the target rather than drive through it.
5. Pulls goals off the walls.

The result is the two robots 180 degrees apart at point-blank range, the target between them.

### Gun and radar

- **Circular targeting** with the turn rate averaged 3:1 over scans, played forward with wall
  clipping until the bullet arrives. No learning of any kind.
- **Power** 3 under 75 px, 2.5 under 400, else 1. Since the pincer closes to 50 px, nearly every
  shot is power 3. `setFire` runs every tick, whether or not the gun has finished turning.
- **Radar:** the leader locks the target with a 5-degree overshoot. The other enemy is seen only
  in passing.

### Why it is first

At 50 px a circular gun hardly misses, and two robots firing power 3 deal about 32 damage a
gun cycle. A 100-energy enemy is gone in a few cycles, then its leader faces two. Most Twin Duel
teams are 1v1 bots in pairs that keep their distance; LunarTwins never lets the fight be at
distance. PWIN 96%: it loses one pairing.

### Where it is weak

1. **The rover is blind when the leader dies.** It has no radar, keeps driving to the last goal
   and fires at the last copy of the target, and loses 30 energy on top.
2. **180 degrees apart means every miss flies at the partner.** Robocode bullets hurt teammates.
   At 50 px the miss rate is low, so it pays, but every miss is an own goal.
3. **It never learns.** Circular aim is enough at 50 px; at range it would not be.
4. **One radar, one target.** The other enemy fires unseen, and the gun starts cold on it when
   the first one dies.
5. **It fires before the gun has turned,** so its first shots after a target switch are wasted.

## 3. What TwinSaor keeps from Saor

| Saor part | In TwinSaor |
|---|---|
| Markov gun, Monte-Carlo playout, graded vote (SAOR-6, SAOR-7) | Kept whole. The field constants become 800: centre 400, wall margin 382.5. |
| Fire only on aim (SAOR-10) | Kept. LunarTwins fires off-aim; this is one place TwinSaor is cleaner for free. |
| Power `log10(E) * 325 / d` | Kept as the base. The cap is re-derived for 2v2 (4.4). |
| Corner oscillation (SAOR-1) | Kept as the **last-twin** movement only (4.5): with the partner dead, two enemies is a small melee, which is Saor's game. |
| Nearest-sticky target (SAOR-3) | Replaced by the team's kill order (4.2). Kept when alone. |
| Radar held while gun cool (SAOR-5) | Replaced by the split radar (4.3). Kept when alone. |
| 512 tables, 75 MB | Down to 64 tables (`& 63`), 9 MB: Twin Duel has about 50 enemy robots, and two twins plus the enemy pair share one client JVM. Same bytes. |

One class, `hadur117.twin.SaorTwin`, listed twice in the team file `hadur117.twin.TwinSaor.team`. The first
listed is the leader by engine rule; **neither is a `Droid`**. LunarTwins' rover gets 20 more
energy for having no radar, and that is exactly what leaves it blind (weakness 1). TwinSaor
spends its second radar on seeing the second enemy instead.

## 4. The team layer

### 4.1 Shared sight: one scan, two tables

Each twin, on each scan of an enemy, packs what it saw into a `double[]`: name hash, absolute
x and y, heading, velocity, energy, the scan's time, the Markov state, and the previous state of
that enemy. It broadcasts the array, then hands it to the same method that handles the partner's
arrays. So both twins run one code path, and both record **the same transition into their own
table**. Statics are per robot (each robot has its own class loader), so this is the only way
for the twins to share; it costs one array and one `broadcastMessage`.

What it buys over LunarTwins and over two Saors side by side:

- Both twins learn from both radars. A twin's gun is warm on an enemy it has never scanned.
- A relayed scan is a tick old when it arrives; the playout simply starts one tick earlier.
- Transitions are only recorded from a scanner's consecutive scans of the same enemy (time
  difference 1), which also fixes Saor's known gap of a false transition on a target switch
  (docs/saor.md, "Known gaps").

### 4.2 Kill order: least energy left

Both twins fire at the same enemy: **the one with the least energy**, sticky until the other
is lower by a margin (start at 20). Both twins compute it from the same shared data, so they
agree without a leader deciding.

At the start this picks the enemy's 100- or 120-energy member over its 200-energy leader, as
LunarTwins does, but by a rule rather than a 150 threshold. It also switches by itself when the
enemy leader is the one being worn down, and it finishes a low enemy even if it is further
away. Whether to prefer the enemy leader when it is close to the line, for the 30-energy penalty
on its partner, is a later tuning question (6, T3).

### 4.3 Split radar

While both enemies live, the **leader** holds its radar on the team target and the **other twin
holds its radar on the other enemy**. Each locks its own enemy every tick, and with 4.1 both
twins hold both enemies, both scanned every tick and both learned. When one enemy dies, both
radars lock the survivor. When a twin dies, the survivor goes back to Saor's own radar (4.5).

### 4.4 Positions: the L, not the pincer

LunarTwins puts its robots 180 degrees apart, so a miss flies at the partner. TwinSaor stands
its twins **90 degrees apart around the target**, like the two walls of a corner: the target is
the corner, and each twin runs one wall.

- The team's midpoint and the target give a base bearing. The leader's station is the base
  bearing + 45 degrees, the other twin's - 45 degrees, at range R from the target. The two lines
  of fire cross at right angles, so a miss leaves the field without passing the partner.
- **On its station each twin oscillates the way Saor does at a corner:** it shuttles along a
  short leg perpendicular to its line to the target, and flips the leg when it arrives (Saor's
  `axis ^= 1`) **or when the target's energy drops by 0.1 to 3 (it fired)**. That is a
  stop-and-go dodge for the price of one energy compare.
- **R by numbers.** Two against two: R starts at 250. Two against one: R closes to 100, and the
  power cap lifts to 3 (the target can no longer hide behind its partner). These two numbers are
  the main tuning knobs for T3.
- Stations are clamped 30 px inside the walls. If the clamp folds both stations onto one wall,
  the leader keeps its station and the other twin takes the far side of the target's bearing.

This is inspired by LunarTwins' idea (two robots, one target, positions from the leader's view
of the team) and is Saor's own in geometry and motion. Leigh's rule for Saor, unique and never a
copy, holds: TwinSaor shares no code with LunarTwins and differs in kill rule, angle, range,
radar and gun.

### 4.5 Modes

| Twins alive | Enemies alive | Movement | Target and radar | Power cap |
|---|---|---|---|---|
| 2 | 2 | L stations at R = 250, leg flip on enemy fire | Least energy; split radar | 2.9 |
| 2 | 1 | L stations at R = 100 | The survivor; both lock | 3 |
| 1 | 2 | Saor's corner oscillation (800 field) | Saor's nearest-sticky and radar | Saor's 1.9 |
| 1 | 1 | One station at R = 250, leg flip on enemy fire | The survivor; lock | 1.9 |

A twin knows its partner is dead from `onRobotDeath` with `isTeammate`. `getOthers()` counts the
partner, so enemies alive is `getOthers()` less one while the partner lives.

### 4.6 Friendly fire

Scans of the partner are dropped at once (`isTeammate`), so neither twin ever targets the other.
Before firing, a twin holds fire if the partner is nearer than the target and within 0.15 rad
of the gun's heading. The L makes this rare in 2v2; it matters in 2v1 when both close in.

## 5. Byte budget

These are estimates from Saor's 748 bytes and the size of similar idioms; the build gate is the
real count.

| Part | Bytes (est.) |
|---|---|
| Saor's gun: state, record, playout, vote, power, fire gate | 520 |
| Saor's corner oscillation, 800 field (last twin only) | 110 |
| Saor's target and radar (last twin only) | 60 |
| Class, `run`, handlers | 30 |
| Teammate filter and partner-death flag | 25 |
| Shared sight: pack, broadcast, receive into one handler, time check | 110 |
| Kill order | 40 |
| Split radar | 35 |
| L stations, leg oscillation, flip on enemy fire, wall clamp | 170 |
| Mode switch and power cap | 45 |
| Friendly-fire hold | 40 |
| **Total** | **about 1,185** |
| **Spare under 1,999** | **about 800** |

The spare is for what the live run says is missing, not for filling. Candidates in order: a
ram finisher for a lone enemy under 20 energy in 2v1 (ramming is strong in Twin Duel per the
wiki), the 30-energy leader-penalty kill rule (4.2), and 128 playouts (no bytes, CPU only).

## 6. Stages

Leigh's rule: no PC bench until after a live run. So TwinSaor's first numbers come from the
rumble itself, and the bench is a later stage.

| Stage | What | Gate |
|---|---|---|
| T0 | New module `twinsaor/`, separate from `saor/` and from Hadur. A pure core (`hadur117.twin.core`) with unit, property and Cucumber tests; the shipped class flattened by hand as Saor's is; an equivalence test that holds them to the same orders; the codesize gate. Saor 0.2 is not touched. | Tests green; codesize ≤ 1,999 |
| T1 | Cloud smoke only: a handful of battles against LunarTwins and two sample teams on the cloud box, to catch exceptions, skipped turns and friendly fire. Not a bench, no PC. | No exceptions; no own-goal kills |
| T2 | Release `twinsaor-v0.1` on its own tag and workflow (as `release-saor.yml`); Leigh adds the line to RoboRumble/Participants/TwinDuel and runs the client's Twin Duel config. | Live first pass, all 26 pairings |
| T3 | Read the live pairings against LunarTwins, LuminariousDuo, NightAndDay and GeminiTeam. Then, and only then, a PC card for R, the kill rule and the spare bytes. | |

### Requirements (proposed, TWIN-1 to TWIN-12)

These go into `docs/requirements.md` with T0.

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| TWIN-1 | Ubiquitous | The team shall be one robot class listed twice in the team file, neither member a Droid. | T0 |
| TWIN-2 | Unwanted | If the codesize tool reports 2,000 bytes or more for the team jar, then the build shall fail. | T0 |
| TWIN-3 | Ubiquitous | The domain core (`hadur117.twin.core`) shall not import or reference `robocode.*`, and the module shall depend on no Hadur or Saor module. | T0 |
| TWIN-4 | Unwanted | If a scanned robot is a teammate, then the twin shall neither target it nor learn from it. | T0 |
| TWIN-5 | Event | When a twin scans an enemy, it shall broadcast the scan, and both twins shall handle it by the same path. | T0 |
| TWIN-6 | Event | When a twin handles two scans of one enemy by one scanner one tick apart, it shall record that transition in its table for that enemy. | T0 |
| TWIN-7 | State | While two enemies live, both twins shall target the enemy with the least energy, switching only when the other is lower by 20 or more. | T0 |
| TWIN-8 | State | While both twins and both enemies live, the leader shall hold its radar on the target and the other twin on the other enemy. | T0 |
| TWIN-9 | State | While both twins live, each shall drive to a station 45 degrees either side of the team's bearing from the target, at 250 px with two enemies and 100 px with one. | T0 |
| TWIN-10 | Event | When the target's energy drops by 0.1 to 3 between scans, a twin on its station shall reverse its leg. | T0 |
| TWIN-11 | Unwanted | If the partner is nearer than the target and within 0.15 rad of the gun heading, then the twin shall not fire. | T0 |
| TWIN-12 | State | While a twin is the last of its team, it shall play Saor's movement, targeting and radar on the 800 field. | T0 |

## 7. Open questions for Leigh

- **Live client.** The live run needs a Twin Duel client. Leigh's rumble clients run 1v1,
  melee and team; the Twin Duel config is separate and its battles are few, so TwinSaor's first
  pass may rely on his client alone.
- **Name.** The team is `hadur117.twin.TwinSaor` and the member class `hadur117.twin.SaorTwin`
  (kept apart from the team name). The rumble shows the team name, so the member
  name is free to change.
