# TwinSaor: a Twin Duel team built on Saor

Leigh, 2026-10-27: "I want to now design a twin duel strategy for Saor, TwinSaor is the robot's
name. This gives us 2000 code size to play with so 2x Saor core logic and a small bit of team
logic. Analyse the number 1 attached and see what we can do team logic wise. We will not run a
PC bench until we run a live run later."

Section 1 reads the Twin Duel rules and the live table, section 2 takes apart the leader,
LunarTwins 1.4a, and sections 3 to 6 are TwinSaor itself: what it keeps from Saor, the team
layer, the byte budget and the stages to a live run. Section 8 is what was built for 0.1 and
how it did against LunarTwins on the cloud box.

Leigh, 2026-10-27 15:58 and 15:59 UTC: "Lets design the bench and create a 0.1 team Jar", then
"Run it in the cloud 1:1 vs the top team as a simple comparison".

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
| 512 tables, 75 MB | Down to 128 tables (`& 127`), 19 MB: Twin Duel has about 54 robot names, and two twins plus the enemy pair share one client JVM. Two enemies of one pairing share a table with odds of 1 in 128. Same bytes. |

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
on its partner, is a later tuning question (6, W3).

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
  the main tuning knobs for W3.
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

Stages are W0 to W3 (W for Twin; T is the Team plan's letter).

| Stage | What | Gate |
|---|---|---|
| W0 | New module `twinsaor/`, separate from `saor/` and from Hadur. A pure core (`hadur117.twin.core`) with unit, property and Cucumber tests; the shipped class flattened by hand as Saor's is; an equivalence test that holds them to the same orders; the codesize gate. Saor 0.2 is not touched. | Tests green; codesize ≤ 1,999 |
| W1 | Cloud smoke only: a handful of battles against LunarTwins and two sample teams on the cloud box, to catch exceptions, skipped turns and friendly fire. Not a bench, no PC. | No exceptions; no own-goal kills |
| W2 | Release `twinsaor-v0.1` on its own tag and workflow (as `release-saor.yml`); Leigh adds the line to RoboRumble/Participants/TwinDuel and runs the client's Twin Duel config. | Live first pass, all 26 pairings |
| W3 | Read the live pairings against LunarTwins, LuminariousDuo, NightAndDay and GeminiTeam. Then, and only then, a PC card for R, the kill rule and the spare bytes. | |

### Requirements (TWIN-1 to TWIN-12)

These are also in `docs/requirements.md`.

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| TWIN-1 | Ubiquitous | The team shall be one robot class listed twice in the team file, neither member a Droid. | W0 |
| TWIN-2 | Unwanted | If the codesize tool reports 2,000 bytes or more for the team jar, then the build shall fail. | W0 |
| TWIN-3 | Ubiquitous | The domain core (`hadur117.twin.core`) shall not import or reference `robocode.*`, and the module shall depend on no Hadur or Saor module. | W0 |
| TWIN-4 | Unwanted | If a scanned robot is a teammate, then the twin shall neither target it nor learn from it. | W1 |
| TWIN-5 | Event | When a twin scans an enemy, it shall broadcast the scan, and both twins shall handle it by the same path. | W1 |
| TWIN-6 | Event | When a twin handles two scans of one enemy by one scanner one tick apart, it shall record that transition in its table for that enemy. | W0 |
| TWIN-7 | State | While two enemies live, both twins shall target the enemy with the least energy, switching only when the other is lower by 20 or more. | W0 |
| TWIN-8 | State | While both twins and both enemies live, the leader shall hold its radar on the target and the other twin on the other enemy. | W1 |
| TWIN-9 | State | While both twins live, each shall drive to a station 45 degrees either side of the team's bearing from the target, at 250 px with two enemies and 100 px with one. | W0 |
| TWIN-10 | Event | When the target's energy drops by 0.1 to 3 between scans, a twin on its station shall reverse its leg. | W0 |
| TWIN-11 | Unwanted | If the partner is nearer than the target and within 0.15 rad of the gun heading, then the twin shall not fire. | W0 |
| TWIN-12 | State | While a twin is the last of its team against two enemies, it shall play Saor's corner oscillation on the 800 field. | W0 |

## 7. Open questions for Leigh

- **Live client.** The live run needs a Twin Duel client. Leigh's rumble clients run 1v1,
  melee and team; the Twin Duel config is separate and its battles are few, so TwinSaor's first
  pass may rely on his client alone.
- **Name.** The team is `hadur117.twin.TwinSaor` and the member class `hadur117.twin.SaorTwin`
  (kept apart from the team name). The rumble shows the team name, so the member
  name is free to change.

## 8. TwinSaor 0.1 as built

The module is `twinsaor/` (`mvn -pl twinsaor verify`). The team jar is
`twinsaor/target/hadur117.twin.TwinSaor_0.1.jar`: the team file, `SaorTwin` and its properties,
the core and the source. Robocode lists it as `hadur117.twin.TwinSaor 0.1`.

| Piece | Where |
|---|---|
| The core | `hadur117.twin.core.Gun` (Saor's Markov gun on 800 x 800, aimed from a scan of any age) and `hadur117.twin.core.Team` (kill order, stations, fire hold, power, the last twin's corners). JDK only (TWIN-3). |
| The robot | `hadur117.twin.SaorTwin`, a `TeamRobot`. It calls the core; it is not flattened by hand as Saor is, because the budget is 1,999 bytes, not 749. |
| Tests | `GunTest`, `TeamTest`, `ArchitectureTest` (core purity, no Hadur or Saor), `TwinSaorJarIT` (codesize and packaging, after `package`). |
| Release | `.github/workflows/release-twinsaor.yml`, tags `twinsaor-v<version>`, notes `docs/releases/twinsaor-v<version>.md`. |

**Codesize: 1,989 of 1,999 bytes**, by Robocode's codesize tool on the team jar. The estimate in
section 5 (about 1,185) was far too low: writing it with a core and readable code costs what Saor
saved by flattening by hand. So 0.1 has 10 bytes spare. Room for 0.2 comes from flattening the core into
the robot the way Saor was flattened (Saor went from 914 to 749 that way) or from ProGuard's
peephole pass.

Where 0.1 differs from sections 4 and 5:

- **The last twin keeps the kill order** instead of switching to Saor's nearest-sticky target.
  One rule for every mode is fewer bytes. Its radar is still Saor's: held on the target while the
  gun is cool against two, locked against one.
- **A relayed scan feeds the gun** for up to 4 ticks of age; the playout starts `age` ticks early.
- **Transitions dedupe by time:** a scan no newer than the record is dropped, so when both twins
  lock one enemy, each tick is learned once.
- **A Markov row is a ring:** once full, the newest sample replaces the oldest. Saor keeps
  Figment's overflow quirk; TwinSaor does not.
- **A dead enemy stays dead:** its record's time becomes infinite, so a scan the partner sent
  before the death, arriving after it, cannot revive it as a target.
- **The leg flips** on reaching its end (within 20 px) or on the target's shot, not on distance
  remaining 0, because the station moves with the target every tick.

### Cloud head-to-head against LunarTwins

The cloud box (4 cores, Robocode 1.11.1), `twinduel-lunar.txt`, 20 battles of 35 rounds at
800 x 800, parallel 3, about 2 minutes (report
`docs/bench/local/twinsaor-0.1-vs-lunartwins.md`):

| Build | Score share | Rounds won | Skipped turns |
|---|---|---|---|
| **TwinSaor 0.1 as shipped (1,989 bytes)** | **58.2%** | **582 of 700 (83.1%)** | 5 in 20 battles |
| First build (1,998 bytes: 64 tables, no dead-enemy guard) | 58.4% | 571 of 700 (81.6%) | 12 in 20 battles |

Both ran seeds 100 to 119. The shipped build's battles ran from 52.2% to 63.5%; every one went
TwinSaor's way. One opponent and 20 battles is a comparison, not a
census. A share over 50% means TwinSaor beats the Twin Duel's 1st head to head, which LunarTwins'
96% PWIN says few teams do.

One thing to fix: the engine counted **467 of TwinSaor's bullets hitting its own twin** over the
700 rounds (476 on the first build). The fire hold only looks at a partner nearer than the target. Arm FF in the bench
card tests a wider hold.

TWIN-4 (teammate scans dropped), TWIN-5 (scans shared) and TWIN-8 (split radar) are the robot's
wiring, not the core's, so they are stage W1: the cloud head-to-head exercised them (no own-team
targeting showed, both twins aimed), and a battle-log test that names them is due before W1 closes.

### The bench

Leigh's rule was no PC bench before a live run; 0.1 has had it. Section 9 turns the card into the
per-team screen. As first designed:

- `hadur-bench/twinduel-field.txt`: the 27 teams of the live table, with their archive jars.
- `hadur-bench/twin-arms/arms.txt` and `tools/twin_arms.sh`: each arm is the source with one sed,
  built as `hadur117.twin.TwinSaor 0.1<ARM>` so arms install side by side.
- `tools/twin_read.py` (tested by `test_twin_read.py`): an arm's APS is the mean of its per-team
  shares; it is read against the control team by team, with the paired standard error.
- `plans/pc-twin-w3.queue`: C, an A/A arm, ranges (R2W 300, R2N 180, R1N 60, R1W 160), P180
  (pincer, diagnostic only), KL (enemy leader first), NF (no flip on shot), LEG (100 px leg) and
  FF (wider fire hold). The field is 10 seeds a team, 270 battles an arm, about 1.5 h for all 11
  arms. To pass, an arm needs +0.5 share points over C and more than 2 standard errors.

## 9. Per-opponent mode table (stage W3)

0.1's first live pass (2026-10-27 18:46 UTC) put TwinSaor 7th of 28 at 64.28, 3.72 behind 5th.
The APS is lost in two places (`twinsaor/README.md`): about 1.8 to the four strong teams, which
win by survival (NightAndDay and GeminiTeam 37.8, 11% survival; MarioBros 45.7; LuminariousDuo
49.7), and about 1.5 to weaker teams that tie or beat it (CoyotePair 46.1, InevitableTeam 50.1,
ImpactTwins 52.4, KomariousTeam 53.7, YinYang 54.8, JointStrikeForce 55.5). Each pairing is 1 to
4 battles live, so these are ±5 to 8 each. Leigh, 2026-10-27: "tailor this to a per opponent
basis". Per-opponent tables are the only change that has ever transferred live for Hadur's 1v1,
and the Twin Duel field is small: 27 teams, 54 robots.

### What a mode is

A mode is a setting of the team layer's knobs: station range against two enemies and against one,
the leg, the flip on the target's shot, the kill order and the fire hold. Mode 0 is 0.1 exactly.
The screen measures each knob change on every team; the picks decide which knobs the robot has to
carry, since each one costs bytes.

### How a twin knows the team it faces

The probe (`hadur-bench/twin-arms/names.tsv`) ran one round against every team and logged the
names the engine gives. The table is keyed by name hash, the same way the Markov slots are:

- 0.1's slot, `hashCode & 127`, puts both robots of LunarTwins on slots another team also uses
  (LunarRover with Gemini, LunarLeader with DuoLedByDroid's BlindMan), so it cannot key the table.
- `hashCode >> 5 & 127` gives every one of the 27 teams at least one robot on a slot no other team
  uses. 11 robots share a slot with another team's robot.
- The mode is the OR of the table's entries at the slots of the enemies seen so far this battle:
  `mode |= MODES.charAt(slot)`. A team's unshared slot holds its mode; a shared slot holds the
  AND of the modes of the teams on it, which the OR can never take past any of them. An unknown team reads
  whatever its slots hold, usually 0, which is 0.1.
- The Markov slot moves to the same hash (it changes no behaviour: no pairing has two robots on
  one slot either way). The key costs about 15 bytes: the shift, the string and the OR.

A new name live (a new team, or a version change) reads mode 0 until the table learns it. The
names are taken from the bench engine (Robocode 1.11.1); the live clients run the same naming.

### Bytes

0.1 is 1,989 of 1,999 bytes. The key costs about 15 and each knob 6 to 13 (a bit test, or a
small sum, where 0.1 has a constant). The table therefore carries only the knobs the screen picks,
and the bytes come from flattening the core into the robot by hand, as Saor 0.2 was, for whatever
the picks need beyond the 10 spare. The screen needs no bytes: each arm is a build with one
constant changed.

### The bench

1. **Screen** (`plans/pc-twin-w3.queue`, about 1 h 50 on the PC, Leigh starts it): 11 arms of
   0.1 (C, the A/A arm A, R2W 300, R2X 400, R2N 180, R1N 60, R1W 160, KL, NF, LEG 100, FF) on
   `twinduel-tailor.txt`, the 24 teams less the three sitting-duck teams. 16 seeds a team, 4,224
   battles in all.
2. **Pick** (`tools/twin_pick.py`, tested): for each team, each arm is read against C battle by
   battle on the same seeds. The pick is the best arm with at least +3.0 share points and a low
   end (mean - 2 SE) above zero; no such arm means mode 0. The A/A arm is read the same way, and
   the teams it would have "won" are the rule's false-pick count on that run. The printed gain
   is an upper bound: the best of 10 arms on the same battles is flattered.
3. **Build**: 0.2 carries the picked knobs and the `MODES` string, written from the picks file.
   The whole-field read (`tools/twin_read.py`) still runs, so a knob that wins on every team
   becomes the default instead of a table entry.
4. **Gate**: 0.2 against 0.1 on fresh seeds on the tailored teams. A table entry stays only where
   the fresh read keeps it above zero, and 0.2 ships only if the field's APS rises by at least
   +0.3 (8 share points over 27 teams). The gate is small enough for the cloud box (2 arms x
   24 teams x 16 seeds, about 75 minutes) if the PC is busy.

What it can reach: +3.7 APS needs about 100 share points across the field. If the four strong
teams move from 38-50 to 55 and the near-even ones from 46-55 to 60, the table gives roughly
+3.3. That needs a knob to change how those teams beat TwinSaor, which the screen will show.
If no knob moves the strong four, the next step is a different movement, not a bigger table.

Requirements: TWIN-13 (mode table keyed by name hash, mode 0 is 0.1) and TWIN-14 (a table entry
needs a fresh-seed gate) are stage W3, added when 0.2 is built.

## 10. W3 results and stage W4

W3 ran on the PC as first designed (PR #381): 11 arms on all 27 teams, 10 seeds, 2,970 battles.

| Arm | APS | vs 0.1 | SE |
|---|---|---|---|
| C (0.1) | 64.76 | | |
| A (A/A) | 64.37 | -0.40 | 0.18 |
| **R1W** (range 160 with one enemy left) | **67.84** | **+3.08** | 0.66 |
| R2N | 64.23 | -0.53 | 0.80 |
| FF | 63.96 | -0.81 | 0.43 |
| NF | 62.39 | -2.37 | 2.08 |
| R2W | 62.29 | -2.48 | 0.43 |
| P180 | 62.26 | -2.50 | 1.31 |
| R1N | 61.61 | -3.15 | 0.49 |
| LEG | 60.74 | -4.02 | 0.70 |
| KL | 56.92 | -7.84 | 2.00 |

The A/A arm sat 2.2 SE off the control, so by the reader's rule the run is void. R1W is 7.7 times
that offset and positive on 21 of 27 teams: LuminariousDuo +13.7 (survival 33% to 71%),
CoyotePair +9.2, SurroundingTeam +7.2, KomariousTeam +6.4. 0.1's 100 px with one enemy left
put the last pair at point blank, where the enemy's two-robot fire wins; 160 keeps the twins'
learning gun in play and gives the surviving enemy more to dodge. W4 confirms it on fresh seeds.

Per team, three knobs swing hard in both directions, the case a table exists for:

- NF (no flip on the target's shot): JointStrikeForce +19.7, InevitableTeam +15.0, ShizPair +12.0,
  SelcouthTeam +10.5, NightAndDay +8.3, CoyotePair +7.3; GruwelTwins -23.7, OlympusTwins -21.7,
  TassieDevils -21.1.
- R2N (range 180 with two enemies): CoyotePair +12.9, MarioBros +4.1, NightAndDay +3.6;
  Valkiries -9.7.
- KL (enemy leader first): CoyotePair +9.4, DuoLedByDroid +7.4, TwintelligenceTeam +6.5;
  TassieDevils -30.2, LunarTwins -27.4.

P180 also wins on four teams (+11 to +12) but never ships (the uniqueness rule).

The upper bound of single-knob picks against 0.1 (best arm with +3.0, at 10 seeds) is about
138 share points, +5.1 APS. Most of R1W's gain is inside that, so W4 screens the knobs on top of
R1W, since they may not stack:

- `plans/pc-twin-w4.queue`: C (0.1), W1 (R1W), W1A (A/A), W1NF, W1N2, W1KL on `twinduel-tailor.txt`,
  16 fresh seeds (base 3300), 2,304 battles, about 1 h on the PC.
- Reads: W1 against C on the field (confirmed at +1.0 share points and over 2 SE), and the per-team
  picks against W1 (`tools/twin_pick.py`, W1A as the A/A arm).

0.2 is then R1W as the default plus a mode table of the W4 picks: the NF, R2N and KL bits and the
key cost about 40 bytes against 10 spare, which the flattening in section 9 pays for.
